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
import kotlin.String

@CdkDslMarker
public class CfnRefreshScheduleRefreshScheduleMapPropertyDsl {
    private val cdkBuilder: CfnRefreshSchedule.RefreshScheduleMapProperty.Builder =
        CfnRefreshSchedule.RefreshScheduleMapProperty.builder()

    public fun refreshType(refreshType: String) {
        cdkBuilder.refreshType(refreshType)
    }

    public fun scheduleFrequency(scheduleFrequency: IResolvable) {
        cdkBuilder.scheduleFrequency(scheduleFrequency)
    }

    public fun scheduleFrequency(scheduleFrequency: CfnRefreshSchedule.ScheduleFrequencyProperty) {
        cdkBuilder.scheduleFrequency(scheduleFrequency)
    }

    public fun scheduleId(scheduleId: String) {
        cdkBuilder.scheduleId(scheduleId)
    }

    public fun startAfterDateTime(startAfterDateTime: String) {
        cdkBuilder.startAfterDateTime(startAfterDateTime)
    }

    public fun build(): CfnRefreshSchedule.RefreshScheduleMapProperty = cdkBuilder.build()
}
