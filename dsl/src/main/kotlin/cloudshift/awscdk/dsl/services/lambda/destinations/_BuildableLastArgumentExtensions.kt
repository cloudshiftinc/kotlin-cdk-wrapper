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

package cloudshift.awscdk.dsl.services.lambda.destinations

import cloudshift.awscdk.dsl.services.lambda.DestinationOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.services.lambda.DestinationConfig
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.lambda.destinations.EventBridgeDestination
import software.amazon.awscdk.services.lambda.destinations.LambdaDestination
import software.amazon.awscdk.services.lambda.destinations.SnsDestination
import software.amazon.awscdk.services.lambda.destinations.SqsDestination
import software.constructs.Construct

/**
 * Returns a destination configuration.
 *
 * @param _scope
 * @param fn
 * @param _options
 */
public inline fun EventBridgeDestination.bind(
    _scope: Construct,
    fn: IFunction,
    block: DestinationOptionsDsl.() -> Unit = {},
): DestinationConfig {
    val builder = DestinationOptionsDsl()
    builder.apply(block)
    return bind(_scope, fn, builder.build())
}

/**
 * Returns a destination configuration.
 *
 * @param scope
 * @param fn
 * @param options
 */
public inline fun LambdaDestination.bind(
    scope: Construct,
    fn: IFunction,
    block: DestinationOptionsDsl.() -> Unit = {},
): DestinationConfig {
    val builder = DestinationOptionsDsl()
    builder.apply(block)
    return bind(scope, fn, builder.build())
}

/**
 * Returns a destination configuration.
 *
 * @param _scope
 * @param fn
 * @param _options
 */
public inline fun SnsDestination.bind(
    _scope: Construct,
    fn: IFunction,
    block: DestinationOptionsDsl.() -> Unit = {},
): DestinationConfig {
    val builder = DestinationOptionsDsl()
    builder.apply(block)
    return bind(_scope, fn, builder.build())
}

/**
 * Returns a destination configuration.
 *
 * @param _scope
 * @param fn
 * @param _options
 */
public inline fun SqsDestination.bind(
    _scope: Construct,
    fn: IFunction,
    block: DestinationOptionsDsl.() -> Unit = {},
): DestinationConfig {
    val builder = DestinationOptionsDsl()
    builder.apply(block)
    return bind(_scope, fn, builder.build())
}
