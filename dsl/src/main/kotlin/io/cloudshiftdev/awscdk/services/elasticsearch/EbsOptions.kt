package io.cloudshiftdev.awscdk.services.elasticsearch

import io.cloudshiftdev.awscdk.services.ec2.EbsDeviceVolumeType
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.Unit

public interface EbsOptions {
  @Deprecated(message = "deprecated in CDK")
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  @Deprecated(message = "deprecated in CDK")
  public fun iops(): Number? = unwrap(this).getIops()

  @Deprecated(message = "deprecated in CDK")
  public fun volumeSize(): Number? = unwrap(this).getVolumeSize()

  @Deprecated(message = "deprecated in CDK")
  public fun volumeType(): EbsDeviceVolumeType? =
      unwrap(this).getVolumeType()?.let(EbsDeviceVolumeType::wrap)

  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    @Deprecated(message = "deprecated in CDK")
    public fun enabled(enabled: Boolean) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun iops(iops: Number) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun volumeSize(volumeSize: Number) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun volumeType(volumeType: EbsDeviceVolumeType) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticsearch.EbsOptions.Builder =
        software.amazon.awscdk.services.elasticsearch.EbsOptions.builder()

    @Deprecated(message = "deprecated in CDK")
    public override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun volumeSize(volumeSize: Number) {
      cdkBuilder.volumeSize(volumeSize)
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun volumeType(volumeType: EbsDeviceVolumeType) {
      cdkBuilder.volumeType(volumeType.let(EbsDeviceVolumeType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticsearch.EbsOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.elasticsearch.EbsOptions,
  ) : EbsOptions {
    @Deprecated(message = "deprecated in CDK")
    public override fun enabled(): Boolean? = unwrap(this).getEnabled()

    @Deprecated(message = "deprecated in CDK")
    public override fun iops(): Number? = unwrap(this).getIops()

    @Deprecated(message = "deprecated in CDK")
    public override fun volumeSize(): Number? = unwrap(this).getVolumeSize()

    @Deprecated(message = "deprecated in CDK")
    public override fun volumeType(): EbsDeviceVolumeType? =
        unwrap(this).getVolumeType()?.let(EbsDeviceVolumeType::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EbsOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.EbsOptions):
        EbsOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EbsOptions):
        software.amazon.awscdk.services.elasticsearch.EbsOptions = (wrapped as Wrapper).cdkObject
  }
}
