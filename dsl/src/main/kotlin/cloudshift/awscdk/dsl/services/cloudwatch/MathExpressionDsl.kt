@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudwatch.IMetric
import software.amazon.awscdk.services.cloudwatch.MathExpression

/**
 * A math expression built with metric(s) emitted by a service.
 *
 * The math expression is a combination of an expression (x+y) and metrics to apply expression on.
 * It also contains metadata which is used only in graphs, such as color and label.
 * It makes sense to embed this in here, so that compound constructs can attach
 * that metadata to metrics they expose.
 *
 * MathExpression can also be used for search expressions. In this case,
 * it also optionally accepts a searchRegion and searchAccount property for cross-environment
 * search expressions.
 *
 * This class does not represent a resource, so hence is not a construct. Instead,
 * MathExpression is an abstraction that makes it easy to specify metrics for use in both
 * alarms and graphs.
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
@CdkDslMarker
public class MathExpressionDsl {
  private val cdkBuilder: MathExpression.Builder = MathExpression.Builder.create()

  /**
   * Color for this metric when added to a Graph in a Dashboard.
   *
   * Default: - Automatic color
   *
   * @param color Color for this metric when added to a Graph in a Dashboard. 
   */
  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  /**
   * The expression defining the metric.
   *
   * When an expression contains a SEARCH function, it cannot be used
   * within an Alarm.
   *
   * @param expression The expression defining the metric. 
   */
  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

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
   *
   * @param label Label for this expression when added to a Graph in a Dashboard. 
   */
  public fun label(label: String) {
    cdkBuilder.label(label)
  }

  /**
   * The period over which the expression's statistics are applied.
   *
   * This period overrides all periods in the metrics used in this
   * math expression.
   *
   * Default: Duration.minutes(5)
   *
   * @param period The period over which the expression's statistics are applied. 
   */
  public fun period(period: Duration) {
    cdkBuilder.period(period)
  }

  /**
   * Account to evaluate search expressions within.
   *
   * Specifying a searchAccount has no effect to the account used
   * for metrics within the expression (passed via usingMetrics).
   *
   * Default: - Deployment account.
   *
   * @param searchAccount Account to evaluate search expressions within. 
   */
  public fun searchAccount(searchAccount: String) {
    cdkBuilder.searchAccount(searchAccount)
  }

  /**
   * Region to evaluate search expressions within.
   *
   * Specifying a searchRegion has no effect to the region used
   * for metrics within the expression (passed via usingMetrics).
   *
   * Default: - Deployment region.
   *
   * @param searchRegion Region to evaluate search expressions within. 
   */
  public fun searchRegion(searchRegion: String) {
    cdkBuilder.searchRegion(searchRegion)
  }

  /**
   * The metrics used in the expression, in a map.
   *
   * The key is the identifier that represents the given metric in the
   * expression, and the value is the actual Metric object.
   *
   * Default: - Empty map.
   *
   * @param usingMetrics The metrics used in the expression, in a map. 
   */
  public fun usingMetrics(usingMetrics: Map<String, IMetric>) {
    cdkBuilder.usingMetrics(usingMetrics)
  }

  public fun build(): MathExpression = cdkBuilder.build()
}
