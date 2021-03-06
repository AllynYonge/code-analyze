/*
 * Copyright (C) 2008 The Android Open Source Project
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

package android.graphics.cts;

import junit.framework.TestCase;
import android.graphics.MaskFilter;
import dalvik.annotation.TestLevel;
import dalvik.annotation.TestTargetClass;
import dalvik.annotation.TestTargetNew;

@TestTargetClass(MaskFilter.class)
public class MaskFilterTest extends TestCase {

    @TestTargetNew(
        level = TestLevel.COMPLETE,
        method = "MaskFilter",
        args = {}
    )
    public void testConstructor() {
        // new the MaskFilter instance
        new MaskFilter();
    }
}
