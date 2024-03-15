@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CustomRuleProps : RuleProps {
  public fun configurationChanges(): Boolean? = unwrap(this).getConfigurationChanges()

  public fun lambdaFunction(): IFunction

  public fun periodic(): Boolean? = unwrap(this).getPeriodic()

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

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.CustomRuleProps.Builder =
        software.amazon.awscdk.services.config.CustomRuleProps.builder()

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

    public fun build(): software.amazon.awscdk.services.config.CustomRuleProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.config.CustomRuleProps,
  ) : CdkObject(cdkObject), CustomRuleProps {
    override fun configRuleName(): String? = unwrap(this).getConfigRuleName()

    override fun configurationChanges(): Boolean? = unwrap(this).getConfigurationChanges()

    override fun description(): String? = unwrap(this).getDescription()

    override fun inputParameters(): Map<String, Any> = unwrap(this).getInputParameters() ?:
        emptyMap()

    override fun lambdaFunction(): IFunction = unwrap(this).getLambdaFunction().let(IFunction::wrap)

    override fun maximumExecutionFrequency(): MaximumExecutionFrequency? =
        unwrap(this).getMaximumExecutionFrequency()?.let(MaximumExecutionFrequency::wrap)

    override fun periodic(): Boolean? = unwrap(this).getPeriodic()

    override fun ruleScope(): RuleScope? = unwrap(this).getRuleScope()?.let(RuleScope::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.CustomRuleProps):
        CustomRuleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomRuleProps):
        software.amazon.awscdk.services.config.CustomRuleProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.config.CustomRuleProps
  }
}
