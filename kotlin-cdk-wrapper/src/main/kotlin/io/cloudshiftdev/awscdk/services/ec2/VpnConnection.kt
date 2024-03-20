@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a VPN Connection.
 *
 * Example:
 *
 * ```
 * // Across all tunnels in the account/region
 * Metric allDataOut = VpnConnection.metricAllTunnelDataOut();
 * // For a specific vpn connection
 * VpnConnection vpnConnection = vpc.addVpnConnection("Dynamic", VpnConnectionOptions.builder()
 * .ip("1.2.3.4")
 * .build());
 * Metric state = vpnConnection.metricTunnelState();
 * ```
 */
public open class VpnConnection internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.VpnConnection,
) : VpnConnectionBase(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: VpnConnectionProps,
  ) :
      this(software.amazon.awscdk.services.ec2.VpnConnection(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(VpnConnectionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: VpnConnectionProps.Builder.() -> Unit,
  ) : this(scope, id, VpnConnectionProps(props)
  )

  /**
   * The ASN of the customer gateway.
   */
  public override fun customerGatewayAsn(): Number = unwrap(this).getCustomerGatewayAsn()

  /**
   * The id of the customer gateway.
   */
  public override fun customerGatewayId(): String = unwrap(this).getCustomerGatewayId()

  /**
   * The ip address of the customer gateway.
   */
  public override fun customerGatewayIp(): String = unwrap(this).getCustomerGatewayIp()

  /**
   * The id of the VPN connection.
   */
  public override fun vpnId(): String = unwrap(this).getVpnId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.VpnConnection].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ASN of the customer gateway.
     *
     * Default: 65000
     *
     * @param asn The ASN of the customer gateway. 
     */
    public fun asn(asn: Number)

    /**
     * The ip address of the customer gateway.
     *
     * @param ip The ip address of the customer gateway. 
     */
    public fun ip(ip: String)

    /**
     * The static routes to be routed from the VPN gateway to the customer gateway.
     *
     * Default: Dynamic routing (BGP)
     *
     * @param staticRoutes The static routes to be routed from the VPN gateway to the customer
     * gateway. 
     */
    public fun staticRoutes(staticRoutes: List<String>)

    /**
     * The static routes to be routed from the VPN gateway to the customer gateway.
     *
     * Default: Dynamic routing (BGP)
     *
     * @param staticRoutes The static routes to be routed from the VPN gateway to the customer
     * gateway. 
     */
    public fun staticRoutes(vararg staticRoutes: String)

    /**
     * The tunnel options for the VPN connection.
     *
     * At most two elements (one per tunnel).
     * Duplicates not allowed.
     *
     * Default: Amazon generated tunnel options
     *
     * @param tunnelOptions The tunnel options for the VPN connection. 
     */
    public fun tunnelOptions(tunnelOptions: List<VpnTunnelOption>)

    /**
     * The tunnel options for the VPN connection.
     *
     * At most two elements (one per tunnel).
     * Duplicates not allowed.
     *
     * Default: Amazon generated tunnel options
     *
     * @param tunnelOptions The tunnel options for the VPN connection. 
     */
    public fun tunnelOptions(vararg tunnelOptions: VpnTunnelOption)

    /**
     * The VPC to connect to.
     *
     * @param vpc The VPC to connect to. 
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VpnConnection.Builder =
        software.amazon.awscdk.services.ec2.VpnConnection.Builder.create(scope, id)

    /**
     * The ASN of the customer gateway.
     *
     * Default: 65000
     *
     * @param asn The ASN of the customer gateway. 
     */
    override fun asn(asn: Number) {
      cdkBuilder.asn(asn)
    }

    /**
     * The ip address of the customer gateway.
     *
     * @param ip The ip address of the customer gateway. 
     */
    override fun ip(ip: String) {
      cdkBuilder.ip(ip)
    }

    /**
     * The static routes to be routed from the VPN gateway to the customer gateway.
     *
     * Default: Dynamic routing (BGP)
     *
     * @param staticRoutes The static routes to be routed from the VPN gateway to the customer
     * gateway. 
     */
    override fun staticRoutes(staticRoutes: List<String>) {
      cdkBuilder.staticRoutes(staticRoutes)
    }

    /**
     * The static routes to be routed from the VPN gateway to the customer gateway.
     *
     * Default: Dynamic routing (BGP)
     *
     * @param staticRoutes The static routes to be routed from the VPN gateway to the customer
     * gateway. 
     */
    override fun staticRoutes(vararg staticRoutes: String): Unit =
        staticRoutes(staticRoutes.toList())

    /**
     * The tunnel options for the VPN connection.
     *
     * At most two elements (one per tunnel).
     * Duplicates not allowed.
     *
     * Default: Amazon generated tunnel options
     *
     * @param tunnelOptions The tunnel options for the VPN connection. 
     */
    override fun tunnelOptions(tunnelOptions: List<VpnTunnelOption>) {
      cdkBuilder.tunnelOptions(tunnelOptions.map(VpnTunnelOption::unwrap))
    }

    /**
     * The tunnel options for the VPN connection.
     *
     * At most two elements (one per tunnel).
     * Duplicates not allowed.
     *
     * Default: Amazon generated tunnel options
     *
     * @param tunnelOptions The tunnel options for the VPN connection. 
     */
    override fun tunnelOptions(vararg tunnelOptions: VpnTunnelOption): Unit =
        tunnelOptions(tunnelOptions.toList())

    /**
     * The VPC to connect to.
     *
     * @param vpc The VPC to connect to. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.VpnConnection = cdkBuilder.build()
  }

  public companion object {
    public fun fromVpnConnectionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: VpnConnectionAttributes,
    ): IVpnConnection =
        software.amazon.awscdk.services.ec2.VpnConnection.fromVpnConnectionAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(VpnConnectionAttributes::unwrap)).let(IVpnConnection::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6bc1baf4cdaedeaa5eecd9cc606061ad7873b1bb912d32ae93071272f83b8bb2")
    public fun fromVpnConnectionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: VpnConnectionAttributes.Builder.() -> Unit,
    ): IVpnConnection = fromVpnConnectionAttributes(scope, id, VpnConnectionAttributes(attrs))

    public fun metricAll(metricName: String): Metric =
        software.amazon.awscdk.services.ec2.VpnConnection.metricAll(metricName).let(Metric::wrap)

    public fun metricAll(metricName: String, props: MetricOptions): Metric =
        software.amazon.awscdk.services.ec2.VpnConnection.metricAll(metricName,
        props.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc2edb7e8860d33b2c02a5d62b7557e31ca2fd399a100f3532bebaf81fa8a856")
    public fun metricAll(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
        metricAll(metricName, MetricOptions(props))

    public fun metricAllTunnelDataIn(): Metric =
        software.amazon.awscdk.services.ec2.VpnConnection.metricAllTunnelDataIn().let(Metric::wrap)

    public fun metricAllTunnelDataIn(props: MetricOptions): Metric =
        software.amazon.awscdk.services.ec2.VpnConnection.metricAllTunnelDataIn(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a092407d130c7cab3d0974bfeb2b4910d4ae00e1d8a67aa74bc33aa6d4216a62")
    public fun metricAllTunnelDataIn(props: MetricOptions.Builder.() -> Unit): Metric =
        metricAllTunnelDataIn(MetricOptions(props))

    public fun metricAllTunnelDataOut(): Metric =
        software.amazon.awscdk.services.ec2.VpnConnection.metricAllTunnelDataOut().let(Metric::wrap)

    public fun metricAllTunnelDataOut(props: MetricOptions): Metric =
        software.amazon.awscdk.services.ec2.VpnConnection.metricAllTunnelDataOut(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("93ffe4727bd68275e3dd616f9b320e41ab2c62ee36cf60b54423d2d721bef296")
    public fun metricAllTunnelDataOut(props: MetricOptions.Builder.() -> Unit): Metric =
        metricAllTunnelDataOut(MetricOptions(props))

    public fun metricAllTunnelState(): Metric =
        software.amazon.awscdk.services.ec2.VpnConnection.metricAllTunnelState().let(Metric::wrap)

    public fun metricAllTunnelState(props: MetricOptions): Metric =
        software.amazon.awscdk.services.ec2.VpnConnection.metricAllTunnelState(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea74a84f08419b85cbe4425224a306285099aa8445f837f5f4a51cdaa7021385")
    public fun metricAllTunnelState(props: MetricOptions.Builder.() -> Unit): Metric =
        metricAllTunnelState(MetricOptions(props))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): VpnConnection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return VpnConnection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpnConnection): VpnConnection =
        VpnConnection(cdkObject)

    internal fun unwrap(wrapped: VpnConnection): software.amazon.awscdk.services.ec2.VpnConnection =
        wrapped.cdkObject
  }
}
