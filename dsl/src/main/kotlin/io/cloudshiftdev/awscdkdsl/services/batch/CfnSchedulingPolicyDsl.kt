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

package io.cloudshiftdev.awscdkdsl.services.batch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnSchedulingPolicy
import software.constructs.Construct

/**
 * The `AWS::Batch::SchedulingPolicy` resource specifies the parameters for an AWS Batch scheduling
 * policy.
 *
 * For more information, see
 * [Scheduling Policies](https://docs.aws.amazon.com/batch/latest/userguide/scheduling_policies.html)
 * in the ** .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * CfnSchedulingPolicy cfnSchedulingPolicy = CfnSchedulingPolicy.Builder.create(this,
 * "MyCfnSchedulingPolicy")
 * .fairsharePolicy(FairsharePolicyProperty.builder()
 * .computeReservation(123)
 * .shareDecaySeconds(123)
 * .shareDistribution(List.of(ShareAttributesProperty.builder()
 * .shareIdentifier("shareIdentifier")
 * .weightFactor(123)
 * .build()))
 * .build())
 * .name("name")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-schedulingpolicy.html)
 */
@CdkDslMarker
public class CfnSchedulingPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSchedulingPolicy.Builder =
        CfnSchedulingPolicy.Builder.create(scope, id)

    /**
     * The fair share policy of the scheduling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-schedulingpolicy.html#cfn-batch-schedulingpolicy-fairsharepolicy)
     *
     * @param fairsharePolicy The fair share policy of the scheduling policy.
     */
    public fun fairsharePolicy(fairsharePolicy: IResolvable) {
        cdkBuilder.fairsharePolicy(fairsharePolicy)
    }

    /**
     * The fair share policy of the scheduling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-schedulingpolicy.html#cfn-batch-schedulingpolicy-fairsharepolicy)
     *
     * @param fairsharePolicy The fair share policy of the scheduling policy.
     */
    public fun fairsharePolicy(fairsharePolicy: CfnSchedulingPolicy.FairsharePolicyProperty) {
        cdkBuilder.fairsharePolicy(fairsharePolicy)
    }

    /**
     * The name of the scheduling policy.
     *
     * It can be up to 128 letters long. It can contain uppercase and lowercase letters, numbers,
     * hyphens (-), and underscores (_).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-schedulingpolicy.html#cfn-batch-schedulingpolicy-name)
     *
     * @param name The name of the scheduling policy.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The tags that you apply to the scheduling policy to help you categorize and organize your
     * resources.
     *
     * Each tag consists of a key and an optional value. For more information, see
     * [Tagging AWS Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in
     * *AWS General Reference* .
     *
     * These tags can be updated or removed using the
     * [TagResource](https://docs.aws.amazon.com/batch/latest/APIReference/API_TagResource.html) and
     * [UntagResource](https://docs.aws.amazon.com/batch/latest/APIReference/API_UntagResource.html)
     * API operations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-schedulingpolicy.html#cfn-batch-schedulingpolicy-tags)
     *
     * @param tags The tags that you apply to the scheduling policy to help you categorize and
     *   organize your resources.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnSchedulingPolicy = cdkBuilder.build()
}
