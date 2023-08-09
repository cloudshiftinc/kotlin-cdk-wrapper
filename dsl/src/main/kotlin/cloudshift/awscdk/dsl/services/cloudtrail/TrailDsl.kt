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

package cloudshift.awscdk.dsl.services.cloudtrail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudtrail.InsightType
import software.amazon.awscdk.services.cloudtrail.ReadWriteType
import software.amazon.awscdk.services.cloudtrail.Trail
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.logs.RetentionDays
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.sns.ITopic
import software.constructs.Construct

/**
 * Cloud trail allows you to log events that happen in your AWS account For example:.
 *
 * import { CloudTrail } from 'aws-cdk-lib/aws-cloudtrail'
 *
 * const cloudTrail = new CloudTrail(this, 'MyTrail');
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.cloudtrail.*;
 * IAlias myKeyAlias = Alias.fromAliasName(this, "myKey", "alias/aws/s3");
 * Trail trail = Trail.Builder.create(this, "myCloudTrail")
 * .sendToCloudWatchLogs(true)
 * .kmsKey(myKeyAlias)
 * .build();
 * ```
 */
@CdkDslMarker
public class TrailDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Trail.Builder = Trail.Builder.create(scope, id)

    private val _insightTypes: MutableList<InsightType> = mutableListOf()

    /**
     * The Amazon S3 bucket.
     *
     * Default: - if not supplied a bucket will be created with all the correct permisions
     *
     * @param bucket The Amazon S3 bucket.
     */
    public fun bucket(bucket: IBucket) {
        cdkBuilder.bucket(bucket)
    }

    /**
     * Log Group to which CloudTrail to push logs to.
     *
     * Ignored if sendToCloudWatchLogs is set to false.
     *
     * Default: - a new log group is created and used.
     *
     * @param cloudWatchLogGroup Log Group to which CloudTrail to push logs to.
     */
    public fun cloudWatchLogGroup(cloudWatchLogGroup: ILogGroup) {
        cdkBuilder.cloudWatchLogGroup(cloudWatchLogGroup)
    }

    /**
     * How long to retain logs in CloudWatchLogs.
     *
     * Ignored if sendToCloudWatchLogs is false or if cloudWatchLogGroup is set.
     *
     * Default: logs.RetentionDays.ONE_YEAR
     *
     * @param cloudWatchLogsRetention How long to retain logs in CloudWatchLogs.
     */
    public fun cloudWatchLogsRetention(cloudWatchLogsRetention: RetentionDays) {
        cdkBuilder.cloudWatchLogsRetention(cloudWatchLogsRetention)
    }

    /**
     * To determine whether a log file was modified, deleted, or unchanged after CloudTrail
     * delivered it, you can use CloudTrail log file integrity validation.
     *
     * This feature is built using industry standard algorithms: SHA-256 for hashing and SHA-256
     * with RSA for digital signing. This makes it computationally infeasible to modify, delete or
     * forge CloudTrail log files without detection. You can use the AWS CLI to validate the files
     * in the location where CloudTrail delivered them.
     *
     * Default: true
     *
     * @param enableFileValidation To determine whether a log file was modified, deleted, or
     *   unchanged after CloudTrail delivered it, you can use CloudTrail log file integrity
     *   validation.
     */
    public fun enableFileValidation(enableFileValidation: Boolean) {
        cdkBuilder.enableFileValidation(enableFileValidation)
    }

    /**
     * The AWS Key Management Service (AWS KMS) key ID that you want to use to encrypt CloudTrail
     * logs.
     *
     * Default: - No encryption.
     *
     * @param encryptionKey The AWS Key Management Service (AWS KMS) key ID that you want to use to
     *   encrypt CloudTrail logs.
     */
    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    /**
     * For most services, events are recorded in the region where the action occurred.
     *
     * For global services such as AWS Identity and Access Management (IAM), AWS STS, Amazon
     * CloudFront, and Route 53, events are delivered to any trail that includes global services,
     * and are logged as occurring in US East (N. Virginia) Region.
     *
     * Default: true
     *
     * @param includeGlobalServiceEvents For most services, events are recorded in the region where
     *   the action occurred.
     */
    public fun includeGlobalServiceEvents(includeGlobalServiceEvents: Boolean) {
        cdkBuilder.includeGlobalServiceEvents(includeGlobalServiceEvents)
    }

    /**
     * A JSON string that contains the insight types you want to log on a trail.
     *
     * Default: - No Value.
     *
     * @param insightTypes A JSON string that contains the insight types you want to log on a trail.
     */
    public fun insightTypes(vararg insightTypes: InsightType) {
        _insightTypes.addAll(listOf(*insightTypes))
    }

    /**
     * A JSON string that contains the insight types you want to log on a trail.
     *
     * Default: - No Value.
     *
     * @param insightTypes A JSON string that contains the insight types you want to log on a trail.
     */
    public fun insightTypes(insightTypes: Collection<InsightType>) {
        _insightTypes.addAll(insightTypes)
    }

    /**
     * Whether or not this trail delivers log files from multiple regions to a single S3 bucket for
     * a single account.
     *
     * Default: true
     *
     * @param isMultiRegionTrail Whether or not this trail delivers log files from multiple regions
     *   to a single S3 bucket for a single account.
     */
    public fun isMultiRegionTrail(isMultiRegionTrail: Boolean) {
        cdkBuilder.isMultiRegionTrail(isMultiRegionTrail)
    }

    /**
     * Specifies whether the trail is applied to all accounts in an organization in AWS
     * Organizations, or only for the current AWS account.
     *
     * If this is set to true then the current account *must* be the management account. If it is
     * not, then CloudFormation will throw an error.
     *
     * If this is set to true and the current account is a management account for an organization in
     * AWS Organizations, the trail will be created in all AWS accounts that belong to the
     * organization. If this is set to false, the trail will remain in the current AWS account but
     * be deleted from all member accounts in the organization.
     *
     * Default: - false
     *
     * @param isOrganizationTrail Specifies whether the trail is applied to all accounts in an
     *   organization in AWS Organizations, or only for the current AWS account.
     */
    public fun isOrganizationTrail(isOrganizationTrail: Boolean) {
        cdkBuilder.isOrganizationTrail(isOrganizationTrail)
    }

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
     * in your AWS account. These are also known as control plane operations. Management events can
     * also include non-API events that occur in your account. For example, when a user logs in to
     * your account, CloudTrail logs the ConsoleLogin event.
     *
     * Default: ReadWriteType.ALL
     *
     * @param managementEvents When an event occurs in your account, CloudTrail evaluates whether
     *   the event matches the settings for your trails.
     */
    public fun managementEvents(managementEvents: ReadWriteType) {
        cdkBuilder.managementEvents(managementEvents)
    }

    /**
     * An Amazon S3 object key prefix that precedes the name of all log files.
     *
     * Default: - No prefix.
     *
     * @param s3KeyPrefix An Amazon S3 object key prefix that precedes the name of all log files.
     */
    public fun s3KeyPrefix(s3KeyPrefix: String) {
        cdkBuilder.s3KeyPrefix(s3KeyPrefix)
    }

    /**
     * If CloudTrail pushes logs to CloudWatch Logs in addition to S3.
     *
     * Disabled for cost out of the box.
     *
     * Default: false
     *
     * @param sendToCloudWatchLogs If CloudTrail pushes logs to CloudWatch Logs in addition to S3.
     */
    public fun sendToCloudWatchLogs(sendToCloudWatchLogs: Boolean) {
        cdkBuilder.sendToCloudWatchLogs(sendToCloudWatchLogs)
    }

    /**
     * SNS topic that is notified when new log files are published.
     *
     * Default: - No notifications.
     *
     * @param snsTopic SNS topic that is notified when new log files are published.
     */
    public fun snsTopic(snsTopic: ITopic) {
        cdkBuilder.snsTopic(snsTopic)
    }

    /**
     * The name of the trail.
     *
     * We recommend customers do not set an explicit name.
     *
     * Default: - AWS CloudFormation generated name.
     *
     * @param trailName The name of the trail.
     */
    public fun trailName(trailName: String) {
        cdkBuilder.trailName(trailName)
    }

    public fun build(): Trail {
        if (_insightTypes.isNotEmpty()) cdkBuilder.insightTypes(_insightTypes)
        return cdkBuilder.build()
    }
}
