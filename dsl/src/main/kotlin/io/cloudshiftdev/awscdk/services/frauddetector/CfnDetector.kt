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
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDetector internal constructor(
  private val cdkObject: software.amazon.awscdk.services.frauddetector.CfnDetector,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun associatedModels(): Any? = unwrap(this).getAssociatedModels()

  public open fun associatedModels(`value`: IResolvable) {
    unwrap(this).setAssociatedModels(`value`.let(IResolvable::unwrap))
  }

  public open fun associatedModels(__idx_ac66f0: List<Any>) {
    unwrap(this).setAssociatedModels(__idx_ac66f0)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

  public open fun attrDetectorVersionId(): String = unwrap(this).getAttrDetectorVersionId()

  public open fun attrEventTypeArn(): String = unwrap(this).getAttrEventTypeArn()

  public open fun attrEventTypeCreatedTime(): String = unwrap(this).getAttrEventTypeCreatedTime()

  public open fun attrEventTypeLastUpdatedTime(): String =
      unwrap(this).getAttrEventTypeLastUpdatedTime()

  public open fun attrLastUpdatedTime(): String = unwrap(this).getAttrLastUpdatedTime()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun detectorId(): String = unwrap(this).getDetectorId()

  public open fun detectorId(`value`: String) {
    unwrap(this).setDetectorId(`value`)
  }

  public open fun detectorVersionStatus(): String? = unwrap(this).getDetectorVersionStatus()

  public open fun detectorVersionStatus(`value`: String) {
    unwrap(this).setDetectorVersionStatus(`value`)
  }

  public open fun eventType(): Any = unwrap(this).getEventType()

  public open fun eventType(`value`: IResolvable) {
    unwrap(this).setEventType(`value`.let(IResolvable::unwrap))
  }

  public open fun eventType(`value`: EventTypeProperty) {
    unwrap(this).setEventType(`value`.let(EventTypeProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ea093576b787a8e47cd555312a920e21e9d568a6c1930d5c16c16d353c1140a4")
  public open fun eventType(`value`: EventTypeProperty.Builder.() -> Unit): Unit =
      eventType(EventTypeProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ruleExecutionMode(): String? = unwrap(this).getRuleExecutionMode()

  public open fun ruleExecutionMode(`value`: String) {
    unwrap(this).setRuleExecutionMode(`value`)
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

  public interface Builder {
    public fun associatedModels(associatedModels: IResolvable) {
    }

    public fun associatedModels(associatedModels: List<Any>) {
    }

    public fun description(description: String) {
    }

    public fun detectorId(detectorId: String) {
    }

    public fun detectorVersionStatus(detectorVersionStatus: String) {
    }

    public fun eventType(eventType: IResolvable) {
    }

    public fun eventType(eventType: EventTypeProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1908bdf3c79730411659f2ed378d0a4ec38565e5f69568f793a845c4056359a0")
    public fun eventType(eventType: EventTypeProperty.Builder.() -> Unit) {
    }

    public fun ruleExecutionMode(ruleExecutionMode: String) {
    }

    public fun rules(rules: IResolvable) {
    }

    public fun rules(rules: List<Any>) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.frauddetector.CfnDetector.Builder =
        software.amazon.awscdk.services.frauddetector.CfnDetector.Builder.create(scope, id)

    public override fun associatedModels(associatedModels: IResolvable) {
      cdkBuilder.associatedModels(associatedModels.let(IResolvable::unwrap))
    }

    public override fun associatedModels(associatedModels: List<Any>) {
      cdkBuilder.associatedModels(associatedModels)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun detectorId(detectorId: String) {
      cdkBuilder.detectorId(detectorId)
    }

    public override fun detectorVersionStatus(detectorVersionStatus: String) {
      cdkBuilder.detectorVersionStatus(detectorVersionStatus)
    }

    public override fun eventType(eventType: IResolvable) {
      cdkBuilder.eventType(eventType.let(IResolvable::unwrap))
    }

    public override fun eventType(eventType: EventTypeProperty) {
      cdkBuilder.eventType(eventType.let(EventTypeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1908bdf3c79730411659f2ed378d0a4ec38565e5f69568f793a845c4056359a0")
    public override fun eventType(eventType: EventTypeProperty.Builder.() -> Unit): Unit =
        eventType(EventTypeProperty(eventType))

    public override fun ruleExecutionMode(ruleExecutionMode: String) {
      cdkBuilder.ruleExecutionMode(ruleExecutionMode)
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

    public fun build(): software.amazon.awscdk.services.frauddetector.CfnDetector =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDetector {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDetector(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnDetector):
        CfnDetector = CfnDetector(cdkObject)

    internal fun unwrap(wrapped: CfnDetector):
        software.amazon.awscdk.services.frauddetector.CfnDetector = wrapped.cdkObject
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
          software.amazon.awscdk.services.frauddetector.CfnDetector.LabelProperty.Builder =
          software.amazon.awscdk.services.frauddetector.CfnDetector.LabelProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.frauddetector.CfnDetector.LabelProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.frauddetector.CfnDetector.LabelProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnDetector.LabelProperty):
          LabelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LabelProperty):
          software.amazon.awscdk.services.frauddetector.CfnDetector.LabelProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EventTypeProperty {
    public fun arn(): String? = unwrap(this).getArn()

    public fun createdTime(): String? = unwrap(this).getCreatedTime()

    public fun description(): String? = unwrap(this).getDescription()

    public fun entityTypes(): Any? = unwrap(this).getEntityTypes()

    public fun eventVariables(): Any? = unwrap(this).getEventVariables()

    public fun `inline`(): Any? = unwrap(this).getInline()

    public fun labels(): Any? = unwrap(this).getLabels()

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

      public fun entityTypes(entityTypes: IResolvable) {
      }

      public fun entityTypes(entityTypes: List<Any>) {
      }

      public fun eventVariables(eventVariables: IResolvable) {
      }

      public fun eventVariables(eventVariables: List<Any>) {
      }

      public fun `inline`(`inline`: Boolean) {
      }

      public fun `inline`(`inline`: IResolvable) {
      }

      public fun labels(labels: IResolvable) {
      }

      public fun labels(labels: List<Any>) {
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
          software.amazon.awscdk.services.frauddetector.CfnDetector.EventTypeProperty.Builder =
          software.amazon.awscdk.services.frauddetector.CfnDetector.EventTypeProperty.builder()

      public override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public override fun createdTime(createdTime: String) {
        cdkBuilder.createdTime(createdTime)
      }

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

      public override fun `inline`(`inline`: Boolean) {
        cdkBuilder.`inline`(`inline`)
      }

      public override fun `inline`(`inline`: IResolvable) {
        cdkBuilder.`inline`(`inline`.let(IResolvable::unwrap))
      }

      public override fun labels(labels: IResolvable) {
        cdkBuilder.labels(labels.let(IResolvable::unwrap))
      }

      public override fun labels(labels: List<Any>) {
        cdkBuilder.labels(labels)
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
          software.amazon.awscdk.services.frauddetector.CfnDetector.EventTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.frauddetector.CfnDetector.EventTypeProperty,
    ) : EventTypeProperty {
      public override fun arn(): String? = unwrap(this).getArn()

      public override fun createdTime(): String? = unwrap(this).getCreatedTime()

      public override fun description(): String? = unwrap(this).getDescription()

      public override fun entityTypes(): Any? = unwrap(this).getEntityTypes()

      public override fun eventVariables(): Any? = unwrap(this).getEventVariables()

      public override fun `inline`(): Any? = unwrap(this).getInline()

      public override fun labels(): Any? = unwrap(this).getLabels()

      public override fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

      public override fun name(): String? = unwrap(this).getName()

      public override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EventTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnDetector.EventTypeProperty):
          EventTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventTypeProperty):
          software.amazon.awscdk.services.frauddetector.CfnDetector.EventTypeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface OutcomeProperty {
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
          software.amazon.awscdk.services.frauddetector.CfnDetector.OutcomeProperty.Builder =
          software.amazon.awscdk.services.frauddetector.CfnDetector.OutcomeProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.frauddetector.CfnDetector.OutcomeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.frauddetector.CfnDetector.OutcomeProperty,
    ) : OutcomeProperty {
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

      public operator fun invoke(block: Builder.() -> Unit = {}): OutcomeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnDetector.OutcomeProperty):
          OutcomeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutcomeProperty):
          software.amazon.awscdk.services.frauddetector.CfnDetector.OutcomeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RuleProperty {
    public fun arn(): String? = unwrap(this).getArn()

    public fun createdTime(): String? = unwrap(this).getCreatedTime()

    public fun description(): String? = unwrap(this).getDescription()

    public fun detectorId(): String? = unwrap(this).getDetectorId()

    public fun expression(): String? = unwrap(this).getExpression()

    public fun language(): String? = unwrap(this).getLanguage()

    public fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

    public fun outcomes(): Any? = unwrap(this).getOutcomes()

    public fun ruleId(): String? = unwrap(this).getRuleId()

    public fun ruleVersion(): String? = unwrap(this).getRuleVersion()

    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    public interface Builder {
      public fun arn(arn: String) {
      }

      public fun createdTime(createdTime: String) {
      }

      public fun description(description: String) {
      }

      public fun detectorId(detectorId: String) {
      }

      public fun expression(expression: String) {
      }

      public fun language(language: String) {
      }

      public fun lastUpdatedTime(lastUpdatedTime: String) {
      }

      public fun outcomes(outcomes: IResolvable) {
      }

      public fun outcomes(outcomes: List<Any>) {
      }

      public fun ruleId(ruleId: String) {
      }

      public fun ruleVersion(ruleVersion: String) {
      }

      public fun tags(tags: List<CfnTag>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.frauddetector.CfnDetector.RuleProperty.Builder =
          software.amazon.awscdk.services.frauddetector.CfnDetector.RuleProperty.builder()

      public override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public override fun createdTime(createdTime: String) {
        cdkBuilder.createdTime(createdTime)
      }

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun detectorId(detectorId: String) {
        cdkBuilder.detectorId(detectorId)
      }

      public override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      public override fun language(language: String) {
        cdkBuilder.language(language)
      }

      public override fun lastUpdatedTime(lastUpdatedTime: String) {
        cdkBuilder.lastUpdatedTime(lastUpdatedTime)
      }

      public override fun outcomes(outcomes: IResolvable) {
        cdkBuilder.outcomes(outcomes.let(IResolvable::unwrap))
      }

      public override fun outcomes(outcomes: List<Any>) {
        cdkBuilder.outcomes(outcomes)
      }

      public override fun ruleId(ruleId: String) {
        cdkBuilder.ruleId(ruleId)
      }

      public override fun ruleVersion(ruleVersion: String) {
        cdkBuilder.ruleVersion(ruleVersion)
      }

      public override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.frauddetector.CfnDetector.RuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.frauddetector.CfnDetector.RuleProperty,
    ) : RuleProperty {
      public override fun arn(): String? = unwrap(this).getArn()

      public override fun createdTime(): String? = unwrap(this).getCreatedTime()

      public override fun description(): String? = unwrap(this).getDescription()

      public override fun detectorId(): String? = unwrap(this).getDetectorId()

      public override fun expression(): String? = unwrap(this).getExpression()

      public override fun language(): String? = unwrap(this).getLanguage()

      public override fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

      public override fun outcomes(): Any? = unwrap(this).getOutcomes()

      public override fun ruleId(): String? = unwrap(this).getRuleId()

      public override fun ruleVersion(): String? = unwrap(this).getRuleVersion()

      public override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnDetector.RuleProperty):
          RuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleProperty):
          software.amazon.awscdk.services.frauddetector.CfnDetector.RuleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ModelProperty {
    public fun arn(): String? = unwrap(this).getArn()

    public interface Builder {
      public fun arn(arn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.frauddetector.CfnDetector.ModelProperty.Builder =
          software.amazon.awscdk.services.frauddetector.CfnDetector.ModelProperty.builder()

      public override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build(): software.amazon.awscdk.services.frauddetector.CfnDetector.ModelProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.frauddetector.CfnDetector.ModelProperty,
    ) : ModelProperty {
      public override fun arn(): String? = unwrap(this).getArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ModelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnDetector.ModelProperty):
          ModelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelProperty):
          software.amazon.awscdk.services.frauddetector.CfnDetector.ModelProperty = (wrapped as
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
          software.amazon.awscdk.services.frauddetector.CfnDetector.EntityTypeProperty.Builder =
          software.amazon.awscdk.services.frauddetector.CfnDetector.EntityTypeProperty.builder()

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
          software.amazon.awscdk.services.frauddetector.CfnDetector.EntityTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.frauddetector.CfnDetector.EntityTypeProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnDetector.EntityTypeProperty):
          EntityTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EntityTypeProperty):
          software.amazon.awscdk.services.frauddetector.CfnDetector.EntityTypeProperty = (wrapped as
          Wrapper).cdkObject
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
          software.amazon.awscdk.services.frauddetector.CfnDetector.EventVariableProperty.Builder =
          software.amazon.awscdk.services.frauddetector.CfnDetector.EventVariableProperty.builder()

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
          software.amazon.awscdk.services.frauddetector.CfnDetector.EventVariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.frauddetector.CfnDetector.EventVariableProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnDetector.EventVariableProperty):
          EventVariableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventVariableProperty):
          software.amazon.awscdk.services.frauddetector.CfnDetector.EventVariableProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
