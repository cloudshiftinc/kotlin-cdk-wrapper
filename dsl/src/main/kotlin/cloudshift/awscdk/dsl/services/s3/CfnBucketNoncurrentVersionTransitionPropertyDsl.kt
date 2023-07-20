@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketNoncurrentVersionTransitionPropertyDsl {
  private val cdkBuilder: CfnBucket.NoncurrentVersionTransitionProperty.Builder =
      CfnBucket.NoncurrentVersionTransitionProperty.builder()

  public fun newerNoncurrentVersions(newerNoncurrentVersions: Number) {
    cdkBuilder.newerNoncurrentVersions(newerNoncurrentVersions)
  }

  public fun storageClass(storageClass: String) {
    cdkBuilder.storageClass(storageClass)
  }

  public fun transitionInDays(transitionInDays: Number) {
    cdkBuilder.transitionInDays(transitionInDays)
  }

  public fun build(): CfnBucket.NoncurrentVersionTransitionProperty = cdkBuilder.build()
}
