@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The field well configuration of a sankey diagram.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-sankeydiagramfieldwells.html)
 */
@CdkDslMarker
public class CfnTemplateSankeyDiagramFieldWellsPropertyDsl {
  private val cdkBuilder: CfnTemplate.SankeyDiagramFieldWellsProperty.Builder =
      CfnTemplate.SankeyDiagramFieldWellsProperty.builder()

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
      fun sankeyDiagramAggregatedFieldWells(sankeyDiagramAggregatedFieldWells: CfnTemplate.SankeyDiagramAggregatedFieldWellsProperty) {
    cdkBuilder.sankeyDiagramAggregatedFieldWells(sankeyDiagramAggregatedFieldWells)
  }

  public fun build(): CfnTemplate.SankeyDiagramFieldWellsProperty = cdkBuilder.build()
}
