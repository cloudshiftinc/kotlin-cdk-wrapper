@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mwaa

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::MWAA::Environment` resource creates an Amazon Managed Workflows for Apache Airflow
 * (MWAA) environment.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mwaa.*;
 * Object airflowConfigurationOptions;
 * Object tags;
 * CfnEnvironment cfnEnvironment = CfnEnvironment.Builder.create(this, "MyCfnEnvironment")
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
public open class CfnEnvironment internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.mwaa.CfnEnvironment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * A list of key-value pairs containing the Airflow configuration options for your environment.
   */
  public open fun airflowConfigurationOptions(): Any? =
      unwrap(this).getAirflowConfigurationOptions()

  /**
   * A list of key-value pairs containing the Airflow configuration options for your environment.
   */
  public open fun airflowConfigurationOptions(`value`: Any) {
    unwrap(this).setAirflowConfigurationOptions(`value`)
  }

  /**
   * The version of Apache Airflow to use for the environment.
   */
  public open fun airflowVersion(): String? = unwrap(this).getAirflowVersion()

  /**
   * The version of Apache Airflow to use for the environment.
   */
  public open fun airflowVersion(`value`: String) {
    unwrap(this).setAirflowVersion(`value`)
  }

  /**
   * The ARN for the Amazon MWAA environment.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The queue ARN for the environment's [Celery
   * Executor](https://docs.aws.amazon.com/https://airflow.apache.org/docs/apache-airflow/stable/core-concepts/executor/celery.html)
   * . Amazon MWAA uses a Celery Executor to distribute tasks across multiple workers. When you create
   * an environment in a shared VPC, you must provide access to the Celery Executor queue from your
   * VPC.
   */
  public open fun attrCeleryExecutorQueue(): String = unwrap(this).getAttrCeleryExecutorQueue()

  /**
   * The VPC endpoint for the environment's Amazon RDS database.
   */
  public open fun attrDatabaseVpcEndpointService(): String =
      unwrap(this).getAttrDatabaseVpcEndpointService()

  /**
   * The ARN for the CloudWatch Logs group where the Apache Airflow DAG processing logs are
   * published.
   */
  public open fun attrLoggingConfigurationDagProcessingLogsCloudWatchLogGroupArn(): String =
      unwrap(this).getAttrLoggingConfigurationDagProcessingLogsCloudWatchLogGroupArn()

  /**
   * The ARN for the CloudWatch Logs group where the Apache Airflow Scheduler logs are published.
   */
  public open fun attrLoggingConfigurationSchedulerLogsCloudWatchLogGroupArn(): String =
      unwrap(this).getAttrLoggingConfigurationSchedulerLogsCloudWatchLogGroupArn()

  /**
   * The ARN for the CloudWatch Logs group where the Apache Airflow task logs are published.
   */
  public open fun attrLoggingConfigurationTaskLogsCloudWatchLogGroupArn(): String =
      unwrap(this).getAttrLoggingConfigurationTaskLogsCloudWatchLogGroupArn()

  /**
   * The ARN for the CloudWatch Logs group where the Apache Airflow Web server logs are published.
   */
  public open fun attrLoggingConfigurationWebserverLogsCloudWatchLogGroupArn(): String =
      unwrap(this).getAttrLoggingConfigurationWebserverLogsCloudWatchLogGroupArn()

  /**
   * The ARN for the CloudWatch Logs group where the Apache Airflow Worker logs are published.
   */
  public open fun attrLoggingConfigurationWorkerLogsCloudWatchLogGroupArn(): String =
      unwrap(this).getAttrLoggingConfigurationWorkerLogsCloudWatchLogGroupArn()

  /**
   * The URL of your Apache Airflow UI.
   */
  public open fun attrWebserverUrl(): String = unwrap(this).getAttrWebserverUrl()

  /**
   * The VPC endpoint for the environment's web server.
   */
  public open fun attrWebserverVpcEndpointService(): String =
      unwrap(this).getAttrWebserverVpcEndpointService()

  /**
   * The relative path to the DAGs folder on your Amazon S3 bucket.
   */
  public open fun dagS3Path(): String? = unwrap(this).getDagS3Path()

  /**
   * The relative path to the DAGs folder on your Amazon S3 bucket.
   */
  public open fun dagS3Path(`value`: String) {
    unwrap(this).setDagS3Path(`value`)
  }

  /**
   * Defines whether the VPC endpoints configured for the environment are created, and managed, by
   * the customer or by Amazon MWAA.
   */
  public open fun endpointManagement(): String? = unwrap(this).getEndpointManagement()

  /**
   * Defines whether the VPC endpoints configured for the environment are created, and managed, by
   * the customer or by Amazon MWAA.
   */
  public open fun endpointManagement(`value`: String) {
    unwrap(this).setEndpointManagement(`value`)
  }

  /**
   * The environment class type.
   */
  public open fun environmentClass(): String? = unwrap(this).getEnvironmentClass()

  /**
   * The environment class type.
   */
  public open fun environmentClass(`value`: String) {
    unwrap(this).setEnvironmentClass(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the execution role in IAM that allows MWAA to access AWS
   * resources in your environment.
   */
  public open fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the execution role in IAM that allows MWAA to access AWS
   * resources in your environment.
   */
  public open fun executionRoleArn(`value`: String) {
    unwrap(this).setExecutionRoleArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The AWS Key Management Service (KMS) key to encrypt and decrypt the data in your environment.
   */
  public open fun kmsKey(): String? = unwrap(this).getKmsKey()

  /**
   * The AWS Key Management Service (KMS) key to encrypt and decrypt the data in your environment.
   */
  public open fun kmsKey(`value`: String) {
    unwrap(this).setKmsKey(`value`)
  }

  /**
   * The Apache Airflow logs being sent to CloudWatch Logs: `DagProcessingLogs` , `SchedulerLogs` ,
   * `TaskLogs` , `WebserverLogs` , `WorkerLogs` .
   */
  public open fun loggingConfiguration(): Any? = unwrap(this).getLoggingConfiguration()

  /**
   * The Apache Airflow logs being sent to CloudWatch Logs: `DagProcessingLogs` , `SchedulerLogs` ,
   * `TaskLogs` , `WebserverLogs` , `WorkerLogs` .
   */
  public open fun loggingConfiguration(`value`: IResolvable) {
    unwrap(this).setLoggingConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Apache Airflow logs being sent to CloudWatch Logs: `DagProcessingLogs` , `SchedulerLogs` ,
   * `TaskLogs` , `WebserverLogs` , `WorkerLogs` .
   */
  public open fun loggingConfiguration(`value`: LoggingConfigurationProperty) {
    unwrap(this).setLoggingConfiguration(`value`.let(LoggingConfigurationProperty::unwrap))
  }

  /**
   * The Apache Airflow logs being sent to CloudWatch Logs: `DagProcessingLogs` , `SchedulerLogs` ,
   * `TaskLogs` , `WebserverLogs` , `WorkerLogs` .
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c53ce76ce84dacbfe710798e97d1fe79d10a52578c0f857ee12682c21f3c7ba5")
  public open fun loggingConfiguration(`value`: LoggingConfigurationProperty.Builder.() -> Unit):
      Unit = loggingConfiguration(LoggingConfigurationProperty(`value`))

  /**
   * The maximum number of workers that you want to run in your environment.
   */
  public open fun maxWorkers(): Number? = unwrap(this).getMaxWorkers()

  /**
   * The maximum number of workers that you want to run in your environment.
   */
  public open fun maxWorkers(`value`: Number) {
    unwrap(this).setMaxWorkers(`value`)
  }

  /**
   * The minimum number of workers that you want to run in your environment.
   */
  public open fun minWorkers(): Number? = unwrap(this).getMinWorkers()

  /**
   * The minimum number of workers that you want to run in your environment.
   */
  public open fun minWorkers(`value`: Number) {
    unwrap(this).setMinWorkers(`value`)
  }

  /**
   * The name of your Amazon MWAA environment.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of your Amazon MWAA environment.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The VPC networking components used to secure and enable network traffic between the AWS
   * resources for your environment.
   */
  public open fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

  /**
   * The VPC networking components used to secure and enable network traffic between the AWS
   * resources for your environment.
   */
  public open fun networkConfiguration(`value`: IResolvable) {
    unwrap(this).setNetworkConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The VPC networking components used to secure and enable network traffic between the AWS
   * resources for your environment.
   */
  public open fun networkConfiguration(`value`: NetworkConfigurationProperty) {
    unwrap(this).setNetworkConfiguration(`value`.let(NetworkConfigurationProperty::unwrap))
  }

  /**
   * The VPC networking components used to secure and enable network traffic between the AWS
   * resources for your environment.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b3ae14ceb6a878b3b97ddef8f2ad4276af50090f453873897804dd5990ccc17c")
  public open fun networkConfiguration(`value`: NetworkConfigurationProperty.Builder.() -> Unit):
      Unit = networkConfiguration(NetworkConfigurationProperty(`value`))

  /**
   * The version of the plugins.zip file on your Amazon S3 bucket. To learn more, see [Installing
   * custom
   * plugins](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import-plugins.html) .
   */
  public open fun pluginsS3ObjectVersion(): String? = unwrap(this).getPluginsS3ObjectVersion()

  /**
   * The version of the plugins.zip file on your Amazon S3 bucket. To learn more, see [Installing
   * custom
   * plugins](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import-plugins.html) .
   */
  public open fun pluginsS3ObjectVersion(`value`: String) {
    unwrap(this).setPluginsS3ObjectVersion(`value`)
  }

  /**
   * The relative path to the `plugins.zip` file on your Amazon S3 bucket. For example,
   * `plugins.zip` . To learn more, see [Installing custom
   * plugins](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import-plugins.html) .
   */
  public open fun pluginsS3Path(): String? = unwrap(this).getPluginsS3Path()

  /**
   * The relative path to the `plugins.zip` file on your Amazon S3 bucket. For example,
   * `plugins.zip` . To learn more, see [Installing custom
   * plugins](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import-plugins.html) .
   */
  public open fun pluginsS3Path(`value`: String) {
    unwrap(this).setPluginsS3Path(`value`)
  }

  /**
   * The version of the requirements.txt file on your Amazon S3 bucket. To learn more, see
   * [Installing Python
   * dependencies](https://docs.aws.amazon.com/mwaa/latest/userguide/working-dags-dependencies.html) .
   */
  public open fun requirementsS3ObjectVersion(): String? =
      unwrap(this).getRequirementsS3ObjectVersion()

  /**
   * The version of the requirements.txt file on your Amazon S3 bucket. To learn more, see
   * [Installing Python
   * dependencies](https://docs.aws.amazon.com/mwaa/latest/userguide/working-dags-dependencies.html) .
   */
  public open fun requirementsS3ObjectVersion(`value`: String) {
    unwrap(this).setRequirementsS3ObjectVersion(`value`)
  }

  /**
   * The relative path to the `requirements.txt` file on your Amazon S3 bucket. For example,
   * `requirements.txt` . To learn more, see [Installing Python
   * dependencies](https://docs.aws.amazon.com/mwaa/latest/userguide/working-dags-dependencies.html) .
   */
  public open fun requirementsS3Path(): String? = unwrap(this).getRequirementsS3Path()

  /**
   * The relative path to the `requirements.txt` file on your Amazon S3 bucket. For example,
   * `requirements.txt` . To learn more, see [Installing Python
   * dependencies](https://docs.aws.amazon.com/mwaa/latest/userguide/working-dags-dependencies.html) .
   */
  public open fun requirementsS3Path(`value`: String) {
    unwrap(this).setRequirementsS3Path(`value`)
  }

  /**
   * The number of schedulers that you want to run in your environment.
   *
   * Valid values:.
   */
  public open fun schedulers(): Number? = unwrap(this).getSchedulers()

  /**
   * The number of schedulers that you want to run in your environment.
   *
   * Valid values:.
   */
  public open fun schedulers(`value`: Number) {
    unwrap(this).setSchedulers(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the Amazon S3 bucket where your DAG code and supporting files
   * are stored.
   */
  public open fun sourceBucketArn(): String? = unwrap(this).getSourceBucketArn()

  /**
   * The Amazon Resource Name (ARN) of the Amazon S3 bucket where your DAG code and supporting files
   * are stored.
   */
  public open fun sourceBucketArn(`value`: String) {
    unwrap(this).setSourceBucketArn(`value`)
  }

  /**
   * The version of the startup shell script in your Amazon S3 bucket.
   */
  public open fun startupScriptS3ObjectVersion(): String? =
      unwrap(this).getStartupScriptS3ObjectVersion()

  /**
   * The version of the startup shell script in your Amazon S3 bucket.
   */
  public open fun startupScriptS3ObjectVersion(`value`: String) {
    unwrap(this).setStartupScriptS3ObjectVersion(`value`)
  }

  /**
   * The relative path to the startup shell script in your Amazon S3 bucket.
   *
   * For example, `s3://mwaa-environment/startup.sh` .
   */
  public open fun startupScriptS3Path(): String? = unwrap(this).getStartupScriptS3Path()

  /**
   * The relative path to the startup shell script in your Amazon S3 bucket.
   *
   * For example, `s3://mwaa-environment/startup.sh` .
   */
  public open fun startupScriptS3Path(`value`: String) {
    unwrap(this).setStartupScriptS3Path(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The key-value tag pairs associated to your environment.
   *
   * For example, `"Environment": "Staging"` . To learn more, see
   * [Tagging](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
   */
  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  /**
   * The key-value tag pairs associated to your environment.
   *
   * For example, `"Environment": "Staging"` . To learn more, see
   * [Tagging](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
   */
  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * The Apache Airflow *Web server* access mode.
   */
  public open fun webserverAccessMode(): String? = unwrap(this).getWebserverAccessMode()

  /**
   * The Apache Airflow *Web server* access mode.
   */
  public open fun webserverAccessMode(`value`: String) {
    unwrap(this).setWebserverAccessMode(`value`)
  }

  /**
   * The day and time of the week to start weekly maintenance updates of your environment in the
   * following format: `DAY:HH:MM` .
   */
  public open fun weeklyMaintenanceWindowStart(): String? =
      unwrap(this).getWeeklyMaintenanceWindowStart()

  /**
   * The day and time of the week to start weekly maintenance updates of your environment in the
   * following format: `DAY:HH:MM` .
   */
  public open fun weeklyMaintenanceWindowStart(`value`: String) {
    unwrap(this).setWeeklyMaintenanceWindowStart(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.mwaa.CfnEnvironment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of key-value pairs containing the Airflow configuration options for your environment.
     *
     * For example, `core.default_timezone: utc` . To learn more, see [Apache Airflow configuration
     * options](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-env-variables.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-airflowconfigurationoptions)
     * @param airflowConfigurationOptions A list of key-value pairs containing the Airflow
     * configuration options for your environment. 
     */
    public fun airflowConfigurationOptions(airflowConfigurationOptions: Any)

    /**
     * The version of Apache Airflow to use for the environment.
     *
     * If no value is specified, defaults to the latest version.
     *
     * If you specify a newer version number for an existing environment, the version update
     * requires some service interruption before taking effect.
     *
     * *Allowed Values* : `1.10.12` | `2.0.2` | `2.2.2` | `2.4.3` | `2.5.1` | `2.6.3` | `2.7.2`
     * (latest)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-airflowversion)
     * @param airflowVersion The version of Apache Airflow to use for the environment. 
     */
    public fun airflowVersion(airflowVersion: String)

    /**
     * The relative path to the DAGs folder on your Amazon S3 bucket.
     *
     * For example, `dags` . To learn more, see [Adding or updating
     * DAGs](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-folder.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-dags3path)
     * @param dagS3Path The relative path to the DAGs folder on your Amazon S3 bucket. 
     */
    public fun dagS3Path(dagS3Path: String)

    /**
     * Defines whether the VPC endpoints configured for the environment are created, and managed, by
     * the customer or by Amazon MWAA.
     *
     * If set to `SERVICE` , Amazon MWAA will create and manage the required VPC endpoints in your
     * VPC. If set to `CUSTOMER` , you must create, and manage, the VPC endpoints in your VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-endpointmanagement)
     * @param endpointManagement Defines whether the VPC endpoints configured for the environment
     * are created, and managed, by the customer or by Amazon MWAA. 
     */
    public fun endpointManagement(endpointManagement: String)

    /**
     * The environment class type.
     *
     * Valid values: `mw1.small` , `mw1.medium` , `mw1.large` . To learn more, see [Amazon MWAA
     * environment class](https://docs.aws.amazon.com/mwaa/latest/userguide/environment-class.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-environmentclass)
     * @param environmentClass The environment class type. 
     */
    public fun environmentClass(environmentClass: String)

    /**
     * The Amazon Resource Name (ARN) of the execution role in IAM that allows MWAA to access AWS
     * resources in your environment.
     *
     * For example, `arn:aws:iam::123456789:role/my-execution-role` . To learn more, see [Amazon
     * MWAA Execution role](https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-create-role.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-executionrolearn)
     * @param executionRoleArn The Amazon Resource Name (ARN) of the execution role in IAM that
     * allows MWAA to access AWS resources in your environment. 
     */
    public fun executionRoleArn(executionRoleArn: String)

    /**
     * The AWS Key Management Service (KMS) key to encrypt and decrypt the data in your environment.
     *
     * You can use an AWS KMS key managed by MWAA, or a customer-managed KMS key (advanced).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-kmskey)
     * @param kmsKey The AWS Key Management Service (KMS) key to encrypt and decrypt the data in
     * your environment. 
     */
    public fun kmsKey(kmsKey: String)

    /**
     * The Apache Airflow logs being sent to CloudWatch Logs: `DagProcessingLogs` , `SchedulerLogs`
     * , `TaskLogs` , `WebserverLogs` , `WorkerLogs` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-loggingconfiguration)
     * @param loggingConfiguration The Apache Airflow logs being sent to CloudWatch Logs:
     * `DagProcessingLogs` , `SchedulerLogs` , `TaskLogs` , `WebserverLogs` , `WorkerLogs` . 
     */
    public fun loggingConfiguration(loggingConfiguration: IResolvable)

    /**
     * The Apache Airflow logs being sent to CloudWatch Logs: `DagProcessingLogs` , `SchedulerLogs`
     * , `TaskLogs` , `WebserverLogs` , `WorkerLogs` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-loggingconfiguration)
     * @param loggingConfiguration The Apache Airflow logs being sent to CloudWatch Logs:
     * `DagProcessingLogs` , `SchedulerLogs` , `TaskLogs` , `WebserverLogs` , `WorkerLogs` . 
     */
    public fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty)

    /**
     * The Apache Airflow logs being sent to CloudWatch Logs: `DagProcessingLogs` , `SchedulerLogs`
     * , `TaskLogs` , `WebserverLogs` , `WorkerLogs` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-loggingconfiguration)
     * @param loggingConfiguration The Apache Airflow logs being sent to CloudWatch Logs:
     * `DagProcessingLogs` , `SchedulerLogs` , `TaskLogs` , `WebserverLogs` , `WorkerLogs` . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99a7a60d5549be3670ca52741505fe0a1ca11f802c63b27b9c2738515d4155df")
    public
        fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty.Builder.() -> Unit)

    /**
     * The maximum number of workers that you want to run in your environment.
     *
     * MWAA scales the number of Apache Airflow workers up to the number you specify in the
     * `MaxWorkers` field. For example, `20` . When there are no more tasks running, and no more in the
     * queue, MWAA disposes of the extra workers leaving the one worker that is included with your
     * environment, or the number you specify in `MinWorkers` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-maxworkers)
     * @param maxWorkers The maximum number of workers that you want to run in your environment. 
     */
    public fun maxWorkers(maxWorkers: Number)

    /**
     * The minimum number of workers that you want to run in your environment.
     *
     * MWAA scales the number of Apache Airflow workers up to the number you specify in the
     * `MaxWorkers` field. When there are no more tasks running, and no more in the queue, MWAA
     * disposes of the extra workers leaving the worker count you specify in the `MinWorkers` field.
     * For example, `2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-minworkers)
     * @param minWorkers The minimum number of workers that you want to run in your environment. 
     */
    public fun minWorkers(minWorkers: Number)

    /**
     * The name of your Amazon MWAA environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-name)
     * @param name The name of your Amazon MWAA environment. 
     */
    public fun name(name: String)

    /**
     * The VPC networking components used to secure and enable network traffic between the AWS
     * resources for your environment.
     *
     * To learn more, see [About networking on Amazon
     * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-networkconfiguration)
     * @param networkConfiguration The VPC networking components used to secure and enable network
     * traffic between the AWS resources for your environment. 
     */
    public fun networkConfiguration(networkConfiguration: IResolvable)

    /**
     * The VPC networking components used to secure and enable network traffic between the AWS
     * resources for your environment.
     *
     * To learn more, see [About networking on Amazon
     * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-networkconfiguration)
     * @param networkConfiguration The VPC networking components used to secure and enable network
     * traffic between the AWS resources for your environment. 
     */
    public fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty)

    /**
     * The VPC networking components used to secure and enable network traffic between the AWS
     * resources for your environment.
     *
     * To learn more, see [About networking on Amazon
     * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-networkconfiguration)
     * @param networkConfiguration The VPC networking components used to secure and enable network
     * traffic between the AWS resources for your environment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea4dc89fc98a15a9806bff385274d0b15b175cd8a5bbf0fe46cadc5429b92588")
    public
        fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit)

    /**
     * The version of the plugins.zip file on your Amazon S3 bucket. To learn more, see [Installing
     * custom
     * plugins](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import-plugins.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-pluginss3objectversion)
     * @param pluginsS3ObjectVersion The version of the plugins.zip file on your Amazon S3 bucket.
     * To learn more, see [Installing custom
     * plugins](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import-plugins.html)
     * . 
     */
    public fun pluginsS3ObjectVersion(pluginsS3ObjectVersion: String)

    /**
     * The relative path to the `plugins.zip` file on your Amazon S3 bucket. For example,
     * `plugins.zip` . To learn more, see [Installing custom
     * plugins](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import-plugins.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-pluginss3path)
     * @param pluginsS3Path The relative path to the `plugins.zip` file on your Amazon S3 bucket.
     * For example, `plugins.zip` . To learn more, see [Installing custom
     * plugins](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import-plugins.html)
     * . 
     */
    public fun pluginsS3Path(pluginsS3Path: String)

    /**
     * The version of the requirements.txt file on your Amazon S3 bucket. To learn more, see
     * [Installing Python
     * dependencies](https://docs.aws.amazon.com/mwaa/latest/userguide/working-dags-dependencies.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-requirementss3objectversion)
     * @param requirementsS3ObjectVersion The version of the requirements.txt file on your Amazon S3
     * bucket. To learn more, see [Installing Python
     * dependencies](https://docs.aws.amazon.com/mwaa/latest/userguide/working-dags-dependencies.html)
     * . 
     */
    public fun requirementsS3ObjectVersion(requirementsS3ObjectVersion: String)

    /**
     * The relative path to the `requirements.txt` file on your Amazon S3 bucket. For example,
     * `requirements.txt` . To learn more, see [Installing Python
     * dependencies](https://docs.aws.amazon.com/mwaa/latest/userguide/working-dags-dependencies.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-requirementss3path)
     * @param requirementsS3Path The relative path to the `requirements.txt` file on your Amazon S3
     * bucket. For example, `requirements.txt` . To learn more, see [Installing Python
     * dependencies](https://docs.aws.amazon.com/mwaa/latest/userguide/working-dags-dependencies.html)
     * . 
     */
    public fun requirementsS3Path(requirementsS3Path: String)

    /**
     * The number of schedulers that you want to run in your environment. Valid values:.
     *
     * * *v2* - Accepts between 2 to 5. Defaults to 2.
     * * *v1* - Accepts 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-schedulers)
     * @param schedulers The number of schedulers that you want to run in your environment. Valid
     * values:. 
     */
    public fun schedulers(schedulers: Number)

    /**
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket where your DAG code and supporting
     * files are stored.
     *
     * For example, `arn:aws:s3:::my-airflow-bucket-unique-name` . To learn more, see [Create an
     * Amazon S3 bucket for Amazon
     * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-s3-bucket.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-sourcebucketarn)
     * @param sourceBucketArn The Amazon Resource Name (ARN) of the Amazon S3 bucket where your DAG
     * code and supporting files are stored. 
     */
    public fun sourceBucketArn(sourceBucketArn: String)

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
     * @param startupScriptS3ObjectVersion The version of the startup shell script in your Amazon S3
     * bucket. 
     */
    public fun startupScriptS3ObjectVersion(startupScriptS3ObjectVersion: String)

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
     * @param startupScriptS3Path The relative path to the startup shell script in your Amazon S3
     * bucket. For example, `s3://mwaa-environment/startup.sh` . 
     */
    public fun startupScriptS3Path(startupScriptS3Path: String)

    /**
     * The key-value tag pairs associated to your environment. For example, `"Environment":
     * "Staging"` . To learn more, see
     * [Tagging](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     *
     * If you specify new tags for an existing environment, the update requires service interruption
     * before taking effect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-tags)
     * @param tags The key-value tag pairs associated to your environment. For example,
     * `"Environment": "Staging"` . To learn more, see
     * [Tagging](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) . 
     */
    public fun tags(tags: Any)

    /**
     * The Apache Airflow *Web server* access mode.
     *
     * To learn more, see [Apache Airflow access
     * modes](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-networking.html) . Valid
     * values: `PRIVATE_ONLY` or `PUBLIC_ONLY` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-webserveraccessmode)
     * @param webserverAccessMode The Apache Airflow *Web server* access mode. 
     */
    public fun webserverAccessMode(webserverAccessMode: String)

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
     * @param weeklyMaintenanceWindowStart The day and time of the week to start weekly maintenance
     * updates of your environment in the following format: `DAY:HH:MM` . 
     */
    public fun weeklyMaintenanceWindowStart(weeklyMaintenanceWindowStart: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mwaa.CfnEnvironment.Builder =
        software.amazon.awscdk.services.mwaa.CfnEnvironment.Builder.create(scope, id)

    /**
     * A list of key-value pairs containing the Airflow configuration options for your environment.
     *
     * For example, `core.default_timezone: utc` . To learn more, see [Apache Airflow configuration
     * options](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-env-variables.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-airflowconfigurationoptions)
     * @param airflowConfigurationOptions A list of key-value pairs containing the Airflow
     * configuration options for your environment. 
     */
    override fun airflowConfigurationOptions(airflowConfigurationOptions: Any) {
      cdkBuilder.airflowConfigurationOptions(airflowConfigurationOptions)
    }

    /**
     * The version of Apache Airflow to use for the environment.
     *
     * If no value is specified, defaults to the latest version.
     *
     * If you specify a newer version number for an existing environment, the version update
     * requires some service interruption before taking effect.
     *
     * *Allowed Values* : `1.10.12` | `2.0.2` | `2.2.2` | `2.4.3` | `2.5.1` | `2.6.3` | `2.7.2`
     * (latest)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-airflowversion)
     * @param airflowVersion The version of Apache Airflow to use for the environment. 
     */
    override fun airflowVersion(airflowVersion: String) {
      cdkBuilder.airflowVersion(airflowVersion)
    }

    /**
     * The relative path to the DAGs folder on your Amazon S3 bucket.
     *
     * For example, `dags` . To learn more, see [Adding or updating
     * DAGs](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-folder.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-dags3path)
     * @param dagS3Path The relative path to the DAGs folder on your Amazon S3 bucket. 
     */
    override fun dagS3Path(dagS3Path: String) {
      cdkBuilder.dagS3Path(dagS3Path)
    }

    /**
     * Defines whether the VPC endpoints configured for the environment are created, and managed, by
     * the customer or by Amazon MWAA.
     *
     * If set to `SERVICE` , Amazon MWAA will create and manage the required VPC endpoints in your
     * VPC. If set to `CUSTOMER` , you must create, and manage, the VPC endpoints in your VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-endpointmanagement)
     * @param endpointManagement Defines whether the VPC endpoints configured for the environment
     * are created, and managed, by the customer or by Amazon MWAA. 
     */
    override fun endpointManagement(endpointManagement: String) {
      cdkBuilder.endpointManagement(endpointManagement)
    }

    /**
     * The environment class type.
     *
     * Valid values: `mw1.small` , `mw1.medium` , `mw1.large` . To learn more, see [Amazon MWAA
     * environment class](https://docs.aws.amazon.com/mwaa/latest/userguide/environment-class.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-environmentclass)
     * @param environmentClass The environment class type. 
     */
    override fun environmentClass(environmentClass: String) {
      cdkBuilder.environmentClass(environmentClass)
    }

    /**
     * The Amazon Resource Name (ARN) of the execution role in IAM that allows MWAA to access AWS
     * resources in your environment.
     *
     * For example, `arn:aws:iam::123456789:role/my-execution-role` . To learn more, see [Amazon
     * MWAA Execution role](https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-create-role.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-executionrolearn)
     * @param executionRoleArn The Amazon Resource Name (ARN) of the execution role in IAM that
     * allows MWAA to access AWS resources in your environment. 
     */
    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /**
     * The AWS Key Management Service (KMS) key to encrypt and decrypt the data in your environment.
     *
     * You can use an AWS KMS key managed by MWAA, or a customer-managed KMS key (advanced).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-kmskey)
     * @param kmsKey The AWS Key Management Service (KMS) key to encrypt and decrypt the data in
     * your environment. 
     */
    override fun kmsKey(kmsKey: String) {
      cdkBuilder.kmsKey(kmsKey)
    }

    /**
     * The Apache Airflow logs being sent to CloudWatch Logs: `DagProcessingLogs` , `SchedulerLogs`
     * , `TaskLogs` , `WebserverLogs` , `WorkerLogs` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-loggingconfiguration)
     * @param loggingConfiguration The Apache Airflow logs being sent to CloudWatch Logs:
     * `DagProcessingLogs` , `SchedulerLogs` , `TaskLogs` , `WebserverLogs` , `WorkerLogs` . 
     */
    override fun loggingConfiguration(loggingConfiguration: IResolvable) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The Apache Airflow logs being sent to CloudWatch Logs: `DagProcessingLogs` , `SchedulerLogs`
     * , `TaskLogs` , `WebserverLogs` , `WorkerLogs` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-loggingconfiguration)
     * @param loggingConfiguration The Apache Airflow logs being sent to CloudWatch Logs:
     * `DagProcessingLogs` , `SchedulerLogs` , `TaskLogs` , `WebserverLogs` , `WorkerLogs` . 
     */
    override fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(LoggingConfigurationProperty::unwrap))
    }

    /**
     * The Apache Airflow logs being sent to CloudWatch Logs: `DagProcessingLogs` , `SchedulerLogs`
     * , `TaskLogs` , `WebserverLogs` , `WorkerLogs` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-loggingconfiguration)
     * @param loggingConfiguration The Apache Airflow logs being sent to CloudWatch Logs:
     * `DagProcessingLogs` , `SchedulerLogs` , `TaskLogs` , `WebserverLogs` , `WorkerLogs` . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99a7a60d5549be3670ca52741505fe0a1ca11f802c63b27b9c2738515d4155df")
    override
        fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty.Builder.() -> Unit):
        Unit = loggingConfiguration(LoggingConfigurationProperty(loggingConfiguration))

    /**
     * The maximum number of workers that you want to run in your environment.
     *
     * MWAA scales the number of Apache Airflow workers up to the number you specify in the
     * `MaxWorkers` field. For example, `20` . When there are no more tasks running, and no more in the
     * queue, MWAA disposes of the extra workers leaving the one worker that is included with your
     * environment, or the number you specify in `MinWorkers` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-maxworkers)
     * @param maxWorkers The maximum number of workers that you want to run in your environment. 
     */
    override fun maxWorkers(maxWorkers: Number) {
      cdkBuilder.maxWorkers(maxWorkers)
    }

    /**
     * The minimum number of workers that you want to run in your environment.
     *
     * MWAA scales the number of Apache Airflow workers up to the number you specify in the
     * `MaxWorkers` field. When there are no more tasks running, and no more in the queue, MWAA
     * disposes of the extra workers leaving the worker count you specify in the `MinWorkers` field.
     * For example, `2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-minworkers)
     * @param minWorkers The minimum number of workers that you want to run in your environment. 
     */
    override fun minWorkers(minWorkers: Number) {
      cdkBuilder.minWorkers(minWorkers)
    }

    /**
     * The name of your Amazon MWAA environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-name)
     * @param name The name of your Amazon MWAA environment. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The VPC networking components used to secure and enable network traffic between the AWS
     * resources for your environment.
     *
     * To learn more, see [About networking on Amazon
     * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-networkconfiguration)
     * @param networkConfiguration The VPC networking components used to secure and enable network
     * traffic between the AWS resources for your environment. 
     */
    override fun networkConfiguration(networkConfiguration: IResolvable) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The VPC networking components used to secure and enable network traffic between the AWS
     * resources for your environment.
     *
     * To learn more, see [About networking on Amazon
     * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-networkconfiguration)
     * @param networkConfiguration The VPC networking components used to secure and enable network
     * traffic between the AWS resources for your environment. 
     */
    override fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(NetworkConfigurationProperty::unwrap))
    }

    /**
     * The VPC networking components used to secure and enable network traffic between the AWS
     * resources for your environment.
     *
     * To learn more, see [About networking on Amazon
     * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-networkconfiguration)
     * @param networkConfiguration The VPC networking components used to secure and enable network
     * traffic between the AWS resources for your environment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea4dc89fc98a15a9806bff385274d0b15b175cd8a5bbf0fe46cadc5429b92588")
    override
        fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit):
        Unit = networkConfiguration(NetworkConfigurationProperty(networkConfiguration))

    /**
     * The version of the plugins.zip file on your Amazon S3 bucket. To learn more, see [Installing
     * custom
     * plugins](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import-plugins.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-pluginss3objectversion)
     * @param pluginsS3ObjectVersion The version of the plugins.zip file on your Amazon S3 bucket.
     * To learn more, see [Installing custom
     * plugins](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import-plugins.html)
     * . 
     */
    override fun pluginsS3ObjectVersion(pluginsS3ObjectVersion: String) {
      cdkBuilder.pluginsS3ObjectVersion(pluginsS3ObjectVersion)
    }

    /**
     * The relative path to the `plugins.zip` file on your Amazon S3 bucket. For example,
     * `plugins.zip` . To learn more, see [Installing custom
     * plugins](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import-plugins.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-pluginss3path)
     * @param pluginsS3Path The relative path to the `plugins.zip` file on your Amazon S3 bucket.
     * For example, `plugins.zip` . To learn more, see [Installing custom
     * plugins](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import-plugins.html)
     * . 
     */
    override fun pluginsS3Path(pluginsS3Path: String) {
      cdkBuilder.pluginsS3Path(pluginsS3Path)
    }

    /**
     * The version of the requirements.txt file on your Amazon S3 bucket. To learn more, see
     * [Installing Python
     * dependencies](https://docs.aws.amazon.com/mwaa/latest/userguide/working-dags-dependencies.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-requirementss3objectversion)
     * @param requirementsS3ObjectVersion The version of the requirements.txt file on your Amazon S3
     * bucket. To learn more, see [Installing Python
     * dependencies](https://docs.aws.amazon.com/mwaa/latest/userguide/working-dags-dependencies.html)
     * . 
     */
    override fun requirementsS3ObjectVersion(requirementsS3ObjectVersion: String) {
      cdkBuilder.requirementsS3ObjectVersion(requirementsS3ObjectVersion)
    }

    /**
     * The relative path to the `requirements.txt` file on your Amazon S3 bucket. For example,
     * `requirements.txt` . To learn more, see [Installing Python
     * dependencies](https://docs.aws.amazon.com/mwaa/latest/userguide/working-dags-dependencies.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-requirementss3path)
     * @param requirementsS3Path The relative path to the `requirements.txt` file on your Amazon S3
     * bucket. For example, `requirements.txt` . To learn more, see [Installing Python
     * dependencies](https://docs.aws.amazon.com/mwaa/latest/userguide/working-dags-dependencies.html)
     * . 
     */
    override fun requirementsS3Path(requirementsS3Path: String) {
      cdkBuilder.requirementsS3Path(requirementsS3Path)
    }

    /**
     * The number of schedulers that you want to run in your environment. Valid values:.
     *
     * * *v2* - Accepts between 2 to 5. Defaults to 2.
     * * *v1* - Accepts 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-schedulers)
     * @param schedulers The number of schedulers that you want to run in your environment. Valid
     * values:. 
     */
    override fun schedulers(schedulers: Number) {
      cdkBuilder.schedulers(schedulers)
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket where your DAG code and supporting
     * files are stored.
     *
     * For example, `arn:aws:s3:::my-airflow-bucket-unique-name` . To learn more, see [Create an
     * Amazon S3 bucket for Amazon
     * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-s3-bucket.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-sourcebucketarn)
     * @param sourceBucketArn The Amazon Resource Name (ARN) of the Amazon S3 bucket where your DAG
     * code and supporting files are stored. 
     */
    override fun sourceBucketArn(sourceBucketArn: String) {
      cdkBuilder.sourceBucketArn(sourceBucketArn)
    }

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
     * @param startupScriptS3ObjectVersion The version of the startup shell script in your Amazon S3
     * bucket. 
     */
    override fun startupScriptS3ObjectVersion(startupScriptS3ObjectVersion: String) {
      cdkBuilder.startupScriptS3ObjectVersion(startupScriptS3ObjectVersion)
    }

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
     * @param startupScriptS3Path The relative path to the startup shell script in your Amazon S3
     * bucket. For example, `s3://mwaa-environment/startup.sh` . 
     */
    override fun startupScriptS3Path(startupScriptS3Path: String) {
      cdkBuilder.startupScriptS3Path(startupScriptS3Path)
    }

    /**
     * The key-value tag pairs associated to your environment. For example, `"Environment":
     * "Staging"` . To learn more, see
     * [Tagging](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     *
     * If you specify new tags for an existing environment, the update requires service interruption
     * before taking effect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-tags)
     * @param tags The key-value tag pairs associated to your environment. For example,
     * `"Environment": "Staging"` . To learn more, see
     * [Tagging](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) . 
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    /**
     * The Apache Airflow *Web server* access mode.
     *
     * To learn more, see [Apache Airflow access
     * modes](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-networking.html) . Valid
     * values: `PRIVATE_ONLY` or `PUBLIC_ONLY` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#cfn-mwaa-environment-webserveraccessmode)
     * @param webserverAccessMode The Apache Airflow *Web server* access mode. 
     */
    override fun webserverAccessMode(webserverAccessMode: String) {
      cdkBuilder.webserverAccessMode(webserverAccessMode)
    }

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
     * @param weeklyMaintenanceWindowStart The day and time of the week to start weekly maintenance
     * updates of your environment in the following format: `DAY:HH:MM` . 
     */
    override fun weeklyMaintenanceWindowStart(weeklyMaintenanceWindowStart: String) {
      cdkBuilder.weeklyMaintenanceWindowStart(weeklyMaintenanceWindowStart)
    }

    public fun build(): software.amazon.awscdk.services.mwaa.CfnEnvironment = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mwaa.CfnEnvironment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEnvironment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEnvironment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mwaa.CfnEnvironment):
        CfnEnvironment = CfnEnvironment(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironment):
        software.amazon.awscdk.services.mwaa.CfnEnvironment = wrapped.cdkObject
  }

  /**
   * The type of Apache Airflow logs to send to CloudWatch Logs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mwaa.*;
   * LoggingConfigurationProperty loggingConfigurationProperty =
   * LoggingConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mwaa-environment-loggingconfiguration.html)
   */
  public interface LoggingConfigurationProperty {
    /**
     * Defines the processing logs sent to CloudWatch Logs and the logging level to send.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mwaa-environment-loggingconfiguration.html#cfn-mwaa-environment-loggingconfiguration-dagprocessinglogs)
     */
    public fun dagProcessingLogs(): Any? = unwrap(this).getDagProcessingLogs()

    /**
     * Defines the scheduler logs sent to CloudWatch Logs and the logging level to send.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mwaa-environment-loggingconfiguration.html#cfn-mwaa-environment-loggingconfiguration-schedulerlogs)
     */
    public fun schedulerLogs(): Any? = unwrap(this).getSchedulerLogs()

    /**
     * Defines the task logs sent to CloudWatch Logs and the logging level to send.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mwaa-environment-loggingconfiguration.html#cfn-mwaa-environment-loggingconfiguration-tasklogs)
     */
    public fun taskLogs(): Any? = unwrap(this).getTaskLogs()

    /**
     * Defines the web server logs sent to CloudWatch Logs and the logging level to send.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mwaa-environment-loggingconfiguration.html#cfn-mwaa-environment-loggingconfiguration-webserverlogs)
     */
    public fun webserverLogs(): Any? = unwrap(this).getWebserverLogs()

    /**
     * Defines the worker logs sent to CloudWatch Logs and the logging level to send.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mwaa-environment-loggingconfiguration.html#cfn-mwaa-environment-loggingconfiguration-workerlogs)
     */
    public fun workerLogs(): Any? = unwrap(this).getWorkerLogs()

    /**
     * A builder for [LoggingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dagProcessingLogs Defines the processing logs sent to CloudWatch Logs and the
       * logging level to send.
       */
      public fun dagProcessingLogs(dagProcessingLogs: IResolvable)

      /**
       * @param dagProcessingLogs Defines the processing logs sent to CloudWatch Logs and the
       * logging level to send.
       */
      public fun dagProcessingLogs(dagProcessingLogs: ModuleLoggingConfigurationProperty)

      /**
       * @param dagProcessingLogs Defines the processing logs sent to CloudWatch Logs and the
       * logging level to send.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1330f7c2b8e957ece7d3f6d63b8e92b8bd0cb2f4e727176b706cd8a77c679735")
      public
          fun dagProcessingLogs(dagProcessingLogs: ModuleLoggingConfigurationProperty.Builder.() -> Unit)

      /**
       * @param schedulerLogs Defines the scheduler logs sent to CloudWatch Logs and the logging
       * level to send.
       */
      public fun schedulerLogs(schedulerLogs: IResolvable)

      /**
       * @param schedulerLogs Defines the scheduler logs sent to CloudWatch Logs and the logging
       * level to send.
       */
      public fun schedulerLogs(schedulerLogs: ModuleLoggingConfigurationProperty)

      /**
       * @param schedulerLogs Defines the scheduler logs sent to CloudWatch Logs and the logging
       * level to send.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("73e3e873b4c948aba5941ca638f6ee43fe683de1dfd86839ffdbcd9dc98fe3f6")
      public fun schedulerLogs(schedulerLogs: ModuleLoggingConfigurationProperty.Builder.() -> Unit)

      /**
       * @param taskLogs Defines the task logs sent to CloudWatch Logs and the logging level to
       * send.
       */
      public fun taskLogs(taskLogs: IResolvable)

      /**
       * @param taskLogs Defines the task logs sent to CloudWatch Logs and the logging level to
       * send.
       */
      public fun taskLogs(taskLogs: ModuleLoggingConfigurationProperty)

      /**
       * @param taskLogs Defines the task logs sent to CloudWatch Logs and the logging level to
       * send.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a283a4f04f2890bdc485fdb461988647ae261ca78d3d9463cd916a5f9d3da19")
      public fun taskLogs(taskLogs: ModuleLoggingConfigurationProperty.Builder.() -> Unit)

      /**
       * @param webserverLogs Defines the web server logs sent to CloudWatch Logs and the logging
       * level to send.
       */
      public fun webserverLogs(webserverLogs: IResolvable)

      /**
       * @param webserverLogs Defines the web server logs sent to CloudWatch Logs and the logging
       * level to send.
       */
      public fun webserverLogs(webserverLogs: ModuleLoggingConfigurationProperty)

      /**
       * @param webserverLogs Defines the web server logs sent to CloudWatch Logs and the logging
       * level to send.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3042a5be32bb2f4a801c944e3ddc5345a36678e5820c0655a3e5bbf5df7f8a71")
      public fun webserverLogs(webserverLogs: ModuleLoggingConfigurationProperty.Builder.() -> Unit)

      /**
       * @param workerLogs Defines the worker logs sent to CloudWatch Logs and the logging level to
       * send.
       */
      public fun workerLogs(workerLogs: IResolvable)

      /**
       * @param workerLogs Defines the worker logs sent to CloudWatch Logs and the logging level to
       * send.
       */
      public fun workerLogs(workerLogs: ModuleLoggingConfigurationProperty)

      /**
       * @param workerLogs Defines the worker logs sent to CloudWatch Logs and the logging level to
       * send.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("663473f1a66947d758bb986bca1649a2c63d636a684bb8ae0cda9440fb485e36")
      public fun workerLogs(workerLogs: ModuleLoggingConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mwaa.CfnEnvironment.LoggingConfigurationProperty.Builder =
          software.amazon.awscdk.services.mwaa.CfnEnvironment.LoggingConfigurationProperty.builder()

      /**
       * @param dagProcessingLogs Defines the processing logs sent to CloudWatch Logs and the
       * logging level to send.
       */
      override fun dagProcessingLogs(dagProcessingLogs: IResolvable) {
        cdkBuilder.dagProcessingLogs(dagProcessingLogs.let(IResolvable::unwrap))
      }

      /**
       * @param dagProcessingLogs Defines the processing logs sent to CloudWatch Logs and the
       * logging level to send.
       */
      override fun dagProcessingLogs(dagProcessingLogs: ModuleLoggingConfigurationProperty) {
        cdkBuilder.dagProcessingLogs(dagProcessingLogs.let(ModuleLoggingConfigurationProperty::unwrap))
      }

      /**
       * @param dagProcessingLogs Defines the processing logs sent to CloudWatch Logs and the
       * logging level to send.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1330f7c2b8e957ece7d3f6d63b8e92b8bd0cb2f4e727176b706cd8a77c679735")
      override
          fun dagProcessingLogs(dagProcessingLogs: ModuleLoggingConfigurationProperty.Builder.() -> Unit):
          Unit = dagProcessingLogs(ModuleLoggingConfigurationProperty(dagProcessingLogs))

      /**
       * @param schedulerLogs Defines the scheduler logs sent to CloudWatch Logs and the logging
       * level to send.
       */
      override fun schedulerLogs(schedulerLogs: IResolvable) {
        cdkBuilder.schedulerLogs(schedulerLogs.let(IResolvable::unwrap))
      }

      /**
       * @param schedulerLogs Defines the scheduler logs sent to CloudWatch Logs and the logging
       * level to send.
       */
      override fun schedulerLogs(schedulerLogs: ModuleLoggingConfigurationProperty) {
        cdkBuilder.schedulerLogs(schedulerLogs.let(ModuleLoggingConfigurationProperty::unwrap))
      }

      /**
       * @param schedulerLogs Defines the scheduler logs sent to CloudWatch Logs and the logging
       * level to send.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("73e3e873b4c948aba5941ca638f6ee43fe683de1dfd86839ffdbcd9dc98fe3f6")
      override
          fun schedulerLogs(schedulerLogs: ModuleLoggingConfigurationProperty.Builder.() -> Unit):
          Unit = schedulerLogs(ModuleLoggingConfigurationProperty(schedulerLogs))

      /**
       * @param taskLogs Defines the task logs sent to CloudWatch Logs and the logging level to
       * send.
       */
      override fun taskLogs(taskLogs: IResolvable) {
        cdkBuilder.taskLogs(taskLogs.let(IResolvable::unwrap))
      }

      /**
       * @param taskLogs Defines the task logs sent to CloudWatch Logs and the logging level to
       * send.
       */
      override fun taskLogs(taskLogs: ModuleLoggingConfigurationProperty) {
        cdkBuilder.taskLogs(taskLogs.let(ModuleLoggingConfigurationProperty::unwrap))
      }

      /**
       * @param taskLogs Defines the task logs sent to CloudWatch Logs and the logging level to
       * send.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a283a4f04f2890bdc485fdb461988647ae261ca78d3d9463cd916a5f9d3da19")
      override fun taskLogs(taskLogs: ModuleLoggingConfigurationProperty.Builder.() -> Unit): Unit =
          taskLogs(ModuleLoggingConfigurationProperty(taskLogs))

      /**
       * @param webserverLogs Defines the web server logs sent to CloudWatch Logs and the logging
       * level to send.
       */
      override fun webserverLogs(webserverLogs: IResolvable) {
        cdkBuilder.webserverLogs(webserverLogs.let(IResolvable::unwrap))
      }

      /**
       * @param webserverLogs Defines the web server logs sent to CloudWatch Logs and the logging
       * level to send.
       */
      override fun webserverLogs(webserverLogs: ModuleLoggingConfigurationProperty) {
        cdkBuilder.webserverLogs(webserverLogs.let(ModuleLoggingConfigurationProperty::unwrap))
      }

      /**
       * @param webserverLogs Defines the web server logs sent to CloudWatch Logs and the logging
       * level to send.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3042a5be32bb2f4a801c944e3ddc5345a36678e5820c0655a3e5bbf5df7f8a71")
      override
          fun webserverLogs(webserverLogs: ModuleLoggingConfigurationProperty.Builder.() -> Unit):
          Unit = webserverLogs(ModuleLoggingConfigurationProperty(webserverLogs))

      /**
       * @param workerLogs Defines the worker logs sent to CloudWatch Logs and the logging level to
       * send.
       */
      override fun workerLogs(workerLogs: IResolvable) {
        cdkBuilder.workerLogs(workerLogs.let(IResolvable::unwrap))
      }

      /**
       * @param workerLogs Defines the worker logs sent to CloudWatch Logs and the logging level to
       * send.
       */
      override fun workerLogs(workerLogs: ModuleLoggingConfigurationProperty) {
        cdkBuilder.workerLogs(workerLogs.let(ModuleLoggingConfigurationProperty::unwrap))
      }

      /**
       * @param workerLogs Defines the worker logs sent to CloudWatch Logs and the logging level to
       * send.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("663473f1a66947d758bb986bca1649a2c63d636a684bb8ae0cda9440fb485e36")
      override fun workerLogs(workerLogs: ModuleLoggingConfigurationProperty.Builder.() -> Unit):
          Unit = workerLogs(ModuleLoggingConfigurationProperty(workerLogs))

      public fun build():
          software.amazon.awscdk.services.mwaa.CfnEnvironment.LoggingConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mwaa.CfnEnvironment.LoggingConfigurationProperty,
    ) : CdkObject(cdkObject), LoggingConfigurationProperty {
      /**
       * Defines the processing logs sent to CloudWatch Logs and the logging level to send.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mwaa-environment-loggingconfiguration.html#cfn-mwaa-environment-loggingconfiguration-dagprocessinglogs)
       */
      override fun dagProcessingLogs(): Any? = unwrap(this).getDagProcessingLogs()

      /**
       * Defines the scheduler logs sent to CloudWatch Logs and the logging level to send.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mwaa-environment-loggingconfiguration.html#cfn-mwaa-environment-loggingconfiguration-schedulerlogs)
       */
      override fun schedulerLogs(): Any? = unwrap(this).getSchedulerLogs()

      /**
       * Defines the task logs sent to CloudWatch Logs and the logging level to send.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mwaa-environment-loggingconfiguration.html#cfn-mwaa-environment-loggingconfiguration-tasklogs)
       */
      override fun taskLogs(): Any? = unwrap(this).getTaskLogs()

      /**
       * Defines the web server logs sent to CloudWatch Logs and the logging level to send.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mwaa-environment-loggingconfiguration.html#cfn-mwaa-environment-loggingconfiguration-webserverlogs)
       */
      override fun webserverLogs(): Any? = unwrap(this).getWebserverLogs()

      /**
       * Defines the worker logs sent to CloudWatch Logs and the logging level to send.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mwaa-environment-loggingconfiguration.html#cfn-mwaa-environment-loggingconfiguration-workerlogs)
       */
      override fun workerLogs(): Any? = unwrap(this).getWorkerLogs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mwaa.CfnEnvironment.LoggingConfigurationProperty):
          LoggingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingConfigurationProperty):
          software.amazon.awscdk.services.mwaa.CfnEnvironment.LoggingConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mwaa.CfnEnvironment.LoggingConfigurationProperty
    }
  }

  /**
   * The VPC networking components used to secure and enable network traffic between the AWS
   * resources for your environment.
   *
   * To learn more, see [About networking on Amazon
   * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mwaa.*;
   * NetworkConfigurationProperty networkConfigurationProperty =
   * NetworkConfigurationProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mwaa-environment-networkconfiguration.html)
   */
  public interface NetworkConfigurationProperty {
    /**
     * A list of one or more security group IDs.
     *
     * Accepts up to 5 security group IDs. A security group must be attached to the same VPC as the
     * subnets. To learn more, see [Security in your VPC on Amazon
     * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-security.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mwaa-environment-networkconfiguration.html#cfn-mwaa-environment-networkconfiguration-securitygroupids)
     */
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    /**
     * A list of subnet IDs.
     *
     * *Required* to create an environment. Must be private subnets in two different availability
     * zones. A subnet must be attached to the same VPC as the security group. To learn more, see
     * [About networking on Amazon
     * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mwaa-environment-networkconfiguration.html#cfn-mwaa-environment-networkconfiguration-subnetids)
     */
    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    /**
     * A builder for [NetworkConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroupIds A list of one or more security group IDs.
       * Accepts up to 5 security group IDs. A security group must be attached to the same VPC as
       * the subnets. To learn more, see [Security in your VPC on Amazon
       * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-security.html) .
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds A list of one or more security group IDs.
       * Accepts up to 5 security group IDs. A security group must be attached to the same VPC as
       * the subnets. To learn more, see [Security in your VPC on Amazon
       * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-security.html) .
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnetIds A list of subnet IDs.
       * *Required* to create an environment. Must be private subnets in two different availability
       * zones. A subnet must be attached to the same VPC as the security group. To learn more, see
       * [About networking on Amazon
       * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html) .
       */
      public fun subnetIds(subnetIds: List<String>)

      /**
       * @param subnetIds A list of subnet IDs.
       * *Required* to create an environment. Must be private subnets in two different availability
       * zones. A subnet must be attached to the same VPC as the security group. To learn more, see
       * [About networking on Amazon
       * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html) .
       */
      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mwaa.CfnEnvironment.NetworkConfigurationProperty.Builder =
          software.amazon.awscdk.services.mwaa.CfnEnvironment.NetworkConfigurationProperty.builder()

      /**
       * @param securityGroupIds A list of one or more security group IDs.
       * Accepts up to 5 security group IDs. A security group must be attached to the same VPC as
       * the subnets. To learn more, see [Security in your VPC on Amazon
       * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-security.html) .
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds A list of one or more security group IDs.
       * Accepts up to 5 security group IDs. A security group must be attached to the same VPC as
       * the subnets. To learn more, see [Security in your VPC on Amazon
       * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-security.html) .
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnetIds A list of subnet IDs.
       * *Required* to create an environment. Must be private subnets in two different availability
       * zones. A subnet must be attached to the same VPC as the security group. To learn more, see
       * [About networking on Amazon
       * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html) .
       */
      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      /**
       * @param subnetIds A list of subnet IDs.
       * *Required* to create an environment. Must be private subnets in two different availability
       * zones. A subnet must be attached to the same VPC as the security group. To learn more, see
       * [About networking on Amazon
       * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html) .
       */
      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build():
          software.amazon.awscdk.services.mwaa.CfnEnvironment.NetworkConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mwaa.CfnEnvironment.NetworkConfigurationProperty,
    ) : CdkObject(cdkObject), NetworkConfigurationProperty {
      /**
       * A list of one or more security group IDs.
       *
       * Accepts up to 5 security group IDs. A security group must be attached to the same VPC as
       * the subnets. To learn more, see [Security in your VPC on Amazon
       * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-security.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mwaa-environment-networkconfiguration.html#cfn-mwaa-environment-networkconfiguration-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      /**
       * A list of subnet IDs.
       *
       * *Required* to create an environment. Must be private subnets in two different availability
       * zones. A subnet must be attached to the same VPC as the security group. To learn more, see
       * [About networking on Amazon
       * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mwaa-environment-networkconfiguration.html#cfn-mwaa-environment-networkconfiguration-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mwaa.CfnEnvironment.NetworkConfigurationProperty):
          NetworkConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigurationProperty):
          software.amazon.awscdk.services.mwaa.CfnEnvironment.NetworkConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mwaa.CfnEnvironment.NetworkConfigurationProperty
    }
  }

  /**
   * Defines the type of logs to send for the Apache Airflow log type (e.g. `DagProcessingLogs` ).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mwaa.*;
   * ModuleLoggingConfigurationProperty moduleLoggingConfigurationProperty =
   * ModuleLoggingConfigurationProperty.builder()
   * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
   * .enabled(false)
   * .logLevel("logLevel")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mwaa-environment-moduleloggingconfiguration.html)
   */
  public interface ModuleLoggingConfigurationProperty {
    /**
     * The ARN of the CloudWatch Logs log group for each type of Apache Airflow log type that you
     * have enabled.
     *
     *
     * `CloudWatchLogGroupArn` is available only as a return value, accessible when specified as an
     * attribute in the
     * [`Fn:GetAtt`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#aws-resource-mwaa-environment-return-values)
     * intrinsic function. Any value you provide for `CloudWatchLogGroupArn` is discarded by Amazon
     * MWAA.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mwaa-environment-moduleloggingconfiguration.html#cfn-mwaa-environment-moduleloggingconfiguration-cloudwatchloggrouparn)
     */
    public fun cloudWatchLogGroupArn(): String? = unwrap(this).getCloudWatchLogGroupArn()

    /**
     * Indicates whether to enable the Apache Airflow log type (e.g. `DagProcessingLogs` ) in
     * CloudWatch Logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mwaa-environment-moduleloggingconfiguration.html#cfn-mwaa-environment-moduleloggingconfiguration-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * Defines the Apache Airflow logs to send for the log type (e.g. `DagProcessingLogs` ) to
     * CloudWatch Logs. Valid values: `CRITICAL` , `ERROR` , `WARNING` , `INFO` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mwaa-environment-moduleloggingconfiguration.html#cfn-mwaa-environment-moduleloggingconfiguration-loglevel)
     */
    public fun logLevel(): String? = unwrap(this).getLogLevel()

    /**
     * A builder for [ModuleLoggingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchLogGroupArn The ARN of the CloudWatch Logs log group for each type of
       * Apache Airflow log type that you have enabled.
       *
       * `CloudWatchLogGroupArn` is available only as a return value, accessible when specified as
       * an attribute in the
       * [`Fn:GetAtt`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#aws-resource-mwaa-environment-return-values)
       * intrinsic function. Any value you provide for `CloudWatchLogGroupArn` is discarded by Amazon
       * MWAA.
       */
      public fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String)

      /**
       * @param enabled Indicates whether to enable the Apache Airflow log type (e.g.
       * `DagProcessingLogs` ) in CloudWatch Logs.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Indicates whether to enable the Apache Airflow log type (e.g.
       * `DagProcessingLogs` ) in CloudWatch Logs.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param logLevel Defines the Apache Airflow logs to send for the log type (e.g.
       * `DagProcessingLogs` ) to CloudWatch Logs. Valid values: `CRITICAL` , `ERROR` , `WARNING` ,
       * `INFO` .
       */
      public fun logLevel(logLevel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mwaa.CfnEnvironment.ModuleLoggingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mwaa.CfnEnvironment.ModuleLoggingConfigurationProperty.builder()

      /**
       * @param cloudWatchLogGroupArn The ARN of the CloudWatch Logs log group for each type of
       * Apache Airflow log type that you have enabled.
       *
       * `CloudWatchLogGroupArn` is available only as a return value, accessible when specified as
       * an attribute in the
       * [`Fn:GetAtt`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#aws-resource-mwaa-environment-return-values)
       * intrinsic function. Any value you provide for `CloudWatchLogGroupArn` is discarded by Amazon
       * MWAA.
       */
      override fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String) {
        cdkBuilder.cloudWatchLogGroupArn(cloudWatchLogGroupArn)
      }

      /**
       * @param enabled Indicates whether to enable the Apache Airflow log type (e.g.
       * `DagProcessingLogs` ) in CloudWatch Logs.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Indicates whether to enable the Apache Airflow log type (e.g.
       * `DagProcessingLogs` ) in CloudWatch Logs.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param logLevel Defines the Apache Airflow logs to send for the log type (e.g.
       * `DagProcessingLogs` ) to CloudWatch Logs. Valid values: `CRITICAL` , `ERROR` , `WARNING` ,
       * `INFO` .
       */
      override fun logLevel(logLevel: String) {
        cdkBuilder.logLevel(logLevel)
      }

      public fun build():
          software.amazon.awscdk.services.mwaa.CfnEnvironment.ModuleLoggingConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mwaa.CfnEnvironment.ModuleLoggingConfigurationProperty,
    ) : CdkObject(cdkObject), ModuleLoggingConfigurationProperty {
      /**
       * The ARN of the CloudWatch Logs log group for each type of Apache Airflow log type that you
       * have enabled.
       *
       *
       * `CloudWatchLogGroupArn` is available only as a return value, accessible when specified as
       * an attribute in the
       * [`Fn:GetAtt`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#aws-resource-mwaa-environment-return-values)
       * intrinsic function. Any value you provide for `CloudWatchLogGroupArn` is discarded by Amazon
       * MWAA.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mwaa-environment-moduleloggingconfiguration.html#cfn-mwaa-environment-moduleloggingconfiguration-cloudwatchloggrouparn)
       */
      override fun cloudWatchLogGroupArn(): String? = unwrap(this).getCloudWatchLogGroupArn()

      /**
       * Indicates whether to enable the Apache Airflow log type (e.g. `DagProcessingLogs` ) in
       * CloudWatch Logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mwaa-environment-moduleloggingconfiguration.html#cfn-mwaa-environment-moduleloggingconfiguration-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * Defines the Apache Airflow logs to send for the log type (e.g. `DagProcessingLogs` ) to
       * CloudWatch Logs. Valid values: `CRITICAL` , `ERROR` , `WARNING` , `INFO` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mwaa-environment-moduleloggingconfiguration.html#cfn-mwaa-environment-moduleloggingconfiguration-loglevel)
       */
      override fun logLevel(): String? = unwrap(this).getLogLevel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ModuleLoggingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mwaa.CfnEnvironment.ModuleLoggingConfigurationProperty):
          ModuleLoggingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModuleLoggingConfigurationProperty):
          software.amazon.awscdk.services.mwaa.CfnEnvironment.ModuleLoggingConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mwaa.CfnEnvironment.ModuleLoggingConfigurationProperty
    }
  }
}
