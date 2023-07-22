@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import java.time.Instant
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketTransitionPropertyDsl {
  private val cdkBuilder: CfnBucket.TransitionProperty.Builder =
      CfnBucket.TransitionProperty.builder()

  /**
   * @param storageClass The storage class to which you want the object to transition. 
   */
  public fun storageClass(storageClass: String) {
    cdkBuilder.storageClass(storageClass)
  }

  /**
   * @param transitionDate Indicates when objects are transitioned to the specified storage class.
   * The date value must be in ISO 8601 format. The time is always midnight UTC.
   */
  public fun transitionDate(transitionDate: Instant) {
    cdkBuilder.transitionDate(transitionDate)
  }

  /**
   * @param transitionDate Indicates when objects are transitioned to the specified storage class.
   * The date value must be in ISO 8601 format. The time is always midnight UTC.
   */
  public fun transitionDate(transitionDate: IResolvable) {
    cdkBuilder.transitionDate(transitionDate)
  }

  /**
   * @param transitionInDays Indicates the number of days after creation when objects are
   * transitioned to the specified storage class.
   * The value must be a positive integer.
   */
  public fun transitionInDays(transitionInDays: Number) {
    cdkBuilder.transitionInDays(transitionInDays)
  }

  public fun build(): CfnBucket.TransitionProperty = cdkBuilder.build()
}
