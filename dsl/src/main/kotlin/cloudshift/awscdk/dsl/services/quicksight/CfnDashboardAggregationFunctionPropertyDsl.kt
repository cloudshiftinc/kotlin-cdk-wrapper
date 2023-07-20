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
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

@CdkDslMarker
public class CfnDashboardAggregationFunctionPropertyDsl {
    private val cdkBuilder: CfnDashboard.AggregationFunctionProperty.Builder =
        CfnDashboard.AggregationFunctionProperty.builder()

    public fun categoricalAggregationFunction(categoricalAggregationFunction: String) {
        cdkBuilder.categoricalAggregationFunction(categoricalAggregationFunction)
    }

    public fun dateAggregationFunction(dateAggregationFunction: String) {
        cdkBuilder.dateAggregationFunction(dateAggregationFunction)
    }

    public fun numericalAggregationFunction(numericalAggregationFunction: IResolvable) {
        cdkBuilder.numericalAggregationFunction(numericalAggregationFunction)
    }

    public fun numericalAggregationFunction(numericalAggregationFunction: CfnDashboard.NumericalAggregationFunctionProperty) {
        cdkBuilder.numericalAggregationFunction(numericalAggregationFunction)
    }

    public fun build(): CfnDashboard.AggregationFunctionProperty = cdkBuilder.build()
}
