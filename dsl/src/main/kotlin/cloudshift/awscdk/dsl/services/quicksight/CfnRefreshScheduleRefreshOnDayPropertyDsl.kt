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
import software.amazon.awscdk.services.quicksight.CfnRefreshSchedule

/**
 * The day that you want yout dataset to refresh.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * RefreshOnDayProperty refreshOnDayProperty = RefreshOnDayProperty.builder()
 * .dayOfMonth("dayOfMonth")
 * .dayOfWeek("dayOfWeek")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-refreshschedule-refreshonday.html)
 */
@CdkDslMarker
public class CfnRefreshScheduleRefreshOnDayPropertyDsl {
    private val cdkBuilder: CfnRefreshSchedule.RefreshOnDayProperty.Builder =
        CfnRefreshSchedule.RefreshOnDayProperty.builder()

    /**
     * @param dayOfMonth The day of the month that you want your dataset to refresh. This value is
     *   required for monthly refresh intervals.
     */
    public fun dayOfMonth(dayOfMonth: String) {
        cdkBuilder.dayOfMonth(dayOfMonth)
    }

    /**
     * @param dayOfWeek The day of the week that you want to schedule the refresh on. This value is
     *   required for weekly and monthly refresh intervals.
     */
    public fun dayOfWeek(dayOfWeek: String) {
        cdkBuilder.dayOfWeek(dayOfWeek)
    }

    public fun build(): CfnRefreshSchedule.RefreshOnDayProperty = cdkBuilder.build()
}
