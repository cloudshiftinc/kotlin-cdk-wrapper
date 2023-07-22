@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy

@CdkDslMarker
public class CfnContinuousDeploymentPolicyTrafficConfigPropertyDsl {
  private val cdkBuilder: CfnContinuousDeploymentPolicy.TrafficConfigProperty.Builder =
      CfnContinuousDeploymentPolicy.TrafficConfigProperty.builder()

  /**
   * @param singleHeaderConfig Determines which HTTP requests are sent to the staging distribution.
   */
  public fun singleHeaderConfig(singleHeaderConfig: IResolvable) {
    cdkBuilder.singleHeaderConfig(singleHeaderConfig)
  }

  /**
   * @param singleHeaderConfig Determines which HTTP requests are sent to the staging distribution.
   */
  public
      fun singleHeaderConfig(singleHeaderConfig: CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty) {
    cdkBuilder.singleHeaderConfig(singleHeaderConfig)
  }

  /**
   * @param singleWeightConfig Contains the percentage of traffic to send to the staging
   * distribution.
   */
  public fun singleWeightConfig(singleWeightConfig: IResolvable) {
    cdkBuilder.singleWeightConfig(singleWeightConfig)
  }

  /**
   * @param singleWeightConfig Contains the percentage of traffic to send to the staging
   * distribution.
   */
  public
      fun singleWeightConfig(singleWeightConfig: CfnContinuousDeploymentPolicy.SingleWeightConfigProperty) {
    cdkBuilder.singleWeightConfig(singleWeightConfig)
  }

  /**
   * @param type The type of traffic configuration. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnContinuousDeploymentPolicy.TrafficConfigProperty = cdkBuilder.build()
}
