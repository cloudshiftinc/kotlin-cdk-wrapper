@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateFilterControlPropertyDsl {
  private val cdkBuilder: CfnTemplate.FilterControlProperty.Builder =
      CfnTemplate.FilterControlProperty.builder()

  /**
   * @param dateTimePicker A control from a date filter that is used to specify date and time.
   */
  public fun dateTimePicker(dateTimePicker: IResolvable) {
    cdkBuilder.dateTimePicker(dateTimePicker)
  }

  /**
   * @param dateTimePicker A control from a date filter that is used to specify date and time.
   */
  public fun dateTimePicker(dateTimePicker: CfnTemplate.FilterDateTimePickerControlProperty) {
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
  public fun dropdown(dropdown: CfnTemplate.FilterDropDownControlProperty) {
    cdkBuilder.dropdown(dropdown)
  }

  /**
   * @param list A control to display a list of buttons or boxes.
   * This is used to select either a single value or multiple values.
   */
  public fun list(list: IResolvable) {
    cdkBuilder.list(list)
  }

  /**
   * @param list A control to display a list of buttons or boxes.
   * This is used to select either a single value or multiple values.
   */
  public fun list(list: CfnTemplate.FilterListControlProperty) {
    cdkBuilder.list(list)
  }

  /**
   * @param relativeDateTime A control from a date filter that is used to specify the relative date.
   */
  public fun relativeDateTime(relativeDateTime: IResolvable) {
    cdkBuilder.relativeDateTime(relativeDateTime)
  }

  /**
   * @param relativeDateTime A control from a date filter that is used to specify the relative date.
   */
  public fun relativeDateTime(relativeDateTime: CfnTemplate.FilterRelativeDateTimeControlProperty) {
    cdkBuilder.relativeDateTime(relativeDateTime)
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
  public fun slider(slider: CfnTemplate.FilterSliderControlProperty) {
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
  public fun textArea(textArea: CfnTemplate.FilterTextAreaControlProperty) {
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
  public fun textField(textField: CfnTemplate.FilterTextFieldControlProperty) {
    cdkBuilder.textField(textField)
  }

  public fun build(): CfnTemplate.FilterControlProperty = cdkBuilder.build()
}
