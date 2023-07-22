@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleProps
import software.amazon.awscdk.services.ec2.IClientVpnEndpoint

@CdkDslMarker
public class ClientVpnAuthorizationRulePropsDsl {
  private val cdkBuilder: ClientVpnAuthorizationRuleProps.Builder =
      ClientVpnAuthorizationRuleProps.builder()

  /**
   * @param cidr The IPv4 address range, in CIDR notation, of the network for which access is being
   * authorized. 
   */
  public fun cidr(cidr: String) {
    cdkBuilder.cidr(cidr)
  }

  /**
   * @param clientVpnEndpoint The client VPN endpoint to which to add the rule.
   */
  public fun clientVpnEndpoint(clientVpnEndpoint: IClientVpnEndpoint) {
    cdkBuilder.clientVpnEndpoint(clientVpnEndpoint)
  }

  /**
   * @param description A brief description of the authorization rule.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param groupId The ID of the group to grant access to, for example, the Active Directory group
   * or identity provider (IdP) group.
   */
  public fun groupId(groupId: String) {
    cdkBuilder.groupId(groupId)
  }

  public fun build(): ClientVpnAuthorizationRuleProps = cdkBuilder.build()
}
