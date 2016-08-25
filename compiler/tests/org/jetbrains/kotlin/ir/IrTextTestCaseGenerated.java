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

package org.jetbrains.kotlin.ir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/ir/irText")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class IrTextTestCaseGenerated extends AbstractIrTextTestCase {
    public void testAllFilesPresentInIrText() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/ir/irText"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("arrayAccess.kt")
    public void testArrayAccess() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/arrayAccess.kt");
        doTest(fileName);
    }

    @TestMetadata("arrayAssignment.kt")
    public void testArrayAssignment() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/arrayAssignment.kt");
        doTest(fileName);
    }

    @TestMetadata("arrayAugmentedAssignment1.kt")
    public void testArrayAugmentedAssignment1() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/arrayAugmentedAssignment1.kt");
        doTest(fileName);
    }

    @TestMetadata("arrayAugmentedAssignment2.kt")
    public void testArrayAugmentedAssignment2() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/arrayAugmentedAssignment2.kt");
        doTest(fileName);
    }

    @TestMetadata("assignments.kt")
    public void testAssignments() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/assignments.kt");
        doTest(fileName);
    }

    @TestMetadata("augmentedAssignment1.kt")
    public void testAugmentedAssignment1() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/augmentedAssignment1.kt");
        doTest(fileName);
    }

    @TestMetadata("augmentedAssignment2.kt")
    public void testAugmentedAssignment2() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/augmentedAssignment2.kt");
        doTest(fileName);
    }

    @TestMetadata("booleanOperators.kt")
    public void testBooleanOperators() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/booleanOperators.kt");
        doTest(fileName);
    }

    @TestMetadata("boxOk.kt")
    public void testBoxOk() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/boxOk.kt");
        doTest(fileName);
    }

    @TestMetadata("breakContinue.kt")
    public void testBreakContinue() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/breakContinue.kt");
        doTest(fileName);
    }

    @TestMetadata("callWithReorderedArguments.kt")
    public void testCallWithReorderedArguments() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/callWithReorderedArguments.kt");
        doTest(fileName);
    }

    @TestMetadata("calls.kt")
    public void testCalls() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/calls.kt");
        doTest(fileName);
    }

    @TestMetadata("chainOfSafeCalls.kt")
    public void testChainOfSafeCalls() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/chainOfSafeCalls.kt");
        doTest(fileName);
    }

    @TestMetadata("conventionComparisons.kt")
    public void testConventionComparisons() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/conventionComparisons.kt");
        doTest(fileName);
    }

    @TestMetadata("destructuring1.kt")
    public void testDestructuring1() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/destructuring1.kt");
        doTest(fileName);
    }

    @TestMetadata("dotQualified.kt")
    public void testDotQualified() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/dotQualified.kt");
        doTest(fileName);
    }

    @TestMetadata("elvis.kt")
    public void testElvis() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/elvis.kt");
        doTest(fileName);
    }

    @TestMetadata("equality.kt")
    public void testEquality() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/equality.kt");
        doTest(fileName);
    }

    @TestMetadata("extensionPropertyGetterCall.kt")
    public void testExtensionPropertyGetterCall() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/extensionPropertyGetterCall.kt");
        doTest(fileName);
    }

    @TestMetadata("for.kt")
    public void testFor() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/for.kt");
        doTest(fileName);
    }

    @TestMetadata("forWithBreakContinue.kt")
    public void testForWithBreakContinue() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/forWithBreakContinue.kt");
        doTest(fileName);
    }

    @TestMetadata("forWithImplicitReceivers.kt")
    public void testForWithImplicitReceivers() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/forWithImplicitReceivers.kt");
        doTest(fileName);
    }

    @TestMetadata("identity.kt")
    public void testIdentity() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/identity.kt");
        doTest(fileName);
    }

    @TestMetadata("ifElseIf.kt")
    public void testIfElseIf() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/ifElseIf.kt");
        doTest(fileName);
    }

    @TestMetadata("implicitCastOnPlatformType.kt")
    public void testImplicitCastOnPlatformType() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/implicitCastOnPlatformType.kt");
        doTest(fileName);
    }

    @TestMetadata("in.kt")
    public void testIn() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/in.kt");
        doTest(fileName);
    }

    @TestMetadata("incrementDecrement.kt")
    public void testIncrementDecrement() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/incrementDecrement.kt");
        doTest(fileName);
    }

    @TestMetadata("literals.kt")
    public void testLiterals() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/literals.kt");
        doTest(fileName);
    }

    @TestMetadata("primitiveComparisons.kt")
    public void testPrimitiveComparisons() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/primitiveComparisons.kt");
        doTest(fileName);
    }

    @TestMetadata("references.kt")
    public void testReferences() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/references.kt");
        doTest(fileName);
    }

    @TestMetadata("safeCallWithIncrementDecrement.kt")
    public void testSafeCallWithIncrementDecrement() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/safeCallWithIncrementDecrement.kt");
        doTest(fileName);
    }

    @TestMetadata("safeCalls.kt")
    public void testSafeCalls() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/safeCalls.kt");
        doTest(fileName);
    }

    @TestMetadata("simpleOperators.kt")
    public void testSimpleOperators() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/simpleOperators.kt");
        doTest(fileName);
    }

    @TestMetadata("simpleUnaryOperators.kt")
    public void testSimpleUnaryOperators() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/simpleUnaryOperators.kt");
        doTest(fileName);
    }

    @TestMetadata("smartCasts.kt")
    public void testSmartCasts() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/smartCasts.kt");
        doTest(fileName);
    }

    @TestMetadata("smartCastsWithDestructuring.kt")
    public void testSmartCastsWithDestructuring() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/smartCastsWithDestructuring.kt");
        doTest(fileName);
    }

    @TestMetadata("smoke.kt")
    public void testSmoke() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/smoke.kt");
        doTest(fileName);
    }

    @TestMetadata("stringComparisons.kt")
    public void testStringComparisons() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/stringComparisons.kt");
        doTest(fileName);
    }

    @TestMetadata("stringPlus.kt")
    public void testStringPlus() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/stringPlus.kt");
        doTest(fileName);
    }

    @TestMetadata("throw.kt")
    public void testThrow() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/throw.kt");
        doTest(fileName);
    }

    @TestMetadata("tryCatch.kt")
    public void testTryCatch() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/tryCatch.kt");
        doTest(fileName);
    }

    @TestMetadata("tryCatchWithImplicitCast.kt")
    public void testTryCatchWithImplicitCast() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/tryCatchWithImplicitCast.kt");
        doTest(fileName);
    }

    @TestMetadata("typeOperators.kt")
    public void testTypeOperators() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/typeOperators.kt");
        doTest(fileName);
    }

    @TestMetadata("values.kt")
    public void testValues() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/values.kt");
        doTest(fileName);
    }

    @TestMetadata("vararg.kt")
    public void testVararg() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/vararg.kt");
        doTest(fileName);
    }

    @TestMetadata("varargWithImplicitCast.kt")
    public void testVarargWithImplicitCast() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/varargWithImplicitCast.kt");
        doTest(fileName);
    }

    @TestMetadata("variableAsFunctionCall.kt")
    public void testVariableAsFunctionCall() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/variableAsFunctionCall.kt");
        doTest(fileName);
    }

    @TestMetadata("when.kt")
    public void testWhen() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/when.kt");
        doTest(fileName);
    }

    @TestMetadata("whileDoWhile.kt")
    public void testWhileDoWhile() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/whileDoWhile.kt");
        doTest(fileName);
    }
}
