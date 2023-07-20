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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule
import kotlin.String

@CdkDslMarker
public class CfnMonitoringScheduleMonitoringExecutionSummaryPropertyDsl {
    private val cdkBuilder: CfnMonitoringSchedule.MonitoringExecutionSummaryProperty.Builder =
        CfnMonitoringSchedule.MonitoringExecutionSummaryProperty.builder()

    public fun creationTime(creationTime: String) {
        cdkBuilder.creationTime(creationTime)
    }

    public fun endpointName(endpointName: String) {
        cdkBuilder.endpointName(endpointName)
    }

    public fun failureReason(failureReason: String) {
        cdkBuilder.failureReason(failureReason)
    }

    public fun lastModifiedTime(lastModifiedTime: String) {
        cdkBuilder.lastModifiedTime(lastModifiedTime)
    }

    public fun monitoringExecutionStatus(monitoringExecutionStatus: String) {
        cdkBuilder.monitoringExecutionStatus(monitoringExecutionStatus)
    }

    public fun monitoringScheduleName(monitoringScheduleName: String) {
        cdkBuilder.monitoringScheduleName(monitoringScheduleName)
    }

    public fun processingJobArn(processingJobArn: String) {
        cdkBuilder.processingJobArn(processingJobArn)
    }

    public fun scheduledTime(scheduledTime: String) {
        cdkBuilder.scheduledTime(scheduledTime)
    }

    public fun build(): CfnMonitoringSchedule.MonitoringExecutionSummaryProperty = cdkBuilder.build()
}
