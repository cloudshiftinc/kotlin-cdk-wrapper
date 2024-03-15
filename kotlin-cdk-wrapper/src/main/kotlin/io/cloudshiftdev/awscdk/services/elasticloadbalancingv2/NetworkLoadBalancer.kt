@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class NetworkLoadBalancer internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer,
) : BaseLoadBalancer(cdkObject), INetworkLoadBalancer {
  public override fun addListener(id: String, props: BaseNetworkListenerProps): NetworkListener =
      unwrap(this).addListener(id,
      props.let(BaseNetworkListenerProps::unwrap)).let(NetworkListener::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a41b0d86a8d4886847b1c4ec80b30640a2d7a8098f577ff54f0dca337543d349")
  public override fun addListener(id: String, props: BaseNetworkListenerProps.Builder.() -> Unit):
      NetworkListener = addListener(id, BaseNetworkListenerProps(props))

  public open fun addSecurityGroup(securityGroup: ISecurityGroup) {
    unwrap(this).addSecurityGroup(securityGroup.let(ISecurityGroup::unwrap))
  }

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public override fun ipAddressType(): IpAddressType? =
      unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public open fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricActiveFlowCount(): Metric =
      unwrap(this).metricActiveFlowCount().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricActiveFlowCount(props: MetricOptions): Metric =
      unwrap(this).metricActiveFlowCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("15c7bd19a5fd454ade85668f8904798210d28945f611163b69d85301bbe6836d")
  public open fun metricActiveFlowCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricActiveFlowCount(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricConsumedLcUs(): Metric = unwrap(this).metricConsumedLCUs().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricConsumedLcUs(props: MetricOptions): Metric =
      unwrap(this).metricConsumedLCUs(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0ad78129a917eee56b57e367cb552e5520e44cc8850a30b6843c7637bddf5442")
  public open fun metricConsumedLcUs(props: MetricOptions.Builder.() -> Unit): Metric =
      metricConsumedLcUs(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricNewFlowCount(): Metric = unwrap(this).metricNewFlowCount().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricNewFlowCount(props: MetricOptions): Metric =
      unwrap(this).metricNewFlowCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("51754b4329677647f3be42bdba5ca17fc8853d3469c8a6a41a9f2a07a0c6c478")
  public open fun metricNewFlowCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricNewFlowCount(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricProcessedBytes(): Metric =
      unwrap(this).metricProcessedBytes().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricProcessedBytes(props: MetricOptions): Metric =
      unwrap(this).metricProcessedBytes(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5508437533a512ae29d20a7b9481b4dc589656903396c8e04e3af24fd5173cac")
  public open fun metricProcessedBytes(props: MetricOptions.Builder.() -> Unit): Metric =
      metricProcessedBytes(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricTcpClientResetCount(): Metric =
      unwrap(this).metricTcpClientResetCount().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricTcpClientResetCount(props: MetricOptions): Metric =
      unwrap(this).metricTcpClientResetCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a4bf30eaaef3faec726cbd0b99edd99f78ce6b5859650f3f509c3531167e31c8")
  public open fun metricTcpClientResetCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricTcpClientResetCount(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricTcpElbResetCount(): Metric =
      unwrap(this).metricTcpElbResetCount().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricTcpElbResetCount(props: MetricOptions): Metric =
      unwrap(this).metricTcpElbResetCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b6918aa1a269aebaec13cc34a9fb4b1d7c450b553f5d690a161a3aaaac51294c")
  public open fun metricTcpElbResetCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricTcpElbResetCount(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricTcpTargetResetCount(): Metric =
      unwrap(this).metricTcpTargetResetCount().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricTcpTargetResetCount(props: MetricOptions): Metric =
      unwrap(this).metricTcpTargetResetCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e133cdd46986cfe6466609ea03b81c9387a7b09291c3ce057561ff36746aa733")
  public open fun metricTcpTargetResetCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricTcpTargetResetCount(MetricOptions(props))

  public override fun metrics(): INetworkLoadBalancerMetrics =
      unwrap(this).getMetrics().let(INetworkLoadBalancerMetrics::wrap)

  public override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?:
      emptyList()

  public override fun vpc(): IVpc? = INetworkLoadBalancer.unwrap(this).vpc?.let(IVpc::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun crossZoneEnabled(crossZoneEnabled: Boolean)

    public fun deletionProtection(deletionProtection: Boolean)

    public fun internetFacing(internetFacing: Boolean)

    public fun ipAddressType(ipAddressType: IpAddressType)

    public fun loadBalancerName(loadBalancerName: String)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("76b4d38b2541f097e5e9a086970529ede085f84e55e0e84f8d77525b2e7f8bb5")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer.Builder.create(scope,
        id)

    override fun crossZoneEnabled(crossZoneEnabled: Boolean) {
      cdkBuilder.crossZoneEnabled(crossZoneEnabled)
    }

    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    override fun internetFacing(internetFacing: Boolean) {
      cdkBuilder.internetFacing(internetFacing)
    }

    override fun ipAddressType(ipAddressType: IpAddressType) {
      cdkBuilder.ipAddressType(ipAddressType.let(IpAddressType::unwrap))
    }

    override fun loadBalancerName(loadBalancerName: String) {
      cdkBuilder.loadBalancerName(loadBalancerName)
    }

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("76b4d38b2541f097e5e9a086970529ede085f84e55e0e84f8d77525b2e7f8bb5")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: NetworkLoadBalancerLookupOptions,
    ): INetworkLoadBalancer =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer.fromLookup(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, options.let(NetworkLoadBalancerLookupOptions::unwrap)).let(INetworkLoadBalancer::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bcd51206aa6d66c8e1035cfa09dc81795e7186ac9e256f9be8d2c805945399b1")
    public fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: NetworkLoadBalancerLookupOptions.Builder.() -> Unit,
    ): INetworkLoadBalancer = fromLookup(scope, id, NetworkLoadBalancerLookupOptions(options))

    public fun fromNetworkLoadBalancerAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: NetworkLoadBalancerAttributes,
    ): INetworkLoadBalancer =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer.fromNetworkLoadBalancerAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(NetworkLoadBalancerAttributes::unwrap)).let(INetworkLoadBalancer::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("068a2579d6c7917a88937fb61ae4cf40af5dd1d14d86741fca3de48637d669bb")
    public fun fromNetworkLoadBalancerAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: NetworkLoadBalancerAttributes.Builder.() -> Unit,
    ): INetworkLoadBalancer = fromNetworkLoadBalancerAttributes(scope, id,
        NetworkLoadBalancerAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): NetworkLoadBalancer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return NetworkLoadBalancer(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer):
        NetworkLoadBalancer = NetworkLoadBalancer(cdkObject)

    internal fun unwrap(wrapped: NetworkLoadBalancer):
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer =
        wrapped.cdkObject
  }
}
