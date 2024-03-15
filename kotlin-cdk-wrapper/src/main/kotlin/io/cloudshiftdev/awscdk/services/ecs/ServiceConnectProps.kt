@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ServiceConnectProps {
  public fun logDriver(): LogDriver? = unwrap(this).getLogDriver()?.let(LogDriver::wrap)

  public fun namespace(): String? = unwrap(this).getNamespace()

  public fun services(): List<ServiceConnectService> =
      unwrap(this).getServices()?.map(ServiceConnectService::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun logDriver(logDriver: LogDriver)

    public fun namespace(namespace: String)

    public fun services(services: List<ServiceConnectService>)

    public fun services(vararg services: ServiceConnectService)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ServiceConnectProps.Builder =
        software.amazon.awscdk.services.ecs.ServiceConnectProps.builder()

    override fun logDriver(logDriver: LogDriver) {
      cdkBuilder.logDriver(logDriver.let(LogDriver::unwrap))
    }

    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    override fun services(services: List<ServiceConnectService>) {
      cdkBuilder.services(services.map(ServiceConnectService::unwrap))
    }

    override fun services(vararg services: ServiceConnectService): Unit =
        services(services.toList())

    public fun build(): software.amazon.awscdk.services.ecs.ServiceConnectProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.ServiceConnectProps,
  ) : CdkObject(cdkObject), ServiceConnectProps {
    override fun logDriver(): LogDriver? = unwrap(this).getLogDriver()?.let(LogDriver::wrap)

    override fun namespace(): String? = unwrap(this).getNamespace()

    override fun services(): List<ServiceConnectService> =
        unwrap(this).getServices()?.map(ServiceConnectService::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ServiceConnectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ServiceConnectProps):
        ServiceConnectProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServiceConnectProps):
        software.amazon.awscdk.services.ecs.ServiceConnectProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.ServiceConnectProps
  }
}
