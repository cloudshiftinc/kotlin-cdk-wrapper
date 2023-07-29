@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudwatch.IMetric
import software.amazon.awscdk.services.cloudwatch.MathExpressionProps

/**
 * Properties for a MathExpression.
 *
 * Example:
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
public class MathExpressionPropsDsl {
    private val cdkBuilder: MathExpressionProps.Builder = MathExpressionProps.builder()

    /** @param color Color for this metric when added to a Graph in a Dashboard. */
    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    /**
     * @param expression The expression defining the metric. When an expression contains a SEARCH
     *   function, it cannot be used within an Alarm.
     */
    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    /**
     * @param label Label for this expression when added to a Graph in a Dashboard. If this
     *   expression evaluates to more than one time series (for example, through the use of
     *   `METRICS()` or `SEARCH()` expressions), each time series will appear in the graph using a
     *   combination of the expression label and the individual metric label. Specify the empty
     *   string (`''`) to suppress the expression label and only keep the metric label.
     *
     * You can use
     * [dynamic labels](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html)
     * to show summary information about the displayed time series in the legend. For example, if
     * you use:
     * ```
     * [max: ${MAX}] MyMetric
     * ```
     *
     * As the metric label, the maximum value in the visible range will be shown next to the time
     * series name in the graph's legend. If the math expression produces more than one time series,
     * the maximum will be shown for each individual time series produce by this math expression.
     */
    public fun label(label: String) {
        cdkBuilder.label(label)
    }

    /**
     * @param period The period over which the expression's statistics are applied. This period
     *   overrides all periods in the metrics used in this math expression.
     */
    public fun period(period: Duration) {
        cdkBuilder.period(period)
    }

    /**
     * @param searchAccount Account to evaluate search expressions within. Specifying a
     *   searchAccount has no effect to the account used for metrics within the expression (passed
     *   via usingMetrics).
     */
    public fun searchAccount(searchAccount: String) {
        cdkBuilder.searchAccount(searchAccount)
    }

    /**
     * @param searchRegion Region to evaluate search expressions within. Specifying a searchRegion
     *   has no effect to the region used for metrics within the expression (passed via
     *   usingMetrics).
     */
    public fun searchRegion(searchRegion: String) {
        cdkBuilder.searchRegion(searchRegion)
    }

    /**
     * @param usingMetrics The metrics used in the expression, in a map. The key is the identifier
     *   that represents the given metric in the expression, and the value is the actual Metric
     *   object.
     */
    public fun usingMetrics(usingMetrics: Map<String, IMetric>) {
        cdkBuilder.usingMetrics(usingMetrics)
    }

    public fun build(): MathExpressionProps = cdkBuilder.build()
}
