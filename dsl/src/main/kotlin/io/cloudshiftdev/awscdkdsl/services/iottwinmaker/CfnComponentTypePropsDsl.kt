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

package io.cloudshiftdev.awscdkdsl.services.iottwinmaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iottwinmaker.CfnComponentTypeProps

/**
 * Properties for defining a `CfnComponentType`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iottwinmaker.*;
 * DataTypeProperty dataTypeProperty_;
 * DataValueProperty dataValueProperty_;
 * Object relationshipValue;
 * CfnComponentTypeProps cfnComponentTypeProps = CfnComponentTypeProps.builder()
 * .componentTypeId("componentTypeId")
 * .workspaceId("workspaceId")
 * // the properties below are optional
 * .compositeComponentTypes(Map.of(
 * "compositeComponentTypesKey", CompositeComponentTypeProperty.builder()
 * .componentTypeId("componentTypeId")
 * .build()))
 * .description("description")
 * .extendsFrom(List.of("extendsFrom"))
 * .functions(Map.of(
 * "functionsKey", FunctionProperty.builder()
 * .implementedBy(DataConnectorProperty.builder()
 * .isNative(false)
 * .lambda(LambdaFunctionProperty.builder()
 * .arn("arn")
 * .build())
 * .build())
 * .requiredProperties(List.of("requiredProperties"))
 * .scope("scope")
 * .build()))
 * .isSingleton(false)
 * .propertyDefinitions(Map.of(
 * "propertyDefinitionsKey", PropertyDefinitionProperty.builder()
 * .configurations(Map.of(
 * "configurationsKey", "configurations"))
 * .dataType(DataTypeProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .allowedValues(List.of(DataValueProperty.builder()
 * .booleanValue(false)
 * .doubleValue(123)
 * .expression("expression")
 * .integerValue(123)
 * .listValue(List.of(dataValueProperty_))
 * .longValue(123)
 * .mapValue(Map.of(
 * "mapValueKey", dataValueProperty_))
 * .relationshipValue(relationshipValue)
 * .stringValue("stringValue")
 * .build()))
 * .nestedType(dataTypeProperty_)
 * .relationship(RelationshipProperty.builder()
 * .relationshipType("relationshipType")
 * .targetComponentTypeId("targetComponentTypeId")
 * .build())
 * .unitOfMeasure("unitOfMeasure")
 * .build())
 * .defaultValue(DataValueProperty.builder()
 * .booleanValue(false)
 * .doubleValue(123)
 * .expression("expression")
 * .integerValue(123)
 * .listValue(List.of(dataValueProperty_))
 * .longValue(123)
 * .mapValue(Map.of(
 * "mapValueKey", dataValueProperty_))
 * .relationshipValue(relationshipValue)
 * .stringValue("stringValue")
 * .build())
 * .isExternalId(false)
 * .isRequiredInEntity(false)
 * .isStoredExternally(false)
 * .isTimeSeries(false)
 * .build()))
 * .propertyGroups(Map.of(
 * "propertyGroupsKey", PropertyGroupProperty.builder()
 * .groupType("groupType")
 * .propertyNames(List.of("propertyNames"))
 * .build()))
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html)
 */
@CdkDslMarker
public class CfnComponentTypePropsDsl {
    private val cdkBuilder: CfnComponentTypeProps.Builder = CfnComponentTypeProps.builder()

    private val _extendsFrom: MutableList<String> = mutableListOf()

    /** @param componentTypeId The ID of the component type. */
    public fun componentTypeId(componentTypeId: String) {
        cdkBuilder.componentTypeId(componentTypeId)
    }

    /**
     * @param compositeComponentTypes Maps strings to `compositeComponentTypes` of the
     *   `componentType` . `CompositeComponentType` is referenced by `componentTypeId` .
     */
    public fun compositeComponentTypes(compositeComponentTypes: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(compositeComponentTypes)
        cdkBuilder.compositeComponentTypes(builder.map)
    }

    /**
     * @param compositeComponentTypes Maps strings to `compositeComponentTypes` of the
     *   `componentType` . `CompositeComponentType` is referenced by `componentTypeId` .
     */
    public fun compositeComponentTypes(compositeComponentTypes: Map<String, Any>) {
        cdkBuilder.compositeComponentTypes(compositeComponentTypes)
    }

    /**
     * @param compositeComponentTypes Maps strings to `compositeComponentTypes` of the
     *   `componentType` . `CompositeComponentType` is referenced by `componentTypeId` .
     */
    public fun compositeComponentTypes(compositeComponentTypes: IResolvable) {
        cdkBuilder.compositeComponentTypes(compositeComponentTypes)
    }

