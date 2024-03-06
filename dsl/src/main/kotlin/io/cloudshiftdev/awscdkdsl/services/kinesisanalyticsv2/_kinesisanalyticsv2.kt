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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOptionProps
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutputProps
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationProps
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSource
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSourceProps
import software.constructs.Construct

public object kinesisanalyticsv2 {
    /**
     * Creates an Amazon Kinesis Data Analytics application.
     *
     * For information about creating a Kinesis Data Analytics application, see
     * [Creating an Application](https://docs.aws.amazon.com/managed-flink/latest/java/getting-started.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
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
    public inline fun cfnApplication(
        scope: Construct,
        id: String,
        block: CfnApplicationDsl.() -> Unit = {},
    ): CfnApplication {
        val builder = CfnApplicationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes code configuration for an application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * ApplicationCodeConfigurationProperty applicationCodeConfigurationProperty =
     * ApplicationCodeConfigurationProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationcodeconfiguration.html)
     */
    public inline fun cfnApplicationApplicationCodeConfigurationProperty(
        block: CfnApplicationApplicationCodeConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.ApplicationCodeConfigurationProperty {
        val builder = CfnApplicationApplicationCodeConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the creation parameters for a Managed Service for Apache Flink application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
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
    public inline fun cfnApplicationApplicationConfigurationProperty(
        block: CfnApplicationApplicationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.ApplicationConfigurationProperty {
        val builder = CfnApplicationApplicationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the maintence window parameters for a Kinesis Data Analytics application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * ApplicationMaintenanceConfigurationProperty applicationMaintenanceConfigurationProperty =
     * ApplicationMaintenanceConfigurationProperty.builder()
     * .applicationMaintenanceWindowStartTime("applicationMaintenanceWindowStartTime")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationmaintenanceconfiguration.html)
     */
    public inline fun cfnApplicationApplicationMaintenanceConfigurationProperty(
        block: CfnApplicationApplicationMaintenanceConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.ApplicationMaintenanceConfigurationProperty {
        val builder = CfnApplicationApplicationMaintenanceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the method and snapshot to use when restarting an application using previously
     * saved application state.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * ApplicationRestoreConfigurationProperty applicationRestoreConfigurationProperty =
     * ApplicationRestoreConfigurationProperty.builder()
     * .applicationRestoreType("applicationRestoreType")
     * // the properties below are optional
     * .snapshotName("snapshotName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationrestoreconfiguration.html)
     */
    public inline fun cfnApplicationApplicationRestoreConfigurationProperty(
        block: CfnApplicationApplicationRestoreConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.ApplicationRestoreConfigurationProperty {
        val builder = CfnApplicationApplicationRestoreConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes whether snapshots are enabled for a Managed Service for Apache Flink application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * ApplicationSnapshotConfigurationProperty applicationSnapshotConfigurationProperty =
     * ApplicationSnapshotConfigurationProperty.builder()
     * .snapshotsEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationsnapshotconfiguration.html)
     */
    public inline fun cfnApplicationApplicationSnapshotConfigurationProperty(
        block: CfnApplicationApplicationSnapshotConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.ApplicationSnapshotConfigurationProperty {
        val builder = CfnApplicationApplicationSnapshotConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For a SQL-based Managed Service for Apache Flink application, provides additional mapping
     * information when the record format uses delimiters, such as CSV.
     *
     * For example, the following sample records use CSV format, where the records use the *'\n'* as
     * the row delimiter and a comma (",") as the column delimiter:
     *
     * `"name1", "address1"`
     *
     * `"name2", "address2"`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * CSVMappingParametersProperty cSVMappingParametersProperty =
     * CSVMappingParametersProperty.builder()
     * .recordColumnDelimiter("recordColumnDelimiter")
     * .recordRowDelimiter("recordRowDelimiter")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-csvmappingparameters.html)
     */
    public inline fun cfnApplicationCSVMappingParametersProperty(
        block: CfnApplicationCSVMappingParametersPropertyDsl.() -> Unit = {}
    ): CfnApplication.CSVMappingParametersProperty {
        val builder = CfnApplicationCSVMappingParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration parameters for the default Amazon Glue database.
     *
     * You use this database for SQL queries that you write in a Kinesis Data Analytics Studio
     * notebook.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * CatalogConfigurationProperty catalogConfigurationProperty =
     * CatalogConfigurationProperty.builder()
     * .glueDataCatalogConfiguration(GlueDataCatalogConfigurationProperty.builder()
     * .databaseArn("databaseArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-catalogconfiguration.html)
     */
    public inline fun cfnApplicationCatalogConfigurationProperty(
        block: CfnApplicationCatalogConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.CatalogConfigurationProperty {
        val builder = CfnApplicationCatalogConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an application's checkpointing configuration.
     *
     * Checkpointing is the process of persisting application state for fault tolerance. For more
     * information, see
     * [Checkpoints for Fault Tolerance](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/concepts/programming-model.html#checkpoints-for-fault-tolerance)
     * in the
     * [Apache Flink Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * CheckpointConfigurationProperty checkpointConfigurationProperty =
     * CheckpointConfigurationProperty.builder()
     * .configurationType("configurationType")
     * // the properties below are optional
     * .checkpointingEnabled(false)
     * .checkpointInterval(123)
     * .minPauseBetweenCheckpoints(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html)
     */
    public inline fun cfnApplicationCheckpointConfigurationProperty(
        block: CfnApplicationCheckpointConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.CheckpointConfigurationProperty {
        val builder = CfnApplicationCheckpointConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Adds an Amazon CloudWatch log stream to monitor application configuration errors.
     *
     * Only one *ApplicationCloudWatchLoggingOption* resource can be attached per application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * CfnApplicationCloudWatchLoggingOption cfnApplicationCloudWatchLoggingOption =
     * CfnApplicationCloudWatchLoggingOption.Builder.create(this,
     * "MyCfnApplicationCloudWatchLoggingOption")
     * .applicationName("applicationName")
     * .cloudWatchLoggingOption(CloudWatchLoggingOptionProperty.builder()
     * .logStreamArn("logStreamArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html)
     */
    public inline fun cfnApplicationCloudWatchLoggingOption(
        scope: Construct,
        id: String,
        block: CfnApplicationCloudWatchLoggingOptionDsl.() -> Unit = {},
    ): CfnApplicationCloudWatchLoggingOption {
        val builder = CfnApplicationCloudWatchLoggingOptionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides a description of Amazon CloudWatch logging options, including the log stream Amazon
     * Resource Name (ARN).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * CloudWatchLoggingOptionProperty cloudWatchLoggingOptionProperty =
     * CloudWatchLoggingOptionProperty.builder()
     * .logStreamArn("logStreamArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption.html)
     */
    public inline fun cfnApplicationCloudWatchLoggingOptionCloudWatchLoggingOptionProperty(
        block: CfnApplicationCloudWatchLoggingOptionCloudWatchLoggingOptionPropertyDsl.() -> Unit =
            {}
    ): CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty {
        val builder = CfnApplicationCloudWatchLoggingOptionCloudWatchLoggingOptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApplicationCloudWatchLoggingOption`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * CfnApplicationCloudWatchLoggingOptionProps cfnApplicationCloudWatchLoggingOptionProps =
     * CfnApplicationCloudWatchLoggingOptionProps.builder()
     * .applicationName("applicationName")
     * .cloudWatchLoggingOption(CloudWatchLoggingOptionProperty.builder()
     * .logStreamArn("logStreamArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html)
     */
    public inline fun cfnApplicationCloudWatchLoggingOptionProps(
        block: CfnApplicationCloudWatchLoggingOptionPropsDsl.() -> Unit = {}
    ): CfnApplicationCloudWatchLoggingOptionProps {
        val builder = CfnApplicationCloudWatchLoggingOptionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies either the application code, or the location of the application code, for a Managed
     * Service for Apache Flink application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * CodeContentProperty codeContentProperty = CodeContentProperty.builder()
     * .s3ContentLocation(S3ContentLocationProperty.builder()
     * .bucketArn("bucketArn")
     * .fileKey("fileKey")
     * // the properties below are optional
     * .objectVersion("objectVersion")
     * .build())
     * .textContent("textContent")
     * .zipFileContent("zipFileContent")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html)
     */
    public inline fun cfnApplicationCodeContentProperty(
        block: CfnApplicationCodeContentPropertyDsl.() -> Unit = {}
    ): CfnApplication.CodeContentProperty {
        val builder = CfnApplicationCodeContentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of connectors and user-defined functions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * CustomArtifactConfigurationProperty customArtifactConfigurationProperty =
     * CustomArtifactConfigurationProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-customartifactconfiguration.html)
     */
    public inline fun cfnApplicationCustomArtifactConfigurationProperty(
        block: CfnApplicationCustomArtifactConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.CustomArtifactConfigurationProperty {
        val builder = CfnApplicationCustomArtifactConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The information required to deploy a Kinesis Data Analytics Studio notebook as an application
     * with durable state.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * DeployAsApplicationConfigurationProperty deployAsApplicationConfigurationProperty =
     * DeployAsApplicationConfigurationProperty.builder()
     * .s3ContentLocation(S3ContentBaseLocationProperty.builder()
     * .bucketArn("bucketArn")
     * // the properties below are optional
     * .basePath("basePath")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-deployasapplicationconfiguration.html)
     */
    public inline fun cfnApplicationDeployAsApplicationConfigurationProperty(
        block: CfnApplicationDeployAsApplicationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.DeployAsApplicationConfigurationProperty {
        val builder = CfnApplicationDeployAsApplicationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes execution properties for a Managed Service for Apache Flink application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * EnvironmentPropertiesProperty environmentPropertiesProperty =
     * EnvironmentPropertiesProperty.builder()
     * .propertyGroups(List.of(PropertyGroupProperty.builder()
     * .propertyGroupId("propertyGroupId")
     * .propertyMap(Map.of(
     * "propertyMapKey", "propertyMap"))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-environmentproperties.html)
     */
    public inline fun cfnApplicationEnvironmentPropertiesProperty(
        block: CfnApplicationEnvironmentPropertiesPropertyDsl.() -> Unit = {}
    ): CfnApplication.EnvironmentPropertiesProperty {
        val builder = CfnApplicationEnvironmentPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes configuration parameters for a Managed Service for Apache Flink application or a
     * Studio notebook.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * FlinkApplicationConfigurationProperty flinkApplicationConfigurationProperty =
     * FlinkApplicationConfigurationProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkapplicationconfiguration.html)
     */
    public inline fun cfnApplicationFlinkApplicationConfigurationProperty(
        block: CfnApplicationFlinkApplicationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.FlinkApplicationConfigurationProperty {
        val builder = CfnApplicationFlinkApplicationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the starting parameters for a Managed Service for Apache Flink application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * FlinkRunConfigurationProperty flinkRunConfigurationProperty =
     * FlinkRunConfigurationProperty.builder()
     * .allowNonRestoredState(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkrunconfiguration.html)
     */
    public inline fun cfnApplicationFlinkRunConfigurationProperty(
        block: CfnApplicationFlinkRunConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.FlinkRunConfigurationProperty {
        val builder = CfnApplicationFlinkRunConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of the Glue Data Catalog that you use for Apache Flink SQL queries and
     * table API transforms that you write in an application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * GlueDataCatalogConfigurationProperty glueDataCatalogConfigurationProperty =
     * GlueDataCatalogConfigurationProperty.builder()
     * .databaseArn("databaseArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-gluedatacatalogconfiguration.html)
     */
    public inline fun cfnApplicationGlueDataCatalogConfigurationProperty(
        block: CfnApplicationGlueDataCatalogConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.GlueDataCatalogConfigurationProperty {
        val builder = CfnApplicationGlueDataCatalogConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that contains the Amazon Resource Name (ARN) of the Amazon Lambda function that is
     * used to preprocess records in the stream in a SQL-based Managed Service for Apache Flink
     * application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * InputLambdaProcessorProperty inputLambdaProcessorProperty =
     * InputLambdaProcessorProperty.builder()
     * .resourceArn("resourceArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputlambdaprocessor.html)
     */
    public inline fun cfnApplicationInputLambdaProcessorProperty(
        block: CfnApplicationInputLambdaProcessorPropertyDsl.() -> Unit = {}
    ): CfnApplication.InputLambdaProcessorProperty {
        val builder = CfnApplicationInputLambdaProcessorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For a SQL-based Managed Service for Apache Flink application, describes the number of
     * in-application streams to create for a given streaming source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * InputParallelismProperty inputParallelismProperty = InputParallelismProperty.builder()
     * .count(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputparallelism.html)
     */
    public inline fun cfnApplicationInputParallelismProperty(
        block: CfnApplicationInputParallelismPropertyDsl.() -> Unit = {}
    ): CfnApplication.InputParallelismProperty {
        val builder = CfnApplicationInputParallelismPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For an SQL-based Amazon Kinesis Data Analytics application, describes a processor that is
     * used to preprocess the records in the stream before being processed by your application code.
     *
     * Currently, the only input processor available is
     * [Amazon Lambda](https://docs.aws.amazon.com/lambda/) .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * InputProcessingConfigurationProperty inputProcessingConfigurationProperty =
     * InputProcessingConfigurationProperty.builder()
     * .inputLambdaProcessor(InputLambdaProcessorProperty.builder()
     * .resourceArn("resourceArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputprocessingconfiguration.html)
     */
    public inline fun cfnApplicationInputProcessingConfigurationProperty(
        block: CfnApplicationInputProcessingConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.InputProcessingConfigurationProperty {
        val builder = CfnApplicationInputProcessingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * When you configure the application input for a SQL-based Managed Service for Apache Flink
     * application, you specify the streaming source, the in-application stream name that is
     * created, and the mapping between the two.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * InputProperty inputProperty = InputProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html)
     */
    public inline fun cfnApplicationInputProperty(
        block: CfnApplicationInputPropertyDsl.() -> Unit = {}
    ): CfnApplication.InputProperty {
        val builder = CfnApplicationInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For a SQL-based Managed Service for Apache Flink application, describes the format of the
     * data in the streaming source, and how each data element maps to corresponding columns created
     * in the in-application stream.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * InputSchemaProperty inputSchemaProperty = InputSchemaProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html)
     */
    public inline fun cfnApplicationInputSchemaProperty(
        block: CfnApplicationInputSchemaPropertyDsl.() -> Unit = {}
    ): CfnApplication.InputSchemaProperty {
        val builder = CfnApplicationInputSchemaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For a SQL-based Managed Service for Apache Flink application, provides additional mapping
     * information when JSON is the record format on the streaming source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * JSONMappingParametersProperty jSONMappingParametersProperty =
     * JSONMappingParametersProperty.builder()
     * .recordRowPath("recordRowPath")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-jsonmappingparameters.html)
     */
    public inline fun cfnApplicationJSONMappingParametersProperty(
        block: CfnApplicationJSONMappingParametersPropertyDsl.() -> Unit = {}
    ): CfnApplication.JSONMappingParametersProperty {
        val builder = CfnApplicationJSONMappingParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For a SQL-based Managed Service for Apache Flink application, identifies a Kinesis Data
     * Firehose delivery stream as the streaming source.
     *
     * You provide the delivery stream's Amazon Resource Name (ARN).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * KinesisFirehoseInputProperty kinesisFirehoseInputProperty =
     * KinesisFirehoseInputProperty.builder()
     * .resourceArn("resourceArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisfirehoseinput.html)
     */
    public inline fun cfnApplicationKinesisFirehoseInputProperty(
        block: CfnApplicationKinesisFirehoseInputPropertyDsl.() -> Unit = {}
    ): CfnApplication.KinesisFirehoseInputProperty {
        val builder = CfnApplicationKinesisFirehoseInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Identifies a Kinesis data stream as the streaming source.
     *
     * You provide the stream's Amazon Resource Name (ARN).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * KinesisStreamsInputProperty kinesisStreamsInputProperty = KinesisStreamsInputProperty.builder()
     * .resourceArn("resourceArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisstreamsinput.html)
     */
    public inline fun cfnApplicationKinesisStreamsInputProperty(
        block: CfnApplicationKinesisStreamsInputPropertyDsl.() -> Unit = {}
    ): CfnApplication.KinesisStreamsInputProperty {
        val builder = CfnApplicationKinesisStreamsInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * When you configure a SQL-based Managed Service for Apache Flink application's input at the
     * time of creating or updating an application, provides additional mapping information specific
     * to the record format (such as JSON, CSV, or record fields delimited by some delimiter) on the
     * streaming source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * MappingParametersProperty mappingParametersProperty = MappingParametersProperty.builder()
     * .csvMappingParameters(CSVMappingParametersProperty.builder()
     * .recordColumnDelimiter("recordColumnDelimiter")
     * .recordRowDelimiter("recordRowDelimiter")
     * .build())
     * .jsonMappingParameters(JSONMappingParametersProperty.builder()
     * .recordRowPath("recordRowPath")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-mappingparameters.html)
     */
    public inline fun cfnApplicationMappingParametersProperty(
        block: CfnApplicationMappingParametersPropertyDsl.() -> Unit = {}
    ): CfnApplication.MappingParametersProperty {
        val builder = CfnApplicationMappingParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The information required to specify a Maven reference.
     *
     * You can use Maven references to specify dependency JAR files.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * MavenReferenceProperty mavenReferenceProperty = MavenReferenceProperty.builder()
     * .artifactId("artifactId")
     * .groupId("groupId")
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-mavenreference.html)
     */
    public inline fun cfnApplicationMavenReferenceProperty(
        block: CfnApplicationMavenReferencePropertyDsl.() -> Unit = {}
    ): CfnApplication.MavenReferenceProperty {
        val builder = CfnApplicationMavenReferencePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes configuration parameters for Amazon CloudWatch logging for a Java-based Kinesis
     * Data Analytics application.
     *
     * For more information about CloudWatch logging, see
     * [Monitoring](https://docs.aws.amazon.com/managed-flink/latest/java/monitoring-overview) .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * MonitoringConfigurationProperty monitoringConfigurationProperty =
     * MonitoringConfigurationProperty.builder()
     * .configurationType("configurationType")
     * // the properties below are optional
     * .logLevel("logLevel")
     * .metricsLevel("metricsLevel")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html)
     */
    public inline fun cfnApplicationMonitoringConfigurationProperty(
        block: CfnApplicationMonitoringConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.MonitoringConfigurationProperty {
        val builder = CfnApplicationMonitoringConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Adds an external destination to your SQL-based Amazon Kinesis Data Analytics application.
     *
     * If you want Kinesis Data Analytics to deliver data from an in-application stream within your
     * application to an external destination (such as an Kinesis data stream, a Kinesis Data
     * Firehose delivery stream, or an Amazon Lambda function), you add the relevant configuration
     * to your application using this operation. You can configure one or more outputs for your
     * application. Each output configuration maps an in-application stream and an external
     * destination.
     *
     * You can use one of the output configurations to deliver data from your in-application error
     * stream to an external destination so that you can analyze the errors.
     *
     * Any configuration update, including adding a streaming source using this operation, results
     * in a new version of the application. You can use the
     * [DescribeApplication](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_DescribeApplication.html)
     * operation to find the current application version.
     *
     * Creation of multiple outputs should be sequential (use of DependsOn) to avoid a problem with
     * a stale application version ( *ConcurrentModificationException* ).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * CfnApplicationOutput cfnApplicationOutput = CfnApplicationOutput.Builder.create(this,
     * "MyCfnApplicationOutput")
     * .applicationName("applicationName")
     * .output(OutputProperty.builder()
     * .destinationSchema(DestinationSchemaProperty.builder()
     * .recordFormatType("recordFormatType")
     * .build())
     * // the properties below are optional
     * .kinesisFirehoseOutput(KinesisFirehoseOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .build())
     * .kinesisStreamsOutput(KinesisStreamsOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .build())
     * .lambdaOutput(LambdaOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .build())
     * .name("name")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationoutput.html)
     */
    public inline fun cfnApplicationOutput(
        scope: Construct,
        id: String,
        block: CfnApplicationOutputDsl.() -> Unit = {},
    ): CfnApplicationOutput {
        val builder = CfnApplicationOutputDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the data format when records are written to the destination in a SQL-based Managed
     * Service for Apache Flink application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * DestinationSchemaProperty destinationSchemaProperty = DestinationSchemaProperty.builder()
     * .recordFormatType("recordFormatType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-destinationschema.html)
     */
    public inline fun cfnApplicationOutputDestinationSchemaProperty(
        block: CfnApplicationOutputDestinationSchemaPropertyDsl.() -> Unit = {}
    ): CfnApplicationOutput.DestinationSchemaProperty {
        val builder = CfnApplicationOutputDestinationSchemaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For a SQL-based Managed Service for Apache Flink application, when configuring application
     * output, identifies a Kinesis Data Firehose delivery stream as the destination.
     *
     * You provide the stream Amazon Resource Name (ARN) of the delivery stream.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * KinesisFirehoseOutputProperty kinesisFirehoseOutputProperty =
     * KinesisFirehoseOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-kinesisfirehoseoutput.html)
     */
    public inline fun cfnApplicationOutputKinesisFirehoseOutputProperty(
        block: CfnApplicationOutputKinesisFirehoseOutputPropertyDsl.() -> Unit = {}
    ): CfnApplicationOutput.KinesisFirehoseOutputProperty {
        val builder = CfnApplicationOutputKinesisFirehoseOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * When you configure a SQL-based Managed Service for Apache Flink application's output,
     * identifies a Kinesis data stream as the destination.
     *
     * You provide the stream Amazon Resource Name (ARN).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * KinesisStreamsOutputProperty kinesisStreamsOutputProperty =
     * KinesisStreamsOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-kinesisstreamsoutput.html)
     */
    public inline fun cfnApplicationOutputKinesisStreamsOutputProperty(
        block: CfnApplicationOutputKinesisStreamsOutputPropertyDsl.() -> Unit = {}
    ): CfnApplicationOutput.KinesisStreamsOutputProperty {
        val builder = CfnApplicationOutputKinesisStreamsOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * When you configure a SQL-based Managed Service for Apache Flink application's output,
     * identifies an Amazon Lambda function as the destination.
     *
     * You provide the function Amazon Resource Name (ARN) of the Lambda function.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * LambdaOutputProperty lambdaOutputProperty = LambdaOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-lambdaoutput.html)
     */
    public inline fun cfnApplicationOutputLambdaOutputProperty(
        block: CfnApplicationOutputLambdaOutputPropertyDsl.() -> Unit = {}
    ): CfnApplicationOutput.LambdaOutputProperty {
        val builder = CfnApplicationOutputLambdaOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a SQL-based Managed Service for Apache Flink application's output configuration, in
     * which you identify an in-application stream and a destination where you want the
     * in-application stream data to be written.
     *
     * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * OutputProperty outputProperty = OutputProperty.builder()
     * .destinationSchema(DestinationSchemaProperty.builder()
     * .recordFormatType("recordFormatType")
     * .build())
     * // the properties below are optional
     * .kinesisFirehoseOutput(KinesisFirehoseOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .build())
     * .kinesisStreamsOutput(KinesisStreamsOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .build())
     * .lambdaOutput(LambdaOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .build())
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-output.html)
     */
    public inline fun cfnApplicationOutputOutputProperty(
        block: CfnApplicationOutputOutputPropertyDsl.() -> Unit = {}
    ): CfnApplicationOutput.OutputProperty {
        val builder = CfnApplicationOutputOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApplicationOutput`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * CfnApplicationOutputProps cfnApplicationOutputProps = CfnApplicationOutputProps.builder()
     * .applicationName("applicationName")
     * .output(OutputProperty.builder()
     * .destinationSchema(DestinationSchemaProperty.builder()
     * .recordFormatType("recordFormatType")
     * .build())
     * // the properties below are optional
     * .kinesisFirehoseOutput(KinesisFirehoseOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .build())
     * .kinesisStreamsOutput(KinesisStreamsOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .build())
     * .lambdaOutput(LambdaOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .build())
     * .name("name")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationoutput.html)
     */
    public inline fun cfnApplicationOutputProps(
        block: CfnApplicationOutputPropsDsl.() -> Unit = {}
    ): CfnApplicationOutputProps {
        val builder = CfnApplicationOutputPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes parameters for how a Flink-based Kinesis Data Analytics application executes
     * multiple tasks simultaneously.
     *
     * For more information about parallelism, see
     * [Parallel Execution](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/dev/parallel.html)
     * in the
     * [Apache Flink Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * ParallelismConfigurationProperty parallelismConfigurationProperty =
     * ParallelismConfigurationProperty.builder()
     * .configurationType("configurationType")
     * // the properties below are optional
     * .autoScalingEnabled(false)
     * .parallelism(123)
     * .parallelismPerKpu(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html)
     */
    public inline fun cfnApplicationParallelismConfigurationProperty(
        block: CfnApplicationParallelismConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.ParallelismConfigurationProperty {
        val builder = CfnApplicationParallelismConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Property key-value pairs passed into an application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * PropertyGroupProperty propertyGroupProperty = PropertyGroupProperty.builder()
     * .propertyGroupId("propertyGroupId")
     * .propertyMap(Map.of(
     * "propertyMapKey", "propertyMap"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-propertygroup.html)
     */
    public inline fun cfnApplicationPropertyGroupProperty(
        block: CfnApplicationPropertyGroupPropertyDsl.() -> Unit = {}
    ): CfnApplication.PropertyGroupProperty {
        val builder = CfnApplicationPropertyGroupPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnApplicationProps(
        block: CfnApplicationPropsDsl.() -> Unit = {}
    ): CfnApplicationProps {
        val builder = CfnApplicationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For a SQL-based Managed Service for Apache Flink application, describes the mapping of each
     * data element in the streaming source to the corresponding column in the in-application
     * stream.
     *
     * Also used to describe the format of the reference data source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * RecordColumnProperty recordColumnProperty = RecordColumnProperty.builder()
     * .name("name")
     * .sqlType("sqlType")
     * // the properties below are optional
     * .mapping("mapping")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordcolumn.html)
     */
    public inline fun cfnApplicationRecordColumnProperty(
        block: CfnApplicationRecordColumnPropertyDsl.() -> Unit = {}
    ): CfnApplication.RecordColumnProperty {
        val builder = CfnApplicationRecordColumnPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For a SQL-based Managed Service for Apache Flink application, describes the record format and
     * relevant mapping information that should be applied to schematize the records on the stream.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * RecordFormatProperty recordFormatProperty = RecordFormatProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordformat.html)
     */
    public inline fun cfnApplicationRecordFormatProperty(
        block: CfnApplicationRecordFormatPropertyDsl.() -> Unit = {}
    ): CfnApplication.RecordFormatProperty {
        val builder = CfnApplicationRecordFormatPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Adds a reference data source to an existing SQL-based Managed Service for Apache Flink
     * application.
     *
     * Managed Service for Apache Flink reads reference data (that is, an Amazon S3 object) and
     * creates an in-application table within your application. In the request, you provide the
     * source (S3 bucket name and object key name), name of the in-application table to create, and
     * the necessary mapping information that describes how data in an Amazon S3 object maps to
     * columns in the resulting in-application table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * CfnApplicationReferenceDataSource cfnApplicationReferenceDataSource =
     * CfnApplicationReferenceDataSource.Builder.create(this, "MyCfnApplicationReferenceDataSource")
     * .applicationName("applicationName")
     * .referenceDataSource(ReferenceDataSourceProperty.builder()
     * .referenceSchema(ReferenceSchemaProperty.builder()
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
     * // the properties below are optional
     * .s3ReferenceDataSource(S3ReferenceDataSourceProperty.builder()
     * .bucketArn("bucketArn")
     * .fileKey("fileKey")
     * .build())
     * .tableName("tableName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationreferencedatasource.html)
     */
    public inline fun cfnApplicationReferenceDataSource(
        scope: Construct,
        id: String,
        block: CfnApplicationReferenceDataSourceDsl.() -> Unit = {},
    ): CfnApplicationReferenceDataSource {
        val builder = CfnApplicationReferenceDataSourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * For a SQL-based Managed Service for Apache Flink application, provides additional mapping
     * information when the record format uses delimiters, such as CSV.
     *
     * For example, the following sample records use CSV format, where the records use the *'\n'* as
     * the row delimiter and a comma (",") as the column delimiter:
     *
     * `"name1", "address1"`
     *
     * `"name2", "address2"`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * CSVMappingParametersProperty cSVMappingParametersProperty =
     * CSVMappingParametersProperty.builder()
     * .recordColumnDelimiter("recordColumnDelimiter")
     * .recordRowDelimiter("recordRowDelimiter")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters.html)
     */
    public inline fun cfnApplicationReferenceDataSourceCSVMappingParametersProperty(
        block: CfnApplicationReferenceDataSourceCSVMappingParametersPropertyDsl.() -> Unit = {}
    ): CfnApplicationReferenceDataSource.CSVMappingParametersProperty {
        val builder = CfnApplicationReferenceDataSourceCSVMappingParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For a SQL-based Managed Service for Apache Flink application, provides additional mapping
     * information when JSON is the record format on the streaming source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * JSONMappingParametersProperty jSONMappingParametersProperty =
     * JSONMappingParametersProperty.builder()
     * .recordRowPath("recordRowPath")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-jsonmappingparameters.html)
     */
    public inline fun cfnApplicationReferenceDataSourceJSONMappingParametersProperty(
        block: CfnApplicationReferenceDataSourceJSONMappingParametersPropertyDsl.() -> Unit = {}
    ): CfnApplicationReferenceDataSource.JSONMappingParametersProperty {
        val builder = CfnApplicationReferenceDataSourceJSONMappingParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * When you configure a SQL-based Managed Service for Apache Flink application's input at the
     * time of creating or updating an application, provides additional mapping information specific
     * to the record format (such as JSON, CSV, or record fields delimited by some delimiter) on the
     * streaming source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * MappingParametersProperty mappingParametersProperty = MappingParametersProperty.builder()
     * .csvMappingParameters(CSVMappingParametersProperty.builder()
     * .recordColumnDelimiter("recordColumnDelimiter")
     * .recordRowDelimiter("recordRowDelimiter")
     * .build())
     * .jsonMappingParameters(JSONMappingParametersProperty.builder()
     * .recordRowPath("recordRowPath")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-mappingparameters.html)
     */
    public inline fun cfnApplicationReferenceDataSourceMappingParametersProperty(
        block: CfnApplicationReferenceDataSourceMappingParametersPropertyDsl.() -> Unit = {}
    ): CfnApplicationReferenceDataSource.MappingParametersProperty {
        val builder = CfnApplicationReferenceDataSourceMappingParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApplicationReferenceDataSource`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * CfnApplicationReferenceDataSourceProps cfnApplicationReferenceDataSourceProps =
     * CfnApplicationReferenceDataSourceProps.builder()
     * .applicationName("applicationName")
     * .referenceDataSource(ReferenceDataSourceProperty.builder()
     * .referenceSchema(ReferenceSchemaProperty.builder()
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
     * // the properties below are optional
     * .s3ReferenceDataSource(S3ReferenceDataSourceProperty.builder()
     * .bucketArn("bucketArn")
     * .fileKey("fileKey")
     * .build())
     * .tableName("tableName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationreferencedatasource.html)
     */
    public inline fun cfnApplicationReferenceDataSourceProps(
        block: CfnApplicationReferenceDataSourcePropsDsl.() -> Unit = {}
    ): CfnApplicationReferenceDataSourceProps {
        val builder = CfnApplicationReferenceDataSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For a SQL-based Managed Service for Apache Flink application, describes the mapping of each
     * data element in the streaming source to the corresponding column in the in-application
     * stream.
     *
     * Also used to describe the format of the reference data source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * RecordColumnProperty recordColumnProperty = RecordColumnProperty.builder()
     * .name("name")
     * .sqlType("sqlType")
     * // the properties below are optional
     * .mapping("mapping")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-recordcolumn.html)
     */
    public inline fun cfnApplicationReferenceDataSourceRecordColumnProperty(
        block: CfnApplicationReferenceDataSourceRecordColumnPropertyDsl.() -> Unit = {}
    ): CfnApplicationReferenceDataSource.RecordColumnProperty {
        val builder = CfnApplicationReferenceDataSourceRecordColumnPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For a SQL-based Managed Service for Apache Flink application, describes the record format and
     * relevant mapping information that should be applied to schematize the records on the stream.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * RecordFormatProperty recordFormatProperty = RecordFormatProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-recordformat.html)
     */
    public inline fun cfnApplicationReferenceDataSourceRecordFormatProperty(
        block: CfnApplicationReferenceDataSourceRecordFormatPropertyDsl.() -> Unit = {}
    ): CfnApplicationReferenceDataSource.RecordFormatProperty {
        val builder = CfnApplicationReferenceDataSourceRecordFormatPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For a SQL-based Managed Service for Apache Flink application, describes the reference data
     * source by providing the source information (Amazon S3 bucket name and object key name), the
     * resulting in-application table name that is created, and the necessary schema to map the data
     * elements in the Amazon S3 object to the in-application table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * ReferenceDataSourceProperty referenceDataSourceProperty = ReferenceDataSourceProperty.builder()
     * .referenceSchema(ReferenceSchemaProperty.builder()
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
     * // the properties below are optional
     * .s3ReferenceDataSource(S3ReferenceDataSourceProperty.builder()
     * .bucketArn("bucketArn")
     * .fileKey("fileKey")
     * .build())
     * .tableName("tableName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource.html)
     */
    public inline fun cfnApplicationReferenceDataSourceReferenceDataSourceProperty(
        block: CfnApplicationReferenceDataSourceReferenceDataSourcePropertyDsl.() -> Unit = {}
    ): CfnApplicationReferenceDataSource.ReferenceDataSourceProperty {
        val builder = CfnApplicationReferenceDataSourceReferenceDataSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For a SQL-based Managed Service for Apache Flink application, describes the format of the
     * data in the streaming source, and how each data element maps to corresponding columns created
     * in the in-application stream.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * ReferenceSchemaProperty referenceSchemaProperty = ReferenceSchemaProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referenceschema.html)
     */
    public inline fun cfnApplicationReferenceDataSourceReferenceSchemaProperty(
        block: CfnApplicationReferenceDataSourceReferenceSchemaPropertyDsl.() -> Unit = {}
    ): CfnApplicationReferenceDataSource.ReferenceSchemaProperty {
        val builder = CfnApplicationReferenceDataSourceReferenceSchemaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For an SQL-based Amazon Kinesis Data Analytics application, identifies the Amazon S3 bucket
     * and object that contains the reference data.
     *
     * A Kinesis Data Analytics application loads reference data only once. If the data changes, you
     * call the
     * [UpdateApplication](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_UpdateApplication.html)
     * operation to trigger reloading of data into your application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * S3ReferenceDataSourceProperty s3ReferenceDataSourceProperty =
     * S3ReferenceDataSourceProperty.builder()
     * .bucketArn("bucketArn")
     * .fileKey("fileKey")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-s3referencedatasource.html)
     */
    public inline fun cfnApplicationReferenceDataSourceS3ReferenceDataSourceProperty(
        block: CfnApplicationReferenceDataSourceS3ReferenceDataSourcePropertyDsl.() -> Unit = {}
    ): CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty {
        val builder = CfnApplicationReferenceDataSourceS3ReferenceDataSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the starting parameters for an Managed Service for Apache Flink application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * RunConfigurationProperty runConfigurationProperty = RunConfigurationProperty.builder()
     * .applicationRestoreConfiguration(ApplicationRestoreConfigurationProperty.builder()
     * .applicationRestoreType("applicationRestoreType")
     * // the properties below are optional
     * .snapshotName("snapshotName")
     * .build())
     * .flinkRunConfiguration(FlinkRunConfigurationProperty.builder()
     * .allowNonRestoredState(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-runconfiguration.html)
     */
    public inline fun cfnApplicationRunConfigurationProperty(
        block: CfnApplicationRunConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.RunConfigurationProperty {
        val builder = CfnApplicationRunConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The base location of the Amazon Data Analytics application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * S3ContentBaseLocationProperty s3ContentBaseLocationProperty =
     * S3ContentBaseLocationProperty.builder()
     * .bucketArn("bucketArn")
     * // the properties below are optional
     * .basePath("basePath")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentbaselocation.html)
     */
    public inline fun cfnApplicationS3ContentBaseLocationProperty(
        block: CfnApplicationS3ContentBaseLocationPropertyDsl.() -> Unit = {}
    ): CfnApplication.S3ContentBaseLocationProperty {
        val builder = CfnApplicationS3ContentBaseLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The location of an application or a custom artifact.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * S3ContentLocationProperty s3ContentLocationProperty = S3ContentLocationProperty.builder()
     * .bucketArn("bucketArn")
     * .fileKey("fileKey")
     * // the properties below are optional
     * .objectVersion("objectVersion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html)
     */
    public inline fun cfnApplicationS3ContentLocationProperty(
        block: CfnApplicationS3ContentLocationPropertyDsl.() -> Unit = {}
    ): CfnApplication.S3ContentLocationProperty {
        val builder = CfnApplicationS3ContentLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the inputs, outputs, and reference data sources for a SQL-based Managed Service for
     * Apache Flink application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * SqlApplicationConfigurationProperty sqlApplicationConfigurationProperty =
     * SqlApplicationConfigurationProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-sqlapplicationconfiguration.html)
     */
    public inline fun cfnApplicationSqlApplicationConfigurationProperty(
        block: CfnApplicationSqlApplicationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.SqlApplicationConfigurationProperty {
        val builder = CfnApplicationSqlApplicationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the parameters of a VPC used by the application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * VpcConfigurationProperty vpcConfigurationProperty = VpcConfigurationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-vpcconfiguration.html)
     */
    public inline fun cfnApplicationVpcConfigurationProperty(
        block: CfnApplicationVpcConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.VpcConfigurationProperty {
        val builder = CfnApplicationVpcConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of a Kinesis Data Analytics Studio notebook.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * ZeppelinApplicationConfigurationProperty zeppelinApplicationConfigurationProperty =
     * ZeppelinApplicationConfigurationProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-zeppelinapplicationconfiguration.html)
     */
    public inline fun cfnApplicationZeppelinApplicationConfigurationProperty(
        block: CfnApplicationZeppelinApplicationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.ZeppelinApplicationConfigurationProperty {
        val builder = CfnApplicationZeppelinApplicationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes configuration parameters for Amazon CloudWatch logging for a Kinesis Data Analytics
     * Studio notebook.
     *
     * For more information about CloudWatch logging, see
     * [Monitoring](https://docs.aws.amazon.com/managed-flink/latest/java/monitoring-overview.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
     * ZeppelinMonitoringConfigurationProperty zeppelinMonitoringConfigurationProperty =
     * ZeppelinMonitoringConfigurationProperty.builder()
     * .logLevel("logLevel")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-zeppelinmonitoringconfiguration.html)
     */
    public inline fun cfnApplicationZeppelinMonitoringConfigurationProperty(
        block: CfnApplicationZeppelinMonitoringConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.ZeppelinMonitoringConfigurationProperty {
        val builder = CfnApplicationZeppelinMonitoringConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
