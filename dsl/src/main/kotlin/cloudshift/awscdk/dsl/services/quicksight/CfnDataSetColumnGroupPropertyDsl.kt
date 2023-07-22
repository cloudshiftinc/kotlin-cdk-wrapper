@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * Groupings of columns that work together in certain Amazon QuickSight features.
 *
 * This is a variant type structure. For this structure to be valid, only one of the attributes can
 * be non-null.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ColumnGroupProperty columnGroupProperty = ColumnGroupProperty.builder()
 * .geoSpatialColumnGroup(GeoSpatialColumnGroupProperty.builder()
 * .columns(List.of("columns"))
 * .name("name")
 * // the properties below are optional
 * .countryCode("countryCode")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-columngroup.html)
 */
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
