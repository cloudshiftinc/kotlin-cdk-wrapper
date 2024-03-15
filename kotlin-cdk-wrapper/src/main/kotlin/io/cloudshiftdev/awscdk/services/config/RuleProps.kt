@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface RuleProps {
  public fun configRuleName(): String? = unwrap(this).getConfigRuleName()

  public fun description(): String? = unwrap(this).getDescription()

  public fun inputParameters(): Map<String, Any> = unwrap(this).getInputParameters() ?: emptyMap()

  public fun maximumExecutionFrequency(): MaximumExecutionFrequency? =
      unwrap(this).getMaximumExecutionFrequency()?.let(MaximumExecutionFrequency::wrap)

  public fun ruleScope(): RuleScope? = unwrap(this).getRuleScope()?.let(RuleScope::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun configRuleName(configRuleName: String)

    public fun description(description: String)

    public fun inputParameters(inputParameters: Map<String, Any>)

    public fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency)

    public fun ruleScope(ruleScope: RuleScope)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.RuleProps.Builder =
        software.amazon.awscdk.services.config.RuleProps.builder()

    override fun configRuleName(configRuleName: String) {
      cdkBuilder.configRuleName(configRuleName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
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

    public fun build(): software.amazon.awscdk.services.config.RuleProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.config.RuleProps,
  ) : CdkObject(cdkObject), RuleProps {
    override fun configRuleName(): String? = unwrap(this).getConfigRuleName()

    override fun description(): String? = unwrap(this).getDescription()

    override fun inputParameters(): Map<String, Any> = unwrap(this).getInputParameters() ?:
        emptyMap()

    override fun maximumExecutionFrequency(): MaximumExecutionFrequency? =
        unwrap(this).getMaximumExecutionFrequency()?.let(MaximumExecutionFrequency::wrap)

    override fun ruleScope(): RuleScope? = unwrap(this).getRuleScope()?.let(RuleScope::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.RuleProps): RuleProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RuleProps): software.amazon.awscdk.services.config.RuleProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.config.RuleProps
  }
}
