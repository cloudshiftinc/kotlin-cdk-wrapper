@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The control of a parameter that users can interact with in a dashboard or an analysis.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ParameterControlProperty parameterControlProperty = ParameterControlProperty.builder()
 * .dateTimePicker(ParameterDateTimePickerControlProperty.builder()
 * .parameterControlId("parameterControlId")
 * .sourceParameterName("sourceParameterName")
 * .title("title")
 * // the properties below are optional
 * .displayOptions(DateTimePickerControlDisplayOptionsProperty.builder()
 * .dateTimeFormat("dateTimeFormat")
 * .titleOptions(LabelOptionsProperty.builder()
 * .customLabel("customLabel")
 * .fontConfiguration(FontConfigurationProperty.builder()
 * .fontColor("fontColor")
 * .fontDecoration("fontDecoration")
 * .fontSize(FontSizeProperty.builder()
 * .relative("relative")
 * .build())
 * .fontStyle("fontStyle")
 * .fontWeight(FontWeightProperty.builder()
 * .name("name")
 * .build())
 * .build())
 * .visibility("visibility")
 * .build())
 * .build())
 * .build())
 * .dropdown(ParameterDropDownControlProperty.builder()
 * .parameterControlId("parameterControlId")
 * .sourceParameterName("sourceParameterName")
 * .title("title")
 * // the properties below are optional
 * .cascadingControlConfiguration(CascadingControlConfigurationProperty.builder()
 * .sourceControls(List.of(CascadingControlSourceProperty.builder()
 * .columnToMatch(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .sourceSheetControlId("sourceSheetControlId")
 * .build()))
 * .build())
 * .displayOptions(DropDownControlDisplayOptionsProperty.builder()
 * .selectAllOptions(ListControlSelectAllOptionsProperty.builder()
 * .visibility("visibility")
 * .build())
 * .titleOptions(LabelOptionsProperty.builder()
 * .customLabel("customLabel")
 * .fontConfiguration(FontConfigurationProperty.builder()
 * .fontColor("fontColor")
 * .fontDecoration("fontDecoration")
 * .fontSize(FontSizeProperty.builder()
 * .relative("relative")
 * .build())
 * .fontStyle("fontStyle")
 * .fontWeight(FontWeightProperty.builder()
 * .name("name")
 * .build())
 * .build())
 * .visibility("visibility")
 * .build())
 * .build())
 * .selectableValues(ParameterSelectableValuesProperty.builder()
 * .linkToDataSetColumn(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .values(List.of("values"))
 * .build())
 * .type("type")
 * .build())
 * .list(ParameterListControlProperty.builder()
 * .parameterControlId("parameterControlId")
 * .sourceParameterName("sourceParameterName")
 * .title("title")
 * // the properties below are optional
 * .cascadingControlConfiguration(CascadingControlConfigurationProperty.builder()
 * .sourceControls(List.of(CascadingControlSourceProperty.builder()
 * .columnToMatch(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .sourceSheetControlId("sourceSheetControlId")
 * .build()))
 * .build())
 * .displayOptions(ListControlDisplayOptionsProperty.builder()
 * .searchOptions(ListControlSearchOptionsProperty.builder()
 * .visibility("visibility")
 * .build())
 * .selectAllOptions(ListControlSelectAllOptionsProperty.builder()
 * .visibility("visibility")
 * .build())
 * .titleOptions(LabelOptionsProperty.builder()
 * .customLabel("customLabel")
 * .fontConfiguration(FontConfigurationProperty.builder()
 * .fontColor("fontColor")
 * .fontDecoration("fontDecoration")
 * .fontSize(FontSizeProperty.builder()
 * .relative("relative")
 * .build())
 * .fontStyle("fontStyle")
 * .fontWeight(FontWeightProperty.builder()
 * .name("name")
 * .build())
 * .build())
 * .visibility("visibility")
 * .build())
 * .build())
 * .selectableValues(ParameterSelectableValuesProperty.builder()
 * .linkToDataSetColumn(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .values(List.of("values"))
 * .build())
 * .type("type")
 * .build())
 * .slider(ParameterSliderControlProperty.builder()
 * .maximumValue(123)
 * .minimumValue(123)
 * .parameterControlId("parameterControlId")
 * .sourceParameterName("sourceParameterName")
 * .stepSize(123)
 * .title("title")
 * // the properties below are optional
 * .displayOptions(SliderControlDisplayOptionsProperty.builder()
 * .titleOptions(LabelOptionsProperty.builder()
 * .customLabel("customLabel")
 * .fontConfiguration(FontConfigurationProperty.builder()
 * .fontColor("fontColor")
 * .fontDecoration("fontDecoration")
 * .fontSize(FontSizeProperty.builder()
 * .relative("relative")
 * .build())
 * .fontStyle("fontStyle")
 * .fontWeight(FontWeightProperty.builder()
 * .name("name")
 * .build())
 * .build())
 * .visibility("visibility")
 * .build())
 * .build())
 * .build())
 * .textArea(ParameterTextAreaControlProperty.builder()
 * .parameterControlId("parameterControlId")
 * .sourceParameterName("sourceParameterName")
 * .title("title")
 * // the properties below are optional
 * .delimiter("delimiter")
 * .displayOptions(TextAreaControlDisplayOptionsProperty.builder()
 * .placeholderOptions(TextControlPlaceholderOptionsProperty.builder()
 * .visibility("visibility")
 * .build())
 * .titleOptions(LabelOptionsProperty.builder()
 * .customLabel("customLabel")
 * .fontConfiguration(FontConfigurationProperty.builder()
 * .fontColor("fontColor")
 * .fontDecoration("fontDecoration")
 * .fontSize(FontSizeProperty.builder()
 * .relative("relative")
 * .build())
 * .fontStyle("fontStyle")
 * .fontWeight(FontWeightProperty.builder()
 * .name("name")
 * .build())
 * .build())
 * .visibility("visibility")
 * .build())
 * .build())
 * .build())
 * .textField(ParameterTextFieldControlProperty.builder()
 * .parameterControlId("parameterControlId")
 * .sourceParameterName("sourceParameterName")
 * .title("title")
 * // the properties below are optional
 * .displayOptions(TextFieldControlDisplayOptionsProperty.builder()
 * .placeholderOptions(TextControlPlaceholderOptionsProperty.builder()
 * .visibility("visibility")
 * .build())
 * .titleOptions(LabelOptionsProperty.builder()
 * .customLabel("customLabel")
 * .fontConfiguration(FontConfigurationProperty.builder()
 * .fontColor("fontColor")
 * .fontDecoration("fontDecoration")
 * .fontSize(FontSizeProperty.builder()
 * .relative("relative")
 * .build())
 * .fontStyle("fontStyle")
 * .fontWeight(FontWeightProperty.builder()
 * .name("name")
 * .build())
 * .build())
 * .visibility("visibility")
 * .build())
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-parametercontrol.html)
 */
@CdkDslMarker
public class CfnAnalysisParameterControlPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ParameterControlProperty.Builder =
      CfnAnalysis.ParameterControlProperty.builder()

  /**
   * @param dateTimePicker A control from a date parameter that specifies date and time.
   */
  public fun dateTimePicker(dateTimePicker: IResolvable) {
    cdkBuilder.dateTimePicker(dateTimePicker)
  }

  /**
   * @param dateTimePicker A control from a date parameter that specifies date and time.
   */
  public fun dateTimePicker(dateTimePicker: CfnAnalysis.ParameterDateTimePickerControlProperty) {
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
  public fun dropdown(dropdown: CfnAnalysis.ParameterDropDownControlProperty) {
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
  public fun list(list: CfnAnalysis.ParameterListControlProperty) {
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
  public fun slider(slider: CfnAnalysis.ParameterSliderControlProperty) {
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
  public fun textArea(textArea: CfnAnalysis.ParameterTextAreaControlProperty) {
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
  public fun textField(textField: CfnAnalysis.ParameterTextFieldControlProperty) {
    cdkBuilder.textField(textField)
  }

  public fun build(): CfnAnalysis.ParameterControlProperty = cdkBuilder.build()
}
