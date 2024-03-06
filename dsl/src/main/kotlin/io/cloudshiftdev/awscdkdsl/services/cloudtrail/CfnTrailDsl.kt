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

package io.cloudshiftdev.awscdkdsl.services.cloudtrail

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudtrail.CfnTrail
import software.constructs.Construct

/**
 * Creates a trail that specifies the settings for delivery of log data to an Amazon S3 bucket.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudtrail.*;
 * CfnTrail cfnTrail = CfnTrail.Builder.create(this, "MyCfnTrail")
 * .isLogging(false)
 * .s3BucketName("s3BucketName")
 * // the properties below are optional
 * .advancedEventSelectors(List.of(AdvancedEventSelectorProperty.builder()
 * .fieldSelectors(List.of(AdvancedFieldSelectorProperty.builder()
 * .field("field")
 * // the properties below are optional
 * .endsWith(List.of("endsWith"))
 * .equalTo(List.of("equalTo"))
 * .notEndsWith(List.of("notEndsWith"))
 * .notEquals(List.of("notEquals"))
 * .notStartsWith(List.of("notStartsWith"))
 * .startsWith(List.of("startsWith"))
 * .build()))
 * // the properties below are optional
 * .name("name")
 * .build()))
 * .cloudWatchLogsLogGroupArn("cloudWatchLogsLogGroupArn")
 * .cloudWatchLogsRoleArn("cloudWatchLogsRoleArn")
 * .enableLogFileValidation(false)
 * .eventSelectors(List.of(EventSelectorProperty.builder()
 * .dataResources(List.of(DataResourceProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .values(List.of("values"))
 * .build()))
 * .excludeManagementEventSources(List.of("excludeManagementEventSources"))
 * .includeManagementEvents(false)
 * .readWriteType("readWriteType")
 * .build()))
 * .includeGlobalServiceEvents(false)
 * .insightSelectors(List.of(InsightSelectorProperty.builder()
 * .insightType("insightType")
 * .build()))
 * .isMultiRegionTrail(false)
 * .isOrganizationTrail(false)
 * .kmsKeyId("kmsKeyId")
 * .s3KeyPrefix("s3KeyPrefix")
 * .snsTopicName("snsTopicName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .trailName("trailName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html)
 */
