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

  /**
   * @param key The name of the attribute associated with your identities in your identity source. 
   * This is used to map a specified attribute in your identity source with an attribute in IAM
   * Identity Center .
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The value used for mapping a specified attribute to an identity source. 
   */
  public fun `value`(`value`: IResolvable) {
    cdkBuilder.`value`(`value`)
  }

  /**
   * @param value The value used for mapping a specified attribute to an identity source. 
   */
  public
      fun `value`(`value`: CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeValueProperty) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeProperty
      = cdkBuilder.build()
}
