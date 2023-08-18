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

package io.cloudshiftdev.awscdkdsl.services.elasticache

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticache.CfnCacheCluster

/**
 * The configuration details of the Kinesis Data Firehose destination.
 *
 * Note that this field is marked as required but only if Kinesis Data Firehose was chosen as the
 * destination.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticache.*;
 * KinesisFirehoseDestinationDetailsProperty kinesisFirehoseDestinationDetailsProperty =
 * KinesisFirehoseDestinationDetailsProperty.builder()
 * .deliveryStream("deliveryStream")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cachecluster-kinesisfirehosedestinationdetails.html)
 */
@CdkDslMarker
public class CfnCacheClusterKinesisFirehoseDestinationDetailsPropertyDsl {
    private val cdkBuilder: CfnCacheCluster.KinesisFirehoseDestinationDetailsProperty.Builder =
        CfnCacheCluster.KinesisFirehoseDestinationDetailsProperty.builder()

    /** @param deliveryStream The name of the Kinesis Data Firehose delivery stream. */
    public fun deliveryStream(deliveryStream: String) {
        cdkBuilder.deliveryStream(deliveryStream)
    }

    public fun build(): CfnCacheCluster.KinesisFirehoseDestinationDetailsProperty =
        cdkBuilder.build()
}
