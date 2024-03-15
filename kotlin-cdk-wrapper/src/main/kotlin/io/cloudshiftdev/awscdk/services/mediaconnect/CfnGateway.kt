@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The AWS::MediaConnect::Gateway resource is used to create a new gateway.
 *
 * AWS Elemental MediaConnect Gateway is a feature of MediaConnect that allows the deployment of
 * on-premises resources for transporting live video to and from the AWS Cloud. MediaConnect Gateway
 * allows you to contribute live video to the AWS Cloud from on-premises hardware, as well as
 * distribute live video from the AWS Cloud to your local data center.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
 * CfnGateway cfnGateway = CfnGateway.Builder.create(this, "MyCfnGateway")
 * .egressCidrBlocks(List.of("egressCidrBlocks"))
 * .name("name")
 * .networks(List.of(GatewayNetworkProperty.builder()
 * .cidrBlock("cidrBlock")
 * .name("name")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-gateway.html)
 */
public open class CfnGateway internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnGateway,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The Amazon Resource Name (ARN) of the gateway.
   */
  public open fun attrGatewayArn(): String = unwrap(this).getAttrGatewayArn()

  /**
   * The current state of the gateway.
   *
   * Possible values are: CREATING, ACTIVE, UPDATING, ERROR, DELETING, DELETED.
   */
  public open fun attrGatewayState(): String = unwrap(this).getAttrGatewayState()

  /**
   * The range of IP addresses that are allowed to contribute content or initiate output requests
   * for flows communicating with this gateway.
   */
  public open fun egressCidrBlocks(): List<String> = unwrap(this).getEgressCidrBlocks()

  /**
   * The range of IP addresses that are allowed to contribute content or initiate output requests
   * for flows communicating with this gateway.
   */
  public open fun egressCidrBlocks(`value`: List<String>) {
    unwrap(this).setEgressCidrBlocks(`value`)
  }

  /**
   * The range of IP addresses that are allowed to contribute content or initiate output requests
   * for flows communicating with this gateway.
   */
  public open fun egressCidrBlocks(vararg `value`: String): Unit =
      egressCidrBlocks(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the network.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the network.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The list of networks that you want to add.
   */
  public open fun networks(): Any = unwrap(this).getNetworks()

  /**
   * The list of networks that you want to add.
   */
  public open fun networks(`value`: IResolvable) {
    unwrap(this).setNetworks(`value`.let(IResolvable::unwrap))
  }

  /**
   * The list of networks that you want to add.
   */
  public open fun networks(__idx_ac66f0: List<Any>) {
    unwrap(this).setNetworks(__idx_ac66f0)
  }

  /**
   * The list of networks that you want to add.
   */
  public open fun networks(vararg __idx_ac66f0: Any): Unit = networks(__idx_ac66f0.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.mediaconnect.CfnGateway].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The range of IP addresses that are allowed to contribute content or initiate output requests
     * for flows communicating with this gateway.
     *
     * These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block;
     * for example, 10.0.0.0/16.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-gateway.html#cfn-mediaconnect-gateway-egresscidrblocks)
     * @param egressCidrBlocks The range of IP addresses that are allowed to contribute content or
     * initiate output requests for flows communicating with this gateway. 
     */
    public fun egressCidrBlocks(egressCidrBlocks: List<String>)

    /**
     * The range of IP addresses that are allowed to contribute content or initiate output requests
     * for flows communicating with this gateway.
     *
     * These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block;
     * for example, 10.0.0.0/16.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-gateway.html#cfn-mediaconnect-gateway-egresscidrblocks)
     * @param egressCidrBlocks The range of IP addresses that are allowed to contribute content or
     * initiate output requests for flows communicating with this gateway. 
     */
    public fun egressCidrBlocks(vararg egressCidrBlocks: String)

    /**
     * The name of the network.
     *
     * This name is used to reference the network and must be unique among networks in this gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-gateway.html#cfn-mediaconnect-gateway-name)
     * @param name The name of the network. 
     */
    public fun name(name: String)

    /**
     * The list of networks that you want to add.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-gateway.html#cfn-mediaconnect-gateway-networks)
     * @param networks The list of networks that you want to add. 
     */
    public fun networks(networks: IResolvable)

    /**
     * The list of networks that you want to add.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-gateway.html#cfn-mediaconnect-gateway-networks)
     * @param networks The list of networks that you want to add. 
     */
    public fun networks(networks: List<Any>)

    /**
     * The list of networks that you want to add.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-gateway.html#cfn-mediaconnect-gateway-networks)
     * @param networks The list of networks that you want to add. 
     */
    public fun networks(vararg networks: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconnect.CfnGateway.Builder =
        software.amazon.awscdk.services.mediaconnect.CfnGateway.Builder.create(scope, id)

    /**
     * The range of IP addresses that are allowed to contribute content or initiate output requests
     * for flows communicating with this gateway.
     *
     * These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block;
     * for example, 10.0.0.0/16.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-gateway.html#cfn-mediaconnect-gateway-egresscidrblocks)
     * @param egressCidrBlocks The range of IP addresses that are allowed to contribute content or
     * initiate output requests for flows communicating with this gateway. 
     */
    override fun egressCidrBlocks(egressCidrBlocks: List<String>) {
      cdkBuilder.egressCidrBlocks(egressCidrBlocks)
    }

    /**
     * The range of IP addresses that are allowed to contribute content or initiate output requests
     * for flows communicating with this gateway.
     *
     * These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block;
     * for example, 10.0.0.0/16.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-gateway.html#cfn-mediaconnect-gateway-egresscidrblocks)
     * @param egressCidrBlocks The range of IP addresses that are allowed to contribute content or
     * initiate output requests for flows communicating with this gateway. 
     */
    override fun egressCidrBlocks(vararg egressCidrBlocks: String): Unit =
        egressCidrBlocks(egressCidrBlocks.toList())

    /**
     * The name of the network.
     *
     * This name is used to reference the network and must be unique among networks in this gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-gateway.html#cfn-mediaconnect-gateway-name)
     * @param name The name of the network. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The list of networks that you want to add.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-gateway.html#cfn-mediaconnect-gateway-networks)
     * @param networks The list of networks that you want to add. 
     */
    override fun networks(networks: IResolvable) {
      cdkBuilder.networks(networks.let(IResolvable::unwrap))
    }

    /**
     * The list of networks that you want to add.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-gateway.html#cfn-mediaconnect-gateway-networks)
     * @param networks The list of networks that you want to add. 
     */
    override fun networks(networks: List<Any>) {
      cdkBuilder.networks(networks)
    }

    /**
     * The list of networks that you want to add.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-gateway.html#cfn-mediaconnect-gateway-networks)
     * @param networks The list of networks that you want to add. 
     */
    override fun networks(vararg networks: Any): Unit = networks(networks.toList())

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnGateway = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mediaconnect.CfnGateway.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGateway {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGateway(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnGateway):
        CfnGateway = CfnGateway(cdkObject)

    internal fun unwrap(wrapped: CfnGateway):
        software.amazon.awscdk.services.mediaconnect.CfnGateway = wrapped.cdkObject
  }

  /**
   * The network settings for a gateway.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * GatewayNetworkProperty gatewayNetworkProperty = GatewayNetworkProperty.builder()
   * .cidrBlock("cidrBlock")
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-gateway-gatewaynetwork.html)
   */
  public interface GatewayNetworkProperty {
    /**
     * A unique IP address range to use for this network.
     *
     * These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block;
     * for example, 10.0.0.0/16.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-gateway-gatewaynetwork.html#cfn-mediaconnect-gateway-gatewaynetwork-cidrblock)
     */
    public fun cidrBlock(): String

    /**
     * The name of the network.
     *
     * This name is used to reference the network and must be unique among networks in this gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-gateway-gatewaynetwork.html#cfn-mediaconnect-gateway-gatewaynetwork-name)
     */
    public fun name(): String

    /**
     * A builder for [GatewayNetworkProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cidrBlock A unique IP address range to use for this network. 
       * These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block;
       * for example, 10.0.0.0/16.
       */
      public fun cidrBlock(cidrBlock: String)

      /**
       * @param name The name of the network. 
       * This name is used to reference the network and must be unique among networks in this
       * gateway.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnGateway.GatewayNetworkProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnGateway.GatewayNetworkProperty.builder()

      /**
       * @param cidrBlock A unique IP address range to use for this network. 
       * These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block;
       * for example, 10.0.0.0/16.
       */
      override fun cidrBlock(cidrBlock: String) {
        cdkBuilder.cidrBlock(cidrBlock)
      }

      /**
       * @param name The name of the network. 
       * This name is used to reference the network and must be unique among networks in this
       * gateway.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnGateway.GatewayNetworkProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnGateway.GatewayNetworkProperty,
    ) : CdkObject(cdkObject), GatewayNetworkProperty {
      /**
       * A unique IP address range to use for this network.
       *
       * These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block;
       * for example, 10.0.0.0/16.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-gateway-gatewaynetwork.html#cfn-mediaconnect-gateway-gatewaynetwork-cidrblock)
       */
      override fun cidrBlock(): String = unwrap(this).getCidrBlock()

      /**
       * The name of the network.
       *
       * This name is used to reference the network and must be unique among networks in this
       * gateway.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-gateway-gatewaynetwork.html#cfn-mediaconnect-gateway-gatewaynetwork-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GatewayNetworkProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnGateway.GatewayNetworkProperty):
          GatewayNetworkProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GatewayNetworkProperty):
          software.amazon.awscdk.services.mediaconnect.CfnGateway.GatewayNetworkProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnGateway.GatewayNetworkProperty
    }
  }
}
