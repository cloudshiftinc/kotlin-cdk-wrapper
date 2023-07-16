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

  public fun endpointName(endpointName: String) {
    cdkBuilder.endpointName(endpointName)
  }

  public fun failureReason(failureReason: String) {
    cdkBuilder.failureReason(failureReason)
  }

  public fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: IResolvable) {
    cdkBuilder.lastMonitoringExecutionSummary(lastMonitoringExecutionSummary)
  }

  public
      fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: CfnMonitoringSchedule.MonitoringExecutionSummaryProperty) {
    cdkBuilder.lastMonitoringExecutionSummary(lastMonitoringExecutionSummary)
  }

  public fun monitoringScheduleConfig(monitoringScheduleConfig: IResolvable) {
    cdkBuilder.monitoringScheduleConfig(monitoringScheduleConfig)
  }

  public
      fun monitoringScheduleConfig(monitoringScheduleConfig: CfnMonitoringSchedule.MonitoringScheduleConfigProperty) {
    cdkBuilder.monitoringScheduleConfig(monitoringScheduleConfig)
  }

  public fun monitoringScheduleName(monitoringScheduleName: String) {
    cdkBuilder.monitoringScheduleName(monitoringScheduleName)
  }

  public fun monitoringScheduleStatus(monitoringScheduleStatus: String) {
    cdkBuilder.monitoringScheduleStatus(monitoringScheduleStatus)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnMonitoringScheduleProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
