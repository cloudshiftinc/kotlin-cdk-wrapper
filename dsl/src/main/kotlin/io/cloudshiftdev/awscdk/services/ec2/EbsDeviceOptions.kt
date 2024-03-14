package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public interface EbsDeviceOptions : EbsDeviceOptionsBase {
  public fun encrypted(): Boolean? = unwrap(this).getEncrypted()

  public fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

  public interface Builder {
    public fun deleteOnTermination(deleteOnTermination: Boolean)

    public fun encrypted(encrypted: Boolean)

    public fun iops(iops: Number)

    public fun kmsKey(kmsKey: IKey)

    public fun volumeType(volumeType: EbsDeviceVolumeType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.EbsDeviceOptions.Builder =
        software.amazon.awscdk.services.ec2.EbsDeviceOptions.builder()

    override fun deleteOnTermination(deleteOnTermination: Boolean) {
      cdkBuilder.deleteOnTermination(deleteOnTermination)
    }

    override fun encrypted(encrypted: Boolean) {
      cdkBuilder.encrypted(encrypted)
    }

    override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey::unwrap))
    }

    override fun volumeType(volumeType: EbsDeviceVolumeType) {
      cdkBuilder.volumeType(volumeType.let(EbsDeviceVolumeType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.EbsDeviceOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.EbsDeviceOptions,
  ) : EbsDeviceOptions {
    override fun deleteOnTermination(): Boolean? = unwrap(this).getDeleteOnTermination()

    override fun encrypted(): Boolean? = unwrap(this).getEncrypted()

    override fun iops(): Number? = unwrap(this).getIops()

    override fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.EbsDeviceOptions):
        EbsDeviceOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EbsDeviceOptions):
        software.amazon.awscdk.services.ec2.EbsDeviceOptions = (wrapped as Wrapper).cdkObject
  }
}
