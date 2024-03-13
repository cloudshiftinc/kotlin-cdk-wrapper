package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String

public abstract class ClientVpnRouteTarget internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.ClientVpnRouteTarget,
) {
  public open fun subnetId(): String = unwrap(this).getSubnetId()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.ClientVpnRouteTarget,
  ) : ClientVpnRouteTarget(cdkObject)

  public companion object {
    public open fun local(): ClientVpnRouteTarget =
        software.amazon.awscdk.services.ec2.ClientVpnRouteTarget.local().let(ClientVpnRouteTarget::wrap)

    public open fun subnet(subnet: ISubnet): ClientVpnRouteTarget =
        software.amazon.awscdk.services.ec2.ClientVpnRouteTarget.subnet(subnet.let(ISubnet::unwrap)).let(ClientVpnRouteTarget::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ClientVpnRouteTarget):
        ClientVpnRouteTarget = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClientVpnRouteTarget):
        software.amazon.awscdk.services.ec2.ClientVpnRouteTarget = (wrapped as Wrapper).cdkObject
  }
}
