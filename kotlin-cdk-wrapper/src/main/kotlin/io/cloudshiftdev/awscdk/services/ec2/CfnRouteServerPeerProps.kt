@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

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
 * Properties for defining a `CfnRouteServerPeer`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnRouteServerPeerProps cfnRouteServerPeerProps = CfnRouteServerPeerProps.builder()
 * .bgpOptions(BgpOptionsProperty.builder()
 * .peerAsn(123)
 * .peerLivenessDetection("peerLivenessDetection")
 * .build())
 * .peerAddress("peerAddress")
 * .routeServerEndpointId("routeServerEndpointId")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpeer.html)
 */
public interface CfnRouteServerPeerProps {
  /**
   * The BGP configuration options for this peer, including ASN (Autonomous System Number) and BFD
   * (Bidrectional Forwarding Detection) settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpeer.html#cfn-ec2-routeserverpeer-bgpoptions)
   */
  public fun bgpOptions(): Any

  /**
   * The IPv4 address of the peer device.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpeer.html#cfn-ec2-routeserverpeer-peeraddress)
   */
  public fun peerAddress(): String

  /**
   * The ID of the route server endpoint associated with this peer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpeer.html#cfn-ec2-routeserverpeer-routeserverendpointid)
   */
  public fun routeServerEndpointId(): String

  /**
   * Any tags assigned to the route server peer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpeer.html#cfn-ec2-routeserverpeer-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnRouteServerPeerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bgpOptions The BGP configuration options for this peer, including ASN (Autonomous
     * System Number) and BFD (Bidrectional Forwarding Detection) settings. 
     */
    public fun bgpOptions(bgpOptions: IResolvable)

    /**
     * @param bgpOptions The BGP configuration options for this peer, including ASN (Autonomous
     * System Number) and BFD (Bidrectional Forwarding Detection) settings. 
     */
    public fun bgpOptions(bgpOptions: CfnRouteServerPeer.BgpOptionsProperty)

    /**
     * @param bgpOptions The BGP configuration options for this peer, including ASN (Autonomous
     * System Number) and BFD (Bidrectional Forwarding Detection) settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66939e506493d7ff84afb9ffb394be7dfd74c144cf4bf38c516666ac11eba383")
    public fun bgpOptions(bgpOptions: CfnRouteServerPeer.BgpOptionsProperty.Builder.() -> Unit)

    /**
     * @param peerAddress The IPv4 address of the peer device. 
     */
    public fun peerAddress(peerAddress: String)

    /**
     * @param routeServerEndpointId The ID of the route server endpoint associated with this peer. 
     */
    public fun routeServerEndpointId(routeServerEndpointId: String)

    /**
     * @param tags Any tags assigned to the route server peer.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Any tags assigned to the route server peer.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnRouteServerPeerProps.Builder =
        software.amazon.awscdk.services.ec2.CfnRouteServerPeerProps.builder()

    /**
     * @param bgpOptions The BGP configuration options for this peer, including ASN (Autonomous
     * System Number) and BFD (Bidrectional Forwarding Detection) settings. 
     */
    override fun bgpOptions(bgpOptions: IResolvable) {
      cdkBuilder.bgpOptions(bgpOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param bgpOptions The BGP configuration options for this peer, including ASN (Autonomous
     * System Number) and BFD (Bidrectional Forwarding Detection) settings. 
     */
    override fun bgpOptions(bgpOptions: CfnRouteServerPeer.BgpOptionsProperty) {
      cdkBuilder.bgpOptions(bgpOptions.let(CfnRouteServerPeer.BgpOptionsProperty.Companion::unwrap))
    }

    /**
     * @param bgpOptions The BGP configuration options for this peer, including ASN (Autonomous
     * System Number) and BFD (Bidrectional Forwarding Detection) settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66939e506493d7ff84afb9ffb394be7dfd74c144cf4bf38c516666ac11eba383")
    override fun bgpOptions(bgpOptions: CfnRouteServerPeer.BgpOptionsProperty.Builder.() -> Unit):
        Unit = bgpOptions(CfnRouteServerPeer.BgpOptionsProperty(bgpOptions))

    /**
     * @param peerAddress The IPv4 address of the peer device. 
     */
    override fun peerAddress(peerAddress: String) {
      cdkBuilder.peerAddress(peerAddress)
    }

    /**
     * @param routeServerEndpointId The ID of the route server endpoint associated with this peer. 
     */
    override fun routeServerEndpointId(routeServerEndpointId: String) {
      cdkBuilder.routeServerEndpointId(routeServerEndpointId)
    }

    /**
     * @param tags Any tags assigned to the route server peer.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Any tags assigned to the route server peer.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnRouteServerPeerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnRouteServerPeerProps,
  ) : CdkObject(cdkObject),
      CfnRouteServerPeerProps {
    /**
     * The BGP configuration options for this peer, including ASN (Autonomous System Number) and BFD
     * (Bidrectional Forwarding Detection) settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpeer.html#cfn-ec2-routeserverpeer-bgpoptions)
     */
    override fun bgpOptions(): Any = unwrap(this).getBgpOptions()

    /**
     * The IPv4 address of the peer device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpeer.html#cfn-ec2-routeserverpeer-peeraddress)
     */
    override fun peerAddress(): String = unwrap(this).getPeerAddress()

    /**
     * The ID of the route server endpoint associated with this peer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpeer.html#cfn-ec2-routeserverpeer-routeserverendpointid)
     */
    override fun routeServerEndpointId(): String = unwrap(this).getRouteServerEndpointId()

    /**
     * Any tags assigned to the route server peer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpeer.html#cfn-ec2-routeserverpeer-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRouteServerPeerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnRouteServerPeerProps):
        CfnRouteServerPeerProps = CdkObjectWrappers.wrap(cdkObject) as? CfnRouteServerPeerProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRouteServerPeerProps):
        software.amazon.awscdk.services.ec2.CfnRouteServerPeerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnRouteServerPeerProps
  }
}
