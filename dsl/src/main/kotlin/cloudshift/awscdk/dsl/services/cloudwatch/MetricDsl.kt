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
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.cloudwatch.Unit

/**
 * A metric emitted by a service.
 *
 * The metric is a combination of a metric identifier (namespace, name and dimensions) and an
 * aggregation function (statistic, period and unit).
 *
 * It also contains metadata which is used only in graphs, such as color and label. It makes sense
 * to embed this in here, so that compound constructs can attach that metadata to metrics they
 * expose.
 *
 * This class does not represent a resource, so hence is not a construct. Instead, Metric is an
 * abstraction that makes it easy to specify metrics for use in both alarms and graphs.
 *
 * Example:
 * ```
 * Function fn;
 * Metric minuteErrorRate = fn.metricErrors(MetricOptions.builder()
 * .statistic(Stats.AVERAGE)
 * .period(Duration.minutes(1))
 * .label("Lambda failure rate")
 * .build());
 * ```
 */
@CdkDslMarker
public class MetricDsl {
    private val cdkBuilder: Metric.Builder = Metric.Builder.create()

    /**
     * Account which this metric comes from.
     *
     * Default: - Deployment account.
     *
     * @param account Account which this metric comes from.
     */
    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    /**
     * The hex color code, prefixed with '#' (e.g. '#00ff00'), to use when this metric is rendered
     * on a graph. The `Color` class has a set of standard colors that can be used here.
     *
     * Default: - Automatic color
     *
     * @param color The hex color code, prefixed with '#' (e.g. '#00ff00'), to use when this metric
     *   is rendered on a graph. The `Color` class has a set of standard colors that can be used
     *   here.
     */
    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    /**
     * Dimensions of the metric.
     *
     * Default: - No dimensions.
     *
     * @param dimensionsMap Dimensions of the metric.
     */
    public fun dimensionsMap(dimensionsMap: Map<String, String>) {
        cdkBuilder.dimensionsMap(dimensionsMap)
    }

    /**
     * Label for this metric when added to a Graph in a Dashboard.
     *
     * You can use
     * [dynamic labels](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html)
     * to show summary information about the entire displayed time series in the legend. For
     * example, if you use:
     * ```
     * [max: ${MAX}] MyMetric
     * ```
     *
     * As the metric label, the maximum value in the visible range will be shown next to the time
     * series name in the graph's legend.
     *
     * Default: - No label
     *
     * @param label Label for this metric when added to a Graph in a Dashboard.
     */
    public fun label(label: String) {
        cdkBuilder.label(label)
    }

    /**
     * Name of the metric.
     *
     * @param metricName Name of the metric.
     */
    public fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
    }

    /**
     * Namespace of the metric.
     *
     * @param namespace Namespace of the metric.
     */
    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    /**
     * The period over which the specified statistic is applied.
     *
     * Default: Duration.minutes(5)
     *
     * @param period The period over which the specified statistic is applied.
     */
    public fun period(period: Duration) {
        cdkBuilder.period(period)
    }

    /**
     * Region which this metric comes from.
     *
     * Default: - Deployment region.
     *
     * @param region Region which this metric comes from.
     */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    /**
     * What function to use for aggregating.
     *
     * Use the `aws_cloudwatch.Stats` helper class to construct valid input strings.
     *
     * Can be one of the following:
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
     *
     * @param statistic What function to use for aggregating.
     */
    public fun statistic(statistic: String) {
        cdkBuilder.statistic(statistic)
    }

    /**
     * Unit used to filter the metric stream.
     *
     * Only refer to datums emitted to the metric stream with the given unit and ignore all others.
     * Only useful when datums are being emitted to the same metric stream under different units.
     *
     * The default is to use all matric datums in the stream, regardless of unit, which is
     * recommended in nearly all cases.
     *
     * CloudWatch does not honor this property for graphs.
     *
     * Default: - All metric datums in the given metric stream
     *
     * @param unit Unit used to filter the metric stream.
     */
    public fun unit(unit: Unit) {
        cdkBuilder.unit(unit)
    }

    public fun build(): Metric = cdkBuilder.build()
}
