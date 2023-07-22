@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnTask
import software.constructs.Construct

/**
 * The `AWS::DataSync::Task` resource specifies a task.
 *
 * A task is a set of two locations (source and destination) and a set of `Options` that you use to
 * control the behavior of a task. If you don't specify `Options` when you create a task, AWS DataSync
 * populates them with service defaults.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * CfnTask cfnTask = CfnTask.Builder.create(this, "MyCfnTask")
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html)
 */
@CdkDslMarker
public class CfnTaskDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTask.Builder = CfnTask.Builder.create(scope, id)

  private val _excludes: MutableList<Any> = mutableListOf()

  private val _includes: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that is used to monitor and
   * log events in the task.
   *
   * For more information about how to use CloudWatch Logs with DataSync, see [Monitoring Your
   * Task](https://docs.aws.amazon.com/datasync/latest/userguide/monitor-datasync.html#cloudwatchlogs)
   * in the *AWS DataSync User Guide.*
   *
   * For more information about these groups, see [Working with Log Groups and Log
   * Streams](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html)
   * in the *Amazon CloudWatch Logs User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-cloudwatchloggrouparn)
   * @param cloudWatchLogGroupArn The Amazon Resource Name (ARN) of the Amazon CloudWatch log group
   * that is used to monitor and log events in the task. 
   */
  public fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String) {
    cdkBuilder.cloudWatchLogGroupArn(cloudWatchLogGroupArn)
  }

  /**
   * The Amazon Resource Name (ARN) of an AWS storage resource's location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-destinationlocationarn)
   * @param destinationLocationArn The Amazon Resource Name (ARN) of an AWS storage resource's
   * location. 
   */
  public fun destinationLocationArn(destinationLocationArn: String) {
    cdkBuilder.destinationLocationArn(destinationLocationArn)
  }

  /**
   * Specifies a list of filter rules that exclude specific data during your transfer.
   *
   * For more information and examples, see [Filtering data transferred by
   * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-excludes)
   * @param excludes Specifies a list of filter rules that exclude specific data during your
   * transfer. 
   */
  public fun excludes(vararg excludes: Any) {
    _excludes.addAll(listOf(*excludes))
  }

  /**
   * Specifies a list of filter rules that exclude specific data during your transfer.
   *
   * For more information and examples, see [Filtering data transferred by
   * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-excludes)
   * @param excludes Specifies a list of filter rules that exclude specific data during your
   * transfer. 
   */
  public fun excludes(excludes: Collection<Any>) {
    _excludes.addAll(excludes)
  }

  /**
   * Specifies a list of filter rules that exclude specific data during your transfer.
   *
   * For more information and examples, see [Filtering data transferred by
   * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-excludes)
   * @param excludes Specifies a list of filter rules that exclude specific data during your
   * transfer. 
   */
  public fun excludes(excludes: IResolvable) {
    cdkBuilder.excludes(excludes)
  }

  /**
   * Specifies a list of filter rules that include specific data during your transfer.
   *
   * For more information and examples, see [Filtering data transferred by
   * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-includes)
   * @param includes Specifies a list of filter rules that include specific data during your
   * transfer. 
   */
  public fun includes(vararg includes: Any) {
    _includes.addAll(listOf(*includes))
  }

  /**
   * Specifies a list of filter rules that include specific data during your transfer.
   *
   * For more information and examples, see [Filtering data transferred by
   * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-includes)
   * @param includes Specifies a list of filter rules that include specific data during your
   * transfer. 
   */
  public fun includes(includes: Collection<Any>) {
    _includes.addAll(includes)
  }

  /**
   * Specifies a list of filter rules that include specific data during your transfer.
   *
   * For more information and examples, see [Filtering data transferred by
   * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-includes)
   * @param includes Specifies a list of filter rules that include specific data during your
   * transfer. 
   */
  public fun includes(includes: IResolvable) {
    cdkBuilder.includes(includes)
  }

  /**
   * The name of a task.
   *
   * This value is a text reference that is used to identify the task in the console.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-name)
   * @param name The name of a task. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * Specifies the configuration options for a task. Some options include preserving file or object
   * metadata and verifying data integrity.
   *
   * You can also override these options before starting an individual run of a task (also known as
   * a *task execution* ). For more information, see
   * [StartTaskExecution](https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-options)
   * @param options Specifies the configuration options for a task. Some options include preserving
   * file or object metadata and verifying data integrity. 
   */
  public fun options(options: IResolvable) {
    cdkBuilder.options(options)
  }

  /**
   * Specifies the configuration options for a task. Some options include preserving file or object
   * metadata and verifying data integrity.
   *
   * You can also override these options before starting an individual run of a task (also known as
   * a *task execution* ). For more information, see
   * [StartTaskExecution](https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-options)
   * @param options Specifies the configuration options for a task. Some options include preserving
   * file or object metadata and verifying data integrity. 
   */
  public fun options(options: CfnTask.OptionsProperty) {
    cdkBuilder.options(options)
  }

  /**
   * Specifies a schedule used to periodically transfer files from a source to a destination
   * location.
   *
   * The schedule should be specified in UTC time. For more information, see [Scheduling your
   * task](https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-schedule)
   * @param schedule Specifies a schedule used to periodically transfer files from a source to a
   * destination location. 
   */
  public fun schedule(schedule: IResolvable) {
    cdkBuilder.schedule(schedule)
  }

  /**
   * Specifies a schedule used to periodically transfer files from a source to a destination
   * location.
   *
   * The schedule should be specified in UTC time. For more information, see [Scheduling your
   * task](https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-schedule)
   * @param schedule Specifies a schedule used to periodically transfer files from a source to a
   * destination location. 
   */
  public fun schedule(schedule: CfnTask.TaskScheduleProperty) {
    cdkBuilder.schedule(schedule)
  }

  /**
   * The Amazon Resource Name (ARN) of the source location for the task.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-sourcelocationarn)
   * @param sourceLocationArn The Amazon Resource Name (ARN) of the source location for the task. 
   */
  public fun sourceLocationArn(sourceLocationArn: String) {
    cdkBuilder.sourceLocationArn(sourceLocationArn)
  }

  /**
   * Specifies the tags that you want to apply to the Amazon Resource Name (ARN) representing the
   * task.
   *
   * *Tags* are key-value pairs that help you manage, filter, and search for your DataSync
   * resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-tags)
   * @param tags Specifies the tags that you want to apply to the Amazon Resource Name (ARN)
   * representing the task. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Specifies the tags that you want to apply to the Amazon Resource Name (ARN) representing the
   * task.
   *
   * *Tags* are key-value pairs that help you manage, filter, and search for your DataSync
   * resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-tags)
   * @param tags Specifies the tags that you want to apply to the Amazon Resource Name (ARN)
   * representing the task. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnTask {
    if(_excludes.isNotEmpty()) cdkBuilder.excludes(_excludes)
    if(_includes.isNotEmpty()) cdkBuilder.includes(_includes)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
