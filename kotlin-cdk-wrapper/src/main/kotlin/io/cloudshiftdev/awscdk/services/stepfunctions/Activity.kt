@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

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
 * Define a new Step Functions Activity.
 *
 * Example:
 *
 * ```
 * Activity activity = new Activity(this, "Activity");
 * Role role = Role.Builder.create(this, "Role")
 * .assumedBy(new ServicePrincipal("lambda.amazonaws.com"))
 * .build();
 * activity.grant(role, "states:SendTaskSuccess");
 * ```
 */
public open class Activity(
  cdkObject: software.amazon.awscdk.services.stepfunctions.Activity,
) : Resource(cdkObject),
    IActivity {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.stepfunctions.Activity(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ActivityProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.Activity(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(ActivityProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ActivityProps.Builder.() -> Unit,
  ) : this(scope, id, ActivityProps(props)
  )

  /**
   * The ARN of the activity.
   */
  public override fun activityArn(): String = unwrap(this).getActivityArn()

  /**
   * The name of the activity.
   */
  public override fun activityName(): String = unwrap(this).getActivityName()

  /**
   * The encryptionConfiguration object used for server-side encryption of the activity inputs.
   */
  public override fun encryptionConfiguration(): EncryptionConfiguration? =
      unwrap(this).getEncryptionConfiguration()?.let(EncryptionConfiguration::wrap)

  /**
   * Grant the given identity permissions on this Activity.
   *
   * @param identity The principal. 
   * @param actions The list of desired actions. 
   */
  public open fun grant(identity: IGrantable, vararg actions: String): Grant =
      unwrap(this).grant(identity.let(IGrantable.Companion::unwrap),
      *actions.map{CdkObjectWrappers.unwrap(it) as String}.toTypedArray()).let(Grant::wrap)

  /**
   * Return the given named metric for this Activity.
   *
   * Default: sum over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  public open fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  /**
   * Return the given named metric for this Activity.
   *
   * Default: sum over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  public open fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Return the given named metric for this Activity.
   *
   * Default: sum over 5 minutes
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
   * Default: sum over 5 minutes
   *
   * @param props
   */
  public open fun metricFailed(): Metric = unwrap(this).metricFailed().let(Metric::wrap)

  /**
   * Metric for the number of times this activity fails.
   *
   * Default: sum over 5 minutes
   *
   * @param props
   */
  public open fun metricFailed(props: MetricOptions): Metric =
      unwrap(this).metricFailed(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of times this activity fails.
   *
   * Default: sum over 5 minutes
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
   * Default: sum over 5 minutes
   *
   * @param props
   */
  public open fun metricHeartbeatTimedOut(): Metric =
      unwrap(this).metricHeartbeatTimedOut().let(Metric::wrap)

  /**
   * Metric for the number of times the heartbeat times out for this activity.
   *
   * Default: sum over 5 minutes
   *
   * @param props
   */
  public open fun metricHeartbeatTimedOut(props: MetricOptions): Metric =
      unwrap(this).metricHeartbeatTimedOut(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of times the heartbeat times out for this activity.
   *
   * Default: sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e3912384df6fb587488102780ccc376cd7a0166ad9712836974967b5b86d8905")
  public open fun metricHeartbeatTimedOut(props: MetricOptions.Builder.() -> Unit): Metric =
      metricHeartbeatTimedOut(MetricOptions(props))

  /**
   * The interval, in milliseconds, between the time the activity starts and the time it closes.
   *
   * Default: average over 5 minutes
   *
   * @param props
   */
  public open fun metricRunTime(): Metric = unwrap(this).metricRunTime().let(Metric::wrap)

  /**
   * The interval, in milliseconds, between the time the activity starts and the time it closes.
   *
   * Default: average over 5 minutes
   *
   * @param props
   */
  public open fun metricRunTime(props: MetricOptions): Metric =
      unwrap(this).metricRunTime(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * The interval, in milliseconds, between the time the activity starts and the time it closes.
   *
   * Default: average over 5 minutes
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
   * Default: average over 5 minutes
   *
   * @param props
   */
  public open fun metricScheduleTime(): Metric = unwrap(this).metricScheduleTime().let(Metric::wrap)

  /**
   * The interval, in milliseconds, for which the activity stays in the schedule state.
   *
   * Default: average over 5 minutes
   *
   * @param props
   */
  public open fun metricScheduleTime(props: MetricOptions): Metric =
      unwrap(this).metricScheduleTime(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * The interval, in milliseconds, for which the activity stays in the schedule state.
   *
   * Default: average over 5 minutes
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
   * Default: sum over 5 minutes
   *
   * @param props
   */
  public open fun metricScheduled(): Metric = unwrap(this).metricScheduled().let(Metric::wrap)

  /**
   * Metric for the number of times this activity is scheduled.
   *
   * Default: sum over 5 minutes
   *
   * @param props
   */
  public open fun metricScheduled(props: MetricOptions): Metric =
      unwrap(this).metricScheduled(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of times this activity is scheduled.
   *
   * Default: sum over 5 minutes
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
   * Default: sum over 5 minutes
   *
   * @param props
   */
  public open fun metricStarted(): Metric = unwrap(this).metricStarted().let(Metric::wrap)

  /**
   * Metric for the number of times this activity is started.
   *
   * Default: sum over 5 minutes
   *
   * @param props
   */
  public open fun metricStarted(props: MetricOptions): Metric =
      unwrap(this).metricStarted(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of times this activity is started.
   *
   * Default: sum over 5 minutes
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
   * Default: sum over 5 minutes
   *
   * @param props
   */
  public open fun metricSucceeded(): Metric = unwrap(this).metricSucceeded().let(Metric::wrap)

  /**
   * Metric for the number of times this activity succeeds.
   *
   * Default: sum over 5 minutes
   *
   * @param props
   */
  public open fun metricSucceeded(props: MetricOptions): Metric =
      unwrap(this).metricSucceeded(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of times this activity succeeds.
   *
   * Default: sum over 5 minutes
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
   * Default: average over 5 minutes
   *
   * @param props
   */
  public open fun metricTime(): Metric = unwrap(this).metricTime().let(Metric::wrap)

  /**
   * The interval, in milliseconds, between the time the activity is scheduled and the time it
   * closes.
   *
   * Default: average over 5 minutes
   *
   * @param props
   */
  public open fun metricTime(props: MetricOptions): Metric =
      unwrap(this).metricTime(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * The interval, in milliseconds, between the time the activity is scheduled and the time it
   * closes.
   *
   * Default: average over 5 minutes
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
   * Default: sum over 5 minutes
   *
   * @param props
   */
  public open fun metricTimedOut(): Metric = unwrap(this).metricTimedOut().let(Metric::wrap)

  /**
   * Metric for the number of times this activity times out.
   *
   * Default: sum over 5 minutes
   *
   * @param props
   */
  public open fun metricTimedOut(props: MetricOptions): Metric =
      unwrap(this).metricTimedOut(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of times this activity times out.
   *
   * Default: sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1d95fc9b8d64b0d9c0b67a1b010670a63ced883a6bf5b9a5d36c3474119fb181")
  public open fun metricTimedOut(props: MetricOptions.Builder.() -> Unit): Metric =
      metricTimedOut(MetricOptions(props))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.Activity].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name for this activity.
     *
     * Default: - If not supplied, a name is generated
     *
     * @param activityName The name for this activity. 
     */
    public fun activityName(activityName: String)

    /**
     * The encryptionConfiguration object used for server-side encryption of the activity inputs.
     *
     * Default: - data is transparently encrypted using an AWS owned key
     *
     * @param encryptionConfiguration The encryptionConfiguration object used for server-side
     * encryption of the activity inputs. 
     */
    public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfiguration)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.Activity.Builder =
        software.amazon.awscdk.services.stepfunctions.Activity.Builder.create(scope, id)

    /**
     * The name for this activity.
     *
     * Default: - If not supplied, a name is generated
     *
     * @param activityName The name for this activity. 
     */
    override fun activityName(activityName: String) {
      cdkBuilder.activityName(activityName)
    }

    /**
     * The encryptionConfiguration object used for server-side encryption of the activity inputs.
     *
     * Default: - data is transparently encrypted using an AWS owned key
     *
     * @param encryptionConfiguration The encryptionConfiguration object used for server-side
     * encryption of the activity inputs. 
     */
    override fun encryptionConfiguration(encryptionConfiguration: EncryptionConfiguration) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(EncryptionConfiguration.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.Activity = cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.stepfunctions.Activity.PROPERTY_INJECTION_ID

    public fun fromActivityArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      activityArn: String,
    ): IActivity =
        software.amazon.awscdk.services.stepfunctions.Activity.fromActivityArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, activityArn).let(IActivity::wrap)

    public fun fromActivityName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      activityName: String,
    ): IActivity =
        software.amazon.awscdk.services.stepfunctions.Activity.fromActivityName(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, activityName).let(IActivity::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Activity {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Activity(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.Activity): Activity =
        Activity(cdkObject)

    internal fun unwrap(wrapped: Activity): software.amazon.awscdk.services.stepfunctions.Activity =
        wrapped.cdkObject as software.amazon.awscdk.services.stepfunctions.Activity
  }
}
