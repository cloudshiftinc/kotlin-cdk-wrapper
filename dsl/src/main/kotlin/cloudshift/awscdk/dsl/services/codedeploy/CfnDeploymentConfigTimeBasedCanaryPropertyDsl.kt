@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig

@CdkDslMarker
public class CfnDeploymentConfigTimeBasedCanaryPropertyDsl {
  private val cdkBuilder: CfnDeploymentConfig.TimeBasedCanaryProperty.Builder =
      CfnDeploymentConfig.TimeBasedCanaryProperty.builder()

  /**
   * @param canaryInterval The number of minutes between the first and second traffic shifts of a
   * `TimeBasedCanary` deployment. 
   */
  public fun canaryInterval(canaryInterval: Number) {
    cdkBuilder.canaryInterval(canaryInterval)
  }

  /**
   * @param canaryPercentage The percentage of traffic to shift in the first increment of a
   * `TimeBasedCanary` deployment. 
   */
  public fun canaryPercentage(canaryPercentage: Number) {
    cdkBuilder.canaryPercentage(canaryPercentage)
  }

  public fun build(): CfnDeploymentConfig.TimeBasedCanaryProperty = cdkBuilder.build()
}
