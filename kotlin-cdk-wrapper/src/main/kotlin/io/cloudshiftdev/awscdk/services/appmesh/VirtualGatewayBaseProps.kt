@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Basic configuration properties for a VirtualGateway.
 *
 * Example:
 *
 * ```
 * Mesh mesh;
 * VirtualGateway gateway = mesh.addVirtualGateway("gateway", VirtualGatewayBaseProps.builder()
 * .accessLog(AccessLog.fromFilePath("/dev/stdout"))
 * .virtualGatewayName("virtualGateway")
 * .listeners(List.of(VirtualGatewayListener.http(HttpGatewayListenerOptions.builder()
 * .port(443)
 * .healthCheck(HealthCheck.http(HttpHealthCheckOptions.builder()
 * .interval(Duration.seconds(10))
 * .build()))
 * .build())))
 * .build());
 * ```
 */
public interface VirtualGatewayBaseProps {
  /**
   * Access Logging Configuration for the VirtualGateway.
   *
   * Default: - no access logging
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
   * Listeners for the VirtualGateway.
   *
   * Only one is supported.
   *
   * Default: - Single HTTP listener on port 8080
   */
  public fun listeners(): List<VirtualGatewayListener> =
      unwrap(this).getListeners()?.map(VirtualGatewayListener::wrap) ?: emptyList()

  /**
   * Name of the VirtualGateway.
   *
   * Default: - A name is automatically determined
   */
  public fun virtualGatewayName(): String? = unwrap(this).getVirtualGatewayName()

  /**
   * A builder for [VirtualGatewayBaseProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessLog Access Logging Configuration for the VirtualGateway.
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
    @JvmName("52834de467ff95484baeb289c6957eb35ad65d3eba7a50c12091f65cbaf6f3a1")
    public fun backendDefaults(backendDefaults: BackendDefaults.Builder.() -> Unit)

    /**
     * @param listeners Listeners for the VirtualGateway.
     * Only one is supported.
     */
    public fun listeners(listeners: List<VirtualGatewayListener>)

    /**
     * @param listeners Listeners for the VirtualGateway.
     * Only one is supported.
     */
    public fun listeners(vararg listeners: VirtualGatewayListener)

    /**
     * @param virtualGatewayName Name of the VirtualGateway.
     */
    public fun virtualGatewayName(virtualGatewayName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.VirtualGatewayBaseProps.Builder
        = software.amazon.awscdk.services.appmesh.VirtualGatewayBaseProps.builder()

    /**
     * @param accessLog Access Logging Configuration for the VirtualGateway.
     */
    override fun accessLog(accessLog: AccessLog) {
      cdkBuilder.accessLog(accessLog.let(AccessLog::unwrap))
    }

    /**
     * @param backendDefaults Default Configuration Virtual Node uses to communicate with Virtual
     * Service.
     */
    override fun backendDefaults(backendDefaults: BackendDefaults) {
      cdkBuilder.backendDefaults(backendDefaults.let(BackendDefaults::unwrap))
    }

    /**
     * @param backendDefaults Default Configuration Virtual Node uses to communicate with Virtual
     * Service.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52834de467ff95484baeb289c6957eb35ad65d3eba7a50c12091f65cbaf6f3a1")
    override fun backendDefaults(backendDefaults: BackendDefaults.Builder.() -> Unit): Unit =
        backendDefaults(BackendDefaults(backendDefaults))

    /**
     * @param listeners Listeners for the VirtualGateway.
     * Only one is supported.
     */
    override fun listeners(listeners: List<VirtualGatewayListener>) {
      cdkBuilder.listeners(listeners.map(VirtualGatewayListener::unwrap))
    }

    /**
     * @param listeners Listeners for the VirtualGateway.
     * Only one is supported.
     */
    override fun listeners(vararg listeners: VirtualGatewayListener): Unit =
        listeners(listeners.toList())

    /**
     * @param virtualGatewayName Name of the VirtualGateway.
     */
    override fun virtualGatewayName(virtualGatewayName: String) {
      cdkBuilder.virtualGatewayName(virtualGatewayName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualGatewayBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.VirtualGatewayBaseProps,
  ) : CdkObject(cdkObject), VirtualGatewayBaseProps {
    /**
     * Access Logging Configuration for the VirtualGateway.
     *
     * Default: - no access logging
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
     * Listeners for the VirtualGateway.
     *
     * Only one is supported.
     *
     * Default: - Single HTTP listener on port 8080
     */
    override fun listeners(): List<VirtualGatewayListener> =
        unwrap(this).getListeners()?.map(VirtualGatewayListener::wrap) ?: emptyList()

    /**
     * Name of the VirtualGateway.
     *
     * Default: - A name is automatically determined
     */
    override fun virtualGatewayName(): String? = unwrap(this).getVirtualGatewayName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualGatewayBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualGatewayBaseProps):
        VirtualGatewayBaseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualGatewayBaseProps):
        software.amazon.awscdk.services.appmesh.VirtualGatewayBaseProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.VirtualGatewayBaseProps
  }
}
