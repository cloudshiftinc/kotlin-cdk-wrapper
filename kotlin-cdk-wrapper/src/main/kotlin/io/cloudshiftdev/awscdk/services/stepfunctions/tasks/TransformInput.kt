@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Dataset to be transformed and the Amazon S3 location where it is stored.
 *
 * Example:
 *
 * ```
 * SageMakerCreateTransformJob.Builder.create(this, "Batch Inference")
 * .transformJobName("MyTransformJob")
 * .modelName("MyModelName")
 * .modelClientOptions(ModelClientOptions.builder()
 * .invocationsMaxRetries(3) // default is 0
 * .invocationsTimeout(Duration.minutes(5))
 * .build())
 * .transformInput(TransformInput.builder()
 * .transformDataSource(TransformDataSource.builder()
 * .s3DataSource(TransformS3DataSource.builder()
 * .s3Uri("s3://inputbucket/train")
 * .s3DataType(S3DataType.S3_PREFIX)
 * .build())
 * .build())
 * .build())
 * .transformOutput(TransformOutput.builder()
 * .s3OutputPath("s3://outputbucket/TransformJobOutputPath")
 * .build())
 * .transformResources(TransformResources.builder()
 * .instanceCount(1)
 * .instanceType(InstanceType.of(InstanceClass.M4, InstanceSize.XLARGE))
 * .build())
 * .build();
 * ```
 */
public interface TransformInput {
  /**
   * The compression type of the transform data.
   *
   * Default: NONE
   */
  public fun compressionType(): CompressionType? =
      unwrap(this).getCompressionType()?.let(CompressionType::wrap)

  /**
   * Multipurpose internet mail extension (MIME) type of the data.
   *
   * Default: - None
   */
  public fun contentType(): String? = unwrap(this).getContentType()

  /**
   * Method to use to split the transform job's data files into smaller batches.
   *
   * Default: NONE
   */
  public fun splitType(): SplitType? = unwrap(this).getSplitType()?.let(SplitType::wrap)

  /**
   * S3 location of the channel data.
   */
  public fun transformDataSource(): TransformDataSource

  /**
   * A builder for [TransformInput]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param compressionType The compression type of the transform data.
     */
    public fun compressionType(compressionType: CompressionType)

    /**
     * @param contentType Multipurpose internet mail extension (MIME) type of the data.
     */
    public fun contentType(contentType: String)

    /**
     * @param splitType Method to use to split the transform job's data files into smaller batches.
     */
    public fun splitType(splitType: SplitType)

    /**
     * @param transformDataSource S3 location of the channel data. 
     */
    public fun transformDataSource(transformDataSource: TransformDataSource)

    /**
     * @param transformDataSource S3 location of the channel data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f551870120542c8db26a2b12caf7813593a48287a8bf352a51c8dc7371a7c04")
    public fun transformDataSource(transformDataSource: TransformDataSource.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.TransformInput.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.TransformInput.builder()

    /**
     * @param compressionType The compression type of the transform data.
     */
    override fun compressionType(compressionType: CompressionType) {
      cdkBuilder.compressionType(compressionType.let(CompressionType::unwrap))
    }

    /**
     * @param contentType Multipurpose internet mail extension (MIME) type of the data.
     */
    override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    /**
     * @param splitType Method to use to split the transform job's data files into smaller batches.
     */
    override fun splitType(splitType: SplitType) {
      cdkBuilder.splitType(splitType.let(SplitType::unwrap))
    }

    /**
     * @param transformDataSource S3 location of the channel data. 
     */
    override fun transformDataSource(transformDataSource: TransformDataSource) {
      cdkBuilder.transformDataSource(transformDataSource.let(TransformDataSource::unwrap))
    }

    /**
     * @param transformDataSource S3 location of the channel data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f551870120542c8db26a2b12caf7813593a48287a8bf352a51c8dc7371a7c04")
    override fun transformDataSource(transformDataSource: TransformDataSource.Builder.() -> Unit):
        Unit = transformDataSource(TransformDataSource(transformDataSource))

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.TransformInput =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.TransformInput,
  ) : CdkObject(cdkObject), TransformInput {
    /**
     * The compression type of the transform data.
     *
     * Default: NONE
     */
    override fun compressionType(): CompressionType? =
        unwrap(this).getCompressionType()?.let(CompressionType::wrap)

    /**
     * Multipurpose internet mail extension (MIME) type of the data.
     *
     * Default: - None
     */
    override fun contentType(): String? = unwrap(this).getContentType()

    /**
     * Method to use to split the transform job's data files into smaller batches.
     *
     * Default: NONE
     */
    override fun splitType(): SplitType? = unwrap(this).getSplitType()?.let(SplitType::wrap)

    /**
     * S3 location of the channel data.
     */
    override fun transformDataSource(): TransformDataSource =
        unwrap(this).getTransformDataSource().let(TransformDataSource::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TransformInput {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.TransformInput):
        TransformInput = CdkObjectWrappers.wrap(cdkObject) as? TransformInput ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: TransformInput):
        software.amazon.awscdk.services.stepfunctions.tasks.TransformInput = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.TransformInput
  }
}
