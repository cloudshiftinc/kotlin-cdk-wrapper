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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponentProps
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm
import software.amazon.awscdk.services.amplifyuibuilder.CfnFormProps
import software.amazon.awscdk.services.amplifyuibuilder.CfnTheme
import software.amazon.awscdk.services.amplifyuibuilder.CfnThemeProps
import software.constructs.Construct

public object amplifyuibuilder {
    /**
     * The AWS::AmplifyUIBuilder::Component resource specifies a component within an Amplify app.
     *
     * A component is a user interface (UI) element that you can customize. Use `ComponentChild` to
     * configure an instance of a `Component` . A `ComponentChild` instance inherits the
     * configuration of the main `Component` .
     *
     * Example:
     * ```
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html)
     */
    public inline fun cfnComponent(
        scope: Construct,
        id: String,
        block: CfnComponentDsl.() -> Unit = {},
    ): CfnComponent {
        val builder = CfnComponentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the event action configuration for an element of a `Component` or `ComponentChild`
     * .
     *
     * Use for the workflow feature in Amplify Studio that allows you to bind events and actions to
     * components. `ActionParameters` defines the action that is performed when an event occurs on
     * the component.
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
    public inline fun cfnComponentActionParametersProperty(
        block: CfnComponentActionParametersPropertyDsl.() -> Unit = {}
    ): CfnComponent.ActionParametersProperty {
        val builder = CfnComponentActionParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `ComponentBindingPropertiesValueProperties` property specifies the data binding
     * configuration for a specific property using data stored in AWS .
     *
     * For AWS connected properties, you can bind a property to data stored in an Amazon S3 bucket,
     * an Amplify DataStore model or an authenticated user attribute.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplifyuibuilder.*;
     * PredicateProperty predicateProperty_;
     * ComponentBindingPropertiesValuePropertiesProperty
     * componentBindingPropertiesValuePropertiesProperty =
     * ComponentBindingPropertiesValuePropertiesProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentbindingpropertiesvalueproperties.html)
     */
    public inline fun cfnComponentComponentBindingPropertiesValuePropertiesProperty(
        block: CfnComponentComponentBindingPropertiesValuePropertiesPropertyDsl.() -> Unit = {}
    ): CfnComponent.ComponentBindingPropertiesValuePropertiesProperty {
        val builder = CfnComponentComponentBindingPropertiesValuePropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `ComponentBindingPropertiesValue` property specifies the data binding configuration for a
     * component at runtime.
     *
     * You can use `ComponentBindingPropertiesValue` to add exposed properties to a component to
     * allow different values to be entered when a component is reused in different places in an
     * app.
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
    public inline fun cfnComponentComponentBindingPropertiesValueProperty(
        block: CfnComponentComponentBindingPropertiesValuePropertyDsl.() -> Unit = {}
    ): CfnComponent.ComponentBindingPropertiesValueProperty {
        val builder = CfnComponentComponentBindingPropertiesValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `ComponentChild` property specifies a nested UI configuration within a parent `Component`
     * .
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
    public inline fun cfnComponentComponentChildProperty(
        block: CfnComponentComponentChildPropertyDsl.() -> Unit = {}
    ): CfnComponent.ComponentChildProperty {
        val builder = CfnComponentComponentChildPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `ComponentConditionProperty` property specifies a conditional expression for setting a
     * component property.
     *
     * Use `ComponentConditionProperty` to set a property to different values conditionally, based
     * on the value of another property.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplifyuibuilder.*;
     * ComponentConditionPropertyProperty componentConditionPropertyProperty_;
     * ComponentPropertyProperty componentPropertyProperty_;
     * ComponentConditionPropertyProperty componentConditionPropertyProperty =
     * ComponentConditionPropertyProperty.builder()
     * .else(ComponentPropertyProperty.builder()
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
     * .condition(componentConditionPropertyProperty_)
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
     * .field("field")
     * .operand("operand")
     * .operandType("operandType")
     * .operator("operator")
     * .property("property")
     * .then(ComponentPropertyProperty.builder()
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
     * .condition(componentConditionPropertyProperty_)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentconditionproperty.html)
     */
    public inline fun cfnComponentComponentConditionPropertyProperty(
        block: CfnComponentComponentConditionPropertyPropertyDsl.() -> Unit = {}
    ): CfnComponent.ComponentConditionPropertyProperty {
        val builder = CfnComponentComponentConditionPropertyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `ComponentDataConfiguration` property specifies the configuration for binding a
     * component's properties to data.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplifyuibuilder.*;
     * PredicateProperty predicateProperty_;
     * ComponentDataConfigurationProperty componentDataConfigurationProperty =
     * ComponentDataConfigurationProperty.builder()
     * .model("model")
     * // the properties below are optional
     * .identifiers(List.of("identifiers"))
     * .predicate(PredicateProperty.builder()
     * .and(List.of(predicateProperty_))
     * .field("field")
     * .operand("operand")
     * .operator("operator")
     * .or(List.of(predicateProperty_))
     * .build())
     * .sort(List.of(SortPropertyProperty.builder()
     * .direction("direction")
     * .field("field")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentdataconfiguration.html)
     */
    public inline fun cfnComponentComponentDataConfigurationProperty(
        block: CfnComponentComponentDataConfigurationPropertyDsl.() -> Unit = {}
    ): CfnComponent.ComponentDataConfigurationProperty {
        val builder = CfnComponentComponentDataConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnComponentComponentEventProperty(
        block: CfnComponentComponentEventPropertyDsl.() -> Unit = {}
    ): CfnComponent.ComponentEventProperty {
        val builder = CfnComponentComponentEventPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `ComponentPropertyBindingProperties` property specifies a component property to associate
     * with a binding property.
     *
     * This enables exposed properties on the top level component to propagate data to the
     * component's property values.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplifyuibuilder.*;
     * ComponentPropertyBindingPropertiesProperty componentPropertyBindingPropertiesProperty =
     * ComponentPropertyBindingPropertiesProperty.builder()
     * .property("property")
     * // the properties below are optional
     * .field("field")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentpropertybindingproperties.html)
     */
    public inline fun cfnComponentComponentPropertyBindingPropertiesProperty(
        block: CfnComponentComponentPropertyBindingPropertiesPropertyDsl.() -> Unit = {}
    ): CfnComponent.ComponentPropertyBindingPropertiesProperty {
        val builder = CfnComponentComponentPropertyBindingPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `ComponentProperty` property specifies the configuration for all of a component's
     * properties.
     *
     * Use `ComponentProperty` to specify the values to render or bind by default.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplifyuibuilder.*;
     * ComponentPropertyProperty componentPropertyProperty_;
     * ComponentPropertyProperty componentPropertyProperty = ComponentPropertyProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html)
     */
    public inline fun cfnComponentComponentPropertyProperty(
        block: CfnComponentComponentPropertyPropertyDsl.() -> Unit = {}
    ): CfnComponent.ComponentPropertyProperty {
        val builder = CfnComponentComponentPropertyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `ComponentVariant` property specifies the style configuration of a unique variation of a
     * main component.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplifyuibuilder.*;
     * Object overrides;
     * ComponentVariantProperty componentVariantProperty = ComponentVariantProperty.builder()
     * .overrides(overrides)
     * .variantValues(Map.of(
     * "variantValuesKey", "variantValues"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentvariant.html)
     */
    public inline fun cfnComponentComponentVariantProperty(
        block: CfnComponentComponentVariantPropertyDsl.() -> Unit = {}
    ): CfnComponent.ComponentVariantProperty {
        val builder = CfnComponentComponentVariantPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes how to bind a component property to form data.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplifyuibuilder.*;
     * FormBindingElementProperty formBindingElementProperty = FormBindingElementProperty.builder()
     * .element("element")
     * .property("property")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-formbindingelement.html)
     */
    public inline fun cfnComponentFormBindingElementProperty(
        block: CfnComponentFormBindingElementPropertyDsl.() -> Unit = {}
    ): CfnComponent.FormBindingElementProperty {
        val builder = CfnComponentFormBindingElementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the state configuration when an action modifies a property of another element
     * within the same component.
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
    public inline fun cfnComponentMutationActionSetStateParameterProperty(
        block: CfnComponentMutationActionSetStateParameterPropertyDsl.() -> Unit = {}
    ): CfnComponent.MutationActionSetStateParameterProperty {
        val builder = CfnComponentMutationActionSetStateParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `Predicate` property specifies information for generating Amplify DataStore queries.
     *
     * Use `Predicate` to retrieve a subset of the data in a collection.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplifyuibuilder.*;
     * PredicateProperty predicateProperty_;
     * PredicateProperty predicateProperty = PredicateProperty.builder()
     * .and(List.of(predicateProperty_))
     * .field("field")
     * .operand("operand")
     * .operator("operator")
     * .or(List.of(predicateProperty_))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-predicate.html)
     */
    public inline fun cfnComponentPredicateProperty(
        block: CfnComponentPredicatePropertyDsl.() -> Unit = {}
    ): CfnComponent.PredicateProperty {
        val builder = CfnComponentPredicatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnComponent`.
     *
     * Example:
     * ```
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html)
     */
    public inline fun cfnComponentProps(
        block: CfnComponentPropsDsl.() -> Unit = {}
    ): CfnComponentProps {
        val builder = CfnComponentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `SortProperty` property specifies how to sort the data that you bind to a component.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplifyuibuilder.*;
     * SortPropertyProperty sortPropertyProperty = SortPropertyProperty.builder()
     * .direction("direction")
     * .field("field")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-sortproperty.html)
     */
    public inline fun cfnComponentSortPropertyProperty(
        block: CfnComponentSortPropertyPropertyDsl.() -> Unit = {}
    ): CfnComponent.SortPropertyProperty {
        val builder = CfnComponentSortPropertyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS::AmplifyUIBuilder::Form resource specifies all of the information that is required to
     * create a form.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplifyuibuilder.*;
     * CfnForm cfnForm = CfnForm.Builder.create(this, "MyCfnForm")
     * .dataType(FormDataTypeConfigProperty.builder()
     * .dataSourceType("dataSourceType")
     * .dataTypeName("dataTypeName")
     * .build())
     * .fields(Map.of(
     * "fieldsKey", FieldConfigProperty.builder()
     * .excluded(false)
     * .inputType(FieldInputConfigProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .defaultChecked(false)
     * .defaultCountryCode("defaultCountryCode")
     * .defaultValue("defaultValue")
     * .descriptiveText("descriptiveText")
     * .fileUploaderConfig(FileUploaderFieldConfigProperty.builder()
     * .acceptedFileTypes(List.of("acceptedFileTypes"))
     * .accessLevel("accessLevel")
     * // the properties below are optional
     * .isResumable(false)
     * .maxFileCount(123)
     * .maxSize(123)
     * .showThumbnails(false)
     * .build())
     * .isArray(false)
     * .maxValue(123)
     * .minValue(123)
     * .name("name")
     * .placeholder("placeholder")
     * .readOnly(false)
     * .required(false)
     * .step(123)
     * .value("value")
     * .valueMappings(ValueMappingsProperty.builder()
     * .values(List.of(ValueMappingProperty.builder()
     * .value(FormInputValuePropertyProperty.builder()
     * .value("value")
     * .build())
     * // the properties below are optional
     * .displayValue(FormInputValuePropertyProperty.builder()
     * .value("value")
     * .build())
     * .build()))
     * .build())
     * .build())
     * .label("label")
     * .position(FieldPositionProperty.builder()
     * .below("below")
     * .fixed("fixed")
     * .rightOf("rightOf")
     * .build())
     * .validations(List.of(FieldValidationConfigurationProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .numValues(List.of(123))
     * .strValues(List.of("strValues"))
     * .validationMessage("validationMessage")
     * .build()))
     * .build()))
     * .formActionType("formActionType")
     * .name("name")
     * .schemaVersion("schemaVersion")
     * .sectionalElements(Map.of(
     * "sectionalElementsKey", SectionalElementProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .excluded(false)
     * .level(123)
     * .orientation("orientation")
     * .position(FieldPositionProperty.builder()
     * .below("below")
     * .fixed("fixed")
     * .rightOf("rightOf")
     * .build())
     * .text("text")
     * .build()))
     * .style(FormStyleProperty.builder()
     * .horizontalGap(FormStyleConfigProperty.builder()
     * .tokenReference("tokenReference")
     * .value("value")
     * .build())
     * .outerPadding(FormStyleConfigProperty.builder()
     * .tokenReference("tokenReference")
     * .value("value")
     * .build())
     * .verticalGap(FormStyleConfigProperty.builder()
     * .tokenReference("tokenReference")
     * .value("value")
     * .build())
     * .build())
     * // the properties below are optional
     * .appId("appId")
     * .cta(FormCTAProperty.builder()
     * .cancel(FormButtonProperty.builder()
     * .children("children")
     * .excluded(false)
     * .position(FieldPositionProperty.builder()
     * .below("below")
     * .fixed("fixed")
     * .rightOf("rightOf")
     * .build())
     * .build())
     * .clear(FormButtonProperty.builder()
     * .children("children")
     * .excluded(false)
     * .position(FieldPositionProperty.builder()
     * .below("below")
     * .fixed("fixed")
     * .rightOf("rightOf")
     * .build())
     * .build())
     * .position("position")
     * .submit(FormButtonProperty.builder()
     * .children("children")
     * .excluded(false)
     * .position(FieldPositionProperty.builder()
     * .below("below")
     * .fixed("fixed")
     * .rightOf("rightOf")
     * .build())
     * .build())
     * .build())
     * .environmentName("environmentName")
     * .labelDecorator("labelDecorator")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html)
     */
    public inline fun cfnForm(
        scope: Construct,
        id: String,
        block: CfnFormDsl.() -> Unit = {},
    ): CfnForm {
        val builder = CfnFormDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `FieldConfig` property specifies the configuration information for a field in a table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplifyuibuilder.*;
     * FieldConfigProperty fieldConfigProperty = FieldConfigProperty.builder()
     * .excluded(false)
     * .inputType(FieldInputConfigProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .defaultChecked(false)
     * .defaultCountryCode("defaultCountryCode")
     * .defaultValue("defaultValue")
     * .descriptiveText("descriptiveText")
     * .fileUploaderConfig(FileUploaderFieldConfigProperty.builder()
     * .acceptedFileTypes(List.of("acceptedFileTypes"))
     * .accessLevel("accessLevel")
     * // the properties below are optional
     * .isResumable(false)
     * .maxFileCount(123)
     * .maxSize(123)
     * .showThumbnails(false)
     * .build())
     * .isArray(false)
     * .maxValue(123)
     * .minValue(123)
     * .name("name")
     * .placeholder("placeholder")
     * .readOnly(false)
     * .required(false)
     * .step(123)
     * .value("value")
     * .valueMappings(ValueMappingsProperty.builder()
     * .values(List.of(ValueMappingProperty.builder()
     * .value(FormInputValuePropertyProperty.builder()
     * .value("value")
     * .build())
     * // the properties below are optional
     * .displayValue(FormInputValuePropertyProperty.builder()
     * .value("value")
     * .build())
     * .build()))
     * .build())
     * .build())
     * .label("label")
     * .position(FieldPositionProperty.builder()
     * .below("below")
     * .fixed("fixed")
     * .rightOf("rightOf")
     * .build())
     * .validations(List.of(FieldValidationConfigurationProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .numValues(List.of(123))
     * .strValues(List.of("strValues"))
     * .validationMessage("validationMessage")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldconfig.html)
     */
    public inline fun cfnFormFieldConfigProperty(
        block: CfnFormFieldConfigPropertyDsl.() -> Unit = {}
    ): CfnForm.FieldConfigProperty {
        val builder = CfnFormFieldConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `FieldInputConfig` property specifies the configuration for the default input values to
     * display for a field.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplifyuibuilder.*;
     * FieldInputConfigProperty fieldInputConfigProperty = FieldInputConfigProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .defaultChecked(false)
     * .defaultCountryCode("defaultCountryCode")
     * .defaultValue("defaultValue")
     * .descriptiveText("descriptiveText")
     * .fileUploaderConfig(FileUploaderFieldConfigProperty.builder()
     * .acceptedFileTypes(List.of("acceptedFileTypes"))
     * .accessLevel("accessLevel")
     * // the properties below are optional
     * .isResumable(false)
     * .maxFileCount(123)
     * .maxSize(123)
     * .showThumbnails(false)
     * .build())
     * .isArray(false)
     * .maxValue(123)
     * .minValue(123)
     * .name("name")
     * .placeholder("placeholder")
     * .readOnly(false)
     * .required(false)
     * .step(123)
     * .value("value")
     * .valueMappings(ValueMappingsProperty.builder()
     * .values(List.of(ValueMappingProperty.builder()
     * .value(FormInputValuePropertyProperty.builder()
     * .value("value")
     * .build())
     * // the properties below are optional
     * .displayValue(FormInputValuePropertyProperty.builder()
     * .value("value")
     * .build())
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html)
     */
    public inline fun cfnFormFieldInputConfigProperty(
        block: CfnFormFieldInputConfigPropertyDsl.() -> Unit = {}
    ): CfnForm.FieldInputConfigProperty {
        val builder = CfnFormFieldInputConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `FieldPosition` property specifies the field position.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplifyuibuilder.*;
     * FieldPositionProperty fieldPositionProperty = FieldPositionProperty.builder()
     * .below("below")
     * .fixed("fixed")
     * .rightOf("rightOf")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldposition.html)
     */
    public inline fun cfnFormFieldPositionProperty(
        block: CfnFormFieldPositionPropertyDsl.() -> Unit = {}
    ): CfnForm.FieldPositionProperty {
        val builder = CfnFormFieldPositionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `FieldValidationConfiguration` property specifies the validation configuration for a
     * field.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplifyuibuilder.*;
     * FieldValidationConfigurationProperty fieldValidationConfigurationProperty =
     * FieldValidationConfigurationProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .numValues(List.of(123))
     * .strValues(List.of("strValues"))
     * .validationMessage("validationMessage")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldvalidationconfiguration.html)
     */
    public inline fun cfnFormFieldValidationConfigurationProperty(
        block: CfnFormFieldValidationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnForm.FieldValidationConfigurationProperty {
        val builder = CfnFormFieldValidationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the configuration for the file uploader field.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplifyuibuilder.*;
     * FileUploaderFieldConfigProperty fileUploaderFieldConfigProperty =
     * FileUploaderFieldConfigProperty.builder()
     * .acceptedFileTypes(List.of("acceptedFileTypes"))
     * .accessLevel("accessLevel")
     * // the properties below are optional
     * .isResumable(false)
     * .maxFileCount(123)
     * .maxSize(123)
     * .showThumbnails(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fileuploaderfieldconfig.html)
     */
    public inline fun cfnFormFileUploaderFieldConfigProperty(
        block: CfnFormFileUploaderFieldConfigPropertyDsl.() -> Unit = {}
    ): CfnForm.FileUploaderFieldConfigProperty {
        val builder = CfnFormFileUploaderFieldConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `FormButton` property specifies the configuration for a button UI element that is a part
     * of a form.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplifyuibuilder.*;
     * FormButtonProperty formButtonProperty = FormButtonProperty.builder()
     * .children("children")
     * .excluded(false)
     * .position(FieldPositionProperty.builder()
     * .below("below")
     * .fixed("fixed")
     * .rightOf("rightOf")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formbutton.html)
     */
    public inline fun cfnFormFormButtonProperty(
        block: CfnFormFormButtonPropertyDsl.() -> Unit = {}
    ): CfnForm.FormButtonProperty {
        val builder = CfnFormFormButtonPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `FormCTA` property specifies the call to action button configuration for the form.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplifyuibuilder.*;
     * FormCTAProperty formCTAProperty = FormCTAProperty.builder()
     * .cancel(FormButtonProperty.builder()
     * .children("children")
     * .excluded(false)
     * .position(FieldPositionProperty.builder()
     * .below("below")
     * .fixed("fixed")
     * .rightOf("rightOf")
     * .build())
     * .build())
     * .clear(FormButtonProperty.builder()
     * .children("children")
     * .excluded(false)
     * .position(FieldPositionProperty.builder()
     * .below("below")
     * .fixed("fixed")
     * .rightOf("rightOf")
     * .build())
     * .build())
     * .position("position")
     * .submit(FormButtonProperty.builder()
     * .children("children")
     * .excluded(false)
     * .position(FieldPositionProperty.builder()
     * .below("below")
     * .fixed("fixed")
     * .rightOf("rightOf")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formcta.html)
     */
    public inline fun cfnFormFormCTAProperty(
        block: CfnFormFormCTAPropertyDsl.() -> Unit = {}
    ): CfnForm.FormCTAProperty {
        val builder = CfnFormFormCTAPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `FormDataTypeConfig` property specifies the data type configuration for the data source
     * associated with a form.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplifyuibuilder.*;
     * FormDataTypeConfigProperty formDataTypeConfigProperty = FormDataTypeConfigProperty.builder()
     * .dataSourceType("dataSourceType")
     * .dataTypeName("dataTypeName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formdatatypeconfig.html)
     */
    public inline fun cfnFormFormDataTypeConfigProperty(
        block: CfnFormFormDataTypeConfigPropertyDsl.() -> Unit = {}
    ): CfnForm.FormDataTypeConfigProperty {
        val builder = CfnFormFormDataTypeConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `FormInputValueProperty` property specifies the configuration for an input field on a
     * form.
     *
     * Use `FormInputValueProperty` to specify the values to render or bind by default.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplifyuibuilder.*;
     * FormInputValuePropertyProperty formInputValuePropertyProperty =
     * FormInputValuePropertyProperty.builder()
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-forminputvalueproperty.html)
     */
    public inline fun cfnFormFormInputValuePropertyProperty(
        block: CfnFormFormInputValuePropertyPropertyDsl.() -> Unit = {}
    ): CfnForm.FormInputValuePropertyProperty {
        val builder = CfnFormFormInputValuePropertyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `FormStyleConfig` property specifies the configuration settings for the form's style
     * properties.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplifyuibuilder.*;
     * FormStyleConfigProperty formStyleConfigProperty = FormStyleConfigProperty.builder()
     * .tokenReference("tokenReference")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formstyleconfig.html)
     */
    public inline fun cfnFormFormStyleConfigProperty(
        block: CfnFormFormStyleConfigPropertyDsl.() -> Unit = {}
    ): CfnForm.FormStyleConfigProperty {
        val builder = CfnFormFormStyleConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `FormStyle` property specifies the configuration for the form's style.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplifyuibuilder.*;
     * FormStyleProperty formStyleProperty = FormStyleProperty.builder()
     * .horizontalGap(FormStyleConfigProperty.builder()
     * .tokenReference("tokenReference")
     * .value("value")
     * .build())
     * .outerPadding(FormStyleConfigProperty.builder()
     * .tokenReference("tokenReference")
     * .value("value")
     * .build())
     * .verticalGap(FormStyleConfigProperty.builder()
     * .tokenReference("tokenReference")
     * .value("value")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formstyle.html)
     */
    public inline fun cfnFormFormStyleProperty(
        block: CfnFormFormStylePropertyDsl.() -> Unit = {}
    ): CfnForm.FormStyleProperty {
        val builder = CfnFormFormStylePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnForm`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplifyuibuilder.*;
     * CfnFormProps cfnFormProps = CfnFormProps.builder()
     * .dataType(FormDataTypeConfigProperty.builder()
     * .dataSourceType("dataSourceType")
     * .dataTypeName("dataTypeName")
     * .build())
     * .fields(Map.of(
     * "fieldsKey", FieldConfigProperty.builder()
     * .excluded(false)
     * .inputType(FieldInputConfigProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .defaultChecked(false)
     * .defaultCountryCode("defaultCountryCode")
     * .defaultValue("defaultValue")
     * .descriptiveText("descriptiveText")
     * .fileUploaderConfig(FileUploaderFieldConfigProperty.builder()
     * .acceptedFileTypes(List.of("acceptedFileTypes"))
     * .accessLevel("accessLevel")
     * // the properties below are optional
     * .isResumable(false)
     * .maxFileCount(123)
     * .maxSize(123)
     * .showThumbnails(false)
     * .build())
     * .isArray(false)
     * .maxValue(123)
     * .minValue(123)
     * .name("name")
     * .placeholder("placeholder")
     * .readOnly(false)
     * .required(false)
     * .step(123)
     * .value("value")
     * .valueMappings(ValueMappingsProperty.builder()
     * .values(List.of(ValueMappingProperty.builder()
     * .value(FormInputValuePropertyProperty.builder()
     * .value("value")
     * .build())
     * // the properties below are optional
     * .displayValue(FormInputValuePropertyProperty.builder()
     * .value("value")
     * .build())
     * .build()))
     * .build())
     * .build())
     * .label("label")
     * .position(FieldPositionProperty.builder()
     * .below("below")
     * .fixed("fixed")
     * .rightOf("rightOf")
     * .build())
     * .validations(List.of(FieldValidationConfigurationProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .numValues(List.of(123))
     * .strValues(List.of("strValues"))
     * .validationMessage("validationMessage")
     * .build()))
     * .build()))
     * .formActionType("formActionType")
     * .name("name")
     * .schemaVersion("schemaVersion")
     * .sectionalElements(Map.of(
     * "sectionalElementsKey", SectionalElementProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .excluded(false)
     * .level(123)
     * .orientation("orientation")
     * .position(FieldPositionProperty.builder()
     * .below("below")
     * .fixed("fixed")
     * .rightOf("rightOf")
     * .build())
     * .text("text")
     * .build()))
     * .style(FormStyleProperty.builder()
     * .horizontalGap(FormStyleConfigProperty.builder()
     * .tokenReference("tokenReference")
     * .value("value")
     * .build())
     * .outerPadding(FormStyleConfigProperty.builder()
     * .tokenReference("tokenReference")
     * .value("value")
     * .build())
     * .verticalGap(FormStyleConfigProperty.builder()
     * .tokenReference("tokenReference")
     * .value("value")
     * .build())
     * .build())
     * // the properties below are optional
     * .appId("appId")
     * .cta(FormCTAProperty.builder()
     * .cancel(FormButtonProperty.builder()
     * .children("children")
     * .excluded(false)
     * .position(FieldPositionProperty.builder()
     * .below("below")
     * .fixed("fixed")
     * .rightOf("rightOf")
     * .build())
     * .build())
     * .clear(FormButtonProperty.builder()
     * .children("children")
     * .excluded(false)
     * .position(FieldPositionProperty.builder()
     * .below("below")
     * .fixed("fixed")
     * .rightOf("rightOf")
     * .build())
     * .build())
     * .position("position")
     * .submit(FormButtonProperty.builder()
     * .children("children")
     * .excluded(false)
     * .position(FieldPositionProperty.builder()
     * .below("below")
     * .fixed("fixed")
     * .rightOf("rightOf")
     * .build())
     * .build())
     * .build())
     * .environmentName("environmentName")
     * .labelDecorator("labelDecorator")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html)
     */
    public inline fun cfnFormProps(block: CfnFormPropsDsl.() -> Unit = {}): CfnFormProps {
        val builder = CfnFormPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `SectionalElement` property specifies the configuration information for a visual helper
     * element for a form.
     *
     * A sectional element can be a header, a text block, or a divider. These elements are static
     * and not associated with any data.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplifyuibuilder.*;
     * SectionalElementProperty sectionalElementProperty = SectionalElementProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .excluded(false)
     * .level(123)
     * .orientation("orientation")
     * .position(FieldPositionProperty.builder()
     * .below("below")
     * .fixed("fixed")
     * .rightOf("rightOf")
     * .build())
     * .text("text")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-sectionalelement.html)
     */
    public inline fun cfnFormSectionalElementProperty(
        block: CfnFormSectionalElementPropertyDsl.() -> Unit = {}
    ): CfnForm.SectionalElementProperty {
        val builder = CfnFormSectionalElementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `ValueMapping` property specifies the association between a complex object and a display
     * value.
     *
     * Use `ValueMapping` to store how to represent complex objects when they are displayed.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplifyuibuilder.*;
     * ValueMappingProperty valueMappingProperty = ValueMappingProperty.builder()
     * .value(FormInputValuePropertyProperty.builder()
     * .value("value")
     * .build())
     * // the properties below are optional
     * .displayValue(FormInputValuePropertyProperty.builder()
     * .value("value")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-valuemapping.html)
     */
    public inline fun cfnFormValueMappingProperty(
        block: CfnFormValueMappingPropertyDsl.() -> Unit = {}
    ): CfnForm.ValueMappingProperty {
        val builder = CfnFormValueMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnFormValueMappingsProperty(
        block: CfnFormValueMappingsPropertyDsl.() -> Unit = {}
    ): CfnForm.ValueMappingsProperty {
        val builder = CfnFormValueMappingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS::AmplifyUIBuilder::Theme resource specifies a theme within an Amplify app.
     *
     * A theme is a collection of style settings that apply globally to the components associated
     * with the app.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplifyuibuilder.*;
     * ThemeValuesProperty themeValuesProperty_;
     * CfnTheme cfnTheme = CfnTheme.Builder.create(this, "MyCfnTheme")
     * .name("name")
     * .values(List.of(ThemeValuesProperty.builder()
     * .key("key")
     * .value(ThemeValueProperty.builder()
     * .children(List.of(themeValuesProperty_))
     * .value("value")
     * .build())
     * .build()))
     * // the properties below are optional
     * .appId("appId")
     * .environmentName("environmentName")
     * .overrides(List.of(ThemeValuesProperty.builder()
     * .key("key")
     * .value(ThemeValueProperty.builder()
     * .children(List.of(themeValuesProperty_))
     * .value("value")
     * .build())
     * .build()))
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html)
     */
    public inline fun cfnTheme(
        scope: Construct,
        id: String,
        block: CfnThemeDsl.() -> Unit = {},
    ): CfnTheme {
        val builder = CfnThemeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTheme`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplifyuibuilder.*;
     * ThemeValuesProperty themeValuesProperty_;
     * CfnThemeProps cfnThemeProps = CfnThemeProps.builder()
     * .name("name")
     * .values(List.of(ThemeValuesProperty.builder()
     * .key("key")
     * .value(ThemeValueProperty.builder()
     * .children(List.of(themeValuesProperty_))
     * .value("value")
     * .build())
     * .build()))
     * // the properties below are optional
     * .appId("appId")
     * .environmentName("environmentName")
     * .overrides(List.of(ThemeValuesProperty.builder()
     * .key("key")
     * .value(ThemeValueProperty.builder()
     * .children(List.of(themeValuesProperty_))
     * .value("value")
     * .build())
     * .build()))
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html)
     */
    public inline fun cfnThemeProps(block: CfnThemePropsDsl.() -> Unit = {}): CfnThemeProps {
        val builder = CfnThemePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `ThemeValue` property specifies the configuration of a theme's properties.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplifyuibuilder.*;
     * ThemeValueProperty themeValueProperty_;
     * ThemeValueProperty themeValueProperty = ThemeValueProperty.builder()
     * .children(List.of(ThemeValuesProperty.builder()
     * .key("key")
     * .value(themeValueProperty_)
     * .build()))
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-theme-themevalue.html)
     */
    public inline fun cfnThemeThemeValueProperty(
        block: CfnThemeThemeValuePropertyDsl.() -> Unit = {}
    ): CfnTheme.ThemeValueProperty {
        val builder = CfnThemeThemeValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `ThemeValues` property specifies key-value pair that defines a property of a theme.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amplifyuibuilder.*;
     * ThemeValuesProperty themeValuesProperty_;
     * ThemeValuesProperty themeValuesProperty = ThemeValuesProperty.builder()
     * .key("key")
     * .value(ThemeValueProperty.builder()
     * .children(List.of(themeValuesProperty_))
     * .value("value")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-theme-themevalues.html)
     */
    public inline fun cfnThemeThemeValuesProperty(
        block: CfnThemeThemeValuesPropertyDsl.() -> Unit = {}
    ): CfnTheme.ThemeValuesProperty {
        val builder = CfnThemeThemeValuesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
