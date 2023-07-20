@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig
import software.constructs.Construct

@CdkDslMarker
public class CfnDeploymentConfigDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDeploymentConfig.Builder = CfnDeploymentConfig.Builder.create(scope,
      id)

  public fun computePlatform(computePlatform: String) {
    cdkBuilder.computePlatform(computePlatform)
  }

  public fun deploymentConfigName(deploymentConfigName: String) {
    cdkBuilder.deploymentConfigName(deploymentConfigName)
  }

  public fun minimumHealthyHosts(minimumHealthyHosts: IResolvable) {
    cdkBuilder.minimumHealthyHosts(minimumHealthyHosts)
  }

  public
      fun minimumHealthyHosts(minimumHealthyHosts: CfnDeploymentConfig.MinimumHealthyHostsProperty) {
    cdkBuilder.minimumHealthyHosts(minimumHealthyHosts)
  }

  public fun trafficRoutingConfig(trafficRoutingConfig: IResolvable) {
    cdkBuilder.trafficRoutingConfig(trafficRoutingConfig)
  }

  public
      fun trafficRoutingConfig(trafficRoutingConfig: CfnDeploymentConfig.TrafficRoutingConfigProperty) {
    cdkBuilder.trafficRoutingConfig(trafficRoutingConfig)
  }

  public fun build(): CfnDeploymentConfig = cdkBuilder.build()
}
