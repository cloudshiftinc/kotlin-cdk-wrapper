@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigProps
import software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigType

@CdkDslMarker
public class CustomLambdaDeploymentConfigPropsDsl {
  private val cdkBuilder: CustomLambdaDeploymentConfigProps.Builder =
      CustomLambdaDeploymentConfigProps.builder()

  public fun deploymentConfigName(deploymentConfigName: String) {
    cdkBuilder.deploymentConfigName(deploymentConfigName)
  }

  public fun interval(interval: Duration) {
    cdkBuilder.interval(interval)
  }

  public fun percentage(percentage: Number) {
    cdkBuilder.percentage(percentage)
  }

  public fun type(type: CustomLambdaDeploymentConfigType) {
    cdkBuilder.type(type)
  }

  public fun build(): CustomLambdaDeploymentConfigProps = cdkBuilder.build()
}
