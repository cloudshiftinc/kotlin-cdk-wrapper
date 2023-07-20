@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.iam.IPrincipal
import software.amazon.awscdk.services.stepfunctions.Activity
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias
import software.amazon.awscdk.services.stepfunctions.Chain
import software.amazon.awscdk.services.stepfunctions.ChainDefinitionBody
import software.amazon.awscdk.services.stepfunctions.Choice
import software.amazon.awscdk.services.stepfunctions.DefinitionBody
import software.amazon.awscdk.services.stepfunctions.DefinitionConfig
import software.amazon.awscdk.services.stepfunctions.FileDefinitionBody
import software.amazon.awscdk.services.stepfunctions.IChainable
import software.amazon.awscdk.services.stepfunctions.IStateMachine
import software.amazon.awscdk.services.stepfunctions.Map
import software.amazon.awscdk.services.stepfunctions.Parallel
import software.amazon.awscdk.services.stepfunctions.StateGraph
import software.amazon.awscdk.services.stepfunctions.StateMachine
import software.amazon.awscdk.services.stepfunctions.StateMachineFragment
import software.amazon.awscdk.services.stepfunctions.StringDefinitionBody
import software.amazon.awscdk.services.stepfunctions.TaskStateBase
import software.constructs.Construct

public inline fun Activity.metric(metricName: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(metricName, builder.build())
}

public inline fun Activity.metricFailed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline fun Activity.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun Activity.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun Activity.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun Activity.metricScheduleTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun Activity.metricStarted(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun Activity.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun Activity.metricTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun Activity.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun ChainDefinitionBody.bind(
  scope: Construct,
  sfnPrincipal: IPrincipal,
  block: StateMachinePropsDsl.() -> Unit = {},
): DefinitionConfig {
  val builder = StateMachinePropsDsl()
  builder.apply(block)
  return bind(scope, sfnPrincipal, builder.build())
}

public inline fun Map.addCatch(handler: IChainable, block: CatchPropsDsl.() -> Unit = {}): Map {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(handler, builder.build())
}

public inline fun Map.addRetry(block: RetryPropsDsl.() -> Unit = {}): Map {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun IStateMachine.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0, builder.build())
}

public inline fun IStateMachine.metricAborted(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricAborted(builder.build())
}

public inline fun IStateMachine.metricFailed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline fun IStateMachine.metricStarted(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun IStateMachine.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun IStateMachine.metricThrottled(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricThrottled(builder.build())
}

public inline fun IStateMachine.metricTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun IStateMachine.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun StateMachineFragment.toSingleState(block: SingleStateOptionsDsl.() -> Unit = {}):
    Parallel {
  val builder = SingleStateOptionsDsl()
  builder.apply(block)
  return toSingleState(builder.build())
}

public inline fun StringDefinitionBody.bind(
  _scope: Construct,
  _sfnPrincipal: IPrincipal,
  block: StateMachinePropsDsl.() -> Unit = {},
): DefinitionConfig {
  val builder = StateMachinePropsDsl()
  builder.apply(block)
  return bind(_scope, _sfnPrincipal, builder.build())
}

public inline fun StateGraph.registerPolicyStatement(block: PolicyStatementDsl.() -> Unit = {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return registerPolicyStatement(builder.build())
}

public inline fun Choice.afterwards(block: AfterwardsOptionsDsl.() -> Unit = {}): Chain {
  val builder = AfterwardsOptionsDsl()
  builder.apply(block)
  return afterwards(builder.build())
}

public inline
    fun CfnStateMachine.setDefinitionS3Location(block: CfnStateMachineS3LocationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnStateMachineS3LocationPropertyDsl()
  builder.apply(block)
  return setDefinitionS3Location(builder.build())
}

public inline
    fun CfnStateMachine.setLoggingConfiguration(block: CfnStateMachineLoggingConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnStateMachineLoggingConfigurationPropertyDsl()
  builder.apply(block)
  return setLoggingConfiguration(builder.build())
}

public inline
    fun CfnStateMachine.setTracingConfiguration(block: CfnStateMachineTracingConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnStateMachineTracingConfigurationPropertyDsl()
  builder.apply(block)
  return setTracingConfiguration(builder.build())
}

public inline
    fun CfnStateMachineAlias.setDeploymentPreference(block: CfnStateMachineAliasDeploymentPreferencePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnStateMachineAliasDeploymentPreferencePropertyDsl()
  builder.apply(block)
  return setDeploymentPreference(builder.build())
}

public inline fun DefinitionBody.bind(
  arg0: Construct,
  arg1: IPrincipal,
  block: StateMachinePropsDsl.() -> Unit = {},
): DefinitionConfig {
  val builder = StateMachinePropsDsl()
  builder.apply(block)
  return bind(arg0, arg1, builder.build())
}

public inline fun Parallel.addCatch(handler: IChainable, block: CatchPropsDsl.() -> Unit = {}):
    Parallel {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(handler, builder.build())
}

public inline fun Parallel.addRetry(block: RetryPropsDsl.() -> Unit = {}): Parallel {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun Chain.toSingleState(id: String, block: ParallelPropsDsl.() -> Unit = {}):
    Parallel {
  val builder = ParallelPropsDsl()
  builder.apply(block)
  return toSingleState(id, builder.build())
}

public inline fun TaskStateBase.addCatch(handler: IChainable, block: CatchPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(handler, builder.build())
}

public inline fun TaskStateBase.addRetry(block: RetryPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun TaskStateBase.metric(metricName: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(metricName, builder.build())
}

public inline fun TaskStateBase.metricFailed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline fun TaskStateBase.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun TaskStateBase.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun TaskStateBase.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun TaskStateBase.metricScheduleTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun TaskStateBase.metricStarted(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun TaskStateBase.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun TaskStateBase.metricTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun TaskStateBase.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun FileDefinitionBody.bind(
  scope: Construct,
  _sfnPrincipal: IPrincipal,
  block: StateMachinePropsDsl.() -> Unit = {},
): DefinitionConfig {
  val builder = StateMachinePropsDsl()
  builder.apply(block)
  return bind(scope, _sfnPrincipal, builder.build())
}

public inline fun StateMachine.addToRolePolicy(block: PolicyStatementDsl.() -> Unit = {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToRolePolicy(builder.build())
}

public inline fun StateMachine.metric(metricName: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(metricName, builder.build())
}

public inline fun StateMachine.metricAborted(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricAborted(builder.build())
}

public inline fun StateMachine.metricFailed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline fun StateMachine.metricStarted(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun StateMachine.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun StateMachine.metricThrottled(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricThrottled(builder.build())
}

public inline fun StateMachine.metricTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun StateMachine.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}
