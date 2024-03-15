@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.EbsDeviceVolumeType
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public interface EbsOptions {
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  public fun iops(): Number? = unwrap(this).getIops()

  public fun throughput(): Number? = unwrap(this).getThroughput()

  public fun volumeSize(): Number? = unwrap(this).getVolumeSize()

  public fun volumeType(): EbsDeviceVolumeType? =
      unwrap(this).getVolumeType()?.let(EbsDeviceVolumeType::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun enabled(enabled: Boolean)

    public fun iops(iops: Number)

    public fun throughput(throughput: Number)

    public fun volumeSize(volumeSize: Number)

    public fun volumeType(volumeType: EbsDeviceVolumeType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opensearchservice.EbsOptions.Builder =
        software.amazon.awscdk.services.opensearchservice.EbsOptions.builder()

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    override fun throughput(throughput: Number) {
      cdkBuilder.throughput(throughput)
    }

    override fun volumeSize(volumeSize: Number) {
      cdkBuilder.volumeSize(volumeSize)
    }

    override fun volumeType(volumeType: EbsDeviceVolumeType) {
      cdkBuilder.volumeType(volumeType.let(EbsDeviceVolumeType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.opensearchservice.EbsOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.opensearchservice.EbsOptions,
  ) : CdkObject(cdkObject), EbsOptions {
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun iops(): Number? = unwrap(this).getIops()

    override fun throughput(): Number? = unwrap(this).getThroughput()

    override fun volumeSize(): Number? = unwrap(this).getVolumeSize()

    override fun volumeType(): EbsDeviceVolumeType? =
        unwrap(this).getVolumeType()?.let(EbsDeviceVolumeType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EbsOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.EbsOptions):
        EbsOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EbsOptions):
        software.amazon.awscdk.services.opensearchservice.EbsOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.opensearchservice.EbsOptions
  }
}
