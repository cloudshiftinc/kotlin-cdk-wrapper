@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.collections.Map

/**
 * Configuration for Envoy Access Logging Format for mesh endpoints.
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
 * .accessLog(AccessLog.fromFilePath("/dev/stdout", LoggingFormat.fromJson(Map.of("testKey1",
 * "testValue1", "testKey2", "testValue2"))))
 * .build();
 * ```
 */
public abstract class LoggingFormat(
  cdkObject: software.amazon.awscdk.services.appmesh.LoggingFormat,
) : CdkObject(cdkObject) {
  /**
   * Called when the Access Log Format is initialized.
   *
   * Can be used to enforce
   * mutual exclusivity with future properties
   */
  public open fun bind(): LoggingFormatConfig = unwrap(this).bind().let(LoggingFormatConfig::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.LoggingFormat,
  ) : LoggingFormat(cdkObject)

  public companion object {
    public fun fromJson(jsonLoggingFormat: Map<String, String>): LoggingFormat =
        software.amazon.awscdk.services.appmesh.LoggingFormat.fromJson(jsonLoggingFormat).let(LoggingFormat::wrap)

    public fun fromText(text: String): LoggingFormat =
        software.amazon.awscdk.services.appmesh.LoggingFormat.fromText(text).let(LoggingFormat::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.LoggingFormat):
        LoggingFormat = CdkObjectWrappers.wrap(cdkObject) as? LoggingFormat ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoggingFormat):
        software.amazon.awscdk.services.appmesh.LoggingFormat = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appmesh.LoggingFormat
  }
}
