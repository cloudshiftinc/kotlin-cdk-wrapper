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

public open class CfnAlarmModel internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun alarmCapabilities(): Any? = unwrap(this).getAlarmCapabilities()

  public open fun alarmCapabilities(`value`: IResolvable) {
    unwrap(this).setAlarmCapabilities(`value`.let(IResolvable::unwrap))
  }

  public open fun alarmCapabilities(`value`: AlarmCapabilitiesProperty) {
    unwrap(this).setAlarmCapabilities(`value`.let(AlarmCapabilitiesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ef26fbaa45250126c0f25b78b2ef45b27e661406663c43bc3d7cfaeedc987dc7")
  public open fun alarmCapabilities(`value`: AlarmCapabilitiesProperty.Builder.() -> Unit): Unit =
      alarmCapabilities(AlarmCapabilitiesProperty(`value`))

  public open fun alarmEventActions(): Any? = unwrap(this).getAlarmEventActions()

  public open fun alarmEventActions(`value`: IResolvable) {
    unwrap(this).setAlarmEventActions(`value`.let(IResolvable::unwrap))
  }

  public open fun alarmEventActions(`value`: AlarmEventActionsProperty) {
    unwrap(this).setAlarmEventActions(`value`.let(AlarmEventActionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a246d81ab335d15dfc8997503cbc26762b2cf66f66c5aa35ceb90eec3ca07a12")
  public open fun alarmEventActions(`value`: AlarmEventActionsProperty.Builder.() -> Unit): Unit =
      alarmEventActions(AlarmEventActionsProperty(`value`))

  public open fun alarmModelDescription(): String? = unwrap(this).getAlarmModelDescription()

  public open fun alarmModelDescription(`value`: String) {
    unwrap(this).setAlarmModelDescription(`value`)
  }

  public open fun alarmModelName(): String? = unwrap(this).getAlarmModelName()

  public open fun alarmModelName(`value`: String) {
    unwrap(this).setAlarmModelName(`value`)
  }

  public open fun alarmRule(): Any = unwrap(this).getAlarmRule()

  public open fun alarmRule(`value`: IResolvable) {
    unwrap(this).setAlarmRule(`value`.let(IResolvable::unwrap))
  }

  public open fun alarmRule(`value`: AlarmRuleProperty) {
    unwrap(this).setAlarmRule(`value`.let(AlarmRuleProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3c1a346111d052385a72f46a079b1d174e777312c7816eff9cbf6de0157bb10c")
  public open fun alarmRule(`value`: AlarmRuleProperty.Builder.() -> Unit): Unit =
      alarmRule(AlarmRuleProperty(`value`))

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

  public open fun severity(): Number? = unwrap(this).getSeverity()

  public open fun severity(`value`: Number) {
    unwrap(this).setSeverity(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun alarmCapabilities(alarmCapabilities: IResolvable) {
    }

    public fun alarmCapabilities(alarmCapabilities: AlarmCapabilitiesProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28dade2c5a535f2b0837588b6fcb591e268f5ef44dfc6e23313751c738c75d71")
    public fun alarmCapabilities(alarmCapabilities: AlarmCapabilitiesProperty.Builder.() -> Unit) {
    }

    public fun alarmEventActions(alarmEventActions: IResolvable) {
    }

    public fun alarmEventActions(alarmEventActions: AlarmEventActionsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f17992d3d7cb1606f8e1af18815b53e1fff29da3e14a0eae4875754ca4b305b")
    public fun alarmEventActions(alarmEventActions: AlarmEventActionsProperty.Builder.() -> Unit) {
    }

    public fun alarmModelDescription(alarmModelDescription: String) {
    }

    public fun alarmModelName(alarmModelName: String) {
    }

    public fun alarmRule(alarmRule: IResolvable) {
    }

    public fun alarmRule(alarmRule: AlarmRuleProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a85073d3ac9e10ee8e6551c1e38e91853eed1bf9fe7f23c79712d0296a202c71")
    public fun alarmRule(alarmRule: AlarmRuleProperty.Builder.() -> Unit) {
    }

    public fun key(key: String) {
    }

    public fun roleArn(roleArn: String) {
    }

    public fun severity(severity: Number) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotevents.CfnAlarmModel.Builder =
        software.amazon.awscdk.services.iotevents.CfnAlarmModel.Builder.create(scope, id)

    public override fun alarmCapabilities(alarmCapabilities: IResolvable) {
      cdkBuilder.alarmCapabilities(alarmCapabilities.let(IResolvable::unwrap))
    }

    public override fun alarmCapabilities(alarmCapabilities: AlarmCapabilitiesProperty) {
      cdkBuilder.alarmCapabilities(alarmCapabilities.let(AlarmCapabilitiesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28dade2c5a535f2b0837588b6fcb591e268f5ef44dfc6e23313751c738c75d71")
    public override
        fun alarmCapabilities(alarmCapabilities: AlarmCapabilitiesProperty.Builder.() -> Unit): Unit
        = alarmCapabilities(AlarmCapabilitiesProperty(alarmCapabilities))

    public override fun alarmEventActions(alarmEventActions: IResolvable) {
      cdkBuilder.alarmEventActions(alarmEventActions.let(IResolvable::unwrap))
    }

    public override fun alarmEventActions(alarmEventActions: AlarmEventActionsProperty) {
      cdkBuilder.alarmEventActions(alarmEventActions.let(AlarmEventActionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f17992d3d7cb1606f8e1af18815b53e1fff29da3e14a0eae4875754ca4b305b")
    public override
        fun alarmEventActions(alarmEventActions: AlarmEventActionsProperty.Builder.() -> Unit): Unit
        = alarmEventActions(AlarmEventActionsProperty(alarmEventActions))

    public override fun alarmModelDescription(alarmModelDescription: String) {
      cdkBuilder.alarmModelDescription(alarmModelDescription)
    }

    public override fun alarmModelName(alarmModelName: String) {
      cdkBuilder.alarmModelName(alarmModelName)
    }

    public override fun alarmRule(alarmRule: IResolvable) {
      cdkBuilder.alarmRule(alarmRule.let(IResolvable::unwrap))
    }

    public override fun alarmRule(alarmRule: AlarmRuleProperty) {
      cdkBuilder.alarmRule(alarmRule.let(AlarmRuleProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a85073d3ac9e10ee8e6551c1e38e91853eed1bf9fe7f23c79712d0296a202c71")
    public override fun alarmRule(alarmRule: AlarmRuleProperty.Builder.() -> Unit): Unit =
        alarmRule(AlarmRuleProperty(alarmRule))

    public override fun key(key: String) {
      cdkBuilder.key(key)
    }

    public override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public override fun severity(severity: Number) {
      cdkBuilder.severity(severity)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iotevents.CfnAlarmModel = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAlarmModel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAlarmModel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel):
        CfnAlarmModel = CfnAlarmModel(cdkObject)

    internal fun unwrap(wrapped: CfnAlarmModel):
        software.amazon.awscdk.services.iotevents.CfnAlarmModel = wrapped.cdkObject
  }

  public interface IotTopicPublishProperty {
    public fun mqttTopic(): String

    public fun payload(): Any? = unwrap(this).getPayload()

    public interface Builder {
      public fun mqttTopic(mqttTopic: String) {
      }

      public fun payload(payload: IResolvable) {
      }

      public fun payload(payload: PayloadProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("09a8a1ff7169e3c1479b8bc646cacc37c60f2b4669f76f34a144bc80ce570150")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotTopicPublishProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotTopicPublishProperty.builder()

      public override fun mqttTopic(mqttTopic: String) {
        cdkBuilder.mqttTopic(mqttTopic)
      }

      public override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      public override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("09a8a1ff7169e3c1479b8bc646cacc37c60f2b4669f76f34a144bc80ce570150")
      public override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotTopicPublishProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotTopicPublishProperty,
    ) : IotTopicPublishProperty {
      public override fun mqttTopic(): String = unwrap(this).getMqttTopic()

      public override fun payload(): Any? = unwrap(this).getPayload()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IotTopicPublishProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotTopicPublishProperty):
          IotTopicPublishProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IotTopicPublishProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotTopicPublishProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface AssetPropertyVariantProperty {
    public fun booleanValue(): String? = unwrap(this).getBooleanValue()

    public fun doubleValue(): String? = unwrap(this).getDoubleValue()

    public fun integerValue(): String? = unwrap(this).getIntegerValue()

    public fun stringValue(): String? = unwrap(this).getStringValue()

    public interface Builder {
      public fun booleanValue(booleanValue: String) {
      }

      public fun doubleValue(doubleValue: String) {
      }

      public fun integerValue(integerValue: String) {
      }

      public fun stringValue(stringValue: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyVariantProperty.Builder
          =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyVariantProperty.builder()

      public override fun booleanValue(booleanValue: String) {
        cdkBuilder.booleanValue(booleanValue)
      }

      public override fun doubleValue(doubleValue: String) {
        cdkBuilder.doubleValue(doubleValue)
      }

      public override fun integerValue(integerValue: String) {
        cdkBuilder.integerValue(integerValue)
      }

      public override fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
      }

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyVariantProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyVariantProperty,
    ) : AssetPropertyVariantProperty {
      public override fun booleanValue(): String? = unwrap(this).getBooleanValue()

      public override fun doubleValue(): String? = unwrap(this).getDoubleValue()

      public override fun integerValue(): String? = unwrap(this).getIntegerValue()

      public override fun stringValue(): String? = unwrap(this).getStringValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AssetPropertyVariantProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyVariantProperty):
          AssetPropertyVariantProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssetPropertyVariantProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyVariantProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SimpleRuleProperty {
    public fun comparisonOperator(): String

    public fun inputProperty(): String

    public fun threshold(): String

    public interface Builder {
      public fun comparisonOperator(comparisonOperator: String) {
      }

      public fun inputProperty(inputProperty: String) {
      }

      public fun threshold(threshold: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.SimpleRuleProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.SimpleRuleProperty.builder()

      public override fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
      }

      public override fun inputProperty(inputProperty: String) {
        cdkBuilder.inputProperty(inputProperty)
      }

      public override fun threshold(threshold: String) {
        cdkBuilder.threshold(threshold)
      }

      public fun build(): software.amazon.awscdk.services.iotevents.CfnAlarmModel.SimpleRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.SimpleRuleProperty,
    ) : SimpleRuleProperty {
      public override fun comparisonOperator(): String = unwrap(this).getComparisonOperator()

      public override fun inputProperty(): String = unwrap(this).getInputProperty()

      public override fun threshold(): String = unwrap(this).getThreshold()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SimpleRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.SimpleRuleProperty):
          SimpleRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SimpleRuleProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.SimpleRuleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AlarmRuleProperty {
    public fun simpleRule(): Any? = unwrap(this).getSimpleRule()

    public interface Builder {
      public fun simpleRule(simpleRule: IResolvable) {
      }

      public fun simpleRule(simpleRule: SimpleRuleProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("de36c93fe2de0a3000fae2c93cec62a0f5c9cb2fae0ba5c11ce2486fcbfa1b37")
      public fun simpleRule(simpleRule: SimpleRuleProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmRuleProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmRuleProperty.builder()

      public override fun simpleRule(simpleRule: IResolvable) {
        cdkBuilder.simpleRule(simpleRule.let(IResolvable::unwrap))
      }

      public override fun simpleRule(simpleRule: SimpleRuleProperty) {
        cdkBuilder.simpleRule(simpleRule.let(SimpleRuleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("de36c93fe2de0a3000fae2c93cec62a0f5c9cb2fae0ba5c11ce2486fcbfa1b37")
      public override fun simpleRule(simpleRule: SimpleRuleProperty.Builder.() -> Unit): Unit =
          simpleRule(SimpleRuleProperty(simpleRule))

      public fun build(): software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmRuleProperty,
    ) : AlarmRuleProperty {
      public override fun simpleRule(): Any? = unwrap(this).getSimpleRule()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AlarmRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmRuleProperty):
          AlarmRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AlarmRuleProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmRuleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PayloadProperty {
    public fun contentExpression(): String

    public fun type(): String

    public interface Builder {
      public fun contentExpression(contentExpression: String) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.PayloadProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.PayloadProperty.builder()

      public override fun contentExpression(contentExpression: String) {
        cdkBuilder.contentExpression(contentExpression)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.iotevents.CfnAlarmModel.PayloadProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.PayloadProperty,
    ) : PayloadProperty {
      public override fun contentExpression(): String = unwrap(this).getContentExpression()

      public override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PayloadProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.PayloadProperty):
          PayloadProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PayloadProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.PayloadProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface IotEventsProperty {
    public fun inputName(): String

    public fun payload(): Any? = unwrap(this).getPayload()

    public interface Builder {
      public fun inputName(inputName: String) {
      }

      public fun payload(payload: IResolvable) {
      }

      public fun payload(payload: PayloadProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a906aff9bfed17a9996ebc2534cfc0b5419c3478d888ba8ae7d86b4fa20e339e")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotEventsProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotEventsProperty.builder()

      public override fun inputName(inputName: String) {
        cdkBuilder.inputName(inputName)
      }

      public override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      public override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a906aff9bfed17a9996ebc2534cfc0b5419c3478d888ba8ae7d86b4fa20e339e")
      public override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      public fun build(): software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotEventsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotEventsProperty,
    ) : IotEventsProperty {
      public override fun inputName(): String = unwrap(this).getInputName()

      public override fun payload(): Any? = unwrap(this).getPayload()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IotEventsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotEventsProperty):
          IotEventsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IotEventsProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotEventsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DynamoDBv2Property {
    public fun payload(): Any? = unwrap(this).getPayload()

    public fun tableName(): String

    public interface Builder {
      public fun payload(payload: IResolvable) {
      }

      public fun payload(payload: PayloadProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("189d1432ed7e21cc4c695b6568e65a4972db7a288296442c88e3c0403a7a8a0d")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit) {
      }

      public fun tableName(tableName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.DynamoDBv2Property.Builder =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.DynamoDBv2Property.builder()

      public override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      public override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("189d1432ed7e21cc4c695b6568e65a4972db7a288296442c88e3c0403a7a8a0d")
      public override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      public override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build(): software.amazon.awscdk.services.iotevents.CfnAlarmModel.DynamoDBv2Property
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.DynamoDBv2Property,
    ) : DynamoDBv2Property {
      public override fun payload(): Any? = unwrap(this).getPayload()

      public override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DynamoDBv2Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.DynamoDBv2Property):
          DynamoDBv2Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynamoDBv2Property):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.DynamoDBv2Property = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SqsProperty {
    public fun payload(): Any? = unwrap(this).getPayload()

    public fun queueUrl(): String

    public fun useBase64(): Any? = unwrap(this).getUseBase64()

    public interface Builder {
      public fun payload(payload: IResolvable) {
      }

      public fun payload(payload: PayloadProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb380390b28918407d9c43bca759f2f834e6b8173ee883656d7c1864bdf6bbd1")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit) {
      }

      public fun queueUrl(queueUrl: String) {
      }

      public fun useBase64(useBase64: Boolean) {
      }

      public fun useBase64(useBase64: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.SqsProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.SqsProperty.builder()

      public override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      public override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb380390b28918407d9c43bca759f2f834e6b8173ee883656d7c1864bdf6bbd1")
      public override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      public override fun queueUrl(queueUrl: String) {
        cdkBuilder.queueUrl(queueUrl)
      }

      public override fun useBase64(useBase64: Boolean) {
        cdkBuilder.useBase64(useBase64)
      }

      public override fun useBase64(useBase64: IResolvable) {
        cdkBuilder.useBase64(useBase64.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.iotevents.CfnAlarmModel.SqsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.SqsProperty,
    ) : SqsProperty {
      public override fun payload(): Any? = unwrap(this).getPayload()

      public override fun queueUrl(): String = unwrap(this).getQueueUrl()

      public override fun useBase64(): Any? = unwrap(this).getUseBase64()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SqsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.SqsProperty):
          SqsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SqsProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.SqsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AlarmActionProperty {
    public fun dynamoDBv2(): Any? = unwrap(this).getDynamoDBv2()

    public fun dynamoDb(): Any? = unwrap(this).getDynamoDb()

    public fun firehose(): Any? = unwrap(this).getFirehose()

    public fun iotEvents(): Any? = unwrap(this).getIotEvents()

    public fun iotSiteWise(): Any? = unwrap(this).getIotSiteWise()

    public fun iotTopicPublish(): Any? = unwrap(this).getIotTopicPublish()

    public fun lambda(): Any? = unwrap(this).getLambda()

    public fun sns(): Any? = unwrap(this).getSns()

    public fun sqs(): Any? = unwrap(this).getSqs()

    public interface Builder {
      public fun dynamoDBv2(dynamoDBv2: IResolvable) {
      }

      public fun dynamoDBv2(dynamoDBv2: DynamoDBv2Property) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6d188816317dc2bba3407a999b47df7b7d18f6dde1f044d746d59ad2929c6146")
      public fun dynamoDBv2(dynamoDBv2: DynamoDBv2Property.Builder.() -> Unit) {
      }

      public fun dynamoDb(dynamoDb: IResolvable) {
      }

      public fun dynamoDb(dynamoDb: DynamoDBProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e78f99f854660adca9866689f88c4f478977630c74e0778ebd321dd8c61e61c")
      public fun dynamoDb(dynamoDb: DynamoDBProperty.Builder.() -> Unit) {
      }

      public fun firehose(firehose: IResolvable) {
      }

      public fun firehose(firehose: FirehoseProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("829773b971a8bf944d36ee1bf480aea8bb67d937013f1cd4dea2a3dfbdbff12f")
      public fun firehose(firehose: FirehoseProperty.Builder.() -> Unit) {
      }

      public fun iotEvents(iotEvents: IResolvable) {
      }

      public fun iotEvents(iotEvents: IotEventsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("58f8a68f00e5e88e84857886e566e33911847d03ca8a5b44d8b4b1a51775dcee")
      public fun iotEvents(iotEvents: IotEventsProperty.Builder.() -> Unit) {
      }

      public fun iotSiteWise(iotSiteWise: IResolvable) {
      }

      public fun iotSiteWise(iotSiteWise: IotSiteWiseProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eba33acab845cb824153697c8ded76a604d7c7941288e5b9027205162ae7beb7")
      public fun iotSiteWise(iotSiteWise: IotSiteWiseProperty.Builder.() -> Unit) {
      }

      public fun iotTopicPublish(iotTopicPublish: IResolvable) {
      }

      public fun iotTopicPublish(iotTopicPublish: IotTopicPublishProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eb9bf5bd4cedcb9d89548b63ccbc6a98e99671d994e3f06088431680b1f6b965")
      public fun iotTopicPublish(iotTopicPublish: IotTopicPublishProperty.Builder.() -> Unit) {
      }

      public fun lambda(lambda: IResolvable) {
      }

      public fun lambda(lambda: LambdaProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5adf283344549e7ebcdbcbaf5dd26d7b6562feae7110819f076a607e873162bd")
      public fun lambda(lambda: LambdaProperty.Builder.() -> Unit) {
      }

      public fun sns(sns: IResolvable) {
      }

      public fun sns(sns: SnsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8f522bb88cc761157565415502439d4395c223e6c9654cf0f6ada3c919fdf97e")
      public fun sns(sns: SnsProperty.Builder.() -> Unit) {
      }

      public fun sqs(sqs: IResolvable) {
      }

      public fun sqs(sqs: SqsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95c0b3dab9e6522270f5f8c293f53035c523144c63e76e6cad208a6f093220bd")
      public fun sqs(sqs: SqsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmActionProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmActionProperty.builder()

      public override fun dynamoDBv2(dynamoDBv2: IResolvable) {
        cdkBuilder.dynamoDBv2(dynamoDBv2.let(IResolvable::unwrap))
      }

      public override fun dynamoDBv2(dynamoDBv2: DynamoDBv2Property) {
        cdkBuilder.dynamoDBv2(dynamoDBv2.let(DynamoDBv2Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6d188816317dc2bba3407a999b47df7b7d18f6dde1f044d746d59ad2929c6146")
      public override fun dynamoDBv2(dynamoDBv2: DynamoDBv2Property.Builder.() -> Unit): Unit =
          dynamoDBv2(DynamoDBv2Property(dynamoDBv2))

      public override fun dynamoDb(dynamoDb: IResolvable) {
        cdkBuilder.dynamoDb(dynamoDb.let(IResolvable::unwrap))
      }

      public override fun dynamoDb(dynamoDb: DynamoDBProperty) {
        cdkBuilder.dynamoDb(dynamoDb.let(DynamoDBProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e78f99f854660adca9866689f88c4f478977630c74e0778ebd321dd8c61e61c")
      public override fun dynamoDb(dynamoDb: DynamoDBProperty.Builder.() -> Unit): Unit =
          dynamoDb(DynamoDBProperty(dynamoDb))

      public override fun firehose(firehose: IResolvable) {
        cdkBuilder.firehose(firehose.let(IResolvable::unwrap))
      }

      public override fun firehose(firehose: FirehoseProperty) {
        cdkBuilder.firehose(firehose.let(FirehoseProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("829773b971a8bf944d36ee1bf480aea8bb67d937013f1cd4dea2a3dfbdbff12f")
      public override fun firehose(firehose: FirehoseProperty.Builder.() -> Unit): Unit =
          firehose(FirehoseProperty(firehose))

      public override fun iotEvents(iotEvents: IResolvable) {
        cdkBuilder.iotEvents(iotEvents.let(IResolvable::unwrap))
      }

      public override fun iotEvents(iotEvents: IotEventsProperty) {
        cdkBuilder.iotEvents(iotEvents.let(IotEventsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("58f8a68f00e5e88e84857886e566e33911847d03ca8a5b44d8b4b1a51775dcee")
      public override fun iotEvents(iotEvents: IotEventsProperty.Builder.() -> Unit): Unit =
          iotEvents(IotEventsProperty(iotEvents))

      public override fun iotSiteWise(iotSiteWise: IResolvable) {
        cdkBuilder.iotSiteWise(iotSiteWise.let(IResolvable::unwrap))
      }

      public override fun iotSiteWise(iotSiteWise: IotSiteWiseProperty) {
        cdkBuilder.iotSiteWise(iotSiteWise.let(IotSiteWiseProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eba33acab845cb824153697c8ded76a604d7c7941288e5b9027205162ae7beb7")
      public override fun iotSiteWise(iotSiteWise: IotSiteWiseProperty.Builder.() -> Unit): Unit =
          iotSiteWise(IotSiteWiseProperty(iotSiteWise))

      public override fun iotTopicPublish(iotTopicPublish: IResolvable) {
        cdkBuilder.iotTopicPublish(iotTopicPublish.let(IResolvable::unwrap))
      }

      public override fun iotTopicPublish(iotTopicPublish: IotTopicPublishProperty) {
        cdkBuilder.iotTopicPublish(iotTopicPublish.let(IotTopicPublishProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eb9bf5bd4cedcb9d89548b63ccbc6a98e99671d994e3f06088431680b1f6b965")
      public override
          fun iotTopicPublish(iotTopicPublish: IotTopicPublishProperty.Builder.() -> Unit): Unit =
          iotTopicPublish(IotTopicPublishProperty(iotTopicPublish))

      public override fun lambda(lambda: IResolvable) {
        cdkBuilder.lambda(lambda.let(IResolvable::unwrap))
      }

      public override fun lambda(lambda: LambdaProperty) {
        cdkBuilder.lambda(lambda.let(LambdaProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5adf283344549e7ebcdbcbaf5dd26d7b6562feae7110819f076a607e873162bd")
      public override fun lambda(lambda: LambdaProperty.Builder.() -> Unit): Unit =
          lambda(LambdaProperty(lambda))

      public override fun sns(sns: IResolvable) {
        cdkBuilder.sns(sns.let(IResolvable::unwrap))
      }

      public override fun sns(sns: SnsProperty) {
        cdkBuilder.sns(sns.let(SnsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8f522bb88cc761157565415502439d4395c223e6c9654cf0f6ada3c919fdf97e")
      public override fun sns(sns: SnsProperty.Builder.() -> Unit): Unit = sns(SnsProperty(sns))

      public override fun sqs(sqs: IResolvable) {
        cdkBuilder.sqs(sqs.let(IResolvable::unwrap))
      }

      public override fun sqs(sqs: SqsProperty) {
        cdkBuilder.sqs(sqs.let(SqsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95c0b3dab9e6522270f5f8c293f53035c523144c63e76e6cad208a6f093220bd")
      public override fun sqs(sqs: SqsProperty.Builder.() -> Unit): Unit = sqs(SqsProperty(sqs))

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmActionProperty,
    ) : AlarmActionProperty {
      public override fun dynamoDBv2(): Any? = unwrap(this).getDynamoDBv2()

      public override fun dynamoDb(): Any? = unwrap(this).getDynamoDb()

      public override fun firehose(): Any? = unwrap(this).getFirehose()

      public override fun iotEvents(): Any? = unwrap(this).getIotEvents()

      public override fun iotSiteWise(): Any? = unwrap(this).getIotSiteWise()

      public override fun iotTopicPublish(): Any? = unwrap(this).getIotTopicPublish()

      public override fun lambda(): Any? = unwrap(this).getLambda()

      public override fun sns(): Any? = unwrap(this).getSns()

      public override fun sqs(): Any? = unwrap(this).getSqs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AlarmActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmActionProperty):
          AlarmActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AlarmActionProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface IotSiteWiseProperty {
    public fun assetId(): String? = unwrap(this).getAssetId()

    public fun entryId(): String? = unwrap(this).getEntryId()

    public fun propertyAlias(): String? = unwrap(this).getPropertyAlias()

    public fun propertyId(): String? = unwrap(this).getPropertyId()

    public fun propertyValue(): Any? = unwrap(this).getPropertyValue()

    public interface Builder {
      public fun assetId(assetId: String) {
      }

      public fun entryId(entryId: String) {
      }

      public fun propertyAlias(propertyAlias: String) {
      }

      public fun propertyId(propertyId: String) {
      }

      public fun propertyValue(propertyValue: IResolvable) {
      }

      public fun propertyValue(propertyValue: AssetPropertyValueProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("47b0e44681950e9c0630a17a035b5170e8152a7dfefc8df1c97b2699e6f33d06")
      public fun propertyValue(propertyValue: AssetPropertyValueProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotSiteWiseProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotSiteWiseProperty.builder()

      public override fun assetId(assetId: String) {
        cdkBuilder.assetId(assetId)
      }

      public override fun entryId(entryId: String) {
        cdkBuilder.entryId(entryId)
      }

      public override fun propertyAlias(propertyAlias: String) {
        cdkBuilder.propertyAlias(propertyAlias)
      }

      public override fun propertyId(propertyId: String) {
        cdkBuilder.propertyId(propertyId)
      }

      public override fun propertyValue(propertyValue: IResolvable) {
        cdkBuilder.propertyValue(propertyValue.let(IResolvable::unwrap))
      }

      public override fun propertyValue(propertyValue: AssetPropertyValueProperty) {
        cdkBuilder.propertyValue(propertyValue.let(AssetPropertyValueProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("47b0e44681950e9c0630a17a035b5170e8152a7dfefc8df1c97b2699e6f33d06")
      public override
          fun propertyValue(propertyValue: AssetPropertyValueProperty.Builder.() -> Unit): Unit =
          propertyValue(AssetPropertyValueProperty(propertyValue))

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotSiteWiseProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotSiteWiseProperty,
    ) : IotSiteWiseProperty {
      public override fun assetId(): String? = unwrap(this).getAssetId()

      public override fun entryId(): String? = unwrap(this).getEntryId()

      public override fun propertyAlias(): String? = unwrap(this).getPropertyAlias()

      public override fun propertyId(): String? = unwrap(this).getPropertyId()

      public override fun propertyValue(): Any? = unwrap(this).getPropertyValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IotSiteWiseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotSiteWiseProperty):
          IotSiteWiseProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IotSiteWiseProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotSiteWiseProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LambdaProperty {
    public fun functionArn(): String

    public fun payload(): Any? = unwrap(this).getPayload()

    public interface Builder {
      public fun functionArn(functionArn: String) {
      }

      public fun payload(payload: IResolvable) {
      }

      public fun payload(payload: PayloadProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0aafc5896db3657ca3d677b4554976515fdf55eb8a17a120f94b3de437abf2a7")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.LambdaProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.LambdaProperty.builder()

      public override fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
      }

      public override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      public override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0aafc5896db3657ca3d677b4554976515fdf55eb8a17a120f94b3de437abf2a7")
      public override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      public fun build(): software.amazon.awscdk.services.iotevents.CfnAlarmModel.LambdaProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.LambdaProperty,
    ) : LambdaProperty {
      public override fun functionArn(): String = unwrap(this).getFunctionArn()

      public override fun payload(): Any? = unwrap(this).getPayload()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.LambdaProperty):
          LambdaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.LambdaProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AssetPropertyTimestampProperty {
    public fun offsetInNanos(): String? = unwrap(this).getOffsetInNanos()

    public fun timeInSeconds(): String

    public interface Builder {
      public fun offsetInNanos(offsetInNanos: String) {
      }

      public fun timeInSeconds(timeInSeconds: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyTimestampProperty.Builder
          =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyTimestampProperty.builder()

      public override fun offsetInNanos(offsetInNanos: String) {
        cdkBuilder.offsetInNanos(offsetInNanos)
      }

      public override fun timeInSeconds(timeInSeconds: String) {
        cdkBuilder.timeInSeconds(timeInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyTimestampProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyTimestampProperty,
    ) : AssetPropertyTimestampProperty {
      public override fun offsetInNanos(): String? = unwrap(this).getOffsetInNanos()

      public override fun timeInSeconds(): String = unwrap(this).getTimeInSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AssetPropertyTimestampProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyTimestampProperty):
          AssetPropertyTimestampProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssetPropertyTimestampProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyTimestampProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AlarmEventActionsProperty {
    public fun alarmActions(): Any? = unwrap(this).getAlarmActions()

    public interface Builder {
      public fun alarmActions(alarmActions: IResolvable) {
      }

      public fun alarmActions(alarmActions: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmEventActionsProperty.Builder
          =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmEventActionsProperty.builder()

      public override fun alarmActions(alarmActions: IResolvable) {
        cdkBuilder.alarmActions(alarmActions.let(IResolvable::unwrap))
      }

      public override fun alarmActions(alarmActions: List<Any>) {
        cdkBuilder.alarmActions(alarmActions)
      }

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmEventActionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmEventActionsProperty,
    ) : AlarmEventActionsProperty {
      public override fun alarmActions(): Any? = unwrap(this).getAlarmActions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AlarmEventActionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmEventActionsProperty):
          AlarmEventActionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AlarmEventActionsProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmEventActionsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AssetPropertyValueProperty {
    public fun quality(): String? = unwrap(this).getQuality()

    public fun timestamp(): Any? = unwrap(this).getTimestamp()

    public fun `value`(): Any

    public interface Builder {
      public fun quality(quality: String) {
      }

      public fun timestamp(timestamp: IResolvable) {
      }

      public fun timestamp(timestamp: AssetPropertyTimestampProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("df2f5e64893fb161017d38a6e681afa0e6e7cfc70be3ce67ecee2b116fc52626")
      public fun timestamp(timestamp: AssetPropertyTimestampProperty.Builder.() -> Unit) {
      }

      public fun `value`(`value`: IResolvable) {
      }

      public fun `value`(`value`: AssetPropertyVariantProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cbea76610d5420e612fb890cc7ec42e476b80403773daff5c2473bc525c98c77")
      public fun `value`(`value`: AssetPropertyVariantProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyValueProperty.Builder
          =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyValueProperty.builder()

      public override fun quality(quality: String) {
        cdkBuilder.quality(quality)
      }

      public override fun timestamp(timestamp: IResolvable) {
        cdkBuilder.timestamp(timestamp.let(IResolvable::unwrap))
      }

      public override fun timestamp(timestamp: AssetPropertyTimestampProperty) {
        cdkBuilder.timestamp(timestamp.let(AssetPropertyTimestampProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("df2f5e64893fb161017d38a6e681afa0e6e7cfc70be3ce67ecee2b116fc52626")
      public override fun timestamp(timestamp: AssetPropertyTimestampProperty.Builder.() -> Unit):
          Unit = timestamp(AssetPropertyTimestampProperty(timestamp))

      public override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable::unwrap))
      }

      public override fun `value`(`value`: AssetPropertyVariantProperty) {
        cdkBuilder.`value`(`value`.let(AssetPropertyVariantProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cbea76610d5420e612fb890cc7ec42e476b80403773daff5c2473bc525c98c77")
      public override fun `value`(`value`: AssetPropertyVariantProperty.Builder.() -> Unit): Unit =
          `value`(AssetPropertyVariantProperty(`value`))

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyValueProperty,
    ) : AssetPropertyValueProperty {
      public override fun quality(): String? = unwrap(this).getQuality()

      public override fun timestamp(): Any? = unwrap(this).getTimestamp()

      public override fun `value`(): Any = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AssetPropertyValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyValueProperty):
          AssetPropertyValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssetPropertyValueProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyValueProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SnsProperty {
    public fun payload(): Any? = unwrap(this).getPayload()

    public fun targetArn(): String

    public interface Builder {
      public fun payload(payload: IResolvable) {
      }

      public fun payload(payload: PayloadProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6c028e5e6ef49dc9a532dccd28461e6ca6ef718968ffaf554d5be8a0f10580c9")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit) {
      }

      public fun targetArn(targetArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.SnsProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.SnsProperty.builder()

      public override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      public override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6c028e5e6ef49dc9a532dccd28461e6ca6ef718968ffaf554d5be8a0f10580c9")
      public override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      public override fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
      }

      public fun build(): software.amazon.awscdk.services.iotevents.CfnAlarmModel.SnsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.SnsProperty,
    ) : SnsProperty {
      public override fun payload(): Any? = unwrap(this).getPayload()

      public override fun targetArn(): String = unwrap(this).getTargetArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SnsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.SnsProperty):
          SnsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnsProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.SnsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AlarmCapabilitiesProperty {
    public fun acknowledgeFlow(): Any? = unwrap(this).getAcknowledgeFlow()

    public fun initializationConfiguration(): Any? = unwrap(this).getInitializationConfiguration()

    public interface Builder {
      public fun acknowledgeFlow(acknowledgeFlow: IResolvable) {
      }

      public fun acknowledgeFlow(acknowledgeFlow: AcknowledgeFlowProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bab2c9254d6a985d303ef2f39b186823a487f99df2e54f3ab959b7587ec44bce")
      public fun acknowledgeFlow(acknowledgeFlow: AcknowledgeFlowProperty.Builder.() -> Unit) {
      }

      public fun initializationConfiguration(initializationConfiguration: IResolvable) {
      }

      public
          fun initializationConfiguration(initializationConfiguration: InitializationConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32cf13c41f3c306a15d07256aec14aee334d44e7a5bf38a6b3ea805ee7770777")
      public
          fun initializationConfiguration(initializationConfiguration: InitializationConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmCapabilitiesProperty.Builder
          =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmCapabilitiesProperty.builder()

      public override fun acknowledgeFlow(acknowledgeFlow: IResolvable) {
        cdkBuilder.acknowledgeFlow(acknowledgeFlow.let(IResolvable::unwrap))
      }

      public override fun acknowledgeFlow(acknowledgeFlow: AcknowledgeFlowProperty) {
        cdkBuilder.acknowledgeFlow(acknowledgeFlow.let(AcknowledgeFlowProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bab2c9254d6a985d303ef2f39b186823a487f99df2e54f3ab959b7587ec44bce")
      public override
          fun acknowledgeFlow(acknowledgeFlow: AcknowledgeFlowProperty.Builder.() -> Unit): Unit =
          acknowledgeFlow(AcknowledgeFlowProperty(acknowledgeFlow))

      public override fun initializationConfiguration(initializationConfiguration: IResolvable) {
        cdkBuilder.initializationConfiguration(initializationConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun initializationConfiguration(initializationConfiguration: InitializationConfigurationProperty) {
        cdkBuilder.initializationConfiguration(initializationConfiguration.let(InitializationConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32cf13c41f3c306a15d07256aec14aee334d44e7a5bf38a6b3ea805ee7770777")
      public override
          fun initializationConfiguration(initializationConfiguration: InitializationConfigurationProperty.Builder.() -> Unit):
          Unit =
          initializationConfiguration(InitializationConfigurationProperty(initializationConfiguration))

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmCapabilitiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmCapabilitiesProperty,
    ) : AlarmCapabilitiesProperty {
      public override fun acknowledgeFlow(): Any? = unwrap(this).getAcknowledgeFlow()

      public override fun initializationConfiguration(): Any? =
          unwrap(this).getInitializationConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AlarmCapabilitiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmCapabilitiesProperty):
          AlarmCapabilitiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AlarmCapabilitiesProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmCapabilitiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FirehoseProperty {
    public fun deliveryStreamName(): String

    public fun payload(): Any? = unwrap(this).getPayload()

    public fun separator(): String? = unwrap(this).getSeparator()

    public interface Builder {
      public fun deliveryStreamName(deliveryStreamName: String) {
      }

      public fun payload(payload: IResolvable) {
      }

      public fun payload(payload: PayloadProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d5ed37dd3ac41489ee6fcc52b73c04f615773e187f6fda0f36151c9939ed489a")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit) {
      }

      public fun separator(separator: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.FirehoseProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.FirehoseProperty.builder()

      public override fun deliveryStreamName(deliveryStreamName: String) {
        cdkBuilder.deliveryStreamName(deliveryStreamName)
      }

      public override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      public override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d5ed37dd3ac41489ee6fcc52b73c04f615773e187f6fda0f36151c9939ed489a")
      public override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      public override fun separator(separator: String) {
        cdkBuilder.separator(separator)
      }

      public fun build(): software.amazon.awscdk.services.iotevents.CfnAlarmModel.FirehoseProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.FirehoseProperty,
    ) : FirehoseProperty {
      public override fun deliveryStreamName(): String = unwrap(this).getDeliveryStreamName()

      public override fun payload(): Any? = unwrap(this).getPayload()

      public override fun separator(): String? = unwrap(this).getSeparator()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FirehoseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.FirehoseProperty):
          FirehoseProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FirehoseProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.FirehoseProperty = (wrapped as
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
      public fun hashKeyField(hashKeyField: String) {
      }

      public fun hashKeyType(hashKeyType: String) {
      }

      public fun hashKeyValue(hashKeyValue: String) {
      }

      public fun operation(operation: String) {
      }

      public fun payload(payload: IResolvable) {
      }

      public fun payload(payload: PayloadProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a2ae3d762e15b2b323f83870caa364b4b49f1c19071d1fc282fe8299e80f0bc")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit) {
      }

      public fun payloadField(payloadField: String) {
      }

      public fun rangeKeyField(rangeKeyField: String) {
      }

      public fun rangeKeyType(rangeKeyType: String) {
      }

      public fun rangeKeyValue(rangeKeyValue: String) {
      }

      public fun tableName(tableName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.DynamoDBProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.DynamoDBProperty.builder()

      public override fun hashKeyField(hashKeyField: String) {
        cdkBuilder.hashKeyField(hashKeyField)
      }

      public override fun hashKeyType(hashKeyType: String) {
        cdkBuilder.hashKeyType(hashKeyType)
      }

      public override fun hashKeyValue(hashKeyValue: String) {
        cdkBuilder.hashKeyValue(hashKeyValue)
      }

      public override fun operation(operation: String) {
        cdkBuilder.operation(operation)
      }

      public override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      public override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a2ae3d762e15b2b323f83870caa364b4b49f1c19071d1fc282fe8299e80f0bc")
      public override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      public override fun payloadField(payloadField: String) {
        cdkBuilder.payloadField(payloadField)
      }

      public override fun rangeKeyField(rangeKeyField: String) {
        cdkBuilder.rangeKeyField(rangeKeyField)
      }

      public override fun rangeKeyType(rangeKeyType: String) {
        cdkBuilder.rangeKeyType(rangeKeyType)
      }

      public override fun rangeKeyValue(rangeKeyValue: String) {
        cdkBuilder.rangeKeyValue(rangeKeyValue)
      }

      public override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build(): software.amazon.awscdk.services.iotevents.CfnAlarmModel.DynamoDBProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.DynamoDBProperty,
    ) : DynamoDBProperty {
      public override fun hashKeyField(): String = unwrap(this).getHashKeyField()

      public override fun hashKeyType(): String? = unwrap(this).getHashKeyType()

      public override fun hashKeyValue(): String = unwrap(this).getHashKeyValue()

      public override fun operation(): String? = unwrap(this).getOperation()

      public override fun payload(): Any? = unwrap(this).getPayload()

      public override fun payloadField(): String? = unwrap(this).getPayloadField()

      public override fun rangeKeyField(): String? = unwrap(this).getRangeKeyField()

      public override fun rangeKeyType(): String? = unwrap(this).getRangeKeyType()

      public override fun rangeKeyValue(): String? = unwrap(this).getRangeKeyValue()

      public override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DynamoDBProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.DynamoDBProperty):
          DynamoDBProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynamoDBProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.DynamoDBProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AcknowledgeFlowProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public interface Builder {
      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AcknowledgeFlowProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AcknowledgeFlowProperty.builder()

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AcknowledgeFlowProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AcknowledgeFlowProperty,
    ) : AcknowledgeFlowProperty {
      public override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AcknowledgeFlowProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.AcknowledgeFlowProperty):
          AcknowledgeFlowProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AcknowledgeFlowProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AcknowledgeFlowProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface InitializationConfigurationProperty {
    public fun disabledOnInitialization(): Any

    public interface Builder {
      public fun disabledOnInitialization(disabledOnInitialization: Boolean) {
      }

      public fun disabledOnInitialization(disabledOnInitialization: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.InitializationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.InitializationConfigurationProperty.builder()

      public override fun disabledOnInitialization(disabledOnInitialization: Boolean) {
        cdkBuilder.disabledOnInitialization(disabledOnInitialization)
      }

      public override fun disabledOnInitialization(disabledOnInitialization: IResolvable) {
        cdkBuilder.disabledOnInitialization(disabledOnInitialization.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.InitializationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.InitializationConfigurationProperty,
    ) : InitializationConfigurationProperty {
      public override fun disabledOnInitialization(): Any =
          unwrap(this).getDisabledOnInitialization()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          InitializationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.InitializationConfigurationProperty):
          InitializationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InitializationConfigurationProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.InitializationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
