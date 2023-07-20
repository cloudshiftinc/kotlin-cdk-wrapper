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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnHoursOfOperation
import kotlin.String

@CdkDslMarker
public class CfnHoursOfOperationHoursOfOperationConfigPropertyDsl {
    private val cdkBuilder: CfnHoursOfOperation.HoursOfOperationConfigProperty.Builder =
        CfnHoursOfOperation.HoursOfOperationConfigProperty.builder()

    public fun day(day: String) {
        cdkBuilder.day(day)
    }

    public fun endTime(endTime: IResolvable) {
        cdkBuilder.endTime(endTime)
    }

    public fun endTime(endTime: CfnHoursOfOperation.HoursOfOperationTimeSliceProperty) {
        cdkBuilder.endTime(endTime)
    }

    public fun startTime(startTime: IResolvable) {
        cdkBuilder.startTime(startTime)
    }

    public fun startTime(startTime: CfnHoursOfOperation.HoursOfOperationTimeSliceProperty) {
        cdkBuilder.startTime(startTime)
    }

    public fun build(): CfnHoursOfOperation.HoursOfOperationConfigProperty = cdkBuilder.build()
}
