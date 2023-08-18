@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnRuleAssertion
import software.amazon.awscdk.ICfnConditionExpression

/**
 * A rule assertion.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * ICfnConditionExpression cfnConditionExpression;
 * CfnRuleAssertion cfnRuleAssertion = CfnRuleAssertion.builder()
 * .assert(cfnConditionExpression)
 * .assertDescription("assertDescription")
 * .build();
 * ```
 */
@CdkDslMarker
public class CfnRuleAssertionDsl {
    private val cdkBuilder: CfnRuleAssertion.Builder = CfnRuleAssertion.builder()

    /** @param assertDescription The assertion description. */
    public fun assertDescription(assertDescription: String) {
        cdkBuilder.assertDescription(assertDescription)
    }

    /** @param assertValue The assertion. */
    public fun assertValue(assertValue: ICfnConditionExpression) {
        cdkBuilder.assertValue(assertValue)
    }

    public fun build(): CfnRuleAssertion = cdkBuilder.build()
}
