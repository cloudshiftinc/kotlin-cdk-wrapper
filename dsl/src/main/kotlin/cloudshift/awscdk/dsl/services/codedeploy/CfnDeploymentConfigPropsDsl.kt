@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfigProps

/**
 * Properties for defining a `CfnDeploymentConfig`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * CfnDeploymentConfigProps cfnDeploymentConfigProps = CfnDeploymentConfigProps.builder()
 * .computePlatform("computePlatform")
 * .deploymentConfigName("deploymentConfigName")
 * .minimumHealthyHosts(MinimumHealthyHostsProperty.builder()
 * .type("type")
 * .value(123)
 * .build())
 * .trafficRoutingConfig(TrafficRoutingConfigProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .timeBasedCanary(TimeBasedCanaryProperty.builder()
 * .canaryInterval(123)
 * .canaryPercentage(123)
 * .build())
 * .timeBasedLinear(TimeBasedLinearProperty.builder()
 * .linearInterval(123)
 * .linearPercentage(123)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html)
 */
@CdkDslMarker
public class CfnDeploymentConfigPropsDsl {
  private val cdkBuilder: CfnDeploymentConfigProps.Builder = CfnDeploymentConfigProps.builder()

  /**
   * @param computePlatform The destination platform type for the deployment ( `Lambda` , `Server` ,
   * or `ECS` ).
   */
  public fun computePlatform(computePlatform: String) {
    cdkBuilder.computePlatform(computePlatform)
  }

  /**
   * @param deploymentConfigName A name for the deployment configuration.
   * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID
   * for the deployment configuration name. For more information, see [Name
   * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
   *
   *
   * If you specify a name, you cannot perform updates that require replacement of this resource.
   * You can perform updates that require no or some interruption. If you must replace the resource,
   * specify a new name.
   */
  public fun deploymentConfigName(deploymentConfigName: String) {
    cdkBuilder.deploymentConfigName(deploymentConfigName)
  }

  /**
   * @param minimumHealthyHosts The minimum number of healthy instances that should be available at
   * any time during the deployment.
   * There are two parameters expected in the input: type and value.
   *
   * The type parameter takes either of the following values:
   *
   * * HOST_COUNT: The value parameter represents the minimum number of healthy instances as an
   * absolute value.
   * * FLEET_PERCENT: The value parameter represents the minimum number of healthy instances as a
   * percentage of the total number of instances in the deployment. If you specify FLEET_PERCENT, at
   * the start of the deployment, AWS CodeDeploy converts the percentage to the equivalent number of
   * instance and rounds up fractional instances.
   *
   * The value parameter takes an integer.
   *
   * For example, to set a minimum of 95% healthy instance, specify a type of FLEET_PERCENT and a
   * value of 95.
   *
   * For more information about instance health, see [CodeDeploy Instance
   * Health](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html) in the AWS
   * CodeDeploy User Guide.
   */
  public fun minimumHealthyHosts(minimumHealthyHosts: IResolvable) {
    cdkBuilder.minimumHealthyHosts(minimumHealthyHosts)
  }

  /**
   * @param minimumHealthyHosts The minimum number of healthy instances that should be available at
   * any time during the deployment.
   * There are two parameters expected in the input: type and value.
   *
   * The type parameter takes either of the following values:
   *
   * * HOST_COUNT: The value parameter represents the minimum number of healthy instances as an
   * absolute value.
   * * FLEET_PERCENT: The value parameter represents the minimum number of healthy instances as a
   * percentage of the total number of instances in the deployment. If you specify FLEET_PERCENT, at
   * the start of the deployment, AWS CodeDeploy converts the percentage to the equivalent number of
   * instance and rounds up fractional instances.
   *
   * The value parameter takes an integer.
   *
   * For example, to set a minimum of 95% healthy instance, specify a type of FLEET_PERCENT and a
   * value of 95.
   *
   * For more information about instance health, see [CodeDeploy Instance
   * Health](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html) in the AWS
   * CodeDeploy User Guide.
   */
  public
      fun minimumHealthyHosts(minimumHealthyHosts: CfnDeploymentConfig.MinimumHealthyHostsProperty) {
    cdkBuilder.minimumHealthyHosts(minimumHealthyHosts)
  }

  /**
   * @param trafficRoutingConfig The configuration that specifies how the deployment traffic is
   * routed.
   */
  public fun trafficRoutingConfig(trafficRoutingConfig: IResolvable) {
    cdkBuilder.trafficRoutingConfig(trafficRoutingConfig)
  }

  /**
   * @param trafficRoutingConfig The configuration that specifies how the deployment traffic is
   * routed.
   */
  public
      fun trafficRoutingConfig(trafficRoutingConfig: CfnDeploymentConfig.TrafficRoutingConfigProperty) {
    cdkBuilder.trafficRoutingConfig(trafficRoutingConfig)
  }

  public fun build(): CfnDeploymentConfigProps = cdkBuilder.build()
}
