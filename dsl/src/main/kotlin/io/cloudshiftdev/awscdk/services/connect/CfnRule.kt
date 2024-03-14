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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.connect.CfnRule,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun actions(): Any = unwrap(this).getActions()

  public open fun actions(`value`: IResolvable) {
    unwrap(this).setActions(`value`.let(IResolvable::unwrap))
  }

  public open fun actions(`value`: ActionsProperty) {
    unwrap(this).setActions(`value`.let(ActionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("54cd589fd18040299b3a837140d51bd6637fdc8f55dc9c8394b5c6ba765937e4")
  public open fun actions(`value`: ActionsProperty.Builder.() -> Unit): Unit =
      actions(ActionsProperty(`value`))

  public open fun attrRuleArn(): String = unwrap(this).getAttrRuleArn()

  public open fun function(): String = unwrap(this).getFunction()

  public open fun function(`value`: String) {
    unwrap(this).setFunction(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun publishStatus(): String = unwrap(this).getPublishStatus()

  public open fun publishStatus(`value`: String) {
    unwrap(this).setPublishStatus(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun triggerEventSource(): Any = unwrap(this).getTriggerEventSource()

  public open fun triggerEventSource(`value`: IResolvable) {
    unwrap(this).setTriggerEventSource(`value`.let(IResolvable::unwrap))
  }

  public open fun triggerEventSource(`value`: RuleTriggerEventSourceProperty) {
    unwrap(this).setTriggerEventSource(`value`.let(RuleTriggerEventSourceProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("db98468c530879b531ecaf2d8532df1da9ed4894f2d186f8b1f32bb65198f6a9")
  public open fun triggerEventSource(`value`: RuleTriggerEventSourceProperty.Builder.() -> Unit):
      Unit = triggerEventSource(RuleTriggerEventSourceProperty(`value`))

  public interface Builder {
    public fun actions(actions: IResolvable)

    public fun actions(actions: ActionsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b67caaa242e4bb9d2be7e79d9f28c5d1275448bf083d71d76ae77046202463f9")
    public fun actions(actions: ActionsProperty.Builder.() -> Unit)

    public fun function(function: String)

    public fun instanceArn(instanceArn: String)

    public fun name(name: String)

    public fun publishStatus(publishStatus: String)

    public fun tags(tags: List<CfnTag>)

    public fun triggerEventSource(triggerEventSource: IResolvable)

    public fun triggerEventSource(triggerEventSource: RuleTriggerEventSourceProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6770d60045eb707d2cdb9bcff23a919cdb0a4e29565bdf23cd7e7d4705b72a81")
    public
        fun triggerEventSource(triggerEventSource: RuleTriggerEventSourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnRule.Builder =
        software.amazon.awscdk.services.connect.CfnRule.Builder.create(scope, id)

    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable::unwrap))
    }

    override fun actions(actions: ActionsProperty) {
      cdkBuilder.actions(actions.let(ActionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b67caaa242e4bb9d2be7e79d9f28c5d1275448bf083d71d76ae77046202463f9")
    override fun actions(actions: ActionsProperty.Builder.() -> Unit): Unit =
        actions(ActionsProperty(actions))

    override fun function(function: String) {
      cdkBuilder.function(function)
    }

    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun publishStatus(publishStatus: String) {
      cdkBuilder.publishStatus(publishStatus)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun triggerEventSource(triggerEventSource: IResolvable) {
      cdkBuilder.triggerEventSource(triggerEventSource.let(IResolvable::unwrap))
    }

    override fun triggerEventSource(triggerEventSource: RuleTriggerEventSourceProperty) {
      cdkBuilder.triggerEventSource(triggerEventSource.let(RuleTriggerEventSourceProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6770d60045eb707d2cdb9bcff23a919cdb0a4e29565bdf23cd7e7d4705b72a81")
    override
        fun triggerEventSource(triggerEventSource: RuleTriggerEventSourceProperty.Builder.() -> Unit):
        Unit = triggerEventSource(RuleTriggerEventSourceProperty(triggerEventSource))

    public fun build(): software.amazon.awscdk.services.connect.CfnRule = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRule): CfnRule =
        CfnRule(cdkObject)

    internal fun unwrap(wrapped: CfnRule): software.amazon.awscdk.services.connect.CfnRule =
        wrapped.cdkObject
  }

  public interface FieldValueProperty {
    public fun booleanValue(): Any? = unwrap(this).getBooleanValue()

    public fun doubleValue(): Number? = unwrap(this).getDoubleValue()

    public fun emptyValue(): Any? = unwrap(this).getEmptyValue()

    public fun stringValue(): String? = unwrap(this).getStringValue()

    public interface Builder {
      public fun booleanValue(booleanValue: Boolean)

      public fun booleanValue(booleanValue: IResolvable)

      public fun doubleValue(doubleValue: Number)

      public fun emptyValue(emptyValue: Any)

      public fun stringValue(stringValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnRule.FieldValueProperty.Builder =
          software.amazon.awscdk.services.connect.CfnRule.FieldValueProperty.builder()

      override fun booleanValue(booleanValue: Boolean) {
        cdkBuilder.booleanValue(booleanValue)
      }

      override fun booleanValue(booleanValue: IResolvable) {
        cdkBuilder.booleanValue(booleanValue.let(IResolvable::unwrap))
      }

      override fun doubleValue(doubleValue: Number) {
        cdkBuilder.doubleValue(doubleValue)
      }

      override fun emptyValue(emptyValue: Any) {
        cdkBuilder.emptyValue(emptyValue)
      }

      override fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
      }

      public fun build(): software.amazon.awscdk.services.connect.CfnRule.FieldValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.connect.CfnRule.FieldValueProperty,
    ) : FieldValueProperty {
      override fun booleanValue(): Any? = unwrap(this).getBooleanValue()

      override fun doubleValue(): Number? = unwrap(this).getDoubleValue()

      override fun emptyValue(): Any? = unwrap(this).getEmptyValue()

      override fun stringValue(): String? = unwrap(this).getStringValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FieldValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRule.FieldValueProperty):
          FieldValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldValueProperty):
          software.amazon.awscdk.services.connect.CfnRule.FieldValueProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface UpdateCaseActionProperty {
    public fun fields(): Any

    public interface Builder {
      public fun fields(fields: IResolvable)

      public fun fields(fields: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnRule.UpdateCaseActionProperty.Builder =
          software.amazon.awscdk.services.connect.CfnRule.UpdateCaseActionProperty.builder()

      override fun fields(fields: IResolvable) {
        cdkBuilder.fields(fields.let(IResolvable::unwrap))
      }

      override fun fields(fields: List<Any>) {
        cdkBuilder.fields(fields)
      }

      public fun build(): software.amazon.awscdk.services.connect.CfnRule.UpdateCaseActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnRule.UpdateCaseActionProperty,
    ) : UpdateCaseActionProperty {
      override fun fields(): Any = unwrap(this).getFields()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UpdateCaseActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRule.UpdateCaseActionProperty):
          UpdateCaseActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UpdateCaseActionProperty):
          software.amazon.awscdk.services.connect.CfnRule.UpdateCaseActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FieldProperty {
    public fun id(): String

    public fun `value`(): Any

    public interface Builder {
      public fun id(id: String)

      public fun `value`(`value`: IResolvable)

      public fun `value`(`value`: FieldValueProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39cb40b8cb920f22e478e3d3eed571fc7797d9217007ee67008ff865810ebeeb")
      public fun `value`(`value`: FieldValueProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.connect.CfnRule.FieldProperty.Builder
          = software.amazon.awscdk.services.connect.CfnRule.FieldProperty.builder()

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable::unwrap))
      }

      override fun `value`(`value`: FieldValueProperty) {
        cdkBuilder.`value`(`value`.let(FieldValueProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39cb40b8cb920f22e478e3d3eed571fc7797d9217007ee67008ff865810ebeeb")
      override fun `value`(`value`: FieldValueProperty.Builder.() -> Unit): Unit =
          `value`(FieldValueProperty(`value`))

      public fun build(): software.amazon.awscdk.services.connect.CfnRule.FieldProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.connect.CfnRule.FieldProperty,
    ) : FieldProperty {
      override fun id(): String = unwrap(this).getId()

      override fun `value`(): Any = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FieldProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRule.FieldProperty):
          FieldProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldProperty):
          software.amazon.awscdk.services.connect.CfnRule.FieldProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CreateCaseActionProperty {
    public fun fields(): Any

    public fun templateId(): String

    public interface Builder {
      public fun fields(fields: IResolvable)

      public fun fields(fields: List<Any>)

      public fun templateId(templateId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnRule.CreateCaseActionProperty.Builder =
          software.amazon.awscdk.services.connect.CfnRule.CreateCaseActionProperty.builder()

      override fun fields(fields: IResolvable) {
        cdkBuilder.fields(fields.let(IResolvable::unwrap))
      }

      override fun fields(fields: List<Any>) {
        cdkBuilder.fields(fields)
      }

      override fun templateId(templateId: String) {
        cdkBuilder.templateId(templateId)
      }

      public fun build(): software.amazon.awscdk.services.connect.CfnRule.CreateCaseActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnRule.CreateCaseActionProperty,
    ) : CreateCaseActionProperty {
      override fun fields(): Any = unwrap(this).getFields()

      override fun templateId(): String = unwrap(this).getTemplateId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CreateCaseActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRule.CreateCaseActionProperty):
          CreateCaseActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CreateCaseActionProperty):
          software.amazon.awscdk.services.connect.CfnRule.CreateCaseActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RuleTriggerEventSourceProperty {
    public fun eventSourceName(): String

    public fun integrationAssociationArn(): String? = unwrap(this).getIntegrationAssociationArn()

    public interface Builder {
      public fun eventSourceName(eventSourceName: String)

      public fun integrationAssociationArn(integrationAssociationArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnRule.RuleTriggerEventSourceProperty.Builder =
          software.amazon.awscdk.services.connect.CfnRule.RuleTriggerEventSourceProperty.builder()

      override fun eventSourceName(eventSourceName: String) {
        cdkBuilder.eventSourceName(eventSourceName)
      }

      override fun integrationAssociationArn(integrationAssociationArn: String) {
        cdkBuilder.integrationAssociationArn(integrationAssociationArn)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnRule.RuleTriggerEventSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnRule.RuleTriggerEventSourceProperty,
    ) : RuleTriggerEventSourceProperty {
      override fun eventSourceName(): String = unwrap(this).getEventSourceName()

      override fun integrationAssociationArn(): String? =
          unwrap(this).getIntegrationAssociationArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RuleTriggerEventSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRule.RuleTriggerEventSourceProperty):
          RuleTriggerEventSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleTriggerEventSourceProperty):
          software.amazon.awscdk.services.connect.CfnRule.RuleTriggerEventSourceProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface TaskActionProperty {
    public fun contactFlowArn(): String

    public fun description(): String? = unwrap(this).getDescription()

    public fun name(): String

    public fun references(): Any? = unwrap(this).getReferences()

    public interface Builder {
      public fun contactFlowArn(contactFlowArn: String)

      public fun description(description: String)

      public fun name(name: String)

      public fun references(references: IResolvable)

      public fun references(references: Map<String, Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnRule.TaskActionProperty.Builder =
          software.amazon.awscdk.services.connect.CfnRule.TaskActionProperty.builder()

      override fun contactFlowArn(contactFlowArn: String) {
        cdkBuilder.contactFlowArn(contactFlowArn)
      }

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun references(references: IResolvable) {
        cdkBuilder.references(references.let(IResolvable::unwrap))
      }

      override fun references(references: Map<String, Any>) {
        cdkBuilder.references(references)
      }

      public fun build(): software.amazon.awscdk.services.connect.CfnRule.TaskActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.connect.CfnRule.TaskActionProperty,
    ) : TaskActionProperty {
      override fun contactFlowArn(): String = unwrap(this).getContactFlowArn()

      override fun description(): String? = unwrap(this).getDescription()

      override fun name(): String = unwrap(this).getName()

      override fun references(): Any? = unwrap(this).getReferences()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TaskActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRule.TaskActionProperty):
          TaskActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TaskActionProperty):
          software.amazon.awscdk.services.connect.CfnRule.TaskActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SendNotificationActionProperty {
    public fun content(): String

    public fun contentType(): String

    public fun deliveryMethod(): String

    public fun recipient(): Any

    public fun subject(): String? = unwrap(this).getSubject()

    public interface Builder {
      public fun content(content: String)

      public fun contentType(contentType: String)

      public fun deliveryMethod(deliveryMethod: String)

      public fun recipient(recipient: IResolvable)

      public fun recipient(recipient: NotificationRecipientTypeProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6214677c1471da5635831c025da1ed2c2693e2d582dd859d8cf1a7f9720cfe2a")
      public fun recipient(recipient: NotificationRecipientTypeProperty.Builder.() -> Unit)

      public fun subject(subject: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnRule.SendNotificationActionProperty.Builder =
          software.amazon.awscdk.services.connect.CfnRule.SendNotificationActionProperty.builder()

      override fun content(content: String) {
        cdkBuilder.content(content)
      }

      override fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
      }

      override fun deliveryMethod(deliveryMethod: String) {
        cdkBuilder.deliveryMethod(deliveryMethod)
      }

      override fun recipient(recipient: IResolvable) {
        cdkBuilder.recipient(recipient.let(IResolvable::unwrap))
      }

      override fun recipient(recipient: NotificationRecipientTypeProperty) {
        cdkBuilder.recipient(recipient.let(NotificationRecipientTypeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6214677c1471da5635831c025da1ed2c2693e2d582dd859d8cf1a7f9720cfe2a")
      override fun recipient(recipient: NotificationRecipientTypeProperty.Builder.() -> Unit): Unit
          = recipient(NotificationRecipientTypeProperty(recipient))

      override fun subject(subject: String) {
        cdkBuilder.subject(subject)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnRule.SendNotificationActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnRule.SendNotificationActionProperty,
    ) : SendNotificationActionProperty {
      override fun content(): String = unwrap(this).getContent()

      override fun contentType(): String = unwrap(this).getContentType()

      override fun deliveryMethod(): String = unwrap(this).getDeliveryMethod()

      override fun recipient(): Any = unwrap(this).getRecipient()

      override fun subject(): String? = unwrap(this).getSubject()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SendNotificationActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRule.SendNotificationActionProperty):
          SendNotificationActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SendNotificationActionProperty):
          software.amazon.awscdk.services.connect.CfnRule.SendNotificationActionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface EventBridgeActionProperty {
    public fun name(): String

    public interface Builder {
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnRule.EventBridgeActionProperty.Builder =
          software.amazon.awscdk.services.connect.CfnRule.EventBridgeActionProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.connect.CfnRule.EventBridgeActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnRule.EventBridgeActionProperty,
    ) : EventBridgeActionProperty {
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EventBridgeActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRule.EventBridgeActionProperty):
          EventBridgeActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventBridgeActionProperty):
          software.amazon.awscdk.services.connect.CfnRule.EventBridgeActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ReferenceProperty {
    public fun type(): String

    public fun `value`(): String

    public interface Builder {
      public fun type(type: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnRule.ReferenceProperty.Builder =
          software.amazon.awscdk.services.connect.CfnRule.ReferenceProperty.builder()

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.connect.CfnRule.ReferenceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.connect.CfnRule.ReferenceProperty,
    ) : ReferenceProperty {
      override fun type(): String = unwrap(this).getType()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ReferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRule.ReferenceProperty):
          ReferenceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReferenceProperty):
          software.amazon.awscdk.services.connect.CfnRule.ReferenceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface NotificationRecipientTypeProperty {
    public fun userArns(): List<String> = unwrap(this).getUserArns() ?: emptyList()

    public fun userTags(): Any? = unwrap(this).getUserTags()

    public interface Builder {
      public fun userArns(userArns: List<String>)

      public fun userTags(userTags: IResolvable)

      public fun userTags(userTags: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnRule.NotificationRecipientTypeProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnRule.NotificationRecipientTypeProperty.builder()

      override fun userArns(userArns: List<String>) {
        cdkBuilder.userArns(userArns)
      }

      override fun userTags(userTags: IResolvable) {
        cdkBuilder.userTags(userTags.let(IResolvable::unwrap))
      }

      override fun userTags(userTags: Map<String, String>) {
        cdkBuilder.userTags(userTags)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnRule.NotificationRecipientTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnRule.NotificationRecipientTypeProperty,
    ) : NotificationRecipientTypeProperty {
      override fun userArns(): List<String> = unwrap(this).getUserArns() ?: emptyList()

      override fun userTags(): Any? = unwrap(this).getUserTags()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          NotificationRecipientTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRule.NotificationRecipientTypeProperty):
          NotificationRecipientTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationRecipientTypeProperty):
          software.amazon.awscdk.services.connect.CfnRule.NotificationRecipientTypeProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ActionsProperty {
    public fun assignContactCategoryActions(): Any? = unwrap(this).getAssignContactCategoryActions()

    public fun createCaseActions(): Any? = unwrap(this).getCreateCaseActions()

    public fun endAssociatedTasksActions(): Any? = unwrap(this).getEndAssociatedTasksActions()

    public fun eventBridgeActions(): Any? = unwrap(this).getEventBridgeActions()

    public fun sendNotificationActions(): Any? = unwrap(this).getSendNotificationActions()

    public fun taskActions(): Any? = unwrap(this).getTaskActions()

    public fun updateCaseActions(): Any? = unwrap(this).getUpdateCaseActions()

    public interface Builder {
      public fun assignContactCategoryActions(assignContactCategoryActions: List<Any>)

      public fun assignContactCategoryActions(assignContactCategoryActions: IResolvable)

      public fun createCaseActions(createCaseActions: IResolvable)

      public fun createCaseActions(createCaseActions: List<Any>)

      public fun endAssociatedTasksActions(endAssociatedTasksActions: List<Any>)

      public fun endAssociatedTasksActions(endAssociatedTasksActions: IResolvable)

      public fun eventBridgeActions(eventBridgeActions: IResolvable)

      public fun eventBridgeActions(eventBridgeActions: List<Any>)

      public fun sendNotificationActions(sendNotificationActions: IResolvable)

      public fun sendNotificationActions(sendNotificationActions: List<Any>)

      public fun taskActions(taskActions: IResolvable)

      public fun taskActions(taskActions: List<Any>)

      public fun updateCaseActions(updateCaseActions: IResolvable)

      public fun updateCaseActions(updateCaseActions: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnRule.ActionsProperty.Builder =
          software.amazon.awscdk.services.connect.CfnRule.ActionsProperty.builder()

      override fun assignContactCategoryActions(assignContactCategoryActions: List<Any>) {
        cdkBuilder.assignContactCategoryActions(assignContactCategoryActions)
      }

      override fun assignContactCategoryActions(assignContactCategoryActions: IResolvable) {
        cdkBuilder.assignContactCategoryActions(assignContactCategoryActions.let(IResolvable::unwrap))
      }

      override fun createCaseActions(createCaseActions: IResolvable) {
        cdkBuilder.createCaseActions(createCaseActions.let(IResolvable::unwrap))
      }

      override fun createCaseActions(createCaseActions: List<Any>) {
        cdkBuilder.createCaseActions(createCaseActions)
      }

      override fun endAssociatedTasksActions(endAssociatedTasksActions: List<Any>) {
        cdkBuilder.endAssociatedTasksActions(endAssociatedTasksActions)
      }

      override fun endAssociatedTasksActions(endAssociatedTasksActions: IResolvable) {
        cdkBuilder.endAssociatedTasksActions(endAssociatedTasksActions.let(IResolvable::unwrap))
      }

      override fun eventBridgeActions(eventBridgeActions: IResolvable) {
        cdkBuilder.eventBridgeActions(eventBridgeActions.let(IResolvable::unwrap))
      }

      override fun eventBridgeActions(eventBridgeActions: List<Any>) {
        cdkBuilder.eventBridgeActions(eventBridgeActions)
      }

      override fun sendNotificationActions(sendNotificationActions: IResolvable) {
        cdkBuilder.sendNotificationActions(sendNotificationActions.let(IResolvable::unwrap))
      }

      override fun sendNotificationActions(sendNotificationActions: List<Any>) {
        cdkBuilder.sendNotificationActions(sendNotificationActions)
      }

      override fun taskActions(taskActions: IResolvable) {
        cdkBuilder.taskActions(taskActions.let(IResolvable::unwrap))
      }

      override fun taskActions(taskActions: List<Any>) {
        cdkBuilder.taskActions(taskActions)
      }

      override fun updateCaseActions(updateCaseActions: IResolvable) {
        cdkBuilder.updateCaseActions(updateCaseActions.let(IResolvable::unwrap))
      }

      override fun updateCaseActions(updateCaseActions: List<Any>) {
        cdkBuilder.updateCaseActions(updateCaseActions)
      }

      public fun build(): software.amazon.awscdk.services.connect.CfnRule.ActionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.connect.CfnRule.ActionsProperty,
    ) : ActionsProperty {
      override fun assignContactCategoryActions(): Any? =
          unwrap(this).getAssignContactCategoryActions()

      override fun createCaseActions(): Any? = unwrap(this).getCreateCaseActions()

      override fun endAssociatedTasksActions(): Any? = unwrap(this).getEndAssociatedTasksActions()

      override fun eventBridgeActions(): Any? = unwrap(this).getEventBridgeActions()

      override fun sendNotificationActions(): Any? = unwrap(this).getSendNotificationActions()

      override fun taskActions(): Any? = unwrap(this).getTaskActions()

      override fun updateCaseActions(): Any? = unwrap(this).getUpdateCaseActions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ActionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRule.ActionsProperty):
          ActionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionsProperty):
          software.amazon.awscdk.services.connect.CfnRule.ActionsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
