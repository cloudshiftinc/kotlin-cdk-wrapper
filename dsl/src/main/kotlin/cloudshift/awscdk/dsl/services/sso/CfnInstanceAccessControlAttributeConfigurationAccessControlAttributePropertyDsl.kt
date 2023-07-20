@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sso

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration

@CdkDslMarker
public class CfnInstanceAccessControlAttributeConfigurationAccessControlAttributePropertyDsl {
  private val cdkBuilder:
      CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeProperty.Builder =
      CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeProperty.builder()

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun `value`(`value`: IResolvable) {
    cdkBuilder.`value`(`value`)
  }

  public
      fun `value`(`value`: CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeValueProperty) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeProperty
      = cdkBuilder.build()
}
