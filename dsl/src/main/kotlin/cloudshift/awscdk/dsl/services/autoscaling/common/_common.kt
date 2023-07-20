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

package cloudshift.awscdk.dsl.services.autoscaling.common

import software.amazon.awscdk.services.autoscaling.common.Alarms
import software.amazon.awscdk.services.autoscaling.common.ArbitraryIntervals
import software.amazon.awscdk.services.autoscaling.common.CompleteScalingInterval
import software.amazon.awscdk.services.autoscaling.common.ScalingInterval
import kotlin.Unit

public object common {
    public inline fun alarms(block: AlarmsDsl.() -> Unit = {}): Alarms {
        val builder = AlarmsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun arbitraryIntervals(block: ArbitraryIntervalsDsl.() -> Unit = {}): ArbitraryIntervals {
        val builder = ArbitraryIntervalsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun completeScalingInterval(block: CompleteScalingIntervalDsl.() -> Unit = {}): CompleteScalingInterval {
        val builder = CompleteScalingIntervalDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun scalingInterval(block: ScalingIntervalDsl.() -> Unit = {}): ScalingInterval {
        val builder = ScalingIntervalDsl()
        builder.apply(block)
        return builder.build()
    }
}
