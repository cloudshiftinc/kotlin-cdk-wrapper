@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.stepfunctions

import io.cloudshiftdev.awscdkdsl.services.cloudwatch.MetricOptionsDsl
import io.cloudshiftdev.awscdkdsl.services.iam.PolicyStatementDsl
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

/**
 * Return the given named metric for this Activity.
 *
 * Default: sum over 5 minutes
 *
 * @param metricName
 * @param props
 */
public inline fun Activity.metric(
    metricName: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(metricName, builder.build())
}

/**
 * Metric for the number of times this activity fails.
 *
 * Default: sum over 5 minutes
 *
 * @param props
 */
public inline fun Activity.metricFailed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricFailed(builder.build())
}

/**
 * Metric for the number of times the heartbeat times out for this activity.
 *
 * Default: sum over 5 minutes
 *
 * @param props
 */
public inline fun Activity.metricHeartbeatTimedOut(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricHeartbeatTimedOut(builder.build())
}

/**
 * The interval, in milliseconds, between the time the activity starts and the time it closes.
 *
 * Default: average over 5 minutes
 *
 * @param props
 */
public inline fun Activity.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricRunTime(builder.build())
}

/**
 * The interval, in milliseconds, for which the activity stays in the schedule state.
 *
 * Default: average over 5 minutes
 *
 * @param props
 */
public inline fun Activity.metricScheduleTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricScheduleTime(builder.build())
}

/**
 * Metric for the number of times this activity is scheduled.
 *
 * Default: sum over 5 minutes
 *
 * @param props
 */
public inline fun Activity.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricScheduled(builder.build())
}

/**
 * Metric for the number of times this activity is started.
 *
 * Default: sum over 5 minutes
 *
 * @param props
 */
public inline fun Activity.metricStarted(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricStarted(builder.build())
}

/**
 * Metric for the number of times this activity succeeds.
 *
 * Default: sum over 5 minutes
 *
 * @param props
 */
public inline fun Activity.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricSucceeded(builder.build())
}

/**
 * The interval, in milliseconds, between the time the activity is scheduled and the time it closes.
 *
 * Default: average over 5 minutes
 *
 * @param props
 */
public inline fun Activity.metricTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTime(builder.build())
}

/**
 * Metric for the number of times this activity times out.
 *
 * Default: sum over 5 minutes
 *
 * @param props
 */
public inline fun Activity.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTimedOut(builder.build())
}

/** The name of the S3 bucket where the state machine definition is stored. */
public inline fun CfnStateMachine.setDefinitionS3Location(
    block: CfnStateMachineS3LocationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnStateMachineS3LocationPropertyDsl()
    builder.apply(block)
    return setDefinitionS3Location(builder.build())
}

/** Defines what execution history events are logged and where they are logged. */
public inline fun CfnStateMachine.setLoggingConfiguration(
    block: CfnStateMachineLoggingConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnStateMachineLoggingConfigurationPropertyDsl()
    builder.apply(block)
    return setLoggingConfiguration(builder.build())
}

/** Selects whether or not the state machine's AWS X-Ray tracing is enabled. */
public inline fun CfnStateMachine.setTracingConfiguration(
    block: CfnStateMachineTracingConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnStateMachineTracingConfigurationPropertyDsl()
    builder.apply(block)
    return setTracingConfiguration(builder.build())
}

/** The settings that enable gradual state machine deployments. */
public inline fun CfnStateMachineAlias.setDeploymentPreference(
    block: CfnStateMachineAliasDeploymentPreferencePropertyDsl.() -> Unit = {}
) {
    val builder = CfnStateMachineAliasDeploymentPreferencePropertyDsl()
    builder.apply(block)
    return setDeploymentPreference(builder.build())
}

/**
 * Return a single state that encompasses all states in the chain.
 *
 * This can be used to add error handling to a sequence of states.
 *
 * Be aware that this changes the result of the inner state machine to be an array with the result
 * of the state machine in it. Adjust your paths accordingly. For example, change 'outputPath' to
 * '$[0]'.
 *
 * @param id
 * @param props
 */
public inline fun Chain.toSingleState(
    id: String,
    block: ParallelPropsDsl.() -> Unit = {}
): Parallel {
    val builder = ParallelPropsDsl()
    builder.apply(block)
    return toSingleState(id, builder.build())
}

/**
 * @param scope
 * @param sfnPrincipal
 * @param sfnProps
 */
public inline fun ChainDefinitionBody.bind(
    scope: Construct,
    sfnPrincipal: IPrincipal,
    block: StateMachinePropsDsl.() -> Unit = {},
): DefinitionConfig {
    val builder = StateMachinePropsDsl()
    builder.apply(block)
    return bind(scope, sfnPrincipal, builder.build())
}

