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

public open class CfnComponentType internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreationDateTime(): String = unwrap(this).getAttrCreationDateTime()

  public open fun attrIsAbstract(): IResolvable =
      unwrap(this).getAttrIsAbstract().let(IResolvable::wrap)

  public open fun attrIsSchemaInitialized(): IResolvable =
      unwrap(this).getAttrIsSchemaInitialized().let(IResolvable::wrap)

  public open fun attrStatus(): IResolvable = unwrap(this).getAttrStatus().let(IResolvable::wrap)

  public open fun attrStatusError(): IResolvable =
      unwrap(this).getAttrStatusError().let(IResolvable::wrap)

  public open fun attrStatusErrorCode(): String = unwrap(this).getAttrStatusErrorCode()

  public open fun attrStatusErrorMessage(): String = unwrap(this).getAttrStatusErrorMessage()

  public open fun attrStatusState(): String = unwrap(this).getAttrStatusState()

  public open fun attrUpdateDateTime(): String = unwrap(this).getAttrUpdateDateTime()

  public open fun componentTypeId(): String = unwrap(this).getComponentTypeId()

  public open fun componentTypeId(`value`: String) {
    unwrap(this).setComponentTypeId(`value`)
  }

  public open fun compositeComponentTypes(): Any? = unwrap(this).getCompositeComponentTypes()

  public open fun compositeComponentTypes(`value`: IResolvable) {
    unwrap(this).setCompositeComponentTypes(`value`.let(IResolvable::unwrap))
  }

  public open fun compositeComponentTypes(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setCompositeComponentTypes(__item_ac66f0)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun extendsFrom(): List<String> = unwrap(this).getExtendsFrom() ?: emptyList()

  public open fun extendsFrom(`value`: List<String>) {
    unwrap(this).setExtendsFrom(`value`)
  }

  public open fun functions(): Any? = unwrap(this).getFunctions()

  public open fun functions(`value`: IResolvable) {
    unwrap(this).setFunctions(`value`.let(IResolvable::unwrap))
  }

  public open fun functions(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setFunctions(__item_ac66f0)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun isSingleton(): Any? = unwrap(this).getIsSingleton()

  public open fun isSingleton(`value`: Boolean) {
    unwrap(this).setIsSingleton(`value`)
  }

  public open fun isSingleton(`value`: IResolvable) {
    unwrap(this).setIsSingleton(`value`.let(IResolvable::unwrap))
  }

  public open fun propertyDefinitions(): Any? = unwrap(this).getPropertyDefinitions()

  public open fun propertyDefinitions(`value`: IResolvable) {
    unwrap(this).setPropertyDefinitions(`value`.let(IResolvable::unwrap))
  }

  public open fun propertyDefinitions(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setPropertyDefinitions(__item_ac66f0)
  }

  public open fun propertyGroups(): Any? = unwrap(this).getPropertyGroups()

  public open fun propertyGroups(`value`: IResolvable) {
    unwrap(this).setPropertyGroups(`value`.let(IResolvable::unwrap))
  }

  public open fun propertyGroups(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setPropertyGroups(__item_ac66f0)
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
    public fun componentTypeId(componentTypeId: String)

    public fun compositeComponentTypes(compositeComponentTypes: IResolvable)

    public fun compositeComponentTypes(compositeComponentTypes: Map<String, Any>)

    public fun description(description: String)

    public fun extendsFrom(extendsFrom: List<String>)

    public fun functions(functions: IResolvable)

    public fun functions(functions: Map<String, Any>)

    public fun isSingleton(isSingleton: Boolean)

    public fun isSingleton(isSingleton: IResolvable)

    public fun propertyDefinitions(propertyDefinitions: IResolvable)

    public fun propertyDefinitions(propertyDefinitions: Map<String, Any>)

    public fun propertyGroups(propertyGroups: IResolvable)

    public fun propertyGroups(propertyGroups: Map<String, Any>)

    public fun tags(tags: Map<String, String>)

    public fun workspaceId(workspaceId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.Builder =
        software.amazon.awscdk.services.iottwinmaker.CfnComponentType.Builder.create(scope, id)

    override fun componentTypeId(componentTypeId: String) {
      cdkBuilder.componentTypeId(componentTypeId)
    }

    override fun compositeComponentTypes(compositeComponentTypes: IResolvable) {
      cdkBuilder.compositeComponentTypes(compositeComponentTypes.let(IResolvable::unwrap))
    }

    override fun compositeComponentTypes(compositeComponentTypes: Map<String, Any>) {
      cdkBuilder.compositeComponentTypes(compositeComponentTypes)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun extendsFrom(extendsFrom: List<String>) {
      cdkBuilder.extendsFrom(extendsFrom)
    }

    override fun functions(functions: IResolvable) {
      cdkBuilder.functions(functions.let(IResolvable::unwrap))
    }

    override fun functions(functions: Map<String, Any>) {
      cdkBuilder.functions(functions)
    }

    override fun isSingleton(isSingleton: Boolean) {
      cdkBuilder.isSingleton(isSingleton)
    }

    override fun isSingleton(isSingleton: IResolvable) {
      cdkBuilder.isSingleton(isSingleton.let(IResolvable::unwrap))
    }

    override fun propertyDefinitions(propertyDefinitions: IResolvable) {
      cdkBuilder.propertyDefinitions(propertyDefinitions.let(IResolvable::unwrap))
    }

    override fun propertyDefinitions(propertyDefinitions: Map<String, Any>) {
      cdkBuilder.propertyDefinitions(propertyDefinitions)
    }

    override fun propertyGroups(propertyGroups: IResolvable) {
      cdkBuilder.propertyGroups(propertyGroups.let(IResolvable::unwrap))
    }

    override fun propertyGroups(propertyGroups: Map<String, Any>) {
      cdkBuilder.propertyGroups(propertyGroups)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun workspaceId(workspaceId: String) {
      cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnComponentType =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnComponentType {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnComponentType(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType):
        CfnComponentType = CfnComponentType(cdkObject)

    internal fun unwrap(wrapped: CfnComponentType):
        software.amazon.awscdk.services.iottwinmaker.CfnComponentType = wrapped.cdkObject
  }

  public interface DataTypeProperty {
    public fun allowedValues(): Any? = unwrap(this).getAllowedValues()

    public fun nestedType(): Any? = unwrap(this).getNestedType()

    public fun relationship(): Any? = unwrap(this).getRelationship()

    public fun type(): String

    public fun unitOfMeasure(): String? = unwrap(this).getUnitOfMeasure()

    public interface Builder {
      public fun allowedValues(allowedValues: IResolvable)

      public fun allowedValues(allowedValues: List<Any>)

      public fun nestedType(nestedType: IResolvable)

      public fun nestedType(nestedType: DataTypeProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bfe133e2c7fcbca7a83015bb27ecc54401b187a48dd5d74d06a1b7ac56a6453a")
      public fun nestedType(nestedType: Builder.() -> Unit)

      public fun relationship(relationship: IResolvable)

      public fun relationship(relationship: RelationshipProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0b3230dbda65bc95420cf13c1baa0a1948c9afdbda83a81b9e4863bf10a88195")
      public fun relationship(relationship: RelationshipProperty.Builder.() -> Unit)

      public fun type(type: String)

      public fun unitOfMeasure(unitOfMeasure: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataTypeProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataTypeProperty.builder()

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
      @JvmName("bfe133e2c7fcbca7a83015bb27ecc54401b187a48dd5d74d06a1b7ac56a6453a")
      override fun nestedType(nestedType: Builder.() -> Unit): Unit =
          nestedType(DataTypeProperty(nestedType))

      override fun relationship(relationship: IResolvable) {
        cdkBuilder.relationship(relationship.let(IResolvable::unwrap))
      }

      override fun relationship(relationship: RelationshipProperty) {
        cdkBuilder.relationship(relationship.let(RelationshipProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0b3230dbda65bc95420cf13c1baa0a1948c9afdbda83a81b9e4863bf10a88195")
      override fun relationship(relationship: RelationshipProperty.Builder.() -> Unit): Unit =
          relationship(RelationshipProperty(relationship))

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun unitOfMeasure(unitOfMeasure: String) {
        cdkBuilder.unitOfMeasure(unitOfMeasure)
      }

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataTypeProperty,
    ) : DataTypeProperty {
      override fun allowedValues(): Any? = unwrap(this).getAllowedValues()

      override fun nestedType(): Any? = unwrap(this).getNestedType()

      override fun relationship(): Any? = unwrap(this).getRelationship()

      override fun type(): String = unwrap(this).getType()

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
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataTypeProperty):
          DataTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataTypeProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataTypeProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface DataConnectorProperty {
    public fun isNative(): Any? = unwrap(this).getIsNative()

    public fun lambda(): Any? = unwrap(this).getLambda()

    public interface Builder {
      public fun isNative(isNative: Boolean)

      public fun isNative(isNative: IResolvable)

      public fun lambda(lambda: IResolvable)

      public fun lambda(lambda: LambdaFunctionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c08dd89d97d10c457ef20497f73349df65683ec17c5ab8a3e5c781165cef3ef5")
      public fun lambda(lambda: LambdaFunctionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataConnectorProperty.Builder
          =
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataConnectorProperty.builder()

      override fun isNative(isNative: Boolean) {
        cdkBuilder.isNative(isNative)
      }

      override fun isNative(isNative: IResolvable) {
        cdkBuilder.isNative(isNative.let(IResolvable::unwrap))
      }

      override fun lambda(lambda: IResolvable) {
        cdkBuilder.lambda(lambda.let(IResolvable::unwrap))
      }

      override fun lambda(lambda: LambdaFunctionProperty) {
        cdkBuilder.lambda(lambda.let(LambdaFunctionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c08dd89d97d10c457ef20497f73349df65683ec17c5ab8a3e5c781165cef3ef5")
      override fun lambda(lambda: LambdaFunctionProperty.Builder.() -> Unit): Unit =
          lambda(LambdaFunctionProperty(lambda))

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataConnectorProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataConnectorProperty,
    ) : DataConnectorProperty {
      override fun isNative(): Any? = unwrap(this).getIsNative()

      override fun lambda(): Any? = unwrap(this).getLambda()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataConnectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataConnectorProperty):
          DataConnectorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataConnectorProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataConnectorProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface LambdaFunctionProperty {
    public fun arn(): String

    public interface Builder {
      public fun arn(arn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.LambdaFunctionProperty.Builder
          =
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.LambdaFunctionProperty.builder()

      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.LambdaFunctionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.LambdaFunctionProperty,
    ) : LambdaFunctionProperty {
      override fun arn(): String = unwrap(this).getArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaFunctionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.LambdaFunctionProperty):
          LambdaFunctionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaFunctionProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.LambdaFunctionProperty =
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
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.PropertyGroupProperty.Builder
          =
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.PropertyGroupProperty.builder()

      override fun groupType(groupType: String) {
        cdkBuilder.groupType(groupType)
      }

      override fun propertyNames(propertyNames: List<String>) {
        cdkBuilder.propertyNames(propertyNames)
      }

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.PropertyGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.PropertyGroupProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.PropertyGroupProperty):
          PropertyGroupProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PropertyGroupProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.PropertyGroupProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CompositeComponentTypeProperty {
    public fun componentTypeId(): String? = unwrap(this).getComponentTypeId()

    public interface Builder {
      public fun componentTypeId(componentTypeId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.CompositeComponentTypeProperty.Builder
          =
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.CompositeComponentTypeProperty.builder()

      override fun componentTypeId(componentTypeId: String) {
        cdkBuilder.componentTypeId(componentTypeId)
      }

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.CompositeComponentTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.CompositeComponentTypeProperty,
    ) : CompositeComponentTypeProperty {
      override fun componentTypeId(): String? = unwrap(this).getComponentTypeId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CompositeComponentTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.CompositeComponentTypeProperty):
          CompositeComponentTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CompositeComponentTypeProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.CompositeComponentTypeProperty
          = (wrapped as Wrapper).cdkObject
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
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.ErrorProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.ErrorProperty.builder()

      override fun code(code: String) {
        cdkBuilder.code(code)
      }

      override fun message(message: String) {
        cdkBuilder.message(message)
      }

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.ErrorProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.ErrorProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.ErrorProperty):
          ErrorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ErrorProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.ErrorProperty = (wrapped as
          Wrapper).cdkObject
    }
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
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.RelationshipValueProperty.Builder
          =
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.RelationshipValueProperty.builder()

      override fun targetComponentName(targetComponentName: String) {
        cdkBuilder.targetComponentName(targetComponentName)
      }

      override fun targetEntityId(targetEntityId: String) {
        cdkBuilder.targetEntityId(targetEntityId)
      }

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.RelationshipValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.RelationshipValueProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.RelationshipValueProperty):
          RelationshipValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RelationshipValueProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.RelationshipValueProperty =
          (wrapped as Wrapper).cdkObject
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
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataValueProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataValueProperty.builder()

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

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataValueProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataValueProperty):
          DataValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataValueProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataValueProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface StatusProperty {
    public fun error(): Any? = unwrap(this).getError()

    public fun state(): String? = unwrap(this).getState()

    public interface Builder {
      public fun error(error: IResolvable)

      public fun error(error: ErrorProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8675338aefb17618022ff9c2a24e31a302ab5639e4f2a99e0f3b38a71943d292")
      public fun error(error: ErrorProperty.Builder.() -> Unit)

      public fun state(state: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.StatusProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.StatusProperty.builder()

      override fun error(error: IResolvable) {
        cdkBuilder.error(error.let(IResolvable::unwrap))
      }

      override fun error(error: ErrorProperty) {
        cdkBuilder.error(error.let(ErrorProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8675338aefb17618022ff9c2a24e31a302ab5639e4f2a99e0f3b38a71943d292")
      override fun error(error: ErrorProperty.Builder.() -> Unit): Unit =
          error(ErrorProperty(error))

      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.StatusProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.StatusProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.StatusProperty):
          StatusProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatusProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.StatusProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FunctionProperty {
    public fun implementedBy(): Any? = unwrap(this).getImplementedBy()

    public fun requiredProperties(): List<String> = unwrap(this).getRequiredProperties() ?:
        emptyList()

    public fun scope(): String? = unwrap(this).getScope()

    public interface Builder {
      public fun implementedBy(implementedBy: IResolvable)

      public fun implementedBy(implementedBy: DataConnectorProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1aee36c263610b41f33fb7dfe9d54a34f2eeaa62661e4a28130c31e38a4323fd")
      public fun implementedBy(implementedBy: DataConnectorProperty.Builder.() -> Unit)

      public fun requiredProperties(requiredProperties: List<String>)

      public fun scope(scope: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.FunctionProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.FunctionProperty.builder()

      override fun implementedBy(implementedBy: IResolvable) {
        cdkBuilder.implementedBy(implementedBy.let(IResolvable::unwrap))
      }

      override fun implementedBy(implementedBy: DataConnectorProperty) {
        cdkBuilder.implementedBy(implementedBy.let(DataConnectorProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1aee36c263610b41f33fb7dfe9d54a34f2eeaa62661e4a28130c31e38a4323fd")
      override fun implementedBy(implementedBy: DataConnectorProperty.Builder.() -> Unit): Unit =
          implementedBy(DataConnectorProperty(implementedBy))

      override fun requiredProperties(requiredProperties: List<String>) {
        cdkBuilder.requiredProperties(requiredProperties)
      }

      override fun scope(scope: String) {
        cdkBuilder.scope(scope)
      }

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.FunctionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.FunctionProperty,
    ) : FunctionProperty {
      override fun implementedBy(): Any? = unwrap(this).getImplementedBy()

      override fun requiredProperties(): List<String> = unwrap(this).getRequiredProperties() ?:
          emptyList()

      override fun scope(): String? = unwrap(this).getScope()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FunctionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.FunctionProperty):
          FunctionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FunctionProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.FunctionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface PropertyDefinitionProperty {
    public fun configurations(): Any? = unwrap(this).getConfigurations()

    public fun dataType(): Any? = unwrap(this).getDataType()

    public fun defaultValue(): Any? = unwrap(this).getDefaultValue()

    public fun isExternalId(): Any? = unwrap(this).getIsExternalId()

    public fun isRequiredInEntity(): Any? = unwrap(this).getIsRequiredInEntity()

    public fun isStoredExternally(): Any? = unwrap(this).getIsStoredExternally()

    public fun isTimeSeries(): Any? = unwrap(this).getIsTimeSeries()

    public interface Builder {
      public fun configurations(configurations: IResolvable)

      public fun configurations(configurations: Map<String, String>)

      public fun dataType(dataType: IResolvable)

      public fun dataType(dataType: DataTypeProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e0c970d0a023254c5d84488daa2bf517714d1d3bde253bb30ccdd5e69dd9a943")
      public fun dataType(dataType: DataTypeProperty.Builder.() -> Unit)

      public fun defaultValue(defaultValue: IResolvable)

      public fun defaultValue(defaultValue: DataValueProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06d64c68435ccc2367aabc04976125c24d8f12ccafd6c3ee7df5753c81071108")
      public fun defaultValue(defaultValue: DataValueProperty.Builder.() -> Unit)

      public fun isExternalId(isExternalId: Boolean)

      public fun isExternalId(isExternalId: IResolvable)

      public fun isRequiredInEntity(isRequiredInEntity: Boolean)

      public fun isRequiredInEntity(isRequiredInEntity: IResolvable)

      public fun isStoredExternally(isStoredExternally: Boolean)

      public fun isStoredExternally(isStoredExternally: IResolvable)

      public fun isTimeSeries(isTimeSeries: Boolean)

      public fun isTimeSeries(isTimeSeries: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.PropertyDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.PropertyDefinitionProperty.builder()

      override fun configurations(configurations: IResolvable) {
        cdkBuilder.configurations(configurations.let(IResolvable::unwrap))
      }

      override fun configurations(configurations: Map<String, String>) {
        cdkBuilder.configurations(configurations)
      }

      override fun dataType(dataType: IResolvable) {
        cdkBuilder.dataType(dataType.let(IResolvable::unwrap))
      }

      override fun dataType(dataType: DataTypeProperty) {
        cdkBuilder.dataType(dataType.let(DataTypeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e0c970d0a023254c5d84488daa2bf517714d1d3bde253bb30ccdd5e69dd9a943")
      override fun dataType(dataType: DataTypeProperty.Builder.() -> Unit): Unit =
          dataType(DataTypeProperty(dataType))

      override fun defaultValue(defaultValue: IResolvable) {
        cdkBuilder.defaultValue(defaultValue.let(IResolvable::unwrap))
      }

      override fun defaultValue(defaultValue: DataValueProperty) {
        cdkBuilder.defaultValue(defaultValue.let(DataValueProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06d64c68435ccc2367aabc04976125c24d8f12ccafd6c3ee7df5753c81071108")
      override fun defaultValue(defaultValue: DataValueProperty.Builder.() -> Unit): Unit =
          defaultValue(DataValueProperty(defaultValue))

      override fun isExternalId(isExternalId: Boolean) {
        cdkBuilder.isExternalId(isExternalId)
      }

      override fun isExternalId(isExternalId: IResolvable) {
        cdkBuilder.isExternalId(isExternalId.let(IResolvable::unwrap))
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

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.PropertyDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.PropertyDefinitionProperty,
    ) : PropertyDefinitionProperty {
      override fun configurations(): Any? = unwrap(this).getConfigurations()

      override fun dataType(): Any? = unwrap(this).getDataType()

      override fun defaultValue(): Any? = unwrap(this).getDefaultValue()

      override fun isExternalId(): Any? = unwrap(this).getIsExternalId()

      override fun isRequiredInEntity(): Any? = unwrap(this).getIsRequiredInEntity()

      override fun isStoredExternally(): Any? = unwrap(this).getIsStoredExternally()

      override fun isTimeSeries(): Any? = unwrap(this).getIsTimeSeries()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PropertyDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.PropertyDefinitionProperty):
          PropertyDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PropertyDefinitionProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.PropertyDefinitionProperty =
          (wrapped as Wrapper).cdkObject
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
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.RelationshipProperty.Builder
          =
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.RelationshipProperty.builder()

      override fun relationshipType(relationshipType: String) {
        cdkBuilder.relationshipType(relationshipType)
      }

      override fun targetComponentTypeId(targetComponentTypeId: String) {
        cdkBuilder.targetComponentTypeId(targetComponentTypeId)
      }

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.RelationshipProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.RelationshipProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.RelationshipProperty):
          RelationshipProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RelationshipProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.RelationshipProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
