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
public class CfnTemplateIntegerParameterDeclarationPropertyDsl {
  private val cdkBuilder: CfnTemplate.IntegerParameterDeclarationProperty.Builder =
      CfnTemplate.IntegerParameterDeclarationProperty.builder()

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
  public fun defaultValues(defaultValues: CfnTemplate.IntegerDefaultValuesProperty) {
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
   * @param parameterValueType The value type determines whether the parameter is a single-value or
   * multi-value parameter. 
   */
  public fun parameterValueType(parameterValueType: String) {
    cdkBuilder.parameterValueType(parameterValueType)
  }

  /**
   * @param valueWhenUnset A parameter declaration for the `Integer` data type.
   */
  public fun valueWhenUnset(valueWhenUnset: IResolvable) {
    cdkBuilder.valueWhenUnset(valueWhenUnset)
  }

  /**
   * @param valueWhenUnset A parameter declaration for the `Integer` data type.
   */
  public
      fun valueWhenUnset(valueWhenUnset: CfnTemplate.IntegerValueWhenUnsetConfigurationProperty) {
    cdkBuilder.valueWhenUnset(valueWhenUnset)
  }

  public fun build(): CfnTemplate.IntegerParameterDeclarationProperty {
    if(_mappedDataSetParameters.isNotEmpty())
        cdkBuilder.mappedDataSetParameters(_mappedDataSetParameters)
    return cdkBuilder.build()
  }
}
