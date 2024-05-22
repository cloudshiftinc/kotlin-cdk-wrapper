@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Properties required for setting up a weekly maintenance time.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.fsx.*;
 * LustreMaintenanceTimeProps lustreMaintenanceTimeProps = LustreMaintenanceTimeProps.builder()
 * .day(Weekday.MONDAY)
 * .hour(123)
 * .minute(123)
 * .build();
 * ```
 */
public interface LustreMaintenanceTimeProps {
  /**
   * The day of the week for maintenance to be performed.
   */
  public fun day(): Weekday

  /**
   * The hour of the day (from 0-24) for maintenance to be performed.
   */
  public fun hour(): Number

  /**
   * The minute of the hour (from 0-59) for maintenance to be performed.
   */
  public fun minute(): Number

  /**
   * A builder for [LustreMaintenanceTimeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param day The day of the week for maintenance to be performed. 
     */
    public fun day(day: Weekday)

    /**
     * @param hour The hour of the day (from 0-24) for maintenance to be performed. 
     */
    public fun hour(hour: Number)

    /**
     * @param minute The minute of the hour (from 0-59) for maintenance to be performed. 
     */
    public fun minute(minute: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fsx.LustreMaintenanceTimeProps.Builder =
        software.amazon.awscdk.services.fsx.LustreMaintenanceTimeProps.builder()

    /**
     * @param day The day of the week for maintenance to be performed. 
     */
    override fun day(day: Weekday) {
      cdkBuilder.day(day.let(Weekday.Companion::unwrap))
    }

    /**
     * @param hour The hour of the day (from 0-24) for maintenance to be performed. 
     */
    override fun hour(hour: Number) {
      cdkBuilder.hour(hour)
    }

    /**
     * @param minute The minute of the hour (from 0-59) for maintenance to be performed. 
     */
    override fun minute(minute: Number) {
      cdkBuilder.minute(minute)
    }

    public fun build(): software.amazon.awscdk.services.fsx.LustreMaintenanceTimeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.fsx.LustreMaintenanceTimeProps,
  ) : CdkObject(cdkObject), LustreMaintenanceTimeProps {
    /**
     * The day of the week for maintenance to be performed.
     */
    override fun day(): Weekday = unwrap(this).getDay().let(Weekday::wrap)

    /**
     * The hour of the day (from 0-24) for maintenance to be performed.
     */
    override fun hour(): Number = unwrap(this).getHour()

    /**
     * The minute of the hour (from 0-59) for maintenance to be performed.
     */
    override fun minute(): Number = unwrap(this).getMinute()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LustreMaintenanceTimeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.LustreMaintenanceTimeProps):
        LustreMaintenanceTimeProps = CdkObjectWrappers.wrap(cdkObject) as?
        LustreMaintenanceTimeProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: LustreMaintenanceTimeProps):
        software.amazon.awscdk.services.fsx.LustreMaintenanceTimeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.fsx.LustreMaintenanceTimeProps
  }
}
