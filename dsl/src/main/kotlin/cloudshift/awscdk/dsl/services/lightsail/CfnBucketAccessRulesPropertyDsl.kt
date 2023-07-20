@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnBucket

@CdkDslMarker
public class CfnBucketAccessRulesPropertyDsl {
  private val cdkBuilder: CfnBucket.AccessRulesProperty.Builder =
      CfnBucket.AccessRulesProperty.builder()

  public fun allowPublicOverrides(allowPublicOverrides: Boolean) {
    cdkBuilder.allowPublicOverrides(allowPublicOverrides)
  }

  public fun allowPublicOverrides(allowPublicOverrides: IResolvable) {
    cdkBuilder.allowPublicOverrides(allowPublicOverrides)
  }

  public fun objectAccess(objectAccess: String) {
    cdkBuilder.objectAccess(objectAccess)
  }

  public fun build(): CfnBucket.AccessRulesProperty = cdkBuilder.build()
}
