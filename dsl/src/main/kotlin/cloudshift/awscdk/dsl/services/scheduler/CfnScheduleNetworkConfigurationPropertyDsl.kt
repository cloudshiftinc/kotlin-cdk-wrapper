@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.scheduler

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.scheduler.CfnSchedule

@CdkDslMarker
public class CfnScheduleNetworkConfigurationPropertyDsl {
  private val cdkBuilder: CfnSchedule.NetworkConfigurationProperty.Builder =
      CfnSchedule.NetworkConfigurationProperty.builder()

  /**
   * @param awsvpcConfiguration Specifies the Amazon VPC subnets and security groups for the task,
   * and whether a public IP address is to be used.
   * This structure is relevant only for ECS tasks that use the awsvpc network mode.
   */
  public fun awsvpcConfiguration(awsvpcConfiguration: IResolvable) {
    cdkBuilder.awsvpcConfiguration(awsvpcConfiguration)
  }

  /**
   * @param awsvpcConfiguration Specifies the Amazon VPC subnets and security groups for the task,
   * and whether a public IP address is to be used.
   * This structure is relevant only for ECS tasks that use the awsvpc network mode.
   */
  public fun awsvpcConfiguration(awsvpcConfiguration: CfnSchedule.AwsVpcConfigurationProperty) {
    cdkBuilder.awsvpcConfiguration(awsvpcConfiguration)
  }

  public fun build(): CfnSchedule.NetworkConfigurationProperty = cdkBuilder.build()
}
