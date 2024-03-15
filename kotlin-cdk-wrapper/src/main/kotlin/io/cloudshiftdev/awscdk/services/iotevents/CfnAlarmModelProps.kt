@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotevents

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnAlarmModelProps {
  public fun alarmCapabilities(): Any? = unwrap(this).getAlarmCapabilities()

  public fun alarmEventActions(): Any? = unwrap(this).getAlarmEventActions()

  public fun alarmModelDescription(): String? = unwrap(this).getAlarmModelDescription()

  public fun alarmModelName(): String? = unwrap(this).getAlarmModelName()

  public fun alarmRule(): Any

  public fun key(): String? = unwrap(this).getKey()

  public fun roleArn(): String

  public fun severity(): Number? = unwrap(this).getSeverity()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun alarmCapabilities(alarmCapabilities: IResolvable)

    public fun alarmCapabilities(alarmCapabilities: CfnAlarmModel.AlarmCapabilitiesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("56aea342eb20da55a80e25fdc85956e67957fd9332e9edcfa0e1e0a17c3b8324")
    public
        fun alarmCapabilities(alarmCapabilities: CfnAlarmModel.AlarmCapabilitiesProperty.Builder.() -> Unit)

    public fun alarmEventActions(alarmEventActions: IResolvable)

    public fun alarmEventActions(alarmEventActions: CfnAlarmModel.AlarmEventActionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d5d5bd0ff6ad73e9ab6cd080526153b60fe5fd74116a8d59378ba0dc9c6e39f4")
    public
        fun alarmEventActions(alarmEventActions: CfnAlarmModel.AlarmEventActionsProperty.Builder.() -> Unit)

    public fun alarmModelDescription(alarmModelDescription: String)

    public fun alarmModelName(alarmModelName: String)

    public fun alarmRule(alarmRule: IResolvable)

    public fun alarmRule(alarmRule: CfnAlarmModel.AlarmRuleProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5c90df443b113f28ec118813c4afbf018b9c672338d1fade8aa76dfc24ef5b6")
    public fun alarmRule(alarmRule: CfnAlarmModel.AlarmRuleProperty.Builder.() -> Unit)

    public fun key(key: String)

    public fun roleArn(roleArn: String)

    public fun severity(severity: Number)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotevents.CfnAlarmModelProps.Builder =
        software.amazon.awscdk.services.iotevents.CfnAlarmModelProps.builder()

    override fun alarmCapabilities(alarmCapabilities: IResolvable) {
      cdkBuilder.alarmCapabilities(alarmCapabilities.let(IResolvable::unwrap))
    }

    override fun alarmCapabilities(alarmCapabilities: CfnAlarmModel.AlarmCapabilitiesProperty) {
      cdkBuilder.alarmCapabilities(alarmCapabilities.let(CfnAlarmModel.AlarmCapabilitiesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("56aea342eb20da55a80e25fdc85956e67957fd9332e9edcfa0e1e0a17c3b8324")
    override
        fun alarmCapabilities(alarmCapabilities: CfnAlarmModel.AlarmCapabilitiesProperty.Builder.() -> Unit):
        Unit = alarmCapabilities(CfnAlarmModel.AlarmCapabilitiesProperty(alarmCapabilities))

    override fun alarmEventActions(alarmEventActions: IResolvable) {
      cdkBuilder.alarmEventActions(alarmEventActions.let(IResolvable::unwrap))
    }

    override fun alarmEventActions(alarmEventActions: CfnAlarmModel.AlarmEventActionsProperty) {
      cdkBuilder.alarmEventActions(alarmEventActions.let(CfnAlarmModel.AlarmEventActionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d5d5bd0ff6ad73e9ab6cd080526153b60fe5fd74116a8d59378ba0dc9c6e39f4")
    override
        fun alarmEventActions(alarmEventActions: CfnAlarmModel.AlarmEventActionsProperty.Builder.() -> Unit):
        Unit = alarmEventActions(CfnAlarmModel.AlarmEventActionsProperty(alarmEventActions))

    override fun alarmModelDescription(alarmModelDescription: String) {
      cdkBuilder.alarmModelDescription(alarmModelDescription)
    }

    override fun alarmModelName(alarmModelName: String) {
      cdkBuilder.alarmModelName(alarmModelName)
    }

    override fun alarmRule(alarmRule: IResolvable) {
      cdkBuilder.alarmRule(alarmRule.let(IResolvable::unwrap))
    }

    override fun alarmRule(alarmRule: CfnAlarmModel.AlarmRuleProperty) {
      cdkBuilder.alarmRule(alarmRule.let(CfnAlarmModel.AlarmRuleProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5c90df443b113f28ec118813c4afbf018b9c672338d1fade8aa76dfc24ef5b6")
    override fun alarmRule(alarmRule: CfnAlarmModel.AlarmRuleProperty.Builder.() -> Unit): Unit =
        alarmRule(CfnAlarmModel.AlarmRuleProperty(alarmRule))

    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun severity(severity: Number) {
      cdkBuilder.severity(severity)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotevents.CfnAlarmModelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModelProps,
  ) : CdkObject(cdkObject), CfnAlarmModelProps {
    override fun alarmCapabilities(): Any? = unwrap(this).getAlarmCapabilities()

    override fun alarmEventActions(): Any? = unwrap(this).getAlarmEventActions()

    override fun alarmModelDescription(): String? = unwrap(this).getAlarmModelDescription()

    override fun alarmModelName(): String? = unwrap(this).getAlarmModelName()

    override fun alarmRule(): Any = unwrap(this).getAlarmRule()

    override fun key(): String? = unwrap(this).getKey()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun severity(): Number? = unwrap(this).getSeverity()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAlarmModelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModelProps):
        CfnAlarmModelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAlarmModelProps):
        software.amazon.awscdk.services.iotevents.CfnAlarmModelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotevents.CfnAlarmModelProps
  }
}
