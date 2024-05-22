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
 * Properties for defining a `CfnConfigRule`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.config.*;
 * Object inputParameters;
 * CfnConfigRuleProps cfnConfigRuleProps = CfnConfigRuleProps.builder()
 * .source(SourceProperty.builder()
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
 * .build())
 * // the properties below are optional
 * .compliance(ComplianceProperty.builder()
 * .type("type")
 * .build())
 * .configRuleName("configRuleName")
 * .description("description")
 * .evaluationModes(List.of(EvaluationModeConfigurationProperty.builder()
 * .mode("mode")
 * .build()))
 * .inputParameters(inputParameters)
 * .maximumExecutionFrequency("maximumExecutionFrequency")
 * .scope(ScopeProperty.builder()
 * .complianceResourceId("complianceResourceId")
 * .complianceResourceTypes(List.of("complianceResourceTypes"))
 * .tagKey("tagKey")
 * .tagValue("tagValue")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html)
 */
public interface CfnConfigRuleProps {
  /**
   * Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of
   * contributors that affect the compliance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-compliance)
   */
  public fun compliance(): Any? = unwrap(this).getCompliance()

  /**
   * A name for the AWS Config rule.
   *
   * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID
   * for the rule name. For more information, see [Name
   * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-configrulename)
   */
  public fun configRuleName(): String? = unwrap(this).getConfigRuleName()

  /**
   * The description that you provide for the AWS Config rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The modes the AWS Config rule can be evaluated in.
   *
   * The valid values are distinct objects. By default, the value is Detective evaluation mode only.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-evaluationmodes)
   */
  public fun evaluationModes(): Any? = unwrap(this).getEvaluationModes()

  /**
   * A string, in JSON format, that is passed to the AWS Config rule Lambda function.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-inputparameters)
   */
  public fun inputParameters(): Any? = unwrap(this).getInputParameters()

  /**
   * The maximum frequency with which AWS Config runs evaluations for a rule.
   *
   * You can specify a value for `MaximumExecutionFrequency` when:
   *
   * * You are using an AWS managed rule that is triggered at a periodic frequency.
   * * Your custom rule is triggered when AWS Config delivers the configuration snapshot. For more
   * information, see
   * [ConfigSnapshotDeliveryProperties](https://docs.aws.amazon.com/config/latest/APIReference/API_ConfigSnapshotDeliveryProperties.html)
   * .
   *
   *
   * By default, rules with a periodic trigger are evaluated every 24 hours. To change the
   * frequency, specify a valid value for the `MaximumExecutionFrequency` parameter.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-maximumexecutionfrequency)
   */
  public fun maximumExecutionFrequency(): String? = unwrap(this).getMaximumExecutionFrequency()

  /**
   * Defines which resources can trigger an evaluation for the rule.
   *
   * The scope can include one or more resource types, a combination of one resource type and one
   * resource ID, or a combination of a tag key and value. Specify a scope to constrain the resources
   * that can trigger an evaluation for the rule. If you do not specify a scope, evaluations are
   * triggered when any resource in the recording group changes.
   *
   *
   * The scope can be empty.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-scope)
   */
  public fun scope(): Any? = unwrap(this).getScope()

  /**
   * Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom Policy rules, and
   * `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the notifications that cause
   * the function to evaluate your AWS resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-source)
   */
  public fun source(): Any

  /**
   * A builder for [CfnConfigRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param compliance Indicates whether an AWS resource or AWS Config rule is compliant and
     * provides the number of contributors that affect the compliance.
     */
    public fun compliance(compliance: IResolvable)

    /**
     * @param compliance Indicates whether an AWS resource or AWS Config rule is compliant and
     * provides the number of contributors that affect the compliance.
     */
    public fun compliance(compliance: CfnConfigRule.ComplianceProperty)

    /**
     * @param compliance Indicates whether an AWS resource or AWS Config rule is compliant and
     * provides the number of contributors that affect the compliance.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("291908b26f606da8a7919a3e9b3852d4e1e62c2e506fc405bc7921c5c48216a1")
    public fun compliance(compliance: CfnConfigRule.ComplianceProperty.Builder.() -> Unit)

    /**
     * @param configRuleName A name for the AWS Config rule.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the rule name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     */
    public fun configRuleName(configRuleName: String)

