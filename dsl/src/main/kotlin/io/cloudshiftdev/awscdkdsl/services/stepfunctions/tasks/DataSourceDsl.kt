@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.stepfunctions.tasks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.DataSource
import software.amazon.awscdk.services.stepfunctions.tasks.S3DataSource

/**
 * Location of the channel data.
 *
 * Example:
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
public class DataSourceDsl {
    private val cdkBuilder: DataSource.Builder = DataSource.builder()

    /** @param s3DataSource S3 location of the data source that is associated with a channel. */
    public fun s3DataSource(s3DataSource: S3DataSourceDsl.() -> Unit = {}) {
        val builder = S3DataSourceDsl()
        builder.apply(s3DataSource)
        cdkBuilder.s3DataSource(builder.build())
    }

    /** @param s3DataSource S3 location of the data source that is associated with a channel. */
    public fun s3DataSource(s3DataSource: S3DataSource) {
        cdkBuilder.s3DataSource(s3DataSource)
    }

    public fun build(): DataSource = cdkBuilder.build()
}
