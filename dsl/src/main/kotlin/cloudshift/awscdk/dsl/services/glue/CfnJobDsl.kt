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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnJob
import software.constructs.Construct

/**
 * The `AWS::Glue::Job` resource specifies an AWS Glue job in the data catalog.
 *
 * For more information, see
 * [Adding Jobs in AWS Glue](https://docs.aws.amazon.com/glue/latest/dg/add-job.html) and
 * [Job Structure](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-jobs-job.html#aws-glue-api-jobs-job-Job)
 * in the *AWS Glue Developer Guide.*
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
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
@CdkDslMarker
public class CfnJobDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnJob.Builder = CfnJob.Builder.create(scope, id)

    /**
     * This parameter is no longer supported. Use `MaxCapacity` instead.
     *
     * The number of capacity units that are allocated to this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-allocatedcapacity)
     *
     * @param allocatedCapacity This parameter is no longer supported. Use `MaxCapacity` instead.
     */
    public fun allocatedCapacity(allocatedCapacity: Number) {
        cdkBuilder.allocatedCapacity(allocatedCapacity)
    }

    /**
     * The code that executes a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-command)
     *
     * @param command The code that executes a job.
     */
    public fun command(command: IResolvable) {
        cdkBuilder.command(command)
    }

    /**
     * The code that executes a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-command)
     *
     * @param command The code that executes a job.
     */
    public fun command(command: CfnJob.JobCommandProperty) {
        cdkBuilder.command(command)
    }

    /**
     * The connections used for this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-connections)
     *
     * @param connections The connections used for this job.
     */
    public fun connections(connections: IResolvable) {
        cdkBuilder.connections(connections)
    }

    /**
     * The connections used for this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-connections)
     *
     * @param connections The connections used for this job.
     */
    public fun connections(connections: CfnJob.ConnectionsListProperty) {
        cdkBuilder.connections(connections)
    }

    /**
     * The default arguments for this job, specified as name-value pairs.
     *
     * You can specify arguments here that your own job-execution script consumes, in addition to
     * arguments that AWS Glue itself consumes.
     *
     * For information about how to specify and consume your own job arguments, see
     * [Calling AWS Glue APIs in Python](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html)
     * in the *AWS Glue Developer Guide* .
     *
     * For information about the key-value pairs that AWS Glue consumes to set up your job, see
     * [Special Parameters Used by AWS Glue](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html)
     * in the *AWS Glue Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-defaultarguments)
     *
     * @param defaultArguments The default arguments for this job, specified as name-value pairs.
     */
    public fun defaultArguments(defaultArguments: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(defaultArguments)
        cdkBuilder.defaultArguments(builder.map)
    }

    /**
     * The default arguments for this job, specified as name-value pairs.
     *
     * You can specify arguments here that your own job-execution script consumes, in addition to
     * arguments that AWS Glue itself consumes.
     *
     * For information about how to specify and consume your own job arguments, see
     * [Calling AWS Glue APIs in Python](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html)
     * in the *AWS Glue Developer Guide* .
     *
     * For information about the key-value pairs that AWS Glue consumes to set up your job, see
     * [Special Parameters Used by AWS Glue](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html)
     * in the *AWS Glue Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-defaultarguments)
     *
     * @param defaultArguments The default arguments for this job, specified as name-value pairs.
     */
    public fun defaultArguments(defaultArguments: Any) {
        cdkBuilder.defaultArguments(defaultArguments)
    }

    /**
     * A description of the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-description)
     *
     * @param description A description of the job.
     */
    public fun description(description: String) {
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
     *
     * @param executionClass Indicates whether the job is run with a standard or flexible execution
     *   class.
     */
    public fun executionClass(executionClass: String) {
        cdkBuilder.executionClass(executionClass)
    }

    /**
     * The maximum number of concurrent runs that are allowed for this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-executionproperty)
     *
     * @param executionProperty The maximum number of concurrent runs that are allowed for this job.
     */
    public fun executionProperty(executionProperty: IResolvable) {
        cdkBuilder.executionProperty(executionProperty)
    }

    /**
     * The maximum number of concurrent runs that are allowed for this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-executionproperty)
     *
     * @param executionProperty The maximum number of concurrent runs that are allowed for this job.
     */
    public fun executionProperty(executionProperty: CfnJob.ExecutionPropertyProperty) {
        cdkBuilder.executionProperty(executionProperty)
    }

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
     *
     * @param glueVersion Glue version determines the versions of Apache Spark and Python that AWS
     *   Glue supports.
     */
    public fun glueVersion(glueVersion: String) {
        cdkBuilder.glueVersion(glueVersion)
    }

    /**
     * This field is reserved for future use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-loguri)
     *
     * @param logUri This field is reserved for future use.
     */
    public fun logUri(logUri: String) {
        cdkBuilder.logUri(logUri)
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
     * * When you specify a Python shell job ( `JobCommand.Name` ="pythonshell"), you can allocate
     *   either 0.0625 or 1 DPU. The default is 0.0625 DPU.
     * * When you specify an Apache Spark ETL job ( `JobCommand.Name` ="glueetl"), you can allocate
     *   from 2 to 100 DPUs. The default is 10 DPUs. This job type cannot have a fractional DPU
     *   allocation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-maxcapacity)
     *
     * @param maxCapacity The number of AWS Glue data processing units (DPUs) that can be allocated
     *   when this job runs.
     */
    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * The maximum number of times to retry this job after a JobRun fails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-maxretries)
     *
     * @param maxRetries The maximum number of times to retry this job after a JobRun fails.
     */
    public fun maxRetries(maxRetries: Number) {
        cdkBuilder.maxRetries(maxRetries)
    }

    /**
     * The name you assign to this job definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-name)
     *
     * @param name The name you assign to this job definition.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Non-overridable arguments for this job, specified as name-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-nonoverridablearguments)
     *
     * @param nonOverridableArguments Non-overridable arguments for this job, specified as
     *   name-value pairs.
     */
    public fun nonOverridableArguments(nonOverridableArguments: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(nonOverridableArguments)
        cdkBuilder.nonOverridableArguments(builder.map)
    }

    /**
     * Non-overridable arguments for this job, specified as name-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-nonoverridablearguments)
     *
     * @param nonOverridableArguments Non-overridable arguments for this job, specified as
     *   name-value pairs.
     */
    public fun nonOverridableArguments(nonOverridableArguments: Any) {
        cdkBuilder.nonOverridableArguments(nonOverridableArguments)
    }

    /**
     * Specifies configuration properties of a notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-notificationproperty)
     *
     * @param notificationProperty Specifies configuration properties of a notification.
     */
    public fun notificationProperty(notificationProperty: IResolvable) {
        cdkBuilder.notificationProperty(notificationProperty)
    }

    /**
     * Specifies configuration properties of a notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-notificationproperty)
     *
     * @param notificationProperty Specifies configuration properties of a notification.
     */
    public fun notificationProperty(notificationProperty: CfnJob.NotificationPropertyProperty) {
        cdkBuilder.notificationProperty(notificationProperty)
    }

    /**
     * The number of workers of a defined `workerType` that are allocated when a job runs.
     *
     * The maximum number of workers you can define are 299 for `G.1X` , and 149 for `G.2X` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-numberofworkers)
     *
     * @param numberOfWorkers The number of workers of a defined `workerType` that are allocated
     *   when a job runs.
     */
    public fun numberOfWorkers(numberOfWorkers: Number) {
        cdkBuilder.numberOfWorkers(numberOfWorkers)
    }

    /**
     * The name or Amazon Resource Name (ARN) of the IAM role associated with this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-role)
     *
     * @param role The name or Amazon Resource Name (ARN) of the IAM role associated with this job.
     */
    public fun role(role: String) {
        cdkBuilder.role(role)
    }

    /**
     * The name of the `SecurityConfiguration` structure to be used with this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-securityconfiguration)
     *
     * @param securityConfiguration The name of the `SecurityConfiguration` structure to be used
     *   with this job.
     */
    public fun securityConfiguration(securityConfiguration: String) {
        cdkBuilder.securityConfiguration(securityConfiguration)
    }

    /**
     * The tags to use with this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-tags)
     *
     * @param tags The tags to use with this job.
     */
    public fun tags(tags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tags)
        cdkBuilder.tags(builder.map)
    }

    /**
     * The tags to use with this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-tags)
     *
     * @param tags The tags to use with this job.
     */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    /**
     * The job timeout in minutes.
     *
     * This is the maximum time that a job run can consume resources before it is terminated and
     * enters TIMEOUT status. The default is 2,880 minutes (48 hours).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-timeout)
     *
     * @param timeout The job timeout in minutes.
     */
    public fun timeout(timeout: Number) {
        cdkBuilder.timeout(timeout)
    }

    /**
     * The type of predefined worker that is allocated when a job runs.
     *
     * Accepts a value of Standard, G.1X, or G.2X.
     * * For the `Standard` worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB
     *   disk, and 2 executors per worker.
     * * For the `G.1X` worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB
     *   disk), and provides 1 executor per worker. We recommend this worker type for
     *   memory-intensive jobs.
     * * For the `G.2X` worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB
     *   disk), and provides 1 executor per worker. We recommend this worker type for
     *   memory-intensive jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-workertype)
     *
     * @param workerType The type of predefined worker that is allocated when a job runs.
     */
    public fun workerType(workerType: String) {
        cdkBuilder.workerType(workerType)
    }

    public fun build(): CfnJob = cdkBuilder.build()
}
