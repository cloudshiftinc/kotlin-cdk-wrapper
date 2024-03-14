package io.cloudshiftdev.awscdk.services.lex

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnBotAlias internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lex.CfnBotAlias,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrBotAliasId(): String = unwrap(this).getAttrBotAliasId()

  public open fun attrBotAliasStatus(): String = unwrap(this).getAttrBotAliasStatus()

  public open fun botAliasLocaleSettings(): Any? = unwrap(this).getBotAliasLocaleSettings()

  public open fun botAliasLocaleSettings(`value`: IResolvable) {
    unwrap(this).setBotAliasLocaleSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun botAliasLocaleSettings(__idx_ac66f0: List<Any>) {
    unwrap(this).setBotAliasLocaleSettings(__idx_ac66f0)
  }

  public open fun botAliasName(): String = unwrap(this).getBotAliasName()

  public open fun botAliasName(`value`: String) {
    unwrap(this).setBotAliasName(`value`)
  }

  public open fun botAliasTags(): Any? = unwrap(this).getBotAliasTags()

  public open fun botAliasTags(`value`: IResolvable) {
    unwrap(this).setBotAliasTags(`value`.let(IResolvable::unwrap))
  }

  public open fun botAliasTags(__idx_ac66f0: List<Any>) {
    unwrap(this).setBotAliasTags(__idx_ac66f0)
  }

  public open fun botId(): String = unwrap(this).getBotId()

  public open fun botId(`value`: String) {
    unwrap(this).setBotId(`value`)
  }

  public open fun botVersion(): String? = unwrap(this).getBotVersion()

  public open fun botVersion(`value`: String) {
    unwrap(this).setBotVersion(`value`)
  }

  public open fun conversationLogSettings(): Any? = unwrap(this).getConversationLogSettings()

  public open fun conversationLogSettings(`value`: IResolvable) {
    unwrap(this).setConversationLogSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun conversationLogSettings(`value`: ConversationLogSettingsProperty) {
    unwrap(this).setConversationLogSettings(`value`.let(ConversationLogSettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("406eeb95044ee1072891c8cfe76b189e134878c2dc5587152587b42b870cde0a")
  public open
      fun conversationLogSettings(`value`: ConversationLogSettingsProperty.Builder.() -> Unit): Unit
      = conversationLogSettings(ConversationLogSettingsProperty(`value`))

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun sentimentAnalysisSettings(): Any? = unwrap(this).getSentimentAnalysisSettings()

  public open fun sentimentAnalysisSettings(`value`: Any) {
    unwrap(this).setSentimentAnalysisSettings(`value`)
  }

  public interface Builder {
    public fun botAliasLocaleSettings(botAliasLocaleSettings: IResolvable)

    public fun botAliasLocaleSettings(botAliasLocaleSettings: List<Any>)

    public fun botAliasName(botAliasName: String)

    public fun botAliasTags(botAliasTags: IResolvable)

    public fun botAliasTags(botAliasTags: List<Any>)

    public fun botId(botId: String)

    public fun botVersion(botVersion: String)

    public fun conversationLogSettings(conversationLogSettings: IResolvable)

    public fun conversationLogSettings(conversationLogSettings: ConversationLogSettingsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("196b16d3549d326e0b26c2eb003d401fc79f45fbb219cc0d0f5e2877d43ca582")
    public
        fun conversationLogSettings(conversationLogSettings: ConversationLogSettingsProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun sentimentAnalysisSettings(sentimentAnalysisSettings: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBotAlias.Builder =
        software.amazon.awscdk.services.lex.CfnBotAlias.Builder.create(scope, id)

    override fun botAliasLocaleSettings(botAliasLocaleSettings: IResolvable) {
      cdkBuilder.botAliasLocaleSettings(botAliasLocaleSettings.let(IResolvable::unwrap))
    }

    override fun botAliasLocaleSettings(botAliasLocaleSettings: List<Any>) {
      cdkBuilder.botAliasLocaleSettings(botAliasLocaleSettings)
    }

    override fun botAliasName(botAliasName: String) {
      cdkBuilder.botAliasName(botAliasName)
    }

    override fun botAliasTags(botAliasTags: IResolvable) {
      cdkBuilder.botAliasTags(botAliasTags.let(IResolvable::unwrap))
    }

    override fun botAliasTags(botAliasTags: List<Any>) {
      cdkBuilder.botAliasTags(botAliasTags)
    }

    override fun botId(botId: String) {
      cdkBuilder.botId(botId)
    }

    override fun botVersion(botVersion: String) {
      cdkBuilder.botVersion(botVersion)
    }

    override fun conversationLogSettings(conversationLogSettings: IResolvable) {
      cdkBuilder.conversationLogSettings(conversationLogSettings.let(IResolvable::unwrap))
    }

    override fun conversationLogSettings(conversationLogSettings: ConversationLogSettingsProperty) {
      cdkBuilder.conversationLogSettings(conversationLogSettings.let(ConversationLogSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("196b16d3549d326e0b26c2eb003d401fc79f45fbb219cc0d0f5e2877d43ca582")
    override
        fun conversationLogSettings(conversationLogSettings: ConversationLogSettingsProperty.Builder.() -> Unit):
        Unit = conversationLogSettings(ConversationLogSettingsProperty(conversationLogSettings))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun sentimentAnalysisSettings(sentimentAnalysisSettings: Any) {
      cdkBuilder.sentimentAnalysisSettings(sentimentAnalysisSettings)
    }

    public fun build(): software.amazon.awscdk.services.lex.CfnBotAlias = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBotAlias {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBotAlias(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotAlias): CfnBotAlias =
        CfnBotAlias(cdkObject)

    internal fun unwrap(wrapped: CfnBotAlias): software.amazon.awscdk.services.lex.CfnBotAlias =
        wrapped.cdkObject
  }

  public interface AudioLogSettingProperty {
    public fun destination(): Any

    public fun enabled(): Any

    public interface Builder {
      public fun destination(destination: IResolvable)

      public fun destination(destination: AudioLogDestinationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("91167c4637e32b60700a8c5a293b9930e735916da683cd738b3c2050cb48754a")
      public fun destination(destination: AudioLogDestinationProperty.Builder.() -> Unit)

      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBotAlias.AudioLogSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBotAlias.AudioLogSettingProperty.builder()

      override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      override fun destination(destination: AudioLogDestinationProperty) {
        cdkBuilder.destination(destination.let(AudioLogDestinationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("91167c4637e32b60700a8c5a293b9930e735916da683cd738b3c2050cb48754a")
      override fun destination(destination: AudioLogDestinationProperty.Builder.() -> Unit): Unit =
          destination(AudioLogDestinationProperty(destination))

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBotAlias.AudioLogSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBotAlias.AudioLogSettingProperty,
    ) : AudioLogSettingProperty {
      override fun destination(): Any = unwrap(this).getDestination()

      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AudioLogSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotAlias.AudioLogSettingProperty):
          AudioLogSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioLogSettingProperty):
          software.amazon.awscdk.services.lex.CfnBotAlias.AudioLogSettingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface BotAliasLocaleSettingsProperty {
    public fun codeHookSpecification(): Any? = unwrap(this).getCodeHookSpecification()

    public fun enabled(): Any

    public interface Builder {
      public fun codeHookSpecification(codeHookSpecification: IResolvable)

      public fun codeHookSpecification(codeHookSpecification: CodeHookSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0dc9b405e10908791a6c8b4fbef7a2966eee97b8bb4cd3da101d70dee9914164")
      public
          fun codeHookSpecification(codeHookSpecification: CodeHookSpecificationProperty.Builder.() -> Unit)

      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBotAlias.BotAliasLocaleSettingsProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBotAlias.BotAliasLocaleSettingsProperty.builder()

      override fun codeHookSpecification(codeHookSpecification: IResolvable) {
        cdkBuilder.codeHookSpecification(codeHookSpecification.let(IResolvable::unwrap))
      }

      override fun codeHookSpecification(codeHookSpecification: CodeHookSpecificationProperty) {
        cdkBuilder.codeHookSpecification(codeHookSpecification.let(CodeHookSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0dc9b405e10908791a6c8b4fbef7a2966eee97b8bb4cd3da101d70dee9914164")
      override
          fun codeHookSpecification(codeHookSpecification: CodeHookSpecificationProperty.Builder.() -> Unit):
          Unit = codeHookSpecification(CodeHookSpecificationProperty(codeHookSpecification))

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBotAlias.BotAliasLocaleSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBotAlias.BotAliasLocaleSettingsProperty,
    ) : BotAliasLocaleSettingsProperty {
      override fun codeHookSpecification(): Any? = unwrap(this).getCodeHookSpecification()

      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BotAliasLocaleSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotAlias.BotAliasLocaleSettingsProperty):
          BotAliasLocaleSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BotAliasLocaleSettingsProperty):
          software.amazon.awscdk.services.lex.CfnBotAlias.BotAliasLocaleSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface SentimentAnalysisSettingsProperty {
    public fun detectSentiment(): Any

    public interface Builder {
      public fun detectSentiment(detectSentiment: Boolean)

      public fun detectSentiment(detectSentiment: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBotAlias.SentimentAnalysisSettingsProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBotAlias.SentimentAnalysisSettingsProperty.builder()

      override fun detectSentiment(detectSentiment: Boolean) {
        cdkBuilder.detectSentiment(detectSentiment)
      }

      override fun detectSentiment(detectSentiment: IResolvable) {
        cdkBuilder.detectSentiment(detectSentiment.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBotAlias.SentimentAnalysisSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBotAlias.SentimentAnalysisSettingsProperty,
    ) : SentimentAnalysisSettingsProperty {
      override fun detectSentiment(): Any = unwrap(this).getDetectSentiment()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SentimentAnalysisSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotAlias.SentimentAnalysisSettingsProperty):
          SentimentAnalysisSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SentimentAnalysisSettingsProperty):
          software.amazon.awscdk.services.lex.CfnBotAlias.SentimentAnalysisSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CodeHookSpecificationProperty {
    public fun lambdaCodeHook(): Any

    public interface Builder {
      public fun lambdaCodeHook(lambdaCodeHook: IResolvable)

      public fun lambdaCodeHook(lambdaCodeHook: LambdaCodeHookProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7c53cd7386022c7f7d781befd8f70e8f48cec699259d08cd545b9e2c258e4e19")
      public fun lambdaCodeHook(lambdaCodeHook: LambdaCodeHookProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBotAlias.CodeHookSpecificationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBotAlias.CodeHookSpecificationProperty.builder()

      override fun lambdaCodeHook(lambdaCodeHook: IResolvable) {
        cdkBuilder.lambdaCodeHook(lambdaCodeHook.let(IResolvable::unwrap))
      }

      override fun lambdaCodeHook(lambdaCodeHook: LambdaCodeHookProperty) {
        cdkBuilder.lambdaCodeHook(lambdaCodeHook.let(LambdaCodeHookProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7c53cd7386022c7f7d781befd8f70e8f48cec699259d08cd545b9e2c258e4e19")
      override fun lambdaCodeHook(lambdaCodeHook: LambdaCodeHookProperty.Builder.() -> Unit): Unit =
          lambdaCodeHook(LambdaCodeHookProperty(lambdaCodeHook))

      public fun build():
          software.amazon.awscdk.services.lex.CfnBotAlias.CodeHookSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBotAlias.CodeHookSpecificationProperty,
    ) : CodeHookSpecificationProperty {
      override fun lambdaCodeHook(): Any = unwrap(this).getLambdaCodeHook()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CodeHookSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotAlias.CodeHookSpecificationProperty):
          CodeHookSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeHookSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBotAlias.CodeHookSpecificationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface LambdaCodeHookProperty {
    public fun codeHookInterfaceVersion(): String

    public fun lambdaArn(): String

    public interface Builder {
      public fun codeHookInterfaceVersion(codeHookInterfaceVersion: String)

      public fun lambdaArn(lambdaArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBotAlias.LambdaCodeHookProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBotAlias.LambdaCodeHookProperty.builder()

      override fun codeHookInterfaceVersion(codeHookInterfaceVersion: String) {
        cdkBuilder.codeHookInterfaceVersion(codeHookInterfaceVersion)
      }

      override fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBotAlias.LambdaCodeHookProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBotAlias.LambdaCodeHookProperty,
    ) : LambdaCodeHookProperty {
      override fun codeHookInterfaceVersion(): String = unwrap(this).getCodeHookInterfaceVersion()

      override fun lambdaArn(): String = unwrap(this).getLambdaArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaCodeHookProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotAlias.LambdaCodeHookProperty):
          LambdaCodeHookProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaCodeHookProperty):
          software.amazon.awscdk.services.lex.CfnBotAlias.LambdaCodeHookProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface BotAliasLocaleSettingsItemProperty {
    public fun botAliasLocaleSetting(): Any

    public fun localeId(): String

    public interface Builder {
      public fun botAliasLocaleSetting(botAliasLocaleSetting: IResolvable)

      public fun botAliasLocaleSetting(botAliasLocaleSetting: BotAliasLocaleSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("40e7307211638298925ef64f94a772d3f0a29670df6319215ef6ec37c2a7bbf3")
      public
          fun botAliasLocaleSetting(botAliasLocaleSetting: BotAliasLocaleSettingsProperty.Builder.() -> Unit)

      public fun localeId(localeId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBotAlias.BotAliasLocaleSettingsItemProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBotAlias.BotAliasLocaleSettingsItemProperty.builder()

      override fun botAliasLocaleSetting(botAliasLocaleSetting: IResolvable) {
        cdkBuilder.botAliasLocaleSetting(botAliasLocaleSetting.let(IResolvable::unwrap))
      }

      override fun botAliasLocaleSetting(botAliasLocaleSetting: BotAliasLocaleSettingsProperty) {
        cdkBuilder.botAliasLocaleSetting(botAliasLocaleSetting.let(BotAliasLocaleSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("40e7307211638298925ef64f94a772d3f0a29670df6319215ef6ec37c2a7bbf3")
      override
          fun botAliasLocaleSetting(botAliasLocaleSetting: BotAliasLocaleSettingsProperty.Builder.() -> Unit):
          Unit = botAliasLocaleSetting(BotAliasLocaleSettingsProperty(botAliasLocaleSetting))

      override fun localeId(localeId: String) {
        cdkBuilder.localeId(localeId)
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBotAlias.BotAliasLocaleSettingsItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBotAlias.BotAliasLocaleSettingsItemProperty,
    ) : BotAliasLocaleSettingsItemProperty {
      override fun botAliasLocaleSetting(): Any = unwrap(this).getBotAliasLocaleSetting()

      override fun localeId(): String = unwrap(this).getLocaleId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          BotAliasLocaleSettingsItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotAlias.BotAliasLocaleSettingsItemProperty):
          BotAliasLocaleSettingsItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BotAliasLocaleSettingsItemProperty):
          software.amazon.awscdk.services.lex.CfnBotAlias.BotAliasLocaleSettingsItemProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3BucketLogDestinationProperty {
    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    public fun logPrefix(): String

    public fun s3BucketArn(): String

    public interface Builder {
      public fun kmsKeyArn(kmsKeyArn: String)

      public fun logPrefix(logPrefix: String)

      public fun s3BucketArn(s3BucketArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBotAlias.S3BucketLogDestinationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBotAlias.S3BucketLogDestinationProperty.builder()

      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      override fun logPrefix(logPrefix: String) {
        cdkBuilder.logPrefix(logPrefix)
      }

      override fun s3BucketArn(s3BucketArn: String) {
        cdkBuilder.s3BucketArn(s3BucketArn)
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBotAlias.S3BucketLogDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBotAlias.S3BucketLogDestinationProperty,
    ) : S3BucketLogDestinationProperty {
      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

      override fun logPrefix(): String = unwrap(this).getLogPrefix()

      override fun s3BucketArn(): String = unwrap(this).getS3BucketArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3BucketLogDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotAlias.S3BucketLogDestinationProperty):
          S3BucketLogDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3BucketLogDestinationProperty):
          software.amazon.awscdk.services.lex.CfnBotAlias.S3BucketLogDestinationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface AudioLogDestinationProperty {
    public fun s3Bucket(): Any

    public interface Builder {
      public fun s3Bucket(s3Bucket: IResolvable)

      public fun s3Bucket(s3Bucket: S3BucketLogDestinationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2f8f1defb0eed06484c23d307f6271c407c94ce540e0efade59a31f34da430b1")
      public fun s3Bucket(s3Bucket: S3BucketLogDestinationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBotAlias.AudioLogDestinationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBotAlias.AudioLogDestinationProperty.builder()

      override fun s3Bucket(s3Bucket: IResolvable) {
        cdkBuilder.s3Bucket(s3Bucket.let(IResolvable::unwrap))
      }

      override fun s3Bucket(s3Bucket: S3BucketLogDestinationProperty) {
        cdkBuilder.s3Bucket(s3Bucket.let(S3BucketLogDestinationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2f8f1defb0eed06484c23d307f6271c407c94ce540e0efade59a31f34da430b1")
      override fun s3Bucket(s3Bucket: S3BucketLogDestinationProperty.Builder.() -> Unit): Unit =
          s3Bucket(S3BucketLogDestinationProperty(s3Bucket))

      public fun build():
          software.amazon.awscdk.services.lex.CfnBotAlias.AudioLogDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBotAlias.AudioLogDestinationProperty,
    ) : AudioLogDestinationProperty {
      override fun s3Bucket(): Any = unwrap(this).getS3Bucket()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AudioLogDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotAlias.AudioLogDestinationProperty):
          AudioLogDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioLogDestinationProperty):
          software.amazon.awscdk.services.lex.CfnBotAlias.AudioLogDestinationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TextLogDestinationProperty {
    public fun cloudWatch(): Any

    public interface Builder {
      public fun cloudWatch(cloudWatch: IResolvable)

      public fun cloudWatch(cloudWatch: CloudWatchLogGroupLogDestinationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0b3dfd722502e06c769bfb4b3823bd10dbcfae037729b1fbf993f7aad35170d8")
      public fun cloudWatch(cloudWatch: CloudWatchLogGroupLogDestinationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBotAlias.TextLogDestinationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBotAlias.TextLogDestinationProperty.builder()

      override fun cloudWatch(cloudWatch: IResolvable) {
        cdkBuilder.cloudWatch(cloudWatch.let(IResolvable::unwrap))
      }

      override fun cloudWatch(cloudWatch: CloudWatchLogGroupLogDestinationProperty) {
        cdkBuilder.cloudWatch(cloudWatch.let(CloudWatchLogGroupLogDestinationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0b3dfd722502e06c769bfb4b3823bd10dbcfae037729b1fbf993f7aad35170d8")
      override
          fun cloudWatch(cloudWatch: CloudWatchLogGroupLogDestinationProperty.Builder.() -> Unit):
          Unit = cloudWatch(CloudWatchLogGroupLogDestinationProperty(cloudWatch))

      public fun build(): software.amazon.awscdk.services.lex.CfnBotAlias.TextLogDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBotAlias.TextLogDestinationProperty,
    ) : TextLogDestinationProperty {
      override fun cloudWatch(): Any = unwrap(this).getCloudWatch()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TextLogDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotAlias.TextLogDestinationProperty):
          TextLogDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TextLogDestinationProperty):
          software.amazon.awscdk.services.lex.CfnBotAlias.TextLogDestinationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TextLogSettingProperty {
    public fun destination(): Any

    public fun enabled(): Any

    public interface Builder {
      public fun destination(destination: IResolvable)

      public fun destination(destination: TextLogDestinationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("449a0c43418e184284c7ee809fd458e4f30a39d4b88999b684291d5986c6d4b7")
      public fun destination(destination: TextLogDestinationProperty.Builder.() -> Unit)

      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBotAlias.TextLogSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBotAlias.TextLogSettingProperty.builder()

      override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      override fun destination(destination: TextLogDestinationProperty) {
        cdkBuilder.destination(destination.let(TextLogDestinationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("449a0c43418e184284c7ee809fd458e4f30a39d4b88999b684291d5986c6d4b7")
      override fun destination(destination: TextLogDestinationProperty.Builder.() -> Unit): Unit =
          destination(TextLogDestinationProperty(destination))

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBotAlias.TextLogSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBotAlias.TextLogSettingProperty,
    ) : TextLogSettingProperty {
      override fun destination(): Any = unwrap(this).getDestination()

      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TextLogSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotAlias.TextLogSettingProperty):
          TextLogSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TextLogSettingProperty):
          software.amazon.awscdk.services.lex.CfnBotAlias.TextLogSettingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CloudWatchLogGroupLogDestinationProperty {
    public fun cloudWatchLogGroupArn(): String

    public fun logPrefix(): String

    public interface Builder {
      public fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String)

      public fun logPrefix(logPrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBotAlias.CloudWatchLogGroupLogDestinationProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBotAlias.CloudWatchLogGroupLogDestinationProperty.builder()

      override fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String) {
        cdkBuilder.cloudWatchLogGroupArn(cloudWatchLogGroupArn)
      }

      override fun logPrefix(logPrefix: String) {
        cdkBuilder.logPrefix(logPrefix)
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBotAlias.CloudWatchLogGroupLogDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBotAlias.CloudWatchLogGroupLogDestinationProperty,
    ) : CloudWatchLogGroupLogDestinationProperty {
      override fun cloudWatchLogGroupArn(): String = unwrap(this).getCloudWatchLogGroupArn()

      override fun logPrefix(): String = unwrap(this).getLogPrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CloudWatchLogGroupLogDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotAlias.CloudWatchLogGroupLogDestinationProperty):
          CloudWatchLogGroupLogDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogGroupLogDestinationProperty):
          software.amazon.awscdk.services.lex.CfnBotAlias.CloudWatchLogGroupLogDestinationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConversationLogSettingsProperty {
    public fun audioLogSettings(): Any? = unwrap(this).getAudioLogSettings()

    public fun textLogSettings(): Any? = unwrap(this).getTextLogSettings()

    public interface Builder {
      public fun audioLogSettings(audioLogSettings: IResolvable)

      public fun audioLogSettings(audioLogSettings: List<Any>)

      public fun textLogSettings(textLogSettings: IResolvable)

      public fun textLogSettings(textLogSettings: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBotAlias.ConversationLogSettingsProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBotAlias.ConversationLogSettingsProperty.builder()

      override fun audioLogSettings(audioLogSettings: IResolvable) {
        cdkBuilder.audioLogSettings(audioLogSettings.let(IResolvable::unwrap))
      }

      override fun audioLogSettings(audioLogSettings: List<Any>) {
        cdkBuilder.audioLogSettings(audioLogSettings)
      }

      override fun textLogSettings(textLogSettings: IResolvable) {
        cdkBuilder.textLogSettings(textLogSettings.let(IResolvable::unwrap))
      }

      override fun textLogSettings(textLogSettings: List<Any>) {
        cdkBuilder.textLogSettings(textLogSettings)
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBotAlias.ConversationLogSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBotAlias.ConversationLogSettingsProperty,
    ) : ConversationLogSettingsProperty {
      override fun audioLogSettings(): Any? = unwrap(this).getAudioLogSettings()

      override fun textLogSettings(): Any? = unwrap(this).getTextLogSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConversationLogSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotAlias.ConversationLogSettingsProperty):
          ConversationLogSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConversationLogSettingsProperty):
          software.amazon.awscdk.services.lex.CfnBotAlias.ConversationLogSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
