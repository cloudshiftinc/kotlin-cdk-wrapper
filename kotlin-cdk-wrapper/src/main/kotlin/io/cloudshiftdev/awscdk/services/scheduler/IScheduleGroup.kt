@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.scheduler

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Interface representing a created or an imported `ScheduleGroup`.
 */
public interface IScheduleGroup : IResource {
  /**
   * Grant the indicated permissions on this group to the given principal.
   *
   * @param grantee 
   * @param actions 
   */
  public fun grant(grantee: IGrantable, vararg actions: String): Grant

  /**
   * Grant delete schedule permission for schedules in this group to the given principal.
   *
   * @param identity 
   */
  public fun grantDeleteSchedules(identity: IGrantable): Grant

  /**
   * Grant list and get schedule permissions for schedules in this group to the given principal.
   *
   * @param identity 
   */
  public fun grantReadSchedules(identity: IGrantable): Grant

  /**
   * Grant create and update schedule permissions for schedules in this group to the given
   * principal.
   *
   * @param identity 
   */
  public fun grantWriteSchedules(identity: IGrantable): Grant

  /**
   * Return the given named metric for this group schedules.
   *
   * Default: - sum over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  public fun metric(metricName: String): Metric

  /**
   * Return the given named metric for this group schedules.
   *
   * Default: - sum over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  public fun metric(metricName: String, props: MetricOptions): Metric

  /**
   * Return the given named metric for this group schedules.
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
   * Metric for all invocation attempts.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricAttempts(): Metric

  /**
   * Metric for all invocation attempts.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricAttempts(props: MetricOptions): Metric

  /**
   * Metric for all invocation attempts.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1f02702290bac42f5e44b69bd72c43bde8628cc70b3e872689f94283d2ac8e92")
  public fun metricAttempts(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for dropped invocations when EventBridge Scheduler stops attempting to invoke the target
   * after a schedule's retry policy has been exhausted.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricDropped(): Metric

  /**
   * Metric for dropped invocations when EventBridge Scheduler stops attempting to invoke the target
   * after a schedule's retry policy has been exhausted.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricDropped(props: MetricOptions): Metric

  /**
   * Metric for dropped invocations when EventBridge Scheduler stops attempting to invoke the target
   * after a schedule's retry policy has been exhausted.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e5ff33141352c256622c340a50a0fb0955b5a8105c0aa9680dd6b7c3d75cc5dc")
  public fun metricDropped(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for failed invocations that also failed to deliver to DLQ.
   *
   * Default: - sum over 5 minutes
   *
   * @param errorCode
   * @param props
   */
  public fun metricFailedToBeSentToDLQ(): Metric

  /**
   * Metric for failed invocations that also failed to deliver to DLQ.
   *
   * Default: - sum over 5 minutes
   *
   * @param errorCode
   * @param props
   */
  public fun metricFailedToBeSentToDLQ(errorCode: String): Metric

  /**
   * Metric for failed invocations that also failed to deliver to DLQ.
   *
   * Default: - sum over 5 minutes
   *
   * @param errorCode
   * @param props
   */
  public fun metricFailedToBeSentToDLQ(errorCode: String, props: MetricOptions): Metric

