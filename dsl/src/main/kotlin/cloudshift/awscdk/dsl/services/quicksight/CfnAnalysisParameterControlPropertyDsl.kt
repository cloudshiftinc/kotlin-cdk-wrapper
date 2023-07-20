@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisParameterControlPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ParameterControlProperty.Builder =
        CfnAnalysis.ParameterControlProperty.builder()

    public fun dateTimePicker(dateTimePicker: IResolvable) {
        cdkBuilder.dateTimePicker(dateTimePicker)
    }

    public fun dateTimePicker(dateTimePicker: CfnAnalysis.ParameterDateTimePickerControlProperty) {
        cdkBuilder.dateTimePicker(dateTimePicker)
    }

    public fun dropdown(dropdown: IResolvable) {
        cdkBuilder.dropdown(dropdown)
    }

    public fun dropdown(dropdown: CfnAnalysis.ParameterDropDownControlProperty) {
        cdkBuilder.dropdown(dropdown)
    }

    public fun list(list: IResolvable) {
        cdkBuilder.list(list)
    }

    public fun list(list: CfnAnalysis.ParameterListControlProperty) {
        cdkBuilder.list(list)
    }

    public fun slider(slider: IResolvable) {
        cdkBuilder.slider(slider)
    }

    public fun slider(slider: CfnAnalysis.ParameterSliderControlProperty) {
        cdkBuilder.slider(slider)
    }

    public fun textArea(textArea: IResolvable) {
        cdkBuilder.textArea(textArea)
    }

    public fun textArea(textArea: CfnAnalysis.ParameterTextAreaControlProperty) {
        cdkBuilder.textArea(textArea)
    }

    public fun textField(textField: IResolvable) {
        cdkBuilder.textField(textField)
    }

    public fun textField(textField: CfnAnalysis.ParameterTextFieldControlProperty) {
        cdkBuilder.textField(textField)
    }

    public fun build(): CfnAnalysis.ParameterControlProperty = cdkBuilder.build()
}
