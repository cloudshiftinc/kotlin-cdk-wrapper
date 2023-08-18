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
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent

/**
 * The `ComponentEvent` property specifies the configuration of an event.
 *
 * You can bind an event and a corresponding action to a `Component` or a `ComponentChild` . A
 * button click is an example of an event.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * ComponentPropertyProperty componentPropertyProperty_;
 * ComponentEventProperty componentEventProperty = ComponentEventProperty.builder()
 * .action("action")
 * .parameters(ActionParametersProperty.builder()
 * .anchor(ComponentPropertyProperty.builder()
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
 * .fields(Map.of(
 * "fieldsKey", ComponentPropertyProperty.builder()
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
 * .build()))
 * .global(ComponentPropertyProperty.builder()
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
 * .id(ComponentPropertyProperty.builder()
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
 * .model("model")
 * .state(MutationActionSetStateParameterProperty.builder()
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
 * .build())
 * .target(ComponentPropertyProperty.builder()
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
 * .type(ComponentPropertyProperty.builder()
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
 * .url(ComponentPropertyProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentevent.html)
 */
@CdkDslMarker
public class CfnComponentComponentEventPropertyDsl {
    private val cdkBuilder: CfnComponent.ComponentEventProperty.Builder =
        CfnComponent.ComponentEventProperty.builder()

    /** @param action The action to perform when a specific event is raised. */
    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    /** @param parameters Describes information about the action. */
    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    /** @param parameters Describes information about the action. */
    public fun parameters(parameters: CfnComponent.ActionParametersProperty) {
        cdkBuilder.parameters(parameters)
    }

    public fun build(): CfnComponent.ComponentEventProperty = cdkBuilder.build()
}
