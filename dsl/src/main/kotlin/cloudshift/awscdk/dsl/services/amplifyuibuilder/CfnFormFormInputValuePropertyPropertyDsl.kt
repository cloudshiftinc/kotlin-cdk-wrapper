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

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm

/**
 * The `FormInputValueProperty` property specifies the configuration for an input field on a form.
 *
 * Use `FormInputValueProperty` to specify the values to render or bind by default.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * FormInputValuePropertyProperty formInputValuePropertyProperty =
 * FormInputValuePropertyProperty.builder()
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-forminputvalueproperty.html)
 */
@CdkDslMarker
public class CfnFormFormInputValuePropertyPropertyDsl {
    private val cdkBuilder: CfnForm.FormInputValuePropertyProperty.Builder =
        CfnForm.FormInputValuePropertyProperty.builder()

    /** @param value The value to assign to the input field. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnForm.FormInputValuePropertyProperty = cdkBuilder.build()
}
