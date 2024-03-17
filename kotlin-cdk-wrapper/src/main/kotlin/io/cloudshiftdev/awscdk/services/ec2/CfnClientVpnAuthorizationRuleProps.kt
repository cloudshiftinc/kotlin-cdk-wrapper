@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnClientVpnAuthorizationRule`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnClientVpnAuthorizationRuleProps cfnClientVpnAuthorizationRuleProps =
 * CfnClientVpnAuthorizationRuleProps.builder()
 * .clientVpnEndpointId("clientVpnEndpointId")
 * .targetNetworkCidr("targetNetworkCidr")
 * // the properties below are optional
 * .accessGroupId("accessGroupId")
 * .authorizeAllGroups(false)
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html)
 */
public interface CfnClientVpnAuthorizationRuleProps {
  /**
   * The ID of the group to grant access to, for example, the Active Directory group or identity
   * provider (IdP) group.
   *
   * Required if `AuthorizeAllGroups` is `false` or not specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-accessgroupid)
   */
  public fun accessGroupId(): String? = unwrap(this).getAccessGroupId()

  /**
   * Indicates whether to grant access to all clients.
   *
   * Specify `true` to grant all clients who successfully establish a VPN connection access to the
   * network. Must be set to `true` if `AccessGroupId` is not specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-authorizeallgroups)
   */
  public fun authorizeAllGroups(): Any? = unwrap(this).getAuthorizeAllGroups()

  /**
   * The ID of the Client VPN endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-clientvpnendpointid)
   */
  public fun clientVpnEndpointId(): String

  /**
   * A brief description of the authorization rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The IPv4 address range, in CIDR notation, of the network for which access is being authorized.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-targetnetworkcidr)
   */
  public fun targetNetworkCidr(): String

  /**
   * A builder for [CfnClientVpnAuthorizationRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessGroupId The ID of the group to grant access to, for example, the Active
     * Directory group or identity provider (IdP) group.
     * Required if `AuthorizeAllGroups` is `false` or not specified.
     */
    public fun accessGroupId(accessGroupId: String)

    /**
     * @param authorizeAllGroups Indicates whether to grant access to all clients.
     * Specify `true` to grant all clients who successfully establish a VPN connection access to the
     * network. Must be set to `true` if `AccessGroupId` is not specified.
     */
    public fun authorizeAllGroups(authorizeAllGroups: Boolean)

    /**
     * @param authorizeAllGroups Indicates whether to grant access to all clients.
     * Specify `true` to grant all clients who successfully establish a VPN connection access to the
     * network. Must be set to `true` if `AccessGroupId` is not specified.
     */
    public fun authorizeAllGroups(authorizeAllGroups: IResolvable)

    /**
     * @param clientVpnEndpointId The ID of the Client VPN endpoint. 
     */
    public fun clientVpnEndpointId(clientVpnEndpointId: String)

    /**
     * @param description A brief description of the authorization rule.
     */
    public fun description(description: String)

    /**
     * @param targetNetworkCidr The IPv4 address range, in CIDR notation, of the network for which
     * access is being authorized. 
     */
    public fun targetNetworkCidr(targetNetworkCidr: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRuleProps.Builder =
        software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRuleProps.builder()

    /**
     * @param accessGroupId The ID of the group to grant access to, for example, the Active
     * Directory group or identity provider (IdP) group.
     * Required if `AuthorizeAllGroups` is `false` or not specified.
     */
    override fun accessGroupId(accessGroupId: String) {
      cdkBuilder.accessGroupId(accessGroupId)
    }

    /**
     * @param authorizeAllGroups Indicates whether to grant access to all clients.
     * Specify `true` to grant all clients who successfully establish a VPN connection access to the
     * network. Must be set to `true` if `AccessGroupId` is not specified.
     */
    override fun authorizeAllGroups(authorizeAllGroups: Boolean) {
      cdkBuilder.authorizeAllGroups(authorizeAllGroups)
    }

    /**
     * @param authorizeAllGroups Indicates whether to grant access to all clients.
     * Specify `true` to grant all clients who successfully establish a VPN connection access to the
     * network. Must be set to `true` if `AccessGroupId` is not specified.
     */
    override fun authorizeAllGroups(authorizeAllGroups: IResolvable) {
      cdkBuilder.authorizeAllGroups(authorizeAllGroups.let(IResolvable::unwrap))
    }

    /**
     * @param clientVpnEndpointId The ID of the Client VPN endpoint. 
     */
    override fun clientVpnEndpointId(clientVpnEndpointId: String) {
      cdkBuilder.clientVpnEndpointId(clientVpnEndpointId)
    }

    /**
     * @param description A brief description of the authorization rule.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param targetNetworkCidr The IPv4 address range, in CIDR notation, of the network for which
     * access is being authorized. 
     */
    override fun targetNetworkCidr(targetNetworkCidr: String) {
      cdkBuilder.targetNetworkCidr(targetNetworkCidr)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRuleProps,
  ) : CdkObject(cdkObject), CfnClientVpnAuthorizationRuleProps {
    /**
     * The ID of the group to grant access to, for example, the Active Directory group or identity
     * provider (IdP) group.
     *
     * Required if `AuthorizeAllGroups` is `false` or not specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-accessgroupid)
     */
    override fun accessGroupId(): String? = unwrap(this).getAccessGroupId()

    /**
     * Indicates whether to grant access to all clients.
     *
     * Specify `true` to grant all clients who successfully establish a VPN connection access to the
     * network. Must be set to `true` if `AccessGroupId` is not specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-authorizeallgroups)
     */
    override fun authorizeAllGroups(): Any? = unwrap(this).getAuthorizeAllGroups()

    /**
     * The ID of the Client VPN endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-clientvpnendpointid)
     */
    override fun clientVpnEndpointId(): String = unwrap(this).getClientVpnEndpointId()

    /**
     * A brief description of the authorization rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The IPv4 address range, in CIDR notation, of the network for which access is being
     * authorized.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-targetnetworkcidr)
     */
    override fun targetNetworkCidr(): String = unwrap(this).getTargetNetworkCidr()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClientVpnAuthorizationRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRuleProps):
        CfnClientVpnAuthorizationRuleProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnClientVpnAuthorizationRuleProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClientVpnAuthorizationRuleProps):
        software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRuleProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRuleProps
  }
}
