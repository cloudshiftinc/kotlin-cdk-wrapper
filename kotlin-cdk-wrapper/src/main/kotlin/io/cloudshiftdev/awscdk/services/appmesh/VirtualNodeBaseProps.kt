@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Basic configuration properties for a VirtualNode.
 *
 * Example:
 *
 * ```
 * Mesh mesh;
 * Vpc vpc = new Vpc(this, "vpc");
 * PrivateDnsNamespace namespace = PrivateDnsNamespace.Builder.create(this, "test-namespace")
 * .vpc(vpc)
 * .name("domain.local")
 * .build();
 * Service service = namespace.createService("Svc");
 * VirtualNode node = mesh.addVirtualNode("virtual-node", VirtualNodeBaseProps.builder()
 * .serviceDiscovery(ServiceDiscovery.cloudMap(service))
 * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
 * .port(8081)
 * .healthCheck(HealthCheck.http(HttpHealthCheckOptions.builder()
 * .healthyThreshold(3)
 * .interval(Duration.seconds(5)) // minimum
 * .path("/health-check-path")
 * .timeout(Duration.seconds(2)) // minimum
 * .unhealthyThreshold(2)
 * .build()))
 * .build())))
 * .accessLog(AccessLog.fromFilePath("/dev/stdout"))
 * .build());
 * ```
 */
public interface VirtualNodeBaseProps {
  /**
   * Access Logging Configuration for the virtual node.
   *
   * Default: - No access logging
   */
  public fun accessLog(): AccessLog? = unwrap(this).getAccessLog()?.let(AccessLog::wrap)

  /**
   * Default Configuration Virtual Node uses to communicate with Virtual Service.
   *
   * Default: - No Config
   */
  public fun backendDefaults(): BackendDefaults? =
      unwrap(this).getBackendDefaults()?.let(BackendDefaults::wrap)

  /**
   * Virtual Services that this is node expected to send outbound traffic to.
   *
   * Default: - No backends
   */
  public fun backends(): List<Backend> = unwrap(this).getBackends()?.map(Backend::wrap) ?:
      emptyList()

  /**
   * Initial listener for the virtual node.
   *
   * Default: - No listeners
   */
  public fun listeners(): List<VirtualNodeListener> =
      unwrap(this).getListeners()?.map(VirtualNodeListener::wrap) ?: emptyList()

  /**
   * Defines how upstream clients will discover this VirtualNode.
   *
   * Default: - No Service Discovery
   */
  public fun serviceDiscovery(): ServiceDiscovery? =
      unwrap(this).getServiceDiscovery()?.let(ServiceDiscovery::wrap)

  /**
   * The name of the VirtualNode.
   *
   * Default: - A name is automatically determined
   */
  public fun virtualNodeName(): String? = unwrap(this).getVirtualNodeName()

  /**
   * A builder for [VirtualNodeBaseProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessLog Access Logging Configuration for the virtual node.
     */
    public fun accessLog(accessLog: AccessLog)

    /**
     * @param backendDefaults Default Configuration Virtual Node uses to communicate with Virtual
     * Service.
     */
    public fun backendDefaults(backendDefaults: BackendDefaults)

    /**
     * @param backendDefaults Default Configuration Virtual Node uses to communicate with Virtual
     * Service.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f27f52f1a61b325e09aeeb9cc5b3b56911be4380660857da24f790913fcc40e1")
    public fun backendDefaults(backendDefaults: BackendDefaults.Builder.() -> Unit)

    /**
     * @param backends Virtual Services that this is node expected to send outbound traffic to.
     */
    public fun backends(backends: List<Backend>)

    /**
     * @param backends Virtual Services that this is node expected to send outbound traffic to.
     */
    public fun backends(vararg backends: Backend)

    /**
     * @param listeners Initial listener for the virtual node.
     */
    public fun listeners(listeners: List<VirtualNodeListener>)

    /**
     * @param listeners Initial listener for the virtual node.
     */
    public fun listeners(vararg listeners: VirtualNodeListener)

    /**
     * @param serviceDiscovery Defines how upstream clients will discover this VirtualNode.
     */
    public fun serviceDiscovery(serviceDiscovery: ServiceDiscovery)

