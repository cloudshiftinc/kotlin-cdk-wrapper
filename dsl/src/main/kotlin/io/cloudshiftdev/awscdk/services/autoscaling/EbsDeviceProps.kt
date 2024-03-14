package io.cloudshiftdev.awscdk.services.autoscaling

import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface EbsDeviceProps : EbsDeviceSnapshotOptions {
  public fun snapshotId(): String? = unwrap(this).getSnapshotId()

  public interface Builder {
    public fun deleteOnTermination(deleteOnTermination: Boolean)

    public fun iops(iops: Number)

    public fun snapshotId(snapshotId: String)

    public fun throughput(throughput: Number)

    public fun volumeSize(volumeSize: Number)

    public fun volumeType(volumeType: EbsDeviceVolumeType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.EbsDeviceProps.Builder =
        software.amazon.awscdk.services.autoscaling.EbsDeviceProps.builder()

    override fun deleteOnTermination(deleteOnTermination: Boolean) {
      cdkBuilder.deleteOnTermination(deleteOnTermination)
    }

    override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    override fun snapshotId(snapshotId: String) {
      cdkBuilder.snapshotId(snapshotId)
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

    public fun build(): software.amazon.awscdk.services.autoscaling.EbsDeviceProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.autoscaling.EbsDeviceProps,
  ) : EbsDeviceProps {
    override fun deleteOnTermination(): Boolean? = unwrap(this).getDeleteOnTermination()

    override fun iops(): Number? = unwrap(this).getIops()

    override fun snapshotId(): String? = unwrap(this).getSnapshotId()

    override fun throughput(): Number? = unwrap(this).getThroughput()

    override fun volumeSize(): Number? = unwrap(this).getVolumeSize()

    override fun volumeType(): EbsDeviceVolumeType? =
        unwrap(this).getVolumeType()?.let(EbsDeviceVolumeType::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EbsDeviceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.EbsDeviceProps):
        EbsDeviceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EbsDeviceProps):
        software.amazon.awscdk.services.autoscaling.EbsDeviceProps = (wrapped as Wrapper).cdkObject
  }
}
