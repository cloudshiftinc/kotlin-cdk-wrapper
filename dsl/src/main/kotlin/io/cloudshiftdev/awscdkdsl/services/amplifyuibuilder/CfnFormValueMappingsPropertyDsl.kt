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
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm

/**
 * The `ValueMappings` property specifies the data binding configuration for a value map.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * FormInputValuePropertyProperty formInputValuePropertyProperty_;
 * ValueMappingsProperty valueMappingsProperty = ValueMappingsProperty.builder()
 * .values(List.of(ValueMappingProperty.builder()
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
 * .build()))
 * // the properties below are optional
 * .bindingProperties(Map.of(
 * "bindingPropertiesKey", FormInputBindingPropertiesValueProperty.builder()
 * .bindingProperties(FormInputBindingPropertiesValuePropertiesProperty.builder()
 * .model("model")
 * .build())
 * .type("type")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-valuemappings.html)
 */
@CdkDslMarker
public class CfnFormValueMappingsPropertyDsl {
    private val cdkBuilder: CfnForm.ValueMappingsProperty.Builder =
        CfnForm.ValueMappingsProperty.builder()

    private val _values: MutableList<Any> = mutableListOf()

    /** @param bindingProperties The information to bind fields to data at runtime. */
    public fun bindingProperties(bindingProperties: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(bindingProperties)
        cdkBuilder.bindingProperties(builder.map)
    }

    /** @param bindingProperties The information to bind fields to data at runtime. */
    public fun bindingProperties(bindingProperties: Map<String, Any>) {
        cdkBuilder.bindingProperties(bindingProperties)
    }

    /** @param bindingProperties The information to bind fields to data at runtime. */
    public fun bindingProperties(bindingProperties: IResolvable) {
        cdkBuilder.bindingProperties(bindingProperties)
    }

    /** @param values The value and display value pairs. */
    public fun values(vararg values: Any) {
        _values.addAll(listOf(*values))
    }

    /** @param values The value and display value pairs. */
    public fun values(values: Collection<Any>) {
        _values.addAll(values)
    }

    /** @param values The value and display value pairs. */
    public fun values(values: IResolvable) {
        cdkBuilder.values(values)
    }

    public fun build(): CfnForm.ValueMappingsProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
