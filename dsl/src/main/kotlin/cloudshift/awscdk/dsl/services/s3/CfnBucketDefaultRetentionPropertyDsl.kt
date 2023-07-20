@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketDefaultRetentionPropertyDsl {
  private val cdkBuilder: CfnBucket.DefaultRetentionProperty.Builder =
      CfnBucket.DefaultRetentionProperty.builder()

  public fun days(days: Number) {
    cdkBuilder.days(days)
  }

  public fun mode(mode: String) {
    cdkBuilder.mode(mode)
  }

  public fun years(years: Number) {
    cdkBuilder.years(years)
  }

  public fun build(): CfnBucket.DefaultRetentionProperty = cdkBuilder.build()
}
