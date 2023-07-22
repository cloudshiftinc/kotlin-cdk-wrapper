@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.managedblockchain

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.managedblockchain.CfnNode
import software.amazon.awscdk.services.managedblockchain.CfnNodeProps

/**
 * Properties for defining a `CfnNode`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.managedblockchain.*;
 * CfnNodeProps cfnNodeProps = CfnNodeProps.builder()
 * .networkId("networkId")
 * .nodeConfiguration(NodeConfigurationProperty.builder()
 * .availabilityZone("availabilityZone")
 * .instanceType("instanceType")
 * .build())
 * // the properties below are optional
 * .memberId("memberId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html)
 */
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
