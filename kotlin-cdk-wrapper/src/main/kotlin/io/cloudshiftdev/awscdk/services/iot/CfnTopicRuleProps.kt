@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnTopicRuleProps {
  public fun ruleName(): String? = unwrap(this).getRuleName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun topicRulePayload(): Any

  @CdkDslMarker
  public interface Builder {
    public fun ruleName(ruleName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun topicRulePayload(topicRulePayload: IResolvable)

    public fun topicRulePayload(topicRulePayload: CfnTopicRule.TopicRulePayloadProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71e77687a01c0ce01e94395df17c383b62abb102191d898cfb4e585d7acdad07")
    public
        fun topicRulePayload(topicRulePayload: CfnTopicRule.TopicRulePayloadProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnTopicRuleProps.Builder =
        software.amazon.awscdk.services.iot.CfnTopicRuleProps.builder()

    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun topicRulePayload(topicRulePayload: IResolvable) {
      cdkBuilder.topicRulePayload(topicRulePayload.let(IResolvable::unwrap))
    }

    override fun topicRulePayload(topicRulePayload: CfnTopicRule.TopicRulePayloadProperty) {
      cdkBuilder.topicRulePayload(topicRulePayload.let(CfnTopicRule.TopicRulePayloadProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71e77687a01c0ce01e94395df17c383b62abb102191d898cfb4e585d7acdad07")
    override
        fun topicRulePayload(topicRulePayload: CfnTopicRule.TopicRulePayloadProperty.Builder.() -> Unit):
        Unit = topicRulePayload(CfnTopicRule.TopicRulePayloadProperty(topicRulePayload))

    public fun build(): software.amazon.awscdk.services.iot.CfnTopicRuleProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRuleProps,
  ) : CdkObject(cdkObject), CfnTopicRuleProps {
    override fun ruleName(): String? = unwrap(this).getRuleName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun topicRulePayload(): Any = unwrap(this).getTopicRulePayload()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTopicRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRuleProps):
        CfnTopicRuleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTopicRuleProps):
        software.amazon.awscdk.services.iot.CfnTopicRuleProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.iot.CfnTopicRuleProps
  }
}
