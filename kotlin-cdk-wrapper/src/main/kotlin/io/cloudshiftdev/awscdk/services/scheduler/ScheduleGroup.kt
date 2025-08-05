@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.scheduler

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A Schedule Group.
 *
 * Example:
 *
 * ```
 * LambdaInvoke target;
 * ScheduleGroup scheduleGroup = ScheduleGroup.Builder.create(this, "ScheduleGroup")
 * .scheduleGroupName("MyScheduleGroup")
 * .build();
 * Schedule.Builder.create(this, "Schedule")
 * .schedule(ScheduleExpression.rate(Duration.minutes(10)))
 * .target(target)
 * .scheduleGroup(scheduleGroup)
 * .build();
 * ```
 */
public open class ScheduleGroup(
  cdkObject: software.amazon.awscdk.services.scheduler.ScheduleGroup,
) : Resource(cdkObject),
    IScheduleGroup {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.scheduler.ScheduleGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ScheduleGroupProps,
  ) :
      this(software.amazon.awscdk.services.scheduler.ScheduleGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(ScheduleGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ScheduleGroupProps.Builder.() -> Unit,
  ) : this(scope, id, ScheduleGroupProps(props)
  )

  /**
   * Grant the indicated permissions on this schedule group to the given principal.
   *
   * @param grantee 
   * @param actions 
   */
  public override fun grant(grantee: IGrantable, vararg actions: String): Grant =
      unwrap(this).grant(grantee.let(IGrantable.Companion::unwrap),
      *actions.map{CdkObjectWrappers.unwrap(it) as String}.toTypedArray()).let(Grant::wrap)

  /**
   * Grant delete schedule permission for schedules in this group to the given principal.
   *
   * @param identity 
   */
  public override fun grantDeleteSchedules(identity: IGrantable): Grant =
      unwrap(this).grantDeleteSchedules(identity.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * Grant list and get schedule permissions for schedules in this group to the given principal.
   *
   * @param identity 
   */
  public override fun grantReadSchedules(identity: IGrantable): Grant =
      unwrap(this).grantReadSchedules(identity.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * Grant create and update schedule permissions for schedules in this group to the given
   * principal.
   *
   * @param identity 
   */
  public override fun grantWriteSchedules(identity: IGrantable): Grant =
      unwrap(this).grantWriteSchedules(identity.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * Return the given named metric for this schedule group.
   *
   * Default: - sum over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  /**
   * Return the given named metric for this schedule group.
   *
   * Default: - sum over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Return the given named metric for this schedule group.
   *
   * Default: - sum over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  /**
   * Metric for all invocation attempts.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public override fun metricAttempts(): Metric = unwrap(this).metricAttempts().let(Metric::wrap)

  /**
   * Metric for all invocation attempts.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public override fun metricAttempts(props: MetricOptions): Metric =
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
  public override fun metricAttempts(props: MetricOptions.Builder.() -> Unit): Metric =
      metricAttempts(MetricOptions(props))

  /**
   * Metric for dropped invocations when EventBridge Scheduler stops attempting to invoke the target
   * after a schedule's retry policy has been exhausted.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public override fun metricDropped(): Metric = unwrap(this).metricDropped().let(Metric::wrap)

  /**
   * Metric for dropped invocations when EventBridge Scheduler stops attempting to invoke the target
   * after a schedule's retry policy has been exhausted.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public override fun metricDropped(props: MetricOptions): Metric =
      unwrap(this).metricDropped(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

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
  public override fun metricDropped(props: MetricOptions.Builder.() -> Unit): Metric =
      metricDropped(MetricOptions(props))

  /**
   * Metric for failed invocations that also failed to deliver to DLQ.
   *
   * Default: - sum over 5 minutes
   *
   * @param errorCode
   * @param props
   */
  public override fun metricFailedToBeSentToDLQ(): Metric =
      unwrap(this).metricFailedToBeSentToDLQ().let(Metric::wrap)

  /**
   * Metric for failed invocations that also failed to deliver to DLQ.
   *
   * Default: - sum over 5 minutes
   *
   * @param errorCode
   * @param props
   */
  public override fun metricFailedToBeSentToDLQ(errorCode: String): Metric =
      unwrap(this).metricFailedToBeSentToDLQ(errorCode).let(Metric::wrap)

  /**
   * Metric for failed invocations that also failed to deliver to DLQ.
   *
   * Default: - sum over 5 minutes
   *
   * @param errorCode
   * @param props
   */
  public override fun metricFailedToBeSentToDLQ(errorCode: String, props: MetricOptions): Metric =
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
  public override fun metricFailedToBeSentToDLQ(errorCode: String,
      props: MetricOptions.Builder.() -> Unit): Metric = metricFailedToBeSentToDLQ(errorCode,
      MetricOptions(props))

  /**
   * Metric for invocations delivered to the DLQ.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public override fun metricSentToDLQ(): Metric = unwrap(this).metricSentToDLQ().let(Metric::wrap)

  /**
   * Metric for invocations delivered to the DLQ.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public override fun metricSentToDLQ(props: MetricOptions): Metric =
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
  public override fun metricSentToDLQ(props: MetricOptions.Builder.() -> Unit): Metric =
      metricSentToDLQ(MetricOptions(props))

  /**
   * Metric for delivery of failed invocations to DLQ when the payload of the event sent to the DLQ
   * exceeds the maximum size allowed by Amazon SQS.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public override fun metricSentToDLQTruncated(): Metric =
      unwrap(this).metricSentToDLQTruncated().let(Metric::wrap)

  /**
   * Metric for delivery of failed invocations to DLQ when the payload of the event sent to the DLQ
   * exceeds the maximum size allowed by Amazon SQS.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public override fun metricSentToDLQTruncated(props: MetricOptions): Metric =
      unwrap(this).metricSentToDLQTruncated(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

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
  public override fun metricSentToDLQTruncated(props: MetricOptions.Builder.() -> Unit): Metric =
      metricSentToDLQTruncated(MetricOptions(props))

  /**
   * Emitted when the target returns an exception after EventBridge Scheduler calls the target API.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public override fun metricTargetErrors(): Metric =
      unwrap(this).metricTargetErrors().let(Metric::wrap)

  /**
   * Emitted when the target returns an exception after EventBridge Scheduler calls the target API.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public override fun metricTargetErrors(props: MetricOptions): Metric =
      unwrap(this).metricTargetErrors(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Emitted when the target returns an exception after EventBridge Scheduler calls the target API.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2e2e88f68fc89802c00f8646799bf7cd6d40188911e4006d6689c161dc953baf")
  public override fun metricTargetErrors(props: MetricOptions.Builder.() -> Unit): Metric =
      metricTargetErrors(MetricOptions(props))

  /**
   * Metric for invocation failures due to API throttling by the target.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public override fun metricTargetThrottled(): Metric =
      unwrap(this).metricTargetThrottled().let(Metric::wrap)

  /**
   * Metric for invocation failures due to API throttling by the target.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public override fun metricTargetThrottled(props: MetricOptions): Metric =
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
  public override fun metricTargetThrottled(props: MetricOptions.Builder.() -> Unit): Metric =
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
  public override fun metricThrottled(): Metric = unwrap(this).metricThrottled().let(Metric::wrap)

  /**
   * Metric for the number of invocations that were throttled because it exceeds your service
   * quotas.
   *
   * Default: - sum over 5 minutes
   *
   * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/scheduler-quotas.html)
   * @param props
   */
  public override fun metricThrottled(props: MetricOptions): Metric =
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
  public override fun metricThrottled(props: MetricOptions.Builder.() -> Unit): Metric =
      metricThrottled(MetricOptions(props))

  /**
   * The arn of the schedule group.
   */
  public override fun scheduleGroupArn(): String = unwrap(this).getScheduleGroupArn()

  /**
   * The name of the schedule group.
   */
  public override fun scheduleGroupName(): String = unwrap(this).getScheduleGroupName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.scheduler.ScheduleGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The removal policy for the group.
     *
     * If the group is removed also all schedules are removed.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @param removalPolicy The removal policy for the group. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * The name of the schedule group.
     *
     * Up to 64 letters (uppercase and lowercase), numbers, hyphens, underscores and dots are
     * allowed.
     *
     * Default: - A unique name will be generated
     *
     * @param scheduleGroupName The name of the schedule group. 
     */
    public fun scheduleGroupName(scheduleGroupName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.scheduler.ScheduleGroup.Builder =
        software.amazon.awscdk.services.scheduler.ScheduleGroup.Builder.create(scope, id)

    /**
     * The removal policy for the group.
     *
     * If the group is removed also all schedules are removed.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @param removalPolicy The removal policy for the group. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * The name of the schedule group.
     *
     * Up to 64 letters (uppercase and lowercase), numbers, hyphens, underscores and dots are
     * allowed.
     *
     * Default: - A unique name will be generated
     *
     * @param scheduleGroupName The name of the schedule group. 
     */
    override fun scheduleGroupName(scheduleGroupName: String) {
      cdkBuilder.scheduleGroupName(scheduleGroupName)
    }

    public fun build(): software.amazon.awscdk.services.scheduler.ScheduleGroup = cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.scheduler.ScheduleGroup.PROPERTY_INJECTION_ID

    public fun fromDefaultScheduleGroup(scope: CloudshiftdevConstructsConstruct, id: String):
        IScheduleGroup =
        software.amazon.awscdk.services.scheduler.ScheduleGroup.fromDefaultScheduleGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id).let(IScheduleGroup::wrap)

    public fun fromScheduleGroupArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      scheduleGroupArn: String,
    ): IScheduleGroup =
        software.amazon.awscdk.services.scheduler.ScheduleGroup.fromScheduleGroupArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, scheduleGroupArn).let(IScheduleGroup::wrap)

    public fun fromScheduleGroupName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      scheduleGroupName: String,
    ): IScheduleGroup =
        software.amazon.awscdk.services.scheduler.ScheduleGroup.fromScheduleGroupName(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, scheduleGroupName).let(IScheduleGroup::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ScheduleGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ScheduleGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.ScheduleGroup):
        ScheduleGroup = ScheduleGroup(cdkObject)

    internal fun unwrap(wrapped: ScheduleGroup):
        software.amazon.awscdk.services.scheduler.ScheduleGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.scheduler.ScheduleGroup
  }
}
