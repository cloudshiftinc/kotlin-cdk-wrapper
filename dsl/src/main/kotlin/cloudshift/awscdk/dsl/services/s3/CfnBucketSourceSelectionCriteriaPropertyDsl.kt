@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketSourceSelectionCriteriaPropertyDsl {
  private val cdkBuilder: CfnBucket.SourceSelectionCriteriaProperty.Builder =
      CfnBucket.SourceSelectionCriteriaProperty.builder()

  public fun replicaModifications(replicaModifications: IResolvable) {
    cdkBuilder.replicaModifications(replicaModifications)
  }

  public fun replicaModifications(replicaModifications: CfnBucket.ReplicaModificationsProperty) {
    cdkBuilder.replicaModifications(replicaModifications)
  }

  public fun sseKmsEncryptedObjects(sseKmsEncryptedObjects: IResolvable) {
    cdkBuilder.sseKmsEncryptedObjects(sseKmsEncryptedObjects)
  }

  public
      fun sseKmsEncryptedObjects(sseKmsEncryptedObjects: CfnBucket.SseKmsEncryptedObjectsProperty) {
    cdkBuilder.sseKmsEncryptedObjects(sseKmsEncryptedObjects)
  }

  public fun build(): CfnBucket.SourceSelectionCriteriaProperty = cdkBuilder.build()
}
