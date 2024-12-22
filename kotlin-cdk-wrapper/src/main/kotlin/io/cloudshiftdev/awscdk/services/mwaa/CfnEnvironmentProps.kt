@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mwaa

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnEnvironment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mwaa.*;
 * Object airflowConfigurationOptions;
 * Object tags;
 * CfnEnvironmentProps cfnEnvironmentProps = CfnEnvironmentProps.builder()
 * .name("name")
 * // the properties below are optional
 * .airflowConfigurationOptions(airflowConfigurationOptions)
 * .airflowVersion("airflowVersion")
 * .dagS3Path("dagS3Path")
 * .endpointManagement("endpointManagement")
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
 * .maxWebservers(123)
 * .maxWorkers(123)
 * .minWebservers(123)
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
public interface CfnEnvironmentProps {
  /**
   * A list of key-value pairs containing the Airflow configuration options for your environment.
   *
   * For example, `core.default_timezone: utc` . To learn more, see [Apache Airflow configuration
   * options](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-env-variables.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-airflowconfigurationoptions)
   */
  public fun airflowConfigurationOptions(): Any? = unwrap(this).getAirflowConfigurationOptions()

  /**
   * The version of Apache Airflow to use for the environment.
   *
   * If no value is specified, defaults to the latest version.
   *
   * If you specify a newer version number for an existing environment, the version update requires
   * some service interruption before taking effect.
   *
   * *Allowed Values* : `1.10.12` | `2.0.2` | `2.2.2` | `2.4.3` | `2.5.1` | `2.6.3` | `2.7.2` |
   * `2.8.1` | `2.9.2` (latest)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-airflowversion)
   */
  public fun airflowVersion(): String? = unwrap(this).getAirflowVersion()

  /**
   * The relative path to the DAGs folder on your Amazon S3 bucket.
   *
   * For example, `dags` . To learn more, see [Adding or updating
   * DAGs](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-folder.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-dags3path)
   */
  public fun dagS3Path(): String? = unwrap(this).getDagS3Path()

  /**
   * Defines whether the VPC endpoints configured for the environment are created, and managed, by
   * the customer or by Amazon MWAA.
   *
   * If set to `SERVICE` , Amazon MWAA will create and manage the required VPC endpoints in your
   * VPC. If set to `CUSTOMER` , you must create, and manage, the VPC endpoints in your VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-endpointmanagement)
   */
  public fun endpointManagement(): String? = unwrap(this).getEndpointManagement()

  /**
   * The environment class type.
   *
   * Valid values: `mw1.small` , `mw1.medium` , `mw1.large` . To learn more, see [Amazon MWAA
   * environment class](https://docs.aws.amazon.com/mwaa/latest/userguide/environment-class.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-environmentclass)
   */
  public fun environmentClass(): String? = unwrap(this).getEnvironmentClass()

  /**
   * The Amazon Resource Name (ARN) of the execution role in IAM that allows MWAA to access AWS
   * resources in your environment.
   *
   * For example, `arn:aws:iam::123456789:role/my-execution-role` . To learn more, see [Amazon MWAA
   * Execution role](https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-create-role.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-executionrolearn)
   */
  public fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  /**
   * The AWS Key Management Service (KMS) key to encrypt and decrypt the data in your environment.
   *
   * You can use an AWS KMS key managed by MWAA, or a customer-managed KMS key (advanced).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-kmskey)
   */
  public fun kmsKey(): String? = unwrap(this).getKmsKey()

  /**
   * The Apache Airflow logs being sent to CloudWatch Logs: `DagProcessingLogs` , `SchedulerLogs` ,
   * `TaskLogs` , `WebserverLogs` , `WorkerLogs` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-loggingconfiguration)
   */
  public fun loggingConfiguration(): Any? = unwrap(this).getLoggingConfiguration()

  /**
   * The maximum number of web servers that you want to run in your environment.
   *
   * Amazon MWAA scales the number of Apache Airflow web servers up to the number you specify for
   * `MaxWebservers` when you interact with your Apache Airflow environment using Apache Airflow REST
   * API, or the Apache Airflow CLI. For example, in scenarios where your workload requires network
   * calls to the Apache Airflow REST API with a high transaction-per-second (TPS) rate, Amazon MWAA
   * will increase the number of web servers up to the number set in `MaxWebserers` . As TPS rates
   * decrease Amazon MWAA disposes of the additional web servers, and scales down to the number set in
   * `MinxWebserers` .
   *
   * Valid values: For environments larger than mw1.micro, accepts values from `2` to `5` . Defaults
   * to `2` for all environment sizes except mw1.micro, which defaults to `1` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-maxwebservers)
   */
  public fun maxWebservers(): Number? = unwrap(this).getMaxWebservers()

  /**
   * The maximum number of workers that you want to run in your environment.
   *
   * MWAA scales the number of Apache Airflow workers up to the number you specify in the
   * `MaxWorkers` field. For example, `20` . When there are no more tasks running, and no more in the
   * queue, MWAA disposes of the extra workers leaving the one worker that is included with your
   * environment, or the number you specify in `MinWorkers` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-maxworkers)
   */
  public fun maxWorkers(): Number? = unwrap(this).getMaxWorkers()

  /**
   * The minimum number of web servers that you want to run in your environment.
   *
   * Amazon MWAA scales the number of Apache Airflow web servers up to the number you specify for
   * `MaxWebservers` when you interact with your Apache Airflow environment using Apache Airflow REST
   * API, or the Apache Airflow CLI. As the transaction-per-second rate, and the network load,
   * decrease, Amazon MWAA disposes of the additional web servers, and scales down to the number set in
   * `MinxWebserers` .
   *
   * Valid values: For environments larger than mw1.micro, accepts values from `2` to `5` . Defaults
   * to `2` for all environment sizes except mw1.micro, which defaults to `1` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-minwebservers)
   */
  public fun minWebservers(): Number? = unwrap(this).getMinWebservers()

