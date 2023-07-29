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

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnOrganizationConfigRule
import software.constructs.Construct

/**
 * Adds or updates an AWS Config rule for your entire organization to evaluate if your AWS resources
 * comply with your desired configurations.
 *
 * For information on how many organization AWS Config rules you can have per account, see
 * [*Service Limits*](https://docs.aws.amazon.com/config/latest/developerguide/configlimits.html) in
 * the *AWS Config Developer Guide* .
 *
 * Only a management account and a delegated administrator can create or update an organization AWS
 * Config rule. When calling the `OrganizationConfigRule` resource with a delegated administrator,
 * you must ensure AWS Organizations `ListDelegatedAdministrator` permissions are added. An
 * organization can have up to 3 delegated administrators.
 *
 * The `OrganizationConfigRule` resource enables organization service access through the
 * `EnableAWSServiceAccess` action and creates a service-linked role
 * `AWSServiceRoleForConfigMultiAccountSetup` in the management or delegated administrator account
 * of your organization. The service-linked role is created only when the role does not exist in the
 * caller account. AWS Config verifies the existence of role with `GetRole` action.
 *
 * To use the `OrganizationConfigRule` resource with delegated administrator, register a delegated
 * administrator by calling AWS Organization `register-delegated-administrator` for
 * `config-multiaccountsetup.amazonaws.com` .
 *
 * There are two types of rules: *AWS Config Managed Rules* and *AWS Config Custom Rules* . You can
 * use `PutOrganizationConfigRule` to create both AWS Config Managed Rules and AWS Config Custom
 * Rules.
 *
 * AWS Config Managed Rules are predefined, customizable rules created by AWS Config . For a list of
 * managed rules, see
 * [List of AWS Config Managed Rules](https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html)
 * . If you are adding an AWS Config managed rule, you must specify the rule's identifier for the
 * `RuleIdentifier` key.
 *
 * AWS Config Custom Rules are rules that you create from scratch. There are two ways to create AWS
 * Config custom rules: with Lambda functions (
 * [AWS Lambda Developer Guide](https://docs.aws.amazon.com/config/latest/developerguide/gettingstarted-concepts.html#gettingstarted-concepts-function)
 * ) and with Guard (
 * [Guard GitHub Repository](https://docs.aws.amazon.com/https://github.com/aws-cloudformation/cloudformation-guard)
 * ), a policy-as-code language. AWS Config custom rules created with AWS Lambda are called *AWS
 * Config Custom Lambda Rules* and AWS Config custom rules created with Guard are called *AWS Config
 * Custom Policy Rules* .
 *
 * If you are adding a new AWS Config Custom Lambda rule, you first need to create an AWS Lambda
 * function in the management account or a delegated administrator that the rule invokes to evaluate
 * your resources. You also need to create an IAM role in the managed account that can be assumed by
 * the Lambda function. When you use `PutOrganizationConfigRule` to add a Custom Lambda rule to AWS
 * Config , you must specify the Amazon Resource Name (ARN) that AWS Lambda assigns to the function.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * CfnOrganizationConfigRule cfnOrganizationConfigRule =
 * CfnOrganizationConfigRule.Builder.create(this, "MyCfnOrganizationConfigRule")
 * .organizationConfigRuleName("organizationConfigRuleName")
 * // the properties below are optional
 * .excludedAccounts(List.of("excludedAccounts"))
 * .organizationCustomPolicyRuleMetadata(OrganizationCustomPolicyRuleMetadataProperty.builder()
 * .policyText("policyText")
 * .runtime("runtime")
 * // the properties below are optional
 * .debugLogDeliveryAccounts(List.of("debugLogDeliveryAccounts"))
 * .description("description")
 * .inputParameters("inputParameters")
 * .maximumExecutionFrequency("maximumExecutionFrequency")
 * .organizationConfigRuleTriggerTypes(List.of("organizationConfigRuleTriggerTypes"))
 * .resourceIdScope("resourceIdScope")
 * .resourceTypesScope(List.of("resourceTypesScope"))
 * .tagKeyScope("tagKeyScope")
 * .tagValueScope("tagValueScope")
 * .build())
 * .organizationCustomRuleMetadata(OrganizationCustomRuleMetadataProperty.builder()
 * .lambdaFunctionArn("lambdaFunctionArn")
 * .organizationConfigRuleTriggerTypes(List.of("organizationConfigRuleTriggerTypes"))
 * // the properties below are optional
 * .description("description")
 * .inputParameters("inputParameters")
 * .maximumExecutionFrequency("maximumExecutionFrequency")
 * .resourceIdScope("resourceIdScope")
 * .resourceTypesScope(List.of("resourceTypesScope"))
 * .tagKeyScope("tagKeyScope")
 * .tagValueScope("tagValueScope")
 * .build())
 * .organizationManagedRuleMetadata(OrganizationManagedRuleMetadataProperty.builder()
 * .ruleIdentifier("ruleIdentifier")
 * // the properties below are optional
 * .description("description")
 * .inputParameters("inputParameters")
 * .maximumExecutionFrequency("maximumExecutionFrequency")
 * .resourceIdScope("resourceIdScope")
 * .resourceTypesScope(List.of("resourceTypesScope"))
 * .tagKeyScope("tagKeyScope")
 * .tagValueScope("tagValueScope")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html)
 */
