@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnCampaign
import software.amazon.awscdk.services.pinpoint.CfnCampaignProps

/**
 * Properties for defining a `CfnCampaign`.
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
 * Object tags;
 * CfnCampaignProps cfnCampaignProps = CfnCampaignProps.builder()
 * .applicationId("applicationId")
 * .name("name")
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
 * .segmentId("segmentId")
 * // the properties below are optional
 * .additionalTreatments(List.of(WriteTreatmentResourceProperty.builder()
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
 * .build()))
 * .campaignHook(CampaignHookProperty.builder()
 * .lambdaFunctionName("lambdaFunctionName")
 * .mode("mode")
 * .webUrl("webUrl")
 * .build())
 * .customDeliveryConfiguration(CustomDeliveryConfigurationProperty.builder()
 * .deliveryUri("deliveryUri")
 * .endpointTypes(List.of("endpointTypes"))
 * .build())
 * .description("description")
 * .holdoutPercent(123)
 * .isPaused(false)
 * .limits(LimitsProperty.builder()
 * .daily(123)
 * .maximumDuration(123)
 * .messagesPerSecond(123)
 * .session(123)
 * .total(123)
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
 * .priority(123)
 * .segmentVersion(123)
 * .tags(tags)
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html)
 */
@CdkDslMarker
public class CfnCampaignPropsDsl {
  private val cdkBuilder: CfnCampaignProps.Builder = CfnCampaignProps.builder()

  private val _additionalTreatments: MutableList<Any> = mutableListOf()

  /**
   * @param additionalTreatments An array of requests that defines additional treatments for the
   * campaign, in addition to the default treatment for the campaign.
   */
  public fun additionalTreatments(vararg additionalTreatments: Any) {
    _additionalTreatments.addAll(listOf(*additionalTreatments))
  }

  /**
   * @param additionalTreatments An array of requests that defines additional treatments for the
   * campaign, in addition to the default treatment for the campaign.
   */
  public fun additionalTreatments(additionalTreatments: Collection<Any>) {
    _additionalTreatments.addAll(additionalTreatments)
  }

  /**
   * @param additionalTreatments An array of requests that defines additional treatments for the
   * campaign, in addition to the default treatment for the campaign.
   */
  public fun additionalTreatments(additionalTreatments: IResolvable) {
    cdkBuilder.additionalTreatments(additionalTreatments)
  }

  /**
   * @param applicationId The unique identifier for the Amazon Pinpoint application that the
   * campaign is associated with. 
   */
  public fun applicationId(applicationId: String) {
    cdkBuilder.applicationId(applicationId)
  }

  /**
   * @param campaignHook Specifies the Lambda function to use as a code hook for a campaign.
   */
  public fun campaignHook(campaignHook: IResolvable) {
    cdkBuilder.campaignHook(campaignHook)
  }

  /**
   * @param campaignHook Specifies the Lambda function to use as a code hook for a campaign.
   */
  public fun campaignHook(campaignHook: CfnCampaign.CampaignHookProperty) {
    cdkBuilder.campaignHook(campaignHook)
  }

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
  public
      fun customDeliveryConfiguration(customDeliveryConfiguration: CfnCampaign.CustomDeliveryConfigurationProperty) {
    cdkBuilder.customDeliveryConfiguration(customDeliveryConfiguration)
  }

  /**
   * @param description A custom description of the campaign.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param holdoutPercent The allocated percentage of users (segment members) who shouldn't receive
   * messages from the campaign.
   */
  public fun holdoutPercent(holdoutPercent: Number) {
    cdkBuilder.holdoutPercent(holdoutPercent)
  }

  /**
   * @param isPaused Specifies whether to pause the campaign.
   * A paused campaign doesn't run unless you resume it by changing this value to `false` . If you
   * restart a campaign, the campaign restarts from the beginning and not at the point you paused it.
   * If a campaign is running it will complete and then pause. Pause only pauses or skips the next run
   * for a recurring future scheduled campaign. A campaign scheduled for immediate can't be paused.
   */
  public fun isPaused(isPaused: Boolean) {
    cdkBuilder.isPaused(isPaused)
  }

  /**
   * @param isPaused Specifies whether to pause the campaign.
   * A paused campaign doesn't run unless you resume it by changing this value to `false` . If you
   * restart a campaign, the campaign restarts from the beginning and not at the point you paused it.
   * If a campaign is running it will complete and then pause. Pause only pauses or skips the next run
   * for a recurring future scheduled campaign. A campaign scheduled for immediate can't be paused.
   */
  public fun isPaused(isPaused: IResolvable) {
    cdkBuilder.isPaused(isPaused)
  }

  /**
   * @param limits The messaging limits for the campaign.
   */
  public fun limits(limits: IResolvable) {
    cdkBuilder.limits(limits)
  }

  /**
   * @param limits The messaging limits for the campaign.
   */
  public fun limits(limits: CfnCampaign.LimitsProperty) {
    cdkBuilder.limits(limits)
  }

  /**
   * @param messageConfiguration The message configuration settings for the campaign.
   */
  public fun messageConfiguration(messageConfiguration: IResolvable) {
    cdkBuilder.messageConfiguration(messageConfiguration)
  }

  /**
   * @param messageConfiguration The message configuration settings for the campaign.
   */
  public fun messageConfiguration(messageConfiguration: CfnCampaign.MessageConfigurationProperty) {
    cdkBuilder.messageConfiguration(messageConfiguration)
  }

  /**
   * @param name The name of the campaign. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param priority An integer between 1 and 5, inclusive, that represents the priority of the
   * in-app message campaign, where 1 is the highest priority and 5 is the lowest.
   * If there are multiple messages scheduled to be displayed at the same time, the priority
   * determines the order in which those messages are displayed.
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  /**
   * @param schedule The schedule settings for the campaign. 
   */
  public fun schedule(schedule: IResolvable) {
    cdkBuilder.schedule(schedule)
  }

  /**
   * @param schedule The schedule settings for the campaign. 
   */
  public fun schedule(schedule: CfnCampaign.ScheduleProperty) {
    cdkBuilder.schedule(schedule)
  }

  /**
   * @param segmentId The unique identifier for the segment to associate with the campaign. 
   */
  public fun segmentId(segmentId: String) {
    cdkBuilder.segmentId(segmentId)
  }

  /**
   * @param segmentVersion The version of the segment to associate with the campaign.
   */
  public fun segmentVersion(segmentVersion: Number) {
    cdkBuilder.segmentVersion(segmentVersion)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tags)
    cdkBuilder.tags(builder.map)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
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
  public
      fun templateConfiguration(templateConfiguration: CfnCampaign.TemplateConfigurationProperty) {
    cdkBuilder.templateConfiguration(templateConfiguration)
  }

  /**
   * @param treatmentDescription A custom description of the default treatment for the campaign.
   */
  public fun treatmentDescription(treatmentDescription: String) {
    cdkBuilder.treatmentDescription(treatmentDescription)
  }

  /**
   * @param treatmentName A custom name of the default treatment for the campaign, if the campaign
   * has multiple treatments.
   * A *treatment* is a variation of a campaign that's used for A/B testing.
   */
  public fun treatmentName(treatmentName: String) {
    cdkBuilder.treatmentName(treatmentName)
  }

  public fun build(): CfnCampaignProps {
    if(_additionalTreatments.isNotEmpty()) cdkBuilder.additionalTreatments(_additionalTreatments)
    return cdkBuilder.build()
  }
}
