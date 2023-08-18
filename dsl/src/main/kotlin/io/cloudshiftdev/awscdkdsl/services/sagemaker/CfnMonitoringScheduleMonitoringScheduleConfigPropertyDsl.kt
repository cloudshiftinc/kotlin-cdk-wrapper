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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

/**
 * Configures the monitoring schedule and defines the monitoring job.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * MonitoringScheduleConfigProperty monitoringScheduleConfigProperty =
 * MonitoringScheduleConfigProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringscheduleconfig.html)
 */
@CdkDslMarker
public class CfnMonitoringScheduleMonitoringScheduleConfigPropertyDsl {
    private val cdkBuilder: CfnMonitoringSchedule.MonitoringScheduleConfigProperty.Builder =
        CfnMonitoringSchedule.MonitoringScheduleConfigProperty.builder()

    /** @param monitoringJobDefinition Defines the monitoring job. */
    public fun monitoringJobDefinition(monitoringJobDefinition: IResolvable) {
        cdkBuilder.monitoringJobDefinition(monitoringJobDefinition)
    }

    /** @param monitoringJobDefinition Defines the monitoring job. */
    public fun monitoringJobDefinition(
        monitoringJobDefinition: CfnMonitoringSchedule.MonitoringJobDefinitionProperty
    ) {
        cdkBuilder.monitoringJobDefinition(monitoringJobDefinition)
    }

    /** @param monitoringJobDefinitionName The name of the monitoring job definition to schedule. */
    public fun monitoringJobDefinitionName(monitoringJobDefinitionName: String) {
        cdkBuilder.monitoringJobDefinitionName(monitoringJobDefinitionName)
    }

    /** @param monitoringType The type of the monitoring job definition to schedule. */
    public fun monitoringType(monitoringType: String) {
        cdkBuilder.monitoringType(monitoringType)
    }

    /** @param scheduleConfig Configures the monitoring schedule. */
    public fun scheduleConfig(scheduleConfig: IResolvable) {
        cdkBuilder.scheduleConfig(scheduleConfig)
    }

    /** @param scheduleConfig Configures the monitoring schedule. */
    public fun scheduleConfig(scheduleConfig: CfnMonitoringSchedule.ScheduleConfigProperty) {
        cdkBuilder.scheduleConfig(scheduleConfig)
    }

    public fun build(): CfnMonitoringSchedule.MonitoringScheduleConfigProperty = cdkBuilder.build()
}
