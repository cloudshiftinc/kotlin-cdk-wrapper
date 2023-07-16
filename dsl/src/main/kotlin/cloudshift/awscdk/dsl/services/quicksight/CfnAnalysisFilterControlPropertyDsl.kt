@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisFilterControlPropertyDsl {
  private val cdkBuilder: CfnAnalysis.FilterControlProperty.Builder =
      CfnAnalysis.FilterControlProperty.builder()

  public fun dateTimePicker(dateTimePicker: IResolvable) {
    cdkBuilder.dateTimePicker(dateTimePicker)
  }

  public fun dateTimePicker(dateTimePicker: CfnAnalysis.FilterDateTimePickerControlProperty) {
    cdkBuilder.dateTimePicker(dateTimePicker)
  }

  public fun dropdown(dropdown: IResolvable) {
    cdkBuilder.dropdown(dropdown)
  }

  public fun dropdown(dropdown: CfnAnalysis.FilterDropDownControlProperty) {
    cdkBuilder.dropdown(dropdown)
  }

  public fun list(list: IResolvable) {
    cdkBuilder.list(list)
  }

  public fun list(list: CfnAnalysis.FilterListControlProperty) {
    cdkBuilder.list(list)
  }

  public fun relativeDateTime(relativeDateTime: IResolvable) {
    cdkBuilder.relativeDateTime(relativeDateTime)
  }

  public fun relativeDateTime(relativeDateTime: CfnAnalysis.FilterRelativeDateTimeControlProperty) {
    cdkBuilder.relativeDateTime(relativeDateTime)
  }

  public fun slider(slider: IResolvable) {
    cdkBuilder.slider(slider)
  }

  public fun slider(slider: CfnAnalysis.FilterSliderControlProperty) {
    cdkBuilder.slider(slider)
  }

  public fun textArea(textArea: IResolvable) {
    cdkBuilder.textArea(textArea)
  }

  public fun textArea(textArea: CfnAnalysis.FilterTextAreaControlProperty) {
    cdkBuilder.textArea(textArea)
  }

  public fun textField(textField: IResolvable) {
    cdkBuilder.textField(textField)
  }

  public fun textField(textField: CfnAnalysis.FilterTextFieldControlProperty) {
    cdkBuilder.textField(textField)
  }

  public fun build(): CfnAnalysis.FilterControlProperty = cdkBuilder.build()
}
