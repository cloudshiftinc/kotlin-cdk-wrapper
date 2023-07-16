@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy

@CdkDslMarker
public class CfnContinuousDeploymentPolicySingleWeightConfigPropertyDsl {
  private val cdkBuilder: CfnContinuousDeploymentPolicy.SingleWeightConfigProperty.Builder =
      CfnContinuousDeploymentPolicy.SingleWeightConfigProperty.builder()

  public fun sessionStickinessConfig(sessionStickinessConfig: IResolvable) {
    cdkBuilder.sessionStickinessConfig(sessionStickinessConfig)
  }

  public
      fun sessionStickinessConfig(sessionStickinessConfig: CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty) {
    cdkBuilder.sessionStickinessConfig(sessionStickinessConfig)
  }

  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): CfnContinuousDeploymentPolicy.SingleWeightConfigProperty = cdkBuilder.build()
}
