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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iot.CfnBillingGroup
import kotlin.String

@CdkDslMarker
public class CfnBillingGroupBillingGroupPropertiesPropertyDsl {
    private val cdkBuilder: CfnBillingGroup.BillingGroupPropertiesProperty.Builder =
        CfnBillingGroup.BillingGroupPropertiesProperty.builder()

    public fun billingGroupDescription(billingGroupDescription: String) {
        cdkBuilder.billingGroupDescription(billingGroupDescription)
    }

    public fun build(): CfnBillingGroup.BillingGroupPropertiesProperty = cdkBuilder.build()
}
