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
 * A filter that you can specify for selection for modifications on replicas.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * ReplicaModificationsProperty replicaModificationsProperty =
 * ReplicaModificationsProperty.builder()
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicamodifications.html)
 */
@CdkDslMarker
public class CfnBucketReplicaModificationsPropertyDsl {
    private val cdkBuilder: CfnBucket.ReplicaModificationsProperty.Builder =
        CfnBucket.ReplicaModificationsProperty.builder()

    /**
     * @param status Specifies whether Amazon S3 replicates modifications on replicas. *Allowed
     *   values* : `Enabled` | `Disabled`
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnBucket.ReplicaModificationsProperty = cdkBuilder.build()
}
