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

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet
import kotlin.String

@CdkDslMarker
public class CfnConfigurationSetDeliveryOptionsPropertyDsl {
    private val cdkBuilder: CfnConfigurationSet.DeliveryOptionsProperty.Builder =
        CfnConfigurationSet.DeliveryOptionsProperty.builder()

    public fun sendingPoolName(sendingPoolName: String) {
        cdkBuilder.sendingPoolName(sendingPoolName)
    }

    public fun build(): CfnConfigurationSet.DeliveryOptionsProperty = cdkBuilder.build()
}
