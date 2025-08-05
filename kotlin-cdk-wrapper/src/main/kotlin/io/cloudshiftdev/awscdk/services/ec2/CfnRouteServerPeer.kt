@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
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
 * Specifies a BGP peer configuration for a route server endpoint.
 *
 * A route server peer is a session between a route server endpoint and the device deployed in AWS
 * (such as a firewall appliance or other network security function running on an EC2 instance).
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnRouteServerPeer cfnRouteServerPeer = CfnRouteServerPeer.Builder.create(this,
 * "MyCfnRouteServerPeer")
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
public open class CfnRouteServerPeer(
  cdkObject: software.amazon.awscdk.services.ec2.CfnRouteServerPeer,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRouteServerPeerProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnRouteServerPeer(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnRouteServerPeerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRouteServerPeerProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRouteServerPeerProps(props)
  )

  /**
   * The ARN of the route server peer.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The IP address of the Elastic network interface for the route server endpoint.
   */
  public open fun attrEndpointEniAddress(): String = unwrap(this).getAttrEndpointEniAddress()

  /**
   * The ID of the Elastic network interface for the route server endpoint.
   */
  public open fun attrEndpointEniId(): String = unwrap(this).getAttrEndpointEniId()

  /**
   * The ID of the route server peer.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The ID of the route server associated with this peer.
   */
  public open fun attrRouteServerId(): String = unwrap(this).getAttrRouteServerId()

  /**
   * The ID of the subnet containing the route server peer.
   */
  public open fun attrSubnetId(): String = unwrap(this).getAttrSubnetId()

  /**
   * The ID of the VPC containing the route server peer.
   */
  public open fun attrVpcId(): String = unwrap(this).getAttrVpcId()

  /**
   * The BGP configuration options for this peer, including ASN (Autonomous System Number) and BFD
   * (Bidrectional Forwarding Detection) settings.
   */
  public open fun bgpOptions(): Any = unwrap(this).getBgpOptions()

  /**
   * The BGP configuration options for this peer, including ASN (Autonomous System Number) and BFD
   * (Bidrectional Forwarding Detection) settings.
   */
  public open fun bgpOptions(`value`: IResolvable) {
    unwrap(this).setBgpOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The BGP configuration options for this peer, including ASN (Autonomous System Number) and BFD
   * (Bidrectional Forwarding Detection) settings.
   */
  public open fun bgpOptions(`value`: BgpOptionsProperty) {
    unwrap(this).setBgpOptions(`value`.let(BgpOptionsProperty.Companion::unwrap))
  }

  /**
   * The BGP configuration options for this peer, including ASN (Autonomous System Number) and BFD
   * (Bidrectional Forwarding Detection) settings.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9190fed7c1f7fb344a226d616f8f8c06c7bc9565c903bcbac596a0aa2e205aa7")
  public open fun bgpOptions(`value`: BgpOptionsProperty.Builder.() -> Unit): Unit =
      bgpOptions(BgpOptionsProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The IPv4 address of the peer device.
   */
  public open fun peerAddress(): String = unwrap(this).getPeerAddress()

  /**
   * The IPv4 address of the peer device.
   */
  public open fun peerAddress(`value`: String) {
    unwrap(this).setPeerAddress(`value`)
  }

  /**
   * The ID of the route server endpoint associated with this peer.
   */
  public open fun routeServerEndpointId(): String = unwrap(this).getRouteServerEndpointId()

  /**
   * The ID of the route server endpoint associated with this peer.
   */
  public open fun routeServerEndpointId(`value`: String) {
    unwrap(this).setRouteServerEndpointId(`value`)
  }

  /**
   * Any tags assigned to the route server peer.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Any tags assigned to the route server peer.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Any tags assigned to the route server peer.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnRouteServerPeer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The BGP configuration options for this peer, including ASN (Autonomous System Number) and BFD
     * (Bidrectional Forwarding Detection) settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpeer.html#cfn-ec2-routeserverpeer-bgpoptions)
     * @param bgpOptions The BGP configuration options for this peer, including ASN (Autonomous
     * System Number) and BFD (Bidrectional Forwarding Detection) settings. 
     */
    public fun bgpOptions(bgpOptions: IResolvable)

    /**
     * The BGP configuration options for this peer, including ASN (Autonomous System Number) and BFD
     * (Bidrectional Forwarding Detection) settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpeer.html#cfn-ec2-routeserverpeer-bgpoptions)
     * @param bgpOptions The BGP configuration options for this peer, including ASN (Autonomous
     * System Number) and BFD (Bidrectional Forwarding Detection) settings. 
     */
    public fun bgpOptions(bgpOptions: BgpOptionsProperty)

    /**
     * The BGP configuration options for this peer, including ASN (Autonomous System Number) and BFD
     * (Bidrectional Forwarding Detection) settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpeer.html#cfn-ec2-routeserverpeer-bgpoptions)
     * @param bgpOptions The BGP configuration options for this peer, including ASN (Autonomous
     * System Number) and BFD (Bidrectional Forwarding Detection) settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9703d50650c25027e102357b1536a6c358c637026e94e5f30a7f903ac5e845dc")
    public fun bgpOptions(bgpOptions: BgpOptionsProperty.Builder.() -> Unit)

    /**
     * The IPv4 address of the peer device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpeer.html#cfn-ec2-routeserverpeer-peeraddress)
     * @param peerAddress The IPv4 address of the peer device. 
     */
    public fun peerAddress(peerAddress: String)

    /**
     * The ID of the route server endpoint associated with this peer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpeer.html#cfn-ec2-routeserverpeer-routeserverendpointid)
     * @param routeServerEndpointId The ID of the route server endpoint associated with this peer. 
     */
    public fun routeServerEndpointId(routeServerEndpointId: String)

    /**
     * Any tags assigned to the route server peer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpeer.html#cfn-ec2-routeserverpeer-tags)
     * @param tags Any tags assigned to the route server peer. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Any tags assigned to the route server peer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpeer.html#cfn-ec2-routeserverpeer-tags)
     * @param tags Any tags assigned to the route server peer. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnRouteServerPeer.Builder =
        software.amazon.awscdk.services.ec2.CfnRouteServerPeer.Builder.create(scope, id)

    /**
     * The BGP configuration options for this peer, including ASN (Autonomous System Number) and BFD
     * (Bidrectional Forwarding Detection) settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpeer.html#cfn-ec2-routeserverpeer-bgpoptions)
     * @param bgpOptions The BGP configuration options for this peer, including ASN (Autonomous
     * System Number) and BFD (Bidrectional Forwarding Detection) settings. 
     */
    override fun bgpOptions(bgpOptions: IResolvable) {
      cdkBuilder.bgpOptions(bgpOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * The BGP configuration options for this peer, including ASN (Autonomous System Number) and BFD
     * (Bidrectional Forwarding Detection) settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpeer.html#cfn-ec2-routeserverpeer-bgpoptions)
     * @param bgpOptions The BGP configuration options for this peer, including ASN (Autonomous
     * System Number) and BFD (Bidrectional Forwarding Detection) settings. 
     */
    override fun bgpOptions(bgpOptions: BgpOptionsProperty) {
      cdkBuilder.bgpOptions(bgpOptions.let(BgpOptionsProperty.Companion::unwrap))
    }

    /**
     * The BGP configuration options for this peer, including ASN (Autonomous System Number) and BFD
     * (Bidrectional Forwarding Detection) settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpeer.html#cfn-ec2-routeserverpeer-bgpoptions)
     * @param bgpOptions The BGP configuration options for this peer, including ASN (Autonomous
     * System Number) and BFD (Bidrectional Forwarding Detection) settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9703d50650c25027e102357b1536a6c358c637026e94e5f30a7f903ac5e845dc")
    override fun bgpOptions(bgpOptions: BgpOptionsProperty.Builder.() -> Unit): Unit =
        bgpOptions(BgpOptionsProperty(bgpOptions))

    /**
     * The IPv4 address of the peer device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpeer.html#cfn-ec2-routeserverpeer-peeraddress)
     * @param peerAddress The IPv4 address of the peer device. 
     */
    override fun peerAddress(peerAddress: String) {
      cdkBuilder.peerAddress(peerAddress)
    }

    /**
     * The ID of the route server endpoint associated with this peer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpeer.html#cfn-ec2-routeserverpeer-routeserverendpointid)
     * @param routeServerEndpointId The ID of the route server endpoint associated with this peer. 
     */
    override fun routeServerEndpointId(routeServerEndpointId: String) {
      cdkBuilder.routeServerEndpointId(routeServerEndpointId)
    }

    /**
     * Any tags assigned to the route server peer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpeer.html#cfn-ec2-routeserverpeer-tags)
     * @param tags Any tags assigned to the route server peer. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Any tags assigned to the route server peer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpeer.html#cfn-ec2-routeserverpeer-tags)
     * @param tags Any tags assigned to the route server peer. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnRouteServerPeer = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnRouteServerPeer.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRouteServerPeer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRouteServerPeer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnRouteServerPeer):
        CfnRouteServerPeer = CfnRouteServerPeer(cdkObject)

    internal fun unwrap(wrapped: CfnRouteServerPeer):
        software.amazon.awscdk.services.ec2.CfnRouteServerPeer = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnRouteServerPeer
  }

  /**
   * The BGP configuration options for this peer, including ASN (Autonomous System Number) and BFD
   * (Bidrectional Forwarding Detection) settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * BgpOptionsProperty bgpOptionsProperty = BgpOptionsProperty.builder()
   * .peerAsn(123)
   * .peerLivenessDetection("peerLivenessDetection")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-routeserverpeer-bgpoptions.html)
   */
  public interface BgpOptionsProperty {
    /**
     * The Border Gateway Protocol (BGP) Autonomous System Number (ASN) for the appliance.
     *
     * Valid values are from 1 to 4294967295. We recommend using a private ASN in the 64512–65534
     * (16-bit ASN) or 4200000000–4294967294 (32-bit ASN) range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-routeserverpeer-bgpoptions.html#cfn-ec2-routeserverpeer-bgpoptions-peerasn)
     */
    public fun peerAsn(): Number? = unwrap(this).getPeerAsn()

    /**
     * The liveness detection protocol used for the BGP peer.
     *
     * The requested liveness detection protocol for the BGP peer.
     *
     * * `bgp-keepalive` : The standard BGP keep alive mechanism (
     * [RFC4271](https://docs.aws.amazon.com/https://www.rfc-editor.org/rfc/rfc4271#page-21) ) that is
     * stable but may take longer to fail-over in cases of network impact or router failure.
     * * `bfd` : An additional Bidirectional Forwarding Detection (BFD) protocol (
     * [RFC5880](https://docs.aws.amazon.com/https://www.rfc-editor.org/rfc/rfc5880) ) that enables
     * fast failover by using more sensitive liveness detection.
     *
     * Defaults to `bgp-keepalive` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-routeserverpeer-bgpoptions.html#cfn-ec2-routeserverpeer-bgpoptions-peerlivenessdetection)
     */
    public fun peerLivenessDetection(): String? = unwrap(this).getPeerLivenessDetection()

    /**
     * A builder for [BgpOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param peerAsn The Border Gateway Protocol (BGP) Autonomous System Number (ASN) for the
       * appliance.
       * Valid values are from 1 to 4294967295. We recommend using a private ASN in the 64512–65534
       * (16-bit ASN) or 4200000000–4294967294 (32-bit ASN) range.
       */
      public fun peerAsn(peerAsn: Number)

      /**
       * @param peerLivenessDetection The liveness detection protocol used for the BGP peer.
       * The requested liveness detection protocol for the BGP peer.
       *
       * * `bgp-keepalive` : The standard BGP keep alive mechanism (
       * [RFC4271](https://docs.aws.amazon.com/https://www.rfc-editor.org/rfc/rfc4271#page-21) ) that
       * is stable but may take longer to fail-over in cases of network impact or router failure.
       * * `bfd` : An additional Bidirectional Forwarding Detection (BFD) protocol (
       * [RFC5880](https://docs.aws.amazon.com/https://www.rfc-editor.org/rfc/rfc5880) ) that enables
       * fast failover by using more sensitive liveness detection.
       *
       * Defaults to `bgp-keepalive` .
       */
      public fun peerLivenessDetection(peerLivenessDetection: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnRouteServerPeer.BgpOptionsProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnRouteServerPeer.BgpOptionsProperty.builder()

      /**
       * @param peerAsn The Border Gateway Protocol (BGP) Autonomous System Number (ASN) for the
       * appliance.
       * Valid values are from 1 to 4294967295. We recommend using a private ASN in the 64512–65534
       * (16-bit ASN) or 4200000000–4294967294 (32-bit ASN) range.
       */
      override fun peerAsn(peerAsn: Number) {
        cdkBuilder.peerAsn(peerAsn)
      }

      /**
       * @param peerLivenessDetection The liveness detection protocol used for the BGP peer.
       * The requested liveness detection protocol for the BGP peer.
       *
       * * `bgp-keepalive` : The standard BGP keep alive mechanism (
       * [RFC4271](https://docs.aws.amazon.com/https://www.rfc-editor.org/rfc/rfc4271#page-21) ) that
       * is stable but may take longer to fail-over in cases of network impact or router failure.
       * * `bfd` : An additional Bidirectional Forwarding Detection (BFD) protocol (
       * [RFC5880](https://docs.aws.amazon.com/https://www.rfc-editor.org/rfc/rfc5880) ) that enables
       * fast failover by using more sensitive liveness detection.
       *
       * Defaults to `bgp-keepalive` .
       */
      override fun peerLivenessDetection(peerLivenessDetection: String) {
        cdkBuilder.peerLivenessDetection(peerLivenessDetection)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnRouteServerPeer.BgpOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnRouteServerPeer.BgpOptionsProperty,
    ) : CdkObject(cdkObject),
        BgpOptionsProperty {
      /**
       * The Border Gateway Protocol (BGP) Autonomous System Number (ASN) for the appliance.
       *
       * Valid values are from 1 to 4294967295. We recommend using a private ASN in the 64512–65534
       * (16-bit ASN) or 4200000000–4294967294 (32-bit ASN) range.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-routeserverpeer-bgpoptions.html#cfn-ec2-routeserverpeer-bgpoptions-peerasn)
       */
      override fun peerAsn(): Number? = unwrap(this).getPeerAsn()

      /**
       * The liveness detection protocol used for the BGP peer.
       *
       * The requested liveness detection protocol for the BGP peer.
       *
       * * `bgp-keepalive` : The standard BGP keep alive mechanism (
       * [RFC4271](https://docs.aws.amazon.com/https://www.rfc-editor.org/rfc/rfc4271#page-21) ) that
       * is stable but may take longer to fail-over in cases of network impact or router failure.
       * * `bfd` : An additional Bidirectional Forwarding Detection (BFD) protocol (
       * [RFC5880](https://docs.aws.amazon.com/https://www.rfc-editor.org/rfc/rfc5880) ) that enables
       * fast failover by using more sensitive liveness detection.
       *
       * Defaults to `bgp-keepalive` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-routeserverpeer-bgpoptions.html#cfn-ec2-routeserverpeer-bgpoptions-peerlivenessdetection)
       */
      override fun peerLivenessDetection(): String? = unwrap(this).getPeerLivenessDetection()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BgpOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnRouteServerPeer.BgpOptionsProperty):
          BgpOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? BgpOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: BgpOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnRouteServerPeer.BgpOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnRouteServerPeer.BgpOptionsProperty
    }
  }
}
