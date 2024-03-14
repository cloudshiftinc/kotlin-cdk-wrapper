package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface VpnConnectionOptions {
  /**
   * The ASN of the customer gateway.
   *
   * Default: 65000
   */
  public fun asn(): Number? = unwrap(this).getAsn()

  /**
   * The ip address of the customer gateway.
   */
  public fun ip(): String

  /**
   * The static routes to be routed from the VPN gateway to the customer gateway.
   *
   * Default: Dynamic routing (BGP)
   */
  public fun staticRoutes(): List<String> = unwrap(this).getStaticRoutes() ?: emptyList()

  /**
   * The tunnel options for the VPN connection.
   *
   * At most two elements (one per tunnel).
   * Duplicates not allowed.
   *
   * Default: Amazon generated tunnel options
   */
  public fun tunnelOptions(): List<VpnTunnelOption> =
      unwrap(this).getTunnelOptions()?.map(VpnTunnelOption::wrap) ?: emptyList()

  /**
   * A builder for [VpnConnectionOptions]
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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VpnConnectionOptions.Builder =
        software.amazon.awscdk.services.ec2.VpnConnectionOptions.builder()

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
      cdkBuilder.tunnelOptions(tunnelOptions.map(VpnTunnelOption::unwrap))
    }

    /**
     * @param tunnelOptions The tunnel options for the VPN connection.
     * At most two elements (one per tunnel).
     * Duplicates not allowed.
     */
    override fun tunnelOptions(vararg tunnelOptions: VpnTunnelOption): Unit =
        tunnelOptions(tunnelOptions.toList())

    public fun build(): software.amazon.awscdk.services.ec2.VpnConnectionOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.VpnConnectionOptions,
  ) : VpnConnectionOptions {
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
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): VpnConnectionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpnConnectionOptions):
        VpnConnectionOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpnConnectionOptions):
        software.amazon.awscdk.services.ec2.VpnConnectionOptions = (wrapped as Wrapper).cdkObject
  }
}
