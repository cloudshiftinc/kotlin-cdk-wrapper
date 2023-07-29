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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition
import software.constructs.Construct

/**
 * Creates the definition for a model explainability job.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CfnModelExplainabilityJobDefinition cfnModelExplainabilityJobDefinition =
 * CfnModelExplainabilityJobDefinition.Builder.create(this, "MyCfnModelExplainabilityJobDefinition")
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
public class CfnModelExplainabilityJobDefinitionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnModelExplainabilityJobDefinition.Builder =
        CfnModelExplainabilityJobDefinition.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The name of the endpoint used to run the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-endpointname)
     *
     * @param endpointName The name of the endpoint used to run the monitoring job.
     */
    public fun endpointName(endpointName: String) {
        cdkBuilder.endpointName(endpointName)
    }

    /**
     * The name of the model explainability job definition.
     *
     * The name must be unique within an AWS Region in the AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-jobdefinitionname)
     *
     * @param jobDefinitionName The name of the model explainability job definition.
     */
    public fun jobDefinitionName(jobDefinitionName: String) {
        cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

    /**
     * Identifies the resources to deploy for a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-jobresources)
     *
     * @param jobResources Identifies the resources to deploy for a monitoring job.
     */
    public fun jobResources(jobResources: IResolvable) {
        cdkBuilder.jobResources(jobResources)
    }

    /**
     * Identifies the resources to deploy for a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-jobresources)
     *
     * @param jobResources Identifies the resources to deploy for a monitoring job.
     */
    public fun jobResources(
        jobResources: CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty
    ) {
        cdkBuilder.jobResources(jobResources)
    }

    /**
     * Configures the model explainability job to run a specified Docker container image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityappspecification)
     *
     * @param modelExplainabilityAppSpecification Configures the model explainability job to run a
     *   specified Docker container image.
     */
    public fun modelExplainabilityAppSpecification(
        modelExplainabilityAppSpecification: IResolvable
    ) {
        cdkBuilder.modelExplainabilityAppSpecification(modelExplainabilityAppSpecification)
    }

    /**
     * Configures the model explainability job to run a specified Docker container image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityappspecification)
     *
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
     * The baseline configuration for a model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilitybaselineconfig)
     *
     * @param modelExplainabilityBaselineConfig The baseline configuration for a model
     *   explainability job.
     */
    public fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: IResolvable) {
        cdkBuilder.modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig)
    }

    /**
     * The baseline configuration for a model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilitybaselineconfig)
     *
     * @param modelExplainabilityBaselineConfig The baseline configuration for a model
     *   explainability job.
     */
    public fun modelExplainabilityBaselineConfig(
        modelExplainabilityBaselineConfig:
            CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty
    ) {
        cdkBuilder.modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig)
    }

    /**
     * Inputs for the model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjobinput)
     *
     * @param modelExplainabilityJobInput Inputs for the model explainability job.
     */
    public fun modelExplainabilityJobInput(modelExplainabilityJobInput: IResolvable) {
        cdkBuilder.modelExplainabilityJobInput(modelExplainabilityJobInput)
    }

    /**
     * Inputs for the model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjobinput)
     *
     * @param modelExplainabilityJobInput Inputs for the model explainability job.
     */
    public fun modelExplainabilityJobInput(
        modelExplainabilityJobInput:
            CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty
    ) {
        cdkBuilder.modelExplainabilityJobInput(modelExplainabilityJobInput)
    }

    /**
     * The output configuration for monitoring jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjoboutputconfig)
     *
     * @param modelExplainabilityJobOutputConfig The output configuration for monitoring jobs.
     */
    public fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: IResolvable) {
        cdkBuilder.modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig)
    }

    /**
     * The output configuration for monitoring jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjoboutputconfig)
     *
     * @param modelExplainabilityJobOutputConfig The output configuration for monitoring jobs.
     */
    public fun modelExplainabilityJobOutputConfig(
        modelExplainabilityJobOutputConfig:
            CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty
    ) {
        cdkBuilder.modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig)
    }

    /**
     * Networking options for a model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-networkconfig)
     *
     * @param networkConfig Networking options for a model explainability job.
     */
    public fun networkConfig(networkConfig: IResolvable) {
        cdkBuilder.networkConfig(networkConfig)
    }

    /**
     * Networking options for a model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-networkconfig)
     *
     * @param networkConfig Networking options for a model explainability job.
     */
    public fun networkConfig(
        networkConfig: CfnModelExplainabilityJobDefinition.NetworkConfigProperty
    ) {
        cdkBuilder.networkConfig(networkConfig)
    }

    /**
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform
     * tasks on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-rolearn)
     *
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume
     *   to perform tasks on your behalf.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * A time limit for how long the monitoring job is allowed to run before stopping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-stoppingcondition)
     *
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     *   before stopping.
     */
    public fun stoppingCondition(stoppingCondition: IResolvable) {
        cdkBuilder.stoppingCondition(stoppingCondition)
    }

    /**
     * A time limit for how long the monitoring job is allowed to run before stopping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-stoppingcondition)
     *
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     *   before stopping.
     */
    public fun stoppingCondition(
        stoppingCondition: CfnModelExplainabilityJobDefinition.StoppingConditionProperty
    ) {
        cdkBuilder.stoppingCondition(stoppingCondition)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnModelExplainabilityJobDefinition {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
