@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment

/**
 * The compromised credentials actions type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * CompromisedCredentialsActionsTypeProperty compromisedCredentialsActionsTypeProperty =
 * CompromisedCredentialsActionsTypeProperty.builder()
 * .eventAction("eventAction")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsactionstype.html)
 */
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
