package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String

public abstract class FlowLogResourceType internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.FlowLogResourceType,
) {
  public open fun resourceId(): String = unwrap(this).getResourceId()

  public open fun resourceId(arg0: String) {
    unwrap(this).setResourceId(arg0)
  }

  public open fun resourceType(): String = unwrap(this).getResourceType()

  public open fun resourceType(arg0: String) {
    unwrap(this).setResourceType(arg0)
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.FlowLogResourceType,
  ) : FlowLogResourceType(cdkObject)

  public companion object {
    public open fun fromNetworkInterfaceId(id: String): FlowLogResourceType =
        software.amazon.awscdk.services.ec2.FlowLogResourceType.fromNetworkInterfaceId(id).let(FlowLogResourceType::wrap)

    public open fun fromSubnet(subnet: ISubnet): FlowLogResourceType =
        software.amazon.awscdk.services.ec2.FlowLogResourceType.fromSubnet(subnet.let(ISubnet::unwrap)).let(FlowLogResourceType::wrap)

    public open fun fromTransitGatewayAttachmentId(id: String): FlowLogResourceType =
        software.amazon.awscdk.services.ec2.FlowLogResourceType.fromTransitGatewayAttachmentId(id).let(FlowLogResourceType::wrap)

    public open fun fromTransitGatewayId(id: String): FlowLogResourceType =
        software.amazon.awscdk.services.ec2.FlowLogResourceType.fromTransitGatewayId(id).let(FlowLogResourceType::wrap)

    public open fun fromVpc(vpc: IVpc): FlowLogResourceType =
        software.amazon.awscdk.services.ec2.FlowLogResourceType.fromVpc(vpc.let(IVpc::unwrap)).let(FlowLogResourceType::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.FlowLogResourceType):
        FlowLogResourceType = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FlowLogResourceType):
        software.amazon.awscdk.services.ec2.FlowLogResourceType = (wrapped as Wrapper).cdkObject
  }
}
