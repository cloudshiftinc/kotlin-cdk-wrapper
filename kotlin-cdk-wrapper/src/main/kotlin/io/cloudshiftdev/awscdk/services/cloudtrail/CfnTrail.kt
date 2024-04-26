@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudtrail

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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a trail that specifies the settings for delivery of log data to an Amazon S3 bucket.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudtrail.*;
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
public open class CfnTrail(
  cdkObject: software.amazon.awscdk.services.cloudtrail.CfnTrail,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTrailProps,
  ) :
      this(software.amazon.awscdk.services.cloudtrail.CfnTrail(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnTrailProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTrailProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTrailProps(props)
  )

  /**
   * Specifies the settings for advanced event selectors.
   */
  public open fun advancedEventSelectors(): Any? = unwrap(this).getAdvancedEventSelectors()

  /**
   * Specifies the settings for advanced event selectors.
   */
  public open fun advancedEventSelectors(`value`: IResolvable) {
    unwrap(this).setAdvancedEventSelectors(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the settings for advanced event selectors.
   */
  public open fun advancedEventSelectors(`value`: List<Any>) {
    unwrap(this).setAdvancedEventSelectors(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Specifies the settings for advanced event selectors.
   */
  public open fun advancedEventSelectors(vararg `value`: Any): Unit =
      advancedEventSelectors(`value`.toList())

  /**
   * `Ref` returns the ARN of the CloudTrail trail, such as
   * `arn:aws:cloudtrail:us-east-2:123456789012:trail/myCloudTrail` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * `Ref` returns the ARN of the Amazon SNS topic that's associated with the CloudTrail trail, such
   * as `arn:aws:sns:us-east-2:123456789012:mySNSTopic` .
   */
  public open fun attrSnsTopicArn(): String = unwrap(this).getAttrSnsTopicArn()

  /**
   * Specifies a log group name using an Amazon Resource Name (ARN), a unique identifier that
   * represents the log group to which CloudTrail logs are delivered.
   */
  public open fun cloudWatchLogsLogGroupArn(): String? = unwrap(this).getCloudWatchLogsLogGroupArn()

  /**
   * Specifies a log group name using an Amazon Resource Name (ARN), a unique identifier that
   * represents the log group to which CloudTrail logs are delivered.
   */
  public open fun cloudWatchLogsLogGroupArn(`value`: String) {
    unwrap(this).setCloudWatchLogsLogGroupArn(`value`)
  }

  /**
   * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
   */
  public open fun cloudWatchLogsRoleArn(): String? = unwrap(this).getCloudWatchLogsRoleArn()

  /**
   * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
   */
  public open fun cloudWatchLogsRoleArn(`value`: String) {
    unwrap(this).setCloudWatchLogsRoleArn(`value`)
  }

  /**
   * Specifies whether log file validation is enabled.
   *
   * The default is false.
   */
  public open fun enableLogFileValidation(): Any? = unwrap(this).getEnableLogFileValidation()

  /**
   * Specifies whether log file validation is enabled.
   *
   * The default is false.
   */
  public open fun enableLogFileValidation(`value`: Boolean) {
    unwrap(this).setEnableLogFileValidation(`value`)
  }

  /**
   * Specifies whether log file validation is enabled.
   *
   * The default is false.
   */
  public open fun enableLogFileValidation(`value`: IResolvable) {
    unwrap(this).setEnableLogFileValidation(`value`.let(IResolvable::unwrap))
  }

  /**
   * Use event selectors to further specify the management and data event settings for your trail.
   */
  public open fun eventSelectors(): Any? = unwrap(this).getEventSelectors()

  /**
   * Use event selectors to further specify the management and data event settings for your trail.
   */
  public open fun eventSelectors(`value`: IResolvable) {
    unwrap(this).setEventSelectors(`value`.let(IResolvable::unwrap))
  }

  /**
   * Use event selectors to further specify the management and data event settings for your trail.
   */
  public open fun eventSelectors(`value`: List<Any>) {
    unwrap(this).setEventSelectors(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Use event selectors to further specify the management and data event settings for your trail.
   */
  public open fun eventSelectors(vararg `value`: Any): Unit = eventSelectors(`value`.toList())

  /**
   * Specifies whether the trail is publishing events from global services such as IAM to the log
   * files.
   */
  public open fun includeGlobalServiceEvents(): Any? = unwrap(this).getIncludeGlobalServiceEvents()

  /**
   * Specifies whether the trail is publishing events from global services such as IAM to the log
   * files.
   */
  public open fun includeGlobalServiceEvents(`value`: Boolean) {
    unwrap(this).setIncludeGlobalServiceEvents(`value`)
  }

  /**
   * Specifies whether the trail is publishing events from global services such as IAM to the log
   * files.
   */
  public open fun includeGlobalServiceEvents(`value`: IResolvable) {
    unwrap(this).setIncludeGlobalServiceEvents(`value`.let(IResolvable::unwrap))
  }

  /**
   * A JSON string that contains the Insights types you want to log on a trail.
   */
  public open fun insightSelectors(): Any? = unwrap(this).getInsightSelectors()

  /**
   * A JSON string that contains the Insights types you want to log on a trail.
   */
  public open fun insightSelectors(`value`: IResolvable) {
    unwrap(this).setInsightSelectors(`value`.let(IResolvable::unwrap))
  }

  /**
   * A JSON string that contains the Insights types you want to log on a trail.
   */
  public open fun insightSelectors(`value`: List<Any>) {
    unwrap(this).setInsightSelectors(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A JSON string that contains the Insights types you want to log on a trail.
   */
  public open fun insightSelectors(vararg `value`: Any): Unit = insightSelectors(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Whether the CloudTrail trail is currently logging AWS API calls.
   */
  public open fun isLogging(): Any = unwrap(this).getIsLogging()

  /**
   * Whether the CloudTrail trail is currently logging AWS API calls.
   */
  public open fun isLogging(`value`: Boolean) {
    unwrap(this).setIsLogging(`value`)
  }

  /**
   * Whether the CloudTrail trail is currently logging AWS API calls.
   */
  public open fun isLogging(`value`: IResolvable) {
    unwrap(this).setIsLogging(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies whether the trail applies only to the current Region or to all Regions.
   */
  public open fun isMultiRegionTrail(): Any? = unwrap(this).getIsMultiRegionTrail()

  /**
   * Specifies whether the trail applies only to the current Region or to all Regions.
   */
  public open fun isMultiRegionTrail(`value`: Boolean) {
    unwrap(this).setIsMultiRegionTrail(`value`)
  }

  /**
   * Specifies whether the trail applies only to the current Region or to all Regions.
   */
  public open fun isMultiRegionTrail(`value`: IResolvable) {
    unwrap(this).setIsMultiRegionTrail(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies whether the trail is applied to all accounts in an organization in AWS Organizations
   * , or only for the current AWS account .
   */
  public open fun isOrganizationTrail(): Any? = unwrap(this).getIsOrganizationTrail()

  /**
   * Specifies whether the trail is applied to all accounts in an organization in AWS Organizations
   * , or only for the current AWS account .
   */
  public open fun isOrganizationTrail(`value`: Boolean) {
    unwrap(this).setIsOrganizationTrail(`value`)
  }

  /**
   * Specifies whether the trail is applied to all accounts in an organization in AWS Organizations
   * , or only for the current AWS account .
   */
  public open fun isOrganizationTrail(`value`: IResolvable) {
    unwrap(this).setIsOrganizationTrail(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the AWS KMS key ID to use to encrypt the logs delivered by CloudTrail.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * Specifies the AWS KMS key ID to use to encrypt the logs delivered by CloudTrail.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * Specifies the name of the Amazon S3 bucket designated for publishing log files.
   */
  public open fun s3BucketName(): String = unwrap(this).getS3BucketName()

  /**
   * Specifies the name of the Amazon S3 bucket designated for publishing log files.
   */
  public open fun s3BucketName(`value`: String) {
    unwrap(this).setS3BucketName(`value`)
  }

  /**
   * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated
   * for log file delivery.
   */
  public open fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()

  /**
   * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated
   * for log file delivery.
   */
  public open fun s3KeyPrefix(`value`: String) {
    unwrap(this).setS3KeyPrefix(`value`)
  }

  /**
   * Specifies the name of the Amazon SNS topic defined for notification of log file delivery.
   */
  public open fun snsTopicName(): String? = unwrap(this).getSnsTopicName()

  /**
   * Specifies the name of the Amazon SNS topic defined for notification of log file delivery.
   */
  public open fun snsTopicName(`value`: String) {
    unwrap(this).setSnsTopicName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A custom set of tags (key-value pairs) for this trail.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A custom set of tags (key-value pairs) for this trail.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A custom set of tags (key-value pairs) for this trail.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Specifies the name of the trail.
   *
   * The name must meet the following requirements:.
   */
  public open fun trailName(): String? = unwrap(this).getTrailName()

  /**
   * Specifies the name of the trail.
   *
   * The name must meet the following requirements:.
   */
  public open fun trailName(`value`: String) {
    unwrap(this).setTrailName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudtrail.CfnTrail].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param advancedEventSelectors Specifies the settings for advanced event selectors. 
     */
    public fun advancedEventSelectors(advancedEventSelectors: IResolvable)

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
     * @param advancedEventSelectors Specifies the settings for advanced event selectors. 
     */
    public fun advancedEventSelectors(advancedEventSelectors: List<Any>)

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
     * @param advancedEventSelectors Specifies the settings for advanced event selectors. 
     */
    public fun advancedEventSelectors(vararg advancedEventSelectors: Any)

    /**
     * Specifies a log group name using an Amazon Resource Name (ARN), a unique identifier that
     * represents the log group to which CloudTrail logs are delivered.
     *
     * You must use a log group that exists in your account.
     *
     * Not required unless you specify `CloudWatchLogsRoleArn` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsloggrouparn)
     * @param cloudWatchLogsLogGroupArn Specifies a log group name using an Amazon Resource Name
     * (ARN), a unique identifier that represents the log group to which CloudTrail logs are delivered.
     * 
     */
    public fun cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn: String)

    /**
     * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
     *
     * You must use a role that exists in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsrolearn)
     * @param cloudWatchLogsRoleArn Specifies the role for the CloudWatch Logs endpoint to assume to
     * write to a user's log group. 
     */
    public fun cloudWatchLogsRoleArn(cloudWatchLogsRoleArn: String)

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
     * @param enableLogFileValidation Specifies whether log file validation is enabled. The default
     * is false. 
     */
    public fun enableLogFileValidation(enableLogFileValidation: Boolean)

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
     * @param enableLogFileValidation Specifies whether log file validation is enabled. The default
     * is false. 
     */
    public fun enableLogFileValidation(enableLogFileValidation: IResolvable)

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
     * @param eventSelectors Use event selectors to further specify the management and data event
     * settings for your trail. 
     */
    public fun eventSelectors(eventSelectors: IResolvable)

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
     * @param eventSelectors Use event selectors to further specify the management and data event
     * settings for your trail. 
     */
    public fun eventSelectors(eventSelectors: List<Any>)

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
     * @param eventSelectors Use event selectors to further specify the management and data event
     * settings for your trail. 
     */
    public fun eventSelectors(vararg eventSelectors: Any)

    /**
     * Specifies whether the trail is publishing events from global services such as IAM to the log
     * files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-includeglobalserviceevents)
     * @param includeGlobalServiceEvents Specifies whether the trail is publishing events from
     * global services such as IAM to the log files. 
     */
    public fun includeGlobalServiceEvents(includeGlobalServiceEvents: Boolean)

    /**
     * Specifies whether the trail is publishing events from global services such as IAM to the log
     * files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-includeglobalserviceevents)
     * @param includeGlobalServiceEvents Specifies whether the trail is publishing events from
     * global services such as IAM to the log files. 
     */
    public fun includeGlobalServiceEvents(includeGlobalServiceEvents: IResolvable)

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
     * @param insightSelectors A JSON string that contains the Insights types you want to log on a
     * trail. 
     */
    public fun insightSelectors(insightSelectors: IResolvable)

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
     * @param insightSelectors A JSON string that contains the Insights types you want to log on a
     * trail. 
     */
    public fun insightSelectors(insightSelectors: List<Any>)

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
     * @param insightSelectors A JSON string that contains the Insights types you want to log on a
     * trail. 
     */
    public fun insightSelectors(vararg insightSelectors: Any)

    /**
     * Whether the CloudTrail trail is currently logging AWS API calls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-islogging)
     * @param isLogging Whether the CloudTrail trail is currently logging AWS API calls. 
     */
    public fun isLogging(isLogging: Boolean)

    /**
     * Whether the CloudTrail trail is currently logging AWS API calls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-islogging)
     * @param isLogging Whether the CloudTrail trail is currently logging AWS API calls. 
     */
    public fun isLogging(isLogging: IResolvable)

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
     * @param isMultiRegionTrail Specifies whether the trail applies only to the current Region or
     * to all Regions. 
     */
    public fun isMultiRegionTrail(isMultiRegionTrail: Boolean)

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
     * @param isMultiRegionTrail Specifies whether the trail applies only to the current Region or
     * to all Regions. 
     */
    public fun isMultiRegionTrail(isMultiRegionTrail: IResolvable)

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
     * @param isOrganizationTrail Specifies whether the trail is applied to all accounts in an
     * organization in AWS Organizations , or only for the current AWS account . 
     */
    public fun isOrganizationTrail(isOrganizationTrail: Boolean)

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
     * @param isOrganizationTrail Specifies whether the trail is applied to all accounts in an
     * organization in AWS Organizations , or only for the current AWS account . 
     */
    public fun isOrganizationTrail(isOrganizationTrail: IResolvable)

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
     * @param kmsKeyId Specifies the AWS KMS key ID to use to encrypt the logs delivered by
     * CloudTrail. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * Specifies the name of the Amazon S3 bucket designated for publishing log files.
     *
     * See [Amazon S3 Bucket naming
     * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3bucketname)
     * @param s3BucketName Specifies the name of the Amazon S3 bucket designated for publishing log
     * files. 
     */
    public fun s3BucketName(s3BucketName: String)

    /**
     * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have
     * designated for log file delivery.
     *
     * For more information, see [Finding Your CloudTrail Log
     * Files](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/get-and-view-cloudtrail-log-files.html#cloudtrail-find-log-files)
     * . The maximum length is 200 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3keyprefix)
     * @param s3KeyPrefix Specifies the Amazon S3 key prefix that comes after the name of the bucket
     * you have designated for log file delivery. 
     */
    public fun s3KeyPrefix(s3KeyPrefix: String)

    /**
     * Specifies the name of the Amazon SNS topic defined for notification of log file delivery.
     *
     * The maximum length is 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-snstopicname)
     * @param snsTopicName Specifies the name of the Amazon SNS topic defined for notification of
     * log file delivery. 
     */
    public fun snsTopicName(snsTopicName: String)

    /**
     * A custom set of tags (key-value pairs) for this trail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-tags)
     * @param tags A custom set of tags (key-value pairs) for this trail. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A custom set of tags (key-value pairs) for this trail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-tags)
     * @param tags A custom set of tags (key-value pairs) for this trail. 
     */
    public fun tags(vararg tags: CfnTag)

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
     * @param trailName Specifies the name of the trail. The name must meet the following
     * requirements:. 
     */
    public fun trailName(trailName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudtrail.CfnTrail.Builder =
        software.amazon.awscdk.services.cloudtrail.CfnTrail.Builder.create(scope, id)

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
     * @param advancedEventSelectors Specifies the settings for advanced event selectors. 
     */
    override fun advancedEventSelectors(advancedEventSelectors: IResolvable) {
      cdkBuilder.advancedEventSelectors(advancedEventSelectors.let(IResolvable::unwrap))
    }

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
     * @param advancedEventSelectors Specifies the settings for advanced event selectors. 
     */
    override fun advancedEventSelectors(advancedEventSelectors: List<Any>) {
      cdkBuilder.advancedEventSelectors(advancedEventSelectors.map{CdkObjectWrappers.unwrap(it)})
    }

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
     * @param advancedEventSelectors Specifies the settings for advanced event selectors. 
     */
    override fun advancedEventSelectors(vararg advancedEventSelectors: Any): Unit =
        advancedEventSelectors(advancedEventSelectors.toList())

    /**
     * Specifies a log group name using an Amazon Resource Name (ARN), a unique identifier that
     * represents the log group to which CloudTrail logs are delivered.
     *
     * You must use a log group that exists in your account.
     *
     * Not required unless you specify `CloudWatchLogsRoleArn` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsloggrouparn)
     * @param cloudWatchLogsLogGroupArn Specifies a log group name using an Amazon Resource Name
     * (ARN), a unique identifier that represents the log group to which CloudTrail logs are delivered.
     * 
     */
    override fun cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn: String) {
      cdkBuilder.cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn)
    }

    /**
     * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
     *
     * You must use a role that exists in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsrolearn)
     * @param cloudWatchLogsRoleArn Specifies the role for the CloudWatch Logs endpoint to assume to
     * write to a user's log group. 
     */
    override fun cloudWatchLogsRoleArn(cloudWatchLogsRoleArn: String) {
      cdkBuilder.cloudWatchLogsRoleArn(cloudWatchLogsRoleArn)
    }

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
     * @param enableLogFileValidation Specifies whether log file validation is enabled. The default
     * is false. 
     */
    override fun enableLogFileValidation(enableLogFileValidation: Boolean) {
      cdkBuilder.enableLogFileValidation(enableLogFileValidation)
    }

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
     * @param enableLogFileValidation Specifies whether log file validation is enabled. The default
     * is false. 
     */
    override fun enableLogFileValidation(enableLogFileValidation: IResolvable) {
      cdkBuilder.enableLogFileValidation(enableLogFileValidation.let(IResolvable::unwrap))
    }

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
     * @param eventSelectors Use event selectors to further specify the management and data event
     * settings for your trail. 
     */
    override fun eventSelectors(eventSelectors: IResolvable) {
      cdkBuilder.eventSelectors(eventSelectors.let(IResolvable::unwrap))
    }

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
     * @param eventSelectors Use event selectors to further specify the management and data event
     * settings for your trail. 
     */
    override fun eventSelectors(eventSelectors: List<Any>) {
      cdkBuilder.eventSelectors(eventSelectors.map{CdkObjectWrappers.unwrap(it)})
    }

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
     * @param eventSelectors Use event selectors to further specify the management and data event
     * settings for your trail. 
     */
    override fun eventSelectors(vararg eventSelectors: Any): Unit =
        eventSelectors(eventSelectors.toList())

    /**
     * Specifies whether the trail is publishing events from global services such as IAM to the log
     * files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-includeglobalserviceevents)
     * @param includeGlobalServiceEvents Specifies whether the trail is publishing events from
     * global services such as IAM to the log files. 
     */
    override fun includeGlobalServiceEvents(includeGlobalServiceEvents: Boolean) {
      cdkBuilder.includeGlobalServiceEvents(includeGlobalServiceEvents)
    }

    /**
     * Specifies whether the trail is publishing events from global services such as IAM to the log
     * files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-includeglobalserviceevents)
     * @param includeGlobalServiceEvents Specifies whether the trail is publishing events from
     * global services such as IAM to the log files. 
     */
    override fun includeGlobalServiceEvents(includeGlobalServiceEvents: IResolvable) {
      cdkBuilder.includeGlobalServiceEvents(includeGlobalServiceEvents.let(IResolvable::unwrap))
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
     * @param insightSelectors A JSON string that contains the Insights types you want to log on a
     * trail. 
     */
    override fun insightSelectors(insightSelectors: IResolvable) {
      cdkBuilder.insightSelectors(insightSelectors.let(IResolvable::unwrap))
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
     * @param insightSelectors A JSON string that contains the Insights types you want to log on a
     * trail. 
     */
    override fun insightSelectors(insightSelectors: List<Any>) {
      cdkBuilder.insightSelectors(insightSelectors.map{CdkObjectWrappers.unwrap(it)})
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
     * @param insightSelectors A JSON string that contains the Insights types you want to log on a
     * trail. 
     */
    override fun insightSelectors(vararg insightSelectors: Any): Unit =
        insightSelectors(insightSelectors.toList())

    /**
     * Whether the CloudTrail trail is currently logging AWS API calls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-islogging)
     * @param isLogging Whether the CloudTrail trail is currently logging AWS API calls. 
     */
    override fun isLogging(isLogging: Boolean) {
      cdkBuilder.isLogging(isLogging)
    }

    /**
     * Whether the CloudTrail trail is currently logging AWS API calls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-islogging)
     * @param isLogging Whether the CloudTrail trail is currently logging AWS API calls. 
     */
    override fun isLogging(isLogging: IResolvable) {
      cdkBuilder.isLogging(isLogging.let(IResolvable::unwrap))
    }

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
     * @param isMultiRegionTrail Specifies whether the trail applies only to the current Region or
     * to all Regions. 
     */
    override fun isMultiRegionTrail(isMultiRegionTrail: Boolean) {
      cdkBuilder.isMultiRegionTrail(isMultiRegionTrail)
    }

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
     * @param isMultiRegionTrail Specifies whether the trail applies only to the current Region or
     * to all Regions. 
     */
    override fun isMultiRegionTrail(isMultiRegionTrail: IResolvable) {
      cdkBuilder.isMultiRegionTrail(isMultiRegionTrail.let(IResolvable::unwrap))
    }

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
     * @param isOrganizationTrail Specifies whether the trail is applied to all accounts in an
     * organization in AWS Organizations , or only for the current AWS account . 
     */
    override fun isOrganizationTrail(isOrganizationTrail: Boolean) {
      cdkBuilder.isOrganizationTrail(isOrganizationTrail)
    }

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
     * @param isOrganizationTrail Specifies whether the trail is applied to all accounts in an
     * organization in AWS Organizations , or only for the current AWS account . 
     */
    override fun isOrganizationTrail(isOrganizationTrail: IResolvable) {
      cdkBuilder.isOrganizationTrail(isOrganizationTrail.let(IResolvable::unwrap))
    }

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
     * @param kmsKeyId Specifies the AWS KMS key ID to use to encrypt the logs delivered by
     * CloudTrail. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * Specifies the name of the Amazon S3 bucket designated for publishing log files.
     *
     * See [Amazon S3 Bucket naming
     * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3bucketname)
     * @param s3BucketName Specifies the name of the Amazon S3 bucket designated for publishing log
     * files. 
     */
    override fun s3BucketName(s3BucketName: String) {
      cdkBuilder.s3BucketName(s3BucketName)
    }

    /**
     * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have
     * designated for log file delivery.
     *
     * For more information, see [Finding Your CloudTrail Log
     * Files](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/get-and-view-cloudtrail-log-files.html#cloudtrail-find-log-files)
     * . The maximum length is 200 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3keyprefix)
     * @param s3KeyPrefix Specifies the Amazon S3 key prefix that comes after the name of the bucket
     * you have designated for log file delivery. 
     */
    override fun s3KeyPrefix(s3KeyPrefix: String) {
      cdkBuilder.s3KeyPrefix(s3KeyPrefix)
    }

    /**
     * Specifies the name of the Amazon SNS topic defined for notification of log file delivery.
     *
     * The maximum length is 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-snstopicname)
     * @param snsTopicName Specifies the name of the Amazon SNS topic defined for notification of
     * log file delivery. 
     */
    override fun snsTopicName(snsTopicName: String) {
      cdkBuilder.snsTopicName(snsTopicName)
    }

    /**
     * A custom set of tags (key-value pairs) for this trail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-tags)
     * @param tags A custom set of tags (key-value pairs) for this trail. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A custom set of tags (key-value pairs) for this trail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-tags)
     * @param tags A custom set of tags (key-value pairs) for this trail. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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
     * @param trailName Specifies the name of the trail. The name must meet the following
     * requirements:. 
     */
    override fun trailName(trailName: String) {
      cdkBuilder.trailName(trailName)
    }

    public fun build(): software.amazon.awscdk.services.cloudtrail.CfnTrail = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudtrail.CfnTrail.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTrail {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTrail(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnTrail): CfnTrail =
        CfnTrail(cdkObject)

    internal fun unwrap(wrapped: CfnTrail): software.amazon.awscdk.services.cloudtrail.CfnTrail =
        wrapped.cdkObject as software.amazon.awscdk.services.cloudtrail.CfnTrail
  }

  /**
   * Advanced event selectors let you create fine-grained selectors for CloudTrail management and
   * data events.
   *
   * They help you control costs by logging only those events that are important to you. For more
   * information about advanced event selectors, see [Logging management
   * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-events-with-cloudtrail.html)
   * and [Logging data
   * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
   * in the *AWS CloudTrail User Guide* .
   *
   * You cannot apply both event selectors and advanced event selectors to a trail.
   *
   * *Supported CloudTrail event record fields for management events*
   *
   * * `eventCategory` (required)
   * * `eventSource`
   * * `readOnly`
   *
   * *Supported CloudTrail event record fields for data events*
   *
   * * `eventCategory` (required)
   * * `resources.type` (required)
   * * `readOnly`
   * * `eventName`
   * * `resources.ARN`
   *
   *
   * For event data stores for CloudTrail Insights events, AWS Config configuration items, Audit
   * Manager evidence, or events outside of AWS , the only supported field is `eventCategory` .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudtrail.*;
   * AdvancedEventSelectorProperty advancedEventSelectorProperty =
   * AdvancedEventSelectorProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-advancedeventselector.html)
   */
  public interface AdvancedEventSelectorProperty {
    /**
     * Contains all selector statements in an advanced event selector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-advancedeventselector.html#cfn-cloudtrail-trail-advancedeventselector-fieldselectors)
     */
    public fun fieldSelectors(): Any

    /**
     * An optional, descriptive name for an advanced event selector, such as "Log data events for
     * only two S3 buckets".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-advancedeventselector.html#cfn-cloudtrail-trail-advancedeventselector-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [AdvancedEventSelectorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fieldSelectors Contains all selector statements in an advanced event selector. 
       */
      public fun fieldSelectors(fieldSelectors: IResolvable)

      /**
       * @param fieldSelectors Contains all selector statements in an advanced event selector. 
       */
      public fun fieldSelectors(fieldSelectors: List<Any>)

      /**
       * @param fieldSelectors Contains all selector statements in an advanced event selector. 
       */
      public fun fieldSelectors(vararg fieldSelectors: Any)

      /**
       * @param name An optional, descriptive name for an advanced event selector, such as "Log data
       * events for only two S3 buckets".
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudtrail.CfnTrail.AdvancedEventSelectorProperty.Builder
          =
          software.amazon.awscdk.services.cloudtrail.CfnTrail.AdvancedEventSelectorProperty.builder()

      /**
       * @param fieldSelectors Contains all selector statements in an advanced event selector. 
       */
      override fun fieldSelectors(fieldSelectors: IResolvable) {
        cdkBuilder.fieldSelectors(fieldSelectors.let(IResolvable::unwrap))
      }

      /**
       * @param fieldSelectors Contains all selector statements in an advanced event selector. 
       */
      override fun fieldSelectors(fieldSelectors: List<Any>) {
        cdkBuilder.fieldSelectors(fieldSelectors.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param fieldSelectors Contains all selector statements in an advanced event selector. 
       */
      override fun fieldSelectors(vararg fieldSelectors: Any): Unit =
          fieldSelectors(fieldSelectors.toList())

      /**
       * @param name An optional, descriptive name for an advanced event selector, such as "Log data
       * events for only two S3 buckets".
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.cloudtrail.CfnTrail.AdvancedEventSelectorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudtrail.CfnTrail.AdvancedEventSelectorProperty,
    ) : CdkObject(cdkObject), AdvancedEventSelectorProperty {
      /**
       * Contains all selector statements in an advanced event selector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-advancedeventselector.html#cfn-cloudtrail-trail-advancedeventselector-fieldselectors)
       */
      override fun fieldSelectors(): Any = unwrap(this).getFieldSelectors()

      /**
       * An optional, descriptive name for an advanced event selector, such as "Log data events for
       * only two S3 buckets".
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-advancedeventselector.html#cfn-cloudtrail-trail-advancedeventselector-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AdvancedEventSelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnTrail.AdvancedEventSelectorProperty):
          AdvancedEventSelectorProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AdvancedEventSelectorProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdvancedEventSelectorProperty):
          software.amazon.awscdk.services.cloudtrail.CfnTrail.AdvancedEventSelectorProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudtrail.CfnTrail.AdvancedEventSelectorProperty
    }
  }

  /**
   * A single selector statement in an advanced event selector.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudtrail.*;
   * AdvancedFieldSelectorProperty advancedFieldSelectorProperty =
   * AdvancedFieldSelectorProperty.builder()
   * .field("field")
   * // the properties below are optional
   * .endsWith(List.of("endsWith"))
   * .equalTo(List.of("equalTo"))
   * .notEndsWith(List.of("notEndsWith"))
   * .notEquals(List.of("notEquals"))
   * .notStartsWith(List.of("notStartsWith"))
   * .startsWith(List.of("startsWith"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-advancedfieldselector.html)
   */
  public interface AdvancedFieldSelectorProperty {
    /**
     * An operator that includes events that match the last few characters of the event record field
     * specified as the value of `Field` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-advancedfieldselector.html#cfn-cloudtrail-trail-advancedfieldselector-endswith)
     */
    public fun endsWith(): List<String> = unwrap(this).getEndsWith() ?: emptyList()

    /**
     * An operator that includes events that match the exact value of the event record field
     * specified as the value of `Field` .
     *
     * This is the only valid operator that you can use with the `readOnly` , `eventCategory` , and
     * `resources.type` fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-advancedfieldselector.html#cfn-cloudtrail-trail-advancedfieldselector-equals)
     */
    public fun equalTo(): List<String> = unwrap(this).getEqualTo() ?: emptyList()

    /**
     * A field in a CloudTrail event record on which to filter events to be logged.
     *
     * For event data stores for CloudTrail Insights events, AWS Config configuration items, Audit
     * Manager evidence, or events outside of AWS , the field is used only for selecting events as
     * filtering is not supported.
     *
     * For CloudTrail management events, supported fields include `readOnly` , `eventCategory` , and
     * `eventSource` .
     *
     * For CloudTrail data events, supported fields include `readOnly` , `eventCategory` ,
     * `eventName` , `resources.type` , and `resources.ARN` .
     *
     * For event data stores for CloudTrail Insights events, AWS Config configuration items, Audit
     * Manager evidence, or events outside of AWS , the only supported field is `eventCategory` .
     *
     * * *`readOnly`* - Optional. Can be set to `Equals` a value of `true` or `false` . If you do
     * not add this field, CloudTrail logs both `read` and `write` events. A value of `true` logs only
     * `read` events. A value of `false` logs only `write` events.
     * * *`eventSource`* - For filtering management events only. This can be set to `NotEquals`
     * `kms.amazonaws.com` or `NotEquals` `rdsdata.amazonaws.com` .
     * * *`eventName`* - Can use any operator. You can use it to ﬁlter in or ﬁlter out any data
     * event logged to CloudTrail, such as `PutBucket` or `GetSnapshotBlock` . You can have multiple
     * values for this ﬁeld, separated by commas.
     * * *`eventCategory`* - This is required and must be set to `Equals` .
     * * For CloudTrail management events, the value must be `Management` .
     * * For CloudTrail data events, the value must be `Data` .
     *
     * The following are used only for event data stores:
     *
     * * For CloudTrail Insights events, the value must be `Insight` .
     * * For AWS Config configuration items, the value must be `ConfigurationItem` .
     * * For Audit Manager evidence, the value must be `Evidence` .
     * * For non- AWS events, the value must be `ActivityAuditLog` .
     * * *`resources.type`* - This ﬁeld is required for CloudTrail data events. `resources.type` can
     * only use the `Equals` operator, and the value can be one of the following:
     * * `AWS::DynamoDB::Table`
     * * `AWS::Lambda::Function`
     * * `AWS::S3::Object`
     * * `AWS::AppConfig::Configuration`
     * * `AWS::B2BI::Transformer`
     * * `AWS::Bedrock::AgentAlias`
     * * `AWS::Bedrock::KnowledgeBase`
     * * `AWS::Cassandra::Table`
     * * `AWS::CloudFront::KeyValueStore`
     * * `AWS::CloudTrail::Channel`
     * * `AWS::CodeWhisperer::Customization`
     * * `AWS::CodeWhisperer::Profile`
     * * `AWS::Cognito::IdentityPool`
     * * `AWS::DynamoDB::Stream`
     * * `AWS::EC2::Snapshot`
     * * `AWS::EMRWAL::Workspace`
     * * `AWS::FinSpace::Environment`
     * * `AWS::Glue::Table`
     * * `AWS::GreengrassV2::ComponentVersion`
     * * `AWS::GreengrassV2::Deployment`
     * * `AWS::GuardDuty::Detector`
     * * `AWS::IoT::Certificate`
     * * `AWS::IoT::Thing`
     * * `AWS::IoTSiteWise::Asset`
     * * `AWS::IoTSiteWise::TimeSeries`
     * * `AWS::IoTTwinMaker::Entity`
     * * `AWS::IoTTwinMaker::Workspace`
     * * `AWS::KendraRanking::ExecutionPlan`
     * * `AWS::KinesisVideo::Stream`
     * * `AWS::ManagedBlockchain::Network`
     * * `AWS::ManagedBlockchain::Node`
     * * `AWS::MedicalImaging::Datastore`
     * * `AWS::NeptuneGraph::Graph`
     * * `AWS::PCAConnectorAD::Connector`
     * * `AWS::QBusiness::Application`
     * * `AWS::QBusiness::DataSource`
     * * `AWS::QBusiness::Index`
     * * `AWS::QBusiness::WebExperience`
     * * `AWS::RDS::DBCluster`
     * * `AWS::S3::AccessPoint`
     * * `AWS::S3ObjectLambda::AccessPoint`
     * * `AWS::S3Outposts::Object`
     * * `AWS::SageMaker::Endpoint`
     * * `AWS::SageMaker::ExperimentTrialComponent`
     * * `AWS::SageMaker::FeatureGroup`
     * * `AWS::ServiceDiscovery::Namespace`
     * * `AWS::ServiceDiscovery::Service`
     * * `AWS::SCN::Instance`
     * * `AWS::SNS::PlatformEndpoint`
     * * `AWS::SNS::Topic`
     * * `AWS::SQS::Queue`
     * * `AWS::SSM::ManagedNode`
     * * `AWS::SSMMessages::ControlChannel`
     * * `AWS::SWF::Domain`
     * * `AWS::ThinClient::Device`
     * * `AWS::ThinClient::Environment`
     * * `AWS::Timestream::Database`
     * * `AWS::Timestream::Table`
     * * `AWS::VerifiedPermissions::PolicyStore`
     * * `AWS::XRay::Trace`
     *
     * You can have only one `resources.type` ﬁeld per selector. To log data events on more than one
     * resource type, add another selector.
     *
     * * *`resources.ARN`* - You can use any operator with `resources.ARN` , but if you use `Equals`
     * or `NotEquals` , the value must exactly match the ARN of a valid resource of the type you've
     * speciﬁed in the template as the value of resources.type.
     *
     *
     * You can't use the `resources.ARN` field to filter resource types that do not have ARNs.
     *
     *
     * The `resources.ARN` field can be set one of the following.
     *
     * If resources.type equals `AWS::S3::Object` , the ARN must be in one of the following formats.
     * To log all data events for all objects in a specific S3 bucket, use the `StartsWith` operator,
     * and include only the bucket ARN as the matching value.
     *
     * The trailing slash is intentional; do not exclude it. Replace the text between less than and
     * greater than symbols (&lt;&gt;) with resource-specific information.
     *
     * * `arn:&lt;partition&gt;:s3:::&lt;bucket_name&gt;/`
     * * `arn:&lt;partition&gt;:s3:::&lt;bucket_name&gt;/&lt;object_path&gt;/`
     *
     * When resources.type equals `AWS::DynamoDB::Table` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     *
     * * `arn:&lt;partition&gt;:dynamodb:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;table_name&gt;`
     *
     * When resources.type equals `AWS::Lambda::Function` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:lambda:&lt;region&gt;:&lt;account_ID&gt;:function:&lt;function_name&gt;`
     *
     * When resources.type equals `AWS::AppConfig::Configuration` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:appconfig:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/environment/&lt;environment_ID&gt;/configuration/&lt;configuration_profile_ID&gt;`
     *
     * When resources.type equals `AWS::B2BI::Transformer` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:b2bi:&lt;region&gt;:&lt;account_ID&gt;:transformer/&lt;transformer_ID&gt;`
     *
     * When resources.type equals `AWS::Bedrock::AgentAlias` , and the operator is set to `Equals`
     * or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:bedrock:&lt;region&gt;:&lt;account_ID&gt;:agent-alias/&lt;agent_ID&gt;/&lt;alias_ID&gt;`
     *
     * When resources.type equals `AWS::Bedrock::KnowledgeBase` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:bedrock:&lt;region&gt;:&lt;account_ID&gt;:knowledge-base/&lt;knowledge_base_ID&gt;`
     *
     * When resources.type equals `AWS::Cassandra::Table` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:cassandra:&lt;region&gt;:&lt;account_ID&gt;:/keyspace/&lt;keyspace_name&gt;/table/&lt;table_name&gt;`
     *
     * When resources.type equals `AWS::CloudFront::KeyValueStore` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:cloudfront:&lt;region&gt;:&lt;account_ID&gt;:key-value-store/&lt;KVS_name&gt;`
     *
     * When resources.type equals `AWS::CloudTrail::Channel` , and the operator is set to `Equals`
     * or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:cloudtrail:&lt;region&gt;:&lt;account_ID&gt;:channel/&lt;channel_UUID&gt;`
     *
     * When resources.type equals `AWS::CodeWhisperer::Customization` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:codewhisperer:&lt;region&gt;:&lt;account_ID&gt;:customization/&lt;customization_ID&gt;`
     *
     * When resources.type equals `AWS::CodeWhisperer::Profile` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:codewhisperer:&lt;region&gt;:&lt;account_ID&gt;:profile/&lt;profile_ID&gt;`
     *
     * When resources.type equals `AWS::Cognito::IdentityPool` , and the operator is set to `Equals`
     * or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:cognito-identity:&lt;region&gt;:&lt;account_ID&gt;:identitypool/&lt;identity_pool_ID&gt;`
     *
     * When `resources.type` equals `AWS::DynamoDB::Stream` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:dynamodb:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;table_name&gt;/stream/&lt;date_time&gt;`
     *
     * When `resources.type` equals `AWS::EC2::Snapshot` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     *
     * * `arn:&lt;partition&gt;:ec2:&lt;region&gt;::snapshot/&lt;snapshot_ID&gt;`
     *
     * When `resources.type` equals `AWS::EMRWAL::Workspace` , and the operator is set to `Equals`
     * or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:emrwal:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_name&gt;`
     *
     * When `resources.type` equals `AWS::FinSpace::Environment` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:finspace:&lt;region&gt;:&lt;account_ID&gt;:environment/&lt;environment_ID&gt;`
     *
     * When `resources.type` equals `AWS::Glue::Table` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:glue:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;database_name&gt;/&lt;table_name&gt;`
     *
     * When `resources.type` equals `AWS::GreengrassV2::ComponentVersion` , and the operator is set
     * to `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:greengrass:&lt;region&gt;:&lt;account_ID&gt;:components/&lt;component_name&gt;`
     *
     * When `resources.type` equals `AWS::GreengrassV2::Deployment` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:greengrass:&lt;region&gt;:&lt;account_ID&gt;:deployments/&lt;deployment_ID`
     *
     * When `resources.type` equals `AWS::GuardDuty::Detector` , and the operator is set to `Equals`
     * or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:guardduty:&lt;region&gt;:&lt;account_ID&gt;:detector/&lt;detector_ID&gt;`
     *
     * When `resources.type` equals `AWS::IoT::Certificate` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     *
     * * `arn:&lt;partition&gt;:iot:&lt;region&gt;:&lt;account_ID&gt;:cert/&lt;certificate_ID&gt;`
     *
     * When `resources.type` equals `AWS::IoT::Thing` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     *
     * * `arn:&lt;partition&gt;:iot:&lt;region&gt;:&lt;account_ID&gt;:thing/&lt;thing_ID&gt;`
     *
     * When `resources.type` equals `AWS::IoTSiteWise::Asset` , and the operator is set to `Equals`
     * or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:iotsitewise:&lt;region&gt;:&lt;account_ID&gt;:asset/&lt;asset_ID&gt;`
     *
     * When `resources.type` equals `AWS::IoTSiteWise::TimeSeries` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:iotsitewise:&lt;region&gt;:&lt;account_ID&gt;:timeseries/&lt;timeseries_ID&gt;`
     *
     * When `resources.type` equals `AWS::IoTTwinMaker::Entity` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:iottwinmaker:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_ID&gt;/entity/&lt;entity_ID&gt;`
     *
     * When `resources.type` equals `AWS::IoTTwinMaker::Workspace` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:iottwinmaker:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_ID&gt;`
     *
     * When `resources.type` equals `AWS::KendraRanking::ExecutionPlan` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:kendra-ranking:&lt;region&gt;:&lt;account_ID&gt;:rescore-execution-plan/&lt;rescore_execution_plan_ID&gt;`
     *
     * When `resources.type` equals `AWS::KinesisVideo::Stream` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:kinesisvideo:&lt;region&gt;:&lt;account_ID&gt;:stream/&lt;stream_name&gt;/&lt;creation_time&gt;`
     *
     * When `resources.type` equals `AWS::ManagedBlockchain::Network` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * * `arn:&lt;partition&gt;:managedblockchain:::networks/&lt;network_name&gt;`
     *
     * When `resources.type` equals `AWS::ManagedBlockchain::Node` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:managedblockchain:&lt;region&gt;:&lt;account_ID&gt;:nodes/&lt;node_ID&gt;`
     *
     * When `resources.type` equals `AWS::MedicalImaging::Datastore` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:medical-imaging:&lt;region&gt;:&lt;account_ID&gt;:datastore/&lt;data_store_ID&gt;`
     *
     * When `resources.type` equals `AWS::NeptuneGraph::Graph` , and the operator is set to `Equals`
     * or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:neptune-graph:&lt;region&gt;:&lt;account_ID&gt;:graph/&lt;graph_ID&gt;`
     *
     * When `resources.type` equals `AWS::PCAConnectorAD::Connector` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:pca-connector-ad:&lt;region&gt;:&lt;account_ID&gt;:connector/&lt;connector_ID&gt;`
     *
     * When `resources.type` equals `AWS::QBusiness::Application` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;`
     *
     * When `resources.type` equals `AWS::QBusiness::DataSource` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/index/&lt;index_ID&gt;/data-source/&lt;datasource_ID&gt;`
     *
     * When `resources.type` equals `AWS::QBusiness::Index` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/index/&lt;index_ID&gt;`
     *
     * When `resources.type` equals `AWS::QBusiness::WebExperience` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/web-experience/&lt;web_experience_ID&gt;`
     *
     * When `resources.type` equals `AWS::RDS::DBCluster` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     *
     * * `arn:&lt;partition&gt;:rds:&lt;region&gt;:&lt;account_ID&gt;:cluster/&lt;cluster_name&gt;`
     *
     * When `resources.type` equals `AWS::S3::AccessPoint` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in one of the following formats. To log events on all objects in
     * an S3 access point, we recommend that you use only the access point ARN, don’t include the
     * object path, and use the `StartsWith` or `NotStartsWith` operators.
     *
     * *
     * `arn:&lt;partition&gt;:s3:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;`
     * *
     * `arn:&lt;partition&gt;:s3:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;/object/&lt;object_path&gt;`
     *
     * When `resources.type` equals `AWS::S3ObjectLambda::AccessPoint` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:s3-object-lambda:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;`
     *
     * When `resources.type` equals `AWS::S3Outposts::Object` , and the operator is set to `Equals`
     * or `NotEquals` , the ARN must be in the following format:
     *
     * * `arn:&lt;partition&gt;:s3-outposts:&lt;region&gt;:&lt;account_ID&gt;:&lt;object_path&gt;`
     *
     * When `resources.type` equals `AWS::SageMaker::Endpoint` , and the operator is set to `Equals`
     * or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:endpoint/&lt;endpoint_name&gt;`
     *
     * When `resources.type` equals `AWS::SageMaker::ExperimentTrialComponent` , and the operator is
     * set to `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:experiment-trial-component/&lt;experiment_trial_component_name&gt;`
     *
     * When `resources.type` equals `AWS::SageMaker::FeatureGroup` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:feature-group/&lt;feature_group_name&gt;`
     *
     * When `resources.type` equals `AWS::SCN::Instance` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     *
     * * `arn:&lt;partition&gt;:scn:&lt;region&gt;:&lt;account_ID&gt;:instance/&lt;instance_ID&gt;`
     *
     * When `resources.type` equals `AWS::ServiceDiscovery::Namespace` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:servicediscovery:&lt;region&gt;:&lt;account_ID&gt;:namespace/&lt;namespace_ID&gt;`
     *
     * When `resources.type` equals `AWS::ServiceDiscovery::Service` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:servicediscovery:&lt;region&gt;:&lt;account_ID&gt;:service/&lt;service_ID&gt;`
     *
     * When `resources.type` equals `AWS::SNS::PlatformEndpoint` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:sns:&lt;region&gt;:&lt;account_ID&gt;:endpoint/&lt;endpoint_type&gt;/&lt;endpoint_name&gt;/&lt;endpoint_ID&gt;`
     *
     * When `resources.type` equals `AWS::SNS::Topic` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     *
     * * `arn:&lt;partition&gt;:sns:&lt;region&gt;:&lt;account_ID&gt;:&lt;topic_name&gt;`
     *
     * When `resources.type` equals `AWS::SQS::Queue` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     *
     * * `arn:&lt;partition&gt;:sqs:&lt;region&gt;:&lt;account_ID&gt;:&lt;queue_name&gt;`
     *
     * When `resources.type` equals `AWS::SSM::ManagedNode` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in one of the following formats:
     *
     * *
     * `arn:&lt;partition&gt;:ssm:&lt;region&gt;:&lt;account_ID&gt;:managed-instance/&lt;instance_ID&gt;`
     * * `arn:&lt;partition&gt;:ec2:&lt;region&gt;:&lt;account_ID&gt;:instance/&lt;instance_ID&gt;`
     *
     * When `resources.type` equals `AWS::SSMMessages::ControlChannel` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:ssmmessages:&lt;region&gt;:&lt;account_ID&gt;:control-channel/&lt;channel_ID&gt;`
     *
     * When `resources.type` equals `AWS::SWF::Domain` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     *
     * * `arn:&lt;partition&gt;:swf:&lt;region&gt;:&lt;account_ID&gt;:domain/&lt;domain_name&gt;`
     *
     * When `resources.type` equals `AWS::ThinClient::Device` , and the operator is set to `Equals`
     * or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:thinclient:&lt;region&gt;:&lt;account_ID&gt;:device/&lt;device_ID&gt;`
     *
     * When `resources.type` equals `AWS::ThinClient::Environment` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:thinclient:&lt;region&gt;:&lt;account_ID&gt;:environment/&lt;environment_ID&gt;`
     *
     * When `resources.type` equals `AWS::Timestream::Database` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:timestream:&lt;region&gt;:&lt;account_ID&gt;:database/&lt;database_name&gt;`
     *
     * When `resources.type` equals `AWS::Timestream::Table` , and the operator is set to `Equals`
     * or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:timestream:&lt;region&gt;:&lt;account_ID&gt;:database/&lt;database_name&gt;/table/&lt;table_name&gt;`
     *
     * When resources.type equals `AWS::VerifiedPermissions::PolicyStore` , and the operator is set
     * to `Equals` or `NotEquals` , the ARN must be in the following format:
     *
     * *
     * `arn:&lt;partition&gt;:verifiedpermissions:&lt;region&gt;:&lt;account_ID&gt;:policy-store/&lt;policy_store_UUID&gt;`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-advancedfieldselector.html#cfn-cloudtrail-trail-advancedfieldselector-field)
     */
    public fun `field`(): String

    /**
     * An operator that excludes events that match the last few characters of the event record field
     * specified as the value of `Field` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-advancedfieldselector.html#cfn-cloudtrail-trail-advancedfieldselector-notendswith)
     */
    public fun notEndsWith(): List<String> = unwrap(this).getNotEndsWith() ?: emptyList()

    /**
     * An operator that excludes events that match the exact value of the event record field
     * specified as the value of `Field` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-advancedfieldselector.html#cfn-cloudtrail-trail-advancedfieldselector-notequals)
     */
    public fun notEquals(): List<String> = unwrap(this).getNotEquals() ?: emptyList()

    /**
     * An operator that excludes events that match the first few characters of the event record
     * field specified as the value of `Field` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-advancedfieldselector.html#cfn-cloudtrail-trail-advancedfieldselector-notstartswith)
     */
    public fun notStartsWith(): List<String> = unwrap(this).getNotStartsWith() ?: emptyList()

    /**
     * An operator that includes events that match the first few characters of the event record
     * field specified as the value of `Field` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-advancedfieldselector.html#cfn-cloudtrail-trail-advancedfieldselector-startswith)
     */
    public fun startsWith(): List<String> = unwrap(this).getStartsWith() ?: emptyList()

    /**
     * A builder for [AdvancedFieldSelectorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endsWith An operator that includes events that match the last few characters of the
       * event record field specified as the value of `Field` .
       */
      public fun endsWith(endsWith: List<String>)

      /**
       * @param endsWith An operator that includes events that match the last few characters of the
       * event record field specified as the value of `Field` .
       */
      public fun endsWith(vararg endsWith: String)

      /**
       * @param equalTo An operator that includes events that match the exact value of the event
       * record field specified as the value of `Field` .
       * This is the only valid operator that you can use with the `readOnly` , `eventCategory` ,
       * and `resources.type` fields.
       */
      public fun equalTo(equalTo: List<String>)

      /**
       * @param equalTo An operator that includes events that match the exact value of the event
       * record field specified as the value of `Field` .
       * This is the only valid operator that you can use with the `readOnly` , `eventCategory` ,
       * and `resources.type` fields.
       */
      public fun equalTo(vararg equalTo: String)

      /**
       * @param field A field in a CloudTrail event record on which to filter events to be logged. 
       * For event data stores for CloudTrail Insights events, AWS Config configuration items, Audit
       * Manager evidence, or events outside of AWS , the field is used only for selecting events as
       * filtering is not supported.
       *
       * For CloudTrail management events, supported fields include `readOnly` , `eventCategory` ,
       * and `eventSource` .
       *
       * For CloudTrail data events, supported fields include `readOnly` , `eventCategory` ,
       * `eventName` , `resources.type` , and `resources.ARN` .
       *
       * For event data stores for CloudTrail Insights events, AWS Config configuration items, Audit
       * Manager evidence, or events outside of AWS , the only supported field is `eventCategory` .
       *
       * * *`readOnly`* - Optional. Can be set to `Equals` a value of `true` or `false` . If you do
       * not add this field, CloudTrail logs both `read` and `write` events. A value of `true` logs
       * only `read` events. A value of `false` logs only `write` events.
       * * *`eventSource`* - For filtering management events only. This can be set to `NotEquals`
       * `kms.amazonaws.com` or `NotEquals` `rdsdata.amazonaws.com` .
       * * *`eventName`* - Can use any operator. You can use it to ﬁlter in or ﬁlter out any data
       * event logged to CloudTrail, such as `PutBucket` or `GetSnapshotBlock` . You can have multiple
       * values for this ﬁeld, separated by commas.
       * * *`eventCategory`* - This is required and must be set to `Equals` .
       * * For CloudTrail management events, the value must be `Management` .
       * * For CloudTrail data events, the value must be `Data` .
       *
       * The following are used only for event data stores:
       *
       * * For CloudTrail Insights events, the value must be `Insight` .
       * * For AWS Config configuration items, the value must be `ConfigurationItem` .
       * * For Audit Manager evidence, the value must be `Evidence` .
       * * For non- AWS events, the value must be `ActivityAuditLog` .
       * * *`resources.type`* - This ﬁeld is required for CloudTrail data events. `resources.type`
       * can only use the `Equals` operator, and the value can be one of the following:
       * * `AWS::DynamoDB::Table`
       * * `AWS::Lambda::Function`
       * * `AWS::S3::Object`
       * * `AWS::AppConfig::Configuration`
       * * `AWS::B2BI::Transformer`
       * * `AWS::Bedrock::AgentAlias`
       * * `AWS::Bedrock::KnowledgeBase`
       * * `AWS::Cassandra::Table`
       * * `AWS::CloudFront::KeyValueStore`
       * * `AWS::CloudTrail::Channel`
       * * `AWS::CodeWhisperer::Customization`
       * * `AWS::CodeWhisperer::Profile`
       * * `AWS::Cognito::IdentityPool`
       * * `AWS::DynamoDB::Stream`
       * * `AWS::EC2::Snapshot`
       * * `AWS::EMRWAL::Workspace`
       * * `AWS::FinSpace::Environment`
       * * `AWS::Glue::Table`
       * * `AWS::GreengrassV2::ComponentVersion`
       * * `AWS::GreengrassV2::Deployment`
       * * `AWS::GuardDuty::Detector`
       * * `AWS::IoT::Certificate`
       * * `AWS::IoT::Thing`
       * * `AWS::IoTSiteWise::Asset`
       * * `AWS::IoTSiteWise::TimeSeries`
       * * `AWS::IoTTwinMaker::Entity`
       * * `AWS::IoTTwinMaker::Workspace`
       * * `AWS::KendraRanking::ExecutionPlan`
       * * `AWS::KinesisVideo::Stream`
       * * `AWS::ManagedBlockchain::Network`
       * * `AWS::ManagedBlockchain::Node`
       * * `AWS::MedicalImaging::Datastore`
       * * `AWS::NeptuneGraph::Graph`
       * * `AWS::PCAConnectorAD::Connector`
       * * `AWS::QBusiness::Application`
       * * `AWS::QBusiness::DataSource`
       * * `AWS::QBusiness::Index`
       * * `AWS::QBusiness::WebExperience`
       * * `AWS::RDS::DBCluster`
       * * `AWS::S3::AccessPoint`
       * * `AWS::S3ObjectLambda::AccessPoint`
       * * `AWS::S3Outposts::Object`
       * * `AWS::SageMaker::Endpoint`
       * * `AWS::SageMaker::ExperimentTrialComponent`
       * * `AWS::SageMaker::FeatureGroup`
       * * `AWS::ServiceDiscovery::Namespace`
       * * `AWS::ServiceDiscovery::Service`
       * * `AWS::SCN::Instance`
       * * `AWS::SNS::PlatformEndpoint`
       * * `AWS::SNS::Topic`
       * * `AWS::SQS::Queue`
       * * `AWS::SSM::ManagedNode`
       * * `AWS::SSMMessages::ControlChannel`
       * * `AWS::SWF::Domain`
       * * `AWS::ThinClient::Device`
       * * `AWS::ThinClient::Environment`
       * * `AWS::Timestream::Database`
       * * `AWS::Timestream::Table`
       * * `AWS::VerifiedPermissions::PolicyStore`
       * * `AWS::XRay::Trace`
       *
       * You can have only one `resources.type` ﬁeld per selector. To log data events on more than
       * one resource type, add another selector.
       *
       * * *`resources.ARN`* - You can use any operator with `resources.ARN` , but if you use
       * `Equals` or `NotEquals` , the value must exactly match the ARN of a valid resource of the type
       * you've speciﬁed in the template as the value of resources.type.
       *
       *
       * You can't use the `resources.ARN` field to filter resource types that do not have ARNs.
       *
       *
       * The `resources.ARN` field can be set one of the following.
       *
       * If resources.type equals `AWS::S3::Object` , the ARN must be in one of the following
       * formats. To log all data events for all objects in a specific S3 bucket, use the `StartsWith`
       * operator, and include only the bucket ARN as the matching value.
       *
       * The trailing slash is intentional; do not exclude it. Replace the text between less than
       * and greater than symbols (&lt;&gt;) with resource-specific information.
       *
       * * `arn:&lt;partition&gt;:s3:::&lt;bucket_name&gt;/`
       * * `arn:&lt;partition&gt;:s3:::&lt;bucket_name&gt;/&lt;object_path&gt;/`
       *
       * When resources.type equals `AWS::DynamoDB::Table` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:dynamodb:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;table_name&gt;`
       *
       * When resources.type equals `AWS::Lambda::Function` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:lambda:&lt;region&gt;:&lt;account_ID&gt;:function:&lt;function_name&gt;`
       *
       * When resources.type equals `AWS::AppConfig::Configuration` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:appconfig:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/environment/&lt;environment_ID&gt;/configuration/&lt;configuration_profile_ID&gt;`
       *
       * When resources.type equals `AWS::B2BI::Transformer` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:b2bi:&lt;region&gt;:&lt;account_ID&gt;:transformer/&lt;transformer_ID&gt;`
       *
       * When resources.type equals `AWS::Bedrock::AgentAlias` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:bedrock:&lt;region&gt;:&lt;account_ID&gt;:agent-alias/&lt;agent_ID&gt;/&lt;alias_ID&gt;`
       *
       * When resources.type equals `AWS::Bedrock::KnowledgeBase` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:bedrock:&lt;region&gt;:&lt;account_ID&gt;:knowledge-base/&lt;knowledge_base_ID&gt;`
       *
       * When resources.type equals `AWS::Cassandra::Table` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:cassandra:&lt;region&gt;:&lt;account_ID&gt;:/keyspace/&lt;keyspace_name&gt;/table/&lt;table_name&gt;`
       *
       * When resources.type equals `AWS::CloudFront::KeyValueStore` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:cloudfront:&lt;region&gt;:&lt;account_ID&gt;:key-value-store/&lt;KVS_name&gt;`
       *
       * When resources.type equals `AWS::CloudTrail::Channel` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:cloudtrail:&lt;region&gt;:&lt;account_ID&gt;:channel/&lt;channel_UUID&gt;`
       *
       * When resources.type equals `AWS::CodeWhisperer::Customization` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:codewhisperer:&lt;region&gt;:&lt;account_ID&gt;:customization/&lt;customization_ID&gt;`
       *
       * When resources.type equals `AWS::CodeWhisperer::Profile` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:codewhisperer:&lt;region&gt;:&lt;account_ID&gt;:profile/&lt;profile_ID&gt;`
       *
       * When resources.type equals `AWS::Cognito::IdentityPool` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:cognito-identity:&lt;region&gt;:&lt;account_ID&gt;:identitypool/&lt;identity_pool_ID&gt;`
       *
       * When `resources.type` equals `AWS::DynamoDB::Stream` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:dynamodb:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;table_name&gt;/stream/&lt;date_time&gt;`
       *
       * When `resources.type` equals `AWS::EC2::Snapshot` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * * `arn:&lt;partition&gt;:ec2:&lt;region&gt;::snapshot/&lt;snapshot_ID&gt;`
       *
       * When `resources.type` equals `AWS::EMRWAL::Workspace` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:emrwal:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_name&gt;`
       *
       * When `resources.type` equals `AWS::FinSpace::Environment` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:finspace:&lt;region&gt;:&lt;account_ID&gt;:environment/&lt;environment_ID&gt;`
       *
       * When `resources.type` equals `AWS::Glue::Table` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:glue:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;database_name&gt;/&lt;table_name&gt;`
       *
       * When `resources.type` equals `AWS::GreengrassV2::ComponentVersion` , and the operator is
       * set to `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:greengrass:&lt;region&gt;:&lt;account_ID&gt;:components/&lt;component_name&gt;`
       *
       * When `resources.type` equals `AWS::GreengrassV2::Deployment` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:greengrass:&lt;region&gt;:&lt;account_ID&gt;:deployments/&lt;deployment_ID`
       *
       * When `resources.type` equals `AWS::GuardDuty::Detector` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:guardduty:&lt;region&gt;:&lt;account_ID&gt;:detector/&lt;detector_ID&gt;`
       *
       * When `resources.type` equals `AWS::IoT::Certificate` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in the following format:
       *
       * * `arn:&lt;partition&gt;:iot:&lt;region&gt;:&lt;account_ID&gt;:cert/&lt;certificate_ID&gt;`
       *
       * When `resources.type` equals `AWS::IoT::Thing` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * * `arn:&lt;partition&gt;:iot:&lt;region&gt;:&lt;account_ID&gt;:thing/&lt;thing_ID&gt;`
       *
       * When `resources.type` equals `AWS::IoTSiteWise::Asset` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:iotsitewise:&lt;region&gt;:&lt;account_ID&gt;:asset/&lt;asset_ID&gt;`
       *
       * When `resources.type` equals `AWS::IoTSiteWise::TimeSeries` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:iotsitewise:&lt;region&gt;:&lt;account_ID&gt;:timeseries/&lt;timeseries_ID&gt;`
       *
       * When `resources.type` equals `AWS::IoTTwinMaker::Entity` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:iottwinmaker:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_ID&gt;/entity/&lt;entity_ID&gt;`
       *
       * When `resources.type` equals `AWS::IoTTwinMaker::Workspace` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:iottwinmaker:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_ID&gt;`
       *
       * When `resources.type` equals `AWS::KendraRanking::ExecutionPlan` , and the operator is set
       * to `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:kendra-ranking:&lt;region&gt;:&lt;account_ID&gt;:rescore-execution-plan/&lt;rescore_execution_plan_ID&gt;`
       *
       * When `resources.type` equals `AWS::KinesisVideo::Stream` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:kinesisvideo:&lt;region&gt;:&lt;account_ID&gt;:stream/&lt;stream_name&gt;/&lt;creation_time&gt;`
       *
       * When `resources.type` equals `AWS::ManagedBlockchain::Network` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * * `arn:&lt;partition&gt;:managedblockchain:::networks/&lt;network_name&gt;`
       *
       * When `resources.type` equals `AWS::ManagedBlockchain::Node` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:managedblockchain:&lt;region&gt;:&lt;account_ID&gt;:nodes/&lt;node_ID&gt;`
       *
       * When `resources.type` equals `AWS::MedicalImaging::Datastore` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:medical-imaging:&lt;region&gt;:&lt;account_ID&gt;:datastore/&lt;data_store_ID&gt;`
       *
       * When `resources.type` equals `AWS::NeptuneGraph::Graph` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:neptune-graph:&lt;region&gt;:&lt;account_ID&gt;:graph/&lt;graph_ID&gt;`
       *
       * When `resources.type` equals `AWS::PCAConnectorAD::Connector` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:pca-connector-ad:&lt;region&gt;:&lt;account_ID&gt;:connector/&lt;connector_ID&gt;`
       *
       * When `resources.type` equals `AWS::QBusiness::Application` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;`
       *
       * When `resources.type` equals `AWS::QBusiness::DataSource` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/index/&lt;index_ID&gt;/data-source/&lt;datasource_ID&gt;`
       *
       * When `resources.type` equals `AWS::QBusiness::Index` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/index/&lt;index_ID&gt;`
       *
       * When `resources.type` equals `AWS::QBusiness::WebExperience` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/web-experience/&lt;web_experience_ID&gt;`
       *
       * When `resources.type` equals `AWS::RDS::DBCluster` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:rds:&lt;region&gt;:&lt;account_ID&gt;:cluster/&lt;cluster_name&gt;`
       *
       * When `resources.type` equals `AWS::S3::AccessPoint` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in one of the following formats. To log events on all objects
       * in an S3 access point, we recommend that you use only the access point ARN, don’t include the
       * object path, and use the `StartsWith` or `NotStartsWith` operators.
       *
       * *
       * `arn:&lt;partition&gt;:s3:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;`
       * *
       * `arn:&lt;partition&gt;:s3:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;/object/&lt;object_path&gt;`
       *
       * When `resources.type` equals `AWS::S3ObjectLambda::AccessPoint` , and the operator is set
       * to `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:s3-object-lambda:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;`
       *
       * When `resources.type` equals `AWS::S3Outposts::Object` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * * `arn:&lt;partition&gt;:s3-outposts:&lt;region&gt;:&lt;account_ID&gt;:&lt;object_path&gt;`
       *
       * When `resources.type` equals `AWS::SageMaker::Endpoint` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:endpoint/&lt;endpoint_name&gt;`
       *
       * When `resources.type` equals `AWS::SageMaker::ExperimentTrialComponent` , and the operator
       * is set to `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:experiment-trial-component/&lt;experiment_trial_component_name&gt;`
       *
       * When `resources.type` equals `AWS::SageMaker::FeatureGroup` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:feature-group/&lt;feature_group_name&gt;`
       *
       * When `resources.type` equals `AWS::SCN::Instance` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:scn:&lt;region&gt;:&lt;account_ID&gt;:instance/&lt;instance_ID&gt;`
       *
       * When `resources.type` equals `AWS::ServiceDiscovery::Namespace` , and the operator is set
       * to `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:servicediscovery:&lt;region&gt;:&lt;account_ID&gt;:namespace/&lt;namespace_ID&gt;`
       *
       * When `resources.type` equals `AWS::ServiceDiscovery::Service` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:servicediscovery:&lt;region&gt;:&lt;account_ID&gt;:service/&lt;service_ID&gt;`
       *
       * When `resources.type` equals `AWS::SNS::PlatformEndpoint` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:sns:&lt;region&gt;:&lt;account_ID&gt;:endpoint/&lt;endpoint_type&gt;/&lt;endpoint_name&gt;/&lt;endpoint_ID&gt;`
       *
       * When `resources.type` equals `AWS::SNS::Topic` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * * `arn:&lt;partition&gt;:sns:&lt;region&gt;:&lt;account_ID&gt;:&lt;topic_name&gt;`
       *
       * When `resources.type` equals `AWS::SQS::Queue` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * * `arn:&lt;partition&gt;:sqs:&lt;region&gt;:&lt;account_ID&gt;:&lt;queue_name&gt;`
       *
       * When `resources.type` equals `AWS::SSM::ManagedNode` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in one of the following formats:
       *
       * *
       * `arn:&lt;partition&gt;:ssm:&lt;region&gt;:&lt;account_ID&gt;:managed-instance/&lt;instance_ID&gt;`
       * *
       * `arn:&lt;partition&gt;:ec2:&lt;region&gt;:&lt;account_ID&gt;:instance/&lt;instance_ID&gt;`
       *
       * When `resources.type` equals `AWS::SSMMessages::ControlChannel` , and the operator is set
       * to `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:ssmmessages:&lt;region&gt;:&lt;account_ID&gt;:control-channel/&lt;channel_ID&gt;`
       *
       * When `resources.type` equals `AWS::SWF::Domain` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * * `arn:&lt;partition&gt;:swf:&lt;region&gt;:&lt;account_ID&gt;:domain/&lt;domain_name&gt;`
       *
       * When `resources.type` equals `AWS::ThinClient::Device` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:thinclient:&lt;region&gt;:&lt;account_ID&gt;:device/&lt;device_ID&gt;`
       *
       * When `resources.type` equals `AWS::ThinClient::Environment` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:thinclient:&lt;region&gt;:&lt;account_ID&gt;:environment/&lt;environment_ID&gt;`
       *
       * When `resources.type` equals `AWS::Timestream::Database` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:timestream:&lt;region&gt;:&lt;account_ID&gt;:database/&lt;database_name&gt;`
       *
       * When `resources.type` equals `AWS::Timestream::Table` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:timestream:&lt;region&gt;:&lt;account_ID&gt;:database/&lt;database_name&gt;/table/&lt;table_name&gt;`
       *
       * When resources.type equals `AWS::VerifiedPermissions::PolicyStore` , and the operator is
       * set to `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:verifiedpermissions:&lt;region&gt;:&lt;account_ID&gt;:policy-store/&lt;policy_store_UUID&gt;`
       */
      public fun `field`(`field`: String)

      /**
       * @param notEndsWith An operator that excludes events that match the last few characters of
       * the event record field specified as the value of `Field` .
       */
      public fun notEndsWith(notEndsWith: List<String>)

      /**
       * @param notEndsWith An operator that excludes events that match the last few characters of
       * the event record field specified as the value of `Field` .
       */
      public fun notEndsWith(vararg notEndsWith: String)

      /**
       * @param notEquals An operator that excludes events that match the exact value of the event
       * record field specified as the value of `Field` .
       */
      public fun notEquals(notEquals: List<String>)

      /**
       * @param notEquals An operator that excludes events that match the exact value of the event
       * record field specified as the value of `Field` .
       */
      public fun notEquals(vararg notEquals: String)

      /**
       * @param notStartsWith An operator that excludes events that match the first few characters
       * of the event record field specified as the value of `Field` .
       */
      public fun notStartsWith(notStartsWith: List<String>)

      /**
       * @param notStartsWith An operator that excludes events that match the first few characters
       * of the event record field specified as the value of `Field` .
       */
      public fun notStartsWith(vararg notStartsWith: String)

      /**
       * @param startsWith An operator that includes events that match the first few characters of
       * the event record field specified as the value of `Field` .
       */
      public fun startsWith(startsWith: List<String>)

      /**
       * @param startsWith An operator that includes events that match the first few characters of
       * the event record field specified as the value of `Field` .
       */
      public fun startsWith(vararg startsWith: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudtrail.CfnTrail.AdvancedFieldSelectorProperty.Builder
          =
          software.amazon.awscdk.services.cloudtrail.CfnTrail.AdvancedFieldSelectorProperty.builder()

      /**
       * @param endsWith An operator that includes events that match the last few characters of the
       * event record field specified as the value of `Field` .
       */
      override fun endsWith(endsWith: List<String>) {
        cdkBuilder.endsWith(endsWith)
      }

      /**
       * @param endsWith An operator that includes events that match the last few characters of the
       * event record field specified as the value of `Field` .
       */
      override fun endsWith(vararg endsWith: String): Unit = endsWith(endsWith.toList())

      /**
       * @param equalTo An operator that includes events that match the exact value of the event
       * record field specified as the value of `Field` .
       * This is the only valid operator that you can use with the `readOnly` , `eventCategory` ,
       * and `resources.type` fields.
       */
      override fun equalTo(equalTo: List<String>) {
        cdkBuilder.equalTo(equalTo)
      }

      /**
       * @param equalTo An operator that includes events that match the exact value of the event
       * record field specified as the value of `Field` .
       * This is the only valid operator that you can use with the `readOnly` , `eventCategory` ,
       * and `resources.type` fields.
       */
      override fun equalTo(vararg equalTo: String): Unit = equalTo(equalTo.toList())

      /**
       * @param field A field in a CloudTrail event record on which to filter events to be logged. 
       * For event data stores for CloudTrail Insights events, AWS Config configuration items, Audit
       * Manager evidence, or events outside of AWS , the field is used only for selecting events as
       * filtering is not supported.
       *
       * For CloudTrail management events, supported fields include `readOnly` , `eventCategory` ,
       * and `eventSource` .
       *
       * For CloudTrail data events, supported fields include `readOnly` , `eventCategory` ,
       * `eventName` , `resources.type` , and `resources.ARN` .
       *
       * For event data stores for CloudTrail Insights events, AWS Config configuration items, Audit
       * Manager evidence, or events outside of AWS , the only supported field is `eventCategory` .
       *
       * * *`readOnly`* - Optional. Can be set to `Equals` a value of `true` or `false` . If you do
       * not add this field, CloudTrail logs both `read` and `write` events. A value of `true` logs
       * only `read` events. A value of `false` logs only `write` events.
       * * *`eventSource`* - For filtering management events only. This can be set to `NotEquals`
       * `kms.amazonaws.com` or `NotEquals` `rdsdata.amazonaws.com` .
       * * *`eventName`* - Can use any operator. You can use it to ﬁlter in or ﬁlter out any data
       * event logged to CloudTrail, such as `PutBucket` or `GetSnapshotBlock` . You can have multiple
       * values for this ﬁeld, separated by commas.
       * * *`eventCategory`* - This is required and must be set to `Equals` .
       * * For CloudTrail management events, the value must be `Management` .
       * * For CloudTrail data events, the value must be `Data` .
       *
       * The following are used only for event data stores:
       *
       * * For CloudTrail Insights events, the value must be `Insight` .
       * * For AWS Config configuration items, the value must be `ConfigurationItem` .
       * * For Audit Manager evidence, the value must be `Evidence` .
       * * For non- AWS events, the value must be `ActivityAuditLog` .
       * * *`resources.type`* - This ﬁeld is required for CloudTrail data events. `resources.type`
       * can only use the `Equals` operator, and the value can be one of the following:
       * * `AWS::DynamoDB::Table`
       * * `AWS::Lambda::Function`
       * * `AWS::S3::Object`
       * * `AWS::AppConfig::Configuration`
       * * `AWS::B2BI::Transformer`
       * * `AWS::Bedrock::AgentAlias`
       * * `AWS::Bedrock::KnowledgeBase`
       * * `AWS::Cassandra::Table`
       * * `AWS::CloudFront::KeyValueStore`
       * * `AWS::CloudTrail::Channel`
       * * `AWS::CodeWhisperer::Customization`
       * * `AWS::CodeWhisperer::Profile`
       * * `AWS::Cognito::IdentityPool`
       * * `AWS::DynamoDB::Stream`
       * * `AWS::EC2::Snapshot`
       * * `AWS::EMRWAL::Workspace`
       * * `AWS::FinSpace::Environment`
       * * `AWS::Glue::Table`
       * * `AWS::GreengrassV2::ComponentVersion`
       * * `AWS::GreengrassV2::Deployment`
       * * `AWS::GuardDuty::Detector`
       * * `AWS::IoT::Certificate`
       * * `AWS::IoT::Thing`
       * * `AWS::IoTSiteWise::Asset`
       * * `AWS::IoTSiteWise::TimeSeries`
       * * `AWS::IoTTwinMaker::Entity`
       * * `AWS::IoTTwinMaker::Workspace`
       * * `AWS::KendraRanking::ExecutionPlan`
       * * `AWS::KinesisVideo::Stream`
       * * `AWS::ManagedBlockchain::Network`
       * * `AWS::ManagedBlockchain::Node`
       * * `AWS::MedicalImaging::Datastore`
       * * `AWS::NeptuneGraph::Graph`
       * * `AWS::PCAConnectorAD::Connector`
       * * `AWS::QBusiness::Application`
       * * `AWS::QBusiness::DataSource`
       * * `AWS::QBusiness::Index`
       * * `AWS::QBusiness::WebExperience`
       * * `AWS::RDS::DBCluster`
       * * `AWS::S3::AccessPoint`
       * * `AWS::S3ObjectLambda::AccessPoint`
       * * `AWS::S3Outposts::Object`
       * * `AWS::SageMaker::Endpoint`
       * * `AWS::SageMaker::ExperimentTrialComponent`
       * * `AWS::SageMaker::FeatureGroup`
       * * `AWS::ServiceDiscovery::Namespace`
       * * `AWS::ServiceDiscovery::Service`
       * * `AWS::SCN::Instance`
       * * `AWS::SNS::PlatformEndpoint`
       * * `AWS::SNS::Topic`
       * * `AWS::SQS::Queue`
       * * `AWS::SSM::ManagedNode`
       * * `AWS::SSMMessages::ControlChannel`
       * * `AWS::SWF::Domain`
       * * `AWS::ThinClient::Device`
       * * `AWS::ThinClient::Environment`
       * * `AWS::Timestream::Database`
       * * `AWS::Timestream::Table`
       * * `AWS::VerifiedPermissions::PolicyStore`
       * * `AWS::XRay::Trace`
       *
       * You can have only one `resources.type` ﬁeld per selector. To log data events on more than
       * one resource type, add another selector.
       *
       * * *`resources.ARN`* - You can use any operator with `resources.ARN` , but if you use
       * `Equals` or `NotEquals` , the value must exactly match the ARN of a valid resource of the type
       * you've speciﬁed in the template as the value of resources.type.
       *
       *
       * You can't use the `resources.ARN` field to filter resource types that do not have ARNs.
       *
       *
       * The `resources.ARN` field can be set one of the following.
       *
       * If resources.type equals `AWS::S3::Object` , the ARN must be in one of the following
       * formats. To log all data events for all objects in a specific S3 bucket, use the `StartsWith`
       * operator, and include only the bucket ARN as the matching value.
       *
       * The trailing slash is intentional; do not exclude it. Replace the text between less than
       * and greater than symbols (&lt;&gt;) with resource-specific information.
       *
       * * `arn:&lt;partition&gt;:s3:::&lt;bucket_name&gt;/`
       * * `arn:&lt;partition&gt;:s3:::&lt;bucket_name&gt;/&lt;object_path&gt;/`
       *
       * When resources.type equals `AWS::DynamoDB::Table` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:dynamodb:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;table_name&gt;`
       *
       * When resources.type equals `AWS::Lambda::Function` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:lambda:&lt;region&gt;:&lt;account_ID&gt;:function:&lt;function_name&gt;`
       *
       * When resources.type equals `AWS::AppConfig::Configuration` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:appconfig:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/environment/&lt;environment_ID&gt;/configuration/&lt;configuration_profile_ID&gt;`
       *
       * When resources.type equals `AWS::B2BI::Transformer` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:b2bi:&lt;region&gt;:&lt;account_ID&gt;:transformer/&lt;transformer_ID&gt;`
       *
       * When resources.type equals `AWS::Bedrock::AgentAlias` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:bedrock:&lt;region&gt;:&lt;account_ID&gt;:agent-alias/&lt;agent_ID&gt;/&lt;alias_ID&gt;`
       *
       * When resources.type equals `AWS::Bedrock::KnowledgeBase` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:bedrock:&lt;region&gt;:&lt;account_ID&gt;:knowledge-base/&lt;knowledge_base_ID&gt;`
       *
       * When resources.type equals `AWS::Cassandra::Table` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:cassandra:&lt;region&gt;:&lt;account_ID&gt;:/keyspace/&lt;keyspace_name&gt;/table/&lt;table_name&gt;`
       *
       * When resources.type equals `AWS::CloudFront::KeyValueStore` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:cloudfront:&lt;region&gt;:&lt;account_ID&gt;:key-value-store/&lt;KVS_name&gt;`
       *
       * When resources.type equals `AWS::CloudTrail::Channel` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:cloudtrail:&lt;region&gt;:&lt;account_ID&gt;:channel/&lt;channel_UUID&gt;`
       *
       * When resources.type equals `AWS::CodeWhisperer::Customization` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:codewhisperer:&lt;region&gt;:&lt;account_ID&gt;:customization/&lt;customization_ID&gt;`
       *
       * When resources.type equals `AWS::CodeWhisperer::Profile` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:codewhisperer:&lt;region&gt;:&lt;account_ID&gt;:profile/&lt;profile_ID&gt;`
       *
       * When resources.type equals `AWS::Cognito::IdentityPool` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:cognito-identity:&lt;region&gt;:&lt;account_ID&gt;:identitypool/&lt;identity_pool_ID&gt;`
       *
       * When `resources.type` equals `AWS::DynamoDB::Stream` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:dynamodb:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;table_name&gt;/stream/&lt;date_time&gt;`
       *
       * When `resources.type` equals `AWS::EC2::Snapshot` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * * `arn:&lt;partition&gt;:ec2:&lt;region&gt;::snapshot/&lt;snapshot_ID&gt;`
       *
       * When `resources.type` equals `AWS::EMRWAL::Workspace` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:emrwal:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_name&gt;`
       *
       * When `resources.type` equals `AWS::FinSpace::Environment` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:finspace:&lt;region&gt;:&lt;account_ID&gt;:environment/&lt;environment_ID&gt;`
       *
       * When `resources.type` equals `AWS::Glue::Table` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:glue:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;database_name&gt;/&lt;table_name&gt;`
       *
       * When `resources.type` equals `AWS::GreengrassV2::ComponentVersion` , and the operator is
       * set to `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:greengrass:&lt;region&gt;:&lt;account_ID&gt;:components/&lt;component_name&gt;`
       *
       * When `resources.type` equals `AWS::GreengrassV2::Deployment` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:greengrass:&lt;region&gt;:&lt;account_ID&gt;:deployments/&lt;deployment_ID`
       *
       * When `resources.type` equals `AWS::GuardDuty::Detector` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:guardduty:&lt;region&gt;:&lt;account_ID&gt;:detector/&lt;detector_ID&gt;`
       *
       * When `resources.type` equals `AWS::IoT::Certificate` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in the following format:
       *
       * * `arn:&lt;partition&gt;:iot:&lt;region&gt;:&lt;account_ID&gt;:cert/&lt;certificate_ID&gt;`
       *
       * When `resources.type` equals `AWS::IoT::Thing` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * * `arn:&lt;partition&gt;:iot:&lt;region&gt;:&lt;account_ID&gt;:thing/&lt;thing_ID&gt;`
       *
       * When `resources.type` equals `AWS::IoTSiteWise::Asset` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:iotsitewise:&lt;region&gt;:&lt;account_ID&gt;:asset/&lt;asset_ID&gt;`
       *
       * When `resources.type` equals `AWS::IoTSiteWise::TimeSeries` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:iotsitewise:&lt;region&gt;:&lt;account_ID&gt;:timeseries/&lt;timeseries_ID&gt;`
       *
       * When `resources.type` equals `AWS::IoTTwinMaker::Entity` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:iottwinmaker:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_ID&gt;/entity/&lt;entity_ID&gt;`
       *
       * When `resources.type` equals `AWS::IoTTwinMaker::Workspace` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:iottwinmaker:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_ID&gt;`
       *
       * When `resources.type` equals `AWS::KendraRanking::ExecutionPlan` , and the operator is set
       * to `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:kendra-ranking:&lt;region&gt;:&lt;account_ID&gt;:rescore-execution-plan/&lt;rescore_execution_plan_ID&gt;`
       *
       * When `resources.type` equals `AWS::KinesisVideo::Stream` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:kinesisvideo:&lt;region&gt;:&lt;account_ID&gt;:stream/&lt;stream_name&gt;/&lt;creation_time&gt;`
       *
       * When `resources.type` equals `AWS::ManagedBlockchain::Network` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * * `arn:&lt;partition&gt;:managedblockchain:::networks/&lt;network_name&gt;`
       *
       * When `resources.type` equals `AWS::ManagedBlockchain::Node` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:managedblockchain:&lt;region&gt;:&lt;account_ID&gt;:nodes/&lt;node_ID&gt;`
       *
       * When `resources.type` equals `AWS::MedicalImaging::Datastore` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:medical-imaging:&lt;region&gt;:&lt;account_ID&gt;:datastore/&lt;data_store_ID&gt;`
       *
       * When `resources.type` equals `AWS::NeptuneGraph::Graph` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:neptune-graph:&lt;region&gt;:&lt;account_ID&gt;:graph/&lt;graph_ID&gt;`
       *
       * When `resources.type` equals `AWS::PCAConnectorAD::Connector` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:pca-connector-ad:&lt;region&gt;:&lt;account_ID&gt;:connector/&lt;connector_ID&gt;`
       *
       * When `resources.type` equals `AWS::QBusiness::Application` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;`
       *
       * When `resources.type` equals `AWS::QBusiness::DataSource` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/index/&lt;index_ID&gt;/data-source/&lt;datasource_ID&gt;`
       *
       * When `resources.type` equals `AWS::QBusiness::Index` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/index/&lt;index_ID&gt;`
       *
       * When `resources.type` equals `AWS::QBusiness::WebExperience` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/web-experience/&lt;web_experience_ID&gt;`
       *
       * When `resources.type` equals `AWS::RDS::DBCluster` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:rds:&lt;region&gt;:&lt;account_ID&gt;:cluster/&lt;cluster_name&gt;`
       *
       * When `resources.type` equals `AWS::S3::AccessPoint` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in one of the following formats. To log events on all objects
       * in an S3 access point, we recommend that you use only the access point ARN, don’t include the
       * object path, and use the `StartsWith` or `NotStartsWith` operators.
       *
       * *
       * `arn:&lt;partition&gt;:s3:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;`
       * *
       * `arn:&lt;partition&gt;:s3:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;/object/&lt;object_path&gt;`
       *
       * When `resources.type` equals `AWS::S3ObjectLambda::AccessPoint` , and the operator is set
       * to `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:s3-object-lambda:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;`
       *
       * When `resources.type` equals `AWS::S3Outposts::Object` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * * `arn:&lt;partition&gt;:s3-outposts:&lt;region&gt;:&lt;account_ID&gt;:&lt;object_path&gt;`
       *
       * When `resources.type` equals `AWS::SageMaker::Endpoint` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:endpoint/&lt;endpoint_name&gt;`
       *
       * When `resources.type` equals `AWS::SageMaker::ExperimentTrialComponent` , and the operator
       * is set to `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:experiment-trial-component/&lt;experiment_trial_component_name&gt;`
       *
       * When `resources.type` equals `AWS::SageMaker::FeatureGroup` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:feature-group/&lt;feature_group_name&gt;`
       *
       * When `resources.type` equals `AWS::SCN::Instance` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:scn:&lt;region&gt;:&lt;account_ID&gt;:instance/&lt;instance_ID&gt;`
       *
       * When `resources.type` equals `AWS::ServiceDiscovery::Namespace` , and the operator is set
       * to `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:servicediscovery:&lt;region&gt;:&lt;account_ID&gt;:namespace/&lt;namespace_ID&gt;`
       *
       * When `resources.type` equals `AWS::ServiceDiscovery::Service` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:servicediscovery:&lt;region&gt;:&lt;account_ID&gt;:service/&lt;service_ID&gt;`
       *
       * When `resources.type` equals `AWS::SNS::PlatformEndpoint` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:sns:&lt;region&gt;:&lt;account_ID&gt;:endpoint/&lt;endpoint_type&gt;/&lt;endpoint_name&gt;/&lt;endpoint_ID&gt;`
       *
       * When `resources.type` equals `AWS::SNS::Topic` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * * `arn:&lt;partition&gt;:sns:&lt;region&gt;:&lt;account_ID&gt;:&lt;topic_name&gt;`
       *
       * When `resources.type` equals `AWS::SQS::Queue` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * * `arn:&lt;partition&gt;:sqs:&lt;region&gt;:&lt;account_ID&gt;:&lt;queue_name&gt;`
       *
       * When `resources.type` equals `AWS::SSM::ManagedNode` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in one of the following formats:
       *
       * *
       * `arn:&lt;partition&gt;:ssm:&lt;region&gt;:&lt;account_ID&gt;:managed-instance/&lt;instance_ID&gt;`
       * *
       * `arn:&lt;partition&gt;:ec2:&lt;region&gt;:&lt;account_ID&gt;:instance/&lt;instance_ID&gt;`
       *
       * When `resources.type` equals `AWS::SSMMessages::ControlChannel` , and the operator is set
       * to `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:ssmmessages:&lt;region&gt;:&lt;account_ID&gt;:control-channel/&lt;channel_ID&gt;`
       *
       * When `resources.type` equals `AWS::SWF::Domain` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * * `arn:&lt;partition&gt;:swf:&lt;region&gt;:&lt;account_ID&gt;:domain/&lt;domain_name&gt;`
       *
       * When `resources.type` equals `AWS::ThinClient::Device` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:thinclient:&lt;region&gt;:&lt;account_ID&gt;:device/&lt;device_ID&gt;`
       *
       * When `resources.type` equals `AWS::ThinClient::Environment` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:thinclient:&lt;region&gt;:&lt;account_ID&gt;:environment/&lt;environment_ID&gt;`
       *
       * When `resources.type` equals `AWS::Timestream::Database` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:timestream:&lt;region&gt;:&lt;account_ID&gt;:database/&lt;database_name&gt;`
       *
       * When `resources.type` equals `AWS::Timestream::Table` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:timestream:&lt;region&gt;:&lt;account_ID&gt;:database/&lt;database_name&gt;/table/&lt;table_name&gt;`
       *
       * When resources.type equals `AWS::VerifiedPermissions::PolicyStore` , and the operator is
       * set to `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:verifiedpermissions:&lt;region&gt;:&lt;account_ID&gt;:policy-store/&lt;policy_store_UUID&gt;`
       */
      override fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
      }

      /**
       * @param notEndsWith An operator that excludes events that match the last few characters of
       * the event record field specified as the value of `Field` .
       */
      override fun notEndsWith(notEndsWith: List<String>) {
        cdkBuilder.notEndsWith(notEndsWith)
      }

      /**
       * @param notEndsWith An operator that excludes events that match the last few characters of
       * the event record field specified as the value of `Field` .
       */
      override fun notEndsWith(vararg notEndsWith: String): Unit = notEndsWith(notEndsWith.toList())

      /**
       * @param notEquals An operator that excludes events that match the exact value of the event
       * record field specified as the value of `Field` .
       */
      override fun notEquals(notEquals: List<String>) {
        cdkBuilder.notEquals(notEquals)
      }

      /**
       * @param notEquals An operator that excludes events that match the exact value of the event
       * record field specified as the value of `Field` .
       */
      override fun notEquals(vararg notEquals: String): Unit = notEquals(notEquals.toList())

      /**
       * @param notStartsWith An operator that excludes events that match the first few characters
       * of the event record field specified as the value of `Field` .
       */
      override fun notStartsWith(notStartsWith: List<String>) {
        cdkBuilder.notStartsWith(notStartsWith)
      }

      /**
       * @param notStartsWith An operator that excludes events that match the first few characters
       * of the event record field specified as the value of `Field` .
       */
      override fun notStartsWith(vararg notStartsWith: String): Unit =
          notStartsWith(notStartsWith.toList())

      /**
       * @param startsWith An operator that includes events that match the first few characters of
       * the event record field specified as the value of `Field` .
       */
      override fun startsWith(startsWith: List<String>) {
        cdkBuilder.startsWith(startsWith)
      }

      /**
       * @param startsWith An operator that includes events that match the first few characters of
       * the event record field specified as the value of `Field` .
       */
      override fun startsWith(vararg startsWith: String): Unit = startsWith(startsWith.toList())

      public fun build():
          software.amazon.awscdk.services.cloudtrail.CfnTrail.AdvancedFieldSelectorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudtrail.CfnTrail.AdvancedFieldSelectorProperty,
    ) : CdkObject(cdkObject), AdvancedFieldSelectorProperty {
      /**
       * An operator that includes events that match the last few characters of the event record
       * field specified as the value of `Field` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-advancedfieldselector.html#cfn-cloudtrail-trail-advancedfieldselector-endswith)
       */
      override fun endsWith(): List<String> = unwrap(this).getEndsWith() ?: emptyList()

      /**
       * An operator that includes events that match the exact value of the event record field
       * specified as the value of `Field` .
       *
       * This is the only valid operator that you can use with the `readOnly` , `eventCategory` ,
       * and `resources.type` fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-advancedfieldselector.html#cfn-cloudtrail-trail-advancedfieldselector-equals)
       */
      override fun equalTo(): List<String> = unwrap(this).getEqualTo() ?: emptyList()

      /**
       * A field in a CloudTrail event record on which to filter events to be logged.
       *
       * For event data stores for CloudTrail Insights events, AWS Config configuration items, Audit
       * Manager evidence, or events outside of AWS , the field is used only for selecting events as
       * filtering is not supported.
       *
       * For CloudTrail management events, supported fields include `readOnly` , `eventCategory` ,
       * and `eventSource` .
       *
       * For CloudTrail data events, supported fields include `readOnly` , `eventCategory` ,
       * `eventName` , `resources.type` , and `resources.ARN` .
       *
       * For event data stores for CloudTrail Insights events, AWS Config configuration items, Audit
       * Manager evidence, or events outside of AWS , the only supported field is `eventCategory` .
       *
       * * *`readOnly`* - Optional. Can be set to `Equals` a value of `true` or `false` . If you do
       * not add this field, CloudTrail logs both `read` and `write` events. A value of `true` logs
       * only `read` events. A value of `false` logs only `write` events.
       * * *`eventSource`* - For filtering management events only. This can be set to `NotEquals`
       * `kms.amazonaws.com` or `NotEquals` `rdsdata.amazonaws.com` .
       * * *`eventName`* - Can use any operator. You can use it to ﬁlter in or ﬁlter out any data
       * event logged to CloudTrail, such as `PutBucket` or `GetSnapshotBlock` . You can have multiple
       * values for this ﬁeld, separated by commas.
       * * *`eventCategory`* - This is required and must be set to `Equals` .
       * * For CloudTrail management events, the value must be `Management` .
       * * For CloudTrail data events, the value must be `Data` .
       *
       * The following are used only for event data stores:
       *
       * * For CloudTrail Insights events, the value must be `Insight` .
       * * For AWS Config configuration items, the value must be `ConfigurationItem` .
       * * For Audit Manager evidence, the value must be `Evidence` .
       * * For non- AWS events, the value must be `ActivityAuditLog` .
       * * *`resources.type`* - This ﬁeld is required for CloudTrail data events. `resources.type`
       * can only use the `Equals` operator, and the value can be one of the following:
       * * `AWS::DynamoDB::Table`
       * * `AWS::Lambda::Function`
       * * `AWS::S3::Object`
       * * `AWS::AppConfig::Configuration`
       * * `AWS::B2BI::Transformer`
       * * `AWS::Bedrock::AgentAlias`
       * * `AWS::Bedrock::KnowledgeBase`
       * * `AWS::Cassandra::Table`
       * * `AWS::CloudFront::KeyValueStore`
       * * `AWS::CloudTrail::Channel`
       * * `AWS::CodeWhisperer::Customization`
       * * `AWS::CodeWhisperer::Profile`
       * * `AWS::Cognito::IdentityPool`
       * * `AWS::DynamoDB::Stream`
       * * `AWS::EC2::Snapshot`
       * * `AWS::EMRWAL::Workspace`
       * * `AWS::FinSpace::Environment`
       * * `AWS::Glue::Table`
       * * `AWS::GreengrassV2::ComponentVersion`
       * * `AWS::GreengrassV2::Deployment`
       * * `AWS::GuardDuty::Detector`
       * * `AWS::IoT::Certificate`
       * * `AWS::IoT::Thing`
       * * `AWS::IoTSiteWise::Asset`
       * * `AWS::IoTSiteWise::TimeSeries`
       * * `AWS::IoTTwinMaker::Entity`
       * * `AWS::IoTTwinMaker::Workspace`
       * * `AWS::KendraRanking::ExecutionPlan`
       * * `AWS::KinesisVideo::Stream`
       * * `AWS::ManagedBlockchain::Network`
       * * `AWS::ManagedBlockchain::Node`
       * * `AWS::MedicalImaging::Datastore`
       * * `AWS::NeptuneGraph::Graph`
       * * `AWS::PCAConnectorAD::Connector`
       * * `AWS::QBusiness::Application`
       * * `AWS::QBusiness::DataSource`
       * * `AWS::QBusiness::Index`
       * * `AWS::QBusiness::WebExperience`
       * * `AWS::RDS::DBCluster`
       * * `AWS::S3::AccessPoint`
       * * `AWS::S3ObjectLambda::AccessPoint`
       * * `AWS::S3Outposts::Object`
       * * `AWS::SageMaker::Endpoint`
       * * `AWS::SageMaker::ExperimentTrialComponent`
       * * `AWS::SageMaker::FeatureGroup`
       * * `AWS::ServiceDiscovery::Namespace`
       * * `AWS::ServiceDiscovery::Service`
       * * `AWS::SCN::Instance`
       * * `AWS::SNS::PlatformEndpoint`
       * * `AWS::SNS::Topic`
       * * `AWS::SQS::Queue`
       * * `AWS::SSM::ManagedNode`
       * * `AWS::SSMMessages::ControlChannel`
       * * `AWS::SWF::Domain`
       * * `AWS::ThinClient::Device`
       * * `AWS::ThinClient::Environment`
       * * `AWS::Timestream::Database`
       * * `AWS::Timestream::Table`
       * * `AWS::VerifiedPermissions::PolicyStore`
       * * `AWS::XRay::Trace`
       *
       * You can have only one `resources.type` ﬁeld per selector. To log data events on more than
       * one resource type, add another selector.
       *
       * * *`resources.ARN`* - You can use any operator with `resources.ARN` , but if you use
       * `Equals` or `NotEquals` , the value must exactly match the ARN of a valid resource of the type
       * you've speciﬁed in the template as the value of resources.type.
       *
       *
       * You can't use the `resources.ARN` field to filter resource types that do not have ARNs.
       *
       *
       * The `resources.ARN` field can be set one of the following.
       *
       * If resources.type equals `AWS::S3::Object` , the ARN must be in one of the following
       * formats. To log all data events for all objects in a specific S3 bucket, use the `StartsWith`
       * operator, and include only the bucket ARN as the matching value.
       *
       * The trailing slash is intentional; do not exclude it. Replace the text between less than
       * and greater than symbols (&lt;&gt;) with resource-specific information.
       *
       * * `arn:&lt;partition&gt;:s3:::&lt;bucket_name&gt;/`
       * * `arn:&lt;partition&gt;:s3:::&lt;bucket_name&gt;/&lt;object_path&gt;/`
       *
       * When resources.type equals `AWS::DynamoDB::Table` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:dynamodb:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;table_name&gt;`
       *
       * When resources.type equals `AWS::Lambda::Function` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:lambda:&lt;region&gt;:&lt;account_ID&gt;:function:&lt;function_name&gt;`
       *
       * When resources.type equals `AWS::AppConfig::Configuration` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:appconfig:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/environment/&lt;environment_ID&gt;/configuration/&lt;configuration_profile_ID&gt;`
       *
       * When resources.type equals `AWS::B2BI::Transformer` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:b2bi:&lt;region&gt;:&lt;account_ID&gt;:transformer/&lt;transformer_ID&gt;`
       *
       * When resources.type equals `AWS::Bedrock::AgentAlias` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:bedrock:&lt;region&gt;:&lt;account_ID&gt;:agent-alias/&lt;agent_ID&gt;/&lt;alias_ID&gt;`
       *
       * When resources.type equals `AWS::Bedrock::KnowledgeBase` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:bedrock:&lt;region&gt;:&lt;account_ID&gt;:knowledge-base/&lt;knowledge_base_ID&gt;`
       *
       * When resources.type equals `AWS::Cassandra::Table` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:cassandra:&lt;region&gt;:&lt;account_ID&gt;:/keyspace/&lt;keyspace_name&gt;/table/&lt;table_name&gt;`
       *
       * When resources.type equals `AWS::CloudFront::KeyValueStore` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:cloudfront:&lt;region&gt;:&lt;account_ID&gt;:key-value-store/&lt;KVS_name&gt;`
       *
       * When resources.type equals `AWS::CloudTrail::Channel` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:cloudtrail:&lt;region&gt;:&lt;account_ID&gt;:channel/&lt;channel_UUID&gt;`
       *
       * When resources.type equals `AWS::CodeWhisperer::Customization` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:codewhisperer:&lt;region&gt;:&lt;account_ID&gt;:customization/&lt;customization_ID&gt;`
       *
       * When resources.type equals `AWS::CodeWhisperer::Profile` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:codewhisperer:&lt;region&gt;:&lt;account_ID&gt;:profile/&lt;profile_ID&gt;`
       *
       * When resources.type equals `AWS::Cognito::IdentityPool` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:cognito-identity:&lt;region&gt;:&lt;account_ID&gt;:identitypool/&lt;identity_pool_ID&gt;`
       *
       * When `resources.type` equals `AWS::DynamoDB::Stream` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:dynamodb:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;table_name&gt;/stream/&lt;date_time&gt;`
       *
       * When `resources.type` equals `AWS::EC2::Snapshot` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * * `arn:&lt;partition&gt;:ec2:&lt;region&gt;::snapshot/&lt;snapshot_ID&gt;`
       *
       * When `resources.type` equals `AWS::EMRWAL::Workspace` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:emrwal:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_name&gt;`
       *
       * When `resources.type` equals `AWS::FinSpace::Environment` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:finspace:&lt;region&gt;:&lt;account_ID&gt;:environment/&lt;environment_ID&gt;`
       *
       * When `resources.type` equals `AWS::Glue::Table` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:glue:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;database_name&gt;/&lt;table_name&gt;`
       *
       * When `resources.type` equals `AWS::GreengrassV2::ComponentVersion` , and the operator is
       * set to `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:greengrass:&lt;region&gt;:&lt;account_ID&gt;:components/&lt;component_name&gt;`
       *
       * When `resources.type` equals `AWS::GreengrassV2::Deployment` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:greengrass:&lt;region&gt;:&lt;account_ID&gt;:deployments/&lt;deployment_ID`
       *
       * When `resources.type` equals `AWS::GuardDuty::Detector` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:guardduty:&lt;region&gt;:&lt;account_ID&gt;:detector/&lt;detector_ID&gt;`
       *
       * When `resources.type` equals `AWS::IoT::Certificate` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in the following format:
       *
       * * `arn:&lt;partition&gt;:iot:&lt;region&gt;:&lt;account_ID&gt;:cert/&lt;certificate_ID&gt;`
       *
       * When `resources.type` equals `AWS::IoT::Thing` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * * `arn:&lt;partition&gt;:iot:&lt;region&gt;:&lt;account_ID&gt;:thing/&lt;thing_ID&gt;`
       *
       * When `resources.type` equals `AWS::IoTSiteWise::Asset` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:iotsitewise:&lt;region&gt;:&lt;account_ID&gt;:asset/&lt;asset_ID&gt;`
       *
       * When `resources.type` equals `AWS::IoTSiteWise::TimeSeries` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:iotsitewise:&lt;region&gt;:&lt;account_ID&gt;:timeseries/&lt;timeseries_ID&gt;`
       *
       * When `resources.type` equals `AWS::IoTTwinMaker::Entity` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:iottwinmaker:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_ID&gt;/entity/&lt;entity_ID&gt;`
       *
       * When `resources.type` equals `AWS::IoTTwinMaker::Workspace` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:iottwinmaker:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_ID&gt;`
       *
       * When `resources.type` equals `AWS::KendraRanking::ExecutionPlan` , and the operator is set
       * to `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:kendra-ranking:&lt;region&gt;:&lt;account_ID&gt;:rescore-execution-plan/&lt;rescore_execution_plan_ID&gt;`
       *
       * When `resources.type` equals `AWS::KinesisVideo::Stream` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:kinesisvideo:&lt;region&gt;:&lt;account_ID&gt;:stream/&lt;stream_name&gt;/&lt;creation_time&gt;`
       *
       * When `resources.type` equals `AWS::ManagedBlockchain::Network` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * * `arn:&lt;partition&gt;:managedblockchain:::networks/&lt;network_name&gt;`
       *
       * When `resources.type` equals `AWS::ManagedBlockchain::Node` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:managedblockchain:&lt;region&gt;:&lt;account_ID&gt;:nodes/&lt;node_ID&gt;`
       *
       * When `resources.type` equals `AWS::MedicalImaging::Datastore` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:medical-imaging:&lt;region&gt;:&lt;account_ID&gt;:datastore/&lt;data_store_ID&gt;`
       *
       * When `resources.type` equals `AWS::NeptuneGraph::Graph` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:neptune-graph:&lt;region&gt;:&lt;account_ID&gt;:graph/&lt;graph_ID&gt;`
       *
       * When `resources.type` equals `AWS::PCAConnectorAD::Connector` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:pca-connector-ad:&lt;region&gt;:&lt;account_ID&gt;:connector/&lt;connector_ID&gt;`
       *
       * When `resources.type` equals `AWS::QBusiness::Application` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;`
       *
       * When `resources.type` equals `AWS::QBusiness::DataSource` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/index/&lt;index_ID&gt;/data-source/&lt;datasource_ID&gt;`
       *
       * When `resources.type` equals `AWS::QBusiness::Index` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/index/&lt;index_ID&gt;`
       *
       * When `resources.type` equals `AWS::QBusiness::WebExperience` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/web-experience/&lt;web_experience_ID&gt;`
       *
       * When `resources.type` equals `AWS::RDS::DBCluster` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:rds:&lt;region&gt;:&lt;account_ID&gt;:cluster/&lt;cluster_name&gt;`
       *
       * When `resources.type` equals `AWS::S3::AccessPoint` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in one of the following formats. To log events on all objects
       * in an S3 access point, we recommend that you use only the access point ARN, don’t include the
       * object path, and use the `StartsWith` or `NotStartsWith` operators.
       *
       * *
       * `arn:&lt;partition&gt;:s3:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;`
       * *
       * `arn:&lt;partition&gt;:s3:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;/object/&lt;object_path&gt;`
       *
       * When `resources.type` equals `AWS::S3ObjectLambda::AccessPoint` , and the operator is set
       * to `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:s3-object-lambda:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;`
       *
       * When `resources.type` equals `AWS::S3Outposts::Object` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * * `arn:&lt;partition&gt;:s3-outposts:&lt;region&gt;:&lt;account_ID&gt;:&lt;object_path&gt;`
       *
       * When `resources.type` equals `AWS::SageMaker::Endpoint` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:endpoint/&lt;endpoint_name&gt;`
       *
       * When `resources.type` equals `AWS::SageMaker::ExperimentTrialComponent` , and the operator
       * is set to `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:experiment-trial-component/&lt;experiment_trial_component_name&gt;`
       *
       * When `resources.type` equals `AWS::SageMaker::FeatureGroup` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:feature-group/&lt;feature_group_name&gt;`
       *
       * When `resources.type` equals `AWS::SCN::Instance` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:scn:&lt;region&gt;:&lt;account_ID&gt;:instance/&lt;instance_ID&gt;`
       *
       * When `resources.type` equals `AWS::ServiceDiscovery::Namespace` , and the operator is set
       * to `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:servicediscovery:&lt;region&gt;:&lt;account_ID&gt;:namespace/&lt;namespace_ID&gt;`
       *
       * When `resources.type` equals `AWS::ServiceDiscovery::Service` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:servicediscovery:&lt;region&gt;:&lt;account_ID&gt;:service/&lt;service_ID&gt;`
       *
       * When `resources.type` equals `AWS::SNS::PlatformEndpoint` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:sns:&lt;region&gt;:&lt;account_ID&gt;:endpoint/&lt;endpoint_type&gt;/&lt;endpoint_name&gt;/&lt;endpoint_ID&gt;`
       *
       * When `resources.type` equals `AWS::SNS::Topic` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * * `arn:&lt;partition&gt;:sns:&lt;region&gt;:&lt;account_ID&gt;:&lt;topic_name&gt;`
       *
       * When `resources.type` equals `AWS::SQS::Queue` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * * `arn:&lt;partition&gt;:sqs:&lt;region&gt;:&lt;account_ID&gt;:&lt;queue_name&gt;`
       *
       * When `resources.type` equals `AWS::SSM::ManagedNode` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in one of the following formats:
       *
       * *
       * `arn:&lt;partition&gt;:ssm:&lt;region&gt;:&lt;account_ID&gt;:managed-instance/&lt;instance_ID&gt;`
       * *
       * `arn:&lt;partition&gt;:ec2:&lt;region&gt;:&lt;account_ID&gt;:instance/&lt;instance_ID&gt;`
       *
       * When `resources.type` equals `AWS::SSMMessages::ControlChannel` , and the operator is set
       * to `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:ssmmessages:&lt;region&gt;:&lt;account_ID&gt;:control-channel/&lt;channel_ID&gt;`
       *
       * When `resources.type` equals `AWS::SWF::Domain` , and the operator is set to `Equals` or
       * `NotEquals` , the ARN must be in the following format:
       *
       * * `arn:&lt;partition&gt;:swf:&lt;region&gt;:&lt;account_ID&gt;:domain/&lt;domain_name&gt;`
       *
       * When `resources.type` equals `AWS::ThinClient::Device` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:thinclient:&lt;region&gt;:&lt;account_ID&gt;:device/&lt;device_ID&gt;`
       *
       * When `resources.type` equals `AWS::ThinClient::Environment` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:thinclient:&lt;region&gt;:&lt;account_ID&gt;:environment/&lt;environment_ID&gt;`
       *
       * When `resources.type` equals `AWS::Timestream::Database` , and the operator is set to
       * `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:timestream:&lt;region&gt;:&lt;account_ID&gt;:database/&lt;database_name&gt;`
       *
       * When `resources.type` equals `AWS::Timestream::Table` , and the operator is set to `Equals`
       * or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:timestream:&lt;region&gt;:&lt;account_ID&gt;:database/&lt;database_name&gt;/table/&lt;table_name&gt;`
       *
       * When resources.type equals `AWS::VerifiedPermissions::PolicyStore` , and the operator is
       * set to `Equals` or `NotEquals` , the ARN must be in the following format:
       *
       * *
       * `arn:&lt;partition&gt;:verifiedpermissions:&lt;region&gt;:&lt;account_ID&gt;:policy-store/&lt;policy_store_UUID&gt;`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-advancedfieldselector.html#cfn-cloudtrail-trail-advancedfieldselector-field)
       */
      override fun `field`(): String = unwrap(this).getField()

      /**
       * An operator that excludes events that match the last few characters of the event record
       * field specified as the value of `Field` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-advancedfieldselector.html#cfn-cloudtrail-trail-advancedfieldselector-notendswith)
       */
      override fun notEndsWith(): List<String> = unwrap(this).getNotEndsWith() ?: emptyList()

      /**
       * An operator that excludes events that match the exact value of the event record field
       * specified as the value of `Field` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-advancedfieldselector.html#cfn-cloudtrail-trail-advancedfieldselector-notequals)
       */
      override fun notEquals(): List<String> = unwrap(this).getNotEquals() ?: emptyList()

      /**
       * An operator that excludes events that match the first few characters of the event record
       * field specified as the value of `Field` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-advancedfieldselector.html#cfn-cloudtrail-trail-advancedfieldselector-notstartswith)
       */
      override fun notStartsWith(): List<String> = unwrap(this).getNotStartsWith() ?: emptyList()

      /**
       * An operator that includes events that match the first few characters of the event record
       * field specified as the value of `Field` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-advancedfieldselector.html#cfn-cloudtrail-trail-advancedfieldselector-startswith)
       */
      override fun startsWith(): List<String> = unwrap(this).getStartsWith() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AdvancedFieldSelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnTrail.AdvancedFieldSelectorProperty):
          AdvancedFieldSelectorProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AdvancedFieldSelectorProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdvancedFieldSelectorProperty):
          software.amazon.awscdk.services.cloudtrail.CfnTrail.AdvancedFieldSelectorProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudtrail.CfnTrail.AdvancedFieldSelectorProperty
    }
  }

  /**
   * The Amazon S3 buckets, AWS Lambda functions, or Amazon DynamoDB tables that you specify in your
   * event selectors for your trail to log data events.
   *
   * Data events provide information about the resource operations performed on or within a resource
   * itself. These are also known as data plane operations. You can specify up to 250 data resources
   * for a trail.
   *
   *
   * The total number of allowed data resources is 250. This number can be distributed between 1 and
   * 5 event selectors, but the total cannot exceed 250 across all selectors for the trail.
   *
   * If you are using advanced event selectors, the maximum total number of values for all
   * conditions, across all advanced event selectors for the trail, is 500.
   *
   *
   * The following example demonstrates how logging works when you configure logging of all data
   * events for an S3 bucket named `bucket-1` . In this example, the CloudTrail user specified an empty
   * prefix, and the option to log both `Read` and `Write` data events.
   *
   * * A user uploads an image file to `bucket-1` .
   * * The `PutObject` API operation is an Amazon S3 object-level API. It is recorded as a data
   * event in CloudTrail. Because the CloudTrail user specified an S3 bucket with an empty prefix,
   * events that occur on any object in that bucket are logged. The trail processes and logs the event.
   * * A user uploads an object to an Amazon S3 bucket named `arn:aws:s3:::bucket-2` .
   * * The `PutObject` API operation occurred for an object in an S3 bucket that the CloudTrail user
   * didn't specify for the trail. The trail doesn’t log the event.
   *
   * The following example demonstrates how logging works when you configure logging of AWS Lambda
   * data events for a Lambda function named *MyLambdaFunction* , but not for all Lambda functions.
   *
   * * A user runs a script that includes a call to the *MyLambdaFunction* function and the
   * *MyOtherLambdaFunction* function.
   * * The `Invoke` API operation on *MyLambdaFunction* is an Lambda API. It is recorded as a data
   * event in CloudTrail. Because the CloudTrail user specified logging data events for
   * *MyLambdaFunction* , any invocations of that function are logged. The trail processes and logs the
   * event.
   * * The `Invoke` API operation on *MyOtherLambdaFunction* is an Lambda API. Because the
   * CloudTrail user did not specify logging data events for all Lambda functions, the `Invoke`
   * operation for *MyOtherLambdaFunction* does not match the function specified for the trail. The
   * trail doesn’t log the event.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudtrail.*;
   * DataResourceProperty dataResourceProperty = DataResourceProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-dataresource.html)
   */
  public interface DataResourceProperty {
    /**
     * The resource type in which you want to log data events.
     *
     * You can specify the following *basic* event selector resource types:
     *
     * * `AWS::DynamoDB::Table`
     * * `AWS::Lambda::Function`
     * * `AWS::S3::Object`
     *
     * Additional resource types are available through *advanced* event selectors. For more
     * information about these additional resource types, see
     * [AdvancedFieldSelector](https://docs.aws.amazon.com/awscloudtrail/latest/APIReference/API_AdvancedFieldSelector.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-dataresource.html#cfn-cloudtrail-trail-dataresource-type)
     */
    public fun type(): String

    /**
     * An array of Amazon Resource Name (ARN) strings or partial ARN strings for the specified
     * objects.
     *
     * * To log data events for all objects in all S3 buckets in your AWS account , specify the
     * prefix as `arn:aws:s3` .
     *
     *
     * This also enables logging of data event activity performed by any user or role in your AWS
     * account , even if that activity is performed on a bucket that belongs to another AWS account .
     *
     *
     * * To log data events for all objects in an S3 bucket, specify the bucket and an empty object
     * prefix such as `arn:aws:s3:::bucket-1/` . The trail logs data events for all objects in this S3
     * bucket.
     * * To log data events for specific objects, specify the S3 bucket and object prefix such as
     * `arn:aws:s3:::bucket-1/example-images` . The trail logs data events for objects in this S3
     * bucket that match the prefix.
     * * To log data events for all Lambda functions in your AWS account , specify the prefix as
     * `arn:aws:lambda` .
     *
     *
     * This also enables logging of `Invoke` activity performed by any user or role in your AWS
     * account , even if that activity is performed on a function that belongs to another AWS account .
     *
     *
     * * To log data events for a specific Lambda function, specify the function ARN.
     *
     *
     * Lambda function ARNs are exact. For example, if you specify a function ARN
     * *arn:aws:lambda:us-west-2:111111111111:function:helloworld* , data events will only be logged
     * for *arn:aws:lambda:us-west-2:111111111111:function:helloworld* . They will not be logged for
     * *arn:aws:lambda:us-west-2:111111111111:function:helloworld2* .
     *
     *
     * * To log data events for all DynamoDB tables in your AWS account , specify the prefix as
     * `arn:aws:dynamodb` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-dataresource.html#cfn-cloudtrail-trail-dataresource-values)
     */
    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    /**
     * A builder for [DataResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The resource type in which you want to log data events. 
       * You can specify the following *basic* event selector resource types:
       *
       * * `AWS::DynamoDB::Table`
       * * `AWS::Lambda::Function`
       * * `AWS::S3::Object`
       *
       * Additional resource types are available through *advanced* event selectors. For more
       * information about these additional resource types, see
       * [AdvancedFieldSelector](https://docs.aws.amazon.com/awscloudtrail/latest/APIReference/API_AdvancedFieldSelector.html)
       * .
       */
      public fun type(type: String)

      /**
       * @param values An array of Amazon Resource Name (ARN) strings or partial ARN strings for the
       * specified objects.
       * * To log data events for all objects in all S3 buckets in your AWS account , specify the
       * prefix as `arn:aws:s3` .
       *
       *
       * This also enables logging of data event activity performed by any user or role in your AWS
       * account , even if that activity is performed on a bucket that belongs to another AWS account .
       *
       *
       * * To log data events for all objects in an S3 bucket, specify the bucket and an empty
       * object prefix such as `arn:aws:s3:::bucket-1/` . The trail logs data events for all objects in
       * this S3 bucket.
       * * To log data events for specific objects, specify the S3 bucket and object prefix such as
       * `arn:aws:s3:::bucket-1/example-images` . The trail logs data events for objects in this S3
       * bucket that match the prefix.
       * * To log data events for all Lambda functions in your AWS account , specify the prefix as
       * `arn:aws:lambda` .
       *
       *
       * This also enables logging of `Invoke` activity performed by any user or role in your AWS
       * account , even if that activity is performed on a function that belongs to another AWS account
       * .
       *
       *
       * * To log data events for a specific Lambda function, specify the function ARN.
       *
       *
       * Lambda function ARNs are exact. For example, if you specify a function ARN
       * *arn:aws:lambda:us-west-2:111111111111:function:helloworld* , data events will only be logged
       * for *arn:aws:lambda:us-west-2:111111111111:function:helloworld* . They will not be logged for
       * *arn:aws:lambda:us-west-2:111111111111:function:helloworld2* .
       *
       *
       * * To log data events for all DynamoDB tables in your AWS account , specify the prefix as
       * `arn:aws:dynamodb` .
       */
      public fun values(values: List<String>)

      /**
       * @param values An array of Amazon Resource Name (ARN) strings or partial ARN strings for the
       * specified objects.
       * * To log data events for all objects in all S3 buckets in your AWS account , specify the
       * prefix as `arn:aws:s3` .
       *
       *
       * This also enables logging of data event activity performed by any user or role in your AWS
       * account , even if that activity is performed on a bucket that belongs to another AWS account .
       *
       *
       * * To log data events for all objects in an S3 bucket, specify the bucket and an empty
       * object prefix such as `arn:aws:s3:::bucket-1/` . The trail logs data events for all objects in
       * this S3 bucket.
       * * To log data events for specific objects, specify the S3 bucket and object prefix such as
       * `arn:aws:s3:::bucket-1/example-images` . The trail logs data events for objects in this S3
       * bucket that match the prefix.
       * * To log data events for all Lambda functions in your AWS account , specify the prefix as
       * `arn:aws:lambda` .
       *
       *
       * This also enables logging of `Invoke` activity performed by any user or role in your AWS
       * account , even if that activity is performed on a function that belongs to another AWS account
       * .
       *
       *
       * * To log data events for a specific Lambda function, specify the function ARN.
       *
       *
       * Lambda function ARNs are exact. For example, if you specify a function ARN
       * *arn:aws:lambda:us-west-2:111111111111:function:helloworld* , data events will only be logged
       * for *arn:aws:lambda:us-west-2:111111111111:function:helloworld* . They will not be logged for
       * *arn:aws:lambda:us-west-2:111111111111:function:helloworld2* .
       *
       *
       * * To log data events for all DynamoDB tables in your AWS account , specify the prefix as
       * `arn:aws:dynamodb` .
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudtrail.CfnTrail.DataResourceProperty.Builder =
          software.amazon.awscdk.services.cloudtrail.CfnTrail.DataResourceProperty.builder()

      /**
       * @param type The resource type in which you want to log data events. 
       * You can specify the following *basic* event selector resource types:
       *
       * * `AWS::DynamoDB::Table`
       * * `AWS::Lambda::Function`
       * * `AWS::S3::Object`
       *
       * Additional resource types are available through *advanced* event selectors. For more
       * information about these additional resource types, see
       * [AdvancedFieldSelector](https://docs.aws.amazon.com/awscloudtrail/latest/APIReference/API_AdvancedFieldSelector.html)
       * .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param values An array of Amazon Resource Name (ARN) strings or partial ARN strings for the
       * specified objects.
       * * To log data events for all objects in all S3 buckets in your AWS account , specify the
       * prefix as `arn:aws:s3` .
       *
       *
       * This also enables logging of data event activity performed by any user or role in your AWS
       * account , even if that activity is performed on a bucket that belongs to another AWS account .
       *
       *
       * * To log data events for all objects in an S3 bucket, specify the bucket and an empty
       * object prefix such as `arn:aws:s3:::bucket-1/` . The trail logs data events for all objects in
       * this S3 bucket.
       * * To log data events for specific objects, specify the S3 bucket and object prefix such as
       * `arn:aws:s3:::bucket-1/example-images` . The trail logs data events for objects in this S3
       * bucket that match the prefix.
       * * To log data events for all Lambda functions in your AWS account , specify the prefix as
       * `arn:aws:lambda` .
       *
       *
       * This also enables logging of `Invoke` activity performed by any user or role in your AWS
       * account , even if that activity is performed on a function that belongs to another AWS account
       * .
       *
       *
       * * To log data events for a specific Lambda function, specify the function ARN.
       *
       *
       * Lambda function ARNs are exact. For example, if you specify a function ARN
       * *arn:aws:lambda:us-west-2:111111111111:function:helloworld* , data events will only be logged
       * for *arn:aws:lambda:us-west-2:111111111111:function:helloworld* . They will not be logged for
       * *arn:aws:lambda:us-west-2:111111111111:function:helloworld2* .
       *
       *
       * * To log data events for all DynamoDB tables in your AWS account , specify the prefix as
       * `arn:aws:dynamodb` .
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values An array of Amazon Resource Name (ARN) strings or partial ARN strings for the
       * specified objects.
       * * To log data events for all objects in all S3 buckets in your AWS account , specify the
       * prefix as `arn:aws:s3` .
       *
       *
       * This also enables logging of data event activity performed by any user or role in your AWS
       * account , even if that activity is performed on a bucket that belongs to another AWS account .
       *
       *
       * * To log data events for all objects in an S3 bucket, specify the bucket and an empty
       * object prefix such as `arn:aws:s3:::bucket-1/` . The trail logs data events for all objects in
       * this S3 bucket.
       * * To log data events for specific objects, specify the S3 bucket and object prefix such as
       * `arn:aws:s3:::bucket-1/example-images` . The trail logs data events for objects in this S3
       * bucket that match the prefix.
       * * To log data events for all Lambda functions in your AWS account , specify the prefix as
       * `arn:aws:lambda` .
       *
       *
       * This also enables logging of `Invoke` activity performed by any user or role in your AWS
       * account , even if that activity is performed on a function that belongs to another AWS account
       * .
       *
       *
       * * To log data events for a specific Lambda function, specify the function ARN.
       *
       *
       * Lambda function ARNs are exact. For example, if you specify a function ARN
       * *arn:aws:lambda:us-west-2:111111111111:function:helloworld* , data events will only be logged
       * for *arn:aws:lambda:us-west-2:111111111111:function:helloworld* . They will not be logged for
       * *arn:aws:lambda:us-west-2:111111111111:function:helloworld2* .
       *
       *
       * * To log data events for all DynamoDB tables in your AWS account , specify the prefix as
       * `arn:aws:dynamodb` .
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build(): software.amazon.awscdk.services.cloudtrail.CfnTrail.DataResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudtrail.CfnTrail.DataResourceProperty,
    ) : CdkObject(cdkObject), DataResourceProperty {
      /**
       * The resource type in which you want to log data events.
       *
       * You can specify the following *basic* event selector resource types:
       *
       * * `AWS::DynamoDB::Table`
       * * `AWS::Lambda::Function`
       * * `AWS::S3::Object`
       *
       * Additional resource types are available through *advanced* event selectors. For more
       * information about these additional resource types, see
       * [AdvancedFieldSelector](https://docs.aws.amazon.com/awscloudtrail/latest/APIReference/API_AdvancedFieldSelector.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-dataresource.html#cfn-cloudtrail-trail-dataresource-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * An array of Amazon Resource Name (ARN) strings or partial ARN strings for the specified
       * objects.
       *
       * * To log data events for all objects in all S3 buckets in your AWS account , specify the
       * prefix as `arn:aws:s3` .
       *
       *
       * This also enables logging of data event activity performed by any user or role in your AWS
       * account , even if that activity is performed on a bucket that belongs to another AWS account .
       *
       *
       * * To log data events for all objects in an S3 bucket, specify the bucket and an empty
       * object prefix such as `arn:aws:s3:::bucket-1/` . The trail logs data events for all objects in
       * this S3 bucket.
       * * To log data events for specific objects, specify the S3 bucket and object prefix such as
       * `arn:aws:s3:::bucket-1/example-images` . The trail logs data events for objects in this S3
       * bucket that match the prefix.
       * * To log data events for all Lambda functions in your AWS account , specify the prefix as
       * `arn:aws:lambda` .
       *
       *
       * This also enables logging of `Invoke` activity performed by any user or role in your AWS
       * account , even if that activity is performed on a function that belongs to another AWS account
       * .
       *
       *
       * * To log data events for a specific Lambda function, specify the function ARN.
       *
       *
       * Lambda function ARNs are exact. For example, if you specify a function ARN
       * *arn:aws:lambda:us-west-2:111111111111:function:helloworld* , data events will only be logged
       * for *arn:aws:lambda:us-west-2:111111111111:function:helloworld* . They will not be logged for
       * *arn:aws:lambda:us-west-2:111111111111:function:helloworld2* .
       *
       *
       * * To log data events for all DynamoDB tables in your AWS account , specify the prefix as
       * `arn:aws:dynamodb` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-dataresource.html#cfn-cloudtrail-trail-dataresource-values)
       */
      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnTrail.DataResourceProperty):
          DataResourceProperty = CdkObjectWrappers.wrap(cdkObject) as? DataResourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataResourceProperty):
          software.amazon.awscdk.services.cloudtrail.CfnTrail.DataResourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudtrail.CfnTrail.DataResourceProperty
    }
  }

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
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudtrail.*;
   * EventSelectorProperty eventSelectorProperty = EventSelectorProperty.builder()
   * .dataResources(List.of(DataResourceProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .values(List.of("values"))
   * .build()))
   * .excludeManagementEventSources(List.of("excludeManagementEventSources"))
   * .includeManagementEvents(false)
   * .readWriteType("readWriteType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html)
   */
  public interface EventSelectorProperty {
    /**
     * CloudTrail supports data event logging for Amazon S3 objects, AWS Lambda functions, and
     * Amazon DynamoDB tables with basic event selectors.
     *
     * You can specify up to 250 resources for an individual event selector, but the total number of
     * data resources cannot exceed 250 across all event selectors in a trail. This limit does not
     * apply if you configure resource logging for all data events.
     *
     * For more information, see [Data
     * Events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
     * and [Limits in AWS
     * CloudTrail](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html)
     * in the *AWS CloudTrail User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-dataresources)
     */
    public fun dataResources(): Any? = unwrap(this).getDataResources()

    /**
     * An optional list of service event sources from which you do not want management events to be
     * logged on your trail.
     *
     * In this release, the list can be empty (disables the filter), or it can filter out AWS Key
     * Management Service or Amazon RDS Data API events by containing `kms.amazonaws.com` or
     * `rdsdata.amazonaws.com` . By default, `ExcludeManagementEventSources` is empty, and AWS KMS and
     * Amazon RDS Data API events are logged to your trail. You can exclude management event sources
     * only in Regions that support the event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-excludemanagementeventsources)
     */
    public fun excludeManagementEventSources(): List<String> =
        unwrap(this).getExcludeManagementEventSources() ?: emptyList()

    /**
     * Specify if you want your event selector to include management events for your trail.
     *
     * For more information, see [Management
     * Events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-events-with-cloudtrail.html)
     * in the *AWS CloudTrail User Guide* .
     *
     * By default, the value is `true` .
     *
     * The first copy of management events is free. You are charged for additional copies of
     * management events that you are logging on any subsequent trail in the same Region. For more
     * information about CloudTrail pricing, see [AWS CloudTrail
     * Pricing](https://docs.aws.amazon.com/cloudtrail/pricing/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-includemanagementevents)
     */
    public fun includeManagementEvents(): Any? = unwrap(this).getIncludeManagementEvents()

    /**
     * Specify if you want your trail to log read-only events, write-only events, or all.
     *
     * For example, the EC2 `GetConsoleOutput` is a read-only API operation and `RunInstances` is a
     * write-only API operation.
     *
     * By default, the value is `All` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-readwritetype)
     */
    public fun readWriteType(): String? = unwrap(this).getReadWriteType()

    /**
     * A builder for [EventSelectorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataResources CloudTrail supports data event logging for Amazon S3 objects, AWS
       * Lambda functions, and Amazon DynamoDB tables with basic event selectors.
       * You can specify up to 250 resources for an individual event selector, but the total number
       * of data resources cannot exceed 250 across all event selectors in a trail. This limit does not
       * apply if you configure resource logging for all data events.
       *
       * For more information, see [Data
       * Events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
       * and [Limits in AWS
       * CloudTrail](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html)
       * in the *AWS CloudTrail User Guide* .
       */
      public fun dataResources(dataResources: IResolvable)

      /**
       * @param dataResources CloudTrail supports data event logging for Amazon S3 objects, AWS
       * Lambda functions, and Amazon DynamoDB tables with basic event selectors.
       * You can specify up to 250 resources for an individual event selector, but the total number
       * of data resources cannot exceed 250 across all event selectors in a trail. This limit does not
       * apply if you configure resource logging for all data events.
       *
       * For more information, see [Data
       * Events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
       * and [Limits in AWS
       * CloudTrail](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html)
       * in the *AWS CloudTrail User Guide* .
       */
      public fun dataResources(dataResources: List<Any>)

      /**
       * @param dataResources CloudTrail supports data event logging for Amazon S3 objects, AWS
       * Lambda functions, and Amazon DynamoDB tables with basic event selectors.
       * You can specify up to 250 resources for an individual event selector, but the total number
       * of data resources cannot exceed 250 across all event selectors in a trail. This limit does not
       * apply if you configure resource logging for all data events.
       *
       * For more information, see [Data
       * Events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
       * and [Limits in AWS
       * CloudTrail](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html)
       * in the *AWS CloudTrail User Guide* .
       */
      public fun dataResources(vararg dataResources: Any)

      /**
       * @param excludeManagementEventSources An optional list of service event sources from which
       * you do not want management events to be logged on your trail.
       * In this release, the list can be empty (disables the filter), or it can filter out AWS Key
       * Management Service or Amazon RDS Data API events by containing `kms.amazonaws.com` or
       * `rdsdata.amazonaws.com` . By default, `ExcludeManagementEventSources` is empty, and AWS KMS
       * and Amazon RDS Data API events are logged to your trail. You can exclude management event
       * sources only in Regions that support the event source.
       */
      public fun excludeManagementEventSources(excludeManagementEventSources: List<String>)

      /**
       * @param excludeManagementEventSources An optional list of service event sources from which
       * you do not want management events to be logged on your trail.
       * In this release, the list can be empty (disables the filter), or it can filter out AWS Key
       * Management Service or Amazon RDS Data API events by containing `kms.amazonaws.com` or
       * `rdsdata.amazonaws.com` . By default, `ExcludeManagementEventSources` is empty, and AWS KMS
       * and Amazon RDS Data API events are logged to your trail. You can exclude management event
       * sources only in Regions that support the event source.
       */
      public fun excludeManagementEventSources(vararg excludeManagementEventSources: String)

      /**
       * @param includeManagementEvents Specify if you want your event selector to include
       * management events for your trail.
       * For more information, see [Management
       * Events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-events-with-cloudtrail.html)
       * in the *AWS CloudTrail User Guide* .
       *
       * By default, the value is `true` .
       *
       * The first copy of management events is free. You are charged for additional copies of
       * management events that you are logging on any subsequent trail in the same Region. For more
       * information about CloudTrail pricing, see [AWS CloudTrail
       * Pricing](https://docs.aws.amazon.com/cloudtrail/pricing/) .
       */
      public fun includeManagementEvents(includeManagementEvents: Boolean)

      /**
       * @param includeManagementEvents Specify if you want your event selector to include
       * management events for your trail.
       * For more information, see [Management
       * Events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-events-with-cloudtrail.html)
       * in the *AWS CloudTrail User Guide* .
       *
       * By default, the value is `true` .
       *
       * The first copy of management events is free. You are charged for additional copies of
       * management events that you are logging on any subsequent trail in the same Region. For more
       * information about CloudTrail pricing, see [AWS CloudTrail
       * Pricing](https://docs.aws.amazon.com/cloudtrail/pricing/) .
       */
      public fun includeManagementEvents(includeManagementEvents: IResolvable)

      /**
       * @param readWriteType Specify if you want your trail to log read-only events, write-only
       * events, or all.
       * For example, the EC2 `GetConsoleOutput` is a read-only API operation and `RunInstances` is
       * a write-only API operation.
       *
       * By default, the value is `All` .
       */
      public fun readWriteType(readWriteType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudtrail.CfnTrail.EventSelectorProperty.Builder =
          software.amazon.awscdk.services.cloudtrail.CfnTrail.EventSelectorProperty.builder()

      /**
       * @param dataResources CloudTrail supports data event logging for Amazon S3 objects, AWS
       * Lambda functions, and Amazon DynamoDB tables with basic event selectors.
       * You can specify up to 250 resources for an individual event selector, but the total number
       * of data resources cannot exceed 250 across all event selectors in a trail. This limit does not
       * apply if you configure resource logging for all data events.
       *
       * For more information, see [Data
       * Events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
       * and [Limits in AWS
       * CloudTrail](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html)
       * in the *AWS CloudTrail User Guide* .
       */
      override fun dataResources(dataResources: IResolvable) {
        cdkBuilder.dataResources(dataResources.let(IResolvable::unwrap))
      }

      /**
       * @param dataResources CloudTrail supports data event logging for Amazon S3 objects, AWS
       * Lambda functions, and Amazon DynamoDB tables with basic event selectors.
       * You can specify up to 250 resources for an individual event selector, but the total number
       * of data resources cannot exceed 250 across all event selectors in a trail. This limit does not
       * apply if you configure resource logging for all data events.
       *
       * For more information, see [Data
       * Events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
       * and [Limits in AWS
       * CloudTrail](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html)
       * in the *AWS CloudTrail User Guide* .
       */
      override fun dataResources(dataResources: List<Any>) {
        cdkBuilder.dataResources(dataResources.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param dataResources CloudTrail supports data event logging for Amazon S3 objects, AWS
       * Lambda functions, and Amazon DynamoDB tables with basic event selectors.
       * You can specify up to 250 resources for an individual event selector, but the total number
       * of data resources cannot exceed 250 across all event selectors in a trail. This limit does not
       * apply if you configure resource logging for all data events.
       *
       * For more information, see [Data
       * Events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
       * and [Limits in AWS
       * CloudTrail](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html)
       * in the *AWS CloudTrail User Guide* .
       */
      override fun dataResources(vararg dataResources: Any): Unit =
          dataResources(dataResources.toList())

      /**
       * @param excludeManagementEventSources An optional list of service event sources from which
       * you do not want management events to be logged on your trail.
       * In this release, the list can be empty (disables the filter), or it can filter out AWS Key
       * Management Service or Amazon RDS Data API events by containing `kms.amazonaws.com` or
       * `rdsdata.amazonaws.com` . By default, `ExcludeManagementEventSources` is empty, and AWS KMS
       * and Amazon RDS Data API events are logged to your trail. You can exclude management event
       * sources only in Regions that support the event source.
       */
      override fun excludeManagementEventSources(excludeManagementEventSources: List<String>) {
        cdkBuilder.excludeManagementEventSources(excludeManagementEventSources)
      }

      /**
       * @param excludeManagementEventSources An optional list of service event sources from which
       * you do not want management events to be logged on your trail.
       * In this release, the list can be empty (disables the filter), or it can filter out AWS Key
       * Management Service or Amazon RDS Data API events by containing `kms.amazonaws.com` or
       * `rdsdata.amazonaws.com` . By default, `ExcludeManagementEventSources` is empty, and AWS KMS
       * and Amazon RDS Data API events are logged to your trail. You can exclude management event
       * sources only in Regions that support the event source.
       */
      override fun excludeManagementEventSources(vararg excludeManagementEventSources: String): Unit
          = excludeManagementEventSources(excludeManagementEventSources.toList())

      /**
       * @param includeManagementEvents Specify if you want your event selector to include
       * management events for your trail.
       * For more information, see [Management
       * Events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-events-with-cloudtrail.html)
       * in the *AWS CloudTrail User Guide* .
       *
       * By default, the value is `true` .
       *
       * The first copy of management events is free. You are charged for additional copies of
       * management events that you are logging on any subsequent trail in the same Region. For more
       * information about CloudTrail pricing, see [AWS CloudTrail
       * Pricing](https://docs.aws.amazon.com/cloudtrail/pricing/) .
       */
      override fun includeManagementEvents(includeManagementEvents: Boolean) {
        cdkBuilder.includeManagementEvents(includeManagementEvents)
      }

      /**
       * @param includeManagementEvents Specify if you want your event selector to include
       * management events for your trail.
       * For more information, see [Management
       * Events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-events-with-cloudtrail.html)
       * in the *AWS CloudTrail User Guide* .
       *
       * By default, the value is `true` .
       *
       * The first copy of management events is free. You are charged for additional copies of
       * management events that you are logging on any subsequent trail in the same Region. For more
       * information about CloudTrail pricing, see [AWS CloudTrail
       * Pricing](https://docs.aws.amazon.com/cloudtrail/pricing/) .
       */
      override fun includeManagementEvents(includeManagementEvents: IResolvable) {
        cdkBuilder.includeManagementEvents(includeManagementEvents.let(IResolvable::unwrap))
      }

      /**
       * @param readWriteType Specify if you want your trail to log read-only events, write-only
       * events, or all.
       * For example, the EC2 `GetConsoleOutput` is a read-only API operation and `RunInstances` is
       * a write-only API operation.
       *
       * By default, the value is `All` .
       */
      override fun readWriteType(readWriteType: String) {
        cdkBuilder.readWriteType(readWriteType)
      }

      public fun build(): software.amazon.awscdk.services.cloudtrail.CfnTrail.EventSelectorProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudtrail.CfnTrail.EventSelectorProperty,
    ) : CdkObject(cdkObject), EventSelectorProperty {
      /**
       * CloudTrail supports data event logging for Amazon S3 objects, AWS Lambda functions, and
       * Amazon DynamoDB tables with basic event selectors.
       *
       * You can specify up to 250 resources for an individual event selector, but the total number
       * of data resources cannot exceed 250 across all event selectors in a trail. This limit does not
       * apply if you configure resource logging for all data events.
       *
       * For more information, see [Data
       * Events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
       * and [Limits in AWS
       * CloudTrail](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html)
       * in the *AWS CloudTrail User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-dataresources)
       */
      override fun dataResources(): Any? = unwrap(this).getDataResources()

      /**
       * An optional list of service event sources from which you do not want management events to
       * be logged on your trail.
       *
       * In this release, the list can be empty (disables the filter), or it can filter out AWS Key
       * Management Service or Amazon RDS Data API events by containing `kms.amazonaws.com` or
       * `rdsdata.amazonaws.com` . By default, `ExcludeManagementEventSources` is empty, and AWS KMS
       * and Amazon RDS Data API events are logged to your trail. You can exclude management event
       * sources only in Regions that support the event source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-excludemanagementeventsources)
       */
      override fun excludeManagementEventSources(): List<String> =
          unwrap(this).getExcludeManagementEventSources() ?: emptyList()

      /**
       * Specify if you want your event selector to include management events for your trail.
       *
       * For more information, see [Management
       * Events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-events-with-cloudtrail.html)
       * in the *AWS CloudTrail User Guide* .
       *
       * By default, the value is `true` .
       *
       * The first copy of management events is free. You are charged for additional copies of
       * management events that you are logging on any subsequent trail in the same Region. For more
       * information about CloudTrail pricing, see [AWS CloudTrail
       * Pricing](https://docs.aws.amazon.com/cloudtrail/pricing/) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-includemanagementevents)
       */
      override fun includeManagementEvents(): Any? = unwrap(this).getIncludeManagementEvents()

      /**
       * Specify if you want your trail to log read-only events, write-only events, or all.
       *
       * For example, the EC2 `GetConsoleOutput` is a read-only API operation and `RunInstances` is
       * a write-only API operation.
       *
       * By default, the value is `All` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-readwritetype)
       */
      override fun readWriteType(): String? = unwrap(this).getReadWriteType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EventSelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnTrail.EventSelectorProperty):
          EventSelectorProperty = CdkObjectWrappers.wrap(cdkObject) as? EventSelectorProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventSelectorProperty):
          software.amazon.awscdk.services.cloudtrail.CfnTrail.EventSelectorProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudtrail.CfnTrail.EventSelectorProperty
    }
  }

  /**
   * A JSON string that contains a list of Insights types that are logged on a trail.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudtrail.*;
   * InsightSelectorProperty insightSelectorProperty = InsightSelectorProperty.builder()
   * .insightType("insightType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-insightselector.html)
   */
  public interface InsightSelectorProperty {
    /**
     * The type of Insights events to log on a trail. `ApiCallRateInsight` and `ApiErrorRateInsight`
     * are valid Insight types.
     *
     * The `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
     * aggregated per minute against a baseline API call volume.
     *
     * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
     * codes. The error is shown if the API call is unsuccessful.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-insightselector.html#cfn-cloudtrail-trail-insightselector-insighttype)
     */
    public fun insightType(): String? = unwrap(this).getInsightType()

    /**
     * A builder for [InsightSelectorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param insightType The type of Insights events to log on a trail. `ApiCallRateInsight` and
       * `ApiErrorRateInsight` are valid Insight types.
       * The `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
       * aggregated per minute against a baseline API call volume.
       *
       * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
       * codes. The error is shown if the API call is unsuccessful.
       */
      public fun insightType(insightType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudtrail.CfnTrail.InsightSelectorProperty.Builder =
          software.amazon.awscdk.services.cloudtrail.CfnTrail.InsightSelectorProperty.builder()

      /**
       * @param insightType The type of Insights events to log on a trail. `ApiCallRateInsight` and
       * `ApiErrorRateInsight` are valid Insight types.
       * The `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
       * aggregated per minute against a baseline API call volume.
       *
       * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
       * codes. The error is shown if the API call is unsuccessful.
       */
      override fun insightType(insightType: String) {
        cdkBuilder.insightType(insightType)
      }

      public fun build():
          software.amazon.awscdk.services.cloudtrail.CfnTrail.InsightSelectorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudtrail.CfnTrail.InsightSelectorProperty,
    ) : CdkObject(cdkObject), InsightSelectorProperty {
      /**
       * The type of Insights events to log on a trail. `ApiCallRateInsight` and
       * `ApiErrorRateInsight` are valid Insight types.
       *
       * The `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
       * aggregated per minute against a baseline API call volume.
       *
       * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
       * codes. The error is shown if the API call is unsuccessful.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-insightselector.html#cfn-cloudtrail-trail-insightselector-insighttype)
       */
      override fun insightType(): String? = unwrap(this).getInsightType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InsightSelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnTrail.InsightSelectorProperty):
          InsightSelectorProperty = CdkObjectWrappers.wrap(cdkObject) as? InsightSelectorProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: InsightSelectorProperty):
          software.amazon.awscdk.services.cloudtrail.CfnTrail.InsightSelectorProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudtrail.CfnTrail.InsightSelectorProperty
    }
  }
}
