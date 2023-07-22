@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm

@CdkDslMarker
public class CfnFormFieldConfigPropertyDsl {
  private val cdkBuilder: CfnForm.FieldConfigProperty.Builder =
      CfnForm.FieldConfigProperty.builder()

  private val _validations: MutableList<Any> = mutableListOf()

  /**
   * @param excluded Specifies whether to hide a field.
   */
  public fun excluded(excluded: Boolean) {
    cdkBuilder.excluded(excluded)
  }

  /**
   * @param excluded Specifies whether to hide a field.
   */
  public fun excluded(excluded: IResolvable) {
    cdkBuilder.excluded(excluded)
  }

  /**
   * @param inputType Describes the configuration for the default input value to display for a
   * field.
   */
  public fun inputType(inputType: IResolvable) {
    cdkBuilder.inputType(inputType)
  }

  /**
   * @param inputType Describes the configuration for the default input value to display for a
   * field.
   */
  public fun inputType(inputType: CfnForm.FieldInputConfigProperty) {
    cdkBuilder.inputType(inputType)
  }

  /**
   * @param label The label for the field.
   */
  public fun label(label: String) {
    cdkBuilder.label(label)
  }

  /**
   * @param position Specifies the field position.
   */
  public fun position(position: IResolvable) {
    cdkBuilder.position(position)
  }

  /**
   * @param position Specifies the field position.
   */
  public fun position(position: CfnForm.FieldPositionProperty) {
    cdkBuilder.position(position)
  }

  /**
   * @param validations The validations to perform on the value in the field.
   */
  public fun validations(vararg validations: Any) {
    _validations.addAll(listOf(*validations))
  }

  /**
   * @param validations The validations to perform on the value in the field.
   */
  public fun validations(validations: Collection<Any>) {
    _validations.addAll(validations)
  }

  /**
   * @param validations The validations to perform on the value in the field.
   */
  public fun validations(validations: IResolvable) {
    cdkBuilder.validations(validations)
  }

  public fun build(): CfnForm.FieldConfigProperty {
    if(_validations.isNotEmpty()) cdkBuilder.validations(_validations)
    return cdkBuilder.build()
  }
}
