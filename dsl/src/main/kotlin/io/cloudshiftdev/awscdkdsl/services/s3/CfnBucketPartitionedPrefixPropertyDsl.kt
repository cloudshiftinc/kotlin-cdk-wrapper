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

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Amazon S3 keys for log objects are partitioned in the following format:.
 *
 * `[DestinationPrefix][SourceAccountId]/[SourceRegion]/[SourceBucket]/[YYYY]/[MM]/[DD]/[YYYY]-[MM]-[DD]-[hh]-[mm]-[ss]-[UniqueString]`
 *
 * PartitionedPrefix defaults to EventTime delivery when server access logs are delivered.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * PartitionedPrefixProperty partitionedPrefixProperty = PartitionedPrefixProperty.builder()
 * .partitionDateSource("partitionDateSource")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-partitionedprefix.html)
 */
@CdkDslMarker
public class CfnBucketPartitionedPrefixPropertyDsl {
    private val cdkBuilder: CfnBucket.PartitionedPrefixProperty.Builder =
        CfnBucket.PartitionedPrefixProperty.builder()

    /**
     * @param partitionDateSource Specifies the partition date source for the partitioned prefix.
     *   PartitionDateSource can be EventTime or DeliveryTime.
     */
    public fun partitionDateSource(partitionDateSource: String) {
        cdkBuilder.partitionDateSource(partitionDateSource)
    }

    public fun build(): CfnBucket.PartitionedPrefixProperty = cdkBuilder.build()
}
