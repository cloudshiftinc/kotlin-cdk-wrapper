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
 * Associates a form property to a binding property.
 *
 * This enables exposed properties on the top level form to propagate data to the form's property
 * values.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * FormInputValuePropertyBindingPropertiesProperty formInputValuePropertyBindingPropertiesProperty =
 * FormInputValuePropertyBindingPropertiesProperty.builder()
 * .property("property")
 * // the properties below are optional
 * .field("field")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-forminputvaluepropertybindingproperties.html)
 */
@CdkDslMarker
public class CfnFormFormInputValuePropertyBindingPropertiesPropertyDsl {
    private val cdkBuilder: CfnForm.FormInputValuePropertyBindingPropertiesProperty.Builder =
        CfnForm.FormInputValuePropertyBindingPropertiesProperty.builder()

    /** @param field The data field to bind the property to. */
    public fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
    }

    /** @param property The form property to bind to the data field. */
    public fun `property`(`property`: String) {
        cdkBuilder.`property`(`property`)
    }

    public fun build(): CfnForm.FormInputValuePropertyBindingPropertiesProperty = cdkBuilder.build()
}
