@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Defines the mount point details for attaching a volume to a container.
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
public interface ContainerMountPoint : BaseMountPoint {
  /**
   * A builder for [ContainerMountPoint]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param containerPath The path on the container to mount the host volume at. 
     */
    public fun containerPath(containerPath: String)

    /**
     * @param readOnly Specifies whether to give the container read-only access to the volume. 
     * If this value is true, the container has read-only access to the volume.
     * If this value is false, then the container can write to the volume.
     */
    public fun readOnly(readOnly: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ContainerMountPoint.Builder =
        software.amazon.awscdk.services.ecs.ContainerMountPoint.builder()

    /**
     * @param containerPath The path on the container to mount the host volume at. 
     */
    override fun containerPath(containerPath: String) {
      cdkBuilder.containerPath(containerPath)
    }

    /**
     * @param readOnly Specifies whether to give the container read-only access to the volume. 
     * If this value is true, the container has read-only access to the volume.
     * If this value is false, then the container can write to the volume.
     */
    override fun readOnly(readOnly: Boolean) {
      cdkBuilder.readOnly(readOnly)
    }

    public fun build(): software.amazon.awscdk.services.ecs.ContainerMountPoint = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.ContainerMountPoint,
  ) : CdkObject(cdkObject), ContainerMountPoint {
    /**
     * The path on the container to mount the host volume at.
     */
    override fun containerPath(): String = unwrap(this).getContainerPath()

    /**
     * Specifies whether to give the container read-only access to the volume.
     *
     * If this value is true, the container has read-only access to the volume.
     * If this value is false, then the container can write to the volume.
     */
    override fun readOnly(): Boolean = unwrap(this).getReadOnly()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ContainerMountPoint {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ContainerMountPoint):
        ContainerMountPoint = CdkObjectWrappers.wrap(cdkObject) as ContainerMountPoint

    internal fun unwrap(wrapped: ContainerMountPoint):
        software.amazon.awscdk.services.ecs.ContainerMountPoint = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.ContainerMountPoint
  }
}
