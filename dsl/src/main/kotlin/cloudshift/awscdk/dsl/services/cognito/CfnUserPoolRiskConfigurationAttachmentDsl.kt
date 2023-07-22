@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment
import software.constructs.Construct

@CdkDslMarker
public class CfnUserPoolRiskConfigurationAttachmentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnUserPoolRiskConfigurationAttachment.Builder =
      CfnUserPoolRiskConfigurationAttachment.Builder.create(scope, id)

  /**
   * The account takeover risk configuration object, including the `NotifyConfiguration` object and
   * `Actions` to take if there is an account takeover.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfiguration)
   * @param accountTakeoverRiskConfiguration The account takeover risk configuration object,
   * including the `NotifyConfiguration` object and `Actions` to take if there is an account takeover. 
   */
  public fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: IResolvable) {
    cdkBuilder.accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration)
  }

  /**
   * The account takeover risk configuration object, including the `NotifyConfiguration` object and
   * `Actions` to take if there is an account takeover.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfiguration)
   * @param accountTakeoverRiskConfiguration The account takeover risk configuration object,
   * including the `NotifyConfiguration` object and `Actions` to take if there is an account takeover. 
   */
  public
      fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty) {
    cdkBuilder.accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration)
  }

  /**
   * The app client ID.
   *
   * You can specify the risk configuration for a single client (with a specific ClientId) or for
   * all clients (by setting the ClientId to `ALL` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-clientid)
   * @param clientId The app client ID. 
   */
  public fun clientId(clientId: String) {
    cdkBuilder.clientId(clientId)
  }

  /**
   * The compromised credentials risk configuration object, including the `EventFilter` and the
   * `EventAction` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfiguration)
   * @param compromisedCredentialsRiskConfiguration The compromised credentials risk configuration
   * object, including the `EventFilter` and the `EventAction` . 
   */
  public
      fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: IResolvable) {
    cdkBuilder.compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration)
  }

  /**
   * The compromised credentials risk configuration object, including the `EventFilter` and the
   * `EventAction` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfiguration)
   * @param compromisedCredentialsRiskConfiguration The compromised credentials risk configuration
   * object, including the `EventFilter` and the `EventAction` . 
   */
  public
      fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty) {
    cdkBuilder.compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration)
  }

  /**
   * The configuration to override the risk decision.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfiguration)
   * @param riskExceptionConfiguration The configuration to override the risk decision. 
   */
  public fun riskExceptionConfiguration(riskExceptionConfiguration: IResolvable) {
    cdkBuilder.riskExceptionConfiguration(riskExceptionConfiguration)
  }

  /**
   * The configuration to override the risk decision.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfiguration)
   * @param riskExceptionConfiguration The configuration to override the risk decision. 
   */
  public
      fun riskExceptionConfiguration(riskExceptionConfiguration: CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty) {
    cdkBuilder.riskExceptionConfiguration(riskExceptionConfiguration)
  }

  /**
   * The user pool ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-userpoolid)
   * @param userPoolId The user pool ID. 
   */
  public fun userPoolId(userPoolId: String) {
    cdkBuilder.userPoolId(userPoolId)
  }

  public fun build(): CfnUserPoolRiskConfigurationAttachment = cdkBuilder.build()
}
