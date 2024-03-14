package io.cloudshiftdev.awscdk.services.autoscaling

import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class BlockDeviceVolume internal constructor(
  private val cdkObject: software.amazon.awscdk.services.autoscaling.BlockDeviceVolume,
) {
  public open fun ebsDevice(): EbsDeviceProps? =
      unwrap(this).getEbsDevice()?.let(EbsDeviceProps::wrap)

  public open fun virtualName(): String? = unwrap(this).getVirtualName()

  public companion object {
    public open fun ebs(volumeSize: Number): BlockDeviceVolume =
        software.amazon.awscdk.services.autoscaling.BlockDeviceVolume.ebs(volumeSize).let(BlockDeviceVolume::wrap)

    public open fun ebs(volumeSize: Number, options: EbsDeviceOptions): BlockDeviceVolume =
        software.amazon.awscdk.services.autoscaling.BlockDeviceVolume.ebs(volumeSize,
        options.let(EbsDeviceOptions::unwrap)).let(BlockDeviceVolume::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e337c12e70e7c20d7a26e3d77c0a74a51127cce07791566196e75f0d43459d0c")
    public open fun ebs(volumeSize: Number, options: EbsDeviceOptions.Builder.() -> Unit):
        BlockDeviceVolume = ebs(volumeSize, EbsDeviceOptions(options))

    public open fun ebsFromSnapshot(snapshotId: String): BlockDeviceVolume =
        software.amazon.awscdk.services.autoscaling.BlockDeviceVolume.ebsFromSnapshot(snapshotId).let(BlockDeviceVolume::wrap)

    public open fun ebsFromSnapshot(snapshotId: String, options: EbsDeviceSnapshotOptions):
        BlockDeviceVolume =
        software.amazon.awscdk.services.autoscaling.BlockDeviceVolume.ebsFromSnapshot(snapshotId,
        options.let(EbsDeviceSnapshotOptions::unwrap)).let(BlockDeviceVolume::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d2c4097e9826e13baaeed791f5b14f0e259b1ce41e303a712c6116628f71dca9")
    public open fun ebsFromSnapshot(snapshotId: String,
        options: EbsDeviceSnapshotOptions.Builder.() -> Unit): BlockDeviceVolume =
        ebsFromSnapshot(snapshotId, EbsDeviceSnapshotOptions(options))

    public open fun ephemeral(volumeIndex: Number): BlockDeviceVolume =
        software.amazon.awscdk.services.autoscaling.BlockDeviceVolume.ephemeral(volumeIndex).let(BlockDeviceVolume::wrap)

    public open fun noDevice(): BlockDeviceVolume =
        software.amazon.awscdk.services.autoscaling.BlockDeviceVolume.noDevice().let(BlockDeviceVolume::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.BlockDeviceVolume):
        BlockDeviceVolume = BlockDeviceVolume(cdkObject)

    internal fun unwrap(wrapped: BlockDeviceVolume):
        software.amazon.awscdk.services.autoscaling.BlockDeviceVolume = wrapped.cdkObject
  }
}
