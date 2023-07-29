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
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent

/**
 * Represents the event action configuration for an element of a `Component` or `ComponentChild` .
 *
 * Use for the workflow feature in Amplify Studio that allows you to bind events and actions to
 * components. `ActionParameters` defines the action that is performed when an event occurs on the
 * component.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * ComponentPropertyProperty componentPropertyProperty_;
 * ActionParametersProperty actionParametersProperty = ActionParametersProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-actionparameters.html)
 */
@CdkDslMarker
public class CfnComponentActionParametersPropertyDsl {
    private val cdkBuilder: CfnComponent.ActionParametersProperty.Builder =
        CfnComponent.ActionParametersProperty.builder()

    /**
     * @param anchor The HTML anchor link to the location to open. Specify this value for a
     *   navigation action.
     */
    public fun anchor(anchor: IResolvable) {
        cdkBuilder.anchor(anchor)
    }

    /**
     * @param anchor The HTML anchor link to the location to open. Specify this value for a
     *   navigation action.
     */
    public fun anchor(anchor: CfnComponent.ComponentPropertyProperty) {
        cdkBuilder.anchor(anchor)
    }

    /**
     * @param fields A dictionary of key-value pairs mapping Amplify Studio properties to fields in
     *   a data model. Use when the action performs an operation on an Amplify DataStore model.
     */
    public fun fields(fields: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(fields)
        cdkBuilder.fields(builder.map)
    }

    /**
     * @param fields A dictionary of key-value pairs mapping Amplify Studio properties to fields in
     *   a data model. Use when the action performs an operation on an Amplify DataStore model.
     */
    public fun fields(fields: Map<String, Any>) {
        cdkBuilder.fields(fields)
    }

    /**
     * @param fields A dictionary of key-value pairs mapping Amplify Studio properties to fields in
     *   a data model. Use when the action performs an operation on an Amplify DataStore model.
     */
    public fun fields(fields: IResolvable) {
        cdkBuilder.fields(fields)
    }

    /**
     * @param global Specifies whether the user should be signed out globally. Specify this value
     *   for an auth sign out action.
     */
    public fun global(global: IResolvable) {
        cdkBuilder.global(global)
    }

    /**
     * @param global Specifies whether the user should be signed out globally. Specify this value
     *   for an auth sign out action.
     */
    public fun global(global: CfnComponent.ComponentPropertyProperty) {
        cdkBuilder.global(global)
    }

    /** @param id The unique ID of the component that the `ActionParameters` apply to. */
    public fun id(id: IResolvable) {
        cdkBuilder.id(id)
    }

    /** @param id The unique ID of the component that the `ActionParameters` apply to. */
    public fun id(id: CfnComponent.ComponentPropertyProperty) {
        cdkBuilder.id(id)
    }

    /**
     * @param model The name of the data model. Use when the action performs an operation on an
     *   Amplify DataStore model.
     */
    public fun model(model: String) {
        cdkBuilder.model(model)
    }

    /**
     * @param state A key-value pair that specifies the state property name and its initial value.
     */
    public fun state(state: IResolvable) {
        cdkBuilder.state(state)
    }

    /**
     * @param state A key-value pair that specifies the state property name and its initial value.
     */
    public fun state(state: CfnComponent.MutationActionSetStateParameterProperty) {
        cdkBuilder.state(state)
    }

    /** @param target The element within the same component to modify when the action occurs. */
    public fun target(target: IResolvable) {
        cdkBuilder.target(target)
    }

    /** @param target The element within the same component to modify when the action occurs. */
    public fun target(target: CfnComponent.ComponentPropertyProperty) {
        cdkBuilder.target(target)
    }

    /**
     * @param type The type of navigation action. Valid values are `url` and `anchor` . This value
     *   is required for a navigation action.
     */
    public fun type(type: IResolvable) {
        cdkBuilder.type(type)
    }

    /**
     * @param type The type of navigation action. Valid values are `url` and `anchor` . This value
     *   is required for a navigation action.
     */
    public fun type(type: CfnComponent.ComponentPropertyProperty) {
        cdkBuilder.type(type)
    }

    /** @param url The URL to the location to open. Specify this value for a navigation action. */
    public fun url(url: IResolvable) {
        cdkBuilder.url(url)
    }

    /** @param url The URL to the location to open. Specify this value for a navigation action. */
    public fun url(url: CfnComponent.ComponentPropertyProperty) {
        cdkBuilder.url(url)
    }

    public fun build(): CfnComponent.ActionParametersProperty = cdkBuilder.build()
}
