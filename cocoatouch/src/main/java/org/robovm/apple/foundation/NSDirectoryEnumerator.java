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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.security.*;
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSDirectoryEnumerator/*</name>*/ 
    extends /*<extends>*/NSEnumerator/*</extends>*/ <NSObject>
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSDirectoryEnumeratorPtr extends Ptr<NSDirectoryEnumerator, NSDirectoryEnumeratorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSDirectoryEnumerator.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSDirectoryEnumerator() {}
    protected NSDirectoryEnumerator(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "fileAttributes")
    public native NSDictionary<?, ?> fileAttributes();
    @Method(selector = "directoryAttributes")
    public native NSDictionary<?, ?> directoryAttributes();
    @Method(selector = "skipDescendents")
    public native void skipDescendents();
    @Method(selector = "level")
    public native @MachineSizedUInt long level();
    @Method(selector = "skipDescendants")
    public native void skipDescendants();
    /*</methods>*/
}
