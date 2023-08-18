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
import kotlin.collections.Collection
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
 * ValueMappingsProperty valueMappingsProperty = ValueMappingsProperty.builder()
 * .values(List.of(ValueMappingProperty.builder()
 * .value(FormInputValuePropertyProperty.builder()
 * .value("value")
 * .build())
 * // the properties below are optional
 * .displayValue(FormInputValuePropertyProperty.builder()
 * .value("value")
 * .build())
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
