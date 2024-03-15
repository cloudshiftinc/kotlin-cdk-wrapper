@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Class for scheduling a weekly manitenance time.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.fsx.*;
 * LustreMaintenanceTime lustreMaintenanceTime = LustreMaintenanceTime.Builder.create()
 * .day(Weekday.MONDAY)
 * .hour(123)
 * .minute(123)
 * .build();
 * ```
 */
public open class LustreMaintenanceTime internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.fsx.LustreMaintenanceTime,
) : CdkObject(cdkObject) {
  /**
   * Converts a day, hour, and minute into a timestamp as used by FSx for Lustre's
   * weeklyMaintenanceStartTime field.
   */
  public open fun toTimestamp(): String = unwrap(this).toTimestamp()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.fsx.LustreMaintenanceTime].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The day of the week for maintenance to be performed.
     *
     * @param day The day of the week for maintenance to be performed. 
     */
    public fun day(day: Weekday)

    /**
     * The hour of the day (from 0-24) for maintenance to be performed.
     *
     * @param hour The hour of the day (from 0-24) for maintenance to be performed. 
     */
    public fun hour(hour: Number)

    /**
     * The minute of the hour (from 0-59) for maintenance to be performed.
     *
     * @param minute The minute of the hour (from 0-59) for maintenance to be performed. 
     */
    public fun minute(minute: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fsx.LustreMaintenanceTime.Builder =
        software.amazon.awscdk.services.fsx.LustreMaintenanceTime.Builder.create()

    /**
     * The day of the week for maintenance to be performed.
     *
     * @param day The day of the week for maintenance to be performed. 
     */
    override fun day(day: Weekday) {
      cdkBuilder.day(day.let(Weekday::unwrap))
    }

    /**
     * The hour of the day (from 0-24) for maintenance to be performed.
     *
     * @param hour The hour of the day (from 0-24) for maintenance to be performed. 
     */
    override fun hour(hour: Number) {
      cdkBuilder.hour(hour)
    }

    /**
     * The minute of the hour (from 0-59) for maintenance to be performed.
     *
     * @param minute The minute of the hour (from 0-59) for maintenance to be performed. 
     */
    override fun minute(minute: Number) {
      cdkBuilder.minute(minute)
    }

    public fun build(): software.amazon.awscdk.services.fsx.LustreMaintenanceTime =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LustreMaintenanceTime {
      val builderImpl = BuilderImpl()
      return LustreMaintenanceTime(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.LustreMaintenanceTime):
        LustreMaintenanceTime = LustreMaintenanceTime(cdkObject)

    internal fun unwrap(wrapped: LustreMaintenanceTime):
        software.amazon.awscdk.services.fsx.LustreMaintenanceTime = wrapped.cdkObject
  }
}
