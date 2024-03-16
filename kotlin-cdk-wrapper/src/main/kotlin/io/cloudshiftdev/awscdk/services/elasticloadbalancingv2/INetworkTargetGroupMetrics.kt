@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Contains all metrics for a Target Group of a Network Load Balancer.
 */
public interface INetworkTargetGroupMetrics {
  /**
   * Return the given named metric for this Network Target Group.
   *
   * Default: Average over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  public fun custom(metricName: String): Metric

  /**
   * Return the given named metric for this Network Target Group.
   *
   * Default: Average over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  public fun custom(metricName: String, props: MetricOptions): Metric

  /**
   * Return the given named metric for this Network Target Group.
   *
   * Default: Average over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e3a7bf310cfbfe77339a32a3f576ae6834193015bd367fe25d8280f53f24860b")
  public fun custom(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of targets that are considered healthy.
   *
   * Default: Average over 5 minutes
   *
   * @param props
   */
  public fun healthyHostCount(): Metric

  /**
   * The number of targets that are considered healthy.
   *
   * Default: Average over 5 minutes
   *
   * @param props
   */
  public fun healthyHostCount(props: MetricOptions): Metric

  /**
   * The number of targets that are considered healthy.
   *
   * Default: Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("86001b538e3d7af3f82ae55f087e4d922defb3087f332d19bda9d0eca9b8461c")
  public fun healthyHostCount(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of targets that are considered unhealthy.
   *
   * Default: Average over 5 minutes
   *
   * @param props
   */
  public fun unHealthyHostCount(): Metric

  /**
   * The number of targets that are considered unhealthy.
   *
   * Default: Average over 5 minutes
   *
   * @param props
   */
  public fun unHealthyHostCount(props: MetricOptions): Metric

  /**
   * The number of targets that are considered unhealthy.
   *
   * Default: Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("18773188c6bc1c1f2a98c9e673b30d76254c9d1f8e6cbdbe47b05dbffe2faf6e")
  public fun unHealthyHostCount(props: MetricOptions.Builder.() -> Unit): Metric

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroupMetrics):
        INetworkTargetGroupMetrics = CdkObjectWrappers.wrap(cdkObject) as INetworkTargetGroupMetrics

    internal fun unwrap(wrapped: INetworkTargetGroupMetrics):
        software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroupMetrics = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroupMetrics
  }
}
