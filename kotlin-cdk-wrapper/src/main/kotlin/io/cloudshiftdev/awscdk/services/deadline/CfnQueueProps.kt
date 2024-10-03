@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.deadline

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
 * Properties for defining a `CfnQueue`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.deadline.*;
 * CfnQueueProps cfnQueueProps = CfnQueueProps.builder()
 * .displayName("displayName")
 * .farmId("farmId")
 * // the properties below are optional
 * .allowedStorageProfileIds(List.of("allowedStorageProfileIds"))
 * .defaultBudgetAction("defaultBudgetAction")
 * .description("description")
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
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html)
 */
public interface CfnQueueProps {
  /**
   * The identifiers of the storage profiles that this queue can use to share assets between workers
   * using different operating systems.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-allowedstorageprofileids)
   */
  public fun allowedStorageProfileIds(): List<String> = unwrap(this).getAllowedStorageProfileIds()
      ?: emptyList()

  /**
   * The default action taken on a queue summary if a budget wasn't configured.
   *
   * Default: - "NONE"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-defaultbudgetaction)
   */
  public fun defaultBudgetAction(): String? = unwrap(this).getDefaultBudgetAction()

  /**
   * A description of the queue that helps identify what the queue is used for.
   *
   * Default: - ""
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The display name of the queue summary to update.
   *
   *
   * This field can store any content. Escape or encode this content before displaying it on a
   * webpage or any other system that might interpret the content of this field.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-displayname)
   */
  public fun displayName(): String

  /**
   * The farm ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-farmid)
   */
  public fun farmId(): String

  /**
   * The job attachment settings.
   *
   * These are the Amazon S3 bucket name and the Amazon S3 prefix.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-jobattachmentsettings)
   */
  public fun jobAttachmentSettings(): Any? = unwrap(this).getJobAttachmentSettings()

  /**
   * Identifies the user for a job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-jobrunasuser)
   */
  public fun jobRunAsUser(): Any? = unwrap(this).getJobRunAsUser()

  /**
   * The file system location that the queue uses.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-requiredfilesystemlocationnames)
   */
  public fun requiredFileSystemLocationNames(): List<String> =
      unwrap(this).getRequiredFileSystemLocationNames() ?: emptyList()

  /**
   * The Amazon Resource Name (ARN) of the IAM role that workers use when running jobs in this
   * queue.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-rolearn)
   */
  public fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The tags to add to your queue.
   *
   * Each tag consists of a tag key and a tag value. Tag keys and values are both required, but tag
   * values can be empty strings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnQueueProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowedStorageProfileIds The identifiers of the storage profiles that this queue can
     * use to share assets between workers using different operating systems.
     */
    public fun allowedStorageProfileIds(allowedStorageProfileIds: List<String>)

    /**
     * @param allowedStorageProfileIds The identifiers of the storage profiles that this queue can
     * use to share assets between workers using different operating systems.
     */
    public fun allowedStorageProfileIds(vararg allowedStorageProfileIds: String)

    /**
     * @param defaultBudgetAction The default action taken on a queue summary if a budget wasn't
     * configured.
     */
    public fun defaultBudgetAction(defaultBudgetAction: String)

    /**
     * @param description A description of the queue that helps identify what the queue is used for.
     */
    public fun description(description: String)

    /**
     * @param displayName The display name of the queue summary to update. 
     *
     * This field can store any content. Escape or encode this content before displaying it on a
     * webpage or any other system that might interpret the content of this field.
     */
    public fun displayName(displayName: String)

    /**
     * @param farmId The farm ID. 
     */
    public fun farmId(farmId: String)

    /**
     * @param jobAttachmentSettings The job attachment settings.
     * These are the Amazon S3 bucket name and the Amazon S3 prefix.
     */
    public fun jobAttachmentSettings(jobAttachmentSettings: IResolvable)

    /**
     * @param jobAttachmentSettings The job attachment settings.
     * These are the Amazon S3 bucket name and the Amazon S3 prefix.
     */
    public fun jobAttachmentSettings(jobAttachmentSettings: CfnQueue.JobAttachmentSettingsProperty)

