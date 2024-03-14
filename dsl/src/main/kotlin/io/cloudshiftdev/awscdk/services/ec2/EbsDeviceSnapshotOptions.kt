package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public interface EbsDeviceSnapshotOptions : EbsDeviceOptionsBase {
  public fun volumeSize(): Number? = unwrap(this).getVolumeSize()

  public interface Builder {
    public fun deleteOnTermination(deleteOnTermination: Boolean) {
    }

    public fun iops(iops: Number) {
    }

    public fun volumeSize(volumeSize: Number) {
    }

    public fun volumeType(volumeType: EbsDeviceVolumeType) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.EbsDeviceSnapshotOptions.Builder =
        software.amazon.awscdk.services.ec2.EbsDeviceSnapshotOptions.builder()

    public override fun deleteOnTermination(deleteOnTermination: Boolean) {
      cdkBuilder.deleteOnTermination(deleteOnTermination)
    }

    public override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    public override fun volumeSize(volumeSize: Number) {
      cdkBuilder.volumeSize(volumeSize)
    }

    public override fun volumeType(volumeType: EbsDeviceVolumeType) {
      cdkBuilder.volumeType(volumeType.let(EbsDeviceVolumeType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.EbsDeviceSnapshotOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.EbsDeviceSnapshotOptions,
  ) : EbsDeviceSnapshotOptions {
    public override fun deleteOnTermination(): Boolean? = unwrap(this).getDeleteOnTermination()

    public override fun iops(): Number? = unwrap(this).getIops()

    public override fun volumeSize(): Number? = unwrap(this).getVolumeSize()

    public override fun volumeType(): EbsDeviceVolumeType? =
        unwrap(this).getVolumeType()?.let(EbsDeviceVolumeType::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EbsDeviceSnapshotOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.EbsDeviceSnapshotOptions):
        EbsDeviceSnapshotOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EbsDeviceSnapshotOptions):
        software.amazon.awscdk.services.ec2.EbsDeviceSnapshotOptions = (wrapped as
        Wrapper).cdkObject
  }
}
