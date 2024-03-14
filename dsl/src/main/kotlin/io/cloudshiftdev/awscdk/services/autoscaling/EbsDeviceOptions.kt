package io.cloudshiftdev.awscdk.services.autoscaling

import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public interface EbsDeviceOptions : EbsDeviceOptionsBase {
  public fun encrypted(): Boolean? = unwrap(this).getEncrypted()

  public interface Builder {
    public fun deleteOnTermination(deleteOnTermination: Boolean) {
    }

    public fun encrypted(encrypted: Boolean) {
    }

    public fun iops(iops: Number) {
    }

    public fun throughput(throughput: Number) {
    }

    public fun volumeType(volumeType: EbsDeviceVolumeType) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.EbsDeviceOptions.Builder =
        software.amazon.awscdk.services.autoscaling.EbsDeviceOptions.builder()

    public override fun deleteOnTermination(deleteOnTermination: Boolean) {
      cdkBuilder.deleteOnTermination(deleteOnTermination)
    }

    public override fun encrypted(encrypted: Boolean) {
      cdkBuilder.encrypted(encrypted)
    }

    public override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    public override fun throughput(throughput: Number) {
      cdkBuilder.throughput(throughput)
    }

    public override fun volumeType(volumeType: EbsDeviceVolumeType) {
      cdkBuilder.volumeType(volumeType.let(EbsDeviceVolumeType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.EbsDeviceOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.autoscaling.EbsDeviceOptions,
  ) : EbsDeviceOptions {
    public override fun deleteOnTermination(): Boolean? = unwrap(this).getDeleteOnTermination()

    public override fun encrypted(): Boolean? = unwrap(this).getEncrypted()

    public override fun iops(): Number? = unwrap(this).getIops()

    public override fun throughput(): Number? = unwrap(this).getThroughput()

    public override fun volumeType(): EbsDeviceVolumeType? =
        unwrap(this).getVolumeType()?.let(EbsDeviceVolumeType::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EbsDeviceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.EbsDeviceOptions):
        EbsDeviceOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EbsDeviceOptions):
        software.amazon.awscdk.services.autoscaling.EbsDeviceOptions = (wrapped as
        Wrapper).cdkObject
  }
}
