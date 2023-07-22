@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.msk.CfnVpcConnection
import software.constructs.Construct

@CdkDslMarker
public class CfnVpcConnectionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnVpcConnection.Builder = CfnVpcConnection.Builder.create(scope, id)

  private val _clientSubnets: MutableList<String> = mutableListOf()

  private val _securityGroups: MutableList<String> = mutableListOf()

  /**
   * The type of private link authentication.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-authentication)
   * @param authentication The type of private link authentication. 
   */
  public fun authentication(authentication: String) {
    cdkBuilder.authentication(authentication)
  }

  /**
   * The list of subnets in the client VPC to connect to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-clientsubnets)
   * @param clientSubnets The list of subnets in the client VPC to connect to. 
   */
  public fun clientSubnets(vararg clientSubnets: String) {
    _clientSubnets.addAll(listOf(*clientSubnets))
  }

  /**
   * The list of subnets in the client VPC to connect to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-clientsubnets)
   * @param clientSubnets The list of subnets in the client VPC to connect to. 
   */
  public fun clientSubnets(clientSubnets: Collection<String>) {
    _clientSubnets.addAll(clientSubnets)
  }

  /**
   * The security groups to attach to the ENIs for the broker nodes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-securitygroups)
   * @param securityGroups The security groups to attach to the ENIs for the broker nodes. 
   */
  public fun securityGroups(vararg securityGroups: String) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  /**
   * The security groups to attach to the ENIs for the broker nodes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-securitygroups)
   * @param securityGroups The security groups to attach to the ENIs for the broker nodes. 
   */
  public fun securityGroups(securityGroups: Collection<String>) {
    _securityGroups.addAll(securityGroups)
  }

  /**
   * Create tags when creating the VPC connection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-tags)
   * @param tags Create tags when creating the VPC connection. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * The Amazon Resource Name (ARN) of the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-targetclusterarn)
   * @param targetClusterArn The Amazon Resource Name (ARN) of the cluster. 
   */
  public fun targetClusterArn(targetClusterArn: String) {
    cdkBuilder.targetClusterArn(targetClusterArn)
  }

  /**
   * The VPC id of the remote client.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-vpcid)
   * @param vpcId The VPC id of the remote client. 
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnVpcConnection {
    if(_clientSubnets.isNotEmpty()) cdkBuilder.clientSubnets(_clientSubnets)
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
