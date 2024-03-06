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
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ServiceManagedEBSVolumeConfiguration
import software.amazon.awscdk.services.ecs.ServiceManagedVolumeProps

/**
 * Represents the Volume configuration for an ECS service.
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
public class ServiceManagedVolumePropsDsl {
    private val cdkBuilder: ServiceManagedVolumeProps.Builder = ServiceManagedVolumeProps.builder()

    /**
     * @param managedEbsVolume Configuration for an Amazon Elastic Block Store (EBS) volume managed
     *   by ECS.
     */
    public fun managedEbsVolume(
        managedEbsVolume: ServiceManagedEBSVolumeConfigurationDsl.() -> Unit = {}
    ) {
        val builder = ServiceManagedEBSVolumeConfigurationDsl()
        builder.apply(managedEbsVolume)
        cdkBuilder.managedEbsVolume(builder.build())
    }

    /**
     * @param managedEbsVolume Configuration for an Amazon Elastic Block Store (EBS) volume managed
     *   by ECS.
     */
    public fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfiguration) {
        cdkBuilder.managedEbsVolume(managedEbsVolume)
    }

    /**
     * @param name The name of the volume. This corresponds to the name provided in the ECS
     *   TaskDefinition.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): ServiceManagedVolumeProps = cdkBuilder.build()
}
