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
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnService

/**
 * The configuration for the Amazon EBS volume that Amazon ECS creates and manages on your behalf.
 *
 * These settings are used to create each Amazon EBS volume, with one volume created for each task
 * in the service.
 *
 * Many of these parameters map 1:1 with the Amazon EBS `CreateVolume` API request parameters.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * ServiceManagedEBSVolumeConfigurationProperty serviceManagedEBSVolumeConfigurationProperty =
 * ServiceManagedEBSVolumeConfigurationProperty.builder()
 * .roleArn("roleArn")
 * // the properties below are optional
 * .encrypted(false)
 * .filesystemType("filesystemType")
 * .iops(123)
 * .kmsKeyId("kmsKeyId")
 * .sizeInGiB(123)
 * .snapshotId("snapshotId")
 * .tagSpecifications(List.of(EBSTagSpecificationProperty.builder()
 * .resourceType("resourceType")
 * // the properties below are optional
 * .propagateTags("propagateTags")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * .throughput(123)
 * .volumeType("volumeType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicemanagedebsvolumeconfiguration.html)
 */
@CdkDslMarker
public class CfnServiceServiceManagedEBSVolumeConfigurationPropertyDsl {
    private val cdkBuilder: CfnService.ServiceManagedEBSVolumeConfigurationProperty.Builder =
        CfnService.ServiceManagedEBSVolumeConfigurationProperty.builder()

    private val _tagSpecifications: MutableList<Any> = mutableListOf()

