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
import software.amazon.awscdk.services.autoscaling.BindHookTargetOptions
import software.amazon.awscdk.services.autoscaling.LifecycleHook
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class BindHookTargetOptionsDsl {
    private val cdkBuilder: BindHookTargetOptions.Builder = BindHookTargetOptions.builder()

    public fun lifecycleHook(lifecycleHook: LifecycleHook) {
        cdkBuilder.lifecycleHook(lifecycleHook)
    }

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun build(): BindHookTargetOptions = cdkBuilder.build()
}
