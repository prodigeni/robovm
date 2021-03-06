/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.corefoundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Library("CoreFoundation")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CFBundle/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CFBundlePtr extends Ptr<CFBundle, CFBundlePtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CFBundle.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CFBundle() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kCFBundleInfoDictionaryVersionKey", optional=true)
    public static native CFString KeyInfoDictionaryVersion();
    @GlobalValue(symbol="kCFBundleExecutableKey", optional=true)
    public static native CFString KeyExecutable();
    @GlobalValue(symbol="kCFBundleIdentifierKey", optional=true)
    public static native CFString KeyIdentifier();
    @GlobalValue(symbol="kCFBundleVersionKey", optional=true)
    public static native CFString KeyVersion();
    @GlobalValue(symbol="kCFBundleDevelopmentRegionKey", optional=true)
    public static native CFString KeyDevelopmentRegion();
    @GlobalValue(symbol="kCFBundleNameKey", optional=true)
    public static native CFString KeyName();
    @GlobalValue(symbol="kCFBundleLocalizationsKey", optional=true)
    public static native CFString KeyLocalizations();
    
    @Bridge(symbol="CFBundleGetMainBundle", optional=true)
    public static native CFBundle getMainBundle();
    @Bridge(symbol="CFBundleGetBundleWithIdentifier", optional=true)
    public static native CFBundle getBundleWithIdentifier(CFString bundleID);
    @Bridge(symbol="CFBundleGetAllBundles", optional=true)
    public static native CFArray getAllBundles();
    @Bridge(symbol="CFBundleGetTypeID", optional=true)
    public static native @MachineSizedUInt long getClassTypeID();
    @Bridge(symbol="CFBundleCreate", optional=true)
    public static native CFBundle create(CFAllocator allocator, CFURL bundleURL);
    @Bridge(symbol="CFBundleCreateBundlesFromDirectory", optional=true)
    public static native CFArray createBundlesFromDirectory(CFAllocator allocator, CFURL directoryURL, CFString bundleType);
    @Bridge(symbol="CFBundleCopyBundleURL", optional=true)
    public native CFURL copyBundleURL();
    @Bridge(symbol="CFBundleGetValueForInfoDictionaryKey", optional=true)
    public native CFType getValueForInfoDictionaryKey(CFString key);
    @Bridge(symbol="CFBundleGetInfoDictionary", optional=true)
    public native CFDictionary getInfoDictionary();
    @Bridge(symbol="CFBundleGetLocalInfoDictionary", optional=true)
    public native CFDictionary getLocalInfoDictionary();
    @Bridge(symbol="CFBundleGetPackageInfo", optional=true)
    public native void getPackageInfo(IntPtr packageType, IntPtr packageCreator);
    @Bridge(symbol="CFBundleGetIdentifier", optional=true)
    public native CFString getIdentifier();
    @Bridge(symbol="CFBundleGetVersionNumber", optional=true)
    public native int getVersionNumber();
    @Bridge(symbol="CFBundleGetDevelopmentRegion", optional=true)
    public native CFString getDevelopmentRegion();
    @Bridge(symbol="CFBundleCopySupportFilesDirectoryURL", optional=true)
    public native CFURL copySupportFilesDirectoryURL();
    @Bridge(symbol="CFBundleCopyResourcesDirectoryURL", optional=true)
    public native CFURL copyResourcesDirectoryURL();
    @Bridge(symbol="CFBundleCopyPrivateFrameworksURL", optional=true)
    public native CFURL copyPrivateFrameworksURL();
    @Bridge(symbol="CFBundleCopySharedFrameworksURL", optional=true)
    public native CFURL copySharedFrameworksURL();
    @Bridge(symbol="CFBundleCopySharedSupportURL", optional=true)
    public native CFURL copySharedSupportURL();
    @Bridge(symbol="CFBundleCopyBuiltInPlugInsURL", optional=true)
    public native CFURL copyBuiltInPlugInsURL();
    @Bridge(symbol="CFBundleCopyInfoDictionaryInDirectory", optional=true)
    public static native CFDictionary copyInfoDictionaryInDirectory(CFURL bundleURL);
    @Bridge(symbol="CFBundleGetPackageInfoInDirectory", optional=true)
    public static native boolean getPackageInfoInDirectory(CFURL url, IntPtr packageType, IntPtr packageCreator);
    @Bridge(symbol="CFBundleCopyResourceURL", optional=true)
    public native CFURL copyResourceURL(CFString resourceName, CFString resourceType, CFString subDirName);
    @Bridge(symbol="CFBundleCopyResourceURLsOfType", optional=true)
    public native CFArray copyResourceURLsOfType(CFString resourceType, CFString subDirName);
    @Bridge(symbol="CFBundleCopyLocalizedString", optional=true)
    public native CFString copyLocalizedString(CFString key, CFString value, CFString tableName);
    @Bridge(symbol="CFBundleCopyResourceURLInDirectory", optional=true)
    public static native CFURL copyResourceURLInDirectory(CFURL bundleURL, CFString resourceName, CFString resourceType, CFString subDirName);
    @Bridge(symbol="CFBundleCopyResourceURLsOfTypeInDirectory", optional=true)
    public static native CFArray copyResourceURLsOfTypeInDirectory(CFURL bundleURL, CFString resourceType, CFString subDirName);
    @Bridge(symbol="CFBundleCopyBundleLocalizations", optional=true)
    public native CFArray copyBundleLocalizations();
    @Bridge(symbol="CFBundleCopyPreferredLocalizationsFromArray", optional=true)
    public static native CFArray copyPreferredLocalizationsFromArray(CFArray locArray);
    @Bridge(symbol="CFBundleCopyLocalizationsForPreferences", optional=true)
    public static native CFArray copyLocalizationsForPreferences(CFArray locArray, CFArray prefArray);
    @Bridge(symbol="CFBundleCopyResourceURLForLocalization", optional=true)
    public native CFURL copyResourceURLForLocalization(CFString resourceName, CFString resourceType, CFString subDirName, CFString localizationName);
    @Bridge(symbol="CFBundleCopyResourceURLsOfTypeForLocalization", optional=true)
    public native CFArray copyResourceURLsOfTypeForLocalization(CFString resourceType, CFString subDirName, CFString localizationName);
    @Bridge(symbol="CFBundleCopyInfoDictionaryForURL", optional=true)
    public static native CFDictionary copyInfoDictionaryForURL(CFURL url);
    @Bridge(symbol="CFBundleCopyLocalizationsForURL", optional=true)
    public static native CFArray copyLocalizationsForURL(CFURL url);
    @Bridge(symbol="CFBundleCopyExecutableArchitecturesForURL", optional=true)
    public static native CFArray copyExecutableArchitecturesForURL(CFURL url);
    @Bridge(symbol="CFBundleCopyExecutableURL", optional=true)
    public native CFURL copyExecutableURL();
    @Bridge(symbol="CFBundleCopyExecutableArchitectures", optional=true)
    public native CFArray copyExecutableArchitectures();
    @Bridge(symbol="CFBundlePreflightExecutable", optional=true)
    public native boolean preflightExecutable(CFError.CFErrorPtr error);
    @Bridge(symbol="CFBundleLoadExecutableAndReturnError", optional=true)
    public native boolean loadExecutableAndReturnError(CFError.CFErrorPtr error);
    @Bridge(symbol="CFBundleLoadExecutable", optional=true)
    public native boolean loadExecutable();
    @Bridge(symbol="CFBundleIsExecutableLoaded", optional=true)
    public native boolean isExecutableLoaded();
    @Bridge(symbol="CFBundleUnloadExecutable", optional=true)
    public native void unloadExecutable();
    @Bridge(symbol="CFBundleGetFunctionPointerForName", optional=true)
    public native VoidPtr getFunctionPointerForName(CFString functionName);
    @Bridge(symbol="CFBundleGetFunctionPointersForNames", optional=true)
    public native void getFunctionPointersForNames(CFArray functionNames, VoidPtr.VoidPtrPtr ftbl);
    @Bridge(symbol="CFBundleGetDataPointerForName", optional=true)
    public native VoidPtr getDataPointerForName(CFString symbolName);
    @Bridge(symbol="CFBundleGetDataPointersForNames", optional=true)
    public native void getDataPointersForNames(CFArray symbolNames, VoidPtr.VoidPtrPtr stbl);
    @Bridge(symbol="CFBundleCopyAuxiliaryExecutableURL", optional=true)
    public native CFURL copyAuxiliaryExecutableURL(CFString executableName);
    @Bridge(symbol="CFBundleGetPlugIn", optional=true)
    public native CFBundle getPlugIn();
    @Bridge(symbol="CFBundleOpenBundleResourceMap", optional=true)
    public native short openBundleResourceMap();
    @Bridge(symbol="CFBundleOpenBundleResourceFiles", optional=true)
    public native int openBundleResourceFiles(ShortPtr refNum, ShortPtr localizedRefNum);
    @Bridge(symbol="CFBundleCloseBundleResourceMap", optional=true)
    public native void closeBundleResourceMap(short refNum);
    /*</methods>*/
}
