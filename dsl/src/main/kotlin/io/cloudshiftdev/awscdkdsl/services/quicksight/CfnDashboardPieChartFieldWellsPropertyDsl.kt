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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The field well configuration of a pie chart.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-piechartfieldwells.html)
 */
@CdkDslMarker
public class CfnDashboardPieChartFieldWellsPropertyDsl {
    private val cdkBuilder: CfnDashboard.PieChartFieldWellsProperty.Builder =
        CfnDashboard.PieChartFieldWellsProperty.builder()

    /** @param pieChartAggregatedFieldWells The field well configuration of a pie chart. */
    public fun pieChartAggregatedFieldWells(pieChartAggregatedFieldWells: IResolvable) {
        cdkBuilder.pieChartAggregatedFieldWells(pieChartAggregatedFieldWells)
    }

    /** @param pieChartAggregatedFieldWells The field well configuration of a pie chart. */
    public fun pieChartAggregatedFieldWells(
        pieChartAggregatedFieldWells: CfnDashboard.PieChartAggregatedFieldWellsProperty
    ) {
        cdkBuilder.pieChartAggregatedFieldWells(pieChartAggregatedFieldWells)
    }

    public fun build(): CfnDashboard.PieChartFieldWellsProperty = cdkBuilder.build()
}
