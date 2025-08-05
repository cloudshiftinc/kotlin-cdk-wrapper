@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.awscdk.services.cloudwatch.Unit as CloudwatchUnit
import kotlin.Unit as KotlinUnit

/**
 * Options for configuring metrics that considers multiple operations.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * import io.cloudshiftdev.awscdk.services.dynamodb.*;
 * OperationsMetricOptions operationsMetricOptions = OperationsMetricOptions.builder()
 * .account("account")
 * .color("color")
 * .dimensionsMap(Map.of(
 * "dimensionsMapKey", "dimensionsMap"))
 * .id("id")
 * .label("label")
 * .operations(List.of(Operation.GET_ITEM))
 * .period(Duration.minutes(30))
 * .region("region")
 * .stackAccount("stackAccount")
 * .stackRegion("stackRegion")
 * .statistic("statistic")
 * .unit(Unit.SECONDS)
 * .visible(false)
 * .build();
 * ```
 */
public interface OperationsMetricOptions : SystemErrorsForOperationsMetricOptions {
  /**
   * A builder for [OperationsMetricOptions]
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
     * @param id Unique identifier for this metric when used in dashboard widgets.
     * The id can be used as a variable to represent this metric in math expressions.
     * Valid characters are letters, numbers, and underscore. The first character
     * must be a lowercase letter.
     */
    public fun id(id: String)

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
     * @param stackAccount Account of the stack this metric is attached to.
     */
    public fun stackAccount(stackAccount: String)

    /**
     * @param stackRegion Region of the stack this metric is attached to.
     */
    public fun stackRegion(stackRegion: String)

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

    /**
     * @param visible Whether this metric should be visible in dashboard graphs.
     * Setting this to false is useful when you want to hide raw metrics
     * that are used in math expressions, and show only the expression results.
     */
    public fun visible(visible: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.OperationsMetricOptions.Builder
        = software.amazon.awscdk.services.dynamodb.OperationsMetricOptions.builder()

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
     * @param id Unique identifier for this metric when used in dashboard widgets.
     * The id can be used as a variable to represent this metric in math expressions.
     * Valid characters are letters, numbers, and underscore. The first character
     * must be a lowercase letter.
     */
    override fun id(id: String) {
      cdkBuilder.id(id)
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
      cdkBuilder.operations(operations.map(Operation.Companion::unwrap))
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
      cdkBuilder.period(period.let(Duration.Companion::unwrap))
    }

    /**
     * @param region Region which this metric comes from.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param stackAccount Account of the stack this metric is attached to.
     */
    override fun stackAccount(stackAccount: String) {
      cdkBuilder.stackAccount(stackAccount)
    }

    /**
     * @param stackRegion Region of the stack this metric is attached to.
     */
    override fun stackRegion(stackRegion: String) {
      cdkBuilder.stackRegion(stackRegion)
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
      cdkBuilder.unit(unit.let(CloudwatchUnit.Companion::unwrap))
    }

    /**
     * @param visible Whether this metric should be visible in dashboard graphs.
     * Setting this to false is useful when you want to hide raw metrics
     * that are used in math expressions, and show only the expression results.
     */
    override fun visible(visible: Boolean) {
      cdkBuilder.visible(visible)
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.OperationsMetricOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.dynamodb.OperationsMetricOptions,
  ) : CdkObject(cdkObject),
      OperationsMetricOptions {
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
     * Unique identifier for this metric when used in dashboard widgets.
     *
     * The id can be used as a variable to represent this metric in math expressions.
     * Valid characters are letters, numbers, and underscore. The first character
     * must be a lowercase letter.
     *
     * Default: - No ID
     */
    override fun id(): String? = unwrap(this).getId()

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
     * Account of the stack this metric is attached to.
     *
     * Default: - Deployment account.
     */
    override fun stackAccount(): String? = unwrap(this).getStackAccount()

    /**
     * Region of the stack this metric is attached to.
     *
     * Default: - Deployment region.
     */
    override fun stackRegion(): String? = unwrap(this).getStackRegion()

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

    /**
     * Whether this metric should be visible in dashboard graphs.
     *
     * Setting this to false is useful when you want to hide raw metrics
     * that are used in math expressions, and show only the expression results.
     *
     * Default: true
     */
    override fun visible(): Boolean? = unwrap(this).getVisible()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> KotlinUnit = {}): OperationsMetricOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.OperationsMetricOptions):
        OperationsMetricOptions = CdkObjectWrappers.wrap(cdkObject) as? OperationsMetricOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: OperationsMetricOptions):
        software.amazon.awscdk.services.dynamodb.OperationsMetricOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dynamodb.OperationsMetricOptions
  }
}
