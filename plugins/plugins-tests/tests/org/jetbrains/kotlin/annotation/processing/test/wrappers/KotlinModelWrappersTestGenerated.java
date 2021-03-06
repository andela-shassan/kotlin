/*
 * Copyright 2010-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.annotation.processing.test.wrappers;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/annotation-processing/testData/kotlinWrappers")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class KotlinModelWrappersTestGenerated extends AbstractKotlinModelWrappersTest {
    public void testAllFilesPresentInKotlinWrappers() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/annotation-processing/testData/kotlinWrappers"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("annotations.kt")
    public void testAnnotations() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/annotation-processing/testData/kotlinWrappers/annotations.kt");
        doTest(fileName);
    }

    @TestMetadata("enum.kt")
    public void testEnum() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/annotation-processing/testData/kotlinWrappers/enum.kt");
        doTest(fileName);
    }

    @TestMetadata("metaAnnotations.kt")
    public void testMetaAnnotations() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/annotation-processing/testData/kotlinWrappers/metaAnnotations.kt");
        doTest(fileName);
    }

    @TestMetadata("nestedClasses.kt")
    public void testNestedClasses() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/annotation-processing/testData/kotlinWrappers/nestedClasses.kt");
        doTest(fileName);
    }

    @TestMetadata("repeatableAnnotations.kt")
    public void testRepeatableAnnotations() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/annotation-processing/testData/kotlinWrappers/repeatableAnnotations.kt");
        doTest(fileName);
    }

    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/annotation-processing/testData/kotlinWrappers/simple.kt");
        doTest(fileName);
    }
}
