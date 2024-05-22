@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnCampaign`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pinpoint.*;
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
public interface CfnCampaignProps {
  /**
   * An array of requests that defines additional treatments for the campaign, in addition to the
   * default treatment for the campaign.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-additionaltreatments)
   */
  public fun additionalTreatments(): Any? = unwrap(this).getAdditionalTreatments()

  /**
   * The unique identifier for the Amazon Pinpoint application that the campaign is associated with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-applicationid)
   */
  public fun applicationId(): String

  /**
   * Specifies the Lambda function to use as a code hook for a campaign.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-campaignhook)
   */
  public fun campaignHook(): Any? = unwrap(this).getCampaignHook()

  /**
   * The delivery configuration settings for sending the treatment through a custom channel.
   *
   * This object is required if the `MessageConfiguration` object for the treatment specifies a
   * `CustomMessage` object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-customdeliveryconfiguration)
   */
  public fun customDeliveryConfiguration(): Any? = unwrap(this).getCustomDeliveryConfiguration()

  /**
   * A custom description of the campaign.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The allocated percentage of users (segment members) who shouldn't receive messages from the
   * campaign.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-holdoutpercent)
   */
  public fun holdoutPercent(): Number? = unwrap(this).getHoldoutPercent()

  /**
   * Specifies whether to pause the campaign.
   *
   * A paused campaign doesn't run unless you resume it by changing this value to `false` . If you
   * restart a campaign, the campaign restarts from the beginning and not at the point you paused it.
   * If a campaign is running it will complete and then pause. Pause only pauses or skips the next run
   * for a recurring future scheduled campaign. A campaign scheduled for immediate can't be paused.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-ispaused)
   */
  public fun isPaused(): Any? = unwrap(this).getIsPaused()

  /**
   * The messaging limits for the campaign.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-limits)
   */
  public fun limits(): Any? = unwrap(this).getLimits()

  /**
   * The message configuration settings for the treatment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-messageconfiguration)
   */
  public fun messageConfiguration(): Any? = unwrap(this).getMessageConfiguration()

  /**
   * The name of the campaign.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-name)
   */
  public fun name(): String

  /**
   * An integer between 1 and 5, inclusive, that represents the priority of the in-app message
   * campaign, where 1 is the highest priority and 5 is the lowest.
   *
   * If there are multiple messages scheduled to be displayed at the same time, the priority
   * determines the order in which those messages are displayed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-priority)
   */
  public fun priority(): Number? = unwrap(this).getPriority()

  /**
   * The schedule settings for the treatment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-schedule)
   */
  public fun schedule(): Any

  /**
   * The unique identifier for the segment to associate with the campaign.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-segmentid)
   */
  public fun segmentId(): String

  /**
   * The version of the segment to associate with the campaign.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-segmentversion)
   */
  public fun segmentVersion(): Number? = unwrap(this).getSegmentVersion()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-tags)
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * The message template to use for the treatment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-templateconfiguration)
   */
  public fun templateConfiguration(): Any? = unwrap(this).getTemplateConfiguration()

  /**
   * A custom description of the treatment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-treatmentdescription)
   */
  public fun treatmentDescription(): String? = unwrap(this).getTreatmentDescription()

  /**
   * A custom name for the treatment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-treatmentname)
   */
  public fun treatmentName(): String? = unwrap(this).getTreatmentName()

  /**
   * A builder for [CfnCampaignProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalTreatments An array of requests that defines additional treatments for the
     * campaign, in addition to the default treatment for the campaign.
     */
    public fun additionalTreatments(additionalTreatments: IResolvable)

    /**
     * @param additionalTreatments An array of requests that defines additional treatments for the
     * campaign, in addition to the default treatment for the campaign.
     */
    public fun additionalTreatments(additionalTreatments: List<Any>)

    /**
     * @param additionalTreatments An array of requests that defines additional treatments for the
     * campaign, in addition to the default treatment for the campaign.
     */
    public fun additionalTreatments(vararg additionalTreatments: Any)

    /**
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the
     * campaign is associated with. 
     */
    public fun applicationId(applicationId: String)

    /**
     * @param campaignHook Specifies the Lambda function to use as a code hook for a campaign.
     */
    public fun campaignHook(campaignHook: IResolvable)

    /**
     * @param campaignHook Specifies the Lambda function to use as a code hook for a campaign.
     */
    public fun campaignHook(campaignHook: CfnCampaign.CampaignHookProperty)

    /**
     * @param campaignHook Specifies the Lambda function to use as a code hook for a campaign.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7765edaf3643eed4f16af292a0530960c03cc3d63b639fa3595ac3ccddfd048b")
    public fun campaignHook(campaignHook: CfnCampaign.CampaignHookProperty.Builder.() -> Unit)

    /**
     * @param customDeliveryConfiguration The delivery configuration settings for sending the
     * treatment through a custom channel.
     * This object is required if the `MessageConfiguration` object for the treatment specifies a
     * `CustomMessage` object.
     */
    public fun customDeliveryConfiguration(customDeliveryConfiguration: IResolvable)

    /**
     * @param customDeliveryConfiguration The delivery configuration settings for sending the
     * treatment through a custom channel.
     * This object is required if the `MessageConfiguration` object for the treatment specifies a
     * `CustomMessage` object.
     */
    public
        fun customDeliveryConfiguration(customDeliveryConfiguration: CfnCampaign.CustomDeliveryConfigurationProperty)

    /**
     * @param customDeliveryConfiguration The delivery configuration settings for sending the
     * treatment through a custom channel.
     * This object is required if the `MessageConfiguration` object for the treatment specifies a
     * `CustomMessage` object.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef17dc66d71ce14660edfe0fafc57a5c392397c27b45a7a9dd40d0fc2d1a16c2")
    public
        fun customDeliveryConfiguration(customDeliveryConfiguration: CfnCampaign.CustomDeliveryConfigurationProperty.Builder.() -> Unit)

    /**
     * @param description A custom description of the campaign.
     */
    public fun description(description: String)

    /**
     * @param holdoutPercent The allocated percentage of users (segment members) who shouldn't
     * receive messages from the campaign.
     */
    public fun holdoutPercent(holdoutPercent: Number)

    /**
     * @param isPaused Specifies whether to pause the campaign.
     * A paused campaign doesn't run unless you resume it by changing this value to `false` . If you
     * restart a campaign, the campaign restarts from the beginning and not at the point you paused it.
     * If a campaign is running it will complete and then pause. Pause only pauses or skips the next
     * run for a recurring future scheduled campaign. A campaign scheduled for immediate can't be
     * paused.
     */
    public fun isPaused(isPaused: Boolean)

    /**
     * @param isPaused Specifies whether to pause the campaign.
     * A paused campaign doesn't run unless you resume it by changing this value to `false` . If you
     * restart a campaign, the campaign restarts from the beginning and not at the point you paused it.
     * If a campaign is running it will complete and then pause. Pause only pauses or skips the next
     * run for a recurring future scheduled campaign. A campaign scheduled for immediate can't be
     * paused.
     */
    public fun isPaused(isPaused: IResolvable)

    /**
     * @param limits The messaging limits for the campaign.
     */
    public fun limits(limits: IResolvable)

    /**
     * @param limits The messaging limits for the campaign.
     */
    public fun limits(limits: CfnCampaign.LimitsProperty)

    /**
     * @param limits The messaging limits for the campaign.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bccf8bde9d07fa206c1c3111e8a2abdbb90665708e16bab7cf6839e2432f68f8")
    public fun limits(limits: CfnCampaign.LimitsProperty.Builder.() -> Unit)

    /**
     * @param messageConfiguration The message configuration settings for the treatment.
     */
    public fun messageConfiguration(messageConfiguration: IResolvable)

    /**
     * @param messageConfiguration The message configuration settings for the treatment.
     */
    public fun messageConfiguration(messageConfiguration: CfnCampaign.MessageConfigurationProperty)

    /**
     * @param messageConfiguration The message configuration settings for the treatment.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("621da6393ff90d2efc4524e80d590e3e2d4195c99fd9aec0d6136bc524f9df03")
    public
        fun messageConfiguration(messageConfiguration: CfnCampaign.MessageConfigurationProperty.Builder.() -> Unit)

    /**
     * @param name The name of the campaign. 
     */
    public fun name(name: String)

    /**
     * @param priority An integer between 1 and 5, inclusive, that represents the priority of the
     * in-app message campaign, where 1 is the highest priority and 5 is the lowest.
     * If there are multiple messages scheduled to be displayed at the same time, the priority
     * determines the order in which those messages are displayed.
     */
    public fun priority(priority: Number)

    /**
     * @param schedule The schedule settings for the treatment. 
     */
    public fun schedule(schedule: IResolvable)

    /**
     * @param schedule The schedule settings for the treatment. 
     */
    public fun schedule(schedule: CfnCampaign.ScheduleProperty)

    /**
     * @param schedule The schedule settings for the treatment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("185f36fa4276f0b8fcba9e8b1761925ef9ec7ebc207df3eca981325f941886c5")
    public fun schedule(schedule: CfnCampaign.ScheduleProperty.Builder.() -> Unit)

    /**
     * @param segmentId The unique identifier for the segment to associate with the campaign. 
     */
    public fun segmentId(segmentId: String)

    /**
     * @param segmentVersion The version of the segment to associate with the campaign.
     */
    public fun segmentVersion(segmentVersion: Number)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: Any)

    /**
     * @param templateConfiguration The message template to use for the treatment.
     */
    public fun templateConfiguration(templateConfiguration: IResolvable)

    /**
     * @param templateConfiguration The message template to use for the treatment.
     */
    public
        fun templateConfiguration(templateConfiguration: CfnCampaign.TemplateConfigurationProperty)

    /**
     * @param templateConfiguration The message template to use for the treatment.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dced4d0b704f7a2a535874cf3447517fa892e3e3d0ae5e1078802a75ff11d3ad")
    public
        fun templateConfiguration(templateConfiguration: CfnCampaign.TemplateConfigurationProperty.Builder.() -> Unit)

    /**
     * @param treatmentDescription A custom description of the treatment.
     */
    public fun treatmentDescription(treatmentDescription: String)

    /**
     * @param treatmentName A custom name for the treatment.
     */
    public fun treatmentName(treatmentName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnCampaignProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnCampaignProps.builder()

    /**
     * @param additionalTreatments An array of requests that defines additional treatments for the
     * campaign, in addition to the default treatment for the campaign.
     */
    override fun additionalTreatments(additionalTreatments: IResolvable) {
      cdkBuilder.additionalTreatments(additionalTreatments.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param additionalTreatments An array of requests that defines additional treatments for the
     * campaign, in addition to the default treatment for the campaign.
     */
    override fun additionalTreatments(additionalTreatments: List<Any>) {
      cdkBuilder.additionalTreatments(additionalTreatments.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param additionalTreatments An array of requests that defines additional treatments for the
     * campaign, in addition to the default treatment for the campaign.
     */
    override fun additionalTreatments(vararg additionalTreatments: Any): Unit =
        additionalTreatments(additionalTreatments.toList())

    /**
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the
     * campaign is associated with. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param campaignHook Specifies the Lambda function to use as a code hook for a campaign.
     */
    override fun campaignHook(campaignHook: IResolvable) {
      cdkBuilder.campaignHook(campaignHook.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param campaignHook Specifies the Lambda function to use as a code hook for a campaign.
     */
    override fun campaignHook(campaignHook: CfnCampaign.CampaignHookProperty) {
      cdkBuilder.campaignHook(campaignHook.let(CfnCampaign.CampaignHookProperty.Companion::unwrap))
    }

    /**
     * @param campaignHook Specifies the Lambda function to use as a code hook for a campaign.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7765edaf3643eed4f16af292a0530960c03cc3d63b639fa3595ac3ccddfd048b")
    override fun campaignHook(campaignHook: CfnCampaign.CampaignHookProperty.Builder.() -> Unit):
        Unit = campaignHook(CfnCampaign.CampaignHookProperty(campaignHook))

    /**
     * @param customDeliveryConfiguration The delivery configuration settings for sending the
     * treatment through a custom channel.
     * This object is required if the `MessageConfiguration` object for the treatment specifies a
     * `CustomMessage` object.
     */
    override fun customDeliveryConfiguration(customDeliveryConfiguration: IResolvable) {
      cdkBuilder.customDeliveryConfiguration(customDeliveryConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param customDeliveryConfiguration The delivery configuration settings for sending the
     * treatment through a custom channel.
     * This object is required if the `MessageConfiguration` object for the treatment specifies a
     * `CustomMessage` object.
     */
    override
        fun customDeliveryConfiguration(customDeliveryConfiguration: CfnCampaign.CustomDeliveryConfigurationProperty) {
      cdkBuilder.customDeliveryConfiguration(customDeliveryConfiguration.let(CfnCampaign.CustomDeliveryConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param customDeliveryConfiguration The delivery configuration settings for sending the
     * treatment through a custom channel.
     * This object is required if the `MessageConfiguration` object for the treatment specifies a
     * `CustomMessage` object.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef17dc66d71ce14660edfe0fafc57a5c392397c27b45a7a9dd40d0fc2d1a16c2")
    override
        fun customDeliveryConfiguration(customDeliveryConfiguration: CfnCampaign.CustomDeliveryConfigurationProperty.Builder.() -> Unit):
        Unit =
        customDeliveryConfiguration(CfnCampaign.CustomDeliveryConfigurationProperty(customDeliveryConfiguration))

    /**
     * @param description A custom description of the campaign.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param holdoutPercent The allocated percentage of users (segment members) who shouldn't
     * receive messages from the campaign.
     */
    override fun holdoutPercent(holdoutPercent: Number) {
      cdkBuilder.holdoutPercent(holdoutPercent)
    }

    /**
     * @param isPaused Specifies whether to pause the campaign.
     * A paused campaign doesn't run unless you resume it by changing this value to `false` . If you
     * restart a campaign, the campaign restarts from the beginning and not at the point you paused it.
     * If a campaign is running it will complete and then pause. Pause only pauses or skips the next
     * run for a recurring future scheduled campaign. A campaign scheduled for immediate can't be
     * paused.
     */
    override fun isPaused(isPaused: Boolean) {
      cdkBuilder.isPaused(isPaused)
    }

    /**
     * @param isPaused Specifies whether to pause the campaign.
     * A paused campaign doesn't run unless you resume it by changing this value to `false` . If you
     * restart a campaign, the campaign restarts from the beginning and not at the point you paused it.
     * If a campaign is running it will complete and then pause. Pause only pauses or skips the next
     * run for a recurring future scheduled campaign. A campaign scheduled for immediate can't be
     * paused.
     */
    override fun isPaused(isPaused: IResolvable) {
      cdkBuilder.isPaused(isPaused.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param limits The messaging limits for the campaign.
     */
    override fun limits(limits: IResolvable) {
      cdkBuilder.limits(limits.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param limits The messaging limits for the campaign.
     */
    override fun limits(limits: CfnCampaign.LimitsProperty) {
      cdkBuilder.limits(limits.let(CfnCampaign.LimitsProperty.Companion::unwrap))
    }

    /**
     * @param limits The messaging limits for the campaign.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bccf8bde9d07fa206c1c3111e8a2abdbb90665708e16bab7cf6839e2432f68f8")
    override fun limits(limits: CfnCampaign.LimitsProperty.Builder.() -> Unit): Unit =
        limits(CfnCampaign.LimitsProperty(limits))

    /**
     * @param messageConfiguration The message configuration settings for the treatment.
     */
    override fun messageConfiguration(messageConfiguration: IResolvable) {
      cdkBuilder.messageConfiguration(messageConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param messageConfiguration The message configuration settings for the treatment.
     */
    override
        fun messageConfiguration(messageConfiguration: CfnCampaign.MessageConfigurationProperty) {
      cdkBuilder.messageConfiguration(messageConfiguration.let(CfnCampaign.MessageConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param messageConfiguration The message configuration settings for the treatment.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("621da6393ff90d2efc4524e80d590e3e2d4195c99fd9aec0d6136bc524f9df03")
    override
        fun messageConfiguration(messageConfiguration: CfnCampaign.MessageConfigurationProperty.Builder.() -> Unit):
        Unit = messageConfiguration(CfnCampaign.MessageConfigurationProperty(messageConfiguration))

    /**
     * @param name The name of the campaign. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param priority An integer between 1 and 5, inclusive, that represents the priority of the
     * in-app message campaign, where 1 is the highest priority and 5 is the lowest.
     * If there are multiple messages scheduled to be displayed at the same time, the priority
     * determines the order in which those messages are displayed.
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    /**
     * @param schedule The schedule settings for the treatment. 
     */
    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param schedule The schedule settings for the treatment. 
     */
    override fun schedule(schedule: CfnCampaign.ScheduleProperty) {
      cdkBuilder.schedule(schedule.let(CfnCampaign.ScheduleProperty.Companion::unwrap))
    }

    /**
     * @param schedule The schedule settings for the treatment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("185f36fa4276f0b8fcba9e8b1761925ef9ec7ebc207df3eca981325f941886c5")
    override fun schedule(schedule: CfnCampaign.ScheduleProperty.Builder.() -> Unit): Unit =
        schedule(CfnCampaign.ScheduleProperty(schedule))

    /**
     * @param segmentId The unique identifier for the segment to associate with the campaign. 
     */
    override fun segmentId(segmentId: String) {
      cdkBuilder.segmentId(segmentId)
    }

    /**
     * @param segmentVersion The version of the segment to associate with the campaign.
     */
    override fun segmentVersion(segmentVersion: Number) {
      cdkBuilder.segmentVersion(segmentVersion)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param templateConfiguration The message template to use for the treatment.
     */
    override fun templateConfiguration(templateConfiguration: IResolvable) {
      cdkBuilder.templateConfiguration(templateConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param templateConfiguration The message template to use for the treatment.
     */
    override
        fun templateConfiguration(templateConfiguration: CfnCampaign.TemplateConfigurationProperty) {
      cdkBuilder.templateConfiguration(templateConfiguration.let(CfnCampaign.TemplateConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param templateConfiguration The message template to use for the treatment.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dced4d0b704f7a2a535874cf3447517fa892e3e3d0ae5e1078802a75ff11d3ad")
    override
        fun templateConfiguration(templateConfiguration: CfnCampaign.TemplateConfigurationProperty.Builder.() -> Unit):
        Unit =
        templateConfiguration(CfnCampaign.TemplateConfigurationProperty(templateConfiguration))

    /**
     * @param treatmentDescription A custom description of the treatment.
     */
    override fun treatmentDescription(treatmentDescription: String) {
      cdkBuilder.treatmentDescription(treatmentDescription)
    }

    /**
     * @param treatmentName A custom name for the treatment.
     */
    override fun treatmentName(treatmentName: String) {
      cdkBuilder.treatmentName(treatmentName)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnCampaignProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaignProps,
  ) : CdkObject(cdkObject), CfnCampaignProps {
    /**
     * An array of requests that defines additional treatments for the campaign, in addition to the
     * default treatment for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-additionaltreatments)
     */
    override fun additionalTreatments(): Any? = unwrap(this).getAdditionalTreatments()

    /**
     * The unique identifier for the Amazon Pinpoint application that the campaign is associated
     * with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-applicationid)
     */
    override fun applicationId(): String = unwrap(this).getApplicationId()

    /**
     * Specifies the Lambda function to use as a code hook for a campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-campaignhook)
     */
    override fun campaignHook(): Any? = unwrap(this).getCampaignHook()

    /**
     * The delivery configuration settings for sending the treatment through a custom channel.
     *
     * This object is required if the `MessageConfiguration` object for the treatment specifies a
     * `CustomMessage` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-customdeliveryconfiguration)
     */
    override fun customDeliveryConfiguration(): Any? = unwrap(this).getCustomDeliveryConfiguration()

    /**
     * A custom description of the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The allocated percentage of users (segment members) who shouldn't receive messages from the
     * campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-holdoutpercent)
     */
    override fun holdoutPercent(): Number? = unwrap(this).getHoldoutPercent()

    /**
     * Specifies whether to pause the campaign.
     *
     * A paused campaign doesn't run unless you resume it by changing this value to `false` . If you
     * restart a campaign, the campaign restarts from the beginning and not at the point you paused it.
     * If a campaign is running it will complete and then pause. Pause only pauses or skips the next
     * run for a recurring future scheduled campaign. A campaign scheduled for immediate can't be
     * paused.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-ispaused)
     */
    override fun isPaused(): Any? = unwrap(this).getIsPaused()

    /**
     * The messaging limits for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-limits)
     */
    override fun limits(): Any? = unwrap(this).getLimits()

    /**
     * The message configuration settings for the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-messageconfiguration)
     */
    override fun messageConfiguration(): Any? = unwrap(this).getMessageConfiguration()

    /**
     * The name of the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * An integer between 1 and 5, inclusive, that represents the priority of the in-app message
     * campaign, where 1 is the highest priority and 5 is the lowest.
     *
     * If there are multiple messages scheduled to be displayed at the same time, the priority
     * determines the order in which those messages are displayed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-priority)
     */
    override fun priority(): Number? = unwrap(this).getPriority()

    /**
     * The schedule settings for the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-schedule)
     */
    override fun schedule(): Any = unwrap(this).getSchedule()

    /**
     * The unique identifier for the segment to associate with the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-segmentid)
     */
    override fun segmentId(): String = unwrap(this).getSegmentId()

    /**
     * The version of the segment to associate with the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-segmentversion)
     */
    override fun segmentVersion(): Number? = unwrap(this).getSegmentVersion()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-tags)
     */
    override fun tags(): Any? = unwrap(this).getTags()

    /**
     * The message template to use for the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-templateconfiguration)
     */
    override fun templateConfiguration(): Any? = unwrap(this).getTemplateConfiguration()

    /**
     * A custom description of the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-treatmentdescription)
     */
    override fun treatmentDescription(): String? = unwrap(this).getTreatmentDescription()

    /**
     * A custom name for the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-treatmentname)
     */
    override fun treatmentName(): String? = unwrap(this).getTreatmentName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCampaignProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaignProps):
        CfnCampaignProps = CdkObjectWrappers.wrap(cdkObject) as? CfnCampaignProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCampaignProps):
        software.amazon.awscdk.services.pinpoint.CfnCampaignProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.pinpoint.CfnCampaignProps
  }
}
