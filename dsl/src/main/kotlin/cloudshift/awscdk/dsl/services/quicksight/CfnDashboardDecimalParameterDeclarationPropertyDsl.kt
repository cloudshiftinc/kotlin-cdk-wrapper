@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * A parameter declaration for the `Decimal` data type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DecimalParameterDeclarationProperty decimalParameterDeclarationProperty =
 * DecimalParameterDeclarationProperty.builder()
 * .name("name")
 * .parameterValueType("parameterValueType")
 * // the properties below are optional
 * .defaultValues(DecimalDefaultValuesProperty.builder()
 * .dynamicValue(DynamicDefaultValueProperty.builder()
 * .defaultValueColumn(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * // the properties below are optional
 * .groupNameColumn(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .userNameColumn(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .build())
 * .staticValues(List.of(123))
 * .build())
 * .mappedDataSetParameters(List.of(MappedDataSetParameterProperty.builder()
 * .dataSetIdentifier("dataSetIdentifier")
 * .dataSetParameterName("dataSetParameterName")
 * .build()))
 * .valueWhenUnset(DecimalValueWhenUnsetConfigurationProperty.builder()
 * .customValue(123)
 * .valueWhenUnsetOption("valueWhenUnsetOption")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-decimalparameterdeclaration.html)
 */
@CdkDslMarker
public class CfnDashboardDecimalParameterDeclarationPropertyDsl {
  private val cdkBuilder: CfnDashboard.DecimalParameterDeclarationProperty.Builder =
      CfnDashboard.DecimalParameterDeclarationProperty.builder()

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
  public fun defaultValues(defaultValues: CfnDashboard.DecimalDefaultValuesProperty) {
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
   * @param valueWhenUnset The configuration that defines the default value of a `Decimal` parameter
   * when a value has not been set.
   */
  public fun valueWhenUnset(valueWhenUnset: IResolvable) {
    cdkBuilder.valueWhenUnset(valueWhenUnset)
  }

  /**
   * @param valueWhenUnset The configuration that defines the default value of a `Decimal` parameter
   * when a value has not been set.
   */
  public
      fun valueWhenUnset(valueWhenUnset: CfnDashboard.DecimalValueWhenUnsetConfigurationProperty) {
    cdkBuilder.valueWhenUnset(valueWhenUnset)
  }

  public fun build(): CfnDashboard.DecimalParameterDeclarationProperty {
    if(_mappedDataSetParameters.isNotEmpty())
        cdkBuilder.mappedDataSetParameters(_mappedDataSetParameters)
    return cdkBuilder.build()
  }
}
