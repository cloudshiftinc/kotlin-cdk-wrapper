package io.cloudshiftdev.awscdk.services.iotsitewise

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

public open class CfnAssetModel internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun assetModelCompositeModels(): Any? = unwrap(this).getAssetModelCompositeModels()

  public open fun assetModelCompositeModels(`value`: IResolvable) {
    unwrap(this).setAssetModelCompositeModels(`value`.let(IResolvable::unwrap))
  }

  public open fun assetModelCompositeModels(__idx_ac66f0: List<Any>) {
    unwrap(this).setAssetModelCompositeModels(__idx_ac66f0)
  }

  public open fun assetModelCompositeModels(vararg __idx_ac66f0: Any): Unit =
      assetModelCompositeModels(__idx_ac66f0.toList())

  public open fun assetModelDescription(): String? = unwrap(this).getAssetModelDescription()

  public open fun assetModelDescription(`value`: String) {
    unwrap(this).setAssetModelDescription(`value`)
  }

  public open fun assetModelExternalId(): String? = unwrap(this).getAssetModelExternalId()

  public open fun assetModelExternalId(`value`: String) {
    unwrap(this).setAssetModelExternalId(`value`)
  }

  public open fun assetModelHierarchies(): Any? = unwrap(this).getAssetModelHierarchies()

  public open fun assetModelHierarchies(`value`: IResolvable) {
    unwrap(this).setAssetModelHierarchies(`value`.let(IResolvable::unwrap))
  }

  public open fun assetModelHierarchies(__idx_ac66f0: List<Any>) {
    unwrap(this).setAssetModelHierarchies(__idx_ac66f0)
  }

  public open fun assetModelHierarchies(vararg __idx_ac66f0: Any): Unit =
      assetModelHierarchies(__idx_ac66f0.toList())

  public open fun assetModelName(): String = unwrap(this).getAssetModelName()

  public open fun assetModelName(`value`: String) {
    unwrap(this).setAssetModelName(`value`)
  }

  public open fun assetModelProperties(): Any? = unwrap(this).getAssetModelProperties()

  public open fun assetModelProperties(`value`: IResolvable) {
    unwrap(this).setAssetModelProperties(`value`.let(IResolvable::unwrap))
  }

  public open fun assetModelProperties(__idx_ac66f0: List<Any>) {
    unwrap(this).setAssetModelProperties(__idx_ac66f0)
  }

  public open fun assetModelProperties(vararg __idx_ac66f0: Any): Unit =
      assetModelProperties(__idx_ac66f0.toList())

  public open fun assetModelType(): String? = unwrap(this).getAssetModelType()

  public open fun assetModelType(`value`: String) {
    unwrap(this).setAssetModelType(`value`)
  }

  public open fun attrAssetModelArn(): String = unwrap(this).getAttrAssetModelArn()

  public open fun attrAssetModelId(): String = unwrap(this).getAttrAssetModelId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun assetModelCompositeModels(assetModelCompositeModels: IResolvable)

    public fun assetModelCompositeModels(assetModelCompositeModels: List<Any>)

    public fun assetModelCompositeModels(vararg assetModelCompositeModels: Any)

    public fun assetModelDescription(assetModelDescription: String)

    public fun assetModelExternalId(assetModelExternalId: String)

    public fun assetModelHierarchies(assetModelHierarchies: IResolvable)

    public fun assetModelHierarchies(assetModelHierarchies: List<Any>)

    public fun assetModelHierarchies(vararg assetModelHierarchies: Any)

    public fun assetModelName(assetModelName: String)

    public fun assetModelProperties(assetModelProperties: IResolvable)

    public fun assetModelProperties(assetModelProperties: List<Any>)

    public fun assetModelProperties(vararg assetModelProperties: Any)

    public fun assetModelType(assetModelType: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.Builder =
        software.amazon.awscdk.services.iotsitewise.CfnAssetModel.Builder.create(scope, id)

    override fun assetModelCompositeModels(assetModelCompositeModels: IResolvable) {
      cdkBuilder.assetModelCompositeModels(assetModelCompositeModels.let(IResolvable::unwrap))
    }

    override fun assetModelCompositeModels(assetModelCompositeModels: List<Any>) {
      cdkBuilder.assetModelCompositeModels(assetModelCompositeModels)
    }

    override fun assetModelCompositeModels(vararg assetModelCompositeModels: Any): Unit =
        assetModelCompositeModels(assetModelCompositeModels.toList())

    override fun assetModelDescription(assetModelDescription: String) {
      cdkBuilder.assetModelDescription(assetModelDescription)
    }

    override fun assetModelExternalId(assetModelExternalId: String) {
      cdkBuilder.assetModelExternalId(assetModelExternalId)
    }

    override fun assetModelHierarchies(assetModelHierarchies: IResolvable) {
      cdkBuilder.assetModelHierarchies(assetModelHierarchies.let(IResolvable::unwrap))
    }

    override fun assetModelHierarchies(assetModelHierarchies: List<Any>) {
      cdkBuilder.assetModelHierarchies(assetModelHierarchies)
    }

    override fun assetModelHierarchies(vararg assetModelHierarchies: Any): Unit =
        assetModelHierarchies(assetModelHierarchies.toList())

    override fun assetModelName(assetModelName: String) {
      cdkBuilder.assetModelName(assetModelName)
    }

    override fun assetModelProperties(assetModelProperties: IResolvable) {
      cdkBuilder.assetModelProperties(assetModelProperties.let(IResolvable::unwrap))
    }

    override fun assetModelProperties(assetModelProperties: List<Any>) {
      cdkBuilder.assetModelProperties(assetModelProperties)
    }

    override fun assetModelProperties(vararg assetModelProperties: Any): Unit =
        assetModelProperties(assetModelProperties.toList())

    override fun assetModelType(assetModelType: String) {
      cdkBuilder.assetModelType(assetModelType)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnAssetModel =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAssetModel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAssetModel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel):
        CfnAssetModel = CfnAssetModel(cdkObject)

    internal fun unwrap(wrapped: CfnAssetModel):
        software.amazon.awscdk.services.iotsitewise.CfnAssetModel = wrapped.cdkObject
  }

  public interface TumblingWindowProperty {
    public fun interval(): String

    public fun offset(): String? = unwrap(this).getOffset()

    public interface Builder {
      public fun interval(interval: String)

      public fun offset(offset: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TumblingWindowProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TumblingWindowProperty.builder()

      override fun interval(interval: String) {
        cdkBuilder.interval(interval)
      }

      override fun offset(offset: String) {
        cdkBuilder.offset(offset)
      }

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TumblingWindowProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TumblingWindowProperty,
    ) : TumblingWindowProperty {
      override fun interval(): String = unwrap(this).getInterval()

      override fun offset(): String? = unwrap(this).getOffset()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TumblingWindowProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TumblingWindowProperty):
          TumblingWindowProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TumblingWindowProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TumblingWindowProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AssetModelPropertyProperty {
    public fun dataType(): String

    public fun dataTypeSpec(): String? = unwrap(this).getDataTypeSpec()

    public fun externalId(): String? = unwrap(this).getExternalId()

    public fun id(): String? = unwrap(this).getId()

    public fun logicalId(): String? = unwrap(this).getLogicalId()

    public fun name(): String

    public fun type(): Any

    public fun unit(): String? = unwrap(this).getUnit()

    public interface Builder {
      public fun dataType(dataType: String)

      public fun dataTypeSpec(dataTypeSpec: String)

      public fun externalId(externalId: String)

      public fun id(id: String)

      public fun logicalId(logicalId: String)

      public fun name(name: String)

      public fun type(type: IResolvable)

      public fun type(type: PropertyTypeProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b02bf400fd48dbd96fc4dc77d6dbf6839b0ec880462bf2bab2a6626dd1ae860")
      public fun type(type: PropertyTypeProperty.Builder.() -> Unit)

      public fun unit(unit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelPropertyProperty.Builder
          =
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelPropertyProperty.builder()

      override fun dataType(dataType: String) {
        cdkBuilder.dataType(dataType)
      }

      override fun dataTypeSpec(dataTypeSpec: String) {
        cdkBuilder.dataTypeSpec(dataTypeSpec)
      }

      override fun externalId(externalId: String) {
        cdkBuilder.externalId(externalId)
      }

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun logicalId(logicalId: String) {
        cdkBuilder.logicalId(logicalId)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun type(type: IResolvable) {
        cdkBuilder.type(type.let(IResolvable::unwrap))
      }

      override fun type(type: PropertyTypeProperty) {
        cdkBuilder.type(type.let(PropertyTypeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b02bf400fd48dbd96fc4dc77d6dbf6839b0ec880462bf2bab2a6626dd1ae860")
      override fun type(type: PropertyTypeProperty.Builder.() -> Unit): Unit =
          type(PropertyTypeProperty(type))

      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelPropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelPropertyProperty,
    ) : AssetModelPropertyProperty {
      override fun dataType(): String = unwrap(this).getDataType()

      override fun dataTypeSpec(): String? = unwrap(this).getDataTypeSpec()

      override fun externalId(): String? = unwrap(this).getExternalId()

      override fun id(): String? = unwrap(this).getId()

      override fun logicalId(): String? = unwrap(this).getLogicalId()

      override fun name(): String = unwrap(this).getName()

      override fun type(): Any = unwrap(this).getType()

      override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AssetModelPropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelPropertyProperty):
          AssetModelPropertyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssetModelPropertyProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelPropertyProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AssetModelCompositeModelProperty {
    public fun composedAssetModelId(): String? = unwrap(this).getComposedAssetModelId()

    public fun compositeModelProperties(): Any? = unwrap(this).getCompositeModelProperties()

    public fun description(): String? = unwrap(this).getDescription()

    public fun externalId(): String? = unwrap(this).getExternalId()

    public fun id(): String? = unwrap(this).getId()

    public fun name(): String

    public fun parentAssetModelCompositeModelExternalId(): String? =
        unwrap(this).getParentAssetModelCompositeModelExternalId()

    public fun path(): List<String> = unwrap(this).getPath() ?: emptyList()

    public fun type(): String

    public interface Builder {
      public fun composedAssetModelId(composedAssetModelId: String)

      public fun compositeModelProperties(compositeModelProperties: IResolvable)

      public fun compositeModelProperties(compositeModelProperties: List<Any>)

      public fun compositeModelProperties(vararg compositeModelProperties: Any)

      public fun description(description: String)

      public fun externalId(externalId: String)

      public fun id(id: String)

      public fun name(name: String)

      public
          fun parentAssetModelCompositeModelExternalId(parentAssetModelCompositeModelExternalId: String)

      public fun path(path: List<String>)

      public fun path(vararg path: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelCompositeModelProperty.Builder
          =
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelCompositeModelProperty.builder()

      override fun composedAssetModelId(composedAssetModelId: String) {
        cdkBuilder.composedAssetModelId(composedAssetModelId)
      }

      override fun compositeModelProperties(compositeModelProperties: IResolvable) {
        cdkBuilder.compositeModelProperties(compositeModelProperties.let(IResolvable::unwrap))
      }

      override fun compositeModelProperties(compositeModelProperties: List<Any>) {
        cdkBuilder.compositeModelProperties(compositeModelProperties)
      }

      override fun compositeModelProperties(vararg compositeModelProperties: Any): Unit =
          compositeModelProperties(compositeModelProperties.toList())

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun externalId(externalId: String) {
        cdkBuilder.externalId(externalId)
      }

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override
          fun parentAssetModelCompositeModelExternalId(parentAssetModelCompositeModelExternalId: String) {
        cdkBuilder.parentAssetModelCompositeModelExternalId(parentAssetModelCompositeModelExternalId)
      }

      override fun path(path: List<String>) {
        cdkBuilder.path(path)
      }

      override fun path(vararg path: String): Unit = path(path.toList())

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelCompositeModelProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelCompositeModelProperty,
    ) : AssetModelCompositeModelProperty {
      override fun composedAssetModelId(): String? = unwrap(this).getComposedAssetModelId()

      override fun compositeModelProperties(): Any? = unwrap(this).getCompositeModelProperties()

      override fun description(): String? = unwrap(this).getDescription()

      override fun externalId(): String? = unwrap(this).getExternalId()

      override fun id(): String? = unwrap(this).getId()

      override fun name(): String = unwrap(this).getName()

      override fun parentAssetModelCompositeModelExternalId(): String? =
          unwrap(this).getParentAssetModelCompositeModelExternalId()

      override fun path(): List<String> = unwrap(this).getPath() ?: emptyList()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AssetModelCompositeModelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelCompositeModelProperty):
          AssetModelCompositeModelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssetModelCompositeModelProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelCompositeModelProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ExpressionVariableProperty {
    public fun name(): String

    public fun `value`(): Any

    public interface Builder {
      public fun name(name: String)

      public fun `value`(`value`: IResolvable)

      public fun `value`(`value`: VariableValueProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1fe68506a7e1507283e6722d8984a214e5a03a14cbb29005f0a2a6361c396d13")
      public fun `value`(`value`: VariableValueProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.ExpressionVariableProperty.Builder
          =
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.ExpressionVariableProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable::unwrap))
      }

      override fun `value`(`value`: VariableValueProperty) {
        cdkBuilder.`value`(`value`.let(VariableValueProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1fe68506a7e1507283e6722d8984a214e5a03a14cbb29005f0a2a6361c396d13")
      override fun `value`(`value`: VariableValueProperty.Builder.() -> Unit): Unit =
          `value`(VariableValueProperty(`value`))

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.ExpressionVariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.ExpressionVariableProperty,
    ) : ExpressionVariableProperty {
      override fun name(): String = unwrap(this).getName()

      override fun `value`(): Any = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ExpressionVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.ExpressionVariableProperty):
          ExpressionVariableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExpressionVariableProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.ExpressionVariableProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MetricProperty {
    public fun expression(): String

    public fun variables(): Any

    public fun window(): Any

    public interface Builder {
      public fun expression(expression: String)

      public fun variables(variables: IResolvable)

      public fun variables(variables: List<Any>)

      public fun variables(vararg variables: Any)

      public fun window(window: IResolvable)

      public fun window(window: MetricWindowProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7fbeef7edee53ffe8864dcbc4ac9425520874cfd6a923039e871babf1bfb90c2")
      public fun window(window: MetricWindowProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricProperty.builder()

      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      override fun variables(variables: IResolvable) {
        cdkBuilder.variables(variables.let(IResolvable::unwrap))
      }

      override fun variables(variables: List<Any>) {
        cdkBuilder.variables(variables)
      }

      override fun variables(vararg variables: Any): Unit = variables(variables.toList())

      override fun window(window: IResolvable) {
        cdkBuilder.window(window.let(IResolvable::unwrap))
      }

      override fun window(window: MetricWindowProperty) {
        cdkBuilder.window(window.let(MetricWindowProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7fbeef7edee53ffe8864dcbc4ac9425520874cfd6a923039e871babf1bfb90c2")
      override fun window(window: MetricWindowProperty.Builder.() -> Unit): Unit =
          window(MetricWindowProperty(window))

      public fun build(): software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricProperty,
    ) : MetricProperty {
      override fun expression(): String = unwrap(this).getExpression()

      override fun variables(): Any = unwrap(this).getVariables()

      override fun window(): Any = unwrap(this).getWindow()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricProperty):
          MetricProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PropertyPathDefinitionProperty {
    public fun name(): String

    public interface Builder {
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyPathDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyPathDefinitionProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyPathDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyPathDefinitionProperty,
    ) : PropertyPathDefinitionProperty {
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PropertyPathDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyPathDefinitionProperty):
          PropertyPathDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PropertyPathDefinitionProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyPathDefinitionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PropertyTypeProperty {
    public fun attribute(): Any? = unwrap(this).getAttribute()

    public fun metric(): Any? = unwrap(this).getMetric()

    public fun transform(): Any? = unwrap(this).getTransform()

    public fun typeName(): String

    public interface Builder {
      public fun attribute(attribute: IResolvable)

      public fun attribute(attribute: AttributeProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("837dcafc53122be3e760e748d4174916478f69f7a41d6a3abb2c31aeabb4ecf5")
      public fun attribute(attribute: AttributeProperty.Builder.() -> Unit)

      public fun metric(metric: IResolvable)

      public fun metric(metric: MetricProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0aa67042088e7c648ef91ace7754b97fb0bb6625a0d4f0acadb45dc76cc8619f")
      public fun metric(metric: MetricProperty.Builder.() -> Unit)

      public fun transform(transform: IResolvable)

      public fun transform(transform: TransformProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("14787231582a963e96e4e44653f5cc21200d553f60fa1bf28dc98ad2ded77f58")
      public fun transform(transform: TransformProperty.Builder.() -> Unit)

      public fun typeName(typeName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyTypeProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyTypeProperty.builder()

      override fun attribute(attribute: IResolvable) {
        cdkBuilder.attribute(attribute.let(IResolvable::unwrap))
      }

      override fun attribute(attribute: AttributeProperty) {
        cdkBuilder.attribute(attribute.let(AttributeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("837dcafc53122be3e760e748d4174916478f69f7a41d6a3abb2c31aeabb4ecf5")
      override fun attribute(attribute: AttributeProperty.Builder.() -> Unit): Unit =
          attribute(AttributeProperty(attribute))

      override fun metric(metric: IResolvable) {
        cdkBuilder.metric(metric.let(IResolvable::unwrap))
      }

      override fun metric(metric: MetricProperty) {
        cdkBuilder.metric(metric.let(MetricProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0aa67042088e7c648ef91ace7754b97fb0bb6625a0d4f0acadb45dc76cc8619f")
      override fun metric(metric: MetricProperty.Builder.() -> Unit): Unit =
          metric(MetricProperty(metric))

      override fun transform(transform: IResolvable) {
        cdkBuilder.transform(transform.let(IResolvable::unwrap))
      }

      override fun transform(transform: TransformProperty) {
        cdkBuilder.transform(transform.let(TransformProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("14787231582a963e96e4e44653f5cc21200d553f60fa1bf28dc98ad2ded77f58")
      override fun transform(transform: TransformProperty.Builder.() -> Unit): Unit =
          transform(TransformProperty(transform))

      override fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
      }

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyTypeProperty,
    ) : PropertyTypeProperty {
      override fun attribute(): Any? = unwrap(this).getAttribute()

      override fun metric(): Any? = unwrap(this).getMetric()

      override fun transform(): Any? = unwrap(this).getTransform()

      override fun typeName(): String = unwrap(this).getTypeName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PropertyTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyTypeProperty):
          PropertyTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PropertyTypeProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyTypeProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface MetricWindowProperty {
    public fun tumbling(): Any? = unwrap(this).getTumbling()

    public interface Builder {
      public fun tumbling(tumbling: IResolvable)

      public fun tumbling(tumbling: TumblingWindowProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab07695551b582b00f816c66a7f2576b947182c36f6a83dfe16e32b8ea5ebfa2")
      public fun tumbling(tumbling: TumblingWindowProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricWindowProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricWindowProperty.builder()

      override fun tumbling(tumbling: IResolvable) {
        cdkBuilder.tumbling(tumbling.let(IResolvable::unwrap))
      }

      override fun tumbling(tumbling: TumblingWindowProperty) {
        cdkBuilder.tumbling(tumbling.let(TumblingWindowProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab07695551b582b00f816c66a7f2576b947182c36f6a83dfe16e32b8ea5ebfa2")
      override fun tumbling(tumbling: TumblingWindowProperty.Builder.() -> Unit): Unit =
          tumbling(TumblingWindowProperty(tumbling))

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricWindowProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricWindowProperty,
    ) : MetricWindowProperty {
      override fun tumbling(): Any? = unwrap(this).getTumbling()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricWindowProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricWindowProperty):
          MetricWindowProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricWindowProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricWindowProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface TransformProperty {
    public fun expression(): String

    public fun variables(): Any

    public interface Builder {
      public fun expression(expression: String)

      public fun variables(variables: IResolvable)

      public fun variables(variables: List<Any>)

      public fun variables(vararg variables: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TransformProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TransformProperty.builder()

      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      override fun variables(variables: IResolvable) {
        cdkBuilder.variables(variables.let(IResolvable::unwrap))
      }

      override fun variables(variables: List<Any>) {
        cdkBuilder.variables(variables)
      }

      override fun variables(vararg variables: Any): Unit = variables(variables.toList())

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TransformProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TransformProperty,
    ) : TransformProperty {
      override fun expression(): String = unwrap(this).getExpression()

      override fun variables(): Any = unwrap(this).getVariables()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TransformProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TransformProperty):
          TransformProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransformProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TransformProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AttributeProperty {
    public fun defaultValue(): String? = unwrap(this).getDefaultValue()

    public interface Builder {
      public fun defaultValue(defaultValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AttributeProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AttributeProperty.builder()

      override fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
      }

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AttributeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AttributeProperty,
    ) : AttributeProperty {
      override fun defaultValue(): String? = unwrap(this).getDefaultValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AttributeProperty):
          AttributeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributeProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AttributeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AssetModelHierarchyProperty {
    public fun childAssetModelId(): String

    public fun externalId(): String? = unwrap(this).getExternalId()

    public fun id(): String? = unwrap(this).getId()

    public fun logicalId(): String? = unwrap(this).getLogicalId()

    public fun name(): String

    public interface Builder {
      public fun childAssetModelId(childAssetModelId: String)

      public fun externalId(externalId: String)

      public fun id(id: String)

      public fun logicalId(logicalId: String)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelHierarchyProperty.Builder
          =
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelHierarchyProperty.builder()

      override fun childAssetModelId(childAssetModelId: String) {
        cdkBuilder.childAssetModelId(childAssetModelId)
      }

      override fun externalId(externalId: String) {
        cdkBuilder.externalId(externalId)
      }

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun logicalId(logicalId: String) {
        cdkBuilder.logicalId(logicalId)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelHierarchyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelHierarchyProperty,
    ) : AssetModelHierarchyProperty {
      override fun childAssetModelId(): String = unwrap(this).getChildAssetModelId()

      override fun externalId(): String? = unwrap(this).getExternalId()

      override fun id(): String? = unwrap(this).getId()

      override fun logicalId(): String? = unwrap(this).getLogicalId()

      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AssetModelHierarchyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelHierarchyProperty):
          AssetModelHierarchyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssetModelHierarchyProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelHierarchyProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface VariableValueProperty {
    public fun hierarchyExternalId(): String? = unwrap(this).getHierarchyExternalId()

    public fun hierarchyId(): String? = unwrap(this).getHierarchyId()

    public fun hierarchyLogicalId(): String? = unwrap(this).getHierarchyLogicalId()

    public fun propertyExternalId(): String? = unwrap(this).getPropertyExternalId()

    public fun propertyId(): String? = unwrap(this).getPropertyId()

    public fun propertyLogicalId(): String? = unwrap(this).getPropertyLogicalId()

    public fun propertyPath(): Any? = unwrap(this).getPropertyPath()

    public interface Builder {
      public fun hierarchyExternalId(hierarchyExternalId: String)

      public fun hierarchyId(hierarchyId: String)

      public fun hierarchyLogicalId(hierarchyLogicalId: String)

      public fun propertyExternalId(propertyExternalId: String)

      public fun propertyId(propertyId: String)

      public fun propertyLogicalId(propertyLogicalId: String)

      public fun propertyPath(propertyPath: IResolvable)

      public fun propertyPath(propertyPath: List<Any>)

      public fun propertyPath(vararg propertyPath: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.VariableValueProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.VariableValueProperty.builder()

      override fun hierarchyExternalId(hierarchyExternalId: String) {
        cdkBuilder.hierarchyExternalId(hierarchyExternalId)
      }

      override fun hierarchyId(hierarchyId: String) {
        cdkBuilder.hierarchyId(hierarchyId)
      }

      override fun hierarchyLogicalId(hierarchyLogicalId: String) {
        cdkBuilder.hierarchyLogicalId(hierarchyLogicalId)
      }

      override fun propertyExternalId(propertyExternalId: String) {
        cdkBuilder.propertyExternalId(propertyExternalId)
      }

      override fun propertyId(propertyId: String) {
        cdkBuilder.propertyId(propertyId)
      }

      override fun propertyLogicalId(propertyLogicalId: String) {
        cdkBuilder.propertyLogicalId(propertyLogicalId)
      }

      override fun propertyPath(propertyPath: IResolvable) {
        cdkBuilder.propertyPath(propertyPath.let(IResolvable::unwrap))
      }

      override fun propertyPath(propertyPath: List<Any>) {
        cdkBuilder.propertyPath(propertyPath)
      }

      override fun propertyPath(vararg propertyPath: Any): Unit =
          propertyPath(propertyPath.toList())

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.VariableValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.VariableValueProperty,
    ) : VariableValueProperty {
      override fun hierarchyExternalId(): String? = unwrap(this).getHierarchyExternalId()

      override fun hierarchyId(): String? = unwrap(this).getHierarchyId()

      override fun hierarchyLogicalId(): String? = unwrap(this).getHierarchyLogicalId()

      override fun propertyExternalId(): String? = unwrap(this).getPropertyExternalId()

      override fun propertyId(): String? = unwrap(this).getPropertyId()

      override fun propertyLogicalId(): String? = unwrap(this).getPropertyLogicalId()

      override fun propertyPath(): Any? = unwrap(this).getPropertyPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VariableValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.VariableValueProperty):
          VariableValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VariableValueProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.VariableValueProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
