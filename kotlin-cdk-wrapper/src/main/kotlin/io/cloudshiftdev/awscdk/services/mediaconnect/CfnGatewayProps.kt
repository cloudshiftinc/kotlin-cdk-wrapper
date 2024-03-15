@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnGateway`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
 * CfnGatewayProps cfnGatewayProps = CfnGatewayProps.builder()
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
public interface CfnGatewayProps {
  /**
   * The range of IP addresses that are allowed to contribute content or initiate output requests
   * for flows communicating with this gateway.
   *
   * These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for
   * example, 10.0.0.0/16.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-gateway.html#cfn-mediaconnect-gateway-egresscidrblocks)
   */
  public fun egressCidrBlocks(): List<String>

  /**
   * The name of the network.
   *
   * This name is used to reference the network and must be unique among networks in this gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-gateway.html#cfn-mediaconnect-gateway-name)
   */
  public fun name(): String

  /**
   * The list of networks that you want to add.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-gateway.html#cfn-mediaconnect-gateway-networks)
   */
  public fun networks(): Any

  /**
   * A builder for [CfnGatewayProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param egressCidrBlocks The range of IP addresses that are allowed to contribute content or
     * initiate output requests for flows communicating with this gateway. 
     * These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block;
     * for example, 10.0.0.0/16.
     */
    public fun egressCidrBlocks(egressCidrBlocks: List<String>)

    /**
     * @param egressCidrBlocks The range of IP addresses that are allowed to contribute content or
     * initiate output requests for flows communicating with this gateway. 
     * These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block;
     * for example, 10.0.0.0/16.
     */
    public fun egressCidrBlocks(vararg egressCidrBlocks: String)

    /**
     * @param name The name of the network. 
     * This name is used to reference the network and must be unique among networks in this gateway.
     */
    public fun name(name: String)

    /**
     * @param networks The list of networks that you want to add. 
     */
    public fun networks(networks: IResolvable)

    /**
     * @param networks The list of networks that you want to add. 
     */
    public fun networks(networks: List<Any>)

    /**
     * @param networks The list of networks that you want to add. 
     */
    public fun networks(vararg networks: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconnect.CfnGatewayProps.Builder =
        software.amazon.awscdk.services.mediaconnect.CfnGatewayProps.builder()

    /**
     * @param egressCidrBlocks The range of IP addresses that are allowed to contribute content or
     * initiate output requests for flows communicating with this gateway. 
     * These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block;
     * for example, 10.0.0.0/16.
     */
    override fun egressCidrBlocks(egressCidrBlocks: List<String>) {
      cdkBuilder.egressCidrBlocks(egressCidrBlocks)
    }

    /**
     * @param egressCidrBlocks The range of IP addresses that are allowed to contribute content or
     * initiate output requests for flows communicating with this gateway. 
     * These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block;
     * for example, 10.0.0.0/16.
     */
    override fun egressCidrBlocks(vararg egressCidrBlocks: String): Unit =
        egressCidrBlocks(egressCidrBlocks.toList())

    /**
     * @param name The name of the network. 
     * This name is used to reference the network and must be unique among networks in this gateway.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param networks The list of networks that you want to add. 
     */
    override fun networks(networks: IResolvable) {
      cdkBuilder.networks(networks.let(IResolvable::unwrap))
    }

    /**
     * @param networks The list of networks that you want to add. 
     */
    override fun networks(networks: List<Any>) {
      cdkBuilder.networks(networks)
    }

    /**
     * @param networks The list of networks that you want to add. 
     */
    override fun networks(vararg networks: Any): Unit = networks(networks.toList())

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnGatewayProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnGatewayProps,
  ) : CdkObject(cdkObject), CfnGatewayProps {
    /**
     * The range of IP addresses that are allowed to contribute content or initiate output requests
     * for flows communicating with this gateway.
     *
     * These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block;
     * for example, 10.0.0.0/16.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-gateway.html#cfn-mediaconnect-gateway-egresscidrblocks)
     */
    override fun egressCidrBlocks(): List<String> = unwrap(this).getEgressCidrBlocks()

    /**
     * The name of the network.
     *
     * This name is used to reference the network and must be unique among networks in this gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-gateway.html#cfn-mediaconnect-gateway-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The list of networks that you want to add.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-gateway.html#cfn-mediaconnect-gateway-networks)
     */
    override fun networks(): Any = unwrap(this).getNetworks()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGatewayProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnGatewayProps):
        CfnGatewayProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGatewayProps):
        software.amazon.awscdk.services.mediaconnect.CfnGatewayProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediaconnect.CfnGatewayProps
  }
}
