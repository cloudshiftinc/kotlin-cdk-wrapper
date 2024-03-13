package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class VpnConnectionBase internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.VpnConnectionBase,
) : Resource(cdkObject), IVpnConnection {
  public override fun customerGatewayAsn(): Number = unwrap(this).getCustomerGatewayAsn()

  public override fun customerGatewayId(): String = unwrap(this).getCustomerGatewayId()

  public override fun customerGatewayIp(): String = unwrap(this).getCustomerGatewayIp()

  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  public override fun metricTunnelDataIn(): Metric =
      unwrap(this).metricTunnelDataIn().let(Metric::wrap)

  public override fun metricTunnelDataIn(props: MetricOptions): Metric =
      unwrap(this).metricTunnelDataIn(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a408d4099c755aa5052825a697a1e09ed3c0922fb2e01c022a92ae8971f3cc41")
  public override fun metricTunnelDataIn(props: MetricOptions.Builder.() -> Unit): Metric =
      metricTunnelDataIn(MetricOptions(props))

  public override fun metricTunnelDataOut(): Metric =
      unwrap(this).metricTunnelDataOut().let(Metric::wrap)

  public override fun metricTunnelDataOut(props: MetricOptions): Metric =
      unwrap(this).metricTunnelDataOut(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2a0186808bc5d783adc386b6893f8cd28b7ae5632db2feac47a15f37f4b9f43f")
  public override fun metricTunnelDataOut(props: MetricOptions.Builder.() -> Unit): Metric =
      metricTunnelDataOut(MetricOptions(props))

  public override fun metricTunnelState(): Metric =
      unwrap(this).metricTunnelState().let(Metric::wrap)

  public override fun metricTunnelState(props: MetricOptions): Metric =
      unwrap(this).metricTunnelState(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a1beb32a9ea480a143d1145556689d9f3e16ee288165a9b93d39cc36626ae1f8")
  public override fun metricTunnelState(props: MetricOptions.Builder.() -> Unit): Metric =
      metricTunnelState(MetricOptions(props))

  public override fun vpnId(): String = unwrap(this).getVpnId()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.VpnConnectionBase,
  ) : VpnConnectionBase(cdkObject)

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpnConnectionBase):
        VpnConnectionBase = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpnConnectionBase):
        software.amazon.awscdk.services.ec2.VpnConnectionBase = (wrapped as Wrapper).cdkObject
  }
}
