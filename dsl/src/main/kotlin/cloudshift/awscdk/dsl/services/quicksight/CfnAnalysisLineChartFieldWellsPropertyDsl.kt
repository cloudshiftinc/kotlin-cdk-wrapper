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
 * The field well configuration of a line chart.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-linechartfieldwells.html)
 */
@CdkDslMarker
public class CfnAnalysisLineChartFieldWellsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.LineChartFieldWellsProperty.Builder =
        CfnAnalysis.LineChartFieldWellsProperty.builder()

    /** @param lineChartAggregatedFieldWells The field well configuration of a line chart. */
    public fun lineChartAggregatedFieldWells(lineChartAggregatedFieldWells: IResolvable) {
        cdkBuilder.lineChartAggregatedFieldWells(lineChartAggregatedFieldWells)
    }

    /** @param lineChartAggregatedFieldWells The field well configuration of a line chart. */
    public fun lineChartAggregatedFieldWells(
        lineChartAggregatedFieldWells: CfnAnalysis.LineChartAggregatedFieldWellsProperty
    ) {
        cdkBuilder.lineChartAggregatedFieldWells(lineChartAggregatedFieldWells)
    }

    public fun build(): CfnAnalysis.LineChartFieldWellsProperty = cdkBuilder.build()
}
