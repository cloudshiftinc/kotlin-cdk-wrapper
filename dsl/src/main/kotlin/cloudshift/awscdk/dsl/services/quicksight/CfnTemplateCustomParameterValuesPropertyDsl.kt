@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateCustomParameterValuesPropertyDsl {
  private val cdkBuilder: CfnTemplate.CustomParameterValuesProperty.Builder =
      CfnTemplate.CustomParameterValuesProperty.builder()

  private val _dateTimeValues: MutableList<String> = mutableListOf()

  private val _decimalValues: MutableList<Number> = mutableListOf()

  private val _integerValues: MutableList<Number> = mutableListOf()

  private val _stringValues: MutableList<String> = mutableListOf()

  /**
   * @param dateTimeValues A list of datetime-type parameter values.
   */
  public fun dateTimeValues(vararg dateTimeValues: String) {
    _dateTimeValues.addAll(listOf(*dateTimeValues))
  }

  /**
   * @param dateTimeValues A list of datetime-type parameter values.
   */
  public fun dateTimeValues(dateTimeValues: Collection<String>) {
    _dateTimeValues.addAll(dateTimeValues)
  }

  /**
   * @param decimalValues A list of decimal-type parameter values.
   */
  public fun decimalValues(vararg decimalValues: Number) {
    _decimalValues.addAll(listOf(*decimalValues))
  }

  /**
   * @param decimalValues A list of decimal-type parameter values.
   */
  public fun decimalValues(decimalValues: Collection<Number>) {
    _decimalValues.addAll(decimalValues)
  }

  /**
   * @param decimalValues A list of decimal-type parameter values.
   */
  public fun decimalValues(decimalValues: IResolvable) {
    cdkBuilder.decimalValues(decimalValues)
  }

  /**
   * @param integerValues A list of integer-type parameter values.
   */
  public fun integerValues(vararg integerValues: Number) {
    _integerValues.addAll(listOf(*integerValues))
  }

  /**
   * @param integerValues A list of integer-type parameter values.
   */
  public fun integerValues(integerValues: Collection<Number>) {
    _integerValues.addAll(integerValues)
  }

  /**
   * @param integerValues A list of integer-type parameter values.
   */
  public fun integerValues(integerValues: IResolvable) {
    cdkBuilder.integerValues(integerValues)
  }

  /**
   * @param stringValues A list of string-type parameter values.
   */
  public fun stringValues(vararg stringValues: String) {
    _stringValues.addAll(listOf(*stringValues))
  }

  /**
   * @param stringValues A list of string-type parameter values.
   */
  public fun stringValues(stringValues: Collection<String>) {
    _stringValues.addAll(stringValues)
  }

  public fun build(): CfnTemplate.CustomParameterValuesProperty {
    if(_dateTimeValues.isNotEmpty()) cdkBuilder.dateTimeValues(_dateTimeValues)
    if(_decimalValues.isNotEmpty()) cdkBuilder.decimalValues(_decimalValues)
    if(_integerValues.isNotEmpty()) cdkBuilder.integerValues(_integerValues)
    if(_stringValues.isNotEmpty()) cdkBuilder.stringValues(_stringValues)
    return cdkBuilder.build()
  }
}
