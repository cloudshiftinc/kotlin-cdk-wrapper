@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketObjectLockRulePropertyDsl {
  private val cdkBuilder: CfnBucket.ObjectLockRuleProperty.Builder =
      CfnBucket.ObjectLockRuleProperty.builder()

  /**
   * @param defaultRetention The default Object Lock retention mode and period that you want to
   * apply to new objects placed in the specified bucket.
   * If Object Lock is turned on, bucket settings require both `Mode` and a period of either `Days`
   * or `Years` . You cannot specify `Days` and `Years` at the same time. For more information about
   * allowable values for mode and period, see
   * [DefaultRetention](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html)
   * .
   */
  public fun defaultRetention(defaultRetention: IResolvable) {
    cdkBuilder.defaultRetention(defaultRetention)
  }

  /**
   * @param defaultRetention The default Object Lock retention mode and period that you want to
   * apply to new objects placed in the specified bucket.
   * If Object Lock is turned on, bucket settings require both `Mode` and a period of either `Days`
   * or `Years` . You cannot specify `Days` and `Years` at the same time. For more information about
   * allowable values for mode and period, see
   * [DefaultRetention](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html)
   * .
   */
  public fun defaultRetention(defaultRetention: CfnBucket.DefaultRetentionProperty) {
    cdkBuilder.defaultRetention(defaultRetention)
  }

  public fun build(): CfnBucket.ObjectLockRuleProperty = cdkBuilder.build()
}
