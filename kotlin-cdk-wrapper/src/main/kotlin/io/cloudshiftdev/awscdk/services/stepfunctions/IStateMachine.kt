@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A State Machine.
 */
public interface IStateMachine : IResource, IGrantable {
  /**
   * Grant the given identity custom permissions.
   *
   * @param identity The principal. 
   * @param actions The list of desired actions. 
   */
  public fun grant(identity: IGrantable, actions: String): Grant

  /**
   * Grant the given identity permissions for all executions of a state machine.
   *
   * @param identity The principal. 
   * @param actions The list of desired actions. 
   */
  public fun grantExecution(identity: IGrantable, actions: String): Grant

  /**
   * Grant the given identity read permissions for this state machine.
   *
   * @param identity The principal. 
   */
  public fun grantRead(identity: IGrantable): Grant

  /**
   * Grant the given identity permissions to start an execution of this state machine.
   *
   * @param identity The principal. 
   */
  public fun grantStartExecution(identity: IGrantable): Grant

  /**
   * Grant the given identity permissions to start a synchronous execution of this state machine.
   *
   * @param identity The principal. 
   */
  public fun grantStartSyncExecution(identity: IGrantable): Grant

  /**
   * Grant the given identity read permissions for this state machine.
   *
   * @param identity The principal. 
   */
  public fun grantTaskResponse(identity: IGrantable): Grant

  /**
   * Return the given named metric for this State Machine's executions.
   *
   * Default: - sum over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  public fun metric(metricName: String): Metric

  /**
   * Return the given named metric for this State Machine's executions.
   *
   * Default: - sum over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  public fun metric(metricName: String, props: MetricOptions): Metric

  /**
   * Return the given named metric for this State Machine's executions.
   *
   * Default: - sum over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the number of executions that were aborted.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricAborted(): Metric

  /**
   * Metric for the number of executions that were aborted.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricAborted(props: MetricOptions): Metric

  /**
   * Metric for the number of executions that were aborted.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5691ff27197238df39362c2b0c7fcda013220a77fbd28083b3eb441003bad3ad")
  public fun metricAborted(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the number of executions that failed.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricFailed(): Metric

  /**
   * Metric for the number of executions that failed.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricFailed(props: MetricOptions): Metric

  /**
   * Metric for the number of executions that failed.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("77b08980238672e6993c3f66793561b32ef5e0bc06ae223d9b428a4d61de3ce0")
  public fun metricFailed(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the number of executions that were started.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricStarted(): Metric

  /**
   * Metric for the number of executions that were started.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricStarted(props: MetricOptions): Metric

  /**
   * Metric for the number of executions that were started.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e1ebc99af7cef84c169ce01dd77e3ccc212ac8f545ac9fd06b542ea6846664d6")
  public fun metricStarted(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the number of executions that succeeded.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricSucceeded(): Metric

  /**
   * Metric for the number of executions that succeeded.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricSucceeded(props: MetricOptions): Metric

  /**
   * Metric for the number of executions that succeeded.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bdb5db9e6445d6f95a595109612453c12c26d01ea7b090464e7e3dc89616ec56")
  public fun metricSucceeded(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the number of executions that were throttled.
   *
   * Default: sum over 5 minutes
   *
   * @param props
   */
  public fun metricThrottled(): Metric

  /**
   * Metric for the number of executions that were throttled.
   *
   * Default: sum over 5 minutes
   *
   * @param props
   */
  public fun metricThrottled(props: MetricOptions): Metric

  /**
   * Metric for the number of executions that were throttled.
   *
   * Default: sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3dc5007387bd1ba5d6a1dfdabfca1dd0b5a1b0aa5f64579f63cfdd20c4ba29ca")
  public fun metricThrottled(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the interval, in milliseconds, between the time the execution starts and the time it
   * closes.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricTime(): Metric

  /**
   * Metric for the interval, in milliseconds, between the time the execution starts and the time it
   * closes.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricTime(props: MetricOptions): Metric

  /**
   * Metric for the interval, in milliseconds, between the time the execution starts and the time it
   * closes.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5df675ca191cf25c705e41cbbe4a5bb82c59b7b2cea749f3081d5accbcbde5b2")
  public fun metricTime(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the number of executions that timed out.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricTimedOut(): Metric

  /**
   * Metric for the number of executions that timed out.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricTimedOut(props: MetricOptions): Metric

  /**
   * Metric for the number of executions that timed out.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1d95fc9b8d64b0d9c0b67a1b010670a63ced883a6bf5b9a5d36c3474119fb181")
  public fun metricTimedOut(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The ARN of the state machine.
   */
  public fun stateMachineArn(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.IStateMachine):
        IStateMachine = CdkObjectWrappers.wrap(cdkObject) as IStateMachine

    internal fun unwrap(wrapped: IStateMachine):
        software.amazon.awscdk.services.stepfunctions.IStateMachine = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.IStateMachine
  }
}
