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
import software.constructs.Construct

/**
 * Creates a refresh schedule for a dataset in Amazon QuickSight .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CfnRefreshSchedule cfnRefreshSchedule = CfnRefreshSchedule.Builder.create(this,
 * "MyCfnRefreshSchedule")
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
public class CfnRefreshScheduleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRefreshSchedule.Builder =
        CfnRefreshSchedule.Builder.create(scope, id)

    /**
     * The AWS account ID of the account that you are creating a schedule in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-refreshschedule.html#cfn-quicksight-refreshschedule-awsaccountid)
     *
     * @param awsAccountId The AWS account ID of the account that you are creating a schedule in.
     */
    public fun awsAccountId(awsAccountId: String) {
        cdkBuilder.awsAccountId(awsAccountId)
    }

    /**
     * The ID of the dataset that you are creating a refresh schedule for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-refreshschedule.html#cfn-quicksight-refreshschedule-datasetid)
     *
     * @param dataSetId The ID of the dataset that you are creating a refresh schedule for.
     */
    public fun dataSetId(dataSetId: String) {
        cdkBuilder.dataSetId(dataSetId)
    }

    /**
     * The refresh schedule of a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-refreshschedule.html#cfn-quicksight-refreshschedule-schedule)
     *
     * @param schedule The refresh schedule of a dataset.
     */
    public fun schedule(schedule: IResolvable) {
        cdkBuilder.schedule(schedule)
    }

    /**
     * The refresh schedule of a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-refreshschedule.html#cfn-quicksight-refreshschedule-schedule)
     *
     * @param schedule The refresh schedule of a dataset.
     */
    public fun schedule(schedule: CfnRefreshSchedule.RefreshScheduleMapProperty) {
        cdkBuilder.schedule(schedule)
    }

    public fun build(): CfnRefreshSchedule = cdkBuilder.build()
}
