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
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iottwinmaker.CfnComponentType

/**
 * PropertyDefinition is an object that maps strings to the property definitions in the component
 * type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iottwinmaker.*;
 * DataTypeProperty dataTypeProperty_;
 * DataValueProperty dataValueProperty_;
 * Object relationshipValue;
 * PropertyDefinitionProperty propertyDefinitionProperty = PropertyDefinitionProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-propertydefinition.html)
 */
@CdkDslMarker
public class CfnComponentTypePropertyDefinitionPropertyDsl {
    private val cdkBuilder: CfnComponentType.PropertyDefinitionProperty.Builder =
        CfnComponentType.PropertyDefinitionProperty.builder()

    /**
     * @param configurations A mapping that specifies configuration information about the property.
     */
    public fun configurations(configurations: Map<String, String>) {
        cdkBuilder.configurations(configurations)
    }

    /**
     * @param configurations A mapping that specifies configuration information about the property.
     */
    public fun configurations(configurations: IResolvable) {
        cdkBuilder.configurations(configurations)
    }

    /** @param dataType An object that specifies the data type of a property. */
    public fun dataType(dataType: IResolvable) {
        cdkBuilder.dataType(dataType)
    }

    /** @param dataType An object that specifies the data type of a property. */
    public fun dataType(dataType: CfnComponentType.DataTypeProperty) {
        cdkBuilder.dataType(dataType)
    }

    /**
     * @param defaultValue A boolean value that specifies whether the property ID comes from an
     *   external data store.
     */
    public fun defaultValue(defaultValue: IResolvable) {
        cdkBuilder.defaultValue(defaultValue)
    }

    /**
     * @param defaultValue A boolean value that specifies whether the property ID comes from an
     *   external data store.
     */
    public fun defaultValue(defaultValue: CfnComponentType.DataValueProperty) {
        cdkBuilder.defaultValue(defaultValue)
    }

    /**
     * @param isExternalId A boolean value that specifies whether the property ID comes from an
     *   external data store.
     */
    public fun isExternalId(isExternalId: Boolean) {
        cdkBuilder.isExternalId(isExternalId)
    }

    /**
     * @param isExternalId A boolean value that specifies whether the property ID comes from an
     *   external data store.
     */
    public fun isExternalId(isExternalId: IResolvable) {
        cdkBuilder.isExternalId(isExternalId)
    }

    /**
     * @param isRequiredInEntity A boolean value that specifies whether the property is required in
     *   an entity.
     */
    public fun isRequiredInEntity(isRequiredInEntity: Boolean) {
        cdkBuilder.isRequiredInEntity(isRequiredInEntity)
    }

    /**
     * @param isRequiredInEntity A boolean value that specifies whether the property is required in
     *   an entity.
     */
    public fun isRequiredInEntity(isRequiredInEntity: IResolvable) {
        cdkBuilder.isRequiredInEntity(isRequiredInEntity)
    }

    /**
     * @param isStoredExternally A boolean value that specifies whether the property is stored
     *   externally.
     */
    public fun isStoredExternally(isStoredExternally: Boolean) {
        cdkBuilder.isStoredExternally(isStoredExternally)
    }

    /**
     * @param isStoredExternally A boolean value that specifies whether the property is stored
     *   externally.
     */
    public fun isStoredExternally(isStoredExternally: IResolvable) {
        cdkBuilder.isStoredExternally(isStoredExternally)
    }

    /**
     * @param isTimeSeries A boolean value that specifies whether the property consists of time
     *   series data.
     */
    public fun isTimeSeries(isTimeSeries: Boolean) {
        cdkBuilder.isTimeSeries(isTimeSeries)
    }

    /**
     * @param isTimeSeries A boolean value that specifies whether the property consists of time
     *   series data.
     */
    public fun isTimeSeries(isTimeSeries: IResolvable) {
        cdkBuilder.isTimeSeries(isTimeSeries)
    }

    public fun build(): CfnComponentType.PropertyDefinitionProperty = cdkBuilder.build()
}
