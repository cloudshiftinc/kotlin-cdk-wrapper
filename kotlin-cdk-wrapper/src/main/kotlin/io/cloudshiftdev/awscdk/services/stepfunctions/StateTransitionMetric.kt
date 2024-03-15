@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Metrics on the rate limiting performed on state machine execution.
 *
 * These rate limits are shared across all state machines.
 *
 * Example:
 *
 * ```
 * Alarm.Builder.create(this, "ThrottledAlarm")
 * .metric(StateTransitionMetric.metricThrottledEvents())
 * .threshold(10)
 * .evaluationPeriods(2)
 * .build();
 * ```
 */
public open class StateTransitionMetric internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.stepfunctions.StateTransitionMetric,
) : CdkObject(cdkObject) {
  public companion object {
    public fun metric(metricName: String): Metric =
        software.amazon.awscdk.services.stepfunctions.StateTransitionMetric.metric(metricName).let(Metric::wrap)

    public fun metric(metricName: String, props: MetricOptions): Metric =
        software.amazon.awscdk.services.stepfunctions.StateTransitionMetric.metric(metricName,
        props.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    public fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
        metric(metricName, MetricOptions(props))

    public fun metricConsumedCapacity(): Metric =
        software.amazon.awscdk.services.stepfunctions.StateTransitionMetric.metricConsumedCapacity().let(Metric::wrap)

    public fun metricConsumedCapacity(props: MetricOptions): Metric =
        software.amazon.awscdk.services.stepfunctions.StateTransitionMetric.metricConsumedCapacity(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a24b0a1e90d6383c997fbcc91c6d768b82e55f29a8b958f852f38de84668a803")
    public fun metricConsumedCapacity(props: MetricOptions.Builder.() -> Unit): Metric =
        metricConsumedCapacity(MetricOptions(props))

    public fun metricProvisionedBucketSize(): Metric =
        software.amazon.awscdk.services.stepfunctions.StateTransitionMetric.metricProvisionedBucketSize().let(Metric::wrap)

    public fun metricProvisionedBucketSize(props: MetricOptions): Metric =
        software.amazon.awscdk.services.stepfunctions.StateTransitionMetric.metricProvisionedBucketSize(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5cf77589ea092cd6affcb5f58c9461bc0a8960cc7a2c47bad5397852bd5b154b")
    public fun metricProvisionedBucketSize(props: MetricOptions.Builder.() -> Unit): Metric =
        metricProvisionedBucketSize(MetricOptions(props))

    public fun metricProvisionedRefillRate(): Metric =
        software.amazon.awscdk.services.stepfunctions.StateTransitionMetric.metricProvisionedRefillRate().let(Metric::wrap)

    public fun metricProvisionedRefillRate(props: MetricOptions): Metric =
        software.amazon.awscdk.services.stepfunctions.StateTransitionMetric.metricProvisionedRefillRate(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ed127511213c6c3de46a18992a2b191c66c096631d5668dc770856ded83e615")
    public fun metricProvisionedRefillRate(props: MetricOptions.Builder.() -> Unit): Metric =
        metricProvisionedRefillRate(MetricOptions(props))

    public fun metricThrottledEvents(): Metric =
        software.amazon.awscdk.services.stepfunctions.StateTransitionMetric.metricThrottledEvents().let(Metric::wrap)

    public fun metricThrottledEvents(props: MetricOptions): Metric =
        software.amazon.awscdk.services.stepfunctions.StateTransitionMetric.metricThrottledEvents(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5fa6a79f5f7330212dfd53424b8e73b9b873dcb5eb4ef176f5a1c996a8fd1822")
    public fun metricThrottledEvents(props: MetricOptions.Builder.() -> Unit): Metric =
        metricThrottledEvents(MetricOptions(props))

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.StateTransitionMetric):
        StateTransitionMetric = StateTransitionMetric(cdkObject)

    internal fun unwrap(wrapped: StateTransitionMetric):
        software.amazon.awscdk.services.stepfunctions.StateTransitionMetric = wrapped.cdkObject
  }
}
