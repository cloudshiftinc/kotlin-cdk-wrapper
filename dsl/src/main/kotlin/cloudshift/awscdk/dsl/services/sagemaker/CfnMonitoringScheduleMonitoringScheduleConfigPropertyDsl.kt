@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

@CdkDslMarker
public class CfnMonitoringScheduleMonitoringScheduleConfigPropertyDsl {
  private val cdkBuilder: CfnMonitoringSchedule.MonitoringScheduleConfigProperty.Builder =
      CfnMonitoringSchedule.MonitoringScheduleConfigProperty.builder()

  /**
   * @param monitoringJobDefinition Defines the monitoring job.
   */
  public fun monitoringJobDefinition(monitoringJobDefinition: IResolvable) {
    cdkBuilder.monitoringJobDefinition(monitoringJobDefinition)
  }

  /**
   * @param monitoringJobDefinition Defines the monitoring job.
   */
  public
      fun monitoringJobDefinition(monitoringJobDefinition: CfnMonitoringSchedule.MonitoringJobDefinitionProperty) {
    cdkBuilder.monitoringJobDefinition(monitoringJobDefinition)
  }

  /**
   * @param monitoringJobDefinitionName The name of the monitoring job definition to schedule.
   */
  public fun monitoringJobDefinitionName(monitoringJobDefinitionName: String) {
    cdkBuilder.monitoringJobDefinitionName(monitoringJobDefinitionName)
  }

  /**
   * @param monitoringType The type of the monitoring job definition to schedule.
   */
  public fun monitoringType(monitoringType: String) {
    cdkBuilder.monitoringType(monitoringType)
  }

  /**
   * @param scheduleConfig Configures the monitoring schedule.
   */
  public fun scheduleConfig(scheduleConfig: IResolvable) {
    cdkBuilder.scheduleConfig(scheduleConfig)
  }

  /**
   * @param scheduleConfig Configures the monitoring schedule.
   */
  public fun scheduleConfig(scheduleConfig: CfnMonitoringSchedule.ScheduleConfigProperty) {
    cdkBuilder.scheduleConfig(scheduleConfig)
  }

  public fun build(): CfnMonitoringSchedule.MonitoringScheduleConfigProperty = cdkBuilder.build()
}
