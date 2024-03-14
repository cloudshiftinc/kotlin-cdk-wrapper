package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVPNConnection internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnection,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrVpnConnectionId(): String = unwrap(this).getAttrVpnConnectionId()

  public open fun customerGatewayId(): String = unwrap(this).getCustomerGatewayId()

  public open fun customerGatewayId(`value`: String) {
    unwrap(this).setCustomerGatewayId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun staticRoutesOnly(): Any? = unwrap(this).getStaticRoutesOnly()

  public open fun staticRoutesOnly(`value`: Boolean) {
    unwrap(this).setStaticRoutesOnly(`value`)
  }

  public open fun staticRoutesOnly(`value`: IResolvable) {
    unwrap(this).setStaticRoutesOnly(`value`.let(IResolvable::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun transitGatewayId(): String? = unwrap(this).getTransitGatewayId()

  public open fun transitGatewayId(`value`: String) {
    unwrap(this).setTransitGatewayId(`value`)
  }

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public open fun vpnGatewayId(): String? = unwrap(this).getVpnGatewayId()

  public open fun vpnGatewayId(`value`: String) {
    unwrap(this).setVpnGatewayId(`value`)
  }

  public open fun vpnTunnelOptionsSpecifications(): Any? =
      unwrap(this).getVpnTunnelOptionsSpecifications()

  public open fun vpnTunnelOptionsSpecifications(`value`: IResolvable) {
    unwrap(this).setVpnTunnelOptionsSpecifications(`value`.let(IResolvable::unwrap))
  }

  public open fun vpnTunnelOptionsSpecifications(__idx_ac66f0: List<Any>) {
    unwrap(this).setVpnTunnelOptionsSpecifications(__idx_ac66f0)
  }

  public interface Builder {
    public fun customerGatewayId(customerGatewayId: String) {
    }

    public fun staticRoutesOnly(staticRoutesOnly: Boolean) {
    }

    public fun staticRoutesOnly(staticRoutesOnly: IResolvable) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun transitGatewayId(transitGatewayId: String) {
    }

    public fun type(type: String) {
    }

    public fun vpnGatewayId(vpnGatewayId: String) {
    }

    public fun vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications: IResolvable) {
    }

    public fun vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications: List<Any>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPNConnection.Builder =
        software.amazon.awscdk.services.ec2.CfnVPNConnection.Builder.create(scope, id)

    public override fun customerGatewayId(customerGatewayId: String) {
      cdkBuilder.customerGatewayId(customerGatewayId)
    }

    public override fun staticRoutesOnly(staticRoutesOnly: Boolean) {
      cdkBuilder.staticRoutesOnly(staticRoutesOnly)
    }

    public override fun staticRoutesOnly(staticRoutesOnly: IResolvable) {
      cdkBuilder.staticRoutesOnly(staticRoutesOnly.let(IResolvable::unwrap))
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun transitGatewayId(transitGatewayId: String) {
      cdkBuilder.transitGatewayId(transitGatewayId)
    }

    public override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public override fun vpnGatewayId(vpnGatewayId: String) {
      cdkBuilder.vpnGatewayId(vpnGatewayId)
    }

    public override
        fun vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications: IResolvable) {
      cdkBuilder.vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications.let(IResolvable::unwrap))
    }

    public override fun vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications: List<Any>) {
      cdkBuilder.vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPNConnection = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPNConnection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPNConnection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnection):
        CfnVPNConnection = CfnVPNConnection(cdkObject)

    internal fun unwrap(wrapped: CfnVPNConnection):
        software.amazon.awscdk.services.ec2.CfnVPNConnection = wrapped.cdkObject
  }

  public interface VpnTunnelOptionsSpecificationProperty {
    public fun preSharedKey(): String? = unwrap(this).getPreSharedKey()

    public fun tunnelInsideCidr(): String? = unwrap(this).getTunnelInsideCidr()

    public interface Builder {
      public fun preSharedKey(preSharedKey: String) {
      }

      public fun tunnelInsideCidr(tunnelInsideCidr: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelOptionsSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelOptionsSpecificationProperty.builder()

      public override fun preSharedKey(preSharedKey: String) {
        cdkBuilder.preSharedKey(preSharedKey)
      }

      public override fun tunnelInsideCidr(tunnelInsideCidr: String) {
        cdkBuilder.tunnelInsideCidr(tunnelInsideCidr)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelOptionsSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelOptionsSpecificationProperty,
    ) : VpnTunnelOptionsSpecificationProperty {
      public override fun preSharedKey(): String? = unwrap(this).getPreSharedKey()

      public override fun tunnelInsideCidr(): String? = unwrap(this).getTunnelInsideCidr()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VpnTunnelOptionsSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelOptionsSpecificationProperty):
          VpnTunnelOptionsSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpnTunnelOptionsSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelOptionsSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
