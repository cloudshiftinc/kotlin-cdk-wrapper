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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnRefreshSchedule
import software.amazon.awscdk.services.quicksight.CfnRefreshScheduleProps

/**
 * Properties for defining a `CfnRefreshSchedule`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CfnRefreshScheduleProps cfnRefreshScheduleProps = CfnRefreshScheduleProps.builder()
 * .awsAccountId("awsAccountId")
 * .dataSetId("dataSetId")
 * .schedule(RefreshScheduleMapProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-refreshschedule.html)
 */
@CdkDslMarker
public class CfnRefreshSchedulePropsDsl {
    private val cdkBuilder: CfnRefreshScheduleProps.Builder = CfnRefreshScheduleProps.builder()

    /**
     * @param awsAccountId The AWS account ID of the account that you are creating a schedule in.
     */
    public fun awsAccountId(awsAccountId: String) {
        cdkBuilder.awsAccountId(awsAccountId)
    }

    /** @param dataSetId The ID of the dataset that you are creating a refresh schedule for. */
    public fun dataSetId(dataSetId: String) {
        cdkBuilder.dataSetId(dataSetId)
    }

    /** @param schedule The refresh schedule of a dataset. */
    public fun schedule(schedule: IResolvable) {
        cdkBuilder.schedule(schedule)
    }

    /** @param schedule The refresh schedule of a dataset. */
    public fun schedule(schedule: CfnRefreshSchedule.RefreshScheduleMapProperty) {
        cdkBuilder.schedule(schedule)
    }

    public fun build(): CfnRefreshScheduleProps = cdkBuilder.build()
}
