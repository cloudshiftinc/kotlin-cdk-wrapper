@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnTask`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datasync.*;
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
 * .manifestConfig(ManifestConfigProperty.builder()
 * .source(SourceProperty.builder()
 * .s3(ManifestConfigSourceS3Property.builder()
 * .bucketAccessRoleArn("bucketAccessRoleArn")
 * .manifestObjectPath("manifestObjectPath")
 * .manifestObjectVersionId("manifestObjectVersionId")
 * .s3BucketArn("s3BucketArn")
 * .build())
 * .build())
 * // the properties below are optional
 * .action("action")
 * .format("format")
 * .build())
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
public interface CfnTaskProps {
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
   */
  public fun cloudWatchLogGroupArn(): String? = unwrap(this).getCloudWatchLogGroupArn()

  /**
   * The Amazon Resource Name (ARN) of an AWS storage resource's location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-destinationlocationarn)
   */
  public fun destinationLocationArn(): String

  /**
   * Specifies a list of filter rules that exclude specific data during your transfer.
   *
   * For more information and examples, see [Filtering data transferred by
   * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-excludes)
   */
  public fun excludes(): Any? = unwrap(this).getExcludes()

  /**
   * Specifies a list of filter rules that include specific data during your transfer.
   *
   * For more information and examples, see [Filtering data transferred by
   * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-includes)
   */
  public fun includes(): Any? = unwrap(this).getIncludes()

  /**
   * The configuration of the manifest that lists the files or objects to transfer.
   *
   * For more information, see [Specifying what DataSync transfers by using a
   * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-manifestconfig)
   */
  public fun manifestConfig(): Any? = unwrap(this).getManifestConfig()

  /**
   * The name of a task.
   *
   * This value is a text reference that is used to identify the task in the console.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-name)
   */
  public fun name(): String? = unwrap(this).getName()

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
   */
  public fun options(): Any? = unwrap(this).getOptions()

  /**
   * Specifies a schedule used to periodically transfer files from a source to a destination
   * location.
   *
   * The schedule should be specified in UTC time. For more information, see [Scheduling your
   * task](https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-schedule)
   */
  public fun schedule(): Any? = unwrap(this).getSchedule()

  /**
   * The Amazon Resource Name (ARN) of the source location for the task.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-sourcelocationarn)
   */
  public fun sourceLocationArn(): String

  /**
   * Specifies the tags that you want to apply to the Amazon Resource Name (ARN) representing the
   * task.
   *
   * *Tags* are key-value pairs that help you manage, filter, and search for your DataSync
   * resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Specifies how you want to configure a task report, which provides detailed information about
   * your DataSync transfer.
   *
   * For more information, see [Monitoring your DataSync transfers with task
   * reports](https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html) .
   *
   * When using this parameter, your caller identity (the role that you're using DataSync with) must
   * have the `iam:PassRole` permission. The
   * [AWSDataSyncFullAccess](https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess)
   * policy includes this permission.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-taskreportconfig)
   */
  public fun taskReportConfig(): Any? = unwrap(this).getTaskReportConfig()

  /**
   * A builder for [CfnTaskProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cloudWatchLogGroupArn The Amazon Resource Name (ARN) of the Amazon CloudWatch log
     * group that is used to monitor and log events in the task.
     * For more information about how to use CloudWatch Logs with DataSync, see [Monitoring Your
     * Task](https://docs.aws.amazon.com/datasync/latest/userguide/monitor-datasync.html#cloudwatchlogs)
     * in the *AWS DataSync User Guide.*
     *
     * For more information about these groups, see [Working with Log Groups and Log
     * Streams](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html)
     * in the *Amazon CloudWatch Logs User Guide* .
     */
    public fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String)

    /**
     * @param destinationLocationArn The Amazon Resource Name (ARN) of an AWS storage resource's
     * location. 
     */
    public fun destinationLocationArn(destinationLocationArn: String)

    /**
     * @param excludes Specifies a list of filter rules that exclude specific data during your
     * transfer.
     * For more information and examples, see [Filtering data transferred by
     * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
     */
    public fun excludes(excludes: IResolvable)

    /**
     * @param excludes Specifies a list of filter rules that exclude specific data during your
     * transfer.
     * For more information and examples, see [Filtering data transferred by
     * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
     */
    public fun excludes(excludes: List<Any>)

    /**
     * @param excludes Specifies a list of filter rules that exclude specific data during your
     * transfer.
     * For more information and examples, see [Filtering data transferred by
     * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
     */
    public fun excludes(vararg excludes: Any)

    /**
     * @param includes Specifies a list of filter rules that include specific data during your
     * transfer.
     * For more information and examples, see [Filtering data transferred by
     * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
     */
    public fun includes(includes: IResolvable)

    /**
     * @param includes Specifies a list of filter rules that include specific data during your
     * transfer.
     * For more information and examples, see [Filtering data transferred by
     * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
     */
    public fun includes(includes: List<Any>)

    /**
     * @param includes Specifies a list of filter rules that include specific data during your
     * transfer.
     * For more information and examples, see [Filtering data transferred by
     * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
     */
    public fun includes(vararg includes: Any)

    /**
     * @param manifestConfig The configuration of the manifest that lists the files or objects to
     * transfer.
     * For more information, see [Specifying what DataSync transfers by using a
     * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html)
     * .
     */
    public fun manifestConfig(manifestConfig: IResolvable)

    /**
     * @param manifestConfig The configuration of the manifest that lists the files or objects to
     * transfer.
     * For more information, see [Specifying what DataSync transfers by using a
     * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html)
     * .
     */
    public fun manifestConfig(manifestConfig: CfnTask.ManifestConfigProperty)

    /**
     * @param manifestConfig The configuration of the manifest that lists the files or objects to
     * transfer.
     * For more information, see [Specifying what DataSync transfers by using a
     * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec8c77e6c6dfdb2c9cf682f7b4f269325702ad0aed75a50819a625d846d9ed6b")
    public fun manifestConfig(manifestConfig: CfnTask.ManifestConfigProperty.Builder.() -> Unit)

    /**
     * @param name The name of a task.
     * This value is a text reference that is used to identify the task in the console.
     */
    public fun name(name: String)

    /**
     * @param options Specifies the configuration options for a task. Some options include
     * preserving file or object metadata and verifying data integrity.
     * You can also override these options before starting an individual run of a task (also known
     * as a *task execution* ). For more information, see
     * [StartTaskExecution](https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html)
     * .
     */
    public fun options(options: IResolvable)

    /**
     * @param options Specifies the configuration options for a task. Some options include
     * preserving file or object metadata and verifying data integrity.
     * You can also override these options before starting an individual run of a task (also known
     * as a *task execution* ). For more information, see
     * [StartTaskExecution](https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html)
     * .
     */
    public fun options(options: CfnTask.OptionsProperty)

    /**
     * @param options Specifies the configuration options for a task. Some options include
     * preserving file or object metadata and verifying data integrity.
     * You can also override these options before starting an individual run of a task (also known
     * as a *task execution* ). For more information, see
     * [StartTaskExecution](https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1abaf271dd52396527a8a77c9fdad5bc3db1d413aea3a94f2532b919def4e4fc")
    public fun options(options: CfnTask.OptionsProperty.Builder.() -> Unit)

    /**
     * @param schedule Specifies a schedule used to periodically transfer files from a source to a
     * destination location.
     * The schedule should be specified in UTC time. For more information, see [Scheduling your
     * task](https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html) .
     */
    public fun schedule(schedule: IResolvable)

    /**
     * @param schedule Specifies a schedule used to periodically transfer files from a source to a
     * destination location.
     * The schedule should be specified in UTC time. For more information, see [Scheduling your
     * task](https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html) .
     */
    public fun schedule(schedule: CfnTask.TaskScheduleProperty)

    /**
     * @param schedule Specifies a schedule used to periodically transfer files from a source to a
     * destination location.
     * The schedule should be specified in UTC time. For more information, see [Scheduling your
     * task](https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0169cab530a382b35b03f2071af7adf6d987732207f0c711c7d71b861cec8fd")
    public fun schedule(schedule: CfnTask.TaskScheduleProperty.Builder.() -> Unit)

    /**
     * @param sourceLocationArn The Amazon Resource Name (ARN) of the source location for the task. 
     */
    public fun sourceLocationArn(sourceLocationArn: String)

    /**
     * @param tags Specifies the tags that you want to apply to the Amazon Resource Name (ARN)
     * representing the task.
     * *Tags* are key-value pairs that help you manage, filter, and search for your DataSync
     * resources.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Specifies the tags that you want to apply to the Amazon Resource Name (ARN)
     * representing the task.
     * *Tags* are key-value pairs that help you manage, filter, and search for your DataSync
     * resources.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param taskReportConfig Specifies how you want to configure a task report, which provides
     * detailed information about your DataSync transfer.
     * For more information, see [Monitoring your DataSync transfers with task
     * reports](https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html) .
     *
     * When using this parameter, your caller identity (the role that you're using DataSync with)
     * must have the `iam:PassRole` permission. The
     * [AWSDataSyncFullAccess](https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess)
     * policy includes this permission.
     */
    public fun taskReportConfig(taskReportConfig: IResolvable)

    /**
     * @param taskReportConfig Specifies how you want to configure a task report, which provides
     * detailed information about your DataSync transfer.
     * For more information, see [Monitoring your DataSync transfers with task
     * reports](https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html) .
     *
     * When using this parameter, your caller identity (the role that you're using DataSync with)
     * must have the `iam:PassRole` permission. The
     * [AWSDataSyncFullAccess](https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess)
     * policy includes this permission.
     */
    public fun taskReportConfig(taskReportConfig: CfnTask.TaskReportConfigProperty)

    /**
     * @param taskReportConfig Specifies how you want to configure a task report, which provides
     * detailed information about your DataSync transfer.
     * For more information, see [Monitoring your DataSync transfers with task
     * reports](https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html) .
     *
     * When using this parameter, your caller identity (the role that you're using DataSync with)
     * must have the `iam:PassRole` permission. The
     * [AWSDataSyncFullAccess](https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess)
     * policy includes this permission.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6e79cf2a5c9ab4868b668a0c4a6cfc11bdbda75a184e0540286ff4d950747b38")
    public
        fun taskReportConfig(taskReportConfig: CfnTask.TaskReportConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnTaskProps.Builder =
        software.amazon.awscdk.services.datasync.CfnTaskProps.builder()

    /**
     * @param cloudWatchLogGroupArn The Amazon Resource Name (ARN) of the Amazon CloudWatch log
     * group that is used to monitor and log events in the task.
     * For more information about how to use CloudWatch Logs with DataSync, see [Monitoring Your
     * Task](https://docs.aws.amazon.com/datasync/latest/userguide/monitor-datasync.html#cloudwatchlogs)
     * in the *AWS DataSync User Guide.*
     *
     * For more information about these groups, see [Working with Log Groups and Log
     * Streams](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html)
     * in the *Amazon CloudWatch Logs User Guide* .
     */
    override fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String) {
      cdkBuilder.cloudWatchLogGroupArn(cloudWatchLogGroupArn)
    }

    /**
     * @param destinationLocationArn The Amazon Resource Name (ARN) of an AWS storage resource's
     * location. 
     */
    override fun destinationLocationArn(destinationLocationArn: String) {
      cdkBuilder.destinationLocationArn(destinationLocationArn)
    }

    /**
     * @param excludes Specifies a list of filter rules that exclude specific data during your
     * transfer.
     * For more information and examples, see [Filtering data transferred by
     * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
     */
    override fun excludes(excludes: IResolvable) {
      cdkBuilder.excludes(excludes.let(IResolvable::unwrap))
    }

    /**
     * @param excludes Specifies a list of filter rules that exclude specific data during your
     * transfer.
     * For more information and examples, see [Filtering data transferred by
     * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
     */
    override fun excludes(excludes: List<Any>) {
      cdkBuilder.excludes(excludes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param excludes Specifies a list of filter rules that exclude specific data during your
     * transfer.
     * For more information and examples, see [Filtering data transferred by
     * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
     */
    override fun excludes(vararg excludes: Any): Unit = excludes(excludes.toList())

    /**
     * @param includes Specifies a list of filter rules that include specific data during your
     * transfer.
     * For more information and examples, see [Filtering data transferred by
     * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
     */
    override fun includes(includes: IResolvable) {
      cdkBuilder.includes(includes.let(IResolvable::unwrap))
    }

    /**
     * @param includes Specifies a list of filter rules that include specific data during your
     * transfer.
     * For more information and examples, see [Filtering data transferred by
     * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
     */
    override fun includes(includes: List<Any>) {
      cdkBuilder.includes(includes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param includes Specifies a list of filter rules that include specific data during your
     * transfer.
     * For more information and examples, see [Filtering data transferred by
     * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
     */
    override fun includes(vararg includes: Any): Unit = includes(includes.toList())

    /**
     * @param manifestConfig The configuration of the manifest that lists the files or objects to
     * transfer.
     * For more information, see [Specifying what DataSync transfers by using a
     * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html)
     * .
     */
    override fun manifestConfig(manifestConfig: IResolvable) {
      cdkBuilder.manifestConfig(manifestConfig.let(IResolvable::unwrap))
    }

    /**
     * @param manifestConfig The configuration of the manifest that lists the files or objects to
     * transfer.
     * For more information, see [Specifying what DataSync transfers by using a
     * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html)
     * .
     */
    override fun manifestConfig(manifestConfig: CfnTask.ManifestConfigProperty) {
      cdkBuilder.manifestConfig(manifestConfig.let(CfnTask.ManifestConfigProperty::unwrap))
    }

    /**
     * @param manifestConfig The configuration of the manifest that lists the files or objects to
     * transfer.
     * For more information, see [Specifying what DataSync transfers by using a
     * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec8c77e6c6dfdb2c9cf682f7b4f269325702ad0aed75a50819a625d846d9ed6b")
    override fun manifestConfig(manifestConfig: CfnTask.ManifestConfigProperty.Builder.() -> Unit):
        Unit = manifestConfig(CfnTask.ManifestConfigProperty(manifestConfig))

    /**
     * @param name The name of a task.
     * This value is a text reference that is used to identify the task in the console.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param options Specifies the configuration options for a task. Some options include
     * preserving file or object metadata and verifying data integrity.
     * You can also override these options before starting an individual run of a task (also known
     * as a *task execution* ). For more information, see
     * [StartTaskExecution](https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html)
     * .
     */
    override fun options(options: IResolvable) {
      cdkBuilder.options(options.let(IResolvable::unwrap))
    }

    /**
     * @param options Specifies the configuration options for a task. Some options include
     * preserving file or object metadata and verifying data integrity.
     * You can also override these options before starting an individual run of a task (also known
     * as a *task execution* ). For more information, see
     * [StartTaskExecution](https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html)
     * .
     */
    override fun options(options: CfnTask.OptionsProperty) {
      cdkBuilder.options(options.let(CfnTask.OptionsProperty::unwrap))
    }

    /**
     * @param options Specifies the configuration options for a task. Some options include
     * preserving file or object metadata and verifying data integrity.
     * You can also override these options before starting an individual run of a task (also known
     * as a *task execution* ). For more information, see
     * [StartTaskExecution](https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1abaf271dd52396527a8a77c9fdad5bc3db1d413aea3a94f2532b919def4e4fc")
    override fun options(options: CfnTask.OptionsProperty.Builder.() -> Unit): Unit =
        options(CfnTask.OptionsProperty(options))

    /**
     * @param schedule Specifies a schedule used to periodically transfer files from a source to a
     * destination location.
     * The schedule should be specified in UTC time. For more information, see [Scheduling your
     * task](https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html) .
     */
    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    /**
     * @param schedule Specifies a schedule used to periodically transfer files from a source to a
     * destination location.
     * The schedule should be specified in UTC time. For more information, see [Scheduling your
     * task](https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html) .
     */
    override fun schedule(schedule: CfnTask.TaskScheduleProperty) {
      cdkBuilder.schedule(schedule.let(CfnTask.TaskScheduleProperty::unwrap))
    }

    /**
     * @param schedule Specifies a schedule used to periodically transfer files from a source to a
     * destination location.
     * The schedule should be specified in UTC time. For more information, see [Scheduling your
     * task](https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0169cab530a382b35b03f2071af7adf6d987732207f0c711c7d71b861cec8fd")
    override fun schedule(schedule: CfnTask.TaskScheduleProperty.Builder.() -> Unit): Unit =
        schedule(CfnTask.TaskScheduleProperty(schedule))

    /**
     * @param sourceLocationArn The Amazon Resource Name (ARN) of the source location for the task. 
     */
    override fun sourceLocationArn(sourceLocationArn: String) {
      cdkBuilder.sourceLocationArn(sourceLocationArn)
    }

    /**
     * @param tags Specifies the tags that you want to apply to the Amazon Resource Name (ARN)
     * representing the task.
     * *Tags* are key-value pairs that help you manage, filter, and search for your DataSync
     * resources.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Specifies the tags that you want to apply to the Amazon Resource Name (ARN)
     * representing the task.
     * *Tags* are key-value pairs that help you manage, filter, and search for your DataSync
     * resources.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param taskReportConfig Specifies how you want to configure a task report, which provides
     * detailed information about your DataSync transfer.
     * For more information, see [Monitoring your DataSync transfers with task
     * reports](https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html) .
     *
     * When using this parameter, your caller identity (the role that you're using DataSync with)
     * must have the `iam:PassRole` permission. The
     * [AWSDataSyncFullAccess](https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess)
     * policy includes this permission.
     */
    override fun taskReportConfig(taskReportConfig: IResolvable) {
      cdkBuilder.taskReportConfig(taskReportConfig.let(IResolvable::unwrap))
    }

    /**
     * @param taskReportConfig Specifies how you want to configure a task report, which provides
     * detailed information about your DataSync transfer.
     * For more information, see [Monitoring your DataSync transfers with task
     * reports](https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html) .
     *
     * When using this parameter, your caller identity (the role that you're using DataSync with)
     * must have the `iam:PassRole` permission. The
     * [AWSDataSyncFullAccess](https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess)
     * policy includes this permission.
     */
    override fun taskReportConfig(taskReportConfig: CfnTask.TaskReportConfigProperty) {
      cdkBuilder.taskReportConfig(taskReportConfig.let(CfnTask.TaskReportConfigProperty::unwrap))
    }

    /**
     * @param taskReportConfig Specifies how you want to configure a task report, which provides
     * detailed information about your DataSync transfer.
     * For more information, see [Monitoring your DataSync transfers with task
     * reports](https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html) .
     *
     * When using this parameter, your caller identity (the role that you're using DataSync with)
     * must have the `iam:PassRole` permission. The
     * [AWSDataSyncFullAccess](https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess)
     * policy includes this permission.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6e79cf2a5c9ab4868b668a0c4a6cfc11bdbda75a184e0540286ff4d950747b38")
    override
        fun taskReportConfig(taskReportConfig: CfnTask.TaskReportConfigProperty.Builder.() -> Unit):
        Unit = taskReportConfig(CfnTask.TaskReportConfigProperty(taskReportConfig))

    public fun build(): software.amazon.awscdk.services.datasync.CfnTaskProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.datasync.CfnTaskProps,
  ) : CdkObject(cdkObject), CfnTaskProps {
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
     */
    override fun cloudWatchLogGroupArn(): String? = unwrap(this).getCloudWatchLogGroupArn()

    /**
     * The Amazon Resource Name (ARN) of an AWS storage resource's location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-destinationlocationarn)
     */
    override fun destinationLocationArn(): String = unwrap(this).getDestinationLocationArn()

    /**
     * Specifies a list of filter rules that exclude specific data during your transfer.
     *
     * For more information and examples, see [Filtering data transferred by
     * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-excludes)
     */
    override fun excludes(): Any? = unwrap(this).getExcludes()

    /**
     * Specifies a list of filter rules that include specific data during your transfer.
     *
     * For more information and examples, see [Filtering data transferred by
     * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-includes)
     */
    override fun includes(): Any? = unwrap(this).getIncludes()

    /**
     * The configuration of the manifest that lists the files or objects to transfer.
     *
     * For more information, see [Specifying what DataSync transfers by using a
     * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-manifestconfig)
     */
    override fun manifestConfig(): Any? = unwrap(this).getManifestConfig()

    /**
     * The name of a task.
     *
     * This value is a text reference that is used to identify the task in the console.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * Specifies the configuration options for a task. Some options include preserving file or
     * object metadata and verifying data integrity.
     *
     * You can also override these options before starting an individual run of a task (also known
     * as a *task execution* ). For more information, see
     * [StartTaskExecution](https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-options)
     */
    override fun options(): Any? = unwrap(this).getOptions()

    /**
     * Specifies a schedule used to periodically transfer files from a source to a destination
     * location.
     *
     * The schedule should be specified in UTC time. For more information, see [Scheduling your
     * task](https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-schedule)
     */
    override fun schedule(): Any? = unwrap(this).getSchedule()

    /**
     * The Amazon Resource Name (ARN) of the source location for the task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-sourcelocationarn)
     */
    override fun sourceLocationArn(): String = unwrap(this).getSourceLocationArn()

    /**
     * Specifies the tags that you want to apply to the Amazon Resource Name (ARN) representing the
     * task.
     *
     * *Tags* are key-value pairs that help you manage, filter, and search for your DataSync
     * resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Specifies how you want to configure a task report, which provides detailed information about
     * your DataSync transfer.
     *
     * For more information, see [Monitoring your DataSync transfers with task
     * reports](https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html) .
     *
     * When using this parameter, your caller identity (the role that you're using DataSync with)
     * must have the `iam:PassRole` permission. The
     * [AWSDataSyncFullAccess](https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess)
     * policy includes this permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-taskreportconfig)
     */
    override fun taskReportConfig(): Any? = unwrap(this).getTaskReportConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTaskProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnTaskProps):
        CfnTaskProps = CdkObjectWrappers.wrap(cdkObject) as? CfnTaskProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTaskProps):
        software.amazon.awscdk.services.datasync.CfnTaskProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.datasync.CfnTaskProps
  }
}
