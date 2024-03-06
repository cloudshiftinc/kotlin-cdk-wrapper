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
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iottwinmaker.CfnEntity

/**
 * Information about a composite component.
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
 * CompositeComponentProperty compositeComponentProperty = CompositeComponentProperty.builder()
 * .componentName("componentName")
 * .componentPath("componentPath")
 * .componentTypeId("componentTypeId")
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-compositecomponent.html)
 */
@CdkDslMarker
public class CfnEntityCompositeComponentPropertyDsl {
    private val cdkBuilder: CfnEntity.CompositeComponentProperty.Builder =
        CfnEntity.CompositeComponentProperty.builder()

    /** @param componentName The name of the component. */
    public fun componentName(componentName: String) {
        cdkBuilder.componentName(componentName)
    }

    /**
     * @param componentPath The path to the composite component, starting from the top-level
     *   component.
     */
    public fun componentPath(componentPath: String) {
        cdkBuilder.componentPath(componentPath)
    }

    /** @param componentTypeId The ID of the composite component type. */
    public fun componentTypeId(componentTypeId: String) {
        cdkBuilder.componentTypeId(componentTypeId)
    }

    /** @param description The description of the component type. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param properties Map of strings to the properties in the component type. Each string in the
     *   mapping must be unique to this component.
     */
    public fun properties(properties: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(properties)
        cdkBuilder.properties(builder.map)
    }

    /**
     * @param properties Map of strings to the properties in the component type. Each string in the
     *   mapping must be unique to this component.
     */
    public fun properties(properties: Map<String, Any>) {
        cdkBuilder.properties(properties)
    }

    /**
     * @param properties Map of strings to the properties in the component type. Each string in the
     *   mapping must be unique to this component.
     */
    public fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties)
    }

    /** @param propertyGroups The property groups. */
    public fun propertyGroups(propertyGroups: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(propertyGroups)
        cdkBuilder.propertyGroups(builder.map)
    }

    /** @param propertyGroups The property groups. */
    public fun propertyGroups(propertyGroups: Map<String, Any>) {
        cdkBuilder.propertyGroups(propertyGroups)
    }

    /** @param propertyGroups The property groups. */
    public fun propertyGroups(propertyGroups: IResolvable) {
        cdkBuilder.propertyGroups(propertyGroups)
    }

    /** @param status The current status of the composite component. */
    public fun status(status: IResolvable) {
        cdkBuilder.status(status)
    }

    /** @param status The current status of the composite component. */
    public fun status(status: CfnEntity.StatusProperty) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnEntity.CompositeComponentProperty = cdkBuilder.build()
}
