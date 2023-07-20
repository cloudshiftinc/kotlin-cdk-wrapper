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
import software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig
import software.amazon.awscdk.services.iam.IRole
import kotlin.String

@CdkDslMarker
public class LifecycleHookTargetConfigDsl {
    private val cdkBuilder: LifecycleHookTargetConfig.Builder = LifecycleHookTargetConfig.builder()

    public fun createdRole(createdRole: IRole) {
        cdkBuilder.createdRole(createdRole)
    }

    public fun notificationTargetArn(notificationTargetArn: String) {
        cdkBuilder.notificationTargetArn(notificationTargetArn)
    }

    public fun build(): LifecycleHookTargetConfig = cdkBuilder.build()
}
