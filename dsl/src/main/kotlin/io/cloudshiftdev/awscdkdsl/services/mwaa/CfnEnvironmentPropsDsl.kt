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

package io.cloudshiftdev.awscdkdsl.services.mwaa

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mwaa.CfnEnvironment
import software.amazon.awscdk.services.mwaa.CfnEnvironmentProps

/**
 * Properties for defining a `CfnEnvironment`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mwaa.*;
 * Object airflowConfigurationOptions;
 * Object tags;
 * CfnEnvironmentProps cfnEnvironmentProps = CfnEnvironmentProps.builder()
 * .name("name")
 * // the properties below are optional
 * .airflowConfigurationOptions(airflowConfigurationOptions)
 * .airflowVersion("airflowVersion")
 * .dagS3Path("dagS3Path")
 * .environmentClass("environmentClass")
 * .executionRoleArn("executionRoleArn")
 * .kmsKey("kmsKey")
 * .loggingConfiguration(LoggingConfigurationProperty.builder()
 * .dagProcessingLogs(ModuleLoggingConfigurationProperty.builder()
 * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
 * .enabled(false)
 * .logLevel("logLevel")
 * .build())
 * .schedulerLogs(ModuleLoggingConfigurationProperty.builder()
 * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
 * .enabled(false)
 * .logLevel("logLevel")
 * .build())
 * .taskLogs(ModuleLoggingConfigurationProperty.builder()
 * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
 * .enabled(false)
 * .logLevel("logLevel")
 * .build())
 * .webserverLogs(ModuleLoggingConfigurationProperty.builder()
 * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
 * .enabled(false)
 * .logLevel("logLevel")
 * .build())
 * .workerLogs(ModuleLoggingConfigurationProperty.builder()
 * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
 * .enabled(false)
 * .logLevel("logLevel")
 * .build())
 * .build())
 * .maxWorkers(123)
 * .minWorkers(123)
 * .networkConfiguration(NetworkConfigurationProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build())
 * .pluginsS3ObjectVersion("pluginsS3ObjectVersion")
 * .pluginsS3Path("pluginsS3Path")
 * .requirementsS3ObjectVersion("requirementsS3ObjectVersion")
 * .requirementsS3Path("requirementsS3Path")
 * .schedulers(123)
 * .sourceBucketArn("sourceBucketArn")
 * .startupScriptS3ObjectVersion("startupScriptS3ObjectVersion")
 * .startupScriptS3Path("startupScriptS3Path")
 * .tags(tags)
 * .webserverAccessMode("webserverAccessMode")
 * .weeklyMaintenanceWindowStart("weeklyMaintenanceWindowStart")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html)
 */
@CdkDslMarker
public class CfnEnvironmentPropsDsl {
    private val cdkBuilder: CfnEnvironmentProps.Builder = CfnEnvironmentProps.builder()

    /**
     * @param airflowConfigurationOptions A list of key-value pairs containing the Airflow
     *   configuration options for your environment. For example, `core.default_timezone: utc` . To
     *   learn more, see
     *   [Apache Airflow configuration options](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-env-variables.html)
     *   .
     */
    public fun airflowConfigurationOptions(
        airflowConfigurationOptions: MapBuilder.() -> Unit = {}
    ) {
        val builder = MapBuilder()
        builder.apply(airflowConfigurationOptions)
        cdkBuilder.airflowConfigurationOptions(builder.map)
    }

    /**
     * @param airflowConfigurationOptions A list of key-value pairs containing the Airflow
     *   configuration options for your environment. For example, `core.default_timezone: utc` . To
     *   learn more, see
     *   [Apache Airflow configuration options](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-env-variables.html)
     *   .
     */
    public fun airflowConfigurationOptions(airflowConfigurationOptions: Any) {
        cdkBuilder.airflowConfigurationOptions(airflowConfigurationOptions)
    }

    /**
     * @param airflowVersion The version of Apache Airflow to use for the environment. If no value
     *   is specified, defaults to the latest version.
     *
     * If you specify a newer version number for an existing environment, the version update
     * requires some service interruption before taking effect.
     *
     * *Allowed Values* : `2.0.2` | `1.10.12` | `2.2.2` | `2.4.3` | `2.5.1` | `2.6.3` (latest)
     */
    public fun airflowVersion(airflowVersion: String) {
        cdkBuilder.airflowVersion(airflowVersion)
    }

    /**
     * @param dagS3Path The relative path to the DAGs folder on your Amazon S3 bucket. For example,
     *   `dags` . To learn more, see
     *   [Adding or updating DAGs](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-folder.html)
     *   .
     */
    public fun dagS3Path(dagS3Path: String) {
        cdkBuilder.dagS3Path(dagS3Path)
    }

