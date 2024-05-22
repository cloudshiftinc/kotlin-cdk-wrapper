@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

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
 * Instance.Builder.create(this, "Instance")
 * .vpc(vpc)
 * .instanceType(instanceType)
 * .machineImage(machineImage)
 * .ebsOptimized(true)
 * .blockDevices(List.of(BlockDevice.builder()
 * .deviceName("/dev/xvda")
 * .volume(BlockDeviceVolume.ebs(8))
 * .build()))
 * .build();
 * ```
 */
public open class BlockDeviceVolume(
  cdkObject: software.amazon.awscdk.services.ec2.BlockDeviceVolume,
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
        software.amazon.awscdk.services.ec2.BlockDeviceVolume.ebs(volumeSize).let(BlockDeviceVolume::wrap)

    public fun ebs(volumeSize: Number, options: EbsDeviceOptions): BlockDeviceVolume =
        software.amazon.awscdk.services.ec2.BlockDeviceVolume.ebs(volumeSize,
        options.let(EbsDeviceOptions.Companion::unwrap)).let(BlockDeviceVolume::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("752c4bbe99b63409bb36621fc7c2f80a68d0a3d98e54b7fdf84efac755ccb9a5")
    public fun ebs(volumeSize: Number, options: EbsDeviceOptions.Builder.() -> Unit):
        BlockDeviceVolume = ebs(volumeSize, EbsDeviceOptions(options))

    public fun ebsFromSnapshot(snapshotId: String): BlockDeviceVolume =
        software.amazon.awscdk.services.ec2.BlockDeviceVolume.ebsFromSnapshot(snapshotId).let(BlockDeviceVolume::wrap)

    public fun ebsFromSnapshot(snapshotId: String, options: EbsDeviceSnapshotOptions):
        BlockDeviceVolume =
        software.amazon.awscdk.services.ec2.BlockDeviceVolume.ebsFromSnapshot(snapshotId,
        options.let(EbsDeviceSnapshotOptions.Companion::unwrap)).let(BlockDeviceVolume::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a06bb97efa2e3c952c8db689f1830dcb411a8f0fb88ce4a16e8ca7ccdd50ae02")
    public fun ebsFromSnapshot(snapshotId: String,
        options: EbsDeviceSnapshotOptions.Builder.() -> Unit): BlockDeviceVolume =
        ebsFromSnapshot(snapshotId, EbsDeviceSnapshotOptions(options))

    public fun ephemeral(volumeIndex: Number): BlockDeviceVolume =
        software.amazon.awscdk.services.ec2.BlockDeviceVolume.ephemeral(volumeIndex).let(BlockDeviceVolume::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.BlockDeviceVolume):
        BlockDeviceVolume = BlockDeviceVolume(cdkObject)

    internal fun unwrap(wrapped: BlockDeviceVolume):
        software.amazon.awscdk.services.ec2.BlockDeviceVolume = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.BlockDeviceVolume
  }
}
