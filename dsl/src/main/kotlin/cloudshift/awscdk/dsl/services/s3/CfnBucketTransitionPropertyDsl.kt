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

  public fun storageClass(storageClass: String) {
    cdkBuilder.storageClass(storageClass)
  }

  public fun transitionDate(transitionDate: Instant) {
    cdkBuilder.transitionDate(transitionDate)
  }

  public fun transitionDate(transitionDate: IResolvable) {
    cdkBuilder.transitionDate(transitionDate)
  }

  public fun transitionInDays(transitionInDays: Number) {
    cdkBuilder.transitionInDays(transitionInDays)
  }

  public fun build(): CfnBucket.TransitionProperty = cdkBuilder.build()
}
