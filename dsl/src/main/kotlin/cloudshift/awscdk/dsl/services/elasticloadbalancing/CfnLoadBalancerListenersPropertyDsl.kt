@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancing

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer

@CdkDslMarker
public class CfnLoadBalancerListenersPropertyDsl {
  private val cdkBuilder: CfnLoadBalancer.ListenersProperty.Builder =
      CfnLoadBalancer.ListenersProperty.builder()

  private val _policyNames: MutableList<String> = mutableListOf()

  /**
   * @param instancePort The port on which the instance is listening. 
   */
  public fun instancePort(instancePort: String) {
    cdkBuilder.instancePort(instancePort)
  }

  /**
   * @param instanceProtocol The protocol to use for routing traffic to instances: HTTP, HTTPS, TCP,
   * or SSL.
   * If the front-end protocol is TCP or SSL, the back-end protocol must be TCP or SSL. If the
   * front-end protocol is HTTP or HTTPS, the back-end protocol must be HTTP or HTTPS.
   *
   * If there is another listener with the same `InstancePort` whose `InstanceProtocol` is secure,
   * (HTTPS or SSL), the listener's `InstanceProtocol` must also be secure.
   *
   * If there is another listener with the same `InstancePort` whose `InstanceProtocol` is HTTP or
   * TCP, the listener's `InstanceProtocol` must be HTTP or TCP.
   */
  public fun instanceProtocol(instanceProtocol: String) {
    cdkBuilder.instanceProtocol(instanceProtocol)
  }

  /**
   * @param loadBalancerPort The port on which the load balancer is listening. 
   * On EC2-VPC, you can specify any port from the range 1-65535. On EC2-Classic, you can specify
   * any port from the following list: 25, 80, 443, 465, 587, 1024-65535.
   */
  public fun loadBalancerPort(loadBalancerPort: String) {
    cdkBuilder.loadBalancerPort(loadBalancerPort)
  }

  /**
   * @param policyNames The names of the policies to associate with the listener.
   */
  public fun policyNames(vararg policyNames: String) {
    _policyNames.addAll(listOf(*policyNames))
  }

  /**
   * @param policyNames The names of the policies to associate with the listener.
   */
  public fun policyNames(policyNames: Collection<String>) {
    _policyNames.addAll(policyNames)
  }

  /**
   * @param protocol The load balancer transport protocol to use for routing: HTTP, HTTPS, TCP, or
   * SSL. 
   */
  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * @param sslCertificateId The Amazon Resource Name (ARN) of the server certificate.
   */
  public fun sslCertificateId(sslCertificateId: String) {
    cdkBuilder.sslCertificateId(sslCertificateId)
  }

  public fun build(): CfnLoadBalancer.ListenersProperty {
    if(_policyNames.isNotEmpty()) cdkBuilder.policyNames(_policyNames)
    return cdkBuilder.build()
  }
}
