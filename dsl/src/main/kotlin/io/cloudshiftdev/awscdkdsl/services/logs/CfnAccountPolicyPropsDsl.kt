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
import software.amazon.awscdk.services.logs.CfnAccountPolicyProps

/**
 * Properties for defining a `CfnAccountPolicy`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.logs.*;
 * CfnAccountPolicyProps cfnAccountPolicyProps = CfnAccountPolicyProps.builder()
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
public class CfnAccountPolicyPropsDsl {
    private val cdkBuilder: CfnAccountPolicyProps.Builder = CfnAccountPolicyProps.builder()

    /**
     * @param policyDocument Specify the data protection policy, in JSON. This policy must include
     *   two JSON blocks:
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
     */
    public fun policyDocument(policyDocument: String) {
        cdkBuilder.policyDocument(policyDocument)
    }

    /** @param policyName A name for the policy. This must be unique within the account. */
    public fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
    }

    /**
     * @param policyType Currently the only valid value for this parameter is
     *   `DATA_PROTECTION_POLICY` .
     */
    public fun policyType(policyType: String) {
        cdkBuilder.policyType(policyType)
    }

    /**
     * @param scope Currently the only valid value for this parameter is `ALL` , which specifies
     *   that the data protection policy applies to all log groups in the account. If you omit this
     *   parameter, the default of `ALL` is used.
     */
    public fun scope(scope: String) {
        cdkBuilder.scope(scope)
    }

    public fun build(): CfnAccountPolicyProps = cdkBuilder.build()
}
