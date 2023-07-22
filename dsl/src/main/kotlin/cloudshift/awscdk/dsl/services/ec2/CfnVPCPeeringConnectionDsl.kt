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

/**
 * Requests a VPC peering connection between two VPCs: a requester VPC that you own and an accepter
 * VPC with which to create the connection.
 *
 * The accepter VPC can belong to a different AWS account and can be in a different Region than the
 * requester VPC.
 *
 * The requester VPC and accepter VPC cannot have overlapping CIDR blocks. If you create a VPC
 * peering connection request between VPCs with overlapping CIDR blocks, the VPC peering connection has
 * a status of `failed` .
 *
 * If the VPCs belong to different accounts, the acceptor account must have a role that allows the
 * requester account to accept the VPC peering connection. For more information, see [Walkthough: Peer
 * with a VPC in another AWS
 * account](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/peer-with-vpc-in-another-account.html)
 * .
 *
 * If the requester and acceptor VPCs are in the same account, the peering request is accepted
 * without a peering role.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnVPCPeeringConnection cfnVPCPeeringConnection = CfnVPCPeeringConnection.Builder.create(this,
 * "MyCfnVPCPeeringConnection")
 * .peerVpcId("peerVpcId")
 * .vpcId("vpcId")
 * // the properties below are optional
 * .peerOwnerId("peerOwnerId")
 * .peerRegion("peerRegion")
 * .peerRoleArn("peerRoleArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html)
 */
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