    /** @param description The description of the component type. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param extendsFrom The name of the parent component type that this component type extends.
     */
    public fun extendsFrom(vararg extendsFrom: String) {
        _extendsFrom.addAll(listOf(*extendsFrom))
    }

    /**
     * @param extendsFrom The name of the parent component type that this component type extends.
     */
    public fun extendsFrom(extendsFrom: Collection<String>) {
        _extendsFrom.addAll(extendsFrom)
    }

    /**
     * @param functions An object that maps strings to the functions in the component type. Each
     *   string in the mapping must be unique to this object.
     *
     * For information on the FunctionResponse object see the
     * [FunctionResponse](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_FunctionResponse.html)
     * API reference.
     */
    public fun functions(functions: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(functions)
        cdkBuilder.functions(builder.map)
    }

    /**
     * @param functions An object that maps strings to the functions in the component type. Each
     *   string in the mapping must be unique to this object.
     *
     * For information on the FunctionResponse object see the
     * [FunctionResponse](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_FunctionResponse.html)
     * API reference.
     */
    public fun functions(functions: Map<String, Any>) {
        cdkBuilder.functions(functions)
    }

    /**
     * @param functions An object that maps strings to the functions in the component type. Each
     *   string in the mapping must be unique to this object.
     *
     * For information on the FunctionResponse object see the
     * [FunctionResponse](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_FunctionResponse.html)
     * API reference.
     */
    public fun functions(functions: IResolvable) {
        cdkBuilder.functions(functions)
    }

    /**
     * @param isSingleton A boolean value that specifies whether an entity can have more than one
     *   component of this type.
     */
    public fun isSingleton(isSingleton: Boolean) {
        cdkBuilder.isSingleton(isSingleton)
    }

    /**
     * @param isSingleton A boolean value that specifies whether an entity can have more than one
     *   component of this type.
     */
    public fun isSingleton(isSingleton: IResolvable) {
        cdkBuilder.isSingleton(isSingleton)
    }

    /**
     * @param propertyDefinitions An object that maps strings to the property definitions in the
     *   component type. Each string in the mapping must be unique to this object.
     *
     * For information about the PropertyDefinitionResponse object, see the
     * [PropertyDefinitionResponse](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_PropertyDefinitionResponse.html)
     * API reference.
     */
    public fun propertyDefinitions(propertyDefinitions: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(propertyDefinitions)
        cdkBuilder.propertyDefinitions(builder.map)
    }

    /**
     * @param propertyDefinitions An object that maps strings to the property definitions in the
     *   component type. Each string in the mapping must be unique to this object.
     *
     * For information about the PropertyDefinitionResponse object, see the
     * [PropertyDefinitionResponse](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_PropertyDefinitionResponse.html)
     * API reference.
     */
    public fun propertyDefinitions(propertyDefinitions: Map<String, Any>) {
        cdkBuilder.propertyDefinitions(propertyDefinitions)
    }

    /**
     * @param propertyDefinitions An object that maps strings to the property definitions in the
     *   component type. Each string in the mapping must be unique to this object.
     *
     * For information about the PropertyDefinitionResponse object, see the
     * [PropertyDefinitionResponse](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_PropertyDefinitionResponse.html)
     * API reference.
     */
    public fun propertyDefinitions(propertyDefinitions: IResolvable) {
        cdkBuilder.propertyDefinitions(propertyDefinitions)
    }

    /**
     * @param propertyGroups An object that maps strings to the property groups in the component
     *   type. Each string in the mapping must be unique to this object.
     */
    public fun propertyGroups(propertyGroups: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(propertyGroups)
        cdkBuilder.propertyGroups(builder.map)
    }

    /**
     * @param propertyGroups An object that maps strings to the property groups in the component
     *   type. Each string in the mapping must be unique to this object.
     */
    public fun propertyGroups(propertyGroups: Map<String, Any>) {
        cdkBuilder.propertyGroups(propertyGroups)
    }

    /**
     * @param propertyGroups An object that maps strings to the property groups in the component
     *   type. Each string in the mapping must be unique to this object.
     */
    public fun propertyGroups(propertyGroups: IResolvable) {
        cdkBuilder.propertyGroups(propertyGroups)
    }

    /** @param tags The ComponentType tags. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /** @param workspaceId The ID of the workspace that contains the component type. */
    public fun workspaceId(workspaceId: String) {
        cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): CfnComponentTypeProps {
        if (_extendsFrom.isNotEmpty()) cdkBuilder.extendsFrom(_extendsFrom)
        return cdkBuilder.build()
    }
}
