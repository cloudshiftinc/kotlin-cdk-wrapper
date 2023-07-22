@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisPivotTableFieldWellsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.PivotTableFieldWellsProperty.Builder =
      CfnAnalysis.PivotTableFieldWellsProperty.builder()

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
      fun pivotTableAggregatedFieldWells(pivotTableAggregatedFieldWells: CfnAnalysis.PivotTableAggregatedFieldWellsProperty) {
    cdkBuilder.pivotTableAggregatedFieldWells(pivotTableAggregatedFieldWells)
  }

  public fun build(): CfnAnalysis.PivotTableFieldWellsProperty = cdkBuilder.build()
}
