@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardParameterControlPropertyDsl {
  private val cdkBuilder: CfnDashboard.ParameterControlProperty.Builder =
      CfnDashboard.ParameterControlProperty.builder()

  /**
   * @param dateTimePicker A control from a date parameter that specifies date and time.
   */
  public fun dateTimePicker(dateTimePicker: IResolvable) {
    cdkBuilder.dateTimePicker(dateTimePicker)
  }

  /**
   * @param dateTimePicker A control from a date parameter that specifies date and time.
   */
  public fun dateTimePicker(dateTimePicker: CfnDashboard.ParameterDateTimePickerControlProperty) {
    cdkBuilder.dateTimePicker(dateTimePicker)
  }

  /**
   * @param dropdown A control to display a dropdown list with buttons that are used to select a
   * single value.
   */
  public fun dropdown(dropdown: IResolvable) {
    cdkBuilder.dropdown(dropdown)
  }

  /**
   * @param dropdown A control to display a dropdown list with buttons that are used to select a
   * single value.
   */
  public fun dropdown(dropdown: CfnDashboard.ParameterDropDownControlProperty) {
    cdkBuilder.dropdown(dropdown)
  }

  /**
   * @param list A control to display a list with buttons or boxes that are used to select either a
   * single value or multiple values.
   */
  public fun list(list: IResolvable) {
    cdkBuilder.list(list)
  }

  /**
   * @param list A control to display a list with buttons or boxes that are used to select either a
   * single value or multiple values.
   */
  public fun list(list: CfnDashboard.ParameterListControlProperty) {
    cdkBuilder.list(list)
  }

  /**
   * @param slider A control to display a horizontal toggle bar.
   * This is used to change a value by sliding the toggle.
   */
  public fun slider(slider: IResolvable) {
    cdkBuilder.slider(slider)
  }

  /**
   * @param slider A control to display a horizontal toggle bar.
   * This is used to change a value by sliding the toggle.
   */
  public fun slider(slider: CfnDashboard.ParameterSliderControlProperty) {
    cdkBuilder.slider(slider)
  }

  /**
   * @param textArea A control to display a text box that is used to enter multiple entries.
   */
  public fun textArea(textArea: IResolvable) {
    cdkBuilder.textArea(textArea)
  }

  /**
   * @param textArea A control to display a text box that is used to enter multiple entries.
   */
  public fun textArea(textArea: CfnDashboard.ParameterTextAreaControlProperty) {
    cdkBuilder.textArea(textArea)
  }

  /**
   * @param textField A control to display a text box that is used to enter a single entry.
   */
  public fun textField(textField: IResolvable) {
    cdkBuilder.textField(textField)
  }

  /**
   * @param textField A control to display a text box that is used to enter a single entry.
   */
  public fun textField(textField: CfnDashboard.ParameterTextFieldControlProperty) {
    cdkBuilder.textField(textField)
  }

  public fun build(): CfnDashboard.ParameterControlProperty = cdkBuilder.build()
}
