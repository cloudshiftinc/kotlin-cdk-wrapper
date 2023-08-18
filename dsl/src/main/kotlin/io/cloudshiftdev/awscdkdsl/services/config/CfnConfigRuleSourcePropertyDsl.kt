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

package io.cloudshiftdev.awscdkdsl.services.config

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnConfigRule

/**
 * Provides the CustomPolicyDetails, the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for
 * Custom Policy rules, and `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the
 * events that cause the evaluation of your AWS resources.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * SourceProperty sourceProperty = SourceProperty.builder()
 * .owner("owner")
 * // the properties below are optional
 * .customPolicyDetails(CustomPolicyDetailsProperty.builder()
 * .enableDebugLogDelivery(false)
 * .policyRuntime("policyRuntime")
 * .policyText("policyText")
 * .build())
 * .sourceDetails(List.of(SourceDetailProperty.builder()
 * .eventSource("eventSource")
 * .messageType("messageType")
 * // the properties below are optional
 * .maximumExecutionFrequency("maximumExecutionFrequency")
 * .build()))
 * .sourceIdentifier("sourceIdentifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html)
 */
@CdkDslMarker
public class CfnConfigRuleSourcePropertyDsl {
    private val cdkBuilder: CfnConfigRule.SourceProperty.Builder =
        CfnConfigRule.SourceProperty.builder()

    private val _sourceDetails: MutableList<Any> = mutableListOf()

    /**
     * @param customPolicyDetails Provides the runtime system, policy definition, and whether debug
     *   logging is enabled. Required when owner is set to `CUSTOM_POLICY` .
     */
    public fun customPolicyDetails(customPolicyDetails: IResolvable) {
        cdkBuilder.customPolicyDetails(customPolicyDetails)
    }

    /**
     * @param customPolicyDetails Provides the runtime system, policy definition, and whether debug
     *   logging is enabled. Required when owner is set to `CUSTOM_POLICY` .
     */
    public fun customPolicyDetails(customPolicyDetails: CfnConfigRule.CustomPolicyDetailsProperty) {
        cdkBuilder.customPolicyDetails(customPolicyDetails)
    }

    /**
     * @param owner Indicates whether AWS or the customer owns and manages the AWS Config rule. AWS
     *   Config Managed Rules are predefined rules owned by AWS . For more information, see
     *   [AWS Config Managed Rules](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html)
     *   in the *AWS Config developer guide* .
     *
     * AWS Config Custom Rules are rules that you can develop either with Guard ( `CUSTOM_POLICY` )
     * or AWS Lambda ( `CUSTOM_LAMBDA` ). For more information, see
     * [AWS Config Custom Rules](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html)
     * in the *AWS Config developer guide* .
     */
    public fun owner(owner: String) {
        cdkBuilder.owner(owner)
    }

    /**
     * @param sourceDetails Provides the source and the message types that cause AWS Config to
     *   evaluate your AWS resources against a rule. It also provides the frequency with which you
     *   want AWS Config to run evaluations for the rule if the trigger type is periodic.
     *
     * If the owner is set to `CUSTOM_POLICY` , the only acceptable values for the AWS Config rule
     * trigger message type are `ConfigurationItemChangeNotification` and
     * `OversizedConfigurationItemChangeNotification` .
     */
    public fun sourceDetails(vararg sourceDetails: Any) {
        _sourceDetails.addAll(listOf(*sourceDetails))
    }

    /**
     * @param sourceDetails Provides the source and the message types that cause AWS Config to
     *   evaluate your AWS resources against a rule. It also provides the frequency with which you
     *   want AWS Config to run evaluations for the rule if the trigger type is periodic.
     *
     * If the owner is set to `CUSTOM_POLICY` , the only acceptable values for the AWS Config rule
     * trigger message type are `ConfigurationItemChangeNotification` and
     * `OversizedConfigurationItemChangeNotification` .
     */
    public fun sourceDetails(sourceDetails: Collection<Any>) {
        _sourceDetails.addAll(sourceDetails)
    }

    /**
     * @param sourceDetails Provides the source and the message types that cause AWS Config to
     *   evaluate your AWS resources against a rule. It also provides the frequency with which you
     *   want AWS Config to run evaluations for the rule if the trigger type is periodic.
     *
     * If the owner is set to `CUSTOM_POLICY` , the only acceptable values for the AWS Config rule
     * trigger message type are `ConfigurationItemChangeNotification` and
     * `OversizedConfigurationItemChangeNotification` .
     */
    public fun sourceDetails(sourceDetails: IResolvable) {
        cdkBuilder.sourceDetails(sourceDetails)
    }

    /**
     * @param sourceIdentifier For AWS Config Managed rules, a predefined identifier from a list.
     *   For example, `IAM_PASSWORD_POLICY` is a managed rule. To reference a managed rule, see
     *   [List of AWS Config Managed Rules](https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html)
     *   .
     *
     * For AWS Config Custom Lambda rules, the identifier is the Amazon Resource Name (ARN) of the
     * rule's AWS Lambda function, such as
     * `arn:aws:lambda:us-east-2:123456789012:function:custom_rule_name` .
     *
     * For AWS Config Custom Policy rules, this field will be ignored.
     */
    public fun sourceIdentifier(sourceIdentifier: String) {
        cdkBuilder.sourceIdentifier(sourceIdentifier)
    }

    public fun build(): CfnConfigRule.SourceProperty {
        if (_sourceDetails.isNotEmpty()) cdkBuilder.sourceDetails(_sourceDetails)
        return cdkBuilder.build()
    }
}
