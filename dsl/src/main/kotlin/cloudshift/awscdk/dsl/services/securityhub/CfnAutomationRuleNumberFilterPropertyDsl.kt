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

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.securityhub.CfnAutomationRule

/**
 * A number filter for querying findings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.securityhub.*;
 * NumberFilterProperty numberFilterProperty = NumberFilterProperty.builder()
 * .eq(123)
 * .gte(123)
 * .lte(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-numberfilter.html)
 */
@CdkDslMarker
public class CfnAutomationRuleNumberFilterPropertyDsl {
    private val cdkBuilder: CfnAutomationRule.NumberFilterProperty.Builder =
        CfnAutomationRule.NumberFilterProperty.builder()

    /**
     * @param eq The equal-to condition to be applied to a single field when querying for findings.
     */
    public fun eq(eq: Number) {
        cdkBuilder.eq(eq)
    }

    /**
     * @param gte The greater-than-equal condition to be applied to a single field when querying for
     *   findings.
     */
    public fun gte(gte: Number) {
        cdkBuilder.gte(gte)
    }

    /**
     * @param lte The less-than-equal condition to be applied to a single field when querying for
     *   findings.
     */
    public fun lte(lte: Number) {
        cdkBuilder.lte(lte)
    }

    public fun build(): CfnAutomationRule.NumberFilterProperty = cdkBuilder.build()
}
