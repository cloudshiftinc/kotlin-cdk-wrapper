@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnService

@CdkDslMarker
public class CfnServiceDeploymentConfigurationPropertyDsl {
  private val cdkBuilder: CfnService.DeploymentConfigurationProperty.Builder =
      CfnService.DeploymentConfigurationProperty.builder()

  public fun alarms(alarms: IResolvable) {
    cdkBuilder.alarms(alarms)
  }

  public fun alarms(alarms: CfnService.DeploymentAlarmsProperty) {
    cdkBuilder.alarms(alarms)
  }

  public fun deploymentCircuitBreaker(deploymentCircuitBreaker: IResolvable) {
    cdkBuilder.deploymentCircuitBreaker(deploymentCircuitBreaker)
  }

  public
      fun deploymentCircuitBreaker(deploymentCircuitBreaker: CfnService.DeploymentCircuitBreakerProperty) {
    cdkBuilder.deploymentCircuitBreaker(deploymentCircuitBreaker)
  }

  public fun maximumPercent(maximumPercent: Number) {
    cdkBuilder.maximumPercent(maximumPercent)
  }

  public fun minimumHealthyPercent(minimumHealthyPercent: Number) {
    cdkBuilder.minimumHealthyPercent(minimumHealthyPercent)
  }

  public fun build(): CfnService.DeploymentConfigurationProperty = cdkBuilder.build()
}
