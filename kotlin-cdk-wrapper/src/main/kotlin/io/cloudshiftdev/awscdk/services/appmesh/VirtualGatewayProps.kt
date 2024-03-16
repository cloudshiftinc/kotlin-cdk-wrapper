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
 * Properties used when creating a new VirtualGateway.
 *
 * Example:
 *
 * ```
 * Mesh mesh;
 * String certificateAuthorityArn =
 * "arn:aws:acm-pca:us-east-1:123456789012:certificate-authority/12345678-1234-1234-1234-123456789012";
 * VirtualGateway gateway = VirtualGateway.Builder.create(this, "gateway")
 * .mesh(mesh)
 * .listeners(List.of(VirtualGatewayListener.http(HttpGatewayListenerOptions.builder()
 * .port(443)
 * .healthCheck(HealthCheck.http(HttpHealthCheckOptions.builder()
 * .interval(Duration.seconds(10))
 * .build()))
 * .build())))
 * .backendDefaults(BackendDefaults.builder()
 * .tlsClientPolicy(TlsClientPolicy.builder()
 * .ports(List.of(8080, 8081))
 * .validation(TlsValidation.builder()
 * .trust(TlsValidationTrust.acm(List.of(CertificateAuthority.fromCertificateAuthorityArn(this,
 * "certificate", certificateAuthorityArn))))
 * .build())
 * .build())
 * .build())
 * .accessLog(AccessLog.fromFilePath("/dev/stdout"))
 * .virtualGatewayName("virtualGateway")
 * .build();
 * ```
 */
public interface VirtualGatewayProps : VirtualGatewayBaseProps {
  /**
   * The Mesh which the VirtualGateway belongs to.
   */
  public fun mesh(): IMesh

  /**
   * A builder for [VirtualGatewayProps]
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
    @JvmName("c1ba730ea4d381fc2d0cb67641aac5fa704de55539f2c624d557a0e35a87b10a")
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
     * @param mesh The Mesh which the VirtualGateway belongs to. 
     */
    public fun mesh(mesh: IMesh)

    /**
     * @param virtualGatewayName Name of the VirtualGateway.
     */
    public fun virtualGatewayName(virtualGatewayName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.VirtualGatewayProps.Builder =
        software.amazon.awscdk.services.appmesh.VirtualGatewayProps.builder()

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
    @JvmName("c1ba730ea4d381fc2d0cb67641aac5fa704de55539f2c624d557a0e35a87b10a")
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
     * @param mesh The Mesh which the VirtualGateway belongs to. 
     */
    override fun mesh(mesh: IMesh) {
      cdkBuilder.mesh(mesh.let(IMesh::unwrap))
    }

    /**
     * @param virtualGatewayName Name of the VirtualGateway.
     */
    override fun virtualGatewayName(virtualGatewayName: String) {
      cdkBuilder.virtualGatewayName(virtualGatewayName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualGatewayProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.VirtualGatewayProps,
  ) : CdkObject(cdkObject), VirtualGatewayProps {
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
     * The Mesh which the VirtualGateway belongs to.
     */
    override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

    /**
     * Name of the VirtualGateway.
     *
     * Default: - A name is automatically determined
     */
    override fun virtualGatewayName(): String? = unwrap(this).getVirtualGatewayName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualGatewayProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualGatewayProps):
        VirtualGatewayProps = CdkObjectWrappers.wrap(cdkObject) as VirtualGatewayProps

    internal fun unwrap(wrapped: VirtualGatewayProps):
        software.amazon.awscdk.services.appmesh.VirtualGatewayProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.VirtualGatewayProps
  }
}
