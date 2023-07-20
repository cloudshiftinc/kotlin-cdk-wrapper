@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition

@CdkDslMarker
public class CfnModelExplainabilityJobDefinitionMonitoringResourcesPropertyDsl {
  private val cdkBuilder: CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty.Builder =
      CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty.builder()

  public fun clusterConfig(clusterConfig: IResolvable) {
    cdkBuilder.clusterConfig(clusterConfig)
  }

  public
      fun clusterConfig(clusterConfig: CfnModelExplainabilityJobDefinition.ClusterConfigProperty) {
    cdkBuilder.clusterConfig(clusterConfig)
  }

  public fun build(): CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty =
      cdkBuilder.build()
}
