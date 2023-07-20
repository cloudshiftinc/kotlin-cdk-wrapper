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
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.String

@CdkDslMarker
public class CfnTemplateMetricComparisonComputationPropertyDsl {
    private val cdkBuilder: CfnTemplate.MetricComparisonComputationProperty.Builder =
        CfnTemplate.MetricComparisonComputationProperty.builder()

    public fun computationId(computationId: String) {
        cdkBuilder.computationId(computationId)
    }

    public fun fromValue(fromValue: IResolvable) {
        cdkBuilder.fromValue(fromValue)
    }

    public fun fromValue(fromValue: CfnTemplate.MeasureFieldProperty) {
        cdkBuilder.fromValue(fromValue)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun targetValue(targetValue: IResolvable) {
        cdkBuilder.targetValue(targetValue)
    }

    public fun targetValue(targetValue: CfnTemplate.MeasureFieldProperty) {
        cdkBuilder.targetValue(targetValue)
    }

    public fun time(time: IResolvable) {
        cdkBuilder.time(time)
    }

    public fun time(time: CfnTemplate.DimensionFieldProperty) {
        cdkBuilder.time(time)
    }

    public fun build(): CfnTemplate.MetricComparisonComputationProperty = cdkBuilder.build()
}
