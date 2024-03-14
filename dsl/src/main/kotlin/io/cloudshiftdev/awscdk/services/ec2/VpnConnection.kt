package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class VpnConnection internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.VpnConnection,
) : VpnConnectionBase(cdkObject) {
  public override fun customerGatewayAsn(): Number = unwrap(this).getCustomerGatewayAsn()

  public override fun customerGatewayId(): String = unwrap(this).getCustomerGatewayId()

  public override fun customerGatewayIp(): String = unwrap(this).getCustomerGatewayIp()

  public override fun vpnId(): String = unwrap(this).getVpnId()

  public interface Builder {
    public fun asn(asn: Number)

    public fun ip(ip: String)

    public fun staticRoutes(staticRoutes: List<String>)

    public fun staticRoutes(vararg staticRoutes: String)

    public fun tunnelOptions(tunnelOptions: List<VpnTunnelOption>)

    public fun tunnelOptions(vararg tunnelOptions: VpnTunnelOption)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VpnConnection.Builder =
        software.amazon.awscdk.services.ec2.VpnConnection.Builder.create(scope, id)

    override fun asn(asn: Number) {
      cdkBuilder.asn(asn)
    }

    override fun ip(ip: String) {
      cdkBuilder.ip(ip)
    }

    override fun staticRoutes(staticRoutes: List<String>) {
      cdkBuilder.staticRoutes(staticRoutes)
    }

    override fun staticRoutes(vararg staticRoutes: String): Unit =
        staticRoutes(staticRoutes.toList())

    override fun tunnelOptions(tunnelOptions: List<VpnTunnelOption>) {
      cdkBuilder.tunnelOptions(tunnelOptions.map(VpnTunnelOption::unwrap))
    }

    override fun tunnelOptions(vararg tunnelOptions: VpnTunnelOption): Unit =
        tunnelOptions(tunnelOptions.toList())

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.VpnConnection = cdkBuilder.build()
  }

  public companion object {
    public open fun fromVpnConnectionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: VpnConnectionAttributes,
    ): IVpnConnection =
        software.amazon.awscdk.services.ec2.VpnConnection.fromVpnConnectionAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(VpnConnectionAttributes::unwrap)).let(IVpnConnection::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6bc1baf4cdaedeaa5eecd9cc606061ad7873b1bb912d32ae93071272f83b8bb2")
    public open fun fromVpnConnectionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: VpnConnectionAttributes.Builder.() -> Unit,
    ): IVpnConnection = fromVpnConnectionAttributes(scope, id, VpnConnectionAttributes(attrs))

    public open fun metricAll(metricName: String): Metric =
        software.amazon.awscdk.services.ec2.VpnConnection.metricAll(metricName).let(Metric::wrap)

    public open fun metricAll(metricName: String, props: MetricOptions): Metric =
        software.amazon.awscdk.services.ec2.VpnConnection.metricAll(metricName,
        props.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc2edb7e8860d33b2c02a5d62b7557e31ca2fd399a100f3532bebaf81fa8a856")
    public open fun metricAll(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
        metricAll(metricName, MetricOptions(props))

    public open fun metricAllTunnelDataIn(): Metric =
        software.amazon.awscdk.services.ec2.VpnConnection.metricAllTunnelDataIn().let(Metric::wrap)

    public open fun metricAllTunnelDataIn(props: MetricOptions): Metric =
        software.amazon.awscdk.services.ec2.VpnConnection.metricAllTunnelDataIn(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a092407d130c7cab3d0974bfeb2b4910d4ae00e1d8a67aa74bc33aa6d4216a62")
    public open fun metricAllTunnelDataIn(props: MetricOptions.Builder.() -> Unit): Metric =
        metricAllTunnelDataIn(MetricOptions(props))

    public open fun metricAllTunnelDataOut(): Metric =
        software.amazon.awscdk.services.ec2.VpnConnection.metricAllTunnelDataOut().let(Metric::wrap)

    public open fun metricAllTunnelDataOut(props: MetricOptions): Metric =
        software.amazon.awscdk.services.ec2.VpnConnection.metricAllTunnelDataOut(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("93ffe4727bd68275e3dd616f9b320e41ab2c62ee36cf60b54423d2d721bef296")
    public open fun metricAllTunnelDataOut(props: MetricOptions.Builder.() -> Unit): Metric =
        metricAllTunnelDataOut(MetricOptions(props))

    public open fun metricAllTunnelState(): Metric =
        software.amazon.awscdk.services.ec2.VpnConnection.metricAllTunnelState().let(Metric::wrap)

    public open fun metricAllTunnelState(props: MetricOptions): Metric =
        software.amazon.awscdk.services.ec2.VpnConnection.metricAllTunnelState(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea74a84f08419b85cbe4425224a306285099aa8445f837f5f4a51cdaa7021385")
    public open fun metricAllTunnelState(props: MetricOptions.Builder.() -> Unit): Metric =
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
