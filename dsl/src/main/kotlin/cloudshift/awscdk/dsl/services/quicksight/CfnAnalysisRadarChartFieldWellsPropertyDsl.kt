@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The field wells of a radar chart visual.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-radarchartfieldwells.html)
 */
@CdkDslMarker
public class CfnAnalysisRadarChartFieldWellsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.RadarChartFieldWellsProperty.Builder =
        CfnAnalysis.RadarChartFieldWellsProperty.builder()

    /**
     * @param radarChartAggregatedFieldWells The aggregated field wells of a radar chart visual.
     */
    public fun radarChartAggregatedFieldWells(radarChartAggregatedFieldWells: IResolvable) {
        cdkBuilder.radarChartAggregatedFieldWells(radarChartAggregatedFieldWells)
    }

    /**
     * @param radarChartAggregatedFieldWells The aggregated field wells of a radar chart visual.
     */
    public fun radarChartAggregatedFieldWells(radarChartAggregatedFieldWells: CfnAnalysis.RadarChartAggregatedFieldWellsProperty) {
        cdkBuilder.radarChartAggregatedFieldWells(radarChartAggregatedFieldWells)
    }

    public fun build(): CfnAnalysis.RadarChartFieldWellsProperty = cdkBuilder.build()
}
