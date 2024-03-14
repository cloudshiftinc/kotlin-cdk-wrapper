package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnListener internal constructor(
  private val cdkObject: software.amazon.awscdk.services.vpclattice.CfnListener,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrServiceArn(): String = unwrap(this).getAttrServiceArn()

  public open fun attrServiceId(): String = unwrap(this).getAttrServiceId()

  public open fun defaultAction(): Any = unwrap(this).getDefaultAction()

  public open fun defaultAction(`value`: IResolvable) {
    unwrap(this).setDefaultAction(`value`.let(IResolvable::unwrap))
  }

  public open fun defaultAction(`value`: DefaultActionProperty) {
    unwrap(this).setDefaultAction(`value`.let(DefaultActionProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1a0b9668628189a18f890d700f21508215ee5fb0d35467774673da807dd8f584")
  public open fun defaultAction(`value`: DefaultActionProperty.Builder.() -> Unit): Unit =
      defaultAction(DefaultActionProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun port(): Number? = unwrap(this).getPort()

  public open fun port(`value`: Number) {
    unwrap(this).setPort(`value`)
  }

  public open fun protocol(): String = unwrap(this).getProtocol()

  public open fun protocol(`value`: String) {
    unwrap(this).setProtocol(`value`)
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

  public interface Builder {
    public fun defaultAction(defaultAction: IResolvable)

    public fun defaultAction(defaultAction: DefaultActionProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33f9974638aaca0476dbf3be4f753ed548ae2ee3c024ba639f27f21ab1aadac1")
    public fun defaultAction(defaultAction: DefaultActionProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun port(port: Number)

    public fun protocol(protocol: String)

    public fun serviceIdentifier(serviceIdentifier: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.vpclattice.CfnListener.Builder =
        software.amazon.awscdk.services.vpclattice.CfnListener.Builder.create(scope, id)

    override fun defaultAction(defaultAction: IResolvable) {
      cdkBuilder.defaultAction(defaultAction.let(IResolvable::unwrap))
    }

    override fun defaultAction(defaultAction: DefaultActionProperty) {
      cdkBuilder.defaultAction(defaultAction.let(DefaultActionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33f9974638aaca0476dbf3be4f753ed548ae2ee3c024ba639f27f21ab1aadac1")
    override fun defaultAction(defaultAction: DefaultActionProperty.Builder.() -> Unit): Unit =
        defaultAction(DefaultActionProperty(defaultAction))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    override fun serviceIdentifier(serviceIdentifier: String) {
      cdkBuilder.serviceIdentifier(serviceIdentifier)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnListener = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnListener {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnListener(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnListener):
        CfnListener = CfnListener(cdkObject)

    internal fun unwrap(wrapped: CfnListener):
        software.amazon.awscdk.services.vpclattice.CfnListener = wrapped.cdkObject
  }

  public interface WeightedTargetGroupProperty {
    public fun targetGroupIdentifier(): String

    public fun weight(): Number? = unwrap(this).getWeight()

    public interface Builder {
      public fun targetGroupIdentifier(targetGroupIdentifier: String)

      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnListener.WeightedTargetGroupProperty.Builder
          =
          software.amazon.awscdk.services.vpclattice.CfnListener.WeightedTargetGroupProperty.builder()

      override fun targetGroupIdentifier(targetGroupIdentifier: String) {
        cdkBuilder.targetGroupIdentifier(targetGroupIdentifier)
      }

      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.vpclattice.CfnListener.WeightedTargetGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.vpclattice.CfnListener.WeightedTargetGroupProperty,
    ) : WeightedTargetGroupProperty {
      override fun targetGroupIdentifier(): String = unwrap(this).getTargetGroupIdentifier()

      override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): WeightedTargetGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnListener.WeightedTargetGroupProperty):
          WeightedTargetGroupProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WeightedTargetGroupProperty):
          software.amazon.awscdk.services.vpclattice.CfnListener.WeightedTargetGroupProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FixedResponseProperty {
    public fun statusCode(): Number

    public interface Builder {
      public fun statusCode(statusCode: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnListener.FixedResponseProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnListener.FixedResponseProperty.builder()

      override fun statusCode(statusCode: Number) {
        cdkBuilder.statusCode(statusCode)
      }

      public fun build():
          software.amazon.awscdk.services.vpclattice.CfnListener.FixedResponseProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.vpclattice.CfnListener.FixedResponseProperty,
    ) : FixedResponseProperty {
      override fun statusCode(): Number = unwrap(this).getStatusCode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FixedResponseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnListener.FixedResponseProperty):
          FixedResponseProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FixedResponseProperty):
          software.amazon.awscdk.services.vpclattice.CfnListener.FixedResponseProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ForwardProperty {
    public fun targetGroups(): Any

    public interface Builder {
      public fun targetGroups(targetGroups: IResolvable)

      public fun targetGroups(targetGroups: List<Any>)

      public fun targetGroups(vararg targetGroups: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnListener.ForwardProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnListener.ForwardProperty.builder()

      override fun targetGroups(targetGroups: IResolvable) {
        cdkBuilder.targetGroups(targetGroups.let(IResolvable::unwrap))
      }

      override fun targetGroups(targetGroups: List<Any>) {
        cdkBuilder.targetGroups(targetGroups)
      }

      override fun targetGroups(vararg targetGroups: Any): Unit =
          targetGroups(targetGroups.toList())

      public fun build(): software.amazon.awscdk.services.vpclattice.CfnListener.ForwardProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.vpclattice.CfnListener.ForwardProperty,
    ) : ForwardProperty {
      override fun targetGroups(): Any = unwrap(this).getTargetGroups()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ForwardProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnListener.ForwardProperty):
          ForwardProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ForwardProperty):
          software.amazon.awscdk.services.vpclattice.CfnListener.ForwardProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DefaultActionProperty {
    public fun fixedResponse(): Any? = unwrap(this).getFixedResponse()

    public fun forward(): Any? = unwrap(this).getForward()

    public interface Builder {
      public fun fixedResponse(fixedResponse: IResolvable)

      public fun fixedResponse(fixedResponse: FixedResponseProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4a3c9d278551eceb1d3b5e6deea7e01050cea016d10c69bda85c5b446a47bfd4")
      public fun fixedResponse(fixedResponse: FixedResponseProperty.Builder.() -> Unit)

      public fun forward(forward: IResolvable)

      public fun forward(forward: ForwardProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("692ec0d7935e4ac6fa2636c9d8edd0862e863336a5c647f4cdd8e16c4866fa47")
      public fun forward(forward: ForwardProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnListener.DefaultActionProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnListener.DefaultActionProperty.builder()

      override fun fixedResponse(fixedResponse: IResolvable) {
        cdkBuilder.fixedResponse(fixedResponse.let(IResolvable::unwrap))
      }

      override fun fixedResponse(fixedResponse: FixedResponseProperty) {
        cdkBuilder.fixedResponse(fixedResponse.let(FixedResponseProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4a3c9d278551eceb1d3b5e6deea7e01050cea016d10c69bda85c5b446a47bfd4")
      override fun fixedResponse(fixedResponse: FixedResponseProperty.Builder.() -> Unit): Unit =
          fixedResponse(FixedResponseProperty(fixedResponse))

      override fun forward(forward: IResolvable) {
        cdkBuilder.forward(forward.let(IResolvable::unwrap))
      }

      override fun forward(forward: ForwardProperty) {
        cdkBuilder.forward(forward.let(ForwardProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("692ec0d7935e4ac6fa2636c9d8edd0862e863336a5c647f4cdd8e16c4866fa47")
      override fun forward(forward: ForwardProperty.Builder.() -> Unit): Unit =
          forward(ForwardProperty(forward))

      public fun build():
          software.amazon.awscdk.services.vpclattice.CfnListener.DefaultActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.vpclattice.CfnListener.DefaultActionProperty,
    ) : DefaultActionProperty {
      override fun fixedResponse(): Any? = unwrap(this).getFixedResponse()

      override fun forward(): Any? = unwrap(this).getForward()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DefaultActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnListener.DefaultActionProperty):
          DefaultActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultActionProperty):
          software.amazon.awscdk.services.vpclattice.CfnListener.DefaultActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