@CdkDslMarker
public class CfnTrailDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTrail.Builder = CfnTrail.Builder.create(scope, id)

    private val _advancedEventSelectors: MutableList<Any> = mutableListOf()

    private val _eventSelectors: MutableList<Any> = mutableListOf()

    private val _insightSelectors: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Specifies the settings for advanced event selectors.
     *
     * You can add advanced event selectors, and conditions for your advanced event selectors, up to
     * a maximum of 500 values for all conditions and selectors on a trail. You can use either
     * `AdvancedEventSelectors` or `EventSelectors` , but not both. If you apply
     * `AdvancedEventSelectors` to a trail, any existing `EventSelectors` are overwritten. For more
     * information about advanced event selectors, see
     * [Logging data events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
     * in the *AWS CloudTrail User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-advancedeventselectors)
     *
     * @param advancedEventSelectors Specifies the settings for advanced event selectors.
     */
    public fun advancedEventSelectors(vararg advancedEventSelectors: Any) {
        _advancedEventSelectors.addAll(listOf(*advancedEventSelectors))
    }

    /**
     * Specifies the settings for advanced event selectors.
     *
     * You can add advanced event selectors, and conditions for your advanced event selectors, up to
     * a maximum of 500 values for all conditions and selectors on a trail. You can use either
     * `AdvancedEventSelectors` or `EventSelectors` , but not both. If you apply
     * `AdvancedEventSelectors` to a trail, any existing `EventSelectors` are overwritten. For more
     * information about advanced event selectors, see
     * [Logging data events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
     * in the *AWS CloudTrail User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-advancedeventselectors)
     *
     * @param advancedEventSelectors Specifies the settings for advanced event selectors.
     */
    public fun advancedEventSelectors(advancedEventSelectors: Collection<Any>) {
        _advancedEventSelectors.addAll(advancedEventSelectors)
    }

    /**
     * Specifies the settings for advanced event selectors.
     *
     * You can add advanced event selectors, and conditions for your advanced event selectors, up to
     * a maximum of 500 values for all conditions and selectors on a trail. You can use either
     * `AdvancedEventSelectors` or `EventSelectors` , but not both. If you apply
     * `AdvancedEventSelectors` to a trail, any existing `EventSelectors` are overwritten. For more
     * information about advanced event selectors, see
     * [Logging data events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
     * in the *AWS CloudTrail User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-advancedeventselectors)
     *
     * @param advancedEventSelectors Specifies the settings for advanced event selectors.
     */
    public fun advancedEventSelectors(advancedEventSelectors: IResolvable) {
        cdkBuilder.advancedEventSelectors(advancedEventSelectors)
    }

    /**
     * Specifies a log group name using an Amazon Resource Name (ARN), a unique identifier that
     * represents the log group to which CloudTrail logs are delivered.
     *
     * You must use a log group that exists in your account.
     *
     * Not required unless you specify `CloudWatchLogsRoleArn` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsloggrouparn)
     *
     * @param cloudWatchLogsLogGroupArn Specifies a log group name using an Amazon Resource Name
     *   (ARN), a unique identifier that represents the log group to which CloudTrail logs are
     *   delivered.
     */
    public fun cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn: String) {
        cdkBuilder.cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn)
    }

    /**
     * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
     *
     * You must use a role that exists in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsrolearn)
     *
     * @param cloudWatchLogsRoleArn Specifies the role for the CloudWatch Logs endpoint to assume to
     *   write to a user's log group.
     */
    public fun cloudWatchLogsRoleArn(cloudWatchLogsRoleArn: String) {
        cdkBuilder.cloudWatchLogsRoleArn(cloudWatchLogsRoleArn)
    }

    /**
     * Specifies whether log file validation is enabled. The default is false.
     *
     * When you disable log file integrity validation, the chain of digest files is broken after one
     * hour. CloudTrail does not create digest files for log files that were delivered during a
     * period in which log file integrity validation was disabled. For example, if you enable log
     * file integrity validation at noon on January 1, disable it at noon on January 2, and
     * re-enable it at noon on January 10, digest files will not be created for the log files
     * delivered from noon on January 2 to noon on January 10. The same applies whenever you stop
     * CloudTrail logging or delete a trail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-enablelogfilevalidation)
     *
     * @param enableLogFileValidation Specifies whether log file validation is enabled. The default
     *   is false.
     */
    public fun enableLogFileValidation(enableLogFileValidation: Boolean) {
        cdkBuilder.enableLogFileValidation(enableLogFileValidation)
    }

    /**
     * Specifies whether log file validation is enabled. The default is false.
     *
     * When you disable log file integrity validation, the chain of digest files is broken after one
     * hour. CloudTrail does not create digest files for log files that were delivered during a
     * period in which log file integrity validation was disabled. For example, if you enable log
     * file integrity validation at noon on January 1, disable it at noon on January 2, and
     * re-enable it at noon on January 10, digest files will not be created for the log files
     * delivered from noon on January 2 to noon on January 10. The same applies whenever you stop
     * CloudTrail logging or delete a trail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-enablelogfilevalidation)
     *
     * @param enableLogFileValidation Specifies whether log file validation is enabled. The default
     *   is false.
     */
    public fun enableLogFileValidation(enableLogFileValidation: IResolvable) {
        cdkBuilder.enableLogFileValidation(enableLogFileValidation)
    }

    /**
     * Use event selectors to further specify the management and data event settings for your trail.
     *
     * By default, trails created without specific event selectors will be configured to log all
     * read and write management events, and no data events. When an event occurs in your account,
     * CloudTrail evaluates the event selector for all trails. For each trail, if the event matches
     * any event selector, the trail processes and logs the event. If the event doesn't match any
     * event selector, the trail doesn't log the event.
     *
     * You can configure up to five event selectors for a trail.
     *
     * You cannot apply both event selectors and advanced event selectors to a trail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-eventselectors)
     *
     * @param eventSelectors Use event selectors to further specify the management and data event
     *   settings for your trail.
     */
    public fun eventSelectors(vararg eventSelectors: Any) {
        _eventSelectors.addAll(listOf(*eventSelectors))
    }

    /**
     * Use event selectors to further specify the management and data event settings for your trail.
     *
     * By default, trails created without specific event selectors will be configured to log all
     * read and write management events, and no data events. When an event occurs in your account,
     * CloudTrail evaluates the event selector for all trails. For each trail, if the event matches
     * any event selector, the trail processes and logs the event. If the event doesn't match any
     * event selector, the trail doesn't log the event.
     *
     * You can configure up to five event selectors for a trail.
     *
     * You cannot apply both event selectors and advanced event selectors to a trail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-eventselectors)
     *
     * @param eventSelectors Use event selectors to further specify the management and data event
     *   settings for your trail.
     */
    public fun eventSelectors(eventSelectors: Collection<Any>) {
        _eventSelectors.addAll(eventSelectors)
    }

    /**
     * Use event selectors to further specify the management and data event settings for your trail.
     *
     * By default, trails created without specific event selectors will be configured to log all
     * read and write management events, and no data events. When an event occurs in your account,
     * CloudTrail evaluates the event selector for all trails. For each trail, if the event matches
     * any event selector, the trail processes and logs the event. If the event doesn't match any
     * event selector, the trail doesn't log the event.
     *
     * You can configure up to five event selectors for a trail.
     *
     * You cannot apply both event selectors and advanced event selectors to a trail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-eventselectors)
     *
     * @param eventSelectors Use event selectors to further specify the management and data event
     *   settings for your trail.
     */
    public fun eventSelectors(eventSelectors: IResolvable) {
        cdkBuilder.eventSelectors(eventSelectors)
    }

    /**
     * Specifies whether the trail is publishing events from global services such as IAM to the log
     * files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-includeglobalserviceevents)
     *
     * @param includeGlobalServiceEvents Specifies whether the trail is publishing events from
     *   global services such as IAM to the log files.
     */
    public fun includeGlobalServiceEvents(includeGlobalServiceEvents: Boolean) {
        cdkBuilder.includeGlobalServiceEvents(includeGlobalServiceEvents)
    }

    /**
     * Specifies whether the trail is publishing events from global services such as IAM to the log
     * files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-includeglobalserviceevents)
     *
     * @param includeGlobalServiceEvents Specifies whether the trail is publishing events from
     *   global services such as IAM to the log files.
     */
    public fun includeGlobalServiceEvents(includeGlobalServiceEvents: IResolvable) {
        cdkBuilder.includeGlobalServiceEvents(includeGlobalServiceEvents)
    }

    /**
     * A JSON string that contains the Insights types you want to log on a trail.
     *
     * `ApiCallRateInsight` and `ApiErrorRateInsight` are valid Insight types.
     *
     * The `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
     * aggregated per minute against a baseline API call volume.
     *
     * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
     * codes. The error is shown if the API call is unsuccessful.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-insightselectors)
     *
     * @param insightSelectors A JSON string that contains the Insights types you want to log on a
     *   trail.
     */
    public fun insightSelectors(vararg insightSelectors: Any) {
        _insightSelectors.addAll(listOf(*insightSelectors))
    }

    /**
     * A JSON string that contains the Insights types you want to log on a trail.
     *
     * `ApiCallRateInsight` and `ApiErrorRateInsight` are valid Insight types.
     *
     * The `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
     * aggregated per minute against a baseline API call volume.
     *
     * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
     * codes. The error is shown if the API call is unsuccessful.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-insightselectors)
     *
     * @param insightSelectors A JSON string that contains the Insights types you want to log on a
     *   trail.
     */
    public fun insightSelectors(insightSelectors: Collection<Any>) {
        _insightSelectors.addAll(insightSelectors)
    }

    /**
     * A JSON string that contains the Insights types you want to log on a trail.
     *
     * `ApiCallRateInsight` and `ApiErrorRateInsight` are valid Insight types.
     *
     * The `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
     * aggregated per minute against a baseline API call volume.
     *
     * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
     * codes. The error is shown if the API call is unsuccessful.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-insightselectors)
     *
     * @param insightSelectors A JSON string that contains the Insights types you want to log on a
     *   trail.
     */
    public fun insightSelectors(insightSelectors: IResolvable) {
        cdkBuilder.insightSelectors(insightSelectors)
    }

    /**
     * Whether the CloudTrail trail is currently logging AWS API calls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-islogging)
     *
     * @param isLogging Whether the CloudTrail trail is currently logging AWS API calls.
     */
    public fun isLogging(isLogging: Boolean) {
        cdkBuilder.isLogging(isLogging)
    }

    /**
     * Whether the CloudTrail trail is currently logging AWS API calls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-islogging)
     *
     * @param isLogging Whether the CloudTrail trail is currently logging AWS API calls.
     */
    public fun isLogging(isLogging: IResolvable) {
        cdkBuilder.isLogging(isLogging)
    }

    /**
     * Specifies whether the trail applies only to the current Region or to all Regions.
     *
     * The default is false. If the trail exists only in the current Region and this value is set to
     * true, shadow trails (replications of the trail) will be created in the other Regions. If the
     * trail exists in all Regions and this value is set to false, the trail will remain in the
     * Region where it was created, and its shadow trails in other Regions will be deleted. As a
     * best practice, consider using trails that log events in all Regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-ismultiregiontrail)
     *
     * @param isMultiRegionTrail Specifies whether the trail applies only to the current Region or
     *   to all Regions.
     */
    public fun isMultiRegionTrail(isMultiRegionTrail: Boolean) {
        cdkBuilder.isMultiRegionTrail(isMultiRegionTrail)
    }

    /**
     * Specifies whether the trail applies only to the current Region or to all Regions.
     *
     * The default is false. If the trail exists only in the current Region and this value is set to
     * true, shadow trails (replications of the trail) will be created in the other Regions. If the
     * trail exists in all Regions and this value is set to false, the trail will remain in the
     * Region where it was created, and its shadow trails in other Regions will be deleted. As a
     * best practice, consider using trails that log events in all Regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-ismultiregiontrail)
     *
     * @param isMultiRegionTrail Specifies whether the trail applies only to the current Region or
     *   to all Regions.
     */
    public fun isMultiRegionTrail(isMultiRegionTrail: IResolvable) {
        cdkBuilder.isMultiRegionTrail(isMultiRegionTrail)
    }

    /**
     * Specifies whether the trail is applied to all accounts in an organization in AWS
     * Organizations , or only for the current AWS account .
     *
     * The default is false, and cannot be true unless the call is made on behalf of an AWS account
     * that is the management account for an organization in AWS Organizations . If the trail is not
     * an organization trail and this is set to `true` , the trail will be created in all AWS
     * accounts that belong to the organization. If the trail is an organization trail and this is
     * set to `false` , the trail will remain in the current AWS account but be deleted from all
     * member accounts in the organization.
     *
     * Only the management account for the organization can convert an organization trail to a
     * non-organization trail, or convert a non-organization trail to an organization trail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-isorganizationtrail)
     *
     * @param isOrganizationTrail Specifies whether the trail is applied to all accounts in an
     *   organization in AWS Organizations , or only for the current AWS account .
     */
    public fun isOrganizationTrail(isOrganizationTrail: Boolean) {
        cdkBuilder.isOrganizationTrail(isOrganizationTrail)
    }

    /**
     * Specifies whether the trail is applied to all accounts in an organization in AWS
     * Organizations , or only for the current AWS account .
     *
     * The default is false, and cannot be true unless the call is made on behalf of an AWS account
     * that is the management account for an organization in AWS Organizations . If the trail is not
     * an organization trail and this is set to `true` , the trail will be created in all AWS
     * accounts that belong to the organization. If the trail is an organization trail and this is
     * set to `false` , the trail will remain in the current AWS account but be deleted from all
     * member accounts in the organization.
     *
     * Only the management account for the organization can convert an organization trail to a
     * non-organization trail, or convert a non-organization trail to an organization trail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-isorganizationtrail)
     *
     * @param isOrganizationTrail Specifies whether the trail is applied to all accounts in an
     *   organization in AWS Organizations , or only for the current AWS account .
     */
    public fun isOrganizationTrail(isOrganizationTrail: IResolvable) {
        cdkBuilder.isOrganizationTrail(isOrganizationTrail)
    }

    /**
     * Specifies the AWS KMS key ID to use to encrypt the logs delivered by CloudTrail.
     *
     * The value can be an alias name prefixed by "alias/", a fully specified ARN to an alias, a
     * fully specified ARN to a key, or a globally unique identifier.
     *
     * CloudTrail also supports AWS KMS multi-Region keys. For more information about multi-Region
     * keys, see
     * [Using multi-Region keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html)
     * in the *AWS Key Management Service Developer Guide* .
     *
     * Examples:
     * * alias/MyAliasName
     * * arn:aws:kms:us-east-2:123456789012:alias/MyAliasName
     * * arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012
     * * 12345678-1234-1234-1234-123456789012
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-kmskeyid)
     *
     * @param kmsKeyId Specifies the AWS KMS key ID to use to encrypt the logs delivered by
     *   CloudTrail.
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * Specifies the name of the Amazon S3 bucket designated for publishing log files.
     *
     * See
     * [Amazon S3 Bucket Naming Requirements](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/create_trail_naming_policy.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3bucketname)
     *
     * @param s3BucketName Specifies the name of the Amazon S3 bucket designated for publishing log
     *   files.
     */
    public fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
    }

    /**
     * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have
     * designated for log file delivery.
     *
     * For more information, see
     * [Finding Your CloudTrail Log Files](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-find-log-files.html)
     * . The maximum length is 200 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3keyprefix)
     *
     * @param s3KeyPrefix Specifies the Amazon S3 key prefix that comes after the name of the bucket
     *   you have designated for log file delivery.
     */
    public fun s3KeyPrefix(s3KeyPrefix: String) {
        cdkBuilder.s3KeyPrefix(s3KeyPrefix)
    }

    /**
     * Specifies the name of the Amazon SNS topic defined for notification of log file delivery.
     *
     * The maximum length is 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-snstopicname)
     *
     * @param snsTopicName Specifies the name of the Amazon SNS topic defined for notification of
     *   log file delivery.
     */
    public fun snsTopicName(snsTopicName: String) {
        cdkBuilder.snsTopicName(snsTopicName)
    }

    /**
     * A custom set of tags (key-value pairs) for this trail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-tags)
     *
     * @param tags A custom set of tags (key-value pairs) for this trail.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A custom set of tags (key-value pairs) for this trail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-tags)
     *
     * @param tags A custom set of tags (key-value pairs) for this trail.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * Specifies the name of the trail. The name must meet the following requirements:.
     * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or
     *   dashes (-)
     * * Start with a letter or number, and end with a letter or number
     * * Be between 3 and 128 characters
     * * Have no adjacent periods, underscores or dashes. Names like `my-_namespace` and
     *   `my--namespace` are not valid.
     * * Not be in IP address format (for example, 192.168.5.4)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-trailname)
     *
     * @param trailName Specifies the name of the trail. The name must meet the following
     *   requirements:.
     */
    public fun trailName(trailName: String) {
        cdkBuilder.trailName(trailName)
    }

    public fun build(): CfnTrail {
        if (_advancedEventSelectors.isNotEmpty())
            cdkBuilder.advancedEventSelectors(_advancedEventSelectors)
        if (_eventSelectors.isNotEmpty()) cdkBuilder.eventSelectors(_eventSelectors)
        if (_insightSelectors.isNotEmpty()) cdkBuilder.insightSelectors(_insightSelectors)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
