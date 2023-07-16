@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfig
import software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigType
import software.constructs.Construct

@CdkDslMarker
public class CustomLambdaDeploymentConfigDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CustomLambdaDeploymentConfig.Builder =
      CustomLambdaDeploymentConfig.Builder.create(scope, id)

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

  public fun build(): CustomLambdaDeploymentConfig = cdkBuilder.build()
}
