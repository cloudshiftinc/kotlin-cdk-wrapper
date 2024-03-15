@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Location of the channel data.
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
public interface TransformS3DataSource {
  /**
   * S3 Data Type.
   *
   * Default: 'S3Prefix'
   */
  public fun s3DataType(): S3DataType? = unwrap(this).getS3DataType()?.let(S3DataType::wrap)

  /**
   * Identifies either a key name prefix or a manifest.
   */
  public fun s3Uri(): String

  /**
   * A builder for [TransformS3DataSource]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param s3DataType S3 Data Type.
     */
    public fun s3DataType(s3DataType: S3DataType)

    /**
     * @param s3Uri Identifies either a key name prefix or a manifest. 
     */
    public fun s3Uri(s3Uri: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.TransformS3DataSource.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.TransformS3DataSource.builder()

    /**
     * @param s3DataType S3 Data Type.
     */
    override fun s3DataType(s3DataType: S3DataType) {
      cdkBuilder.s3DataType(s3DataType.let(S3DataType::unwrap))
    }

    /**
     * @param s3Uri Identifies either a key name prefix or a manifest. 
     */
    override fun s3Uri(s3Uri: String) {
      cdkBuilder.s3Uri(s3Uri)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.TransformS3DataSource =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.TransformS3DataSource,
  ) : CdkObject(cdkObject), TransformS3DataSource {
    /**
     * S3 Data Type.
     *
     * Default: 'S3Prefix'
     */
    override fun s3DataType(): S3DataType? = unwrap(this).getS3DataType()?.let(S3DataType::wrap)

    /**
     * Identifies either a key name prefix or a manifest.
     */
    override fun s3Uri(): String = unwrap(this).getS3Uri()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TransformS3DataSource {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.TransformS3DataSource):
        TransformS3DataSource = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TransformS3DataSource):
        software.amazon.awscdk.services.stepfunctions.tasks.TransformS3DataSource = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.TransformS3DataSource
  }
}
