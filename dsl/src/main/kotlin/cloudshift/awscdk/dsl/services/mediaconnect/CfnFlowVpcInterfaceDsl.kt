@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterface
import software.constructs.Construct

@CdkDslMarker
public class CfnFlowVpcInterfaceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnFlowVpcInterface.Builder = CfnFlowVpcInterface.Builder.create(scope,
      id)

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  /**
   * The Amazon Resource Name (ARN) of the flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html#cfn-mediaconnect-flowvpcinterface-flowarn)
   * @param flowArn The Amazon Resource Name (ARN) of the flow. 
   */
  public fun flowArn(flowArn: String) {
    cdkBuilder.flowArn(flowArn)
  }

  /**
   * The name of the VPC Interface.
   *
   * This value must be unique within the current flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html#cfn-mediaconnect-flowvpcinterface-name)
   * @param name The name of the VPC Interface. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The Amazon Resource Name (ARN) of the role that you created when you set up MediaConnect as a
   * trusted service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html#cfn-mediaconnect-flowvpcinterface-rolearn)
   * @param roleArn The Amazon Resource Name (ARN) of the role that you created when you set up
   * MediaConnect as a trusted service. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * The VPC security groups that you want MediaConnect to use for your VPC configuration.
   *
   * You must include at least one security group in the request.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html#cfn-mediaconnect-flowvpcinterface-securitygroupids)
   * @param securityGroupIds The VPC security groups that you want MediaConnect to use for your VPC
   * configuration. 
   */
  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  /**
   * The VPC security groups that you want MediaConnect to use for your VPC configuration.
   *
   * You must include at least one security group in the request.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html#cfn-mediaconnect-flowvpcinterface-securitygroupids)
   * @param securityGroupIds The VPC security groups that you want MediaConnect to use for your VPC
   * configuration. 
   */
  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  /**
   * The subnet IDs that you want to use for your VPC interface.
   *
   * A range of IP addresses in your VPC. When you create your VPC, you specify a range of IPv4
   * addresses for the VPC in the form of a Classless Inter-Domain Routing (CIDR) block; for example,
   * 10.0.0.0/16. This is the primary CIDR block for your VPC. When you create a subnet for your VPC,
   * you specify the CIDR block for the subnet, which is a subset of the VPC CIDR block.
   *
   * The subnets that you use across all VPC interfaces on the flow must be in the same Availability
   * Zone as the flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html#cfn-mediaconnect-flowvpcinterface-subnetid)
   * @param subnetId The subnet IDs that you want to use for your VPC interface. 
   */
  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun build(): CfnFlowVpcInterface {
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    return cdkBuilder.build()
  }
}
