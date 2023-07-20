@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnRefreshSchedule
import software.amazon.awscdk.services.quicksight.CfnRefreshScheduleProps
import kotlin.String

@CdkDslMarker
public class CfnRefreshSchedulePropsDsl {
    private val cdkBuilder: CfnRefreshScheduleProps.Builder = CfnRefreshScheduleProps.builder()

    public fun awsAccountId(awsAccountId: String) {
        cdkBuilder.awsAccountId(awsAccountId)
    }

    public fun dataSetId(dataSetId: String) {
        cdkBuilder.dataSetId(dataSetId)
    }

    public fun schedule(schedule: IResolvable) {
        cdkBuilder.schedule(schedule)
    }

    public fun schedule(schedule: CfnRefreshSchedule.RefreshScheduleMapProperty) {
        cdkBuilder.schedule(schedule)
    }

    public fun build(): CfnRefreshScheduleProps = cdkBuilder.build()
}
