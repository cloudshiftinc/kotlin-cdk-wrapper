@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

@CdkDslMarker
public class CfnMonitoringScheduleMonitoringOutputConfigPropertyDsl {
  private val cdkBuilder: CfnMonitoringSchedule.MonitoringOutputConfigProperty.Builder =
      CfnMonitoringSchedule.MonitoringOutputConfigProperty.builder()

  private val _monitoringOutputs: MutableList<Any> = mutableListOf()

  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun monitoringOutputs(vararg monitoringOutputs: Any) {
    _monitoringOutputs.addAll(listOf(*monitoringOutputs))
  }

  public fun monitoringOutputs(monitoringOutputs: Collection<Any>) {
    _monitoringOutputs.addAll(monitoringOutputs)
  }

  public fun monitoringOutputs(monitoringOutputs: IResolvable) {
    cdkBuilder.monitoringOutputs(monitoringOutputs)
  }

  public fun build(): CfnMonitoringSchedule.MonitoringOutputConfigProperty {
    if(_monitoringOutputs.isNotEmpty()) cdkBuilder.monitoringOutputs(_monitoringOutputs)
    return cdkBuilder.build()
  }
}
