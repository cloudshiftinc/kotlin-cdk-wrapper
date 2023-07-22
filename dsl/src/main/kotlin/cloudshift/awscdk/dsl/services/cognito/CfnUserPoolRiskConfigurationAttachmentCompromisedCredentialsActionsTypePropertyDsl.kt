@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment

@CdkDslMarker
public class CfnUserPoolRiskConfigurationAttachmentCompromisedCredentialsActionsTypePropertyDsl {
  private val cdkBuilder:
      CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty.Builder =
      CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty.builder()

  /**
   * @param eventAction The event action. 
   */
  public fun eventAction(eventAction: String) {
    cdkBuilder.eventAction(eventAction)
  }

  public fun build():
      CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty =
      cdkBuilder.build()
}
