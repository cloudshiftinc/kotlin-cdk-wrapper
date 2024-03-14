package io.cloudshiftdev.awscdk.services.iottwinmaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEntity internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreationDateTime(): String = unwrap(this).getAttrCreationDateTime()

  public open fun attrHasChildEntities(): IResolvable =
      unwrap(this).getAttrHasChildEntities().let(IResolvable::wrap)

  public open fun attrStatus(): IResolvable = unwrap(this).getAttrStatus().let(IResolvable::wrap)

  public open fun attrStatusError(): IResolvable =
      unwrap(this).getAttrStatusError().let(IResolvable::wrap)

  public open fun attrStatusErrorCode(): String = unwrap(this).getAttrStatusErrorCode()

  public open fun attrStatusErrorMessage(): String = unwrap(this).getAttrStatusErrorMessage()

  public open fun attrStatusState(): String = unwrap(this).getAttrStatusState()

  public open fun attrUpdateDateTime(): String = unwrap(this).getAttrUpdateDateTime()

  public open fun components(): Any? = unwrap(this).getComponents()

  public open fun components(`value`: IResolvable) {
    unwrap(this).setComponents(`value`.let(IResolvable::unwrap))
  }

  public open fun components(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setComponents(__item_ac66f0)
  }

  public open fun compositeComponents(): Any? = unwrap(this).getCompositeComponents()

  public open fun compositeComponents(`value`: IResolvable) {
    unwrap(this).setCompositeComponents(`value`.let(IResolvable::unwrap))
  }

  public open fun compositeComponents(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setCompositeComponents(__item_ac66f0)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun entityId(): String? = unwrap(this).getEntityId()

  public open fun entityId(`value`: String) {
    unwrap(this).setEntityId(`value`)
  }

  public open fun entityName(): String = unwrap(this).getEntityName()

  public open fun entityName(`value`: String) {
    unwrap(this).setEntityName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun parentEntityId(): String? = unwrap(this).getParentEntityId()

  public open fun parentEntityId(`value`: String) {
    unwrap(this).setParentEntityId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun workspaceId(): String = unwrap(this).getWorkspaceId()

  public open fun workspaceId(`value`: String) {
    unwrap(this).setWorkspaceId(`value`)
  }

  public interface Builder {
    public fun components(components: IResolvable)

    public fun components(components: Map<String, Any>)

    public fun compositeComponents(compositeComponents: IResolvable)

    public fun compositeComponents(compositeComponents: Map<String, Any>)

    public fun description(description: String)

    public fun entityId(entityId: String)

    public fun entityName(entityName: String)

    public fun parentEntityId(parentEntityId: String)

    public fun tags(tags: Map<String, String>)

    public fun workspaceId(workspaceId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iottwinmaker.CfnEntity.Builder =
        software.amazon.awscdk.services.iottwinmaker.CfnEntity.Builder.create(scope, id)

    override fun components(components: IResolvable) {
      cdkBuilder.components(components.let(IResolvable::unwrap))
    }

    override fun components(components: Map<String, Any>) {
      cdkBuilder.components(components)
    }

    override fun compositeComponents(compositeComponents: IResolvable) {
      cdkBuilder.compositeComponents(compositeComponents.let(IResolvable::unwrap))
    }

    override fun compositeComponents(compositeComponents: Map<String, Any>) {
      cdkBuilder.compositeComponents(compositeComponents)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun entityId(entityId: String) {
      cdkBuilder.entityId(entityId)
    }

    override fun entityName(entityName: String) {
      cdkBuilder.entityName(entityName)
    }

    override fun parentEntityId(parentEntityId: String) {
      cdkBuilder.parentEntityId(parentEntityId)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun workspaceId(workspaceId: String) {
      cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnEntity = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEntity {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEntity(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity): CfnEntity
        = CfnEntity(cdkObject)

    internal fun unwrap(wrapped: CfnEntity): software.amazon.awscdk.services.iottwinmaker.CfnEntity
        = wrapped.cdkObject
  }

  public interface RelationshipValueProperty {
    public fun targetComponentName(): String? = unwrap(this).getTargetComponentName()

    public fun targetEntityId(): String? = unwrap(this).getTargetEntityId()

    public interface Builder {
      public fun targetComponentName(targetComponentName: String)

      public fun targetEntityId(targetEntityId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.RelationshipValueProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.RelationshipValueProperty.builder()

      override fun targetComponentName(targetComponentName: String) {
        cdkBuilder.targetComponentName(targetComponentName)
      }

      override fun targetEntityId(targetEntityId: String) {
        cdkBuilder.targetEntityId(targetEntityId)
      }

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.RelationshipValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.RelationshipValueProperty,
    ) : RelationshipValueProperty {
      override fun targetComponentName(): String? = unwrap(this).getTargetComponentName()

      override fun targetEntityId(): String? = unwrap(this).getTargetEntityId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RelationshipValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity.RelationshipValueProperty):
          RelationshipValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RelationshipValueProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.RelationshipValueProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ErrorProperty {
    public fun code(): String? = unwrap(this).getCode()

    public fun message(): String? = unwrap(this).getMessage()

    public interface Builder {
      public fun code(code: String)

      public fun message(message: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.ErrorProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.ErrorProperty.builder()

      override fun code(code: String) {
        cdkBuilder.code(code)
      }

      override fun message(message: String) {
        cdkBuilder.message(message)
      }

      public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnEntity.ErrorProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity.ErrorProperty,
    ) : ErrorProperty {
      override fun code(): String? = unwrap(this).getCode()

      override fun message(): String? = unwrap(this).getMessage()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ErrorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity.ErrorProperty):
          ErrorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ErrorProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.ErrorProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PropertyProperty {
    public fun definition(): Any? = unwrap(this).getDefinition()

    public fun `value`(): Any? = unwrap(this).getValue()

    public interface Builder {
      public fun definition(definition: Any)

      public fun `value`(`value`: IResolvable)

      public fun `value`(`value`: DataValueProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1b705310b11f5cc8cc31e81403c2d7dcc4073e9f3a674ae8ab805a7d4fdd73d")
      public fun `value`(`value`: DataValueProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.PropertyProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.PropertyProperty.builder()

      override fun definition(definition: Any) {
        cdkBuilder.definition(definition)
      }

      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable::unwrap))
      }

      override fun `value`(`value`: DataValueProperty) {
        cdkBuilder.`value`(`value`.let(DataValueProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1b705310b11f5cc8cc31e81403c2d7dcc4073e9f3a674ae8ab805a7d4fdd73d")
      override fun `value`(`value`: DataValueProperty.Builder.() -> Unit): Unit =
          `value`(DataValueProperty(`value`))

      public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnEntity.PropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.PropertyProperty,
    ) : PropertyProperty {
      override fun definition(): Any? = unwrap(this).getDefinition()

      override fun `value`(): Any? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity.PropertyProperty):
          PropertyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PropertyProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.PropertyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DataTypeProperty {
    public fun allowedValues(): Any? = unwrap(this).getAllowedValues()

    public fun nestedType(): Any? = unwrap(this).getNestedType()

    public fun relationship(): Any? = unwrap(this).getRelationship()

    public fun type(): String? = unwrap(this).getType()

    public fun unitOfMeasure(): String? = unwrap(this).getUnitOfMeasure()

    public interface Builder {
      public fun allowedValues(allowedValues: IResolvable)

      public fun allowedValues(allowedValues: List<Any>)

      public fun nestedType(nestedType: IResolvable)

      public fun nestedType(nestedType: DataTypeProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1669d24f23e172179159bc8936c6cc43082a996eaf0b8153ff6e366061d0a2ee")
      public fun nestedType(nestedType: Builder.() -> Unit)

      public fun relationship(relationship: IResolvable)

      public fun relationship(relationship: RelationshipProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4580e67a65b938122f66bff4b7ba39c98d08849431a22a1624113cb56e1948ac")
      public fun relationship(relationship: RelationshipProperty.Builder.() -> Unit)

      public fun type(type: String)

      public fun unitOfMeasure(unitOfMeasure: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.DataTypeProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.DataTypeProperty.builder()

      override fun allowedValues(allowedValues: IResolvable) {
        cdkBuilder.allowedValues(allowedValues.let(IResolvable::unwrap))
      }

      override fun allowedValues(allowedValues: List<Any>) {
        cdkBuilder.allowedValues(allowedValues)
      }

      override fun nestedType(nestedType: IResolvable) {
        cdkBuilder.nestedType(nestedType.let(IResolvable::unwrap))
      }

      override fun nestedType(nestedType: DataTypeProperty) {
        cdkBuilder.nestedType(nestedType.let(DataTypeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1669d24f23e172179159bc8936c6cc43082a996eaf0b8153ff6e366061d0a2ee")
      override fun nestedType(nestedType: Builder.() -> Unit): Unit =
          nestedType(DataTypeProperty(nestedType))

      override fun relationship(relationship: IResolvable) {
        cdkBuilder.relationship(relationship.let(IResolvable::unwrap))
      }

      override fun relationship(relationship: RelationshipProperty) {
        cdkBuilder.relationship(relationship.let(RelationshipProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4580e67a65b938122f66bff4b7ba39c98d08849431a22a1624113cb56e1948ac")
      override fun relationship(relationship: RelationshipProperty.Builder.() -> Unit): Unit =
          relationship(RelationshipProperty(relationship))

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun unitOfMeasure(unitOfMeasure: String) {
        cdkBuilder.unitOfMeasure(unitOfMeasure)
      }

      public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnEntity.DataTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.DataTypeProperty,
    ) : DataTypeProperty {
      override fun allowedValues(): Any? = unwrap(this).getAllowedValues()

      override fun nestedType(): Any? = unwrap(this).getNestedType()

      override fun relationship(): Any? = unwrap(this).getRelationship()

      override fun type(): String? = unwrap(this).getType()

      override fun unitOfMeasure(): String? = unwrap(this).getUnitOfMeasure()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity.DataTypeProperty):
          DataTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataTypeProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.DataTypeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface StatusProperty {
    public fun error(): Any? = unwrap(this).getError()

    public fun state(): String? = unwrap(this).getState()

    public interface Builder {
      public fun error(error: Any)

      public fun state(state: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.StatusProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.StatusProperty.builder()

      override fun error(error: Any) {
        cdkBuilder.error(error)
      }

      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnEntity.StatusProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity.StatusProperty,
    ) : StatusProperty {
      override fun error(): Any? = unwrap(this).getError()

      override fun state(): String? = unwrap(this).getState()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StatusProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity.StatusProperty):
          StatusProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatusProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.StatusProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ComponentProperty {
    public fun componentName(): String? = unwrap(this).getComponentName()

    public fun componentTypeId(): String? = unwrap(this).getComponentTypeId()

    public fun definedIn(): String? = unwrap(this).getDefinedIn()

    public fun description(): String? = unwrap(this).getDescription()

    public fun properties(): Any? = unwrap(this).getProperties()

    public fun propertyGroups(): Any? = unwrap(this).getPropertyGroups()

    public fun status(): Any? = unwrap(this).getStatus()

    public interface Builder {
      public fun componentName(componentName: String)

      public fun componentTypeId(componentTypeId: String)

      public fun definedIn(definedIn: String)

      public fun description(description: String)

      public fun properties(properties: IResolvable)

      public fun properties(properties: Map<String, Any>)

      public fun propertyGroups(propertyGroups: IResolvable)

      public fun propertyGroups(propertyGroups: Map<String, Any>)

      public fun status(status: IResolvable)

      public fun status(status: StatusProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d6773e25ed2616ddc9f8fd8a61b61d0098cca693b9e39908fcaee434360f695")
      public fun status(status: StatusProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.ComponentProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.ComponentProperty.builder()

      override fun componentName(componentName: String) {
        cdkBuilder.componentName(componentName)
      }

      override fun componentTypeId(componentTypeId: String) {
        cdkBuilder.componentTypeId(componentTypeId)
      }

      override fun definedIn(definedIn: String) {
        cdkBuilder.definedIn(definedIn)
      }

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties.let(IResolvable::unwrap))
      }

      override fun properties(properties: Map<String, Any>) {
        cdkBuilder.properties(properties)
      }

      override fun propertyGroups(propertyGroups: IResolvable) {
        cdkBuilder.propertyGroups(propertyGroups.let(IResolvable::unwrap))
      }

      override fun propertyGroups(propertyGroups: Map<String, Any>) {
        cdkBuilder.propertyGroups(propertyGroups)
      }

      override fun status(status: IResolvable) {
        cdkBuilder.status(status.let(IResolvable::unwrap))
      }

      override fun status(status: StatusProperty) {
        cdkBuilder.status(status.let(StatusProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d6773e25ed2616ddc9f8fd8a61b61d0098cca693b9e39908fcaee434360f695")
      override fun status(status: StatusProperty.Builder.() -> Unit): Unit =
          status(StatusProperty(status))

      public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnEntity.ComponentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.ComponentProperty,
    ) : ComponentProperty {
      override fun componentName(): String? = unwrap(this).getComponentName()

      override fun componentTypeId(): String? = unwrap(this).getComponentTypeId()

      override fun definedIn(): String? = unwrap(this).getDefinedIn()

      override fun description(): String? = unwrap(this).getDescription()

      override fun properties(): Any? = unwrap(this).getProperties()

      override fun propertyGroups(): Any? = unwrap(this).getPropertyGroups()

      override fun status(): Any? = unwrap(this).getStatus()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ComponentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity.ComponentProperty):
          ComponentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.ComponentProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RelationshipProperty {
    public fun relationshipType(): String? = unwrap(this).getRelationshipType()

    public fun targetComponentTypeId(): String? = unwrap(this).getTargetComponentTypeId()

    public interface Builder {
      public fun relationshipType(relationshipType: String)

      public fun targetComponentTypeId(targetComponentTypeId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.RelationshipProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.RelationshipProperty.builder()

      override fun relationshipType(relationshipType: String) {
        cdkBuilder.relationshipType(relationshipType)
      }

      override fun targetComponentTypeId(targetComponentTypeId: String) {
        cdkBuilder.targetComponentTypeId(targetComponentTypeId)
      }

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.RelationshipProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.RelationshipProperty,
    ) : RelationshipProperty {
      override fun relationshipType(): String? = unwrap(this).getRelationshipType()

      override fun targetComponentTypeId(): String? = unwrap(this).getTargetComponentTypeId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RelationshipProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity.RelationshipProperty):
          RelationshipProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RelationshipProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.RelationshipProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DefinitionProperty {
    public fun configuration(): Any? = unwrap(this).getConfiguration()

    public fun dataType(): Any? = unwrap(this).getDataType()

    public fun defaultValue(): Any? = unwrap(this).getDefaultValue()

    public fun isExternalId(): Any? = unwrap(this).getIsExternalId()

    public fun isFinal(): Any? = unwrap(this).getIsFinal()

    public fun isImported(): Any? = unwrap(this).getIsImported()

    public fun isInherited(): Any? = unwrap(this).getIsInherited()

    public fun isRequiredInEntity(): Any? = unwrap(this).getIsRequiredInEntity()

    public fun isStoredExternally(): Any? = unwrap(this).getIsStoredExternally()

    public fun isTimeSeries(): Any? = unwrap(this).getIsTimeSeries()

    public interface Builder {
      public fun configuration(configuration: IResolvable)

      public fun configuration(configuration: Map<String, String>)

      public fun dataType(dataType: IResolvable)

      public fun dataType(dataType: DataTypeProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fac4724514d75c45b1a9ff8df8a21e9db7830b2a179f0e0853d59e5204d159cb")
      public fun dataType(dataType: DataTypeProperty.Builder.() -> Unit)

      public fun defaultValue(defaultValue: IResolvable)

      public fun defaultValue(defaultValue: DataValueProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83f6cf92a61e98c70b3eb65fb11d43c5b6ce0d778bcaf988732b8e39d0adf506")
      public fun defaultValue(defaultValue: DataValueProperty.Builder.() -> Unit)

      public fun isExternalId(isExternalId: Boolean)

      public fun isExternalId(isExternalId: IResolvable)

      public fun isFinal(isFinal: Boolean)

      public fun isFinal(isFinal: IResolvable)

      public fun isImported(isImported: Boolean)

      public fun isImported(isImported: IResolvable)

      public fun isInherited(isInherited: Boolean)

      public fun isInherited(isInherited: IResolvable)

      public fun isRequiredInEntity(isRequiredInEntity: Boolean)

      public fun isRequiredInEntity(isRequiredInEntity: IResolvable)

      public fun isStoredExternally(isStoredExternally: Boolean)

      public fun isStoredExternally(isStoredExternally: IResolvable)

      public fun isTimeSeries(isTimeSeries: Boolean)

      public fun isTimeSeries(isTimeSeries: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.DefinitionProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.DefinitionProperty.builder()

      override fun configuration(configuration: IResolvable) {
        cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
      }

      override fun configuration(configuration: Map<String, String>) {
        cdkBuilder.configuration(configuration)
      }

      override fun dataType(dataType: IResolvable) {
        cdkBuilder.dataType(dataType.let(IResolvable::unwrap))
      }

      override fun dataType(dataType: DataTypeProperty) {
        cdkBuilder.dataType(dataType.let(DataTypeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fac4724514d75c45b1a9ff8df8a21e9db7830b2a179f0e0853d59e5204d159cb")
      override fun dataType(dataType: DataTypeProperty.Builder.() -> Unit): Unit =
          dataType(DataTypeProperty(dataType))

      override fun defaultValue(defaultValue: IResolvable) {
        cdkBuilder.defaultValue(defaultValue.let(IResolvable::unwrap))
      }

      override fun defaultValue(defaultValue: DataValueProperty) {
        cdkBuilder.defaultValue(defaultValue.let(DataValueProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83f6cf92a61e98c70b3eb65fb11d43c5b6ce0d778bcaf988732b8e39d0adf506")
      override fun defaultValue(defaultValue: DataValueProperty.Builder.() -> Unit): Unit =
          defaultValue(DataValueProperty(defaultValue))

      override fun isExternalId(isExternalId: Boolean) {
        cdkBuilder.isExternalId(isExternalId)
      }

      override fun isExternalId(isExternalId: IResolvable) {
        cdkBuilder.isExternalId(isExternalId.let(IResolvable::unwrap))
      }

      override fun isFinal(isFinal: Boolean) {
        cdkBuilder.isFinal(isFinal)
      }

      override fun isFinal(isFinal: IResolvable) {
        cdkBuilder.isFinal(isFinal.let(IResolvable::unwrap))
      }

      override fun isImported(isImported: Boolean) {
        cdkBuilder.isImported(isImported)
      }

      override fun isImported(isImported: IResolvable) {
        cdkBuilder.isImported(isImported.let(IResolvable::unwrap))
      }

      override fun isInherited(isInherited: Boolean) {
        cdkBuilder.isInherited(isInherited)
      }

      override fun isInherited(isInherited: IResolvable) {
        cdkBuilder.isInherited(isInherited.let(IResolvable::unwrap))
      }

      override fun isRequiredInEntity(isRequiredInEntity: Boolean) {
        cdkBuilder.isRequiredInEntity(isRequiredInEntity)
      }

      override fun isRequiredInEntity(isRequiredInEntity: IResolvable) {
        cdkBuilder.isRequiredInEntity(isRequiredInEntity.let(IResolvable::unwrap))
      }

      override fun isStoredExternally(isStoredExternally: Boolean) {
        cdkBuilder.isStoredExternally(isStoredExternally)
      }

      override fun isStoredExternally(isStoredExternally: IResolvable) {
        cdkBuilder.isStoredExternally(isStoredExternally.let(IResolvable::unwrap))
      }

      override fun isTimeSeries(isTimeSeries: Boolean) {
        cdkBuilder.isTimeSeries(isTimeSeries)
      }

      override fun isTimeSeries(isTimeSeries: IResolvable) {
        cdkBuilder.isTimeSeries(isTimeSeries.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnEntity.DefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.DefinitionProperty,
    ) : DefinitionProperty {
      override fun configuration(): Any? = unwrap(this).getConfiguration()

      override fun dataType(): Any? = unwrap(this).getDataType()

      override fun defaultValue(): Any? = unwrap(this).getDefaultValue()

      override fun isExternalId(): Any? = unwrap(this).getIsExternalId()

      override fun isFinal(): Any? = unwrap(this).getIsFinal()

      override fun isImported(): Any? = unwrap(this).getIsImported()

      override fun isInherited(): Any? = unwrap(this).getIsInherited()

      override fun isRequiredInEntity(): Any? = unwrap(this).getIsRequiredInEntity()

      override fun isStoredExternally(): Any? = unwrap(this).getIsStoredExternally()

      override fun isTimeSeries(): Any? = unwrap(this).getIsTimeSeries()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity.DefinitionProperty):
          DefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefinitionProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.DefinitionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DataValueProperty {
    public fun booleanValue(): Any? = unwrap(this).getBooleanValue()

    public fun doubleValue(): Number? = unwrap(this).getDoubleValue()

    public fun expression(): String? = unwrap(this).getExpression()

    public fun integerValue(): Number? = unwrap(this).getIntegerValue()

    public fun listValue(): Any? = unwrap(this).getListValue()

    public fun longValue(): Number? = unwrap(this).getLongValue()

    public fun mapValue(): Any? = unwrap(this).getMapValue()

    public fun relationshipValue(): Any? = unwrap(this).getRelationshipValue()

    public fun stringValue(): String? = unwrap(this).getStringValue()

    public interface Builder {
      public fun booleanValue(booleanValue: Boolean)

      public fun booleanValue(booleanValue: IResolvable)

      public fun doubleValue(doubleValue: Number)

      public fun expression(expression: String)

      public fun integerValue(integerValue: Number)

      public fun listValue(listValue: IResolvable)

      public fun listValue(listValue: List<Any>)

      public fun longValue(longValue: Number)

      public fun mapValue(mapValue: IResolvable)

      public fun mapValue(mapValue: Map<String, Any>)

      public fun relationshipValue(relationshipValue: Any)

      public fun stringValue(stringValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.DataValueProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.DataValueProperty.builder()

      override fun booleanValue(booleanValue: Boolean) {
        cdkBuilder.booleanValue(booleanValue)
      }

      override fun booleanValue(booleanValue: IResolvable) {
        cdkBuilder.booleanValue(booleanValue.let(IResolvable::unwrap))
      }

      override fun doubleValue(doubleValue: Number) {
        cdkBuilder.doubleValue(doubleValue)
      }

      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      override fun integerValue(integerValue: Number) {
        cdkBuilder.integerValue(integerValue)
      }

      override fun listValue(listValue: IResolvable) {
        cdkBuilder.listValue(listValue.let(IResolvable::unwrap))
      }

      override fun listValue(listValue: List<Any>) {
        cdkBuilder.listValue(listValue)
      }

      override fun longValue(longValue: Number) {
        cdkBuilder.longValue(longValue)
      }

      override fun mapValue(mapValue: IResolvable) {
        cdkBuilder.mapValue(mapValue.let(IResolvable::unwrap))
      }

      override fun mapValue(mapValue: Map<String, Any>) {
        cdkBuilder.mapValue(mapValue)
      }

      override fun relationshipValue(relationshipValue: Any) {
        cdkBuilder.relationshipValue(relationshipValue)
      }

      override fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
      }

      public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnEntity.DataValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.DataValueProperty,
    ) : DataValueProperty {
      override fun booleanValue(): Any? = unwrap(this).getBooleanValue()

      override fun doubleValue(): Number? = unwrap(this).getDoubleValue()

      override fun expression(): String? = unwrap(this).getExpression()

      override fun integerValue(): Number? = unwrap(this).getIntegerValue()

      override fun listValue(): Any? = unwrap(this).getListValue()

      override fun longValue(): Number? = unwrap(this).getLongValue()

      override fun mapValue(): Any? = unwrap(this).getMapValue()

      override fun relationshipValue(): Any? = unwrap(this).getRelationshipValue()

      override fun stringValue(): String? = unwrap(this).getStringValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity.DataValueProperty):
          DataValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataValueProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.DataValueProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CompositeComponentProperty {
    public fun componentName(): String? = unwrap(this).getComponentName()

    public fun componentPath(): String? = unwrap(this).getComponentPath()

    public fun componentTypeId(): String? = unwrap(this).getComponentTypeId()

    public fun description(): String? = unwrap(this).getDescription()

    public fun properties(): Any? = unwrap(this).getProperties()

    public fun propertyGroups(): Any? = unwrap(this).getPropertyGroups()

    public fun status(): Any? = unwrap(this).getStatus()

    public interface Builder {
      public fun componentName(componentName: String)

      public fun componentPath(componentPath: String)

      public fun componentTypeId(componentTypeId: String)

      public fun description(description: String)

      public fun properties(properties: IResolvable)

      public fun properties(properties: Map<String, Any>)

      public fun propertyGroups(propertyGroups: IResolvable)

      public fun propertyGroups(propertyGroups: Map<String, Any>)

      public fun status(status: IResolvable)

      public fun status(status: StatusProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b85cfef170fd3c440c2e6131bd11e771c46b1d23f3a4334204d4945e94913bb6")
      public fun status(status: StatusProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.CompositeComponentProperty.Builder
          =
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.CompositeComponentProperty.builder()

      override fun componentName(componentName: String) {
        cdkBuilder.componentName(componentName)
      }

      override fun componentPath(componentPath: String) {
        cdkBuilder.componentPath(componentPath)
      }

      override fun componentTypeId(componentTypeId: String) {
        cdkBuilder.componentTypeId(componentTypeId)
      }

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties.let(IResolvable::unwrap))
      }

      override fun properties(properties: Map<String, Any>) {
        cdkBuilder.properties(properties)
      }

      override fun propertyGroups(propertyGroups: IResolvable) {
        cdkBuilder.propertyGroups(propertyGroups.let(IResolvable::unwrap))
      }

      override fun propertyGroups(propertyGroups: Map<String, Any>) {
        cdkBuilder.propertyGroups(propertyGroups)
      }

      override fun status(status: IResolvable) {
        cdkBuilder.status(status.let(IResolvable::unwrap))
      }

      override fun status(status: StatusProperty) {
        cdkBuilder.status(status.let(StatusProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b85cfef170fd3c440c2e6131bd11e771c46b1d23f3a4334204d4945e94913bb6")
      override fun status(status: StatusProperty.Builder.() -> Unit): Unit =
          status(StatusProperty(status))

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.CompositeComponentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.CompositeComponentProperty,
    ) : CompositeComponentProperty {
      override fun componentName(): String? = unwrap(this).getComponentName()

      override fun componentPath(): String? = unwrap(this).getComponentPath()

      override fun componentTypeId(): String? = unwrap(this).getComponentTypeId()

      override fun description(): String? = unwrap(this).getDescription()

      override fun properties(): Any? = unwrap(this).getProperties()

      override fun propertyGroups(): Any? = unwrap(this).getPropertyGroups()

      override fun status(): Any? = unwrap(this).getStatus()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CompositeComponentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity.CompositeComponentProperty):
          CompositeComponentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CompositeComponentProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.CompositeComponentProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PropertyGroupProperty {
    public fun groupType(): String? = unwrap(this).getGroupType()

    public fun propertyNames(): List<String> = unwrap(this).getPropertyNames() ?: emptyList()

    public interface Builder {
      public fun groupType(groupType: String)

      public fun propertyNames(propertyNames: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.PropertyGroupProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.PropertyGroupProperty.builder()

      override fun groupType(groupType: String) {
        cdkBuilder.groupType(groupType)
      }

      override fun propertyNames(propertyNames: List<String>) {
        cdkBuilder.propertyNames(propertyNames)
      }

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.PropertyGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.PropertyGroupProperty,
    ) : PropertyGroupProperty {
      override fun groupType(): String? = unwrap(this).getGroupType()

      override fun propertyNames(): List<String> = unwrap(this).getPropertyNames() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PropertyGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity.PropertyGroupProperty):
          PropertyGroupProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PropertyGroupProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.PropertyGroupProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
