@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

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
      fun cfnApplicationApplicationCodeConfigurationProperty(block: CfnApplicationApplicationCodeConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplication.ApplicationCodeConfigurationProperty {
    val builder = CfnApplicationApplicationCodeConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationApplicationConfigurationProperty(block: CfnApplicationApplicationConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplication.ApplicationConfigurationProperty {
    val builder = CfnApplicationApplicationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationApplicationMaintenanceConfigurationProperty(block: CfnApplicationApplicationMaintenanceConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplication.ApplicationMaintenanceConfigurationProperty {
    val builder = CfnApplicationApplicationMaintenanceConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationApplicationRestoreConfigurationProperty(block: CfnApplicationApplicationRestoreConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplication.ApplicationRestoreConfigurationProperty {
    val builder = CfnApplicationApplicationRestoreConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationApplicationSnapshotConfigurationProperty(block: CfnApplicationApplicationSnapshotConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplication.ApplicationSnapshotConfigurationProperty {
    val builder = CfnApplicationApplicationSnapshotConfigurationPropertyDsl()
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

  public inline
      fun cfnApplicationCatalogConfigurationProperty(block: CfnApplicationCatalogConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplication.CatalogConfigurationProperty {
    val builder = CfnApplicationCatalogConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationCheckpointConfigurationProperty(block: CfnApplicationCheckpointConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplication.CheckpointConfigurationProperty {
    val builder = CfnApplicationCheckpointConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApplicationCloudWatchLoggingOption(
    scope: Construct,
    id: String,
    block: CfnApplicationCloudWatchLoggingOptionDsl.() -> Unit = {},
  ): CfnApplicationCloudWatchLoggingOption {
    val builder = CfnApplicationCloudWatchLoggingOptionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationCloudWatchLoggingOptionCloudWatchLoggingOptionProperty(block: CfnApplicationCloudWatchLoggingOptionCloudWatchLoggingOptionPropertyDsl.() -> Unit
      = {}): CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty {
    val builder = CfnApplicationCloudWatchLoggingOptionCloudWatchLoggingOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationCloudWatchLoggingOptionProps(block: CfnApplicationCloudWatchLoggingOptionPropsDsl.() -> Unit
      = {}): CfnApplicationCloudWatchLoggingOptionProps {
    val builder = CfnApplicationCloudWatchLoggingOptionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationCodeContentProperty(block: CfnApplicationCodeContentPropertyDsl.() -> Unit =
      {}): CfnApplication.CodeContentProperty {
    val builder = CfnApplicationCodeContentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationCustomArtifactConfigurationProperty(block: CfnApplicationCustomArtifactConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplication.CustomArtifactConfigurationProperty {
    val builder = CfnApplicationCustomArtifactConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationDeployAsApplicationConfigurationProperty(block: CfnApplicationDeployAsApplicationConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplication.DeployAsApplicationConfigurationProperty {
    val builder = CfnApplicationDeployAsApplicationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationEnvironmentPropertiesProperty(block: CfnApplicationEnvironmentPropertiesPropertyDsl.() -> Unit
      = {}): CfnApplication.EnvironmentPropertiesProperty {
    val builder = CfnApplicationEnvironmentPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationFlinkApplicationConfigurationProperty(block: CfnApplicationFlinkApplicationConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplication.FlinkApplicationConfigurationProperty {
    val builder = CfnApplicationFlinkApplicationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationFlinkRunConfigurationProperty(block: CfnApplicationFlinkRunConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplication.FlinkRunConfigurationProperty {
    val builder = CfnApplicationFlinkRunConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationGlueDataCatalogConfigurationProperty(block: CfnApplicationGlueDataCatalogConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplication.GlueDataCatalogConfigurationProperty {
    val builder = CfnApplicationGlueDataCatalogConfigurationPropertyDsl()
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

  public inline
      fun cfnApplicationMavenReferenceProperty(block: CfnApplicationMavenReferencePropertyDsl.() -> Unit
      = {}): CfnApplication.MavenReferenceProperty {
    val builder = CfnApplicationMavenReferencePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationMonitoringConfigurationProperty(block: CfnApplicationMonitoringConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplication.MonitoringConfigurationProperty {
    val builder = CfnApplicationMonitoringConfigurationPropertyDsl()
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

  public inline
      fun cfnApplicationParallelismConfigurationProperty(block: CfnApplicationParallelismConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplication.ParallelismConfigurationProperty {
    val builder = CfnApplicationParallelismConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationPropertyGroupProperty(block: CfnApplicationPropertyGroupPropertyDsl.() -> Unit
      = {}): CfnApplication.PropertyGroupProperty {
    val builder = CfnApplicationPropertyGroupPropertyDsl()
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

  public inline
      fun cfnApplicationRunConfigurationProperty(block: CfnApplicationRunConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplication.RunConfigurationProperty {
    val builder = CfnApplicationRunConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationS3ContentBaseLocationProperty(block: CfnApplicationS3ContentBaseLocationPropertyDsl.() -> Unit
      = {}): CfnApplication.S3ContentBaseLocationProperty {
    val builder = CfnApplicationS3ContentBaseLocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationS3ContentLocationProperty(block: CfnApplicationS3ContentLocationPropertyDsl.() -> Unit
      = {}): CfnApplication.S3ContentLocationProperty {
    val builder = CfnApplicationS3ContentLocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationSqlApplicationConfigurationProperty(block: CfnApplicationSqlApplicationConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplication.SqlApplicationConfigurationProperty {
    val builder = CfnApplicationSqlApplicationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationVpcConfigurationProperty(block: CfnApplicationVpcConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplication.VpcConfigurationProperty {
    val builder = CfnApplicationVpcConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationZeppelinApplicationConfigurationProperty(block: CfnApplicationZeppelinApplicationConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplication.ZeppelinApplicationConfigurationProperty {
    val builder = CfnApplicationZeppelinApplicationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationZeppelinMonitoringConfigurationProperty(block: CfnApplicationZeppelinMonitoringConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplication.ZeppelinMonitoringConfigurationProperty {
    val builder = CfnApplicationZeppelinMonitoringConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
