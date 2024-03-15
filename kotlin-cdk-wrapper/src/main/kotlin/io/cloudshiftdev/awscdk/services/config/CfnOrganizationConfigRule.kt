@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Adds or updates an AWS Config rule for your entire organization to evaluate if your AWS resources
 * comply with your desired configurations.
 *
 * For information on how many organization AWS Config rules you can have per account, see [*Service
 * Limits*](https://docs.aws.amazon.com/config/latest/developerguide/configlimits.html) in the *AWS
 * Config Developer Guide* .
 *
 * Only a management account and a delegated administrator can create or update an organization AWS
 * Config rule. When calling the `OrganizationConfigRule` resource with a delegated administrator, you
 * must ensure AWS Organizations `ListDelegatedAdministrator` permissions are added. An organization
 * can have up to 3 delegated administrators.
 *
 * The `OrganizationConfigRule` resource enables organization service access through the
 * `EnableAWSServiceAccess` action and creates a service-linked role
 * `AWSServiceRoleForConfigMultiAccountSetup` in the management or delegated administrator account of
 * your organization. The service-linked role is created only when the role does not exist in the
 * caller account. AWS Config verifies the existence of role with `GetRole` action.
 *
 * To use the `OrganizationConfigRule` resource with delegated administrator, register a delegated
 * administrator by calling AWS Organization `register-delegated-administrator` for
 * `config-multiaccountsetup.amazonaws.com` .
 *
 * There are two types of rules: *AWS Config Managed Rules* and *AWS Config Custom Rules* . You can
 * use `PutOrganizationConfigRule` to create both AWS Config Managed Rules and AWS Config Custom Rules.
 *
 * AWS Config Managed Rules are predefined, customizable rules created by AWS Config . For a list of
 * managed rules, see [List of AWS Config Managed
 * Rules](https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html) .
 * If you are adding an AWS Config managed rule, you must specify the rule's identifier for the
 * `RuleIdentifier` key.
 *
 * AWS Config Custom Rules are rules that you create from scratch. There are two ways to create AWS
 * Config custom rules: with Lambda functions ( [AWS Lambda Developer
 * Guide](https://docs.aws.amazon.com/config/latest/developerguide/gettingstarted-concepts.html#gettingstarted-concepts-function)
 * ) and with Guard ( [Guard GitHub
 * Repository](https://docs.aws.amazon.com/https://github.com/aws-cloudformation/cloudformation-guard)
 * ), a policy-as-code language. AWS Config custom rules created with AWS Lambda are called *AWS Config
 * Custom Lambda Rules* and AWS Config custom rules created with Guard are called *AWS Config Custom
 * Policy Rules* .
 *
 * If you are adding a new AWS Config Custom Lambda rule, you first need to create an AWS Lambda
 * function in the management account or a delegated administrator that the rule invokes to evaluate
 * your resources. You also need to create an IAM role in the managed account that can be assumed by
 * the Lambda function. When you use `PutOrganizationConfigRule` to add a Custom Lambda rule to AWS
 * Config , you must specify the Amazon Resource Name (ARN) that AWS Lambda assigns to the function.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.config.*;
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
public open class CfnOrganizationConfigRule internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.config.CfnOrganizationConfigRule,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A comma-separated list of accounts excluded from organization AWS Config rule.
   */
  public open fun excludedAccounts(): List<String> = unwrap(this).getExcludedAccounts() ?:
      emptyList()

  /**
   * A comma-separated list of accounts excluded from organization AWS Config rule.
   */
  public open fun excludedAccounts(`value`: List<String>) {
    unwrap(this).setExcludedAccounts(`value`)
  }

  /**
   * A comma-separated list of accounts excluded from organization AWS Config rule.
   */
  public open fun excludedAccounts(vararg `value`: String): Unit =
      excludedAccounts(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name that you assign to organization AWS Config rule.
   */
  public open fun organizationConfigRuleName(): String =
      unwrap(this).getOrganizationConfigRuleName()

  /**
   * The name that you assign to organization AWS Config rule.
   */
  public open fun organizationConfigRuleName(`value`: String) {
    unwrap(this).setOrganizationConfigRuleName(`value`)
  }

  /**
   * An object that specifies metadata for your organization's AWS Config Custom Policy rule.
   */
  public open fun organizationCustomPolicyRuleMetadata(): Any? =
      unwrap(this).getOrganizationCustomPolicyRuleMetadata()

  /**
   * An object that specifies metadata for your organization's AWS Config Custom Policy rule.
   */
  public open fun organizationCustomPolicyRuleMetadata(`value`: IResolvable) {
    unwrap(this).setOrganizationCustomPolicyRuleMetadata(`value`.let(IResolvable::unwrap))
  }

  /**
   * An object that specifies metadata for your organization's AWS Config Custom Policy rule.
   */
  public open
      fun organizationCustomPolicyRuleMetadata(`value`: OrganizationCustomPolicyRuleMetadataProperty) {
    unwrap(this).setOrganizationCustomPolicyRuleMetadata(`value`.let(OrganizationCustomPolicyRuleMetadataProperty::unwrap))
  }

  /**
   * An object that specifies metadata for your organization's AWS Config Custom Policy rule.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("28707c9db6493c309cfb7aac25bca957913d9a510dc5d1f5c38107f3e1043aa5")
  public open
      fun organizationCustomPolicyRuleMetadata(`value`: OrganizationCustomPolicyRuleMetadataProperty.Builder.() -> Unit):
      Unit =
      organizationCustomPolicyRuleMetadata(OrganizationCustomPolicyRuleMetadataProperty(`value`))

  /**
   * An `OrganizationCustomRuleMetadata` object.
   */
  public open fun organizationCustomRuleMetadata(): Any? =
      unwrap(this).getOrganizationCustomRuleMetadata()

  /**
   * An `OrganizationCustomRuleMetadata` object.
   */
  public open fun organizationCustomRuleMetadata(`value`: IResolvable) {
    unwrap(this).setOrganizationCustomRuleMetadata(`value`.let(IResolvable::unwrap))
  }

  /**
   * An `OrganizationCustomRuleMetadata` object.
   */
  public open fun organizationCustomRuleMetadata(`value`: OrganizationCustomRuleMetadataProperty) {
    unwrap(this).setOrganizationCustomRuleMetadata(`value`.let(OrganizationCustomRuleMetadataProperty::unwrap))
  }

  /**
   * An `OrganizationCustomRuleMetadata` object.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("08700c2d2ad01c88a0f6b332b3dbc0ead6218e89dfa66b54c9a89ceb5faaedd1")
  public open
      fun organizationCustomRuleMetadata(`value`: OrganizationCustomRuleMetadataProperty.Builder.() -> Unit):
      Unit = organizationCustomRuleMetadata(OrganizationCustomRuleMetadataProperty(`value`))

  /**
   * An `OrganizationManagedRuleMetadata` object.
   */
  public open fun organizationManagedRuleMetadata(): Any? =
      unwrap(this).getOrganizationManagedRuleMetadata()

  /**
   * An `OrganizationManagedRuleMetadata` object.
   */
  public open fun organizationManagedRuleMetadata(`value`: IResolvable) {
    unwrap(this).setOrganizationManagedRuleMetadata(`value`.let(IResolvable::unwrap))
  }

  /**
   * An `OrganizationManagedRuleMetadata` object.
   */
  public open
      fun organizationManagedRuleMetadata(`value`: OrganizationManagedRuleMetadataProperty) {
    unwrap(this).setOrganizationManagedRuleMetadata(`value`.let(OrganizationManagedRuleMetadataProperty::unwrap))
  }

  /**
   * An `OrganizationManagedRuleMetadata` object.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("eb84dc82be42ba1def9fd1f42436c59be3b2d8eb36ae79f6cac9d713b4975c9c")
  public open
      fun organizationManagedRuleMetadata(`value`: OrganizationManagedRuleMetadataProperty.Builder.() -> Unit):
      Unit = organizationManagedRuleMetadata(OrganizationManagedRuleMetadataProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.config.CfnOrganizationConfigRule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A comma-separated list of accounts excluded from organization AWS Config rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-excludedaccounts)
     * @param excludedAccounts A comma-separated list of accounts excluded from organization AWS
     * Config rule. 
     */
    public fun excludedAccounts(excludedAccounts: List<String>)

    /**
     * A comma-separated list of accounts excluded from organization AWS Config rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-excludedaccounts)
     * @param excludedAccounts A comma-separated list of accounts excluded from organization AWS
     * Config rule. 
     */
    public fun excludedAccounts(vararg excludedAccounts: String)

    /**
     * The name that you assign to organization AWS Config rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationconfigrulename)
     * @param organizationConfigRuleName The name that you assign to organization AWS Config rule. 
     */
    public fun organizationConfigRuleName(organizationConfigRuleName: String)

    /**
     * An object that specifies metadata for your organization's AWS Config Custom Policy rule.
     *
     * The metadata includes the runtime system in use, which accounts have debug logging enabled,
     * and other custom rule metadata, such as resource type, resource ID of AWS resource, and
     * organization trigger types that initiate AWS Config to evaluate AWS resources against a rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata)
     * @param organizationCustomPolicyRuleMetadata An object that specifies metadata for your
     * organization's AWS Config Custom Policy rule. 
     */
    public
        fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: IResolvable)

    /**
     * An object that specifies metadata for your organization's AWS Config Custom Policy rule.
     *
     * The metadata includes the runtime system in use, which accounts have debug logging enabled,
     * and other custom rule metadata, such as resource type, resource ID of AWS resource, and
     * organization trigger types that initiate AWS Config to evaluate AWS resources against a rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata)
     * @param organizationCustomPolicyRuleMetadata An object that specifies metadata for your
     * organization's AWS Config Custom Policy rule. 
     */
    public
        fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: OrganizationCustomPolicyRuleMetadataProperty)

    /**
     * An object that specifies metadata for your organization's AWS Config Custom Policy rule.
     *
     * The metadata includes the runtime system in use, which accounts have debug logging enabled,
     * and other custom rule metadata, such as resource type, resource ID of AWS resource, and
     * organization trigger types that initiate AWS Config to evaluate AWS resources against a rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata)
     * @param organizationCustomPolicyRuleMetadata An object that specifies metadata for your
     * organization's AWS Config Custom Policy rule. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2f08d08c57d84d7a6c704c25f83bb432876c4800d347cf2104cda2e0914f64c")
    public
        fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: OrganizationCustomPolicyRuleMetadataProperty.Builder.() -> Unit)

    /**
     * An `OrganizationCustomRuleMetadata` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata)
     * @param organizationCustomRuleMetadata An `OrganizationCustomRuleMetadata` object. 
     */
    public fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: IResolvable)

    /**
     * An `OrganizationCustomRuleMetadata` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata)
     * @param organizationCustomRuleMetadata An `OrganizationCustomRuleMetadata` object. 
     */
    public
        fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: OrganizationCustomRuleMetadataProperty)

    /**
     * An `OrganizationCustomRuleMetadata` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata)
     * @param organizationCustomRuleMetadata An `OrganizationCustomRuleMetadata` object. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14d1253e88a58a6f7c872973ea8d4b6a3ed2d884444fc96852d29c7c0264e4c5")
    public
        fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: OrganizationCustomRuleMetadataProperty.Builder.() -> Unit)

    /**
     * An `OrganizationManagedRuleMetadata` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata)
     * @param organizationManagedRuleMetadata An `OrganizationManagedRuleMetadata` object. 
     */
    public fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: IResolvable)

    /**
     * An `OrganizationManagedRuleMetadata` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata)
     * @param organizationManagedRuleMetadata An `OrganizationManagedRuleMetadata` object. 
     */
    public
        fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: OrganizationManagedRuleMetadataProperty)

    /**
     * An `OrganizationManagedRuleMetadata` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata)
     * @param organizationManagedRuleMetadata An `OrganizationManagedRuleMetadata` object. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce5e5d3f5c4679b8801db5891aa1ce18dd3cba0f87da01202bf251a711bc4918")
    public
        fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: OrganizationManagedRuleMetadataProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.CfnOrganizationConfigRule.Builder
        = software.amazon.awscdk.services.config.CfnOrganizationConfigRule.Builder.create(scope, id)

    /**
     * A comma-separated list of accounts excluded from organization AWS Config rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-excludedaccounts)
     * @param excludedAccounts A comma-separated list of accounts excluded from organization AWS
     * Config rule. 
     */
    override fun excludedAccounts(excludedAccounts: List<String>) {
      cdkBuilder.excludedAccounts(excludedAccounts)
    }

    /**
     * A comma-separated list of accounts excluded from organization AWS Config rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-excludedaccounts)
     * @param excludedAccounts A comma-separated list of accounts excluded from organization AWS
     * Config rule. 
     */
    override fun excludedAccounts(vararg excludedAccounts: String): Unit =
        excludedAccounts(excludedAccounts.toList())

    /**
     * The name that you assign to organization AWS Config rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationconfigrulename)
     * @param organizationConfigRuleName The name that you assign to organization AWS Config rule. 
     */
    override fun organizationConfigRuleName(organizationConfigRuleName: String) {
      cdkBuilder.organizationConfigRuleName(organizationConfigRuleName)
    }

    /**
     * An object that specifies metadata for your organization's AWS Config Custom Policy rule.
     *
     * The metadata includes the runtime system in use, which accounts have debug logging enabled,
     * and other custom rule metadata, such as resource type, resource ID of AWS resource, and
     * organization trigger types that initiate AWS Config to evaluate AWS resources against a rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata)
     * @param organizationCustomPolicyRuleMetadata An object that specifies metadata for your
     * organization's AWS Config Custom Policy rule. 
     */
    override
        fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: IResolvable) {
      cdkBuilder.organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata.let(IResolvable::unwrap))
    }

    /**
     * An object that specifies metadata for your organization's AWS Config Custom Policy rule.
     *
     * The metadata includes the runtime system in use, which accounts have debug logging enabled,
     * and other custom rule metadata, such as resource type, resource ID of AWS resource, and
     * organization trigger types that initiate AWS Config to evaluate AWS resources against a rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata)
     * @param organizationCustomPolicyRuleMetadata An object that specifies metadata for your
     * organization's AWS Config Custom Policy rule. 
     */
    override
        fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: OrganizationCustomPolicyRuleMetadataProperty) {
      cdkBuilder.organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata.let(OrganizationCustomPolicyRuleMetadataProperty::unwrap))
    }

    /**
     * An object that specifies metadata for your organization's AWS Config Custom Policy rule.
     *
     * The metadata includes the runtime system in use, which accounts have debug logging enabled,
     * and other custom rule metadata, such as resource type, resource ID of AWS resource, and
     * organization trigger types that initiate AWS Config to evaluate AWS resources against a rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata)
     * @param organizationCustomPolicyRuleMetadata An object that specifies metadata for your
     * organization's AWS Config Custom Policy rule. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2f08d08c57d84d7a6c704c25f83bb432876c4800d347cf2104cda2e0914f64c")
    override
        fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: OrganizationCustomPolicyRuleMetadataProperty.Builder.() -> Unit):
        Unit =
        organizationCustomPolicyRuleMetadata(OrganizationCustomPolicyRuleMetadataProperty(organizationCustomPolicyRuleMetadata))

    /**
     * An `OrganizationCustomRuleMetadata` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata)
     * @param organizationCustomRuleMetadata An `OrganizationCustomRuleMetadata` object. 
     */
    override fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: IResolvable) {
      cdkBuilder.organizationCustomRuleMetadata(organizationCustomRuleMetadata.let(IResolvable::unwrap))
    }

    /**
     * An `OrganizationCustomRuleMetadata` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata)
     * @param organizationCustomRuleMetadata An `OrganizationCustomRuleMetadata` object. 
     */
    override
        fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: OrganizationCustomRuleMetadataProperty) {
      cdkBuilder.organizationCustomRuleMetadata(organizationCustomRuleMetadata.let(OrganizationCustomRuleMetadataProperty::unwrap))
    }

    /**
     * An `OrganizationCustomRuleMetadata` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata)
     * @param organizationCustomRuleMetadata An `OrganizationCustomRuleMetadata` object. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14d1253e88a58a6f7c872973ea8d4b6a3ed2d884444fc96852d29c7c0264e4c5")
    override
        fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: OrganizationCustomRuleMetadataProperty.Builder.() -> Unit):
        Unit =
        organizationCustomRuleMetadata(OrganizationCustomRuleMetadataProperty(organizationCustomRuleMetadata))

    /**
     * An `OrganizationManagedRuleMetadata` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata)
     * @param organizationManagedRuleMetadata An `OrganizationManagedRuleMetadata` object. 
     */
    override fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: IResolvable) {
      cdkBuilder.organizationManagedRuleMetadata(organizationManagedRuleMetadata.let(IResolvable::unwrap))
    }

    /**
     * An `OrganizationManagedRuleMetadata` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata)
     * @param organizationManagedRuleMetadata An `OrganizationManagedRuleMetadata` object. 
     */
    override
        fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: OrganizationManagedRuleMetadataProperty) {
      cdkBuilder.organizationManagedRuleMetadata(organizationManagedRuleMetadata.let(OrganizationManagedRuleMetadataProperty::unwrap))
    }

    /**
     * An `OrganizationManagedRuleMetadata` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata)
     * @param organizationManagedRuleMetadata An `OrganizationManagedRuleMetadata` object. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce5e5d3f5c4679b8801db5891aa1ce18dd3cba0f87da01202bf251a711bc4918")
    override
        fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: OrganizationManagedRuleMetadataProperty.Builder.() -> Unit):
        Unit =
        organizationManagedRuleMetadata(OrganizationManagedRuleMetadataProperty(organizationManagedRuleMetadata))

    public fun build(): software.amazon.awscdk.services.config.CfnOrganizationConfigRule =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.config.CfnOrganizationConfigRule.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnOrganizationConfigRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnOrganizationConfigRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnOrganizationConfigRule):
        CfnOrganizationConfigRule = CfnOrganizationConfigRule(cdkObject)

    internal fun unwrap(wrapped: CfnOrganizationConfigRule):
        software.amazon.awscdk.services.config.CfnOrganizationConfigRule = wrapped.cdkObject
  }

  /**
   * An object that specifies organization custom rule metadata such as resource type, resource ID
   * of AWS resource, Lambda function ARN, and organization trigger types that trigger AWS Config to
   * evaluate your AWS resources against a rule.
   *
   * It also provides the frequency with which you want AWS Config to run evaluations for the rule
   * if the trigger type is periodic.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.config.*;
   * OrganizationCustomRuleMetadataProperty organizationCustomRuleMetadataProperty =
   * OrganizationCustomRuleMetadataProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html)
   */
  public interface OrganizationCustomRuleMetadataProperty {
    /**
     * The description that you provide for your organization AWS Config rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * A string, in JSON format, that is passed to your organization AWS Config rule Lambda
     * function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-inputparameters)
     */
    public fun inputParameters(): String? = unwrap(this).getInputParameters()

    /**
     * The lambda function ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-lambdafunctionarn)
     */
    public fun lambdaFunctionArn(): String

    /**
     * The maximum frequency with which AWS Config runs evaluations for a rule.
     *
     * Your custom rule is triggered when AWS Config delivers the configuration snapshot. For more
     * information, see `ConfigSnapshotDeliveryProperties` .
     *
     *
     * By default, rules with a periodic trigger are evaluated every 24 hours. To change the
     * frequency, specify a valid value for the `MaximumExecutionFrequency` parameter.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-maximumexecutionfrequency)
     */
    public fun maximumExecutionFrequency(): String? = unwrap(this).getMaximumExecutionFrequency()

    /**
     * The type of notification that triggers AWS Config to run an evaluation for a rule.
     *
     * You can specify the following notification types:
     *
     * * `ConfigurationItemChangeNotification` - Triggers an evaluation when AWS Config delivers a
     * configuration item as a result of a resource change.
     * * `OversizedConfigurationItemChangeNotification` - Triggers an evaluation when AWS Config
     * delivers an oversized configuration item. AWS Config may generate this notification type when a
     * resource changes and the notification exceeds the maximum size allowed by Amazon SNS.
     * * `ScheduledNotification` - Triggers a periodic evaluation at the frequency specified for
     * `MaximumExecutionFrequency` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-organizationconfigruletriggertypes)
     */
    public fun organizationConfigRuleTriggerTypes(): List<String>

    /**
     * The ID of the AWS resource that was evaluated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-resourceidscope)
     */
    public fun resourceIdScope(): String? = unwrap(this).getResourceIdScope()

    /**
     * The type of the AWS resource that was evaluated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-resourcetypesscope)
     */
    public fun resourceTypesScope(): List<String> = unwrap(this).getResourceTypesScope() ?:
        emptyList()

    /**
     * One part of a key-value pair that make up a tag.
     *
     * A key is a general label that acts like a category for more specific tag values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-tagkeyscope)
     */
    public fun tagKeyScope(): String? = unwrap(this).getTagKeyScope()

    /**
     * The optional part of a key-value pair that make up a tag.
     *
     * A value acts as a descriptor within a tag category (key).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-tagvaluescope)
     */
    public fun tagValueScope(): String? = unwrap(this).getTagValueScope()

    /**
     * A builder for [OrganizationCustomRuleMetadataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description The description that you provide for your organization AWS Config rule.
       */
      public fun description(description: String)

      /**
       * @param inputParameters A string, in JSON format, that is passed to your organization AWS
       * Config rule Lambda function.
       */
      public fun inputParameters(inputParameters: String)

      /**
       * @param lambdaFunctionArn The lambda function ARN. 
       */
      public fun lambdaFunctionArn(lambdaFunctionArn: String)

      /**
       * @param maximumExecutionFrequency The maximum frequency with which AWS Config runs
       * evaluations for a rule.
       * Your custom rule is triggered when AWS Config delivers the configuration snapshot. For more
       * information, see `ConfigSnapshotDeliveryProperties` .
       *
       *
       * By default, rules with a periodic trigger are evaluated every 24 hours. To change the
       * frequency, specify a valid value for the `MaximumExecutionFrequency` parameter.
       */
      public fun maximumExecutionFrequency(maximumExecutionFrequency: String)

      /**
       * @param organizationConfigRuleTriggerTypes The type of notification that triggers AWS Config
       * to run an evaluation for a rule. 
       * You can specify the following notification types:
       *
       * * `ConfigurationItemChangeNotification` - Triggers an evaluation when AWS Config delivers a
       * configuration item as a result of a resource change.
       * * `OversizedConfigurationItemChangeNotification` - Triggers an evaluation when AWS Config
       * delivers an oversized configuration item. AWS Config may generate this notification type when
       * a resource changes and the notification exceeds the maximum size allowed by Amazon SNS.
       * * `ScheduledNotification` - Triggers a periodic evaluation at the frequency specified for
       * `MaximumExecutionFrequency` .
       */
      public
          fun organizationConfigRuleTriggerTypes(organizationConfigRuleTriggerTypes: List<String>)

      /**
       * @param organizationConfigRuleTriggerTypes The type of notification that triggers AWS Config
       * to run an evaluation for a rule. 
       * You can specify the following notification types:
       *
       * * `ConfigurationItemChangeNotification` - Triggers an evaluation when AWS Config delivers a
       * configuration item as a result of a resource change.
       * * `OversizedConfigurationItemChangeNotification` - Triggers an evaluation when AWS Config
       * delivers an oversized configuration item. AWS Config may generate this notification type when
       * a resource changes and the notification exceeds the maximum size allowed by Amazon SNS.
       * * `ScheduledNotification` - Triggers a periodic evaluation at the frequency specified for
       * `MaximumExecutionFrequency` .
       */
      public fun organizationConfigRuleTriggerTypes(vararg
          organizationConfigRuleTriggerTypes: String)

      /**
       * @param resourceIdScope The ID of the AWS resource that was evaluated.
       */
      public fun resourceIdScope(resourceIdScope: String)

      /**
       * @param resourceTypesScope The type of the AWS resource that was evaluated.
       */
      public fun resourceTypesScope(resourceTypesScope: List<String>)

      /**
       * @param resourceTypesScope The type of the AWS resource that was evaluated.
       */
      public fun resourceTypesScope(vararg resourceTypesScope: String)

      /**
       * @param tagKeyScope One part of a key-value pair that make up a tag.
       * A key is a general label that acts like a category for more specific tag values.
       */
      public fun tagKeyScope(tagKeyScope: String)

      /**
       * @param tagValueScope The optional part of a key-value pair that make up a tag.
       * A value acts as a descriptor within a tag category (key).
       */
      public fun tagValueScope(tagValueScope: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty.builder()

      /**
       * @param description The description that you provide for your organization AWS Config rule.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param inputParameters A string, in JSON format, that is passed to your organization AWS
       * Config rule Lambda function.
       */
      override fun inputParameters(inputParameters: String) {
        cdkBuilder.inputParameters(inputParameters)
      }

      /**
       * @param lambdaFunctionArn The lambda function ARN. 
       */
      override fun lambdaFunctionArn(lambdaFunctionArn: String) {
        cdkBuilder.lambdaFunctionArn(lambdaFunctionArn)
      }

      /**
       * @param maximumExecutionFrequency The maximum frequency with which AWS Config runs
       * evaluations for a rule.
       * Your custom rule is triggered when AWS Config delivers the configuration snapshot. For more
       * information, see `ConfigSnapshotDeliveryProperties` .
       *
       *
       * By default, rules with a periodic trigger are evaluated every 24 hours. To change the
       * frequency, specify a valid value for the `MaximumExecutionFrequency` parameter.
       */
      override fun maximumExecutionFrequency(maximumExecutionFrequency: String) {
        cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
      }

      /**
       * @param organizationConfigRuleTriggerTypes The type of notification that triggers AWS Config
       * to run an evaluation for a rule. 
       * You can specify the following notification types:
       *
       * * `ConfigurationItemChangeNotification` - Triggers an evaluation when AWS Config delivers a
       * configuration item as a result of a resource change.
       * * `OversizedConfigurationItemChangeNotification` - Triggers an evaluation when AWS Config
       * delivers an oversized configuration item. AWS Config may generate this notification type when
       * a resource changes and the notification exceeds the maximum size allowed by Amazon SNS.
       * * `ScheduledNotification` - Triggers a periodic evaluation at the frequency specified for
       * `MaximumExecutionFrequency` .
       */
      override
          fun organizationConfigRuleTriggerTypes(organizationConfigRuleTriggerTypes: List<String>) {
        cdkBuilder.organizationConfigRuleTriggerTypes(organizationConfigRuleTriggerTypes)
      }

      /**
       * @param organizationConfigRuleTriggerTypes The type of notification that triggers AWS Config
       * to run an evaluation for a rule. 
       * You can specify the following notification types:
       *
       * * `ConfigurationItemChangeNotification` - Triggers an evaluation when AWS Config delivers a
       * configuration item as a result of a resource change.
       * * `OversizedConfigurationItemChangeNotification` - Triggers an evaluation when AWS Config
       * delivers an oversized configuration item. AWS Config may generate this notification type when
       * a resource changes and the notification exceeds the maximum size allowed by Amazon SNS.
       * * `ScheduledNotification` - Triggers a periodic evaluation at the frequency specified for
       * `MaximumExecutionFrequency` .
       */
      override fun organizationConfigRuleTriggerTypes(vararg
          organizationConfigRuleTriggerTypes: String): Unit =
          organizationConfigRuleTriggerTypes(organizationConfigRuleTriggerTypes.toList())

      /**
       * @param resourceIdScope The ID of the AWS resource that was evaluated.
       */
      override fun resourceIdScope(resourceIdScope: String) {
        cdkBuilder.resourceIdScope(resourceIdScope)
      }

      /**
       * @param resourceTypesScope The type of the AWS resource that was evaluated.
       */
      override fun resourceTypesScope(resourceTypesScope: List<String>) {
        cdkBuilder.resourceTypesScope(resourceTypesScope)
      }

      /**
       * @param resourceTypesScope The type of the AWS resource that was evaluated.
       */
      override fun resourceTypesScope(vararg resourceTypesScope: String): Unit =
          resourceTypesScope(resourceTypesScope.toList())

      /**
       * @param tagKeyScope One part of a key-value pair that make up a tag.
       * A key is a general label that acts like a category for more specific tag values.
       */
      override fun tagKeyScope(tagKeyScope: String) {
        cdkBuilder.tagKeyScope(tagKeyScope)
      }

      /**
       * @param tagValueScope The optional part of a key-value pair that make up a tag.
       * A value acts as a descriptor within a tag category (key).
       */
      override fun tagValueScope(tagValueScope: String) {
        cdkBuilder.tagValueScope(tagValueScope)
      }

      public fun build():
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty,
    ) : CdkObject(cdkObject), OrganizationCustomRuleMetadataProperty {
      /**
       * The description that you provide for your organization AWS Config rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * A string, in JSON format, that is passed to your organization AWS Config rule Lambda
       * function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-inputparameters)
       */
      override fun inputParameters(): String? = unwrap(this).getInputParameters()

      /**
       * The lambda function ARN.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-lambdafunctionarn)
       */
      override fun lambdaFunctionArn(): String = unwrap(this).getLambdaFunctionArn()

      /**
       * The maximum frequency with which AWS Config runs evaluations for a rule.
       *
       * Your custom rule is triggered when AWS Config delivers the configuration snapshot. For more
       * information, see `ConfigSnapshotDeliveryProperties` .
       *
       *
       * By default, rules with a periodic trigger are evaluated every 24 hours. To change the
       * frequency, specify a valid value for the `MaximumExecutionFrequency` parameter.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-maximumexecutionfrequency)
       */
      override fun maximumExecutionFrequency(): String? =
          unwrap(this).getMaximumExecutionFrequency()

      /**
       * The type of notification that triggers AWS Config to run an evaluation for a rule.
       *
       * You can specify the following notification types:
       *
       * * `ConfigurationItemChangeNotification` - Triggers an evaluation when AWS Config delivers a
       * configuration item as a result of a resource change.
       * * `OversizedConfigurationItemChangeNotification` - Triggers an evaluation when AWS Config
       * delivers an oversized configuration item. AWS Config may generate this notification type when
       * a resource changes and the notification exceeds the maximum size allowed by Amazon SNS.
       * * `ScheduledNotification` - Triggers a periodic evaluation at the frequency specified for
       * `MaximumExecutionFrequency` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-organizationconfigruletriggertypes)
       */
      override fun organizationConfigRuleTriggerTypes(): List<String> =
          unwrap(this).getOrganizationConfigRuleTriggerTypes()

      /**
       * The ID of the AWS resource that was evaluated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-resourceidscope)
       */
      override fun resourceIdScope(): String? = unwrap(this).getResourceIdScope()

      /**
       * The type of the AWS resource that was evaluated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-resourcetypesscope)
       */
      override fun resourceTypesScope(): List<String> = unwrap(this).getResourceTypesScope() ?:
          emptyList()

      /**
       * One part of a key-value pair that make up a tag.
       *
       * A key is a general label that acts like a category for more specific tag values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-tagkeyscope)
       */
      override fun tagKeyScope(): String? = unwrap(this).getTagKeyScope()

      /**
       * The optional part of a key-value pair that make up a tag.
       *
       * A value acts as a descriptor within a tag category (key).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-tagvaluescope)
       */
      override fun tagValueScope(): String? = unwrap(this).getTagValueScope()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OrganizationCustomRuleMetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty):
          OrganizationCustomRuleMetadataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OrganizationCustomRuleMetadataProperty):
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty
    }
  }

  /**
   * An object that specifies metadata for your organization's AWS Config Custom Policy rule.
   *
   * The metadata includes the runtime system in use, which accounts have debug logging enabled, and
   * other custom rule metadata, such as resource type, resource ID of AWS resource, and organization
   * trigger types that initiate AWS Config to evaluate AWS resources against a rule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.config.*;
   * OrganizationCustomPolicyRuleMetadataProperty organizationCustomPolicyRuleMetadataProperty =
   * OrganizationCustomPolicyRuleMetadataProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustompolicyrulemetadata.html)
   */
  public interface OrganizationCustomPolicyRuleMetadataProperty {
    /**
     * A list of accounts that you can enable debug logging for your organization AWS Config Custom
     * Policy rule.
     *
     * List is null when debug logging is enabled for all accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustompolicyrulemetadata.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata-debuglogdeliveryaccounts)
     */
    public fun debugLogDeliveryAccounts(): List<String> = unwrap(this).getDebugLogDeliveryAccounts()
        ?: emptyList()

    /**
     * The description that you provide for your organization AWS Config Custom Policy rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustompolicyrulemetadata.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * A string, in JSON format, that is passed to your organization AWS Config Custom Policy rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustompolicyrulemetadata.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata-inputparameters)
     */
    public fun inputParameters(): String? = unwrap(this).getInputParameters()

    /**
     * The maximum frequency with which AWS Config runs evaluations for a rule.
     *
     * Your AWS Config Custom Policy rule is triggered when AWS Config delivers the configuration
     * snapshot. For more information, see `ConfigSnapshotDeliveryProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustompolicyrulemetadata.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata-maximumexecutionfrequency)
     */
    public fun maximumExecutionFrequency(): String? = unwrap(this).getMaximumExecutionFrequency()

    /**
     * The type of notification that initiates AWS Config to run an evaluation for a rule.
     *
     * For AWS Config Custom Policy rules, AWS Config supports change-initiated notification types:
     *
     * * `ConfigurationItemChangeNotification` - Initiates an evaluation when AWS Config delivers a
     * configuration item as a result of a resource change.
     * * `OversizedConfigurationItemChangeNotification` - Initiates an evaluation when AWS Config
     * delivers an oversized configuration item. AWS Config may generate this notification type when a
     * resource changes and the notification exceeds the maximum size allowed by Amazon SNS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustompolicyrulemetadata.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata-organizationconfigruletriggertypes)
     */
    public fun organizationConfigRuleTriggerTypes(): List<String> =
        unwrap(this).getOrganizationConfigRuleTriggerTypes() ?: emptyList()

    /**
     * The policy definition containing the logic for your organization AWS Config Custom Policy
     * rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustompolicyrulemetadata.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata-policytext)
     */
    public fun policyText(): String

    /**
     * The ID of the AWS resource that was evaluated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustompolicyrulemetadata.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata-resourceidscope)
     */
    public fun resourceIdScope(): String? = unwrap(this).getResourceIdScope()

    /**
     * The type of the AWS resource that was evaluated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustompolicyrulemetadata.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata-resourcetypesscope)
     */
    public fun resourceTypesScope(): List<String> = unwrap(this).getResourceTypesScope() ?:
        emptyList()

    /**
     * The runtime system for your organization AWS Config Custom Policy rules.
     *
     * Guard is a policy-as-code language that allows you to write policies that are enforced by AWS
     * Config Custom Policy rules. For more information about Guard, see the [Guard GitHub
     * Repository](https://docs.aws.amazon.com/https://github.com/aws-cloudformation/cloudformation-guard)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustompolicyrulemetadata.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata-runtime)
     */
    public fun runtime(): String

    /**
     * One part of a key-value pair that make up a tag.
     *
     * A key is a general label that acts like a category for more specific tag values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustompolicyrulemetadata.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata-tagkeyscope)
     */
    public fun tagKeyScope(): String? = unwrap(this).getTagKeyScope()

    /**
     * The optional part of a key-value pair that make up a tag.
     *
     * A value acts as a descriptor within a tag category (key).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustompolicyrulemetadata.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata-tagvaluescope)
     */
    public fun tagValueScope(): String? = unwrap(this).getTagValueScope()

    /**
     * A builder for [OrganizationCustomPolicyRuleMetadataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param debugLogDeliveryAccounts A list of accounts that you can enable debug logging for
       * your organization AWS Config Custom Policy rule.
       * List is null when debug logging is enabled for all accounts.
       */
      public fun debugLogDeliveryAccounts(debugLogDeliveryAccounts: List<String>)

      /**
       * @param debugLogDeliveryAccounts A list of accounts that you can enable debug logging for
       * your organization AWS Config Custom Policy rule.
       * List is null when debug logging is enabled for all accounts.
       */
      public fun debugLogDeliveryAccounts(vararg debugLogDeliveryAccounts: String)

      /**
       * @param description The description that you provide for your organization AWS Config Custom
       * Policy rule.
       */
      public fun description(description: String)

      /**
       * @param inputParameters A string, in JSON format, that is passed to your organization AWS
       * Config Custom Policy rule.
       */
      public fun inputParameters(inputParameters: String)

      /**
       * @param maximumExecutionFrequency The maximum frequency with which AWS Config runs
       * evaluations for a rule.
       * Your AWS Config Custom Policy rule is triggered when AWS Config delivers the configuration
       * snapshot. For more information, see `ConfigSnapshotDeliveryProperties` .
       */
      public fun maximumExecutionFrequency(maximumExecutionFrequency: String)

      /**
       * @param organizationConfigRuleTriggerTypes The type of notification that initiates AWS
       * Config to run an evaluation for a rule.
       * For AWS Config Custom Policy rules, AWS Config supports change-initiated notification
       * types:
       *
       * * `ConfigurationItemChangeNotification` - Initiates an evaluation when AWS Config delivers
       * a configuration item as a result of a resource change.
       * * `OversizedConfigurationItemChangeNotification` - Initiates an evaluation when AWS Config
       * delivers an oversized configuration item. AWS Config may generate this notification type when
       * a resource changes and the notification exceeds the maximum size allowed by Amazon SNS.
       */
      public
          fun organizationConfigRuleTriggerTypes(organizationConfigRuleTriggerTypes: List<String>)

      /**
       * @param organizationConfigRuleTriggerTypes The type of notification that initiates AWS
       * Config to run an evaluation for a rule.
       * For AWS Config Custom Policy rules, AWS Config supports change-initiated notification
       * types:
       *
       * * `ConfigurationItemChangeNotification` - Initiates an evaluation when AWS Config delivers
       * a configuration item as a result of a resource change.
       * * `OversizedConfigurationItemChangeNotification` - Initiates an evaluation when AWS Config
       * delivers an oversized configuration item. AWS Config may generate this notification type when
       * a resource changes and the notification exceeds the maximum size allowed by Amazon SNS.
       */
      public fun organizationConfigRuleTriggerTypes(vararg
          organizationConfigRuleTriggerTypes: String)

      /**
       * @param policyText The policy definition containing the logic for your organization AWS
       * Config Custom Policy rule. 
       */
      public fun policyText(policyText: String)

      /**
       * @param resourceIdScope The ID of the AWS resource that was evaluated.
       */
      public fun resourceIdScope(resourceIdScope: String)

      /**
       * @param resourceTypesScope The type of the AWS resource that was evaluated.
       */
      public fun resourceTypesScope(resourceTypesScope: List<String>)

      /**
       * @param resourceTypesScope The type of the AWS resource that was evaluated.
       */
      public fun resourceTypesScope(vararg resourceTypesScope: String)

      /**
       * @param runtime The runtime system for your organization AWS Config Custom Policy rules. 
       * Guard is a policy-as-code language that allows you to write policies that are enforced by
       * AWS Config Custom Policy rules. For more information about Guard, see the [Guard GitHub
       * Repository](https://docs.aws.amazon.com/https://github.com/aws-cloudformation/cloudformation-guard)
       * .
       */
      public fun runtime(runtime: String)

      /**
       * @param tagKeyScope One part of a key-value pair that make up a tag.
       * A key is a general label that acts like a category for more specific tag values.
       */
      public fun tagKeyScope(tagKeyScope: String)

      /**
       * @param tagValueScope The optional part of a key-value pair that make up a tag.
       * A value acts as a descriptor within a tag category (key).
       */
      public fun tagValueScope(tagValueScope: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty.builder()

      /**
       * @param debugLogDeliveryAccounts A list of accounts that you can enable debug logging for
       * your organization AWS Config Custom Policy rule.
       * List is null when debug logging is enabled for all accounts.
       */
      override fun debugLogDeliveryAccounts(debugLogDeliveryAccounts: List<String>) {
        cdkBuilder.debugLogDeliveryAccounts(debugLogDeliveryAccounts)
      }

      /**
       * @param debugLogDeliveryAccounts A list of accounts that you can enable debug logging for
       * your organization AWS Config Custom Policy rule.
       * List is null when debug logging is enabled for all accounts.
       */
      override fun debugLogDeliveryAccounts(vararg debugLogDeliveryAccounts: String): Unit =
          debugLogDeliveryAccounts(debugLogDeliveryAccounts.toList())

      /**
       * @param description The description that you provide for your organization AWS Config Custom
       * Policy rule.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param inputParameters A string, in JSON format, that is passed to your organization AWS
       * Config Custom Policy rule.
       */
      override fun inputParameters(inputParameters: String) {
        cdkBuilder.inputParameters(inputParameters)
      }

      /**
       * @param maximumExecutionFrequency The maximum frequency with which AWS Config runs
       * evaluations for a rule.
       * Your AWS Config Custom Policy rule is triggered when AWS Config delivers the configuration
       * snapshot. For more information, see `ConfigSnapshotDeliveryProperties` .
       */
      override fun maximumExecutionFrequency(maximumExecutionFrequency: String) {
        cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
      }

      /**
       * @param organizationConfigRuleTriggerTypes The type of notification that initiates AWS
       * Config to run an evaluation for a rule.
       * For AWS Config Custom Policy rules, AWS Config supports change-initiated notification
       * types:
       *
       * * `ConfigurationItemChangeNotification` - Initiates an evaluation when AWS Config delivers
       * a configuration item as a result of a resource change.
       * * `OversizedConfigurationItemChangeNotification` - Initiates an evaluation when AWS Config
       * delivers an oversized configuration item. AWS Config may generate this notification type when
       * a resource changes and the notification exceeds the maximum size allowed by Amazon SNS.
       */
      override
          fun organizationConfigRuleTriggerTypes(organizationConfigRuleTriggerTypes: List<String>) {
        cdkBuilder.organizationConfigRuleTriggerTypes(organizationConfigRuleTriggerTypes)
      }

      /**
       * @param organizationConfigRuleTriggerTypes The type of notification that initiates AWS
       * Config to run an evaluation for a rule.
       * For AWS Config Custom Policy rules, AWS Config supports change-initiated notification
       * types:
       *
       * * `ConfigurationItemChangeNotification` - Initiates an evaluation when AWS Config delivers
       * a configuration item as a result of a resource change.
       * * `OversizedConfigurationItemChangeNotification` - Initiates an evaluation when AWS Config
       * delivers an oversized configuration item. AWS Config may generate this notification type when
       * a resource changes and the notification exceeds the maximum size allowed by Amazon SNS.
       */
      override fun organizationConfigRuleTriggerTypes(vararg
          organizationConfigRuleTriggerTypes: String): Unit =
          organizationConfigRuleTriggerTypes(organizationConfigRuleTriggerTypes.toList())

      /**
       * @param policyText The policy definition containing the logic for your organization AWS
       * Config Custom Policy rule. 
       */
      override fun policyText(policyText: String) {
        cdkBuilder.policyText(policyText)
      }

      /**
       * @param resourceIdScope The ID of the AWS resource that was evaluated.
       */
      override fun resourceIdScope(resourceIdScope: String) {
        cdkBuilder.resourceIdScope(resourceIdScope)
      }

      /**
       * @param resourceTypesScope The type of the AWS resource that was evaluated.
       */
      override fun resourceTypesScope(resourceTypesScope: List<String>) {
        cdkBuilder.resourceTypesScope(resourceTypesScope)
      }

      /**
       * @param resourceTypesScope The type of the AWS resource that was evaluated.
       */
      override fun resourceTypesScope(vararg resourceTypesScope: String): Unit =
          resourceTypesScope(resourceTypesScope.toList())

      /**
       * @param runtime The runtime system for your organization AWS Config Custom Policy rules. 
       * Guard is a policy-as-code language that allows you to write policies that are enforced by
       * AWS Config Custom Policy rules. For more information about Guard, see the [Guard GitHub
       * Repository](https://docs.aws.amazon.com/https://github.com/aws-cloudformation/cloudformation-guard)
       * .
       */
      override fun runtime(runtime: String) {
        cdkBuilder.runtime(runtime)
      }

      /**
       * @param tagKeyScope One part of a key-value pair that make up a tag.
       * A key is a general label that acts like a category for more specific tag values.
       */
      override fun tagKeyScope(tagKeyScope: String) {
        cdkBuilder.tagKeyScope(tagKeyScope)
      }

      /**
       * @param tagValueScope The optional part of a key-value pair that make up a tag.
       * A value acts as a descriptor within a tag category (key).
       */
      override fun tagValueScope(tagValueScope: String) {
        cdkBuilder.tagValueScope(tagValueScope)
      }

      public fun build():
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty,
    ) : CdkObject(cdkObject), OrganizationCustomPolicyRuleMetadataProperty {
      /**
       * A list of accounts that you can enable debug logging for your organization AWS Config
       * Custom Policy rule.
       *
       * List is null when debug logging is enabled for all accounts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustompolicyrulemetadata.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata-debuglogdeliveryaccounts)
       */
      override fun debugLogDeliveryAccounts(): List<String> =
          unwrap(this).getDebugLogDeliveryAccounts() ?: emptyList()

      /**
       * The description that you provide for your organization AWS Config Custom Policy rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustompolicyrulemetadata.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * A string, in JSON format, that is passed to your organization AWS Config Custom Policy
       * rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustompolicyrulemetadata.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata-inputparameters)
       */
      override fun inputParameters(): String? = unwrap(this).getInputParameters()

      /**
       * The maximum frequency with which AWS Config runs evaluations for a rule.
       *
       * Your AWS Config Custom Policy rule is triggered when AWS Config delivers the configuration
       * snapshot. For more information, see `ConfigSnapshotDeliveryProperties` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustompolicyrulemetadata.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata-maximumexecutionfrequency)
       */
      override fun maximumExecutionFrequency(): String? =
          unwrap(this).getMaximumExecutionFrequency()

      /**
       * The type of notification that initiates AWS Config to run an evaluation for a rule.
       *
       * For AWS Config Custom Policy rules, AWS Config supports change-initiated notification
       * types:
       *
       * * `ConfigurationItemChangeNotification` - Initiates an evaluation when AWS Config delivers
       * a configuration item as a result of a resource change.
       * * `OversizedConfigurationItemChangeNotification` - Initiates an evaluation when AWS Config
       * delivers an oversized configuration item. AWS Config may generate this notification type when
       * a resource changes and the notification exceeds the maximum size allowed by Amazon SNS.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustompolicyrulemetadata.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata-organizationconfigruletriggertypes)
       */
      override fun organizationConfigRuleTriggerTypes(): List<String> =
          unwrap(this).getOrganizationConfigRuleTriggerTypes() ?: emptyList()

      /**
       * The policy definition containing the logic for your organization AWS Config Custom Policy
       * rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustompolicyrulemetadata.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata-policytext)
       */
      override fun policyText(): String = unwrap(this).getPolicyText()

      /**
       * The ID of the AWS resource that was evaluated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustompolicyrulemetadata.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata-resourceidscope)
       */
      override fun resourceIdScope(): String? = unwrap(this).getResourceIdScope()

      /**
       * The type of the AWS resource that was evaluated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustompolicyrulemetadata.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata-resourcetypesscope)
       */
      override fun resourceTypesScope(): List<String> = unwrap(this).getResourceTypesScope() ?:
          emptyList()

      /**
       * The runtime system for your organization AWS Config Custom Policy rules.
       *
       * Guard is a policy-as-code language that allows you to write policies that are enforced by
       * AWS Config Custom Policy rules. For more information about Guard, see the [Guard GitHub
       * Repository](https://docs.aws.amazon.com/https://github.com/aws-cloudformation/cloudformation-guard)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustompolicyrulemetadata.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata-runtime)
       */
      override fun runtime(): String = unwrap(this).getRuntime()

      /**
       * One part of a key-value pair that make up a tag.
       *
       * A key is a general label that acts like a category for more specific tag values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustompolicyrulemetadata.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata-tagkeyscope)
       */
      override fun tagKeyScope(): String? = unwrap(this).getTagKeyScope()

      /**
       * The optional part of a key-value pair that make up a tag.
       *
       * A value acts as a descriptor within a tag category (key).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustompolicyrulemetadata.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata-tagvaluescope)
       */
      override fun tagValueScope(): String? = unwrap(this).getTagValueScope()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OrganizationCustomPolicyRuleMetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty):
          OrganizationCustomPolicyRuleMetadataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OrganizationCustomPolicyRuleMetadataProperty):
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty
    }
  }

  /**
   * An object that specifies organization managed rule metadata such as resource type and ID of AWS
   * resource along with the rule identifier.
   *
   * It also provides the frequency with which you want AWS Config to run evaluations for the rule
   * if the trigger type is periodic.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.config.*;
   * OrganizationManagedRuleMetadataProperty organizationManagedRuleMetadataProperty =
   * OrganizationManagedRuleMetadataProperty.builder()
   * .ruleIdentifier("ruleIdentifier")
   * // the properties below are optional
   * .description("description")
   * .inputParameters("inputParameters")
   * .maximumExecutionFrequency("maximumExecutionFrequency")
   * .resourceIdScope("resourceIdScope")
   * .resourceTypesScope(List.of("resourceTypesScope"))
   * .tagKeyScope("tagKeyScope")
   * .tagValueScope("tagValueScope")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html)
   */
  public interface OrganizationManagedRuleMetadataProperty {
    /**
     * The description that you provide for your organization AWS Config rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * A string, in JSON format, that is passed to your organization AWS Config rule Lambda
     * function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-inputparameters)
     */
    public fun inputParameters(): String? = unwrap(this).getInputParameters()

    /**
     * The maximum frequency with which AWS Config runs evaluations for a rule.
     *
     * This is for an AWS Config managed rule that is triggered at a periodic frequency.
     *
     *
     * By default, rules with a periodic trigger are evaluated every 24 hours. To change the
     * frequency, specify a valid value for the `MaximumExecutionFrequency` parameter.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-maximumexecutionfrequency)
     */
    public fun maximumExecutionFrequency(): String? = unwrap(this).getMaximumExecutionFrequency()

    /**
     * The ID of the AWS resource that was evaluated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-resourceidscope)
     */
    public fun resourceIdScope(): String? = unwrap(this).getResourceIdScope()

    /**
     * The type of the AWS resource that was evaluated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-resourcetypesscope)
     */
    public fun resourceTypesScope(): List<String> = unwrap(this).getResourceTypesScope() ?:
        emptyList()

    /**
     * For organization config managed rules, a predefined identifier from a list.
     *
     * For example, `IAM_PASSWORD_POLICY` is a managed rule. To reference a managed rule, see [Using
     * AWS Config managed
     * rules](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-ruleidentifier)
     */
    public fun ruleIdentifier(): String

    /**
     * One part of a key-value pair that make up a tag.
     *
     * A key is a general label that acts like a category for more specific tag values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-tagkeyscope)
     */
    public fun tagKeyScope(): String? = unwrap(this).getTagKeyScope()

    /**
     * The optional part of a key-value pair that make up a tag.
     *
     * A value acts as a descriptor within a tag category (key).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-tagvaluescope)
     */
    public fun tagValueScope(): String? = unwrap(this).getTagValueScope()

    /**
     * A builder for [OrganizationManagedRuleMetadataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description The description that you provide for your organization AWS Config rule.
       */
      public fun description(description: String)

      /**
       * @param inputParameters A string, in JSON format, that is passed to your organization AWS
       * Config rule Lambda function.
       */
      public fun inputParameters(inputParameters: String)

      /**
       * @param maximumExecutionFrequency The maximum frequency with which AWS Config runs
       * evaluations for a rule.
       * This is for an AWS Config managed rule that is triggered at a periodic frequency.
       *
       *
       * By default, rules with a periodic trigger are evaluated every 24 hours. To change the
       * frequency, specify a valid value for the `MaximumExecutionFrequency` parameter.
       */
      public fun maximumExecutionFrequency(maximumExecutionFrequency: String)

      /**
       * @param resourceIdScope The ID of the AWS resource that was evaluated.
       */
      public fun resourceIdScope(resourceIdScope: String)

      /**
       * @param resourceTypesScope The type of the AWS resource that was evaluated.
       */
      public fun resourceTypesScope(resourceTypesScope: List<String>)

      /**
       * @param resourceTypesScope The type of the AWS resource that was evaluated.
       */
      public fun resourceTypesScope(vararg resourceTypesScope: String)

      /**
       * @param ruleIdentifier For organization config managed rules, a predefined identifier from a
       * list. 
       * For example, `IAM_PASSWORD_POLICY` is a managed rule. To reference a managed rule, see
       * [Using AWS Config managed
       * rules](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html)
       * .
       */
      public fun ruleIdentifier(ruleIdentifier: String)

      /**
       * @param tagKeyScope One part of a key-value pair that make up a tag.
       * A key is a general label that acts like a category for more specific tag values.
       */
      public fun tagKeyScope(tagKeyScope: String)

      /**
       * @param tagValueScope The optional part of a key-value pair that make up a tag.
       * A value acts as a descriptor within a tag category (key).
       */
      public fun tagValueScope(tagValueScope: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty.builder()

      /**
       * @param description The description that you provide for your organization AWS Config rule.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param inputParameters A string, in JSON format, that is passed to your organization AWS
       * Config rule Lambda function.
       */
      override fun inputParameters(inputParameters: String) {
        cdkBuilder.inputParameters(inputParameters)
      }

      /**
       * @param maximumExecutionFrequency The maximum frequency with which AWS Config runs
       * evaluations for a rule.
       * This is for an AWS Config managed rule that is triggered at a periodic frequency.
       *
       *
       * By default, rules with a periodic trigger are evaluated every 24 hours. To change the
       * frequency, specify a valid value for the `MaximumExecutionFrequency` parameter.
       */
      override fun maximumExecutionFrequency(maximumExecutionFrequency: String) {
        cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
      }

      /**
       * @param resourceIdScope The ID of the AWS resource that was evaluated.
       */
      override fun resourceIdScope(resourceIdScope: String) {
        cdkBuilder.resourceIdScope(resourceIdScope)
      }

      /**
       * @param resourceTypesScope The type of the AWS resource that was evaluated.
       */
      override fun resourceTypesScope(resourceTypesScope: List<String>) {
        cdkBuilder.resourceTypesScope(resourceTypesScope)
      }

      /**
       * @param resourceTypesScope The type of the AWS resource that was evaluated.
       */
      override fun resourceTypesScope(vararg resourceTypesScope: String): Unit =
          resourceTypesScope(resourceTypesScope.toList())

      /**
       * @param ruleIdentifier For organization config managed rules, a predefined identifier from a
       * list. 
       * For example, `IAM_PASSWORD_POLICY` is a managed rule. To reference a managed rule, see
       * [Using AWS Config managed
       * rules](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html)
       * .
       */
      override fun ruleIdentifier(ruleIdentifier: String) {
        cdkBuilder.ruleIdentifier(ruleIdentifier)
      }

      /**
       * @param tagKeyScope One part of a key-value pair that make up a tag.
       * A key is a general label that acts like a category for more specific tag values.
       */
      override fun tagKeyScope(tagKeyScope: String) {
        cdkBuilder.tagKeyScope(tagKeyScope)
      }

      /**
       * @param tagValueScope The optional part of a key-value pair that make up a tag.
       * A value acts as a descriptor within a tag category (key).
       */
      override fun tagValueScope(tagValueScope: String) {
        cdkBuilder.tagValueScope(tagValueScope)
      }

      public fun build():
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty,
    ) : CdkObject(cdkObject), OrganizationManagedRuleMetadataProperty {
      /**
       * The description that you provide for your organization AWS Config rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * A string, in JSON format, that is passed to your organization AWS Config rule Lambda
       * function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-inputparameters)
       */
      override fun inputParameters(): String? = unwrap(this).getInputParameters()

      /**
       * The maximum frequency with which AWS Config runs evaluations for a rule.
       *
       * This is for an AWS Config managed rule that is triggered at a periodic frequency.
       *
       *
       * By default, rules with a periodic trigger are evaluated every 24 hours. To change the
       * frequency, specify a valid value for the `MaximumExecutionFrequency` parameter.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-maximumexecutionfrequency)
       */
      override fun maximumExecutionFrequency(): String? =
          unwrap(this).getMaximumExecutionFrequency()

      /**
       * The ID of the AWS resource that was evaluated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-resourceidscope)
       */
      override fun resourceIdScope(): String? = unwrap(this).getResourceIdScope()

      /**
       * The type of the AWS resource that was evaluated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-resourcetypesscope)
       */
      override fun resourceTypesScope(): List<String> = unwrap(this).getResourceTypesScope() ?:
          emptyList()

      /**
       * For organization config managed rules, a predefined identifier from a list.
       *
       * For example, `IAM_PASSWORD_POLICY` is a managed rule. To reference a managed rule, see
       * [Using AWS Config managed
       * rules](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-ruleidentifier)
       */
      override fun ruleIdentifier(): String = unwrap(this).getRuleIdentifier()

      /**
       * One part of a key-value pair that make up a tag.
       *
       * A key is a general label that acts like a category for more specific tag values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-tagkeyscope)
       */
      override fun tagKeyScope(): String? = unwrap(this).getTagKeyScope()

      /**
       * The optional part of a key-value pair that make up a tag.
       *
       * A value acts as a descriptor within a tag category (key).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-tagvaluescope)
       */
      override fun tagValueScope(): String? = unwrap(this).getTagValueScope()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OrganizationManagedRuleMetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty):
          OrganizationManagedRuleMetadataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OrganizationManagedRuleMetadataProperty):
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty
    }
  }
}
