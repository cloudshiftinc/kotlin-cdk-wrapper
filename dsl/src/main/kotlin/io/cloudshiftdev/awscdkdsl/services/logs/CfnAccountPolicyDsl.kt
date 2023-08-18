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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.logs.CfnAccountPolicy
import software.constructs.Construct

/**
 * Creates or updates an account-level data protection policy that applies to all log groups in the
 * account.
 *
 * A data protection policy can help safeguard sensitive data that's ingested by your log groups by
 * auditing and masking the sensitive log data. Each account can have only one account-level policy.
 *
 * Sensitive data is detected and masked when it is ingested into a log group. When you set a data
 * protection policy, log events ingested into the log groups before that time are not masked.
 *
 * If you create a data protection policy for your whole account, it applies to both existing log
 * groups and all log groups that are created later in this account. The account policy is applied
 * to existing log groups with eventual consistency. It might take up to 5 minutes before sensitive
 * data in existing log groups begins to be masked.
 *
 * By default, when a user views a log event that includes masked data, the sensitive data is
 * replaced by asterisks. A user who has the `logs:Unmask` permission can use a
 * [GetLogEvents](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_GetLogEvents.html)
 * or
 * [FilterLogEvents](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_FilterLogEvents.html)
 * operation with the `unmask` parameter set to `true` to view the unmasked log events. Users with
 * the `logs:Unmask` can also view unmasked data in the CloudWatch Logs console by running a
 * CloudWatch Logs Insights query with the `unmask` query command.
 *
 * For more information, including a list of types of data that can be audited and masked, see
 * [Protect sensitive log data with masking](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data.html)
 * .
 *
 * To create an account-level policy, you must be signed on with the `logs:PutDataProtectionPolicy`
 * and `logs:PutAccountPolicy` permissions.
 *
 * An account-level policy applies to all log groups in the account. You can also create a data
 * protection policy that applies to just one log group. If a log group has its own data protection
 * policy and the account also has an account-level data protection policy, then the two policies
 * are cumulative. Any sensitive term specified in either policy is masked.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.logs.*;
 * CfnAccountPolicy cfnAccountPolicy = CfnAccountPolicy.Builder.create(this, "MyCfnAccountPolicy")
 * .policyDocument("policyDocument")
 * .policyName("policyName")
 * .policyType("policyType")
 * // the properties below are optional
 * .scope("scope")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-accountpolicy.html)
 */
@CdkDslMarker
public class CfnAccountPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAccountPolicy.Builder = CfnAccountPolicy.Builder.create(scope, id)

    /**
     * Specify the data protection policy, in JSON.
     *
     * This policy must include two JSON blocks:
     * * The first block must include both a `DataIdentifer` array and an `Operation` property with
     *   an `Audit` action. The `DataIdentifer` array lists the types of sensitive data that you
     *   want to mask. For more information about the available options, see
     *   [Types of data that you can mask](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-types.html)
     *   .
     *
     * The `Operation` property with an `Audit` action is required to find the sensitive data terms.
     * This `Audit` action must contain a `FindingsDestination` object. You can optionally use that
     * `FindingsDestination` object to list one or more destinations to send audit findings to. If
     * you specify destinations such as log groups, Kinesis Data Firehose streams, and S3 buckets,
     * they must already exist.
     * * The second block must include both a `DataIdentifer` array and an `Operation` property with
     *   an `Deidentify` action. The `DataIdentifer` array must exactly match the `DataIdentifer`
     *   array in the first block of the policy.
     *
     * The `Operation` property with the `Deidentify` action is what actually masks the data, and it
     * must contain the `"MaskConfig": {}` object. The `"MaskConfig": {}` object must be empty.
     *
     * The contents of the two `DataIdentifer` arrays must match exactly.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-accountpolicy.html#cfn-logs-accountpolicy-policydocument)
     *
     * @param policyDocument Specify the data protection policy, in JSON.
     */
    public fun policyDocument(policyDocument: String) {
        cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * A name for the policy.
     *
     * This must be unique within the account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-accountpolicy.html#cfn-logs-accountpolicy-policyname)
     *
     * @param policyName A name for the policy.
     */
    public fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
    }

    /**
     * Currently the only valid value for this parameter is `DATA_PROTECTION_POLICY` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-accountpolicy.html#cfn-logs-accountpolicy-policytype)
     *
     * @param policyType Currently the only valid value for this parameter is
     *   `DATA_PROTECTION_POLICY` .
     */
    public fun policyType(policyType: String) {
        cdkBuilder.policyType(policyType)
    }

    /**
     * Currently the only valid value for this parameter is `ALL` , which specifies that the data
     * protection policy applies to all log groups in the account.
     *
     * If you omit this parameter, the default of `ALL` is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-accountpolicy.html#cfn-logs-accountpolicy-scope)
     *
     * @param scope Currently the only valid value for this parameter is `ALL` , which specifies
     *   that the data protection policy applies to all log groups in the account.
     */
    public fun scope(scope: String) {
        cdkBuilder.scope(scope)
    }

    public fun build(): CfnAccountPolicy = cdkBuilder.build()
}
