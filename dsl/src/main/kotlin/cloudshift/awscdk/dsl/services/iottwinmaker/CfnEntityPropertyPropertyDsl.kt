@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iottwinmaker.CfnEntity
import kotlin.Any
import kotlin.Unit

/**
 * An object that sets information about a property.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iottwinmaker.*;
 * DataValueProperty dataValueProperty_;
 * Object definition;
 * Object relationshipValue;
 * PropertyProperty propertyProperty = PropertyProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-property.html)
 */
@CdkDslMarker
public class CfnEntityPropertyPropertyDsl {
    private val cdkBuilder: CfnEntity.PropertyProperty.Builder = CfnEntity.PropertyProperty.builder()

    /**
     * @param definition An object that specifies information about a property.
     */
    public fun definition(definition: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(definition)
        cdkBuilder.definition(builder.map)
    }

    /**
     * @param definition An object that specifies information about a property.
     */
    public fun definition(definition: Any) {
        cdkBuilder.definition(definition)
    }

    /**
     * @param value An object that contains information about a value for a time series property.
     */
    public fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`)
    }

    /**
     * @param value An object that contains information about a value for a time series property.
     */
    public fun `value`(`value`: CfnEntity.DataValueProperty) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnEntity.PropertyProperty = cdkBuilder.build()
}
