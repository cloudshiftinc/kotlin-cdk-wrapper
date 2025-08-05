@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.scheduler

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.kms.IKey
import java.time.Instant
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An EventBridge Schedule.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
 * IDeliveryStream deliveryStream;
 * Map&lt;String, String&gt; payload = Map.of(
 * "Data", "record");
 * Schedule.Builder.create(this, "Schedule")
 * .schedule(ScheduleExpression.rate(Duration.minutes(60)))
 * .target(FirehosePutRecord.Builder.create(deliveryStream)
 * .input(ScheduleTargetInput.fromObject(payload))
 * .build())
 * .build();
 * ```
 */
public open class Schedule(
  cdkObject: software.amazon.awscdk.services.scheduler.Schedule,
) : Resource(cdkObject),
    ISchedule {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ScheduleProps,
  ) :
      this(software.amazon.awscdk.services.scheduler.Schedule(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(ScheduleProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ScheduleProps.Builder.() -> Unit,
  ) : this(scope, id, ScheduleProps(props)
  )

  /**
   * The customer managed KMS key that EventBridge Scheduler will use to encrypt and decrypt your
   * data.
   */
  public open fun key(): IKey? = unwrap(this).getKey()?.let(IKey::wrap)

  /**
   * The arn of the schedule.
   */
  public override fun scheduleArn(): String = unwrap(this).getScheduleArn()

  /**
   * The schedule group associated with this schedule.
   */
  public override fun scheduleGroup(): IScheduleGroup? =
      unwrap(this).getScheduleGroup()?.let(IScheduleGroup::wrap)

  /**
   * The name of the schedule.
   */
  public override fun scheduleName(): String = unwrap(this).getScheduleName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.scheduler.Schedule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description you specify for the schedule.
     *
     * Default: - no value
     *
     * @param description The description you specify for the schedule. 
     */
    public fun description(description: String)

    /**
     * Indicates whether the schedule is enabled.
     *
     * Default: true
     *
     * @param enabled Indicates whether the schedule is enabled. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * The date, in UTC, before which the schedule can invoke its target.
     *
     * EventBridge Scheduler ignores end for one-time schedules.
     *
     * Default: - no value
     *
     * @param end The date, in UTC, before which the schedule can invoke its target. 
     */
    public fun end(end: Instant)

    /**
     * The customer managed KMS key that EventBridge Scheduler will use to encrypt and decrypt your
     * data.
     *
     * Default: - All events in Scheduler are encrypted with a key that AWS owns and manages.
     *
     * @param key The customer managed KMS key that EventBridge Scheduler will use to encrypt and
     * decrypt your data. 
     */
    public fun key(key: IKey)

    /**
     * The expression that defines when the schedule runs.
     *
     * Can be either a `at`, `rate`
     * or `cron` expression.
     *
     * @param schedule The expression that defines when the schedule runs. 
     */
    public fun schedule(schedule: ScheduleExpression)

    /**
     * The schedule's group.
     *
     * Default: - By default a schedule will be associated with the `default` group.
     *
     * @param scheduleGroup The schedule's group. 
     */
    public fun scheduleGroup(scheduleGroup: IScheduleGroup)

    /**
     * The name of the schedule.
     *
     * Up to 64 letters (uppercase and lowercase), numbers, hyphens, underscores and dots are
     * allowed.
     *
     * Default: - A unique name will be generated
     *
     * @param scheduleName The name of the schedule. 
     */
    public fun scheduleName(scheduleName: String)

    /**
     * The date, in UTC, after which the schedule can begin invoking its target.
     *
     * EventBridge Scheduler ignores start for one-time schedules.
     *
     * Default: - no value
     *
     * @param start The date, in UTC, after which the schedule can begin invoking its target. 
     */
    public fun start(start: Instant)

    /**
     * The schedule's target details.
     *
     * @param target The schedule's target details. 
     */
    public fun target(target: IScheduleTarget)

    /**
     * A time window during which EventBridge Scheduler invokes the schedule.
     *
     * Default: TimeWindow.off()
     *
     * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/managing-schedule-flexible-time-windows.html)
     * @param timeWindow A time window during which EventBridge Scheduler invokes the schedule. 
     */
    public fun timeWindow(timeWindow: TimeWindow)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.scheduler.Schedule.Builder =
        software.amazon.awscdk.services.scheduler.Schedule.Builder.create(scope, id)

    /**
     * The description you specify for the schedule.
     *
     * Default: - no value
     *
     * @param description The description you specify for the schedule. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Indicates whether the schedule is enabled.
     *
     * Default: true
     *
     * @param enabled Indicates whether the schedule is enabled. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * The date, in UTC, before which the schedule can invoke its target.
     *
     * EventBridge Scheduler ignores end for one-time schedules.
     *
     * Default: - no value
     *
     * @param end The date, in UTC, before which the schedule can invoke its target. 
     */
    override fun end(end: Instant) {
      cdkBuilder.end(end)
    }

    /**
     * The customer managed KMS key that EventBridge Scheduler will use to encrypt and decrypt your
     * data.
     *
     * Default: - All events in Scheduler are encrypted with a key that AWS owns and manages.
     *
     * @param key The customer managed KMS key that EventBridge Scheduler will use to encrypt and
     * decrypt your data. 
     */
    override fun key(key: IKey) {
      cdkBuilder.key(key.let(IKey.Companion::unwrap))
    }

    /**
     * The expression that defines when the schedule runs.
     *
     * Can be either a `at`, `rate`
     * or `cron` expression.
     *
     * @param schedule The expression that defines when the schedule runs. 
     */
    override fun schedule(schedule: ScheduleExpression) {
      cdkBuilder.schedule(schedule.let(ScheduleExpression.Companion::unwrap))
    }

    /**
     * The schedule's group.
     *
     * Default: - By default a schedule will be associated with the `default` group.
     *
     * @param scheduleGroup The schedule's group. 
     */
    override fun scheduleGroup(scheduleGroup: IScheduleGroup) {
      cdkBuilder.scheduleGroup(scheduleGroup.let(IScheduleGroup.Companion::unwrap))
    }

    /**
     * The name of the schedule.
     *
     * Up to 64 letters (uppercase and lowercase), numbers, hyphens, underscores and dots are
     * allowed.
     *
     * Default: - A unique name will be generated
     *
     * @param scheduleName The name of the schedule. 
     */
    override fun scheduleName(scheduleName: String) {
      cdkBuilder.scheduleName(scheduleName)
    }

    /**
     * The date, in UTC, after which the schedule can begin invoking its target.
     *
     * EventBridge Scheduler ignores start for one-time schedules.
     *
     * Default: - no value
     *
     * @param start The date, in UTC, after which the schedule can begin invoking its target. 
     */
    override fun start(start: Instant) {
      cdkBuilder.start(start)
    }

    /**
     * The schedule's target details.
     *
     * @param target The schedule's target details. 
     */
    override fun target(target: IScheduleTarget) {
      cdkBuilder.target(target.let(IScheduleTarget.Companion::unwrap))
    }

    /**
     * A time window during which EventBridge Scheduler invokes the schedule.
     *
     * Default: TimeWindow.off()
     *
     * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/managing-schedule-flexible-time-windows.html)
     * @param timeWindow A time window during which EventBridge Scheduler invokes the schedule. 
     */
    override fun timeWindow(timeWindow: TimeWindow) {
      cdkBuilder.timeWindow(timeWindow.let(TimeWindow.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.scheduler.Schedule = cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.scheduler.Schedule.PROPERTY_INJECTION_ID

    public fun fromScheduleArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      scheduleArn: String,
    ): ISchedule =
        software.amazon.awscdk.services.scheduler.Schedule.fromScheduleArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, scheduleArn).let(ISchedule::wrap)

    public fun metricAll(metricName: String): Metric =
        software.amazon.awscdk.services.scheduler.Schedule.metricAll(metricName).let(Metric::wrap)

    public fun metricAll(metricName: String, props: MetricOptions): Metric =
        software.amazon.awscdk.services.scheduler.Schedule.metricAll(metricName,
        props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc2edb7e8860d33b2c02a5d62b7557e31ca2fd399a100f3532bebaf81fa8a856")
    public fun metricAll(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
        metricAll(metricName, MetricOptions(props))

    public fun metricAllAttempts(): Metric =
        software.amazon.awscdk.services.scheduler.Schedule.metricAllAttempts().let(Metric::wrap)

    public fun metricAllAttempts(props: MetricOptions): Metric =
        software.amazon.awscdk.services.scheduler.Schedule.metricAllAttempts(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b64c2d76692a8ff58dc02271793814665e4cf330fa1635e8eb766d5f88bd466")
    public fun metricAllAttempts(props: MetricOptions.Builder.() -> Unit): Metric =
        metricAllAttempts(MetricOptions(props))

    public fun metricAllDropped(): Metric =
        software.amazon.awscdk.services.scheduler.Schedule.metricAllDropped().let(Metric::wrap)

    public fun metricAllDropped(props: MetricOptions): Metric =
        software.amazon.awscdk.services.scheduler.Schedule.metricAllDropped(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6fc1eee045c4bbda990ea2bdaf65a2cb2d08e6a857571c24bd21cbe5df869a06")
    public fun metricAllDropped(props: MetricOptions.Builder.() -> Unit): Metric =
        metricAllDropped(MetricOptions(props))

    public fun metricAllErrors(): Metric =
        software.amazon.awscdk.services.scheduler.Schedule.metricAllErrors().let(Metric::wrap)

    public fun metricAllErrors(props: MetricOptions): Metric =
        software.amazon.awscdk.services.scheduler.Schedule.metricAllErrors(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02be5d5e0904f3b9e8a88bd3aba46ee0a0c7ae74c34a034662cd2afa9629a23f")
    public fun metricAllErrors(props: MetricOptions.Builder.() -> Unit): Metric =
        metricAllErrors(MetricOptions(props))

    public fun metricAllFailedToBeSentToDLQ(): Metric =
        software.amazon.awscdk.services.scheduler.Schedule.metricAllFailedToBeSentToDLQ().let(Metric::wrap)

    public fun metricAllFailedToBeSentToDLQ(errorCode: String): Metric =
        software.amazon.awscdk.services.scheduler.Schedule.metricAllFailedToBeSentToDLQ(errorCode).let(Metric::wrap)

    public fun metricAllFailedToBeSentToDLQ(errorCode: String, props: MetricOptions): Metric =
        software.amazon.awscdk.services.scheduler.Schedule.metricAllFailedToBeSentToDLQ(errorCode,
        props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0480a7bb3ad8e8c98aa87f139c710f02b7c644dcc3fd467ab14b8c422dcef8d9")
    public fun metricAllFailedToBeSentToDLQ(errorCode: String,
        props: MetricOptions.Builder.() -> Unit): Metric = metricAllFailedToBeSentToDLQ(errorCode,
        MetricOptions(props))

    public fun metricAllSentToDLQ(): Metric =
        software.amazon.awscdk.services.scheduler.Schedule.metricAllSentToDLQ().let(Metric::wrap)

    public fun metricAllSentToDLQ(props: MetricOptions): Metric =
        software.amazon.awscdk.services.scheduler.Schedule.metricAllSentToDLQ(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a835dfdfbebe71b3c276a2cc96713f7998ae3605839b8c4214d6d2bf98944d9c")
    public fun metricAllSentToDLQ(props: MetricOptions.Builder.() -> Unit): Metric =
        metricAllSentToDLQ(MetricOptions(props))

    public fun metricAllSentToDLQTruncated(): Metric =
        software.amazon.awscdk.services.scheduler.Schedule.metricAllSentToDLQTruncated().let(Metric::wrap)

    public fun metricAllSentToDLQTruncated(props: MetricOptions): Metric =
        software.amazon.awscdk.services.scheduler.Schedule.metricAllSentToDLQTruncated(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9db9973cd5c3a708215c6e13d5af7a4c6bd34d4e528b23ca637b3003e88c1f55")
    public fun metricAllSentToDLQTruncated(props: MetricOptions.Builder.() -> Unit): Metric =
        metricAllSentToDLQTruncated(MetricOptions(props))

    public fun metricAllTargetThrottled(): Metric =
        software.amazon.awscdk.services.scheduler.Schedule.metricAllTargetThrottled().let(Metric::wrap)

    public fun metricAllTargetThrottled(props: MetricOptions): Metric =
        software.amazon.awscdk.services.scheduler.Schedule.metricAllTargetThrottled(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ba93e5207249859882d86f25aafe217b993675e04174f5d9e4615c0a4a2e9ed")
    public fun metricAllTargetThrottled(props: MetricOptions.Builder.() -> Unit): Metric =
        metricAllTargetThrottled(MetricOptions(props))

    public fun metricAllThrottled(): Metric =
        software.amazon.awscdk.services.scheduler.Schedule.metricAllThrottled().let(Metric::wrap)

    public fun metricAllThrottled(props: MetricOptions): Metric =
        software.amazon.awscdk.services.scheduler.Schedule.metricAllThrottled(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9619a8d8bcc7cd02926088462be48f557b740692db7d27b5a26405ed502b7bf7")
    public fun metricAllThrottled(props: MetricOptions.Builder.() -> Unit): Metric =
        metricAllThrottled(MetricOptions(props))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Schedule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Schedule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.Schedule): Schedule =
        Schedule(cdkObject)

    internal fun unwrap(wrapped: Schedule): software.amazon.awscdk.services.scheduler.Schedule =
        wrapped.cdkObject as software.amazon.awscdk.services.scheduler.Schedule
  }
}
