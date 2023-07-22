@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicediscovery.DiscoveryType
import software.amazon.awscdk.services.servicediscovery.DnsRecordType
import software.amazon.awscdk.services.servicediscovery.INamespace
import software.amazon.awscdk.services.servicediscovery.RoutingPolicy
import software.amazon.awscdk.services.servicediscovery.ServiceAttributes

@CdkDslMarker
public class ServiceAttributesDsl {
  private val cdkBuilder: ServiceAttributes.Builder = ServiceAttributes.builder()

  /**
   * @param discoveryType the value to be set.
   */
  public fun discoveryType(discoveryType: DiscoveryType) {
    cdkBuilder.discoveryType(discoveryType)
  }

  /**
   * @param dnsRecordType the value to be set. 
   */
  public fun dnsRecordType(dnsRecordType: DnsRecordType) {
    cdkBuilder.dnsRecordType(dnsRecordType)
  }

  /**
   * @param namespace the value to be set. 
   */
  public fun namespace(namespace: INamespace) {
    cdkBuilder.namespace(namespace)
  }

  /**
   * @param routingPolicy the value to be set. 
   */
  public fun routingPolicy(routingPolicy: RoutingPolicy) {
    cdkBuilder.routingPolicy(routingPolicy)
  }

  /**
   * @param serviceArn the value to be set. 
   */
  public fun serviceArn(serviceArn: String) {
    cdkBuilder.serviceArn(serviceArn)
  }

  /**
   * @param serviceId the value to be set. 
   */
  public fun serviceId(serviceId: String) {
    cdkBuilder.serviceId(serviceId)
  }

  /**
   * @param serviceName the value to be set. 
   */
  public fun serviceName(serviceName: String) {
    cdkBuilder.serviceName(serviceName)
  }

  public fun build(): ServiceAttributes = cdkBuilder.build()
}
