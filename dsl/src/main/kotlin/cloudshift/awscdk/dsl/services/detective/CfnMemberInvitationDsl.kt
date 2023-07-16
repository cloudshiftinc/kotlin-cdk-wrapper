@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.detective

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.detective.CfnMemberInvitation
import software.constructs.Construct

@CdkDslMarker
public class CfnMemberInvitationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnMemberInvitation.Builder = CfnMemberInvitation.Builder.create(scope,
      id)

  public fun disableEmailNotification(disableEmailNotification: Boolean) {
    cdkBuilder.disableEmailNotification(disableEmailNotification)
  }

  public fun disableEmailNotification(disableEmailNotification: IResolvable) {
    cdkBuilder.disableEmailNotification(disableEmailNotification)
  }

  public fun graphArn(graphArn: String) {
    cdkBuilder.graphArn(graphArn)
  }

  public fun memberEmailAddress(memberEmailAddress: String) {
    cdkBuilder.memberEmailAddress(memberEmailAddress)
  }

  public fun memberId(memberId: String) {
    cdkBuilder.memberId(memberId)
  }

  public fun message(message: String) {
    cdkBuilder.message(message)
  }

  public fun build(): CfnMemberInvitation = cdkBuilder.build()
}
