@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment

@CdkDslMarker
public class CfnUserPoolRiskConfigurationAttachmentAccountTakeoverActionTypePropertyDsl {
  private val cdkBuilder:
      CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty.Builder =
      CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty.builder()

  public fun eventAction(eventAction: String) {
    cdkBuilder.eventAction(eventAction)
  }

  public fun notify(notify: Boolean) {
    cdkBuilder.notify(notify)
  }

  public fun notify(notify: IResolvable) {
    cdkBuilder.notify(notify)
  }

  public fun build(): CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty =
      cdkBuilder.build()
}
