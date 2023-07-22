@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponent

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
