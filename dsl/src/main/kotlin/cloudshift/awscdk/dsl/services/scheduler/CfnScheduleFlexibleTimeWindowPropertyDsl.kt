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

package cloudshift.awscdk.dsl.services.scheduler

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.scheduler.CfnSchedule
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnScheduleFlexibleTimeWindowPropertyDsl {
    private val cdkBuilder: CfnSchedule.FlexibleTimeWindowProperty.Builder =
        CfnSchedule.FlexibleTimeWindowProperty.builder()

    public fun maximumWindowInMinutes(maximumWindowInMinutes: Number) {
        cdkBuilder.maximumWindowInMinutes(maximumWindowInMinutes)
    }

    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    public fun build(): CfnSchedule.FlexibleTimeWindowProperty = cdkBuilder.build()
}
