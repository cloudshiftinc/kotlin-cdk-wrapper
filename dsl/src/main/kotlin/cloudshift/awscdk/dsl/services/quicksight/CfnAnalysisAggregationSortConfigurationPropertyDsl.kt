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
public class CfnAnalysisAggregationSortConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.AggregationSortConfigurationProperty.Builder =
        CfnAnalysis.AggregationSortConfigurationProperty.builder()

    public fun aggregationFunction(aggregationFunction: IResolvable) {
        cdkBuilder.aggregationFunction(aggregationFunction)
    }

    public fun aggregationFunction(aggregationFunction: CfnAnalysis.AggregationFunctionProperty) {
        cdkBuilder.aggregationFunction(aggregationFunction)
    }

    public fun column(column: IResolvable) {
        cdkBuilder.column(column)
    }

    public fun column(column: CfnAnalysis.ColumnIdentifierProperty) {
        cdkBuilder.column(column)
    }

    public fun sortDirection(sortDirection: String) {
        cdkBuilder.sortDirection(sortDirection)
    }

    public fun build(): CfnAnalysis.AggregationSortConfigurationProperty = cdkBuilder.build()
}
