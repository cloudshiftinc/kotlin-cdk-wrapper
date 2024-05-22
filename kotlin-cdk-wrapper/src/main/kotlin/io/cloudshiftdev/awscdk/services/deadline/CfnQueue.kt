@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.deadline

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a queue to coordinate the order in which jobs run on a farm.
 *
 * A queue can also specify where to pull resources and indicate where to output completed jobs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.deadline.*;
 * CfnQueue cfnQueue = CfnQueue.Builder.create(this, "MyCfnQueue")
 * .displayName("displayName")
 * // the properties below are optional
 * .allowedStorageProfileIds(List.of("allowedStorageProfileIds"))
 * .defaultBudgetAction("defaultBudgetAction")
 * .description("description")
 * .farmId("farmId")
 * .jobAttachmentSettings(JobAttachmentSettingsProperty.builder()
 * .rootPrefix("rootPrefix")
 * .s3BucketName("s3BucketName")
 * .build())
 * .jobRunAsUser(JobRunAsUserProperty.builder()
 * .runAs("runAs")
 * // the properties below are optional
 * .posix(PosixUserProperty.builder()
 * .group("group")
 * .user("user")
 * .build())
 * .windows(WindowsUserProperty.builder()
 * .passwordArn("passwordArn")
 * .user("user")
 * .build())
 * .build())
 * .requiredFileSystemLocationNames(List.of("requiredFileSystemLocationNames"))
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html)
 */
