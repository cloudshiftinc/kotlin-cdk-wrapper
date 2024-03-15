@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface ServiceConnectService {
  public fun discoveryName(): String? = unwrap(this).getDiscoveryName()

  public fun dnsName(): String? = unwrap(this).getDnsName()

  public fun idleTimeout(): Duration? = unwrap(this).getIdleTimeout()?.let(Duration::wrap)

  public fun ingressPortOverride(): Number? = unwrap(this).getIngressPortOverride()

  public fun perRequestTimeout(): Duration? =
      unwrap(this).getPerRequestTimeout()?.let(Duration::wrap)

  public fun port(): Number? = unwrap(this).getPort()

  public fun portMappingName(): String

  @CdkDslMarker
  public interface Builder {
    public fun discoveryName(discoveryName: String)

    public fun dnsName(dnsName: String)

    public fun idleTimeout(idleTimeout: Duration)

    public fun ingressPortOverride(ingressPortOverride: Number)

    public fun perRequestTimeout(perRequestTimeout: Duration)

    public fun port(port: Number)

    public fun portMappingName(portMappingName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ServiceConnectService.Builder =
        software.amazon.awscdk.services.ecs.ServiceConnectService.builder()

    override fun discoveryName(discoveryName: String) {
      cdkBuilder.discoveryName(discoveryName)
    }

    override fun dnsName(dnsName: String) {
      cdkBuilder.dnsName(dnsName)
    }

    override fun idleTimeout(idleTimeout: Duration) {
      cdkBuilder.idleTimeout(idleTimeout.let(Duration::unwrap))
    }

    override fun ingressPortOverride(ingressPortOverride: Number) {
      cdkBuilder.ingressPortOverride(ingressPortOverride)
    }

    override fun perRequestTimeout(perRequestTimeout: Duration) {
      cdkBuilder.perRequestTimeout(perRequestTimeout.let(Duration::unwrap))
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun portMappingName(portMappingName: String) {
      cdkBuilder.portMappingName(portMappingName)
    }

    public fun build(): software.amazon.awscdk.services.ecs.ServiceConnectService =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.ServiceConnectService,
  ) : CdkObject(cdkObject), ServiceConnectService {
    override fun discoveryName(): String? = unwrap(this).getDiscoveryName()

    override fun dnsName(): String? = unwrap(this).getDnsName()

    override fun idleTimeout(): Duration? = unwrap(this).getIdleTimeout()?.let(Duration::wrap)

    override fun ingressPortOverride(): Number? = unwrap(this).getIngressPortOverride()

    override fun perRequestTimeout(): Duration? =
        unwrap(this).getPerRequestTimeout()?.let(Duration::wrap)

    override fun port(): Number? = unwrap(this).getPort()

    override fun portMappingName(): String = unwrap(this).getPortMappingName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ServiceConnectService {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ServiceConnectService):
        ServiceConnectService = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServiceConnectService):
        software.amazon.awscdk.services.ecs.ServiceConnectService = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.ServiceConnectService
  }
}
