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

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iottwinmaker.CfnEntity
import software.constructs.Construct

/**
 * Use the `AWS::IoTTwinMaker::Entity` resource to declare an entity.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iottwinmaker.*;
 * DataValueProperty dataValueProperty_;
 * Object definition;
 * Object error;
 * Object relationshipValue;
 * CfnEntity cfnEntity = CfnEntity.Builder.create(this, "MyCfnEntity")
 * .entityName("entityName")
 * .workspaceId("workspaceId")
 * // the properties below are optional
 * .components(Map.of(
 * "componentsKey", ComponentProperty.builder()
 * .componentName("componentName")
 * .componentTypeId("componentTypeId")
 * .definedIn("definedIn")
 * .description("description")
 * .properties(Map.of(
 * "propertiesKey", PropertyProperty.builder()
 * .definition(definition)
 * .value(DataValueProperty.builder()
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
 * .build()))
 * .propertyGroups(Map.of(
 * "propertyGroupsKey", PropertyGroupProperty.builder()
 * .groupType("groupType")
 * .propertyNames(List.of("propertyNames"))
 * .build()))
 * .status(StatusProperty.builder()
 * .error(error)
 * .state("state")
 * .build())
 * .build()))
 * .description("description")
 * .entityId("entityId")
 * .parentEntityId("parentEntityId")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html)
 */
@CdkDslMarker
public class CfnEntityDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEntity.Builder = CfnEntity.Builder.create(scope, id)

    /**
     * An object that maps strings to the components in the entity.
     *
     * Each string in the mapping must be unique to this object.
     *
     * For information on the component object see the
     * [component](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_ComponentResponse.html)
     * API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-components)
     *
     * @param components An object that maps strings to the components in the entity.
     */
    public fun components(components: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(components)
        cdkBuilder.components(builder.map)
    }

    /**
     * An object that maps strings to the components in the entity.
     *
     * Each string in the mapping must be unique to this object.
     *
     * For information on the component object see the
     * [component](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_ComponentResponse.html)
     * API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-components)
     *
     * @param components An object that maps strings to the components in the entity.
     */
    public fun components(components: Map<String, Any>) {
        cdkBuilder.components(components)
    }

    /**
     * An object that maps strings to the components in the entity.
     *
     * Each string in the mapping must be unique to this object.
     *
     * For information on the component object see the
     * [component](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_ComponentResponse.html)
     * API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-components)
     *
     * @param components An object that maps strings to the components in the entity.
     */
    public fun components(components: IResolvable) {
        cdkBuilder.components(components)
    }

    /**
     * The description of the entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-description)
     *
     * @param description The description of the entity.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The entity ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-entityid)
     *
     * @param entityId The entity ID.
     */
    public fun entityId(entityId: String) {
        cdkBuilder.entityId(entityId)
    }

    /**
     * The entity name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-entityname)
     *
     * @param entityName The entity name.
     */
    public fun entityName(entityName: String) {
        cdkBuilder.entityName(entityName)
    }

    /**
     * The ID of the parent entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-parententityid)
     *
     * @param parentEntityId The ID of the parent entity.
     */
    public fun parentEntityId(parentEntityId: String) {
        cdkBuilder.parentEntityId(parentEntityId)
    }

    /**
     * Metadata that you can use to manage the entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-tags)
     *
     * @param tags Metadata that you can use to manage the entity.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /**
     * The ID of the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-workspaceid)
     *
     * @param workspaceId The ID of the workspace.
     */
    public fun workspaceId(workspaceId: String) {
        cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): CfnEntity = cdkBuilder.build()
}
