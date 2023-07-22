@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appmesh.AccessLog
import software.amazon.awscdk.services.appmesh.Backend
import software.amazon.awscdk.services.appmesh.BackendDefaults
import software.amazon.awscdk.services.appmesh.IMesh
import software.amazon.awscdk.services.appmesh.ServiceDiscovery
import software.amazon.awscdk.services.appmesh.VirtualNodeListener
import software.amazon.awscdk.services.appmesh.VirtualNodeProps

/**
 * The properties used when creating a new VirtualNode.
 *
 * Example:
 *
 * ```
 * Mesh mesh;
 * Service service;
 * VirtualNode node = VirtualNode.Builder.create(this, "node")
 * .mesh(mesh)
 * .serviceDiscovery(ServiceDiscovery.cloudMap(service))
 * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
 * .port(8080)
 * .healthCheck(HealthCheck.http(HttpHealthCheckOptions.builder()
 * .healthyThreshold(3)
 * .interval(Duration.seconds(5))
 * .path("/ping")
 * .timeout(Duration.seconds(2))
 * .unhealthyThreshold(2)
 * .build()))
 * .timeout(HttpTimeout.builder()
 * .idle(Duration.seconds(5))
 * .build())
 * .build())))
 * .backendDefaults(BackendDefaults.builder()
 * .tlsClientPolicy(TlsClientPolicy.builder()
 * .validation(TlsValidation.builder()
 * .trust(TlsValidationTrust.file("/keys/local_cert_chain.pem"))
 * .build())
 * .build())
 * .build())
 * .accessLog(AccessLog.fromFilePath("/dev/stdout"))
 * .build();
 * Tags.of(node).add("Environment", "Dev");
 * ```
 */
@CdkDslMarker
public class VirtualNodePropsDsl {
  private val cdkBuilder: VirtualNodeProps.Builder = VirtualNodeProps.builder()

  private val _backends: MutableList<Backend> = mutableListOf()

  private val _listeners: MutableList<VirtualNodeListener> = mutableListOf()

  /**
   * @param accessLog Access Logging Configuration for the virtual node.
   */
  public fun accessLog(accessLog: AccessLog) {
    cdkBuilder.accessLog(accessLog)
  }

  /**
   * @param backendDefaults Default Configuration Virtual Node uses to communicate with Virtual
   * Service.
   */
  public fun backendDefaults(backendDefaults: BackendDefaultsDsl.() -> Unit = {}) {
    val builder = BackendDefaultsDsl()
    builder.apply(backendDefaults)
    cdkBuilder.backendDefaults(builder.build())
  }

  /**
   * @param backendDefaults Default Configuration Virtual Node uses to communicate with Virtual
   * Service.
   */
  public fun backendDefaults(backendDefaults: BackendDefaults) {
    cdkBuilder.backendDefaults(backendDefaults)
  }

  /**
   * @param backends Virtual Services that this is node expected to send outbound traffic to.
   */
  public fun backends(vararg backends: Backend) {
    _backends.addAll(listOf(*backends))
  }

  /**
   * @param backends Virtual Services that this is node expected to send outbound traffic to.
   */
  public fun backends(backends: Collection<Backend>) {
    _backends.addAll(backends)
  }

  /**
   * @param listeners Initial listener for the virtual node.
   */
  public fun listeners(vararg listeners: VirtualNodeListener) {
    _listeners.addAll(listOf(*listeners))
  }

  /**
   * @param listeners Initial listener for the virtual node.
   */
  public fun listeners(listeners: Collection<VirtualNodeListener>) {
    _listeners.addAll(listeners)
  }

  /**
   * @param mesh The Mesh which the VirtualNode belongs to. 
   */
  public fun mesh(mesh: IMesh) {
    cdkBuilder.mesh(mesh)
  }

  /**
   * @param serviceDiscovery Defines how upstream clients will discover this VirtualNode.
   */
  public fun serviceDiscovery(serviceDiscovery: ServiceDiscovery) {
    cdkBuilder.serviceDiscovery(serviceDiscovery)
  }

  /**
   * @param virtualNodeName The name of the VirtualNode.
   */
  public fun virtualNodeName(virtualNodeName: String) {
    cdkBuilder.virtualNodeName(virtualNodeName)
  }

  public fun build(): VirtualNodeProps {
    if(_backends.isNotEmpty()) cdkBuilder.backends(_backends)
    if(_listeners.isNotEmpty()) cdkBuilder.listeners(_listeners)
    return cdkBuilder.build()
  }
}
