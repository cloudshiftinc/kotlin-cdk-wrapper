@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition

@CdkDslMarker
public class CfnModelQualityJobDefinitionMonitoringResourcesPropertyDsl {
  private val cdkBuilder: CfnModelQualityJobDefinition.MonitoringResourcesProperty.Builder =
      CfnModelQualityJobDefinition.MonitoringResourcesProperty.builder()

  public fun clusterConfig(clusterConfig: IResolvable) {
    cdkBuilder.clusterConfig(clusterConfig)
  }

  public fun clusterConfig(clusterConfig: CfnModelQualityJobDefinition.ClusterConfigProperty) {
    cdkBuilder.clusterConfig(clusterConfig)
  }

  public fun build(): CfnModelQualityJobDefinition.MonitoringResourcesProperty = cdkBuilder.build()
}
