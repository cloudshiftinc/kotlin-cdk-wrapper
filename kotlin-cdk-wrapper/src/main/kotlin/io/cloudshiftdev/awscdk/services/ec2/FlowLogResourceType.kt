@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public abstract class FlowLogResourceType internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.FlowLogResourceType,
) : CdkObject(cdkObject) {
  public open fun resourceId(): String = unwrap(this).getResourceId()

  public open fun resourceId(arg0: String) {
    unwrap(this).setResourceId(arg0)
  }

  public open fun resourceType(): String = unwrap(this).getResourceType()

  public open fun resourceType(arg0: String) {
    unwrap(this).setResourceType(arg0)
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.FlowLogResourceType,
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
        software.amazon.awscdk.services.ec2.FlowLogResourceType = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.FlowLogResourceType
  }
}
