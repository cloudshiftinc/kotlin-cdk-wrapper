@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for a SearchExpression.
 *
 * Example:
 *
 * ```
 * SearchExpression cpuUtilization = SearchExpression.Builder.create()
 * .expression("SEARCH('{AWS/EC2,InstanceId} MetricName=\"CPUUtilization\"', 'Average', 900)")
 * .label("EC2 CPU Utilization")
 * .color("#ff7f0e")
 * .build();
 * ```
 */
public interface SearchExpressionProps : SearchExpressionOptions {
  /**
   * The search expression defining the metrics to be retrieved.
   *
   * A search expression cannot be used within an Alarm.
   *
   * A search expression allows you to retrieve and graph multiple related metrics in a single
   * statement.
   * It can return up to 500 time series.
   *
   * Examples:
   *
   * * `SEARCH('{AWS/EC2,InstanceId} CPUUtilization', 'Average', 300)`
   * * `SEARCH('{AWS/ApplicationELB,LoadBalancer} RequestCount', 'Sum', 60)`
   * * `SEARCH('{MyNamespace,ServiceName} Errors', 'Sum')`
   *
   * For more information about search expression syntax, see:
   * https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/search-expression-syntax.html
   */
  public fun expression(): String

  /**
   * A builder for [SearchExpressionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param color Color for the metric produced by the search expression.
     * If the search expression produces more than one time series, the color is assigned to the
     * first one.
     * Other metrics are assigned colors automatically.
     */
    public fun color(color: String)

    /**
     * @param expression The search expression defining the metrics to be retrieved. 
     * A search expression cannot be used within an Alarm.
     *
     * A search expression allows you to retrieve and graph multiple related metrics in a single
     * statement.
     * It can return up to 500 time series.
     *
     * Examples:
     *
     * * `SEARCH('{AWS/EC2,InstanceId} CPUUtilization', 'Average', 300)`
     * * `SEARCH('{AWS/ApplicationELB,LoadBalancer} RequestCount', 'Sum', 60)`
     * * `SEARCH('{MyNamespace,ServiceName} Errors', 'Sum')`
     *
     * For more information about search expression syntax, see:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/search-expression-syntax.html
     */
    public fun expression(expression: String)

    /**
     * @param label Label for this search expression when added to a Graph in a Dashboard.
     * If this expression evaluates to more than one time series,
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
     * search expression produces more than one time series, the maximum
     * will be shown for each individual time series produce by this
     * search expression.
     */
    public fun label(label: String)

    /**
     * @param period The period over which the search expression's statistics are applied.
     * This period overrides the period defined within the search expression.
     */
    public fun period(period: Duration)

    /**
     * @param searchAccount Account to evaluate search expressions within.
     */
    public fun searchAccount(searchAccount: String)

    /**
     * @param searchRegion Region to evaluate search expressions within.
     */
    public fun searchRegion(searchRegion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.SearchExpressionProps.Builder
        = software.amazon.awscdk.services.cloudwatch.SearchExpressionProps.builder()

    /**
     * @param color Color for the metric produced by the search expression.
     * If the search expression produces more than one time series, the color is assigned to the
     * first one.
     * Other metrics are assigned colors automatically.
     */
    override fun color(color: String) {
      cdkBuilder.color(color)
    }

    /**
     * @param expression The search expression defining the metrics to be retrieved. 
     * A search expression cannot be used within an Alarm.
     *
     * A search expression allows you to retrieve and graph multiple related metrics in a single
     * statement.
     * It can return up to 500 time series.
     *
     * Examples:
     *
     * * `SEARCH('{AWS/EC2,InstanceId} CPUUtilization', 'Average', 300)`
     * * `SEARCH('{AWS/ApplicationELB,LoadBalancer} RequestCount', 'Sum', 60)`
     * * `SEARCH('{MyNamespace,ServiceName} Errors', 'Sum')`
     *
     * For more information about search expression syntax, see:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/search-expression-syntax.html
     */
    override fun expression(expression: String) {
      cdkBuilder.expression(expression)
    }

    /**
     * @param label Label for this search expression when added to a Graph in a Dashboard.
     * If this expression evaluates to more than one time series,
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
     * search expression produces more than one time series, the maximum
     * will be shown for each individual time series produce by this
     * search expression.
     */
    override fun label(label: String) {
      cdkBuilder.label(label)
    }

    /**
     * @param period The period over which the search expression's statistics are applied.
     * This period overrides the period defined within the search expression.
     */
    override fun period(period: Duration) {
      cdkBuilder.period(period.let(Duration.Companion::unwrap))
    }

    /**
     * @param searchAccount Account to evaluate search expressions within.
     */
    override fun searchAccount(searchAccount: String) {
      cdkBuilder.searchAccount(searchAccount)
    }

    /**
     * @param searchRegion Region to evaluate search expressions within.
     */
    override fun searchRegion(searchRegion: String) {
      cdkBuilder.searchRegion(searchRegion)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.SearchExpressionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudwatch.SearchExpressionProps,
  ) : CdkObject(cdkObject),
      SearchExpressionProps {
    /**
     * Color for the metric produced by the search expression.
     *
     * If the search expression produces more than one time series, the color is assigned to the
     * first one.
     * Other metrics are assigned colors automatically.
     *
     * Default: - Automatically assigned.
     */
    override fun color(): String? = unwrap(this).getColor()

    /**
     * The search expression defining the metrics to be retrieved.
     *
     * A search expression cannot be used within an Alarm.
     *
     * A search expression allows you to retrieve and graph multiple related metrics in a single
     * statement.
     * It can return up to 500 time series.
     *
     * Examples:
     *
     * * `SEARCH('{AWS/EC2,InstanceId} CPUUtilization', 'Average', 300)`
     * * `SEARCH('{AWS/ApplicationELB,LoadBalancer} RequestCount', 'Sum', 60)`
     * * `SEARCH('{MyNamespace,ServiceName} Errors', 'Sum')`
     *
     * For more information about search expression syntax, see:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/search-expression-syntax.html
     */
    override fun expression(): String = unwrap(this).getExpression()

    /**
     * Label for this search expression when added to a Graph in a Dashboard.
     *
     * If this expression evaluates to more than one time series,
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
     * search expression produces more than one time series, the maximum
     * will be shown for each individual time series produce by this
     * search expression.
     *
     * Default: - No label.
     */
    override fun label(): String? = unwrap(this).getLabel()

    /**
     * The period over which the search expression's statistics are applied.
     *
     * This period overrides the period defined within the search expression.
     *
     * Default: Duration.minutes(5)
     */
    override fun period(): Duration? = unwrap(this).getPeriod()?.let(Duration::wrap)

    /**
     * Account to evaluate search expressions within.
     *
     * Default: - Deployment account.
     */
    override fun searchAccount(): String? = unwrap(this).getSearchAccount()

    /**
     * Region to evaluate search expressions within.
     *
     * Default: - Deployment region.
     */
    override fun searchRegion(): String? = unwrap(this).getSearchRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SearchExpressionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.SearchExpressionProps):
        SearchExpressionProps = CdkObjectWrappers.wrap(cdkObject) as? SearchExpressionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SearchExpressionProps):
        software.amazon.awscdk.services.cloudwatch.SearchExpressionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.SearchExpressionProps
  }
}
