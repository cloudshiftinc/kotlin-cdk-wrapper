@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@CdkDslMarker
public class CfnDeploymentGroupECSServicePropertyDsl {
  private val cdkBuilder: CfnDeploymentGroup.ECSServiceProperty.Builder =
      CfnDeploymentGroup.ECSServiceProperty.builder()

  /**
   * @param clusterName The name of the cluster that the Amazon ECS service is associated with. 
   */
  public fun clusterName(clusterName: String) {
    cdkBuilder.clusterName(clusterName)
  }

  /**
   * @param serviceName The name of the target Amazon ECS service. 
   */
  public fun serviceName(serviceName: String) {
    cdkBuilder.serviceName(serviceName)
  }

  public fun build(): CfnDeploymentGroup.ECSServiceProperty = cdkBuilder.build()
}
