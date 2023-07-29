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
import kotlin.String
import software.amazon.awscdk.services.billingconductor.CfnBillingGroup

/**
 * The preferences and settings that will be used to compute the AWS charges for a billing group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.billingconductor.*;
 * ComputationPreferenceProperty computationPreferenceProperty =
 * ComputationPreferenceProperty.builder()
 * .pricingPlanArn("pricingPlanArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-billinggroup-computationpreference.html)
 */
@CdkDslMarker
public class CfnBillingGroupComputationPreferencePropertyDsl {
    private val cdkBuilder: CfnBillingGroup.ComputationPreferenceProperty.Builder =
        CfnBillingGroup.ComputationPreferenceProperty.builder()

    /**
     * @param pricingPlanArn The Amazon Resource Name (ARN) of the pricing plan used to compute the
     *   AWS charges for a billing group.
     */
    public fun pricingPlanArn(pricingPlanArn: String) {
        cdkBuilder.pricingPlanArn(pricingPlanArn)
    }

    public fun build(): CfnBillingGroup.ComputationPreferenceProperty = cdkBuilder.build()
}
