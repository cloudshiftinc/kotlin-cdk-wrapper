@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnVPCPeeringConnection
import software.constructs.Construct

@CdkDslMarker
public class CfnVPCPeeringConnectionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnVPCPeeringConnection.Builder =
      CfnVPCPeeringConnection.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The AWS account ID of the owner of the accepter VPC.
   *
   * Default: Your AWS account ID
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerownerid)
   * @param peerOwnerId The AWS account ID of the owner of the accepter VPC. 
   */
  public fun peerOwnerId(peerOwnerId: String) {
    cdkBuilder.peerOwnerId(peerOwnerId)
  }

  /**
   * The Region code for the accepter VPC, if the accepter VPC is located in a Region other than the
   * Region in which you make the request.
   *
   * Default: The Region in which you make the request.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerregion)
   * @param peerRegion The Region code for the accepter VPC, if the accepter VPC is located in a
   * Region other than the Region in which you make the request. 
   */
  public fun peerRegion(peerRegion: String) {
    cdkBuilder.peerRegion(peerRegion)
  }

  /**
   * The Amazon Resource Name (ARN) of the VPC peer role for the peering connection in another AWS
   * account.
   *
   * This is required when you are peering a VPC in a different AWS account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerrolearn)
   * @param peerRoleArn The Amazon Resource Name (ARN) of the VPC peer role for the peering
   * connection in another AWS account. 
   */
  public fun peerRoleArn(peerRoleArn: String) {
    cdkBuilder.peerRoleArn(peerRoleArn)
  }

  /**
   * The ID of the VPC with which you are creating the VPC peering connection.
   *
   * You must specify this parameter in the request.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peervpcid)
   * @param peerVpcId The ID of the VPC with which you are creating the VPC peering connection. 
   */
  public fun peerVpcId(peerVpcId: String) {
    cdkBuilder.peerVpcId(peerVpcId)
  }

  /**
   * Any tags assigned to the resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-tags)
   * @param tags Any tags assigned to the resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Any tags assigned to the resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-tags)
   * @param tags Any tags assigned to the resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The ID of the VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-vpcid)
   * @param vpcId The ID of the VPC. 
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnVPCPeeringConnection {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
