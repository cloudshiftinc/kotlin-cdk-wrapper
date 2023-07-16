@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig

@CdkDslMarker
public class CfnDeploymentConfigMinimumHealthyHostsPropertyDsl {
  private val cdkBuilder: CfnDeploymentConfig.MinimumHealthyHostsProperty.Builder =
      CfnDeploymentConfig.MinimumHealthyHostsProperty.builder()

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnDeploymentConfig.MinimumHealthyHostsProperty = cdkBuilder.build()
}
