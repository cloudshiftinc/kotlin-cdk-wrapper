@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.guardduty

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.guardduty.CfnMember
import software.constructs.Construct

@CdkDslMarker
public class CfnMemberDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnMember.Builder = CfnMember.Builder.create(scope, id)

  public fun detectorId(detectorId: String) {
    cdkBuilder.detectorId(detectorId)
  }

  public fun disableEmailNotification(disableEmailNotification: Boolean) {
    cdkBuilder.disableEmailNotification(disableEmailNotification)
  }

  public fun disableEmailNotification(disableEmailNotification: IResolvable) {
    cdkBuilder.disableEmailNotification(disableEmailNotification)
  }

  public fun email(email: String) {
    cdkBuilder.email(email)
  }

  public fun memberId(memberId: String) {
    cdkBuilder.memberId(memberId)
  }

  public fun message(message: String) {
    cdkBuilder.message(message)
  }

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnMember = cdkBuilder.build()
}