    /**
     * @param environmentClass The environment class type. Valid values: `mw1.small` , `mw1.medium`
     *   , `mw1.large` . To learn more, see
     *   [Amazon MWAA environment class](https://docs.aws.amazon.com/mwaa/latest/userguide/environment-class.html)
     *   .
     */
    public fun environmentClass(environmentClass: String) {
        cdkBuilder.environmentClass(environmentClass)
    }

    /**
     * @param executionRoleArn The Amazon Resource Name (ARN) of the execution role in IAM that
     *   allows MWAA to access AWS resources in your environment. For example,
     *   `arn:aws:iam::123456789:role/my-execution-role` . To learn more, see
     *   [Amazon MWAA Execution role](https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-create-role.html)
     *   .
     */
    public fun executionRoleArn(executionRoleArn: String) {
        cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /**
     * @param kmsKey The AWS Key Management Service (KMS) key to encrypt and decrypt the data in
     *   your environment. You can use an AWS KMS key managed by MWAA, or a customer-managed KMS key
     *   (advanced).
     */
    public fun kmsKey(kmsKey: String) {
        cdkBuilder.kmsKey(kmsKey)
    }

    /**
     * @param loggingConfiguration The Apache Airflow logs being sent to CloudWatch Logs:
     *   `DagProcessingLogs` , `SchedulerLogs` , `TaskLogs` , `WebserverLogs` , `WorkerLogs` .
     */
    public fun loggingConfiguration(loggingConfiguration: IResolvable) {
        cdkBuilder.loggingConfiguration(loggingConfiguration)
    }

    /**
     * @param loggingConfiguration The Apache Airflow logs being sent to CloudWatch Logs:
     *   `DagProcessingLogs` , `SchedulerLogs` , `TaskLogs` , `WebserverLogs` , `WorkerLogs` .
     */
    public fun loggingConfiguration(
        loggingConfiguration: CfnEnvironment.LoggingConfigurationProperty
    ) {
        cdkBuilder.loggingConfiguration(loggingConfiguration)
    }

    /**
     * @param maxWorkers The maximum number of workers that you want to run in your environment.
     *   MWAA scales the number of Apache Airflow workers up to the number you specify in the
     *   `MaxWorkers` field. For example, `20` . When there are no more tasks running, and no more
     *   in the queue, MWAA disposes of the extra workers leaving the one worker that is included
     *   with your environment, or the number you specify in `MinWorkers` .
     */
    public fun maxWorkers(maxWorkers: Number) {
        cdkBuilder.maxWorkers(maxWorkers)
    }

    /**
     * @param minWorkers The minimum number of workers that you want to run in your environment.
     *   MWAA scales the number of Apache Airflow workers up to the number you specify in the
     *   `MaxWorkers` field. When there are no more tasks running, and no more in the queue, MWAA
     *   disposes of the extra workers leaving the worker count you specify in the `MinWorkers`
     *   field. For example, `2` .
     */
    public fun minWorkers(minWorkers: Number) {
        cdkBuilder.minWorkers(minWorkers)
    }

    /** @param name The name of your Amazon MWAA environment. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param networkConfiguration The VPC networking components used to secure and enable network
     *   traffic between the AWS resources for your environment. To learn more, see
     *   [About networking on Amazon MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html)
     *   .
     */
    public fun networkConfiguration(networkConfiguration: IResolvable) {
        cdkBuilder.networkConfiguration(networkConfiguration)
    }

    /**
     * @param networkConfiguration The VPC networking components used to secure and enable network
     *   traffic between the AWS resources for your environment. To learn more, see
     *   [About networking on Amazon MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html)
     *   .
     */
    public fun networkConfiguration(
        networkConfiguration: CfnEnvironment.NetworkConfigurationProperty
    ) {
        cdkBuilder.networkConfiguration(networkConfiguration)
    }

    /**
     * @param pluginsS3ObjectVersion The version of the plugins.zip file on your Amazon S3 bucket.
     *   To learn more, see
     *   [Installing custom plugins](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import-plugins.html)
     *   .
     */
    public fun pluginsS3ObjectVersion(pluginsS3ObjectVersion: String) {
        cdkBuilder.pluginsS3ObjectVersion(pluginsS3ObjectVersion)
    }

    /**
     * @param pluginsS3Path The relative path to the `plugins.zip` file on your Amazon S3 bucket.
     *   For example, `plugins.zip` . To learn more, see
     *   [Installing custom plugins](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import-plugins.html)
     *   .
     */
    public fun pluginsS3Path(pluginsS3Path: String) {
        cdkBuilder.pluginsS3Path(pluginsS3Path)
    }

    /**
     * @param requirementsS3ObjectVersion The version of the requirements.txt file on your Amazon S3
     *   bucket. To learn more, see
     *   [Installing Python dependencies](https://docs.aws.amazon.com/mwaa/latest/userguide/working-dags-dependencies.html)
     *   .
     */
    public fun requirementsS3ObjectVersion(requirementsS3ObjectVersion: String) {
        cdkBuilder.requirementsS3ObjectVersion(requirementsS3ObjectVersion)
    }

    /**
     * @param requirementsS3Path The relative path to the `requirements.txt` file on your Amazon S3
     *   bucket. For example, `requirements.txt` . To learn more, see
     *   [Installing Python dependencies](https://docs.aws.amazon.com/mwaa/latest/userguide/working-dags-dependencies.html)
     *   .
     */
    public fun requirementsS3Path(requirementsS3Path: String) {
        cdkBuilder.requirementsS3Path(requirementsS3Path)
    }

    /**
     * @param schedulers The number of schedulers that you want to run in your environment. Valid
     *   values:.
     * * *v2* - Accepts between 2 to 5. Defaults to 2.
     * * *v1* - Accepts 1.
     */
    public fun schedulers(schedulers: Number) {
        cdkBuilder.schedulers(schedulers)
    }

    /**
     * @param sourceBucketArn The Amazon Resource Name (ARN) of the Amazon S3 bucket where your DAG
     *   code and supporting files are stored. For example,
     *   `arn:aws:s3:::my-airflow-bucket-unique-name` . To learn more, see
     *   [Create an Amazon S3 bucket for Amazon MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-s3-bucket.html)
     *   .
     */
    public fun sourceBucketArn(sourceBucketArn: String) {
        cdkBuilder.sourceBucketArn(sourceBucketArn)
    }

    /**
     * @param startupScriptS3ObjectVersion The version of the startup shell script in your Amazon S3
     *   bucket. You must specify the
     *   [version ID](https://docs.aws.amazon.com/AmazonS3/latest/userguide/versioning-workflows.html)
     *   that Amazon S3 assigns to the file every time you update the script.
     *
     * Version IDs are Unicode, UTF-8 encoded, URL-ready, opaque strings that are no more than 1,024
     * bytes long. The following is an example:
     *
     * `3sL4kqtJlcpXroDTDmJ+rmSpXd3dIbrHY+MTRCxf3vjVBH40Nr8X8gdRQBpUMLUo`
     *
     * For more information, see
     * [Using a startup script](https://docs.aws.amazon.com/mwaa/latest/userguide/using-startup-script.html)
     * .
     */
    public fun startupScriptS3ObjectVersion(startupScriptS3ObjectVersion: String) {
        cdkBuilder.startupScriptS3ObjectVersion(startupScriptS3ObjectVersion)
    }

    /**
     * @param startupScriptS3Path The relative path to the startup shell script in your Amazon S3
     *   bucket. For example, `s3://mwaa-environment/startup.sh` . Amazon MWAA runs the script as
     *   your environment starts, and before running the Apache Airflow process. You can use this
     *   script to install dependencies, modify Apache Airflow configuration options, and set
     *   environment variables. For more information, see
     *   [Using a startup script](https://docs.aws.amazon.com/mwaa/latest/userguide/using-startup-script.html)
     *   .
     */
    public fun startupScriptS3Path(startupScriptS3Path: String) {
        cdkBuilder.startupScriptS3Path(startupScriptS3Path)
    }

    /**
     * @param tags The key-value tag pairs associated to your environment. For example,
     *   `"Environment": "Staging"` . To learn more, see
     *   [Tagging](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) . If you specify
     *   new tags for an existing environment, the update requires service interruption before
     *   taking effect.
     */
    public fun tags(tags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tags)
        cdkBuilder.tags(builder.map)
    }

