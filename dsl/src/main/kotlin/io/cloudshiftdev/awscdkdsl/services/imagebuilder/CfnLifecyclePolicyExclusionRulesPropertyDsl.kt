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
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy

/**
 * Specifies resources that lifecycle policy actions should not apply to.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * ExclusionRulesProperty exclusionRulesProperty = ExclusionRulesProperty.builder()
 * .amis(AmiExclusionRulesProperty.builder()
 * .isPublic(false)
 * .lastLaunched(LastLaunchedProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .regions(List.of("regions"))
 * .sharedAccounts(List.of("sharedAccounts"))
 * .tagMap(Map.of(
 * "tagMapKey", "tagMap"))
 * .build())
 * .tagMap(Map.of(
 * "tagMapKey", "tagMap"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-exclusionrules.html)
 */
@CdkDslMarker
public class CfnLifecyclePolicyExclusionRulesPropertyDsl {
    private val cdkBuilder: CfnLifecyclePolicy.ExclusionRulesProperty.Builder =
        CfnLifecyclePolicy.ExclusionRulesProperty.builder()

    /**
     * @param amis Lists configuration values that apply to AMIs that Image Builder should exclude
     *   from the lifecycle action.
     */
    public fun amis(amis: IResolvable) {
        cdkBuilder.amis(amis)
    }

    /**
     * @param amis Lists configuration values that apply to AMIs that Image Builder should exclude
     *   from the lifecycle action.
     */
    public fun amis(amis: CfnLifecyclePolicy.AmiExclusionRulesProperty) {
        cdkBuilder.amis(amis)
    }

    /**
     * @param tagMap Contains a list of tags that Image Builder uses to skip lifecycle actions for
     *   Image Builder image resources that have them.
     */
    public fun tagMap(tagMap: Map<String, String>) {
        cdkBuilder.tagMap(tagMap)
    }

    /**
     * @param tagMap Contains a list of tags that Image Builder uses to skip lifecycle actions for
     *   Image Builder image resources that have them.
     */
    public fun tagMap(tagMap: IResolvable) {
        cdkBuilder.tagMap(tagMap)
    }

    public fun build(): CfnLifecyclePolicy.ExclusionRulesProperty = cdkBuilder.build()
}
