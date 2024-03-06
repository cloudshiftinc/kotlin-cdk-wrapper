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

package io.cloudshiftdev.awscdkdsl.services.applicationautoscaling

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import java.time.Instant
import kotlin.Number
import software.amazon.awscdk.TimeZone
import software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule
import software.amazon.awscdk.services.applicationautoscaling.Schedule

/**
 * A scheduled scaling action.
 *
 * Example:
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
 */
@CdkDslMarker
public class ScalingScheduleDsl {
    private val cdkBuilder: ScalingSchedule.Builder = ScalingSchedule.builder()

    /** @param endTime When this scheduled action expires. */
    public fun endTime(endTime: Instant) {
        cdkBuilder.endTime(endTime)
    }

    /**
     * @param maxCapacity The new maximum capacity. During the scheduled time, the current capacity
     *   is above the maximum capacity, Application Auto Scaling scales in to the maximum capacity.
     *
     * At least one of maxCapacity and minCapacity must be supplied.
     */
    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * @param minCapacity The new minimum capacity. During the scheduled time, if the current
     *   capacity is below the minimum capacity, Application Auto Scaling scales out to the minimum
     *   capacity.
     *
     * At least one of maxCapacity and minCapacity must be supplied.
     */
    public fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
    }

    /** @param schedule When to perform this action. */
    public fun schedule(schedule: Schedule) {
        cdkBuilder.schedule(schedule)
    }

    /** @param startTime When this scheduled action becomes active. */
    public fun startTime(startTime: Instant) {
        cdkBuilder.startTime(startTime)
    }

    /**
     * @param timeZone The time zone used when referring to the date and time of a scheduled action,
     *   when the scheduled action uses an at or cron expression.
     */
    public fun timeZone(timeZone: TimeZone) {
        cdkBuilder.timeZone(timeZone)
    }

    public fun build(): ScalingSchedule = cdkBuilder.build()
}
