@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.ArnPrincipal
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List

public interface VpcEndpointServiceProps {
  public fun acceptanceRequired(): Boolean? = unwrap(this).getAcceptanceRequired()

  public fun allowedPrincipals(): List<ArnPrincipal> =
      unwrap(this).getAllowedPrincipals()?.map(ArnPrincipal::wrap) ?: emptyList()

  public fun contributorInsights(): Boolean? = unwrap(this).getContributorInsights()

  public fun vpcEndpointServiceLoadBalancers(): List<IVpcEndpointServiceLoadBalancer>

  @CdkDslMarker
  public interface Builder {
    public fun acceptanceRequired(acceptanceRequired: Boolean)

    public fun allowedPrincipals(allowedPrincipals: List<ArnPrincipal>)

    public fun allowedPrincipals(vararg allowedPrincipals: ArnPrincipal)

    public fun contributorInsights(contributorInsights: Boolean)

    public
        fun vpcEndpointServiceLoadBalancers(vpcEndpointServiceLoadBalancers: List<IVpcEndpointServiceLoadBalancer>)

    public fun vpcEndpointServiceLoadBalancers(vararg
        vpcEndpointServiceLoadBalancers: IVpcEndpointServiceLoadBalancer)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VpcEndpointServiceProps.Builder =
        software.amazon.awscdk.services.ec2.VpcEndpointServiceProps.builder()

    override fun acceptanceRequired(acceptanceRequired: Boolean) {
      cdkBuilder.acceptanceRequired(acceptanceRequired)
    }

    override fun allowedPrincipals(allowedPrincipals: List<ArnPrincipal>) {
      cdkBuilder.allowedPrincipals(allowedPrincipals.map(ArnPrincipal::unwrap))
    }

    override fun allowedPrincipals(vararg allowedPrincipals: ArnPrincipal): Unit =
        allowedPrincipals(allowedPrincipals.toList())

    override fun contributorInsights(contributorInsights: Boolean) {
      cdkBuilder.contributorInsights(contributorInsights)
    }

    override
        fun vpcEndpointServiceLoadBalancers(vpcEndpointServiceLoadBalancers: List<IVpcEndpointServiceLoadBalancer>) {
      cdkBuilder.vpcEndpointServiceLoadBalancers(vpcEndpointServiceLoadBalancers.map(IVpcEndpointServiceLoadBalancer::unwrap))
    }

    override fun vpcEndpointServiceLoadBalancers(vararg
        vpcEndpointServiceLoadBalancers: IVpcEndpointServiceLoadBalancer): Unit =
        vpcEndpointServiceLoadBalancers(vpcEndpointServiceLoadBalancers.toList())

    public fun build(): software.amazon.awscdk.services.ec2.VpcEndpointServiceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.VpcEndpointServiceProps,
  ) : CdkObject(cdkObject), VpcEndpointServiceProps {
    override fun acceptanceRequired(): Boolean? = unwrap(this).getAcceptanceRequired()

    override fun allowedPrincipals(): List<ArnPrincipal> =
        unwrap(this).getAllowedPrincipals()?.map(ArnPrincipal::wrap) ?: emptyList()

    override fun contributorInsights(): Boolean? = unwrap(this).getContributorInsights()

    override fun vpcEndpointServiceLoadBalancers(): List<IVpcEndpointServiceLoadBalancer> =
        unwrap(this).getVpcEndpointServiceLoadBalancers().map(IVpcEndpointServiceLoadBalancer::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VpcEndpointServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpcEndpointServiceProps):
        VpcEndpointServiceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcEndpointServiceProps):
        software.amazon.awscdk.services.ec2.VpcEndpointServiceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.VpcEndpointServiceProps
  }
}
