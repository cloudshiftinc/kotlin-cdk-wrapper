package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface INetworkTargetGroupMetrics {
  public fun custom(arg0: String): Metric

  public fun custom(arg0: String, arg1: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e3a7bf310cfbfe77339a32a3f576ae6834193015bd367fe25d8280f53f24860b")
  public fun custom(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric

  public fun healthyHostCount(): Metric

  public fun healthyHostCount(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("86001b538e3d7af3f82ae55f087e4d922defb3087f332d19bda9d0eca9b8461c")
  public fun healthyHostCount(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun unHealthyHostCount(): Metric

  public fun unHealthyHostCount(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("18773188c6bc1c1f2a98c9e673b30d76254c9d1f8e6cbdbe47b05dbffe2faf6e")
  public fun unHealthyHostCount(arg0: MetricOptions.Builder.() -> Unit): Metric

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroupMetrics,
  ) : INetworkTargetGroupMetrics {
    override fun custom(arg0: String): Metric = unwrap(this).custom(arg0).let(Metric::wrap)

    override fun custom(arg0: String, arg1: MetricOptions): Metric = unwrap(this).custom(arg0,
        arg1.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e3a7bf310cfbfe77339a32a3f576ae6834193015bd367fe25d8280f53f24860b")
    override fun custom(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric = custom(arg0,
        MetricOptions(arg1))

    override fun healthyHostCount(): Metric = unwrap(this).healthyHostCount().let(Metric::wrap)

    override fun healthyHostCount(arg0: MetricOptions): Metric =
        unwrap(this).healthyHostCount(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("86001b538e3d7af3f82ae55f087e4d922defb3087f332d19bda9d0eca9b8461c")
    override fun healthyHostCount(arg0: MetricOptions.Builder.() -> Unit): Metric =
        healthyHostCount(MetricOptions(arg0))

    override fun unHealthyHostCount(): Metric = unwrap(this).unHealthyHostCount().let(Metric::wrap)

    override fun unHealthyHostCount(arg0: MetricOptions): Metric =
        unwrap(this).unHealthyHostCount(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18773188c6bc1c1f2a98c9e673b30d76254c9d1f8e6cbdbe47b05dbffe2faf6e")
    override fun unHealthyHostCount(arg0: MetricOptions.Builder.() -> Unit): Metric =
        unHealthyHostCount(MetricOptions(arg0))
  }

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroupMetrics):
        INetworkTargetGroupMetrics = Wrapper(cdkObject)

    internal fun unwrap(wrapped: INetworkTargetGroupMetrics):
        software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroupMetrics = (wrapped
        as Wrapper).cdkObject
  }
}