  /**
   * Metric for failed invocations that also failed to deliver to DLQ.
   *
   * Default: - sum over 5 minutes
   *
   * @param errorCode
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b5e86c3333b3b40fb944dd60c0e38200162f23a4453a586397f62e4223e9285e")
  public fun metricFailedToBeSentToDLQ(errorCode: String, props: MetricOptions.Builder.() -> Unit):
      Metric

  /**
   * Metric for invocations delivered to the DLQ.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricSentToDLQ(): Metric

  /**
   * Metric for invocations delivered to the DLQ.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricSentToDLQ(props: MetricOptions): Metric

  /**
   * Metric for invocations delivered to the DLQ.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8dfaebc7d2f1b61d1cf4af8f05a2c5e18bfb576ff598c432d795eef821e81e25")
  public fun metricSentToDLQ(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for delivery of failed invocations to DLQ when the payload of the event sent to the DLQ
   * exceeds the maximum size allowed by Amazon SQS.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricSentToDLQTruncated(): Metric

  /**
   * Metric for delivery of failed invocations to DLQ when the payload of the event sent to the DLQ
   * exceeds the maximum size allowed by Amazon SQS.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricSentToDLQTruncated(props: MetricOptions): Metric

  /**
   * Metric for delivery of failed invocations to DLQ when the payload of the event sent to the DLQ
   * exceeds the maximum size allowed by Amazon SQS.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0f82bfa5614aab49662d27cff6242c675ea9f1c07a564bab60f993c49184537a")
  public fun metricSentToDLQTruncated(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Emitted when the target returns an exception after EventBridge Scheduler calls the target API.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricTargetErrors(): Metric

  /**
   * Emitted when the target returns an exception after EventBridge Scheduler calls the target API.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricTargetErrors(props: MetricOptions): Metric

  /**
   * Emitted when the target returns an exception after EventBridge Scheduler calls the target API.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2e2e88f68fc89802c00f8646799bf7cd6d40188911e4006d6689c161dc953baf")
  public fun metricTargetErrors(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for invocation failures due to API throttling by the target.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricTargetThrottled(): Metric

  /**
   * Metric for invocation failures due to API throttling by the target.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricTargetThrottled(props: MetricOptions): Metric

  /**
   * Metric for invocation failures due to API throttling by the target.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3a94944dc9a8089d3697f56342b529be05cfff6efd1ac308d9b5135034e74d3b")
  public fun metricTargetThrottled(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the number of invocations that were throttled because it exceeds your service
   * quotas.
   *
   * Default: - sum over 5 minutes
   *
   * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/scheduler-quotas.html)
   * @param props
   */
  public fun metricThrottled(): Metric

  /**
   * Metric for the number of invocations that were throttled because it exceeds your service
   * quotas.
   *
   * Default: - sum over 5 minutes
   *
   * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/scheduler-quotas.html)
   * @param props
   */
  public fun metricThrottled(props: MetricOptions): Metric

  /**
   * Metric for the number of invocations that were throttled because it exceeds your service
   * quotas.
   *
   * Default: - sum over 5 minutes
   *
   * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/scheduler-quotas.html)
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3dc5007387bd1ba5d6a1dfdabfca1dd0b5a1b0aa5f64579f63cfdd20c4ba29ca")
  public fun metricThrottled(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The arn of the schedule group.
   */
  public fun scheduleGroupArn(): String