/**
 * Return a Chain that contains all reachable end states from this Choice.
 *
 * Use this to combine all possible choice paths back.
 *
 * @param options
 */
public inline fun Choice.afterwards(block: AfterwardsOptionsDsl.() -> Unit = {}): Chain {
    val builder = AfterwardsOptionsDsl()
    builder.apply(block)
    return afterwards(builder.build())
}

/**
 * @param scope
 * @param sfnPrincipal
 * @param sfnProps
 */
public inline fun DefinitionBody.bind(
    arg0: Construct,
    arg1: IPrincipal,
    block: StateMachinePropsDsl.() -> Unit = {},
): DefinitionConfig {
    val builder = StateMachinePropsDsl()
    builder.apply(block)
    return bind(arg0, arg1, builder.build())
}

/**
 * @param scope
 * @param _sfnPrincipal
 * @param _sfnProps
 */
public inline fun FileDefinitionBody.bind(
    scope: Construct,
    _sfnPrincipal: IPrincipal,
    block: StateMachinePropsDsl.() -> Unit = {},
): DefinitionConfig {
    val builder = StateMachinePropsDsl()
    builder.apply(block)
    return bind(scope, _sfnPrincipal, builder.build())
}

/**
 * Return the given named metric for this State Machine's executions.
 *
 * Default: - sum over 5 minutes
 *
 * @param metricName
 * @param props
 */
public inline fun IStateMachine.metric(
    arg0: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(arg0, builder.build())
}

/**
 * Metric for the number of executions that were aborted.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun IStateMachine.metricAborted(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricAborted(builder.build())
}

/**
 * Metric for the number of executions that failed.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun IStateMachine.metricFailed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricFailed(builder.build())
}

/**
 * Metric for the number of executions that were started.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun IStateMachine.metricStarted(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricStarted(builder.build())
}

/**
 * Metric for the number of executions that succeeded.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun IStateMachine.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricSucceeded(builder.build())
}

/**
 * Metric for the number of executions that were throttled.
 *
 * Default: sum over 5 minutes
 *
 * @param props
 */
public inline fun IStateMachine.metricThrottled(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricThrottled(builder.build())
}

/**
 * Metric for the interval, in milliseconds, between the time the execution starts and the time it
 * closes.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun IStateMachine.metricTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTime(builder.build())
}

/**
 * Metric for the number of executions that timed out.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun IStateMachine.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTimedOut(builder.build())
}

/**
 * Add a recovery handler for this state.
 *
 * When a particular error occurs, execution will continue at the error handler instead of failing
 * the state machine execution.
 *
 * @param handler
 * @param props
 */
public inline fun Map.addCatch(handler: IChainable, block: CatchPropsDsl.() -> Unit = {}): Map {
    val builder = CatchPropsDsl()
    builder.apply(block)
    return addCatch(handler, builder.build())
}

/**
 * Add retry configuration for this state.
 *
 * This controls if and how the execution will be retried if a particular error occurs.
 *
 * @param props
 */
public inline fun Map.addRetry(block: RetryPropsDsl.() -> Unit = {}): Map {
    val builder = RetryPropsDsl()
    builder.apply(block)
    return addRetry(builder.build())
}

/**
 * Add a recovery handler for this state.
 *
 * When a particular error occurs, execution will continue at the error handler instead of failing
 * the state machine execution.
 *
 * @param handler
 * @param props
 */
public inline fun Parallel.addCatch(
    handler: IChainable,
    block: CatchPropsDsl.() -> Unit = {}
): Parallel {
    val builder = CatchPropsDsl()
    builder.apply(block)
    return addCatch(handler, builder.build())
}

/**
 * Add retry configuration for this state.
 *
 * This controls if and how the execution will be retried if a particular error occurs.
 *
 * @param props
 */
public inline fun Parallel.addRetry(block: RetryPropsDsl.() -> Unit = {}): Parallel {
    val builder = RetryPropsDsl()
    builder.apply(block)
    return addRetry(builder.build())
}

/**
 * Register a Policy Statement used by states in this graph.
 *
 * @param statement
 */
public inline fun StateGraph.registerPolicyStatement(block: PolicyStatementDsl.() -> Unit = {}) {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return registerPolicyStatement(builder.build())
}

/**
 * Add the given statement to the role's policy.
 *
 * @param statement
 */
public inline fun StateMachine.addToRolePolicy(block: PolicyStatementDsl.() -> Unit = {}) {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToRolePolicy(builder.build())
}

/**
 * Return the given named metric for this State Machine's executions.
 *
 * Default: - sum over 5 minutes
 *
 * @param metricName
 * @param props
 */
