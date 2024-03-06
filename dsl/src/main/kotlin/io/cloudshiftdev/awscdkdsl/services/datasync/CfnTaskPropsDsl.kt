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

package io.cloudshiftdev.awscdkdsl.services.datasync

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnTask
import software.amazon.awscdk.services.datasync.CfnTaskProps

/**
 * Properties for defining a `CfnTask`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * CfnTaskProps cfnTaskProps = CfnTaskProps.builder()
 * .destinationLocationArn("destinationLocationArn")
 * .sourceLocationArn("sourceLocationArn")
 * // the properties below are optional
 * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
 * .excludes(List.of(FilterRuleProperty.builder()
 * .filterType("filterType")
 * .value("value")
 * .build()))
 * .includes(List.of(FilterRuleProperty.builder()
 * .filterType("filterType")
 * .value("value")
 * .build()))
 * .name("name")
 * .options(OptionsProperty.builder()
 * .atime("atime")
 * .bytesPerSecond(123)
 * .gid("gid")
 * .logLevel("logLevel")
 * .mtime("mtime")
 * .objectTags("objectTags")
 * .overwriteMode("overwriteMode")
 * .posixPermissions("posixPermissions")
 * .preserveDeletedFiles("preserveDeletedFiles")
 * .preserveDevices("preserveDevices")
 * .securityDescriptorCopyFlags("securityDescriptorCopyFlags")
 * .taskQueueing("taskQueueing")
 * .transferMode("transferMode")
 * .uid("uid")
 * .verifyMode("verifyMode")
 * .build())
 * .schedule(TaskScheduleProperty.builder()
 * .scheduleExpression("scheduleExpression")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .taskReportConfig(TaskReportConfigProperty.builder()
 * .destination(DestinationProperty.builder()
 * .s3(S3Property.builder()
 * .bucketAccessRoleArn("bucketAccessRoleArn")
 * .s3BucketArn("s3BucketArn")
 * .subdirectory("subdirectory")
 * .build())
 * .build())
 * .outputType("outputType")
 * // the properties below are optional
 * .objectVersionIds("objectVersionIds")
 * .overrides(OverridesProperty.builder()
 * .deleted(DeletedProperty.builder()
 * .reportLevel("reportLevel")
 * .build())
 * .skipped(SkippedProperty.builder()
 * .reportLevel("reportLevel")
 * .build())
 * .transferred(TransferredProperty.builder()
 * .reportLevel("reportLevel")
 * .build())
 * .verified(VerifiedProperty.builder()
 * .reportLevel("reportLevel")
 * .build())
 * .build())
 * .reportLevel("reportLevel")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html)
 */
@CdkDslMarker
public class CfnTaskPropsDsl {
    private val cdkBuilder: CfnTaskProps.Builder = CfnTaskProps.builder()

    private val _excludes: MutableList<Any> = mutableListOf()

    private val _includes: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param cloudWatchLogGroupArn The Amazon Resource Name (ARN) of the Amazon CloudWatch log
     *   group that is used to monitor and log events in the task. For more information about how to
     *   use CloudWatch Logs with DataSync, see
     *   [Monitoring Your Task](https://docs.aws.amazon.com/datasync/latest/userguide/monitor-datasync.html#cloudwatchlogs)
     *   in the *AWS DataSync User Guide.*
     *
     * For more information about these groups, see
     * [Working with Log Groups and Log Streams](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html)
     * in the *Amazon CloudWatch Logs User Guide* .
     */
    public fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String) {
        cdkBuilder.cloudWatchLogGroupArn(cloudWatchLogGroupArn)
    }

    /**
     * @param destinationLocationArn The Amazon Resource Name (ARN) of an AWS storage resource's
     *   location.
     */
    public fun destinationLocationArn(destinationLocationArn: String) {
        cdkBuilder.destinationLocationArn(destinationLocationArn)
    }

    /**
     * @param excludes Specifies a list of filter rules that exclude specific data during your
     *   transfer. For more information and examples, see
     *   [Filtering data transferred by DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html)
     *   .
     */
    public fun excludes(vararg excludes: Any) {
        _excludes.addAll(listOf(*excludes))
    }

    /**
     * @param excludes Specifies a list of filter rules that exclude specific data during your
     *   transfer. For more information and examples, see
     *   [Filtering data transferred by DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html)
     *   .
     */
    public fun excludes(excludes: Collection<Any>) {
        _excludes.addAll(excludes)
    }

