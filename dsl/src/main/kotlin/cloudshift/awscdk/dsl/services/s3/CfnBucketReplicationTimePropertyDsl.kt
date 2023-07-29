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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * A container specifying S3 Replication Time Control (S3 RTC) related information, including
 * whether S3 RTC is enabled and the time when all objects and operations on objects must be
 * replicated.
 *
 * Must be specified together with a `Metrics` block.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * ReplicationTimeProperty replicationTimeProperty = ReplicationTimeProperty.builder()
 * .status("status")
 * .time(ReplicationTimeValueProperty.builder()
 * .minutes(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationtime.html)
 */
@CdkDslMarker
public class CfnBucketReplicationTimePropertyDsl {
    private val cdkBuilder: CfnBucket.ReplicationTimeProperty.Builder =
        CfnBucket.ReplicationTimeProperty.builder()

    /** @param status Specifies whether the replication time is enabled. */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /**
     * @param time A container specifying the time by which replication should be complete for all
     *   objects and operations on objects.
     */
    public fun time(time: IResolvable) {
        cdkBuilder.time(time)
    }

    /**
     * @param time A container specifying the time by which replication should be complete for all
     *   objects and operations on objects.
     */
    public fun time(time: CfnBucket.ReplicationTimeValueProperty) {
        cdkBuilder.time(time)
    }

    public fun build(): CfnBucket.ReplicationTimeProperty = cdkBuilder.build()
}
