@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetGeoSpatialColumnGroupPropertyDsl {
  private val cdkBuilder: CfnDataSet.GeoSpatialColumnGroupProperty.Builder =
      CfnDataSet.GeoSpatialColumnGroupProperty.builder()

  private val _columns: MutableList<String> = mutableListOf()

  /**
   * @param columns Columns in this hierarchy. 
   */
  public fun columns(vararg columns: String) {
    _columns.addAll(listOf(*columns))
  }

  /**
   * @param columns Columns in this hierarchy. 
   */
  public fun columns(columns: Collection<String>) {
    _columns.addAll(columns)
  }

  /**
   * @param countryCode Country code.
   */
  public fun countryCode(countryCode: String) {
    cdkBuilder.countryCode(countryCode)
  }

  /**
   * @param name A display name for the hierarchy. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnDataSet.GeoSpatialColumnGroupProperty {
    if(_columns.isNotEmpty()) cdkBuilder.columns(_columns)
    return cdkBuilder.build()
  }
}
