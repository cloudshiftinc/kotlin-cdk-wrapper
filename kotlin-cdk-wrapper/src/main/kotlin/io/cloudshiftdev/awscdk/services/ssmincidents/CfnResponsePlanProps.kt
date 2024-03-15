@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssmincidents

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnResponsePlanProps {
  public fun actions(): Any? = unwrap(this).getActions()

  public fun chatChannel(): Any? = unwrap(this).getChatChannel()

  public fun displayName(): String? = unwrap(this).getDisplayName()

  public fun engagements(): List<String> = unwrap(this).getEngagements() ?: emptyList()

  public fun incidentTemplate(): Any

  public fun integrations(): Any? = unwrap(this).getIntegrations()

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun actions(actions: IResolvable)

    public fun actions(actions: List<Any>)

    public fun actions(vararg actions: Any)

    public fun chatChannel(chatChannel: IResolvable)

    public fun chatChannel(chatChannel: CfnResponsePlan.ChatChannelProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43097ab621c7f3f9b4e2fec17b4f12692ff9cfe2bed21f3ca63a5c5d8cc11cee")
    public fun chatChannel(chatChannel: CfnResponsePlan.ChatChannelProperty.Builder.() -> Unit)

    public fun displayName(displayName: String)

    public fun engagements(engagements: List<String>)

    public fun engagements(vararg engagements: String)

    public fun incidentTemplate(incidentTemplate: IResolvable)

    public fun incidentTemplate(incidentTemplate: CfnResponsePlan.IncidentTemplateProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("006d39beeb2eb0a5d337c8bc23a7b7d3289c0923de7b058ff5469ce14bf743b4")
    public
        fun incidentTemplate(incidentTemplate: CfnResponsePlan.IncidentTemplateProperty.Builder.() -> Unit)

    public fun integrations(integrations: IResolvable)

    public fun integrations(integrations: List<Any>)

    public fun integrations(vararg integrations: Any)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ssmincidents.CfnResponsePlanProps.Builder =
        software.amazon.awscdk.services.ssmincidents.CfnResponsePlanProps.builder()

    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable::unwrap))
    }

    override fun actions(actions: List<Any>) {
      cdkBuilder.actions(actions)
    }

    override fun actions(vararg actions: Any): Unit = actions(actions.toList())

    override fun chatChannel(chatChannel: IResolvable) {
      cdkBuilder.chatChannel(chatChannel.let(IResolvable::unwrap))
    }

    override fun chatChannel(chatChannel: CfnResponsePlan.ChatChannelProperty) {
      cdkBuilder.chatChannel(chatChannel.let(CfnResponsePlan.ChatChannelProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43097ab621c7f3f9b4e2fec17b4f12692ff9cfe2bed21f3ca63a5c5d8cc11cee")
    override fun chatChannel(chatChannel: CfnResponsePlan.ChatChannelProperty.Builder.() -> Unit):
        Unit = chatChannel(CfnResponsePlan.ChatChannelProperty(chatChannel))

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun engagements(engagements: List<String>) {
      cdkBuilder.engagements(engagements)
    }

    override fun engagements(vararg engagements: String): Unit = engagements(engagements.toList())

    override fun incidentTemplate(incidentTemplate: IResolvable) {
      cdkBuilder.incidentTemplate(incidentTemplate.let(IResolvable::unwrap))
    }

    override fun incidentTemplate(incidentTemplate: CfnResponsePlan.IncidentTemplateProperty) {
      cdkBuilder.incidentTemplate(incidentTemplate.let(CfnResponsePlan.IncidentTemplateProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("006d39beeb2eb0a5d337c8bc23a7b7d3289c0923de7b058ff5469ce14bf743b4")
    override
        fun incidentTemplate(incidentTemplate: CfnResponsePlan.IncidentTemplateProperty.Builder.() -> Unit):
        Unit = incidentTemplate(CfnResponsePlan.IncidentTemplateProperty(incidentTemplate))

    override fun integrations(integrations: IResolvable) {
      cdkBuilder.integrations(integrations.let(IResolvable::unwrap))
    }

    override fun integrations(integrations: List<Any>) {
      cdkBuilder.integrations(integrations)
    }

    override fun integrations(vararg integrations: Any): Unit = integrations(integrations.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ssmincidents.CfnResponsePlanProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlanProps,
  ) : CdkObject(cdkObject), CfnResponsePlanProps {
    override fun actions(): Any? = unwrap(this).getActions()

    override fun chatChannel(): Any? = unwrap(this).getChatChannel()

    override fun displayName(): String? = unwrap(this).getDisplayName()

    override fun engagements(): List<String> = unwrap(this).getEngagements() ?: emptyList()

    override fun incidentTemplate(): Any = unwrap(this).getIncidentTemplate()

    override fun integrations(): Any? = unwrap(this).getIntegrations()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResponsePlanProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlanProps):
        CfnResponsePlanProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResponsePlanProps):
        software.amazon.awscdk.services.ssmincidents.CfnResponsePlanProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ssmincidents.CfnResponsePlanProps
  }
}
