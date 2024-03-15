@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRule internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun action(): Any = unwrap(this).getAction()

  public open fun action(`value`: IResolvable) {
    unwrap(this).setAction(`value`.let(IResolvable::unwrap))
  }

  public open fun action(`value`: ActionProperty) {
    unwrap(this).setAction(`value`.let(ActionProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1e41ebe2c4504f6b68284e140c22a806b55173c36d63b9eaa9849456a7007399")
  public open fun action(`value`: ActionProperty.Builder.() -> Unit): Unit =
      action(ActionProperty(`value`))

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun listenerIdentifier(): String? = unwrap(this).getListenerIdentifier()

  public open fun listenerIdentifier(`value`: String) {
    unwrap(this).setListenerIdentifier(`value`)
  }

  public open fun match(): Any = unwrap(this).getMatch()

  public open fun match(`value`: IResolvable) {
    unwrap(this).setMatch(`value`.let(IResolvable::unwrap))
  }

  public open fun match(`value`: MatchProperty) {
    unwrap(this).setMatch(`value`.let(MatchProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("51cfc7aebc89d00e550d45e58cc96d599269141d9060ca5991f544d7332ccab6")
  public open fun match(`value`: MatchProperty.Builder.() -> Unit): Unit =
      match(MatchProperty(`value`))

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun priority(): Number = unwrap(this).getPriority()

  public open fun priority(`value`: Number) {
    unwrap(this).setPriority(`value`)
  }

  public open fun serviceIdentifier(): String? = unwrap(this).getServiceIdentifier()

  public open fun serviceIdentifier(`value`: String) {
    unwrap(this).setServiceIdentifier(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun action(action: IResolvable)

    public fun action(action: ActionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0cdfa0dc66bc15dc2277561cb0cc0da120c71b67f6f3561f6de721c39cd897b2")
    public fun action(action: ActionProperty.Builder.() -> Unit)

    public fun listenerIdentifier(listenerIdentifier: String)

    public fun match(match: IResolvable)

    public fun match(match: MatchProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9695a756ba1a6109e12c8b356ec6e7eedda0c35214677257b0f458ff02af6971")
    public fun match(match: MatchProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun priority(priority: Number)

    public fun serviceIdentifier(serviceIdentifier: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.vpclattice.CfnRule.Builder =
        software.amazon.awscdk.services.vpclattice.CfnRule.Builder.create(scope, id)

    override fun action(action: IResolvable) {
      cdkBuilder.action(action.let(IResolvable::unwrap))
    }

    override fun action(action: ActionProperty) {
      cdkBuilder.action(action.let(ActionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0cdfa0dc66bc15dc2277561cb0cc0da120c71b67f6f3561f6de721c39cd897b2")
    override fun action(action: ActionProperty.Builder.() -> Unit): Unit =
        action(ActionProperty(action))

    override fun listenerIdentifier(listenerIdentifier: String) {
      cdkBuilder.listenerIdentifier(listenerIdentifier)
    }

    override fun match(match: IResolvable) {
      cdkBuilder.match(match.let(IResolvable::unwrap))
    }

    override fun match(match: MatchProperty) {
      cdkBuilder.match(match.let(MatchProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9695a756ba1a6109e12c8b356ec6e7eedda0c35214677257b0f458ff02af6971")
    override fun match(match: MatchProperty.Builder.() -> Unit): Unit = match(MatchProperty(match))

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

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnRule = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.vpclattice.CfnRule.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule): CfnRule =
        CfnRule(cdkObject)

    internal fun unwrap(wrapped: CfnRule): software.amazon.awscdk.services.vpclattice.CfnRule =
        wrapped.cdkObject
  }

  public interface ActionProperty {
    public fun fixedResponse(): Any? = unwrap(this).getFixedResponse()

    public fun forward(): Any? = unwrap(this).getForward()

    @CdkDslMarker
    public interface Builder {
      public fun fixedResponse(fixedResponse: IResolvable)

      public fun fixedResponse(fixedResponse: FixedResponseProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("df1da1bf9c6b9ee1fb3ff32972e833de1241e802607d2c9b9e68ad469a86fce5")
      public fun fixedResponse(fixedResponse: FixedResponseProperty.Builder.() -> Unit)

      public fun forward(forward: IResolvable)

      public fun forward(forward: ForwardProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe455445f49766a9458412bdf9461a35c665b90503285f546ac9908f8fcdd8e9")
      public fun forward(forward: ForwardProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnRule.ActionProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnRule.ActionProperty.builder()

      override fun fixedResponse(fixedResponse: IResolvable) {
        cdkBuilder.fixedResponse(fixedResponse.let(IResolvable::unwrap))
      }

      override fun fixedResponse(fixedResponse: FixedResponseProperty) {
        cdkBuilder.fixedResponse(fixedResponse.let(FixedResponseProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("df1da1bf9c6b9ee1fb3ff32972e833de1241e802607d2c9b9e68ad469a86fce5")
      override fun fixedResponse(fixedResponse: FixedResponseProperty.Builder.() -> Unit): Unit =
          fixedResponse(FixedResponseProperty(fixedResponse))

      override fun forward(forward: IResolvable) {
        cdkBuilder.forward(forward.let(IResolvable::unwrap))
      }

      override fun forward(forward: ForwardProperty) {
        cdkBuilder.forward(forward.let(ForwardProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe455445f49766a9458412bdf9461a35c665b90503285f546ac9908f8fcdd8e9")
      override fun forward(forward: ForwardProperty.Builder.() -> Unit): Unit =
          forward(ForwardProperty(forward))

      public fun build(): software.amazon.awscdk.services.vpclattice.CfnRule.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.ActionProperty,
    ) : CdkObject(cdkObject), ActionProperty {
      override fun fixedResponse(): Any? = unwrap(this).getFixedResponse()

      override fun forward(): Any? = unwrap(this).getForward()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.ActionProperty):
          ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.vpclattice.CfnRule.ActionProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.vpclattice.CfnRule.ActionProperty
    }
  }

  public interface HeaderMatchProperty {
    public fun caseSensitive(): Any? = unwrap(this).getCaseSensitive()

    public fun match(): Any

    public fun name(): String

    @CdkDslMarker
    public interface Builder {
      public fun caseSensitive(caseSensitive: Boolean)

      public fun caseSensitive(caseSensitive: IResolvable)

      public fun match(match: IResolvable)

      public fun match(match: HeaderMatchTypeProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("74f1fa1344a5fe6e95184685e8bc22efdb4b10d412031998a58e82f907101084")
      public fun match(match: HeaderMatchTypeProperty.Builder.() -> Unit)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnRule.HeaderMatchProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnRule.HeaderMatchProperty.builder()

      override fun caseSensitive(caseSensitive: Boolean) {
        cdkBuilder.caseSensitive(caseSensitive)
      }

      override fun caseSensitive(caseSensitive: IResolvable) {
        cdkBuilder.caseSensitive(caseSensitive.let(IResolvable::unwrap))
      }

      override fun match(match: IResolvable) {
        cdkBuilder.match(match.let(IResolvable::unwrap))
      }

      override fun match(match: HeaderMatchTypeProperty) {
        cdkBuilder.match(match.let(HeaderMatchTypeProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("74f1fa1344a5fe6e95184685e8bc22efdb4b10d412031998a58e82f907101084")
      override fun match(match: HeaderMatchTypeProperty.Builder.() -> Unit): Unit =
          match(HeaderMatchTypeProperty(match))

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.vpclattice.CfnRule.HeaderMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.vpclattice.CfnRule.HeaderMatchProperty,
    ) : CdkObject(cdkObject), HeaderMatchProperty {
      override fun caseSensitive(): Any? = unwrap(this).getCaseSensitive()

      override fun match(): Any = unwrap(this).getMatch()

      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HeaderMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.HeaderMatchProperty):
          HeaderMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HeaderMatchProperty):
          software.amazon.awscdk.services.vpclattice.CfnRule.HeaderMatchProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.vpclattice.CfnRule.HeaderMatchProperty
    }
  }

  public interface HeaderMatchTypeProperty {
    public fun contains(): String? = unwrap(this).getContains()

    public fun exact(): String? = unwrap(this).getExact()

    public fun prefix(): String? = unwrap(this).getPrefix()

    @CdkDslMarker
    public interface Builder {
      public fun contains(contains: String)

      public fun exact(exact: String)

      public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnRule.HeaderMatchTypeProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnRule.HeaderMatchTypeProperty.builder()

      override fun contains(contains: String) {
        cdkBuilder.contains(contains)
      }

      override fun exact(exact: String) {
        cdkBuilder.exact(exact)
      }

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build(): software.amazon.awscdk.services.vpclattice.CfnRule.HeaderMatchTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.vpclattice.CfnRule.HeaderMatchTypeProperty,
    ) : CdkObject(cdkObject), HeaderMatchTypeProperty {
      override fun contains(): String? = unwrap(this).getContains()

      override fun exact(): String? = unwrap(this).getExact()

      override fun prefix(): String? = unwrap(this).getPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HeaderMatchTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.HeaderMatchTypeProperty):
          HeaderMatchTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HeaderMatchTypeProperty):
          software.amazon.awscdk.services.vpclattice.CfnRule.HeaderMatchTypeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.vpclattice.CfnRule.HeaderMatchTypeProperty
    }
  }

  public interface FixedResponseProperty {
    public fun statusCode(): Number

    @CdkDslMarker
    public interface Builder {
      public fun statusCode(statusCode: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnRule.FixedResponseProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnRule.FixedResponseProperty.builder()

      override fun statusCode(statusCode: Number) {
        cdkBuilder.statusCode(statusCode)
      }

      public fun build(): software.amazon.awscdk.services.vpclattice.CfnRule.FixedResponseProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.vpclattice.CfnRule.FixedResponseProperty,
    ) : CdkObject(cdkObject), FixedResponseProperty {
      override fun statusCode(): Number = unwrap(this).getStatusCode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FixedResponseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.FixedResponseProperty):
          FixedResponseProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FixedResponseProperty):
          software.amazon.awscdk.services.vpclattice.CfnRule.FixedResponseProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.vpclattice.CfnRule.FixedResponseProperty
    }
  }

  public interface PathMatchTypeProperty {
    public fun exact(): String? = unwrap(this).getExact()

    public fun prefix(): String? = unwrap(this).getPrefix()

    @CdkDslMarker
    public interface Builder {
      public fun exact(exact: String)

      public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnRule.PathMatchTypeProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnRule.PathMatchTypeProperty.builder()

      override fun exact(exact: String) {
        cdkBuilder.exact(exact)
      }

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build(): software.amazon.awscdk.services.vpclattice.CfnRule.PathMatchTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.vpclattice.CfnRule.PathMatchTypeProperty,
    ) : CdkObject(cdkObject), PathMatchTypeProperty {
      override fun exact(): String? = unwrap(this).getExact()

      override fun prefix(): String? = unwrap(this).getPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PathMatchTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.PathMatchTypeProperty):
          PathMatchTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PathMatchTypeProperty):
          software.amazon.awscdk.services.vpclattice.CfnRule.PathMatchTypeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.vpclattice.CfnRule.PathMatchTypeProperty
    }
  }

  public interface ForwardProperty {
    public fun targetGroups(): Any

    @CdkDslMarker
    public interface Builder {
      public fun targetGroups(targetGroups: IResolvable)

      public fun targetGroups(targetGroups: List<Any>)

      public fun targetGroups(vararg targetGroups: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnRule.ForwardProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnRule.ForwardProperty.builder()

      override fun targetGroups(targetGroups: IResolvable) {
        cdkBuilder.targetGroups(targetGroups.let(IResolvable::unwrap))
      }

      override fun targetGroups(targetGroups: List<Any>) {
        cdkBuilder.targetGroups(targetGroups)
      }

      override fun targetGroups(vararg targetGroups: Any): Unit =
          targetGroups(targetGroups.toList())

      public fun build(): software.amazon.awscdk.services.vpclattice.CfnRule.ForwardProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.ForwardProperty,
    ) : CdkObject(cdkObject), ForwardProperty {
      override fun targetGroups(): Any = unwrap(this).getTargetGroups()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ForwardProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.ForwardProperty):
          ForwardProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ForwardProperty):
          software.amazon.awscdk.services.vpclattice.CfnRule.ForwardProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.vpclattice.CfnRule.ForwardProperty
    }
  }

  public interface MatchProperty {
    public fun httpMatch(): Any

    @CdkDslMarker
    public interface Builder {
      public fun httpMatch(httpMatch: IResolvable)

      public fun httpMatch(httpMatch: HttpMatchProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac03b8d70d9360570b784633448685f84a835d082ee07d5773c5640701dba642")
      public fun httpMatch(httpMatch: HttpMatchProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnRule.MatchProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnRule.MatchProperty.builder()

      override fun httpMatch(httpMatch: IResolvable) {
        cdkBuilder.httpMatch(httpMatch.let(IResolvable::unwrap))
      }

      override fun httpMatch(httpMatch: HttpMatchProperty) {
        cdkBuilder.httpMatch(httpMatch.let(HttpMatchProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac03b8d70d9360570b784633448685f84a835d082ee07d5773c5640701dba642")
      override fun httpMatch(httpMatch: HttpMatchProperty.Builder.() -> Unit): Unit =
          httpMatch(HttpMatchProperty(httpMatch))

      public fun build(): software.amazon.awscdk.services.vpclattice.CfnRule.MatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.MatchProperty,
    ) : CdkObject(cdkObject), MatchProperty {
      override fun httpMatch(): Any = unwrap(this).getHttpMatch()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.MatchProperty):
          MatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MatchProperty):
          software.amazon.awscdk.services.vpclattice.CfnRule.MatchProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.vpclattice.CfnRule.MatchProperty
    }
  }

  public interface PathMatchProperty {
    public fun caseSensitive(): Any? = unwrap(this).getCaseSensitive()

    public fun match(): Any

    @CdkDslMarker
    public interface Builder {
      public fun caseSensitive(caseSensitive: Boolean)

      public fun caseSensitive(caseSensitive: IResolvable)

      public fun match(match: IResolvable)

      public fun match(match: PathMatchTypeProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9a4e38510e114fb9aa7bbe175a25af8c12ff95a5d4ea6cc961bd44ea4699b537")
      public fun match(match: PathMatchTypeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnRule.PathMatchProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnRule.PathMatchProperty.builder()

      override fun caseSensitive(caseSensitive: Boolean) {
        cdkBuilder.caseSensitive(caseSensitive)
      }

      override fun caseSensitive(caseSensitive: IResolvable) {
        cdkBuilder.caseSensitive(caseSensitive.let(IResolvable::unwrap))
      }

      override fun match(match: IResolvable) {
        cdkBuilder.match(match.let(IResolvable::unwrap))
      }

      override fun match(match: PathMatchTypeProperty) {
        cdkBuilder.match(match.let(PathMatchTypeProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9a4e38510e114fb9aa7bbe175a25af8c12ff95a5d4ea6cc961bd44ea4699b537")
      override fun match(match: PathMatchTypeProperty.Builder.() -> Unit): Unit =
          match(PathMatchTypeProperty(match))

      public fun build(): software.amazon.awscdk.services.vpclattice.CfnRule.PathMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.PathMatchProperty,
    ) : CdkObject(cdkObject), PathMatchProperty {
      override fun caseSensitive(): Any? = unwrap(this).getCaseSensitive()

      override fun match(): Any = unwrap(this).getMatch()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PathMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.PathMatchProperty):
          PathMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PathMatchProperty):
          software.amazon.awscdk.services.vpclattice.CfnRule.PathMatchProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.vpclattice.CfnRule.PathMatchProperty
    }
  }

  public interface WeightedTargetGroupProperty {
    public fun targetGroupIdentifier(): String

    public fun weight(): Number? = unwrap(this).getWeight()

    @CdkDslMarker
    public interface Builder {
      public fun targetGroupIdentifier(targetGroupIdentifier: String)

      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnRule.WeightedTargetGroupProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnRule.WeightedTargetGroupProperty.builder()

      override fun targetGroupIdentifier(targetGroupIdentifier: String) {
        cdkBuilder.targetGroupIdentifier(targetGroupIdentifier)
      }

      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.vpclattice.CfnRule.WeightedTargetGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.vpclattice.CfnRule.WeightedTargetGroupProperty,
    ) : CdkObject(cdkObject), WeightedTargetGroupProperty {
      override fun targetGroupIdentifier(): String = unwrap(this).getTargetGroupIdentifier()

      override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WeightedTargetGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.WeightedTargetGroupProperty):
          WeightedTargetGroupProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WeightedTargetGroupProperty):
          software.amazon.awscdk.services.vpclattice.CfnRule.WeightedTargetGroupProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.vpclattice.CfnRule.WeightedTargetGroupProperty
    }
  }

  public interface HttpMatchProperty {
    public fun headerMatches(): Any? = unwrap(this).getHeaderMatches()

    public fun method(): String? = unwrap(this).getMethod()

    public fun pathMatch(): Any? = unwrap(this).getPathMatch()

    @CdkDslMarker
    public interface Builder {
      public fun headerMatches(headerMatches: IResolvable)

      public fun headerMatches(headerMatches: List<Any>)

      public fun headerMatches(vararg headerMatches: Any)

      public fun method(method: String)

      public fun pathMatch(pathMatch: IResolvable)

      public fun pathMatch(pathMatch: PathMatchProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21de76d3671e887303a3cfb6606976297979e6ca33813a916c73c7ca9015475c")
      public fun pathMatch(pathMatch: PathMatchProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnRule.HttpMatchProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnRule.HttpMatchProperty.builder()

      override fun headerMatches(headerMatches: IResolvable) {
        cdkBuilder.headerMatches(headerMatches.let(IResolvable::unwrap))
      }

      override fun headerMatches(headerMatches: List<Any>) {
        cdkBuilder.headerMatches(headerMatches)
      }

      override fun headerMatches(vararg headerMatches: Any): Unit =
          headerMatches(headerMatches.toList())

      override fun method(method: String) {
        cdkBuilder.method(method)
      }

      override fun pathMatch(pathMatch: IResolvable) {
        cdkBuilder.pathMatch(pathMatch.let(IResolvable::unwrap))
      }

      override fun pathMatch(pathMatch: PathMatchProperty) {
        cdkBuilder.pathMatch(pathMatch.let(PathMatchProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21de76d3671e887303a3cfb6606976297979e6ca33813a916c73c7ca9015475c")
      override fun pathMatch(pathMatch: PathMatchProperty.Builder.() -> Unit): Unit =
          pathMatch(PathMatchProperty(pathMatch))

      public fun build(): software.amazon.awscdk.services.vpclattice.CfnRule.HttpMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.HttpMatchProperty,
    ) : CdkObject(cdkObject), HttpMatchProperty {
      override fun headerMatches(): Any? = unwrap(this).getHeaderMatches()

      override fun method(): String? = unwrap(this).getMethod()

      override fun pathMatch(): Any? = unwrap(this).getPathMatch()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.HttpMatchProperty):
          HttpMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpMatchProperty):
          software.amazon.awscdk.services.vpclattice.CfnRule.HttpMatchProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.vpclattice.CfnRule.HttpMatchProperty
    }
  }
}
