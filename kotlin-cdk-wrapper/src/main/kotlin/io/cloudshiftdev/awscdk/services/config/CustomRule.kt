@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CustomRule internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.config.CustomRule,
) : Resource(cdkObject), IRule {
  public open fun configRuleArn(): String = unwrap(this).getConfigRuleArn()

  public open fun configRuleComplianceType(): String = unwrap(this).getConfigRuleComplianceType()

  public open fun configRuleId(): String = unwrap(this).getConfigRuleId()

  public override fun configRuleName(): String = unwrap(this).getConfigRuleName()

  public override fun onComplianceChange(id: String): Rule =
      unwrap(this).onComplianceChange(id).let(Rule::wrap)

  public override fun onComplianceChange(id: String, options: OnEventOptions): Rule =
      unwrap(this).onComplianceChange(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b98c84ce198054f102b00e655b85da2a1ae47a5638faf86d850c16a3235acfa2")
  public override fun onComplianceChange(id: String, options: OnEventOptions.Builder.() -> Unit):
      Rule = onComplianceChange(id, OnEventOptions(options))

  public override fun onEvent(id: String): Rule = unwrap(this).onEvent(id).let(Rule::wrap)

  public override fun onEvent(id: String, options: OnEventOptions): Rule = unwrap(this).onEvent(id,
      options.let(OnEventOptions::unwrap)).let(Rule::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
  public override fun onEvent(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
      onEvent(id, OnEventOptions(options))

  public override fun onReEvaluationStatus(id: String): Rule =
      unwrap(this).onReEvaluationStatus(id).let(Rule::wrap)

  public override fun onReEvaluationStatus(id: String, options: OnEventOptions): Rule =
      unwrap(this).onReEvaluationStatus(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f5ea19b211eab8ba672d4a05459c322cc41db04f03b5d429124296804b9cc8c7")
  public override fun onReEvaluationStatus(id: String, options: OnEventOptions.Builder.() -> Unit):
      Rule = onReEvaluationStatus(id, OnEventOptions(options))

  @CdkDslMarker
  public interface Builder {
    public fun configRuleName(configRuleName: String)

    public fun configurationChanges(configurationChanges: Boolean)

    public fun description(description: String)

    public fun inputParameters(inputParameters: Map<String, Any>)

    public fun lambdaFunction(lambdaFunction: IFunction)

    public fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency)

    public fun periodic(periodic: Boolean)

    public fun ruleScope(ruleScope: RuleScope)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.CustomRule.Builder =
        software.amazon.awscdk.services.config.CustomRule.Builder.create(scope, id)

    override fun configRuleName(configRuleName: String) {
      cdkBuilder.configRuleName(configRuleName)
    }

    override fun configurationChanges(configurationChanges: Boolean) {
      cdkBuilder.configurationChanges(configurationChanges)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun inputParameters(inputParameters: Map<String, Any>) {
      cdkBuilder.inputParameters(inputParameters)
    }

    override fun lambdaFunction(lambdaFunction: IFunction) {
      cdkBuilder.lambdaFunction(lambdaFunction.let(IFunction::unwrap))
    }

    override fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency) {
      cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency.let(MaximumExecutionFrequency::unwrap))
    }

    override fun periodic(periodic: Boolean) {
      cdkBuilder.periodic(periodic)
    }

    override fun ruleScope(ruleScope: RuleScope) {
      cdkBuilder.ruleScope(ruleScope.let(RuleScope::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.config.CustomRule = cdkBuilder.build()
  }

  public companion object {
    public fun fromConfigRuleName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      configRuleName: String,
    ): IRule =
        software.amazon.awscdk.services.config.CustomRule.fromConfigRuleName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, configRuleName).let(IRule::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CustomRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CustomRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.CustomRule): CustomRule =
        CustomRule(cdkObject)

    internal fun unwrap(wrapped: CustomRule): software.amazon.awscdk.services.config.CustomRule =
        wrapped.cdkObject
  }
}
