@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The field wells of a `GeospatialMapVisual` .
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-geospatialmapfieldwells.html)
 */
@CdkDslMarker
public class CfnDashboardGeospatialMapFieldWellsPropertyDsl {
  private val cdkBuilder: CfnDashboard.GeospatialMapFieldWellsProperty.Builder =
      CfnDashboard.GeospatialMapFieldWellsProperty.builder()

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
      fun geospatialMapAggregatedFieldWells(geospatialMapAggregatedFieldWells: CfnDashboard.GeospatialMapAggregatedFieldWellsProperty) {
    cdkBuilder.geospatialMapAggregatedFieldWells(geospatialMapAggregatedFieldWells)
  }

  public fun build(): CfnDashboard.GeospatialMapFieldWellsProperty = cdkBuilder.build()
}
