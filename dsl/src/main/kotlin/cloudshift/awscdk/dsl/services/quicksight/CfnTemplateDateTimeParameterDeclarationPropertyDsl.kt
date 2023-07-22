@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateDateTimeParameterDeclarationPropertyDsl {
  private val cdkBuilder: CfnTemplate.DateTimeParameterDeclarationProperty.Builder =
      CfnTemplate.DateTimeParameterDeclarationProperty.builder()

  private val _mappedDataSetParameters: MutableList<Any> = mutableListOf()

  /**
   * @param defaultValues The default values of a parameter.
   * If the parameter is a single-value parameter, a maximum of one default value can be provided.
   */
  public fun defaultValues(defaultValues: IResolvable) {
    cdkBuilder.defaultValues(defaultValues)
  }

  /**
   * @param defaultValues The default values of a parameter.
   * If the parameter is a single-value parameter, a maximum of one default value can be provided.
   */
  public fun defaultValues(defaultValues: CfnTemplate.DateTimeDefaultValuesProperty) {
    cdkBuilder.defaultValues(defaultValues)
  }

  /**
   * @param mappedDataSetParameters the value to be set.
   */
  public fun mappedDataSetParameters(vararg mappedDataSetParameters: Any) {
    _mappedDataSetParameters.addAll(listOf(*mappedDataSetParameters))
  }

  /**
   * @param mappedDataSetParameters the value to be set.
   */
  public fun mappedDataSetParameters(mappedDataSetParameters: Collection<Any>) {
    _mappedDataSetParameters.addAll(mappedDataSetParameters)
  }

  /**
   * @param mappedDataSetParameters the value to be set.
   */
  public fun mappedDataSetParameters(mappedDataSetParameters: IResolvable) {
    cdkBuilder.mappedDataSetParameters(mappedDataSetParameters)
  }

  /**
   * @param name The name of the parameter that is being declared. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param timeGranularity The level of time precision that is used to aggregate `DateTime` values.
   */
  public fun timeGranularity(timeGranularity: String) {
    cdkBuilder.timeGranularity(timeGranularity)
  }

  /**
   * @param valueWhenUnset The configuration that defines the default value of a `DateTime`
   * parameter when a value has not been set.
   */
  public fun valueWhenUnset(valueWhenUnset: IResolvable) {
    cdkBuilder.valueWhenUnset(valueWhenUnset)
  }

  /**
   * @param valueWhenUnset The configuration that defines the default value of a `DateTime`
   * parameter when a value has not been set.
   */
  public
      fun valueWhenUnset(valueWhenUnset: CfnTemplate.DateTimeValueWhenUnsetConfigurationProperty) {
    cdkBuilder.valueWhenUnset(valueWhenUnset)
  }

  public fun build(): CfnTemplate.DateTimeParameterDeclarationProperty {
    if(_mappedDataSetParameters.isNotEmpty())
        cdkBuilder.mappedDataSetParameters(_mappedDataSetParameters)
    return cdkBuilder.build()
  }
}
