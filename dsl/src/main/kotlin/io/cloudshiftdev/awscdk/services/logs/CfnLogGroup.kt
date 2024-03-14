package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLogGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.logs.CfnLogGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ARN of the log group, such as
   * `arn:aws:logs:us-west-1:123456789012:log-group:/mystack-testgroup-12ABC1AB12A1:*`.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Creates a data protection policy and assigns it to the log group.
   */
  public open fun dataProtectionPolicy(): Any? = unwrap(this).getDataProtectionPolicy()

  /**
   * Creates a data protection policy and assigns it to the log group.
   */
  public open fun dataProtectionPolicy(`value`: Any) {
    unwrap(this).setDataProtectionPolicy(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the AWS KMS key to use when encrypting log data.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The Amazon Resource Name (ARN) of the AWS KMS key to use when encrypting log data.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * Specifies the log group class for this log group.
   *
   * There are two classes:.
   */
  public open fun logGroupClass(): String? = unwrap(this).getLogGroupClass()

  /**
   * Specifies the log group class for this log group.
   *
   * There are two classes:.
   */
  public open fun logGroupClass(`value`: String) {
    unwrap(this).setLogGroupClass(`value`)
  }

  /**
   * The name of the log group.
   */
  public open fun logGroupName(): String? = unwrap(this).getLogGroupName()

  /**
   * The name of the log group.
   */
  public open fun logGroupName(`value`: String) {
    unwrap(this).setLogGroupName(`value`)
  }

  /**
   * The number of days to retain the log events in the specified log group.
   */
  public open fun retentionInDays(): Number? = unwrap(this).getRetentionInDays()

  /**
   * The number of days to retain the log events in the specified log group.
   */
  public open fun retentionInDays(`value`: Number) {
    unwrap(this).setRetentionInDays(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to the log group.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to the log group.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to the log group.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.CfnLogGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Creates a data protection policy and assigns it to the log group.
     *
     * A data protection policy can help safeguard sensitive data that's ingested by the log group
     * by auditing and masking the sensitive log data. When a user who does not have permission to view
     * masked data views a log event that includes masked data, the sensitive data is replaced by
     * asterisks.
     *
     * For more information, including a list of types of data that can be audited and masked, see
     * [Protect sensitive log data with
     * masking](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-logs-loggroup-dataprotectionpolicy)
     * @param dataProtectionPolicy Creates a data protection policy and assigns it to the log group.
     * 
     */
    public fun dataProtectionPolicy(dataProtectionPolicy: Any)

    /**
     * The Amazon Resource Name (ARN) of the AWS KMS key to use when encrypting log data.
     *
     * To associate an AWS KMS key with the log group, specify the ARN of that KMS key here. If you
     * do so, ingested data is encrypted using this key. This association is stored as long as the data
     * encrypted with the KMS key is still within CloudWatch Logs . This enables CloudWatch Logs to
     * decrypt this data whenever it is requested.
     *
     * If you attempt to associate a KMS key with the log group but the KMS key doesn't exist or is
     * deactivated, you will receive an `InvalidParameterException` error.
     *
     * Log group data is always encrypted in CloudWatch Logs . If you omit this key, the encryption
     * does not use AWS KMS . For more information, see [Encrypt log data in CloudWatch Logs using AWS
     * Key Management
     * Service](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/encrypt-log-data-kms.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-logs-loggroup-kmskeyid)
     * @param kmsKeyId The Amazon Resource Name (ARN) of the AWS KMS key to use when encrypting log
     * data. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * Specifies the log group class for this log group. There are two classes:.
     *
     * * The `Standard` log class supports all CloudWatch Logs features.
     * * The `Infrequent Access` log class supports a subset of CloudWatch Logs features and incurs
     * lower costs.
     *
     * For details about the features supported by each class, see [Log
     * classes](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch_Logs_Log_Classes.html)
     *
     * Default: - "STANDARD"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-logs-loggroup-loggroupclass)
     * @param logGroupClass Specifies the log group class for this log group. There are two
     * classes:. 
     */
    public fun logGroupClass(logGroupClass: String)

    /**
     * The name of the log group.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique ID for the log group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-logs-loggroup-loggroupname)
     * @param logGroupName The name of the log group. 
     */
    public fun logGroupName(logGroupName: String)

    /**
     * The number of days to retain the log events in the specified log group.
     *
     * Possible values are: 1, 3, 5, 7, 14, 30, 60, 90, 120, 150, 180, 365, 400, 545, 731, 1096,
     * 1827, 2192, 2557, 2922, 3288, and 3653.
     *
     * To set a log group so that its log events do not expire, use
     * [DeleteRetentionPolicy](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DeleteRetentionPolicy.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-logs-loggroup-retentionindays)
     * @param retentionInDays The number of days to retain the log events in the specified log
     * group. 
     */
    public fun retentionInDays(retentionInDays: Number)

    /**
     * An array of key-value pairs to apply to the log group.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-logs-loggroup-tags)
     * @param tags An array of key-value pairs to apply to the log group. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to the log group.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-logs-loggroup-tags)
     * @param tags An array of key-value pairs to apply to the log group. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnLogGroup.Builder =
        software.amazon.awscdk.services.logs.CfnLogGroup.Builder.create(scope, id)

    /**
     * Creates a data protection policy and assigns it to the log group.
     *
     * A data protection policy can help safeguard sensitive data that's ingested by the log group
     * by auditing and masking the sensitive log data. When a user who does not have permission to view
     * masked data views a log event that includes masked data, the sensitive data is replaced by
     * asterisks.
     *
     * For more information, including a list of types of data that can be audited and masked, see
     * [Protect sensitive log data with
     * masking](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-logs-loggroup-dataprotectionpolicy)
     * @param dataProtectionPolicy Creates a data protection policy and assigns it to the log group.
     * 
     */
    override fun dataProtectionPolicy(dataProtectionPolicy: Any) {
      cdkBuilder.dataProtectionPolicy(dataProtectionPolicy)
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS KMS key to use when encrypting log data.
     *
     * To associate an AWS KMS key with the log group, specify the ARN of that KMS key here. If you
     * do so, ingested data is encrypted using this key. This association is stored as long as the data
     * encrypted with the KMS key is still within CloudWatch Logs . This enables CloudWatch Logs to
     * decrypt this data whenever it is requested.
     *
     * If you attempt to associate a KMS key with the log group but the KMS key doesn't exist or is
     * deactivated, you will receive an `InvalidParameterException` error.
     *
     * Log group data is always encrypted in CloudWatch Logs . If you omit this key, the encryption
     * does not use AWS KMS . For more information, see [Encrypt log data in CloudWatch Logs using AWS
     * Key Management
     * Service](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/encrypt-log-data-kms.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-logs-loggroup-kmskeyid)
     * @param kmsKeyId The Amazon Resource Name (ARN) of the AWS KMS key to use when encrypting log
     * data. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * Specifies the log group class for this log group. There are two classes:.
     *
     * * The `Standard` log class supports all CloudWatch Logs features.
     * * The `Infrequent Access` log class supports a subset of CloudWatch Logs features and incurs
     * lower costs.
     *
     * For details about the features supported by each class, see [Log
     * classes](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch_Logs_Log_Classes.html)
     *
     * Default: - "STANDARD"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-logs-loggroup-loggroupclass)
     * @param logGroupClass Specifies the log group class for this log group. There are two
     * classes:. 
     */
    override fun logGroupClass(logGroupClass: String) {
      cdkBuilder.logGroupClass(logGroupClass)
    }

    /**
     * The name of the log group.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique ID for the log group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-logs-loggroup-loggroupname)
     * @param logGroupName The name of the log group. 
     */
    override fun logGroupName(logGroupName: String) {
      cdkBuilder.logGroupName(logGroupName)
    }

    /**
     * The number of days to retain the log events in the specified log group.
     *
     * Possible values are: 1, 3, 5, 7, 14, 30, 60, 90, 120, 150, 180, 365, 400, 545, 731, 1096,
     * 1827, 2192, 2557, 2922, 3288, and 3653.
     *
     * To set a log group so that its log events do not expire, use
     * [DeleteRetentionPolicy](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DeleteRetentionPolicy.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-logs-loggroup-retentionindays)
     * @param retentionInDays The number of days to retain the log events in the specified log
     * group. 
     */
    override fun retentionInDays(retentionInDays: Number) {
      cdkBuilder.retentionInDays(retentionInDays)
    }

    /**
     * An array of key-value pairs to apply to the log group.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-logs-loggroup-tags)
     * @param tags An array of key-value pairs to apply to the log group. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to the log group.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-logs-loggroup-tags)
     * @param tags An array of key-value pairs to apply to the log group. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.logs.CfnLogGroup = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.logs.CfnLogGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLogGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLogGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnLogGroup): CfnLogGroup =
        CfnLogGroup(cdkObject)

    internal fun unwrap(wrapped: CfnLogGroup): software.amazon.awscdk.services.logs.CfnLogGroup =
        wrapped.cdkObject
  }
}
