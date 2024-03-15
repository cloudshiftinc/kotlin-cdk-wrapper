@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53recoverycontrol

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnSafetyRuleProps {
  public fun assertionRule(): Any? = unwrap(this).getAssertionRule()

  public fun controlPanelArn(): String

  public fun gatingRule(): Any? = unwrap(this).getGatingRule()

  public fun name(): String

  public fun ruleConfig(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun assertionRule(assertionRule: IResolvable)

    public fun assertionRule(assertionRule: CfnSafetyRule.AssertionRuleProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e32eb88b6da6949a3fba525515e388aeaf23e57055d25474c161a3c3e6da041")
    public fun assertionRule(assertionRule: CfnSafetyRule.AssertionRuleProperty.Builder.() -> Unit)

    public fun controlPanelArn(controlPanelArn: String)

    public fun gatingRule(gatingRule: IResolvable)

    public fun gatingRule(gatingRule: CfnSafetyRule.GatingRuleProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3a41c79ff00f0d22d878abc676c70254f1aec171efaf1316eeef327c673e830")
    public fun gatingRule(gatingRule: CfnSafetyRule.GatingRuleProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun ruleConfig(ruleConfig: IResolvable)

    public fun ruleConfig(ruleConfig: CfnSafetyRule.RuleConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee1d6a6326ccc684eaa4a219ffa2836cd14f5b3a1c84602b8b52797ecbda3431")
    public fun ruleConfig(ruleConfig: CfnSafetyRule.RuleConfigProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRuleProps.Builder =
        software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRuleProps.builder()

    override fun assertionRule(assertionRule: IResolvable) {
      cdkBuilder.assertionRule(assertionRule.let(IResolvable::unwrap))
    }

    override fun assertionRule(assertionRule: CfnSafetyRule.AssertionRuleProperty) {
      cdkBuilder.assertionRule(assertionRule.let(CfnSafetyRule.AssertionRuleProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e32eb88b6da6949a3fba525515e388aeaf23e57055d25474c161a3c3e6da041")
    override
        fun assertionRule(assertionRule: CfnSafetyRule.AssertionRuleProperty.Builder.() -> Unit):
        Unit = assertionRule(CfnSafetyRule.AssertionRuleProperty(assertionRule))

    override fun controlPanelArn(controlPanelArn: String) {
      cdkBuilder.controlPanelArn(controlPanelArn)
    }

    override fun gatingRule(gatingRule: IResolvable) {
      cdkBuilder.gatingRule(gatingRule.let(IResolvable::unwrap))
    }

    override fun gatingRule(gatingRule: CfnSafetyRule.GatingRuleProperty) {
      cdkBuilder.gatingRule(gatingRule.let(CfnSafetyRule.GatingRuleProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3a41c79ff00f0d22d878abc676c70254f1aec171efaf1316eeef327c673e830")
    override fun gatingRule(gatingRule: CfnSafetyRule.GatingRuleProperty.Builder.() -> Unit): Unit =
        gatingRule(CfnSafetyRule.GatingRuleProperty(gatingRule))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun ruleConfig(ruleConfig: IResolvable) {
      cdkBuilder.ruleConfig(ruleConfig.let(IResolvable::unwrap))
    }

    override fun ruleConfig(ruleConfig: CfnSafetyRule.RuleConfigProperty) {
      cdkBuilder.ruleConfig(ruleConfig.let(CfnSafetyRule.RuleConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee1d6a6326ccc684eaa4a219ffa2836cd14f5b3a1c84602b8b52797ecbda3431")
    override fun ruleConfig(ruleConfig: CfnSafetyRule.RuleConfigProperty.Builder.() -> Unit): Unit =
        ruleConfig(CfnSafetyRule.RuleConfigProperty(ruleConfig))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRuleProps,
  ) : CdkObject(cdkObject), CfnSafetyRuleProps {
    override fun assertionRule(): Any? = unwrap(this).getAssertionRule()

    override fun controlPanelArn(): String = unwrap(this).getControlPanelArn()

    override fun gatingRule(): Any? = unwrap(this).getGatingRule()

    override fun name(): String = unwrap(this).getName()

    override fun ruleConfig(): Any = unwrap(this).getRuleConfig()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSafetyRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRuleProps):
        CfnSafetyRuleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSafetyRuleProps):
        software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRuleProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRuleProps
  }
}
