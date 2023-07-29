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
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule
import software.amazon.awscdk.services.sagemaker.CfnMonitoringScheduleProps

/**
 * Properties for defining a `CfnMonitoringSchedule`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CfnMonitoringScheduleProps cfnMonitoringScheduleProps = CfnMonitoringScheduleProps.builder()
 * .monitoringScheduleConfig(MonitoringScheduleConfigProperty.builder()
 * .monitoringJobDefinition(MonitoringJobDefinitionProperty.builder()
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
 * .build())
 * .monitoringJobDefinitionName("monitoringJobDefinitionName")
 * .monitoringType("monitoringType")
 * .scheduleConfig(ScheduleConfigProperty.builder()
 * .scheduleExpression("scheduleExpression")
 * .build())
 * .build())
 * .monitoringScheduleName("monitoringScheduleName")
 * // the properties below are optional
 * .endpointName("endpointName")
 * .failureReason("failureReason")
 * .lastMonitoringExecutionSummary(MonitoringExecutionSummaryProperty.builder()
 * .creationTime("creationTime")
 * .lastModifiedTime("lastModifiedTime")
 * .monitoringExecutionStatus("monitoringExecutionStatus")
 * .monitoringScheduleName("monitoringScheduleName")
 * .scheduledTime("scheduledTime")
 * // the properties below are optional
 * .endpointName("endpointName")
 * .failureReason("failureReason")
 * .processingJobArn("processingJobArn")
 * .build())
 * .monitoringScheduleStatus("monitoringScheduleStatus")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html)
 */
@CdkDslMarker
public class CfnMonitoringSchedulePropsDsl {
    private val cdkBuilder: CfnMonitoringScheduleProps.Builder =
        CfnMonitoringScheduleProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param endpointName The name of the endpoint using the monitoring schedule. */
    public fun endpointName(endpointName: String) {
        cdkBuilder.endpointName(endpointName)
    }

    /** @param failureReason Contains the reason a monitoring job failed, if it failed. */
    public fun failureReason(failureReason: String) {
        cdkBuilder.failureReason(failureReason)
    }

    /**
     * @param lastMonitoringExecutionSummary Describes metadata on the last execution to run, if
     *   there was one.
     */
    public fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: IResolvable) {
        cdkBuilder.lastMonitoringExecutionSummary(lastMonitoringExecutionSummary)
    }

    /**
     * @param lastMonitoringExecutionSummary Describes metadata on the last execution to run, if
     *   there was one.
     */
    public fun lastMonitoringExecutionSummary(
        lastMonitoringExecutionSummary: CfnMonitoringSchedule.MonitoringExecutionSummaryProperty
    ) {
        cdkBuilder.lastMonitoringExecutionSummary(lastMonitoringExecutionSummary)
    }

    /**
     * @param monitoringScheduleConfig The configuration object that specifies the monitoring
     *   schedule and defines the monitoring job.
     */
    public fun monitoringScheduleConfig(monitoringScheduleConfig: IResolvable) {
        cdkBuilder.monitoringScheduleConfig(monitoringScheduleConfig)
    }

    /**
     * @param monitoringScheduleConfig The configuration object that specifies the monitoring
     *   schedule and defines the monitoring job.
     */
    public fun monitoringScheduleConfig(
        monitoringScheduleConfig: CfnMonitoringSchedule.MonitoringScheduleConfigProperty
    ) {
        cdkBuilder.monitoringScheduleConfig(monitoringScheduleConfig)
    }

    /** @param monitoringScheduleName The name of the monitoring schedule. */
    public fun monitoringScheduleName(monitoringScheduleName: String) {
        cdkBuilder.monitoringScheduleName(monitoringScheduleName)
    }

    /** @param monitoringScheduleStatus The status of the monitoring schedule. */
    public fun monitoringScheduleStatus(monitoringScheduleStatus: String) {
        cdkBuilder.monitoringScheduleStatus(monitoringScheduleStatus)
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

    public fun build(): CfnMonitoringScheduleProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
