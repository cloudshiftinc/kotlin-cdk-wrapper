@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnConnectPeer`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkmanager.*;
 * CfnConnectPeerProps cfnConnectPeerProps = CfnConnectPeerProps.builder()
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
public interface CfnConnectPeerProps {
  /**
   * Describes the BGP options.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-bgpoptions)
   */
  public fun bgpOptions(): Any? = unwrap(this).getBgpOptions()

  /**
   * The ID of the attachment to connect.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-connectattachmentid)
   */
  public fun connectAttachmentId(): String

  /**
   * The IP address of a core network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-corenetworkaddress)
   */
  public fun coreNetworkAddress(): String? = unwrap(this).getCoreNetworkAddress()

  /**
   * The inside IP addresses used for a Connect peer configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-insidecidrblocks)
   */
  public fun insideCidrBlocks(): List<String> = unwrap(this).getInsideCidrBlocks() ?: emptyList()

  /**
   * The IP address of the Connect peer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-peeraddress)
   */
  public fun peerAddress(): String

  /**
   * The subnet ARN of the Connect peer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-subnetarn)
   */
  public fun subnetArn(): String? = unwrap(this).getSubnetArn()

  /**
   * The list of key-value tags associated with the Connect peer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnConnectPeerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bgpOptions Describes the BGP options.
     */
    public fun bgpOptions(bgpOptions: IResolvable)

    /**
     * @param bgpOptions Describes the BGP options.
     */
    public fun bgpOptions(bgpOptions: CfnConnectPeer.BgpOptionsProperty)

    /**
     * @param bgpOptions Describes the BGP options.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("916b002b3d0a7744466484cb05d310dbcfc095ac2b5b0b449efded7bac19b7e6")
    public fun bgpOptions(bgpOptions: CfnConnectPeer.BgpOptionsProperty.Builder.() -> Unit)

    /**
     * @param connectAttachmentId The ID of the attachment to connect. 
     */
    public fun connectAttachmentId(connectAttachmentId: String)

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
     * @param subnetArn The subnet ARN of the Connect peer.
     */
    public fun subnetArn(subnetArn: String)

    /**
     * @param tags The list of key-value tags associated with the Connect peer.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The list of key-value tags associated with the Connect peer.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnConnectPeerProps.Builder =
        software.amazon.awscdk.services.networkmanager.CfnConnectPeerProps.builder()

    /**
     * @param bgpOptions Describes the BGP options.
     */
    override fun bgpOptions(bgpOptions: IResolvable) {
      cdkBuilder.bgpOptions(bgpOptions.let(IResolvable::unwrap))
    }

    /**
     * @param bgpOptions Describes the BGP options.
     */
    override fun bgpOptions(bgpOptions: CfnConnectPeer.BgpOptionsProperty) {
      cdkBuilder.bgpOptions(bgpOptions.let(CfnConnectPeer.BgpOptionsProperty::unwrap))
    }

    /**
     * @param bgpOptions Describes the BGP options.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("916b002b3d0a7744466484cb05d310dbcfc095ac2b5b0b449efded7bac19b7e6")
    override fun bgpOptions(bgpOptions: CfnConnectPeer.BgpOptionsProperty.Builder.() -> Unit): Unit
        = bgpOptions(CfnConnectPeer.BgpOptionsProperty(bgpOptions))

    /**
     * @param connectAttachmentId The ID of the attachment to connect. 
     */
    override fun connectAttachmentId(connectAttachmentId: String) {
      cdkBuilder.connectAttachmentId(connectAttachmentId)
    }

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
     * @param subnetArn The subnet ARN of the Connect peer.
     */
    override fun subnetArn(subnetArn: String) {
      cdkBuilder.subnetArn(subnetArn)
    }

    /**
     * @param tags The list of key-value tags associated with the Connect peer.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The list of key-value tags associated with the Connect peer.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnConnectPeerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.networkmanager.CfnConnectPeerProps,
  ) : CdkObject(cdkObject), CfnConnectPeerProps {
    /**
     * Describes the BGP options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-bgpoptions)
     */
    override fun bgpOptions(): Any? = unwrap(this).getBgpOptions()

    /**
     * The ID of the attachment to connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-connectattachmentid)
     */
    override fun connectAttachmentId(): String = unwrap(this).getConnectAttachmentId()

    /**
     * The IP address of a core network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-corenetworkaddress)
     */
    override fun coreNetworkAddress(): String? = unwrap(this).getCoreNetworkAddress()

    /**
     * The inside IP addresses used for a Connect peer configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-insidecidrblocks)
     */
    override fun insideCidrBlocks(): List<String> = unwrap(this).getInsideCidrBlocks() ?:
        emptyList()

    /**
     * The IP address of the Connect peer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-peeraddress)
     */
    override fun peerAddress(): String = unwrap(this).getPeerAddress()

    /**
     * The subnet ARN of the Connect peer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-subnetarn)
     */
    override fun subnetArn(): String? = unwrap(this).getSubnetArn()

    /**
     * The list of key-value tags associated with the Connect peer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectPeerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnConnectPeerProps):
        CfnConnectPeerProps = CdkObjectWrappers.wrap(cdkObject) as? CfnConnectPeerProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConnectPeerProps):
        software.amazon.awscdk.services.networkmanager.CfnConnectPeerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.networkmanager.CfnConnectPeerProps
  }
}
