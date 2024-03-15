@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnLogGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * Object dataProtectionPolicy;
 * CfnLogGroupProps cfnLogGroupProps = CfnLogGroupProps.builder()
 * .dataProtectionPolicy(dataProtectionPolicy)
 * .kmsKeyId("kmsKeyId")
 * .logGroupClass("logGroupClass")
 * .logGroupName("logGroupName")
 * .retentionInDays(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html)
 */
public interface CfnLogGroupProps {
  /**
   * Creates a data protection policy and assigns it to the log group.
   *
   * A data protection policy can help safeguard sensitive data that's ingested by the log group by
   * auditing and masking the sensitive log data. When a user who does not have permission to view
   * masked data views a log event that includes masked data, the sensitive data is replaced by
   * asterisks.
   *
   * For more information, including a list of types of data that can be audited and masked, see
   * [Protect sensitive log data with
   * masking](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-logs-loggroup-dataprotectionpolicy)
   */
  public fun dataProtectionPolicy(): Any? = unwrap(this).getDataProtectionPolicy()

  /**
   * The Amazon Resource Name (ARN) of the AWS KMS key to use when encrypting log data.
   *
   * To associate an AWS KMS key with the log group, specify the ARN of that KMS key here. If you do
   * so, ingested data is encrypted using this key. This association is stored as long as the data
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
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

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
   */
  public fun logGroupClass(): String? = unwrap(this).getLogGroupClass()

  /**
   * The name of the log group.
   *
   * If you don't specify a name, AWS CloudFormation generates a unique ID for the log group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-logs-loggroup-loggroupname)
   */
  public fun logGroupName(): String? = unwrap(this).getLogGroupName()

  /**
   * The number of days to retain the log events in the specified log group.
   *
   * Possible values are: 1, 3, 5, 7, 14, 30, 60, 90, 120, 150, 180, 365, 400, 545, 731, 1096, 1827,
   * 2192, 2557, 2922, 3288, and 3653.
   *
   * To set a log group so that its log events do not expire, use
   * [DeleteRetentionPolicy](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DeleteRetentionPolicy.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-logs-loggroup-retentionindays)
   */
  public fun retentionInDays(): Number? = unwrap(this).getRetentionInDays()

  /**
   * An array of key-value pairs to apply to the log group.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-logs-loggroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnLogGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dataProtectionPolicy Creates a data protection policy and assigns it to the log group.
     * A data protection policy can help safeguard sensitive data that's ingested by the log group
     * by auditing and masking the sensitive log data. When a user who does not have permission to view
     * masked data views a log event that includes masked data, the sensitive data is replaced by
     * asterisks.
     *
     * For more information, including a list of types of data that can be audited and masked, see
     * [Protect sensitive log data with
     * masking](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data.html)
     * .
     */
    public fun dataProtectionPolicy(dataProtectionPolicy: Any)

    /**
     * @param kmsKeyId The Amazon Resource Name (ARN) of the AWS KMS key to use when encrypting log
     * data.
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
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param logGroupClass Specifies the log group class for this log group. There are two
     * classes:.
     * * The `Standard` log class supports all CloudWatch Logs features.
     * * The `Infrequent Access` log class supports a subset of CloudWatch Logs features and incurs
     * lower costs.
     *
     * For details about the features supported by each class, see [Log
     * classes](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch_Logs_Log_Classes.html)
     */
    public fun logGroupClass(logGroupClass: String)

    /**
     * @param logGroupName The name of the log group.
     * If you don't specify a name, AWS CloudFormation generates a unique ID for the log group.
     */
    public fun logGroupName(logGroupName: String)

    /**
     * @param retentionInDays The number of days to retain the log events in the specified log
     * group.
     * Possible values are: 1, 3, 5, 7, 14, 30, 60, 90, 120, 150, 180, 365, 400, 545, 731, 1096,
     * 1827, 2192, 2557, 2922, 3288, and 3653.
     *
     * To set a log group so that its log events do not expire, use
     * [DeleteRetentionPolicy](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DeleteRetentionPolicy.html)
     * .
     */
    public fun retentionInDays(retentionInDays: Number)

    /**
     * @param tags An array of key-value pairs to apply to the log group.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to the log group.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnLogGroupProps.Builder =
        software.amazon.awscdk.services.logs.CfnLogGroupProps.builder()

    /**
     * @param dataProtectionPolicy Creates a data protection policy and assigns it to the log group.
     * A data protection policy can help safeguard sensitive data that's ingested by the log group
     * by auditing and masking the sensitive log data. When a user who does not have permission to view
     * masked data views a log event that includes masked data, the sensitive data is replaced by
     * asterisks.
     *
     * For more information, including a list of types of data that can be audited and masked, see
     * [Protect sensitive log data with
     * masking](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data.html)
     * .
     */
    override fun dataProtectionPolicy(dataProtectionPolicy: Any) {
      cdkBuilder.dataProtectionPolicy(dataProtectionPolicy)
    }

    /**
     * @param kmsKeyId The Amazon Resource Name (ARN) of the AWS KMS key to use when encrypting log
     * data.
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
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param logGroupClass Specifies the log group class for this log group. There are two
     * classes:.
     * * The `Standard` log class supports all CloudWatch Logs features.
     * * The `Infrequent Access` log class supports a subset of CloudWatch Logs features and incurs
     * lower costs.
     *
     * For details about the features supported by each class, see [Log
     * classes](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch_Logs_Log_Classes.html)
     */
    override fun logGroupClass(logGroupClass: String) {
      cdkBuilder.logGroupClass(logGroupClass)
    }

    /**
     * @param logGroupName The name of the log group.
     * If you don't specify a name, AWS CloudFormation generates a unique ID for the log group.
     */
    override fun logGroupName(logGroupName: String) {
      cdkBuilder.logGroupName(logGroupName)
    }

    /**
     * @param retentionInDays The number of days to retain the log events in the specified log
     * group.
     * Possible values are: 1, 3, 5, 7, 14, 30, 60, 90, 120, 150, 180, 365, 400, 545, 731, 1096,
     * 1827, 2192, 2557, 2922, 3288, and 3653.
     *
     * To set a log group so that its log events do not expire, use
     * [DeleteRetentionPolicy](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DeleteRetentionPolicy.html)
     * .
     */
    override fun retentionInDays(retentionInDays: Number) {
      cdkBuilder.retentionInDays(retentionInDays)
    }

    /**
     * @param tags An array of key-value pairs to apply to the log group.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to the log group.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.logs.CfnLogGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.CfnLogGroupProps,
  ) : CdkObject(cdkObject), CfnLogGroupProps {
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
     */
    override fun dataProtectionPolicy(): Any? = unwrap(this).getDataProtectionPolicy()

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
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

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
     */
    override fun logGroupClass(): String? = unwrap(this).getLogGroupClass()

    /**
     * The name of the log group.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique ID for the log group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-logs-loggroup-loggroupname)
     */
    override fun logGroupName(): String? = unwrap(this).getLogGroupName()

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
     */
    override fun retentionInDays(): Number? = unwrap(this).getRetentionInDays()

    /**
     * An array of key-value pairs to apply to the log group.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-logs-loggroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLogGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnLogGroupProps):
        CfnLogGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLogGroupProps):
        software.amazon.awscdk.services.logs.CfnLogGroupProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.logs.CfnLogGroupProps
  }
}
