@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ses.DkimIdentity
import software.amazon.awscdk.services.ses.EmailIdentityProps
import software.amazon.awscdk.services.ses.IConfigurationSet
import software.amazon.awscdk.services.ses.Identity
import software.amazon.awscdk.services.ses.MailFromBehaviorOnMxFailure

@CdkDslMarker
public class EmailIdentityPropsDsl {
  private val cdkBuilder: EmailIdentityProps.Builder = EmailIdentityProps.builder()

  public fun configurationSet(configurationSet: IConfigurationSet) {
    cdkBuilder.configurationSet(configurationSet)
  }

  public fun dkimIdentity(dkimIdentity: DkimIdentity) {
    cdkBuilder.dkimIdentity(dkimIdentity)
  }

  public fun dkimSigning(dkimSigning: Boolean) {
    cdkBuilder.dkimSigning(dkimSigning)
  }

  public fun feedbackForwarding(feedbackForwarding: Boolean) {
    cdkBuilder.feedbackForwarding(feedbackForwarding)
  }

  public fun identity(identity: Identity) {
    cdkBuilder.identity(identity)
  }

  public fun mailFromBehaviorOnMxFailure(mailFromBehaviorOnMxFailure: MailFromBehaviorOnMxFailure) {
    cdkBuilder.mailFromBehaviorOnMxFailure(mailFromBehaviorOnMxFailure)
  }

  public fun mailFromDomain(mailFromDomain: String) {
    cdkBuilder.mailFromDomain(mailFromDomain)
  }

  public fun build(): EmailIdentityProps = cdkBuilder.build()
}
