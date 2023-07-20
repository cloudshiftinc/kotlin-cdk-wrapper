@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig

@CdkDslMarker
public class CfnDeploymentConfigTrafficRoutingConfigPropertyDsl {
  private val cdkBuilder: CfnDeploymentConfig.TrafficRoutingConfigProperty.Builder =
      CfnDeploymentConfig.TrafficRoutingConfigProperty.builder()

  public fun timeBasedCanary(timeBasedCanary: IResolvable) {
    cdkBuilder.timeBasedCanary(timeBasedCanary)
  }

  public fun timeBasedCanary(timeBasedCanary: CfnDeploymentConfig.TimeBasedCanaryProperty) {
    cdkBuilder.timeBasedCanary(timeBasedCanary)
  }

  public fun timeBasedLinear(timeBasedLinear: IResolvable) {
    cdkBuilder.timeBasedLinear(timeBasedLinear)
  }

  public fun timeBasedLinear(timeBasedLinear: CfnDeploymentConfig.TimeBasedLinearProperty) {
    cdkBuilder.timeBasedLinear(timeBasedLinear)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnDeploymentConfig.TrafficRoutingConfigProperty = cdkBuilder.build()
}