  /**
   * The minimum number of workers that you want to run in your environment.
   *
   * MWAA scales the number of Apache Airflow workers up to the number you specify in the
   * `MaxWorkers` field. When there are no more tasks running, and no more in the queue, MWAA disposes
   * of the extra workers leaving the worker count you specify in the `MinWorkers` field. For example,
   * `2` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-minworkers)
   */
  public fun minWorkers(): Number? = unwrap(this).getMinWorkers()

  /**
   * The name of your Amazon MWAA environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-name)
   */
  public fun name(): String

  /**
   * The VPC networking components used to secure and enable network traffic between the AWS
   * resources for your environment.
   *
   * To learn more, see [About networking on Amazon
   * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-networkconfiguration)
   */
  public fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

  /**
   * The version of the plugins.zip file on your Amazon S3 bucket. To learn more, see [Installing
   * custom
   * plugins](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import-plugins.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-pluginss3objectversion)
   */
  public fun pluginsS3ObjectVersion(): String? = unwrap(this).getPluginsS3ObjectVersion()

  /**
   * The relative path to the `plugins.zip` file on your Amazon S3 bucket. For example,
   * `plugins.zip` . To learn more, see [Installing custom
   * plugins](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import-plugins.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-pluginss3path)
   */
  public fun pluginsS3Path(): String? = unwrap(this).getPluginsS3Path()

  /**
   * The version of the requirements.txt file on your Amazon S3 bucket. To learn more, see
   * [Installing Python
   * dependencies](https://docs.aws.amazon.com/mwaa/latest/userguide/working-dags-dependencies.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-requirementss3objectversion)
   */
  public fun requirementsS3ObjectVersion(): String? = unwrap(this).getRequirementsS3ObjectVersion()

  /**
   * The relative path to the `requirements.txt` file on your Amazon S3 bucket. For example,
   * `requirements.txt` . To learn more, see [Installing Python
   * dependencies](https://docs.aws.amazon.com/mwaa/latest/userguide/working-dags-dependencies.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-requirementss3path)
   */
  public fun requirementsS3Path(): String? = unwrap(this).getRequirementsS3Path()

  /**
   * The number of schedulers that you want to run in your environment. Valid values:.
   *
   * * *v2* - Accepts between 2 to 5. Defaults to 2.
   * * *v1* - Accepts 1.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-schedulers)
   */
  public fun schedulers(): Number? = unwrap(this).getSchedulers()

  /**
   * The Amazon Resource Name (ARN) of the Amazon S3 bucket where your DAG code and supporting files
   * are stored.
   *
   * For example, `arn:aws:s3:::my-airflow-bucket-unique-name` . To learn more, see [Create an
   * Amazon S3 bucket for Amazon
   * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-s3-bucket.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-sourcebucketarn)
   */
  public fun sourceBucketArn(): String? = unwrap(this).getSourceBucketArn()

  /**
   * The version of the startup shell script in your Amazon S3 bucket.
   *
   * You must specify the [version
   * ID](https://docs.aws.amazon.com/AmazonS3/latest/userguide/versioning-workflows.html) that Amazon
   * S3 assigns to the file every time you update the script.
   *
   * Version IDs are Unicode, UTF-8 encoded, URL-ready, opaque strings that are no more than 1,024
   * bytes long. The following is an example:
   *
   * `3sL4kqtJlcpXroDTDmJ+rmSpXd3dIbrHY+MTRCxf3vjVBH40Nr8X8gdRQBpUMLUo`
   *
   * For more information, see [Using a startup
   * script](https://docs.aws.amazon.com/mwaa/latest/userguide/using-startup-script.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-startupscripts3objectversion)
   */
  public fun startupScriptS3ObjectVersion(): String? =
      unwrap(this).getStartupScriptS3ObjectVersion()

  /**
   * The relative path to the startup shell script in your Amazon S3 bucket. For example,
   * `s3://mwaa-environment/startup.sh` .
   *
   * Amazon MWAA runs the script as your environment starts, and before running the Apache Airflow
   * process. You can use this script to install dependencies, modify Apache Airflow configuration
   * options, and set environment variables. For more information, see [Using a startup
   * script](https://docs.aws.amazon.com/mwaa/latest/userguide/using-startup-script.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-startupscripts3path)
   */
  public fun startupScriptS3Path(): String? = unwrap(this).getStartupScriptS3Path()

  /**
   * The key-value tag pairs associated to your environment. For example, `"Environment": "Staging"`
   * . To learn more, see [Tagging](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
   *
   * If you specify new tags for an existing environment, the update requires service interruption
   * before taking effect.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-tags)
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * The Apache Airflow *Web server* access mode.
   *
   * To learn more, see [Apache Airflow access
   * modes](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-networking.html) . Valid
   * values: `PRIVATE_ONLY` or `PUBLIC_ONLY` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-webserveraccessmode)
   */
  public fun webserverAccessMode(): String? = unwrap(this).getWebserverAccessMode()

  /**
   * The day and time of the week to start weekly maintenance updates of your environment in the
   * following format: `DAY:HH:MM` .
   *
   * For example: `TUE:03:30` . You can specify a start time in 30 minute increments only. Supported
   * input includes the following:
   *
   * * MON|TUE|WED|THU|FRI|SAT|SUN:([01]\d|2[0-3]):(00|30)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-weeklymaintenancewindowstart)
   */
  public fun weeklyMaintenanceWindowStart(): String? =
      unwrap(this).getWeeklyMaintenanceWindowStart()

  /**
   * A builder for [CfnEnvironmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param airflowConfigurationOptions A list of key-value pairs containing the Airflow
     * configuration options for your environment.
     * For example, `core.default_timezone: utc` . To learn more, see [Apache Airflow configuration
     * options](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-env-variables.html) .
     */
    public fun airflowConfigurationOptions(airflowConfigurationOptions: Any)

