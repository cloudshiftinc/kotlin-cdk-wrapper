@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public interface EbsDeviceSnapshotOptions : EbsDeviceOptionsBase {
  public fun volumeSize(): Number? = unwrap(this).getVolumeSize()

  @CdkDslMarker
  public interface Builder {
    public fun deleteOnTermination(deleteOnTermination: Boolean)

    public fun iops(iops: Number)

    public fun volumeSize(volumeSize: Number)

    public fun volumeType(volumeType: EbsDeviceVolumeType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.EbsDeviceSnapshotOptions.Builder =
        software.amazon.awscdk.services.ec2.EbsDeviceSnapshotOptions.builder()

    override fun deleteOnTermination(deleteOnTermination: Boolean) {
      cdkBuilder.deleteOnTermination(deleteOnTermination)
    }

    override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    override fun volumeSize(volumeSize: Number) {
      cdkBuilder.volumeSize(volumeSize)
    }

    override fun volumeType(volumeType: EbsDeviceVolumeType) {
      cdkBuilder.volumeType(volumeType.let(EbsDeviceVolumeType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.EbsDeviceSnapshotOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.EbsDeviceSnapshotOptions,
  ) : CdkObject(cdkObject), EbsDeviceSnapshotOptions {
    override fun deleteOnTermination(): Boolean? = unwrap(this).getDeleteOnTermination()

    override fun iops(): Number? = unwrap(this).getIops()

    override fun volumeSize(): Number? = unwrap(this).getVolumeSize()

    override fun volumeType(): EbsDeviceVolumeType? =
        unwrap(this).getVolumeType()?.let(EbsDeviceVolumeType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EbsDeviceSnapshotOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.EbsDeviceSnapshotOptions):
        EbsDeviceSnapshotOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EbsDeviceSnapshotOptions):
        software.amazon.awscdk.services.ec2.EbsDeviceSnapshotOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.EbsDeviceSnapshotOptions
  }
}
