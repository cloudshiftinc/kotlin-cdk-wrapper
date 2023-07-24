@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The field well configuration of a sankey diagram.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-sankeydiagramfieldwells.html)
 */
@CdkDslMarker
public class CfnDashboardSankeyDiagramFieldWellsPropertyDsl {
    private val cdkBuilder: CfnDashboard.SankeyDiagramFieldWellsProperty.Builder =
        CfnDashboard.SankeyDiagramFieldWellsProperty.builder()

    /**
     * @param sankeyDiagramAggregatedFieldWells The field well configuration of a sankey diagram.
     */
    public fun sankeyDiagramAggregatedFieldWells(sankeyDiagramAggregatedFieldWells: IResolvable) {
        cdkBuilder.sankeyDiagramAggregatedFieldWells(sankeyDiagramAggregatedFieldWells)
    }

    /**
     * @param sankeyDiagramAggregatedFieldWells The field well configuration of a sankey diagram.
     */
    public fun sankeyDiagramAggregatedFieldWells(sankeyDiagramAggregatedFieldWells: CfnDashboard.SankeyDiagramAggregatedFieldWellsProperty) {
        cdkBuilder.sankeyDiagramAggregatedFieldWells(sankeyDiagramAggregatedFieldWells)
    }

    public fun build(): CfnDashboard.SankeyDiagramFieldWellsProperty = cdkBuilder.build()
}