  /**
   * The name of the schedule group.
   */
  public fun scheduleGroupName(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.scheduler.IScheduleGroup,
  ) : CdkObject(cdkObject),
      IScheduleGroup {
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
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy.Companion::unwrap))
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
     * Grant the indicated permissions on this group to the given principal.
     *
     * @param grantee 
     * @param actions 
     */
    override fun grant(grantee: IGrantable, vararg actions: String): Grant =
        unwrap(this).grant(grantee.let(IGrantable.Companion::unwrap),
        *actions.map{CdkObjectWrappers.unwrap(it) as String}.toTypedArray()).let(Grant::wrap)

    /**
     * Grant delete schedule permission for schedules in this group to the given principal.
     *
     * @param identity 
     */
    override fun grantDeleteSchedules(identity: IGrantable): Grant =
        unwrap(this).grantDeleteSchedules(identity.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * Grant list and get schedule permissions for schedules in this group to the given principal.
     *
     * @param identity 
     */
    override fun grantReadSchedules(identity: IGrantable): Grant =
        unwrap(this).grantReadSchedules(identity.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * Grant create and update schedule permissions for schedules in this group to the given
     * principal.
     *
     * @param identity 
     */
    override fun grantWriteSchedules(identity: IGrantable): Grant =
        unwrap(this).grantWriteSchedules(identity.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * Return the given named metric for this group schedules.
     *
     * Default: - sum over 5 minutes
     *
     * @param metricName 
     * @param props
     */
    override fun metric(metricName: String): Metric =
        unwrap(this).metric(metricName).let(Metric::wrap)

    /**
     * Return the given named metric for this group schedules.
     *
     * Default: - sum over 5 minutes
     *
     * @param metricName 
     * @param props
     */
    override fun metric(metricName: String, props: MetricOptions): Metric =
        unwrap(this).metric(metricName,
        props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * Return the given named metric for this group schedules.
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
     * Metric for all invocation attempts.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricAttempts(): Metric = unwrap(this).metricAttempts().let(Metric::wrap)

    /**
     * Metric for all invocation attempts.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricAttempts(props: MetricOptions): Metric =
        unwrap(this).metricAttempts(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * Metric for all invocation attempts.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f02702290bac42f5e44b69bd72c43bde8628cc70b3e872689f94283d2ac8e92")
    override fun metricAttempts(props: MetricOptions.Builder.() -> Unit): Metric =
        metricAttempts(MetricOptions(props))

    /**
     * Metric for dropped invocations when EventBridge Scheduler stops attempting to invoke the
     * target after a schedule's retry policy has been exhausted.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricDropped(): Metric = unwrap(this).metricDropped().let(Metric::wrap)

    /**
     * Metric for dropped invocations when EventBridge Scheduler stops attempting to invoke the
     * target after a schedule's retry policy has been exhausted.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricDropped(props: MetricOptions): Metric =
        unwrap(this).metricDropped(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * Metric for dropped invocations when EventBridge Scheduler stops attempting to invoke the
     * target after a schedule's retry policy has been exhausted.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5ff33141352c256622c340a50a0fb0955b5a8105c0aa9680dd6b7c3d75cc5dc")
    override fun metricDropped(props: MetricOptions.Builder.() -> Unit): Metric =
        metricDropped(MetricOptions(props))

    /**
     * Metric for failed invocations that also failed to deliver to DLQ.
     *
     * Default: - sum over 5 minutes
     *
     * @param errorCode
     * @param props
     */
    override fun metricFailedToBeSentToDLQ(): Metric =
        unwrap(this).metricFailedToBeSentToDLQ().let(Metric::wrap)

    /**
     * Metric for failed invocations that also failed to deliver to DLQ.
     *
     * Default: - sum over 5 minutes
     *
     * @param errorCode
     * @param props
     */
    override fun metricFailedToBeSentToDLQ(errorCode: String): Metric =
        unwrap(this).metricFailedToBeSentToDLQ(errorCode).let(Metric::wrap)

    /**
     * Metric for failed invocations that also failed to deliver to DLQ.
     *
     * Default: - sum over 5 minutes
     *
     * @param errorCode
     * @param props
     */
    override fun metricFailedToBeSentToDLQ(errorCode: String, props: MetricOptions): Metric =
        unwrap(this).metricFailedToBeSentToDLQ(errorCode,
        props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * Metric for failed invocations that also failed to deliver to DLQ.
     *
     * Default: - sum over 5 minutes
     *
     * @param errorCode
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5e86c3333b3b40fb944dd60c0e38200162f23a4453a586397f62e4223e9285e")
    override fun metricFailedToBeSentToDLQ(errorCode: String,
        props: MetricOptions.Builder.() -> Unit): Metric = metricFailedToBeSentToDLQ(errorCode,
        MetricOptions(props))

    /**
     * Metric for invocations delivered to the DLQ.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricSentToDLQ(): Metric = unwrap(this).metricSentToDLQ().let(Metric::wrap)

    /**
     * Metric for invocations delivered to the DLQ.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricSentToDLQ(props: MetricOptions): Metric =
        unwrap(this).metricSentToDLQ(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * Metric for invocations delivered to the DLQ.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8dfaebc7d2f1b61d1cf4af8f05a2c5e18bfb576ff598c432d795eef821e81e25")
    override fun metricSentToDLQ(props: MetricOptions.Builder.() -> Unit): Metric =
        metricSentToDLQ(MetricOptions(props))

    /**
     * Metric for delivery of failed invocations to DLQ when the payload of the event sent to the
     * DLQ exceeds the maximum size allowed by Amazon SQS.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricSentToDLQTruncated(): Metric =
        unwrap(this).metricSentToDLQTruncated().let(Metric::wrap)

    /**
     * Metric for delivery of failed invocations to DLQ when the payload of the event sent to the
     * DLQ exceeds the maximum size allowed by Amazon SQS.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricSentToDLQTruncated(props: MetricOptions): Metric =
        unwrap(this).metricSentToDLQTruncated(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * Metric for delivery of failed invocations to DLQ when the payload of the event sent to the
     * DLQ exceeds the maximum size allowed by Amazon SQS.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0f82bfa5614aab49662d27cff6242c675ea9f1c07a564bab60f993c49184537a")
    override fun metricSentToDLQTruncated(props: MetricOptions.Builder.() -> Unit): Metric =
        metricSentToDLQTruncated(MetricOptions(props))

    /**
     * Emitted when the target returns an exception after EventBridge Scheduler calls the target
     * API.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricTargetErrors(): Metric = unwrap(this).metricTargetErrors().let(Metric::wrap)

    /**
     * Emitted when the target returns an exception after EventBridge Scheduler calls the target
     * API.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricTargetErrors(props: MetricOptions): Metric =
        unwrap(this).metricTargetErrors(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * Emitted when the target returns an exception after EventBridge Scheduler calls the target
     * API.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e2e88f68fc89802c00f8646799bf7cd6d40188911e4006d6689c161dc953baf")
    override fun metricTargetErrors(props: MetricOptions.Builder.() -> Unit): Metric =
        metricTargetErrors(MetricOptions(props))

    /**
     * Metric for invocation failures due to API throttling by the target.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricTargetThrottled(): Metric =
        unwrap(this).metricTargetThrottled().let(Metric::wrap)

    /**
     * Metric for invocation failures due to API throttling by the target.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricTargetThrottled(props: MetricOptions): Metric =
        unwrap(this).metricTargetThrottled(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * Metric for invocation failures due to API throttling by the target.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a94944dc9a8089d3697f56342b529be05cfff6efd1ac308d9b5135034e74d3b")
    override fun metricTargetThrottled(props: MetricOptions.Builder.() -> Unit): Metric =
        metricTargetThrottled(MetricOptions(props))

    /**
     * Metric for the number of invocations that were throttled because it exceeds your service
     * quotas.
     *
     * Default: - sum over 5 minutes
     *
     * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/scheduler-quotas.html)
     * @param props
     */
    override fun metricThrottled(): Metric = unwrap(this).metricThrottled().let(Metric::wrap)

    /**
     * Metric for the number of invocations that were throttled because it exceeds your service
     * quotas.
     *
     * Default: - sum over 5 minutes
     *
     * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/scheduler-quotas.html)
     * @param props
     */
    override fun metricThrottled(props: MetricOptions): Metric =
        unwrap(this).metricThrottled(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * Metric for the number of invocations that were throttled because it exceeds your service
     * quotas.
     *
     * Default: - sum over 5 minutes
     *
     * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/scheduler-quotas.html)
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3dc5007387bd1ba5d6a1dfdabfca1dd0b5a1b0aa5f64579f63cfdd20c4ba29ca")
    override fun metricThrottled(props: MetricOptions.Builder.() -> Unit): Metric =
        metricThrottled(MetricOptions(props))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The arn of the schedule group.
     */
    override fun scheduleGroupArn(): String = unwrap(this).getScheduleGroupArn()

    /**
     * The name of the schedule group.
     */
    override fun scheduleGroupName(): String = unwrap(this).getScheduleGroupName()

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.IScheduleGroup):
        IScheduleGroup = CdkObjectWrappers.wrap(cdkObject) as? IScheduleGroup ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IScheduleGroup):
        software.amazon.awscdk.services.scheduler.IScheduleGroup = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.scheduler.IScheduleGroup
  }
}
