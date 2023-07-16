@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnAssociation
import software.amazon.awscdk.services.ssm.CfnAssociationProps
import software.amazon.awscdk.services.ssm.CfnDocument
import software.amazon.awscdk.services.ssm.CfnDocumentProps
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindow
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowProps
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTargetProps
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTaskProps
import software.amazon.awscdk.services.ssm.CfnParameter
import software.amazon.awscdk.services.ssm.CfnParameterProps
import software.amazon.awscdk.services.ssm.CfnPatchBaseline
import software.amazon.awscdk.services.ssm.CfnPatchBaselineProps
import software.amazon.awscdk.services.ssm.CfnResourceDataSync
import software.amazon.awscdk.services.ssm.CfnResourceDataSyncProps
import software.amazon.awscdk.services.ssm.CfnResourcePolicy
import software.amazon.awscdk.services.ssm.CfnResourcePolicyProps
import software.amazon.awscdk.services.ssm.CommonStringParameterAttributes
import software.amazon.awscdk.services.ssm.ListParameterAttributes
import software.amazon.awscdk.services.ssm.ParameterOptions
import software.amazon.awscdk.services.ssm.SecureStringParameterAttributes
import software.amazon.awscdk.services.ssm.StringListParameter
import software.amazon.awscdk.services.ssm.StringListParameterProps
import software.amazon.awscdk.services.ssm.StringParameter
import software.amazon.awscdk.services.ssm.StringParameterAttributes
import software.amazon.awscdk.services.ssm.StringParameterProps
import software.constructs.Construct

