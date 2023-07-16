@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateParameterControlPropertyDsl {
  private val cdkBuilder: CfnTemplate.ParameterControlProperty.Builder =
      CfnTemplate.ParameterControlProperty.builder()

  public fun dateTimePicker(dateTimePicker: IResolvable) {
    cdkBuilder.dateTimePicker(dateTimePicker)
  }

  public fun dateTimePicker(dateTimePicker: CfnTemplate.ParameterDateTimePickerControlProperty) {
    cdkBuilder.dateTimePicker(dateTimePicker)
  }

  public fun dropdown(dropdown: IResolvable) {
    cdkBuilder.dropdown(dropdown)
  }

  public fun dropdown(dropdown: CfnTemplate.ParameterDropDownControlProperty) {
    cdkBuilder.dropdown(dropdown)
  }

  public fun list(list: IResolvable) {
    cdkBuilder.list(list)
  }

  public fun list(list: CfnTemplate.ParameterListControlProperty) {
    cdkBuilder.list(list)
  }

  public fun slider(slider: IResolvable) {
    cdkBuilder.slider(slider)
  }

  public fun slider(slider: CfnTemplate.ParameterSliderControlProperty) {
    cdkBuilder.slider(slider)
  }

  public fun textArea(textArea: IResolvable) {
    cdkBuilder.textArea(textArea)
  }

  public fun textArea(textArea: CfnTemplate.ParameterTextAreaControlProperty) {
    cdkBuilder.textArea(textArea)
  }

  public fun textField(textField: IResolvable) {
    cdkBuilder.textField(textField)
  }

  public fun textField(textField: CfnTemplate.ParameterTextFieldControlProperty) {
    cdkBuilder.textField(textField)
  }

  public fun build(): CfnTemplate.ParameterControlProperty = cdkBuilder.build()
}
