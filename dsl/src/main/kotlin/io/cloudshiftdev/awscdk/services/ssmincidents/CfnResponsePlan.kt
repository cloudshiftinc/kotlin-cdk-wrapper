package io.cloudshiftdev.awscdk.services.ssmincidents

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResponsePlan internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlan,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun actions(): Any? = unwrap(this).getActions()

  public open fun actions(`value`: IResolvable) {
    unwrap(this).setActions(`value`.let(IResolvable::unwrap))
  }

  public open fun actions(__idx_ac66f0: List<Any>) {
    unwrap(this).setActions(__idx_ac66f0)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun chatChannel(): Any? = unwrap(this).getChatChannel()

  public open fun chatChannel(`value`: IResolvable) {
    unwrap(this).setChatChannel(`value`.let(IResolvable::unwrap))
  }

  public open fun chatChannel(`value`: ChatChannelProperty) {
    unwrap(this).setChatChannel(`value`.let(ChatChannelProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("88cd7ac7942ddca405d4953ccd62c0cc4ad546aed1a3d473d00286110359f925")
  public open fun chatChannel(`value`: ChatChannelProperty.Builder.() -> Unit): Unit =
      chatChannel(ChatChannelProperty(`value`))

  public open fun displayName(): String? = unwrap(this).getDisplayName()

  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  public open fun engagements(): List<String> = unwrap(this).getEngagements() ?: emptyList()

  public open fun engagements(`value`: List<String>) {
    unwrap(this).setEngagements(`value`)
  }

  public open fun incidentTemplate(): Any = unwrap(this).getIncidentTemplate()

  public open fun incidentTemplate(`value`: IResolvable) {
    unwrap(this).setIncidentTemplate(`value`.let(IResolvable::unwrap))
  }

  public open fun incidentTemplate(`value`: IncidentTemplateProperty) {
    unwrap(this).setIncidentTemplate(`value`.let(IncidentTemplateProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5b71fccdde07bb833e6bd8323c16f84373e656b0350ca66e6dddabbc8ef44a21")
  public open fun incidentTemplate(`value`: IncidentTemplateProperty.Builder.() -> Unit): Unit =
      incidentTemplate(IncidentTemplateProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun integrations(): Any? = unwrap(this).getIntegrations()

  public open fun integrations(`value`: IResolvable) {
    unwrap(this).setIntegrations(`value`.let(IResolvable::unwrap))
  }

  public open fun integrations(__idx_ac66f0: List<Any>) {
    unwrap(this).setIntegrations(__idx_ac66f0)
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
    public fun actions(actions: IResolvable) {
    }

    public fun actions(actions: List<Any>) {
    }

    public fun chatChannel(chatChannel: IResolvable) {
    }

    public fun chatChannel(chatChannel: ChatChannelProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6753cc5e0723c78cfbb510065a013e2332c3b5f3fe56d9719df52b9989730a52")
    public fun chatChannel(chatChannel: ChatChannelProperty.Builder.() -> Unit) {
    }

    public fun displayName(displayName: String) {
    }

    public fun engagements(engagements: List<String>) {
    }

    public fun incidentTemplate(incidentTemplate: IResolvable) {
    }

    public fun incidentTemplate(incidentTemplate: IncidentTemplateProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c0e9785cd11cdaa6f6c209eb5f084c2947c773ffbb1286e908b50e3a0871eb7d")
    public fun incidentTemplate(incidentTemplate: IncidentTemplateProperty.Builder.() -> Unit) {
    }

    public fun integrations(integrations: IResolvable) {
    }

    public fun integrations(integrations: List<Any>) {
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
    private val cdkBuilder: software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.Builder =
        software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.Builder.create(scope, id)

    public override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable::unwrap))
    }

    public override fun actions(actions: List<Any>) {
      cdkBuilder.actions(actions)
    }

    public override fun chatChannel(chatChannel: IResolvable) {
      cdkBuilder.chatChannel(chatChannel.let(IResolvable::unwrap))
    }

    public override fun chatChannel(chatChannel: ChatChannelProperty) {
      cdkBuilder.chatChannel(chatChannel.let(ChatChannelProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6753cc5e0723c78cfbb510065a013e2332c3b5f3fe56d9719df52b9989730a52")
    public override fun chatChannel(chatChannel: ChatChannelProperty.Builder.() -> Unit): Unit =
        chatChannel(ChatChannelProperty(chatChannel))

    public override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    public override fun engagements(engagements: List<String>) {
      cdkBuilder.engagements(engagements)
    }

    public override fun incidentTemplate(incidentTemplate: IResolvable) {
      cdkBuilder.incidentTemplate(incidentTemplate.let(IResolvable::unwrap))
    }

    public override fun incidentTemplate(incidentTemplate: IncidentTemplateProperty) {
      cdkBuilder.incidentTemplate(incidentTemplate.let(IncidentTemplateProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c0e9785cd11cdaa6f6c209eb5f084c2947c773ffbb1286e908b50e3a0871eb7d")
    public override
        fun incidentTemplate(incidentTemplate: IncidentTemplateProperty.Builder.() -> Unit): Unit =
        incidentTemplate(IncidentTemplateProperty(incidentTemplate))

    public override fun integrations(integrations: IResolvable) {
      cdkBuilder.integrations(integrations.let(IResolvable::unwrap))
    }

    public override fun integrations(integrations: List<Any>) {
      cdkBuilder.integrations(integrations)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ssmincidents.CfnResponsePlan =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResponsePlan {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResponsePlan(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlan):
        CfnResponsePlan = CfnResponsePlan(cdkObject)

    internal fun unwrap(wrapped: CfnResponsePlan):
        software.amazon.awscdk.services.ssmincidents.CfnResponsePlan = wrapped.cdkObject
  }

  public interface SsmParameterProperty {
    public fun key(): String

    public fun values(): List<String>

    public interface Builder {
      public fun key(key: String) {
      }

      public fun values(values: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmParameterProperty.Builder
          =
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmParameterProperty.builder()

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      public fun build():
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmParameterProperty,
    ) : SsmParameterProperty {
      public override fun key(): String = unwrap(this).getKey()

      public override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SsmParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmParameterProperty):
          SsmParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SsmParameterProperty):
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmParameterProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface NotificationTargetItemProperty {
    public fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

    public interface Builder {
      public fun snsTopicArn(snsTopicArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.NotificationTargetItemProperty.Builder
          =
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.NotificationTargetItemProperty.builder()

      public override fun snsTopicArn(snsTopicArn: String) {
        cdkBuilder.snsTopicArn(snsTopicArn)
      }

      public fun build():
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.NotificationTargetItemProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.NotificationTargetItemProperty,
    ) : NotificationTargetItemProperty {
      public override fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NotificationTargetItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.NotificationTargetItemProperty):
          NotificationTargetItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationTargetItemProperty):
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.NotificationTargetItemProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface IntegrationProperty {
    public fun pagerDutyConfiguration(): Any

    public interface Builder {
      public fun pagerDutyConfiguration(pagerDutyConfiguration: IResolvable) {
      }

      public fun pagerDutyConfiguration(pagerDutyConfiguration: PagerDutyConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5b1365cb72066145322131b300cd557680855b99d2eedb46ae39d3281fc00c0a")
      public
          fun pagerDutyConfiguration(pagerDutyConfiguration: PagerDutyConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.IntegrationProperty.Builder =
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.IntegrationProperty.builder()

      public override fun pagerDutyConfiguration(pagerDutyConfiguration: IResolvable) {
        cdkBuilder.pagerDutyConfiguration(pagerDutyConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun pagerDutyConfiguration(pagerDutyConfiguration: PagerDutyConfigurationProperty) {
        cdkBuilder.pagerDutyConfiguration(pagerDutyConfiguration.let(PagerDutyConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5b1365cb72066145322131b300cd557680855b99d2eedb46ae39d3281fc00c0a")
      public override
          fun pagerDutyConfiguration(pagerDutyConfiguration: PagerDutyConfigurationProperty.Builder.() -> Unit):
          Unit = pagerDutyConfiguration(PagerDutyConfigurationProperty(pagerDutyConfiguration))

      public fun build():
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.IntegrationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.IntegrationProperty,
    ) : IntegrationProperty {
      public override fun pagerDutyConfiguration(): Any = unwrap(this).getPagerDutyConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IntegrationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.IntegrationProperty):
          IntegrationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntegrationProperty):
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.IntegrationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SsmAutomationProperty {
    public fun documentName(): String

    public fun documentVersion(): String? = unwrap(this).getDocumentVersion()

    public fun dynamicParameters(): Any? = unwrap(this).getDynamicParameters()

    public fun parameters(): Any? = unwrap(this).getParameters()

    public fun roleArn(): String

    public fun targetAccount(): String? = unwrap(this).getTargetAccount()

    public interface Builder {
      public fun documentName(documentName: String) {
      }

      public fun documentVersion(documentVersion: String) {
      }

      public fun dynamicParameters(dynamicParameters: IResolvable) {
      }

      public fun dynamicParameters(dynamicParameters: List<Any>) {
      }

      public fun parameters(parameters: IResolvable) {
      }

      public fun parameters(parameters: List<Any>) {
      }

      public fun roleArn(roleArn: String) {
      }

      public fun targetAccount(targetAccount: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmAutomationProperty.Builder
          =
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmAutomationProperty.builder()

      public override fun documentName(documentName: String) {
        cdkBuilder.documentName(documentName)
      }

      public override fun documentVersion(documentVersion: String) {
        cdkBuilder.documentVersion(documentVersion)
      }

      public override fun dynamicParameters(dynamicParameters: IResolvable) {
        cdkBuilder.dynamicParameters(dynamicParameters.let(IResolvable::unwrap))
      }

      public override fun dynamicParameters(dynamicParameters: List<Any>) {
        cdkBuilder.dynamicParameters(dynamicParameters)
      }

      public override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      public override fun parameters(parameters: List<Any>) {
        cdkBuilder.parameters(parameters)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public override fun targetAccount(targetAccount: String) {
        cdkBuilder.targetAccount(targetAccount)
      }

      public fun build():
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmAutomationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmAutomationProperty,
    ) : SsmAutomationProperty {
      public override fun documentName(): String = unwrap(this).getDocumentName()

      public override fun documentVersion(): String? = unwrap(this).getDocumentVersion()

      public override fun dynamicParameters(): Any? = unwrap(this).getDynamicParameters()

      public override fun parameters(): Any? = unwrap(this).getParameters()

      public override fun roleArn(): String = unwrap(this).getRoleArn()

      public override fun targetAccount(): String? = unwrap(this).getTargetAccount()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SsmAutomationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmAutomationProperty):
          SsmAutomationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SsmAutomationProperty):
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmAutomationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PagerDutyIncidentConfigurationProperty {
    public fun serviceId(): String

    public interface Builder {
      public fun serviceId(serviceId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.PagerDutyIncidentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.PagerDutyIncidentConfigurationProperty.builder()

      public override fun serviceId(serviceId: String) {
        cdkBuilder.serviceId(serviceId)
      }

      public fun build():
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.PagerDutyIncidentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.PagerDutyIncidentConfigurationProperty,
    ) : PagerDutyIncidentConfigurationProperty {
      public override fun serviceId(): String = unwrap(this).getServiceId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PagerDutyIncidentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.PagerDutyIncidentConfigurationProperty):
          PagerDutyIncidentConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PagerDutyIncidentConfigurationProperty):
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.PagerDutyIncidentConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ActionProperty {
    public fun ssmAutomation(): Any? = unwrap(this).getSsmAutomation()

    public interface Builder {
      public fun ssmAutomation(ssmAutomation: IResolvable) {
      }

      public fun ssmAutomation(ssmAutomation: SsmAutomationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d09bb1ec3b9413c6175608dd0244bd27f53894d04e2f3c80042da9e1638c9cee")
      public fun ssmAutomation(ssmAutomation: SsmAutomationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ActionProperty.Builder =
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ActionProperty.builder()

      public override fun ssmAutomation(ssmAutomation: IResolvable) {
        cdkBuilder.ssmAutomation(ssmAutomation.let(IResolvable::unwrap))
      }

      public override fun ssmAutomation(ssmAutomation: SsmAutomationProperty) {
        cdkBuilder.ssmAutomation(ssmAutomation.let(SsmAutomationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d09bb1ec3b9413c6175608dd0244bd27f53894d04e2f3c80042da9e1638c9cee")
      public override fun ssmAutomation(ssmAutomation: SsmAutomationProperty.Builder.() -> Unit):
          Unit = ssmAutomation(SsmAutomationProperty(ssmAutomation))

      public fun build():
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ActionProperty,
    ) : ActionProperty {
      public override fun ssmAutomation(): Any? = unwrap(this).getSsmAutomation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ActionProperty):
          ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DynamicSsmParameterProperty {
    public fun key(): String

    public fun `value`(): Any

    public interface Builder {
      public fun key(key: String) {
      }

      public fun `value`(`value`: IResolvable) {
      }

      public fun `value`(`value`: DynamicSsmParameterValueProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3fc880425978a155fceda534e935c6cd1c33134d904c0d20d072fa38894ebfba")
      public fun `value`(`value`: DynamicSsmParameterValueProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.DynamicSsmParameterProperty.Builder
          =
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.DynamicSsmParameterProperty.builder()

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable::unwrap))
      }

      public override fun `value`(`value`: DynamicSsmParameterValueProperty) {
        cdkBuilder.`value`(`value`.let(DynamicSsmParameterValueProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3fc880425978a155fceda534e935c6cd1c33134d904c0d20d072fa38894ebfba")
      public override fun `value`(`value`: DynamicSsmParameterValueProperty.Builder.() -> Unit):
          Unit = `value`(DynamicSsmParameterValueProperty(`value`))

      public fun build():
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.DynamicSsmParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.DynamicSsmParameterProperty,
    ) : DynamicSsmParameterProperty {
      public override fun key(): String = unwrap(this).getKey()

      public override fun `value`(): Any = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DynamicSsmParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.DynamicSsmParameterProperty):
          DynamicSsmParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynamicSsmParameterProperty):
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.DynamicSsmParameterProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DynamicSsmParameterValueProperty {
    public fun variable(): String? = unwrap(this).getVariable()

    public interface Builder {
      public fun variable(variable: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.DynamicSsmParameterValueProperty.Builder
          =
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.DynamicSsmParameterValueProperty.builder()

      public override fun variable(variable: String) {
        cdkBuilder.variable(variable)
      }

      public fun build():
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.DynamicSsmParameterValueProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.DynamicSsmParameterValueProperty,
    ) : DynamicSsmParameterValueProperty {
      public override fun variable(): String? = unwrap(this).getVariable()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DynamicSsmParameterValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.DynamicSsmParameterValueProperty):
          DynamicSsmParameterValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynamicSsmParameterValueProperty):
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.DynamicSsmParameterValueProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface IncidentTemplateProperty {
    public fun dedupeString(): String? = unwrap(this).getDedupeString()

    public fun impact(): Number

    public fun incidentTags(): Any? = unwrap(this).getIncidentTags()

    public fun notificationTargets(): Any? = unwrap(this).getNotificationTargets()

    public fun summary(): String? = unwrap(this).getSummary()

    public fun title(): String

    public interface Builder {
      public fun dedupeString(dedupeString: String) {
      }

      public fun impact(impact: Number) {
      }

      public fun incidentTags(incidentTags: IResolvable) {
      }

      public fun incidentTags(incidentTags: List<Any>) {
      }

      public fun notificationTargets(notificationTargets: IResolvable) {
      }

      public fun notificationTargets(notificationTargets: List<Any>) {
      }

      public fun summary(summary: String) {
      }

      public fun title(title: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.IncidentTemplateProperty.Builder
          =
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.IncidentTemplateProperty.builder()

      public override fun dedupeString(dedupeString: String) {
        cdkBuilder.dedupeString(dedupeString)
      }

      public override fun impact(impact: Number) {
        cdkBuilder.impact(impact)
      }

      public override fun incidentTags(incidentTags: IResolvable) {
        cdkBuilder.incidentTags(incidentTags.let(IResolvable::unwrap))
      }

      public override fun incidentTags(incidentTags: List<Any>) {
        cdkBuilder.incidentTags(incidentTags)
      }

      public override fun notificationTargets(notificationTargets: IResolvable) {
        cdkBuilder.notificationTargets(notificationTargets.let(IResolvable::unwrap))
      }

      public override fun notificationTargets(notificationTargets: List<Any>) {
        cdkBuilder.notificationTargets(notificationTargets)
      }

      public override fun summary(summary: String) {
        cdkBuilder.summary(summary)
      }

      public override fun title(title: String) {
        cdkBuilder.title(title)
      }

      public fun build():
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.IncidentTemplateProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.IncidentTemplateProperty,
    ) : IncidentTemplateProperty {
      public override fun dedupeString(): String? = unwrap(this).getDedupeString()

      public override fun impact(): Number = unwrap(this).getImpact()

      public override fun incidentTags(): Any? = unwrap(this).getIncidentTags()

      public override fun notificationTargets(): Any? = unwrap(this).getNotificationTargets()

      public override fun summary(): String? = unwrap(this).getSummary()

      public override fun title(): String = unwrap(this).getTitle()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IncidentTemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.IncidentTemplateProperty):
          IncidentTemplateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IncidentTemplateProperty):
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.IncidentTemplateProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ChatChannelProperty {
    public fun chatbotSns(): List<String> = unwrap(this).getChatbotSns() ?: emptyList()

    public interface Builder {
      public fun chatbotSns(chatbotSns: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ChatChannelProperty.Builder =
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ChatChannelProperty.builder()

      public override fun chatbotSns(chatbotSns: List<String>) {
        cdkBuilder.chatbotSns(chatbotSns)
      }

      public fun build():
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ChatChannelProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ChatChannelProperty,
    ) : ChatChannelProperty {
      public override fun chatbotSns(): List<String> = unwrap(this).getChatbotSns() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ChatChannelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ChatChannelProperty):
          ChatChannelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ChatChannelProperty):
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ChatChannelProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PagerDutyConfigurationProperty {
    public fun name(): String

    public fun pagerDutyIncidentConfiguration(): Any

    public fun secretId(): String

    public interface Builder {
      public fun name(name: String) {
      }

      public fun pagerDutyIncidentConfiguration(pagerDutyIncidentConfiguration: IResolvable) {
      }

      public
          fun pagerDutyIncidentConfiguration(pagerDutyIncidentConfiguration: PagerDutyIncidentConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a2f87025500874ad7b8eb420748449070320a8ecd81dd2015b2b6b1f7c14e0a3")
      public
          fun pagerDutyIncidentConfiguration(pagerDutyIncidentConfiguration: PagerDutyIncidentConfigurationProperty.Builder.() -> Unit) {
      }

      public fun secretId(secretId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.PagerDutyConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.PagerDutyConfigurationProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override
          fun pagerDutyIncidentConfiguration(pagerDutyIncidentConfiguration: IResolvable) {
        cdkBuilder.pagerDutyIncidentConfiguration(pagerDutyIncidentConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun pagerDutyIncidentConfiguration(pagerDutyIncidentConfiguration: PagerDutyIncidentConfigurationProperty) {
        cdkBuilder.pagerDutyIncidentConfiguration(pagerDutyIncidentConfiguration.let(PagerDutyIncidentConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a2f87025500874ad7b8eb420748449070320a8ecd81dd2015b2b6b1f7c14e0a3")
      public override
          fun pagerDutyIncidentConfiguration(pagerDutyIncidentConfiguration: PagerDutyIncidentConfigurationProperty.Builder.() -> Unit):
          Unit =
          pagerDutyIncidentConfiguration(PagerDutyIncidentConfigurationProperty(pagerDutyIncidentConfiguration))

      public override fun secretId(secretId: String) {
        cdkBuilder.secretId(secretId)
      }

      public fun build():
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.PagerDutyConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.PagerDutyConfigurationProperty,
    ) : PagerDutyConfigurationProperty {
      public override fun name(): String = unwrap(this).getName()

      public override fun pagerDutyIncidentConfiguration(): Any =
          unwrap(this).getPagerDutyIncidentConfiguration()

      public override fun secretId(): String = unwrap(this).getSecretId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PagerDutyConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.PagerDutyConfigurationProperty):
          PagerDutyConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PagerDutyConfigurationProperty):
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.PagerDutyConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
