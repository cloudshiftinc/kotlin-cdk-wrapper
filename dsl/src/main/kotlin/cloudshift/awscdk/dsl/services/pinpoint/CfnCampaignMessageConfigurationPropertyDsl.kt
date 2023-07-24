@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnCampaign

/**
 * Specifies the message configuration settings for a campaign.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * Object customConfig;
 * MessageConfigurationProperty messageConfigurationProperty =
 * MessageConfigurationProperty.builder()
 * .admMessage(MessageProperty.builder()
 * .action("action")
 * .body("body")
 * .imageIconUrl("imageIconUrl")
 * .imageSmallIconUrl("imageSmallIconUrl")
 * .imageUrl("imageUrl")
 * .jsonBody("jsonBody")
 * .mediaUrl("mediaUrl")
 * .rawContent("rawContent")
 * .silentPush(false)
 * .timeToLive(123)
 * .title("title")
 * .url("url")
 * .build())
 * .apnsMessage(MessageProperty.builder()
 * .action("action")
 * .body("body")
 * .imageIconUrl("imageIconUrl")
 * .imageSmallIconUrl("imageSmallIconUrl")
 * .imageUrl("imageUrl")
 * .jsonBody("jsonBody")
 * .mediaUrl("mediaUrl")
 * .rawContent("rawContent")
 * .silentPush(false)
 * .timeToLive(123)
 * .title("title")
 * .url("url")
 * .build())
 * .baiduMessage(MessageProperty.builder()
 * .action("action")
 * .body("body")
 * .imageIconUrl("imageIconUrl")
 * .imageSmallIconUrl("imageSmallIconUrl")
 * .imageUrl("imageUrl")
 * .jsonBody("jsonBody")
 * .mediaUrl("mediaUrl")
 * .rawContent("rawContent")
 * .silentPush(false)
 * .timeToLive(123)
 * .title("title")
 * .url("url")
 * .build())
 * .customMessage(CampaignCustomMessageProperty.builder()
 * .data("data")
 * .build())
 * .defaultMessage(MessageProperty.builder()
 * .action("action")
 * .body("body")
 * .imageIconUrl("imageIconUrl")
 * .imageSmallIconUrl("imageSmallIconUrl")
 * .imageUrl("imageUrl")
 * .jsonBody("jsonBody")
 * .mediaUrl("mediaUrl")
 * .rawContent("rawContent")
 * .silentPush(false)
 * .timeToLive(123)
 * .title("title")
 * .url("url")
 * .build())
 * .emailMessage(CampaignEmailMessageProperty.builder()
 * .body("body")
 * .fromAddress("fromAddress")
 * .htmlBody("htmlBody")
 * .title("title")
 * .build())
 * .gcmMessage(MessageProperty.builder()
 * .action("action")
 * .body("body")
 * .imageIconUrl("imageIconUrl")
 * .imageSmallIconUrl("imageSmallIconUrl")
 * .imageUrl("imageUrl")
 * .jsonBody("jsonBody")
 * .mediaUrl("mediaUrl")
 * .rawContent("rawContent")
 * .silentPush(false)
 * .timeToLive(123)
 * .title("title")
 * .url("url")
 * .build())
 * .inAppMessage(CampaignInAppMessageProperty.builder()
 * .content(List.of(InAppMessageContentProperty.builder()
 * .backgroundColor("backgroundColor")
 * .bodyConfig(InAppMessageBodyConfigProperty.builder()
 * .alignment("alignment")
 * .body("body")
 * .textColor("textColor")
 * .build())
 * .headerConfig(InAppMessageHeaderConfigProperty.builder()
 * .alignment("alignment")
 * .header("header")
 * .textColor("textColor")
 * .build())
 * .imageUrl("imageUrl")
 * .primaryBtn(InAppMessageButtonProperty.builder()
 * .android(OverrideButtonConfigurationProperty.builder()
 * .buttonAction("buttonAction")
 * .link("link")
 * .build())
 * .defaultConfig(DefaultButtonConfigurationProperty.builder()
 * .backgroundColor("backgroundColor")
 * .borderRadius(123)
 * .buttonAction("buttonAction")
 * .link("link")
 * .text("text")
 * .textColor("textColor")
 * .build())
 * .ios(OverrideButtonConfigurationProperty.builder()
 * .buttonAction("buttonAction")
 * .link("link")
 * .build())
 * .web(OverrideButtonConfigurationProperty.builder()
 * .buttonAction("buttonAction")
 * .link("link")
 * .build())
 * .build())
 * .secondaryBtn(InAppMessageButtonProperty.builder()
 * .android(OverrideButtonConfigurationProperty.builder()
 * .buttonAction("buttonAction")
 * .link("link")
 * .build())
 * .defaultConfig(DefaultButtonConfigurationProperty.builder()
 * .backgroundColor("backgroundColor")
 * .borderRadius(123)
 * .buttonAction("buttonAction")
 * .link("link")
 * .text("text")
 * .textColor("textColor")
 * .build())
 * .ios(OverrideButtonConfigurationProperty.builder()
 * .buttonAction("buttonAction")
 * .link("link")
 * .build())
 * .web(OverrideButtonConfigurationProperty.builder()
 * .buttonAction("buttonAction")
 * .link("link")
 * .build())
 * .build())
 * .build()))
 * .customConfig(customConfig)
 * .layout("layout")
 * .build())
 * .smsMessage(CampaignSmsMessageProperty.builder()
 * .body("body")
 * .entityId("entityId")
 * .messageType("messageType")
 * .originationNumber("originationNumber")
 * .senderId("senderId")
 * .templateId("templateId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-messageconfiguration.html)
 */
@CdkDslMarker
public class CfnCampaignMessageConfigurationPropertyDsl {
    private val cdkBuilder: CfnCampaign.MessageConfigurationProperty.Builder =
        CfnCampaign.MessageConfigurationProperty.builder()

