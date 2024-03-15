@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancing

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Add a backend to the load balancer.
 *
 * Example:
 *
 * ```
 * IVpc vpc;
 * AutoScalingGroup myAutoScalingGroup;
 * LoadBalancer lb = LoadBalancer.Builder.create(this, "LB")
 * .vpc(vpc)
 * .internetFacing(true)
 * .healthCheck(HealthCheck.builder()
 * .port(80)
 * .build())
 * .build();
 * lb.addTarget(myAutoScalingGroup);
 * lb.addListener(LoadBalancerListener.builder()
 * .externalPort(80)
 * .build());
 * ```
 */
public interface LoadBalancerListener {
  /**
   * Allow connections to the load balancer from the given set of connection peers.
   *
   * By default, connections will be allowed from anywhere. Set this to an empty list
   * to deny connections, or supply a custom list of peers to allow connections from
   * (IP ranges or security groups).
   *
   * Default: Anywhere
   */
  public fun allowConnectionsFrom(): List<IConnectable> =
      unwrap(this).getAllowConnectionsFrom()?.map(IConnectable::wrap) ?: emptyList()

  /**
   * External listening port.
   */
  public fun externalPort(): Number

  /**
   * What public protocol to use for load balancing.
   *
   * Either 'tcp', 'ssl', 'http' or 'https'.
   *
   * May be omitted if the external port is either 80 or 443.
   */
  public fun externalProtocol(): LoadBalancingProtocol? =
      unwrap(this).getExternalProtocol()?.let(LoadBalancingProtocol::wrap)

  /**
   * Instance listening port.
   *
   * Same as the externalPort if not specified.
   *
   * Default: externalPort
   */
  public fun internalPort(): Number? = unwrap(this).getInternalPort()

  /**
   * What public protocol to use for load balancing.
   *
   * Either 'tcp', 'ssl', 'http' or 'https'.
   *
   * May be omitted if the internal port is either 80 or 443.
   *
   * The instance protocol is 'tcp' if the front-end protocol
   * is 'tcp' or 'ssl', the instance protocol is 'http' if the
   * front-end protocol is 'https'.
   */
  public fun internalProtocol(): LoadBalancingProtocol? =
      unwrap(this).getInternalProtocol()?.let(LoadBalancingProtocol::wrap)

  /**
   * SSL policy names.
   */
  public fun policyNames(): List<String> = unwrap(this).getPolicyNames() ?: emptyList()

  /**
   * the ARN of the SSL certificate.
   *
   * Default: - none
   */
  public fun sslCertificateArn(): String? = unwrap(this).getSslCertificateArn()

  /**
   * A builder for [LoadBalancerListener]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowConnectionsFrom Allow connections to the load balancer from the given set of
     * connection peers.
     * By default, connections will be allowed from anywhere. Set this to an empty list
     * to deny connections, or supply a custom list of peers to allow connections from
     * (IP ranges or security groups).
     */
    public fun allowConnectionsFrom(allowConnectionsFrom: List<IConnectable>)

    /**
     * @param allowConnectionsFrom Allow connections to the load balancer from the given set of
     * connection peers.
     * By default, connections will be allowed from anywhere. Set this to an empty list
     * to deny connections, or supply a custom list of peers to allow connections from
     * (IP ranges or security groups).
     */
    public fun allowConnectionsFrom(vararg allowConnectionsFrom: IConnectable)

    /**
     * @param externalPort External listening port. 
     */
    public fun externalPort(externalPort: Number)

    /**
     * @param externalProtocol What public protocol to use for load balancing.
     * Either 'tcp', 'ssl', 'http' or 'https'.
     *
     * May be omitted if the external port is either 80 or 443.
     */
    public fun externalProtocol(externalProtocol: LoadBalancingProtocol)

    /**
     * @param internalPort Instance listening port.
     * Same as the externalPort if not specified.
     */
    public fun internalPort(internalPort: Number)

    /**
     * @param internalProtocol What public protocol to use for load balancing.
     * Either 'tcp', 'ssl', 'http' or 'https'.
     *
     * May be omitted if the internal port is either 80 or 443.
     *
     * The instance protocol is 'tcp' if the front-end protocol
     * is 'tcp' or 'ssl', the instance protocol is 'http' if the
     * front-end protocol is 'https'.
     */
    public fun internalProtocol(internalProtocol: LoadBalancingProtocol)

    /**
     * @param policyNames SSL policy names.
     */
    public fun policyNames(policyNames: List<String>)

    /**
     * @param policyNames SSL policy names.
     */
    public fun policyNames(vararg policyNames: String)

