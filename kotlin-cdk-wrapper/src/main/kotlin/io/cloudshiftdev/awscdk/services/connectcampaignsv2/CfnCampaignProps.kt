@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connectcampaignsv2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
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
 * import io.cloudshiftdev.awscdk.services.connectcampaignsv2.*;
 * Object agentlessConfig;
 * CfnCampaignProps cfnCampaignProps = CfnCampaignProps.builder()
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
 * .instanceLimitsHandling("instanceLimitsHandling")
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
 * .eventTrigger(EventTriggerProperty.builder()
 * .customerProfilesDomainArn("customerProfilesDomainArn")
 * .build())
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
public interface CfnCampaignProps {
  /**
   * Contains channel subtype configuration for an outbound campaign.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-channelsubtypeconfig)
   */
  public fun channelSubtypeConfig(): Any

  /**
   * Communication limits configuration for an outbound campaign.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-communicationlimitsoverride)
   */
  public fun communicationLimitsOverride(): Any? = unwrap(this).getCommunicationLimitsOverride()

  /**
   * Contains communication time configuration for an outbound campaign.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-communicationtimeconfig)
   */
  public fun communicationTimeConfig(): Any? = unwrap(this).getCommunicationTimeConfig()

  /**
   * The Amazon Resource Name (ARN) of the Amazon Connect campaign flow associated with the outbound
   * campaign.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-connectcampaignflowarn)
   */
  public fun connectCampaignFlowArn(): String? = unwrap(this).getConnectCampaignFlowArn()

  /**
   * The identifier of the Amazon Connect instance.
   *
   * You can find the `instanceId` in the ARN of the instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-connectinstanceid)
   */
  public fun connectInstanceId(): String

  /**
   * The name of the outbound campaign.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-name)
   */
  public fun name(): String

  /**
   * Contains the schedule configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-schedule)
   */
  public fun schedule(): Any? = unwrap(this).getSchedule()

  /**
   * Contains source configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-source)
   */
  public fun source(): Any? = unwrap(this).getSource()

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * For example, `{ "tags": {"key1":"value1", "key2":"value2"} }` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnCampaignProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param channelSubtypeConfig Contains channel subtype configuration for an outbound campaign. 
     */
    public fun channelSubtypeConfig(channelSubtypeConfig: IResolvable)

    /**
     * @param channelSubtypeConfig Contains channel subtype configuration for an outbound campaign. 
     */
    public fun channelSubtypeConfig(channelSubtypeConfig: CfnCampaign.ChannelSubtypeConfigProperty)

    /**
     * @param channelSubtypeConfig Contains channel subtype configuration for an outbound campaign. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("985e240dbc08b4e6cb4a60affe6a5793d47ecba6d98e164ed3cb676904fd87bb")
    public
        fun channelSubtypeConfig(channelSubtypeConfig: CfnCampaign.ChannelSubtypeConfigProperty.Builder.() -> Unit)

    /**
     * @param communicationLimitsOverride Communication limits configuration for an outbound
     * campaign.
     */
    public fun communicationLimitsOverride(communicationLimitsOverride: IResolvable)

    /**
     * @param communicationLimitsOverride Communication limits configuration for an outbound
     * campaign.
     */
    public
        fun communicationLimitsOverride(communicationLimitsOverride: CfnCampaign.CommunicationLimitsConfigProperty)

    /**
     * @param communicationLimitsOverride Communication limits configuration for an outbound
     * campaign.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0acd92b0037ad1cd9d4e16e51e5e815b94d2eb5e605a9432307cc17f547ef0a8")
    public
        fun communicationLimitsOverride(communicationLimitsOverride: CfnCampaign.CommunicationLimitsConfigProperty.Builder.() -> Unit)

    /**
     * @param communicationTimeConfig Contains communication time configuration for an outbound
     * campaign.
     */
    public fun communicationTimeConfig(communicationTimeConfig: IResolvable)

    /**
     * @param communicationTimeConfig Contains communication time configuration for an outbound
     * campaign.
     */
    public
        fun communicationTimeConfig(communicationTimeConfig: CfnCampaign.CommunicationTimeConfigProperty)

    /**
     * @param communicationTimeConfig Contains communication time configuration for an outbound
     * campaign.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e61773e0b41675a60f6cbaf59d405d7ef137963a2c40f67b5da7ab59961e7113")
    public
        fun communicationTimeConfig(communicationTimeConfig: CfnCampaign.CommunicationTimeConfigProperty.Builder.() -> Unit)

    /**
     * @param connectCampaignFlowArn The Amazon Resource Name (ARN) of the Amazon Connect campaign
     * flow associated with the outbound campaign.
     */
    public fun connectCampaignFlowArn(connectCampaignFlowArn: String)

