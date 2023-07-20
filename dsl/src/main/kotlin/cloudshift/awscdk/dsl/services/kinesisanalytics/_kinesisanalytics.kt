@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplication
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2Props
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputProps
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationProps
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceProps
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2Props
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props
import software.constructs.Construct

public object kinesisanalytics {
  public inline fun cfnApplication(
    scope: Construct,
    id: String,
    block: CfnApplicationDsl.() -> Unit = {},
  ): CfnApplication {
    val builder = CfnApplicationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationCSVMappingParametersProperty(block: CfnApplicationCSVMappingParametersPropertyDsl.() -> Unit
      = {}): CfnApplication.CSVMappingParametersProperty {
    val builder = CfnApplicationCSVMappingParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApplicationCloudWatchLoggingOptionV2(
    scope: Construct,
    id: String,
    block: CfnApplicationCloudWatchLoggingOptionV2Dsl.() -> Unit = {},
  ): CfnApplicationCloudWatchLoggingOptionV2 {
    val builder = CfnApplicationCloudWatchLoggingOptionV2Dsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationCloudWatchLoggingOptionV2CloudWatchLoggingOptionProperty(block: CfnApplicationCloudWatchLoggingOptionV2CloudWatchLoggingOptionPropertyDsl.() -> Unit
      = {}): CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty {
    val builder = CfnApplicationCloudWatchLoggingOptionV2CloudWatchLoggingOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationCloudWatchLoggingOptionV2Props(block: CfnApplicationCloudWatchLoggingOptionV2PropsDsl.() -> Unit
      = {}): CfnApplicationCloudWatchLoggingOptionV2Props {
    val builder = CfnApplicationCloudWatchLoggingOptionV2PropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationInputLambdaProcessorProperty(block: CfnApplicationInputLambdaProcessorPropertyDsl.() -> Unit
      = {}): CfnApplication.InputLambdaProcessorProperty {
    val builder = CfnApplicationInputLambdaProcessorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationInputParallelismProperty(block: CfnApplicationInputParallelismPropertyDsl.() -> Unit
      = {}): CfnApplication.InputParallelismProperty {
    val builder = CfnApplicationInputParallelismPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationInputProcessingConfigurationProperty(block: CfnApplicationInputProcessingConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplication.InputProcessingConfigurationProperty {
    val builder = CfnApplicationInputProcessingConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApplicationInputProperty(block: CfnApplicationInputPropertyDsl.() -> Unit =
      {}): CfnApplication.InputProperty {
    val builder = CfnApplicationInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationInputSchemaProperty(block: CfnApplicationInputSchemaPropertyDsl.() -> Unit =
      {}): CfnApplication.InputSchemaProperty {
    val builder = CfnApplicationInputSchemaPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationJSONMappingParametersProperty(block: CfnApplicationJSONMappingParametersPropertyDsl.() -> Unit
      = {}): CfnApplication.JSONMappingParametersProperty {
    val builder = CfnApplicationJSONMappingParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationKinesisFirehoseInputProperty(block: CfnApplicationKinesisFirehoseInputPropertyDsl.() -> Unit
      = {}): CfnApplication.KinesisFirehoseInputProperty {
    val builder = CfnApplicationKinesisFirehoseInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationKinesisStreamsInputProperty(block: CfnApplicationKinesisStreamsInputPropertyDsl.() -> Unit
      = {}): CfnApplication.KinesisStreamsInputProperty {
    val builder = CfnApplicationKinesisStreamsInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationMappingParametersProperty(block: CfnApplicationMappingParametersPropertyDsl.() -> Unit
      = {}): CfnApplication.MappingParametersProperty {
    val builder = CfnApplicationMappingParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApplicationOutput(
    scope: Construct,
    id: String,
    block: CfnApplicationOutputDsl.() -> Unit = {},
  ): CfnApplicationOutput {
    val builder = CfnApplicationOutputDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationOutputDestinationSchemaProperty(block: CfnApplicationOutputDestinationSchemaPropertyDsl.() -> Unit
      = {}): CfnApplicationOutput.DestinationSchemaProperty {
    val builder = CfnApplicationOutputDestinationSchemaPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationOutputKinesisFirehoseOutputProperty(block: CfnApplicationOutputKinesisFirehoseOutputPropertyDsl.() -> Unit
      = {}): CfnApplicationOutput.KinesisFirehoseOutputProperty {
    val builder = CfnApplicationOutputKinesisFirehoseOutputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationOutputKinesisStreamsOutputProperty(block: CfnApplicationOutputKinesisStreamsOutputPropertyDsl.() -> Unit
      = {}): CfnApplicationOutput.KinesisStreamsOutputProperty {
    val builder = CfnApplicationOutputKinesisStreamsOutputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationOutputLambdaOutputProperty(block: CfnApplicationOutputLambdaOutputPropertyDsl.() -> Unit
      = {}): CfnApplicationOutput.LambdaOutputProperty {
    val builder = CfnApplicationOutputLambdaOutputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationOutputOutputProperty(block: CfnApplicationOutputOutputPropertyDsl.() -> Unit
      = {}): CfnApplicationOutput.OutputProperty {
    val builder = CfnApplicationOutputOutputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApplicationOutputProps(block: CfnApplicationOutputPropsDsl.() -> Unit = {}):
      CfnApplicationOutputProps {
    val builder = CfnApplicationOutputPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApplicationOutputV2(
    scope: Construct,
    id: String,
    block: CfnApplicationOutputV2Dsl.() -> Unit = {},
  ): CfnApplicationOutputV2 {
    val builder = CfnApplicationOutputV2Dsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationOutputV2DestinationSchemaProperty(block: CfnApplicationOutputV2DestinationSchemaPropertyDsl.() -> Unit
      = {}): CfnApplicationOutputV2.DestinationSchemaProperty {
    val builder = CfnApplicationOutputV2DestinationSchemaPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationOutputV2KinesisFirehoseOutputProperty(block: CfnApplicationOutputV2KinesisFirehoseOutputPropertyDsl.() -> Unit
      = {}): CfnApplicationOutputV2.KinesisFirehoseOutputProperty {
    val builder = CfnApplicationOutputV2KinesisFirehoseOutputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationOutputV2KinesisStreamsOutputProperty(block: CfnApplicationOutputV2KinesisStreamsOutputPropertyDsl.() -> Unit
      = {}): CfnApplicationOutputV2.KinesisStreamsOutputProperty {
    val builder = CfnApplicationOutputV2KinesisStreamsOutputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationOutputV2LambdaOutputProperty(block: CfnApplicationOutputV2LambdaOutputPropertyDsl.() -> Unit
      = {}): CfnApplicationOutputV2.LambdaOutputProperty {
    val builder = CfnApplicationOutputV2LambdaOutputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationOutputV2OutputProperty(block: CfnApplicationOutputV2OutputPropertyDsl.() -> Unit
      = {}): CfnApplicationOutputV2.OutputProperty {
    val builder = CfnApplicationOutputV2OutputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApplicationOutputV2Props(block: CfnApplicationOutputV2PropsDsl.() -> Unit =
      {}): CfnApplicationOutputV2Props {
    val builder = CfnApplicationOutputV2PropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApplicationProps(block: CfnApplicationPropsDsl.() -> Unit = {}):
      CfnApplicationProps {
    val builder = CfnApplicationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationRecordColumnProperty(block: CfnApplicationRecordColumnPropertyDsl.() -> Unit
      = {}): CfnApplication.RecordColumnProperty {
    val builder = CfnApplicationRecordColumnPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationRecordFormatProperty(block: CfnApplicationRecordFormatPropertyDsl.() -> Unit
      = {}): CfnApplication.RecordFormatProperty {
    val builder = CfnApplicationRecordFormatPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApplicationReferenceDataSource(
    scope: Construct,
    id: String,
    block: CfnApplicationReferenceDataSourceDsl.() -> Unit = {},
  ): CfnApplicationReferenceDataSource {
    val builder = CfnApplicationReferenceDataSourceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationReferenceDataSourceCSVMappingParametersProperty(block: CfnApplicationReferenceDataSourceCSVMappingParametersPropertyDsl.() -> Unit
      = {}): CfnApplicationReferenceDataSource.CSVMappingParametersProperty {
    val builder = CfnApplicationReferenceDataSourceCSVMappingParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationReferenceDataSourceJSONMappingParametersProperty(block: CfnApplicationReferenceDataSourceJSONMappingParametersPropertyDsl.() -> Unit
      = {}): CfnApplicationReferenceDataSource.JSONMappingParametersProperty {
    val builder = CfnApplicationReferenceDataSourceJSONMappingParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationReferenceDataSourceMappingParametersProperty(block: CfnApplicationReferenceDataSourceMappingParametersPropertyDsl.() -> Unit
      = {}): CfnApplicationReferenceDataSource.MappingParametersProperty {
    val builder = CfnApplicationReferenceDataSourceMappingParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationReferenceDataSourceProps(block: CfnApplicationReferenceDataSourcePropsDsl.() -> Unit
      = {}): CfnApplicationReferenceDataSourceProps {
    val builder = CfnApplicationReferenceDataSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationReferenceDataSourceRecordColumnProperty(block: CfnApplicationReferenceDataSourceRecordColumnPropertyDsl.() -> Unit
      = {}): CfnApplicationReferenceDataSource.RecordColumnProperty {
    val builder = CfnApplicationReferenceDataSourceRecordColumnPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationReferenceDataSourceRecordFormatProperty(block: CfnApplicationReferenceDataSourceRecordFormatPropertyDsl.() -> Unit
      = {}): CfnApplicationReferenceDataSource.RecordFormatProperty {
    val builder = CfnApplicationReferenceDataSourceRecordFormatPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationReferenceDataSourceReferenceDataSourceProperty(block: CfnApplicationReferenceDataSourceReferenceDataSourcePropertyDsl.() -> Unit
      = {}): CfnApplicationReferenceDataSource.ReferenceDataSourceProperty {
    val builder = CfnApplicationReferenceDataSourceReferenceDataSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationReferenceDataSourceReferenceSchemaProperty(block: CfnApplicationReferenceDataSourceReferenceSchemaPropertyDsl.() -> Unit
      = {}): CfnApplicationReferenceDataSource.ReferenceSchemaProperty {
    val builder = CfnApplicationReferenceDataSourceReferenceSchemaPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationReferenceDataSourceS3ReferenceDataSourceProperty(block: CfnApplicationReferenceDataSourceS3ReferenceDataSourcePropertyDsl.() -> Unit
      = {}): CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty {
    val builder = CfnApplicationReferenceDataSourceS3ReferenceDataSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApplicationReferenceDataSourceV2(
    scope: Construct,
    id: String,
    block: CfnApplicationReferenceDataSourceV2Dsl.() -> Unit = {},
  ): CfnApplicationReferenceDataSourceV2 {
    val builder = CfnApplicationReferenceDataSourceV2Dsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationReferenceDataSourceV2CSVMappingParametersProperty(block: CfnApplicationReferenceDataSourceV2CSVMappingParametersPropertyDsl.() -> Unit
      = {}): CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty {
    val builder = CfnApplicationReferenceDataSourceV2CSVMappingParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationReferenceDataSourceV2JSONMappingParametersProperty(block: CfnApplicationReferenceDataSourceV2JSONMappingParametersPropertyDsl.() -> Unit
      = {}): CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty {
    val builder = CfnApplicationReferenceDataSourceV2JSONMappingParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationReferenceDataSourceV2MappingParametersProperty(block: CfnApplicationReferenceDataSourceV2MappingParametersPropertyDsl.() -> Unit
      = {}): CfnApplicationReferenceDataSourceV2.MappingParametersProperty {
    val builder = CfnApplicationReferenceDataSourceV2MappingParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationReferenceDataSourceV2Props(block: CfnApplicationReferenceDataSourceV2PropsDsl.() -> Unit
      = {}): CfnApplicationReferenceDataSourceV2Props {
    val builder = CfnApplicationReferenceDataSourceV2PropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationReferenceDataSourceV2RecordColumnProperty(block: CfnApplicationReferenceDataSourceV2RecordColumnPropertyDsl.() -> Unit
      = {}): CfnApplicationReferenceDataSourceV2.RecordColumnProperty {
    val builder = CfnApplicationReferenceDataSourceV2RecordColumnPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationReferenceDataSourceV2RecordFormatProperty(block: CfnApplicationReferenceDataSourceV2RecordFormatPropertyDsl.() -> Unit
      = {}): CfnApplicationReferenceDataSourceV2.RecordFormatProperty {
    val builder = CfnApplicationReferenceDataSourceV2RecordFormatPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationReferenceDataSourceV2ReferenceDataSourceProperty(block: CfnApplicationReferenceDataSourceV2ReferenceDataSourcePropertyDsl.() -> Unit
      = {}): CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty {
    val builder = CfnApplicationReferenceDataSourceV2ReferenceDataSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationReferenceDataSourceV2ReferenceSchemaProperty(block: CfnApplicationReferenceDataSourceV2ReferenceSchemaPropertyDsl.() -> Unit
      = {}): CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty {
    val builder = CfnApplicationReferenceDataSourceV2ReferenceSchemaPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationReferenceDataSourceV2S3ReferenceDataSourceProperty(block: CfnApplicationReferenceDataSourceV2S3ReferenceDataSourcePropertyDsl.() -> Unit
      = {}): CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty {
    val builder = CfnApplicationReferenceDataSourceV2S3ReferenceDataSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApplicationV2(
    scope: Construct,
    id: String,
    block: CfnApplicationV2Dsl.() -> Unit = {},
  ): CfnApplicationV2 {
    val builder = CfnApplicationV2Dsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2ApplicationCodeConfigurationProperty(block: CfnApplicationV2ApplicationCodeConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.ApplicationCodeConfigurationProperty {
    val builder = CfnApplicationV2ApplicationCodeConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2ApplicationConfigurationProperty(block: CfnApplicationV2ApplicationConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.ApplicationConfigurationProperty {
    val builder = CfnApplicationV2ApplicationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2ApplicationMaintenanceConfigurationProperty(block: CfnApplicationV2ApplicationMaintenanceConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.ApplicationMaintenanceConfigurationProperty {
    val builder = CfnApplicationV2ApplicationMaintenanceConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2ApplicationRestoreConfigurationProperty(block: CfnApplicationV2ApplicationRestoreConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.ApplicationRestoreConfigurationProperty {
    val builder = CfnApplicationV2ApplicationRestoreConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2ApplicationSnapshotConfigurationProperty(block: CfnApplicationV2ApplicationSnapshotConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.ApplicationSnapshotConfigurationProperty {
    val builder = CfnApplicationV2ApplicationSnapshotConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2CSVMappingParametersProperty(block: CfnApplicationV2CSVMappingParametersPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.CSVMappingParametersProperty {
    val builder = CfnApplicationV2CSVMappingParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2CatalogConfigurationProperty(block: CfnApplicationV2CatalogConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.CatalogConfigurationProperty {
    val builder = CfnApplicationV2CatalogConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2CheckpointConfigurationProperty(block: CfnApplicationV2CheckpointConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.CheckpointConfigurationProperty {
    val builder = CfnApplicationV2CheckpointConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2CodeContentProperty(block: CfnApplicationV2CodeContentPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.CodeContentProperty {
    val builder = CfnApplicationV2CodeContentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2CustomArtifactConfigurationProperty(block: CfnApplicationV2CustomArtifactConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.CustomArtifactConfigurationProperty {
    val builder = CfnApplicationV2CustomArtifactConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2DeployAsApplicationConfigurationProperty(block: CfnApplicationV2DeployAsApplicationConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.DeployAsApplicationConfigurationProperty {
    val builder = CfnApplicationV2DeployAsApplicationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2EnvironmentPropertiesProperty(block: CfnApplicationV2EnvironmentPropertiesPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.EnvironmentPropertiesProperty {
    val builder = CfnApplicationV2EnvironmentPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2FlinkApplicationConfigurationProperty(block: CfnApplicationV2FlinkApplicationConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.FlinkApplicationConfigurationProperty {
    val builder = CfnApplicationV2FlinkApplicationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2FlinkRunConfigurationProperty(block: CfnApplicationV2FlinkRunConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.FlinkRunConfigurationProperty {
    val builder = CfnApplicationV2FlinkRunConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2GlueDataCatalogConfigurationProperty(block: CfnApplicationV2GlueDataCatalogConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.GlueDataCatalogConfigurationProperty {
    val builder = CfnApplicationV2GlueDataCatalogConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2InputLambdaProcessorProperty(block: CfnApplicationV2InputLambdaProcessorPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.InputLambdaProcessorProperty {
    val builder = CfnApplicationV2InputLambdaProcessorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2InputParallelismProperty(block: CfnApplicationV2InputParallelismPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.InputParallelismProperty {
    val builder = CfnApplicationV2InputParallelismPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2InputProcessingConfigurationProperty(block: CfnApplicationV2InputProcessingConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.InputProcessingConfigurationProperty {
    val builder = CfnApplicationV2InputProcessingConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApplicationV2InputProperty(block: CfnApplicationV2InputPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.InputProperty {
    val builder = CfnApplicationV2InputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2InputSchemaProperty(block: CfnApplicationV2InputSchemaPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.InputSchemaProperty {
    val builder = CfnApplicationV2InputSchemaPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2JSONMappingParametersProperty(block: CfnApplicationV2JSONMappingParametersPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.JSONMappingParametersProperty {
    val builder = CfnApplicationV2JSONMappingParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2KinesisFirehoseInputProperty(block: CfnApplicationV2KinesisFirehoseInputPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.KinesisFirehoseInputProperty {
    val builder = CfnApplicationV2KinesisFirehoseInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2KinesisStreamsInputProperty(block: CfnApplicationV2KinesisStreamsInputPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.KinesisStreamsInputProperty {
    val builder = CfnApplicationV2KinesisStreamsInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2MappingParametersProperty(block: CfnApplicationV2MappingParametersPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.MappingParametersProperty {
    val builder = CfnApplicationV2MappingParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2MavenReferenceProperty(block: CfnApplicationV2MavenReferencePropertyDsl.() -> Unit
      = {}): CfnApplicationV2.MavenReferenceProperty {
    val builder = CfnApplicationV2MavenReferencePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2MonitoringConfigurationProperty(block: CfnApplicationV2MonitoringConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.MonitoringConfigurationProperty {
    val builder = CfnApplicationV2MonitoringConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2ParallelismConfigurationProperty(block: CfnApplicationV2ParallelismConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.ParallelismConfigurationProperty {
    val builder = CfnApplicationV2ParallelismConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2PropertyGroupProperty(block: CfnApplicationV2PropertyGroupPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.PropertyGroupProperty {
    val builder = CfnApplicationV2PropertyGroupPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApplicationV2Props(block: CfnApplicationV2PropsDsl.() -> Unit = {}):
      CfnApplicationV2Props {
    val builder = CfnApplicationV2PropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2RecordColumnProperty(block: CfnApplicationV2RecordColumnPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.RecordColumnProperty {
    val builder = CfnApplicationV2RecordColumnPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2RecordFormatProperty(block: CfnApplicationV2RecordFormatPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.RecordFormatProperty {
    val builder = CfnApplicationV2RecordFormatPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2RunConfigurationProperty(block: CfnApplicationV2RunConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.RunConfigurationProperty {
    val builder = CfnApplicationV2RunConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2S3ContentBaseLocationProperty(block: CfnApplicationV2S3ContentBaseLocationPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.S3ContentBaseLocationProperty {
    val builder = CfnApplicationV2S3ContentBaseLocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2S3ContentLocationProperty(block: CfnApplicationV2S3ContentLocationPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.S3ContentLocationProperty {
    val builder = CfnApplicationV2S3ContentLocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2SqlApplicationConfigurationProperty(block: CfnApplicationV2SqlApplicationConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.SqlApplicationConfigurationProperty {
    val builder = CfnApplicationV2SqlApplicationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2VpcConfigurationProperty(block: CfnApplicationV2VpcConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.VpcConfigurationProperty {
    val builder = CfnApplicationV2VpcConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2ZeppelinApplicationConfigurationProperty(block: CfnApplicationV2ZeppelinApplicationConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.ZeppelinApplicationConfigurationProperty {
    val builder = CfnApplicationV2ZeppelinApplicationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationV2ZeppelinMonitoringConfigurationProperty(block: CfnApplicationV2ZeppelinMonitoringConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplicationV2.ZeppelinMonitoringConfigurationProperty {
    val builder = CfnApplicationV2ZeppelinMonitoringConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
