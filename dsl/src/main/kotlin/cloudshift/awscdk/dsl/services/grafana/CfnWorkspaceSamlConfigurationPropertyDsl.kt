@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.grafana

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.grafana.CfnWorkspace

@CdkDslMarker
public class CfnWorkspaceSamlConfigurationPropertyDsl {
  private val cdkBuilder: CfnWorkspace.SamlConfigurationProperty.Builder =
      CfnWorkspace.SamlConfigurationProperty.builder()

  private val _allowedOrganizations: MutableList<String> = mutableListOf()

  /**
   * @param allowedOrganizations Lists which organizations defined in the SAML assertion are allowed
   * to use the Amazon Managed Grafana workspace.
   * If this is empty, all organizations in the assertion attribute have access.
   */
  public fun allowedOrganizations(vararg allowedOrganizations: String) {
    _allowedOrganizations.addAll(listOf(*allowedOrganizations))
  }

  /**
   * @param allowedOrganizations Lists which organizations defined in the SAML assertion are allowed
   * to use the Amazon Managed Grafana workspace.
   * If this is empty, all organizations in the assertion attribute have access.
   */
  public fun allowedOrganizations(allowedOrganizations: Collection<String>) {
    _allowedOrganizations.addAll(allowedOrganizations)
  }

  /**
   * @param assertionAttributes A structure that defines which attributes in the SAML assertion are
   * to be used to define information about the users authenticated by that IdP to use the workspace.
   */
  public fun assertionAttributes(assertionAttributes: IResolvable) {
    cdkBuilder.assertionAttributes(assertionAttributes)
  }

  /**
   * @param assertionAttributes A structure that defines which attributes in the SAML assertion are
   * to be used to define information about the users authenticated by that IdP to use the workspace.
   */
  public fun assertionAttributes(assertionAttributes: CfnWorkspace.AssertionAttributesProperty) {
    cdkBuilder.assertionAttributes(assertionAttributes)
  }

  /**
   * @param idpMetadata A structure containing the identity provider (IdP) metadata used to
   * integrate the identity provider with this workspace. 
   */
  public fun idpMetadata(idpMetadata: IResolvable) {
    cdkBuilder.idpMetadata(idpMetadata)
  }

  /**
   * @param idpMetadata A structure containing the identity provider (IdP) metadata used to
   * integrate the identity provider with this workspace. 
   */
  public fun idpMetadata(idpMetadata: CfnWorkspace.IdpMetadataProperty) {
    cdkBuilder.idpMetadata(idpMetadata)
  }

  /**
   * @param loginValidityDuration How long a sign-on session by a SAML user is valid, before the
   * user has to sign on again.
   */
  public fun loginValidityDuration(loginValidityDuration: Number) {
    cdkBuilder.loginValidityDuration(loginValidityDuration)
  }

  /**
   * @param roleValues A structure containing arrays that map group names in the SAML assertion to
   * the Grafana `Admin` and `Editor` roles in the workspace.
   */
  public fun roleValues(roleValues: IResolvable) {
    cdkBuilder.roleValues(roleValues)
  }

  /**
   * @param roleValues A structure containing arrays that map group names in the SAML assertion to
   * the Grafana `Admin` and `Editor` roles in the workspace.
   */
  public fun roleValues(roleValues: CfnWorkspace.RoleValuesProperty) {
    cdkBuilder.roleValues(roleValues)
  }

  public fun build(): CfnWorkspace.SamlConfigurationProperty {
    if(_allowedOrganizations.isNotEmpty()) cdkBuilder.allowedOrganizations(_allowedOrganizations)
    return cdkBuilder.build()
  }
}
