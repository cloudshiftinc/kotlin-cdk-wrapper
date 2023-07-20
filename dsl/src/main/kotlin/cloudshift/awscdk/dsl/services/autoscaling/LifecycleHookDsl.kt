@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.autoscaling.DefaultResult
import software.amazon.awscdk.services.autoscaling.IAutoScalingGroup
import software.amazon.awscdk.services.autoscaling.ILifecycleHookTarget
import software.amazon.awscdk.services.autoscaling.LifecycleHook
import software.amazon.awscdk.services.autoscaling.LifecycleTransition
import software.amazon.awscdk.services.iam.IRole
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class LifecycleHookDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: LifecycleHook.Builder = LifecycleHook.Builder.create(scope, id)

    public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
        cdkBuilder.autoScalingGroup(autoScalingGroup)
    }

    public fun defaultResult(defaultResult: DefaultResult) {
        cdkBuilder.defaultResult(defaultResult)
    }

    public fun heartbeatTimeout(heartbeatTimeout: Duration) {
        cdkBuilder.heartbeatTimeout(heartbeatTimeout)
    }

    public fun lifecycleHookName(lifecycleHookName: String) {
        cdkBuilder.lifecycleHookName(lifecycleHookName)
    }

    public fun lifecycleTransition(lifecycleTransition: LifecycleTransition) {
        cdkBuilder.lifecycleTransition(lifecycleTransition)
    }

    public fun notificationMetadata(notificationMetadata: String) {
        cdkBuilder.notificationMetadata(notificationMetadata)
    }

    public fun notificationTarget(notificationTarget: ILifecycleHookTarget) {
        cdkBuilder.notificationTarget(notificationTarget)
    }

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun build(): LifecycleHook = cdkBuilder.build()
}
