@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Interface for Result Writer configuration props.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * // create a bucket
 * Bucket bucket = new Bucket(this, "Bucket");
 * // create a WriterConfig
 * DistributedMap distributedMap = DistributedMap.Builder.create(this, "Distributed Map State")
 * .resultWriterV2(ResultWriterV2.Builder.create()
 * .bucket(bucket)
 * .prefix("my-prefix")
 * .writerConfig(Map.of(
 * "outputType", OutputType.JSONL,
 * "transformation", Transformation.NONE))
 * .build())
 * .build();
 * distributedMap.itemProcessor(new Pass(this, "Pass State"));
 * ```
 */
public interface ResultWriterV2Props {
  /**
   * S3 Bucket in which to save Map Run results.
   *
   * Default: - specify a bucket
   */
  public fun bucket(): IBucket? = unwrap(this).getBucket()?.let(IBucket::wrap)

  /**
   * S3 bucket name in which to save Map Run results, as JsonPath.
   *
   * Default: - no bucket path
   */
  public fun bucketNamePath(): String? = unwrap(this).getBucketNamePath()

  /**
   * S3 prefix in which to save Map Run results.
   *
   * Default: - No prefix
   */
  public fun prefix(): String? = unwrap(this).getPrefix()

  /**
   * Configuration to format the output of the Child Workflow executions.
   *
   * Default: - Specify both Transformation and OutputType
   */
  public fun writerConfig(): WriterConfig? = unwrap(this).getWriterConfig()?.let(WriterConfig::wrap)

  /**
   * A builder for [ResultWriterV2Props]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket S3 Bucket in which to save Map Run results.
     */
    public fun bucket(bucket: IBucket)

    /**
     * @param bucketNamePath S3 bucket name in which to save Map Run results, as JsonPath.
     */
    public fun bucketNamePath(bucketNamePath: String)

    /**
     * @param prefix S3 prefix in which to save Map Run results.
     */
    public fun prefix(prefix: String)

    /**
     * @param writerConfig Configuration to format the output of the Child Workflow executions.
     */
    public fun writerConfig(writerConfig: WriterConfig)

    /**
     * @param writerConfig Configuration to format the output of the Child Workflow executions.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3f184e4d2f0a5f1410ffc4a7867601754804316b7f6367c4b26ec59491d2021")
    public fun writerConfig(writerConfig: WriterConfig.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.ResultWriterV2Props.Builder =
        software.amazon.awscdk.services.stepfunctions.ResultWriterV2Props.builder()

    /**
     * @param bucket S3 Bucket in which to save Map Run results.
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket.Companion::unwrap))
    }

    /**
     * @param bucketNamePath S3 bucket name in which to save Map Run results, as JsonPath.
     */
    override fun bucketNamePath(bucketNamePath: String) {
      cdkBuilder.bucketNamePath(bucketNamePath)
    }

    /**
     * @param prefix S3 prefix in which to save Map Run results.
     */
    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    /**
     * @param writerConfig Configuration to format the output of the Child Workflow executions.
     */
    override fun writerConfig(writerConfig: WriterConfig) {
      cdkBuilder.writerConfig(writerConfig.let(WriterConfig.Companion::unwrap))
    }

    /**
     * @param writerConfig Configuration to format the output of the Child Workflow executions.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3f184e4d2f0a5f1410ffc4a7867601754804316b7f6367c4b26ec59491d2021")
    override fun writerConfig(writerConfig: WriterConfig.Builder.() -> Unit): Unit =
        writerConfig(WriterConfig(writerConfig))

    public fun build(): software.amazon.awscdk.services.stepfunctions.ResultWriterV2Props =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.ResultWriterV2Props,
  ) : CdkObject(cdkObject),
      ResultWriterV2Props {
    /**
     * S3 Bucket in which to save Map Run results.
     *
     * Default: - specify a bucket
     */
    override fun bucket(): IBucket? = unwrap(this).getBucket()?.let(IBucket::wrap)

    /**
     * S3 bucket name in which to save Map Run results, as JsonPath.
     *
     * Default: - no bucket path
     */
    override fun bucketNamePath(): String? = unwrap(this).getBucketNamePath()

    /**
     * S3 prefix in which to save Map Run results.
     *
     * Default: - No prefix
     */
    override fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * Configuration to format the output of the Child Workflow executions.
     *
     * Default: - Specify both Transformation and OutputType
     */
    override fun writerConfig(): WriterConfig? =
        unwrap(this).getWriterConfig()?.let(WriterConfig::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResultWriterV2Props {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.ResultWriterV2Props):
        ResultWriterV2Props = CdkObjectWrappers.wrap(cdkObject) as? ResultWriterV2Props ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResultWriterV2Props):
        software.amazon.awscdk.services.stepfunctions.ResultWriterV2Props = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.ResultWriterV2Props
  }
}
