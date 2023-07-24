@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnCampaign
import kotlin.Number
import kotlin.String

/**
 * Specifies the settings for a campaign treatment.
 *
 * A *treatment* is a variation of a campaign that's used for A/B testing of a campaign.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * Object attributes;
 * Object customConfig;
 * Object metrics;
 * WriteTreatmentResourceProperty writeTreatmentResourceProperty =
 * WriteTreatmentResourceProperty.builder()
 * .customDeliveryConfiguration(CustomDeliveryConfigurationProperty.builder()
 * .deliveryUri("deliveryUri")
 * .endpointTypes(List.of("endpointTypes"))
 * .build())
 * .messageConfiguration(MessageConfigurationProperty.builder()
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
 * .build())
 * .schedule(ScheduleProperty.builder()
 * .endTime("endTime")
 * .eventFilter(CampaignEventFilterProperty.builder()
 * .dimensions(EventDimensionsProperty.builder()
 * .attributes(attributes)
 * .eventType(SetDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .metrics(metrics)
 * .build())
 * .filterType("filterType")
 * .build())
 * .frequency("frequency")
 * .isLocalTime(false)
 * .quietTime(QuietTimeProperty.builder()
 * .end("end")
 * .start("start")
 * .build())
 * .startTime("startTime")
 * .timeZone("timeZone")
 * .build())
 * .sizePercent(123)
 * .templateConfiguration(TemplateConfigurationProperty.builder()
 * .emailTemplate(TemplateProperty.builder()
 * .name("name")
 * .version("version")
 * .build())
 * .pushTemplate(TemplateProperty.builder()
 * .name("name")
 * .version("version")
 * .build())
 * .smsTemplate(TemplateProperty.builder()
 * .name("name")
 * .version("version")
 * .build())
 * .voiceTemplate(TemplateProperty.builder()
 * .name("name")
 * .version("version")
 * .build())
 * .build())
 * .treatmentDescription("treatmentDescription")
 * .treatmentName("treatmentName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-writetreatmentresource.html)
 */
@CdkDslMarker
public class CfnCampaignWriteTreatmentResourcePropertyDsl {
    private val cdkBuilder: CfnCampaign.WriteTreatmentResourceProperty.Builder =
        CfnCampaign.WriteTreatmentResourceProperty.builder()

    /**
     * @param customDeliveryConfiguration The delivery configuration settings for sending the
     * treatment through a custom channel.
     * This object is required if the `MessageConfiguration` object for the treatment specifies a
     * `CustomMessage` object.
     */
    public fun customDeliveryConfiguration(customDeliveryConfiguration: IResolvable) {
        cdkBuilder.customDeliveryConfiguration(customDeliveryConfiguration)
    }

    /**
     * @param customDeliveryConfiguration The delivery configuration settings for sending the
     * treatment through a custom channel.
     * This object is required if the `MessageConfiguration` object for the treatment specifies a
     * `CustomMessage` object.
     */
    public fun customDeliveryConfiguration(customDeliveryConfiguration: CfnCampaign.CustomDeliveryConfigurationProperty) {
        cdkBuilder.customDeliveryConfiguration(customDeliveryConfiguration)
    }

    /**
     * @param messageConfiguration The message configuration settings for the treatment.
     */
    public fun messageConfiguration(messageConfiguration: IResolvable) {
        cdkBuilder.messageConfiguration(messageConfiguration)
    }

    /**
     * @param messageConfiguration The message configuration settings for the treatment.
     */
    public fun messageConfiguration(messageConfiguration: CfnCampaign.MessageConfigurationProperty) {
        cdkBuilder.messageConfiguration(messageConfiguration)
    }

    /**
     * @param schedule The schedule settings for the treatment.
     */
    public fun schedule(schedule: IResolvable) {
        cdkBuilder.schedule(schedule)
    }

    /**
     * @param schedule The schedule settings for the treatment.
     */
    public fun schedule(schedule: CfnCampaign.ScheduleProperty) {
        cdkBuilder.schedule(schedule)
    }

    /**
     * @param sizePercent The allocated percentage of users (segment members) to send the treatment
     * to.
     */
    public fun sizePercent(sizePercent: Number) {
        cdkBuilder.sizePercent(sizePercent)
    }

    /**
     * @param templateConfiguration The message template to use for the treatment.
     */
    public fun templateConfiguration(templateConfiguration: IResolvable) {
        cdkBuilder.templateConfiguration(templateConfiguration)
    }

    /**
     * @param templateConfiguration The message template to use for the treatment.
     */
    public fun templateConfiguration(templateConfiguration: CfnCampaign.TemplateConfigurationProperty) {
        cdkBuilder.templateConfiguration(templateConfiguration)
    }

    /**
     * @param treatmentDescription A custom description of the treatment.
     */
    public fun treatmentDescription(treatmentDescription: String) {
        cdkBuilder.treatmentDescription(treatmentDescription)
    }

    /**
     * @param treatmentName A custom name for the treatment.
     */
    public fun treatmentName(treatmentName: String) {
        cdkBuilder.treatmentName(treatmentName)
    }

    public fun build(): CfnCampaign.WriteTreatmentResourceProperty = cdkBuilder.build()
}
