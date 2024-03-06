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
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm

/**
 * Represents the data binding configuration for a specific property using data stored in AWS .
 *
 * For AWS connected properties, you can bind a property to data stored in an Amplify DataStore
 * model.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * FormInputBindingPropertiesValuePropertiesProperty
 * formInputBindingPropertiesValuePropertiesProperty =
 * FormInputBindingPropertiesValuePropertiesProperty.builder()
 * .model("model")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-forminputbindingpropertiesvalueproperties.html)
 */
@CdkDslMarker
public class CfnFormFormInputBindingPropertiesValuePropertiesPropertyDsl {
    private val cdkBuilder: CfnForm.FormInputBindingPropertiesValuePropertiesProperty.Builder =
        CfnForm.FormInputBindingPropertiesValuePropertiesProperty.builder()

    /** @param model An Amplify DataStore model. */
    public fun model(model: String) {
        cdkBuilder.model(model)
    }

    public fun build(): CfnForm.FormInputBindingPropertiesValuePropertiesProperty =
        cdkBuilder.build()
}