    /**
     * @param description The description that you provide for the AWS Config rule.
     */
    public fun description(description: String)

    /**
     * @param evaluationModes The modes the AWS Config rule can be evaluated in.
     * The valid values are distinct objects. By default, the value is Detective evaluation mode
     * only.
     */
    public fun evaluationModes(evaluationModes: IResolvable)

    /**
     * @param evaluationModes The modes the AWS Config rule can be evaluated in.
     * The valid values are distinct objects. By default, the value is Detective evaluation mode
     * only.
     */
    public fun evaluationModes(evaluationModes: List<Any>)

    /**
     * @param evaluationModes The modes the AWS Config rule can be evaluated in.
     * The valid values are distinct objects. By default, the value is Detective evaluation mode
     * only.
     */
    public fun evaluationModes(vararg evaluationModes: Any)

    /**
     * @param inputParameters A string, in JSON format, that is passed to the AWS Config rule Lambda
     * function.
     */
    public fun inputParameters(inputParameters: Any)

    /**
     * @param maximumExecutionFrequency The maximum frequency with which AWS Config runs evaluations
     * for a rule.
     * You can specify a value for `MaximumExecutionFrequency` when:
     *
     * * You are using an AWS managed rule that is triggered at a periodic frequency.
     * * Your custom rule is triggered when AWS Config delivers the configuration snapshot. For more
     * information, see
     * [ConfigSnapshotDeliveryProperties](https://docs.aws.amazon.com/config/latest/APIReference/API_ConfigSnapshotDeliveryProperties.html)
     * .
     *
     *
     * By default, rules with a periodic trigger are evaluated every 24 hours. To change the
     * frequency, specify a valid value for the `MaximumExecutionFrequency` parameter.
     */
    public fun maximumExecutionFrequency(maximumExecutionFrequency: String)

    /**
     * @param scope Defines which resources can trigger an evaluation for the rule.
     * The scope can include one or more resource types, a combination of one resource type and one
     * resource ID, or a combination of a tag key and value. Specify a scope to constrain the resources
     * that can trigger an evaluation for the rule. If you do not specify a scope, evaluations are
     * triggered when any resource in the recording group changes.
     *
     *
     * The scope can be empty.
     */
    public fun scope(scope: IResolvable)

    /**
     * @param scope Defines which resources can trigger an evaluation for the rule.
     * The scope can include one or more resource types, a combination of one resource type and one
     * resource ID, or a combination of a tag key and value. Specify a scope to constrain the resources
     * that can trigger an evaluation for the rule. If you do not specify a scope, evaluations are
     * triggered when any resource in the recording group changes.
     *
     *
     * The scope can be empty.
     */
    public fun scope(scope: CfnConfigRule.ScopeProperty)

    /**
     * @param scope Defines which resources can trigger an evaluation for the rule.
     * The scope can include one or more resource types, a combination of one resource type and one
     * resource ID, or a combination of a tag key and value. Specify a scope to constrain the resources
     * that can trigger an evaluation for the rule. If you do not specify a scope, evaluations are
     * triggered when any resource in the recording group changes.
     *
     *
     * The scope can be empty.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4ee6e340306d531ad67256cb7041375fd9bcb1f4358b5b7586e29c65155c88b")
    public fun scope(scope: CfnConfigRule.ScopeProperty.Builder.() -> Unit)

    /**
     * @param source Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom
     * Policy rules, and `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the
     * notifications that cause the function to evaluate your AWS resources. 
     */
    public fun source(source: IResolvable)

    /**
     * @param source Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom
     * Policy rules, and `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the
     * notifications that cause the function to evaluate your AWS resources. 
     */
    public fun source(source: CfnConfigRule.SourceProperty)

