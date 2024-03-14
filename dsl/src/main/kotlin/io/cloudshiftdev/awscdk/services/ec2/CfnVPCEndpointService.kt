package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVPCEndpointService internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpointService,
) : CfnResource(cdkObject), IInspectable {
  public open fun acceptanceRequired(): Any? = unwrap(this).getAcceptanceRequired()

  public open fun acceptanceRequired(`value`: Boolean) {
    unwrap(this).setAcceptanceRequired(`value`)
  }

  public open fun acceptanceRequired(`value`: IResolvable) {
    unwrap(this).setAcceptanceRequired(`value`.let(IResolvable::unwrap))
  }

  public open fun attrServiceId(): String = unwrap(this).getAttrServiceId()

  public open fun contributorInsightsEnabled(): Any? = unwrap(this).getContributorInsightsEnabled()

  public open fun contributorInsightsEnabled(`value`: Boolean) {
    unwrap(this).setContributorInsightsEnabled(`value`)
  }

  public open fun contributorInsightsEnabled(`value`: IResolvable) {
    unwrap(this).setContributorInsightsEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun gatewayLoadBalancerArns(): List<String> =
      unwrap(this).getGatewayLoadBalancerArns() ?: emptyList()

  public open fun gatewayLoadBalancerArns(`value`: List<String>) {
    unwrap(this).setGatewayLoadBalancerArns(`value`)
  }

  public open fun gatewayLoadBalancerArns(vararg `value`: String): Unit =
      gatewayLoadBalancerArns(`value`.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun networkLoadBalancerArns(): List<String> =
      unwrap(this).getNetworkLoadBalancerArns() ?: emptyList()

  public open fun networkLoadBalancerArns(`value`: List<String>) {
    unwrap(this).setNetworkLoadBalancerArns(`value`)
  }

  public open fun networkLoadBalancerArns(vararg `value`: String): Unit =
      networkLoadBalancerArns(`value`.toList())

  public open fun payerResponsibility(): String? = unwrap(this).getPayerResponsibility()

  public open fun payerResponsibility(`value`: String) {
    unwrap(this).setPayerResponsibility(`value`)
  }

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPCEndpointService.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCEndpointService.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCEndpointService =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPCEndpointService {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPCEndpointService(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpointService):
        CfnVPCEndpointService = CfnVPCEndpointService(cdkObject)

    internal fun unwrap(wrapped: CfnVPCEndpointService):
        software.amazon.awscdk.services.ec2.CfnVPCEndpointService = wrapped.cdkObject
  }
}
