@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IApplicationTargetGroupMetrics {
  public fun custom(arg0: String): Metric

  public fun custom(arg0: String, arg1: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e3a7bf310cfbfe77339a32a3f576ae6834193015bd367fe25d8280f53f24860b")
  public fun custom(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric

  public fun healthyHostCount(): Metric

  public fun healthyHostCount(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("86001b538e3d7af3f82ae55f087e4d922defb3087f332d19bda9d0eca9b8461c")
  public fun healthyHostCount(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun httpCodeTarget(arg0: HttpCodeTarget): Metric

  public fun httpCodeTarget(arg0: HttpCodeTarget, arg1: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b24b5392cd4eb3171ba7964626471868514de6667c722081bcf28afba9d8f918")
  public fun httpCodeTarget(arg0: HttpCodeTarget, arg1: MetricOptions.Builder.() -> Unit): Metric

  public fun ipv6RequestCount(): Metric

  public fun ipv6RequestCount(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7c99b7ad341d61067977149bec151ac4f7bbfa5b606fd1f34d5a0f67bbdfd466")
  public fun ipv6RequestCount(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun requestCount(): Metric

  public fun requestCount(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("df6a54fa6c6b3bf8b7a44de0f859f5e74b085d7ce578c6a602288988d4106e46")
  public fun requestCount(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun requestCountPerTarget(): Metric

  public fun requestCountPerTarget(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cf92ac9d951ad9e742f4a5229fa957e5c56292b1a538cdfc7ab218a24986e6c8")
  public fun requestCountPerTarget(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun targetConnectionErrorCount(): Metric

  public fun targetConnectionErrorCount(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ff66e9db5aa5ccafc9b54a6ff12c01de760a4cd3c0c5f48043c99cb77fa3203b")
  public fun targetConnectionErrorCount(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun targetResponseTime(): Metric

  public fun targetResponseTime(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bd42be106eb1a94ad8464621cbb797fff2f60bfbaf6069acaafdc175dcd64b7f")
  public fun targetResponseTime(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun targetTlsNegotiationErrorCount(): Metric

  public fun targetTlsNegotiationErrorCount(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6bff36edbbe3c8f26db05b3096329ed86c89c5421a92a5ecf6d869f655103f54")
  public fun targetTlsNegotiationErrorCount(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun unhealthyHostCount(): Metric

  public fun unhealthyHostCount(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ba73ddc7b80468d5e7f5c25fb639e088f0f95e00b6cc146b9ac93a59bbc3eab1")
  public fun unhealthyHostCount(arg0: MetricOptions.Builder.() -> Unit): Metric

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroupMetrics,
  ) : CdkObject(cdkObject), IApplicationTargetGroupMetrics {
    override fun custom(arg0: String): Metric = unwrap(this).custom(arg0).let(Metric::wrap)

    override fun custom(arg0: String, arg1: MetricOptions): Metric = unwrap(this).custom(arg0,
        arg1.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e3a7bf310cfbfe77339a32a3f576ae6834193015bd367fe25d8280f53f24860b")
    override fun custom(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric = custom(arg0,
        MetricOptions(arg1))

    override fun healthyHostCount(): Metric = unwrap(this).healthyHostCount().let(Metric::wrap)

    override fun healthyHostCount(arg0: MetricOptions): Metric =
        unwrap(this).healthyHostCount(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("86001b538e3d7af3f82ae55f087e4d922defb3087f332d19bda9d0eca9b8461c")
    override fun healthyHostCount(arg0: MetricOptions.Builder.() -> Unit): Metric =
        healthyHostCount(MetricOptions(arg0))

    override fun httpCodeTarget(arg0: HttpCodeTarget): Metric =
        unwrap(this).httpCodeTarget(arg0.let(HttpCodeTarget::unwrap)).let(Metric::wrap)

    override fun httpCodeTarget(arg0: HttpCodeTarget, arg1: MetricOptions): Metric =
        unwrap(this).httpCodeTarget(arg0.let(HttpCodeTarget::unwrap),
        arg1.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b24b5392cd4eb3171ba7964626471868514de6667c722081bcf28afba9d8f918")
    override fun httpCodeTarget(arg0: HttpCodeTarget, arg1: MetricOptions.Builder.() -> Unit):
        Metric = httpCodeTarget(arg0, MetricOptions(arg1))

    override fun ipv6RequestCount(): Metric = unwrap(this).ipv6RequestCount().let(Metric::wrap)

    override fun ipv6RequestCount(arg0: MetricOptions): Metric =
        unwrap(this).ipv6RequestCount(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c99b7ad341d61067977149bec151ac4f7bbfa5b606fd1f34d5a0f67bbdfd466")
    override fun ipv6RequestCount(arg0: MetricOptions.Builder.() -> Unit): Metric =
        ipv6RequestCount(MetricOptions(arg0))

    override fun requestCount(): Metric = unwrap(this).requestCount().let(Metric::wrap)

    override fun requestCount(arg0: MetricOptions): Metric =
        unwrap(this).requestCount(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df6a54fa6c6b3bf8b7a44de0f859f5e74b085d7ce578c6a602288988d4106e46")
    override fun requestCount(arg0: MetricOptions.Builder.() -> Unit): Metric =
        requestCount(MetricOptions(arg0))

    override fun requestCountPerTarget(): Metric =
        unwrap(this).requestCountPerTarget().let(Metric::wrap)

    override fun requestCountPerTarget(arg0: MetricOptions): Metric =
        unwrap(this).requestCountPerTarget(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf92ac9d951ad9e742f4a5229fa957e5c56292b1a538cdfc7ab218a24986e6c8")
    override fun requestCountPerTarget(arg0: MetricOptions.Builder.() -> Unit): Metric =
        requestCountPerTarget(MetricOptions(arg0))

    override fun targetConnectionErrorCount(): Metric =
        unwrap(this).targetConnectionErrorCount().let(Metric::wrap)

    override fun targetConnectionErrorCount(arg0: MetricOptions): Metric =
        unwrap(this).targetConnectionErrorCount(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ff66e9db5aa5ccafc9b54a6ff12c01de760a4cd3c0c5f48043c99cb77fa3203b")
    override fun targetConnectionErrorCount(arg0: MetricOptions.Builder.() -> Unit): Metric =
        targetConnectionErrorCount(MetricOptions(arg0))

    override fun targetResponseTime(): Metric = unwrap(this).targetResponseTime().let(Metric::wrap)

    override fun targetResponseTime(arg0: MetricOptions): Metric =
        unwrap(this).targetResponseTime(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd42be106eb1a94ad8464621cbb797fff2f60bfbaf6069acaafdc175dcd64b7f")
    override fun targetResponseTime(arg0: MetricOptions.Builder.() -> Unit): Metric =
        targetResponseTime(MetricOptions(arg0))

    override fun targetTlsNegotiationErrorCount(): Metric =
        unwrap(this).targetTLSNegotiationErrorCount().let(Metric::wrap)

    override fun targetTlsNegotiationErrorCount(arg0: MetricOptions): Metric =
        unwrap(this).targetTLSNegotiationErrorCount(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6bff36edbbe3c8f26db05b3096329ed86c89c5421a92a5ecf6d869f655103f54")
    override fun targetTlsNegotiationErrorCount(arg0: MetricOptions.Builder.() -> Unit): Metric =
        targetTlsNegotiationErrorCount(MetricOptions(arg0))

    override fun unhealthyHostCount(): Metric = unwrap(this).unhealthyHostCount().let(Metric::wrap)

    override fun unhealthyHostCount(arg0: MetricOptions): Metric =
        unwrap(this).unhealthyHostCount(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ba73ddc7b80468d5e7f5c25fb639e088f0f95e00b6cc146b9ac93a59bbc3eab1")
    override fun unhealthyHostCount(arg0: MetricOptions.Builder.() -> Unit): Metric =
        unhealthyHostCount(MetricOptions(arg0))
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroupMetrics):
        IApplicationTargetGroupMetrics = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IApplicationTargetGroupMetrics):
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroupMetrics =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroupMetrics
  }
}
