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

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.config.CfnDeliveryChannel
import kotlin.String

@CdkDslMarker
public class CfnDeliveryChannelConfigSnapshotDeliveryPropertiesPropertyDsl {
    private val cdkBuilder: CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty.Builder =
        CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty.builder()

    public fun deliveryFrequency(deliveryFrequency: String) {
        cdkBuilder.deliveryFrequency(deliveryFrequency)
    }

    public fun build(): CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty =
        cdkBuilder.build()
}
