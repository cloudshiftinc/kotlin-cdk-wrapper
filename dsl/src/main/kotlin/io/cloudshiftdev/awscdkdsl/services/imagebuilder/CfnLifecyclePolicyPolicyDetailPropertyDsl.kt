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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy

/**
 * The configuration details for a lifecycle policy resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * PolicyDetailProperty policyDetailProperty = PolicyDetailProperty.builder()
 * .action(ActionProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .includeResources(IncludeResourcesProperty.builder()
 * .amis(false)
 * .containers(false)
 * .snapshots(false)
 * .build())
 * .build())
 * .filter(FilterProperty.builder()
 * .type("type")
 * .value(123)
 * // the properties below are optional
 * .retainAtLeast(123)
 * .unit("unit")
 * .build())
 * // the properties below are optional
 * .exclusionRules(ExclusionRulesProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-policydetail.html)
 */
@CdkDslMarker
public class CfnLifecyclePolicyPolicyDetailPropertyDsl {
    private val cdkBuilder: CfnLifecyclePolicy.PolicyDetailProperty.Builder =
        CfnLifecyclePolicy.PolicyDetailProperty.builder()

    /** @param action Configuration details for the policy action. */
    public fun action(action: IResolvable) {
        cdkBuilder.action(action)
    }

    /** @param action Configuration details for the policy action. */
    public fun action(action: CfnLifecyclePolicy.ActionProperty) {
        cdkBuilder.action(action)
    }

    /**
     * @param exclusionRules Additional rules to specify resources that should be exempt from policy
     *   actions.
     */
    public fun exclusionRules(exclusionRules: IResolvable) {
        cdkBuilder.exclusionRules(exclusionRules)
    }

    /**
     * @param exclusionRules Additional rules to specify resources that should be exempt from policy
     *   actions.
     */
    public fun exclusionRules(exclusionRules: CfnLifecyclePolicy.ExclusionRulesProperty) {
        cdkBuilder.exclusionRules(exclusionRules)
    }

    /** @param filter Specifies the resources that the lifecycle policy applies to. */
    public fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter)
    }

    /** @param filter Specifies the resources that the lifecycle policy applies to. */
    public fun filter(filter: CfnLifecyclePolicy.FilterProperty) {
        cdkBuilder.filter(filter)
    }

    public fun build(): CfnLifecyclePolicy.PolicyDetailProperty = cdkBuilder.build()
}
