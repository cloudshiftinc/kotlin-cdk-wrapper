@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateBoxPlotFieldWellsPropertyDsl {
  private val cdkBuilder: CfnTemplate.BoxPlotFieldWellsProperty.Builder =
      CfnTemplate.BoxPlotFieldWellsProperty.builder()

  /**
   * @param boxPlotAggregatedFieldWells The aggregated field wells of a box plot.
   */
  public fun boxPlotAggregatedFieldWells(boxPlotAggregatedFieldWells: IResolvable) {
    cdkBuilder.boxPlotAggregatedFieldWells(boxPlotAggregatedFieldWells)
  }

  /**
   * @param boxPlotAggregatedFieldWells The aggregated field wells of a box plot.
   */
  public
      fun boxPlotAggregatedFieldWells(boxPlotAggregatedFieldWells: CfnTemplate.BoxPlotAggregatedFieldWellsProperty) {
    cdkBuilder.boxPlotAggregatedFieldWells(boxPlotAggregatedFieldWells)
  }

  public fun build(): CfnTemplate.BoxPlotFieldWellsProperty = cdkBuilder.build()
}