    /**
     * @param encrypted Indicates whether the volume should be encrypted. If no value is specified,
     *   encryption is turned on by default. This parameter maps 1:1 with the `Encrypted` parameter
     *   of the
     *   [CreateVolume API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html)
     *   in the *Amazon EC2 API Reference* .
     */
    public fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
    }

    /**
     * @param encrypted Indicates whether the volume should be encrypted. If no value is specified,
     *   encryption is turned on by default. This parameter maps 1:1 with the `Encrypted` parameter
     *   of the
     *   [CreateVolume API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html)
     *   in the *Amazon EC2 API Reference* .
     */
    public fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted)
    }

    /**
     * @param filesystemType The Linux filesystem type for the volume. For volumes created from a
     *   snapshot, you must specify the same filesystem type that the volume was using when the
     *   snapshot was created. If there is a filesystem type mismatch, the task will fail to start.
     *
     * The available filesystem types are `ext3` , `ext4` , and `xfs` . If no value is specified,
     * the `xfs` filesystem type is used by default.
     */
    public fun filesystemType(filesystemType: String) {
        cdkBuilder.filesystemType(filesystemType)
    }

    /**
     * @param iops The number of I/O operations per second (IOPS). For `gp3` , `io1` , and `io2`
     *   volumes, this represents the number of IOPS that are provisioned for the volume. For `gp2`
     *   volumes, this represents the baseline performance of the volume and the rate at which the
     *   volume accumulates I/O credits for bursting.
     *
     * The following are the supported values for each volume type.
     * * `gp3` : 3,000 - 16,000 IOPS
     * * `io1` : 100 - 64,000 IOPS
     * * `io2` : 100 - 256,000 IOPS
     *
     * This parameter is required for `io1` and `io2` volume types. The default for `gp3` volumes is
     * `3,000 IOPS` . This parameter is not supported for `st1` , `sc1` , or `standard` volume
     * types.
     *
     * This parameter maps 1:1 with the `Iops` parameter of the
     * [CreateVolume API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html)
     * in the *Amazon EC2 API Reference* .
     */
    public fun iops(iops: Number) {
        cdkBuilder.iops(iops)
    }

    /**
     * @param kmsKeyId The Amazon Resource Name (ARN) identifier of the AWS Key Management Service
     *   key to use for Amazon EBS encryption. When encryption is turned on and no AWS Key
     *   Management Service key is specified, the default AWS managed key for Amazon EBS volumes is
     *   used. This parameter maps 1:1 with the `KmsKeyId` parameter of the
     *   [CreateVolume API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html)
     *   in the *Amazon EC2 API Reference* .
     *
     * AWS authenticates the AWS Key Management Service key asynchronously. Therefore, if you
     * specify an ID, alias, or ARN that is invalid, the action can appear to complete, but
     * eventually fails.
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param roleArn The ARN of the IAM role to associate with this volume. This is the Amazon ECS
     *   infrastructure IAM role that is used to manage your AWS infrastructure. We recommend using
     *   the Amazon ECS-managed `AmazonECSInfrastructureRolePolicyForVolumes` IAM policy with this
     *   role. For more information, see
     *   [Amazon ECS infrastructure IAM role](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/infrastructure_IAM_role.html)
     *   in the *Amazon ECS Developer Guide* .
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param sizeInGiB The size of the volume in GiB. You must specify either a volume size or a
     *   snapshot ID. If you specify a snapshot ID, the snapshot size is used for the volume size by
     *   default. You can optionally specify a volume size greater than or equal to the snapshot
     *   size. This parameter maps 1:1 with the `Size` parameter of the
     *   [CreateVolume API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html)
     *   in the *Amazon EC2 API Reference* .
     *
     * The following are the supported volume size values for each volume type.
     * * `gp2` and `gp3` : 1-16,384
     * * `io1` and `io2` : 4-16,384
     * * `st1` and `sc1` : 125-16,384
     * * `standard` : 1-1,024
     */
    public fun sizeInGiB(sizeInGiB: Number) {
        cdkBuilder.sizeInGiB(sizeInGiB)
    }

    /**
     * @param snapshotId The snapshot that Amazon ECS uses to create the volume. You must specify
     *   either a snapshot ID or a volume size. This parameter maps 1:1 with the `SnapshotId`
     *   parameter of the
     *   [CreateVolume API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html)
     *   in the *Amazon EC2 API Reference* .
     */
    public fun snapshotId(snapshotId: String) {
        cdkBuilder.snapshotId(snapshotId)
    }

    /**
     * @param tagSpecifications The tags to apply to the volume. Amazon ECS applies service-managed
     *   tags by default. This parameter maps 1:1 with the `TagSpecifications.N` parameter of the
     *   [CreateVolume API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html)
     *   in the *Amazon EC2 API Reference* .
     */
    public fun tagSpecifications(vararg tagSpecifications: Any) {
        _tagSpecifications.addAll(listOf(*tagSpecifications))
    }

    /**
     * @param tagSpecifications The tags to apply to the volume. Amazon ECS applies service-managed
     *   tags by default. This parameter maps 1:1 with the `TagSpecifications.N` parameter of the
     *   [CreateVolume API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html)
     *   in the *Amazon EC2 API Reference* .
     */
    public fun tagSpecifications(tagSpecifications: Collection<Any>) {
        _tagSpecifications.addAll(tagSpecifications)
    }

    /**
     * @param tagSpecifications The tags to apply to the volume. Amazon ECS applies service-managed
     *   tags by default. This parameter maps 1:1 with the `TagSpecifications.N` parameter of the
     *   [CreateVolume API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html)
     *   in the *Amazon EC2 API Reference* .
     */
    public fun tagSpecifications(tagSpecifications: IResolvable) {
        cdkBuilder.tagSpecifications(tagSpecifications)
    }

    /**
     * @param throughput The throughput to provision for a volume, in MiB/s, with a maximum of 1,000
     *   MiB/s. This parameter maps 1:1 with the `Throughput` parameter of the
     *   [CreateVolume API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html)
     *   in the *Amazon EC2 API Reference* .
     *
     * This parameter is only supported for the `gp3` volume type.
     */
    public fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
    }

    /**
     * @param volumeType The volume type. This parameter maps 1:1 with the `VolumeType` parameter of
     *   the
     *   [CreateVolume API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html)
     *   in the *Amazon EC2 API Reference* . For more information, see
     *   [Amazon EBS volume types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volume-types.html)
     *   in the *Amazon EC2 User Guide* .
     *
     * The following are the supported volume types.
     * * General Purpose SSD: `gp2` | `gp3`
     * * Provisioned IOPS SSD: `io1` | `io2`
     * * Throughput Optimized HDD: `st1`
     * * Cold HDD: `sc1`
     * * Magnetic: `standard`
     *
     * The magnetic volume type is not supported on Fargate.
     */
    public fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
    }

    public fun build(): CfnService.ServiceManagedEBSVolumeConfigurationProperty {
        if (_tagSpecifications.isNotEmpty()) cdkBuilder.tagSpecifications(_tagSpecifications)
        return cdkBuilder.build()
    }
}
