package io.cloudshiftdev.awscdk.services.datapipeline

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPipeline internal constructor(
  private val cdkObject: software.amazon.awscdk.services.datapipeline.CfnPipeline,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun activate(): Any? = unwrap(this).getActivate()

  public open fun activate(`value`: Boolean) {
    unwrap(this).setActivate(`value`)
  }

  public open fun activate(`value`: IResolvable) {
    unwrap(this).setActivate(`value`.let(IResolvable::unwrap))
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrPipelineId(): String = unwrap(this).getAttrPipelineId()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun parameterObjects(): Any? = unwrap(this).getParameterObjects()

  public open fun parameterObjects(`value`: IResolvable) {
    unwrap(this).setParameterObjects(`value`.let(IResolvable::unwrap))
  }

  public open fun parameterObjects(__idx_ac66f0: List<Any>) {
    unwrap(this).setParameterObjects(__idx_ac66f0)
  }

  public open fun parameterObjects(vararg __idx_ac66f0: Any): Unit =
      parameterObjects(__idx_ac66f0.toList())

  public open fun parameterValues(): Any? = unwrap(this).getParameterValues()

  public open fun parameterValues(`value`: IResolvable) {
    unwrap(this).setParameterValues(`value`.let(IResolvable::unwrap))
  }

  public open fun parameterValues(__idx_ac66f0: List<Any>) {
    unwrap(this).setParameterValues(__idx_ac66f0)
  }

  public open fun parameterValues(vararg __idx_ac66f0: Any): Unit =
      parameterValues(__idx_ac66f0.toList())

  public open fun pipelineObjects(): Any? = unwrap(this).getPipelineObjects()

  public open fun pipelineObjects(`value`: IResolvable) {
    unwrap(this).setPipelineObjects(`value`.let(IResolvable::unwrap))
  }

  public open fun pipelineObjects(__idx_ac66f0: List<Any>) {
    unwrap(this).setPipelineObjects(__idx_ac66f0)
  }

  public open fun pipelineObjects(vararg __idx_ac66f0: Any): Unit =
      pipelineObjects(__idx_ac66f0.toList())

  public open fun pipelineTags(): List<PipelineTagProperty> =
      unwrap(this).getPipelineTags()?.map(PipelineTagProperty::wrap) ?: emptyList()

  public open fun pipelineTags(`value`: List<PipelineTagProperty>) {
    unwrap(this).setPipelineTags(`value`.map(PipelineTagProperty::unwrap))
  }

  public open fun pipelineTags(vararg `value`: PipelineTagProperty): Unit =
      pipelineTags(`value`.toList())

  public interface Builder {
    public fun activate(activate: Boolean)

    public fun activate(activate: IResolvable)

    public fun description(description: String)

    public fun name(name: String)

    public fun parameterObjects(parameterObjects: IResolvable)

    public fun parameterObjects(parameterObjects: List<Any>)

    public fun parameterObjects(vararg parameterObjects: Any)

    public fun parameterValues(parameterValues: IResolvable)

    public fun parameterValues(parameterValues: List<Any>)

    public fun parameterValues(vararg parameterValues: Any)

    public fun pipelineObjects(pipelineObjects: IResolvable)

    public fun pipelineObjects(pipelineObjects: List<Any>)

    public fun pipelineObjects(vararg pipelineObjects: Any)

    public fun pipelineTags(pipelineTags: List<PipelineTagProperty>)

    public fun pipelineTags(vararg pipelineTags: PipelineTagProperty)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datapipeline.CfnPipeline.Builder =
        software.amazon.awscdk.services.datapipeline.CfnPipeline.Builder.create(scope, id)

    override fun activate(activate: Boolean) {
      cdkBuilder.activate(activate)
    }

    override fun activate(activate: IResolvable) {
      cdkBuilder.activate(activate.let(IResolvable::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun parameterObjects(parameterObjects: IResolvable) {
      cdkBuilder.parameterObjects(parameterObjects.let(IResolvable::unwrap))
    }

    override fun parameterObjects(parameterObjects: List<Any>) {
      cdkBuilder.parameterObjects(parameterObjects)
    }

    override fun parameterObjects(vararg parameterObjects: Any): Unit =
        parameterObjects(parameterObjects.toList())

    override fun parameterValues(parameterValues: IResolvable) {
      cdkBuilder.parameterValues(parameterValues.let(IResolvable::unwrap))
    }

    override fun parameterValues(parameterValues: List<Any>) {
      cdkBuilder.parameterValues(parameterValues)
    }

    override fun parameterValues(vararg parameterValues: Any): Unit =
        parameterValues(parameterValues.toList())

    override fun pipelineObjects(pipelineObjects: IResolvable) {
      cdkBuilder.pipelineObjects(pipelineObjects.let(IResolvable::unwrap))
    }

    override fun pipelineObjects(pipelineObjects: List<Any>) {
      cdkBuilder.pipelineObjects(pipelineObjects)
    }

    override fun pipelineObjects(vararg pipelineObjects: Any): Unit =
        pipelineObjects(pipelineObjects.toList())

    override fun pipelineTags(pipelineTags: List<PipelineTagProperty>) {
      cdkBuilder.pipelineTags(pipelineTags.map(PipelineTagProperty::unwrap))
    }

    override fun pipelineTags(vararg pipelineTags: PipelineTagProperty): Unit =
        pipelineTags(pipelineTags.toList())

    public fun build(): software.amazon.awscdk.services.datapipeline.CfnPipeline =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPipeline {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPipeline(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datapipeline.CfnPipeline):
        CfnPipeline = CfnPipeline(cdkObject)

    internal fun unwrap(wrapped: CfnPipeline):
        software.amazon.awscdk.services.datapipeline.CfnPipeline = wrapped.cdkObject
  }

  public interface ParameterObjectProperty {
    public fun attributes(): Any

    public fun id(): String

    public interface Builder {
      public fun attributes(attributes: IResolvable)

      public fun attributes(attributes: List<Any>)

      public fun attributes(vararg attributes: Any)

      public fun id(id: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterObjectProperty.Builder =
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterObjectProperty.builder()

      override fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
      }

      override fun attributes(attributes: List<Any>) {
        cdkBuilder.attributes(attributes)
      }

      override fun attributes(vararg attributes: Any): Unit = attributes(attributes.toList())

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public fun build():
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterObjectProperty,
    ) : ParameterObjectProperty {
      override fun attributes(): Any = unwrap(this).getAttributes()

      override fun id(): String = unwrap(this).getId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ParameterObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterObjectProperty):
          ParameterObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParameterObjectProperty):
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterObjectProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ParameterValueProperty {
    public fun id(): String

    public fun stringValue(): String

    public interface Builder {
      public fun id(id: String)

      public fun stringValue(stringValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterValueProperty.Builder =
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterValueProperty.builder()

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
      }

      public fun build():
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterValueProperty,
    ) : ParameterValueProperty {
      override fun id(): String = unwrap(this).getId()

      override fun stringValue(): String = unwrap(this).getStringValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ParameterValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterValueProperty):
          ParameterValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParameterValueProperty):
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterValueProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface PipelineObjectProperty {
    public fun fields(): Any

    public fun id(): String

    public fun name(): String

    public interface Builder {
      public fun fields(fields: IResolvable)

      public fun fields(fields: List<Any>)

      public fun fields(vararg fields: Any)

      public fun id(id: String)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineObjectProperty.Builder =
          software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineObjectProperty.builder()

      override fun fields(fields: IResolvable) {
        cdkBuilder.fields(fields.let(IResolvable::unwrap))
      }

      override fun fields(fields: List<Any>) {
        cdkBuilder.fields(fields)
      }

      override fun fields(vararg fields: Any): Unit = fields(fields.toList())

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineObjectProperty,
    ) : PipelineObjectProperty {
      override fun fields(): Any = unwrap(this).getFields()

      override fun id(): String = unwrap(this).getId()

      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PipelineObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineObjectProperty):
          PipelineObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipelineObjectProperty):
          software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineObjectProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ParameterAttributeProperty {
    public fun key(): String

    public fun stringValue(): String

    public interface Builder {
      public fun key(key: String)

      public fun stringValue(stringValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterAttributeProperty.Builder
          =
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterAttributeProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
      }

      public fun build():
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterAttributeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterAttributeProperty,
    ) : ParameterAttributeProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun stringValue(): String = unwrap(this).getStringValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ParameterAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterAttributeProperty):
          ParameterAttributeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParameterAttributeProperty):
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterAttributeProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PipelineTagProperty {
    public fun key(): String

    public fun `value`(): String

    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineTagProperty.Builder =
          software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineTagProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineTagProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineTagProperty,
    ) : PipelineTagProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PipelineTagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineTagProperty):
          PipelineTagProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipelineTagProperty):
          software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineTagProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FieldProperty {
    public fun key(): String

    public fun refValue(): String? = unwrap(this).getRefValue()

    public fun stringValue(): String? = unwrap(this).getStringValue()

    public interface Builder {
      public fun key(key: String)

      public fun refValue(refValue: String)

      public fun stringValue(stringValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datapipeline.CfnPipeline.FieldProperty.Builder =
          software.amazon.awscdk.services.datapipeline.CfnPipeline.FieldProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun refValue(refValue: String) {
        cdkBuilder.refValue(refValue)
      }

      override fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
      }

      public fun build(): software.amazon.awscdk.services.datapipeline.CfnPipeline.FieldProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datapipeline.CfnPipeline.FieldProperty,
    ) : FieldProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun refValue(): String? = unwrap(this).getRefValue()

      override fun stringValue(): String? = unwrap(this).getStringValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FieldProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datapipeline.CfnPipeline.FieldProperty):
          FieldProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldProperty):
          software.amazon.awscdk.services.datapipeline.CfnPipeline.FieldProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
