@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
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
 * The `AWS::Glue::Job` resource specifies an AWS Glue job in the data catalog.
 *
 * For more information, see [Adding Jobs in AWS
 * Glue](https://docs.aws.amazon.com/glue/latest/dg/add-job.html) and [Job
 * Structure](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-jobs-job.html#aws-glue-api-jobs-job-Job)
 * in the *AWS Glue Developer Guide.*
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.glue.*;
 * Object defaultArguments;
 * Object nonOverridableArguments;
 * Object tags;
 * CfnJob cfnJob = CfnJob.Builder.create(this, "MyCfnJob")
 * .command(JobCommandProperty.builder()
 * .name("name")
 * .pythonVersion("pythonVersion")
 * .runtime("runtime")
 * .scriptLocation("scriptLocation")
 * .build())
 * .role("role")
 * // the properties below are optional
 * .allocatedCapacity(123)
 * .connections(ConnectionsListProperty.builder()
 * .connections(List.of("connections"))
 * .build())
 * .defaultArguments(defaultArguments)
 * .description("description")
 * .executionClass("executionClass")
 * .executionProperty(ExecutionPropertyProperty.builder()
 * .maxConcurrentRuns(123)
 * .build())
 * .glueVersion("glueVersion")
 * .jobMode("jobMode")
 * .jobRunQueuingEnabled(false)
 * .logUri("logUri")
 * .maintenanceWindow("maintenanceWindow")
 * .maxCapacity(123)
 * .maxRetries(123)
 * .name("name")
 * .nonOverridableArguments(nonOverridableArguments)
 * .notificationProperty(NotificationPropertyProperty.builder()
 * .notifyDelayAfter(123)
 * .build())
 * .numberOfWorkers(123)
 * .securityConfiguration("securityConfiguration")
 * .tags(tags)
 * .timeout(123)
 * .workerType("workerType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html)
 */
public open class CfnJob(
  cdkObject: software.amazon.awscdk.services.glue.CfnJob,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnJobProps,
  ) :
      this(software.amazon.awscdk.services.glue.CfnJob(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnJobProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnJobProps.Builder.() -> Unit,
  ) : this(scope, id, CfnJobProps(props)
  )

  /**
   * This parameter is no longer supported.
   *
   * Use `MaxCapacity` instead.
   */
  public open fun allocatedCapacity(): Number? = unwrap(this).getAllocatedCapacity()

  /**
   * This parameter is no longer supported.
   *
   * Use `MaxCapacity` instead.
   */
  public open fun allocatedCapacity(`value`: Number) {
    unwrap(this).setAllocatedCapacity(`value`)
  }

  /**
   * The code that executes a job.
   */
  public open fun command(): Any = unwrap(this).getCommand()

  /**
   * The code that executes a job.
   */
  public open fun command(`value`: IResolvable) {
    unwrap(this).setCommand(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The code that executes a job.
   */
  public open fun command(`value`: JobCommandProperty) {
    unwrap(this).setCommand(`value`.let(JobCommandProperty.Companion::unwrap))
  }

  /**
   * The code that executes a job.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ae45662fe203f8d20debc027cf2996f729ffdd320bc41613ae9baec02a5b454c")
  public open fun command(`value`: JobCommandProperty.Builder.() -> Unit): Unit =
      command(JobCommandProperty(`value`))

  /**
   * The connections used for this job.
   */
  public open fun connections(): Any? = unwrap(this).getConnections()

  /**
   * The connections used for this job.
   */
  public open fun connections(`value`: IResolvable) {
    unwrap(this).setConnections(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The connections used for this job.
   */
  public open fun connections(`value`: ConnectionsListProperty) {
    unwrap(this).setConnections(`value`.let(ConnectionsListProperty.Companion::unwrap))
  }

  /**
   * The connections used for this job.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a1ead6d7223dff0d1b8b12d86e7ef81b4a77bbb9108e88dfedfd96cd25cee22d")
  public open fun connections(`value`: ConnectionsListProperty.Builder.() -> Unit): Unit =
      connections(ConnectionsListProperty(`value`))

  /**
   * The default arguments for this job, specified as name-value pairs.
   */
  public open fun defaultArguments(): Any? = unwrap(this).getDefaultArguments()

  /**
   * The default arguments for this job, specified as name-value pairs.
   */
  public open fun defaultArguments(`value`: Any) {
    unwrap(this).setDefaultArguments(`value`)
  }

  /**
   * A description of the job.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the job.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Indicates whether the job is run with a standard or flexible execution class.
   */
  public open fun executionClass(): String? = unwrap(this).getExecutionClass()

  /**
   * Indicates whether the job is run with a standard or flexible execution class.
   */
  public open fun executionClass(`value`: String) {
    unwrap(this).setExecutionClass(`value`)
  }

  /**
   * The maximum number of concurrent runs that are allowed for this job.
   */
  public open fun executionProperty(): Any? = unwrap(this).getExecutionProperty()

  /**
   * The maximum number of concurrent runs that are allowed for this job.
   */
  public open fun executionProperty(`value`: IResolvable) {
    unwrap(this).setExecutionProperty(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The maximum number of concurrent runs that are allowed for this job.
   */
  public open fun executionProperty(`value`: ExecutionPropertyProperty) {
    unwrap(this).setExecutionProperty(`value`.let(ExecutionPropertyProperty.Companion::unwrap))
  }

  /**
   * The maximum number of concurrent runs that are allowed for this job.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8141148f7df66671798e0f5389a7ab4490f8468867cf7d49a9d890b987551652")
  public open fun executionProperty(`value`: ExecutionPropertyProperty.Builder.() -> Unit): Unit =
      executionProperty(ExecutionPropertyProperty(`value`))

  /**
   * Glue version determines the versions of Apache Spark and Python that AWS Glue supports.
   */
  public open fun glueVersion(): String? = unwrap(this).getGlueVersion()

  /**
   * Glue version determines the versions of Apache Spark and Python that AWS Glue supports.
   */
  public open fun glueVersion(`value`: String) {
    unwrap(this).setGlueVersion(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A mode that describes how a job was created.
   *
   * Valid values are:.
   */
  public open fun jobMode(): String? = unwrap(this).getJobMode()

  /**
   * A mode that describes how a job was created.
   *
   * Valid values are:.
   */
  public open fun jobMode(`value`: String) {
    unwrap(this).setJobMode(`value`)
  }

  /**
   * Specifies whether job run queuing is enabled for the job runs for this job.
   */
  public open fun jobRunQueuingEnabled(): Any? = unwrap(this).getJobRunQueuingEnabled()

  /**
   * Specifies whether job run queuing is enabled for the job runs for this job.
   */
  public open fun jobRunQueuingEnabled(`value`: Boolean) {
    unwrap(this).setJobRunQueuingEnabled(`value`)
  }

  /**
   * Specifies whether job run queuing is enabled for the job runs for this job.
   */
  public open fun jobRunQueuingEnabled(`value`: IResolvable) {
    unwrap(this).setJobRunQueuingEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * This field is reserved for future use.
   */
  public open fun logUri(): String? = unwrap(this).getLogUri()

  /**
   * This field is reserved for future use.
   */
  public open fun logUri(`value`: String) {
    unwrap(this).setLogUri(`value`)
  }

  /**
   * This field specifies a day of the week and hour for a maintenance window for streaming jobs.
   */
  public open fun maintenanceWindow(): String? = unwrap(this).getMaintenanceWindow()

  /**
   * This field specifies a day of the week and hour for a maintenance window for streaming jobs.
   */
  public open fun maintenanceWindow(`value`: String) {
    unwrap(this).setMaintenanceWindow(`value`)
  }

  /**
   * The number of AWS Glue data processing units (DPUs) that can be allocated when this job runs.
   */
  public open fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

  /**
   * The number of AWS Glue data processing units (DPUs) that can be allocated when this job runs.
   */
  public open fun maxCapacity(`value`: Number) {
    unwrap(this).setMaxCapacity(`value`)
  }

  /**
   * The maximum number of times to retry this job after a JobRun fails.
   */
  public open fun maxRetries(): Number? = unwrap(this).getMaxRetries()

  /**
   * The maximum number of times to retry this job after a JobRun fails.
   */
  public open fun maxRetries(`value`: Number) {
    unwrap(this).setMaxRetries(`value`)
  }

  /**
   * The name you assign to this job definition.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name you assign to this job definition.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Non-overridable arguments for this job, specified as name-value pairs.
   */
  public open fun nonOverridableArguments(): Any? = unwrap(this).getNonOverridableArguments()

  /**
   * Non-overridable arguments for this job, specified as name-value pairs.
   */
  public open fun nonOverridableArguments(`value`: Any) {
    unwrap(this).setNonOverridableArguments(`value`)
  }

  /**
   * Specifies configuration properties of a notification.
   */
  public open fun notificationProperty(): Any? = unwrap(this).getNotificationProperty()

  /**
   * Specifies configuration properties of a notification.
   */
  public open fun notificationProperty(`value`: IResolvable) {
    unwrap(this).setNotificationProperty(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies configuration properties of a notification.
   */
  public open fun notificationProperty(`value`: NotificationPropertyProperty) {
    unwrap(this).setNotificationProperty(`value`.let(NotificationPropertyProperty.Companion::unwrap))
  }

  /**
   * Specifies configuration properties of a notification.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("11241dabb83ebe4a1477e21bc321e41bc1cea344130d6c7936826a18c05f0d3a")
  public open fun notificationProperty(`value`: NotificationPropertyProperty.Builder.() -> Unit):
      Unit = notificationProperty(NotificationPropertyProperty(`value`))

  /**
   * The number of workers of a defined `workerType` that are allocated when a job runs.
   */
  public open fun numberOfWorkers(): Number? = unwrap(this).getNumberOfWorkers()

  /**
   * The number of workers of a defined `workerType` that are allocated when a job runs.
   */
  public open fun numberOfWorkers(`value`: Number) {
    unwrap(this).setNumberOfWorkers(`value`)
  }

  /**
   * The name or Amazon Resource Name (ARN) of the IAM role associated with this job.
   */
  public open fun role(): String = unwrap(this).getRole()

  /**
   * The name or Amazon Resource Name (ARN) of the IAM role associated with this job.
   */
  public open fun role(`value`: String) {
    unwrap(this).setRole(`value`)
  }

  /**
   * The name of the `SecurityConfiguration` structure to be used with this job.
   */
  public open fun securityConfiguration(): String? = unwrap(this).getSecurityConfiguration()

  /**
   * The name of the `SecurityConfiguration` structure to be used with this job.
   */
  public open fun securityConfiguration(`value`: String) {
    unwrap(this).setSecurityConfiguration(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to use with this job.
   */
  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  /**
   * The tags to use with this job.
   */
  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * The job timeout in minutes.
   */
  public open fun timeout(): Number? = unwrap(this).getTimeout()

  /**
   * The job timeout in minutes.
   */
  public open fun timeout(`value`: Number) {
    unwrap(this).setTimeout(`value`)
  }

  /**
   * The type of predefined worker that is allocated when a job runs.
   */
  public open fun workerType(): String? = unwrap(this).getWorkerType()

  /**
   * The type of predefined worker that is allocated when a job runs.
   */
  public open fun workerType(`value`: String) {
    unwrap(this).setWorkerType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.glue.CfnJob].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * This parameter is no longer supported. Use `MaxCapacity` instead.
     *
     * The number of capacity units that are allocated to this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-allocatedcapacity)
     * @param allocatedCapacity This parameter is no longer supported. Use `MaxCapacity` instead. 
     */
    public fun allocatedCapacity(allocatedCapacity: Number)

    /**
     * The code that executes a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-command)
     * @param command The code that executes a job. 
     */
    public fun command(command: IResolvable)

    /**
     * The code that executes a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-command)
     * @param command The code that executes a job. 
     */
    public fun command(command: JobCommandProperty)

    /**
     * The code that executes a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-command)
     * @param command The code that executes a job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3678fc0b0b2ff7ca4b7a27cb9d2c4abb2f9ab703df21a2aa4b93849930e9b6dc")
    public fun command(command: JobCommandProperty.Builder.() -> Unit)

    /**
     * The connections used for this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-connections)
     * @param connections The connections used for this job. 
     */
    public fun connections(connections: IResolvable)

    /**
     * The connections used for this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-connections)
     * @param connections The connections used for this job. 
     */
    public fun connections(connections: ConnectionsListProperty)

    /**
     * The connections used for this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-connections)
     * @param connections The connections used for this job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d47c635c872c9a0a3cb04b547de56e3034016eb0a24eaf876dc00d1ef06bd6c")
    public fun connections(connections: ConnectionsListProperty.Builder.() -> Unit)

    /**
     * The default arguments for this job, specified as name-value pairs.
     *
     * You can specify arguments here that your own job-execution script consumes, in addition to
     * arguments that AWS Glue itself consumes.
     *
     * For information about how to specify and consume your own job arguments, see [Calling AWS
     * Glue APIs in
     * Python](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html) in
     * the *AWS Glue Developer Guide* .
     *
     * For information about the key-value pairs that AWS Glue consumes to set up your job, see
     * [Special Parameters Used by AWS
     * Glue](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html)
     * in the *AWS Glue Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-defaultarguments)
     * @param defaultArguments The default arguments for this job, specified as name-value pairs. 
     */
    public fun defaultArguments(defaultArguments: Any)

    /**
     * A description of the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-description)
     * @param description A description of the job. 
     */
    public fun description(description: String)

    /**
     * Indicates whether the job is run with a standard or flexible execution class.
     *
     * The standard execution class is ideal for time-sensitive workloads that require fast job
     * startup and dedicated resources.
     *
     * The flexible execution class is appropriate for time-insensitive jobs whose start and
     * completion times may vary.
     *
     * Only jobs with AWS Glue version 3.0 and above and command type `glueetl` will be allowed to
     * set `ExecutionClass` to `FLEX` . The flexible execution class is available for Spark jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-executionclass)
     * @param executionClass Indicates whether the job is run with a standard or flexible execution
     * class. 
     */
    public fun executionClass(executionClass: String)

    /**
     * The maximum number of concurrent runs that are allowed for this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-executionproperty)
     * @param executionProperty The maximum number of concurrent runs that are allowed for this job.
     * 
     */
    public fun executionProperty(executionProperty: IResolvable)

    /**
     * The maximum number of concurrent runs that are allowed for this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-executionproperty)
     * @param executionProperty The maximum number of concurrent runs that are allowed for this job.
     * 
     */
    public fun executionProperty(executionProperty: ExecutionPropertyProperty)

    /**
     * The maximum number of concurrent runs that are allowed for this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-executionproperty)
     * @param executionProperty The maximum number of concurrent runs that are allowed for this job.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e22c4a94debded832b280e207ccfc3ce7e6b7f0459e606245076f3a7f950172f")
    public fun executionProperty(executionProperty: ExecutionPropertyProperty.Builder.() -> Unit)

    /**
     * Glue version determines the versions of Apache Spark and Python that AWS Glue supports.
     *
     * The Python version indicates the version supported for jobs of type Spark.
     *
     * For more information about the available AWS Glue versions and corresponding Spark and Python
     * versions, see [Glue version](https://docs.aws.amazon.com/glue/latest/dg/add-job.html) in the
     * developer guide.
     *
     * Jobs that are created without specifying a Glue version default to the latest Glue version
     * available.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-glueversion)
     * @param glueVersion Glue version determines the versions of Apache Spark and Python that AWS
     * Glue supports. 
     */
    public fun glueVersion(glueVersion: String)

    /**
     * A mode that describes how a job was created. Valid values are:.
     *
     * * `SCRIPT` - The job was created using the AWS Glue Studio script editor.
     * * `VISUAL` - The job was created using the AWS Glue Studio visual editor.
     * * `NOTEBOOK` - The job was created using an interactive sessions notebook.
     *
     * When the `JobMode` field is missing or null, `SCRIPT` is assigned as the default value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-jobmode)
     * @param jobMode A mode that describes how a job was created. Valid values are:. 
     */
    public fun jobMode(jobMode: String)

    /**
     * Specifies whether job run queuing is enabled for the job runs for this job.
     *
     * A value of true means job run queuing is enabled for the job runs. If false or not populated,
     * the job runs will not be considered for queueing.
     *
     * If this field does not match the value set in the job run, then the value from the job run
     * field will be used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-jobrunqueuingenabled)
     * @param jobRunQueuingEnabled Specifies whether job run queuing is enabled for the job runs for
     * this job. 
     */
    public fun jobRunQueuingEnabled(jobRunQueuingEnabled: Boolean)

    /**
     * Specifies whether job run queuing is enabled for the job runs for this job.
     *
     * A value of true means job run queuing is enabled for the job runs. If false or not populated,
     * the job runs will not be considered for queueing.
     *
     * If this field does not match the value set in the job run, then the value from the job run
     * field will be used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-jobrunqueuingenabled)
     * @param jobRunQueuingEnabled Specifies whether job run queuing is enabled for the job runs for
     * this job. 
     */
    public fun jobRunQueuingEnabled(jobRunQueuingEnabled: IResolvable)

    /**
     * This field is reserved for future use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-loguri)
     * @param logUri This field is reserved for future use. 
     */
    public fun logUri(logUri: String)

    /**
     * This field specifies a day of the week and hour for a maintenance window for streaming jobs.
     *
     * AWS Glue periodically performs maintenance activities. During these maintenance windows, AWS
     * Glue will need to restart your streaming jobs.
     *
     * AWS Glue will restart the job within 3 hours of the specified maintenance window. For
     * instance, if you set up the maintenance window for Monday at 10:00AM GMT, your jobs will be
     * restarted between 10:00AM GMT to 1:00PM GMT.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-maintenancewindow)
     * @param maintenanceWindow This field specifies a day of the week and hour for a maintenance
     * window for streaming jobs. 
     */
    public fun maintenanceWindow(maintenanceWindow: String)

    /**
     * The number of AWS Glue data processing units (DPUs) that can be allocated when this job runs.
     *
     * A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity
     * and 16 GB of memory.
     *
     * Do not set `Max Capacity` if using `WorkerType` and `NumberOfWorkers` .
     *
     * The value that can be allocated for `MaxCapacity` depends on whether you are running a Python
     * shell job or an Apache Spark ETL job:
     *
     * * When you specify a Python shell job ( `JobCommand.Name` ="pythonshell"), you can allocate
     * either 0.0625 or 1 DPU. The default is 0.0625 DPU.
     * * When you specify an Apache Spark ETL job ( `JobCommand.Name` ="glueetl"), you can allocate
     * from 2 to 100 DPUs. The default is 10 DPUs. This job type cannot have a fractional DPU
     * allocation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-maxcapacity)
     * @param maxCapacity The number of AWS Glue data processing units (DPUs) that can be allocated
     * when this job runs. 
     */
    public fun maxCapacity(maxCapacity: Number)

    /**
     * The maximum number of times to retry this job after a JobRun fails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-maxretries)
     * @param maxRetries The maximum number of times to retry this job after a JobRun fails. 
     */
    public fun maxRetries(maxRetries: Number)

    /**
     * The name you assign to this job definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-name)
     * @param name The name you assign to this job definition. 
     */
    public fun name(name: String)

    /**
     * Non-overridable arguments for this job, specified as name-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-nonoverridablearguments)
     * @param nonOverridableArguments Non-overridable arguments for this job, specified as
     * name-value pairs. 
     */
    public fun nonOverridableArguments(nonOverridableArguments: Any)

    /**
     * Specifies configuration properties of a notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-notificationproperty)
     * @param notificationProperty Specifies configuration properties of a notification. 
     */
    public fun notificationProperty(notificationProperty: IResolvable)

    /**
     * Specifies configuration properties of a notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-notificationproperty)
     * @param notificationProperty Specifies configuration properties of a notification. 
     */
    public fun notificationProperty(notificationProperty: NotificationPropertyProperty)

    /**
     * Specifies configuration properties of a notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-notificationproperty)
     * @param notificationProperty Specifies configuration properties of a notification. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0569ffc070d3bb79ae05f6c91224faed3b0be3d4a2867dccefea5eac85dd1c96")
    public
        fun notificationProperty(notificationProperty: NotificationPropertyProperty.Builder.() -> Unit)

    /**
     * The number of workers of a defined `workerType` that are allocated when a job runs.
     *
     * The maximum number of workers you can define are 299 for `G.1X` , and 149 for `G.2X` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-numberofworkers)
     * @param numberOfWorkers The number of workers of a defined `workerType` that are allocated
     * when a job runs. 
     */
    public fun numberOfWorkers(numberOfWorkers: Number)

    /**
     * The name or Amazon Resource Name (ARN) of the IAM role associated with this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-role)
     * @param role The name or Amazon Resource Name (ARN) of the IAM role associated with this job. 
     */
    public fun role(role: String)

    /**
     * The name of the `SecurityConfiguration` structure to be used with this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-securityconfiguration)
     * @param securityConfiguration The name of the `SecurityConfiguration` structure to be used
     * with this job. 
     */
    public fun securityConfiguration(securityConfiguration: String)

    /**
     * The tags to use with this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-tags)
     * @param tags The tags to use with this job. 
     */
    public fun tags(tags: Any)

    /**
     * The job timeout in minutes.
     *
     * This is the maximum time that a job run can consume resources before it is terminated and
     * enters TIMEOUT status. The default is 2,880 minutes (48 hours).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-timeout)
     * @param timeout The job timeout in minutes. 
     */
    public fun timeout(timeout: Number)

    /**
     * The type of predefined worker that is allocated when a job runs.
     *
     * Accepts a value of G.1X, G.2X, G.4X, G.8X or G.025X for Spark jobs. Accepts the value Z.2X
     * for Ray jobs.
     *
     * * For the `G.1X` worker type, each worker maps to 1 DPU (4 vCPUs, 16 GB of memory) with 84GB
     * disk (approximately 34GB free), and provides 1 executor per worker. We recommend this worker
     * type for workloads such as data transforms, joins, and queries, to offers a scalable and cost
     * effective way to run most jobs.
     * * For the `G.2X` worker type, each worker maps to 2 DPU (8 vCPUs, 32 GB of memory) with 128GB
     * disk (approximately 77GB free), and provides 1 executor per worker. We recommend this worker
     * type for workloads such as data transforms, joins, and queries, to offers a scalable and cost
     * effective way to run most jobs.
     * * For the `G.4X` worker type, each worker maps to 4 DPU (16 vCPUs, 64 GB of memory) with
     * 256GB disk (approximately 235GB free), and provides 1 executor per worker. We recommend this
     * worker type for jobs whose workloads contain your most demanding transforms, aggregations,
     * joins, and queries. This worker type is available only for AWS Glue version 3.0 or later Spark
     * ETL jobs in the following AWS Regions: US East (Ohio), US East (N. Virginia), US West (Oregon),
     * Asia Pacific (Singapore), Asia Pacific (Sydney), Asia Pacific (Tokyo), Canada (Central), Europe
     * (Frankfurt), Europe (Ireland), and Europe (Stockholm).
     * * For the `G.8X` worker type, each worker maps to 8 DPU (32 vCPUs, 128 GB of memory) with
     * 512GB disk (approximately 487GB free), and provides 1 executor per worker. We recommend this
     * worker type for jobs whose workloads contain your most demanding transforms, aggregations,
     * joins, and queries. This worker type is available only for AWS Glue version 3.0 or later Spark
     * ETL jobs, in the same AWS Regions as supported for the `G.4X` worker type.
     * * For the `G.025X` worker type, each worker maps to 0.25 DPU (2 vCPUs, 4 GB of memory) with
     * 84GB disk (approximately 34GB free), and provides 1 executor per worker. We recommend this
     * worker type for low volume streaming jobs. This worker type is only available for AWS Glue
     * version 3.0 streaming jobs.
     * * For the `Z.2X` worker type, each worker maps to 2 M-DPU (8vCPUs, 64 GB of memory) with 128
     * GB disk (approximately 120GB free), and provides up to 8 Ray workers based on the autoscaler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-workertype)
     * @param workerType The type of predefined worker that is allocated when a job runs. 
     */
    public fun workerType(workerType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnJob.Builder =
        software.amazon.awscdk.services.glue.CfnJob.Builder.create(scope, id)

    /**
     * This parameter is no longer supported. Use `MaxCapacity` instead.
     *
     * The number of capacity units that are allocated to this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-allocatedcapacity)
     * @param allocatedCapacity This parameter is no longer supported. Use `MaxCapacity` instead. 
     */
    override fun allocatedCapacity(allocatedCapacity: Number) {
      cdkBuilder.allocatedCapacity(allocatedCapacity)
    }

    /**
     * The code that executes a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-command)
     * @param command The code that executes a job. 
     */
    override fun command(command: IResolvable) {
      cdkBuilder.command(command.let(IResolvable.Companion::unwrap))
    }

    /**
     * The code that executes a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-command)
     * @param command The code that executes a job. 
     */
    override fun command(command: JobCommandProperty) {
      cdkBuilder.command(command.let(JobCommandProperty.Companion::unwrap))
    }

    /**
     * The code that executes a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-command)
     * @param command The code that executes a job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3678fc0b0b2ff7ca4b7a27cb9d2c4abb2f9ab703df21a2aa4b93849930e9b6dc")
    override fun command(command: JobCommandProperty.Builder.() -> Unit): Unit =
        command(JobCommandProperty(command))

    /**
     * The connections used for this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-connections)
     * @param connections The connections used for this job. 
     */
    override fun connections(connections: IResolvable) {
      cdkBuilder.connections(connections.let(IResolvable.Companion::unwrap))
    }

    /**
     * The connections used for this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-connections)
     * @param connections The connections used for this job. 
     */
    override fun connections(connections: ConnectionsListProperty) {
      cdkBuilder.connections(connections.let(ConnectionsListProperty.Companion::unwrap))
    }

    /**
     * The connections used for this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-connections)
     * @param connections The connections used for this job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d47c635c872c9a0a3cb04b547de56e3034016eb0a24eaf876dc00d1ef06bd6c")
    override fun connections(connections: ConnectionsListProperty.Builder.() -> Unit): Unit =
        connections(ConnectionsListProperty(connections))

    /**
     * The default arguments for this job, specified as name-value pairs.
     *
     * You can specify arguments here that your own job-execution script consumes, in addition to
     * arguments that AWS Glue itself consumes.
     *
     * For information about how to specify and consume your own job arguments, see [Calling AWS
     * Glue APIs in
     * Python](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html) in
     * the *AWS Glue Developer Guide* .
     *
     * For information about the key-value pairs that AWS Glue consumes to set up your job, see
     * [Special Parameters Used by AWS
     * Glue](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html)
     * in the *AWS Glue Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-defaultarguments)
     * @param defaultArguments The default arguments for this job, specified as name-value pairs. 
     */
    override fun defaultArguments(defaultArguments: Any) {
      cdkBuilder.defaultArguments(defaultArguments)
    }

    /**
     * A description of the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-description)
     * @param description A description of the job. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Indicates whether the job is run with a standard or flexible execution class.
     *
     * The standard execution class is ideal for time-sensitive workloads that require fast job
     * startup and dedicated resources.
     *
     * The flexible execution class is appropriate for time-insensitive jobs whose start and
     * completion times may vary.
     *
     * Only jobs with AWS Glue version 3.0 and above and command type `glueetl` will be allowed to
     * set `ExecutionClass` to `FLEX` . The flexible execution class is available for Spark jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-executionclass)
     * @param executionClass Indicates whether the job is run with a standard or flexible execution
     * class. 
     */
    override fun executionClass(executionClass: String) {
      cdkBuilder.executionClass(executionClass)
    }

    /**
     * The maximum number of concurrent runs that are allowed for this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-executionproperty)
     * @param executionProperty The maximum number of concurrent runs that are allowed for this job.
     * 
     */
    override fun executionProperty(executionProperty: IResolvable) {
      cdkBuilder.executionProperty(executionProperty.let(IResolvable.Companion::unwrap))
    }

    /**
     * The maximum number of concurrent runs that are allowed for this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-executionproperty)
     * @param executionProperty The maximum number of concurrent runs that are allowed for this job.
     * 
     */
    override fun executionProperty(executionProperty: ExecutionPropertyProperty) {
      cdkBuilder.executionProperty(executionProperty.let(ExecutionPropertyProperty.Companion::unwrap))
    }

    /**
     * The maximum number of concurrent runs that are allowed for this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-executionproperty)
     * @param executionProperty The maximum number of concurrent runs that are allowed for this job.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e22c4a94debded832b280e207ccfc3ce7e6b7f0459e606245076f3a7f950172f")
    override fun executionProperty(executionProperty: ExecutionPropertyProperty.Builder.() -> Unit):
        Unit = executionProperty(ExecutionPropertyProperty(executionProperty))

    /**
     * Glue version determines the versions of Apache Spark and Python that AWS Glue supports.
     *
     * The Python version indicates the version supported for jobs of type Spark.
     *
     * For more information about the available AWS Glue versions and corresponding Spark and Python
     * versions, see [Glue version](https://docs.aws.amazon.com/glue/latest/dg/add-job.html) in the
     * developer guide.
     *
     * Jobs that are created without specifying a Glue version default to the latest Glue version
     * available.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-glueversion)
     * @param glueVersion Glue version determines the versions of Apache Spark and Python that AWS
     * Glue supports. 
     */
    override fun glueVersion(glueVersion: String) {
      cdkBuilder.glueVersion(glueVersion)
    }

    /**
     * A mode that describes how a job was created. Valid values are:.
     *
     * * `SCRIPT` - The job was created using the AWS Glue Studio script editor.
     * * `VISUAL` - The job was created using the AWS Glue Studio visual editor.
     * * `NOTEBOOK` - The job was created using an interactive sessions notebook.
     *
     * When the `JobMode` field is missing or null, `SCRIPT` is assigned as the default value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-jobmode)
     * @param jobMode A mode that describes how a job was created. Valid values are:. 
     */
    override fun jobMode(jobMode: String) {
      cdkBuilder.jobMode(jobMode)
    }

    /**
     * Specifies whether job run queuing is enabled for the job runs for this job.
     *
     * A value of true means job run queuing is enabled for the job runs. If false or not populated,
     * the job runs will not be considered for queueing.
     *
     * If this field does not match the value set in the job run, then the value from the job run
     * field will be used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-jobrunqueuingenabled)
     * @param jobRunQueuingEnabled Specifies whether job run queuing is enabled for the job runs for
     * this job. 
     */
    override fun jobRunQueuingEnabled(jobRunQueuingEnabled: Boolean) {
      cdkBuilder.jobRunQueuingEnabled(jobRunQueuingEnabled)
    }

    /**
     * Specifies whether job run queuing is enabled for the job runs for this job.
     *
     * A value of true means job run queuing is enabled for the job runs. If false or not populated,
     * the job runs will not be considered for queueing.
     *
     * If this field does not match the value set in the job run, then the value from the job run
     * field will be used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-jobrunqueuingenabled)
     * @param jobRunQueuingEnabled Specifies whether job run queuing is enabled for the job runs for
     * this job. 
     */
    override fun jobRunQueuingEnabled(jobRunQueuingEnabled: IResolvable) {
      cdkBuilder.jobRunQueuingEnabled(jobRunQueuingEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * This field is reserved for future use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-loguri)
     * @param logUri This field is reserved for future use. 
     */
    override fun logUri(logUri: String) {
      cdkBuilder.logUri(logUri)
    }

    /**
     * This field specifies a day of the week and hour for a maintenance window for streaming jobs.
     *
     * AWS Glue periodically performs maintenance activities. During these maintenance windows, AWS
     * Glue will need to restart your streaming jobs.
     *
     * AWS Glue will restart the job within 3 hours of the specified maintenance window. For
     * instance, if you set up the maintenance window for Monday at 10:00AM GMT, your jobs will be
     * restarted between 10:00AM GMT to 1:00PM GMT.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-maintenancewindow)
     * @param maintenanceWindow This field specifies a day of the week and hour for a maintenance
     * window for streaming jobs. 
     */
    override fun maintenanceWindow(maintenanceWindow: String) {
      cdkBuilder.maintenanceWindow(maintenanceWindow)
    }

    /**
     * The number of AWS Glue data processing units (DPUs) that can be allocated when this job runs.
     *
     * A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity
     * and 16 GB of memory.
     *
     * Do not set `Max Capacity` if using `WorkerType` and `NumberOfWorkers` .
     *
     * The value that can be allocated for `MaxCapacity` depends on whether you are running a Python
     * shell job or an Apache Spark ETL job:
     *
     * * When you specify a Python shell job ( `JobCommand.Name` ="pythonshell"), you can allocate
     * either 0.0625 or 1 DPU. The default is 0.0625 DPU.
     * * When you specify an Apache Spark ETL job ( `JobCommand.Name` ="glueetl"), you can allocate
     * from 2 to 100 DPUs. The default is 10 DPUs. This job type cannot have a fractional DPU
     * allocation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-maxcapacity)
     * @param maxCapacity The number of AWS Glue data processing units (DPUs) that can be allocated
     * when this job runs. 
     */
    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * The maximum number of times to retry this job after a JobRun fails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-maxretries)
     * @param maxRetries The maximum number of times to retry this job after a JobRun fails. 
     */
    override fun maxRetries(maxRetries: Number) {
      cdkBuilder.maxRetries(maxRetries)
    }

    /**
     * The name you assign to this job definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-name)
     * @param name The name you assign to this job definition. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Non-overridable arguments for this job, specified as name-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-nonoverridablearguments)
     * @param nonOverridableArguments Non-overridable arguments for this job, specified as
     * name-value pairs. 
     */
    override fun nonOverridableArguments(nonOverridableArguments: Any) {
      cdkBuilder.nonOverridableArguments(nonOverridableArguments)
    }

    /**
     * Specifies configuration properties of a notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-notificationproperty)
     * @param notificationProperty Specifies configuration properties of a notification. 
     */
    override fun notificationProperty(notificationProperty: IResolvable) {
      cdkBuilder.notificationProperty(notificationProperty.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies configuration properties of a notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-notificationproperty)
     * @param notificationProperty Specifies configuration properties of a notification. 
     */
    override fun notificationProperty(notificationProperty: NotificationPropertyProperty) {
      cdkBuilder.notificationProperty(notificationProperty.let(NotificationPropertyProperty.Companion::unwrap))
    }

    /**
     * Specifies configuration properties of a notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-notificationproperty)
     * @param notificationProperty Specifies configuration properties of a notification. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0569ffc070d3bb79ae05f6c91224faed3b0be3d4a2867dccefea5eac85dd1c96")
    override
        fun notificationProperty(notificationProperty: NotificationPropertyProperty.Builder.() -> Unit):
        Unit = notificationProperty(NotificationPropertyProperty(notificationProperty))

    /**
     * The number of workers of a defined `workerType` that are allocated when a job runs.
     *
     * The maximum number of workers you can define are 299 for `G.1X` , and 149 for `G.2X` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-numberofworkers)
     * @param numberOfWorkers The number of workers of a defined `workerType` that are allocated
     * when a job runs. 
     */
    override fun numberOfWorkers(numberOfWorkers: Number) {
      cdkBuilder.numberOfWorkers(numberOfWorkers)
    }

    /**
     * The name or Amazon Resource Name (ARN) of the IAM role associated with this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-role)
     * @param role The name or Amazon Resource Name (ARN) of the IAM role associated with this job. 
     */
    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    /**
     * The name of the `SecurityConfiguration` structure to be used with this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-securityconfiguration)
     * @param securityConfiguration The name of the `SecurityConfiguration` structure to be used
     * with this job. 
     */
    override fun securityConfiguration(securityConfiguration: String) {
      cdkBuilder.securityConfiguration(securityConfiguration)
    }

    /**
     * The tags to use with this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-tags)
     * @param tags The tags to use with this job. 
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    /**
     * The job timeout in minutes.
     *
     * This is the maximum time that a job run can consume resources before it is terminated and
     * enters TIMEOUT status. The default is 2,880 minutes (48 hours).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-timeout)
     * @param timeout The job timeout in minutes. 
     */
    override fun timeout(timeout: Number) {
      cdkBuilder.timeout(timeout)
    }

    /**
     * The type of predefined worker that is allocated when a job runs.
     *
     * Accepts a value of G.1X, G.2X, G.4X, G.8X or G.025X for Spark jobs. Accepts the value Z.2X
     * for Ray jobs.
     *
     * * For the `G.1X` worker type, each worker maps to 1 DPU (4 vCPUs, 16 GB of memory) with 84GB
     * disk (approximately 34GB free), and provides 1 executor per worker. We recommend this worker
     * type for workloads such as data transforms, joins, and queries, to offers a scalable and cost
     * effective way to run most jobs.
     * * For the `G.2X` worker type, each worker maps to 2 DPU (8 vCPUs, 32 GB of memory) with 128GB
     * disk (approximately 77GB free), and provides 1 executor per worker. We recommend this worker
     * type for workloads such as data transforms, joins, and queries, to offers a scalable and cost
     * effective way to run most jobs.
     * * For the `G.4X` worker type, each worker maps to 4 DPU (16 vCPUs, 64 GB of memory) with
     * 256GB disk (approximately 235GB free), and provides 1 executor per worker. We recommend this
     * worker type for jobs whose workloads contain your most demanding transforms, aggregations,
     * joins, and queries. This worker type is available only for AWS Glue version 3.0 or later Spark
     * ETL jobs in the following AWS Regions: US East (Ohio), US East (N. Virginia), US West (Oregon),
     * Asia Pacific (Singapore), Asia Pacific (Sydney), Asia Pacific (Tokyo), Canada (Central), Europe
     * (Frankfurt), Europe (Ireland), and Europe (Stockholm).
     * * For the `G.8X` worker type, each worker maps to 8 DPU (32 vCPUs, 128 GB of memory) with
     * 512GB disk (approximately 487GB free), and provides 1 executor per worker. We recommend this
     * worker type for jobs whose workloads contain your most demanding transforms, aggregations,
     * joins, and queries. This worker type is available only for AWS Glue version 3.0 or later Spark
     * ETL jobs, in the same AWS Regions as supported for the `G.4X` worker type.
     * * For the `G.025X` worker type, each worker maps to 0.25 DPU (2 vCPUs, 4 GB of memory) with
     * 84GB disk (approximately 34GB free), and provides 1 executor per worker. We recommend this
     * worker type for low volume streaming jobs. This worker type is only available for AWS Glue
     * version 3.0 streaming jobs.
     * * For the `Z.2X` worker type, each worker maps to 2 M-DPU (8vCPUs, 64 GB of memory) with 128
     * GB disk (approximately 120GB free), and provides up to 8 Ray workers based on the autoscaler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-workertype)
     * @param workerType The type of predefined worker that is allocated when a job runs. 
     */
    override fun workerType(workerType: String) {
      cdkBuilder.workerType(workerType)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnJob = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.glue.CfnJob.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnJob {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnJob(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnJob): CfnJob =
        CfnJob(cdkObject)

    internal fun unwrap(wrapped: CfnJob): software.amazon.awscdk.services.glue.CfnJob =
        wrapped.cdkObject as software.amazon.awscdk.services.glue.CfnJob
  }

  /**
   * Specifies the connections used by a job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * ConnectionsListProperty connectionsListProperty = ConnectionsListProperty.builder()
   * .connections(List.of("connections"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-connectionslist.html)
   */
  public interface ConnectionsListProperty {
    /**
     * A list of connections used by the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-connectionslist.html#cfn-glue-job-connectionslist-connections)
     */
    public fun connections(): List<String> = unwrap(this).getConnections() ?: emptyList()

    /**
     * A builder for [ConnectionsListProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connections A list of connections used by the job.
       */
      public fun connections(connections: List<String>)

      /**
       * @param connections A list of connections used by the job.
       */
      public fun connections(vararg connections: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnJob.ConnectionsListProperty.Builder =
          software.amazon.awscdk.services.glue.CfnJob.ConnectionsListProperty.builder()

      /**
       * @param connections A list of connections used by the job.
       */
      override fun connections(connections: List<String>) {
        cdkBuilder.connections(connections)
      }

      /**
       * @param connections A list of connections used by the job.
       */
      override fun connections(vararg connections: String): Unit = connections(connections.toList())

      public fun build(): software.amazon.awscdk.services.glue.CfnJob.ConnectionsListProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.glue.CfnJob.ConnectionsListProperty,
    ) : CdkObject(cdkObject),
        ConnectionsListProperty {
      /**
       * A list of connections used by the job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-connectionslist.html#cfn-glue-job-connectionslist-connections)
       */
      override fun connections(): List<String> = unwrap(this).getConnections() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectionsListProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnJob.ConnectionsListProperty):
          ConnectionsListProperty = CdkObjectWrappers.wrap(cdkObject) as? ConnectionsListProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionsListProperty):
          software.amazon.awscdk.services.glue.CfnJob.ConnectionsListProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnJob.ConnectionsListProperty
    }
  }

  /**
   * An execution property of a job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * ExecutionPropertyProperty executionPropertyProperty = ExecutionPropertyProperty.builder()
   * .maxConcurrentRuns(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-executionproperty.html)
   */
  public interface ExecutionPropertyProperty {
    /**
     * The maximum number of concurrent runs allowed for the job.
     *
     * The default is 1. An error is returned when this threshold is reached. The maximum value you
     * can specify is controlled by a service limit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-executionproperty.html#cfn-glue-job-executionproperty-maxconcurrentruns)
     */
    public fun maxConcurrentRuns(): Number? = unwrap(this).getMaxConcurrentRuns()

    /**
     * A builder for [ExecutionPropertyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxConcurrentRuns The maximum number of concurrent runs allowed for the job.
       * The default is 1. An error is returned when this threshold is reached. The maximum value
       * you can specify is controlled by a service limit.
       */
      public fun maxConcurrentRuns(maxConcurrentRuns: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnJob.ExecutionPropertyProperty.Builder =
          software.amazon.awscdk.services.glue.CfnJob.ExecutionPropertyProperty.builder()

      /**
       * @param maxConcurrentRuns The maximum number of concurrent runs allowed for the job.
       * The default is 1. An error is returned when this threshold is reached. The maximum value
       * you can specify is controlled by a service limit.
       */
      override fun maxConcurrentRuns(maxConcurrentRuns: Number) {
        cdkBuilder.maxConcurrentRuns(maxConcurrentRuns)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnJob.ExecutionPropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.glue.CfnJob.ExecutionPropertyProperty,
    ) : CdkObject(cdkObject),
        ExecutionPropertyProperty {
      /**
       * The maximum number of concurrent runs allowed for the job.
       *
       * The default is 1. An error is returned when this threshold is reached. The maximum value
       * you can specify is controlled by a service limit.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-executionproperty.html#cfn-glue-job-executionproperty-maxconcurrentruns)
       */
      override fun maxConcurrentRuns(): Number? = unwrap(this).getMaxConcurrentRuns()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExecutionPropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnJob.ExecutionPropertyProperty):
          ExecutionPropertyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ExecutionPropertyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExecutionPropertyProperty):
          software.amazon.awscdk.services.glue.CfnJob.ExecutionPropertyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnJob.ExecutionPropertyProperty
    }
  }

  /**
   * Specifies code executed when a job is run.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * JobCommandProperty jobCommandProperty = JobCommandProperty.builder()
   * .name("name")
   * .pythonVersion("pythonVersion")
   * .runtime("runtime")
   * .scriptLocation("scriptLocation")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html)
   */
  public interface JobCommandProperty {
    /**
     * The name of the job command.
     *
     * For an Apache Spark ETL job, this must be `glueetl` . For a Python shell job, it must be
     * `pythonshell` . For an Apache Spark streaming ETL job, this must be `gluestreaming` . For a Ray
     * job, this must be `glueray` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html#cfn-glue-job-jobcommand-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The Python version being used to execute a Python shell job.
     *
     * Allowed values are 3 or 3.9. Version 2 is deprecated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html#cfn-glue-job-jobcommand-pythonversion)
     */
    public fun pythonVersion(): String? = unwrap(this).getPythonVersion()

    /**
     * In Ray jobs, Runtime is used to specify the versions of Ray, Python and additional libraries
     * available in your environment.
     *
     * This field is not used in other job types. For supported runtime environment values, see
     * [Working with Ray jobs](https://docs.aws.amazon.com/glue/latest/dg/ray-jobs-section.html) in the
     * AWS Glue Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html#cfn-glue-job-jobcommand-runtime)
     */
    public fun runtime(): String? = unwrap(this).getRuntime()

    /**
     * Specifies the Amazon Simple Storage Service (Amazon S3) path to a script that executes a job
     * (required).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html#cfn-glue-job-jobcommand-scriptlocation)
     */
    public fun scriptLocation(): String? = unwrap(this).getScriptLocation()

    /**
     * A builder for [JobCommandProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the job command.
       * For an Apache Spark ETL job, this must be `glueetl` . For a Python shell job, it must be
       * `pythonshell` . For an Apache Spark streaming ETL job, this must be `gluestreaming` . For a
       * Ray job, this must be `glueray` .
       */
      public fun name(name: String)

      /**
       * @param pythonVersion The Python version being used to execute a Python shell job.
       * Allowed values are 3 or 3.9. Version 2 is deprecated.
       */
      public fun pythonVersion(pythonVersion: String)

      /**
       * @param runtime In Ray jobs, Runtime is used to specify the versions of Ray, Python and
       * additional libraries available in your environment.
       * This field is not used in other job types. For supported runtime environment values, see
       * [Working with Ray jobs](https://docs.aws.amazon.com/glue/latest/dg/ray-jobs-section.html) in
       * the AWS Glue Developer Guide.
       */
      public fun runtime(runtime: String)

      /**
       * @param scriptLocation Specifies the Amazon Simple Storage Service (Amazon S3) path to a
       * script that executes a job (required).
       */
      public fun scriptLocation(scriptLocation: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.glue.CfnJob.JobCommandProperty.Builder
          = software.amazon.awscdk.services.glue.CfnJob.JobCommandProperty.builder()

      /**
       * @param name The name of the job command.
       * For an Apache Spark ETL job, this must be `glueetl` . For a Python shell job, it must be
       * `pythonshell` . For an Apache Spark streaming ETL job, this must be `gluestreaming` . For a
       * Ray job, this must be `glueray` .
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param pythonVersion The Python version being used to execute a Python shell job.
       * Allowed values are 3 or 3.9. Version 2 is deprecated.
       */
      override fun pythonVersion(pythonVersion: String) {
        cdkBuilder.pythonVersion(pythonVersion)
      }

      /**
       * @param runtime In Ray jobs, Runtime is used to specify the versions of Ray, Python and
       * additional libraries available in your environment.
       * This field is not used in other job types. For supported runtime environment values, see
       * [Working with Ray jobs](https://docs.aws.amazon.com/glue/latest/dg/ray-jobs-section.html) in
       * the AWS Glue Developer Guide.
       */
      override fun runtime(runtime: String) {
        cdkBuilder.runtime(runtime)
      }

      /**
       * @param scriptLocation Specifies the Amazon Simple Storage Service (Amazon S3) path to a
       * script that executes a job (required).
       */
      override fun scriptLocation(scriptLocation: String) {
        cdkBuilder.scriptLocation(scriptLocation)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnJob.JobCommandProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.glue.CfnJob.JobCommandProperty,
    ) : CdkObject(cdkObject),
        JobCommandProperty {
      /**
       * The name of the job command.
       *
       * For an Apache Spark ETL job, this must be `glueetl` . For a Python shell job, it must be
       * `pythonshell` . For an Apache Spark streaming ETL job, this must be `gluestreaming` . For a
       * Ray job, this must be `glueray` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html#cfn-glue-job-jobcommand-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The Python version being used to execute a Python shell job.
       *
       * Allowed values are 3 or 3.9. Version 2 is deprecated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html#cfn-glue-job-jobcommand-pythonversion)
       */
      override fun pythonVersion(): String? = unwrap(this).getPythonVersion()

      /**
       * In Ray jobs, Runtime is used to specify the versions of Ray, Python and additional
       * libraries available in your environment.
       *
       * This field is not used in other job types. For supported runtime environment values, see
       * [Working with Ray jobs](https://docs.aws.amazon.com/glue/latest/dg/ray-jobs-section.html) in
       * the AWS Glue Developer Guide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html#cfn-glue-job-jobcommand-runtime)
       */
      override fun runtime(): String? = unwrap(this).getRuntime()

      /**
       * Specifies the Amazon Simple Storage Service (Amazon S3) path to a script that executes a
       * job (required).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html#cfn-glue-job-jobcommand-scriptlocation)
       */
      override fun scriptLocation(): String? = unwrap(this).getScriptLocation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JobCommandProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnJob.JobCommandProperty):
          JobCommandProperty = CdkObjectWrappers.wrap(cdkObject) as? JobCommandProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: JobCommandProperty):
          software.amazon.awscdk.services.glue.CfnJob.JobCommandProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnJob.JobCommandProperty
    }
  }

  /**
   * Specifies configuration properties of a notification.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * NotificationPropertyProperty notificationPropertyProperty =
   * NotificationPropertyProperty.builder()
   * .notifyDelayAfter(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-notificationproperty.html)
   */
  public interface NotificationPropertyProperty {
    /**
     * After a job run starts, the number of minutes to wait before sending a job run delay
     * notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-notificationproperty.html#cfn-glue-job-notificationproperty-notifydelayafter)
     */
    public fun notifyDelayAfter(): Number? = unwrap(this).getNotifyDelayAfter()

    /**
     * A builder for [NotificationPropertyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param notifyDelayAfter After a job run starts, the number of minutes to wait before
       * sending a job run delay notification.
       */
      public fun notifyDelayAfter(notifyDelayAfter: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnJob.NotificationPropertyProperty.Builder =
          software.amazon.awscdk.services.glue.CfnJob.NotificationPropertyProperty.builder()

      /**
       * @param notifyDelayAfter After a job run starts, the number of minutes to wait before
       * sending a job run delay notification.
       */
      override fun notifyDelayAfter(notifyDelayAfter: Number) {
        cdkBuilder.notifyDelayAfter(notifyDelayAfter)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnJob.NotificationPropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.glue.CfnJob.NotificationPropertyProperty,
    ) : CdkObject(cdkObject),
        NotificationPropertyProperty {
      /**
       * After a job run starts, the number of minutes to wait before sending a job run delay
       * notification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-notificationproperty.html#cfn-glue-job-notificationproperty-notifydelayafter)
       */
      override fun notifyDelayAfter(): Number? = unwrap(this).getNotifyDelayAfter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NotificationPropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnJob.NotificationPropertyProperty):
          NotificationPropertyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NotificationPropertyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationPropertyProperty):
          software.amazon.awscdk.services.glue.CfnJob.NotificationPropertyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnJob.NotificationPropertyProperty
    }
  }
}
