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

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream
import kotlin.String

@CdkDslMarker
public class CfnDeliveryStreamHttpEndpointCommonAttributePropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.HttpEndpointCommonAttributeProperty.Builder =
        CfnDeliveryStream.HttpEndpointCommonAttributeProperty.builder()

    public fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
    }

    public fun attributeValue(attributeValue: String) {
        cdkBuilder.attributeValue(attributeValue)
    }

    public fun build(): CfnDeliveryStream.HttpEndpointCommonAttributeProperty = cdkBuilder.build()
}
