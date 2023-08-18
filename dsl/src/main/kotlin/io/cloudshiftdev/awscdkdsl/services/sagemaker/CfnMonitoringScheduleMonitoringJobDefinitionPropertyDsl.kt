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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

/**
 * Defines the monitoring job.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * MonitoringJobDefinitionProperty monitoringJobDefinitionProperty =
 * MonitoringJobDefinitionProperty.builder()
 * .monitoringAppSpecification(MonitoringAppSpecificationProperty.builder()
 * .imageUri("imageUri")
 * // the properties below are optional
 * .containerArguments(List.of("containerArguments"))
 * .containerEntrypoint(List.of("containerEntrypoint"))
 * .postAnalyticsProcessorSourceUri("postAnalyticsProcessorSourceUri")
 * .recordPreprocessorSourceUri("recordPreprocessorSourceUri")
 * .build())
 * .monitoringInputs(List.of(MonitoringInputProperty.builder()
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
 * .s3DataDistributionType("s3DataDistributionType")
 * .s3InputMode("s3InputMode")
 * .build())
 * .endpointInput(EndpointInputProperty.builder()
 * .endpointName("endpointName")
 * .localPath("localPath")
 * // the properties below are optional
 * .s3DataDistributionType("s3DataDistributionType")
 * .s3InputMode("s3InputMode")
 * .build())
 * .build()))
 * .monitoringOutputConfig(MonitoringOutputConfigProperty.builder()
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
 * .monitoringResources(MonitoringResourcesProperty.builder()
 * .clusterConfig(ClusterConfigProperty.builder()
 * .instanceCount(123)
 * .instanceType("instanceType")
 * .volumeSizeInGb(123)
 * // the properties below are optional
 * .volumeKmsKeyId("volumeKmsKeyId")
 * .build())
 * .build())
 * .roleArn("roleArn")
 * // the properties below are optional
 * .baselineConfig(BaselineConfigProperty.builder()
 * .constraintsResource(ConstraintsResourceProperty.builder()
 * .s3Uri("s3Uri")
 * .build())
 * .statisticsResource(StatisticsResourceProperty.builder()
 * .s3Uri("s3Uri")
 * .build())
 * .build())
 * .environment(Map.of(
 * "environmentKey", "environment"))
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringjobdefinition.html)
 */
@CdkDslMarker
public class CfnMonitoringScheduleMonitoringJobDefinitionPropertyDsl {
    private val cdkBuilder: CfnMonitoringSchedule.MonitoringJobDefinitionProperty.Builder =
        CfnMonitoringSchedule.MonitoringJobDefinitionProperty.builder()

    private val _monitoringInputs: MutableList<Any> = mutableListOf()

    /**
     * @param baselineConfig Baseline configuration used to validate that the data conforms to the
     *   specified constraints and statistics.
     */
    public fun baselineConfig(baselineConfig: IResolvable) {
        cdkBuilder.baselineConfig(baselineConfig)
    }

    /**
     * @param baselineConfig Baseline configuration used to validate that the data conforms to the
     *   specified constraints and statistics.
     */
    public fun baselineConfig(baselineConfig: CfnMonitoringSchedule.BaselineConfigProperty) {
        cdkBuilder.baselineConfig(baselineConfig)
    }

    /** @param environment Sets the environment variables in the Docker container. */
    public fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
    }

    /** @param environment Sets the environment variables in the Docker container. */
    public fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment)
    }

    /**
     * @param monitoringAppSpecification Configures the monitoring job to run a specified Docker
     *   container image.
     */
    public fun monitoringAppSpecification(monitoringAppSpecification: IResolvable) {
        cdkBuilder.monitoringAppSpecification(monitoringAppSpecification)
    }

    /**
     * @param monitoringAppSpecification Configures the monitoring job to run a specified Docker
     *   container image.
     */
    public fun monitoringAppSpecification(
        monitoringAppSpecification: CfnMonitoringSchedule.MonitoringAppSpecificationProperty
    ) {
        cdkBuilder.monitoringAppSpecification(monitoringAppSpecification)
    }

    /**
     * @param monitoringInputs The array of inputs for the monitoring job. Currently we support
     *   monitoring an Amazon SageMaker Endpoint.
     */
    public fun monitoringInputs(vararg monitoringInputs: Any) {
        _monitoringInputs.addAll(listOf(*monitoringInputs))
    }

    /**
     * @param monitoringInputs The array of inputs for the monitoring job. Currently we support
     *   monitoring an Amazon SageMaker Endpoint.
     */
    public fun monitoringInputs(monitoringInputs: Collection<Any>) {
        _monitoringInputs.addAll(monitoringInputs)
    }

    /**
     * @param monitoringInputs The array of inputs for the monitoring job. Currently we support
     *   monitoring an Amazon SageMaker Endpoint.
     */
    public fun monitoringInputs(monitoringInputs: IResolvable) {
        cdkBuilder.monitoringInputs(monitoringInputs)
    }

    /**
     * @param monitoringOutputConfig The array of outputs from the monitoring job to be uploaded to
     *   Amazon Simple Storage Service (Amazon S3).
     */
    public fun monitoringOutputConfig(monitoringOutputConfig: IResolvable) {
        cdkBuilder.monitoringOutputConfig(monitoringOutputConfig)
    }

    /**
     * @param monitoringOutputConfig The array of outputs from the monitoring job to be uploaded to
     *   Amazon Simple Storage Service (Amazon S3).
     */
    public fun monitoringOutputConfig(
        monitoringOutputConfig: CfnMonitoringSchedule.MonitoringOutputConfigProperty
    ) {
        cdkBuilder.monitoringOutputConfig(monitoringOutputConfig)
    }

    /**
     * @param monitoringResources Identifies the resources, ML compute instances, and ML storage
     *   volumes to deploy for a monitoring job. In distributed processing, you specify more than
     *   one instance.
     */
    public fun monitoringResources(monitoringResources: IResolvable) {
        cdkBuilder.monitoringResources(monitoringResources)
    }

    /**
     * @param monitoringResources Identifies the resources, ML compute instances, and ML storage
     *   volumes to deploy for a monitoring job. In distributed processing, you specify more than
     *   one instance.
     */
    public fun monitoringResources(
        monitoringResources: CfnMonitoringSchedule.MonitoringResourcesProperty
    ) {
        cdkBuilder.monitoringResources(monitoringResources)
    }

    /** @param networkConfig Specifies networking options for an monitoring job. */
    public fun networkConfig(networkConfig: IResolvable) {
        cdkBuilder.networkConfig(networkConfig)
    }

    /** @param networkConfig Specifies networking options for an monitoring job. */
    public fun networkConfig(networkConfig: CfnMonitoringSchedule.NetworkConfigProperty) {
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
     * @param stoppingCondition Specifies a time limit for how long the monitoring job is allowed to
     *   run.
     */
    public fun stoppingCondition(stoppingCondition: IResolvable) {
        cdkBuilder.stoppingCondition(stoppingCondition)
    }

    /**
     * @param stoppingCondition Specifies a time limit for how long the monitoring job is allowed to
     *   run.
     */
    public fun stoppingCondition(
        stoppingCondition: CfnMonitoringSchedule.StoppingConditionProperty
    ) {
        cdkBuilder.stoppingCondition(stoppingCondition)
    }

    public fun build(): CfnMonitoringSchedule.MonitoringJobDefinitionProperty {
        if (_monitoringInputs.isNotEmpty()) cdkBuilder.monitoringInputs(_monitoringInputs)
        return cdkBuilder.build()
    }
}
