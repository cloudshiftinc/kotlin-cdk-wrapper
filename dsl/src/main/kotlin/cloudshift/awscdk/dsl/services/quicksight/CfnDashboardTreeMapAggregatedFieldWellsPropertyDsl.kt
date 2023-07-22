@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardTreeMapAggregatedFieldWellsPropertyDsl {
  private val cdkBuilder: CfnDashboard.TreeMapAggregatedFieldWellsProperty.Builder =
      CfnDashboard.TreeMapAggregatedFieldWellsProperty.builder()

  private val _colors: MutableList<Any> = mutableListOf()

  private val _groups: MutableList<Any> = mutableListOf()

  private val _sizes: MutableList<Any> = mutableListOf()

  /**
   * @param colors The color field well of a tree map.
   * Values are grouped by aggregations based on group by fields.
   */
  public fun colors(vararg colors: Any) {
    _colors.addAll(listOf(*colors))
  }

  /**
   * @param colors The color field well of a tree map.
   * Values are grouped by aggregations based on group by fields.
   */
  public fun colors(colors: Collection<Any>) {
    _colors.addAll(colors)
  }

  /**
   * @param colors The color field well of a tree map.
   * Values are grouped by aggregations based on group by fields.
   */
  public fun colors(colors: IResolvable) {
    cdkBuilder.colors(colors)
  }

  /**
   * @param groups The group by field well of a tree map.
   * Values are grouped based on group by fields.
   */
  public fun groups(vararg groups: Any) {
    _groups.addAll(listOf(*groups))
  }

  /**
   * @param groups The group by field well of a tree map.
   * Values are grouped based on group by fields.
   */
  public fun groups(groups: Collection<Any>) {
    _groups.addAll(groups)
  }

  /**
   * @param groups The group by field well of a tree map.
   * Values are grouped based on group by fields.
   */
  public fun groups(groups: IResolvable) {
    cdkBuilder.groups(groups)
  }

  /**
   * @param sizes The size field well of a tree map.
   * Values are aggregated based on group by fields.
   */
  public fun sizes(vararg sizes: Any) {
    _sizes.addAll(listOf(*sizes))
  }

  /**
   * @param sizes The size field well of a tree map.
   * Values are aggregated based on group by fields.
   */
  public fun sizes(sizes: Collection<Any>) {
    _sizes.addAll(sizes)
  }

  /**
   * @param sizes The size field well of a tree map.
   * Values are aggregated based on group by fields.
   */
  public fun sizes(sizes: IResolvable) {
    cdkBuilder.sizes(sizes)
  }

  public fun build(): CfnDashboard.TreeMapAggregatedFieldWellsProperty {
    if(_colors.isNotEmpty()) cdkBuilder.colors(_colors)
    if(_groups.isNotEmpty()) cdkBuilder.groups(_groups)
    if(_sizes.isNotEmpty()) cdkBuilder.sizes(_sizes)
    return cdkBuilder.build()
  }
}
