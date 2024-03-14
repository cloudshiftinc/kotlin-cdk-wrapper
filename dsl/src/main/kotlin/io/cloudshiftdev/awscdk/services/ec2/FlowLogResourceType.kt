package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String

public abstract class FlowLogResourceType internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.FlowLogResourceType,
) {
  /**
   * The Id of the resource that the flow log should be attached to.
   */
  public open fun resourceId(): String = unwrap(this).getResourceId()

  /**
   * The Id of the resource that the flow log should be attached to.
   */
  public open fun resourceId(`value`: String) {
    unwrap(this).setResourceId(`value`)
  }

  /**
   * The type of resource to attach a flow log to.
   */
  public open fun resourceType(): String = unwrap(this).getResourceType()

  /**
   * The type of resource to attach a flow log to.
   */
  public open fun resourceType(`value`: String) {
    unwrap(this).setResourceType(`value`)
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.FlowLogResourceType,
  ) : FlowLogResourceType(cdkObject)

  public companion object {
    public fun fromNetworkInterfaceId(id: String): FlowLogResourceType =
        software.amazon.awscdk.services.ec2.FlowLogResourceType.fromNetworkInterfaceId(id).let(FlowLogResourceType::wrap)

    public fun fromSubnet(subnet: ISubnet): FlowLogResourceType =
        software.amazon.awscdk.services.ec2.FlowLogResourceType.fromSubnet(subnet.let(ISubnet::unwrap)).let(FlowLogResourceType::wrap)

    public fun fromTransitGatewayAttachmentId(id: String): FlowLogResourceType =
        software.amazon.awscdk.services.ec2.FlowLogResourceType.fromTransitGatewayAttachmentId(id).let(FlowLogResourceType::wrap)

    public fun fromTransitGatewayId(id: String): FlowLogResourceType =
        software.amazon.awscdk.services.ec2.FlowLogResourceType.fromTransitGatewayId(id).let(FlowLogResourceType::wrap)

    public fun fromVpc(vpc: IVpc): FlowLogResourceType =
        software.amazon.awscdk.services.ec2.FlowLogResourceType.fromVpc(vpc.let(IVpc::unwrap)).let(FlowLogResourceType::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.FlowLogResourceType):
        FlowLogResourceType = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FlowLogResourceType):
        software.amazon.awscdk.services.ec2.FlowLogResourceType = (wrapped as Wrapper).cdkObject
  }
}
