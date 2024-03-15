@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnRuleProps {
  public fun actions(): Any

  public fun function(): String

  public fun instanceArn(): String

  public fun name(): String

  public fun publishStatus(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun triggerEventSource(): Any

  @CdkDslMarker
  public interface Builder {
    public fun actions(actions: IResolvable)

    public fun actions(actions: CfnRule.ActionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b6175cf3a99a320d27b1b42ac7669a7015347617a6f092dba6d431bb311da89")
    public fun actions(actions: CfnRule.ActionsProperty.Builder.() -> Unit)

    public fun function(function: String)

    public fun instanceArn(instanceArn: String)

    public fun name(name: String)

    public fun publishStatus(publishStatus: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun triggerEventSource(triggerEventSource: IResolvable)

    public fun triggerEventSource(triggerEventSource: CfnRule.RuleTriggerEventSourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f93c8c6589bfb365271079fc5c2138cc948c15f4d8346537f5ef7dd0d3d5b96")
    public
        fun triggerEventSource(triggerEventSource: CfnRule.RuleTriggerEventSourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnRuleProps.Builder =
        software.amazon.awscdk.services.connect.CfnRuleProps.builder()

    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable::unwrap))
    }

    override fun actions(actions: CfnRule.ActionsProperty) {
      cdkBuilder.actions(actions.let(CfnRule.ActionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b6175cf3a99a320d27b1b42ac7669a7015347617a6f092dba6d431bb311da89")
    override fun actions(actions: CfnRule.ActionsProperty.Builder.() -> Unit): Unit =
        actions(CfnRule.ActionsProperty(actions))

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

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun triggerEventSource(triggerEventSource: IResolvable) {
      cdkBuilder.triggerEventSource(triggerEventSource.let(IResolvable::unwrap))
    }

    override fun triggerEventSource(triggerEventSource: CfnRule.RuleTriggerEventSourceProperty) {
      cdkBuilder.triggerEventSource(triggerEventSource.let(CfnRule.RuleTriggerEventSourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f93c8c6589bfb365271079fc5c2138cc948c15f4d8346537f5ef7dd0d3d5b96")
    override
        fun triggerEventSource(triggerEventSource: CfnRule.RuleTriggerEventSourceProperty.Builder.() -> Unit):
        Unit = triggerEventSource(CfnRule.RuleTriggerEventSourceProperty(triggerEventSource))

    public fun build(): software.amazon.awscdk.services.connect.CfnRuleProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.connect.CfnRuleProps,
  ) : CdkObject(cdkObject), CfnRuleProps {
    override fun actions(): Any = unwrap(this).getActions()

    override fun function(): String = unwrap(this).getFunction()

    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    override fun name(): String = unwrap(this).getName()

    override fun publishStatus(): String = unwrap(this).getPublishStatus()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun triggerEventSource(): Any = unwrap(this).getTriggerEventSource()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRuleProps): CfnRuleProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRuleProps): software.amazon.awscdk.services.connect.CfnRuleProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnRuleProps
  }
}
