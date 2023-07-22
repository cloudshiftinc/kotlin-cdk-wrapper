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

  /**
   * @param dynamicValue The dynamic value of the `StringDefaultValues` .
   * Different defaults displayed according to users, groups, and values mapping.
   */
  public fun dynamicValue(dynamicValue: IResolvable) {
    cdkBuilder.dynamicValue(dynamicValue)
  }

  /**
   * @param dynamicValue The dynamic value of the `StringDefaultValues` .
   * Different defaults displayed according to users, groups, and values mapping.
   */
  public fun dynamicValue(dynamicValue: CfnDashboard.DynamicDefaultValueProperty) {
    cdkBuilder.dynamicValue(dynamicValue)
  }

  /**
   * @param staticValues The static values of the `DecimalDefaultValues` .
   */
  public fun staticValues(vararg staticValues: String) {
    _staticValues.addAll(listOf(*staticValues))
  }

  /**
   * @param staticValues The static values of the `DecimalDefaultValues` .
   */
  public fun staticValues(staticValues: Collection<String>) {
    _staticValues.addAll(staticValues)
  }

  public fun build(): CfnDashboard.StringDefaultValuesProperty {
    if(_staticValues.isNotEmpty()) cdkBuilder.staticValues(_staticValues)
    return cdkBuilder.build()
  }
}
