@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnService

/**
 * The `NetworkConfiguration` property specifies an object representing the network configuration
 * for a task or service.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * NetworkConfigurationProperty networkConfigurationProperty =
 * NetworkConfigurationProperty.builder()
 * .awsvpcConfiguration(AwsVpcConfigurationProperty.builder()
 * .assignPublicIp("assignPublicIp")
 * .securityGroups(List.of("securityGroups"))
 * .subnets(List.of("subnets"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-networkconfiguration.html)
 */
@CdkDslMarker
public class CfnServiceNetworkConfigurationPropertyDsl {
  private val cdkBuilder: CfnService.NetworkConfigurationProperty.Builder =
      CfnService.NetworkConfigurationProperty.builder()

  /**
   * @param awsvpcConfiguration The VPC subnets and security groups that are associated with a task.
   *
   * All specified subnets and security groups must be from the same VPC.
   */
  public fun awsvpcConfiguration(awsvpcConfiguration: IResolvable) {
    cdkBuilder.awsvpcConfiguration(awsvpcConfiguration)
  }

  /**
   * @param awsvpcConfiguration The VPC subnets and security groups that are associated with a task.
   *
   * All specified subnets and security groups must be from the same VPC.
   */
  public fun awsvpcConfiguration(awsvpcConfiguration: CfnService.AwsVpcConfigurationProperty) {
    cdkBuilder.awsvpcConfiguration(awsvpcConfiguration)
  }

  public fun build(): CfnService.NetworkConfigurationProperty = cdkBuilder.build()
}
