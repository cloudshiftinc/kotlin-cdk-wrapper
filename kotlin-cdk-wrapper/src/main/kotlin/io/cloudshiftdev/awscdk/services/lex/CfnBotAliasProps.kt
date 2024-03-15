@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lex

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnBotAliasProps {
  public fun botAliasLocaleSettings(): Any? = unwrap(this).getBotAliasLocaleSettings()

  public fun botAliasName(): String

  public fun botAliasTags(): Any? = unwrap(this).getBotAliasTags()

  public fun botId(): String

  public fun botVersion(): String? = unwrap(this).getBotVersion()

  public fun conversationLogSettings(): Any? = unwrap(this).getConversationLogSettings()

  public fun description(): String? = unwrap(this).getDescription()

  public fun sentimentAnalysisSettings(): Any? = unwrap(this).getSentimentAnalysisSettings()

  @CdkDslMarker
  public interface Builder {
    public fun botAliasLocaleSettings(botAliasLocaleSettings: IResolvable)

    public fun botAliasLocaleSettings(botAliasLocaleSettings: List<Any>)

    public fun botAliasLocaleSettings(vararg botAliasLocaleSettings: Any)

    public fun botAliasName(botAliasName: String)

    public fun botAliasTags(botAliasTags: IResolvable)

    public fun botAliasTags(botAliasTags: List<Any>)

    public fun botAliasTags(vararg botAliasTags: Any)

    public fun botId(botId: String)

    public fun botVersion(botVersion: String)

    public fun conversationLogSettings(conversationLogSettings: IResolvable)

    public
        fun conversationLogSettings(conversationLogSettings: CfnBotAlias.ConversationLogSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f13fc95d0fe171e8981ee1328f52109fb9a21b9feee318571942e65a5443efe")
    public
        fun conversationLogSettings(conversationLogSettings: CfnBotAlias.ConversationLogSettingsProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun sentimentAnalysisSettings(sentimentAnalysisSettings: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBotAliasProps.Builder =
        software.amazon.awscdk.services.lex.CfnBotAliasProps.builder()

    override fun botAliasLocaleSettings(botAliasLocaleSettings: IResolvable) {
      cdkBuilder.botAliasLocaleSettings(botAliasLocaleSettings.let(IResolvable::unwrap))
    }

    override fun botAliasLocaleSettings(botAliasLocaleSettings: List<Any>) {
      cdkBuilder.botAliasLocaleSettings(botAliasLocaleSettings)
    }

    override fun botAliasLocaleSettings(vararg botAliasLocaleSettings: Any): Unit =
        botAliasLocaleSettings(botAliasLocaleSettings.toList())

    override fun botAliasName(botAliasName: String) {
      cdkBuilder.botAliasName(botAliasName)
    }

    override fun botAliasTags(botAliasTags: IResolvable) {
      cdkBuilder.botAliasTags(botAliasTags.let(IResolvable::unwrap))
    }

    override fun botAliasTags(botAliasTags: List<Any>) {
      cdkBuilder.botAliasTags(botAliasTags)
    }

    override fun botAliasTags(vararg botAliasTags: Any): Unit = botAliasTags(botAliasTags.toList())

    override fun botId(botId: String) {
      cdkBuilder.botId(botId)
    }

    override fun botVersion(botVersion: String) {
      cdkBuilder.botVersion(botVersion)
    }

    override fun conversationLogSettings(conversationLogSettings: IResolvable) {
      cdkBuilder.conversationLogSettings(conversationLogSettings.let(IResolvable::unwrap))
    }

    override
        fun conversationLogSettings(conversationLogSettings: CfnBotAlias.ConversationLogSettingsProperty) {
      cdkBuilder.conversationLogSettings(conversationLogSettings.let(CfnBotAlias.ConversationLogSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f13fc95d0fe171e8981ee1328f52109fb9a21b9feee318571942e65a5443efe")
    override
        fun conversationLogSettings(conversationLogSettings: CfnBotAlias.ConversationLogSettingsProperty.Builder.() -> Unit):
        Unit =
        conversationLogSettings(CfnBotAlias.ConversationLogSettingsProperty(conversationLogSettings))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun sentimentAnalysisSettings(sentimentAnalysisSettings: Any) {
      cdkBuilder.sentimentAnalysisSettings(sentimentAnalysisSettings)
    }

    public fun build(): software.amazon.awscdk.services.lex.CfnBotAliasProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lex.CfnBotAliasProps,
  ) : CdkObject(cdkObject), CfnBotAliasProps {
    override fun botAliasLocaleSettings(): Any? = unwrap(this).getBotAliasLocaleSettings()

    override fun botAliasName(): String = unwrap(this).getBotAliasName()

    override fun botAliasTags(): Any? = unwrap(this).getBotAliasTags()

    override fun botId(): String = unwrap(this).getBotId()

    override fun botVersion(): String? = unwrap(this).getBotVersion()

    override fun conversationLogSettings(): Any? = unwrap(this).getConversationLogSettings()

    override fun description(): String? = unwrap(this).getDescription()

    override fun sentimentAnalysisSettings(): Any? = unwrap(this).getSentimentAnalysisSettings()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBotAliasProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotAliasProps):
        CfnBotAliasProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBotAliasProps):
        software.amazon.awscdk.services.lex.CfnBotAliasProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.lex.CfnBotAliasProps
  }
}
