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

package io.cloudshiftdev.awscdkdsl.services.iotfleetwise

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog

/**
 * A signal that represents static information about the vehicle, such as engine type or
 * manufacturing date.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotfleetwise.*;
 * AttributeProperty attributeProperty = AttributeProperty.builder()
 * .dataType("dataType")
 * .fullyQualifiedName("fullyQualifiedName")
 * // the properties below are optional
 * .allowedValues(List.of("allowedValues"))
 * .assignedValue("assignedValue")
 * .defaultValue("defaultValue")
 * .description("description")
 * .max(123)
 * .min(123)
 * .unit("unit")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-attribute.html)
 */
@CdkDslMarker
public class CfnSignalCatalogAttributePropertyDsl {
    private val cdkBuilder: CfnSignalCatalog.AttributeProperty.Builder =
        CfnSignalCatalog.AttributeProperty.builder()

    private val _allowedValues: MutableList<String> = mutableListOf()

    /** @param allowedValues (Optional) A list of possible values an attribute can be assigned. */
    public fun allowedValues(vararg allowedValues: String) {
        _allowedValues.addAll(listOf(*allowedValues))
    }

    /** @param allowedValues (Optional) A list of possible values an attribute can be assigned. */
    public fun allowedValues(allowedValues: Collection<String>) {
        _allowedValues.addAll(allowedValues)
    }

    /** @param assignedValue (Optional) A specified value for the attribute. */
    public fun assignedValue(assignedValue: String) {
        cdkBuilder.assignedValue(assignedValue)
    }

    /** @param dataType The specified data type of the attribute. */
    public fun dataType(dataType: String) {
        cdkBuilder.dataType(dataType)
    }

    /** @param defaultValue (Optional) The default value of the attribute. */
    public fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
    }

    /** @param description (Optional) A brief description of the attribute. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param fullyQualifiedName The fully qualified name of the attribute. For example, the fully
     *   qualified name of an attribute might be `Vehicle.Body.Engine.Type` .
     */
    public fun fullyQualifiedName(fullyQualifiedName: String) {
        cdkBuilder.fullyQualifiedName(fullyQualifiedName)
    }

    /** @param max (Optional) The specified possible maximum value of the attribute. */
    public fun max(max: Number) {
        cdkBuilder.max(max)
    }

    /** @param min (Optional) The specified possible minimum value of the attribute. */
    public fun min(min: Number) {
        cdkBuilder.min(min)
    }

    /** @param unit (Optional) The scientific unit for the attribute. */
    public fun unit(unit: String) {
        cdkBuilder.unit(unit)
    }

    public fun build(): CfnSignalCatalog.AttributeProperty {
        if (_allowedValues.isNotEmpty()) cdkBuilder.allowedValues(_allowedValues)
        return cdkBuilder.build()
    }
}