    /**
     * @param airflowVersion The version of Apache Airflow to use for the environment.
     * If no value is specified, defaults to the latest version.
     *
     * If you specify a newer version number for an existing environment, the version update
     * requires some service interruption before taking effect.
     *
     * *Allowed Values* : `1.10.12` | `2.0.2` | `2.2.2` | `2.4.3` | `2.5.1` | `2.6.3` | `2.7.2` |
     * `2.8.1` | `2.9.2` (latest)
     */
    public fun airflowVersion(airflowVersion: String)

    /**
     * @param dagS3Path The relative path to the DAGs folder on your Amazon S3 bucket.
     * For example, `dags` . To learn more, see [Adding or updating
     * DAGs](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-folder.html) .
     */
    public fun dagS3Path(dagS3Path: String)

    /**
     * @param endpointManagement Defines whether the VPC endpoints configured for the environment
     * are created, and managed, by the customer or by Amazon MWAA.
     * If set to `SERVICE` , Amazon MWAA will create and manage the required VPC endpoints in your
     * VPC. If set to `CUSTOMER` , you must create, and manage, the VPC endpoints in your VPC.
     */
    public fun endpointManagement(endpointManagement: String)

    /**
     * @param environmentClass The environment class type.
     * Valid values: `mw1.small` , `mw1.medium` , `mw1.large` . To learn more, see [Amazon MWAA
     * environment class](https://docs.aws.amazon.com/mwaa/latest/userguide/environment-class.html) .
     */
    public fun environmentClass(environmentClass: String)

    /**
     * @param executionRoleArn The Amazon Resource Name (ARN) of the execution role in IAM that
     * allows MWAA to access AWS resources in your environment.
     * For example, `arn:aws:iam::123456789:role/my-execution-role` . To learn more, see [Amazon
     * MWAA Execution role](https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-create-role.html) .
     */
    public fun executionRoleArn(executionRoleArn: String)

    /**
     * @param kmsKey The AWS Key Management Service (KMS) key to encrypt and decrypt the data in
     * your environment.
     * You can use an AWS KMS key managed by MWAA, or a customer-managed KMS key (advanced).
     */
    public fun kmsKey(kmsKey: String)

    /**
     * @param loggingConfiguration The Apache Airflow logs being sent to CloudWatch Logs:
     * `DagProcessingLogs` , `SchedulerLogs` , `TaskLogs` , `WebserverLogs` , `WorkerLogs` .
     */
    public fun loggingConfiguration(loggingConfiguration: IResolvable)

    /**
     * @param loggingConfiguration The Apache Airflow logs being sent to CloudWatch Logs:
     * `DagProcessingLogs` , `SchedulerLogs` , `TaskLogs` , `WebserverLogs` , `WorkerLogs` .
     */
    public
        fun loggingConfiguration(loggingConfiguration: CfnEnvironment.LoggingConfigurationProperty)

    /**
     * @param loggingConfiguration The Apache Airflow logs being sent to CloudWatch Logs:
     * `DagProcessingLogs` , `SchedulerLogs` , `TaskLogs` , `WebserverLogs` , `WorkerLogs` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("84c4995f1fc8404e9fd03a20a635368e0afe50e6837eecfaa13de0a8657f6013")
    public
        fun loggingConfiguration(loggingConfiguration: CfnEnvironment.LoggingConfigurationProperty.Builder.() -> Unit)

    /**
     * @param maxWebservers The maximum number of web servers that you want to run in your
     * environment.
     * Amazon MWAA scales the number of Apache Airflow web servers up to the number you specify for
     * `MaxWebservers` when you interact with your Apache Airflow environment using Apache Airflow REST
     * API, or the Apache Airflow CLI. For example, in scenarios where your workload requires network
     * calls to the Apache Airflow REST API with a high transaction-per-second (TPS) rate, Amazon MWAA
     * will increase the number of web servers up to the number set in `MaxWebserers` . As TPS rates
     * decrease Amazon MWAA disposes of the additional web servers, and scales down to the number set
     * in `MinxWebserers` .
     *
     * Valid values: For environments larger than mw1.micro, accepts values from `2` to `5` .
     * Defaults to `2` for all environment sizes except mw1.micro, which defaults to `1` .
     */
    public fun maxWebservers(maxWebservers: Number)

    /**
     * @param maxWorkers The maximum number of workers that you want to run in your environment.
     * MWAA scales the number of Apache Airflow workers up to the number you specify in the
     * `MaxWorkers` field. For example, `20` . When there are no more tasks running, and no more in the
     * queue, MWAA disposes of the extra workers leaving the one worker that is included with your
     * environment, or the number you specify in `MinWorkers` .
     */
    public fun maxWorkers(maxWorkers: Number)

    /**
     * @param minWebservers The minimum number of web servers that you want to run in your
     * environment.
     * Amazon MWAA scales the number of Apache Airflow web servers up to the number you specify for
     * `MaxWebservers` when you interact with your Apache Airflow environment using Apache Airflow REST
     * API, or the Apache Airflow CLI. As the transaction-per-second rate, and the network load,
     * decrease, Amazon MWAA disposes of the additional web servers, and scales down to the number set
     * in `MinxWebserers` .
     *
     * Valid values: For environments larger than mw1.micro, accepts values from `2` to `5` .
     * Defaults to `2` for all environment sizes except mw1.micro, which defaults to `1` .
     */
    public fun minWebservers(minWebservers: Number)

    /**
     * @param minWorkers The minimum number of workers that you want to run in your environment.
     * MWAA scales the number of Apache Airflow workers up to the number you specify in the
     * `MaxWorkers` field. When there are no more tasks running, and no more in the queue, MWAA
     * disposes of the extra workers leaving the worker count you specify in the `MinWorkers` field.
     * For example, `2` .
     */
    public fun minWorkers(minWorkers: Number)

    /**
     * @param name The name of your Amazon MWAA environment. 
     */
    public fun name(name: String)

    /**
     * @param networkConfiguration The VPC networking components used to secure and enable network
     * traffic between the AWS resources for your environment.
     * To learn more, see [About networking on Amazon
     * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html) .
     */
    public fun networkConfiguration(networkConfiguration: IResolvable)

