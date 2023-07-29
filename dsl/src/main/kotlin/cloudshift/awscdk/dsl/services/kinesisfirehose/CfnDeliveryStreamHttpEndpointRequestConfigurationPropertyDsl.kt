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

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * The configuration of the HTTP endpoint request.
 *
 * Kinesis Firehose supports any custom HTTP endpoint or HTTP endpoints owned by supported
 * third-party service providers, including Datadog, MongoDB, and New Relic.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * HttpEndpointRequestConfigurationProperty httpEndpointRequestConfigurationProperty =
 * HttpEndpointRequestConfigurationProperty.builder()
 * .commonAttributes(List.of(HttpEndpointCommonAttributeProperty.builder()
 * .attributeName("attributeName")
 * .attributeValue("attributeValue")
 * .build()))
 * .contentEncoding("contentEncoding")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointrequestconfiguration.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamHttpEndpointRequestConfigurationPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.HttpEndpointRequestConfigurationProperty.Builder =
        CfnDeliveryStream.HttpEndpointRequestConfigurationProperty.builder()

    private val _commonAttributes: MutableList<Any> = mutableListOf()

    /** @param commonAttributes Describes the metadata sent to the HTTP endpoint destination. */
    public fun commonAttributes(vararg commonAttributes: Any) {
        _commonAttributes.addAll(listOf(*commonAttributes))
    }

    /** @param commonAttributes Describes the metadata sent to the HTTP endpoint destination. */
    public fun commonAttributes(commonAttributes: Collection<Any>) {
        _commonAttributes.addAll(commonAttributes)
    }

    /** @param commonAttributes Describes the metadata sent to the HTTP endpoint destination. */
    public fun commonAttributes(commonAttributes: IResolvable) {
        cdkBuilder.commonAttributes(commonAttributes)
    }

    /**
     * @param contentEncoding Kinesis Data Firehose uses the content encoding to compress the body
     *   of a request before sending the request to the destination. For more information, see
     *   Content-Encoding in MDN Web Docs, the official Mozilla documentation.
     */
    public fun contentEncoding(contentEncoding: String) {
        cdkBuilder.contentEncoding(contentEncoding)
    }

    public fun build(): CfnDeliveryStream.HttpEndpointRequestConfigurationProperty {
        if (_commonAttributes.isNotEmpty()) cdkBuilder.commonAttributes(_commonAttributes)
        return cdkBuilder.build()
    }
}
