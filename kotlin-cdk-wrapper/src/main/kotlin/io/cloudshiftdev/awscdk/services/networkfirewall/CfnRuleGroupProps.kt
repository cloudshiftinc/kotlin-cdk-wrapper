@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkfirewall

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnRuleGroupProps {
  public fun capacity(): Number

  public fun description(): String? = unwrap(this).getDescription()

  public fun ruleGroup(): Any? = unwrap(this).getRuleGroup()

  public fun ruleGroupName(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun capacity(capacity: Number)

    public fun description(description: String)

    public fun ruleGroup(ruleGroup: IResolvable)

    public fun ruleGroup(ruleGroup: CfnRuleGroup.RuleGroupProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c01b9e353913eb43595796867c8a1afe9cc044bfb514b27796a926356a2c393")
    public fun ruleGroup(ruleGroup: CfnRuleGroup.RuleGroupProperty.Builder.() -> Unit)

    public fun ruleGroupName(ruleGroupName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkfirewall.CfnRuleGroupProps.Builder =
        software.amazon.awscdk.services.networkfirewall.CfnRuleGroupProps.builder()

    override fun capacity(capacity: Number) {
      cdkBuilder.capacity(capacity)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun ruleGroup(ruleGroup: IResolvable) {
      cdkBuilder.ruleGroup(ruleGroup.let(IResolvable::unwrap))
    }

    override fun ruleGroup(ruleGroup: CfnRuleGroup.RuleGroupProperty) {
      cdkBuilder.ruleGroup(ruleGroup.let(CfnRuleGroup.RuleGroupProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c01b9e353913eb43595796867c8a1afe9cc044bfb514b27796a926356a2c393")
    override fun ruleGroup(ruleGroup: CfnRuleGroup.RuleGroupProperty.Builder.() -> Unit): Unit =
        ruleGroup(CfnRuleGroup.RuleGroupProperty(ruleGroup))

    override fun ruleGroupName(ruleGroupName: String) {
      cdkBuilder.ruleGroupName(ruleGroupName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.networkfirewall.CfnRuleGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroupProps,
  ) : CdkObject(cdkObject), CfnRuleGroupProps {
    override fun capacity(): Number = unwrap(this).getCapacity()

    override fun description(): String? = unwrap(this).getDescription()

    override fun ruleGroup(): Any? = unwrap(this).getRuleGroup()

    override fun ruleGroupName(): String = unwrap(this).getRuleGroupName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRuleGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroupProps):
        CfnRuleGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRuleGroupProps):
        software.amazon.awscdk.services.networkfirewall.CfnRuleGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.networkfirewall.CfnRuleGroupProps
  }
}
