@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

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

public interface CfnRuleProps {
  public fun action(): Any

  public fun listenerIdentifier(): String? = unwrap(this).getListenerIdentifier()

  public fun match(): Any

  public fun name(): String? = unwrap(this).getName()

  public fun priority(): Number

  public fun serviceIdentifier(): String? = unwrap(this).getServiceIdentifier()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun action(action: IResolvable)

    public fun action(action: CfnRule.ActionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54cbe22d0181539e49be36eaa8bba893d0ad33e35080c801e9264fe9f1b3f7d8")
    public fun action(action: CfnRule.ActionProperty.Builder.() -> Unit)

    public fun listenerIdentifier(listenerIdentifier: String)

    public fun match(match: IResolvable)

    public fun match(match: CfnRule.MatchProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("193d9602e4b0bfb37d41527fd8192a8dbb2a7b360221f5ae5921759b1ea13709")
    public fun match(match: CfnRule.MatchProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun priority(priority: Number)

    public fun serviceIdentifier(serviceIdentifier: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.vpclattice.CfnRuleProps.Builder =
        software.amazon.awscdk.services.vpclattice.CfnRuleProps.builder()

    override fun action(action: IResolvable) {
      cdkBuilder.action(action.let(IResolvable::unwrap))
    }

    override fun action(action: CfnRule.ActionProperty) {
      cdkBuilder.action(action.let(CfnRule.ActionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54cbe22d0181539e49be36eaa8bba893d0ad33e35080c801e9264fe9f1b3f7d8")
    override fun action(action: CfnRule.ActionProperty.Builder.() -> Unit): Unit =
        action(CfnRule.ActionProperty(action))

    override fun listenerIdentifier(listenerIdentifier: String) {
      cdkBuilder.listenerIdentifier(listenerIdentifier)
    }

    override fun match(match: IResolvable) {
      cdkBuilder.match(match.let(IResolvable::unwrap))
    }

    override fun match(match: CfnRule.MatchProperty) {
      cdkBuilder.match(match.let(CfnRule.MatchProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("193d9602e4b0bfb37d41527fd8192a8dbb2a7b360221f5ae5921759b1ea13709")
    override fun match(match: CfnRule.MatchProperty.Builder.() -> Unit): Unit =
        match(CfnRule.MatchProperty(match))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    override fun serviceIdentifier(serviceIdentifier: String) {
      cdkBuilder.serviceIdentifier(serviceIdentifier)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnRuleProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.vpclattice.CfnRuleProps,
  ) : CdkObject(cdkObject), CfnRuleProps {
    override fun action(): Any = unwrap(this).getAction()

    override fun listenerIdentifier(): String? = unwrap(this).getListenerIdentifier()

    override fun match(): Any = unwrap(this).getMatch()

    override fun name(): String? = unwrap(this).getName()

    override fun priority(): Number = unwrap(this).getPriority()

    override fun serviceIdentifier(): String? = unwrap(this).getServiceIdentifier()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnRuleProps):
        CfnRuleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRuleProps):
        software.amazon.awscdk.services.vpclattice.CfnRuleProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.vpclattice.CfnRuleProps
  }
}
