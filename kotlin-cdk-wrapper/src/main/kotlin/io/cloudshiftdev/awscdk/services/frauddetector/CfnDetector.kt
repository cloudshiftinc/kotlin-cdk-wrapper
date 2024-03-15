@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.frauddetector

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDetector internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.frauddetector.CfnDetector,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun associatedModels(): Any? = unwrap(this).getAssociatedModels()

  public open fun associatedModels(`value`: IResolvable) {
    unwrap(this).setAssociatedModels(`value`.let(IResolvable::unwrap))
  }

  public open fun associatedModels(__idx_ac66f0: List<Any>) {
    unwrap(this).setAssociatedModels(__idx_ac66f0)
  }

  public open fun associatedModels(vararg __idx_ac66f0: Any): Unit =
      associatedModels(__idx_ac66f0.toList())

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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  public open fun rules(vararg __idx_ac66f0: Any): Unit = rules(__idx_ac66f0.toList())

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun associatedModels(associatedModels: IResolvable)

    public fun associatedModels(associatedModels: List<Any>)

    public fun associatedModels(vararg associatedModels: Any)

    public fun description(description: String)

    public fun detectorId(detectorId: String)

    public fun detectorVersionStatus(detectorVersionStatus: String)

    public fun eventType(eventType: IResolvable)

    public fun eventType(eventType: EventTypeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1908bdf3c79730411659f2ed378d0a4ec38565e5f69568f793a845c4056359a0")
    public fun eventType(eventType: EventTypeProperty.Builder.() -> Unit)

    public fun ruleExecutionMode(ruleExecutionMode: String)

    public fun rules(rules: IResolvable)

    public fun rules(rules: List<Any>)

    public fun rules(vararg rules: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.frauddetector.CfnDetector.Builder =
        software.amazon.awscdk.services.frauddetector.CfnDetector.Builder.create(scope, id)

    override fun associatedModels(associatedModels: IResolvable) {
      cdkBuilder.associatedModels(associatedModels.let(IResolvable::unwrap))
    }

    override fun associatedModels(associatedModels: List<Any>) {
      cdkBuilder.associatedModels(associatedModels)
    }

    override fun associatedModels(vararg associatedModels: Any): Unit =
        associatedModels(associatedModels.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun detectorId(detectorId: String) {
      cdkBuilder.detectorId(detectorId)
    }

    override fun detectorVersionStatus(detectorVersionStatus: String) {
      cdkBuilder.detectorVersionStatus(detectorVersionStatus)
    }

    override fun eventType(eventType: IResolvable) {
      cdkBuilder.eventType(eventType.let(IResolvable::unwrap))
    }

    override fun eventType(eventType: EventTypeProperty) {
      cdkBuilder.eventType(eventType.let(EventTypeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1908bdf3c79730411659f2ed378d0a4ec38565e5f69568f793a845c4056359a0")
    override fun eventType(eventType: EventTypeProperty.Builder.() -> Unit): Unit =
        eventType(EventTypeProperty(eventType))

    override fun ruleExecutionMode(ruleExecutionMode: String) {
      cdkBuilder.ruleExecutionMode(ruleExecutionMode)
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

    public fun build(): software.amazon.awscdk.services.frauddetector.CfnDetector =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.frauddetector.CfnDetector.CFN_RESOURCE_TYPE_NAME

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

    @CdkDslMarker
    public interface Builder {
      public fun arn(arn: String)

      public fun createdTime(createdTime: String)

      public fun description(description: String)

      public fun `inline`(`inline`: Boolean)

      public fun `inline`(`inline`: IResolvable)

      public fun lastUpdatedTime(lastUpdatedTime: String)

      public fun name(name: String)

      public fun tags(tags: List<CfnTag>)

      public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.frauddetector.CfnDetector.LabelProperty.Builder =
          software.amazon.awscdk.services.frauddetector.CfnDetector.LabelProperty.builder()

      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      override fun createdTime(createdTime: String) {
        cdkBuilder.createdTime(createdTime)
      }

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun `inline`(`inline`: Boolean) {
        cdkBuilder.`inline`(`inline`)
      }

      override fun `inline`(`inline`: IResolvable) {
        cdkBuilder.`inline`(`inline`.let(IResolvable::unwrap))
      }

      override fun lastUpdatedTime(lastUpdatedTime: String) {
        cdkBuilder.lastUpdatedTime(lastUpdatedTime)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

      public fun build(): software.amazon.awscdk.services.frauddetector.CfnDetector.LabelProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.frauddetector.CfnDetector.LabelProperty,
    ) : CdkObject(cdkObject), LabelProperty {
      override fun arn(): String? = unwrap(this).getArn()

      override fun createdTime(): String? = unwrap(this).getCreatedTime()

      override fun description(): String? = unwrap(this).getDescription()

      override fun `inline`(): Any? = unwrap(this).getInline()

      override fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

      override fun name(): String? = unwrap(this).getName()

      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LabelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnDetector.LabelProperty):
          LabelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LabelProperty):
          software.amazon.awscdk.services.frauddetector.CfnDetector.LabelProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.frauddetector.CfnDetector.LabelProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun arn(arn: String)

      public fun createdTime(createdTime: String)

      public fun description(description: String)

      public fun entityTypes(entityTypes: IResolvable)

      public fun entityTypes(entityTypes: List<Any>)

      public fun entityTypes(vararg entityTypes: Any)

      public fun eventVariables(eventVariables: IResolvable)

      public fun eventVariables(eventVariables: List<Any>)

      public fun eventVariables(vararg eventVariables: Any)

      public fun `inline`(`inline`: Boolean)

      public fun `inline`(`inline`: IResolvable)

      public fun labels(labels: IResolvable)

      public fun labels(labels: List<Any>)

      public fun labels(vararg labels: Any)

      public fun lastUpdatedTime(lastUpdatedTime: String)

      public fun name(name: String)

      public fun tags(tags: List<CfnTag>)

      public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.frauddetector.CfnDetector.EventTypeProperty.Builder =
          software.amazon.awscdk.services.frauddetector.CfnDetector.EventTypeProperty.builder()

      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      override fun createdTime(createdTime: String) {
        cdkBuilder.createdTime(createdTime)
      }

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun entityTypes(entityTypes: IResolvable) {
        cdkBuilder.entityTypes(entityTypes.let(IResolvable::unwrap))
      }

      override fun entityTypes(entityTypes: List<Any>) {
        cdkBuilder.entityTypes(entityTypes)
      }

      override fun entityTypes(vararg entityTypes: Any): Unit = entityTypes(entityTypes.toList())

      override fun eventVariables(eventVariables: IResolvable) {
        cdkBuilder.eventVariables(eventVariables.let(IResolvable::unwrap))
      }

      override fun eventVariables(eventVariables: List<Any>) {
        cdkBuilder.eventVariables(eventVariables)
      }

      override fun eventVariables(vararg eventVariables: Any): Unit =
          eventVariables(eventVariables.toList())

      override fun `inline`(`inline`: Boolean) {
        cdkBuilder.`inline`(`inline`)
      }

      override fun `inline`(`inline`: IResolvable) {
        cdkBuilder.`inline`(`inline`.let(IResolvable::unwrap))
      }

      override fun labels(labels: IResolvable) {
        cdkBuilder.labels(labels.let(IResolvable::unwrap))
      }

      override fun labels(labels: List<Any>) {
        cdkBuilder.labels(labels)
      }

      override fun labels(vararg labels: Any): Unit = labels(labels.toList())

      override fun lastUpdatedTime(lastUpdatedTime: String) {
        cdkBuilder.lastUpdatedTime(lastUpdatedTime)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

      public fun build():
          software.amazon.awscdk.services.frauddetector.CfnDetector.EventTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.frauddetector.CfnDetector.EventTypeProperty,
    ) : CdkObject(cdkObject), EventTypeProperty {
      override fun arn(): String? = unwrap(this).getArn()

      override fun createdTime(): String? = unwrap(this).getCreatedTime()

      override fun description(): String? = unwrap(this).getDescription()

      override fun entityTypes(): Any? = unwrap(this).getEntityTypes()

      override fun eventVariables(): Any? = unwrap(this).getEventVariables()

      override fun `inline`(): Any? = unwrap(this).getInline()

      override fun labels(): Any? = unwrap(this).getLabels()

      override fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

      override fun name(): String? = unwrap(this).getName()

      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EventTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnDetector.EventTypeProperty):
          EventTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventTypeProperty):
          software.amazon.awscdk.services.frauddetector.CfnDetector.EventTypeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.frauddetector.CfnDetector.EventTypeProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun arn(arn: String)

      public fun createdTime(createdTime: String)

      public fun description(description: String)

      public fun `inline`(`inline`: Boolean)

      public fun `inline`(`inline`: IResolvable)

      public fun lastUpdatedTime(lastUpdatedTime: String)

      public fun name(name: String)

      public fun tags(tags: List<CfnTag>)

      public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.frauddetector.CfnDetector.OutcomeProperty.Builder =
          software.amazon.awscdk.services.frauddetector.CfnDetector.OutcomeProperty.builder()

      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      override fun createdTime(createdTime: String) {
        cdkBuilder.createdTime(createdTime)
      }

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun `inline`(`inline`: Boolean) {
        cdkBuilder.`inline`(`inline`)
      }

      override fun `inline`(`inline`: IResolvable) {
        cdkBuilder.`inline`(`inline`.let(IResolvable::unwrap))
      }

      override fun lastUpdatedTime(lastUpdatedTime: String) {
        cdkBuilder.lastUpdatedTime(lastUpdatedTime)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

      public fun build(): software.amazon.awscdk.services.frauddetector.CfnDetector.OutcomeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.frauddetector.CfnDetector.OutcomeProperty,
    ) : CdkObject(cdkObject), OutcomeProperty {
      override fun arn(): String? = unwrap(this).getArn()

      override fun createdTime(): String? = unwrap(this).getCreatedTime()

      override fun description(): String? = unwrap(this).getDescription()

      override fun `inline`(): Any? = unwrap(this).getInline()

      override fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

      override fun name(): String? = unwrap(this).getName()

      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutcomeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnDetector.OutcomeProperty):
          OutcomeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutcomeProperty):
          software.amazon.awscdk.services.frauddetector.CfnDetector.OutcomeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.frauddetector.CfnDetector.OutcomeProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun arn(arn: String)

      public fun createdTime(createdTime: String)

      public fun description(description: String)

      public fun detectorId(detectorId: String)

      public fun expression(expression: String)

      public fun language(language: String)

      public fun lastUpdatedTime(lastUpdatedTime: String)

      public fun outcomes(outcomes: IResolvable)

      public fun outcomes(outcomes: List<Any>)

      public fun outcomes(vararg outcomes: Any)

      public fun ruleId(ruleId: String)

      public fun ruleVersion(ruleVersion: String)

      public fun tags(tags: List<CfnTag>)

      public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.frauddetector.CfnDetector.RuleProperty.Builder =
          software.amazon.awscdk.services.frauddetector.CfnDetector.RuleProperty.builder()

      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      override fun createdTime(createdTime: String) {
        cdkBuilder.createdTime(createdTime)
      }

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun detectorId(detectorId: String) {
        cdkBuilder.detectorId(detectorId)
      }

      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      override fun language(language: String) {
        cdkBuilder.language(language)
      }

      override fun lastUpdatedTime(lastUpdatedTime: String) {
        cdkBuilder.lastUpdatedTime(lastUpdatedTime)
      }

      override fun outcomes(outcomes: IResolvable) {
        cdkBuilder.outcomes(outcomes.let(IResolvable::unwrap))
      }

      override fun outcomes(outcomes: List<Any>) {
        cdkBuilder.outcomes(outcomes)
      }

      override fun outcomes(vararg outcomes: Any): Unit = outcomes(outcomes.toList())

      override fun ruleId(ruleId: String) {
        cdkBuilder.ruleId(ruleId)
      }

      override fun ruleVersion(ruleVersion: String) {
        cdkBuilder.ruleVersion(ruleVersion)
      }

      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

      public fun build(): software.amazon.awscdk.services.frauddetector.CfnDetector.RuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.frauddetector.CfnDetector.RuleProperty,
    ) : CdkObject(cdkObject), RuleProperty {
      override fun arn(): String? = unwrap(this).getArn()

      override fun createdTime(): String? = unwrap(this).getCreatedTime()

      override fun description(): String? = unwrap(this).getDescription()

      override fun detectorId(): String? = unwrap(this).getDetectorId()

      override fun expression(): String? = unwrap(this).getExpression()

      override fun language(): String? = unwrap(this).getLanguage()

      override fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

      override fun outcomes(): Any? = unwrap(this).getOutcomes()

      override fun ruleId(): String? = unwrap(this).getRuleId()

      override fun ruleVersion(): String? = unwrap(this).getRuleVersion()

      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnDetector.RuleProperty):
          RuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleProperty):
          software.amazon.awscdk.services.frauddetector.CfnDetector.RuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.frauddetector.CfnDetector.RuleProperty
    }
  }

  public interface ModelProperty {
    public fun arn(): String? = unwrap(this).getArn()

    @CdkDslMarker
    public interface Builder {
      public fun arn(arn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.frauddetector.CfnDetector.ModelProperty.Builder =
          software.amazon.awscdk.services.frauddetector.CfnDetector.ModelProperty.builder()

      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build(): software.amazon.awscdk.services.frauddetector.CfnDetector.ModelProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.frauddetector.CfnDetector.ModelProperty,
    ) : CdkObject(cdkObject), ModelProperty {
      override fun arn(): String? = unwrap(this).getArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ModelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnDetector.ModelProperty):
          ModelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelProperty):
          software.amazon.awscdk.services.frauddetector.CfnDetector.ModelProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.frauddetector.CfnDetector.ModelProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun arn(arn: String)

      public fun createdTime(createdTime: String)

      public fun description(description: String)

      public fun `inline`(`inline`: Boolean)

      public fun `inline`(`inline`: IResolvable)

      public fun lastUpdatedTime(lastUpdatedTime: String)

      public fun name(name: String)

      public fun tags(tags: List<CfnTag>)

      public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.frauddetector.CfnDetector.EntityTypeProperty.Builder =
          software.amazon.awscdk.services.frauddetector.CfnDetector.EntityTypeProperty.builder()

      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      override fun createdTime(createdTime: String) {
        cdkBuilder.createdTime(createdTime)
      }

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun `inline`(`inline`: Boolean) {
        cdkBuilder.`inline`(`inline`)
      }

      override fun `inline`(`inline`: IResolvable) {
        cdkBuilder.`inline`(`inline`.let(IResolvable::unwrap))
      }

      override fun lastUpdatedTime(lastUpdatedTime: String) {
        cdkBuilder.lastUpdatedTime(lastUpdatedTime)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

      public fun build():
          software.amazon.awscdk.services.frauddetector.CfnDetector.EntityTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.frauddetector.CfnDetector.EntityTypeProperty,
    ) : CdkObject(cdkObject), EntityTypeProperty {
      override fun arn(): String? = unwrap(this).getArn()

      override fun createdTime(): String? = unwrap(this).getCreatedTime()

      override fun description(): String? = unwrap(this).getDescription()

      override fun `inline`(): Any? = unwrap(this).getInline()

      override fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

      override fun name(): String? = unwrap(this).getName()

      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EntityTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnDetector.EntityTypeProperty):
          EntityTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EntityTypeProperty):
          software.amazon.awscdk.services.frauddetector.CfnDetector.EntityTypeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.frauddetector.CfnDetector.EntityTypeProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun arn(arn: String)

      public fun createdTime(createdTime: String)

      public fun dataSource(dataSource: String)

      public fun dataType(dataType: String)

      public fun defaultValue(defaultValue: String)

      public fun description(description: String)

      public fun `inline`(`inline`: Boolean)

      public fun `inline`(`inline`: IResolvable)

      public fun lastUpdatedTime(lastUpdatedTime: String)

      public fun name(name: String)

      public fun tags(tags: List<CfnTag>)

      public fun tags(vararg tags: CfnTag)

      public fun variableType(variableType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.frauddetector.CfnDetector.EventVariableProperty.Builder =
          software.amazon.awscdk.services.frauddetector.CfnDetector.EventVariableProperty.builder()

      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      override fun createdTime(createdTime: String) {
        cdkBuilder.createdTime(createdTime)
      }

      override fun dataSource(dataSource: String) {
        cdkBuilder.dataSource(dataSource)
      }

      override fun dataType(dataType: String) {
        cdkBuilder.dataType(dataType)
      }

      override fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
      }

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun `inline`(`inline`: Boolean) {
        cdkBuilder.`inline`(`inline`)
      }

      override fun `inline`(`inline`: IResolvable) {
        cdkBuilder.`inline`(`inline`.let(IResolvable::unwrap))
      }

      override fun lastUpdatedTime(lastUpdatedTime: String) {
        cdkBuilder.lastUpdatedTime(lastUpdatedTime)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

      override fun variableType(variableType: String) {
        cdkBuilder.variableType(variableType)
      }

      public fun build():
          software.amazon.awscdk.services.frauddetector.CfnDetector.EventVariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.frauddetector.CfnDetector.EventVariableProperty,
    ) : CdkObject(cdkObject), EventVariableProperty {
      override fun arn(): String? = unwrap(this).getArn()

      override fun createdTime(): String? = unwrap(this).getCreatedTime()

      override fun dataSource(): String? = unwrap(this).getDataSource()

      override fun dataType(): String? = unwrap(this).getDataType()

      override fun defaultValue(): String? = unwrap(this).getDefaultValue()

      override fun description(): String? = unwrap(this).getDescription()

      override fun `inline`(): Any? = unwrap(this).getInline()

      override fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

      override fun name(): String? = unwrap(this).getName()

      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

      override fun variableType(): String? = unwrap(this).getVariableType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EventVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnDetector.EventVariableProperty):
          EventVariableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventVariableProperty):
          software.amazon.awscdk.services.frauddetector.CfnDetector.EventVariableProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.frauddetector.CfnDetector.EventVariableProperty
    }
  }
}
