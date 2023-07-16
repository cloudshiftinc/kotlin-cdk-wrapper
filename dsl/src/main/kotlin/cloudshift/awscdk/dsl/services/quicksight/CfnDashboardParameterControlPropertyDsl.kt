@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardParameterControlPropertyDsl {
  private val cdkBuilder: CfnDashboard.ParameterControlProperty.Builder =
      CfnDashboard.ParameterControlProperty.builder()

  public fun dateTimePicker(dateTimePicker: IResolvable) {
    cdkBuilder.dateTimePicker(dateTimePicker)
  }

  public fun dateTimePicker(dateTimePicker: CfnDashboard.ParameterDateTimePickerControlProperty) {
    cdkBuilder.dateTimePicker(dateTimePicker)
  }

  public fun dropdown(dropdown: IResolvable) {
    cdkBuilder.dropdown(dropdown)
  }

  public fun dropdown(dropdown: CfnDashboard.ParameterDropDownControlProperty) {
    cdkBuilder.dropdown(dropdown)
  }

  public fun list(list: IResolvable) {
    cdkBuilder.list(list)
  }

  public fun list(list: CfnDashboard.ParameterListControlProperty) {
    cdkBuilder.list(list)
  }

  public fun slider(slider: IResolvable) {
    cdkBuilder.slider(slider)
  }

  public fun slider(slider: CfnDashboard.ParameterSliderControlProperty) {
    cdkBuilder.slider(slider)
  }

  public fun textArea(textArea: IResolvable) {
    cdkBuilder.textArea(textArea)
  }

  public fun textArea(textArea: CfnDashboard.ParameterTextAreaControlProperty) {
    cdkBuilder.textArea(textArea)
  }

  public fun textField(textField: IResolvable) {
    cdkBuilder.textField(textField)
  }

  public fun textField(textField: CfnDashboard.ParameterTextFieldControlProperty) {
    cdkBuilder.textField(textField)
  }

  public fun build(): CfnDashboard.ParameterControlProperty = cdkBuilder.build()
}
