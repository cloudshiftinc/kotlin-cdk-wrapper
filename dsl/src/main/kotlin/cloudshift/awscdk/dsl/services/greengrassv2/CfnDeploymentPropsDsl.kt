@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnDeployment
import software.amazon.awscdk.services.greengrassv2.CfnDeploymentProps

@CdkDslMarker
public class CfnDeploymentPropsDsl {
  private val cdkBuilder: CfnDeploymentProps.Builder = CfnDeploymentProps.builder()

  /**
   * @param components The components to deploy.
   * This is a dictionary, where each key is the name of a component, and each key's value is the
   * version and configuration to deploy for that component.
   */
  public fun components(components: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(components)
    cdkBuilder.components(builder.map)
  }

  /**
   * @param components The components to deploy.
   * This is a dictionary, where each key is the name of a component, and each key's value is the
   * version and configuration to deploy for that component.
   */
  public fun components(components: Map<String, Any>) {
    cdkBuilder.components(components)
  }

  /**
   * @param components The components to deploy.
   * This is a dictionary, where each key is the name of a component, and each key's value is the
   * version and configuration to deploy for that component.
   */
  public fun components(components: IResolvable) {
    cdkBuilder.components(components)
  }

  /**
   * @param deploymentName The name of the deployment.
   */
  public fun deploymentName(deploymentName: String) {
    cdkBuilder.deploymentName(deploymentName)
  }

  /**
   * @param deploymentPolicies The deployment policies for the deployment.
   * These policies define how the deployment updates components and handles failure.
   */
  public fun deploymentPolicies(deploymentPolicies: IResolvable) {
    cdkBuilder.deploymentPolicies(deploymentPolicies)
  }

  /**
   * @param deploymentPolicies The deployment policies for the deployment.
   * These policies define how the deployment updates components and handles failure.
   */
  public fun deploymentPolicies(deploymentPolicies: CfnDeployment.DeploymentPoliciesProperty) {
    cdkBuilder.deploymentPolicies(deploymentPolicies)
  }

  /**
   * @param iotJobConfiguration The job configuration for the deployment configuration.
   * The job configuration specifies the rollout, timeout, and stop configurations for the
   * deployment configuration.
   */
  public fun iotJobConfiguration(iotJobConfiguration: IResolvable) {
    cdkBuilder.iotJobConfiguration(iotJobConfiguration)
  }

  /**
   * @param iotJobConfiguration The job configuration for the deployment configuration.
   * The job configuration specifies the rollout, timeout, and stop configurations for the
   * deployment configuration.
   */
  public
      fun iotJobConfiguration(iotJobConfiguration: CfnDeployment.DeploymentIoTJobConfigurationProperty) {
    cdkBuilder.iotJobConfiguration(iotJobConfiguration)
  }

  /**
   * @param parentTargetArn The parent deployment's
   * [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) for a
   * subdeployment.
   */
  public fun parentTargetArn(parentTargetArn: String) {
    cdkBuilder.parentTargetArn(parentTargetArn)
  }

  /**
   * @param tags Application-specific metadata to attach to the deployment.
   * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
   * also use tags to categorize your resources. For more information, see [Tag your AWS IoT Greengrass
   * Version 2 resources](https://docs.aws.amazon.com/greengrass/v2/developerguide/tag-resources.html)
   * in the *AWS IoT Greengrass V2 Developer Guide* .
   *
   * This `Json` property type is processed as a map of key-value pairs. It uses the following
   * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
   *
   * ```
   * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
   * }
   * ```
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * @param targetArn The ARN of the target AWS IoT thing or thing group. 
   */
  public fun targetArn(targetArn: String) {
    cdkBuilder.targetArn(targetArn)
  }

  public fun build(): CfnDeploymentProps = cdkBuilder.build()
}
