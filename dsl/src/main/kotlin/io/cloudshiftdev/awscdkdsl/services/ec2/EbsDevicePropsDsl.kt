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
import kotlin.String
import software.amazon.awscdk.services.ec2.EbsDeviceProps
import software.amazon.awscdk.services.ec2.EbsDeviceVolumeType
import software.amazon.awscdk.services.kms.IKey

/**
 * Properties of an EBS block device.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.kms.*;
 * Key key;
 * EbsDeviceProps ebsDeviceProps = EbsDeviceProps.builder()
 * .deleteOnTermination(false)
 * .encrypted(false)
 * .iops(123)
 * .kmsKey(key)
 * .snapshotId("snapshotId")
 * .volumeSize(123)
 * .volumeType(EbsDeviceVolumeType.STANDARD)
 * .build();
 * ```
 */
@CdkDslMarker
public class EbsDevicePropsDsl {
    private val cdkBuilder: EbsDeviceProps.Builder = EbsDeviceProps.builder()

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

    /** @param snapshotId The snapshot ID of the volume to use. */
    public fun snapshotId(snapshotId: String) {
        cdkBuilder.snapshotId(snapshotId)
    }

    /**
     * @param volumeSize The volume size, in Gibibytes (GiB). If you specify volumeSize, it must be
     *   equal or greater than the size of the snapshot.
     */
    public fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
    }

    /** @param volumeType The EBS volume type. */
    public fun volumeType(volumeType: EbsDeviceVolumeType) {
        cdkBuilder.volumeType(volumeType)
    }

    public fun build(): EbsDeviceProps = cdkBuilder.build()
}
