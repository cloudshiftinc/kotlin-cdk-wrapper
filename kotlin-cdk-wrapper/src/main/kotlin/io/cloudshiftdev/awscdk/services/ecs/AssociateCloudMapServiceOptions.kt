@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.servicediscovery.IService
import kotlin.Number
import kotlin.Unit

/**
 * The options for using a cloudmap service.
 *
 * Example:
 *
 * ```
 * Service cloudMapService;
 * FargateService ecsService;
 * ecsService.associateCloudMapService(AssociateCloudMapServiceOptions.builder()
 * .service(cloudMapService)
 * .build());
 * ```
 */
public interface AssociateCloudMapServiceOptions {
  /**
   * The container to point to for a SRV record.
   *
   * Default: - the task definition's default container
   */
  public fun container(): ContainerDefinition? =
      unwrap(this).getContainer()?.let(ContainerDefinition::wrap)

  /**
   * The port to point to for a SRV record.
   *
   * Default: - the default port of the task definition's default container
   */
  public fun containerPort(): Number? = unwrap(this).getContainerPort()

  /**
   * The cloudmap service to register with.
   */
  public fun service(): IService

  /**
   * A builder for [AssociateCloudMapServiceOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param container The container to point to for a SRV record.
     */
    public fun container(container: ContainerDefinition)

    /**
     * @param containerPort The port to point to for a SRV record.
     */
    public fun containerPort(containerPort: Number)

    /**
     * @param service The cloudmap service to register with. 
     */
    public fun service(service: IService)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.AssociateCloudMapServiceOptions.Builder =
        software.amazon.awscdk.services.ecs.AssociateCloudMapServiceOptions.builder()

    /**
     * @param container The container to point to for a SRV record.
     */
    override fun container(container: ContainerDefinition) {
      cdkBuilder.container(container.let(ContainerDefinition::unwrap))
    }

    /**
     * @param containerPort The port to point to for a SRV record.
     */
    override fun containerPort(containerPort: Number) {
      cdkBuilder.containerPort(containerPort)
    }

    /**
     * @param service The cloudmap service to register with. 
     */
    override fun service(service: IService) {
      cdkBuilder.service(service.let(IService::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.AssociateCloudMapServiceOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.AssociateCloudMapServiceOptions,
  ) : CdkObject(cdkObject), AssociateCloudMapServiceOptions {
    /**
     * The container to point to for a SRV record.
     *
     * Default: - the task definition's default container
     */
    override fun container(): ContainerDefinition? =
        unwrap(this).getContainer()?.let(ContainerDefinition::wrap)

    /**
     * The port to point to for a SRV record.
     *
     * Default: - the default port of the task definition's default container
     */
    override fun containerPort(): Number? = unwrap(this).getContainerPort()

    /**
     * The cloudmap service to register with.
     */
    override fun service(): IService = unwrap(this).getService().let(IService::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AssociateCloudMapServiceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.AssociateCloudMapServiceOptions):
        AssociateCloudMapServiceOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AssociateCloudMapServiceOptions):
        software.amazon.awscdk.services.ecs.AssociateCloudMapServiceOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.AssociateCloudMapServiceOptions
  }
}
