@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnCluster

@CdkDslMarker
public class CfnClusterClusterConfigurationPropertyDsl {
  private val cdkBuilder: CfnCluster.ClusterConfigurationProperty.Builder =
      CfnCluster.ClusterConfigurationProperty.builder()

  public fun executeCommandConfiguration(executeCommandConfiguration: IResolvable) {
    cdkBuilder.executeCommandConfiguration(executeCommandConfiguration)
  }

  public
      fun executeCommandConfiguration(executeCommandConfiguration: CfnCluster.ExecuteCommandConfigurationProperty) {
    cdkBuilder.executeCommandConfiguration(executeCommandConfiguration)
  }

  public fun build(): CfnCluster.ClusterConfigurationProperty = cdkBuilder.build()
}
