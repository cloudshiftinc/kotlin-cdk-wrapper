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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-piechartfieldwells.html)
 */
@CdkDslMarker
public class CfnAnalysisPieChartFieldWellsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.PieChartFieldWellsProperty.Builder =
        CfnAnalysis.PieChartFieldWellsProperty.builder()

    /** @param pieChartAggregatedFieldWells The field well configuration of a pie chart. */
    public fun pieChartAggregatedFieldWells(pieChartAggregatedFieldWells: IResolvable) {
        cdkBuilder.pieChartAggregatedFieldWells(pieChartAggregatedFieldWells)
    }

    /** @param pieChartAggregatedFieldWells The field well configuration of a pie chart. */
    public fun pieChartAggregatedFieldWells(
        pieChartAggregatedFieldWells: CfnAnalysis.PieChartAggregatedFieldWellsProperty
    ) {
        cdkBuilder.pieChartAggregatedFieldWells(pieChartAggregatedFieldWells)
    }

    public fun build(): CfnAnalysis.PieChartFieldWellsProperty = cdkBuilder.build()
}
