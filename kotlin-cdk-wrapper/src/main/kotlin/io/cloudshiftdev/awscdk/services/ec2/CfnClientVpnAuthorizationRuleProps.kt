@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnClientVpnAuthorizationRuleProps {
  public fun accessGroupId(): String? = unwrap(this).getAccessGroupId()

  public fun authorizeAllGroups(): Any? = unwrap(this).getAuthorizeAllGroups()

  public fun clientVpnEndpointId(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun targetNetworkCidr(): String

  @CdkDslMarker
  public interface Builder {
    public fun accessGroupId(accessGroupId: String)

    public fun authorizeAllGroups(authorizeAllGroups: Boolean)

    public fun authorizeAllGroups(authorizeAllGroups: IResolvable)

    public fun clientVpnEndpointId(clientVpnEndpointId: String)

    public fun description(description: String)

    public fun targetNetworkCidr(targetNetworkCidr: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRuleProps.Builder =
        software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRuleProps.builder()

    override fun accessGroupId(accessGroupId: String) {
      cdkBuilder.accessGroupId(accessGroupId)
    }

    override fun authorizeAllGroups(authorizeAllGroups: Boolean) {
      cdkBuilder.authorizeAllGroups(authorizeAllGroups)
    }

    override fun authorizeAllGroups(authorizeAllGroups: IResolvable) {
      cdkBuilder.authorizeAllGroups(authorizeAllGroups.let(IResolvable::unwrap))
    }

    override fun clientVpnEndpointId(clientVpnEndpointId: String) {
      cdkBuilder.clientVpnEndpointId(clientVpnEndpointId)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun targetNetworkCidr(targetNetworkCidr: String) {
      cdkBuilder.targetNetworkCidr(targetNetworkCidr)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRuleProps,
  ) : CdkObject(cdkObject), CfnClientVpnAuthorizationRuleProps {
    override fun accessGroupId(): String? = unwrap(this).getAccessGroupId()

    override fun authorizeAllGroups(): Any? = unwrap(this).getAuthorizeAllGroups()

    override fun clientVpnEndpointId(): String = unwrap(this).getClientVpnEndpointId()

    override fun description(): String? = unwrap(this).getDescription()

    override fun targetNetworkCidr(): String = unwrap(this).getTargetNetworkCidr()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClientVpnAuthorizationRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRuleProps):
        CfnClientVpnAuthorizationRuleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClientVpnAuthorizationRuleProps):
        software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRuleProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRuleProps
  }
}
