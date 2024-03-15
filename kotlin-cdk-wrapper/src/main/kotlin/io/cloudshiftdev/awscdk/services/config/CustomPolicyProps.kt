@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CustomPolicyProps : RuleProps {
  public fun enableDebugLog(): Boolean? = unwrap(this).getEnableDebugLog()

  public fun policyText(): String

  @CdkDslMarker
  public interface Builder {
    public fun configRuleName(configRuleName: String)

    public fun description(description: String)

    public fun enableDebugLog(enableDebugLog: Boolean)

    public fun inputParameters(inputParameters: Map<String, Any>)

    public fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency)

    public fun policyText(policyText: String)

    public fun ruleScope(ruleScope: RuleScope)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.CustomPolicyProps.Builder =
        software.amazon.awscdk.services.config.CustomPolicyProps.builder()

    override fun configRuleName(configRuleName: String) {
      cdkBuilder.configRuleName(configRuleName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun enableDebugLog(enableDebugLog: Boolean) {
      cdkBuilder.enableDebugLog(enableDebugLog)
    }

    override fun inputParameters(inputParameters: Map<String, Any>) {
      cdkBuilder.inputParameters(inputParameters)
    }

    override fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency) {
      cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency.let(MaximumExecutionFrequency::unwrap))
    }

    override fun policyText(policyText: String) {
      cdkBuilder.policyText(policyText)
    }

    override fun ruleScope(ruleScope: RuleScope) {
      cdkBuilder.ruleScope(ruleScope.let(RuleScope::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.config.CustomPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.config.CustomPolicyProps,
  ) : CdkObject(cdkObject), CustomPolicyProps {
    override fun configRuleName(): String? = unwrap(this).getConfigRuleName()

    override fun description(): String? = unwrap(this).getDescription()

    override fun enableDebugLog(): Boolean? = unwrap(this).getEnableDebugLog()

    override fun inputParameters(): Map<String, Any> = unwrap(this).getInputParameters() ?:
        emptyMap()

    override fun maximumExecutionFrequency(): MaximumExecutionFrequency? =
        unwrap(this).getMaximumExecutionFrequency()?.let(MaximumExecutionFrequency::wrap)

    override fun policyText(): String = unwrap(this).getPolicyText()

    override fun ruleScope(): RuleScope? = unwrap(this).getRuleScope()?.let(RuleScope::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.CustomPolicyProps):
        CustomPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomPolicyProps):
        software.amazon.awscdk.services.config.CustomPolicyProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.config.CustomPolicyProps
  }
}
