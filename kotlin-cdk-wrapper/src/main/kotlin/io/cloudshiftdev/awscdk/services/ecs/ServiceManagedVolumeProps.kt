@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents the Volume configuration for an ECS service.
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
public interface ServiceManagedVolumeProps {
  /**
   * Configuration for an Amazon Elastic Block Store (EBS) volume managed by ECS.
   *
   * Default: - undefined
   */
  public fun managedEBSVolume(): ServiceManagedEBSVolumeConfiguration? =
      unwrap(this).getManagedEBSVolume()?.let(ServiceManagedEBSVolumeConfiguration::wrap)

  /**
   * The name of the volume.
   *
   * This corresponds to the name provided in the ECS TaskDefinition.
   */
  public fun name(): String

  /**
   * A builder for [ServiceManagedVolumeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param managedEbsVolume Configuration for an Amazon Elastic Block Store (EBS) volume managed
     * by ECS.
     */
    public fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfiguration)

    /**
     * @param managedEbsVolume Configuration for an Amazon Elastic Block Store (EBS) volume managed
     * by ECS.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b1e4773226d73f28b18775cd0d79046e9b59682361f2ff6a813298f5019d88c0")
    public
        fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfiguration.Builder.() -> Unit)

    /**
     * @param name The name of the volume. 
     * This corresponds to the name provided in the ECS TaskDefinition.
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ServiceManagedVolumeProps.Builder =
        software.amazon.awscdk.services.ecs.ServiceManagedVolumeProps.builder()

    /**
     * @param managedEbsVolume Configuration for an Amazon Elastic Block Store (EBS) volume managed
     * by ECS.
     */
    override fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfiguration) {
      cdkBuilder.managedEbsVolume(managedEbsVolume.let(ServiceManagedEBSVolumeConfiguration.Companion::unwrap))
    }

    /**
     * @param managedEbsVolume Configuration for an Amazon Elastic Block Store (EBS) volume managed
     * by ECS.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b1e4773226d73f28b18775cd0d79046e9b59682361f2ff6a813298f5019d88c0")
    override
        fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfiguration.Builder.() -> Unit):
        Unit = managedEbsVolume(ServiceManagedEBSVolumeConfiguration(managedEbsVolume))

    /**
     * @param name The name of the volume. 
     * This corresponds to the name provided in the ECS TaskDefinition.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.ecs.ServiceManagedVolumeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.ServiceManagedVolumeProps,
  ) : CdkObject(cdkObject),
      ServiceManagedVolumeProps {
    /**
     * Configuration for an Amazon Elastic Block Store (EBS) volume managed by ECS.
     *
     * Default: - undefined
     */
    override fun managedEBSVolume(): ServiceManagedEBSVolumeConfiguration? =
        unwrap(this).getManagedEBSVolume()?.let(ServiceManagedEBSVolumeConfiguration::wrap)

    /**
     * The name of the volume.
     *
     * This corresponds to the name provided in the ECS TaskDefinition.
     */
    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ServiceManagedVolumeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ServiceManagedVolumeProps):
        ServiceManagedVolumeProps = CdkObjectWrappers.wrap(cdkObject) as? ServiceManagedVolumeProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServiceManagedVolumeProps):
        software.amazon.awscdk.services.ecs.ServiceManagedVolumeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.ServiceManagedVolumeProps
  }
}
