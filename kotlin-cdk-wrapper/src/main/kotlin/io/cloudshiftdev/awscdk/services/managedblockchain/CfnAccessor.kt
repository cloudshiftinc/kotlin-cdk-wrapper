@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.managedblockchain

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new accessor for use with Amazon Managed Blockchain service that supports token based
 * access.
 *
 * The accessor contains information required for token based access.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.managedblockchain.*;
 * CfnAccessor cfnAccessor = CfnAccessor.Builder.create(this, "MyCfnAccessor")
 * .accessorType("accessorType")
 * // the properties below are optional
 * .networkType("networkType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-accessor.html)
 */
public open class CfnAccessor(
  cdkObject: software.amazon.awscdk.services.managedblockchain.CfnAccessor,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAccessorProps,
  ) :
      this(software.amazon.awscdk.services.managedblockchain.CfnAccessor(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnAccessorProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAccessorProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAccessorProps(props)
  )

  /**
   * The type of the accessor.
   */
  public open fun accessorType(): String = unwrap(this).getAccessorType()

  /**
   * The type of the accessor.
   */
  public open fun accessorType(`value`: String) {
    unwrap(this).setAccessorType(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the accessor.
   *
   * For more information about ARNs and their format, see [Amazon Resource Names
   * (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the *AWS
   * General Reference* .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The billing token is a property of the accessor.
   *
   * Use this token to make Ethereum API calls to your Ethereum node. The billing token is used to
   * track your accessor object for billing Ethereum API requests made to your Ethereum nodes.
   */
  public open fun attrBillingToken(): String = unwrap(this).getAttrBillingToken()

  /**
   * The creation date and time of the accessor.
   */
  public open fun attrCreationDate(): String = unwrap(this).getAttrCreationDate()

  /**
   * The unique identifier of the accessor.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The current status of the accessor.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The blockchain network that the `Accessor` token is created for.
   */
  public open fun networkType(): String? = unwrap(this).getNetworkType()

  /**
   * The blockchain network that the `Accessor` token is created for.
   */
  public open fun networkType(`value`: String) {
    unwrap(this).setNetworkType(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags assigned to the Accessor.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags assigned to the Accessor.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags assigned to the Accessor.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.managedblockchain.CfnAccessor].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The type of the accessor.
     *
     *
     * Currently, accessor type is restricted to `BILLING_TOKEN` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-accessor.html#cfn-managedblockchain-accessor-accessortype)
     * @param accessorType The type of the accessor. 
     */
    public fun accessorType(accessorType: String)

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
     * @param networkType The blockchain network that the `Accessor` token is created for. 
     */
    public fun networkType(networkType: String)

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
     * @param tags The tags assigned to the Accessor. 
     */
    public fun tags(tags: List<CfnTag>)

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
     * @param tags The tags assigned to the Accessor. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.managedblockchain.CfnAccessor.Builder =
        software.amazon.awscdk.services.managedblockchain.CfnAccessor.Builder.create(scope, id)

    /**
     * The type of the accessor.
     *
     *
     * Currently, accessor type is restricted to `BILLING_TOKEN` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-accessor.html#cfn-managedblockchain-accessor-accessortype)
     * @param accessorType The type of the accessor. 
     */
    override fun accessorType(accessorType: String) {
      cdkBuilder.accessorType(accessorType)
    }

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
     * @param networkType The blockchain network that the `Accessor` token is created for. 
     */
    override fun networkType(networkType: String) {
      cdkBuilder.networkType(networkType)
    }

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
     * @param tags The tags assigned to the Accessor. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

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
     * @param tags The tags assigned to the Accessor. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.managedblockchain.CfnAccessor =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.managedblockchain.CfnAccessor.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccessor {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccessor(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.managedblockchain.CfnAccessor):
        CfnAccessor = CfnAccessor(cdkObject)

    internal fun unwrap(wrapped: CfnAccessor):
        software.amazon.awscdk.services.managedblockchain.CfnAccessor = wrapped.cdkObject as
        software.amazon.awscdk.services.managedblockchain.CfnAccessor
  }
}
