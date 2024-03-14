package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConfigRule internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.config.CfnConfigRule,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The Amazon Resource Name (ARN) of the AWS Config rule, such as
   * `arn:aws:config:us-east-1:123456789012:config-rule/config-rule-a1bzhi` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Compliance type determined by the Config rule.
   */
  public open fun attrComplianceType(): String = unwrap(this).getAttrComplianceType()

  /**
   * The ID of the AWS Config rule, such as `config-rule-a1bzhi` .
   */
  public open fun attrConfigRuleId(): String = unwrap(this).getAttrConfigRuleId()

  /**
   * Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of
   * contributors that affect the compliance.
   */
  public open fun compliance(): Any? = unwrap(this).getCompliance()

  /**
   * Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of
   * contributors that affect the compliance.
   */
  public open fun compliance(`value`: IResolvable) {
    unwrap(this).setCompliance(`value`.let(IResolvable::unwrap))
  }

  /**
   * Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of
   * contributors that affect the compliance.
   */
  public open fun compliance(`value`: ComplianceProperty) {
    unwrap(this).setCompliance(`value`.let(ComplianceProperty::unwrap))
  }

  /**
   * Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of
   * contributors that affect the compliance.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5aa4aa97a95780ebd4465b2cc59aa248471283b964a5fd83200062bbf0591a85")
  public open fun compliance(`value`: ComplianceProperty.Builder.() -> Unit): Unit =
      compliance(ComplianceProperty(`value`))

  /**
   * A name for the AWS Config rule.
   */
  public open fun configRuleName(): String? = unwrap(this).getConfigRuleName()

  /**
   * A name for the AWS Config rule.
   */
  public open fun configRuleName(`value`: String) {
    unwrap(this).setConfigRuleName(`value`)
  }

  /**
   * The description that you provide for the AWS Config rule.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description that you provide for the AWS Config rule.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The modes the AWS Config rule can be evaluated in.
   */
  public open fun evaluationModes(): Any? = unwrap(this).getEvaluationModes()

  /**
   * The modes the AWS Config rule can be evaluated in.
   */
  public open fun evaluationModes(`value`: IResolvable) {
    unwrap(this).setEvaluationModes(`value`.let(IResolvable::unwrap))
  }

  /**
   * The modes the AWS Config rule can be evaluated in.
   */
  public open fun evaluationModes(__idx_ac66f0: List<Any>) {
    unwrap(this).setEvaluationModes(__idx_ac66f0)
  }

  /**
   * The modes the AWS Config rule can be evaluated in.
   */
  public open fun evaluationModes(vararg __idx_ac66f0: Any): Unit =
      evaluationModes(__idx_ac66f0.toList())

  /**
   * A string, in JSON format, that is passed to the AWS Config rule Lambda function.
   */
  public open fun inputParameters(): Any? = unwrap(this).getInputParameters()

  /**
   * A string, in JSON format, that is passed to the AWS Config rule Lambda function.
   */
  public open fun inputParameters(`value`: Any) {
    unwrap(this).setInputParameters(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The maximum frequency with which AWS Config runs evaluations for a rule.
   */
  public open fun maximumExecutionFrequency(): String? = unwrap(this).getMaximumExecutionFrequency()

  /**
   * The maximum frequency with which AWS Config runs evaluations for a rule.
   */
  public open fun maximumExecutionFrequency(`value`: String) {
    unwrap(this).setMaximumExecutionFrequency(`value`)
  }

  /**
   * Defines which resources can trigger an evaluation for the rule.
   */
  public open fun scope(): Any? = unwrap(this).getScope()

  /**
   * Defines which resources can trigger an evaluation for the rule.
   */
  public open fun scope(`value`: IResolvable) {
    unwrap(this).setScope(`value`.let(IResolvable::unwrap))
  }

  /**
   * Defines which resources can trigger an evaluation for the rule.
   */
  public open fun scope(`value`: ScopeProperty) {
    unwrap(this).setScope(`value`.let(ScopeProperty::unwrap))
  }

  /**
   * Defines which resources can trigger an evaluation for the rule.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("390a60f46dd0922a4d8cd89756b8180784f6aa3413a6f44d591228b0503d9c1d")
  public open fun scope(`value`: ScopeProperty.Builder.() -> Unit): Unit =
      scope(ScopeProperty(`value`))

  /**
   * Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom Policy rules, and
   * `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the notifications that cause
   * the function to evaluate your AWS resources.
   */
  public open fun source(): Any = unwrap(this).getSource()

  /**
   * Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom Policy rules, and
   * `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the notifications that cause
   * the function to evaluate your AWS resources.
   */
  public open fun source(`value`: IResolvable) {
    unwrap(this).setSource(`value`.let(IResolvable::unwrap))
  }

  /**
   * Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom Policy rules, and
   * `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the notifications that cause
   * the function to evaluate your AWS resources.
   */
  public open fun source(`value`: SourceProperty) {
    unwrap(this).setSource(`value`.let(SourceProperty::unwrap))
  }

  /**
   * Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom Policy rules, and
   * `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the notifications that cause
   * the function to evaluate your AWS resources.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1c900c6a442538776ec5cbab84829fd048258aa502e9055763f85089f8f65e45")
  public open fun source(`value`: SourceProperty.Builder.() -> Unit): Unit =
      source(SourceProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.config.CfnConfigRule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of
     * contributors that affect the compliance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-compliance)
     * @param compliance Indicates whether an AWS resource or AWS Config rule is compliant and
     * provides the number of contributors that affect the compliance. 
     */
    public fun compliance(compliance: IResolvable)

    /**
     * Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of
     * contributors that affect the compliance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-compliance)
     * @param compliance Indicates whether an AWS resource or AWS Config rule is compliant and
     * provides the number of contributors that affect the compliance. 
     */
    public fun compliance(compliance: ComplianceProperty)

    /**
     * Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of
     * contributors that affect the compliance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-compliance)
     * @param compliance Indicates whether an AWS resource or AWS Config rule is compliant and
     * provides the number of contributors that affect the compliance. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40cc0eb811f463942ccfc092ba362c59856e246850c65154b5dc32ba08aeca1c")
    public fun compliance(compliance: ComplianceProperty.Builder.() -> Unit)

    /**
     * A name for the AWS Config rule.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the rule name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-configrulename)
     * @param configRuleName A name for the AWS Config rule. 
     */
    public fun configRuleName(configRuleName: String)

    /**
     * The description that you provide for the AWS Config rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-description)
     * @param description The description that you provide for the AWS Config rule. 
     */
    public fun description(description: String)

    /**
     * The modes the AWS Config rule can be evaluated in.
     *
     * The valid values are distinct objects. By default, the value is Detective evaluation mode
     * only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-evaluationmodes)
     * @param evaluationModes The modes the AWS Config rule can be evaluated in. 
     */
    public fun evaluationModes(evaluationModes: IResolvable)

    /**
     * The modes the AWS Config rule can be evaluated in.
     *
     * The valid values are distinct objects. By default, the value is Detective evaluation mode
     * only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-evaluationmodes)
     * @param evaluationModes The modes the AWS Config rule can be evaluated in. 
     */
    public fun evaluationModes(evaluationModes: List<Any>)

    /**
     * The modes the AWS Config rule can be evaluated in.
     *
     * The valid values are distinct objects. By default, the value is Detective evaluation mode
     * only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-evaluationmodes)
     * @param evaluationModes The modes the AWS Config rule can be evaluated in. 
     */
    public fun evaluationModes(vararg evaluationModes: Any)

    /**
     * A string, in JSON format, that is passed to the AWS Config rule Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-inputparameters)
     * @param inputParameters A string, in JSON format, that is passed to the AWS Config rule Lambda
     * function. 
     */
    public fun inputParameters(inputParameters: Any)

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
     * @param maximumExecutionFrequency The maximum frequency with which AWS Config runs evaluations
     * for a rule. 
     */
    public fun maximumExecutionFrequency(maximumExecutionFrequency: String)

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
     * @param scope Defines which resources can trigger an evaluation for the rule. 
     */
    public fun scope(scope: IResolvable)

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
     * @param scope Defines which resources can trigger an evaluation for the rule. 
     */
    public fun scope(scope: ScopeProperty)

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
     * @param scope Defines which resources can trigger an evaluation for the rule. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5832333865e867e7a16d84ff1e2319b57320efc981e6e843d70a2da4bdc5721")
    public fun scope(scope: ScopeProperty.Builder.() -> Unit)

    /**
     * Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom Policy rules,
     * and `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the notifications that
     * cause the function to evaluate your AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-source)
     * @param source Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom
     * Policy rules, and `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the
     * notifications that cause the function to evaluate your AWS resources. 
     */
    public fun source(source: IResolvable)

    /**
     * Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom Policy rules,
     * and `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the notifications that
     * cause the function to evaluate your AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-source)
     * @param source Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom
     * Policy rules, and `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the
     * notifications that cause the function to evaluate your AWS resources. 
     */
    public fun source(source: SourceProperty)

    /**
     * Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom Policy rules,
     * and `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the notifications that
     * cause the function to evaluate your AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-source)
     * @param source Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom
     * Policy rules, and `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the
     * notifications that cause the function to evaluate your AWS resources. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("196e11ddbe92fd8fdfdd311a27085f5e054dc375ddd2f07731f8984c9ea7c449")
    public fun source(source: SourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.CfnConfigRule.Builder =
        software.amazon.awscdk.services.config.CfnConfigRule.Builder.create(scope, id)

    /**
     * Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of
     * contributors that affect the compliance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-compliance)
     * @param compliance Indicates whether an AWS resource or AWS Config rule is compliant and
     * provides the number of contributors that affect the compliance. 
     */
    override fun compliance(compliance: IResolvable) {
      cdkBuilder.compliance(compliance.let(IResolvable::unwrap))
    }

    /**
     * Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of
     * contributors that affect the compliance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-compliance)
     * @param compliance Indicates whether an AWS resource or AWS Config rule is compliant and
     * provides the number of contributors that affect the compliance. 
     */
    override fun compliance(compliance: ComplianceProperty) {
      cdkBuilder.compliance(compliance.let(ComplianceProperty::unwrap))
    }

    /**
     * Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of
     * contributors that affect the compliance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-compliance)
     * @param compliance Indicates whether an AWS resource or AWS Config rule is compliant and
     * provides the number of contributors that affect the compliance. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40cc0eb811f463942ccfc092ba362c59856e246850c65154b5dc32ba08aeca1c")
    override fun compliance(compliance: ComplianceProperty.Builder.() -> Unit): Unit =
        compliance(ComplianceProperty(compliance))

    /**
     * A name for the AWS Config rule.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the rule name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-configrulename)
     * @param configRuleName A name for the AWS Config rule. 
     */
    override fun configRuleName(configRuleName: String) {
      cdkBuilder.configRuleName(configRuleName)
    }

    /**
     * The description that you provide for the AWS Config rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-description)
     * @param description The description that you provide for the AWS Config rule. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The modes the AWS Config rule can be evaluated in.
     *
     * The valid values are distinct objects. By default, the value is Detective evaluation mode
     * only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-evaluationmodes)
     * @param evaluationModes The modes the AWS Config rule can be evaluated in. 
     */
    override fun evaluationModes(evaluationModes: IResolvable) {
      cdkBuilder.evaluationModes(evaluationModes.let(IResolvable::unwrap))
    }

    /**
     * The modes the AWS Config rule can be evaluated in.
     *
     * The valid values are distinct objects. By default, the value is Detective evaluation mode
     * only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-evaluationmodes)
     * @param evaluationModes The modes the AWS Config rule can be evaluated in. 
     */
    override fun evaluationModes(evaluationModes: List<Any>) {
      cdkBuilder.evaluationModes(evaluationModes)
    }

    /**
     * The modes the AWS Config rule can be evaluated in.
     *
     * The valid values are distinct objects. By default, the value is Detective evaluation mode
     * only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-evaluationmodes)
     * @param evaluationModes The modes the AWS Config rule can be evaluated in. 
     */
    override fun evaluationModes(vararg evaluationModes: Any): Unit =
        evaluationModes(evaluationModes.toList())

    /**
     * A string, in JSON format, that is passed to the AWS Config rule Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-inputparameters)
     * @param inputParameters A string, in JSON format, that is passed to the AWS Config rule Lambda
     * function. 
     */
    override fun inputParameters(inputParameters: Any) {
      cdkBuilder.inputParameters(inputParameters)
    }

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
     * @param maximumExecutionFrequency The maximum frequency with which AWS Config runs evaluations
     * for a rule. 
     */
    override fun maximumExecutionFrequency(maximumExecutionFrequency: String) {
      cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
    }

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
     * @param scope Defines which resources can trigger an evaluation for the rule. 
     */
    override fun scope(scope: IResolvable) {
      cdkBuilder.scope(scope.let(IResolvable::unwrap))
    }

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
     * @param scope Defines which resources can trigger an evaluation for the rule. 
     */
    override fun scope(scope: ScopeProperty) {
      cdkBuilder.scope(scope.let(ScopeProperty::unwrap))
    }

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
     * @param scope Defines which resources can trigger an evaluation for the rule. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5832333865e867e7a16d84ff1e2319b57320efc981e6e843d70a2da4bdc5721")
    override fun scope(scope: ScopeProperty.Builder.() -> Unit): Unit = scope(ScopeProperty(scope))

    /**
     * Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom Policy rules,
     * and `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the notifications that
     * cause the function to evaluate your AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-source)
     * @param source Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom
     * Policy rules, and `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the
     * notifications that cause the function to evaluate your AWS resources. 
     */
    override fun source(source: IResolvable) {
      cdkBuilder.source(source.let(IResolvable::unwrap))
    }

    /**
     * Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom Policy rules,
     * and `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the notifications that
     * cause the function to evaluate your AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-source)
     * @param source Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom
     * Policy rules, and `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the
     * notifications that cause the function to evaluate your AWS resources. 
     */
    override fun source(source: SourceProperty) {
      cdkBuilder.source(source.let(SourceProperty::unwrap))
    }

    /**
     * Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom Policy rules,
     * and `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the notifications that
     * cause the function to evaluate your AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-source)
     * @param source Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom
     * Policy rules, and `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the
     * notifications that cause the function to evaluate your AWS resources. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("196e11ddbe92fd8fdfdd311a27085f5e054dc375ddd2f07731f8984c9ea7c449")
    override fun source(source: SourceProperty.Builder.() -> Unit): Unit =
        source(SourceProperty(source))

    public fun build(): software.amazon.awscdk.services.config.CfnConfigRule = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConfigRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConfigRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigRule):
        CfnConfigRule = CfnConfigRule(cdkObject)

    internal fun unwrap(wrapped: CfnConfigRule):
        software.amazon.awscdk.services.config.CfnConfigRule = wrapped.cdkObject
  }

  public interface ScopeProperty {
    /**
     * The ID of the only AWS resource that you want to trigger an evaluation for the rule.
     *
     * If you specify a resource ID, you must specify one resource type for
     * `ComplianceResourceTypes` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-complianceresourceid)
     */
    public fun complianceResourceId(): String? = unwrap(this).getComplianceResourceId()

    /**
     * The resource types of only those AWS resources that you want to trigger an evaluation for the
     * rule.
     *
     * You can only specify one type if you also specify a resource ID for `ComplianceResourceId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-complianceresourcetypes)
     */
    public fun complianceResourceTypes(): List<String> = unwrap(this).getComplianceResourceTypes()
        ?: emptyList()

    /**
     * The tag key that is applied to only those AWS resources that you want to trigger an
     * evaluation for the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-tagkey)
     */
    public fun tagKey(): String? = unwrap(this).getTagKey()

    /**
     * The tag value applied to only those AWS resources that you want to trigger an evaluation for
     * the rule.
     *
     * If you specify a value for `TagValue` , you must also specify a value for `TagKey` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-tagvalue)
     */
    public fun tagValue(): String? = unwrap(this).getTagValue()

    /**
     * A builder for [ScopeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param complianceResourceId The ID of the only AWS resource that you want to trigger an
       * evaluation for the rule.
       * If you specify a resource ID, you must specify one resource type for
       * `ComplianceResourceTypes` .
       */
      public fun complianceResourceId(complianceResourceId: String)

      /**
       * @param complianceResourceTypes The resource types of only those AWS resources that you want
       * to trigger an evaluation for the rule.
       * You can only specify one type if you also specify a resource ID for `ComplianceResourceId`
       * .
       */
      public fun complianceResourceTypes(complianceResourceTypes: List<String>)

      /**
       * @param complianceResourceTypes The resource types of only those AWS resources that you want
       * to trigger an evaluation for the rule.
       * You can only specify one type if you also specify a resource ID for `ComplianceResourceId`
       * .
       */
      public fun complianceResourceTypes(vararg complianceResourceTypes: String)

      /**
       * @param tagKey The tag key that is applied to only those AWS resources that you want to
       * trigger an evaluation for the rule.
       */
      public fun tagKey(tagKey: String)

      /**
       * @param tagValue The tag value applied to only those AWS resources that you want to trigger
       * an evaluation for the rule.
       * If you specify a value for `TagValue` , you must also specify a value for `TagKey` .
       */
      public fun tagValue(tagValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigRule.ScopeProperty.Builder =
          software.amazon.awscdk.services.config.CfnConfigRule.ScopeProperty.builder()

      /**
       * @param complianceResourceId The ID of the only AWS resource that you want to trigger an
       * evaluation for the rule.
       * If you specify a resource ID, you must specify one resource type for
       * `ComplianceResourceTypes` .
       */
      override fun complianceResourceId(complianceResourceId: String) {
        cdkBuilder.complianceResourceId(complianceResourceId)
      }

      /**
       * @param complianceResourceTypes The resource types of only those AWS resources that you want
       * to trigger an evaluation for the rule.
       * You can only specify one type if you also specify a resource ID for `ComplianceResourceId`
       * .
       */
      override fun complianceResourceTypes(complianceResourceTypes: List<String>) {
        cdkBuilder.complianceResourceTypes(complianceResourceTypes)
      }

      /**
       * @param complianceResourceTypes The resource types of only those AWS resources that you want
       * to trigger an evaluation for the rule.
       * You can only specify one type if you also specify a resource ID for `ComplianceResourceId`
       * .
       */
      override fun complianceResourceTypes(vararg complianceResourceTypes: String): Unit =
          complianceResourceTypes(complianceResourceTypes.toList())

      /**
       * @param tagKey The tag key that is applied to only those AWS resources that you want to
       * trigger an evaluation for the rule.
       */
      override fun tagKey(tagKey: String) {
        cdkBuilder.tagKey(tagKey)
      }

      /**
       * @param tagValue The tag value applied to only those AWS resources that you want to trigger
       * an evaluation for the rule.
       * If you specify a value for `TagValue` , you must also specify a value for `TagKey` .
       */
      override fun tagValue(tagValue: String) {
        cdkBuilder.tagValue(tagValue)
      }

      public fun build(): software.amazon.awscdk.services.config.CfnConfigRule.ScopeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.config.CfnConfigRule.ScopeProperty,
    ) : CdkObject(cdkObject), ScopeProperty {
      /**
       * The ID of the only AWS resource that you want to trigger an evaluation for the rule.
       *
       * If you specify a resource ID, you must specify one resource type for
       * `ComplianceResourceTypes` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-complianceresourceid)
       */
      override fun complianceResourceId(): String? = unwrap(this).getComplianceResourceId()

      /**
       * The resource types of only those AWS resources that you want to trigger an evaluation for
       * the rule.
       *
       * You can only specify one type if you also specify a resource ID for `ComplianceResourceId`
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-complianceresourcetypes)
       */
      override fun complianceResourceTypes(): List<String> =
          unwrap(this).getComplianceResourceTypes() ?: emptyList()

      /**
       * The tag key that is applied to only those AWS resources that you want to trigger an
       * evaluation for the rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-tagkey)
       */
      override fun tagKey(): String? = unwrap(this).getTagKey()

      /**
       * The tag value applied to only those AWS resources that you want to trigger an evaluation
       * for the rule.
       *
       * If you specify a value for `TagValue` , you must also specify a value for `TagKey` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-tagvalue)
       */
      override fun tagValue(): String? = unwrap(this).getTagValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScopeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigRule.ScopeProperty):
          ScopeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScopeProperty):
          software.amazon.awscdk.services.config.CfnConfigRule.ScopeProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.config.CfnConfigRule.ScopeProperty
    }
  }

  public interface EvaluationModeConfigurationProperty {
    /**
     * The mode of an evaluation.
     *
     * The valid values are Detective or Proactive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-evaluationmodeconfiguration.html#cfn-config-configrule-evaluationmodeconfiguration-mode)
     */
    public fun mode(): String? = unwrap(this).getMode()

    /**
     * A builder for [EvaluationModeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mode The mode of an evaluation.
       * The valid values are Detective or Proactive.
       */
      public fun mode(mode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigRule.EvaluationModeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnConfigRule.EvaluationModeConfigurationProperty.builder()

      /**
       * @param mode The mode of an evaluation.
       * The valid values are Detective or Proactive.
       */
      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      public fun build():
          software.amazon.awscdk.services.config.CfnConfigRule.EvaluationModeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.config.CfnConfigRule.EvaluationModeConfigurationProperty,
    ) : CdkObject(cdkObject), EvaluationModeConfigurationProperty {
      /**
       * The mode of an evaluation.
       *
       * The valid values are Detective or Proactive.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-evaluationmodeconfiguration.html#cfn-config-configrule-evaluationmodeconfiguration-mode)
       */
      override fun mode(): String? = unwrap(this).getMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          EvaluationModeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigRule.EvaluationModeConfigurationProperty):
          EvaluationModeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluationModeConfigurationProperty):
          software.amazon.awscdk.services.config.CfnConfigRule.EvaluationModeConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.config.CfnConfigRule.EvaluationModeConfigurationProperty
    }
  }

  public interface SourceProperty {
    /**
     * Provides the runtime system, policy definition, and whether debug logging is enabled.
     *
     * Required when owner is set to `CUSTOM_POLICY` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-custompolicydetails)
     */
    public fun customPolicyDetails(): Any? = unwrap(this).getCustomPolicyDetails()

    /**
     * Indicates whether AWS or the customer owns and manages the AWS Config rule.
     *
     * AWS Config Managed Rules are predefined rules owned by AWS . For more information, see [AWS
     * Config Managed
     * Rules](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html)
     * in the *AWS Config developer guide* .
     *
     * AWS Config Custom Rules are rules that you can develop either with Guard ( `CUSTOM_POLICY` )
     * or AWS Lambda ( `CUSTOM_LAMBDA` ). For more information, see [AWS Config Custom
     * Rules](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html)
     * in the *AWS Config developer guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-owner)
     */
    public fun owner(): String

    /**
     * Provides the source and the message types that cause AWS Config to evaluate your AWS
     * resources against a rule.
     *
     * It also provides the frequency with which you want AWS Config to run evaluations for the rule
     * if the trigger type is periodic.
     *
     * If the owner is set to `CUSTOM_POLICY` , the only acceptable values for the AWS Config rule
     * trigger message type are `ConfigurationItemChangeNotification` and
     * `OversizedConfigurationItemChangeNotification` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-sourcedetails)
     */
    public fun sourceDetails(): Any? = unwrap(this).getSourceDetails()

    /**
     * For AWS Config Managed rules, a predefined identifier from a list.
     *
     * For example, `IAM_PASSWORD_POLICY` is a managed rule. To reference a managed rule, see [List
     * of AWS Config Managed
     * Rules](https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html)
     * .
     *
     * For AWS Config Custom Lambda rules, the identifier is the Amazon Resource Name (ARN) of the
     * rule's AWS Lambda function, such as
     * `arn:aws:lambda:us-east-2:123456789012:function:custom_rule_name` .
     *
     * For AWS Config Custom Policy rules, this field will be ignored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-sourceidentifier)
     */
    public fun sourceIdentifier(): String? = unwrap(this).getSourceIdentifier()

    /**
     * A builder for [SourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customPolicyDetails Provides the runtime system, policy definition, and whether
       * debug logging is enabled.
       * Required when owner is set to `CUSTOM_POLICY` .
       */
      public fun customPolicyDetails(customPolicyDetails: IResolvable)

      /**
       * @param customPolicyDetails Provides the runtime system, policy definition, and whether
       * debug logging is enabled.
       * Required when owner is set to `CUSTOM_POLICY` .
       */
      public fun customPolicyDetails(customPolicyDetails: CustomPolicyDetailsProperty)

      /**
       * @param customPolicyDetails Provides the runtime system, policy definition, and whether
       * debug logging is enabled.
       * Required when owner is set to `CUSTOM_POLICY` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("196cd2034ed6c9f8d93d514180a07bb627d9af41ecd9db175ead0b5f36cdcbc0")
      public
          fun customPolicyDetails(customPolicyDetails: CustomPolicyDetailsProperty.Builder.() -> Unit)

      /**
       * @param owner Indicates whether AWS or the customer owns and manages the AWS Config rule. 
       * AWS Config Managed Rules are predefined rules owned by AWS . For more information, see [AWS
       * Config Managed
       * Rules](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html)
       * in the *AWS Config developer guide* .
       *
       * AWS Config Custom Rules are rules that you can develop either with Guard ( `CUSTOM_POLICY`
       * ) or AWS Lambda ( `CUSTOM_LAMBDA` ). For more information, see [AWS Config Custom
       * Rules](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html)
       * in the *AWS Config developer guide* .
       */
      public fun owner(owner: String)

      /**
       * @param sourceDetails Provides the source and the message types that cause AWS Config to
       * evaluate your AWS resources against a rule.
       * It also provides the frequency with which you want AWS Config to run evaluations for the
       * rule if the trigger type is periodic.
       *
       * If the owner is set to `CUSTOM_POLICY` , the only acceptable values for the AWS Config rule
       * trigger message type are `ConfigurationItemChangeNotification` and
       * `OversizedConfigurationItemChangeNotification` .
       */
      public fun sourceDetails(sourceDetails: IResolvable)

      /**
       * @param sourceDetails Provides the source and the message types that cause AWS Config to
       * evaluate your AWS resources against a rule.
       * It also provides the frequency with which you want AWS Config to run evaluations for the
       * rule if the trigger type is periodic.
       *
       * If the owner is set to `CUSTOM_POLICY` , the only acceptable values for the AWS Config rule
       * trigger message type are `ConfigurationItemChangeNotification` and
       * `OversizedConfigurationItemChangeNotification` .
       */
      public fun sourceDetails(sourceDetails: List<Any>)

      /**
       * @param sourceDetails Provides the source and the message types that cause AWS Config to
       * evaluate your AWS resources against a rule.
       * It also provides the frequency with which you want AWS Config to run evaluations for the
       * rule if the trigger type is periodic.
       *
       * If the owner is set to `CUSTOM_POLICY` , the only acceptable values for the AWS Config rule
       * trigger message type are `ConfigurationItemChangeNotification` and
       * `OversizedConfigurationItemChangeNotification` .
       */
      public fun sourceDetails(vararg sourceDetails: Any)

      /**
       * @param sourceIdentifier For AWS Config Managed rules, a predefined identifier from a list.
       * For example, `IAM_PASSWORD_POLICY` is a managed rule. To reference a managed rule, see
       * [List of AWS Config Managed
       * Rules](https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html)
       * .
       *
       * For AWS Config Custom Lambda rules, the identifier is the Amazon Resource Name (ARN) of the
       * rule's AWS Lambda function, such as
       * `arn:aws:lambda:us-east-2:123456789012:function:custom_rule_name` .
       *
       * For AWS Config Custom Policy rules, this field will be ignored.
       */
      public fun sourceIdentifier(sourceIdentifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigRule.SourceProperty.Builder =
          software.amazon.awscdk.services.config.CfnConfigRule.SourceProperty.builder()

      /**
       * @param customPolicyDetails Provides the runtime system, policy definition, and whether
       * debug logging is enabled.
       * Required when owner is set to `CUSTOM_POLICY` .
       */
      override fun customPolicyDetails(customPolicyDetails: IResolvable) {
        cdkBuilder.customPolicyDetails(customPolicyDetails.let(IResolvable::unwrap))
      }

      /**
       * @param customPolicyDetails Provides the runtime system, policy definition, and whether
       * debug logging is enabled.
       * Required when owner is set to `CUSTOM_POLICY` .
       */
      override fun customPolicyDetails(customPolicyDetails: CustomPolicyDetailsProperty) {
        cdkBuilder.customPolicyDetails(customPolicyDetails.let(CustomPolicyDetailsProperty::unwrap))
      }

      /**
       * @param customPolicyDetails Provides the runtime system, policy definition, and whether
       * debug logging is enabled.
       * Required when owner is set to `CUSTOM_POLICY` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("196cd2034ed6c9f8d93d514180a07bb627d9af41ecd9db175ead0b5f36cdcbc0")
      override
          fun customPolicyDetails(customPolicyDetails: CustomPolicyDetailsProperty.Builder.() -> Unit):
          Unit = customPolicyDetails(CustomPolicyDetailsProperty(customPolicyDetails))

      /**
       * @param owner Indicates whether AWS or the customer owns and manages the AWS Config rule. 
       * AWS Config Managed Rules are predefined rules owned by AWS . For more information, see [AWS
       * Config Managed
       * Rules](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html)
       * in the *AWS Config developer guide* .
       *
       * AWS Config Custom Rules are rules that you can develop either with Guard ( `CUSTOM_POLICY`
       * ) or AWS Lambda ( `CUSTOM_LAMBDA` ). For more information, see [AWS Config Custom
       * Rules](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html)
       * in the *AWS Config developer guide* .
       */
      override fun owner(owner: String) {
        cdkBuilder.owner(owner)
      }

      /**
       * @param sourceDetails Provides the source and the message types that cause AWS Config to
       * evaluate your AWS resources against a rule.
       * It also provides the frequency with which you want AWS Config to run evaluations for the
       * rule if the trigger type is periodic.
       *
       * If the owner is set to `CUSTOM_POLICY` , the only acceptable values for the AWS Config rule
       * trigger message type are `ConfigurationItemChangeNotification` and
       * `OversizedConfigurationItemChangeNotification` .
       */
      override fun sourceDetails(sourceDetails: IResolvable) {
        cdkBuilder.sourceDetails(sourceDetails.let(IResolvable::unwrap))
      }

      /**
       * @param sourceDetails Provides the source and the message types that cause AWS Config to
       * evaluate your AWS resources against a rule.
       * It also provides the frequency with which you want AWS Config to run evaluations for the
       * rule if the trigger type is periodic.
       *
       * If the owner is set to `CUSTOM_POLICY` , the only acceptable values for the AWS Config rule
       * trigger message type are `ConfigurationItemChangeNotification` and
       * `OversizedConfigurationItemChangeNotification` .
       */
      override fun sourceDetails(sourceDetails: List<Any>) {
        cdkBuilder.sourceDetails(sourceDetails)
      }

      /**
       * @param sourceDetails Provides the source and the message types that cause AWS Config to
       * evaluate your AWS resources against a rule.
       * It also provides the frequency with which you want AWS Config to run evaluations for the
       * rule if the trigger type is periodic.
       *
       * If the owner is set to `CUSTOM_POLICY` , the only acceptable values for the AWS Config rule
       * trigger message type are `ConfigurationItemChangeNotification` and
       * `OversizedConfigurationItemChangeNotification` .
       */
      override fun sourceDetails(vararg sourceDetails: Any): Unit =
          sourceDetails(sourceDetails.toList())

      /**
       * @param sourceIdentifier For AWS Config Managed rules, a predefined identifier from a list.
       * For example, `IAM_PASSWORD_POLICY` is a managed rule. To reference a managed rule, see
       * [List of AWS Config Managed
       * Rules](https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html)
       * .
       *
       * For AWS Config Custom Lambda rules, the identifier is the Amazon Resource Name (ARN) of the
       * rule's AWS Lambda function, such as
       * `arn:aws:lambda:us-east-2:123456789012:function:custom_rule_name` .
       *
       * For AWS Config Custom Policy rules, this field will be ignored.
       */
      override fun sourceIdentifier(sourceIdentifier: String) {
        cdkBuilder.sourceIdentifier(sourceIdentifier)
      }

      public fun build(): software.amazon.awscdk.services.config.CfnConfigRule.SourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.config.CfnConfigRule.SourceProperty,
    ) : CdkObject(cdkObject), SourceProperty {
      /**
       * Provides the runtime system, policy definition, and whether debug logging is enabled.
       *
       * Required when owner is set to `CUSTOM_POLICY` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-custompolicydetails)
       */
      override fun customPolicyDetails(): Any? = unwrap(this).getCustomPolicyDetails()

      /**
       * Indicates whether AWS or the customer owns and manages the AWS Config rule.
       *
       * AWS Config Managed Rules are predefined rules owned by AWS . For more information, see [AWS
       * Config Managed
       * Rules](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html)
       * in the *AWS Config developer guide* .
       *
       * AWS Config Custom Rules are rules that you can develop either with Guard ( `CUSTOM_POLICY`
       * ) or AWS Lambda ( `CUSTOM_LAMBDA` ). For more information, see [AWS Config Custom
       * Rules](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html)
       * in the *AWS Config developer guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-owner)
       */
      override fun owner(): String = unwrap(this).getOwner()

      /**
       * Provides the source and the message types that cause AWS Config to evaluate your AWS
       * resources against a rule.
       *
       * It also provides the frequency with which you want AWS Config to run evaluations for the
       * rule if the trigger type is periodic.
       *
       * If the owner is set to `CUSTOM_POLICY` , the only acceptable values for the AWS Config rule
       * trigger message type are `ConfigurationItemChangeNotification` and
       * `OversizedConfigurationItemChangeNotification` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-sourcedetails)
       */
      override fun sourceDetails(): Any? = unwrap(this).getSourceDetails()

      /**
       * For AWS Config Managed rules, a predefined identifier from a list.
       *
       * For example, `IAM_PASSWORD_POLICY` is a managed rule. To reference a managed rule, see
       * [List of AWS Config Managed
       * Rules](https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html)
       * .
       *
       * For AWS Config Custom Lambda rules, the identifier is the Amazon Resource Name (ARN) of the
       * rule's AWS Lambda function, such as
       * `arn:aws:lambda:us-east-2:123456789012:function:custom_rule_name` .
       *
       * For AWS Config Custom Policy rules, this field will be ignored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-sourceidentifier)
       */
      override fun sourceIdentifier(): String? = unwrap(this).getSourceIdentifier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigRule.SourceProperty):
          SourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceProperty):
          software.amazon.awscdk.services.config.CfnConfigRule.SourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.config.CfnConfigRule.SourceProperty
    }
  }

  public interface SourceDetailProperty {
    /**
     * The source of the event, such as an AWS service, that triggers AWS Config to evaluate your
     * AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-sourcedetail.html#cfn-config-configrule-sourcedetail-eventsource)
     */
    public fun eventSource(): String

    /**
     * The frequency at which you want AWS Config to run evaluations for a custom rule with a
     * periodic trigger.
     *
     * If you specify a value for `MaximumExecutionFrequency` , then `MessageType` must use the
     * `ScheduledNotification` value.
     *
     *
     * By default, rules with a periodic trigger are evaluated every 24 hours. To change the
     * frequency, specify a valid value for the `MaximumExecutionFrequency` parameter.
     *
     * Based on the valid value you choose, AWS Config runs evaluations once for each valid value.
     * For example, if you choose `Three_Hours` , AWS Config runs evaluations once every three hours.
     * In this case, `Three_Hours` is the frequency of this rule.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-sourcedetail.html#cfn-config-configrule-sourcedetail-maximumexecutionfrequency)
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
     * * `ConfigurationSnapshotDeliveryCompleted` - Triggers a periodic evaluation when AWS Config
     * delivers a configuration snapshot.
     *
     * If you want your custom rule to be triggered by configuration changes, specify two
     * SourceDetail objects, one for `ConfigurationItemChangeNotification` and one for
     * `OversizedConfigurationItemChangeNotification` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-sourcedetail.html#cfn-config-configrule-sourcedetail-messagetype)
     */
    public fun messageType(): String

    /**
     * A builder for [SourceDetailProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eventSource The source of the event, such as an AWS service, that triggers AWS
       * Config to evaluate your AWS resources. 
       */
      public fun eventSource(eventSource: String)

      /**
       * @param maximumExecutionFrequency The frequency at which you want AWS Config to run
       * evaluations for a custom rule with a periodic trigger.
       * If you specify a value for `MaximumExecutionFrequency` , then `MessageType` must use the
       * `ScheduledNotification` value.
       *
       *
       * By default, rules with a periodic trigger are evaluated every 24 hours. To change the
       * frequency, specify a valid value for the `MaximumExecutionFrequency` parameter.
       *
       * Based on the valid value you choose, AWS Config runs evaluations once for each valid value.
       * For example, if you choose `Three_Hours` , AWS Config runs evaluations once every three hours.
       * In this case, `Three_Hours` is the frequency of this rule.
       */
      public fun maximumExecutionFrequency(maximumExecutionFrequency: String)

      /**
       * @param messageType The type of notification that triggers AWS Config to run an evaluation
       * for a rule. 
       * You can specify the following notification types:
       *
       * * `ConfigurationItemChangeNotification` - Triggers an evaluation when AWS Config delivers a
       * configuration item as a result of a resource change.
       * * `OversizedConfigurationItemChangeNotification` - Triggers an evaluation when AWS Config
       * delivers an oversized configuration item. AWS Config may generate this notification type when
       * a resource changes and the notification exceeds the maximum size allowed by Amazon SNS.
       * * `ScheduledNotification` - Triggers a periodic evaluation at the frequency specified for
       * `MaximumExecutionFrequency` .
       * * `ConfigurationSnapshotDeliveryCompleted` - Triggers a periodic evaluation when AWS Config
       * delivers a configuration snapshot.
       *
       * If you want your custom rule to be triggered by configuration changes, specify two
       * SourceDetail objects, one for `ConfigurationItemChangeNotification` and one for
       * `OversizedConfigurationItemChangeNotification` .
       */
      public fun messageType(messageType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigRule.SourceDetailProperty.Builder =
          software.amazon.awscdk.services.config.CfnConfigRule.SourceDetailProperty.builder()

      /**
       * @param eventSource The source of the event, such as an AWS service, that triggers AWS
       * Config to evaluate your AWS resources. 
       */
      override fun eventSource(eventSource: String) {
        cdkBuilder.eventSource(eventSource)
      }

      /**
       * @param maximumExecutionFrequency The frequency at which you want AWS Config to run
       * evaluations for a custom rule with a periodic trigger.
       * If you specify a value for `MaximumExecutionFrequency` , then `MessageType` must use the
       * `ScheduledNotification` value.
       *
       *
       * By default, rules with a periodic trigger are evaluated every 24 hours. To change the
       * frequency, specify a valid value for the `MaximumExecutionFrequency` parameter.
       *
       * Based on the valid value you choose, AWS Config runs evaluations once for each valid value.
       * For example, if you choose `Three_Hours` , AWS Config runs evaluations once every three hours.
       * In this case, `Three_Hours` is the frequency of this rule.
       */
      override fun maximumExecutionFrequency(maximumExecutionFrequency: String) {
        cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
      }

      /**
       * @param messageType The type of notification that triggers AWS Config to run an evaluation
       * for a rule. 
       * You can specify the following notification types:
       *
       * * `ConfigurationItemChangeNotification` - Triggers an evaluation when AWS Config delivers a
       * configuration item as a result of a resource change.
       * * `OversizedConfigurationItemChangeNotification` - Triggers an evaluation when AWS Config
       * delivers an oversized configuration item. AWS Config may generate this notification type when
       * a resource changes and the notification exceeds the maximum size allowed by Amazon SNS.
       * * `ScheduledNotification` - Triggers a periodic evaluation at the frequency specified for
       * `MaximumExecutionFrequency` .
       * * `ConfigurationSnapshotDeliveryCompleted` - Triggers a periodic evaluation when AWS Config
       * delivers a configuration snapshot.
       *
       * If you want your custom rule to be triggered by configuration changes, specify two
       * SourceDetail objects, one for `ConfigurationItemChangeNotification` and one for
       * `OversizedConfigurationItemChangeNotification` .
       */
      override fun messageType(messageType: String) {
        cdkBuilder.messageType(messageType)
      }

      public fun build(): software.amazon.awscdk.services.config.CfnConfigRule.SourceDetailProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.config.CfnConfigRule.SourceDetailProperty,
    ) : CdkObject(cdkObject), SourceDetailProperty {
      /**
       * The source of the event, such as an AWS service, that triggers AWS Config to evaluate your
       * AWS resources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-sourcedetail.html#cfn-config-configrule-sourcedetail-eventsource)
       */
      override fun eventSource(): String = unwrap(this).getEventSource()

      /**
       * The frequency at which you want AWS Config to run evaluations for a custom rule with a
       * periodic trigger.
       *
       * If you specify a value for `MaximumExecutionFrequency` , then `MessageType` must use the
       * `ScheduledNotification` value.
       *
       *
       * By default, rules with a periodic trigger are evaluated every 24 hours. To change the
       * frequency, specify a valid value for the `MaximumExecutionFrequency` parameter.
       *
       * Based on the valid value you choose, AWS Config runs evaluations once for each valid value.
       * For example, if you choose `Three_Hours` , AWS Config runs evaluations once every three hours.
       * In this case, `Three_Hours` is the frequency of this rule.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-sourcedetail.html#cfn-config-configrule-sourcedetail-maximumexecutionfrequency)
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
       * * `ConfigurationSnapshotDeliveryCompleted` - Triggers a periodic evaluation when AWS Config
       * delivers a configuration snapshot.
       *
       * If you want your custom rule to be triggered by configuration changes, specify two
       * SourceDetail objects, one for `ConfigurationItemChangeNotification` and one for
       * `OversizedConfigurationItemChangeNotification` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-sourcedetail.html#cfn-config-configrule-sourcedetail-messagetype)
       */
      override fun messageType(): String = unwrap(this).getMessageType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceDetailProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigRule.SourceDetailProperty):
          SourceDetailProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceDetailProperty):
          software.amazon.awscdk.services.config.CfnConfigRule.SourceDetailProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.config.CfnConfigRule.SourceDetailProperty
    }
  }

  public interface CustomPolicyDetailsProperty {
    /**
     * The boolean expression for enabling debug logging for your AWS Config Custom Policy rule.
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-custompolicydetails.html#cfn-config-configrule-custompolicydetails-enabledebuglogdelivery)
     */
    public fun enableDebugLogDelivery(): Any? = unwrap(this).getEnableDebugLogDelivery()

    /**
     * The runtime system for your AWS Config Custom Policy rule.
     *
     * Guard is a policy-as-code language that allows you to write policies that are enforced by AWS
     * Config Custom Policy rules. For more information about Guard, see the [Guard GitHub
     * Repository](https://docs.aws.amazon.com/https://github.com/aws-cloudformation/cloudformation-guard)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-custompolicydetails.html#cfn-config-configrule-custompolicydetails-policyruntime)
     */
    public fun policyRuntime(): String? = unwrap(this).getPolicyRuntime()

    /**
     * The policy definition containing the logic for your AWS Config Custom Policy rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-custompolicydetails.html#cfn-config-configrule-custompolicydetails-policytext)
     */
    public fun policyText(): String? = unwrap(this).getPolicyText()

    /**
     * A builder for [CustomPolicyDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enableDebugLogDelivery The boolean expression for enabling debug logging for your
       * AWS Config Custom Policy rule.
       * The default value is `false` .
       */
      public fun enableDebugLogDelivery(enableDebugLogDelivery: Boolean)

      /**
       * @param enableDebugLogDelivery The boolean expression for enabling debug logging for your
       * AWS Config Custom Policy rule.
       * The default value is `false` .
       */
      public fun enableDebugLogDelivery(enableDebugLogDelivery: IResolvable)

      /**
       * @param policyRuntime The runtime system for your AWS Config Custom Policy rule.
       * Guard is a policy-as-code language that allows you to write policies that are enforced by
       * AWS Config Custom Policy rules. For more information about Guard, see the [Guard GitHub
       * Repository](https://docs.aws.amazon.com/https://github.com/aws-cloudformation/cloudformation-guard)
       * .
       */
      public fun policyRuntime(policyRuntime: String)

      /**
       * @param policyText The policy definition containing the logic for your AWS Config Custom
       * Policy rule.
       */
      public fun policyText(policyText: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigRule.CustomPolicyDetailsProperty.Builder =
          software.amazon.awscdk.services.config.CfnConfigRule.CustomPolicyDetailsProperty.builder()

      /**
       * @param enableDebugLogDelivery The boolean expression for enabling debug logging for your
       * AWS Config Custom Policy rule.
       * The default value is `false` .
       */
      override fun enableDebugLogDelivery(enableDebugLogDelivery: Boolean) {
        cdkBuilder.enableDebugLogDelivery(enableDebugLogDelivery)
      }

      /**
       * @param enableDebugLogDelivery The boolean expression for enabling debug logging for your
       * AWS Config Custom Policy rule.
       * The default value is `false` .
       */
      override fun enableDebugLogDelivery(enableDebugLogDelivery: IResolvable) {
        cdkBuilder.enableDebugLogDelivery(enableDebugLogDelivery.let(IResolvable::unwrap))
      }

      /**
       * @param policyRuntime The runtime system for your AWS Config Custom Policy rule.
       * Guard is a policy-as-code language that allows you to write policies that are enforced by
       * AWS Config Custom Policy rules. For more information about Guard, see the [Guard GitHub
       * Repository](https://docs.aws.amazon.com/https://github.com/aws-cloudformation/cloudformation-guard)
       * .
       */
      override fun policyRuntime(policyRuntime: String) {
        cdkBuilder.policyRuntime(policyRuntime)
      }

      /**
       * @param policyText The policy definition containing the logic for your AWS Config Custom
       * Policy rule.
       */
      override fun policyText(policyText: String) {
        cdkBuilder.policyText(policyText)
      }

      public fun build():
          software.amazon.awscdk.services.config.CfnConfigRule.CustomPolicyDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.config.CfnConfigRule.CustomPolicyDetailsProperty,
    ) : CdkObject(cdkObject), CustomPolicyDetailsProperty {
      /**
       * The boolean expression for enabling debug logging for your AWS Config Custom Policy rule.
       *
       * The default value is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-custompolicydetails.html#cfn-config-configrule-custompolicydetails-enabledebuglogdelivery)
       */
      override fun enableDebugLogDelivery(): Any? = unwrap(this).getEnableDebugLogDelivery()

      /**
       * The runtime system for your AWS Config Custom Policy rule.
       *
       * Guard is a policy-as-code language that allows you to write policies that are enforced by
       * AWS Config Custom Policy rules. For more information about Guard, see the [Guard GitHub
       * Repository](https://docs.aws.amazon.com/https://github.com/aws-cloudformation/cloudformation-guard)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-custompolicydetails.html#cfn-config-configrule-custompolicydetails-policyruntime)
       */
      override fun policyRuntime(): String? = unwrap(this).getPolicyRuntime()

      /**
       * The policy definition containing the logic for your AWS Config Custom Policy rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-custompolicydetails.html#cfn-config-configrule-custompolicydetails-policytext)
       */
      override fun policyText(): String? = unwrap(this).getPolicyText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomPolicyDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigRule.CustomPolicyDetailsProperty):
          CustomPolicyDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomPolicyDetailsProperty):
          software.amazon.awscdk.services.config.CfnConfigRule.CustomPolicyDetailsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.config.CfnConfigRule.CustomPolicyDetailsProperty
    }
  }

  public interface ComplianceProperty {
    /**
     * Indicates whether an AWS resource or AWS Config rule is compliant.
     *
     * A resource is compliant if it complies with all of the AWS Config rules that evaluate it. A
     * resource is noncompliant if it does not comply with one or more of these rules.
     *
     * A rule is compliant if all of the resources that the rule evaluates comply with it. A rule is
     * noncompliant if any of these resources do not comply.
     *
     * AWS Config returns the `INSUFFICIENT_DATA` value when no evaluation results are available for
     * the AWS resource or AWS Config rule.
     *
     * For the `Compliance` data type, AWS Config supports only `COMPLIANT` , `NON_COMPLIANT` , and
     * `INSUFFICIENT_DATA` values. AWS Config does not support the `NOT_APPLICABLE` value for the
     * `Compliance` data type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-compliance.html#cfn-config-configrule-compliance-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [ComplianceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type Indicates whether an AWS resource or AWS Config rule is compliant.
       * A resource is compliant if it complies with all of the AWS Config rules that evaluate it. A
       * resource is noncompliant if it does not comply with one or more of these rules.
       *
       * A rule is compliant if all of the resources that the rule evaluates comply with it. A rule
       * is noncompliant if any of these resources do not comply.
       *
       * AWS Config returns the `INSUFFICIENT_DATA` value when no evaluation results are available
       * for the AWS resource or AWS Config rule.
       *
       * For the `Compliance` data type, AWS Config supports only `COMPLIANT` , `NON_COMPLIANT` ,
       * and `INSUFFICIENT_DATA` values. AWS Config does not support the `NOT_APPLICABLE` value for the
       * `Compliance` data type.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigRule.ComplianceProperty.Builder =
          software.amazon.awscdk.services.config.CfnConfigRule.ComplianceProperty.builder()

      /**
       * @param type Indicates whether an AWS resource or AWS Config rule is compliant.
       * A resource is compliant if it complies with all of the AWS Config rules that evaluate it. A
       * resource is noncompliant if it does not comply with one or more of these rules.
       *
       * A rule is compliant if all of the resources that the rule evaluates comply with it. A rule
       * is noncompliant if any of these resources do not comply.
       *
       * AWS Config returns the `INSUFFICIENT_DATA` value when no evaluation results are available
       * for the AWS resource or AWS Config rule.
       *
       * For the `Compliance` data type, AWS Config supports only `COMPLIANT` , `NON_COMPLIANT` ,
       * and `INSUFFICIENT_DATA` values. AWS Config does not support the `NOT_APPLICABLE` value for the
       * `Compliance` data type.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.config.CfnConfigRule.ComplianceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.config.CfnConfigRule.ComplianceProperty,
    ) : CdkObject(cdkObject), ComplianceProperty {
      /**
       * Indicates whether an AWS resource or AWS Config rule is compliant.
       *
       * A resource is compliant if it complies with all of the AWS Config rules that evaluate it. A
       * resource is noncompliant if it does not comply with one or more of these rules.
       *
       * A rule is compliant if all of the resources that the rule evaluates comply with it. A rule
       * is noncompliant if any of these resources do not comply.
       *
       * AWS Config returns the `INSUFFICIENT_DATA` value when no evaluation results are available
       * for the AWS resource or AWS Config rule.
       *
       * For the `Compliance` data type, AWS Config supports only `COMPLIANT` , `NON_COMPLIANT` ,
       * and `INSUFFICIENT_DATA` values. AWS Config does not support the `NOT_APPLICABLE` value for the
       * `Compliance` data type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-compliance.html#cfn-config-configrule-compliance-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ComplianceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigRule.ComplianceProperty):
          ComplianceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComplianceProperty):
          software.amazon.awscdk.services.config.CfnConfigRule.ComplianceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.config.CfnConfigRule.ComplianceProperty
    }
  }
}