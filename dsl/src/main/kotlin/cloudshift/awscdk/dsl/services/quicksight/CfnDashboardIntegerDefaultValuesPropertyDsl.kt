@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardIntegerDefaultValuesPropertyDsl {
  private val cdkBuilder: CfnDashboard.IntegerDefaultValuesProperty.Builder =
      CfnDashboard.IntegerDefaultValuesProperty.builder()

  private val _staticValues: MutableList<Number> = mutableListOf()

  public fun dynamicValue(dynamicValue: IResolvable) {
    cdkBuilder.dynamicValue(dynamicValue)
  }

  public fun dynamicValue(dynamicValue: CfnDashboard.DynamicDefaultValueProperty) {
    cdkBuilder.dynamicValue(dynamicValue)
  }

  public fun staticValues(vararg staticValues: Number) {
    _staticValues.addAll(listOf(*staticValues))
  }

  public fun staticValues(staticValues: Collection<Number>) {
    _staticValues.addAll(staticValues)
  }

  public fun staticValues(staticValues: IResolvable) {
    cdkBuilder.staticValues(staticValues)
  }

  public fun build(): CfnDashboard.IntegerDefaultValuesProperty {
    if(_staticValues.isNotEmpty()) cdkBuilder.staticValues(_staticValues)
    return cdkBuilder.build()
  }
}
