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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The field well configuration of a waterfall visual.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-waterfallchartfieldwells.html)
 */
@CdkDslMarker
public class CfnAnalysisWaterfallChartFieldWellsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.WaterfallChartFieldWellsProperty.Builder =
        CfnAnalysis.WaterfallChartFieldWellsProperty.builder()

    /**
     * @param waterfallChartAggregatedFieldWells The field well configuration of a waterfall visual.
     */
    public fun waterfallChartAggregatedFieldWells(waterfallChartAggregatedFieldWells: IResolvable) {
        cdkBuilder.waterfallChartAggregatedFieldWells(waterfallChartAggregatedFieldWells)
    }

    /**
     * @param waterfallChartAggregatedFieldWells The field well configuration of a waterfall visual.
     */
    public fun waterfallChartAggregatedFieldWells(
        waterfallChartAggregatedFieldWells: CfnAnalysis.WaterfallChartAggregatedFieldWellsProperty
    ) {
        cdkBuilder.waterfallChartAggregatedFieldWells(waterfallChartAggregatedFieldWells)
    }

    public fun build(): CfnAnalysis.WaterfallChartFieldWellsProperty = cdkBuilder.build()
}
