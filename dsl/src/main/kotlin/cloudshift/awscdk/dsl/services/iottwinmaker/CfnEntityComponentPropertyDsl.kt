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

/**
 * The entity component.
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
 * ComponentProperty componentProperty = ComponentProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-component.html)
 */
@CdkDslMarker
public class CfnEntityComponentPropertyDsl {
    private val cdkBuilder: CfnEntity.ComponentProperty.Builder =
        CfnEntity.ComponentProperty.builder()

    /** @param componentName The name of the component. */
    public fun componentName(componentName: String) {
        cdkBuilder.componentName(componentName)
    }

    /** @param componentTypeId The ID of the ComponentType. */
    public fun componentTypeId(componentTypeId: String) {
        cdkBuilder.componentTypeId(componentTypeId)
    }

    /** @param definedIn The name of the property definition set in the request. */
    public fun definedIn(definedIn: String) {
        cdkBuilder.definedIn(definedIn)
    }

    /** @param description The description of the component. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param properties An object that maps strings to the properties to set in the component type.
     *   Each string in the mapping must be unique to this object.
     */
    public fun properties(properties: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(properties)
        cdkBuilder.properties(builder.map)
    }

    /**
     * @param properties An object that maps strings to the properties to set in the component type.
     *   Each string in the mapping must be unique to this object.
     */
    public fun properties(properties: Map<String, Any>) {
        cdkBuilder.properties(properties)
    }

    /**
     * @param properties An object that maps strings to the properties to set in the component type.
     *   Each string in the mapping must be unique to this object.
     */
    public fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties)
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

    /** @param status The status of the component. */
    public fun status(status: IResolvable) {
        cdkBuilder.status(status)
    }

    /** @param status The status of the component. */
    public fun status(status: CfnEntity.StatusProperty) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnEntity.ComponentProperty = cdkBuilder.build()
}
