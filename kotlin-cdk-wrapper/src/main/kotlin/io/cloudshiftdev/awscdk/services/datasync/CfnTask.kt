@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
 * import io.cloudshiftdev.awscdk.services.datasync.*;
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
 * .status("status")
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
public open class CfnTask(
  cdkObject: software.amazon.awscdk.services.datasync.CfnTask,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTaskProps,
  ) :
      this(software.amazon.awscdk.services.datasync.CfnTask(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnTaskProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTaskProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTaskProps(props)
  )

  /**
   * The ARNs of the destination elastic network interfaces (ENIs) that were created for your
   * subnet.
   */
  public open fun attrDestinationNetworkInterfaceArns(): List<String> =
      unwrap(this).getAttrDestinationNetworkInterfaceArns()

  /**
   * The ARNs of the source ENIs that were created for your subnet.
   */
  public open fun attrSourceNetworkInterfaceArns(): List<String> =
      unwrap(this).getAttrSourceNetworkInterfaceArns()

  /**
   * The status of the task that was described.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The ARN of the task.
   */
  public open fun attrTaskArn(): String = unwrap(this).getAttrTaskArn()

  /**
   * Specifies the Amazon Resource Name (ARN) of an Amazon CloudWatch log group for monitoring your
   * task.
   */
  public open fun cloudWatchLogGroupArn(): String? = unwrap(this).getCloudWatchLogGroupArn()

  /**
   * Specifies the Amazon Resource Name (ARN) of an Amazon CloudWatch log group for monitoring your
   * task.
   */
  public open fun cloudWatchLogGroupArn(`value`: String) {
    unwrap(this).setCloudWatchLogGroupArn(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of an AWS storage resource's location.
   */
  public open fun destinationLocationArn(): String = unwrap(this).getDestinationLocationArn()

  /**
   * The Amazon Resource Name (ARN) of an AWS storage resource's location.
   */
  public open fun destinationLocationArn(`value`: String) {
    unwrap(this).setDestinationLocationArn(`value`)
  }

  /**
   * Specifies exclude filters that define the files, objects, and folders in your source location
   * that you don't want DataSync to transfer.
   */
  public open fun excludes(): Any? = unwrap(this).getExcludes()

  /**
   * Specifies exclude filters that define the files, objects, and folders in your source location
   * that you don't want DataSync to transfer.
   */
  public open fun excludes(`value`: IResolvable) {
    unwrap(this).setExcludes(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies exclude filters that define the files, objects, and folders in your source location
   * that you don't want DataSync to transfer.
   */
  public open fun excludes(`value`: List<Any>) {
    unwrap(this).setExcludes(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Specifies exclude filters that define the files, objects, and folders in your source location
   * that you don't want DataSync to transfer.
   */
  public open fun excludes(vararg `value`: Any): Unit = excludes(`value`.toList())

  /**
   * Specifies include filters define the files, objects, and folders in your source location that
   * you want DataSync to transfer.
   */
  public open fun includes(): Any? = unwrap(this).getIncludes()

  /**
   * Specifies include filters define the files, objects, and folders in your source location that
   * you want DataSync to transfer.
   */
  public open fun includes(`value`: IResolvable) {
    unwrap(this).setIncludes(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies include filters define the files, objects, and folders in your source location that
   * you want DataSync to transfer.
   */
  public open fun includes(`value`: List<Any>) {
    unwrap(this).setIncludes(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Specifies include filters define the files, objects, and folders in your source location that
   * you want DataSync to transfer.
   */
  public open fun includes(vararg `value`: Any): Unit = includes(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The configuration of the manifest that lists the files or objects that you want DataSync to
   * transfer.
   */
  public open fun manifestConfig(): Any? = unwrap(this).getManifestConfig()

  /**
   * The configuration of the manifest that lists the files or objects that you want DataSync to
   * transfer.
   */
  public open fun manifestConfig(`value`: IResolvable) {
    unwrap(this).setManifestConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The configuration of the manifest that lists the files or objects that you want DataSync to
   * transfer.
   */
  public open fun manifestConfig(`value`: ManifestConfigProperty) {
    unwrap(this).setManifestConfig(`value`.let(ManifestConfigProperty.Companion::unwrap))
  }

  /**
   * The configuration of the manifest that lists the files or objects that you want DataSync to
   * transfer.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3f3d5d70b2fdc8b5bbd54d646e05702d83dfc05c58a414d9a28345e7fce8bb9d")
  public open fun manifestConfig(`value`: ManifestConfigProperty.Builder.() -> Unit): Unit =
      manifestConfig(ManifestConfigProperty(`value`))

  /**
   * Specifies the name of your task.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * Specifies the name of your task.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Specifies your task's settings, such as preserving file metadata, verifying data integrity,
   * among other options.
   */
  public open fun options(): Any? = unwrap(this).getOptions()

  /**
   * Specifies your task's settings, such as preserving file metadata, verifying data integrity,
   * among other options.
   */
  public open fun options(`value`: IResolvable) {
    unwrap(this).setOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies your task's settings, such as preserving file metadata, verifying data integrity,
   * among other options.
   */
  public open fun options(`value`: OptionsProperty) {
    unwrap(this).setOptions(`value`.let(OptionsProperty.Companion::unwrap))
  }

  /**
   * Specifies your task's settings, such as preserving file metadata, verifying data integrity,
   * among other options.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0cb73a6986b6a2eab6684e9cc43938f794e75585cce4f517dfd62a17d2fe2b76")
  public open fun options(`value`: OptionsProperty.Builder.() -> Unit): Unit =
      options(OptionsProperty(`value`))

  /**
   * Specifies a schedule for when you want your task to run.
   */
  public open fun schedule(): Any? = unwrap(this).getSchedule()

  /**
   * Specifies a schedule for when you want your task to run.
   */
  public open fun schedule(`value`: IResolvable) {
    unwrap(this).setSchedule(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies a schedule for when you want your task to run.
   */
  public open fun schedule(`value`: TaskScheduleProperty) {
    unwrap(this).setSchedule(`value`.let(TaskScheduleProperty.Companion::unwrap))
  }

  /**
   * Specifies a schedule for when you want your task to run.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("618247c359dbc42271d0d4fff1b9a15f8cd3b3f3d1ad0966e97a9590fe51a050")
  public open fun schedule(`value`: TaskScheduleProperty.Builder.() -> Unit): Unit =
      schedule(TaskScheduleProperty(`value`))

  /**
   * Specifies the ARN of your transfer's source location.
   */
  public open fun sourceLocationArn(): String = unwrap(this).getSourceLocationArn()

  /**
   * Specifies the ARN of your transfer's source location.
   */
  public open fun sourceLocationArn(`value`: String) {
    unwrap(this).setSourceLocationArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Specifies the tags that you want to apply to your task.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Specifies the tags that you want to apply to your task.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Specifies the tags that you want to apply to your task.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Specifies how you want to configure a task report, which provides detailed information about
   * your DataSync transfer.
   */
  public open fun taskReportConfig(): Any? = unwrap(this).getTaskReportConfig()

  /**
   * Specifies how you want to configure a task report, which provides detailed information about
   * your DataSync transfer.
   */
  public open fun taskReportConfig(`value`: IResolvable) {
    unwrap(this).setTaskReportConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies how you want to configure a task report, which provides detailed information about
   * your DataSync transfer.
   */
  public open fun taskReportConfig(`value`: TaskReportConfigProperty) {
    unwrap(this).setTaskReportConfig(`value`.let(TaskReportConfigProperty.Companion::unwrap))
  }

  /**
   * Specifies how you want to configure a task report, which provides detailed information about
   * your DataSync transfer.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9703490283b3a1cc2736578162b15b5832eeb2283c5e3d073cac56246de9aae5")
  public open fun taskReportConfig(`value`: TaskReportConfigProperty.Builder.() -> Unit): Unit =
      taskReportConfig(TaskReportConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.datasync.CfnTask].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies the Amazon Resource Name (ARN) of an Amazon CloudWatch log group for monitoring
     * your task.
     *
     * For more information, see [Monitoring DataSync with Amazon
     * CloudWatch](https://docs.aws.amazon.com/datasync/latest/userguide/monitor-datasync.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-cloudwatchloggrouparn)
     * @param cloudWatchLogGroupArn Specifies the Amazon Resource Name (ARN) of an Amazon CloudWatch
     * log group for monitoring your task. 
     */
    public fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String)

    /**
     * The Amazon Resource Name (ARN) of an AWS storage resource's location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-destinationlocationarn)
     * @param destinationLocationArn The Amazon Resource Name (ARN) of an AWS storage resource's
     * location. 
     */
    public fun destinationLocationArn(destinationLocationArn: String)

    /**
     * Specifies exclude filters that define the files, objects, and folders in your source location
     * that you don't want DataSync to transfer.
     *
     * For more information and examples, see [Specifying what DataSync transfers by using
     * filters](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-excludes)
     * @param excludes Specifies exclude filters that define the files, objects, and folders in your
     * source location that you don't want DataSync to transfer. 
     */
    public fun excludes(excludes: IResolvable)

    /**
     * Specifies exclude filters that define the files, objects, and folders in your source location
     * that you don't want DataSync to transfer.
     *
     * For more information and examples, see [Specifying what DataSync transfers by using
     * filters](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-excludes)
     * @param excludes Specifies exclude filters that define the files, objects, and folders in your
     * source location that you don't want DataSync to transfer. 
     */
    public fun excludes(excludes: List<Any>)

    /**
     * Specifies exclude filters that define the files, objects, and folders in your source location
     * that you don't want DataSync to transfer.
     *
     * For more information and examples, see [Specifying what DataSync transfers by using
     * filters](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-excludes)
     * @param excludes Specifies exclude filters that define the files, objects, and folders in your
     * source location that you don't want DataSync to transfer. 
     */
    public fun excludes(vararg excludes: Any)

    /**
     * Specifies include filters define the files, objects, and folders in your source location that
     * you want DataSync to transfer.
     *
     * For more information and examples, see [Specifying what DataSync transfers by using
     * filters](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-includes)
     * @param includes Specifies include filters define the files, objects, and folders in your
     * source location that you want DataSync to transfer. 
     */
    public fun includes(includes: IResolvable)

    /**
     * Specifies include filters define the files, objects, and folders in your source location that
     * you want DataSync to transfer.
     *
     * For more information and examples, see [Specifying what DataSync transfers by using
     * filters](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-includes)
     * @param includes Specifies include filters define the files, objects, and folders in your
     * source location that you want DataSync to transfer. 
     */
    public fun includes(includes: List<Any>)

    /**
     * Specifies include filters define the files, objects, and folders in your source location that
     * you want DataSync to transfer.
     *
     * For more information and examples, see [Specifying what DataSync transfers by using
     * filters](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-includes)
     * @param includes Specifies include filters define the files, objects, and folders in your
     * source location that you want DataSync to transfer. 
     */
    public fun includes(vararg includes: Any)

    /**
     * The configuration of the manifest that lists the files or objects that you want DataSync to
     * transfer.
     *
     * For more information, see [Specifying what DataSync transfers by using a
     * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-manifestconfig)
     * @param manifestConfig The configuration of the manifest that lists the files or objects that
     * you want DataSync to transfer. 
     */
    public fun manifestConfig(manifestConfig: IResolvable)

    /**
     * The configuration of the manifest that lists the files or objects that you want DataSync to
     * transfer.
     *
     * For more information, see [Specifying what DataSync transfers by using a
     * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-manifestconfig)
     * @param manifestConfig The configuration of the manifest that lists the files or objects that
     * you want DataSync to transfer. 
     */
    public fun manifestConfig(manifestConfig: ManifestConfigProperty)

    /**
     * The configuration of the manifest that lists the files or objects that you want DataSync to
     * transfer.
     *
     * For more information, see [Specifying what DataSync transfers by using a
     * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-manifestconfig)
     * @param manifestConfig The configuration of the manifest that lists the files or objects that
     * you want DataSync to transfer. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7312f9c8ef32669d9d5371b2c1ce143f2bcca81052d450c0f5d9d7bcf9d5e543")
    public fun manifestConfig(manifestConfig: ManifestConfigProperty.Builder.() -> Unit)

    /**
     * Specifies the name of your task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-name)
     * @param name Specifies the name of your task. 
     */
    public fun name(name: String)

    /**
     * Specifies your task's settings, such as preserving file metadata, verifying data integrity,
     * among other options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-options)
     * @param options Specifies your task's settings, such as preserving file metadata, verifying
     * data integrity, among other options. 
     */
    public fun options(options: IResolvable)

    /**
     * Specifies your task's settings, such as preserving file metadata, verifying data integrity,
     * among other options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-options)
     * @param options Specifies your task's settings, such as preserving file metadata, verifying
     * data integrity, among other options. 
     */
    public fun options(options: OptionsProperty)

    /**
     * Specifies your task's settings, such as preserving file metadata, verifying data integrity,
     * among other options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-options)
     * @param options Specifies your task's settings, such as preserving file metadata, verifying
     * data integrity, among other options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72305d8f86064d3c2e00f3c3ac30d4951c2ad22f68f689c764cd4ac5db235abc")
    public fun options(options: OptionsProperty.Builder.() -> Unit)

    /**
     * Specifies a schedule for when you want your task to run.
     *
     * For more information, see [Scheduling your
     * task](https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-schedule)
     * @param schedule Specifies a schedule for when you want your task to run. 
     */
    public fun schedule(schedule: IResolvable)

    /**
     * Specifies a schedule for when you want your task to run.
     *
     * For more information, see [Scheduling your
     * task](https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-schedule)
     * @param schedule Specifies a schedule for when you want your task to run. 
     */
    public fun schedule(schedule: TaskScheduleProperty)

    /**
     * Specifies a schedule for when you want your task to run.
     *
     * For more information, see [Scheduling your
     * task](https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-schedule)
     * @param schedule Specifies a schedule for when you want your task to run. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc570e5121b77db56ad8465e2e4b2bca206399256c4c7ca3af30554a5dfe7e3c")
    public fun schedule(schedule: TaskScheduleProperty.Builder.() -> Unit)

    /**
     * Specifies the ARN of your transfer's source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-sourcelocationarn)
     * @param sourceLocationArn Specifies the ARN of your transfer's source location. 
     */
    public fun sourceLocationArn(sourceLocationArn: String)

    /**
     * Specifies the tags that you want to apply to your task.
     *
     * *Tags* are key-value pairs that help you manage, filter, and search for your DataSync
     * resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-tags)
     * @param tags Specifies the tags that you want to apply to your task. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Specifies the tags that you want to apply to your task.
     *
     * *Tags* are key-value pairs that help you manage, filter, and search for your DataSync
     * resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-tags)
     * @param tags Specifies the tags that you want to apply to your task. 
     */
    public fun tags(vararg tags: CfnTag)

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
     * @param taskReportConfig Specifies how you want to configure a task report, which provides
     * detailed information about your DataSync transfer. 
     */
    public fun taskReportConfig(taskReportConfig: IResolvable)

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
     * @param taskReportConfig Specifies how you want to configure a task report, which provides
     * detailed information about your DataSync transfer. 
     */
    public fun taskReportConfig(taskReportConfig: TaskReportConfigProperty)

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
     * @param taskReportConfig Specifies how you want to configure a task report, which provides
     * detailed information about your DataSync transfer. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be882d8209e6a0c57067438e1607b0d0fe8570513ca4471839eb30502477f1ca")
    public fun taskReportConfig(taskReportConfig: TaskReportConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnTask.Builder =
        software.amazon.awscdk.services.datasync.CfnTask.Builder.create(scope, id)

    /**
     * Specifies the Amazon Resource Name (ARN) of an Amazon CloudWatch log group for monitoring
     * your task.
     *
     * For more information, see [Monitoring DataSync with Amazon
     * CloudWatch](https://docs.aws.amazon.com/datasync/latest/userguide/monitor-datasync.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-cloudwatchloggrouparn)
     * @param cloudWatchLogGroupArn Specifies the Amazon Resource Name (ARN) of an Amazon CloudWatch
     * log group for monitoring your task. 
     */
    override fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String) {
      cdkBuilder.cloudWatchLogGroupArn(cloudWatchLogGroupArn)
    }

    /**
     * The Amazon Resource Name (ARN) of an AWS storage resource's location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-destinationlocationarn)
     * @param destinationLocationArn The Amazon Resource Name (ARN) of an AWS storage resource's
     * location. 
     */
    override fun destinationLocationArn(destinationLocationArn: String) {
      cdkBuilder.destinationLocationArn(destinationLocationArn)
    }

    /**
     * Specifies exclude filters that define the files, objects, and folders in your source location
     * that you don't want DataSync to transfer.
     *
     * For more information and examples, see [Specifying what DataSync transfers by using
     * filters](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-excludes)
     * @param excludes Specifies exclude filters that define the files, objects, and folders in your
     * source location that you don't want DataSync to transfer. 
     */
    override fun excludes(excludes: IResolvable) {
      cdkBuilder.excludes(excludes.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies exclude filters that define the files, objects, and folders in your source location
     * that you don't want DataSync to transfer.
     *
     * For more information and examples, see [Specifying what DataSync transfers by using
     * filters](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-excludes)
     * @param excludes Specifies exclude filters that define the files, objects, and folders in your
     * source location that you don't want DataSync to transfer. 
     */
    override fun excludes(excludes: List<Any>) {
      cdkBuilder.excludes(excludes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Specifies exclude filters that define the files, objects, and folders in your source location
     * that you don't want DataSync to transfer.
     *
     * For more information and examples, see [Specifying what DataSync transfers by using
     * filters](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-excludes)
     * @param excludes Specifies exclude filters that define the files, objects, and folders in your
     * source location that you don't want DataSync to transfer. 
     */
    override fun excludes(vararg excludes: Any): Unit = excludes(excludes.toList())

    /**
     * Specifies include filters define the files, objects, and folders in your source location that
     * you want DataSync to transfer.
     *
     * For more information and examples, see [Specifying what DataSync transfers by using
     * filters](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-includes)
     * @param includes Specifies include filters define the files, objects, and folders in your
     * source location that you want DataSync to transfer. 
     */
    override fun includes(includes: IResolvable) {
      cdkBuilder.includes(includes.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies include filters define the files, objects, and folders in your source location that
     * you want DataSync to transfer.
     *
     * For more information and examples, see [Specifying what DataSync transfers by using
     * filters](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-includes)
     * @param includes Specifies include filters define the files, objects, and folders in your
     * source location that you want DataSync to transfer. 
     */
    override fun includes(includes: List<Any>) {
      cdkBuilder.includes(includes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Specifies include filters define the files, objects, and folders in your source location that
     * you want DataSync to transfer.
     *
     * For more information and examples, see [Specifying what DataSync transfers by using
     * filters](https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-includes)
     * @param includes Specifies include filters define the files, objects, and folders in your
     * source location that you want DataSync to transfer. 
     */
    override fun includes(vararg includes: Any): Unit = includes(includes.toList())

    /**
     * The configuration of the manifest that lists the files or objects that you want DataSync to
     * transfer.
     *
     * For more information, see [Specifying what DataSync transfers by using a
     * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-manifestconfig)
     * @param manifestConfig The configuration of the manifest that lists the files or objects that
     * you want DataSync to transfer. 
     */
    override fun manifestConfig(manifestConfig: IResolvable) {
      cdkBuilder.manifestConfig(manifestConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configuration of the manifest that lists the files or objects that you want DataSync to
     * transfer.
     *
     * For more information, see [Specifying what DataSync transfers by using a
     * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-manifestconfig)
     * @param manifestConfig The configuration of the manifest that lists the files or objects that
     * you want DataSync to transfer. 
     */
    override fun manifestConfig(manifestConfig: ManifestConfigProperty) {
      cdkBuilder.manifestConfig(manifestConfig.let(ManifestConfigProperty.Companion::unwrap))
    }

    /**
     * The configuration of the manifest that lists the files or objects that you want DataSync to
     * transfer.
     *
     * For more information, see [Specifying what DataSync transfers by using a
     * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-manifestconfig)
     * @param manifestConfig The configuration of the manifest that lists the files or objects that
     * you want DataSync to transfer. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7312f9c8ef32669d9d5371b2c1ce143f2bcca81052d450c0f5d9d7bcf9d5e543")
    override fun manifestConfig(manifestConfig: ManifestConfigProperty.Builder.() -> Unit): Unit =
        manifestConfig(ManifestConfigProperty(manifestConfig))

    /**
     * Specifies the name of your task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-name)
     * @param name Specifies the name of your task. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Specifies your task's settings, such as preserving file metadata, verifying data integrity,
     * among other options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-options)
     * @param options Specifies your task's settings, such as preserving file metadata, verifying
     * data integrity, among other options. 
     */
    override fun options(options: IResolvable) {
      cdkBuilder.options(options.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies your task's settings, such as preserving file metadata, verifying data integrity,
     * among other options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-options)
     * @param options Specifies your task's settings, such as preserving file metadata, verifying
     * data integrity, among other options. 
     */
    override fun options(options: OptionsProperty) {
      cdkBuilder.options(options.let(OptionsProperty.Companion::unwrap))
    }

    /**
     * Specifies your task's settings, such as preserving file metadata, verifying data integrity,
     * among other options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-options)
     * @param options Specifies your task's settings, such as preserving file metadata, verifying
     * data integrity, among other options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72305d8f86064d3c2e00f3c3ac30d4951c2ad22f68f689c764cd4ac5db235abc")
    override fun options(options: OptionsProperty.Builder.() -> Unit): Unit =
        options(OptionsProperty(options))

    /**
     * Specifies a schedule for when you want your task to run.
     *
     * For more information, see [Scheduling your
     * task](https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-schedule)
     * @param schedule Specifies a schedule for when you want your task to run. 
     */
    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies a schedule for when you want your task to run.
     *
     * For more information, see [Scheduling your
     * task](https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-schedule)
     * @param schedule Specifies a schedule for when you want your task to run. 
     */
    override fun schedule(schedule: TaskScheduleProperty) {
      cdkBuilder.schedule(schedule.let(TaskScheduleProperty.Companion::unwrap))
    }

    /**
     * Specifies a schedule for when you want your task to run.
     *
     * For more information, see [Scheduling your
     * task](https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-schedule)
     * @param schedule Specifies a schedule for when you want your task to run. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc570e5121b77db56ad8465e2e4b2bca206399256c4c7ca3af30554a5dfe7e3c")
    override fun schedule(schedule: TaskScheduleProperty.Builder.() -> Unit): Unit =
        schedule(TaskScheduleProperty(schedule))

    /**
     * Specifies the ARN of your transfer's source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-sourcelocationarn)
     * @param sourceLocationArn Specifies the ARN of your transfer's source location. 
     */
    override fun sourceLocationArn(sourceLocationArn: String) {
      cdkBuilder.sourceLocationArn(sourceLocationArn)
    }

    /**
     * Specifies the tags that you want to apply to your task.
     *
     * *Tags* are key-value pairs that help you manage, filter, and search for your DataSync
     * resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-tags)
     * @param tags Specifies the tags that you want to apply to your task. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Specifies the tags that you want to apply to your task.
     *
     * *Tags* are key-value pairs that help you manage, filter, and search for your DataSync
     * resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html#cfn-datasync-task-tags)
     * @param tags Specifies the tags that you want to apply to your task. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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
     * @param taskReportConfig Specifies how you want to configure a task report, which provides
     * detailed information about your DataSync transfer. 
     */
    override fun taskReportConfig(taskReportConfig: IResolvable) {
      cdkBuilder.taskReportConfig(taskReportConfig.let(IResolvable.Companion::unwrap))
    }

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
     * @param taskReportConfig Specifies how you want to configure a task report, which provides
     * detailed information about your DataSync transfer. 
     */
    override fun taskReportConfig(taskReportConfig: TaskReportConfigProperty) {
      cdkBuilder.taskReportConfig(taskReportConfig.let(TaskReportConfigProperty.Companion::unwrap))
    }

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
     * @param taskReportConfig Specifies how you want to configure a task report, which provides
     * detailed information about your DataSync transfer. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be882d8209e6a0c57067438e1607b0d0fe8570513ca4471839eb30502477f1ca")
    override fun taskReportConfig(taskReportConfig: TaskReportConfigProperty.Builder.() -> Unit):
        Unit = taskReportConfig(TaskReportConfigProperty(taskReportConfig))

    public fun build(): software.amazon.awscdk.services.datasync.CfnTask = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.datasync.CfnTask.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTask {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTask(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnTask): CfnTask =
        CfnTask(cdkObject)

    internal fun unwrap(wrapped: CfnTask): software.amazon.awscdk.services.datasync.CfnTask =
        wrapped.cdkObject as software.amazon.awscdk.services.datasync.CfnTask
  }

  /**
   * The reporting level for the deleted section of your DataSync task report.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datasync.*;
   * DeletedProperty deletedProperty = DeletedProperty.builder()
   * .reportLevel("reportLevel")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-deleted.html)
   */
  public interface DeletedProperty {
    /**
     * Specifies whether you want your task report to include only what went wrong with your
     * transfer or a list of what succeeded and didn't.
     *
     * * `ERRORS_ONLY` : A report shows what DataSync was unable to delete.
     * * `SUCCESSES_AND_ERRORS` : A report shows what DataSync was able and unable to delete.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-deleted.html#cfn-datasync-task-deleted-reportlevel)
     */
    public fun reportLevel(): String? = unwrap(this).getReportLevel()

    /**
     * A builder for [DeletedProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param reportLevel Specifies whether you want your task report to include only what went
       * wrong with your transfer or a list of what succeeded and didn't.
       * * `ERRORS_ONLY` : A report shows what DataSync was unable to delete.
       * * `SUCCESSES_AND_ERRORS` : A report shows what DataSync was able and unable to delete.
       */
      public fun reportLevel(reportLevel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnTask.DeletedProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnTask.DeletedProperty.builder()

      /**
       * @param reportLevel Specifies whether you want your task report to include only what went
       * wrong with your transfer or a list of what succeeded and didn't.
       * * `ERRORS_ONLY` : A report shows what DataSync was unable to delete.
       * * `SUCCESSES_AND_ERRORS` : A report shows what DataSync was able and unable to delete.
       */
      override fun reportLevel(reportLevel: String) {
        cdkBuilder.reportLevel(reportLevel)
      }

      public fun build(): software.amazon.awscdk.services.datasync.CfnTask.DeletedProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datasync.CfnTask.DeletedProperty,
    ) : CdkObject(cdkObject), DeletedProperty {
      /**
       * Specifies whether you want your task report to include only what went wrong with your
       * transfer or a list of what succeeded and didn't.
       *
       * * `ERRORS_ONLY` : A report shows what DataSync was unable to delete.
       * * `SUCCESSES_AND_ERRORS` : A report shows what DataSync was able and unable to delete.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-deleted.html#cfn-datasync-task-deleted-reportlevel)
       */
      override fun reportLevel(): String? = unwrap(this).getReportLevel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeletedProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnTask.DeletedProperty):
          DeletedProperty = CdkObjectWrappers.wrap(cdkObject) as? DeletedProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeletedProperty):
          software.amazon.awscdk.services.datasync.CfnTask.DeletedProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnTask.DeletedProperty
    }
  }

  /**
   * Specifies where DataSync uploads your [task
   * report](https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datasync.*;
   * DestinationProperty destinationProperty = DestinationProperty.builder()
   * .s3(S3Property.builder()
   * .bucketAccessRoleArn("bucketAccessRoleArn")
   * .s3BucketArn("s3BucketArn")
   * .subdirectory("subdirectory")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-destination.html)
   */
  public interface DestinationProperty {
    /**
     * Specifies the Amazon S3 bucket where DataSync uploads your task report.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-destination.html#cfn-datasync-task-destination-s3)
     */
    public fun s3(): Any? = unwrap(this).getS3()

    /**
     * A builder for [DestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3 Specifies the Amazon S3 bucket where DataSync uploads your task report.
       */
      public fun s3(s3: IResolvable)

      /**
       * @param s3 Specifies the Amazon S3 bucket where DataSync uploads your task report.
       */
      public fun s3(s3: S3Property)

      /**
       * @param s3 Specifies the Amazon S3 bucket where DataSync uploads your task report.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("feeda5b4004520bfe4b68bdf0e8efea7feea712d87baf6b70181bdd6ffd01dc2")
      public fun s3(s3: S3Property.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnTask.DestinationProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnTask.DestinationProperty.builder()

      /**
       * @param s3 Specifies the Amazon S3 bucket where DataSync uploads your task report.
       */
      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3 Specifies the Amazon S3 bucket where DataSync uploads your task report.
       */
      override fun s3(s3: S3Property) {
        cdkBuilder.s3(s3.let(S3Property.Companion::unwrap))
      }

      /**
       * @param s3 Specifies the Amazon S3 bucket where DataSync uploads your task report.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("feeda5b4004520bfe4b68bdf0e8efea7feea712d87baf6b70181bdd6ffd01dc2")
      override fun s3(s3: S3Property.Builder.() -> Unit): Unit = s3(S3Property(s3))

      public fun build(): software.amazon.awscdk.services.datasync.CfnTask.DestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datasync.CfnTask.DestinationProperty,
    ) : CdkObject(cdkObject), DestinationProperty {
      /**
       * Specifies the Amazon S3 bucket where DataSync uploads your task report.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-destination.html#cfn-datasync-task-destination-s3)
       */
      override fun s3(): Any? = unwrap(this).getS3()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnTask.DestinationProperty):
          DestinationProperty = CdkObjectWrappers.wrap(cdkObject) as? DestinationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationProperty):
          software.amazon.awscdk.services.datasync.CfnTask.DestinationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.datasync.CfnTask.DestinationProperty
    }
  }

  /**
   * Specifies which files, folders, and objects to include or exclude when transferring files from
   * source to destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datasync.*;
   * FilterRuleProperty filterRuleProperty = FilterRuleProperty.builder()
   * .filterType("filterType")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-filterrule.html)
   */
  public interface FilterRuleProperty {
    /**
     * The type of filter rule to apply.
     *
     * AWS DataSync only supports the SIMPLE_PATTERN rule type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-filterrule.html#cfn-datasync-task-filterrule-filtertype)
     */
    public fun filterType(): String? = unwrap(this).getFilterType()

    /**
     * A single filter string that consists of the patterns to include or exclude.
     *
     * The patterns are delimited by "|" (that is, a pipe), for example: `/folder1|/folder2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-filterrule.html#cfn-datasync-task-filterrule-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [FilterRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param filterType The type of filter rule to apply.
       * AWS DataSync only supports the SIMPLE_PATTERN rule type.
       */
      public fun filterType(filterType: String)

      /**
       * @param value A single filter string that consists of the patterns to include or exclude.
       * The patterns are delimited by "|" (that is, a pipe), for example: `/folder1|/folder2`
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnTask.FilterRuleProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnTask.FilterRuleProperty.builder()

      /**
       * @param filterType The type of filter rule to apply.
       * AWS DataSync only supports the SIMPLE_PATTERN rule type.
       */
      override fun filterType(filterType: String) {
        cdkBuilder.filterType(filterType)
      }

      /**
       * @param value A single filter string that consists of the patterns to include or exclude.
       * The patterns are delimited by "|" (that is, a pipe), for example: `/folder1|/folder2`
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.datasync.CfnTask.FilterRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datasync.CfnTask.FilterRuleProperty,
    ) : CdkObject(cdkObject), FilterRuleProperty {
      /**
       * The type of filter rule to apply.
       *
       * AWS DataSync only supports the SIMPLE_PATTERN rule type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-filterrule.html#cfn-datasync-task-filterrule-filtertype)
       */
      override fun filterType(): String? = unwrap(this).getFilterType()

      /**
       * A single filter string that consists of the patterns to include or exclude.
       *
       * The patterns are delimited by "|" (that is, a pipe), for example: `/folder1|/folder2`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-filterrule.html#cfn-datasync-task-filterrule-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnTask.FilterRuleProperty):
          FilterRuleProperty = CdkObjectWrappers.wrap(cdkObject) as? FilterRuleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterRuleProperty):
          software.amazon.awscdk.services.datasync.CfnTask.FilterRuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.datasync.CfnTask.FilterRuleProperty
    }
  }

  /**
   * Configures a manifest, which is a list of files or objects that you want AWS DataSync to
   * transfer.
   *
   * For more information and configuration examples, see [Specifying what DataSync transfers by
   * using a
   * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datasync.*;
   * ManifestConfigProperty manifestConfigProperty = ManifestConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-manifestconfig.html)
   */
  public interface ManifestConfigProperty {
    /**
     * Specifies what DataSync uses the manifest for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-manifestconfig.html#cfn-datasync-task-manifestconfig-action)
     */
    public fun action(): String? = unwrap(this).getAction()

    /**
     * Specifies the file format of your manifest.
     *
     * For more information, see [Creating a
     * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-create)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-manifestconfig.html#cfn-datasync-task-manifestconfig-format)
     */
    public fun format(): String? = unwrap(this).getFormat()

    /**
     * Specifies the manifest that you want DataSync to use and where it's hosted.
     *
     *
     * You must specify this parameter if you're configuring a new manifest on or after February 7,
     * 2024.
     *
     * If you don't, you'll get a 400 status code and `ValidationException` error stating that
     * you're missing the IAM role for DataSync to access the S3 bucket where you're hosting your
     * manifest. For more information, see [Providing DataSync access to your
     * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-access)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-manifestconfig.html#cfn-datasync-task-manifestconfig-source)
     */
    public fun source(): Any

    /**
     * A builder for [ManifestConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action Specifies what DataSync uses the manifest for.
       */
      public fun action(action: String)

      /**
       * @param format Specifies the file format of your manifest.
       * For more information, see [Creating a
       * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-create)
       * .
       */
      public fun format(format: String)

      /**
       * @param source Specifies the manifest that you want DataSync to use and where it's hosted. 
       *
       * You must specify this parameter if you're configuring a new manifest on or after February
       * 7, 2024.
       *
       * If you don't, you'll get a 400 status code and `ValidationException` error stating that
       * you're missing the IAM role for DataSync to access the S3 bucket where you're hosting your
       * manifest. For more information, see [Providing DataSync access to your
       * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-access)
       * .
       */
      public fun source(source: IResolvable)

      /**
       * @param source Specifies the manifest that you want DataSync to use and where it's hosted. 
       *
       * You must specify this parameter if you're configuring a new manifest on or after February
       * 7, 2024.
       *
       * If you don't, you'll get a 400 status code and `ValidationException` error stating that
       * you're missing the IAM role for DataSync to access the S3 bucket where you're hosting your
       * manifest. For more information, see [Providing DataSync access to your
       * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-access)
       * .
       */
      public fun source(source: SourceProperty)

      /**
       * @param source Specifies the manifest that you want DataSync to use and where it's hosted. 
       *
       * You must specify this parameter if you're configuring a new manifest on or after February
       * 7, 2024.
       *
       * If you don't, you'll get a 400 status code and `ValidationException` error stating that
       * you're missing the IAM role for DataSync to access the S3 bucket where you're hosting your
       * manifest. For more information, see [Providing DataSync access to your
       * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-access)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f5a570674918e0074e935aea0ece9d88aa46198985d958b1683bf8d6f1ec598")
      public fun source(source: SourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnTask.ManifestConfigProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnTask.ManifestConfigProperty.builder()

      /**
       * @param action Specifies what DataSync uses the manifest for.
       */
      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      /**
       * @param format Specifies the file format of your manifest.
       * For more information, see [Creating a
       * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-create)
       * .
       */
      override fun format(format: String) {
        cdkBuilder.format(format)
      }

      /**
       * @param source Specifies the manifest that you want DataSync to use and where it's hosted. 
       *
       * You must specify this parameter if you're configuring a new manifest on or after February
       * 7, 2024.
       *
       * If you don't, you'll get a 400 status code and `ValidationException` error stating that
       * you're missing the IAM role for DataSync to access the S3 bucket where you're hosting your
       * manifest. For more information, see [Providing DataSync access to your
       * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-access)
       * .
       */
      override fun source(source: IResolvable) {
        cdkBuilder.source(source.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param source Specifies the manifest that you want DataSync to use and where it's hosted. 
       *
       * You must specify this parameter if you're configuring a new manifest on or after February
       * 7, 2024.
       *
       * If you don't, you'll get a 400 status code and `ValidationException` error stating that
       * you're missing the IAM role for DataSync to access the S3 bucket where you're hosting your
       * manifest. For more information, see [Providing DataSync access to your
       * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-access)
       * .
       */
      override fun source(source: SourceProperty) {
        cdkBuilder.source(source.let(SourceProperty.Companion::unwrap))
      }

      /**
       * @param source Specifies the manifest that you want DataSync to use and where it's hosted. 
       *
       * You must specify this parameter if you're configuring a new manifest on or after February
       * 7, 2024.
       *
       * If you don't, you'll get a 400 status code and `ValidationException` error stating that
       * you're missing the IAM role for DataSync to access the S3 bucket where you're hosting your
       * manifest. For more information, see [Providing DataSync access to your
       * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-access)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f5a570674918e0074e935aea0ece9d88aa46198985d958b1683bf8d6f1ec598")
      override fun source(source: SourceProperty.Builder.() -> Unit): Unit =
          source(SourceProperty(source))

      public fun build(): software.amazon.awscdk.services.datasync.CfnTask.ManifestConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datasync.CfnTask.ManifestConfigProperty,
    ) : CdkObject(cdkObject), ManifestConfigProperty {
      /**
       * Specifies what DataSync uses the manifest for.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-manifestconfig.html#cfn-datasync-task-manifestconfig-action)
       */
      override fun action(): String? = unwrap(this).getAction()

      /**
       * Specifies the file format of your manifest.
       *
       * For more information, see [Creating a
       * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-create)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-manifestconfig.html#cfn-datasync-task-manifestconfig-format)
       */
      override fun format(): String? = unwrap(this).getFormat()

      /**
       * Specifies the manifest that you want DataSync to use and where it's hosted.
       *
       *
       * You must specify this parameter if you're configuring a new manifest on or after February
       * 7, 2024.
       *
       * If you don't, you'll get a 400 status code and `ValidationException` error stating that
       * you're missing the IAM role for DataSync to access the S3 bucket where you're hosting your
       * manifest. For more information, see [Providing DataSync access to your
       * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-access)
       * .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-manifestconfig.html#cfn-datasync-task-manifestconfig-source)
       */
      override fun source(): Any = unwrap(this).getSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ManifestConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnTask.ManifestConfigProperty):
          ManifestConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? ManifestConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ManifestConfigProperty):
          software.amazon.awscdk.services.datasync.CfnTask.ManifestConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.datasync.CfnTask.ManifestConfigProperty
    }
  }

  /**
   * Specifies the S3 bucket where you're hosting the manifest that you want AWS DataSync to use.
   *
   * For more information and configuration examples, see [Specifying what DataSync transfers by
   * using a
   * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datasync.*;
   * ManifestConfigSourceS3Property manifestConfigSourceS3Property =
   * ManifestConfigSourceS3Property.builder()
   * .bucketAccessRoleArn("bucketAccessRoleArn")
   * .manifestObjectPath("manifestObjectPath")
   * .manifestObjectVersionId("manifestObjectVersionId")
   * .s3BucketArn("s3BucketArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-manifestconfigsources3.html)
   */
  public interface ManifestConfigSourceS3Property {
    /**
     * Specifies the AWS Identity and Access Management (IAM) role that allows DataSync to access
     * your manifest.
     *
     * For more information, see [Providing DataSync access to your
     * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-access)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-manifestconfigsources3.html#cfn-datasync-task-manifestconfigsources3-bucketaccessrolearn)
     */
    public fun bucketAccessRoleArn(): String? = unwrap(this).getBucketAccessRoleArn()

    /**
     * Specifies the Amazon S3 object key of your manifest.
     *
     * This can include a prefix (for example, `prefix/my-manifest.csv` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-manifestconfigsources3.html#cfn-datasync-task-manifestconfigsources3-manifestobjectpath)
     */
    public fun manifestObjectPath(): String? = unwrap(this).getManifestObjectPath()

    /**
     * Specifies the object version ID of the manifest that you want DataSync to use.
     *
     * If you don't set this, DataSync uses the latest version of the object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-manifestconfigsources3.html#cfn-datasync-task-manifestconfigsources3-manifestobjectversionid)
     */
    public fun manifestObjectVersionId(): String? = unwrap(this).getManifestObjectVersionId()

    /**
     * Specifies the Amazon Resource Name (ARN) of the S3 bucket where you're hosting your manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-manifestconfigsources3.html#cfn-datasync-task-manifestconfigsources3-s3bucketarn)
     */
    public fun s3BucketArn(): String? = unwrap(this).getS3BucketArn()

    /**
     * A builder for [ManifestConfigSourceS3Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketAccessRoleArn Specifies the AWS Identity and Access Management (IAM) role that
       * allows DataSync to access your manifest.
       * For more information, see [Providing DataSync access to your
       * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-access)
       * .
       */
      public fun bucketAccessRoleArn(bucketAccessRoleArn: String)

      /**
       * @param manifestObjectPath Specifies the Amazon S3 object key of your manifest.
       * This can include a prefix (for example, `prefix/my-manifest.csv` ).
       */
      public fun manifestObjectPath(manifestObjectPath: String)

      /**
       * @param manifestObjectVersionId Specifies the object version ID of the manifest that you
       * want DataSync to use.
       * If you don't set this, DataSync uses the latest version of the object.
       */
      public fun manifestObjectVersionId(manifestObjectVersionId: String)

      /**
       * @param s3BucketArn Specifies the Amazon Resource Name (ARN) of the S3 bucket where you're
       * hosting your manifest.
       */
      public fun s3BucketArn(s3BucketArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnTask.ManifestConfigSourceS3Property.Builder =
          software.amazon.awscdk.services.datasync.CfnTask.ManifestConfigSourceS3Property.builder()

      /**
       * @param bucketAccessRoleArn Specifies the AWS Identity and Access Management (IAM) role that
       * allows DataSync to access your manifest.
       * For more information, see [Providing DataSync access to your
       * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-access)
       * .
       */
      override fun bucketAccessRoleArn(bucketAccessRoleArn: String) {
        cdkBuilder.bucketAccessRoleArn(bucketAccessRoleArn)
      }

      /**
       * @param manifestObjectPath Specifies the Amazon S3 object key of your manifest.
       * This can include a prefix (for example, `prefix/my-manifest.csv` ).
       */
      override fun manifestObjectPath(manifestObjectPath: String) {
        cdkBuilder.manifestObjectPath(manifestObjectPath)
      }

      /**
       * @param manifestObjectVersionId Specifies the object version ID of the manifest that you
       * want DataSync to use.
       * If you don't set this, DataSync uses the latest version of the object.
       */
      override fun manifestObjectVersionId(manifestObjectVersionId: String) {
        cdkBuilder.manifestObjectVersionId(manifestObjectVersionId)
      }

      /**
       * @param s3BucketArn Specifies the Amazon Resource Name (ARN) of the S3 bucket where you're
       * hosting your manifest.
       */
      override fun s3BucketArn(s3BucketArn: String) {
        cdkBuilder.s3BucketArn(s3BucketArn)
      }

      public fun build():
          software.amazon.awscdk.services.datasync.CfnTask.ManifestConfigSourceS3Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datasync.CfnTask.ManifestConfigSourceS3Property,
    ) : CdkObject(cdkObject), ManifestConfigSourceS3Property {
      /**
       * Specifies the AWS Identity and Access Management (IAM) role that allows DataSync to access
       * your manifest.
       *
       * For more information, see [Providing DataSync access to your
       * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-access)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-manifestconfigsources3.html#cfn-datasync-task-manifestconfigsources3-bucketaccessrolearn)
       */
      override fun bucketAccessRoleArn(): String? = unwrap(this).getBucketAccessRoleArn()

      /**
       * Specifies the Amazon S3 object key of your manifest.
       *
       * This can include a prefix (for example, `prefix/my-manifest.csv` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-manifestconfigsources3.html#cfn-datasync-task-manifestconfigsources3-manifestobjectpath)
       */
      override fun manifestObjectPath(): String? = unwrap(this).getManifestObjectPath()

      /**
       * Specifies the object version ID of the manifest that you want DataSync to use.
       *
       * If you don't set this, DataSync uses the latest version of the object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-manifestconfigsources3.html#cfn-datasync-task-manifestconfigsources3-manifestobjectversionid)
       */
      override fun manifestObjectVersionId(): String? = unwrap(this).getManifestObjectVersionId()

      /**
       * Specifies the Amazon Resource Name (ARN) of the S3 bucket where you're hosting your
       * manifest.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-manifestconfigsources3.html#cfn-datasync-task-manifestconfigsources3-s3bucketarn)
       */
      override fun s3BucketArn(): String? = unwrap(this).getS3BucketArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ManifestConfigSourceS3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnTask.ManifestConfigSourceS3Property):
          ManifestConfigSourceS3Property = CdkObjectWrappers.wrap(cdkObject) as?
          ManifestConfigSourceS3Property ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ManifestConfigSourceS3Property):
          software.amazon.awscdk.services.datasync.CfnTask.ManifestConfigSourceS3Property = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.datasync.CfnTask.ManifestConfigSourceS3Property
    }
  }

  /**
   * Represents the options that are available to control the behavior of a
   * [StartTaskExecution](https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html)
   * operation. This behavior includes preserving metadata, such as user ID (UID), group ID (GID), and
   * file permissions; overwriting files in the destination; data integrity verification; and so on.
   *
   * A task has a set of default options associated with it. If you don't specify an option in
   * [StartTaskExecution](https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html)
   * , the default value is used. You can override the default options on each task execution by
   * specifying an overriding `Options` value to
   * [StartTaskExecution](https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datasync.*;
   * OptionsProperty optionsProperty = OptionsProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html)
   */
  public interface OptionsProperty {
    /**
     * A file metadata value that shows the last time that a file was accessed (that is, when the
     * file was read or written to).
     *
     * If you set `Atime` to `BEST_EFFORT` , AWS DataSync attempts to preserve the original `Atime`
     * attribute on all source files (that is, the version before the PREPARING phase). However,
     * `Atime` 's behavior is not fully standard across platforms, so AWS DataSync can only do this on
     * a best-effort basis.
     *
     * Default value: `BEST_EFFORT`
     *
     * `BEST_EFFORT` : Attempt to preserve the per-file `Atime` value (recommended).
     *
     * `NONE` : Ignore `Atime` .
     *
     *
     * If `Atime` is set to `BEST_EFFORT` , `Mtime` must be set to `PRESERVE` .
     *
     * If `Atime` is set to `NONE` , `Mtime` must also be `NONE` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-atime)
     */
    public fun atime(): String? = unwrap(this).getAtime()

    /**
     * A value that limits the bandwidth used by AWS DataSync .
     *
     * For example, if you want AWS DataSync to use a maximum of 1 MB, set this value to `1048576`
     * (=1024*1024).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-bytespersecond)
     */
    public fun bytesPerSecond(): Number? = unwrap(this).getBytesPerSecond()

    /**
     * The group ID (GID) of the file's owners.
     *
     * Default value: `INT_VALUE`
     *
     * `INT_VALUE` : Preserve the integer value of the user ID (UID) and group ID (GID)
     * (recommended).
     *
     * `NAME` : Currently not supported.
     *
     * `NONE` : Ignore the UID and GID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-gid)
     */
    public fun gid(): String? = unwrap(this).getGid()

    /**
     * Specifies the type of logs that DataSync publishes to a Amazon CloudWatch Logs log group.
     *
     * To specify the log group, see
     * [CloudWatchLogGroupArn](https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-CloudWatchLogGroupArn)
     * .
     *
     * * `BASIC` - Publishes logs with only basic information (such as transfer errors).
     * * `TRANSFER` - Publishes logs for all files or objects that your DataSync task transfers and
     * performs data-integrity checks on.
     * * `OFF` - No logs are published.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-loglevel)
     */
    public fun logLevel(): String? = unwrap(this).getLogLevel()

    /**
     * A value that indicates the last time that a file was modified (that is, a file was written
     * to) before the PREPARING phase.
     *
     * This option is required for cases when you need to run the same task more than one time.
     *
     * Default value: `PRESERVE`
     *
     * `PRESERVE` : Preserve original `Mtime` (recommended)
     *
     * `NONE` : Ignore `Mtime` .
     *
     *
     * If `Mtime` is set to `PRESERVE` , `Atime` must be set to `BEST_EFFORT` .
     *
     * If `Mtime` is set to `NONE` , `Atime` must also be set to `NONE` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-mtime)
     */
    public fun mtime(): String? = unwrap(this).getMtime()

    /**
     * Specifies whether you want DataSync to `PRESERVE` object tags (default behavior) when
     * transferring between object storage systems.
     *
     * If you want your DataSync task to ignore object tags, specify the `NONE` value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-objecttags)
     */
    public fun objectTags(): String? = unwrap(this).getObjectTags()

    /**
     * Specifies whether DataSync should modify or preserve data at the destination location.
     *
     * * `ALWAYS` (default) - DataSync modifies data in the destination location when source data
     * (including metadata) has changed.
     *
     * If DataSync overwrites objects, you might incur additional charges for certain Amazon S3
     * storage classes (for example, for retrieval or early deletion). For more information, see
     * [Storage class considerations with Amazon S3
     * transfers](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
     * .
     *
     * * `NEVER` - DataSync doesn't overwrite data in the destination location even if the source
     * data has changed. You can use this option to protect against overwriting changes made to files
     * or objects in the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-overwritemode)
     */
    public fun overwriteMode(): String? = unwrap(this).getOverwriteMode()

    /**
     * A value that determines which users or groups can access a file for a specific purpose, such
     * as reading, writing, or execution of the file.
     *
     * This option should be set only for Network File System (NFS), Amazon EFS, and Amazon S3
     * locations. For more information about what metadata is copied by DataSync, see [Metadata Copied
     * by
     * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied)
     * .
     *
     * Default value: `PRESERVE`
     *
     * `PRESERVE` : Preserve POSIX-style permissions (recommended).
     *
     * `NONE` : Ignore permissions.
     *
     *
     * AWS DataSync can preserve extant permissions of a source location.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-posixpermissions)
     */
    public fun posixPermissions(): String? = unwrap(this).getPosixPermissions()

    /**
     * A value that specifies whether files in the destination that don't exist in the source file
     * system are preserved.
     *
     * This option can affect your storage costs. If your task deletes objects, you might incur
     * minimum storage duration charges for certain storage classes. For detailed information, see
     * [Considerations when working with Amazon S3 storage classes in
     * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
     * in the *AWS DataSync User Guide* .
     *
     * Default value: `PRESERVE`
     *
     * `PRESERVE` : Ignore destination files that aren't present in the source (recommended).
     *
     * `REMOVE` : Delete destination files that aren't present in the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-preservedeletedfiles)
     */
    public fun preserveDeletedFiles(): String? = unwrap(this).getPreserveDeletedFiles()

    /**
     * A value that determines whether AWS DataSync should preserve the metadata of block and
     * character devices in the source file system, and re-create the files with that device name and
     * metadata on the destination.
     *
     * DataSync does not copy the contents of such devices, only the name and metadata.
     *
     *
     * AWS DataSync can't sync the actual contents of such devices, because they are nonterminal and
     * don't return an end-of-file (EOF) marker.
     *
     *
     * Default value: `NONE`
     *
     * `NONE` : Ignore special devices (recommended).
     *
     * `PRESERVE` : Preserve character and block device metadata. This option isn't currently
     * supported for Amazon EFS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-preservedevices)
     */
    public fun preserveDevices(): String? = unwrap(this).getPreserveDevices()

    /**
     * A value that determines which components of the SMB security descriptor are copied from
     * source to destination objects.
     *
     * This value is only used for transfers between SMB and Amazon FSx for Windows File Server
     * locations, or between two Amazon FSx for Windows File Server locations. For more information
     * about how DataSync handles metadata, see [How DataSync Handles Metadata and Special
     * Files](https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html) .
     *
     * Default value: `OWNER_DACL`
     *
     * `OWNER_DACL` : For each copied object, DataSync copies the following metadata:
     *
     * * Object owner.
     * * NTFS discretionary access control lists (DACLs), which determine whether to grant access to
     * an object.
     *
     * When you use option, DataSync does NOT copy the NTFS system access control lists (SACLs),
     * which are used by administrators to log attempts to access a secured object.
     *
     * `OWNER_DACL_SACL` : For each copied object, DataSync copies the following metadata:
     *
     * * Object owner.
     * * NTFS discretionary access control lists (DACLs), which determine whether to grant access to
     * an object.
     * * NTFS system access control lists (SACLs), which are used by administrators to log attempts
     * to access a secured object.
     *
     * Copying SACLs requires granting additional permissions to the Windows user that DataSync uses
     * to access your SMB location. For information about choosing a user that ensures sufficient
     * permissions to files, folders, and metadata, see
     * [user](https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#SMBuser) .
     *
     * `NONE` : None of the SMB security descriptor components are copied. Destination objects are
     * owned by the user that was provided for accessing the destination location. DACLs and SACLs are
     * set based on the destination server’s configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-securitydescriptorcopyflags)
     */
    public fun securityDescriptorCopyFlags(): String? =
        unwrap(this).getSecurityDescriptorCopyFlags()

    /**
     * Specifies whether your transfer tasks should be put into a queue during certain scenarios
     * when [running multiple
     * tasks](https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#running-multiple-tasks)
     * . This is `ENABLED` by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-taskqueueing)
     */
    public fun taskQueueing(): String? = unwrap(this).getTaskQueueing()

    /**
     * A value that determines whether DataSync transfers only the data and metadata that differ
     * between the source and the destination location, or whether DataSync transfers all the content
     * from the source, without comparing it to the destination location.
     *
     * `CHANGED` : DataSync copies only data or metadata that is new or different from the source
     * location to the destination location.
     *
     * `ALL` : DataSync copies all source location content to the destination, without comparing it
     * to existing content on the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-transfermode)
     */
    public fun transferMode(): String? = unwrap(this).getTransferMode()

    /**
     * The user ID (UID) of the file's owner.
     *
     * Default value: `INT_VALUE`
     *
     * `INT_VALUE` : Preserve the integer value of the UID and group ID (GID) (recommended).
     *
     * `NAME` : Currently not supported
     *
     * `NONE` : Ignore the UID and GID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-uid)
     */
    public fun uid(): String? = unwrap(this).getUid()

    /**
     * A value that determines whether a data integrity verification is performed at the end of a
     * task execution after all data and metadata have been transferred.
     *
     * For more information, see [Configure task
     * settings](https://docs.aws.amazon.com/datasync/latest/userguide/create-task.html) .
     *
     * Default value: `POINT_IN_TIME_CONSISTENT`
     *
     * `ONLY_FILES_TRANSFERRED` (recommended): Perform verification only on files that were
     * transferred.
     *
     * `POINT_IN_TIME_CONSISTENT` : Scan the entire source and entire destination at the end of the
     * transfer to verify that the source and destination are fully synchronized. This option isn't
     * supported when transferring to S3 Glacier or S3 Glacier Deep Archive storage classes.
     *
     * `NONE` : No additional verification is done at the end of the transfer, but all data
     * transmissions are integrity-checked with checksum verification during the transfer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-verifymode)
     */
    public fun verifyMode(): String? = unwrap(this).getVerifyMode()

    /**
     * A builder for [OptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param atime A file metadata value that shows the last time that a file was accessed (that
       * is, when the file was read or written to).
       * If you set `Atime` to `BEST_EFFORT` , AWS DataSync attempts to preserve the original
       * `Atime` attribute on all source files (that is, the version before the PREPARING phase).
       * However, `Atime` 's behavior is not fully standard across platforms, so AWS DataSync can only
       * do this on a best-effort basis.
       *
       * Default value: `BEST_EFFORT`
       *
       * `BEST_EFFORT` : Attempt to preserve the per-file `Atime` value (recommended).
       *
       * `NONE` : Ignore `Atime` .
       *
       *
       * If `Atime` is set to `BEST_EFFORT` , `Mtime` must be set to `PRESERVE` .
       *
       * If `Atime` is set to `NONE` , `Mtime` must also be `NONE` .
       */
      public fun atime(atime: String)

      /**
       * @param bytesPerSecond A value that limits the bandwidth used by AWS DataSync .
       * For example, if you want AWS DataSync to use a maximum of 1 MB, set this value to `1048576`
       * (=1024*1024).
       */
      public fun bytesPerSecond(bytesPerSecond: Number)

      /**
       * @param gid The group ID (GID) of the file's owners.
       * Default value: `INT_VALUE`
       *
       * `INT_VALUE` : Preserve the integer value of the user ID (UID) and group ID (GID)
       * (recommended).
       *
       * `NAME` : Currently not supported.
       *
       * `NONE` : Ignore the UID and GID.
       */
      public fun gid(gid: String)

      /**
       * @param logLevel Specifies the type of logs that DataSync publishes to a Amazon CloudWatch
       * Logs log group.
       * To specify the log group, see
       * [CloudWatchLogGroupArn](https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-CloudWatchLogGroupArn)
       * .
       *
       * * `BASIC` - Publishes logs with only basic information (such as transfer errors).
       * * `TRANSFER` - Publishes logs for all files or objects that your DataSync task transfers
       * and performs data-integrity checks on.
       * * `OFF` - No logs are published.
       */
      public fun logLevel(logLevel: String)

      /**
       * @param mtime A value that indicates the last time that a file was modified (that is, a file
       * was written to) before the PREPARING phase.
       * This option is required for cases when you need to run the same task more than one time.
       *
       * Default value: `PRESERVE`
       *
       * `PRESERVE` : Preserve original `Mtime` (recommended)
       *
       * `NONE` : Ignore `Mtime` .
       *
       *
       * If `Mtime` is set to `PRESERVE` , `Atime` must be set to `BEST_EFFORT` .
       *
       * If `Mtime` is set to `NONE` , `Atime` must also be set to `NONE` .
       */
      public fun mtime(mtime: String)

      /**
       * @param objectTags Specifies whether you want DataSync to `PRESERVE` object tags (default
       * behavior) when transferring between object storage systems.
       * If you want your DataSync task to ignore object tags, specify the `NONE` value.
       */
      public fun objectTags(objectTags: String)

      /**
       * @param overwriteMode Specifies whether DataSync should modify or preserve data at the
       * destination location.
       * * `ALWAYS` (default) - DataSync modifies data in the destination location when source data
       * (including metadata) has changed.
       *
       * If DataSync overwrites objects, you might incur additional charges for certain Amazon S3
       * storage classes (for example, for retrieval or early deletion). For more information, see
       * [Storage class considerations with Amazon S3
       * transfers](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
       * .
       *
       * * `NEVER` - DataSync doesn't overwrite data in the destination location even if the source
       * data has changed. You can use this option to protect against overwriting changes made to files
       * or objects in the destination.
       */
      public fun overwriteMode(overwriteMode: String)

      /**
       * @param posixPermissions A value that determines which users or groups can access a file for
       * a specific purpose, such as reading, writing, or execution of the file.
       * This option should be set only for Network File System (NFS), Amazon EFS, and Amazon S3
       * locations. For more information about what metadata is copied by DataSync, see [Metadata
       * Copied by
       * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied)
       * .
       *
       * Default value: `PRESERVE`
       *
       * `PRESERVE` : Preserve POSIX-style permissions (recommended).
       *
       * `NONE` : Ignore permissions.
       *
       *
       * AWS DataSync can preserve extant permissions of a source location.
       */
      public fun posixPermissions(posixPermissions: String)

      /**
       * @param preserveDeletedFiles A value that specifies whether files in the destination that
       * don't exist in the source file system are preserved.
       * This option can affect your storage costs. If your task deletes objects, you might incur
       * minimum storage duration charges for certain storage classes. For detailed information, see
       * [Considerations when working with Amazon S3 storage classes in
       * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
       * in the *AWS DataSync User Guide* .
       *
       * Default value: `PRESERVE`
       *
       * `PRESERVE` : Ignore destination files that aren't present in the source (recommended).
       *
       * `REMOVE` : Delete destination files that aren't present in the source.
       */
      public fun preserveDeletedFiles(preserveDeletedFiles: String)

      /**
       * @param preserveDevices A value that determines whether AWS DataSync should preserve the
       * metadata of block and character devices in the source file system, and re-create the files
       * with that device name and metadata on the destination.
       * DataSync does not copy the contents of such devices, only the name and metadata.
       *
       *
       * AWS DataSync can't sync the actual contents of such devices, because they are nonterminal
       * and don't return an end-of-file (EOF) marker.
       *
       *
       * Default value: `NONE`
       *
       * `NONE` : Ignore special devices (recommended).
       *
       * `PRESERVE` : Preserve character and block device metadata. This option isn't currently
       * supported for Amazon EFS.
       */
      public fun preserveDevices(preserveDevices: String)

      /**
       * @param securityDescriptorCopyFlags A value that determines which components of the SMB
       * security descriptor are copied from source to destination objects.
       * This value is only used for transfers between SMB and Amazon FSx for Windows File Server
       * locations, or between two Amazon FSx for Windows File Server locations. For more information
       * about how DataSync handles metadata, see [How DataSync Handles Metadata and Special
       * Files](https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html) .
       *
       * Default value: `OWNER_DACL`
       *
       * `OWNER_DACL` : For each copied object, DataSync copies the following metadata:
       *
       * * Object owner.
       * * NTFS discretionary access control lists (DACLs), which determine whether to grant access
       * to an object.
       *
       * When you use option, DataSync does NOT copy the NTFS system access control lists (SACLs),
       * which are used by administrators to log attempts to access a secured object.
       *
       * `OWNER_DACL_SACL` : For each copied object, DataSync copies the following metadata:
       *
       * * Object owner.
       * * NTFS discretionary access control lists (DACLs), which determine whether to grant access
       * to an object.
       * * NTFS system access control lists (SACLs), which are used by administrators to log
       * attempts to access a secured object.
       *
       * Copying SACLs requires granting additional permissions to the Windows user that DataSync
       * uses to access your SMB location. For information about choosing a user that ensures
       * sufficient permissions to files, folders, and metadata, see
       * [user](https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#SMBuser)
       * .
       *
       * `NONE` : None of the SMB security descriptor components are copied. Destination objects are
       * owned by the user that was provided for accessing the destination location. DACLs and SACLs
       * are set based on the destination server’s configuration.
       */
      public fun securityDescriptorCopyFlags(securityDescriptorCopyFlags: String)

      /**
       * @param taskQueueing Specifies whether your transfer tasks should be put into a queue during
       * certain scenarios when [running multiple
       * tasks](https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#running-multiple-tasks)
       * . This is `ENABLED` by default.
       */
      public fun taskQueueing(taskQueueing: String)

      /**
       * @param transferMode A value that determines whether DataSync transfers only the data and
       * metadata that differ between the source and the destination location, or whether DataSync
       * transfers all the content from the source, without comparing it to the destination location.
       * `CHANGED` : DataSync copies only data or metadata that is new or different from the source
       * location to the destination location.
       *
       * `ALL` : DataSync copies all source location content to the destination, without comparing
       * it to existing content on the destination.
       */
      public fun transferMode(transferMode: String)

      /**
       * @param uid The user ID (UID) of the file's owner.
       * Default value: `INT_VALUE`
       *
       * `INT_VALUE` : Preserve the integer value of the UID and group ID (GID) (recommended).
       *
       * `NAME` : Currently not supported
       *
       * `NONE` : Ignore the UID and GID.
       */
      public fun uid(uid: String)

      /**
       * @param verifyMode A value that determines whether a data integrity verification is
       * performed at the end of a task execution after all data and metadata have been transferred.
       * For more information, see [Configure task
       * settings](https://docs.aws.amazon.com/datasync/latest/userguide/create-task.html) .
       *
       * Default value: `POINT_IN_TIME_CONSISTENT`
       *
       * `ONLY_FILES_TRANSFERRED` (recommended): Perform verification only on files that were
       * transferred.
       *
       * `POINT_IN_TIME_CONSISTENT` : Scan the entire source and entire destination at the end of
       * the transfer to verify that the source and destination are fully synchronized. This option
       * isn't supported when transferring to S3 Glacier or S3 Glacier Deep Archive storage classes.
       *
       * `NONE` : No additional verification is done at the end of the transfer, but all data
       * transmissions are integrity-checked with checksum verification during the transfer.
       */
      public fun verifyMode(verifyMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnTask.OptionsProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnTask.OptionsProperty.builder()

      /**
       * @param atime A file metadata value that shows the last time that a file was accessed (that
       * is, when the file was read or written to).
       * If you set `Atime` to `BEST_EFFORT` , AWS DataSync attempts to preserve the original
       * `Atime` attribute on all source files (that is, the version before the PREPARING phase).
       * However, `Atime` 's behavior is not fully standard across platforms, so AWS DataSync can only
       * do this on a best-effort basis.
       *
       * Default value: `BEST_EFFORT`
       *
       * `BEST_EFFORT` : Attempt to preserve the per-file `Atime` value (recommended).
       *
       * `NONE` : Ignore `Atime` .
       *
       *
       * If `Atime` is set to `BEST_EFFORT` , `Mtime` must be set to `PRESERVE` .
       *
       * If `Atime` is set to `NONE` , `Mtime` must also be `NONE` .
       */
      override fun atime(atime: String) {
        cdkBuilder.atime(atime)
      }

      /**
       * @param bytesPerSecond A value that limits the bandwidth used by AWS DataSync .
       * For example, if you want AWS DataSync to use a maximum of 1 MB, set this value to `1048576`
       * (=1024*1024).
       */
      override fun bytesPerSecond(bytesPerSecond: Number) {
        cdkBuilder.bytesPerSecond(bytesPerSecond)
      }

      /**
       * @param gid The group ID (GID) of the file's owners.
       * Default value: `INT_VALUE`
       *
       * `INT_VALUE` : Preserve the integer value of the user ID (UID) and group ID (GID)
       * (recommended).
       *
       * `NAME` : Currently not supported.
       *
       * `NONE` : Ignore the UID and GID.
       */
      override fun gid(gid: String) {
        cdkBuilder.gid(gid)
      }

      /**
       * @param logLevel Specifies the type of logs that DataSync publishes to a Amazon CloudWatch
       * Logs log group.
       * To specify the log group, see
       * [CloudWatchLogGroupArn](https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-CloudWatchLogGroupArn)
       * .
       *
       * * `BASIC` - Publishes logs with only basic information (such as transfer errors).
       * * `TRANSFER` - Publishes logs for all files or objects that your DataSync task transfers
       * and performs data-integrity checks on.
       * * `OFF` - No logs are published.
       */
      override fun logLevel(logLevel: String) {
        cdkBuilder.logLevel(logLevel)
      }

      /**
       * @param mtime A value that indicates the last time that a file was modified (that is, a file
       * was written to) before the PREPARING phase.
       * This option is required for cases when you need to run the same task more than one time.
       *
       * Default value: `PRESERVE`
       *
       * `PRESERVE` : Preserve original `Mtime` (recommended)
       *
       * `NONE` : Ignore `Mtime` .
       *
       *
       * If `Mtime` is set to `PRESERVE` , `Atime` must be set to `BEST_EFFORT` .
       *
       * If `Mtime` is set to `NONE` , `Atime` must also be set to `NONE` .
       */
      override fun mtime(mtime: String) {
        cdkBuilder.mtime(mtime)
      }

      /**
       * @param objectTags Specifies whether you want DataSync to `PRESERVE` object tags (default
       * behavior) when transferring between object storage systems.
       * If you want your DataSync task to ignore object tags, specify the `NONE` value.
       */
      override fun objectTags(objectTags: String) {
        cdkBuilder.objectTags(objectTags)
      }

      /**
       * @param overwriteMode Specifies whether DataSync should modify or preserve data at the
       * destination location.
       * * `ALWAYS` (default) - DataSync modifies data in the destination location when source data
       * (including metadata) has changed.
       *
       * If DataSync overwrites objects, you might incur additional charges for certain Amazon S3
       * storage classes (for example, for retrieval or early deletion). For more information, see
       * [Storage class considerations with Amazon S3
       * transfers](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
       * .
       *
       * * `NEVER` - DataSync doesn't overwrite data in the destination location even if the source
       * data has changed. You can use this option to protect against overwriting changes made to files
       * or objects in the destination.
       */
      override fun overwriteMode(overwriteMode: String) {
        cdkBuilder.overwriteMode(overwriteMode)
      }

      /**
       * @param posixPermissions A value that determines which users or groups can access a file for
       * a specific purpose, such as reading, writing, or execution of the file.
       * This option should be set only for Network File System (NFS), Amazon EFS, and Amazon S3
       * locations. For more information about what metadata is copied by DataSync, see [Metadata
       * Copied by
       * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied)
       * .
       *
       * Default value: `PRESERVE`
       *
       * `PRESERVE` : Preserve POSIX-style permissions (recommended).
       *
       * `NONE` : Ignore permissions.
       *
       *
       * AWS DataSync can preserve extant permissions of a source location.
       */
      override fun posixPermissions(posixPermissions: String) {
        cdkBuilder.posixPermissions(posixPermissions)
      }

      /**
       * @param preserveDeletedFiles A value that specifies whether files in the destination that
       * don't exist in the source file system are preserved.
       * This option can affect your storage costs. If your task deletes objects, you might incur
       * minimum storage duration charges for certain storage classes. For detailed information, see
       * [Considerations when working with Amazon S3 storage classes in
       * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
       * in the *AWS DataSync User Guide* .
       *
       * Default value: `PRESERVE`
       *
       * `PRESERVE` : Ignore destination files that aren't present in the source (recommended).
       *
       * `REMOVE` : Delete destination files that aren't present in the source.
       */
      override fun preserveDeletedFiles(preserveDeletedFiles: String) {
        cdkBuilder.preserveDeletedFiles(preserveDeletedFiles)
      }

      /**
       * @param preserveDevices A value that determines whether AWS DataSync should preserve the
       * metadata of block and character devices in the source file system, and re-create the files
       * with that device name and metadata on the destination.
       * DataSync does not copy the contents of such devices, only the name and metadata.
       *
       *
       * AWS DataSync can't sync the actual contents of such devices, because they are nonterminal
       * and don't return an end-of-file (EOF) marker.
       *
       *
       * Default value: `NONE`
       *
       * `NONE` : Ignore special devices (recommended).
       *
       * `PRESERVE` : Preserve character and block device metadata. This option isn't currently
       * supported for Amazon EFS.
       */
      override fun preserveDevices(preserveDevices: String) {
        cdkBuilder.preserveDevices(preserveDevices)
      }

      /**
       * @param securityDescriptorCopyFlags A value that determines which components of the SMB
       * security descriptor are copied from source to destination objects.
       * This value is only used for transfers between SMB and Amazon FSx for Windows File Server
       * locations, or between two Amazon FSx for Windows File Server locations. For more information
       * about how DataSync handles metadata, see [How DataSync Handles Metadata and Special
       * Files](https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html) .
       *
       * Default value: `OWNER_DACL`
       *
       * `OWNER_DACL` : For each copied object, DataSync copies the following metadata:
       *
       * * Object owner.
       * * NTFS discretionary access control lists (DACLs), which determine whether to grant access
       * to an object.
       *
       * When you use option, DataSync does NOT copy the NTFS system access control lists (SACLs),
       * which are used by administrators to log attempts to access a secured object.
       *
       * `OWNER_DACL_SACL` : For each copied object, DataSync copies the following metadata:
       *
       * * Object owner.
       * * NTFS discretionary access control lists (DACLs), which determine whether to grant access
       * to an object.
       * * NTFS system access control lists (SACLs), which are used by administrators to log
       * attempts to access a secured object.
       *
       * Copying SACLs requires granting additional permissions to the Windows user that DataSync
       * uses to access your SMB location. For information about choosing a user that ensures
       * sufficient permissions to files, folders, and metadata, see
       * [user](https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#SMBuser)
       * .
       *
       * `NONE` : None of the SMB security descriptor components are copied. Destination objects are
       * owned by the user that was provided for accessing the destination location. DACLs and SACLs
       * are set based on the destination server’s configuration.
       */
      override fun securityDescriptorCopyFlags(securityDescriptorCopyFlags: String) {
        cdkBuilder.securityDescriptorCopyFlags(securityDescriptorCopyFlags)
      }

      /**
       * @param taskQueueing Specifies whether your transfer tasks should be put into a queue during
       * certain scenarios when [running multiple
       * tasks](https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#running-multiple-tasks)
       * . This is `ENABLED` by default.
       */
      override fun taskQueueing(taskQueueing: String) {
        cdkBuilder.taskQueueing(taskQueueing)
      }

      /**
       * @param transferMode A value that determines whether DataSync transfers only the data and
       * metadata that differ between the source and the destination location, or whether DataSync
       * transfers all the content from the source, without comparing it to the destination location.
       * `CHANGED` : DataSync copies only data or metadata that is new or different from the source
       * location to the destination location.
       *
       * `ALL` : DataSync copies all source location content to the destination, without comparing
       * it to existing content on the destination.
       */
      override fun transferMode(transferMode: String) {
        cdkBuilder.transferMode(transferMode)
      }

      /**
       * @param uid The user ID (UID) of the file's owner.
       * Default value: `INT_VALUE`
       *
       * `INT_VALUE` : Preserve the integer value of the UID and group ID (GID) (recommended).
       *
       * `NAME` : Currently not supported
       *
       * `NONE` : Ignore the UID and GID.
       */
      override fun uid(uid: String) {
        cdkBuilder.uid(uid)
      }

      /**
       * @param verifyMode A value that determines whether a data integrity verification is
       * performed at the end of a task execution after all data and metadata have been transferred.
       * For more information, see [Configure task
       * settings](https://docs.aws.amazon.com/datasync/latest/userguide/create-task.html) .
       *
       * Default value: `POINT_IN_TIME_CONSISTENT`
       *
       * `ONLY_FILES_TRANSFERRED` (recommended): Perform verification only on files that were
       * transferred.
       *
       * `POINT_IN_TIME_CONSISTENT` : Scan the entire source and entire destination at the end of
       * the transfer to verify that the source and destination are fully synchronized. This option
       * isn't supported when transferring to S3 Glacier or S3 Glacier Deep Archive storage classes.
       *
       * `NONE` : No additional verification is done at the end of the transfer, but all data
       * transmissions are integrity-checked with checksum verification during the transfer.
       */
      override fun verifyMode(verifyMode: String) {
        cdkBuilder.verifyMode(verifyMode)
      }

      public fun build(): software.amazon.awscdk.services.datasync.CfnTask.OptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datasync.CfnTask.OptionsProperty,
    ) : CdkObject(cdkObject), OptionsProperty {
      /**
       * A file metadata value that shows the last time that a file was accessed (that is, when the
       * file was read or written to).
       *
       * If you set `Atime` to `BEST_EFFORT` , AWS DataSync attempts to preserve the original
       * `Atime` attribute on all source files (that is, the version before the PREPARING phase).
       * However, `Atime` 's behavior is not fully standard across platforms, so AWS DataSync can only
       * do this on a best-effort basis.
       *
       * Default value: `BEST_EFFORT`
       *
       * `BEST_EFFORT` : Attempt to preserve the per-file `Atime` value (recommended).
       *
       * `NONE` : Ignore `Atime` .
       *
       *
       * If `Atime` is set to `BEST_EFFORT` , `Mtime` must be set to `PRESERVE` .
       *
       * If `Atime` is set to `NONE` , `Mtime` must also be `NONE` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-atime)
       */
      override fun atime(): String? = unwrap(this).getAtime()

      /**
       * A value that limits the bandwidth used by AWS DataSync .
       *
       * For example, if you want AWS DataSync to use a maximum of 1 MB, set this value to `1048576`
       * (=1024*1024).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-bytespersecond)
       */
      override fun bytesPerSecond(): Number? = unwrap(this).getBytesPerSecond()

      /**
       * The group ID (GID) of the file's owners.
       *
       * Default value: `INT_VALUE`
       *
       * `INT_VALUE` : Preserve the integer value of the user ID (UID) and group ID (GID)
       * (recommended).
       *
       * `NAME` : Currently not supported.
       *
       * `NONE` : Ignore the UID and GID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-gid)
       */
      override fun gid(): String? = unwrap(this).getGid()

      /**
       * Specifies the type of logs that DataSync publishes to a Amazon CloudWatch Logs log group.
       *
       * To specify the log group, see
       * [CloudWatchLogGroupArn](https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-CloudWatchLogGroupArn)
       * .
       *
       * * `BASIC` - Publishes logs with only basic information (such as transfer errors).
       * * `TRANSFER` - Publishes logs for all files or objects that your DataSync task transfers
       * and performs data-integrity checks on.
       * * `OFF` - No logs are published.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-loglevel)
       */
      override fun logLevel(): String? = unwrap(this).getLogLevel()

      /**
       * A value that indicates the last time that a file was modified (that is, a file was written
       * to) before the PREPARING phase.
       *
       * This option is required for cases when you need to run the same task more than one time.
       *
       * Default value: `PRESERVE`
       *
       * `PRESERVE` : Preserve original `Mtime` (recommended)
       *
       * `NONE` : Ignore `Mtime` .
       *
       *
       * If `Mtime` is set to `PRESERVE` , `Atime` must be set to `BEST_EFFORT` .
       *
       * If `Mtime` is set to `NONE` , `Atime` must also be set to `NONE` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-mtime)
       */
      override fun mtime(): String? = unwrap(this).getMtime()

      /**
       * Specifies whether you want DataSync to `PRESERVE` object tags (default behavior) when
       * transferring between object storage systems.
       *
       * If you want your DataSync task to ignore object tags, specify the `NONE` value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-objecttags)
       */
      override fun objectTags(): String? = unwrap(this).getObjectTags()

      /**
       * Specifies whether DataSync should modify or preserve data at the destination location.
       *
       * * `ALWAYS` (default) - DataSync modifies data in the destination location when source data
       * (including metadata) has changed.
       *
       * If DataSync overwrites objects, you might incur additional charges for certain Amazon S3
       * storage classes (for example, for retrieval or early deletion). For more information, see
       * [Storage class considerations with Amazon S3
       * transfers](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
       * .
       *
       * * `NEVER` - DataSync doesn't overwrite data in the destination location even if the source
       * data has changed. You can use this option to protect against overwriting changes made to files
       * or objects in the destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-overwritemode)
       */
      override fun overwriteMode(): String? = unwrap(this).getOverwriteMode()

      /**
       * A value that determines which users or groups can access a file for a specific purpose,
       * such as reading, writing, or execution of the file.
       *
       * This option should be set only for Network File System (NFS), Amazon EFS, and Amazon S3
       * locations. For more information about what metadata is copied by DataSync, see [Metadata
       * Copied by
       * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied)
       * .
       *
       * Default value: `PRESERVE`
       *
       * `PRESERVE` : Preserve POSIX-style permissions (recommended).
       *
       * `NONE` : Ignore permissions.
       *
       *
       * AWS DataSync can preserve extant permissions of a source location.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-posixpermissions)
       */
      override fun posixPermissions(): String? = unwrap(this).getPosixPermissions()

      /**
       * A value that specifies whether files in the destination that don't exist in the source file
       * system are preserved.
       *
       * This option can affect your storage costs. If your task deletes objects, you might incur
       * minimum storage duration charges for certain storage classes. For detailed information, see
       * [Considerations when working with Amazon S3 storage classes in
       * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
       * in the *AWS DataSync User Guide* .
       *
       * Default value: `PRESERVE`
       *
       * `PRESERVE` : Ignore destination files that aren't present in the source (recommended).
       *
       * `REMOVE` : Delete destination files that aren't present in the source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-preservedeletedfiles)
       */
      override fun preserveDeletedFiles(): String? = unwrap(this).getPreserveDeletedFiles()

      /**
       * A value that determines whether AWS DataSync should preserve the metadata of block and
       * character devices in the source file system, and re-create the files with that device name and
       * metadata on the destination.
       *
       * DataSync does not copy the contents of such devices, only the name and metadata.
       *
       *
       * AWS DataSync can't sync the actual contents of such devices, because they are nonterminal
       * and don't return an end-of-file (EOF) marker.
       *
       *
       * Default value: `NONE`
       *
       * `NONE` : Ignore special devices (recommended).
       *
       * `PRESERVE` : Preserve character and block device metadata. This option isn't currently
       * supported for Amazon EFS.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-preservedevices)
       */
      override fun preserveDevices(): String? = unwrap(this).getPreserveDevices()

      /**
       * A value that determines which components of the SMB security descriptor are copied from
       * source to destination objects.
       *
       * This value is only used for transfers between SMB and Amazon FSx for Windows File Server
       * locations, or between two Amazon FSx for Windows File Server locations. For more information
       * about how DataSync handles metadata, see [How DataSync Handles Metadata and Special
       * Files](https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html) .
       *
       * Default value: `OWNER_DACL`
       *
       * `OWNER_DACL` : For each copied object, DataSync copies the following metadata:
       *
       * * Object owner.
       * * NTFS discretionary access control lists (DACLs), which determine whether to grant access
       * to an object.
       *
       * When you use option, DataSync does NOT copy the NTFS system access control lists (SACLs),
       * which are used by administrators to log attempts to access a secured object.
       *
       * `OWNER_DACL_SACL` : For each copied object, DataSync copies the following metadata:
       *
       * * Object owner.
       * * NTFS discretionary access control lists (DACLs), which determine whether to grant access
       * to an object.
       * * NTFS system access control lists (SACLs), which are used by administrators to log
       * attempts to access a secured object.
       *
       * Copying SACLs requires granting additional permissions to the Windows user that DataSync
       * uses to access your SMB location. For information about choosing a user that ensures
       * sufficient permissions to files, folders, and metadata, see
       * [user](https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#SMBuser)
       * .
       *
       * `NONE` : None of the SMB security descriptor components are copied. Destination objects are
       * owned by the user that was provided for accessing the destination location. DACLs and SACLs
       * are set based on the destination server’s configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-securitydescriptorcopyflags)
       */
      override fun securityDescriptorCopyFlags(): String? =
          unwrap(this).getSecurityDescriptorCopyFlags()

      /**
       * Specifies whether your transfer tasks should be put into a queue during certain scenarios
       * when [running multiple
       * tasks](https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#running-multiple-tasks)
       * . This is `ENABLED` by default.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-taskqueueing)
       */
      override fun taskQueueing(): String? = unwrap(this).getTaskQueueing()

      /**
       * A value that determines whether DataSync transfers only the data and metadata that differ
       * between the source and the destination location, or whether DataSync transfers all the content
       * from the source, without comparing it to the destination location.
       *
       * `CHANGED` : DataSync copies only data or metadata that is new or different from the source
       * location to the destination location.
       *
       * `ALL` : DataSync copies all source location content to the destination, without comparing
       * it to existing content on the destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-transfermode)
       */
      override fun transferMode(): String? = unwrap(this).getTransferMode()

      /**
       * The user ID (UID) of the file's owner.
       *
       * Default value: `INT_VALUE`
       *
       * `INT_VALUE` : Preserve the integer value of the UID and group ID (GID) (recommended).
       *
       * `NAME` : Currently not supported
       *
       * `NONE` : Ignore the UID and GID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-uid)
       */
      override fun uid(): String? = unwrap(this).getUid()

      /**
       * A value that determines whether a data integrity verification is performed at the end of a
       * task execution after all data and metadata have been transferred.
       *
       * For more information, see [Configure task
       * settings](https://docs.aws.amazon.com/datasync/latest/userguide/create-task.html) .
       *
       * Default value: `POINT_IN_TIME_CONSISTENT`
       *
       * `ONLY_FILES_TRANSFERRED` (recommended): Perform verification only on files that were
       * transferred.
       *
       * `POINT_IN_TIME_CONSISTENT` : Scan the entire source and entire destination at the end of
       * the transfer to verify that the source and destination are fully synchronized. This option
       * isn't supported when transferring to S3 Glacier or S3 Glacier Deep Archive storage classes.
       *
       * `NONE` : No additional verification is done at the end of the transfer, but all data
       * transmissions are integrity-checked with checksum verification during the transfer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html#cfn-datasync-task-options-verifymode)
       */
      override fun verifyMode(): String? = unwrap(this).getVerifyMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnTask.OptionsProperty):
          OptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? OptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OptionsProperty):
          software.amazon.awscdk.services.datasync.CfnTask.OptionsProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnTask.OptionsProperty
    }
  }

  /**
   * Customizes the reporting level for aspects of your task report.
   *
   * For example, your report might generally only include errors, but you could specify that you
   * want a list of successes and errors just for the files that DataSync attempted to delete in your
   * destination location.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datasync.*;
   * OverridesProperty overridesProperty = OverridesProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-overrides.html)
   */
  public interface OverridesProperty {
    /**
     * Specifies the level of reporting for the files, objects, and directories that DataSync
     * attempted to delete in your destination location.
     *
     * This only applies if you [configure your
     * task](https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html) to delete
     * data in the destination that isn't in the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-overrides.html#cfn-datasync-task-overrides-deleted)
     */
    public fun deleted(): Any? = unwrap(this).getDeleted()

    /**
     * Specifies the level of reporting for the files, objects, and directories that DataSync
     * attempted to skip during your transfer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-overrides.html#cfn-datasync-task-overrides-skipped)
     */
    public fun skipped(): Any? = unwrap(this).getSkipped()

    /**
     * Specifies the level of reporting for the files, objects, and directories that DataSync
     * attempted to transfer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-overrides.html#cfn-datasync-task-overrides-transferred)
     */
    public fun transferred(): Any? = unwrap(this).getTransferred()

    /**
     * Specifies the level of reporting for the files, objects, and directories that DataSync
     * attempted to verify during your transfer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-overrides.html#cfn-datasync-task-overrides-verified)
     */
    public fun verified(): Any? = unwrap(this).getVerified()

    /**
     * A builder for [OverridesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deleted Specifies the level of reporting for the files, objects, and directories
       * that DataSync attempted to delete in your destination location.
       * This only applies if you [configure your
       * task](https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html) to delete
       * data in the destination that isn't in the source.
       */
      public fun deleted(deleted: IResolvable)

      /**
       * @param deleted Specifies the level of reporting for the files, objects, and directories
       * that DataSync attempted to delete in your destination location.
       * This only applies if you [configure your
       * task](https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html) to delete
       * data in the destination that isn't in the source.
       */
      public fun deleted(deleted: DeletedProperty)

      /**
       * @param deleted Specifies the level of reporting for the files, objects, and directories
       * that DataSync attempted to delete in your destination location.
       * This only applies if you [configure your
       * task](https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html) to delete
       * data in the destination that isn't in the source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("178ba2b5cf2ea2064355ea97986f3eb26a133c25410c0cd8a534e038d634e103")
      public fun deleted(deleted: DeletedProperty.Builder.() -> Unit)

      /**
       * @param skipped Specifies the level of reporting for the files, objects, and directories
       * that DataSync attempted to skip during your transfer.
       */
      public fun skipped(skipped: IResolvable)

      /**
       * @param skipped Specifies the level of reporting for the files, objects, and directories
       * that DataSync attempted to skip during your transfer.
       */
      public fun skipped(skipped: SkippedProperty)

      /**
       * @param skipped Specifies the level of reporting for the files, objects, and directories
       * that DataSync attempted to skip during your transfer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a8634100c7e7679d1298a9e8c62ef0e782009db9965eb037d9f30f19f4dec76")
      public fun skipped(skipped: SkippedProperty.Builder.() -> Unit)

      /**
       * @param transferred Specifies the level of reporting for the files, objects, and directories
       * that DataSync attempted to transfer.
       */
      public fun transferred(transferred: IResolvable)

      /**
       * @param transferred Specifies the level of reporting for the files, objects, and directories
       * that DataSync attempted to transfer.
       */
      public fun transferred(transferred: TransferredProperty)

      /**
       * @param transferred Specifies the level of reporting for the files, objects, and directories
       * that DataSync attempted to transfer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("867ccf2419e9301cde6a783a341d38eb0896e2ac7c58c19f1fb9e34a7bc656f3")
      public fun transferred(transferred: TransferredProperty.Builder.() -> Unit)

      /**
       * @param verified Specifies the level of reporting for the files, objects, and directories
       * that DataSync attempted to verify during your transfer.
       */
      public fun verified(verified: IResolvable)

      /**
       * @param verified Specifies the level of reporting for the files, objects, and directories
       * that DataSync attempted to verify during your transfer.
       */
      public fun verified(verified: VerifiedProperty)

      /**
       * @param verified Specifies the level of reporting for the files, objects, and directories
       * that DataSync attempted to verify during your transfer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6de5119e7772a304c44a8d224fb786e3b2b3c6fb013deaf42c69720fd3212640")
      public fun verified(verified: VerifiedProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnTask.OverridesProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnTask.OverridesProperty.builder()

      /**
       * @param deleted Specifies the level of reporting for the files, objects, and directories
       * that DataSync attempted to delete in your destination location.
       * This only applies if you [configure your
       * task](https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html) to delete
       * data in the destination that isn't in the source.
       */
      override fun deleted(deleted: IResolvable) {
        cdkBuilder.deleted(deleted.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param deleted Specifies the level of reporting for the files, objects, and directories
       * that DataSync attempted to delete in your destination location.
       * This only applies if you [configure your
       * task](https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html) to delete
       * data in the destination that isn't in the source.
       */
      override fun deleted(deleted: DeletedProperty) {
        cdkBuilder.deleted(deleted.let(DeletedProperty.Companion::unwrap))
      }

      /**
       * @param deleted Specifies the level of reporting for the files, objects, and directories
       * that DataSync attempted to delete in your destination location.
       * This only applies if you [configure your
       * task](https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html) to delete
       * data in the destination that isn't in the source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("178ba2b5cf2ea2064355ea97986f3eb26a133c25410c0cd8a534e038d634e103")
      override fun deleted(deleted: DeletedProperty.Builder.() -> Unit): Unit =
          deleted(DeletedProperty(deleted))

      /**
       * @param skipped Specifies the level of reporting for the files, objects, and directories
       * that DataSync attempted to skip during your transfer.
       */
      override fun skipped(skipped: IResolvable) {
        cdkBuilder.skipped(skipped.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param skipped Specifies the level of reporting for the files, objects, and directories
       * that DataSync attempted to skip during your transfer.
       */
      override fun skipped(skipped: SkippedProperty) {
        cdkBuilder.skipped(skipped.let(SkippedProperty.Companion::unwrap))
      }

      /**
       * @param skipped Specifies the level of reporting for the files, objects, and directories
       * that DataSync attempted to skip during your transfer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a8634100c7e7679d1298a9e8c62ef0e782009db9965eb037d9f30f19f4dec76")
      override fun skipped(skipped: SkippedProperty.Builder.() -> Unit): Unit =
          skipped(SkippedProperty(skipped))

      /**
       * @param transferred Specifies the level of reporting for the files, objects, and directories
       * that DataSync attempted to transfer.
       */
      override fun transferred(transferred: IResolvable) {
        cdkBuilder.transferred(transferred.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param transferred Specifies the level of reporting for the files, objects, and directories
       * that DataSync attempted to transfer.
       */
      override fun transferred(transferred: TransferredProperty) {
        cdkBuilder.transferred(transferred.let(TransferredProperty.Companion::unwrap))
      }

      /**
       * @param transferred Specifies the level of reporting for the files, objects, and directories
       * that DataSync attempted to transfer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("867ccf2419e9301cde6a783a341d38eb0896e2ac7c58c19f1fb9e34a7bc656f3")
      override fun transferred(transferred: TransferredProperty.Builder.() -> Unit): Unit =
          transferred(TransferredProperty(transferred))

      /**
       * @param verified Specifies the level of reporting for the files, objects, and directories
       * that DataSync attempted to verify during your transfer.
       */
      override fun verified(verified: IResolvable) {
        cdkBuilder.verified(verified.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param verified Specifies the level of reporting for the files, objects, and directories
       * that DataSync attempted to verify during your transfer.
       */
      override fun verified(verified: VerifiedProperty) {
        cdkBuilder.verified(verified.let(VerifiedProperty.Companion::unwrap))
      }

      /**
       * @param verified Specifies the level of reporting for the files, objects, and directories
       * that DataSync attempted to verify during your transfer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6de5119e7772a304c44a8d224fb786e3b2b3c6fb013deaf42c69720fd3212640")
      override fun verified(verified: VerifiedProperty.Builder.() -> Unit): Unit =
          verified(VerifiedProperty(verified))

      public fun build(): software.amazon.awscdk.services.datasync.CfnTask.OverridesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datasync.CfnTask.OverridesProperty,
    ) : CdkObject(cdkObject), OverridesProperty {
      /**
       * Specifies the level of reporting for the files, objects, and directories that DataSync
       * attempted to delete in your destination location.
       *
       * This only applies if you [configure your
       * task](https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html) to delete
       * data in the destination that isn't in the source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-overrides.html#cfn-datasync-task-overrides-deleted)
       */
      override fun deleted(): Any? = unwrap(this).getDeleted()

      /**
       * Specifies the level of reporting for the files, objects, and directories that DataSync
       * attempted to skip during your transfer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-overrides.html#cfn-datasync-task-overrides-skipped)
       */
      override fun skipped(): Any? = unwrap(this).getSkipped()

      /**
       * Specifies the level of reporting for the files, objects, and directories that DataSync
       * attempted to transfer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-overrides.html#cfn-datasync-task-overrides-transferred)
       */
      override fun transferred(): Any? = unwrap(this).getTransferred()

      /**
       * Specifies the level of reporting for the files, objects, and directories that DataSync
       * attempted to verify during your transfer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-overrides.html#cfn-datasync-task-overrides-verified)
       */
      override fun verified(): Any? = unwrap(this).getVerified()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OverridesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnTask.OverridesProperty):
          OverridesProperty = CdkObjectWrappers.wrap(cdkObject) as? OverridesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OverridesProperty):
          software.amazon.awscdk.services.datasync.CfnTask.OverridesProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnTask.OverridesProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datasync.*;
   * S3Property s3Property = S3Property.builder()
   * .bucketAccessRoleArn("bucketAccessRoleArn")
   * .s3BucketArn("s3BucketArn")
   * .subdirectory("subdirectory")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-s3.html)
   */
  public interface S3Property {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-s3.html#cfn-datasync-task-s3-bucketaccessrolearn)
     */
    public fun bucketAccessRoleArn(): String? = unwrap(this).getBucketAccessRoleArn()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-s3.html#cfn-datasync-task-s3-s3bucketarn)
     */
    public fun s3BucketArn(): String? = unwrap(this).getS3BucketArn()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-s3.html#cfn-datasync-task-s3-subdirectory)
     */
    public fun subdirectory(): String? = unwrap(this).getSubdirectory()

    /**
     * A builder for [S3Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketAccessRoleArn the value to be set.
       */
      public fun bucketAccessRoleArn(bucketAccessRoleArn: String)

      /**
       * @param s3BucketArn the value to be set.
       */
      public fun s3BucketArn(s3BucketArn: String)

      /**
       * @param subdirectory the value to be set.
       */
      public fun subdirectory(subdirectory: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnTask.S3Property.Builder =
          software.amazon.awscdk.services.datasync.CfnTask.S3Property.builder()

      /**
       * @param bucketAccessRoleArn the value to be set.
       */
      override fun bucketAccessRoleArn(bucketAccessRoleArn: String) {
        cdkBuilder.bucketAccessRoleArn(bucketAccessRoleArn)
      }

      /**
       * @param s3BucketArn the value to be set.
       */
      override fun s3BucketArn(s3BucketArn: String) {
        cdkBuilder.s3BucketArn(s3BucketArn)
      }

      /**
       * @param subdirectory the value to be set.
       */
      override fun subdirectory(subdirectory: String) {
        cdkBuilder.subdirectory(subdirectory)
      }

      public fun build(): software.amazon.awscdk.services.datasync.CfnTask.S3Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datasync.CfnTask.S3Property,
    ) : CdkObject(cdkObject), S3Property {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-s3.html#cfn-datasync-task-s3-bucketaccessrolearn)
       */
      override fun bucketAccessRoleArn(): String? = unwrap(this).getBucketAccessRoleArn()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-s3.html#cfn-datasync-task-s3-s3bucketarn)
       */
      override fun s3BucketArn(): String? = unwrap(this).getS3BucketArn()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-s3.html#cfn-datasync-task-s3-subdirectory)
       */
      override fun subdirectory(): String? = unwrap(this).getSubdirectory()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnTask.S3Property):
          S3Property = CdkObjectWrappers.wrap(cdkObject) as? S3Property ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3Property):
          software.amazon.awscdk.services.datasync.CfnTask.S3Property = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnTask.S3Property
    }
  }

  /**
   * The reporting level for the skipped section of your DataSync task report.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datasync.*;
   * SkippedProperty skippedProperty = SkippedProperty.builder()
   * .reportLevel("reportLevel")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-skipped.html)
   */
  public interface SkippedProperty {
    /**
     * Specifies whether you want your task report to include only what went wrong with your
     * transfer or a list of what succeeded and didn't.
     *
     * * `ERRORS_ONLY` : A report shows what DataSync was unable to skip.
     * * `SUCCESSES_AND_ERRORS` : A report shows what DataSync was able and unable to skip.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-skipped.html#cfn-datasync-task-skipped-reportlevel)
     */
    public fun reportLevel(): String? = unwrap(this).getReportLevel()

    /**
     * A builder for [SkippedProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param reportLevel Specifies whether you want your task report to include only what went
       * wrong with your transfer or a list of what succeeded and didn't.
       * * `ERRORS_ONLY` : A report shows what DataSync was unable to skip.
       * * `SUCCESSES_AND_ERRORS` : A report shows what DataSync was able and unable to skip.
       */
      public fun reportLevel(reportLevel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnTask.SkippedProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnTask.SkippedProperty.builder()

      /**
       * @param reportLevel Specifies whether you want your task report to include only what went
       * wrong with your transfer or a list of what succeeded and didn't.
       * * `ERRORS_ONLY` : A report shows what DataSync was unable to skip.
       * * `SUCCESSES_AND_ERRORS` : A report shows what DataSync was able and unable to skip.
       */
      override fun reportLevel(reportLevel: String) {
        cdkBuilder.reportLevel(reportLevel)
      }

      public fun build(): software.amazon.awscdk.services.datasync.CfnTask.SkippedProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datasync.CfnTask.SkippedProperty,
    ) : CdkObject(cdkObject), SkippedProperty {
      /**
       * Specifies whether you want your task report to include only what went wrong with your
       * transfer or a list of what succeeded and didn't.
       *
       * * `ERRORS_ONLY` : A report shows what DataSync was unable to skip.
       * * `SUCCESSES_AND_ERRORS` : A report shows what DataSync was able and unable to skip.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-skipped.html#cfn-datasync-task-skipped-reportlevel)
       */
      override fun reportLevel(): String? = unwrap(this).getReportLevel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SkippedProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnTask.SkippedProperty):
          SkippedProperty = CdkObjectWrappers.wrap(cdkObject) as? SkippedProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SkippedProperty):
          software.amazon.awscdk.services.datasync.CfnTask.SkippedProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnTask.SkippedProperty
    }
  }

  /**
   * Specifies the manifest that you want AWS DataSync to use and where it's hosted.
   *
   * For more information and configuration examples, see [Specifying what DataSync transfers by
   * using a
   * manifest](https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datasync.*;
   * SourceProperty sourceProperty = SourceProperty.builder()
   * .s3(ManifestConfigSourceS3Property.builder()
   * .bucketAccessRoleArn("bucketAccessRoleArn")
   * .manifestObjectPath("manifestObjectPath")
   * .manifestObjectVersionId("manifestObjectVersionId")
   * .s3BucketArn("s3BucketArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-source.html)
   */
  public interface SourceProperty {
    /**
     * Specifies the S3 bucket where you're hosting your manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-source.html#cfn-datasync-task-source-s3)
     */
    public fun s3(): Any? = unwrap(this).getS3()

    /**
     * A builder for [SourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3 Specifies the S3 bucket where you're hosting your manifest.
       */
      public fun s3(s3: IResolvable)

      /**
       * @param s3 Specifies the S3 bucket where you're hosting your manifest.
       */
      public fun s3(s3: ManifestConfigSourceS3Property)

      /**
       * @param s3 Specifies the S3 bucket where you're hosting your manifest.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c84797c8e89c694150a127c56ebc9c607a228975717c44e723edbef68f83f08")
      public fun s3(s3: ManifestConfigSourceS3Property.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnTask.SourceProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnTask.SourceProperty.builder()

      /**
       * @param s3 Specifies the S3 bucket where you're hosting your manifest.
       */
      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3 Specifies the S3 bucket where you're hosting your manifest.
       */
      override fun s3(s3: ManifestConfigSourceS3Property) {
        cdkBuilder.s3(s3.let(ManifestConfigSourceS3Property.Companion::unwrap))
      }

      /**
       * @param s3 Specifies the S3 bucket where you're hosting your manifest.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c84797c8e89c694150a127c56ebc9c607a228975717c44e723edbef68f83f08")
      override fun s3(s3: ManifestConfigSourceS3Property.Builder.() -> Unit): Unit =
          s3(ManifestConfigSourceS3Property(s3))

      public fun build(): software.amazon.awscdk.services.datasync.CfnTask.SourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datasync.CfnTask.SourceProperty,
    ) : CdkObject(cdkObject), SourceProperty {
      /**
       * Specifies the S3 bucket where you're hosting your manifest.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-source.html#cfn-datasync-task-source-s3)
       */
      override fun s3(): Any? = unwrap(this).getS3()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnTask.SourceProperty):
          SourceProperty = CdkObjectWrappers.wrap(cdkObject) as? SourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceProperty):
          software.amazon.awscdk.services.datasync.CfnTask.SourceProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnTask.SourceProperty
    }
  }

  /**
   * Specifies how you want to configure a task report, which provides detailed information about
   * for your AWS DataSync transfer.
   *
   * For more information, see [Task
   * reports](https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datasync.*;
   * TaskReportConfigProperty taskReportConfigProperty = TaskReportConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-taskreportconfig.html)
   */
  public interface TaskReportConfigProperty {
    /**
     * Specifies the Amazon S3 bucket where DataSync uploads your task report.
     *
     * For more information, see [Task
     * reports](https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html#task-report-access)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-taskreportconfig.html#cfn-datasync-task-taskreportconfig-destination)
     */
    public fun destination(): Any

    /**
     * Specifies whether your task report includes the new version of each object transferred into
     * an S3 bucket.
     *
     * This only applies if you [enable versioning on your
     * bucket](https://docs.aws.amazon.com/AmazonS3/latest/userguide/manage-versioning-examples.html) .
     * Keep in mind that setting this to `INCLUDE` can increase the duration of your task execution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-taskreportconfig.html#cfn-datasync-task-taskreportconfig-objectversionids)
     */
    public fun objectVersionIds(): String? = unwrap(this).getObjectVersionIds()

    /**
     * Specifies the type of task report that you want:.
     *
     * * `SUMMARY_ONLY` : Provides necessary details about your task, including the number of files,
     * objects, and directories transferred and transfer duration.
     * * `STANDARD` : Provides complete details about your task, including a full list of files,
     * objects, and directories that were transferred, skipped, verified, and more.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-taskreportconfig.html#cfn-datasync-task-taskreportconfig-outputtype)
     */
    public fun outputType(): String

    /**
     * Customizes the reporting level for aspects of your task report.
     *
     * For example, your report might generally only include errors, but you could specify that you
     * want a list of successes and errors just for the files that DataSync attempted to delete in your
     * destination location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-taskreportconfig.html#cfn-datasync-task-taskreportconfig-overrides)
     */
    public fun overrides(): Any? = unwrap(this).getOverrides()

    /**
     * Specifies whether you want your task report to include only what went wrong with your
     * transfer or a list of what succeeded and didn't.
     *
     * * `ERRORS_ONLY` : A report shows what DataSync was unable to transfer, skip, verify, and
     * delete.
     * * `SUCCESSES_AND_ERRORS` : A report shows what DataSync was able and unable to transfer,
     * skip, verify, and delete.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-taskreportconfig.html#cfn-datasync-task-taskreportconfig-reportlevel)
     */
    public fun reportLevel(): String? = unwrap(this).getReportLevel()

    /**
     * A builder for [TaskReportConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destination Specifies the Amazon S3 bucket where DataSync uploads your task report. 
       * For more information, see [Task
       * reports](https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html#task-report-access)
       * .
       */
      public fun destination(destination: IResolvable)

      /**
       * @param destination Specifies the Amazon S3 bucket where DataSync uploads your task report. 
       * For more information, see [Task
       * reports](https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html#task-report-access)
       * .
       */
      public fun destination(destination: DestinationProperty)

      /**
       * @param destination Specifies the Amazon S3 bucket where DataSync uploads your task report. 
       * For more information, see [Task
       * reports](https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html#task-report-access)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fdbf726fa76d94dfb1383ff714be978466c41118561c38e153b56fe0d20ba16e")
      public fun destination(destination: DestinationProperty.Builder.() -> Unit)

      /**
       * @param objectVersionIds Specifies whether your task report includes the new version of each
       * object transferred into an S3 bucket.
       * This only applies if you [enable versioning on your
       * bucket](https://docs.aws.amazon.com/AmazonS3/latest/userguide/manage-versioning-examples.html)
       * . Keep in mind that setting this to `INCLUDE` can increase the duration of your task
       * execution.
       */
      public fun objectVersionIds(objectVersionIds: String)

      /**
       * @param outputType Specifies the type of task report that you want:. 
       * * `SUMMARY_ONLY` : Provides necessary details about your task, including the number of
       * files, objects, and directories transferred and transfer duration.
       * * `STANDARD` : Provides complete details about your task, including a full list of files,
       * objects, and directories that were transferred, skipped, verified, and more.
       */
      public fun outputType(outputType: String)

      /**
       * @param overrides Customizes the reporting level for aspects of your task report.
       * For example, your report might generally only include errors, but you could specify that
       * you want a list of successes and errors just for the files that DataSync attempted to delete
       * in your destination location.
       */
      public fun overrides(overrides: IResolvable)

      /**
       * @param overrides Customizes the reporting level for aspects of your task report.
       * For example, your report might generally only include errors, but you could specify that
       * you want a list of successes and errors just for the files that DataSync attempted to delete
       * in your destination location.
       */
      public fun overrides(overrides: OverridesProperty)

      /**
       * @param overrides Customizes the reporting level for aspects of your task report.
       * For example, your report might generally only include errors, but you could specify that
       * you want a list of successes and errors just for the files that DataSync attempted to delete
       * in your destination location.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("31b8097e5cf74692b3a83ff4b60e489d9346bdc0905c80d77b375ef9d1deecbc")
      public fun overrides(overrides: OverridesProperty.Builder.() -> Unit)

      /**
       * @param reportLevel Specifies whether you want your task report to include only what went
       * wrong with your transfer or a list of what succeeded and didn't.
       * * `ERRORS_ONLY` : A report shows what DataSync was unable to transfer, skip, verify, and
       * delete.
       * * `SUCCESSES_AND_ERRORS` : A report shows what DataSync was able and unable to transfer,
       * skip, verify, and delete.
       */
      public fun reportLevel(reportLevel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnTask.TaskReportConfigProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnTask.TaskReportConfigProperty.builder()

      /**
       * @param destination Specifies the Amazon S3 bucket where DataSync uploads your task report. 
       * For more information, see [Task
       * reports](https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html#task-report-access)
       * .
       */
      override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param destination Specifies the Amazon S3 bucket where DataSync uploads your task report. 
       * For more information, see [Task
       * reports](https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html#task-report-access)
       * .
       */
      override fun destination(destination: DestinationProperty) {
        cdkBuilder.destination(destination.let(DestinationProperty.Companion::unwrap))
      }

      /**
       * @param destination Specifies the Amazon S3 bucket where DataSync uploads your task report. 
       * For more information, see [Task
       * reports](https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html#task-report-access)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fdbf726fa76d94dfb1383ff714be978466c41118561c38e153b56fe0d20ba16e")
      override fun destination(destination: DestinationProperty.Builder.() -> Unit): Unit =
          destination(DestinationProperty(destination))

      /**
       * @param objectVersionIds Specifies whether your task report includes the new version of each
       * object transferred into an S3 bucket.
       * This only applies if you [enable versioning on your
       * bucket](https://docs.aws.amazon.com/AmazonS3/latest/userguide/manage-versioning-examples.html)
       * . Keep in mind that setting this to `INCLUDE` can increase the duration of your task
       * execution.
       */
      override fun objectVersionIds(objectVersionIds: String) {
        cdkBuilder.objectVersionIds(objectVersionIds)
      }

      /**
       * @param outputType Specifies the type of task report that you want:. 
       * * `SUMMARY_ONLY` : Provides necessary details about your task, including the number of
       * files, objects, and directories transferred and transfer duration.
       * * `STANDARD` : Provides complete details about your task, including a full list of files,
       * objects, and directories that were transferred, skipped, verified, and more.
       */
      override fun outputType(outputType: String) {
        cdkBuilder.outputType(outputType)
      }

      /**
       * @param overrides Customizes the reporting level for aspects of your task report.
       * For example, your report might generally only include errors, but you could specify that
       * you want a list of successes and errors just for the files that DataSync attempted to delete
       * in your destination location.
       */
      override fun overrides(overrides: IResolvable) {
        cdkBuilder.overrides(overrides.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param overrides Customizes the reporting level for aspects of your task report.
       * For example, your report might generally only include errors, but you could specify that
       * you want a list of successes and errors just for the files that DataSync attempted to delete
       * in your destination location.
       */
      override fun overrides(overrides: OverridesProperty) {
        cdkBuilder.overrides(overrides.let(OverridesProperty.Companion::unwrap))
      }

      /**
       * @param overrides Customizes the reporting level for aspects of your task report.
       * For example, your report might generally only include errors, but you could specify that
       * you want a list of successes and errors just for the files that DataSync attempted to delete
       * in your destination location.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("31b8097e5cf74692b3a83ff4b60e489d9346bdc0905c80d77b375ef9d1deecbc")
      override fun overrides(overrides: OverridesProperty.Builder.() -> Unit): Unit =
          overrides(OverridesProperty(overrides))

      /**
       * @param reportLevel Specifies whether you want your task report to include only what went
       * wrong with your transfer or a list of what succeeded and didn't.
       * * `ERRORS_ONLY` : A report shows what DataSync was unable to transfer, skip, verify, and
       * delete.
       * * `SUCCESSES_AND_ERRORS` : A report shows what DataSync was able and unable to transfer,
       * skip, verify, and delete.
       */
      override fun reportLevel(reportLevel: String) {
        cdkBuilder.reportLevel(reportLevel)
      }

      public fun build(): software.amazon.awscdk.services.datasync.CfnTask.TaskReportConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datasync.CfnTask.TaskReportConfigProperty,
    ) : CdkObject(cdkObject), TaskReportConfigProperty {
      /**
       * Specifies the Amazon S3 bucket where DataSync uploads your task report.
       *
       * For more information, see [Task
       * reports](https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html#task-report-access)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-taskreportconfig.html#cfn-datasync-task-taskreportconfig-destination)
       */
      override fun destination(): Any = unwrap(this).getDestination()

      /**
       * Specifies whether your task report includes the new version of each object transferred into
       * an S3 bucket.
       *
       * This only applies if you [enable versioning on your
       * bucket](https://docs.aws.amazon.com/AmazonS3/latest/userguide/manage-versioning-examples.html)
       * . Keep in mind that setting this to `INCLUDE` can increase the duration of your task
       * execution.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-taskreportconfig.html#cfn-datasync-task-taskreportconfig-objectversionids)
       */
      override fun objectVersionIds(): String? = unwrap(this).getObjectVersionIds()

      /**
       * Specifies the type of task report that you want:.
       *
       * * `SUMMARY_ONLY` : Provides necessary details about your task, including the number of
       * files, objects, and directories transferred and transfer duration.
       * * `STANDARD` : Provides complete details about your task, including a full list of files,
       * objects, and directories that were transferred, skipped, verified, and more.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-taskreportconfig.html#cfn-datasync-task-taskreportconfig-outputtype)
       */
      override fun outputType(): String = unwrap(this).getOutputType()

      /**
       * Customizes the reporting level for aspects of your task report.
       *
       * For example, your report might generally only include errors, but you could specify that
       * you want a list of successes and errors just for the files that DataSync attempted to delete
       * in your destination location.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-taskreportconfig.html#cfn-datasync-task-taskreportconfig-overrides)
       */
      override fun overrides(): Any? = unwrap(this).getOverrides()

      /**
       * Specifies whether you want your task report to include only what went wrong with your
       * transfer or a list of what succeeded and didn't.
       *
       * * `ERRORS_ONLY` : A report shows what DataSync was unable to transfer, skip, verify, and
       * delete.
       * * `SUCCESSES_AND_ERRORS` : A report shows what DataSync was able and unable to transfer,
       * skip, verify, and delete.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-taskreportconfig.html#cfn-datasync-task-taskreportconfig-reportlevel)
       */
      override fun reportLevel(): String? = unwrap(this).getReportLevel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TaskReportConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnTask.TaskReportConfigProperty):
          TaskReportConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? TaskReportConfigProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TaskReportConfigProperty):
          software.amazon.awscdk.services.datasync.CfnTask.TaskReportConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.datasync.CfnTask.TaskReportConfigProperty
    }
  }

  /**
   * Configures your AWS DataSync task to run on a
   * [schedule](https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html) (at a
   * minimum interval of 1 hour).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datasync.*;
   * TaskScheduleProperty taskScheduleProperty = TaskScheduleProperty.builder()
   * .scheduleExpression("scheduleExpression")
   * .status("status")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-taskschedule.html)
   */
  public interface TaskScheduleProperty {
    /**
     * Specifies your task schedule by using a cron expression in UTC time.
     *
     * For information about cron expression syntax, see the [*Amazon EventBridge User
     * Guide*](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-cron-expressions.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-taskschedule.html#cfn-datasync-task-taskschedule-scheduleexpression)
     */
    public fun scheduleExpression(): String? = unwrap(this).getScheduleExpression()

    /**
     * Specifies whether to enable or disable your task schedule.
     *
     * Your schedule is enabled by default, but there can be situations where you need to disable
     * it. For example, you might need to perform maintenance on a storage system before you can begin
     * a recurring DataSync transfer.
     *
     * DataSync might disable your schedule automatically if your task fails repeatedly with the
     * same error. For more information, see the [*DataSync User
     * Guide*](https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html#pause-task-schedule)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-taskschedule.html#cfn-datasync-task-taskschedule-status)
     */
    public fun status(): String? = unwrap(this).getStatus()

    /**
     * A builder for [TaskScheduleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param scheduleExpression Specifies your task schedule by using a cron expression in UTC
       * time.
       * For information about cron expression syntax, see the [*Amazon EventBridge User
       * Guide*](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-cron-expressions.html) .
       */
      public fun scheduleExpression(scheduleExpression: String)

      /**
       * @param status Specifies whether to enable or disable your task schedule.
       * Your schedule is enabled by default, but there can be situations where you need to disable
       * it. For example, you might need to perform maintenance on a storage system before you can
       * begin a recurring DataSync transfer.
       *
       * DataSync might disable your schedule automatically if your task fails repeatedly with the
       * same error. For more information, see the [*DataSync User
       * Guide*](https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html#pause-task-schedule)
       * .
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnTask.TaskScheduleProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnTask.TaskScheduleProperty.builder()

      /**
       * @param scheduleExpression Specifies your task schedule by using a cron expression in UTC
       * time.
       * For information about cron expression syntax, see the [*Amazon EventBridge User
       * Guide*](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-cron-expressions.html) .
       */
      override fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
      }

      /**
       * @param status Specifies whether to enable or disable your task schedule.
       * Your schedule is enabled by default, but there can be situations where you need to disable
       * it. For example, you might need to perform maintenance on a storage system before you can
       * begin a recurring DataSync transfer.
       *
       * DataSync might disable your schedule automatically if your task fails repeatedly with the
       * same error. For more information, see the [*DataSync User
       * Guide*](https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html#pause-task-schedule)
       * .
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build(): software.amazon.awscdk.services.datasync.CfnTask.TaskScheduleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datasync.CfnTask.TaskScheduleProperty,
    ) : CdkObject(cdkObject), TaskScheduleProperty {
      /**
       * Specifies your task schedule by using a cron expression in UTC time.
       *
       * For information about cron expression syntax, see the [*Amazon EventBridge User
       * Guide*](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-cron-expressions.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-taskschedule.html#cfn-datasync-task-taskschedule-scheduleexpression)
       */
      override fun scheduleExpression(): String? = unwrap(this).getScheduleExpression()

      /**
       * Specifies whether to enable or disable your task schedule.
       *
       * Your schedule is enabled by default, but there can be situations where you need to disable
       * it. For example, you might need to perform maintenance on a storage system before you can
       * begin a recurring DataSync transfer.
       *
       * DataSync might disable your schedule automatically if your task fails repeatedly with the
       * same error. For more information, see the [*DataSync User
       * Guide*](https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html#pause-task-schedule)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-taskschedule.html#cfn-datasync-task-taskschedule-status)
       */
      override fun status(): String? = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TaskScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnTask.TaskScheduleProperty):
          TaskScheduleProperty = CdkObjectWrappers.wrap(cdkObject) as? TaskScheduleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TaskScheduleProperty):
          software.amazon.awscdk.services.datasync.CfnTask.TaskScheduleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.datasync.CfnTask.TaskScheduleProperty
    }
  }

  /**
   * The reporting level for the transferred section of your DataSync task report.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datasync.*;
   * TransferredProperty transferredProperty = TransferredProperty.builder()
   * .reportLevel("reportLevel")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-transferred.html)
   */
  public interface TransferredProperty {
    /**
     * Specifies whether you want your task report to include only what went wrong with your
     * transfer or a list of what succeeded and didn't.
     *
     * * `ERRORS_ONLY` : A report shows what DataSync was unable to transfer.
     * * `SUCCESSES_AND_ERRORS` : A report shows what DataSync was able and unable to transfer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-transferred.html#cfn-datasync-task-transferred-reportlevel)
     */
    public fun reportLevel(): String? = unwrap(this).getReportLevel()

    /**
     * A builder for [TransferredProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param reportLevel Specifies whether you want your task report to include only what went
       * wrong with your transfer or a list of what succeeded and didn't.
       * * `ERRORS_ONLY` : A report shows what DataSync was unable to transfer.
       * * `SUCCESSES_AND_ERRORS` : A report shows what DataSync was able and unable to transfer.
       */
      public fun reportLevel(reportLevel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnTask.TransferredProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnTask.TransferredProperty.builder()

      /**
       * @param reportLevel Specifies whether you want your task report to include only what went
       * wrong with your transfer or a list of what succeeded and didn't.
       * * `ERRORS_ONLY` : A report shows what DataSync was unable to transfer.
       * * `SUCCESSES_AND_ERRORS` : A report shows what DataSync was able and unable to transfer.
       */
      override fun reportLevel(reportLevel: String) {
        cdkBuilder.reportLevel(reportLevel)
      }

      public fun build(): software.amazon.awscdk.services.datasync.CfnTask.TransferredProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datasync.CfnTask.TransferredProperty,
    ) : CdkObject(cdkObject), TransferredProperty {
      /**
       * Specifies whether you want your task report to include only what went wrong with your
       * transfer or a list of what succeeded and didn't.
       *
       * * `ERRORS_ONLY` : A report shows what DataSync was unable to transfer.
       * * `SUCCESSES_AND_ERRORS` : A report shows what DataSync was able and unable to transfer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-transferred.html#cfn-datasync-task-transferred-reportlevel)
       */
      override fun reportLevel(): String? = unwrap(this).getReportLevel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TransferredProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnTask.TransferredProperty):
          TransferredProperty = CdkObjectWrappers.wrap(cdkObject) as? TransferredProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransferredProperty):
          software.amazon.awscdk.services.datasync.CfnTask.TransferredProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.datasync.CfnTask.TransferredProperty
    }
  }

  /**
   * The reporting level for the verified section of your DataSync task report.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datasync.*;
   * VerifiedProperty verifiedProperty = VerifiedProperty.builder()
   * .reportLevel("reportLevel")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-verified.html)
   */
  public interface VerifiedProperty {
    /**
     * Specifies whether you want your task report to include only what went wrong with your
     * transfer or a list of what succeeded and didn't.
     *
     * * `ERRORS_ONLY` : A report shows what DataSync was unable to verify.
     * * `SUCCESSES_AND_ERRORS` : A report shows what DataSync was able and unable to verify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-verified.html#cfn-datasync-task-verified-reportlevel)
     */
    public fun reportLevel(): String? = unwrap(this).getReportLevel()

    /**
     * A builder for [VerifiedProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param reportLevel Specifies whether you want your task report to include only what went
       * wrong with your transfer or a list of what succeeded and didn't.
       * * `ERRORS_ONLY` : A report shows what DataSync was unable to verify.
       * * `SUCCESSES_AND_ERRORS` : A report shows what DataSync was able and unable to verify.
       */
      public fun reportLevel(reportLevel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnTask.VerifiedProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnTask.VerifiedProperty.builder()

      /**
       * @param reportLevel Specifies whether you want your task report to include only what went
       * wrong with your transfer or a list of what succeeded and didn't.
       * * `ERRORS_ONLY` : A report shows what DataSync was unable to verify.
       * * `SUCCESSES_AND_ERRORS` : A report shows what DataSync was able and unable to verify.
       */
      override fun reportLevel(reportLevel: String) {
        cdkBuilder.reportLevel(reportLevel)
      }

      public fun build(): software.amazon.awscdk.services.datasync.CfnTask.VerifiedProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datasync.CfnTask.VerifiedProperty,
    ) : CdkObject(cdkObject), VerifiedProperty {
      /**
       * Specifies whether you want your task report to include only what went wrong with your
       * transfer or a list of what succeeded and didn't.
       *
       * * `ERRORS_ONLY` : A report shows what DataSync was unable to verify.
       * * `SUCCESSES_AND_ERRORS` : A report shows what DataSync was able and unable to verify.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-verified.html#cfn-datasync-task-verified-reportlevel)
       */
      override fun reportLevel(): String? = unwrap(this).getReportLevel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VerifiedProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnTask.VerifiedProperty):
          VerifiedProperty = CdkObjectWrappers.wrap(cdkObject) as? VerifiedProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VerifiedProperty):
          software.amazon.awscdk.services.datasync.CfnTask.VerifiedProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnTask.VerifiedProperty
    }
  }
}
