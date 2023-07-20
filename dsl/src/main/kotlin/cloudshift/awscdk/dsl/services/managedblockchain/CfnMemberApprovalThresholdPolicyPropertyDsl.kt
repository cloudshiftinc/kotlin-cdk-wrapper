@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.managedblockchain

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.managedblockchain.CfnMember

@CdkDslMarker
public class CfnMemberApprovalThresholdPolicyPropertyDsl {
  private val cdkBuilder: CfnMember.ApprovalThresholdPolicyProperty.Builder =
      CfnMember.ApprovalThresholdPolicyProperty.builder()

  public fun proposalDurationInHours(proposalDurationInHours: Number) {
    cdkBuilder.proposalDurationInHours(proposalDurationInHours)
  }

  public fun thresholdComparator(thresholdComparator: String) {
    cdkBuilder.thresholdComparator(thresholdComparator)
  }

  public fun thresholdPercentage(thresholdPercentage: Number) {
    cdkBuilder.thresholdPercentage(thresholdPercentage)
  }

  public fun build(): CfnMember.ApprovalThresholdPolicyProperty = cdkBuilder.build()
}
