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
  public inline fun cfnContact(
    scope: Construct,
    id: String,
    block: CfnContactDsl.() -> Unit = {},
  ): CfnContact {
    val builder = CfnContactDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnContactChannel(
    scope: Construct,
    id: String,
    block: CfnContactChannelDsl.() -> Unit = {},
  ): CfnContactChannel {
    val builder = CfnContactChannelDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnContactChannelProps(block: CfnContactChannelPropsDsl.() -> Unit = {}):
      CfnContactChannelProps {
    val builder = CfnContactChannelPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnContactChannelTargetInfoProperty(block: CfnContactChannelTargetInfoPropertyDsl.() -> Unit
      = {}): CfnContact.ChannelTargetInfoProperty {
    val builder = CfnContactChannelTargetInfoPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnContactContactTargetInfoProperty(block: CfnContactContactTargetInfoPropertyDsl.() -> Unit
      = {}): CfnContact.ContactTargetInfoProperty {
    val builder = CfnContactContactTargetInfoPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnContactProps(block: CfnContactPropsDsl.() -> Unit = {}): CfnContactProps {
    val builder = CfnContactPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnContactStageProperty(block: CfnContactStagePropertyDsl.() -> Unit = {}):
      CfnContact.StageProperty {
    val builder = CfnContactStagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnContactTargetsProperty(block: CfnContactTargetsPropertyDsl.() -> Unit = {}):
      CfnContact.TargetsProperty {
    val builder = CfnContactTargetsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPlan(
    scope: Construct,
    id: String,
    block: CfnPlanDsl.() -> Unit = {},
  ): CfnPlan {
    val builder = CfnPlanDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPlanChannelTargetInfoProperty(block: CfnPlanChannelTargetInfoPropertyDsl.() -> Unit =
      {}): CfnPlan.ChannelTargetInfoProperty {
    val builder = CfnPlanChannelTargetInfoPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPlanContactTargetInfoProperty(block: CfnPlanContactTargetInfoPropertyDsl.() -> Unit =
      {}): CfnPlan.ContactTargetInfoProperty {
    val builder = CfnPlanContactTargetInfoPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPlanProps(block: CfnPlanPropsDsl.() -> Unit = {}): CfnPlanProps {
    val builder = CfnPlanPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPlanStageProperty(block: CfnPlanStagePropertyDsl.() -> Unit = {}):
      CfnPlan.StageProperty {
    val builder = CfnPlanStagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPlanTargetsProperty(block: CfnPlanTargetsPropertyDsl.() -> Unit = {}):
      CfnPlan.TargetsProperty {
    val builder = CfnPlanTargetsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRotation(
    scope: Construct,
    id: String,
    block: CfnRotationDsl.() -> Unit = {},
  ): CfnRotation {
    val builder = CfnRotationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRotationCoverageTimeProperty(block: CfnRotationCoverageTimePropertyDsl.() -> Unit =
      {}): CfnRotation.CoverageTimeProperty {
    val builder = CfnRotationCoverageTimePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRotationMonthlySettingProperty(block: CfnRotationMonthlySettingPropertyDsl.() -> Unit =
      {}): CfnRotation.MonthlySettingProperty {
    val builder = CfnRotationMonthlySettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRotationProps(block: CfnRotationPropsDsl.() -> Unit = {}): CfnRotationProps {
    val builder = CfnRotationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRotationRecurrenceSettingsProperty(block: CfnRotationRecurrenceSettingsPropertyDsl.() -> Unit
      = {}): CfnRotation.RecurrenceSettingsProperty {
    val builder = CfnRotationRecurrenceSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRotationShiftCoverageProperty(block: CfnRotationShiftCoveragePropertyDsl.() -> Unit =
      {}): CfnRotation.ShiftCoverageProperty {
    val builder = CfnRotationShiftCoveragePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRotationWeeklySettingProperty(block: CfnRotationWeeklySettingPropertyDsl.() -> Unit =
      {}): CfnRotation.WeeklySettingProperty {
    val builder = CfnRotationWeeklySettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
