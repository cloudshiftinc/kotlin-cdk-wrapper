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

package io.cloudshiftdev.awscdkdsl.services.resiliencehub

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicyProps

/**
 * Properties for defining a `CfnResiliencyPolicy`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.resiliencehub.*;
 * CfnResiliencyPolicyProps cfnResiliencyPolicyProps = CfnResiliencyPolicyProps.builder()
 * .policy(Map.of(
 * "policyKey", FailurePolicyProperty.builder()
 * .rpoInSecs(123)
 * .rtoInSecs(123)
 * .build()))
 * .policyName("policyName")
 * .tier("tier")
 * // the properties below are optional
 * .dataLocationConstraint("dataLocationConstraint")
 * .policyDescription("policyDescription")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html)
 */
@CdkDslMarker
public class CfnResiliencyPolicyPropsDsl {
    private val cdkBuilder: CfnResiliencyPolicyProps.Builder = CfnResiliencyPolicyProps.builder()

    /**
     * @param dataLocationConstraint Specifies a high-level geographical location constraint for
     *   where your resilience policy data can be stored.
     */
    public fun dataLocationConstraint(dataLocationConstraint: String) {
        cdkBuilder.dataLocationConstraint(dataLocationConstraint)
    }

    /** @param policy The resiliency policy. */
    public fun policy(policy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policy)
        cdkBuilder.policy(builder.map)
    }

    /** @param policy The resiliency policy. */
    public fun policy(policy: Map<String, Any>) {
        cdkBuilder.policy(policy)
    }

    /** @param policy The resiliency policy. */
    public fun policy(policy: IResolvable) {
        cdkBuilder.policy(policy)
    }

    /** @param policyDescription The description for the policy. */
    public fun policyDescription(policyDescription: String) {
        cdkBuilder.policyDescription(policyDescription)
    }

    /** @param policyName The name of the policy. */
    public fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
    }

    /**
     * @param tags Tags assigned to the resource. A tag is a label that you assign to an AWS
     *   resource. Each tag consists of a key/value pair.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /**
     * @param tier The tier for this resiliency policy, ranging from the highest severity (
     *   `MissionCritical` ) to lowest ( `NonCritical` ).
     */
    public fun tier(tier: String) {
        cdkBuilder.tier(tier)
    }

    public fun build(): CfnResiliencyPolicyProps = cdkBuilder.build()
}
