@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ecs.ServiceConnectService

@CdkDslMarker
public class ServiceConnectServiceDsl {
  private val cdkBuilder: ServiceConnectService.Builder = ServiceConnectService.builder()

  /**
   * @param discoveryName Optionally specifies an intermediate dns name to register in the CloudMap
   * namespace.
   * This is required if you wish to use the same port mapping name in more than one service.
   */
  public fun discoveryName(discoveryName: String) {
    cdkBuilder.discoveryName(discoveryName)
  }

  /**
   * @param dnsName The terse DNS alias to use for this port mapping in the service connect mesh.
   * Service Connect-enabled clients will be able to reach this service at
   * http://dnsName:port.
   */
  public fun dnsName(dnsName: String) {
    cdkBuilder.dnsName(dnsName)
  }

  /**
   * @param ingressPortOverride Optional.
   * The port on the Service Connect agent container to use for traffic ingress to this service.
   */
  public fun ingressPortOverride(ingressPortOverride: Number) {
    cdkBuilder.ingressPortOverride(ingressPortOverride)
  }

  /**
   * @param port The port for clients to use to communicate with this service via Service Connect.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param portMappingName portMappingName specifies which port and protocol combination should be
   * used for this service connect service. 
   */
  public fun portMappingName(portMappingName: String) {
    cdkBuilder.portMappingName(portMappingName)
  }

  public fun build(): ServiceConnectService = cdkBuilder.build()
}
