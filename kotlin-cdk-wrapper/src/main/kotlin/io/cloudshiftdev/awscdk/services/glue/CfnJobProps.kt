@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnJob`.
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
 * CfnJobProps cfnJobProps = CfnJobProps.builder()
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
 * .logUri("logUri")
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
public interface CfnJobProps {
  /**
   * This parameter is no longer supported. Use `MaxCapacity` instead.
   *
   * The number of capacity units that are allocated to this job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-allocatedcapacity)
   */
  public fun allocatedCapacity(): Number? = unwrap(this).getAllocatedCapacity()

  /**
   * The code that executes a job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-command)
   */
  public fun command(): Any

  /**
   * The connections used for this job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-connections)
   */
  public fun connections(): Any? = unwrap(this).getConnections()

  /**
   * The default arguments for this job, specified as name-value pairs.
   *
   * You can specify arguments here that your own job-execution script consumes, in addition to
   * arguments that AWS Glue itself consumes.
   *
   * For information about how to specify and consume your own job arguments, see [Calling AWS Glue
   * APIs in
   * Python](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html) in
   * the *AWS Glue Developer Guide* .
   *
   * For information about the key-value pairs that AWS Glue consumes to set up your job, see
   * [Special Parameters Used by AWS
   * Glue](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html) in
   * the *AWS Glue Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-defaultarguments)
   */
  public fun defaultArguments(): Any? = unwrap(this).getDefaultArguments()

  /**
   * A description of the job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Indicates whether the job is run with a standard or flexible execution class.
   *
   * The standard execution class is ideal for time-sensitive workloads that require fast job
   * startup and dedicated resources.
   *
   * The flexible execution class is appropriate for time-insensitive jobs whose start and
   * completion times may vary.
   *
   * Only jobs with AWS Glue version 3.0 and above and command type `glueetl` will be allowed to set
   * `ExecutionClass` to `FLEX` . The flexible execution class is available for Spark jobs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-executionclass)
   */
  public fun executionClass(): String? = unwrap(this).getExecutionClass()

  /**
   * The maximum number of concurrent runs that are allowed for this job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-executionproperty)
   */
  public fun executionProperty(): Any? = unwrap(this).getExecutionProperty()

  /**
   * Glue version determines the versions of Apache Spark and Python that AWS Glue supports.
   *
   * The Python version indicates the version supported for jobs of type Spark.
   *
   * For more information about the available AWS Glue versions and corresponding Spark and Python
   * versions, see [Glue version](https://docs.aws.amazon.com/glue/latest/dg/add-job.html) in the
   * developer guide.
   *
   * Jobs that are created without specifying a Glue version default to Glue 0.9.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-glueversion)
   */
  public fun glueVersion(): String? = unwrap(this).getGlueVersion()

  /**
   * This field is reserved for future use.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-loguri)
   */
  public fun logUri(): String? = unwrap(this).getLogUri()

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
   * from 2 to 100 DPUs. The default is 10 DPUs. This job type cannot have a fractional DPU allocation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-maxcapacity)
   */
  public fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

  /**
   * The maximum number of times to retry this job after a JobRun fails.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-maxretries)
   */
  public fun maxRetries(): Number? = unwrap(this).getMaxRetries()

  /**
   * The name you assign to this job definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * Non-overridable arguments for this job, specified as name-value pairs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-nonoverridablearguments)
   */
  public fun nonOverridableArguments(): Any? = unwrap(this).getNonOverridableArguments()

  /**
   * Specifies configuration properties of a notification.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-notificationproperty)
   */
  public fun notificationProperty(): Any? = unwrap(this).getNotificationProperty()

  /**
   * The number of workers of a defined `workerType` that are allocated when a job runs.
   *
   * The maximum number of workers you can define are 299 for `G.1X` , and 149 for `G.2X` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-numberofworkers)
   */
  public fun numberOfWorkers(): Number? = unwrap(this).getNumberOfWorkers()

  /**
   * The name or Amazon Resource Name (ARN) of the IAM role associated with this job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-role)
   */
  public fun role(): String

  /**
   * The name of the `SecurityConfiguration` structure to be used with this job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-securityconfiguration)
   */
  public fun securityConfiguration(): String? = unwrap(this).getSecurityConfiguration()

  /**
   * The tags to use with this job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-tags)
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * The job timeout in minutes.
   *
   * This is the maximum time that a job run can consume resources before it is terminated and
   * enters TIMEOUT status. The default is 2,880 minutes (48 hours).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-timeout)
   */
  public fun timeout(): Number? = unwrap(this).getTimeout()

  /**
   * The type of predefined worker that is allocated when a job runs.
   *
   * Accepts a value of G.1X, G.2X, G.4X, G.8X or G.025X for Spark jobs. Accepts the value Z.2X for
   * Ray jobs.
   *
   * * For the `G.1X` worker type, each worker maps to 1 DPU (4 vCPUs, 16 GB of memory) with 84GB
   * disk (approximately 34GB free), and provides 1 executor per worker. We recommend this worker type
   * for workloads such as data transforms, joins, and queries, to offers a scalable and cost effective
   * way to run most jobs.
   * * For the `G.2X` worker type, each worker maps to 2 DPU (8 vCPUs, 32 GB of memory) with 128GB
   * disk (approximately 77GB free), and provides 1 executor per worker. We recommend this worker type
   * for workloads such as data transforms, joins, and queries, to offers a scalable and cost effective
   * way to run most jobs.
   * * For the `G.4X` worker type, each worker maps to 4 DPU (16 vCPUs, 64 GB of memory) with 256GB
   * disk (approximately 235GB free), and provides 1 executor per worker. We recommend this worker type
   * for jobs whose workloads contain your most demanding transforms, aggregations, joins, and queries.
   * This worker type is available only for AWS Glue version 3.0 or later Spark ETL jobs in the
   * following AWS Regions: US East (Ohio), US East (N. Virginia), US West (Oregon), Asia Pacific
   * (Singapore), Asia Pacific (Sydney), Asia Pacific (Tokyo), Canada (Central), Europe (Frankfurt),
   * Europe (Ireland), and Europe (Stockholm).
   * * For the `G.8X` worker type, each worker maps to 8 DPU (32 vCPUs, 128 GB of memory) with 512GB
   * disk (approximately 487GB free), and provides 1 executor per worker. We recommend this worker type
   * for jobs whose workloads contain your most demanding transforms, aggregations, joins, and queries.
   * This worker type is available only for AWS Glue version 3.0 or later Spark ETL jobs, in the same
   * AWS Regions as supported for the `G.4X` worker type.
   * * For the `G.025X` worker type, each worker maps to 0.25 DPU (2 vCPUs, 4 GB of memory) with
   * 84GB disk (approximately 34GB free), and provides 1 executor per worker. We recommend this worker
   * type for low volume streaming jobs. This worker type is only available for AWS Glue version 3.0
   * streaming jobs.
   * * For the `Z.2X` worker type, each worker maps to 2 M-DPU (8vCPUs, 64 GB of memory) with 128 GB
   * disk (approximately 120GB free), and provides up to 8 Ray workers based on the autoscaler.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-workertype)
   */
  public fun workerType(): String? = unwrap(this).getWorkerType()

  /**
   * A builder for [CfnJobProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allocatedCapacity This parameter is no longer supported. Use `MaxCapacity` instead.
     * The number of capacity units that are allocated to this job.
     */
    public fun allocatedCapacity(allocatedCapacity: Number)

    /**
     * @param command The code that executes a job. 
     */
    public fun command(command: IResolvable)

    /**
     * @param command The code that executes a job. 
     */
    public fun command(command: CfnJob.JobCommandProperty)

    /**
     * @param command The code that executes a job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da4b8ddfd931e2258ae33892b3856f3af8e9a12abfea18b04e500130cbfb461b")
    public fun command(command: CfnJob.JobCommandProperty.Builder.() -> Unit)

    /**
     * @param connections The connections used for this job.
     */
    public fun connections(connections: IResolvable)

    /**
     * @param connections The connections used for this job.
     */
    public fun connections(connections: CfnJob.ConnectionsListProperty)

    /**
     * @param connections The connections used for this job.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d004dac2e399a9b5b13d11a74ca3d6d386e4d9f85058f43e671c75dc44dfc4d")
    public fun connections(connections: CfnJob.ConnectionsListProperty.Builder.() -> Unit)

    /**
     * @param defaultArguments The default arguments for this job, specified as name-value pairs.
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
     */
    public fun defaultArguments(defaultArguments: Any)

    /**
     * @param description A description of the job.
     */
    public fun description(description: String)

    /**
     * @param executionClass Indicates whether the job is run with a standard or flexible execution
     * class.
     * The standard execution class is ideal for time-sensitive workloads that require fast job
     * startup and dedicated resources.
     *
     * The flexible execution class is appropriate for time-insensitive jobs whose start and
     * completion times may vary.
     *
     * Only jobs with AWS Glue version 3.0 and above and command type `glueetl` will be allowed to
     * set `ExecutionClass` to `FLEX` . The flexible execution class is available for Spark jobs.
     */
    public fun executionClass(executionClass: String)

    /**
     * @param executionProperty The maximum number of concurrent runs that are allowed for this job.
     */
    public fun executionProperty(executionProperty: IResolvable)

    /**
     * @param executionProperty The maximum number of concurrent runs that are allowed for this job.
     */
    public fun executionProperty(executionProperty: CfnJob.ExecutionPropertyProperty)

    /**
     * @param executionProperty The maximum number of concurrent runs that are allowed for this job.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c6bf33591925bccc0b1b107899ab75f47a4f5ef4f10f4feb8b97fb37a9f5629")
    public
        fun executionProperty(executionProperty: CfnJob.ExecutionPropertyProperty.Builder.() -> Unit)

    /**
     * @param glueVersion Glue version determines the versions of Apache Spark and Python that AWS
     * Glue supports.
     * The Python version indicates the version supported for jobs of type Spark.
     *
     * For more information about the available AWS Glue versions and corresponding Spark and Python
     * versions, see [Glue version](https://docs.aws.amazon.com/glue/latest/dg/add-job.html) in the
     * developer guide.
     *
     * Jobs that are created without specifying a Glue version default to Glue 0.9.
     */
    public fun glueVersion(glueVersion: String)

    /**
     * @param logUri This field is reserved for future use.
     */
    public fun logUri(logUri: String)

    /**
     * @param maxCapacity The number of AWS Glue data processing units (DPUs) that can be allocated
     * when this job runs.
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
     */
    public fun maxCapacity(maxCapacity: Number)

    /**
     * @param maxRetries The maximum number of times to retry this job after a JobRun fails.
     */
    public fun maxRetries(maxRetries: Number)

    /**
     * @param name The name you assign to this job definition.
     */
    public fun name(name: String)

    /**
     * @param nonOverridableArguments Non-overridable arguments for this job, specified as
     * name-value pairs.
     */
    public fun nonOverridableArguments(nonOverridableArguments: Any)

    /**
     * @param notificationProperty Specifies configuration properties of a notification.
     */
    public fun notificationProperty(notificationProperty: IResolvable)

    /**
     * @param notificationProperty Specifies configuration properties of a notification.
     */
    public fun notificationProperty(notificationProperty: CfnJob.NotificationPropertyProperty)

    /**
     * @param notificationProperty Specifies configuration properties of a notification.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6aec0fe135a85e56aea229fcf808f3fa7c8bf2bf853e52a3787c6052a213058f")
    public
        fun notificationProperty(notificationProperty: CfnJob.NotificationPropertyProperty.Builder.() -> Unit)

    /**
     * @param numberOfWorkers The number of workers of a defined `workerType` that are allocated
     * when a job runs.
     * The maximum number of workers you can define are 299 for `G.1X` , and 149 for `G.2X` .
     */
    public fun numberOfWorkers(numberOfWorkers: Number)

    /**
     * @param role The name or Amazon Resource Name (ARN) of the IAM role associated with this job. 
     */
    public fun role(role: String)

    /**
     * @param securityConfiguration The name of the `SecurityConfiguration` structure to be used
     * with this job.
     */
    public fun securityConfiguration(securityConfiguration: String)

    /**
     * @param tags The tags to use with this job.
     */
    public fun tags(tags: Any)

    /**
     * @param timeout The job timeout in minutes.
     * This is the maximum time that a job run can consume resources before it is terminated and
     * enters TIMEOUT status. The default is 2,880 minutes (48 hours).
     */
    public fun timeout(timeout: Number)

    /**
     * @param workerType The type of predefined worker that is allocated when a job runs.
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
     */
    public fun workerType(workerType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnJobProps.Builder =
        software.amazon.awscdk.services.glue.CfnJobProps.builder()

    /**
     * @param allocatedCapacity This parameter is no longer supported. Use `MaxCapacity` instead.
     * The number of capacity units that are allocated to this job.
     */
    override fun allocatedCapacity(allocatedCapacity: Number) {
      cdkBuilder.allocatedCapacity(allocatedCapacity)
    }

    /**
     * @param command The code that executes a job. 
     */
    override fun command(command: IResolvable) {
      cdkBuilder.command(command.let(IResolvable::unwrap))
    }

    /**
     * @param command The code that executes a job. 
     */
    override fun command(command: CfnJob.JobCommandProperty) {
      cdkBuilder.command(command.let(CfnJob.JobCommandProperty::unwrap))
    }

    /**
     * @param command The code that executes a job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da4b8ddfd931e2258ae33892b3856f3af8e9a12abfea18b04e500130cbfb461b")
    override fun command(command: CfnJob.JobCommandProperty.Builder.() -> Unit): Unit =
        command(CfnJob.JobCommandProperty(command))

    /**
     * @param connections The connections used for this job.
     */
    override fun connections(connections: IResolvable) {
      cdkBuilder.connections(connections.let(IResolvable::unwrap))
    }

    /**
     * @param connections The connections used for this job.
     */
    override fun connections(connections: CfnJob.ConnectionsListProperty) {
      cdkBuilder.connections(connections.let(CfnJob.ConnectionsListProperty::unwrap))
    }

    /**
     * @param connections The connections used for this job.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d004dac2e399a9b5b13d11a74ca3d6d386e4d9f85058f43e671c75dc44dfc4d")
    override fun connections(connections: CfnJob.ConnectionsListProperty.Builder.() -> Unit): Unit =
        connections(CfnJob.ConnectionsListProperty(connections))

    /**
     * @param defaultArguments The default arguments for this job, specified as name-value pairs.
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
     */
    override fun defaultArguments(defaultArguments: Any) {
      cdkBuilder.defaultArguments(defaultArguments)
    }

    /**
     * @param description A description of the job.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param executionClass Indicates whether the job is run with a standard or flexible execution
     * class.
     * The standard execution class is ideal for time-sensitive workloads that require fast job
     * startup and dedicated resources.
     *
     * The flexible execution class is appropriate for time-insensitive jobs whose start and
     * completion times may vary.
     *
     * Only jobs with AWS Glue version 3.0 and above and command type `glueetl` will be allowed to
     * set `ExecutionClass` to `FLEX` . The flexible execution class is available for Spark jobs.
     */
    override fun executionClass(executionClass: String) {
      cdkBuilder.executionClass(executionClass)
    }

    /**
     * @param executionProperty The maximum number of concurrent runs that are allowed for this job.
     */
    override fun executionProperty(executionProperty: IResolvable) {
      cdkBuilder.executionProperty(executionProperty.let(IResolvable::unwrap))
    }

    /**
     * @param executionProperty The maximum number of concurrent runs that are allowed for this job.
     */
    override fun executionProperty(executionProperty: CfnJob.ExecutionPropertyProperty) {
      cdkBuilder.executionProperty(executionProperty.let(CfnJob.ExecutionPropertyProperty::unwrap))
    }

    /**
     * @param executionProperty The maximum number of concurrent runs that are allowed for this job.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c6bf33591925bccc0b1b107899ab75f47a4f5ef4f10f4feb8b97fb37a9f5629")
    override
        fun executionProperty(executionProperty: CfnJob.ExecutionPropertyProperty.Builder.() -> Unit):
        Unit = executionProperty(CfnJob.ExecutionPropertyProperty(executionProperty))

    /**
     * @param glueVersion Glue version determines the versions of Apache Spark and Python that AWS
     * Glue supports.
     * The Python version indicates the version supported for jobs of type Spark.
     *
     * For more information about the available AWS Glue versions and corresponding Spark and Python
     * versions, see [Glue version](https://docs.aws.amazon.com/glue/latest/dg/add-job.html) in the
     * developer guide.
     *
     * Jobs that are created without specifying a Glue version default to Glue 0.9.
     */
    override fun glueVersion(glueVersion: String) {
      cdkBuilder.glueVersion(glueVersion)
    }

    /**
     * @param logUri This field is reserved for future use.
     */
    override fun logUri(logUri: String) {
      cdkBuilder.logUri(logUri)
    }

    /**
     * @param maxCapacity The number of AWS Glue data processing units (DPUs) that can be allocated
     * when this job runs.
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
     */
    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * @param maxRetries The maximum number of times to retry this job after a JobRun fails.
     */
    override fun maxRetries(maxRetries: Number) {
      cdkBuilder.maxRetries(maxRetries)
    }

    /**
     * @param name The name you assign to this job definition.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param nonOverridableArguments Non-overridable arguments for this job, specified as
     * name-value pairs.
     */
    override fun nonOverridableArguments(nonOverridableArguments: Any) {
      cdkBuilder.nonOverridableArguments(nonOverridableArguments)
    }

    /**
     * @param notificationProperty Specifies configuration properties of a notification.
     */
    override fun notificationProperty(notificationProperty: IResolvable) {
      cdkBuilder.notificationProperty(notificationProperty.let(IResolvable::unwrap))
    }

    /**
     * @param notificationProperty Specifies configuration properties of a notification.
     */
    override fun notificationProperty(notificationProperty: CfnJob.NotificationPropertyProperty) {
      cdkBuilder.notificationProperty(notificationProperty.let(CfnJob.NotificationPropertyProperty::unwrap))
    }

    /**
     * @param notificationProperty Specifies configuration properties of a notification.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6aec0fe135a85e56aea229fcf808f3fa7c8bf2bf853e52a3787c6052a213058f")
    override
        fun notificationProperty(notificationProperty: CfnJob.NotificationPropertyProperty.Builder.() -> Unit):
        Unit = notificationProperty(CfnJob.NotificationPropertyProperty(notificationProperty))

    /**
     * @param numberOfWorkers The number of workers of a defined `workerType` that are allocated
     * when a job runs.
     * The maximum number of workers you can define are 299 for `G.1X` , and 149 for `G.2X` .
     */
    override fun numberOfWorkers(numberOfWorkers: Number) {
      cdkBuilder.numberOfWorkers(numberOfWorkers)
    }

    /**
     * @param role The name or Amazon Resource Name (ARN) of the IAM role associated with this job. 
     */
    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    /**
     * @param securityConfiguration The name of the `SecurityConfiguration` structure to be used
     * with this job.
     */
    override fun securityConfiguration(securityConfiguration: String) {
      cdkBuilder.securityConfiguration(securityConfiguration)
    }

    /**
     * @param tags The tags to use with this job.
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param timeout The job timeout in minutes.
     * This is the maximum time that a job run can consume resources before it is terminated and
     * enters TIMEOUT status. The default is 2,880 minutes (48 hours).
     */
    override fun timeout(timeout: Number) {
      cdkBuilder.timeout(timeout)
    }

    /**
     * @param workerType The type of predefined worker that is allocated when a job runs.
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
     */
    override fun workerType(workerType: String) {
      cdkBuilder.workerType(workerType)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnJobProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.glue.CfnJobProps,
  ) : CdkObject(cdkObject), CfnJobProps {
    /**
     * This parameter is no longer supported. Use `MaxCapacity` instead.
     *
     * The number of capacity units that are allocated to this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-allocatedcapacity)
     */
    override fun allocatedCapacity(): Number? = unwrap(this).getAllocatedCapacity()

    /**
     * The code that executes a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-command)
     */
    override fun command(): Any = unwrap(this).getCommand()

    /**
     * The connections used for this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-connections)
     */
    override fun connections(): Any? = unwrap(this).getConnections()

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
     */
    override fun defaultArguments(): Any? = unwrap(this).getDefaultArguments()

    /**
     * A description of the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

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
     */
    override fun executionClass(): String? = unwrap(this).getExecutionClass()

    /**
     * The maximum number of concurrent runs that are allowed for this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-executionproperty)
     */
    override fun executionProperty(): Any? = unwrap(this).getExecutionProperty()

    /**
     * Glue version determines the versions of Apache Spark and Python that AWS Glue supports.
     *
     * The Python version indicates the version supported for jobs of type Spark.
     *
     * For more information about the available AWS Glue versions and corresponding Spark and Python
     * versions, see [Glue version](https://docs.aws.amazon.com/glue/latest/dg/add-job.html) in the
     * developer guide.
     *
     * Jobs that are created without specifying a Glue version default to Glue 0.9.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-glueversion)
     */
    override fun glueVersion(): String? = unwrap(this).getGlueVersion()

    /**
     * This field is reserved for future use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-loguri)
     */
    override fun logUri(): String? = unwrap(this).getLogUri()

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
     */
    override fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

    /**
     * The maximum number of times to retry this job after a JobRun fails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-maxretries)
     */
    override fun maxRetries(): Number? = unwrap(this).getMaxRetries()

    /**
     * The name you assign to this job definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * Non-overridable arguments for this job, specified as name-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-nonoverridablearguments)
     */
    override fun nonOverridableArguments(): Any? = unwrap(this).getNonOverridableArguments()

    /**
     * Specifies configuration properties of a notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-notificationproperty)
     */
    override fun notificationProperty(): Any? = unwrap(this).getNotificationProperty()

    /**
     * The number of workers of a defined `workerType` that are allocated when a job runs.
     *
     * The maximum number of workers you can define are 299 for `G.1X` , and 149 for `G.2X` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-numberofworkers)
     */
    override fun numberOfWorkers(): Number? = unwrap(this).getNumberOfWorkers()

    /**
     * The name or Amazon Resource Name (ARN) of the IAM role associated with this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-role)
     */
    override fun role(): String = unwrap(this).getRole()

    /**
     * The name of the `SecurityConfiguration` structure to be used with this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-securityconfiguration)
     */
    override fun securityConfiguration(): String? = unwrap(this).getSecurityConfiguration()

    /**
     * The tags to use with this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-tags)
     */
    override fun tags(): Any? = unwrap(this).getTags()

    /**
     * The job timeout in minutes.
     *
     * This is the maximum time that a job run can consume resources before it is terminated and
     * enters TIMEOUT status. The default is 2,880 minutes (48 hours).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-timeout)
     */
    override fun timeout(): Number? = unwrap(this).getTimeout()

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
     */
    override fun workerType(): String? = unwrap(this).getWorkerType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnJobProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnJobProps): CfnJobProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnJobProps): software.amazon.awscdk.services.glue.CfnJobProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnJobProps
  }
}
