@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateScatterPlotFieldWellsPropertyDsl {
  private val cdkBuilder: CfnTemplate.ScatterPlotFieldWellsProperty.Builder =
      CfnTemplate.ScatterPlotFieldWellsProperty.builder()

  public
      fun scatterPlotCategoricallyAggregatedFieldWells(scatterPlotCategoricallyAggregatedFieldWells: IResolvable) {
    cdkBuilder.scatterPlotCategoricallyAggregatedFieldWells(scatterPlotCategoricallyAggregatedFieldWells)
  }

  public
      fun scatterPlotCategoricallyAggregatedFieldWells(scatterPlotCategoricallyAggregatedFieldWells: CfnTemplate.ScatterPlotCategoricallyAggregatedFieldWellsProperty) {
    cdkBuilder.scatterPlotCategoricallyAggregatedFieldWells(scatterPlotCategoricallyAggregatedFieldWells)
  }

  public fun scatterPlotUnaggregatedFieldWells(scatterPlotUnaggregatedFieldWells: IResolvable) {
    cdkBuilder.scatterPlotUnaggregatedFieldWells(scatterPlotUnaggregatedFieldWells)
  }

  public
      fun scatterPlotUnaggregatedFieldWells(scatterPlotUnaggregatedFieldWells: CfnTemplate.ScatterPlotUnaggregatedFieldWellsProperty) {
    cdkBuilder.scatterPlotUnaggregatedFieldWells(scatterPlotUnaggregatedFieldWells)
  }

  public fun build(): CfnTemplate.ScatterPlotFieldWellsProperty = cdkBuilder.build()
}
