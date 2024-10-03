@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Class for scheduling a daily automatic backup time.
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
public open class DailyAutomaticBackupStartTime(
  cdkObject: software.amazon.awscdk.services.fsx.DailyAutomaticBackupStartTime,
) : CdkObject(cdkObject) {
  public constructor(props: DailyAutomaticBackupStartTimeProps) :
      this(software.amazon.awscdk.services.fsx.DailyAutomaticBackupStartTime(props.let(DailyAutomaticBackupStartTimeProps.Companion::unwrap))
  )

  public constructor(props: DailyAutomaticBackupStartTimeProps.Builder.() -> Unit) :
      this(DailyAutomaticBackupStartTimeProps(props)
  )

  /**
   * Converts an hour, and minute into HH:MM string.
   */
  public open fun toTimestamp(): String = unwrap(this).toTimestamp()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.fsx.DailyAutomaticBackupStartTime].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The hour of the day (from 0-23) for automatic backup starts.
     *
     * @param hour The hour of the day (from 0-23) for automatic backup starts. 
     */
    public fun hour(hour: Number)

    /**
     * The minute of the hour (from 0-59) for automatic backup starts.
     *
     * @param minute The minute of the hour (from 0-59) for automatic backup starts. 
     */
    public fun minute(minute: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.fsx.DailyAutomaticBackupStartTime.Builder =
        software.amazon.awscdk.services.fsx.DailyAutomaticBackupStartTime.Builder.create()

    /**
     * The hour of the day (from 0-23) for automatic backup starts.
     *
     * @param hour The hour of the day (from 0-23) for automatic backup starts. 
     */
    override fun hour(hour: Number) {
      cdkBuilder.hour(hour)
    }

    /**
     * The minute of the hour (from 0-59) for automatic backup starts.
     *
     * @param minute The minute of the hour (from 0-59) for automatic backup starts. 
     */
    override fun minute(minute: Number) {
      cdkBuilder.minute(minute)
    }

    public fun build(): software.amazon.awscdk.services.fsx.DailyAutomaticBackupStartTime =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DailyAutomaticBackupStartTime {
      val builderImpl = BuilderImpl()
      return DailyAutomaticBackupStartTime(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.DailyAutomaticBackupStartTime):
        DailyAutomaticBackupStartTime = DailyAutomaticBackupStartTime(cdkObject)

    internal fun unwrap(wrapped: DailyAutomaticBackupStartTime):
        software.amazon.awscdk.services.fsx.DailyAutomaticBackupStartTime = wrapped.cdkObject as
        software.amazon.awscdk.services.fsx.DailyAutomaticBackupStartTime
  }
}
