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

  public interface Builder {
    public fun clientToken(clientToken: String) {
    }

    public fun constraints(constraints: Any) {
    }

    public fun contactFlowArn(contactFlowArn: String) {
    }

    public fun defaults(defaults: IResolvable) {
    }

    public fun defaults(defaults: List<Any>) {
    }

    public fun description(description: String) {
    }

    public fun fields(fields: IResolvable) {
    }

    public fun fields(fields: List<Any>) {
    }

    public fun instanceArn(instanceArn: String) {
    }

    public fun name(name: String) {
    }

    public fun status(status: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnTaskTemplate.Builder =
        software.amazon.awscdk.services.connect.CfnTaskTemplate.Builder.create(scope, id)

    public override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    public override fun constraints(constraints: Any) {
      cdkBuilder.constraints(constraints)
    }

    public override fun contactFlowArn(contactFlowArn: String) {
      cdkBuilder.contactFlowArn(contactFlowArn)
    }

    public override fun defaults(defaults: IResolvable) {
      cdkBuilder.defaults(defaults.let(IResolvable::unwrap))
    }

    public override fun defaults(defaults: List<Any>) {
      cdkBuilder.defaults(defaults)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun fields(fields: IResolvable) {
      cdkBuilder.fields(fields.let(IResolvable::unwrap))
    }

    public override fun fields(fields: List<Any>) {
      cdkBuilder.fields(fields)
    }

    public override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

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
      public fun id(id: IResolvable) {
      }

      public fun id(id: FieldIdentifierProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8836cf4a1cef8abe32a187435262548eed16cd66a6b525ff3eae5b51c84deacf")
      public fun id(id: FieldIdentifierProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.RequiredFieldInfoProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnTaskTemplate.RequiredFieldInfoProperty.builder()

      public override fun id(id: IResolvable) {
        cdkBuilder.id(id.let(IResolvable::unwrap))
      }

      public override fun id(id: FieldIdentifierProperty) {
        cdkBuilder.id(id.let(FieldIdentifierProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8836cf4a1cef8abe32a187435262548eed16cd66a6b525ff3eae5b51c84deacf")
      public override fun id(id: FieldIdentifierProperty.Builder.() -> Unit): Unit =
          id(FieldIdentifierProperty(id))

      public fun build():
          software.amazon.awscdk.services.connect.CfnTaskTemplate.RequiredFieldInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.RequiredFieldInfoProperty,
    ) : RequiredFieldInfoProperty {
      public override fun id(): Any = unwrap(this).getId()
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
      public fun invisibleFields(invisibleFields: IResolvable) {
      }

      public fun invisibleFields(invisibleFields: List<Any>) {
      }

      public fun readOnlyFields(readOnlyFields: IResolvable) {
      }

      public fun readOnlyFields(readOnlyFields: List<Any>) {
      }

      public fun requiredFields(requiredFields: IResolvable) {
      }

      public fun requiredFields(requiredFields: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.ConstraintsProperty.Builder =
          software.amazon.awscdk.services.connect.CfnTaskTemplate.ConstraintsProperty.builder()

      public override fun invisibleFields(invisibleFields: IResolvable) {
        cdkBuilder.invisibleFields(invisibleFields.let(IResolvable::unwrap))
      }

      public override fun invisibleFields(invisibleFields: List<Any>) {
        cdkBuilder.invisibleFields(invisibleFields)
      }

      public override fun readOnlyFields(readOnlyFields: IResolvable) {
        cdkBuilder.readOnlyFields(readOnlyFields.let(IResolvable::unwrap))
      }

      public override fun readOnlyFields(readOnlyFields: List<Any>) {
        cdkBuilder.readOnlyFields(readOnlyFields)
      }

      public override fun requiredFields(requiredFields: IResolvable) {
        cdkBuilder.requiredFields(requiredFields.let(IResolvable::unwrap))
      }

      public override fun requiredFields(requiredFields: List<Any>) {
        cdkBuilder.requiredFields(requiredFields)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnTaskTemplate.ConstraintsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.ConstraintsProperty,
    ) : ConstraintsProperty {
      public override fun invisibleFields(): Any? = unwrap(this).getInvisibleFields()

      public override fun readOnlyFields(): Any? = unwrap(this).getReadOnlyFields()

      public override fun requiredFields(): Any? = unwrap(this).getRequiredFields()
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
      public fun id(id: IResolvable) {
      }

      public fun id(id: FieldIdentifierProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("62689dfc63505ec8df9de67e713658e1b9f5019543d4f2c930a752c0e12feb1a")
      public fun id(id: FieldIdentifierProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.ReadOnlyFieldInfoProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnTaskTemplate.ReadOnlyFieldInfoProperty.builder()

      public override fun id(id: IResolvable) {
        cdkBuilder.id(id.let(IResolvable::unwrap))
      }

      public override fun id(id: FieldIdentifierProperty) {
        cdkBuilder.id(id.let(FieldIdentifierProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("62689dfc63505ec8df9de67e713658e1b9f5019543d4f2c930a752c0e12feb1a")
      public override fun id(id: FieldIdentifierProperty.Builder.() -> Unit): Unit =
          id(FieldIdentifierProperty(id))

      public fun build():
          software.amazon.awscdk.services.connect.CfnTaskTemplate.ReadOnlyFieldInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.ReadOnlyFieldInfoProperty,
    ) : ReadOnlyFieldInfoProperty {
      public override fun id(): Any = unwrap(this).getId()
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
      public fun id(id: IResolvable) {
      }

      public fun id(id: FieldIdentifierProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("595a9185f3657f68dc84ba9a245b870ebf1d340eca4be71300cb705dffa39baf")
      public fun id(id: FieldIdentifierProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.InvisibleFieldInfoProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnTaskTemplate.InvisibleFieldInfoProperty.builder()

      public override fun id(id: IResolvable) {
        cdkBuilder.id(id.let(IResolvable::unwrap))
      }

      public override fun id(id: FieldIdentifierProperty) {
        cdkBuilder.id(id.let(FieldIdentifierProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("595a9185f3657f68dc84ba9a245b870ebf1d340eca4be71300cb705dffa39baf")
      public override fun id(id: FieldIdentifierProperty.Builder.() -> Unit): Unit =
          id(FieldIdentifierProperty(id))

      public fun build():
          software.amazon.awscdk.services.connect.CfnTaskTemplate.InvisibleFieldInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.InvisibleFieldInfoProperty,
    ) : InvisibleFieldInfoProperty {
      public override fun id(): Any = unwrap(this).getId()
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
      public fun defaultValue(defaultValue: String) {
      }

      public fun id(id: IResolvable) {
      }

      public fun id(id: FieldIdentifierProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a641d5821b49176a7de21161e83fed0f337327041ba007397f80149101d69a4")
      public fun id(id: FieldIdentifierProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.DefaultFieldValueProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnTaskTemplate.DefaultFieldValueProperty.builder()

      public override fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
      }

      public override fun id(id: IResolvable) {
        cdkBuilder.id(id.let(IResolvable::unwrap))
      }

      public override fun id(id: FieldIdentifierProperty) {
        cdkBuilder.id(id.let(FieldIdentifierProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a641d5821b49176a7de21161e83fed0f337327041ba007397f80149101d69a4")
      public override fun id(id: FieldIdentifierProperty.Builder.() -> Unit): Unit =
          id(FieldIdentifierProperty(id))

      public fun build():
          software.amazon.awscdk.services.connect.CfnTaskTemplate.DefaultFieldValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.DefaultFieldValueProperty,
    ) : DefaultFieldValueProperty {
      public override fun defaultValue(): String = unwrap(this).getDefaultValue()

      public override fun id(): Any = unwrap(this).getId()
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
      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldIdentifierProperty.Builder =
          software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldIdentifierProperty.builder()

      public override fun name(name: String) {
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
      public override fun name(): String = unwrap(this).getName()
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
      public fun description(description: String) {
      }

      public fun id(id: IResolvable) {
      }

      public fun id(id: FieldIdentifierProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e8abd2ef8cb7d810f8ff05bbbc72275cbd60f0a6e284373767670f54b8b76e42")
      public fun id(id: FieldIdentifierProperty.Builder.() -> Unit) {
      }

      public fun singleSelectOptions(singleSelectOptions: List<String>) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldProperty.Builder =
          software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldProperty.builder()

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun id(id: IResolvable) {
        cdkBuilder.id(id.let(IResolvable::unwrap))
      }

      public override fun id(id: FieldIdentifierProperty) {
        cdkBuilder.id(id.let(FieldIdentifierProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e8abd2ef8cb7d810f8ff05bbbc72275cbd60f0a6e284373767670f54b8b76e42")
      public override fun id(id: FieldIdentifierProperty.Builder.() -> Unit): Unit =
          id(FieldIdentifierProperty(id))

      public override fun singleSelectOptions(singleSelectOptions: List<String>) {
        cdkBuilder.singleSelectOptions(singleSelectOptions)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldProperty,
    ) : FieldProperty {
      public override fun description(): String? = unwrap(this).getDescription()

      public override fun id(): Any = unwrap(this).getId()

      public override fun singleSelectOptions(): List<String> =
          unwrap(this).getSingleSelectOptions() ?: emptyList()

      public override fun type(): String = unwrap(this).getType()
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
