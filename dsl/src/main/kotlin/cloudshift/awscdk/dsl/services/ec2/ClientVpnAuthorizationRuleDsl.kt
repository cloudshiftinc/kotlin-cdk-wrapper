@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRule
import software.amazon.awscdk.services.ec2.IClientVpnEndpoint
import software.constructs.Construct

@CdkDslMarker
public class ClientVpnAuthorizationRuleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: ClientVpnAuthorizationRule.Builder =
      ClientVpnAuthorizationRule.Builder.create(scope, id)

  /**
   * The IPv4 address range, in CIDR notation, of the network for which access is being authorized.
   *
   * @param cidr The IPv4 address range, in CIDR notation, of the network for which access is being
   * authorized. 
   */
  public fun cidr(cidr: String) {
    cdkBuilder.cidr(cidr)
  }

  /**
   * The client VPN endpoint to which to add the rule.
   *
   * Default: clientVpnEndpoint is required
   *
   * @param clientVpnEndpoint The client VPN endpoint to which to add the rule. 
   */
  public fun clientVpnEndpoint(clientVpnEndpoint: IClientVpnEndpoint) {
    cdkBuilder.clientVpnEndpoint(clientVpnEndpoint)
  }

  /**
   * A brief description of the authorization rule.
   *
   * Default: - no description
   *
   * @param description A brief description of the authorization rule. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The ID of the group to grant access to, for example, the Active Directory group or identity
   * provider (IdP) group.
   *
   * Default: - authorize all groups
   *
   * @param groupId The ID of the group to grant access to, for example, the Active Directory group
   * or identity provider (IdP) group. 
   */
  public fun groupId(groupId: String) {
    cdkBuilder.groupId(groupId)
  }

  public fun build(): ClientVpnAuthorizationRule = cdkBuilder.build()
}
