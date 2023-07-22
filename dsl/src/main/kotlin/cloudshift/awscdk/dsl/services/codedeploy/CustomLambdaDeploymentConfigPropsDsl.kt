@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigProps
import software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigType

@CdkDslMarker
@Deprecated(message = "deprecated in CDK")
public class CustomLambdaDeploymentConfigPropsDsl {
  private val cdkBuilder: CustomLambdaDeploymentConfigProps.Builder =
      CustomLambdaDeploymentConfigProps.builder()

  /**
   * @param deploymentConfigName The verbatim name of the deployment config.
   * Must be unique per account/region.
   * Other parameters cannot be updated if this name is provided.
   * @deprecated Use `LambdaDeploymentConfig`
   */
  @Deprecated(message = "deprecated in CDK")
  public fun deploymentConfigName(deploymentConfigName: String) {
    cdkBuilder.deploymentConfigName(deploymentConfigName)
  }

  /**
   * @param interval The interval, in number of minutes: - For LINEAR, how frequently additional
   * traffic is shifted - For CANARY, how long to shift traffic before the full deployment. 
   * @deprecated Use `LambdaDeploymentConfig`
   */
  @Deprecated(message = "deprecated in CDK")
  public fun interval(interval: Duration) {
    cdkBuilder.interval(interval)
  }

  /**
   * @param percentage The integer percentage of traffic to shift: - For LINEAR, the percentage to
   * shift every interval - For CANARY, the percentage to shift until the interval passes, before the
   * full deployment. 
   * @deprecated Use `LambdaDeploymentConfig`
   */
  @Deprecated(message = "deprecated in CDK")
  public fun percentage(percentage: Number) {
    cdkBuilder.percentage(percentage)
  }

  /**
   * @param type The type of deployment config, either CANARY or LINEAR. 
   * @deprecated Use `LambdaDeploymentConfig`
   */
  @Deprecated(message = "deprecated in CDK")
  public fun type(type: CustomLambdaDeploymentConfigType) {
    cdkBuilder.type(type)
  }

  public fun build(): CustomLambdaDeploymentConfigProps = cdkBuilder.build()
}
