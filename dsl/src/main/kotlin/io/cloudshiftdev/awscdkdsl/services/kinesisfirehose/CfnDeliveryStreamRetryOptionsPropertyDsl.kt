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
import kotlin.Number
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * Describes the retry behavior in case Kinesis Data Firehose is unable to deliver data to the
 * specified HTTP endpoint destination, or if it doesn't receive a valid acknowledgment of receipt
 * from the specified HTTP endpoint destination.
 *
 * Kinesis Firehose supports any custom HTTP endpoint or HTTP endpoints owned by supported
 * third-party service providers, including Datadog, MongoDB, and New Relic.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * RetryOptionsProperty retryOptionsProperty = RetryOptionsProperty.builder()
 * .durationInSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-retryoptions.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamRetryOptionsPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.RetryOptionsProperty.Builder =
        CfnDeliveryStream.RetryOptionsProperty.builder()

    /**
     * @param durationInSeconds The total amount of time that Kinesis Data Firehose spends on
     *   retries. This duration starts after the initial attempt to send data to the custom
     *   destination via HTTPS endpoint fails. It doesn't include the periods during which Kinesis
     *   Data Firehose waits for acknowledgment from the specified destination after each attempt.
     */
    public fun durationInSeconds(durationInSeconds: Number) {
        cdkBuilder.durationInSeconds(durationInSeconds)
    }

    public fun build(): CfnDeliveryStream.RetryOptionsProperty = cdkBuilder.build()
}
