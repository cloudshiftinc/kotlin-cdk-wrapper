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

package io.cloudshiftdev.awscdkdsl.services.kinesisanalyticsv2

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationProps

/**
 * Properties for defining a `CfnApplication`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
 * .runtimeEnvironment("runtimeEnvironment")
 * .serviceExecutionRole("serviceExecutionRole")
 * // the properties below are optional
 * .applicationConfiguration(ApplicationConfigurationProperty.builder()
 * .applicationCodeConfiguration(ApplicationCodeConfigurationProperty.builder()
 * .codeContent(CodeContentProperty.builder()
 * .s3ContentLocation(S3ContentLocationProperty.builder()
 * .bucketArn("bucketArn")
 * .fileKey("fileKey")
 * // the properties below are optional
 * .objectVersion("objectVersion")
 * .build())
 * .textContent("textContent")
 * .zipFileContent("zipFileContent")
 * .build())
 * .codeContentType("codeContentType")
 * .build())
 * .applicationSnapshotConfiguration(ApplicationSnapshotConfigurationProperty.builder()
 * .snapshotsEnabled(false)
 * .build())
 * .environmentProperties(EnvironmentPropertiesProperty.builder()
 * .propertyGroups(List.of(PropertyGroupProperty.builder()
 * .propertyGroupId("propertyGroupId")
 * .propertyMap(Map.of(
 * "propertyMapKey", "propertyMap"))
 * .build()))
 * .build())
 * .flinkApplicationConfiguration(FlinkApplicationConfigurationProperty.builder()
 * .checkpointConfiguration(CheckpointConfigurationProperty.builder()
 * .configurationType("configurationType")
 * // the properties below are optional
 * .checkpointingEnabled(false)
 * .checkpointInterval(123)
 * .minPauseBetweenCheckpoints(123)
 * .build())
 * .monitoringConfiguration(MonitoringConfigurationProperty.builder()
 * .configurationType("configurationType")
 * // the properties below are optional
 * .logLevel("logLevel")
 * .metricsLevel("metricsLevel")
 * .build())
 * .parallelismConfiguration(ParallelismConfigurationProperty.builder()
 * .configurationType("configurationType")
 * // the properties below are optional
 * .autoScalingEnabled(false)
 * .parallelism(123)
 * .parallelismPerKpu(123)
 * .build())
 * .build())
 * .sqlApplicationConfiguration(SqlApplicationConfigurationProperty.builder()
 * .inputs(List.of(InputProperty.builder()
 * .inputSchema(InputSchemaProperty.builder()
 * .recordColumns(List.of(RecordColumnProperty.builder()
 * .name("name")
 * .sqlType("sqlType")
 * // the properties below are optional
 * .mapping("mapping")
 * .build()))
 * .recordFormat(RecordFormatProperty.builder()
 * .recordFormatType("recordFormatType")
 * // the properties below are optional
 * .mappingParameters(MappingParametersProperty.builder()
 * .csvMappingParameters(CSVMappingParametersProperty.builder()
 * .recordColumnDelimiter("recordColumnDelimiter")
 * .recordRowDelimiter("recordRowDelimiter")
 * .build())
 * .jsonMappingParameters(JSONMappingParametersProperty.builder()
 * .recordRowPath("recordRowPath")
 * .build())
 * .build())
 * .build())
 * // the properties below are optional
 * .recordEncoding("recordEncoding")
 * .build())
 * .namePrefix("namePrefix")
 * // the properties below are optional
 * .inputParallelism(InputParallelismProperty.builder()
 * .count(123)
 * .build())
 * .inputProcessingConfiguration(InputProcessingConfigurationProperty.builder()
 * .inputLambdaProcessor(InputLambdaProcessorProperty.builder()
 * .resourceArn("resourceArn")
 * .build())
 * .build())
 * .kinesisFirehoseInput(KinesisFirehoseInputProperty.builder()
 * .resourceArn("resourceArn")
 * .build())
 * .kinesisStreamsInput(KinesisStreamsInputProperty.builder()
 * .resourceArn("resourceArn")
 * .build())
 * .build()))
 * .build())
 * .vpcConfigurations(List.of(VpcConfigurationProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build()))
 * .zeppelinApplicationConfiguration(ZeppelinApplicationConfigurationProperty.builder()
 * .catalogConfiguration(CatalogConfigurationProperty.builder()
 * .glueDataCatalogConfiguration(GlueDataCatalogConfigurationProperty.builder()
 * .databaseArn("databaseArn")
 * .build())
 * .build())
 * .customArtifactsConfiguration(List.of(CustomArtifactConfigurationProperty.builder()
 * .artifactType("artifactType")
 * // the properties below are optional
 * .mavenReference(MavenReferenceProperty.builder()
 * .artifactId("artifactId")
 * .groupId("groupId")
 * .version("version")
 * .build())
 * .s3ContentLocation(S3ContentLocationProperty.builder()
 * .bucketArn("bucketArn")
 * .fileKey("fileKey")
 * // the properties below are optional
 * .objectVersion("objectVersion")
 * .build())
 * .build()))
 * .deployAsApplicationConfiguration(DeployAsApplicationConfigurationProperty.builder()
 * .s3ContentLocation(S3ContentBaseLocationProperty.builder()
 * .bucketArn("bucketArn")
 * // the properties below are optional
 * .basePath("basePath")
 * .build())
 * .build())
 * .monitoringConfiguration(ZeppelinMonitoringConfigurationProperty.builder()
 * .logLevel("logLevel")
 * .build())
 * .build())
 * .build())
 * .applicationDescription("applicationDescription")
 * .applicationMaintenanceConfiguration(ApplicationMaintenanceConfigurationProperty.builder()
 * .applicationMaintenanceWindowStartTime("applicationMaintenanceWindowStartTime")
 * .build())
 * .applicationMode("applicationMode")
 * .applicationName("applicationName")
 * .runConfiguration(RunConfigurationProperty.builder()
 * .applicationRestoreConfiguration(ApplicationRestoreConfigurationProperty.builder()
 * .applicationRestoreType("applicationRestoreType")
 * // the properties below are optional
 * .snapshotName("snapshotName")
 * .build())
 * .flinkRunConfiguration(FlinkRunConfigurationProperty.builder()
 * .allowNonRestoredState(false)
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html)
 */
