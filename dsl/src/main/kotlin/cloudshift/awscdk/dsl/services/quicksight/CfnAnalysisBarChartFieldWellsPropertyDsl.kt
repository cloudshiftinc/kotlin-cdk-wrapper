@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-barchartfieldwells.html)
 */
@CdkDslMarker
public class CfnAnalysisBarChartFieldWellsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.BarChartFieldWellsProperty.Builder =
        CfnAnalysis.BarChartFieldWellsProperty.builder()

    /**
     * @param barChartAggregatedFieldWells The aggregated field wells of a bar chart.
     */
    public fun barChartAggregatedFieldWells(barChartAggregatedFieldWells: IResolvable) {
        cdkBuilder.barChartAggregatedFieldWells(barChartAggregatedFieldWells)
    }

    /**
     * @param barChartAggregatedFieldWells The aggregated field wells of a bar chart.
     */
    public fun barChartAggregatedFieldWells(barChartAggregatedFieldWells: CfnAnalysis.BarChartAggregatedFieldWellsProperty) {
        cdkBuilder.barChartAggregatedFieldWells(barChartAggregatedFieldWells)
    }

    public fun build(): CfnAnalysis.BarChartFieldWellsProperty = cdkBuilder.build()
}
