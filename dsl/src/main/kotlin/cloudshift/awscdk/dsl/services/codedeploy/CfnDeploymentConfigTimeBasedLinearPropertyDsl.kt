@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig

@CdkDslMarker
public class CfnDeploymentConfigTimeBasedLinearPropertyDsl {
  private val cdkBuilder: CfnDeploymentConfig.TimeBasedLinearProperty.Builder =
      CfnDeploymentConfig.TimeBasedLinearProperty.builder()

  public fun linearInterval(linearInterval: Number) {
    cdkBuilder.linearInterval(linearInterval)
  }

  public fun linearPercentage(linearPercentage: Number) {
    cdkBuilder.linearPercentage(linearPercentage)
  }

  public fun build(): CfnDeploymentConfig.TimeBasedLinearProperty = cdkBuilder.build()
}
