package io.cloudshiftdev.awscdk.services.cloudtrail

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface TrailProps {
  /**
   * The Amazon S3 bucket.
   *
   * Default: - if not supplied a bucket will be created with all the correct permisions
   */
  public fun bucket(): IBucket? = unwrap(this).getBucket()?.let(IBucket::wrap)

  /**
   * Log Group to which CloudTrail to push logs to.
   *
   * Ignored if sendToCloudWatchLogs is set to false.
   *
   * Default: - a new log group is created and used.
   */
  public fun cloudWatchLogGroup(): ILogGroup? =
      unwrap(this).getCloudWatchLogGroup()?.let(ILogGroup::wrap)

  /**
   * How long to retain logs in CloudWatchLogs.
   *
   * Ignored if sendToCloudWatchLogs is false or if cloudWatchLogGroup is set.
   *
   * Default: logs.RetentionDays.ONE_YEAR
   */
  public fun cloudWatchLogsRetention(): RetentionDays? =
      unwrap(this).getCloudWatchLogsRetention()?.let(RetentionDays::wrap)

  /**
   * To determine whether a log file was modified, deleted, or unchanged after CloudTrail delivered
   * it, you can use CloudTrail log file integrity validation.
   *
   * This feature is built using industry standard algorithms: SHA-256 for hashing and SHA-256 with
   * RSA for digital signing.
   * This makes it computationally infeasible to modify, delete or forge CloudTrail log files
   * without detection.
   * You can use the AWS CLI to validate the files in the location where CloudTrail delivered them.
   *
   * Default: true
   */
  public fun enableFileValidation(): Boolean? = unwrap(this).getEnableFileValidation()

  /**
   * The AWS Key Management Service (AWS KMS) key ID that you want to use to encrypt CloudTrail
   * logs.
   *
   * Default: - No encryption.
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * For most services, events are recorded in the region where the action occurred.
   *
   * For global services such as AWS Identity and Access Management (IAM), AWS STS, Amazon
   * CloudFront, and Route 53,
   * events are delivered to any trail that includes global services, and are logged as occurring in
   * US East (N. Virginia) Region.
   *
   * Default: true
   */
  public fun includeGlobalServiceEvents(): Boolean? = unwrap(this).getIncludeGlobalServiceEvents()

  /**
   * A JSON string that contains the insight types you want to log on a trail.
   *
   * Default: - No Value.
   */
  public fun insightTypes(): List<InsightType> =
      unwrap(this).getInsightTypes()?.map(InsightType::wrap) ?: emptyList()

  /**
   * Whether or not this trail delivers log files from multiple regions to a single S3 bucket for a
   * single account.
   *
   * Default: true
   */
  public fun isMultiRegionTrail(): Boolean? = unwrap(this).getIsMultiRegionTrail()

  /**
   * Specifies whether the trail is applied to all accounts in an organization in AWS Organizations,
   * or only for the current AWS account.
   *
   * If this is set to true then the current account *must* be the management account. If it is not,
   * then CloudFormation will throw an error.
   *
   * If this is set to true and the current account is a management account for an organization in
   * AWS Organizations, the trail will be created in all AWS accounts that belong to the organization.
   * If this is set to false, the trail will remain in the current AWS account but be deleted from
   * all member accounts in the organization.
   *
   * Default: - false
   */
  public fun isOrganizationTrail(): Boolean? = unwrap(this).getIsOrganizationTrail()

  /**
   * When an event occurs in your account, CloudTrail evaluates whether the event matches the
   * settings for your trails.
   *
   * Only events that match your trail settings are delivered to your Amazon S3 bucket and Amazon
   * CloudWatch Logs log group.
   *
   * This method sets the management configuration for this trail.
   *
   * Management events provide insight into management operations that are performed on resources in
   * your AWS account.
   * These are also known as control plane operations.
   * Management events can also include non-API events that occur in your account.
   * For example, when a user logs in to your account, CloudTrail logs the ConsoleLogin event.
   *
   * Default: ReadWriteType.ALL
   */
  public fun managementEvents(): ReadWriteType? =
      unwrap(this).getManagementEvents()?.let(ReadWriteType::wrap)

  /**
   * The orgId.
   *
   * Required when `isOrganizationTrail` is set to true to attach the necessary permissions.
   *
   * Default: - No orgId
   */
  public fun orgId(): String? = unwrap(this).getOrgId()

  /**
   * An Amazon S3 object key prefix that precedes the name of all log files.
   *
   * Default: - No prefix.
   */
  public fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()

  /**
   * If CloudTrail pushes logs to CloudWatch Logs in addition to S3.
   *
   * Disabled for cost out of the box.
   *
   * Default: false
   */
  public fun sendToCloudWatchLogs(): Boolean? = unwrap(this).getSendToCloudWatchLogs()

  /**
   * SNS topic that is notified when new log files are published.
   *
   * Default: - No notifications.
   */
  public fun snsTopic(): ITopic? = unwrap(this).getSnsTopic()?.let(ITopic::wrap)

  /**
   * The name of the trail.
   *
   * We recommend customers do not set an explicit name.
   *
   * Default: - AWS CloudFormation generated name.
   */
  public fun trailName(): String? = unwrap(this).getTrailName()

  /**
   * A builder for [TrailProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket The Amazon S3 bucket.
     */
    public fun bucket(bucket: IBucket)

    /**
     * @param cloudWatchLogGroup Log Group to which CloudTrail to push logs to.
     * Ignored if sendToCloudWatchLogs is set to false.
     */
    public fun cloudWatchLogGroup(cloudWatchLogGroup: ILogGroup)

    /**
     * @param cloudWatchLogsRetention How long to retain logs in CloudWatchLogs.
     * Ignored if sendToCloudWatchLogs is false or if cloudWatchLogGroup is set.
     */
    public fun cloudWatchLogsRetention(cloudWatchLogsRetention: RetentionDays)

    /**
     * @param enableFileValidation To determine whether a log file was modified, deleted, or
     * unchanged after CloudTrail delivered it, you can use CloudTrail log file integrity validation.
     * This feature is built using industry standard algorithms: SHA-256 for hashing and SHA-256
     * with RSA for digital signing.
     * This makes it computationally infeasible to modify, delete or forge CloudTrail log files
     * without detection.
     * You can use the AWS CLI to validate the files in the location where CloudTrail delivered
     * them.
     */
    public fun enableFileValidation(enableFileValidation: Boolean)

    /**
     * @param encryptionKey The AWS Key Management Service (AWS KMS) key ID that you want to use to
     * encrypt CloudTrail logs.
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * @param includeGlobalServiceEvents For most services, events are recorded in the region where
     * the action occurred.
     * For global services such as AWS Identity and Access Management (IAM), AWS STS, Amazon
     * CloudFront, and Route 53,
     * events are delivered to any trail that includes global services, and are logged as occurring
     * in US East (N. Virginia) Region.
     */
    public fun includeGlobalServiceEvents(includeGlobalServiceEvents: Boolean)

    /**
     * @param insightTypes A JSON string that contains the insight types you want to log on a trail.
     */
    public fun insightTypes(insightTypes: List<InsightType>)

    /**
     * @param insightTypes A JSON string that contains the insight types you want to log on a trail.
     */
    public fun insightTypes(vararg insightTypes: InsightType)

    /**
     * @param isMultiRegionTrail Whether or not this trail delivers log files from multiple regions
     * to a single S3 bucket for a single account.
     */
    public fun isMultiRegionTrail(isMultiRegionTrail: Boolean)

    /**
     * @param isOrganizationTrail Specifies whether the trail is applied to all accounts in an
     * organization in AWS Organizations, or only for the current AWS account.
     * If this is set to true then the current account *must* be the management account. If it is
     * not, then CloudFormation will throw an error.
     *
     * If this is set to true and the current account is a management account for an organization in
     * AWS Organizations, the trail will be created in all AWS accounts that belong to the
     * organization.
     * If this is set to false, the trail will remain in the current AWS account but be deleted from
     * all member accounts in the organization.
     */
    public fun isOrganizationTrail(isOrganizationTrail: Boolean)

    /**
     * @param managementEvents When an event occurs in your account, CloudTrail evaluates whether
     * the event matches the settings for your trails.
     * Only events that match your trail settings are delivered to your Amazon S3 bucket and Amazon
     * CloudWatch Logs log group.
     *
     * This method sets the management configuration for this trail.
     *
     * Management events provide insight into management operations that are performed on resources
     * in your AWS account.
     * These are also known as control plane operations.
     * Management events can also include non-API events that occur in your account.
     * For example, when a user logs in to your account, CloudTrail logs the ConsoleLogin event.
     */
    public fun managementEvents(managementEvents: ReadWriteType)

    /**
     * @param orgId The orgId.
     * Required when `isOrganizationTrail` is set to true to attach the necessary permissions.
     */
    public fun orgId(orgId: String)

    /**
     * @param s3KeyPrefix An Amazon S3 object key prefix that precedes the name of all log files.
     */
    public fun s3KeyPrefix(s3KeyPrefix: String)

    /**
     * @param sendToCloudWatchLogs If CloudTrail pushes logs to CloudWatch Logs in addition to S3.
     * Disabled for cost out of the box.
     */
    public fun sendToCloudWatchLogs(sendToCloudWatchLogs: Boolean)

    /**
     * @param snsTopic SNS topic that is notified when new log files are published.
     */
    public fun snsTopic(snsTopic: ITopic)

    /**
     * @param trailName The name of the trail.
     * We recommend customers do not set an explicit name.
     */
    public fun trailName(trailName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudtrail.TrailProps.Builder =
        software.amazon.awscdk.services.cloudtrail.TrailProps.builder()

    /**
     * @param bucket The Amazon S3 bucket.
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    /**
     * @param cloudWatchLogGroup Log Group to which CloudTrail to push logs to.
     * Ignored if sendToCloudWatchLogs is set to false.
     */
    override fun cloudWatchLogGroup(cloudWatchLogGroup: ILogGroup) {
      cdkBuilder.cloudWatchLogGroup(cloudWatchLogGroup.let(ILogGroup::unwrap))
    }

    /**
     * @param cloudWatchLogsRetention How long to retain logs in CloudWatchLogs.
     * Ignored if sendToCloudWatchLogs is false or if cloudWatchLogGroup is set.
     */
    override fun cloudWatchLogsRetention(cloudWatchLogsRetention: RetentionDays) {
      cdkBuilder.cloudWatchLogsRetention(cloudWatchLogsRetention.let(RetentionDays::unwrap))
    }

    /**
     * @param enableFileValidation To determine whether a log file was modified, deleted, or
     * unchanged after CloudTrail delivered it, you can use CloudTrail log file integrity validation.
     * This feature is built using industry standard algorithms: SHA-256 for hashing and SHA-256
     * with RSA for digital signing.
     * This makes it computationally infeasible to modify, delete or forge CloudTrail log files
     * without detection.
     * You can use the AWS CLI to validate the files in the location where CloudTrail delivered
     * them.
     */
    override fun enableFileValidation(enableFileValidation: Boolean) {
      cdkBuilder.enableFileValidation(enableFileValidation)
    }

    /**
     * @param encryptionKey The AWS Key Management Service (AWS KMS) key ID that you want to use to
     * encrypt CloudTrail logs.
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    /**
     * @param includeGlobalServiceEvents For most services, events are recorded in the region where
     * the action occurred.
     * For global services such as AWS Identity and Access Management (IAM), AWS STS, Amazon
     * CloudFront, and Route 53,
     * events are delivered to any trail that includes global services, and are logged as occurring
     * in US East (N. Virginia) Region.
     */
    override fun includeGlobalServiceEvents(includeGlobalServiceEvents: Boolean) {
      cdkBuilder.includeGlobalServiceEvents(includeGlobalServiceEvents)
    }

    /**
     * @param insightTypes A JSON string that contains the insight types you want to log on a trail.
     */
    override fun insightTypes(insightTypes: List<InsightType>) {
      cdkBuilder.insightTypes(insightTypes.map(InsightType::unwrap))
    }

    /**
     * @param insightTypes A JSON string that contains the insight types you want to log on a trail.
     */
    override fun insightTypes(vararg insightTypes: InsightType): Unit =
        insightTypes(insightTypes.toList())

    /**
     * @param isMultiRegionTrail Whether or not this trail delivers log files from multiple regions
     * to a single S3 bucket for a single account.
     */
    override fun isMultiRegionTrail(isMultiRegionTrail: Boolean) {
      cdkBuilder.isMultiRegionTrail(isMultiRegionTrail)
    }

    /**
     * @param isOrganizationTrail Specifies whether the trail is applied to all accounts in an
     * organization in AWS Organizations, or only for the current AWS account.
     * If this is set to true then the current account *must* be the management account. If it is
     * not, then CloudFormation will throw an error.
     *
     * If this is set to true and the current account is a management account for an organization in
     * AWS Organizations, the trail will be created in all AWS accounts that belong to the
     * organization.
     * If this is set to false, the trail will remain in the current AWS account but be deleted from
     * all member accounts in the organization.
     */
    override fun isOrganizationTrail(isOrganizationTrail: Boolean) {
      cdkBuilder.isOrganizationTrail(isOrganizationTrail)
    }

    /**
     * @param managementEvents When an event occurs in your account, CloudTrail evaluates whether
     * the event matches the settings for your trails.
     * Only events that match your trail settings are delivered to your Amazon S3 bucket and Amazon
     * CloudWatch Logs log group.
     *
     * This method sets the management configuration for this trail.
     *
     * Management events provide insight into management operations that are performed on resources
     * in your AWS account.
     * These are also known as control plane operations.
     * Management events can also include non-API events that occur in your account.
     * For example, when a user logs in to your account, CloudTrail logs the ConsoleLogin event.
     */
    override fun managementEvents(managementEvents: ReadWriteType) {
      cdkBuilder.managementEvents(managementEvents.let(ReadWriteType::unwrap))
    }

    /**
     * @param orgId The orgId.
     * Required when `isOrganizationTrail` is set to true to attach the necessary permissions.
     */
    override fun orgId(orgId: String) {
      cdkBuilder.orgId(orgId)
    }

    /**
     * @param s3KeyPrefix An Amazon S3 object key prefix that precedes the name of all log files.
     */
    override fun s3KeyPrefix(s3KeyPrefix: String) {
      cdkBuilder.s3KeyPrefix(s3KeyPrefix)
    }

    /**
     * @param sendToCloudWatchLogs If CloudTrail pushes logs to CloudWatch Logs in addition to S3.
     * Disabled for cost out of the box.
     */
    override fun sendToCloudWatchLogs(sendToCloudWatchLogs: Boolean) {
      cdkBuilder.sendToCloudWatchLogs(sendToCloudWatchLogs)
    }

    /**
     * @param snsTopic SNS topic that is notified when new log files are published.
     */
    override fun snsTopic(snsTopic: ITopic) {
      cdkBuilder.snsTopic(snsTopic.let(ITopic::unwrap))
    }

    /**
     * @param trailName The name of the trail.
     * We recommend customers do not set an explicit name.
     */
    override fun trailName(trailName: String) {
      cdkBuilder.trailName(trailName)
    }

    public fun build(): software.amazon.awscdk.services.cloudtrail.TrailProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudtrail.TrailProps,
  ) : CdkObject(cdkObject), TrailProps {
    /**
     * The Amazon S3 bucket.
     *
     * Default: - if not supplied a bucket will be created with all the correct permisions
     */
    override fun bucket(): IBucket? = unwrap(this).getBucket()?.let(IBucket::wrap)

    /**
     * Log Group to which CloudTrail to push logs to.
     *
     * Ignored if sendToCloudWatchLogs is set to false.
     *
     * Default: - a new log group is created and used.
     */
    override fun cloudWatchLogGroup(): ILogGroup? =
        unwrap(this).getCloudWatchLogGroup()?.let(ILogGroup::wrap)

    /**
     * How long to retain logs in CloudWatchLogs.
     *
     * Ignored if sendToCloudWatchLogs is false or if cloudWatchLogGroup is set.
     *
     * Default: logs.RetentionDays.ONE_YEAR
     */
    override fun cloudWatchLogsRetention(): RetentionDays? =
        unwrap(this).getCloudWatchLogsRetention()?.let(RetentionDays::wrap)

    /**
     * To determine whether a log file was modified, deleted, or unchanged after CloudTrail
     * delivered it, you can use CloudTrail log file integrity validation.
     *
     * This feature is built using industry standard algorithms: SHA-256 for hashing and SHA-256
     * with RSA for digital signing.
     * This makes it computationally infeasible to modify, delete or forge CloudTrail log files
     * without detection.
     * You can use the AWS CLI to validate the files in the location where CloudTrail delivered
     * them.
     *
     * Default: true
     */
    override fun enableFileValidation(): Boolean? = unwrap(this).getEnableFileValidation()

    /**
     * The AWS Key Management Service (AWS KMS) key ID that you want to use to encrypt CloudTrail
     * logs.
     *
     * Default: - No encryption.
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * For most services, events are recorded in the region where the action occurred.
     *
     * For global services such as AWS Identity and Access Management (IAM), AWS STS, Amazon
     * CloudFront, and Route 53,
     * events are delivered to any trail that includes global services, and are logged as occurring
     * in US East (N. Virginia) Region.
     *
     * Default: true
     */
    override fun includeGlobalServiceEvents(): Boolean? =
        unwrap(this).getIncludeGlobalServiceEvents()

    /**
     * A JSON string that contains the insight types you want to log on a trail.
     *
     * Default: - No Value.
     */
    override fun insightTypes(): List<InsightType> =
        unwrap(this).getInsightTypes()?.map(InsightType::wrap) ?: emptyList()

    /**
     * Whether or not this trail delivers log files from multiple regions to a single S3 bucket for
     * a single account.
     *
     * Default: true
     */
    override fun isMultiRegionTrail(): Boolean? = unwrap(this).getIsMultiRegionTrail()

    /**
     * Specifies whether the trail is applied to all accounts in an organization in AWS
     * Organizations, or only for the current AWS account.
     *
     * If this is set to true then the current account *must* be the management account. If it is
     * not, then CloudFormation will throw an error.
     *
     * If this is set to true and the current account is a management account for an organization in
     * AWS Organizations, the trail will be created in all AWS accounts that belong to the
     * organization.
     * If this is set to false, the trail will remain in the current AWS account but be deleted from
     * all member accounts in the organization.
     *
     * Default: - false
     */
    override fun isOrganizationTrail(): Boolean? = unwrap(this).getIsOrganizationTrail()

    /**
     * When an event occurs in your account, CloudTrail evaluates whether the event matches the
     * settings for your trails.
     *
     * Only events that match your trail settings are delivered to your Amazon S3 bucket and Amazon
     * CloudWatch Logs log group.
     *
     * This method sets the management configuration for this trail.
     *
     * Management events provide insight into management operations that are performed on resources
     * in your AWS account.
     * These are also known as control plane operations.
     * Management events can also include non-API events that occur in your account.
     * For example, when a user logs in to your account, CloudTrail logs the ConsoleLogin event.
     *
     * Default: ReadWriteType.ALL
     */
    override fun managementEvents(): ReadWriteType? =
        unwrap(this).getManagementEvents()?.let(ReadWriteType::wrap)

    /**
     * The orgId.
     *
     * Required when `isOrganizationTrail` is set to true to attach the necessary permissions.
     *
     * Default: - No orgId
     */
    override fun orgId(): String? = unwrap(this).getOrgId()

    /**
     * An Amazon S3 object key prefix that precedes the name of all log files.
     *
     * Default: - No prefix.
     */
    override fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()

    /**
     * If CloudTrail pushes logs to CloudWatch Logs in addition to S3.
     *
     * Disabled for cost out of the box.
     *
     * Default: false
     */
    override fun sendToCloudWatchLogs(): Boolean? = unwrap(this).getSendToCloudWatchLogs()

    /**
     * SNS topic that is notified when new log files are published.
     *
     * Default: - No notifications.
     */
    override fun snsTopic(): ITopic? = unwrap(this).getSnsTopic()?.let(ITopic::wrap)

    /**
     * The name of the trail.
     *
     * We recommend customers do not set an explicit name.
     *
     * Default: - AWS CloudFormation generated name.
     */
    override fun trailName(): String? = unwrap(this).getTrailName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TrailProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.TrailProps): TrailProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TrailProps): software.amazon.awscdk.services.cloudtrail.TrailProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudtrail.TrailProps
  }
}
