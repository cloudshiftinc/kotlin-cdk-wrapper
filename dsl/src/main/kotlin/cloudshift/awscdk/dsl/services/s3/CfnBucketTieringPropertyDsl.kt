@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketTieringPropertyDsl {
  private val cdkBuilder: CfnBucket.TieringProperty.Builder = CfnBucket.TieringProperty.builder()

  public fun accessTier(accessTier: String) {
    cdkBuilder.accessTier(accessTier)
  }

  public fun days(days: Number) {
    cdkBuilder.days(days)
  }

  public fun build(): CfnBucket.TieringProperty = cdkBuilder.build()
}
