@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The aggregated field wells for a geospatial map.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-geospatialmapaggregatedfieldwells.html)
 */
@CdkDslMarker
public class CfnDashboardGeospatialMapAggregatedFieldWellsPropertyDsl {
  private val cdkBuilder: CfnDashboard.GeospatialMapAggregatedFieldWellsProperty.Builder =
      CfnDashboard.GeospatialMapAggregatedFieldWellsProperty.builder()

  private val _colors: MutableList<Any> = mutableListOf()

  private val _geospatial: MutableList<Any> = mutableListOf()

  private val _values: MutableList<Any> = mutableListOf()

  /**
   * @param colors The color field wells of a geospatial map.
   */
  public fun colors(vararg colors: Any) {
    _colors.addAll(listOf(*colors))
  }

  /**
   * @param colors The color field wells of a geospatial map.
   */
  public fun colors(colors: Collection<Any>) {
    _colors.addAll(colors)
  }

  /**
   * @param colors The color field wells of a geospatial map.
   */
  public fun colors(colors: IResolvable) {
    cdkBuilder.colors(colors)
  }

  /**
   * @param geospatial The geospatial field wells of a geospatial map.
   * Values are grouped by geospatial fields.
   */
  public fun geospatial(vararg geospatial: Any) {
    _geospatial.addAll(listOf(*geospatial))
  }

  /**
   * @param geospatial The geospatial field wells of a geospatial map.
   * Values are grouped by geospatial fields.
   */
  public fun geospatial(geospatial: Collection<Any>) {
    _geospatial.addAll(geospatial)
  }

  /**
   * @param geospatial The geospatial field wells of a geospatial map.
   * Values are grouped by geospatial fields.
   */
  public fun geospatial(geospatial: IResolvable) {
    cdkBuilder.geospatial(geospatial)
  }

  /**
   * @param values The size field wells of a geospatial map.
   * Values are aggregated based on geospatial fields.
   */
  public fun values(vararg values: Any) {
    _values.addAll(listOf(*values))
  }

  /**
   * @param values The size field wells of a geospatial map.
   * Values are aggregated based on geospatial fields.
   */
  public fun values(values: Collection<Any>) {
    _values.addAll(values)
  }

  /**
   * @param values The size field wells of a geospatial map.
   * Values are aggregated based on geospatial fields.
   */
  public fun values(values: IResolvable) {
    cdkBuilder.values(values)
  }

  public fun build(): CfnDashboard.GeospatialMapAggregatedFieldWellsProperty {
    if(_colors.isNotEmpty()) cdkBuilder.colors(_colors)
    if(_geospatial.isNotEmpty()) cdkBuilder.geospatial(_geospatial)
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
