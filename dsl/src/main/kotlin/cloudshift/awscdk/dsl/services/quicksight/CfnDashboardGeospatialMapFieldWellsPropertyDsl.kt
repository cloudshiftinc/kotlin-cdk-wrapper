@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardGeospatialMapFieldWellsPropertyDsl {
  private val cdkBuilder: CfnDashboard.GeospatialMapFieldWellsProperty.Builder =
      CfnDashboard.GeospatialMapFieldWellsProperty.builder()

  public fun geospatialMapAggregatedFieldWells(geospatialMapAggregatedFieldWells: IResolvable) {
    cdkBuilder.geospatialMapAggregatedFieldWells(geospatialMapAggregatedFieldWells)
  }

  public
      fun geospatialMapAggregatedFieldWells(geospatialMapAggregatedFieldWells: CfnDashboard.GeospatialMapAggregatedFieldWellsProperty) {
    cdkBuilder.geospatialMapAggregatedFieldWells(geospatialMapAggregatedFieldWells)
  }

  public fun build(): CfnDashboard.GeospatialMapFieldWellsProperty = cdkBuilder.build()
}
