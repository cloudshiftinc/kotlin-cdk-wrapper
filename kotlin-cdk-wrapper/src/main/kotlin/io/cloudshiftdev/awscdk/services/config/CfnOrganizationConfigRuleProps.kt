@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnOrganizationConfigRule`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.config.*;
 * CfnOrganizationConfigRuleProps cfnOrganizationConfigRuleProps =
 * CfnOrganizationConfigRuleProps.builder()
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
public interface CfnOrganizationConfigRuleProps {
  /**
   * A comma-separated list of accounts excluded from organization AWS Config rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-excludedaccounts)
   */
  public fun excludedAccounts(): List<String> = unwrap(this).getExcludedAccounts() ?: emptyList()

  /**
   * The name that you assign to organization AWS Config rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationconfigrulename)
   */
  public fun organizationConfigRuleName(): String

  /**
   * An object that specifies metadata for your organization's AWS Config Custom Policy rule.
   *
   * The metadata includes the runtime system in use, which accounts have debug logging enabled, and
   * other custom rule metadata, such as resource type, resource ID of AWS resource, and organization
   * trigger types that initiate AWS Config to evaluate AWS resources against a rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata)
   */
  public fun organizationCustomPolicyRuleMetadata(): Any? =
      unwrap(this).getOrganizationCustomPolicyRuleMetadata()

  /**
   * An `OrganizationCustomRuleMetadata` object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata)
   */
  public fun organizationCustomRuleMetadata(): Any? =
      unwrap(this).getOrganizationCustomRuleMetadata()

  /**
   * An `OrganizationManagedRuleMetadata` object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata)
   */
  public fun organizationManagedRuleMetadata(): Any? =
      unwrap(this).getOrganizationManagedRuleMetadata()

  /**
   * A builder for [CfnOrganizationConfigRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param excludedAccounts A comma-separated list of accounts excluded from organization AWS
     * Config rule.
     */
    public fun excludedAccounts(excludedAccounts: List<String>)

    /**
     * @param excludedAccounts A comma-separated list of accounts excluded from organization AWS
     * Config rule.
     */
    public fun excludedAccounts(vararg excludedAccounts: String)

    /**
     * @param organizationConfigRuleName The name that you assign to organization AWS Config rule. 
     */
    public fun organizationConfigRuleName(organizationConfigRuleName: String)

    /**
     * @param organizationCustomPolicyRuleMetadata An object that specifies metadata for your
     * organization's AWS Config Custom Policy rule.
     * The metadata includes the runtime system in use, which accounts have debug logging enabled,
     * and other custom rule metadata, such as resource type, resource ID of AWS resource, and
     * organization trigger types that initiate AWS Config to evaluate AWS resources against a rule.
     */
    public
        fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: IResolvable)

    /**
     * @param organizationCustomPolicyRuleMetadata An object that specifies metadata for your
     * organization's AWS Config Custom Policy rule.
     * The metadata includes the runtime system in use, which accounts have debug logging enabled,
     * and other custom rule metadata, such as resource type, resource ID of AWS resource, and
     * organization trigger types that initiate AWS Config to evaluate AWS resources against a rule.
     */
    public
        fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty)

    /**
     * @param organizationCustomPolicyRuleMetadata An object that specifies metadata for your
     * organization's AWS Config Custom Policy rule.
     * The metadata includes the runtime system in use, which accounts have debug logging enabled,
     * and other custom rule metadata, such as resource type, resource ID of AWS resource, and
     * organization trigger types that initiate AWS Config to evaluate AWS resources against a rule.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1a0e988943eae2bfc904bda66f978abd35df8df62b3af327f461b73b3c381fe")
    public
        fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty.Builder.() -> Unit)

    /**
     * @param organizationCustomRuleMetadata An `OrganizationCustomRuleMetadata` object.
     */
    public fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: IResolvable)

    /**
     * @param organizationCustomRuleMetadata An `OrganizationCustomRuleMetadata` object.
     */
    public
        fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty)

    /**
     * @param organizationCustomRuleMetadata An `OrganizationCustomRuleMetadata` object.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("850fcefb60f23d579ef73857665738fc525e01a22608109cc4fac7150b48699b")
    public
        fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty.Builder.() -> Unit)

    /**
     * @param organizationManagedRuleMetadata An `OrganizationManagedRuleMetadata` object.
     */
    public fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: IResolvable)

    /**
     * @param organizationManagedRuleMetadata An `OrganizationManagedRuleMetadata` object.
     */
    public
        fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty)

    /**
     * @param organizationManagedRuleMetadata An `OrganizationManagedRuleMetadata` object.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4b35ddfc779a5499619c12578df9a2fb270f1dbc77cb8685d59278d6e3c8697")
    public
        fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.config.CfnOrganizationConfigRuleProps.Builder =
        software.amazon.awscdk.services.config.CfnOrganizationConfigRuleProps.builder()

    /**
     * @param excludedAccounts A comma-separated list of accounts excluded from organization AWS
     * Config rule.
     */
    override fun excludedAccounts(excludedAccounts: List<String>) {
      cdkBuilder.excludedAccounts(excludedAccounts)
    }

    /**
     * @param excludedAccounts A comma-separated list of accounts excluded from organization AWS
     * Config rule.
     */
    override fun excludedAccounts(vararg excludedAccounts: String): Unit =
        excludedAccounts(excludedAccounts.toList())

    /**
     * @param organizationConfigRuleName The name that you assign to organization AWS Config rule. 
     */
    override fun organizationConfigRuleName(organizationConfigRuleName: String) {
      cdkBuilder.organizationConfigRuleName(organizationConfigRuleName)
    }

    /**
     * @param organizationCustomPolicyRuleMetadata An object that specifies metadata for your
     * organization's AWS Config Custom Policy rule.
     * The metadata includes the runtime system in use, which accounts have debug logging enabled,
     * and other custom rule metadata, such as resource type, resource ID of AWS resource, and
     * organization trigger types that initiate AWS Config to evaluate AWS resources against a rule.
     */
    override
        fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: IResolvable) {
      cdkBuilder.organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata.let(IResolvable::unwrap))
    }

    /**
     * @param organizationCustomPolicyRuleMetadata An object that specifies metadata for your
     * organization's AWS Config Custom Policy rule.
     * The metadata includes the runtime system in use, which accounts have debug logging enabled,
     * and other custom rule metadata, such as resource type, resource ID of AWS resource, and
     * organization trigger types that initiate AWS Config to evaluate AWS resources against a rule.
     */
    override
        fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty) {
      cdkBuilder.organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata.let(CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty::unwrap))
    }

    /**
     * @param organizationCustomPolicyRuleMetadata An object that specifies metadata for your
     * organization's AWS Config Custom Policy rule.
     * The metadata includes the runtime system in use, which accounts have debug logging enabled,
     * and other custom rule metadata, such as resource type, resource ID of AWS resource, and
     * organization trigger types that initiate AWS Config to evaluate AWS resources against a rule.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1a0e988943eae2bfc904bda66f978abd35df8df62b3af327f461b73b3c381fe")
    override
        fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty.Builder.() -> Unit):
        Unit =
        organizationCustomPolicyRuleMetadata(CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty(organizationCustomPolicyRuleMetadata))

    /**
     * @param organizationCustomRuleMetadata An `OrganizationCustomRuleMetadata` object.
     */
    override fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: IResolvable) {
      cdkBuilder.organizationCustomRuleMetadata(organizationCustomRuleMetadata.let(IResolvable::unwrap))
    }

    /**
     * @param organizationCustomRuleMetadata An `OrganizationCustomRuleMetadata` object.
     */
    override
        fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty) {
      cdkBuilder.organizationCustomRuleMetadata(organizationCustomRuleMetadata.let(CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty::unwrap))
    }

    /**
     * @param organizationCustomRuleMetadata An `OrganizationCustomRuleMetadata` object.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("850fcefb60f23d579ef73857665738fc525e01a22608109cc4fac7150b48699b")
    override
        fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty.Builder.() -> Unit):
        Unit =
        organizationCustomRuleMetadata(CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty(organizationCustomRuleMetadata))

    /**
     * @param organizationManagedRuleMetadata An `OrganizationManagedRuleMetadata` object.
     */
    override fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: IResolvable) {
      cdkBuilder.organizationManagedRuleMetadata(organizationManagedRuleMetadata.let(IResolvable::unwrap))
    }

    /**
     * @param organizationManagedRuleMetadata An `OrganizationManagedRuleMetadata` object.
     */
    override
        fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty) {
      cdkBuilder.organizationManagedRuleMetadata(organizationManagedRuleMetadata.let(CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty::unwrap))
    }

    /**
     * @param organizationManagedRuleMetadata An `OrganizationManagedRuleMetadata` object.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4b35ddfc779a5499619c12578df9a2fb270f1dbc77cb8685d59278d6e3c8697")
    override
        fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty.Builder.() -> Unit):
        Unit =
        organizationManagedRuleMetadata(CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty(organizationManagedRuleMetadata))

    public fun build(): software.amazon.awscdk.services.config.CfnOrganizationConfigRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.config.CfnOrganizationConfigRuleProps,
  ) : CdkObject(cdkObject), CfnOrganizationConfigRuleProps {
    /**
     * A comma-separated list of accounts excluded from organization AWS Config rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-excludedaccounts)
     */
    override fun excludedAccounts(): List<String> = unwrap(this).getExcludedAccounts() ?:
        emptyList()

    /**
     * The name that you assign to organization AWS Config rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationconfigrulename)
     */
    override fun organizationConfigRuleName(): String = unwrap(this).getOrganizationConfigRuleName()

    /**
     * An object that specifies metadata for your organization's AWS Config Custom Policy rule.
     *
     * The metadata includes the runtime system in use, which accounts have debug logging enabled,
     * and other custom rule metadata, such as resource type, resource ID of AWS resource, and
     * organization trigger types that initiate AWS Config to evaluate AWS resources against a rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata)
     */
    override fun organizationCustomPolicyRuleMetadata(): Any? =
        unwrap(this).getOrganizationCustomPolicyRuleMetadata()

    /**
     * An `OrganizationCustomRuleMetadata` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata)
     */
    override fun organizationCustomRuleMetadata(): Any? =
        unwrap(this).getOrganizationCustomRuleMetadata()

    /**
     * An `OrganizationManagedRuleMetadata` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata)
     */
    override fun organizationManagedRuleMetadata(): Any? =
        unwrap(this).getOrganizationManagedRuleMetadata()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnOrganizationConfigRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnOrganizationConfigRuleProps):
        CfnOrganizationConfigRuleProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnOrganizationConfigRuleProps

    internal fun unwrap(wrapped: CfnOrganizationConfigRuleProps):
        software.amazon.awscdk.services.config.CfnOrganizationConfigRuleProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.config.CfnOrganizationConfigRuleProps
  }
}
