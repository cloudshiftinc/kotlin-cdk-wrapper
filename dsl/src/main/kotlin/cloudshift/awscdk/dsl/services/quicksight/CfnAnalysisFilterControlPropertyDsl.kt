@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisFilterControlPropertyDsl {
  private val cdkBuilder: CfnAnalysis.FilterControlProperty.Builder =
      CfnAnalysis.FilterControlProperty.builder()

  /**
   * @param dateTimePicker A control from a date filter that is used to specify date and time.
   */
  public fun dateTimePicker(dateTimePicker: IResolvable) {
    cdkBuilder.dateTimePicker(dateTimePicker)
  }

  /**
   * @param dateTimePicker A control from a date filter that is used to specify date and time.
   */
  public fun dateTimePicker(dateTimePicker: CfnAnalysis.FilterDateTimePickerControlProperty) {
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
  public fun dropdown(dropdown: CfnAnalysis.FilterDropDownControlProperty) {
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
  public fun list(list: CfnAnalysis.FilterListControlProperty) {
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
  public fun relativeDateTime(relativeDateTime: CfnAnalysis.FilterRelativeDateTimeControlProperty) {
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
  public fun slider(slider: CfnAnalysis.FilterSliderControlProperty) {
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
  public fun textArea(textArea: CfnAnalysis.FilterTextAreaControlProperty) {
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
  public fun textField(textField: CfnAnalysis.FilterTextFieldControlProperty) {
    cdkBuilder.textField(textField)
  }

  public fun build(): CfnAnalysis.FilterControlProperty = cdkBuilder.build()
}
