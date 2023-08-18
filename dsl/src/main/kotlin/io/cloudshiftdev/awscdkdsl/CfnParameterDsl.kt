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

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnParameter
import software.constructs.Construct

/**
 * A CloudFormation parameter.
 *
 * Use the optional Parameters section to customize your templates. Parameters enable you to input
 * custom values to your template each time you create or update a stack.
 *
 * Example:
 * ```
 * Topic myTopic = new Topic(this, "MyTopic");
 * CfnParameter url = new CfnParameter(this, "url-param");
 * myTopic.addSubscription(new UrlSubscription(url.getValueAsString()));
 * ```
 */
@CdkDslMarker
public class CfnParameterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnParameter.Builder = CfnParameter.Builder.create(scope, id)

    private val _allowedValues: MutableList<String> = mutableListOf()

    /**
     * A regular expression that represents the patterns to allow for String types.
     *
     * Default: - No constraints on patterns allowed for parameter.
     *
     * @param allowedPattern A regular expression that represents the patterns to allow for String
     *   types.
     */
    public fun allowedPattern(allowedPattern: String) {
        cdkBuilder.allowedPattern(allowedPattern)
    }

    /**
     * An array containing the list of values allowed for the parameter.
     *
     * Default: - No constraints on values allowed for parameter.
     *
     * @param allowedValues An array containing the list of values allowed for the parameter.
     */
    public fun allowedValues(vararg allowedValues: String) {
        _allowedValues.addAll(listOf(*allowedValues))
    }

    /**
     * An array containing the list of values allowed for the parameter.
     *
     * Default: - No constraints on values allowed for parameter.
     *
     * @param allowedValues An array containing the list of values allowed for the parameter.
     */
    public fun allowedValues(allowedValues: Collection<String>) {
        _allowedValues.addAll(allowedValues)
    }

    /**
     * A string that explains a constraint when the constraint is violated.
     *
     * For example, without a constraint description, a parameter that has an allowed pattern of
     * [A-Za-z0-9]+ displays the following error message when the user specifies an invalid value:
     *
     * Default: - No description with customized error message when user specifies invalid values.
     *
     * @param constraintDescription A string that explains a constraint when the constraint is
     *   violated.
     */
    public fun constraintDescription(constraintDescription: String) {
        cdkBuilder.constraintDescription(constraintDescription)
    }

    /**
     * A value of the appropriate type for the template to use if no value is specified when a stack
     * is created.
     *
     * If you define constraints for the parameter, you must specify a value that adheres to those
     * constraints.
     *
     * Default: - No default value for parameter.
     *
     * @param defaultValue A value of the appropriate type for the template to use if no value is
     *   specified when a stack is created.
     */
    public fun defaultValue(defaultValue: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(defaultValue)
        cdkBuilder.defaultValue(builder.map)
    }

    /**
     * A value of the appropriate type for the template to use if no value is specified when a stack
     * is created.
     *
     * If you define constraints for the parameter, you must specify a value that adheres to those
     * constraints.
     *
     * Default: - No default value for parameter.
     *
     * @param defaultValue A value of the appropriate type for the template to use if no value is
     *   specified when a stack is created.
     */
    public fun defaultValue(defaultValue: Any) {
        cdkBuilder.defaultValue(defaultValue)
    }

    /**
     * A string of up to 4000 characters that describes the parameter.
     *
     * Default: - No description for the parameter.
     *
     * @param description A string of up to 4000 characters that describes the parameter.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * An integer value that determines the largest number of characters you want to allow for
     * String types.
     *
     * Default: - None.
     *
     * @param maxLength An integer value that determines the largest number of characters you want
     *   to allow for String types.
     */
    public fun maxLength(maxLength: Number) {
        cdkBuilder.maxLength(maxLength)
    }

    /**
     * A numeric value that determines the largest numeric value you want to allow for Number types.
     *
     * Default: - None.
     *
     * @param maxValue A numeric value that determines the largest numeric value you want to allow
     *   for Number types.
     */
    public fun maxValue(maxValue: Number) {
        cdkBuilder.maxValue(maxValue)
    }

    /**
     * An integer value that determines the smallest number of characters you want to allow for
     * String types.
     *
     * Default: - None.
     *
     * @param minLength An integer value that determines the smallest number of characters you want
     *   to allow for String types.
     */
    public fun minLength(minLength: Number) {
        cdkBuilder.minLength(minLength)
    }

    /**
     * A numeric value that determines the smallest numeric value you want to allow for Number
     * types.
     *
     * Default: - None.
     *
     * @param minValue A numeric value that determines the smallest numeric value you want to allow
     *   for Number types.
     */
    public fun minValue(minValue: Number) {
        cdkBuilder.minValue(minValue)
    }

    /**
     * Whether to mask the parameter value when anyone makes a call that describes the stack.
     *
     * If you set the value to `true`, the parameter value is masked with asterisks (`*****`).
     *
     * Default: - Parameter values are not masked.
     *
     * @param noEcho Whether to mask the parameter value when anyone makes a call that describes the
     *   stack.
     */
    public fun noEcho(noEcho: Boolean) {
        cdkBuilder.noEcho(noEcho)
    }

    /**
     * The data type for the parameter (DataType).
     *
     * Default: String
     *
     * @param type The data type for the parameter (DataType).
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnParameter {
        if (_allowedValues.isNotEmpty()) cdkBuilder.allowedValues(_allowedValues)
        return cdkBuilder.build()
    }
}
