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

import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

/**
 * Provides a description of Amazon CloudWatch logging options, including the log stream Amazon
 * Resource Name (ARN).
 */
public inline fun CfnApplicationCloudWatchLoggingOptionV2.setCloudWatchLoggingOption(
    block: CfnApplicationCloudWatchLoggingOptionV2CloudWatchLoggingOptionPropertyDsl.() -> Unit = {}
) {
    val builder = CfnApplicationCloudWatchLoggingOptionV2CloudWatchLoggingOptionPropertyDsl()
    builder.apply(block)
    return setCloudWatchLoggingOption(builder.build())
}

/** An array of objects, each describing one output configuration. */
public inline fun CfnApplicationOutput.setOutput(
    block: CfnApplicationOutputOutputPropertyDsl.() -> Unit = {}
) {
    val builder = CfnApplicationOutputOutputPropertyDsl()
    builder.apply(block)
    return setOutput(builder.build())
}

/**
 * Describes a SQL-based Kinesis Data Analytics application's output configuration, in which you
 * identify an in-application stream and a destination where you want the in-application stream data
 * to be written.
 */
public inline fun CfnApplicationOutputV2.setOutput(
    block: CfnApplicationOutputV2OutputPropertyDsl.() -> Unit = {}
) {
    val builder = CfnApplicationOutputV2OutputPropertyDsl()
    builder.apply(block)
    return setOutput(builder.build())
}

/** The reference data source can be an object in your Amazon S3 bucket. */
public inline fun CfnApplicationReferenceDataSource.setReferenceDataSource(
    block: CfnApplicationReferenceDataSourceReferenceDataSourcePropertyDsl.() -> Unit = {}
) {
    val builder = CfnApplicationReferenceDataSourceReferenceDataSourcePropertyDsl()
    builder.apply(block)
    return setReferenceDataSource(builder.build())
}

/**
 * For a SQL-based Kinesis Data Analytics application, describes the reference data source by
 * providing the source information (Amazon S3 bucket name and object key name), the resulting
 * in-application table name that is created, and the necessary schema to map the data elements in
 * the Amazon S3 object to the in-application table.
 */
public inline fun CfnApplicationReferenceDataSourceV2.setReferenceDataSource(
    block: CfnApplicationReferenceDataSourceV2ReferenceDataSourcePropertyDsl.() -> Unit = {}
) {
    val builder = CfnApplicationReferenceDataSourceV2ReferenceDataSourcePropertyDsl()
    builder.apply(block)
    return setReferenceDataSource(builder.build())
}

/** Use this parameter to configure the application. */
public inline fun CfnApplicationV2.setApplicationConfiguration(
    block: CfnApplicationV2ApplicationConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnApplicationV2ApplicationConfigurationPropertyDsl()
    builder.apply(block)
    return setApplicationConfiguration(builder.build())
}

/** Describes the maintenance configuration for the application. */
public inline fun CfnApplicationV2.setApplicationMaintenanceConfiguration(
    block: CfnApplicationV2ApplicationMaintenanceConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnApplicationV2ApplicationMaintenanceConfigurationPropertyDsl()
    builder.apply(block)
    return setApplicationMaintenanceConfiguration(builder.build())
}

/** Identifies the run configuration (start parameters) of a Kinesis Data Analytics application. */
public inline fun CfnApplicationV2.setRunConfiguration(
    block: CfnApplicationV2RunConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnApplicationV2RunConfigurationPropertyDsl()
    builder.apply(block)
    return setRunConfiguration(builder.build())
}
