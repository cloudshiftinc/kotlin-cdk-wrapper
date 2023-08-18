@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The control of a filter that is used to interact with a dashboard or an analysis.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FilterControlProperty filterControlProperty = FilterControlProperty.builder()
 * .dateTimePicker(FilterDateTimePickerControlProperty.builder()
 * .filterControlId("filterControlId")
 * .sourceFilterId("sourceFilterId")
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
 * .type("type")
 * .build())
 * .dropdown(FilterDropDownControlProperty.builder()
 * .filterControlId("filterControlId")
 * .sourceFilterId("sourceFilterId")
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
 * .selectableValues(FilterSelectableValuesProperty.builder()
 * .values(List.of("values"))
 * .build())
 * .type("type")
 * .build())
 * .list(FilterListControlProperty.builder()
 * .filterControlId("filterControlId")
 * .sourceFilterId("sourceFilterId")
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
 * .selectableValues(FilterSelectableValuesProperty.builder()
 * .values(List.of("values"))
 * .build())
 * .type("type")
 * .build())
 * .relativeDateTime(FilterRelativeDateTimeControlProperty.builder()
 * .filterControlId("filterControlId")
 * .sourceFilterId("sourceFilterId")
 * .title("title")
 * // the properties below are optional
 * .displayOptions(RelativeDateTimeControlDisplayOptionsProperty.builder()
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
 * .slider(FilterSliderControlProperty.builder()
 * .filterControlId("filterControlId")
 * .maximumValue(123)
 * .minimumValue(123)
 * .sourceFilterId("sourceFilterId")
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
 * .type("type")
 * .build())
 * .textArea(FilterTextAreaControlProperty.builder()
 * .filterControlId("filterControlId")
 * .sourceFilterId("sourceFilterId")
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
 * .textField(FilterTextFieldControlProperty.builder()
 * .filterControlId("filterControlId")
 * .sourceFilterId("sourceFilterId")
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-filtercontrol.html)
 */
@CdkDslMarker
public class CfnAnalysisFilterControlPropertyDsl {
    private val cdkBuilder: CfnAnalysis.FilterControlProperty.Builder =
        CfnAnalysis.FilterControlProperty.builder()

    /** @param dateTimePicker A control from a date filter that is used to specify date and time. */
    public fun dateTimePicker(dateTimePicker: IResolvable) {
        cdkBuilder.dateTimePicker(dateTimePicker)
    }

    /** @param dateTimePicker A control from a date filter that is used to specify date and time. */
    public fun dateTimePicker(dateTimePicker: CfnAnalysis.FilterDateTimePickerControlProperty) {
        cdkBuilder.dateTimePicker(dateTimePicker)
    }

    /**
     * @param dropdown A control to display a dropdown list with buttons that are used to select a
     *   single value.
     */
    public fun dropdown(dropdown: IResolvable) {
        cdkBuilder.dropdown(dropdown)
    }

    /**
     * @param dropdown A control to display a dropdown list with buttons that are used to select a
     *   single value.
     */
    public fun dropdown(dropdown: CfnAnalysis.FilterDropDownControlProperty) {
        cdkBuilder.dropdown(dropdown)
    }

    /**
     * @param list A control to display a list of buttons or boxes. This is used to select either a
     *   single value or multiple values.
     */
    public fun list(list: IResolvable) {
        cdkBuilder.list(list)
    }

    /**
     * @param list A control to display a list of buttons or boxes. This is used to select either a
     *   single value or multiple values.
     */
    public fun list(list: CfnAnalysis.FilterListControlProperty) {
        cdkBuilder.list(list)
    }

    /**
     * @param relativeDateTime A control from a date filter that is used to specify the relative
     *   date.
     */
    public fun relativeDateTime(relativeDateTime: IResolvable) {
        cdkBuilder.relativeDateTime(relativeDateTime)
    }

    /**
     * @param relativeDateTime A control from a date filter that is used to specify the relative
     *   date.
     */
    public fun relativeDateTime(
        relativeDateTime: CfnAnalysis.FilterRelativeDateTimeControlProperty
    ) {
        cdkBuilder.relativeDateTime(relativeDateTime)
    }

    /**
     * @param slider A control to display a horizontal toggle bar. This is used to change a value by
     *   sliding the toggle.
     */
    public fun slider(slider: IResolvable) {
        cdkBuilder.slider(slider)
    }

    /**
     * @param slider A control to display a horizontal toggle bar. This is used to change a value by
     *   sliding the toggle.
     */
    public fun slider(slider: CfnAnalysis.FilterSliderControlProperty) {
        cdkBuilder.slider(slider)
    }

    /** @param textArea A control to display a text box that is used to enter multiple entries. */
    public fun textArea(textArea: IResolvable) {
        cdkBuilder.textArea(textArea)
    }

    /** @param textArea A control to display a text box that is used to enter multiple entries. */
    public fun textArea(textArea: CfnAnalysis.FilterTextAreaControlProperty) {
        cdkBuilder.textArea(textArea)
    }

    /** @param textField A control to display a text box that is used to enter a single entry. */
    public fun textField(textField: IResolvable) {
        cdkBuilder.textField(textField)
    }

    /** @param textField A control to display a text box that is used to enter a single entry. */
    public fun textField(textField: CfnAnalysis.FilterTextFieldControlProperty) {
        cdkBuilder.textField(textField)
    }

    public fun build(): CfnAnalysis.FilterControlProperty = cdkBuilder.build()
}
