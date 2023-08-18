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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * A container that describes additional filters for identifying the source objects that you want to
 * replicate.
 *
 * You can choose to enable or disable the replication of these objects.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * SourceSelectionCriteriaProperty sourceSelectionCriteriaProperty =
 * SourceSelectionCriteriaProperty.builder()
 * .replicaModifications(ReplicaModificationsProperty.builder()
 * .status("status")
 * .build())
 * .sseKmsEncryptedObjects(SseKmsEncryptedObjectsProperty.builder()
 * .status("status")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-sourceselectioncriteria.html)
 */
@CdkDslMarker
public class CfnBucketSourceSelectionCriteriaPropertyDsl {
    private val cdkBuilder: CfnBucket.SourceSelectionCriteriaProperty.Builder =
        CfnBucket.SourceSelectionCriteriaProperty.builder()

    /**
     * @param replicaModifications A filter that you can specify for selection for modifications on
     *   replicas.
     */
    public fun replicaModifications(replicaModifications: IResolvable) {
        cdkBuilder.replicaModifications(replicaModifications)
    }

    /**
     * @param replicaModifications A filter that you can specify for selection for modifications on
     *   replicas.
     */
    public fun replicaModifications(replicaModifications: CfnBucket.ReplicaModificationsProperty) {
        cdkBuilder.replicaModifications(replicaModifications)
    }

    /**
     * @param sseKmsEncryptedObjects A container for filter information for the selection of Amazon
     *   S3 objects encrypted with AWS KMS.
     */
    public fun sseKmsEncryptedObjects(sseKmsEncryptedObjects: IResolvable) {
        cdkBuilder.sseKmsEncryptedObjects(sseKmsEncryptedObjects)
    }

    /**
     * @param sseKmsEncryptedObjects A container for filter information for the selection of Amazon
     *   S3 objects encrypted with AWS KMS.
     */
    public fun sseKmsEncryptedObjects(
        sseKmsEncryptedObjects: CfnBucket.SseKmsEncryptedObjectsProperty
    ) {
        cdkBuilder.sseKmsEncryptedObjects(sseKmsEncryptedObjects)
    }

    public fun build(): CfnBucket.SourceSelectionCriteriaProperty = cdkBuilder.build()
}
