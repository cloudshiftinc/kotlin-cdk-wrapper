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

package io.cloudshiftdev.awscdkdsl.services.managedblockchain

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.managedblockchain.CfnMember

/**
 * The voting rules for the network to decide if a proposal is accepted.
 *
 * Applies only to Hyperledger Fabric.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.managedblockchain.*;
 * VotingPolicyProperty votingPolicyProperty = VotingPolicyProperty.builder()
 * .approvalThresholdPolicy(ApprovalThresholdPolicyProperty.builder()
 * .proposalDurationInHours(123)
 * .thresholdComparator("thresholdComparator")
 * .thresholdPercentage(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-votingpolicy.html)
 */
@CdkDslMarker
public class CfnMemberVotingPolicyPropertyDsl {
    private val cdkBuilder: CfnMember.VotingPolicyProperty.Builder =
        CfnMember.VotingPolicyProperty.builder()

    /**
     * @param approvalThresholdPolicy Defines the rules for the network for voting on proposals,
     *   such as the percentage of `YES` votes required for the proposal to be approved and the
     *   duration of the proposal. The policy applies to all proposals and is specified when the
     *   network is created.
     */
    public fun approvalThresholdPolicy(approvalThresholdPolicy: IResolvable) {
        cdkBuilder.approvalThresholdPolicy(approvalThresholdPolicy)
    }

    /**
     * @param approvalThresholdPolicy Defines the rules for the network for voting on proposals,
     *   such as the percentage of `YES` votes required for the proposal to be approved and the
     *   duration of the proposal. The policy applies to all proposals and is specified when the
     *   network is created.
     */
    public fun approvalThresholdPolicy(
        approvalThresholdPolicy: CfnMember.ApprovalThresholdPolicyProperty
    ) {
        cdkBuilder.approvalThresholdPolicy(approvalThresholdPolicy)
    }

    public fun build(): CfnMember.VotingPolicyProperty = cdkBuilder.build()
}
