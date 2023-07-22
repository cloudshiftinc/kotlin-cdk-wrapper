@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.events.CfnRule

/**
 * This structure specifies the VPC subnets and security groups for the task, and whether a public
 * IP address is to be used.
 *
 * This structure is relevant only for ECS tasks that use the `awsvpc` network mode.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * AwsVpcConfigurationProperty awsVpcConfigurationProperty = AwsVpcConfigurationProperty.builder()
 * .subnets(List.of("subnets"))
 * // the properties below are optional
 * .assignPublicIp("assignPublicIp")
 * .securityGroups(List.of("securityGroups"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-awsvpcconfiguration.html)
 */
@CdkDslMarker
public class CfnRuleAwsVpcConfigurationPropertyDsl {
  private val cdkBuilder: CfnRule.AwsVpcConfigurationProperty.Builder =
      CfnRule.AwsVpcConfigurationProperty.builder()

  private val _securityGroups: MutableList<String> = mutableListOf()

  private val _subnets: MutableList<String> = mutableListOf()

  /**
   * @param assignPublicIp Specifies whether the task's elastic network interface receives a public
   * IP address.
   * You can specify `ENABLED` only when `LaunchType` in `EcsParameters` is set to `FARGATE` .
   */
  public fun assignPublicIp(assignPublicIp: String) {
    cdkBuilder.assignPublicIp(assignPublicIp)
  }

  /**
   * @param securityGroups Specifies the security groups associated with the task.
   * These security groups must all be in the same VPC. You can specify as many as five security
   * groups. If you do not specify a security group, the default security group for the VPC is used.
   */
  public fun securityGroups(vararg securityGroups: String) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  /**
   * @param securityGroups Specifies the security groups associated with the task.
   * These security groups must all be in the same VPC. You can specify as many as five security
   * groups. If you do not specify a security group, the default security group for the VPC is used.
   */
  public fun securityGroups(securityGroups: Collection<String>) {
    _securityGroups.addAll(securityGroups)
  }

  /**
   * @param subnets Specifies the subnets associated with the task. 
   * These subnets must all be in the same VPC. You can specify as many as 16 subnets.
   */
  public fun subnets(vararg subnets: String) {
    _subnets.addAll(listOf(*subnets))
  }

  /**
   * @param subnets Specifies the subnets associated with the task. 
   * These subnets must all be in the same VPC. You can specify as many as 16 subnets.
   */
  public fun subnets(subnets: Collection<String>) {
    _subnets.addAll(subnets)
  }

  public fun build(): CfnRule.AwsVpcConfigurationProperty {
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    if(_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
    return cdkBuilder.build()
  }
}
