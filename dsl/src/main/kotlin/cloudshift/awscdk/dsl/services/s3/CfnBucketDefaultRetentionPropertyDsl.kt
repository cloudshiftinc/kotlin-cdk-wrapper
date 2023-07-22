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

  /**
   * @param days The number of days that you want to specify for the default retention period.
   * If Object Lock is turned on, you must specify `Mode` and specify either `Days` or `Years` .
   */
  public fun days(days: Number) {
    cdkBuilder.days(days)
  }

  /**
   * @param mode The default Object Lock retention mode you want to apply to new objects placed in
   * the specified bucket.
   * If Object Lock is turned on, you must specify `Mode` and specify either `Days` or `Years` .
   */
  public fun mode(mode: String) {
    cdkBuilder.mode(mode)
  }

  /**
   * @param years The number of years that you want to specify for the default retention period.
   * If Object Lock is turned on, you must specify `Mode` and specify either `Days` or `Years` .
   */
  public fun years(years: Number) {
    cdkBuilder.years(years)
  }

  public fun build(): CfnBucket.DefaultRetentionProperty = cdkBuilder.build()
}
