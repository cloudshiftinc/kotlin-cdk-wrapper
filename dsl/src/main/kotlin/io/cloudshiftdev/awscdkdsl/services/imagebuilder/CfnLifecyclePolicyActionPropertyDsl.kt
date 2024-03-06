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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy

/**
 * Contains selection criteria for the lifecycle policy.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * ActionProperty actionProperty = ActionProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .includeResources(IncludeResourcesProperty.builder()
 * .amis(false)
 * .containers(false)
 * .snapshots(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-action.html)
 */
@CdkDslMarker
public class CfnLifecyclePolicyActionPropertyDsl {
    private val cdkBuilder: CfnLifecyclePolicy.ActionProperty.Builder =
        CfnLifecyclePolicy.ActionProperty.builder()

    /** @param includeResources Specifies the resources that the lifecycle policy applies to. */
    public fun includeResources(includeResources: IResolvable) {
        cdkBuilder.includeResources(includeResources)
    }

    /** @param includeResources Specifies the resources that the lifecycle policy applies to. */
    public fun includeResources(includeResources: CfnLifecyclePolicy.IncludeResourcesProperty) {
        cdkBuilder.includeResources(includeResources)
    }

    /** @param type Specifies the lifecycle action to take. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnLifecyclePolicy.ActionProperty = cdkBuilder.build()
}
