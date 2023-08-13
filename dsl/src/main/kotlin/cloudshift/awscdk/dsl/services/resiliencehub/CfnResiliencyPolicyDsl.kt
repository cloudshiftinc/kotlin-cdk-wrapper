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

package cloudshift.awscdk.dsl.services.resiliencehub

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy
import software.constructs.Construct

/**
 * Defines a resiliency policy.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.resiliencehub.*;
 * CfnResiliencyPolicy cfnResiliencyPolicy = CfnResiliencyPolicy.Builder.create(this,
 * "MyCfnResiliencyPolicy")
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
public class CfnResiliencyPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnResiliencyPolicy.Builder =
        CfnResiliencyPolicy.Builder.create(scope, id)

    /**
     * Specifies a high-level geographical location constraint for where your resilience policy data
     * can be stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-datalocationconstraint)
     *
     * @param dataLocationConstraint Specifies a high-level geographical location constraint for
     *   where your resilience policy data can be stored.
     */
    public fun dataLocationConstraint(dataLocationConstraint: String) {
        cdkBuilder.dataLocationConstraint(dataLocationConstraint)
    }

    /**
     * The resiliency policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-policy)
     *
     * @param policy The resiliency policy.
     */
    public fun policy(policy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policy)
        cdkBuilder.policy(builder.map)
    }

    /**
     * The resiliency policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-policy)
     *
     * @param policy The resiliency policy.
     */
    public fun policy(policy: Map<String, Any>) {
        cdkBuilder.policy(policy)
    }

    /**
     * The resiliency policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-policy)
     *
     * @param policy The resiliency policy.
     */
    public fun policy(policy: IResolvable) {
        cdkBuilder.policy(policy)
    }

    /**
     * The description for the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-policydescription)
     *
     * @param policyDescription The description for the policy.
     */
    public fun policyDescription(policyDescription: String) {
        cdkBuilder.policyDescription(policyDescription)
    }

    /**
     * The name of the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-policyname)
     *
     * @param policyName The name of the policy.
     */
    public fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
    }

    /**
     * Tags assigned to the resource.
     *
     * A tag is a label that you assign to an AWS resource. Each tag consists of a key/value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-tags)
     *
     * @param tags Tags assigned to the resource.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /**
     * The tier for this resiliency policy, ranging from the highest severity ( `MissionCritical` )
     * to lowest ( `NonCritical` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-tier)
     *
     * @param tier The tier for this resiliency policy, ranging from the highest severity (
     *   `MissionCritical` ) to lowest ( `NonCritical` ).
     */
    public fun tier(tier: String) {
        cdkBuilder.tier(tier)
    }

    public fun build(): CfnResiliencyPolicy = cdkBuilder.build()
}
