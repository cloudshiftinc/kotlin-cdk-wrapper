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

  public fun singleHeaderConfig(singleHeaderConfig: IResolvable) {
    cdkBuilder.singleHeaderConfig(singleHeaderConfig)
  }

  public
      fun singleHeaderConfig(singleHeaderConfig: CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty) {
    cdkBuilder.singleHeaderConfig(singleHeaderConfig)
  }

  public fun singleWeightConfig(singleWeightConfig: IResolvable) {
    cdkBuilder.singleWeightConfig(singleWeightConfig)
  }

  public
      fun singleWeightConfig(singleWeightConfig: CfnContinuousDeploymentPolicy.SingleWeightConfigProperty) {
    cdkBuilder.singleWeightConfig(singleWeightConfig)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnContinuousDeploymentPolicy.TrafficConfigProperty = cdkBuilder.build()
}
