@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm

/**
 * The `FieldValidationConfiguration` property specifies the validation configuration for a field.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * FieldValidationConfigurationProperty fieldValidationConfigurationProperty =
 * FieldValidationConfigurationProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .numValues(List.of(123))
 * .strValues(List.of("strValues"))
 * .validationMessage("validationMessage")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldvalidationconfiguration.html)
 */
@CdkDslMarker
public class CfnFormFieldValidationConfigurationPropertyDsl {
  private val cdkBuilder: CfnForm.FieldValidationConfigurationProperty.Builder =
      CfnForm.FieldValidationConfigurationProperty.builder()

  private val _numValues: MutableList<Number> = mutableListOf()

  private val _strValues: MutableList<String> = mutableListOf()

  /**
   * @param numValues The validation to perform on a number value.
   */
  public fun numValues(vararg numValues: Number) {
    _numValues.addAll(listOf(*numValues))
  }

  /**
   * @param numValues The validation to perform on a number value.
   */
  public fun numValues(numValues: Collection<Number>) {
    _numValues.addAll(numValues)
  }

  /**
   * @param numValues The validation to perform on a number value.
   */
  public fun numValues(numValues: IResolvable) {
    cdkBuilder.numValues(numValues)
  }

  /**
   * @param strValues The validation to perform on a string value.
   */
  public fun strValues(vararg strValues: String) {
    _strValues.addAll(listOf(*strValues))
  }

  /**
   * @param strValues The validation to perform on a string value.
   */
  public fun strValues(strValues: Collection<String>) {
    _strValues.addAll(strValues)
  }

  /**
   * @param type The validation to perform on an object type. 
   * ``
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param validationMessage The validation message to display.
   */
  public fun validationMessage(validationMessage: String) {
    cdkBuilder.validationMessage(validationMessage)
  }

  public fun build(): CfnForm.FieldValidationConfigurationProperty {
    if(_numValues.isNotEmpty()) cdkBuilder.numValues(_numValues)
    if(_strValues.isNotEmpty()) cdkBuilder.strValues(_strValues)
    return cdkBuilder.build()
  }
}
