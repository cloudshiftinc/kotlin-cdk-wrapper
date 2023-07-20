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

@CdkDslMarker
public class CfnUserPoolRiskConfigurationAttachmentAccountTakeoverRiskConfigurationTypePropertyDsl {
    private val cdkBuilder:
        CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty.Builder =
        CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty.builder()

    public fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions)
    }

    public fun actions(actions: CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionsTypeProperty) {
        cdkBuilder.actions(actions)
    }

    public fun notifyConfiguration(notifyConfiguration: IResolvable) {
        cdkBuilder.notifyConfiguration(notifyConfiguration)
    }

    public fun notifyConfiguration(notifyConfiguration: CfnUserPoolRiskConfigurationAttachment.NotifyConfigurationTypeProperty) {
        cdkBuilder.notifyConfiguration(notifyConfiguration)
    }

    public fun build(): CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty =
        cdkBuilder.build()
}
