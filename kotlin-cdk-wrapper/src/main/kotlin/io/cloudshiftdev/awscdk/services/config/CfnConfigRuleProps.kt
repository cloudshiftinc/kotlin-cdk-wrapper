@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnConfigRuleProps {
  public fun compliance(): Any? = unwrap(this).getCompliance()

  public fun configRuleName(): String? = unwrap(this).getConfigRuleName()

  public fun description(): String? = unwrap(this).getDescription()

  public fun evaluationModes(): Any? = unwrap(this).getEvaluationModes()

  public fun inputParameters(): Any? = unwrap(this).getInputParameters()

  public fun maximumExecutionFrequency(): String? = unwrap(this).getMaximumExecutionFrequency()

  public fun scope(): Any? = unwrap(this).getScope()

  public fun source(): Any

  @CdkDslMarker
  public interface Builder {
    public fun compliance(compliance: IResolvable)

    public fun compliance(compliance: CfnConfigRule.ComplianceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("291908b26f606da8a7919a3e9b3852d4e1e62c2e506fc405bc7921c5c48216a1")
    public fun compliance(compliance: CfnConfigRule.ComplianceProperty.Builder.() -> Unit)

    public fun configRuleName(configRuleName: String)

    public fun description(description: String)

    public fun evaluationModes(evaluationModes: IResolvable)

    public fun evaluationModes(evaluationModes: List<Any>)

    public fun evaluationModes(vararg evaluationModes: Any)

    public fun inputParameters(inputParameters: Any)

    public fun maximumExecutionFrequency(maximumExecutionFrequency: String)

    public fun scope(scope: IResolvable)

    public fun scope(scope: CfnConfigRule.ScopeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4ee6e340306d531ad67256cb7041375fd9bcb1f4358b5b7586e29c65155c88b")
    public fun scope(scope: CfnConfigRule.ScopeProperty.Builder.() -> Unit)

    public fun source(source: IResolvable)

    public fun source(source: CfnConfigRule.SourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a5ee222c5438f21a8858b5a9bb740370a98ab3f124d18d9610505a5e1d4f7c0")
    public fun source(source: CfnConfigRule.SourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.CfnConfigRuleProps.Builder =
        software.amazon.awscdk.services.config.CfnConfigRuleProps.builder()

    override fun compliance(compliance: IResolvable) {
      cdkBuilder.compliance(compliance.let(IResolvable::unwrap))
    }

    override fun compliance(compliance: CfnConfigRule.ComplianceProperty) {
      cdkBuilder.compliance(compliance.let(CfnConfigRule.ComplianceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("291908b26f606da8a7919a3e9b3852d4e1e62c2e506fc405bc7921c5c48216a1")
    override fun compliance(compliance: CfnConfigRule.ComplianceProperty.Builder.() -> Unit): Unit =
        compliance(CfnConfigRule.ComplianceProperty(compliance))

    override fun configRuleName(configRuleName: String) {
      cdkBuilder.configRuleName(configRuleName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun evaluationModes(evaluationModes: IResolvable) {
      cdkBuilder.evaluationModes(evaluationModes.let(IResolvable::unwrap))
    }

    override fun evaluationModes(evaluationModes: List<Any>) {
      cdkBuilder.evaluationModes(evaluationModes)
    }

    override fun evaluationModes(vararg evaluationModes: Any): Unit =
        evaluationModes(evaluationModes.toList())

    override fun inputParameters(inputParameters: Any) {
      cdkBuilder.inputParameters(inputParameters)
    }

    override fun maximumExecutionFrequency(maximumExecutionFrequency: String) {
      cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
    }

    override fun scope(scope: IResolvable) {
      cdkBuilder.scope(scope.let(IResolvable::unwrap))
    }

    override fun scope(scope: CfnConfigRule.ScopeProperty) {
      cdkBuilder.scope(scope.let(CfnConfigRule.ScopeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4ee6e340306d531ad67256cb7041375fd9bcb1f4358b5b7586e29c65155c88b")
    override fun scope(scope: CfnConfigRule.ScopeProperty.Builder.() -> Unit): Unit =
        scope(CfnConfigRule.ScopeProperty(scope))

    override fun source(source: IResolvable) {
      cdkBuilder.source(source.let(IResolvable::unwrap))
    }

    override fun source(source: CfnConfigRule.SourceProperty) {
      cdkBuilder.source(source.let(CfnConfigRule.SourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a5ee222c5438f21a8858b5a9bb740370a98ab3f124d18d9610505a5e1d4f7c0")
    override fun source(source: CfnConfigRule.SourceProperty.Builder.() -> Unit): Unit =
        source(CfnConfigRule.SourceProperty(source))

    public fun build(): software.amazon.awscdk.services.config.CfnConfigRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.config.CfnConfigRuleProps,
  ) : CdkObject(cdkObject), CfnConfigRuleProps {
    override fun compliance(): Any? = unwrap(this).getCompliance()

    override fun configRuleName(): String? = unwrap(this).getConfigRuleName()

    override fun description(): String? = unwrap(this).getDescription()

    override fun evaluationModes(): Any? = unwrap(this).getEvaluationModes()

    override fun inputParameters(): Any? = unwrap(this).getInputParameters()

    override fun maximumExecutionFrequency(): String? = unwrap(this).getMaximumExecutionFrequency()

    override fun scope(): Any? = unwrap(this).getScope()

    override fun source(): Any = unwrap(this).getSource()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfigRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigRuleProps):
        CfnConfigRuleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfigRuleProps):
        software.amazon.awscdk.services.config.CfnConfigRuleProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.config.CfnConfigRuleProps
  }
}
