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
public class CfnDashboardColumnTooltipItemPropertyDsl {
    private val cdkBuilder: CfnDashboard.ColumnTooltipItemProperty.Builder =
        CfnDashboard.ColumnTooltipItemProperty.builder()

    public fun aggregation(aggregation: IResolvable) {
        cdkBuilder.aggregation(aggregation)
    }

    public fun aggregation(aggregation: CfnDashboard.AggregationFunctionProperty) {
        cdkBuilder.aggregation(aggregation)
    }

    public fun column(column: IResolvable) {
        cdkBuilder.column(column)
    }

    public fun column(column: CfnDashboard.ColumnIdentifierProperty) {
        cdkBuilder.column(column)
    }

    public fun label(label: String) {
        cdkBuilder.label(label)
    }

    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnDashboard.ColumnTooltipItemProperty = cdkBuilder.build()
}
