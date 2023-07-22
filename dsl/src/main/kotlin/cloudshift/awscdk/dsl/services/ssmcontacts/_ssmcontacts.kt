@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmcontacts

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssmcontacts.CfnContact
import software.amazon.awscdk.services.ssmcontacts.CfnContactChannel
import software.amazon.awscdk.services.ssmcontacts.CfnContactChannelProps
import software.amazon.awscdk.services.ssmcontacts.CfnContactProps
import software.amazon.awscdk.services.ssmcontacts.CfnPlan
import software.amazon.awscdk.services.ssmcontacts.CfnPlanProps
import software.amazon.awscdk.services.ssmcontacts.CfnRotation
import software.amazon.awscdk.services.ssmcontacts.CfnRotationProps
import software.constructs.Construct

public object ssmcontacts {
  /**
   * The `AWS::SSMContacts::Contact` resource specifies a contact or escalation plan.
   *
   * Incident Manager contacts are a subset of actions and data types that you can use for managing
   * responder engagement and interaction.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ssmcontacts.*;
   * CfnContact cfnContact = CfnContact.Builder.create(this, "MyCfnContact")
   * .alias("alias")
   * .displayName("displayName")
   * .type("type")
   * // the properties below are optional
   * .plan(List.of(StageProperty.builder()
   * .durationInMinutes(123)
   * .rotationIds(List.of("rotationIds"))
   * .targets(List.of(TargetsProperty.builder()
   * .channelTargetInfo(ChannelTargetInfoProperty.builder()
   * .channelId("channelId")
   * .retryIntervalInMinutes(123)
   * .build())
   * .contactTargetInfo(ContactTargetInfoProperty.builder()
   * .contactId("contactId")
   * .isEssential(false)
   * .build())
   * .build()))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html)
   */
  public inline fun cfnContact(
    scope: Construct,
    id: String,
    block: CfnContactDsl.() -> Unit = {},
  ): CfnContact {
    val builder = CfnContactDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::SSMContacts::ContactChannel` resource specifies a contact channel as the method that
   * Incident Manager uses to engage your contact.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ssmcontacts.*;
   * CfnContactChannel cfnContactChannel = CfnContactChannel.Builder.create(this,
   * "MyCfnContactChannel")
   * .channelAddress("channelAddress")
   * .channelName("channelName")
   * .channelType("channelType")
   * .contactId("contactId")
   * // the properties below are optional
   * .deferActivation(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contactchannel.html)
   */
  public inline fun cfnContactChannel(
    scope: Construct,
    id: String,
    block: CfnContactChannelDsl.() -> Unit = {},
  ): CfnContactChannel {
    val builder = CfnContactChannelDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnContactChannel`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ssmcontacts.*;
   * CfnContactChannelProps cfnContactChannelProps = CfnContactChannelProps.builder()
   * .channelAddress("channelAddress")
   * .channelName("channelName")
   * .channelType("channelType")
   * .contactId("contactId")
   * // the properties below are optional
   * .deferActivation(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contactchannel.html)
   */
  public inline fun cfnContactChannelProps(block: CfnContactChannelPropsDsl.() -> Unit = {}):
      CfnContactChannelProps {
    val builder = CfnContactChannelPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about the contact channel that Incident Manager uses to engage the contact.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ssmcontacts.*;
   * ChannelTargetInfoProperty channelTargetInfoProperty = ChannelTargetInfoProperty.builder()
   * .channelId("channelId")
   * .retryIntervalInMinutes(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-channeltargetinfo.html)
   */
  public inline
      fun cfnContactChannelTargetInfoProperty(block: CfnContactChannelTargetInfoPropertyDsl.() -> Unit
      = {}): CfnContact.ChannelTargetInfoProperty {
    val builder = CfnContactChannelTargetInfoPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The contact that Incident Manager is engaging during an incident.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ssmcontacts.*;
   * ContactTargetInfoProperty contactTargetInfoProperty = ContactTargetInfoProperty.builder()
   * .contactId("contactId")
   * .isEssential(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-contacttargetinfo.html)
   */
  public inline
      fun cfnContactContactTargetInfoProperty(block: CfnContactContactTargetInfoPropertyDsl.() -> Unit
      = {}): CfnContact.ContactTargetInfoProperty {
    val builder = CfnContactContactTargetInfoPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnContact`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ssmcontacts.*;
   * CfnContactProps cfnContactProps = CfnContactProps.builder()
   * .alias("alias")
   * .displayName("displayName")
   * .type("type")
   * // the properties below are optional
   * .plan(List.of(StageProperty.builder()
   * .durationInMinutes(123)
   * .rotationIds(List.of("rotationIds"))
   * .targets(List.of(TargetsProperty.builder()
   * .channelTargetInfo(ChannelTargetInfoProperty.builder()
   * .channelId("channelId")
   * .retryIntervalInMinutes(123)
   * .build())
   * .contactTargetInfo(ContactTargetInfoProperty.builder()
   * .contactId("contactId")
   * .isEssential(false)
   * .build())
   * .build()))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html)
   */
  public inline fun cfnContactProps(block: CfnContactPropsDsl.() -> Unit = {}): CfnContactProps {
    val builder = CfnContactPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `Stage` property type specifies a set amount of time that an escalation plan or engagement
   * plan engages the specified contacts or contact methods.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ssmcontacts.*;
   * StageProperty stageProperty = StageProperty.builder()
   * .durationInMinutes(123)
   * .rotationIds(List.of("rotationIds"))
   * .targets(List.of(TargetsProperty.builder()
   * .channelTargetInfo(ChannelTargetInfoProperty.builder()
   * .channelId("channelId")
   * .retryIntervalInMinutes(123)
   * .build())
   * .contactTargetInfo(ContactTargetInfoProperty.builder()
   * .contactId("contactId")
   * .isEssential(false)
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-stage.html)
   */
  public inline fun cfnContactStageProperty(block: CfnContactStagePropertyDsl.() -> Unit = {}):
      CfnContact.StageProperty {
    val builder = CfnContactStagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The contact or contact channel that's being engaged.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ssmcontacts.*;
   * TargetsProperty targetsProperty = TargetsProperty.builder()
   * .channelTargetInfo(ChannelTargetInfoProperty.builder()
   * .channelId("channelId")
   * .retryIntervalInMinutes(123)
   * .build())
   * .contactTargetInfo(ContactTargetInfoProperty.builder()
   * .contactId("contactId")
   * .isEssential(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-targets.html)
   */
  public inline fun cfnContactTargetsProperty(block: CfnContactTargetsPropertyDsl.() -> Unit = {}):
      CfnContact.TargetsProperty {
    val builder = CfnContactTargetsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about the stages and on-call rotation teams associated with an escalation plan or
   * engagement plan.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ssmcontacts.*;
   * CfnPlan cfnPlan = CfnPlan.Builder.create(this, "MyCfnPlan")
   * .contactId("contactId")
   * // the properties below are optional
   * .rotationIds(List.of("rotationIds"))
   * .stages(List.of(StageProperty.builder()
   * .durationInMinutes(123)
   * // the properties below are optional
   * .targets(List.of(TargetsProperty.builder()
   * .channelTargetInfo(ChannelTargetInfoProperty.builder()
   * .channelId("channelId")
   * .retryIntervalInMinutes(123)
   * .build())
   * .contactTargetInfo(ContactTargetInfoProperty.builder()
   * .contactId("contactId")
   * .isEssential(false)
   * .build())
   * .build()))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-plan.html)
   */
  public inline fun cfnPlan(
    scope: Construct,
    id: String,
    block: CfnPlanDsl.() -> Unit = {},
  ): CfnPlan {
    val builder = CfnPlanDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about the contact channel that Incident Manager uses to engage the contact.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ssmcontacts.*;
   * ChannelTargetInfoProperty channelTargetInfoProperty = ChannelTargetInfoProperty.builder()
   * .channelId("channelId")
   * .retryIntervalInMinutes(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-plan-channeltargetinfo.html)
   */
  public inline
      fun cfnPlanChannelTargetInfoProperty(block: CfnPlanChannelTargetInfoPropertyDsl.() -> Unit =
      {}): CfnPlan.ChannelTargetInfoProperty {
    val builder = CfnPlanChannelTargetInfoPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The contact that Incident Manager is engaging during an incident.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ssmcontacts.*;
   * ContactTargetInfoProperty contactTargetInfoProperty = ContactTargetInfoProperty.builder()
   * .contactId("contactId")
   * .isEssential(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-plan-contacttargetinfo.html)
   */
  public inline
      fun cfnPlanContactTargetInfoProperty(block: CfnPlanContactTargetInfoPropertyDsl.() -> Unit =
      {}): CfnPlan.ContactTargetInfoProperty {
    val builder = CfnPlanContactTargetInfoPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnPlan`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ssmcontacts.*;
   * CfnPlanProps cfnPlanProps = CfnPlanProps.builder()
   * .contactId("contactId")
   * // the properties below are optional
   * .rotationIds(List.of("rotationIds"))
   * .stages(List.of(StageProperty.builder()
   * .durationInMinutes(123)
   * // the properties below are optional
   * .targets(List.of(TargetsProperty.builder()
   * .channelTargetInfo(ChannelTargetInfoProperty.builder()
   * .channelId("channelId")
   * .retryIntervalInMinutes(123)
   * .build())
   * .contactTargetInfo(ContactTargetInfoProperty.builder()
   * .contactId("contactId")
   * .isEssential(false)
   * .build())
   * .build()))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-plan.html)
   */
  public inline fun cfnPlanProps(block: CfnPlanPropsDsl.() -> Unit = {}): CfnPlanProps {
    val builder = CfnPlanPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A set amount of time that an escalation plan or engagement plan engages the specified contacts
   * or contact methods.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ssmcontacts.*;
   * StageProperty stageProperty = StageProperty.builder()
   * .durationInMinutes(123)
   * // the properties below are optional
   * .targets(List.of(TargetsProperty.builder()
   * .channelTargetInfo(ChannelTargetInfoProperty.builder()
   * .channelId("channelId")
   * .retryIntervalInMinutes(123)
   * .build())
   * .contactTargetInfo(ContactTargetInfoProperty.builder()
   * .contactId("contactId")
   * .isEssential(false)
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-plan-stage.html)
   */
  public inline fun cfnPlanStageProperty(block: CfnPlanStagePropertyDsl.() -> Unit = {}):
      CfnPlan.StageProperty {
    val builder = CfnPlanStagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The contact or contact channel that's being engaged.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ssmcontacts.*;
   * TargetsProperty targetsProperty = TargetsProperty.builder()
   * .channelTargetInfo(ChannelTargetInfoProperty.builder()
   * .channelId("channelId")
   * .retryIntervalInMinutes(123)
   * .build())
   * .contactTargetInfo(ContactTargetInfoProperty.builder()
   * .contactId("contactId")
   * .isEssential(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-plan-targets.html)
   */
  public inline fun cfnPlanTargetsProperty(block: CfnPlanTargetsPropertyDsl.() -> Unit = {}):
      CfnPlan.TargetsProperty {
    val builder = CfnPlanTargetsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies a rotation in an on-call schedule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ssmcontacts.*;
   * CfnRotation cfnRotation = CfnRotation.Builder.create(this, "MyCfnRotation")
   * .contactIds(List.of("contactIds"))
   * .name("name")
   * .recurrence(RecurrenceSettingsProperty.builder()
   * .numberOfOnCalls(123)
   * .recurrenceMultiplier(123)
   * // the properties below are optional
   * .dailySettings(List.of("dailySettings"))
   * .monthlySettings(List.of(MonthlySettingProperty.builder()
   * .dayOfMonth(123)
   * .handOffTime("handOffTime")
   * .build()))
   * .shiftCoverages(List.of(ShiftCoverageProperty.builder()
   * .coverageTimes(List.of(CoverageTimeProperty.builder()
   * .endTime("endTime")
   * .startTime("startTime")
   * .build()))
   * .dayOfWeek("dayOfWeek")
   * .build()))
   * .weeklySettings(List.of(WeeklySettingProperty.builder()
   * .dayOfWeek("dayOfWeek")
   * .handOffTime("handOffTime")
   * .build()))
   * .build())
   * .startTime("startTime")
   * .timeZoneId("timeZoneId")
   * // the properties below are optional
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html)
   */
  public inline fun cfnRotation(
    scope: Construct,
    id: String,
    block: CfnRotationDsl.() -> Unit = {},
  ): CfnRotation {
    val builder = CfnRotationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about when an on-call shift begins and ends.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ssmcontacts.*;
   * CoverageTimeProperty coverageTimeProperty = CoverageTimeProperty.builder()
   * .endTime("endTime")
   * .startTime("startTime")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-coveragetime.html)
   */
  public inline
      fun cfnRotationCoverageTimeProperty(block: CfnRotationCoverageTimePropertyDsl.() -> Unit =
      {}): CfnRotation.CoverageTimeProperty {
    val builder = CfnRotationCoverageTimePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about on-call rotations that recur monthly.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ssmcontacts.*;
   * MonthlySettingProperty monthlySettingProperty = MonthlySettingProperty.builder()
   * .dayOfMonth(123)
   * .handOffTime("handOffTime")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-monthlysetting.html)
   */
  public inline
      fun cfnRotationMonthlySettingProperty(block: CfnRotationMonthlySettingPropertyDsl.() -> Unit =
      {}): CfnRotation.MonthlySettingProperty {
    val builder = CfnRotationMonthlySettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnRotation`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ssmcontacts.*;
   * CfnRotationProps cfnRotationProps = CfnRotationProps.builder()
   * .contactIds(List.of("contactIds"))
   * .name("name")
   * .recurrence(RecurrenceSettingsProperty.builder()
   * .numberOfOnCalls(123)
   * .recurrenceMultiplier(123)
   * // the properties below are optional
   * .dailySettings(List.of("dailySettings"))
   * .monthlySettings(List.of(MonthlySettingProperty.builder()
   * .dayOfMonth(123)
   * .handOffTime("handOffTime")
   * .build()))
   * .shiftCoverages(List.of(ShiftCoverageProperty.builder()
   * .coverageTimes(List.of(CoverageTimeProperty.builder()
   * .endTime("endTime")
   * .startTime("startTime")
   * .build()))
   * .dayOfWeek("dayOfWeek")
   * .build()))
   * .weeklySettings(List.of(WeeklySettingProperty.builder()
   * .dayOfWeek("dayOfWeek")
   * .handOffTime("handOffTime")
   * .build()))
   * .build())
   * .startTime("startTime")
   * .timeZoneId("timeZoneId")
   * // the properties below are optional
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html)
   */
  public inline fun cfnRotationProps(block: CfnRotationPropsDsl.() -> Unit = {}): CfnRotationProps {
    val builder = CfnRotationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about when an on-call rotation is in effect and how long the rotation period lasts.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ssmcontacts.*;
   * RecurrenceSettingsProperty recurrenceSettingsProperty = RecurrenceSettingsProperty.builder()
   * .numberOfOnCalls(123)
   * .recurrenceMultiplier(123)
   * // the properties below are optional
   * .dailySettings(List.of("dailySettings"))
   * .monthlySettings(List.of(MonthlySettingProperty.builder()
   * .dayOfMonth(123)
   * .handOffTime("handOffTime")
   * .build()))
   * .shiftCoverages(List.of(ShiftCoverageProperty.builder()
   * .coverageTimes(List.of(CoverageTimeProperty.builder()
   * .endTime("endTime")
   * .startTime("startTime")
   * .build()))
   * .dayOfWeek("dayOfWeek")
   * .build()))
   * .weeklySettings(List.of(WeeklySettingProperty.builder()
   * .dayOfWeek("dayOfWeek")
   * .handOffTime("handOffTime")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-recurrencesettings.html)
   */
  public inline
      fun cfnRotationRecurrenceSettingsProperty(block: CfnRotationRecurrenceSettingsPropertyDsl.() -> Unit
      = {}): CfnRotation.RecurrenceSettingsProperty {
    val builder = CfnRotationRecurrenceSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about the days of the week that the on-call rotation coverage includes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ssmcontacts.*;
   * ShiftCoverageProperty shiftCoverageProperty = ShiftCoverageProperty.builder()
   * .coverageTimes(List.of(CoverageTimeProperty.builder()
   * .endTime("endTime")
   * .startTime("startTime")
   * .build()))
   * .dayOfWeek("dayOfWeek")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-shiftcoverage.html)
   */
  public inline
      fun cfnRotationShiftCoverageProperty(block: CfnRotationShiftCoveragePropertyDsl.() -> Unit =
      {}): CfnRotation.ShiftCoverageProperty {
    val builder = CfnRotationShiftCoveragePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about rotations that recur weekly.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ssmcontacts.*;
   * WeeklySettingProperty weeklySettingProperty = WeeklySettingProperty.builder()
   * .dayOfWeek("dayOfWeek")
   * .handOffTime("handOffTime")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-weeklysetting.html)
   */
  public inline
      fun cfnRotationWeeklySettingProperty(block: CfnRotationWeeklySettingPropertyDsl.() -> Unit =
      {}): CfnRotation.WeeklySettingProperty {
    val builder = CfnRotationWeeklySettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
