@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling.common

import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.common.Alarms
import software.amazon.awscdk.services.autoscaling.common.ArbitraryIntervals
import software.amazon.awscdk.services.autoscaling.common.CompleteScalingInterval
import software.amazon.awscdk.services.autoscaling.common.ScalingInterval

public object common {
  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.autoscaling.common.*;
   * Alarms alarms = Alarms.builder()
   * .lowerAlarmIntervalIndex(123)
   * .upperAlarmIntervalIndex(123)
   * .build();
   * ```
   */
  public inline fun alarms(block: AlarmsDsl.() -> Unit = {}): Alarms {
    val builder = AlarmsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.autoscaling.common.*;
   * ArbitraryIntervals arbitraryIntervals = ArbitraryIntervals.builder()
   * .absolute(false)
   * .intervals(List.of(ScalingInterval.builder()
   * .change(123)
   * // the properties below are optional
   * .lower(123)
   * .upper(123)
   * .build()))
   * .build();
   * ```
   */
  public inline fun arbitraryIntervals(block: ArbitraryIntervalsDsl.() -> Unit = {}):
      ArbitraryIntervals {
    val builder = ArbitraryIntervalsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.autoscaling.common.*;
   * CompleteScalingInterval completeScalingInterval = CompleteScalingInterval.builder()
   * .lower(123)
   * .upper(123)
   * // the properties below are optional
   * .change(123)
   * .build();
   * ```
   */
  public inline fun completeScalingInterval(block: CompleteScalingIntervalDsl.() -> Unit = {}):
      CompleteScalingInterval {
    val builder = CompleteScalingIntervalDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A range of metric values in which to apply a certain scaling operation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.autoscaling.common.*;
   * ScalingInterval scalingInterval = ScalingInterval.builder()
   * .change(123)
   * // the properties below are optional
   * .lower(123)
   * .upper(123)
   * .build();
   * ```
   */
  public inline fun scalingInterval(block: ScalingIntervalDsl.() -> Unit = {}): ScalingInterval {
    val builder = ScalingIntervalDsl()
    builder.apply(block)
    return builder.build()
  }
}
