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
 * Configures retry behavior in case Firehose is unable to deliver documents to Amazon Redshift.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * RedshiftRetryOptionsProperty redshiftRetryOptionsProperty =
 * RedshiftRetryOptionsProperty.builder()
 * .durationInSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftretryoptions.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamRedshiftRetryOptionsPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.RedshiftRetryOptionsProperty.Builder =
        CfnDeliveryStream.RedshiftRetryOptionsProperty.builder()

    /**
     * @param durationInSeconds The length of time during which Firehose retries delivery after a
     *   failure, starting from the initial request and including the first attempt. The default
     *   value is 3600 seconds (60 minutes). Firehose does not retry if the value of
     *   `DurationInSeconds` is 0 (zero) or if the first delivery attempt takes longer than the
     *   current value.
     */
    public fun durationInSeconds(durationInSeconds: Number) {
        cdkBuilder.durationInSeconds(durationInSeconds)
    }

    public fun build(): CfnDeliveryStream.RedshiftRetryOptionsProperty = cdkBuilder.build()
}
