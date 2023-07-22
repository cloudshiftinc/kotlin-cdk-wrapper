@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponent

@CdkDslMarker
public class CfnStudioComponentActiveDirectoryConfigurationPropertyDsl {
  private val cdkBuilder: CfnStudioComponent.ActiveDirectoryConfigurationProperty.Builder =
      CfnStudioComponent.ActiveDirectoryConfigurationProperty.builder()

  private val _computerAttributes: MutableList<Any> = mutableListOf()

  /**
   * @param computerAttributes A collection of custom attributes for an Active Directory computer.
   */
  public fun computerAttributes(vararg computerAttributes: Any) {
    _computerAttributes.addAll(listOf(*computerAttributes))
  }

  /**
   * @param computerAttributes A collection of custom attributes for an Active Directory computer.
   */
  public fun computerAttributes(computerAttributes: Collection<Any>) {
    _computerAttributes.addAll(computerAttributes)
  }

  /**
   * @param computerAttributes A collection of custom attributes for an Active Directory computer.
   */
  public fun computerAttributes(computerAttributes: IResolvable) {
    cdkBuilder.computerAttributes(computerAttributes)
  }

  /**
   * @param directoryId The directory ID of the AWS Directory Service for Microsoft Active Directory
   * to access using this studio component.
   */
  public fun directoryId(directoryId: String) {
    cdkBuilder.directoryId(directoryId)
  }

  /**
   * @param organizationalUnitDistinguishedName The distinguished name (DN) and organizational unit
   * (OU) of an Active Directory computer.
   */
  public fun organizationalUnitDistinguishedName(organizationalUnitDistinguishedName: String) {
    cdkBuilder.organizationalUnitDistinguishedName(organizationalUnitDistinguishedName)
  }

  public fun build(): CfnStudioComponent.ActiveDirectoryConfigurationProperty {
    if(_computerAttributes.isNotEmpty()) cdkBuilder.computerAttributes(_computerAttributes)
    return cdkBuilder.build()
  }
}
