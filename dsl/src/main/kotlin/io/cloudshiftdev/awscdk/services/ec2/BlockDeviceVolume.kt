package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class BlockDeviceVolume internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.BlockDeviceVolume,
) {
  public open fun ebsDevice(): EbsDeviceProps? =
      unwrap(this).getEbsDevice()?.let(EbsDeviceProps::wrap)

  public open fun virtualName(): String? = unwrap(this).getVirtualName()

  public companion object {
    public open fun ebs(volumeSize: Number): BlockDeviceVolume =
        software.amazon.awscdk.services.ec2.BlockDeviceVolume.ebs(volumeSize).let(BlockDeviceVolume::wrap)

    public open fun ebs(volumeSize: Number, options: EbsDeviceOptions): BlockDeviceVolume =
        software.amazon.awscdk.services.ec2.BlockDeviceVolume.ebs(volumeSize,
        options.let(EbsDeviceOptions::unwrap)).let(BlockDeviceVolume::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("752c4bbe99b63409bb36621fc7c2f80a68d0a3d98e54b7fdf84efac755ccb9a5")
    public open fun ebs(volumeSize: Number, options: EbsDeviceOptions.Builder.() -> Unit):
        BlockDeviceVolume = ebs(volumeSize, EbsDeviceOptions(options))

    public open fun ebsFromSnapshot(snapshotId: String): BlockDeviceVolume =
        software.amazon.awscdk.services.ec2.BlockDeviceVolume.ebsFromSnapshot(snapshotId).let(BlockDeviceVolume::wrap)

    public open fun ebsFromSnapshot(snapshotId: String, options: EbsDeviceSnapshotOptions):
        BlockDeviceVolume =
        software.amazon.awscdk.services.ec2.BlockDeviceVolume.ebsFromSnapshot(snapshotId,
        options.let(EbsDeviceSnapshotOptions::unwrap)).let(BlockDeviceVolume::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a06bb97efa2e3c952c8db689f1830dcb411a8f0fb88ce4a16e8ca7ccdd50ae02")
    public open fun ebsFromSnapshot(snapshotId: String,
        options: EbsDeviceSnapshotOptions.Builder.() -> Unit): BlockDeviceVolume =
        ebsFromSnapshot(snapshotId, EbsDeviceSnapshotOptions(options))

    public open fun ephemeral(volumeIndex: Number): BlockDeviceVolume =
        software.amazon.awscdk.services.ec2.BlockDeviceVolume.ephemeral(volumeIndex).let(BlockDeviceVolume::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.BlockDeviceVolume):
        BlockDeviceVolume = BlockDeviceVolume(cdkObject)

    internal fun unwrap(wrapped: BlockDeviceVolume):
        software.amazon.awscdk.services.ec2.BlockDeviceVolume = wrapped.cdkObject
  }
}
