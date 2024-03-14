package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTaskTemplate internal constructor(
  private val cdkObject: software.amazon.awscdk.services.connect.CfnTaskTemplate,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun clientToken(): String? = unwrap(this).getClientToken()

  public open fun clientToken(`value`: String) {
    unwrap(this).setClientToken(`value`)
  }

  public open fun constraints(): Any? = unwrap(this).getConstraints()

  public open fun constraints(`value`: Any) {
    unwrap(this).setConstraints(`value`)
  }

  public open fun contactFlowArn(): String? = unwrap(this).getContactFlowArn()

  public open fun contactFlowArn(`value`: String) {
    unwrap(this).setContactFlowArn(`value`)
  }

  public open fun defaults(): Any? = unwrap(this).getDefaults()

  public open fun defaults(`value`: IResolvable) {
    unwrap(this).setDefaults(`value`.let(IResolvable::unwrap))
  }

  public open fun defaults(__idx_ac66f0: List<Any>) {
    unwrap(this).setDefaults(__idx_ac66f0)
  }

  public open fun defaults(vararg __idx_ac66f0: Any): Unit = defaults(__idx_ac66f0.toList())

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun fields(): Any? = unwrap(this).getFields()

  public open fun fields(`value`: IResolvable) {
    unwrap(this).setFields(`value`.let(IResolvable::unwrap))
  }

  public open fun fields(__idx_ac66f0: List<Any>) {
    unwrap(this).setFields(__idx_ac66f0)
  }

  public open fun fields(vararg __idx_ac66f0: Any): Unit = fields(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun status(): String? = unwrap(this).getStatus()

  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun clientToken(clientToken: String)

    public fun constraints(constraints: Any)

    public fun contactFlowArn(contactFlowArn: String)

    public fun defaults(defaults: IResolvable)

    public fun defaults(defaults: List<Any>)

    public fun defaults(vararg defaults: Any)

    public fun description(description: String)

    public fun fields(fields: IResolvable)

    public fun fields(fields: List<Any>)

    public fun fields(vararg fields: Any)

    public fun instanceArn(instanceArn: String)

    public fun name(name: String)

    public fun status(status: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnTaskTemplate.Builder =
        software.amazon.awscdk.services.connect.CfnTaskTemplate.Builder.create(scope, id)

    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    override fun constraints(constraints: Any) {
      cdkBuilder.constraints(constraints)
    }

    override fun contactFlowArn(contactFlowArn: String) {
      cdkBuilder.contactFlowArn(contactFlowArn)
    }

    override fun defaults(defaults: IResolvable) {
      cdkBuilder.defaults(defaults.let(IResolvable::unwrap))
    }

    override fun defaults(defaults: List<Any>) {
      cdkBuilder.defaults(defaults)
    }

    override fun defaults(vararg defaults: Any): Unit = defaults(defaults.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun fields(fields: IResolvable) {
      cdkBuilder.fields(fields.let(IResolvable::unwrap))
    }

    override fun fields(fields: List<Any>) {
      cdkBuilder.fields(fields)
    }

    override fun fields(vararg fields: Any): Unit = fields(fields.toList())

    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnTaskTemplate = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTaskTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTaskTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnTaskTemplate):
        CfnTaskTemplate = CfnTaskTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnTaskTemplate):
        software.amazon.awscdk.services.connect.CfnTaskTemplate = wrapped.cdkObject
  }

  public interface RequiredFieldInfoProperty {
    public fun id(): Any

    public interface Builder {
      public fun id(id: IResolvable)

      public fun id(id: FieldIdentifierProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8836cf4a1cef8abe32a187435262548eed16cd66a6b525ff3eae5b51c84deacf")
      public fun id(id: FieldIdentifierProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.RequiredFieldInfoProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnTaskTemplate.RequiredFieldInfoProperty.builder()

      override fun id(id: IResolvable) {
        cdkBuilder.id(id.let(IResolvable::unwrap))
      }

      override fun id(id: FieldIdentifierProperty) {
        cdkBuilder.id(id.let(FieldIdentifierProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8836cf4a1cef8abe32a187435262548eed16cd66a6b525ff3eae5b51c84deacf")
      override fun id(id: FieldIdentifierProperty.Builder.() -> Unit): Unit =
          id(FieldIdentifierProperty(id))

      public fun build():
          software.amazon.awscdk.services.connect.CfnTaskTemplate.RequiredFieldInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.RequiredFieldInfoProperty,
    ) : RequiredFieldInfoProperty {
      override fun id(): Any = unwrap(this).getId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RequiredFieldInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnTaskTemplate.RequiredFieldInfoProperty):
          RequiredFieldInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RequiredFieldInfoProperty):
          software.amazon.awscdk.services.connect.CfnTaskTemplate.RequiredFieldInfoProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConstraintsProperty {
    public fun invisibleFields(): Any? = unwrap(this).getInvisibleFields()

    public fun readOnlyFields(): Any? = unwrap(this).getReadOnlyFields()

    public fun requiredFields(): Any? = unwrap(this).getRequiredFields()

    public interface Builder {
      public fun invisibleFields(invisibleFields: IResolvable)

      public fun invisibleFields(invisibleFields: List<Any>)

      public fun invisibleFields(vararg invisibleFields: Any)

      public fun readOnlyFields(readOnlyFields: IResolvable)

      public fun readOnlyFields(readOnlyFields: List<Any>)

      public fun readOnlyFields(vararg readOnlyFields: Any)

      public fun requiredFields(requiredFields: IResolvable)

      public fun requiredFields(requiredFields: List<Any>)

      public fun requiredFields(vararg requiredFields: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.ConstraintsProperty.Builder =
          software.amazon.awscdk.services.connect.CfnTaskTemplate.ConstraintsProperty.builder()

      override fun invisibleFields(invisibleFields: IResolvable) {
        cdkBuilder.invisibleFields(invisibleFields.let(IResolvable::unwrap))
      }

      override fun invisibleFields(invisibleFields: List<Any>) {
        cdkBuilder.invisibleFields(invisibleFields)
      }

      override fun invisibleFields(vararg invisibleFields: Any): Unit =
          invisibleFields(invisibleFields.toList())

      override fun readOnlyFields(readOnlyFields: IResolvable) {
        cdkBuilder.readOnlyFields(readOnlyFields.let(IResolvable::unwrap))
      }

      override fun readOnlyFields(readOnlyFields: List<Any>) {
        cdkBuilder.readOnlyFields(readOnlyFields)
      }

      override fun readOnlyFields(vararg readOnlyFields: Any): Unit =
          readOnlyFields(readOnlyFields.toList())

      override fun requiredFields(requiredFields: IResolvable) {
        cdkBuilder.requiredFields(requiredFields.let(IResolvable::unwrap))
      }

      override fun requiredFields(requiredFields: List<Any>) {
        cdkBuilder.requiredFields(requiredFields)
      }

      override fun requiredFields(vararg requiredFields: Any): Unit =
          requiredFields(requiredFields.toList())

      public fun build():
          software.amazon.awscdk.services.connect.CfnTaskTemplate.ConstraintsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.ConstraintsProperty,
    ) : ConstraintsProperty {
      override fun invisibleFields(): Any? = unwrap(this).getInvisibleFields()

      override fun readOnlyFields(): Any? = unwrap(this).getReadOnlyFields()

      override fun requiredFields(): Any? = unwrap(this).getRequiredFields()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConstraintsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnTaskTemplate.ConstraintsProperty):
          ConstraintsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConstraintsProperty):
          software.amazon.awscdk.services.connect.CfnTaskTemplate.ConstraintsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ReadOnlyFieldInfoProperty {
    public fun id(): Any

    public interface Builder {
      public fun id(id: IResolvable)

      public fun id(id: FieldIdentifierProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("62689dfc63505ec8df9de67e713658e1b9f5019543d4f2c930a752c0e12feb1a")
      public fun id(id: FieldIdentifierProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.ReadOnlyFieldInfoProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnTaskTemplate.ReadOnlyFieldInfoProperty.builder()

      override fun id(id: IResolvable) {
        cdkBuilder.id(id.let(IResolvable::unwrap))
      }

      override fun id(id: FieldIdentifierProperty) {
        cdkBuilder.id(id.let(FieldIdentifierProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("62689dfc63505ec8df9de67e713658e1b9f5019543d4f2c930a752c0e12feb1a")
      override fun id(id: FieldIdentifierProperty.Builder.() -> Unit): Unit =
          id(FieldIdentifierProperty(id))

      public fun build():
          software.amazon.awscdk.services.connect.CfnTaskTemplate.ReadOnlyFieldInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.ReadOnlyFieldInfoProperty,
    ) : ReadOnlyFieldInfoProperty {
      override fun id(): Any = unwrap(this).getId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ReadOnlyFieldInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnTaskTemplate.ReadOnlyFieldInfoProperty):
          ReadOnlyFieldInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReadOnlyFieldInfoProperty):
          software.amazon.awscdk.services.connect.CfnTaskTemplate.ReadOnlyFieldInfoProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface InvisibleFieldInfoProperty {
    public fun id(): Any

    public interface Builder {
      public fun id(id: IResolvable)

      public fun id(id: FieldIdentifierProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("595a9185f3657f68dc84ba9a245b870ebf1d340eca4be71300cb705dffa39baf")
      public fun id(id: FieldIdentifierProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.InvisibleFieldInfoProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnTaskTemplate.InvisibleFieldInfoProperty.builder()

      override fun id(id: IResolvable) {
        cdkBuilder.id(id.let(IResolvable::unwrap))
      }

      override fun id(id: FieldIdentifierProperty) {
        cdkBuilder.id(id.let(FieldIdentifierProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("595a9185f3657f68dc84ba9a245b870ebf1d340eca4be71300cb705dffa39baf")
      override fun id(id: FieldIdentifierProperty.Builder.() -> Unit): Unit =
          id(FieldIdentifierProperty(id))

      public fun build():
          software.amazon.awscdk.services.connect.CfnTaskTemplate.InvisibleFieldInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.InvisibleFieldInfoProperty,
    ) : InvisibleFieldInfoProperty {
      override fun id(): Any = unwrap(this).getId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InvisibleFieldInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnTaskTemplate.InvisibleFieldInfoProperty):
          InvisibleFieldInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InvisibleFieldInfoProperty):
          software.amazon.awscdk.services.connect.CfnTaskTemplate.InvisibleFieldInfoProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DefaultFieldValueProperty {
    public fun defaultValue(): String

    public fun id(): Any

    public interface Builder {
      public fun defaultValue(defaultValue: String)

      public fun id(id: IResolvable)

      public fun id(id: FieldIdentifierProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a641d5821b49176a7de21161e83fed0f337327041ba007397f80149101d69a4")
      public fun id(id: FieldIdentifierProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.DefaultFieldValueProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnTaskTemplate.DefaultFieldValueProperty.builder()

      override fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
      }

      override fun id(id: IResolvable) {
        cdkBuilder.id(id.let(IResolvable::unwrap))
      }

      override fun id(id: FieldIdentifierProperty) {
        cdkBuilder.id(id.let(FieldIdentifierProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a641d5821b49176a7de21161e83fed0f337327041ba007397f80149101d69a4")
      override fun id(id: FieldIdentifierProperty.Builder.() -> Unit): Unit =
          id(FieldIdentifierProperty(id))

      public fun build():
          software.amazon.awscdk.services.connect.CfnTaskTemplate.DefaultFieldValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.DefaultFieldValueProperty,
    ) : DefaultFieldValueProperty {
      override fun defaultValue(): String = unwrap(this).getDefaultValue()

      override fun id(): Any = unwrap(this).getId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DefaultFieldValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnTaskTemplate.DefaultFieldValueProperty):
          DefaultFieldValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultFieldValueProperty):
          software.amazon.awscdk.services.connect.CfnTaskTemplate.DefaultFieldValueProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FieldIdentifierProperty {
    public fun name(): String

    public interface Builder {
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldIdentifierProperty.Builder =
          software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldIdentifierProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldIdentifierProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldIdentifierProperty,
    ) : FieldIdentifierProperty {
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FieldIdentifierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldIdentifierProperty):
          FieldIdentifierProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldIdentifierProperty):
          software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldIdentifierProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface FieldProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun id(): Any

    public fun singleSelectOptions(): List<String> = unwrap(this).getSingleSelectOptions() ?:
        emptyList()

    public fun type(): String

    public interface Builder {
      public fun description(description: String)

      public fun id(id: IResolvable)

      public fun id(id: FieldIdentifierProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e8abd2ef8cb7d810f8ff05bbbc72275cbd60f0a6e284373767670f54b8b76e42")
      public fun id(id: FieldIdentifierProperty.Builder.() -> Unit)

      public fun singleSelectOptions(singleSelectOptions: List<String>)

      public fun singleSelectOptions(vararg singleSelectOptions: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldProperty.Builder =
          software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldProperty.builder()

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun id(id: IResolvable) {
        cdkBuilder.id(id.let(IResolvable::unwrap))
      }

      override fun id(id: FieldIdentifierProperty) {
        cdkBuilder.id(id.let(FieldIdentifierProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e8abd2ef8cb7d810f8ff05bbbc72275cbd60f0a6e284373767670f54b8b76e42")
      override fun id(id: FieldIdentifierProperty.Builder.() -> Unit): Unit =
          id(FieldIdentifierProperty(id))

      override fun singleSelectOptions(singleSelectOptions: List<String>) {
        cdkBuilder.singleSelectOptions(singleSelectOptions)
      }

      override fun singleSelectOptions(vararg singleSelectOptions: String): Unit =
          singleSelectOptions(singleSelectOptions.toList())

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldProperty,
    ) : FieldProperty {
      override fun description(): String? = unwrap(this).getDescription()

      override fun id(): Any = unwrap(this).getId()

      override fun singleSelectOptions(): List<String> = unwrap(this).getSingleSelectOptions() ?:
          emptyList()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FieldProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldProperty):
          FieldProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldProperty):
          software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