    /**
     * @param jobAttachmentSettings The job attachment settings.
     * These are the Amazon S3 bucket name and the Amazon S3 prefix.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("74cda5701e444bcfee936cf7f08f9f1aa2b5a79268d2fd1a5eb2261186f6abee")
    public
        fun jobAttachmentSettings(jobAttachmentSettings: CfnQueue.JobAttachmentSettingsProperty.Builder.() -> Unit)

    /**
     * @param jobRunAsUser Identifies the user for a job.
     */
    public fun jobRunAsUser(jobRunAsUser: IResolvable)

    /**
     * @param jobRunAsUser Identifies the user for a job.
     */
    public fun jobRunAsUser(jobRunAsUser: CfnQueue.JobRunAsUserProperty)

    /**
     * @param jobRunAsUser Identifies the user for a job.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80646a702c3e0f339ed2b6192ba2735a58ffd9707de18101d58002871e0f78d6")
    public fun jobRunAsUser(jobRunAsUser: CfnQueue.JobRunAsUserProperty.Builder.() -> Unit)

    /**
     * @param requiredFileSystemLocationNames The file system location that the queue uses.
     */
    public fun requiredFileSystemLocationNames(requiredFileSystemLocationNames: List<String>)

    /**
     * @param requiredFileSystemLocationNames The file system location that the queue uses.
     */
    public fun requiredFileSystemLocationNames(vararg requiredFileSystemLocationNames: String)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role that workers use when running
     * jobs in this queue.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param tags The tags to add to your queue.
     * Each tag consists of a tag key and a tag value. Tag keys and values are both required, but
     * tag values can be empty strings.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to add to your queue.
     * Each tag consists of a tag key and a tag value. Tag keys and values are both required, but
     * tag values can be empty strings.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.deadline.CfnQueueProps.Builder =
        software.amazon.awscdk.services.deadline.CfnQueueProps.builder()

    /**
     * @param allowedStorageProfileIds The identifiers of the storage profiles that this queue can
     * use to share assets between workers using different operating systems.
     */
    override fun allowedStorageProfileIds(allowedStorageProfileIds: List<String>) {
      cdkBuilder.allowedStorageProfileIds(allowedStorageProfileIds)
    }

    /**
     * @param allowedStorageProfileIds The identifiers of the storage profiles that this queue can
     * use to share assets between workers using different operating systems.
     */
    override fun allowedStorageProfileIds(vararg allowedStorageProfileIds: String): Unit =
        allowedStorageProfileIds(allowedStorageProfileIds.toList())

    /**
     * @param defaultBudgetAction The default action taken on a queue summary if a budget wasn't
     * configured.
     */
    override fun defaultBudgetAction(defaultBudgetAction: String) {
      cdkBuilder.defaultBudgetAction(defaultBudgetAction)
    }

    /**
     * @param description A description of the queue that helps identify what the queue is used for.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param displayName The display name of the queue summary to update. 
     *
     * This field can store any content. Escape or encode this content before displaying it on a
     * webpage or any other system that might interpret the content of this field.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param farmId The farm ID. 
     */
    override fun farmId(farmId: String) {
      cdkBuilder.farmId(farmId)
    }

