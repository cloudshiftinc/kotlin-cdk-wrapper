@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connectcampaignsv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
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
 * Creates an outbound campaign.
 *
 *
 * * For users to be able to view or edit a campaign at a later date by using the Amazon Connect
 * user interface, you must add the instance ID as a tag. For example, `{ "tags": {"owner":
 * "arn:aws:connect:{REGION}:{AWS_ACCOUNT_ID}:instance/{CONNECT_INSTANCE_ID}"}}` .
 * * After a campaign is created, you can't add/remove source.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connectcampaignsv2.*;
 * Object agentlessConfig;
 * CfnCampaign cfnCampaign = CfnCampaign.Builder.create(this, "MyCfnCampaign")
 * .channelSubtypeConfig(ChannelSubtypeConfigProperty.builder()
 * .email(EmailChannelSubtypeConfigProperty.builder()
 * .defaultOutboundConfig(EmailOutboundConfigProperty.builder()
 * .connectSourceEmailAddress("connectSourceEmailAddress")
 * .wisdomTemplateArn("wisdomTemplateArn")
 * // the properties below are optional
 * .sourceEmailAddressDisplayName("sourceEmailAddressDisplayName")
 * .build())
 * .outboundMode(EmailOutboundModeProperty.builder()
 * .agentlessConfig(agentlessConfig)
 * .build())
 * // the properties below are optional
 * .capacity(123)
 * .build())
 * .sms(SmsChannelSubtypeConfigProperty.builder()
 * .defaultOutboundConfig(SmsOutboundConfigProperty.builder()
 * .connectSourcePhoneNumberArn("connectSourcePhoneNumberArn")
 * .wisdomTemplateArn("wisdomTemplateArn")
 * .build())
 * .outboundMode(SmsOutboundModeProperty.builder()
 * .agentlessConfig(agentlessConfig)
 * .build())
 * // the properties below are optional
 * .capacity(123)
 * .build())
 * .telephony(TelephonyChannelSubtypeConfigProperty.builder()
 * .defaultOutboundConfig(TelephonyOutboundConfigProperty.builder()
 * .connectContactFlowId("connectContactFlowId")
 * // the properties below are optional
 * .answerMachineDetectionConfig(AnswerMachineDetectionConfigProperty.builder()
 * .enableAnswerMachineDetection(false)
 * // the properties below are optional
 * .awaitAnswerMachinePrompt(false)
 * .build())
 * .connectSourcePhoneNumber("connectSourcePhoneNumber")
 * .build())
 * .outboundMode(TelephonyOutboundModeProperty.builder()
 * .agentlessConfig(agentlessConfig)
 * .predictiveConfig(PredictiveConfigProperty.builder()
 * .bandwidthAllocation(123)
 * .build())
 * .progressiveConfig(ProgressiveConfigProperty.builder()
 * .bandwidthAllocation(123)
 * .build())
 * .build())
 * // the properties below are optional
 * .capacity(123)
 * .connectQueueId("connectQueueId")
 * .build())
 * .build())
 * .connectInstanceId("connectInstanceId")
 * .name("name")
 * // the properties below are optional
 * .communicationLimitsOverride(CommunicationLimitsConfigProperty.builder()
 * .allChannelsSubtypes(CommunicationLimitsProperty.builder()
 * .communicationLimitList(List.of(CommunicationLimitProperty.builder()
 * .frequency(123)
 * .maxCountPerRecipient(123)
 * .unit("unit")
 * .build()))
 * .build())
 * .build())
 * .communicationTimeConfig(CommunicationTimeConfigProperty.builder()
 * .localTimeZoneConfig(LocalTimeZoneConfigProperty.builder()
 * .defaultTimeZone("defaultTimeZone")
 * .localTimeZoneDetection(List.of("localTimeZoneDetection"))
 * .build())
 * // the properties below are optional
 * .email(TimeWindowProperty.builder()
 * .openHours(OpenHoursProperty.builder()
 * .dailyHours(List.of(DailyHourProperty.builder()
 * .key("key")
 * .value(List.of(TimeRangeProperty.builder()
 * .endTime("endTime")
 * .startTime("startTime")
 * .build()))
 * .build()))
 * .build())
 * // the properties below are optional
 * .restrictedPeriods(RestrictedPeriodsProperty.builder()
 * .restrictedPeriodList(List.of(RestrictedPeriodProperty.builder()
 * .endDate("endDate")
 * .startDate("startDate")
 * // the properties below are optional
 * .name("name")
 * .build()))
 * .build())
 * .build())
 * .sms(TimeWindowProperty.builder()
 * .openHours(OpenHoursProperty.builder()
 * .dailyHours(List.of(DailyHourProperty.builder()
 * .key("key")
 * .value(List.of(TimeRangeProperty.builder()
 * .endTime("endTime")
 * .startTime("startTime")
 * .build()))
 * .build()))
 * .build())
 * // the properties below are optional
 * .restrictedPeriods(RestrictedPeriodsProperty.builder()
 * .restrictedPeriodList(List.of(RestrictedPeriodProperty.builder()
 * .endDate("endDate")
 * .startDate("startDate")
 * // the properties below are optional
 * .name("name")
 * .build()))
 * .build())
 * .build())
 * .telephony(TimeWindowProperty.builder()
 * .openHours(OpenHoursProperty.builder()
 * .dailyHours(List.of(DailyHourProperty.builder()
 * .key("key")
 * .value(List.of(TimeRangeProperty.builder()
 * .endTime("endTime")
 * .startTime("startTime")
 * .build()))
 * .build()))
 * .build())
 * // the properties below are optional
 * .restrictedPeriods(RestrictedPeriodsProperty.builder()
 * .restrictedPeriodList(List.of(RestrictedPeriodProperty.builder()
 * .endDate("endDate")
 * .startDate("startDate")
 * // the properties below are optional
 * .name("name")
 * .build()))
 * .build())
 * .build())
 * .build())
 * .connectCampaignFlowArn("connectCampaignFlowArn")
 * .schedule(ScheduleProperty.builder()
 * .endTime("endTime")
 * .startTime("startTime")
 * // the properties below are optional
 * .refreshFrequency("refreshFrequency")
 * .build())
 * .source(SourceProperty.builder()
 * .customerProfilesSegmentArn("customerProfilesSegmentArn")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html)
 */
