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

package io.cloudshiftdev.awscdkdsl.services.logs

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.logs.CfnLogGroup
import software.constructs.Construct

/**
 * The `AWS::Logs::LogGroup` resource specifies a log group.
 *
 * A log group defines common properties for log streams, such as their retention and access control
 * rules. Each log stream must belong to one log group.
 *
 * You can create up to 1,000,000 log groups per Region per account. You must use the following
 * guidelines when naming a log group:
 * * Log group names must be unique within a Region for an AWS account.
 * * Log group names can be between 1 and 512 characters long.
 * * Log group names consist of the following characters: a-z, A-Z, 0-9, '_' (underscore), '-'
 *   (hyphen), '/' (forward slash), and '.' (period).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.logs.*;
 * Object dataProtectionPolicy;
 * CfnLogGroup cfnLogGroup = CfnLogGroup.Builder.create(this, "MyCfnLogGroup")
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
@CdkDslMarker
public class CfnLogGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLogGroup.Builder = CfnLogGroup.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Creates a data protection policy and assigns it to the log group.
     *
     * A data protection policy can help safeguard sensitive data that's ingested by the log group
     * by auditing and masking the sensitive log data. When a user who does not have permission to
     * view masked data views a log event that includes masked data, the sensitive data is replaced
     * by asterisks.
     *
     * For more information, including a list of types of data that can be audited and masked, see
     * [Protect sensitive log data with masking](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-logs-loggroup-dataprotectionpolicy)
     *
     * @param dataProtectionPolicy Creates a data protection policy and assigns it to the log group.
     */
    public fun dataProtectionPolicy(dataProtectionPolicy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(dataProtectionPolicy)
        cdkBuilder.dataProtectionPolicy(builder.map)
    }

    /**
     * Creates a data protection policy and assigns it to the log group.
     *
     * A data protection policy can help safeguard sensitive data that's ingested by the log group
     * by auditing and masking the sensitive log data. When a user who does not have permission to
     * view masked data views a log event that includes masked data, the sensitive data is replaced
     * by asterisks.
     *
     * For more information, including a list of types of data that can be audited and masked, see
     * [Protect sensitive log data with masking](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-logs-loggroup-dataprotectionpolicy)
     *
     * @param dataProtectionPolicy Creates a data protection policy and assigns it to the log group.
     */
    public fun dataProtectionPolicy(dataProtectionPolicy: Any) {
        cdkBuilder.dataProtectionPolicy(dataProtectionPolicy)
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS KMS key to use when encrypting log data.
     *
     * To associate an AWS KMS key with the log group, specify the ARN of that KMS key here. If you
     * do so, ingested data is encrypted using this key. This association is stored as long as the
     * data encrypted with the KMS key is still within CloudWatch Logs . This enables CloudWatch
     * Logs to decrypt this data whenever it is requested.
     *
     * If you attempt to associate a KMS key with the log group but the KMS key doesn't exist or is
     * deactivated, you will receive an `InvalidParameterException` error.
     *
     * Log group data is always encrypted in CloudWatch Logs . If you omit this key, the encryption
     * does not use AWS KMS . For more information, see
     * [Encrypt log data in CloudWatch Logs using AWS Key Management Service](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/encrypt-log-data-kms.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-logs-loggroup-kmskeyid)
     *
     * @param kmsKeyId The Amazon Resource Name (ARN) of the AWS KMS key to use when encrypting log
     *   data.
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * Specifies the log group class for this log group. There are two classes:.
     * * The `Standard` log class supports all CloudWatch Logs features.
     * * The `Infrequent Access` log class supports a subset of CloudWatch Logs features and incurs
     *   lower costs.
     *
     * For details about the features supported by each class, see
     * [Log classes](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch_Logs_Log_Classes.html)
     *
     * Default: - "STANDARD"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-logs-loggroup-loggroupclass)
     *
     * @param logGroupClass Specifies the log group class for this log group. There are two
     *   classes:.
     */
    public fun logGroupClass(logGroupClass: String) {
        cdkBuilder.logGroupClass(logGroupClass)
    }

    /**
     * The name of the log group.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique ID for the log group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-logs-loggroup-loggroupname)
     *
     * @param logGroupName The name of the log group.
     */
    public fun logGroupName(logGroupName: String) {
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
     *
     * @param retentionInDays The number of days to retain the log events in the specified log
     *   group.
     */
    public fun retentionInDays(retentionInDays: Number) {
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
     *
     * @param tags An array of key-value pairs to apply to the log group.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to the log group.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-logs-loggroup-tags)
     *
     * @param tags An array of key-value pairs to apply to the log group.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnLogGroup {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
