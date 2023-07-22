@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplatePivotTableFieldWellsPropertyDsl {
  private val cdkBuilder: CfnTemplate.PivotTableFieldWellsProperty.Builder =
      CfnTemplate.PivotTableFieldWellsProperty.builder()

  /**
   * @param pivotTableAggregatedFieldWells The aggregated field well for the pivot table.
   */
  public fun pivotTableAggregatedFieldWells(pivotTableAggregatedFieldWells: IResolvable) {
    cdkBuilder.pivotTableAggregatedFieldWells(pivotTableAggregatedFieldWells)
  }

  /**
   * @param pivotTableAggregatedFieldWells The aggregated field well for the pivot table.
   */
  public
      fun pivotTableAggregatedFieldWells(pivotTableAggregatedFieldWells: CfnTemplate.PivotTableAggregatedFieldWellsProperty) {
    cdkBuilder.pivotTableAggregatedFieldWells(pivotTableAggregatedFieldWells)
  }

  public fun build(): CfnTemplate.PivotTableFieldWellsProperty = cdkBuilder.build()
}
