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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnParameterProps

/**
 * Example:
 * ```
 * CfnParameter.Builder.create(this, "MyParameter")
 * .type("Number")
 * .default(1337)
 * .build();
 * ```
 */
@CdkDslMarker
public class CfnParameterPropsDsl {
    private val cdkBuilder: CfnParameterProps.Builder = CfnParameterProps.builder()

    private val _allowedValues: MutableList<String> = mutableListOf()

    /**
     * @param allowedPattern A regular expression that represents the patterns to allow for String
     *   types.
     */
    public fun allowedPattern(allowedPattern: String) {
        cdkBuilder.allowedPattern(allowedPattern)
    }

    /** @param allowedValues An array containing the list of values allowed for the parameter. */
    public fun allowedValues(vararg allowedValues: String) {
        _allowedValues.addAll(listOf(*allowedValues))
    }

    /** @param allowedValues An array containing the list of values allowed for the parameter. */
    public fun allowedValues(allowedValues: Collection<String>) {
        _allowedValues.addAll(allowedValues)
    }

    /**
     * @param constraintDescription A string that explains a constraint when the constraint is
     *   violated. For example, without a constraint description, a parameter that has an allowed
     *   pattern of [A-Za-z0-9]+ displays the following error message when the user specifies an
     *   invalid value:
     */
    public fun constraintDescription(constraintDescription: String) {
        cdkBuilder.constraintDescription(constraintDescription)
    }

    /**
     * @param defaultValue A value of the appropriate type for the template to use if no value is
     *   specified when a stack is created. If you define constraints for the parameter, you must
     *   specify a value that adheres to those constraints.
     */
    public fun defaultValue(defaultValue: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(defaultValue)
        cdkBuilder.defaultValue(builder.map)
    }

    /**
     * @param defaultValue A value of the appropriate type for the template to use if no value is
     *   specified when a stack is created. If you define constraints for the parameter, you must
     *   specify a value that adheres to those constraints.
     */
    public fun defaultValue(defaultValue: Any) {
        cdkBuilder.defaultValue(defaultValue)
    }

    /** @param description A string of up to 4000 characters that describes the parameter. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param maxLength An integer value that determines the largest number of characters you want
     *   to allow for String types.
     */
    public fun maxLength(maxLength: Number) {
        cdkBuilder.maxLength(maxLength)
    }

    /**
     * @param maxValue A numeric value that determines the largest numeric value you want to allow
     *   for Number types.
     */
    public fun maxValue(maxValue: Number) {
        cdkBuilder.maxValue(maxValue)
    }

    /**
     * @param minLength An integer value that determines the smallest number of characters you want
     *   to allow for String types.
     */
    public fun minLength(minLength: Number) {
        cdkBuilder.minLength(minLength)
    }

    /**
     * @param minValue A numeric value that determines the smallest numeric value you want to allow
     *   for Number types.
     */
    public fun minValue(minValue: Number) {
        cdkBuilder.minValue(minValue)
    }

    /**
     * @param noEcho Whether to mask the parameter value when anyone makes a call that describes the
     *   stack. If you set the value to `true`, the parameter value is masked with asterisks
     *   (`*****`).
     */
    public fun noEcho(noEcho: Boolean) {
        cdkBuilder.noEcho(noEcho)
    }

    /** @param type The data type for the parameter (DataType). */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnParameterProps {
        if (_allowedValues.isNotEmpty()) cdkBuilder.allowedValues(_allowedValues)
        return cdkBuilder.build()
    }
}
