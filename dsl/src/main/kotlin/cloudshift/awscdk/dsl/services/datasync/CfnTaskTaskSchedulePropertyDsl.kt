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

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.datasync.CfnTask
import kotlin.String

@CdkDslMarker
public class CfnTaskTaskSchedulePropertyDsl {
    private val cdkBuilder: CfnTask.TaskScheduleProperty.Builder =
        CfnTask.TaskScheduleProperty.builder()

    public fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
    }

    public fun build(): CfnTask.TaskScheduleProperty = cdkBuilder.build()
}
