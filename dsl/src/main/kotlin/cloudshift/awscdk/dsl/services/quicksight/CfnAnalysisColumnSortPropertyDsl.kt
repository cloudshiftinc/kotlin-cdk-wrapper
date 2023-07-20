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
public class CfnAnalysisColumnSortPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ColumnSortProperty.Builder =
        CfnAnalysis.ColumnSortProperty.builder()

    public fun aggregationFunction(aggregationFunction: IResolvable) {
        cdkBuilder.aggregationFunction(aggregationFunction)
    }

    public fun aggregationFunction(aggregationFunction: CfnAnalysis.AggregationFunctionProperty) {
        cdkBuilder.aggregationFunction(aggregationFunction)
    }

    public fun direction(direction: String) {
        cdkBuilder.direction(direction)
    }

    public fun sortBy(sortBy: IResolvable) {
        cdkBuilder.sortBy(sortBy)
    }

    public fun sortBy(sortBy: CfnAnalysis.ColumnIdentifierProperty) {
        cdkBuilder.sortBy(sortBy)
    }

    public fun build(): CfnAnalysis.ColumnSortProperty = cdkBuilder.build()
}
