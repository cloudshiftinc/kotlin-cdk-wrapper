@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateHeatMapFieldWellsPropertyDsl {
  private val cdkBuilder: CfnTemplate.HeatMapFieldWellsProperty.Builder =
      CfnTemplate.HeatMapFieldWellsProperty.builder()

  /**
   * @param heatMapAggregatedFieldWells The aggregated field wells of a heat map.
   */
  public fun heatMapAggregatedFieldWells(heatMapAggregatedFieldWells: IResolvable) {
    cdkBuilder.heatMapAggregatedFieldWells(heatMapAggregatedFieldWells)
  }

  /**
   * @param heatMapAggregatedFieldWells The aggregated field wells of a heat map.
   */
  public
      fun heatMapAggregatedFieldWells(heatMapAggregatedFieldWells: CfnTemplate.HeatMapAggregatedFieldWellsProperty) {
    cdkBuilder.heatMapAggregatedFieldWells(heatMapAggregatedFieldWells)
  }

  public fun build(): CfnTemplate.HeatMapFieldWellsProperty = cdkBuilder.build()
}
