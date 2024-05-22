@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import com.fasterxml.jackson.databind.node.ObjectNode
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Define a Task state in the state machine.
 *
 * Reaching a Task state causes some work to be executed, represented by the
 * Task's resource property. Task constructs represent a generic Amazon
 * States Language Task.
 *
 * For some resource types, more specific subclasses of Task may be available
 * which are more convenient to use.
 */
public abstract class TaskStateBase(
  cdkObject: software.amazon.awscdk.services.stepfunctions.TaskStateBase,
) : State(cdkObject), INextable {
  /**
   * Add a recovery handler for this state.
   *
   * When a particular error occurs, execution will continue at the error
   * handler instead of failing the state machine execution.
   *
   * @param handler 
   * @param props
   */
  public open fun addCatch(handler: IChainable): TaskStateBase =
      unwrap(this).addCatch(handler.let(IChainable.Companion::unwrap)).let(TaskStateBase::wrap)

  /**
   * Add a recovery handler for this state.
   *
   * When a particular error occurs, execution will continue at the error
   * handler instead of failing the state machine execution.
   *
   * @param handler 
   * @param props
   */
  public open fun addCatch(handler: IChainable, props: CatchProps): TaskStateBase =
      unwrap(this).addCatch(handler.let(IChainable.Companion::unwrap),
      props.let(CatchProps.Companion::unwrap)).let(TaskStateBase::wrap)

  /**
   * Add a recovery handler for this state.
   *
   * When a particular error occurs, execution will continue at the error
   * handler instead of failing the state machine execution.
   *
   * @param handler 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a6004cbe6a400306cfc6c7299ff400639d48d0ae94c7bda7e13f49ce2bd06213")
  public open fun addCatch(handler: IChainable, props: CatchProps.Builder.() -> Unit): TaskStateBase
      = addCatch(handler, CatchProps(props))

  /**
   * Add retry configuration for this state.
   *
   * This controls if and how the execution will be retried if a particular
   * error occurs.
   *
   * @param props
   */
  public open fun addRetry(): TaskStateBase = unwrap(this).addRetry().let(TaskStateBase::wrap)

  /**
   * Add retry configuration for this state.
   *
   * This controls if and how the execution will be retried if a particular
   * error occurs.
   *
   * @param props
   */
  public open fun addRetry(props: RetryProps): TaskStateBase =
      unwrap(this).addRetry(props.let(RetryProps.Companion::unwrap)).let(TaskStateBase::wrap)

  /**
   * Add retry configuration for this state.
   *
   * This controls if and how the execution will be retried if a particular
   * error occurs.
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ca39654a3e251c29a9135694eec60462c8cfea3f52c068225f63221a1ca0d8e9")
  public open fun addRetry(props: RetryProps.Builder.() -> Unit): TaskStateBase =
      addRetry(RetryProps(props))

  /**
   * Continuable states of this Chainable.
   */
  public override fun endStates(): List<INextable> =
      unwrap(this).getEndStates().map(INextable::wrap)

  /**
   * Return the given named metric for this Task.
   *
   * Default: - sum over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  public open fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  /**
   * Return the given named metric for this Task.
   *
   * Default: - sum over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  public open fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Return the given named metric for this Task.
   *
   * Default: - sum over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public open fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  /**
   * Metric for the number of times this activity fails.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public open fun metricFailed(): Metric = unwrap(this).metricFailed().let(Metric::wrap)

  /**
   * Metric for the number of times this activity fails.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public open fun metricFailed(props: MetricOptions): Metric =
      unwrap(this).metricFailed(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of times this activity fails.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("77b08980238672e6993c3f66793561b32ef5e0bc06ae223d9b428a4d61de3ce0")
  public open fun metricFailed(props: MetricOptions.Builder.() -> Unit): Metric =
      metricFailed(MetricOptions(props))

  /**
   * Metric for the number of times the heartbeat times out for this activity.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public open fun metricHeartbeatTimedOut(): Metric =
      unwrap(this).metricHeartbeatTimedOut().let(Metric::wrap)

  /**
   * Metric for the number of times the heartbeat times out for this activity.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public open fun metricHeartbeatTimedOut(props: MetricOptions): Metric =
      unwrap(this).metricHeartbeatTimedOut(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of times the heartbeat times out for this activity.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e3912384df6fb587488102780ccc376cd7a0166ad9712836974967b5b86d8905")
  public open fun metricHeartbeatTimedOut(props: MetricOptions.Builder.() -> Unit): Metric =
      metricHeartbeatTimedOut(MetricOptions(props))

  /**
   * The interval, in milliseconds, between the time the Task starts and the time it closes.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public open fun metricRunTime(): Metric = unwrap(this).metricRunTime().let(Metric::wrap)

  /**
   * The interval, in milliseconds, between the time the Task starts and the time it closes.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public open fun metricRunTime(props: MetricOptions): Metric =
      unwrap(this).metricRunTime(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * The interval, in milliseconds, between the time the Task starts and the time it closes.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a720f6327ddac06ea2b6b72ef8667080144354436cc88b4d9f6596c2fed04c7e")
  public open fun metricRunTime(props: MetricOptions.Builder.() -> Unit): Metric =
      metricRunTime(MetricOptions(props))

  /**
   * The interval, in milliseconds, for which the activity stays in the schedule state.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public open fun metricScheduleTime(): Metric = unwrap(this).metricScheduleTime().let(Metric::wrap)

  /**
   * The interval, in milliseconds, for which the activity stays in the schedule state.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public open fun metricScheduleTime(props: MetricOptions): Metric =
      unwrap(this).metricScheduleTime(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * The interval, in milliseconds, for which the activity stays in the schedule state.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("118c1d18fd240b3346289b0296c6b9bd6ee618c5a736515b9ed3fbe960f17d5c")
  public open fun metricScheduleTime(props: MetricOptions.Builder.() -> Unit): Metric =
      metricScheduleTime(MetricOptions(props))

  /**
   * Metric for the number of times this activity is scheduled.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public open fun metricScheduled(): Metric = unwrap(this).metricScheduled().let(Metric::wrap)

  /**
   * Metric for the number of times this activity is scheduled.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public open fun metricScheduled(props: MetricOptions): Metric =
      unwrap(this).metricScheduled(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of times this activity is scheduled.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("64a416a081236179f16c4bad1d7eb27b168a86328c05a5708c51f088629ecd9e")
  public open fun metricScheduled(props: MetricOptions.Builder.() -> Unit): Metric =
      metricScheduled(MetricOptions(props))

  /**
   * Metric for the number of times this activity is started.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public open fun metricStarted(): Metric = unwrap(this).metricStarted().let(Metric::wrap)

  /**
   * Metric for the number of times this activity is started.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public open fun metricStarted(props: MetricOptions): Metric =
      unwrap(this).metricStarted(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of times this activity is started.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e1ebc99af7cef84c169ce01dd77e3ccc212ac8f545ac9fd06b542ea6846664d6")
  public open fun metricStarted(props: MetricOptions.Builder.() -> Unit): Metric =
      metricStarted(MetricOptions(props))

  /**
   * Metric for the number of times this activity succeeds.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public open fun metricSucceeded(): Metric = unwrap(this).metricSucceeded().let(Metric::wrap)

  /**
   * Metric for the number of times this activity succeeds.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public open fun metricSucceeded(props: MetricOptions): Metric =
      unwrap(this).metricSucceeded(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of times this activity succeeds.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bdb5db9e6445d6f95a595109612453c12c26d01ea7b090464e7e3dc89616ec56")
  public open fun metricSucceeded(props: MetricOptions.Builder.() -> Unit): Metric =
      metricSucceeded(MetricOptions(props))

  /**
   * The interval, in milliseconds, between the time the activity is scheduled and the time it
   * closes.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public open fun metricTime(): Metric = unwrap(this).metricTime().let(Metric::wrap)

  /**
   * The interval, in milliseconds, between the time the activity is scheduled and the time it
   * closes.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public open fun metricTime(props: MetricOptions): Metric =
      unwrap(this).metricTime(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * The interval, in milliseconds, between the time the activity is scheduled and the time it
   * closes.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5df675ca191cf25c705e41cbbe4a5bb82c59b7b2cea749f3081d5accbcbde5b2")
  public open fun metricTime(props: MetricOptions.Builder.() -> Unit): Metric =
      metricTime(MetricOptions(props))

  /**
   * Metric for the number of times this activity times out.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public open fun metricTimedOut(): Metric = unwrap(this).metricTimedOut().let(Metric::wrap)

  /**
   * Metric for the number of times this activity times out.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public open fun metricTimedOut(props: MetricOptions): Metric =
      unwrap(this).metricTimedOut(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of times this activity times out.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1d95fc9b8d64b0d9c0b67a1b010670a63ced883a6bf5b9a5d36c3474119fb181")
  public open fun metricTimedOut(props: MetricOptions.Builder.() -> Unit): Metric =
      metricTimedOut(MetricOptions(props))

  /**
   * Continue normal execution with the given state.
   *
   * @param next 
   */
  public override fun next(next: IChainable): Chain =
      unwrap(this).next(next.let(IChainable.Companion::unwrap)).let(Chain::wrap)

  /**
   * Return the Amazon States Language object for this state.
   */
  public override fun toStateJson(): ObjectNode = unwrap(this).toStateJson()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.TaskStateBase,
  ) : TaskStateBase(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.TaskStateBase):
        TaskStateBase = CdkObjectWrappers.wrap(cdkObject) as? TaskStateBase ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: TaskStateBase):
        software.amazon.awscdk.services.stepfunctions.TaskStateBase = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.TaskStateBase
  }
}
