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

package io.cloudshiftdev.awscdkdsl.services.autoscaling

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.services.autoscaling.EbsDeviceOptions
import software.amazon.awscdk.services.autoscaling.EbsDeviceVolumeType

/**
 * Block device options for an EBS volume.
 *
 * Example:
 * ```
 * Vpc vpc;
 * InstanceType instanceType;
 * IMachineImage machineImage;
 * AutoScalingGroup autoScalingGroup = AutoScalingGroup.Builder.create(this, "ASG")
 * .vpc(vpc)
 * .instanceType(instanceType)
 * .machineImage(machineImage)
 * .blockDevices(List.of(BlockDevice.builder()
 * .deviceName("gp3-volume")
 * .volume(BlockDeviceVolume.ebs(15, EbsDeviceOptions.builder()
 * .volumeType(EbsDeviceVolumeType.GP3)
 * .throughput(125)
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
     * @param throughput The throughput that the volume supports, in MiB/s Takes a minimum of 125
     *   and maximum of 1000.
     */
    public fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
    }

    /** @param volumeType The EBS volume type. */
    public fun volumeType(volumeType: EbsDeviceVolumeType) {
        cdkBuilder.volumeType(volumeType)
    }

    public fun build(): EbsDeviceOptions = cdkBuilder.build()
}
