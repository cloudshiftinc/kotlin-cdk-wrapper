@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a core network Connect peer for a specified core network connect attachment between a
 * core network and an appliance.
 *
 * The peer address and transit gateway address must be the same IP address family (IPv4 or IPv6).
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkmanager.*;
 * CfnConnectPeer cfnConnectPeer = CfnConnectPeer.Builder.create(this, "MyCfnConnectPeer")
 * .connectAttachmentId("connectAttachmentId")
 * .peerAddress("peerAddress")
 * // the properties below are optional
 * .bgpOptions(BgpOptionsProperty.builder()
 * .peerAsn(123)
 * .build())
 * .coreNetworkAddress("coreNetworkAddress")
 * .insideCidrBlocks(List.of("insideCidrBlocks"))
 * .subnetArn("subnetArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html)
 */
public open class CfnConnectPeer(
  cdkObject: software.amazon.awscdk.services.networkmanager.CfnConnectPeer,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConnectPeerProps,
  ) :
      this(software.amazon.awscdk.services.networkmanager.CfnConnectPeer(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnConnectPeerProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConnectPeerProps.Builder.() -> Unit,
  ) : this(scope, id, CfnConnectPeerProps(props)
  )

  /**
   *
   */
  public open fun attrConfiguration(): IResolvable =
      unwrap(this).getAttrConfiguration().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrConfigurationBgpConfigurations(): IResolvable =
      unwrap(this).getAttrConfigurationBgpConfigurations().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrConfigurationCoreNetworkAddress(): String =
      unwrap(this).getAttrConfigurationCoreNetworkAddress()

  /**
   *
   */
  public open fun attrConfigurationInsideCidrBlocks(): List<String> =
      unwrap(this).getAttrConfigurationInsideCidrBlocks()

  /**
   *
   */
  public open fun attrConfigurationPeerAddress(): String =
      unwrap(this).getAttrConfigurationPeerAddress()

  /**
   *
   */
  public open fun attrConfigurationProtocol(): String = unwrap(this).getAttrConfigurationProtocol()

  /**
   * The ID of the Connect peer.
   */
  public open fun attrConnectPeerId(): String = unwrap(this).getAttrConnectPeerId()

  /**
   * The core network ID.
   */
  public open fun attrCoreNetworkId(): String = unwrap(this).getAttrCoreNetworkId()

  /**
   * The timestamp when the Connect peer was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The Connect peer Regions where edges are located.
   */
  public open fun attrEdgeLocation(): String = unwrap(this).getAttrEdgeLocation()

  /**
   * The state of the Connect peer.
   *
   * This will be: `REJECTED` | `PENDING_ATTACHMENT_ACCEPTANCE` | `CREATING` | `FAILED` |
   * `AVAILABLE` | `UPDATING` | `PENDING_NETWORK_UPDATE` | `PENDING_TAG_ACCEPTANCE` | `DELETING` .
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * Describes the BGP options.
   */
  public open fun bgpOptions(): Any? = unwrap(this).getBgpOptions()

  /**
   * Describes the BGP options.
   */
  public open fun bgpOptions(`value`: IResolvable) {
    unwrap(this).setBgpOptions(`value`.let(IResolvable::unwrap))
  }

  /**
   * Describes the BGP options.
   */
  public open fun bgpOptions(`value`: BgpOptionsProperty) {
    unwrap(this).setBgpOptions(`value`.let(BgpOptionsProperty::unwrap))
  }

  /**
   * Describes the BGP options.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f3442340593a91ec3ca164948bd4562624886d304d757caa1a6318d7ccd82419")
  public open fun bgpOptions(`value`: BgpOptionsProperty.Builder.() -> Unit): Unit =
      bgpOptions(BgpOptionsProperty(`value`))

  /**
   * The ID of the attachment to connect.
   */
  public open fun connectAttachmentId(): String = unwrap(this).getConnectAttachmentId()

  /**
   * The ID of the attachment to connect.
   */
  public open fun connectAttachmentId(`value`: String) {
    unwrap(this).setConnectAttachmentId(`value`)
  }

  /**
   * The IP address of a core network.
   */
  public open fun coreNetworkAddress(): String? = unwrap(this).getCoreNetworkAddress()

  /**
   * The IP address of a core network.
   */
  public open fun coreNetworkAddress(`value`: String) {
    unwrap(this).setCoreNetworkAddress(`value`)
  }

  /**
   * The inside IP addresses used for a Connect peer configuration.
   */
  public open fun insideCidrBlocks(): List<String> = unwrap(this).getInsideCidrBlocks() ?:
      emptyList()

  /**
   * The inside IP addresses used for a Connect peer configuration.
   */
  public open fun insideCidrBlocks(`value`: List<String>) {
    unwrap(this).setInsideCidrBlocks(`value`)
  }

  /**
   * The inside IP addresses used for a Connect peer configuration.
   */
  public open fun insideCidrBlocks(vararg `value`: String): Unit =
      insideCidrBlocks(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The IP address of the Connect peer.
   */
  public open fun peerAddress(): String = unwrap(this).getPeerAddress()

  /**
   * The IP address of the Connect peer.
   */
  public open fun peerAddress(`value`: String) {
    unwrap(this).setPeerAddress(`value`)
  }

  /**
   * The subnet ARN of the Connect peer.
   */
  public open fun subnetArn(): String? = unwrap(this).getSubnetArn()

  /**
   * The subnet ARN of the Connect peer.
   */
  public open fun subnetArn(`value`: String) {
    unwrap(this).setSubnetArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The list of key-value tags associated with the Connect peer.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The list of key-value tags associated with the Connect peer.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The list of key-value tags associated with the Connect peer.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.networkmanager.CfnConnectPeer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Describes the BGP options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-bgpoptions)
     * @param bgpOptions Describes the BGP options. 
     */
    public fun bgpOptions(bgpOptions: IResolvable)

    /**
     * Describes the BGP options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-bgpoptions)
     * @param bgpOptions Describes the BGP options. 
     */
    public fun bgpOptions(bgpOptions: BgpOptionsProperty)

    /**
     * Describes the BGP options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-bgpoptions)
     * @param bgpOptions Describes the BGP options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef3cfeb0160be5b40a7dad5d7ed794fe5cf58ba20edd90fcd2558d674a1d1b25")
    public fun bgpOptions(bgpOptions: BgpOptionsProperty.Builder.() -> Unit)

    /**
     * The ID of the attachment to connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-connectattachmentid)
     * @param connectAttachmentId The ID of the attachment to connect. 
     */
    public fun connectAttachmentId(connectAttachmentId: String)

    /**
     * The IP address of a core network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-corenetworkaddress)
     * @param coreNetworkAddress The IP address of a core network. 
     */
    public fun coreNetworkAddress(coreNetworkAddress: String)

    /**
     * The inside IP addresses used for a Connect peer configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-insidecidrblocks)
     * @param insideCidrBlocks The inside IP addresses used for a Connect peer configuration. 
     */
    public fun insideCidrBlocks(insideCidrBlocks: List<String>)

    /**
     * The inside IP addresses used for a Connect peer configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-insidecidrblocks)
     * @param insideCidrBlocks The inside IP addresses used for a Connect peer configuration. 
     */
    public fun insideCidrBlocks(vararg insideCidrBlocks: String)

    /**
     * The IP address of the Connect peer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-peeraddress)
     * @param peerAddress The IP address of the Connect peer. 
     */
    public fun peerAddress(peerAddress: String)

    /**
     * The subnet ARN of the Connect peer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-subnetarn)
     * @param subnetArn The subnet ARN of the Connect peer. 
     */
    public fun subnetArn(subnetArn: String)

    /**
     * The list of key-value tags associated with the Connect peer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-tags)
     * @param tags The list of key-value tags associated with the Connect peer. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The list of key-value tags associated with the Connect peer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-tags)
     * @param tags The list of key-value tags associated with the Connect peer. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.networkmanager.CfnConnectPeer.Builder =
        software.amazon.awscdk.services.networkmanager.CfnConnectPeer.Builder.create(scope, id)

    /**
     * Describes the BGP options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-bgpoptions)
     * @param bgpOptions Describes the BGP options. 
     */
    override fun bgpOptions(bgpOptions: IResolvable) {
      cdkBuilder.bgpOptions(bgpOptions.let(IResolvable::unwrap))
    }

    /**
     * Describes the BGP options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-bgpoptions)
     * @param bgpOptions Describes the BGP options. 
     */
    override fun bgpOptions(bgpOptions: BgpOptionsProperty) {
      cdkBuilder.bgpOptions(bgpOptions.let(BgpOptionsProperty::unwrap))
    }

    /**
     * Describes the BGP options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-bgpoptions)
     * @param bgpOptions Describes the BGP options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef3cfeb0160be5b40a7dad5d7ed794fe5cf58ba20edd90fcd2558d674a1d1b25")
    override fun bgpOptions(bgpOptions: BgpOptionsProperty.Builder.() -> Unit): Unit =
        bgpOptions(BgpOptionsProperty(bgpOptions))

    /**
     * The ID of the attachment to connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-connectattachmentid)
     * @param connectAttachmentId The ID of the attachment to connect. 
     */
    override fun connectAttachmentId(connectAttachmentId: String) {
      cdkBuilder.connectAttachmentId(connectAttachmentId)
    }

    /**
     * The IP address of a core network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-corenetworkaddress)
     * @param coreNetworkAddress The IP address of a core network. 
     */
    override fun coreNetworkAddress(coreNetworkAddress: String) {
      cdkBuilder.coreNetworkAddress(coreNetworkAddress)
    }

    /**
     * The inside IP addresses used for a Connect peer configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-insidecidrblocks)
     * @param insideCidrBlocks The inside IP addresses used for a Connect peer configuration. 
     */
    override fun insideCidrBlocks(insideCidrBlocks: List<String>) {
      cdkBuilder.insideCidrBlocks(insideCidrBlocks)
    }

    /**
     * The inside IP addresses used for a Connect peer configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-insidecidrblocks)
     * @param insideCidrBlocks The inside IP addresses used for a Connect peer configuration. 
     */
    override fun insideCidrBlocks(vararg insideCidrBlocks: String): Unit =
        insideCidrBlocks(insideCidrBlocks.toList())

    /**
     * The IP address of the Connect peer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-peeraddress)
     * @param peerAddress The IP address of the Connect peer. 
     */
    override fun peerAddress(peerAddress: String) {
      cdkBuilder.peerAddress(peerAddress)
    }

    /**
     * The subnet ARN of the Connect peer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-subnetarn)
     * @param subnetArn The subnet ARN of the Connect peer. 
     */
    override fun subnetArn(subnetArn: String) {
      cdkBuilder.subnetArn(subnetArn)
    }

    /**
     * The list of key-value tags associated with the Connect peer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-tags)
     * @param tags The list of key-value tags associated with the Connect peer. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The list of key-value tags associated with the Connect peer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-tags)
     * @param tags The list of key-value tags associated with the Connect peer. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnConnectPeer =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.networkmanager.CfnConnectPeer.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConnectPeer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConnectPeer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnConnectPeer):
        CfnConnectPeer = CfnConnectPeer(cdkObject)

    internal fun unwrap(wrapped: CfnConnectPeer):
        software.amazon.awscdk.services.networkmanager.CfnConnectPeer = wrapped.cdkObject as
        software.amazon.awscdk.services.networkmanager.CfnConnectPeer
  }

  /**
   * Describes the BGP options.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkmanager.*;
   * BgpOptionsProperty bgpOptionsProperty = BgpOptionsProperty.builder()
   * .peerAsn(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectpeer-bgpoptions.html)
   */
  public interface BgpOptionsProperty {
    /**
     * The Peer ASN of the BGP.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectpeer-bgpoptions.html#cfn-networkmanager-connectpeer-bgpoptions-peerasn)
     */
    public fun peerAsn(): Number? = unwrap(this).getPeerAsn()

    /**
     * A builder for [BgpOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param peerAsn The Peer ASN of the BGP.
       */
      public fun peerAsn(peerAsn: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.BgpOptionsProperty.Builder =
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.BgpOptionsProperty.builder()

      /**
       * @param peerAsn The Peer ASN of the BGP.
       */
      override fun peerAsn(peerAsn: Number) {
        cdkBuilder.peerAsn(peerAsn)
      }

      public fun build():
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.BgpOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkmanager.CfnConnectPeer.BgpOptionsProperty,
    ) : CdkObject(cdkObject), BgpOptionsProperty {
      /**
       * The Peer ASN of the BGP.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectpeer-bgpoptions.html#cfn-networkmanager-connectpeer-bgpoptions-peerasn)
       */
      override fun peerAsn(): Number? = unwrap(this).getPeerAsn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BgpOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnConnectPeer.BgpOptionsProperty):
          BgpOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? BgpOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: BgpOptionsProperty):
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.BgpOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.BgpOptionsProperty
    }
  }

  /**
   * Describes a core network BGP configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkmanager.*;
   * ConnectPeerBgpConfigurationProperty connectPeerBgpConfigurationProperty =
   * ConnectPeerBgpConfigurationProperty.builder()
   * .coreNetworkAddress("coreNetworkAddress")
   * .coreNetworkAsn(123)
   * .peerAddress("peerAddress")
   * .peerAsn(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectpeer-connectpeerbgpconfiguration.html)
   */
  public interface ConnectPeerBgpConfigurationProperty {
    /**
     * The address of a core network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectpeer-connectpeerbgpconfiguration.html#cfn-networkmanager-connectpeer-connectpeerbgpconfiguration-corenetworkaddress)
     */
    public fun coreNetworkAddress(): String? = unwrap(this).getCoreNetworkAddress()

    /**
     * The ASN of the Coret Network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectpeer-connectpeerbgpconfiguration.html#cfn-networkmanager-connectpeer-connectpeerbgpconfiguration-corenetworkasn)
     */
    public fun coreNetworkAsn(): Number? = unwrap(this).getCoreNetworkAsn()

    /**
     * The address of a core network Connect peer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectpeer-connectpeerbgpconfiguration.html#cfn-networkmanager-connectpeer-connectpeerbgpconfiguration-peeraddress)
     */
    public fun peerAddress(): String? = unwrap(this).getPeerAddress()

    /**
     * The ASN of the Connect peer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectpeer-connectpeerbgpconfiguration.html#cfn-networkmanager-connectpeer-connectpeerbgpconfiguration-peerasn)
     */
    public fun peerAsn(): Number? = unwrap(this).getPeerAsn()

    /**
     * A builder for [ConnectPeerBgpConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param coreNetworkAddress The address of a core network.
       */
      public fun coreNetworkAddress(coreNetworkAddress: String)

      /**
       * @param coreNetworkAsn The ASN of the Coret Network.
       */
      public fun coreNetworkAsn(coreNetworkAsn: Number)

      /**
       * @param peerAddress The address of a core network Connect peer.
       */
      public fun peerAddress(peerAddress: String)

      /**
       * @param peerAsn The ASN of the Connect peer.
       */
      public fun peerAsn(peerAsn: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.ConnectPeerBgpConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.ConnectPeerBgpConfigurationProperty.builder()

      /**
       * @param coreNetworkAddress The address of a core network.
       */
      override fun coreNetworkAddress(coreNetworkAddress: String) {
        cdkBuilder.coreNetworkAddress(coreNetworkAddress)
      }

      /**
       * @param coreNetworkAsn The ASN of the Coret Network.
       */
      override fun coreNetworkAsn(coreNetworkAsn: Number) {
        cdkBuilder.coreNetworkAsn(coreNetworkAsn)
      }

      /**
       * @param peerAddress The address of a core network Connect peer.
       */
      override fun peerAddress(peerAddress: String) {
        cdkBuilder.peerAddress(peerAddress)
      }

      /**
       * @param peerAsn The ASN of the Connect peer.
       */
      override fun peerAsn(peerAsn: Number) {
        cdkBuilder.peerAsn(peerAsn)
      }

      public fun build():
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.ConnectPeerBgpConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkmanager.CfnConnectPeer.ConnectPeerBgpConfigurationProperty,
    ) : CdkObject(cdkObject), ConnectPeerBgpConfigurationProperty {
      /**
       * The address of a core network.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectpeer-connectpeerbgpconfiguration.html#cfn-networkmanager-connectpeer-connectpeerbgpconfiguration-corenetworkaddress)
       */
      override fun coreNetworkAddress(): String? = unwrap(this).getCoreNetworkAddress()

      /**
       * The ASN of the Coret Network.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectpeer-connectpeerbgpconfiguration.html#cfn-networkmanager-connectpeer-connectpeerbgpconfiguration-corenetworkasn)
       */
      override fun coreNetworkAsn(): Number? = unwrap(this).getCoreNetworkAsn()

      /**
       * The address of a core network Connect peer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectpeer-connectpeerbgpconfiguration.html#cfn-networkmanager-connectpeer-connectpeerbgpconfiguration-peeraddress)
       */
      override fun peerAddress(): String? = unwrap(this).getPeerAddress()

      /**
       * The ASN of the Connect peer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectpeer-connectpeerbgpconfiguration.html#cfn-networkmanager-connectpeer-connectpeerbgpconfiguration-peerasn)
       */
      override fun peerAsn(): Number? = unwrap(this).getPeerAsn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConnectPeerBgpConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnConnectPeer.ConnectPeerBgpConfigurationProperty):
          ConnectPeerBgpConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConnectPeerBgpConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectPeerBgpConfigurationProperty):
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.ConnectPeerBgpConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.ConnectPeerBgpConfigurationProperty
    }
  }

  /**
   * Describes a core network Connect peer configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkmanager.*;
   * ConnectPeerConfigurationProperty connectPeerConfigurationProperty =
   * ConnectPeerConfigurationProperty.builder()
   * .bgpConfigurations(List.of(ConnectPeerBgpConfigurationProperty.builder()
   * .coreNetworkAddress("coreNetworkAddress")
   * .coreNetworkAsn(123)
   * .peerAddress("peerAddress")
   * .peerAsn(123)
   * .build()))
   * .coreNetworkAddress("coreNetworkAddress")
   * .insideCidrBlocks(List.of("insideCidrBlocks"))
   * .peerAddress("peerAddress")
   * .protocol("protocol")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectpeer-connectpeerconfiguration.html)
   */
  public interface ConnectPeerConfigurationProperty {
    /**
     * The Connect peer BGP configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectpeer-connectpeerconfiguration.html#cfn-networkmanager-connectpeer-connectpeerconfiguration-bgpconfigurations)
     */
    public fun bgpConfigurations(): Any? = unwrap(this).getBgpConfigurations()

    /**
     * The IP address of a core network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectpeer-connectpeerconfiguration.html#cfn-networkmanager-connectpeer-connectpeerconfiguration-corenetworkaddress)
     */
    public fun coreNetworkAddress(): String? = unwrap(this).getCoreNetworkAddress()

    /**
     * The inside IP addresses used for a Connect peer configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectpeer-connectpeerconfiguration.html#cfn-networkmanager-connectpeer-connectpeerconfiguration-insidecidrblocks)
     */
    public fun insideCidrBlocks(): List<String> = unwrap(this).getInsideCidrBlocks() ?: emptyList()

    /**
     * The IP address of the Connect peer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectpeer-connectpeerconfiguration.html#cfn-networkmanager-connectpeer-connectpeerconfiguration-peeraddress)
     */
    public fun peerAddress(): String? = unwrap(this).getPeerAddress()

    /**
     * The protocol used for a Connect peer configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectpeer-connectpeerconfiguration.html#cfn-networkmanager-connectpeer-connectpeerconfiguration-protocol)
     */
    public fun protocol(): String? = unwrap(this).getProtocol()

    /**
     * A builder for [ConnectPeerConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bgpConfigurations The Connect peer BGP configurations.
       */
      public fun bgpConfigurations(bgpConfigurations: IResolvable)

      /**
       * @param bgpConfigurations The Connect peer BGP configurations.
       */
      public fun bgpConfigurations(bgpConfigurations: List<Any>)

      /**
       * @param bgpConfigurations The Connect peer BGP configurations.
       */
      public fun bgpConfigurations(vararg bgpConfigurations: Any)

      /**
       * @param coreNetworkAddress The IP address of a core network.
       */
      public fun coreNetworkAddress(coreNetworkAddress: String)

      /**
       * @param insideCidrBlocks The inside IP addresses used for a Connect peer configuration.
       */
      public fun insideCidrBlocks(insideCidrBlocks: List<String>)

      /**
       * @param insideCidrBlocks The inside IP addresses used for a Connect peer configuration.
       */
      public fun insideCidrBlocks(vararg insideCidrBlocks: String)

      /**
       * @param peerAddress The IP address of the Connect peer.
       */
      public fun peerAddress(peerAddress: String)

      /**
       * @param protocol The protocol used for a Connect peer configuration.
       */
      public fun protocol(protocol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.ConnectPeerConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.ConnectPeerConfigurationProperty.builder()

      /**
       * @param bgpConfigurations The Connect peer BGP configurations.
       */
      override fun bgpConfigurations(bgpConfigurations: IResolvable) {
        cdkBuilder.bgpConfigurations(bgpConfigurations.let(IResolvable::unwrap))
      }

      /**
       * @param bgpConfigurations The Connect peer BGP configurations.
       */
      override fun bgpConfigurations(bgpConfigurations: List<Any>) {
        cdkBuilder.bgpConfigurations(bgpConfigurations.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param bgpConfigurations The Connect peer BGP configurations.
       */
      override fun bgpConfigurations(vararg bgpConfigurations: Any): Unit =
          bgpConfigurations(bgpConfigurations.toList())

      /**
       * @param coreNetworkAddress The IP address of a core network.
       */
      override fun coreNetworkAddress(coreNetworkAddress: String) {
        cdkBuilder.coreNetworkAddress(coreNetworkAddress)
      }

      /**
       * @param insideCidrBlocks The inside IP addresses used for a Connect peer configuration.
       */
      override fun insideCidrBlocks(insideCidrBlocks: List<String>) {
        cdkBuilder.insideCidrBlocks(insideCidrBlocks)
      }

      /**
       * @param insideCidrBlocks The inside IP addresses used for a Connect peer configuration.
       */
      override fun insideCidrBlocks(vararg insideCidrBlocks: String): Unit =
          insideCidrBlocks(insideCidrBlocks.toList())

      /**
       * @param peerAddress The IP address of the Connect peer.
       */
      override fun peerAddress(peerAddress: String) {
        cdkBuilder.peerAddress(peerAddress)
      }

      /**
       * @param protocol The protocol used for a Connect peer configuration.
       */
      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public fun build():
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.ConnectPeerConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkmanager.CfnConnectPeer.ConnectPeerConfigurationProperty,
    ) : CdkObject(cdkObject), ConnectPeerConfigurationProperty {
      /**
       * The Connect peer BGP configurations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectpeer-connectpeerconfiguration.html#cfn-networkmanager-connectpeer-connectpeerconfiguration-bgpconfigurations)
       */
      override fun bgpConfigurations(): Any? = unwrap(this).getBgpConfigurations()

      /**
       * The IP address of a core network.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectpeer-connectpeerconfiguration.html#cfn-networkmanager-connectpeer-connectpeerconfiguration-corenetworkaddress)
       */
      override fun coreNetworkAddress(): String? = unwrap(this).getCoreNetworkAddress()

      /**
       * The inside IP addresses used for a Connect peer configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectpeer-connectpeerconfiguration.html#cfn-networkmanager-connectpeer-connectpeerconfiguration-insidecidrblocks)
       */
      override fun insideCidrBlocks(): List<String> = unwrap(this).getInsideCidrBlocks() ?:
          emptyList()

      /**
       * The IP address of the Connect peer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectpeer-connectpeerconfiguration.html#cfn-networkmanager-connectpeer-connectpeerconfiguration-peeraddress)
       */
      override fun peerAddress(): String? = unwrap(this).getPeerAddress()

      /**
       * The protocol used for a Connect peer configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectpeer-connectpeerconfiguration.html#cfn-networkmanager-connectpeer-connectpeerconfiguration-protocol)
       */
      override fun protocol(): String? = unwrap(this).getProtocol()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectPeerConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnConnectPeer.ConnectPeerConfigurationProperty):
          ConnectPeerConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConnectPeerConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectPeerConfigurationProperty):
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.ConnectPeerConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.ConnectPeerConfigurationProperty
    }
  }
}
