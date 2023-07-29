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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps

/**
 * Properties for defining a `CfnUserPoolRiskConfigurationAttachment`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * CfnUserPoolRiskConfigurationAttachmentProps cfnUserPoolRiskConfigurationAttachmentProps =
 * CfnUserPoolRiskConfigurationAttachmentProps.builder()
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
public class CfnUserPoolRiskConfigurationAttachmentPropsDsl {
    private val cdkBuilder: CfnUserPoolRiskConfigurationAttachmentProps.Builder =
        CfnUserPoolRiskConfigurationAttachmentProps.builder()

    /**
     * @param accountTakeoverRiskConfiguration The account takeover risk configuration object,
     *   including the `NotifyConfiguration` object and `Actions` to take if there is an account
     *   takeover.
     */
    public fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: IResolvable) {
        cdkBuilder.accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration)
    }

    /**
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
     * @param clientId The app client ID. You can specify the risk configuration for a single client
     *   (with a specific ClientId) or for all clients (by setting the ClientId to `ALL` ).
     */
    public fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
    }

    /**
     * @param compromisedCredentialsRiskConfiguration The compromised credentials risk configuration
     *   object, including the `EventFilter` and the `EventAction` .
     */
    public fun compromisedCredentialsRiskConfiguration(
        compromisedCredentialsRiskConfiguration: IResolvable
    ) {
        cdkBuilder.compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration)
    }

    /**
     * @param compromisedCredentialsRiskConfiguration The compromised credentials risk configuration
     *   object, including the `EventFilter` and the `EventAction` .
     */
    public fun compromisedCredentialsRiskConfiguration(
        compromisedCredentialsRiskConfiguration:
            CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty
    ) {
        cdkBuilder.compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration)
    }

    /** @param riskExceptionConfiguration The configuration to override the risk decision. */
    public fun riskExceptionConfiguration(riskExceptionConfiguration: IResolvable) {
        cdkBuilder.riskExceptionConfiguration(riskExceptionConfiguration)
    }

    /** @param riskExceptionConfiguration The configuration to override the risk decision. */
    public fun riskExceptionConfiguration(
        riskExceptionConfiguration:
            CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty
    ) {
        cdkBuilder.riskExceptionConfiguration(riskExceptionConfiguration)
    }

    /** @param userPoolId The user pool ID. */
    public fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): CfnUserPoolRiskConfigurationAttachmentProps = cdkBuilder.build()
}
