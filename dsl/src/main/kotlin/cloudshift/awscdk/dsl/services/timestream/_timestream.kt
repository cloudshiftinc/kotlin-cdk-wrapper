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
    /**
     * Creates a new Timestream database.
     *
     * If the AWS KMS key is not specified, the database will be encrypted with a Timestream managed
     * AWS KMS key located in your account. Refer to
     * [AWS managed AWS KMS keys](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk)
     * for more info.
     * [Service quotas apply](https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html)
     * . See
     * [code sample](https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.create-db.html)
     * for details.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.timestream.*;
     * CfnDatabase cfnDatabase = CfnDatabase.Builder.create(this, "MyCfnDatabase")
     * .databaseName("databaseName")
     * .kmsKeyId("kmsKeyId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-database.html)
     */
    public inline fun cfnDatabase(
        scope: Construct,
        id: String,
        block: CfnDatabaseDsl.() -> Unit = {},
    ): CfnDatabase {
        val builder = CfnDatabaseDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDatabase`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.timestream.*;
     * CfnDatabaseProps cfnDatabaseProps = CfnDatabaseProps.builder()
     * .databaseName("databaseName")
     * .kmsKeyId("kmsKeyId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-database.html)
     */
    public inline fun cfnDatabaseProps(
        block: CfnDatabasePropsDsl.() -> Unit = {}
    ): CfnDatabaseProps {
        val builder = CfnDatabasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Create a scheduled query that will be run on your behalf at the configured schedule.
     *
     * Timestream assumes the execution role provided as part of the
     * `ScheduledQueryExecutionRoleArn` parameter to run the query. You can use the
     * `NotificationConfiguration` parameter to configure notification for your scheduled query
     * operations.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.timestream.*;
     * CfnScheduledQuery cfnScheduledQuery = CfnScheduledQuery.Builder.create(this,
     * "MyCfnScheduledQuery")
     * .errorReportConfiguration(ErrorReportConfigurationProperty.builder()
     * .s3Configuration(S3ConfigurationProperty.builder()
     * .bucketName("bucketName")
     * // the properties below are optional
     * .encryptionOption("encryptionOption")
     * .objectKeyPrefix("objectKeyPrefix")
     * .build())
     * .build())
     * .notificationConfiguration(NotificationConfigurationProperty.builder()
     * .snsConfiguration(SnsConfigurationProperty.builder()
     * .topicArn("topicArn")
     * .build())
     * .build())
     * .queryString("queryString")
     * .scheduleConfiguration(ScheduleConfigurationProperty.builder()
     * .scheduleExpression("scheduleExpression")
     * .build())
     * .scheduledQueryExecutionRoleArn("scheduledQueryExecutionRoleArn")
     * // the properties below are optional
     * .clientToken("clientToken")
     * .kmsKeyId("kmsKeyId")
     * .scheduledQueryName("scheduledQueryName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .targetConfiguration(TargetConfigurationProperty.builder()
     * .timestreamConfiguration(TimestreamConfigurationProperty.builder()
     * .databaseName("databaseName")
     * .dimensionMappings(List.of(DimensionMappingProperty.builder()
     * .dimensionValueType("dimensionValueType")
     * .name("name")
     * .build()))
     * .tableName("tableName")
     * .timeColumn("timeColumn")
     * // the properties below are optional
     * .measureNameColumn("measureNameColumn")
     * .mixedMeasureMappings(List.of(MixedMeasureMappingProperty.builder()
     * .measureValueType("measureValueType")
     * // the properties below are optional
     * .measureName("measureName")
     * .multiMeasureAttributeMappings(List.of(MultiMeasureAttributeMappingProperty.builder()
     * .measureValueType("measureValueType")
     * .sourceColumn("sourceColumn")
     * // the properties below are optional
     * .targetMultiMeasureAttributeName("targetMultiMeasureAttributeName")
     * .build()))
     * .sourceColumn("sourceColumn")
     * .targetMeasureName("targetMeasureName")
     * .build()))
     * .multiMeasureMappings(MultiMeasureMappingsProperty.builder()
     * .multiMeasureAttributeMappings(List.of(MultiMeasureAttributeMappingProperty.builder()
     * .measureValueType("measureValueType")
     * .sourceColumn("sourceColumn")
     * // the properties below are optional
     * .targetMultiMeasureAttributeName("targetMultiMeasureAttributeName")
     * .build()))
     * // the properties below are optional
     * .targetMultiMeasureName("targetMultiMeasureName")
     * .build())
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html)
     */
    public inline fun cfnScheduledQuery(
        scope: Construct,
        id: String,
        block: CfnScheduledQueryDsl.() -> Unit = {},
    ): CfnScheduledQuery {
        val builder = CfnScheduledQueryDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * This type is used to map column(s) from the query result to a dimension in the destination
     * table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.timestream.*;
     * DimensionMappingProperty dimensionMappingProperty = DimensionMappingProperty.builder()
     * .dimensionValueType("dimensionValueType")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-dimensionmapping.html)
     */
    public inline fun cfnScheduledQueryDimensionMappingProperty(
        block: CfnScheduledQueryDimensionMappingPropertyDsl.() -> Unit = {}
    ): CfnScheduledQuery.DimensionMappingProperty {
        val builder = CfnScheduledQueryDimensionMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration required for error reporting.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.timestream.*;
     * ErrorReportConfigurationProperty errorReportConfigurationProperty =
     * ErrorReportConfigurationProperty.builder()
     * .s3Configuration(S3ConfigurationProperty.builder()
     * .bucketName("bucketName")
     * // the properties below are optional
     * .encryptionOption("encryptionOption")
     * .objectKeyPrefix("objectKeyPrefix")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-errorreportconfiguration.html)
     */
    public inline fun cfnScheduledQueryErrorReportConfigurationProperty(
        block: CfnScheduledQueryErrorReportConfigurationPropertyDsl.() -> Unit = {}
    ): CfnScheduledQuery.ErrorReportConfigurationProperty {
        val builder = CfnScheduledQueryErrorReportConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * MixedMeasureMappings are mappings that can be used to ingest data into a mixture of narrow
     * and multi measures in the derived table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.timestream.*;
     * MixedMeasureMappingProperty mixedMeasureMappingProperty = MixedMeasureMappingProperty.builder()
     * .measureValueType("measureValueType")
     * // the properties below are optional
     * .measureName("measureName")
     * .multiMeasureAttributeMappings(List.of(MultiMeasureAttributeMappingProperty.builder()
     * .measureValueType("measureValueType")
     * .sourceColumn("sourceColumn")
     * // the properties below are optional
     * .targetMultiMeasureAttributeName("targetMultiMeasureAttributeName")
     * .build()))
     * .sourceColumn("sourceColumn")
     * .targetMeasureName("targetMeasureName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-mixedmeasuremapping.html)
     */
    public inline fun cfnScheduledQueryMixedMeasureMappingProperty(
        block: CfnScheduledQueryMixedMeasureMappingPropertyDsl.() -> Unit = {}
    ): CfnScheduledQuery.MixedMeasureMappingProperty {
        val builder = CfnScheduledQueryMixedMeasureMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attribute mapping for MULTI value measures.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.timestream.*;
     * MultiMeasureAttributeMappingProperty multiMeasureAttributeMappingProperty =
     * MultiMeasureAttributeMappingProperty.builder()
     * .measureValueType("measureValueType")
     * .sourceColumn("sourceColumn")
     * // the properties below are optional
     * .targetMultiMeasureAttributeName("targetMultiMeasureAttributeName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-multimeasureattributemapping.html)
     */
    public inline fun cfnScheduledQueryMultiMeasureAttributeMappingProperty(
        block: CfnScheduledQueryMultiMeasureAttributeMappingPropertyDsl.() -> Unit = {}
    ): CfnScheduledQuery.MultiMeasureAttributeMappingProperty {
        val builder = CfnScheduledQueryMultiMeasureAttributeMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Only one of MixedMeasureMappings or MultiMeasureMappings is to be provided.
     *
     * MultiMeasureMappings can be used to ingest data as multi measures in the derived table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.timestream.*;
     * MultiMeasureMappingsProperty multiMeasureMappingsProperty =
     * MultiMeasureMappingsProperty.builder()
     * .multiMeasureAttributeMappings(List.of(MultiMeasureAttributeMappingProperty.builder()
     * .measureValueType("measureValueType")
     * .sourceColumn("sourceColumn")
     * // the properties below are optional
     * .targetMultiMeasureAttributeName("targetMultiMeasureAttributeName")
     * .build()))
     * // the properties below are optional
     * .targetMultiMeasureName("targetMultiMeasureName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-multimeasuremappings.html)
     */
    public inline fun cfnScheduledQueryMultiMeasureMappingsProperty(
        block: CfnScheduledQueryMultiMeasureMappingsPropertyDsl.() -> Unit = {}
    ): CfnScheduledQuery.MultiMeasureMappingsProperty {
        val builder = CfnScheduledQueryMultiMeasureMappingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Notification configuration for a scheduled query.
     *
     * A notification is sent by Timestream when a scheduled query is created, its state is updated
     * or when it is deleted.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.timestream.*;
     * NotificationConfigurationProperty notificationConfigurationProperty =
     * NotificationConfigurationProperty.builder()
     * .snsConfiguration(SnsConfigurationProperty.builder()
     * .topicArn("topicArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-notificationconfiguration.html)
     */
    public inline fun cfnScheduledQueryNotificationConfigurationProperty(
        block: CfnScheduledQueryNotificationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnScheduledQuery.NotificationConfigurationProperty {
        val builder = CfnScheduledQueryNotificationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnScheduledQuery`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.timestream.*;
     * CfnScheduledQueryProps cfnScheduledQueryProps = CfnScheduledQueryProps.builder()
     * .errorReportConfiguration(ErrorReportConfigurationProperty.builder()
     * .s3Configuration(S3ConfigurationProperty.builder()
     * .bucketName("bucketName")
     * // the properties below are optional
     * .encryptionOption("encryptionOption")
     * .objectKeyPrefix("objectKeyPrefix")
     * .build())
     * .build())
     * .notificationConfiguration(NotificationConfigurationProperty.builder()
     * .snsConfiguration(SnsConfigurationProperty.builder()
     * .topicArn("topicArn")
     * .build())
     * .build())
     * .queryString("queryString")
     * .scheduleConfiguration(ScheduleConfigurationProperty.builder()
     * .scheduleExpression("scheduleExpression")
     * .build())
     * .scheduledQueryExecutionRoleArn("scheduledQueryExecutionRoleArn")
     * // the properties below are optional
     * .clientToken("clientToken")
     * .kmsKeyId("kmsKeyId")
     * .scheduledQueryName("scheduledQueryName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .targetConfiguration(TargetConfigurationProperty.builder()
     * .timestreamConfiguration(TimestreamConfigurationProperty.builder()
     * .databaseName("databaseName")
     * .dimensionMappings(List.of(DimensionMappingProperty.builder()
     * .dimensionValueType("dimensionValueType")
     * .name("name")
     * .build()))
     * .tableName("tableName")
     * .timeColumn("timeColumn")
     * // the properties below are optional
     * .measureNameColumn("measureNameColumn")
     * .mixedMeasureMappings(List.of(MixedMeasureMappingProperty.builder()
     * .measureValueType("measureValueType")
     * // the properties below are optional
     * .measureName("measureName")
     * .multiMeasureAttributeMappings(List.of(MultiMeasureAttributeMappingProperty.builder()
     * .measureValueType("measureValueType")
     * .sourceColumn("sourceColumn")
     * // the properties below are optional
     * .targetMultiMeasureAttributeName("targetMultiMeasureAttributeName")
     * .build()))
     * .sourceColumn("sourceColumn")
     * .targetMeasureName("targetMeasureName")
     * .build()))
     * .multiMeasureMappings(MultiMeasureMappingsProperty.builder()
     * .multiMeasureAttributeMappings(List.of(MultiMeasureAttributeMappingProperty.builder()
     * .measureValueType("measureValueType")
     * .sourceColumn("sourceColumn")
     * // the properties below are optional
     * .targetMultiMeasureAttributeName("targetMultiMeasureAttributeName")
     * .build()))
     * // the properties below are optional
     * .targetMultiMeasureName("targetMultiMeasureName")
     * .build())
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html)
     */
    public inline fun cfnScheduledQueryProps(
        block: CfnScheduledQueryPropsDsl.() -> Unit = {}
    ): CfnScheduledQueryProps {
        val builder = CfnScheduledQueryPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details on S3 location for error reports that result from running a query.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.timestream.*;
     * S3ConfigurationProperty s3ConfigurationProperty = S3ConfigurationProperty.builder()
     * .bucketName("bucketName")
     * // the properties below are optional
     * .encryptionOption("encryptionOption")
     * .objectKeyPrefix("objectKeyPrefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-s3configuration.html)
     */
    public inline fun cfnScheduledQueryS3ConfigurationProperty(
        block: CfnScheduledQueryS3ConfigurationPropertyDsl.() -> Unit = {}
    ): CfnScheduledQuery.S3ConfigurationProperty {
        val builder = CfnScheduledQueryS3ConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration of the schedule of the query.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.timestream.*;
     * ScheduleConfigurationProperty scheduleConfigurationProperty =
     * ScheduleConfigurationProperty.builder()
     * .scheduleExpression("scheduleExpression")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-scheduleconfiguration.html)
     */
    public inline fun cfnScheduledQueryScheduleConfigurationProperty(
        block: CfnScheduledQueryScheduleConfigurationPropertyDsl.() -> Unit = {}
    ): CfnScheduledQuery.ScheduleConfigurationProperty {
        val builder = CfnScheduledQueryScheduleConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details on SNS that are required to send the notification.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.timestream.*;
     * SnsConfigurationProperty snsConfigurationProperty = SnsConfigurationProperty.builder()
     * .topicArn("topicArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-snsconfiguration.html)
     */
    public inline fun cfnScheduledQuerySnsConfigurationProperty(
        block: CfnScheduledQuerySnsConfigurationPropertyDsl.() -> Unit = {}
    ): CfnScheduledQuery.SnsConfigurationProperty {
        val builder = CfnScheduledQuerySnsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration used for writing the output of a query.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.timestream.*;
     * TargetConfigurationProperty targetConfigurationProperty = TargetConfigurationProperty.builder()
     * .timestreamConfiguration(TimestreamConfigurationProperty.builder()
     * .databaseName("databaseName")
     * .dimensionMappings(List.of(DimensionMappingProperty.builder()
     * .dimensionValueType("dimensionValueType")
     * .name("name")
     * .build()))
     * .tableName("tableName")
     * .timeColumn("timeColumn")
     * // the properties below are optional
     * .measureNameColumn("measureNameColumn")
     * .mixedMeasureMappings(List.of(MixedMeasureMappingProperty.builder()
     * .measureValueType("measureValueType")
     * // the properties below are optional
     * .measureName("measureName")
     * .multiMeasureAttributeMappings(List.of(MultiMeasureAttributeMappingProperty.builder()
     * .measureValueType("measureValueType")
     * .sourceColumn("sourceColumn")
     * // the properties below are optional
     * .targetMultiMeasureAttributeName("targetMultiMeasureAttributeName")
     * .build()))
     * .sourceColumn("sourceColumn")
     * .targetMeasureName("targetMeasureName")
     * .build()))
     * .multiMeasureMappings(MultiMeasureMappingsProperty.builder()
     * .multiMeasureAttributeMappings(List.of(MultiMeasureAttributeMappingProperty.builder()
     * .measureValueType("measureValueType")
     * .sourceColumn("sourceColumn")
     * // the properties below are optional
     * .targetMultiMeasureAttributeName("targetMultiMeasureAttributeName")
     * .build()))
     * // the properties below are optional
     * .targetMultiMeasureName("targetMultiMeasureName")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-targetconfiguration.html)
     */
    public inline fun cfnScheduledQueryTargetConfigurationProperty(
        block: CfnScheduledQueryTargetConfigurationPropertyDsl.() -> Unit = {}
    ): CfnScheduledQuery.TargetConfigurationProperty {
        val builder = CfnScheduledQueryTargetConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration to write data into Timestream database and table.
     *
     * This configuration allows the user to map the query result select columns into the
     * destination table columns.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.timestream.*;
     * TimestreamConfigurationProperty timestreamConfigurationProperty =
     * TimestreamConfigurationProperty.builder()
     * .databaseName("databaseName")
     * .dimensionMappings(List.of(DimensionMappingProperty.builder()
     * .dimensionValueType("dimensionValueType")
     * .name("name")
     * .build()))
     * .tableName("tableName")
     * .timeColumn("timeColumn")
     * // the properties below are optional
     * .measureNameColumn("measureNameColumn")
     * .mixedMeasureMappings(List.of(MixedMeasureMappingProperty.builder()
     * .measureValueType("measureValueType")
     * // the properties below are optional
     * .measureName("measureName")
     * .multiMeasureAttributeMappings(List.of(MultiMeasureAttributeMappingProperty.builder()
     * .measureValueType("measureValueType")
     * .sourceColumn("sourceColumn")
     * // the properties below are optional
     * .targetMultiMeasureAttributeName("targetMultiMeasureAttributeName")
     * .build()))
     * .sourceColumn("sourceColumn")
     * .targetMeasureName("targetMeasureName")
     * .build()))
     * .multiMeasureMappings(MultiMeasureMappingsProperty.builder()
     * .multiMeasureAttributeMappings(List.of(MultiMeasureAttributeMappingProperty.builder()
     * .measureValueType("measureValueType")
     * .sourceColumn("sourceColumn")
     * // the properties below are optional
     * .targetMultiMeasureAttributeName("targetMultiMeasureAttributeName")
     * .build()))
     * // the properties below are optional
     * .targetMultiMeasureName("targetMultiMeasureName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-timestreamconfiguration.html)
     */
    public inline fun cfnScheduledQueryTimestreamConfigurationProperty(
        block: CfnScheduledQueryTimestreamConfigurationPropertyDsl.() -> Unit = {}
    ): CfnScheduledQuery.TimestreamConfigurationProperty {
        val builder = CfnScheduledQueryTimestreamConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The CreateTable operation adds a new table to an existing database in your account.
     *
     * In an AWS account, table names must be at least unique within each Region if they are in the
     * same database. You may have identical table names in the same Region if the tables are in
     * separate databases. While creating the table, you must specify the table name, database name,
     * and the retention properties.
     * [Service quotas apply](https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html)
     * . See
     * [code sample](https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.create-table.html)
     * for details.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.timestream.*;
     * Object magneticStoreWriteProperties;
     * Object retentionProperties;
     * CfnTable cfnTable = CfnTable.Builder.create(this, "MyCfnTable")
     * .databaseName("databaseName")
     * // the properties below are optional
     * .magneticStoreWriteProperties(magneticStoreWriteProperties)
     * .retentionProperties(retentionProperties)
     * .tableName("tableName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html)
     */
    public inline fun cfnTable(
        scope: Construct,
        id: String,
        block: CfnTableDsl.() -> Unit = {},
    ): CfnTable {
        val builder = CfnTableDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The location to write error reports for records rejected, asynchronously, during magnetic
     * store writes.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.timestream.*;
     * MagneticStoreRejectedDataLocationProperty magneticStoreRejectedDataLocationProperty =
     * MagneticStoreRejectedDataLocationProperty.builder()
     * .s3Configuration(S3ConfigurationProperty.builder()
     * .bucketName("bucketName")
     * .encryptionOption("encryptionOption")
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .objectKeyPrefix("objectKeyPrefix")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-magneticstorerejecteddatalocation.html)
     */
    public inline fun cfnTableMagneticStoreRejectedDataLocationProperty(
        block: CfnTableMagneticStoreRejectedDataLocationPropertyDsl.() -> Unit = {}
    ): CfnTable.MagneticStoreRejectedDataLocationProperty {
        val builder = CfnTableMagneticStoreRejectedDataLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The set of properties on a table for configuring magnetic store writes.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.timestream.*;
     * MagneticStoreWritePropertiesProperty magneticStoreWritePropertiesProperty =
     * MagneticStoreWritePropertiesProperty.builder()
     * .enableMagneticStoreWrites(false)
     * // the properties below are optional
     * .magneticStoreRejectedDataLocation(MagneticStoreRejectedDataLocationProperty.builder()
     * .s3Configuration(S3ConfigurationProperty.builder()
     * .bucketName("bucketName")
     * .encryptionOption("encryptionOption")
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .objectKeyPrefix("objectKeyPrefix")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-magneticstorewriteproperties.html)
     */
    public inline fun cfnTableMagneticStoreWritePropertiesProperty(
        block: CfnTableMagneticStoreWritePropertiesPropertyDsl.() -> Unit = {}
    ): CfnTable.MagneticStoreWritePropertiesProperty {
        val builder = CfnTableMagneticStoreWritePropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTable`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.timestream.*;
     * Object magneticStoreWriteProperties;
     * Object retentionProperties;
     * CfnTableProps cfnTableProps = CfnTableProps.builder()
     * .databaseName("databaseName")
     * // the properties below are optional
     * .magneticStoreWriteProperties(magneticStoreWriteProperties)
     * .retentionProperties(retentionProperties)
     * .tableName("tableName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html)
     */
    public inline fun cfnTableProps(block: CfnTablePropsDsl.() -> Unit = {}): CfnTableProps {
        val builder = CfnTablePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Retention properties contain the duration for which your time-series data must be stored in
     * the magnetic store and the memory store.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.timestream.*;
     * RetentionPropertiesProperty retentionPropertiesProperty = RetentionPropertiesProperty.builder()
     * .magneticStoreRetentionPeriodInDays("magneticStoreRetentionPeriodInDays")
     * .memoryStoreRetentionPeriodInHours("memoryStoreRetentionPeriodInHours")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-retentionproperties.html)
     */
    public inline fun cfnTableRetentionPropertiesProperty(
        block: CfnTableRetentionPropertiesPropertyDsl.() -> Unit = {}
    ): CfnTable.RetentionPropertiesProperty {
        val builder = CfnTableRetentionPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration that specifies an S3 location.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.timestream.*;
     * S3ConfigurationProperty s3ConfigurationProperty = S3ConfigurationProperty.builder()
     * .bucketName("bucketName")
     * .encryptionOption("encryptionOption")
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .objectKeyPrefix("objectKeyPrefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-s3configuration.html)
     */
    public inline fun cfnTableS3ConfigurationProperty(
        block: CfnTableS3ConfigurationPropertyDsl.() -> Unit = {}
    ): CfnTable.S3ConfigurationProperty {
        val builder = CfnTableS3ConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
