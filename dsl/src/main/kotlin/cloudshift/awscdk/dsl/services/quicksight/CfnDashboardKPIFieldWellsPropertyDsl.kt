@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardKPIFieldWellsPropertyDsl {
  private val cdkBuilder: CfnDashboard.KPIFieldWellsProperty.Builder =
      CfnDashboard.KPIFieldWellsProperty.builder()

  private val _targetValues: MutableList<Any> = mutableListOf()

  private val _trendGroups: MutableList<Any> = mutableListOf()

  private val _values: MutableList<Any> = mutableListOf()

  public fun targetValues(vararg targetValues: Any) {
    _targetValues.addAll(listOf(*targetValues))
  }

  public fun targetValues(targetValues: Collection<Any>) {
    _targetValues.addAll(targetValues)
  }

  public fun targetValues(targetValues: IResolvable) {
    cdkBuilder.targetValues(targetValues)
  }

  public fun trendGroups(vararg trendGroups: Any) {
    _trendGroups.addAll(listOf(*trendGroups))
  }

  public fun trendGroups(trendGroups: Collection<Any>) {
    _trendGroups.addAll(trendGroups)
  }

  public fun trendGroups(trendGroups: IResolvable) {
    cdkBuilder.trendGroups(trendGroups)
  }

  public fun values(vararg values: Any) {
    _values.addAll(listOf(*values))
  }

  public fun values(values: Collection<Any>) {
    _values.addAll(values)
  }

  public fun values(values: IResolvable) {
    cdkBuilder.values(values)
  }

  public fun build(): CfnDashboard.KPIFieldWellsProperty {
    if(_targetValues.isNotEmpty()) cdkBuilder.targetValues(_targetValues)
    if(_trendGroups.isNotEmpty()) cdkBuilder.trendGroups(_trendGroups)
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
