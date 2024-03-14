package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnTopicRuleProps {
  /**
   * The name of the rule.
   *
   * *Pattern* : `[a-zA-Z0-9:_-]+`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-rulename)
   */
  public fun ruleName(): String? = unwrap(this).getRuleName()

  /**
   * Metadata which can be used to manage the topic rule.
   *
   *
   * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
   *
   * For the CLI command-line parameter use format: --tags "key1=value1&amp;key2=value2..."
   *
   * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The rule payload.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-topicrulepayload)
   */
  public fun topicRulePayload(): Any

  /**
   * A builder for [CfnTopicRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param ruleName The name of the rule.
     * *Pattern* : `[a-zA-Z0-9:_-]+`
     */
    public fun ruleName(ruleName: String)

    /**
     * @param tags Metadata which can be used to manage the topic rule.
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: --tags "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata which can be used to manage the topic rule.
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: --tags "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param topicRulePayload The rule payload. 
     */
    public fun topicRulePayload(topicRulePayload: IResolvable)

    /**
     * @param topicRulePayload The rule payload. 
     */
    public fun topicRulePayload(topicRulePayload: CfnTopicRule.TopicRulePayloadProperty)

    /**
     * @param topicRulePayload The rule payload. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71e77687a01c0ce01e94395df17c383b62abb102191d898cfb4e585d7acdad07")
    public
        fun topicRulePayload(topicRulePayload: CfnTopicRule.TopicRulePayloadProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnTopicRuleProps.Builder =
        software.amazon.awscdk.services.iot.CfnTopicRuleProps.builder()

    /**
     * @param ruleName The name of the rule.
     * *Pattern* : `[a-zA-Z0-9:_-]+`
     */
    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    /**
     * @param tags Metadata which can be used to manage the topic rule.
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: --tags "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Metadata which can be used to manage the topic rule.
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: --tags "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param topicRulePayload The rule payload. 
     */
    override fun topicRulePayload(topicRulePayload: IResolvable) {
      cdkBuilder.topicRulePayload(topicRulePayload.let(IResolvable::unwrap))
    }

    /**
     * @param topicRulePayload The rule payload. 
     */
    override fun topicRulePayload(topicRulePayload: CfnTopicRule.TopicRulePayloadProperty) {
      cdkBuilder.topicRulePayload(topicRulePayload.let(CfnTopicRule.TopicRulePayloadProperty::unwrap))
    }

    /**
     * @param topicRulePayload The rule payload. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71e77687a01c0ce01e94395df17c383b62abb102191d898cfb4e585d7acdad07")
    override
        fun topicRulePayload(topicRulePayload: CfnTopicRule.TopicRulePayloadProperty.Builder.() -> Unit):
        Unit = topicRulePayload(CfnTopicRule.TopicRulePayloadProperty(topicRulePayload))

    public fun build(): software.amazon.awscdk.services.iot.CfnTopicRuleProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRuleProps,
  ) : CdkObject(cdkObject), CfnTopicRuleProps {
    /**
     * The name of the rule.
     *
     * *Pattern* : `[a-zA-Z0-9:_-]+`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-rulename)
     */
    override fun ruleName(): String? = unwrap(this).getRuleName()

    /**
     * Metadata which can be used to manage the topic rule.
     *
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: --tags "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The rule payload.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-topicrulepayload)
     */
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