    /**
     * @param jobAttachmentSettings The job attachment settings.
     * These are the Amazon S3 bucket name and the Amazon S3 prefix.
     */
    override fun jobAttachmentSettings(jobAttachmentSettings: IResolvable) {
      cdkBuilder.jobAttachmentSettings(jobAttachmentSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param jobAttachmentSettings The job attachment settings.
     * These are the Amazon S3 bucket name and the Amazon S3 prefix.
     */
    override
        fun jobAttachmentSettings(jobAttachmentSettings: CfnQueue.JobAttachmentSettingsProperty) {
      cdkBuilder.jobAttachmentSettings(jobAttachmentSettings.let(CfnQueue.JobAttachmentSettingsProperty.Companion::unwrap))
    }

    /**
     * @param jobAttachmentSettings The job attachment settings.
     * These are the Amazon S3 bucket name and the Amazon S3 prefix.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("74cda5701e444bcfee936cf7f08f9f1aa2b5a79268d2fd1a5eb2261186f6abee")
    override
        fun jobAttachmentSettings(jobAttachmentSettings: CfnQueue.JobAttachmentSettingsProperty.Builder.() -> Unit):
        Unit = jobAttachmentSettings(CfnQueue.JobAttachmentSettingsProperty(jobAttachmentSettings))

    /**
     * @param jobRunAsUser Identifies the user for a job.
     */
    override fun jobRunAsUser(jobRunAsUser: IResolvable) {
      cdkBuilder.jobRunAsUser(jobRunAsUser.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param jobRunAsUser Identifies the user for a job.
     */
    override fun jobRunAsUser(jobRunAsUser: CfnQueue.JobRunAsUserProperty) {
      cdkBuilder.jobRunAsUser(jobRunAsUser.let(CfnQueue.JobRunAsUserProperty.Companion::unwrap))
    }

    /**
     * @param jobRunAsUser Identifies the user for a job.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80646a702c3e0f339ed2b6192ba2735a58ffd9707de18101d58002871e0f78d6")
    override fun jobRunAsUser(jobRunAsUser: CfnQueue.JobRunAsUserProperty.Builder.() -> Unit): Unit
        = jobRunAsUser(CfnQueue.JobRunAsUserProperty(jobRunAsUser))

    /**
     * @param requiredFileSystemLocationNames The file system location that the queue uses.
     */
    override fun requiredFileSystemLocationNames(requiredFileSystemLocationNames: List<String>) {
      cdkBuilder.requiredFileSystemLocationNames(requiredFileSystemLocationNames)
    }

    /**
     * @param requiredFileSystemLocationNames The file system location that the queue uses.
     */
    override fun requiredFileSystemLocationNames(vararg requiredFileSystemLocationNames: String):
        Unit = requiredFileSystemLocationNames(requiredFileSystemLocationNames.toList())

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role that workers use when running
     * jobs in this queue.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags The tags to add to your queue.
     * Each tag consists of a tag key and a tag value. Tag keys and values are both required, but
     * tag values can be empty strings.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags to add to your queue.
     * Each tag consists of a tag key and a tag value. Tag keys and values are both required, but
     * tag values can be empty strings.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.deadline.CfnQueueProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.deadline.CfnQueueProps,
  ) : CdkObject(cdkObject),
      CfnQueueProps {
    /**
     * The identifiers of the storage profiles that this queue can use to share assets between
     * workers using different operating systems.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-allowedstorageprofileids)
     */
    override fun allowedStorageProfileIds(): List<String> =
        unwrap(this).getAllowedStorageProfileIds() ?: emptyList()

    /**
     * The default action taken on a queue summary if a budget wasn't configured.
     *
     * Default: - "NONE"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-defaultbudgetaction)
     */
    override fun defaultBudgetAction(): String? = unwrap(this).getDefaultBudgetAction()

    /**
     * A description of the queue that helps identify what the queue is used for.
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The display name of the queue summary to update.
     *
     *
     * This field can store any content. Escape or encode this content before displaying it on a
     * webpage or any other system that might interpret the content of this field.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-displayname)
     */
    override fun displayName(): String = unwrap(this).getDisplayName()

    /**
     * The farm ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-farmid)
     */
    override fun farmId(): String = unwrap(this).getFarmId()

    /**
     * The job attachment settings.
     *
     * These are the Amazon S3 bucket name and the Amazon S3 prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-jobattachmentsettings)
     */
    override fun jobAttachmentSettings(): Any? = unwrap(this).getJobAttachmentSettings()

    /**
     * Identifies the user for a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-jobrunasuser)
     */
    override fun jobRunAsUser(): Any? = unwrap(this).getJobRunAsUser()

    /**
     * The file system location that the queue uses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-requiredfilesystemlocationnames)
     */
    override fun requiredFileSystemLocationNames(): List<String> =
        unwrap(this).getRequiredFileSystemLocationNames() ?: emptyList()

    /**
     * The Amazon Resource Name (ARN) of the IAM role that workers use when running jobs in this
     * queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-rolearn)
     */
    override fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * The tags to add to your queue.
     *
     * Each tag consists of a tag key and a tag value. Tag keys and values are both required, but
     * tag values can be empty strings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queue.html#cfn-deadline-queue-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnQueueProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnQueueProps):
        CfnQueueProps = CdkObjectWrappers.wrap(cdkObject) as? CfnQueueProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnQueueProps):
        software.amazon.awscdk.services.deadline.CfnQueueProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.deadline.CfnQueueProps
  }
}
