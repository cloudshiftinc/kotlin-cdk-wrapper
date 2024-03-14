package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.iam.ArnPrincipal
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class VpcEndpointService internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.VpcEndpointService,
) : Resource(cdkObject), IVpcEndpointService {
  public open fun acceptanceRequired(): Boolean = unwrap(this).getAcceptanceRequired()

  public open fun allowedPrincipals(): List<ArnPrincipal> =
      unwrap(this).getAllowedPrincipals().map(ArnPrincipal::wrap)

  public open fun contributorInsightsEnabled(): Boolean? =
      unwrap(this).getContributorInsightsEnabled()

  public override fun vpcEndpointServiceId(): String = unwrap(this).getVpcEndpointServiceId()

  public open fun vpcEndpointServiceLoadBalancers(): List<IVpcEndpointServiceLoadBalancer> =
      unwrap(this).getVpcEndpointServiceLoadBalancers().map(IVpcEndpointServiceLoadBalancer::wrap)

  public override fun vpcEndpointServiceName(): String = unwrap(this).getVpcEndpointServiceName()

  public interface Builder {
    public fun acceptanceRequired(acceptanceRequired: Boolean) {
    }

    public fun allowedPrincipals(allowedPrincipals: List<ArnPrincipal>) {
    }

    public fun contributorInsights(contributorInsights: Boolean) {
    }

    public
        fun vpcEndpointServiceLoadBalancers(vpcEndpointServiceLoadBalancers: List<IVpcEndpointServiceLoadBalancer>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VpcEndpointService.Builder =
        software.amazon.awscdk.services.ec2.VpcEndpointService.Builder.create(scope, id)

    public override fun acceptanceRequired(acceptanceRequired: Boolean) {
      cdkBuilder.acceptanceRequired(acceptanceRequired)
    }

    public override fun allowedPrincipals(allowedPrincipals: List<ArnPrincipal>) {
      cdkBuilder.allowedPrincipals(allowedPrincipals.map(ArnPrincipal::unwrap))
    }

    public override fun contributorInsights(contributorInsights: Boolean) {
      cdkBuilder.contributorInsights(contributorInsights)
    }

    public override
        fun vpcEndpointServiceLoadBalancers(vpcEndpointServiceLoadBalancers: List<IVpcEndpointServiceLoadBalancer>) {
      cdkBuilder.vpcEndpointServiceLoadBalancers(vpcEndpointServiceLoadBalancers.map(IVpcEndpointServiceLoadBalancer::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.VpcEndpointService = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): VpcEndpointService {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return VpcEndpointService(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpcEndpointService):
        VpcEndpointService = VpcEndpointService(cdkObject)

    internal fun unwrap(wrapped: VpcEndpointService):
        software.amazon.awscdk.services.ec2.VpcEndpointService = wrapped.cdkObject
  }
}
