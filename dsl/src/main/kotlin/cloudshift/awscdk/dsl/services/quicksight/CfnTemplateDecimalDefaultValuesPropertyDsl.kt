@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateDecimalDefaultValuesPropertyDsl {
  private val cdkBuilder: CfnTemplate.DecimalDefaultValuesProperty.Builder =
      CfnTemplate.DecimalDefaultValuesProperty.builder()

  private val _staticValues: MutableList<Number> = mutableListOf()

  /**
   * @param dynamicValue The dynamic value of the `DecimalDefaultValues` .
   * Different defaults are displayed according to users, groups, and values mapping.
   */
  public fun dynamicValue(dynamicValue: IResolvable) {
    cdkBuilder.dynamicValue(dynamicValue)
  }

  /**
   * @param dynamicValue The dynamic value of the `DecimalDefaultValues` .
   * Different defaults are displayed according to users, groups, and values mapping.
   */
  public fun dynamicValue(dynamicValue: CfnTemplate.DynamicDefaultValueProperty) {
    cdkBuilder.dynamicValue(dynamicValue)
  }

  /**
   * @param staticValues The static values of the `DecimalDefaultValues` .
   */
  public fun staticValues(vararg staticValues: Number) {
    _staticValues.addAll(listOf(*staticValues))
  }

  /**
   * @param staticValues The static values of the `DecimalDefaultValues` .
   */
  public fun staticValues(staticValues: Collection<Number>) {
    _staticValues.addAll(staticValues)
  }

  /**
   * @param staticValues The static values of the `DecimalDefaultValues` .
   */
  public fun staticValues(staticValues: IResolvable) {
    cdkBuilder.staticValues(staticValues)
  }

  public fun build(): CfnTemplate.DecimalDefaultValuesProperty {
    if(_staticValues.isNotEmpty()) cdkBuilder.staticValues(_staticValues)
    return cdkBuilder.build()
  }
}
