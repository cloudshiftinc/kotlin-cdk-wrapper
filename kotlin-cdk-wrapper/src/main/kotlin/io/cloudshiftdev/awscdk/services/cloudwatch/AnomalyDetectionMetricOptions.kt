@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties needed to make an anomaly detection alarm from a metric.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * Metric metric;
 * AnomalyDetectionMetricOptions anomalyDetectionMetricOptions =
 * AnomalyDetectionMetricOptions.builder()
 * .metric(metric)
 * // the properties below are optional
 * .color("color")
 * .label("label")
 * .period(Duration.minutes(30))
 * .searchAccount("searchAccount")
 * .searchRegion("searchRegion")
 * .stdDevs(123)
 * .build();
 * ```
 */
public interface AnomalyDetectionMetricOptions : MathExpressionOptions {
  /**
   * The metric to add the alarm on.
   *
   * Metric objects can be obtained from most resources, or you can construct
   * custom Metric objects by instantiating one.
   */
  public fun metric(): IMetric

  /**
   * The number of standard deviations to use for the anomaly detection band.
   *
   * The higher the value, the wider the band.
   *
   * * Must be greater than 0. A value of 0 or negative values would not make sense in the context
   * of calculating standard deviations.
   * * There is no strict maximum value defined, as standard deviations can theoretically extend
   * infinitely. However, in practice, values beyond 5 or 6 standard deviations are rarely used, as
   * they would result in an extremely wide anomaly detection band, potentially missing significant
   * anomalies.
   *
   * Default: 2
   */
  public fun stdDevs(): Number? = unwrap(this).getStdDevs()

  /**
   * A builder for [AnomalyDetectionMetricOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param color Color for this metric when added to a Graph in a Dashboard.
     */
    public fun color(color: String)

    /**
     * @param label Label for this expression when added to a Graph in a Dashboard.
     * If this expression evaluates to more than one time series (for
     * example, through the use of `METRICS()` or `SEARCH()` expressions),
     * each time series will appear in the graph using a combination of the
     * expression label and the individual metric label. Specify the empty
     * string (`''`) to suppress the expression label and only keep the
     * metric label.
     *
     * You can use [dynamic
     * labels](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html)
     * to show summary information about the displayed time series
     * in the legend. For example, if you use:
     *
     * ```
     * [max: ${MAX}] MyMetric
     * ```
     *
     * As the metric label, the maximum value in the visible range will
     * be shown next to the time series name in the graph's legend. If the
     * math expression produces more than one time series, the maximum
     * will be shown for each individual time series produce by this
     * math expression.
     */
    public fun label(label: String)

    /**
     * @param metric The metric to add the alarm on. 
     * Metric objects can be obtained from most resources, or you can construct
     * custom Metric objects by instantiating one.
     */
    public fun metric(metric: IMetric)

    /**
     * @param period The period over which the math expression's statistics are applied.
     * This period overrides all periods in the metrics used in this
     * math expression.
     */
    public fun period(period: Duration)

    /**
     * @param searchAccount Account to evaluate search expressions within.
     * Specifying a searchAccount has no effect to the account used
     * for metrics within the expression (passed via usingMetrics).
     */
    public fun searchAccount(searchAccount: String)

    /**
     * @param searchRegion Region to evaluate search expressions within.
     * Specifying a searchRegion has no effect to the region used
     * for metrics within the expression (passed via usingMetrics).
     */
    public fun searchRegion(searchRegion: String)

    /**
     * @param stdDevs The number of standard deviations to use for the anomaly detection band.
     * The higher the value, the wider the band.
     *
     * * Must be greater than 0. A value of 0 or negative values would not make sense in the context
     * of calculating standard deviations.
     * * There is no strict maximum value defined, as standard deviations can theoretically extend
     * infinitely. However, in practice, values beyond 5 or 6 standard deviations are rarely used, as
     * they would result in an extremely wide anomaly detection band, potentially missing significant
     * anomalies.
     */
    public fun stdDevs(stdDevs: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudwatch.AnomalyDetectionMetricOptions.Builder =
        software.amazon.awscdk.services.cloudwatch.AnomalyDetectionMetricOptions.builder()

    /**
     * @param color Color for this metric when added to a Graph in a Dashboard.
     */
    override fun color(color: String) {
      cdkBuilder.color(color)
    }

    /**
     * @param label Label for this expression when added to a Graph in a Dashboard.
     * If this expression evaluates to more than one time series (for
     * example, through the use of `METRICS()` or `SEARCH()` expressions),
     * each time series will appear in the graph using a combination of the
     * expression label and the individual metric label. Specify the empty
     * string (`''`) to suppress the expression label and only keep the
     * metric label.
     *
     * You can use [dynamic
     * labels](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html)
     * to show summary information about the displayed time series
     * in the legend. For example, if you use:
     *
     * ```
     * [max: ${MAX}] MyMetric
     * ```
     *
     * As the metric label, the maximum value in the visible range will
     * be shown next to the time series name in the graph's legend. If the
     * math expression produces more than one time series, the maximum
     * will be shown for each individual time series produce by this
     * math expression.
     */
    override fun label(label: String) {
      cdkBuilder.label(label)
    }

    /**
     * @param metric The metric to add the alarm on. 
     * Metric objects can be obtained from most resources, or you can construct
     * custom Metric objects by instantiating one.
     */
    override fun metric(metric: IMetric) {
      cdkBuilder.metric(metric.let(IMetric.Companion::unwrap))
    }

    /**
     * @param period The period over which the math expression's statistics are applied.
     * This period overrides all periods in the metrics used in this
     * math expression.
     */
    override fun period(period: Duration) {
      cdkBuilder.period(period.let(Duration.Companion::unwrap))
    }

    /**
     * @param searchAccount Account to evaluate search expressions within.
     * Specifying a searchAccount has no effect to the account used
     * for metrics within the expression (passed via usingMetrics).
     */
    override fun searchAccount(searchAccount: String) {
      cdkBuilder.searchAccount(searchAccount)
    }

    /**
     * @param searchRegion Region to evaluate search expressions within.
     * Specifying a searchRegion has no effect to the region used
     * for metrics within the expression (passed via usingMetrics).
     */
    override fun searchRegion(searchRegion: String) {
      cdkBuilder.searchRegion(searchRegion)
    }

    /**
     * @param stdDevs The number of standard deviations to use for the anomaly detection band.
     * The higher the value, the wider the band.
     *
     * * Must be greater than 0. A value of 0 or negative values would not make sense in the context
     * of calculating standard deviations.
     * * There is no strict maximum value defined, as standard deviations can theoretically extend
     * infinitely. However, in practice, values beyond 5 or 6 standard deviations are rarely used, as
     * they would result in an extremely wide anomaly detection band, potentially missing significant
     * anomalies.
     */
    override fun stdDevs(stdDevs: Number) {
      cdkBuilder.stdDevs(stdDevs)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.AnomalyDetectionMetricOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudwatch.AnomalyDetectionMetricOptions,
  ) : CdkObject(cdkObject),
      AnomalyDetectionMetricOptions {
    /**
     * Color for this metric when added to a Graph in a Dashboard.
     *
     * Default: - Automatic color
     */
    override fun color(): String? = unwrap(this).getColor()

    /**
     * Label for this expression when added to a Graph in a Dashboard.
     *
     * If this expression evaluates to more than one time series (for
     * example, through the use of `METRICS()` or `SEARCH()` expressions),
     * each time series will appear in the graph using a combination of the
     * expression label and the individual metric label. Specify the empty
     * string (`''`) to suppress the expression label and only keep the
     * metric label.
     *
     * You can use [dynamic
     * labels](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html)
     * to show summary information about the displayed time series
     * in the legend. For example, if you use:
     *
     * ```
     * [max: ${MAX}] MyMetric
     * ```
     *
     * As the metric label, the maximum value in the visible range will
     * be shown next to the time series name in the graph's legend. If the
     * math expression produces more than one time series, the maximum
     * will be shown for each individual time series produce by this
     * math expression.
     *
     * Default: - Expression value is used as label
     */
    override fun label(): String? = unwrap(this).getLabel()

    /**
     * The metric to add the alarm on.
     *
     * Metric objects can be obtained from most resources, or you can construct
     * custom Metric objects by instantiating one.
     */
    override fun metric(): IMetric = unwrap(this).getMetric().let(IMetric::wrap)

    /**
     * The period over which the math expression's statistics are applied.
     *
     * This period overrides all periods in the metrics used in this
     * math expression.
     *
     * Default: Duration.minutes(5)
     */
    override fun period(): Duration? = unwrap(this).getPeriod()?.let(Duration::wrap)

    /**
     * Account to evaluate search expressions within.
     *
     * Specifying a searchAccount has no effect to the account used
     * for metrics within the expression (passed via usingMetrics).
     *
     * Default: - Deployment account.
     */
    override fun searchAccount(): String? = unwrap(this).getSearchAccount()

    /**
     * Region to evaluate search expressions within.
     *
     * Specifying a searchRegion has no effect to the region used
     * for metrics within the expression (passed via usingMetrics).
     *
     * Default: - Deployment region.
     */
    override fun searchRegion(): String? = unwrap(this).getSearchRegion()

    /**
     * The number of standard deviations to use for the anomaly detection band.
     *
     * The higher the value, the wider the band.
     *
     * * Must be greater than 0. A value of 0 or negative values would not make sense in the context
     * of calculating standard deviations.
     * * There is no strict maximum value defined, as standard deviations can theoretically extend
     * infinitely. However, in practice, values beyond 5 or 6 standard deviations are rarely used, as
     * they would result in an extremely wide anomaly detection band, potentially missing significant
     * anomalies.
     *
     * Default: 2
     */
    override fun stdDevs(): Number? = unwrap(this).getStdDevs()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AnomalyDetectionMetricOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.AnomalyDetectionMetricOptions):
        AnomalyDetectionMetricOptions = CdkObjectWrappers.wrap(cdkObject) as?
        AnomalyDetectionMetricOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AnomalyDetectionMetricOptions):
        software.amazon.awscdk.services.cloudwatch.AnomalyDetectionMetricOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudwatch.AnomalyDetectionMetricOptions
  }
}
