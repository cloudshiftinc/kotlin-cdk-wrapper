@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardFilterControlPropertyDsl {
  private val cdkBuilder: CfnDashboard.FilterControlProperty.Builder =
      CfnDashboard.FilterControlProperty.builder()

  public fun dateTimePicker(dateTimePicker: IResolvable) {
    cdkBuilder.dateTimePicker(dateTimePicker)
  }

  public fun dateTimePicker(dateTimePicker: CfnDashboard.FilterDateTimePickerControlProperty) {
    cdkBuilder.dateTimePicker(dateTimePicker)
  }

  public fun dropdown(dropdown: IResolvable) {
    cdkBuilder.dropdown(dropdown)
  }

  public fun dropdown(dropdown: CfnDashboard.FilterDropDownControlProperty) {
    cdkBuilder.dropdown(dropdown)
  }

  public fun list(list: IResolvable) {
    cdkBuilder.list(list)
  }

  public fun list(list: CfnDashboard.FilterListControlProperty) {
    cdkBuilder.list(list)
  }

  public fun relativeDateTime(relativeDateTime: IResolvable) {
    cdkBuilder.relativeDateTime(relativeDateTime)
  }

  public
      fun relativeDateTime(relativeDateTime: CfnDashboard.FilterRelativeDateTimeControlProperty) {
    cdkBuilder.relativeDateTime(relativeDateTime)
  }

  public fun slider(slider: IResolvable) {
    cdkBuilder.slider(slider)
  }

  public fun slider(slider: CfnDashboard.FilterSliderControlProperty) {
    cdkBuilder.slider(slider)
  }

  public fun textArea(textArea: IResolvable) {
    cdkBuilder.textArea(textArea)
  }

  public fun textArea(textArea: CfnDashboard.FilterTextAreaControlProperty) {
    cdkBuilder.textArea(textArea)
  }

  public fun textField(textField: IResolvable) {
    cdkBuilder.textField(textField)
  }

  public fun textField(textField: CfnDashboard.FilterTextFieldControlProperty) {
    cdkBuilder.textField(textField)
  }

  public fun build(): CfnDashboard.FilterControlProperty = cdkBuilder.build()
}
