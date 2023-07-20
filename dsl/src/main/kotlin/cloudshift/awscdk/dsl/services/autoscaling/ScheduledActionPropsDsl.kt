@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.autoscaling.IAutoScalingGroup
import software.amazon.awscdk.services.autoscaling.Schedule
import software.amazon.awscdk.services.autoscaling.ScheduledActionProps
import java.time.Instant
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class ScheduledActionPropsDsl {
    private val cdkBuilder: ScheduledActionProps.Builder = ScheduledActionProps.builder()

    public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
        cdkBuilder.autoScalingGroup(autoScalingGroup)
    }

    public fun desiredCapacity(desiredCapacity: Number) {
        cdkBuilder.desiredCapacity(desiredCapacity)
    }

    public fun endTime(endTime: Instant) {
        cdkBuilder.endTime(endTime)
    }

    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    public fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
    }

    public fun schedule(schedule: Schedule) {
        cdkBuilder.schedule(schedule)
    }

    public fun startTime(startTime: Instant) {
        cdkBuilder.startTime(startTime)
    }

    public fun timeZone(timeZone: String) {
        cdkBuilder.timeZone(timeZone)
    }

    public fun build(): ScheduledActionProps = cdkBuilder.build()
}
