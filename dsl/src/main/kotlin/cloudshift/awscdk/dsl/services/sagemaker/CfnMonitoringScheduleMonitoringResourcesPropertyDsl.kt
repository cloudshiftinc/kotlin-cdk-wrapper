@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

@CdkDslMarker
public class CfnMonitoringScheduleMonitoringResourcesPropertyDsl {
  private val cdkBuilder: CfnMonitoringSchedule.MonitoringResourcesProperty.Builder =
      CfnMonitoringSchedule.MonitoringResourcesProperty.builder()

  public fun clusterConfig(clusterConfig: IResolvable) {
    cdkBuilder.clusterConfig(clusterConfig)
  }

  public fun clusterConfig(clusterConfig: CfnMonitoringSchedule.ClusterConfigProperty) {
    cdkBuilder.clusterConfig(clusterConfig)
  }

  public fun build(): CfnMonitoringSchedule.MonitoringResourcesProperty = cdkBuilder.build()
}
