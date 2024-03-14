package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVPNConnectionRoute internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnectionRoute,
) : CfnResource(cdkObject), IInspectable {
  public open fun destinationCidrBlock(): String = unwrap(this).getDestinationCidrBlock()

  public open fun destinationCidrBlock(`value`: String) {
    unwrap(this).setDestinationCidrBlock(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun vpnConnectionId(): String = unwrap(this).getVpnConnectionId()

  public open fun vpnConnectionId(`value`: String) {
    unwrap(this).setVpnConnectionId(`value`)
  }

  public interface Builder {
    public fun destinationCidrBlock(destinationCidrBlock: String)

    public fun vpnConnectionId(vpnConnectionId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPNConnectionRoute.Builder =
        software.amazon.awscdk.services.ec2.CfnVPNConnectionRoute.Builder.create(scope, id)

    override fun destinationCidrBlock(destinationCidrBlock: String) {
      cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    override fun vpnConnectionId(vpnConnectionId: String) {
      cdkBuilder.vpnConnectionId(vpnConnectionId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPNConnectionRoute =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPNConnectionRoute {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPNConnectionRoute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnectionRoute):
        CfnVPNConnectionRoute = CfnVPNConnectionRoute(cdkObject)

    internal fun unwrap(wrapped: CfnVPNConnectionRoute):
        software.amazon.awscdk.services.ec2.CfnVPNConnectionRoute = wrapped.cdkObject
  }
}
