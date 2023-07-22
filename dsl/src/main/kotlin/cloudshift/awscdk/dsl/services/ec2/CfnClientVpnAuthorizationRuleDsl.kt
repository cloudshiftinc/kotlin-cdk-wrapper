@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRule
import software.constructs.Construct

@CdkDslMarker
public class CfnClientVpnAuthorizationRuleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnClientVpnAuthorizationRule.Builder =
      CfnClientVpnAuthorizationRule.Builder.create(scope, id)

  /**
   * The ID of the group to grant access to, for example, the Active Directory group or identity
   * provider (IdP) group.
   *
   * Required if `AuthorizeAllGroups` is `false` or not specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-accessgroupid)
   * @param accessGroupId The ID of the group to grant access to, for example, the Active Directory
   * group or identity provider (IdP) group. 
   */
  public fun accessGroupId(accessGroupId: String) {
    cdkBuilder.accessGroupId(accessGroupId)
  }

  /**
   * Indicates whether to grant access to all clients.
   *
   * Specify `true` to grant all clients who successfully establish a VPN connection access to the
   * network. Must be set to `true` if `AccessGroupId` is not specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-authorizeallgroups)
   * @param authorizeAllGroups Indicates whether to grant access to all clients. 
   */
  public fun authorizeAllGroups(authorizeAllGroups: Boolean) {
    cdkBuilder.authorizeAllGroups(authorizeAllGroups)
  }

  /**
   * Indicates whether to grant access to all clients.
   *
   * Specify `true` to grant all clients who successfully establish a VPN connection access to the
   * network. Must be set to `true` if `AccessGroupId` is not specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-authorizeallgroups)
   * @param authorizeAllGroups Indicates whether to grant access to all clients. 
   */
  public fun authorizeAllGroups(authorizeAllGroups: IResolvable) {
    cdkBuilder.authorizeAllGroups(authorizeAllGroups)
  }

  /**
   * The ID of the Client VPN endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-clientvpnendpointid)
   * @param clientVpnEndpointId The ID of the Client VPN endpoint. 
   */
  public fun clientVpnEndpointId(clientVpnEndpointId: String) {
    cdkBuilder.clientVpnEndpointId(clientVpnEndpointId)
  }

  /**
   * A brief description of the authorization rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-description)
   * @param description A brief description of the authorization rule. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The IPv4 address range, in CIDR notation, of the network for which access is being authorized.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-targetnetworkcidr)
   * @param targetNetworkCidr The IPv4 address range, in CIDR notation, of the network for which
   * access is being authorized. 
   */
  public fun targetNetworkCidr(targetNetworkCidr: String) {
    cdkBuilder.targetNetworkCidr(targetNetworkCidr)
  }

  public fun build(): CfnClientVpnAuthorizationRule = cdkBuilder.build()
}
