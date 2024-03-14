package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnClientVpnTargetNetworkAssociation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociation,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun clientVpnEndpointId(): String = unwrap(this).getClientVpnEndpointId()

  public open fun clientVpnEndpointId(`value`: String) {
    unwrap(this).setClientVpnEndpointId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun subnetId(): String = unwrap(this).getSubnetId()

  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  public interface Builder {
    public fun clientVpnEndpointId(clientVpnEndpointId: String)

    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociation.Builder =
        software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociation.Builder.create(scope,
        id)

    override fun clientVpnEndpointId(clientVpnEndpointId: String) {
      cdkBuilder.clientVpnEndpointId(clientVpnEndpointId)
    }

    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnClientVpnTargetNetworkAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnClientVpnTargetNetworkAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociation):
        CfnClientVpnTargetNetworkAssociation = CfnClientVpnTargetNetworkAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnClientVpnTargetNetworkAssociation):
        software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociation = wrapped.cdkObject
  }
}
