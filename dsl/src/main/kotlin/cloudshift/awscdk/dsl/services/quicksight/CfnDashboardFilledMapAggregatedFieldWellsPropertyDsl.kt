@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardFilledMapAggregatedFieldWellsPropertyDsl {
  private val cdkBuilder: CfnDashboard.FilledMapAggregatedFieldWellsProperty.Builder =
      CfnDashboard.FilledMapAggregatedFieldWellsProperty.builder()

  private val _geospatial: MutableList<Any> = mutableListOf()

  private val _values: MutableList<Any> = mutableListOf()

  /**
   * @param geospatial The aggregated location field well of the filled map.
   * Values are grouped by location fields.
   */
  public fun geospatial(vararg geospatial: Any) {
    _geospatial.addAll(listOf(*geospatial))
  }

  /**
   * @param geospatial The aggregated location field well of the filled map.
   * Values are grouped by location fields.
   */
  public fun geospatial(geospatial: Collection<Any>) {
    _geospatial.addAll(geospatial)
  }

  /**
   * @param geospatial The aggregated location field well of the filled map.
   * Values are grouped by location fields.
   */
  public fun geospatial(geospatial: IResolvable) {
    cdkBuilder.geospatial(geospatial)
  }

  /**
   * @param values The aggregated color field well of a filled map.
   * Values are aggregated based on location fields.
   */
  public fun values(vararg values: Any) {
    _values.addAll(listOf(*values))
  }

  /**
   * @param values The aggregated color field well of a filled map.
   * Values are aggregated based on location fields.
   */
  public fun values(values: Collection<Any>) {
    _values.addAll(values)
  }

  /**
   * @param values The aggregated color field well of a filled map.
   * Values are aggregated based on location fields.
   */
  public fun values(values: IResolvable) {
    cdkBuilder.values(values)
  }

  public fun build(): CfnDashboard.FilledMapAggregatedFieldWellsProperty {
    if(_geospatial.isNotEmpty()) cdkBuilder.geospatial(_geospatial)
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
