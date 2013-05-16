/*
 * Copyright (C) 2012 Trillian AB
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/gpl-2.0.html>.
 */
package org.robovm.compiler.target;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.robovm.compiler.config.Arch;
import org.robovm.compiler.config.OS;
import org.robovm.compiler.util.Executor;

import com.dd.plist.NSArray;
import com.dd.plist.NSDictionary;
import com.dd.plist.NSString;


/**
 * @author niklas
 *
 */
public class IOSSimulatorTarget extends AbstractIOSTarget {

    public IOSSimulatorTarget() {
    }
 
    @Override
    public OS getOS() {
        return OS.ios;
    }

    @Override
    public Arch getArch() {
        return Arch.x86;
    }

    @Override
    public LaunchParameters createLaunchParameters() {
        return new IOSSimulatorLaunchParameters();
    }
    
    @Override
    public boolean canLaunchInPlace() {
        return false;
    }

    @Override
    public List<SDK> getSDKs() {
        return listSDKs();
    }
    
    @Override
    protected void customizeInfoPList(NSDictionary dict) {
        dict.put("CFBundleSupportedPlatforms", new NSArray(new NSString("iPhoneSimulator")));
    }
    
    @Override
    protected Executor createExecutor(LaunchParameters launchParameters)
            throws IOException {

        File dir = getAppDir();
        
        String iosSimPath = new File(config.getHome().getBinDir(), "ios-sim").getAbsolutePath();
        
        List<Object> args = new ArrayList<Object>();
        args.add("launch");
        args.add(dir);
        args.add("--unbuffered");
        if (((IOSSimulatorLaunchParameters) launchParameters).getSdk() != null) {
            args.add("--sdk");
            args.add(((IOSSimulatorLaunchParameters) launchParameters).getSdk());
        }
        args.add("--family");
        args.add(((IOSSimulatorLaunchParameters) launchParameters).getFamily().toString().toLowerCase());
        if (launchParameters.getStdoutFifo() != null) {
            args.add("--stdout");
            args.add(launchParameters.getStdoutFifo());
        }
        if (launchParameters.getStderrFifo() != null) {
            args.add("--stderr");
            args.add(launchParameters.getStderrFifo());
        }
        if (!launchParameters.getArguments().isEmpty()) {
            args.add("--args");
            args.addAll(launchParameters.getArguments());
        }
        
        return super.createExecutor(launchParameters, iosSimPath).args(args);
    }
    
    public static List<SDK> listSDKs() {
        return SDK.listSDKs("iPhoneSimulator");
    }
}
