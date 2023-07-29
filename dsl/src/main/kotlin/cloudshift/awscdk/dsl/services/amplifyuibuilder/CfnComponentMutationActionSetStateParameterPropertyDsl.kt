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
 * Represents the state configuration when an action modifies a property of another element within
 * the same component.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * ComponentPropertyProperty componentPropertyProperty_;
 * MutationActionSetStateParameterProperty mutationActionSetStateParameterProperty =
 * MutationActionSetStateParameterProperty.builder()
 * .componentName("componentName")
 * .property("property")
 * .set(ComponentPropertyProperty.builder()
 * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
 * .property("property")
 * // the properties below are optional
 * .field("field")
 * .build())
 * .bindings(Map.of(
 * "bindingsKey", FormBindingElementProperty.builder()
 * .element("element")
 * .property("property")
 * .build()))
 * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
 * .property("property")
 * // the properties below are optional
 * .field("field")
 * .build())
 * .componentName("componentName")
 * .concat(List.of(componentPropertyProperty_))
 * .condition(ComponentConditionPropertyProperty.builder()
 * .else(componentPropertyProperty_)
 * .field("field")
 * .operand("operand")
 * .operandType("operandType")
 * .operator("operator")
 * .property("property")
 * .then(componentPropertyProperty_)
 * .build())
 * .configured(false)
 * .defaultValue("defaultValue")
 * .event("event")
 * .importedValue("importedValue")
 * .model("model")
 * .property("property")
 * .type("type")
 * .userAttribute("userAttribute")
 * .value("value")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-mutationactionsetstateparameter.html)
 */
@CdkDslMarker
public class CfnComponentMutationActionSetStateParameterPropertyDsl {
    private val cdkBuilder: CfnComponent.MutationActionSetStateParameterProperty.Builder =
        CfnComponent.MutationActionSetStateParameterProperty.builder()

    /** @param componentName The name of the component that is being modified. */
    public fun componentName(componentName: String) {
        cdkBuilder.componentName(componentName)
    }

    /** @param property The name of the component property to apply the state configuration to. */
    public fun `property`(`property`: String) {
        cdkBuilder.`property`(`property`)
    }

    /** @param set The state configuration to assign to the property. */
    public fun `set`(`set`: IResolvable) {
        cdkBuilder.`set`(`set`)
    }

    /** @param set The state configuration to assign to the property. */
    public fun `set`(`set`: CfnComponent.ComponentPropertyProperty) {
        cdkBuilder.`set`(`set`)
    }

    public fun build(): CfnComponent.MutationActionSetStateParameterProperty = cdkBuilder.build()
}
