@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.managedblockchain

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.managedblockchain.CfnMember

@CdkDslMarker
public class CfnMemberVotingPolicyPropertyDsl {
  private val cdkBuilder: CfnMember.VotingPolicyProperty.Builder =
      CfnMember.VotingPolicyProperty.builder()

  /**
   * @param approvalThresholdPolicy Defines the rules for the network for voting on proposals, such
   * as the percentage of `YES` votes required for the proposal to be approved and the duration of the
   * proposal.
   * The policy applies to all proposals and is specified when the network is created.
   */
  public fun approvalThresholdPolicy(approvalThresholdPolicy: IResolvable) {
    cdkBuilder.approvalThresholdPolicy(approvalThresholdPolicy)
  }

  /**
   * @param approvalThresholdPolicy Defines the rules for the network for voting on proposals, such
   * as the percentage of `YES` votes required for the proposal to be approved and the duration of the
   * proposal.
   * The policy applies to all proposals and is specified when the network is created.
   */
  public
      fun approvalThresholdPolicy(approvalThresholdPolicy: CfnMember.ApprovalThresholdPolicyProperty) {
    cdkBuilder.approvalThresholdPolicy(approvalThresholdPolicy)
  }

  public fun build(): CfnMember.VotingPolicyProperty = cdkBuilder.build()
}
