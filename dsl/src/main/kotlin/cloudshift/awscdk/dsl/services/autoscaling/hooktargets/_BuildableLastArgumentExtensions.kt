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

package cloudshift.awscdk.dsl.services.autoscaling.hooktargets

import cloudshift.awscdk.dsl.services.autoscaling.BindHookTargetOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig
import software.amazon.awscdk.services.autoscaling.hooktargets.FunctionHook
import software.amazon.awscdk.services.autoscaling.hooktargets.QueueHook
import software.amazon.awscdk.services.autoscaling.hooktargets.TopicHook
import software.constructs.Construct

/**
 * If the `IRole` does not exist in `options`, will create an `IRole` and an SNS Topic and attach
 * both to the lifecycle hook.
 *
 * If the `IRole` does exist in `options`, will only create an SNS Topic and attach it to the
 * lifecycle hook.
 *
 * @param _scope
 * @param options
 */
public inline fun FunctionHook.bind(
    _scope: Construct,
    block: BindHookTargetOptionsDsl.() -> Unit = {}
): LifecycleHookTargetConfig {
    val builder = BindHookTargetOptionsDsl()
    builder.apply(block)
    return bind(_scope, builder.build())
}

/**
 * If an `IRole` is found in `options`, grant it access to send messages.
 *
 * Otherwise, create a new `IRole` and grant it access to send messages.
 *
 * @param _scope
 * @param options
 * @return the `IRole` with access to send messages and the ARN of the queue it has access to send
 *   messages to.
 */
public inline fun QueueHook.bind(
    _scope: Construct,
    block: BindHookTargetOptionsDsl.() -> Unit = {}
): LifecycleHookTargetConfig {
    val builder = BindHookTargetOptionsDsl()
    builder.apply(block)
    return bind(_scope, builder.build())
}

/**
 * If an `IRole` is found in `options`, grant it topic publishing permissions.
 *
 * Otherwise, create a new `IRole` and grant it topic publishing permissions.
 *
 * @param _scope
 * @param options
 * @return the `IRole` with topic publishing permissions and the ARN of the topic it has publishing
 *   permission to.
 */
public inline fun TopicHook.bind(
    _scope: Construct,
    block: BindHookTargetOptionsDsl.() -> Unit = {}
): LifecycleHookTargetConfig {
    val builder = BindHookTargetOptionsDsl()
    builder.apply(block)
    return bind(_scope, builder.build())
}