    /**
     * @param excludes Specifies a list of filter rules that exclude specific data during your
     *   transfer. For more information and examples, see
     *   [Filtering data transferred by DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html)
     *   .
     */
    public fun excludes(excludes: IResolvable) {
        cdkBuilder.excludes(excludes)
    }

    /**
     * @param includes Specifies a list of filter rules that include specific data during your
     *   transfer. For more information and examples, see
     *   [Filtering data transferred by DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html)
     *   .
     */
    public fun includes(vararg includes: Any) {
        _includes.addAll(listOf(*includes))
    }

    /**
     * @param includes Specifies a list of filter rules that include specific data during your
     *   transfer. For more information and examples, see
     *   [Filtering data transferred by DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html)
     *   .
     */
    public fun includes(includes: Collection<Any>) {
        _includes.addAll(includes)
    }

    /**
     * @param includes Specifies a list of filter rules that include specific data during your
     *   transfer. For more information and examples, see
     *   [Filtering data transferred by DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html)
     *   .
     */
    public fun includes(includes: IResolvable) {
        cdkBuilder.includes(includes)
    }

    /**
     * @param name The name of a task. This value is a text reference that is used to identify the
     *   task in the console.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param options Specifies the configuration options for a task. Some options include
     *   preserving file or object metadata and verifying data integrity. You can also override
     *   these options before starting an individual run of a task (also known as a *task execution*
     *   ). For more information, see
     *   [StartTaskExecution](https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html)
     *   .
     */
    public fun options(options: IResolvable) {
        cdkBuilder.options(options)
    }

    /**
     * @param options Specifies the configuration options for a task. Some options include
     *   preserving file or object metadata and verifying data integrity. You can also override
     *   these options before starting an individual run of a task (also known as a *task execution*
     *   ). For more information, see
     *   [StartTaskExecution](https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html)
     *   .
     */
    public fun options(options: CfnTask.OptionsProperty) {
        cdkBuilder.options(options)
    }

    /**
     * @param schedule Specifies a schedule used to periodically transfer files from a source to a
     *   destination location. The schedule should be specified in UTC time. For more information,
     *   see
     *   [Scheduling your task](https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html)
     *   .
     */
    public fun schedule(schedule: IResolvable) {
        cdkBuilder.schedule(schedule)
    }

    /**
     * @param schedule Specifies a schedule used to periodically transfer files from a source to a
     *   destination location. The schedule should be specified in UTC time. For more information,
     *   see
     *   [Scheduling your task](https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html)
     *   .
     */
    public fun schedule(schedule: CfnTask.TaskScheduleProperty) {
        cdkBuilder.schedule(schedule)
    }

    /**
     * @param sourceLocationArn The Amazon Resource Name (ARN) of the source location for the task.
     */
    public fun sourceLocationArn(sourceLocationArn: String) {
        cdkBuilder.sourceLocationArn(sourceLocationArn)
    }

    /**
     * @param tags Specifies the tags that you want to apply to the Amazon Resource Name (ARN)
     *   representing the task. *Tags* are key-value pairs that help you manage, filter, and search
     *   for your DataSync resources.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Specifies the tags that you want to apply to the Amazon Resource Name (ARN)
     *   representing the task. *Tags* are key-value pairs that help you manage, filter, and search
     *   for your DataSync resources.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param taskReportConfig Specifies how you want to configure a task report, which provides
     *   detailed information about your DataSync transfer. For more information, see
     *   [Monitoring your DataSync transfers with task reports](https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html)
     *   .
     *
     * When using this parameter, your caller identity (the role that you're using DataSync with)
     * must have the `iam:PassRole` permission. The
     * [AWSDataSyncFullAccess](https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess)
     * policy includes this permission.
     */
    public fun taskReportConfig(taskReportConfig: IResolvable) {
        cdkBuilder.taskReportConfig(taskReportConfig)
    }

    /**
     * @param taskReportConfig Specifies how you want to configure a task report, which provides
     *   detailed information about your DataSync transfer. For more information, see
     *   [Monitoring your DataSync transfers with task reports](https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html)
     *   .
     *
     * When using this parameter, your caller identity (the role that you're using DataSync with)
     * must have the `iam:PassRole` permission. The
     * [AWSDataSyncFullAccess](https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess)
     * policy includes this permission.
     */
    public fun taskReportConfig(taskReportConfig: CfnTask.TaskReportConfigProperty) {
        cdkBuilder.taskReportConfig(taskReportConfig)
    }

    public fun build(): CfnTaskProps {
        if (_excludes.isNotEmpty()) cdkBuilder.excludes(_excludes)
        if (_includes.isNotEmpty()) cdkBuilder.includes(_includes)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
