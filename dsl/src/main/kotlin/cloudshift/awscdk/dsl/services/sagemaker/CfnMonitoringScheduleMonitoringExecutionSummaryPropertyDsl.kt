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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

/**
 * Summary of information about the last monitoring job to run.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * MonitoringExecutionSummaryProperty monitoringExecutionSummaryProperty =
 * MonitoringExecutionSummaryProperty.builder()
 * .creationTime("creationTime")
 * .lastModifiedTime("lastModifiedTime")
 * .monitoringExecutionStatus("monitoringExecutionStatus")
 * .monitoringScheduleName("monitoringScheduleName")
 * .scheduledTime("scheduledTime")
 * // the properties below are optional
 * .endpointName("endpointName")
 * .failureReason("failureReason")
 * .processingJobArn("processingJobArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringexecutionsummary.html)
 */
@CdkDslMarker
public class CfnMonitoringScheduleMonitoringExecutionSummaryPropertyDsl {
    private val cdkBuilder: CfnMonitoringSchedule.MonitoringExecutionSummaryProperty.Builder =
        CfnMonitoringSchedule.MonitoringExecutionSummaryProperty.builder()

    /** @param creationTime The time at which the monitoring job was created. */
    public fun creationTime(creationTime: String) {
        cdkBuilder.creationTime(creationTime)
    }

    /** @param endpointName The name of the endpoint used to run the monitoring job. */
    public fun endpointName(endpointName: String) {
        cdkBuilder.endpointName(endpointName)
    }

    /** @param failureReason Contains the reason a monitoring job failed, if it failed. */
    public fun failureReason(failureReason: String) {
        cdkBuilder.failureReason(failureReason)
    }

    /**
     * @param lastModifiedTime A timestamp that indicates the last time the monitoring job was
     *   modified.
     */
    public fun lastModifiedTime(lastModifiedTime: String) {
        cdkBuilder.lastModifiedTime(lastModifiedTime)
    }

    /** @param monitoringExecutionStatus The status of the monitoring job. */
    public fun monitoringExecutionStatus(monitoringExecutionStatus: String) {
        cdkBuilder.monitoringExecutionStatus(monitoringExecutionStatus)
    }

    /** @param monitoringScheduleName The name of the monitoring schedule. */
    public fun monitoringScheduleName(monitoringScheduleName: String) {
        cdkBuilder.monitoringScheduleName(monitoringScheduleName)
    }

    /** @param processingJobArn The Amazon Resource Name (ARN) of the monitoring job. */
    public fun processingJobArn(processingJobArn: String) {
        cdkBuilder.processingJobArn(processingJobArn)
    }

    /** @param scheduledTime The time the monitoring job was scheduled. */
    public fun scheduledTime(scheduledTime: String) {
        cdkBuilder.scheduledTime(scheduledTime)
    }

    public fun build(): CfnMonitoringSchedule.MonitoringExecutionSummaryProperty =
        cdkBuilder.build()
}
