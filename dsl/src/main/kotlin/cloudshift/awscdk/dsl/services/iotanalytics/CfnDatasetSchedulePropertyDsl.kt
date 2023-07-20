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

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iotanalytics.CfnDataset
import kotlin.String

@CdkDslMarker
public class CfnDatasetSchedulePropertyDsl {
    private val cdkBuilder: CfnDataset.ScheduleProperty.Builder =
        CfnDataset.ScheduleProperty.builder()

    public fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
    }

    public fun build(): CfnDataset.ScheduleProperty = cdkBuilder.build()
}
