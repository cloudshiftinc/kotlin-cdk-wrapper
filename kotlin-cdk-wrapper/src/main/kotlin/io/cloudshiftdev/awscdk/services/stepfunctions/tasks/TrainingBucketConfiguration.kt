@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit

/**
 * S3 bucket configuration for the training data.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * IBucket outputBucket;
 * IBucket trainingBucket;
 * IBucket validationBucket;
 * IKey kmsKey;
 * IVpc vpc;
 * FoundationModel model = FoundationModel.fromFoundationModelId(this, "Model",
 * FoundationModelIdentifier.AMAZON_TITAN_TEXT_G1_EXPRESS_V1);
 * BedrockCreateModelCustomizationJob task = BedrockCreateModelCustomizationJob.Builder.create(this,
 * "CreateModelCustomizationJob")
 * .baseModel(model)
 * .clientRequestToken("MyToken")
 * .customizationType(CustomizationType.FINE_TUNING)
 * .customModelKmsKey(kmsKey)
 * .customModelName("MyCustomModel") // required
 * .customModelTags(List.of(CustomModelTag.builder().key("key1").value("value1").build()))
 * .hyperParameters(Map.of(
 * "batchSize", "10"))
 * .jobName("MyCustomizationJob") // required
 * .jobTags(List.of(CustomModelTag.builder().key("key2").value("value2").build()))
 * .outputData(OutputBucketConfiguration.builder()
 * .bucket(outputBucket) // required
 * .path("output-data/")
 * .build())
 * .trainingData(TrainingBucketConfiguration.builder()
 * .bucket(trainingBucket)
 * .path("training-data/data.json")
 * .build()) // required
 * // If you don't provide validation data, you have to specify `Evaluation percentage`
 * hyperparameter.
 * .validationData(List.of(ValidationBucketConfiguration.builder()
 * .bucket(validationBucket)
 * .path("validation-data/data.json")
 * .build()))
 * .vpcConfig(Map.of(
 * "securityGroups", List.of(SecurityGroup.Builder.create(this, "SecurityGroup").vpc(vpc).build()),
 * "subnets", vpc.getPrivateSubnets()))
 * .build();
 * ```
 */
public interface TrainingBucketConfiguration : DataBucketConfiguration {
  /**
   * A builder for [TrainingBucketConfiguration]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket The S3 bucket. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * @param path Path to file or directory within the bucket.
     */
    public fun path(path: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.TrainingBucketConfiguration.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.TrainingBucketConfiguration.builder()

    /**
     * @param bucket The S3 bucket. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket.Companion::unwrap))
    }

    /**
     * @param path Path to file or directory within the bucket.
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.TrainingBucketConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.TrainingBucketConfiguration,
  ) : CdkObject(cdkObject),
      TrainingBucketConfiguration {
    /**
     * The S3 bucket.
     */
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    /**
     * Path to file or directory within the bucket.
     *
     * Default: - root of the bucket
     */
    override fun path(): String? = unwrap(this).getPath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TrainingBucketConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.TrainingBucketConfiguration):
        TrainingBucketConfiguration = CdkObjectWrappers.wrap(cdkObject) as?
        TrainingBucketConfiguration ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: TrainingBucketConfiguration):
        software.amazon.awscdk.services.stepfunctions.tasks.TrainingBucketConfiguration = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.TrainingBucketConfiguration
  }
}
