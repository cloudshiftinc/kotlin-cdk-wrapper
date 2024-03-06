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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.ec2.EbsDeviceVolumeType
import software.amazon.awscdk.services.ecs.EBSTagSpecification
import software.amazon.awscdk.services.ecs.FileSystemType
import software.amazon.awscdk.services.ecs.ServiceManagedEBSVolumeConfiguration
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.kms.IKey

/**
 * Represents the configuration for an ECS Service managed EBS volume.
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
public class ServiceManagedEBSVolumeConfigurationDsl {
    private val cdkBuilder: ServiceManagedEBSVolumeConfiguration.Builder =
        ServiceManagedEBSVolumeConfiguration.builder()

    private val _tagSpecifications: MutableList<EBSTagSpecification> = mutableListOf()

    /** @param encrypted Indicates whether the volume should be encrypted. */
    public fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
    }

    /**
     * @param fileSystemType The Linux filesystem type for the volume. For volumes created from a
     *   snapshot, you must specify the same filesystem type that the volume was using when the
     *   snapshot was created. The available filesystem types are ext3, ext4, and xfs.
     */
    public fun fileSystemType(fileSystemType: FileSystemType) {
        cdkBuilder.fileSystemType(fileSystemType)
    }

    /**
     * @param iops The number of I/O operations per second (IOPS). For gp3, io1, and io2 volumes,
     *   this represents the number of IOPS that are provisioned for the volume. For gp2 volumes,
     *   this represents the baseline performance of the volume and the rate at which the volume
     *   accumulates I/O credits for bursting.
     *
     * The following are the supported values for each volume type.
     * * gp3: 3,000 - 16,000 IOPS
     * * io1: 100 - 64,000 IOPS
     * * io2: 100 - 256,000 IOPS
     *
     * This parameter is required for io1 and io2 volume types. The default for gp3 volumes is 3,000
     * IOPS. This parameter is not supported for st1, sc1, or standard volume types.
     */
    public fun iops(iops: Number) {
        cdkBuilder.iops(iops)
    }

    /** @param kmsKeyId AWS Key Management Service key to use for Amazon EBS encryption. */
    public fun kmsKeyId(kmsKeyId: IKey) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param role An IAM role that allows ECS to make calls to EBS APIs on your behalf. This role
     *   is required to create and manage the Amazon EBS volume.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * @param size The size of the volume in GiB. You must specify either `size` or `snapshotId`.
     *   You can optionally specify a volume size greater than or equal to the snapshot size.
     *
     * The following are the supported volume size values for each volume type.
     * * gp2 and gp3: 1-16,384
     * * io1 and io2: 4-16,384
     * * st1 and sc1: 125-16,384
     * * standard: 1-1,024
     */
    public fun size(size: Size) {
        cdkBuilder.size(size)
    }

    /**
     * @param snapShotId The snapshot that Amazon ECS uses to create the volume. You must specify
     *   either `size` or `snapshotId`.
     */
    public fun snapShotId(snapShotId: String) {
        cdkBuilder.snapShotId(snapShotId)
    }

    /**
     * @param tagSpecifications Specifies the tags to apply to the volume and whether to propagate
     *   those tags to the volume.
     */
    public fun tagSpecifications(tagSpecifications: EBSTagSpecificationDsl.() -> Unit) {
        _tagSpecifications.add(EBSTagSpecificationDsl().apply(tagSpecifications).build())
    }

    /**
     * @param tagSpecifications Specifies the tags to apply to the volume and whether to propagate
     *   those tags to the volume.
     */
    public fun tagSpecifications(tagSpecifications: Collection<EBSTagSpecification>) {
        _tagSpecifications.addAll(tagSpecifications)
    }

    /**
     * @param throughput The throughput to provision for a volume, in MiB/s, with a maximum of 1,000
     *   MiB/s. This parameter is only supported for the gp3 volume type.
     */
    public fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
    }

    /** @param volumeType The volume type. */
    public fun volumeType(volumeType: EbsDeviceVolumeType) {
        cdkBuilder.volumeType(volumeType)
    }

    public fun build(): ServiceManagedEBSVolumeConfiguration {
        if (_tagSpecifications.isNotEmpty()) cdkBuilder.tagSpecifications(_tagSpecifications)
        return cdkBuilder.build()
    }
}
