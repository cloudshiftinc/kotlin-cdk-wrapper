@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ecs.ContainerMountPoint

/**
 * Defines the mount point details for attaching a volume to a container.
 *
 * Example:
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
@CdkDslMarker
public class ContainerMountPointDsl {
    private val cdkBuilder: ContainerMountPoint.Builder = ContainerMountPoint.builder()

    /** @param containerPath The path on the container to mount the host volume at. */
    public fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
    }

    /**
     * @param readOnly Specifies whether to give the container read-only access to the volume. If
     *   this value is true, the container has read-only access to the volume. If this value is
     *   false, then the container can write to the volume.
     */
    public fun readOnly(readOnly: Boolean) {
        cdkBuilder.readOnly(readOnly)
    }

    public fun build(): ContainerMountPoint = cdkBuilder.build()
}
