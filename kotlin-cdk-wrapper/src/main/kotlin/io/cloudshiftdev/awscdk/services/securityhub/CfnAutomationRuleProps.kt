@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnAutomationRuleProps {
  public fun actions(): Any? = unwrap(this).getActions()

  public fun criteria(): Any? = unwrap(this).getCriteria()

  public fun description(): String? = unwrap(this).getDescription()

  public fun isTerminal(): Any? = unwrap(this).getIsTerminal()

  public fun ruleName(): String? = unwrap(this).getRuleName()

  public fun ruleOrder(): Number? = unwrap(this).getRuleOrder()

  public fun ruleStatus(): String? = unwrap(this).getRuleStatus()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun actions(actions: IResolvable)

    public fun actions(actions: List<Any>)

    public fun actions(vararg actions: Any)

    public fun criteria(criteria: IResolvable)

    public fun criteria(criteria: CfnAutomationRule.AutomationRulesFindingFiltersProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4b9fe65b2e87ea5657062360d44aa3b6c19213761055e0c7f0e2bedd11f44552")
    public
        fun criteria(criteria: CfnAutomationRule.AutomationRulesFindingFiltersProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun isTerminal(isTerminal: Boolean)

    public fun isTerminal(isTerminal: IResolvable)

    public fun ruleName(ruleName: String)

    public fun ruleOrder(ruleOrder: Number)

    public fun ruleStatus(ruleStatus: String)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.securityhub.CfnAutomationRuleProps.Builder =
        software.amazon.awscdk.services.securityhub.CfnAutomationRuleProps.builder()

    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable::unwrap))
    }

    override fun actions(actions: List<Any>) {
      cdkBuilder.actions(actions)
    }

    override fun actions(vararg actions: Any): Unit = actions(actions.toList())

    override fun criteria(criteria: IResolvable) {
      cdkBuilder.criteria(criteria.let(IResolvable::unwrap))
    }

    override fun criteria(criteria: CfnAutomationRule.AutomationRulesFindingFiltersProperty) {
      cdkBuilder.criteria(criteria.let(CfnAutomationRule.AutomationRulesFindingFiltersProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4b9fe65b2e87ea5657062360d44aa3b6c19213761055e0c7f0e2bedd11f44552")
    override
        fun criteria(criteria: CfnAutomationRule.AutomationRulesFindingFiltersProperty.Builder.() -> Unit):
        Unit = criteria(CfnAutomationRule.AutomationRulesFindingFiltersProperty(criteria))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun isTerminal(isTerminal: Boolean) {
      cdkBuilder.isTerminal(isTerminal)
    }

    override fun isTerminal(isTerminal: IResolvable) {
      cdkBuilder.isTerminal(isTerminal.let(IResolvable::unwrap))
    }

    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    override fun ruleOrder(ruleOrder: Number) {
      cdkBuilder.ruleOrder(ruleOrder)
    }

    override fun ruleStatus(ruleStatus: String) {
      cdkBuilder.ruleStatus(ruleStatus)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnAutomationRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleProps,
  ) : CdkObject(cdkObject), CfnAutomationRuleProps {
    override fun actions(): Any? = unwrap(this).getActions()

    override fun criteria(): Any? = unwrap(this).getCriteria()

    override fun description(): String? = unwrap(this).getDescription()

    override fun isTerminal(): Any? = unwrap(this).getIsTerminal()

    override fun ruleName(): String? = unwrap(this).getRuleName()

    override fun ruleOrder(): Number? = unwrap(this).getRuleOrder()

    override fun ruleStatus(): String? = unwrap(this).getRuleStatus()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAutomationRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleProps):
        CfnAutomationRuleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAutomationRuleProps):
        software.amazon.awscdk.services.securityhub.CfnAutomationRuleProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.securityhub.CfnAutomationRuleProps
  }
}
