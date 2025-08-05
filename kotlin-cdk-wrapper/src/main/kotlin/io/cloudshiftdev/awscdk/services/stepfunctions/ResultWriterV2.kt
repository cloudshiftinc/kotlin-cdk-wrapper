@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Configuration for writing Distributed Map state results to S3 The ResultWriter field cannot be
 * empty.
 *
 * You must specify one of these sets of sub-fields.
 * writerConfig - to preview the formatted output, without saving the results to Amazon S3.
 * bucket and prefix - to save the results to Amazon S3 without additional formatting.
 * All three fields: writerConfig, bucket and prefix - to format the output and save it to Amazon
 * S3.
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
public open class ResultWriterV2(
  cdkObject: software.amazon.awscdk.services.stepfunctions.ResultWriterV2,
) : CdkObject(cdkObject) {
  public constructor(props: ResultWriterV2Props) :
      this(software.amazon.awscdk.services.stepfunctions.ResultWriterV2(props.let(ResultWriterV2Props.Companion::unwrap))
  )

  public constructor(props: ResultWriterV2Props.Builder.() -> Unit) :
      this(ResultWriterV2Props(props)
  )

  /**
   * S3 Bucket in which to save Map Run results.
   */
  public open fun bucket(): IBucket? = unwrap(this).getBucket()?.let(IBucket::wrap)

  /**
   * S3 bucket name in which to save Map Run results, as JsonPath.
   */
  public open fun bucketNamePath(): String? = unwrap(this).getBucketNamePath()

  /**
   * S3 prefix in which to save Map Run results.
   *
   * Default: - No prefix
   */
  public open fun prefix(): String? = unwrap(this).getPrefix()

  /**
   * Compile policy statements to provide relevent permissions to the state machine.
   */
  public open fun providePolicyStatements(): List<PolicyStatement> =
      unwrap(this).providePolicyStatements().map(PolicyStatement::wrap)

  /**
   * Render ResultWriter in ASL JSON format.
   *
   * @param queryLanguage
   */
  public open fun render(): Any = unwrap(this).render()

  /**
   * Render ResultWriter in ASL JSON format.
   *
   * @param queryLanguage
   */
  public open fun render(queryLanguage: QueryLanguage): Any =
      unwrap(this).render(queryLanguage.let(QueryLanguage.Companion::unwrap))

  /**
   * Validate that ResultWriter contains exactly either.
   *
   * [Documentation](bucketNamePath)
   */
  public open fun validateResultWriter(): List<String> = unwrap(this).validateResultWriter()

  /**
   * Configuration to format the output of the Child Workflow executions.
   */
  public open fun writerConfig(): WriterConfig? =
      unwrap(this).getWriterConfig()?.let(WriterConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.ResultWriterV2].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * S3 Bucket in which to save Map Run results.
     *
     * Default: - specify a bucket
     *
     * @param bucket S3 Bucket in which to save Map Run results. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * S3 bucket name in which to save Map Run results, as JsonPath.
     *
     * Default: - no bucket path
     *
     * @param bucketNamePath S3 bucket name in which to save Map Run results, as JsonPath. 
     */
    public fun bucketNamePath(bucketNamePath: String)

    /**
     * S3 prefix in which to save Map Run results.
     *
     * Default: - No prefix
     *
     * @param prefix S3 prefix in which to save Map Run results. 
     */
    public fun prefix(prefix: String)

    /**
     * Configuration to format the output of the Child Workflow executions.
     *
     * Default: - Specify both Transformation and OutputType
     *
     * @param writerConfig Configuration to format the output of the Child Workflow executions. 
     */
    public fun writerConfig(writerConfig: WriterConfig)

    /**
     * Configuration to format the output of the Child Workflow executions.
     *
     * Default: - Specify both Transformation and OutputType
     *
     * @param writerConfig Configuration to format the output of the Child Workflow executions. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c5fa7c3299209b8796eaa217bda51586a39bee88e093518b84e44b90a7c3e81")
    public fun writerConfig(writerConfig: WriterConfig.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.ResultWriterV2.Builder =
        software.amazon.awscdk.services.stepfunctions.ResultWriterV2.Builder.create()

    /**
     * S3 Bucket in which to save Map Run results.
     *
     * Default: - specify a bucket
     *
     * @param bucket S3 Bucket in which to save Map Run results. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket.Companion::unwrap))
    }

    /**
     * S3 bucket name in which to save Map Run results, as JsonPath.
     *
     * Default: - no bucket path
     *
     * @param bucketNamePath S3 bucket name in which to save Map Run results, as JsonPath. 
     */
    override fun bucketNamePath(bucketNamePath: String) {
      cdkBuilder.bucketNamePath(bucketNamePath)
    }

    /**
     * S3 prefix in which to save Map Run results.
     *
     * Default: - No prefix
     *
     * @param prefix S3 prefix in which to save Map Run results. 
     */
    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    /**
     * Configuration to format the output of the Child Workflow executions.
     *
     * Default: - Specify both Transformation and OutputType
     *
     * @param writerConfig Configuration to format the output of the Child Workflow executions. 
     */
    override fun writerConfig(writerConfig: WriterConfig) {
      cdkBuilder.writerConfig(writerConfig.let(WriterConfig.Companion::unwrap))
    }

    /**
     * Configuration to format the output of the Child Workflow executions.
     *
     * Default: - Specify both Transformation and OutputType
     *
     * @param writerConfig Configuration to format the output of the Child Workflow executions. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c5fa7c3299209b8796eaa217bda51586a39bee88e093518b84e44b90a7c3e81")
    override fun writerConfig(writerConfig: WriterConfig.Builder.() -> Unit): Unit =
        writerConfig(WriterConfig(writerConfig))

    public fun build(): software.amazon.awscdk.services.stepfunctions.ResultWriterV2 =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResultWriterV2 {
      val builderImpl = BuilderImpl()
      return ResultWriterV2(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.ResultWriterV2):
        ResultWriterV2 = ResultWriterV2(cdkObject)

    internal fun unwrap(wrapped: ResultWriterV2):
        software.amazon.awscdk.services.stepfunctions.ResultWriterV2 = wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.ResultWriterV2
  }
}
