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

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnFormFieldInputConfigPropertyDsl {
    private val cdkBuilder: CfnForm.FieldInputConfigProperty.Builder =
        CfnForm.FieldInputConfigProperty.builder()

    public fun defaultChecked(defaultChecked: Boolean) {
        cdkBuilder.defaultChecked(defaultChecked)
    }

    public fun defaultChecked(defaultChecked: IResolvable) {
        cdkBuilder.defaultChecked(defaultChecked)
    }

    public fun defaultCountryCode(defaultCountryCode: String) {
        cdkBuilder.defaultCountryCode(defaultCountryCode)
    }

    public fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
    }

    public fun descriptiveText(descriptiveText: String) {
        cdkBuilder.descriptiveText(descriptiveText)
    }

    public fun fileUploaderConfig(fileUploaderConfig: IResolvable) {
        cdkBuilder.fileUploaderConfig(fileUploaderConfig)
    }

    public fun fileUploaderConfig(fileUploaderConfig: CfnForm.FileUploaderFieldConfigProperty) {
        cdkBuilder.fileUploaderConfig(fileUploaderConfig)
    }

    public fun isArray(isArray: Boolean) {
        cdkBuilder.isArray(isArray)
    }

    public fun isArray(isArray: IResolvable) {
        cdkBuilder.isArray(isArray)
    }

    public fun maxValue(maxValue: Number) {
        cdkBuilder.maxValue(maxValue)
    }

    public fun minValue(minValue: Number) {
        cdkBuilder.minValue(minValue)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun placeholder(placeholder: String) {
        cdkBuilder.placeholder(placeholder)
    }

    public fun readOnly(readOnly: Boolean) {
        cdkBuilder.readOnly(readOnly)
    }

    public fun readOnly(readOnly: IResolvable) {
        cdkBuilder.readOnly(readOnly)
    }

    public fun required(required: Boolean) {
        cdkBuilder.required(required)
    }

    public fun required(required: IResolvable) {
        cdkBuilder.required(required)
    }

    public fun step(step: Number) {
        cdkBuilder.step(step)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun valueMappings(valueMappings: IResolvable) {
        cdkBuilder.valueMappings(valueMappings)
    }

    public fun valueMappings(valueMappings: CfnForm.ValueMappingsProperty) {
        cdkBuilder.valueMappings(valueMappings)
    }

    public fun build(): CfnForm.FieldInputConfigProperty = cdkBuilder.build()
}
