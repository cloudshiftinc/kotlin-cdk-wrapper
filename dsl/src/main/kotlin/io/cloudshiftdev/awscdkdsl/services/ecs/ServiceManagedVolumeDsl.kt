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
import software.amazon.awscdk.services.ecs.ServiceManagedVolume
import software.constructs.Construct

/**
 * Represents a service-managed volume and always configured at launch.
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
public class ServiceManagedVolumeDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ServiceManagedVolume.Builder =
        ServiceManagedVolume.Builder.create(scope, id)

    /**
     * Configuration for an Amazon Elastic Block Store (EBS) volume managed by ECS.
     *
     * Default: - undefined
     *
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
     * Configuration for an Amazon Elastic Block Store (EBS) volume managed by ECS.
     *
     * Default: - undefined
     *
     * @param managedEbsVolume Configuration for an Amazon Elastic Block Store (EBS) volume managed
     *   by ECS.
     */
    public fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfiguration) {
        cdkBuilder.managedEbsVolume(managedEbsVolume)
    }

    /**
     * The name of the volume.
     *
     * This corresponds to the name provided in the ECS TaskDefinition.
     *
     * @param name The name of the volume.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): ServiceManagedVolume = cdkBuilder.build()
}
