@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Location of the channel data.
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
public interface DataSource {
  /**
   * S3 location of the data source that is associated with a channel.
   */
  public fun s3DataSource(): S3DataSource

  /**
   * A builder for [DataSource]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param s3DataSource S3 location of the data source that is associated with a channel. 
     */
    public fun s3DataSource(s3DataSource: S3DataSource)

    /**
     * @param s3DataSource S3 location of the data source that is associated with a channel. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ebbc3bbf36c06c717e037f58161a4876fd4251eb0fb934c9de190c21961c9d1")
    public fun s3DataSource(s3DataSource: S3DataSource.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.tasks.DataSource.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.DataSource.builder()

    /**
     * @param s3DataSource S3 location of the data source that is associated with a channel. 
     */
    override fun s3DataSource(s3DataSource: S3DataSource) {
      cdkBuilder.s3DataSource(s3DataSource.let(S3DataSource.Companion::unwrap))
    }

    /**
     * @param s3DataSource S3 location of the data source that is associated with a channel. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ebbc3bbf36c06c717e037f58161a4876fd4251eb0fb934c9de190c21961c9d1")
    override fun s3DataSource(s3DataSource: S3DataSource.Builder.() -> Unit): Unit =
        s3DataSource(S3DataSource(s3DataSource))

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.DataSource =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DataSource,
  ) : CdkObject(cdkObject), DataSource {
    /**
     * S3 location of the data source that is associated with a channel.
     */
    override fun s3DataSource(): S3DataSource =
        unwrap(this).getS3DataSource().let(S3DataSource::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DataSource {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DataSource):
        DataSource = CdkObjectWrappers.wrap(cdkObject) as? DataSource ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: DataSource):
        software.amazon.awscdk.services.stepfunctions.tasks.DataSource = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.DataSource
  }
}
