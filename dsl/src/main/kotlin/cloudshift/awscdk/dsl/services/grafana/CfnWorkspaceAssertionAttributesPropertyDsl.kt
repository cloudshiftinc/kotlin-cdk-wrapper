@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.grafana

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.grafana.CfnWorkspace

@CdkDslMarker
public class CfnWorkspaceAssertionAttributesPropertyDsl {
  private val cdkBuilder: CfnWorkspace.AssertionAttributesProperty.Builder =
      CfnWorkspace.AssertionAttributesProperty.builder()

  /**
   * @param email The name of the attribute within the SAML assertion to use as the email names for
   * SAML users.
   */
  public fun email(email: String) {
    cdkBuilder.email(email)
  }

  /**
   * @param groups The name of the attribute within the SAML assertion to use as the user full
   * "friendly" names for user groups.
   */
  public fun groups(groups: String) {
    cdkBuilder.groups(groups)
  }

  /**
   * @param login The name of the attribute within the SAML assertion to use as the login names for
   * SAML users.
   */
  public fun login(login: String) {
    cdkBuilder.login(login)
  }

  /**
   * @param name The name of the attribute within the SAML assertion to use as the user full
   * "friendly" names for SAML users.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param org The name of the attribute within the SAML assertion to use as the user full
   * "friendly" names for the users' organizations.
   */
  public fun org(org: String) {
    cdkBuilder.org(org)
  }

  /**
   * @param role The name of the attribute within the SAML assertion to use as the user roles.
   */
  public fun role(role: String) {
    cdkBuilder.role(role)
  }

  public fun build(): CfnWorkspace.AssertionAttributesProperty = cdkBuilder.build()
}
