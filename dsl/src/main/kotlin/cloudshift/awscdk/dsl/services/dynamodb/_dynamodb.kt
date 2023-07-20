@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.Attribute
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable
import software.amazon.awscdk.services.dynamodb.CfnGlobalTableProps
import software.amazon.awscdk.services.dynamodb.CfnTable
import software.amazon.awscdk.services.dynamodb.CfnTableProps
import software.amazon.awscdk.services.dynamodb.EnableScalingProps
import software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps
import software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps
import software.amazon.awscdk.services.dynamodb.OperationsMetricOptions
import software.amazon.awscdk.services.dynamodb.SchemaOptions
import software.amazon.awscdk.services.dynamodb.SecondaryIndexProps
import software.amazon.awscdk.services.dynamodb.SystemErrorsForOperationsMetricOptions
import software.amazon.awscdk.services.dynamodb.Table
import software.amazon.awscdk.services.dynamodb.TableAttributes
import software.amazon.awscdk.services.dynamodb.TableOptions
import software.amazon.awscdk.services.dynamodb.TableProps
import software.amazon.awscdk.services.dynamodb.UtilizationScalingProps
import software.constructs.Construct

public object dynamodb {
  public inline fun attribute(block: AttributeDsl.() -> Unit = {}): Attribute {
    val builder = AttributeDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGlobalTable(
    scope: Construct,
    id: String,
    block: CfnGlobalTableDsl.() -> Unit = {},
  ): CfnGlobalTable {
    val builder = CfnGlobalTableDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGlobalTableAttributeDefinitionProperty(block: CfnGlobalTableAttributeDefinitionPropertyDsl.() -> Unit
      = {}): CfnGlobalTable.AttributeDefinitionProperty {
    val builder = CfnGlobalTableAttributeDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGlobalTableCapacityAutoScalingSettingsProperty(block: CfnGlobalTableCapacityAutoScalingSettingsPropertyDsl.() -> Unit
      = {}): CfnGlobalTable.CapacityAutoScalingSettingsProperty {
    val builder = CfnGlobalTableCapacityAutoScalingSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGlobalTableContributorInsightsSpecificationProperty(block: CfnGlobalTableContributorInsightsSpecificationPropertyDsl.() -> Unit
      = {}): CfnGlobalTable.ContributorInsightsSpecificationProperty {
    val builder = CfnGlobalTableContributorInsightsSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGlobalTableGlobalSecondaryIndexProperty(block: CfnGlobalTableGlobalSecondaryIndexPropertyDsl.() -> Unit
      = {}): CfnGlobalTable.GlobalSecondaryIndexProperty {
    val builder = CfnGlobalTableGlobalSecondaryIndexPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGlobalTableKeySchemaProperty(block: CfnGlobalTableKeySchemaPropertyDsl.() -> Unit =
      {}): CfnGlobalTable.KeySchemaProperty {
    val builder = CfnGlobalTableKeySchemaPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGlobalTableKinesisStreamSpecificationProperty(block: CfnGlobalTableKinesisStreamSpecificationPropertyDsl.() -> Unit
      = {}): CfnGlobalTable.KinesisStreamSpecificationProperty {
    val builder = CfnGlobalTableKinesisStreamSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGlobalTableLocalSecondaryIndexProperty(block: CfnGlobalTableLocalSecondaryIndexPropertyDsl.() -> Unit
      = {}): CfnGlobalTable.LocalSecondaryIndexProperty {
    val builder = CfnGlobalTableLocalSecondaryIndexPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGlobalTablePointInTimeRecoverySpecificationProperty(block: CfnGlobalTablePointInTimeRecoverySpecificationPropertyDsl.() -> Unit
      = {}): CfnGlobalTable.PointInTimeRecoverySpecificationProperty {
    val builder = CfnGlobalTablePointInTimeRecoverySpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGlobalTableProjectionProperty(block: CfnGlobalTableProjectionPropertyDsl.() -> Unit =
      {}): CfnGlobalTable.ProjectionProperty {
    val builder = CfnGlobalTableProjectionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGlobalTableProps(block: CfnGlobalTablePropsDsl.() -> Unit = {}):
      CfnGlobalTableProps {
    val builder = CfnGlobalTablePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGlobalTableReadProvisionedThroughputSettingsProperty(block: CfnGlobalTableReadProvisionedThroughputSettingsPropertyDsl.() -> Unit
      = {}): CfnGlobalTable.ReadProvisionedThroughputSettingsProperty {
    val builder = CfnGlobalTableReadProvisionedThroughputSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGlobalTableReplicaGlobalSecondaryIndexSpecificationProperty(block: CfnGlobalTableReplicaGlobalSecondaryIndexSpecificationPropertyDsl.() -> Unit
      = {}): CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty {
    val builder = CfnGlobalTableReplicaGlobalSecondaryIndexSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGlobalTableReplicaSSESpecificationProperty(block: CfnGlobalTableReplicaSSESpecificationPropertyDsl.() -> Unit
      = {}): CfnGlobalTable.ReplicaSSESpecificationProperty {
    val builder = CfnGlobalTableReplicaSSESpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGlobalTableReplicaSpecificationProperty(block: CfnGlobalTableReplicaSpecificationPropertyDsl.() -> Unit
      = {}): CfnGlobalTable.ReplicaSpecificationProperty {
    val builder = CfnGlobalTableReplicaSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGlobalTableSSESpecificationProperty(block: CfnGlobalTableSSESpecificationPropertyDsl.() -> Unit
      = {}): CfnGlobalTable.SSESpecificationProperty {
    val builder = CfnGlobalTableSSESpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGlobalTableStreamSpecificationProperty(block: CfnGlobalTableStreamSpecificationPropertyDsl.() -> Unit
      = {}): CfnGlobalTable.StreamSpecificationProperty {
    val builder = CfnGlobalTableStreamSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGlobalTableTargetTrackingScalingPolicyConfigurationProperty(block: CfnGlobalTableTargetTrackingScalingPolicyConfigurationPropertyDsl.() -> Unit
      = {}): CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty {
    val builder = CfnGlobalTableTargetTrackingScalingPolicyConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGlobalTableTimeToLiveSpecificationProperty(block: CfnGlobalTableTimeToLiveSpecificationPropertyDsl.() -> Unit
      = {}): CfnGlobalTable.TimeToLiveSpecificationProperty {
    val builder = CfnGlobalTableTimeToLiveSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGlobalTableWriteProvisionedThroughputSettingsProperty(block: CfnGlobalTableWriteProvisionedThroughputSettingsPropertyDsl.() -> Unit
      = {}): CfnGlobalTable.WriteProvisionedThroughputSettingsProperty {
    val builder = CfnGlobalTableWriteProvisionedThroughputSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTable(
    scope: Construct,
    id: String,
    block: CfnTableDsl.() -> Unit = {},
  ): CfnTable {
    val builder = CfnTableDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTableAttributeDefinitionProperty(block: CfnTableAttributeDefinitionPropertyDsl.() -> Unit
      = {}): CfnTable.AttributeDefinitionProperty {
    val builder = CfnTableAttributeDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTableContributorInsightsSpecificationProperty(block: CfnTableContributorInsightsSpecificationPropertyDsl.() -> Unit
      = {}): CfnTable.ContributorInsightsSpecificationProperty {
    val builder = CfnTableContributorInsightsSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTableCsvProperty(block: CfnTableCsvPropertyDsl.() -> Unit = {}):
      CfnTable.CsvProperty {
    val builder = CfnTableCsvPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTableGlobalSecondaryIndexProperty(block: CfnTableGlobalSecondaryIndexPropertyDsl.() -> Unit
      = {}): CfnTable.GlobalSecondaryIndexProperty {
    val builder = CfnTableGlobalSecondaryIndexPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTableImportSourceSpecificationProperty(block: CfnTableImportSourceSpecificationPropertyDsl.() -> Unit
      = {}): CfnTable.ImportSourceSpecificationProperty {
    val builder = CfnTableImportSourceSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTableInputFormatOptionsProperty(block: CfnTableInputFormatOptionsPropertyDsl.() -> Unit
      = {}): CfnTable.InputFormatOptionsProperty {
    val builder = CfnTableInputFormatOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTableKeySchemaProperty(block: CfnTableKeySchemaPropertyDsl.() -> Unit = {}):
      CfnTable.KeySchemaProperty {
    val builder = CfnTableKeySchemaPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTableKinesisStreamSpecificationProperty(block: CfnTableKinesisStreamSpecificationPropertyDsl.() -> Unit
      = {}): CfnTable.KinesisStreamSpecificationProperty {
    val builder = CfnTableKinesisStreamSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTableLocalSecondaryIndexProperty(block: CfnTableLocalSecondaryIndexPropertyDsl.() -> Unit
      = {}): CfnTable.LocalSecondaryIndexProperty {
    val builder = CfnTableLocalSecondaryIndexPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTablePointInTimeRecoverySpecificationProperty(block: CfnTablePointInTimeRecoverySpecificationPropertyDsl.() -> Unit
      = {}): CfnTable.PointInTimeRecoverySpecificationProperty {
    val builder = CfnTablePointInTimeRecoverySpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTableProjectionProperty(block: CfnTableProjectionPropertyDsl.() -> Unit =
      {}): CfnTable.ProjectionProperty {
    val builder = CfnTableProjectionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTableProps(block: CfnTablePropsDsl.() -> Unit = {}): CfnTableProps {
    val builder = CfnTablePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTableProvisionedThroughputProperty(block: CfnTableProvisionedThroughputPropertyDsl.() -> Unit
      = {}): CfnTable.ProvisionedThroughputProperty {
    val builder = CfnTableProvisionedThroughputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTableS3BucketSourceProperty(block: CfnTableS3BucketSourcePropertyDsl.() -> Unit = {}):
      CfnTable.S3BucketSourceProperty {
    val builder = CfnTableS3BucketSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTableSSESpecificationProperty(block: CfnTableSSESpecificationPropertyDsl.() -> Unit =
      {}): CfnTable.SSESpecificationProperty {
    val builder = CfnTableSSESpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTableStreamSpecificationProperty(block: CfnTableStreamSpecificationPropertyDsl.() -> Unit
      = {}): CfnTable.StreamSpecificationProperty {
    val builder = CfnTableStreamSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTableTimeToLiveSpecificationProperty(block: CfnTableTimeToLiveSpecificationPropertyDsl.() -> Unit
      = {}): CfnTable.TimeToLiveSpecificationProperty {
    val builder = CfnTableTimeToLiveSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun enableScalingProps(block: EnableScalingPropsDsl.() -> Unit = {}):
      EnableScalingProps {
    val builder = EnableScalingPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun globalSecondaryIndexProps(block: GlobalSecondaryIndexPropsDsl.() -> Unit = {}):
      GlobalSecondaryIndexProps {
    val builder = GlobalSecondaryIndexPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun localSecondaryIndexProps(block: LocalSecondaryIndexPropsDsl.() -> Unit = {}):
      LocalSecondaryIndexProps {
    val builder = LocalSecondaryIndexPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun operationsMetricOptions(block: OperationsMetricOptionsDsl.() -> Unit = {}):
      OperationsMetricOptions {
    val builder = OperationsMetricOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun schemaOptions(block: SchemaOptionsDsl.() -> Unit = {}): SchemaOptions {
    val builder = SchemaOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun secondaryIndexProps(block: SecondaryIndexPropsDsl.() -> Unit = {}):
      SecondaryIndexProps {
    val builder = SecondaryIndexPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun systemErrorsForOperationsMetricOptions(block: SystemErrorsForOperationsMetricOptionsDsl.() -> Unit
      = {}): SystemErrorsForOperationsMetricOptions {
    val builder = SystemErrorsForOperationsMetricOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun table(
    scope: Construct,
    id: String,
    block: TableDsl.() -> Unit = {},
  ): Table {
    val builder = TableDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun tableAttributes(block: TableAttributesDsl.() -> Unit = {}): TableAttributes {
    val builder = TableAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun tableOptions(block: TableOptionsDsl.() -> Unit = {}): TableOptions {
    val builder = TableOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun tableProps(block: TablePropsDsl.() -> Unit = {}): TableProps {
    val builder = TablePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun utilizationScalingProps(block: UtilizationScalingPropsDsl.() -> Unit = {}):
      UtilizationScalingProps {
    val builder = UtilizationScalingPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
