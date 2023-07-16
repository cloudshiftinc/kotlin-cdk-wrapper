@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.Activity
import software.amazon.awscdk.services.stepfunctions.ActivityProps
import software.amazon.awscdk.services.stepfunctions.AfterwardsOptions
import software.amazon.awscdk.services.stepfunctions.CatchProps
import software.amazon.awscdk.services.stepfunctions.CfnActivity
import software.amazon.awscdk.services.stepfunctions.CfnActivityProps
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineAliasProps
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersion
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersionProps
import software.amazon.awscdk.services.stepfunctions.Choice
import software.amazon.awscdk.services.stepfunctions.ChoiceProps
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.CustomState
import software.amazon.awscdk.services.stepfunctions.CustomStateProps
import software.amazon.awscdk.services.stepfunctions.DefinitionConfig
import software.amazon.awscdk.services.stepfunctions.Fail
import software.amazon.awscdk.services.stepfunctions.FailProps
import software.amazon.awscdk.services.stepfunctions.FileDefinitionBody
import software.amazon.awscdk.services.stepfunctions.FindStateOptions
import software.amazon.awscdk.services.stepfunctions.LogOptions
import software.amazon.awscdk.services.stepfunctions.Map
import software.amazon.awscdk.services.stepfunctions.MapProps
import software.amazon.awscdk.services.stepfunctions.Parallel
import software.amazon.awscdk.services.stepfunctions.ParallelProps
import software.amazon.awscdk.services.stepfunctions.Pass
import software.amazon.awscdk.services.stepfunctions.PassProps
import software.amazon.awscdk.services.stepfunctions.RetryProps
import software.amazon.awscdk.services.stepfunctions.SingleStateOptions
import software.amazon.awscdk.services.stepfunctions.StateMachine
import software.amazon.awscdk.services.stepfunctions.StateMachineProps
import software.amazon.awscdk.services.stepfunctions.StateProps
import software.amazon.awscdk.services.stepfunctions.Succeed
import software.amazon.awscdk.services.stepfunctions.SucceedProps
import software.amazon.awscdk.services.stepfunctions.TaskMetricsConfig
import software.amazon.awscdk.services.stepfunctions.TaskStateBaseProps
import software.amazon.awscdk.services.stepfunctions.Wait
import software.amazon.awscdk.services.stepfunctions.WaitProps
import software.constructs.Construct

