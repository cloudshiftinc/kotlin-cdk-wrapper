@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.s3.NoncurrentVersionTransition
import software.amazon.awscdk.services.s3.StorageClass

@CdkDslMarker
public class NoncurrentVersionTransitionDsl {
  private val cdkBuilder: NoncurrentVersionTransition.Builder =
      NoncurrentVersionTransition.builder()

  /**
   * @param noncurrentVersionsToRetain Indicates the number of noncurrent version objects to be
   * retained.
   * Can be up to 100 noncurrent versions retained.
   */
  public fun noncurrentVersionsToRetain(noncurrentVersionsToRetain: Number) {
    cdkBuilder.noncurrentVersionsToRetain(noncurrentVersionsToRetain)
  }

  /**
   * @param storageClass The storage class to which you want the object to transition. 
   */
  public fun storageClass(storageClass: StorageClass) {
    cdkBuilder.storageClass(storageClass)
  }

  /**
   * @param transitionAfter Indicates the number of days after creation when objects are
   * transitioned to the specified storage class. 
   */
  public fun transitionAfter(transitionAfter: Duration) {
    cdkBuilder.transitionAfter(transitionAfter)
  }

  public fun build(): NoncurrentVersionTransition = cdkBuilder.build()
}
