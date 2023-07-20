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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.connect.CfnHoursOfOperation
import kotlin.Number

@CdkDslMarker
public class CfnHoursOfOperationHoursOfOperationTimeSlicePropertyDsl {
    private val cdkBuilder: CfnHoursOfOperation.HoursOfOperationTimeSliceProperty.Builder =
        CfnHoursOfOperation.HoursOfOperationTimeSliceProperty.builder()

    public fun hours(hours: Number) {
        cdkBuilder.hours(hours)
    }

    public fun minutes(minutes: Number) {
        cdkBuilder.minutes(minutes)
    }

    public fun build(): CfnHoursOfOperation.HoursOfOperationTimeSliceProperty = cdkBuilder.build()
}
