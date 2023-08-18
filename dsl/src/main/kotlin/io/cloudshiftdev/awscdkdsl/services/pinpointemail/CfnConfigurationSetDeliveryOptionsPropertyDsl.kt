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

package io.cloudshiftdev.awscdkdsl.services.pinpointemail

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet

/**
 * Used to associate a configuration set with a dedicated IP pool.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpointemail.*;
 * DeliveryOptionsProperty deliveryOptionsProperty = DeliveryOptionsProperty.builder()
 * .sendingPoolName("sendingPoolName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-deliveryoptions.html)
 */
@CdkDslMarker
public class CfnConfigurationSetDeliveryOptionsPropertyDsl {
    private val cdkBuilder: CfnConfigurationSet.DeliveryOptionsProperty.Builder =
        CfnConfigurationSet.DeliveryOptionsProperty.builder()

    /**
     * @param sendingPoolName The name of the dedicated IP pool that you want to associate with the
     *   configuration set.
     */
    public fun sendingPoolName(sendingPoolName: String) {
        cdkBuilder.sendingPoolName(sendingPoolName)
    }

    public fun build(): CfnConfigurationSet.DeliveryOptionsProperty = cdkBuilder.build()
}
