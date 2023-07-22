@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfig
import software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigType
import software.constructs.Construct

/**
 * (deprecated) A custom Deployment Configuration for a Lambda Deployment Group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.codedeploy.*;
 * CustomLambdaDeploymentConfig customLambdaDeploymentConfig =
 * CustomLambdaDeploymentConfig.Builder.create(this, "MyCustomLambdaDeploymentConfig")
 * .interval(Duration.minutes(30))
 * .percentage(123)
 * .type(CustomLambdaDeploymentConfigType.CANARY)
 * // the properties below are optional
 * .deploymentConfigName("deploymentConfigName")
 * .build();
 * ```
 *
 * @deprecated CloudFormation now supports Lambda deployment configurations without custom
 * resources. Use `LambdaDeploymentConfig`.
 */
@CdkDslMarker
@Deprecated(message = "deprecated in CDK")
public class CustomLambdaDeploymentConfigDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CustomLambdaDeploymentConfig.Builder =
      CustomLambdaDeploymentConfig.Builder.create(scope, id)

  /**
   * (deprecated) The verbatim name of the deployment config.
   *
   * Must be unique per account/region.
   * Other parameters cannot be updated if this name is provided.
   *
   * Default: - automatically generated name
   *
   * @deprecated Use `LambdaDeploymentConfig`
   * @param deploymentConfigName The verbatim name of the deployment config. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun deploymentConfigName(deploymentConfigName: String) {
    cdkBuilder.deploymentConfigName(deploymentConfigName)
  }

  /**
   * (deprecated) The interval, in number of minutes: - For LINEAR, how frequently additional
   * traffic is shifted - For CANARY, how long to shift traffic before the full deployment.
   *
   * @deprecated Use `LambdaDeploymentConfig`
   * @param interval The interval, in number of minutes: - For LINEAR, how frequently additional
   * traffic is shifted - For CANARY, how long to shift traffic before the full deployment. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun interval(interval: Duration) {
    cdkBuilder.interval(interval)
  }

  /**
   * (deprecated) The integer percentage of traffic to shift: - For LINEAR, the percentage to shift
   * every interval - For CANARY, the percentage to shift until the interval passes, before the full
   * deployment.
   *
   * @deprecated Use `LambdaDeploymentConfig`
   * @param percentage The integer percentage of traffic to shift: - For LINEAR, the percentage to
   * shift every interval - For CANARY, the percentage to shift until the interval passes, before the
   * full deployment. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun percentage(percentage: Number) {
    cdkBuilder.percentage(percentage)
  }

  /**
   * (deprecated) The type of deployment config, either CANARY or LINEAR.
   *
   * @deprecated Use `LambdaDeploymentConfig`
   * @param type The type of deployment config, either CANARY or LINEAR. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun type(type: CustomLambdaDeploymentConfigType) {
    cdkBuilder.type(type)
  }

  public fun build(): CustomLambdaDeploymentConfig = cdkBuilder.build()
}