    /**
     * @param admMessage The message that the campaign sends through the ADM (Amazon Device Messaging)
     * channel.
     * If specified, this message overrides the default message.
     */
    public fun admMessage(admMessage: IResolvable) {
        cdkBuilder.admMessage(admMessage)
    }

    /**
     * @param admMessage The message that the campaign sends through the ADM (Amazon Device Messaging)
     * channel.
     * If specified, this message overrides the default message.
     */
    public fun admMessage(admMessage: CfnCampaign.MessageProperty) {
        cdkBuilder.admMessage(admMessage)
    }

    /**
     * @param apnsMessage The message that the campaign sends through the APNs (Apple Push
     * Notification service) channel.
     * If specified, this message overrides the default message.
     */
    public fun apnsMessage(apnsMessage: IResolvable) {
        cdkBuilder.apnsMessage(apnsMessage)
    }

    /**
     * @param apnsMessage The message that the campaign sends through the APNs (Apple Push
     * Notification service) channel.
     * If specified, this message overrides the default message.
     */
    public fun apnsMessage(apnsMessage: CfnCampaign.MessageProperty) {
        cdkBuilder.apnsMessage(apnsMessage)
    }

    /**
     * @param baiduMessage The message that the campaign sends through the Baidu (Baidu Cloud Push)
     * channel.
     * If specified, this message overrides the default message.
     */
    public fun baiduMessage(baiduMessage: IResolvable) {
        cdkBuilder.baiduMessage(baiduMessage)
    }

    /**
     * @param baiduMessage The message that the campaign sends through the Baidu (Baidu Cloud Push)
     * channel.
     * If specified, this message overrides the default message.
     */
    public fun baiduMessage(baiduMessage: CfnCampaign.MessageProperty) {
        cdkBuilder.baiduMessage(baiduMessage)
    }

    /**
     * @param customMessage The message that the campaign sends through a custom channel, as specified
     * by the delivery configuration ( `CustomDeliveryConfiguration` ) settings for the campaign.
     * If specified, this message overrides the default message.
     */
    public fun customMessage(customMessage: IResolvable) {
        cdkBuilder.customMessage(customMessage)
    }

    /**
     * @param customMessage The message that the campaign sends through a custom channel, as specified
     * by the delivery configuration ( `CustomDeliveryConfiguration` ) settings for the campaign.
     * If specified, this message overrides the default message.
     */
    public fun customMessage(customMessage: CfnCampaign.CampaignCustomMessageProperty) {
        cdkBuilder.customMessage(customMessage)
    }

    /**
     * @param defaultMessage The default message that the campaign sends through all the channels that
     * are configured for the campaign.
     */
    public fun defaultMessage(defaultMessage: IResolvable) {
        cdkBuilder.defaultMessage(defaultMessage)
    }

    /**
     * @param defaultMessage The default message that the campaign sends through all the channels that
     * are configured for the campaign.
     */
    public fun defaultMessage(defaultMessage: CfnCampaign.MessageProperty) {
        cdkBuilder.defaultMessage(defaultMessage)
    }

    /**
     * @param emailMessage The message that the campaign sends through the email channel.
     * If specified, this message overrides the default message.
     */
    public fun emailMessage(emailMessage: IResolvable) {
        cdkBuilder.emailMessage(emailMessage)
    }

    /**
     * @param emailMessage The message that the campaign sends through the email channel.
     * If specified, this message overrides the default message.
     */
    public fun emailMessage(emailMessage: CfnCampaign.CampaignEmailMessageProperty) {
        cdkBuilder.emailMessage(emailMessage)
    }

    /**
     * @param gcmMessage The message that the campaign sends through the GCM channel, which enables
     * Amazon Pinpoint to send push notifications through the Firebase Cloud Messaging (FCM), formerly
     * Google Cloud Messaging (GCM), service.
     * If specified, this message overrides the default message.
     */
    public fun gcmMessage(gcmMessage: IResolvable) {
        cdkBuilder.gcmMessage(gcmMessage)
    }

    /**
     * @param gcmMessage The message that the campaign sends through the GCM channel, which enables
     * Amazon Pinpoint to send push notifications through the Firebase Cloud Messaging (FCM), formerly
     * Google Cloud Messaging (GCM), service.
     * If specified, this message overrides the default message.
     */
    public fun gcmMessage(gcmMessage: CfnCampaign.MessageProperty) {
        cdkBuilder.gcmMessage(gcmMessage)
    }

    /**
     * @param inAppMessage The default message for the in-app messaging channel.
     * This message overrides the default message ( `DefaultMessage` ).
     */
    public fun inAppMessage(inAppMessage: IResolvable) {
        cdkBuilder.inAppMessage(inAppMessage)
    }

    /**
     * @param inAppMessage The default message for the in-app messaging channel.
     * This message overrides the default message ( `DefaultMessage` ).
     */
    public fun inAppMessage(inAppMessage: CfnCampaign.CampaignInAppMessageProperty) {
        cdkBuilder.inAppMessage(inAppMessage)
    }

    /**
     * @param smsMessage The message that the campaign sends through the SMS channel.
     * If specified, this message overrides the default message.
     */
    public fun smsMessage(smsMessage: IResolvable) {
        cdkBuilder.smsMessage(smsMessage)
    }

    /**
     * @param smsMessage The message that the campaign sends through the SMS channel.
     * If specified, this message overrides the default message.
     */
    public fun smsMessage(smsMessage: CfnCampaign.CampaignSmsMessageProperty) {
        cdkBuilder.smsMessage(smsMessage)
    }

    public fun build(): CfnCampaign.MessageConfigurationProperty = cdkBuilder.build()
}
