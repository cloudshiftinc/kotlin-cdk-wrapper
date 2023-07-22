@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule
import software.amazon.awscdk.services.sagemaker.CfnMonitoringScheduleProps

@CdkDslMarker
public class CfnMonitoringSchedulePropsDsl {
  private val cdkBuilder: CfnMonitoringScheduleProps.Builder = CfnMonitoringScheduleProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param endpointName The name of the endpoint using the monitoring schedule.
   */
  public fun endpointName(endpointName: String) {
    cdkBuilder.endpointName(endpointName)
  }

  /**
   * @param failureReason Contains the reason a monitoring job failed, if it failed.
   */
  public fun failureReason(failureReason: String) {
    cdkBuilder.failureReason(failureReason)
  }

  /**
   * @param lastMonitoringExecutionSummary Describes metadata on the last execution to run, if there
   * was one.
   */
  public fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: IResolvable) {
    cdkBuilder.lastMonitoringExecutionSummary(lastMonitoringExecutionSummary)
  }

  /**
   * @param lastMonitoringExecutionSummary Describes metadata on the last execution to run, if there
   * was one.
   */
  public
      fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: CfnMonitoringSchedule.MonitoringExecutionSummaryProperty) {
    cdkBuilder.lastMonitoringExecutionSummary(lastMonitoringExecutionSummary)
  }

  /**
   * @param monitoringScheduleConfig The configuration object that specifies the monitoring schedule
   * and defines the monitoring job. 
   */
  public fun monitoringScheduleConfig(monitoringScheduleConfig: IResolvable) {
    cdkBuilder.monitoringScheduleConfig(monitoringScheduleConfig)
  }

  /**
   * @param monitoringScheduleConfig The configuration object that specifies the monitoring schedule
   * and defines the monitoring job. 
   */
  public
      fun monitoringScheduleConfig(monitoringScheduleConfig: CfnMonitoringSchedule.MonitoringScheduleConfigProperty) {
    cdkBuilder.monitoringScheduleConfig(monitoringScheduleConfig)
  }

  /**
   * @param monitoringScheduleName The name of the monitoring schedule. 
   */
  public fun monitoringScheduleName(monitoringScheduleName: String) {
    cdkBuilder.monitoringScheduleName(monitoringScheduleName)
  }

  /**
   * @param monitoringScheduleStatus The status of the monitoring schedule.
   */
  public fun monitoringScheduleStatus(monitoringScheduleStatus: String) {
    cdkBuilder.monitoringScheduleStatus(monitoringScheduleStatus)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnMonitoringScheduleProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
