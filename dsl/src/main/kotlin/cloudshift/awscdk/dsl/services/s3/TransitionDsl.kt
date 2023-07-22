@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import java.time.Instant
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.s3.StorageClass
import software.amazon.awscdk.services.s3.Transition

@CdkDslMarker
public class TransitionDsl {
  private val cdkBuilder: Transition.Builder = Transition.builder()

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

  /**
   * @param transitionDate Indicates when objects are transitioned to the specified storage class.
   * The date value must be in ISO 8601 format. The time is always midnight UTC.
   */
  public fun transitionDate(transitionDate: Instant) {
    cdkBuilder.transitionDate(transitionDate)
  }

  public fun build(): Transition = cdkBuilder.build()
}
