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

public open class CfnClientVpnAuthorizationRule internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRule,
) : CfnResource(cdkObject), IInspectable {
  public open fun accessGroupId(): String? = unwrap(this).getAccessGroupId()

  public open fun accessGroupId(`value`: String) {
    unwrap(this).setAccessGroupId(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun authorizeAllGroups(): Any? = unwrap(this).getAuthorizeAllGroups()

  public open fun authorizeAllGroups(`value`: Boolean) {
    unwrap(this).setAuthorizeAllGroups(`value`)
  }

  public open fun authorizeAllGroups(`value`: IResolvable) {
    unwrap(this).setAuthorizeAllGroups(`value`.let(IResolvable::unwrap))
  }

  public open fun clientVpnEndpointId(): String = unwrap(this).getClientVpnEndpointId()

  public open fun clientVpnEndpointId(`value`: String) {
    unwrap(this).setClientVpnEndpointId(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun targetNetworkCidr(): String = unwrap(this).getTargetNetworkCidr()

  public open fun targetNetworkCidr(`value`: String) {
    unwrap(this).setTargetNetworkCidr(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun accessGroupId(accessGroupId: String)

    public fun authorizeAllGroups(authorizeAllGroups: Boolean)

    public fun authorizeAllGroups(authorizeAllGroups: IResolvable)

    public fun clientVpnEndpointId(clientVpnEndpointId: String)

    public fun description(description: String)

    public fun targetNetworkCidr(targetNetworkCidr: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRule.Builder =
        software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRule.Builder.create(scope, id)

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
        software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRule = wrapped.cdkObject
  }
}
