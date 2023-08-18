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
 * The field well configuration of a sankey diagram.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-sankeydiagramfieldwells.html)
 */
@CdkDslMarker
public class CfnAnalysisSankeyDiagramFieldWellsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.SankeyDiagramFieldWellsProperty.Builder =
        CfnAnalysis.SankeyDiagramFieldWellsProperty.builder()

    /**
     * @param sankeyDiagramAggregatedFieldWells The field well configuration of a sankey diagram.
     */
    public fun sankeyDiagramAggregatedFieldWells(sankeyDiagramAggregatedFieldWells: IResolvable) {
        cdkBuilder.sankeyDiagramAggregatedFieldWells(sankeyDiagramAggregatedFieldWells)
    }

    /**
     * @param sankeyDiagramAggregatedFieldWells The field well configuration of a sankey diagram.
     */
    public fun sankeyDiagramAggregatedFieldWells(
        sankeyDiagramAggregatedFieldWells: CfnAnalysis.SankeyDiagramAggregatedFieldWellsProperty
    ) {
        cdkBuilder.sankeyDiagramAggregatedFieldWells(sankeyDiagramAggregatedFieldWells)
    }

    public fun build(): CfnAnalysis.SankeyDiagramFieldWellsProperty = cdkBuilder.build()
}
