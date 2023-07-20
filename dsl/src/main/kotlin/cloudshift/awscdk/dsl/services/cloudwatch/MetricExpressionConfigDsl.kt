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
import software.amazon.awscdk.services.cloudwatch.IMetric
import software.amazon.awscdk.services.cloudwatch.MetricExpressionConfig
import kotlin.Number
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class MetricExpressionConfigDsl {
    private val cdkBuilder: MetricExpressionConfig.Builder = MetricExpressionConfig.builder()

    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    public fun period(period: Number) {
        cdkBuilder.period(period)
    }

    public fun searchAccount(searchAccount: String) {
        cdkBuilder.searchAccount(searchAccount)
    }

    public fun searchRegion(searchRegion: String) {
        cdkBuilder.searchRegion(searchRegion)
    }

    public fun usingMetrics(usingMetrics: Map<String, IMetric>) {
        cdkBuilder.usingMetrics(usingMetrics)
    }

    public fun build(): MetricExpressionConfig = cdkBuilder.build()
}
