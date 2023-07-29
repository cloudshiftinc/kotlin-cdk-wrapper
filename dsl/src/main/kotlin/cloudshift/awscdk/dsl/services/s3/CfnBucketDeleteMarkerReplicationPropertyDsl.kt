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
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Specifies whether Amazon S3 replicates delete markers.
 *
 * If you specify a `Filter` in your replication configuration, you must also include a
 * `DeleteMarkerReplication` element. If your `Filter` includes a `Tag` element, the
 * `DeleteMarkerReplication` `Status` must be set to Disabled, because Amazon S3 does not support
 * replicating delete markers for tag-based rules. For an example configuration, see
 * [Basic Rule Configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-config-min-rule-config)
 * .
 *
 * For more information about delete marker replication, see
 * [Basic Rule Configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/delete-marker-replication.html)
 * .
 *
 * If you are using an earlier version of the replication configuration, Amazon S3 handles
 * replication of delete markers differently. For more information, see
 * [Backward Compatibility](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-backward-compat-considerations)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * DeleteMarkerReplicationProperty deleteMarkerReplicationProperty =
 * DeleteMarkerReplicationProperty.builder()
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-deletemarkerreplication.html)
 */
@CdkDslMarker
public class CfnBucketDeleteMarkerReplicationPropertyDsl {
    private val cdkBuilder: CfnBucket.DeleteMarkerReplicationProperty.Builder =
        CfnBucket.DeleteMarkerReplicationProperty.builder()

    /** @param status Indicates whether to replicate delete markers. Disabled by default. */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnBucket.DeleteMarkerReplicationProperty = cdkBuilder.build()
}