    /**
     * @param networkConfiguration The VPC networking components used to secure and enable network
     * traffic between the AWS resources for your environment.
     * To learn more, see [About networking on Amazon
     * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html) .
     */
    public
        fun networkConfiguration(networkConfiguration: CfnEnvironment.NetworkConfigurationProperty)

    /**
     * @param networkConfiguration The VPC networking components used to secure and enable network
     * traffic between the AWS resources for your environment.
     * To learn more, see [About networking on Amazon
     * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f719f4306d8b70cb82d76adfb17cd504ec1924aa10537a03995fe73a23882a0a")
    public
        fun networkConfiguration(networkConfiguration: CfnEnvironment.NetworkConfigurationProperty.Builder.() -> Unit)

    /**
     * @param pluginsS3ObjectVersion The version of the plugins.zip file on your Amazon S3 bucket.
     * To learn more, see [Installing custom
     * plugins](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import-plugins.html)
     * .
     */
    public fun pluginsS3ObjectVersion(pluginsS3ObjectVersion: String)

    /**
     * @param pluginsS3Path The relative path to the `plugins.zip` file on your Amazon S3 bucket.
     * For example, `plugins.zip` . To learn more, see [Installing custom
     * plugins](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import-plugins.html)
     * .
     */
    public fun pluginsS3Path(pluginsS3Path: String)

    /**
     * @param requirementsS3ObjectVersion The version of the requirements.txt file on your Amazon S3
     * bucket. To learn more, see [Installing Python
     * dependencies](https://docs.aws.amazon.com/mwaa/latest/userguide/working-dags-dependencies.html)
     * .
     */
    public fun requirementsS3ObjectVersion(requirementsS3ObjectVersion: String)

    /**
     * @param requirementsS3Path The relative path to the `requirements.txt` file on your Amazon S3
     * bucket. For example, `requirements.txt` . To learn more, see [Installing Python
     * dependencies](https://docs.aws.amazon.com/mwaa/latest/userguide/working-dags-dependencies.html)
     * .
     */
    public fun requirementsS3Path(requirementsS3Path: String)

    /**
     * @param schedulers The number of schedulers that you want to run in your environment. Valid
     * values:.
     * * *v2* - Accepts between 2 to 5. Defaults to 2.
     * * *v1* - Accepts 1.
     */
    public fun schedulers(schedulers: Number)

    /**
     * @param sourceBucketArn The Amazon Resource Name (ARN) of the Amazon S3 bucket where your DAG
     * code and supporting files are stored.
     * For example, `arn:aws:s3:::my-airflow-bucket-unique-name` . To learn more, see [Create an
     * Amazon S3 bucket for Amazon
     * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-s3-bucket.html) .
     */
    public fun sourceBucketArn(sourceBucketArn: String)

    /**
     * @param startupScriptS3ObjectVersion The version of the startup shell script in your Amazon S3
     * bucket.
     * You must specify the [version
     * ID](https://docs.aws.amazon.com/AmazonS3/latest/userguide/versioning-workflows.html) that Amazon
     * S3 assigns to the file every time you update the script.
     *
     * Version IDs are Unicode, UTF-8 encoded, URL-ready, opaque strings that are no more than 1,024
     * bytes long. The following is an example:
     *
     * `3sL4kqtJlcpXroDTDmJ+rmSpXd3dIbrHY+MTRCxf3vjVBH40Nr8X8gdRQBpUMLUo`
     *
     * For more information, see [Using a startup
     * script](https://docs.aws.amazon.com/mwaa/latest/userguide/using-startup-script.html) .
     */
    public fun startupScriptS3ObjectVersion(startupScriptS3ObjectVersion: String)

    /**
     * @param startupScriptS3Path The relative path to the startup shell script in your Amazon S3
     * bucket. For example, `s3://mwaa-environment/startup.sh` .
     * Amazon MWAA runs the script as your environment starts, and before running the Apache Airflow
     * process. You can use this script to install dependencies, modify Apache Airflow configuration
     * options, and set environment variables. For more information, see [Using a startup
     * script](https://docs.aws.amazon.com/mwaa/latest/userguide/using-startup-script.html) .
     */
    public fun startupScriptS3Path(startupScriptS3Path: String)

    /**
     * @param tags The key-value tag pairs associated to your environment. For example,
     * `"Environment": "Staging"` . To learn more, see
     * [Tagging](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     * If you specify new tags for an existing environment, the update requires service interruption
     * before taking effect.
     */
    public fun tags(tags: Any)

    /**
     * @param webserverAccessMode The Apache Airflow *Web server* access mode.
     * To learn more, see [Apache Airflow access
     * modes](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-networking.html) . Valid
     * values: `PRIVATE_ONLY` or `PUBLIC_ONLY` .
     */
    public fun webserverAccessMode(webserverAccessMode: String)

