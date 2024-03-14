package io.cloudshiftdev.awscdk.services.amplifyuibuilder

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnComponent internal constructor(
  private val cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun appId(): String? = unwrap(this).getAppId()

  public open fun appId(`value`: String) {
    unwrap(this).setAppId(`value`)
  }

  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrModifiedAt(): String = unwrap(this).getAttrModifiedAt()

  public open fun bindingProperties(): Any? = unwrap(this).getBindingProperties()

  public open fun bindingProperties(`value`: IResolvable) {
    unwrap(this).setBindingProperties(`value`.let(IResolvable::unwrap))
  }

  public open fun bindingProperties(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setBindingProperties(__item_ac66f0)
  }

  public open fun children(): Any? = unwrap(this).getChildren()

  public open fun children(`value`: IResolvable) {
    unwrap(this).setChildren(`value`.let(IResolvable::unwrap))
  }

  public open fun children(__idx_ac66f0: List<Any>) {
    unwrap(this).setChildren(__idx_ac66f0)
  }

  public open fun collectionProperties(): Any? = unwrap(this).getCollectionProperties()

  public open fun collectionProperties(`value`: IResolvable) {
    unwrap(this).setCollectionProperties(`value`.let(IResolvable::unwrap))
  }

  public open fun collectionProperties(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setCollectionProperties(__item_ac66f0)
  }

  public open fun componentType(): String? = unwrap(this).getComponentType()

  public open fun componentType(`value`: String) {
    unwrap(this).setComponentType(`value`)
  }

  public open fun environmentName(): String? = unwrap(this).getEnvironmentName()

  public open fun environmentName(`value`: String) {
    unwrap(this).setEnvironmentName(`value`)
  }

  public open fun events(): Any? = unwrap(this).getEvents()

  public open fun events(`value`: IResolvable) {
    unwrap(this).setEvents(`value`.let(IResolvable::unwrap))
  }

  public open fun events(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setEvents(__item_ac66f0)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun overrides(): Any? = unwrap(this).getOverrides()

  public open fun overrides(`value`: Any) {
    unwrap(this).setOverrides(`value`)
  }

  public open fun properties(): Any? = unwrap(this).getProperties()

  public open fun properties(`value`: IResolvable) {
    unwrap(this).setProperties(`value`.let(IResolvable::unwrap))
  }

  public open fun properties(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setProperties(__item_ac66f0)
  }

  public open fun schemaVersion(): String? = unwrap(this).getSchemaVersion()

  public open fun schemaVersion(`value`: String) {
    unwrap(this).setSchemaVersion(`value`)
  }

  public open fun sourceId(): String? = unwrap(this).getSourceId()

  public open fun sourceId(`value`: String) {
    unwrap(this).setSourceId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun variants(): Any? = unwrap(this).getVariants()

  public open fun variants(`value`: IResolvable) {
    unwrap(this).setVariants(`value`.let(IResolvable::unwrap))
  }

  public open fun variants(__idx_ac66f0: List<Any>) {
    unwrap(this).setVariants(__idx_ac66f0)
  }

  public interface Builder {
    public fun appId(appId: String)

    public fun bindingProperties(bindingProperties: IResolvable)

    public fun bindingProperties(bindingProperties: Map<String, Any>)

    public fun children(children: IResolvable)

    public fun children(children: List<Any>)

    public fun collectionProperties(collectionProperties: IResolvable)

    public fun collectionProperties(collectionProperties: Map<String, Any>)

    public fun componentType(componentType: String)

    public fun environmentName(environmentName: String)

    public fun events(events: IResolvable)

    public fun events(events: Map<String, Any>)

    public fun name(name: String)

    public fun overrides(overrides: Any)

    public fun properties(properties: IResolvable)

    public fun properties(properties: Map<String, Any>)

    public fun schemaVersion(schemaVersion: String)

    public fun sourceId(sourceId: String)

    public fun tags(tags: Map<String, String>)

    public fun variants(variants: IResolvable)

    public fun variants(variants: List<Any>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.Builder =
        software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.Builder.create(scope, id)

    override fun appId(appId: String) {
      cdkBuilder.appId(appId)
    }

    override fun bindingProperties(bindingProperties: IResolvable) {
      cdkBuilder.bindingProperties(bindingProperties.let(IResolvable::unwrap))
    }

    override fun bindingProperties(bindingProperties: Map<String, Any>) {
      cdkBuilder.bindingProperties(bindingProperties)
    }

    override fun children(children: IResolvable) {
      cdkBuilder.children(children.let(IResolvable::unwrap))
    }

    override fun children(children: List<Any>) {
      cdkBuilder.children(children)
    }

    override fun collectionProperties(collectionProperties: IResolvable) {
      cdkBuilder.collectionProperties(collectionProperties.let(IResolvable::unwrap))
    }

    override fun collectionProperties(collectionProperties: Map<String, Any>) {
      cdkBuilder.collectionProperties(collectionProperties)
    }

    override fun componentType(componentType: String) {
      cdkBuilder.componentType(componentType)
    }

    override fun environmentName(environmentName: String) {
      cdkBuilder.environmentName(environmentName)
    }

    override fun events(events: IResolvable) {
      cdkBuilder.events(events.let(IResolvable::unwrap))
    }

    override fun events(events: Map<String, Any>) {
      cdkBuilder.events(events)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun overrides(overrides: Any) {
      cdkBuilder.overrides(overrides)
    }

    override fun properties(properties: IResolvable) {
      cdkBuilder.properties(properties.let(IResolvable::unwrap))
    }

    override fun properties(properties: Map<String, Any>) {
      cdkBuilder.properties(properties)
    }

    override fun schemaVersion(schemaVersion: String) {
      cdkBuilder.schemaVersion(schemaVersion)
    }

    override fun sourceId(sourceId: String) {
      cdkBuilder.sourceId(sourceId)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun variants(variants: IResolvable) {
      cdkBuilder.variants(variants.let(IResolvable::unwrap))
    }

    override fun variants(variants: List<Any>) {
      cdkBuilder.variants(variants)
    }

    public fun build(): software.amazon.awscdk.services.amplifyuibuilder.CfnComponent =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnComponent {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnComponent(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent):
        CfnComponent = CfnComponent(cdkObject)

    internal fun unwrap(wrapped: CfnComponent):
        software.amazon.awscdk.services.amplifyuibuilder.CfnComponent = wrapped.cdkObject
  }

  public interface MutationActionSetStateParameterProperty {
    public fun componentName(): String

    public fun `property`(): String

    public fun `set`(): Any

    public interface Builder {
      public fun componentName(componentName: String)

      public fun `property`(`property`: String)

      public fun `set`(`set`: IResolvable)

      public fun `set`(`set`: ComponentPropertyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("268e7dd1367b58ce4520bdb52a483dcab7206d642fd774d0fe24797972f81210")
      public fun `set`(`set`: ComponentPropertyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.MutationActionSetStateParameterProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.MutationActionSetStateParameterProperty.builder()

      override fun componentName(componentName: String) {
        cdkBuilder.componentName(componentName)
      }

      override fun `property`(`property`: String) {
        cdkBuilder.`property`(`property`)
      }

      override fun `set`(`set`: IResolvable) {
        cdkBuilder.`set`(`set`.let(IResolvable::unwrap))
      }

      override fun `set`(`set`: ComponentPropertyProperty) {
        cdkBuilder.`set`(`set`.let(ComponentPropertyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("268e7dd1367b58ce4520bdb52a483dcab7206d642fd774d0fe24797972f81210")
      override fun `set`(`set`: ComponentPropertyProperty.Builder.() -> Unit): Unit =
          `set`(ComponentPropertyProperty(`set`))

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.MutationActionSetStateParameterProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.MutationActionSetStateParameterProperty,
    ) : MutationActionSetStateParameterProperty {
      override fun componentName(): String = unwrap(this).getComponentName()

      override fun `property`(): String = unwrap(this).getProperty()

      override fun `set`(): Any = unwrap(this).getSet()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MutationActionSetStateParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.MutationActionSetStateParameterProperty):
          MutationActionSetStateParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MutationActionSetStateParameterProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.MutationActionSetStateParameterProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ComponentChildProperty {
    public fun children(): Any? = unwrap(this).getChildren()

    public fun componentType(): String

    public fun events(): Any? = unwrap(this).getEvents()

    public fun name(): String

    public fun properties(): Any

    public fun sourceId(): String? = unwrap(this).getSourceId()

    public interface Builder {
      public fun children(children: IResolvable)

      public fun children(children: List<Any>)

      public fun componentType(componentType: String)

      public fun events(events: IResolvable)

      public fun events(events: Map<String, Any>)

      public fun name(name: String)

      public fun properties(properties: IResolvable)

      public fun properties(properties: Map<String, Any>)

      public fun sourceId(sourceId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentChildProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentChildProperty.builder()

      override fun children(children: IResolvable) {
        cdkBuilder.children(children.let(IResolvable::unwrap))
      }

      override fun children(children: List<Any>) {
        cdkBuilder.children(children)
      }

      override fun componentType(componentType: String) {
        cdkBuilder.componentType(componentType)
      }

      override fun events(events: IResolvable) {
        cdkBuilder.events(events.let(IResolvable::unwrap))
      }

      override fun events(events: Map<String, Any>) {
        cdkBuilder.events(events)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties.let(IResolvable::unwrap))
      }

      override fun properties(properties: Map<String, Any>) {
        cdkBuilder.properties(properties)
      }

      override fun sourceId(sourceId: String) {
        cdkBuilder.sourceId(sourceId)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentChildProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentChildProperty,
    ) : ComponentChildProperty {
      override fun children(): Any? = unwrap(this).getChildren()

      override fun componentType(): String = unwrap(this).getComponentType()

      override fun events(): Any? = unwrap(this).getEvents()

      override fun name(): String = unwrap(this).getName()

      override fun properties(): Any = unwrap(this).getProperties()

      override fun sourceId(): String? = unwrap(this).getSourceId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ComponentChildProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentChildProperty):
          ComponentChildProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentChildProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentChildProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FormBindingElementProperty {
    public fun element(): String

    public fun `property`(): String

    public interface Builder {
      public fun element(element: String)

      public fun `property`(`property`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.FormBindingElementProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.FormBindingElementProperty.builder()

      override fun element(element: String) {
        cdkBuilder.element(element)
      }

      override fun `property`(`property`: String) {
        cdkBuilder.`property`(`property`)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.FormBindingElementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.FormBindingElementProperty,
    ) : FormBindingElementProperty {
      override fun element(): String = unwrap(this).getElement()

      override fun `property`(): String = unwrap(this).getProperty()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FormBindingElementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.FormBindingElementProperty):
          FormBindingElementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FormBindingElementProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.FormBindingElementProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ComponentEventProperty {
    public fun action(): String? = unwrap(this).getAction()

    public fun bindingEvent(): String? = unwrap(this).getBindingEvent()

    public fun parameters(): Any? = unwrap(this).getParameters()

    public interface Builder {
      public fun action(action: String)

      public fun bindingEvent(bindingEvent: String)

      public fun parameters(parameters: IResolvable)

      public fun parameters(parameters: ActionParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e2830b6054ec32069ea63b002e6341cc356b212c778069b2b216fb49e696dd57")
      public fun parameters(parameters: ActionParametersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentEventProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentEventProperty.builder()

      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      override fun bindingEvent(bindingEvent: String) {
        cdkBuilder.bindingEvent(bindingEvent)
      }

      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      override fun parameters(parameters: ActionParametersProperty) {
        cdkBuilder.parameters(parameters.let(ActionParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e2830b6054ec32069ea63b002e6341cc356b212c778069b2b216fb49e696dd57")
      override fun parameters(parameters: ActionParametersProperty.Builder.() -> Unit): Unit =
          parameters(ActionParametersProperty(parameters))

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentEventProperty,
    ) : ComponentEventProperty {
      override fun action(): String? = unwrap(this).getAction()

      override fun bindingEvent(): String? = unwrap(this).getBindingEvent()

      override fun parameters(): Any? = unwrap(this).getParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ComponentEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentEventProperty):
          ComponentEventProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentEventProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentEventProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ComponentPropertyProperty {
    public fun bindingProperties(): Any? = unwrap(this).getBindingProperties()

    public fun bindings(): Any? = unwrap(this).getBindings()

    public fun collectionBindingProperties(): Any? = unwrap(this).getCollectionBindingProperties()

    public fun componentName(): String? = unwrap(this).getComponentName()

    public fun concat(): Any? = unwrap(this).getConcat()

    public fun condition(): Any? = unwrap(this).getCondition()

    public fun configured(): Any? = unwrap(this).getConfigured()

    public fun defaultValue(): String? = unwrap(this).getDefaultValue()

    public fun event(): String? = unwrap(this).getEvent()

    public fun importedValue(): String? = unwrap(this).getImportedValue()

    public fun model(): String? = unwrap(this).getModel()

    public fun `property`(): String? = unwrap(this).getProperty()

    public fun type(): String? = unwrap(this).getType()

    public fun userAttribute(): String? = unwrap(this).getUserAttribute()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun bindingProperties(bindingProperties: IResolvable)

      public fun bindingProperties(bindingProperties: ComponentPropertyBindingPropertiesProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2dcd3db6920bfaa007a0b3fb1ff2b36cc7f8fd52acfeed84578d23db202caa90")
      public
          fun bindingProperties(bindingProperties: ComponentPropertyBindingPropertiesProperty.Builder.() -> Unit)

      public fun bindings(bindings: IResolvable)

      public fun bindings(bindings: Map<String, Any>)

      public fun collectionBindingProperties(collectionBindingProperties: IResolvable)

      public
          fun collectionBindingProperties(collectionBindingProperties: ComponentPropertyBindingPropertiesProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1fddd1f0dd5ea438a032b6b81a2bfb7edadb0fcd314202ebffb5e3d9b377c62")
      public
          fun collectionBindingProperties(collectionBindingProperties: ComponentPropertyBindingPropertiesProperty.Builder.() -> Unit)

      public fun componentName(componentName: String)

      public fun concat(concat: IResolvable)

      public fun concat(concat: List<Any>)

      public fun condition(condition: IResolvable)

      public fun condition(condition: ComponentConditionPropertyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e62b20dc5d4889db9e220ec40a5ff6226b3ee7051309bf21dcff586c5556c04")
      public fun condition(condition: ComponentConditionPropertyProperty.Builder.() -> Unit)

      public fun configured(configured: Boolean)

      public fun configured(configured: IResolvable)

      public fun defaultValue(defaultValue: String)

      public fun event(event: String)

      public fun importedValue(importedValue: String)

      public fun model(model: String)

      public fun `property`(`property`: String)

      public fun type(type: String)

      public fun userAttribute(userAttribute: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentPropertyProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentPropertyProperty.builder()

      override fun bindingProperties(bindingProperties: IResolvable) {
        cdkBuilder.bindingProperties(bindingProperties.let(IResolvable::unwrap))
      }

      override
          fun bindingProperties(bindingProperties: ComponentPropertyBindingPropertiesProperty) {
        cdkBuilder.bindingProperties(bindingProperties.let(ComponentPropertyBindingPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2dcd3db6920bfaa007a0b3fb1ff2b36cc7f8fd52acfeed84578d23db202caa90")
      override
          fun bindingProperties(bindingProperties: ComponentPropertyBindingPropertiesProperty.Builder.() -> Unit):
          Unit = bindingProperties(ComponentPropertyBindingPropertiesProperty(bindingProperties))

      override fun bindings(bindings: IResolvable) {
        cdkBuilder.bindings(bindings.let(IResolvable::unwrap))
      }

      override fun bindings(bindings: Map<String, Any>) {
        cdkBuilder.bindings(bindings)
      }

      override fun collectionBindingProperties(collectionBindingProperties: IResolvable) {
        cdkBuilder.collectionBindingProperties(collectionBindingProperties.let(IResolvable::unwrap))
      }

      override
          fun collectionBindingProperties(collectionBindingProperties: ComponentPropertyBindingPropertiesProperty) {
        cdkBuilder.collectionBindingProperties(collectionBindingProperties.let(ComponentPropertyBindingPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1fddd1f0dd5ea438a032b6b81a2bfb7edadb0fcd314202ebffb5e3d9b377c62")
      override
          fun collectionBindingProperties(collectionBindingProperties: ComponentPropertyBindingPropertiesProperty.Builder.() -> Unit):
          Unit =
          collectionBindingProperties(ComponentPropertyBindingPropertiesProperty(collectionBindingProperties))

      override fun componentName(componentName: String) {
        cdkBuilder.componentName(componentName)
      }

      override fun concat(concat: IResolvable) {
        cdkBuilder.concat(concat.let(IResolvable::unwrap))
      }

      override fun concat(concat: List<Any>) {
        cdkBuilder.concat(concat)
      }

      override fun condition(condition: IResolvable) {
        cdkBuilder.condition(condition.let(IResolvable::unwrap))
      }

      override fun condition(condition: ComponentConditionPropertyProperty) {
        cdkBuilder.condition(condition.let(ComponentConditionPropertyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e62b20dc5d4889db9e220ec40a5ff6226b3ee7051309bf21dcff586c5556c04")
      override fun condition(condition: ComponentConditionPropertyProperty.Builder.() -> Unit): Unit
          = condition(ComponentConditionPropertyProperty(condition))

      override fun configured(configured: Boolean) {
        cdkBuilder.configured(configured)
      }

      override fun configured(configured: IResolvable) {
        cdkBuilder.configured(configured.let(IResolvable::unwrap))
      }

      override fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
      }

      override fun event(event: String) {
        cdkBuilder.event(event)
      }

      override fun importedValue(importedValue: String) {
        cdkBuilder.importedValue(importedValue)
      }

      override fun model(model: String) {
        cdkBuilder.model(model)
      }

      override fun `property`(`property`: String) {
        cdkBuilder.`property`(`property`)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun userAttribute(userAttribute: String) {
        cdkBuilder.userAttribute(userAttribute)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentPropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentPropertyProperty,
    ) : ComponentPropertyProperty {
      override fun bindingProperties(): Any? = unwrap(this).getBindingProperties()

      override fun bindings(): Any? = unwrap(this).getBindings()

      override fun collectionBindingProperties(): Any? =
          unwrap(this).getCollectionBindingProperties()

      override fun componentName(): String? = unwrap(this).getComponentName()

      override fun concat(): Any? = unwrap(this).getConcat()

      override fun condition(): Any? = unwrap(this).getCondition()

      override fun configured(): Any? = unwrap(this).getConfigured()

      override fun defaultValue(): String? = unwrap(this).getDefaultValue()

      override fun event(): String? = unwrap(this).getEvent()

      override fun importedValue(): String? = unwrap(this).getImportedValue()

      override fun model(): String? = unwrap(this).getModel()

      override fun `property`(): String? = unwrap(this).getProperty()

      override fun type(): String? = unwrap(this).getType()

      override fun userAttribute(): String? = unwrap(this).getUserAttribute()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ComponentPropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentPropertyProperty):
          ComponentPropertyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentPropertyProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentPropertyProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ComponentBindingPropertiesValuePropertiesProperty {
    public fun bucket(): String? = unwrap(this).getBucket()

    public fun defaultValue(): String? = unwrap(this).getDefaultValue()

    public fun `field`(): String? = unwrap(this).getField()

    public fun key(): String? = unwrap(this).getKey()

    public fun model(): String? = unwrap(this).getModel()

    public fun predicates(): Any? = unwrap(this).getPredicates()

    public fun slotName(): String? = unwrap(this).getSlotName()

    public fun userAttribute(): String? = unwrap(this).getUserAttribute()

    public interface Builder {
      public fun bucket(bucket: String)

      public fun defaultValue(defaultValue: String)

      public fun `field`(`field`: String)

      public fun key(key: String)

      public fun model(model: String)

      public fun predicates(predicates: IResolvable)

      public fun predicates(predicates: List<Any>)

      public fun slotName(slotName: String)

      public fun userAttribute(userAttribute: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentBindingPropertiesValuePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentBindingPropertiesValuePropertiesProperty.builder()

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
      }

      override fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
      }

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun model(model: String) {
        cdkBuilder.model(model)
      }

      override fun predicates(predicates: IResolvable) {
        cdkBuilder.predicates(predicates.let(IResolvable::unwrap))
      }

      override fun predicates(predicates: List<Any>) {
        cdkBuilder.predicates(predicates)
      }

      override fun slotName(slotName: String) {
        cdkBuilder.slotName(slotName)
      }

      override fun userAttribute(userAttribute: String) {
        cdkBuilder.userAttribute(userAttribute)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentBindingPropertiesValuePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentBindingPropertiesValuePropertiesProperty,
    ) : ComponentBindingPropertiesValuePropertiesProperty {
      override fun bucket(): String? = unwrap(this).getBucket()

      override fun defaultValue(): String? = unwrap(this).getDefaultValue()

      override fun `field`(): String? = unwrap(this).getField()

      override fun key(): String? = unwrap(this).getKey()

      override fun model(): String? = unwrap(this).getModel()

      override fun predicates(): Any? = unwrap(this).getPredicates()

      override fun slotName(): String? = unwrap(this).getSlotName()

      override fun userAttribute(): String? = unwrap(this).getUserAttribute()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ComponentBindingPropertiesValuePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentBindingPropertiesValuePropertiesProperty):
          ComponentBindingPropertiesValuePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentBindingPropertiesValuePropertiesProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentBindingPropertiesValuePropertiesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SortPropertyProperty {
    public fun direction(): String

    public fun `field`(): String

    public interface Builder {
      public fun direction(direction: String)

      public fun `field`(`field`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.SortPropertyProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.SortPropertyProperty.builder()

      override fun direction(direction: String) {
        cdkBuilder.direction(direction)
      }

      override fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.SortPropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.SortPropertyProperty,
    ) : SortPropertyProperty {
      override fun direction(): String = unwrap(this).getDirection()

      override fun `field`(): String = unwrap(this).getField()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SortPropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.SortPropertyProperty):
          SortPropertyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SortPropertyProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.SortPropertyProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ComponentConditionPropertyProperty {
    public fun elseValue(): Any? = unwrap(this).getElseValue()

    public fun `field`(): String? = unwrap(this).getField()

    public fun operand(): String? = unwrap(this).getOperand()

    public fun operandType(): String? = unwrap(this).getOperandType()

    public fun `operator`(): String? = unwrap(this).getOperator()

    public fun `property`(): String? = unwrap(this).getProperty()

    public fun then(): Any? = unwrap(this).getThen()

    public interface Builder {
      public fun elseValue(elseValue: IResolvable)

      public fun elseValue(elseValue: ComponentPropertyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eca01b8b92d9526b56f720609de95a3966bbd801629f5d93e39777c641a8b2a4")
      public fun elseValue(elseValue: ComponentPropertyProperty.Builder.() -> Unit)

      public fun `field`(`field`: String)

      public fun operand(operand: String)

      public fun operandType(operandType: String)

      public fun `operator`(`operator`: String)

      public fun `property`(`property`: String)

      public fun then(then: IResolvable)

      public fun then(then: ComponentPropertyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("40f024eeb71e4a3806fdb425ae62ef18b8adba72de5a6c410aea5203f23f681e")
      public fun then(then: ComponentPropertyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentConditionPropertyProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentConditionPropertyProperty.builder()

      override fun elseValue(elseValue: IResolvable) {
        cdkBuilder.elseValue(elseValue.let(IResolvable::unwrap))
      }

      override fun elseValue(elseValue: ComponentPropertyProperty) {
        cdkBuilder.elseValue(elseValue.let(ComponentPropertyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eca01b8b92d9526b56f720609de95a3966bbd801629f5d93e39777c641a8b2a4")
      override fun elseValue(elseValue: ComponentPropertyProperty.Builder.() -> Unit): Unit =
          elseValue(ComponentPropertyProperty(elseValue))

      override fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
      }

      override fun operand(operand: String) {
        cdkBuilder.operand(operand)
      }

      override fun operandType(operandType: String) {
        cdkBuilder.operandType(operandType)
      }

      override fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
      }

      override fun `property`(`property`: String) {
        cdkBuilder.`property`(`property`)
      }

      override fun then(then: IResolvable) {
        cdkBuilder.then(then.let(IResolvable::unwrap))
      }

      override fun then(then: ComponentPropertyProperty) {
        cdkBuilder.then(then.let(ComponentPropertyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("40f024eeb71e4a3806fdb425ae62ef18b8adba72de5a6c410aea5203f23f681e")
      override fun then(then: ComponentPropertyProperty.Builder.() -> Unit): Unit =
          then(ComponentPropertyProperty(then))

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentConditionPropertyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentConditionPropertyProperty,
    ) : ComponentConditionPropertyProperty {
      override fun elseValue(): Any? = unwrap(this).getElseValue()

      override fun `field`(): String? = unwrap(this).getField()

      override fun operand(): String? = unwrap(this).getOperand()

      override fun operandType(): String? = unwrap(this).getOperandType()

      override fun `operator`(): String? = unwrap(this).getOperator()

      override fun `property`(): String? = unwrap(this).getProperty()

      override fun then(): Any? = unwrap(this).getThen()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ComponentConditionPropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentConditionPropertyProperty):
          ComponentConditionPropertyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentConditionPropertyProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentConditionPropertyProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ComponentBindingPropertiesValueProperty {
    public fun bindingProperties(): Any? = unwrap(this).getBindingProperties()

    public fun defaultValue(): String? = unwrap(this).getDefaultValue()

    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun bindingProperties(bindingProperties: IResolvable)

      public
          fun bindingProperties(bindingProperties: ComponentBindingPropertiesValuePropertiesProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1692f10397a6ae11fa8801385935e558d961ff4ad8638e3301b1012903fbe79f")
      public
          fun bindingProperties(bindingProperties: ComponentBindingPropertiesValuePropertiesProperty.Builder.() -> Unit)

      public fun defaultValue(defaultValue: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentBindingPropertiesValueProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentBindingPropertiesValueProperty.builder()

      override fun bindingProperties(bindingProperties: IResolvable) {
        cdkBuilder.bindingProperties(bindingProperties.let(IResolvable::unwrap))
      }

      override
          fun bindingProperties(bindingProperties: ComponentBindingPropertiesValuePropertiesProperty) {
        cdkBuilder.bindingProperties(bindingProperties.let(ComponentBindingPropertiesValuePropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1692f10397a6ae11fa8801385935e558d961ff4ad8638e3301b1012903fbe79f")
      override
          fun bindingProperties(bindingProperties: ComponentBindingPropertiesValuePropertiesProperty.Builder.() -> Unit):
          Unit =
          bindingProperties(ComponentBindingPropertiesValuePropertiesProperty(bindingProperties))

      override fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentBindingPropertiesValueProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentBindingPropertiesValueProperty,
    ) : ComponentBindingPropertiesValueProperty {
      override fun bindingProperties(): Any? = unwrap(this).getBindingProperties()

      override fun defaultValue(): String? = unwrap(this).getDefaultValue()

      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ComponentBindingPropertiesValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentBindingPropertiesValueProperty):
          ComponentBindingPropertiesValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentBindingPropertiesValueProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentBindingPropertiesValueProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface PredicateProperty {
    public fun and(): Any? = unwrap(this).getAnd()

    public fun `field`(): String? = unwrap(this).getField()

    public fun operand(): String? = unwrap(this).getOperand()

    public fun operandType(): String? = unwrap(this).getOperandType()

    public fun `operator`(): String? = unwrap(this).getOperator()

    public fun or(): Any? = unwrap(this).getOr()

    public interface Builder {
      public fun and(and: IResolvable)

      public fun and(and: List<Any>)

      public fun `field`(`field`: String)

      public fun operand(operand: String)

      public fun operandType(operandType: String)

      public fun `operator`(`operator`: String)

      public fun or(or: IResolvable)

      public fun or(or: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.PredicateProperty.Builder =
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.PredicateProperty.builder()

      override fun and(and: IResolvable) {
        cdkBuilder.and(and.let(IResolvable::unwrap))
      }

      override fun and(and: List<Any>) {
        cdkBuilder.and(and)
      }

      override fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
      }

      override fun operand(operand: String) {
        cdkBuilder.operand(operand)
      }

      override fun operandType(operandType: String) {
        cdkBuilder.operandType(operandType)
      }

      override fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
      }

      override fun or(or: IResolvable) {
        cdkBuilder.or(or.let(IResolvable::unwrap))
      }

      override fun or(or: List<Any>) {
        cdkBuilder.or(or)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.PredicateProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.PredicateProperty,
    ) : PredicateProperty {
      override fun and(): Any? = unwrap(this).getAnd()

      override fun `field`(): String? = unwrap(this).getField()

      override fun operand(): String? = unwrap(this).getOperand()

      override fun operandType(): String? = unwrap(this).getOperandType()

      override fun `operator`(): String? = unwrap(this).getOperator()

      override fun or(): Any? = unwrap(this).getOr()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PredicateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.PredicateProperty):
          PredicateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredicateProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.PredicateProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ComponentPropertyBindingPropertiesProperty {
    public fun `field`(): String? = unwrap(this).getField()

    public fun `property`(): String

    public interface Builder {
      public fun `field`(`field`: String)

      public fun `property`(`property`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentPropertyBindingPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentPropertyBindingPropertiesProperty.builder()

      override fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
      }

      override fun `property`(`property`: String) {
        cdkBuilder.`property`(`property`)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentPropertyBindingPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentPropertyBindingPropertiesProperty,
    ) : ComponentPropertyBindingPropertiesProperty {
      override fun `field`(): String? = unwrap(this).getField()

      override fun `property`(): String = unwrap(this).getProperty()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ComponentPropertyBindingPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentPropertyBindingPropertiesProperty):
          ComponentPropertyBindingPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentPropertyBindingPropertiesProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentPropertyBindingPropertiesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ComponentVariantProperty {
    public fun overrides(): Any? = unwrap(this).getOverrides()

    public fun variantValues(): Any? = unwrap(this).getVariantValues()

    public interface Builder {
      public fun overrides(overrides: Any)

      public fun variantValues(variantValues: IResolvable)

      public fun variantValues(variantValues: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentVariantProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentVariantProperty.builder()

      override fun overrides(overrides: Any) {
        cdkBuilder.overrides(overrides)
      }

      override fun variantValues(variantValues: IResolvable) {
        cdkBuilder.variantValues(variantValues.let(IResolvable::unwrap))
      }

      override fun variantValues(variantValues: Map<String, String>) {
        cdkBuilder.variantValues(variantValues)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentVariantProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentVariantProperty,
    ) : ComponentVariantProperty {
      override fun overrides(): Any? = unwrap(this).getOverrides()

      override fun variantValues(): Any? = unwrap(this).getVariantValues()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ComponentVariantProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentVariantProperty):
          ComponentVariantProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentVariantProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentVariantProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ActionParametersProperty {
    public fun anchor(): Any? = unwrap(this).getAnchor()

    public fun fields(): Any? = unwrap(this).getFields()

    public fun global(): Any? = unwrap(this).getGlobal()

    public fun id(): Any? = unwrap(this).getId()

    public fun model(): String? = unwrap(this).getModel()

    public fun state(): Any? = unwrap(this).getState()

    public fun target(): Any? = unwrap(this).getTarget()

    public fun type(): Any? = unwrap(this).getType()

    public fun url(): Any? = unwrap(this).getUrl()

    public interface Builder {
      public fun anchor(anchor: IResolvable)

      public fun anchor(anchor: ComponentPropertyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b99fc0a65594fae1e242ee44d06d80da334b5849915ec16f39b8b408ab72a670")
      public fun anchor(anchor: ComponentPropertyProperty.Builder.() -> Unit)

      public fun fields(fields: IResolvable)

      public fun fields(fields: Map<String, Any>)

      public fun global(global: IResolvable)

      public fun global(global: ComponentPropertyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("56dda333eb785f4338e29ac168711f8b5ef42304bac44d78dec3135a2045cbbb")
      public fun global(global: ComponentPropertyProperty.Builder.() -> Unit)

      public fun id(id: IResolvable)

      public fun id(id: ComponentPropertyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e11d4ed0b9dfe83d7a76ae590944cd50c9096a38808380b4243a847062b562a2")
      public fun id(id: ComponentPropertyProperty.Builder.() -> Unit)

      public fun model(model: String)

      public fun state(state: IResolvable)

      public fun state(state: MutationActionSetStateParameterProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b05b4096837075a71dfa3d3fa8ded0e88897a8d87c89734554e5d74a3ad83208")
      public fun state(state: MutationActionSetStateParameterProperty.Builder.() -> Unit)

      public fun target(target: IResolvable)

      public fun target(target: ComponentPropertyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b5b059659d10e5bdc3d91347b4d72756f093694d997f855776a6cc043c4c1705")
      public fun target(target: ComponentPropertyProperty.Builder.() -> Unit)

      public fun type(type: IResolvable)

      public fun type(type: ComponentPropertyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7342f6066ddaff2c907eb9bb3b8099bd7317f9ea594e28953470da7aacd19cd3")
      public fun type(type: ComponentPropertyProperty.Builder.() -> Unit)

      public fun url(url: IResolvable)

      public fun url(url: ComponentPropertyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("36bca09fd23e69f3b7e7ca1a6a4546eb710cd44df45097796b263c13e5ca35fd")
      public fun url(url: ComponentPropertyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ActionParametersProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ActionParametersProperty.builder()

      override fun anchor(anchor: IResolvable) {
        cdkBuilder.anchor(anchor.let(IResolvable::unwrap))
      }

      override fun anchor(anchor: ComponentPropertyProperty) {
        cdkBuilder.anchor(anchor.let(ComponentPropertyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b99fc0a65594fae1e242ee44d06d80da334b5849915ec16f39b8b408ab72a670")
      override fun anchor(anchor: ComponentPropertyProperty.Builder.() -> Unit): Unit =
          anchor(ComponentPropertyProperty(anchor))

      override fun fields(fields: IResolvable) {
        cdkBuilder.fields(fields.let(IResolvable::unwrap))
      }

      override fun fields(fields: Map<String, Any>) {
        cdkBuilder.fields(fields)
      }

      override fun global(global: IResolvable) {
        cdkBuilder.global(global.let(IResolvable::unwrap))
      }

      override fun global(global: ComponentPropertyProperty) {
        cdkBuilder.global(global.let(ComponentPropertyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("56dda333eb785f4338e29ac168711f8b5ef42304bac44d78dec3135a2045cbbb")
      override fun global(global: ComponentPropertyProperty.Builder.() -> Unit): Unit =
          global(ComponentPropertyProperty(global))

      override fun id(id: IResolvable) {
        cdkBuilder.id(id.let(IResolvable::unwrap))
      }

      override fun id(id: ComponentPropertyProperty) {
        cdkBuilder.id(id.let(ComponentPropertyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e11d4ed0b9dfe83d7a76ae590944cd50c9096a38808380b4243a847062b562a2")
      override fun id(id: ComponentPropertyProperty.Builder.() -> Unit): Unit =
          id(ComponentPropertyProperty(id))

      override fun model(model: String) {
        cdkBuilder.model(model)
      }

      override fun state(state: IResolvable) {
        cdkBuilder.state(state.let(IResolvable::unwrap))
      }

      override fun state(state: MutationActionSetStateParameterProperty) {
        cdkBuilder.state(state.let(MutationActionSetStateParameterProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b05b4096837075a71dfa3d3fa8ded0e88897a8d87c89734554e5d74a3ad83208")
      override fun state(state: MutationActionSetStateParameterProperty.Builder.() -> Unit): Unit =
          state(MutationActionSetStateParameterProperty(state))

      override fun target(target: IResolvable) {
        cdkBuilder.target(target.let(IResolvable::unwrap))
      }

      override fun target(target: ComponentPropertyProperty) {
        cdkBuilder.target(target.let(ComponentPropertyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b5b059659d10e5bdc3d91347b4d72756f093694d997f855776a6cc043c4c1705")
      override fun target(target: ComponentPropertyProperty.Builder.() -> Unit): Unit =
          target(ComponentPropertyProperty(target))

      override fun type(type: IResolvable) {
        cdkBuilder.type(type.let(IResolvable::unwrap))
      }

      override fun type(type: ComponentPropertyProperty) {
        cdkBuilder.type(type.let(ComponentPropertyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7342f6066ddaff2c907eb9bb3b8099bd7317f9ea594e28953470da7aacd19cd3")
      override fun type(type: ComponentPropertyProperty.Builder.() -> Unit): Unit =
          type(ComponentPropertyProperty(type))

      override fun url(url: IResolvable) {
        cdkBuilder.url(url.let(IResolvable::unwrap))
      }

      override fun url(url: ComponentPropertyProperty) {
        cdkBuilder.url(url.let(ComponentPropertyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("36bca09fd23e69f3b7e7ca1a6a4546eb710cd44df45097796b263c13e5ca35fd")
      override fun url(url: ComponentPropertyProperty.Builder.() -> Unit): Unit =
          url(ComponentPropertyProperty(url))

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ActionParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ActionParametersProperty,
    ) : ActionParametersProperty {
      override fun anchor(): Any? = unwrap(this).getAnchor()

      override fun fields(): Any? = unwrap(this).getFields()

      override fun global(): Any? = unwrap(this).getGlobal()

      override fun id(): Any? = unwrap(this).getId()

      override fun model(): String? = unwrap(this).getModel()

      override fun state(): Any? = unwrap(this).getState()

      override fun target(): Any? = unwrap(this).getTarget()

      override fun type(): Any? = unwrap(this).getType()

      override fun url(): Any? = unwrap(this).getUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ActionParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ActionParametersProperty):
          ActionParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionParametersProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ActionParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ComponentDataConfigurationProperty {
    public fun identifiers(): List<String> = unwrap(this).getIdentifiers() ?: emptyList()

    public fun model(): String

    public fun predicate(): Any? = unwrap(this).getPredicate()

    public fun sort(): Any? = unwrap(this).getSort()

    public interface Builder {
      public fun identifiers(identifiers: List<String>)

      public fun model(model: String)

      public fun predicate(predicate: IResolvable)

      public fun predicate(predicate: PredicateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4fc9628f2bca7ef392d9c2c88057753e581a430b34742ede1c075d08502caaa7")
      public fun predicate(predicate: PredicateProperty.Builder.() -> Unit)

      public fun sort(sort: IResolvable)

      public fun sort(sort: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentDataConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentDataConfigurationProperty.builder()

      override fun identifiers(identifiers: List<String>) {
        cdkBuilder.identifiers(identifiers)
      }

      override fun model(model: String) {
        cdkBuilder.model(model)
      }

      override fun predicate(predicate: IResolvable) {
        cdkBuilder.predicate(predicate.let(IResolvable::unwrap))
      }

      override fun predicate(predicate: PredicateProperty) {
        cdkBuilder.predicate(predicate.let(PredicateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4fc9628f2bca7ef392d9c2c88057753e581a430b34742ede1c075d08502caaa7")
      override fun predicate(predicate: PredicateProperty.Builder.() -> Unit): Unit =
          predicate(PredicateProperty(predicate))

      override fun sort(sort: IResolvable) {
        cdkBuilder.sort(sort.let(IResolvable::unwrap))
      }

      override fun sort(sort: List<Any>) {
        cdkBuilder.sort(sort)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentDataConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentDataConfigurationProperty,
    ) : ComponentDataConfigurationProperty {
      override fun identifiers(): List<String> = unwrap(this).getIdentifiers() ?: emptyList()

      override fun model(): String = unwrap(this).getModel()

      override fun predicate(): Any? = unwrap(this).getPredicate()

      override fun sort(): Any? = unwrap(this).getSort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ComponentDataConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentDataConfigurationProperty):
          ComponentDataConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentDataConfigurationProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentDataConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
