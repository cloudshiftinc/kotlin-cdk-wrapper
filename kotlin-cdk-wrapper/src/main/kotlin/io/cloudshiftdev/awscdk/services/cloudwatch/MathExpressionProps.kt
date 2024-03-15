@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for a MathExpression.
 *
 * Example:
 *
 * ```
 * Function fn;
 * MathExpression allProblems = MathExpression.Builder.create()
 * .expression("errors + throttles")
 * .usingMetrics(Map.of(
 * "errors", fn.metricErrors(),
 * "throttles", fn.metricThrottles()))
 * .build();
 * ```
 */
public interface MathExpressionProps : MathExpressionOptions {
  /**
   * The expression defining the metric.
   *
   * When an expression contains a SEARCH function, it cannot be used
   * within an Alarm.
   */
  public fun expression(): String

  /**
   * The metrics used in the expression, in a map.
   *
   * The key is the identifier that represents the given metric in the
   * expression, and the value is the actual Metric object.
   *
   * Default: - Empty map.
   */
  public fun usingMetrics(): Map<String, IMetric> =
      unwrap(this).getUsingMetrics()?.mapValues{IMetric.wrap(it.value)} ?: emptyMap()

  /**
   * A builder for [MathExpressionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param color Color for this metric when added to a Graph in a Dashboard.
     */
    public fun color(color: String)

    /**
     * @param expression The expression defining the metric. 
     * When an expression contains a SEARCH function, it cannot be used
     * within an Alarm.
     */
    public fun expression(expression: String)

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
     * @param period The period over which the expression's statistics are applied.
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
     * @param usingMetrics The metrics used in the expression, in a map.
     * The key is the identifier that represents the given metric in the
     * expression, and the value is the actual Metric object.
     */
    public fun usingMetrics(usingMetrics: Map<String, IMetric>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.MathExpressionProps.Builder =
        software.amazon.awscdk.services.cloudwatch.MathExpressionProps.builder()

    /**
     * @param color Color for this metric when added to a Graph in a Dashboard.
     */
    override fun color(color: String) {
      cdkBuilder.color(color)
    }

    /**
     * @param expression The expression defining the metric. 
     * When an expression contains a SEARCH function, it cannot be used
     * within an Alarm.
     */
    override fun expression(expression: String) {
      cdkBuilder.expression(expression)
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
     * @param period The period over which the expression's statistics are applied.
     * This period overrides all periods in the metrics used in this
     * math expression.
     */
    override fun period(period: Duration) {
      cdkBuilder.period(period.let(Duration::unwrap))
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
     * @param usingMetrics The metrics used in the expression, in a map.
     * The key is the identifier that represents the given metric in the
     * expression, and the value is the actual Metric object.
     */
    override fun usingMetrics(usingMetrics: Map<String, IMetric>) {
      cdkBuilder.usingMetrics(usingMetrics.mapValues{IMetric.unwrap(it.value)})
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.MathExpressionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.MathExpressionProps,
  ) : CdkObject(cdkObject), MathExpressionProps {
    /**
     * Color for this metric when added to a Graph in a Dashboard.
     *
     * Default: - Automatic color
     */
    override fun color(): String? = unwrap(this).getColor()

    /**
     * The expression defining the metric.
     *
     * When an expression contains a SEARCH function, it cannot be used
     * within an Alarm.
     */
    override fun expression(): String = unwrap(this).getExpression()

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
     * The period over which the expression's statistics are applied.
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
     * The metrics used in the expression, in a map.
     *
     * The key is the identifier that represents the given metric in the
     * expression, and the value is the actual Metric object.
     *
     * Default: - Empty map.
     */
    override fun usingMetrics(): Map<String, IMetric> =
        unwrap(this).getUsingMetrics()?.mapValues{IMetric.wrap(it.value)} ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MathExpressionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.MathExpressionProps):
        MathExpressionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MathExpressionProps):
        software.amazon.awscdk.services.cloudwatch.MathExpressionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.MathExpressionProps
  }
}
