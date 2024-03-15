@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Describes a block device mapping for an EC2 instance or Auto Scaling group.
 *
 * Example:
 *
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
public open class BlockDeviceVolume internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.autoscaling.BlockDeviceVolume,
) : CdkObject(cdkObject) {
  /**
   * EBS device info.
   */
  public open fun ebsDevice(): EbsDeviceProps? =
      unwrap(this).getEbsDevice()?.let(EbsDeviceProps::wrap)

  /**
   * Virtual device name.
   */
  public open fun virtualName(): String? = unwrap(this).getVirtualName()

  public companion object {
    public fun ebs(volumeSize: Number): BlockDeviceVolume =
        software.amazon.awscdk.services.autoscaling.BlockDeviceVolume.ebs(volumeSize).let(BlockDeviceVolume::wrap)

    public fun ebs(volumeSize: Number, options: EbsDeviceOptions): BlockDeviceVolume =
        software.amazon.awscdk.services.autoscaling.BlockDeviceVolume.ebs(volumeSize,
        options.let(EbsDeviceOptions::unwrap)).let(BlockDeviceVolume::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e337c12e70e7c20d7a26e3d77c0a74a51127cce07791566196e75f0d43459d0c")
    public fun ebs(volumeSize: Number, options: EbsDeviceOptions.Builder.() -> Unit):
        BlockDeviceVolume = ebs(volumeSize, EbsDeviceOptions(options))

    public fun ebsFromSnapshot(snapshotId: String): BlockDeviceVolume =
        software.amazon.awscdk.services.autoscaling.BlockDeviceVolume.ebsFromSnapshot(snapshotId).let(BlockDeviceVolume::wrap)

    public fun ebsFromSnapshot(snapshotId: String, options: EbsDeviceSnapshotOptions):
        BlockDeviceVolume =
        software.amazon.awscdk.services.autoscaling.BlockDeviceVolume.ebsFromSnapshot(snapshotId,
        options.let(EbsDeviceSnapshotOptions::unwrap)).let(BlockDeviceVolume::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d2c4097e9826e13baaeed791f5b14f0e259b1ce41e303a712c6116628f71dca9")
    public fun ebsFromSnapshot(snapshotId: String,
        options: EbsDeviceSnapshotOptions.Builder.() -> Unit): BlockDeviceVolume =
        ebsFromSnapshot(snapshotId, EbsDeviceSnapshotOptions(options))

    public fun ephemeral(volumeIndex: Number): BlockDeviceVolume =
        software.amazon.awscdk.services.autoscaling.BlockDeviceVolume.ephemeral(volumeIndex).let(BlockDeviceVolume::wrap)

    public fun noDevice(): BlockDeviceVolume =
        software.amazon.awscdk.services.autoscaling.BlockDeviceVolume.noDevice().let(BlockDeviceVolume::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.BlockDeviceVolume):
        BlockDeviceVolume = BlockDeviceVolume(cdkObject)

    internal fun unwrap(wrapped: BlockDeviceVolume):
        software.amazon.awscdk.services.autoscaling.BlockDeviceVolume = wrapped.cdkObject
  }
}
