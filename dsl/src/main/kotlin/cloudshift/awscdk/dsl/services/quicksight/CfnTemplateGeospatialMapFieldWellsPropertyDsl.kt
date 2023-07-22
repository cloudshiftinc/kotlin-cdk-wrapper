@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateGeospatialMapFieldWellsPropertyDsl {
  private val cdkBuilder: CfnTemplate.GeospatialMapFieldWellsProperty.Builder =
      CfnTemplate.GeospatialMapFieldWellsProperty.builder()

  /**
   * @param geospatialMapAggregatedFieldWells The aggregated field well for a geospatial map.
   */
  public fun geospatialMapAggregatedFieldWells(geospatialMapAggregatedFieldWells: IResolvable) {
    cdkBuilder.geospatialMapAggregatedFieldWells(geospatialMapAggregatedFieldWells)
  }

  /**
   * @param geospatialMapAggregatedFieldWells The aggregated field well for a geospatial map.
   */
  public
      fun geospatialMapAggregatedFieldWells(geospatialMapAggregatedFieldWells: CfnTemplate.GeospatialMapAggregatedFieldWellsProperty) {
    cdkBuilder.geospatialMapAggregatedFieldWells(geospatialMapAggregatedFieldWells)
  }

  public fun build(): CfnTemplate.GeospatialMapFieldWellsProperty = cdkBuilder.build()
}
