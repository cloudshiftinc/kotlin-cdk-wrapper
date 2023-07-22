@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.managedblockchain

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.managedblockchain.CfnNode
import software.constructs.Construct

@CdkDslMarker
public class CfnNodeDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnNode.Builder = CfnNode.Builder.create(scope, id)

  /**
   * The unique identifier of the member to which the node belongs.
   *
   * Applies only to Hyperledger Fabric.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html#cfn-managedblockchain-node-memberid)
   * @param memberId The unique identifier of the member to which the node belongs. 
   */
  public fun memberId(memberId: String) {
    cdkBuilder.memberId(memberId)
  }

  /**
   * The unique identifier of the network for the node.
   *
   * Ethereum public networks have the following `NetworkId` s:
   *
   * * `n-ethereum-mainnet`
   * * `n-ethereum-goerli`
   * * `n-ethereum-rinkeby`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html#cfn-managedblockchain-node-networkid)
   * @param networkId The unique identifier of the network for the node. 
   */
  public fun networkId(networkId: String) {
    cdkBuilder.networkId(networkId)
  }

  /**
   * Configuration properties of a peer node.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html#cfn-managedblockchain-node-nodeconfiguration)
   * @param nodeConfiguration Configuration properties of a peer node. 
   */
  public fun nodeConfiguration(nodeConfiguration: IResolvable) {
    cdkBuilder.nodeConfiguration(nodeConfiguration)
  }

  /**
   * Configuration properties of a peer node.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html#cfn-managedblockchain-node-nodeconfiguration)
   * @param nodeConfiguration Configuration properties of a peer node. 
   */
  public fun nodeConfiguration(nodeConfiguration: CfnNode.NodeConfigurationProperty) {
    cdkBuilder.nodeConfiguration(nodeConfiguration)
  }

  public fun build(): CfnNode = cdkBuilder.build()
}
