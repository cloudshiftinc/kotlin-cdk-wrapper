@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnTaskSet

@CdkDslMarker
public class CfnTaskSetNetworkConfigurationPropertyDsl {
  private val cdkBuilder: CfnTaskSet.NetworkConfigurationProperty.Builder =
      CfnTaskSet.NetworkConfigurationProperty.builder()

  /**
   * @param awsVpcConfiguration The VPC subnets and security groups that are associated with a task.
   *
   * All specified subnets and security groups must be from the same VPC.
   */
  public fun awsVpcConfiguration(awsVpcConfiguration: IResolvable) {
    cdkBuilder.awsVpcConfiguration(awsVpcConfiguration)
  }

  /**
   * @param awsVpcConfiguration The VPC subnets and security groups that are associated with a task.
   *
   * All specified subnets and security groups must be from the same VPC.
   */
  public fun awsVpcConfiguration(awsVpcConfiguration: CfnTaskSet.AwsVpcConfigurationProperty) {
    cdkBuilder.awsVpcConfiguration(awsVpcConfiguration)
  }

  public fun build(): CfnTaskSet.NetworkConfigurationProperty = cdkBuilder.build()
}
