package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.services.kms.IKey

public interface EbsDeviceProps : EbsDeviceSnapshotOptions, EbsDeviceOptions {
  public override fun deleteOnTermination(): Boolean? = unwrap(this).getDeleteOnTermination()

  public override fun iops(): Number? = unwrap(this).getIops()

  public fun snapshotId(): String? = unwrap(this).getSnapshotId()

  public override fun volumeType(): EbsDeviceVolumeType? =
      unwrap(this).getVolumeType()?.let(EbsDeviceVolumeType::wrap)

  public interface Builder {
    public fun deleteOnTermination(deleteOnTermination: Boolean) {
    }

    public fun encrypted(encrypted: Boolean) {
    }

    public fun iops(iops: Number) {
    }

    public fun kmsKey(kmsKey: IKey) {
    }

    public fun snapshotId(snapshotId: String) {
    }

    public fun volumeSize(volumeSize: Number) {
    }

    public fun volumeType(volumeType: EbsDeviceVolumeType) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.EbsDeviceProps.Builder =
        software.amazon.awscdk.services.ec2.EbsDeviceProps.builder()

    public override fun deleteOnTermination(deleteOnTermination: Boolean) {
      cdkBuilder.deleteOnTermination(deleteOnTermination)
    }

    public override fun encrypted(encrypted: Boolean) {
      cdkBuilder.encrypted(encrypted)
    }

    public override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    public override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey::unwrap))
    }

    public override fun snapshotId(snapshotId: String) {
      cdkBuilder.snapshotId(snapshotId)
    }

    public override fun volumeSize(volumeSize: Number) {
      cdkBuilder.volumeSize(volumeSize)
    }

    public override fun volumeType(volumeType: EbsDeviceVolumeType) {
      cdkBuilder.volumeType(volumeType.let(EbsDeviceVolumeType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.EbsDeviceProps = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.EbsDeviceProps,
  ) : EbsDeviceProps {
    public override fun deleteOnTermination(): Boolean? = unwrap(this).getDeleteOnTermination()

    public override fun encrypted(): Boolean? = unwrap(this).getEncrypted()

    public override fun iops(): Number? = unwrap(this).getIops()

    public override fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

    public override fun snapshotId(): String? = unwrap(this).getSnapshotId()

    public override fun volumeSize(): Number? = unwrap(this).getVolumeSize()

    public override fun volumeType(): EbsDeviceVolumeType? =
        unwrap(this).getVolumeType()?.let(EbsDeviceVolumeType::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EbsDeviceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.EbsDeviceProps): EbsDeviceProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EbsDeviceProps): software.amazon.awscdk.services.ec2.EbsDeviceProps
        = (wrapped as Wrapper).cdkObject
  }
}
