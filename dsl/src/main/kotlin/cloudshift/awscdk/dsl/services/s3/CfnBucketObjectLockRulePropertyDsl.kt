@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketObjectLockRulePropertyDsl {
  private val cdkBuilder: CfnBucket.ObjectLockRuleProperty.Builder =
      CfnBucket.ObjectLockRuleProperty.builder()

  public fun defaultRetention(defaultRetention: IResolvable) {
    cdkBuilder.defaultRetention(defaultRetention)
  }

  public fun defaultRetention(defaultRetention: CfnBucket.DefaultRetentionProperty) {
    cdkBuilder.defaultRetention(defaultRetention)
  }

  public fun build(): CfnBucket.ObjectLockRuleProperty = cdkBuilder.build()
}
