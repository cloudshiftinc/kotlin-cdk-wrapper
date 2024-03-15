@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String

/**
 * Configuration for Envoy Access logs for mesh endpoints.
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
public abstract class AccessLog internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.AccessLog,
) : CdkObject(cdkObject) {
  /**
   * Called when the AccessLog type is initialized.
   *
   * Can be used to enforce
   * mutual exclusivity with future properties
   *
   * @param scope 
   */
  public open fun bind(scope: Construct): AccessLogConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(AccessLogConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.AccessLog,
  ) : AccessLog(cdkObject)

  public companion object {
    public fun fromFilePath(filePath: String): AccessLog =
        software.amazon.awscdk.services.appmesh.AccessLog.fromFilePath(filePath).let(AccessLog::wrap)

    public fun fromFilePath(filePath: String, loggingFormat: LoggingFormat): AccessLog =
        software.amazon.awscdk.services.appmesh.AccessLog.fromFilePath(filePath,
        loggingFormat.let(LoggingFormat::unwrap)).let(AccessLog::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.AccessLog): AccessLog =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AccessLog): software.amazon.awscdk.services.appmesh.AccessLog =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.AccessLog
  }
}
