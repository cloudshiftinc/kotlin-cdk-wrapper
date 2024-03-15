@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnVPCEndpointServiceProps {
  public fun acceptanceRequired(): Any? = unwrap(this).getAcceptanceRequired()

  public fun contributorInsightsEnabled(): Any? = unwrap(this).getContributorInsightsEnabled()

  public fun gatewayLoadBalancerArns(): List<String> = unwrap(this).getGatewayLoadBalancerArns() ?:
      emptyList()

  public fun networkLoadBalancerArns(): List<String> = unwrap(this).getNetworkLoadBalancerArns() ?:
      emptyList()

  public fun payerResponsibility(): String? = unwrap(this).getPayerResponsibility()

  @CdkDslMarker
  public interface Builder {
    public fun acceptanceRequired(acceptanceRequired: Boolean)

    public fun acceptanceRequired(acceptanceRequired: IResolvable)

    public fun contributorInsightsEnabled(contributorInsightsEnabled: Boolean)

    public fun contributorInsightsEnabled(contributorInsightsEnabled: IResolvable)

    public fun gatewayLoadBalancerArns(gatewayLoadBalancerArns: List<String>)

    public fun gatewayLoadBalancerArns(vararg gatewayLoadBalancerArns: String)

    public fun networkLoadBalancerArns(networkLoadBalancerArns: List<String>)

    public fun networkLoadBalancerArns(vararg networkLoadBalancerArns: String)

    public fun payerResponsibility(payerResponsibility: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPCEndpointServiceProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCEndpointServiceProps.builder()

    override fun acceptanceRequired(acceptanceRequired: Boolean) {
      cdkBuilder.acceptanceRequired(acceptanceRequired)
    }

    override fun acceptanceRequired(acceptanceRequired: IResolvable) {
      cdkBuilder.acceptanceRequired(acceptanceRequired.let(IResolvable::unwrap))
    }

    override fun contributorInsightsEnabled(contributorInsightsEnabled: Boolean) {
      cdkBuilder.contributorInsightsEnabled(contributorInsightsEnabled)
    }

    override fun contributorInsightsEnabled(contributorInsightsEnabled: IResolvable) {
      cdkBuilder.contributorInsightsEnabled(contributorInsightsEnabled.let(IResolvable::unwrap))
    }

    override fun gatewayLoadBalancerArns(gatewayLoadBalancerArns: List<String>) {
      cdkBuilder.gatewayLoadBalancerArns(gatewayLoadBalancerArns)
    }

    override fun gatewayLoadBalancerArns(vararg gatewayLoadBalancerArns: String): Unit =
        gatewayLoadBalancerArns(gatewayLoadBalancerArns.toList())

    override fun networkLoadBalancerArns(networkLoadBalancerArns: List<String>) {
      cdkBuilder.networkLoadBalancerArns(networkLoadBalancerArns)
    }

    override fun networkLoadBalancerArns(vararg networkLoadBalancerArns: String): Unit =
        networkLoadBalancerArns(networkLoadBalancerArns.toList())

    override fun payerResponsibility(payerResponsibility: String) {
      cdkBuilder.payerResponsibility(payerResponsibility)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCEndpointServiceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpointServiceProps,
  ) : CdkObject(cdkObject), CfnVPCEndpointServiceProps {
    override fun acceptanceRequired(): Any? = unwrap(this).getAcceptanceRequired()

    override fun contributorInsightsEnabled(): Any? = unwrap(this).getContributorInsightsEnabled()

    override fun gatewayLoadBalancerArns(): List<String> = unwrap(this).getGatewayLoadBalancerArns()
        ?: emptyList()

    override fun networkLoadBalancerArns(): List<String> = unwrap(this).getNetworkLoadBalancerArns()
        ?: emptyList()

    override fun payerResponsibility(): String? = unwrap(this).getPayerResponsibility()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVPCEndpointServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpointServiceProps):
        CfnVPCEndpointServiceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPCEndpointServiceProps):
        software.amazon.awscdk.services.ec2.CfnVPCEndpointServiceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnVPCEndpointServiceProps
  }
}
