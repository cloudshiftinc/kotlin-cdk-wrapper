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
public interface VirtualNodeProps : VirtualNodeBaseProps {
  /**
   * The Mesh which the VirtualNode belongs to.
   */
  public fun mesh(): IMesh

  /**
   * A builder for [VirtualNodeProps]
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
    @JvmName("565009054dc561f2646063fe7ba557fc12a3a37533c59e25a95e06664490d9a7")
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
     * @param mesh The Mesh which the VirtualNode belongs to. 
     */
    public fun mesh(mesh: IMesh)

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
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.VirtualNodeProps.Builder =
        software.amazon.awscdk.services.appmesh.VirtualNodeProps.builder()

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
    @JvmName("565009054dc561f2646063fe7ba557fc12a3a37533c59e25a95e06664490d9a7")
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
     * @param mesh The Mesh which the VirtualNode belongs to. 
     */
    override fun mesh(mesh: IMesh) {
      cdkBuilder.mesh(mesh.let(IMesh.Companion::unwrap))
    }

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

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualNodeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.VirtualNodeProps,
  ) : CdkObject(cdkObject),
      VirtualNodeProps {
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
     * The Mesh which the VirtualNode belongs to.
     */
    override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualNodeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualNodeProps):
        VirtualNodeProps = CdkObjectWrappers.wrap(cdkObject) as? VirtualNodeProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualNodeProps):
        software.amazon.awscdk.services.appmesh.VirtualNodeProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appmesh.VirtualNodeProps
  }
}
