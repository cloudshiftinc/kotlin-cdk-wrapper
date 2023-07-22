@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition

@CdkDslMarker
public class CfnModelBiasJobDefinitionMonitoringResourcesPropertyDsl {
  private val cdkBuilder: CfnModelBiasJobDefinition.MonitoringResourcesProperty.Builder =
      CfnModelBiasJobDefinition.MonitoringResourcesProperty.builder()

  /**
   * @param clusterConfig The configuration for the cluster resources used to run the processing
   * job. 
   */
  public fun clusterConfig(clusterConfig: IResolvable) {
    cdkBuilder.clusterConfig(clusterConfig)
  }

  /**
   * @param clusterConfig The configuration for the cluster resources used to run the processing
   * job. 
   */
  public fun clusterConfig(clusterConfig: CfnModelBiasJobDefinition.ClusterConfigProperty) {
    cdkBuilder.clusterConfig(clusterConfig)
  }

  public fun build(): CfnModelBiasJobDefinition.MonitoringResourcesProperty = cdkBuilder.build()
}
