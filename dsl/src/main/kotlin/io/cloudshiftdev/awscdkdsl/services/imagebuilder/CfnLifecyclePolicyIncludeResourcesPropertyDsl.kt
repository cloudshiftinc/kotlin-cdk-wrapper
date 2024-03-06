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

package io.cloudshiftdev.awscdkdsl.services.imagebuilder

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy

/**
 * Specifies how the lifecycle policy should apply actions to selected resources.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * IncludeResourcesProperty includeResourcesProperty = IncludeResourcesProperty.builder()
 * .amis(false)
 * .containers(false)
 * .snapshots(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-includeresources.html)
 */
@CdkDslMarker
public class CfnLifecyclePolicyIncludeResourcesPropertyDsl {
    private val cdkBuilder: CfnLifecyclePolicy.IncludeResourcesProperty.Builder =
        CfnLifecyclePolicy.IncludeResourcesProperty.builder()

    /** @param amis Specifies whether the lifecycle action should apply to distributed AMIs. */
    public fun amis(amis: Boolean) {
        cdkBuilder.amis(amis)
    }

    /** @param amis Specifies whether the lifecycle action should apply to distributed AMIs. */
    public fun amis(amis: IResolvable) {
        cdkBuilder.amis(amis)
    }

    /**
     * @param containers Specifies whether the lifecycle action should apply to distributed
     *   containers.
     */
    public fun containers(containers: Boolean) {
        cdkBuilder.containers(containers)
    }

    /**
     * @param containers Specifies whether the lifecycle action should apply to distributed
     *   containers.
     */
    public fun containers(containers: IResolvable) {
        cdkBuilder.containers(containers)
    }

    /**
     * @param snapshots Specifies whether the lifecycle action should apply to snapshots associated
     *   with distributed AMIs.
     */
    public fun snapshots(snapshots: Boolean) {
        cdkBuilder.snapshots(snapshots)
    }

    /**
     * @param snapshots Specifies whether the lifecycle action should apply to snapshots associated
     *   with distributed AMIs.
     */
    public fun snapshots(snapshots: IResolvable) {
        cdkBuilder.snapshots(snapshots)
    }

    public fun build(): CfnLifecyclePolicy.IncludeResourcesProperty = cdkBuilder.build()
}