    /**
     * @param tags The key-value tag pairs associated to your environment. For example,
     *   `"Environment": "Staging"` . To learn more, see
     *   [Tagging](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) . If you specify
     *   new tags for an existing environment, the update requires service interruption before
     *   taking effect.
     */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    /**
     * @param webserverAccessMode The Apache Airflow *Web server* access mode. To learn more, see
     *   [Apache Airflow access modes](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-networking.html)
     *   . Valid values: `PRIVATE_ONLY` or `PUBLIC_ONLY` .
     */
    public fun webserverAccessMode(webserverAccessMode: String) {
        cdkBuilder.webserverAccessMode(webserverAccessMode)
    }

    /**
     * @param weeklyMaintenanceWindowStart The day and time of the week to start weekly maintenance
     *   updates of your environment in the following format: `DAY:HH:MM` . For example: `TUE:03:30`
     *   . You can specify a start time in 30 minute increments only. Supported input includes the
     *   following:
     * * MON|TUE|WED|THU|FRI|SAT|SUN:([01]\d|2[0-3]):(00|30)
     */
    public fun weeklyMaintenanceWindowStart(weeklyMaintenanceWindowStart: String) {
        cdkBuilder.weeklyMaintenanceWindowStart(weeklyMaintenanceWindowStart)
    }

    public fun build(): CfnEnvironmentProps = cdkBuilder.build()
}
