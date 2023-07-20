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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule
import kotlin.String

@CdkDslMarker
public class CfnMonitoringScheduleMonitoringScheduleConfigPropertyDsl {
    private val cdkBuilder: CfnMonitoringSchedule.MonitoringScheduleConfigProperty.Builder =
        CfnMonitoringSchedule.MonitoringScheduleConfigProperty.builder()

    public fun monitoringJobDefinition(monitoringJobDefinition: IResolvable) {
        cdkBuilder.monitoringJobDefinition(monitoringJobDefinition)
    }

    public fun monitoringJobDefinition(monitoringJobDefinition: CfnMonitoringSchedule.MonitoringJobDefinitionProperty) {
        cdkBuilder.monitoringJobDefinition(monitoringJobDefinition)
    }

    public fun monitoringJobDefinitionName(monitoringJobDefinitionName: String) {
        cdkBuilder.monitoringJobDefinitionName(monitoringJobDefinitionName)
    }

    public fun monitoringType(monitoringType: String) {
        cdkBuilder.monitoringType(monitoringType)
    }

    public fun scheduleConfig(scheduleConfig: IResolvable) {
        cdkBuilder.scheduleConfig(scheduleConfig)
    }

    public fun scheduleConfig(scheduleConfig: CfnMonitoringSchedule.ScheduleConfigProperty) {
        cdkBuilder.scheduleConfig(scheduleConfig)
    }

    public fun build(): CfnMonitoringSchedule.MonitoringScheduleConfigProperty = cdkBuilder.build()
}
