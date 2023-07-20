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

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnCampaign

@CdkDslMarker
public class CfnCampaignMessageConfigurationPropertyDsl {
    private val cdkBuilder: CfnCampaign.MessageConfigurationProperty.Builder =
        CfnCampaign.MessageConfigurationProperty.builder()

    public fun admMessage(admMessage: IResolvable) {
        cdkBuilder.admMessage(admMessage)
    }

    public fun admMessage(admMessage: CfnCampaign.MessageProperty) {
        cdkBuilder.admMessage(admMessage)
    }

    public fun apnsMessage(apnsMessage: IResolvable) {
        cdkBuilder.apnsMessage(apnsMessage)
    }

    public fun apnsMessage(apnsMessage: CfnCampaign.MessageProperty) {
        cdkBuilder.apnsMessage(apnsMessage)
    }

    public fun baiduMessage(baiduMessage: IResolvable) {
        cdkBuilder.baiduMessage(baiduMessage)
    }

    public fun baiduMessage(baiduMessage: CfnCampaign.MessageProperty) {
        cdkBuilder.baiduMessage(baiduMessage)
    }

    public fun customMessage(customMessage: IResolvable) {
        cdkBuilder.customMessage(customMessage)
    }

    public fun customMessage(customMessage: CfnCampaign.CampaignCustomMessageProperty) {
        cdkBuilder.customMessage(customMessage)
    }

    public fun defaultMessage(defaultMessage: IResolvable) {
        cdkBuilder.defaultMessage(defaultMessage)
    }

    public fun defaultMessage(defaultMessage: CfnCampaign.MessageProperty) {
        cdkBuilder.defaultMessage(defaultMessage)
    }

    public fun emailMessage(emailMessage: IResolvable) {
        cdkBuilder.emailMessage(emailMessage)
    }

    public fun emailMessage(emailMessage: CfnCampaign.CampaignEmailMessageProperty) {
        cdkBuilder.emailMessage(emailMessage)
    }

    public fun gcmMessage(gcmMessage: IResolvable) {
        cdkBuilder.gcmMessage(gcmMessage)
    }

    public fun gcmMessage(gcmMessage: CfnCampaign.MessageProperty) {
        cdkBuilder.gcmMessage(gcmMessage)
    }

    public fun inAppMessage(inAppMessage: IResolvable) {
        cdkBuilder.inAppMessage(inAppMessage)
    }

    public fun inAppMessage(inAppMessage: CfnCampaign.CampaignInAppMessageProperty) {
        cdkBuilder.inAppMessage(inAppMessage)
    }

    public fun smsMessage(smsMessage: IResolvable) {
        cdkBuilder.smsMessage(smsMessage)
    }

    public fun smsMessage(smsMessage: CfnCampaign.CampaignSmsMessageProperty) {
        cdkBuilder.smsMessage(smsMessage)
    }

    public fun build(): CfnCampaign.MessageConfigurationProperty = cdkBuilder.build()
}
