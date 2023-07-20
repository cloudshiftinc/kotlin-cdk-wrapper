@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpointemail.CfnIdentity

@CdkDslMarker
public class CfnIdentityMailFromAttributesPropertyDsl {
  private val cdkBuilder: CfnIdentity.MailFromAttributesProperty.Builder =
      CfnIdentity.MailFromAttributesProperty.builder()

  public fun behaviorOnMxFailure(behaviorOnMxFailure: String) {
    cdkBuilder.behaviorOnMxFailure(behaviorOnMxFailure)
  }

  public fun mailFromDomain(mailFromDomain: String) {
    cdkBuilder.mailFromDomain(mailFromDomain)
  }

  public fun build(): CfnIdentity.MailFromAttributesProperty = cdkBuilder.build()
}