    /**
     * @param sslCertificateArn the ARN of the SSL certificate.
     */
    public fun sslCertificateArn(sslCertificateArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener.Builder =
        software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener.builder()

    /**
     * @param allowConnectionsFrom Allow connections to the load balancer from the given set of
     * connection peers.
     * By default, connections will be allowed from anywhere. Set this to an empty list
     * to deny connections, or supply a custom list of peers to allow connections from
     * (IP ranges or security groups).
     */
    override fun allowConnectionsFrom(allowConnectionsFrom: List<IConnectable>) {
      cdkBuilder.allowConnectionsFrom(allowConnectionsFrom.map(IConnectable::unwrap))
    }

    /**
     * @param allowConnectionsFrom Allow connections to the load balancer from the given set of
     * connection peers.
     * By default, connections will be allowed from anywhere. Set this to an empty list
     * to deny connections, or supply a custom list of peers to allow connections from
     * (IP ranges or security groups).
     */
    override fun allowConnectionsFrom(vararg allowConnectionsFrom: IConnectable): Unit =
        allowConnectionsFrom(allowConnectionsFrom.toList())

    /**
     * @param externalPort External listening port. 
     */
    override fun externalPort(externalPort: Number) {
      cdkBuilder.externalPort(externalPort)
    }

    /**
     * @param externalProtocol What public protocol to use for load balancing.
     * Either 'tcp', 'ssl', 'http' or 'https'.
     *
     * May be omitted if the external port is either 80 or 443.
     */
    override fun externalProtocol(externalProtocol: LoadBalancingProtocol) {
      cdkBuilder.externalProtocol(externalProtocol.let(LoadBalancingProtocol::unwrap))
    }

    /**
     * @param internalPort Instance listening port.
     * Same as the externalPort if not specified.
     */
    override fun internalPort(internalPort: Number) {
      cdkBuilder.internalPort(internalPort)
    }

    /**
     * @param internalProtocol What public protocol to use for load balancing.
     * Either 'tcp', 'ssl', 'http' or 'https'.
     *
     * May be omitted if the internal port is either 80 or 443.
     *
     * The instance protocol is 'tcp' if the front-end protocol
     * is 'tcp' or 'ssl', the instance protocol is 'http' if the
     * front-end protocol is 'https'.
     */
    override fun internalProtocol(internalProtocol: LoadBalancingProtocol) {
      cdkBuilder.internalProtocol(internalProtocol.let(LoadBalancingProtocol::unwrap))
    }

    /**
     * @param policyNames SSL policy names.
     */
    override fun policyNames(policyNames: List<String>) {
      cdkBuilder.policyNames(policyNames)
    }

    /**
     * @param policyNames SSL policy names.
     */
    override fun policyNames(vararg policyNames: String): Unit = policyNames(policyNames.toList())

    /**
     * @param sslCertificateArn the ARN of the SSL certificate.
     */
    override fun sslCertificateArn(sslCertificateArn: String) {
      cdkBuilder.sslCertificateArn(sslCertificateArn)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener,
  ) : CdkObject(cdkObject), LoadBalancerListener {
    /**
     * Allow connections to the load balancer from the given set of connection peers.
     *
     * By default, connections will be allowed from anywhere. Set this to an empty list
     * to deny connections, or supply a custom list of peers to allow connections from
     * (IP ranges or security groups).
     *
     * Default: Anywhere
     */
    override fun allowConnectionsFrom(): List<IConnectable> =
        unwrap(this).getAllowConnectionsFrom()?.map(IConnectable::wrap) ?: emptyList()

    /**
     * External listening port.
     */
    override fun externalPort(): Number = unwrap(this).getExternalPort()

    /**
     * What public protocol to use for load balancing.
     *
     * Either 'tcp', 'ssl', 'http' or 'https'.
     *
     * May be omitted if the external port is either 80 or 443.
     */
    override fun externalProtocol(): LoadBalancingProtocol? =
        unwrap(this).getExternalProtocol()?.let(LoadBalancingProtocol::wrap)

    /**
     * Instance listening port.
     *
     * Same as the externalPort if not specified.
     *
     * Default: externalPort
     */
    override fun internalPort(): Number? = unwrap(this).getInternalPort()

    /**
     * What public protocol to use for load balancing.
     *
     * Either 'tcp', 'ssl', 'http' or 'https'.
     *
     * May be omitted if the internal port is either 80 or 443.
     *
     * The instance protocol is 'tcp' if the front-end protocol
     * is 'tcp' or 'ssl', the instance protocol is 'http' if the
     * front-end protocol is 'https'.
     */
    override fun internalProtocol(): LoadBalancingProtocol? =
        unwrap(this).getInternalProtocol()?.let(LoadBalancingProtocol::wrap)

    /**
     * SSL policy names.
     */
    override fun policyNames(): List<String> = unwrap(this).getPolicyNames() ?: emptyList()

    /**
     * the ARN of the SSL certificate.
     *
     * Default: - none
     */
    override fun sslCertificateArn(): String? = unwrap(this).getSslCertificateArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancerListener {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener):
        LoadBalancerListener = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoadBalancerListener):
        software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener
  }
}
