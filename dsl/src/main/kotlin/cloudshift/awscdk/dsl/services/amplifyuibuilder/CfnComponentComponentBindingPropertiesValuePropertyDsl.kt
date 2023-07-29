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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent

/**
 * The `ComponentBindingPropertiesValue` property specifies the data binding configuration for a
 * component at runtime.
 *
 * You can use `ComponentBindingPropertiesValue` to add exposed properties to a component to allow
 * different values to be entered when a component is reused in different places in an app.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * PredicateProperty predicateProperty_;
 * ComponentBindingPropertiesValueProperty componentBindingPropertiesValueProperty =
 * ComponentBindingPropertiesValueProperty.builder()
 * .bindingProperties(ComponentBindingPropertiesValuePropertiesProperty.builder()
 * .bucket("bucket")
 * .defaultValue("defaultValue")
 * .field("field")
 * .key("key")
 * .model("model")
 * .predicates(List.of(PredicateProperty.builder()
 * .and(List.of(predicateProperty_))
 * .field("field")
 * .operand("operand")
 * .operator("operator")
 * .or(List.of(predicateProperty_))
 * .build()))
 * .userAttribute("userAttribute")
 * .build())
 * .defaultValue("defaultValue")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentbindingpropertiesvalue.html)
 */
@CdkDslMarker
public class CfnComponentComponentBindingPropertiesValuePropertyDsl {
    private val cdkBuilder: CfnComponent.ComponentBindingPropertiesValueProperty.Builder =
        CfnComponent.ComponentBindingPropertiesValueProperty.builder()

    /** @param bindingProperties Describes the properties to customize with data at runtime. */
    public fun bindingProperties(bindingProperties: IResolvable) {
        cdkBuilder.bindingProperties(bindingProperties)
    }

    /** @param bindingProperties Describes the properties to customize with data at runtime. */
    public fun bindingProperties(
        bindingProperties: CfnComponent.ComponentBindingPropertiesValuePropertiesProperty
    ) {
        cdkBuilder.bindingProperties(bindingProperties)
    }

    /** @param defaultValue The default value of the property. */
    public fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
    }

    /** @param type The property type. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnComponent.ComponentBindingPropertiesValueProperty = cdkBuilder.build()
}
