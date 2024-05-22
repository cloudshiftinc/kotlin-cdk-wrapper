@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * SecretValue secretValue;
 * Vpc vpc;
 * VpnConnectionProps vpnConnectionProps = VpnConnectionProps.builder()
 * .ip("ip")
 * .vpc(vpc)
 * // the properties below are optional
 * .asn(123)
 * .staticRoutes(List.of("staticRoutes"))
 * .tunnelOptions(List.of(VpnTunnelOption.builder()
 * .preSharedKey("preSharedKey")
 * .preSharedKeySecret(secretValue)
 * .tunnelInsideCidr("tunnelInsideCidr")
 * .build()))
 * .build();
 * ```
 */
public interface VpnConnectionProps : VpnConnectionOptions {
  /**
   * The VPC to connect to.
   */
  public fun vpc(): IVpc

  /**
   * A builder for [VpnConnectionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param asn The ASN of the customer gateway.
     */
    public fun asn(asn: Number)

    /**
     * @param ip The ip address of the customer gateway. 
     */
    public fun ip(ip: String)

    /**
     * @param staticRoutes The static routes to be routed from the VPN gateway to the customer
     * gateway.
     */
    public fun staticRoutes(staticRoutes: List<String>)

    /**
     * @param staticRoutes The static routes to be routed from the VPN gateway to the customer
     * gateway.
     */
    public fun staticRoutes(vararg staticRoutes: String)

    /**
     * @param tunnelOptions The tunnel options for the VPN connection.
     * At most two elements (one per tunnel).
     * Duplicates not allowed.
     */
    public fun tunnelOptions(tunnelOptions: List<VpnTunnelOption>)

    /**
     * @param tunnelOptions The tunnel options for the VPN connection.
     * At most two elements (one per tunnel).
     * Duplicates not allowed.
     */
    public fun tunnelOptions(vararg tunnelOptions: VpnTunnelOption)

    /**
     * @param vpc The VPC to connect to. 
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VpnConnectionProps.Builder =
        software.amazon.awscdk.services.ec2.VpnConnectionProps.builder()

    /**
     * @param asn The ASN of the customer gateway.
     */
    override fun asn(asn: Number) {
      cdkBuilder.asn(asn)
    }

    /**
     * @param ip The ip address of the customer gateway. 
     */
    override fun ip(ip: String) {
      cdkBuilder.ip(ip)
    }

    /**
     * @param staticRoutes The static routes to be routed from the VPN gateway to the customer
     * gateway.
     */
    override fun staticRoutes(staticRoutes: List<String>) {
      cdkBuilder.staticRoutes(staticRoutes)
    }

    /**
     * @param staticRoutes The static routes to be routed from the VPN gateway to the customer
     * gateway.
     */
    override fun staticRoutes(vararg staticRoutes: String): Unit =
        staticRoutes(staticRoutes.toList())

    /**
     * @param tunnelOptions The tunnel options for the VPN connection.
     * At most two elements (one per tunnel).
     * Duplicates not allowed.
     */
    override fun tunnelOptions(tunnelOptions: List<VpnTunnelOption>) {
      cdkBuilder.tunnelOptions(tunnelOptions.map(VpnTunnelOption.Companion::unwrap))
    }

    /**
     * @param tunnelOptions The tunnel options for the VPN connection.
     * At most two elements (one per tunnel).
     * Duplicates not allowed.
     */
    override fun tunnelOptions(vararg tunnelOptions: VpnTunnelOption): Unit =
        tunnelOptions(tunnelOptions.toList())

    /**
     * @param vpc The VPC to connect to. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.VpnConnectionProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.VpnConnectionProps,
  ) : CdkObject(cdkObject), VpnConnectionProps {
    /**
     * The ASN of the customer gateway.
     *
     * Default: 65000
     */
    override fun asn(): Number? = unwrap(this).getAsn()

    /**
     * The ip address of the customer gateway.
     */
    override fun ip(): String = unwrap(this).getIp()

    /**
     * The static routes to be routed from the VPN gateway to the customer gateway.
     *
     * Default: Dynamic routing (BGP)
     */
    override fun staticRoutes(): List<String> = unwrap(this).getStaticRoutes() ?: emptyList()

    /**
     * The tunnel options for the VPN connection.
     *
     * At most two elements (one per tunnel).
     * Duplicates not allowed.
     *
     * Default: Amazon generated tunnel options
     */
    override fun tunnelOptions(): List<VpnTunnelOption> =
        unwrap(this).getTunnelOptions()?.map(VpnTunnelOption::wrap) ?: emptyList()

    /**
     * The VPC to connect to.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VpnConnectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpnConnectionProps):
        VpnConnectionProps = CdkObjectWrappers.wrap(cdkObject) as? VpnConnectionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpnConnectionProps):
        software.amazon.awscdk.services.ec2.VpnConnectionProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.VpnConnectionProps
  }
}
