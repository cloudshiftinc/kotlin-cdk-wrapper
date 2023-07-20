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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

@CdkDslMarker
public class CfnAnalysisMetricComparisonComputationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.MetricComparisonComputationProperty.Builder =
        CfnAnalysis.MetricComparisonComputationProperty.builder()

    public fun computationId(computationId: String) {
        cdkBuilder.computationId(computationId)
    }

    public fun fromValue(fromValue: IResolvable) {
        cdkBuilder.fromValue(fromValue)
    }

    public fun fromValue(fromValue: CfnAnalysis.MeasureFieldProperty) {
        cdkBuilder.fromValue(fromValue)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun targetValue(targetValue: IResolvable) {
        cdkBuilder.targetValue(targetValue)
    }

    public fun targetValue(targetValue: CfnAnalysis.MeasureFieldProperty) {
        cdkBuilder.targetValue(targetValue)
    }

    public fun time(time: IResolvable) {
        cdkBuilder.time(time)
    }

    public fun time(time: CfnAnalysis.DimensionFieldProperty) {
        cdkBuilder.time(time)
    }

    public fun build(): CfnAnalysis.MetricComparisonComputationProperty = cdkBuilder.build()
}
