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

package io.cloudshiftdev.awscdkdsl.services.autoscaling

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.services.autoscaling.BindHookTargetOptions
import software.amazon.awscdk.services.autoscaling.LifecycleHook
import software.amazon.awscdk.services.iam.IRole

/**
 * Options needed to bind a target to a lifecycle hook.
 *
 * [disable-awslint:ref-via-interface] The lifecycle hook to attach to and an IRole to use
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * import software.amazon.awscdk.services.iam.*;
 * LifecycleHook lifecycleHook;
 * Role role;
 * BindHookTargetOptions bindHookTargetOptions = BindHookTargetOptions.builder()
 * .lifecycleHook(lifecycleHook)
 * // the properties below are optional
 * .role(role)
 * .build();
 * ```
 */
@CdkDslMarker
public class BindHookTargetOptionsDsl {
    private val cdkBuilder: BindHookTargetOptions.Builder = BindHookTargetOptions.builder()

    /** @param lifecycleHook The lifecycle hook to attach to. [disable-awslint:ref-via-interface] */
    public fun lifecycleHook(lifecycleHook: LifecycleHook) {
        cdkBuilder.lifecycleHook(lifecycleHook)
    }

    /**
     * @param role The role to use when attaching to the lifecycle hook.
     *   [disable-awslint:ref-via-interface]
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun build(): BindHookTargetOptions = cdkBuilder.build()
}
