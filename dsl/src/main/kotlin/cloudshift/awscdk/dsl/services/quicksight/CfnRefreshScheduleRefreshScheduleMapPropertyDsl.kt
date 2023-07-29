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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnRefreshSchedule

/**
 * A summary of a configured refresh schedule for a dataset.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * RefreshScheduleMapProperty refreshScheduleMapProperty = RefreshScheduleMapProperty.builder()
 * .refreshType("refreshType")
 * .scheduleFrequency(ScheduleFrequencyProperty.builder()
 * .interval("interval")
 * .refreshOnDay(RefreshOnDayProperty.builder()
 * .dayOfMonth("dayOfMonth")
 * .dayOfWeek("dayOfWeek")
 * .build())
 * .timeOfTheDay("timeOfTheDay")
 * .timeZone("timeZone")
 * .build())
 * .scheduleId("scheduleId")
 * .startAfterDateTime("startAfterDateTime")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-refreshschedule-refreshschedulemap.html)
 */
@CdkDslMarker
public class CfnRefreshScheduleRefreshScheduleMapPropertyDsl {
    private val cdkBuilder: CfnRefreshSchedule.RefreshScheduleMapProperty.Builder =
        CfnRefreshSchedule.RefreshScheduleMapProperty.builder()

    /**
     * @param refreshType The type of refresh that a dataset undergoes. Valid values are as
     *   follows:.
     * * `FULL_REFRESH` : A complete refresh of a dataset.
     * * `INCREMENTAL_REFRESH` : A partial refresh of some rows of a dataset, based on the time
     *   window specified.
     *
     * For more information on full and incremental refreshes, see
     * [Refreshing SPICE data](https://docs.aws.amazon.com/quicksight/latest/user/refreshing-imported-data.html)
     * in the *Amazon QuickSight User Guide* .
     */
    public fun refreshType(refreshType: String) {
        cdkBuilder.refreshType(refreshType)
    }

    /** @param scheduleFrequency The frequency for the refresh schedule. */
    public fun scheduleFrequency(scheduleFrequency: IResolvable) {
        cdkBuilder.scheduleFrequency(scheduleFrequency)
    }

    /** @param scheduleFrequency The frequency for the refresh schedule. */
    public fun scheduleFrequency(scheduleFrequency: CfnRefreshSchedule.ScheduleFrequencyProperty) {
        cdkBuilder.scheduleFrequency(scheduleFrequency)
    }

    /** @param scheduleId An identifier for the refresh schedule. */
    public fun scheduleId(scheduleId: String) {
        cdkBuilder.scheduleId(scheduleId)
    }

    /**
     * @param startAfterDateTime Time after which the refresh schedule can be started, expressed in
     *   `YYYY-MM-DDTHH:MM:SS` format.
     */
    public fun startAfterDateTime(startAfterDateTime: String) {
        cdkBuilder.startAfterDateTime(startAfterDateTime)
    }

    public fun build(): CfnRefreshSchedule.RefreshScheduleMapProperty = cdkBuilder.build()
}
