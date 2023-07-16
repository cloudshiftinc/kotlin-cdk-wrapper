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

  public fun instancePort(instancePort: String) {
    cdkBuilder.instancePort(instancePort)
  }

  public fun instanceProtocol(instanceProtocol: String) {
    cdkBuilder.instanceProtocol(instanceProtocol)
  }

  public fun loadBalancerPort(loadBalancerPort: String) {
    cdkBuilder.loadBalancerPort(loadBalancerPort)
  }

  public fun policyNames(vararg policyNames: String) {
    _policyNames.addAll(listOf(*policyNames))
  }

  public fun policyNames(policyNames: Collection<String>) {
    _policyNames.addAll(policyNames)
  }

  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  public fun sslCertificateId(sslCertificateId: String) {
    cdkBuilder.sslCertificateId(sslCertificateId)
  }

  public fun build(): CfnLoadBalancer.ListenersProperty {
    if(_policyNames.isNotEmpty()) cdkBuilder.policyNames(_policyNames)
    return cdkBuilder.build()
  }
}
