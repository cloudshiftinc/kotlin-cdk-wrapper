@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisGeospatialMapFieldWellsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.GeospatialMapFieldWellsProperty.Builder =
      CfnAnalysis.GeospatialMapFieldWellsProperty.builder()

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
      fun geospatialMapAggregatedFieldWells(geospatialMapAggregatedFieldWells: CfnAnalysis.GeospatialMapAggregatedFieldWellsProperty) {
    cdkBuilder.geospatialMapAggregatedFieldWells(geospatialMapAggregatedFieldWells)
  }

  public fun build(): CfnAnalysis.GeospatialMapFieldWellsProperty = cdkBuilder.build()
}
