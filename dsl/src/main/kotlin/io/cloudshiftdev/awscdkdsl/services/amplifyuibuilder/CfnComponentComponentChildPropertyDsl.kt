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
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent

/**
 * The `ComponentChild` property specifies a nested UI configuration within a parent `Component` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * ComponentChildProperty componentChildProperty_;
 * ComponentPropertyProperty componentPropertyProperty_;
 * ComponentChildProperty componentChildProperty = ComponentChildProperty.builder()
 * .componentType("componentType")
 * .name("name")
 * .properties(Map.of(
 * "propertiesKey", ComponentPropertyProperty.builder()
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
 * // the properties below are optional
 * .children(List.of(componentChildProperty_))
 * .events(Map.of(
 * "eventsKey", ComponentEventProperty.builder()
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
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentchild.html)
 */
@CdkDslMarker
public class CfnComponentComponentChildPropertyDsl {
    private val cdkBuilder: CfnComponent.ComponentChildProperty.Builder =
        CfnComponent.ComponentChildProperty.builder()

    private val _children: MutableList<Any> = mutableListOf()

    /** @param children The list of `ComponentChild` instances for this component. */
    public fun children(vararg children: Any) {
        _children.addAll(listOf(*children))
    }

    /** @param children The list of `ComponentChild` instances for this component. */
    public fun children(children: Collection<Any>) {
        _children.addAll(children)
    }

    /** @param children The list of `ComponentChild` instances for this component. */
    public fun children(children: IResolvable) {
        cdkBuilder.children(children)
    }

    /** @param componentType The type of the child component. */
    public fun componentType(componentType: String) {
        cdkBuilder.componentType(componentType)
    }

    /**
     * @param events Describes the events that can be raised on the child component. Use for the
     *   workflow feature in Amplify Studio that allows you to bind events and actions to
     *   components.
     */
    public fun events(events: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(events)
        cdkBuilder.events(builder.map)
    }

    /**
     * @param events Describes the events that can be raised on the child component. Use for the
     *   workflow feature in Amplify Studio that allows you to bind events and actions to
     *   components.
     */
    public fun events(events: Map<String, Any>) {
        cdkBuilder.events(events)
    }

    /**
     * @param events Describes the events that can be raised on the child component. Use for the
     *   workflow feature in Amplify Studio that allows you to bind events and actions to
     *   components.
     */
    public fun events(events: IResolvable) {
        cdkBuilder.events(events)
    }

    /** @param name The name of the child component. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param properties Describes the properties of the child component. You can't specify `tags`
     *   as a valid property for `properties` .
     */
    public fun properties(properties: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(properties)
        cdkBuilder.properties(builder.map)
    }

    /**
     * @param properties Describes the properties of the child component. You can't specify `tags`
     *   as a valid property for `properties` .
     */
    public fun properties(properties: Map<String, Any>) {
        cdkBuilder.properties(properties)
    }

    /**
     * @param properties Describes the properties of the child component. You can't specify `tags`
     *   as a valid property for `properties` .
     */
    public fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties)
    }

    public fun build(): CfnComponent.ComponentChildProperty {
        if (_children.isNotEmpty()) cdkBuilder.children(_children)
        return cdkBuilder.build()
    }
}
