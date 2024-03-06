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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
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
 * FormInputValuePropertyProperty formInputValuePropertyProperty_;
 * FormInputValuePropertyProperty formInputValuePropertyProperty =
 * FormInputValuePropertyProperty.builder()
 * .bindingProperties(FormInputValuePropertyBindingPropertiesProperty.builder()
 * .property("property")
 * // the properties below are optional
 * .field("field")
 * .build())
 * .concat(List.of(formInputValuePropertyProperty_))
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

    private val _concat: MutableList<Any> = mutableListOf()

    /** @param bindingProperties The information to bind fields to data at runtime. */
    public fun bindingProperties(bindingProperties: IResolvable) {
        cdkBuilder.bindingProperties(bindingProperties)
    }

    /** @param bindingProperties The information to bind fields to data at runtime. */
    public fun bindingProperties(
        bindingProperties: CfnForm.FormInputValuePropertyBindingPropertiesProperty
    ) {
        cdkBuilder.bindingProperties(bindingProperties)
    }

    /**
     * @param concat A list of form properties to concatenate to create the value to assign to this
     *   field property.
     */
    public fun concat(vararg concat: Any) {
        _concat.addAll(listOf(*concat))
    }

    /**
     * @param concat A list of form properties to concatenate to create the value to assign to this
     *   field property.
     */
    public fun concat(concat: Collection<Any>) {
        _concat.addAll(concat)
    }

    /**
     * @param concat A list of form properties to concatenate to create the value to assign to this
     *   field property.
     */
    public fun concat(concat: IResolvable) {
        cdkBuilder.concat(concat)
    }

    /** @param value The value to assign to the input field. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnForm.FormInputValuePropertyProperty {
        if (_concat.isNotEmpty()) cdkBuilder.concat(_concat)
        return cdkBuilder.build()
    }
}
