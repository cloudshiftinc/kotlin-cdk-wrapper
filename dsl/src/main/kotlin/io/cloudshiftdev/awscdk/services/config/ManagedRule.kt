package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.awscdk.services.events.Rule
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ManagedRule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.config.ManagedRule,
) : Resource(cdkObject), IRule {
  public open fun configRuleArn(): String = unwrap(this).getConfigRuleArn()

  public open fun configRuleComplianceType(): String = unwrap(this).getConfigRuleComplianceType()

  public open fun configRuleId(): String = unwrap(this).getConfigRuleId()

  public override fun configRuleName(): String = unwrap(this).getConfigRuleName()

  public override fun onComplianceChange(id: String): Rule =
      unwrap(this).onComplianceChange(id).let(Rule::wrap)

  public override fun onComplianceChange(id: String, options: OnEventOptions): Rule =
      unwrap(this).onComplianceChange(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b98c84ce198054f102b00e655b85da2a1ae47a5638faf86d850c16a3235acfa2")
  public override fun onComplianceChange(id: String, options: OnEventOptions.Builder.() -> Unit):
      Rule = onComplianceChange(id, OnEventOptions(options))

  public override fun onEvent(id: String): Rule = unwrap(this).onEvent(id).let(Rule::wrap)

  public override fun onEvent(id: String, options: OnEventOptions): Rule = unwrap(this).onEvent(id,
      options.let(OnEventOptions::unwrap)).let(Rule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
  public override fun onEvent(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
      onEvent(id, OnEventOptions(options))

  public override fun onReEvaluationStatus(id: String): Rule =
      unwrap(this).onReEvaluationStatus(id).let(Rule::wrap)

  public override fun onReEvaluationStatus(id: String, options: OnEventOptions): Rule =
      unwrap(this).onReEvaluationStatus(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f5ea19b211eab8ba672d4a05459c322cc41db04f03b5d429124296804b9cc8c7")
  public override fun onReEvaluationStatus(id: String, options: OnEventOptions.Builder.() -> Unit):
      Rule = onReEvaluationStatus(id, OnEventOptions(options))

  public interface Builder {
    public fun configRuleName(configRuleName: String)

    public fun description(description: String)

    public fun identifier(identifier: String)

    public fun inputParameters(inputParameters: Map<String, Any>)

    public fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency)

    public fun ruleScope(ruleScope: RuleScope)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.ManagedRule.Builder =
        software.amazon.awscdk.services.config.ManagedRule.Builder.create(scope, id)

    override fun configRuleName(configRuleName: String) {
      cdkBuilder.configRuleName(configRuleName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun identifier(identifier: String) {
      cdkBuilder.identifier(identifier)
    }

    override fun inputParameters(inputParameters: Map<String, Any>) {
      cdkBuilder.inputParameters(inputParameters)
    }

    override fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency) {
      cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency.let(MaximumExecutionFrequency::unwrap))
    }

    override fun ruleScope(ruleScope: RuleScope) {
      cdkBuilder.ruleScope(ruleScope.let(RuleScope::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.config.ManagedRule = cdkBuilder.build()
  }

  public companion object {
    public open fun fromConfigRuleName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      configRuleName: String,
    ): IRule =
        software.amazon.awscdk.services.config.ManagedRule.fromConfigRuleName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, configRuleName).let(IRule::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ManagedRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ManagedRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.ManagedRule): ManagedRule =
        ManagedRule(cdkObject)

    internal fun unwrap(wrapped: ManagedRule): software.amazon.awscdk.services.config.ManagedRule =
        wrapped.cdkObject
  }
}
