@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketObjectLockConfigurationPropertyDsl {
  private val cdkBuilder: CfnBucket.ObjectLockConfigurationProperty.Builder =
      CfnBucket.ObjectLockConfigurationProperty.builder()

  public fun objectLockEnabled(objectLockEnabled: String) {
    cdkBuilder.objectLockEnabled(objectLockEnabled)
  }

  public fun rule(rule: IResolvable) {
    cdkBuilder.rule(rule)
  }

  public fun rule(rule: CfnBucket.ObjectLockRuleProperty) {
    cdkBuilder.rule(rule)
  }

  public fun build(): CfnBucket.ObjectLockConfigurationProperty = cdkBuilder.build()
}
