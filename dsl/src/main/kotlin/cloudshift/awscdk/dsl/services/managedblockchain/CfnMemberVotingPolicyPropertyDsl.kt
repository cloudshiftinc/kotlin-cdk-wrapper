@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.managedblockchain

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.managedblockchain.CfnMember

@CdkDslMarker
public class CfnMemberVotingPolicyPropertyDsl {
  private val cdkBuilder: CfnMember.VotingPolicyProperty.Builder =
      CfnMember.VotingPolicyProperty.builder()

  public fun approvalThresholdPolicy(approvalThresholdPolicy: IResolvable) {
    cdkBuilder.approvalThresholdPolicy(approvalThresholdPolicy)
  }

  public
      fun approvalThresholdPolicy(approvalThresholdPolicy: CfnMember.ApprovalThresholdPolicyProperty) {
    cdkBuilder.approvalThresholdPolicy(approvalThresholdPolicy)
  }

  public fun build(): CfnMember.VotingPolicyProperty = cdkBuilder.build()
}
