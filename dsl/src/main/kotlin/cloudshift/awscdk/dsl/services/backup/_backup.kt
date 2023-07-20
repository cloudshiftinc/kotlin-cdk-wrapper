@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.BackupPlan
import software.amazon.awscdk.services.backup.BackupPlanCopyActionProps
import software.amazon.awscdk.services.backup.BackupPlanProps
import software.amazon.awscdk.services.backup.BackupPlanRule
import software.amazon.awscdk.services.backup.BackupPlanRuleProps
import software.amazon.awscdk.services.backup.BackupResource
import software.amazon.awscdk.services.backup.BackupSelection
import software.amazon.awscdk.services.backup.BackupSelectionOptions
import software.amazon.awscdk.services.backup.BackupSelectionProps
import software.amazon.awscdk.services.backup.BackupVault
import software.amazon.awscdk.services.backup.BackupVaultProps
import software.amazon.awscdk.services.backup.CfnBackupPlan
import software.amazon.awscdk.services.backup.CfnBackupPlanProps
import software.amazon.awscdk.services.backup.CfnBackupSelection
import software.amazon.awscdk.services.backup.CfnBackupSelectionProps
import software.amazon.awscdk.services.backup.CfnBackupVault
import software.amazon.awscdk.services.backup.CfnBackupVaultProps
import software.amazon.awscdk.services.backup.CfnFramework
import software.amazon.awscdk.services.backup.CfnFrameworkProps
import software.amazon.awscdk.services.backup.CfnReportPlan
import software.amazon.awscdk.services.backup.CfnReportPlanProps
import software.amazon.awscdk.services.backup.LockConfiguration
import software.amazon.awscdk.services.backup.TagCondition
import software.constructs.Construct

