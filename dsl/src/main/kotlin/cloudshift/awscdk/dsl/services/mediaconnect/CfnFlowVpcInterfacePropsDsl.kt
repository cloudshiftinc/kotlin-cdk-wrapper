@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterfaceProps

/**
 * Properties for defining a `CfnFlowVpcInterface`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconnect.*;
 * CfnFlowVpcInterfaceProps cfnFlowVpcInterfaceProps = CfnFlowVpcInterfaceProps.builder()
 * .flowArn("flowArn")
 * .name("name")
 * .roleArn("roleArn")
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetId("subnetId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html)
 */
@CdkDslMarker
public class CfnFlowVpcInterfacePropsDsl {
  private val cdkBuilder: CfnFlowVpcInterfaceProps.Builder = CfnFlowVpcInterfaceProps.builder()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  /**
   * @param flowArn The Amazon Resource Name (ARN) of the flow. 
   */
  public fun flowArn(flowArn: String) {
    cdkBuilder.flowArn(flowArn)
  }

  /**
   * @param name The name of the VPC Interface. 
   * This value must be unique within the current flow.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param roleArn The Amazon Resource Name (ARN) of the role that you created when you set up
   * MediaConnect as a trusted service. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param securityGroupIds The VPC security groups that you want MediaConnect to use for your VPC
   * configuration. 
   * You must include at least one security group in the request.
   */
  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  /**
   * @param securityGroupIds The VPC security groups that you want MediaConnect to use for your VPC
   * configuration. 
   * You must include at least one security group in the request.
   */
  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  /**
   * @param subnetId The subnet IDs that you want to use for your VPC interface. 
   * A range of IP addresses in your VPC. When you create your VPC, you specify a range of IPv4
   * addresses for the VPC in the form of a Classless Inter-Domain Routing (CIDR) block; for example,
   * 10.0.0.0/16. This is the primary CIDR block for your VPC. When you create a subnet for your VPC,
   * you specify the CIDR block for the subnet, which is a subset of the VPC CIDR block.
   *
   * The subnets that you use across all VPC interfaces on the flow must be in the same Availability
   * Zone as the flow.
   */
  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun build(): CfnFlowVpcInterfaceProps {
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    return cdkBuilder.build()
  }
}
