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

package io.cloudshiftdev.awscdkdsl.services.amplifyuibuilder

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm

/**
 * The `ValueMapping` property specifies the association between a complex object and a display
 * value.
 *
 * Use `ValueMapping` to store how to represent complex objects when they are displayed.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * FormInputValuePropertyProperty formInputValuePropertyProperty_;
 * ValueMappingProperty valueMappingProperty = ValueMappingProperty.builder()
 * .value(FormInputValuePropertyProperty.builder()
 * .bindingProperties(FormInputValuePropertyBindingPropertiesProperty.builder()
 * .property("property")
 * // the properties below are optional
 * .field("field")
 * .build())
 * .concat(List.of(formInputValuePropertyProperty_))
 * .value("value")
 * .build())
 * // the properties below are optional
 * .displayValue(FormInputValuePropertyProperty.builder()
 * .bindingProperties(FormInputValuePropertyBindingPropertiesProperty.builder()
 * .property("property")
 * // the properties below are optional
 * .field("field")
 * .build())
 * .concat(List.of(formInputValuePropertyProperty_))
 * .value("value")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-valuemapping.html)
 */
@CdkDslMarker
public class CfnFormValueMappingPropertyDsl {
    private val cdkBuilder: CfnForm.ValueMappingProperty.Builder =
        CfnForm.ValueMappingProperty.builder()

    /** @param displayValue The value to display for the complex object. */
    public fun displayValue(displayValue: IResolvable) {
        cdkBuilder.displayValue(displayValue)
    }

    /** @param displayValue The value to display for the complex object. */
    public fun displayValue(displayValue: CfnForm.FormInputValuePropertyProperty) {
        cdkBuilder.displayValue(displayValue)
    }

    /** @param value The complex object. */
    public fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`)
    }

    /** @param value The complex object. */
    public fun `value`(`value`: CfnForm.FormInputValuePropertyProperty) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnForm.ValueMappingProperty = cdkBuilder.build()
}