public object stepfunctions {
  public inline fun activity(
    scope: Construct,
    id: String,
    block: ActivityDsl.() -> Unit = {},
  ): Activity {
    val builder = ActivityDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun activityProps(block: ActivityPropsDsl.() -> Unit = {}): ActivityProps {
    val builder = ActivityPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun afterwardsOptions(block: AfterwardsOptionsDsl.() -> Unit = {}):
      AfterwardsOptions {
    val builder = AfterwardsOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun catchProps(block: CatchPropsDsl.() -> Unit = {}): CatchProps {
    val builder = CatchPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnActivity(
    scope: Construct,
    id: String,
    block: CfnActivityDsl.() -> Unit = {},
  ): CfnActivity {
    val builder = CfnActivityDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnActivityProps(block: CfnActivityPropsDsl.() -> Unit = {}): CfnActivityProps {
    val builder = CfnActivityPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnActivityTagsEntryProperty(block: CfnActivityTagsEntryPropertyDsl.() -> Unit =
      {}): CfnActivity.TagsEntryProperty {
    val builder = CfnActivityTagsEntryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStateMachine(
    scope: Construct,
    id: String,
    block: CfnStateMachineDsl.() -> Unit = {},
  ): CfnStateMachine {
    val builder = CfnStateMachineDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStateMachineAlias(
    scope: Construct,
    id: String,
    block: CfnStateMachineAliasDsl.() -> Unit = {},
  ): CfnStateMachineAlias {
    val builder = CfnStateMachineAliasDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStateMachineAliasDeploymentPreferenceProperty(block: CfnStateMachineAliasDeploymentPreferencePropertyDsl.() -> Unit
      = {}): CfnStateMachineAlias.DeploymentPreferenceProperty {
    val builder = CfnStateMachineAliasDeploymentPreferencePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStateMachineAliasProps(block: CfnStateMachineAliasPropsDsl.() -> Unit = {}):
      CfnStateMachineAliasProps {
    val builder = CfnStateMachineAliasPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStateMachineAliasRoutingConfigurationVersionProperty(block: CfnStateMachineAliasRoutingConfigurationVersionPropertyDsl.() -> Unit
      = {}): CfnStateMachineAlias.RoutingConfigurationVersionProperty {
    val builder = CfnStateMachineAliasRoutingConfigurationVersionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStateMachineCloudWatchLogsLogGroupProperty(block: CfnStateMachineCloudWatchLogsLogGroupPropertyDsl.() -> Unit
      = {}): CfnStateMachine.CloudWatchLogsLogGroupProperty {
    val builder = CfnStateMachineCloudWatchLogsLogGroupPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStateMachineLogDestinationProperty(block: CfnStateMachineLogDestinationPropertyDsl.() -> Unit
      = {}): CfnStateMachine.LogDestinationProperty {
    val builder = CfnStateMachineLogDestinationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStateMachineLoggingConfigurationProperty(block: CfnStateMachineLoggingConfigurationPropertyDsl.() -> Unit
      = {}): CfnStateMachine.LoggingConfigurationProperty {
    val builder = CfnStateMachineLoggingConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStateMachineProps(block: CfnStateMachinePropsDsl.() -> Unit = {}):
      CfnStateMachineProps {
    val builder = CfnStateMachinePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStateMachineS3LocationProperty(block: CfnStateMachineS3LocationPropertyDsl.() -> Unit =
      {}): CfnStateMachine.S3LocationProperty {
    val builder = CfnStateMachineS3LocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStateMachineTagsEntryProperty(block: CfnStateMachineTagsEntryPropertyDsl.() -> Unit =
      {}): CfnStateMachine.TagsEntryProperty {
    val builder = CfnStateMachineTagsEntryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStateMachineTracingConfigurationProperty(block: CfnStateMachineTracingConfigurationPropertyDsl.() -> Unit
      = {}): CfnStateMachine.TracingConfigurationProperty {
    val builder = CfnStateMachineTracingConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStateMachineVersion(
    scope: Construct,
    id: String,
    block: CfnStateMachineVersionDsl.() -> Unit = {},
  ): CfnStateMachineVersion {
    val builder = CfnStateMachineVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStateMachineVersionProps(block: CfnStateMachineVersionPropsDsl.() -> Unit =
      {}): CfnStateMachineVersionProps {
    val builder = CfnStateMachineVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun choice(
    scope: Construct,
    id: String,
    block: ChoiceDsl.() -> Unit = {},
  ): Choice {
    val builder = ChoiceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun choiceProps(block: ChoicePropsDsl.() -> Unit = {}): ChoiceProps {
    val builder = ChoicePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun credentials(block: CredentialsDsl.() -> Unit = {}): Credentials {
    val builder = CredentialsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun customState(
    scope: Construct,
    id: String,
    block: CustomStateDsl.() -> Unit = {},
  ): CustomState {
    val builder = CustomStateDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun customStateProps(block: CustomStatePropsDsl.() -> Unit = {}): CustomStateProps {
    val builder = CustomStatePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun definitionConfig(block: DefinitionConfigDsl.() -> Unit = {}): DefinitionConfig {
    val builder = DefinitionConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun fail(
    scope: Construct,
    id: String,
    block: FailDsl.() -> Unit = {},
  ): Fail {
    val builder = FailDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun failProps(block: FailPropsDsl.() -> Unit = {}): FailProps {
    val builder = FailPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun fileDefinitionBody(arg0: String, block: FileDefinitionBodyDsl.() -> Unit = {}):
      FileDefinitionBody {
    val builder = FileDefinitionBodyDsl(arg0)
    builder.apply(block)
    return builder.build()
  }

  public inline fun findStateOptions(block: FindStateOptionsDsl.() -> Unit = {}): FindStateOptions {
    val builder = FindStateOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun logOptions(block: LogOptionsDsl.() -> Unit = {}): LogOptions {
    val builder = LogOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun map(
    scope: Construct,
    id: String,
    block: MapDsl.() -> Unit = {},
  ): Map {
    val builder = MapDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun mapProps(block: MapPropsDsl.() -> Unit = {}): MapProps {
    val builder = MapPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun parallel(
    scope: Construct,
    id: String,
    block: ParallelDsl.() -> Unit = {},
  ): Parallel {
    val builder = ParallelDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun parallelProps(block: ParallelPropsDsl.() -> Unit = {}): ParallelProps {
    val builder = ParallelPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun pass(
    scope: Construct,
    id: String,
    block: PassDsl.() -> Unit = {},
  ): Pass {
    val builder = PassDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun passProps(block: PassPropsDsl.() -> Unit = {}): PassProps {
    val builder = PassPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun retryProps(block: RetryPropsDsl.() -> Unit = {}): RetryProps {
    val builder = RetryPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun singleStateOptions(block: SingleStateOptionsDsl.() -> Unit = {}):
      SingleStateOptions {
    val builder = SingleStateOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun stateMachine(
    scope: Construct,
    id: String,
    block: StateMachineDsl.() -> Unit = {},
  ): StateMachine {
    val builder = StateMachineDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun stateMachineProps(block: StateMachinePropsDsl.() -> Unit = {}):
      StateMachineProps {
    val builder = StateMachinePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun stateProps(block: StatePropsDsl.() -> Unit = {}): StateProps {
    val builder = StatePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun succeed(
    scope: Construct,
    id: String,
    block: SucceedDsl.() -> Unit = {},
  ): Succeed {
    val builder = SucceedDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun succeedProps(block: SucceedPropsDsl.() -> Unit = {}): SucceedProps {
    val builder = SucceedPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun taskMetricsConfig(block: TaskMetricsConfigDsl.() -> Unit = {}):
      TaskMetricsConfig {
    val builder = TaskMetricsConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun taskStateBaseProps(block: TaskStateBasePropsDsl.() -> Unit = {}):
      TaskStateBaseProps {
    val builder = TaskStateBasePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun wait(
    scope: Construct,
    id: String,
    block: WaitDsl.() -> Unit = {},
  ): Wait {
    val builder = WaitDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun waitProps(block: WaitPropsDsl.() -> Unit = {}): WaitProps {
    val builder = WaitPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
