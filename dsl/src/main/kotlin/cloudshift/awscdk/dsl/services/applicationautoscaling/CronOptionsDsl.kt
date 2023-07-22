@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.applicationautoscaling.CronOptions

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
@CdkDslMarker
public class CronOptionsDsl {
  private val cdkBuilder: CronOptions.Builder = CronOptions.builder()

  /**
   * @param day The day of the month to run this rule at.
   */
  public fun day(day: String) {
    cdkBuilder.day(day)
  }

  /**
   * @param hour The hour to run this rule at.
   */
  public fun hour(hour: String) {
    cdkBuilder.hour(hour)
  }

  /**
   * @param minute The minute to run this rule at.
   */
  public fun minute(minute: String) {
    cdkBuilder.minute(minute)
  }

  /**
   * @param month The month to run this rule at.
   */
  public fun month(month: String) {
    cdkBuilder.month(month)
  }

  /**
   * @param weekDay The day of the week to run this rule at.
   */
  public fun weekDay(weekDay: String) {
    cdkBuilder.weekDay(weekDay)
  }

  /**
   * @param year The year to run this rule at.
   */
  public fun year(year: String) {
    cdkBuilder.year(year)
  }

  public fun build(): CronOptions = cdkBuilder.build()
}
