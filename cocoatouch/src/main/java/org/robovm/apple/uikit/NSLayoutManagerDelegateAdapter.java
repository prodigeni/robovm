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
package org.robovm.apple.uikit;

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
import org.robovm.apple.foundation.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSLayoutManagerDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSLayoutManagerDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("layoutManager:shouldGenerateGlyphs:properties:characterIndexes:font:forGlyphRange:")
    public @MachineSizedUInt long shouldGenerateGlyphs(NSLayoutManager layoutManager, ShortPtr glyphs, MachineSizedSIntPtr props, MachineSizedUIntPtr charIndexes, UIFont aFont, @ByVal NSRange glyphRange) { throw new UnsupportedOperationException(); }
    @NotImplemented("layoutManager:lineSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:")
    public @MachineSizedFloat double getLineSpacingAfterGlyph(NSLayoutManager layoutManager, @MachineSizedUInt long glyphIndex, @ByVal CGRect rect) { throw new UnsupportedOperationException(); }
    @NotImplemented("layoutManager:paragraphSpacingBeforeGlyphAtIndex:withProposedLineFragmentRect:")
    public @MachineSizedFloat double getParagraphSpacingBeforeGlyph(NSLayoutManager layoutManager, @MachineSizedUInt long glyphIndex, @ByVal CGRect rect) { throw new UnsupportedOperationException(); }
    @NotImplemented("layoutManager:paragraphSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:")
    public @MachineSizedFloat double getParagraphSpacingAfterGlyph(NSLayoutManager layoutManager, @MachineSizedUInt long glyphIndex, @ByVal CGRect rect) { throw new UnsupportedOperationException(); }
    @NotImplemented("layoutManager:shouldUseAction:forControlCharacterAtIndex:")
    public NSControlCharacterAction shouldUseAction(NSLayoutManager layoutManager, NSControlCharacterAction action, @MachineSizedUInt long charIndex) { throw new UnsupportedOperationException(); }
    @NotImplemented("layoutManager:shouldBreakLineByWordBeforeCharacterAtIndex:")
    public boolean shouldBreakLineByWordBeforeCharacter(NSLayoutManager layoutManager, @MachineSizedUInt long charIndex) { throw new UnsupportedOperationException(); }
    @NotImplemented("layoutManager:shouldBreakLineByHyphenatingBeforeCharacterAtIndex:")
    public boolean shouldBreakLineByHyphenatingBeforeCharacter(NSLayoutManager layoutManager, @MachineSizedUInt long charIndex) { throw new UnsupportedOperationException(); }
    @NotImplemented("layoutManager:boundingBoxForControlGlyphAtIndex:forTextContainer:proposedLineFragment:glyphPosition:characterIndex:")
    public @ByVal CGRect getBoundingBoxForControlGlyph(NSLayoutManager layoutManager, @MachineSizedUInt long glyphIndex, NSTextContainer textContainer, @ByVal CGRect proposedRect, @ByVal CGPoint glyphPosition, @MachineSizedUInt long charIndex) { throw new UnsupportedOperationException(); }
    @NotImplemented("layoutManagerDidInvalidateLayout:")
    public void didInvalidateLayout(NSLayoutManager sender) { throw new UnsupportedOperationException(); }
    @NotImplemented("layoutManager:didCompleteLayoutForTextContainer:atEnd:")
    public void didCompleteLayout(NSLayoutManager layoutManager, NSTextContainer textContainer, boolean layoutFinishedFlag) { throw new UnsupportedOperationException(); }
    @NotImplemented("layoutManager:textContainer:didChangeGeometryFromSize:")
    public void didChangeGeometry(NSLayoutManager layoutManager, NSTextContainer textContainer, @ByVal CGSize oldSize) { throw new UnsupportedOperationException(); }
    /*</methods>*/
}
