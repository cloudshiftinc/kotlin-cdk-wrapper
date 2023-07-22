@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateFunnelChartFieldWellsPropertyDsl {
  private val cdkBuilder: CfnTemplate.FunnelChartFieldWellsProperty.Builder =
      CfnTemplate.FunnelChartFieldWellsProperty.builder()

  /**
   * @param funnelChartAggregatedFieldWells The field well configuration of a `FunnelChartVisual` .
   */
  public fun funnelChartAggregatedFieldWells(funnelChartAggregatedFieldWells: IResolvable) {
    cdkBuilder.funnelChartAggregatedFieldWells(funnelChartAggregatedFieldWells)
  }

  /**
   * @param funnelChartAggregatedFieldWells The field well configuration of a `FunnelChartVisual` .
   */
  public
      fun funnelChartAggregatedFieldWells(funnelChartAggregatedFieldWells: CfnTemplate.FunnelChartAggregatedFieldWellsProperty) {
    cdkBuilder.funnelChartAggregatedFieldWells(funnelChartAggregatedFieldWells)
  }

  public fun build(): CfnTemplate.FunnelChartFieldWellsProperty = cdkBuilder.build()
}
