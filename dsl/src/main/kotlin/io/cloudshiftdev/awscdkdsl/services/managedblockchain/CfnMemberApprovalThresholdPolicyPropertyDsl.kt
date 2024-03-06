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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.managedblockchain.CfnMember

/**
 * A policy type that defines the voting rules for the network.
 *
 * The rules decide if a proposal is approved. Approval may be based on criteria such as the
 * percentage of `YES` votes and the duration of the proposal. The policy applies to all proposals
 * and is specified when the network is created.
 *
 * Applies only to Hyperledger Fabric.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.managedblockchain.*;
 * ApprovalThresholdPolicyProperty approvalThresholdPolicyProperty =
 * ApprovalThresholdPolicyProperty.builder()
 * .proposalDurationInHours(123)
 * .thresholdComparator("thresholdComparator")
 * .thresholdPercentage(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-approvalthresholdpolicy.html)
 */
@CdkDslMarker
public class CfnMemberApprovalThresholdPolicyPropertyDsl {
    private val cdkBuilder: CfnMember.ApprovalThresholdPolicyProperty.Builder =
        CfnMember.ApprovalThresholdPolicyProperty.builder()

    /**
     * @param proposalDurationInHours The duration from the time that a proposal is created until it
     *   expires. If members cast neither the required number of `YES` votes to approve the proposal
     *   nor the number of `NO` votes required to reject it before the duration expires, the
     *   proposal is `EXPIRED` and `ProposalActions` aren't carried out.
     */
    public fun proposalDurationInHours(proposalDurationInHours: Number) {
        cdkBuilder.proposalDurationInHours(proposalDurationInHours)
    }

    /**
     * @param thresholdComparator Determines whether the vote percentage must be greater than the
     *   `ThresholdPercentage` or must be greater than or equal to the `ThresholdPercentage` to be
     *   approved.
     */
    public fun thresholdComparator(thresholdComparator: String) {
        cdkBuilder.thresholdComparator(thresholdComparator)
    }

    /**
     * @param thresholdPercentage The percentage of votes among all members that must be `YES` for a
     *   proposal to be approved. For example, a `ThresholdPercentage` value of `50` indicates 50%.
     *   The `ThresholdComparator` determines the precise comparison. If a `ThresholdPercentage`
     *   value of `50` is specified on a network with 10 members, along with a `ThresholdComparator`
     *   value of `GREATER_THAN` , this indicates that 6 `YES` votes are required for the proposal
     *   to be approved.
     */
    public fun thresholdPercentage(thresholdPercentage: Number) {
        cdkBuilder.thresholdPercentage(thresholdPercentage)
    }

    public fun build(): CfnMember.ApprovalThresholdPolicyProperty = cdkBuilder.build()
}
