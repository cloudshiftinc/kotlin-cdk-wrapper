@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Represents a service-managed volume and always configured at launch.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * FargateTaskDefinition taskDefinition = new FargateTaskDefinition(this, "TaskDef");
 * ContainerDefinition container = taskDefinition.addContainer("web",
 * ContainerDefinitionOptions.builder()
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .portMappings(List.of(PortMapping.builder()
 * .containerPort(80)
 * .protocol(Protocol.TCP)
 * .build()))
 * .build());
 * ServiceManagedVolume volume = ServiceManagedVolume.Builder.create(this, "EBSVolume")
 * .name("ebs1")
 * .managedEBSVolume(ServiceManagedEBSVolumeConfiguration.builder()
 * .size(Size.gibibytes(15))
 * .volumeType(EbsDeviceVolumeType.GP3)
 * .fileSystemType(FileSystemType.XFS)
 * .tagSpecifications(List.of(EBSTagSpecification.builder()
 * .tags(Map.of(
 * "purpose", "production"))
 * .propagateTags(EbsPropagatedTagSource.SERVICE)
 * .build()))
 * .build())
 * .build();
 * volume.mountIn(container, ContainerMountPoint.builder()
 * .containerPath("/var/lib")
 * .readOnly(false)
 * .build());
 * taskDefinition.addVolume(volume);
 * FargateService service = FargateService.Builder.create(this, "FargateService")
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .build();
 * service.addVolume(volume);
 * ```
 */
public open class ServiceManagedVolume internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.ServiceManagedVolume,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ServiceManagedVolumeProps,
  ) :
      this(software.amazon.awscdk.services.ecs.ServiceManagedVolume(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(ServiceManagedVolumeProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ServiceManagedVolumeProps.Builder.() -> Unit,
  ) : this(scope, id, ServiceManagedVolumeProps(props)
  )

  /**
   * Volume configuration.
   */
  public open fun config(): ServiceManagedEBSVolumeConfiguration? =
      unwrap(this).getConfig()?.let(ServiceManagedEBSVolumeConfiguration::wrap)

  /**
   * configuredAtLaunch indicates volume at launch time, referenced by taskdefinition volume.
   */
  public open fun configuredAtLaunch(): Boolean = unwrap(this).getConfiguredAtLaunch()

  /**
   * Mounts the service managed volume to a specified container at a defined mount point.
   *
   * @param container The container to mount the volume on. 
   * @param mountPoint The mounting point details within the container. 
   */
  public open fun mountIn(container: ContainerDefinition, mountPoint: ContainerMountPoint) {
    unwrap(this).mountIn(container.let(ContainerDefinition::unwrap),
        mountPoint.let(ContainerMountPoint::unwrap))
  }

  /**
   * Mounts the service managed volume to a specified container at a defined mount point.
   *
   * @param container The container to mount the volume on. 
   * @param mountPoint The mounting point details within the container. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("175978aadadb0894a4693b8e720c8433215c7213ddac8cc76457c00a3db962ab")
  public open fun mountIn(container: ContainerDefinition,
      mountPoint: ContainerMountPoint.Builder.() -> Unit): Unit = mountIn(container,
      ContainerMountPoint(mountPoint))

  /**
   * Name of the volume, referenced by taskdefintion and mount point.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * An IAM role that allows ECS to make calls to EBS APIs.
   *
   * If not provided, a new role with appropriate permissions will be created by default.
   */
  public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.ServiceManagedVolume].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Configuration for an Amazon Elastic Block Store (EBS) volume managed by ECS.
     *
     * Default: - undefined
     *
     * @param managedEbsVolume Configuration for an Amazon Elastic Block Store (EBS) volume managed
     * by ECS. 
     */
    public fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfiguration)

    /**
     * Configuration for an Amazon Elastic Block Store (EBS) volume managed by ECS.
     *
     * Default: - undefined
     *
     * @param managedEbsVolume Configuration for an Amazon Elastic Block Store (EBS) volume managed
     * by ECS. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea3547ee438cda0cc5e4fe5ef7e42e212364219a5e436646e0668cd317a40bba")
    public
        fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfiguration.Builder.() -> Unit)

    /**
     * The name of the volume.
     *
     * This corresponds to the name provided in the ECS TaskDefinition.
     *
     * @param name The name of the volume. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ServiceManagedVolume.Builder =
        software.amazon.awscdk.services.ecs.ServiceManagedVolume.Builder.create(scope, id)

    /**
     * Configuration for an Amazon Elastic Block Store (EBS) volume managed by ECS.
     *
     * Default: - undefined
     *
     * @param managedEbsVolume Configuration for an Amazon Elastic Block Store (EBS) volume managed
     * by ECS. 
     */
    override fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfiguration) {
      cdkBuilder.managedEbsVolume(managedEbsVolume.let(ServiceManagedEBSVolumeConfiguration::unwrap))
    }

    /**
     * Configuration for an Amazon Elastic Block Store (EBS) volume managed by ECS.
     *
     * Default: - undefined
     *
     * @param managedEbsVolume Configuration for an Amazon Elastic Block Store (EBS) volume managed
     * by ECS. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea3547ee438cda0cc5e4fe5ef7e42e212364219a5e436646e0668cd317a40bba")
    override
        fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfiguration.Builder.() -> Unit):
        Unit = managedEbsVolume(ServiceManagedEBSVolumeConfiguration(managedEbsVolume))

    /**
     * The name of the volume.
     *
     * This corresponds to the name provided in the ECS TaskDefinition.
     *
     * @param name The name of the volume. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.ecs.ServiceManagedVolume =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ServiceManagedVolume {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ServiceManagedVolume(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ServiceManagedVolume):
        ServiceManagedVolume = ServiceManagedVolume(cdkObject)

    internal fun unwrap(wrapped: ServiceManagedVolume):
        software.amazon.awscdk.services.ecs.ServiceManagedVolume = wrapped.cdkObject
  }
}
