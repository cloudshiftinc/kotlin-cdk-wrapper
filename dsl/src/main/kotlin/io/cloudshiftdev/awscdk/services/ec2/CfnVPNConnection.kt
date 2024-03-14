package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVPNConnection internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnection,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ID of the VPN connection.
   */
  public open fun attrVpnConnectionId(): String = unwrap(this).getAttrVpnConnectionId()

  /**
   * The ID of the customer gateway at your end of the VPN connection.
   */
  public open fun customerGatewayId(): String = unwrap(this).getCustomerGatewayId()

  /**
   * The ID of the customer gateway at your end of the VPN connection.
   */
  public open fun customerGatewayId(`value`: String) {
    unwrap(this).setCustomerGatewayId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Indicates whether the VPN connection uses static routes only.
   */
  public open fun staticRoutesOnly(): Any? = unwrap(this).getStaticRoutesOnly()

  /**
   * Indicates whether the VPN connection uses static routes only.
   */
  public open fun staticRoutesOnly(`value`: Boolean) {
    unwrap(this).setStaticRoutesOnly(`value`)
  }

  /**
   * Indicates whether the VPN connection uses static routes only.
   */
  public open fun staticRoutesOnly(`value`: IResolvable) {
    unwrap(this).setStaticRoutesOnly(`value`.let(IResolvable::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Any tags assigned to the VPN connection.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Any tags assigned to the VPN connection.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Any tags assigned to the VPN connection.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ID of the transit gateway associated with the VPN connection.
   */
  public open fun transitGatewayId(): String? = unwrap(this).getTransitGatewayId()

  /**
   * The ID of the transit gateway associated with the VPN connection.
   */
  public open fun transitGatewayId(`value`: String) {
    unwrap(this).setTransitGatewayId(`value`)
  }

  /**
   * The type of VPN connection.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of VPN connection.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * The ID of the virtual private gateway at the AWS side of the VPN connection.
   */
  public open fun vpnGatewayId(): String? = unwrap(this).getVpnGatewayId()

  /**
   * The ID of the virtual private gateway at the AWS side of the VPN connection.
   */
  public open fun vpnGatewayId(`value`: String) {
    unwrap(this).setVpnGatewayId(`value`)
  }

  /**
   * The tunnel options for the VPN connection.
   */
  public open fun vpnTunnelOptionsSpecifications(): Any? =
      unwrap(this).getVpnTunnelOptionsSpecifications()

  /**
   * The tunnel options for the VPN connection.
   */
  public open fun vpnTunnelOptionsSpecifications(`value`: IResolvable) {
    unwrap(this).setVpnTunnelOptionsSpecifications(`value`.let(IResolvable::unwrap))
  }

  /**
   * The tunnel options for the VPN connection.
   */
  public open fun vpnTunnelOptionsSpecifications(__idx_ac66f0: List<Any>) {
    unwrap(this).setVpnTunnelOptionsSpecifications(__idx_ac66f0)
  }

  /**
   * The tunnel options for the VPN connection.
   */
  public open fun vpnTunnelOptionsSpecifications(vararg __idx_ac66f0: Any): Unit =
      vpnTunnelOptionsSpecifications(__idx_ac66f0.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnVPNConnection].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the customer gateway at your end of the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-customergatewayid)
     * @param customerGatewayId The ID of the customer gateway at your end of the VPN connection. 
     */
    public fun customerGatewayId(customerGatewayId: String)

    /**
     * Indicates whether the VPN connection uses static routes only.
     *
     * Static routes must be used for devices that don't support BGP.
     *
     * If you are creating a VPN connection for a device that does not support Border Gateway
     * Protocol (BGP), you must specify `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-staticroutesonly)
     * @param staticRoutesOnly Indicates whether the VPN connection uses static routes only. 
     */
    public fun staticRoutesOnly(staticRoutesOnly: Boolean)

    /**
     * Indicates whether the VPN connection uses static routes only.
     *
     * Static routes must be used for devices that don't support BGP.
     *
     * If you are creating a VPN connection for a device that does not support Border Gateway
     * Protocol (BGP), you must specify `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-staticroutesonly)
     * @param staticRoutesOnly Indicates whether the VPN connection uses static routes only. 
     */
    public fun staticRoutesOnly(staticRoutesOnly: IResolvable)

    /**
     * Any tags assigned to the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-tags)
     * @param tags Any tags assigned to the VPN connection. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Any tags assigned to the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-tags)
     * @param tags Any tags assigned to the VPN connection. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ID of the transit gateway associated with the VPN connection.
     *
     * You must specify either `TransitGatewayId` or `VpnGatewayId` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-transitgatewayid)
     * @param transitGatewayId The ID of the transit gateway associated with the VPN connection. 
     */
    public fun transitGatewayId(transitGatewayId: String)

    /**
     * The type of VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-type)
     * @param type The type of VPN connection. 
     */
    public fun type(type: String)

    /**
     * The ID of the virtual private gateway at the AWS side of the VPN connection.
     *
     * You must specify either `TransitGatewayId` or `VpnGatewayId` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-vpngatewayid)
     * @param vpnGatewayId The ID of the virtual private gateway at the AWS side of the VPN
     * connection. 
     */
    public fun vpnGatewayId(vpnGatewayId: String)

    /**
     * The tunnel options for the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-vpntunneloptionsspecifications)
     * @param vpnTunnelOptionsSpecifications The tunnel options for the VPN connection. 
     */
    public fun vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications: IResolvable)

    /**
     * The tunnel options for the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-vpntunneloptionsspecifications)
     * @param vpnTunnelOptionsSpecifications The tunnel options for the VPN connection. 
     */
    public fun vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications: List<Any>)

    /**
     * The tunnel options for the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-vpntunneloptionsspecifications)
     * @param vpnTunnelOptionsSpecifications The tunnel options for the VPN connection. 
     */
    public fun vpnTunnelOptionsSpecifications(vararg vpnTunnelOptionsSpecifications: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPNConnection.Builder =
        software.amazon.awscdk.services.ec2.CfnVPNConnection.Builder.create(scope, id)

    /**
     * The ID of the customer gateway at your end of the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-customergatewayid)
     * @param customerGatewayId The ID of the customer gateway at your end of the VPN connection. 
     */
    override fun customerGatewayId(customerGatewayId: String) {
      cdkBuilder.customerGatewayId(customerGatewayId)
    }

    /**
     * Indicates whether the VPN connection uses static routes only.
     *
     * Static routes must be used for devices that don't support BGP.
     *
     * If you are creating a VPN connection for a device that does not support Border Gateway
     * Protocol (BGP), you must specify `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-staticroutesonly)
     * @param staticRoutesOnly Indicates whether the VPN connection uses static routes only. 
     */
    override fun staticRoutesOnly(staticRoutesOnly: Boolean) {
      cdkBuilder.staticRoutesOnly(staticRoutesOnly)
    }

    /**
     * Indicates whether the VPN connection uses static routes only.
     *
     * Static routes must be used for devices that don't support BGP.
     *
     * If you are creating a VPN connection for a device that does not support Border Gateway
     * Protocol (BGP), you must specify `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-staticroutesonly)
     * @param staticRoutesOnly Indicates whether the VPN connection uses static routes only. 
     */
    override fun staticRoutesOnly(staticRoutesOnly: IResolvable) {
      cdkBuilder.staticRoutesOnly(staticRoutesOnly.let(IResolvable::unwrap))
    }

    /**
     * Any tags assigned to the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-tags)
     * @param tags Any tags assigned to the VPN connection. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Any tags assigned to the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-tags)
     * @param tags Any tags assigned to the VPN connection. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ID of the transit gateway associated with the VPN connection.
     *
     * You must specify either `TransitGatewayId` or `VpnGatewayId` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-transitgatewayid)
     * @param transitGatewayId The ID of the transit gateway associated with the VPN connection. 
     */
    override fun transitGatewayId(transitGatewayId: String) {
      cdkBuilder.transitGatewayId(transitGatewayId)
    }

    /**
     * The type of VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-type)
     * @param type The type of VPN connection. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * The ID of the virtual private gateway at the AWS side of the VPN connection.
     *
     * You must specify either `TransitGatewayId` or `VpnGatewayId` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-vpngatewayid)
     * @param vpnGatewayId The ID of the virtual private gateway at the AWS side of the VPN
     * connection. 
     */
    override fun vpnGatewayId(vpnGatewayId: String) {
      cdkBuilder.vpnGatewayId(vpnGatewayId)
    }

    /**
     * The tunnel options for the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-vpntunneloptionsspecifications)
     * @param vpnTunnelOptionsSpecifications The tunnel options for the VPN connection. 
     */
    override fun vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications: IResolvable) {
      cdkBuilder.vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications.let(IResolvable::unwrap))
    }

    /**
     * The tunnel options for the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-vpntunneloptionsspecifications)
     * @param vpnTunnelOptionsSpecifications The tunnel options for the VPN connection. 
     */
    override fun vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications: List<Any>) {
      cdkBuilder.vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications)
    }

    /**
     * The tunnel options for the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-vpntunneloptionsspecifications)
     * @param vpnTunnelOptionsSpecifications The tunnel options for the VPN connection. 
     */
    override fun vpnTunnelOptionsSpecifications(vararg vpnTunnelOptionsSpecifications: Any): Unit =
        vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPNConnection = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPNConnection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPNConnection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnection):
        CfnVPNConnection = CfnVPNConnection(cdkObject)

    internal fun unwrap(wrapped: CfnVPNConnection):
        software.amazon.awscdk.services.ec2.CfnVPNConnection = wrapped.cdkObject
  }

  public interface VpnTunnelOptionsSpecificationProperty {
    /**
     * The pre-shared key (PSK) to establish initial authentication between the virtual private
     * gateway and customer gateway.
     *
     * Constraints: Allowed characters are alphanumeric characters, periods (.), and underscores
     * (_). Must be between 8 and 64 characters in length and cannot start with zero (0).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-presharedkey)
     */
    public fun preSharedKey(): String? = unwrap(this).getPreSharedKey()

    /**
     * The range of inside IP addresses for the tunnel.
     *
     * Any specified CIDR blocks must be unique across all VPN connections that use the same virtual
     * private gateway.
     *
     * Constraints: A size /30 CIDR block from the `169.254.0.0/16` range. The following CIDR blocks
     * are reserved and cannot be used:
     *
     * * `169.254.0.0/30`
     * * `169.254.1.0/30`
     * * `169.254.2.0/30`
     * * `169.254.3.0/30`
     * * `169.254.4.0/30`
     * * `169.254.5.0/30`
     * * `169.254.169.252/30`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-tunnelinsidecidr)
     */
    public fun tunnelInsideCidr(): String? = unwrap(this).getTunnelInsideCidr()

    /**
     * A builder for [VpnTunnelOptionsSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param preSharedKey The pre-shared key (PSK) to establish initial authentication between
       * the virtual private gateway and customer gateway.
       * Constraints: Allowed characters are alphanumeric characters, periods (.), and underscores
       * (_). Must be between 8 and 64 characters in length and cannot start with zero (0).
       */
      public fun preSharedKey(preSharedKey: String)

      /**
       * @param tunnelInsideCidr The range of inside IP addresses for the tunnel.
       * Any specified CIDR blocks must be unique across all VPN connections that use the same
       * virtual private gateway.
       *
       * Constraints: A size /30 CIDR block from the `169.254.0.0/16` range. The following CIDR
       * blocks are reserved and cannot be used:
       *
       * * `169.254.0.0/30`
       * * `169.254.1.0/30`
       * * `169.254.2.0/30`
       * * `169.254.3.0/30`
       * * `169.254.4.0/30`
       * * `169.254.5.0/30`
       * * `169.254.169.252/30`
       */
      public fun tunnelInsideCidr(tunnelInsideCidr: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelOptionsSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelOptionsSpecificationProperty.builder()

      /**
       * @param preSharedKey The pre-shared key (PSK) to establish initial authentication between
       * the virtual private gateway and customer gateway.
       * Constraints: Allowed characters are alphanumeric characters, periods (.), and underscores
       * (_). Must be between 8 and 64 characters in length and cannot start with zero (0).
       */
      override fun preSharedKey(preSharedKey: String) {
        cdkBuilder.preSharedKey(preSharedKey)
      }

      /**
       * @param tunnelInsideCidr The range of inside IP addresses for the tunnel.
       * Any specified CIDR blocks must be unique across all VPN connections that use the same
       * virtual private gateway.
       *
       * Constraints: A size /30 CIDR block from the `169.254.0.0/16` range. The following CIDR
       * blocks are reserved and cannot be used:
       *
       * * `169.254.0.0/30`
       * * `169.254.1.0/30`
       * * `169.254.2.0/30`
       * * `169.254.3.0/30`
       * * `169.254.4.0/30`
       * * `169.254.5.0/30`
       * * `169.254.169.252/30`
       */
      override fun tunnelInsideCidr(tunnelInsideCidr: String) {
        cdkBuilder.tunnelInsideCidr(tunnelInsideCidr)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelOptionsSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelOptionsSpecificationProperty,
    ) : CdkObject(cdkObject), VpnTunnelOptionsSpecificationProperty {
      /**
       * The pre-shared key (PSK) to establish initial authentication between the virtual private
       * gateway and customer gateway.
       *
       * Constraints: Allowed characters are alphanumeric characters, periods (.), and underscores
       * (_). Must be between 8 and 64 characters in length and cannot start with zero (0).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-presharedkey)
       */
      override fun preSharedKey(): String? = unwrap(this).getPreSharedKey()

      /**
       * The range of inside IP addresses for the tunnel.
       *
       * Any specified CIDR blocks must be unique across all VPN connections that use the same
       * virtual private gateway.
       *
       * Constraints: A size /30 CIDR block from the `169.254.0.0/16` range. The following CIDR
       * blocks are reserved and cannot be used:
       *
       * * `169.254.0.0/30`
       * * `169.254.1.0/30`
       * * `169.254.2.0/30`
       * * `169.254.3.0/30`
       * * `169.254.4.0/30`
       * * `169.254.5.0/30`
       * * `169.254.169.252/30`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-tunnelinsidecidr)
       */
      override fun tunnelInsideCidr(): String? = unwrap(this).getTunnelInsideCidr()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          VpnTunnelOptionsSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelOptionsSpecificationProperty):
          VpnTunnelOptionsSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpnTunnelOptionsSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelOptionsSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelOptionsSpecificationProperty
    }
  }
}