public object ssm {
  public inline fun cfnAssociation(
    scope: Construct,
    id: String,
    block: CfnAssociationDsl.() -> Unit = {},
  ): CfnAssociation {
    val builder = CfnAssociationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAssociationInstanceAssociationOutputLocationProperty(block: CfnAssociationInstanceAssociationOutputLocationPropertyDsl.() -> Unit
      = {}): CfnAssociation.InstanceAssociationOutputLocationProperty {
    val builder = CfnAssociationInstanceAssociationOutputLocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAssociationProps(block: CfnAssociationPropsDsl.() -> Unit = {}):
      CfnAssociationProps {
    val builder = CfnAssociationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAssociationS3OutputLocationProperty(block: CfnAssociationS3OutputLocationPropertyDsl.() -> Unit
      = {}): CfnAssociation.S3OutputLocationProperty {
    val builder = CfnAssociationS3OutputLocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAssociationTargetProperty(block: CfnAssociationTargetPropertyDsl.() -> Unit =
      {}): CfnAssociation.TargetProperty {
    val builder = CfnAssociationTargetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDocument(
    scope: Construct,
    id: String,
    block: CfnDocumentDsl.() -> Unit = {},
  ): CfnDocument {
    val builder = CfnDocumentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDocumentAttachmentsSourceProperty(block: CfnDocumentAttachmentsSourcePropertyDsl.() -> Unit
      = {}): CfnDocument.AttachmentsSourceProperty {
    val builder = CfnDocumentAttachmentsSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDocumentDocumentRequiresProperty(block: CfnDocumentDocumentRequiresPropertyDsl.() -> Unit
      = {}): CfnDocument.DocumentRequiresProperty {
    val builder = CfnDocumentDocumentRequiresPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDocumentProps(block: CfnDocumentPropsDsl.() -> Unit = {}): CfnDocumentProps {
    val builder = CfnDocumentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMaintenanceWindow(
    scope: Construct,
    id: String,
    block: CfnMaintenanceWindowDsl.() -> Unit = {},
  ): CfnMaintenanceWindow {
    val builder = CfnMaintenanceWindowDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMaintenanceWindowProps(block: CfnMaintenanceWindowPropsDsl.() -> Unit = {}):
      CfnMaintenanceWindowProps {
    val builder = CfnMaintenanceWindowPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMaintenanceWindowTarget(
    scope: Construct,
    id: String,
    block: CfnMaintenanceWindowTargetDsl.() -> Unit = {},
  ): CfnMaintenanceWindowTarget {
    val builder = CfnMaintenanceWindowTargetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMaintenanceWindowTargetProps(block: CfnMaintenanceWindowTargetPropsDsl.() -> Unit =
      {}): CfnMaintenanceWindowTargetProps {
    val builder = CfnMaintenanceWindowTargetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMaintenanceWindowTargetTargetsProperty(block: CfnMaintenanceWindowTargetTargetsPropertyDsl.() -> Unit
      = {}): CfnMaintenanceWindowTarget.TargetsProperty {
    val builder = CfnMaintenanceWindowTargetTargetsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMaintenanceWindowTask(
    scope: Construct,
    id: String,
    block: CfnMaintenanceWindowTaskDsl.() -> Unit = {},
  ): CfnMaintenanceWindowTask {
    val builder = CfnMaintenanceWindowTaskDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMaintenanceWindowTaskCloudWatchOutputConfigProperty(block: CfnMaintenanceWindowTaskCloudWatchOutputConfigPropertyDsl.() -> Unit
      = {}): CfnMaintenanceWindowTask.CloudWatchOutputConfigProperty {
    val builder = CfnMaintenanceWindowTaskCloudWatchOutputConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMaintenanceWindowTaskLoggingInfoProperty(block: CfnMaintenanceWindowTaskLoggingInfoPropertyDsl.() -> Unit
      = {}): CfnMaintenanceWindowTask.LoggingInfoProperty {
    val builder = CfnMaintenanceWindowTaskLoggingInfoPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMaintenanceWindowTaskMaintenanceWindowAutomationParametersProperty(block: CfnMaintenanceWindowTaskMaintenanceWindowAutomationParametersPropertyDsl.() -> Unit
      = {}): CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty {
    val builder = CfnMaintenanceWindowTaskMaintenanceWindowAutomationParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMaintenanceWindowTaskMaintenanceWindowLambdaParametersProperty(block: CfnMaintenanceWindowTaskMaintenanceWindowLambdaParametersPropertyDsl.() -> Unit
      = {}): CfnMaintenanceWindowTask.MaintenanceWindowLambdaParametersProperty {
    val builder = CfnMaintenanceWindowTaskMaintenanceWindowLambdaParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMaintenanceWindowTaskMaintenanceWindowRunCommandParametersProperty(block: CfnMaintenanceWindowTaskMaintenanceWindowRunCommandParametersPropertyDsl.() -> Unit
      = {}): CfnMaintenanceWindowTask.MaintenanceWindowRunCommandParametersProperty {
    val builder = CfnMaintenanceWindowTaskMaintenanceWindowRunCommandParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMaintenanceWindowTaskMaintenanceWindowStepFunctionsParametersProperty(block: CfnMaintenanceWindowTaskMaintenanceWindowStepFunctionsParametersPropertyDsl.() -> Unit
      = {}): CfnMaintenanceWindowTask.MaintenanceWindowStepFunctionsParametersProperty {
    val builder = CfnMaintenanceWindowTaskMaintenanceWindowStepFunctionsParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMaintenanceWindowTaskNotificationConfigProperty(block: CfnMaintenanceWindowTaskNotificationConfigPropertyDsl.() -> Unit
      = {}): CfnMaintenanceWindowTask.NotificationConfigProperty {
    val builder = CfnMaintenanceWindowTaskNotificationConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMaintenanceWindowTaskProps(block: CfnMaintenanceWindowTaskPropsDsl.() -> Unit
      = {}): CfnMaintenanceWindowTaskProps {
    val builder = CfnMaintenanceWindowTaskPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMaintenanceWindowTaskTargetProperty(block: CfnMaintenanceWindowTaskTargetPropertyDsl.() -> Unit
      = {}): CfnMaintenanceWindowTask.TargetProperty {
    val builder = CfnMaintenanceWindowTaskTargetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMaintenanceWindowTaskTaskInvocationParametersProperty(block: CfnMaintenanceWindowTaskTaskInvocationParametersPropertyDsl.() -> Unit
      = {}): CfnMaintenanceWindowTask.TaskInvocationParametersProperty {
    val builder = CfnMaintenanceWindowTaskTaskInvocationParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnParameter(
    scope: Construct,
    id: String,
    block: CfnParameterDsl.() -> Unit = {},
  ): CfnParameter {
    val builder = CfnParameterDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnParameterProps(block: CfnParameterPropsDsl.() -> Unit = {}):
      CfnParameterProps {
    val builder = CfnParameterPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPatchBaseline(
    scope: Construct,
    id: String,
    block: CfnPatchBaselineDsl.() -> Unit = {},
  ): CfnPatchBaseline {
    val builder = CfnPatchBaselineDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPatchBaselinePatchFilterGroupProperty(block: CfnPatchBaselinePatchFilterGroupPropertyDsl.() -> Unit
      = {}): CfnPatchBaseline.PatchFilterGroupProperty {
    val builder = CfnPatchBaselinePatchFilterGroupPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPatchBaselinePatchFilterProperty(block: CfnPatchBaselinePatchFilterPropertyDsl.() -> Unit
      = {}): CfnPatchBaseline.PatchFilterProperty {
    val builder = CfnPatchBaselinePatchFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPatchBaselinePatchSourceProperty(block: CfnPatchBaselinePatchSourcePropertyDsl.() -> Unit
      = {}): CfnPatchBaseline.PatchSourceProperty {
    val builder = CfnPatchBaselinePatchSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPatchBaselineProps(block: CfnPatchBaselinePropsDsl.() -> Unit = {}):
      CfnPatchBaselineProps {
    val builder = CfnPatchBaselinePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPatchBaselineRuleGroupProperty(block: CfnPatchBaselineRuleGroupPropertyDsl.() -> Unit =
      {}): CfnPatchBaseline.RuleGroupProperty {
    val builder = CfnPatchBaselineRuleGroupPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPatchBaselineRuleProperty(block: CfnPatchBaselineRulePropertyDsl.() -> Unit =
      {}): CfnPatchBaseline.RuleProperty {
    val builder = CfnPatchBaselineRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourceDataSync(
    scope: Construct,
    id: String,
    block: CfnResourceDataSyncDsl.() -> Unit = {},
  ): CfnResourceDataSync {
    val builder = CfnResourceDataSyncDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceDataSyncAwsOrganizationsSourceProperty(block: CfnResourceDataSyncAwsOrganizationsSourcePropertyDsl.() -> Unit
      = {}): CfnResourceDataSync.AwsOrganizationsSourceProperty {
    val builder = CfnResourceDataSyncAwsOrganizationsSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourceDataSyncProps(block: CfnResourceDataSyncPropsDsl.() -> Unit = {}):
      CfnResourceDataSyncProps {
    val builder = CfnResourceDataSyncPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceDataSyncS3DestinationProperty(block: CfnResourceDataSyncS3DestinationPropertyDsl.() -> Unit
      = {}): CfnResourceDataSync.S3DestinationProperty {
    val builder = CfnResourceDataSyncS3DestinationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceDataSyncSyncSourceProperty(block: CfnResourceDataSyncSyncSourcePropertyDsl.() -> Unit
      = {}): CfnResourceDataSync.SyncSourceProperty {
    val builder = CfnResourceDataSyncSyncSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourcePolicy(
    scope: Construct,
    id: String,
    block: CfnResourcePolicyDsl.() -> Unit = {},
  ): CfnResourcePolicy {
    val builder = CfnResourcePolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourcePolicyProps(block: CfnResourcePolicyPropsDsl.() -> Unit = {}):
      CfnResourcePolicyProps {
    val builder = CfnResourcePolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun commonStringParameterAttributes(block: CommonStringParameterAttributesDsl.() -> Unit =
      {}): CommonStringParameterAttributes {
    val builder = CommonStringParameterAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun listParameterAttributes(block: ListParameterAttributesDsl.() -> Unit = {}):
      ListParameterAttributes {
    val builder = ListParameterAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun parameterOptions(block: ParameterOptionsDsl.() -> Unit = {}): ParameterOptions {
    val builder = ParameterOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun secureStringParameterAttributes(block: SecureStringParameterAttributesDsl.() -> Unit =
      {}): SecureStringParameterAttributes {
    val builder = SecureStringParameterAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun stringListParameter(
    scope: Construct,
    id: String,
    block: StringListParameterDsl.() -> Unit = {},
  ): StringListParameter {
    val builder = StringListParameterDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun stringListParameterProps(block: StringListParameterPropsDsl.() -> Unit = {}):
      StringListParameterProps {
    val builder = StringListParameterPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun stringParameter(
    scope: Construct,
    id: String,
    block: StringParameterDsl.() -> Unit = {},
  ): StringParameter {
    val builder = StringParameterDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun stringParameterAttributes(block: StringParameterAttributesDsl.() -> Unit = {}):
      StringParameterAttributes {
    val builder = StringParameterAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun stringParameterProps(block: StringParameterPropsDsl.() -> Unit = {}):
      StringParameterProps {
    val builder = StringParameterPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
