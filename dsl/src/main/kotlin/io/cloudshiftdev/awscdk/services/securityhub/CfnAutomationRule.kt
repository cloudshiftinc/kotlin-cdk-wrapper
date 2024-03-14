package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
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

public open class CfnAutomationRule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun actions(): Any? = unwrap(this).getActions()

  public open fun actions(`value`: IResolvable) {
    unwrap(this).setActions(`value`.let(IResolvable::unwrap))
  }

  public open fun actions(__idx_ac66f0: List<Any>) {
    unwrap(this).setActions(__idx_ac66f0)
  }

  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrCreatedBy(): String = unwrap(this).getAttrCreatedBy()

  public open fun attrRuleArn(): String = unwrap(this).getAttrRuleArn()

  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun criteria(): Any? = unwrap(this).getCriteria()

  public open fun criteria(`value`: IResolvable) {
    unwrap(this).setCriteria(`value`.let(IResolvable::unwrap))
  }

  public open fun criteria(`value`: AutomationRulesFindingFiltersProperty) {
    unwrap(this).setCriteria(`value`.let(AutomationRulesFindingFiltersProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7d1705ddd0b2135b88828aed825e0b0ce3012e29b786bfdfce4d6cd60acecf58")
  public open fun criteria(`value`: AutomationRulesFindingFiltersProperty.Builder.() -> Unit): Unit
      = criteria(AutomationRulesFindingFiltersProperty(`value`))

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun isTerminal(): Any? = unwrap(this).getIsTerminal()

  public open fun isTerminal(`value`: Boolean) {
    unwrap(this).setIsTerminal(`value`)
  }

  public open fun isTerminal(`value`: IResolvable) {
    unwrap(this).setIsTerminal(`value`.let(IResolvable::unwrap))
  }

  public open fun ruleName(): String? = unwrap(this).getRuleName()

  public open fun ruleName(`value`: String) {
    unwrap(this).setRuleName(`value`)
  }

  public open fun ruleOrder(): Number? = unwrap(this).getRuleOrder()

  public open fun ruleOrder(`value`: Number) {
    unwrap(this).setRuleOrder(`value`)
  }

  public open fun ruleStatus(): String? = unwrap(this).getRuleStatus()

  public open fun ruleStatus(`value`: String) {
    unwrap(this).setRuleStatus(`value`)
  }

  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  public interface Builder {
    public fun actions(actions: IResolvable)

    public fun actions(actions: List<Any>)

    public fun criteria(criteria: IResolvable)

    public fun criteria(criteria: AutomationRulesFindingFiltersProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("135935e2b9aeab7dd2476700f8acf596a520fc2014f76071e71ae8c8b1b8754b")
    public fun criteria(criteria: AutomationRulesFindingFiltersProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun isTerminal(isTerminal: Boolean)

    public fun isTerminal(isTerminal: IResolvable)

    public fun ruleName(ruleName: String)

    public fun ruleOrder(ruleOrder: Number)

    public fun ruleStatus(ruleStatus: String)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.securityhub.CfnAutomationRule.Builder =
        software.amazon.awscdk.services.securityhub.CfnAutomationRule.Builder.create(scope, id)

    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable::unwrap))
    }

    override fun actions(actions: List<Any>) {
      cdkBuilder.actions(actions)
    }

    override fun criteria(criteria: IResolvable) {
      cdkBuilder.criteria(criteria.let(IResolvable::unwrap))
    }

    override fun criteria(criteria: AutomationRulesFindingFiltersProperty) {
      cdkBuilder.criteria(criteria.let(AutomationRulesFindingFiltersProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("135935e2b9aeab7dd2476700f8acf596a520fc2014f76071e71ae8c8b1b8754b")
    override fun criteria(criteria: AutomationRulesFindingFiltersProperty.Builder.() -> Unit): Unit
        = criteria(AutomationRulesFindingFiltersProperty(criteria))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun isTerminal(isTerminal: Boolean) {
      cdkBuilder.isTerminal(isTerminal)
    }

    override fun isTerminal(isTerminal: IResolvable) {
      cdkBuilder.isTerminal(isTerminal.let(IResolvable::unwrap))
    }

    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    override fun ruleOrder(ruleOrder: Number) {
      cdkBuilder.ruleOrder(ruleOrder)
    }

    override fun ruleStatus(ruleStatus: String) {
      cdkBuilder.ruleStatus(ruleStatus)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnAutomationRule =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAutomationRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAutomationRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule):
        CfnAutomationRule = CfnAutomationRule(cdkObject)

    internal fun unwrap(wrapped: CfnAutomationRule):
        software.amazon.awscdk.services.securityhub.CfnAutomationRule = wrapped.cdkObject
  }

  public interface SeverityUpdateProperty {
    public fun label(): String? = unwrap(this).getLabel()

    public fun normalized(): Number? = unwrap(this).getNormalized()

    public fun product(): Number? = unwrap(this).getProduct()

    public interface Builder {
      public fun label(label: String)

      public fun normalized(normalized: Number)

      public fun product(product: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.SeverityUpdateProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.SeverityUpdateProperty.builder()

      override fun label(label: String) {
        cdkBuilder.label(label)
      }

      override fun normalized(normalized: Number) {
        cdkBuilder.normalized(normalized)
      }

      override fun product(product: Number) {
        cdkBuilder.product(product)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.SeverityUpdateProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.SeverityUpdateProperty,
    ) : SeverityUpdateProperty {
      override fun label(): String? = unwrap(this).getLabel()

      override fun normalized(): Number? = unwrap(this).getNormalized()

      override fun product(): Number? = unwrap(this).getProduct()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SeverityUpdateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.SeverityUpdateProperty):
          SeverityUpdateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SeverityUpdateProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.SeverityUpdateProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MapFilterProperty {
    public fun comparison(): String

    public fun key(): String

    public fun `value`(): String

    public interface Builder {
      public fun comparison(comparison: String)

      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.MapFilterProperty.Builder =
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.MapFilterProperty.builder()

      override fun comparison(comparison: String) {
        cdkBuilder.comparison(comparison)
      }

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.MapFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.MapFilterProperty,
    ) : MapFilterProperty {
      override fun comparison(): String = unwrap(this).getComparison()

      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MapFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.MapFilterProperty):
          MapFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MapFilterProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.MapFilterProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface DateRangeProperty {
    public fun unit(): String

    public fun `value`(): Number

    public interface Builder {
      public fun unit(unit: String)

      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.DateRangeProperty.Builder =
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.DateRangeProperty.builder()

      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.DateRangeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.DateRangeProperty,
    ) : DateRangeProperty {
      override fun unit(): String = unwrap(this).getUnit()

      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DateRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.DateRangeProperty):
          DateRangeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DateRangeProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.DateRangeProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface WorkflowUpdateProperty {
    public fun status(): String

    public interface Builder {
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.WorkflowUpdateProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.WorkflowUpdateProperty.builder()

      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.WorkflowUpdateProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.WorkflowUpdateProperty,
    ) : WorkflowUpdateProperty {
      override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): WorkflowUpdateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.WorkflowUpdateProperty):
          WorkflowUpdateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkflowUpdateProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.WorkflowUpdateProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AutomationRulesFindingFiltersProperty {
    public fun awsAccountId(): Any? = unwrap(this).getAwsAccountId()

    public fun companyName(): Any? = unwrap(this).getCompanyName()

    public fun complianceAssociatedStandardsId(): Any? =
        unwrap(this).getComplianceAssociatedStandardsId()

    public fun complianceSecurityControlId(): Any? = unwrap(this).getComplianceSecurityControlId()

    public fun complianceStatus(): Any? = unwrap(this).getComplianceStatus()

    public fun confidence(): Any? = unwrap(this).getConfidence()

    public fun createdAt(): Any? = unwrap(this).getCreatedAt()

    public fun criticality(): Any? = unwrap(this).getCriticality()

    public fun description(): Any? = unwrap(this).getDescription()

    public fun firstObservedAt(): Any? = unwrap(this).getFirstObservedAt()

    public fun generatorId(): Any? = unwrap(this).getGeneratorId()

    public fun id(): Any? = unwrap(this).getId()

    public fun lastObservedAt(): Any? = unwrap(this).getLastObservedAt()

    public fun noteText(): Any? = unwrap(this).getNoteText()

    public fun noteUpdatedAt(): Any? = unwrap(this).getNoteUpdatedAt()

    public fun noteUpdatedBy(): Any? = unwrap(this).getNoteUpdatedBy()

    public fun productArn(): Any? = unwrap(this).getProductArn()

    public fun productName(): Any? = unwrap(this).getProductName()

    public fun recordState(): Any? = unwrap(this).getRecordState()

    public fun relatedFindingsId(): Any? = unwrap(this).getRelatedFindingsId()

    public fun relatedFindingsProductArn(): Any? = unwrap(this).getRelatedFindingsProductArn()

    public fun resourceDetailsOther(): Any? = unwrap(this).getResourceDetailsOther()

    public fun resourceId(): Any? = unwrap(this).getResourceId()

    public fun resourcePartition(): Any? = unwrap(this).getResourcePartition()

    public fun resourceRegion(): Any? = unwrap(this).getResourceRegion()

    public fun resourceTags(): Any? = unwrap(this).getResourceTags()

    public fun resourceType(): Any? = unwrap(this).getResourceType()

    public fun severityLabel(): Any? = unwrap(this).getSeverityLabel()

    public fun sourceUrl(): Any? = unwrap(this).getSourceUrl()

    public fun title(): Any? = unwrap(this).getTitle()

    public fun type(): Any? = unwrap(this).getType()

    public fun updatedAt(): Any? = unwrap(this).getUpdatedAt()

    public fun userDefinedFields(): Any? = unwrap(this).getUserDefinedFields()

    public fun verificationState(): Any? = unwrap(this).getVerificationState()

    public fun workflowStatus(): Any? = unwrap(this).getWorkflowStatus()

    public interface Builder {
      public fun awsAccountId(awsAccountId: IResolvable)

      public fun awsAccountId(awsAccountId: List<Any>)

      public fun companyName(companyName: IResolvable)

      public fun companyName(companyName: List<Any>)

      public fun complianceAssociatedStandardsId(complianceAssociatedStandardsId: IResolvable)

      public fun complianceAssociatedStandardsId(complianceAssociatedStandardsId: List<Any>)

      public fun complianceSecurityControlId(complianceSecurityControlId: IResolvable)

      public fun complianceSecurityControlId(complianceSecurityControlId: List<Any>)

      public fun complianceStatus(complianceStatus: IResolvable)

      public fun complianceStatus(complianceStatus: List<Any>)

      public fun confidence(confidence: IResolvable)

      public fun confidence(confidence: List<Any>)

      public fun createdAt(createdAt: IResolvable)

      public fun createdAt(createdAt: List<Any>)

      public fun criticality(criticality: IResolvable)

      public fun criticality(criticality: List<Any>)

      public fun description(description: IResolvable)

      public fun description(description: List<Any>)

      public fun firstObservedAt(firstObservedAt: IResolvable)

      public fun firstObservedAt(firstObservedAt: List<Any>)

      public fun generatorId(generatorId: IResolvable)

      public fun generatorId(generatorId: List<Any>)

      public fun id(id: IResolvable)

      public fun id(id: List<Any>)

      public fun lastObservedAt(lastObservedAt: IResolvable)

      public fun lastObservedAt(lastObservedAt: List<Any>)

      public fun noteText(noteText: IResolvable)

      public fun noteText(noteText: List<Any>)

      public fun noteUpdatedAt(noteUpdatedAt: IResolvable)

      public fun noteUpdatedAt(noteUpdatedAt: List<Any>)

      public fun noteUpdatedBy(noteUpdatedBy: IResolvable)

      public fun noteUpdatedBy(noteUpdatedBy: List<Any>)

      public fun productArn(productArn: IResolvable)

      public fun productArn(productArn: List<Any>)

      public fun productName(productName: IResolvable)

      public fun productName(productName: List<Any>)

      public fun recordState(recordState: IResolvable)

      public fun recordState(recordState: List<Any>)

      public fun relatedFindingsId(relatedFindingsId: IResolvable)

      public fun relatedFindingsId(relatedFindingsId: List<Any>)

      public fun relatedFindingsProductArn(relatedFindingsProductArn: IResolvable)

      public fun relatedFindingsProductArn(relatedFindingsProductArn: List<Any>)

      public fun resourceDetailsOther(resourceDetailsOther: IResolvable)

      public fun resourceDetailsOther(resourceDetailsOther: List<Any>)

      public fun resourceId(resourceId: IResolvable)

      public fun resourceId(resourceId: List<Any>)

      public fun resourcePartition(resourcePartition: IResolvable)

      public fun resourcePartition(resourcePartition: List<Any>)

      public fun resourceRegion(resourceRegion: IResolvable)

      public fun resourceRegion(resourceRegion: List<Any>)

      public fun resourceTags(resourceTags: IResolvable)

      public fun resourceTags(resourceTags: List<Any>)

      public fun resourceType(resourceType: IResolvable)

      public fun resourceType(resourceType: List<Any>)

      public fun severityLabel(severityLabel: IResolvable)

      public fun severityLabel(severityLabel: List<Any>)

      public fun sourceUrl(sourceUrl: IResolvable)

      public fun sourceUrl(sourceUrl: List<Any>)

      public fun title(title: IResolvable)

      public fun title(title: List<Any>)

      public fun type(type: IResolvable)

      public fun type(type: List<Any>)

      public fun updatedAt(updatedAt: IResolvable)

      public fun updatedAt(updatedAt: List<Any>)

      public fun userDefinedFields(userDefinedFields: IResolvable)

      public fun userDefinedFields(userDefinedFields: List<Any>)

      public fun verificationState(verificationState: IResolvable)

      public fun verificationState(verificationState: List<Any>)

      public fun workflowStatus(workflowStatus: IResolvable)

      public fun workflowStatus(workflowStatus: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesFindingFiltersProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesFindingFiltersProperty.builder()

      override fun awsAccountId(awsAccountId: IResolvable) {
        cdkBuilder.awsAccountId(awsAccountId.let(IResolvable::unwrap))
      }

      override fun awsAccountId(awsAccountId: List<Any>) {
        cdkBuilder.awsAccountId(awsAccountId)
      }

      override fun companyName(companyName: IResolvable) {
        cdkBuilder.companyName(companyName.let(IResolvable::unwrap))
      }

      override fun companyName(companyName: List<Any>) {
        cdkBuilder.companyName(companyName)
      }

      override fun complianceAssociatedStandardsId(complianceAssociatedStandardsId: IResolvable) {
        cdkBuilder.complianceAssociatedStandardsId(complianceAssociatedStandardsId.let(IResolvable::unwrap))
      }

      override fun complianceAssociatedStandardsId(complianceAssociatedStandardsId: List<Any>) {
        cdkBuilder.complianceAssociatedStandardsId(complianceAssociatedStandardsId)
      }

      override fun complianceSecurityControlId(complianceSecurityControlId: IResolvable) {
        cdkBuilder.complianceSecurityControlId(complianceSecurityControlId.let(IResolvable::unwrap))
      }

      override fun complianceSecurityControlId(complianceSecurityControlId: List<Any>) {
        cdkBuilder.complianceSecurityControlId(complianceSecurityControlId)
      }

      override fun complianceStatus(complianceStatus: IResolvable) {
        cdkBuilder.complianceStatus(complianceStatus.let(IResolvable::unwrap))
      }

      override fun complianceStatus(complianceStatus: List<Any>) {
        cdkBuilder.complianceStatus(complianceStatus)
      }

      override fun confidence(confidence: IResolvable) {
        cdkBuilder.confidence(confidence.let(IResolvable::unwrap))
      }

      override fun confidence(confidence: List<Any>) {
        cdkBuilder.confidence(confidence)
      }

      override fun createdAt(createdAt: IResolvable) {
        cdkBuilder.createdAt(createdAt.let(IResolvable::unwrap))
      }

      override fun createdAt(createdAt: List<Any>) {
        cdkBuilder.createdAt(createdAt)
      }

      override fun criticality(criticality: IResolvable) {
        cdkBuilder.criticality(criticality.let(IResolvable::unwrap))
      }

      override fun criticality(criticality: List<Any>) {
        cdkBuilder.criticality(criticality)
      }

      override fun description(description: IResolvable) {
        cdkBuilder.description(description.let(IResolvable::unwrap))
      }

      override fun description(description: List<Any>) {
        cdkBuilder.description(description)
      }

      override fun firstObservedAt(firstObservedAt: IResolvable) {
        cdkBuilder.firstObservedAt(firstObservedAt.let(IResolvable::unwrap))
      }

      override fun firstObservedAt(firstObservedAt: List<Any>) {
        cdkBuilder.firstObservedAt(firstObservedAt)
      }

      override fun generatorId(generatorId: IResolvable) {
        cdkBuilder.generatorId(generatorId.let(IResolvable::unwrap))
      }

      override fun generatorId(generatorId: List<Any>) {
        cdkBuilder.generatorId(generatorId)
      }

      override fun id(id: IResolvable) {
        cdkBuilder.id(id.let(IResolvable::unwrap))
      }

      override fun id(id: List<Any>) {
        cdkBuilder.id(id)
      }

      override fun lastObservedAt(lastObservedAt: IResolvable) {
        cdkBuilder.lastObservedAt(lastObservedAt.let(IResolvable::unwrap))
      }

      override fun lastObservedAt(lastObservedAt: List<Any>) {
        cdkBuilder.lastObservedAt(lastObservedAt)
      }

      override fun noteText(noteText: IResolvable) {
        cdkBuilder.noteText(noteText.let(IResolvable::unwrap))
      }

      override fun noteText(noteText: List<Any>) {
        cdkBuilder.noteText(noteText)
      }

      override fun noteUpdatedAt(noteUpdatedAt: IResolvable) {
        cdkBuilder.noteUpdatedAt(noteUpdatedAt.let(IResolvable::unwrap))
      }

      override fun noteUpdatedAt(noteUpdatedAt: List<Any>) {
        cdkBuilder.noteUpdatedAt(noteUpdatedAt)
      }

      override fun noteUpdatedBy(noteUpdatedBy: IResolvable) {
        cdkBuilder.noteUpdatedBy(noteUpdatedBy.let(IResolvable::unwrap))
      }

      override fun noteUpdatedBy(noteUpdatedBy: List<Any>) {
        cdkBuilder.noteUpdatedBy(noteUpdatedBy)
      }

      override fun productArn(productArn: IResolvable) {
        cdkBuilder.productArn(productArn.let(IResolvable::unwrap))
      }

      override fun productArn(productArn: List<Any>) {
        cdkBuilder.productArn(productArn)
      }

      override fun productName(productName: IResolvable) {
        cdkBuilder.productName(productName.let(IResolvable::unwrap))
      }

      override fun productName(productName: List<Any>) {
        cdkBuilder.productName(productName)
      }

      override fun recordState(recordState: IResolvable) {
        cdkBuilder.recordState(recordState.let(IResolvable::unwrap))
      }

      override fun recordState(recordState: List<Any>) {
        cdkBuilder.recordState(recordState)
      }

      override fun relatedFindingsId(relatedFindingsId: IResolvable) {
        cdkBuilder.relatedFindingsId(relatedFindingsId.let(IResolvable::unwrap))
      }

      override fun relatedFindingsId(relatedFindingsId: List<Any>) {
        cdkBuilder.relatedFindingsId(relatedFindingsId)
      }

      override fun relatedFindingsProductArn(relatedFindingsProductArn: IResolvable) {
        cdkBuilder.relatedFindingsProductArn(relatedFindingsProductArn.let(IResolvable::unwrap))
      }

      override fun relatedFindingsProductArn(relatedFindingsProductArn: List<Any>) {
        cdkBuilder.relatedFindingsProductArn(relatedFindingsProductArn)
      }

      override fun resourceDetailsOther(resourceDetailsOther: IResolvable) {
        cdkBuilder.resourceDetailsOther(resourceDetailsOther.let(IResolvable::unwrap))
      }

      override fun resourceDetailsOther(resourceDetailsOther: List<Any>) {
        cdkBuilder.resourceDetailsOther(resourceDetailsOther)
      }

      override fun resourceId(resourceId: IResolvable) {
        cdkBuilder.resourceId(resourceId.let(IResolvable::unwrap))
      }

      override fun resourceId(resourceId: List<Any>) {
        cdkBuilder.resourceId(resourceId)
      }

      override fun resourcePartition(resourcePartition: IResolvable) {
        cdkBuilder.resourcePartition(resourcePartition.let(IResolvable::unwrap))
      }

      override fun resourcePartition(resourcePartition: List<Any>) {
        cdkBuilder.resourcePartition(resourcePartition)
      }

      override fun resourceRegion(resourceRegion: IResolvable) {
        cdkBuilder.resourceRegion(resourceRegion.let(IResolvable::unwrap))
      }

      override fun resourceRegion(resourceRegion: List<Any>) {
        cdkBuilder.resourceRegion(resourceRegion)
      }

      override fun resourceTags(resourceTags: IResolvable) {
        cdkBuilder.resourceTags(resourceTags.let(IResolvable::unwrap))
      }

      override fun resourceTags(resourceTags: List<Any>) {
        cdkBuilder.resourceTags(resourceTags)
      }

      override fun resourceType(resourceType: IResolvable) {
        cdkBuilder.resourceType(resourceType.let(IResolvable::unwrap))
      }

      override fun resourceType(resourceType: List<Any>) {
        cdkBuilder.resourceType(resourceType)
      }

      override fun severityLabel(severityLabel: IResolvable) {
        cdkBuilder.severityLabel(severityLabel.let(IResolvable::unwrap))
      }

      override fun severityLabel(severityLabel: List<Any>) {
        cdkBuilder.severityLabel(severityLabel)
      }

      override fun sourceUrl(sourceUrl: IResolvable) {
        cdkBuilder.sourceUrl(sourceUrl.let(IResolvable::unwrap))
      }

      override fun sourceUrl(sourceUrl: List<Any>) {
        cdkBuilder.sourceUrl(sourceUrl)
      }

      override fun title(title: IResolvable) {
        cdkBuilder.title(title.let(IResolvable::unwrap))
      }

      override fun title(title: List<Any>) {
        cdkBuilder.title(title)
      }

      override fun type(type: IResolvable) {
        cdkBuilder.type(type.let(IResolvable::unwrap))
      }

      override fun type(type: List<Any>) {
        cdkBuilder.type(type)
      }

      override fun updatedAt(updatedAt: IResolvable) {
        cdkBuilder.updatedAt(updatedAt.let(IResolvable::unwrap))
      }

      override fun updatedAt(updatedAt: List<Any>) {
        cdkBuilder.updatedAt(updatedAt)
      }

      override fun userDefinedFields(userDefinedFields: IResolvable) {
        cdkBuilder.userDefinedFields(userDefinedFields.let(IResolvable::unwrap))
      }

      override fun userDefinedFields(userDefinedFields: List<Any>) {
        cdkBuilder.userDefinedFields(userDefinedFields)
      }

      override fun verificationState(verificationState: IResolvable) {
        cdkBuilder.verificationState(verificationState.let(IResolvable::unwrap))
      }

      override fun verificationState(verificationState: List<Any>) {
        cdkBuilder.verificationState(verificationState)
      }

      override fun workflowStatus(workflowStatus: IResolvable) {
        cdkBuilder.workflowStatus(workflowStatus.let(IResolvable::unwrap))
      }

      override fun workflowStatus(workflowStatus: List<Any>) {
        cdkBuilder.workflowStatus(workflowStatus)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesFindingFiltersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesFindingFiltersProperty,
    ) : AutomationRulesFindingFiltersProperty {
      override fun awsAccountId(): Any? = unwrap(this).getAwsAccountId()

      override fun companyName(): Any? = unwrap(this).getCompanyName()

      override fun complianceAssociatedStandardsId(): Any? =
          unwrap(this).getComplianceAssociatedStandardsId()

      override fun complianceSecurityControlId(): Any? =
          unwrap(this).getComplianceSecurityControlId()

      override fun complianceStatus(): Any? = unwrap(this).getComplianceStatus()

      override fun confidence(): Any? = unwrap(this).getConfidence()

      override fun createdAt(): Any? = unwrap(this).getCreatedAt()

      override fun criticality(): Any? = unwrap(this).getCriticality()

      override fun description(): Any? = unwrap(this).getDescription()

      override fun firstObservedAt(): Any? = unwrap(this).getFirstObservedAt()

      override fun generatorId(): Any? = unwrap(this).getGeneratorId()

      override fun id(): Any? = unwrap(this).getId()

      override fun lastObservedAt(): Any? = unwrap(this).getLastObservedAt()

      override fun noteText(): Any? = unwrap(this).getNoteText()

      override fun noteUpdatedAt(): Any? = unwrap(this).getNoteUpdatedAt()

      override fun noteUpdatedBy(): Any? = unwrap(this).getNoteUpdatedBy()

      override fun productArn(): Any? = unwrap(this).getProductArn()

      override fun productName(): Any? = unwrap(this).getProductName()

      override fun recordState(): Any? = unwrap(this).getRecordState()

      override fun relatedFindingsId(): Any? = unwrap(this).getRelatedFindingsId()

      override fun relatedFindingsProductArn(): Any? = unwrap(this).getRelatedFindingsProductArn()

      override fun resourceDetailsOther(): Any? = unwrap(this).getResourceDetailsOther()

      override fun resourceId(): Any? = unwrap(this).getResourceId()

      override fun resourcePartition(): Any? = unwrap(this).getResourcePartition()

      override fun resourceRegion(): Any? = unwrap(this).getResourceRegion()

      override fun resourceTags(): Any? = unwrap(this).getResourceTags()

      override fun resourceType(): Any? = unwrap(this).getResourceType()

      override fun severityLabel(): Any? = unwrap(this).getSeverityLabel()

      override fun sourceUrl(): Any? = unwrap(this).getSourceUrl()

      override fun title(): Any? = unwrap(this).getTitle()

      override fun type(): Any? = unwrap(this).getType()

      override fun updatedAt(): Any? = unwrap(this).getUpdatedAt()

      override fun userDefinedFields(): Any? = unwrap(this).getUserDefinedFields()

      override fun verificationState(): Any? = unwrap(this).getVerificationState()

      override fun workflowStatus(): Any? = unwrap(this).getWorkflowStatus()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AutomationRulesFindingFiltersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesFindingFiltersProperty):
          AutomationRulesFindingFiltersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutomationRulesFindingFiltersProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesFindingFiltersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RelatedFindingProperty {
    public fun id(): Any

    public fun productArn(): String

    public interface Builder {
      public fun id(id: Any)

      public fun productArn(productArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.RelatedFindingProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.RelatedFindingProperty.builder()

      override fun id(id: Any) {
        cdkBuilder.id(id)
      }

      override fun productArn(productArn: String) {
        cdkBuilder.productArn(productArn)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.RelatedFindingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.RelatedFindingProperty,
    ) : RelatedFindingProperty {
      override fun id(): Any = unwrap(this).getId()

      override fun productArn(): String = unwrap(this).getProductArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RelatedFindingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.RelatedFindingProperty):
          RelatedFindingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RelatedFindingProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.RelatedFindingProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DateFilterProperty {
    public fun dateRange(): Any? = unwrap(this).getDateRange()

    public fun end(): String? = unwrap(this).getEnd()

    public fun start(): String? = unwrap(this).getStart()

    public interface Builder {
      public fun dateRange(dateRange: IResolvable)

      public fun dateRange(dateRange: DateRangeProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fd591f68a01c43a95bf7629f4b5eb43f0b12dfef81656f6b65a55e993c495318")
      public fun dateRange(dateRange: DateRangeProperty.Builder.() -> Unit)

      public fun end(end: String)

      public fun start(start: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.DateFilterProperty.Builder =
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.DateFilterProperty.builder()

      override fun dateRange(dateRange: IResolvable) {
        cdkBuilder.dateRange(dateRange.let(IResolvable::unwrap))
      }

      override fun dateRange(dateRange: DateRangeProperty) {
        cdkBuilder.dateRange(dateRange.let(DateRangeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fd591f68a01c43a95bf7629f4b5eb43f0b12dfef81656f6b65a55e993c495318")
      override fun dateRange(dateRange: DateRangeProperty.Builder.() -> Unit): Unit =
          dateRange(DateRangeProperty(dateRange))

      override fun end(end: String) {
        cdkBuilder.end(end)
      }

      override fun start(start: String) {
        cdkBuilder.start(start)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.DateFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.DateFilterProperty,
    ) : DateFilterProperty {
      override fun dateRange(): Any? = unwrap(this).getDateRange()

      override fun end(): String? = unwrap(this).getEnd()

      override fun start(): String? = unwrap(this).getStart()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DateFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.DateFilterProperty):
          DateFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DateFilterProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.DateFilterProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface NoteUpdateProperty {
    public fun text(): String

    public fun updatedBy(): Any

    public interface Builder {
      public fun text(text: String)

      public fun updatedBy(updatedBy: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.NoteUpdateProperty.Builder =
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.NoteUpdateProperty.builder()

      override fun text(text: String) {
        cdkBuilder.text(text)
      }

      override fun updatedBy(updatedBy: Any) {
        cdkBuilder.updatedBy(updatedBy)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.NoteUpdateProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.NoteUpdateProperty,
    ) : NoteUpdateProperty {
      override fun text(): String = unwrap(this).getText()

      override fun updatedBy(): Any = unwrap(this).getUpdatedBy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NoteUpdateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.NoteUpdateProperty):
          NoteUpdateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NoteUpdateProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.NoteUpdateProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AutomationRulesFindingFieldsUpdateProperty {
    public fun confidence(): Number? = unwrap(this).getConfidence()

    public fun criticality(): Number? = unwrap(this).getCriticality()

    public fun note(): Any? = unwrap(this).getNote()

    public fun relatedFindings(): Any? = unwrap(this).getRelatedFindings()

    public fun severity(): Any? = unwrap(this).getSeverity()

    public fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()

    public fun userDefinedFields(): Any? = unwrap(this).getUserDefinedFields()

    public fun verificationState(): String? = unwrap(this).getVerificationState()

    public fun workflow(): Any? = unwrap(this).getWorkflow()

    public interface Builder {
      public fun confidence(confidence: Number)

      public fun criticality(criticality: Number)

      public fun note(note: IResolvable)

      public fun note(note: NoteUpdateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("72379505fd3f18cca4f46ba7ad6532ed15e68d45ce50c32089e85f2f9d531ecd")
      public fun note(note: NoteUpdateProperty.Builder.() -> Unit)

      public fun relatedFindings(relatedFindings: IResolvable)

      public fun relatedFindings(relatedFindings: List<Any>)

      public fun severity(severity: IResolvable)

      public fun severity(severity: SeverityUpdateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("500bb85fb2d022fb7610811da54b2440bcbdb9429760513eaa3fce97736539a3")
      public fun severity(severity: SeverityUpdateProperty.Builder.() -> Unit)

      public fun types(types: List<String>)

      public fun userDefinedFields(userDefinedFields: IResolvable)

      public fun userDefinedFields(userDefinedFields: Map<String, String>)

      public fun verificationState(verificationState: String)

      public fun workflow(workflow: IResolvable)

      public fun workflow(workflow: WorkflowUpdateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6504fe5e9999d895f655b17bb81cf4ae03527b5f7ad2d746c1344c950dbc0e57")
      public fun workflow(workflow: WorkflowUpdateProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesFindingFieldsUpdateProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesFindingFieldsUpdateProperty.builder()

      override fun confidence(confidence: Number) {
        cdkBuilder.confidence(confidence)
      }

      override fun criticality(criticality: Number) {
        cdkBuilder.criticality(criticality)
      }

      override fun note(note: IResolvable) {
        cdkBuilder.note(note.let(IResolvable::unwrap))
      }

      override fun note(note: NoteUpdateProperty) {
        cdkBuilder.note(note.let(NoteUpdateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("72379505fd3f18cca4f46ba7ad6532ed15e68d45ce50c32089e85f2f9d531ecd")
      override fun note(note: NoteUpdateProperty.Builder.() -> Unit): Unit =
          note(NoteUpdateProperty(note))

      override fun relatedFindings(relatedFindings: IResolvable) {
        cdkBuilder.relatedFindings(relatedFindings.let(IResolvable::unwrap))
      }

      override fun relatedFindings(relatedFindings: List<Any>) {
        cdkBuilder.relatedFindings(relatedFindings)
      }

      override fun severity(severity: IResolvable) {
        cdkBuilder.severity(severity.let(IResolvable::unwrap))
      }

      override fun severity(severity: SeverityUpdateProperty) {
        cdkBuilder.severity(severity.let(SeverityUpdateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("500bb85fb2d022fb7610811da54b2440bcbdb9429760513eaa3fce97736539a3")
      override fun severity(severity: SeverityUpdateProperty.Builder.() -> Unit): Unit =
          severity(SeverityUpdateProperty(severity))

      override fun types(types: List<String>) {
        cdkBuilder.types(types)
      }

      override fun userDefinedFields(userDefinedFields: IResolvable) {
        cdkBuilder.userDefinedFields(userDefinedFields.let(IResolvable::unwrap))
      }

      override fun userDefinedFields(userDefinedFields: Map<String, String>) {
        cdkBuilder.userDefinedFields(userDefinedFields)
      }

      override fun verificationState(verificationState: String) {
        cdkBuilder.verificationState(verificationState)
      }

      override fun workflow(workflow: IResolvable) {
        cdkBuilder.workflow(workflow.let(IResolvable::unwrap))
      }

      override fun workflow(workflow: WorkflowUpdateProperty) {
        cdkBuilder.workflow(workflow.let(WorkflowUpdateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6504fe5e9999d895f655b17bb81cf4ae03527b5f7ad2d746c1344c950dbc0e57")
      override fun workflow(workflow: WorkflowUpdateProperty.Builder.() -> Unit): Unit =
          workflow(WorkflowUpdateProperty(workflow))

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesFindingFieldsUpdateProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesFindingFieldsUpdateProperty,
    ) : AutomationRulesFindingFieldsUpdateProperty {
      override fun confidence(): Number? = unwrap(this).getConfidence()

      override fun criticality(): Number? = unwrap(this).getCriticality()

      override fun note(): Any? = unwrap(this).getNote()

      override fun relatedFindings(): Any? = unwrap(this).getRelatedFindings()

      override fun severity(): Any? = unwrap(this).getSeverity()

      override fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()

      override fun userDefinedFields(): Any? = unwrap(this).getUserDefinedFields()

      override fun verificationState(): String? = unwrap(this).getVerificationState()

      override fun workflow(): Any? = unwrap(this).getWorkflow()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AutomationRulesFindingFieldsUpdateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesFindingFieldsUpdateProperty):
          AutomationRulesFindingFieldsUpdateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutomationRulesFindingFieldsUpdateProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesFindingFieldsUpdateProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface NumberFilterProperty {
    public fun eq(): Number? = unwrap(this).getEq()

    public fun gte(): Number? = unwrap(this).getGte()

    public fun lte(): Number? = unwrap(this).getLte()

    public interface Builder {
      public fun eq(eq: Number)

      public fun gte(gte: Number)

      public fun lte(lte: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.NumberFilterProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.NumberFilterProperty.builder()

      override fun eq(eq: Number) {
        cdkBuilder.eq(eq)
      }

      override fun gte(gte: Number) {
        cdkBuilder.gte(gte)
      }

      override fun lte(lte: Number) {
        cdkBuilder.lte(lte)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.NumberFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.NumberFilterProperty,
    ) : NumberFilterProperty {
      override fun eq(): Number? = unwrap(this).getEq()

      override fun gte(): Number? = unwrap(this).getGte()

      override fun lte(): Number? = unwrap(this).getLte()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NumberFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.NumberFilterProperty):
          NumberFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NumberFilterProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.NumberFilterProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AutomationRulesActionProperty {
    public fun findingFieldsUpdate(): Any

    public fun type(): String

    public interface Builder {
      public fun findingFieldsUpdate(findingFieldsUpdate: IResolvable)

      public
          fun findingFieldsUpdate(findingFieldsUpdate: AutomationRulesFindingFieldsUpdateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0c3f16cefb02891da7c8b09db3c49d70707c13fd09f95537daf015db2dc77ec5")
      public
          fun findingFieldsUpdate(findingFieldsUpdate: AutomationRulesFindingFieldsUpdateProperty.Builder.() -> Unit)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesActionProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesActionProperty.builder()

      override fun findingFieldsUpdate(findingFieldsUpdate: IResolvable) {
        cdkBuilder.findingFieldsUpdate(findingFieldsUpdate.let(IResolvable::unwrap))
      }

      override
          fun findingFieldsUpdate(findingFieldsUpdate: AutomationRulesFindingFieldsUpdateProperty) {
        cdkBuilder.findingFieldsUpdate(findingFieldsUpdate.let(AutomationRulesFindingFieldsUpdateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0c3f16cefb02891da7c8b09db3c49d70707c13fd09f95537daf015db2dc77ec5")
      override
          fun findingFieldsUpdate(findingFieldsUpdate: AutomationRulesFindingFieldsUpdateProperty.Builder.() -> Unit):
          Unit =
          findingFieldsUpdate(AutomationRulesFindingFieldsUpdateProperty(findingFieldsUpdate))

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesActionProperty,
    ) : AutomationRulesActionProperty {
      override fun findingFieldsUpdate(): Any = unwrap(this).getFindingFieldsUpdate()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AutomationRulesActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesActionProperty):
          AutomationRulesActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutomationRulesActionProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesActionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface StringFilterProperty {
    public fun comparison(): String

    public fun `value`(): String

    public interface Builder {
      public fun comparison(comparison: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.StringFilterProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.StringFilterProperty.builder()

      override fun comparison(comparison: String) {
        cdkBuilder.comparison(comparison)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.StringFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.StringFilterProperty,
    ) : StringFilterProperty {
      override fun comparison(): String = unwrap(this).getComparison()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StringFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.StringFilterProperty):
          StringFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StringFilterProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.StringFilterProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
