@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Properties required for setting up a daily automatic backup time.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.*;
 * Map&lt;String, Object&gt; lustreConfiguration = Map.of(
 * // ...
 * "automaticBackupRetention", Duration.days(3),  // backup retention
 * "copyTagsToBackups", true,  // if true, tags are copied to backups
 * "dailyAutomaticBackupStartTime",
 * DailyAutomaticBackupStartTime.Builder.create().hour(11).minute(30).build());
 * ```
 */
public interface DailyAutomaticBackupStartTimeProps {
  /**
   * The hour of the day (from 0-23) for automatic backup starts.
   */
  public fun hour(): Number

  /**
   * The minute of the hour (from 0-59) for automatic backup starts.
   */
  public fun minute(): Number

  /**
   * A builder for [DailyAutomaticBackupStartTimeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param hour The hour of the day (from 0-23) for automatic backup starts. 
     */
    public fun hour(hour: Number)

    /**
     * @param minute The minute of the hour (from 0-59) for automatic backup starts. 
     */
    public fun minute(minute: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.fsx.DailyAutomaticBackupStartTimeProps.Builder =
        software.amazon.awscdk.services.fsx.DailyAutomaticBackupStartTimeProps.builder()

    /**
     * @param hour The hour of the day (from 0-23) for automatic backup starts. 
     */
    override fun hour(hour: Number) {
      cdkBuilder.hour(hour)
    }

    /**
     * @param minute The minute of the hour (from 0-59) for automatic backup starts. 
     */
    override fun minute(minute: Number) {
      cdkBuilder.minute(minute)
    }

    public fun build(): software.amazon.awscdk.services.fsx.DailyAutomaticBackupStartTimeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.fsx.DailyAutomaticBackupStartTimeProps,
  ) : CdkObject(cdkObject),
      DailyAutomaticBackupStartTimeProps {
    /**
     * The hour of the day (from 0-23) for automatic backup starts.
     */
    override fun hour(): Number = unwrap(this).getHour()

    /**
     * The minute of the hour (from 0-59) for automatic backup starts.
     */
    override fun minute(): Number = unwrap(this).getMinute()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DailyAutomaticBackupStartTimeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.fsx.DailyAutomaticBackupStartTimeProps):
        DailyAutomaticBackupStartTimeProps = CdkObjectWrappers.wrap(cdkObject) as?
        DailyAutomaticBackupStartTimeProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: DailyAutomaticBackupStartTimeProps):
        software.amazon.awscdk.services.fsx.DailyAutomaticBackupStartTimeProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.fsx.DailyAutomaticBackupStartTimeProps
  }
}
