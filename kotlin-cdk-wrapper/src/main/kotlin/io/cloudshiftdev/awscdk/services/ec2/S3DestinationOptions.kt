@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

/**
 * Options for writing logs to a S3 destination.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * S3DestinationOptions s3DestinationOptions = S3DestinationOptions.builder()
 * .fileFormat(FlowLogFileFormat.PLAIN_TEXT)
 * .hiveCompatiblePartitions(false)
 * .perHourPartition(false)
 * .build();
 * ```
 */
public interface S3DestinationOptions {
  /**
   * The format for the flow log.
   *
   * Default: FlowLogFileFormat.PLAIN_TEXT
   */
  public fun fileFormat(): FlowLogFileFormat? =
      unwrap(this).getFileFormat()?.let(FlowLogFileFormat::wrap)

  /**
   * Use Hive-compatible prefixes for flow logs stored in Amazon S3.
   *
   * Default: false
   */
  public fun hiveCompatiblePartitions(): Boolean? = unwrap(this).getHiveCompatiblePartitions()

  /**
   * Partition the flow log per hour.
   *
   * Default: false
   */
  public fun perHourPartition(): Boolean? = unwrap(this).getPerHourPartition()

  /**
   * A builder for [S3DestinationOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param fileFormat The format for the flow log.
     */
    public fun fileFormat(fileFormat: FlowLogFileFormat)

    /**
     * @param hiveCompatiblePartitions Use Hive-compatible prefixes for flow logs stored in Amazon
     * S3.
     */
    public fun hiveCompatiblePartitions(hiveCompatiblePartitions: Boolean)

    /**
     * @param perHourPartition Partition the flow log per hour.
     */
    public fun perHourPartition(perHourPartition: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.S3DestinationOptions.Builder =
        software.amazon.awscdk.services.ec2.S3DestinationOptions.builder()

    /**
     * @param fileFormat The format for the flow log.
     */
    override fun fileFormat(fileFormat: FlowLogFileFormat) {
      cdkBuilder.fileFormat(fileFormat.let(FlowLogFileFormat::unwrap))
    }

    /**
     * @param hiveCompatiblePartitions Use Hive-compatible prefixes for flow logs stored in Amazon
     * S3.
     */
    override fun hiveCompatiblePartitions(hiveCompatiblePartitions: Boolean) {
      cdkBuilder.hiveCompatiblePartitions(hiveCompatiblePartitions)
    }

    /**
     * @param perHourPartition Partition the flow log per hour.
     */
    override fun perHourPartition(perHourPartition: Boolean) {
      cdkBuilder.perHourPartition(perHourPartition)
    }

    public fun build(): software.amazon.awscdk.services.ec2.S3DestinationOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.S3DestinationOptions,
  ) : CdkObject(cdkObject), S3DestinationOptions {
    /**
     * The format for the flow log.
     *
     * Default: FlowLogFileFormat.PLAIN_TEXT
     */
    override fun fileFormat(): FlowLogFileFormat? =
        unwrap(this).getFileFormat()?.let(FlowLogFileFormat::wrap)

    /**
     * Use Hive-compatible prefixes for flow logs stored in Amazon S3.
     *
     * Default: false
     */
    override fun hiveCompatiblePartitions(): Boolean? = unwrap(this).getHiveCompatiblePartitions()

    /**
     * Partition the flow log per hour.
     *
     * Default: false
     */
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