public open class CfnCampaign(
  cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCampaignProps,
  ) :
      this(software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCampaignProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCampaignProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCampaignProps(props)
  )

  /**
   * The Amazon Resource Name (ARN).
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Contains channel subtype configuration for an outbound campaign.
   */
  public open fun channelSubtypeConfig(): Any = unwrap(this).getChannelSubtypeConfig()

  /**
   * Contains channel subtype configuration for an outbound campaign.
   */
  public open fun channelSubtypeConfig(`value`: IResolvable) {
    unwrap(this).setChannelSubtypeConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains channel subtype configuration for an outbound campaign.
   */
  public open fun channelSubtypeConfig(`value`: ChannelSubtypeConfigProperty) {
    unwrap(this).setChannelSubtypeConfig(`value`.let(ChannelSubtypeConfigProperty.Companion::unwrap))
  }

  /**
   * Contains channel subtype configuration for an outbound campaign.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("47699c1dc6445a56328a8851a2b5a37097d8d40c6b95b5888876308e36813950")
  public open fun channelSubtypeConfig(`value`: ChannelSubtypeConfigProperty.Builder.() -> Unit):
      Unit = channelSubtypeConfig(ChannelSubtypeConfigProperty(`value`))

  /**
   * Communication limits configuration for an outbound campaign.
   */
  public open fun communicationLimitsOverride(): Any? =
      unwrap(this).getCommunicationLimitsOverride()

  /**
   * Communication limits configuration for an outbound campaign.
   */
  public open fun communicationLimitsOverride(`value`: IResolvable) {
    unwrap(this).setCommunicationLimitsOverride(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Communication limits configuration for an outbound campaign.
   */
  public open fun communicationLimitsOverride(`value`: CommunicationLimitsConfigProperty) {
    unwrap(this).setCommunicationLimitsOverride(`value`.let(CommunicationLimitsConfigProperty.Companion::unwrap))
  }

  /**
   * Communication limits configuration for an outbound campaign.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3a899dc6e432c9ecd9a58c4e1f9406ff0a18ec4d486c381c18088d3c6b37a7b6")
  public open
      fun communicationLimitsOverride(`value`: CommunicationLimitsConfigProperty.Builder.() -> Unit):
      Unit = communicationLimitsOverride(CommunicationLimitsConfigProperty(`value`))

  /**
   * Contains communication time configuration for an outbound campaign.
   */
  public open fun communicationTimeConfig(): Any? = unwrap(this).getCommunicationTimeConfig()

  /**
   * Contains communication time configuration for an outbound campaign.
   */
  public open fun communicationTimeConfig(`value`: IResolvable) {
    unwrap(this).setCommunicationTimeConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains communication time configuration for an outbound campaign.
   */
  public open fun communicationTimeConfig(`value`: CommunicationTimeConfigProperty) {
    unwrap(this).setCommunicationTimeConfig(`value`.let(CommunicationTimeConfigProperty.Companion::unwrap))
  }

  /**
   * Contains communication time configuration for an outbound campaign.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f9cb8c2309101bd28b33121d417892f42e0d65be9294edc8f7ae64812e55feb2")
  public open
      fun communicationTimeConfig(`value`: CommunicationTimeConfigProperty.Builder.() -> Unit): Unit
      = communicationTimeConfig(CommunicationTimeConfigProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the Amazon Connect campaign flow associated with the outbound
   * campaign.
   */
  public open fun connectCampaignFlowArn(): String? = unwrap(this).getConnectCampaignFlowArn()

  /**
   * The Amazon Resource Name (ARN) of the Amazon Connect campaign flow associated with the outbound
   * campaign.
   */
  public open fun connectCampaignFlowArn(`value`: String) {
    unwrap(this).setConnectCampaignFlowArn(`value`)
  }

  /**
   * The identifier of the Amazon Connect instance.
   */
  public open fun connectInstanceId(): String = unwrap(this).getConnectInstanceId()

  /**
   * The identifier of the Amazon Connect instance.
   */
  public open fun connectInstanceId(`value`: String) {
    unwrap(this).setConnectInstanceId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the outbound campaign.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the outbound campaign.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Contains the schedule configuration.
   */
  public open fun schedule(): Any? = unwrap(this).getSchedule()

  /**
   * Contains the schedule configuration.
   */
  public open fun schedule(`value`: IResolvable) {
    unwrap(this).setSchedule(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains the schedule configuration.
   */
  public open fun schedule(`value`: ScheduleProperty) {
    unwrap(this).setSchedule(`value`.let(ScheduleProperty.Companion::unwrap))
  }

  /**
   * Contains the schedule configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d7bb7d7fdaaffdb488efe5a849e4278783b0f2cdc5d72ba3d0f63174f2b468bd")
  public open fun schedule(`value`: ScheduleProperty.Builder.() -> Unit): Unit =
      schedule(ScheduleProperty(`value`))

  /**
   * Contains source configuration.
   */
  public open fun source(): Any? = unwrap(this).getSource()

  /**
   * Contains source configuration.
   */
  public open fun source(`value`: IResolvable) {
    unwrap(this).setSource(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains source configuration.
   */
  public open fun source(`value`: SourceProperty) {
    unwrap(this).setSource(`value`.let(SourceProperty.Companion::unwrap))
  }

  /**
   * Contains source configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9f4b40b67c864c3ef4d101e7febc73813947d822facbd521d584e9bf4005ecf7")
  public open fun source(`value`: SourceProperty.Builder.() -> Unit): Unit =
      source(SourceProperty(`value`))

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.connectcampaignsv2.CfnCampaign].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Contains channel subtype configuration for an outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-channelsubtypeconfig)
     * @param channelSubtypeConfig Contains channel subtype configuration for an outbound campaign. 
     */
    public fun channelSubtypeConfig(channelSubtypeConfig: IResolvable)

    /**
     * Contains channel subtype configuration for an outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-channelsubtypeconfig)
     * @param channelSubtypeConfig Contains channel subtype configuration for an outbound campaign. 
     */
    public fun channelSubtypeConfig(channelSubtypeConfig: ChannelSubtypeConfigProperty)

    /**
     * Contains channel subtype configuration for an outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-channelsubtypeconfig)
     * @param channelSubtypeConfig Contains channel subtype configuration for an outbound campaign. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("492fca940f3f9ff65cac841548368e2b199a2dcd67b5a7a20d5279c7e20a2f99")
    public
        fun channelSubtypeConfig(channelSubtypeConfig: ChannelSubtypeConfigProperty.Builder.() -> Unit)

    /**
     * Communication limits configuration for an outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-communicationlimitsoverride)
     * @param communicationLimitsOverride Communication limits configuration for an outbound
     * campaign. 
     */
    public fun communicationLimitsOverride(communicationLimitsOverride: IResolvable)

    /**
     * Communication limits configuration for an outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-communicationlimitsoverride)
     * @param communicationLimitsOverride Communication limits configuration for an outbound
     * campaign. 
     */
    public
        fun communicationLimitsOverride(communicationLimitsOverride: CommunicationLimitsConfigProperty)

    /**
     * Communication limits configuration for an outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-communicationlimitsoverride)
     * @param communicationLimitsOverride Communication limits configuration for an outbound
     * campaign. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c5f0d27e4c1e04b97d7841d39492039a8dc2545f39bc3b90e7bc0a0d94c50aa")
    public
        fun communicationLimitsOverride(communicationLimitsOverride: CommunicationLimitsConfigProperty.Builder.() -> Unit)

    /**
     * Contains communication time configuration for an outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-communicationtimeconfig)
     * @param communicationTimeConfig Contains communication time configuration for an outbound
     * campaign. 
     */
    public fun communicationTimeConfig(communicationTimeConfig: IResolvable)

    /**
     * Contains communication time configuration for an outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-communicationtimeconfig)
     * @param communicationTimeConfig Contains communication time configuration for an outbound
     * campaign. 
     */
    public fun communicationTimeConfig(communicationTimeConfig: CommunicationTimeConfigProperty)

    /**
     * Contains communication time configuration for an outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-communicationtimeconfig)
     * @param communicationTimeConfig Contains communication time configuration for an outbound
     * campaign. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40e83d75fdf07cdb1a969ae96e527de8c7b7e918d643f2f23b1d5fa4208154eb")
    public
        fun communicationTimeConfig(communicationTimeConfig: CommunicationTimeConfigProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of the Amazon Connect campaign flow associated with the
     * outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-connectcampaignflowarn)
     * @param connectCampaignFlowArn The Amazon Resource Name (ARN) of the Amazon Connect campaign
     * flow associated with the outbound campaign. 
     */
    public fun connectCampaignFlowArn(connectCampaignFlowArn: String)

    /**
     * The identifier of the Amazon Connect instance.
     *
     * You can find the `instanceId` in the ARN of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-connectinstanceid)
     * @param connectInstanceId The identifier of the Amazon Connect instance. 
     */
    public fun connectInstanceId(connectInstanceId: String)

    /**
     * The name of the outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-name)
     * @param name The name of the outbound campaign. 
     */
    public fun name(name: String)

    /**
     * Contains the schedule configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-schedule)
     * @param schedule Contains the schedule configuration. 
     */
    public fun schedule(schedule: IResolvable)

    /**
     * Contains the schedule configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-schedule)
     * @param schedule Contains the schedule configuration. 
     */
    public fun schedule(schedule: ScheduleProperty)

    /**
     * Contains the schedule configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-schedule)
     * @param schedule Contains the schedule configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71ee84fab6726b6a344baacaa2a734a5a2d8cc6b29426146d50d9cf4279c6797")
    public fun schedule(schedule: ScheduleProperty.Builder.() -> Unit)

    /**
     * Contains source configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-source)
     * @param source Contains source configuration. 
     */
    public fun source(source: IResolvable)

    /**
     * Contains source configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-source)
     * @param source Contains source configuration. 
     */
    public fun source(source: SourceProperty)

    /**
     * Contains source configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-source)
     * @param source Contains source configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3a1127a98f7780c6c767677578c8833def24143f36d5ef7faf585de616aa9d2")
    public fun source(source: SourceProperty.Builder.() -> Unit)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, `{ "tags": {"key1":"value1", "key2":"value2"} }` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, `{ "tags": {"key1":"value1", "key2":"value2"} }` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.Builder =
        software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.Builder.create(scope, id)

    /**
     * Contains channel subtype configuration for an outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-channelsubtypeconfig)
     * @param channelSubtypeConfig Contains channel subtype configuration for an outbound campaign. 
     */
    override fun channelSubtypeConfig(channelSubtypeConfig: IResolvable) {
      cdkBuilder.channelSubtypeConfig(channelSubtypeConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains channel subtype configuration for an outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-channelsubtypeconfig)
     * @param channelSubtypeConfig Contains channel subtype configuration for an outbound campaign. 
     */
    override fun channelSubtypeConfig(channelSubtypeConfig: ChannelSubtypeConfigProperty) {
      cdkBuilder.channelSubtypeConfig(channelSubtypeConfig.let(ChannelSubtypeConfigProperty.Companion::unwrap))
    }

    /**
     * Contains channel subtype configuration for an outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-channelsubtypeconfig)
     * @param channelSubtypeConfig Contains channel subtype configuration for an outbound campaign. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("492fca940f3f9ff65cac841548368e2b199a2dcd67b5a7a20d5279c7e20a2f99")
    override
        fun channelSubtypeConfig(channelSubtypeConfig: ChannelSubtypeConfigProperty.Builder.() -> Unit):
        Unit = channelSubtypeConfig(ChannelSubtypeConfigProperty(channelSubtypeConfig))

    /**
     * Communication limits configuration for an outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-communicationlimitsoverride)
     * @param communicationLimitsOverride Communication limits configuration for an outbound
     * campaign. 
     */
    override fun communicationLimitsOverride(communicationLimitsOverride: IResolvable) {
      cdkBuilder.communicationLimitsOverride(communicationLimitsOverride.let(IResolvable.Companion::unwrap))
    }

    /**
     * Communication limits configuration for an outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-communicationlimitsoverride)
     * @param communicationLimitsOverride Communication limits configuration for an outbound
     * campaign. 
     */
    override
        fun communicationLimitsOverride(communicationLimitsOverride: CommunicationLimitsConfigProperty) {
      cdkBuilder.communicationLimitsOverride(communicationLimitsOverride.let(CommunicationLimitsConfigProperty.Companion::unwrap))
    }

    /**
     * Communication limits configuration for an outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-communicationlimitsoverride)
     * @param communicationLimitsOverride Communication limits configuration for an outbound
     * campaign. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c5f0d27e4c1e04b97d7841d39492039a8dc2545f39bc3b90e7bc0a0d94c50aa")
    override
        fun communicationLimitsOverride(communicationLimitsOverride: CommunicationLimitsConfigProperty.Builder.() -> Unit):
        Unit =
        communicationLimitsOverride(CommunicationLimitsConfigProperty(communicationLimitsOverride))

    /**
     * Contains communication time configuration for an outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-communicationtimeconfig)
     * @param communicationTimeConfig Contains communication time configuration for an outbound
     * campaign. 
     */
    override fun communicationTimeConfig(communicationTimeConfig: IResolvable) {
      cdkBuilder.communicationTimeConfig(communicationTimeConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains communication time configuration for an outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-communicationtimeconfig)
     * @param communicationTimeConfig Contains communication time configuration for an outbound
     * campaign. 
     */
    override fun communicationTimeConfig(communicationTimeConfig: CommunicationTimeConfigProperty) {
      cdkBuilder.communicationTimeConfig(communicationTimeConfig.let(CommunicationTimeConfigProperty.Companion::unwrap))
    }

    /**
     * Contains communication time configuration for an outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-communicationtimeconfig)
     * @param communicationTimeConfig Contains communication time configuration for an outbound
     * campaign. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40e83d75fdf07cdb1a969ae96e527de8c7b7e918d643f2f23b1d5fa4208154eb")
    override
        fun communicationTimeConfig(communicationTimeConfig: CommunicationTimeConfigProperty.Builder.() -> Unit):
        Unit = communicationTimeConfig(CommunicationTimeConfigProperty(communicationTimeConfig))

    /**
     * The Amazon Resource Name (ARN) of the Amazon Connect campaign flow associated with the
     * outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-connectcampaignflowarn)
     * @param connectCampaignFlowArn The Amazon Resource Name (ARN) of the Amazon Connect campaign
     * flow associated with the outbound campaign. 
     */
    override fun connectCampaignFlowArn(connectCampaignFlowArn: String) {
      cdkBuilder.connectCampaignFlowArn(connectCampaignFlowArn)
    }

    /**
     * The identifier of the Amazon Connect instance.
     *
     * You can find the `instanceId` in the ARN of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-connectinstanceid)
     * @param connectInstanceId The identifier of the Amazon Connect instance. 
     */
    override fun connectInstanceId(connectInstanceId: String) {
      cdkBuilder.connectInstanceId(connectInstanceId)
    }

    /**
     * The name of the outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-name)
     * @param name The name of the outbound campaign. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Contains the schedule configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-schedule)
     * @param schedule Contains the schedule configuration. 
     */
    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains the schedule configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-schedule)
     * @param schedule Contains the schedule configuration. 
     */
    override fun schedule(schedule: ScheduleProperty) {
      cdkBuilder.schedule(schedule.let(ScheduleProperty.Companion::unwrap))
    }

    /**
     * Contains the schedule configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-schedule)
     * @param schedule Contains the schedule configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71ee84fab6726b6a344baacaa2a734a5a2d8cc6b29426146d50d9cf4279c6797")
    override fun schedule(schedule: ScheduleProperty.Builder.() -> Unit): Unit =
        schedule(ScheduleProperty(schedule))

    /**
     * Contains source configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-source)
     * @param source Contains source configuration. 
     */
    override fun source(source: IResolvable) {
      cdkBuilder.source(source.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains source configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-source)
     * @param source Contains source configuration. 
     */
    override fun source(source: SourceProperty) {
      cdkBuilder.source(source.let(SourceProperty.Companion::unwrap))
    }

    /**
     * Contains source configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-source)
     * @param source Contains source configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3a1127a98f7780c6c767677578c8833def24143f36d5ef7faf585de616aa9d2")
    override fun source(source: SourceProperty.Builder.() -> Unit): Unit =
        source(SourceProperty(source))

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, `{ "tags": {"key1":"value1", "key2":"value2"} }` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, `{ "tags": {"key1":"value1", "key2":"value2"} }` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCampaign {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCampaign(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign):
        CfnCampaign = CfnCampaign(cdkObject)

    internal fun unwrap(wrapped: CfnCampaign):
        software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign = wrapped.cdkObject as
        software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign
  }

  /**
   * Contains answering machine detection configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaignsv2.*;
   * AnswerMachineDetectionConfigProperty answerMachineDetectionConfigProperty =
   * AnswerMachineDetectionConfigProperty.builder()
   * .enableAnswerMachineDetection(false)
   * // the properties below are optional
   * .awaitAnswerMachinePrompt(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-answermachinedetectionconfig.html)
   */
  public interface AnswerMachineDetectionConfigProperty {
    /**
     * Whether or not waiting for an answer machine prompt is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-answermachinedetectionconfig.html#cfn-connectcampaignsv2-campaign-answermachinedetectionconfig-awaitanswermachineprompt)
     */
    public fun awaitAnswerMachinePrompt(): Any? = unwrap(this).getAwaitAnswerMachinePrompt()

    /**
     * Enables answering machine detection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-answermachinedetectionconfig.html#cfn-connectcampaignsv2-campaign-answermachinedetectionconfig-enableanswermachinedetection)
     */
    public fun enableAnswerMachineDetection(): Any

    /**
     * A builder for [AnswerMachineDetectionConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awaitAnswerMachinePrompt Whether or not waiting for an answer machine prompt is
       * enabled.
       */
      public fun awaitAnswerMachinePrompt(awaitAnswerMachinePrompt: Boolean)

      /**
       * @param awaitAnswerMachinePrompt Whether or not waiting for an answer machine prompt is
       * enabled.
       */
      public fun awaitAnswerMachinePrompt(awaitAnswerMachinePrompt: IResolvable)

      /**
       * @param enableAnswerMachineDetection Enables answering machine detection. 
       */
      public fun enableAnswerMachineDetection(enableAnswerMachineDetection: Boolean)

      /**
       * @param enableAnswerMachineDetection Enables answering machine detection. 
       */
      public fun enableAnswerMachineDetection(enableAnswerMachineDetection: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.AnswerMachineDetectionConfigProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.AnswerMachineDetectionConfigProperty.builder()

      /**
       * @param awaitAnswerMachinePrompt Whether or not waiting for an answer machine prompt is
       * enabled.
       */
      override fun awaitAnswerMachinePrompt(awaitAnswerMachinePrompt: Boolean) {
        cdkBuilder.awaitAnswerMachinePrompt(awaitAnswerMachinePrompt)
      }

      /**
       * @param awaitAnswerMachinePrompt Whether or not waiting for an answer machine prompt is
       * enabled.
       */
      override fun awaitAnswerMachinePrompt(awaitAnswerMachinePrompt: IResolvable) {
        cdkBuilder.awaitAnswerMachinePrompt(awaitAnswerMachinePrompt.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param enableAnswerMachineDetection Enables answering machine detection. 
       */
      override fun enableAnswerMachineDetection(enableAnswerMachineDetection: Boolean) {
        cdkBuilder.enableAnswerMachineDetection(enableAnswerMachineDetection)
      }

      /**
       * @param enableAnswerMachineDetection Enables answering machine detection. 
       */
      override fun enableAnswerMachineDetection(enableAnswerMachineDetection: IResolvable) {
        cdkBuilder.enableAnswerMachineDetection(enableAnswerMachineDetection.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.AnswerMachineDetectionConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.AnswerMachineDetectionConfigProperty,
    ) : CdkObject(cdkObject),
        AnswerMachineDetectionConfigProperty {
      /**
       * Whether or not waiting for an answer machine prompt is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-answermachinedetectionconfig.html#cfn-connectcampaignsv2-campaign-answermachinedetectionconfig-awaitanswermachineprompt)
       */
      override fun awaitAnswerMachinePrompt(): Any? = unwrap(this).getAwaitAnswerMachinePrompt()

      /**
       * Enables answering machine detection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-answermachinedetectionconfig.html#cfn-connectcampaignsv2-campaign-answermachinedetectionconfig-enableanswermachinedetection)
       */
      override fun enableAnswerMachineDetection(): Any =
          unwrap(this).getEnableAnswerMachineDetection()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AnswerMachineDetectionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.AnswerMachineDetectionConfigProperty):
          AnswerMachineDetectionConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AnswerMachineDetectionConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnswerMachineDetectionConfigProperty):
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.AnswerMachineDetectionConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.AnswerMachineDetectionConfigProperty
    }
  }

  /**
   * Contains channel subtype configuration for an outbound campaign.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaignsv2.*;
   * Object agentlessConfig;
   * ChannelSubtypeConfigProperty channelSubtypeConfigProperty =
   * ChannelSubtypeConfigProperty.builder()
   * .email(EmailChannelSubtypeConfigProperty.builder()
   * .defaultOutboundConfig(EmailOutboundConfigProperty.builder()
   * .connectSourceEmailAddress("connectSourceEmailAddress")
   * .wisdomTemplateArn("wisdomTemplateArn")
   * // the properties below are optional
   * .sourceEmailAddressDisplayName("sourceEmailAddressDisplayName")
   * .build())
   * .outboundMode(EmailOutboundModeProperty.builder()
   * .agentlessConfig(agentlessConfig)
   * .build())
   * // the properties below are optional
   * .capacity(123)
   * .build())
   * .sms(SmsChannelSubtypeConfigProperty.builder()
   * .defaultOutboundConfig(SmsOutboundConfigProperty.builder()
   * .connectSourcePhoneNumberArn("connectSourcePhoneNumberArn")
   * .wisdomTemplateArn("wisdomTemplateArn")
   * .build())
   * .outboundMode(SmsOutboundModeProperty.builder()
   * .agentlessConfig(agentlessConfig)
   * .build())
   * // the properties below are optional
   * .capacity(123)
   * .build())
   * .telephony(TelephonyChannelSubtypeConfigProperty.builder()
   * .defaultOutboundConfig(TelephonyOutboundConfigProperty.builder()
   * .connectContactFlowId("connectContactFlowId")
   * // the properties below are optional
   * .answerMachineDetectionConfig(AnswerMachineDetectionConfigProperty.builder()
   * .enableAnswerMachineDetection(false)
   * // the properties below are optional
   * .awaitAnswerMachinePrompt(false)
   * .build())
   * .connectSourcePhoneNumber("connectSourcePhoneNumber")
   * .build())
   * .outboundMode(TelephonyOutboundModeProperty.builder()
   * .agentlessConfig(agentlessConfig)
   * .predictiveConfig(PredictiveConfigProperty.builder()
   * .bandwidthAllocation(123)
   * .build())
   * .progressiveConfig(ProgressiveConfigProperty.builder()
   * .bandwidthAllocation(123)
   * .build())
   * .build())
   * // the properties below are optional
   * .capacity(123)
   * .connectQueueId("connectQueueId")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-channelsubtypeconfig.html)
   */
  public interface ChannelSubtypeConfigProperty {
    /**
     * The configuration of the email channel subtype.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-channelsubtypeconfig.html#cfn-connectcampaignsv2-campaign-channelsubtypeconfig-email)
     */
    public fun email(): Any? = unwrap(this).getEmail()

    /**
     * The configuration of the SMS channel subtype.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-channelsubtypeconfig.html#cfn-connectcampaignsv2-campaign-channelsubtypeconfig-sms)
     */
    public fun sms(): Any? = unwrap(this).getSms()

    /**
     * The configuration of the telephony channel subtype.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-channelsubtypeconfig.html#cfn-connectcampaignsv2-campaign-channelsubtypeconfig-telephony)
     */
    public fun telephony(): Any? = unwrap(this).getTelephony()

    /**
     * A builder for [ChannelSubtypeConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param email The configuration of the email channel subtype.
       */
      public fun email(email: IResolvable)

      /**
       * @param email The configuration of the email channel subtype.
       */
      public fun email(email: EmailChannelSubtypeConfigProperty)

      /**
       * @param email The configuration of the email channel subtype.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("92fc5e2bb60d614ccb357328bec5a487a56515cb2a3903c4ccb2ae2dd08c093f")
      public fun email(email: EmailChannelSubtypeConfigProperty.Builder.() -> Unit)

      /**
       * @param sms The configuration of the SMS channel subtype.
       */
      public fun sms(sms: IResolvable)

      /**
       * @param sms The configuration of the SMS channel subtype.
       */
      public fun sms(sms: SmsChannelSubtypeConfigProperty)

      /**
       * @param sms The configuration of the SMS channel subtype.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2608582f351c5fbcf42a42a9723e9fd190a18c47af82a0ba660ccf56bd1aee1c")
      public fun sms(sms: SmsChannelSubtypeConfigProperty.Builder.() -> Unit)

      /**
       * @param telephony The configuration of the telephony channel subtype.
       */
      public fun telephony(telephony: IResolvable)

      /**
       * @param telephony The configuration of the telephony channel subtype.
       */
      public fun telephony(telephony: TelephonyChannelSubtypeConfigProperty)

      /**
       * @param telephony The configuration of the telephony channel subtype.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("080432bd5aef2e108e42ece10daf638b13b34b86604f36b4dc15ff538c10ce0d")
      public fun telephony(telephony: TelephonyChannelSubtypeConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.ChannelSubtypeConfigProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.ChannelSubtypeConfigProperty.builder()

      /**
       * @param email The configuration of the email channel subtype.
       */
      override fun email(email: IResolvable) {
        cdkBuilder.email(email.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param email The configuration of the email channel subtype.
       */
      override fun email(email: EmailChannelSubtypeConfigProperty) {
        cdkBuilder.email(email.let(EmailChannelSubtypeConfigProperty.Companion::unwrap))
      }

      /**
       * @param email The configuration of the email channel subtype.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("92fc5e2bb60d614ccb357328bec5a487a56515cb2a3903c4ccb2ae2dd08c093f")
      override fun email(email: EmailChannelSubtypeConfigProperty.Builder.() -> Unit): Unit =
          email(EmailChannelSubtypeConfigProperty(email))

      /**
       * @param sms The configuration of the SMS channel subtype.
       */
      override fun sms(sms: IResolvable) {
        cdkBuilder.sms(sms.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sms The configuration of the SMS channel subtype.
       */
      override fun sms(sms: SmsChannelSubtypeConfigProperty) {
        cdkBuilder.sms(sms.let(SmsChannelSubtypeConfigProperty.Companion::unwrap))
      }

      /**
       * @param sms The configuration of the SMS channel subtype.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2608582f351c5fbcf42a42a9723e9fd190a18c47af82a0ba660ccf56bd1aee1c")
      override fun sms(sms: SmsChannelSubtypeConfigProperty.Builder.() -> Unit): Unit =
          sms(SmsChannelSubtypeConfigProperty(sms))

      /**
       * @param telephony The configuration of the telephony channel subtype.
       */
      override fun telephony(telephony: IResolvable) {
        cdkBuilder.telephony(telephony.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param telephony The configuration of the telephony channel subtype.
       */
      override fun telephony(telephony: TelephonyChannelSubtypeConfigProperty) {
        cdkBuilder.telephony(telephony.let(TelephonyChannelSubtypeConfigProperty.Companion::unwrap))
      }

      /**
       * @param telephony The configuration of the telephony channel subtype.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("080432bd5aef2e108e42ece10daf638b13b34b86604f36b4dc15ff538c10ce0d")
      override fun telephony(telephony: TelephonyChannelSubtypeConfigProperty.Builder.() -> Unit):
          Unit = telephony(TelephonyChannelSubtypeConfigProperty(telephony))

      public fun build():
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.ChannelSubtypeConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.ChannelSubtypeConfigProperty,
    ) : CdkObject(cdkObject),
        ChannelSubtypeConfigProperty {
      /**
       * The configuration of the email channel subtype.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-channelsubtypeconfig.html#cfn-connectcampaignsv2-campaign-channelsubtypeconfig-email)
       */
      override fun email(): Any? = unwrap(this).getEmail()

      /**
       * The configuration of the SMS channel subtype.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-channelsubtypeconfig.html#cfn-connectcampaignsv2-campaign-channelsubtypeconfig-sms)
       */
      override fun sms(): Any? = unwrap(this).getSms()

      /**
       * The configuration of the telephony channel subtype.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-channelsubtypeconfig.html#cfn-connectcampaignsv2-campaign-channelsubtypeconfig-telephony)
       */
      override fun telephony(): Any? = unwrap(this).getTelephony()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ChannelSubtypeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.ChannelSubtypeConfigProperty):
          ChannelSubtypeConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ChannelSubtypeConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ChannelSubtypeConfigProperty):
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.ChannelSubtypeConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.ChannelSubtypeConfigProperty
    }
  }

  /**
   * Contains information about a communication limit.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaignsv2.*;
   * CommunicationLimitProperty communicationLimitProperty = CommunicationLimitProperty.builder()
   * .frequency(123)
   * .maxCountPerRecipient(123)
   * .unit("unit")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-communicationlimit.html)
   */
  public interface CommunicationLimitProperty {
    /**
     * The frequency of communication limit evaluation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-communicationlimit.html#cfn-connectcampaignsv2-campaign-communicationlimit-frequency)
     */
    public fun frequency(): Number

    /**
     * The maximum outreaching count for each recipient.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-communicationlimit.html#cfn-connectcampaignsv2-campaign-communicationlimit-maxcountperrecipient)
     */
    public fun maxCountPerRecipient(): Number

    /**
     * The unit of communication limit evaluation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-communicationlimit.html#cfn-connectcampaignsv2-campaign-communicationlimit-unit)
     */
    public fun unit(): String

    /**
     * A builder for [CommunicationLimitProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param frequency The frequency of communication limit evaluation. 
       */
      public fun frequency(frequency: Number)

      /**
       * @param maxCountPerRecipient The maximum outreaching count for each recipient. 
       */
      public fun maxCountPerRecipient(maxCountPerRecipient: Number)

      /**
       * @param unit The unit of communication limit evaluation. 
       */
      public fun unit(unit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.CommunicationLimitProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.CommunicationLimitProperty.builder()

      /**
       * @param frequency The frequency of communication limit evaluation. 
       */
      override fun frequency(frequency: Number) {
        cdkBuilder.frequency(frequency)
      }

      /**
       * @param maxCountPerRecipient The maximum outreaching count for each recipient. 
       */
      override fun maxCountPerRecipient(maxCountPerRecipient: Number) {
        cdkBuilder.maxCountPerRecipient(maxCountPerRecipient)
      }

      /**
       * @param unit The unit of communication limit evaluation. 
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.CommunicationLimitProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.CommunicationLimitProperty,
    ) : CdkObject(cdkObject),
        CommunicationLimitProperty {
      /**
       * The frequency of communication limit evaluation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-communicationlimit.html#cfn-connectcampaignsv2-campaign-communicationlimit-frequency)
       */
      override fun frequency(): Number = unwrap(this).getFrequency()

      /**
       * The maximum outreaching count for each recipient.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-communicationlimit.html#cfn-connectcampaignsv2-campaign-communicationlimit-maxcountperrecipient)
       */
      override fun maxCountPerRecipient(): Number = unwrap(this).getMaxCountPerRecipient()

      /**
       * The unit of communication limit evaluation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-communicationlimit.html#cfn-connectcampaignsv2-campaign-communicationlimit-unit)
       */
      override fun unit(): String = unwrap(this).getUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CommunicationLimitProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.CommunicationLimitProperty):
          CommunicationLimitProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CommunicationLimitProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CommunicationLimitProperty):
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.CommunicationLimitProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.CommunicationLimitProperty
    }
  }

  /**
   * Contains the communication limits configuration for an outbound campaign.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaignsv2.*;
   * CommunicationLimitsConfigProperty communicationLimitsConfigProperty =
   * CommunicationLimitsConfigProperty.builder()
   * .allChannelsSubtypes(CommunicationLimitsProperty.builder()
   * .communicationLimitList(List.of(CommunicationLimitProperty.builder()
   * .frequency(123)
   * .maxCountPerRecipient(123)
   * .unit("unit")
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-communicationlimitsconfig.html)
   */
  public interface CommunicationLimitsConfigProperty {
    /**
     * The CommunicationLimits that apply to all channel subtypes defined in an outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-communicationlimitsconfig.html#cfn-connectcampaignsv2-campaign-communicationlimitsconfig-allchannelssubtypes)
     */
    public fun allChannelsSubtypes(): Any? = unwrap(this).getAllChannelsSubtypes()

    /**
     * A builder for [CommunicationLimitsConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allChannelsSubtypes The CommunicationLimits that apply to all channel subtypes
       * defined in an outbound campaign.
       */
      public fun allChannelsSubtypes(allChannelsSubtypes: IResolvable)

      /**
       * @param allChannelsSubtypes The CommunicationLimits that apply to all channel subtypes
       * defined in an outbound campaign.
       */
      public fun allChannelsSubtypes(allChannelsSubtypes: CommunicationLimitsProperty)

      /**
       * @param allChannelsSubtypes The CommunicationLimits that apply to all channel subtypes
       * defined in an outbound campaign.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2271138c459cbc3161668dc60f29a5fa3828055bb88b28db94312f1103b139e0")
      public
          fun allChannelsSubtypes(allChannelsSubtypes: CommunicationLimitsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.CommunicationLimitsConfigProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.CommunicationLimitsConfigProperty.builder()

      /**
       * @param allChannelsSubtypes The CommunicationLimits that apply to all channel subtypes
       * defined in an outbound campaign.
       */
      override fun allChannelsSubtypes(allChannelsSubtypes: IResolvable) {
        cdkBuilder.allChannelsSubtypes(allChannelsSubtypes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param allChannelsSubtypes The CommunicationLimits that apply to all channel subtypes
       * defined in an outbound campaign.
       */
      override fun allChannelsSubtypes(allChannelsSubtypes: CommunicationLimitsProperty) {
        cdkBuilder.allChannelsSubtypes(allChannelsSubtypes.let(CommunicationLimitsProperty.Companion::unwrap))
      }

      /**
       * @param allChannelsSubtypes The CommunicationLimits that apply to all channel subtypes
       * defined in an outbound campaign.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2271138c459cbc3161668dc60f29a5fa3828055bb88b28db94312f1103b139e0")
      override
          fun allChannelsSubtypes(allChannelsSubtypes: CommunicationLimitsProperty.Builder.() -> Unit):
          Unit = allChannelsSubtypes(CommunicationLimitsProperty(allChannelsSubtypes))

      public fun build():
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.CommunicationLimitsConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.CommunicationLimitsConfigProperty,
    ) : CdkObject(cdkObject),
        CommunicationLimitsConfigProperty {
      /**
       * The CommunicationLimits that apply to all channel subtypes defined in an outbound campaign.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-communicationlimitsconfig.html#cfn-connectcampaignsv2-campaign-communicationlimitsconfig-allchannelssubtypes)
       */
      override fun allChannelsSubtypes(): Any? = unwrap(this).getAllChannelsSubtypes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CommunicationLimitsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.CommunicationLimitsConfigProperty):
          CommunicationLimitsConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CommunicationLimitsConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CommunicationLimitsConfigProperty):
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.CommunicationLimitsConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.CommunicationLimitsConfigProperty
    }
  }

  /**
   * Contains information about communication limits.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaignsv2.*;
   * CommunicationLimitsProperty communicationLimitsProperty = CommunicationLimitsProperty.builder()
   * .communicationLimitList(List.of(CommunicationLimitProperty.builder()
   * .frequency(123)
   * .maxCountPerRecipient(123)
   * .unit("unit")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-communicationlimits.html)
   */
  public interface CommunicationLimitsProperty {
    /**
     * The list of CommunicationLimits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-communicationlimits.html#cfn-connectcampaignsv2-campaign-communicationlimits-communicationlimitlist)
     */
    public fun communicationLimitList(): Any? = unwrap(this).getCommunicationLimitList()

    /**
     * A builder for [CommunicationLimitsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param communicationLimitList The list of CommunicationLimits.
       */
      public fun communicationLimitList(communicationLimitList: IResolvable)

      /**
       * @param communicationLimitList The list of CommunicationLimits.
       */
      public fun communicationLimitList(communicationLimitList: List<Any>)

      /**
       * @param communicationLimitList The list of CommunicationLimits.
       */
      public fun communicationLimitList(vararg communicationLimitList: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.CommunicationLimitsProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.CommunicationLimitsProperty.builder()

      /**
       * @param communicationLimitList The list of CommunicationLimits.
       */
      override fun communicationLimitList(communicationLimitList: IResolvable) {
        cdkBuilder.communicationLimitList(communicationLimitList.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param communicationLimitList The list of CommunicationLimits.
       */
      override fun communicationLimitList(communicationLimitList: List<Any>) {
        cdkBuilder.communicationLimitList(communicationLimitList.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param communicationLimitList The list of CommunicationLimits.
       */
      override fun communicationLimitList(vararg communicationLimitList: Any): Unit =
          communicationLimitList(communicationLimitList.toList())

      public fun build():
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.CommunicationLimitsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.CommunicationLimitsProperty,
    ) : CdkObject(cdkObject),
        CommunicationLimitsProperty {
      /**
       * The list of CommunicationLimits.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-communicationlimits.html#cfn-connectcampaignsv2-campaign-communicationlimits-communicationlimitlist)
       */
      override fun communicationLimitList(): Any? = unwrap(this).getCommunicationLimitList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CommunicationLimitsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.CommunicationLimitsProperty):
          CommunicationLimitsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CommunicationLimitsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CommunicationLimitsProperty):
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.CommunicationLimitsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.CommunicationLimitsProperty
    }
  }

  /**
   * Communication time configuration for an outbound campaign.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaignsv2.*;
   * CommunicationTimeConfigProperty communicationTimeConfigProperty =
   * CommunicationTimeConfigProperty.builder()
   * .localTimeZoneConfig(LocalTimeZoneConfigProperty.builder()
   * .defaultTimeZone("defaultTimeZone")
   * .localTimeZoneDetection(List.of("localTimeZoneDetection"))
   * .build())
   * // the properties below are optional
   * .email(TimeWindowProperty.builder()
   * .openHours(OpenHoursProperty.builder()
   * .dailyHours(List.of(DailyHourProperty.builder()
   * .key("key")
   * .value(List.of(TimeRangeProperty.builder()
   * .endTime("endTime")
   * .startTime("startTime")
   * .build()))
   * .build()))
   * .build())
   * // the properties below are optional
   * .restrictedPeriods(RestrictedPeriodsProperty.builder()
   * .restrictedPeriodList(List.of(RestrictedPeriodProperty.builder()
   * .endDate("endDate")
   * .startDate("startDate")
   * // the properties below are optional
   * .name("name")
   * .build()))
   * .build())
   * .build())
   * .sms(TimeWindowProperty.builder()
   * .openHours(OpenHoursProperty.builder()
   * .dailyHours(List.of(DailyHourProperty.builder()
   * .key("key")
   * .value(List.of(TimeRangeProperty.builder()
   * .endTime("endTime")
   * .startTime("startTime")
   * .build()))
   * .build()))
   * .build())
   * // the properties below are optional
   * .restrictedPeriods(RestrictedPeriodsProperty.builder()
   * .restrictedPeriodList(List.of(RestrictedPeriodProperty.builder()
   * .endDate("endDate")
   * .startDate("startDate")
   * // the properties below are optional
   * .name("name")
   * .build()))
   * .build())
   * .build())
   * .telephony(TimeWindowProperty.builder()
   * .openHours(OpenHoursProperty.builder()
   * .dailyHours(List.of(DailyHourProperty.builder()
   * .key("key")
   * .value(List.of(TimeRangeProperty.builder()
   * .endTime("endTime")
   * .startTime("startTime")
   * .build()))
   * .build()))
   * .build())
   * // the properties below are optional
   * .restrictedPeriods(RestrictedPeriodsProperty.builder()
   * .restrictedPeriodList(List.of(RestrictedPeriodProperty.builder()
   * .endDate("endDate")
   * .startDate("startDate")
   * // the properties below are optional
   * .name("name")
   * .build()))
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-communicationtimeconfig.html)
   */
  public interface CommunicationTimeConfigProperty {
    /**
     * The communication time configuration for the email channel subtype.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-communicationtimeconfig.html#cfn-connectcampaignsv2-campaign-communicationtimeconfig-email)
     */
    public fun email(): Any? = unwrap(this).getEmail()

    /**
     * The local timezone configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-communicationtimeconfig.html#cfn-connectcampaignsv2-campaign-communicationtimeconfig-localtimezoneconfig)
     */
    public fun localTimeZoneConfig(): Any

    /**
     * The communication time configuration for the SMS channel subtype.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-communicationtimeconfig.html#cfn-connectcampaignsv2-campaign-communicationtimeconfig-sms)
     */
    public fun sms(): Any? = unwrap(this).getSms()

    /**
     * The communication time configuration for the telephony channel subtype.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-communicationtimeconfig.html#cfn-connectcampaignsv2-campaign-communicationtimeconfig-telephony)
     */
    public fun telephony(): Any? = unwrap(this).getTelephony()

    /**
     * A builder for [CommunicationTimeConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param email The communication time configuration for the email channel subtype.
       */
      public fun email(email: IResolvable)

      /**
       * @param email The communication time configuration for the email channel subtype.
       */
      public fun email(email: TimeWindowProperty)

      /**
       * @param email The communication time configuration for the email channel subtype.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59f8d59e8cb3a2bdbd062dbfe92028de4d58fabaa9da452e255988c6ebc7e73a")
      public fun email(email: TimeWindowProperty.Builder.() -> Unit)

      /**
       * @param localTimeZoneConfig The local timezone configuration. 
       */
      public fun localTimeZoneConfig(localTimeZoneConfig: IResolvable)

      /**
       * @param localTimeZoneConfig The local timezone configuration. 
       */
      public fun localTimeZoneConfig(localTimeZoneConfig: LocalTimeZoneConfigProperty)

      /**
       * @param localTimeZoneConfig The local timezone configuration. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("519db76f501e0bbddffe24e3b1537be2fe4007a8a3e9f9db5a53b1fa44d55294")
      public
          fun localTimeZoneConfig(localTimeZoneConfig: LocalTimeZoneConfigProperty.Builder.() -> Unit)

      /**
       * @param sms The communication time configuration for the SMS channel subtype.
       */
      public fun sms(sms: IResolvable)

      /**
       * @param sms The communication time configuration for the SMS channel subtype.
       */
      public fun sms(sms: TimeWindowProperty)

      /**
       * @param sms The communication time configuration for the SMS channel subtype.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("17d8703a14cbb9ae1fc1efac295099c9882e1dd1584cdf03f1c0de745872c4ee")
      public fun sms(sms: TimeWindowProperty.Builder.() -> Unit)

      /**
       * @param telephony The communication time configuration for the telephony channel subtype.
       */
      public fun telephony(telephony: IResolvable)

      /**
       * @param telephony The communication time configuration for the telephony channel subtype.
       */
      public fun telephony(telephony: TimeWindowProperty)

      /**
       * @param telephony The communication time configuration for the telephony channel subtype.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c44706eb40e8d6a4018b39ea76e09bcd0f96add9dd549f316d60a83003eeaf2")
      public fun telephony(telephony: TimeWindowProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.CommunicationTimeConfigProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.CommunicationTimeConfigProperty.builder()

      /**
       * @param email The communication time configuration for the email channel subtype.
       */
      override fun email(email: IResolvable) {
        cdkBuilder.email(email.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param email The communication time configuration for the email channel subtype.
       */
      override fun email(email: TimeWindowProperty) {
        cdkBuilder.email(email.let(TimeWindowProperty.Companion::unwrap))
      }

      /**
       * @param email The communication time configuration for the email channel subtype.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59f8d59e8cb3a2bdbd062dbfe92028de4d58fabaa9da452e255988c6ebc7e73a")
      override fun email(email: TimeWindowProperty.Builder.() -> Unit): Unit =
          email(TimeWindowProperty(email))

      /**
       * @param localTimeZoneConfig The local timezone configuration. 
       */
      override fun localTimeZoneConfig(localTimeZoneConfig: IResolvable) {
        cdkBuilder.localTimeZoneConfig(localTimeZoneConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param localTimeZoneConfig The local timezone configuration. 
       */
      override fun localTimeZoneConfig(localTimeZoneConfig: LocalTimeZoneConfigProperty) {
        cdkBuilder.localTimeZoneConfig(localTimeZoneConfig.let(LocalTimeZoneConfigProperty.Companion::unwrap))
      }

      /**
       * @param localTimeZoneConfig The local timezone configuration. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("519db76f501e0bbddffe24e3b1537be2fe4007a8a3e9f9db5a53b1fa44d55294")
      override
          fun localTimeZoneConfig(localTimeZoneConfig: LocalTimeZoneConfigProperty.Builder.() -> Unit):
          Unit = localTimeZoneConfig(LocalTimeZoneConfigProperty(localTimeZoneConfig))

      /**
       * @param sms The communication time configuration for the SMS channel subtype.
       */
      override fun sms(sms: IResolvable) {
        cdkBuilder.sms(sms.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sms The communication time configuration for the SMS channel subtype.
       */
      override fun sms(sms: TimeWindowProperty) {
        cdkBuilder.sms(sms.let(TimeWindowProperty.Companion::unwrap))
      }

      /**
       * @param sms The communication time configuration for the SMS channel subtype.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("17d8703a14cbb9ae1fc1efac295099c9882e1dd1584cdf03f1c0de745872c4ee")
      override fun sms(sms: TimeWindowProperty.Builder.() -> Unit): Unit =
          sms(TimeWindowProperty(sms))

      /**
       * @param telephony The communication time configuration for the telephony channel subtype.
       */
      override fun telephony(telephony: IResolvable) {
        cdkBuilder.telephony(telephony.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param telephony The communication time configuration for the telephony channel subtype.
       */
      override fun telephony(telephony: TimeWindowProperty) {
        cdkBuilder.telephony(telephony.let(TimeWindowProperty.Companion::unwrap))
      }

      /**
       * @param telephony The communication time configuration for the telephony channel subtype.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c44706eb40e8d6a4018b39ea76e09bcd0f96add9dd549f316d60a83003eeaf2")
      override fun telephony(telephony: TimeWindowProperty.Builder.() -> Unit): Unit =
          telephony(TimeWindowProperty(telephony))

      public fun build():
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.CommunicationTimeConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.CommunicationTimeConfigProperty,
    ) : CdkObject(cdkObject),
        CommunicationTimeConfigProperty {
      /**
       * The communication time configuration for the email channel subtype.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-communicationtimeconfig.html#cfn-connectcampaignsv2-campaign-communicationtimeconfig-email)
       */
      override fun email(): Any? = unwrap(this).getEmail()

      /**
       * The local timezone configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-communicationtimeconfig.html#cfn-connectcampaignsv2-campaign-communicationtimeconfig-localtimezoneconfig)
       */
      override fun localTimeZoneConfig(): Any = unwrap(this).getLocalTimeZoneConfig()

      /**
       * The communication time configuration for the SMS channel subtype.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-communicationtimeconfig.html#cfn-connectcampaignsv2-campaign-communicationtimeconfig-sms)
       */
      override fun sms(): Any? = unwrap(this).getSms()

      /**
       * The communication time configuration for the telephony channel subtype.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-communicationtimeconfig.html#cfn-connectcampaignsv2-campaign-communicationtimeconfig-telephony)
       */
      override fun telephony(): Any? = unwrap(this).getTelephony()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CommunicationTimeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.CommunicationTimeConfigProperty):
          CommunicationTimeConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CommunicationTimeConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CommunicationTimeConfigProperty):
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.CommunicationTimeConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.CommunicationTimeConfigProperty
    }
  }

  /**
   * The daily hours configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaignsv2.*;
   * DailyHourProperty dailyHourProperty = DailyHourProperty.builder()
   * .key("key")
   * .value(List.of(TimeRangeProperty.builder()
   * .endTime("endTime")
   * .startTime("startTime")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-dailyhour.html)
   */
  public interface DailyHourProperty {
    /**
     * The key for DailyHour.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-dailyhour.html#cfn-connectcampaignsv2-campaign-dailyhour-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * The value for DailyHour.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-dailyhour.html#cfn-connectcampaignsv2-campaign-dailyhour-value)
     */
    public fun `value`(): Any? = unwrap(this).getValue()

    /**
     * A builder for [DailyHourProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The key for DailyHour.
       */
      public fun key(key: String)

      /**
       * @param value The value for DailyHour.
       */
      public fun `value`(`value`: IResolvable)

      /**
       * @param value The value for DailyHour.
       */
      public fun `value`(`value`: List<Any>)

      /**
       * @param value The value for DailyHour.
       */
      public fun `value`(vararg `value`: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.DailyHourProperty.Builder =
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.DailyHourProperty.builder()

      /**
       * @param key The key for DailyHour.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value for DailyHour.
       */
      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param value The value for DailyHour.
       */
      override fun `value`(`value`: List<Any>) {
        cdkBuilder.`value`(`value`.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param value The value for DailyHour.
       */
      override fun `value`(vararg `value`: Any): Unit = `value`(`value`.toList())

      public fun build():
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.DailyHourProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.DailyHourProperty,
    ) : CdkObject(cdkObject),
        DailyHourProperty {
      /**
       * The key for DailyHour.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-dailyhour.html#cfn-connectcampaignsv2-campaign-dailyhour-key)
       */
      override fun key(): String? = unwrap(this).getKey()

      /**
       * The value for DailyHour.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-dailyhour.html#cfn-connectcampaignsv2-campaign-dailyhour-value)
       */
      override fun `value`(): Any? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DailyHourProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.DailyHourProperty):
          DailyHourProperty = CdkObjectWrappers.wrap(cdkObject) as? DailyHourProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DailyHourProperty):
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.DailyHourProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.DailyHourProperty
    }
  }

  /**
   * The configuration for the email channel subtype.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaignsv2.*;
   * Object agentlessConfig;
   * EmailChannelSubtypeConfigProperty emailChannelSubtypeConfigProperty =
   * EmailChannelSubtypeConfigProperty.builder()
   * .defaultOutboundConfig(EmailOutboundConfigProperty.builder()
   * .connectSourceEmailAddress("connectSourceEmailAddress")
   * .wisdomTemplateArn("wisdomTemplateArn")
   * // the properties below are optional
   * .sourceEmailAddressDisplayName("sourceEmailAddressDisplayName")
   * .build())
   * .outboundMode(EmailOutboundModeProperty.builder()
   * .agentlessConfig(agentlessConfig)
   * .build())
   * // the properties below are optional
   * .capacity(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-emailchannelsubtypeconfig.html)
   */
  public interface EmailChannelSubtypeConfigProperty {
    /**
     * The allocation of email capacity between multiple running outbound campaigns.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-emailchannelsubtypeconfig.html#cfn-connectcampaignsv2-campaign-emailchannelsubtypeconfig-capacity)
     */
    public fun capacity(): Number? = unwrap(this).getCapacity()

    /**
     * The default email outbound configuration of an outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-emailchannelsubtypeconfig.html#cfn-connectcampaignsv2-campaign-emailchannelsubtypeconfig-defaultoutboundconfig)
     */
    public fun defaultOutboundConfig(): Any

    /**
     * The outbound mode for email of an outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-emailchannelsubtypeconfig.html#cfn-connectcampaignsv2-campaign-emailchannelsubtypeconfig-outboundmode)
     */
    public fun outboundMode(): Any

    /**
     * A builder for [EmailChannelSubtypeConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param capacity The allocation of email capacity between multiple running outbound
       * campaigns.
       */
      public fun capacity(capacity: Number)

      /**
       * @param defaultOutboundConfig The default email outbound configuration of an outbound
       * campaign. 
       */
      public fun defaultOutboundConfig(defaultOutboundConfig: IResolvable)

      /**
       * @param defaultOutboundConfig The default email outbound configuration of an outbound
       * campaign. 
       */
      public fun defaultOutboundConfig(defaultOutboundConfig: EmailOutboundConfigProperty)

      /**
       * @param defaultOutboundConfig The default email outbound configuration of an outbound
       * campaign. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e00ad9307c79f6bb8a90b5e615e2f1bcdcf38cfbca13f9de08a5700bf279a6af")
      public
          fun defaultOutboundConfig(defaultOutboundConfig: EmailOutboundConfigProperty.Builder.() -> Unit)

      /**
       * @param outboundMode The outbound mode for email of an outbound campaign. 
       */
      public fun outboundMode(outboundMode: IResolvable)

      /**
       * @param outboundMode The outbound mode for email of an outbound campaign. 
       */
      public fun outboundMode(outboundMode: EmailOutboundModeProperty)

      /**
       * @param outboundMode The outbound mode for email of an outbound campaign. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67bb5b095ae68c4681466c14795fa4980c86c76f6a7720ecc15a4cc63bedb097")
      public fun outboundMode(outboundMode: EmailOutboundModeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.EmailChannelSubtypeConfigProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.EmailChannelSubtypeConfigProperty.builder()

      /**
       * @param capacity The allocation of email capacity between multiple running outbound
       * campaigns.
       */
      override fun capacity(capacity: Number) {
        cdkBuilder.capacity(capacity)
      }

      /**
       * @param defaultOutboundConfig The default email outbound configuration of an outbound
       * campaign. 
       */
      override fun defaultOutboundConfig(defaultOutboundConfig: IResolvable) {
        cdkBuilder.defaultOutboundConfig(defaultOutboundConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param defaultOutboundConfig The default email outbound configuration of an outbound
       * campaign. 
       */
      override fun defaultOutboundConfig(defaultOutboundConfig: EmailOutboundConfigProperty) {
        cdkBuilder.defaultOutboundConfig(defaultOutboundConfig.let(EmailOutboundConfigProperty.Companion::unwrap))
      }

      /**
       * @param defaultOutboundConfig The default email outbound configuration of an outbound
       * campaign. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e00ad9307c79f6bb8a90b5e615e2f1bcdcf38cfbca13f9de08a5700bf279a6af")
      override
          fun defaultOutboundConfig(defaultOutboundConfig: EmailOutboundConfigProperty.Builder.() -> Unit):
          Unit = defaultOutboundConfig(EmailOutboundConfigProperty(defaultOutboundConfig))

      /**
       * @param outboundMode The outbound mode for email of an outbound campaign. 
       */
      override fun outboundMode(outboundMode: IResolvable) {
        cdkBuilder.outboundMode(outboundMode.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param outboundMode The outbound mode for email of an outbound campaign. 
       */
      override fun outboundMode(outboundMode: EmailOutboundModeProperty) {
        cdkBuilder.outboundMode(outboundMode.let(EmailOutboundModeProperty.Companion::unwrap))
      }

      /**
       * @param outboundMode The outbound mode for email of an outbound campaign. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67bb5b095ae68c4681466c14795fa4980c86c76f6a7720ecc15a4cc63bedb097")
      override fun outboundMode(outboundMode: EmailOutboundModeProperty.Builder.() -> Unit): Unit =
          outboundMode(EmailOutboundModeProperty(outboundMode))

      public fun build():
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.EmailChannelSubtypeConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.EmailChannelSubtypeConfigProperty,
    ) : CdkObject(cdkObject),
        EmailChannelSubtypeConfigProperty {
      /**
       * The allocation of email capacity between multiple running outbound campaigns.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-emailchannelsubtypeconfig.html#cfn-connectcampaignsv2-campaign-emailchannelsubtypeconfig-capacity)
       */
      override fun capacity(): Number? = unwrap(this).getCapacity()

      /**
       * The default email outbound configuration of an outbound campaign.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-emailchannelsubtypeconfig.html#cfn-connectcampaignsv2-campaign-emailchannelsubtypeconfig-defaultoutboundconfig)
       */
      override fun defaultOutboundConfig(): Any = unwrap(this).getDefaultOutboundConfig()

      /**
       * The outbound mode for email of an outbound campaign.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-emailchannelsubtypeconfig.html#cfn-connectcampaignsv2-campaign-emailchannelsubtypeconfig-outboundmode)
       */
      override fun outboundMode(): Any = unwrap(this).getOutboundMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          EmailChannelSubtypeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.EmailChannelSubtypeConfigProperty):
          EmailChannelSubtypeConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EmailChannelSubtypeConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EmailChannelSubtypeConfigProperty):
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.EmailChannelSubtypeConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.EmailChannelSubtypeConfigProperty
    }
  }

  /**
   * The outbound configuration for email.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaignsv2.*;
   * EmailOutboundConfigProperty emailOutboundConfigProperty = EmailOutboundConfigProperty.builder()
   * .connectSourceEmailAddress("connectSourceEmailAddress")
   * .wisdomTemplateArn("wisdomTemplateArn")
   * // the properties below are optional
   * .sourceEmailAddressDisplayName("sourceEmailAddressDisplayName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-emailoutboundconfig.html)
   */
  public interface EmailOutboundConfigProperty {
    /**
     * The Amazon Connect source email address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-emailoutboundconfig.html#cfn-connectcampaignsv2-campaign-emailoutboundconfig-connectsourceemailaddress)
     */
    public fun connectSourceEmailAddress(): String

    /**
     * The display name for the Amazon Connect source email address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-emailoutboundconfig.html#cfn-connectcampaignsv2-campaign-emailoutboundconfig-sourceemailaddressdisplayname)
     */
    public fun sourceEmailAddressDisplayName(): String? =
        unwrap(this).getSourceEmailAddressDisplayName()

    /**
     * The Amazon Resource Name (ARN) of the Amazon Q in Connect template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-emailoutboundconfig.html#cfn-connectcampaignsv2-campaign-emailoutboundconfig-wisdomtemplatearn)
     */
    public fun wisdomTemplateArn(): String

    /**
     * A builder for [EmailOutboundConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connectSourceEmailAddress The Amazon Connect source email address. 
       */
      public fun connectSourceEmailAddress(connectSourceEmailAddress: String)

      /**
       * @param sourceEmailAddressDisplayName The display name for the Amazon Connect source email
       * address.
       */
      public fun sourceEmailAddressDisplayName(sourceEmailAddressDisplayName: String)

      /**
       * @param wisdomTemplateArn The Amazon Resource Name (ARN) of the Amazon Q in Connect
       * template. 
       */
      public fun wisdomTemplateArn(wisdomTemplateArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.EmailOutboundConfigProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.EmailOutboundConfigProperty.builder()

      /**
       * @param connectSourceEmailAddress The Amazon Connect source email address. 
       */
      override fun connectSourceEmailAddress(connectSourceEmailAddress: String) {
        cdkBuilder.connectSourceEmailAddress(connectSourceEmailAddress)
      }

      /**
       * @param sourceEmailAddressDisplayName The display name for the Amazon Connect source email
       * address.
       */
      override fun sourceEmailAddressDisplayName(sourceEmailAddressDisplayName: String) {
        cdkBuilder.sourceEmailAddressDisplayName(sourceEmailAddressDisplayName)
      }

      /**
       * @param wisdomTemplateArn The Amazon Resource Name (ARN) of the Amazon Q in Connect
       * template. 
       */
      override fun wisdomTemplateArn(wisdomTemplateArn: String) {
        cdkBuilder.wisdomTemplateArn(wisdomTemplateArn)
      }

      public fun build():
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.EmailOutboundConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.EmailOutboundConfigProperty,
    ) : CdkObject(cdkObject),
        EmailOutboundConfigProperty {
      /**
       * The Amazon Connect source email address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-emailoutboundconfig.html#cfn-connectcampaignsv2-campaign-emailoutboundconfig-connectsourceemailaddress)
       */
      override fun connectSourceEmailAddress(): String = unwrap(this).getConnectSourceEmailAddress()

      /**
       * The display name for the Amazon Connect source email address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-emailoutboundconfig.html#cfn-connectcampaignsv2-campaign-emailoutboundconfig-sourceemailaddressdisplayname)
       */
      override fun sourceEmailAddressDisplayName(): String? =
          unwrap(this).getSourceEmailAddressDisplayName()

      /**
       * The Amazon Resource Name (ARN) of the Amazon Q in Connect template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-emailoutboundconfig.html#cfn-connectcampaignsv2-campaign-emailoutboundconfig-wisdomtemplatearn)
       */
      override fun wisdomTemplateArn(): String = unwrap(this).getWisdomTemplateArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EmailOutboundConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.EmailOutboundConfigProperty):
          EmailOutboundConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EmailOutboundConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EmailOutboundConfigProperty):
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.EmailOutboundConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.EmailOutboundConfigProperty
    }
  }

  /**
   * Contains information about email outbound mode.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaignsv2.*;
   * Object agentlessConfig;
   * EmailOutboundModeProperty emailOutboundModeProperty = EmailOutboundModeProperty.builder()
   * .agentlessConfig(agentlessConfig)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-emailoutboundmode.html)
   */
  public interface EmailOutboundModeProperty {
    /**
     * The agentless outbound mode configuration for email.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-emailoutboundmode.html#cfn-connectcampaignsv2-campaign-emailoutboundmode-agentlessconfig)
     */
    public fun agentlessConfig(): Any? = unwrap(this).getAgentlessConfig()

    /**
     * A builder for [EmailOutboundModeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param agentlessConfig The agentless outbound mode configuration for email.
       */
      public fun agentlessConfig(agentlessConfig: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.EmailOutboundModeProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.EmailOutboundModeProperty.builder()

      /**
       * @param agentlessConfig The agentless outbound mode configuration for email.
       */
      override fun agentlessConfig(agentlessConfig: Any) {
        cdkBuilder.agentlessConfig(agentlessConfig)
      }

      public fun build():
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.EmailOutboundModeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.EmailOutboundModeProperty,
    ) : CdkObject(cdkObject),
        EmailOutboundModeProperty {
      /**
       * The agentless outbound mode configuration for email.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-emailoutboundmode.html#cfn-connectcampaignsv2-campaign-emailoutboundmode-agentlessconfig)
       */
      override fun agentlessConfig(): Any? = unwrap(this).getAgentlessConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EmailOutboundModeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.EmailOutboundModeProperty):
          EmailOutboundModeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EmailOutboundModeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EmailOutboundModeProperty):
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.EmailOutboundModeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.EmailOutboundModeProperty
    }
  }

  /**
   * The configuration of timezone for recipient.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaignsv2.*;
   * LocalTimeZoneConfigProperty localTimeZoneConfigProperty = LocalTimeZoneConfigProperty.builder()
   * .defaultTimeZone("defaultTimeZone")
   * .localTimeZoneDetection(List.of("localTimeZoneDetection"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-localtimezoneconfig.html)
   */
  public interface LocalTimeZoneConfigProperty {
    /**
     * The timezone to use for all recipients.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-localtimezoneconfig.html#cfn-connectcampaignsv2-campaign-localtimezoneconfig-defaulttimezone)
     */
    public fun defaultTimeZone(): String? = unwrap(this).getDefaultTimeZone()

    /**
     * Detects methods for the recipient's timezone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-localtimezoneconfig.html#cfn-connectcampaignsv2-campaign-localtimezoneconfig-localtimezonedetection)
     */
    public fun localTimeZoneDetection(): List<String> = unwrap(this).getLocalTimeZoneDetection() ?:
        emptyList()

    /**
     * A builder for [LocalTimeZoneConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultTimeZone The timezone to use for all recipients.
       */
      public fun defaultTimeZone(defaultTimeZone: String)

      /**
       * @param localTimeZoneDetection Detects methods for the recipient's timezone.
       */
      public fun localTimeZoneDetection(localTimeZoneDetection: List<String>)

      /**
       * @param localTimeZoneDetection Detects methods for the recipient's timezone.
       */
      public fun localTimeZoneDetection(vararg localTimeZoneDetection: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.LocalTimeZoneConfigProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.LocalTimeZoneConfigProperty.builder()

      /**
       * @param defaultTimeZone The timezone to use for all recipients.
       */
      override fun defaultTimeZone(defaultTimeZone: String) {
        cdkBuilder.defaultTimeZone(defaultTimeZone)
      }

      /**
       * @param localTimeZoneDetection Detects methods for the recipient's timezone.
       */
      override fun localTimeZoneDetection(localTimeZoneDetection: List<String>) {
        cdkBuilder.localTimeZoneDetection(localTimeZoneDetection)
      }

      /**
       * @param localTimeZoneDetection Detects methods for the recipient's timezone.
       */
      override fun localTimeZoneDetection(vararg localTimeZoneDetection: String): Unit =
          localTimeZoneDetection(localTimeZoneDetection.toList())

      public fun build():
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.LocalTimeZoneConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.LocalTimeZoneConfigProperty,
    ) : CdkObject(cdkObject),
        LocalTimeZoneConfigProperty {
      /**
       * The timezone to use for all recipients.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-localtimezoneconfig.html#cfn-connectcampaignsv2-campaign-localtimezoneconfig-defaulttimezone)
       */
      override fun defaultTimeZone(): String? = unwrap(this).getDefaultTimeZone()

      /**
       * Detects methods for the recipient's timezone.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-localtimezoneconfig.html#cfn-connectcampaignsv2-campaign-localtimezoneconfig-localtimezonedetection)
       */
      override fun localTimeZoneDetection(): List<String> = unwrap(this).getLocalTimeZoneDetection()
          ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LocalTimeZoneConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.LocalTimeZoneConfigProperty):
          LocalTimeZoneConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LocalTimeZoneConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocalTimeZoneConfigProperty):
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.LocalTimeZoneConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.LocalTimeZoneConfigProperty
    }
  }

  /**
   * Contains information about open hours.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaignsv2.*;
   * OpenHoursProperty openHoursProperty = OpenHoursProperty.builder()
   * .dailyHours(List.of(DailyHourProperty.builder()
   * .key("key")
   * .value(List.of(TimeRangeProperty.builder()
   * .endTime("endTime")
   * .startTime("startTime")
   * .build()))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-openhours.html)
   */
  public interface OpenHoursProperty {
    /**
     * The daily hours configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-openhours.html#cfn-connectcampaignsv2-campaign-openhours-dailyhours)
     */
    public fun dailyHours(): Any

    /**
     * A builder for [OpenHoursProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dailyHours The daily hours configuration. 
       */
      public fun dailyHours(dailyHours: IResolvable)

      /**
       * @param dailyHours The daily hours configuration. 
       */
      public fun dailyHours(dailyHours: List<Any>)

      /**
       * @param dailyHours The daily hours configuration. 
       */
      public fun dailyHours(vararg dailyHours: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.OpenHoursProperty.Builder =
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.OpenHoursProperty.builder()

      /**
       * @param dailyHours The daily hours configuration. 
       */
      override fun dailyHours(dailyHours: IResolvable) {
        cdkBuilder.dailyHours(dailyHours.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dailyHours The daily hours configuration. 
       */
      override fun dailyHours(dailyHours: List<Any>) {
        cdkBuilder.dailyHours(dailyHours.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param dailyHours The daily hours configuration. 
       */
      override fun dailyHours(vararg dailyHours: Any): Unit = dailyHours(dailyHours.toList())

      public fun build():
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.OpenHoursProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.OpenHoursProperty,
    ) : CdkObject(cdkObject),
        OpenHoursProperty {
      /**
       * The daily hours configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-openhours.html#cfn-connectcampaignsv2-campaign-openhours-dailyhours)
       */
      override fun dailyHours(): Any = unwrap(this).getDailyHours()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OpenHoursProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.OpenHoursProperty):
          OpenHoursProperty = CdkObjectWrappers.wrap(cdkObject) as? OpenHoursProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenHoursProperty):
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.OpenHoursProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.OpenHoursProperty
    }
  }

  /**
   * Contains predictive outbound mode configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaignsv2.*;
   * PredictiveConfigProperty predictiveConfigProperty = PredictiveConfigProperty.builder()
   * .bandwidthAllocation(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-predictiveconfig.html)
   */
  public interface PredictiveConfigProperty {
    /**
     * Bandwidth allocation for the predictive outbound mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-predictiveconfig.html#cfn-connectcampaignsv2-campaign-predictiveconfig-bandwidthallocation)
     */
    public fun bandwidthAllocation(): Number

    /**
     * A builder for [PredictiveConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bandwidthAllocation Bandwidth allocation for the predictive outbound mode. 
       */
      public fun bandwidthAllocation(bandwidthAllocation: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.PredictiveConfigProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.PredictiveConfigProperty.builder()

      /**
       * @param bandwidthAllocation Bandwidth allocation for the predictive outbound mode. 
       */
      override fun bandwidthAllocation(bandwidthAllocation: Number) {
        cdkBuilder.bandwidthAllocation(bandwidthAllocation)
      }

      public fun build():
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.PredictiveConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.PredictiveConfigProperty,
    ) : CdkObject(cdkObject),
        PredictiveConfigProperty {
      /**
       * Bandwidth allocation for the predictive outbound mode.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-predictiveconfig.html#cfn-connectcampaignsv2-campaign-predictiveconfig-bandwidthallocation)
       */
      override fun bandwidthAllocation(): Number = unwrap(this).getBandwidthAllocation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PredictiveConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.PredictiveConfigProperty):
          PredictiveConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? PredictiveConfigProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredictiveConfigProperty):
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.PredictiveConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.PredictiveConfigProperty
    }
  }

  /**
   * Contains the progressive outbound mode configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaignsv2.*;
   * ProgressiveConfigProperty progressiveConfigProperty = ProgressiveConfigProperty.builder()
   * .bandwidthAllocation(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-progressiveconfig.html)
   */
  public interface ProgressiveConfigProperty {
    /**
     * Bandwidth allocation for the progressive outbound mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-progressiveconfig.html#cfn-connectcampaignsv2-campaign-progressiveconfig-bandwidthallocation)
     */
    public fun bandwidthAllocation(): Number

    /**
     * A builder for [ProgressiveConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bandwidthAllocation Bandwidth allocation for the progressive outbound mode. 
       */
      public fun bandwidthAllocation(bandwidthAllocation: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.ProgressiveConfigProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.ProgressiveConfigProperty.builder()

      /**
       * @param bandwidthAllocation Bandwidth allocation for the progressive outbound mode. 
       */
      override fun bandwidthAllocation(bandwidthAllocation: Number) {
        cdkBuilder.bandwidthAllocation(bandwidthAllocation)
      }

      public fun build():
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.ProgressiveConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.ProgressiveConfigProperty,
    ) : CdkObject(cdkObject),
        ProgressiveConfigProperty {
      /**
       * Bandwidth allocation for the progressive outbound mode.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-progressiveconfig.html#cfn-connectcampaignsv2-campaign-progressiveconfig-bandwidthallocation)
       */
      override fun bandwidthAllocation(): Number = unwrap(this).getBandwidthAllocation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProgressiveConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.ProgressiveConfigProperty):
          ProgressiveConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProgressiveConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProgressiveConfigProperty):
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.ProgressiveConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.ProgressiveConfigProperty
    }
  }

  /**
   * Contains information about a restricted period.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaignsv2.*;
   * RestrictedPeriodProperty restrictedPeriodProperty = RestrictedPeriodProperty.builder()
   * .endDate("endDate")
   * .startDate("startDate")
   * // the properties below are optional
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-restrictedperiod.html)
   */
  public interface RestrictedPeriodProperty {
    /**
     * The end date of the restricted period.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-restrictedperiod.html#cfn-connectcampaignsv2-campaign-restrictedperiod-enddate)
     */
    public fun endDate(): String

    /**
     * The name of the restricted period.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-restrictedperiod.html#cfn-connectcampaignsv2-campaign-restrictedperiod-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The start date of the restricted period.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-restrictedperiod.html#cfn-connectcampaignsv2-campaign-restrictedperiod-startdate)
     */
    public fun startDate(): String

    /**
     * A builder for [RestrictedPeriodProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endDate The end date of the restricted period. 
       */
      public fun endDate(endDate: String)

      /**
       * @param name The name of the restricted period.
       */
      public fun name(name: String)

      /**
       * @param startDate The start date of the restricted period. 
       */
      public fun startDate(startDate: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.RestrictedPeriodProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.RestrictedPeriodProperty.builder()

      /**
       * @param endDate The end date of the restricted period. 
       */
      override fun endDate(endDate: String) {
        cdkBuilder.endDate(endDate)
      }

      /**
       * @param name The name of the restricted period.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param startDate The start date of the restricted period. 
       */
      override fun startDate(startDate: String) {
        cdkBuilder.startDate(startDate)
      }

      public fun build():
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.RestrictedPeriodProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.RestrictedPeriodProperty,
    ) : CdkObject(cdkObject),
        RestrictedPeriodProperty {
      /**
       * The end date of the restricted period.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-restrictedperiod.html#cfn-connectcampaignsv2-campaign-restrictedperiod-enddate)
       */
      override fun endDate(): String = unwrap(this).getEndDate()

      /**
       * The name of the restricted period.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-restrictedperiod.html#cfn-connectcampaignsv2-campaign-restrictedperiod-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The start date of the restricted period.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-restrictedperiod.html#cfn-connectcampaignsv2-campaign-restrictedperiod-startdate)
       */
      override fun startDate(): String = unwrap(this).getStartDate()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RestrictedPeriodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.RestrictedPeriodProperty):
          RestrictedPeriodProperty = CdkObjectWrappers.wrap(cdkObject) as? RestrictedPeriodProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RestrictedPeriodProperty):
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.RestrictedPeriodProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.RestrictedPeriodProperty
    }
  }

  /**
   * Contains information about restricted periods.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaignsv2.*;
   * RestrictedPeriodsProperty restrictedPeriodsProperty = RestrictedPeriodsProperty.builder()
   * .restrictedPeriodList(List.of(RestrictedPeriodProperty.builder()
   * .endDate("endDate")
   * .startDate("startDate")
   * // the properties below are optional
   * .name("name")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-restrictedperiods.html)
   */
  public interface RestrictedPeriodsProperty {
    /**
     * The restricted period list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-restrictedperiods.html#cfn-connectcampaignsv2-campaign-restrictedperiods-restrictedperiodlist)
     */
    public fun restrictedPeriodList(): Any

    /**
     * A builder for [RestrictedPeriodsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param restrictedPeriodList The restricted period list. 
       */
      public fun restrictedPeriodList(restrictedPeriodList: IResolvable)

      /**
       * @param restrictedPeriodList The restricted period list. 
       */
      public fun restrictedPeriodList(restrictedPeriodList: List<Any>)

      /**
       * @param restrictedPeriodList The restricted period list. 
       */
      public fun restrictedPeriodList(vararg restrictedPeriodList: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.RestrictedPeriodsProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.RestrictedPeriodsProperty.builder()

      /**
       * @param restrictedPeriodList The restricted period list. 
       */
      override fun restrictedPeriodList(restrictedPeriodList: IResolvable) {
        cdkBuilder.restrictedPeriodList(restrictedPeriodList.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param restrictedPeriodList The restricted period list. 
       */
      override fun restrictedPeriodList(restrictedPeriodList: List<Any>) {
        cdkBuilder.restrictedPeriodList(restrictedPeriodList.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param restrictedPeriodList The restricted period list. 
       */
      override fun restrictedPeriodList(vararg restrictedPeriodList: Any): Unit =
          restrictedPeriodList(restrictedPeriodList.toList())

      public fun build():
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.RestrictedPeriodsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.RestrictedPeriodsProperty,
    ) : CdkObject(cdkObject),
        RestrictedPeriodsProperty {
      /**
       * The restricted period list.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-restrictedperiods.html#cfn-connectcampaignsv2-campaign-restrictedperiods-restrictedperiodlist)
       */
      override fun restrictedPeriodList(): Any = unwrap(this).getRestrictedPeriodList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RestrictedPeriodsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.RestrictedPeriodsProperty):
          RestrictedPeriodsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RestrictedPeriodsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RestrictedPeriodsProperty):
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.RestrictedPeriodsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.RestrictedPeriodsProperty
    }
  }

  /**
   * Contains the schedule configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaignsv2.*;
   * ScheduleProperty scheduleProperty = ScheduleProperty.builder()
   * .endTime("endTime")
   * .startTime("startTime")
   * // the properties below are optional
   * .refreshFrequency("refreshFrequency")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-schedule.html)
   */
  public interface ScheduleProperty {
    /**
     * The end time of the schedule in UTC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-schedule.html#cfn-connectcampaignsv2-campaign-schedule-endtime)
     */
    public fun endTime(): String

    /**
     * The refresh frequency of the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-schedule.html#cfn-connectcampaignsv2-campaign-schedule-refreshfrequency)
     */
    public fun refreshFrequency(): String? = unwrap(this).getRefreshFrequency()

    /**
     * The start time of the schedule in UTC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-schedule.html#cfn-connectcampaignsv2-campaign-schedule-starttime)
     */
    public fun startTime(): String

    /**
     * A builder for [ScheduleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endTime The end time of the schedule in UTC. 
       */
      public fun endTime(endTime: String)

      /**
       * @param refreshFrequency The refresh frequency of the campaign.
       */
      public fun refreshFrequency(refreshFrequency: String)

      /**
       * @param startTime The start time of the schedule in UTC. 
       */
      public fun startTime(startTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.ScheduleProperty.Builder =
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.ScheduleProperty.builder()

      /**
       * @param endTime The end time of the schedule in UTC. 
       */
      override fun endTime(endTime: String) {
        cdkBuilder.endTime(endTime)
      }

      /**
       * @param refreshFrequency The refresh frequency of the campaign.
       */
      override fun refreshFrequency(refreshFrequency: String) {
        cdkBuilder.refreshFrequency(refreshFrequency)
      }

      /**
       * @param startTime The start time of the schedule in UTC. 
       */
      override fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
      }

      public fun build():
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.ScheduleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.ScheduleProperty,
    ) : CdkObject(cdkObject),
        ScheduleProperty {
      /**
       * The end time of the schedule in UTC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-schedule.html#cfn-connectcampaignsv2-campaign-schedule-endtime)
       */
      override fun endTime(): String = unwrap(this).getEndTime()

      /**
       * The refresh frequency of the campaign.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-schedule.html#cfn-connectcampaignsv2-campaign-schedule-refreshfrequency)
       */
      override fun refreshFrequency(): String? = unwrap(this).getRefreshFrequency()

      /**
       * The start time of the schedule in UTC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-schedule.html#cfn-connectcampaignsv2-campaign-schedule-starttime)
       */
      override fun startTime(): String = unwrap(this).getStartTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.ScheduleProperty):
          ScheduleProperty = CdkObjectWrappers.wrap(cdkObject) as? ScheduleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduleProperty):
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.ScheduleProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.ScheduleProperty
    }
  }

  /**
   * The configuration for the SMS channel subtype.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaignsv2.*;
   * Object agentlessConfig;
   * SmsChannelSubtypeConfigProperty smsChannelSubtypeConfigProperty =
   * SmsChannelSubtypeConfigProperty.builder()
   * .defaultOutboundConfig(SmsOutboundConfigProperty.builder()
   * .connectSourcePhoneNumberArn("connectSourcePhoneNumberArn")
   * .wisdomTemplateArn("wisdomTemplateArn")
   * .build())
   * .outboundMode(SmsOutboundModeProperty.builder()
   * .agentlessConfig(agentlessConfig)
   * .build())
   * // the properties below are optional
   * .capacity(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-smschannelsubtypeconfig.html)
   */
  public interface SmsChannelSubtypeConfigProperty {
    /**
     * The allocation of SMS capacity between multiple running outbound campaigns.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-smschannelsubtypeconfig.html#cfn-connectcampaignsv2-campaign-smschannelsubtypeconfig-capacity)
     */
    public fun capacity(): Number? = unwrap(this).getCapacity()

    /**
     * The default SMS outbound configuration of an outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-smschannelsubtypeconfig.html#cfn-connectcampaignsv2-campaign-smschannelsubtypeconfig-defaultoutboundconfig)
     */
    public fun defaultOutboundConfig(): Any

    /**
     * The outbound mode of SMS for an outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-smschannelsubtypeconfig.html#cfn-connectcampaignsv2-campaign-smschannelsubtypeconfig-outboundmode)
     */
    public fun outboundMode(): Any

    /**
     * A builder for [SmsChannelSubtypeConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param capacity The allocation of SMS capacity between multiple running outbound campaigns.
       */
      public fun capacity(capacity: Number)

      /**
       * @param defaultOutboundConfig The default SMS outbound configuration of an outbound
       * campaign. 
       */
      public fun defaultOutboundConfig(defaultOutboundConfig: IResolvable)

      /**
       * @param defaultOutboundConfig The default SMS outbound configuration of an outbound
       * campaign. 
       */
      public fun defaultOutboundConfig(defaultOutboundConfig: SmsOutboundConfigProperty)

      /**
       * @param defaultOutboundConfig The default SMS outbound configuration of an outbound
       * campaign. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("750f9d8234425366b7c7e62238656e49ff3c923cb676677f836b335cb37f9cd7")
      public
          fun defaultOutboundConfig(defaultOutboundConfig: SmsOutboundConfigProperty.Builder.() -> Unit)

      /**
       * @param outboundMode The outbound mode of SMS for an outbound campaign. 
       */
      public fun outboundMode(outboundMode: IResolvable)

      /**
       * @param outboundMode The outbound mode of SMS for an outbound campaign. 
       */
      public fun outboundMode(outboundMode: SmsOutboundModeProperty)

      /**
       * @param outboundMode The outbound mode of SMS for an outbound campaign. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0e377d407ecd30d3b43e90719d0cd1285c2ba0c784d6b86557beb1958251965c")
      public fun outboundMode(outboundMode: SmsOutboundModeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.SmsChannelSubtypeConfigProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.SmsChannelSubtypeConfigProperty.builder()

      /**
       * @param capacity The allocation of SMS capacity between multiple running outbound campaigns.
       */
      override fun capacity(capacity: Number) {
        cdkBuilder.capacity(capacity)
      }

      /**
       * @param defaultOutboundConfig The default SMS outbound configuration of an outbound
       * campaign. 
       */
      override fun defaultOutboundConfig(defaultOutboundConfig: IResolvable) {
        cdkBuilder.defaultOutboundConfig(defaultOutboundConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param defaultOutboundConfig The default SMS outbound configuration of an outbound
       * campaign. 
       */
      override fun defaultOutboundConfig(defaultOutboundConfig: SmsOutboundConfigProperty) {
        cdkBuilder.defaultOutboundConfig(defaultOutboundConfig.let(SmsOutboundConfigProperty.Companion::unwrap))
      }

      /**
       * @param defaultOutboundConfig The default SMS outbound configuration of an outbound
       * campaign. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("750f9d8234425366b7c7e62238656e49ff3c923cb676677f836b335cb37f9cd7")
      override
          fun defaultOutboundConfig(defaultOutboundConfig: SmsOutboundConfigProperty.Builder.() -> Unit):
          Unit = defaultOutboundConfig(SmsOutboundConfigProperty(defaultOutboundConfig))

      /**
       * @param outboundMode The outbound mode of SMS for an outbound campaign. 
       */
      override fun outboundMode(outboundMode: IResolvable) {
        cdkBuilder.outboundMode(outboundMode.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param outboundMode The outbound mode of SMS for an outbound campaign. 
       */
      override fun outboundMode(outboundMode: SmsOutboundModeProperty) {
        cdkBuilder.outboundMode(outboundMode.let(SmsOutboundModeProperty.Companion::unwrap))
      }

      /**
       * @param outboundMode The outbound mode of SMS for an outbound campaign. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0e377d407ecd30d3b43e90719d0cd1285c2ba0c784d6b86557beb1958251965c")
      override fun outboundMode(outboundMode: SmsOutboundModeProperty.Builder.() -> Unit): Unit =
          outboundMode(SmsOutboundModeProperty(outboundMode))

      public fun build():
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.SmsChannelSubtypeConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.SmsChannelSubtypeConfigProperty,
    ) : CdkObject(cdkObject),
        SmsChannelSubtypeConfigProperty {
      /**
       * The allocation of SMS capacity between multiple running outbound campaigns.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-smschannelsubtypeconfig.html#cfn-connectcampaignsv2-campaign-smschannelsubtypeconfig-capacity)
       */
      override fun capacity(): Number? = unwrap(this).getCapacity()

      /**
       * The default SMS outbound configuration of an outbound campaign.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-smschannelsubtypeconfig.html#cfn-connectcampaignsv2-campaign-smschannelsubtypeconfig-defaultoutboundconfig)
       */
      override fun defaultOutboundConfig(): Any = unwrap(this).getDefaultOutboundConfig()

      /**
       * The outbound mode of SMS for an outbound campaign.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-smschannelsubtypeconfig.html#cfn-connectcampaignsv2-campaign-smschannelsubtypeconfig-outboundmode)
       */
      override fun outboundMode(): Any = unwrap(this).getOutboundMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SmsChannelSubtypeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.SmsChannelSubtypeConfigProperty):
          SmsChannelSubtypeConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SmsChannelSubtypeConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SmsChannelSubtypeConfigProperty):
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.SmsChannelSubtypeConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.SmsChannelSubtypeConfigProperty
    }
  }

  /**
   * The outbound configuration for SMS.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaignsv2.*;
   * SmsOutboundConfigProperty smsOutboundConfigProperty = SmsOutboundConfigProperty.builder()
   * .connectSourcePhoneNumberArn("connectSourcePhoneNumberArn")
   * .wisdomTemplateArn("wisdomTemplateArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-smsoutboundconfig.html)
   */
  public interface SmsOutboundConfigProperty {
    /**
     * The Amazon Resource Name (ARN) of the Amazon Connect source SMS phone number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-smsoutboundconfig.html#cfn-connectcampaignsv2-campaign-smsoutboundconfig-connectsourcephonenumberarn)
     */
    public fun connectSourcePhoneNumberArn(): String

    /**
     * The Amazon Resource Name (ARN) of the Amazon Q in Connect template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-smsoutboundconfig.html#cfn-connectcampaignsv2-campaign-smsoutboundconfig-wisdomtemplatearn)
     */
    public fun wisdomTemplateArn(): String

    /**
     * A builder for [SmsOutboundConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connectSourcePhoneNumberArn The Amazon Resource Name (ARN) of the Amazon Connect
       * source SMS phone number. 
       */
      public fun connectSourcePhoneNumberArn(connectSourcePhoneNumberArn: String)

      /**
       * @param wisdomTemplateArn The Amazon Resource Name (ARN) of the Amazon Q in Connect
       * template. 
       */
      public fun wisdomTemplateArn(wisdomTemplateArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.SmsOutboundConfigProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.SmsOutboundConfigProperty.builder()

      /**
       * @param connectSourcePhoneNumberArn The Amazon Resource Name (ARN) of the Amazon Connect
       * source SMS phone number. 
       */
      override fun connectSourcePhoneNumberArn(connectSourcePhoneNumberArn: String) {
        cdkBuilder.connectSourcePhoneNumberArn(connectSourcePhoneNumberArn)
      }

      /**
       * @param wisdomTemplateArn The Amazon Resource Name (ARN) of the Amazon Q in Connect
       * template. 
       */
      override fun wisdomTemplateArn(wisdomTemplateArn: String) {
        cdkBuilder.wisdomTemplateArn(wisdomTemplateArn)
      }

      public fun build():
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.SmsOutboundConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.SmsOutboundConfigProperty,
    ) : CdkObject(cdkObject),
        SmsOutboundConfigProperty {
      /**
       * The Amazon Resource Name (ARN) of the Amazon Connect source SMS phone number.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-smsoutboundconfig.html#cfn-connectcampaignsv2-campaign-smsoutboundconfig-connectsourcephonenumberarn)
       */
      override fun connectSourcePhoneNumberArn(): String =
          unwrap(this).getConnectSourcePhoneNumberArn()

      /**
       * The Amazon Resource Name (ARN) of the Amazon Q in Connect template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-smsoutboundconfig.html#cfn-connectcampaignsv2-campaign-smsoutboundconfig-wisdomtemplatearn)
       */
      override fun wisdomTemplateArn(): String = unwrap(this).getWisdomTemplateArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SmsOutboundConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.SmsOutboundConfigProperty):
          SmsOutboundConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SmsOutboundConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SmsOutboundConfigProperty):
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.SmsOutboundConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.SmsOutboundConfigProperty
    }
  }

  /**
   * Contains information about the SMS outbound mode.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaignsv2.*;
   * Object agentlessConfig;
   * SmsOutboundModeProperty smsOutboundModeProperty = SmsOutboundModeProperty.builder()
   * .agentlessConfig(agentlessConfig)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-smsoutboundmode.html)
   */
  public interface SmsOutboundModeProperty {
    /**
     * Contains agentless outbound mode configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-smsoutboundmode.html#cfn-connectcampaignsv2-campaign-smsoutboundmode-agentlessconfig)
     */
    public fun agentlessConfig(): Any? = unwrap(this).getAgentlessConfig()

    /**
     * A builder for [SmsOutboundModeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param agentlessConfig Contains agentless outbound mode configuration.
       */
      public fun agentlessConfig(agentlessConfig: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.SmsOutboundModeProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.SmsOutboundModeProperty.builder()

      /**
       * @param agentlessConfig Contains agentless outbound mode configuration.
       */
      override fun agentlessConfig(agentlessConfig: Any) {
        cdkBuilder.agentlessConfig(agentlessConfig)
      }

      public fun build():
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.SmsOutboundModeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.SmsOutboundModeProperty,
    ) : CdkObject(cdkObject),
        SmsOutboundModeProperty {
      /**
       * Contains agentless outbound mode configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-smsoutboundmode.html#cfn-connectcampaignsv2-campaign-smsoutboundmode-agentlessconfig)
       */
      override fun agentlessConfig(): Any? = unwrap(this).getAgentlessConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SmsOutboundModeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.SmsOutboundModeProperty):
          SmsOutboundModeProperty = CdkObjectWrappers.wrap(cdkObject) as? SmsOutboundModeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SmsOutboundModeProperty):
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.SmsOutboundModeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.SmsOutboundModeProperty
    }
  }

  /**
   * Contains source configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaignsv2.*;
   * SourceProperty sourceProperty = SourceProperty.builder()
   * .customerProfilesSegmentArn("customerProfilesSegmentArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-source.html)
   */
  public interface SourceProperty {
    /**
     * The Amazon Resource Name (ARN) of the Customer Profiles segment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-source.html#cfn-connectcampaignsv2-campaign-source-customerprofilessegmentarn)
     */
    public fun customerProfilesSegmentArn(): String

    /**
     * A builder for [SourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customerProfilesSegmentArn The Amazon Resource Name (ARN) of the Customer Profiles
       * segment. 
       */
      public fun customerProfilesSegmentArn(customerProfilesSegmentArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.SourceProperty.Builder =
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.SourceProperty.builder()

      /**
       * @param customerProfilesSegmentArn The Amazon Resource Name (ARN) of the Customer Profiles
       * segment. 
       */
      override fun customerProfilesSegmentArn(customerProfilesSegmentArn: String) {
        cdkBuilder.customerProfilesSegmentArn(customerProfilesSegmentArn)
      }

      public fun build():
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.SourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.SourceProperty,
    ) : CdkObject(cdkObject),
        SourceProperty {
      /**
       * The Amazon Resource Name (ARN) of the Customer Profiles segment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-source.html#cfn-connectcampaignsv2-campaign-source-customerprofilessegmentarn)
       */
      override fun customerProfilesSegmentArn(): String =
          unwrap(this).getCustomerProfilesSegmentArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.SourceProperty):
          SourceProperty = CdkObjectWrappers.wrap(cdkObject) as? SourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceProperty):
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.SourceProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.SourceProperty
    }
  }

  /**
   * The configuration for the telephony channel subtype.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaignsv2.*;
   * Object agentlessConfig;
   * TelephonyChannelSubtypeConfigProperty telephonyChannelSubtypeConfigProperty =
   * TelephonyChannelSubtypeConfigProperty.builder()
   * .defaultOutboundConfig(TelephonyOutboundConfigProperty.builder()
   * .connectContactFlowId("connectContactFlowId")
   * // the properties below are optional
   * .answerMachineDetectionConfig(AnswerMachineDetectionConfigProperty.builder()
   * .enableAnswerMachineDetection(false)
   * // the properties below are optional
   * .awaitAnswerMachinePrompt(false)
   * .build())
   * .connectSourcePhoneNumber("connectSourcePhoneNumber")
   * .build())
   * .outboundMode(TelephonyOutboundModeProperty.builder()
   * .agentlessConfig(agentlessConfig)
   * .predictiveConfig(PredictiveConfigProperty.builder()
   * .bandwidthAllocation(123)
   * .build())
   * .progressiveConfig(ProgressiveConfigProperty.builder()
   * .bandwidthAllocation(123)
   * .build())
   * .build())
   * // the properties below are optional
   * .capacity(123)
   * .connectQueueId("connectQueueId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-telephonychannelsubtypeconfig.html)
   */
  public interface TelephonyChannelSubtypeConfigProperty {
    /**
     * The allocation of telephony capacity between multiple running outbound campaigns.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-telephonychannelsubtypeconfig.html#cfn-connectcampaignsv2-campaign-telephonychannelsubtypeconfig-capacity)
     */
    public fun capacity(): Number? = unwrap(this).getCapacity()

    /**
     * The identifier of the Amazon Connect queue associated with telephony outbound requests of an
     * outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-telephonychannelsubtypeconfig.html#cfn-connectcampaignsv2-campaign-telephonychannelsubtypeconfig-connectqueueid)
     */
    public fun connectQueueId(): String? = unwrap(this).getConnectQueueId()

    /**
     * The default telephony outbound configuration of an outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-telephonychannelsubtypeconfig.html#cfn-connectcampaignsv2-campaign-telephonychannelsubtypeconfig-defaultoutboundconfig)
     */
    public fun defaultOutboundConfig(): Any

    /**
     * The outbound mode of telephony for an outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-telephonychannelsubtypeconfig.html#cfn-connectcampaignsv2-campaign-telephonychannelsubtypeconfig-outboundmode)
     */
    public fun outboundMode(): Any

    /**
     * A builder for [TelephonyChannelSubtypeConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param capacity The allocation of telephony capacity between multiple running outbound
       * campaigns.
       */
      public fun capacity(capacity: Number)

      /**
       * @param connectQueueId The identifier of the Amazon Connect queue associated with telephony
       * outbound requests of an outbound campaign.
       */
      public fun connectQueueId(connectQueueId: String)

      /**
       * @param defaultOutboundConfig The default telephony outbound configuration of an outbound
       * campaign. 
       */
      public fun defaultOutboundConfig(defaultOutboundConfig: IResolvable)

      /**
       * @param defaultOutboundConfig The default telephony outbound configuration of an outbound
       * campaign. 
       */
      public fun defaultOutboundConfig(defaultOutboundConfig: TelephonyOutboundConfigProperty)

      /**
       * @param defaultOutboundConfig The default telephony outbound configuration of an outbound
       * campaign. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fce2d1dac4cab0831d8d9fc377ff5e9d9607695225d833654a4360bcd683ba5b")
      public
          fun defaultOutboundConfig(defaultOutboundConfig: TelephonyOutboundConfigProperty.Builder.() -> Unit)

      /**
       * @param outboundMode The outbound mode of telephony for an outbound campaign. 
       */
      public fun outboundMode(outboundMode: IResolvable)

      /**
       * @param outboundMode The outbound mode of telephony for an outbound campaign. 
       */
      public fun outboundMode(outboundMode: TelephonyOutboundModeProperty)

      /**
       * @param outboundMode The outbound mode of telephony for an outbound campaign. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c8675fdb0a62555a894ffec686fbb529ecc500650ec9c3a9ae3cbb94f0c450ed")
      public fun outboundMode(outboundMode: TelephonyOutboundModeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TelephonyChannelSubtypeConfigProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TelephonyChannelSubtypeConfigProperty.builder()

      /**
       * @param capacity The allocation of telephony capacity between multiple running outbound
       * campaigns.
       */
      override fun capacity(capacity: Number) {
        cdkBuilder.capacity(capacity)
      }

      /**
       * @param connectQueueId The identifier of the Amazon Connect queue associated with telephony
       * outbound requests of an outbound campaign.
       */
      override fun connectQueueId(connectQueueId: String) {
        cdkBuilder.connectQueueId(connectQueueId)
      }

      /**
       * @param defaultOutboundConfig The default telephony outbound configuration of an outbound
       * campaign. 
       */
      override fun defaultOutboundConfig(defaultOutboundConfig: IResolvable) {
        cdkBuilder.defaultOutboundConfig(defaultOutboundConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param defaultOutboundConfig The default telephony outbound configuration of an outbound
       * campaign. 
       */
      override fun defaultOutboundConfig(defaultOutboundConfig: TelephonyOutboundConfigProperty) {
        cdkBuilder.defaultOutboundConfig(defaultOutboundConfig.let(TelephonyOutboundConfigProperty.Companion::unwrap))
      }

      /**
       * @param defaultOutboundConfig The default telephony outbound configuration of an outbound
       * campaign. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fce2d1dac4cab0831d8d9fc377ff5e9d9607695225d833654a4360bcd683ba5b")
      override
          fun defaultOutboundConfig(defaultOutboundConfig: TelephonyOutboundConfigProperty.Builder.() -> Unit):
          Unit = defaultOutboundConfig(TelephonyOutboundConfigProperty(defaultOutboundConfig))

      /**
       * @param outboundMode The outbound mode of telephony for an outbound campaign. 
       */
      override fun outboundMode(outboundMode: IResolvable) {
        cdkBuilder.outboundMode(outboundMode.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param outboundMode The outbound mode of telephony for an outbound campaign. 
       */
      override fun outboundMode(outboundMode: TelephonyOutboundModeProperty) {
        cdkBuilder.outboundMode(outboundMode.let(TelephonyOutboundModeProperty.Companion::unwrap))
      }

      /**
       * @param outboundMode The outbound mode of telephony for an outbound campaign. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c8675fdb0a62555a894ffec686fbb529ecc500650ec9c3a9ae3cbb94f0c450ed")
      override fun outboundMode(outboundMode: TelephonyOutboundModeProperty.Builder.() -> Unit):
          Unit = outboundMode(TelephonyOutboundModeProperty(outboundMode))

      public fun build():
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TelephonyChannelSubtypeConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TelephonyChannelSubtypeConfigProperty,
    ) : CdkObject(cdkObject),
        TelephonyChannelSubtypeConfigProperty {
      /**
       * The allocation of telephony capacity between multiple running outbound campaigns.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-telephonychannelsubtypeconfig.html#cfn-connectcampaignsv2-campaign-telephonychannelsubtypeconfig-capacity)
       */
      override fun capacity(): Number? = unwrap(this).getCapacity()

      /**
       * The identifier of the Amazon Connect queue associated with telephony outbound requests of
       * an outbound campaign.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-telephonychannelsubtypeconfig.html#cfn-connectcampaignsv2-campaign-telephonychannelsubtypeconfig-connectqueueid)
       */
      override fun connectQueueId(): String? = unwrap(this).getConnectQueueId()

      /**
       * The default telephony outbound configuration of an outbound campaign.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-telephonychannelsubtypeconfig.html#cfn-connectcampaignsv2-campaign-telephonychannelsubtypeconfig-defaultoutboundconfig)
       */
      override fun defaultOutboundConfig(): Any = unwrap(this).getDefaultOutboundConfig()

      /**
       * The outbound mode of telephony for an outbound campaign.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-telephonychannelsubtypeconfig.html#cfn-connectcampaignsv2-campaign-telephonychannelsubtypeconfig-outboundmode)
       */
      override fun outboundMode(): Any = unwrap(this).getOutboundMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TelephonyChannelSubtypeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TelephonyChannelSubtypeConfigProperty):
          TelephonyChannelSubtypeConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TelephonyChannelSubtypeConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TelephonyChannelSubtypeConfigProperty):
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TelephonyChannelSubtypeConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TelephonyChannelSubtypeConfigProperty
    }
  }

  /**
   * The outbound configuration for telephony.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaignsv2.*;
   * TelephonyOutboundConfigProperty telephonyOutboundConfigProperty =
   * TelephonyOutboundConfigProperty.builder()
   * .connectContactFlowId("connectContactFlowId")
   * // the properties below are optional
   * .answerMachineDetectionConfig(AnswerMachineDetectionConfigProperty.builder()
   * .enableAnswerMachineDetection(false)
   * // the properties below are optional
   * .awaitAnswerMachinePrompt(false)
   * .build())
   * .connectSourcePhoneNumber("connectSourcePhoneNumber")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-telephonyoutboundconfig.html)
   */
  public interface TelephonyOutboundConfigProperty {
    /**
     * The answering machine detection configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-telephonyoutboundconfig.html#cfn-connectcampaignsv2-campaign-telephonyoutboundconfig-answermachinedetectionconfig)
     */
    public fun answerMachineDetectionConfig(): Any? = unwrap(this).getAnswerMachineDetectionConfig()

    /**
     * The identifier of the published Amazon Connect contact flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-telephonyoutboundconfig.html#cfn-connectcampaignsv2-campaign-telephonyoutboundconfig-connectcontactflowid)
     */
    public fun connectContactFlowId(): String

    /**
     * The Amazon Connect source phone number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-telephonyoutboundconfig.html#cfn-connectcampaignsv2-campaign-telephonyoutboundconfig-connectsourcephonenumber)
     */
    public fun connectSourcePhoneNumber(): String? = unwrap(this).getConnectSourcePhoneNumber()

    /**
     * A builder for [TelephonyOutboundConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param answerMachineDetectionConfig The answering machine detection configuration.
       */
      public fun answerMachineDetectionConfig(answerMachineDetectionConfig: IResolvable)

      /**
       * @param answerMachineDetectionConfig The answering machine detection configuration.
       */
      public
          fun answerMachineDetectionConfig(answerMachineDetectionConfig: AnswerMachineDetectionConfigProperty)

      /**
       * @param answerMachineDetectionConfig The answering machine detection configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("20df6b12f6459e7a311887632801e190a9f30f4b3c2b4a4f6901ad0b456ff742")
      public
          fun answerMachineDetectionConfig(answerMachineDetectionConfig: AnswerMachineDetectionConfigProperty.Builder.() -> Unit)

      /**
       * @param connectContactFlowId The identifier of the published Amazon Connect contact flow. 
       */
      public fun connectContactFlowId(connectContactFlowId: String)

      /**
       * @param connectSourcePhoneNumber The Amazon Connect source phone number.
       */
      public fun connectSourcePhoneNumber(connectSourcePhoneNumber: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TelephonyOutboundConfigProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TelephonyOutboundConfigProperty.builder()

      /**
       * @param answerMachineDetectionConfig The answering machine detection configuration.
       */
      override fun answerMachineDetectionConfig(answerMachineDetectionConfig: IResolvable) {
        cdkBuilder.answerMachineDetectionConfig(answerMachineDetectionConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param answerMachineDetectionConfig The answering machine detection configuration.
       */
      override
          fun answerMachineDetectionConfig(answerMachineDetectionConfig: AnswerMachineDetectionConfigProperty) {
        cdkBuilder.answerMachineDetectionConfig(answerMachineDetectionConfig.let(AnswerMachineDetectionConfigProperty.Companion::unwrap))
      }

      /**
       * @param answerMachineDetectionConfig The answering machine detection configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("20df6b12f6459e7a311887632801e190a9f30f4b3c2b4a4f6901ad0b456ff742")
      override
          fun answerMachineDetectionConfig(answerMachineDetectionConfig: AnswerMachineDetectionConfigProperty.Builder.() -> Unit):
          Unit =
          answerMachineDetectionConfig(AnswerMachineDetectionConfigProperty(answerMachineDetectionConfig))

      /**
       * @param connectContactFlowId The identifier of the published Amazon Connect contact flow. 
       */
      override fun connectContactFlowId(connectContactFlowId: String) {
        cdkBuilder.connectContactFlowId(connectContactFlowId)
      }

      /**
       * @param connectSourcePhoneNumber The Amazon Connect source phone number.
       */
      override fun connectSourcePhoneNumber(connectSourcePhoneNumber: String) {
        cdkBuilder.connectSourcePhoneNumber(connectSourcePhoneNumber)
      }

      public fun build():
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TelephonyOutboundConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TelephonyOutboundConfigProperty,
    ) : CdkObject(cdkObject),
        TelephonyOutboundConfigProperty {
      /**
       * The answering machine detection configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-telephonyoutboundconfig.html#cfn-connectcampaignsv2-campaign-telephonyoutboundconfig-answermachinedetectionconfig)
       */
      override fun answerMachineDetectionConfig(): Any? =
          unwrap(this).getAnswerMachineDetectionConfig()

      /**
       * The identifier of the published Amazon Connect contact flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-telephonyoutboundconfig.html#cfn-connectcampaignsv2-campaign-telephonyoutboundconfig-connectcontactflowid)
       */
      override fun connectContactFlowId(): String = unwrap(this).getConnectContactFlowId()

      /**
       * The Amazon Connect source phone number.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-telephonyoutboundconfig.html#cfn-connectcampaignsv2-campaign-telephonyoutboundconfig-connectsourcephonenumber)
       */
      override fun connectSourcePhoneNumber(): String? = unwrap(this).getConnectSourcePhoneNumber()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TelephonyOutboundConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TelephonyOutboundConfigProperty):
          TelephonyOutboundConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TelephonyOutboundConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TelephonyOutboundConfigProperty):
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TelephonyOutboundConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TelephonyOutboundConfigProperty
    }
  }

  /**
   * Contains information about telephony outbound mode.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaignsv2.*;
   * Object agentlessConfig;
   * TelephonyOutboundModeProperty telephonyOutboundModeProperty =
   * TelephonyOutboundModeProperty.builder()
   * .agentlessConfig(agentlessConfig)
   * .predictiveConfig(PredictiveConfigProperty.builder()
   * .bandwidthAllocation(123)
   * .build())
   * .progressiveConfig(ProgressiveConfigProperty.builder()
   * .bandwidthAllocation(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-telephonyoutboundmode.html)
   */
  public interface TelephonyOutboundModeProperty {
    /**
     * The agentless outbound mode configuration for telephony.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-telephonyoutboundmode.html#cfn-connectcampaignsv2-campaign-telephonyoutboundmode-agentlessconfig)
     */
    public fun agentlessConfig(): Any? = unwrap(this).getAgentlessConfig()

    /**
     * Contains predictive outbound mode configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-telephonyoutboundmode.html#cfn-connectcampaignsv2-campaign-telephonyoutboundmode-predictiveconfig)
     */
    public fun predictiveConfig(): Any? = unwrap(this).getPredictiveConfig()

    /**
     * Contains progressive telephony outbound mode configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-telephonyoutboundmode.html#cfn-connectcampaignsv2-campaign-telephonyoutboundmode-progressiveconfig)
     */
    public fun progressiveConfig(): Any? = unwrap(this).getProgressiveConfig()

    /**
     * A builder for [TelephonyOutboundModeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param agentlessConfig The agentless outbound mode configuration for telephony.
       */
      public fun agentlessConfig(agentlessConfig: Any)

      /**
       * @param predictiveConfig Contains predictive outbound mode configuration.
       */
      public fun predictiveConfig(predictiveConfig: IResolvable)

      /**
       * @param predictiveConfig Contains predictive outbound mode configuration.
       */
      public fun predictiveConfig(predictiveConfig: PredictiveConfigProperty)

      /**
       * @param predictiveConfig Contains predictive outbound mode configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2955f0dccd1f31bdb3b493be3074090012a4ad400686ecdf69abd15067558f9a")
      public fun predictiveConfig(predictiveConfig: PredictiveConfigProperty.Builder.() -> Unit)

      /**
       * @param progressiveConfig Contains progressive telephony outbound mode configuration.
       */
      public fun progressiveConfig(progressiveConfig: IResolvable)

      /**
       * @param progressiveConfig Contains progressive telephony outbound mode configuration.
       */
      public fun progressiveConfig(progressiveConfig: ProgressiveConfigProperty)

      /**
       * @param progressiveConfig Contains progressive telephony outbound mode configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad93b5c02f1433a230b35914ac0e7d18a2b0780073a2c07b3067d477592c382e")
      public fun progressiveConfig(progressiveConfig: ProgressiveConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TelephonyOutboundModeProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TelephonyOutboundModeProperty.builder()

      /**
       * @param agentlessConfig The agentless outbound mode configuration for telephony.
       */
      override fun agentlessConfig(agentlessConfig: Any) {
        cdkBuilder.agentlessConfig(agentlessConfig)
      }

      /**
       * @param predictiveConfig Contains predictive outbound mode configuration.
       */
      override fun predictiveConfig(predictiveConfig: IResolvable) {
        cdkBuilder.predictiveConfig(predictiveConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param predictiveConfig Contains predictive outbound mode configuration.
       */
      override fun predictiveConfig(predictiveConfig: PredictiveConfigProperty) {
        cdkBuilder.predictiveConfig(predictiveConfig.let(PredictiveConfigProperty.Companion::unwrap))
      }

      /**
       * @param predictiveConfig Contains predictive outbound mode configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2955f0dccd1f31bdb3b493be3074090012a4ad400686ecdf69abd15067558f9a")
      override fun predictiveConfig(predictiveConfig: PredictiveConfigProperty.Builder.() -> Unit):
          Unit = predictiveConfig(PredictiveConfigProperty(predictiveConfig))

      /**
       * @param progressiveConfig Contains progressive telephony outbound mode configuration.
       */
      override fun progressiveConfig(progressiveConfig: IResolvable) {
        cdkBuilder.progressiveConfig(progressiveConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param progressiveConfig Contains progressive telephony outbound mode configuration.
       */
      override fun progressiveConfig(progressiveConfig: ProgressiveConfigProperty) {
        cdkBuilder.progressiveConfig(progressiveConfig.let(ProgressiveConfigProperty.Companion::unwrap))
      }

      /**
       * @param progressiveConfig Contains progressive telephony outbound mode configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad93b5c02f1433a230b35914ac0e7d18a2b0780073a2c07b3067d477592c382e")
      override
          fun progressiveConfig(progressiveConfig: ProgressiveConfigProperty.Builder.() -> Unit):
          Unit = progressiveConfig(ProgressiveConfigProperty(progressiveConfig))

      public fun build():
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TelephonyOutboundModeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TelephonyOutboundModeProperty,
    ) : CdkObject(cdkObject),
        TelephonyOutboundModeProperty {
      /**
       * The agentless outbound mode configuration for telephony.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-telephonyoutboundmode.html#cfn-connectcampaignsv2-campaign-telephonyoutboundmode-agentlessconfig)
       */
      override fun agentlessConfig(): Any? = unwrap(this).getAgentlessConfig()

      /**
       * Contains predictive outbound mode configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-telephonyoutboundmode.html#cfn-connectcampaignsv2-campaign-telephonyoutboundmode-predictiveconfig)
       */
      override fun predictiveConfig(): Any? = unwrap(this).getPredictiveConfig()

      /**
       * Contains progressive telephony outbound mode configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-telephonyoutboundmode.html#cfn-connectcampaignsv2-campaign-telephonyoutboundmode-progressiveconfig)
       */
      override fun progressiveConfig(): Any? = unwrap(this).getProgressiveConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TelephonyOutboundModeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TelephonyOutboundModeProperty):
          TelephonyOutboundModeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TelephonyOutboundModeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TelephonyOutboundModeProperty):
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TelephonyOutboundModeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TelephonyOutboundModeProperty
    }
  }

  /**
   * Contains information about a time range.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaignsv2.*;
   * TimeRangeProperty timeRangeProperty = TimeRangeProperty.builder()
   * .endTime("endTime")
   * .startTime("startTime")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-timerange.html)
   */
  public interface TimeRangeProperty {
    /**
     * The end time of the time range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-timerange.html#cfn-connectcampaignsv2-campaign-timerange-endtime)
     */
    public fun endTime(): String

    /**
     * The start time of the time range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-timerange.html#cfn-connectcampaignsv2-campaign-timerange-starttime)
     */
    public fun startTime(): String

    /**
     * A builder for [TimeRangeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endTime The end time of the time range. 
       */
      public fun endTime(endTime: String)

      /**
       * @param startTime The start time of the time range. 
       */
      public fun startTime(startTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TimeRangeProperty.Builder =
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TimeRangeProperty.builder()

      /**
       * @param endTime The end time of the time range. 
       */
      override fun endTime(endTime: String) {
        cdkBuilder.endTime(endTime)
      }

      /**
       * @param startTime The start time of the time range. 
       */
      override fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
      }

      public fun build():
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TimeRangeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TimeRangeProperty,
    ) : CdkObject(cdkObject),
        TimeRangeProperty {
      /**
       * The end time of the time range.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-timerange.html#cfn-connectcampaignsv2-campaign-timerange-endtime)
       */
      override fun endTime(): String = unwrap(this).getEndTime()

      /**
       * The start time of the time range.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-timerange.html#cfn-connectcampaignsv2-campaign-timerange-starttime)
       */
      override fun startTime(): String = unwrap(this).getStartTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimeRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TimeRangeProperty):
          TimeRangeProperty = CdkObjectWrappers.wrap(cdkObject) as? TimeRangeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimeRangeProperty):
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TimeRangeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TimeRangeProperty
    }
  }

  /**
   * Contains information about a time window.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaignsv2.*;
   * TimeWindowProperty timeWindowProperty = TimeWindowProperty.builder()
   * .openHours(OpenHoursProperty.builder()
   * .dailyHours(List.of(DailyHourProperty.builder()
   * .key("key")
   * .value(List.of(TimeRangeProperty.builder()
   * .endTime("endTime")
   * .startTime("startTime")
   * .build()))
   * .build()))
   * .build())
   * // the properties below are optional
   * .restrictedPeriods(RestrictedPeriodsProperty.builder()
   * .restrictedPeriodList(List.of(RestrictedPeriodProperty.builder()
   * .endDate("endDate")
   * .startDate("startDate")
   * // the properties below are optional
   * .name("name")
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-timewindow.html)
   */
  public interface TimeWindowProperty {
    /**
     * The open hours configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-timewindow.html#cfn-connectcampaignsv2-campaign-timewindow-openhours)
     */
    public fun openHours(): Any

    /**
     * The restricted periods configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-timewindow.html#cfn-connectcampaignsv2-campaign-timewindow-restrictedperiods)
     */
    public fun restrictedPeriods(): Any? = unwrap(this).getRestrictedPeriods()

    /**
     * A builder for [TimeWindowProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param openHours The open hours configuration. 
       */
      public fun openHours(openHours: IResolvable)

      /**
       * @param openHours The open hours configuration. 
       */
      public fun openHours(openHours: OpenHoursProperty)

      /**
       * @param openHours The open hours configuration. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83aa1eba2ae1356d26f0e10af13102a81a843b8bd81cf9a502f36401592a0d06")
      public fun openHours(openHours: OpenHoursProperty.Builder.() -> Unit)

      /**
       * @param restrictedPeriods The restricted periods configuration.
       */
      public fun restrictedPeriods(restrictedPeriods: IResolvable)

      /**
       * @param restrictedPeriods The restricted periods configuration.
       */
      public fun restrictedPeriods(restrictedPeriods: RestrictedPeriodsProperty)

      /**
       * @param restrictedPeriods The restricted periods configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c77e1bb53018e85c5e803860f9188ed88ccb3775e4ebe2ae77a2d1e8af1851f8")
      public fun restrictedPeriods(restrictedPeriods: RestrictedPeriodsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TimeWindowProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TimeWindowProperty.builder()

      /**
       * @param openHours The open hours configuration. 
       */
      override fun openHours(openHours: IResolvable) {
        cdkBuilder.openHours(openHours.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param openHours The open hours configuration. 
       */
      override fun openHours(openHours: OpenHoursProperty) {
        cdkBuilder.openHours(openHours.let(OpenHoursProperty.Companion::unwrap))
      }

      /**
       * @param openHours The open hours configuration. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83aa1eba2ae1356d26f0e10af13102a81a843b8bd81cf9a502f36401592a0d06")
      override fun openHours(openHours: OpenHoursProperty.Builder.() -> Unit): Unit =
          openHours(OpenHoursProperty(openHours))

      /**
       * @param restrictedPeriods The restricted periods configuration.
       */
      override fun restrictedPeriods(restrictedPeriods: IResolvable) {
        cdkBuilder.restrictedPeriods(restrictedPeriods.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param restrictedPeriods The restricted periods configuration.
       */
      override fun restrictedPeriods(restrictedPeriods: RestrictedPeriodsProperty) {
        cdkBuilder.restrictedPeriods(restrictedPeriods.let(RestrictedPeriodsProperty.Companion::unwrap))
      }

      /**
       * @param restrictedPeriods The restricted periods configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c77e1bb53018e85c5e803860f9188ed88ccb3775e4ebe2ae77a2d1e8af1851f8")
      override
          fun restrictedPeriods(restrictedPeriods: RestrictedPeriodsProperty.Builder.() -> Unit):
          Unit = restrictedPeriods(RestrictedPeriodsProperty(restrictedPeriods))

      public fun build():
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TimeWindowProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TimeWindowProperty,
    ) : CdkObject(cdkObject),
        TimeWindowProperty {
      /**
       * The open hours configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-timewindow.html#cfn-connectcampaignsv2-campaign-timewindow-openhours)
       */
      override fun openHours(): Any = unwrap(this).getOpenHours()

      /**
       * The restricted periods configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaignsv2-campaign-timewindow.html#cfn-connectcampaignsv2-campaign-timewindow-restrictedperiods)
       */
      override fun restrictedPeriods(): Any? = unwrap(this).getRestrictedPeriods()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimeWindowProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TimeWindowProperty):
          TimeWindowProperty = CdkObjectWrappers.wrap(cdkObject) as? TimeWindowProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimeWindowProperty):
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TimeWindowProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaignsv2.CfnCampaign.TimeWindowProperty
    }
  }
}
