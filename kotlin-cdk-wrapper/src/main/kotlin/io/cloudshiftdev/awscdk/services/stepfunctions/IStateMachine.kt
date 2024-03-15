@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.constructs.Node
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.IStateMachine,
  ) : CdkObject(cdkObject), IStateMachine {
    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
    }

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * Grant the given identity custom permissions.
     *
     * @param identity The principal. 
     * @param actions The list of desired actions. 
     */
    override fun grant(identity: IGrantable, actions: String): Grant =
        unwrap(this).grant(identity.let(IGrantable::unwrap), actions).let(Grant::wrap)

    /**
     * Grant the given identity permissions for all executions of a state machine.
     *
     * @param identity The principal. 
     * @param actions The list of desired actions. 
     */
    override fun grantExecution(identity: IGrantable, actions: String): Grant =
        unwrap(this).grantExecution(identity.let(IGrantable::unwrap), actions).let(Grant::wrap)

    /**
     * The principal to grant permissions to.
     */
    override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

    /**
     * Grant the given identity read permissions for this state machine.
     *
     * @param identity The principal. 
     */
    override fun grantRead(identity: IGrantable): Grant =
        unwrap(this).grantRead(identity.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * Grant the given identity permissions to start an execution of this state machine.
     *
     * @param identity The principal. 
     */
    override fun grantStartExecution(identity: IGrantable): Grant =
        unwrap(this).grantStartExecution(identity.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * Grant the given identity permissions to start a synchronous execution of this state machine.
     *
     * @param identity The principal. 
     */
    override fun grantStartSyncExecution(identity: IGrantable): Grant =
        unwrap(this).grantStartSyncExecution(identity.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * Grant the given identity read permissions for this state machine.
     *
     * @param identity The principal. 
     */
    override fun grantTaskResponse(identity: IGrantable): Grant =
        unwrap(this).grantTaskResponse(identity.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * Return the given named metric for this State Machine's executions.
     *
     * Default: - sum over 5 minutes
     *
     * @param metricName 
     * @param props
     */
    override fun metric(metricName: String): Metric =
        unwrap(this).metric(metricName).let(Metric::wrap)

    /**
     * Return the given named metric for this State Machine's executions.
     *
     * Default: - sum over 5 minutes
     *
     * @param metricName 
     * @param props
     */
    override fun metric(metricName: String, props: MetricOptions): Metric =
        unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

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
    override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
        metric(metricName, MetricOptions(props))

    /**
     * Metric for the number of executions that were aborted.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricAborted(): Metric = unwrap(this).metricAborted().let(Metric::wrap)

    /**
     * Metric for the number of executions that were aborted.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricAborted(props: MetricOptions): Metric =
        unwrap(this).metricAborted(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Metric for the number of executions that were aborted.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5691ff27197238df39362c2b0c7fcda013220a77fbd28083b3eb441003bad3ad")
    override fun metricAborted(props: MetricOptions.Builder.() -> Unit): Metric =
        metricAborted(MetricOptions(props))

    /**
     * Metric for the number of executions that failed.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricFailed(): Metric = unwrap(this).metricFailed().let(Metric::wrap)

    /**
     * Metric for the number of executions that failed.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricFailed(props: MetricOptions): Metric =
        unwrap(this).metricFailed(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Metric for the number of executions that failed.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("77b08980238672e6993c3f66793561b32ef5e0bc06ae223d9b428a4d61de3ce0")
    override fun metricFailed(props: MetricOptions.Builder.() -> Unit): Metric =
        metricFailed(MetricOptions(props))

    /**
     * Metric for the number of executions that were started.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricStarted(): Metric = unwrap(this).metricStarted().let(Metric::wrap)

    /**
     * Metric for the number of executions that were started.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricStarted(props: MetricOptions): Metric =
        unwrap(this).metricStarted(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Metric for the number of executions that were started.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1ebc99af7cef84c169ce01dd77e3ccc212ac8f545ac9fd06b542ea6846664d6")
    override fun metricStarted(props: MetricOptions.Builder.() -> Unit): Metric =
        metricStarted(MetricOptions(props))

    /**
     * Metric for the number of executions that succeeded.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricSucceeded(): Metric = unwrap(this).metricSucceeded().let(Metric::wrap)

    /**
     * Metric for the number of executions that succeeded.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricSucceeded(props: MetricOptions): Metric =
        unwrap(this).metricSucceeded(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Metric for the number of executions that succeeded.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bdb5db9e6445d6f95a595109612453c12c26d01ea7b090464e7e3dc89616ec56")
    override fun metricSucceeded(props: MetricOptions.Builder.() -> Unit): Metric =
        metricSucceeded(MetricOptions(props))

    /**
     * Metric for the number of executions that were throttled.
     *
     * Default: sum over 5 minutes
     *
     * @param props
     */
    override fun metricThrottled(): Metric = unwrap(this).metricThrottled().let(Metric::wrap)

    /**
     * Metric for the number of executions that were throttled.
     *
     * Default: sum over 5 minutes
     *
     * @param props
     */
    override fun metricThrottled(props: MetricOptions): Metric =
        unwrap(this).metricThrottled(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Metric for the number of executions that were throttled.
     *
     * Default: sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3dc5007387bd1ba5d6a1dfdabfca1dd0b5a1b0aa5f64579f63cfdd20c4ba29ca")
    override fun metricThrottled(props: MetricOptions.Builder.() -> Unit): Metric =
        metricThrottled(MetricOptions(props))

    /**
     * Metric for the interval, in milliseconds, between the time the execution starts and the time
     * it closes.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricTime(): Metric = unwrap(this).metricTime().let(Metric::wrap)

    /**
     * Metric for the interval, in milliseconds, between the time the execution starts and the time
     * it closes.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricTime(props: MetricOptions): Metric =
        unwrap(this).metricTime(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Metric for the interval, in milliseconds, between the time the execution starts and the time
     * it closes.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5df675ca191cf25c705e41cbbe4a5bb82c59b7b2cea749f3081d5accbcbde5b2")
    override fun metricTime(props: MetricOptions.Builder.() -> Unit): Metric =
        metricTime(MetricOptions(props))

    /**
     * Metric for the number of executions that timed out.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricTimedOut(): Metric = unwrap(this).metricTimedOut().let(Metric::wrap)

    /**
     * Metric for the number of executions that timed out.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricTimedOut(props: MetricOptions): Metric =
        unwrap(this).metricTimedOut(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Metric for the number of executions that timed out.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1d95fc9b8d64b0d9c0b67a1b010670a63ced883a6bf5b9a5d36c3474119fb181")
    override fun metricTimedOut(props: MetricOptions.Builder.() -> Unit): Metric =
        metricTimedOut(MetricOptions(props))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    /**
     * The ARN of the state machine.
     */
    override fun stateMachineArn(): String = unwrap(this).getStateMachineArn()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.IStateMachine):
        IStateMachine = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IStateMachine):
        software.amazon.awscdk.services.stepfunctions.IStateMachine = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.IStateMachine
  }
}
