@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for a ClientVpnAuthorizationRule.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * ClientVpnEndpoint clientVpnEndpoint;
 * ClientVpnAuthorizationRuleProps clientVpnAuthorizationRuleProps =
 * ClientVpnAuthorizationRuleProps.builder()
 * .cidr("cidr")
 * // the properties below are optional
 * .clientVpnEndpoint(clientVpnEndpoint)
 * .description("description")
 * .groupId("groupId")
 * .build();
 * ```
 */
public interface ClientVpnAuthorizationRuleProps : ClientVpnAuthorizationRuleOptions {
  /**
   * The client VPN endpoint to which to add the rule.
   *
   * Default: clientVpnEndpoint is required
   */
  public fun clientVpnEndpoint(): IClientVpnEndpoint? =
      unwrap(this).getClientVpnEndpoint()?.let(IClientVpnEndpoint::wrap)

  /**
   * A builder for [ClientVpnAuthorizationRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cidr The IPv4 address range, in CIDR notation, of the network for which access is
     * being authorized. 
     */
    public fun cidr(cidr: String)

    /**
     * @param clientVpnEndpoint The client VPN endpoint to which to add the rule.
     */
    public fun clientVpnEndpoint(clientVpnEndpoint: IClientVpnEndpoint)

    /**
     * @param description A brief description of the authorization rule.
     */
    public fun description(description: String)

    /**
     * @param groupId The ID of the group to grant access to, for example, the Active Directory
     * group or identity provider (IdP) group.
     */
    public fun groupId(groupId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleProps.Builder =
        software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleProps.builder()

    /**
     * @param cidr The IPv4 address range, in CIDR notation, of the network for which access is
     * being authorized. 
     */
    override fun cidr(cidr: String) {
      cdkBuilder.cidr(cidr)
    }

    /**
     * @param clientVpnEndpoint The client VPN endpoint to which to add the rule.
     */
    override fun clientVpnEndpoint(clientVpnEndpoint: IClientVpnEndpoint) {
      cdkBuilder.clientVpnEndpoint(clientVpnEndpoint.let(IClientVpnEndpoint.Companion::unwrap))
    }

    /**
     * @param description A brief description of the authorization rule.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param groupId The ID of the group to grant access to, for example, the Active Directory
     * group or identity provider (IdP) group.
     */
    override fun groupId(groupId: String) {
      cdkBuilder.groupId(groupId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleProps,
  ) : CdkObject(cdkObject),
      ClientVpnAuthorizationRuleProps {
    /**
     * The IPv4 address range, in CIDR notation, of the network for which access is being
     * authorized.
     */
    override fun cidr(): String = unwrap(this).getCidr()

    /**
     * The client VPN endpoint to which to add the rule.
     *
     * Default: clientVpnEndpoint is required
     */
    override fun clientVpnEndpoint(): IClientVpnEndpoint? =
        unwrap(this).getClientVpnEndpoint()?.let(IClientVpnEndpoint::wrap)

    /**
     * A brief description of the authorization rule.
     *
     * Default: - no description
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The ID of the group to grant access to, for example, the Active Directory group or identity
     * provider (IdP) group.
     *
     * Default: - authorize all groups
     */
    override fun groupId(): String? = unwrap(this).getGroupId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ClientVpnAuthorizationRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleProps):
        ClientVpnAuthorizationRuleProps = CdkObjectWrappers.wrap(cdkObject) as?
        ClientVpnAuthorizationRuleProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClientVpnAuthorizationRuleProps):
        software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleProps
  }
}
