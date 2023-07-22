@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancing

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.IConnectable
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol

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
@CdkDslMarker
public class LoadBalancerListenerDsl {
  private val cdkBuilder: LoadBalancerListener.Builder = LoadBalancerListener.builder()

  private val _allowConnectionsFrom: MutableList<IConnectable> = mutableListOf()

  private val _policyNames: MutableList<String> = mutableListOf()

  /**
   * @param allowConnectionsFrom Allow connections to the load balancer from the given set of
   * connection peers.
   * By default, connections will be allowed from anywhere. Set this to an empty list
   * to deny connections, or supply a custom list of peers to allow connections from
   * (IP ranges or security groups).
   */
  public fun allowConnectionsFrom(vararg allowConnectionsFrom: IConnectable) {
    _allowConnectionsFrom.addAll(listOf(*allowConnectionsFrom))
  }

  /**
   * @param allowConnectionsFrom Allow connections to the load balancer from the given set of
   * connection peers.
   * By default, connections will be allowed from anywhere. Set this to an empty list
   * to deny connections, or supply a custom list of peers to allow connections from
   * (IP ranges or security groups).
   */
  public fun allowConnectionsFrom(allowConnectionsFrom: Collection<IConnectable>) {
    _allowConnectionsFrom.addAll(allowConnectionsFrom)
  }

  /**
   * @param externalPort External listening port. 
   */
  public fun externalPort(externalPort: Number) {
    cdkBuilder.externalPort(externalPort)
  }

  /**
   * @param externalProtocol What public protocol to use for load balancing.
   * Either 'tcp', 'ssl', 'http' or 'https'.
   *
   * May be omitted if the external port is either 80 or 443.
   */
  public fun externalProtocol(externalProtocol: LoadBalancingProtocol) {
    cdkBuilder.externalProtocol(externalProtocol)
  }

  /**
   * @param internalPort Instance listening port.
   * Same as the externalPort if not specified.
   */
  public fun internalPort(internalPort: Number) {
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
  public fun internalProtocol(internalProtocol: LoadBalancingProtocol) {
    cdkBuilder.internalProtocol(internalProtocol)
  }

  /**
   * @param policyNames SSL policy names.
   */
  public fun policyNames(vararg policyNames: String) {
    _policyNames.addAll(listOf(*policyNames))
  }

  /**
   * @param policyNames SSL policy names.
   */
  public fun policyNames(policyNames: Collection<String>) {
    _policyNames.addAll(policyNames)
  }

  /**
   * @param sslCertificateArn the ARN of the SSL certificate.
   */
  public fun sslCertificateArn(sslCertificateArn: String) {
    cdkBuilder.sslCertificateArn(sslCertificateArn)
  }

  public fun build(): LoadBalancerListener {
    if(_allowConnectionsFrom.isNotEmpty()) cdkBuilder.allowConnectionsFrom(_allowConnectionsFrom)
    if(_policyNames.isNotEmpty()) cdkBuilder.policyNames(_policyNames)
    return cdkBuilder.build()
  }
}
