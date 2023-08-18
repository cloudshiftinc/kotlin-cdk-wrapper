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

package io.cloudshiftdev.awscdkdsl.services.kinesisfirehose

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * Describes the metadata that's delivered to the specified HTTP endpoint destination.
 *
 * Kinesis Firehose supports any custom HTTP endpoint or HTTP endpoints owned by supported
 * third-party service providers, including Datadog, MongoDB, and New Relic.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * HttpEndpointCommonAttributeProperty httpEndpointCommonAttributeProperty =
 * HttpEndpointCommonAttributeProperty.builder()
 * .attributeName("attributeName")
 * .attributeValue("attributeValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointcommonattribute.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamHttpEndpointCommonAttributePropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.HttpEndpointCommonAttributeProperty.Builder =
        CfnDeliveryStream.HttpEndpointCommonAttributeProperty.builder()

    /** @param attributeName The name of the HTTP endpoint common attribute. */
    public fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
    }

    /** @param attributeValue The value of the HTTP endpoint common attribute. */
    public fun attributeValue(attributeValue: String) {
        cdkBuilder.attributeValue(attributeValue)
    }

    public fun build(): CfnDeliveryStream.HttpEndpointCommonAttributeProperty = cdkBuilder.build()
}
