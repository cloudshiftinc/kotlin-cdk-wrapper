@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetColumnGroupPropertyDsl {
  private val cdkBuilder: CfnDataSet.ColumnGroupProperty.Builder =
      CfnDataSet.ColumnGroupProperty.builder()

  /**
   * @param geoSpatialColumnGroup Geospatial column group that denotes a hierarchy.
   */
  public fun geoSpatialColumnGroup(geoSpatialColumnGroup: IResolvable) {
    cdkBuilder.geoSpatialColumnGroup(geoSpatialColumnGroup)
  }

  /**
   * @param geoSpatialColumnGroup Geospatial column group that denotes a hierarchy.
   */
  public
      fun geoSpatialColumnGroup(geoSpatialColumnGroup: CfnDataSet.GeoSpatialColumnGroupProperty) {
    cdkBuilder.geoSpatialColumnGroup(geoSpatialColumnGroup)
  }

  public fun build(): CfnDataSet.ColumnGroupProperty = cdkBuilder.build()
}
