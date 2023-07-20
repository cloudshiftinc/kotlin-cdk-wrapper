@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotanalytics.CfnChannel
import software.amazon.awscdk.services.iotanalytics.CfnChannelProps
import software.amazon.awscdk.services.iotanalytics.CfnDataset
import software.amazon.awscdk.services.iotanalytics.CfnDatasetProps
import software.amazon.awscdk.services.iotanalytics.CfnDatastore
import software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps
import software.amazon.awscdk.services.iotanalytics.CfnPipeline
import software.amazon.awscdk.services.iotanalytics.CfnPipelineProps
import software.constructs.Construct

public object iotanalytics {
  public inline fun cfnChannel(
    scope: Construct,
    id: String,
    block: CfnChannelDsl.() -> Unit = {},
  ): CfnChannel {
    val builder = CfnChannelDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelChannelStorageProperty(block: CfnChannelChannelStoragePropertyDsl.() -> Unit =
      {}): CfnChannel.ChannelStorageProperty {
    val builder = CfnChannelChannelStoragePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelCustomerManagedS3Property(block: CfnChannelCustomerManagedS3PropertyDsl.() -> Unit
      = {}): CfnChannel.CustomerManagedS3Property {
    val builder = CfnChannelCustomerManagedS3PropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnChannelProps(block: CfnChannelPropsDsl.() -> Unit = {}): CfnChannelProps {
    val builder = CfnChannelPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelRetentionPeriodProperty(block: CfnChannelRetentionPeriodPropertyDsl.() -> Unit =
      {}): CfnChannel.RetentionPeriodProperty {
    val builder = CfnChannelRetentionPeriodPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDataset(
    scope: Construct,
    id: String,
    block: CfnDatasetDsl.() -> Unit = {},
  ): CfnDataset {
    val builder = CfnDatasetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDatasetActionProperty(block: CfnDatasetActionPropertyDsl.() -> Unit = {}):
      CfnDataset.ActionProperty {
    val builder = CfnDatasetActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDatasetContainerActionProperty(block: CfnDatasetContainerActionPropertyDsl.() -> Unit =
      {}): CfnDataset.ContainerActionProperty {
    val builder = CfnDatasetContainerActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDatasetDatasetContentDeliveryRuleDestinationProperty(block: CfnDatasetDatasetContentDeliveryRuleDestinationPropertyDsl.() -> Unit
      = {}): CfnDataset.DatasetContentDeliveryRuleDestinationProperty {
    val builder = CfnDatasetDatasetContentDeliveryRuleDestinationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDatasetDatasetContentDeliveryRuleProperty(block: CfnDatasetDatasetContentDeliveryRulePropertyDsl.() -> Unit
      = {}): CfnDataset.DatasetContentDeliveryRuleProperty {
    val builder = CfnDatasetDatasetContentDeliveryRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDatasetDatasetContentVersionValueProperty(block: CfnDatasetDatasetContentVersionValuePropertyDsl.() -> Unit
      = {}): CfnDataset.DatasetContentVersionValueProperty {
    val builder = CfnDatasetDatasetContentVersionValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDatasetDeltaTimeProperty(block: CfnDatasetDeltaTimePropertyDsl.() -> Unit =
      {}): CfnDataset.DeltaTimeProperty {
    val builder = CfnDatasetDeltaTimePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDatasetDeltaTimeSessionWindowConfigurationProperty(block: CfnDatasetDeltaTimeSessionWindowConfigurationPropertyDsl.() -> Unit
      = {}): CfnDataset.DeltaTimeSessionWindowConfigurationProperty {
    val builder = CfnDatasetDeltaTimeSessionWindowConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDatasetFilterProperty(block: CfnDatasetFilterPropertyDsl.() -> Unit = {}):
      CfnDataset.FilterProperty {
    val builder = CfnDatasetFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDatasetGlueConfigurationProperty(block: CfnDatasetGlueConfigurationPropertyDsl.() -> Unit
      = {}): CfnDataset.GlueConfigurationProperty {
    val builder = CfnDatasetGlueConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDatasetIotEventsDestinationConfigurationProperty(block: CfnDatasetIotEventsDestinationConfigurationPropertyDsl.() -> Unit
      = {}): CfnDataset.IotEventsDestinationConfigurationProperty {
    val builder = CfnDatasetIotEventsDestinationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDatasetLateDataRuleConfigurationProperty(block: CfnDatasetLateDataRuleConfigurationPropertyDsl.() -> Unit
      = {}): CfnDataset.LateDataRuleConfigurationProperty {
    val builder = CfnDatasetLateDataRuleConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDatasetLateDataRuleProperty(block: CfnDatasetLateDataRulePropertyDsl.() -> Unit = {}):
      CfnDataset.LateDataRuleProperty {
    val builder = CfnDatasetLateDataRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDatasetOutputFileUriValueProperty(block: CfnDatasetOutputFileUriValuePropertyDsl.() -> Unit
      = {}): CfnDataset.OutputFileUriValueProperty {
    val builder = CfnDatasetOutputFileUriValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDatasetProps(block: CfnDatasetPropsDsl.() -> Unit = {}): CfnDatasetProps {
    val builder = CfnDatasetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDatasetQueryActionProperty(block: CfnDatasetQueryActionPropertyDsl.() -> Unit
      = {}): CfnDataset.QueryActionProperty {
    val builder = CfnDatasetQueryActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDatasetResourceConfigurationProperty(block: CfnDatasetResourceConfigurationPropertyDsl.() -> Unit
      = {}): CfnDataset.ResourceConfigurationProperty {
    val builder = CfnDatasetResourceConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDatasetRetentionPeriodProperty(block: CfnDatasetRetentionPeriodPropertyDsl.() -> Unit =
      {}): CfnDataset.RetentionPeriodProperty {
    val builder = CfnDatasetRetentionPeriodPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDatasetS3DestinationConfigurationProperty(block: CfnDatasetS3DestinationConfigurationPropertyDsl.() -> Unit
      = {}): CfnDataset.S3DestinationConfigurationProperty {
    val builder = CfnDatasetS3DestinationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDatasetScheduleProperty(block: CfnDatasetSchedulePropertyDsl.() -> Unit =
      {}): CfnDataset.ScheduleProperty {
    val builder = CfnDatasetSchedulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDatasetTriggerProperty(block: CfnDatasetTriggerPropertyDsl.() -> Unit = {}):
      CfnDataset.TriggerProperty {
    val builder = CfnDatasetTriggerPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDatasetTriggeringDatasetProperty(block: CfnDatasetTriggeringDatasetPropertyDsl.() -> Unit
      = {}): CfnDataset.TriggeringDatasetProperty {
    val builder = CfnDatasetTriggeringDatasetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDatasetVariableProperty(block: CfnDatasetVariablePropertyDsl.() -> Unit =
      {}): CfnDataset.VariableProperty {
    val builder = CfnDatasetVariablePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDatasetVersioningConfigurationProperty(block: CfnDatasetVersioningConfigurationPropertyDsl.() -> Unit
      = {}): CfnDataset.VersioningConfigurationProperty {
    val builder = CfnDatasetVersioningConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDatastore(
    scope: Construct,
    id: String,
    block: CfnDatastoreDsl.() -> Unit = {},
  ): CfnDatastore {
    val builder = CfnDatastoreDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDatastoreColumnProperty(block: CfnDatastoreColumnPropertyDsl.() -> Unit =
      {}): CfnDatastore.ColumnProperty {
    val builder = CfnDatastoreColumnPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDatastoreCustomerManagedS3Property(block: CfnDatastoreCustomerManagedS3PropertyDsl.() -> Unit
      = {}): CfnDatastore.CustomerManagedS3Property {
    val builder = CfnDatastoreCustomerManagedS3PropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDatastoreCustomerManagedS3StorageProperty(block: CfnDatastoreCustomerManagedS3StoragePropertyDsl.() -> Unit
      = {}): CfnDatastore.CustomerManagedS3StorageProperty {
    val builder = CfnDatastoreCustomerManagedS3StoragePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDatastoreDatastorePartitionProperty(block: CfnDatastoreDatastorePartitionPropertyDsl.() -> Unit
      = {}): CfnDatastore.DatastorePartitionProperty {
    val builder = CfnDatastoreDatastorePartitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDatastoreDatastorePartitionsProperty(block: CfnDatastoreDatastorePartitionsPropertyDsl.() -> Unit
      = {}): CfnDatastore.DatastorePartitionsProperty {
    val builder = CfnDatastoreDatastorePartitionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDatastoreDatastoreStorageProperty(block: CfnDatastoreDatastoreStoragePropertyDsl.() -> Unit
      = {}): CfnDatastore.DatastoreStorageProperty {
    val builder = CfnDatastoreDatastoreStoragePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDatastoreFileFormatConfigurationProperty(block: CfnDatastoreFileFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnDatastore.FileFormatConfigurationProperty {
    val builder = CfnDatastoreFileFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDatastoreIotSiteWiseMultiLayerStorageProperty(block: CfnDatastoreIotSiteWiseMultiLayerStoragePropertyDsl.() -> Unit
      = {}): CfnDatastore.IotSiteWiseMultiLayerStorageProperty {
    val builder = CfnDatastoreIotSiteWiseMultiLayerStoragePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDatastoreParquetConfigurationProperty(block: CfnDatastoreParquetConfigurationPropertyDsl.() -> Unit
      = {}): CfnDatastore.ParquetConfigurationProperty {
    val builder = CfnDatastoreParquetConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDatastorePartitionProperty(block: CfnDatastorePartitionPropertyDsl.() -> Unit
      = {}): CfnDatastore.PartitionProperty {
    val builder = CfnDatastorePartitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDatastoreProps(block: CfnDatastorePropsDsl.() -> Unit = {}):
      CfnDatastoreProps {
    val builder = CfnDatastorePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDatastoreRetentionPeriodProperty(block: CfnDatastoreRetentionPeriodPropertyDsl.() -> Unit
      = {}): CfnDatastore.RetentionPeriodProperty {
    val builder = CfnDatastoreRetentionPeriodPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDatastoreSchemaDefinitionProperty(block: CfnDatastoreSchemaDefinitionPropertyDsl.() -> Unit
      = {}): CfnDatastore.SchemaDefinitionProperty {
    val builder = CfnDatastoreSchemaDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDatastoreTimestampPartitionProperty(block: CfnDatastoreTimestampPartitionPropertyDsl.() -> Unit
      = {}): CfnDatastore.TimestampPartitionProperty {
    val builder = CfnDatastoreTimestampPartitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPipeline(
    scope: Construct,
    id: String,
    block: CfnPipelineDsl.() -> Unit = {},
  ): CfnPipeline {
    val builder = CfnPipelineDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPipelineActivityProperty(block: CfnPipelineActivityPropertyDsl.() -> Unit =
      {}): CfnPipeline.ActivityProperty {
    val builder = CfnPipelineActivityPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipelineAddAttributesProperty(block: CfnPipelineAddAttributesPropertyDsl.() -> Unit =
      {}): CfnPipeline.AddAttributesProperty {
    val builder = CfnPipelineAddAttributesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPipelineChannelProperty(block: CfnPipelineChannelPropertyDsl.() -> Unit =
      {}): CfnPipeline.ChannelProperty {
    val builder = CfnPipelineChannelPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPipelineDatastoreProperty(block: CfnPipelineDatastorePropertyDsl.() -> Unit =
      {}): CfnPipeline.DatastoreProperty {
    val builder = CfnPipelineDatastorePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipelineDeviceRegistryEnrichProperty(block: CfnPipelineDeviceRegistryEnrichPropertyDsl.() -> Unit
      = {}): CfnPipeline.DeviceRegistryEnrichProperty {
    val builder = CfnPipelineDeviceRegistryEnrichPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipelineDeviceShadowEnrichProperty(block: CfnPipelineDeviceShadowEnrichPropertyDsl.() -> Unit
      = {}): CfnPipeline.DeviceShadowEnrichProperty {
    val builder = CfnPipelineDeviceShadowEnrichPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPipelineFilterProperty(block: CfnPipelineFilterPropertyDsl.() -> Unit = {}):
      CfnPipeline.FilterProperty {
    val builder = CfnPipelineFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPipelineLambdaProperty(block: CfnPipelineLambdaPropertyDsl.() -> Unit = {}):
      CfnPipeline.LambdaProperty {
    val builder = CfnPipelineLambdaPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPipelineMathProperty(block: CfnPipelineMathPropertyDsl.() -> Unit = {}):
      CfnPipeline.MathProperty {
    val builder = CfnPipelineMathPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPipelineProps(block: CfnPipelinePropsDsl.() -> Unit = {}): CfnPipelineProps {
    val builder = CfnPipelinePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipelineRemoveAttributesProperty(block: CfnPipelineRemoveAttributesPropertyDsl.() -> Unit
      = {}): CfnPipeline.RemoveAttributesProperty {
    val builder = CfnPipelineRemoveAttributesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipelineSelectAttributesProperty(block: CfnPipelineSelectAttributesPropertyDsl.() -> Unit
      = {}): CfnPipeline.SelectAttributesProperty {
    val builder = CfnPipelineSelectAttributesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
