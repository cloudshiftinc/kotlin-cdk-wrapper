@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Represents timeouts for HTTP protocols.
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
public interface HttpTimeout {
  /**
   * Represents an idle timeout.
   *
   * The amount of time that a connection may be idle.
   *
   * Default: - none
   */
  public fun idle(): Duration? = unwrap(this).getIdle()?.let(Duration::wrap)

  /**
   * Represents per request timeout.
   *
   * Default: - 15 s
   */
  public fun perRequest(): Duration? = unwrap(this).getPerRequest()?.let(Duration::wrap)

  /**
   * A builder for [HttpTimeout]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param idle Represents an idle timeout.
     * The amount of time that a connection may be idle.
     */
    public fun idle(idle: Duration)

    /**
     * @param perRequest Represents per request timeout.
     */
    public fun perRequest(perRequest: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.HttpTimeout.Builder =
        software.amazon.awscdk.services.appmesh.HttpTimeout.builder()

    /**
     * @param idle Represents an idle timeout.
     * The amount of time that a connection may be idle.
     */
    override fun idle(idle: Duration) {
      cdkBuilder.idle(idle.let(Duration::unwrap))
    }

    /**
     * @param perRequest Represents per request timeout.
     */
    override fun perRequest(perRequest: Duration) {
      cdkBuilder.perRequest(perRequest.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.HttpTimeout = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.HttpTimeout,
  ) : CdkObject(cdkObject), HttpTimeout {
    /**
     * Represents an idle timeout.
     *
     * The amount of time that a connection may be idle.
     *
     * Default: - none
     */
    override fun idle(): Duration? = unwrap(this).getIdle()?.let(Duration::wrap)

    /**
     * Represents per request timeout.
     *
     * Default: - 15 s
     */
    override fun perRequest(): Duration? = unwrap(this).getPerRequest()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpTimeout {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpTimeout): HttpTimeout =
        CdkObjectWrappers.wrap(cdkObject) as? HttpTimeout ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpTimeout): software.amazon.awscdk.services.appmesh.HttpTimeout =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.HttpTimeout
  }
}
