package io.cloudshiftdev.awscdk.services.databrew

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
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRuleset internal constructor(
  private val cdkObject: software.amazon.awscdk.services.databrew.CfnRuleset,
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

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun targetArn(): String = unwrap(this).getTargetArn()

  public open fun targetArn(`value`: String) {
    unwrap(this).setTargetArn(`value`)
  }

  public interface Builder {
    public fun description(description: String) {
    }

    public fun name(name: String) {
    }

    public fun rules(rules: IResolvable) {
    }

    public fun rules(rules: List<Any>) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun targetArn(targetArn: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.databrew.CfnRuleset.Builder =
        software.amazon.awscdk.services.databrew.CfnRuleset.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun rules(rules: IResolvable) {
      cdkBuilder.rules(rules.let(IResolvable::unwrap))
    }

    public override fun rules(rules: List<Any>) {
      cdkBuilder.rules(rules)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun targetArn(targetArn: String) {
      cdkBuilder.targetArn(targetArn)
    }

    public fun build(): software.amazon.awscdk.services.databrew.CfnRuleset = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

    public interface Builder {
      public fun type(type: String) {
      }

      public fun unit(unit: String) {
      }

      public fun `value`(`value`: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnRuleset.ThresholdProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnRuleset.ThresholdProperty.builder()

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnRuleset.ThresholdProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.databrew.CfnRuleset.ThresholdProperty,
    ) : ThresholdProperty {
      public override fun type(): String? = unwrap(this).getType()

      public override fun unit(): String? = unwrap(this).getUnit()

      public override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ThresholdProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRuleset.ThresholdProperty):
          ThresholdProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThresholdProperty):
          software.amazon.awscdk.services.databrew.CfnRuleset.ThresholdProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SubstitutionValueProperty {
    public fun `value`(): String

    public fun valueReference(): String

    public interface Builder {
      public fun `value`(`value`: String) {
      }

      public fun valueReference(valueReference: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnRuleset.SubstitutionValueProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnRuleset.SubstitutionValueProperty.builder()

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public override fun valueReference(valueReference: String) {
        cdkBuilder.valueReference(valueReference)
      }

      public fun build():
          software.amazon.awscdk.services.databrew.CfnRuleset.SubstitutionValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnRuleset.SubstitutionValueProperty,
    ) : SubstitutionValueProperty {
      public override fun `value`(): String = unwrap(this).getValue()

      public override fun valueReference(): String = unwrap(this).getValueReference()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SubstitutionValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRuleset.SubstitutionValueProperty):
          SubstitutionValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubstitutionValueProperty):
          software.amazon.awscdk.services.databrew.CfnRuleset.SubstitutionValueProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ColumnSelectorProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun regex(): String? = unwrap(this).getRegex()

    public interface Builder {
      public fun name(name: String) {
      }

      public fun regex(regex: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnRuleset.ColumnSelectorProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnRuleset.ColumnSelectorProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun regex(regex: String) {
        cdkBuilder.regex(regex)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnRuleset.ColumnSelectorProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnRuleset.ColumnSelectorProperty,
    ) : ColumnSelectorProperty {
      public override fun name(): String? = unwrap(this).getName()

      public override fun regex(): String? = unwrap(this).getRegex()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ColumnSelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRuleset.ColumnSelectorProperty):
          ColumnSelectorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnSelectorProperty):
          software.amazon.awscdk.services.databrew.CfnRuleset.ColumnSelectorProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RuleProperty {
    public fun checkExpression(): String

    public fun columnSelectors(): Any? = unwrap(this).getColumnSelectors()

    public fun disabled(): Any? = unwrap(this).getDisabled()

    public fun name(): String

    public fun substitutionMap(): Any? = unwrap(this).getSubstitutionMap()

    public fun threshold(): Any? = unwrap(this).getThreshold()

    public interface Builder {
      public fun checkExpression(checkExpression: String) {
      }

      public fun columnSelectors(columnSelectors: IResolvable) {
      }

      public fun columnSelectors(columnSelectors: List<Any>) {
      }

      public fun disabled(disabled: Boolean) {
      }

      public fun disabled(disabled: IResolvable) {
      }

      public fun name(name: String) {
      }

      public fun substitutionMap(substitutionMap: IResolvable) {
      }

      public fun substitutionMap(substitutionMap: List<Any>) {
      }

      public fun threshold(threshold: IResolvable) {
      }

      public fun threshold(threshold: ThresholdProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10f3ea622e386b6e5f6e793d4987d8ed5e432916db51f7cd69d3466eeb1ea208")
      public fun threshold(threshold: ThresholdProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnRuleset.RuleProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnRuleset.RuleProperty.builder()

      public override fun checkExpression(checkExpression: String) {
        cdkBuilder.checkExpression(checkExpression)
      }

      public override fun columnSelectors(columnSelectors: IResolvable) {
        cdkBuilder.columnSelectors(columnSelectors.let(IResolvable::unwrap))
      }

      public override fun columnSelectors(columnSelectors: List<Any>) {
        cdkBuilder.columnSelectors(columnSelectors)
      }

      public override fun disabled(disabled: Boolean) {
        cdkBuilder.disabled(disabled)
      }

      public override fun disabled(disabled: IResolvable) {
        cdkBuilder.disabled(disabled.let(IResolvable::unwrap))
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun substitutionMap(substitutionMap: IResolvable) {
        cdkBuilder.substitutionMap(substitutionMap.let(IResolvable::unwrap))
      }

      public override fun substitutionMap(substitutionMap: List<Any>) {
        cdkBuilder.substitutionMap(substitutionMap)
      }

      public override fun threshold(threshold: IResolvable) {
        cdkBuilder.threshold(threshold.let(IResolvable::unwrap))
      }

      public override fun threshold(threshold: ThresholdProperty) {
        cdkBuilder.threshold(threshold.let(ThresholdProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10f3ea622e386b6e5f6e793d4987d8ed5e432916db51f7cd69d3466eeb1ea208")
      public override fun threshold(threshold: ThresholdProperty.Builder.() -> Unit): Unit =
          threshold(ThresholdProperty(threshold))

      public fun build(): software.amazon.awscdk.services.databrew.CfnRuleset.RuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.databrew.CfnRuleset.RuleProperty,
    ) : RuleProperty {
      public override fun checkExpression(): String = unwrap(this).getCheckExpression()

      public override fun columnSelectors(): Any? = unwrap(this).getColumnSelectors()

      public override fun disabled(): Any? = unwrap(this).getDisabled()

      public override fun name(): String = unwrap(this).getName()

      public override fun substitutionMap(): Any? = unwrap(this).getSubstitutionMap()

      public override fun threshold(): Any? = unwrap(this).getThreshold()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRuleset.RuleProperty):
          RuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleProperty):
          software.amazon.awscdk.services.databrew.CfnRuleset.RuleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
