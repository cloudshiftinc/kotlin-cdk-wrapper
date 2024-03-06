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
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Amazon S3 key format for log objects.
 *
 * Only one format, PartitionedPrefix or SimplePrefix, is allowed.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * Object simplePrefix;
 * TargetObjectKeyFormatProperty targetObjectKeyFormatProperty =
 * TargetObjectKeyFormatProperty.builder()
 * .partitionedPrefix(PartitionedPrefixProperty.builder()
 * .partitionDateSource("partitionDateSource")
 * .build())
 * .simplePrefix(simplePrefix)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-targetobjectkeyformat.html)
 */
@CdkDslMarker
public class CfnBucketTargetObjectKeyFormatPropertyDsl {
    private val cdkBuilder: CfnBucket.TargetObjectKeyFormatProperty.Builder =
        CfnBucket.TargetObjectKeyFormatProperty.builder()

    /** @param partitionedPrefix Partitioned S3 key for log objects. */
    public fun partitionedPrefix(partitionedPrefix: IResolvable) {
        cdkBuilder.partitionedPrefix(partitionedPrefix)
    }

    /** @param partitionedPrefix Partitioned S3 key for log objects. */
    public fun partitionedPrefix(partitionedPrefix: CfnBucket.PartitionedPrefixProperty) {
        cdkBuilder.partitionedPrefix(partitionedPrefix)
    }

    /**
     * @param simplePrefix To use the simple format for S3 keys for log objects. To specify
     *   SimplePrefix format, set SimplePrefix to {}.
     */
    public fun simplePrefix(simplePrefix: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(simplePrefix)
        cdkBuilder.simplePrefix(builder.map)
    }

    /**
     * @param simplePrefix To use the simple format for S3 keys for log objects. To specify
     *   SimplePrefix format, set SimplePrefix to {}.
     */
    public fun simplePrefix(simplePrefix: Any) {
        cdkBuilder.simplePrefix(simplePrefix)
    }

    public fun build(): CfnBucket.TargetObjectKeyFormatProperty = cdkBuilder.build()
}
