package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface INetworkLoadBalancerMetrics {
  public fun activeFlowCount(): Metric

  public fun activeFlowCount(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("df365ed7bc5bb1494f98541bca9886f91f4b2f9cd495cbd4467cb842596d6dc9")
  public fun activeFlowCount(arg0: MetricOptions.Builder.() -> Unit): Metric

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

  public fun newFlowCount(): Metric

  public fun newFlowCount(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9ff04603e17644e75cf1646a7029b51c1fa41808e56215c629f056760e352bad")
  public fun newFlowCount(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun processedBytes(): Metric

  public fun processedBytes(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0834009453def8be68d52ce6251707f95f5284610a225d554c4471bca1f54d3b")
  public fun processedBytes(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun tcpClientResetCount(): Metric

  public fun tcpClientResetCount(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("45c8943b67a2585f45f923161100699260880bcd39738a9d5d24f6d8f24821e6")
  public fun tcpClientResetCount(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun tcpElbResetCount(): Metric

  public fun tcpElbResetCount(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c5f8cbc5fd289799693a66e35c1763ed4e441e12f73d926e2dfe5e15ccb983b9")
  public fun tcpElbResetCount(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun tcpTargetResetCount(): Metric

  public fun tcpTargetResetCount(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f54be02520e4435b9ab84a7d81541dc666e12059b56d7e98c38f8e427fc3c8e3")
  public fun tcpTargetResetCount(arg0: MetricOptions.Builder.() -> Unit): Metric

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerMetrics,
  ) : INetworkLoadBalancerMetrics {
    override fun activeFlowCount(): Metric = unwrap(this).activeFlowCount().let(Metric::wrap)

    override fun activeFlowCount(arg0: MetricOptions): Metric =
        unwrap(this).activeFlowCount(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df365ed7bc5bb1494f98541bca9886f91f4b2f9cd495cbd4467cb842596d6dc9")
    override fun activeFlowCount(arg0: MetricOptions.Builder.() -> Unit): Metric =
        activeFlowCount(MetricOptions(arg0))

    override fun consumedLcUs(): Metric = unwrap(this).consumedLCUs().let(Metric::wrap)

    override fun consumedLcUs(arg0: MetricOptions): Metric =
        unwrap(this).consumedLCUs(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18e8e39bc441acca7c83d0b93ee82feb5719d75ccb2df798d695dbe35e061cf0")
    override fun consumedLcUs(arg0: MetricOptions.Builder.() -> Unit): Metric =
        consumedLcUs(MetricOptions(arg0))

    override fun custom(arg0: String): Metric = unwrap(this).custom(arg0).let(Metric::wrap)

    override fun custom(arg0: String, arg1: MetricOptions): Metric = unwrap(this).custom(arg0,
        arg1.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e3a7bf310cfbfe77339a32a3f576ae6834193015bd367fe25d8280f53f24860b")
    override fun custom(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric = custom(arg0,
        MetricOptions(arg1))

    override fun newFlowCount(): Metric = unwrap(this).newFlowCount().let(Metric::wrap)

    override fun newFlowCount(arg0: MetricOptions): Metric =
        unwrap(this).newFlowCount(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ff04603e17644e75cf1646a7029b51c1fa41808e56215c629f056760e352bad")
    override fun newFlowCount(arg0: MetricOptions.Builder.() -> Unit): Metric =
        newFlowCount(MetricOptions(arg0))

    override fun processedBytes(): Metric = unwrap(this).processedBytes().let(Metric::wrap)

    override fun processedBytes(arg0: MetricOptions): Metric =
        unwrap(this).processedBytes(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0834009453def8be68d52ce6251707f95f5284610a225d554c4471bca1f54d3b")
    override fun processedBytes(arg0: MetricOptions.Builder.() -> Unit): Metric =
        processedBytes(MetricOptions(arg0))

    override fun tcpClientResetCount(): Metric =
        unwrap(this).tcpClientResetCount().let(Metric::wrap)

    override fun tcpClientResetCount(arg0: MetricOptions): Metric =
        unwrap(this).tcpClientResetCount(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45c8943b67a2585f45f923161100699260880bcd39738a9d5d24f6d8f24821e6")
    override fun tcpClientResetCount(arg0: MetricOptions.Builder.() -> Unit): Metric =
        tcpClientResetCount(MetricOptions(arg0))

    override fun tcpElbResetCount(): Metric = unwrap(this).tcpElbResetCount().let(Metric::wrap)

    override fun tcpElbResetCount(arg0: MetricOptions): Metric =
        unwrap(this).tcpElbResetCount(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5f8cbc5fd289799693a66e35c1763ed4e441e12f73d926e2dfe5e15ccb983b9")
    override fun tcpElbResetCount(arg0: MetricOptions.Builder.() -> Unit): Metric =
        tcpElbResetCount(MetricOptions(arg0))

    override fun tcpTargetResetCount(): Metric =
        unwrap(this).tcpTargetResetCount().let(Metric::wrap)

    override fun tcpTargetResetCount(arg0: MetricOptions): Metric =
        unwrap(this).tcpTargetResetCount(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f54be02520e4435b9ab84a7d81541dc666e12059b56d7e98c38f8e427fc3c8e3")
    override fun tcpTargetResetCount(arg0: MetricOptions.Builder.() -> Unit): Metric =
        tcpTargetResetCount(MetricOptions(arg0))
  }

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerMetrics):
        INetworkLoadBalancerMetrics = Wrapper(cdkObject)

    internal fun unwrap(wrapped: INetworkLoadBalancerMetrics):
        software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerMetrics =
        (wrapped as Wrapper).cdkObject
  }
}
