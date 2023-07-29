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
 * The field well configuration of a heat map.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-heatmapfieldwells.html)
 */
@CdkDslMarker
public class CfnAnalysisHeatMapFieldWellsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.HeatMapFieldWellsProperty.Builder =
        CfnAnalysis.HeatMapFieldWellsProperty.builder()

    /** @param heatMapAggregatedFieldWells The aggregated field wells of a heat map. */
    public fun heatMapAggregatedFieldWells(heatMapAggregatedFieldWells: IResolvable) {
        cdkBuilder.heatMapAggregatedFieldWells(heatMapAggregatedFieldWells)
    }

    /** @param heatMapAggregatedFieldWells The aggregated field wells of a heat map. */
    public fun heatMapAggregatedFieldWells(
        heatMapAggregatedFieldWells: CfnAnalysis.HeatMapAggregatedFieldWellsProperty
    ) {
        cdkBuilder.heatMapAggregatedFieldWells(heatMapAggregatedFieldWells)
    }

    public fun build(): CfnAnalysis.HeatMapFieldWellsProperty = cdkBuilder.build()
}
