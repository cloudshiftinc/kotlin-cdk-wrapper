@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.constructs.Node
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

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.IVpnConnection,
  ) : CdkObject(cdkObject), IVpnConnection {
    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
    }

    /**
     * The ASN of the customer gateway.
     */
    override fun customerGatewayAsn(): Number = unwrap(this).getCustomerGatewayAsn()

    /**
     * The id of the customer gateway.
     */
    override fun customerGatewayId(): String = unwrap(this).getCustomerGatewayId()

    /**
     * The ip address of the customer gateway.
     */
    override fun customerGatewayIp(): String = unwrap(this).getCustomerGatewayIp()

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * Return the given named metric for this VPNConnection.
     *
     * @param metricName 
     * @param props
     */
    override fun metric(metricName: String): Metric =
        unwrap(this).metric(metricName).let(Metric::wrap)

    /**
     * Return the given named metric for this VPNConnection.
     *
     * @param metricName 
     * @param props
     */
    override fun metric(metricName: String, props: MetricOptions): Metric =
        unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Return the given named metric for this VPNConnection.
     *
     * @param metricName 
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
        metric(metricName, MetricOptions(props))

    /**
     * The bytes received through the VPN tunnel.
     *
     * Sum over 5 minutes
     *
     * @param props
     */
    override fun metricTunnelDataIn(): Metric = unwrap(this).metricTunnelDataIn().let(Metric::wrap)

    /**
     * The bytes received through the VPN tunnel.
     *
     * Sum over 5 minutes
     *
     * @param props
     */
    override fun metricTunnelDataIn(props: MetricOptions): Metric =
        unwrap(this).metricTunnelDataIn(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The bytes received through the VPN tunnel.
     *
     * Sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a408d4099c755aa5052825a697a1e09ed3c0922fb2e01c022a92ae8971f3cc41")
    override fun metricTunnelDataIn(props: MetricOptions.Builder.() -> Unit): Metric =
        metricTunnelDataIn(MetricOptions(props))

    /**
     * The bytes sent through the VPN tunnel.
     *
     * Sum over 5 minutes
     *
     * @param props
     */
    override fun metricTunnelDataOut(): Metric =
        unwrap(this).metricTunnelDataOut().let(Metric::wrap)

    /**
     * The bytes sent through the VPN tunnel.
     *
     * Sum over 5 minutes
     *
     * @param props
     */
    override fun metricTunnelDataOut(props: MetricOptions): Metric =
        unwrap(this).metricTunnelDataOut(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The bytes sent through the VPN tunnel.
     *
     * Sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2a0186808bc5d783adc386b6893f8cd28b7ae5632db2feac47a15f37f4b9f43f")
    override fun metricTunnelDataOut(props: MetricOptions.Builder.() -> Unit): Metric =
        metricTunnelDataOut(MetricOptions(props))

    /**
     * The state of the tunnel. 0 indicates DOWN and 1 indicates UP.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricTunnelState(): Metric = unwrap(this).metricTunnelState().let(Metric::wrap)

    /**
     * The state of the tunnel. 0 indicates DOWN and 1 indicates UP.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricTunnelState(props: MetricOptions): Metric =
        unwrap(this).metricTunnelState(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The state of the tunnel. 0 indicates DOWN and 1 indicates UP.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1beb32a9ea480a143d1145556689d9f3e16ee288165a9b93d39cc36626ae1f8")
    override fun metricTunnelState(props: MetricOptions.Builder.() -> Unit): Metric =
        metricTunnelState(MetricOptions(props))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    /**
     * The id of the VPN connection.
     */
    override fun vpnId(): String = unwrap(this).getVpnId()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IVpnConnection): IVpnConnection
        = CdkObjectWrappers.wrap(cdkObject) as? IVpnConnection ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IVpnConnection): software.amazon.awscdk.services.ec2.IVpnConnection
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IVpnConnection
  }
}
