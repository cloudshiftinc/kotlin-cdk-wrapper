@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnEmailIdentity

@CdkDslMarker
public class CfnEmailIdentityFeedbackAttributesPropertyDsl {
  private val cdkBuilder: CfnEmailIdentity.FeedbackAttributesProperty.Builder =
      CfnEmailIdentity.FeedbackAttributesProperty.builder()

  public fun emailForwardingEnabled(emailForwardingEnabled: Boolean) {
    cdkBuilder.emailForwardingEnabled(emailForwardingEnabled)
  }

  public fun emailForwardingEnabled(emailForwardingEnabled: IResolvable) {
    cdkBuilder.emailForwardingEnabled(emailForwardingEnabled)
  }

  public fun build(): CfnEmailIdentity.FeedbackAttributesProperty = cdkBuilder.build()
}
