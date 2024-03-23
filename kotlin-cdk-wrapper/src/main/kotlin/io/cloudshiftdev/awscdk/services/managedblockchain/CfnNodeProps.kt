@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.managedblockchain

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnNode`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.managedblockchain.*;
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
public interface CfnNodeProps {
  /**
   * The unique identifier of the member to which the node belongs.
   *
   * Applies only to Hyperledger Fabric.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html#cfn-managedblockchain-node-memberid)
   */
  public fun memberId(): String? = unwrap(this).getMemberId()

  /**
   * The unique identifier of the network for the node.
   *
   * Ethereum public networks have the following `NetworkId` s:
   *
   * * `n-ethereum-mainnet`
   * * `n-ethereum-goerli`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html#cfn-managedblockchain-node-networkid)
   */
  public fun networkId(): String

  /**
   * Configuration properties of a peer node.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html#cfn-managedblockchain-node-nodeconfiguration)
   */
  public fun nodeConfiguration(): Any

  /**
   * A builder for [CfnNodeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param memberId The unique identifier of the member to which the node belongs.
     * Applies only to Hyperledger Fabric.
     */
    public fun memberId(memberId: String)

    /**
     * @param networkId The unique identifier of the network for the node. 
     * Ethereum public networks have the following `NetworkId` s:
     *
     * * `n-ethereum-mainnet`
     * * `n-ethereum-goerli`
     */
    public fun networkId(networkId: String)

    /**
     * @param nodeConfiguration Configuration properties of a peer node. 
     */
    public fun nodeConfiguration(nodeConfiguration: IResolvable)

    /**
     * @param nodeConfiguration Configuration properties of a peer node. 
     */
    public fun nodeConfiguration(nodeConfiguration: CfnNode.NodeConfigurationProperty)

    /**
     * @param nodeConfiguration Configuration properties of a peer node. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be4725402bc701968638ba0d3dab62f65ce5c00e6e8aebececaeed97357a83fb")
    public
        fun nodeConfiguration(nodeConfiguration: CfnNode.NodeConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.managedblockchain.CfnNodeProps.Builder =
        software.amazon.awscdk.services.managedblockchain.CfnNodeProps.builder()

    /**
     * @param memberId The unique identifier of the member to which the node belongs.
     * Applies only to Hyperledger Fabric.
     */
    override fun memberId(memberId: String) {
      cdkBuilder.memberId(memberId)
    }

    /**
     * @param networkId The unique identifier of the network for the node. 
     * Ethereum public networks have the following `NetworkId` s:
     *
     * * `n-ethereum-mainnet`
     * * `n-ethereum-goerli`
     */
    override fun networkId(networkId: String) {
      cdkBuilder.networkId(networkId)
    }

    /**
     * @param nodeConfiguration Configuration properties of a peer node. 
     */
    override fun nodeConfiguration(nodeConfiguration: IResolvable) {
      cdkBuilder.nodeConfiguration(nodeConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param nodeConfiguration Configuration properties of a peer node. 
     */
    override fun nodeConfiguration(nodeConfiguration: CfnNode.NodeConfigurationProperty) {
      cdkBuilder.nodeConfiguration(nodeConfiguration.let(CfnNode.NodeConfigurationProperty::unwrap))
    }

    /**
     * @param nodeConfiguration Configuration properties of a peer node. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be4725402bc701968638ba0d3dab62f65ce5c00e6e8aebececaeed97357a83fb")
    override
        fun nodeConfiguration(nodeConfiguration: CfnNode.NodeConfigurationProperty.Builder.() -> Unit):
        Unit = nodeConfiguration(CfnNode.NodeConfigurationProperty(nodeConfiguration))

    public fun build(): software.amazon.awscdk.services.managedblockchain.CfnNodeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.managedblockchain.CfnNodeProps,
  ) : CdkObject(cdkObject), CfnNodeProps {
    /**
     * The unique identifier of the member to which the node belongs.
     *
     * Applies only to Hyperledger Fabric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html#cfn-managedblockchain-node-memberid)
     */
    override fun memberId(): String? = unwrap(this).getMemberId()

    /**
     * The unique identifier of the network for the node.
     *
     * Ethereum public networks have the following `NetworkId` s:
     *
     * * `n-ethereum-mainnet`
     * * `n-ethereum-goerli`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html#cfn-managedblockchain-node-networkid)
     */
    override fun networkId(): String = unwrap(this).getNetworkId()

    /**
     * Configuration properties of a peer node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html#cfn-managedblockchain-node-nodeconfiguration)
     */
    override fun nodeConfiguration(): Any = unwrap(this).getNodeConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNodeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.managedblockchain.CfnNodeProps):
        CfnNodeProps = CdkObjectWrappers.wrap(cdkObject) as? CfnNodeProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNodeProps):
        software.amazon.awscdk.services.managedblockchain.CfnNodeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.managedblockchain.CfnNodeProps
  }
}
