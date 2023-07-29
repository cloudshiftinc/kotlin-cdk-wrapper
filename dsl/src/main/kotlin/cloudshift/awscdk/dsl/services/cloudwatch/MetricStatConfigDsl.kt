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
import kotlin.Unit as KotlinUnit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudwatch.Dimension
import software.amazon.awscdk.services.cloudwatch.MetricStatConfig
import software.amazon.awscdk.services.cloudwatch.Unit as CloudwatchUnit

/**
 * Properties for a concrete metric.
 *
 * NOTE: `unit` is no longer on this object since it is only used for `Alarms`, and doesn't mean
 * what one would expect it to mean there anyway. It is most likely to be misused.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.cloudwatch.*;
 * Object value;
 * MetricStatConfig metricStatConfig = MetricStatConfig.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * .period(Duration.minutes(30))
 * .statistic("statistic")
 * // the properties below are optional
 * .account("account")
 * .dimensions(List.of(Dimension.builder()
 * .name("name")
 * .value(value)
 * .build()))
 * .region("region")
 * .unitFilter(Unit.SECONDS)
 * .build();
 * ```
 */
@CdkDslMarker
public class MetricStatConfigDsl {
    private val cdkBuilder: MetricStatConfig.Builder = MetricStatConfig.builder()

    private val _dimensions: MutableList<Dimension> = mutableListOf()

    /** @param account Account which this metric comes from. */
    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    /** @param dimensions The dimensions to apply to the alarm. */
    public fun dimensions(dimensions: DimensionDsl.() -> KotlinUnit) {
        _dimensions.add(DimensionDsl().apply(dimensions).build())
    }

    /** @param dimensions The dimensions to apply to the alarm. */
    public fun dimensions(dimensions: Collection<Dimension>) {
        _dimensions.addAll(dimensions)
    }

    /** @param metricName Name of the metric. */
    public fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
    }

    /** @param namespace Namespace of the metric. */
    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    /** @param period How many seconds to aggregate over. */
    public fun period(period: Duration) {
        cdkBuilder.period(period)
    }

    /** @param region Region which this metric comes from. */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    /** @param statistic Aggregation function to use (can be either simple or a percentile). */
    public fun statistic(statistic: String) {
        cdkBuilder.statistic(statistic)
    }

    /**
     * @param unitFilter Unit used to filter the metric stream. Only refer to datums emitted to the
     *   metric stream with the given unit and ignore all others. Only useful when datums are being
     *   emitted to the same metric stream under different units.
     *
     * This field has been renamed from plain `unit` to clearly communicate its purpose.
     */
    public fun unitFilter(unitFilter: CloudwatchUnit) {
        cdkBuilder.unitFilter(unitFilter)
    }

    public fun build(): MetricStatConfig {
        if (_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
        return cdkBuilder.build()
    }
}