    /**
     * @param virtualNodeName The name of the VirtualNode.
     */
    public fun virtualNodeName(virtualNodeName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.VirtualNodeBaseProps.Builder =
        software.amazon.awscdk.services.appmesh.VirtualNodeBaseProps.builder()

    /**
     * @param accessLog Access Logging Configuration for the virtual node.
     */
    override fun accessLog(accessLog: AccessLog) {
      cdkBuilder.accessLog(accessLog.let(AccessLog.Companion::unwrap))
    }

    /**
     * @param backendDefaults Default Configuration Virtual Node uses to communicate with Virtual
     * Service.
     */
    override fun backendDefaults(backendDefaults: BackendDefaults) {
      cdkBuilder.backendDefaults(backendDefaults.let(BackendDefaults.Companion::unwrap))
    }

    /**
     * @param backendDefaults Default Configuration Virtual Node uses to communicate with Virtual
     * Service.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f27f52f1a61b325e09aeeb9cc5b3b56911be4380660857da24f790913fcc40e1")
    override fun backendDefaults(backendDefaults: BackendDefaults.Builder.() -> Unit): Unit =
        backendDefaults(BackendDefaults(backendDefaults))

    /**
     * @param backends Virtual Services that this is node expected to send outbound traffic to.
     */
    override fun backends(backends: List<Backend>) {
      cdkBuilder.backends(backends.map(Backend.Companion::unwrap))
    }

    /**
     * @param backends Virtual Services that this is node expected to send outbound traffic to.
     */
    override fun backends(vararg backends: Backend): Unit = backends(backends.toList())

    /**
     * @param listeners Initial listener for the virtual node.
     */
    override fun listeners(listeners: List<VirtualNodeListener>) {
      cdkBuilder.listeners(listeners.map(VirtualNodeListener.Companion::unwrap))
    }

    /**
     * @param listeners Initial listener for the virtual node.
     */
    override fun listeners(vararg listeners: VirtualNodeListener): Unit =
        listeners(listeners.toList())

    /**
     * @param serviceDiscovery Defines how upstream clients will discover this VirtualNode.
     */
    override fun serviceDiscovery(serviceDiscovery: ServiceDiscovery) {
      cdkBuilder.serviceDiscovery(serviceDiscovery.let(ServiceDiscovery.Companion::unwrap))
    }

    /**
     * @param virtualNodeName The name of the VirtualNode.
     */
    override fun virtualNodeName(virtualNodeName: String) {
      cdkBuilder.virtualNodeName(virtualNodeName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualNodeBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.VirtualNodeBaseProps,
  ) : CdkObject(cdkObject),
      VirtualNodeBaseProps {
    /**
     * Access Logging Configuration for the virtual node.
     *
     * Default: - No access logging
     */
    override fun accessLog(): AccessLog? = unwrap(this).getAccessLog()?.let(AccessLog::wrap)

    /**
     * Default Configuration Virtual Node uses to communicate with Virtual Service.
     *
     * Default: - No Config
     */
    override fun backendDefaults(): BackendDefaults? =
        unwrap(this).getBackendDefaults()?.let(BackendDefaults::wrap)

    /**
     * Virtual Services that this is node expected to send outbound traffic to.
     *
     * Default: - No backends
     */
    override fun backends(): List<Backend> = unwrap(this).getBackends()?.map(Backend::wrap) ?:
        emptyList()

    /**
     * Initial listener for the virtual node.
     *
     * Default: - No listeners
     */
    override fun listeners(): List<VirtualNodeListener> =
        unwrap(this).getListeners()?.map(VirtualNodeListener::wrap) ?: emptyList()

    /**
     * Defines how upstream clients will discover this VirtualNode.
     *
     * Default: - No Service Discovery
     */
    override fun serviceDiscovery(): ServiceDiscovery? =
        unwrap(this).getServiceDiscovery()?.let(ServiceDiscovery::wrap)

    /**
     * The name of the VirtualNode.
     *
     * Default: - A name is automatically determined
     */
    override fun virtualNodeName(): String? = unwrap(this).getVirtualNodeName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualNodeBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualNodeBaseProps):
        VirtualNodeBaseProps = CdkObjectWrappers.wrap(cdkObject) as? VirtualNodeBaseProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualNodeBaseProps):
        software.amazon.awscdk.services.appmesh.VirtualNodeBaseProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.VirtualNodeBaseProps
  }
}
