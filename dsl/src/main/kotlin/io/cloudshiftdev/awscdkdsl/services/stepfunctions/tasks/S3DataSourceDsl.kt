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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.stepfunctions.tasks.S3DataDistributionType
import software.amazon.awscdk.services.stepfunctions.tasks.S3DataSource
import software.amazon.awscdk.services.stepfunctions.tasks.S3DataType
import software.amazon.awscdk.services.stepfunctions.tasks.S3Location

/**
 * S3 location of the channel data.
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
 *
 * [Documentation](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_S3DataSource.html)
 */
@CdkDslMarker
public class S3DataSourceDsl {
    private val cdkBuilder: S3DataSource.Builder = S3DataSource.builder()

    private val _attributeNames: MutableList<String> = mutableListOf()

    /**
     * @param attributeNames List of one or more attribute names to use that are found in a
     *   specified augmented manifest file.
     */
    public fun attributeNames(vararg attributeNames: String) {
        _attributeNames.addAll(listOf(*attributeNames))
    }

    /**
     * @param attributeNames List of one or more attribute names to use that are found in a
     *   specified augmented manifest file.
     */
    public fun attributeNames(attributeNames: Collection<String>) {
        _attributeNames.addAll(attributeNames)
    }

    /** @param s3DataDistributionType S3 Data Distribution Type. */
    public fun s3DataDistributionType(s3DataDistributionType: S3DataDistributionType) {
        cdkBuilder.s3DataDistributionType(s3DataDistributionType)
    }

    /** @param s3DataType S3 Data Type. */
    public fun s3DataType(s3DataType: S3DataType) {
        cdkBuilder.s3DataType(s3DataType)
    }

    /** @param s3Location S3 Uri. */
    public fun s3Location(s3Location: S3Location) {
        cdkBuilder.s3Location(s3Location)
    }

    public fun build(): S3DataSource {
        if (_attributeNames.isNotEmpty()) cdkBuilder.attributeNames(_attributeNames)
        return cdkBuilder.build()
    }
}
