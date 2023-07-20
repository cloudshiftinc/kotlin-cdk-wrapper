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
import software.amazon.awscdk.services.cloudwatch.IMetric
import software.amazon.awscdk.services.cloudwatch.MathExpressionProps
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class MathExpressionPropsDsl {
    private val cdkBuilder: MathExpressionProps.Builder = MathExpressionProps.builder()

    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    public fun label(label: String) {
        cdkBuilder.label(label)
    }

    public fun period(period: Duration) {
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

    public fun build(): MathExpressionProps = cdkBuilder.build()
}
