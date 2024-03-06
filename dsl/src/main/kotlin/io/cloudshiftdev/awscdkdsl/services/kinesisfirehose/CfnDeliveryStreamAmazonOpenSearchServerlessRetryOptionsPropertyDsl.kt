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
 * Configures retry behavior in case Firehose is unable to deliver documents to the Serverless
 * offering for Amazon OpenSearch Service.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * AmazonOpenSearchServerlessRetryOptionsProperty amazonOpenSearchServerlessRetryOptionsProperty =
 * AmazonOpenSearchServerlessRetryOptionsProperty.builder()
 * .durationInSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessretryoptions.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamAmazonOpenSearchServerlessRetryOptionsPropertyDsl {
    private val cdkBuilder:
        CfnDeliveryStream.AmazonOpenSearchServerlessRetryOptionsProperty.Builder =
        CfnDeliveryStream.AmazonOpenSearchServerlessRetryOptionsProperty.builder()

    /**
     * @param durationInSeconds After an initial failure to deliver to the Serverless offering for
     *   Amazon OpenSearch Service, the total amount of time during which Firehose retries delivery
     *   (including the first attempt). After this time has elapsed, the failed documents are
     *   written to Amazon S3. Default value is 300 seconds (5 minutes). A value of 0 (zero) results
     *   in no retries.
     */
    public fun durationInSeconds(durationInSeconds: Number) {
        cdkBuilder.durationInSeconds(durationInSeconds)
    }

    public fun build(): CfnDeliveryStream.AmazonOpenSearchServerlessRetryOptionsProperty =
        cdkBuilder.build()
}