@CdkDslMarker
public class CfnApplicationPropsDsl {
    private val cdkBuilder: CfnApplicationProps.Builder = CfnApplicationProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param applicationConfiguration Use this parameter to configure the application. */
    public fun applicationConfiguration(applicationConfiguration: IResolvable) {
        cdkBuilder.applicationConfiguration(applicationConfiguration)
    }

    /** @param applicationConfiguration Use this parameter to configure the application. */
    public fun applicationConfiguration(
        applicationConfiguration: CfnApplication.ApplicationConfigurationProperty
    ) {
        cdkBuilder.applicationConfiguration(applicationConfiguration)
    }

    /** @param applicationDescription The description of the application. */
    public fun applicationDescription(applicationDescription: String) {
        cdkBuilder.applicationDescription(applicationDescription)
    }

    /**
     * @param applicationMaintenanceConfiguration Describes the maintenance configuration for the
     *   application.
     */
    public fun applicationMaintenanceConfiguration(
        applicationMaintenanceConfiguration: IResolvable
    ) {
        cdkBuilder.applicationMaintenanceConfiguration(applicationMaintenanceConfiguration)
    }

    /**
     * @param applicationMaintenanceConfiguration Describes the maintenance configuration for the
     *   application.
     */
    public fun applicationMaintenanceConfiguration(
        applicationMaintenanceConfiguration:
            CfnApplication.ApplicationMaintenanceConfigurationProperty
    ) {
        cdkBuilder.applicationMaintenanceConfiguration(applicationMaintenanceConfiguration)
    }

    /**
     * @param applicationMode To create a Kinesis Data Analytics Studio notebook, you must set the
     *   mode to `INTERACTIVE` . However, for a Kinesis Data Analytics for Apache Flink application,
     *   the mode is optional.
     */
    public fun applicationMode(applicationMode: String) {
        cdkBuilder.applicationMode(applicationMode)
    }

    /** @param applicationName The name of the application. */
    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    /**
     * @param runConfiguration Identifies the run configuration (start parameters) of a Kinesis Data
     *   Analytics application. This section is evaluated only on stack updates for applications in
     *   running RUNNING state and has no effect during manual application start.
     */
    public fun runConfiguration(runConfiguration: IResolvable) {
        cdkBuilder.runConfiguration(runConfiguration)
    }

    /**
     * @param runConfiguration Identifies the run configuration (start parameters) of a Kinesis Data
     *   Analytics application. This section is evaluated only on stack updates for applications in
     *   running RUNNING state and has no effect during manual application start.
     */
    public fun runConfiguration(runConfiguration: CfnApplication.RunConfigurationProperty) {
        cdkBuilder.runConfiguration(runConfiguration)
    }

    /** @param runtimeEnvironment The runtime environment for the application. */
    public fun runtimeEnvironment(runtimeEnvironment: String) {
        cdkBuilder.runtimeEnvironment(runtimeEnvironment)
    }

    /**
     * @param serviceExecutionRole Specifies the IAM role that the application uses to access
     *   external resources.
     */
    public fun serviceExecutionRole(serviceExecutionRole: String) {
        cdkBuilder.serviceExecutionRole(serviceExecutionRole)
    }

    /**
     * @param tags A list of one or more tags to assign to the application. A tag is a key-value
     *   pair that identifies an application. Note that the maximum number of application tags
     *   includes system tags. The maximum number of user-defined application tags is 50.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A list of one or more tags to assign to the application. A tag is a key-value
     *   pair that identifies an application. Note that the maximum number of application tags
     *   includes system tags. The maximum number of user-defined application tags is 50.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnApplicationProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
