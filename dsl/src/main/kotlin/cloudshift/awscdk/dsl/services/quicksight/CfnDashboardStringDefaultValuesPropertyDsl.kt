@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardStringDefaultValuesPropertyDsl {
  private val cdkBuilder: CfnDashboard.StringDefaultValuesProperty.Builder =
      CfnDashboard.StringDefaultValuesProperty.builder()

  private val _staticValues: MutableList<String> = mutableListOf()

  public fun dynamicValue(dynamicValue: IResolvable) {
    cdkBuilder.dynamicValue(dynamicValue)
  }

  public fun dynamicValue(dynamicValue: CfnDashboard.DynamicDefaultValueProperty) {
    cdkBuilder.dynamicValue(dynamicValue)
  }

  public fun staticValues(vararg staticValues: String) {
    _staticValues.addAll(listOf(*staticValues))
  }

  public fun staticValues(staticValues: Collection<String>) {
    _staticValues.addAll(staticValues)
  }

  public fun build(): CfnDashboard.StringDefaultValuesProperty {
    if(_staticValues.isNotEmpty()) cdkBuilder.staticValues(_staticValues)
    return cdkBuilder.build()
  }
}
