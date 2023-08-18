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
import software.amazon.awscdk.services.logs.CfnLogGroupProps

/**
 * Properties for defining a `CfnLogGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.logs.*;
 * Object dataProtectionPolicy;
 * CfnLogGroupProps cfnLogGroupProps = CfnLogGroupProps.builder()
 * .dataProtectionPolicy(dataProtectionPolicy)
 * .kmsKeyId("kmsKeyId")
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
public class CfnLogGroupPropsDsl {
    private val cdkBuilder: CfnLogGroupProps.Builder = CfnLogGroupProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param dataProtectionPolicy Creates a data protection policy and assigns it to the log group.
     *   A data protection policy can help safeguard sensitive data that's ingested by the log group
     *   by auditing and masking the sensitive log data. When a user who does not have permission to
     *   view masked data views a log event that includes masked data, the sensitive data is
     *   replaced by asterisks.
     *
     * For more information, including a list of types of data that can be audited and masked, see
     * [Protect sensitive log data with masking](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data.html)
     * .
     */
    public fun dataProtectionPolicy(dataProtectionPolicy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(dataProtectionPolicy)
        cdkBuilder.dataProtectionPolicy(builder.map)
    }

    /**
     * @param dataProtectionPolicy Creates a data protection policy and assigns it to the log group.
     *   A data protection policy can help safeguard sensitive data that's ingested by the log group
     *   by auditing and masking the sensitive log data. When a user who does not have permission to
     *   view masked data views a log event that includes masked data, the sensitive data is
     *   replaced by asterisks.
     *
     * For more information, including a list of types of data that can be audited and masked, see
     * [Protect sensitive log data with masking](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data.html)
     * .
     */
    public fun dataProtectionPolicy(dataProtectionPolicy: Any) {
        cdkBuilder.dataProtectionPolicy(dataProtectionPolicy)
    }

    /**
     * @param kmsKeyId The Amazon Resource Name (ARN) of the AWS KMS key to use when encrypting log
     *   data. To associate an AWS KMS key with the log group, specify the ARN of that KMS key here.
     *   If you do so, ingested data is encrypted using this key. This association is stored as long
     *   as the data encrypted with the KMS key is still within CloudWatch Logs . This enables
     *   CloudWatch Logs to decrypt this data whenever it is requested.
     *
     * If you attempt to associate a KMS key with the log group but the KMS key doesn't exist or is
     * deactivated, you will receive an `InvalidParameterException` error.
     *
     * Log group data is always encrypted in CloudWatch Logs . If you omit this key, the encryption
     * does not use AWS KMS . For more information, see
     * [Encrypt log data in CloudWatch Logs using AWS Key Management Service](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/encrypt-log-data-kms.html)
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param logGroupName The name of the log group. If you don't specify a name, AWS
     *   CloudFormation generates a unique ID for the log group.
     */
    public fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
    }

    /**
     * @param retentionInDays The number of days to retain the log events in the specified log
     *   group. Possible values are: 1, 3, 5, 7, 14, 30, 60, 90, 120, 150, 180, 365, 400, 545, 731,
     *   1096, 1827, 2192, 2557, 2922, 3288, and 3653.
     *
     * To set a log group so that its log events do not expire, use
     * [DeleteRetentionPolicy](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DeleteRetentionPolicy.html)
     * .
     */
    public fun retentionInDays(retentionInDays: Number) {
        cdkBuilder.retentionInDays(retentionInDays)
    }

    /**
     * @param tags An array of key-value pairs to apply to the log group. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to the log group. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnLogGroupProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
