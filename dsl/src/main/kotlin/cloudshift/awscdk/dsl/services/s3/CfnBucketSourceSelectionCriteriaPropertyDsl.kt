@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketSourceSelectionCriteriaPropertyDsl {
  private val cdkBuilder: CfnBucket.SourceSelectionCriteriaProperty.Builder =
      CfnBucket.SourceSelectionCriteriaProperty.builder()

  /**
   * @param replicaModifications A filter that you can specify for selection for modifications on
   * replicas.
   */
  public fun replicaModifications(replicaModifications: IResolvable) {
    cdkBuilder.replicaModifications(replicaModifications)
  }

  /**
   * @param replicaModifications A filter that you can specify for selection for modifications on
   * replicas.
   */
  public fun replicaModifications(replicaModifications: CfnBucket.ReplicaModificationsProperty) {
    cdkBuilder.replicaModifications(replicaModifications)
  }

  /**
   * @param sseKmsEncryptedObjects A container for filter information for the selection of Amazon S3
   * objects encrypted with AWS KMS.
   */
  public fun sseKmsEncryptedObjects(sseKmsEncryptedObjects: IResolvable) {
    cdkBuilder.sseKmsEncryptedObjects(sseKmsEncryptedObjects)
  }

  /**
   * @param sseKmsEncryptedObjects A container for filter information for the selection of Amazon S3
   * objects encrypted with AWS KMS.
   */
  public
      fun sseKmsEncryptedObjects(sseKmsEncryptedObjects: CfnBucket.SseKmsEncryptedObjectsProperty) {
    cdkBuilder.sseKmsEncryptedObjects(sseKmsEncryptedObjects)
  }

  public fun build(): CfnBucket.SourceSelectionCriteriaProperty = cdkBuilder.build()
}
