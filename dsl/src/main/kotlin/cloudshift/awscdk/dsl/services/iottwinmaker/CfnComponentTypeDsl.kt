@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iottwinmaker.CfnComponentType
import software.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

/**
 * Use the `AWS::IoTTwinMaker::ComponentType` resource to declare a component type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iottwinmaker.*;
 * DataTypeProperty dataTypeProperty_;
 * DataValueProperty dataValueProperty_;
 * Object relationshipValue;
 * CfnComponentType cfnComponentType = CfnComponentType.Builder.create(this, "MyCfnComponentType")
 * .componentTypeId("componentTypeId")
 * .workspaceId("workspaceId")
 * // the properties below are optional
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
public class CfnComponentTypeDsl(
    scope: Construct,
    id: String
) {
    private val cdkBuilder: CfnComponentType.Builder = CfnComponentType.Builder.create(scope, id)

    private val _extendsFrom: MutableList<String> = mutableListOf()

    /**
     * The ID of the component type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-componenttypeid)
     * @param componentTypeId The ID of the component type.
     */
    public fun componentTypeId(componentTypeId: String) {
        cdkBuilder.componentTypeId(componentTypeId)
    }

    /**
     * The description of the component type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-description)
     * @param description The description of the component type.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name of the parent component type that this component type extends.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-extendsfrom)
     * @param extendsFrom The name of the parent component type that this component type extends.
     */
    public fun extendsFrom(vararg extendsFrom: String) {
        _extendsFrom.addAll(listOf(*extendsFrom))
    }

    /**
     * The name of the parent component type that this component type extends.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-extendsfrom)
     * @param extendsFrom The name of the parent component type that this component type extends.
     */
    public fun extendsFrom(extendsFrom: Collection<String>) {
        _extendsFrom.addAll(extendsFrom)
    }

    /**
     * An object that maps strings to the functions in the component type.
     *
     * Each string in the mapping must be unique to this object.
     *
     * For information on the FunctionResponse object see the
     * [FunctionResponse](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_FunctionResponse.html)
     * API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-functions)
     * @param functions An object that maps strings to the functions in the component type.
     */
    public fun functions(functions: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(functions)
        cdkBuilder.functions(builder.map)
    }

    /**
     * An object that maps strings to the functions in the component type.
     *
     * Each string in the mapping must be unique to this object.
     *
     * For information on the FunctionResponse object see the
     * [FunctionResponse](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_FunctionResponse.html)
     * API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-functions)
     * @param functions An object that maps strings to the functions in the component type.
     */
    public fun functions(functions: Map<String, Any>) {
        cdkBuilder.functions(functions)
    }

    /**
     * An object that maps strings to the functions in the component type.
     *
     * Each string in the mapping must be unique to this object.
     *
     * For information on the FunctionResponse object see the
     * [FunctionResponse](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_FunctionResponse.html)
     * API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-functions)
     * @param functions An object that maps strings to the functions in the component type.
     */
    public fun functions(functions: IResolvable) {
        cdkBuilder.functions(functions)
    }

    /**
     * A boolean value that specifies whether an entity can have more than one component of this type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-issingleton)
     * @param isSingleton A boolean value that specifies whether an entity can have more than one
     * component of this type.
     */
    public fun isSingleton(isSingleton: Boolean) {
        cdkBuilder.isSingleton(isSingleton)
    }

    /**
     * A boolean value that specifies whether an entity can have more than one component of this type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-issingleton)
     * @param isSingleton A boolean value that specifies whether an entity can have more than one
     * component of this type.
     */
    public fun isSingleton(isSingleton: IResolvable) {
        cdkBuilder.isSingleton(isSingleton)
    }

    /**
     * An object that maps strings to the property definitions in the component type.
     *
     * Each string in the mapping must be unique to this object.
     *
     * For information about the PropertyDefinitionResponse object, see the
     * [PropertyDefinitionResponse](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_PropertyDefinitionResponse.html)
     * API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-propertydefinitions)
     * @param propertyDefinitions An object that maps strings to the property definitions in the
     * component type.
     */
    public fun propertyDefinitions(propertyDefinitions: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(propertyDefinitions)
        cdkBuilder.propertyDefinitions(builder.map)
    }

    /**
     * An object that maps strings to the property definitions in the component type.
     *
     * Each string in the mapping must be unique to this object.
     *
     * For information about the PropertyDefinitionResponse object, see the
     * [PropertyDefinitionResponse](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_PropertyDefinitionResponse.html)
     * API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-propertydefinitions)
     * @param propertyDefinitions An object that maps strings to the property definitions in the
     * component type.
     */
    public fun propertyDefinitions(propertyDefinitions: Map<String, Any>) {
        cdkBuilder.propertyDefinitions(propertyDefinitions)
    }

    /**
     * An object that maps strings to the property definitions in the component type.
     *
     * Each string in the mapping must be unique to this object.
     *
     * For information about the PropertyDefinitionResponse object, see the
     * [PropertyDefinitionResponse](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_PropertyDefinitionResponse.html)
     * API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-propertydefinitions)
     * @param propertyDefinitions An object that maps strings to the property definitions in the
     * component type.
     */
    public fun propertyDefinitions(propertyDefinitions: IResolvable) {
        cdkBuilder.propertyDefinitions(propertyDefinitions)
    }

    /**
     * An object that maps strings to the property groups in the component type.
     *
     * Each string in the mapping must be unique to this object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-propertygroups)
     * @param propertyGroups An object that maps strings to the property groups in the component type.
     *
     */
    public fun propertyGroups(propertyGroups: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(propertyGroups)
        cdkBuilder.propertyGroups(builder.map)
    }

    /**
     * An object that maps strings to the property groups in the component type.
     *
     * Each string in the mapping must be unique to this object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-propertygroups)
     * @param propertyGroups An object that maps strings to the property groups in the component type.
     *
     */
    public fun propertyGroups(propertyGroups: Map<String, Any>) {
        cdkBuilder.propertyGroups(propertyGroups)
    }

    /**
     * An object that maps strings to the property groups in the component type.
     *
     * Each string in the mapping must be unique to this object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-propertygroups)
     * @param propertyGroups An object that maps strings to the property groups in the component type.
     *
     */
    public fun propertyGroups(propertyGroups: IResolvable) {
        cdkBuilder.propertyGroups(propertyGroups)
    }

    /**
     * The ComponentType tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-tags)
     * @param tags The ComponentType tags.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /**
     * The ID of the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-workspaceid)
     * @param workspaceId The ID of the workspace.
     */
    public fun workspaceId(workspaceId: String) {
        cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): CfnComponentType {
        if (_extendsFrom.isNotEmpty()) cdkBuilder.extendsFrom(_extendsFrom)
        return cdkBuilder.build()
    }
}
