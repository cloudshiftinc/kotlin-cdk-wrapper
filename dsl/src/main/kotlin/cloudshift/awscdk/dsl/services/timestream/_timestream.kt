@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.timestream

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.timestream.CfnDatabase
import software.amazon.awscdk.services.timestream.CfnDatabaseProps
import software.amazon.awscdk.services.timestream.CfnScheduledQuery
import software.amazon.awscdk.services.timestream.CfnScheduledQueryProps
import software.amazon.awscdk.services.timestream.CfnTable
import software.amazon.awscdk.services.timestream.CfnTableProps
import software.constructs.Construct

public object timestream {
  public inline fun cfnDatabase(
    scope: Construct,
    id: String,
    block: CfnDatabaseDsl.() -> Unit = {},
  ): CfnDatabase {
    val builder = CfnDatabaseDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDatabaseProps(block: CfnDatabasePropsDsl.() -> Unit = {}): CfnDatabaseProps {
    val builder = CfnDatabasePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnScheduledQuery(
    scope: Construct,
    id: String,
    block: CfnScheduledQueryDsl.() -> Unit = {},
  ): CfnScheduledQuery {
    val builder = CfnScheduledQueryDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnScheduledQueryDimensionMappingProperty(block: CfnScheduledQueryDimensionMappingPropertyDsl.() -> Unit
      = {}): CfnScheduledQuery.DimensionMappingProperty {
    val builder = CfnScheduledQueryDimensionMappingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnScheduledQueryErrorReportConfigurationProperty(block: CfnScheduledQueryErrorReportConfigurationPropertyDsl.() -> Unit
      = {}): CfnScheduledQuery.ErrorReportConfigurationProperty {
    val builder = CfnScheduledQueryErrorReportConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnScheduledQueryMixedMeasureMappingProperty(block: CfnScheduledQueryMixedMeasureMappingPropertyDsl.() -> Unit
      = {}): CfnScheduledQuery.MixedMeasureMappingProperty {
    val builder = CfnScheduledQueryMixedMeasureMappingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnScheduledQueryMultiMeasureAttributeMappingProperty(block: CfnScheduledQueryMultiMeasureAttributeMappingPropertyDsl.() -> Unit
      = {}): CfnScheduledQuery.MultiMeasureAttributeMappingProperty {
    val builder = CfnScheduledQueryMultiMeasureAttributeMappingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnScheduledQueryMultiMeasureMappingsProperty(block: CfnScheduledQueryMultiMeasureMappingsPropertyDsl.() -> Unit
      = {}): CfnScheduledQuery.MultiMeasureMappingsProperty {
    val builder = CfnScheduledQueryMultiMeasureMappingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnScheduledQueryNotificationConfigurationProperty(block: CfnScheduledQueryNotificationConfigurationPropertyDsl.() -> Unit
      = {}): CfnScheduledQuery.NotificationConfigurationProperty {
    val builder = CfnScheduledQueryNotificationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnScheduledQueryProps(block: CfnScheduledQueryPropsDsl.() -> Unit = {}):
      CfnScheduledQueryProps {
    val builder = CfnScheduledQueryPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnScheduledQueryS3ConfigurationProperty(block: CfnScheduledQueryS3ConfigurationPropertyDsl.() -> Unit
      = {}): CfnScheduledQuery.S3ConfigurationProperty {
    val builder = CfnScheduledQueryS3ConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnScheduledQueryScheduleConfigurationProperty(block: CfnScheduledQueryScheduleConfigurationPropertyDsl.() -> Unit
      = {}): CfnScheduledQuery.ScheduleConfigurationProperty {
    val builder = CfnScheduledQueryScheduleConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnScheduledQuerySnsConfigurationProperty(block: CfnScheduledQuerySnsConfigurationPropertyDsl.() -> Unit
      = {}): CfnScheduledQuery.SnsConfigurationProperty {
    val builder = CfnScheduledQuerySnsConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnScheduledQueryTargetConfigurationProperty(block: CfnScheduledQueryTargetConfigurationPropertyDsl.() -> Unit
      = {}): CfnScheduledQuery.TargetConfigurationProperty {
    val builder = CfnScheduledQueryTargetConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnScheduledQueryTimestreamConfigurationProperty(block: CfnScheduledQueryTimestreamConfigurationPropertyDsl.() -> Unit
      = {}): CfnScheduledQuery.TimestreamConfigurationProperty {
    val builder = CfnScheduledQueryTimestreamConfigurationPropertyDsl()
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
      fun cfnTableMagneticStoreRejectedDataLocationProperty(block: CfnTableMagneticStoreRejectedDataLocationPropertyDsl.() -> Unit
      = {}): CfnTable.MagneticStoreRejectedDataLocationProperty {
    val builder = CfnTableMagneticStoreRejectedDataLocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTableMagneticStoreWritePropertiesProperty(block: CfnTableMagneticStoreWritePropertiesPropertyDsl.() -> Unit
      = {}): CfnTable.MagneticStoreWritePropertiesProperty {
    val builder = CfnTableMagneticStoreWritePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTableProps(block: CfnTablePropsDsl.() -> Unit = {}): CfnTableProps {
    val builder = CfnTablePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTableRetentionPropertiesProperty(block: CfnTableRetentionPropertiesPropertyDsl.() -> Unit
      = {}): CfnTable.RetentionPropertiesProperty {
    val builder = CfnTableRetentionPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTableS3ConfigurationProperty(block: CfnTableS3ConfigurationPropertyDsl.() -> Unit =
      {}): CfnTable.S3ConfigurationProperty {
    val builder = CfnTableS3ConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
