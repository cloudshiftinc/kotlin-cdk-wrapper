@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateSankeyDiagramFieldWellsPropertyDsl {
  private val cdkBuilder: CfnTemplate.SankeyDiagramFieldWellsProperty.Builder =
      CfnTemplate.SankeyDiagramFieldWellsProperty.builder()

  public fun sankeyDiagramAggregatedFieldWells(sankeyDiagramAggregatedFieldWells: IResolvable) {
    cdkBuilder.sankeyDiagramAggregatedFieldWells(sankeyDiagramAggregatedFieldWells)
  }

  public
      fun sankeyDiagramAggregatedFieldWells(sankeyDiagramAggregatedFieldWells: CfnTemplate.SankeyDiagramAggregatedFieldWellsProperty) {
    cdkBuilder.sankeyDiagramAggregatedFieldWells(sankeyDiagramAggregatedFieldWells)
  }

  public fun build(): CfnTemplate.SankeyDiagramFieldWellsProperty = cdkBuilder.build()
}
