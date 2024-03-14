package io.cloudshiftdev.awscdk.services.managedblockchain

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnAccessorProps {
  /**
   * The type of the accessor.
   *
   *
   * Currently, accessor type is restricted to `BILLING_TOKEN` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-accessor.html#cfn-managedblockchain-accessor-accessortype)
   */
  public fun accessorType(): String

  /**
   * The blockchain network that the `Accessor` token is created for.
   *
   *
   * We recommend using the appropriate `networkType` value for the blockchain network that you are
   * creating the `Accessor` token for. You cannot use the value `ETHEREUM_MAINNET_AND_GOERLI` to
   * specify a `networkType` for your Accessor token.
   *
   * The default value of `ETHEREUM_MAINNET_AND_GOERLI` is only applied:
   *
   * * when the `CreateAccessor` action does not set a `networkType` .
   * * to all existing `Accessor` tokens that were created before the `networkType` property was
   * introduced.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-accessor.html#cfn-managedblockchain-accessor-networktype)
   */
  public fun networkType(): String? = unwrap(this).getNetworkType()

  /**
   * The tags assigned to the Accessor.
   *
   * For more information about tags, see [Tagging
   * Resources](https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html)
   * in the *Amazon Managed Blockchain Ethereum Developer Guide* , or [Tagging
   * Resources](https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html)
   * in the *Amazon Managed Blockchain Hyperledger Fabric Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-accessor.html#cfn-managedblockchain-accessor-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnAccessorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessorType The type of the accessor. 
     *
     * Currently, accessor type is restricted to `BILLING_TOKEN` .
     */
    public fun accessorType(accessorType: String)

    /**
     * @param networkType The blockchain network that the `Accessor` token is created for.
     *
     * We recommend using the appropriate `networkType` value for the blockchain network that you
     * are creating the `Accessor` token for. You cannot use the value `ETHEREUM_MAINNET_AND_GOERLI` to
     * specify a `networkType` for your Accessor token.
     *
     * The default value of `ETHEREUM_MAINNET_AND_GOERLI` is only applied:
     *
     * * when the `CreateAccessor` action does not set a `networkType` .
     * * to all existing `Accessor` tokens that were created before the `networkType` property was
     * introduced.
     */
    public fun networkType(networkType: String)

    /**
     * @param tags The tags assigned to the Accessor.
     * For more information about tags, see [Tagging
     * Resources](https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html)
     * in the *Amazon Managed Blockchain Ethereum Developer Guide* , or [Tagging
     * Resources](https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html)
     * in the *Amazon Managed Blockchain Hyperledger Fabric Developer Guide* .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags assigned to the Accessor.
     * For more information about tags, see [Tagging
     * Resources](https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html)
     * in the *Amazon Managed Blockchain Ethereum Developer Guide* , or [Tagging
     * Resources](https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html)
     * in the *Amazon Managed Blockchain Hyperledger Fabric Developer Guide* .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.managedblockchain.CfnAccessorProps.Builder =
        software.amazon.awscdk.services.managedblockchain.CfnAccessorProps.builder()

    /**
     * @param accessorType The type of the accessor. 
     *
     * Currently, accessor type is restricted to `BILLING_TOKEN` .
     */
    override fun accessorType(accessorType: String) {
      cdkBuilder.accessorType(accessorType)
    }

    /**
     * @param networkType The blockchain network that the `Accessor` token is created for.
     *
     * We recommend using the appropriate `networkType` value for the blockchain network that you
     * are creating the `Accessor` token for. You cannot use the value `ETHEREUM_MAINNET_AND_GOERLI` to
     * specify a `networkType` for your Accessor token.
     *
     * The default value of `ETHEREUM_MAINNET_AND_GOERLI` is only applied:
     *
     * * when the `CreateAccessor` action does not set a `networkType` .
     * * to all existing `Accessor` tokens that were created before the `networkType` property was
     * introduced.
     */
    override fun networkType(networkType: String) {
      cdkBuilder.networkType(networkType)
    }

    /**
     * @param tags The tags assigned to the Accessor.
     * For more information about tags, see [Tagging
     * Resources](https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html)
     * in the *Amazon Managed Blockchain Ethereum Developer Guide* , or [Tagging
     * Resources](https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html)
     * in the *Amazon Managed Blockchain Hyperledger Fabric Developer Guide* .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags assigned to the Accessor.
     * For more information about tags, see [Tagging
     * Resources](https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html)
     * in the *Amazon Managed Blockchain Ethereum Developer Guide* , or [Tagging
     * Resources](https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html)
     * in the *Amazon Managed Blockchain Hyperledger Fabric Developer Guide* .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.managedblockchain.CfnAccessorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.managedblockchain.CfnAccessorProps,
  ) : CdkObject(cdkObject), CfnAccessorProps {
    /**
     * The type of the accessor.
     *
     *
     * Currently, accessor type is restricted to `BILLING_TOKEN` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-accessor.html#cfn-managedblockchain-accessor-accessortype)
     */
    override fun accessorType(): String = unwrap(this).getAccessorType()

    /**
     * The blockchain network that the `Accessor` token is created for.
     *
     *
     * We recommend using the appropriate `networkType` value for the blockchain network that you
     * are creating the `Accessor` token for. You cannot use the value `ETHEREUM_MAINNET_AND_GOERLI` to
     * specify a `networkType` for your Accessor token.
     *
     * The default value of `ETHEREUM_MAINNET_AND_GOERLI` is only applied:
     *
     * * when the `CreateAccessor` action does not set a `networkType` .
     * * to all existing `Accessor` tokens that were created before the `networkType` property was
     * introduced.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-accessor.html#cfn-managedblockchain-accessor-networktype)
     */
    override fun networkType(): String? = unwrap(this).getNetworkType()

    /**
     * The tags assigned to the Accessor.
     *
     * For more information about tags, see [Tagging
     * Resources](https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html)
     * in the *Amazon Managed Blockchain Ethereum Developer Guide* , or [Tagging
     * Resources](https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html)
     * in the *Amazon Managed Blockchain Hyperledger Fabric Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-accessor.html#cfn-managedblockchain-accessor-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccessorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.managedblockchain.CfnAccessorProps):
        CfnAccessorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccessorProps):
        software.amazon.awscdk.services.managedblockchain.CfnAccessorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.managedblockchain.CfnAccessorProps
  }
}