    /**
     * @param source Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom
     * Policy rules, and `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the
     * notifications that cause the function to evaluate your AWS resources. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a5ee222c5438f21a8858b5a9bb740370a98ab3f124d18d9610505a5e1d4f7c0")
    public fun source(source: CfnConfigRule.SourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.CfnConfigRuleProps.Builder =
        software.amazon.awscdk.services.config.CfnConfigRuleProps.builder()

    /**
     * @param compliance Indicates whether an AWS resource or AWS Config rule is compliant and
     * provides the number of contributors that affect the compliance.
     */
    override fun compliance(compliance: IResolvable) {
      cdkBuilder.compliance(compliance.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param compliance Indicates whether an AWS resource or AWS Config rule is compliant and
     * provides the number of contributors that affect the compliance.
     */
    override fun compliance(compliance: CfnConfigRule.ComplianceProperty) {
      cdkBuilder.compliance(compliance.let(CfnConfigRule.ComplianceProperty.Companion::unwrap))
    }

    /**
     * @param compliance Indicates whether an AWS resource or AWS Config rule is compliant and
     * provides the number of contributors that affect the compliance.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("291908b26f606da8a7919a3e9b3852d4e1e62c2e506fc405bc7921c5c48216a1")
    override fun compliance(compliance: CfnConfigRule.ComplianceProperty.Builder.() -> Unit): Unit =
        compliance(CfnConfigRule.ComplianceProperty(compliance))

    /**
     * @param configRuleName A name for the AWS Config rule.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the rule name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     */
    override fun configRuleName(configRuleName: String) {
      cdkBuilder.configRuleName(configRuleName)
    }

    /**
     * @param description The description that you provide for the AWS Config rule.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param evaluationModes The modes the AWS Config rule can be evaluated in.
     * The valid values are distinct objects. By default, the value is Detective evaluation mode
     * only.
     */
    override fun evaluationModes(evaluationModes: IResolvable) {
      cdkBuilder.evaluationModes(evaluationModes.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param evaluationModes The modes the AWS Config rule can be evaluated in.
     * The valid values are distinct objects. By default, the value is Detective evaluation mode
     * only.
     */
    override fun evaluationModes(evaluationModes: List<Any>) {
      cdkBuilder.evaluationModes(evaluationModes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param evaluationModes The modes the AWS Config rule can be evaluated in.
     * The valid values are distinct objects. By default, the value is Detective evaluation mode
     * only.
     */
    override fun evaluationModes(vararg evaluationModes: Any): Unit =
        evaluationModes(evaluationModes.toList())

    /**
     * @param inputParameters A string, in JSON format, that is passed to the AWS Config rule Lambda
     * function.
     */
    override fun inputParameters(inputParameters: Any) {
      cdkBuilder.inputParameters(inputParameters)
    }

    /**
     * @param maximumExecutionFrequency The maximum frequency with which AWS Config runs evaluations
     * for a rule.
     * You can specify a value for `MaximumExecutionFrequency` when:
     *
     * * You are using an AWS managed rule that is triggered at a periodic frequency.
     * * Your custom rule is triggered when AWS Config delivers the configuration snapshot. For more
     * information, see
     * [ConfigSnapshotDeliveryProperties](https://docs.aws.amazon.com/config/latest/APIReference/API_ConfigSnapshotDeliveryProperties.html)
     * .
     *
     *
     * By default, rules with a periodic trigger are evaluated every 24 hours. To change the
     * frequency, specify a valid value for the `MaximumExecutionFrequency` parameter.
     */
    override fun maximumExecutionFrequency(maximumExecutionFrequency: String) {
      cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
    }

    /**
     * @param scope Defines which resources can trigger an evaluation for the rule.
     * The scope can include one or more resource types, a combination of one resource type and one
     * resource ID, or a combination of a tag key and value. Specify a scope to constrain the resources
     * that can trigger an evaluation for the rule. If you do not specify a scope, evaluations are
     * triggered when any resource in the recording group changes.
     *
     *
     * The scope can be empty.
     */
    override fun scope(scope: IResolvable) {
      cdkBuilder.scope(scope.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param scope Defines which resources can trigger an evaluation for the rule.
     * The scope can include one or more resource types, a combination of one resource type and one
     * resource ID, or a combination of a tag key and value. Specify a scope to constrain the resources
     * that can trigger an evaluation for the rule. If you do not specify a scope, evaluations are
     * triggered when any resource in the recording group changes.
     *
     *
     * The scope can be empty.
     */
    override fun scope(scope: CfnConfigRule.ScopeProperty) {
      cdkBuilder.scope(scope.let(CfnConfigRule.ScopeProperty.Companion::unwrap))
    }

    /**
     * @param scope Defines which resources can trigger an evaluation for the rule.
     * The scope can include one or more resource types, a combination of one resource type and one
     * resource ID, or a combination of a tag key and value. Specify a scope to constrain the resources
     * that can trigger an evaluation for the rule. If you do not specify a scope, evaluations are
     * triggered when any resource in the recording group changes.
     *
     *
     * The scope can be empty.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4ee6e340306d531ad67256cb7041375fd9bcb1f4358b5b7586e29c65155c88b")
    override fun scope(scope: CfnConfigRule.ScopeProperty.Builder.() -> Unit): Unit =
        scope(CfnConfigRule.ScopeProperty(scope))

    /**
     * @param source Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom
     * Policy rules, and `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the
     * notifications that cause the function to evaluate your AWS resources. 
     */
    override fun source(source: IResolvable) {
      cdkBuilder.source(source.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param source Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom
     * Policy rules, and `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the
     * notifications that cause the function to evaluate your AWS resources. 
     */
    override fun source(source: CfnConfigRule.SourceProperty) {
      cdkBuilder.source(source.let(CfnConfigRule.SourceProperty.Companion::unwrap))
    }

    /**
     * @param source Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom
     * Policy rules, and `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the
     * notifications that cause the function to evaluate your AWS resources. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a5ee222c5438f21a8858b5a9bb740370a98ab3f124d18d9610505a5e1d4f7c0")
    override fun source(source: CfnConfigRule.SourceProperty.Builder.() -> Unit): Unit =
        source(CfnConfigRule.SourceProperty(source))

    public fun build(): software.amazon.awscdk.services.config.CfnConfigRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.config.CfnConfigRuleProps,
  ) : CdkObject(cdkObject), CfnConfigRuleProps {
    /**
     * Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of
     * contributors that affect the compliance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-compliance)
     */
    override fun compliance(): Any? = unwrap(this).getCompliance()

    /**
     * A name for the AWS Config rule.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the rule name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-configrulename)
     */
    override fun configRuleName(): String? = unwrap(this).getConfigRuleName()

    /**
     * The description that you provide for the AWS Config rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The modes the AWS Config rule can be evaluated in.
     *
     * The valid values are distinct objects. By default, the value is Detective evaluation mode
     * only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-evaluationmodes)
     */
    override fun evaluationModes(): Any? = unwrap(this).getEvaluationModes()

    /**
     * A string, in JSON format, that is passed to the AWS Config rule Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-inputparameters)
     */
    override fun inputParameters(): Any? = unwrap(this).getInputParameters()

    /**
     * The maximum frequency with which AWS Config runs evaluations for a rule.
     *
     * You can specify a value for `MaximumExecutionFrequency` when:
     *
     * * You are using an AWS managed rule that is triggered at a periodic frequency.
     * * Your custom rule is triggered when AWS Config delivers the configuration snapshot. For more
     * information, see
     * [ConfigSnapshotDeliveryProperties](https://docs.aws.amazon.com/config/latest/APIReference/API_ConfigSnapshotDeliveryProperties.html)
     * .
     *
     *
     * By default, rules with a periodic trigger are evaluated every 24 hours. To change the
     * frequency, specify a valid value for the `MaximumExecutionFrequency` parameter.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-maximumexecutionfrequency)
     */
    override fun maximumExecutionFrequency(): String? = unwrap(this).getMaximumExecutionFrequency()

    /**
     * Defines which resources can trigger an evaluation for the rule.
     *
     * The scope can include one or more resource types, a combination of one resource type and one
     * resource ID, or a combination of a tag key and value. Specify a scope to constrain the resources
     * that can trigger an evaluation for the rule. If you do not specify a scope, evaluations are
     * triggered when any resource in the recording group changes.
     *
     *
     * The scope can be empty.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-scope)
     */
    override fun scope(): Any? = unwrap(this).getScope()

    /**
     * Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom Policy rules,
     * and `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the notifications that
     * cause the function to evaluate your AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-source)
     */
    override fun source(): Any = unwrap(this).getSource()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfigRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigRuleProps):
        CfnConfigRuleProps = CdkObjectWrappers.wrap(cdkObject) as? CfnConfigRuleProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfigRuleProps):
        software.amazon.awscdk.services.config.CfnConfigRuleProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.config.CfnConfigRuleProps
  }
}
