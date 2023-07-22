@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnRule

/**
 * This structure specifies the network configuration for an ECS task.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * NetworkConfigurationProperty networkConfigurationProperty =
 * NetworkConfigurationProperty.builder()
 * .awsVpcConfiguration(AwsVpcConfigurationProperty.builder()
 * .subnets(List.of("subnets"))
 * // the properties below are optional
 * .assignPublicIp("assignPublicIp")
 * .securityGroups(List.of("securityGroups"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-networkconfiguration.html)
 */
@CdkDslMarker
public class CfnRuleNetworkConfigurationPropertyDsl {
  private val cdkBuilder: CfnRule.NetworkConfigurationProperty.Builder =
      CfnRule.NetworkConfigurationProperty.builder()

  /**
   * @param awsVpcConfiguration Use this structure to specify the VPC subnets and security groups
   * for the task, and whether a public IP address is to be used.
   * This structure is relevant only for ECS tasks that use the `awsvpc` network mode.
   */
  public fun awsVpcConfiguration(awsVpcConfiguration: IResolvable) {
    cdkBuilder.awsVpcConfiguration(awsVpcConfiguration)
  }

  /**
   * @param awsVpcConfiguration Use this structure to specify the VPC subnets and security groups
   * for the task, and whether a public IP address is to be used.
   * This structure is relevant only for ECS tasks that use the `awsvpc` network mode.
   */
  public fun awsVpcConfiguration(awsVpcConfiguration: CfnRule.AwsVpcConfigurationProperty) {
    cdkBuilder.awsVpcConfiguration(awsVpcConfiguration)
  }

  public fun build(): CfnRule.NetworkConfigurationProperty = cdkBuilder.build()
}