    /**
     * @param weeklyMaintenanceWindowStart The day and time of the week to start weekly maintenance
     * updates of your environment in the following format: `DAY:HH:MM` .
     * For example: `TUE:03:30` . You can specify a start time in 30 minute increments only.
     * Supported input includes the following:
     *
     * * MON|TUE|WED|THU|FRI|SAT|SUN:([01]\d|2[0-3]):(00|30)
     */
    public fun weeklyMaintenanceWindowStart(weeklyMaintenanceWindowStart: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mwaa.CfnEnvironmentProps.Builder =
        software.amazon.awscdk.services.mwaa.CfnEnvironmentProps.builder()

    /**
     * @param airflowConfigurationOptions A list of key-value pairs containing the Airflow
     * configuration options for your environment.
     * For example, `core.default_timezone: utc` . To learn more, see [Apache Airflow configuration
     * options](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-env-variables.html) .
     */
    override fun airflowConfigurationOptions(airflowConfigurationOptions: Any) {
      cdkBuilder.airflowConfigurationOptions(airflowConfigurationOptions)
    }

    /**
     * @param airflowVersion The version of Apache Airflow to use for the environment.
     * If no value is specified, defaults to the latest version.
     *
     * If you specify a newer version number for an existing environment, the version update
     * requires some service interruption before taking effect.
     *
     * *Allowed Values* : `1.10.12` | `2.0.2` | `2.2.2` | `2.4.3` | `2.5.1` | `2.6.3` | `2.7.2` |
     * `2.8.1` | `2.9.2` (latest)
     */
    override fun airflowVersion(airflowVersion: String) {
      cdkBuilder.airflowVersion(airflowVersion)
    }

    /**
     * @param dagS3Path The relative path to the DAGs folder on your Amazon S3 bucket.
     * For example, `dags` . To learn more, see [Adding or updating
     * DAGs](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-folder.html) .
     */
    override fun dagS3Path(dagS3Path: String) {
      cdkBuilder.dagS3Path(dagS3Path)
    }

    /**
     * @param endpointManagement Defines whether the VPC endpoints configured for the environment
     * are created, and managed, by the customer or by Amazon MWAA.
     * If set to `SERVICE` , Amazon MWAA will create and manage the required VPC endpoints in your
     * VPC. If set to `CUSTOMER` , you must create, and manage, the VPC endpoints in your VPC.
     */
    override fun endpointManagement(endpointManagement: String) {
      cdkBuilder.endpointManagement(endpointManagement)
    }

    /**
     * @param environmentClass The environment class type.
     * Valid values: `mw1.small` , `mw1.medium` , `mw1.large` . To learn more, see [Amazon MWAA
     * environment class](https://docs.aws.amazon.com/mwaa/latest/userguide/environment-class.html) .
     */
    override fun environmentClass(environmentClass: String) {
      cdkBuilder.environmentClass(environmentClass)
    }

    /**
     * @param executionRoleArn The Amazon Resource Name (ARN) of the execution role in IAM that
     * allows MWAA to access AWS resources in your environment.
     * For example, `arn:aws:iam::123456789:role/my-execution-role` . To learn more, see [Amazon
     * MWAA Execution role](https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-create-role.html) .
     */
    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /**
     * @param kmsKey The AWS Key Management Service (KMS) key to encrypt and decrypt the data in
     * your environment.
     * You can use an AWS KMS key managed by MWAA, or a customer-managed KMS key (advanced).
     */
    override fun kmsKey(kmsKey: String) {
      cdkBuilder.kmsKey(kmsKey)
    }

    /**
     * @param loggingConfiguration The Apache Airflow logs being sent to CloudWatch Logs:
     * `DagProcessingLogs` , `SchedulerLogs` , `TaskLogs` , `WebserverLogs` , `WorkerLogs` .
     */
    override fun loggingConfiguration(loggingConfiguration: IResolvable) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param loggingConfiguration The Apache Airflow logs being sent to CloudWatch Logs:
     * `DagProcessingLogs` , `SchedulerLogs` , `TaskLogs` , `WebserverLogs` , `WorkerLogs` .
     */
    override
        fun loggingConfiguration(loggingConfiguration: CfnEnvironment.LoggingConfigurationProperty) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(CfnEnvironment.LoggingConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param loggingConfiguration The Apache Airflow logs being sent to CloudWatch Logs:
     * `DagProcessingLogs` , `SchedulerLogs` , `TaskLogs` , `WebserverLogs` , `WorkerLogs` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("84c4995f1fc8404e9fd03a20a635368e0afe50e6837eecfaa13de0a8657f6013")
    override
        fun loggingConfiguration(loggingConfiguration: CfnEnvironment.LoggingConfigurationProperty.Builder.() -> Unit):
        Unit =
        loggingConfiguration(CfnEnvironment.LoggingConfigurationProperty(loggingConfiguration))

    /**
     * @param maxWebservers The maximum number of web servers that you want to run in your
     * environment.
     * Amazon MWAA scales the number of Apache Airflow web servers up to the number you specify for
     * `MaxWebservers` when you interact with your Apache Airflow environment using Apache Airflow REST
     * API, or the Apache Airflow CLI. For example, in scenarios where your workload requires network
     * calls to the Apache Airflow REST API with a high transaction-per-second (TPS) rate, Amazon MWAA
     * will increase the number of web servers up to the number set in `MaxWebserers` . As TPS rates
     * decrease Amazon MWAA disposes of the additional web servers, and scales down to the number set
     * in `MinxWebserers` .
     *
     * Valid values: For environments larger than mw1.micro, accepts values from `2` to `5` .
     * Defaults to `2` for all environment sizes except mw1.micro, which defaults to `1` .
     */
    override fun maxWebservers(maxWebservers: Number) {
      cdkBuilder.maxWebservers(maxWebservers)
    }

    /**
     * @param maxWorkers The maximum number of workers that you want to run in your environment.
     * MWAA scales the number of Apache Airflow workers up to the number you specify in the
     * `MaxWorkers` field. For example, `20` . When there are no more tasks running, and no more in the
     * queue, MWAA disposes of the extra workers leaving the one worker that is included with your
     * environment, or the number you specify in `MinWorkers` .
     */
    override fun maxWorkers(maxWorkers: Number) {
      cdkBuilder.maxWorkers(maxWorkers)
    }

    /**
     * @param minWebservers The minimum number of web servers that you want to run in your
     * environment.
     * Amazon MWAA scales the number of Apache Airflow web servers up to the number you specify for
     * `MaxWebservers` when you interact with your Apache Airflow environment using Apache Airflow REST
     * API, or the Apache Airflow CLI. As the transaction-per-second rate, and the network load,
     * decrease, Amazon MWAA disposes of the additional web servers, and scales down to the number set
     * in `MinxWebserers` .
     *
     * Valid values: For environments larger than mw1.micro, accepts values from `2` to `5` .
     * Defaults to `2` for all environment sizes except mw1.micro, which defaults to `1` .
     */
    override fun minWebservers(minWebservers: Number) {
      cdkBuilder.minWebservers(minWebservers)
    }

    /**
     * @param minWorkers The minimum number of workers that you want to run in your environment.
     * MWAA scales the number of Apache Airflow workers up to the number you specify in the
     * `MaxWorkers` field. When there are no more tasks running, and no more in the queue, MWAA
     * disposes of the extra workers leaving the worker count you specify in the `MinWorkers` field.
     * For example, `2` .
     */
    override fun minWorkers(minWorkers: Number) {
      cdkBuilder.minWorkers(minWorkers)
    }

    /**
     * @param name The name of your Amazon MWAA environment. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param networkConfiguration The VPC networking components used to secure and enable network
     * traffic between the AWS resources for your environment.
     * To learn more, see [About networking on Amazon
     * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html) .
     */
    override fun networkConfiguration(networkConfiguration: IResolvable) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param networkConfiguration The VPC networking components used to secure and enable network
     * traffic between the AWS resources for your environment.
     * To learn more, see [About networking on Amazon
     * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html) .
     */
    override
        fun networkConfiguration(networkConfiguration: CfnEnvironment.NetworkConfigurationProperty) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(CfnEnvironment.NetworkConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param networkConfiguration The VPC networking components used to secure and enable network
     * traffic between the AWS resources for your environment.
     * To learn more, see [About networking on Amazon
     * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f719f4306d8b70cb82d76adfb17cd504ec1924aa10537a03995fe73a23882a0a")
    override
        fun networkConfiguration(networkConfiguration: CfnEnvironment.NetworkConfigurationProperty.Builder.() -> Unit):
        Unit =
        networkConfiguration(CfnEnvironment.NetworkConfigurationProperty(networkConfiguration))

    /**
     * @param pluginsS3ObjectVersion The version of the plugins.zip file on your Amazon S3 bucket.
     * To learn more, see [Installing custom
     * plugins](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import-plugins.html)
     * .
     */
    override fun pluginsS3ObjectVersion(pluginsS3ObjectVersion: String) {
      cdkBuilder.pluginsS3ObjectVersion(pluginsS3ObjectVersion)
    }

    /**
     * @param pluginsS3Path The relative path to the `plugins.zip` file on your Amazon S3 bucket.
     * For example, `plugins.zip` . To learn more, see [Installing custom
     * plugins](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import-plugins.html)
     * .
     */
    override fun pluginsS3Path(pluginsS3Path: String) {
      cdkBuilder.pluginsS3Path(pluginsS3Path)
    }

    /**
     * @param requirementsS3ObjectVersion The version of the requirements.txt file on your Amazon S3
     * bucket. To learn more, see [Installing Python
     * dependencies](https://docs.aws.amazon.com/mwaa/latest/userguide/working-dags-dependencies.html)
     * .
     */
    override fun requirementsS3ObjectVersion(requirementsS3ObjectVersion: String) {
      cdkBuilder.requirementsS3ObjectVersion(requirementsS3ObjectVersion)
    }

    /**
     * @param requirementsS3Path The relative path to the `requirements.txt` file on your Amazon S3
     * bucket. For example, `requirements.txt` . To learn more, see [Installing Python
     * dependencies](https://docs.aws.amazon.com/mwaa/latest/userguide/working-dags-dependencies.html)
     * .
     */
    override fun requirementsS3Path(requirementsS3Path: String) {
      cdkBuilder.requirementsS3Path(requirementsS3Path)
    }

    /**
     * @param schedulers The number of schedulers that you want to run in your environment. Valid
     * values:.
     * * *v2* - Accepts between 2 to 5. Defaults to 2.
     * * *v1* - Accepts 1.
     */
    override fun schedulers(schedulers: Number) {
      cdkBuilder.schedulers(schedulers)
    }

    /**
     * @param sourceBucketArn The Amazon Resource Name (ARN) of the Amazon S3 bucket where your DAG
     * code and supporting files are stored.
     * For example, `arn:aws:s3:::my-airflow-bucket-unique-name` . To learn more, see [Create an
     * Amazon S3 bucket for Amazon
     * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-s3-bucket.html) .
     */
    override fun sourceBucketArn(sourceBucketArn: String) {
      cdkBuilder.sourceBucketArn(sourceBucketArn)
    }

    /**
     * @param startupScriptS3ObjectVersion The version of the startup shell script in your Amazon S3
     * bucket.
     * You must specify the [version
     * ID](https://docs.aws.amazon.com/AmazonS3/latest/userguide/versioning-workflows.html) that Amazon
     * S3 assigns to the file every time you update the script.
     *
     * Version IDs are Unicode, UTF-8 encoded, URL-ready, opaque strings that are no more than 1,024
     * bytes long. The following is an example:
     *
     * `3sL4kqtJlcpXroDTDmJ+rmSpXd3dIbrHY+MTRCxf3vjVBH40Nr8X8gdRQBpUMLUo`
     *
     * For more information, see [Using a startup
     * script](https://docs.aws.amazon.com/mwaa/latest/userguide/using-startup-script.html) .
     */
    override fun startupScriptS3ObjectVersion(startupScriptS3ObjectVersion: String) {
      cdkBuilder.startupScriptS3ObjectVersion(startupScriptS3ObjectVersion)
    }

    /**
     * @param startupScriptS3Path The relative path to the startup shell script in your Amazon S3
     * bucket. For example, `s3://mwaa-environment/startup.sh` .
     * Amazon MWAA runs the script as your environment starts, and before running the Apache Airflow
     * process. You can use this script to install dependencies, modify Apache Airflow configuration
     * options, and set environment variables. For more information, see [Using a startup
     * script](https://docs.aws.amazon.com/mwaa/latest/userguide/using-startup-script.html) .
     */
    override fun startupScriptS3Path(startupScriptS3Path: String) {
      cdkBuilder.startupScriptS3Path(startupScriptS3Path)
    }

    /**
     * @param tags The key-value tag pairs associated to your environment. For example,
     * `"Environment": "Staging"` . To learn more, see
     * [Tagging](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     * If you specify new tags for an existing environment, the update requires service interruption
     * before taking effect.
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param webserverAccessMode The Apache Airflow *Web server* access mode.
     * To learn more, see [Apache Airflow access
     * modes](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-networking.html) . Valid
     * values: `PRIVATE_ONLY` or `PUBLIC_ONLY` .
     */
    override fun webserverAccessMode(webserverAccessMode: String) {
      cdkBuilder.webserverAccessMode(webserverAccessMode)
    }

    /**
     * @param weeklyMaintenanceWindowStart The day and time of the week to start weekly maintenance
     * updates of your environment in the following format: `DAY:HH:MM` .
     * For example: `TUE:03:30` . You can specify a start time in 30 minute increments only.
     * Supported input includes the following:
     *
     * * MON|TUE|WED|THU|FRI|SAT|SUN:([01]\d|2[0-3]):(00|30)
     */
    override fun weeklyMaintenanceWindowStart(weeklyMaintenanceWindowStart: String) {
      cdkBuilder.weeklyMaintenanceWindowStart(weeklyMaintenanceWindowStart)
    }

    public fun build(): software.amazon.awscdk.services.mwaa.CfnEnvironmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.mwaa.CfnEnvironmentProps,
  ) : CdkObject(cdkObject),
      CfnEnvironmentProps {
    /**
     * A list of key-value pairs containing the Airflow configuration options for your environment.
     *
     * For example, `core.default_timezone: utc` . To learn more, see [Apache Airflow configuration
     * options](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-env-variables.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-airflowconfigurationoptions)
     */
    override fun airflowConfigurationOptions(): Any? = unwrap(this).getAirflowConfigurationOptions()

    /**
     * The version of Apache Airflow to use for the environment.
     *
     * If no value is specified, defaults to the latest version.
     *
     * If you specify a newer version number for an existing environment, the version update
     * requires some service interruption before taking effect.
     *
     * *Allowed Values* : `1.10.12` | `2.0.2` | `2.2.2` | `2.4.3` | `2.5.1` | `2.6.3` | `2.7.2` |
     * `2.8.1` | `2.9.2` (latest)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-airflowversion)
     */
    override fun airflowVersion(): String? = unwrap(this).getAirflowVersion()

    /**
     * The relative path to the DAGs folder on your Amazon S3 bucket.
     *
     * For example, `dags` . To learn more, see [Adding or updating
     * DAGs](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-folder.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-dags3path)
     */
    override fun dagS3Path(): String? = unwrap(this).getDagS3Path()

    /**
     * Defines whether the VPC endpoints configured for the environment are created, and managed, by
     * the customer or by Amazon MWAA.
     *
     * If set to `SERVICE` , Amazon MWAA will create and manage the required VPC endpoints in your
     * VPC. If set to `CUSTOMER` , you must create, and manage, the VPC endpoints in your VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-endpointmanagement)
     */
    override fun endpointManagement(): String? = unwrap(this).getEndpointManagement()

    /**
     * The environment class type.
     *
     * Valid values: `mw1.small` , `mw1.medium` , `mw1.large` . To learn more, see [Amazon MWAA
     * environment class](https://docs.aws.amazon.com/mwaa/latest/userguide/environment-class.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-environmentclass)
     */
    override fun environmentClass(): String? = unwrap(this).getEnvironmentClass()

    /**
     * The Amazon Resource Name (ARN) of the execution role in IAM that allows MWAA to access AWS
     * resources in your environment.
     *
     * For example, `arn:aws:iam::123456789:role/my-execution-role` . To learn more, see [Amazon
     * MWAA Execution role](https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-create-role.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-executionrolearn)
     */
    override fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

    /**
     * The AWS Key Management Service (KMS) key to encrypt and decrypt the data in your environment.
     *
     * You can use an AWS KMS key managed by MWAA, or a customer-managed KMS key (advanced).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-kmskey)
     */
    override fun kmsKey(): String? = unwrap(this).getKmsKey()

    /**
     * The Apache Airflow logs being sent to CloudWatch Logs: `DagProcessingLogs` , `SchedulerLogs`
     * , `TaskLogs` , `WebserverLogs` , `WorkerLogs` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-loggingconfiguration)
     */
    override fun loggingConfiguration(): Any? = unwrap(this).getLoggingConfiguration()

    /**
     * The maximum number of web servers that you want to run in your environment.
     *
     * Amazon MWAA scales the number of Apache Airflow web servers up to the number you specify for
     * `MaxWebservers` when you interact with your Apache Airflow environment using Apache Airflow REST
     * API, or the Apache Airflow CLI. For example, in scenarios where your workload requires network
     * calls to the Apache Airflow REST API with a high transaction-per-second (TPS) rate, Amazon MWAA
     * will increase the number of web servers up to the number set in `MaxWebserers` . As TPS rates
     * decrease Amazon MWAA disposes of the additional web servers, and scales down to the number set
     * in `MinxWebserers` .
     *
     * Valid values: For environments larger than mw1.micro, accepts values from `2` to `5` .
     * Defaults to `2` for all environment sizes except mw1.micro, which defaults to `1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-maxwebservers)
     */
    override fun maxWebservers(): Number? = unwrap(this).getMaxWebservers()

    /**
     * The maximum number of workers that you want to run in your environment.
     *
     * MWAA scales the number of Apache Airflow workers up to the number you specify in the
     * `MaxWorkers` field. For example, `20` . When there are no more tasks running, and no more in the
     * queue, MWAA disposes of the extra workers leaving the one worker that is included with your
     * environment, or the number you specify in `MinWorkers` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-maxworkers)
     */
    override fun maxWorkers(): Number? = unwrap(this).getMaxWorkers()

    /**
     * The minimum number of web servers that you want to run in your environment.
     *
     * Amazon MWAA scales the number of Apache Airflow web servers up to the number you specify for
     * `MaxWebservers` when you interact with your Apache Airflow environment using Apache Airflow REST
     * API, or the Apache Airflow CLI. As the transaction-per-second rate, and the network load,
     * decrease, Amazon MWAA disposes of the additional web servers, and scales down to the number set
     * in `MinxWebserers` .
     *
     * Valid values: For environments larger than mw1.micro, accepts values from `2` to `5` .
     * Defaults to `2` for all environment sizes except mw1.micro, which defaults to `1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-minwebservers)
     */
    override fun minWebservers(): Number? = unwrap(this).getMinWebservers()

    /**
     * The minimum number of workers that you want to run in your environment.
     *
     * MWAA scales the number of Apache Airflow workers up to the number you specify in the
     * `MaxWorkers` field. When there are no more tasks running, and no more in the queue, MWAA
     * disposes of the extra workers leaving the worker count you specify in the `MinWorkers` field.
     * For example, `2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-minworkers)
     */
    override fun minWorkers(): Number? = unwrap(this).getMinWorkers()

    /**
     * The name of your Amazon MWAA environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The VPC networking components used to secure and enable network traffic between the AWS
     * resources for your environment.
     *
     * To learn more, see [About networking on Amazon
     * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-networkconfiguration)
     */
    override fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

    /**
     * The version of the plugins.zip file on your Amazon S3 bucket. To learn more, see [Installing
     * custom
     * plugins](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import-plugins.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-pluginss3objectversion)
     */
    override fun pluginsS3ObjectVersion(): String? = unwrap(this).getPluginsS3ObjectVersion()

    /**
     * The relative path to the `plugins.zip` file on your Amazon S3 bucket. For example,
     * `plugins.zip` . To learn more, see [Installing custom
     * plugins](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import-plugins.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-pluginss3path)
     */
    override fun pluginsS3Path(): String? = unwrap(this).getPluginsS3Path()

    /**
     * The version of the requirements.txt file on your Amazon S3 bucket. To learn more, see
     * [Installing Python
     * dependencies](https://docs.aws.amazon.com/mwaa/latest/userguide/working-dags-dependencies.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-requirementss3objectversion)
     */
    override fun requirementsS3ObjectVersion(): String? =
        unwrap(this).getRequirementsS3ObjectVersion()

    /**
     * The relative path to the `requirements.txt` file on your Amazon S3 bucket. For example,
     * `requirements.txt` . To learn more, see [Installing Python
     * dependencies](https://docs.aws.amazon.com/mwaa/latest/userguide/working-dags-dependencies.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-requirementss3path)
     */
    override fun requirementsS3Path(): String? = unwrap(this).getRequirementsS3Path()

    /**
     * The number of schedulers that you want to run in your environment. Valid values:.
     *
     * * *v2* - Accepts between 2 to 5. Defaults to 2.
     * * *v1* - Accepts 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-schedulers)
     */
    override fun schedulers(): Number? = unwrap(this).getSchedulers()

    /**
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket where your DAG code and supporting
     * files are stored.
     *
     * For example, `arn:aws:s3:::my-airflow-bucket-unique-name` . To learn more, see [Create an
     * Amazon S3 bucket for Amazon
     * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-s3-bucket.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-sourcebucketarn)
     */
    override fun sourceBucketArn(): String? = unwrap(this).getSourceBucketArn()

    /**
     * The version of the startup shell script in your Amazon S3 bucket.
     *
     * You must specify the [version
     * ID](https://docs.aws.amazon.com/AmazonS3/latest/userguide/versioning-workflows.html) that Amazon
     * S3 assigns to the file every time you update the script.
     *
     * Version IDs are Unicode, UTF-8 encoded, URL-ready, opaque strings that are no more than 1,024
     * bytes long. The following is an example:
     *
     * `3sL4kqtJlcpXroDTDmJ+rmSpXd3dIbrHY+MTRCxf3vjVBH40Nr8X8gdRQBpUMLUo`
     *
     * For more information, see [Using a startup
     * script](https://docs.aws.amazon.com/mwaa/latest/userguide/using-startup-script.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-startupscripts3objectversion)
     */
    override fun startupScriptS3ObjectVersion(): String? =
        unwrap(this).getStartupScriptS3ObjectVersion()

    /**
     * The relative path to the startup shell script in your Amazon S3 bucket. For example,
     * `s3://mwaa-environment/startup.sh` .
     *
     * Amazon MWAA runs the script as your environment starts, and before running the Apache Airflow
     * process. You can use this script to install dependencies, modify Apache Airflow configuration
     * options, and set environment variables. For more information, see [Using a startup
     * script](https://docs.aws.amazon.com/mwaa/latest/userguide/using-startup-script.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-startupscripts3path)
     */
    override fun startupScriptS3Path(): String? = unwrap(this).getStartupScriptS3Path()

    /**
     * The key-value tag pairs associated to your environment. For example, `"Environment":
     * "Staging"` . To learn more, see
     * [Tagging](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     *
     * If you specify new tags for an existing environment, the update requires service interruption
     * before taking effect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-tags)
     */
    override fun tags(): Any? = unwrap(this).getTags()

    /**
     * The Apache Airflow *Web server* access mode.
     *
     * To learn more, see [Apache Airflow access
     * modes](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-networking.html) . Valid
     * values: `PRIVATE_ONLY` or `PUBLIC_ONLY` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-webserveraccessmode)
     */
    override fun webserverAccessMode(): String? = unwrap(this).getWebserverAccessMode()

    /**
     * The day and time of the week to start weekly maintenance updates of your environment in the
     * following format: `DAY:HH:MM` .
     *
     * For example: `TUE:03:30` . You can specify a start time in 30 minute increments only.
     * Supported input includes the following:
     *
     * * MON|TUE|WED|THU|FRI|SAT|SUN:([01]\d|2[0-3]):(00|30)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-weeklymaintenancewindowstart)
     */
    override fun weeklyMaintenanceWindowStart(): String? =
        unwrap(this).getWeeklyMaintenanceWindowStart()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEnvironmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mwaa.CfnEnvironmentProps):
        CfnEnvironmentProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEnvironmentProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentProps):
        software.amazon.awscdk.services.mwaa.CfnEnvironmentProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.mwaa.CfnEnvironmentProps
  }
}
