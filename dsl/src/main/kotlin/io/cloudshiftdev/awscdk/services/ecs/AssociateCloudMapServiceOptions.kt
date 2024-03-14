package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.services.servicediscovery.IService
import kotlin.Number
import kotlin.Unit

public interface AssociateCloudMapServiceOptions {
  public fun container(): ContainerDefinition? =
      unwrap(this).getContainer()?.let(ContainerDefinition::wrap)

  public fun containerPort(): Number? = unwrap(this).getContainerPort()

  public fun service(): IService

  public interface Builder {
    public fun container(container: ContainerDefinition)

    public fun containerPort(containerPort: Number)

    public fun service(service: IService)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.AssociateCloudMapServiceOptions.Builder =
        software.amazon.awscdk.services.ecs.AssociateCloudMapServiceOptions.builder()

    override fun container(container: ContainerDefinition) {
      cdkBuilder.container(container.let(ContainerDefinition::unwrap))
    }

    override fun containerPort(containerPort: Number) {
      cdkBuilder.containerPort(containerPort)
    }

    override fun service(service: IService) {
      cdkBuilder.service(service.let(IService::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.AssociateCloudMapServiceOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.AssociateCloudMapServiceOptions,
  ) : AssociateCloudMapServiceOptions {
    override fun container(): ContainerDefinition? =
        unwrap(this).getContainer()?.let(ContainerDefinition::wrap)

    override fun containerPort(): Number? = unwrap(this).getContainerPort()

    override fun service(): IService = unwrap(this).getService().let(IService::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AssociateCloudMapServiceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.AssociateCloudMapServiceOptions):
        AssociateCloudMapServiceOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AssociateCloudMapServiceOptions):
        software.amazon.awscdk.services.ecs.AssociateCloudMapServiceOptions = (wrapped as
        Wrapper).cdkObject
  }
}
