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

package io.cloudshiftdev.awscdkdsl.services.kinesisanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

/**
 * Specifies the creation parameters for a Managed Service for Apache Flink application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * ApplicationConfigurationProperty applicationConfigurationProperty =
 * ApplicationConfigurationProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html)
 */
@CdkDslMarker
public class CfnApplicationV2ApplicationConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.ApplicationConfigurationProperty.Builder =
        CfnApplicationV2.ApplicationConfigurationProperty.builder()

    private val _vpcConfigurations: MutableList<Any> = mutableListOf()

    /**
     * @param applicationCodeConfiguration The code location and type parameters for a Managed
     *   Service for Apache Flink application.
     */
    public fun applicationCodeConfiguration(applicationCodeConfiguration: IResolvable) {
        cdkBuilder.applicationCodeConfiguration(applicationCodeConfiguration)
    }

    /**
     * @param applicationCodeConfiguration The code location and type parameters for a Managed
     *   Service for Apache Flink application.
     */
    public fun applicationCodeConfiguration(
        applicationCodeConfiguration: CfnApplicationV2.ApplicationCodeConfigurationProperty
    ) {
        cdkBuilder.applicationCodeConfiguration(applicationCodeConfiguration)
    }

    /**
     * @param applicationSnapshotConfiguration Describes whether snapshots are enabled for a Managed
     *   Service for Apache Flink application.
     */
    public fun applicationSnapshotConfiguration(applicationSnapshotConfiguration: IResolvable) {
        cdkBuilder.applicationSnapshotConfiguration(applicationSnapshotConfiguration)
    }

    /**
     * @param applicationSnapshotConfiguration Describes whether snapshots are enabled for a Managed
     *   Service for Apache Flink application.
     */
    public fun applicationSnapshotConfiguration(
        applicationSnapshotConfiguration: CfnApplicationV2.ApplicationSnapshotConfigurationProperty
    ) {
        cdkBuilder.applicationSnapshotConfiguration(applicationSnapshotConfiguration)
    }

    /**
     * @param environmentProperties Describes execution properties for a Managed Service for Apache
     *   Flink application.
     */
    public fun environmentProperties(environmentProperties: IResolvable) {
        cdkBuilder.environmentProperties(environmentProperties)
    }

    /**
     * @param environmentProperties Describes execution properties for a Managed Service for Apache
     *   Flink application.
     */
    public fun environmentProperties(
        environmentProperties: CfnApplicationV2.EnvironmentPropertiesProperty
    ) {
        cdkBuilder.environmentProperties(environmentProperties)
    }

    /**
     * @param flinkApplicationConfiguration The creation and update parameters for a Managed Service
     *   for Apache Flink application.
     */
    public fun flinkApplicationConfiguration(flinkApplicationConfiguration: IResolvable) {
        cdkBuilder.flinkApplicationConfiguration(flinkApplicationConfiguration)
    }

    /**
     * @param flinkApplicationConfiguration The creation and update parameters for a Managed Service
     *   for Apache Flink application.
     */
    public fun flinkApplicationConfiguration(
        flinkApplicationConfiguration: CfnApplicationV2.FlinkApplicationConfigurationProperty
    ) {
        cdkBuilder.flinkApplicationConfiguration(flinkApplicationConfiguration)
    }

    /**
     * @param sqlApplicationConfiguration The creation and update parameters for a SQL-based Managed
     *   Service for Apache Flink application.
     */
    public fun sqlApplicationConfiguration(sqlApplicationConfiguration: IResolvable) {
        cdkBuilder.sqlApplicationConfiguration(sqlApplicationConfiguration)
    }

    /**
     * @param sqlApplicationConfiguration The creation and update parameters for a SQL-based Managed
     *   Service for Apache Flink application.
     */
    public fun sqlApplicationConfiguration(
        sqlApplicationConfiguration: CfnApplicationV2.SqlApplicationConfigurationProperty
    ) {
        cdkBuilder.sqlApplicationConfiguration(sqlApplicationConfiguration)
    }

    /**
     * @param vpcConfigurations The array of descriptions of VPC configurations available to the
     *   application.
     */
    public fun vpcConfigurations(vararg vpcConfigurations: Any) {
        _vpcConfigurations.addAll(listOf(*vpcConfigurations))
    }

    /**
     * @param vpcConfigurations The array of descriptions of VPC configurations available to the
     *   application.
     */
    public fun vpcConfigurations(vpcConfigurations: Collection<Any>) {
        _vpcConfigurations.addAll(vpcConfigurations)
    }

    /**
     * @param vpcConfigurations The array of descriptions of VPC configurations available to the
     *   application.
     */
    public fun vpcConfigurations(vpcConfigurations: IResolvable) {
        cdkBuilder.vpcConfigurations(vpcConfigurations)
    }

    /**
     * @param zeppelinApplicationConfiguration The configuration parameters for a Kinesis Data
     *   Analytics Studio notebook.
     */
    public fun zeppelinApplicationConfiguration(zeppelinApplicationConfiguration: IResolvable) {
        cdkBuilder.zeppelinApplicationConfiguration(zeppelinApplicationConfiguration)
    }

    /**
     * @param zeppelinApplicationConfiguration The configuration parameters for a Kinesis Data
     *   Analytics Studio notebook.
     */
    public fun zeppelinApplicationConfiguration(
        zeppelinApplicationConfiguration: CfnApplicationV2.ZeppelinApplicationConfigurationProperty
    ) {
        cdkBuilder.zeppelinApplicationConfiguration(zeppelinApplicationConfiguration)
    }

    public fun build(): CfnApplicationV2.ApplicationConfigurationProperty {
        if (_vpcConfigurations.isNotEmpty()) cdkBuilder.vpcConfigurations(_vpcConfigurations)
        return cdkBuilder.build()
    }
}
