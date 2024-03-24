@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
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
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies the settings for a campaign.
 *
 * A *campaign* is a messaging initiative that engages a specific segment of users for an Amazon
 * Pinpoint application.
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
 * CfnCampaign cfnCampaign = CfnCampaign.Builder.create(this, "MyCfnCampaign")
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
public open class CfnCampaign(
  cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCampaignProps,
  ) :
      this(software.amazon.awscdk.services.pinpoint.CfnCampaign(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnCampaignProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCampaignProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCampaignProps(props)
  )

  /**
   * An array of requests that defines additional treatments for the campaign, in addition to the
   * default treatment for the campaign.
   */
  public open fun additionalTreatments(): Any? = unwrap(this).getAdditionalTreatments()

  /**
   * An array of requests that defines additional treatments for the campaign, in addition to the
   * default treatment for the campaign.
   */
  public open fun additionalTreatments(`value`: IResolvable) {
    unwrap(this).setAdditionalTreatments(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array of requests that defines additional treatments for the campaign, in addition to the
   * default treatment for the campaign.
   */
  public open fun additionalTreatments(`value`: List<Any>) {
    unwrap(this).setAdditionalTreatments(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * An array of requests that defines additional treatments for the campaign, in addition to the
   * default treatment for the campaign.
   */
  public open fun additionalTreatments(vararg `value`: Any): Unit =
      additionalTreatments(`value`.toList())

  /**
   * The unique identifier for the Amazon Pinpoint application that the campaign is associated with.
   */
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  /**
   * The unique identifier for the Amazon Pinpoint application that the campaign is associated with.
   */
  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the campaign.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The unique identifier for the campaign.
   */
  public open fun attrCampaignId(): String = unwrap(this).getAttrCampaignId()

  /**
   * Specifies the Lambda function to use as a code hook for a campaign.
   */
  public open fun campaignHook(): Any? = unwrap(this).getCampaignHook()

  /**
   * Specifies the Lambda function to use as a code hook for a campaign.
   */
  public open fun campaignHook(`value`: IResolvable) {
    unwrap(this).setCampaignHook(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the Lambda function to use as a code hook for a campaign.
   */
  public open fun campaignHook(`value`: CampaignHookProperty) {
    unwrap(this).setCampaignHook(`value`.let(CampaignHookProperty::unwrap))
  }

  /**
   * Specifies the Lambda function to use as a code hook for a campaign.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("87a9909a6c0c680f8ecf4d56ce53ffa564fb06697f7b344ab2a978e12388a27b")
  public open fun campaignHook(`value`: CampaignHookProperty.Builder.() -> Unit): Unit =
      campaignHook(CampaignHookProperty(`value`))

  /**
   * The delivery configuration settings for sending the treatment through a custom channel.
   */
  public open fun customDeliveryConfiguration(): Any? =
      unwrap(this).getCustomDeliveryConfiguration()

  /**
   * The delivery configuration settings for sending the treatment through a custom channel.
   */
  public open fun customDeliveryConfiguration(`value`: IResolvable) {
    unwrap(this).setCustomDeliveryConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The delivery configuration settings for sending the treatment through a custom channel.
   */
  public open fun customDeliveryConfiguration(`value`: CustomDeliveryConfigurationProperty) {
    unwrap(this).setCustomDeliveryConfiguration(`value`.let(CustomDeliveryConfigurationProperty::unwrap))
  }

  /**
   * The delivery configuration settings for sending the treatment through a custom channel.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a81ed56b3c5591a570961cb61e4418166457324109eeaf12cb3ce0c8431296f7")
  public open
      fun customDeliveryConfiguration(`value`: CustomDeliveryConfigurationProperty.Builder.() -> Unit):
      Unit = customDeliveryConfiguration(CustomDeliveryConfigurationProperty(`value`))

  /**
   * A custom description of the campaign.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A custom description of the campaign.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The allocated percentage of users (segment members) who shouldn't receive messages from the
   * campaign.
   */
  public open fun holdoutPercent(): Number? = unwrap(this).getHoldoutPercent()

  /**
   * The allocated percentage of users (segment members) who shouldn't receive messages from the
   * campaign.
   */
  public open fun holdoutPercent(`value`: Number) {
    unwrap(this).setHoldoutPercent(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Specifies whether to pause the campaign.
   */
  public open fun isPaused(): Any? = unwrap(this).getIsPaused()

  /**
   * Specifies whether to pause the campaign.
   */
  public open fun isPaused(`value`: Boolean) {
    unwrap(this).setIsPaused(`value`)
  }

  /**
   * Specifies whether to pause the campaign.
   */
  public open fun isPaused(`value`: IResolvable) {
    unwrap(this).setIsPaused(`value`.let(IResolvable::unwrap))
  }

  /**
   * The messaging limits for the campaign.
   */
  public open fun limits(): Any? = unwrap(this).getLimits()

  /**
   * The messaging limits for the campaign.
   */
  public open fun limits(`value`: IResolvable) {
    unwrap(this).setLimits(`value`.let(IResolvable::unwrap))
  }

  /**
   * The messaging limits for the campaign.
   */
  public open fun limits(`value`: LimitsProperty) {
    unwrap(this).setLimits(`value`.let(LimitsProperty::unwrap))
  }

  /**
   * The messaging limits for the campaign.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("197d293c5309d2634829ea70c3acc1496458b16fc7b1fd0e975124ec57ef1dec")
  public open fun limits(`value`: LimitsProperty.Builder.() -> Unit): Unit =
      limits(LimitsProperty(`value`))

  /**
   * The message configuration settings for the treatment.
   */
  public open fun messageConfiguration(): Any? = unwrap(this).getMessageConfiguration()

  /**
   * The message configuration settings for the treatment.
   */
  public open fun messageConfiguration(`value`: IResolvable) {
    unwrap(this).setMessageConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The message configuration settings for the treatment.
   */
  public open fun messageConfiguration(`value`: MessageConfigurationProperty) {
    unwrap(this).setMessageConfiguration(`value`.let(MessageConfigurationProperty::unwrap))
  }

  /**
   * The message configuration settings for the treatment.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5827d0a95e6486b3d26076451747e1ba1b35c085f0989e95b460dce2868824f4")
  public open fun messageConfiguration(`value`: MessageConfigurationProperty.Builder.() -> Unit):
      Unit = messageConfiguration(MessageConfigurationProperty(`value`))

  /**
   * The name of the campaign.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the campaign.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * An integer between 1 and 5, inclusive, that represents the priority of the in-app message
   * campaign, where 1 is the highest priority and 5 is the lowest.
   */
  public open fun priority(): Number? = unwrap(this).getPriority()

  /**
   * An integer between 1 and 5, inclusive, that represents the priority of the in-app message
   * campaign, where 1 is the highest priority and 5 is the lowest.
   */
  public open fun priority(`value`: Number) {
    unwrap(this).setPriority(`value`)
  }

  /**
   * The schedule settings for the treatment.
   */
  public open fun schedule(): Any = unwrap(this).getSchedule()

  /**
   * The schedule settings for the treatment.
   */
  public open fun schedule(`value`: IResolvable) {
    unwrap(this).setSchedule(`value`.let(IResolvable::unwrap))
  }

  /**
   * The schedule settings for the treatment.
   */
  public open fun schedule(`value`: ScheduleProperty) {
    unwrap(this).setSchedule(`value`.let(ScheduleProperty::unwrap))
  }

  /**
   * The schedule settings for the treatment.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("15116b54daa805390361610a72ab7bdeff9053cc158d622fd99d9a0373d97c9d")
  public open fun schedule(`value`: ScheduleProperty.Builder.() -> Unit): Unit =
      schedule(ScheduleProperty(`value`))

  /**
   * The unique identifier for the segment to associate with the campaign.
   */
  public open fun segmentId(): String = unwrap(this).getSegmentId()

  /**
   * The unique identifier for the segment to associate with the campaign.
   */
  public open fun segmentId(`value`: String) {
    unwrap(this).setSegmentId(`value`)
  }

  /**
   * The version of the segment to associate with the campaign.
   */
  public open fun segmentVersion(): Number? = unwrap(this).getSegmentVersion()

  /**
   * The version of the segment to associate with the campaign.
   */
  public open fun segmentVersion(`value`: Number) {
    unwrap(this).setSegmentVersion(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * The message template to use for the treatment.
   */
  public open fun templateConfiguration(): Any? = unwrap(this).getTemplateConfiguration()

  /**
   * The message template to use for the treatment.
   */
  public open fun templateConfiguration(`value`: IResolvable) {
    unwrap(this).setTemplateConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The message template to use for the treatment.
   */
  public open fun templateConfiguration(`value`: TemplateConfigurationProperty) {
    unwrap(this).setTemplateConfiguration(`value`.let(TemplateConfigurationProperty::unwrap))
  }

  /**
   * The message template to use for the treatment.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("eac3745128caf0d33396538104b1fe4b29936cbcdffd62b047032e2aca2df105")
  public open fun templateConfiguration(`value`: TemplateConfigurationProperty.Builder.() -> Unit):
      Unit = templateConfiguration(TemplateConfigurationProperty(`value`))

  /**
   * A custom description of the treatment.
   */
  public open fun treatmentDescription(): String? = unwrap(this).getTreatmentDescription()

  /**
   * A custom description of the treatment.
   */
  public open fun treatmentDescription(`value`: String) {
    unwrap(this).setTreatmentDescription(`value`)
  }

  /**
   * A custom name for the treatment.
   */
  public open fun treatmentName(): String? = unwrap(this).getTreatmentName()

  /**
   * A custom name for the treatment.
   */
  public open fun treatmentName(`value`: String) {
    unwrap(this).setTreatmentName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.pinpoint.CfnCampaign].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An array of requests that defines additional treatments for the campaign, in addition to the
     * default treatment for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-additionaltreatments)
     * @param additionalTreatments An array of requests that defines additional treatments for the
     * campaign, in addition to the default treatment for the campaign. 
     */
    public fun additionalTreatments(additionalTreatments: IResolvable)

    /**
     * An array of requests that defines additional treatments for the campaign, in addition to the
     * default treatment for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-additionaltreatments)
     * @param additionalTreatments An array of requests that defines additional treatments for the
     * campaign, in addition to the default treatment for the campaign. 
     */
    public fun additionalTreatments(additionalTreatments: List<Any>)

    /**
     * An array of requests that defines additional treatments for the campaign, in addition to the
     * default treatment for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-additionaltreatments)
     * @param additionalTreatments An array of requests that defines additional treatments for the
     * campaign, in addition to the default treatment for the campaign. 
     */
    public fun additionalTreatments(vararg additionalTreatments: Any)

    /**
     * The unique identifier for the Amazon Pinpoint application that the campaign is associated
     * with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-applicationid)
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the
     * campaign is associated with. 
     */
    public fun applicationId(applicationId: String)

    /**
     * Specifies the Lambda function to use as a code hook for a campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-campaignhook)
     * @param campaignHook Specifies the Lambda function to use as a code hook for a campaign. 
     */
    public fun campaignHook(campaignHook: IResolvable)

    /**
     * Specifies the Lambda function to use as a code hook for a campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-campaignhook)
     * @param campaignHook Specifies the Lambda function to use as a code hook for a campaign. 
     */
    public fun campaignHook(campaignHook: CampaignHookProperty)

    /**
     * Specifies the Lambda function to use as a code hook for a campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-campaignhook)
     * @param campaignHook Specifies the Lambda function to use as a code hook for a campaign. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cbbbe608fc3502d49b644c4f90718e34ac20ea0682479a90a171f68f386f8598")
    public fun campaignHook(campaignHook: CampaignHookProperty.Builder.() -> Unit)

    /**
     * The delivery configuration settings for sending the treatment through a custom channel.
     *
     * This object is required if the `MessageConfiguration` object for the treatment specifies a
     * `CustomMessage` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-customdeliveryconfiguration)
     * @param customDeliveryConfiguration The delivery configuration settings for sending the
     * treatment through a custom channel. 
     */
    public fun customDeliveryConfiguration(customDeliveryConfiguration: IResolvable)

    /**
     * The delivery configuration settings for sending the treatment through a custom channel.
     *
     * This object is required if the `MessageConfiguration` object for the treatment specifies a
     * `CustomMessage` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-customdeliveryconfiguration)
     * @param customDeliveryConfiguration The delivery configuration settings for sending the
     * treatment through a custom channel. 
     */
    public
        fun customDeliveryConfiguration(customDeliveryConfiguration: CustomDeliveryConfigurationProperty)

    /**
     * The delivery configuration settings for sending the treatment through a custom channel.
     *
     * This object is required if the `MessageConfiguration` object for the treatment specifies a
     * `CustomMessage` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-customdeliveryconfiguration)
     * @param customDeliveryConfiguration The delivery configuration settings for sending the
     * treatment through a custom channel. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dd22292571df67edacf7c81e8814cdd99f4249fdef60d3f2a5edf4284eee208a")
    public
        fun customDeliveryConfiguration(customDeliveryConfiguration: CustomDeliveryConfigurationProperty.Builder.() -> Unit)

    /**
     * A custom description of the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-description)
     * @param description A custom description of the campaign. 
     */
    public fun description(description: String)

    /**
     * The allocated percentage of users (segment members) who shouldn't receive messages from the
     * campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-holdoutpercent)
     * @param holdoutPercent The allocated percentage of users (segment members) who shouldn't
     * receive messages from the campaign. 
     */
    public fun holdoutPercent(holdoutPercent: Number)

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
     * @param isPaused Specifies whether to pause the campaign. 
     */
    public fun isPaused(isPaused: Boolean)

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
     * @param isPaused Specifies whether to pause the campaign. 
     */
    public fun isPaused(isPaused: IResolvable)

    /**
     * The messaging limits for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-limits)
     * @param limits The messaging limits for the campaign. 
     */
    public fun limits(limits: IResolvable)

    /**
     * The messaging limits for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-limits)
     * @param limits The messaging limits for the campaign. 
     */
    public fun limits(limits: LimitsProperty)

    /**
     * The messaging limits for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-limits)
     * @param limits The messaging limits for the campaign. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1b7f5268d7c8b58af19edbefde2d7e05d07f39606ffd5f2786b1ff4d842dab4")
    public fun limits(limits: LimitsProperty.Builder.() -> Unit)

    /**
     * The message configuration settings for the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-messageconfiguration)
     * @param messageConfiguration The message configuration settings for the treatment. 
     */
    public fun messageConfiguration(messageConfiguration: IResolvable)

    /**
     * The message configuration settings for the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-messageconfiguration)
     * @param messageConfiguration The message configuration settings for the treatment. 
     */
    public fun messageConfiguration(messageConfiguration: MessageConfigurationProperty)

    /**
     * The message configuration settings for the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-messageconfiguration)
     * @param messageConfiguration The message configuration settings for the treatment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b877da97cbc73f1c6c332b5657e333e68eab953af3dc318e9d0d67cb2fd1e017")
    public
        fun messageConfiguration(messageConfiguration: MessageConfigurationProperty.Builder.() -> Unit)

    /**
     * The name of the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-name)
     * @param name The name of the campaign. 
     */
    public fun name(name: String)

    /**
     * An integer between 1 and 5, inclusive, that represents the priority of the in-app message
     * campaign, where 1 is the highest priority and 5 is the lowest.
     *
     * If there are multiple messages scheduled to be displayed at the same time, the priority
     * determines the order in which those messages are displayed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-priority)
     * @param priority An integer between 1 and 5, inclusive, that represents the priority of the
     * in-app message campaign, where 1 is the highest priority and 5 is the lowest. 
     */
    public fun priority(priority: Number)

    /**
     * The schedule settings for the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-schedule)
     * @param schedule The schedule settings for the treatment. 
     */
    public fun schedule(schedule: IResolvable)

    /**
     * The schedule settings for the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-schedule)
     * @param schedule The schedule settings for the treatment. 
     */
    public fun schedule(schedule: ScheduleProperty)

    /**
     * The schedule settings for the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-schedule)
     * @param schedule The schedule settings for the treatment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("303e465d67ed43b1550705a7d6164b543bc5f8f7eea08f0379aa56aa4856d430")
    public fun schedule(schedule: ScheduleProperty.Builder.() -> Unit)

    /**
     * The unique identifier for the segment to associate with the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-segmentid)
     * @param segmentId The unique identifier for the segment to associate with the campaign. 
     */
    public fun segmentId(segmentId: String)

    /**
     * The version of the segment to associate with the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-segmentversion)
     * @param segmentVersion The version of the segment to associate with the campaign. 
     */
    public fun segmentVersion(segmentVersion: Number)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: Any)

    /**
     * The message template to use for the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-templateconfiguration)
     * @param templateConfiguration The message template to use for the treatment. 
     */
    public fun templateConfiguration(templateConfiguration: IResolvable)

    /**
     * The message template to use for the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-templateconfiguration)
     * @param templateConfiguration The message template to use for the treatment. 
     */
    public fun templateConfiguration(templateConfiguration: TemplateConfigurationProperty)

    /**
     * The message template to use for the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-templateconfiguration)
     * @param templateConfiguration The message template to use for the treatment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3478803e1fdaebd988a9fa38231b2f66a2112e01d792bd76ba31339567343814")
    public
        fun templateConfiguration(templateConfiguration: TemplateConfigurationProperty.Builder.() -> Unit)

    /**
     * A custom description of the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-treatmentdescription)
     * @param treatmentDescription A custom description of the treatment. 
     */
    public fun treatmentDescription(treatmentDescription: String)

    /**
     * A custom name for the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-treatmentname)
     * @param treatmentName A custom name for the treatment. 
     */
    public fun treatmentName(treatmentName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnCampaign.Builder =
        software.amazon.awscdk.services.pinpoint.CfnCampaign.Builder.create(scope, id)

    /**
     * An array of requests that defines additional treatments for the campaign, in addition to the
     * default treatment for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-additionaltreatments)
     * @param additionalTreatments An array of requests that defines additional treatments for the
     * campaign, in addition to the default treatment for the campaign. 
     */
    override fun additionalTreatments(additionalTreatments: IResolvable) {
      cdkBuilder.additionalTreatments(additionalTreatments.let(IResolvable::unwrap))
    }

    /**
     * An array of requests that defines additional treatments for the campaign, in addition to the
     * default treatment for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-additionaltreatments)
     * @param additionalTreatments An array of requests that defines additional treatments for the
     * campaign, in addition to the default treatment for the campaign. 
     */
    override fun additionalTreatments(additionalTreatments: List<Any>) {
      cdkBuilder.additionalTreatments(additionalTreatments.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * An array of requests that defines additional treatments for the campaign, in addition to the
     * default treatment for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-additionaltreatments)
     * @param additionalTreatments An array of requests that defines additional treatments for the
     * campaign, in addition to the default treatment for the campaign. 
     */
    override fun additionalTreatments(vararg additionalTreatments: Any): Unit =
        additionalTreatments(additionalTreatments.toList())

    /**
     * The unique identifier for the Amazon Pinpoint application that the campaign is associated
     * with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-applicationid)
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the
     * campaign is associated with. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * Specifies the Lambda function to use as a code hook for a campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-campaignhook)
     * @param campaignHook Specifies the Lambda function to use as a code hook for a campaign. 
     */
    override fun campaignHook(campaignHook: IResolvable) {
      cdkBuilder.campaignHook(campaignHook.let(IResolvable::unwrap))
    }

    /**
     * Specifies the Lambda function to use as a code hook for a campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-campaignhook)
     * @param campaignHook Specifies the Lambda function to use as a code hook for a campaign. 
     */
    override fun campaignHook(campaignHook: CampaignHookProperty) {
      cdkBuilder.campaignHook(campaignHook.let(CampaignHookProperty::unwrap))
    }

    /**
     * Specifies the Lambda function to use as a code hook for a campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-campaignhook)
     * @param campaignHook Specifies the Lambda function to use as a code hook for a campaign. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cbbbe608fc3502d49b644c4f90718e34ac20ea0682479a90a171f68f386f8598")
    override fun campaignHook(campaignHook: CampaignHookProperty.Builder.() -> Unit): Unit =
        campaignHook(CampaignHookProperty(campaignHook))

    /**
     * The delivery configuration settings for sending the treatment through a custom channel.
     *
     * This object is required if the `MessageConfiguration` object for the treatment specifies a
     * `CustomMessage` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-customdeliveryconfiguration)
     * @param customDeliveryConfiguration The delivery configuration settings for sending the
     * treatment through a custom channel. 
     */
    override fun customDeliveryConfiguration(customDeliveryConfiguration: IResolvable) {
      cdkBuilder.customDeliveryConfiguration(customDeliveryConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The delivery configuration settings for sending the treatment through a custom channel.
     *
     * This object is required if the `MessageConfiguration` object for the treatment specifies a
     * `CustomMessage` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-customdeliveryconfiguration)
     * @param customDeliveryConfiguration The delivery configuration settings for sending the
     * treatment through a custom channel. 
     */
    override
        fun customDeliveryConfiguration(customDeliveryConfiguration: CustomDeliveryConfigurationProperty) {
      cdkBuilder.customDeliveryConfiguration(customDeliveryConfiguration.let(CustomDeliveryConfigurationProperty::unwrap))
    }

    /**
     * The delivery configuration settings for sending the treatment through a custom channel.
     *
     * This object is required if the `MessageConfiguration` object for the treatment specifies a
     * `CustomMessage` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-customdeliveryconfiguration)
     * @param customDeliveryConfiguration The delivery configuration settings for sending the
     * treatment through a custom channel. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dd22292571df67edacf7c81e8814cdd99f4249fdef60d3f2a5edf4284eee208a")
    override
        fun customDeliveryConfiguration(customDeliveryConfiguration: CustomDeliveryConfigurationProperty.Builder.() -> Unit):
        Unit =
        customDeliveryConfiguration(CustomDeliveryConfigurationProperty(customDeliveryConfiguration))

    /**
     * A custom description of the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-description)
     * @param description A custom description of the campaign. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The allocated percentage of users (segment members) who shouldn't receive messages from the
     * campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-holdoutpercent)
     * @param holdoutPercent The allocated percentage of users (segment members) who shouldn't
     * receive messages from the campaign. 
     */
    override fun holdoutPercent(holdoutPercent: Number) {
      cdkBuilder.holdoutPercent(holdoutPercent)
    }

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
     * @param isPaused Specifies whether to pause the campaign. 
     */
    override fun isPaused(isPaused: Boolean) {
      cdkBuilder.isPaused(isPaused)
    }

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
     * @param isPaused Specifies whether to pause the campaign. 
     */
    override fun isPaused(isPaused: IResolvable) {
      cdkBuilder.isPaused(isPaused.let(IResolvable::unwrap))
    }

    /**
     * The messaging limits for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-limits)
     * @param limits The messaging limits for the campaign. 
     */
    override fun limits(limits: IResolvable) {
      cdkBuilder.limits(limits.let(IResolvable::unwrap))
    }

    /**
     * The messaging limits for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-limits)
     * @param limits The messaging limits for the campaign. 
     */
    override fun limits(limits: LimitsProperty) {
      cdkBuilder.limits(limits.let(LimitsProperty::unwrap))
    }

    /**
     * The messaging limits for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-limits)
     * @param limits The messaging limits for the campaign. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1b7f5268d7c8b58af19edbefde2d7e05d07f39606ffd5f2786b1ff4d842dab4")
    override fun limits(limits: LimitsProperty.Builder.() -> Unit): Unit =
        limits(LimitsProperty(limits))

    /**
     * The message configuration settings for the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-messageconfiguration)
     * @param messageConfiguration The message configuration settings for the treatment. 
     */
    override fun messageConfiguration(messageConfiguration: IResolvable) {
      cdkBuilder.messageConfiguration(messageConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The message configuration settings for the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-messageconfiguration)
     * @param messageConfiguration The message configuration settings for the treatment. 
     */
    override fun messageConfiguration(messageConfiguration: MessageConfigurationProperty) {
      cdkBuilder.messageConfiguration(messageConfiguration.let(MessageConfigurationProperty::unwrap))
    }

    /**
     * The message configuration settings for the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-messageconfiguration)
     * @param messageConfiguration The message configuration settings for the treatment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b877da97cbc73f1c6c332b5657e333e68eab953af3dc318e9d0d67cb2fd1e017")
    override
        fun messageConfiguration(messageConfiguration: MessageConfigurationProperty.Builder.() -> Unit):
        Unit = messageConfiguration(MessageConfigurationProperty(messageConfiguration))

    /**
     * The name of the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-name)
     * @param name The name of the campaign. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An integer between 1 and 5, inclusive, that represents the priority of the in-app message
     * campaign, where 1 is the highest priority and 5 is the lowest.
     *
     * If there are multiple messages scheduled to be displayed at the same time, the priority
     * determines the order in which those messages are displayed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-priority)
     * @param priority An integer between 1 and 5, inclusive, that represents the priority of the
     * in-app message campaign, where 1 is the highest priority and 5 is the lowest. 
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    /**
     * The schedule settings for the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-schedule)
     * @param schedule The schedule settings for the treatment. 
     */
    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    /**
     * The schedule settings for the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-schedule)
     * @param schedule The schedule settings for the treatment. 
     */
    override fun schedule(schedule: ScheduleProperty) {
      cdkBuilder.schedule(schedule.let(ScheduleProperty::unwrap))
    }

    /**
     * The schedule settings for the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-schedule)
     * @param schedule The schedule settings for the treatment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("303e465d67ed43b1550705a7d6164b543bc5f8f7eea08f0379aa56aa4856d430")
    override fun schedule(schedule: ScheduleProperty.Builder.() -> Unit): Unit =
        schedule(ScheduleProperty(schedule))

    /**
     * The unique identifier for the segment to associate with the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-segmentid)
     * @param segmentId The unique identifier for the segment to associate with the campaign. 
     */
    override fun segmentId(segmentId: String) {
      cdkBuilder.segmentId(segmentId)
    }

    /**
     * The version of the segment to associate with the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-segmentversion)
     * @param segmentVersion The version of the segment to associate with the campaign. 
     */
    override fun segmentVersion(segmentVersion: Number) {
      cdkBuilder.segmentVersion(segmentVersion)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    /**
     * The message template to use for the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-templateconfiguration)
     * @param templateConfiguration The message template to use for the treatment. 
     */
    override fun templateConfiguration(templateConfiguration: IResolvable) {
      cdkBuilder.templateConfiguration(templateConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The message template to use for the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-templateconfiguration)
     * @param templateConfiguration The message template to use for the treatment. 
     */
    override fun templateConfiguration(templateConfiguration: TemplateConfigurationProperty) {
      cdkBuilder.templateConfiguration(templateConfiguration.let(TemplateConfigurationProperty::unwrap))
    }

    /**
     * The message template to use for the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-templateconfiguration)
     * @param templateConfiguration The message template to use for the treatment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3478803e1fdaebd988a9fa38231b2f66a2112e01d792bd76ba31339567343814")
    override
        fun templateConfiguration(templateConfiguration: TemplateConfigurationProperty.Builder.() -> Unit):
        Unit = templateConfiguration(TemplateConfigurationProperty(templateConfiguration))

    /**
     * A custom description of the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-treatmentdescription)
     * @param treatmentDescription A custom description of the treatment. 
     */
    override fun treatmentDescription(treatmentDescription: String) {
      cdkBuilder.treatmentDescription(treatmentDescription)
    }

    /**
     * A custom name for the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-treatmentname)
     * @param treatmentName A custom name for the treatment. 
     */
    override fun treatmentName(treatmentName: String) {
      cdkBuilder.treatmentName(treatmentName)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnCampaign = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.pinpoint.CfnCampaign.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCampaign {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCampaign(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign): CfnCampaign
        = CfnCampaign(cdkObject)

    internal fun unwrap(wrapped: CfnCampaign): software.amazon.awscdk.services.pinpoint.CfnCampaign
        = wrapped.cdkObject as software.amazon.awscdk.services.pinpoint.CfnCampaign
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * AttributeDimensionProperty attributeDimensionProperty = AttributeDimensionProperty.builder()
   * .attributeType("attributeType")
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-attributedimension.html)
   */
  public interface AttributeDimensionProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-attributedimension.html#cfn-pinpoint-campaign-attributedimension-attributetype)
     */
    public fun attributeType(): String? = unwrap(this).getAttributeType()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-attributedimension.html#cfn-pinpoint-campaign-attributedimension-values)
     */
    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    /**
     * A builder for [AttributeDimensionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributeType the value to be set.
       */
      public fun attributeType(attributeType: String)

      /**
       * @param values the value to be set.
       */
      public fun values(values: List<String>)

      /**
       * @param values the value to be set.
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.AttributeDimensionProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.AttributeDimensionProperty.builder()

      /**
       * @param attributeType the value to be set.
       */
      override fun attributeType(attributeType: String) {
        cdkBuilder.attributeType(attributeType)
      }

      /**
       * @param values the value to be set.
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values the value to be set.
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.AttributeDimensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.AttributeDimensionProperty,
    ) : CdkObject(cdkObject), AttributeDimensionProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-attributedimension.html#cfn-pinpoint-campaign-attributedimension-attributetype)
       */
      override fun attributeType(): String? = unwrap(this).getAttributeType()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-attributedimension.html#cfn-pinpoint-campaign-attributedimension-values)
       */
      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AttributeDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.AttributeDimensionProperty):
          AttributeDimensionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AttributeDimensionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributeDimensionProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.AttributeDimensionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnCampaign.AttributeDimensionProperty
    }
  }

  /**
   * Specifies the contents of a message that's sent through a custom channel to recipients of a
   * campaign.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * CampaignCustomMessageProperty campaignCustomMessageProperty =
   * CampaignCustomMessageProperty.builder()
   * .data("data")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigncustommessage.html)
   */
  public interface CampaignCustomMessageProperty {
    /**
     * The raw, JSON-formatted string to use as the payload for the message.
     *
     * The maximum size is 5 KB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigncustommessage.html#cfn-pinpoint-campaign-campaigncustommessage-data)
     */
    public fun `data`(): String? = unwrap(this).getData()

    /**
     * A builder for [CampaignCustomMessageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param data The raw, JSON-formatted string to use as the payload for the message.
       * The maximum size is 5 KB.
       */
      public fun `data`(`data`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignCustomMessageProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignCustomMessageProperty.builder()

      /**
       * @param data The raw, JSON-formatted string to use as the payload for the message.
       * The maximum size is 5 KB.
       */
      override fun `data`(`data`: String) {
        cdkBuilder.`data`(`data`)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignCustomMessageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignCustomMessageProperty,
    ) : CdkObject(cdkObject), CampaignCustomMessageProperty {
      /**
       * The raw, JSON-formatted string to use as the payload for the message.
       *
       * The maximum size is 5 KB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigncustommessage.html#cfn-pinpoint-campaign-campaigncustommessage-data)
       */
      override fun `data`(): String? = unwrap(this).getData()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CampaignCustomMessageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignCustomMessageProperty):
          CampaignCustomMessageProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CampaignCustomMessageProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CampaignCustomMessageProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignCustomMessageProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignCustomMessageProperty
    }
  }

  /**
   * Specifies the content and "From" address for an email message that's sent to recipients of a
   * campaign.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * CampaignEmailMessageProperty campaignEmailMessageProperty =
   * CampaignEmailMessageProperty.builder()
   * .body("body")
   * .fromAddress("fromAddress")
   * .htmlBody("htmlBody")
   * .title("title")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignemailmessage.html)
   */
  public interface CampaignEmailMessageProperty {
    /**
     * The body of the email for recipients whose email clients don't render HTML content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignemailmessage.html#cfn-pinpoint-campaign-campaignemailmessage-body)
     */
    public fun body(): String? = unwrap(this).getBody()

    /**
     * The verified email address to send the email from.
     *
     * The default address is the `FromAddress` specified for the email channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignemailmessage.html#cfn-pinpoint-campaign-campaignemailmessage-fromaddress)
     */
    public fun fromAddress(): String? = unwrap(this).getFromAddress()

    /**
     * The body of the email, in HTML format, for recipients whose email clients render HTML
     * content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignemailmessage.html#cfn-pinpoint-campaign-campaignemailmessage-htmlbody)
     */
    public fun htmlBody(): String? = unwrap(this).getHtmlBody()

    /**
     * The subject line, or title, of the email.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignemailmessage.html#cfn-pinpoint-campaign-campaignemailmessage-title)
     */
    public fun title(): String? = unwrap(this).getTitle()

    /**
     * A builder for [CampaignEmailMessageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param body The body of the email for recipients whose email clients don't render HTML
       * content.
       */
      public fun body(body: String)

      /**
       * @param fromAddress The verified email address to send the email from.
       * The default address is the `FromAddress` specified for the email channel for the
       * application.
       */
      public fun fromAddress(fromAddress: String)

      /**
       * @param htmlBody The body of the email, in HTML format, for recipients whose email clients
       * render HTML content.
       */
      public fun htmlBody(htmlBody: String)

      /**
       * @param title The subject line, or title, of the email.
       */
      public fun title(title: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEmailMessageProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEmailMessageProperty.builder()

      /**
       * @param body The body of the email for recipients whose email clients don't render HTML
       * content.
       */
      override fun body(body: String) {
        cdkBuilder.body(body)
      }

      /**
       * @param fromAddress The verified email address to send the email from.
       * The default address is the `FromAddress` specified for the email channel for the
       * application.
       */
      override fun fromAddress(fromAddress: String) {
        cdkBuilder.fromAddress(fromAddress)
      }

      /**
       * @param htmlBody The body of the email, in HTML format, for recipients whose email clients
       * render HTML content.
       */
      override fun htmlBody(htmlBody: String) {
        cdkBuilder.htmlBody(htmlBody)
      }

      /**
       * @param title The subject line, or title, of the email.
       */
      override fun title(title: String) {
        cdkBuilder.title(title)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEmailMessageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEmailMessageProperty,
    ) : CdkObject(cdkObject), CampaignEmailMessageProperty {
      /**
       * The body of the email for recipients whose email clients don't render HTML content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignemailmessage.html#cfn-pinpoint-campaign-campaignemailmessage-body)
       */
      override fun body(): String? = unwrap(this).getBody()

      /**
       * The verified email address to send the email from.
       *
       * The default address is the `FromAddress` specified for the email channel for the
       * application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignemailmessage.html#cfn-pinpoint-campaign-campaignemailmessage-fromaddress)
       */
      override fun fromAddress(): String? = unwrap(this).getFromAddress()

      /**
       * The body of the email, in HTML format, for recipients whose email clients render HTML
       * content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignemailmessage.html#cfn-pinpoint-campaign-campaignemailmessage-htmlbody)
       */
      override fun htmlBody(): String? = unwrap(this).getHtmlBody()

      /**
       * The subject line, or title, of the email.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignemailmessage.html#cfn-pinpoint-campaign-campaignemailmessage-title)
       */
      override fun title(): String? = unwrap(this).getTitle()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CampaignEmailMessageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEmailMessageProperty):
          CampaignEmailMessageProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CampaignEmailMessageProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CampaignEmailMessageProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEmailMessageProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEmailMessageProperty
    }
  }

  /**
   * Specifies the settings for events that cause a campaign to be sent.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * Object attributes;
   * Object metrics;
   * CampaignEventFilterProperty campaignEventFilterProperty = CampaignEventFilterProperty.builder()
   * .dimensions(EventDimensionsProperty.builder()
   * .attributes(attributes)
   * .eventType(SetDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .metrics(metrics)
   * .build())
   * .filterType("filterType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigneventfilter.html)
   */
  public interface CampaignEventFilterProperty {
    /**
     * The dimension settings of the event filter for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigneventfilter.html#cfn-pinpoint-campaign-campaigneventfilter-dimensions)
     */
    public fun dimensions(): Any? = unwrap(this).getDimensions()

    /**
     * The type of event that causes the campaign to be sent.
     *
     * Valid values are: `SYSTEM` , sends the campaign when a system event occurs; and, `ENDPOINT` ,
     * sends the campaign when an endpoint event (Events resource) occurs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigneventfilter.html#cfn-pinpoint-campaign-campaigneventfilter-filtertype)
     */
    public fun filterType(): String? = unwrap(this).getFilterType()

    /**
     * A builder for [CampaignEventFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dimensions The dimension settings of the event filter for the campaign.
       */
      public fun dimensions(dimensions: IResolvable)

      /**
       * @param dimensions The dimension settings of the event filter for the campaign.
       */
      public fun dimensions(dimensions: EventDimensionsProperty)

      /**
       * @param dimensions The dimension settings of the event filter for the campaign.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0f3a6f301fe266dc628fdb1708f34abc9d1ea5d13b72d4ef29cea10dbf50010")
      public fun dimensions(dimensions: EventDimensionsProperty.Builder.() -> Unit)

      /**
       * @param filterType The type of event that causes the campaign to be sent.
       * Valid values are: `SYSTEM` , sends the campaign when a system event occurs; and, `ENDPOINT`
       * , sends the campaign when an endpoint event (Events resource) occurs.
       */
      public fun filterType(filterType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEventFilterProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEventFilterProperty.builder()

      /**
       * @param dimensions The dimension settings of the event filter for the campaign.
       */
      override fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
      }

      /**
       * @param dimensions The dimension settings of the event filter for the campaign.
       */
      override fun dimensions(dimensions: EventDimensionsProperty) {
        cdkBuilder.dimensions(dimensions.let(EventDimensionsProperty::unwrap))
      }

      /**
       * @param dimensions The dimension settings of the event filter for the campaign.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0f3a6f301fe266dc628fdb1708f34abc9d1ea5d13b72d4ef29cea10dbf50010")
      override fun dimensions(dimensions: EventDimensionsProperty.Builder.() -> Unit): Unit =
          dimensions(EventDimensionsProperty(dimensions))

      /**
       * @param filterType The type of event that causes the campaign to be sent.
       * Valid values are: `SYSTEM` , sends the campaign when a system event occurs; and, `ENDPOINT`
       * , sends the campaign when an endpoint event (Events resource) occurs.
       */
      override fun filterType(filterType: String) {
        cdkBuilder.filterType(filterType)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEventFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEventFilterProperty,
    ) : CdkObject(cdkObject), CampaignEventFilterProperty {
      /**
       * The dimension settings of the event filter for the campaign.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigneventfilter.html#cfn-pinpoint-campaign-campaigneventfilter-dimensions)
       */
      override fun dimensions(): Any? = unwrap(this).getDimensions()

      /**
       * The type of event that causes the campaign to be sent.
       *
       * Valid values are: `SYSTEM` , sends the campaign when a system event occurs; and, `ENDPOINT`
       * , sends the campaign when an endpoint event (Events resource) occurs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigneventfilter.html#cfn-pinpoint-campaign-campaigneventfilter-filtertype)
       */
      override fun filterType(): String? = unwrap(this).getFilterType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CampaignEventFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEventFilterProperty):
          CampaignEventFilterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CampaignEventFilterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CampaignEventFilterProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEventFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEventFilterProperty
    }
  }

  /**
   * Specifies settings for invoking an Lambda function that customizes a segment for a campaign.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * CampaignHookProperty campaignHookProperty = CampaignHookProperty.builder()
   * .lambdaFunctionName("lambdaFunctionName")
   * .mode("mode")
   * .webUrl("webUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignhook.html)
   */
  public interface CampaignHookProperty {
    /**
     * The name or Amazon Resource Name (ARN) of the Lambda function that Amazon Pinpoint invokes to
     * customize a segment for a campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignhook.html#cfn-pinpoint-campaign-campaignhook-lambdafunctionname)
     */
    public fun lambdaFunctionName(): String? = unwrap(this).getLambdaFunctionName()

    /**
     * The mode that Amazon Pinpoint uses to invoke the Lambda function. Possible values are:.
     *
     * * `FILTER` - Invoke the function to customize the segment that's used by a campaign.
     * * `DELIVERY` - (Deprecated) Previously, invoked the function to send a campaign through a
     * custom channel. This functionality is not supported anymore. To send a campaign through a custom
     * channel, use the `CustomDeliveryConfiguration` and `CampaignCustomMessage` objects of the
     * campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignhook.html#cfn-pinpoint-campaign-campaignhook-mode)
     */
    public fun mode(): String? = unwrap(this).getMode()

    /**
     * The web URL that Amazon Pinpoint calls to invoke the Lambda function over HTTPS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignhook.html#cfn-pinpoint-campaign-campaignhook-weburl)
     */
    public fun webUrl(): String? = unwrap(this).getWebUrl()

    /**
     * A builder for [CampaignHookProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param lambdaFunctionName The name or Amazon Resource Name (ARN) of the Lambda function
       * that Amazon Pinpoint invokes to customize a segment for a campaign.
       */
      public fun lambdaFunctionName(lambdaFunctionName: String)

      /**
       * @param mode The mode that Amazon Pinpoint uses to invoke the Lambda function. Possible
       * values are:.
       * * `FILTER` - Invoke the function to customize the segment that's used by a campaign.
       * * `DELIVERY` - (Deprecated) Previously, invoked the function to send a campaign through a
       * custom channel. This functionality is not supported anymore. To send a campaign through a
       * custom channel, use the `CustomDeliveryConfiguration` and `CampaignCustomMessage` objects of
       * the campaign.
       */
      public fun mode(mode: String)

      /**
       * @param webUrl The web URL that Amazon Pinpoint calls to invoke the Lambda function over
       * HTTPS.
       */
      public fun webUrl(webUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignHookProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignHookProperty.builder()

      /**
       * @param lambdaFunctionName The name or Amazon Resource Name (ARN) of the Lambda function
       * that Amazon Pinpoint invokes to customize a segment for a campaign.
       */
      override fun lambdaFunctionName(lambdaFunctionName: String) {
        cdkBuilder.lambdaFunctionName(lambdaFunctionName)
      }

      /**
       * @param mode The mode that Amazon Pinpoint uses to invoke the Lambda function. Possible
       * values are:.
       * * `FILTER` - Invoke the function to customize the segment that's used by a campaign.
       * * `DELIVERY` - (Deprecated) Previously, invoked the function to send a campaign through a
       * custom channel. This functionality is not supported anymore. To send a campaign through a
       * custom channel, use the `CustomDeliveryConfiguration` and `CampaignCustomMessage` objects of
       * the campaign.
       */
      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      /**
       * @param webUrl The web URL that Amazon Pinpoint calls to invoke the Lambda function over
       * HTTPS.
       */
      override fun webUrl(webUrl: String) {
        cdkBuilder.webUrl(webUrl)
      }

      public fun build(): software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignHookProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignHookProperty,
    ) : CdkObject(cdkObject), CampaignHookProperty {
      /**
       * The name or Amazon Resource Name (ARN) of the Lambda function that Amazon Pinpoint invokes
       * to customize a segment for a campaign.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignhook.html#cfn-pinpoint-campaign-campaignhook-lambdafunctionname)
       */
      override fun lambdaFunctionName(): String? = unwrap(this).getLambdaFunctionName()

      /**
       * The mode that Amazon Pinpoint uses to invoke the Lambda function. Possible values are:.
       *
       * * `FILTER` - Invoke the function to customize the segment that's used by a campaign.
       * * `DELIVERY` - (Deprecated) Previously, invoked the function to send a campaign through a
       * custom channel. This functionality is not supported anymore. To send a campaign through a
       * custom channel, use the `CustomDeliveryConfiguration` and `CampaignCustomMessage` objects of
       * the campaign.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignhook.html#cfn-pinpoint-campaign-campaignhook-mode)
       */
      override fun mode(): String? = unwrap(this).getMode()

      /**
       * The web URL that Amazon Pinpoint calls to invoke the Lambda function over HTTPS.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignhook.html#cfn-pinpoint-campaign-campaignhook-weburl)
       */
      override fun webUrl(): String? = unwrap(this).getWebUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CampaignHookProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignHookProperty):
          CampaignHookProperty = CdkObjectWrappers.wrap(cdkObject) as? CampaignHookProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CampaignHookProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignHookProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignHookProperty
    }
  }

  /**
   * Specifies the appearance of an in-app message, including the message type, the title and body
   * text, text and background colors, and the configurations of buttons that appear in the message.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * Object customConfig;
   * CampaignInAppMessageProperty campaignInAppMessageProperty =
   * CampaignInAppMessageProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigninappmessage.html)
   */
  public interface CampaignInAppMessageProperty {
    /**
     * An array that contains configurtion information about the in-app message for the campaign,
     * including title and body text, text colors, background colors, image URLs, and button
     * configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigninappmessage.html#cfn-pinpoint-campaign-campaigninappmessage-content)
     */
    public fun content(): Any? = unwrap(this).getContent()

    /**
     * Custom data, in the form of key-value pairs, that is included in an in-app messaging payload.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigninappmessage.html#cfn-pinpoint-campaign-campaigninappmessage-customconfig)
     */
    public fun customConfig(): Any? = unwrap(this).getCustomConfig()

    /**
     * A string that describes how the in-app message will appear. You can specify one of the
     * following:.
     *
     * * `BOTTOM_BANNER` – a message that appears as a banner at the bottom of the page.
     * * `TOP_BANNER` – a message that appears as a banner at the top of the page.
     * * `OVERLAYS` – a message that covers entire screen.
     * * `MOBILE_FEED` – a message that appears in a window in front of the page.
     * * `MIDDLE_BANNER` – a message that appears as a banner in the middle of the page.
     * * `CAROUSEL` – a scrollable layout of up to five unique messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigninappmessage.html#cfn-pinpoint-campaign-campaigninappmessage-layout)
     */
    public fun layout(): String? = unwrap(this).getLayout()

    /**
     * A builder for [CampaignInAppMessageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param content An array that contains configurtion information about the in-app message for
       * the campaign, including title and body text, text colors, background colors, image URLs, and
       * button configurations.
       */
      public fun content(content: IResolvable)

      /**
       * @param content An array that contains configurtion information about the in-app message for
       * the campaign, including title and body text, text colors, background colors, image URLs, and
       * button configurations.
       */
      public fun content(content: List<Any>)

      /**
       * @param content An array that contains configurtion information about the in-app message for
       * the campaign, including title and body text, text colors, background colors, image URLs, and
       * button configurations.
       */
      public fun content(vararg content: Any)

      /**
       * @param customConfig Custom data, in the form of key-value pairs, that is included in an
       * in-app messaging payload.
       */
      public fun customConfig(customConfig: Any)

      /**
       * @param layout A string that describes how the in-app message will appear. You can specify
       * one of the following:.
       * * `BOTTOM_BANNER` – a message that appears as a banner at the bottom of the page.
       * * `TOP_BANNER` – a message that appears as a banner at the top of the page.
       * * `OVERLAYS` – a message that covers entire screen.
       * * `MOBILE_FEED` – a message that appears in a window in front of the page.
       * * `MIDDLE_BANNER` – a message that appears as a banner in the middle of the page.
       * * `CAROUSEL` – a scrollable layout of up to five unique messages.
       */
      public fun layout(layout: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignInAppMessageProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignInAppMessageProperty.builder()

      /**
       * @param content An array that contains configurtion information about the in-app message for
       * the campaign, including title and body text, text colors, background colors, image URLs, and
       * button configurations.
       */
      override fun content(content: IResolvable) {
        cdkBuilder.content(content.let(IResolvable::unwrap))
      }

      /**
       * @param content An array that contains configurtion information about the in-app message for
       * the campaign, including title and body text, text colors, background colors, image URLs, and
       * button configurations.
       */
      override fun content(content: List<Any>) {
        cdkBuilder.content(content.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param content An array that contains configurtion information about the in-app message for
       * the campaign, including title and body text, text colors, background colors, image URLs, and
       * button configurations.
       */
      override fun content(vararg content: Any): Unit = content(content.toList())

      /**
       * @param customConfig Custom data, in the form of key-value pairs, that is included in an
       * in-app messaging payload.
       */
      override fun customConfig(customConfig: Any) {
        cdkBuilder.customConfig(customConfig)
      }

      /**
       * @param layout A string that describes how the in-app message will appear. You can specify
       * one of the following:.
       * * `BOTTOM_BANNER` – a message that appears as a banner at the bottom of the page.
       * * `TOP_BANNER` – a message that appears as a banner at the top of the page.
       * * `OVERLAYS` – a message that covers entire screen.
       * * `MOBILE_FEED` – a message that appears in a window in front of the page.
       * * `MIDDLE_BANNER` – a message that appears as a banner in the middle of the page.
       * * `CAROUSEL` – a scrollable layout of up to five unique messages.
       */
      override fun layout(layout: String) {
        cdkBuilder.layout(layout)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignInAppMessageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignInAppMessageProperty,
    ) : CdkObject(cdkObject), CampaignInAppMessageProperty {
      /**
       * An array that contains configurtion information about the in-app message for the campaign,
       * including title and body text, text colors, background colors, image URLs, and button
       * configurations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigninappmessage.html#cfn-pinpoint-campaign-campaigninappmessage-content)
       */
      override fun content(): Any? = unwrap(this).getContent()

      /**
       * Custom data, in the form of key-value pairs, that is included in an in-app messaging
       * payload.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigninappmessage.html#cfn-pinpoint-campaign-campaigninappmessage-customconfig)
       */
      override fun customConfig(): Any? = unwrap(this).getCustomConfig()

      /**
       * A string that describes how the in-app message will appear. You can specify one of the
       * following:.
       *
       * * `BOTTOM_BANNER` – a message that appears as a banner at the bottom of the page.
       * * `TOP_BANNER` – a message that appears as a banner at the top of the page.
       * * `OVERLAYS` – a message that covers entire screen.
       * * `MOBILE_FEED` – a message that appears in a window in front of the page.
       * * `MIDDLE_BANNER` – a message that appears as a banner in the middle of the page.
       * * `CAROUSEL` – a scrollable layout of up to five unique messages.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigninappmessage.html#cfn-pinpoint-campaign-campaigninappmessage-layout)
       */
      override fun layout(): String? = unwrap(this).getLayout()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CampaignInAppMessageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignInAppMessageProperty):
          CampaignInAppMessageProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CampaignInAppMessageProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CampaignInAppMessageProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignInAppMessageProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignInAppMessageProperty
    }
  }

  /**
   * Specifies the content and settings for an SMS message that's sent to recipients of a campaign.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * CampaignSmsMessageProperty campaignSmsMessageProperty = CampaignSmsMessageProperty.builder()
   * .body("body")
   * .entityId("entityId")
   * .messageType("messageType")
   * .originationNumber("originationNumber")
   * .senderId("senderId")
   * .templateId("templateId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignsmsmessage.html)
   */
  public interface CampaignSmsMessageProperty {
    /**
     * The body of the SMS message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignsmsmessage.html#cfn-pinpoint-campaign-campaignsmsmessage-body)
     */
    public fun body(): String? = unwrap(this).getBody()

    /**
     * The entity ID or Principal Entity (PE) id received from the regulatory body for sending SMS
     * in your country.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignsmsmessage.html#cfn-pinpoint-campaign-campaignsmsmessage-entityid)
     */
    public fun entityId(): String? = unwrap(this).getEntityId()

    /**
     * The SMS message type.
     *
     * Valid values are `TRANSACTIONAL` (for messages that are critical or time-sensitive, such as a
     * one-time passwords) and `PROMOTIONAL` (for messsages that aren't critical or time-sensitive,
     * such as marketing messages).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignsmsmessage.html#cfn-pinpoint-campaign-campaignsmsmessage-messagetype)
     */
    public fun messageType(): String? = unwrap(this).getMessageType()

    /**
     * The long code to send the SMS message from.
     *
     * This value should be one of the dedicated long codes that's assigned to your AWS account.
     * Although it isn't required, we recommend that you specify the long code using an E.164 format to
     * ensure prompt and accurate delivery of the message. For example, +12065550100.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignsmsmessage.html#cfn-pinpoint-campaign-campaignsmsmessage-originationnumber)
     */
    public fun originationNumber(): String? = unwrap(this).getOriginationNumber()

    /**
     * The alphabetic Sender ID to display as the sender of the message on a recipient's device.
     *
     * Support for sender IDs varies by country or region. To specify a phone number as the sender,
     * omit this parameter and use `OriginationNumber` instead. For more information about support for
     * Sender ID by country, see the [Amazon Pinpoint User
     * Guide](https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-countries.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignsmsmessage.html#cfn-pinpoint-campaign-campaignsmsmessage-senderid)
     */
    public fun senderId(): String? = unwrap(this).getSenderId()

    /**
     * The template ID received from the regulatory body for sending SMS in your country.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignsmsmessage.html#cfn-pinpoint-campaign-campaignsmsmessage-templateid)
     */
    public fun templateId(): String? = unwrap(this).getTemplateId()

    /**
     * A builder for [CampaignSmsMessageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param body The body of the SMS message.
       */
      public fun body(body: String)

      /**
       * @param entityId The entity ID or Principal Entity (PE) id received from the regulatory body
       * for sending SMS in your country.
       */
      public fun entityId(entityId: String)

      /**
       * @param messageType The SMS message type.
       * Valid values are `TRANSACTIONAL` (for messages that are critical or time-sensitive, such as
       * a one-time passwords) and `PROMOTIONAL` (for messsages that aren't critical or time-sensitive,
       * such as marketing messages).
       */
      public fun messageType(messageType: String)

      /**
       * @param originationNumber The long code to send the SMS message from.
       * This value should be one of the dedicated long codes that's assigned to your AWS account.
       * Although it isn't required, we recommend that you specify the long code using an E.164 format
       * to ensure prompt and accurate delivery of the message. For example, +12065550100.
       */
      public fun originationNumber(originationNumber: String)

      /**
       * @param senderId The alphabetic Sender ID to display as the sender of the message on a
       * recipient's device.
       * Support for sender IDs varies by country or region. To specify a phone number as the
       * sender, omit this parameter and use `OriginationNumber` instead. For more information about
       * support for Sender ID by country, see the [Amazon Pinpoint User
       * Guide](https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-countries.html) .
       */
      public fun senderId(senderId: String)

      /**
       * @param templateId The template ID received from the regulatory body for sending SMS in your
       * country.
       */
      public fun templateId(templateId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignSmsMessageProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignSmsMessageProperty.builder()

      /**
       * @param body The body of the SMS message.
       */
      override fun body(body: String) {
        cdkBuilder.body(body)
      }

      /**
       * @param entityId The entity ID or Principal Entity (PE) id received from the regulatory body
       * for sending SMS in your country.
       */
      override fun entityId(entityId: String) {
        cdkBuilder.entityId(entityId)
      }

      /**
       * @param messageType The SMS message type.
       * Valid values are `TRANSACTIONAL` (for messages that are critical or time-sensitive, such as
       * a one-time passwords) and `PROMOTIONAL` (for messsages that aren't critical or time-sensitive,
       * such as marketing messages).
       */
      override fun messageType(messageType: String) {
        cdkBuilder.messageType(messageType)
      }

      /**
       * @param originationNumber The long code to send the SMS message from.
       * This value should be one of the dedicated long codes that's assigned to your AWS account.
       * Although it isn't required, we recommend that you specify the long code using an E.164 format
       * to ensure prompt and accurate delivery of the message. For example, +12065550100.
       */
      override fun originationNumber(originationNumber: String) {
        cdkBuilder.originationNumber(originationNumber)
      }

      /**
       * @param senderId The alphabetic Sender ID to display as the sender of the message on a
       * recipient's device.
       * Support for sender IDs varies by country or region. To specify a phone number as the
       * sender, omit this parameter and use `OriginationNumber` instead. For more information about
       * support for Sender ID by country, see the [Amazon Pinpoint User
       * Guide](https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-countries.html) .
       */
      override fun senderId(senderId: String) {
        cdkBuilder.senderId(senderId)
      }

      /**
       * @param templateId The template ID received from the regulatory body for sending SMS in your
       * country.
       */
      override fun templateId(templateId: String) {
        cdkBuilder.templateId(templateId)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignSmsMessageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignSmsMessageProperty,
    ) : CdkObject(cdkObject), CampaignSmsMessageProperty {
      /**
       * The body of the SMS message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignsmsmessage.html#cfn-pinpoint-campaign-campaignsmsmessage-body)
       */
      override fun body(): String? = unwrap(this).getBody()

      /**
       * The entity ID or Principal Entity (PE) id received from the regulatory body for sending SMS
       * in your country.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignsmsmessage.html#cfn-pinpoint-campaign-campaignsmsmessage-entityid)
       */
      override fun entityId(): String? = unwrap(this).getEntityId()

      /**
       * The SMS message type.
       *
       * Valid values are `TRANSACTIONAL` (for messages that are critical or time-sensitive, such as
       * a one-time passwords) and `PROMOTIONAL` (for messsages that aren't critical or time-sensitive,
       * such as marketing messages).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignsmsmessage.html#cfn-pinpoint-campaign-campaignsmsmessage-messagetype)
       */
      override fun messageType(): String? = unwrap(this).getMessageType()

      /**
       * The long code to send the SMS message from.
       *
       * This value should be one of the dedicated long codes that's assigned to your AWS account.
       * Although it isn't required, we recommend that you specify the long code using an E.164 format
       * to ensure prompt and accurate delivery of the message. For example, +12065550100.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignsmsmessage.html#cfn-pinpoint-campaign-campaignsmsmessage-originationnumber)
       */
      override fun originationNumber(): String? = unwrap(this).getOriginationNumber()

      /**
       * The alphabetic Sender ID to display as the sender of the message on a recipient's device.
       *
       * Support for sender IDs varies by country or region. To specify a phone number as the
       * sender, omit this parameter and use `OriginationNumber` instead. For more information about
       * support for Sender ID by country, see the [Amazon Pinpoint User
       * Guide](https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-countries.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignsmsmessage.html#cfn-pinpoint-campaign-campaignsmsmessage-senderid)
       */
      override fun senderId(): String? = unwrap(this).getSenderId()

      /**
       * The template ID received from the regulatory body for sending SMS in your country.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignsmsmessage.html#cfn-pinpoint-campaign-campaignsmsmessage-templateid)
       */
      override fun templateId(): String? = unwrap(this).getTemplateId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CampaignSmsMessageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignSmsMessageProperty):
          CampaignSmsMessageProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CampaignSmsMessageProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CampaignSmsMessageProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignSmsMessageProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignSmsMessageProperty
    }
  }

  /**
   * Specifies the delivery configuration settings for sending a campaign or campaign treatment
   * through a custom channel.
   *
   * This object is required if you use the `CampaignCustomMessage` object to define the message to
   * send for the campaign or campaign treatment.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * CustomDeliveryConfigurationProperty customDeliveryConfigurationProperty =
   * CustomDeliveryConfigurationProperty.builder()
   * .deliveryUri("deliveryUri")
   * .endpointTypes(List.of("endpointTypes"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-customdeliveryconfiguration.html)
   */
  public interface CustomDeliveryConfigurationProperty {
    /**
     * The destination to send the campaign or treatment to. This value can be one of the
     * following:.
     *
     * * The name or Amazon Resource Name (ARN) of an AWS Lambda function to invoke to handle
     * delivery of the campaign or treatment.
     * * The URL for a web application or service that supports HTTPS and can receive the message.
     * The URL has to be a full URL, including the HTTPS protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-customdeliveryconfiguration.html#cfn-pinpoint-campaign-customdeliveryconfiguration-deliveryuri)
     */
    public fun deliveryUri(): String? = unwrap(this).getDeliveryUri()

    /**
     * The types of endpoints to send the campaign or treatment to.
     *
     * Each valid value maps to a type of channel that you can associate with an endpoint by using
     * the `ChannelType` property of an endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-customdeliveryconfiguration.html#cfn-pinpoint-campaign-customdeliveryconfiguration-endpointtypes)
     */
    public fun endpointTypes(): List<String> = unwrap(this).getEndpointTypes() ?: emptyList()

    /**
     * A builder for [CustomDeliveryConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deliveryUri The destination to send the campaign or treatment to. This value can be
       * one of the following:.
       * * The name or Amazon Resource Name (ARN) of an AWS Lambda function to invoke to handle
       * delivery of the campaign or treatment.
       * * The URL for a web application or service that supports HTTPS and can receive the message.
       * The URL has to be a full URL, including the HTTPS protocol.
       */
      public fun deliveryUri(deliveryUri: String)

      /**
       * @param endpointTypes The types of endpoints to send the campaign or treatment to.
       * Each valid value maps to a type of channel that you can associate with an endpoint by using
       * the `ChannelType` property of an endpoint.
       */
      public fun endpointTypes(endpointTypes: List<String>)

      /**
       * @param endpointTypes The types of endpoints to send the campaign or treatment to.
       * Each valid value maps to a type of channel that you can associate with an endpoint by using
       * the `ChannelType` property of an endpoint.
       */
      public fun endpointTypes(vararg endpointTypes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CustomDeliveryConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CustomDeliveryConfigurationProperty.builder()

      /**
       * @param deliveryUri The destination to send the campaign or treatment to. This value can be
       * one of the following:.
       * * The name or Amazon Resource Name (ARN) of an AWS Lambda function to invoke to handle
       * delivery of the campaign or treatment.
       * * The URL for a web application or service that supports HTTPS and can receive the message.
       * The URL has to be a full URL, including the HTTPS protocol.
       */
      override fun deliveryUri(deliveryUri: String) {
        cdkBuilder.deliveryUri(deliveryUri)
      }

      /**
       * @param endpointTypes The types of endpoints to send the campaign or treatment to.
       * Each valid value maps to a type of channel that you can associate with an endpoint by using
       * the `ChannelType` property of an endpoint.
       */
      override fun endpointTypes(endpointTypes: List<String>) {
        cdkBuilder.endpointTypes(endpointTypes)
      }

      /**
       * @param endpointTypes The types of endpoints to send the campaign or treatment to.
       * Each valid value maps to a type of channel that you can associate with an endpoint by using
       * the `ChannelType` property of an endpoint.
       */
      override fun endpointTypes(vararg endpointTypes: String): Unit =
          endpointTypes(endpointTypes.toList())

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CustomDeliveryConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.CustomDeliveryConfigurationProperty,
    ) : CdkObject(cdkObject), CustomDeliveryConfigurationProperty {
      /**
       * The destination to send the campaign or treatment to. This value can be one of the
       * following:.
       *
       * * The name or Amazon Resource Name (ARN) of an AWS Lambda function to invoke to handle
       * delivery of the campaign or treatment.
       * * The URL for a web application or service that supports HTTPS and can receive the message.
       * The URL has to be a full URL, including the HTTPS protocol.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-customdeliveryconfiguration.html#cfn-pinpoint-campaign-customdeliveryconfiguration-deliveryuri)
       */
      override fun deliveryUri(): String? = unwrap(this).getDeliveryUri()

      /**
       * The types of endpoints to send the campaign or treatment to.
       *
       * Each valid value maps to a type of channel that you can associate with an endpoint by using
       * the `ChannelType` property of an endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-customdeliveryconfiguration.html#cfn-pinpoint-campaign-customdeliveryconfiguration-endpointtypes)
       */
      override fun endpointTypes(): List<String> = unwrap(this).getEndpointTypes() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomDeliveryConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.CustomDeliveryConfigurationProperty):
          CustomDeliveryConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CustomDeliveryConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomDeliveryConfigurationProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CustomDeliveryConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CustomDeliveryConfigurationProperty
    }
  }

  /**
   * Specifies the default behavior for a button that appears in an in-app message.
   *
   * You can optionally add button configurations that specifically apply to iOS, Android, or web
   * browser users.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * DefaultButtonConfigurationProperty defaultButtonConfigurationProperty =
   * DefaultButtonConfigurationProperty.builder()
   * .backgroundColor("backgroundColor")
   * .borderRadius(123)
   * .buttonAction("buttonAction")
   * .link("link")
   * .text("text")
   * .textColor("textColor")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-defaultbuttonconfiguration.html)
   */
  public interface DefaultButtonConfigurationProperty {
    /**
     * The background color of a button, expressed as a hex color code (such as #000000 for black).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-defaultbuttonconfiguration.html#cfn-pinpoint-campaign-defaultbuttonconfiguration-backgroundcolor)
     */
    public fun backgroundColor(): String? = unwrap(this).getBackgroundColor()

    /**
     * The border radius of a button.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-defaultbuttonconfiguration.html#cfn-pinpoint-campaign-defaultbuttonconfiguration-borderradius)
     */
    public fun borderRadius(): Number? = unwrap(this).getBorderRadius()

    /**
     * The action that occurs when a recipient chooses a button in an in-app message.
     *
     * You can specify one of the following:
     *
     * * `LINK` – A link to a web destination.
     * * `DEEP_LINK` – A link to a specific page in an application.
     * * `CLOSE` – Dismisses the message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-defaultbuttonconfiguration.html#cfn-pinpoint-campaign-defaultbuttonconfiguration-buttonaction)
     */
    public fun buttonAction(): String? = unwrap(this).getButtonAction()

    /**
     * The destination (such as a URL) for a button.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-defaultbuttonconfiguration.html#cfn-pinpoint-campaign-defaultbuttonconfiguration-link)
     */
    public fun link(): String? = unwrap(this).getLink()

    /**
     * The text that appears on a button in an in-app message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-defaultbuttonconfiguration.html#cfn-pinpoint-campaign-defaultbuttonconfiguration-text)
     */
    public fun text(): String? = unwrap(this).getText()

    /**
     * The color of the body text in a button, expressed as a hex color code (such as #000000 for
     * black).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-defaultbuttonconfiguration.html#cfn-pinpoint-campaign-defaultbuttonconfiguration-textcolor)
     */
    public fun textColor(): String? = unwrap(this).getTextColor()

    /**
     * A builder for [DefaultButtonConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param backgroundColor The background color of a button, expressed as a hex color code
       * (such as #000000 for black).
       */
      public fun backgroundColor(backgroundColor: String)

      /**
       * @param borderRadius The border radius of a button.
       */
      public fun borderRadius(borderRadius: Number)

      /**
       * @param buttonAction The action that occurs when a recipient chooses a button in an in-app
       * message.
       * You can specify one of the following:
       *
       * * `LINK` – A link to a web destination.
       * * `DEEP_LINK` – A link to a specific page in an application.
       * * `CLOSE` – Dismisses the message.
       */
      public fun buttonAction(buttonAction: String)

      /**
       * @param link The destination (such as a URL) for a button.
       */
      public fun link(link: String)

      /**
       * @param text The text that appears on a button in an in-app message.
       */
      public fun text(text: String)

      /**
       * @param textColor The color of the body text in a button, expressed as a hex color code
       * (such as #000000 for black).
       */
      public fun textColor(textColor: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.DefaultButtonConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.DefaultButtonConfigurationProperty.builder()

      /**
       * @param backgroundColor The background color of a button, expressed as a hex color code
       * (such as #000000 for black).
       */
      override fun backgroundColor(backgroundColor: String) {
        cdkBuilder.backgroundColor(backgroundColor)
      }

      /**
       * @param borderRadius The border radius of a button.
       */
      override fun borderRadius(borderRadius: Number) {
        cdkBuilder.borderRadius(borderRadius)
      }

      /**
       * @param buttonAction The action that occurs when a recipient chooses a button in an in-app
       * message.
       * You can specify one of the following:
       *
       * * `LINK` – A link to a web destination.
       * * `DEEP_LINK` – A link to a specific page in an application.
       * * `CLOSE` – Dismisses the message.
       */
      override fun buttonAction(buttonAction: String) {
        cdkBuilder.buttonAction(buttonAction)
      }

      /**
       * @param link The destination (such as a URL) for a button.
       */
      override fun link(link: String) {
        cdkBuilder.link(link)
      }

      /**
       * @param text The text that appears on a button in an in-app message.
       */
      override fun text(text: String) {
        cdkBuilder.text(text)
      }

      /**
       * @param textColor The color of the body text in a button, expressed as a hex color code
       * (such as #000000 for black).
       */
      override fun textColor(textColor: String) {
        cdkBuilder.textColor(textColor)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.DefaultButtonConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.DefaultButtonConfigurationProperty,
    ) : CdkObject(cdkObject), DefaultButtonConfigurationProperty {
      /**
       * The background color of a button, expressed as a hex color code (such as #000000 for
       * black).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-defaultbuttonconfiguration.html#cfn-pinpoint-campaign-defaultbuttonconfiguration-backgroundcolor)
       */
      override fun backgroundColor(): String? = unwrap(this).getBackgroundColor()

      /**
       * The border radius of a button.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-defaultbuttonconfiguration.html#cfn-pinpoint-campaign-defaultbuttonconfiguration-borderradius)
       */
      override fun borderRadius(): Number? = unwrap(this).getBorderRadius()

      /**
       * The action that occurs when a recipient chooses a button in an in-app message.
       *
       * You can specify one of the following:
       *
       * * `LINK` – A link to a web destination.
       * * `DEEP_LINK` – A link to a specific page in an application.
       * * `CLOSE` – Dismisses the message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-defaultbuttonconfiguration.html#cfn-pinpoint-campaign-defaultbuttonconfiguration-buttonaction)
       */
      override fun buttonAction(): String? = unwrap(this).getButtonAction()

      /**
       * The destination (such as a URL) for a button.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-defaultbuttonconfiguration.html#cfn-pinpoint-campaign-defaultbuttonconfiguration-link)
       */
      override fun link(): String? = unwrap(this).getLink()

      /**
       * The text that appears on a button in an in-app message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-defaultbuttonconfiguration.html#cfn-pinpoint-campaign-defaultbuttonconfiguration-text)
       */
      override fun text(): String? = unwrap(this).getText()

      /**
       * The color of the body text in a button, expressed as a hex color code (such as #000000 for
       * black).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-defaultbuttonconfiguration.html#cfn-pinpoint-campaign-defaultbuttonconfiguration-textcolor)
       */
      override fun textColor(): String? = unwrap(this).getTextColor()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DefaultButtonConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.DefaultButtonConfigurationProperty):
          DefaultButtonConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DefaultButtonConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultButtonConfigurationProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.DefaultButtonConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnCampaign.DefaultButtonConfigurationProperty
    }
  }

  /**
   * Specifies the dimensions for an event filter that determines when a campaign is sent or a
   * journey activity is performed.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * Object attributes;
   * Object metrics;
   * EventDimensionsProperty eventDimensionsProperty = EventDimensionsProperty.builder()
   * .attributes(attributes)
   * .eventType(SetDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .metrics(metrics)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-eventdimensions.html)
   */
  public interface EventDimensionsProperty {
    /**
     * One or more custom attributes that your application reports to Amazon Pinpoint.
     *
     * You can use these attributes as selection criteria when you create an event filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-eventdimensions.html#cfn-pinpoint-campaign-eventdimensions-attributes)
     */
    public fun attributes(): Any? = unwrap(this).getAttributes()

    /**
     * The name of the event that causes the campaign to be sent or the journey activity to be
     * performed.
     *
     * This can be a standard event that Amazon Pinpoint generates, such as `_email.delivered` or
     * `_custom.delivered` . For campaigns, this can also be a custom event that's specific to your
     * application. For information about standard events, see [Streaming Amazon Pinpoint
     * Events](https://docs.aws.amazon.com/pinpoint/latest/developerguide/event-streams.html) in the
     * *Amazon Pinpoint Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-eventdimensions.html#cfn-pinpoint-campaign-eventdimensions-eventtype)
     */
    public fun eventType(): Any? = unwrap(this).getEventType()

    /**
     * One or more custom metrics that your application reports to Amazon Pinpoint .
     *
     * You can use these metrics as selection criteria when you create an event filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-eventdimensions.html#cfn-pinpoint-campaign-eventdimensions-metrics)
     */
    public fun metrics(): Any? = unwrap(this).getMetrics()

    /**
     * A builder for [EventDimensionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributes One or more custom attributes that your application reports to Amazon
       * Pinpoint.
       * You can use these attributes as selection criteria when you create an event filter.
       */
      public fun attributes(attributes: Any)

      /**
       * @param eventType The name of the event that causes the campaign to be sent or the journey
       * activity to be performed.
       * This can be a standard event that Amazon Pinpoint generates, such as `_email.delivered` or
       * `_custom.delivered` . For campaigns, this can also be a custom event that's specific to your
       * application. For information about standard events, see [Streaming Amazon Pinpoint
       * Events](https://docs.aws.amazon.com/pinpoint/latest/developerguide/event-streams.html) in the
       * *Amazon Pinpoint Developer Guide* .
       */
      public fun eventType(eventType: IResolvable)

      /**
       * @param eventType The name of the event that causes the campaign to be sent or the journey
       * activity to be performed.
       * This can be a standard event that Amazon Pinpoint generates, such as `_email.delivered` or
       * `_custom.delivered` . For campaigns, this can also be a custom event that's specific to your
       * application. For information about standard events, see [Streaming Amazon Pinpoint
       * Events](https://docs.aws.amazon.com/pinpoint/latest/developerguide/event-streams.html) in the
       * *Amazon Pinpoint Developer Guide* .
       */
      public fun eventType(eventType: SetDimensionProperty)

      /**
       * @param eventType The name of the event that causes the campaign to be sent or the journey
       * activity to be performed.
       * This can be a standard event that Amazon Pinpoint generates, such as `_email.delivered` or
       * `_custom.delivered` . For campaigns, this can also be a custom event that's specific to your
       * application. For information about standard events, see [Streaming Amazon Pinpoint
       * Events](https://docs.aws.amazon.com/pinpoint/latest/developerguide/event-streams.html) in the
       * *Amazon Pinpoint Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5ad61458427c18700e49dfcab48c055c5a8f5777142f0c45e28da4d72b94e7b2")
      public fun eventType(eventType: SetDimensionProperty.Builder.() -> Unit)

      /**
       * @param metrics One or more custom metrics that your application reports to Amazon Pinpoint
       * .
       * You can use these metrics as selection criteria when you create an event filter.
       */
      public fun metrics(metrics: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.EventDimensionsProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.EventDimensionsProperty.builder()

      /**
       * @param attributes One or more custom attributes that your application reports to Amazon
       * Pinpoint.
       * You can use these attributes as selection criteria when you create an event filter.
       */
      override fun attributes(attributes: Any) {
        cdkBuilder.attributes(attributes)
      }

      /**
       * @param eventType The name of the event that causes the campaign to be sent or the journey
       * activity to be performed.
       * This can be a standard event that Amazon Pinpoint generates, such as `_email.delivered` or
       * `_custom.delivered` . For campaigns, this can also be a custom event that's specific to your
       * application. For information about standard events, see [Streaming Amazon Pinpoint
       * Events](https://docs.aws.amazon.com/pinpoint/latest/developerguide/event-streams.html) in the
       * *Amazon Pinpoint Developer Guide* .
       */
      override fun eventType(eventType: IResolvable) {
        cdkBuilder.eventType(eventType.let(IResolvable::unwrap))
      }

      /**
       * @param eventType The name of the event that causes the campaign to be sent or the journey
       * activity to be performed.
       * This can be a standard event that Amazon Pinpoint generates, such as `_email.delivered` or
       * `_custom.delivered` . For campaigns, this can also be a custom event that's specific to your
       * application. For information about standard events, see [Streaming Amazon Pinpoint
       * Events](https://docs.aws.amazon.com/pinpoint/latest/developerguide/event-streams.html) in the
       * *Amazon Pinpoint Developer Guide* .
       */
      override fun eventType(eventType: SetDimensionProperty) {
        cdkBuilder.eventType(eventType.let(SetDimensionProperty::unwrap))
      }

      /**
       * @param eventType The name of the event that causes the campaign to be sent or the journey
       * activity to be performed.
       * This can be a standard event that Amazon Pinpoint generates, such as `_email.delivered` or
       * `_custom.delivered` . For campaigns, this can also be a custom event that's specific to your
       * application. For information about standard events, see [Streaming Amazon Pinpoint
       * Events](https://docs.aws.amazon.com/pinpoint/latest/developerguide/event-streams.html) in the
       * *Amazon Pinpoint Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5ad61458427c18700e49dfcab48c055c5a8f5777142f0c45e28da4d72b94e7b2")
      override fun eventType(eventType: SetDimensionProperty.Builder.() -> Unit): Unit =
          eventType(SetDimensionProperty(eventType))

      /**
       * @param metrics One or more custom metrics that your application reports to Amazon Pinpoint
       * .
       * You can use these metrics as selection criteria when you create an event filter.
       */
      override fun metrics(metrics: Any) {
        cdkBuilder.metrics(metrics)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.EventDimensionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.EventDimensionsProperty,
    ) : CdkObject(cdkObject), EventDimensionsProperty {
      /**
       * One or more custom attributes that your application reports to Amazon Pinpoint.
       *
       * You can use these attributes as selection criteria when you create an event filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-eventdimensions.html#cfn-pinpoint-campaign-eventdimensions-attributes)
       */
      override fun attributes(): Any? = unwrap(this).getAttributes()

      /**
       * The name of the event that causes the campaign to be sent or the journey activity to be
       * performed.
       *
       * This can be a standard event that Amazon Pinpoint generates, such as `_email.delivered` or
       * `_custom.delivered` . For campaigns, this can also be a custom event that's specific to your
       * application. For information about standard events, see [Streaming Amazon Pinpoint
       * Events](https://docs.aws.amazon.com/pinpoint/latest/developerguide/event-streams.html) in the
       * *Amazon Pinpoint Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-eventdimensions.html#cfn-pinpoint-campaign-eventdimensions-eventtype)
       */
      override fun eventType(): Any? = unwrap(this).getEventType()

      /**
       * One or more custom metrics that your application reports to Amazon Pinpoint .
       *
       * You can use these metrics as selection criteria when you create an event filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-eventdimensions.html#cfn-pinpoint-campaign-eventdimensions-metrics)
       */
      override fun metrics(): Any? = unwrap(this).getMetrics()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EventDimensionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.EventDimensionsProperty):
          EventDimensionsProperty = CdkObjectWrappers.wrap(cdkObject) as? EventDimensionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventDimensionsProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.EventDimensionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnCampaign.EventDimensionsProperty
    }
  }

  /**
   * Specifies the configuration of main body text of the in-app message.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * InAppMessageBodyConfigProperty inAppMessageBodyConfigProperty =
   * InAppMessageBodyConfigProperty.builder()
   * .alignment("alignment")
   * .body("body")
   * .textColor("textColor")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagebodyconfig.html)
   */
  public interface InAppMessageBodyConfigProperty {
    /**
     * The text alignment of the main body text of the message.
     *
     * Acceptable values: `LEFT` , `CENTER` , `RIGHT` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagebodyconfig.html#cfn-pinpoint-campaign-inappmessagebodyconfig-alignment)
     */
    public fun alignment(): String? = unwrap(this).getAlignment()

    /**
     * The main body text of the message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagebodyconfig.html#cfn-pinpoint-campaign-inappmessagebodyconfig-body)
     */
    public fun body(): String? = unwrap(this).getBody()

    /**
     * The color of the body text, expressed as a string consisting of a hex color code (such as
     * "#000000" for black).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagebodyconfig.html#cfn-pinpoint-campaign-inappmessagebodyconfig-textcolor)
     */
    public fun textColor(): String? = unwrap(this).getTextColor()

    /**
     * A builder for [InAppMessageBodyConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alignment The text alignment of the main body text of the message.
       * Acceptable values: `LEFT` , `CENTER` , `RIGHT` .
       */
      public fun alignment(alignment: String)

      /**
       * @param body The main body text of the message.
       */
      public fun body(body: String)

      /**
       * @param textColor The color of the body text, expressed as a string consisting of a hex
       * color code (such as "#000000" for black).
       */
      public fun textColor(textColor: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageBodyConfigProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageBodyConfigProperty.builder()

      /**
       * @param alignment The text alignment of the main body text of the message.
       * Acceptable values: `LEFT` , `CENTER` , `RIGHT` .
       */
      override fun alignment(alignment: String) {
        cdkBuilder.alignment(alignment)
      }

      /**
       * @param body The main body text of the message.
       */
      override fun body(body: String) {
        cdkBuilder.body(body)
      }

      /**
       * @param textColor The color of the body text, expressed as a string consisting of a hex
       * color code (such as "#000000" for black).
       */
      override fun textColor(textColor: String) {
        cdkBuilder.textColor(textColor)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageBodyConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageBodyConfigProperty,
    ) : CdkObject(cdkObject), InAppMessageBodyConfigProperty {
      /**
       * The text alignment of the main body text of the message.
       *
       * Acceptable values: `LEFT` , `CENTER` , `RIGHT` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagebodyconfig.html#cfn-pinpoint-campaign-inappmessagebodyconfig-alignment)
       */
      override fun alignment(): String? = unwrap(this).getAlignment()

      /**
       * The main body text of the message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagebodyconfig.html#cfn-pinpoint-campaign-inappmessagebodyconfig-body)
       */
      override fun body(): String? = unwrap(this).getBody()

      /**
       * The color of the body text, expressed as a string consisting of a hex color code (such as
       * "#000000" for black).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagebodyconfig.html#cfn-pinpoint-campaign-inappmessagebodyconfig-textcolor)
       */
      override fun textColor(): String? = unwrap(this).getTextColor()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InAppMessageBodyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageBodyConfigProperty):
          InAppMessageBodyConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InAppMessageBodyConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InAppMessageBodyConfigProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageBodyConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageBodyConfigProperty
    }
  }

  /**
   * Specifies the configuration of a button that appears in an in-app message.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * InAppMessageButtonProperty inAppMessageButtonProperty = InAppMessageButtonProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagebutton.html)
   */
  public interface InAppMessageButtonProperty {
    /**
     * An object that defines the default behavior for a button in in-app messages sent to Android.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagebutton.html#cfn-pinpoint-campaign-inappmessagebutton-android)
     */
    public fun android(): Any? = unwrap(this).getAndroid()

    /**
     * An object that defines the default behavior for a button in an in-app message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagebutton.html#cfn-pinpoint-campaign-inappmessagebutton-defaultconfig)
     */
    public fun defaultConfig(): Any? = unwrap(this).getDefaultConfig()

    /**
     * An object that defines the default behavior for a button in in-app messages sent to iOS
     * devices.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagebutton.html#cfn-pinpoint-campaign-inappmessagebutton-ios)
     */
    public fun ios(): Any? = unwrap(this).getIos()

    /**
     * An object that defines the default behavior for a button in in-app messages for web
     * applications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagebutton.html#cfn-pinpoint-campaign-inappmessagebutton-web)
     */
    public fun web(): Any? = unwrap(this).getWeb()

    /**
     * A builder for [InAppMessageButtonProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param android An object that defines the default behavior for a button in in-app messages
       * sent to Android.
       */
      public fun android(android: IResolvable)

      /**
       * @param android An object that defines the default behavior for a button in in-app messages
       * sent to Android.
       */
      public fun android(android: OverrideButtonConfigurationProperty)

      /**
       * @param android An object that defines the default behavior for a button in in-app messages
       * sent to Android.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("058ce32e75dc1667aceae9a99fdd7bfab75b4c75e058a4837f4b87ffcd1dc8ea")
      public fun android(android: OverrideButtonConfigurationProperty.Builder.() -> Unit)

      /**
       * @param defaultConfig An object that defines the default behavior for a button in an in-app
       * message.
       */
      public fun defaultConfig(defaultConfig: IResolvable)

      /**
       * @param defaultConfig An object that defines the default behavior for a button in an in-app
       * message.
       */
      public fun defaultConfig(defaultConfig: DefaultButtonConfigurationProperty)

      /**
       * @param defaultConfig An object that defines the default behavior for a button in an in-app
       * message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d830591080dc59c997606cbe8ea557e1bd23cb2175235dcd2f55dc172e6b13e9")
      public fun defaultConfig(defaultConfig: DefaultButtonConfigurationProperty.Builder.() -> Unit)

      /**
       * @param ios An object that defines the default behavior for a button in in-app messages sent
       * to iOS devices.
       */
      public fun ios(ios: IResolvable)

      /**
       * @param ios An object that defines the default behavior for a button in in-app messages sent
       * to iOS devices.
       */
      public fun ios(ios: OverrideButtonConfigurationProperty)

      /**
       * @param ios An object that defines the default behavior for a button in in-app messages sent
       * to iOS devices.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc04855492fdca7573fff426b65031ca8422486ee46f5c785fd481e7b8cd6057")
      public fun ios(ios: OverrideButtonConfigurationProperty.Builder.() -> Unit)

      /**
       * @param web An object that defines the default behavior for a button in in-app messages for
       * web applications.
       */
      public fun web(web: IResolvable)

      /**
       * @param web An object that defines the default behavior for a button in in-app messages for
       * web applications.
       */
      public fun web(web: OverrideButtonConfigurationProperty)

      /**
       * @param web An object that defines the default behavior for a button in in-app messages for
       * web applications.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4153d67a4dac1b6feee87a75636eab3e4b5e003927c798376742aa365262a5e7")
      public fun web(web: OverrideButtonConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageButtonProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageButtonProperty.builder()

      /**
       * @param android An object that defines the default behavior for a button in in-app messages
       * sent to Android.
       */
      override fun android(android: IResolvable) {
        cdkBuilder.android(android.let(IResolvable::unwrap))
      }

      /**
       * @param android An object that defines the default behavior for a button in in-app messages
       * sent to Android.
       */
      override fun android(android: OverrideButtonConfigurationProperty) {
        cdkBuilder.android(android.let(OverrideButtonConfigurationProperty::unwrap))
      }

      /**
       * @param android An object that defines the default behavior for a button in in-app messages
       * sent to Android.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("058ce32e75dc1667aceae9a99fdd7bfab75b4c75e058a4837f4b87ffcd1dc8ea")
      override fun android(android: OverrideButtonConfigurationProperty.Builder.() -> Unit): Unit =
          android(OverrideButtonConfigurationProperty(android))

      /**
       * @param defaultConfig An object that defines the default behavior for a button in an in-app
       * message.
       */
      override fun defaultConfig(defaultConfig: IResolvable) {
        cdkBuilder.defaultConfig(defaultConfig.let(IResolvable::unwrap))
      }

      /**
       * @param defaultConfig An object that defines the default behavior for a button in an in-app
       * message.
       */
      override fun defaultConfig(defaultConfig: DefaultButtonConfigurationProperty) {
        cdkBuilder.defaultConfig(defaultConfig.let(DefaultButtonConfigurationProperty::unwrap))
      }

      /**
       * @param defaultConfig An object that defines the default behavior for a button in an in-app
       * message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d830591080dc59c997606cbe8ea557e1bd23cb2175235dcd2f55dc172e6b13e9")
      override
          fun defaultConfig(defaultConfig: DefaultButtonConfigurationProperty.Builder.() -> Unit):
          Unit = defaultConfig(DefaultButtonConfigurationProperty(defaultConfig))

      /**
       * @param ios An object that defines the default behavior for a button in in-app messages sent
       * to iOS devices.
       */
      override fun ios(ios: IResolvable) {
        cdkBuilder.ios(ios.let(IResolvable::unwrap))
      }

      /**
       * @param ios An object that defines the default behavior for a button in in-app messages sent
       * to iOS devices.
       */
      override fun ios(ios: OverrideButtonConfigurationProperty) {
        cdkBuilder.ios(ios.let(OverrideButtonConfigurationProperty::unwrap))
      }

      /**
       * @param ios An object that defines the default behavior for a button in in-app messages sent
       * to iOS devices.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc04855492fdca7573fff426b65031ca8422486ee46f5c785fd481e7b8cd6057")
      override fun ios(ios: OverrideButtonConfigurationProperty.Builder.() -> Unit): Unit =
          ios(OverrideButtonConfigurationProperty(ios))

      /**
       * @param web An object that defines the default behavior for a button in in-app messages for
       * web applications.
       */
      override fun web(web: IResolvable) {
        cdkBuilder.web(web.let(IResolvable::unwrap))
      }

      /**
       * @param web An object that defines the default behavior for a button in in-app messages for
       * web applications.
       */
      override fun web(web: OverrideButtonConfigurationProperty) {
        cdkBuilder.web(web.let(OverrideButtonConfigurationProperty::unwrap))
      }

      /**
       * @param web An object that defines the default behavior for a button in in-app messages for
       * web applications.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4153d67a4dac1b6feee87a75636eab3e4b5e003927c798376742aa365262a5e7")
      override fun web(web: OverrideButtonConfigurationProperty.Builder.() -> Unit): Unit =
          web(OverrideButtonConfigurationProperty(web))

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageButtonProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageButtonProperty,
    ) : CdkObject(cdkObject), InAppMessageButtonProperty {
      /**
       * An object that defines the default behavior for a button in in-app messages sent to
       * Android.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagebutton.html#cfn-pinpoint-campaign-inappmessagebutton-android)
       */
      override fun android(): Any? = unwrap(this).getAndroid()

      /**
       * An object that defines the default behavior for a button in an in-app message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagebutton.html#cfn-pinpoint-campaign-inappmessagebutton-defaultconfig)
       */
      override fun defaultConfig(): Any? = unwrap(this).getDefaultConfig()

      /**
       * An object that defines the default behavior for a button in in-app messages sent to iOS
       * devices.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagebutton.html#cfn-pinpoint-campaign-inappmessagebutton-ios)
       */
      override fun ios(): Any? = unwrap(this).getIos()

      /**
       * An object that defines the default behavior for a button in in-app messages for web
       * applications.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagebutton.html#cfn-pinpoint-campaign-inappmessagebutton-web)
       */
      override fun web(): Any? = unwrap(this).getWeb()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InAppMessageButtonProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageButtonProperty):
          InAppMessageButtonProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InAppMessageButtonProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InAppMessageButtonProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageButtonProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageButtonProperty
    }
  }

  /**
   * Specifies the configuration and contents of an in-app message.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * InAppMessageContentProperty inAppMessageContentProperty = InAppMessageContentProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagecontent.html)
   */
  public interface InAppMessageContentProperty {
    /**
     * The background color for an in-app message banner, expressed as a hex color code (such as
     * #000000 for black).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagecontent.html#cfn-pinpoint-campaign-inappmessagecontent-backgroundcolor)
     */
    public fun backgroundColor(): String? = unwrap(this).getBackgroundColor()

    /**
     * Specifies the configuration of main body text in an in-app message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagecontent.html#cfn-pinpoint-campaign-inappmessagecontent-bodyconfig)
     */
    public fun bodyConfig(): Any? = unwrap(this).getBodyConfig()

    /**
     * Specifies the configuration and content of the header or title text of the in-app message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagecontent.html#cfn-pinpoint-campaign-inappmessagecontent-headerconfig)
     */
    public fun headerConfig(): Any? = unwrap(this).getHeaderConfig()

    /**
     * The URL of the image that appears on an in-app message banner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagecontent.html#cfn-pinpoint-campaign-inappmessagecontent-imageurl)
     */
    public fun imageUrl(): String? = unwrap(this).getImageUrl()

    /**
     * An object that contains configuration information about the primary button in an in-app
     * message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagecontent.html#cfn-pinpoint-campaign-inappmessagecontent-primarybtn)
     */
    public fun primaryBtn(): Any? = unwrap(this).getPrimaryBtn()

    /**
     * An object that contains configuration information about the secondary button in an in-app
     * message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagecontent.html#cfn-pinpoint-campaign-inappmessagecontent-secondarybtn)
     */
    public fun secondaryBtn(): Any? = unwrap(this).getSecondaryBtn()

    /**
     * A builder for [InAppMessageContentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param backgroundColor The background color for an in-app message banner, expressed as a
       * hex color code (such as #000000 for black).
       */
      public fun backgroundColor(backgroundColor: String)

      /**
       * @param bodyConfig Specifies the configuration of main body text in an in-app message
       * template.
       */
      public fun bodyConfig(bodyConfig: IResolvable)

      /**
       * @param bodyConfig Specifies the configuration of main body text in an in-app message
       * template.
       */
      public fun bodyConfig(bodyConfig: InAppMessageBodyConfigProperty)

      /**
       * @param bodyConfig Specifies the configuration of main body text in an in-app message
       * template.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f7d0fa693ee3275316ac1f5742467ad649de278deb0008b82d55aae65484b96")
      public fun bodyConfig(bodyConfig: InAppMessageBodyConfigProperty.Builder.() -> Unit)

      /**
       * @param headerConfig Specifies the configuration and content of the header or title text of
       * the in-app message.
       */
      public fun headerConfig(headerConfig: IResolvable)

      /**
       * @param headerConfig Specifies the configuration and content of the header or title text of
       * the in-app message.
       */
      public fun headerConfig(headerConfig: InAppMessageHeaderConfigProperty)

      /**
       * @param headerConfig Specifies the configuration and content of the header or title text of
       * the in-app message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("46a4000f9043a12a1ab6c75389e6d40804bde07d331a3ae6f199c1d3954fc4c8")
      public fun headerConfig(headerConfig: InAppMessageHeaderConfigProperty.Builder.() -> Unit)

      /**
       * @param imageUrl The URL of the image that appears on an in-app message banner.
       */
      public fun imageUrl(imageUrl: String)

      /**
       * @param primaryBtn An object that contains configuration information about the primary
       * button in an in-app message.
       */
      public fun primaryBtn(primaryBtn: IResolvable)

      /**
       * @param primaryBtn An object that contains configuration information about the primary
       * button in an in-app message.
       */
      public fun primaryBtn(primaryBtn: InAppMessageButtonProperty)

      /**
       * @param primaryBtn An object that contains configuration information about the primary
       * button in an in-app message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad10bfaac4de9f5eb98dee4b0cf892b1dbf9d85a6b5a80aa0b8148235bc4f899")
      public fun primaryBtn(primaryBtn: InAppMessageButtonProperty.Builder.() -> Unit)

      /**
       * @param secondaryBtn An object that contains configuration information about the secondary
       * button in an in-app message.
       */
      public fun secondaryBtn(secondaryBtn: IResolvable)

      /**
       * @param secondaryBtn An object that contains configuration information about the secondary
       * button in an in-app message.
       */
      public fun secondaryBtn(secondaryBtn: InAppMessageButtonProperty)

      /**
       * @param secondaryBtn An object that contains configuration information about the secondary
       * button in an in-app message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("77ad5198e39a114458e5f25eafb01c089a4ad072dd46d572ffcf39f2b7269fb3")
      public fun secondaryBtn(secondaryBtn: InAppMessageButtonProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageContentProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageContentProperty.builder()

      /**
       * @param backgroundColor The background color for an in-app message banner, expressed as a
       * hex color code (such as #000000 for black).
       */
      override fun backgroundColor(backgroundColor: String) {
        cdkBuilder.backgroundColor(backgroundColor)
      }

      /**
       * @param bodyConfig Specifies the configuration of main body text in an in-app message
       * template.
       */
      override fun bodyConfig(bodyConfig: IResolvable) {
        cdkBuilder.bodyConfig(bodyConfig.let(IResolvable::unwrap))
      }

      /**
       * @param bodyConfig Specifies the configuration of main body text in an in-app message
       * template.
       */
      override fun bodyConfig(bodyConfig: InAppMessageBodyConfigProperty) {
        cdkBuilder.bodyConfig(bodyConfig.let(InAppMessageBodyConfigProperty::unwrap))
      }

      /**
       * @param bodyConfig Specifies the configuration of main body text in an in-app message
       * template.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f7d0fa693ee3275316ac1f5742467ad649de278deb0008b82d55aae65484b96")
      override fun bodyConfig(bodyConfig: InAppMessageBodyConfigProperty.Builder.() -> Unit): Unit =
          bodyConfig(InAppMessageBodyConfigProperty(bodyConfig))

      /**
       * @param headerConfig Specifies the configuration and content of the header or title text of
       * the in-app message.
       */
      override fun headerConfig(headerConfig: IResolvable) {
        cdkBuilder.headerConfig(headerConfig.let(IResolvable::unwrap))
      }

      /**
       * @param headerConfig Specifies the configuration and content of the header or title text of
       * the in-app message.
       */
      override fun headerConfig(headerConfig: InAppMessageHeaderConfigProperty) {
        cdkBuilder.headerConfig(headerConfig.let(InAppMessageHeaderConfigProperty::unwrap))
      }

      /**
       * @param headerConfig Specifies the configuration and content of the header or title text of
       * the in-app message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("46a4000f9043a12a1ab6c75389e6d40804bde07d331a3ae6f199c1d3954fc4c8")
      override fun headerConfig(headerConfig: InAppMessageHeaderConfigProperty.Builder.() -> Unit):
          Unit = headerConfig(InAppMessageHeaderConfigProperty(headerConfig))

      /**
       * @param imageUrl The URL of the image that appears on an in-app message banner.
       */
      override fun imageUrl(imageUrl: String) {
        cdkBuilder.imageUrl(imageUrl)
      }

      /**
       * @param primaryBtn An object that contains configuration information about the primary
       * button in an in-app message.
       */
      override fun primaryBtn(primaryBtn: IResolvable) {
        cdkBuilder.primaryBtn(primaryBtn.let(IResolvable::unwrap))
      }

      /**
       * @param primaryBtn An object that contains configuration information about the primary
       * button in an in-app message.
       */
      override fun primaryBtn(primaryBtn: InAppMessageButtonProperty) {
        cdkBuilder.primaryBtn(primaryBtn.let(InAppMessageButtonProperty::unwrap))
      }

      /**
       * @param primaryBtn An object that contains configuration information about the primary
       * button in an in-app message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad10bfaac4de9f5eb98dee4b0cf892b1dbf9d85a6b5a80aa0b8148235bc4f899")
      override fun primaryBtn(primaryBtn: InAppMessageButtonProperty.Builder.() -> Unit): Unit =
          primaryBtn(InAppMessageButtonProperty(primaryBtn))

      /**
       * @param secondaryBtn An object that contains configuration information about the secondary
       * button in an in-app message.
       */
      override fun secondaryBtn(secondaryBtn: IResolvable) {
        cdkBuilder.secondaryBtn(secondaryBtn.let(IResolvable::unwrap))
      }

      /**
       * @param secondaryBtn An object that contains configuration information about the secondary
       * button in an in-app message.
       */
      override fun secondaryBtn(secondaryBtn: InAppMessageButtonProperty) {
        cdkBuilder.secondaryBtn(secondaryBtn.let(InAppMessageButtonProperty::unwrap))
      }

      /**
       * @param secondaryBtn An object that contains configuration information about the secondary
       * button in an in-app message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("77ad5198e39a114458e5f25eafb01c089a4ad072dd46d572ffcf39f2b7269fb3")
      override fun secondaryBtn(secondaryBtn: InAppMessageButtonProperty.Builder.() -> Unit): Unit =
          secondaryBtn(InAppMessageButtonProperty(secondaryBtn))

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageContentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageContentProperty,
    ) : CdkObject(cdkObject), InAppMessageContentProperty {
      /**
       * The background color for an in-app message banner, expressed as a hex color code (such as
       * #000000 for black).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagecontent.html#cfn-pinpoint-campaign-inappmessagecontent-backgroundcolor)
       */
      override fun backgroundColor(): String? = unwrap(this).getBackgroundColor()

      /**
       * Specifies the configuration of main body text in an in-app message template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagecontent.html#cfn-pinpoint-campaign-inappmessagecontent-bodyconfig)
       */
      override fun bodyConfig(): Any? = unwrap(this).getBodyConfig()

      /**
       * Specifies the configuration and content of the header or title text of the in-app message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagecontent.html#cfn-pinpoint-campaign-inappmessagecontent-headerconfig)
       */
      override fun headerConfig(): Any? = unwrap(this).getHeaderConfig()

      /**
       * The URL of the image that appears on an in-app message banner.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagecontent.html#cfn-pinpoint-campaign-inappmessagecontent-imageurl)
       */
      override fun imageUrl(): String? = unwrap(this).getImageUrl()

      /**
       * An object that contains configuration information about the primary button in an in-app
       * message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagecontent.html#cfn-pinpoint-campaign-inappmessagecontent-primarybtn)
       */
      override fun primaryBtn(): Any? = unwrap(this).getPrimaryBtn()

      /**
       * An object that contains configuration information about the secondary button in an in-app
       * message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagecontent.html#cfn-pinpoint-campaign-inappmessagecontent-secondarybtn)
       */
      override fun secondaryBtn(): Any? = unwrap(this).getSecondaryBtn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InAppMessageContentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageContentProperty):
          InAppMessageContentProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InAppMessageContentProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InAppMessageContentProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageContentProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageContentProperty
    }
  }

  /**
   * Specifies the configuration and content of the header or title text of the in-app message.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * InAppMessageHeaderConfigProperty inAppMessageHeaderConfigProperty =
   * InAppMessageHeaderConfigProperty.builder()
   * .alignment("alignment")
   * .header("header")
   * .textColor("textColor")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessageheaderconfig.html)
   */
  public interface InAppMessageHeaderConfigProperty {
    /**
     * The text alignment of the title of the message.
     *
     * Acceptable values: `LEFT` , `CENTER` , `RIGHT` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessageheaderconfig.html#cfn-pinpoint-campaign-inappmessageheaderconfig-alignment)
     */
    public fun alignment(): String? = unwrap(this).getAlignment()

    /**
     * The header or title text of the in-app message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessageheaderconfig.html#cfn-pinpoint-campaign-inappmessageheaderconfig-header)
     */
    public fun `header`(): String? = unwrap(this).getHeader()

    /**
     * The color of the body text, expressed as a string consisting of a hex color code (such as
     * "#000000" for black).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessageheaderconfig.html#cfn-pinpoint-campaign-inappmessageheaderconfig-textcolor)
     */
    public fun textColor(): String? = unwrap(this).getTextColor()

    /**
     * A builder for [InAppMessageHeaderConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alignment The text alignment of the title of the message.
       * Acceptable values: `LEFT` , `CENTER` , `RIGHT` .
       */
      public fun alignment(alignment: String)

      /**
       * @param header The header or title text of the in-app message.
       */
      public fun `header`(`header`: String)

      /**
       * @param textColor The color of the body text, expressed as a string consisting of a hex
       * color code (such as "#000000" for black).
       */
      public fun textColor(textColor: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageHeaderConfigProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageHeaderConfigProperty.builder()

      /**
       * @param alignment The text alignment of the title of the message.
       * Acceptable values: `LEFT` , `CENTER` , `RIGHT` .
       */
      override fun alignment(alignment: String) {
        cdkBuilder.alignment(alignment)
      }

      /**
       * @param header The header or title text of the in-app message.
       */
      override fun `header`(`header`: String) {
        cdkBuilder.`header`(`header`)
      }

      /**
       * @param textColor The color of the body text, expressed as a string consisting of a hex
       * color code (such as "#000000" for black).
       */
      override fun textColor(textColor: String) {
        cdkBuilder.textColor(textColor)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageHeaderConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageHeaderConfigProperty,
    ) : CdkObject(cdkObject), InAppMessageHeaderConfigProperty {
      /**
       * The text alignment of the title of the message.
       *
       * Acceptable values: `LEFT` , `CENTER` , `RIGHT` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessageheaderconfig.html#cfn-pinpoint-campaign-inappmessageheaderconfig-alignment)
       */
      override fun alignment(): String? = unwrap(this).getAlignment()

      /**
       * The header or title text of the in-app message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessageheaderconfig.html#cfn-pinpoint-campaign-inappmessageheaderconfig-header)
       */
      override fun `header`(): String? = unwrap(this).getHeader()

      /**
       * The color of the body text, expressed as a string consisting of a hex color code (such as
       * "#000000" for black).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessageheaderconfig.html#cfn-pinpoint-campaign-inappmessageheaderconfig-textcolor)
       */
      override fun textColor(): String? = unwrap(this).getTextColor()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InAppMessageHeaderConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageHeaderConfigProperty):
          InAppMessageHeaderConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InAppMessageHeaderConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InAppMessageHeaderConfigProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageHeaderConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageHeaderConfigProperty
    }
  }

  /**
   * Specifies the limits on the messages that a campaign can send.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * LimitsProperty limitsProperty = LimitsProperty.builder()
   * .daily(123)
   * .maximumDuration(123)
   * .messagesPerSecond(123)
   * .session(123)
   * .total(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-limits.html)
   */
  public interface LimitsProperty {
    /**
     * The maximum number of messages that a campaign can send to a single endpoint during a 24-hour
     * period.
     *
     * The maximum value is 100.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-limits.html#cfn-pinpoint-campaign-limits-daily)
     */
    public fun daily(): Number? = unwrap(this).getDaily()

    /**
     * The maximum amount of time, in seconds, that a campaign can attempt to deliver a message
     * after the scheduled start time for the campaign.
     *
     * The minimum value is 60 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-limits.html#cfn-pinpoint-campaign-limits-maximumduration)
     */
    public fun maximumDuration(): Number? = unwrap(this).getMaximumDuration()

    /**
     * The maximum number of messages that a campaign can send each second.
     *
     * The minimum value is 1. The maximum value is 20,000.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-limits.html#cfn-pinpoint-campaign-limits-messagespersecond)
     */
    public fun messagesPerSecond(): Number? = unwrap(this).getMessagesPerSecond()

    /**
     * The maximum number of messages that the campaign can send per user session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-limits.html#cfn-pinpoint-campaign-limits-session)
     */
    public fun session(): Number? = unwrap(this).getSession()

    /**
     * The maximum number of messages that a campaign can send to a single endpoint during the
     * course of the campaign.
     *
     * The maximum value is 100.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-limits.html#cfn-pinpoint-campaign-limits-total)
     */
    public fun total(): Number? = unwrap(this).getTotal()

    /**
     * A builder for [LimitsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param daily The maximum number of messages that a campaign can send to a single endpoint
       * during a 24-hour period.
       * The maximum value is 100.
       */
      public fun daily(daily: Number)

      /**
       * @param maximumDuration The maximum amount of time, in seconds, that a campaign can attempt
       * to deliver a message after the scheduled start time for the campaign.
       * The minimum value is 60 seconds.
       */
      public fun maximumDuration(maximumDuration: Number)

      /**
       * @param messagesPerSecond The maximum number of messages that a campaign can send each
       * second.
       * The minimum value is 1. The maximum value is 20,000.
       */
      public fun messagesPerSecond(messagesPerSecond: Number)

      /**
       * @param session The maximum number of messages that the campaign can send per user session.
       */
      public fun session(session: Number)

      /**
       * @param total The maximum number of messages that a campaign can send to a single endpoint
       * during the course of the campaign.
       * The maximum value is 100.
       */
      public fun total(total: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.LimitsProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.LimitsProperty.builder()

      /**
       * @param daily The maximum number of messages that a campaign can send to a single endpoint
       * during a 24-hour period.
       * The maximum value is 100.
       */
      override fun daily(daily: Number) {
        cdkBuilder.daily(daily)
      }

      /**
       * @param maximumDuration The maximum amount of time, in seconds, that a campaign can attempt
       * to deliver a message after the scheduled start time for the campaign.
       * The minimum value is 60 seconds.
       */
      override fun maximumDuration(maximumDuration: Number) {
        cdkBuilder.maximumDuration(maximumDuration)
      }

      /**
       * @param messagesPerSecond The maximum number of messages that a campaign can send each
       * second.
       * The minimum value is 1. The maximum value is 20,000.
       */
      override fun messagesPerSecond(messagesPerSecond: Number) {
        cdkBuilder.messagesPerSecond(messagesPerSecond)
      }

      /**
       * @param session The maximum number of messages that the campaign can send per user session.
       */
      override fun session(session: Number) {
        cdkBuilder.session(session)
      }

      /**
       * @param total The maximum number of messages that a campaign can send to a single endpoint
       * during the course of the campaign.
       * The maximum value is 100.
       */
      override fun total(total: Number) {
        cdkBuilder.total(total)
      }

      public fun build(): software.amazon.awscdk.services.pinpoint.CfnCampaign.LimitsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.LimitsProperty,
    ) : CdkObject(cdkObject), LimitsProperty {
      /**
       * The maximum number of messages that a campaign can send to a single endpoint during a
       * 24-hour period.
       *
       * The maximum value is 100.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-limits.html#cfn-pinpoint-campaign-limits-daily)
       */
      override fun daily(): Number? = unwrap(this).getDaily()

      /**
       * The maximum amount of time, in seconds, that a campaign can attempt to deliver a message
       * after the scheduled start time for the campaign.
       *
       * The minimum value is 60 seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-limits.html#cfn-pinpoint-campaign-limits-maximumduration)
       */
      override fun maximumDuration(): Number? = unwrap(this).getMaximumDuration()

      /**
       * The maximum number of messages that a campaign can send each second.
       *
       * The minimum value is 1. The maximum value is 20,000.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-limits.html#cfn-pinpoint-campaign-limits-messagespersecond)
       */
      override fun messagesPerSecond(): Number? = unwrap(this).getMessagesPerSecond()

      /**
       * The maximum number of messages that the campaign can send per user session.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-limits.html#cfn-pinpoint-campaign-limits-session)
       */
      override fun session(): Number? = unwrap(this).getSession()

      /**
       * The maximum number of messages that a campaign can send to a single endpoint during the
       * course of the campaign.
       *
       * The maximum value is 100.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-limits.html#cfn-pinpoint-campaign-limits-total)
       */
      override fun total(): Number? = unwrap(this).getTotal()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LimitsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.LimitsProperty):
          LimitsProperty = CdkObjectWrappers.wrap(cdkObject) as? LimitsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LimitsProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.LimitsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnCampaign.LimitsProperty
    }
  }

  /**
   * Specifies the message configuration settings for a campaign.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
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
  public interface MessageConfigurationProperty {
    /**
     * The message that the campaign sends through the ADM (Amazon Device Messaging) channel.
     *
     * If specified, this message overrides the default message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-messageconfiguration.html#cfn-pinpoint-campaign-messageconfiguration-admmessage)
     */
    public fun admMessage(): Any? = unwrap(this).getAdmMessage()

    /**
     * The message that the campaign sends through the APNs (Apple Push Notification service)
     * channel.
     *
     * If specified, this message overrides the default message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-messageconfiguration.html#cfn-pinpoint-campaign-messageconfiguration-apnsmessage)
     */
    public fun apnsMessage(): Any? = unwrap(this).getApnsMessage()

    /**
     * The message that the campaign sends through the Baidu (Baidu Cloud Push) channel.
     *
     * If specified, this message overrides the default message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-messageconfiguration.html#cfn-pinpoint-campaign-messageconfiguration-baidumessage)
     */
    public fun baiduMessage(): Any? = unwrap(this).getBaiduMessage()

    /**
     * The message that the campaign sends through a custom channel, as specified by the delivery
     * configuration ( `CustomDeliveryConfiguration` ) settings for the campaign.
     *
     * If specified, this message overrides the default message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-messageconfiguration.html#cfn-pinpoint-campaign-messageconfiguration-custommessage)
     */
    public fun customMessage(): Any? = unwrap(this).getCustomMessage()

    /**
     * The default message that the campaign sends through all the channels that are configured for
     * the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-messageconfiguration.html#cfn-pinpoint-campaign-messageconfiguration-defaultmessage)
     */
    public fun defaultMessage(): Any? = unwrap(this).getDefaultMessage()

    /**
     * The message that the campaign sends through the email channel.
     *
     * If specified, this message overrides the default message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-messageconfiguration.html#cfn-pinpoint-campaign-messageconfiguration-emailmessage)
     */
    public fun emailMessage(): Any? = unwrap(this).getEmailMessage()

    /**
     * The message that the campaign sends through the GCM channel, which enables Amazon Pinpoint to
     * send push notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud
     * Messaging (GCM), service.
     *
     * If specified, this message overrides the default message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-messageconfiguration.html#cfn-pinpoint-campaign-messageconfiguration-gcmmessage)
     */
    public fun gcmMessage(): Any? = unwrap(this).getGcmMessage()

    /**
     * The default message for the in-app messaging channel.
     *
     * This message overrides the default message ( `DefaultMessage` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-messageconfiguration.html#cfn-pinpoint-campaign-messageconfiguration-inappmessage)
     */
    public fun inAppMessage(): Any? = unwrap(this).getInAppMessage()

    /**
     * The message that the campaign sends through the SMS channel.
     *
     * If specified, this message overrides the default message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-messageconfiguration.html#cfn-pinpoint-campaign-messageconfiguration-smsmessage)
     */
    public fun smsMessage(): Any? = unwrap(this).getSmsMessage()

    /**
     * A builder for [MessageConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param admMessage The message that the campaign sends through the ADM (Amazon Device
       * Messaging) channel.
       * If specified, this message overrides the default message.
       */
      public fun admMessage(admMessage: IResolvable)

      /**
       * @param admMessage The message that the campaign sends through the ADM (Amazon Device
       * Messaging) channel.
       * If specified, this message overrides the default message.
       */
      public fun admMessage(admMessage: MessageProperty)

      /**
       * @param admMessage The message that the campaign sends through the ADM (Amazon Device
       * Messaging) channel.
       * If specified, this message overrides the default message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("874b3737aeca360fa6c69d0ce215d7414d3c669d1e502dbed9b0bc6183b71b30")
      public fun admMessage(admMessage: MessageProperty.Builder.() -> Unit)

      /**
       * @param apnsMessage The message that the campaign sends through the APNs (Apple Push
       * Notification service) channel.
       * If specified, this message overrides the default message.
       */
      public fun apnsMessage(apnsMessage: IResolvable)

      /**
       * @param apnsMessage The message that the campaign sends through the APNs (Apple Push
       * Notification service) channel.
       * If specified, this message overrides the default message.
       */
      public fun apnsMessage(apnsMessage: MessageProperty)

      /**
       * @param apnsMessage The message that the campaign sends through the APNs (Apple Push
       * Notification service) channel.
       * If specified, this message overrides the default message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2f9298d8c1d6015e10cf48920b98f86bdd486c9f1111f59c00625c991307b45")
      public fun apnsMessage(apnsMessage: MessageProperty.Builder.() -> Unit)

      /**
       * @param baiduMessage The message that the campaign sends through the Baidu (Baidu Cloud
       * Push) channel.
       * If specified, this message overrides the default message.
       */
      public fun baiduMessage(baiduMessage: IResolvable)

      /**
       * @param baiduMessage The message that the campaign sends through the Baidu (Baidu Cloud
       * Push) channel.
       * If specified, this message overrides the default message.
       */
      public fun baiduMessage(baiduMessage: MessageProperty)

      /**
       * @param baiduMessage The message that the campaign sends through the Baidu (Baidu Cloud
       * Push) channel.
       * If specified, this message overrides the default message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2804abc44f02e2e43121aa52b652d5a01dd125f8acfc456398bd7fd129d9328f")
      public fun baiduMessage(baiduMessage: MessageProperty.Builder.() -> Unit)

      /**
       * @param customMessage The message that the campaign sends through a custom channel, as
       * specified by the delivery configuration ( `CustomDeliveryConfiguration` ) settings for the
       * campaign.
       * If specified, this message overrides the default message.
       */
      public fun customMessage(customMessage: IResolvable)

      /**
       * @param customMessage The message that the campaign sends through a custom channel, as
       * specified by the delivery configuration ( `CustomDeliveryConfiguration` ) settings for the
       * campaign.
       * If specified, this message overrides the default message.
       */
      public fun customMessage(customMessage: CampaignCustomMessageProperty)

      /**
       * @param customMessage The message that the campaign sends through a custom channel, as
       * specified by the delivery configuration ( `CustomDeliveryConfiguration` ) settings for the
       * campaign.
       * If specified, this message overrides the default message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b8a6c617eeed6b7763b696c8d0f3891c08ac5795cc74515b76350dc47e0558ca")
      public fun customMessage(customMessage: CampaignCustomMessageProperty.Builder.() -> Unit)

      /**
       * @param defaultMessage The default message that the campaign sends through all the channels
       * that are configured for the campaign.
       */
      public fun defaultMessage(defaultMessage: IResolvable)

      /**
       * @param defaultMessage The default message that the campaign sends through all the channels
       * that are configured for the campaign.
       */
      public fun defaultMessage(defaultMessage: MessageProperty)

      /**
       * @param defaultMessage The default message that the campaign sends through all the channels
       * that are configured for the campaign.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("def3520f002eadc626d7232b2bf7080a8f10e77e74926434c22eab2cb2bf2855")
      public fun defaultMessage(defaultMessage: MessageProperty.Builder.() -> Unit)

      /**
       * @param emailMessage The message that the campaign sends through the email channel.
       * If specified, this message overrides the default message.
       */
      public fun emailMessage(emailMessage: IResolvable)

      /**
       * @param emailMessage The message that the campaign sends through the email channel.
       * If specified, this message overrides the default message.
       */
      public fun emailMessage(emailMessage: CampaignEmailMessageProperty)

      /**
       * @param emailMessage The message that the campaign sends through the email channel.
       * If specified, this message overrides the default message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27371de087267f4f96761f1118ec73d5c86b4e657bf26ce2ba84ab880dae2c0d")
      public fun emailMessage(emailMessage: CampaignEmailMessageProperty.Builder.() -> Unit)

      /**
       * @param gcmMessage The message that the campaign sends through the GCM channel, which
       * enables Amazon Pinpoint to send push notifications through the Firebase Cloud Messaging (FCM),
       * formerly Google Cloud Messaging (GCM), service.
       * If specified, this message overrides the default message.
       */
      public fun gcmMessage(gcmMessage: IResolvable)

      /**
       * @param gcmMessage The message that the campaign sends through the GCM channel, which
       * enables Amazon Pinpoint to send push notifications through the Firebase Cloud Messaging (FCM),
       * formerly Google Cloud Messaging (GCM), service.
       * If specified, this message overrides the default message.
       */
      public fun gcmMessage(gcmMessage: MessageProperty)

      /**
       * @param gcmMessage The message that the campaign sends through the GCM channel, which
       * enables Amazon Pinpoint to send push notifications through the Firebase Cloud Messaging (FCM),
       * formerly Google Cloud Messaging (GCM), service.
       * If specified, this message overrides the default message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f749003fa0809878110304c4b217724caca5c1dac7187a9c07900d65180e7a13")
      public fun gcmMessage(gcmMessage: MessageProperty.Builder.() -> Unit)

      /**
       * @param inAppMessage The default message for the in-app messaging channel.
       * This message overrides the default message ( `DefaultMessage` ).
       */
      public fun inAppMessage(inAppMessage: IResolvable)

      /**
       * @param inAppMessage The default message for the in-app messaging channel.
       * This message overrides the default message ( `DefaultMessage` ).
       */
      public fun inAppMessage(inAppMessage: CampaignInAppMessageProperty)

      /**
       * @param inAppMessage The default message for the in-app messaging channel.
       * This message overrides the default message ( `DefaultMessage` ).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("652150ef74c21e886bfa67ab181e340c2d7973c9f2eb751c67c4ec0f355ab6f2")
      public fun inAppMessage(inAppMessage: CampaignInAppMessageProperty.Builder.() -> Unit)

      /**
       * @param smsMessage The message that the campaign sends through the SMS channel.
       * If specified, this message overrides the default message.
       */
      public fun smsMessage(smsMessage: IResolvable)

      /**
       * @param smsMessage The message that the campaign sends through the SMS channel.
       * If specified, this message overrides the default message.
       */
      public fun smsMessage(smsMessage: CampaignSmsMessageProperty)

      /**
       * @param smsMessage The message that the campaign sends through the SMS channel.
       * If specified, this message overrides the default message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc6a7f353bd1385ecb81f84b39646b4b5ba44a5b89ab5f6aee654507cb210e0f")
      public fun smsMessage(smsMessage: CampaignSmsMessageProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageConfigurationProperty.builder()

      /**
       * @param admMessage The message that the campaign sends through the ADM (Amazon Device
       * Messaging) channel.
       * If specified, this message overrides the default message.
       */
      override fun admMessage(admMessage: IResolvable) {
        cdkBuilder.admMessage(admMessage.let(IResolvable::unwrap))
      }

      /**
       * @param admMessage The message that the campaign sends through the ADM (Amazon Device
       * Messaging) channel.
       * If specified, this message overrides the default message.
       */
      override fun admMessage(admMessage: MessageProperty) {
        cdkBuilder.admMessage(admMessage.let(MessageProperty::unwrap))
      }

      /**
       * @param admMessage The message that the campaign sends through the ADM (Amazon Device
       * Messaging) channel.
       * If specified, this message overrides the default message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("874b3737aeca360fa6c69d0ce215d7414d3c669d1e502dbed9b0bc6183b71b30")
      override fun admMessage(admMessage: MessageProperty.Builder.() -> Unit): Unit =
          admMessage(MessageProperty(admMessage))

      /**
       * @param apnsMessage The message that the campaign sends through the APNs (Apple Push
       * Notification service) channel.
       * If specified, this message overrides the default message.
       */
      override fun apnsMessage(apnsMessage: IResolvable) {
        cdkBuilder.apnsMessage(apnsMessage.let(IResolvable::unwrap))
      }

      /**
       * @param apnsMessage The message that the campaign sends through the APNs (Apple Push
       * Notification service) channel.
       * If specified, this message overrides the default message.
       */
      override fun apnsMessage(apnsMessage: MessageProperty) {
        cdkBuilder.apnsMessage(apnsMessage.let(MessageProperty::unwrap))
      }

      /**
       * @param apnsMessage The message that the campaign sends through the APNs (Apple Push
       * Notification service) channel.
       * If specified, this message overrides the default message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2f9298d8c1d6015e10cf48920b98f86bdd486c9f1111f59c00625c991307b45")
      override fun apnsMessage(apnsMessage: MessageProperty.Builder.() -> Unit): Unit =
          apnsMessage(MessageProperty(apnsMessage))

      /**
       * @param baiduMessage The message that the campaign sends through the Baidu (Baidu Cloud
       * Push) channel.
       * If specified, this message overrides the default message.
       */
      override fun baiduMessage(baiduMessage: IResolvable) {
        cdkBuilder.baiduMessage(baiduMessage.let(IResolvable::unwrap))
      }

      /**
       * @param baiduMessage The message that the campaign sends through the Baidu (Baidu Cloud
       * Push) channel.
       * If specified, this message overrides the default message.
       */
      override fun baiduMessage(baiduMessage: MessageProperty) {
        cdkBuilder.baiduMessage(baiduMessage.let(MessageProperty::unwrap))
      }

      /**
       * @param baiduMessage The message that the campaign sends through the Baidu (Baidu Cloud
       * Push) channel.
       * If specified, this message overrides the default message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2804abc44f02e2e43121aa52b652d5a01dd125f8acfc456398bd7fd129d9328f")
      override fun baiduMessage(baiduMessage: MessageProperty.Builder.() -> Unit): Unit =
          baiduMessage(MessageProperty(baiduMessage))

      /**
       * @param customMessage The message that the campaign sends through a custom channel, as
       * specified by the delivery configuration ( `CustomDeliveryConfiguration` ) settings for the
       * campaign.
       * If specified, this message overrides the default message.
       */
      override fun customMessage(customMessage: IResolvable) {
        cdkBuilder.customMessage(customMessage.let(IResolvable::unwrap))
      }

      /**
       * @param customMessage The message that the campaign sends through a custom channel, as
       * specified by the delivery configuration ( `CustomDeliveryConfiguration` ) settings for the
       * campaign.
       * If specified, this message overrides the default message.
       */
      override fun customMessage(customMessage: CampaignCustomMessageProperty) {
        cdkBuilder.customMessage(customMessage.let(CampaignCustomMessageProperty::unwrap))
      }

      /**
       * @param customMessage The message that the campaign sends through a custom channel, as
       * specified by the delivery configuration ( `CustomDeliveryConfiguration` ) settings for the
       * campaign.
       * If specified, this message overrides the default message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b8a6c617eeed6b7763b696c8d0f3891c08ac5795cc74515b76350dc47e0558ca")
      override fun customMessage(customMessage: CampaignCustomMessageProperty.Builder.() -> Unit):
          Unit = customMessage(CampaignCustomMessageProperty(customMessage))

      /**
       * @param defaultMessage The default message that the campaign sends through all the channels
       * that are configured for the campaign.
       */
      override fun defaultMessage(defaultMessage: IResolvable) {
        cdkBuilder.defaultMessage(defaultMessage.let(IResolvable::unwrap))
      }

      /**
       * @param defaultMessage The default message that the campaign sends through all the channels
       * that are configured for the campaign.
       */
      override fun defaultMessage(defaultMessage: MessageProperty) {
        cdkBuilder.defaultMessage(defaultMessage.let(MessageProperty::unwrap))
      }

      /**
       * @param defaultMessage The default message that the campaign sends through all the channels
       * that are configured for the campaign.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("def3520f002eadc626d7232b2bf7080a8f10e77e74926434c22eab2cb2bf2855")
      override fun defaultMessage(defaultMessage: MessageProperty.Builder.() -> Unit): Unit =
          defaultMessage(MessageProperty(defaultMessage))

      /**
       * @param emailMessage The message that the campaign sends through the email channel.
       * If specified, this message overrides the default message.
       */
      override fun emailMessage(emailMessage: IResolvable) {
        cdkBuilder.emailMessage(emailMessage.let(IResolvable::unwrap))
      }

      /**
       * @param emailMessage The message that the campaign sends through the email channel.
       * If specified, this message overrides the default message.
       */
      override fun emailMessage(emailMessage: CampaignEmailMessageProperty) {
        cdkBuilder.emailMessage(emailMessage.let(CampaignEmailMessageProperty::unwrap))
      }

      /**
       * @param emailMessage The message that the campaign sends through the email channel.
       * If specified, this message overrides the default message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27371de087267f4f96761f1118ec73d5c86b4e657bf26ce2ba84ab880dae2c0d")
      override fun emailMessage(emailMessage: CampaignEmailMessageProperty.Builder.() -> Unit): Unit
          = emailMessage(CampaignEmailMessageProperty(emailMessage))

      /**
       * @param gcmMessage The message that the campaign sends through the GCM channel, which
       * enables Amazon Pinpoint to send push notifications through the Firebase Cloud Messaging (FCM),
       * formerly Google Cloud Messaging (GCM), service.
       * If specified, this message overrides the default message.
       */
      override fun gcmMessage(gcmMessage: IResolvable) {
        cdkBuilder.gcmMessage(gcmMessage.let(IResolvable::unwrap))
      }

      /**
       * @param gcmMessage The message that the campaign sends through the GCM channel, which
       * enables Amazon Pinpoint to send push notifications through the Firebase Cloud Messaging (FCM),
       * formerly Google Cloud Messaging (GCM), service.
       * If specified, this message overrides the default message.
       */
      override fun gcmMessage(gcmMessage: MessageProperty) {
        cdkBuilder.gcmMessage(gcmMessage.let(MessageProperty::unwrap))
      }

      /**
       * @param gcmMessage The message that the campaign sends through the GCM channel, which
       * enables Amazon Pinpoint to send push notifications through the Firebase Cloud Messaging (FCM),
       * formerly Google Cloud Messaging (GCM), service.
       * If specified, this message overrides the default message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f749003fa0809878110304c4b217724caca5c1dac7187a9c07900d65180e7a13")
      override fun gcmMessage(gcmMessage: MessageProperty.Builder.() -> Unit): Unit =
          gcmMessage(MessageProperty(gcmMessage))

      /**
       * @param inAppMessage The default message for the in-app messaging channel.
       * This message overrides the default message ( `DefaultMessage` ).
       */
      override fun inAppMessage(inAppMessage: IResolvable) {
        cdkBuilder.inAppMessage(inAppMessage.let(IResolvable::unwrap))
      }

      /**
       * @param inAppMessage The default message for the in-app messaging channel.
       * This message overrides the default message ( `DefaultMessage` ).
       */
      override fun inAppMessage(inAppMessage: CampaignInAppMessageProperty) {
        cdkBuilder.inAppMessage(inAppMessage.let(CampaignInAppMessageProperty::unwrap))
      }

      /**
       * @param inAppMessage The default message for the in-app messaging channel.
       * This message overrides the default message ( `DefaultMessage` ).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("652150ef74c21e886bfa67ab181e340c2d7973c9f2eb751c67c4ec0f355ab6f2")
      override fun inAppMessage(inAppMessage: CampaignInAppMessageProperty.Builder.() -> Unit): Unit
          = inAppMessage(CampaignInAppMessageProperty(inAppMessage))

      /**
       * @param smsMessage The message that the campaign sends through the SMS channel.
       * If specified, this message overrides the default message.
       */
      override fun smsMessage(smsMessage: IResolvable) {
        cdkBuilder.smsMessage(smsMessage.let(IResolvable::unwrap))
      }

      /**
       * @param smsMessage The message that the campaign sends through the SMS channel.
       * If specified, this message overrides the default message.
       */
      override fun smsMessage(smsMessage: CampaignSmsMessageProperty) {
        cdkBuilder.smsMessage(smsMessage.let(CampaignSmsMessageProperty::unwrap))
      }

      /**
       * @param smsMessage The message that the campaign sends through the SMS channel.
       * If specified, this message overrides the default message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc6a7f353bd1385ecb81f84b39646b4b5ba44a5b89ab5f6aee654507cb210e0f")
      override fun smsMessage(smsMessage: CampaignSmsMessageProperty.Builder.() -> Unit): Unit =
          smsMessage(CampaignSmsMessageProperty(smsMessage))

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageConfigurationProperty,
    ) : CdkObject(cdkObject), MessageConfigurationProperty {
      /**
       * The message that the campaign sends through the ADM (Amazon Device Messaging) channel.
       *
       * If specified, this message overrides the default message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-messageconfiguration.html#cfn-pinpoint-campaign-messageconfiguration-admmessage)
       */
      override fun admMessage(): Any? = unwrap(this).getAdmMessage()

      /**
       * The message that the campaign sends through the APNs (Apple Push Notification service)
       * channel.
       *
       * If specified, this message overrides the default message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-messageconfiguration.html#cfn-pinpoint-campaign-messageconfiguration-apnsmessage)
       */
      override fun apnsMessage(): Any? = unwrap(this).getApnsMessage()

      /**
       * The message that the campaign sends through the Baidu (Baidu Cloud Push) channel.
       *
       * If specified, this message overrides the default message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-messageconfiguration.html#cfn-pinpoint-campaign-messageconfiguration-baidumessage)
       */
      override fun baiduMessage(): Any? = unwrap(this).getBaiduMessage()

      /**
       * The message that the campaign sends through a custom channel, as specified by the delivery
       * configuration ( `CustomDeliveryConfiguration` ) settings for the campaign.
       *
       * If specified, this message overrides the default message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-messageconfiguration.html#cfn-pinpoint-campaign-messageconfiguration-custommessage)
       */
      override fun customMessage(): Any? = unwrap(this).getCustomMessage()

      /**
       * The default message that the campaign sends through all the channels that are configured
       * for the campaign.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-messageconfiguration.html#cfn-pinpoint-campaign-messageconfiguration-defaultmessage)
       */
      override fun defaultMessage(): Any? = unwrap(this).getDefaultMessage()

      /**
       * The message that the campaign sends through the email channel.
       *
       * If specified, this message overrides the default message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-messageconfiguration.html#cfn-pinpoint-campaign-messageconfiguration-emailmessage)
       */
      override fun emailMessage(): Any? = unwrap(this).getEmailMessage()

      /**
       * The message that the campaign sends through the GCM channel, which enables Amazon Pinpoint
       * to send push notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud
       * Messaging (GCM), service.
       *
       * If specified, this message overrides the default message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-messageconfiguration.html#cfn-pinpoint-campaign-messageconfiguration-gcmmessage)
       */
      override fun gcmMessage(): Any? = unwrap(this).getGcmMessage()

      /**
       * The default message for the in-app messaging channel.
       *
       * This message overrides the default message ( `DefaultMessage` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-messageconfiguration.html#cfn-pinpoint-campaign-messageconfiguration-inappmessage)
       */
      override fun inAppMessage(): Any? = unwrap(this).getInAppMessage()

      /**
       * The message that the campaign sends through the SMS channel.
       *
       * If specified, this message overrides the default message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-messageconfiguration.html#cfn-pinpoint-campaign-messageconfiguration-smsmessage)
       */
      override fun smsMessage(): Any? = unwrap(this).getSmsMessage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MessageConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageConfigurationProperty):
          MessageConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MessageConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MessageConfigurationProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageConfigurationProperty
    }
  }

  /**
   * Specifies the content and settings for a push notification that's sent to recipients of a
   * campaign.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * MessageProperty messageProperty = MessageProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html)
   */
  public interface MessageProperty {
    /**
     * The action to occur if a recipient taps the push notification. Valid values are:.
     *
     * * `OPEN_APP` – Your app opens or it becomes the foreground app if it was sent to the
     * background. This is the default action.
     * * `DEEP_LINK` – Your app opens and displays a designated user interface in the app. This
     * setting uses the deep-linking features of iOS and Android.
     * * `URL` – The default mobile browser on the recipient's device opens and loads the web page
     * at a URL that you specify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-action)
     */
    public fun action(): String? = unwrap(this).getAction()

    /**
     * The body of the notification message.
     *
     * The maximum number of characters is 200.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-body)
     */
    public fun body(): String? = unwrap(this).getBody()

    /**
     * The URL of the image to display as the push notification icon, such as the icon for the app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-imageiconurl)
     */
    public fun imageIconUrl(): String? = unwrap(this).getImageIconUrl()

    /**
     * The URL of the image to display as the small, push notification icon, such as a small version
     * of the icon for the app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-imagesmalliconurl)
     */
    public fun imageSmallIconUrl(): String? = unwrap(this).getImageSmallIconUrl()

    /**
     * The URL of an image to display in the push notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-imageurl)
     */
    public fun imageUrl(): String? = unwrap(this).getImageUrl()

    /**
     * The JSON payload to use for a silent push notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-jsonbody)
     */
    public fun jsonBody(): String? = unwrap(this).getJsonBody()

    /**
     * The URL of the image or video to display in the push notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-mediaurl)
     */
    public fun mediaUrl(): String? = unwrap(this).getMediaUrl()

    /**
     * The raw, JSON-formatted string to use as the payload for the notification message.
     *
     * If specified, this value overrides all other content for the message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-rawcontent)
     */
    public fun rawContent(): String? = unwrap(this).getRawContent()

    /**
     * Specifies whether the notification is a silent push notification, which is a push
     * notification that doesn't display on a recipient's device.
     *
     * Silent push notifications can be used for cases such as updating an app's configuration,
     * displaying messages in an in-app message center, or supporting phone home functionality.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-silentpush)
     */
    public fun silentPush(): Any? = unwrap(this).getSilentPush()

    /**
     * The number of seconds that the push notification service should keep the message, if the
     * service is unable to deliver the notification the first time.
     *
     * This value is converted to an expiration value when it's sent to a push notification service.
     * If this value is `0` , the service treats the notification as if it expires immediately and the
     * service doesn't store or try to deliver the notification again.
     *
     * This value doesn't apply to messages that are sent through the Amazon Device Messaging (ADM)
     * service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-timetolive)
     */
    public fun timeToLive(): Number? = unwrap(this).getTimeToLive()

    /**
     * The title to display above the notification message on a recipient's device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-title)
     */
    public fun title(): String? = unwrap(this).getTitle()

    /**
     * The URL to open in a recipient's default mobile browser, if a recipient taps the push
     * notification and the value of the `Action` property is `URL` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-url)
     */
    public fun url(): String? = unwrap(this).getUrl()

    /**
     * A builder for [MessageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action The action to occur if a recipient taps the push notification. Valid values
       * are:.
       * * `OPEN_APP` – Your app opens or it becomes the foreground app if it was sent to the
       * background. This is the default action.
       * * `DEEP_LINK` – Your app opens and displays a designated user interface in the app. This
       * setting uses the deep-linking features of iOS and Android.
       * * `URL` – The default mobile browser on the recipient's device opens and loads the web page
       * at a URL that you specify.
       */
      public fun action(action: String)

      /**
       * @param body The body of the notification message.
       * The maximum number of characters is 200.
       */
      public fun body(body: String)

      /**
       * @param imageIconUrl The URL of the image to display as the push notification icon, such as
       * the icon for the app.
       */
      public fun imageIconUrl(imageIconUrl: String)

      /**
       * @param imageSmallIconUrl The URL of the image to display as the small, push notification
       * icon, such as a small version of the icon for the app.
       */
      public fun imageSmallIconUrl(imageSmallIconUrl: String)

      /**
       * @param imageUrl The URL of an image to display in the push notification.
       */
      public fun imageUrl(imageUrl: String)

      /**
       * @param jsonBody The JSON payload to use for a silent push notification.
       */
      public fun jsonBody(jsonBody: String)

      /**
       * @param mediaUrl The URL of the image or video to display in the push notification.
       */
      public fun mediaUrl(mediaUrl: String)

      /**
       * @param rawContent The raw, JSON-formatted string to use as the payload for the notification
       * message.
       * If specified, this value overrides all other content for the message.
       */
      public fun rawContent(rawContent: String)

      /**
       * @param silentPush Specifies whether the notification is a silent push notification, which
       * is a push notification that doesn't display on a recipient's device.
       * Silent push notifications can be used for cases such as updating an app's configuration,
       * displaying messages in an in-app message center, or supporting phone home functionality.
       */
      public fun silentPush(silentPush: Boolean)

      /**
       * @param silentPush Specifies whether the notification is a silent push notification, which
       * is a push notification that doesn't display on a recipient's device.
       * Silent push notifications can be used for cases such as updating an app's configuration,
       * displaying messages in an in-app message center, or supporting phone home functionality.
       */
      public fun silentPush(silentPush: IResolvable)

      /**
       * @param timeToLive The number of seconds that the push notification service should keep the
       * message, if the service is unable to deliver the notification the first time.
       * This value is converted to an expiration value when it's sent to a push notification
       * service. If this value is `0` , the service treats the notification as if it expires
       * immediately and the service doesn't store or try to deliver the notification again.
       *
       * This value doesn't apply to messages that are sent through the Amazon Device Messaging
       * (ADM) service.
       */
      public fun timeToLive(timeToLive: Number)

      /**
       * @param title The title to display above the notification message on a recipient's device.
       */
      public fun title(title: String)

      /**
       * @param url The URL to open in a recipient's default mobile browser, if a recipient taps the
       * push notification and the value of the `Action` property is `URL` .
       */
      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageProperty.builder()

      /**
       * @param action The action to occur if a recipient taps the push notification. Valid values
       * are:.
       * * `OPEN_APP` – Your app opens or it becomes the foreground app if it was sent to the
       * background. This is the default action.
       * * `DEEP_LINK` – Your app opens and displays a designated user interface in the app. This
       * setting uses the deep-linking features of iOS and Android.
       * * `URL` – The default mobile browser on the recipient's device opens and loads the web page
       * at a URL that you specify.
       */
      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      /**
       * @param body The body of the notification message.
       * The maximum number of characters is 200.
       */
      override fun body(body: String) {
        cdkBuilder.body(body)
      }

      /**
       * @param imageIconUrl The URL of the image to display as the push notification icon, such as
       * the icon for the app.
       */
      override fun imageIconUrl(imageIconUrl: String) {
        cdkBuilder.imageIconUrl(imageIconUrl)
      }

      /**
       * @param imageSmallIconUrl The URL of the image to display as the small, push notification
       * icon, such as a small version of the icon for the app.
       */
      override fun imageSmallIconUrl(imageSmallIconUrl: String) {
        cdkBuilder.imageSmallIconUrl(imageSmallIconUrl)
      }

      /**
       * @param imageUrl The URL of an image to display in the push notification.
       */
      override fun imageUrl(imageUrl: String) {
        cdkBuilder.imageUrl(imageUrl)
      }

      /**
       * @param jsonBody The JSON payload to use for a silent push notification.
       */
      override fun jsonBody(jsonBody: String) {
        cdkBuilder.jsonBody(jsonBody)
      }

      /**
       * @param mediaUrl The URL of the image or video to display in the push notification.
       */
      override fun mediaUrl(mediaUrl: String) {
        cdkBuilder.mediaUrl(mediaUrl)
      }

      /**
       * @param rawContent The raw, JSON-formatted string to use as the payload for the notification
       * message.
       * If specified, this value overrides all other content for the message.
       */
      override fun rawContent(rawContent: String) {
        cdkBuilder.rawContent(rawContent)
      }

      /**
       * @param silentPush Specifies whether the notification is a silent push notification, which
       * is a push notification that doesn't display on a recipient's device.
       * Silent push notifications can be used for cases such as updating an app's configuration,
       * displaying messages in an in-app message center, or supporting phone home functionality.
       */
      override fun silentPush(silentPush: Boolean) {
        cdkBuilder.silentPush(silentPush)
      }

      /**
       * @param silentPush Specifies whether the notification is a silent push notification, which
       * is a push notification that doesn't display on a recipient's device.
       * Silent push notifications can be used for cases such as updating an app's configuration,
       * displaying messages in an in-app message center, or supporting phone home functionality.
       */
      override fun silentPush(silentPush: IResolvable) {
        cdkBuilder.silentPush(silentPush.let(IResolvable::unwrap))
      }

      /**
       * @param timeToLive The number of seconds that the push notification service should keep the
       * message, if the service is unable to deliver the notification the first time.
       * This value is converted to an expiration value when it's sent to a push notification
       * service. If this value is `0` , the service treats the notification as if it expires
       * immediately and the service doesn't store or try to deliver the notification again.
       *
       * This value doesn't apply to messages that are sent through the Amazon Device Messaging
       * (ADM) service.
       */
      override fun timeToLive(timeToLive: Number) {
        cdkBuilder.timeToLive(timeToLive)
      }

      /**
       * @param title The title to display above the notification message on a recipient's device.
       */
      override fun title(title: String) {
        cdkBuilder.title(title)
      }

      /**
       * @param url The URL to open in a recipient's default mobile browser, if a recipient taps the
       * push notification and the value of the `Action` property is `URL` .
       */
      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build(): software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageProperty,
    ) : CdkObject(cdkObject), MessageProperty {
      /**
       * The action to occur if a recipient taps the push notification. Valid values are:.
       *
       * * `OPEN_APP` – Your app opens or it becomes the foreground app if it was sent to the
       * background. This is the default action.
       * * `DEEP_LINK` – Your app opens and displays a designated user interface in the app. This
       * setting uses the deep-linking features of iOS and Android.
       * * `URL` – The default mobile browser on the recipient's device opens and loads the web page
       * at a URL that you specify.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-action)
       */
      override fun action(): String? = unwrap(this).getAction()

      /**
       * The body of the notification message.
       *
       * The maximum number of characters is 200.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-body)
       */
      override fun body(): String? = unwrap(this).getBody()

      /**
       * The URL of the image to display as the push notification icon, such as the icon for the
       * app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-imageiconurl)
       */
      override fun imageIconUrl(): String? = unwrap(this).getImageIconUrl()

      /**
       * The URL of the image to display as the small, push notification icon, such as a small
       * version of the icon for the app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-imagesmalliconurl)
       */
      override fun imageSmallIconUrl(): String? = unwrap(this).getImageSmallIconUrl()

      /**
       * The URL of an image to display in the push notification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-imageurl)
       */
      override fun imageUrl(): String? = unwrap(this).getImageUrl()

      /**
       * The JSON payload to use for a silent push notification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-jsonbody)
       */
      override fun jsonBody(): String? = unwrap(this).getJsonBody()

      /**
       * The URL of the image or video to display in the push notification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-mediaurl)
       */
      override fun mediaUrl(): String? = unwrap(this).getMediaUrl()

      /**
       * The raw, JSON-formatted string to use as the payload for the notification message.
       *
       * If specified, this value overrides all other content for the message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-rawcontent)
       */
      override fun rawContent(): String? = unwrap(this).getRawContent()

      /**
       * Specifies whether the notification is a silent push notification, which is a push
       * notification that doesn't display on a recipient's device.
       *
       * Silent push notifications can be used for cases such as updating an app's configuration,
       * displaying messages in an in-app message center, or supporting phone home functionality.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-silentpush)
       */
      override fun silentPush(): Any? = unwrap(this).getSilentPush()

      /**
       * The number of seconds that the push notification service should keep the message, if the
       * service is unable to deliver the notification the first time.
       *
       * This value is converted to an expiration value when it's sent to a push notification
       * service. If this value is `0` , the service treats the notification as if it expires
       * immediately and the service doesn't store or try to deliver the notification again.
       *
       * This value doesn't apply to messages that are sent through the Amazon Device Messaging
       * (ADM) service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-timetolive)
       */
      override fun timeToLive(): Number? = unwrap(this).getTimeToLive()

      /**
       * The title to display above the notification message on a recipient's device.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-title)
       */
      override fun title(): String? = unwrap(this).getTitle()

      /**
       * The URL to open in a recipient's default mobile browser, if a recipient taps the push
       * notification and the value of the `Action` property is `URL` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-url)
       */
      override fun url(): String? = unwrap(this).getUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MessageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageProperty):
          MessageProperty = CdkObjectWrappers.wrap(cdkObject) as? MessageProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MessageProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * MetricDimensionProperty metricDimensionProperty = MetricDimensionProperty.builder()
   * .comparisonOperator("comparisonOperator")
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-metricdimension.html)
   */
  public interface MetricDimensionProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-metricdimension.html#cfn-pinpoint-campaign-metricdimension-comparisonoperator)
     */
    public fun comparisonOperator(): String? = unwrap(this).getComparisonOperator()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-metricdimension.html#cfn-pinpoint-campaign-metricdimension-value)
     */
    public fun `value`(): Number? = unwrap(this).getValue()

    /**
     * A builder for [MetricDimensionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comparisonOperator the value to be set.
       */
      public fun comparisonOperator(comparisonOperator: String)

      /**
       * @param value the value to be set.
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.MetricDimensionProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.MetricDimensionProperty.builder()

      /**
       * @param comparisonOperator the value to be set.
       */
      override fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
      }

      /**
       * @param value the value to be set.
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.MetricDimensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.MetricDimensionProperty,
    ) : CdkObject(cdkObject), MetricDimensionProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-metricdimension.html#cfn-pinpoint-campaign-metricdimension-comparisonoperator)
       */
      override fun comparisonOperator(): String? = unwrap(this).getComparisonOperator()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-metricdimension.html#cfn-pinpoint-campaign-metricdimension-value)
       */
      override fun `value`(): Number? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.MetricDimensionProperty):
          MetricDimensionProperty = CdkObjectWrappers.wrap(cdkObject) as? MetricDimensionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDimensionProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.MetricDimensionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnCampaign.MetricDimensionProperty
    }
  }

  /**
   * Specifies the configuration of a button with settings that are specific to a certain device
   * type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * OverrideButtonConfigurationProperty overrideButtonConfigurationProperty =
   * OverrideButtonConfigurationProperty.builder()
   * .buttonAction("buttonAction")
   * .link("link")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-overridebuttonconfiguration.html)
   */
  public interface OverrideButtonConfigurationProperty {
    /**
     * The action that occurs when a recipient chooses a button in an in-app message.
     *
     * You can specify one of the following:
     *
     * * `LINK` – A link to a web destination.
     * * `DEEP_LINK` – A link to a specific page in an application.
     * * `CLOSE` – Dismisses the message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-overridebuttonconfiguration.html#cfn-pinpoint-campaign-overridebuttonconfiguration-buttonaction)
     */
    public fun buttonAction(): String? = unwrap(this).getButtonAction()

    /**
     * The destination (such as a URL) for a button.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-overridebuttonconfiguration.html#cfn-pinpoint-campaign-overridebuttonconfiguration-link)
     */
    public fun link(): String? = unwrap(this).getLink()

    /**
     * A builder for [OverrideButtonConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param buttonAction The action that occurs when a recipient chooses a button in an in-app
       * message.
       * You can specify one of the following:
       *
       * * `LINK` – A link to a web destination.
       * * `DEEP_LINK` – A link to a specific page in an application.
       * * `CLOSE` – Dismisses the message.
       */
      public fun buttonAction(buttonAction: String)

      /**
       * @param link The destination (such as a URL) for a button.
       */
      public fun link(link: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.OverrideButtonConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.OverrideButtonConfigurationProperty.builder()

      /**
       * @param buttonAction The action that occurs when a recipient chooses a button in an in-app
       * message.
       * You can specify one of the following:
       *
       * * `LINK` – A link to a web destination.
       * * `DEEP_LINK` – A link to a specific page in an application.
       * * `CLOSE` – Dismisses the message.
       */
      override fun buttonAction(buttonAction: String) {
        cdkBuilder.buttonAction(buttonAction)
      }

      /**
       * @param link The destination (such as a URL) for a button.
       */
      override fun link(link: String) {
        cdkBuilder.link(link)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.OverrideButtonConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.OverrideButtonConfigurationProperty,
    ) : CdkObject(cdkObject), OverrideButtonConfigurationProperty {
      /**
       * The action that occurs when a recipient chooses a button in an in-app message.
       *
       * You can specify one of the following:
       *
       * * `LINK` – A link to a web destination.
       * * `DEEP_LINK` – A link to a specific page in an application.
       * * `CLOSE` – Dismisses the message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-overridebuttonconfiguration.html#cfn-pinpoint-campaign-overridebuttonconfiguration-buttonaction)
       */
      override fun buttonAction(): String? = unwrap(this).getButtonAction()

      /**
       * The destination (such as a URL) for a button.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-overridebuttonconfiguration.html#cfn-pinpoint-campaign-overridebuttonconfiguration-link)
       */
      override fun link(): String? = unwrap(this).getLink()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OverrideButtonConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.OverrideButtonConfigurationProperty):
          OverrideButtonConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OverrideButtonConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OverrideButtonConfigurationProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.OverrideButtonConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnCampaign.OverrideButtonConfigurationProperty
    }
  }

  /**
   * Specifies the start and end times that define a time range when messages aren't sent to
   * endpoints.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * QuietTimeProperty quietTimeProperty = QuietTimeProperty.builder()
   * .end("end")
   * .start("start")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-quiettime.html)
   */
  public interface QuietTimeProperty {
    /**
     * The specific time when quiet time ends.
     *
     * This value has to use 24-hour notation and be in HH:MM format, where HH is the hour (with a
     * leading zero, if applicable) and MM is the minutes. For example, use `02:30` to represent 2:30
     * AM, or `14:30` to represent 2:30 PM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-quiettime.html#cfn-pinpoint-campaign-quiettime-end)
     */
    public fun end(): String

    /**
     * The specific time when quiet time begins.
     *
     * This value has to use 24-hour notation and be in HH:MM format, where HH is the hour (with a
     * leading zero, if applicable) and MM is the minutes. For example, use `02:30` to represent 2:30
     * AM, or `14:30` to represent 2:30 PM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-quiettime.html#cfn-pinpoint-campaign-quiettime-start)
     */
    public fun start(): String

    /**
     * A builder for [QuietTimeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param end The specific time when quiet time ends. 
       * This value has to use 24-hour notation and be in HH:MM format, where HH is the hour (with a
       * leading zero, if applicable) and MM is the minutes. For example, use `02:30` to represent 2:30
       * AM, or `14:30` to represent 2:30 PM.
       */
      public fun end(end: String)

      /**
       * @param start The specific time when quiet time begins. 
       * This value has to use 24-hour notation and be in HH:MM format, where HH is the hour (with a
       * leading zero, if applicable) and MM is the minutes. For example, use `02:30` to represent 2:30
       * AM, or `14:30` to represent 2:30 PM.
       */
      public fun start(start: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.QuietTimeProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.QuietTimeProperty.builder()

      /**
       * @param end The specific time when quiet time ends. 
       * This value has to use 24-hour notation and be in HH:MM format, where HH is the hour (with a
       * leading zero, if applicable) and MM is the minutes. For example, use `02:30` to represent 2:30
       * AM, or `14:30` to represent 2:30 PM.
       */
      override fun end(end: String) {
        cdkBuilder.end(end)
      }

      /**
       * @param start The specific time when quiet time begins. 
       * This value has to use 24-hour notation and be in HH:MM format, where HH is the hour (with a
       * leading zero, if applicable) and MM is the minutes. For example, use `02:30` to represent 2:30
       * AM, or `14:30` to represent 2:30 PM.
       */
      override fun start(start: String) {
        cdkBuilder.start(start)
      }

      public fun build(): software.amazon.awscdk.services.pinpoint.CfnCampaign.QuietTimeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.QuietTimeProperty,
    ) : CdkObject(cdkObject), QuietTimeProperty {
      /**
       * The specific time when quiet time ends.
       *
       * This value has to use 24-hour notation and be in HH:MM format, where HH is the hour (with a
       * leading zero, if applicable) and MM is the minutes. For example, use `02:30` to represent 2:30
       * AM, or `14:30` to represent 2:30 PM.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-quiettime.html#cfn-pinpoint-campaign-quiettime-end)
       */
      override fun end(): String = unwrap(this).getEnd()

      /**
       * The specific time when quiet time begins.
       *
       * This value has to use 24-hour notation and be in HH:MM format, where HH is the hour (with a
       * leading zero, if applicable) and MM is the minutes. For example, use `02:30` to represent 2:30
       * AM, or `14:30` to represent 2:30 PM.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-quiettime.html#cfn-pinpoint-campaign-quiettime-start)
       */
      override fun start(): String = unwrap(this).getStart()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): QuietTimeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.QuietTimeProperty):
          QuietTimeProperty = CdkObjectWrappers.wrap(cdkObject) as? QuietTimeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: QuietTimeProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.QuietTimeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnCampaign.QuietTimeProperty
    }
  }

  /**
   * Specifies the schedule settings for a campaign.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * Object attributes;
   * Object metrics;
   * ScheduleProperty scheduleProperty = ScheduleProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html)
   */
  public interface ScheduleProperty {
    /**
     * The scheduled time, in ISO 8601 format, when the campaign ended or will end.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-endtime)
     */
    public fun endTime(): String? = unwrap(this).getEndTime()

    /**
     * The type of event that causes the campaign to be sent, if the value of the `Frequency`
     * property is `EVENT` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-eventfilter)
     */
    public fun eventFilter(): Any? = unwrap(this).getEventFilter()

    /**
     * Specifies how often the campaign is sent or whether the campaign is sent in response to a
     * specific event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-frequency)
     */
    public fun frequency(): String? = unwrap(this).getFrequency()

    /**
     * Specifies whether the start and end times for the campaign schedule use each recipient's
     * local time.
     *
     * To base the schedule on each recipient's local time, set this value to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-islocaltime)
     */
    public fun isLocalTime(): Any? = unwrap(this).getIsLocalTime()

    /**
     * The default quiet time for the campaign.
     *
     * Quiet time is a specific time range when a campaign doesn't send messages to endpoints, if
     * all the following conditions are met:
     *
     * * The `EndpointDemographic.Timezone` property of the endpoint is set to a valid value.
     * * The current time in the endpoint's time zone is later than or equal to the time specified
     * by the `QuietTime.Start` property for the campaign.
     * * The current time in the endpoint's time zone is earlier than or equal to the time specified
     * by the `QuietTime.End` property for the campaign.
     *
     * If any of the preceding conditions isn't met, the endpoint will receive messages from the
     * campaign, even if quiet time is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-quiettime)
     */
    public fun quietTime(): Any? = unwrap(this).getQuietTime()

    /**
     * The scheduled time when the campaign began or will begin.
     *
     * Valid values are: `IMMEDIATE` , to start the campaign immediately; or, a specific time in ISO
     * 8601 format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-starttime)
     */
    public fun startTime(): String? = unwrap(this).getStartTime()

    /**
     * The starting UTC offset for the campaign schedule, if the value of the `IsLocalTime` property
     * is `true` .
     *
     * Valid values are: `UTC, UTC+01, UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05,
     * UTC+05:30, UTC+05:45, UTC+06, UTC+06:30, UTC+07, UTC+08, UTC+09, UTC+09:30, UTC+10, UTC+10:30,
     * UTC+11, UTC+12, UTC+13, UTC-02, UTC-03, UTC-04, UTC-05, UTC-06, UTC-07, UTC-08, UTC-09, UTC-10,`
     * and `UTC-11` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-timezone)
     */
    public fun timeZone(): String? = unwrap(this).getTimeZone()

    /**
     * A builder for [ScheduleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endTime The scheduled time, in ISO 8601 format, when the campaign ended or will end.
       */
      public fun endTime(endTime: String)

      /**
       * @param eventFilter The type of event that causes the campaign to be sent, if the value of
       * the `Frequency` property is `EVENT` .
       */
      public fun eventFilter(eventFilter: IResolvable)

      /**
       * @param eventFilter The type of event that causes the campaign to be sent, if the value of
       * the `Frequency` property is `EVENT` .
       */
      public fun eventFilter(eventFilter: CampaignEventFilterProperty)

      /**
       * @param eventFilter The type of event that causes the campaign to be sent, if the value of
       * the `Frequency` property is `EVENT` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c3dd06595209b007103242bf8e198785fdacfc7f080bcd9bcc9133d99b014137")
      public fun eventFilter(eventFilter: CampaignEventFilterProperty.Builder.() -> Unit)

      /**
       * @param frequency Specifies how often the campaign is sent or whether the campaign is sent
       * in response to a specific event.
       */
      public fun frequency(frequency: String)

      /**
       * @param isLocalTime Specifies whether the start and end times for the campaign schedule use
       * each recipient's local time.
       * To base the schedule on each recipient's local time, set this value to `true` .
       */
      public fun isLocalTime(isLocalTime: Boolean)

      /**
       * @param isLocalTime Specifies whether the start and end times for the campaign schedule use
       * each recipient's local time.
       * To base the schedule on each recipient's local time, set this value to `true` .
       */
      public fun isLocalTime(isLocalTime: IResolvable)

      /**
       * @param quietTime The default quiet time for the campaign.
       * Quiet time is a specific time range when a campaign doesn't send messages to endpoints, if
       * all the following conditions are met:
       *
       * * The `EndpointDemographic.Timezone` property of the endpoint is set to a valid value.
       * * The current time in the endpoint's time zone is later than or equal to the time specified
       * by the `QuietTime.Start` property for the campaign.
       * * The current time in the endpoint's time zone is earlier than or equal to the time
       * specified by the `QuietTime.End` property for the campaign.
       *
       * If any of the preceding conditions isn't met, the endpoint will receive messages from the
       * campaign, even if quiet time is enabled.
       */
      public fun quietTime(quietTime: IResolvable)

      /**
       * @param quietTime The default quiet time for the campaign.
       * Quiet time is a specific time range when a campaign doesn't send messages to endpoints, if
       * all the following conditions are met:
       *
       * * The `EndpointDemographic.Timezone` property of the endpoint is set to a valid value.
       * * The current time in the endpoint's time zone is later than or equal to the time specified
       * by the `QuietTime.Start` property for the campaign.
       * * The current time in the endpoint's time zone is earlier than or equal to the time
       * specified by the `QuietTime.End` property for the campaign.
       *
       * If any of the preceding conditions isn't met, the endpoint will receive messages from the
       * campaign, even if quiet time is enabled.
       */
      public fun quietTime(quietTime: QuietTimeProperty)

      /**
       * @param quietTime The default quiet time for the campaign.
       * Quiet time is a specific time range when a campaign doesn't send messages to endpoints, if
       * all the following conditions are met:
       *
       * * The `EndpointDemographic.Timezone` property of the endpoint is set to a valid value.
       * * The current time in the endpoint's time zone is later than or equal to the time specified
       * by the `QuietTime.Start` property for the campaign.
       * * The current time in the endpoint's time zone is earlier than or equal to the time
       * specified by the `QuietTime.End` property for the campaign.
       *
       * If any of the preceding conditions isn't met, the endpoint will receive messages from the
       * campaign, even if quiet time is enabled.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ed81d35fd706191dfa298b7a8c2139b5e0327d8a6782d2b5b3d8bdba3b83b51d")
      public fun quietTime(quietTime: QuietTimeProperty.Builder.() -> Unit)

      /**
       * @param startTime The scheduled time when the campaign began or will begin.
       * Valid values are: `IMMEDIATE` , to start the campaign immediately; or, a specific time in
       * ISO 8601 format.
       */
      public fun startTime(startTime: String)

      /**
       * @param timeZone The starting UTC offset for the campaign schedule, if the value of the
       * `IsLocalTime` property is `true` .
       * Valid values are: `UTC, UTC+01, UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05,
       * UTC+05:30, UTC+05:45, UTC+06, UTC+06:30, UTC+07, UTC+08, UTC+09, UTC+09:30, UTC+10, UTC+10:30,
       * UTC+11, UTC+12, UTC+13, UTC-02, UTC-03, UTC-04, UTC-05, UTC-06, UTC-07, UTC-08, UTC-09,
       * UTC-10,` and `UTC-11` .
       */
      public fun timeZone(timeZone: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.ScheduleProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.ScheduleProperty.builder()

      /**
       * @param endTime The scheduled time, in ISO 8601 format, when the campaign ended or will end.
       */
      override fun endTime(endTime: String) {
        cdkBuilder.endTime(endTime)
      }

      /**
       * @param eventFilter The type of event that causes the campaign to be sent, if the value of
       * the `Frequency` property is `EVENT` .
       */
      override fun eventFilter(eventFilter: IResolvable) {
        cdkBuilder.eventFilter(eventFilter.let(IResolvable::unwrap))
      }

      /**
       * @param eventFilter The type of event that causes the campaign to be sent, if the value of
       * the `Frequency` property is `EVENT` .
       */
      override fun eventFilter(eventFilter: CampaignEventFilterProperty) {
        cdkBuilder.eventFilter(eventFilter.let(CampaignEventFilterProperty::unwrap))
      }

      /**
       * @param eventFilter The type of event that causes the campaign to be sent, if the value of
       * the `Frequency` property is `EVENT` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c3dd06595209b007103242bf8e198785fdacfc7f080bcd9bcc9133d99b014137")
      override fun eventFilter(eventFilter: CampaignEventFilterProperty.Builder.() -> Unit): Unit =
          eventFilter(CampaignEventFilterProperty(eventFilter))

      /**
       * @param frequency Specifies how often the campaign is sent or whether the campaign is sent
       * in response to a specific event.
       */
      override fun frequency(frequency: String) {
        cdkBuilder.frequency(frequency)
      }

      /**
       * @param isLocalTime Specifies whether the start and end times for the campaign schedule use
       * each recipient's local time.
       * To base the schedule on each recipient's local time, set this value to `true` .
       */
      override fun isLocalTime(isLocalTime: Boolean) {
        cdkBuilder.isLocalTime(isLocalTime)
      }

      /**
       * @param isLocalTime Specifies whether the start and end times for the campaign schedule use
       * each recipient's local time.
       * To base the schedule on each recipient's local time, set this value to `true` .
       */
      override fun isLocalTime(isLocalTime: IResolvable) {
        cdkBuilder.isLocalTime(isLocalTime.let(IResolvable::unwrap))
      }

      /**
       * @param quietTime The default quiet time for the campaign.
       * Quiet time is a specific time range when a campaign doesn't send messages to endpoints, if
       * all the following conditions are met:
       *
       * * The `EndpointDemographic.Timezone` property of the endpoint is set to a valid value.
       * * The current time in the endpoint's time zone is later than or equal to the time specified
       * by the `QuietTime.Start` property for the campaign.
       * * The current time in the endpoint's time zone is earlier than or equal to the time
       * specified by the `QuietTime.End` property for the campaign.
       *
       * If any of the preceding conditions isn't met, the endpoint will receive messages from the
       * campaign, even if quiet time is enabled.
       */
      override fun quietTime(quietTime: IResolvable) {
        cdkBuilder.quietTime(quietTime.let(IResolvable::unwrap))
      }

      /**
       * @param quietTime The default quiet time for the campaign.
       * Quiet time is a specific time range when a campaign doesn't send messages to endpoints, if
       * all the following conditions are met:
       *
       * * The `EndpointDemographic.Timezone` property of the endpoint is set to a valid value.
       * * The current time in the endpoint's time zone is later than or equal to the time specified
       * by the `QuietTime.Start` property for the campaign.
       * * The current time in the endpoint's time zone is earlier than or equal to the time
       * specified by the `QuietTime.End` property for the campaign.
       *
       * If any of the preceding conditions isn't met, the endpoint will receive messages from the
       * campaign, even if quiet time is enabled.
       */
      override fun quietTime(quietTime: QuietTimeProperty) {
        cdkBuilder.quietTime(quietTime.let(QuietTimeProperty::unwrap))
      }

      /**
       * @param quietTime The default quiet time for the campaign.
       * Quiet time is a specific time range when a campaign doesn't send messages to endpoints, if
       * all the following conditions are met:
       *
       * * The `EndpointDemographic.Timezone` property of the endpoint is set to a valid value.
       * * The current time in the endpoint's time zone is later than or equal to the time specified
       * by the `QuietTime.Start` property for the campaign.
       * * The current time in the endpoint's time zone is earlier than or equal to the time
       * specified by the `QuietTime.End` property for the campaign.
       *
       * If any of the preceding conditions isn't met, the endpoint will receive messages from the
       * campaign, even if quiet time is enabled.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ed81d35fd706191dfa298b7a8c2139b5e0327d8a6782d2b5b3d8bdba3b83b51d")
      override fun quietTime(quietTime: QuietTimeProperty.Builder.() -> Unit): Unit =
          quietTime(QuietTimeProperty(quietTime))

      /**
       * @param startTime The scheduled time when the campaign began or will begin.
       * Valid values are: `IMMEDIATE` , to start the campaign immediately; or, a specific time in
       * ISO 8601 format.
       */
      override fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
      }

      /**
       * @param timeZone The starting UTC offset for the campaign schedule, if the value of the
       * `IsLocalTime` property is `true` .
       * Valid values are: `UTC, UTC+01, UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05,
       * UTC+05:30, UTC+05:45, UTC+06, UTC+06:30, UTC+07, UTC+08, UTC+09, UTC+09:30, UTC+10, UTC+10:30,
       * UTC+11, UTC+12, UTC+13, UTC-02, UTC-03, UTC-04, UTC-05, UTC-06, UTC-07, UTC-08, UTC-09,
       * UTC-10,` and `UTC-11` .
       */
      override fun timeZone(timeZone: String) {
        cdkBuilder.timeZone(timeZone)
      }

      public fun build(): software.amazon.awscdk.services.pinpoint.CfnCampaign.ScheduleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.ScheduleProperty,
    ) : CdkObject(cdkObject), ScheduleProperty {
      /**
       * The scheduled time, in ISO 8601 format, when the campaign ended or will end.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-endtime)
       */
      override fun endTime(): String? = unwrap(this).getEndTime()

      /**
       * The type of event that causes the campaign to be sent, if the value of the `Frequency`
       * property is `EVENT` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-eventfilter)
       */
      override fun eventFilter(): Any? = unwrap(this).getEventFilter()

      /**
       * Specifies how often the campaign is sent or whether the campaign is sent in response to a
       * specific event.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-frequency)
       */
      override fun frequency(): String? = unwrap(this).getFrequency()

      /**
       * Specifies whether the start and end times for the campaign schedule use each recipient's
       * local time.
       *
       * To base the schedule on each recipient's local time, set this value to `true` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-islocaltime)
       */
      override fun isLocalTime(): Any? = unwrap(this).getIsLocalTime()

      /**
       * The default quiet time for the campaign.
       *
       * Quiet time is a specific time range when a campaign doesn't send messages to endpoints, if
       * all the following conditions are met:
       *
       * * The `EndpointDemographic.Timezone` property of the endpoint is set to a valid value.
       * * The current time in the endpoint's time zone is later than or equal to the time specified
       * by the `QuietTime.Start` property for the campaign.
       * * The current time in the endpoint's time zone is earlier than or equal to the time
       * specified by the `QuietTime.End` property for the campaign.
       *
       * If any of the preceding conditions isn't met, the endpoint will receive messages from the
       * campaign, even if quiet time is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-quiettime)
       */
      override fun quietTime(): Any? = unwrap(this).getQuietTime()

      /**
       * The scheduled time when the campaign began or will begin.
       *
       * Valid values are: `IMMEDIATE` , to start the campaign immediately; or, a specific time in
       * ISO 8601 format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-starttime)
       */
      override fun startTime(): String? = unwrap(this).getStartTime()

      /**
       * The starting UTC offset for the campaign schedule, if the value of the `IsLocalTime`
       * property is `true` .
       *
       * Valid values are: `UTC, UTC+01, UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05,
       * UTC+05:30, UTC+05:45, UTC+06, UTC+06:30, UTC+07, UTC+08, UTC+09, UTC+09:30, UTC+10, UTC+10:30,
       * UTC+11, UTC+12, UTC+13, UTC-02, UTC-03, UTC-04, UTC-05, UTC-06, UTC-07, UTC-08, UTC-09,
       * UTC-10,` and `UTC-11` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-timezone)
       */
      override fun timeZone(): String? = unwrap(this).getTimeZone()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.ScheduleProperty):
          ScheduleProperty = CdkObjectWrappers.wrap(cdkObject) as? ScheduleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduleProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.ScheduleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnCampaign.ScheduleProperty
    }
  }

  /**
   * Specifies the dimension type and values for a segment dimension.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * SetDimensionProperty setDimensionProperty = SetDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-setdimension.html)
   */
  public interface SetDimensionProperty {
    /**
     * The type of segment dimension to use.
     *
     * Valid values are: `INCLUSIVE` , endpoints that match the criteria are included in the
     * segment; and, `EXCLUSIVE` , endpoints that match the criteria are excluded from the segment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-setdimension.html#cfn-pinpoint-campaign-setdimension-dimensiontype)
     */
    public fun dimensionType(): String? = unwrap(this).getDimensionType()

    /**
     * The criteria values to use for the segment dimension.
     *
     * Depending on the value of the `DimensionType` property, endpoints are included or excluded
     * from the segment if their values match the criteria values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-setdimension.html#cfn-pinpoint-campaign-setdimension-values)
     */
    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    /**
     * A builder for [SetDimensionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dimensionType The type of segment dimension to use.
       * Valid values are: `INCLUSIVE` , endpoints that match the criteria are included in the
       * segment; and, `EXCLUSIVE` , endpoints that match the criteria are excluded from the segment.
       */
      public fun dimensionType(dimensionType: String)

      /**
       * @param values The criteria values to use for the segment dimension.
       * Depending on the value of the `DimensionType` property, endpoints are included or excluded
       * from the segment if their values match the criteria values.
       */
      public fun values(values: List<String>)

      /**
       * @param values The criteria values to use for the segment dimension.
       * Depending on the value of the `DimensionType` property, endpoints are included or excluded
       * from the segment if their values match the criteria values.
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.SetDimensionProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.SetDimensionProperty.builder()

      /**
       * @param dimensionType The type of segment dimension to use.
       * Valid values are: `INCLUSIVE` , endpoints that match the criteria are included in the
       * segment; and, `EXCLUSIVE` , endpoints that match the criteria are excluded from the segment.
       */
      override fun dimensionType(dimensionType: String) {
        cdkBuilder.dimensionType(dimensionType)
      }

      /**
       * @param values The criteria values to use for the segment dimension.
       * Depending on the value of the `DimensionType` property, endpoints are included or excluded
       * from the segment if their values match the criteria values.
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The criteria values to use for the segment dimension.
       * Depending on the value of the `DimensionType` property, endpoints are included or excluded
       * from the segment if their values match the criteria values.
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build(): software.amazon.awscdk.services.pinpoint.CfnCampaign.SetDimensionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.SetDimensionProperty,
    ) : CdkObject(cdkObject), SetDimensionProperty {
      /**
       * The type of segment dimension to use.
       *
       * Valid values are: `INCLUSIVE` , endpoints that match the criteria are included in the
       * segment; and, `EXCLUSIVE` , endpoints that match the criteria are excluded from the segment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-setdimension.html#cfn-pinpoint-campaign-setdimension-dimensiontype)
       */
      override fun dimensionType(): String? = unwrap(this).getDimensionType()

      /**
       * The criteria values to use for the segment dimension.
       *
       * Depending on the value of the `DimensionType` property, endpoints are included or excluded
       * from the segment if their values match the criteria values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-setdimension.html#cfn-pinpoint-campaign-setdimension-values)
       */
      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SetDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.SetDimensionProperty):
          SetDimensionProperty = CdkObjectWrappers.wrap(cdkObject) as? SetDimensionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SetDimensionProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.SetDimensionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnCampaign.SetDimensionProperty
    }
  }

  /**
   * Specifies the message template to use for the message, for each type of channel.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * TemplateConfigurationProperty templateConfigurationProperty =
   * TemplateConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-templateconfiguration.html)
   */
  public interface TemplateConfigurationProperty {
    /**
     * The email template to use for the message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-templateconfiguration.html#cfn-pinpoint-campaign-templateconfiguration-emailtemplate)
     */
    public fun emailTemplate(): Any? = unwrap(this).getEmailTemplate()

    /**
     * The push notification template to use for the message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-templateconfiguration.html#cfn-pinpoint-campaign-templateconfiguration-pushtemplate)
     */
    public fun pushTemplate(): Any? = unwrap(this).getPushTemplate()

    /**
     * The SMS template to use for the message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-templateconfiguration.html#cfn-pinpoint-campaign-templateconfiguration-smstemplate)
     */
    public fun smsTemplate(): Any? = unwrap(this).getSmsTemplate()

    /**
     * The voice template to use for the message.
     *
     * This object isn't supported for campaigns.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-templateconfiguration.html#cfn-pinpoint-campaign-templateconfiguration-voicetemplate)
     */
    public fun voiceTemplate(): Any? = unwrap(this).getVoiceTemplate()

    /**
     * A builder for [TemplateConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param emailTemplate The email template to use for the message.
       */
      public fun emailTemplate(emailTemplate: IResolvable)

      /**
       * @param emailTemplate The email template to use for the message.
       */
      public fun emailTemplate(emailTemplate: TemplateProperty)

      /**
       * @param emailTemplate The email template to use for the message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("842fa1af0f31eea2a4e19f627af3f2e53f87fec05ec016f69cbf49d68e8aa2ea")
      public fun emailTemplate(emailTemplate: TemplateProperty.Builder.() -> Unit)

      /**
       * @param pushTemplate The push notification template to use for the message.
       */
      public fun pushTemplate(pushTemplate: IResolvable)

      /**
       * @param pushTemplate The push notification template to use for the message.
       */
      public fun pushTemplate(pushTemplate: TemplateProperty)

      /**
       * @param pushTemplate The push notification template to use for the message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("656da5de3c8e03c8eb5892b28fab018dd4d74ff09d50a56f5edcff565992c0ae")
      public fun pushTemplate(pushTemplate: TemplateProperty.Builder.() -> Unit)

      /**
       * @param smsTemplate The SMS template to use for the message.
       */
      public fun smsTemplate(smsTemplate: IResolvable)

      /**
       * @param smsTemplate The SMS template to use for the message.
       */
      public fun smsTemplate(smsTemplate: TemplateProperty)

      /**
       * @param smsTemplate The SMS template to use for the message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("df53a266a2d1d0eb0501aec4f0b01cbea6c65d43dab0f9d25440837e1a028453")
      public fun smsTemplate(smsTemplate: TemplateProperty.Builder.() -> Unit)

      /**
       * @param voiceTemplate The voice template to use for the message.
       * This object isn't supported for campaigns.
       */
      public fun voiceTemplate(voiceTemplate: IResolvable)

      /**
       * @param voiceTemplate The voice template to use for the message.
       * This object isn't supported for campaigns.
       */
      public fun voiceTemplate(voiceTemplate: TemplateProperty)

      /**
       * @param voiceTemplate The voice template to use for the message.
       * This object isn't supported for campaigns.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("773aebfddece0f54dab162d31414f65d973191a5c268ca0e84d9fcd984c7f133")
      public fun voiceTemplate(voiceTemplate: TemplateProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.TemplateConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.TemplateConfigurationProperty.builder()

      /**
       * @param emailTemplate The email template to use for the message.
       */
      override fun emailTemplate(emailTemplate: IResolvable) {
        cdkBuilder.emailTemplate(emailTemplate.let(IResolvable::unwrap))
      }

      /**
       * @param emailTemplate The email template to use for the message.
       */
      override fun emailTemplate(emailTemplate: TemplateProperty) {
        cdkBuilder.emailTemplate(emailTemplate.let(TemplateProperty::unwrap))
      }

      /**
       * @param emailTemplate The email template to use for the message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("842fa1af0f31eea2a4e19f627af3f2e53f87fec05ec016f69cbf49d68e8aa2ea")
      override fun emailTemplate(emailTemplate: TemplateProperty.Builder.() -> Unit): Unit =
          emailTemplate(TemplateProperty(emailTemplate))

      /**
       * @param pushTemplate The push notification template to use for the message.
       */
      override fun pushTemplate(pushTemplate: IResolvable) {
        cdkBuilder.pushTemplate(pushTemplate.let(IResolvable::unwrap))
      }

      /**
       * @param pushTemplate The push notification template to use for the message.
       */
      override fun pushTemplate(pushTemplate: TemplateProperty) {
        cdkBuilder.pushTemplate(pushTemplate.let(TemplateProperty::unwrap))
      }

      /**
       * @param pushTemplate The push notification template to use for the message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("656da5de3c8e03c8eb5892b28fab018dd4d74ff09d50a56f5edcff565992c0ae")
      override fun pushTemplate(pushTemplate: TemplateProperty.Builder.() -> Unit): Unit =
          pushTemplate(TemplateProperty(pushTemplate))

      /**
       * @param smsTemplate The SMS template to use for the message.
       */
      override fun smsTemplate(smsTemplate: IResolvable) {
        cdkBuilder.smsTemplate(smsTemplate.let(IResolvable::unwrap))
      }

      /**
       * @param smsTemplate The SMS template to use for the message.
       */
      override fun smsTemplate(smsTemplate: TemplateProperty) {
        cdkBuilder.smsTemplate(smsTemplate.let(TemplateProperty::unwrap))
      }

      /**
       * @param smsTemplate The SMS template to use for the message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("df53a266a2d1d0eb0501aec4f0b01cbea6c65d43dab0f9d25440837e1a028453")
      override fun smsTemplate(smsTemplate: TemplateProperty.Builder.() -> Unit): Unit =
          smsTemplate(TemplateProperty(smsTemplate))

      /**
       * @param voiceTemplate The voice template to use for the message.
       * This object isn't supported for campaigns.
       */
      override fun voiceTemplate(voiceTemplate: IResolvable) {
        cdkBuilder.voiceTemplate(voiceTemplate.let(IResolvable::unwrap))
      }

      /**
       * @param voiceTemplate The voice template to use for the message.
       * This object isn't supported for campaigns.
       */
      override fun voiceTemplate(voiceTemplate: TemplateProperty) {
        cdkBuilder.voiceTemplate(voiceTemplate.let(TemplateProperty::unwrap))
      }

      /**
       * @param voiceTemplate The voice template to use for the message.
       * This object isn't supported for campaigns.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("773aebfddece0f54dab162d31414f65d973191a5c268ca0e84d9fcd984c7f133")
      override fun voiceTemplate(voiceTemplate: TemplateProperty.Builder.() -> Unit): Unit =
          voiceTemplate(TemplateProperty(voiceTemplate))

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.TemplateConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.TemplateConfigurationProperty,
    ) : CdkObject(cdkObject), TemplateConfigurationProperty {
      /**
       * The email template to use for the message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-templateconfiguration.html#cfn-pinpoint-campaign-templateconfiguration-emailtemplate)
       */
      override fun emailTemplate(): Any? = unwrap(this).getEmailTemplate()

      /**
       * The push notification template to use for the message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-templateconfiguration.html#cfn-pinpoint-campaign-templateconfiguration-pushtemplate)
       */
      override fun pushTemplate(): Any? = unwrap(this).getPushTemplate()

      /**
       * The SMS template to use for the message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-templateconfiguration.html#cfn-pinpoint-campaign-templateconfiguration-smstemplate)
       */
      override fun smsTemplate(): Any? = unwrap(this).getSmsTemplate()

      /**
       * The voice template to use for the message.
       *
       * This object isn't supported for campaigns.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-templateconfiguration.html#cfn-pinpoint-campaign-templateconfiguration-voicetemplate)
       */
      override fun voiceTemplate(): Any? = unwrap(this).getVoiceTemplate()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TemplateConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.TemplateConfigurationProperty):
          TemplateConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TemplateConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TemplateConfigurationProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.TemplateConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnCampaign.TemplateConfigurationProperty
    }
  }

  /**
   * Specifies the name and version of the message template to use for the message.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * TemplateProperty templateProperty = TemplateProperty.builder()
   * .name("name")
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-template.html)
   */
  public interface TemplateProperty {
    /**
     * The name of the message template to use for the message.
     *
     * If specified, this value must match the name of an existing message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-template.html#cfn-pinpoint-campaign-template-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The unique identifier for the version of the message template to use for the message.
     *
     * If specified, this value must match the identifier for an existing template version. To
     * retrieve a list of versions and version identifiers for a template, use the [Template
     * Versions](https://docs.aws.amazon.com/pinpoint/latest/apireference/templates-template-name-template-type-versions.html)
     * resource.
     *
     * If you don't specify a value for this property, Amazon Pinpoint uses the *active version* of
     * the template. The *active version* is typically the version of a template that's been most
     * recently reviewed and approved for use, depending on your workflow. It isn't necessarily the
     * latest version of a template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-template.html#cfn-pinpoint-campaign-template-version)
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [TemplateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the message template to use for the message.
       * If specified, this value must match the name of an existing message template.
       */
      public fun name(name: String)

      /**
       * @param version The unique identifier for the version of the message template to use for the
       * message.
       * If specified, this value must match the identifier for an existing template version. To
       * retrieve a list of versions and version identifiers for a template, use the [Template
       * Versions](https://docs.aws.amazon.com/pinpoint/latest/apireference/templates-template-name-template-type-versions.html)
       * resource.
       *
       * If you don't specify a value for this property, Amazon Pinpoint uses the *active version*
       * of the template. The *active version* is typically the version of a template that's been most
       * recently reviewed and approved for use, depending on your workflow. It isn't necessarily the
       * latest version of a template.
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.TemplateProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.TemplateProperty.builder()

      /**
       * @param name The name of the message template to use for the message.
       * If specified, this value must match the name of an existing message template.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param version The unique identifier for the version of the message template to use for the
       * message.
       * If specified, this value must match the identifier for an existing template version. To
       * retrieve a list of versions and version identifiers for a template, use the [Template
       * Versions](https://docs.aws.amazon.com/pinpoint/latest/apireference/templates-template-name-template-type-versions.html)
       * resource.
       *
       * If you don't specify a value for this property, Amazon Pinpoint uses the *active version*
       * of the template. The *active version* is typically the version of a template that's been most
       * recently reviewed and approved for use, depending on your workflow. It isn't necessarily the
       * latest version of a template.
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.pinpoint.CfnCampaign.TemplateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.TemplateProperty,
    ) : CdkObject(cdkObject), TemplateProperty {
      /**
       * The name of the message template to use for the message.
       *
       * If specified, this value must match the name of an existing message template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-template.html#cfn-pinpoint-campaign-template-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The unique identifier for the version of the message template to use for the message.
       *
       * If specified, this value must match the identifier for an existing template version. To
       * retrieve a list of versions and version identifiers for a template, use the [Template
       * Versions](https://docs.aws.amazon.com/pinpoint/latest/apireference/templates-template-name-template-type-versions.html)
       * resource.
       *
       * If you don't specify a value for this property, Amazon Pinpoint uses the *active version*
       * of the template. The *active version* is typically the version of a template that's been most
       * recently reviewed and approved for use, depending on your workflow. It isn't necessarily the
       * latest version of a template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-template.html#cfn-pinpoint-campaign-template-version)
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.TemplateProperty):
          TemplateProperty = CdkObjectWrappers.wrap(cdkObject) as? TemplateProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TemplateProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.TemplateProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnCampaign.TemplateProperty
    }
  }

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
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
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
  public interface WriteTreatmentResourceProperty {
    /**
     * The delivery configuration settings for sending the treatment through a custom channel.
     *
     * This object is required if the `MessageConfiguration` object for the treatment specifies a
     * `CustomMessage` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-writetreatmentresource.html#cfn-pinpoint-campaign-writetreatmentresource-customdeliveryconfiguration)
     */
    public fun customDeliveryConfiguration(): Any? = unwrap(this).getCustomDeliveryConfiguration()

    /**
     * The message configuration settings for the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-writetreatmentresource.html#cfn-pinpoint-campaign-writetreatmentresource-messageconfiguration)
     */
    public fun messageConfiguration(): Any? = unwrap(this).getMessageConfiguration()

    /**
     * The schedule settings for the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-writetreatmentresource.html#cfn-pinpoint-campaign-writetreatmentresource-schedule)
     */
    public fun schedule(): Any? = unwrap(this).getSchedule()

    /**
     * The allocated percentage of users (segment members) to send the treatment to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-writetreatmentresource.html#cfn-pinpoint-campaign-writetreatmentresource-sizepercent)
     */
    public fun sizePercent(): Number? = unwrap(this).getSizePercent()

    /**
     * The message template to use for the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-writetreatmentresource.html#cfn-pinpoint-campaign-writetreatmentresource-templateconfiguration)
     */
    public fun templateConfiguration(): Any? = unwrap(this).getTemplateConfiguration()

    /**
     * A custom description of the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-writetreatmentresource.html#cfn-pinpoint-campaign-writetreatmentresource-treatmentdescription)
     */
    public fun treatmentDescription(): String? = unwrap(this).getTreatmentDescription()

    /**
     * A custom name for the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-writetreatmentresource.html#cfn-pinpoint-campaign-writetreatmentresource-treatmentname)
     */
    public fun treatmentName(): String? = unwrap(this).getTreatmentName()

    /**
     * A builder for [WriteTreatmentResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
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
          fun customDeliveryConfiguration(customDeliveryConfiguration: CustomDeliveryConfigurationProperty)

      /**
       * @param customDeliveryConfiguration The delivery configuration settings for sending the
       * treatment through a custom channel.
       * This object is required if the `MessageConfiguration` object for the treatment specifies a
       * `CustomMessage` object.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44ba8164fd0c47cc6686cea43cfdeec281f6cb2b341733d79c9173d2de53f94f")
      public
          fun customDeliveryConfiguration(customDeliveryConfiguration: CustomDeliveryConfigurationProperty.Builder.() -> Unit)

      /**
       * @param messageConfiguration The message configuration settings for the treatment.
       */
      public fun messageConfiguration(messageConfiguration: IResolvable)

      /**
       * @param messageConfiguration The message configuration settings for the treatment.
       */
      public fun messageConfiguration(messageConfiguration: MessageConfigurationProperty)

      /**
       * @param messageConfiguration The message configuration settings for the treatment.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4d1b1cde2528cc290d0880568ecd116a092a6e4b0621cbf1e6e21071423adcce")
      public
          fun messageConfiguration(messageConfiguration: MessageConfigurationProperty.Builder.() -> Unit)

      /**
       * @param schedule The schedule settings for the treatment.
       */
      public fun schedule(schedule: IResolvable)

      /**
       * @param schedule The schedule settings for the treatment.
       */
      public fun schedule(schedule: ScheduleProperty)

      /**
       * @param schedule The schedule settings for the treatment.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("177b9b9a3d674ff696e32c1995acca5da423036cbb0d0a05e43ed835928a21c7")
      public fun schedule(schedule: ScheduleProperty.Builder.() -> Unit)

      /**
       * @param sizePercent The allocated percentage of users (segment members) to send the
       * treatment to.
       */
      public fun sizePercent(sizePercent: Number)

      /**
       * @param templateConfiguration The message template to use for the treatment.
       */
      public fun templateConfiguration(templateConfiguration: IResolvable)

      /**
       * @param templateConfiguration The message template to use for the treatment.
       */
      public fun templateConfiguration(templateConfiguration: TemplateConfigurationProperty)

      /**
       * @param templateConfiguration The message template to use for the treatment.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("247644848b7c974023ecedc4fa133c31bc6fabb30dbd8a7c579e4513592ce44f")
      public
          fun templateConfiguration(templateConfiguration: TemplateConfigurationProperty.Builder.() -> Unit)

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
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.WriteTreatmentResourceProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.WriteTreatmentResourceProperty.builder()

      /**
       * @param customDeliveryConfiguration The delivery configuration settings for sending the
       * treatment through a custom channel.
       * This object is required if the `MessageConfiguration` object for the treatment specifies a
       * `CustomMessage` object.
       */
      override fun customDeliveryConfiguration(customDeliveryConfiguration: IResolvable) {
        cdkBuilder.customDeliveryConfiguration(customDeliveryConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param customDeliveryConfiguration The delivery configuration settings for sending the
       * treatment through a custom channel.
       * This object is required if the `MessageConfiguration` object for the treatment specifies a
       * `CustomMessage` object.
       */
      override
          fun customDeliveryConfiguration(customDeliveryConfiguration: CustomDeliveryConfigurationProperty) {
        cdkBuilder.customDeliveryConfiguration(customDeliveryConfiguration.let(CustomDeliveryConfigurationProperty::unwrap))
      }

      /**
       * @param customDeliveryConfiguration The delivery configuration settings for sending the
       * treatment through a custom channel.
       * This object is required if the `MessageConfiguration` object for the treatment specifies a
       * `CustomMessage` object.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44ba8164fd0c47cc6686cea43cfdeec281f6cb2b341733d79c9173d2de53f94f")
      override
          fun customDeliveryConfiguration(customDeliveryConfiguration: CustomDeliveryConfigurationProperty.Builder.() -> Unit):
          Unit =
          customDeliveryConfiguration(CustomDeliveryConfigurationProperty(customDeliveryConfiguration))

      /**
       * @param messageConfiguration The message configuration settings for the treatment.
       */
      override fun messageConfiguration(messageConfiguration: IResolvable) {
        cdkBuilder.messageConfiguration(messageConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param messageConfiguration The message configuration settings for the treatment.
       */
      override fun messageConfiguration(messageConfiguration: MessageConfigurationProperty) {
        cdkBuilder.messageConfiguration(messageConfiguration.let(MessageConfigurationProperty::unwrap))
      }

      /**
       * @param messageConfiguration The message configuration settings for the treatment.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4d1b1cde2528cc290d0880568ecd116a092a6e4b0621cbf1e6e21071423adcce")
      override
          fun messageConfiguration(messageConfiguration: MessageConfigurationProperty.Builder.() -> Unit):
          Unit = messageConfiguration(MessageConfigurationProperty(messageConfiguration))

      /**
       * @param schedule The schedule settings for the treatment.
       */
      override fun schedule(schedule: IResolvable) {
        cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
      }

      /**
       * @param schedule The schedule settings for the treatment.
       */
      override fun schedule(schedule: ScheduleProperty) {
        cdkBuilder.schedule(schedule.let(ScheduleProperty::unwrap))
      }

      /**
       * @param schedule The schedule settings for the treatment.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("177b9b9a3d674ff696e32c1995acca5da423036cbb0d0a05e43ed835928a21c7")
      override fun schedule(schedule: ScheduleProperty.Builder.() -> Unit): Unit =
          schedule(ScheduleProperty(schedule))

      /**
       * @param sizePercent The allocated percentage of users (segment members) to send the
       * treatment to.
       */
      override fun sizePercent(sizePercent: Number) {
        cdkBuilder.sizePercent(sizePercent)
      }

      /**
       * @param templateConfiguration The message template to use for the treatment.
       */
      override fun templateConfiguration(templateConfiguration: IResolvable) {
        cdkBuilder.templateConfiguration(templateConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param templateConfiguration The message template to use for the treatment.
       */
      override fun templateConfiguration(templateConfiguration: TemplateConfigurationProperty) {
        cdkBuilder.templateConfiguration(templateConfiguration.let(TemplateConfigurationProperty::unwrap))
      }

      /**
       * @param templateConfiguration The message template to use for the treatment.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("247644848b7c974023ecedc4fa133c31bc6fabb30dbd8a7c579e4513592ce44f")
      override
          fun templateConfiguration(templateConfiguration: TemplateConfigurationProperty.Builder.() -> Unit):
          Unit = templateConfiguration(TemplateConfigurationProperty(templateConfiguration))

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

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.WriteTreatmentResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.WriteTreatmentResourceProperty,
    ) : CdkObject(cdkObject), WriteTreatmentResourceProperty {
      /**
       * The delivery configuration settings for sending the treatment through a custom channel.
       *
       * This object is required if the `MessageConfiguration` object for the treatment specifies a
       * `CustomMessage` object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-writetreatmentresource.html#cfn-pinpoint-campaign-writetreatmentresource-customdeliveryconfiguration)
       */
      override fun customDeliveryConfiguration(): Any? =
          unwrap(this).getCustomDeliveryConfiguration()

      /**
       * The message configuration settings for the treatment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-writetreatmentresource.html#cfn-pinpoint-campaign-writetreatmentresource-messageconfiguration)
       */
      override fun messageConfiguration(): Any? = unwrap(this).getMessageConfiguration()

      /**
       * The schedule settings for the treatment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-writetreatmentresource.html#cfn-pinpoint-campaign-writetreatmentresource-schedule)
       */
      override fun schedule(): Any? = unwrap(this).getSchedule()

      /**
       * The allocated percentage of users (segment members) to send the treatment to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-writetreatmentresource.html#cfn-pinpoint-campaign-writetreatmentresource-sizepercent)
       */
      override fun sizePercent(): Number? = unwrap(this).getSizePercent()

      /**
       * The message template to use for the treatment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-writetreatmentresource.html#cfn-pinpoint-campaign-writetreatmentresource-templateconfiguration)
       */
      override fun templateConfiguration(): Any? = unwrap(this).getTemplateConfiguration()

      /**
       * A custom description of the treatment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-writetreatmentresource.html#cfn-pinpoint-campaign-writetreatmentresource-treatmentdescription)
       */
      override fun treatmentDescription(): String? = unwrap(this).getTreatmentDescription()

      /**
       * A custom name for the treatment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-writetreatmentresource.html#cfn-pinpoint-campaign-writetreatmentresource-treatmentname)
       */
      override fun treatmentName(): String? = unwrap(this).getTreatmentName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WriteTreatmentResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.WriteTreatmentResourceProperty):
          WriteTreatmentResourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          WriteTreatmentResourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: WriteTreatmentResourceProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.WriteTreatmentResourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnCampaign.WriteTreatmentResourceProperty
    }
  }
}
