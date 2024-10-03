@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies an ingress authorization rule to add to a Client VPN endpoint.
 *
 * Ingress authorization rules act as firewall rules that grant access to networks. You must
 * configure ingress authorization rules to enable clients to access resources in AWS or on-premises
 * networks.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnClientVpnAuthorizationRule cfnClientVpnAuthorizationRule =
 * CfnClientVpnAuthorizationRule.Builder.create(this, "MyCfnClientVpnAuthorizationRule")
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
public open class CfnClientVpnAuthorizationRule(
  cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRule,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnClientVpnAuthorizationRuleProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRule(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnClientVpnAuthorizationRuleProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnClientVpnAuthorizationRuleProps.Builder.() -> Unit,
  ) : this(scope, id, CfnClientVpnAuthorizationRuleProps(props)
  )

  /**
   * The ID of the group to grant access to, for example, the Active Directory group or identity
   * provider (IdP) group.
   */
  public open fun accessGroupId(): String? = unwrap(this).getAccessGroupId()

  /**
   * The ID of the group to grant access to, for example, the Active Directory group or identity
   * provider (IdP) group.
   */
  public open fun accessGroupId(`value`: String) {
    unwrap(this).setAccessGroupId(`value`)
  }

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Indicates whether to grant access to all clients.
   */
  public open fun authorizeAllGroups(): Any? = unwrap(this).getAuthorizeAllGroups()

  /**
   * Indicates whether to grant access to all clients.
   */
  public open fun authorizeAllGroups(`value`: Boolean) {
    unwrap(this).setAuthorizeAllGroups(`value`)
  }

  /**
   * Indicates whether to grant access to all clients.
   */
  public open fun authorizeAllGroups(`value`: IResolvable) {
    unwrap(this).setAuthorizeAllGroups(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The ID of the Client VPN endpoint.
   */
  public open fun clientVpnEndpointId(): String = unwrap(this).getClientVpnEndpointId()

  /**
   * The ID of the Client VPN endpoint.
   */
  public open fun clientVpnEndpointId(`value`: String) {
    unwrap(this).setClientVpnEndpointId(`value`)
  }

  /**
   * A brief description of the authorization rule.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A brief description of the authorization rule.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The IPv4 address range, in CIDR notation, of the network for which access is being authorized.
   */
  public open fun targetNetworkCidr(): String = unwrap(this).getTargetNetworkCidr()

  /**
   * The IPv4 address range, in CIDR notation, of the network for which access is being authorized.
   */
  public open fun targetNetworkCidr(`value`: String) {
    unwrap(this).setTargetNetworkCidr(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnClientVpnAuthorizationRule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the group to grant access to, for example, the Active Directory group or identity
     * provider (IdP) group.
     *
     * Required if `AuthorizeAllGroups` is `false` or not specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-accessgroupid)
     * @param accessGroupId The ID of the group to grant access to, for example, the Active
     * Directory group or identity provider (IdP) group. 
     */
    public fun accessGroupId(accessGroupId: String)

    /**
     * Indicates whether to grant access to all clients.
     *
     * Specify `true` to grant all clients who successfully establish a VPN connection access to the
     * network. Must be set to `true` if `AccessGroupId` is not specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-authorizeallgroups)
     * @param authorizeAllGroups Indicates whether to grant access to all clients. 
     */
    public fun authorizeAllGroups(authorizeAllGroups: Boolean)

    /**
     * Indicates whether to grant access to all clients.
     *
     * Specify `true` to grant all clients who successfully establish a VPN connection access to the
     * network. Must be set to `true` if `AccessGroupId` is not specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-authorizeallgroups)
     * @param authorizeAllGroups Indicates whether to grant access to all clients. 
     */
    public fun authorizeAllGroups(authorizeAllGroups: IResolvable)

    /**
     * The ID of the Client VPN endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-clientvpnendpointid)
     * @param clientVpnEndpointId The ID of the Client VPN endpoint. 
     */
    public fun clientVpnEndpointId(clientVpnEndpointId: String)

    /**
     * A brief description of the authorization rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-description)
     * @param description A brief description of the authorization rule. 
     */
    public fun description(description: String)

    /**
     * The IPv4 address range, in CIDR notation, of the network for which access is being
     * authorized.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-targetnetworkcidr)
     * @param targetNetworkCidr The IPv4 address range, in CIDR notation, of the network for which
     * access is being authorized. 
     */
    public fun targetNetworkCidr(targetNetworkCidr: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRule.Builder =
        software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRule.Builder.create(scope, id)

    /**
     * The ID of the group to grant access to, for example, the Active Directory group or identity
     * provider (IdP) group.
     *
     * Required if `AuthorizeAllGroups` is `false` or not specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-accessgroupid)
     * @param accessGroupId The ID of the group to grant access to, for example, the Active
     * Directory group or identity provider (IdP) group. 
     */
    override fun accessGroupId(accessGroupId: String) {
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
    override fun authorizeAllGroups(authorizeAllGroups: Boolean) {
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
    override fun authorizeAllGroups(authorizeAllGroups: IResolvable) {
      cdkBuilder.authorizeAllGroups(authorizeAllGroups.let(IResolvable.Companion::unwrap))
    }

    /**
     * The ID of the Client VPN endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-clientvpnendpointid)
     * @param clientVpnEndpointId The ID of the Client VPN endpoint. 
     */
    override fun clientVpnEndpointId(clientVpnEndpointId: String) {
      cdkBuilder.clientVpnEndpointId(clientVpnEndpointId)
    }

    /**
     * A brief description of the authorization rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-description)
     * @param description A brief description of the authorization rule. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The IPv4 address range, in CIDR notation, of the network for which access is being
     * authorized.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-targetnetworkcidr)
     * @param targetNetworkCidr The IPv4 address range, in CIDR notation, of the network for which
     * access is being authorized. 
     */
    override fun targetNetworkCidr(targetNetworkCidr: String) {
      cdkBuilder.targetNetworkCidr(targetNetworkCidr)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRule =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRule.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnClientVpnAuthorizationRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnClientVpnAuthorizationRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRule):
        CfnClientVpnAuthorizationRule = CfnClientVpnAuthorizationRule(cdkObject)

    internal fun unwrap(wrapped: CfnClientVpnAuthorizationRule):
        software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRule = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRule
  }
}
