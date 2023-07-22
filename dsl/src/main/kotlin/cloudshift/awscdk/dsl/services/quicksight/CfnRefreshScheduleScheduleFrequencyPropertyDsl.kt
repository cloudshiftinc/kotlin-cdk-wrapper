@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnRefreshSchedule

/**
 * The frequency for the refresh schedule.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ScheduleFrequencyProperty scheduleFrequencyProperty = ScheduleFrequencyProperty.builder()
 * .interval("interval")
 * .refreshOnDay(RefreshOnDayProperty.builder()
 * .dayOfMonth("dayOfMonth")
 * .dayOfWeek("dayOfWeek")
 * .build())
 * .timeOfTheDay("timeOfTheDay")
 * .timeZone("timeZone")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-refreshschedule-schedulefrequency.html)
 */
@CdkDslMarker
public class CfnRefreshScheduleScheduleFrequencyPropertyDsl {
  private val cdkBuilder: CfnRefreshSchedule.ScheduleFrequencyProperty.Builder =
      CfnRefreshSchedule.ScheduleFrequencyProperty.builder()

  /**
   * @param interval The interval between scheduled refreshes. Valid values are as follows:.
   * * `MINUTE15` : The dataset refreshes every 15 minutes. This value is only supported for
   * incremental refreshes. This interval can only be used for one schedule per dataset.
   * * `MINUTE30` : The dataset refreshes every 30 minutes. This value is only supported for
   * incremental refreshes. This interval can only be used for one schedule per dataset.
   * * `HOURLY` : The dataset refreshes every hour. This interval can only be used for one schedule
   * per dataset.
   * * `DAILY` : The dataset refreshes every day.
   * * `WEEKLY` : The dataset refreshes every week.
   * * `MONTHLY` : The dataset refreshes every month.
   */
  public fun interval(interval: String) {
    cdkBuilder.interval(interval)
  }

  /**
   * @param refreshOnDay The day of the week that you want to schedule the refresh on.
   * This value is required for weekly and monthly refresh intervals.
   */
  public fun refreshOnDay(refreshOnDay: IResolvable) {
    cdkBuilder.refreshOnDay(refreshOnDay)
  }

  /**
   * @param refreshOnDay The day of the week that you want to schedule the refresh on.
   * This value is required for weekly and monthly refresh intervals.
   */
  public fun refreshOnDay(refreshOnDay: CfnRefreshSchedule.RefreshOnDayProperty) {
    cdkBuilder.refreshOnDay(refreshOnDay)
  }

  /**
   * @param timeOfTheDay The time of day that you want the dataset to refresh.
   * This value is expressed in HH:MM format. This field is not required for schedules that refresh
   * hourly.
   */
  public fun timeOfTheDay(timeOfTheDay: String) {
    cdkBuilder.timeOfTheDay(timeOfTheDay)
  }

  /**
   * @param timeZone The timezone that you want the refresh schedule to use.
   * The timezone ID must match a corresponding ID found on `java.util.time.getAvailableIDs()` .
   */
  public fun timeZone(timeZone: String) {
    cdkBuilder.timeZone(timeZone)
  }

  public fun build(): CfnRefreshSchedule.ScheduleFrequencyProperty = cdkBuilder.build()
}
