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
public class CfnUserPoolRiskConfigurationAttachmentAccountTakeoverActionsTypePropertyDsl {
    private val cdkBuilder:
        CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionsTypeProperty.Builder =
        CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionsTypeProperty.builder()

    public fun highAction(highAction: IResolvable) {
        cdkBuilder.highAction(highAction)
    }

    public fun highAction(highAction: CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty) {
        cdkBuilder.highAction(highAction)
    }

    public fun lowAction(lowAction: IResolvable) {
        cdkBuilder.lowAction(lowAction)
    }

    public fun lowAction(lowAction: CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty) {
        cdkBuilder.lowAction(lowAction)
    }

    public fun mediumAction(mediumAction: IResolvable) {
        cdkBuilder.mediumAction(mediumAction)
    }

    public fun mediumAction(mediumAction: CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty) {
        cdkBuilder.mediumAction(mediumAction)
    }

    public fun build(): CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionsTypeProperty =
        cdkBuilder.build()
}
