@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 *
 */
public interface IVpnConnection : IResource {
  /**
   * The ASN of the customer gateway.
   */
  public fun customerGatewayAsn(): Number

  /**
   * The id of the customer gateway.
   */
  public fun customerGatewayId(): String

  /**
   * The ip address of the customer gateway.
   */
  public fun customerGatewayIp(): String

  /**
   * Return the given named metric for this VPNConnection.
   *
   * @param metricName 
   * @param props
   */
  public fun metric(metricName: String): Metric

  /**
   * Return the given named metric for this VPNConnection.
   *
   * @param metricName 
   * @param props
   */
  public fun metric(metricName: String, props: MetricOptions): Metric

  /**
   * Return the given named metric for this VPNConnection.
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The bytes received through the VPN tunnel.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public fun metricTunnelDataIn(): Metric

  /**
   * The bytes received through the VPN tunnel.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public fun metricTunnelDataIn(props: MetricOptions): Metric

  /**
   * The bytes received through the VPN tunnel.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a408d4099c755aa5052825a697a1e09ed3c0922fb2e01c022a92ae8971f3cc41")
  public fun metricTunnelDataIn(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The bytes sent through the VPN tunnel.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public fun metricTunnelDataOut(): Metric

  /**
   * The bytes sent through the VPN tunnel.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public fun metricTunnelDataOut(props: MetricOptions): Metric

  /**
   * The bytes sent through the VPN tunnel.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2a0186808bc5d783adc386b6893f8cd28b7ae5632db2feac47a15f37f4b9f43f")
  public fun metricTunnelDataOut(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The state of the tunnel. 0 indicates DOWN and 1 indicates UP.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricTunnelState(): Metric

  /**
   * The state of the tunnel. 0 indicates DOWN and 1 indicates UP.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricTunnelState(props: MetricOptions): Metric

  /**
   * The state of the tunnel. 0 indicates DOWN and 1 indicates UP.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a1beb32a9ea480a143d1145556689d9f3e16ee288165a9b93d39cc36626ae1f8")
  public fun metricTunnelState(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The id of the VPN connection.
   */
  public fun vpnId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IVpnConnection): IVpnConnection
        = CdkObjectWrappers.wrap(cdkObject) as IVpnConnection

    internal fun unwrap(wrapped: IVpnConnection): software.amazon.awscdk.services.ec2.IVpnConnection
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IVpnConnection
  }
}
