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

package cloudshift.awscdk.dsl.services.billingconductor

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.billingconductor.CfnPricingRule

/**
 * The set of tiering configurations for the pricing rule.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.billingconductor.*;
 * TieringProperty tieringProperty = TieringProperty.builder()
 * .freeTier(FreeTierProperty.builder()
 * .activated(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-pricingrule-tiering.html)
 */
@CdkDslMarker
public class CfnPricingRuleTieringPropertyDsl {
    private val cdkBuilder: CfnPricingRule.TieringProperty.Builder =
        CfnPricingRule.TieringProperty.builder()

    /** @param freeTier The possible AWS Free Tier configurations. */
    public fun freeTier(freeTier: IResolvable) {
        cdkBuilder.freeTier(freeTier)
    }

    /** @param freeTier The possible AWS Free Tier configurations. */
    public fun freeTier(freeTier: CfnPricingRule.FreeTierProperty) {
        cdkBuilder.freeTier(freeTier)
    }

    public fun build(): CfnPricingRule.TieringProperty = cdkBuilder.build()
}
