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
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateFilterControlPropertyDsl {
    private val cdkBuilder: CfnTemplate.FilterControlProperty.Builder =
        CfnTemplate.FilterControlProperty.builder()

    public fun dateTimePicker(dateTimePicker: IResolvable) {
        cdkBuilder.dateTimePicker(dateTimePicker)
    }

    public fun dateTimePicker(dateTimePicker: CfnTemplate.FilterDateTimePickerControlProperty) {
        cdkBuilder.dateTimePicker(dateTimePicker)
    }

    public fun dropdown(dropdown: IResolvable) {
        cdkBuilder.dropdown(dropdown)
    }

    public fun dropdown(dropdown: CfnTemplate.FilterDropDownControlProperty) {
        cdkBuilder.dropdown(dropdown)
    }

    public fun list(list: IResolvable) {
        cdkBuilder.list(list)
    }

    public fun list(list: CfnTemplate.FilterListControlProperty) {
        cdkBuilder.list(list)
    }

    public fun relativeDateTime(relativeDateTime: IResolvable) {
        cdkBuilder.relativeDateTime(relativeDateTime)
    }

    public fun relativeDateTime(relativeDateTime: CfnTemplate.FilterRelativeDateTimeControlProperty) {
        cdkBuilder.relativeDateTime(relativeDateTime)
    }

    public fun slider(slider: IResolvable) {
        cdkBuilder.slider(slider)
    }

    public fun slider(slider: CfnTemplate.FilterSliderControlProperty) {
        cdkBuilder.slider(slider)
    }

    public fun textArea(textArea: IResolvable) {
        cdkBuilder.textArea(textArea)
    }

    public fun textArea(textArea: CfnTemplate.FilterTextAreaControlProperty) {
        cdkBuilder.textArea(textArea)
    }

    public fun textField(textField: IResolvable) {
        cdkBuilder.textField(textField)
    }

    public fun textField(textField: CfnTemplate.FilterTextFieldControlProperty) {
        cdkBuilder.textField(textField)
    }

    public fun build(): CfnTemplate.FilterControlProperty = cdkBuilder.build()
}
