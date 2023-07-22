@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appstream.CfnEntitlement

/**
 * An attribute that belongs to an entitlement.
 *
 * Application entitlements work by matching a supported SAML 2.0 attribute name to a value when a
 * user identity federates to an AppStream 2.0 SAML application.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * AttributeProperty attributeProperty = AttributeProperty.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-entitlement-attribute.html)
 */
@CdkDslMarker
public class CfnEntitlementAttributePropertyDsl {
  private val cdkBuilder: CfnEntitlement.AttributeProperty.Builder =
      CfnEntitlement.AttributeProperty.builder()

  /**
   * @param name A supported AWS IAM SAML PrincipalTag attribute that is matched to a value when a
   * user identity federates to an AppStream 2.0 SAML application. 
   * The following are supported values:
   *
   * * roles
   * * department
   * * organization
   * * groups
   * * title
   * * costCenter
   * * userType
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param value A value that is matched to a supported SAML attribute name when a user identity
   * federates to an AppStream 2.0 SAML application. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnEntitlement.AttributeProperty = cdkBuilder.build()
}
