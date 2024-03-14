package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.awscdk.services.cloudwatch.Unit as CloudwatchUnit
import kotlin.Unit as KotlinUnit

public interface SystemErrorsForOperationsMetricOptions : MetricOptions {
  /**
   * The operations to apply the metric to.
   *
   * Default: - All operations available by DynamoDB tables will be considered.
   */
  public fun operations(): List<Operation> = unwrap(this).getOperations()?.map(Operation::wrap) ?:
      emptyList()

  /**
   * A builder for [SystemErrorsForOperationsMetricOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param account Account which this metric comes from.
     */
    public fun account(account: String)

    /**
     * @param color The hex color code, prefixed with '#' (e.g. '#00ff00'), to use when this metric
     * is rendered on a graph. The `Color` class has a set of standard colors that can be used here.
     */
    public fun color(color: String)

    /**
     * @param dimensionsMap Dimensions of the metric.
     */
    public fun dimensionsMap(dimensionsMap: Map<String, String>)

    /**
     * @param label Label for this metric when added to a Graph in a Dashboard.
     * You can use [dynamic
     * labels](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html)
     * to show summary information about the entire displayed time series
     * in the legend. For example, if you use:
     *
     * ```
     * [max: ${MAX}] MyMetric
     * ```
     *
     * As the metric label, the maximum value in the visible range will
     * be shown next to the time series name in the graph's legend.
     */
    public fun label(label: String)

    /**
     * @param operations The operations to apply the metric to.
     */
    public fun operations(operations: List<Operation>)

    /**
     * @param operations The operations to apply the metric to.
     */
    public fun operations(vararg operations: Operation)

    /**
     * @param period The period over which the specified statistic is applied.
     */
    public fun period(period: Duration)

    /**
     * @param region Region which this metric comes from.
     */
    public fun region(region: String)

    /**
     * @param statistic What function to use for aggregating.
     * Use the `aws_cloudwatch.Stats` helper class to construct valid input strings.
     *
     * Can be one of the following:
     *
     * * "Minimum" | "min"
     * * "Maximum" | "max"
     * * "Average" | "avg"
     * * "Sum" | "sum"
     * * "SampleCount | "n"
     * * "pNN.NN"
     * * "tmNN.NN" | "tm(NN.NN%:NN.NN%)"
     * * "iqm"
     * * "wmNN.NN" | "wm(NN.NN%:NN.NN%)"
     * * "tcNN.NN" | "tc(NN.NN%:NN.NN%)"
     * * "tsNN.NN" | "ts(NN.NN%:NN.NN%)"
     */
    public fun statistic(statistic: String)

