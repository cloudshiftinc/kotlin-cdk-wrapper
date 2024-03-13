package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ApplicationLoadBalancer internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer,
) : BaseLoadBalancer(cdkObject), IApplicationLoadBalancer {
  public override fun addListener(id: String, props: BaseApplicationListenerProps):
      ApplicationListener = unwrap(this).addListener(id,
      props.let(BaseApplicationListenerProps::unwrap)).let(ApplicationListener::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c4214bb0ef19ba7cc886c0c0c590fdb239a96d82b7e5e0b4b1bbe44fe0af6df0")
  public override fun addListener(id: String,
      props: BaseApplicationListenerProps.Builder.() -> Unit): ApplicationListener = addListener(id,
      BaseApplicationListenerProps(props))

  public open fun addRedirect(): ApplicationListener =
      unwrap(this).addRedirect().let(ApplicationListener::wrap)

  public open fun addRedirect(props: ApplicationLoadBalancerRedirectConfig): ApplicationListener =
      unwrap(this).addRedirect(props.let(ApplicationLoadBalancerRedirectConfig::unwrap)).let(ApplicationListener::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("414603ae3ccbdc13cba74213055b0f1f5d7593a29ad9b9b93963d4a5b6df379b")
  public open fun addRedirect(props: ApplicationLoadBalancerRedirectConfig.Builder.() -> Unit):
      ApplicationListener = addRedirect(ApplicationLoadBalancerRedirectConfig(props))

  public open fun addSecurityGroup(securityGroup: ISecurityGroup) {
    unwrap(this).addSecurityGroup(securityGroup.let(ISecurityGroup::unwrap))
  }

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public override fun ipAddressType(): IpAddressType? =
      unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

  public override fun listeners(): List<ApplicationListener> =
      unwrap(this).getListeners().map(ApplicationListener::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public open fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricActiveConnectionCount(): Metric =
      unwrap(this).metricActiveConnectionCount().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricActiveConnectionCount(props: MetricOptions): Metric =
      unwrap(this).metricActiveConnectionCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bc2495f0c07e948e0f827d073b565f686e104fc4fec278d64cdc2311f39fd492")
  public open fun metricActiveConnectionCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricActiveConnectionCount(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricClientTlsNegotiationErrorCount(): Metric =
      unwrap(this).metricClientTlsNegotiationErrorCount().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricClientTlsNegotiationErrorCount(props: MetricOptions): Metric =
      unwrap(this).metricClientTlsNegotiationErrorCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("16b8a4e8915c89a82cd45c28b3becc2a093996c16013e8ef6401b1961ebf2d1c")
  public open fun metricClientTlsNegotiationErrorCount(props: MetricOptions.Builder.() -> Unit):
      Metric = metricClientTlsNegotiationErrorCount(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricConsumedLcUs(): Metric = unwrap(this).metricConsumedLCUs().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricConsumedLcUs(props: MetricOptions): Metric =
      unwrap(this).metricConsumedLCUs(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0ad78129a917eee56b57e367cb552e5520e44cc8850a30b6843c7637bddf5442")
  public open fun metricConsumedLcUs(props: MetricOptions.Builder.() -> Unit): Metric =
      metricConsumedLcUs(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricElbAuthError(): Metric = unwrap(this).metricElbAuthError().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricElbAuthError(props: MetricOptions): Metric =
      unwrap(this).metricElbAuthError(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0580ab9489dbe9c58014f0442e64e902baa9afdf60c89a0982e2347f06d87e75")
  public open fun metricElbAuthError(props: MetricOptions.Builder.() -> Unit): Metric =
      metricElbAuthError(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricElbAuthFailure(): Metric =
      unwrap(this).metricElbAuthFailure().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricElbAuthFailure(props: MetricOptions): Metric =
      unwrap(this).metricElbAuthFailure(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7fd26803a940ec76e11c596d367dc084ee5431b3622420fef0f4b1595ee3db63")
  public open fun metricElbAuthFailure(props: MetricOptions.Builder.() -> Unit): Metric =
      metricElbAuthFailure(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricElbAuthLatency(): Metric =
      unwrap(this).metricElbAuthLatency().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricElbAuthLatency(props: MetricOptions): Metric =
      unwrap(this).metricElbAuthLatency(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3f4a652d5ae97791e249e36f6ec958dcf9a7db75232cc9a189fa42426453b5f1")
  public open fun metricElbAuthLatency(props: MetricOptions.Builder.() -> Unit): Metric =
      metricElbAuthLatency(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricElbAuthSuccess(): Metric =
      unwrap(this).metricElbAuthSuccess().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricElbAuthSuccess(props: MetricOptions): Metric =
      unwrap(this).metricElbAuthSuccess(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c6d3739c144b2050cdbad6b39cf17ec2c6766a1bb389bbddc3ad1d498f3ac7b5")
  public open fun metricElbAuthSuccess(props: MetricOptions.Builder.() -> Unit): Metric =
      metricElbAuthSuccess(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricHttpCodeElb(code: HttpCodeElb): Metric =
      unwrap(this).metricHttpCodeElb(code.let(HttpCodeElb::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricHttpCodeElb(code: HttpCodeElb, props: MetricOptions): Metric =
      unwrap(this).metricHttpCodeElb(code.let(HttpCodeElb::unwrap),
      props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("392490a1a26046d62d729c33c4d04fa8855bcd51361678757e4b14bed869e570")
  public open fun metricHttpCodeElb(code: HttpCodeElb, props: MetricOptions.Builder.() -> Unit):
      Metric = metricHttpCodeElb(code, MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricHttpCodeTarget(code: HttpCodeTarget): Metric =
      unwrap(this).metricHttpCodeTarget(code.let(HttpCodeTarget::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricHttpCodeTarget(code: HttpCodeTarget, props: MetricOptions): Metric =
      unwrap(this).metricHttpCodeTarget(code.let(HttpCodeTarget::unwrap),
      props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("121a82afa7f74fa036d0dc74440ef0d024223acab827324eda17b612a9012454")
  public open fun metricHttpCodeTarget(code: HttpCodeTarget,
      props: MetricOptions.Builder.() -> Unit): Metric = metricHttpCodeTarget(code,
      MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricHttpFixedResponseCount(): Metric =
      unwrap(this).metricHttpFixedResponseCount().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricHttpFixedResponseCount(props: MetricOptions): Metric =
      unwrap(this).metricHttpFixedResponseCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("708d3a5f6c77a47f8d4cc6450e438b896f03f03634ec519d9487b34b574ab88f")
  public open fun metricHttpFixedResponseCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricHttpFixedResponseCount(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricHttpRedirectCount(): Metric =
      unwrap(this).metricHttpRedirectCount().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricHttpRedirectCount(props: MetricOptions): Metric =
      unwrap(this).metricHttpRedirectCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f68dc9546e33be9e44d6380446148205bd816c5ec5cb2586d1fdd6e78550d68e")
  public open fun metricHttpRedirectCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricHttpRedirectCount(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricHttpRedirectUrlLimitExceededCount(): Metric =
      unwrap(this).metricHttpRedirectUrlLimitExceededCount().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricHttpRedirectUrlLimitExceededCount(props: MetricOptions): Metric =
      unwrap(this).metricHttpRedirectUrlLimitExceededCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f1bd177b78d76f5765fa34d80632dca682423dd12e1b15fcb42f78ecc5b633e5")
  public open fun metricHttpRedirectUrlLimitExceededCount(props: MetricOptions.Builder.() -> Unit):
      Metric = metricHttpRedirectUrlLimitExceededCount(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricIpv6ProcessedBytes(): Metric =
      unwrap(this).metricIpv6ProcessedBytes().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricIpv6ProcessedBytes(props: MetricOptions): Metric =
      unwrap(this).metricIpv6ProcessedBytes(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("368b04a6767889e581b1f4fe7f2c53a95e67377e7ea031b12e27a65fd45691d7")
  public open fun metricIpv6ProcessedBytes(props: MetricOptions.Builder.() -> Unit): Metric =
      metricIpv6ProcessedBytes(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricIpv6RequestCount(): Metric =
      unwrap(this).metricIpv6RequestCount().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricIpv6RequestCount(props: MetricOptions): Metric =
      unwrap(this).metricIpv6RequestCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7cb2b61a2d0456f8f0f6806cc31cbb006c4e1f7f92ce14af7aae5ed4fcb572d1")
  public open fun metricIpv6RequestCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricIpv6RequestCount(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricNewConnectionCount(): Metric =
      unwrap(this).metricNewConnectionCount().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricNewConnectionCount(props: MetricOptions): Metric =
      unwrap(this).metricNewConnectionCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("37c5b98067bb035b5e102e72637621be6f4492f65ba4290ce686a56f69e0d7cb")
  public open fun metricNewConnectionCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricNewConnectionCount(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricProcessedBytes(): Metric =
      unwrap(this).metricProcessedBytes().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricProcessedBytes(props: MetricOptions): Metric =
      unwrap(this).metricProcessedBytes(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5508437533a512ae29d20a7b9481b4dc589656903396c8e04e3af24fd5173cac")
  public open fun metricProcessedBytes(props: MetricOptions.Builder.() -> Unit): Metric =
      metricProcessedBytes(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricRejectedConnectionCount(): Metric =
      unwrap(this).metricRejectedConnectionCount().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricRejectedConnectionCount(props: MetricOptions): Metric =
      unwrap(this).metricRejectedConnectionCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2b33e13f88061de48eb045aaee0cb6a782669f87b64d3a6e1bf71710bba288d1")
  public open fun metricRejectedConnectionCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricRejectedConnectionCount(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricRequestCount(): Metric = unwrap(this).metricRequestCount().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricRequestCount(props: MetricOptions): Metric =
      unwrap(this).metricRequestCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a6855b6eecd989b6fd05d9eadf7997928023d1bd51a53703a9bb975518c563c2")
  public open fun metricRequestCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricRequestCount(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricRuleEvaluations(): Metric =
      unwrap(this).metricRuleEvaluations().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricRuleEvaluations(props: MetricOptions): Metric =
      unwrap(this).metricRuleEvaluations(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b5209985584d12969eab89cf0298f5fce3e6f9139755e0599849fab3bbc0e5fd")
  public open fun metricRuleEvaluations(props: MetricOptions.Builder.() -> Unit): Metric =
      metricRuleEvaluations(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricTargetConnectionErrorCount(): Metric =
      unwrap(this).metricTargetConnectionErrorCount().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricTargetConnectionErrorCount(props: MetricOptions): Metric =
      unwrap(this).metricTargetConnectionErrorCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("89056777171dd65db09c827c4c0fa488d94a8c0bc618f5b80e0b582e570684fe")
  public open fun metricTargetConnectionErrorCount(props: MetricOptions.Builder.() -> Unit): Metric
      = metricTargetConnectionErrorCount(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricTargetResponseTime(): Metric =
      unwrap(this).metricTargetResponseTime().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricTargetResponseTime(props: MetricOptions): Metric =
      unwrap(this).metricTargetResponseTime(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("47cb9abec01142cff45f0038aa6de07ef9926f5c2b9b0dfe8af82ee727462c44")
  public open fun metricTargetResponseTime(props: MetricOptions.Builder.() -> Unit): Metric =
      metricTargetResponseTime(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricTargetTlsNegotiationErrorCount(): Metric =
      unwrap(this).metricTargetTLSNegotiationErrorCount().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricTargetTlsNegotiationErrorCount(props: MetricOptions): Metric =
      unwrap(this).metricTargetTLSNegotiationErrorCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6fb589e77244f79e7b207d6efccaa92a565bce39740975d0c083f19f8a1853d0")
  public open fun metricTargetTlsNegotiationErrorCount(props: MetricOptions.Builder.() -> Unit):
      Metric = metricTargetTlsNegotiationErrorCount(MetricOptions(props))

  public override fun metrics(): IApplicationLoadBalancerMetrics =
      unwrap(this).getMetrics().let(IApplicationLoadBalancerMetrics::wrap)

  public interface Builder {
    public fun deletionProtection(deletionProtection: Boolean) {
    }

    public fun desyncMitigationMode(desyncMitigationMode: DesyncMitigationMode) {
    }

    public fun dropInvalidHeaderFields(dropInvalidHeaderFields: Boolean) {
    }

    public fun http2Enabled(http2Enabled: Boolean) {
    }

    public fun idleTimeout(idleTimeout: Duration) {
    }

    public fun internetFacing(internetFacing: Boolean) {
    }

    public fun ipAddressType(ipAddressType: IpAddressType) {
    }

    public fun loadBalancerName(loadBalancerName: String) {
    }

    public fun securityGroup(securityGroup: ISecurityGroup) {
    }

    public fun vpc(vpc: IVpc) {
    }

    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("37ab8b88b872e71ae62e225b437c3fd8223e8c24ae05dc0ea4ccb865fb06a8c6")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer.Builder.create(scope,
        id)

    public override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    public override fun desyncMitigationMode(desyncMitigationMode: DesyncMitigationMode) {
      cdkBuilder.desyncMitigationMode(desyncMitigationMode.let(DesyncMitigationMode::unwrap))
    }

    public override fun dropInvalidHeaderFields(dropInvalidHeaderFields: Boolean) {
      cdkBuilder.dropInvalidHeaderFields(dropInvalidHeaderFields)
    }

    public override fun http2Enabled(http2Enabled: Boolean) {
      cdkBuilder.http2Enabled(http2Enabled)
    }

    public override fun idleTimeout(idleTimeout: Duration) {
      cdkBuilder.idleTimeout(idleTimeout.let(Duration::unwrap))
    }

    public override fun internetFacing(internetFacing: Boolean) {
      cdkBuilder.internetFacing(internetFacing)
    }

    public override fun ipAddressType(ipAddressType: IpAddressType) {
      cdkBuilder.ipAddressType(ipAddressType.let(IpAddressType::unwrap))
    }

    public override fun loadBalancerName(loadBalancerName: String) {
      cdkBuilder.loadBalancerName(loadBalancerName)
    }

    public override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("37ab8b88b872e71ae62e225b437c3fd8223e8c24ae05dc0ea4ccb865fb06a8c6")
    public override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromApplicationLoadBalancerAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ApplicationLoadBalancerAttributes,
    ): IApplicationLoadBalancer =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer.fromApplicationLoadBalancerAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id,
        attrs.let(ApplicationLoadBalancerAttributes::unwrap)).let(IApplicationLoadBalancer::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("13cee8bdd3ada2786fba9f63419504bcf481668ec2f4e0edb3c498f69610ef38")
    public open fun fromApplicationLoadBalancerAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ApplicationLoadBalancerAttributes.Builder.() -> Unit,
    ): IApplicationLoadBalancer = fromApplicationLoadBalancerAttributes(scope, id,
        ApplicationLoadBalancerAttributes(attrs))

    public open fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: ApplicationLoadBalancerLookupOptions,
    ): IApplicationLoadBalancer =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer.fromLookup(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id,
        options.let(ApplicationLoadBalancerLookupOptions::unwrap)).let(IApplicationLoadBalancer::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("296951d0c25167abddbc9bef4ff4ec5da29b12faec1bbb29a746129a61469732")
    public open fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: ApplicationLoadBalancerLookupOptions.Builder.() -> Unit,
    ): IApplicationLoadBalancer = fromLookup(scope, id,
        ApplicationLoadBalancerLookupOptions(options))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ApplicationLoadBalancer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ApplicationLoadBalancer(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer):
        ApplicationLoadBalancer = ApplicationLoadBalancer(cdkObject)

    internal fun unwrap(wrapped: ApplicationLoadBalancer):
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer =
        wrapped.cdkObject
  }
}
