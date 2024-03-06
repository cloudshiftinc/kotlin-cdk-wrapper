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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.services.ec2.EbsDeviceOptions
import software.amazon.awscdk.services.ec2.EbsDeviceVolumeType
import software.amazon.awscdk.services.kms.IKey

/**
 * Block device options for an EBS volume.
 *
 * Example:
 * ```
 * BastionHostLinux host = BastionHostLinux.Builder.create(this, "BastionHost")
 * .vpc(vpc)
 * .blockDevices(List.of(BlockDevice.builder()
 * .deviceName("/dev/sdh")
 * .volume(BlockDeviceVolume.ebs(10, EbsDeviceOptions.builder()
 * .encrypted(true)
 * .build()))
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class EbsDeviceOptionsDsl {
    private val cdkBuilder: EbsDeviceOptions.Builder = EbsDeviceOptions.builder()

    /**
     * @param deleteOnTermination Indicates whether to delete the volume when the instance is
     *   terminated.
     */
    public fun deleteOnTermination(deleteOnTermination: Boolean) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
    }

    /**
     * @param encrypted Specifies whether the EBS volume is encrypted. Encrypted EBS volumes can
     *   only be attached to instances that support Amazon EBS encryption
     */
    public fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
    }

    /**
     * @param iops The number of I/O operations per second (IOPS) to provision for the volume. Must
     *   only be set for `volumeType`: `EbsDeviceVolumeType.IO1`
     *
     * The maximum ratio of IOPS to volume size (in GiB) is 50:1, so for 5,000 provisioned IOPS, you
     * need at least 100 GiB storage on the volume.
     */
    public fun iops(iops: Number) {
        cdkBuilder.iops(iops)
    }

    /**
     * @param kmsKey The ARN of the AWS Key Management Service (AWS KMS) CMK used for encryption.
     *   You have to ensure that the KMS CMK has the correct permissions to be used by the service
     *   launching the ec2 instances.
     */
    public fun kmsKey(kmsKey: IKey) {
        cdkBuilder.kmsKey(kmsKey)
    }

    /** @param volumeType The EBS volume type. */
    public fun volumeType(volumeType: EbsDeviceVolumeType) {
        cdkBuilder.volumeType(volumeType)
    }

    public fun build(): EbsDeviceOptions = cdkBuilder.build()
}
