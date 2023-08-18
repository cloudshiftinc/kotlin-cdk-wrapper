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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinitionProps

/**
 * Properties for defining a `CfnModelExplainabilityJobDefinition`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CfnModelExplainabilityJobDefinitionProps cfnModelExplainabilityJobDefinitionProps =
 * CfnModelExplainabilityJobDefinitionProps.builder()
 * .jobResources(MonitoringResourcesProperty.builder()
 * .clusterConfig(ClusterConfigProperty.builder()
 * .instanceCount(123)
 * .instanceType("instanceType")
 * .volumeSizeInGb(123)
 * // the properties below are optional
 * .volumeKmsKeyId("volumeKmsKeyId")
 * .build())
 * .build())
 * .modelExplainabilityAppSpecification(ModelExplainabilityAppSpecificationProperty.builder()
 * .configUri("configUri")
 * .imageUri("imageUri")
 * // the properties below are optional
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .build())
 * .modelExplainabilityJobInput(ModelExplainabilityJobInputProperty.builder()
 * .batchTransformInput(BatchTransformInputProperty.builder()
 * .dataCapturedDestinationS3Uri("dataCapturedDestinationS3Uri")
 * .datasetFormat(DatasetFormatProperty.builder()
 * .csv(CsvProperty.builder()
 * .header(false)
 * .build())
 * .json(JsonProperty.builder()
 * .line(false)
 * .build())
 * .parquet(false)
 * .build())
 * .localPath("localPath")
 * // the properties below are optional
 * .featuresAttribute("featuresAttribute")
 * .inferenceAttribute("inferenceAttribute")
 * .probabilityAttribute("probabilityAttribute")
 * .s3DataDistributionType("s3DataDistributionType")
 * .s3InputMode("s3InputMode")
 * .build())
 * .endpointInput(EndpointInputProperty.builder()
 * .endpointName("endpointName")
 * .localPath("localPath")
 * // the properties below are optional
 * .featuresAttribute("featuresAttribute")
 * .inferenceAttribute("inferenceAttribute")
 * .probabilityAttribute("probabilityAttribute")
 * .s3DataDistributionType("s3DataDistributionType")
 * .s3InputMode("s3InputMode")
 * .build())
 * .build())
 * .modelExplainabilityJobOutputConfig(MonitoringOutputConfigProperty.builder()
 * .monitoringOutputs(List.of(MonitoringOutputProperty.builder()
 * .s3Output(S3OutputProperty.builder()
 * .localPath("localPath")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .s3UploadMode("s3UploadMode")
 * .build())
 * .build()))
 * // the properties below are optional
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .roleArn("roleArn")
 * // the properties below are optional
 * .endpointName("endpointName")
 * .jobDefinitionName("jobDefinitionName")
 * .modelExplainabilityBaselineConfig(ModelExplainabilityBaselineConfigProperty.builder()
 * .baseliningJobName("baseliningJobName")
 * .constraintsResource(ConstraintsResourceProperty.builder()
 * .s3Uri("s3Uri")
 * .build())
 * .build())
 * .networkConfig(NetworkConfigProperty.builder()
 * .enableInterContainerTrafficEncryption(false)
 * .enableNetworkIsolation(false)
 * .vpcConfig(VpcConfigProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnets(List.of("subnets"))
 * .build())
 * .build())
 * .stoppingCondition(StoppingConditionProperty.builder()
 * .maxRuntimeInSeconds(123)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html)
 */
@CdkDslMarker
public class CfnModelExplainabilityJobDefinitionPropsDsl {
    private val cdkBuilder: CfnModelExplainabilityJobDefinitionProps.Builder =
        CfnModelExplainabilityJobDefinitionProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param endpointName The name of the endpoint used to run the monitoring job. */
    public fun endpointName(endpointName: String) {
        cdkBuilder.endpointName(endpointName)
    }

    /**
     * @param jobDefinitionName The name of the model explainability job definition. The name must
     *   be unique within an AWS Region in the AWS account.
     */
    public fun jobDefinitionName(jobDefinitionName: String) {
        cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

    /** @param jobResources Identifies the resources to deploy for a monitoring job. */
    public fun jobResources(jobResources: IResolvable) {
        cdkBuilder.jobResources(jobResources)
    }

    /** @param jobResources Identifies the resources to deploy for a monitoring job. */
    public fun jobResources(
        jobResources: CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty
    ) {
        cdkBuilder.jobResources(jobResources)
    }

    /**
     * @param modelExplainabilityAppSpecification Configures the model explainability job to run a
     *   specified Docker container image.
     */
    public fun modelExplainabilityAppSpecification(
        modelExplainabilityAppSpecification: IResolvable
    ) {
        cdkBuilder.modelExplainabilityAppSpecification(modelExplainabilityAppSpecification)
    }

    /**
     * @param modelExplainabilityAppSpecification Configures the model explainability job to run a
     *   specified Docker container image.
     */
    public fun modelExplainabilityAppSpecification(
        modelExplainabilityAppSpecification:
            CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty
    ) {
        cdkBuilder.modelExplainabilityAppSpecification(modelExplainabilityAppSpecification)
    }

    /**
     * @param modelExplainabilityBaselineConfig The baseline configuration for a model
     *   explainability job.
     */
    public fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: IResolvable) {
        cdkBuilder.modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig)
    }

    /**
     * @param modelExplainabilityBaselineConfig The baseline configuration for a model
     *   explainability job.
     */
    public fun modelExplainabilityBaselineConfig(
        modelExplainabilityBaselineConfig:
            CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty
    ) {
        cdkBuilder.modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig)
    }

    /** @param modelExplainabilityJobInput Inputs for the model explainability job. */
    public fun modelExplainabilityJobInput(modelExplainabilityJobInput: IResolvable) {
        cdkBuilder.modelExplainabilityJobInput(modelExplainabilityJobInput)
    }

    /** @param modelExplainabilityJobInput Inputs for the model explainability job. */
    public fun modelExplainabilityJobInput(
        modelExplainabilityJobInput:
            CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty
    ) {
        cdkBuilder.modelExplainabilityJobInput(modelExplainabilityJobInput)
    }

    /** @param modelExplainabilityJobOutputConfig The output configuration for monitoring jobs. */
    public fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: IResolvable) {
        cdkBuilder.modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig)
    }

    /** @param modelExplainabilityJobOutputConfig The output configuration for monitoring jobs. */
    public fun modelExplainabilityJobOutputConfig(
        modelExplainabilityJobOutputConfig:
            CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty
    ) {
        cdkBuilder.modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig)
    }

    /** @param networkConfig Networking options for a model explainability job. */
    public fun networkConfig(networkConfig: IResolvable) {
        cdkBuilder.networkConfig(networkConfig)
    }

    /** @param networkConfig Networking options for a model explainability job. */
    public fun networkConfig(
        networkConfig: CfnModelExplainabilityJobDefinition.NetworkConfigProperty
    ) {
        cdkBuilder.networkConfig(networkConfig)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume
     *   to perform tasks on your behalf.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     *   before stopping.
     */
    public fun stoppingCondition(stoppingCondition: IResolvable) {
        cdkBuilder.stoppingCondition(stoppingCondition)
    }

    /**
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     *   before stopping.
     */
    public fun stoppingCondition(
        stoppingCondition: CfnModelExplainabilityJobDefinition.StoppingConditionProperty
    ) {
        cdkBuilder.stoppingCondition(stoppingCondition)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnModelExplainabilityJobDefinitionProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
