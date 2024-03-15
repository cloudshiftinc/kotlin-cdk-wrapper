@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Number
import kotlin.Unit

/**
 * ML compute instances for the transform job.
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
public interface TransformResources {
  /**
   * Number of ML compute instances to use in the transform job.
   */
  public fun instanceCount(): Number

  /**
   * ML compute instance type for the transform job.
   */
  public fun instanceType(): InstanceType

  /**
   * AWS KMS key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML
   * compute instance(s).
   *
   * Default: - None
   */
  public fun volumeEncryptionKey(): IKey? = unwrap(this).getVolumeEncryptionKey()?.let(IKey::wrap)

  /**
   * A builder for [TransformResources]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param instanceCount Number of ML compute instances to use in the transform job. 
     */
    public fun instanceCount(instanceCount: Number)

    /**
     * @param instanceType ML compute instance type for the transform job. 
     */
    public fun instanceType(instanceType: InstanceType)

    /**
     * @param volumeEncryptionKey AWS KMS key that Amazon SageMaker uses to encrypt data on the
     * storage volume attached to the ML compute instance(s).
     */
    public fun volumeEncryptionKey(volumeEncryptionKey: IKey)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.TransformResources.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.TransformResources.builder()

    /**
     * @param instanceCount Number of ML compute instances to use in the transform job. 
     */
    override fun instanceCount(instanceCount: Number) {
      cdkBuilder.instanceCount(instanceCount)
    }

    /**
     * @param instanceType ML compute instance type for the transform job. 
     */
    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    /**
     * @param volumeEncryptionKey AWS KMS key that Amazon SageMaker uses to encrypt data on the
     * storage volume attached to the ML compute instance(s).
     */
    override fun volumeEncryptionKey(volumeEncryptionKey: IKey) {
      cdkBuilder.volumeEncryptionKey(volumeEncryptionKey.let(IKey::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.TransformResources =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.TransformResources,
  ) : CdkObject(cdkObject), TransformResources {
    /**
     * Number of ML compute instances to use in the transform job.
     */
    override fun instanceCount(): Number = unwrap(this).getInstanceCount()

    /**
     * ML compute instance type for the transform job.
     */
    override fun instanceType(): InstanceType =
        unwrap(this).getInstanceType().let(InstanceType::wrap)

    /**
     * AWS KMS key that Amazon SageMaker uses to encrypt data on the storage volume attached to the
     * ML compute instance(s).
     *
     * Default: - None
     */
    override fun volumeEncryptionKey(): IKey? =
        unwrap(this).getVolumeEncryptionKey()?.let(IKey::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TransformResources {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.TransformResources):
        TransformResources = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TransformResources):
        software.amazon.awscdk.services.stepfunctions.tasks.TransformResources = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.TransformResources
  }
}
