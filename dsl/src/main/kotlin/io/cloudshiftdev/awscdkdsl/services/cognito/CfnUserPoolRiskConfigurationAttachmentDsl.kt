@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.cognito

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment
import software.constructs.Construct

/**
 * The `AWS::Cognito::UserPoolRiskConfigurationAttachment` resource sets the risk configuration that
 * is used for Amazon Cognito advanced security features.
 *
 * You can specify risk configuration for a single client (with a specific `clientId` ) or for all
 * clients (by setting the `clientId` to `ALL` ). If you specify `ALL` , the default configuration
 * is used for every client that has had no risk configuration set previously. If you specify risk
 * configuration for a particular client, it no longer falls back to the `ALL` configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * CfnUserPoolRiskConfigurationAttachment cfnUserPoolRiskConfigurationAttachment =
 * CfnUserPoolRiskConfigurationAttachment.Builder.create(this,
 * "MyCfnUserPoolRiskConfigurationAttachment")
 * .clientId("clientId")
 * .userPoolId("userPoolId")
 * // the properties below are optional
 * .accountTakeoverRiskConfiguration(AccountTakeoverRiskConfigurationTypeProperty.builder()
 * .actions(AccountTakeoverActionsTypeProperty.builder()
 * .highAction(AccountTakeoverActionTypeProperty.builder()
 * .eventAction("eventAction")
 * .notify(false)
 * .build())
 * .lowAction(AccountTakeoverActionTypeProperty.builder()
 * .eventAction("eventAction")
 * .notify(false)
 * .build())
 * .mediumAction(AccountTakeoverActionTypeProperty.builder()
 * .eventAction("eventAction")
 * .notify(false)
 * .build())
 * .build())
 * // the properties below are optional
 * .notifyConfiguration(NotifyConfigurationTypeProperty.builder()
 * .sourceArn("sourceArn")
 * // the properties below are optional
 * .blockEmail(NotifyEmailTypeProperty.builder()
 * .subject("subject")
 * // the properties below are optional
 * .htmlBody("htmlBody")
 * .textBody("textBody")
 * .build())
 * .from("from")
 * .mfaEmail(NotifyEmailTypeProperty.builder()
 * .subject("subject")
 * // the properties below are optional
 * .htmlBody("htmlBody")
 * .textBody("textBody")
 * .build())
 * .noActionEmail(NotifyEmailTypeProperty.builder()
 * .subject("subject")
 * // the properties below are optional
 * .htmlBody("htmlBody")
 * .textBody("textBody")
 * .build())
 * .replyTo("replyTo")
 * .build())
 * .build())
 * .compromisedCredentialsRiskConfiguration(CompromisedCredentialsRiskConfigurationTypeProperty.builder()
 * .actions(CompromisedCredentialsActionsTypeProperty.builder()
 * .eventAction("eventAction")
 * .build())
 * // the properties below are optional
 * .eventFilter(List.of("eventFilter"))
 * .build())
 * .riskExceptionConfiguration(RiskExceptionConfigurationTypeProperty.builder()
 * .blockedIpRangeList(List.of("blockedIpRangeList"))
 * .skippedIpRangeList(List.of("skippedIpRangeList"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html)
 */
@CdkDslMarker
public class CfnUserPoolRiskConfigurationAttachmentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnUserPoolRiskConfigurationAttachment.Builder =
        CfnUserPoolRiskConfigurationAttachment.Builder.create(scope, id)

    /**
     * The account takeover risk configuration object, including the `NotifyConfiguration` object
     * and `Actions` to take if there is an account takeover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfiguration)
     *
     * @param accountTakeoverRiskConfiguration The account takeover risk configuration object,
     *   including the `NotifyConfiguration` object and `Actions` to take if there is an account
     *   takeover.
     */
    public fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: IResolvable) {
        cdkBuilder.accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration)
    }

    /**
     * The account takeover risk configuration object, including the `NotifyConfiguration` object
     * and `Actions` to take if there is an account takeover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfiguration)
     *
     * @param accountTakeoverRiskConfiguration The account takeover risk configuration object,
     *   including the `NotifyConfiguration` object and `Actions` to take if there is an account
     *   takeover.
     */
    public fun accountTakeoverRiskConfiguration(
        accountTakeoverRiskConfiguration:
            CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty
    ) {
        cdkBuilder.accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration)
    }

    /**
     * The app client ID.
     *
     * You can specify the risk configuration for a single client (with a specific ClientId) or for
     * all clients (by setting the ClientId to `ALL` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-clientid)
     *
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
     *
     * @param compromisedCredentialsRiskConfiguration The compromised credentials risk configuration
     *   object, including the `EventFilter` and the `EventAction` .
     */
    public fun compromisedCredentialsRiskConfiguration(
        compromisedCredentialsRiskConfiguration: IResolvable
    ) {
        cdkBuilder.compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration)
    }

    /**
     * The compromised credentials risk configuration object, including the `EventFilter` and the
     * `EventAction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfiguration)
     *
     * @param compromisedCredentialsRiskConfiguration The compromised credentials risk configuration
     *   object, including the `EventFilter` and the `EventAction` .
     */
    public fun compromisedCredentialsRiskConfiguration(
        compromisedCredentialsRiskConfiguration:
            CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty
    ) {
        cdkBuilder.compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration)
    }

    /**
     * The configuration to override the risk decision.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfiguration)
     *
     * @param riskExceptionConfiguration The configuration to override the risk decision.
     */
    public fun riskExceptionConfiguration(riskExceptionConfiguration: IResolvable) {
        cdkBuilder.riskExceptionConfiguration(riskExceptionConfiguration)
    }

    /**
     * The configuration to override the risk decision.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfiguration)
     *
     * @param riskExceptionConfiguration The configuration to override the risk decision.
     */
    public fun riskExceptionConfiguration(
        riskExceptionConfiguration:
            CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty
    ) {
        cdkBuilder.riskExceptionConfiguration(riskExceptionConfiguration)
    }

    /**
     * The user pool ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-userpoolid)
     *
     * @param userPoolId The user pool ID.
     */
    public fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): CfnUserPoolRiskConfigurationAttachment = cdkBuilder.build()
}
