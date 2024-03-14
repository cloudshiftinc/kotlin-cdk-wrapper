package io.cloudshiftdev.awscdk.services.connect

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

public open class CfnEvaluationForm internal constructor(
  private val cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrEvaluationFormArn(): String = unwrap(this).getAttrEvaluationFormArn()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  public open fun items(): Any = unwrap(this).getItems()

  public open fun items(`value`: IResolvable) {
    unwrap(this).setItems(`value`.let(IResolvable::unwrap))
  }

  public open fun items(__idx_ac66f0: List<Any>) {
    unwrap(this).setItems(__idx_ac66f0)
  }

  public open fun scoringStrategy(): Any? = unwrap(this).getScoringStrategy()

  public open fun scoringStrategy(`value`: IResolvable) {
    unwrap(this).setScoringStrategy(`value`.let(IResolvable::unwrap))
  }

  public open fun scoringStrategy(`value`: ScoringStrategyProperty) {
    unwrap(this).setScoringStrategy(`value`.let(ScoringStrategyProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("db053b24097f5cded4f6164459b076ba38ecb1c25ec882b12efdfc556a16b8c9")
  public open fun scoringStrategy(`value`: ScoringStrategyProperty.Builder.() -> Unit): Unit =
      scoringStrategy(ScoringStrategyProperty(`value`))

  public open fun status(): String = unwrap(this).getStatus()

  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun title(): String = unwrap(this).getTitle()

  public open fun title(`value`: String) {
    unwrap(this).setTitle(`value`)
  }

  public interface Builder {
    public fun description(description: String) {
    }

    public fun instanceArn(instanceArn: String) {
    }

    public fun items(items: IResolvable) {
    }

    public fun items(items: List<Any>) {
    }

    public fun scoringStrategy(scoringStrategy: IResolvable) {
    }

    public fun scoringStrategy(scoringStrategy: ScoringStrategyProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("efe2e93373ae65f145c25729292d629486d4800bb33842ff36705d4eb3a6cc13")
    public fun scoringStrategy(scoringStrategy: ScoringStrategyProperty.Builder.() -> Unit) {
    }

    public fun status(status: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun title(title: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnEvaluationForm.Builder =
        software.amazon.awscdk.services.connect.CfnEvaluationForm.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    public override fun items(items: IResolvable) {
      cdkBuilder.items(items.let(IResolvable::unwrap))
    }

    public override fun items(items: List<Any>) {
      cdkBuilder.items(items)
    }

    public override fun scoringStrategy(scoringStrategy: IResolvable) {
      cdkBuilder.scoringStrategy(scoringStrategy.let(IResolvable::unwrap))
    }

    public override fun scoringStrategy(scoringStrategy: ScoringStrategyProperty) {
      cdkBuilder.scoringStrategy(scoringStrategy.let(ScoringStrategyProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("efe2e93373ae65f145c25729292d629486d4800bb33842ff36705d4eb3a6cc13")
    public override
        fun scoringStrategy(scoringStrategy: ScoringStrategyProperty.Builder.() -> Unit): Unit =
        scoringStrategy(ScoringStrategyProperty(scoringStrategy))

    public override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun title(title: String) {
      cdkBuilder.title(title)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnEvaluationForm =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEvaluationForm {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEvaluationForm(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm):
        CfnEvaluationForm = CfnEvaluationForm(cdkObject)

    internal fun unwrap(wrapped: CfnEvaluationForm):
        software.amazon.awscdk.services.connect.CfnEvaluationForm = wrapped.cdkObject
  }

  public interface EvaluationFormQuestionProperty {
    public fun instructions(): String? = unwrap(this).getInstructions()

    public fun notApplicableEnabled(): Any? = unwrap(this).getNotApplicableEnabled()

    public fun questionType(): String

    public fun questionTypeProperties(): Any? = unwrap(this).getQuestionTypeProperties()

    public fun refId(): String

    public fun title(): String

    public fun weight(): Number? = unwrap(this).getWeight()

    public interface Builder {
      public fun instructions(instructions: String) {
      }

      public fun notApplicableEnabled(notApplicableEnabled: Boolean) {
      }

      public fun notApplicableEnabled(notApplicableEnabled: IResolvable) {
      }

      public fun questionType(questionType: String) {
      }

      public fun questionTypeProperties(questionTypeProperties: IResolvable) {
      }

      public
          fun questionTypeProperties(questionTypeProperties: EvaluationFormQuestionTypePropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("60e92d415a6763084f160d2a7bdb9e754997ad72b78e7b47b63ad5416ac3a029")
      public
          fun questionTypeProperties(questionTypeProperties: EvaluationFormQuestionTypePropertiesProperty.Builder.() -> Unit) {
      }

      public fun refId(refId: String) {
      }

      public fun title(title: String) {
      }

      public fun weight(weight: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormQuestionProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormQuestionProperty.builder()

      public override fun instructions(instructions: String) {
        cdkBuilder.instructions(instructions)
      }

      public override fun notApplicableEnabled(notApplicableEnabled: Boolean) {
        cdkBuilder.notApplicableEnabled(notApplicableEnabled)
      }

      public override fun notApplicableEnabled(notApplicableEnabled: IResolvable) {
        cdkBuilder.notApplicableEnabled(notApplicableEnabled.let(IResolvable::unwrap))
      }

      public override fun questionType(questionType: String) {
        cdkBuilder.questionType(questionType)
      }

      public override fun questionTypeProperties(questionTypeProperties: IResolvable) {
        cdkBuilder.questionTypeProperties(questionTypeProperties.let(IResolvable::unwrap))
      }

      public override
          fun questionTypeProperties(questionTypeProperties: EvaluationFormQuestionTypePropertiesProperty) {
        cdkBuilder.questionTypeProperties(questionTypeProperties.let(EvaluationFormQuestionTypePropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("60e92d415a6763084f160d2a7bdb9e754997ad72b78e7b47b63ad5416ac3a029")
      public override
          fun questionTypeProperties(questionTypeProperties: EvaluationFormQuestionTypePropertiesProperty.Builder.() -> Unit):
          Unit =
          questionTypeProperties(EvaluationFormQuestionTypePropertiesProperty(questionTypeProperties))

      public override fun refId(refId: String) {
        cdkBuilder.refId(refId)
      }

      public override fun title(title: String) {
        cdkBuilder.title(title)
      }

      public override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormQuestionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormQuestionProperty,
    ) : EvaluationFormQuestionProperty {
      public override fun instructions(): String? = unwrap(this).getInstructions()

      public override fun notApplicableEnabled(): Any? = unwrap(this).getNotApplicableEnabled()

      public override fun questionType(): String = unwrap(this).getQuestionType()

      public override fun questionTypeProperties(): Any? = unwrap(this).getQuestionTypeProperties()

      public override fun refId(): String = unwrap(this).getRefId()

      public override fun title(): String = unwrap(this).getTitle()

      public override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EvaluationFormQuestionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormQuestionProperty):
          EvaluationFormQuestionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluationFormQuestionProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormQuestionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EvaluationFormQuestionTypePropertiesProperty {
    public fun numeric(): Any? = unwrap(this).getNumeric()

    public fun singleSelect(): Any? = unwrap(this).getSingleSelect()

    public interface Builder {
      public fun numeric(numeric: IResolvable) {
      }

      public fun numeric(numeric: EvaluationFormNumericQuestionPropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f07d1e363c9b8df691d140e50a5f9b351fafd49a1adab6f4336e3b8339c48f95")
      public
          fun numeric(numeric: EvaluationFormNumericQuestionPropertiesProperty.Builder.() -> Unit) {
      }

      public fun singleSelect(singleSelect: IResolvable) {
      }

      public fun singleSelect(singleSelect: EvaluationFormSingleSelectQuestionPropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4ac30d99389af3124e39fc297e281cc6b48e711a4dbcb0a04077587c66eb38b1")
      public
          fun singleSelect(singleSelect: EvaluationFormSingleSelectQuestionPropertiesProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormQuestionTypePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormQuestionTypePropertiesProperty.builder()

      public override fun numeric(numeric: IResolvable) {
        cdkBuilder.numeric(numeric.let(IResolvable::unwrap))
      }

      public override fun numeric(numeric: EvaluationFormNumericQuestionPropertiesProperty) {
        cdkBuilder.numeric(numeric.let(EvaluationFormNumericQuestionPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f07d1e363c9b8df691d140e50a5f9b351fafd49a1adab6f4336e3b8339c48f95")
      public override
          fun numeric(numeric: EvaluationFormNumericQuestionPropertiesProperty.Builder.() -> Unit):
          Unit = numeric(EvaluationFormNumericQuestionPropertiesProperty(numeric))

      public override fun singleSelect(singleSelect: IResolvable) {
        cdkBuilder.singleSelect(singleSelect.let(IResolvable::unwrap))
      }

      public override
          fun singleSelect(singleSelect: EvaluationFormSingleSelectQuestionPropertiesProperty) {
        cdkBuilder.singleSelect(singleSelect.let(EvaluationFormSingleSelectQuestionPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4ac30d99389af3124e39fc297e281cc6b48e711a4dbcb0a04077587c66eb38b1")
      public override
          fun singleSelect(singleSelect: EvaluationFormSingleSelectQuestionPropertiesProperty.Builder.() -> Unit):
          Unit = singleSelect(EvaluationFormSingleSelectQuestionPropertiesProperty(singleSelect))

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormQuestionTypePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormQuestionTypePropertiesProperty,
    ) : EvaluationFormQuestionTypePropertiesProperty {
      public override fun numeric(): Any? = unwrap(this).getNumeric()

      public override fun singleSelect(): Any? = unwrap(this).getSingleSelect()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          EvaluationFormQuestionTypePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormQuestionTypePropertiesProperty):
          EvaluationFormQuestionTypePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluationFormQuestionTypePropertiesProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormQuestionTypePropertiesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface EvaluationFormItemProperty {
    public fun question(): Any? = unwrap(this).getQuestion()

    public fun section(): Any? = unwrap(this).getSection()

    public interface Builder {
      public fun question(question: IResolvable) {
      }

      public fun question(question: EvaluationFormQuestionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e5318a14fa17ffb27f54d09ae3d4e6adfe1d0a87d6d836ba0e4d31e90e5d44fa")
      public fun question(question: EvaluationFormQuestionProperty.Builder.() -> Unit) {
      }

      public fun section(section: IResolvable) {
      }

      public fun section(section: EvaluationFormSectionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("515bf2263e1945779436dc77ef1a3a822c8481e6e43e0878bb8e3dc2b5a85496")
      public fun section(section: EvaluationFormSectionProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormItemProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormItemProperty.builder()

      public override fun question(question: IResolvable) {
        cdkBuilder.question(question.let(IResolvable::unwrap))
      }

      public override fun question(question: EvaluationFormQuestionProperty) {
        cdkBuilder.question(question.let(EvaluationFormQuestionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e5318a14fa17ffb27f54d09ae3d4e6adfe1d0a87d6d836ba0e4d31e90e5d44fa")
      public override fun question(question: EvaluationFormQuestionProperty.Builder.() -> Unit):
          Unit = question(EvaluationFormQuestionProperty(question))

      public override fun section(section: IResolvable) {
        cdkBuilder.section(section.let(IResolvable::unwrap))
      }

      public override fun section(section: EvaluationFormSectionProperty) {
        cdkBuilder.section(section.let(EvaluationFormSectionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("515bf2263e1945779436dc77ef1a3a822c8481e6e43e0878bb8e3dc2b5a85496")
      public override fun section(section: EvaluationFormSectionProperty.Builder.() -> Unit): Unit =
          section(EvaluationFormSectionProperty(section))

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormItemProperty,
    ) : EvaluationFormItemProperty {
      public override fun question(): Any? = unwrap(this).getQuestion()

      public override fun section(): Any? = unwrap(this).getSection()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EvaluationFormItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormItemProperty):
          EvaluationFormItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluationFormItemProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormItemProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EvaluationFormSingleSelectQuestionAutomationProperty {
    public fun defaultOptionRefId(): String? = unwrap(this).getDefaultOptionRefId()

    public fun options(): Any

    public interface Builder {
      public fun defaultOptionRefId(defaultOptionRefId: String) {
      }

      public fun options(options: IResolvable) {
      }

      public fun options(options: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationProperty.builder()

      public override fun defaultOptionRefId(defaultOptionRefId: String) {
        cdkBuilder.defaultOptionRefId(defaultOptionRefId)
      }

      public override fun options(options: IResolvable) {
        cdkBuilder.options(options.let(IResolvable::unwrap))
      }

      public override fun options(options: List<Any>) {
        cdkBuilder.options(options)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationProperty,
    ) : EvaluationFormSingleSelectQuestionAutomationProperty {
      public override fun defaultOptionRefId(): String? = unwrap(this).getDefaultOptionRefId()

      public override fun options(): Any = unwrap(this).getOptions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          EvaluationFormSingleSelectQuestionAutomationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationProperty):
          EvaluationFormSingleSelectQuestionAutomationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluationFormSingleSelectQuestionAutomationProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface EvaluationFormNumericQuestionPropertiesProperty {
    public fun automation(): Any? = unwrap(this).getAutomation()

    public fun maxValue(): Number

    public fun minValue(): Number

    public fun options(): Any? = unwrap(this).getOptions()

    public interface Builder {
      public fun automation(automation: IResolvable) {
      }

      public fun automation(automation: EvaluationFormNumericQuestionAutomationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c698dd5314d7b0a87b42190cf4aeb546028b5d817bd9c0f9b274e1ca785890af")
      public
          fun automation(automation: EvaluationFormNumericQuestionAutomationProperty.Builder.() -> Unit) {
      }

      public fun maxValue(maxValue: Number) {
      }

      public fun minValue(minValue: Number) {
      }

      public fun options(options: IResolvable) {
      }

      public fun options(options: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionPropertiesProperty.builder()

      public override fun automation(automation: IResolvable) {
        cdkBuilder.automation(automation.let(IResolvable::unwrap))
      }

      public override fun automation(automation: EvaluationFormNumericQuestionAutomationProperty) {
        cdkBuilder.automation(automation.let(EvaluationFormNumericQuestionAutomationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c698dd5314d7b0a87b42190cf4aeb546028b5d817bd9c0f9b274e1ca785890af")
      public override
          fun automation(automation: EvaluationFormNumericQuestionAutomationProperty.Builder.() -> Unit):
          Unit = automation(EvaluationFormNumericQuestionAutomationProperty(automation))

      public override fun maxValue(maxValue: Number) {
        cdkBuilder.maxValue(maxValue)
      }

      public override fun minValue(minValue: Number) {
        cdkBuilder.minValue(minValue)
      }

      public override fun options(options: IResolvable) {
        cdkBuilder.options(options.let(IResolvable::unwrap))
      }

      public override fun options(options: List<Any>) {
        cdkBuilder.options(options)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionPropertiesProperty,
    ) : EvaluationFormNumericQuestionPropertiesProperty {
      public override fun automation(): Any? = unwrap(this).getAutomation()

      public override fun maxValue(): Number = unwrap(this).getMaxValue()

      public override fun minValue(): Number = unwrap(this).getMinValue()

      public override fun options(): Any? = unwrap(this).getOptions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          EvaluationFormNumericQuestionPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionPropertiesProperty):
          EvaluationFormNumericQuestionPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluationFormNumericQuestionPropertiesProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionPropertiesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SingleSelectQuestionRuleCategoryAutomationProperty {
    public fun category(): String

    public fun condition(): String

    public fun optionRefId(): String

    public interface Builder {
      public fun category(category: String) {
      }

      public fun condition(condition: String) {
      }

      public fun optionRefId(optionRefId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.SingleSelectQuestionRuleCategoryAutomationProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.SingleSelectQuestionRuleCategoryAutomationProperty.builder()

      public override fun category(category: String) {
        cdkBuilder.category(category)
      }

      public override fun condition(condition: String) {
        cdkBuilder.condition(condition)
      }

      public override fun optionRefId(optionRefId: String) {
        cdkBuilder.optionRefId(optionRefId)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.SingleSelectQuestionRuleCategoryAutomationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.SingleSelectQuestionRuleCategoryAutomationProperty,
    ) : SingleSelectQuestionRuleCategoryAutomationProperty {
      public override fun category(): String = unwrap(this).getCategory()

      public override fun condition(): String = unwrap(this).getCondition()

      public override fun optionRefId(): String = unwrap(this).getOptionRefId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SingleSelectQuestionRuleCategoryAutomationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.SingleSelectQuestionRuleCategoryAutomationProperty):
          SingleSelectQuestionRuleCategoryAutomationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SingleSelectQuestionRuleCategoryAutomationProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.SingleSelectQuestionRuleCategoryAutomationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface EvaluationFormSingleSelectQuestionPropertiesProperty {
    public fun automation(): Any? = unwrap(this).getAutomation()

    public fun displayAs(): String? = unwrap(this).getDisplayAs()

    public fun options(): Any

    public interface Builder {
      public fun automation(automation: IResolvable) {
      }

      public fun automation(automation: EvaluationFormSingleSelectQuestionAutomationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9894990d64228a53c80be65a65f4e5421d5e66c52b694c5709d0bd3219bff93")
      public
          fun automation(automation: EvaluationFormSingleSelectQuestionAutomationProperty.Builder.() -> Unit) {
      }

      public fun displayAs(displayAs: String) {
      }

      public fun options(options: IResolvable) {
      }

      public fun options(options: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionPropertiesProperty.builder()

      public override fun automation(automation: IResolvable) {
        cdkBuilder.automation(automation.let(IResolvable::unwrap))
      }

      public override
          fun automation(automation: EvaluationFormSingleSelectQuestionAutomationProperty) {
        cdkBuilder.automation(automation.let(EvaluationFormSingleSelectQuestionAutomationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9894990d64228a53c80be65a65f4e5421d5e66c52b694c5709d0bd3219bff93")
      public override
          fun automation(automation: EvaluationFormSingleSelectQuestionAutomationProperty.Builder.() -> Unit):
          Unit = automation(EvaluationFormSingleSelectQuestionAutomationProperty(automation))

      public override fun displayAs(displayAs: String) {
        cdkBuilder.displayAs(displayAs)
      }

      public override fun options(options: IResolvable) {
        cdkBuilder.options(options.let(IResolvable::unwrap))
      }

      public override fun options(options: List<Any>) {
        cdkBuilder.options(options)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionPropertiesProperty,
    ) : EvaluationFormSingleSelectQuestionPropertiesProperty {
      public override fun automation(): Any? = unwrap(this).getAutomation()

      public override fun displayAs(): String? = unwrap(this).getDisplayAs()

      public override fun options(): Any = unwrap(this).getOptions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          EvaluationFormSingleSelectQuestionPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionPropertiesProperty):
          EvaluationFormSingleSelectQuestionPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluationFormSingleSelectQuestionPropertiesProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionPropertiesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface EvaluationFormSingleSelectQuestionOptionProperty {
    public fun automaticFail(): Any? = unwrap(this).getAutomaticFail()

    public fun refId(): String

    public fun score(): Number? = unwrap(this).getScore()

    public fun text(): String

    public interface Builder {
      public fun automaticFail(automaticFail: Boolean) {
      }

      public fun automaticFail(automaticFail: IResolvable) {
      }

      public fun refId(refId: String) {
      }

      public fun score(score: Number) {
      }

      public fun text(text: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionOptionProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionOptionProperty.builder()

      public override fun automaticFail(automaticFail: Boolean) {
        cdkBuilder.automaticFail(automaticFail)
      }

      public override fun automaticFail(automaticFail: IResolvable) {
        cdkBuilder.automaticFail(automaticFail.let(IResolvable::unwrap))
      }

      public override fun refId(refId: String) {
        cdkBuilder.refId(refId)
      }

      public override fun score(score: Number) {
        cdkBuilder.score(score)
      }

      public override fun text(text: String) {
        cdkBuilder.text(text)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionOptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionOptionProperty,
    ) : EvaluationFormSingleSelectQuestionOptionProperty {
      public override fun automaticFail(): Any? = unwrap(this).getAutomaticFail()

      public override fun refId(): String = unwrap(this).getRefId()

      public override fun score(): Number? = unwrap(this).getScore()

      public override fun text(): String = unwrap(this).getText()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          EvaluationFormSingleSelectQuestionOptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionOptionProperty):
          EvaluationFormSingleSelectQuestionOptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluationFormSingleSelectQuestionOptionProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionOptionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ScoringStrategyProperty {
    public fun mode(): String

    public fun status(): String

    public interface Builder {
      public fun mode(mode: String) {
      }

      public fun status(status: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.ScoringStrategyProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.ScoringStrategyProperty.builder()

      public override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      public override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.ScoringStrategyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.ScoringStrategyProperty,
    ) : ScoringStrategyProperty {
      public override fun mode(): String = unwrap(this).getMode()

      public override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScoringStrategyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.ScoringStrategyProperty):
          ScoringStrategyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScoringStrategyProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.ScoringStrategyProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EvaluationFormBaseItemProperty {
    public fun section(): Any

    public interface Builder {
      public fun section(section: IResolvable) {
      }

      public fun section(section: EvaluationFormSectionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("75f7b8dd462ca67cd3a8ed539fc8fad8338912c53c9442851afc351f9dc203fe")
      public fun section(section: EvaluationFormSectionProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormBaseItemProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormBaseItemProperty.builder()

      public override fun section(section: IResolvable) {
        cdkBuilder.section(section.let(IResolvable::unwrap))
      }

      public override fun section(section: EvaluationFormSectionProperty) {
        cdkBuilder.section(section.let(EvaluationFormSectionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("75f7b8dd462ca67cd3a8ed539fc8fad8338912c53c9442851afc351f9dc203fe")
      public override fun section(section: EvaluationFormSectionProperty.Builder.() -> Unit): Unit =
          section(EvaluationFormSectionProperty(section))

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormBaseItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormBaseItemProperty,
    ) : EvaluationFormBaseItemProperty {
      public override fun section(): Any = unwrap(this).getSection()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EvaluationFormBaseItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormBaseItemProperty):
          EvaluationFormBaseItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluationFormBaseItemProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormBaseItemProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EvaluationFormNumericQuestionOptionProperty {
    public fun automaticFail(): Any? = unwrap(this).getAutomaticFail()

    public fun maxValue(): Number

    public fun minValue(): Number

    public fun score(): Number? = unwrap(this).getScore()

    public interface Builder {
      public fun automaticFail(automaticFail: Boolean) {
      }

      public fun automaticFail(automaticFail: IResolvable) {
      }

      public fun maxValue(maxValue: Number) {
      }

      public fun minValue(minValue: Number) {
      }

      public fun score(score: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionOptionProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionOptionProperty.builder()

      public override fun automaticFail(automaticFail: Boolean) {
        cdkBuilder.automaticFail(automaticFail)
      }

      public override fun automaticFail(automaticFail: IResolvable) {
        cdkBuilder.automaticFail(automaticFail.let(IResolvable::unwrap))
      }

      public override fun maxValue(maxValue: Number) {
        cdkBuilder.maxValue(maxValue)
      }

      public override fun minValue(minValue: Number) {
        cdkBuilder.minValue(minValue)
      }

      public override fun score(score: Number) {
        cdkBuilder.score(score)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionOptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionOptionProperty,
    ) : EvaluationFormNumericQuestionOptionProperty {
      public override fun automaticFail(): Any? = unwrap(this).getAutomaticFail()

      public override fun maxValue(): Number = unwrap(this).getMaxValue()

      public override fun minValue(): Number = unwrap(this).getMinValue()

      public override fun score(): Number? = unwrap(this).getScore()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          EvaluationFormNumericQuestionOptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionOptionProperty):
          EvaluationFormNumericQuestionOptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluationFormNumericQuestionOptionProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionOptionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface NumericQuestionPropertyValueAutomationProperty {
    public fun label(): String

    public interface Builder {
      public fun label(label: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.NumericQuestionPropertyValueAutomationProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.NumericQuestionPropertyValueAutomationProperty.builder()

      public override fun label(label: String) {
        cdkBuilder.label(label)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.NumericQuestionPropertyValueAutomationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.NumericQuestionPropertyValueAutomationProperty,
    ) : NumericQuestionPropertyValueAutomationProperty {
      public override fun label(): String = unwrap(this).getLabel()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          NumericQuestionPropertyValueAutomationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.NumericQuestionPropertyValueAutomationProperty):
          NumericQuestionPropertyValueAutomationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NumericQuestionPropertyValueAutomationProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.NumericQuestionPropertyValueAutomationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface EvaluationFormNumericQuestionAutomationProperty {
    public fun propertyValue(): Any

    public interface Builder {
      public fun propertyValue(propertyValue: IResolvable) {
      }

      public fun propertyValue(propertyValue: NumericQuestionPropertyValueAutomationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1b7fb14f46a5514785021373b865ef90fc264cc00a77fd4e30965d5c7f300a6")
      public
          fun propertyValue(propertyValue: NumericQuestionPropertyValueAutomationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionAutomationProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionAutomationProperty.builder()

      public override fun propertyValue(propertyValue: IResolvable) {
        cdkBuilder.propertyValue(propertyValue.let(IResolvable::unwrap))
      }

      public override
          fun propertyValue(propertyValue: NumericQuestionPropertyValueAutomationProperty) {
        cdkBuilder.propertyValue(propertyValue.let(NumericQuestionPropertyValueAutomationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1b7fb14f46a5514785021373b865ef90fc264cc00a77fd4e30965d5c7f300a6")
      public override
          fun propertyValue(propertyValue: NumericQuestionPropertyValueAutomationProperty.Builder.() -> Unit):
          Unit = propertyValue(NumericQuestionPropertyValueAutomationProperty(propertyValue))

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionAutomationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionAutomationProperty,
    ) : EvaluationFormNumericQuestionAutomationProperty {
      public override fun propertyValue(): Any = unwrap(this).getPropertyValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          EvaluationFormNumericQuestionAutomationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionAutomationProperty):
          EvaluationFormNumericQuestionAutomationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluationFormNumericQuestionAutomationProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionAutomationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface EvaluationFormSingleSelectQuestionAutomationOptionProperty {
    public fun ruleCategory(): Any

    public interface Builder {
      public fun ruleCategory(ruleCategory: IResolvable) {
      }

      public fun ruleCategory(ruleCategory: SingleSelectQuestionRuleCategoryAutomationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5e2ff25c6d03de1cc3b1528c68ff95d0a888f949e0c19b008f08358a9feb587")
      public
          fun ruleCategory(ruleCategory: SingleSelectQuestionRuleCategoryAutomationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationOptionProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationOptionProperty.builder()

      public override fun ruleCategory(ruleCategory: IResolvable) {
        cdkBuilder.ruleCategory(ruleCategory.let(IResolvable::unwrap))
      }

      public override
          fun ruleCategory(ruleCategory: SingleSelectQuestionRuleCategoryAutomationProperty) {
        cdkBuilder.ruleCategory(ruleCategory.let(SingleSelectQuestionRuleCategoryAutomationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5e2ff25c6d03de1cc3b1528c68ff95d0a888f949e0c19b008f08358a9feb587")
      public override
          fun ruleCategory(ruleCategory: SingleSelectQuestionRuleCategoryAutomationProperty.Builder.() -> Unit):
          Unit = ruleCategory(SingleSelectQuestionRuleCategoryAutomationProperty(ruleCategory))

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationOptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationOptionProperty,
    ) : EvaluationFormSingleSelectQuestionAutomationOptionProperty {
      public override fun ruleCategory(): Any = unwrap(this).getRuleCategory()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          EvaluationFormSingleSelectQuestionAutomationOptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationOptionProperty):
          EvaluationFormSingleSelectQuestionAutomationOptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluationFormSingleSelectQuestionAutomationOptionProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationOptionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface EvaluationFormSectionProperty {
    public fun instructions(): String? = unwrap(this).getInstructions()

    public fun items(): Any? = unwrap(this).getItems()

    public fun refId(): String

    public fun title(): String

    public fun weight(): Number? = unwrap(this).getWeight()

    public interface Builder {
      public fun instructions(instructions: String) {
      }

      public fun items(items: IResolvable) {
      }

      public fun items(items: List<Any>) {
      }

      public fun refId(refId: String) {
      }

      public fun title(title: String) {
      }

      public fun weight(weight: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSectionProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSectionProperty.builder()

      public override fun instructions(instructions: String) {
        cdkBuilder.instructions(instructions)
      }

      public override fun items(items: IResolvable) {
        cdkBuilder.items(items.let(IResolvable::unwrap))
      }

      public override fun items(items: List<Any>) {
        cdkBuilder.items(items)
      }

      public override fun refId(refId: String) {
        cdkBuilder.refId(refId)
      }

      public override fun title(title: String) {
        cdkBuilder.title(title)
      }

      public override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSectionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSectionProperty,
    ) : EvaluationFormSectionProperty {
      public override fun instructions(): String? = unwrap(this).getInstructions()

      public override fun items(): Any? = unwrap(this).getItems()

      public override fun refId(): String = unwrap(this).getRefId()

      public override fun title(): String = unwrap(this).getTitle()

      public override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EvaluationFormSectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSectionProperty):
          EvaluationFormSectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluationFormSectionProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSectionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
