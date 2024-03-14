package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVPNGatewayRoutePropagation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagation,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun routeTableIds(): List<String> = unwrap(this).getRouteTableIds()

  public open fun routeTableIds(`value`: List<String>) {
    unwrap(this).setRouteTableIds(`value`)
  }

  public open fun routeTableIds(vararg `value`: String): Unit = routeTableIds(`value`.toList())

  public open fun vpnGatewayId(): String = unwrap(this).getVpnGatewayId()

  public open fun vpnGatewayId(`value`: String) {
    unwrap(this).setVpnGatewayId(`value`)
  }

  public interface Builder {
    public fun routeTableIds(routeTableIds: List<String>)

    public fun routeTableIds(vararg routeTableIds: String)

    public fun vpnGatewayId(vpnGatewayId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagation.Builder =
        software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagation.Builder.create(scope, id)

    override fun routeTableIds(routeTableIds: List<String>) {
      cdkBuilder.routeTableIds(routeTableIds)
    }

    override fun routeTableIds(vararg routeTableIds: String): Unit =
        routeTableIds(routeTableIds.toList())

    override fun vpnGatewayId(vpnGatewayId: String) {
      cdkBuilder.vpnGatewayId(vpnGatewayId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPNGatewayRoutePropagation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPNGatewayRoutePropagation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagation):
        CfnVPNGatewayRoutePropagation = CfnVPNGatewayRoutePropagation(cdkObject)

    internal fun unwrap(wrapped: CfnVPNGatewayRoutePropagation):
        software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagation = wrapped.cdkObject
  }
}
