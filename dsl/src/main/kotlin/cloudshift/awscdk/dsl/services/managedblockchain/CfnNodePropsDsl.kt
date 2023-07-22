@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.managedblockchain

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.managedblockchain.CfnNode
import software.amazon.awscdk.services.managedblockchain.CfnNodeProps

@CdkDslMarker
public class CfnNodePropsDsl {
  private val cdkBuilder: CfnNodeProps.Builder = CfnNodeProps.builder()

  /**
   * @param memberId The unique identifier of the member to which the node belongs.
   * Applies only to Hyperledger Fabric.
   */
  public fun memberId(memberId: String) {
    cdkBuilder.memberId(memberId)
  }

  /**
   * @param networkId The unique identifier of the network for the node. 
   * Ethereum public networks have the following `NetworkId` s:
   *
   * * `n-ethereum-mainnet`
   * * `n-ethereum-goerli`
   * * `n-ethereum-rinkeby`
   */
  public fun networkId(networkId: String) {
    cdkBuilder.networkId(networkId)
  }

  /**
   * @param nodeConfiguration Configuration properties of a peer node. 
   */
  public fun nodeConfiguration(nodeConfiguration: IResolvable) {
    cdkBuilder.nodeConfiguration(nodeConfiguration)
  }

  /**
   * @param nodeConfiguration Configuration properties of a peer node. 
   */
  public fun nodeConfiguration(nodeConfiguration: CfnNode.NodeConfigurationProperty) {
    cdkBuilder.nodeConfiguration(nodeConfiguration)
  }

  public fun build(): CfnNodeProps = cdkBuilder.build()
}
