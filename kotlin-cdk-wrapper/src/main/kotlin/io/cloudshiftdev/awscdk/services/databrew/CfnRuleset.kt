@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.databrew

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRuleset internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.databrew.CfnRuleset,
) : CfnResource(cdkObject), IInspectable, ITaggable {
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

  public open fun rules(): Any = unwrap(this).getRules()

  public open fun rules(`value`: IResolvable) {
    unwrap(this).setRules(`value`.let(IResolvable::unwrap))
  }

  public open fun rules(__idx_ac66f0: List<Any>) {
    unwrap(this).setRules(__idx_ac66f0)
  }

  public open fun rules(vararg __idx_ac66f0: Any): Unit = rules(__idx_ac66f0.toList())

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun targetArn(): String = unwrap(this).getTargetArn()

  public open fun targetArn(`value`: String) {
    unwrap(this).setTargetArn(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun name(name: String)

    public fun rules(rules: IResolvable)

    public fun rules(rules: List<Any>)

    public fun rules(vararg rules: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun targetArn(targetArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.databrew.CfnRuleset.Builder =
        software.amazon.awscdk.services.databrew.CfnRuleset.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun rules(rules: IResolvable) {
      cdkBuilder.rules(rules.let(IResolvable::unwrap))
    }

    override fun rules(rules: List<Any>) {
      cdkBuilder.rules(rules)
    }

    override fun rules(vararg rules: Any): Unit = rules(rules.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun targetArn(targetArn: String) {
      cdkBuilder.targetArn(targetArn)
    }

    public fun build(): software.amazon.awscdk.services.databrew.CfnRuleset = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.databrew.CfnRuleset.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRuleset {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRuleset(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRuleset): CfnRuleset =
        CfnRuleset(cdkObject)

    internal fun unwrap(wrapped: CfnRuleset): software.amazon.awscdk.services.databrew.CfnRuleset =
        wrapped.cdkObject
  }

  public interface ThresholdProperty {
    public fun type(): String? = unwrap(this).getType()

    public fun unit(): String? = unwrap(this).getUnit()

    public fun `value`(): Number

    @CdkDslMarker
    public interface Builder {
      public fun type(type: String)

      public fun unit(unit: String)

      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnRuleset.ThresholdProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnRuleset.ThresholdProperty.builder()

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnRuleset.ThresholdProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.databrew.CfnRuleset.ThresholdProperty,
    ) : CdkObject(cdkObject), ThresholdProperty {
      override fun type(): String? = unwrap(this).getType()

      override fun unit(): String? = unwrap(this).getUnit()

      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ThresholdProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRuleset.ThresholdProperty):
          ThresholdProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThresholdProperty):
          software.amazon.awscdk.services.databrew.CfnRuleset.ThresholdProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnRuleset.ThresholdProperty
    }
  }

  public interface SubstitutionValueProperty {
    public fun `value`(): String

    public fun valueReference(): String

    @CdkDslMarker
    public interface Builder {
      public fun `value`(`value`: String)

      public fun valueReference(valueReference: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnRuleset.SubstitutionValueProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnRuleset.SubstitutionValueProperty.builder()

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      override fun valueReference(valueReference: String) {
        cdkBuilder.valueReference(valueReference)
      }

      public fun build():
          software.amazon.awscdk.services.databrew.CfnRuleset.SubstitutionValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.databrew.CfnRuleset.SubstitutionValueProperty,
    ) : CdkObject(cdkObject), SubstitutionValueProperty {
      override fun `value`(): String = unwrap(this).getValue()

      override fun valueReference(): String = unwrap(this).getValueReference()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SubstitutionValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRuleset.SubstitutionValueProperty):
          SubstitutionValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubstitutionValueProperty):
          software.amazon.awscdk.services.databrew.CfnRuleset.SubstitutionValueProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnRuleset.SubstitutionValueProperty
    }
  }

  public interface ColumnSelectorProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun regex(): String? = unwrap(this).getRegex()

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun regex(regex: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnRuleset.ColumnSelectorProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnRuleset.ColumnSelectorProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun regex(regex: String) {
        cdkBuilder.regex(regex)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnRuleset.ColumnSelectorProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.databrew.CfnRuleset.ColumnSelectorProperty,
    ) : CdkObject(cdkObject), ColumnSelectorProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun regex(): String? = unwrap(this).getRegex()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ColumnSelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRuleset.ColumnSelectorProperty):
          ColumnSelectorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnSelectorProperty):
          software.amazon.awscdk.services.databrew.CfnRuleset.ColumnSelectorProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnRuleset.ColumnSelectorProperty
    }
  }

  public interface RuleProperty {
    public fun checkExpression(): String

    public fun columnSelectors(): Any? = unwrap(this).getColumnSelectors()

    public fun disabled(): Any? = unwrap(this).getDisabled()

    public fun name(): String

    public fun substitutionMap(): Any? = unwrap(this).getSubstitutionMap()

    public fun threshold(): Any? = unwrap(this).getThreshold()

    @CdkDslMarker
    public interface Builder {
      public fun checkExpression(checkExpression: String)

      public fun columnSelectors(columnSelectors: IResolvable)

      public fun columnSelectors(columnSelectors: List<Any>)

      public fun columnSelectors(vararg columnSelectors: Any)

      public fun disabled(disabled: Boolean)

      public fun disabled(disabled: IResolvable)

      public fun name(name: String)

      public fun substitutionMap(substitutionMap: IResolvable)

      public fun substitutionMap(substitutionMap: List<Any>)

      public fun substitutionMap(vararg substitutionMap: Any)

      public fun threshold(threshold: IResolvable)

      public fun threshold(threshold: ThresholdProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10f3ea622e386b6e5f6e793d4987d8ed5e432916db51f7cd69d3466eeb1ea208")
      public fun threshold(threshold: ThresholdProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnRuleset.RuleProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnRuleset.RuleProperty.builder()

      override fun checkExpression(checkExpression: String) {
        cdkBuilder.checkExpression(checkExpression)
      }

      override fun columnSelectors(columnSelectors: IResolvable) {
        cdkBuilder.columnSelectors(columnSelectors.let(IResolvable::unwrap))
      }

      override fun columnSelectors(columnSelectors: List<Any>) {
        cdkBuilder.columnSelectors(columnSelectors)
      }

      override fun columnSelectors(vararg columnSelectors: Any): Unit =
          columnSelectors(columnSelectors.toList())

      override fun disabled(disabled: Boolean) {
        cdkBuilder.disabled(disabled)
      }

      override fun disabled(disabled: IResolvable) {
        cdkBuilder.disabled(disabled.let(IResolvable::unwrap))
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun substitutionMap(substitutionMap: IResolvable) {
        cdkBuilder.substitutionMap(substitutionMap.let(IResolvable::unwrap))
      }

      override fun substitutionMap(substitutionMap: List<Any>) {
        cdkBuilder.substitutionMap(substitutionMap)
      }

      override fun substitutionMap(vararg substitutionMap: Any): Unit =
          substitutionMap(substitutionMap.toList())

      override fun threshold(threshold: IResolvable) {
        cdkBuilder.threshold(threshold.let(IResolvable::unwrap))
      }

      override fun threshold(threshold: ThresholdProperty) {
        cdkBuilder.threshold(threshold.let(ThresholdProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10f3ea622e386b6e5f6e793d4987d8ed5e432916db51f7cd69d3466eeb1ea208")
      override fun threshold(threshold: ThresholdProperty.Builder.() -> Unit): Unit =
          threshold(ThresholdProperty(threshold))

      public fun build(): software.amazon.awscdk.services.databrew.CfnRuleset.RuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.databrew.CfnRuleset.RuleProperty,
    ) : CdkObject(cdkObject), RuleProperty {
      override fun checkExpression(): String = unwrap(this).getCheckExpression()

      override fun columnSelectors(): Any? = unwrap(this).getColumnSelectors()

      override fun disabled(): Any? = unwrap(this).getDisabled()

      override fun name(): String = unwrap(this).getName()

      override fun substitutionMap(): Any? = unwrap(this).getSubstitutionMap()

      override fun threshold(): Any? = unwrap(this).getThreshold()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRuleset.RuleProperty):
          RuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleProperty):
          software.amazon.awscdk.services.databrew.CfnRuleset.RuleProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.databrew.CfnRuleset.RuleProperty
    }
  }
}