    /**
     * @param unit Unit used to filter the metric stream.
     * Only refer to datums emitted to the metric stream with the given unit and
     * ignore all others. Only useful when datums are being emitted to the same
     * metric stream under different units.
     *
     * The default is to use all matric datums in the stream, regardless of unit,
     * which is recommended in nearly all cases.
     *
     * CloudWatch does not honor this property for graphs.
     */
    public fun unit(unit: CloudwatchUnit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.dynamodb.SystemErrorsForOperationsMetricOptions.Builder =
        software.amazon.awscdk.services.dynamodb.SystemErrorsForOperationsMetricOptions.builder()

    /**
     * @param account Account which this metric comes from.
     */
    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    /**
     * @param color The hex color code, prefixed with '#' (e.g. '#00ff00'), to use when this metric
     * is rendered on a graph. The `Color` class has a set of standard colors that can be used here.
     */
    override fun color(color: String) {
      cdkBuilder.color(color)
    }

    /**
     * @param dimensionsMap Dimensions of the metric.
     */
    override fun dimensionsMap(dimensionsMap: Map<String, String>) {
      cdkBuilder.dimensionsMap(dimensionsMap)
    }

    /**
     * @param label Label for this metric when added to a Graph in a Dashboard.
     * You can use [dynamic
     * labels](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html)
     * to show summary information about the entire displayed time series
     * in the legend. For example, if you use:
     *
     * ```
     * [max: ${MAX}] MyMetric
     * ```
     *
     * As the metric label, the maximum value in the visible range will
     * be shown next to the time series name in the graph's legend.
     */
    override fun label(label: String) {
      cdkBuilder.label(label)
    }

    /**
     * @param operations The operations to apply the metric to.
     */
    override fun operations(operations: List<Operation>) {
      cdkBuilder.operations(operations.map(Operation::unwrap))
    }

    /**
     * @param operations The operations to apply the metric to.
     */
    override fun operations(vararg operations: Operation): KotlinUnit =
        operations(operations.toList())

    /**
     * @param period The period over which the specified statistic is applied.
     */
    override fun period(period: Duration) {
      cdkBuilder.period(period.let(Duration::unwrap))
    }

    /**
     * @param region Region which this metric comes from.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param statistic What function to use for aggregating.
     * Use the `aws_cloudwatch.Stats` helper class to construct valid input strings.
     *
     * Can be one of the following:
     *
     * * "Minimum" | "min"
     * * "Maximum" | "max"
     * * "Average" | "avg"
     * * "Sum" | "sum"
     * * "SampleCount | "n"
     * * "pNN.NN"
     * * "tmNN.NN" | "tm(NN.NN%:NN.NN%)"
     * * "iqm"
     * * "wmNN.NN" | "wm(NN.NN%:NN.NN%)"
     * * "tcNN.NN" | "tc(NN.NN%:NN.NN%)"
     * * "tsNN.NN" | "ts(NN.NN%:NN.NN%)"
     */
    override fun statistic(statistic: String) {
      cdkBuilder.statistic(statistic)
    }

    /**
     * @param unit Unit used to filter the metric stream.
     * Only refer to datums emitted to the metric stream with the given unit and
     * ignore all others. Only useful when datums are being emitted to the same
     * metric stream under different units.
     *
     * The default is to use all matric datums in the stream, regardless of unit,
     * which is recommended in nearly all cases.
     *
     * CloudWatch does not honor this property for graphs.
     */
    override fun unit(unit: CloudwatchUnit) {
      cdkBuilder.unit(unit.let(CloudwatchUnit::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.dynamodb.SystemErrorsForOperationsMetricOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.dynamodb.SystemErrorsForOperationsMetricOptions,
  ) : SystemErrorsForOperationsMetricOptions {
    /**
     * Account which this metric comes from.
     *
     * Default: - Deployment account.
     */
    override fun account(): String? = unwrap(this).getAccount()

    /**
     * The hex color code, prefixed with '#' (e.g. '#00ff00'), to use when this metric is rendered
     * on a graph. The `Color` class has a set of standard colors that can be used here.
     *
     * Default: - Automatic color
     */
    override fun color(): String? = unwrap(this).getColor()

    /**
     * Dimensions of the metric.
     *
     * Default: - No dimensions.
     */
    override fun dimensionsMap(): Map<String, String> = unwrap(this).getDimensionsMap() ?:
        emptyMap()

    /**
     * Label for this metric when added to a Graph in a Dashboard.
     *
     * You can use [dynamic
     * labels](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html)
     * to show summary information about the entire displayed time series
     * in the legend. For example, if you use:
     *
     * ```
     * [max: ${MAX}] MyMetric
     * ```
     *
     * As the metric label, the maximum value in the visible range will
     * be shown next to the time series name in the graph's legend.
     *
     * Default: - No label
     */
    override fun label(): String? = unwrap(this).getLabel()

    /**
     * The operations to apply the metric to.
     *
     * Default: - All operations available by DynamoDB tables will be considered.
     */
    override fun operations(): List<Operation> = unwrap(this).getOperations()?.map(Operation::wrap)
        ?: emptyList()

    /**
     * The period over which the specified statistic is applied.
     *
     * Default: Duration.minutes(5)
     */
    override fun period(): Duration? = unwrap(this).getPeriod()?.let(Duration::wrap)

    /**
     * Region which this metric comes from.
     *
     * Default: - Deployment region.
     */
    override fun region(): String? = unwrap(this).getRegion()

    /**
     * What function to use for aggregating.
     *
     * Use the `aws_cloudwatch.Stats` helper class to construct valid input strings.
     *
     * Can be one of the following:
     *
     * * "Minimum" | "min"
     * * "Maximum" | "max"
     * * "Average" | "avg"
     * * "Sum" | "sum"
     * * "SampleCount | "n"
     * * "pNN.NN"
     * * "tmNN.NN" | "tm(NN.NN%:NN.NN%)"
     * * "iqm"
     * * "wmNN.NN" | "wm(NN.NN%:NN.NN%)"
     * * "tcNN.NN" | "tc(NN.NN%:NN.NN%)"
     * * "tsNN.NN" | "ts(NN.NN%:NN.NN%)"
     *
     * Default: Average
     */
    override fun statistic(): String? = unwrap(this).getStatistic()

    /**
     * Unit used to filter the metric stream.
     *
     * Only refer to datums emitted to the metric stream with the given unit and
     * ignore all others. Only useful when datums are being emitted to the same
     * metric stream under different units.
     *
     * The default is to use all matric datums in the stream, regardless of unit,
     * which is recommended in nearly all cases.
     *
     * CloudWatch does not honor this property for graphs.
     *
     * Default: - All metric datums in the given metric stream
     */
    override fun unit(): CloudwatchUnit? = unwrap(this).getUnit()?.let(CloudwatchUnit::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> KotlinUnit = {}):
        SystemErrorsForOperationsMetricOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.SystemErrorsForOperationsMetricOptions):
        SystemErrorsForOperationsMetricOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SystemErrorsForOperationsMetricOptions):
        software.amazon.awscdk.services.dynamodb.SystemErrorsForOperationsMetricOptions = (wrapped
        as Wrapper).cdkObject
  }
}
