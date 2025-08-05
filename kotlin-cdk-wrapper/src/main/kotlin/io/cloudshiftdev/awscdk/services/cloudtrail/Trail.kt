@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudtrail

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Cloud trail allows you to log events that happen in your AWS account For example:.
 *
 * import { CloudTrail } from 'aws-cdk-lib/aws-cloudtrail'
 *
 * const cloudTrail = new CloudTrail(this, 'MyTrail');
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.cloudtrail.*;
 * IAlias myKeyAlias = Alias.fromAliasName(this, "myKey", "alias/aws/s3");
 * Trail trail = Trail.Builder.create(this, "myCloudTrail")
 * .sendToCloudWatchLogs(true)
 * .encryptionKey(myKeyAlias)
 * .build();
 * ```
 */
public open class Trail(
  cdkObject: software.amazon.awscdk.services.cloudtrail.Trail,
) : Resource(cdkObject) {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.cloudtrail.Trail(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: TrailProps,
  ) :
      this(software.amazon.awscdk.services.cloudtrail.Trail(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(TrailProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: TrailProps.Builder.() -> Unit,
  ) : this(scope, id, TrailProps(props)
  )

  /**
   * When an event occurs in your account, CloudTrail evaluates whether the event matches the
   * settings for your trails.
   *
   * Only events that match your trail settings are delivered to your Amazon S3 bucket and Amazon
   * CloudWatch Logs log group.
   *
   * This method adds an Event Selector for filtering events that match either S3 or Lambda function
   * operations.
   *
   * Data events: These events provide insight into the resource operations performed on or within a
   * resource.
   * These are also known as data plane operations.
   *
   * @param dataResourceType 
   * @param dataResourceValues the list of data resource ARNs to include in logging (maximum 250
   * entries). 
   * @param options the options to configure logging of management and data events.
   */
  public open fun addEventSelector(dataResourceType: DataResourceType,
      dataResourceValues: List<String>) {
    unwrap(this).addEventSelector(dataResourceType.let(DataResourceType.Companion::unwrap),
        dataResourceValues)
  }

  /**
   * When an event occurs in your account, CloudTrail evaluates whether the event matches the
   * settings for your trails.
   *
   * Only events that match your trail settings are delivered to your Amazon S3 bucket and Amazon
   * CloudWatch Logs log group.
   *
   * This method adds an Event Selector for filtering events that match either S3 or Lambda function
   * operations.
   *
   * Data events: These events provide insight into the resource operations performed on or within a
   * resource.
   * These are also known as data plane operations.
   *
   * @param dataResourceType 
   * @param dataResourceValues the list of data resource ARNs to include in logging (maximum 250
   * entries). 
   * @param options the options to configure logging of management and data events.
   */
  public open fun addEventSelector(
    dataResourceType: DataResourceType,
    dataResourceValues: List<String>,
    options: AddEventSelectorOptions,
  ) {
    unwrap(this).addEventSelector(dataResourceType.let(DataResourceType.Companion::unwrap),
        dataResourceValues, options.let(AddEventSelectorOptions.Companion::unwrap))
  }

  /**
   * When an event occurs in your account, CloudTrail evaluates whether the event matches the
   * settings for your trails.
   *
   * Only events that match your trail settings are delivered to your Amazon S3 bucket and Amazon
   * CloudWatch Logs log group.
   *
   * This method adds an Event Selector for filtering events that match either S3 or Lambda function
   * operations.
   *
   * Data events: These events provide insight into the resource operations performed on or within a
   * resource.
   * These are also known as data plane operations.
   *
   * @param dataResourceType 
   * @param dataResourceValues the list of data resource ARNs to include in logging (maximum 250
   * entries). 
   * @param options the options to configure logging of management and data events.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2b2360e8940baec24631882984976d9d6cccc814b06ab02d83903f2a5cfee17b")
  public open fun addEventSelector(
    dataResourceType: DataResourceType,
    dataResourceValues: List<String>,
    options: AddEventSelectorOptions.Builder.() -> Unit,
  ): Unit = addEventSelector(dataResourceType, dataResourceValues, AddEventSelectorOptions(options))

  /**
   * When an event occurs in your account, CloudTrail evaluates whether the event matches the
   * settings for your trails.
   *
   * Only events that match your trail settings are delivered to your Amazon S3 bucket and Amazon
   * CloudWatch Logs log group.
   *
   * This method adds a Lambda Data Event Selector for filtering events that match Lambda function
   * operations.
   *
   * Data events: These events provide insight into the resource operations performed on or within a
   * resource.
   * These are also known as data plane operations.
   *
   * @param handlers the list of lambda function handlers whose data events should be logged
   * (maximum 250 entries). 
   * @param options the options to configure logging of management and data events.
   */
  public open fun addLambdaEventSelector(handlers: List<IFunction>) {
    unwrap(this).addLambdaEventSelector(handlers.map(IFunction.Companion::unwrap))
  }

  /**
   * When an event occurs in your account, CloudTrail evaluates whether the event matches the
   * settings for your trails.
   *
   * Only events that match your trail settings are delivered to your Amazon S3 bucket and Amazon
   * CloudWatch Logs log group.
   *
   * This method adds a Lambda Data Event Selector for filtering events that match Lambda function
   * operations.
   *
   * Data events: These events provide insight into the resource operations performed on or within a
   * resource.
   * These are also known as data plane operations.
   *
   * @param handlers the list of lambda function handlers whose data events should be logged
   * (maximum 250 entries). 
   * @param options the options to configure logging of management and data events.
   */
  public open fun addLambdaEventSelector(vararg handlers: IFunction): Unit =
      addLambdaEventSelector(handlers.toList())

  /**
   * When an event occurs in your account, CloudTrail evaluates whether the event matches the
   * settings for your trails.
   *
   * Only events that match your trail settings are delivered to your Amazon S3 bucket and Amazon
   * CloudWatch Logs log group.
   *
   * This method adds a Lambda Data Event Selector for filtering events that match Lambda function
   * operations.
   *
   * Data events: These events provide insight into the resource operations performed on or within a
   * resource.
   * These are also known as data plane operations.
   *
   * @param handlers the list of lambda function handlers whose data events should be logged
   * (maximum 250 entries). 
   * @param options the options to configure logging of management and data events.
   */
  public open fun addLambdaEventSelector(handlers: List<IFunction>,
      options: AddEventSelectorOptions) {
    unwrap(this).addLambdaEventSelector(handlers.map(IFunction.Companion::unwrap),
        options.let(AddEventSelectorOptions.Companion::unwrap))
  }

  /**
   * When an event occurs in your account, CloudTrail evaluates whether the event matches the
   * settings for your trails.
   *
   * Only events that match your trail settings are delivered to your Amazon S3 bucket and Amazon
   * CloudWatch Logs log group.
   *
   * This method adds a Lambda Data Event Selector for filtering events that match Lambda function
   * operations.
   *
   * Data events: These events provide insight into the resource operations performed on or within a
   * resource.
   * These are also known as data plane operations.
   *
   * @param handlers the list of lambda function handlers whose data events should be logged
   * (maximum 250 entries). 
   * @param options the options to configure logging of management and data events.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("380e761b9da529f96dc712776c5250adc98a2176dfc4bcb784336f670830d05b")
  public open fun addLambdaEventSelector(handlers: List<IFunction>,
      options: AddEventSelectorOptions.Builder.() -> Unit): Unit = addLambdaEventSelector(handlers,
      AddEventSelectorOptions(options))

  /**
   * When an event occurs in your account, CloudTrail evaluates whether the event matches the
   * settings for your trails.
   *
   * Only events that match your trail settings are delivered to your Amazon S3 bucket and Amazon
   * CloudWatch Logs log group.
   *
   * This method adds an S3 Data Event Selector for filtering events that match S3 operations.
   *
   * Data events: These events provide insight into the resource operations performed on or within a
   * resource.
   * These are also known as data plane operations.
   *
   * @param s3Selector the list of S3 bucket with optional prefix to include in logging (maximum 250
   * entries). 
   * @param options the options to configure logging of management and data events.
   */
  public open fun addS3EventSelector(s3Selector: List<S3EventSelector>) {
    unwrap(this).addS3EventSelector(s3Selector.map(S3EventSelector.Companion::unwrap))
  }

  /**
   * When an event occurs in your account, CloudTrail evaluates whether the event matches the
   * settings for your trails.
   *
   * Only events that match your trail settings are delivered to your Amazon S3 bucket and Amazon
   * CloudWatch Logs log group.
   *
   * This method adds an S3 Data Event Selector for filtering events that match S3 operations.
   *
   * Data events: These events provide insight into the resource operations performed on or within a
   * resource.
   * These are also known as data plane operations.
   *
   * @param s3Selector the list of S3 bucket with optional prefix to include in logging (maximum 250
   * entries). 
   * @param options the options to configure logging of management and data events.
   */
  public open fun addS3EventSelector(vararg s3Selector: S3EventSelector): Unit =
      addS3EventSelector(s3Selector.toList())

  /**
   * When an event occurs in your account, CloudTrail evaluates whether the event matches the
   * settings for your trails.
   *
   * Only events that match your trail settings are delivered to your Amazon S3 bucket and Amazon
   * CloudWatch Logs log group.
   *
   * This method adds an S3 Data Event Selector for filtering events that match S3 operations.
   *
   * Data events: These events provide insight into the resource operations performed on or within a
   * resource.
   * These are also known as data plane operations.
   *
   * @param s3Selector the list of S3 bucket with optional prefix to include in logging (maximum 250
   * entries). 
   * @param options the options to configure logging of management and data events.
   */
  public open fun addS3EventSelector(s3Selector: List<S3EventSelector>,
      options: AddEventSelectorOptions) {
    unwrap(this).addS3EventSelector(s3Selector.map(S3EventSelector.Companion::unwrap),
        options.let(AddEventSelectorOptions.Companion::unwrap))
  }

  /**
   * When an event occurs in your account, CloudTrail evaluates whether the event matches the
   * settings for your trails.
   *
   * Only events that match your trail settings are delivered to your Amazon S3 bucket and Amazon
   * CloudWatch Logs log group.
   *
   * This method adds an S3 Data Event Selector for filtering events that match S3 operations.
   *
   * Data events: These events provide insight into the resource operations performed on or within a
   * resource.
   * These are also known as data plane operations.
   *
   * @param s3Selector the list of S3 bucket with optional prefix to include in logging (maximum 250
   * entries). 
   * @param options the options to configure logging of management and data events.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a701d19f8f0d34b897008ae8171379131f043284f8d5ad44572f24e8dc04087a")
  public open fun addS3EventSelector(s3Selector: List<S3EventSelector>,
      options: AddEventSelectorOptions.Builder.() -> Unit): Unit = addS3EventSelector(s3Selector,
      AddEventSelectorOptions(options))

  /**
   * Log all Lambda data events for all lambda functions the account.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
   * @param options
   */
  public open fun logAllLambdaDataEvents() {
    unwrap(this).logAllLambdaDataEvents()
  }

  /**
   * Log all Lambda data events for all lambda functions the account.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
   * @param options
   */
  public open fun logAllLambdaDataEvents(options: AddEventSelectorOptions) {
    unwrap(this).logAllLambdaDataEvents(options.let(AddEventSelectorOptions.Companion::unwrap))
  }

  /**
   * Log all Lambda data events for all lambda functions the account.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7aaef5ada943f4116a70bac6cad3c339f1128c6317b40a85466c566db9a731eb")
  public open fun logAllLambdaDataEvents(options: AddEventSelectorOptions.Builder.() -> Unit): Unit
      = logAllLambdaDataEvents(AddEventSelectorOptions(options))

  /**
   * Log all S3 data events for all objects for all buckets in the account.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
   * @param options
   */
  public open fun logAllS3DataEvents() {
    unwrap(this).logAllS3DataEvents()
  }

  /**
   * Log all S3 data events for all objects for all buckets in the account.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
   * @param options
   */
  public open fun logAllS3DataEvents(options: AddEventSelectorOptions) {
    unwrap(this).logAllS3DataEvents(options.let(AddEventSelectorOptions.Companion::unwrap))
  }

  /**
   * Log all S3 data events for all objects for all buckets in the account.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a8855c379fe8d829f4650c449d7f82c34650323bf2a7d84530dc45a14b861b5a")
  public open fun logAllS3DataEvents(options: AddEventSelectorOptions.Builder.() -> Unit): Unit =
      logAllS3DataEvents(AddEventSelectorOptions(options))

  /**
   * The CloudWatch log group to which CloudTrail events are sent.
   *
   * `undefined` if `sendToCloudWatchLogs` property is false.
   */
  public open fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

  /**
   * ARN of the CloudTrail trail i.e. arn:aws:cloudtrail:us-east-2:123456789012:trail/myCloudTrail.
   */
  public open fun trailArn(): String = unwrap(this).getTrailArn()

  /**
   * ARN of the Amazon SNS topic that's associated with the CloudTrail trail, i.e.
   * arn:aws:sns:us-east-2:123456789012:mySNSTopic.
   */
  public open fun trailSnsTopicArn(): String = unwrap(this).getTrailSnsTopicArn()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudtrail.Trail].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon S3 bucket.
     *
     * Default: - if not supplied a bucket will be created with all the correct permisions
     *
     * @param bucket The Amazon S3 bucket. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * Log Group to which CloudTrail to push logs to.
     *
     * Ignored if sendToCloudWatchLogs is set to false.
     *
     * Default: - a new log group is created and used.
     *
     * @param cloudWatchLogGroup Log Group to which CloudTrail to push logs to. 
     */
    public fun cloudWatchLogGroup(cloudWatchLogGroup: ILogGroup)

    /**
     * How long to retain logs in CloudWatchLogs.
     *
     * Ignored if sendToCloudWatchLogs is false or if cloudWatchLogGroup is set.
     *
     * Default: logs.RetentionDays.ONE_YEAR
     *
     * @param cloudWatchLogsRetention How long to retain logs in CloudWatchLogs. 
     */
    public fun cloudWatchLogsRetention(cloudWatchLogsRetention: RetentionDays)

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
     *
     * @param enableFileValidation To determine whether a log file was modified, deleted, or
     * unchanged after CloudTrail delivered it, you can use CloudTrail log file integrity validation. 
     */
    public fun enableFileValidation(enableFileValidation: Boolean)

    /**
     * The AWS Key Management Service (AWS KMS) key ID that you want to use to encrypt CloudTrail
     * logs.
     *
     * Default: - No encryption.
     *
     * @param encryptionKey The AWS Key Management Service (AWS KMS) key ID that you want to use to
     * encrypt CloudTrail logs. 
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * For most services, events are recorded in the region where the action occurred.
     *
     * For global services such as AWS Identity and Access Management (IAM), AWS STS, Amazon
     * CloudFront, and Route 53,
     * events are delivered to any trail that includes global services, and are logged as occurring
     * in US East (N. Virginia) Region.
     *
     * Default: true
     *
     * @param includeGlobalServiceEvents For most services, events are recorded in the region where
     * the action occurred. 
     */
    public fun includeGlobalServiceEvents(includeGlobalServiceEvents: Boolean)

    /**
     * A JSON string that contains the insight types you want to log on a trail.
     *
     * Default: - No Value.
     *
     * @param insightTypes A JSON string that contains the insight types you want to log on a trail.
     * 
     */
    public fun insightTypes(insightTypes: List<InsightType>)

    /**
     * A JSON string that contains the insight types you want to log on a trail.
     *
     * Default: - No Value.
     *
     * @param insightTypes A JSON string that contains the insight types you want to log on a trail.
     * 
     */
    public fun insightTypes(vararg insightTypes: InsightType)

    /**
     * Whether or not this trail delivers log files from multiple regions to a single S3 bucket for
     * a single account.
     *
     * Default: true
     *
     * @param isMultiRegionTrail Whether or not this trail delivers log files from multiple regions
     * to a single S3 bucket for a single account. 
     */
    public fun isMultiRegionTrail(isMultiRegionTrail: Boolean)

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
     *
     * @param isOrganizationTrail Specifies whether the trail is applied to all accounts in an
     * organization in AWS Organizations, or only for the current AWS account. 
     */
    public fun isOrganizationTrail(isOrganizationTrail: Boolean)

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
     *
     * @param managementEvents When an event occurs in your account, CloudTrail evaluates whether
     * the event matches the settings for your trails. 
     */
    public fun managementEvents(managementEvents: ReadWriteType)

    /**
     * The orgId.
     *
     * Required when `isOrganizationTrail` is set to true to attach the necessary permissions.
     *
     * Default: - No orgId
     *
     * @param orgId The orgId. 
     */
    public fun orgId(orgId: String)

    /**
     * An Amazon S3 object key prefix that precedes the name of all log files.
     *
     * Default: - No prefix.
     *
     * @param s3KeyPrefix An Amazon S3 object key prefix that precedes the name of all log files. 
     */
    public fun s3KeyPrefix(s3KeyPrefix: String)

    /**
     * If CloudTrail pushes logs to CloudWatch Logs in addition to S3.
     *
     * Disabled for cost out of the box.
     *
     * Default: false
     *
     * @param sendToCloudWatchLogs If CloudTrail pushes logs to CloudWatch Logs in addition to S3. 
     */
    public fun sendToCloudWatchLogs(sendToCloudWatchLogs: Boolean)

    /**
     * SNS topic that is notified when new log files are published.
     *
     * Default: - No notifications.
     *
     * @param snsTopic SNS topic that is notified when new log files are published. 
     */
    public fun snsTopic(snsTopic: ITopic)

    /**
     * The name of the trail.
     *
     * We recommend customers do not set an explicit name.
     *
     * Default: - AWS CloudFormation generated name.
     *
     * @param trailName The name of the trail. 
     */
    public fun trailName(trailName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudtrail.Trail.Builder =
        software.amazon.awscdk.services.cloudtrail.Trail.Builder.create(scope, id)

    /**
     * The Amazon S3 bucket.
     *
     * Default: - if not supplied a bucket will be created with all the correct permisions
     *
     * @param bucket The Amazon S3 bucket. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket.Companion::unwrap))
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
    override fun cloudWatchLogGroup(cloudWatchLogGroup: ILogGroup) {
      cdkBuilder.cloudWatchLogGroup(cloudWatchLogGroup.let(ILogGroup.Companion::unwrap))
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
    override fun cloudWatchLogsRetention(cloudWatchLogsRetention: RetentionDays) {
      cdkBuilder.cloudWatchLogsRetention(cloudWatchLogsRetention.let(RetentionDays.Companion::unwrap))
    }

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
     *
     * @param enableFileValidation To determine whether a log file was modified, deleted, or
     * unchanged after CloudTrail delivered it, you can use CloudTrail log file integrity validation. 
     */
    override fun enableFileValidation(enableFileValidation: Boolean) {
      cdkBuilder.enableFileValidation(enableFileValidation)
    }

    /**
     * The AWS Key Management Service (AWS KMS) key ID that you want to use to encrypt CloudTrail
     * logs.
     *
     * Default: - No encryption.
     *
     * @param encryptionKey The AWS Key Management Service (AWS KMS) key ID that you want to use to
     * encrypt CloudTrail logs. 
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey.Companion::unwrap))
    }

    /**
     * For most services, events are recorded in the region where the action occurred.
     *
     * For global services such as AWS Identity and Access Management (IAM), AWS STS, Amazon
     * CloudFront, and Route 53,
     * events are delivered to any trail that includes global services, and are logged as occurring
     * in US East (N. Virginia) Region.
     *
     * Default: true
     *
     * @param includeGlobalServiceEvents For most services, events are recorded in the region where
     * the action occurred. 
     */
    override fun includeGlobalServiceEvents(includeGlobalServiceEvents: Boolean) {
      cdkBuilder.includeGlobalServiceEvents(includeGlobalServiceEvents)
    }

    /**
     * A JSON string that contains the insight types you want to log on a trail.
     *
     * Default: - No Value.
     *
     * @param insightTypes A JSON string that contains the insight types you want to log on a trail.
     * 
     */
    override fun insightTypes(insightTypes: List<InsightType>) {
      cdkBuilder.insightTypes(insightTypes.map(InsightType.Companion::unwrap))
    }

    /**
     * A JSON string that contains the insight types you want to log on a trail.
     *
     * Default: - No Value.
     *
     * @param insightTypes A JSON string that contains the insight types you want to log on a trail.
     * 
     */
    override fun insightTypes(vararg insightTypes: InsightType): Unit =
        insightTypes(insightTypes.toList())

    /**
     * Whether or not this trail delivers log files from multiple regions to a single S3 bucket for
     * a single account.
     *
     * Default: true
     *
     * @param isMultiRegionTrail Whether or not this trail delivers log files from multiple regions
     * to a single S3 bucket for a single account. 
     */
    override fun isMultiRegionTrail(isMultiRegionTrail: Boolean) {
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
     * organization.
     * If this is set to false, the trail will remain in the current AWS account but be deleted from
     * all member accounts in the organization.
     *
     * Default: - false
     *
     * @param isOrganizationTrail Specifies whether the trail is applied to all accounts in an
     * organization in AWS Organizations, or only for the current AWS account. 
     */
    override fun isOrganizationTrail(isOrganizationTrail: Boolean) {
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
     * in your AWS account.
     * These are also known as control plane operations.
     * Management events can also include non-API events that occur in your account.
     * For example, when a user logs in to your account, CloudTrail logs the ConsoleLogin event.
     *
     * Default: ReadWriteType.ALL
     *
     * @param managementEvents When an event occurs in your account, CloudTrail evaluates whether
     * the event matches the settings for your trails. 
     */
    override fun managementEvents(managementEvents: ReadWriteType) {
      cdkBuilder.managementEvents(managementEvents.let(ReadWriteType.Companion::unwrap))
    }

    /**
     * The orgId.
     *
     * Required when `isOrganizationTrail` is set to true to attach the necessary permissions.
     *
     * Default: - No orgId
     *
     * @param orgId The orgId. 
     */
    override fun orgId(orgId: String) {
      cdkBuilder.orgId(orgId)
    }

    /**
     * An Amazon S3 object key prefix that precedes the name of all log files.
     *
     * Default: - No prefix.
     *
     * @param s3KeyPrefix An Amazon S3 object key prefix that precedes the name of all log files. 
     */
    override fun s3KeyPrefix(s3KeyPrefix: String) {
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
    override fun sendToCloudWatchLogs(sendToCloudWatchLogs: Boolean) {
      cdkBuilder.sendToCloudWatchLogs(sendToCloudWatchLogs)
    }

    /**
     * SNS topic that is notified when new log files are published.
     *
     * Default: - No notifications.
     *
     * @param snsTopic SNS topic that is notified when new log files are published. 
     */
    override fun snsTopic(snsTopic: ITopic) {
      cdkBuilder.snsTopic(snsTopic.let(ITopic.Companion::unwrap))
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
    override fun trailName(trailName: String) {
      cdkBuilder.trailName(trailName)
    }

    public fun build(): software.amazon.awscdk.services.cloudtrail.Trail = cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.cloudtrail.Trail.PROPERTY_INJECTION_ID

    public fun onEvent(scope: CloudshiftdevConstructsConstruct, id: String): Rule =
        software.amazon.awscdk.services.cloudtrail.Trail.onEvent(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id).let(Rule::wrap)

    public fun onEvent(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: OnEventOptions,
    ): Rule =
        software.amazon.awscdk.services.cloudtrail.Trail.onEvent(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, options.let(OnEventOptions.Companion::unwrap)).let(Rule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("26c33828bad440bb6093f1c6eb92bb2fa047f5f02f6285543bf3c089a35c49d5")
    public fun onEvent(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: OnEventOptions.Builder.() -> Unit,
    ): Rule = onEvent(scope, id, OnEventOptions(options))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Trail {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Trail(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.Trail): Trail =
        Trail(cdkObject)

    internal fun unwrap(wrapped: Trail): software.amazon.awscdk.services.cloudtrail.Trail =
        wrapped.cdkObject as software.amazon.awscdk.services.cloudtrail.Trail
  }
}
