@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps

@CdkDslMarker
public class CfnUserPoolRiskConfigurationAttachmentPropsDsl {
  private val cdkBuilder: CfnUserPoolRiskConfigurationAttachmentProps.Builder =
      CfnUserPoolRiskConfigurationAttachmentProps.builder()

  /**
   * @param accountTakeoverRiskConfiguration The account takeover risk configuration object,
   * including the `NotifyConfiguration` object and `Actions` to take if there is an account takeover.
   */
  public fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: IResolvable) {
    cdkBuilder.accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration)
  }

  /**
   * @param accountTakeoverRiskConfiguration The account takeover risk configuration object,
   * including the `NotifyConfiguration` object and `Actions` to take if there is an account takeover.
   */
  public
      fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty) {
    cdkBuilder.accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration)
  }

  /**
   * @param clientId The app client ID. 
   * You can specify the risk configuration for a single client (with a specific ClientId) or for
   * all clients (by setting the ClientId to `ALL` ).
   */
  public fun clientId(clientId: String) {
    cdkBuilder.clientId(clientId)
  }

  /**
   * @param compromisedCredentialsRiskConfiguration The compromised credentials risk configuration
   * object, including the `EventFilter` and the `EventAction` .
   */
  public
      fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: IResolvable) {
    cdkBuilder.compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration)
  }

  /**
   * @param compromisedCredentialsRiskConfiguration The compromised credentials risk configuration
   * object, including the `EventFilter` and the `EventAction` .
   */
  public
      fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty) {
    cdkBuilder.compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration)
  }

  /**
   * @param riskExceptionConfiguration The configuration to override the risk decision.
   */
  public fun riskExceptionConfiguration(riskExceptionConfiguration: IResolvable) {
    cdkBuilder.riskExceptionConfiguration(riskExceptionConfiguration)
  }

  /**
   * @param riskExceptionConfiguration The configuration to override the risk decision.
   */
  public
      fun riskExceptionConfiguration(riskExceptionConfiguration: CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty) {
    cdkBuilder.riskExceptionConfiguration(riskExceptionConfiguration)
  }

  /**
   * @param userPoolId The user pool ID. 
   */
  public fun userPoolId(userPoolId: String) {
    cdkBuilder.userPoolId(userPoolId)
  }

  public fun build(): CfnUserPoolRiskConfigurationAttachmentProps = cdkBuilder.build()
}
