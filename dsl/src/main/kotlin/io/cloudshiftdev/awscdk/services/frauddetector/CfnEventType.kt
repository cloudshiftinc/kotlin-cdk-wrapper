package io.cloudshiftdev.awscdk.services.frauddetector

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEventType internal constructor(
  private val cdkObject: software.amazon.awscdk.services.frauddetector.CfnEventType,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

  public open fun attrLastUpdatedTime(): String = unwrap(this).getAttrLastUpdatedTime()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun entityTypes(): Any = unwrap(this).getEntityTypes()

  public open fun entityTypes(`value`: IResolvable) {
    unwrap(this).setEntityTypes(`value`.let(IResolvable::unwrap))
  }

  public open fun entityTypes(__idx_ac66f0: List<Any>) {
    unwrap(this).setEntityTypes(__idx_ac66f0)
  }

  public open fun eventVariables(): Any = unwrap(this).getEventVariables()

  public open fun eventVariables(`value`: IResolvable) {
    unwrap(this).setEventVariables(`value`.let(IResolvable::unwrap))
  }

  public open fun eventVariables(__idx_ac66f0: List<Any>) {
    unwrap(this).setEventVariables(__idx_ac66f0)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun labels(): Any = unwrap(this).getLabels()

  public open fun labels(`value`: IResolvable) {
    unwrap(this).setLabels(`value`.let(IResolvable::unwrap))
  }

  public open fun labels(__idx_ac66f0: List<Any>) {
    unwrap(this).setLabels(__idx_ac66f0)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun description(description: String) {
    }

    public fun entityTypes(entityTypes: IResolvable) {
    }

    public fun entityTypes(entityTypes: List<Any>) {
    }

    public fun eventVariables(eventVariables: IResolvable) {
    }

    public fun eventVariables(eventVariables: List<Any>) {
    }

    public fun labels(labels: IResolvable) {
    }

    public fun labels(labels: List<Any>) {
    }

    public fun name(name: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.frauddetector.CfnEventType.Builder =
        software.amazon.awscdk.services.frauddetector.CfnEventType.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun entityTypes(entityTypes: IResolvable) {
      cdkBuilder.entityTypes(entityTypes.let(IResolvable::unwrap))
    }

    public override fun entityTypes(entityTypes: List<Any>) {
      cdkBuilder.entityTypes(entityTypes)
    }

    public override fun eventVariables(eventVariables: IResolvable) {
      cdkBuilder.eventVariables(eventVariables.let(IResolvable::unwrap))
    }

    public override fun eventVariables(eventVariables: List<Any>) {
      cdkBuilder.eventVariables(eventVariables)
    }

    public override fun labels(labels: IResolvable) {
      cdkBuilder.labels(labels.let(IResolvable::unwrap))
    }

    public override fun labels(labels: List<Any>) {
      cdkBuilder.labels(labels)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.frauddetector.CfnEventType =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEventType {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEventType(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnEventType):
        CfnEventType = CfnEventType(cdkObject)

    internal fun unwrap(wrapped: CfnEventType):
        software.amazon.awscdk.services.frauddetector.CfnEventType = wrapped.cdkObject
  }

  public interface LabelProperty {
    public fun arn(): String? = unwrap(this).getArn()

    public fun createdTime(): String? = unwrap(this).getCreatedTime()

    public fun description(): String? = unwrap(this).getDescription()

    public fun `inline`(): Any? = unwrap(this).getInline()

    public fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

    public fun name(): String? = unwrap(this).getName()

    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    public interface Builder {
      public fun arn(arn: String) {
      }

      public fun createdTime(createdTime: String) {
      }

      public fun description(description: String) {
      }

      public fun `inline`(`inline`: Boolean) {
      }

      public fun `inline`(`inline`: IResolvable) {
      }

      public fun lastUpdatedTime(lastUpdatedTime: String) {
      }

      public fun name(name: String) {
      }

      public fun tags(tags: List<CfnTag>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.frauddetector.CfnEventType.LabelProperty.Builder =
          software.amazon.awscdk.services.frauddetector.CfnEventType.LabelProperty.builder()

      public override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public override fun createdTime(createdTime: String) {
        cdkBuilder.createdTime(createdTime)
      }

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun `inline`(`inline`: Boolean) {
        cdkBuilder.`inline`(`inline`)
      }

      public override fun `inline`(`inline`: IResolvable) {
        cdkBuilder.`inline`(`inline`.let(IResolvable::unwrap))
      }

      public override fun lastUpdatedTime(lastUpdatedTime: String) {
        cdkBuilder.lastUpdatedTime(lastUpdatedTime)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.frauddetector.CfnEventType.LabelProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.frauddetector.CfnEventType.LabelProperty,
    ) : LabelProperty {
      public override fun arn(): String? = unwrap(this).getArn()

      public override fun createdTime(): String? = unwrap(this).getCreatedTime()

      public override fun description(): String? = unwrap(this).getDescription()

      public override fun `inline`(): Any? = unwrap(this).getInline()

      public override fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

      public override fun name(): String? = unwrap(this).getName()

      public override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LabelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnEventType.LabelProperty):
          LabelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LabelProperty):
          software.amazon.awscdk.services.frauddetector.CfnEventType.LabelProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EntityTypeProperty {
    public fun arn(): String? = unwrap(this).getArn()

    public fun createdTime(): String? = unwrap(this).getCreatedTime()

    public fun description(): String? = unwrap(this).getDescription()

    public fun `inline`(): Any? = unwrap(this).getInline()

    public fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

    public fun name(): String? = unwrap(this).getName()

    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    public interface Builder {
      public fun arn(arn: String) {
      }

      public fun createdTime(createdTime: String) {
      }

      public fun description(description: String) {
      }

      public fun `inline`(`inline`: Boolean) {
      }

      public fun `inline`(`inline`: IResolvable) {
      }

      public fun lastUpdatedTime(lastUpdatedTime: String) {
      }

      public fun name(name: String) {
      }

      public fun tags(tags: List<CfnTag>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.frauddetector.CfnEventType.EntityTypeProperty.Builder =
          software.amazon.awscdk.services.frauddetector.CfnEventType.EntityTypeProperty.builder()

      public override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public override fun createdTime(createdTime: String) {
        cdkBuilder.createdTime(createdTime)
      }

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun `inline`(`inline`: Boolean) {
        cdkBuilder.`inline`(`inline`)
      }

      public override fun `inline`(`inline`: IResolvable) {
        cdkBuilder.`inline`(`inline`.let(IResolvable::unwrap))
      }

      public override fun lastUpdatedTime(lastUpdatedTime: String) {
        cdkBuilder.lastUpdatedTime(lastUpdatedTime)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.frauddetector.CfnEventType.EntityTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.frauddetector.CfnEventType.EntityTypeProperty,
    ) : EntityTypeProperty {
      public override fun arn(): String? = unwrap(this).getArn()

      public override fun createdTime(): String? = unwrap(this).getCreatedTime()

      public override fun description(): String? = unwrap(this).getDescription()

      public override fun `inline`(): Any? = unwrap(this).getInline()

      public override fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

      public override fun name(): String? = unwrap(this).getName()

      public override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EntityTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnEventType.EntityTypeProperty):
          EntityTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EntityTypeProperty):
          software.amazon.awscdk.services.frauddetector.CfnEventType.EntityTypeProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface EventVariableProperty {
    public fun arn(): String? = unwrap(this).getArn()

    public fun createdTime(): String? = unwrap(this).getCreatedTime()

    public fun dataSource(): String? = unwrap(this).getDataSource()

    public fun dataType(): String? = unwrap(this).getDataType()

    public fun defaultValue(): String? = unwrap(this).getDefaultValue()

    public fun description(): String? = unwrap(this).getDescription()

    public fun `inline`(): Any? = unwrap(this).getInline()

    public fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

    public fun name(): String? = unwrap(this).getName()

    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    public fun variableType(): String? = unwrap(this).getVariableType()

    public interface Builder {
      public fun arn(arn: String) {
      }

      public fun createdTime(createdTime: String) {
      }

      public fun dataSource(dataSource: String) {
      }

      public fun dataType(dataType: String) {
      }

      public fun defaultValue(defaultValue: String) {
      }

      public fun description(description: String) {
      }

      public fun `inline`(`inline`: Boolean) {
      }

      public fun `inline`(`inline`: IResolvable) {
      }

      public fun lastUpdatedTime(lastUpdatedTime: String) {
      }

      public fun name(name: String) {
      }

      public fun tags(tags: List<CfnTag>) {
      }

      public fun variableType(variableType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.frauddetector.CfnEventType.EventVariableProperty.Builder =
          software.amazon.awscdk.services.frauddetector.CfnEventType.EventVariableProperty.builder()

      public override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public override fun createdTime(createdTime: String) {
        cdkBuilder.createdTime(createdTime)
      }

      public override fun dataSource(dataSource: String) {
        cdkBuilder.dataSource(dataSource)
      }

      public override fun dataType(dataType: String) {
        cdkBuilder.dataType(dataType)
      }

      public override fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
      }

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun `inline`(`inline`: Boolean) {
        cdkBuilder.`inline`(`inline`)
      }

      public override fun `inline`(`inline`: IResolvable) {
        cdkBuilder.`inline`(`inline`.let(IResolvable::unwrap))
      }

      public override fun lastUpdatedTime(lastUpdatedTime: String) {
        cdkBuilder.lastUpdatedTime(lastUpdatedTime)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      public override fun variableType(variableType: String) {
        cdkBuilder.variableType(variableType)
      }

      public fun build():
          software.amazon.awscdk.services.frauddetector.CfnEventType.EventVariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.frauddetector.CfnEventType.EventVariableProperty,
    ) : EventVariableProperty {
      public override fun arn(): String? = unwrap(this).getArn()

      public override fun createdTime(): String? = unwrap(this).getCreatedTime()

      public override fun dataSource(): String? = unwrap(this).getDataSource()

      public override fun dataType(): String? = unwrap(this).getDataType()

      public override fun defaultValue(): String? = unwrap(this).getDefaultValue()

      public override fun description(): String? = unwrap(this).getDescription()

      public override fun `inline`(): Any? = unwrap(this).getInline()

      public override fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

      public override fun name(): String? = unwrap(this).getName()

      public override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?:
          emptyList()

      public override fun variableType(): String? = unwrap(this).getVariableType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EventVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnEventType.EventVariableProperty):
          EventVariableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventVariableProperty):
          software.amazon.awscdk.services.frauddetector.CfnEventType.EventVariableProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
