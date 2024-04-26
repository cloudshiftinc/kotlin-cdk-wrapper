@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudtrail

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnTrail`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudtrail.*;
 * CfnTrailProps cfnTrailProps = CfnTrailProps.builder()
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
public interface CfnTrailProps {
  /**
   * Specifies the settings for advanced event selectors.
   *
   * You can add advanced event selectors, and conditions for your advanced event selectors, up to a
   * maximum of 500 values for all conditions and selectors on a trail. You can use either
   * `AdvancedEventSelectors` or `EventSelectors` , but not both. If you apply `AdvancedEventSelectors`
   * to a trail, any existing `EventSelectors` are overwritten. For more information about advanced
   * event selectors, see [Logging data
   * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
   * in the *AWS CloudTrail User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-advancedeventselectors)
   */
  public fun advancedEventSelectors(): Any? = unwrap(this).getAdvancedEventSelectors()

  /**
   * Specifies a log group name using an Amazon Resource Name (ARN), a unique identifier that
   * represents the log group to which CloudTrail logs are delivered.
   *
   * You must use a log group that exists in your account.
   *
   * Not required unless you specify `CloudWatchLogsRoleArn` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsloggrouparn)
   */
  public fun cloudWatchLogsLogGroupArn(): String? = unwrap(this).getCloudWatchLogsLogGroupArn()

  /**
   * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
   *
   * You must use a role that exists in your account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsrolearn)
   */
  public fun cloudWatchLogsRoleArn(): String? = unwrap(this).getCloudWatchLogsRoleArn()

  /**
   * Specifies whether log file validation is enabled. The default is false.
   *
   *
   * When you disable log file integrity validation, the chain of digest files is broken after one
   * hour. CloudTrail does not create digest files for log files that were delivered during a period in
   * which log file integrity validation was disabled. For example, if you enable log file integrity
   * validation at noon on January 1, disable it at noon on January 2, and re-enable it at noon on
   * January 10, digest files will not be created for the log files delivered from noon on January 2 to
   * noon on January 10. The same applies whenever you stop CloudTrail logging or delete a trail.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-enablelogfilevalidation)
   */
  public fun enableLogFileValidation(): Any? = unwrap(this).getEnableLogFileValidation()

  /**
   * Use event selectors to further specify the management and data event settings for your trail.
   *
   * By default, trails created without specific event selectors will be configured to log all read
   * and write management events, and no data events. When an event occurs in your account, CloudTrail
   * evaluates the event selector for all trails. For each trail, if the event matches any event
   * selector, the trail processes and logs the event. If the event doesn't match any event selector,
   * the trail doesn't log the event.
   *
   * You can configure up to five event selectors for a trail.
   *
   * You cannot apply both event selectors and advanced event selectors to a trail.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-eventselectors)
   */
  public fun eventSelectors(): Any? = unwrap(this).getEventSelectors()

  /**
   * Specifies whether the trail is publishing events from global services such as IAM to the log
   * files.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-includeglobalserviceevents)
   */
  public fun includeGlobalServiceEvents(): Any? = unwrap(this).getIncludeGlobalServiceEvents()

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
   */
  public fun insightSelectors(): Any? = unwrap(this).getInsightSelectors()

  /**
   * Whether the CloudTrail trail is currently logging AWS API calls.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-islogging)
   */
  public fun isLogging(): Any

  /**
   * Specifies whether the trail applies only to the current Region or to all Regions.
   *
   * The default is false. If the trail exists only in the current Region and this value is set to
   * true, shadow trails (replications of the trail) will be created in the other Regions. If the trail
   * exists in all Regions and this value is set to false, the trail will remain in the Region where it
   * was created, and its shadow trails in other Regions will be deleted. As a best practice, consider
   * using trails that log events in all Regions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-ismultiregiontrail)
   */
  public fun isMultiRegionTrail(): Any? = unwrap(this).getIsMultiRegionTrail()

  /**
   * Specifies whether the trail is applied to all accounts in an organization in AWS Organizations
   * , or only for the current AWS account .
   *
   * The default is false, and cannot be true unless the call is made on behalf of an AWS account
   * that is the management account for an organization in AWS Organizations . If the trail is not an
   * organization trail and this is set to `true` , the trail will be created in all AWS accounts that
   * belong to the organization. If the trail is an organization trail and this is set to `false` , the
   * trail will remain in the current AWS account but be deleted from all member accounts in the
   * organization.
   *
   *
   * Only the management account for the organization can convert an organization trail to a
   * non-organization trail, or convert a non-organization trail to an organization trail.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-isorganizationtrail)
   */
  public fun isOrganizationTrail(): Any? = unwrap(this).getIsOrganizationTrail()

  /**
   * Specifies the AWS KMS key ID to use to encrypt the logs delivered by CloudTrail.
   *
   * The value can be an alias name prefixed by "alias/", a fully specified ARN to an alias, a fully
   * specified ARN to a key, or a globally unique identifier.
   *
   * CloudTrail also supports AWS KMS multi-Region keys. For more information about multi-Region
   * keys, see [Using multi-Region
   * keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html) in
   * the *AWS Key Management Service Developer Guide* .
   *
   * Examples:
   *
   * * alias/MyAliasName
   * * arn:aws:kms:us-east-2:123456789012:alias/MyAliasName
   * * arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012
   * * 12345678-1234-1234-1234-123456789012
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * Specifies the name of the Amazon S3 bucket designated for publishing log files.
   *
   * See [Amazon S3 Bucket naming
   * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3bucketname)
   */
  public fun s3BucketName(): String

  /**
   * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated
   * for log file delivery.
   *
   * For more information, see [Finding Your CloudTrail Log
   * Files](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/get-and-view-cloudtrail-log-files.html#cloudtrail-find-log-files)
   * . The maximum length is 200 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3keyprefix)
   */
  public fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()

  /**
   * Specifies the name of the Amazon SNS topic defined for notification of log file delivery.
   *
   * The maximum length is 256 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-snstopicname)
   */
  public fun snsTopicName(): String? = unwrap(this).getSnsTopicName()

  /**
   * A custom set of tags (key-value pairs) for this trail.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Specifies the name of the trail. The name must meet the following requirements:.
   *
   * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes
   * (-)
   * * Start with a letter or number, and end with a letter or number
   * * Be between 3 and 128 characters
   * * Have no adjacent periods, underscores or dashes. Names like `my-_namespace` and
   * `my--namespace` are not valid.
   * * Not be in IP address format (for example, 192.168.5.4)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-trailname)
   */
  public fun trailName(): String? = unwrap(this).getTrailName()

  /**
   * A builder for [CfnTrailProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param advancedEventSelectors Specifies the settings for advanced event selectors.
     * You can add advanced event selectors, and conditions for your advanced event selectors, up to
     * a maximum of 500 values for all conditions and selectors on a trail. You can use either
     * `AdvancedEventSelectors` or `EventSelectors` , but not both. If you apply
     * `AdvancedEventSelectors` to a trail, any existing `EventSelectors` are overwritten. For more
     * information about advanced event selectors, see [Logging data
     * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
     * in the *AWS CloudTrail User Guide* .
     */
    public fun advancedEventSelectors(advancedEventSelectors: IResolvable)

    /**
     * @param advancedEventSelectors Specifies the settings for advanced event selectors.
     * You can add advanced event selectors, and conditions for your advanced event selectors, up to
     * a maximum of 500 values for all conditions and selectors on a trail. You can use either
     * `AdvancedEventSelectors` or `EventSelectors` , but not both. If you apply
     * `AdvancedEventSelectors` to a trail, any existing `EventSelectors` are overwritten. For more
     * information about advanced event selectors, see [Logging data
     * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
     * in the *AWS CloudTrail User Guide* .
     */
    public fun advancedEventSelectors(advancedEventSelectors: List<Any>)

    /**
     * @param advancedEventSelectors Specifies the settings for advanced event selectors.
     * You can add advanced event selectors, and conditions for your advanced event selectors, up to
     * a maximum of 500 values for all conditions and selectors on a trail. You can use either
     * `AdvancedEventSelectors` or `EventSelectors` , but not both. If you apply
     * `AdvancedEventSelectors` to a trail, any existing `EventSelectors` are overwritten. For more
     * information about advanced event selectors, see [Logging data
     * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
     * in the *AWS CloudTrail User Guide* .
     */
    public fun advancedEventSelectors(vararg advancedEventSelectors: Any)

    /**
     * @param cloudWatchLogsLogGroupArn Specifies a log group name using an Amazon Resource Name
     * (ARN), a unique identifier that represents the log group to which CloudTrail logs are delivered.
     * You must use a log group that exists in your account.
     *
     * Not required unless you specify `CloudWatchLogsRoleArn` .
     */
    public fun cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn: String)

    /**
     * @param cloudWatchLogsRoleArn Specifies the role for the CloudWatch Logs endpoint to assume to
     * write to a user's log group.
     * You must use a role that exists in your account.
     */
    public fun cloudWatchLogsRoleArn(cloudWatchLogsRoleArn: String)

    /**
     * @param enableLogFileValidation Specifies whether log file validation is enabled. The default
     * is false.
     *
     * When you disable log file integrity validation, the chain of digest files is broken after one
     * hour. CloudTrail does not create digest files for log files that were delivered during a period
     * in which log file integrity validation was disabled. For example, if you enable log file
     * integrity validation at noon on January 1, disable it at noon on January 2, and re-enable it at
     * noon on January 10, digest files will not be created for the log files delivered from noon on
     * January 2 to noon on January 10. The same applies whenever you stop CloudTrail logging or delete
     * a trail.
     */
    public fun enableLogFileValidation(enableLogFileValidation: Boolean)

    /**
     * @param enableLogFileValidation Specifies whether log file validation is enabled. The default
     * is false.
     *
     * When you disable log file integrity validation, the chain of digest files is broken after one
     * hour. CloudTrail does not create digest files for log files that were delivered during a period
     * in which log file integrity validation was disabled. For example, if you enable log file
     * integrity validation at noon on January 1, disable it at noon on January 2, and re-enable it at
     * noon on January 10, digest files will not be created for the log files delivered from noon on
     * January 2 to noon on January 10. The same applies whenever you stop CloudTrail logging or delete
     * a trail.
     */
    public fun enableLogFileValidation(enableLogFileValidation: IResolvable)

    /**
     * @param eventSelectors Use event selectors to further specify the management and data event
     * settings for your trail.
     * By default, trails created without specific event selectors will be configured to log all
     * read and write management events, and no data events. When an event occurs in your account,
     * CloudTrail evaluates the event selector for all trails. For each trail, if the event matches any
     * event selector, the trail processes and logs the event. If the event doesn't match any event
     * selector, the trail doesn't log the event.
     *
     * You can configure up to five event selectors for a trail.
     *
     * You cannot apply both event selectors and advanced event selectors to a trail.
     */
    public fun eventSelectors(eventSelectors: IResolvable)

    /**
     * @param eventSelectors Use event selectors to further specify the management and data event
     * settings for your trail.
     * By default, trails created without specific event selectors will be configured to log all
     * read and write management events, and no data events. When an event occurs in your account,
     * CloudTrail evaluates the event selector for all trails. For each trail, if the event matches any
     * event selector, the trail processes and logs the event. If the event doesn't match any event
     * selector, the trail doesn't log the event.
     *
     * You can configure up to five event selectors for a trail.
     *
     * You cannot apply both event selectors and advanced event selectors to a trail.
     */
    public fun eventSelectors(eventSelectors: List<Any>)

    /**
     * @param eventSelectors Use event selectors to further specify the management and data event
     * settings for your trail.
     * By default, trails created without specific event selectors will be configured to log all
     * read and write management events, and no data events. When an event occurs in your account,
     * CloudTrail evaluates the event selector for all trails. For each trail, if the event matches any
     * event selector, the trail processes and logs the event. If the event doesn't match any event
     * selector, the trail doesn't log the event.
     *
     * You can configure up to five event selectors for a trail.
     *
     * You cannot apply both event selectors and advanced event selectors to a trail.
     */
    public fun eventSelectors(vararg eventSelectors: Any)

    /**
     * @param includeGlobalServiceEvents Specifies whether the trail is publishing events from
     * global services such as IAM to the log files.
     */
    public fun includeGlobalServiceEvents(includeGlobalServiceEvents: Boolean)

    /**
     * @param includeGlobalServiceEvents Specifies whether the trail is publishing events from
     * global services such as IAM to the log files.
     */
    public fun includeGlobalServiceEvents(includeGlobalServiceEvents: IResolvable)

    /**
     * @param insightSelectors A JSON string that contains the Insights types you want to log on a
     * trail.
     * `ApiCallRateInsight` and `ApiErrorRateInsight` are valid Insight types.
     *
     * The `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
     * aggregated per minute against a baseline API call volume.
     *
     * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
     * codes. The error is shown if the API call is unsuccessful.
     */
    public fun insightSelectors(insightSelectors: IResolvable)

    /**
     * @param insightSelectors A JSON string that contains the Insights types you want to log on a
     * trail.
     * `ApiCallRateInsight` and `ApiErrorRateInsight` are valid Insight types.
     *
     * The `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
     * aggregated per minute against a baseline API call volume.
     *
     * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
     * codes. The error is shown if the API call is unsuccessful.
     */
    public fun insightSelectors(insightSelectors: List<Any>)

    /**
     * @param insightSelectors A JSON string that contains the Insights types you want to log on a
     * trail.
     * `ApiCallRateInsight` and `ApiErrorRateInsight` are valid Insight types.
     *
     * The `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
     * aggregated per minute against a baseline API call volume.
     *
     * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
     * codes. The error is shown if the API call is unsuccessful.
     */
    public fun insightSelectors(vararg insightSelectors: Any)

    /**
     * @param isLogging Whether the CloudTrail trail is currently logging AWS API calls. 
     */
    public fun isLogging(isLogging: Boolean)

    /**
     * @param isLogging Whether the CloudTrail trail is currently logging AWS API calls. 
     */
    public fun isLogging(isLogging: IResolvable)

    /**
     * @param isMultiRegionTrail Specifies whether the trail applies only to the current Region or
     * to all Regions.
     * The default is false. If the trail exists only in the current Region and this value is set to
     * true, shadow trails (replications of the trail) will be created in the other Regions. If the
     * trail exists in all Regions and this value is set to false, the trail will remain in the Region
     * where it was created, and its shadow trails in other Regions will be deleted. As a best
     * practice, consider using trails that log events in all Regions.
     */
    public fun isMultiRegionTrail(isMultiRegionTrail: Boolean)

    /**
     * @param isMultiRegionTrail Specifies whether the trail applies only to the current Region or
     * to all Regions.
     * The default is false. If the trail exists only in the current Region and this value is set to
     * true, shadow trails (replications of the trail) will be created in the other Regions. If the
     * trail exists in all Regions and this value is set to false, the trail will remain in the Region
     * where it was created, and its shadow trails in other Regions will be deleted. As a best
     * practice, consider using trails that log events in all Regions.
     */
    public fun isMultiRegionTrail(isMultiRegionTrail: IResolvable)

    /**
     * @param isOrganizationTrail Specifies whether the trail is applied to all accounts in an
     * organization in AWS Organizations , or only for the current AWS account .
     * The default is false, and cannot be true unless the call is made on behalf of an AWS account
     * that is the management account for an organization in AWS Organizations . If the trail is not an
     * organization trail and this is set to `true` , the trail will be created in all AWS accounts
     * that belong to the organization. If the trail is an organization trail and this is set to
     * `false` , the trail will remain in the current AWS account but be deleted from all member
     * accounts in the organization.
     *
     *
     * Only the management account for the organization can convert an organization trail to a
     * non-organization trail, or convert a non-organization trail to an organization trail.
     */
    public fun isOrganizationTrail(isOrganizationTrail: Boolean)

    /**
     * @param isOrganizationTrail Specifies whether the trail is applied to all accounts in an
     * organization in AWS Organizations , or only for the current AWS account .
     * The default is false, and cannot be true unless the call is made on behalf of an AWS account
     * that is the management account for an organization in AWS Organizations . If the trail is not an
     * organization trail and this is set to `true` , the trail will be created in all AWS accounts
     * that belong to the organization. If the trail is an organization trail and this is set to
     * `false` , the trail will remain in the current AWS account but be deleted from all member
     * accounts in the organization.
     *
     *
     * Only the management account for the organization can convert an organization trail to a
     * non-organization trail, or convert a non-organization trail to an organization trail.
     */
    public fun isOrganizationTrail(isOrganizationTrail: IResolvable)

    /**
     * @param kmsKeyId Specifies the AWS KMS key ID to use to encrypt the logs delivered by
     * CloudTrail.
     * The value can be an alias name prefixed by "alias/", a fully specified ARN to an alias, a
     * fully specified ARN to a key, or a globally unique identifier.
     *
     * CloudTrail also supports AWS KMS multi-Region keys. For more information about multi-Region
     * keys, see [Using multi-Region
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html) in
     * the *AWS Key Management Service Developer Guide* .
     *
     * Examples:
     *
     * * alias/MyAliasName
     * * arn:aws:kms:us-east-2:123456789012:alias/MyAliasName
     * * arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012
     * * 12345678-1234-1234-1234-123456789012
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param s3BucketName Specifies the name of the Amazon S3 bucket designated for publishing log
     * files. 
     * See [Amazon S3 Bucket naming
     * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html) .
     */
    public fun s3BucketName(s3BucketName: String)

    /**
     * @param s3KeyPrefix Specifies the Amazon S3 key prefix that comes after the name of the bucket
     * you have designated for log file delivery.
     * For more information, see [Finding Your CloudTrail Log
     * Files](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/get-and-view-cloudtrail-log-files.html#cloudtrail-find-log-files)
     * . The maximum length is 200 characters.
     */
    public fun s3KeyPrefix(s3KeyPrefix: String)

    /**
     * @param snsTopicName Specifies the name of the Amazon SNS topic defined for notification of
     * log file delivery.
     * The maximum length is 256 characters.
     */
    public fun snsTopicName(snsTopicName: String)

    /**
     * @param tags A custom set of tags (key-value pairs) for this trail.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A custom set of tags (key-value pairs) for this trail.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param trailName Specifies the name of the trail. The name must meet the following
     * requirements:.
     * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or
     * dashes (-)
     * * Start with a letter or number, and end with a letter or number
     * * Be between 3 and 128 characters
     * * Have no adjacent periods, underscores or dashes. Names like `my-_namespace` and
     * `my--namespace` are not valid.
     * * Not be in IP address format (for example, 192.168.5.4)
     */
    public fun trailName(trailName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudtrail.CfnTrailProps.Builder =
        software.amazon.awscdk.services.cloudtrail.CfnTrailProps.builder()

    /**
     * @param advancedEventSelectors Specifies the settings for advanced event selectors.
     * You can add advanced event selectors, and conditions for your advanced event selectors, up to
     * a maximum of 500 values for all conditions and selectors on a trail. You can use either
     * `AdvancedEventSelectors` or `EventSelectors` , but not both. If you apply
     * `AdvancedEventSelectors` to a trail, any existing `EventSelectors` are overwritten. For more
     * information about advanced event selectors, see [Logging data
     * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
     * in the *AWS CloudTrail User Guide* .
     */
    override fun advancedEventSelectors(advancedEventSelectors: IResolvable) {
      cdkBuilder.advancedEventSelectors(advancedEventSelectors.let(IResolvable::unwrap))
    }

    /**
     * @param advancedEventSelectors Specifies the settings for advanced event selectors.
     * You can add advanced event selectors, and conditions for your advanced event selectors, up to
     * a maximum of 500 values for all conditions and selectors on a trail. You can use either
     * `AdvancedEventSelectors` or `EventSelectors` , but not both. If you apply
     * `AdvancedEventSelectors` to a trail, any existing `EventSelectors` are overwritten. For more
     * information about advanced event selectors, see [Logging data
     * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
     * in the *AWS CloudTrail User Guide* .
     */
    override fun advancedEventSelectors(advancedEventSelectors: List<Any>) {
      cdkBuilder.advancedEventSelectors(advancedEventSelectors.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param advancedEventSelectors Specifies the settings for advanced event selectors.
     * You can add advanced event selectors, and conditions for your advanced event selectors, up to
     * a maximum of 500 values for all conditions and selectors on a trail. You can use either
     * `AdvancedEventSelectors` or `EventSelectors` , but not both. If you apply
     * `AdvancedEventSelectors` to a trail, any existing `EventSelectors` are overwritten. For more
     * information about advanced event selectors, see [Logging data
     * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
     * in the *AWS CloudTrail User Guide* .
     */
    override fun advancedEventSelectors(vararg advancedEventSelectors: Any): Unit =
        advancedEventSelectors(advancedEventSelectors.toList())

    /**
     * @param cloudWatchLogsLogGroupArn Specifies a log group name using an Amazon Resource Name
     * (ARN), a unique identifier that represents the log group to which CloudTrail logs are delivered.
     * You must use a log group that exists in your account.
     *
     * Not required unless you specify `CloudWatchLogsRoleArn` .
     */
    override fun cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn: String) {
      cdkBuilder.cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn)
    }

    /**
     * @param cloudWatchLogsRoleArn Specifies the role for the CloudWatch Logs endpoint to assume to
     * write to a user's log group.
     * You must use a role that exists in your account.
     */
    override fun cloudWatchLogsRoleArn(cloudWatchLogsRoleArn: String) {
      cdkBuilder.cloudWatchLogsRoleArn(cloudWatchLogsRoleArn)
    }

    /**
     * @param enableLogFileValidation Specifies whether log file validation is enabled. The default
     * is false.
     *
     * When you disable log file integrity validation, the chain of digest files is broken after one
     * hour. CloudTrail does not create digest files for log files that were delivered during a period
     * in which log file integrity validation was disabled. For example, if you enable log file
     * integrity validation at noon on January 1, disable it at noon on January 2, and re-enable it at
     * noon on January 10, digest files will not be created for the log files delivered from noon on
     * January 2 to noon on January 10. The same applies whenever you stop CloudTrail logging or delete
     * a trail.
     */
    override fun enableLogFileValidation(enableLogFileValidation: Boolean) {
      cdkBuilder.enableLogFileValidation(enableLogFileValidation)
    }

    /**
     * @param enableLogFileValidation Specifies whether log file validation is enabled. The default
     * is false.
     *
     * When you disable log file integrity validation, the chain of digest files is broken after one
     * hour. CloudTrail does not create digest files for log files that were delivered during a period
     * in which log file integrity validation was disabled. For example, if you enable log file
     * integrity validation at noon on January 1, disable it at noon on January 2, and re-enable it at
     * noon on January 10, digest files will not be created for the log files delivered from noon on
     * January 2 to noon on January 10. The same applies whenever you stop CloudTrail logging or delete
     * a trail.
     */
    override fun enableLogFileValidation(enableLogFileValidation: IResolvable) {
      cdkBuilder.enableLogFileValidation(enableLogFileValidation.let(IResolvable::unwrap))
    }

    /**
     * @param eventSelectors Use event selectors to further specify the management and data event
     * settings for your trail.
     * By default, trails created without specific event selectors will be configured to log all
     * read and write management events, and no data events. When an event occurs in your account,
     * CloudTrail evaluates the event selector for all trails. For each trail, if the event matches any
     * event selector, the trail processes and logs the event. If the event doesn't match any event
     * selector, the trail doesn't log the event.
     *
     * You can configure up to five event selectors for a trail.
     *
     * You cannot apply both event selectors and advanced event selectors to a trail.
     */
    override fun eventSelectors(eventSelectors: IResolvable) {
      cdkBuilder.eventSelectors(eventSelectors.let(IResolvable::unwrap))
    }

    /**
     * @param eventSelectors Use event selectors to further specify the management and data event
     * settings for your trail.
     * By default, trails created without specific event selectors will be configured to log all
     * read and write management events, and no data events. When an event occurs in your account,
     * CloudTrail evaluates the event selector for all trails. For each trail, if the event matches any
     * event selector, the trail processes and logs the event. If the event doesn't match any event
     * selector, the trail doesn't log the event.
     *
     * You can configure up to five event selectors for a trail.
     *
     * You cannot apply both event selectors and advanced event selectors to a trail.
     */
    override fun eventSelectors(eventSelectors: List<Any>) {
      cdkBuilder.eventSelectors(eventSelectors.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param eventSelectors Use event selectors to further specify the management and data event
     * settings for your trail.
     * By default, trails created without specific event selectors will be configured to log all
     * read and write management events, and no data events. When an event occurs in your account,
     * CloudTrail evaluates the event selector for all trails. For each trail, if the event matches any
     * event selector, the trail processes and logs the event. If the event doesn't match any event
     * selector, the trail doesn't log the event.
     *
     * You can configure up to five event selectors for a trail.
     *
     * You cannot apply both event selectors and advanced event selectors to a trail.
     */
    override fun eventSelectors(vararg eventSelectors: Any): Unit =
        eventSelectors(eventSelectors.toList())

    /**
     * @param includeGlobalServiceEvents Specifies whether the trail is publishing events from
     * global services such as IAM to the log files.
     */
    override fun includeGlobalServiceEvents(includeGlobalServiceEvents: Boolean) {
      cdkBuilder.includeGlobalServiceEvents(includeGlobalServiceEvents)
    }

    /**
     * @param includeGlobalServiceEvents Specifies whether the trail is publishing events from
     * global services such as IAM to the log files.
     */
    override fun includeGlobalServiceEvents(includeGlobalServiceEvents: IResolvable) {
      cdkBuilder.includeGlobalServiceEvents(includeGlobalServiceEvents.let(IResolvable::unwrap))
    }

    /**
     * @param insightSelectors A JSON string that contains the Insights types you want to log on a
     * trail.
     * `ApiCallRateInsight` and `ApiErrorRateInsight` are valid Insight types.
     *
     * The `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
     * aggregated per minute against a baseline API call volume.
     *
     * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
     * codes. The error is shown if the API call is unsuccessful.
     */
    override fun insightSelectors(insightSelectors: IResolvable) {
      cdkBuilder.insightSelectors(insightSelectors.let(IResolvable::unwrap))
    }

    /**
     * @param insightSelectors A JSON string that contains the Insights types you want to log on a
     * trail.
     * `ApiCallRateInsight` and `ApiErrorRateInsight` are valid Insight types.
     *
     * The `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
     * aggregated per minute against a baseline API call volume.
     *
     * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
     * codes. The error is shown if the API call is unsuccessful.
     */
    override fun insightSelectors(insightSelectors: List<Any>) {
      cdkBuilder.insightSelectors(insightSelectors.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param insightSelectors A JSON string that contains the Insights types you want to log on a
     * trail.
     * `ApiCallRateInsight` and `ApiErrorRateInsight` are valid Insight types.
     *
     * The `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
     * aggregated per minute against a baseline API call volume.
     *
     * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
     * codes. The error is shown if the API call is unsuccessful.
     */
    override fun insightSelectors(vararg insightSelectors: Any): Unit =
        insightSelectors(insightSelectors.toList())

    /**
     * @param isLogging Whether the CloudTrail trail is currently logging AWS API calls. 
     */
    override fun isLogging(isLogging: Boolean) {
      cdkBuilder.isLogging(isLogging)
    }

    /**
     * @param isLogging Whether the CloudTrail trail is currently logging AWS API calls. 
     */
    override fun isLogging(isLogging: IResolvable) {
      cdkBuilder.isLogging(isLogging.let(IResolvable::unwrap))
    }

    /**
     * @param isMultiRegionTrail Specifies whether the trail applies only to the current Region or
     * to all Regions.
     * The default is false. If the trail exists only in the current Region and this value is set to
     * true, shadow trails (replications of the trail) will be created in the other Regions. If the
     * trail exists in all Regions and this value is set to false, the trail will remain in the Region
     * where it was created, and its shadow trails in other Regions will be deleted. As a best
     * practice, consider using trails that log events in all Regions.
     */
    override fun isMultiRegionTrail(isMultiRegionTrail: Boolean) {
      cdkBuilder.isMultiRegionTrail(isMultiRegionTrail)
    }

    /**
     * @param isMultiRegionTrail Specifies whether the trail applies only to the current Region or
     * to all Regions.
     * The default is false. If the trail exists only in the current Region and this value is set to
     * true, shadow trails (replications of the trail) will be created in the other Regions. If the
     * trail exists in all Regions and this value is set to false, the trail will remain in the Region
     * where it was created, and its shadow trails in other Regions will be deleted. As a best
     * practice, consider using trails that log events in all Regions.
     */
    override fun isMultiRegionTrail(isMultiRegionTrail: IResolvable) {
      cdkBuilder.isMultiRegionTrail(isMultiRegionTrail.let(IResolvable::unwrap))
    }

    /**
     * @param isOrganizationTrail Specifies whether the trail is applied to all accounts in an
     * organization in AWS Organizations , or only for the current AWS account .
     * The default is false, and cannot be true unless the call is made on behalf of an AWS account
     * that is the management account for an organization in AWS Organizations . If the trail is not an
     * organization trail and this is set to `true` , the trail will be created in all AWS accounts
     * that belong to the organization. If the trail is an organization trail and this is set to
     * `false` , the trail will remain in the current AWS account but be deleted from all member
     * accounts in the organization.
     *
     *
     * Only the management account for the organization can convert an organization trail to a
     * non-organization trail, or convert a non-organization trail to an organization trail.
     */
    override fun isOrganizationTrail(isOrganizationTrail: Boolean) {
      cdkBuilder.isOrganizationTrail(isOrganizationTrail)
    }

    /**
     * @param isOrganizationTrail Specifies whether the trail is applied to all accounts in an
     * organization in AWS Organizations , or only for the current AWS account .
     * The default is false, and cannot be true unless the call is made on behalf of an AWS account
     * that is the management account for an organization in AWS Organizations . If the trail is not an
     * organization trail and this is set to `true` , the trail will be created in all AWS accounts
     * that belong to the organization. If the trail is an organization trail and this is set to
     * `false` , the trail will remain in the current AWS account but be deleted from all member
     * accounts in the organization.
     *
     *
     * Only the management account for the organization can convert an organization trail to a
     * non-organization trail, or convert a non-organization trail to an organization trail.
     */
    override fun isOrganizationTrail(isOrganizationTrail: IResolvable) {
      cdkBuilder.isOrganizationTrail(isOrganizationTrail.let(IResolvable::unwrap))
    }

    /**
     * @param kmsKeyId Specifies the AWS KMS key ID to use to encrypt the logs delivered by
     * CloudTrail.
     * The value can be an alias name prefixed by "alias/", a fully specified ARN to an alias, a
     * fully specified ARN to a key, or a globally unique identifier.
     *
     * CloudTrail also supports AWS KMS multi-Region keys. For more information about multi-Region
     * keys, see [Using multi-Region
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html) in
     * the *AWS Key Management Service Developer Guide* .
     *
     * Examples:
     *
     * * alias/MyAliasName
     * * arn:aws:kms:us-east-2:123456789012:alias/MyAliasName
     * * arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012
     * * 12345678-1234-1234-1234-123456789012
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param s3BucketName Specifies the name of the Amazon S3 bucket designated for publishing log
     * files. 
     * See [Amazon S3 Bucket naming
     * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html) .
     */
    override fun s3BucketName(s3BucketName: String) {
      cdkBuilder.s3BucketName(s3BucketName)
    }

    /**
     * @param s3KeyPrefix Specifies the Amazon S3 key prefix that comes after the name of the bucket
     * you have designated for log file delivery.
     * For more information, see [Finding Your CloudTrail Log
     * Files](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/get-and-view-cloudtrail-log-files.html#cloudtrail-find-log-files)
     * . The maximum length is 200 characters.
     */
    override fun s3KeyPrefix(s3KeyPrefix: String) {
      cdkBuilder.s3KeyPrefix(s3KeyPrefix)
    }

    /**
     * @param snsTopicName Specifies the name of the Amazon SNS topic defined for notification of
     * log file delivery.
     * The maximum length is 256 characters.
     */
    override fun snsTopicName(snsTopicName: String) {
      cdkBuilder.snsTopicName(snsTopicName)
    }

    /**
     * @param tags A custom set of tags (key-value pairs) for this trail.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A custom set of tags (key-value pairs) for this trail.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param trailName Specifies the name of the trail. The name must meet the following
     * requirements:.
     * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or
     * dashes (-)
     * * Start with a letter or number, and end with a letter or number
     * * Be between 3 and 128 characters
     * * Have no adjacent periods, underscores or dashes. Names like `my-_namespace` and
     * `my--namespace` are not valid.
     * * Not be in IP address format (for example, 192.168.5.4)
     */
    override fun trailName(trailName: String) {
      cdkBuilder.trailName(trailName)
    }

    public fun build(): software.amazon.awscdk.services.cloudtrail.CfnTrailProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudtrail.CfnTrailProps,
  ) : CdkObject(cdkObject), CfnTrailProps {
    /**
     * Specifies the settings for advanced event selectors.
     *
     * You can add advanced event selectors, and conditions for your advanced event selectors, up to
     * a maximum of 500 values for all conditions and selectors on a trail. You can use either
     * `AdvancedEventSelectors` or `EventSelectors` , but not both. If you apply
     * `AdvancedEventSelectors` to a trail, any existing `EventSelectors` are overwritten. For more
     * information about advanced event selectors, see [Logging data
     * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
     * in the *AWS CloudTrail User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-advancedeventselectors)
     */
    override fun advancedEventSelectors(): Any? = unwrap(this).getAdvancedEventSelectors()

    /**
     * Specifies a log group name using an Amazon Resource Name (ARN), a unique identifier that
     * represents the log group to which CloudTrail logs are delivered.
     *
     * You must use a log group that exists in your account.
     *
     * Not required unless you specify `CloudWatchLogsRoleArn` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsloggrouparn)
     */
    override fun cloudWatchLogsLogGroupArn(): String? = unwrap(this).getCloudWatchLogsLogGroupArn()

    /**
     * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
     *
     * You must use a role that exists in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsrolearn)
     */
    override fun cloudWatchLogsRoleArn(): String? = unwrap(this).getCloudWatchLogsRoleArn()

    /**
     * Specifies whether log file validation is enabled. The default is false.
     *
     *
     * When you disable log file integrity validation, the chain of digest files is broken after one
     * hour. CloudTrail does not create digest files for log files that were delivered during a period
     * in which log file integrity validation was disabled. For example, if you enable log file
     * integrity validation at noon on January 1, disable it at noon on January 2, and re-enable it at
     * noon on January 10, digest files will not be created for the log files delivered from noon on
     * January 2 to noon on January 10. The same applies whenever you stop CloudTrail logging or delete
     * a trail.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-enablelogfilevalidation)
     */
    override fun enableLogFileValidation(): Any? = unwrap(this).getEnableLogFileValidation()

    /**
     * Use event selectors to further specify the management and data event settings for your trail.
     *
     * By default, trails created without specific event selectors will be configured to log all
     * read and write management events, and no data events. When an event occurs in your account,
     * CloudTrail evaluates the event selector for all trails. For each trail, if the event matches any
     * event selector, the trail processes and logs the event. If the event doesn't match any event
     * selector, the trail doesn't log the event.
     *
     * You can configure up to five event selectors for a trail.
     *
     * You cannot apply both event selectors and advanced event selectors to a trail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-eventselectors)
     */
    override fun eventSelectors(): Any? = unwrap(this).getEventSelectors()

    /**
     * Specifies whether the trail is publishing events from global services such as IAM to the log
     * files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-includeglobalserviceevents)
     */
    override fun includeGlobalServiceEvents(): Any? = unwrap(this).getIncludeGlobalServiceEvents()

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
     */
    override fun insightSelectors(): Any? = unwrap(this).getInsightSelectors()

    /**
     * Whether the CloudTrail trail is currently logging AWS API calls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-islogging)
     */
    override fun isLogging(): Any = unwrap(this).getIsLogging()

    /**
     * Specifies whether the trail applies only to the current Region or to all Regions.
     *
     * The default is false. If the trail exists only in the current Region and this value is set to
     * true, shadow trails (replications of the trail) will be created in the other Regions. If the
     * trail exists in all Regions and this value is set to false, the trail will remain in the Region
     * where it was created, and its shadow trails in other Regions will be deleted. As a best
     * practice, consider using trails that log events in all Regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-ismultiregiontrail)
     */
    override fun isMultiRegionTrail(): Any? = unwrap(this).getIsMultiRegionTrail()

    /**
     * Specifies whether the trail is applied to all accounts in an organization in AWS
     * Organizations , or only for the current AWS account .
     *
     * The default is false, and cannot be true unless the call is made on behalf of an AWS account
     * that is the management account for an organization in AWS Organizations . If the trail is not an
     * organization trail and this is set to `true` , the trail will be created in all AWS accounts
     * that belong to the organization. If the trail is an organization trail and this is set to
     * `false` , the trail will remain in the current AWS account but be deleted from all member
     * accounts in the organization.
     *
     *
     * Only the management account for the organization can convert an organization trail to a
     * non-organization trail, or convert a non-organization trail to an organization trail.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-isorganizationtrail)
     */
    override fun isOrganizationTrail(): Any? = unwrap(this).getIsOrganizationTrail()

    /**
     * Specifies the AWS KMS key ID to use to encrypt the logs delivered by CloudTrail.
     *
     * The value can be an alias name prefixed by "alias/", a fully specified ARN to an alias, a
     * fully specified ARN to a key, or a globally unique identifier.
     *
     * CloudTrail also supports AWS KMS multi-Region keys. For more information about multi-Region
     * keys, see [Using multi-Region
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html) in
     * the *AWS Key Management Service Developer Guide* .
     *
     * Examples:
     *
     * * alias/MyAliasName
     * * arn:aws:kms:us-east-2:123456789012:alias/MyAliasName
     * * arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012
     * * 12345678-1234-1234-1234-123456789012
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * Specifies the name of the Amazon S3 bucket designated for publishing log files.
     *
     * See [Amazon S3 Bucket naming
     * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3bucketname)
     */
    override fun s3BucketName(): String = unwrap(this).getS3BucketName()

    /**
     * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have
     * designated for log file delivery.
     *
     * For more information, see [Finding Your CloudTrail Log
     * Files](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/get-and-view-cloudtrail-log-files.html#cloudtrail-find-log-files)
     * . The maximum length is 200 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3keyprefix)
     */
    override fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()

    /**
     * Specifies the name of the Amazon SNS topic defined for notification of log file delivery.
     *
     * The maximum length is 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-snstopicname)
     */
    override fun snsTopicName(): String? = unwrap(this).getSnsTopicName()

    /**
     * A custom set of tags (key-value pairs) for this trail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Specifies the name of the trail. The name must meet the following requirements:.
     *
     * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or
     * dashes (-)
     * * Start with a letter or number, and end with a letter or number
     * * Be between 3 and 128 characters
     * * Have no adjacent periods, underscores or dashes. Names like `my-_namespace` and
     * `my--namespace` are not valid.
     * * Not be in IP address format (for example, 192.168.5.4)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-trailname)
     */
    override fun trailName(): String? = unwrap(this).getTrailName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrailProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnTrailProps):
        CfnTrailProps = CdkObjectWrappers.wrap(cdkObject) as? CfnTrailProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrailProps):
        software.amazon.awscdk.services.cloudtrail.CfnTrailProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudtrail.CfnTrailProps
  }
}
