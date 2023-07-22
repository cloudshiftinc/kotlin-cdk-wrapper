@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.stepfunctions.tasks.ResourceConfig

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
@CdkDslMarker
public class ResourceConfigDsl {
  private val cdkBuilder: ResourceConfig.Builder = ResourceConfig.builder()

  /**
   * @param instanceCount The number of ML compute instances to use. 
   */
  public fun instanceCount(instanceCount: Number) {
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
  public fun instanceType(instanceType: InstanceType) {
    cdkBuilder.instanceType(instanceType)
  }

  /**
   * @param volumeEncryptionKey KMS key that Amazon SageMaker uses to encrypt data on the storage
   * volume attached to the ML compute instance(s) that run the training job.
   */
  public fun volumeEncryptionKey(volumeEncryptionKey: IKey) {
    cdkBuilder.volumeEncryptionKey(volumeEncryptionKey)
  }

  /**
   * @param volumeSize Size of the ML storage volume that you want to provision. 
   */
  public fun volumeSize(volumeSize: Size) {
    cdkBuilder.volumeSize(volumeSize)
  }

  public fun build(): ResourceConfig = cdkBuilder.build()
}
