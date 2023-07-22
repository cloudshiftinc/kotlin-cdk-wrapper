@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnRule

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
