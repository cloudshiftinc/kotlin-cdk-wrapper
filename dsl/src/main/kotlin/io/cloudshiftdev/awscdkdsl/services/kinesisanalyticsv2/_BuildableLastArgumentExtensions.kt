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

import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSource

/** Use this parameter to configure the application. */
public inline fun CfnApplication.setApplicationConfiguration(
    block: CfnApplicationApplicationConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnApplicationApplicationConfigurationPropertyDsl()
    builder.apply(block)
    return setApplicationConfiguration(builder.build())
}

/** Describes the maintenance configuration for the application. */
public inline fun CfnApplication.setApplicationMaintenanceConfiguration(
    block: CfnApplicationApplicationMaintenanceConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnApplicationApplicationMaintenanceConfigurationPropertyDsl()
    builder.apply(block)
    return setApplicationMaintenanceConfiguration(builder.build())
}

/** Identifies the run configuration (start parameters) of a Kinesis Data Analytics application. */
public inline fun CfnApplication.setRunConfiguration(
    block: CfnApplicationRunConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnApplicationRunConfigurationPropertyDsl()
    builder.apply(block)
    return setRunConfiguration(builder.build())
}

/**
 * Provides a description of Amazon CloudWatch logging options, including the log stream Amazon
 * Resource Name (ARN).
 */
public inline fun CfnApplicationCloudWatchLoggingOption.setCloudWatchLoggingOption(
    block: CfnApplicationCloudWatchLoggingOptionCloudWatchLoggingOptionPropertyDsl.() -> Unit = {}
) {
    val builder = CfnApplicationCloudWatchLoggingOptionCloudWatchLoggingOptionPropertyDsl()
    builder.apply(block)
    return setCloudWatchLoggingOption(builder.build())
}

/**
 * Describes a SQL-based Kinesis Data Analytics application's output configuration, in which you
 * identify an in-application stream and a destination where you want the in-application stream data
 * to be written.
 */
public inline fun CfnApplicationOutput.setOutput(
    block: CfnApplicationOutputOutputPropertyDsl.() -> Unit = {}
) {
    val builder = CfnApplicationOutputOutputPropertyDsl()
    builder.apply(block)
    return setOutput(builder.build())
}

/**
 * For a SQL-based Kinesis Data Analytics application, describes the reference data source by
 * providing the source information (Amazon S3 bucket name and object key name), the resulting
 * in-application table name that is created, and the necessary schema to map the data elements in
 * the Amazon S3 object to the in-application table.
 */
public inline fun CfnApplicationReferenceDataSource.setReferenceDataSource(
    block: CfnApplicationReferenceDataSourceReferenceDataSourcePropertyDsl.() -> Unit = {}
) {
    val builder = CfnApplicationReferenceDataSourceReferenceDataSourcePropertyDsl()
    builder.apply(block)
    return setReferenceDataSource(builder.build())
}
