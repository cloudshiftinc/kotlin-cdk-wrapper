@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * S3 location of the channel data.
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
 *
 * [Documentation](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_S3DataSource.html)
 */
public interface S3DataSource {
  /**
   * List of one or more attribute names to use that are found in a specified augmented manifest
   * file.
   *
   * Default: - No attribute names
   */
  public fun attributeNames(): List<String> = unwrap(this).getAttributeNames() ?: emptyList()

  /**
   * S3 Data Distribution Type.
   *
   * Default: - None
   */
  public fun s3DataDistributionType(): S3DataDistributionType? =
      unwrap(this).getS3DataDistributionType()?.let(S3DataDistributionType::wrap)

  /**
   * S3 Data Type.
   *
   * Default: S3_PREFIX
   */
  public fun s3DataType(): S3DataType? = unwrap(this).getS3DataType()?.let(S3DataType::wrap)

  /**
   * S3 Uri.
   */
  public fun s3Location(): S3Location

  /**
   * A builder for [S3DataSource]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param attributeNames List of one or more attribute names to use that are found in a
     * specified augmented manifest file.
     */
    public fun attributeNames(attributeNames: List<String>)

    /**
     * @param attributeNames List of one or more attribute names to use that are found in a
     * specified augmented manifest file.
     */
    public fun attributeNames(vararg attributeNames: String)

    /**
     * @param s3DataDistributionType S3 Data Distribution Type.
     */
    public fun s3DataDistributionType(s3DataDistributionType: S3DataDistributionType)

    /**
     * @param s3DataType S3 Data Type.
     */
    public fun s3DataType(s3DataType: S3DataType)

    /**
     * @param s3Location S3 Uri. 
     */
    public fun s3Location(s3Location: S3Location)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.tasks.S3DataSource.Builder
        = software.amazon.awscdk.services.stepfunctions.tasks.S3DataSource.builder()

    /**
     * @param attributeNames List of one or more attribute names to use that are found in a
     * specified augmented manifest file.
     */
    override fun attributeNames(attributeNames: List<String>) {
      cdkBuilder.attributeNames(attributeNames)
    }

    /**
     * @param attributeNames List of one or more attribute names to use that are found in a
     * specified augmented manifest file.
     */
    override fun attributeNames(vararg attributeNames: String): Unit =
        attributeNames(attributeNames.toList())

    /**
     * @param s3DataDistributionType S3 Data Distribution Type.
     */
    override fun s3DataDistributionType(s3DataDistributionType: S3DataDistributionType) {
      cdkBuilder.s3DataDistributionType(s3DataDistributionType.let(S3DataDistributionType::unwrap))
    }

    /**
     * @param s3DataType S3 Data Type.
     */
    override fun s3DataType(s3DataType: S3DataType) {
      cdkBuilder.s3DataType(s3DataType.let(S3DataType::unwrap))
    }

    /**
     * @param s3Location S3 Uri. 
     */
    override fun s3Location(s3Location: S3Location) {
      cdkBuilder.s3Location(s3Location.let(S3Location::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.S3DataSource =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.S3DataSource,
  ) : CdkObject(cdkObject), S3DataSource {
    /**
     * List of one or more attribute names to use that are found in a specified augmented manifest
     * file.
     *
     * Default: - No attribute names
     */
    override fun attributeNames(): List<String> = unwrap(this).getAttributeNames() ?: emptyList()

    /**
     * S3 Data Distribution Type.
     *
     * Default: - None
     */
    override fun s3DataDistributionType(): S3DataDistributionType? =
        unwrap(this).getS3DataDistributionType()?.let(S3DataDistributionType::wrap)

    /**
     * S3 Data Type.
     *
     * Default: S3_PREFIX
     */
    override fun s3DataType(): S3DataType? = unwrap(this).getS3DataType()?.let(S3DataType::wrap)

    /**
     * S3 Uri.
     */
    override fun s3Location(): S3Location = unwrap(this).getS3Location().let(S3Location::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3DataSource {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.S3DataSource):
        S3DataSource = CdkObjectWrappers.wrap(cdkObject) as? S3DataSource ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3DataSource):
        software.amazon.awscdk.services.stepfunctions.tasks.S3DataSource = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.S3DataSource
  }
}
