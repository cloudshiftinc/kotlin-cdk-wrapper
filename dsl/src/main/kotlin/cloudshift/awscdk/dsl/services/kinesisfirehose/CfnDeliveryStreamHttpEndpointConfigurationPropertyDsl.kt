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
import kotlin.String
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * Describes the configuration of the HTTP endpoint to which Kinesis Firehose delivers data.
 *
 * Kinesis Firehose supports any custom HTTP endpoint or HTTP endpoints owned by supported
 * third-party service providers, including Datadog, MongoDB, and New Relic.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * HttpEndpointConfigurationProperty httpEndpointConfigurationProperty =
 * HttpEndpointConfigurationProperty.builder()
 * .url("url")
 * // the properties below are optional
 * .accessKey("accessKey")
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointconfiguration.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamHttpEndpointConfigurationPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.HttpEndpointConfigurationProperty.Builder =
        CfnDeliveryStream.HttpEndpointConfigurationProperty.builder()

    /**
     * @param accessKey The access key required for Kinesis Firehose to authenticate with the HTTP
     *   endpoint selected as the destination.
     */
    public fun accessKey(accessKey: String) {
        cdkBuilder.accessKey(accessKey)
    }

    /** @param name The name of the HTTP endpoint selected as the destination. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param url The URL of the HTTP endpoint selected as the destination. */
    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    public fun build(): CfnDeliveryStream.HttpEndpointConfigurationProperty = cdkBuilder.build()
}
