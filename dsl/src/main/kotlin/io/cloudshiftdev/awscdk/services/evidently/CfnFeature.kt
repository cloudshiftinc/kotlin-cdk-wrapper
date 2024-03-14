package io.cloudshiftdev.awscdk.services.evidently

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFeature internal constructor(
  private val cdkObject: software.amazon.awscdk.services.evidently.CfnFeature,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun defaultVariation(): String? = unwrap(this).getDefaultVariation()

  public open fun defaultVariation(`value`: String) {
    unwrap(this).setDefaultVariation(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun entityOverrides(): Any? = unwrap(this).getEntityOverrides()

  public open fun entityOverrides(`value`: IResolvable) {
    unwrap(this).setEntityOverrides(`value`.let(IResolvable::unwrap))
  }

  public open fun entityOverrides(__idx_ac66f0: List<Any>) {
    unwrap(this).setEntityOverrides(__idx_ac66f0)
  }

  public open fun evaluationStrategy(): String? = unwrap(this).getEvaluationStrategy()

  public open fun evaluationStrategy(`value`: String) {
    unwrap(this).setEvaluationStrategy(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun project(): String = unwrap(this).getProject()

  public open fun project(`value`: String) {
    unwrap(this).setProject(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun variations(): Any = unwrap(this).getVariations()

  public open fun variations(`value`: IResolvable) {
    unwrap(this).setVariations(`value`.let(IResolvable::unwrap))
  }

  public open fun variations(__idx_ac66f0: List<Any>) {
    unwrap(this).setVariations(__idx_ac66f0)
  }

  public interface Builder {
    public fun defaultVariation(defaultVariation: String) {
    }

    public fun description(description: String) {
    }

    public fun entityOverrides(entityOverrides: IResolvable) {
    }

    public fun entityOverrides(entityOverrides: List<Any>) {
    }

    public fun evaluationStrategy(evaluationStrategy: String) {
    }

    public fun name(name: String) {
    }

    public fun project(project: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun variations(variations: IResolvable) {
    }

    public fun variations(variations: List<Any>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.evidently.CfnFeature.Builder =
        software.amazon.awscdk.services.evidently.CfnFeature.Builder.create(scope, id)

    public override fun defaultVariation(defaultVariation: String) {
      cdkBuilder.defaultVariation(defaultVariation)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun entityOverrides(entityOverrides: IResolvable) {
      cdkBuilder.entityOverrides(entityOverrides.let(IResolvable::unwrap))
    }

    public override fun entityOverrides(entityOverrides: List<Any>) {
      cdkBuilder.entityOverrides(entityOverrides)
    }

    public override fun evaluationStrategy(evaluationStrategy: String) {
      cdkBuilder.evaluationStrategy(evaluationStrategy)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun project(project: String) {
      cdkBuilder.project(project)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun variations(variations: IResolvable) {
      cdkBuilder.variations(variations.let(IResolvable::unwrap))
    }

    public override fun variations(variations: List<Any>) {
      cdkBuilder.variations(variations)
    }

    public fun build(): software.amazon.awscdk.services.evidently.CfnFeature = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFeature {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFeature(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnFeature): CfnFeature =
        CfnFeature(cdkObject)

    internal fun unwrap(wrapped: CfnFeature): software.amazon.awscdk.services.evidently.CfnFeature =
        wrapped.cdkObject
  }

  public interface EntityOverrideProperty {
    public fun entityId(): String? = unwrap(this).getEntityId()

    public fun variation(): String? = unwrap(this).getVariation()

    public interface Builder {
      public fun entityId(entityId: String) {
      }

      public fun variation(variation: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnFeature.EntityOverrideProperty.Builder =
          software.amazon.awscdk.services.evidently.CfnFeature.EntityOverrideProperty.builder()

      public override fun entityId(entityId: String) {
        cdkBuilder.entityId(entityId)
      }

      public override fun variation(variation: String) {
        cdkBuilder.variation(variation)
      }

      public fun build():
          software.amazon.awscdk.services.evidently.CfnFeature.EntityOverrideProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.evidently.CfnFeature.EntityOverrideProperty,
    ) : EntityOverrideProperty {
      public override fun entityId(): String? = unwrap(this).getEntityId()

      public override fun variation(): String? = unwrap(this).getVariation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EntityOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnFeature.EntityOverrideProperty):
          EntityOverrideProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EntityOverrideProperty):
          software.amazon.awscdk.services.evidently.CfnFeature.EntityOverrideProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VariationObjectProperty {
    public fun booleanValue(): Any? = unwrap(this).getBooleanValue()

    public fun doubleValue(): Number? = unwrap(this).getDoubleValue()

    public fun longValue(): Number? = unwrap(this).getLongValue()

    public fun stringValue(): String? = unwrap(this).getStringValue()

    public fun variationName(): String

    public interface Builder {
      public fun booleanValue(booleanValue: Boolean) {
      }

      public fun booleanValue(booleanValue: IResolvable) {
      }

      public fun doubleValue(doubleValue: Number) {
      }

      public fun longValue(longValue: Number) {
      }

      public fun stringValue(stringValue: String) {
      }

      public fun variationName(variationName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnFeature.VariationObjectProperty.Builder =
          software.amazon.awscdk.services.evidently.CfnFeature.VariationObjectProperty.builder()

      public override fun booleanValue(booleanValue: Boolean) {
        cdkBuilder.booleanValue(booleanValue)
      }

      public override fun booleanValue(booleanValue: IResolvable) {
        cdkBuilder.booleanValue(booleanValue.let(IResolvable::unwrap))
      }

      public override fun doubleValue(doubleValue: Number) {
        cdkBuilder.doubleValue(doubleValue)
      }

      public override fun longValue(longValue: Number) {
        cdkBuilder.longValue(longValue)
      }

      public override fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
      }

      public override fun variationName(variationName: String) {
        cdkBuilder.variationName(variationName)
      }

      public fun build():
          software.amazon.awscdk.services.evidently.CfnFeature.VariationObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.evidently.CfnFeature.VariationObjectProperty,
    ) : VariationObjectProperty {
      public override fun booleanValue(): Any? = unwrap(this).getBooleanValue()

      public override fun doubleValue(): Number? = unwrap(this).getDoubleValue()

      public override fun longValue(): Number? = unwrap(this).getLongValue()

      public override fun stringValue(): String? = unwrap(this).getStringValue()

      public override fun variationName(): String = unwrap(this).getVariationName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VariationObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnFeature.VariationObjectProperty):
          VariationObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VariationObjectProperty):
          software.amazon.awscdk.services.evidently.CfnFeature.VariationObjectProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
