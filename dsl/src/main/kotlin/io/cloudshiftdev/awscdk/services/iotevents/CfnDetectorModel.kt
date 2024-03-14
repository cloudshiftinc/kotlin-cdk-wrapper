package io.cloudshiftdev.awscdk.services.iotevents

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

public open class CfnDetectorModel internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun detectorModelDefinition(): Any = unwrap(this).getDetectorModelDefinition()

  public open fun detectorModelDefinition(`value`: IResolvable) {
    unwrap(this).setDetectorModelDefinition(`value`.let(IResolvable::unwrap))
  }

  public open fun detectorModelDefinition(`value`: DetectorModelDefinitionProperty) {
    unwrap(this).setDetectorModelDefinition(`value`.let(DetectorModelDefinitionProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0be0ab418d81047424da88cf1617c9e3b43e06a7ab4bed9affa7e9e0c4ff8c07")
  public open
      fun detectorModelDefinition(`value`: DetectorModelDefinitionProperty.Builder.() -> Unit): Unit
      = detectorModelDefinition(DetectorModelDefinitionProperty(`value`))

  public open fun detectorModelDescription(): String? = unwrap(this).getDetectorModelDescription()

  public open fun detectorModelDescription(`value`: String) {
    unwrap(this).setDetectorModelDescription(`value`)
  }

  public open fun detectorModelName(): String? = unwrap(this).getDetectorModelName()

  public open fun detectorModelName(`value`: String) {
    unwrap(this).setDetectorModelName(`value`)
  }

  public open fun evaluationMethod(): String? = unwrap(this).getEvaluationMethod()

  public open fun evaluationMethod(`value`: String) {
    unwrap(this).setEvaluationMethod(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun key(): String? = unwrap(this).getKey()

  public open fun key(`value`: String) {
    unwrap(this).setKey(`value`)
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun detectorModelDefinition(detectorModelDefinition: IResolvable)

    public fun detectorModelDefinition(detectorModelDefinition: DetectorModelDefinitionProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be401907fd580a622c85830db56b4abba9620bf2dd662a4747952551dd3f424b")
    public
        fun detectorModelDefinition(detectorModelDefinition: DetectorModelDefinitionProperty.Builder.() -> Unit)

    public fun detectorModelDescription(detectorModelDescription: String)

    public fun detectorModelName(detectorModelName: String)

    public fun evaluationMethod(evaluationMethod: String)

    public fun key(key: String)

    public fun roleArn(roleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotevents.CfnDetectorModel.Builder =
        software.amazon.awscdk.services.iotevents.CfnDetectorModel.Builder.create(scope, id)

    override fun detectorModelDefinition(detectorModelDefinition: IResolvable) {
      cdkBuilder.detectorModelDefinition(detectorModelDefinition.let(IResolvable::unwrap))
    }

    override fun detectorModelDefinition(detectorModelDefinition: DetectorModelDefinitionProperty) {
      cdkBuilder.detectorModelDefinition(detectorModelDefinition.let(DetectorModelDefinitionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be401907fd580a622c85830db56b4abba9620bf2dd662a4747952551dd3f424b")
    override
        fun detectorModelDefinition(detectorModelDefinition: DetectorModelDefinitionProperty.Builder.() -> Unit):
        Unit = detectorModelDefinition(DetectorModelDefinitionProperty(detectorModelDefinition))

    override fun detectorModelDescription(detectorModelDescription: String) {
      cdkBuilder.detectorModelDescription(detectorModelDescription)
    }

    override fun detectorModelName(detectorModelName: String) {
      cdkBuilder.detectorModelName(detectorModelName)
    }

    override fun evaluationMethod(evaluationMethod: String) {
      cdkBuilder.evaluationMethod(evaluationMethod)
    }

    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotevents.CfnDetectorModel =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDetectorModel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDetectorModel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel):
        CfnDetectorModel = CfnDetectorModel(cdkObject)

    internal fun unwrap(wrapped: CfnDetectorModel):
        software.amazon.awscdk.services.iotevents.CfnDetectorModel = wrapped.cdkObject
  }

  public interface ResetTimerProperty {
    public fun timerName(): String

    public interface Builder {
      public fun timerName(timerName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ResetTimerProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ResetTimerProperty.builder()

      override fun timerName(timerName: String) {
        cdkBuilder.timerName(timerName)
      }

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ResetTimerProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ResetTimerProperty,
    ) : ResetTimerProperty {
      override fun timerName(): String = unwrap(this).getTimerName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResetTimerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.ResetTimerProperty):
          ResetTimerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResetTimerProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ResetTimerProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface SetTimerProperty {
    public fun durationExpression(): String? = unwrap(this).getDurationExpression()

    public fun seconds(): Number? = unwrap(this).getSeconds()

    public fun timerName(): String

    public interface Builder {
      public fun durationExpression(durationExpression: String)

      public fun seconds(seconds: Number)

      public fun timerName(timerName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetTimerProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetTimerProperty.builder()

      override fun durationExpression(durationExpression: String) {
        cdkBuilder.durationExpression(durationExpression)
      }

      override fun seconds(seconds: Number) {
        cdkBuilder.seconds(seconds)
      }

      override fun timerName(timerName: String) {
        cdkBuilder.timerName(timerName)
      }

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetTimerProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetTimerProperty,
    ) : SetTimerProperty {
      override fun durationExpression(): String? = unwrap(this).getDurationExpression()

      override fun seconds(): Number? = unwrap(this).getSeconds()

      override fun timerName(): String = unwrap(this).getTimerName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SetTimerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetTimerProperty):
          SetTimerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SetTimerProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetTimerProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PayloadProperty {
    public fun contentExpression(): String

    public fun type(): String

    public interface Builder {
      public fun contentExpression(contentExpression: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty.builder()

      override fun contentExpression(contentExpression: String) {
        cdkBuilder.contentExpression(contentExpression)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty,
    ) : PayloadProperty {
      override fun contentExpression(): String = unwrap(this).getContentExpression()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PayloadProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty):
          PayloadProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PayloadProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TransitionEventProperty {
    public fun actions(): Any? = unwrap(this).getActions()

    public fun condition(): String

    public fun eventName(): String

    public fun nextState(): String

    public interface Builder {
      public fun actions(actions: IResolvable)

      public fun actions(actions: List<Any>)

      public fun actions(vararg actions: Any)

      public fun condition(condition: String)

      public fun eventName(eventName: String)

      public fun nextState(nextState: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.TransitionEventProperty.Builder
          =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.TransitionEventProperty.builder()

      override fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions.let(IResolvable::unwrap))
      }

      override fun actions(actions: List<Any>) {
        cdkBuilder.actions(actions)
      }

      override fun actions(vararg actions: Any): Unit = actions(actions.toList())

      override fun condition(condition: String) {
        cdkBuilder.condition(condition)
      }

      override fun eventName(eventName: String) {
        cdkBuilder.eventName(eventName)
      }

      override fun nextState(nextState: String) {
        cdkBuilder.nextState(nextState)
      }

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.TransitionEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.TransitionEventProperty,
    ) : TransitionEventProperty {
      override fun actions(): Any? = unwrap(this).getActions()

      override fun condition(): String = unwrap(this).getCondition()

      override fun eventName(): String = unwrap(this).getEventName()

      override fun nextState(): String = unwrap(this).getNextState()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TransitionEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.TransitionEventProperty):
          TransitionEventProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransitionEventProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.TransitionEventProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface IotEventsProperty {
    public fun inputName(): String

    public fun payload(): Any? = unwrap(this).getPayload()

    public interface Builder {
      public fun inputName(inputName: String)

      public fun payload(payload: IResolvable)

      public fun payload(payload: PayloadProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ee353d5ad9081f54075a59c294379906f437f7cca9320c9a370872bbd1ab6acd")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotEventsProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotEventsProperty.builder()

      override fun inputName(inputName: String) {
        cdkBuilder.inputName(inputName)
      }

      override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ee353d5ad9081f54075a59c294379906f437f7cca9320c9a370872bbd1ab6acd")
      override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotEventsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotEventsProperty,
    ) : IotEventsProperty {
      override fun inputName(): String = unwrap(this).getInputName()

      override fun payload(): Any? = unwrap(this).getPayload()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IotEventsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotEventsProperty):
          IotEventsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IotEventsProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotEventsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface OnInputProperty {
    public fun events(): Any? = unwrap(this).getEvents()

    public fun transitionEvents(): Any? = unwrap(this).getTransitionEvents()

    public interface Builder {
      public fun events(events: IResolvable)

      public fun events(events: List<Any>)

      public fun events(vararg events: Any)

      public fun transitionEvents(transitionEvents: IResolvable)

      public fun transitionEvents(transitionEvents: List<Any>)

      public fun transitionEvents(vararg transitionEvents: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnInputProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnInputProperty.builder()

      override fun events(events: IResolvable) {
        cdkBuilder.events(events.let(IResolvable::unwrap))
      }

      override fun events(events: List<Any>) {
        cdkBuilder.events(events)
      }

      override fun events(vararg events: Any): Unit = events(events.toList())

      override fun transitionEvents(transitionEvents: IResolvable) {
        cdkBuilder.transitionEvents(transitionEvents.let(IResolvable::unwrap))
      }

      override fun transitionEvents(transitionEvents: List<Any>) {
        cdkBuilder.transitionEvents(transitionEvents)
      }

      override fun transitionEvents(vararg transitionEvents: Any): Unit =
          transitionEvents(transitionEvents.toList())

      public fun build(): software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnInputProperty,
    ) : OnInputProperty {
      override fun events(): Any? = unwrap(this).getEvents()

      override fun transitionEvents(): Any? = unwrap(this).getTransitionEvents()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OnInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnInputProperty):
          OnInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnInputProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnInputProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EventProperty {
    public fun actions(): Any? = unwrap(this).getActions()

    public fun condition(): String? = unwrap(this).getCondition()

    public fun eventName(): String

    public interface Builder {
      public fun actions(actions: IResolvable)

      public fun actions(actions: List<Any>)

      public fun actions(vararg actions: Any)

      public fun condition(condition: String)

      public fun eventName(eventName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.EventProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.EventProperty.builder()

      override fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions.let(IResolvable::unwrap))
      }

      override fun actions(actions: List<Any>) {
        cdkBuilder.actions(actions)
      }

      override fun actions(vararg actions: Any): Unit = actions(actions.toList())

      override fun condition(condition: String) {
        cdkBuilder.condition(condition)
      }

      override fun eventName(eventName: String) {
        cdkBuilder.eventName(eventName)
      }

      public fun build(): software.amazon.awscdk.services.iotevents.CfnDetectorModel.EventProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.EventProperty,
    ) : EventProperty {
      override fun actions(): Any? = unwrap(this).getActions()

      override fun condition(): String? = unwrap(this).getCondition()

      override fun eventName(): String = unwrap(this).getEventName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.EventProperty):
          EventProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.EventProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SnsProperty {
    public fun payload(): Any? = unwrap(this).getPayload()

    public fun targetArn(): String

    public interface Builder {
      public fun payload(payload: IResolvable)

      public fun payload(payload: PayloadProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0e38e9ec707c2083d5fed07bf997a90a6a70e3ebbe1e8aefb34e3837bbdf5085")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit)

      public fun targetArn(targetArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SnsProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SnsProperty.builder()

      override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0e38e9ec707c2083d5fed07bf997a90a6a70e3ebbe1e8aefb34e3837bbdf5085")
      override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      override fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
      }

      public fun build(): software.amazon.awscdk.services.iotevents.CfnDetectorModel.SnsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SnsProperty,
    ) : SnsProperty {
      override fun payload(): Any? = unwrap(this).getPayload()

      override fun targetArn(): String = unwrap(this).getTargetArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SnsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.SnsProperty):
          SnsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnsProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SnsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FirehoseProperty {
    public fun deliveryStreamName(): String

    public fun payload(): Any? = unwrap(this).getPayload()

    public fun separator(): String? = unwrap(this).getSeparator()

    public interface Builder {
      public fun deliveryStreamName(deliveryStreamName: String)

      public fun payload(payload: IResolvable)

      public fun payload(payload: PayloadProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6d6fe46e21f28c628927db685594aa34ebd736bce6212a486e4151fb794fa754")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit)

      public fun separator(separator: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.FirehoseProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.FirehoseProperty.builder()

      override fun deliveryStreamName(deliveryStreamName: String) {
        cdkBuilder.deliveryStreamName(deliveryStreamName)
      }

      override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6d6fe46e21f28c628927db685594aa34ebd736bce6212a486e4151fb794fa754")
      override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      override fun separator(separator: String) {
        cdkBuilder.separator(separator)
      }

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.FirehoseProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.FirehoseProperty,
    ) : FirehoseProperty {
      override fun deliveryStreamName(): String = unwrap(this).getDeliveryStreamName()

      override fun payload(): Any? = unwrap(this).getPayload()

      override fun separator(): String? = unwrap(this).getSeparator()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FirehoseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.FirehoseProperty):
          FirehoseProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FirehoseProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.FirehoseProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface IotSiteWiseProperty {
    public fun assetId(): String? = unwrap(this).getAssetId()

    public fun entryId(): String? = unwrap(this).getEntryId()

    public fun propertyAlias(): String? = unwrap(this).getPropertyAlias()

    public fun propertyId(): String? = unwrap(this).getPropertyId()

    public fun propertyValue(): Any

    public interface Builder {
      public fun assetId(assetId: String)

      public fun entryId(entryId: String)

      public fun propertyAlias(propertyAlias: String)

      public fun propertyId(propertyId: String)

      public fun propertyValue(propertyValue: IResolvable)

      public fun propertyValue(propertyValue: AssetPropertyValueProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b0a81d6728ba70e437a86613bfd50d5ce58f813db9dabb984529bd6e6bd215b")
      public fun propertyValue(propertyValue: AssetPropertyValueProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotSiteWiseProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotSiteWiseProperty.builder()

      override fun assetId(assetId: String) {
        cdkBuilder.assetId(assetId)
      }

      override fun entryId(entryId: String) {
        cdkBuilder.entryId(entryId)
      }

      override fun propertyAlias(propertyAlias: String) {
        cdkBuilder.propertyAlias(propertyAlias)
      }

      override fun propertyId(propertyId: String) {
        cdkBuilder.propertyId(propertyId)
      }

      override fun propertyValue(propertyValue: IResolvable) {
        cdkBuilder.propertyValue(propertyValue.let(IResolvable::unwrap))
      }

      override fun propertyValue(propertyValue: AssetPropertyValueProperty) {
        cdkBuilder.propertyValue(propertyValue.let(AssetPropertyValueProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b0a81d6728ba70e437a86613bfd50d5ce58f813db9dabb984529bd6e6bd215b")
      override fun propertyValue(propertyValue: AssetPropertyValueProperty.Builder.() -> Unit): Unit
          = propertyValue(AssetPropertyValueProperty(propertyValue))

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotSiteWiseProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotSiteWiseProperty,
    ) : IotSiteWiseProperty {
      override fun assetId(): String? = unwrap(this).getAssetId()

      override fun entryId(): String? = unwrap(this).getEntryId()

      override fun propertyAlias(): String? = unwrap(this).getPropertyAlias()

      override fun propertyId(): String? = unwrap(this).getPropertyId()

      override fun propertyValue(): Any = unwrap(this).getPropertyValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IotSiteWiseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotSiteWiseProperty):
          IotSiteWiseProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IotSiteWiseProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotSiteWiseProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface SetVariableProperty {
    public fun `value`(): String

    public fun variableName(): String

    public interface Builder {
      public fun `value`(`value`: String)

      public fun variableName(variableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetVariableProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetVariableProperty.builder()

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      override fun variableName(variableName: String) {
        cdkBuilder.variableName(variableName)
      }

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetVariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetVariableProperty,
    ) : SetVariableProperty {
      override fun `value`(): String = unwrap(this).getValue()

      override fun variableName(): String = unwrap(this).getVariableName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SetVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetVariableProperty):
          SetVariableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SetVariableProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetVariableProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface StateProperty {
    public fun onEnter(): Any? = unwrap(this).getOnEnter()

    public fun onExit(): Any? = unwrap(this).getOnExit()

    public fun onInput(): Any? = unwrap(this).getOnInput()

    public fun stateName(): String

    public interface Builder {
      public fun onEnter(onEnter: IResolvable)

      public fun onEnter(onEnter: OnEnterProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dbe58dcb1ee46d3682f5d957890d6d35ed4f0b55ee4a740236fff99ba95e6019")
      public fun onEnter(onEnter: OnEnterProperty.Builder.() -> Unit)

      public fun onExit(onExit: IResolvable)

      public fun onExit(onExit: OnExitProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82574d1c4fd6f6dbdc274d99921b89e2e192d9dc583c55c881c81073a30135eb")
      public fun onExit(onExit: OnExitProperty.Builder.() -> Unit)

      public fun onInput(onInput: IResolvable)

      public fun onInput(onInput: OnInputProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a872d3afe5265eeedc06502a337e9640e005a3bb2011a2f860fa9510635164f6")
      public fun onInput(onInput: OnInputProperty.Builder.() -> Unit)

      public fun stateName(stateName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.StateProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.StateProperty.builder()

      override fun onEnter(onEnter: IResolvable) {
        cdkBuilder.onEnter(onEnter.let(IResolvable::unwrap))
      }

      override fun onEnter(onEnter: OnEnterProperty) {
        cdkBuilder.onEnter(onEnter.let(OnEnterProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dbe58dcb1ee46d3682f5d957890d6d35ed4f0b55ee4a740236fff99ba95e6019")
      override fun onEnter(onEnter: OnEnterProperty.Builder.() -> Unit): Unit =
          onEnter(OnEnterProperty(onEnter))

      override fun onExit(onExit: IResolvable) {
        cdkBuilder.onExit(onExit.let(IResolvable::unwrap))
      }

      override fun onExit(onExit: OnExitProperty) {
        cdkBuilder.onExit(onExit.let(OnExitProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82574d1c4fd6f6dbdc274d99921b89e2e192d9dc583c55c881c81073a30135eb")
      override fun onExit(onExit: OnExitProperty.Builder.() -> Unit): Unit =
          onExit(OnExitProperty(onExit))

      override fun onInput(onInput: IResolvable) {
        cdkBuilder.onInput(onInput.let(IResolvable::unwrap))
      }

      override fun onInput(onInput: OnInputProperty) {
        cdkBuilder.onInput(onInput.let(OnInputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a872d3afe5265eeedc06502a337e9640e005a3bb2011a2f860fa9510635164f6")
      override fun onInput(onInput: OnInputProperty.Builder.() -> Unit): Unit =
          onInput(OnInputProperty(onInput))

      override fun stateName(stateName: String) {
        cdkBuilder.stateName(stateName)
      }

      public fun build(): software.amazon.awscdk.services.iotevents.CfnDetectorModel.StateProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.StateProperty,
    ) : StateProperty {
      override fun onEnter(): Any? = unwrap(this).getOnEnter()

      override fun onExit(): Any? = unwrap(this).getOnExit()

      override fun onInput(): Any? = unwrap(this).getOnInput()

      override fun stateName(): String = unwrap(this).getStateName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.StateProperty):
          StateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StateProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.StateProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ClearTimerProperty {
    public fun timerName(): String

    public interface Builder {
      public fun timerName(timerName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ClearTimerProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ClearTimerProperty.builder()

      override fun timerName(timerName: String) {
        cdkBuilder.timerName(timerName)
      }

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ClearTimerProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ClearTimerProperty,
    ) : ClearTimerProperty {
      override fun timerName(): String = unwrap(this).getTimerName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ClearTimerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.ClearTimerProperty):
          ClearTimerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClearTimerProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ClearTimerProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface OnExitProperty {
    public fun events(): Any? = unwrap(this).getEvents()

    public interface Builder {
      public fun events(events: IResolvable)

      public fun events(events: List<Any>)

      public fun events(vararg events: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnExitProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnExitProperty.builder()

      override fun events(events: IResolvable) {
        cdkBuilder.events(events.let(IResolvable::unwrap))
      }

      override fun events(events: List<Any>) {
        cdkBuilder.events(events)
      }

      override fun events(vararg events: Any): Unit = events(events.toList())

      public fun build(): software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnExitProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnExitProperty,
    ) : OnExitProperty {
      override fun events(): Any? = unwrap(this).getEvents()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OnExitProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnExitProperty):
          OnExitProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnExitProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnExitProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface IotTopicPublishProperty {
    public fun mqttTopic(): String

    public fun payload(): Any? = unwrap(this).getPayload()

    public interface Builder {
      public fun mqttTopic(mqttTopic: String)

      public fun payload(payload: IResolvable)

      public fun payload(payload: PayloadProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c17305249a77373a0a0d90b8ca415f03c90b527f54a63a1d107e5d424fc9362")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotTopicPublishProperty.Builder
          =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotTopicPublishProperty.builder()

      override fun mqttTopic(mqttTopic: String) {
        cdkBuilder.mqttTopic(mqttTopic)
      }

      override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c17305249a77373a0a0d90b8ca415f03c90b527f54a63a1d107e5d424fc9362")
      override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotTopicPublishProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotTopicPublishProperty,
    ) : IotTopicPublishProperty {
      override fun mqttTopic(): String = unwrap(this).getMqttTopic()

      override fun payload(): Any? = unwrap(this).getPayload()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IotTopicPublishProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotTopicPublishProperty):
          IotTopicPublishProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IotTopicPublishProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotTopicPublishProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AssetPropertyTimestampProperty {
    public fun offsetInNanos(): String? = unwrap(this).getOffsetInNanos()

    public fun timeInSeconds(): String

    public interface Builder {
      public fun offsetInNanos(offsetInNanos: String)

      public fun timeInSeconds(timeInSeconds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyTimestampProperty.Builder
          =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyTimestampProperty.builder()

      override fun offsetInNanos(offsetInNanos: String) {
        cdkBuilder.offsetInNanos(offsetInNanos)
      }

      override fun timeInSeconds(timeInSeconds: String) {
        cdkBuilder.timeInSeconds(timeInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyTimestampProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyTimestampProperty,
    ) : AssetPropertyTimestampProperty {
      override fun offsetInNanos(): String? = unwrap(this).getOffsetInNanos()

      override fun timeInSeconds(): String = unwrap(this).getTimeInSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AssetPropertyTimestampProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyTimestampProperty):
          AssetPropertyTimestampProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssetPropertyTimestampProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyTimestampProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DynamoDBv2Property {
    public fun payload(): Any? = unwrap(this).getPayload()

    public fun tableName(): String

    public interface Builder {
      public fun payload(payload: IResolvable)

      public fun payload(payload: PayloadProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("92706b11054bb982d6adc246c989d5714835d614a6ccb974ac9b3da004bea6e0")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit)

      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBv2Property.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBv2Property.builder()

      override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("92706b11054bb982d6adc246c989d5714835d614a6ccb974ac9b3da004bea6e0")
      override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBv2Property =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBv2Property,
    ) : DynamoDBv2Property {
      override fun payload(): Any? = unwrap(this).getPayload()

      override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DynamoDBv2Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBv2Property):
          DynamoDBv2Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynamoDBv2Property):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBv2Property = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ActionProperty {
    public fun clearTimer(): Any? = unwrap(this).getClearTimer()

    public fun dynamoDBv2(): Any? = unwrap(this).getDynamoDBv2()

    public fun dynamoDb(): Any? = unwrap(this).getDynamoDb()

    public fun firehose(): Any? = unwrap(this).getFirehose()

    public fun iotEvents(): Any? = unwrap(this).getIotEvents()

    public fun iotSiteWise(): Any? = unwrap(this).getIotSiteWise()

    public fun iotTopicPublish(): Any? = unwrap(this).getIotTopicPublish()

    public fun lambda(): Any? = unwrap(this).getLambda()

    public fun resetTimer(): Any? = unwrap(this).getResetTimer()

    public fun setTimer(): Any? = unwrap(this).getSetTimer()

    public fun setVariable(): Any? = unwrap(this).getSetVariable()

    public fun sns(): Any? = unwrap(this).getSns()

    public fun sqs(): Any? = unwrap(this).getSqs()

    public interface Builder {
      public fun clearTimer(clearTimer: IResolvable)

      public fun clearTimer(clearTimer: ClearTimerProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db7d8aa59ad72ba9956c40031210db20762d92ca2143ca8c28105e8ffa4d2330")
      public fun clearTimer(clearTimer: ClearTimerProperty.Builder.() -> Unit)

      public fun dynamoDBv2(dynamoDBv2: IResolvable)

      public fun dynamoDBv2(dynamoDBv2: DynamoDBv2Property)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c1a9008a423aeec6241494d587309a0a378495d79db57e6f71f7f0c79631298")
      public fun dynamoDBv2(dynamoDBv2: DynamoDBv2Property.Builder.() -> Unit)

      public fun dynamoDb(dynamoDb: IResolvable)

      public fun dynamoDb(dynamoDb: DynamoDBProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("271fb8d9e9d3bd401ed280c04a6c8132a9a15a7419bbb659800d1c6001f55247")
      public fun dynamoDb(dynamoDb: DynamoDBProperty.Builder.() -> Unit)

      public fun firehose(firehose: IResolvable)

      public fun firehose(firehose: FirehoseProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba3e5622ef653af9dc7a69414dece1a773589cc1710d8d6c313c58103d89ea96")
      public fun firehose(firehose: FirehoseProperty.Builder.() -> Unit)

      public fun iotEvents(iotEvents: IResolvable)

      public fun iotEvents(iotEvents: IotEventsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cbe1eea9f0736eafc01048f402a4e6bf8f1cdfa270fbb4f64d92a9bf0f41fbc8")
      public fun iotEvents(iotEvents: IotEventsProperty.Builder.() -> Unit)

      public fun iotSiteWise(iotSiteWise: IResolvable)

      public fun iotSiteWise(iotSiteWise: IotSiteWiseProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("13de76a3d29bb10ab350e0bbb5647d9ed80366eedee0baaa488467ce2e049798")
      public fun iotSiteWise(iotSiteWise: IotSiteWiseProperty.Builder.() -> Unit)

      public fun iotTopicPublish(iotTopicPublish: IResolvable)

      public fun iotTopicPublish(iotTopicPublish: IotTopicPublishProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f3d86740eb79d983361036690dd00226c72d80e8042b9e4b3dd5a863906d2bda")
      public fun iotTopicPublish(iotTopicPublish: IotTopicPublishProperty.Builder.() -> Unit)

      public fun lambda(lambda: IResolvable)

      public fun lambda(lambda: LambdaProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a6f46a622d765c1d144250b22041e53dffa376cbbc5aa99d54771f981a6d9860")
      public fun lambda(lambda: LambdaProperty.Builder.() -> Unit)

      public fun resetTimer(resetTimer: IResolvable)

      public fun resetTimer(resetTimer: ResetTimerProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("65d0c667ec672fdb4688d9d5a1254d0bc36f4f59b8f07a9b32dc3dde4e2413fa")
      public fun resetTimer(resetTimer: ResetTimerProperty.Builder.() -> Unit)

      public fun sns(sns: IResolvable)

      public fun sns(sns: SnsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e883dec081f39433c01e22279cc6c493f080a70233f313b015f3825b71773a93")
      public fun sns(sns: SnsProperty.Builder.() -> Unit)

      public fun sqs(sqs: IResolvable)

      public fun sqs(sqs: SqsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("47b9dbae7dfd14c4928d2c12b8bfa00e0cbf004bd1e552ab2aec431fec729b82")
      public fun sqs(sqs: SqsProperty.Builder.() -> Unit)

      public fun timer(setTimer: IResolvable)

      public fun timer(setTimer: SetTimerProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f9ff70c4b783295b08051f98891dfe8e8f9e9645de78c4e98e36d0344174e3f")
      public fun timer(setTimer: SetTimerProperty.Builder.() -> Unit)

      public fun variable(setVariable: IResolvable)

      public fun variable(setVariable: SetVariableProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("873dceb69490e6eeffb77b7388e777abb52ee40efab1926a0c667271af0768db")
      public fun variable(setVariable: SetVariableProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ActionProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ActionProperty.builder()

      override fun clearTimer(clearTimer: IResolvable) {
        cdkBuilder.clearTimer(clearTimer.let(IResolvable::unwrap))
      }

      override fun clearTimer(clearTimer: ClearTimerProperty) {
        cdkBuilder.clearTimer(clearTimer.let(ClearTimerProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db7d8aa59ad72ba9956c40031210db20762d92ca2143ca8c28105e8ffa4d2330")
      override fun clearTimer(clearTimer: ClearTimerProperty.Builder.() -> Unit): Unit =
          clearTimer(ClearTimerProperty(clearTimer))

      override fun dynamoDBv2(dynamoDBv2: IResolvable) {
        cdkBuilder.dynamoDBv2(dynamoDBv2.let(IResolvable::unwrap))
      }

      override fun dynamoDBv2(dynamoDBv2: DynamoDBv2Property) {
        cdkBuilder.dynamoDBv2(dynamoDBv2.let(DynamoDBv2Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c1a9008a423aeec6241494d587309a0a378495d79db57e6f71f7f0c79631298")
      override fun dynamoDBv2(dynamoDBv2: DynamoDBv2Property.Builder.() -> Unit): Unit =
          dynamoDBv2(DynamoDBv2Property(dynamoDBv2))

      override fun dynamoDb(dynamoDb: IResolvable) {
        cdkBuilder.dynamoDb(dynamoDb.let(IResolvable::unwrap))
      }

      override fun dynamoDb(dynamoDb: DynamoDBProperty) {
        cdkBuilder.dynamoDb(dynamoDb.let(DynamoDBProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("271fb8d9e9d3bd401ed280c04a6c8132a9a15a7419bbb659800d1c6001f55247")
      override fun dynamoDb(dynamoDb: DynamoDBProperty.Builder.() -> Unit): Unit =
          dynamoDb(DynamoDBProperty(dynamoDb))

      override fun firehose(firehose: IResolvable) {
        cdkBuilder.firehose(firehose.let(IResolvable::unwrap))
      }

      override fun firehose(firehose: FirehoseProperty) {
        cdkBuilder.firehose(firehose.let(FirehoseProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba3e5622ef653af9dc7a69414dece1a773589cc1710d8d6c313c58103d89ea96")
      override fun firehose(firehose: FirehoseProperty.Builder.() -> Unit): Unit =
          firehose(FirehoseProperty(firehose))

      override fun iotEvents(iotEvents: IResolvable) {
        cdkBuilder.iotEvents(iotEvents.let(IResolvable::unwrap))
      }

      override fun iotEvents(iotEvents: IotEventsProperty) {
        cdkBuilder.iotEvents(iotEvents.let(IotEventsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cbe1eea9f0736eafc01048f402a4e6bf8f1cdfa270fbb4f64d92a9bf0f41fbc8")
      override fun iotEvents(iotEvents: IotEventsProperty.Builder.() -> Unit): Unit =
          iotEvents(IotEventsProperty(iotEvents))

      override fun iotSiteWise(iotSiteWise: IResolvable) {
        cdkBuilder.iotSiteWise(iotSiteWise.let(IResolvable::unwrap))
      }

      override fun iotSiteWise(iotSiteWise: IotSiteWiseProperty) {
        cdkBuilder.iotSiteWise(iotSiteWise.let(IotSiteWiseProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("13de76a3d29bb10ab350e0bbb5647d9ed80366eedee0baaa488467ce2e049798")
      override fun iotSiteWise(iotSiteWise: IotSiteWiseProperty.Builder.() -> Unit): Unit =
          iotSiteWise(IotSiteWiseProperty(iotSiteWise))

      override fun iotTopicPublish(iotTopicPublish: IResolvable) {
        cdkBuilder.iotTopicPublish(iotTopicPublish.let(IResolvable::unwrap))
      }

      override fun iotTopicPublish(iotTopicPublish: IotTopicPublishProperty) {
        cdkBuilder.iotTopicPublish(iotTopicPublish.let(IotTopicPublishProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f3d86740eb79d983361036690dd00226c72d80e8042b9e4b3dd5a863906d2bda")
      override fun iotTopicPublish(iotTopicPublish: IotTopicPublishProperty.Builder.() -> Unit):
          Unit = iotTopicPublish(IotTopicPublishProperty(iotTopicPublish))

      override fun lambda(lambda: IResolvable) {
        cdkBuilder.lambda(lambda.let(IResolvable::unwrap))
      }

      override fun lambda(lambda: LambdaProperty) {
        cdkBuilder.lambda(lambda.let(LambdaProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a6f46a622d765c1d144250b22041e53dffa376cbbc5aa99d54771f981a6d9860")
      override fun lambda(lambda: LambdaProperty.Builder.() -> Unit): Unit =
          lambda(LambdaProperty(lambda))

      override fun resetTimer(resetTimer: IResolvable) {
        cdkBuilder.resetTimer(resetTimer.let(IResolvable::unwrap))
      }

      override fun resetTimer(resetTimer: ResetTimerProperty) {
        cdkBuilder.resetTimer(resetTimer.let(ResetTimerProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("65d0c667ec672fdb4688d9d5a1254d0bc36f4f59b8f07a9b32dc3dde4e2413fa")
      override fun resetTimer(resetTimer: ResetTimerProperty.Builder.() -> Unit): Unit =
          resetTimer(ResetTimerProperty(resetTimer))

      override fun sns(sns: IResolvable) {
        cdkBuilder.sns(sns.let(IResolvable::unwrap))
      }

      override fun sns(sns: SnsProperty) {
        cdkBuilder.sns(sns.let(SnsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e883dec081f39433c01e22279cc6c493f080a70233f313b015f3825b71773a93")
      override fun sns(sns: SnsProperty.Builder.() -> Unit): Unit = sns(SnsProperty(sns))

      override fun sqs(sqs: IResolvable) {
        cdkBuilder.sqs(sqs.let(IResolvable::unwrap))
      }

      override fun sqs(sqs: SqsProperty) {
        cdkBuilder.sqs(sqs.let(SqsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("47b9dbae7dfd14c4928d2c12b8bfa00e0cbf004bd1e552ab2aec431fec729b82")
      override fun sqs(sqs: SqsProperty.Builder.() -> Unit): Unit = sqs(SqsProperty(sqs))

      override fun timer(setTimer: IResolvable) {
        cdkBuilder.setTimer(setTimer.let(IResolvable::unwrap))
      }

      override fun timer(setTimer: SetTimerProperty) {
        cdkBuilder.setTimer(setTimer.let(SetTimerProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f9ff70c4b783295b08051f98891dfe8e8f9e9645de78c4e98e36d0344174e3f")
      override fun timer(setTimer: SetTimerProperty.Builder.() -> Unit): Unit =
          timer(SetTimerProperty(setTimer))

      override fun variable(setVariable: IResolvable) {
        cdkBuilder.setVariable(setVariable.let(IResolvable::unwrap))
      }

      override fun variable(setVariable: SetVariableProperty) {
        cdkBuilder.setVariable(setVariable.let(SetVariableProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("873dceb69490e6eeffb77b7388e777abb52ee40efab1926a0c667271af0768db")
      override fun variable(setVariable: SetVariableProperty.Builder.() -> Unit): Unit =
          variable(SetVariableProperty(setVariable))

      public fun build(): software.amazon.awscdk.services.iotevents.CfnDetectorModel.ActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ActionProperty,
    ) : ActionProperty {
      override fun clearTimer(): Any? = unwrap(this).getClearTimer()

      override fun dynamoDBv2(): Any? = unwrap(this).getDynamoDBv2()

      override fun dynamoDb(): Any? = unwrap(this).getDynamoDb()

      override fun firehose(): Any? = unwrap(this).getFirehose()

      override fun iotEvents(): Any? = unwrap(this).getIotEvents()

      override fun iotSiteWise(): Any? = unwrap(this).getIotSiteWise()

      override fun iotTopicPublish(): Any? = unwrap(this).getIotTopicPublish()

      override fun lambda(): Any? = unwrap(this).getLambda()

      override fun resetTimer(): Any? = unwrap(this).getResetTimer()

      override fun setTimer(): Any? = unwrap(this).getSetTimer()

      override fun setVariable(): Any? = unwrap(this).getSetVariable()

      override fun sns(): Any? = unwrap(this).getSns()

      override fun sqs(): Any? = unwrap(this).getSqs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.ActionProperty):
          ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DynamoDBProperty {
    public fun hashKeyField(): String

    public fun hashKeyType(): String? = unwrap(this).getHashKeyType()

    public fun hashKeyValue(): String

    public fun operation(): String? = unwrap(this).getOperation()

    public fun payload(): Any? = unwrap(this).getPayload()

    public fun payloadField(): String? = unwrap(this).getPayloadField()

    public fun rangeKeyField(): String? = unwrap(this).getRangeKeyField()

    public fun rangeKeyType(): String? = unwrap(this).getRangeKeyType()

    public fun rangeKeyValue(): String? = unwrap(this).getRangeKeyValue()

    public fun tableName(): String

    public interface Builder {
      public fun hashKeyField(hashKeyField: String)

      public fun hashKeyType(hashKeyType: String)

      public fun hashKeyValue(hashKeyValue: String)

      public fun operation(operation: String)

      public fun payload(payload: IResolvable)

      public fun payload(payload: PayloadProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6376c0885764817128553b3273c1ad82e137d6ba9bd4d1b701d8ef13f9abaa66")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit)

      public fun payloadField(payloadField: String)

      public fun rangeKeyField(rangeKeyField: String)

      public fun rangeKeyType(rangeKeyType: String)

      public fun rangeKeyValue(rangeKeyValue: String)

      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBProperty.builder()

      override fun hashKeyField(hashKeyField: String) {
        cdkBuilder.hashKeyField(hashKeyField)
      }

      override fun hashKeyType(hashKeyType: String) {
        cdkBuilder.hashKeyType(hashKeyType)
      }

      override fun hashKeyValue(hashKeyValue: String) {
        cdkBuilder.hashKeyValue(hashKeyValue)
      }

      override fun operation(operation: String) {
        cdkBuilder.operation(operation)
      }

      override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6376c0885764817128553b3273c1ad82e137d6ba9bd4d1b701d8ef13f9abaa66")
      override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      override fun payloadField(payloadField: String) {
        cdkBuilder.payloadField(payloadField)
      }

      override fun rangeKeyField(rangeKeyField: String) {
        cdkBuilder.rangeKeyField(rangeKeyField)
      }

      override fun rangeKeyType(rangeKeyType: String) {
        cdkBuilder.rangeKeyType(rangeKeyType)
      }

      override fun rangeKeyValue(rangeKeyValue: String) {
        cdkBuilder.rangeKeyValue(rangeKeyValue)
      }

      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBProperty,
    ) : DynamoDBProperty {
      override fun hashKeyField(): String = unwrap(this).getHashKeyField()

      override fun hashKeyType(): String? = unwrap(this).getHashKeyType()

      override fun hashKeyValue(): String = unwrap(this).getHashKeyValue()

      override fun operation(): String? = unwrap(this).getOperation()

      override fun payload(): Any? = unwrap(this).getPayload()

      override fun payloadField(): String? = unwrap(this).getPayloadField()

      override fun rangeKeyField(): String? = unwrap(this).getRangeKeyField()

      override fun rangeKeyType(): String? = unwrap(this).getRangeKeyType()

      override fun rangeKeyValue(): String? = unwrap(this).getRangeKeyValue()

      override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DynamoDBProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBProperty):
          DynamoDBProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynamoDBProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AssetPropertyValueProperty {
    public fun quality(): String? = unwrap(this).getQuality()

    public fun timestamp(): Any? = unwrap(this).getTimestamp()

    public fun `value`(): Any

    public interface Builder {
      public fun quality(quality: String)

      public fun timestamp(timestamp: IResolvable)

      public fun timestamp(timestamp: AssetPropertyTimestampProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0a3915e8dda48e5ddf58a35ff2a83ed0e79cfbc4a47024cd74aedbf6464daae5")
      public fun timestamp(timestamp: AssetPropertyTimestampProperty.Builder.() -> Unit)

      public fun `value`(`value`: IResolvable)

      public fun `value`(`value`: AssetPropertyVariantProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("12dad539c739121643e786152c5261d3ace7a3fa50ca93f430aafeddbe78c884")
      public fun `value`(`value`: AssetPropertyVariantProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyValueProperty.Builder
          =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyValueProperty.builder()

      override fun quality(quality: String) {
        cdkBuilder.quality(quality)
      }

      override fun timestamp(timestamp: IResolvable) {
        cdkBuilder.timestamp(timestamp.let(IResolvable::unwrap))
      }

      override fun timestamp(timestamp: AssetPropertyTimestampProperty) {
        cdkBuilder.timestamp(timestamp.let(AssetPropertyTimestampProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0a3915e8dda48e5ddf58a35ff2a83ed0e79cfbc4a47024cd74aedbf6464daae5")
      override fun timestamp(timestamp: AssetPropertyTimestampProperty.Builder.() -> Unit): Unit =
          timestamp(AssetPropertyTimestampProperty(timestamp))

      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable::unwrap))
      }

      override fun `value`(`value`: AssetPropertyVariantProperty) {
        cdkBuilder.`value`(`value`.let(AssetPropertyVariantProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("12dad539c739121643e786152c5261d3ace7a3fa50ca93f430aafeddbe78c884")
      override fun `value`(`value`: AssetPropertyVariantProperty.Builder.() -> Unit): Unit =
          `value`(AssetPropertyVariantProperty(`value`))

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyValueProperty,
    ) : AssetPropertyValueProperty {
      override fun quality(): String? = unwrap(this).getQuality()

      override fun timestamp(): Any? = unwrap(this).getTimestamp()

      override fun `value`(): Any = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AssetPropertyValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyValueProperty):
          AssetPropertyValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssetPropertyValueProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyValueProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface OnEnterProperty {
    public fun events(): Any? = unwrap(this).getEvents()

    public interface Builder {
      public fun events(events: IResolvable)

      public fun events(events: List<Any>)

      public fun events(vararg events: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnEnterProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnEnterProperty.builder()

      override fun events(events: IResolvable) {
        cdkBuilder.events(events.let(IResolvable::unwrap))
      }

      override fun events(events: List<Any>) {
        cdkBuilder.events(events)
      }

      override fun events(vararg events: Any): Unit = events(events.toList())

      public fun build(): software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnEnterProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnEnterProperty,
    ) : OnEnterProperty {
      override fun events(): Any? = unwrap(this).getEvents()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OnEnterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnEnterProperty):
          OnEnterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnEnterProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnEnterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SqsProperty {
    public fun payload(): Any? = unwrap(this).getPayload()

    public fun queueUrl(): String

    public fun useBase64(): Any? = unwrap(this).getUseBase64()

    public interface Builder {
      public fun payload(payload: IResolvable)

      public fun payload(payload: PayloadProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00d74b45a618d619f64b950a77344905c2d5cc8e1d376582ac994928584a5efb")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit)

      public fun queueUrl(queueUrl: String)

      public fun useBase64(useBase64: Boolean)

      public fun useBase64(useBase64: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SqsProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SqsProperty.builder()

      override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00d74b45a618d619f64b950a77344905c2d5cc8e1d376582ac994928584a5efb")
      override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      override fun queueUrl(queueUrl: String) {
        cdkBuilder.queueUrl(queueUrl)
      }

      override fun useBase64(useBase64: Boolean) {
        cdkBuilder.useBase64(useBase64)
      }

      override fun useBase64(useBase64: IResolvable) {
        cdkBuilder.useBase64(useBase64.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.iotevents.CfnDetectorModel.SqsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SqsProperty,
    ) : SqsProperty {
      override fun payload(): Any? = unwrap(this).getPayload()

      override fun queueUrl(): String = unwrap(this).getQueueUrl()

      override fun useBase64(): Any? = unwrap(this).getUseBase64()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SqsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.SqsProperty):
          SqsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SqsProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SqsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LambdaProperty {
    public fun functionArn(): String

    public fun payload(): Any? = unwrap(this).getPayload()

    public interface Builder {
      public fun functionArn(functionArn: String)

      public fun payload(payload: IResolvable)

      public fun payload(payload: PayloadProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f2a77b53098ccda137f1f71ae68c5e7b9f724aabb6bfdb499f7b6d771206ab7")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.LambdaProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.LambdaProperty.builder()

      override fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
      }

      override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f2a77b53098ccda137f1f71ae68c5e7b9f724aabb6bfdb499f7b6d771206ab7")
      override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      public fun build(): software.amazon.awscdk.services.iotevents.CfnDetectorModel.LambdaProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.LambdaProperty,
    ) : LambdaProperty {
      override fun functionArn(): String = unwrap(this).getFunctionArn()

      override fun payload(): Any? = unwrap(this).getPayload()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.LambdaProperty):
          LambdaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.LambdaProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DetectorModelDefinitionProperty {
    public fun initialStateName(): String

    public fun states(): Any

    public interface Builder {
      public fun initialStateName(initialStateName: String)

      public fun states(states: IResolvable)

      public fun states(states: List<Any>)

      public fun states(vararg states: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DetectorModelDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DetectorModelDefinitionProperty.builder()

      override fun initialStateName(initialStateName: String) {
        cdkBuilder.initialStateName(initialStateName)
      }

      override fun states(states: IResolvable) {
        cdkBuilder.states(states.let(IResolvable::unwrap))
      }

      override fun states(states: List<Any>) {
        cdkBuilder.states(states)
      }

      override fun states(vararg states: Any): Unit = states(states.toList())

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DetectorModelDefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DetectorModelDefinitionProperty,
    ) : DetectorModelDefinitionProperty {
      override fun initialStateName(): String = unwrap(this).getInitialStateName()

      override fun states(): Any = unwrap(this).getStates()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DetectorModelDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.DetectorModelDefinitionProperty):
          DetectorModelDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DetectorModelDefinitionProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DetectorModelDefinitionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AssetPropertyVariantProperty {
    public fun booleanValue(): String? = unwrap(this).getBooleanValue()

    public fun doubleValue(): String? = unwrap(this).getDoubleValue()

    public fun integerValue(): String? = unwrap(this).getIntegerValue()

    public fun stringValue(): String? = unwrap(this).getStringValue()

    public interface Builder {
      public fun booleanValue(booleanValue: String)

      public fun doubleValue(doubleValue: String)

      public fun integerValue(integerValue: String)

      public fun stringValue(stringValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyVariantProperty.Builder
          =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyVariantProperty.builder()

      override fun booleanValue(booleanValue: String) {
        cdkBuilder.booleanValue(booleanValue)
      }

      override fun doubleValue(doubleValue: String) {
        cdkBuilder.doubleValue(doubleValue)
      }

      override fun integerValue(integerValue: String) {
        cdkBuilder.integerValue(integerValue)
      }

      override fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
      }

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyVariantProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyVariantProperty,
    ) : AssetPropertyVariantProperty {
      override fun booleanValue(): String? = unwrap(this).getBooleanValue()

      override fun doubleValue(): String? = unwrap(this).getDoubleValue()

      override fun integerValue(): String? = unwrap(this).getIntegerValue()

      override fun stringValue(): String? = unwrap(this).getStringValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AssetPropertyVariantProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyVariantProperty):
          AssetPropertyVariantProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssetPropertyVariantProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyVariantProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
