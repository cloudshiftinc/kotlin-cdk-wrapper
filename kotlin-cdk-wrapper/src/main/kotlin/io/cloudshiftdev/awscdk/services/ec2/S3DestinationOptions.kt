@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface S3DestinationOptions {
  public fun fileFormat(): FlowLogFileFormat? =
      unwrap(this).getFileFormat()?.let(FlowLogFileFormat::wrap)

  public fun hiveCompatiblePartitions(): Boolean? = unwrap(this).getHiveCompatiblePartitions()

  public fun perHourPartition(): Boolean? = unwrap(this).getPerHourPartition()

  @CdkDslMarker
  public interface Builder {
    public fun fileFormat(fileFormat: FlowLogFileFormat)

    public fun hiveCompatiblePartitions(hiveCompatiblePartitions: Boolean)

    public fun perHourPartition(perHourPartition: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.S3DestinationOptions.Builder =
        software.amazon.awscdk.services.ec2.S3DestinationOptions.builder()

    override fun fileFormat(fileFormat: FlowLogFileFormat) {
      cdkBuilder.fileFormat(fileFormat.let(FlowLogFileFormat::unwrap))
    }

    override fun hiveCompatiblePartitions(hiveCompatiblePartitions: Boolean) {
      cdkBuilder.hiveCompatiblePartitions(hiveCompatiblePartitions)
    }

    override fun perHourPartition(perHourPartition: Boolean) {
      cdkBuilder.perHourPartition(perHourPartition)
    }

    public fun build(): software.amazon.awscdk.services.ec2.S3DestinationOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.S3DestinationOptions,
  ) : CdkObject(cdkObject), S3DestinationOptions {
    override fun fileFormat(): FlowLogFileFormat? =
        unwrap(this).getFileFormat()?.let(FlowLogFileFormat::wrap)

    override fun hiveCompatiblePartitions(): Boolean? = unwrap(this).getHiveCompatiblePartitions()

    override fun perHourPartition(): Boolean? = unwrap(this).getPerHourPartition()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3DestinationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.S3DestinationOptions):
        S3DestinationOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3DestinationOptions):
        software.amazon.awscdk.services.ec2.S3DestinationOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.S3DestinationOptions
  }
}
