package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class GatewayVpcEndpoint internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.GatewayVpcEndpoint,
) : VpcEndpoint(cdkObject), IGatewayVpcEndpoint {
  public open fun vpcEndpointCreationTimestamp(): String =
      unwrap(this).getVpcEndpointCreationTimestamp()

  public open fun vpcEndpointDnsEntries(): List<String> = unwrap(this).getVpcEndpointDnsEntries() ?:
      emptyList()

  public override fun vpcEndpointId(): String = unwrap(this).getVpcEndpointId()

  public open fun vpcEndpointNetworkInterfaceIds(): List<String> =
      unwrap(this).getVpcEndpointNetworkInterfaceIds() ?: emptyList()

  public interface Builder {
    public fun service(service: IGatewayVpcEndpointService)

    public fun subnets(subnets: List<SubnetSelection>)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.GatewayVpcEndpoint.Builder =
        software.amazon.awscdk.services.ec2.GatewayVpcEndpoint.Builder.create(scope, id)

    override fun service(service: IGatewayVpcEndpointService) {
      cdkBuilder.service(service.let(IGatewayVpcEndpointService::unwrap))
    }

    override fun subnets(subnets: List<SubnetSelection>) {
      cdkBuilder.subnets(subnets.map(SubnetSelection::unwrap))
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.GatewayVpcEndpoint = cdkBuilder.build()
  }

  public companion object {
    public open fun fromGatewayVpcEndpointId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      gatewayVpcEndpointId: String,
    ): IGatewayVpcEndpoint =
        software.amazon.awscdk.services.ec2.GatewayVpcEndpoint.fromGatewayVpcEndpointId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, gatewayVpcEndpointId).let(IGatewayVpcEndpoint::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): GatewayVpcEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return GatewayVpcEndpoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.GatewayVpcEndpoint):
        GatewayVpcEndpoint = GatewayVpcEndpoint(cdkObject)

    internal fun unwrap(wrapped: GatewayVpcEndpoint):
        software.amazon.awscdk.services.ec2.GatewayVpcEndpoint = wrapped.cdkObject
  }
}
