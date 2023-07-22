@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.guardduty

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.guardduty.CfnMemberProps

@CdkDslMarker
public class CfnMemberPropsDsl {
  private val cdkBuilder: CfnMemberProps.Builder = CfnMemberProps.builder()

  /**
   * @param detectorId The ID of the detector associated with the GuardDuty service to add the
   * member to. 
   */
  public fun detectorId(detectorId: String) {
    cdkBuilder.detectorId(detectorId)
  }

  /**
   * @param disableEmailNotification Specifies whether or not to disable email notification for the
   * member account that you invite.
   */
  public fun disableEmailNotification(disableEmailNotification: Boolean) {
    cdkBuilder.disableEmailNotification(disableEmailNotification)
  }

  /**
   * @param disableEmailNotification Specifies whether or not to disable email notification for the
   * member account that you invite.
   */
  public fun disableEmailNotification(disableEmailNotification: IResolvable) {
    cdkBuilder.disableEmailNotification(disableEmailNotification)
  }

  /**
   * @param email The email address associated with the member account. 
   */
  public fun email(email: String) {
    cdkBuilder.email(email)
  }

  /**
   * @param memberId The AWS account ID of the account to designate as a member. 
   */
  public fun memberId(memberId: String) {
    cdkBuilder.memberId(memberId)
  }

  /**
   * @param message The invitation message that you want to send to the accounts that you're
   * inviting to GuardDuty as members.
   */
  public fun message(message: String) {
    cdkBuilder.message(message)
  }

  /**
   * @param status You can use the `Status` property to update the status of the relationship
   * between the member account and its administrator account.
   * Valid values are `Created` and `Invited` when using an `AWS::GuardDuty::Member` resource. If
   * the value for this property is not provided or set to `Created` , a member account is created but
   * not invited. If the value of this property is set to `Invited` , a member account is created and
   * invited.
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnMemberProps = cdkBuilder.build()
}
