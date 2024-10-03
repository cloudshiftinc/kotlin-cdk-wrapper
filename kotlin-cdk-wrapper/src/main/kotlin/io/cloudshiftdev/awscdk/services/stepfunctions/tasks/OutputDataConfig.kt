@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Unit

/**
 * Configures the S3 bucket where SageMaker will save the result of model training.
 *
 * Example:
 *
 * ```
 * SageMakerCreateTrainingJob.Builder.create(this, "TrainSagemaker")
 * .trainingJobName(JsonPath.stringAt("$.JobName"))
 * .algorithmSpecification(AlgorithmSpecification.builder()
 * .algorithmName("BlazingText")
 * .trainingInputMode(InputMode.FILE)
 * .build())
 * .inputDataConfig(List.of(Channel.builder()
 * .channelName("train")
 * .dataSource(DataSource.builder()
 * .s3DataSource(S3DataSource.builder()
 * .s3DataType(S3DataType.S3_PREFIX)
 * .s3Location(S3Location.fromJsonExpression("$.S3Bucket"))
 * .build())
 * .build())
 * .build()))
 * .outputDataConfig(OutputDataConfig.builder()
 * .s3OutputLocation(S3Location.fromBucket(Bucket.fromBucketName(this, "Bucket", "mybucket"),
 * "myoutputpath"))
 * .build())
 * .resourceConfig(ResourceConfig.builder()
 * .instanceCount(1)
 * .instanceType(new InstanceType(JsonPath.stringAt("$.InstanceType")))
 * .volumeSize(Size.gibibytes(50))
 * .build()) // optional: default is 1 instance of EC2 `M4.XLarge` with `10GB` volume
 * .stoppingCondition(StoppingCondition.builder()
 * .maxRuntime(Duration.hours(2))
 * .build())
 * .build();
 * ```
 */
public interface OutputDataConfig {
  /**
   * Optional KMS encryption key that Amazon SageMaker uses to encrypt the model artifacts at rest
   * using Amazon S3 server-side encryption.
   *
   * Default: - Amazon SageMaker uses the default KMS key for Amazon S3 for your role's account
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * Identifies the S3 path where you want Amazon SageMaker to store the model artifacts.
   */
  public fun s3OutputLocation(): S3Location

  /**
   * A builder for [OutputDataConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param encryptionKey Optional KMS encryption key that Amazon SageMaker uses to encrypt the
     * model artifacts at rest using Amazon S3 server-side encryption.
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * @param s3OutputLocation Identifies the S3 path where you want Amazon SageMaker to store the
     * model artifacts. 
     */
    public fun s3OutputLocation(s3OutputLocation: S3Location)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig.builder()

    /**
     * @param encryptionKey Optional KMS encryption key that Amazon SageMaker uses to encrypt the
     * model artifacts at rest using Amazon S3 server-side encryption.
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey.Companion::unwrap))
    }

    /**
     * @param s3OutputLocation Identifies the S3 path where you want Amazon SageMaker to store the
     * model artifacts. 
     */
    override fun s3OutputLocation(s3OutputLocation: S3Location) {
      cdkBuilder.s3OutputLocation(s3OutputLocation.let(S3Location.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig,
  ) : CdkObject(cdkObject),
      OutputDataConfig {
    /**
     * Optional KMS encryption key that Amazon SageMaker uses to encrypt the model artifacts at rest
     * using Amazon S3 server-side encryption.
     *
     * Default: - Amazon SageMaker uses the default KMS key for Amazon S3 for your role's account
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * Identifies the S3 path where you want Amazon SageMaker to store the model artifacts.
     */
    override fun s3OutputLocation(): S3Location =
        unwrap(this).getS3OutputLocation().let(S3Location::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OutputDataConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig):
        OutputDataConfig = CdkObjectWrappers.wrap(cdkObject) as? OutputDataConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: OutputDataConfig):
        software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig
  }
}
