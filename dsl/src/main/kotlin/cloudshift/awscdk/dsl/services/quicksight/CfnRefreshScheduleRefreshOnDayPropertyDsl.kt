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
import software.amazon.awscdk.services.quicksight.CfnRefreshSchedule
import kotlin.String

@CdkDslMarker
public class CfnRefreshScheduleRefreshOnDayPropertyDsl {
    private val cdkBuilder: CfnRefreshSchedule.RefreshOnDayProperty.Builder =
        CfnRefreshSchedule.RefreshOnDayProperty.builder()

    public fun dayOfMonth(dayOfMonth: String) {
        cdkBuilder.dayOfMonth(dayOfMonth)
    }

    public fun dayOfWeek(dayOfWeek: String) {
        cdkBuilder.dayOfWeek(dayOfWeek)
    }

    public fun build(): CfnRefreshSchedule.RefreshOnDayProperty = cdkBuilder.build()
}
