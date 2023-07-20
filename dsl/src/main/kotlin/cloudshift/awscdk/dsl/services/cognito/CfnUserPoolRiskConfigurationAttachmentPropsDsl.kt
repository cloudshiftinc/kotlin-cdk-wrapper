@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps
import kotlin.String

@CdkDslMarker
public class CfnUserPoolRiskConfigurationAttachmentPropsDsl {
    private val cdkBuilder: CfnUserPoolRiskConfigurationAttachmentProps.Builder =
        CfnUserPoolRiskConfigurationAttachmentProps.builder()

    public fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: IResolvable) {
        cdkBuilder.accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration)
    }

    public fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty) {
        cdkBuilder.accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration)
    }

    public fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
    }

    public fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: IResolvable) {
        cdkBuilder.compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration)
    }

    public fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty) {
        cdkBuilder.compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration)
    }

    public fun riskExceptionConfiguration(riskExceptionConfiguration: IResolvable) {
        cdkBuilder.riskExceptionConfiguration(riskExceptionConfiguration)
    }

    public fun riskExceptionConfiguration(riskExceptionConfiguration: CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty) {
        cdkBuilder.riskExceptionConfiguration(riskExceptionConfiguration)
    }

    public fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): CfnUserPoolRiskConfigurationAttachmentProps = cdkBuilder.build()
}
