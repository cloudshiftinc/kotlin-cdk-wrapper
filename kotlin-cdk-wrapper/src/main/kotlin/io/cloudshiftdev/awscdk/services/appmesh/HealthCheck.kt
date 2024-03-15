@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Contains static factory methods for creating health checks for different protocols.
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
public abstract class HealthCheck internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.HealthCheck,
) : CdkObject(cdkObject) {
  /**
   * Called when the AccessLog type is initialized.
   *
   * Can be used to enforce
   * mutual exclusivity with future properties
   *
   * @param scope 
   * @param options 
   */
  public open fun bind(scope: Construct, options: HealthCheckBindOptions): HealthCheckConfig =
      unwrap(this).bind(scope.let(Construct::unwrap),
      options.let(HealthCheckBindOptions::unwrap)).let(HealthCheckConfig::wrap)

  /**
   * Called when the AccessLog type is initialized.
   *
   * Can be used to enforce
   * mutual exclusivity with future properties
   *
   * @param scope 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e14868d4f0eef12d5bfd839171646876cecc6acfb144938855aea88892fd5219")
  public open fun bind(scope: Construct, options: HealthCheckBindOptions.Builder.() -> Unit):
      HealthCheckConfig = bind(scope, HealthCheckBindOptions(options))

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.HealthCheck,
  ) : HealthCheck(cdkObject)

  public companion object {
    public fun grpc(): HealthCheck =
        software.amazon.awscdk.services.appmesh.HealthCheck.grpc().let(HealthCheck::wrap)

    public fun grpc(options: GrpcHealthCheckOptions): HealthCheck =
        software.amazon.awscdk.services.appmesh.HealthCheck.grpc(options.let(GrpcHealthCheckOptions::unwrap)).let(HealthCheck::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca4aa5f646cab38266ec9a00ad9f89bc1ca43aeacd9b12580cb2e1f842fcd263")
    public fun grpc(options: GrpcHealthCheckOptions.Builder.() -> Unit): HealthCheck =
        grpc(GrpcHealthCheckOptions(options))

    public fun http(): HealthCheck =
        software.amazon.awscdk.services.appmesh.HealthCheck.http().let(HealthCheck::wrap)

    public fun http(options: HttpHealthCheckOptions): HealthCheck =
        software.amazon.awscdk.services.appmesh.HealthCheck.http(options.let(HttpHealthCheckOptions::unwrap)).let(HealthCheck::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c354f1fe3451f953e1691c5d04b8c36b09946d906547a0b8b5f34bc696285e76")
    public fun http(options: HttpHealthCheckOptions.Builder.() -> Unit): HealthCheck =
        http(HttpHealthCheckOptions(options))

    public fun http2(): HealthCheck =
        software.amazon.awscdk.services.appmesh.HealthCheck.http2().let(HealthCheck::wrap)

    public fun http2(options: HttpHealthCheckOptions): HealthCheck =
        software.amazon.awscdk.services.appmesh.HealthCheck.http2(options.let(HttpHealthCheckOptions::unwrap)).let(HealthCheck::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80291b38f690382fada9f5ea7fa44011f91859a26b6f5446e003b9e2d9c09e27")
    public fun http2(options: HttpHealthCheckOptions.Builder.() -> Unit): HealthCheck =
        http2(HttpHealthCheckOptions(options))

    public fun tcp(): HealthCheck =
        software.amazon.awscdk.services.appmesh.HealthCheck.tcp().let(HealthCheck::wrap)

    public fun tcp(options: TcpHealthCheckOptions): HealthCheck =
        software.amazon.awscdk.services.appmesh.HealthCheck.tcp(options.let(TcpHealthCheckOptions::unwrap)).let(HealthCheck::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40dcb0b765391f6b0f9a4c2e59045f055eda8aec8e9f36cd3ee748c070b37b90")
    public fun tcp(options: TcpHealthCheckOptions.Builder.() -> Unit): HealthCheck =
        tcp(TcpHealthCheckOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HealthCheck): HealthCheck =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HealthCheck): software.amazon.awscdk.services.appmesh.HealthCheck =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.HealthCheck
  }
}