    /**
     * @param connectInstanceId The identifier of the Amazon Connect instance. 
     * You can find the `instanceId` in the ARN of the instance.
     */
    public fun connectInstanceId(connectInstanceId: String)

    /**
     * @param name The name of the outbound campaign. 
     */
    public fun name(name: String)

    /**
     * @param schedule Contains the schedule configuration.
     */
    public fun schedule(schedule: IResolvable)

    /**
     * @param schedule Contains the schedule configuration.
     */
    public fun schedule(schedule: CfnCampaign.ScheduleProperty)

    /**
     * @param schedule Contains the schedule configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72636710f0c5addc435a78c054bf8679049e8369131670edac74ef3a4b580bc1")
    public fun schedule(schedule: CfnCampaign.ScheduleProperty.Builder.() -> Unit)

    /**
     * @param source Contains source configuration.
     */
    public fun source(source: IResolvable)

    /**
     * @param source Contains source configuration.
     */
    public fun source(source: CfnCampaign.SourceProperty)

    /**
     * @param source Contains source configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6387042622e2251b353bf5702ca7bb5fcbd2bb96ab852798d1d3d5656d9a2d1d")
    public fun source(source: CfnCampaign.SourceProperty.Builder.() -> Unit)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, `{ "tags": {"key1":"value1", "key2":"value2"} }` .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, `{ "tags": {"key1":"value1", "key2":"value2"} }` .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.connectcampaignsv2.CfnCampaignProps.Builder =
        software.amazon.awscdk.services.connectcampaignsv2.CfnCampaignProps.builder()

    /**
     * @param channelSubtypeConfig Contains channel subtype configuration for an outbound campaign. 
     */
    override fun channelSubtypeConfig(channelSubtypeConfig: IResolvable) {
      cdkBuilder.channelSubtypeConfig(channelSubtypeConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param channelSubtypeConfig Contains channel subtype configuration for an outbound campaign. 
     */
    override
        fun channelSubtypeConfig(channelSubtypeConfig: CfnCampaign.ChannelSubtypeConfigProperty) {
      cdkBuilder.channelSubtypeConfig(channelSubtypeConfig.let(CfnCampaign.ChannelSubtypeConfigProperty.Companion::unwrap))
    }

    /**
     * @param channelSubtypeConfig Contains channel subtype configuration for an outbound campaign. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("985e240dbc08b4e6cb4a60affe6a5793d47ecba6d98e164ed3cb676904fd87bb")
    override
        fun channelSubtypeConfig(channelSubtypeConfig: CfnCampaign.ChannelSubtypeConfigProperty.Builder.() -> Unit):
        Unit = channelSubtypeConfig(CfnCampaign.ChannelSubtypeConfigProperty(channelSubtypeConfig))

    /**
     * @param communicationLimitsOverride Communication limits configuration for an outbound
     * campaign.
     */
    override fun communicationLimitsOverride(communicationLimitsOverride: IResolvable) {
      cdkBuilder.communicationLimitsOverride(communicationLimitsOverride.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param communicationLimitsOverride Communication limits configuration for an outbound
     * campaign.
     */
    override
        fun communicationLimitsOverride(communicationLimitsOverride: CfnCampaign.CommunicationLimitsConfigProperty) {
      cdkBuilder.communicationLimitsOverride(communicationLimitsOverride.let(CfnCampaign.CommunicationLimitsConfigProperty.Companion::unwrap))
    }

    /**
     * @param communicationLimitsOverride Communication limits configuration for an outbound
     * campaign.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0acd92b0037ad1cd9d4e16e51e5e815b94d2eb5e605a9432307cc17f547ef0a8")
    override
        fun communicationLimitsOverride(communicationLimitsOverride: CfnCampaign.CommunicationLimitsConfigProperty.Builder.() -> Unit):
        Unit =
        communicationLimitsOverride(CfnCampaign.CommunicationLimitsConfigProperty(communicationLimitsOverride))

    /**
     * @param communicationTimeConfig Contains communication time configuration for an outbound
     * campaign.
     */
    override fun communicationTimeConfig(communicationTimeConfig: IResolvable) {
      cdkBuilder.communicationTimeConfig(communicationTimeConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param communicationTimeConfig Contains communication time configuration for an outbound
     * campaign.
     */
    override
        fun communicationTimeConfig(communicationTimeConfig: CfnCampaign.CommunicationTimeConfigProperty) {
      cdkBuilder.communicationTimeConfig(communicationTimeConfig.let(CfnCampaign.CommunicationTimeConfigProperty.Companion::unwrap))
    }

    /**
     * @param communicationTimeConfig Contains communication time configuration for an outbound
     * campaign.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e61773e0b41675a60f6cbaf59d405d7ef137963a2c40f67b5da7ab59961e7113")
    override
        fun communicationTimeConfig(communicationTimeConfig: CfnCampaign.CommunicationTimeConfigProperty.Builder.() -> Unit):
        Unit =
        communicationTimeConfig(CfnCampaign.CommunicationTimeConfigProperty(communicationTimeConfig))

    /**
     * @param connectCampaignFlowArn The Amazon Resource Name (ARN) of the Amazon Connect campaign
     * flow associated with the outbound campaign.
     */
    override fun connectCampaignFlowArn(connectCampaignFlowArn: String) {
      cdkBuilder.connectCampaignFlowArn(connectCampaignFlowArn)
    }

    /**
     * @param connectInstanceId The identifier of the Amazon Connect instance. 
     * You can find the `instanceId` in the ARN of the instance.
     */
    override fun connectInstanceId(connectInstanceId: String) {
      cdkBuilder.connectInstanceId(connectInstanceId)
    }

    /**
     * @param name The name of the outbound campaign. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param schedule Contains the schedule configuration.
     */
    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param schedule Contains the schedule configuration.
     */
    override fun schedule(schedule: CfnCampaign.ScheduleProperty) {
      cdkBuilder.schedule(schedule.let(CfnCampaign.ScheduleProperty.Companion::unwrap))
    }

    /**
     * @param schedule Contains the schedule configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72636710f0c5addc435a78c054bf8679049e8369131670edac74ef3a4b580bc1")
    override fun schedule(schedule: CfnCampaign.ScheduleProperty.Builder.() -> Unit): Unit =
        schedule(CfnCampaign.ScheduleProperty(schedule))

    /**
     * @param source Contains source configuration.
     */
    override fun source(source: IResolvable) {
      cdkBuilder.source(source.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param source Contains source configuration.
     */
    override fun source(source: CfnCampaign.SourceProperty) {
      cdkBuilder.source(source.let(CfnCampaign.SourceProperty.Companion::unwrap))
    }

    /**
     * @param source Contains source configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6387042622e2251b353bf5702ca7bb5fcbd2bb96ab852798d1d3d5656d9a2d1d")
    override fun source(source: CfnCampaign.SourceProperty.Builder.() -> Unit): Unit =
        source(CfnCampaign.SourceProperty(source))

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, `{ "tags": {"key1":"value1", "key2":"value2"} }` .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, `{ "tags": {"key1":"value1", "key2":"value2"} }` .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connectcampaignsv2.CfnCampaignProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaignProps,
  ) : CdkObject(cdkObject),
      CfnCampaignProps {
    /**
     * Contains channel subtype configuration for an outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-channelsubtypeconfig)
     */
    override fun channelSubtypeConfig(): Any = unwrap(this).getChannelSubtypeConfig()

    /**
     * Communication limits configuration for an outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-communicationlimitsoverride)
     */
    override fun communicationLimitsOverride(): Any? = unwrap(this).getCommunicationLimitsOverride()

    /**
     * Contains communication time configuration for an outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-communicationtimeconfig)
     */
    override fun communicationTimeConfig(): Any? = unwrap(this).getCommunicationTimeConfig()

    /**
     * The Amazon Resource Name (ARN) of the Amazon Connect campaign flow associated with the
     * outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-connectcampaignflowarn)
     */
    override fun connectCampaignFlowArn(): String? = unwrap(this).getConnectCampaignFlowArn()

    /**
     * The identifier of the Amazon Connect instance.
     *
     * You can find the `instanceId` in the ARN of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-connectinstanceid)
     */
    override fun connectInstanceId(): String = unwrap(this).getConnectInstanceId()

    /**
     * The name of the outbound campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Contains the schedule configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-schedule)
     */
    override fun schedule(): Any? = unwrap(this).getSchedule()

    /**
     * Contains source configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-source)
     */
    override fun source(): Any? = unwrap(this).getSource()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, `{ "tags": {"key1":"value1", "key2":"value2"} }` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaignsv2-campaign.html#cfn-connectcampaignsv2-campaign-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCampaignProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaignsv2.CfnCampaignProps):
        CfnCampaignProps = CdkObjectWrappers.wrap(cdkObject) as? CfnCampaignProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCampaignProps):
        software.amazon.awscdk.services.connectcampaignsv2.CfnCampaignProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.connectcampaignsv2.CfnCampaignProps
  }
}
