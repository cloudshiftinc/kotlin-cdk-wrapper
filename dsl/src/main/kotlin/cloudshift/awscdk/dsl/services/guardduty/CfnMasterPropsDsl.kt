@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.guardduty

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.guardduty.CfnMasterProps

/**
 * Properties for defining a `CfnMaster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.guardduty.*;
 * CfnMasterProps cfnMasterProps = CfnMasterProps.builder()
 * .detectorId("detectorId")
 * .masterId("masterId")
 * // the properties below are optional
 * .invitationId("invitationId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html)
 */
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
