package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public interface EbsDeviceOptionsBase {
  public fun deleteOnTermination(): Boolean? = unwrap(this).getDeleteOnTermination()

  public fun iops(): Number? = unwrap(this).getIops()

  public fun volumeType(): EbsDeviceVolumeType? =
      unwrap(this).getVolumeType()?.let(EbsDeviceVolumeType::wrap)

  public interface Builder {
    public fun deleteOnTermination(deleteOnTermination: Boolean)

    public fun iops(iops: Number)

    public fun volumeType(volumeType: EbsDeviceVolumeType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.EbsDeviceOptionsBase.Builder =
        software.amazon.awscdk.services.ec2.EbsDeviceOptionsBase.builder()

    override fun deleteOnTermination(deleteOnTermination: Boolean) {
      cdkBuilder.deleteOnTermination(deleteOnTermination)
    }

    override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    override fun volumeType(volumeType: EbsDeviceVolumeType) {
      cdkBuilder.volumeType(volumeType.let(EbsDeviceVolumeType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.EbsDeviceOptionsBase =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.EbsDeviceOptionsBase,
  ) : EbsDeviceOptionsBase {
    override fun deleteOnTermination(): Boolean? = unwrap(this).getDeleteOnTermination()

    override fun iops(): Number? = unwrap(this).getIops()

    override fun volumeType(): EbsDeviceVolumeType? =
        unwrap(this).getVolumeType()?.let(EbsDeviceVolumeType::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EbsDeviceOptionsBase {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.EbsDeviceOptionsBase):
        EbsDeviceOptionsBase = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EbsDeviceOptionsBase):
        software.amazon.awscdk.services.ec2.EbsDeviceOptionsBase = (wrapped as Wrapper).cdkObject
  }
}
