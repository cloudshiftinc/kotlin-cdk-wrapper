@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wafv2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnRuleGroupProps {
  public fun availableLabels(): Any? = unwrap(this).getAvailableLabels()

  public fun capacity(): Number

  public fun consumedLabels(): Any? = unwrap(this).getConsumedLabels()

  public fun customResponseBodies(): Any? = unwrap(this).getCustomResponseBodies()

  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String? = unwrap(this).getName()

  public fun rules(): Any? = unwrap(this).getRules()

  public fun scope(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun visibilityConfig(): Any

  @CdkDslMarker
  public interface Builder {
    public fun availableLabels(availableLabels: IResolvable)

    public fun availableLabels(availableLabels: List<Any>)

    public fun availableLabels(vararg availableLabels: Any)

    public fun capacity(capacity: Number)

    public fun consumedLabels(consumedLabels: IResolvable)

    public fun consumedLabels(consumedLabels: List<Any>)

    public fun consumedLabels(vararg consumedLabels: Any)

    public fun customResponseBodies(customResponseBodies: IResolvable)

    public fun customResponseBodies(customResponseBodies: Map<String, Any>)

    public fun description(description: String)

    public fun name(name: String)

    public fun rules(rules: IResolvable)

    public fun rules(rules: List<Any>)

    public fun rules(vararg rules: Any)

    public fun scope(scope: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun visibilityConfig(visibilityConfig: IResolvable)

    public fun visibilityConfig(visibilityConfig: CfnRuleGroup.VisibilityConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("64221d10455c9f28cf050e8e2ab95a6a1d4fd0cae07f9195a4d7951b4627371a")
    public
        fun visibilityConfig(visibilityConfig: CfnRuleGroup.VisibilityConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wafv2.CfnRuleGroupProps.Builder =
        software.amazon.awscdk.services.wafv2.CfnRuleGroupProps.builder()

    override fun availableLabels(availableLabels: IResolvable) {
      cdkBuilder.availableLabels(availableLabels.let(IResolvable::unwrap))
    }

    override fun availableLabels(availableLabels: List<Any>) {
      cdkBuilder.availableLabels(availableLabels)
    }

    override fun availableLabels(vararg availableLabels: Any): Unit =
        availableLabels(availableLabels.toList())

    override fun capacity(capacity: Number) {
      cdkBuilder.capacity(capacity)
    }

    override fun consumedLabels(consumedLabels: IResolvable) {
      cdkBuilder.consumedLabels(consumedLabels.let(IResolvable::unwrap))
    }

    override fun consumedLabels(consumedLabels: List<Any>) {
      cdkBuilder.consumedLabels(consumedLabels)
    }

    override fun consumedLabels(vararg consumedLabels: Any): Unit =
        consumedLabels(consumedLabels.toList())

    override fun customResponseBodies(customResponseBodies: IResolvable) {
      cdkBuilder.customResponseBodies(customResponseBodies.let(IResolvable::unwrap))
    }

    override fun customResponseBodies(customResponseBodies: Map<String, Any>) {
      cdkBuilder.customResponseBodies(customResponseBodies)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun rules(rules: IResolvable) {
      cdkBuilder.rules(rules.let(IResolvable::unwrap))
    }

    override fun rules(rules: List<Any>) {
      cdkBuilder.rules(rules)
    }

    override fun rules(vararg rules: Any): Unit = rules(rules.toList())

    override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun visibilityConfig(visibilityConfig: IResolvable) {
      cdkBuilder.visibilityConfig(visibilityConfig.let(IResolvable::unwrap))
    }

    override fun visibilityConfig(visibilityConfig: CfnRuleGroup.VisibilityConfigProperty) {
      cdkBuilder.visibilityConfig(visibilityConfig.let(CfnRuleGroup.VisibilityConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("64221d10455c9f28cf050e8e2ab95a6a1d4fd0cae07f9195a4d7951b4627371a")
    override
        fun visibilityConfig(visibilityConfig: CfnRuleGroup.VisibilityConfigProperty.Builder.() -> Unit):
        Unit = visibilityConfig(CfnRuleGroup.VisibilityConfigProperty(visibilityConfig))

    public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroupProps,
  ) : CdkObject(cdkObject), CfnRuleGroupProps {
    override fun availableLabels(): Any? = unwrap(this).getAvailableLabels()

    override fun capacity(): Number = unwrap(this).getCapacity()

    override fun consumedLabels(): Any? = unwrap(this).getConsumedLabels()

    override fun customResponseBodies(): Any? = unwrap(this).getCustomResponseBodies()

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String? = unwrap(this).getName()

    override fun rules(): Any? = unwrap(this).getRules()

    override fun scope(): String = unwrap(this).getScope()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun visibilityConfig(): Any = unwrap(this).getVisibilityConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRuleGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroupProps):
        CfnRuleGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRuleGroupProps):
        software.amazon.awscdk.services.wafv2.CfnRuleGroupProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.wafv2.CfnRuleGroupProps
  }
}
