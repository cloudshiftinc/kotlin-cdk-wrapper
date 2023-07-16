@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateHeatMapFieldWellsPropertyDsl {
  private val cdkBuilder: CfnTemplate.HeatMapFieldWellsProperty.Builder =
      CfnTemplate.HeatMapFieldWellsProperty.builder()

  public fun heatMapAggregatedFieldWells(heatMapAggregatedFieldWells: IResolvable) {
    cdkBuilder.heatMapAggregatedFieldWells(heatMapAggregatedFieldWells)
  }

  public
      fun heatMapAggregatedFieldWells(heatMapAggregatedFieldWells: CfnTemplate.HeatMapAggregatedFieldWellsProperty) {
    cdkBuilder.heatMapAggregatedFieldWells(heatMapAggregatedFieldWells)
  }

  public fun build(): CfnTemplate.HeatMapFieldWellsProperty = cdkBuilder.build()
}
