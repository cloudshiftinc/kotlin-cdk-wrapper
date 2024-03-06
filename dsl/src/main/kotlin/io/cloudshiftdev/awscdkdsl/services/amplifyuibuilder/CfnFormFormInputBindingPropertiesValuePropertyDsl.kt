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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm

/**
 * Represents the data binding configuration for a form's input fields at runtime.You can use
 * `FormInputBindingPropertiesValue` to add exposed properties to a form to allow different values
 * to be entered when a form is reused in different places in an app.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * FormInputBindingPropertiesValueProperty formInputBindingPropertiesValueProperty =
 * FormInputBindingPropertiesValueProperty.builder()
 * .bindingProperties(FormInputBindingPropertiesValuePropertiesProperty.builder()
 * .model("model")
 * .build())
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-forminputbindingpropertiesvalue.html)
 */
@CdkDslMarker
public class CfnFormFormInputBindingPropertiesValuePropertyDsl {
    private val cdkBuilder: CfnForm.FormInputBindingPropertiesValueProperty.Builder =
        CfnForm.FormInputBindingPropertiesValueProperty.builder()

    /** @param bindingProperties Describes the properties to customize with data at runtime. */
    public fun bindingProperties(bindingProperties: IResolvable) {
        cdkBuilder.bindingProperties(bindingProperties)
    }

    /** @param bindingProperties Describes the properties to customize with data at runtime. */
    public fun bindingProperties(
        bindingProperties: CfnForm.FormInputBindingPropertiesValuePropertiesProperty
    ) {
        cdkBuilder.bindingProperties(bindingProperties)
    }

    /** @param type The property type. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnForm.FormInputBindingPropertiesValueProperty = cdkBuilder.build()
}
