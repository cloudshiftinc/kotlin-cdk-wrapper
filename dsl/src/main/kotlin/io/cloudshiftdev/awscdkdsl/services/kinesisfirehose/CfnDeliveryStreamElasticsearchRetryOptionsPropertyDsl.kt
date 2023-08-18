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
 * The `ElasticsearchRetryOptions` property type configures the retry behavior for when Amazon
 * Kinesis Data Firehose (Kinesis Data Firehose) can't deliver data to Amazon Elasticsearch Service
 * (Amazon ES).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * ElasticsearchRetryOptionsProperty elasticsearchRetryOptionsProperty =
 * ElasticsearchRetryOptionsProperty.builder()
 * .durationInSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchretryoptions.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamElasticsearchRetryOptionsPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.ElasticsearchRetryOptionsProperty.Builder =
        CfnDeliveryStream.ElasticsearchRetryOptionsProperty.builder()

    /**
     * @param durationInSeconds After an initial failure to deliver to Amazon ES, the total amount
     *   of time during which Kinesis Data Firehose re-attempts delivery (including the first
     *   attempt). If Kinesis Data Firehose can't deliver the data within the specified time, it
     *   writes the data to the backup S3 bucket. For valid values, see the `DurationInSeconds`
     *   content for the
     *   [ElasticsearchRetryOptions](https://docs.aws.amazon.com/firehose/latest/APIReference/API_ElasticsearchRetryOptions.html)
     *   data type in the *Amazon Kinesis Data Firehose API Reference* .
     */
    public fun durationInSeconds(durationInSeconds: Number) {
        cdkBuilder.durationInSeconds(durationInSeconds)
    }

    public fun build(): CfnDeliveryStream.ElasticsearchRetryOptionsProperty = cdkBuilder.build()
}
