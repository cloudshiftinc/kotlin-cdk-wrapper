@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * This structure specifies the network configuration for an Amazon ECS task.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * NetworkConfigurationProperty networkConfigurationProperty =
 * NetworkConfigurationProperty.builder()
 * .awsvpcConfiguration(AwsVpcConfigurationProperty.builder()
 * .subnets(List.of("subnets"))
 * // the properties below are optional
 * .assignPublicIp("assignPublicIp")
 * .securityGroups(List.of("securityGroups"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-networkconfiguration.html)
 */
@CdkDslMarker
public class CfnPipeNetworkConfigurationPropertyDsl {
  private val cdkBuilder: CfnPipe.NetworkConfigurationProperty.Builder =
      CfnPipe.NetworkConfigurationProperty.builder()

  /**
   * @param awsvpcConfiguration Use this structure to specify the VPC subnets and security groups
   * for the task, and whether a public IP address is to be used.
   * This structure is relevant only for ECS tasks that use the `awsvpc` network mode.
   */
  public fun awsvpcConfiguration(awsvpcConfiguration: IResolvable) {
    cdkBuilder.awsvpcConfiguration(awsvpcConfiguration)
  }

  /**
   * @param awsvpcConfiguration Use this structure to specify the VPC subnets and security groups
   * for the task, and whether a public IP address is to be used.
   * This structure is relevant only for ECS tasks that use the `awsvpc` network mode.
   */
  public fun awsvpcConfiguration(awsvpcConfiguration: CfnPipe.AwsVpcConfigurationProperty) {
    cdkBuilder.awsvpcConfiguration(awsvpcConfiguration)
  }

  public fun build(): CfnPipe.NetworkConfigurationProperty = cdkBuilder.build()
}
