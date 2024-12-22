@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Number
import kotlin.Unit

/**
 * Specifies the resources, ML compute instances, and ML storage volumes to deploy for model
 * training.
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
 * .s3OutputLocation(S3Location.fromBucket(Bucket.fromBucketName(this, "Bucket",
 * "amzn-s3-demo-bucket"), "myoutputpath"))
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
public interface ResourceConfig {
  /**
   * The number of ML compute instances to use.
   *
   * Default: 1 instance.
   */
  public fun instanceCount(): Number

  /**
   * ML compute instance type.
   *
   * To provide an instance type from the task input, supply an instance type in the following way
   * where the value in the task input is an EC2 instance type prepended with "ml.":
   *
   * ```
   * new InstanceType(JsonPath.stringAt("$.path.to.instanceType"));
   * ```
   *
   * Default: ec2.InstanceType(ec2.InstanceClass.M4, ec2.InstanceType.XLARGE)
   *
   * [Documentation](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_ResourceConfig.html#sagemaker-Type-ResourceConfig-InstanceType)
   */
  public fun instanceType(): InstanceType

  /**
   * KMS key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML
   * compute instance(s) that run the training job.
   *
   * Default: - Amazon SageMaker uses the default KMS key for Amazon S3 for your role's account
   */
  public fun volumeEncryptionKey(): IKey? = unwrap(this).getVolumeEncryptionKey()?.let(IKey::wrap)

  /**
   * Size of the ML storage volume that you want to provision.
   *
   * Default: 10 GB EBS volume.
   */
  public fun volumeSize(): Size

  /**
   * A builder for [ResourceConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param instanceCount The number of ML compute instances to use. 
     */
    public fun instanceCount(instanceCount: Number)

    /**
     * @param instanceType ML compute instance type. 
     * To provide an instance type from the task input, supply an instance type in the following way
     * where the value in the task input is an EC2 instance type prepended with "ml.":
     *
     * ```
     * new InstanceType(JsonPath.stringAt("$.path.to.instanceType"));
     * ```
     */
    public fun instanceType(instanceType: InstanceType)

    /**
     * @param volumeEncryptionKey KMS key that Amazon SageMaker uses to encrypt data on the storage
     * volume attached to the ML compute instance(s) that run the training job.
     */
    public fun volumeEncryptionKey(volumeEncryptionKey: IKey)

    /**
     * @param volumeSize Size of the ML storage volume that you want to provision. 
     */
    public fun volumeSize(volumeSize: Size)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.ResourceConfig.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.ResourceConfig.builder()

    /**
     * @param instanceCount The number of ML compute instances to use. 
     */
    override fun instanceCount(instanceCount: Number) {
      cdkBuilder.instanceCount(instanceCount)
    }

    /**
     * @param instanceType ML compute instance type. 
     * To provide an instance type from the task input, supply an instance type in the following way
     * where the value in the task input is an EC2 instance type prepended with "ml.":
     *
     * ```
     * new InstanceType(JsonPath.stringAt("$.path.to.instanceType"));
     * ```
     */
    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType.Companion::unwrap))
    }

    /**
     * @param volumeEncryptionKey KMS key that Amazon SageMaker uses to encrypt data on the storage
     * volume attached to the ML compute instance(s) that run the training job.
     */
    override fun volumeEncryptionKey(volumeEncryptionKey: IKey) {
      cdkBuilder.volumeEncryptionKey(volumeEncryptionKey.let(IKey.Companion::unwrap))
    }

    /**
     * @param volumeSize Size of the ML storage volume that you want to provision. 
     */
    override fun volumeSize(volumeSize: Size) {
      cdkBuilder.volumeSize(volumeSize.let(Size.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.ResourceConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ResourceConfig,
  ) : CdkObject(cdkObject),
      ResourceConfig {
    /**
     * The number of ML compute instances to use.
     *
     * Default: 1 instance.
     */
    override fun instanceCount(): Number = unwrap(this).getInstanceCount()

    /**
     * ML compute instance type.
     *
     * To provide an instance type from the task input, supply an instance type in the following way
     * where the value in the task input is an EC2 instance type prepended with "ml.":
     *
     * ```
     * new InstanceType(JsonPath.stringAt("$.path.to.instanceType"));
     * ```
     *
     * Default: ec2.InstanceType(ec2.InstanceClass.M4, ec2.InstanceType.XLARGE)
     *
     * [Documentation](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_ResourceConfig.html#sagemaker-Type-ResourceConfig-InstanceType)
     */
    override fun instanceType(): InstanceType =
        unwrap(this).getInstanceType().let(InstanceType::wrap)

    /**
     * KMS key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML
     * compute instance(s) that run the training job.
     *
     * Default: - Amazon SageMaker uses the default KMS key for Amazon S3 for your role's account
     */
    override fun volumeEncryptionKey(): IKey? =
        unwrap(this).getVolumeEncryptionKey()?.let(IKey::wrap)

    /**
     * Size of the ML storage volume that you want to provision.
     *
     * Default: 10 GB EBS volume.
     */
    override fun volumeSize(): Size = unwrap(this).getVolumeSize().let(Size::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResourceConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ResourceConfig):
        ResourceConfig = CdkObjectWrappers.wrap(cdkObject) as? ResourceConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResourceConfig):
        software.amazon.awscdk.services.stepfunctions.tasks.ResourceConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.ResourceConfig
  }
}
