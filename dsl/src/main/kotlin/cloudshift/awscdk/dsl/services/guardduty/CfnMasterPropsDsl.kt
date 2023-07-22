@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.guardduty

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.guardduty.CfnMasterProps

@CdkDslMarker
public class CfnMasterPropsDsl {
  private val cdkBuilder: CfnMasterProps.Builder = CfnMasterProps.builder()

  /**
   * @param detectorId The unique ID of the detector of the GuardDuty member account. 
   */
  public fun detectorId(detectorId: String) {
    cdkBuilder.detectorId(detectorId)
  }

  /**
   * @param invitationId The ID of the invitation that is sent to the account designated as a member
   * account.
   * You can find the invitation ID by using the ListInvitation action of the GuardDuty API.
   */
  public fun invitationId(invitationId: String) {
    cdkBuilder.invitationId(invitationId)
  }

  /**
   * @param masterId The AWS account ID of the account designated as the GuardDuty administrator
   * account. 
   */
  public fun masterId(masterId: String) {
    cdkBuilder.masterId(masterId)
  }

  public fun build(): CfnMasterProps = cdkBuilder.build()
}
