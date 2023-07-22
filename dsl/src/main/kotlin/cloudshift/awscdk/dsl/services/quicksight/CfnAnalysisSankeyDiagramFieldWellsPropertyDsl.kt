@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

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
  public
      fun sankeyDiagramAggregatedFieldWells(sankeyDiagramAggregatedFieldWells: CfnAnalysis.SankeyDiagramAggregatedFieldWellsProperty) {
    cdkBuilder.sankeyDiagramAggregatedFieldWells(sankeyDiagramAggregatedFieldWells)
  }

  public fun build(): CfnAnalysis.SankeyDiagramFieldWellsProperty = cdkBuilder.build()
}
