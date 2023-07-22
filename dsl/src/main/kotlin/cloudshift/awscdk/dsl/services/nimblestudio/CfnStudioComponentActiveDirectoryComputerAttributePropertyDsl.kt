@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponent

/**
 * An LDAP attribute of an Active Directory computer account, in the form of a name:value pair.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.nimblestudio.*;
 * ActiveDirectoryComputerAttributeProperty activeDirectoryComputerAttributeProperty =
 * ActiveDirectoryComputerAttributeProperty.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-activedirectorycomputerattribute.html)
 */
@CdkDslMarker
public class CfnStudioComponentActiveDirectoryComputerAttributePropertyDsl {
  private val cdkBuilder: CfnStudioComponent.ActiveDirectoryComputerAttributeProperty.Builder =
      CfnStudioComponent.ActiveDirectoryComputerAttributeProperty.builder()

  /**
   * @param name The name for the LDAP attribute.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param value The value for the LDAP attribute.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnStudioComponent.ActiveDirectoryComputerAttributeProperty =
      cdkBuilder.build()
}
