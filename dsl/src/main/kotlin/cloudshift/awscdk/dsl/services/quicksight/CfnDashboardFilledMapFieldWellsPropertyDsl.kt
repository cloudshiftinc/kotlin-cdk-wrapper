@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardFilledMapFieldWellsPropertyDsl {
  private val cdkBuilder: CfnDashboard.FilledMapFieldWellsProperty.Builder =
      CfnDashboard.FilledMapFieldWellsProperty.builder()

  /**
   * @param filledMapAggregatedFieldWells The aggregated field well of the filled map.
   */
  public fun filledMapAggregatedFieldWells(filledMapAggregatedFieldWells: IResolvable) {
    cdkBuilder.filledMapAggregatedFieldWells(filledMapAggregatedFieldWells)
  }

  /**
   * @param filledMapAggregatedFieldWells The aggregated field well of the filled map.
   */
  public
      fun filledMapAggregatedFieldWells(filledMapAggregatedFieldWells: CfnDashboard.FilledMapAggregatedFieldWellsProperty) {
    cdkBuilder.filledMapAggregatedFieldWells(filledMapAggregatedFieldWells)
  }

  public fun build(): CfnDashboard.FilledMapFieldWellsProperty = cdkBuilder.build()
}
