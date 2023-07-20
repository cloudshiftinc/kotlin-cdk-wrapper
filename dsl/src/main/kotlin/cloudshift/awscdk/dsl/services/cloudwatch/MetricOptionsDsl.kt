@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudwatch.MetricOptions
import software.amazon.awscdk.services.cloudwatch.Unit
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class MetricOptionsDsl {
    private val cdkBuilder: MetricOptions.Builder = MetricOptions.builder()

    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    public fun dimensionsMap(dimensionsMap: Map<String, String>) {
        cdkBuilder.dimensionsMap(dimensionsMap)
    }

    public fun label(label: String) {
        cdkBuilder.label(label)
    }

    public fun period(period: Duration) {
        cdkBuilder.period(period)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun statistic(statistic: String) {
        cdkBuilder.statistic(statistic)
    }

    public fun unit(unit: Unit) {
        cdkBuilder.unit(unit)
    }

    public fun build(): MetricOptions = cdkBuilder.build()
}