@CdkDslMarker
public class CfnOrganizationConfigRuleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnOrganizationConfigRule.Builder =
        CfnOrganizationConfigRule.Builder.create(scope, id)

    private val _excludedAccounts: MutableList<String> = mutableListOf()

    /**
     * A comma-separated list of accounts excluded from organization AWS Config rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-excludedaccounts)
     *
     * @param excludedAccounts A comma-separated list of accounts excluded from organization AWS
     *   Config rule.
     */
    public fun excludedAccounts(vararg excludedAccounts: String) {
        _excludedAccounts.addAll(listOf(*excludedAccounts))
    }

    /**
     * A comma-separated list of accounts excluded from organization AWS Config rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-excludedaccounts)
     *
     * @param excludedAccounts A comma-separated list of accounts excluded from organization AWS
     *   Config rule.
     */
    public fun excludedAccounts(excludedAccounts: Collection<String>) {
        _excludedAccounts.addAll(excludedAccounts)
    }

    /**
     * The name that you assign to organization AWS Config rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationconfigrulename)
     *
     * @param organizationConfigRuleName The name that you assign to organization AWS Config rule.
     */
    public fun organizationConfigRuleName(organizationConfigRuleName: String) {
        cdkBuilder.organizationConfigRuleName(organizationConfigRuleName)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata)
     *
     * @param organizationCustomPolicyRuleMetadata
     */
    public fun organizationCustomPolicyRuleMetadata(
        organizationCustomPolicyRuleMetadata: IResolvable
    ) {
        cdkBuilder.organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata)
     *
     * @param organizationCustomPolicyRuleMetadata
     */
    public fun organizationCustomPolicyRuleMetadata(
        organizationCustomPolicyRuleMetadata:
            CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty
    ) {
        cdkBuilder.organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata)
    }

    /**
     * An `OrganizationCustomRuleMetadata` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata)
     *
     * @param organizationCustomRuleMetadata An `OrganizationCustomRuleMetadata` object.
     */
    public fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: IResolvable) {
        cdkBuilder.organizationCustomRuleMetadata(organizationCustomRuleMetadata)
    }

    /**
     * An `OrganizationCustomRuleMetadata` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata)
     *
     * @param organizationCustomRuleMetadata An `OrganizationCustomRuleMetadata` object.
     */
    public fun organizationCustomRuleMetadata(
        organizationCustomRuleMetadata:
            CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty
    ) {
        cdkBuilder.organizationCustomRuleMetadata(organizationCustomRuleMetadata)
    }

    /**
     * An `OrganizationManagedRuleMetadata` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata)
     *
     * @param organizationManagedRuleMetadata An `OrganizationManagedRuleMetadata` object.
     */
    public fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: IResolvable) {
        cdkBuilder.organizationManagedRuleMetadata(organizationManagedRuleMetadata)
    }

    /**
     * An `OrganizationManagedRuleMetadata` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata)
     *
     * @param organizationManagedRuleMetadata An `OrganizationManagedRuleMetadata` object.
     */
    public fun organizationManagedRuleMetadata(
        organizationManagedRuleMetadata:
            CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty
    ) {
        cdkBuilder.organizationManagedRuleMetadata(organizationManagedRuleMetadata)
    }

    public fun build(): CfnOrganizationConfigRule {
        if (_excludedAccounts.isNotEmpty()) cdkBuilder.excludedAccounts(_excludedAccounts)
        return cdkBuilder.build()
    }
}
