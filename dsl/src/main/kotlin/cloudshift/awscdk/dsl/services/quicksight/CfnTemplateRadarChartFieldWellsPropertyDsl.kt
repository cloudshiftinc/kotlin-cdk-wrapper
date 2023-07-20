@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateRadarChartFieldWellsPropertyDsl {
  private val cdkBuilder: CfnTemplate.RadarChartFieldWellsProperty.Builder =
      CfnTemplate.RadarChartFieldWellsProperty.builder()

  public fun radarChartAggregatedFieldWells(radarChartAggregatedFieldWells: IResolvable) {
    cdkBuilder.radarChartAggregatedFieldWells(radarChartAggregatedFieldWells)
  }

  public
      fun radarChartAggregatedFieldWells(radarChartAggregatedFieldWells: CfnTemplate.RadarChartAggregatedFieldWellsProperty) {
    cdkBuilder.radarChartAggregatedFieldWells(radarChartAggregatedFieldWells)
  }

  public fun build(): CfnTemplate.RadarChartFieldWellsProperty = cdkBuilder.build()
}
