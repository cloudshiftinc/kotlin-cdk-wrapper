@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.billingconductor

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.billingconductor.CfnBillingGroup
import kotlin.String

@CdkDslMarker
public class CfnBillingGroupComputationPreferencePropertyDsl {
    private val cdkBuilder: CfnBillingGroup.ComputationPreferenceProperty.Builder =
        CfnBillingGroup.ComputationPreferenceProperty.builder()

    public fun pricingPlanArn(pricingPlanArn: String) {
        cdkBuilder.pricingPlanArn(pricingPlanArn)
    }

    public fun build(): CfnBillingGroup.ComputationPreferenceProperty = cdkBuilder.build()
}
