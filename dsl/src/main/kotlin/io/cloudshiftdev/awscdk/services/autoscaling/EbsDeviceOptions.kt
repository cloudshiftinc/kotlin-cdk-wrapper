package io.cloudshiftdev.awscdk.services.autoscaling

import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public interface EbsDeviceOptions : EbsDeviceOptionsBase {
  public fun encrypted(): Boolean? = unwrap(this).getEncrypted()

  public interface Builder {
    public fun deleteOnTermination(deleteOnTermination: Boolean)

    public fun encrypted(encrypted: Boolean)

    public fun iops(iops: Number)

    public fun throughput(throughput: Number)

    public fun volumeType(volumeType: EbsDeviceVolumeType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.EbsDeviceOptions.Builder =
        software.amazon.awscdk.services.autoscaling.EbsDeviceOptions.builder()

    override fun deleteOnTermination(deleteOnTermination: Boolean) {
      cdkBuilder.deleteOnTermination(deleteOnTermination)
    }

    override fun encrypted(encrypted: Boolean) {
      cdkBuilder.encrypted(encrypted)
    }

    override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    override fun throughput(throughput: Number) {
      cdkBuilder.throughput(throughput)
    }

    override fun volumeType(volumeType: EbsDeviceVolumeType) {
      cdkBuilder.volumeType(volumeType.let(EbsDeviceVolumeType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.EbsDeviceOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.autoscaling.EbsDeviceOptions,
  ) : EbsDeviceOptions {
    override fun deleteOnTermination(): Boolean? = unwrap(this).getDeleteOnTermination()

    override fun encrypted(): Boolean? = unwrap(this).getEncrypted()

    override fun iops(): Number? = unwrap(this).getIops()

    override fun throughput(): Number? = unwrap(this).getThroughput()

    override fun volumeType(): EbsDeviceVolumeType? =
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
