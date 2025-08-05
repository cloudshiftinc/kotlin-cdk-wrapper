@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Options to configure a cron expression.
 *
 * All fields are strings so you can use complex expressions. Absence of
 * a field implies '*' or '?', whichever one is appropriate.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * ApplicationLoadBalancedFargateService loadBalancedFargateService =
 * ApplicationLoadBalancedFargateService.Builder.create(this, "Service")
 * .cluster(cluster)
 * .memoryLimitMiB(1024)
 * .desiredCount(1)
 * .cpu(512)
 * .taskImageOptions(ApplicationLoadBalancedTaskImageOptions.builder()
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .build())
 * .minHealthyPercent(100)
 * .build();
 * ScalableTaskCount scalableTarget =
 * loadBalancedFargateService.service.autoScaleTaskCount(EnableScalingProps.builder()
 * .minCapacity(5)
 * .maxCapacity(20)
 * .build());
 * scalableTarget.scaleOnSchedule("DaytimeScaleDown", ScalingSchedule.builder()
 * .schedule(Schedule.cron(CronOptions.builder().hour("8").minute("0").build()))
 * .minCapacity(1)
 * .build());
 * scalableTarget.scaleOnSchedule("EveningRushScaleUp", ScalingSchedule.builder()
 * .schedule(Schedule.cron(CronOptions.builder().hour("20").minute("0").build()))
 * .minCapacity(10)
 * .build());
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions)
 */
public interface CronOptions {
  /**
   * The day of the month to run this rule at.
   *
   * Default: - Every day of the month
   */
  public fun day(): String? = unwrap(this).getDay()

  /**
   * The hour to run this rule at.
   *
   * Default: - Every hour
   */
  public fun hour(): String? = unwrap(this).getHour()

  /**
   * The minute to run this rule at.
   *
   * Default: - Every minute
   */
  public fun minute(): String? = unwrap(this).getMinute()

  /**
   * The month to run this rule at.
   *
   * Default: - Every month
   */
  public fun month(): String? = unwrap(this).getMonth()

  /**
   * The day of the week to run this rule at.
   *
   * Default: - Any day of the week
   */
  public fun weekDay(): String? = unwrap(this).getWeekDay()

  /**
   * The year to run this rule at.
   *
   * Default: - Every year
   */
  public fun year(): String? = unwrap(this).getYear()

  /**
   * A builder for [CronOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param day The day of the month to run this rule at.
     */
    public fun day(day: String)

    /**
     * @param hour The hour to run this rule at.
     */
    public fun hour(hour: String)

    /**
     * @param minute The minute to run this rule at.
     */
    public fun minute(minute: String)

    /**
     * @param month The month to run this rule at.
     */
    public fun month(month: String)

    /**
     * @param weekDay The day of the week to run this rule at.
     */
    public fun weekDay(weekDay: String)

    /**
     * @param year The year to run this rule at.
     */
    public fun year(year: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.CronOptions.Builder =
        software.amazon.awscdk.services.applicationautoscaling.CronOptions.builder()

    /**
     * @param day The day of the month to run this rule at.
     */
    override fun day(day: String) {
      cdkBuilder.day(day)
    }

    /**
     * @param hour The hour to run this rule at.
     */
    override fun hour(hour: String) {
      cdkBuilder.hour(hour)
    }

    /**
     * @param minute The minute to run this rule at.
     */
    override fun minute(minute: String) {
      cdkBuilder.minute(minute)
    }

    /**
     * @param month The month to run this rule at.
     */
    override fun month(month: String) {
      cdkBuilder.month(month)
    }

    /**
     * @param weekDay The day of the week to run this rule at.
     */
    override fun weekDay(weekDay: String) {
      cdkBuilder.weekDay(weekDay)
    }

    /**
     * @param year The year to run this rule at.
     */
    override fun year(year: String) {
      cdkBuilder.year(year)
    }

    public fun build(): software.amazon.awscdk.services.applicationautoscaling.CronOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.applicationautoscaling.CronOptions,
  ) : CdkObject(cdkObject),
      CronOptions {
    /**
     * The day of the month to run this rule at.
     *
     * Default: - Every day of the month
     */
    override fun day(): String? = unwrap(this).getDay()

    /**
     * The hour to run this rule at.
     *
     * Default: - Every hour
     */
    override fun hour(): String? = unwrap(this).getHour()

    /**
     * The minute to run this rule at.
     *
     * Default: - Every minute
     */
    override fun minute(): String? = unwrap(this).getMinute()

    /**
     * The month to run this rule at.
     *
     * Default: - Every month
     */
    override fun month(): String? = unwrap(this).getMonth()

    /**
     * The day of the week to run this rule at.
     *
     * Default: - Any day of the week
     */
    override fun weekDay(): String? = unwrap(this).getWeekDay()

    /**
     * The year to run this rule at.
     *
     * Default: - Every year
     */
    override fun year(): String? = unwrap(this).getYear()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CronOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CronOptions):
        CronOptions = CdkObjectWrappers.wrap(cdkObject) as? CronOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CronOptions):
        software.amazon.awscdk.services.applicationautoscaling.CronOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.applicationautoscaling.CronOptions
  }
}