public inline fun StateMachine.metric(
    metricName: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(metricName, builder.build())
}

/**
 * Metric for the number of executions that were aborted.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun StateMachine.metricAborted(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricAborted(builder.build())
}

/**
 * Metric for the number of executions that failed.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun StateMachine.metricFailed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricFailed(builder.build())
}

/**
 * Metric for the number of executions that were started.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun StateMachine.metricStarted(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricStarted(builder.build())
}

/**
 * Metric for the number of executions that succeeded.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun StateMachine.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricSucceeded(builder.build())
}

/**
 * Metric for the number of executions that were throttled.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun StateMachine.metricThrottled(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricThrottled(builder.build())
}

/**
 * Metric for the interval, in milliseconds, between the time the execution starts and the time it
 * closes.
 *
 * Default: - average over 5 minutes
 *
 * @param props
 */
public inline fun StateMachine.metricTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTime(builder.build())
}

/**
 * Metric for the number of executions that timed out.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun StateMachine.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTimedOut(builder.build())
}

/**
 * Wrap all states in this state machine fragment up into a single state.
 *
 * This can be used to add retry or error handling onto this state machine fragment.
 *
 * Be aware that this changes the result of the inner state machine to be an array with the result
 * of the state machine in it. Adjust your paths accordingly. For example, change 'outputPath' to
 * '$[0]'.
 *
 * @param options
 */
public inline fun StateMachineFragment.toSingleState(
    block: SingleStateOptionsDsl.() -> Unit = {}
): Parallel {
    val builder = SingleStateOptionsDsl()
    builder.apply(block)
    return toSingleState(builder.build())
}

/**
 * @param _scope
 * @param _sfnPrincipal
 * @param _sfnProps
 */
public inline fun StringDefinitionBody.bind(
    _scope: Construct,
    _sfnPrincipal: IPrincipal,
    block: StateMachinePropsDsl.() -> Unit = {},
): DefinitionConfig {
    val builder = StateMachinePropsDsl()
    builder.apply(block)
    return bind(_scope, _sfnPrincipal, builder.build())
}

/**
 * Add a recovery handler for this state.
 *
 * When a particular error occurs, execution will continue at the error handler instead of failing
 * the state machine execution.
 *
 * @param handler
 * @param props
 */
public inline fun TaskStateBase.addCatch(
    handler: IChainable,
    block: CatchPropsDsl.() -> Unit = {}
): TaskStateBase {
    val builder = CatchPropsDsl()
    builder.apply(block)
    return addCatch(handler, builder.build())
}

/**
 * Add retry configuration for this state.
 *
 * This controls if and how the execution will be retried if a particular error occurs.
 *
 * @param props
 */
public inline fun TaskStateBase.addRetry(block: RetryPropsDsl.() -> Unit = {}): TaskStateBase {
    val builder = RetryPropsDsl()
    builder.apply(block)
    return addRetry(builder.build())
}

/**
 * Return the given named metric for this Task.
 *
 * Default: - sum over 5 minutes
 *
 * @param metricName
 * @param props
 */
public inline fun TaskStateBase.metric(
    metricName: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(metricName, builder.build())
}

/**
 * Metric for the number of times this activity fails.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun TaskStateBase.metricFailed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricFailed(builder.build())
}

/**
 * Metric for the number of times the heartbeat times out for this activity.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun TaskStateBase.metricHeartbeatTimedOut(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricHeartbeatTimedOut(builder.build())
}

/**
 * The interval, in milliseconds, between the time the Task starts and the time it closes.
 *
 * Default: - average over 5 minutes
 *
 * @param props
 */
public inline fun TaskStateBase.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricRunTime(builder.build())
}

/**
 * The interval, in milliseconds, for which the activity stays in the schedule state.
 *
 * Default: - average over 5 minutes
 *
 * @param props
 */
public inline fun TaskStateBase.metricScheduleTime(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricScheduleTime(builder.build())
}

/**
 * Metric for the number of times this activity is scheduled.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun TaskStateBase.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricScheduled(builder.build())
}

/**
 * Metric for the number of times this activity is started.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun TaskStateBase.metricStarted(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricStarted(builder.build())
}

/**
 * Metric for the number of times this activity succeeds.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun TaskStateBase.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricSucceeded(builder.build())
}

/**
 * The interval, in milliseconds, between the time the activity is scheduled and the time it closes.
 *
 * Default: - average over 5 minutes
 *
 * @param props
 */
public inline fun TaskStateBase.metricTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTime(builder.build())
}

/**
 * Metric for the number of times this activity times out.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun TaskStateBase.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTimedOut(builder.build())
}