public open class CfnQueue(
  cdkObject: software.amazon.awscdk.services.deadline.CfnQueue,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnQueueProps,
  ) :
      this(software.amazon.awscdk.services.deadline.CfnQueue(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnQueueProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnQueueProps.Builder.() -> Unit,
  ) : this(scope, id, CfnQueueProps(props)
  )

  /**
   * The identifiers of the storage profiles that this queue can use to share assets between workers
   * using different operating systems.
   */
  public open fun allowedStorageProfileIds(): List<String> =
      unwrap(this).getAllowedStorageProfileIds() ?: emptyList()

  /**
   * The identifiers of the storage profiles that this queue can use to share assets between workers
   * using different operating systems.
   */
  public open fun allowedStorageProfileIds(`value`: List<String>) {
    unwrap(this).setAllowedStorageProfileIds(`value`)
  }

  /**
   * The identifiers of the storage profiles that this queue can use to share assets between workers
   * using different operating systems.
   */
  public open fun allowedStorageProfileIds(vararg `value`: String): Unit =
      allowedStorageProfileIds(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) of the queue.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The queue ID.
   */
  public open fun attrQueueId(): String = unwrap(this).getAttrQueueId()

  /**
   * The default action taken on a queue summary if a budget wasn't configured.
   */
  public open fun defaultBudgetAction(): String? = unwrap(this).getDefaultBudgetAction()

  /**
   * The default action taken on a queue summary if a budget wasn't configured.
   */
  public open fun defaultBudgetAction(`value`: String) {
    unwrap(this).setDefaultBudgetAction(`value`)
  }

  /**
   * A description of the queue that helps identify what the queue is used for.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the queue that helps identify what the queue is used for.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The display name of the queue summary to update.
   */
  public open fun displayName(): String = unwrap(this).getDisplayName()

  /**
   * The display name of the queue summary to update.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  /**
   * The farm ID.
   */
  public open fun farmId(): String? = unwrap(this).getFarmId()

  /**
   * The farm ID.
   */
  public open fun farmId(`value`: String) {
    unwrap(this).setFarmId(`value`)
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
   * The job attachment settings.
   */
  public open fun jobAttachmentSettings(): Any? = unwrap(this).getJobAttachmentSettings()

  /**
   * The job attachment settings.
   */
  public open fun jobAttachmentSettings(`value`: IResolvable) {
    unwrap(this).setJobAttachmentSettings(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The job attachment settings.
   */
  public open fun jobAttachmentSettings(`value`: JobAttachmentSettingsProperty) {
    unwrap(this).setJobAttachmentSettings(`value`.let(JobAttachmentSettingsProperty.Companion::unwrap))
  }

  /**
   * The job attachment settings.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c789d9c790f13a994cbe136cf1bad82c82c2ce4fd25bdb5c9882d58ff4a22b2d")
  public open fun jobAttachmentSettings(`value`: JobAttachmentSettingsProperty.Builder.() -> Unit):
      Unit = jobAttachmentSettings(JobAttachmentSettingsProperty(`value`))

  /**
   * Identifies the user for a job.
   */
  public open fun jobRunAsUser(): Any? = unwrap(this).getJobRunAsUser()

  /**
   * Identifies the user for a job.
   */
  public open fun jobRunAsUser(`value`: IResolvable) {
    unwrap(this).setJobRunAsUser(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Identifies the user for a job.
   */
  public open fun jobRunAsUser(`value`: JobRunAsUserProperty) {
    unwrap(this).setJobRunAsUser(`value`.let(JobRunAsUserProperty.Companion::unwrap))
  }

  /**
   * Identifies the user for a job.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dbcabd226ad5fc65952ecd18a0933d06b4086744a509c12a6fda92fb5bc5004d")
  public open fun jobRunAsUser(`value`: JobRunAsUserProperty.Builder.() -> Unit): Unit =
      jobRunAsUser(JobRunAsUserProperty(`value`))

  /**
   * The file system location that the queue uses.
   */
  public open fun requiredFileSystemLocationNames(): List<String> =
      unwrap(this).getRequiredFileSystemLocationNames() ?: emptyList()

  /**
   * The file system location that the queue uses.
   */
  public open fun requiredFileSystemLocationNames(`value`: List<String>) {
    unwrap(this).setRequiredFileSystemLocationNames(`value`)
  }

  /**
   * The file system location that the queue uses.
   */
  public open fun requiredFileSystemLocationNames(vararg `value`: String): Unit =
      requiredFileSystemLocationNames(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) of the IAM role that workers use when running jobs in this
   * queue.
   */
  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM role that workers use when running jobs in this
   * queue.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.deadline.CfnQueue].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The identifiers of the storage profiles that this queue can use to share assets between
     * workers using different operating systems.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-allowedstorageprofileids)
     * @param allowedStorageProfileIds The identifiers of the storage profiles that this queue can
     * use to share assets between workers using different operating systems. 
     */
    public fun allowedStorageProfileIds(allowedStorageProfileIds: List<String>)

    /**
     * The identifiers of the storage profiles that this queue can use to share assets between
     * workers using different operating systems.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-allowedstorageprofileids)
     * @param allowedStorageProfileIds The identifiers of the storage profiles that this queue can
     * use to share assets between workers using different operating systems. 
     */
    public fun allowedStorageProfileIds(vararg allowedStorageProfileIds: String)

    /**
     * The default action taken on a queue summary if a budget wasn't configured.
     *
     * Default: - "NONE"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-defaultbudgetaction)
     * @param defaultBudgetAction The default action taken on a queue summary if a budget wasn't
     * configured. 
     */
    public fun defaultBudgetAction(defaultBudgetAction: String)

    /**
     * A description of the queue that helps identify what the queue is used for.
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-description)
     * @param description A description of the queue that helps identify what the queue is used for.
     * 
     */
    public fun description(description: String)

    /**
     * The display name of the queue summary to update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-displayname)
     * @param displayName The display name of the queue summary to update. 
     */
    public fun displayName(displayName: String)

    /**
     * The farm ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-farmid)
     * @param farmId The farm ID. 
     */
    public fun farmId(farmId: String)

    /**
     * The job attachment settings.
     *
     * These are the Amazon S3 bucket name and the Amazon S3 prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-jobattachmentsettings)
     * @param jobAttachmentSettings The job attachment settings. 
     */
    public fun jobAttachmentSettings(jobAttachmentSettings: IResolvable)

    /**
     * The job attachment settings.
     *
     * These are the Amazon S3 bucket name and the Amazon S3 prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-jobattachmentsettings)
     * @param jobAttachmentSettings The job attachment settings. 
     */
    public fun jobAttachmentSettings(jobAttachmentSettings: JobAttachmentSettingsProperty)

    /**
     * The job attachment settings.
     *
     * These are the Amazon S3 bucket name and the Amazon S3 prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-jobattachmentsettings)
     * @param jobAttachmentSettings The job attachment settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccd591204c471f9fb7d14eca3660cbd02ed1a761063708965fd92b58ba2f2a09")
    public
        fun jobAttachmentSettings(jobAttachmentSettings: JobAttachmentSettingsProperty.Builder.() -> Unit)

    /**
     * Identifies the user for a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-jobrunasuser)
     * @param jobRunAsUser Identifies the user for a job. 
     */
    public fun jobRunAsUser(jobRunAsUser: IResolvable)

    /**
     * Identifies the user for a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-jobrunasuser)
     * @param jobRunAsUser Identifies the user for a job. 
     */
    public fun jobRunAsUser(jobRunAsUser: JobRunAsUserProperty)

    /**
     * Identifies the user for a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-jobrunasuser)
     * @param jobRunAsUser Identifies the user for a job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d12b2f7d69069c42e873cee3380d9a10ba5236f1cc186ba19bd818a9a0d06480")
    public fun jobRunAsUser(jobRunAsUser: JobRunAsUserProperty.Builder.() -> Unit)

    /**
     * The file system location that the queue uses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-requiredfilesystemlocationnames)
     * @param requiredFileSystemLocationNames The file system location that the queue uses. 
     */
    public fun requiredFileSystemLocationNames(requiredFileSystemLocationNames: List<String>)

    /**
     * The file system location that the queue uses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-requiredfilesystemlocationnames)
     * @param requiredFileSystemLocationNames The file system location that the queue uses. 
     */
    public fun requiredFileSystemLocationNames(vararg requiredFileSystemLocationNames: String)

    /**
     * The Amazon Resource Name (ARN) of the IAM role that workers use when running jobs in this
     * queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role that workers use when running
     * jobs in this queue. 
     */
    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.deadline.CfnQueue.Builder =
        software.amazon.awscdk.services.deadline.CfnQueue.Builder.create(scope, id)

    /**
     * The identifiers of the storage profiles that this queue can use to share assets between
     * workers using different operating systems.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-allowedstorageprofileids)
     * @param allowedStorageProfileIds The identifiers of the storage profiles that this queue can
     * use to share assets between workers using different operating systems. 
     */
    override fun allowedStorageProfileIds(allowedStorageProfileIds: List<String>) {
      cdkBuilder.allowedStorageProfileIds(allowedStorageProfileIds)
    }

    /**
     * The identifiers of the storage profiles that this queue can use to share assets between
     * workers using different operating systems.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-allowedstorageprofileids)
     * @param allowedStorageProfileIds The identifiers of the storage profiles that this queue can
     * use to share assets between workers using different operating systems. 
     */
    override fun allowedStorageProfileIds(vararg allowedStorageProfileIds: String): Unit =
        allowedStorageProfileIds(allowedStorageProfileIds.toList())

    /**
     * The default action taken on a queue summary if a budget wasn't configured.
     *
     * Default: - "NONE"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-defaultbudgetaction)
     * @param defaultBudgetAction The default action taken on a queue summary if a budget wasn't
     * configured. 
     */
    override fun defaultBudgetAction(defaultBudgetAction: String) {
      cdkBuilder.defaultBudgetAction(defaultBudgetAction)
    }

    /**
     * A description of the queue that helps identify what the queue is used for.
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-description)
     * @param description A description of the queue that helps identify what the queue is used for.
     * 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The display name of the queue summary to update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-displayname)
     * @param displayName The display name of the queue summary to update. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The farm ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-farmid)
     * @param farmId The farm ID. 
     */
    override fun farmId(farmId: String) {
      cdkBuilder.farmId(farmId)
    }

    /**
     * The job attachment settings.
     *
     * These are the Amazon S3 bucket name and the Amazon S3 prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-jobattachmentsettings)
     * @param jobAttachmentSettings The job attachment settings. 
     */
    override fun jobAttachmentSettings(jobAttachmentSettings: IResolvable) {
      cdkBuilder.jobAttachmentSettings(jobAttachmentSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * The job attachment settings.
     *
     * These are the Amazon S3 bucket name and the Amazon S3 prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-jobattachmentsettings)
     * @param jobAttachmentSettings The job attachment settings. 
     */
    override fun jobAttachmentSettings(jobAttachmentSettings: JobAttachmentSettingsProperty) {
      cdkBuilder.jobAttachmentSettings(jobAttachmentSettings.let(JobAttachmentSettingsProperty.Companion::unwrap))
    }

    /**
     * The job attachment settings.
     *
     * These are the Amazon S3 bucket name and the Amazon S3 prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-jobattachmentsettings)
     * @param jobAttachmentSettings The job attachment settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccd591204c471f9fb7d14eca3660cbd02ed1a761063708965fd92b58ba2f2a09")
    override
        fun jobAttachmentSettings(jobAttachmentSettings: JobAttachmentSettingsProperty.Builder.() -> Unit):
        Unit = jobAttachmentSettings(JobAttachmentSettingsProperty(jobAttachmentSettings))

    /**
     * Identifies the user for a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-jobrunasuser)
     * @param jobRunAsUser Identifies the user for a job. 
     */
    override fun jobRunAsUser(jobRunAsUser: IResolvable) {
      cdkBuilder.jobRunAsUser(jobRunAsUser.let(IResolvable.Companion::unwrap))
    }

    /**
     * Identifies the user for a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-jobrunasuser)
     * @param jobRunAsUser Identifies the user for a job. 
     */
    override fun jobRunAsUser(jobRunAsUser: JobRunAsUserProperty) {
      cdkBuilder.jobRunAsUser(jobRunAsUser.let(JobRunAsUserProperty.Companion::unwrap))
    }

    /**
     * Identifies the user for a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-jobrunasuser)
     * @param jobRunAsUser Identifies the user for a job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d12b2f7d69069c42e873cee3380d9a10ba5236f1cc186ba19bd818a9a0d06480")
    override fun jobRunAsUser(jobRunAsUser: JobRunAsUserProperty.Builder.() -> Unit): Unit =
        jobRunAsUser(JobRunAsUserProperty(jobRunAsUser))

    /**
     * The file system location that the queue uses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-requiredfilesystemlocationnames)
     * @param requiredFileSystemLocationNames The file system location that the queue uses. 
     */
    override fun requiredFileSystemLocationNames(requiredFileSystemLocationNames: List<String>) {
      cdkBuilder.requiredFileSystemLocationNames(requiredFileSystemLocationNames)
    }

    /**
     * The file system location that the queue uses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-requiredfilesystemlocationnames)
     * @param requiredFileSystemLocationNames The file system location that the queue uses. 
     */
    override fun requiredFileSystemLocationNames(vararg requiredFileSystemLocationNames: String):
        Unit = requiredFileSystemLocationNames(requiredFileSystemLocationNames.toList())

    /**
     * The Amazon Resource Name (ARN) of the IAM role that workers use when running jobs in this
     * queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role that workers use when running
     * jobs in this queue. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.deadline.CfnQueue = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.deadline.CfnQueue.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnQueue {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnQueue(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnQueue): CfnQueue =
        CfnQueue(cdkObject)

    internal fun unwrap(wrapped: CfnQueue): software.amazon.awscdk.services.deadline.CfnQueue =
        wrapped.cdkObject as software.amazon.awscdk.services.deadline.CfnQueue
  }

  /**
   * The job attachment settings.
   *
   * These are the Amazon S3 bucket name and the Amazon S3 prefix.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.deadline.*;
   * JobAttachmentSettingsProperty jobAttachmentSettingsProperty =
   * JobAttachmentSettingsProperty.builder()
   * .rootPrefix("rootPrefix")
   * .s3BucketName("s3BucketName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-queue-jobattachmentsettings.html)
   */
  public interface JobAttachmentSettingsProperty {
    /**
     * The root prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-queue-jobattachmentsettings.html#cfn-deadline-queue-jobattachmentsettings-rootprefix)
     */
    public fun rootPrefix(): String

    /**
     * The Amazon S3 bucket name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-queue-jobattachmentsettings.html#cfn-deadline-queue-jobattachmentsettings-s3bucketname)
     */
    public fun s3BucketName(): String

    /**
     * A builder for [JobAttachmentSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param rootPrefix The root prefix. 
       */
      public fun rootPrefix(rootPrefix: String)

      /**
       * @param s3BucketName The Amazon S3 bucket name. 
       */
      public fun s3BucketName(s3BucketName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.deadline.CfnQueue.JobAttachmentSettingsProperty.Builder =
          software.amazon.awscdk.services.deadline.CfnQueue.JobAttachmentSettingsProperty.builder()

      /**
       * @param rootPrefix The root prefix. 
       */
      override fun rootPrefix(rootPrefix: String) {
        cdkBuilder.rootPrefix(rootPrefix)
      }

      /**
       * @param s3BucketName The Amazon S3 bucket name. 
       */
      override fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
      }

      public fun build():
          software.amazon.awscdk.services.deadline.CfnQueue.JobAttachmentSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.deadline.CfnQueue.JobAttachmentSettingsProperty,
    ) : CdkObject(cdkObject), JobAttachmentSettingsProperty {
      /**
       * The root prefix.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-queue-jobattachmentsettings.html#cfn-deadline-queue-jobattachmentsettings-rootprefix)
       */
      override fun rootPrefix(): String = unwrap(this).getRootPrefix()

      /**
       * The Amazon S3 bucket name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-queue-jobattachmentsettings.html#cfn-deadline-queue-jobattachmentsettings-s3bucketname)
       */
      override fun s3BucketName(): String = unwrap(this).getS3BucketName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JobAttachmentSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnQueue.JobAttachmentSettingsProperty):
          JobAttachmentSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          JobAttachmentSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: JobAttachmentSettingsProperty):
          software.amazon.awscdk.services.deadline.CfnQueue.JobAttachmentSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.deadline.CfnQueue.JobAttachmentSettingsProperty
    }
  }

  /**
   * Identifies the user for a job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.deadline.*;
   * JobRunAsUserProperty jobRunAsUserProperty = JobRunAsUserProperty.builder()
   * .runAs("runAs")
   * // the properties below are optional
   * .posix(PosixUserProperty.builder()
   * .group("group")
   * .user("user")
   * .build())
   * .windows(WindowsUserProperty.builder()
   * .passwordArn("passwordArn")
   * .user("user")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-queue-jobrunasuser.html)
   */
  public interface JobRunAsUserProperty {
    /**
     * The user and group that the jobs in the queue run as.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-queue-jobrunasuser.html#cfn-deadline-queue-jobrunasuser-posix)
     */
    public fun posix(): Any? = unwrap(this).getPosix()

    /**
     * Specifies whether the job should run using the queue's system user or if the job should run
     * using the worker agent system user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-queue-jobrunasuser.html#cfn-deadline-queue-jobrunasuser-runas)
     */
    public fun runAs(): String

    /**
     * Identifies a Microsoft Windows user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-queue-jobrunasuser.html#cfn-deadline-queue-jobrunasuser-windows)
     */
    public fun windows(): Any? = unwrap(this).getWindows()

    /**
     * A builder for [JobRunAsUserProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param posix The user and group that the jobs in the queue run as.
       */
      public fun posix(posix: IResolvable)

      /**
       * @param posix The user and group that the jobs in the queue run as.
       */
      public fun posix(posix: PosixUserProperty)

      /**
       * @param posix The user and group that the jobs in the queue run as.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("451723aeabd7b73ef46a52c2cbeafe11423eed6c8337564f0b68373705d8cae7")
      public fun posix(posix: PosixUserProperty.Builder.() -> Unit)

      /**
       * @param runAs Specifies whether the job should run using the queue's system user or if the
       * job should run using the worker agent system user. 
       */
      public fun runAs(runAs: String)

      /**
       * @param windows Identifies a Microsoft Windows user.
       */
      public fun windows(windows: IResolvable)

      /**
       * @param windows Identifies a Microsoft Windows user.
       */
      public fun windows(windows: WindowsUserProperty)

      /**
       * @param windows Identifies a Microsoft Windows user.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("02654be1312b8216203af1c0d30a271340877267466212a0cfb22987198c4987")
      public fun windows(windows: WindowsUserProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.deadline.CfnQueue.JobRunAsUserProperty.Builder =
          software.amazon.awscdk.services.deadline.CfnQueue.JobRunAsUserProperty.builder()

      /**
       * @param posix The user and group that the jobs in the queue run as.
       */
      override fun posix(posix: IResolvable) {
        cdkBuilder.posix(posix.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param posix The user and group that the jobs in the queue run as.
       */
      override fun posix(posix: PosixUserProperty) {
        cdkBuilder.posix(posix.let(PosixUserProperty.Companion::unwrap))
      }

      /**
       * @param posix The user and group that the jobs in the queue run as.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("451723aeabd7b73ef46a52c2cbeafe11423eed6c8337564f0b68373705d8cae7")
      override fun posix(posix: PosixUserProperty.Builder.() -> Unit): Unit =
          posix(PosixUserProperty(posix))

      /**
       * @param runAs Specifies whether the job should run using the queue's system user or if the
       * job should run using the worker agent system user. 
       */
      override fun runAs(runAs: String) {
        cdkBuilder.runAs(runAs)
      }

      /**
       * @param windows Identifies a Microsoft Windows user.
       */
      override fun windows(windows: IResolvable) {
        cdkBuilder.windows(windows.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param windows Identifies a Microsoft Windows user.
       */
      override fun windows(windows: WindowsUserProperty) {
        cdkBuilder.windows(windows.let(WindowsUserProperty.Companion::unwrap))
      }

      /**
       * @param windows Identifies a Microsoft Windows user.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("02654be1312b8216203af1c0d30a271340877267466212a0cfb22987198c4987")
      override fun windows(windows: WindowsUserProperty.Builder.() -> Unit): Unit =
          windows(WindowsUserProperty(windows))

      public fun build(): software.amazon.awscdk.services.deadline.CfnQueue.JobRunAsUserProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.deadline.CfnQueue.JobRunAsUserProperty,
    ) : CdkObject(cdkObject), JobRunAsUserProperty {
      /**
       * The user and group that the jobs in the queue run as.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-queue-jobrunasuser.html#cfn-deadline-queue-jobrunasuser-posix)
       */
      override fun posix(): Any? = unwrap(this).getPosix()

      /**
       * Specifies whether the job should run using the queue's system user or if the job should run
       * using the worker agent system user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-queue-jobrunasuser.html#cfn-deadline-queue-jobrunasuser-runas)
       */
      override fun runAs(): String = unwrap(this).getRunAs()

      /**
       * Identifies a Microsoft Windows user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-queue-jobrunasuser.html#cfn-deadline-queue-jobrunasuser-windows)
       */
      override fun windows(): Any? = unwrap(this).getWindows()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JobRunAsUserProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnQueue.JobRunAsUserProperty):
          JobRunAsUserProperty = CdkObjectWrappers.wrap(cdkObject) as? JobRunAsUserProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: JobRunAsUserProperty):
          software.amazon.awscdk.services.deadline.CfnQueue.JobRunAsUserProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.deadline.CfnQueue.JobRunAsUserProperty
    }
  }

  /**
   * The POSIX user.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.deadline.*;
   * PosixUserProperty posixUserProperty = PosixUserProperty.builder()
   * .group("group")
   * .user("user")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-queue-posixuser.html)
   */
  public interface PosixUserProperty {
    /**
     * The name of the POSIX user's group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-queue-posixuser.html#cfn-deadline-queue-posixuser-group)
     */
    public fun group(): String

    /**
     * The name of the POSIX user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-queue-posixuser.html#cfn-deadline-queue-posixuser-user)
     */
    public fun user(): String

    /**
     * A builder for [PosixUserProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param group The name of the POSIX user's group. 
       */
      public fun group(group: String)

      /**
       * @param user The name of the POSIX user. 
       */
      public fun user(user: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.deadline.CfnQueue.PosixUserProperty.Builder =
          software.amazon.awscdk.services.deadline.CfnQueue.PosixUserProperty.builder()

      /**
       * @param group The name of the POSIX user's group. 
       */
      override fun group(group: String) {
        cdkBuilder.group(group)
      }

      /**
       * @param user The name of the POSIX user. 
       */
      override fun user(user: String) {
        cdkBuilder.user(user)
      }

      public fun build(): software.amazon.awscdk.services.deadline.CfnQueue.PosixUserProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.deadline.CfnQueue.PosixUserProperty,
    ) : CdkObject(cdkObject), PosixUserProperty {
      /**
       * The name of the POSIX user's group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-queue-posixuser.html#cfn-deadline-queue-posixuser-group)
       */
      override fun group(): String = unwrap(this).getGroup()

      /**
       * The name of the POSIX user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-queue-posixuser.html#cfn-deadline-queue-posixuser-user)
       */
      override fun user(): String = unwrap(this).getUser()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PosixUserProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnQueue.PosixUserProperty):
          PosixUserProperty = CdkObjectWrappers.wrap(cdkObject) as? PosixUserProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PosixUserProperty):
          software.amazon.awscdk.services.deadline.CfnQueue.PosixUserProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.deadline.CfnQueue.PosixUserProperty
    }
  }

  /**
   * The Windows user details.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.deadline.*;
   * WindowsUserProperty windowsUserProperty = WindowsUserProperty.builder()
   * .passwordArn("passwordArn")
   * .user("user")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-queue-windowsuser.html)
   */
  public interface WindowsUserProperty {
    /**
     * The password ARN for the Windows user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-queue-windowsuser.html#cfn-deadline-queue-windowsuser-passwordarn)
     */
    public fun passwordArn(): String

    /**
     * The user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-queue-windowsuser.html#cfn-deadline-queue-windowsuser-user)
     */
    public fun user(): String

    /**
     * A builder for [WindowsUserProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param passwordArn The password ARN for the Windows user. 
       */
      public fun passwordArn(passwordArn: String)

      /**
       * @param user The user. 
       */
      public fun user(user: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.deadline.CfnQueue.WindowsUserProperty.Builder =
          software.amazon.awscdk.services.deadline.CfnQueue.WindowsUserProperty.builder()

      /**
       * @param passwordArn The password ARN for the Windows user. 
       */
      override fun passwordArn(passwordArn: String) {
        cdkBuilder.passwordArn(passwordArn)
      }

      /**
       * @param user The user. 
       */
      override fun user(user: String) {
        cdkBuilder.user(user)
      }

      public fun build(): software.amazon.awscdk.services.deadline.CfnQueue.WindowsUserProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.deadline.CfnQueue.WindowsUserProperty,
    ) : CdkObject(cdkObject), WindowsUserProperty {
      /**
       * The password ARN for the Windows user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-queue-windowsuser.html#cfn-deadline-queue-windowsuser-passwordarn)
       */
      override fun passwordArn(): String = unwrap(this).getPasswordArn()

      /**
       * The user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-queue-windowsuser.html#cfn-deadline-queue-windowsuser-user)
       */
      override fun user(): String = unwrap(this).getUser()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WindowsUserProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnQueue.WindowsUserProperty):
          WindowsUserProperty = CdkObjectWrappers.wrap(cdkObject) as? WindowsUserProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: WindowsUserProperty):
          software.amazon.awscdk.services.deadline.CfnQueue.WindowsUserProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.deadline.CfnQueue.WindowsUserProperty
    }
  }
}
