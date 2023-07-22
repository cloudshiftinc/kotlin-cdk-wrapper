@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketTieringPropertyDsl {
  private val cdkBuilder: CfnBucket.TieringProperty.Builder = CfnBucket.TieringProperty.builder()

  /**
   * @param accessTier S3 Intelligent-Tiering access tier. 
   * See [Storage class for automatically optimizing frequently and infrequently accessed
   * objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html#sc-dynamic-data-access)
   * for a list of access tiers in the S3 Intelligent-Tiering storage class.
   */
  public fun accessTier(accessTier: String) {
    cdkBuilder.accessTier(accessTier)
  }

  /**
   * @param days The number of consecutive days of no access after which an object will be eligible
   * to be transitioned to the corresponding tier. 
   * The minimum number of days specified for Archive Access tier must be at least 90 days and Deep
   * Archive Access tier must be at least 180 days. The maximum can be up to 2 years (730 days).
   */
  public fun days(days: Number) {
    cdkBuilder.days(days)
  }

  public fun build(): CfnBucket.TieringProperty = cdkBuilder.build()
}
