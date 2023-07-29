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

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.autoscaling.DefaultResult
import software.amazon.awscdk.services.autoscaling.IAutoScalingGroup
import software.amazon.awscdk.services.autoscaling.ILifecycleHookTarget
import software.amazon.awscdk.services.autoscaling.LifecycleHook
import software.amazon.awscdk.services.autoscaling.LifecycleTransition
import software.amazon.awscdk.services.iam.IRole
import software.constructs.Construct

/**
 * Define a life cycle hook.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.autoscaling.*;
 * import software.amazon.awscdk.services.iam.*;
 * AutoScalingGroup autoScalingGroup;
 * ILifecycleHookTarget lifecycleHookTarget;
 * Role role;
 * LifecycleHook lifecycleHook = LifecycleHook.Builder.create(this, "MyLifecycleHook")
 * .autoScalingGroup(autoScalingGroup)
 * .lifecycleTransition(LifecycleTransition.INSTANCE_LAUNCHING)
 * // the properties below are optional
 * .defaultResult(DefaultResult.CONTINUE)
 * .heartbeatTimeout(Duration.minutes(30))
 * .lifecycleHookName("lifecycleHookName")
 * .notificationMetadata("notificationMetadata")
 * .notificationTarget(lifecycleHookTarget)
 * .role(role)
 * .build();
 * ```
 */
@CdkDslMarker
public class LifecycleHookDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: LifecycleHook.Builder = LifecycleHook.Builder.create(scope, id)

    /**
     * The AutoScalingGroup to add the lifecycle hook to.
     *
     * @param autoScalingGroup The AutoScalingGroup to add the lifecycle hook to.
     */
    public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
        cdkBuilder.autoScalingGroup(autoScalingGroup)
    }

    /**
     * The action the Auto Scaling group takes when the lifecycle hook timeout elapses or if an
     * unexpected failure occurs.
     *
     * Default: Continue
     *
     * @param defaultResult The action the Auto Scaling group takes when the lifecycle hook timeout
     *   elapses or if an unexpected failure occurs.
     */
    public fun defaultResult(defaultResult: DefaultResult) {
        cdkBuilder.defaultResult(defaultResult)
    }

    /**
     * Maximum time between calls to RecordLifecycleActionHeartbeat for the hook.
     *
     * If the lifecycle hook times out, perform the action in DefaultResult.
     *
     * Default: - No heartbeat timeout.
     *
     * @param heartbeatTimeout Maximum time between calls to RecordLifecycleActionHeartbeat for the
     *   hook.
     */
    public fun heartbeatTimeout(heartbeatTimeout: Duration) {
        cdkBuilder.heartbeatTimeout(heartbeatTimeout)
    }

    /**
     * Name of the lifecycle hook.
     *
     * Default: - Automatically generated name.
     *
     * @param lifecycleHookName Name of the lifecycle hook.
     */
    public fun lifecycleHookName(lifecycleHookName: String) {
        cdkBuilder.lifecycleHookName(lifecycleHookName)
    }

    /**
     * The state of the Amazon EC2 instance to which you want to attach the lifecycle hook.
     *
     * @param lifecycleTransition The state of the Amazon EC2 instance to which you want to attach
     *   the lifecycle hook.
     */
    public fun lifecycleTransition(lifecycleTransition: LifecycleTransition) {
        cdkBuilder.lifecycleTransition(lifecycleTransition)
    }

    /**
     * Additional data to pass to the lifecycle hook target.
     *
     * Default: - No metadata.
     *
     * @param notificationMetadata Additional data to pass to the lifecycle hook target.
     */
    public fun notificationMetadata(notificationMetadata: String) {
        cdkBuilder.notificationMetadata(notificationMetadata)
    }

    /**
     * The target of the lifecycle hook.
     *
     * Default: - No target.
     *
     * @param notificationTarget The target of the lifecycle hook.
     */
    public fun notificationTarget(notificationTarget: ILifecycleHookTarget) {
        cdkBuilder.notificationTarget(notificationTarget)
    }

    /**
     * The role that allows publishing to the notification target.
     *
     * Default: - A role will be created if a target is provided. Otherwise, no role is created.
     *
     * @param role The role that allows publishing to the notification target.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun build(): LifecycleHook = cdkBuilder.build()
}
