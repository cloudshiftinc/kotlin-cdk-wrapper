package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IApplicationLoadBalancerMetrics {
  public fun activeConnectionCount(): Metric

  public fun activeConnectionCount(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e883e659e9f5b247d2582b2e634786d63ac3b1ef6ca1f890b4b18b8b90d5189c")
  public fun activeConnectionCount(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun clientTlsNegotiationErrorCount(): Metric

  public fun clientTlsNegotiationErrorCount(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fdbae383d8e263982367b05a82bc68e589a7c576f59dd42c2af44bd37de26925")
  public fun clientTlsNegotiationErrorCount(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun consumedLcUs(): Metric

  public fun consumedLcUs(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("18e8e39bc441acca7c83d0b93ee82feb5719d75ccb2df798d695dbe35e061cf0")
  public fun consumedLcUs(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun custom(arg0: String): Metric

  public fun custom(arg0: String, arg1: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e3a7bf310cfbfe77339a32a3f576ae6834193015bd367fe25d8280f53f24860b")
  public fun custom(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric

  public fun elbAuthError(): Metric

  public fun elbAuthError(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("12656122a4f18d4bd28d02c8eb4c06650fbf79edfeb9cf85b2946d2a08193e52")
  public fun elbAuthError(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun elbAuthFailure(): Metric

  public fun elbAuthFailure(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("aa21e9e70d1cb86ab01c7a65f15f70989ca194636fef42a18486fd548f4a76a0")
  public fun elbAuthFailure(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun elbAuthLatency(): Metric

  public fun elbAuthLatency(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d33c955bd8a8640379e8a1fee24e976ba7b2f06214c1b4b7df598d473a4b0b2f")
  public fun elbAuthLatency(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun elbAuthSuccess(): Metric

  public fun elbAuthSuccess(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("139f674ec3ad7cc15a247ed7ac3d1313cf9bacbeaeec0013dc930d0161567483")
  public fun elbAuthSuccess(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun httpCodeElb(arg0: HttpCodeElb): Metric

  public fun httpCodeElb(arg0: HttpCodeElb, arg1: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4ec0c18e504ddbc3691899458ee1d9517d415b1e48a0d3108d7d82cd429225f5")
  public fun httpCodeElb(arg0: HttpCodeElb, arg1: MetricOptions.Builder.() -> Unit): Metric

  public fun httpCodeTarget(arg0: HttpCodeTarget): Metric

  public fun httpCodeTarget(arg0: HttpCodeTarget, arg1: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b24b5392cd4eb3171ba7964626471868514de6667c722081bcf28afba9d8f918")
  public fun httpCodeTarget(arg0: HttpCodeTarget, arg1: MetricOptions.Builder.() -> Unit): Metric

  public fun httpFixedResponseCount(): Metric

  public fun httpFixedResponseCount(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("38a993e824d91e43ce5a53673c0a44751916a494aaadf5e648998c7ab9582779")
  public fun httpFixedResponseCount(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun httpRedirectCount(): Metric

  public fun httpRedirectCount(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dbe5cdf8d522d73b93f6c8d9b5d82eab909a9d6ebddc89e6dd73a85f9cb612d0")
  public fun httpRedirectCount(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun httpRedirectUrlLimitExceededCount(): Metric

  public fun httpRedirectUrlLimitExceededCount(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e327dd03e46195ca0a0412eb1f1b527c163061e837653be3ee60e714c552e76c")
  public fun httpRedirectUrlLimitExceededCount(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun ipv6ProcessedBytes(): Metric

  public fun ipv6ProcessedBytes(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("32a0d4822abcb35e4c2fa5f348ec171d008bcec27186e2fc2b4b2b80bba8258f")
  public fun ipv6ProcessedBytes(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun ipv6RequestCount(): Metric

  public fun ipv6RequestCount(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7c99b7ad341d61067977149bec151ac4f7bbfa5b606fd1f34d5a0f67bbdfd466")
  public fun ipv6RequestCount(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun newConnectionCount(): Metric

  public fun newConnectionCount(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("28b664629d8b7698209c63dc1a10d10d8fa9e4d5e6e924ab8b07a75a7b957dc6")
  public fun newConnectionCount(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun processedBytes(): Metric

  public fun processedBytes(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0834009453def8be68d52ce6251707f95f5284610a225d554c4471bca1f54d3b")
  public fun processedBytes(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun rejectedConnectionCount(): Metric

  public fun rejectedConnectionCount(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8e7f89679f2c45631ab488d73b3b8a5e8b11f674a7f17844cce1926b6ea4f97e")
  public fun rejectedConnectionCount(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun requestCount(): Metric

  public fun requestCount(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("df6a54fa6c6b3bf8b7a44de0f859f5e74b085d7ce578c6a602288988d4106e46")
  public fun requestCount(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun ruleEvaluations(): Metric

  public fun ruleEvaluations(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f0f4a275bd9ef52684f0af49aa0046e50f74a4ca4e5d4e5fa0f484bd907daaac")
  public fun ruleEvaluations(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun targetConnectionErrorCount(): Metric

  public fun targetConnectionErrorCount(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ff66e9db5aa5ccafc9b54a6ff12c01de760a4cd3c0c5f48043c99cb77fa3203b")
  public fun targetConnectionErrorCount(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun targetResponseTime(): Metric

  public fun targetResponseTime(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bd42be106eb1a94ad8464621cbb797fff2f60bfbaf6069acaafdc175dcd64b7f")
  public fun targetResponseTime(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun targetTlsNegotiationErrorCount(): Metric

  public fun targetTlsNegotiationErrorCount(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6bff36edbbe3c8f26db05b3096329ed86c89c5421a92a5ecf6d869f655103f54")
  public fun targetTlsNegotiationErrorCount(arg0: MetricOptions.Builder.() -> Unit): Metric

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerMetrics,
  ) : IApplicationLoadBalancerMetrics {
    public override fun activeConnectionCount(): Metric =
        unwrap(this).activeConnectionCount().let(Metric::wrap)

    public override fun activeConnectionCount(arg0: MetricOptions): Metric =
        unwrap(this).activeConnectionCount(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e883e659e9f5b247d2582b2e634786d63ac3b1ef6ca1f890b4b18b8b90d5189c")
    public override fun activeConnectionCount(arg0: MetricOptions.Builder.() -> Unit): Metric =
        activeConnectionCount(MetricOptions(arg0))

    public override fun clientTlsNegotiationErrorCount(): Metric =
        unwrap(this).clientTlsNegotiationErrorCount().let(Metric::wrap)

    public override fun clientTlsNegotiationErrorCount(arg0: MetricOptions): Metric =
        unwrap(this).clientTlsNegotiationErrorCount(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fdbae383d8e263982367b05a82bc68e589a7c576f59dd42c2af44bd37de26925")
    public override fun clientTlsNegotiationErrorCount(arg0: MetricOptions.Builder.() -> Unit):
        Metric = clientTlsNegotiationErrorCount(MetricOptions(arg0))

    public override fun consumedLcUs(): Metric = unwrap(this).consumedLCUs().let(Metric::wrap)

    public override fun consumedLcUs(arg0: MetricOptions): Metric =
        unwrap(this).consumedLCUs(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18e8e39bc441acca7c83d0b93ee82feb5719d75ccb2df798d695dbe35e061cf0")
    public override fun consumedLcUs(arg0: MetricOptions.Builder.() -> Unit): Metric =
        consumedLcUs(MetricOptions(arg0))

    public override fun custom(arg0: String): Metric = unwrap(this).custom(arg0).let(Metric::wrap)

    public override fun custom(arg0: String, arg1: MetricOptions): Metric =
        unwrap(this).custom(arg0, arg1.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e3a7bf310cfbfe77339a32a3f576ae6834193015bd367fe25d8280f53f24860b")
    public override fun custom(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric =
        custom(arg0, MetricOptions(arg1))

    public override fun elbAuthError(): Metric = unwrap(this).elbAuthError().let(Metric::wrap)

    public override fun elbAuthError(arg0: MetricOptions): Metric =
        unwrap(this).elbAuthError(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12656122a4f18d4bd28d02c8eb4c06650fbf79edfeb9cf85b2946d2a08193e52")
    public override fun elbAuthError(arg0: MetricOptions.Builder.() -> Unit): Metric =
        elbAuthError(MetricOptions(arg0))

    public override fun elbAuthFailure(): Metric = unwrap(this).elbAuthFailure().let(Metric::wrap)

    public override fun elbAuthFailure(arg0: MetricOptions): Metric =
        unwrap(this).elbAuthFailure(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aa21e9e70d1cb86ab01c7a65f15f70989ca194636fef42a18486fd548f4a76a0")
    public override fun elbAuthFailure(arg0: MetricOptions.Builder.() -> Unit): Metric =
        elbAuthFailure(MetricOptions(arg0))

    public override fun elbAuthLatency(): Metric = unwrap(this).elbAuthLatency().let(Metric::wrap)

    public override fun elbAuthLatency(arg0: MetricOptions): Metric =
        unwrap(this).elbAuthLatency(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d33c955bd8a8640379e8a1fee24e976ba7b2f06214c1b4b7df598d473a4b0b2f")
    public override fun elbAuthLatency(arg0: MetricOptions.Builder.() -> Unit): Metric =
        elbAuthLatency(MetricOptions(arg0))

    public override fun elbAuthSuccess(): Metric = unwrap(this).elbAuthSuccess().let(Metric::wrap)

    public override fun elbAuthSuccess(arg0: MetricOptions): Metric =
        unwrap(this).elbAuthSuccess(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("139f674ec3ad7cc15a247ed7ac3d1313cf9bacbeaeec0013dc930d0161567483")
    public override fun elbAuthSuccess(arg0: MetricOptions.Builder.() -> Unit): Metric =
        elbAuthSuccess(MetricOptions(arg0))

    public override fun httpCodeElb(arg0: HttpCodeElb): Metric =
        unwrap(this).httpCodeElb(arg0.let(HttpCodeElb::unwrap)).let(Metric::wrap)

    public override fun httpCodeElb(arg0: HttpCodeElb, arg1: MetricOptions): Metric =
        unwrap(this).httpCodeElb(arg0.let(HttpCodeElb::unwrap),
        arg1.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4ec0c18e504ddbc3691899458ee1d9517d415b1e48a0d3108d7d82cd429225f5")
    public override fun httpCodeElb(arg0: HttpCodeElb, arg1: MetricOptions.Builder.() -> Unit):
        Metric = httpCodeElb(arg0, MetricOptions(arg1))

    public override fun httpCodeTarget(arg0: HttpCodeTarget): Metric =
        unwrap(this).httpCodeTarget(arg0.let(HttpCodeTarget::unwrap)).let(Metric::wrap)

    public override fun httpCodeTarget(arg0: HttpCodeTarget, arg1: MetricOptions): Metric =
        unwrap(this).httpCodeTarget(arg0.let(HttpCodeTarget::unwrap),
        arg1.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b24b5392cd4eb3171ba7964626471868514de6667c722081bcf28afba9d8f918")
    public override fun httpCodeTarget(arg0: HttpCodeTarget,
        arg1: MetricOptions.Builder.() -> Unit): Metric = httpCodeTarget(arg0, MetricOptions(arg1))

    public override fun httpFixedResponseCount(): Metric =
        unwrap(this).httpFixedResponseCount().let(Metric::wrap)

    public override fun httpFixedResponseCount(arg0: MetricOptions): Metric =
        unwrap(this).httpFixedResponseCount(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("38a993e824d91e43ce5a53673c0a44751916a494aaadf5e648998c7ab9582779")
    public override fun httpFixedResponseCount(arg0: MetricOptions.Builder.() -> Unit): Metric =
        httpFixedResponseCount(MetricOptions(arg0))

    public override fun httpRedirectCount(): Metric =
        unwrap(this).httpRedirectCount().let(Metric::wrap)

    public override fun httpRedirectCount(arg0: MetricOptions): Metric =
        unwrap(this).httpRedirectCount(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dbe5cdf8d522d73b93f6c8d9b5d82eab909a9d6ebddc89e6dd73a85f9cb612d0")
    public override fun httpRedirectCount(arg0: MetricOptions.Builder.() -> Unit): Metric =
        httpRedirectCount(MetricOptions(arg0))

    public override fun httpRedirectUrlLimitExceededCount(): Metric =
        unwrap(this).httpRedirectUrlLimitExceededCount().let(Metric::wrap)

    public override fun httpRedirectUrlLimitExceededCount(arg0: MetricOptions): Metric =
        unwrap(this).httpRedirectUrlLimitExceededCount(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e327dd03e46195ca0a0412eb1f1b527c163061e837653be3ee60e714c552e76c")
    public override fun httpRedirectUrlLimitExceededCount(arg0: MetricOptions.Builder.() -> Unit):
        Metric = httpRedirectUrlLimitExceededCount(MetricOptions(arg0))

    public override fun ipv6ProcessedBytes(): Metric =
        unwrap(this).ipv6ProcessedBytes().let(Metric::wrap)

    public override fun ipv6ProcessedBytes(arg0: MetricOptions): Metric =
        unwrap(this).ipv6ProcessedBytes(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32a0d4822abcb35e4c2fa5f348ec171d008bcec27186e2fc2b4b2b80bba8258f")
    public override fun ipv6ProcessedBytes(arg0: MetricOptions.Builder.() -> Unit): Metric =
        ipv6ProcessedBytes(MetricOptions(arg0))

    public override fun ipv6RequestCount(): Metric =
        unwrap(this).ipv6RequestCount().let(Metric::wrap)

    public override fun ipv6RequestCount(arg0: MetricOptions): Metric =
        unwrap(this).ipv6RequestCount(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c99b7ad341d61067977149bec151ac4f7bbfa5b606fd1f34d5a0f67bbdfd466")
    public override fun ipv6RequestCount(arg0: MetricOptions.Builder.() -> Unit): Metric =
        ipv6RequestCount(MetricOptions(arg0))

    public override fun newConnectionCount(): Metric =
        unwrap(this).newConnectionCount().let(Metric::wrap)

    public override fun newConnectionCount(arg0: MetricOptions): Metric =
        unwrap(this).newConnectionCount(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28b664629d8b7698209c63dc1a10d10d8fa9e4d5e6e924ab8b07a75a7b957dc6")
    public override fun newConnectionCount(arg0: MetricOptions.Builder.() -> Unit): Metric =
        newConnectionCount(MetricOptions(arg0))

    public override fun processedBytes(): Metric = unwrap(this).processedBytes().let(Metric::wrap)

    public override fun processedBytes(arg0: MetricOptions): Metric =
        unwrap(this).processedBytes(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0834009453def8be68d52ce6251707f95f5284610a225d554c4471bca1f54d3b")
    public override fun processedBytes(arg0: MetricOptions.Builder.() -> Unit): Metric =
        processedBytes(MetricOptions(arg0))

    public override fun rejectedConnectionCount(): Metric =
        unwrap(this).rejectedConnectionCount().let(Metric::wrap)

    public override fun rejectedConnectionCount(arg0: MetricOptions): Metric =
        unwrap(this).rejectedConnectionCount(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e7f89679f2c45631ab488d73b3b8a5e8b11f674a7f17844cce1926b6ea4f97e")
    public override fun rejectedConnectionCount(arg0: MetricOptions.Builder.() -> Unit): Metric =
        rejectedConnectionCount(MetricOptions(arg0))

    public override fun requestCount(): Metric = unwrap(this).requestCount().let(Metric::wrap)

    public override fun requestCount(arg0: MetricOptions): Metric =
        unwrap(this).requestCount(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df6a54fa6c6b3bf8b7a44de0f859f5e74b085d7ce578c6a602288988d4106e46")
    public override fun requestCount(arg0: MetricOptions.Builder.() -> Unit): Metric =
        requestCount(MetricOptions(arg0))

    public override fun ruleEvaluations(): Metric = unwrap(this).ruleEvaluations().let(Metric::wrap)

    public override fun ruleEvaluations(arg0: MetricOptions): Metric =
        unwrap(this).ruleEvaluations(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0f4a275bd9ef52684f0af49aa0046e50f74a4ca4e5d4e5fa0f484bd907daaac")
    public override fun ruleEvaluations(arg0: MetricOptions.Builder.() -> Unit): Metric =
        ruleEvaluations(MetricOptions(arg0))

    public override fun targetConnectionErrorCount(): Metric =
        unwrap(this).targetConnectionErrorCount().let(Metric::wrap)

    public override fun targetConnectionErrorCount(arg0: MetricOptions): Metric =
        unwrap(this).targetConnectionErrorCount(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ff66e9db5aa5ccafc9b54a6ff12c01de760a4cd3c0c5f48043c99cb77fa3203b")
    public override fun targetConnectionErrorCount(arg0: MetricOptions.Builder.() -> Unit): Metric =
        targetConnectionErrorCount(MetricOptions(arg0))

    public override fun targetResponseTime(): Metric =
        unwrap(this).targetResponseTime().let(Metric::wrap)

    public override fun targetResponseTime(arg0: MetricOptions): Metric =
        unwrap(this).targetResponseTime(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd42be106eb1a94ad8464621cbb797fff2f60bfbaf6069acaafdc175dcd64b7f")
    public override fun targetResponseTime(arg0: MetricOptions.Builder.() -> Unit): Metric =
        targetResponseTime(MetricOptions(arg0))

    public override fun targetTlsNegotiationErrorCount(): Metric =
        unwrap(this).targetTLSNegotiationErrorCount().let(Metric::wrap)

    public override fun targetTlsNegotiationErrorCount(arg0: MetricOptions): Metric =
        unwrap(this).targetTLSNegotiationErrorCount(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6bff36edbbe3c8f26db05b3096329ed86c89c5421a92a5ecf6d869f655103f54")
    public override fun targetTlsNegotiationErrorCount(arg0: MetricOptions.Builder.() -> Unit):
        Metric = targetTlsNegotiationErrorCount(MetricOptions(arg0))
  }

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerMetrics):
        IApplicationLoadBalancerMetrics = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IApplicationLoadBalancerMetrics):
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerMetrics =
        (wrapped as Wrapper).cdkObject
  }
}
