@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The field wells of a `BarChartVisual` .
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-barchartfieldwells.html)
 */
@CdkDslMarker
public class CfnDashboardBarChartFieldWellsPropertyDsl {
    private val cdkBuilder: CfnDashboard.BarChartFieldWellsProperty.Builder =
        CfnDashboard.BarChartFieldWellsProperty.builder()

    /**
     * @param barChartAggregatedFieldWells The aggregated field wells of a bar chart.
     */
    public fun barChartAggregatedFieldWells(barChartAggregatedFieldWells: IResolvable) {
        cdkBuilder.barChartAggregatedFieldWells(barChartAggregatedFieldWells)
    }

    /**
     * @param barChartAggregatedFieldWells The aggregated field wells of a bar chart.
     */
    public fun barChartAggregatedFieldWells(barChartAggregatedFieldWells: CfnDashboard.BarChartAggregatedFieldWellsProperty) {
        cdkBuilder.barChartAggregatedFieldWells(barChartAggregatedFieldWells)
    }

    public fun build(): CfnDashboard.BarChartFieldWellsProperty = cdkBuilder.build()
}
