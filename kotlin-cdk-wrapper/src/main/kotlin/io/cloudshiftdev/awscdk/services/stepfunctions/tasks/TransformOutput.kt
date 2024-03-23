@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit

/**
 * S3 location where you want Amazon SageMaker to save the results from the transform job.
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
public interface TransformOutput {
  /**
   * MIME type used to specify the output data.
   *
   * Default: - None
   */
  public fun accept(): String? = unwrap(this).getAccept()

  /**
   * Defines how to assemble the results of the transform job as a single S3 object.
   *
   * Default: - None
   */
  public fun assembleWith(): AssembleWith? = unwrap(this).getAssembleWith()?.let(AssembleWith::wrap)

  /**
   * AWS KMS key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3
   * server-side encryption.
   *
   * Default: - default KMS key for Amazon S3 for your role's account.
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * S3 path where you want Amazon SageMaker to store the results of the transform job.
   */
  public fun s3OutputPath(): String

  /**
   * A builder for [TransformOutput]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accept MIME type used to specify the output data.
     */
    public fun accept(accept: String)

    /**
     * @param assembleWith Defines how to assemble the results of the transform job as a single S3
     * object.
     */
    public fun assembleWith(assembleWith: AssembleWith)

    /**
     * @param encryptionKey AWS KMS key that Amazon SageMaker uses to encrypt the model artifacts at
     * rest using Amazon S3 server-side encryption.
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * @param s3OutputPath S3 path where you want Amazon SageMaker to store the results of the
     * transform job. 
     */
    public fun s3OutputPath(s3OutputPath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.TransformOutput.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.TransformOutput.builder()

    /**
     * @param accept MIME type used to specify the output data.
     */
    override fun accept(accept: String) {
      cdkBuilder.accept(accept)
    }

    /**
     * @param assembleWith Defines how to assemble the results of the transform job as a single S3
     * object.
     */
    override fun assembleWith(assembleWith: AssembleWith) {
      cdkBuilder.assembleWith(assembleWith.let(AssembleWith::unwrap))
    }

    /**
     * @param encryptionKey AWS KMS key that Amazon SageMaker uses to encrypt the model artifacts at
     * rest using Amazon S3 server-side encryption.
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    /**
     * @param s3OutputPath S3 path where you want Amazon SageMaker to store the results of the
     * transform job. 
     */
    override fun s3OutputPath(s3OutputPath: String) {
      cdkBuilder.s3OutputPath(s3OutputPath)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.TransformOutput =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.TransformOutput,
  ) : CdkObject(cdkObject), TransformOutput {
    /**
     * MIME type used to specify the output data.
     *
     * Default: - None
     */
    override fun accept(): String? = unwrap(this).getAccept()

    /**
     * Defines how to assemble the results of the transform job as a single S3 object.
     *
     * Default: - None
     */
    override fun assembleWith(): AssembleWith? =
        unwrap(this).getAssembleWith()?.let(AssembleWith::wrap)

    /**
     * AWS KMS key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3
     * server-side encryption.
     *
     * Default: - default KMS key for Amazon S3 for your role's account.
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * S3 path where you want Amazon SageMaker to store the results of the transform job.
     */
    override fun s3OutputPath(): String = unwrap(this).getS3OutputPath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TransformOutput {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.TransformOutput):
        TransformOutput = CdkObjectWrappers.wrap(cdkObject) as? TransformOutput ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TransformOutput):
        software.amazon.awscdk.services.stepfunctions.tasks.TransformOutput = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.TransformOutput
  }
}