public object backup {
  public inline fun backupPlan(
    scope: Construct,
    id: String,
    block: BackupPlanDsl.() -> Unit = {},
  ): BackupPlan {
    val builder = BackupPlanDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun backupPlanCopyActionProps(block: BackupPlanCopyActionPropsDsl.() -> Unit = {}):
      BackupPlanCopyActionProps {
    val builder = BackupPlanCopyActionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun backupPlanProps(block: BackupPlanPropsDsl.() -> Unit = {}): BackupPlanProps {
    val builder = BackupPlanPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun backupPlanRule(block: BackupPlanRuleDsl.() -> Unit = {}): BackupPlanRule {
    val builder = BackupPlanRuleDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun backupPlanRuleProps(block: BackupPlanRulePropsDsl.() -> Unit = {}):
      BackupPlanRuleProps {
    val builder = BackupPlanRulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun backupResource(
    resource: String,
    construct: Construct,
    block: BackupResourceDsl.() -> Unit = {},
  ): BackupResource {
    val builder = BackupResourceDsl(resource, construct)
    builder.apply(block)
    return builder.build()
  }

  public inline fun backupSelection(
    scope: Construct,
    id: String,
    block: BackupSelectionDsl.() -> Unit = {},
  ): BackupSelection {
    val builder = BackupSelectionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun backupSelectionOptions(block: BackupSelectionOptionsDsl.() -> Unit = {}):
      BackupSelectionOptions {
    val builder = BackupSelectionOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun backupSelectionProps(block: BackupSelectionPropsDsl.() -> Unit = {}):
      BackupSelectionProps {
    val builder = BackupSelectionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun backupVault(
    scope: Construct,
    id: String,
    block: BackupVaultDsl.() -> Unit = {},
  ): BackupVault {
    val builder = BackupVaultDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun backupVaultProps(block: BackupVaultPropsDsl.() -> Unit = {}): BackupVaultProps {
    val builder = BackupVaultPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBackupPlan(
    scope: Construct,
    id: String,
    block: CfnBackupPlanDsl.() -> Unit = {},
  ): CfnBackupPlan {
    val builder = CfnBackupPlanDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBackupPlanAdvancedBackupSettingResourceTypeProperty(block: CfnBackupPlanAdvancedBackupSettingResourceTypePropertyDsl.() -> Unit
      = {}): CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty {
    val builder = CfnBackupPlanAdvancedBackupSettingResourceTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBackupPlanBackupPlanResourceTypeProperty(block: CfnBackupPlanBackupPlanResourceTypePropertyDsl.() -> Unit
      = {}): CfnBackupPlan.BackupPlanResourceTypeProperty {
    val builder = CfnBackupPlanBackupPlanResourceTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBackupPlanBackupRuleResourceTypeProperty(block: CfnBackupPlanBackupRuleResourceTypePropertyDsl.() -> Unit
      = {}): CfnBackupPlan.BackupRuleResourceTypeProperty {
    val builder = CfnBackupPlanBackupRuleResourceTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBackupPlanCopyActionResourceTypeProperty(block: CfnBackupPlanCopyActionResourceTypePropertyDsl.() -> Unit
      = {}): CfnBackupPlan.CopyActionResourceTypeProperty {
    val builder = CfnBackupPlanCopyActionResourceTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBackupPlanLifecycleResourceTypeProperty(block: CfnBackupPlanLifecycleResourceTypePropertyDsl.() -> Unit
      = {}): CfnBackupPlan.LifecycleResourceTypeProperty {
    val builder = CfnBackupPlanLifecycleResourceTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBackupPlanProps(block: CfnBackupPlanPropsDsl.() -> Unit = {}):
      CfnBackupPlanProps {
    val builder = CfnBackupPlanPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBackupSelection(
    scope: Construct,
    id: String,
    block: CfnBackupSelectionDsl.() -> Unit = {},
  ): CfnBackupSelection {
    val builder = CfnBackupSelectionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBackupSelectionBackupSelectionResourceTypeProperty(block: CfnBackupSelectionBackupSelectionResourceTypePropertyDsl.() -> Unit
      = {}): CfnBackupSelection.BackupSelectionResourceTypeProperty {
    val builder = CfnBackupSelectionBackupSelectionResourceTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBackupSelectionConditionParameterProperty(block: CfnBackupSelectionConditionParameterPropertyDsl.() -> Unit
      = {}): CfnBackupSelection.ConditionParameterProperty {
    val builder = CfnBackupSelectionConditionParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBackupSelectionConditionResourceTypeProperty(block: CfnBackupSelectionConditionResourceTypePropertyDsl.() -> Unit
      = {}): CfnBackupSelection.ConditionResourceTypeProperty {
    val builder = CfnBackupSelectionConditionResourceTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBackupSelectionConditionsProperty(block: CfnBackupSelectionConditionsPropertyDsl.() -> Unit
      = {}): CfnBackupSelection.ConditionsProperty {
    val builder = CfnBackupSelectionConditionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBackupSelectionProps(block: CfnBackupSelectionPropsDsl.() -> Unit = {}):
      CfnBackupSelectionProps {
    val builder = CfnBackupSelectionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBackupVault(
    scope: Construct,
    id: String,
    block: CfnBackupVaultDsl.() -> Unit = {},
  ): CfnBackupVault {
    val builder = CfnBackupVaultDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBackupVaultLockConfigurationTypeProperty(block: CfnBackupVaultLockConfigurationTypePropertyDsl.() -> Unit
      = {}): CfnBackupVault.LockConfigurationTypeProperty {
    val builder = CfnBackupVaultLockConfigurationTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBackupVaultNotificationObjectTypeProperty(block: CfnBackupVaultNotificationObjectTypePropertyDsl.() -> Unit
      = {}): CfnBackupVault.NotificationObjectTypeProperty {
    val builder = CfnBackupVaultNotificationObjectTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBackupVaultProps(block: CfnBackupVaultPropsDsl.() -> Unit = {}):
      CfnBackupVaultProps {
    val builder = CfnBackupVaultPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFramework(
    scope: Construct,
    id: String,
    block: CfnFrameworkDsl.() -> Unit = {},
  ): CfnFramework {
    val builder = CfnFrameworkDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFrameworkControlInputParameterProperty(block: CfnFrameworkControlInputParameterPropertyDsl.() -> Unit
      = {}): CfnFramework.ControlInputParameterProperty {
    val builder = CfnFrameworkControlInputParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFrameworkControlScopeProperty(block: CfnFrameworkControlScopePropertyDsl.() -> Unit =
      {}): CfnFramework.ControlScopeProperty {
    val builder = CfnFrameworkControlScopePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFrameworkFrameworkControlProperty(block: CfnFrameworkFrameworkControlPropertyDsl.() -> Unit
      = {}): CfnFramework.FrameworkControlProperty {
    val builder = CfnFrameworkFrameworkControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFrameworkProps(block: CfnFrameworkPropsDsl.() -> Unit = {}):
      CfnFrameworkProps {
    val builder = CfnFrameworkPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnReportPlan(
    scope: Construct,
    id: String,
    block: CfnReportPlanDsl.() -> Unit = {},
  ): CfnReportPlan {
    val builder = CfnReportPlanDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnReportPlanProps(block: CfnReportPlanPropsDsl.() -> Unit = {}):
      CfnReportPlanProps {
    val builder = CfnReportPlanPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnReportPlanReportDeliveryChannelProperty(block: CfnReportPlanReportDeliveryChannelPropertyDsl.() -> Unit
      = {}): CfnReportPlan.ReportDeliveryChannelProperty {
    val builder = CfnReportPlanReportDeliveryChannelPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnReportPlanReportSettingProperty(block: CfnReportPlanReportSettingPropertyDsl.() -> Unit
      = {}): CfnReportPlan.ReportSettingProperty {
    val builder = CfnReportPlanReportSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun lockConfiguration(block: LockConfigurationDsl.() -> Unit = {}):
      LockConfiguration {
    val builder = LockConfigurationDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun tagCondition(block: TagConditionDsl.() -> Unit = {}): TagCondition {
    val builder = TagConditionDsl()
    builder.apply(block)
    return builder.build()
  }
}
