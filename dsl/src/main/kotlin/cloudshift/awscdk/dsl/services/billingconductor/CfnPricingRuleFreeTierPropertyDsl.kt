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
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.billingconductor.CfnPricingRule

/**
 * The possible AWS Free Tier configurations.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.billingconductor.*;
 * FreeTierProperty freeTierProperty = FreeTierProperty.builder()
 * .activated(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-pricingrule-freetier.html)
 */
@CdkDslMarker
public class CfnPricingRuleFreeTierPropertyDsl {
    private val cdkBuilder: CfnPricingRule.FreeTierProperty.Builder =
        CfnPricingRule.FreeTierProperty.builder()

    /** @param activated Activate or deactivate AWS Free Tier. */
    public fun activated(activated: Boolean) {
        cdkBuilder.activated(activated)
    }

    /** @param activated Activate or deactivate AWS Free Tier. */
    public fun activated(activated: IResolvable) {
        cdkBuilder.activated(activated)
    }

    public fun build(): CfnPricingRule.FreeTierProperty = cdkBuilder.build()
}
