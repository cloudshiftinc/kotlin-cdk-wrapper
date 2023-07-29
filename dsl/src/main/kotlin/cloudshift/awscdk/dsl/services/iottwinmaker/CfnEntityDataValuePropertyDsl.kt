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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iottwinmaker.CfnEntity

/**
 * An object that specifies a value for a property.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iottwinmaker.*;
 * DataValueProperty dataValueProperty_;
 * Object relationshipValue;
 * DataValueProperty dataValueProperty = DataValueProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datavalue.html)
 */
@CdkDslMarker
public class CfnEntityDataValuePropertyDsl {
    private val cdkBuilder: CfnEntity.DataValueProperty.Builder =
        CfnEntity.DataValueProperty.builder()

    private val _listValue: MutableList<Any> = mutableListOf()

    /** @param booleanValue A boolean value. */
    public fun booleanValue(booleanValue: Boolean) {
        cdkBuilder.booleanValue(booleanValue)
    }

    /** @param booleanValue A boolean value. */
    public fun booleanValue(booleanValue: IResolvable) {
        cdkBuilder.booleanValue(booleanValue)
    }

    /** @param doubleValue A double value. */
    public fun doubleValue(doubleValue: Number) {
        cdkBuilder.doubleValue(doubleValue)
    }

    /** @param expression An expression that produces the value. */
    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    /** @param integerValue An integer value. */
    public fun integerValue(integerValue: Number) {
        cdkBuilder.integerValue(integerValue)
    }

    /** @param listValue A list of multiple values. */
    public fun listValue(vararg listValue: Any) {
        _listValue.addAll(listOf(*listValue))
    }

    /** @param listValue A list of multiple values. */
    public fun listValue(listValue: Collection<Any>) {
        _listValue.addAll(listValue)
    }

    /** @param listValue A list of multiple values. */
    public fun listValue(listValue: IResolvable) {
        cdkBuilder.listValue(listValue)
    }

    /** @param longValue A long value. */
    public fun longValue(longValue: Number) {
        cdkBuilder.longValue(longValue)
    }

    /** @param mapValue An object that maps strings to multiple DataValue objects. */
    public fun mapValue(mapValue: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(mapValue)
        cdkBuilder.mapValue(builder.map)
    }

    /** @param mapValue An object that maps strings to multiple DataValue objects. */
    public fun mapValue(mapValue: Map<String, Any>) {
        cdkBuilder.mapValue(mapValue)
    }

    /** @param mapValue An object that maps strings to multiple DataValue objects. */
    public fun mapValue(mapValue: IResolvable) {
        cdkBuilder.mapValue(mapValue)
    }

    /** @param relationshipValue A value that relates a component to another component. */
    public fun relationshipValue(relationshipValue: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(relationshipValue)
        cdkBuilder.relationshipValue(builder.map)
    }

    /** @param relationshipValue A value that relates a component to another component. */
    public fun relationshipValue(relationshipValue: Any) {
        cdkBuilder.relationshipValue(relationshipValue)
    }

    /** @param stringValue A string value. */
    public fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
    }

    public fun build(): CfnEntity.DataValueProperty {
        if (_listValue.isNotEmpty()) cdkBuilder.listValue(_listValue)
        return cdkBuilder.build()
    }
}
