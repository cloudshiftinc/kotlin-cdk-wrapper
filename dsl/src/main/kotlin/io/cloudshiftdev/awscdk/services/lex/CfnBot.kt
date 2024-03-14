package io.cloudshiftdev.awscdk.services.lex

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
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

public open class CfnBot internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lex.CfnBot,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun autoBuildBotLocales(): Any? = unwrap(this).getAutoBuildBotLocales()

  public open fun autoBuildBotLocales(`value`: Boolean) {
    unwrap(this).setAutoBuildBotLocales(`value`)
  }

  public open fun autoBuildBotLocales(`value`: IResolvable) {
    unwrap(this).setAutoBuildBotLocales(`value`.let(IResolvable::unwrap))
  }

  public open fun botFileS3Location(): Any? = unwrap(this).getBotFileS3Location()

  public open fun botFileS3Location(`value`: IResolvable) {
    unwrap(this).setBotFileS3Location(`value`.let(IResolvable::unwrap))
  }

  public open fun botFileS3Location(`value`: S3LocationProperty) {
    unwrap(this).setBotFileS3Location(`value`.let(S3LocationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9dedb455ad66b89bab72e1af0afaf8265fd7b31bce3a272ba289cb874242f8c3")
  public open fun botFileS3Location(`value`: S3LocationProperty.Builder.() -> Unit): Unit =
      botFileS3Location(S3LocationProperty(`value`))

  public open fun botLocales(): Any? = unwrap(this).getBotLocales()

  public open fun botLocales(`value`: IResolvable) {
    unwrap(this).setBotLocales(`value`.let(IResolvable::unwrap))
  }

  public open fun botLocales(__idx_ac66f0: List<Any>) {
    unwrap(this).setBotLocales(__idx_ac66f0)
  }

  public open fun botTags(): Any? = unwrap(this).getBotTags()

  public open fun botTags(`value`: IResolvable) {
    unwrap(this).setBotTags(`value`.let(IResolvable::unwrap))
  }

  public open fun botTags(__idx_ac66f0: List<Any>) {
    unwrap(this).setBotTags(__idx_ac66f0)
  }

  public open fun dataPrivacy(): Any = unwrap(this).getDataPrivacy()

  public open fun dataPrivacy(`value`: Any) {
    unwrap(this).setDataPrivacy(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun idleSessionTtlInSeconds(): Number = unwrap(this).getIdleSessionTtlInSeconds()

  public open fun idleSessionTtlInSeconds(`value`: Number) {
    unwrap(this).setIdleSessionTtlInSeconds(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun testBotAliasSettings(): Any? = unwrap(this).getTestBotAliasSettings()

  public open fun testBotAliasSettings(`value`: IResolvable) {
    unwrap(this).setTestBotAliasSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun testBotAliasSettings(`value`: TestBotAliasSettingsProperty) {
    unwrap(this).setTestBotAliasSettings(`value`.let(TestBotAliasSettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fd266229f645c7df1f93b233266132dad019c0bf2ce7d5e631e6beae84e05222")
  public open fun testBotAliasSettings(`value`: TestBotAliasSettingsProperty.Builder.() -> Unit):
      Unit = testBotAliasSettings(TestBotAliasSettingsProperty(`value`))

  public open fun testBotAliasTags(): Any? = unwrap(this).getTestBotAliasTags()

  public open fun testBotAliasTags(`value`: IResolvable) {
    unwrap(this).setTestBotAliasTags(`value`.let(IResolvable::unwrap))
  }

  public open fun testBotAliasTags(__idx_ac66f0: List<Any>) {
    unwrap(this).setTestBotAliasTags(__idx_ac66f0)
  }

  public interface Builder {
    public fun autoBuildBotLocales(autoBuildBotLocales: Boolean)

    public fun autoBuildBotLocales(autoBuildBotLocales: IResolvable)

    public fun botFileS3Location(botFileS3Location: IResolvable)

    public fun botFileS3Location(botFileS3Location: S3LocationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34052ba23ead94866e72b45c3fad98a216e6db2a63472d7ed4727bf546a07b6f")
    public fun botFileS3Location(botFileS3Location: S3LocationProperty.Builder.() -> Unit)

    public fun botLocales(botLocales: IResolvable)

    public fun botLocales(botLocales: List<Any>)

    public fun botTags(botTags: IResolvable)

    public fun botTags(botTags: List<Any>)

    public fun dataPrivacy(dataPrivacy: Any)

    public fun description(description: String)

    public fun idleSessionTtlInSeconds(idleSessionTtlInSeconds: Number)

    public fun name(name: String)

    public fun roleArn(roleArn: String)

    public fun testBotAliasSettings(testBotAliasSettings: IResolvable)

    public fun testBotAliasSettings(testBotAliasSettings: TestBotAliasSettingsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6e76e6aa20450f4bf4936a0e6d1ac9affcf3e65b284d2b5adae3baf7c6c7ace9")
    public
        fun testBotAliasSettings(testBotAliasSettings: TestBotAliasSettingsProperty.Builder.() -> Unit)

    public fun testBotAliasTags(testBotAliasTags: IResolvable)

    public fun testBotAliasTags(testBotAliasTags: List<Any>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBot.Builder =
        software.amazon.awscdk.services.lex.CfnBot.Builder.create(scope, id)

    override fun autoBuildBotLocales(autoBuildBotLocales: Boolean) {
      cdkBuilder.autoBuildBotLocales(autoBuildBotLocales)
    }

    override fun autoBuildBotLocales(autoBuildBotLocales: IResolvable) {
      cdkBuilder.autoBuildBotLocales(autoBuildBotLocales.let(IResolvable::unwrap))
    }

    override fun botFileS3Location(botFileS3Location: IResolvable) {
      cdkBuilder.botFileS3Location(botFileS3Location.let(IResolvable::unwrap))
    }

    override fun botFileS3Location(botFileS3Location: S3LocationProperty) {
      cdkBuilder.botFileS3Location(botFileS3Location.let(S3LocationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34052ba23ead94866e72b45c3fad98a216e6db2a63472d7ed4727bf546a07b6f")
    override fun botFileS3Location(botFileS3Location: S3LocationProperty.Builder.() -> Unit): Unit =
        botFileS3Location(S3LocationProperty(botFileS3Location))

    override fun botLocales(botLocales: IResolvable) {
      cdkBuilder.botLocales(botLocales.let(IResolvable::unwrap))
    }

    override fun botLocales(botLocales: List<Any>) {
      cdkBuilder.botLocales(botLocales)
    }

    override fun botTags(botTags: IResolvable) {
      cdkBuilder.botTags(botTags.let(IResolvable::unwrap))
    }

    override fun botTags(botTags: List<Any>) {
      cdkBuilder.botTags(botTags)
    }

    override fun dataPrivacy(dataPrivacy: Any) {
      cdkBuilder.dataPrivacy(dataPrivacy)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun idleSessionTtlInSeconds(idleSessionTtlInSeconds: Number) {
      cdkBuilder.idleSessionTtlInSeconds(idleSessionTtlInSeconds)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun testBotAliasSettings(testBotAliasSettings: IResolvable) {
      cdkBuilder.testBotAliasSettings(testBotAliasSettings.let(IResolvable::unwrap))
    }

    override fun testBotAliasSettings(testBotAliasSettings: TestBotAliasSettingsProperty) {
      cdkBuilder.testBotAliasSettings(testBotAliasSettings.let(TestBotAliasSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6e76e6aa20450f4bf4936a0e6d1ac9affcf3e65b284d2b5adae3baf7c6c7ace9")
    override
        fun testBotAliasSettings(testBotAliasSettings: TestBotAliasSettingsProperty.Builder.() -> Unit):
        Unit = testBotAliasSettings(TestBotAliasSettingsProperty(testBotAliasSettings))

    override fun testBotAliasTags(testBotAliasTags: IResolvable) {
      cdkBuilder.testBotAliasTags(testBotAliasTags.let(IResolvable::unwrap))
    }

    override fun testBotAliasTags(testBotAliasTags: List<Any>) {
      cdkBuilder.testBotAliasTags(testBotAliasTags)
    }

    public fun build(): software.amazon.awscdk.services.lex.CfnBot = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBot {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBot(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot): CfnBot =
        CfnBot(cdkObject)

    internal fun unwrap(wrapped: CfnBot): software.amazon.awscdk.services.lex.CfnBot =
        wrapped.cdkObject
  }

  public interface PlainTextMessageProperty {
    public fun `value`(): String

    public interface Builder {
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.PlainTextMessageProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.PlainTextMessageProperty.builder()

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.PlainTextMessageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.PlainTextMessageProperty,
    ) : PlainTextMessageProperty {
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PlainTextMessageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.PlainTextMessageProperty):
          PlainTextMessageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlainTextMessageProperty):
          software.amazon.awscdk.services.lex.CfnBot.PlainTextMessageProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SlotValueRegexFilterProperty {
    public fun pattern(): String

    public interface Builder {
      public fun pattern(pattern: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.SlotValueRegexFilterProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SlotValueRegexFilterProperty.builder()

      override fun pattern(pattern: String) {
        cdkBuilder.pattern(pattern)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.SlotValueRegexFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.SlotValueRegexFilterProperty,
    ) : SlotValueRegexFilterProperty {
      override fun pattern(): String = unwrap(this).getPattern()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SlotValueRegexFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotValueRegexFilterProperty):
          SlotValueRegexFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlotValueRegexFilterProperty):
          software.amazon.awscdk.services.lex.CfnBot.SlotValueRegexFilterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PromptSpecificationProperty {
    public fun allowInterrupt(): Any? = unwrap(this).getAllowInterrupt()

    public fun maxRetries(): Number

    public fun messageGroupsList(): Any

    public fun messageSelectionStrategy(): String? = unwrap(this).getMessageSelectionStrategy()

    public fun promptAttemptsSpecification(): Any? = unwrap(this).getPromptAttemptsSpecification()

    public interface Builder {
      public fun allowInterrupt(allowInterrupt: Boolean)

      public fun allowInterrupt(allowInterrupt: IResolvable)

      public fun maxRetries(maxRetries: Number)

      public fun messageGroupsList(messageGroupsList: IResolvable)

      public fun messageGroupsList(messageGroupsList: List<Any>)

      public fun messageSelectionStrategy(messageSelectionStrategy: String)

      public fun promptAttemptsSpecification(promptAttemptsSpecification: IResolvable)

      public fun promptAttemptsSpecification(promptAttemptsSpecification: Map<String, Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.PromptSpecificationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.PromptSpecificationProperty.builder()

      override fun allowInterrupt(allowInterrupt: Boolean) {
        cdkBuilder.allowInterrupt(allowInterrupt)
      }

      override fun allowInterrupt(allowInterrupt: IResolvable) {
        cdkBuilder.allowInterrupt(allowInterrupt.let(IResolvable::unwrap))
      }

      override fun maxRetries(maxRetries: Number) {
        cdkBuilder.maxRetries(maxRetries)
      }

      override fun messageGroupsList(messageGroupsList: IResolvable) {
        cdkBuilder.messageGroupsList(messageGroupsList.let(IResolvable::unwrap))
      }

      override fun messageGroupsList(messageGroupsList: List<Any>) {
        cdkBuilder.messageGroupsList(messageGroupsList)
      }

      override fun messageSelectionStrategy(messageSelectionStrategy: String) {
        cdkBuilder.messageSelectionStrategy(messageSelectionStrategy)
      }

      override fun promptAttemptsSpecification(promptAttemptsSpecification: IResolvable) {
        cdkBuilder.promptAttemptsSpecification(promptAttemptsSpecification.let(IResolvable::unwrap))
      }

      override fun promptAttemptsSpecification(promptAttemptsSpecification: Map<String, Any>) {
        cdkBuilder.promptAttemptsSpecification(promptAttemptsSpecification)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.PromptSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.PromptSpecificationProperty,
    ) : PromptSpecificationProperty {
      override fun allowInterrupt(): Any? = unwrap(this).getAllowInterrupt()

      override fun maxRetries(): Number = unwrap(this).getMaxRetries()

      override fun messageGroupsList(): Any = unwrap(this).getMessageGroupsList()

      override fun messageSelectionStrategy(): String? = unwrap(this).getMessageSelectionStrategy()

      override fun promptAttemptsSpecification(): Any? =
          unwrap(this).getPromptAttemptsSpecification()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PromptSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.PromptSpecificationProperty):
          PromptSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.PromptSpecificationProperty = (wrapped as
          Wrapper).cdkObject
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
          software.amazon.awscdk.services.lex.CfnBot.SentimentAnalysisSettingsProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SentimentAnalysisSettingsProperty.builder()

      override fun detectSentiment(detectSentiment: Boolean) {
        cdkBuilder.detectSentiment(detectSentiment)
      }

      override fun detectSentiment(detectSentiment: IResolvable) {
        cdkBuilder.detectSentiment(detectSentiment.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.SentimentAnalysisSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.SentimentAnalysisSettingsProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SentimentAnalysisSettingsProperty):
          SentimentAnalysisSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SentimentAnalysisSettingsProperty):
          software.amazon.awscdk.services.lex.CfnBot.SentimentAnalysisSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface OutputContextProperty {
    public fun name(): String

    public fun timeToLiveInSeconds(): Number

    public fun turnsToLive(): Number

    public interface Builder {
      public fun name(name: String)

      public fun timeToLiveInSeconds(timeToLiveInSeconds: Number)

      public fun turnsToLive(turnsToLive: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.OutputContextProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.OutputContextProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun timeToLiveInSeconds(timeToLiveInSeconds: Number) {
        cdkBuilder.timeToLiveInSeconds(timeToLiveInSeconds)
      }

      override fun turnsToLive(turnsToLive: Number) {
        cdkBuilder.turnsToLive(turnsToLive)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.OutputContextProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.OutputContextProperty,
    ) : OutputContextProperty {
      override fun name(): String = unwrap(this).getName()

      override fun timeToLiveInSeconds(): Number = unwrap(this).getTimeToLiveInSeconds()

      override fun turnsToLive(): Number = unwrap(this).getTurnsToLive()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OutputContextProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.OutputContextProperty):
          OutputContextProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputContextProperty):
          software.amazon.awscdk.services.lex.CfnBot.OutputContextProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SlotValueOverrideMapProperty {
    public fun slotName(): String? = unwrap(this).getSlotName()

    public fun slotValueOverride(): Any? = unwrap(this).getSlotValueOverride()

    public interface Builder {
      public fun slotName(slotName: String)

      public fun slotValueOverride(slotValueOverride: IResolvable)

      public fun slotValueOverride(slotValueOverride: SlotValueOverrideProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("18bcfcb045a12a068f9d397ffce2a90823560b8e34d97fe22890ccbc028ff039")
      public fun slotValueOverride(slotValueOverride: SlotValueOverrideProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.SlotValueOverrideMapProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SlotValueOverrideMapProperty.builder()

      override fun slotName(slotName: String) {
        cdkBuilder.slotName(slotName)
      }

      override fun slotValueOverride(slotValueOverride: IResolvable) {
        cdkBuilder.slotValueOverride(slotValueOverride.let(IResolvable::unwrap))
      }

      override fun slotValueOverride(slotValueOverride: SlotValueOverrideProperty) {
        cdkBuilder.slotValueOverride(slotValueOverride.let(SlotValueOverrideProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("18bcfcb045a12a068f9d397ffce2a90823560b8e34d97fe22890ccbc028ff039")
      override
          fun slotValueOverride(slotValueOverride: SlotValueOverrideProperty.Builder.() -> Unit):
          Unit = slotValueOverride(SlotValueOverrideProperty(slotValueOverride))

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.SlotValueOverrideMapProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.SlotValueOverrideMapProperty,
    ) : SlotValueOverrideMapProperty {
      override fun slotName(): String? = unwrap(this).getSlotName()

      override fun slotValueOverride(): Any? = unwrap(this).getSlotValueOverride()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SlotValueOverrideMapProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotValueOverrideMapProperty):
          SlotValueOverrideMapProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlotValueOverrideMapProperty):
          software.amazon.awscdk.services.lex.CfnBot.SlotValueOverrideMapProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AudioAndDTMFInputSpecificationProperty {
    public fun audioSpecification(): Any? = unwrap(this).getAudioSpecification()

    public fun dtmfSpecification(): Any? = unwrap(this).getDtmfSpecification()

    public fun startTimeoutMs(): Number

    public interface Builder {
      public fun audioSpecification(audioSpecification: IResolvable)

      public fun audioSpecification(audioSpecification: AudioSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab63600b5ff2fd4a4b547b226f2d7cce0712986c5bbd8e417b0899ca35837f1f")
      public
          fun audioSpecification(audioSpecification: AudioSpecificationProperty.Builder.() -> Unit)

      public fun dtmfSpecification(dtmfSpecification: IResolvable)

      public fun dtmfSpecification(dtmfSpecification: DTMFSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76c203d83266832ddbd4dda9b0879cc214f5402efa864e01b232ec1faeec3020")
      public fun dtmfSpecification(dtmfSpecification: DTMFSpecificationProperty.Builder.() -> Unit)

      public fun startTimeoutMs(startTimeoutMs: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.AudioAndDTMFInputSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBot.AudioAndDTMFInputSpecificationProperty.builder()

      override fun audioSpecification(audioSpecification: IResolvable) {
        cdkBuilder.audioSpecification(audioSpecification.let(IResolvable::unwrap))
      }

      override fun audioSpecification(audioSpecification: AudioSpecificationProperty) {
        cdkBuilder.audioSpecification(audioSpecification.let(AudioSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab63600b5ff2fd4a4b547b226f2d7cce0712986c5bbd8e417b0899ca35837f1f")
      override
          fun audioSpecification(audioSpecification: AudioSpecificationProperty.Builder.() -> Unit):
          Unit = audioSpecification(AudioSpecificationProperty(audioSpecification))

      override fun dtmfSpecification(dtmfSpecification: IResolvable) {
        cdkBuilder.dtmfSpecification(dtmfSpecification.let(IResolvable::unwrap))
      }

      override fun dtmfSpecification(dtmfSpecification: DTMFSpecificationProperty) {
        cdkBuilder.dtmfSpecification(dtmfSpecification.let(DTMFSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76c203d83266832ddbd4dda9b0879cc214f5402efa864e01b232ec1faeec3020")
      override
          fun dtmfSpecification(dtmfSpecification: DTMFSpecificationProperty.Builder.() -> Unit):
          Unit = dtmfSpecification(DTMFSpecificationProperty(dtmfSpecification))

      override fun startTimeoutMs(startTimeoutMs: Number) {
        cdkBuilder.startTimeoutMs(startTimeoutMs)
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.AudioAndDTMFInputSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.AudioAndDTMFInputSpecificationProperty,
    ) : AudioAndDTMFInputSpecificationProperty {
      override fun audioSpecification(): Any? = unwrap(this).getAudioSpecification()

      override fun dtmfSpecification(): Any? = unwrap(this).getDtmfSpecification()

      override fun startTimeoutMs(): Number = unwrap(this).getStartTimeoutMs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AudioAndDTMFInputSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.AudioAndDTMFInputSpecificationProperty):
          AudioAndDTMFInputSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioAndDTMFInputSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.AudioAndDTMFInputSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FulfillmentUpdateResponseSpecificationProperty {
    public fun allowInterrupt(): Any? = unwrap(this).getAllowInterrupt()

    public fun frequencyInSeconds(): Number

    public fun messageGroups(): Any

    public interface Builder {
      public fun allowInterrupt(allowInterrupt: Boolean)

      public fun allowInterrupt(allowInterrupt: IResolvable)

      public fun frequencyInSeconds(frequencyInSeconds: Number)

      public fun messageGroups(messageGroups: IResolvable)

      public fun messageGroups(messageGroups: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentUpdateResponseSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentUpdateResponseSpecificationProperty.builder()

      override fun allowInterrupt(allowInterrupt: Boolean) {
        cdkBuilder.allowInterrupt(allowInterrupt)
      }

      override fun allowInterrupt(allowInterrupt: IResolvable) {
        cdkBuilder.allowInterrupt(allowInterrupt.let(IResolvable::unwrap))
      }

      override fun frequencyInSeconds(frequencyInSeconds: Number) {
        cdkBuilder.frequencyInSeconds(frequencyInSeconds)
      }

      override fun messageGroups(messageGroups: IResolvable) {
        cdkBuilder.messageGroups(messageGroups.let(IResolvable::unwrap))
      }

      override fun messageGroups(messageGroups: List<Any>) {
        cdkBuilder.messageGroups(messageGroups)
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentUpdateResponseSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentUpdateResponseSpecificationProperty,
    ) : FulfillmentUpdateResponseSpecificationProperty {
      override fun allowInterrupt(): Any? = unwrap(this).getAllowInterrupt()

      override fun frequencyInSeconds(): Number = unwrap(this).getFrequencyInSeconds()

      override fun messageGroups(): Any = unwrap(this).getMessageGroups()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          FulfillmentUpdateResponseSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.FulfillmentUpdateResponseSpecificationProperty):
          FulfillmentUpdateResponseSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FulfillmentUpdateResponseSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentUpdateResponseSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ElicitationCodeHookInvocationSettingProperty {
    public fun enableCodeHookInvocation(): Any

    public fun invocationLabel(): String? = unwrap(this).getInvocationLabel()

    public interface Builder {
      public fun enableCodeHookInvocation(enableCodeHookInvocation: Boolean)

      public fun enableCodeHookInvocation(enableCodeHookInvocation: IResolvable)

      public fun invocationLabel(invocationLabel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.ElicitationCodeHookInvocationSettingProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBot.ElicitationCodeHookInvocationSettingProperty.builder()

      override fun enableCodeHookInvocation(enableCodeHookInvocation: Boolean) {
        cdkBuilder.enableCodeHookInvocation(enableCodeHookInvocation)
      }

      override fun enableCodeHookInvocation(enableCodeHookInvocation: IResolvable) {
        cdkBuilder.enableCodeHookInvocation(enableCodeHookInvocation.let(IResolvable::unwrap))
      }

      override fun invocationLabel(invocationLabel: String) {
        cdkBuilder.invocationLabel(invocationLabel)
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.ElicitationCodeHookInvocationSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.ElicitationCodeHookInvocationSettingProperty,
    ) : ElicitationCodeHookInvocationSettingProperty {
      override fun enableCodeHookInvocation(): Any = unwrap(this).getEnableCodeHookInvocation()

      override fun invocationLabel(): String? = unwrap(this).getInvocationLabel()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ElicitationCodeHookInvocationSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.ElicitationCodeHookInvocationSettingProperty):
          ElicitationCodeHookInvocationSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ElicitationCodeHookInvocationSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.ElicitationCodeHookInvocationSettingProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SlotDefaultValueSpecificationProperty {
    public fun defaultValueList(): Any

    public interface Builder {
      public fun defaultValueList(defaultValueList: IResolvable)

      public fun defaultValueList(defaultValueList: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.SlotDefaultValueSpecificationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SlotDefaultValueSpecificationProperty.builder()

      override fun defaultValueList(defaultValueList: IResolvable) {
        cdkBuilder.defaultValueList(defaultValueList.let(IResolvable::unwrap))
      }

      override fun defaultValueList(defaultValueList: List<Any>) {
        cdkBuilder.defaultValueList(defaultValueList)
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.SlotDefaultValueSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.SlotDefaultValueSpecificationProperty,
    ) : SlotDefaultValueSpecificationProperty {
      override fun defaultValueList(): Any = unwrap(this).getDefaultValueList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SlotDefaultValueSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotDefaultValueSpecificationProperty):
          SlotDefaultValueSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlotDefaultValueSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.SlotDefaultValueSpecificationProperty =
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
          software.amazon.awscdk.services.lex.CfnBot.S3BucketLogDestinationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.S3BucketLogDestinationProperty.builder()

      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      override fun logPrefix(logPrefix: String) {
        cdkBuilder.logPrefix(logPrefix)
      }

      override fun s3BucketArn(s3BucketArn: String) {
        cdkBuilder.s3BucketArn(s3BucketArn)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.S3BucketLogDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.S3BucketLogDestinationProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.S3BucketLogDestinationProperty):
          S3BucketLogDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3BucketLogDestinationProperty):
          software.amazon.awscdk.services.lex.CfnBot.S3BucketLogDestinationProperty = (wrapped as
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
      @JvmName("061facdb9e1ed7b2656465f4dbb2831111a7baaae36e97d5c8991de19c20ce29")
      public
          fun codeHookSpecification(codeHookSpecification: CodeHookSpecificationProperty.Builder.() -> Unit)

      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.BotAliasLocaleSettingsProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.BotAliasLocaleSettingsProperty.builder()

      override fun codeHookSpecification(codeHookSpecification: IResolvable) {
        cdkBuilder.codeHookSpecification(codeHookSpecification.let(IResolvable::unwrap))
      }

      override fun codeHookSpecification(codeHookSpecification: CodeHookSpecificationProperty) {
        cdkBuilder.codeHookSpecification(codeHookSpecification.let(CodeHookSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("061facdb9e1ed7b2656465f4dbb2831111a7baaae36e97d5c8991de19c20ce29")
      override
          fun codeHookSpecification(codeHookSpecification: CodeHookSpecificationProperty.Builder.() -> Unit):
          Unit = codeHookSpecification(CodeHookSpecificationProperty(codeHookSpecification))

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.BotAliasLocaleSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.BotAliasLocaleSettingsProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.BotAliasLocaleSettingsProperty):
          BotAliasLocaleSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BotAliasLocaleSettingsProperty):
          software.amazon.awscdk.services.lex.CfnBot.BotAliasLocaleSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SlotValueElicitationSettingProperty {
    public fun defaultValueSpecification(): Any? = unwrap(this).getDefaultValueSpecification()

    public fun promptSpecification(): Any? = unwrap(this).getPromptSpecification()

    public fun sampleUtterances(): Any? = unwrap(this).getSampleUtterances()

    public fun slotCaptureSetting(): Any? = unwrap(this).getSlotCaptureSetting()

    public fun slotConstraint(): String

    public fun waitAndContinueSpecification(): Any? = unwrap(this).getWaitAndContinueSpecification()

    public interface Builder {
      public fun defaultValueSpecification(defaultValueSpecification: IResolvable)

      public
          fun defaultValueSpecification(defaultValueSpecification: SlotDefaultValueSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("697eaca2a6a75568406081d678f16d93f06c6f9d68ac2849ea8ef4148f07f1f3")
      public
          fun defaultValueSpecification(defaultValueSpecification: SlotDefaultValueSpecificationProperty.Builder.() -> Unit)

      public fun promptSpecification(promptSpecification: IResolvable)

      public fun promptSpecification(promptSpecification: PromptSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("31322ebebe47545b9d5b8144de0ecebac5954a5207d6a72aaaf34f73b3884ddc")
      public
          fun promptSpecification(promptSpecification: PromptSpecificationProperty.Builder.() -> Unit)

      public fun sampleUtterances(sampleUtterances: IResolvable)

      public fun sampleUtterances(sampleUtterances: List<Any>)

      public fun slotCaptureSetting(slotCaptureSetting: IResolvable)

      public fun slotCaptureSetting(slotCaptureSetting: SlotCaptureSettingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2e690e43f7045723e4f837b25c37a81fc36ccbc7f32da93896c9cbc9f1ba9ae1")
      public
          fun slotCaptureSetting(slotCaptureSetting: SlotCaptureSettingProperty.Builder.() -> Unit)

      public fun slotConstraint(slotConstraint: String)

      public fun waitAndContinueSpecification(waitAndContinueSpecification: IResolvable)

      public
          fun waitAndContinueSpecification(waitAndContinueSpecification: WaitAndContinueSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("982180578aba7450d801c54264ec3d1e57b7a8472fe64ff7a3fcf84ff1486ba6")
      public
          fun waitAndContinueSpecification(waitAndContinueSpecification: WaitAndContinueSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.SlotValueElicitationSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SlotValueElicitationSettingProperty.builder()

      override fun defaultValueSpecification(defaultValueSpecification: IResolvable) {
        cdkBuilder.defaultValueSpecification(defaultValueSpecification.let(IResolvable::unwrap))
      }

      override
          fun defaultValueSpecification(defaultValueSpecification: SlotDefaultValueSpecificationProperty) {
        cdkBuilder.defaultValueSpecification(defaultValueSpecification.let(SlotDefaultValueSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("697eaca2a6a75568406081d678f16d93f06c6f9d68ac2849ea8ef4148f07f1f3")
      override
          fun defaultValueSpecification(defaultValueSpecification: SlotDefaultValueSpecificationProperty.Builder.() -> Unit):
          Unit =
          defaultValueSpecification(SlotDefaultValueSpecificationProperty(defaultValueSpecification))

      override fun promptSpecification(promptSpecification: IResolvable) {
        cdkBuilder.promptSpecification(promptSpecification.let(IResolvable::unwrap))
      }

      override fun promptSpecification(promptSpecification: PromptSpecificationProperty) {
        cdkBuilder.promptSpecification(promptSpecification.let(PromptSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("31322ebebe47545b9d5b8144de0ecebac5954a5207d6a72aaaf34f73b3884ddc")
      override
          fun promptSpecification(promptSpecification: PromptSpecificationProperty.Builder.() -> Unit):
          Unit = promptSpecification(PromptSpecificationProperty(promptSpecification))

      override fun sampleUtterances(sampleUtterances: IResolvable) {
        cdkBuilder.sampleUtterances(sampleUtterances.let(IResolvable::unwrap))
      }

      override fun sampleUtterances(sampleUtterances: List<Any>) {
        cdkBuilder.sampleUtterances(sampleUtterances)
      }

      override fun slotCaptureSetting(slotCaptureSetting: IResolvable) {
        cdkBuilder.slotCaptureSetting(slotCaptureSetting.let(IResolvable::unwrap))
      }

      override fun slotCaptureSetting(slotCaptureSetting: SlotCaptureSettingProperty) {
        cdkBuilder.slotCaptureSetting(slotCaptureSetting.let(SlotCaptureSettingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2e690e43f7045723e4f837b25c37a81fc36ccbc7f32da93896c9cbc9f1ba9ae1")
      override
          fun slotCaptureSetting(slotCaptureSetting: SlotCaptureSettingProperty.Builder.() -> Unit):
          Unit = slotCaptureSetting(SlotCaptureSettingProperty(slotCaptureSetting))

      override fun slotConstraint(slotConstraint: String) {
        cdkBuilder.slotConstraint(slotConstraint)
      }

      override fun waitAndContinueSpecification(waitAndContinueSpecification: IResolvable) {
        cdkBuilder.waitAndContinueSpecification(waitAndContinueSpecification.let(IResolvable::unwrap))
      }

      override
          fun waitAndContinueSpecification(waitAndContinueSpecification: WaitAndContinueSpecificationProperty) {
        cdkBuilder.waitAndContinueSpecification(waitAndContinueSpecification.let(WaitAndContinueSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("982180578aba7450d801c54264ec3d1e57b7a8472fe64ff7a3fcf84ff1486ba6")
      override
          fun waitAndContinueSpecification(waitAndContinueSpecification: WaitAndContinueSpecificationProperty.Builder.() -> Unit):
          Unit =
          waitAndContinueSpecification(WaitAndContinueSpecificationProperty(waitAndContinueSpecification))

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.SlotValueElicitationSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.SlotValueElicitationSettingProperty,
    ) : SlotValueElicitationSettingProperty {
      override fun defaultValueSpecification(): Any? = unwrap(this).getDefaultValueSpecification()

      override fun promptSpecification(): Any? = unwrap(this).getPromptSpecification()

      override fun sampleUtterances(): Any? = unwrap(this).getSampleUtterances()

      override fun slotCaptureSetting(): Any? = unwrap(this).getSlotCaptureSetting()

      override fun slotConstraint(): String = unwrap(this).getSlotConstraint()

      override fun waitAndContinueSpecification(): Any? =
          unwrap(this).getWaitAndContinueSpecification()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SlotValueElicitationSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotValueElicitationSettingProperty):
          SlotValueElicitationSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlotValueElicitationSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.SlotValueElicitationSettingProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface PostDialogCodeHookInvocationSpecificationProperty {
    public fun failureConditional(): Any? = unwrap(this).getFailureConditional()

    public fun failureNextStep(): Any? = unwrap(this).getFailureNextStep()

    public fun failureResponse(): Any? = unwrap(this).getFailureResponse()

    public fun successConditional(): Any? = unwrap(this).getSuccessConditional()

    public fun successNextStep(): Any? = unwrap(this).getSuccessNextStep()

    public fun successResponse(): Any? = unwrap(this).getSuccessResponse()

    public fun timeoutConditional(): Any? = unwrap(this).getTimeoutConditional()

    public fun timeoutNextStep(): Any? = unwrap(this).getTimeoutNextStep()

    public fun timeoutResponse(): Any? = unwrap(this).getTimeoutResponse()

    public interface Builder {
      public fun failureConditional(failureConditional: IResolvable)

      public fun failureConditional(failureConditional: ConditionalSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a31debbf13eaccf61af0ae05dec5876c7102629b14b86a37324cfb2aa8004eac")
      public
          fun failureConditional(failureConditional: ConditionalSpecificationProperty.Builder.() -> Unit)

      public fun failureNextStep(failureNextStep: IResolvable)

      public fun failureNextStep(failureNextStep: DialogStateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c76e3c6d416c507c1565ca27669610b4de0c2c9ea7c496501b30bc5bd42df3d0")
      public fun failureNextStep(failureNextStep: DialogStateProperty.Builder.() -> Unit)

      public fun failureResponse(failureResponse: IResolvable)

      public fun failureResponse(failureResponse: ResponseSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d46d0ef9580a382564eeccce208df2906bda1d480bba65cb04aa04dc3f7d7b08")
      public fun failureResponse(failureResponse: ResponseSpecificationProperty.Builder.() -> Unit)

      public fun successConditional(successConditional: IResolvable)

      public fun successConditional(successConditional: ConditionalSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8652ce061e95c444bc471ea830ede868e6eb6a215c33e2034cb6c0317e00ac06")
      public
          fun successConditional(successConditional: ConditionalSpecificationProperty.Builder.() -> Unit)

      public fun successNextStep(successNextStep: IResolvable)

      public fun successNextStep(successNextStep: DialogStateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("604288558462ca514861bfe079b03915bc793e00114f12bb81c1d7c7c0c359f2")
      public fun successNextStep(successNextStep: DialogStateProperty.Builder.() -> Unit)

      public fun successResponse(successResponse: IResolvable)

      public fun successResponse(successResponse: ResponseSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("de9be0044f2964ff57e7660837e4bde93b509b39678def1a5b0f124b88afc99c")
      public fun successResponse(successResponse: ResponseSpecificationProperty.Builder.() -> Unit)

      public fun timeoutConditional(timeoutConditional: IResolvable)

      public fun timeoutConditional(timeoutConditional: ConditionalSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e32c1d98a3cc912cdb6b9d575535fd4928866b0cc791bb4f78d5437f2dc229a4")
      public
          fun timeoutConditional(timeoutConditional: ConditionalSpecificationProperty.Builder.() -> Unit)

      public fun timeoutNextStep(timeoutNextStep: IResolvable)

      public fun timeoutNextStep(timeoutNextStep: DialogStateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21c2a6c18595b0accdc91d97af7e561bed26eeb647d6b277b7b48201c119a96d")
      public fun timeoutNextStep(timeoutNextStep: DialogStateProperty.Builder.() -> Unit)

      public fun timeoutResponse(timeoutResponse: IResolvable)

      public fun timeoutResponse(timeoutResponse: ResponseSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aa27c7ee7bfbbf27abb0484818b27d5407682cfca7d7011a5914fa91583d9429")
      public fun timeoutResponse(timeoutResponse: ResponseSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.PostDialogCodeHookInvocationSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBot.PostDialogCodeHookInvocationSpecificationProperty.builder()

      override fun failureConditional(failureConditional: IResolvable) {
        cdkBuilder.failureConditional(failureConditional.let(IResolvable::unwrap))
      }

      override fun failureConditional(failureConditional: ConditionalSpecificationProperty) {
        cdkBuilder.failureConditional(failureConditional.let(ConditionalSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a31debbf13eaccf61af0ae05dec5876c7102629b14b86a37324cfb2aa8004eac")
      override
          fun failureConditional(failureConditional: ConditionalSpecificationProperty.Builder.() -> Unit):
          Unit = failureConditional(ConditionalSpecificationProperty(failureConditional))

      override fun failureNextStep(failureNextStep: IResolvable) {
        cdkBuilder.failureNextStep(failureNextStep.let(IResolvable::unwrap))
      }

      override fun failureNextStep(failureNextStep: DialogStateProperty) {
        cdkBuilder.failureNextStep(failureNextStep.let(DialogStateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c76e3c6d416c507c1565ca27669610b4de0c2c9ea7c496501b30bc5bd42df3d0")
      override fun failureNextStep(failureNextStep: DialogStateProperty.Builder.() -> Unit): Unit =
          failureNextStep(DialogStateProperty(failureNextStep))

      override fun failureResponse(failureResponse: IResolvable) {
        cdkBuilder.failureResponse(failureResponse.let(IResolvable::unwrap))
      }

      override fun failureResponse(failureResponse: ResponseSpecificationProperty) {
        cdkBuilder.failureResponse(failureResponse.let(ResponseSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d46d0ef9580a382564eeccce208df2906bda1d480bba65cb04aa04dc3f7d7b08")
      override
          fun failureResponse(failureResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = failureResponse(ResponseSpecificationProperty(failureResponse))

      override fun successConditional(successConditional: IResolvable) {
        cdkBuilder.successConditional(successConditional.let(IResolvable::unwrap))
      }

      override fun successConditional(successConditional: ConditionalSpecificationProperty) {
        cdkBuilder.successConditional(successConditional.let(ConditionalSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8652ce061e95c444bc471ea830ede868e6eb6a215c33e2034cb6c0317e00ac06")
      override
          fun successConditional(successConditional: ConditionalSpecificationProperty.Builder.() -> Unit):
          Unit = successConditional(ConditionalSpecificationProperty(successConditional))

      override fun successNextStep(successNextStep: IResolvable) {
        cdkBuilder.successNextStep(successNextStep.let(IResolvable::unwrap))
      }

      override fun successNextStep(successNextStep: DialogStateProperty) {
        cdkBuilder.successNextStep(successNextStep.let(DialogStateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("604288558462ca514861bfe079b03915bc793e00114f12bb81c1d7c7c0c359f2")
      override fun successNextStep(successNextStep: DialogStateProperty.Builder.() -> Unit): Unit =
          successNextStep(DialogStateProperty(successNextStep))

      override fun successResponse(successResponse: IResolvable) {
        cdkBuilder.successResponse(successResponse.let(IResolvable::unwrap))
      }

      override fun successResponse(successResponse: ResponseSpecificationProperty) {
        cdkBuilder.successResponse(successResponse.let(ResponseSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("de9be0044f2964ff57e7660837e4bde93b509b39678def1a5b0f124b88afc99c")
      override
          fun successResponse(successResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = successResponse(ResponseSpecificationProperty(successResponse))

      override fun timeoutConditional(timeoutConditional: IResolvable) {
        cdkBuilder.timeoutConditional(timeoutConditional.let(IResolvable::unwrap))
      }

      override fun timeoutConditional(timeoutConditional: ConditionalSpecificationProperty) {
        cdkBuilder.timeoutConditional(timeoutConditional.let(ConditionalSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e32c1d98a3cc912cdb6b9d575535fd4928866b0cc791bb4f78d5437f2dc229a4")
      override
          fun timeoutConditional(timeoutConditional: ConditionalSpecificationProperty.Builder.() -> Unit):
          Unit = timeoutConditional(ConditionalSpecificationProperty(timeoutConditional))

      override fun timeoutNextStep(timeoutNextStep: IResolvable) {
        cdkBuilder.timeoutNextStep(timeoutNextStep.let(IResolvable::unwrap))
      }

      override fun timeoutNextStep(timeoutNextStep: DialogStateProperty) {
        cdkBuilder.timeoutNextStep(timeoutNextStep.let(DialogStateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21c2a6c18595b0accdc91d97af7e561bed26eeb647d6b277b7b48201c119a96d")
      override fun timeoutNextStep(timeoutNextStep: DialogStateProperty.Builder.() -> Unit): Unit =
          timeoutNextStep(DialogStateProperty(timeoutNextStep))

      override fun timeoutResponse(timeoutResponse: IResolvable) {
        cdkBuilder.timeoutResponse(timeoutResponse.let(IResolvable::unwrap))
      }

      override fun timeoutResponse(timeoutResponse: ResponseSpecificationProperty) {
        cdkBuilder.timeoutResponse(timeoutResponse.let(ResponseSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aa27c7ee7bfbbf27abb0484818b27d5407682cfca7d7011a5914fa91583d9429")
      override
          fun timeoutResponse(timeoutResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = timeoutResponse(ResponseSpecificationProperty(timeoutResponse))

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.PostDialogCodeHookInvocationSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.PostDialogCodeHookInvocationSpecificationProperty,
    ) : PostDialogCodeHookInvocationSpecificationProperty {
      override fun failureConditional(): Any? = unwrap(this).getFailureConditional()

      override fun failureNextStep(): Any? = unwrap(this).getFailureNextStep()

      override fun failureResponse(): Any? = unwrap(this).getFailureResponse()

      override fun successConditional(): Any? = unwrap(this).getSuccessConditional()

      override fun successNextStep(): Any? = unwrap(this).getSuccessNextStep()

      override fun successResponse(): Any? = unwrap(this).getSuccessResponse()

      override fun timeoutConditional(): Any? = unwrap(this).getTimeoutConditional()

      override fun timeoutNextStep(): Any? = unwrap(this).getTimeoutNextStep()

      override fun timeoutResponse(): Any? = unwrap(this).getTimeoutResponse()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PostDialogCodeHookInvocationSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.PostDialogCodeHookInvocationSpecificationProperty):
          PostDialogCodeHookInvocationSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PostDialogCodeHookInvocationSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.PostDialogCodeHookInvocationSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SSMLMessageProperty {
    public fun `value`(): String

    public interface Builder {
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBot.SSMLMessageProperty.Builder
          = software.amazon.awscdk.services.lex.CfnBot.SSMLMessageProperty.builder()

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.SSMLMessageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.SSMLMessageProperty,
    ) : SSMLMessageProperty {
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SSMLMessageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SSMLMessageProperty):
          SSMLMessageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SSMLMessageProperty):
          software.amazon.awscdk.services.lex.CfnBot.SSMLMessageProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface GrammarSlotTypeSourceProperty {
    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    public fun s3BucketName(): String

    public fun s3ObjectKey(): String

    public interface Builder {
      public fun kmsKeyArn(kmsKeyArn: String)

      public fun s3BucketName(s3BucketName: String)

      public fun s3ObjectKey(s3ObjectKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.GrammarSlotTypeSourceProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.GrammarSlotTypeSourceProperty.builder()

      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      override fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
      }

      override fun s3ObjectKey(s3ObjectKey: String) {
        cdkBuilder.s3ObjectKey(s3ObjectKey)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.GrammarSlotTypeSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.GrammarSlotTypeSourceProperty,
    ) : GrammarSlotTypeSourceProperty {
      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

      override fun s3BucketName(): String = unwrap(this).getS3BucketName()

      override fun s3ObjectKey(): String = unwrap(this).getS3ObjectKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GrammarSlotTypeSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.GrammarSlotTypeSourceProperty):
          GrammarSlotTypeSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GrammarSlotTypeSourceProperty):
          software.amazon.awscdk.services.lex.CfnBot.GrammarSlotTypeSourceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ImageResponseCardProperty {
    public fun buttons(): Any? = unwrap(this).getButtons()

    public fun imageUrl(): String? = unwrap(this).getImageUrl()

    public fun subtitle(): String? = unwrap(this).getSubtitle()

    public fun title(): String

    public interface Builder {
      public fun buttons(buttons: IResolvable)

      public fun buttons(buttons: List<Any>)

      public fun imageUrl(imageUrl: String)

      public fun subtitle(subtitle: String)

      public fun title(title: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.ImageResponseCardProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.ImageResponseCardProperty.builder()

      override fun buttons(buttons: IResolvable) {
        cdkBuilder.buttons(buttons.let(IResolvable::unwrap))
      }

      override fun buttons(buttons: List<Any>) {
        cdkBuilder.buttons(buttons)
      }

      override fun imageUrl(imageUrl: String) {
        cdkBuilder.imageUrl(imageUrl)
      }

      override fun subtitle(subtitle: String) {
        cdkBuilder.subtitle(subtitle)
      }

      override fun title(title: String) {
        cdkBuilder.title(title)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.ImageResponseCardProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.ImageResponseCardProperty,
    ) : ImageResponseCardProperty {
      override fun buttons(): Any? = unwrap(this).getButtons()

      override fun imageUrl(): String? = unwrap(this).getImageUrl()

      override fun subtitle(): String? = unwrap(this).getSubtitle()

      override fun title(): String = unwrap(this).getTitle()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ImageResponseCardProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.ImageResponseCardProperty):
          ImageResponseCardProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageResponseCardProperty):
          software.amazon.awscdk.services.lex.CfnBot.ImageResponseCardProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface StillWaitingResponseSpecificationProperty {
    public fun allowInterrupt(): Any? = unwrap(this).getAllowInterrupt()

    public fun frequencyInSeconds(): Number

    public fun messageGroupsList(): Any

    public fun timeoutInSeconds(): Number

    public interface Builder {
      public fun allowInterrupt(allowInterrupt: Boolean)

      public fun allowInterrupt(allowInterrupt: IResolvable)

      public fun frequencyInSeconds(frequencyInSeconds: Number)

      public fun messageGroupsList(messageGroupsList: IResolvable)

      public fun messageGroupsList(messageGroupsList: List<Any>)

      public fun timeoutInSeconds(timeoutInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.StillWaitingResponseSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBot.StillWaitingResponseSpecificationProperty.builder()

      override fun allowInterrupt(allowInterrupt: Boolean) {
        cdkBuilder.allowInterrupt(allowInterrupt)
      }

      override fun allowInterrupt(allowInterrupt: IResolvable) {
        cdkBuilder.allowInterrupt(allowInterrupt.let(IResolvable::unwrap))
      }

      override fun frequencyInSeconds(frequencyInSeconds: Number) {
        cdkBuilder.frequencyInSeconds(frequencyInSeconds)
      }

      override fun messageGroupsList(messageGroupsList: IResolvable) {
        cdkBuilder.messageGroupsList(messageGroupsList.let(IResolvable::unwrap))
      }

      override fun messageGroupsList(messageGroupsList: List<Any>) {
        cdkBuilder.messageGroupsList(messageGroupsList)
      }

      override fun timeoutInSeconds(timeoutInSeconds: Number) {
        cdkBuilder.timeoutInSeconds(timeoutInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.StillWaitingResponseSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.StillWaitingResponseSpecificationProperty,
    ) : StillWaitingResponseSpecificationProperty {
      override fun allowInterrupt(): Any? = unwrap(this).getAllowInterrupt()

      override fun frequencyInSeconds(): Number = unwrap(this).getFrequencyInSeconds()

      override fun messageGroupsList(): Any = unwrap(this).getMessageGroupsList()

      override fun timeoutInSeconds(): Number = unwrap(this).getTimeoutInSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          StillWaitingResponseSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.StillWaitingResponseSpecificationProperty):
          StillWaitingResponseSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StillWaitingResponseSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.StillWaitingResponseSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TestBotAliasSettingsProperty {
    public fun botAliasLocaleSettings(): Any? = unwrap(this).getBotAliasLocaleSettings()

    public fun conversationLogSettings(): Any? = unwrap(this).getConversationLogSettings()

    public fun description(): String? = unwrap(this).getDescription()

    public fun sentimentAnalysisSettings(): Any? = unwrap(this).getSentimentAnalysisSettings()

    public interface Builder {
      public fun botAliasLocaleSettings(botAliasLocaleSettings: IResolvable)

      public fun botAliasLocaleSettings(botAliasLocaleSettings: List<Any>)

      public fun conversationLogSettings(conversationLogSettings: IResolvable)

      public fun conversationLogSettings(conversationLogSettings: ConversationLogSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dfb3fdc687ddb49dec082c9376e4ede1bee806399ccc3b22e8166a011a2c1b07")
      public
          fun conversationLogSettings(conversationLogSettings: ConversationLogSettingsProperty.Builder.() -> Unit)

      public fun description(description: String)

      public fun sentimentAnalysisSettings(sentimentAnalysisSettings: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.TestBotAliasSettingsProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.TestBotAliasSettingsProperty.builder()

      override fun botAliasLocaleSettings(botAliasLocaleSettings: IResolvable) {
        cdkBuilder.botAliasLocaleSettings(botAliasLocaleSettings.let(IResolvable::unwrap))
      }

      override fun botAliasLocaleSettings(botAliasLocaleSettings: List<Any>) {
        cdkBuilder.botAliasLocaleSettings(botAliasLocaleSettings)
      }

      override fun conversationLogSettings(conversationLogSettings: IResolvable) {
        cdkBuilder.conversationLogSettings(conversationLogSettings.let(IResolvable::unwrap))
      }

      override
          fun conversationLogSettings(conversationLogSettings: ConversationLogSettingsProperty) {
        cdkBuilder.conversationLogSettings(conversationLogSettings.let(ConversationLogSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dfb3fdc687ddb49dec082c9376e4ede1bee806399ccc3b22e8166a011a2c1b07")
      override
          fun conversationLogSettings(conversationLogSettings: ConversationLogSettingsProperty.Builder.() -> Unit):
          Unit = conversationLogSettings(ConversationLogSettingsProperty(conversationLogSettings))

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun sentimentAnalysisSettings(sentimentAnalysisSettings: Any) {
        cdkBuilder.sentimentAnalysisSettings(sentimentAnalysisSettings)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.TestBotAliasSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.TestBotAliasSettingsProperty,
    ) : TestBotAliasSettingsProperty {
      override fun botAliasLocaleSettings(): Any? = unwrap(this).getBotAliasLocaleSettings()

      override fun conversationLogSettings(): Any? = unwrap(this).getConversationLogSettings()

      override fun description(): String? = unwrap(this).getDescription()

      override fun sentimentAnalysisSettings(): Any? = unwrap(this).getSentimentAnalysisSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TestBotAliasSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.TestBotAliasSettingsProperty):
          TestBotAliasSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TestBotAliasSettingsProperty):
          software.amazon.awscdk.services.lex.CfnBot.TestBotAliasSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DefaultConditionalBranchProperty {
    public fun nextStep(): Any? = unwrap(this).getNextStep()

    public fun response(): Any? = unwrap(this).getResponse()

    public interface Builder {
      public fun nextStep(nextStep: IResolvable)

      public fun nextStep(nextStep: DialogStateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("89aceef262d7ed6df781299b5d6cad4eecf33f3ecd8db033597be3cbf6a902e9")
      public fun nextStep(nextStep: DialogStateProperty.Builder.() -> Unit)

      public fun response(response: IResolvable)

      public fun response(response: ResponseSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("985db97b61adca9413449a7b508b3d0e34cdfe8e12320cbb6ad08b2280597470")
      public fun response(response: ResponseSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.DefaultConditionalBranchProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.DefaultConditionalBranchProperty.builder()

      override fun nextStep(nextStep: IResolvable) {
        cdkBuilder.nextStep(nextStep.let(IResolvable::unwrap))
      }

      override fun nextStep(nextStep: DialogStateProperty) {
        cdkBuilder.nextStep(nextStep.let(DialogStateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("89aceef262d7ed6df781299b5d6cad4eecf33f3ecd8db033597be3cbf6a902e9")
      override fun nextStep(nextStep: DialogStateProperty.Builder.() -> Unit): Unit =
          nextStep(DialogStateProperty(nextStep))

      override fun response(response: IResolvable) {
        cdkBuilder.response(response.let(IResolvable::unwrap))
      }

      override fun response(response: ResponseSpecificationProperty) {
        cdkBuilder.response(response.let(ResponseSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("985db97b61adca9413449a7b508b3d0e34cdfe8e12320cbb6ad08b2280597470")
      override fun response(response: ResponseSpecificationProperty.Builder.() -> Unit): Unit =
          response(ResponseSpecificationProperty(response))

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.DefaultConditionalBranchProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.DefaultConditionalBranchProperty,
    ) : DefaultConditionalBranchProperty {
      override fun nextStep(): Any? = unwrap(this).getNextStep()

      override fun response(): Any? = unwrap(this).getResponse()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DefaultConditionalBranchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.DefaultConditionalBranchProperty):
          DefaultConditionalBranchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultConditionalBranchProperty):
          software.amazon.awscdk.services.lex.CfnBot.DefaultConditionalBranchProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface IntentOverrideProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun slots(): Any? = unwrap(this).getSlots()

    public interface Builder {
      public fun name(name: String)

      public fun slots(slots: IResolvable)

      public fun slots(slots: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.IntentOverrideProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.IntentOverrideProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun slots(slots: IResolvable) {
        cdkBuilder.slots(slots.let(IResolvable::unwrap))
      }

      override fun slots(slots: List<Any>) {
        cdkBuilder.slots(slots)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.IntentOverrideProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.IntentOverrideProperty,
    ) : IntentOverrideProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun slots(): Any? = unwrap(this).getSlots()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IntentOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.IntentOverrideProperty):
          IntentOverrideProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntentOverrideProperty):
          software.amazon.awscdk.services.lex.CfnBot.IntentOverrideProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AdvancedRecognitionSettingProperty {
    public fun audioRecognitionStrategy(): String? = unwrap(this).getAudioRecognitionStrategy()

    public interface Builder {
      public fun audioRecognitionStrategy(audioRecognitionStrategy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.AdvancedRecognitionSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.AdvancedRecognitionSettingProperty.builder()

      override fun audioRecognitionStrategy(audioRecognitionStrategy: String) {
        cdkBuilder.audioRecognitionStrategy(audioRecognitionStrategy)
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.AdvancedRecognitionSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.AdvancedRecognitionSettingProperty,
    ) : AdvancedRecognitionSettingProperty {
      override fun audioRecognitionStrategy(): String? = unwrap(this).getAudioRecognitionStrategy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AdvancedRecognitionSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.AdvancedRecognitionSettingProperty):
          AdvancedRecognitionSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdvancedRecognitionSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.AdvancedRecognitionSettingProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface DTMFSpecificationProperty {
    public fun deletionCharacter(): String

    public fun endCharacter(): String

    public fun endTimeoutMs(): Number

    public fun maxLength(): Number

    public interface Builder {
      public fun deletionCharacter(deletionCharacter: String)

      public fun endCharacter(endCharacter: String)

      public fun endTimeoutMs(endTimeoutMs: Number)

      public fun maxLength(maxLength: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.DTMFSpecificationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.DTMFSpecificationProperty.builder()

      override fun deletionCharacter(deletionCharacter: String) {
        cdkBuilder.deletionCharacter(deletionCharacter)
      }

      override fun endCharacter(endCharacter: String) {
        cdkBuilder.endCharacter(endCharacter)
      }

      override fun endTimeoutMs(endTimeoutMs: Number) {
        cdkBuilder.endTimeoutMs(endTimeoutMs)
      }

      override fun maxLength(maxLength: Number) {
        cdkBuilder.maxLength(maxLength)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.DTMFSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.DTMFSpecificationProperty,
    ) : DTMFSpecificationProperty {
      override fun deletionCharacter(): String = unwrap(this).getDeletionCharacter()

      override fun endCharacter(): String = unwrap(this).getEndCharacter()

      override fun endTimeoutMs(): Number = unwrap(this).getEndTimeoutMs()

      override fun maxLength(): Number = unwrap(this).getMaxLength()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DTMFSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.DTMFSpecificationProperty):
          DTMFSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DTMFSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.DTMFSpecificationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FulfillmentUpdatesSpecificationProperty {
    public fun active(): Any

    public fun startResponse(): Any? = unwrap(this).getStartResponse()

    public fun timeoutInSeconds(): Number? = unwrap(this).getTimeoutInSeconds()

    public fun updateResponse(): Any? = unwrap(this).getUpdateResponse()

    public interface Builder {
      public fun active(active: Boolean)

      public fun active(active: IResolvable)

      public fun startResponse(startResponse: IResolvable)

      public fun startResponse(startResponse: FulfillmentStartResponseSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0bbbba34a3a2f02503e9d10af52d5190fe61dc5d0d8064bad1b4a5650e8c38bc")
      public
          fun startResponse(startResponse: FulfillmentStartResponseSpecificationProperty.Builder.() -> Unit)

      public fun timeoutInSeconds(timeoutInSeconds: Number)

      public fun updateResponse(updateResponse: IResolvable)

      public fun updateResponse(updateResponse: FulfillmentUpdateResponseSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("013c8600cd73879701c843cf269878f6c1a33f3be0bdddb7d13adfa7d7391a18")
      public
          fun updateResponse(updateResponse: FulfillmentUpdateResponseSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentUpdatesSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentUpdatesSpecificationProperty.builder()

      override fun active(active: Boolean) {
        cdkBuilder.active(active)
      }

      override fun active(active: IResolvable) {
        cdkBuilder.active(active.let(IResolvable::unwrap))
      }

      override fun startResponse(startResponse: IResolvable) {
        cdkBuilder.startResponse(startResponse.let(IResolvable::unwrap))
      }

      override fun startResponse(startResponse: FulfillmentStartResponseSpecificationProperty) {
        cdkBuilder.startResponse(startResponse.let(FulfillmentStartResponseSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0bbbba34a3a2f02503e9d10af52d5190fe61dc5d0d8064bad1b4a5650e8c38bc")
      override
          fun startResponse(startResponse: FulfillmentStartResponseSpecificationProperty.Builder.() -> Unit):
          Unit = startResponse(FulfillmentStartResponseSpecificationProperty(startResponse))

      override fun timeoutInSeconds(timeoutInSeconds: Number) {
        cdkBuilder.timeoutInSeconds(timeoutInSeconds)
      }

      override fun updateResponse(updateResponse: IResolvable) {
        cdkBuilder.updateResponse(updateResponse.let(IResolvable::unwrap))
      }

      override fun updateResponse(updateResponse: FulfillmentUpdateResponseSpecificationProperty) {
        cdkBuilder.updateResponse(updateResponse.let(FulfillmentUpdateResponseSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("013c8600cd73879701c843cf269878f6c1a33f3be0bdddb7d13adfa7d7391a18")
      override
          fun updateResponse(updateResponse: FulfillmentUpdateResponseSpecificationProperty.Builder.() -> Unit):
          Unit = updateResponse(FulfillmentUpdateResponseSpecificationProperty(updateResponse))

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentUpdatesSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentUpdatesSpecificationProperty,
    ) : FulfillmentUpdatesSpecificationProperty {
      override fun active(): Any = unwrap(this).getActive()

      override fun startResponse(): Any? = unwrap(this).getStartResponse()

      override fun timeoutInSeconds(): Number? = unwrap(this).getTimeoutInSeconds()

      override fun updateResponse(): Any? = unwrap(this).getUpdateResponse()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          FulfillmentUpdatesSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.FulfillmentUpdatesSpecificationProperty):
          FulfillmentUpdatesSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FulfillmentUpdatesSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentUpdatesSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SlotTypeProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun externalSourceSetting(): Any? = unwrap(this).getExternalSourceSetting()

    public fun name(): String

    public fun parentSlotTypeSignature(): String? = unwrap(this).getParentSlotTypeSignature()

    public fun slotTypeValues(): Any? = unwrap(this).getSlotTypeValues()

    public fun valueSelectionSetting(): Any? = unwrap(this).getValueSelectionSetting()

    public interface Builder {
      public fun description(description: String)

      public fun externalSourceSetting(externalSourceSetting: IResolvable)

      public fun externalSourceSetting(externalSourceSetting: ExternalSourceSettingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bae3b0ec146c1b40c028a7363c456b512d163d6b3efef175d3c49ad9560432d7")
      public
          fun externalSourceSetting(externalSourceSetting: ExternalSourceSettingProperty.Builder.() -> Unit)

      public fun name(name: String)

      public fun parentSlotTypeSignature(parentSlotTypeSignature: String)

      public fun slotTypeValues(slotTypeValues: IResolvable)

      public fun slotTypeValues(slotTypeValues: List<Any>)

      public fun valueSelectionSetting(valueSelectionSetting: IResolvable)

      public fun valueSelectionSetting(valueSelectionSetting: SlotValueSelectionSettingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1109d72ed590bbb19efba3a53e64b0f0c7ec42b4ca830c36126979421aec58a8")
      public
          fun valueSelectionSetting(valueSelectionSetting: SlotValueSelectionSettingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBot.SlotTypeProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SlotTypeProperty.builder()

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun externalSourceSetting(externalSourceSetting: IResolvable) {
        cdkBuilder.externalSourceSetting(externalSourceSetting.let(IResolvable::unwrap))
      }

      override fun externalSourceSetting(externalSourceSetting: ExternalSourceSettingProperty) {
        cdkBuilder.externalSourceSetting(externalSourceSetting.let(ExternalSourceSettingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bae3b0ec146c1b40c028a7363c456b512d163d6b3efef175d3c49ad9560432d7")
      override
          fun externalSourceSetting(externalSourceSetting: ExternalSourceSettingProperty.Builder.() -> Unit):
          Unit = externalSourceSetting(ExternalSourceSettingProperty(externalSourceSetting))

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun parentSlotTypeSignature(parentSlotTypeSignature: String) {
        cdkBuilder.parentSlotTypeSignature(parentSlotTypeSignature)
      }

      override fun slotTypeValues(slotTypeValues: IResolvable) {
        cdkBuilder.slotTypeValues(slotTypeValues.let(IResolvable::unwrap))
      }

      override fun slotTypeValues(slotTypeValues: List<Any>) {
        cdkBuilder.slotTypeValues(slotTypeValues)
      }

      override fun valueSelectionSetting(valueSelectionSetting: IResolvable) {
        cdkBuilder.valueSelectionSetting(valueSelectionSetting.let(IResolvable::unwrap))
      }

      override fun valueSelectionSetting(valueSelectionSetting: SlotValueSelectionSettingProperty) {
        cdkBuilder.valueSelectionSetting(valueSelectionSetting.let(SlotValueSelectionSettingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1109d72ed590bbb19efba3a53e64b0f0c7ec42b4ca830c36126979421aec58a8")
      override
          fun valueSelectionSetting(valueSelectionSetting: SlotValueSelectionSettingProperty.Builder.() -> Unit):
          Unit = valueSelectionSetting(SlotValueSelectionSettingProperty(valueSelectionSetting))

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.SlotTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotTypeProperty,
    ) : SlotTypeProperty {
      override fun description(): String? = unwrap(this).getDescription()

      override fun externalSourceSetting(): Any? = unwrap(this).getExternalSourceSetting()

      override fun name(): String = unwrap(this).getName()

      override fun parentSlotTypeSignature(): String? = unwrap(this).getParentSlotTypeSignature()

      override fun slotTypeValues(): Any? = unwrap(this).getSlotTypeValues()

      override fun valueSelectionSetting(): Any? = unwrap(this).getValueSelectionSetting()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SlotTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotTypeProperty):
          SlotTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlotTypeProperty):
          software.amazon.awscdk.services.lex.CfnBot.SlotTypeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FulfillmentStartResponseSpecificationProperty {
    public fun allowInterrupt(): Any? = unwrap(this).getAllowInterrupt()

    public fun delayInSeconds(): Number

    public fun messageGroups(): Any

    public interface Builder {
      public fun allowInterrupt(allowInterrupt: Boolean)

      public fun allowInterrupt(allowInterrupt: IResolvable)

      public fun delayInSeconds(delayInSeconds: Number)

      public fun messageGroups(messageGroups: IResolvable)

      public fun messageGroups(messageGroups: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentStartResponseSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentStartResponseSpecificationProperty.builder()

      override fun allowInterrupt(allowInterrupt: Boolean) {
        cdkBuilder.allowInterrupt(allowInterrupt)
      }

      override fun allowInterrupt(allowInterrupt: IResolvable) {
        cdkBuilder.allowInterrupt(allowInterrupt.let(IResolvable::unwrap))
      }

      override fun delayInSeconds(delayInSeconds: Number) {
        cdkBuilder.delayInSeconds(delayInSeconds)
      }

      override fun messageGroups(messageGroups: IResolvable) {
        cdkBuilder.messageGroups(messageGroups.let(IResolvable::unwrap))
      }

      override fun messageGroups(messageGroups: List<Any>) {
        cdkBuilder.messageGroups(messageGroups)
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentStartResponseSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentStartResponseSpecificationProperty,
    ) : FulfillmentStartResponseSpecificationProperty {
      override fun allowInterrupt(): Any? = unwrap(this).getAllowInterrupt()

      override fun delayInSeconds(): Number = unwrap(this).getDelayInSeconds()

      override fun messageGroups(): Any = unwrap(this).getMessageGroups()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          FulfillmentStartResponseSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.FulfillmentStartResponseSpecificationProperty):
          FulfillmentStartResponseSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FulfillmentStartResponseSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentStartResponseSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DialogCodeHookInvocationSettingProperty {
    public fun enableCodeHookInvocation(): Any

    public fun invocationLabel(): String? = unwrap(this).getInvocationLabel()

    public fun isActive(): Any

    public fun postCodeHookSpecification(): Any

    public interface Builder {
      public fun enableCodeHookInvocation(enableCodeHookInvocation: Boolean)

      public fun enableCodeHookInvocation(enableCodeHookInvocation: IResolvable)

      public fun invocationLabel(invocationLabel: String)

      public fun isActive(isActive: Boolean)

      public fun isActive(isActive: IResolvable)

      public fun postCodeHookSpecification(postCodeHookSpecification: IResolvable)

      public
          fun postCodeHookSpecification(postCodeHookSpecification: PostDialogCodeHookInvocationSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f548bd943f8161a7481745dffb9e4bc3046823882cb7e2ff881a1e8ee60d24f7")
      public
          fun postCodeHookSpecification(postCodeHookSpecification: PostDialogCodeHookInvocationSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.DialogCodeHookInvocationSettingProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBot.DialogCodeHookInvocationSettingProperty.builder()

      override fun enableCodeHookInvocation(enableCodeHookInvocation: Boolean) {
        cdkBuilder.enableCodeHookInvocation(enableCodeHookInvocation)
      }

      override fun enableCodeHookInvocation(enableCodeHookInvocation: IResolvable) {
        cdkBuilder.enableCodeHookInvocation(enableCodeHookInvocation.let(IResolvable::unwrap))
      }

      override fun invocationLabel(invocationLabel: String) {
        cdkBuilder.invocationLabel(invocationLabel)
      }

      override fun isActive(isActive: Boolean) {
        cdkBuilder.isActive(isActive)
      }

      override fun isActive(isActive: IResolvable) {
        cdkBuilder.isActive(isActive.let(IResolvable::unwrap))
      }

      override fun postCodeHookSpecification(postCodeHookSpecification: IResolvable) {
        cdkBuilder.postCodeHookSpecification(postCodeHookSpecification.let(IResolvable::unwrap))
      }

      override
          fun postCodeHookSpecification(postCodeHookSpecification: PostDialogCodeHookInvocationSpecificationProperty) {
        cdkBuilder.postCodeHookSpecification(postCodeHookSpecification.let(PostDialogCodeHookInvocationSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f548bd943f8161a7481745dffb9e4bc3046823882cb7e2ff881a1e8ee60d24f7")
      override
          fun postCodeHookSpecification(postCodeHookSpecification: PostDialogCodeHookInvocationSpecificationProperty.Builder.() -> Unit):
          Unit =
          postCodeHookSpecification(PostDialogCodeHookInvocationSpecificationProperty(postCodeHookSpecification))

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.DialogCodeHookInvocationSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.DialogCodeHookInvocationSettingProperty,
    ) : DialogCodeHookInvocationSettingProperty {
      override fun enableCodeHookInvocation(): Any = unwrap(this).getEnableCodeHookInvocation()

      override fun invocationLabel(): String? = unwrap(this).getInvocationLabel()

      override fun isActive(): Any = unwrap(this).getIsActive()

      override fun postCodeHookSpecification(): Any = unwrap(this).getPostCodeHookSpecification()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DialogCodeHookInvocationSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.DialogCodeHookInvocationSettingProperty):
          DialogCodeHookInvocationSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DialogCodeHookInvocationSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.DialogCodeHookInvocationSettingProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DialogStateProperty {
    public fun dialogAction(): Any? = unwrap(this).getDialogAction()

    public fun intent(): Any? = unwrap(this).getIntent()

    public fun sessionAttributes(): Any? = unwrap(this).getSessionAttributes()

    public interface Builder {
      public fun dialogAction(dialogAction: IResolvable)

      public fun dialogAction(dialogAction: DialogActionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4fcdebada112a2ccb01e3cd81ec6cf1596a3db4638eae1d4e90277967c9a2b3")
      public fun dialogAction(dialogAction: DialogActionProperty.Builder.() -> Unit)

      public fun intent(intent: IResolvable)

      public fun intent(intent: IntentOverrideProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eb047b798c892c9847a9d7b1a51ba4d0d6158868fa16f29a479f8184759fc5d7")
      public fun intent(intent: IntentOverrideProperty.Builder.() -> Unit)

      public fun sessionAttributes(sessionAttributes: IResolvable)

      public fun sessionAttributes(sessionAttributes: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBot.DialogStateProperty.Builder
          = software.amazon.awscdk.services.lex.CfnBot.DialogStateProperty.builder()

      override fun dialogAction(dialogAction: IResolvable) {
        cdkBuilder.dialogAction(dialogAction.let(IResolvable::unwrap))
      }

      override fun dialogAction(dialogAction: DialogActionProperty) {
        cdkBuilder.dialogAction(dialogAction.let(DialogActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4fcdebada112a2ccb01e3cd81ec6cf1596a3db4638eae1d4e90277967c9a2b3")
      override fun dialogAction(dialogAction: DialogActionProperty.Builder.() -> Unit): Unit =
          dialogAction(DialogActionProperty(dialogAction))

      override fun intent(intent: IResolvable) {
        cdkBuilder.intent(intent.let(IResolvable::unwrap))
      }

      override fun intent(intent: IntentOverrideProperty) {
        cdkBuilder.intent(intent.let(IntentOverrideProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eb047b798c892c9847a9d7b1a51ba4d0d6158868fa16f29a479f8184759fc5d7")
      override fun intent(intent: IntentOverrideProperty.Builder.() -> Unit): Unit =
          intent(IntentOverrideProperty(intent))

      override fun sessionAttributes(sessionAttributes: IResolvable) {
        cdkBuilder.sessionAttributes(sessionAttributes.let(IResolvable::unwrap))
      }

      override fun sessionAttributes(sessionAttributes: List<Any>) {
        cdkBuilder.sessionAttributes(sessionAttributes)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.DialogStateProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.DialogStateProperty,
    ) : DialogStateProperty {
      override fun dialogAction(): Any? = unwrap(this).getDialogAction()

      override fun intent(): Any? = unwrap(this).getIntent()

      override fun sessionAttributes(): Any? = unwrap(this).getSessionAttributes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DialogStateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.DialogStateProperty):
          DialogStateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DialogStateProperty):
          software.amazon.awscdk.services.lex.CfnBot.DialogStateProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface S3LocationProperty {
    public fun s3Bucket(): String

    public fun s3ObjectKey(): String

    public fun s3ObjectVersion(): String? = unwrap(this).getS3ObjectVersion()

    public interface Builder {
      public fun s3Bucket(s3Bucket: String)

      public fun s3ObjectKey(s3ObjectKey: String)

      public fun s3ObjectVersion(s3ObjectVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBot.S3LocationProperty.Builder
          = software.amazon.awscdk.services.lex.CfnBot.S3LocationProperty.builder()

      override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      override fun s3ObjectKey(s3ObjectKey: String) {
        cdkBuilder.s3ObjectKey(s3ObjectKey)
      }

      override fun s3ObjectVersion(s3ObjectVersion: String) {
        cdkBuilder.s3ObjectVersion(s3ObjectVersion)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.S3LocationProperty,
    ) : S3LocationProperty {
      override fun s3Bucket(): String = unwrap(this).getS3Bucket()

      override fun s3ObjectKey(): String = unwrap(this).getS3ObjectKey()

      override fun s3ObjectVersion(): String? = unwrap(this).getS3ObjectVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.S3LocationProperty):
          S3LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.lex.CfnBot.S3LocationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SlotValueProperty {
    public fun interpretedValue(): String? = unwrap(this).getInterpretedValue()

    public interface Builder {
      public fun interpretedValue(interpretedValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBot.SlotValueProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SlotValueProperty.builder()

      override fun interpretedValue(interpretedValue: String) {
        cdkBuilder.interpretedValue(interpretedValue)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.SlotValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotValueProperty,
    ) : SlotValueProperty {
      override fun interpretedValue(): String? = unwrap(this).getInterpretedValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SlotValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotValueProperty):
          SlotValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlotValueProperty):
          software.amazon.awscdk.services.lex.CfnBot.SlotValueProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PostFulfillmentStatusSpecificationProperty {
    public fun failureConditional(): Any? = unwrap(this).getFailureConditional()

    public fun failureNextStep(): Any? = unwrap(this).getFailureNextStep()

    public fun failureResponse(): Any? = unwrap(this).getFailureResponse()

    public fun successConditional(): Any? = unwrap(this).getSuccessConditional()

    public fun successNextStep(): Any? = unwrap(this).getSuccessNextStep()

    public fun successResponse(): Any? = unwrap(this).getSuccessResponse()

    public fun timeoutConditional(): Any? = unwrap(this).getTimeoutConditional()

    public fun timeoutNextStep(): Any? = unwrap(this).getTimeoutNextStep()

    public fun timeoutResponse(): Any? = unwrap(this).getTimeoutResponse()

    public interface Builder {
      public fun failureConditional(failureConditional: IResolvable)

      public fun failureConditional(failureConditional: ConditionalSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b9f2c2fa3193936c7d04b9f7bb2ec26f2e1da5813671965f7a427fbff3fb184b")
      public
          fun failureConditional(failureConditional: ConditionalSpecificationProperty.Builder.() -> Unit)

      public fun failureNextStep(failureNextStep: IResolvable)

      public fun failureNextStep(failureNextStep: DialogStateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac1d1d9c4c8986be4aeeb348470a375d57b290c88f6de753230433aa8b494a4e")
      public fun failureNextStep(failureNextStep: DialogStateProperty.Builder.() -> Unit)

      public fun failureResponse(failureResponse: IResolvable)

      public fun failureResponse(failureResponse: ResponseSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f58efdf979f6bfc40fff414089d6dab81fdf41c9a5f930d9c24d67c8e42b49ab")
      public fun failureResponse(failureResponse: ResponseSpecificationProperty.Builder.() -> Unit)

      public fun successConditional(successConditional: IResolvable)

      public fun successConditional(successConditional: ConditionalSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a5b91f19aff2d382e3ba0c13d6dfa842db89c8c38f02669d85e4cc30e226f2a")
      public
          fun successConditional(successConditional: ConditionalSpecificationProperty.Builder.() -> Unit)

      public fun successNextStep(successNextStep: IResolvable)

      public fun successNextStep(successNextStep: DialogStateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("48e047e93dae3e67b0fc6457445a079e0f822eaf84fd937a3ef97e9f4555a191")
      public fun successNextStep(successNextStep: DialogStateProperty.Builder.() -> Unit)

      public fun successResponse(successResponse: IResolvable)

      public fun successResponse(successResponse: ResponseSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ea0b9e14bdbb37f2d82076c93c3c3564991d9070841567ad2d0cd316e0e1686")
      public fun successResponse(successResponse: ResponseSpecificationProperty.Builder.() -> Unit)

      public fun timeoutConditional(timeoutConditional: IResolvable)

      public fun timeoutConditional(timeoutConditional: ConditionalSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("758462d593c2e9ec8921626f0aa0d0ec85429881a7c75e907291fdeb2784a6df")
      public
          fun timeoutConditional(timeoutConditional: ConditionalSpecificationProperty.Builder.() -> Unit)

      public fun timeoutNextStep(timeoutNextStep: IResolvable)

      public fun timeoutNextStep(timeoutNextStep: DialogStateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("617991d8e27e5b030c600f2262a1097439e3ada37789c4ccf3184cd029faca79")
      public fun timeoutNextStep(timeoutNextStep: DialogStateProperty.Builder.() -> Unit)

      public fun timeoutResponse(timeoutResponse: IResolvable)

      public fun timeoutResponse(timeoutResponse: ResponseSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f2a2936aa12dbed1889dc44047be244197142d999adb47bf3220267c83a2ca4")
      public fun timeoutResponse(timeoutResponse: ResponseSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.PostFulfillmentStatusSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBot.PostFulfillmentStatusSpecificationProperty.builder()

      override fun failureConditional(failureConditional: IResolvable) {
        cdkBuilder.failureConditional(failureConditional.let(IResolvable::unwrap))
      }

      override fun failureConditional(failureConditional: ConditionalSpecificationProperty) {
        cdkBuilder.failureConditional(failureConditional.let(ConditionalSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b9f2c2fa3193936c7d04b9f7bb2ec26f2e1da5813671965f7a427fbff3fb184b")
      override
          fun failureConditional(failureConditional: ConditionalSpecificationProperty.Builder.() -> Unit):
          Unit = failureConditional(ConditionalSpecificationProperty(failureConditional))

      override fun failureNextStep(failureNextStep: IResolvable) {
        cdkBuilder.failureNextStep(failureNextStep.let(IResolvable::unwrap))
      }

      override fun failureNextStep(failureNextStep: DialogStateProperty) {
        cdkBuilder.failureNextStep(failureNextStep.let(DialogStateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac1d1d9c4c8986be4aeeb348470a375d57b290c88f6de753230433aa8b494a4e")
      override fun failureNextStep(failureNextStep: DialogStateProperty.Builder.() -> Unit): Unit =
          failureNextStep(DialogStateProperty(failureNextStep))

      override fun failureResponse(failureResponse: IResolvable) {
        cdkBuilder.failureResponse(failureResponse.let(IResolvable::unwrap))
      }

      override fun failureResponse(failureResponse: ResponseSpecificationProperty) {
        cdkBuilder.failureResponse(failureResponse.let(ResponseSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f58efdf979f6bfc40fff414089d6dab81fdf41c9a5f930d9c24d67c8e42b49ab")
      override
          fun failureResponse(failureResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = failureResponse(ResponseSpecificationProperty(failureResponse))

      override fun successConditional(successConditional: IResolvable) {
        cdkBuilder.successConditional(successConditional.let(IResolvable::unwrap))
      }

      override fun successConditional(successConditional: ConditionalSpecificationProperty) {
        cdkBuilder.successConditional(successConditional.let(ConditionalSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a5b91f19aff2d382e3ba0c13d6dfa842db89c8c38f02669d85e4cc30e226f2a")
      override
          fun successConditional(successConditional: ConditionalSpecificationProperty.Builder.() -> Unit):
          Unit = successConditional(ConditionalSpecificationProperty(successConditional))

      override fun successNextStep(successNextStep: IResolvable) {
        cdkBuilder.successNextStep(successNextStep.let(IResolvable::unwrap))
      }

      override fun successNextStep(successNextStep: DialogStateProperty) {
        cdkBuilder.successNextStep(successNextStep.let(DialogStateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("48e047e93dae3e67b0fc6457445a079e0f822eaf84fd937a3ef97e9f4555a191")
      override fun successNextStep(successNextStep: DialogStateProperty.Builder.() -> Unit): Unit =
          successNextStep(DialogStateProperty(successNextStep))

      override fun successResponse(successResponse: IResolvable) {
        cdkBuilder.successResponse(successResponse.let(IResolvable::unwrap))
      }

      override fun successResponse(successResponse: ResponseSpecificationProperty) {
        cdkBuilder.successResponse(successResponse.let(ResponseSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ea0b9e14bdbb37f2d82076c93c3c3564991d9070841567ad2d0cd316e0e1686")
      override
          fun successResponse(successResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = successResponse(ResponseSpecificationProperty(successResponse))

      override fun timeoutConditional(timeoutConditional: IResolvable) {
        cdkBuilder.timeoutConditional(timeoutConditional.let(IResolvable::unwrap))
      }

      override fun timeoutConditional(timeoutConditional: ConditionalSpecificationProperty) {
        cdkBuilder.timeoutConditional(timeoutConditional.let(ConditionalSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("758462d593c2e9ec8921626f0aa0d0ec85429881a7c75e907291fdeb2784a6df")
      override
          fun timeoutConditional(timeoutConditional: ConditionalSpecificationProperty.Builder.() -> Unit):
          Unit = timeoutConditional(ConditionalSpecificationProperty(timeoutConditional))

      override fun timeoutNextStep(timeoutNextStep: IResolvable) {
        cdkBuilder.timeoutNextStep(timeoutNextStep.let(IResolvable::unwrap))
      }

      override fun timeoutNextStep(timeoutNextStep: DialogStateProperty) {
        cdkBuilder.timeoutNextStep(timeoutNextStep.let(DialogStateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("617991d8e27e5b030c600f2262a1097439e3ada37789c4ccf3184cd029faca79")
      override fun timeoutNextStep(timeoutNextStep: DialogStateProperty.Builder.() -> Unit): Unit =
          timeoutNextStep(DialogStateProperty(timeoutNextStep))

      override fun timeoutResponse(timeoutResponse: IResolvable) {
        cdkBuilder.timeoutResponse(timeoutResponse.let(IResolvable::unwrap))
      }

      override fun timeoutResponse(timeoutResponse: ResponseSpecificationProperty) {
        cdkBuilder.timeoutResponse(timeoutResponse.let(ResponseSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f2a2936aa12dbed1889dc44047be244197142d999adb47bf3220267c83a2ca4")
      override
          fun timeoutResponse(timeoutResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = timeoutResponse(ResponseSpecificationProperty(timeoutResponse))

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.PostFulfillmentStatusSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.PostFulfillmentStatusSpecificationProperty,
    ) : PostFulfillmentStatusSpecificationProperty {
      override fun failureConditional(): Any? = unwrap(this).getFailureConditional()

      override fun failureNextStep(): Any? = unwrap(this).getFailureNextStep()

      override fun failureResponse(): Any? = unwrap(this).getFailureResponse()

      override fun successConditional(): Any? = unwrap(this).getSuccessConditional()

      override fun successNextStep(): Any? = unwrap(this).getSuccessNextStep()

      override fun successResponse(): Any? = unwrap(this).getSuccessResponse()

      override fun timeoutConditional(): Any? = unwrap(this).getTimeoutConditional()

      override fun timeoutNextStep(): Any? = unwrap(this).getTimeoutNextStep()

      override fun timeoutResponse(): Any? = unwrap(this).getTimeoutResponse()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PostFulfillmentStatusSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.PostFulfillmentStatusSpecificationProperty):
          PostFulfillmentStatusSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PostFulfillmentStatusSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.PostFulfillmentStatusSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface IntentClosingSettingProperty {
    public fun closingResponse(): Any? = unwrap(this).getClosingResponse()

    public fun conditional(): Any? = unwrap(this).getConditional()

    public fun isActive(): Any? = unwrap(this).getIsActive()

    public fun nextStep(): Any? = unwrap(this).getNextStep()

    public interface Builder {
      public fun closingResponse(closingResponse: IResolvable)

      public fun closingResponse(closingResponse: ResponseSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c3633d12b4e10d44f6f195a822eb8b634d98f0eaac402461a010ba84a51082e")
      public fun closingResponse(closingResponse: ResponseSpecificationProperty.Builder.() -> Unit)

      public fun conditional(conditional: IResolvable)

      public fun conditional(conditional: ConditionalSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("29c9fb89498a2efedf8a6daa2f7516f87ceed5ad64d8f6040524befb415eb07e")
      public fun conditional(conditional: ConditionalSpecificationProperty.Builder.() -> Unit)

      public fun isActive(isActive: Boolean)

      public fun isActive(isActive: IResolvable)

      public fun nextStep(nextStep: IResolvable)

      public fun nextStep(nextStep: DialogStateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e9026b933eb5f24f8c6e95d62325b60695866c88a81fa1b5d27e77b839c87ed")
      public fun nextStep(nextStep: DialogStateProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.IntentClosingSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.IntentClosingSettingProperty.builder()

      override fun closingResponse(closingResponse: IResolvable) {
        cdkBuilder.closingResponse(closingResponse.let(IResolvable::unwrap))
      }

      override fun closingResponse(closingResponse: ResponseSpecificationProperty) {
        cdkBuilder.closingResponse(closingResponse.let(ResponseSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c3633d12b4e10d44f6f195a822eb8b634d98f0eaac402461a010ba84a51082e")
      override
          fun closingResponse(closingResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = closingResponse(ResponseSpecificationProperty(closingResponse))

      override fun conditional(conditional: IResolvable) {
        cdkBuilder.conditional(conditional.let(IResolvable::unwrap))
      }

      override fun conditional(conditional: ConditionalSpecificationProperty) {
        cdkBuilder.conditional(conditional.let(ConditionalSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("29c9fb89498a2efedf8a6daa2f7516f87ceed5ad64d8f6040524befb415eb07e")
      override fun conditional(conditional: ConditionalSpecificationProperty.Builder.() -> Unit):
          Unit = conditional(ConditionalSpecificationProperty(conditional))

      override fun isActive(isActive: Boolean) {
        cdkBuilder.isActive(isActive)
      }

      override fun isActive(isActive: IResolvable) {
        cdkBuilder.isActive(isActive.let(IResolvable::unwrap))
      }

      override fun nextStep(nextStep: IResolvable) {
        cdkBuilder.nextStep(nextStep.let(IResolvable::unwrap))
      }

      override fun nextStep(nextStep: DialogStateProperty) {
        cdkBuilder.nextStep(nextStep.let(DialogStateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e9026b933eb5f24f8c6e95d62325b60695866c88a81fa1b5d27e77b839c87ed")
      override fun nextStep(nextStep: DialogStateProperty.Builder.() -> Unit): Unit =
          nextStep(DialogStateProperty(nextStep))

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.IntentClosingSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.IntentClosingSettingProperty,
    ) : IntentClosingSettingProperty {
      override fun closingResponse(): Any? = unwrap(this).getClosingResponse()

      override fun conditional(): Any? = unwrap(this).getConditional()

      override fun isActive(): Any? = unwrap(this).getIsActive()

      override fun nextStep(): Any? = unwrap(this).getNextStep()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IntentClosingSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.IntentClosingSettingProperty):
          IntentClosingSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntentClosingSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.IntentClosingSettingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PromptAttemptSpecificationProperty {
    public fun allowInterrupt(): Any? = unwrap(this).getAllowInterrupt()

    public fun allowedInputTypes(): Any

    public fun audioAndDtmfInputSpecification(): Any? =
        unwrap(this).getAudioAndDtmfInputSpecification()

    public fun textInputSpecification(): Any? = unwrap(this).getTextInputSpecification()

    public interface Builder {
      public fun allowInterrupt(allowInterrupt: Boolean)

      public fun allowInterrupt(allowInterrupt: IResolvable)

      public fun allowedInputTypes(allowedInputTypes: IResolvable)

      public fun allowedInputTypes(allowedInputTypes: AllowedInputTypesProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d7638351b588b5457789373e88564349da909c2b065e905b7817652deb0a3d43")
      public fun allowedInputTypes(allowedInputTypes: AllowedInputTypesProperty.Builder.() -> Unit)

      public fun audioAndDtmfInputSpecification(audioAndDtmfInputSpecification: IResolvable)

      public
          fun audioAndDtmfInputSpecification(audioAndDtmfInputSpecification: AudioAndDTMFInputSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf9d845ec670960a02436c31f8417abb328daaf2e68d804169fb3446c33fc7d2")
      public
          fun audioAndDtmfInputSpecification(audioAndDtmfInputSpecification: AudioAndDTMFInputSpecificationProperty.Builder.() -> Unit)

      public fun textInputSpecification(textInputSpecification: IResolvable)

      public fun textInputSpecification(textInputSpecification: TextInputSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87c4c0f00bb9633904524d221a35cf1cf4326e49d709c3ed5e86c97723186603")
      public
          fun textInputSpecification(textInputSpecification: TextInputSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.PromptAttemptSpecificationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.PromptAttemptSpecificationProperty.builder()

      override fun allowInterrupt(allowInterrupt: Boolean) {
        cdkBuilder.allowInterrupt(allowInterrupt)
      }

      override fun allowInterrupt(allowInterrupt: IResolvable) {
        cdkBuilder.allowInterrupt(allowInterrupt.let(IResolvable::unwrap))
      }

      override fun allowedInputTypes(allowedInputTypes: IResolvable) {
        cdkBuilder.allowedInputTypes(allowedInputTypes.let(IResolvable::unwrap))
      }

      override fun allowedInputTypes(allowedInputTypes: AllowedInputTypesProperty) {
        cdkBuilder.allowedInputTypes(allowedInputTypes.let(AllowedInputTypesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d7638351b588b5457789373e88564349da909c2b065e905b7817652deb0a3d43")
      override
          fun allowedInputTypes(allowedInputTypes: AllowedInputTypesProperty.Builder.() -> Unit):
          Unit = allowedInputTypes(AllowedInputTypesProperty(allowedInputTypes))

      override fun audioAndDtmfInputSpecification(audioAndDtmfInputSpecification: IResolvable) {
        cdkBuilder.audioAndDtmfInputSpecification(audioAndDtmfInputSpecification.let(IResolvable::unwrap))
      }

      override
          fun audioAndDtmfInputSpecification(audioAndDtmfInputSpecification: AudioAndDTMFInputSpecificationProperty) {
        cdkBuilder.audioAndDtmfInputSpecification(audioAndDtmfInputSpecification.let(AudioAndDTMFInputSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf9d845ec670960a02436c31f8417abb328daaf2e68d804169fb3446c33fc7d2")
      override
          fun audioAndDtmfInputSpecification(audioAndDtmfInputSpecification: AudioAndDTMFInputSpecificationProperty.Builder.() -> Unit):
          Unit =
          audioAndDtmfInputSpecification(AudioAndDTMFInputSpecificationProperty(audioAndDtmfInputSpecification))

      override fun textInputSpecification(textInputSpecification: IResolvable) {
        cdkBuilder.textInputSpecification(textInputSpecification.let(IResolvable::unwrap))
      }

      override fun textInputSpecification(textInputSpecification: TextInputSpecificationProperty) {
        cdkBuilder.textInputSpecification(textInputSpecification.let(TextInputSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87c4c0f00bb9633904524d221a35cf1cf4326e49d709c3ed5e86c97723186603")
      override
          fun textInputSpecification(textInputSpecification: TextInputSpecificationProperty.Builder.() -> Unit):
          Unit = textInputSpecification(TextInputSpecificationProperty(textInputSpecification))

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.PromptAttemptSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.PromptAttemptSpecificationProperty,
    ) : PromptAttemptSpecificationProperty {
      override fun allowInterrupt(): Any? = unwrap(this).getAllowInterrupt()

      override fun allowedInputTypes(): Any = unwrap(this).getAllowedInputTypes()

      override fun audioAndDtmfInputSpecification(): Any? =
          unwrap(this).getAudioAndDtmfInputSpecification()

      override fun textInputSpecification(): Any? = unwrap(this).getTextInputSpecification()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PromptAttemptSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.PromptAttemptSpecificationProperty):
          PromptAttemptSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptAttemptSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.PromptAttemptSpecificationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface AllowedInputTypesProperty {
    public fun allowAudioInput(): Any

    public fun allowDtmfInput(): Any

    public interface Builder {
      public fun allowAudioInput(allowAudioInput: Boolean)

      public fun allowAudioInput(allowAudioInput: IResolvable)

      public fun allowDtmfInput(allowDtmfInput: Boolean)

      public fun allowDtmfInput(allowDtmfInput: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.AllowedInputTypesProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.AllowedInputTypesProperty.builder()

      override fun allowAudioInput(allowAudioInput: Boolean) {
        cdkBuilder.allowAudioInput(allowAudioInput)
      }

      override fun allowAudioInput(allowAudioInput: IResolvable) {
        cdkBuilder.allowAudioInput(allowAudioInput.let(IResolvable::unwrap))
      }

      override fun allowDtmfInput(allowDtmfInput: Boolean) {
        cdkBuilder.allowDtmfInput(allowDtmfInput)
      }

      override fun allowDtmfInput(allowDtmfInput: IResolvable) {
        cdkBuilder.allowDtmfInput(allowDtmfInput.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.AllowedInputTypesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.AllowedInputTypesProperty,
    ) : AllowedInputTypesProperty {
      override fun allowAudioInput(): Any = unwrap(this).getAllowAudioInput()

      override fun allowDtmfInput(): Any = unwrap(this).getAllowDtmfInput()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AllowedInputTypesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.AllowedInputTypesProperty):
          AllowedInputTypesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AllowedInputTypesProperty):
          software.amazon.awscdk.services.lex.CfnBot.AllowedInputTypesProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MessageGroupProperty {
    public fun message(): Any

    public fun variations(): Any? = unwrap(this).getVariations()

    public interface Builder {
      public fun message(message: IResolvable)

      public fun message(message: MessageProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e766903057c90906ecc98545abf907d54c01b35e3c4574973fe46e9ac41b0088")
      public fun message(message: MessageProperty.Builder.() -> Unit)

      public fun variations(variations: IResolvable)

      public fun variations(variations: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.MessageGroupProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.MessageGroupProperty.builder()

      override fun message(message: IResolvable) {
        cdkBuilder.message(message.let(IResolvable::unwrap))
      }

      override fun message(message: MessageProperty) {
        cdkBuilder.message(message.let(MessageProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e766903057c90906ecc98545abf907d54c01b35e3c4574973fe46e9ac41b0088")
      override fun message(message: MessageProperty.Builder.() -> Unit): Unit =
          message(MessageProperty(message))

      override fun variations(variations: IResolvable) {
        cdkBuilder.variations(variations.let(IResolvable::unwrap))
      }

      override fun variations(variations: List<Any>) {
        cdkBuilder.variations(variations)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.MessageGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.MessageGroupProperty,
    ) : MessageGroupProperty {
      override fun message(): Any = unwrap(this).getMessage()

      override fun variations(): Any? = unwrap(this).getVariations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MessageGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.MessageGroupProperty):
          MessageGroupProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MessageGroupProperty):
          software.amazon.awscdk.services.lex.CfnBot.MessageGroupProperty = (wrapped as
          Wrapper).cdkObject
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
          software.amazon.awscdk.services.lex.CfnBot.ConversationLogSettingsProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.ConversationLogSettingsProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.ConversationLogSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.ConversationLogSettingsProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.ConversationLogSettingsProperty):
          ConversationLogSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConversationLogSettingsProperty):
          software.amazon.awscdk.services.lex.CfnBot.ConversationLogSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FulfillmentCodeHookSettingProperty {
    public fun enabled(): Any

    public fun fulfillmentUpdatesSpecification(): Any? =
        unwrap(this).getFulfillmentUpdatesSpecification()

    public fun isActive(): Any? = unwrap(this).getIsActive()

    public fun postFulfillmentStatusSpecification(): Any? =
        unwrap(this).getPostFulfillmentStatusSpecification()

    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun fulfillmentUpdatesSpecification(fulfillmentUpdatesSpecification: IResolvable)

      public
          fun fulfillmentUpdatesSpecification(fulfillmentUpdatesSpecification: FulfillmentUpdatesSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0519d9c649c85400115d38b42da54b0f6081970d8b55579f68bfb38c2fee1319")
      public
          fun fulfillmentUpdatesSpecification(fulfillmentUpdatesSpecification: FulfillmentUpdatesSpecificationProperty.Builder.() -> Unit)

      public fun isActive(isActive: Boolean)

      public fun isActive(isActive: IResolvable)

      public fun postFulfillmentStatusSpecification(postFulfillmentStatusSpecification: IResolvable)

      public
          fun postFulfillmentStatusSpecification(postFulfillmentStatusSpecification: PostFulfillmentStatusSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5347743b025ca13fd46ac62fcd9161d82e6f120e9b09174d0754b6ace45d79a5")
      public
          fun postFulfillmentStatusSpecification(postFulfillmentStatusSpecification: PostFulfillmentStatusSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentCodeHookSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentCodeHookSettingProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun fulfillmentUpdatesSpecification(fulfillmentUpdatesSpecification: IResolvable) {
        cdkBuilder.fulfillmentUpdatesSpecification(fulfillmentUpdatesSpecification.let(IResolvable::unwrap))
      }

      override
          fun fulfillmentUpdatesSpecification(fulfillmentUpdatesSpecification: FulfillmentUpdatesSpecificationProperty) {
        cdkBuilder.fulfillmentUpdatesSpecification(fulfillmentUpdatesSpecification.let(FulfillmentUpdatesSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0519d9c649c85400115d38b42da54b0f6081970d8b55579f68bfb38c2fee1319")
      override
          fun fulfillmentUpdatesSpecification(fulfillmentUpdatesSpecification: FulfillmentUpdatesSpecificationProperty.Builder.() -> Unit):
          Unit =
          fulfillmentUpdatesSpecification(FulfillmentUpdatesSpecificationProperty(fulfillmentUpdatesSpecification))

      override fun isActive(isActive: Boolean) {
        cdkBuilder.isActive(isActive)
      }

      override fun isActive(isActive: IResolvable) {
        cdkBuilder.isActive(isActive.let(IResolvable::unwrap))
      }

      override
          fun postFulfillmentStatusSpecification(postFulfillmentStatusSpecification: IResolvable) {
        cdkBuilder.postFulfillmentStatusSpecification(postFulfillmentStatusSpecification.let(IResolvable::unwrap))
      }

      override
          fun postFulfillmentStatusSpecification(postFulfillmentStatusSpecification: PostFulfillmentStatusSpecificationProperty) {
        cdkBuilder.postFulfillmentStatusSpecification(postFulfillmentStatusSpecification.let(PostFulfillmentStatusSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5347743b025ca13fd46ac62fcd9161d82e6f120e9b09174d0754b6ace45d79a5")
      override
          fun postFulfillmentStatusSpecification(postFulfillmentStatusSpecification: PostFulfillmentStatusSpecificationProperty.Builder.() -> Unit):
          Unit =
          postFulfillmentStatusSpecification(PostFulfillmentStatusSpecificationProperty(postFulfillmentStatusSpecification))

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentCodeHookSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentCodeHookSettingProperty,
    ) : FulfillmentCodeHookSettingProperty {
      override fun enabled(): Any = unwrap(this).getEnabled()

      override fun fulfillmentUpdatesSpecification(): Any? =
          unwrap(this).getFulfillmentUpdatesSpecification()

      override fun isActive(): Any? = unwrap(this).getIsActive()

      override fun postFulfillmentStatusSpecification(): Any? =
          unwrap(this).getPostFulfillmentStatusSpecification()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          FulfillmentCodeHookSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.FulfillmentCodeHookSettingProperty):
          FulfillmentCodeHookSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FulfillmentCodeHookSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentCodeHookSettingProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface SlotPriorityProperty {
    public fun priority(): Number

    public fun slotName(): String

    public interface Builder {
      public fun priority(priority: Number)

      public fun slotName(slotName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.SlotPriorityProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SlotPriorityProperty.builder()

      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      override fun slotName(slotName: String) {
        cdkBuilder.slotName(slotName)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.SlotPriorityProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotPriorityProperty,
    ) : SlotPriorityProperty {
      override fun priority(): Number = unwrap(this).getPriority()

      override fun slotName(): String = unwrap(this).getSlotName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SlotPriorityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotPriorityProperty):
          SlotPriorityProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlotPriorityProperty):
          software.amazon.awscdk.services.lex.CfnBot.SlotPriorityProperty = (wrapped as
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
      @JvmName("76758a948ce825f15d7379f98141cbe9803573bf44ddb18a34bf3a8d24a8a515")
      public fun destination(destination: TextLogDestinationProperty.Builder.() -> Unit)

      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.TextLogSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.TextLogSettingProperty.builder()

      override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      override fun destination(destination: TextLogDestinationProperty) {
        cdkBuilder.destination(destination.let(TextLogDestinationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76758a948ce825f15d7379f98141cbe9803573bf44ddb18a34bf3a8d24a8a515")
      override fun destination(destination: TextLogDestinationProperty.Builder.() -> Unit): Unit =
          destination(TextLogDestinationProperty(destination))

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.TextLogSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.TextLogSettingProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.TextLogSettingProperty):
          TextLogSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TextLogSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.TextLogSettingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface InitialResponseSettingProperty {
    public fun codeHook(): Any? = unwrap(this).getCodeHook()

    public fun conditional(): Any? = unwrap(this).getConditional()

    public fun initialResponse(): Any? = unwrap(this).getInitialResponse()

    public fun nextStep(): Any? = unwrap(this).getNextStep()

    public interface Builder {
      public fun codeHook(codeHook: IResolvable)

      public fun codeHook(codeHook: DialogCodeHookInvocationSettingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("344de88ef5ebe057617fd9346bea784928518b040e4a8fb5d354d22e1fd39361")
      public fun codeHook(codeHook: DialogCodeHookInvocationSettingProperty.Builder.() -> Unit)

      public fun conditional(conditional: IResolvable)

      public fun conditional(conditional: ConditionalSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d7678c4d76f79454e532a8895a1190f4e45769f138b286efdb78c3b773ff2b7b")
      public fun conditional(conditional: ConditionalSpecificationProperty.Builder.() -> Unit)

      public fun initialResponse(initialResponse: IResolvable)

      public fun initialResponse(initialResponse: ResponseSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6b7ec43483e41bcf878fa51c4940d54fcf094c37d78e8c612829ab78cc9bd30b")
      public fun initialResponse(initialResponse: ResponseSpecificationProperty.Builder.() -> Unit)

      public fun nextStep(nextStep: IResolvable)

      public fun nextStep(nextStep: DialogStateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0444c0fb24ca278f7b72f4426b334e76418254528e24d5fa54ac4120ff441fc")
      public fun nextStep(nextStep: DialogStateProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.InitialResponseSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.InitialResponseSettingProperty.builder()

      override fun codeHook(codeHook: IResolvable) {
        cdkBuilder.codeHook(codeHook.let(IResolvable::unwrap))
      }

      override fun codeHook(codeHook: DialogCodeHookInvocationSettingProperty) {
        cdkBuilder.codeHook(codeHook.let(DialogCodeHookInvocationSettingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("344de88ef5ebe057617fd9346bea784928518b040e4a8fb5d354d22e1fd39361")
      override fun codeHook(codeHook: DialogCodeHookInvocationSettingProperty.Builder.() -> Unit):
          Unit = codeHook(DialogCodeHookInvocationSettingProperty(codeHook))

      override fun conditional(conditional: IResolvable) {
        cdkBuilder.conditional(conditional.let(IResolvable::unwrap))
      }

      override fun conditional(conditional: ConditionalSpecificationProperty) {
        cdkBuilder.conditional(conditional.let(ConditionalSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d7678c4d76f79454e532a8895a1190f4e45769f138b286efdb78c3b773ff2b7b")
      override fun conditional(conditional: ConditionalSpecificationProperty.Builder.() -> Unit):
          Unit = conditional(ConditionalSpecificationProperty(conditional))

      override fun initialResponse(initialResponse: IResolvable) {
        cdkBuilder.initialResponse(initialResponse.let(IResolvable::unwrap))
      }

      override fun initialResponse(initialResponse: ResponseSpecificationProperty) {
        cdkBuilder.initialResponse(initialResponse.let(ResponseSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6b7ec43483e41bcf878fa51c4940d54fcf094c37d78e8c612829ab78cc9bd30b")
      override
          fun initialResponse(initialResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = initialResponse(ResponseSpecificationProperty(initialResponse))

      override fun nextStep(nextStep: IResolvable) {
        cdkBuilder.nextStep(nextStep.let(IResolvable::unwrap))
      }

      override fun nextStep(nextStep: DialogStateProperty) {
        cdkBuilder.nextStep(nextStep.let(DialogStateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0444c0fb24ca278f7b72f4426b334e76418254528e24d5fa54ac4120ff441fc")
      override fun nextStep(nextStep: DialogStateProperty.Builder.() -> Unit): Unit =
          nextStep(DialogStateProperty(nextStep))

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.InitialResponseSettingProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.InitialResponseSettingProperty,
    ) : InitialResponseSettingProperty {
      override fun codeHook(): Any? = unwrap(this).getCodeHook()

      override fun conditional(): Any? = unwrap(this).getConditional()

      override fun initialResponse(): Any? = unwrap(this).getInitialResponse()

      override fun nextStep(): Any? = unwrap(this).getNextStep()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InitialResponseSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.InitialResponseSettingProperty):
          InitialResponseSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InitialResponseSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.InitialResponseSettingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ResponseSpecificationProperty {
    public fun allowInterrupt(): Any? = unwrap(this).getAllowInterrupt()

    public fun messageGroupsList(): Any

    public interface Builder {
      public fun allowInterrupt(allowInterrupt: Boolean)

      public fun allowInterrupt(allowInterrupt: IResolvable)

      public fun messageGroupsList(messageGroupsList: IResolvable)

      public fun messageGroupsList(messageGroupsList: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.ResponseSpecificationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.ResponseSpecificationProperty.builder()

      override fun allowInterrupt(allowInterrupt: Boolean) {
        cdkBuilder.allowInterrupt(allowInterrupt)
      }

      override fun allowInterrupt(allowInterrupt: IResolvable) {
        cdkBuilder.allowInterrupt(allowInterrupt.let(IResolvable::unwrap))
      }

      override fun messageGroupsList(messageGroupsList: IResolvable) {
        cdkBuilder.messageGroupsList(messageGroupsList.let(IResolvable::unwrap))
      }

      override fun messageGroupsList(messageGroupsList: List<Any>) {
        cdkBuilder.messageGroupsList(messageGroupsList)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.ResponseSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.ResponseSpecificationProperty,
    ) : ResponseSpecificationProperty {
      override fun allowInterrupt(): Any? = unwrap(this).getAllowInterrupt()

      override fun messageGroupsList(): Any = unwrap(this).getMessageGroupsList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResponseSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.ResponseSpecificationProperty):
          ResponseSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResponseSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.ResponseSpecificationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AudioLogSettingProperty {
    public fun destination(): Any

    public fun enabled(): Any

    public interface Builder {
      public fun destination(destination: IResolvable)

      public fun destination(destination: AudioLogDestinationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a36254686cad8246bfc3f28e1825276b53ad0a8954f57f7dd0b4b801fa9c7328")
      public fun destination(destination: AudioLogDestinationProperty.Builder.() -> Unit)

      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.AudioLogSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.AudioLogSettingProperty.builder()

      override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      override fun destination(destination: AudioLogDestinationProperty) {
        cdkBuilder.destination(destination.let(AudioLogDestinationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a36254686cad8246bfc3f28e1825276b53ad0a8954f57f7dd0b4b801fa9c7328")
      override fun destination(destination: AudioLogDestinationProperty.Builder.() -> Unit): Unit =
          destination(AudioLogDestinationProperty(destination))

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.AudioLogSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.AudioLogSettingProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.AudioLogSettingProperty):
          AudioLogSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioLogSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.AudioLogSettingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SlotValueOverrideProperty {
    public fun shape(): String? = unwrap(this).getShape()

    public fun `value`(): Any? = unwrap(this).getValue()

    public fun values(): Any? = unwrap(this).getValues()

    public interface Builder {
      public fun shape(shape: String)

      public fun `value`(`value`: IResolvable)

      public fun `value`(`value`: SlotValueProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d5eba9499fe0181585f9878c91689846158d974fb7b0f3017bdd15a6fb361876")
      public fun `value`(`value`: SlotValueProperty.Builder.() -> Unit)

      public fun values(values: IResolvable)

      public fun values(values: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.SlotValueOverrideProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SlotValueOverrideProperty.builder()

      override fun shape(shape: String) {
        cdkBuilder.shape(shape)
      }

      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable::unwrap))
      }

      override fun `value`(`value`: SlotValueProperty) {
        cdkBuilder.`value`(`value`.let(SlotValueProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d5eba9499fe0181585f9878c91689846158d974fb7b0f3017bdd15a6fb361876")
      override fun `value`(`value`: SlotValueProperty.Builder.() -> Unit): Unit =
          `value`(SlotValueProperty(`value`))

      override fun values(values: IResolvable) {
        cdkBuilder.values(values.let(IResolvable::unwrap))
      }

      override fun values(values: List<Any>) {
        cdkBuilder.values(values)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.SlotValueOverrideProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotValueOverrideProperty,
    ) : SlotValueOverrideProperty {
      override fun shape(): String? = unwrap(this).getShape()

      override fun `value`(): Any? = unwrap(this).getValue()

      override fun values(): Any? = unwrap(this).getValues()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SlotValueOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotValueOverrideProperty):
          SlotValueOverrideProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlotValueOverrideProperty):
          software.amazon.awscdk.services.lex.CfnBot.SlotValueOverrideProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SessionAttributeProperty {
    public fun key(): String

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.SessionAttributeProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SessionAttributeProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.SessionAttributeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.SessionAttributeProperty,
    ) : SessionAttributeProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SessionAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SessionAttributeProperty):
          SessionAttributeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SessionAttributeProperty):
          software.amazon.awscdk.services.lex.CfnBot.SessionAttributeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface GrammarSlotTypeSettingProperty {
    public fun source(): Any? = unwrap(this).getSource()

    public interface Builder {
      public fun source(source: IResolvable)

      public fun source(source: GrammarSlotTypeSourceProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2be8ae3465456d2b12af92efe07363c2ff4f08c749a7d21727ed0849d399e777")
      public fun source(source: GrammarSlotTypeSourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.GrammarSlotTypeSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.GrammarSlotTypeSettingProperty.builder()

      override fun source(source: IResolvable) {
        cdkBuilder.source(source.let(IResolvable::unwrap))
      }

      override fun source(source: GrammarSlotTypeSourceProperty) {
        cdkBuilder.source(source.let(GrammarSlotTypeSourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2be8ae3465456d2b12af92efe07363c2ff4f08c749a7d21727ed0849d399e777")
      override fun source(source: GrammarSlotTypeSourceProperty.Builder.() -> Unit): Unit =
          source(GrammarSlotTypeSourceProperty(source))

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.GrammarSlotTypeSettingProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.GrammarSlotTypeSettingProperty,
    ) : GrammarSlotTypeSettingProperty {
      override fun source(): Any? = unwrap(this).getSource()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GrammarSlotTypeSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.GrammarSlotTypeSettingProperty):
          GrammarSlotTypeSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GrammarSlotTypeSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.GrammarSlotTypeSettingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DialogCodeHookSettingProperty {
    public fun enabled(): Any

    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.DialogCodeHookSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.DialogCodeHookSettingProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.DialogCodeHookSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.DialogCodeHookSettingProperty,
    ) : DialogCodeHookSettingProperty {
      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DialogCodeHookSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.DialogCodeHookSettingProperty):
          DialogCodeHookSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DialogCodeHookSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.DialogCodeHookSettingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TextInputSpecificationProperty {
    public fun startTimeoutMs(): Number

    public interface Builder {
      public fun startTimeoutMs(startTimeoutMs: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.TextInputSpecificationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.TextInputSpecificationProperty.builder()

      override fun startTimeoutMs(startTimeoutMs: Number) {
        cdkBuilder.startTimeoutMs(startTimeoutMs)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.TextInputSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.TextInputSpecificationProperty,
    ) : TextInputSpecificationProperty {
      override fun startTimeoutMs(): Number = unwrap(this).getStartTimeoutMs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TextInputSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.TextInputSpecificationProperty):
          TextInputSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TextInputSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.TextInputSpecificationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ObfuscationSettingProperty {
    public fun obfuscationSettingType(): String

    public interface Builder {
      public fun obfuscationSettingType(obfuscationSettingType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.ObfuscationSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.ObfuscationSettingProperty.builder()

      override fun obfuscationSettingType(obfuscationSettingType: String) {
        cdkBuilder.obfuscationSettingType(obfuscationSettingType)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.ObfuscationSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.ObfuscationSettingProperty,
    ) : ObfuscationSettingProperty {
      override fun obfuscationSettingType(): String = unwrap(this).getObfuscationSettingType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ObfuscationSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.ObfuscationSettingProperty):
          ObfuscationSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ObfuscationSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.ObfuscationSettingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DialogActionProperty {
    public fun slotToElicit(): String? = unwrap(this).getSlotToElicit()

    public fun suppressNextMessage(): Any? = unwrap(this).getSuppressNextMessage()

    public fun type(): String

    public interface Builder {
      public fun slotToElicit(slotToElicit: String)

      public fun suppressNextMessage(suppressNextMessage: Boolean)

      public fun suppressNextMessage(suppressNextMessage: IResolvable)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.DialogActionProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.DialogActionProperty.builder()

      override fun slotToElicit(slotToElicit: String) {
        cdkBuilder.slotToElicit(slotToElicit)
      }

      override fun suppressNextMessage(suppressNextMessage: Boolean) {
        cdkBuilder.suppressNextMessage(suppressNextMessage)
      }

      override fun suppressNextMessage(suppressNextMessage: IResolvable) {
        cdkBuilder.suppressNextMessage(suppressNextMessage.let(IResolvable::unwrap))
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.DialogActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.DialogActionProperty,
    ) : DialogActionProperty {
      override fun slotToElicit(): String? = unwrap(this).getSlotToElicit()

      override fun suppressNextMessage(): Any? = unwrap(this).getSuppressNextMessage()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DialogActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.DialogActionProperty):
          DialogActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DialogActionProperty):
          software.amazon.awscdk.services.lex.CfnBot.DialogActionProperty = (wrapped as
          Wrapper).cdkObject
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
          software.amazon.awscdk.services.lex.CfnBot.LambdaCodeHookProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.LambdaCodeHookProperty.builder()

      override fun codeHookInterfaceVersion(codeHookInterfaceVersion: String) {
        cdkBuilder.codeHookInterfaceVersion(codeHookInterfaceVersion)
      }

      override fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.LambdaCodeHookProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.LambdaCodeHookProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.LambdaCodeHookProperty):
          LambdaCodeHookProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaCodeHookProperty):
          software.amazon.awscdk.services.lex.CfnBot.LambdaCodeHookProperty = (wrapped as
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
          software.amazon.awscdk.services.lex.CfnBot.CloudWatchLogGroupLogDestinationProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBot.CloudWatchLogGroupLogDestinationProperty.builder()

      override fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String) {
        cdkBuilder.cloudWatchLogGroupArn(cloudWatchLogGroupArn)
      }

      override fun logPrefix(logPrefix: String) {
        cdkBuilder.logPrefix(logPrefix)
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.CloudWatchLogGroupLogDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.CloudWatchLogGroupLogDestinationProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.CloudWatchLogGroupLogDestinationProperty):
          CloudWatchLogGroupLogDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogGroupLogDestinationProperty):
          software.amazon.awscdk.services.lex.CfnBot.CloudWatchLogGroupLogDestinationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConditionalBranchProperty {
    public fun condition(): Any

    public fun name(): String

    public fun nextStep(): Any

    public fun response(): Any? = unwrap(this).getResponse()

    public interface Builder {
      public fun condition(condition: IResolvable)

      public fun condition(condition: ConditionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("11ce9bf7ff9dc60669df35d268f9768de4c00dfce3b203c39509df583433b2c4")
      public fun condition(condition: ConditionProperty.Builder.() -> Unit)

      public fun name(name: String)

      public fun nextStep(nextStep: IResolvable)

      public fun nextStep(nextStep: DialogStateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e18a578d8634652a96d8e92406dcc5ce663c32c52c3b3d7d291d742652ecfc07")
      public fun nextStep(nextStep: DialogStateProperty.Builder.() -> Unit)

      public fun response(response: IResolvable)

      public fun response(response: ResponseSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9065059b85189dc70b86cd4de52d600767d744faec4b049c3c1ad709b6288a4")
      public fun response(response: ResponseSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.ConditionalBranchProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.ConditionalBranchProperty.builder()

      override fun condition(condition: IResolvable) {
        cdkBuilder.condition(condition.let(IResolvable::unwrap))
      }

      override fun condition(condition: ConditionProperty) {
        cdkBuilder.condition(condition.let(ConditionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("11ce9bf7ff9dc60669df35d268f9768de4c00dfce3b203c39509df583433b2c4")
      override fun condition(condition: ConditionProperty.Builder.() -> Unit): Unit =
          condition(ConditionProperty(condition))

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun nextStep(nextStep: IResolvable) {
        cdkBuilder.nextStep(nextStep.let(IResolvable::unwrap))
      }

      override fun nextStep(nextStep: DialogStateProperty) {
        cdkBuilder.nextStep(nextStep.let(DialogStateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e18a578d8634652a96d8e92406dcc5ce663c32c52c3b3d7d291d742652ecfc07")
      override fun nextStep(nextStep: DialogStateProperty.Builder.() -> Unit): Unit =
          nextStep(DialogStateProperty(nextStep))

      override fun response(response: IResolvable) {
        cdkBuilder.response(response.let(IResolvable::unwrap))
      }

      override fun response(response: ResponseSpecificationProperty) {
        cdkBuilder.response(response.let(ResponseSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9065059b85189dc70b86cd4de52d600767d744faec4b049c3c1ad709b6288a4")
      override fun response(response: ResponseSpecificationProperty.Builder.() -> Unit): Unit =
          response(ResponseSpecificationProperty(response))

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.ConditionalBranchProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.ConditionalBranchProperty,
    ) : ConditionalBranchProperty {
      override fun condition(): Any = unwrap(this).getCondition()

      override fun name(): String = unwrap(this).getName()

      override fun nextStep(): Any = unwrap(this).getNextStep()

      override fun response(): Any? = unwrap(this).getResponse()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConditionalBranchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.ConditionalBranchProperty):
          ConditionalBranchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionalBranchProperty):
          software.amazon.awscdk.services.lex.CfnBot.ConditionalBranchProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SampleValueProperty {
    public fun `value`(): String

    public interface Builder {
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBot.SampleValueProperty.Builder
          = software.amazon.awscdk.services.lex.CfnBot.SampleValueProperty.builder()

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.SampleValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.SampleValueProperty,
    ) : SampleValueProperty {
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SampleValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SampleValueProperty):
          SampleValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SampleValueProperty):
          software.amazon.awscdk.services.lex.CfnBot.SampleValueProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface InputContextProperty {
    public fun name(): String

    public interface Builder {
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.InputContextProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.InputContextProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.InputContextProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.InputContextProperty,
    ) : InputContextProperty {
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputContextProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.InputContextProperty):
          InputContextProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputContextProperty):
          software.amazon.awscdk.services.lex.CfnBot.InputContextProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface BotLocaleProperty {
    public fun customVocabulary(): Any? = unwrap(this).getCustomVocabulary()

    public fun description(): String? = unwrap(this).getDescription()

    public fun intents(): Any? = unwrap(this).getIntents()

    public fun localeId(): String

    public fun nluConfidenceThreshold(): Number

    public fun slotTypes(): Any? = unwrap(this).getSlotTypes()

    public fun voiceSettings(): Any? = unwrap(this).getVoiceSettings()

    public interface Builder {
      public fun customVocabulary(customVocabulary: IResolvable)

      public fun customVocabulary(customVocabulary: CustomVocabularyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("65dfe13f14c779d54415272b16ac5df48588c99bbd224c3caedc359e73428c1a")
      public fun customVocabulary(customVocabulary: CustomVocabularyProperty.Builder.() -> Unit)

      public fun description(description: String)

      public fun intents(intents: IResolvable)

      public fun intents(intents: List<Any>)

      public fun localeId(localeId: String)

      public fun nluConfidenceThreshold(nluConfidenceThreshold: Number)

      public fun slotTypes(slotTypes: IResolvable)

      public fun slotTypes(slotTypes: List<Any>)

      public fun voiceSettings(voiceSettings: IResolvable)

      public fun voiceSettings(voiceSettings: VoiceSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f134e87e6455eb7ee5f8d312b4bb55381e0723a5544fd753a59801b52965ded9")
      public fun voiceSettings(voiceSettings: VoiceSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBot.BotLocaleProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.BotLocaleProperty.builder()

      override fun customVocabulary(customVocabulary: IResolvable) {
        cdkBuilder.customVocabulary(customVocabulary.let(IResolvable::unwrap))
      }

      override fun customVocabulary(customVocabulary: CustomVocabularyProperty) {
        cdkBuilder.customVocabulary(customVocabulary.let(CustomVocabularyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("65dfe13f14c779d54415272b16ac5df48588c99bbd224c3caedc359e73428c1a")
      override fun customVocabulary(customVocabulary: CustomVocabularyProperty.Builder.() -> Unit):
          Unit = customVocabulary(CustomVocabularyProperty(customVocabulary))

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun intents(intents: IResolvable) {
        cdkBuilder.intents(intents.let(IResolvable::unwrap))
      }

      override fun intents(intents: List<Any>) {
        cdkBuilder.intents(intents)
      }

      override fun localeId(localeId: String) {
        cdkBuilder.localeId(localeId)
      }

      override fun nluConfidenceThreshold(nluConfidenceThreshold: Number) {
        cdkBuilder.nluConfidenceThreshold(nluConfidenceThreshold)
      }

      override fun slotTypes(slotTypes: IResolvable) {
        cdkBuilder.slotTypes(slotTypes.let(IResolvable::unwrap))
      }

      override fun slotTypes(slotTypes: List<Any>) {
        cdkBuilder.slotTypes(slotTypes)
      }

      override fun voiceSettings(voiceSettings: IResolvable) {
        cdkBuilder.voiceSettings(voiceSettings.let(IResolvable::unwrap))
      }

      override fun voiceSettings(voiceSettings: VoiceSettingsProperty) {
        cdkBuilder.voiceSettings(voiceSettings.let(VoiceSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f134e87e6455eb7ee5f8d312b4bb55381e0723a5544fd753a59801b52965ded9")
      override fun voiceSettings(voiceSettings: VoiceSettingsProperty.Builder.() -> Unit): Unit =
          voiceSettings(VoiceSettingsProperty(voiceSettings))

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.BotLocaleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.BotLocaleProperty,
    ) : BotLocaleProperty {
      override fun customVocabulary(): Any? = unwrap(this).getCustomVocabulary()

      override fun description(): String? = unwrap(this).getDescription()

      override fun intents(): Any? = unwrap(this).getIntents()

      override fun localeId(): String = unwrap(this).getLocaleId()

      override fun nluConfidenceThreshold(): Number = unwrap(this).getNluConfidenceThreshold()

      override fun slotTypes(): Any? = unwrap(this).getSlotTypes()

      override fun voiceSettings(): Any? = unwrap(this).getVoiceSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BotLocaleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.BotLocaleProperty):
          BotLocaleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BotLocaleProperty):
          software.amazon.awscdk.services.lex.CfnBot.BotLocaleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AudioSpecificationProperty {
    public fun endTimeoutMs(): Number

    public fun maxLengthMs(): Number

    public interface Builder {
      public fun endTimeoutMs(endTimeoutMs: Number)

      public fun maxLengthMs(maxLengthMs: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.AudioSpecificationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.AudioSpecificationProperty.builder()

      override fun endTimeoutMs(endTimeoutMs: Number) {
        cdkBuilder.endTimeoutMs(endTimeoutMs)
      }

      override fun maxLengthMs(maxLengthMs: Number) {
        cdkBuilder.maxLengthMs(maxLengthMs)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.AudioSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.AudioSpecificationProperty,
    ) : AudioSpecificationProperty {
      override fun endTimeoutMs(): Number = unwrap(this).getEndTimeoutMs()

      override fun maxLengthMs(): Number = unwrap(this).getMaxLengthMs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AudioSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.AudioSpecificationProperty):
          AudioSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.AudioSpecificationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ExternalSourceSettingProperty {
    public fun grammarSlotTypeSetting(): Any? = unwrap(this).getGrammarSlotTypeSetting()

    public interface Builder {
      public fun grammarSlotTypeSetting(grammarSlotTypeSetting: IResolvable)

      public fun grammarSlotTypeSetting(grammarSlotTypeSetting: GrammarSlotTypeSettingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67a5bea02d3584199169146146c5d37293a9ab2b277e6718183f8f2c2428f584")
      public
          fun grammarSlotTypeSetting(grammarSlotTypeSetting: GrammarSlotTypeSettingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.ExternalSourceSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.ExternalSourceSettingProperty.builder()

      override fun grammarSlotTypeSetting(grammarSlotTypeSetting: IResolvable) {
        cdkBuilder.grammarSlotTypeSetting(grammarSlotTypeSetting.let(IResolvable::unwrap))
      }

      override fun grammarSlotTypeSetting(grammarSlotTypeSetting: GrammarSlotTypeSettingProperty) {
        cdkBuilder.grammarSlotTypeSetting(grammarSlotTypeSetting.let(GrammarSlotTypeSettingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67a5bea02d3584199169146146c5d37293a9ab2b277e6718183f8f2c2428f584")
      override
          fun grammarSlotTypeSetting(grammarSlotTypeSetting: GrammarSlotTypeSettingProperty.Builder.() -> Unit):
          Unit = grammarSlotTypeSetting(GrammarSlotTypeSettingProperty(grammarSlotTypeSetting))

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.ExternalSourceSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.ExternalSourceSettingProperty,
    ) : ExternalSourceSettingProperty {
      override fun grammarSlotTypeSetting(): Any? = unwrap(this).getGrammarSlotTypeSetting()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ExternalSourceSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.ExternalSourceSettingProperty):
          ExternalSourceSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExternalSourceSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.ExternalSourceSettingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SlotCaptureSettingProperty {
    public fun captureConditional(): Any? = unwrap(this).getCaptureConditional()

    public fun captureNextStep(): Any? = unwrap(this).getCaptureNextStep()

    public fun captureResponse(): Any? = unwrap(this).getCaptureResponse()

    public fun codeHook(): Any? = unwrap(this).getCodeHook()

    public fun elicitationCodeHook(): Any? = unwrap(this).getElicitationCodeHook()

    public fun failureConditional(): Any? = unwrap(this).getFailureConditional()

    public fun failureNextStep(): Any? = unwrap(this).getFailureNextStep()

    public fun failureResponse(): Any? = unwrap(this).getFailureResponse()

    public interface Builder {
      public fun captureConditional(captureConditional: IResolvable)

      public fun captureConditional(captureConditional: ConditionalSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab778a9743668c9b489e34c54e37e26aafe861c2a38028f3abd075c198c5de4b")
      public
          fun captureConditional(captureConditional: ConditionalSpecificationProperty.Builder.() -> Unit)

      public fun captureNextStep(captureNextStep: IResolvable)

      public fun captureNextStep(captureNextStep: DialogStateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab41fd42e2785717c003a9150dc29f5a1d5ee67b95e91fd396144962d6bf3ec1")
      public fun captureNextStep(captureNextStep: DialogStateProperty.Builder.() -> Unit)

      public fun captureResponse(captureResponse: IResolvable)

      public fun captureResponse(captureResponse: ResponseSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b400d46b46cf59c0fb2dcb7e7183a0e8524fb314fe7c0d7269863f19400b9f61")
      public fun captureResponse(captureResponse: ResponseSpecificationProperty.Builder.() -> Unit)

      public fun codeHook(codeHook: IResolvable)

      public fun codeHook(codeHook: DialogCodeHookInvocationSettingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("94d702197c0c43ec9f01570afaa570cb86bf321ab8ed2bde4a092ef4d50fdb0e")
      public fun codeHook(codeHook: DialogCodeHookInvocationSettingProperty.Builder.() -> Unit)

      public fun elicitationCodeHook(elicitationCodeHook: IResolvable)

      public
          fun elicitationCodeHook(elicitationCodeHook: ElicitationCodeHookInvocationSettingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ecbb8fa3a252c59ab75da2f7dc71b60fc765a00ae22f4f9d642b36d737a5be6f")
      public
          fun elicitationCodeHook(elicitationCodeHook: ElicitationCodeHookInvocationSettingProperty.Builder.() -> Unit)

      public fun failureConditional(failureConditional: IResolvable)

      public fun failureConditional(failureConditional: ConditionalSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c379ecef2bd867ec42dcb89c3d6af461135ca5449c366608d273896493c49c9a")
      public
          fun failureConditional(failureConditional: ConditionalSpecificationProperty.Builder.() -> Unit)

      public fun failureNextStep(failureNextStep: IResolvable)

      public fun failureNextStep(failureNextStep: DialogStateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0c9d3b218631a6f4b2c8d1e7eef3c6d2d2b6fb238d7a0873cbb4d2b43f80c738")
      public fun failureNextStep(failureNextStep: DialogStateProperty.Builder.() -> Unit)

      public fun failureResponse(failureResponse: IResolvable)

      public fun failureResponse(failureResponse: ResponseSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c8611a775515012c2f5130aa6dab6b6ec571c722dc70b5d8ba3482b015bb8ee")
      public fun failureResponse(failureResponse: ResponseSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.SlotCaptureSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SlotCaptureSettingProperty.builder()

      override fun captureConditional(captureConditional: IResolvable) {
        cdkBuilder.captureConditional(captureConditional.let(IResolvable::unwrap))
      }

      override fun captureConditional(captureConditional: ConditionalSpecificationProperty) {
        cdkBuilder.captureConditional(captureConditional.let(ConditionalSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab778a9743668c9b489e34c54e37e26aafe861c2a38028f3abd075c198c5de4b")
      override
          fun captureConditional(captureConditional: ConditionalSpecificationProperty.Builder.() -> Unit):
          Unit = captureConditional(ConditionalSpecificationProperty(captureConditional))

      override fun captureNextStep(captureNextStep: IResolvable) {
        cdkBuilder.captureNextStep(captureNextStep.let(IResolvable::unwrap))
      }

      override fun captureNextStep(captureNextStep: DialogStateProperty) {
        cdkBuilder.captureNextStep(captureNextStep.let(DialogStateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab41fd42e2785717c003a9150dc29f5a1d5ee67b95e91fd396144962d6bf3ec1")
      override fun captureNextStep(captureNextStep: DialogStateProperty.Builder.() -> Unit): Unit =
          captureNextStep(DialogStateProperty(captureNextStep))

      override fun captureResponse(captureResponse: IResolvable) {
        cdkBuilder.captureResponse(captureResponse.let(IResolvable::unwrap))
      }

      override fun captureResponse(captureResponse: ResponseSpecificationProperty) {
        cdkBuilder.captureResponse(captureResponse.let(ResponseSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b400d46b46cf59c0fb2dcb7e7183a0e8524fb314fe7c0d7269863f19400b9f61")
      override
          fun captureResponse(captureResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = captureResponse(ResponseSpecificationProperty(captureResponse))

      override fun codeHook(codeHook: IResolvable) {
        cdkBuilder.codeHook(codeHook.let(IResolvable::unwrap))
      }

      override fun codeHook(codeHook: DialogCodeHookInvocationSettingProperty) {
        cdkBuilder.codeHook(codeHook.let(DialogCodeHookInvocationSettingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("94d702197c0c43ec9f01570afaa570cb86bf321ab8ed2bde4a092ef4d50fdb0e")
      override fun codeHook(codeHook: DialogCodeHookInvocationSettingProperty.Builder.() -> Unit):
          Unit = codeHook(DialogCodeHookInvocationSettingProperty(codeHook))

      override fun elicitationCodeHook(elicitationCodeHook: IResolvable) {
        cdkBuilder.elicitationCodeHook(elicitationCodeHook.let(IResolvable::unwrap))
      }

      override
          fun elicitationCodeHook(elicitationCodeHook: ElicitationCodeHookInvocationSettingProperty) {
        cdkBuilder.elicitationCodeHook(elicitationCodeHook.let(ElicitationCodeHookInvocationSettingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ecbb8fa3a252c59ab75da2f7dc71b60fc765a00ae22f4f9d642b36d737a5be6f")
      override
          fun elicitationCodeHook(elicitationCodeHook: ElicitationCodeHookInvocationSettingProperty.Builder.() -> Unit):
          Unit =
          elicitationCodeHook(ElicitationCodeHookInvocationSettingProperty(elicitationCodeHook))

      override fun failureConditional(failureConditional: IResolvable) {
        cdkBuilder.failureConditional(failureConditional.let(IResolvable::unwrap))
      }

      override fun failureConditional(failureConditional: ConditionalSpecificationProperty) {
        cdkBuilder.failureConditional(failureConditional.let(ConditionalSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c379ecef2bd867ec42dcb89c3d6af461135ca5449c366608d273896493c49c9a")
      override
          fun failureConditional(failureConditional: ConditionalSpecificationProperty.Builder.() -> Unit):
          Unit = failureConditional(ConditionalSpecificationProperty(failureConditional))

      override fun failureNextStep(failureNextStep: IResolvable) {
        cdkBuilder.failureNextStep(failureNextStep.let(IResolvable::unwrap))
      }

      override fun failureNextStep(failureNextStep: DialogStateProperty) {
        cdkBuilder.failureNextStep(failureNextStep.let(DialogStateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0c9d3b218631a6f4b2c8d1e7eef3c6d2d2b6fb238d7a0873cbb4d2b43f80c738")
      override fun failureNextStep(failureNextStep: DialogStateProperty.Builder.() -> Unit): Unit =
          failureNextStep(DialogStateProperty(failureNextStep))

      override fun failureResponse(failureResponse: IResolvable) {
        cdkBuilder.failureResponse(failureResponse.let(IResolvable::unwrap))
      }

      override fun failureResponse(failureResponse: ResponseSpecificationProperty) {
        cdkBuilder.failureResponse(failureResponse.let(ResponseSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c8611a775515012c2f5130aa6dab6b6ec571c722dc70b5d8ba3482b015bb8ee")
      override
          fun failureResponse(failureResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = failureResponse(ResponseSpecificationProperty(failureResponse))

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.SlotCaptureSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotCaptureSettingProperty,
    ) : SlotCaptureSettingProperty {
      override fun captureConditional(): Any? = unwrap(this).getCaptureConditional()

      override fun captureNextStep(): Any? = unwrap(this).getCaptureNextStep()

      override fun captureResponse(): Any? = unwrap(this).getCaptureResponse()

      override fun codeHook(): Any? = unwrap(this).getCodeHook()

      override fun elicitationCodeHook(): Any? = unwrap(this).getElicitationCodeHook()

      override fun failureConditional(): Any? = unwrap(this).getFailureConditional()

      override fun failureNextStep(): Any? = unwrap(this).getFailureNextStep()

      override fun failureResponse(): Any? = unwrap(this).getFailureResponse()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SlotCaptureSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotCaptureSettingProperty):
          SlotCaptureSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlotCaptureSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.SlotCaptureSettingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TextLogDestinationProperty {
    public fun cloudWatch(): Any

    public interface Builder {
      public fun cloudWatch(cloudWatch: IResolvable)

      public fun cloudWatch(cloudWatch: CloudWatchLogGroupLogDestinationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be64bac3de00d01346f54f60a4e21c356bc520e4c6fad6a2a6e5260900b67a85")
      public fun cloudWatch(cloudWatch: CloudWatchLogGroupLogDestinationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.TextLogDestinationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.TextLogDestinationProperty.builder()

      override fun cloudWatch(cloudWatch: IResolvable) {
        cdkBuilder.cloudWatch(cloudWatch.let(IResolvable::unwrap))
      }

      override fun cloudWatch(cloudWatch: CloudWatchLogGroupLogDestinationProperty) {
        cdkBuilder.cloudWatch(cloudWatch.let(CloudWatchLogGroupLogDestinationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be64bac3de00d01346f54f60a4e21c356bc520e4c6fad6a2a6e5260900b67a85")
      override
          fun cloudWatch(cloudWatch: CloudWatchLogGroupLogDestinationProperty.Builder.() -> Unit):
          Unit = cloudWatch(CloudWatchLogGroupLogDestinationProperty(cloudWatch))

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.TextLogDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.TextLogDestinationProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.TextLogDestinationProperty):
          TextLogDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TextLogDestinationProperty):
          software.amazon.awscdk.services.lex.CfnBot.TextLogDestinationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SlotProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun multipleValuesSetting(): Any? = unwrap(this).getMultipleValuesSetting()

    public fun name(): String

    public fun obfuscationSetting(): Any? = unwrap(this).getObfuscationSetting()

    public fun slotTypeName(): String

    public fun valueElicitationSetting(): Any

    public interface Builder {
      public fun description(description: String)

      public fun multipleValuesSetting(multipleValuesSetting: IResolvable)

      public fun multipleValuesSetting(multipleValuesSetting: MultipleValuesSettingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ef612c6d2d1bb5f6394f09a29c3f4387174276c39df0ad78b7d5280ee774697")
      public
          fun multipleValuesSetting(multipleValuesSetting: MultipleValuesSettingProperty.Builder.() -> Unit)

      public fun name(name: String)

      public fun obfuscationSetting(obfuscationSetting: IResolvable)

      public fun obfuscationSetting(obfuscationSetting: ObfuscationSettingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f0f9c90510da76da50a9b4ec81140db04fb28d6ce1e927f86bd4732516a861d8")
      public
          fun obfuscationSetting(obfuscationSetting: ObfuscationSettingProperty.Builder.() -> Unit)

      public fun slotTypeName(slotTypeName: String)

      public fun valueElicitationSetting(valueElicitationSetting: IResolvable)

      public
          fun valueElicitationSetting(valueElicitationSetting: SlotValueElicitationSettingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5667e6bf1fe4e45df7bdeaae49d8f0b751048d8ac7c80538f2bc1ca0377c68f6")
      public
          fun valueElicitationSetting(valueElicitationSetting: SlotValueElicitationSettingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBot.SlotProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SlotProperty.builder()

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun multipleValuesSetting(multipleValuesSetting: IResolvable) {
        cdkBuilder.multipleValuesSetting(multipleValuesSetting.let(IResolvable::unwrap))
      }

      override fun multipleValuesSetting(multipleValuesSetting: MultipleValuesSettingProperty) {
        cdkBuilder.multipleValuesSetting(multipleValuesSetting.let(MultipleValuesSettingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ef612c6d2d1bb5f6394f09a29c3f4387174276c39df0ad78b7d5280ee774697")
      override
          fun multipleValuesSetting(multipleValuesSetting: MultipleValuesSettingProperty.Builder.() -> Unit):
          Unit = multipleValuesSetting(MultipleValuesSettingProperty(multipleValuesSetting))

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun obfuscationSetting(obfuscationSetting: IResolvable) {
        cdkBuilder.obfuscationSetting(obfuscationSetting.let(IResolvable::unwrap))
      }

      override fun obfuscationSetting(obfuscationSetting: ObfuscationSettingProperty) {
        cdkBuilder.obfuscationSetting(obfuscationSetting.let(ObfuscationSettingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f0f9c90510da76da50a9b4ec81140db04fb28d6ce1e927f86bd4732516a861d8")
      override
          fun obfuscationSetting(obfuscationSetting: ObfuscationSettingProperty.Builder.() -> Unit):
          Unit = obfuscationSetting(ObfuscationSettingProperty(obfuscationSetting))

      override fun slotTypeName(slotTypeName: String) {
        cdkBuilder.slotTypeName(slotTypeName)
      }

      override fun valueElicitationSetting(valueElicitationSetting: IResolvable) {
        cdkBuilder.valueElicitationSetting(valueElicitationSetting.let(IResolvable::unwrap))
      }

      override
          fun valueElicitationSetting(valueElicitationSetting: SlotValueElicitationSettingProperty) {
        cdkBuilder.valueElicitationSetting(valueElicitationSetting.let(SlotValueElicitationSettingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5667e6bf1fe4e45df7bdeaae49d8f0b751048d8ac7c80538f2bc1ca0377c68f6")
      override
          fun valueElicitationSetting(valueElicitationSetting: SlotValueElicitationSettingProperty.Builder.() -> Unit):
          Unit =
          valueElicitationSetting(SlotValueElicitationSettingProperty(valueElicitationSetting))

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.SlotProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotProperty,
    ) : SlotProperty {
      override fun description(): String? = unwrap(this).getDescription()

      override fun multipleValuesSetting(): Any? = unwrap(this).getMultipleValuesSetting()

      override fun name(): String = unwrap(this).getName()

      override fun obfuscationSetting(): Any? = unwrap(this).getObfuscationSetting()

      override fun slotTypeName(): String = unwrap(this).getSlotTypeName()

      override fun valueElicitationSetting(): Any = unwrap(this).getValueElicitationSetting()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SlotProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotProperty):
          SlotProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlotProperty):
          software.amazon.awscdk.services.lex.CfnBot.SlotProperty = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SlotTypeValueProperty {
    public fun sampleValue(): Any

    public fun synonyms(): Any? = unwrap(this).getSynonyms()

    public interface Builder {
      public fun sampleValue(sampleValue: IResolvable)

      public fun sampleValue(sampleValue: SampleValueProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f64f1a21fcbab008dc39908066f977fbb3c585d14768223bc9674dceff9f3e09")
      public fun sampleValue(sampleValue: SampleValueProperty.Builder.() -> Unit)

      public fun synonyms(synonyms: IResolvable)

      public fun synonyms(synonyms: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.SlotTypeValueProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SlotTypeValueProperty.builder()

      override fun sampleValue(sampleValue: IResolvable) {
        cdkBuilder.sampleValue(sampleValue.let(IResolvable::unwrap))
      }

      override fun sampleValue(sampleValue: SampleValueProperty) {
        cdkBuilder.sampleValue(sampleValue.let(SampleValueProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f64f1a21fcbab008dc39908066f977fbb3c585d14768223bc9674dceff9f3e09")
      override fun sampleValue(sampleValue: SampleValueProperty.Builder.() -> Unit): Unit =
          sampleValue(SampleValueProperty(sampleValue))

      override fun synonyms(synonyms: IResolvable) {
        cdkBuilder.synonyms(synonyms.let(IResolvable::unwrap))
      }

      override fun synonyms(synonyms: List<Any>) {
        cdkBuilder.synonyms(synonyms)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.SlotTypeValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotTypeValueProperty,
    ) : SlotTypeValueProperty {
      override fun sampleValue(): Any = unwrap(this).getSampleValue()

      override fun synonyms(): Any? = unwrap(this).getSynonyms()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SlotTypeValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotTypeValueProperty):
          SlotTypeValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlotTypeValueProperty):
          software.amazon.awscdk.services.lex.CfnBot.SlotTypeValueProperty = (wrapped as
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
      @JvmName("b48b1b9d92d9610281def2c0162f6b1c71ed8f00b794f299fa8ee02e3768522c")
      public
          fun botAliasLocaleSetting(botAliasLocaleSetting: BotAliasLocaleSettingsProperty.Builder.() -> Unit)

      public fun localeId(localeId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.BotAliasLocaleSettingsItemProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.BotAliasLocaleSettingsItemProperty.builder()

      override fun botAliasLocaleSetting(botAliasLocaleSetting: IResolvable) {
        cdkBuilder.botAliasLocaleSetting(botAliasLocaleSetting.let(IResolvable::unwrap))
      }

      override fun botAliasLocaleSetting(botAliasLocaleSetting: BotAliasLocaleSettingsProperty) {
        cdkBuilder.botAliasLocaleSetting(botAliasLocaleSetting.let(BotAliasLocaleSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b48b1b9d92d9610281def2c0162f6b1c71ed8f00b794f299fa8ee02e3768522c")
      override
          fun botAliasLocaleSetting(botAliasLocaleSetting: BotAliasLocaleSettingsProperty.Builder.() -> Unit):
          Unit = botAliasLocaleSetting(BotAliasLocaleSettingsProperty(botAliasLocaleSetting))

      override fun localeId(localeId: String) {
        cdkBuilder.localeId(localeId)
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.BotAliasLocaleSettingsItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.BotAliasLocaleSettingsItemProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.BotAliasLocaleSettingsItemProperty):
          BotAliasLocaleSettingsItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BotAliasLocaleSettingsItemProperty):
          software.amazon.awscdk.services.lex.CfnBot.BotAliasLocaleSettingsItemProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface CustomVocabularyItemProperty {
    public fun displayAs(): String? = unwrap(this).getDisplayAs()

    public fun phrase(): String

    public fun weight(): Number? = unwrap(this).getWeight()

    public interface Builder {
      public fun displayAs(displayAs: String)

      public fun phrase(phrase: String)

      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.CustomVocabularyItemProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.CustomVocabularyItemProperty.builder()

      override fun displayAs(displayAs: String) {
        cdkBuilder.displayAs(displayAs)
      }

      override fun phrase(phrase: String) {
        cdkBuilder.phrase(phrase)
      }

      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.CustomVocabularyItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.CustomVocabularyItemProperty,
    ) : CustomVocabularyItemProperty {
      override fun displayAs(): String? = unwrap(this).getDisplayAs()

      override fun phrase(): String = unwrap(this).getPhrase()

      override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomVocabularyItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.CustomVocabularyItemProperty):
          CustomVocabularyItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomVocabularyItemProperty):
          software.amazon.awscdk.services.lex.CfnBot.CustomVocabularyItemProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MultipleValuesSettingProperty {
    public fun allowMultipleValues(): Any? = unwrap(this).getAllowMultipleValues()

    public interface Builder {
      public fun allowMultipleValues(allowMultipleValues: Boolean)

      public fun allowMultipleValues(allowMultipleValues: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.MultipleValuesSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.MultipleValuesSettingProperty.builder()

      override fun allowMultipleValues(allowMultipleValues: Boolean) {
        cdkBuilder.allowMultipleValues(allowMultipleValues)
      }

      override fun allowMultipleValues(allowMultipleValues: IResolvable) {
        cdkBuilder.allowMultipleValues(allowMultipleValues.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.MultipleValuesSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.MultipleValuesSettingProperty,
    ) : MultipleValuesSettingProperty {
      override fun allowMultipleValues(): Any? = unwrap(this).getAllowMultipleValues()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MultipleValuesSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.MultipleValuesSettingProperty):
          MultipleValuesSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MultipleValuesSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.MultipleValuesSettingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CustomVocabularyProperty {
    public fun customVocabularyItems(): Any

    public interface Builder {
      public fun customVocabularyItems(customVocabularyItems: IResolvable)

      public fun customVocabularyItems(customVocabularyItems: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.CustomVocabularyProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.CustomVocabularyProperty.builder()

      override fun customVocabularyItems(customVocabularyItems: IResolvable) {
        cdkBuilder.customVocabularyItems(customVocabularyItems.let(IResolvable::unwrap))
      }

      override fun customVocabularyItems(customVocabularyItems: List<Any>) {
        cdkBuilder.customVocabularyItems(customVocabularyItems)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.CustomVocabularyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.CustomVocabularyProperty,
    ) : CustomVocabularyProperty {
      override fun customVocabularyItems(): Any = unwrap(this).getCustomVocabularyItems()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomVocabularyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.CustomVocabularyProperty):
          CustomVocabularyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomVocabularyProperty):
          software.amazon.awscdk.services.lex.CfnBot.CustomVocabularyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ButtonProperty {
    public fun text(): String

    public fun `value`(): String

    public interface Builder {
      public fun text(text: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBot.ButtonProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.ButtonProperty.builder()

      override fun text(text: String) {
        cdkBuilder.text(text)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.ButtonProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.ButtonProperty,
    ) : ButtonProperty {
      override fun text(): String = unwrap(this).getText()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ButtonProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.ButtonProperty):
          ButtonProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ButtonProperty):
          software.amazon.awscdk.services.lex.CfnBot.ButtonProperty = (wrapped as Wrapper).cdkObject
    }
  }

  public interface IntentProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun dialogCodeHook(): Any? = unwrap(this).getDialogCodeHook()

    public fun fulfillmentCodeHook(): Any? = unwrap(this).getFulfillmentCodeHook()

    public fun initialResponseSetting(): Any? = unwrap(this).getInitialResponseSetting()

    public fun inputContexts(): Any? = unwrap(this).getInputContexts()

    public fun intentClosingSetting(): Any? = unwrap(this).getIntentClosingSetting()

    public fun intentConfirmationSetting(): Any? = unwrap(this).getIntentConfirmationSetting()

    public fun kendraConfiguration(): Any? = unwrap(this).getKendraConfiguration()

    public fun name(): String

    public fun outputContexts(): Any? = unwrap(this).getOutputContexts()

    public fun parentIntentSignature(): String? = unwrap(this).getParentIntentSignature()

    public fun sampleUtterances(): Any? = unwrap(this).getSampleUtterances()

    public fun slotPriorities(): Any? = unwrap(this).getSlotPriorities()

    public fun slots(): Any? = unwrap(this).getSlots()

    public interface Builder {
      public fun description(description: String)

      public fun dialogCodeHook(dialogCodeHook: IResolvable)

      public fun dialogCodeHook(dialogCodeHook: DialogCodeHookSettingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dd39ac17fff5db7791f1f714b8f7127ce5150acaf5b3270cc9cc28da6a245466")
      public fun dialogCodeHook(dialogCodeHook: DialogCodeHookSettingProperty.Builder.() -> Unit)

      public fun fulfillmentCodeHook(fulfillmentCodeHook: IResolvable)

      public fun fulfillmentCodeHook(fulfillmentCodeHook: FulfillmentCodeHookSettingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("294e7b64b8f85d1ba4b9669431e5b74665aa29a518b189da5513b351cb690e02")
      public
          fun fulfillmentCodeHook(fulfillmentCodeHook: FulfillmentCodeHookSettingProperty.Builder.() -> Unit)

      public fun initialResponseSetting(initialResponseSetting: IResolvable)

      public fun initialResponseSetting(initialResponseSetting: InitialResponseSettingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2df798c6f4f7c1a845184570424dc16f459557ed3bdaa829074d984c591a23ec")
      public
          fun initialResponseSetting(initialResponseSetting: InitialResponseSettingProperty.Builder.() -> Unit)

      public fun inputContexts(inputContexts: IResolvable)

      public fun inputContexts(inputContexts: List<Any>)

      public fun intentClosingSetting(intentClosingSetting: IResolvable)

      public fun intentClosingSetting(intentClosingSetting: IntentClosingSettingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9816be14646177b7f3cd178fa9c093ac2245d32feca4e0d1787621fe249bd62")
      public
          fun intentClosingSetting(intentClosingSetting: IntentClosingSettingProperty.Builder.() -> Unit)

      public fun intentConfirmationSetting(intentConfirmationSetting: IResolvable)

      public
          fun intentConfirmationSetting(intentConfirmationSetting: IntentConfirmationSettingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("541e03c3b04b7f06b7b5864b6f77f8f8be389695028a4dacae2ce32c37fc46f2")
      public
          fun intentConfirmationSetting(intentConfirmationSetting: IntentConfirmationSettingProperty.Builder.() -> Unit)

      public fun kendraConfiguration(kendraConfiguration: IResolvable)

      public fun kendraConfiguration(kendraConfiguration: KendraConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("838e421c92ce42d573ced09a9bc3ca8ad3f8d86a03d2b11bed05ef5dd44b451f")
      public
          fun kendraConfiguration(kendraConfiguration: KendraConfigurationProperty.Builder.() -> Unit)

      public fun name(name: String)

      public fun outputContexts(outputContexts: IResolvable)

      public fun outputContexts(outputContexts: List<Any>)

      public fun parentIntentSignature(parentIntentSignature: String)

      public fun sampleUtterances(sampleUtterances: IResolvable)

      public fun sampleUtterances(sampleUtterances: List<Any>)

      public fun slotPriorities(slotPriorities: IResolvable)

      public fun slotPriorities(slotPriorities: List<Any>)

      public fun slots(slots: IResolvable)

      public fun slots(slots: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBot.IntentProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.IntentProperty.builder()

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun dialogCodeHook(dialogCodeHook: IResolvable) {
        cdkBuilder.dialogCodeHook(dialogCodeHook.let(IResolvable::unwrap))
      }

      override fun dialogCodeHook(dialogCodeHook: DialogCodeHookSettingProperty) {
        cdkBuilder.dialogCodeHook(dialogCodeHook.let(DialogCodeHookSettingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dd39ac17fff5db7791f1f714b8f7127ce5150acaf5b3270cc9cc28da6a245466")
      override fun dialogCodeHook(dialogCodeHook: DialogCodeHookSettingProperty.Builder.() -> Unit):
          Unit = dialogCodeHook(DialogCodeHookSettingProperty(dialogCodeHook))

      override fun fulfillmentCodeHook(fulfillmentCodeHook: IResolvable) {
        cdkBuilder.fulfillmentCodeHook(fulfillmentCodeHook.let(IResolvable::unwrap))
      }

      override fun fulfillmentCodeHook(fulfillmentCodeHook: FulfillmentCodeHookSettingProperty) {
        cdkBuilder.fulfillmentCodeHook(fulfillmentCodeHook.let(FulfillmentCodeHookSettingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("294e7b64b8f85d1ba4b9669431e5b74665aa29a518b189da5513b351cb690e02")
      override
          fun fulfillmentCodeHook(fulfillmentCodeHook: FulfillmentCodeHookSettingProperty.Builder.() -> Unit):
          Unit = fulfillmentCodeHook(FulfillmentCodeHookSettingProperty(fulfillmentCodeHook))

      override fun initialResponseSetting(initialResponseSetting: IResolvable) {
        cdkBuilder.initialResponseSetting(initialResponseSetting.let(IResolvable::unwrap))
      }

      override fun initialResponseSetting(initialResponseSetting: InitialResponseSettingProperty) {
        cdkBuilder.initialResponseSetting(initialResponseSetting.let(InitialResponseSettingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2df798c6f4f7c1a845184570424dc16f459557ed3bdaa829074d984c591a23ec")
      override
          fun initialResponseSetting(initialResponseSetting: InitialResponseSettingProperty.Builder.() -> Unit):
          Unit = initialResponseSetting(InitialResponseSettingProperty(initialResponseSetting))

      override fun inputContexts(inputContexts: IResolvable) {
        cdkBuilder.inputContexts(inputContexts.let(IResolvable::unwrap))
      }

      override fun inputContexts(inputContexts: List<Any>) {
        cdkBuilder.inputContexts(inputContexts)
      }

      override fun intentClosingSetting(intentClosingSetting: IResolvable) {
        cdkBuilder.intentClosingSetting(intentClosingSetting.let(IResolvable::unwrap))
      }

      override fun intentClosingSetting(intentClosingSetting: IntentClosingSettingProperty) {
        cdkBuilder.intentClosingSetting(intentClosingSetting.let(IntentClosingSettingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9816be14646177b7f3cd178fa9c093ac2245d32feca4e0d1787621fe249bd62")
      override
          fun intentClosingSetting(intentClosingSetting: IntentClosingSettingProperty.Builder.() -> Unit):
          Unit = intentClosingSetting(IntentClosingSettingProperty(intentClosingSetting))

      override fun intentConfirmationSetting(intentConfirmationSetting: IResolvable) {
        cdkBuilder.intentConfirmationSetting(intentConfirmationSetting.let(IResolvable::unwrap))
      }

      override
          fun intentConfirmationSetting(intentConfirmationSetting: IntentConfirmationSettingProperty) {
        cdkBuilder.intentConfirmationSetting(intentConfirmationSetting.let(IntentConfirmationSettingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("541e03c3b04b7f06b7b5864b6f77f8f8be389695028a4dacae2ce32c37fc46f2")
      override
          fun intentConfirmationSetting(intentConfirmationSetting: IntentConfirmationSettingProperty.Builder.() -> Unit):
          Unit =
          intentConfirmationSetting(IntentConfirmationSettingProperty(intentConfirmationSetting))

      override fun kendraConfiguration(kendraConfiguration: IResolvable) {
        cdkBuilder.kendraConfiguration(kendraConfiguration.let(IResolvable::unwrap))
      }

      override fun kendraConfiguration(kendraConfiguration: KendraConfigurationProperty) {
        cdkBuilder.kendraConfiguration(kendraConfiguration.let(KendraConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("838e421c92ce42d573ced09a9bc3ca8ad3f8d86a03d2b11bed05ef5dd44b451f")
      override
          fun kendraConfiguration(kendraConfiguration: KendraConfigurationProperty.Builder.() -> Unit):
          Unit = kendraConfiguration(KendraConfigurationProperty(kendraConfiguration))

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun outputContexts(outputContexts: IResolvable) {
        cdkBuilder.outputContexts(outputContexts.let(IResolvable::unwrap))
      }

      override fun outputContexts(outputContexts: List<Any>) {
        cdkBuilder.outputContexts(outputContexts)
      }

      override fun parentIntentSignature(parentIntentSignature: String) {
        cdkBuilder.parentIntentSignature(parentIntentSignature)
      }

      override fun sampleUtterances(sampleUtterances: IResolvable) {
        cdkBuilder.sampleUtterances(sampleUtterances.let(IResolvable::unwrap))
      }

      override fun sampleUtterances(sampleUtterances: List<Any>) {
        cdkBuilder.sampleUtterances(sampleUtterances)
      }

      override fun slotPriorities(slotPriorities: IResolvable) {
        cdkBuilder.slotPriorities(slotPriorities.let(IResolvable::unwrap))
      }

      override fun slotPriorities(slotPriorities: List<Any>) {
        cdkBuilder.slotPriorities(slotPriorities)
      }

      override fun slots(slots: IResolvable) {
        cdkBuilder.slots(slots.let(IResolvable::unwrap))
      }

      override fun slots(slots: List<Any>) {
        cdkBuilder.slots(slots)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.IntentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.IntentProperty,
    ) : IntentProperty {
      override fun description(): String? = unwrap(this).getDescription()

      override fun dialogCodeHook(): Any? = unwrap(this).getDialogCodeHook()

      override fun fulfillmentCodeHook(): Any? = unwrap(this).getFulfillmentCodeHook()

      override fun initialResponseSetting(): Any? = unwrap(this).getInitialResponseSetting()

      override fun inputContexts(): Any? = unwrap(this).getInputContexts()

      override fun intentClosingSetting(): Any? = unwrap(this).getIntentClosingSetting()

      override fun intentConfirmationSetting(): Any? = unwrap(this).getIntentConfirmationSetting()

      override fun kendraConfiguration(): Any? = unwrap(this).getKendraConfiguration()

      override fun name(): String = unwrap(this).getName()

      override fun outputContexts(): Any? = unwrap(this).getOutputContexts()

      override fun parentIntentSignature(): String? = unwrap(this).getParentIntentSignature()

      override fun sampleUtterances(): Any? = unwrap(this).getSampleUtterances()

      override fun slotPriorities(): Any? = unwrap(this).getSlotPriorities()

      override fun slots(): Any? = unwrap(this).getSlots()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IntentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.IntentProperty):
          IntentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntentProperty):
          software.amazon.awscdk.services.lex.CfnBot.IntentProperty = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConditionalSpecificationProperty {
    public fun conditionalBranches(): Any

    public fun defaultBranch(): Any

    public fun isActive(): Any

    public interface Builder {
      public fun conditionalBranches(conditionalBranches: IResolvable)

      public fun conditionalBranches(conditionalBranches: List<Any>)

      public fun defaultBranch(defaultBranch: IResolvable)

      public fun defaultBranch(defaultBranch: DefaultConditionalBranchProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8465b4eb64780ec7bd22a99567e635215386c79236bff84295669a1035c5e230")
      public fun defaultBranch(defaultBranch: DefaultConditionalBranchProperty.Builder.() -> Unit)

      public fun isActive(isActive: Boolean)

      public fun isActive(isActive: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.ConditionalSpecificationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.ConditionalSpecificationProperty.builder()

      override fun conditionalBranches(conditionalBranches: IResolvable) {
        cdkBuilder.conditionalBranches(conditionalBranches.let(IResolvable::unwrap))
      }

      override fun conditionalBranches(conditionalBranches: List<Any>) {
        cdkBuilder.conditionalBranches(conditionalBranches)
      }

      override fun defaultBranch(defaultBranch: IResolvable) {
        cdkBuilder.defaultBranch(defaultBranch.let(IResolvable::unwrap))
      }

      override fun defaultBranch(defaultBranch: DefaultConditionalBranchProperty) {
        cdkBuilder.defaultBranch(defaultBranch.let(DefaultConditionalBranchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8465b4eb64780ec7bd22a99567e635215386c79236bff84295669a1035c5e230")
      override
          fun defaultBranch(defaultBranch: DefaultConditionalBranchProperty.Builder.() -> Unit):
          Unit = defaultBranch(DefaultConditionalBranchProperty(defaultBranch))

      override fun isActive(isActive: Boolean) {
        cdkBuilder.isActive(isActive)
      }

      override fun isActive(isActive: IResolvable) {
        cdkBuilder.isActive(isActive.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.ConditionalSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.ConditionalSpecificationProperty,
    ) : ConditionalSpecificationProperty {
      override fun conditionalBranches(): Any = unwrap(this).getConditionalBranches()

      override fun defaultBranch(): Any = unwrap(this).getDefaultBranch()

      override fun isActive(): Any = unwrap(this).getIsActive()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConditionalSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.ConditionalSpecificationProperty):
          ConditionalSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionalSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.ConditionalSpecificationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface WaitAndContinueSpecificationProperty {
    public fun continueResponse(): Any

    public fun isActive(): Any? = unwrap(this).getIsActive()

    public fun stillWaitingResponse(): Any? = unwrap(this).getStillWaitingResponse()

    public fun waitingResponse(): Any

    public interface Builder {
      public fun continueResponse(continueResponse: IResolvable)

      public fun continueResponse(continueResponse: ResponseSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e5889c5819b57f84259e233c3acfa19ce049fe8aec310ccf64e2c4a64c23895b")
      public
          fun continueResponse(continueResponse: ResponseSpecificationProperty.Builder.() -> Unit)

      public fun isActive(isActive: Boolean)

      public fun isActive(isActive: IResolvable)

      public fun stillWaitingResponse(stillWaitingResponse: IResolvable)

      public
          fun stillWaitingResponse(stillWaitingResponse: StillWaitingResponseSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("50e76f045a54d99765858bed013f11ff7b39075f791515aca7024e1e1cb30367")
      public
          fun stillWaitingResponse(stillWaitingResponse: StillWaitingResponseSpecificationProperty.Builder.() -> Unit)

      public fun waitingResponse(waitingResponse: IResolvable)

      public fun waitingResponse(waitingResponse: ResponseSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc7ecb8f0705c40dd467ed09530661cd0971b0a4c725df17c83354ed6611243e")
      public fun waitingResponse(waitingResponse: ResponseSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.WaitAndContinueSpecificationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.WaitAndContinueSpecificationProperty.builder()

      override fun continueResponse(continueResponse: IResolvable) {
        cdkBuilder.continueResponse(continueResponse.let(IResolvable::unwrap))
      }

      override fun continueResponse(continueResponse: ResponseSpecificationProperty) {
        cdkBuilder.continueResponse(continueResponse.let(ResponseSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e5889c5819b57f84259e233c3acfa19ce049fe8aec310ccf64e2c4a64c23895b")
      override
          fun continueResponse(continueResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = continueResponse(ResponseSpecificationProperty(continueResponse))

      override fun isActive(isActive: Boolean) {
        cdkBuilder.isActive(isActive)
      }

      override fun isActive(isActive: IResolvable) {
        cdkBuilder.isActive(isActive.let(IResolvable::unwrap))
      }

      override fun stillWaitingResponse(stillWaitingResponse: IResolvable) {
        cdkBuilder.stillWaitingResponse(stillWaitingResponse.let(IResolvable::unwrap))
      }

      override
          fun stillWaitingResponse(stillWaitingResponse: StillWaitingResponseSpecificationProperty) {
        cdkBuilder.stillWaitingResponse(stillWaitingResponse.let(StillWaitingResponseSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("50e76f045a54d99765858bed013f11ff7b39075f791515aca7024e1e1cb30367")
      override
          fun stillWaitingResponse(stillWaitingResponse: StillWaitingResponseSpecificationProperty.Builder.() -> Unit):
          Unit =
          stillWaitingResponse(StillWaitingResponseSpecificationProperty(stillWaitingResponse))

      override fun waitingResponse(waitingResponse: IResolvable) {
        cdkBuilder.waitingResponse(waitingResponse.let(IResolvable::unwrap))
      }

      override fun waitingResponse(waitingResponse: ResponseSpecificationProperty) {
        cdkBuilder.waitingResponse(waitingResponse.let(ResponseSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc7ecb8f0705c40dd467ed09530661cd0971b0a4c725df17c83354ed6611243e")
      override
          fun waitingResponse(waitingResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = waitingResponse(ResponseSpecificationProperty(waitingResponse))

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.WaitAndContinueSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.WaitAndContinueSpecificationProperty,
    ) : WaitAndContinueSpecificationProperty {
      override fun continueResponse(): Any = unwrap(this).getContinueResponse()

      override fun isActive(): Any? = unwrap(this).getIsActive()

      override fun stillWaitingResponse(): Any? = unwrap(this).getStillWaitingResponse()

      override fun waitingResponse(): Any = unwrap(this).getWaitingResponse()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          WaitAndContinueSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.WaitAndContinueSpecificationProperty):
          WaitAndContinueSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WaitAndContinueSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.WaitAndContinueSpecificationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface SlotValueSelectionSettingProperty {
    public fun advancedRecognitionSetting(): Any? = unwrap(this).getAdvancedRecognitionSetting()

    public fun regexFilter(): Any? = unwrap(this).getRegexFilter()

    public fun resolutionStrategy(): String

    public interface Builder {
      public fun advancedRecognitionSetting(advancedRecognitionSetting: IResolvable)

      public
          fun advancedRecognitionSetting(advancedRecognitionSetting: AdvancedRecognitionSettingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("25322fb1374a8e4758774d328e6ab7067e49ba7b8835140e8a42238f614f5784")
      public
          fun advancedRecognitionSetting(advancedRecognitionSetting: AdvancedRecognitionSettingProperty.Builder.() -> Unit)

      public fun regexFilter(regexFilter: IResolvable)

      public fun regexFilter(regexFilter: SlotValueRegexFilterProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6e3e08624093d84f455b1e09b302ce537b99a0a539e30686943abbebc82091d")
      public fun regexFilter(regexFilter: SlotValueRegexFilterProperty.Builder.() -> Unit)

      public fun resolutionStrategy(resolutionStrategy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.SlotValueSelectionSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SlotValueSelectionSettingProperty.builder()

      override fun advancedRecognitionSetting(advancedRecognitionSetting: IResolvable) {
        cdkBuilder.advancedRecognitionSetting(advancedRecognitionSetting.let(IResolvable::unwrap))
      }

      override
          fun advancedRecognitionSetting(advancedRecognitionSetting: AdvancedRecognitionSettingProperty) {
        cdkBuilder.advancedRecognitionSetting(advancedRecognitionSetting.let(AdvancedRecognitionSettingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("25322fb1374a8e4758774d328e6ab7067e49ba7b8835140e8a42238f614f5784")
      override
          fun advancedRecognitionSetting(advancedRecognitionSetting: AdvancedRecognitionSettingProperty.Builder.() -> Unit):
          Unit =
          advancedRecognitionSetting(AdvancedRecognitionSettingProperty(advancedRecognitionSetting))

      override fun regexFilter(regexFilter: IResolvable) {
        cdkBuilder.regexFilter(regexFilter.let(IResolvable::unwrap))
      }

      override fun regexFilter(regexFilter: SlotValueRegexFilterProperty) {
        cdkBuilder.regexFilter(regexFilter.let(SlotValueRegexFilterProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6e3e08624093d84f455b1e09b302ce537b99a0a539e30686943abbebc82091d")
      override fun regexFilter(regexFilter: SlotValueRegexFilterProperty.Builder.() -> Unit): Unit =
          regexFilter(SlotValueRegexFilterProperty(regexFilter))

      override fun resolutionStrategy(resolutionStrategy: String) {
        cdkBuilder.resolutionStrategy(resolutionStrategy)
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.SlotValueSelectionSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.SlotValueSelectionSettingProperty,
    ) : SlotValueSelectionSettingProperty {
      override fun advancedRecognitionSetting(): Any? = unwrap(this).getAdvancedRecognitionSetting()

      override fun regexFilter(): Any? = unwrap(this).getRegexFilter()

      override fun resolutionStrategy(): String = unwrap(this).getResolutionStrategy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SlotValueSelectionSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotValueSelectionSettingProperty):
          SlotValueSelectionSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlotValueSelectionSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.SlotValueSelectionSettingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CustomPayloadProperty {
    public fun `value`(): String

    public interface Builder {
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.CustomPayloadProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.CustomPayloadProperty.builder()

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.CustomPayloadProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.CustomPayloadProperty,
    ) : CustomPayloadProperty {
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomPayloadProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.CustomPayloadProperty):
          CustomPayloadProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomPayloadProperty):
          software.amazon.awscdk.services.lex.CfnBot.CustomPayloadProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface KendraConfigurationProperty {
    public fun kendraIndex(): String

    public fun queryFilterString(): String? = unwrap(this).getQueryFilterString()

    public fun queryFilterStringEnabled(): Any? = unwrap(this).getQueryFilterStringEnabled()

    public interface Builder {
      public fun kendraIndex(kendraIndex: String)

      public fun queryFilterString(queryFilterString: String)

      public fun queryFilterStringEnabled(queryFilterStringEnabled: Boolean)

      public fun queryFilterStringEnabled(queryFilterStringEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.KendraConfigurationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.KendraConfigurationProperty.builder()

      override fun kendraIndex(kendraIndex: String) {
        cdkBuilder.kendraIndex(kendraIndex)
      }

      override fun queryFilterString(queryFilterString: String) {
        cdkBuilder.queryFilterString(queryFilterString)
      }

      override fun queryFilterStringEnabled(queryFilterStringEnabled: Boolean) {
        cdkBuilder.queryFilterStringEnabled(queryFilterStringEnabled)
      }

      override fun queryFilterStringEnabled(queryFilterStringEnabled: IResolvable) {
        cdkBuilder.queryFilterStringEnabled(queryFilterStringEnabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.KendraConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.KendraConfigurationProperty,
    ) : KendraConfigurationProperty {
      override fun kendraIndex(): String = unwrap(this).getKendraIndex()

      override fun queryFilterString(): String? = unwrap(this).getQueryFilterString()

      override fun queryFilterStringEnabled(): Any? = unwrap(this).getQueryFilterStringEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KendraConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.KendraConfigurationProperty):
          KendraConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KendraConfigurationProperty):
          software.amazon.awscdk.services.lex.CfnBot.KendraConfigurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VoiceSettingsProperty {
    public fun engine(): String? = unwrap(this).getEngine()

    public fun voiceId(): String

    public interface Builder {
      public fun engine(engine: String)

      public fun voiceId(voiceId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.VoiceSettingsProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.VoiceSettingsProperty.builder()

      override fun engine(engine: String) {
        cdkBuilder.engine(engine)
      }

      override fun voiceId(voiceId: String) {
        cdkBuilder.voiceId(voiceId)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.VoiceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.VoiceSettingsProperty,
    ) : VoiceSettingsProperty {
      override fun engine(): String? = unwrap(this).getEngine()

      override fun voiceId(): String = unwrap(this).getVoiceId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VoiceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.VoiceSettingsProperty):
          VoiceSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VoiceSettingsProperty):
          software.amazon.awscdk.services.lex.CfnBot.VoiceSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SlotDefaultValueProperty {
    public fun defaultValue(): String

    public interface Builder {
      public fun defaultValue(defaultValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.SlotDefaultValueProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SlotDefaultValueProperty.builder()

      override fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.SlotDefaultValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotDefaultValueProperty,
    ) : SlotDefaultValueProperty {
      override fun defaultValue(): String = unwrap(this).getDefaultValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SlotDefaultValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotDefaultValueProperty):
          SlotDefaultValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlotDefaultValueProperty):
          software.amazon.awscdk.services.lex.CfnBot.SlotDefaultValueProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SampleUtteranceProperty {
    public fun utterance(): String

    public interface Builder {
      public fun utterance(utterance: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.SampleUtteranceProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SampleUtteranceProperty.builder()

      override fun utterance(utterance: String) {
        cdkBuilder.utterance(utterance)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.SampleUtteranceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.SampleUtteranceProperty,
    ) : SampleUtteranceProperty {
      override fun utterance(): String = unwrap(this).getUtterance()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SampleUtteranceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SampleUtteranceProperty):
          SampleUtteranceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SampleUtteranceProperty):
          software.amazon.awscdk.services.lex.CfnBot.SampleUtteranceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CodeHookSpecificationProperty {
    public fun lambdaCodeHook(): Any

    public interface Builder {
      public fun lambdaCodeHook(lambdaCodeHook: IResolvable)

      public fun lambdaCodeHook(lambdaCodeHook: LambdaCodeHookProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f451ff6aa6641cca6cfeb3e15e5f3bf09cf1ac49c765ccc771440fd1aeca55fa")
      public fun lambdaCodeHook(lambdaCodeHook: LambdaCodeHookProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.CodeHookSpecificationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.CodeHookSpecificationProperty.builder()

      override fun lambdaCodeHook(lambdaCodeHook: IResolvable) {
        cdkBuilder.lambdaCodeHook(lambdaCodeHook.let(IResolvable::unwrap))
      }

      override fun lambdaCodeHook(lambdaCodeHook: LambdaCodeHookProperty) {
        cdkBuilder.lambdaCodeHook(lambdaCodeHook.let(LambdaCodeHookProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f451ff6aa6641cca6cfeb3e15e5f3bf09cf1ac49c765ccc771440fd1aeca55fa")
      override fun lambdaCodeHook(lambdaCodeHook: LambdaCodeHookProperty.Builder.() -> Unit): Unit =
          lambdaCodeHook(LambdaCodeHookProperty(lambdaCodeHook))

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.CodeHookSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.CodeHookSpecificationProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.CodeHookSpecificationProperty):
          CodeHookSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeHookSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.CodeHookSpecificationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MessageProperty {
    public fun customPayload(): Any? = unwrap(this).getCustomPayload()

    public fun imageResponseCard(): Any? = unwrap(this).getImageResponseCard()

    public fun plainTextMessage(): Any? = unwrap(this).getPlainTextMessage()

    public fun ssmlMessage(): Any? = unwrap(this).getSsmlMessage()

    public interface Builder {
      public fun customPayload(customPayload: IResolvable)

      public fun customPayload(customPayload: CustomPayloadProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad015830bece36c3a52b1a923a144b6dd7491f383507066dd16c6bb69ba05c13")
      public fun customPayload(customPayload: CustomPayloadProperty.Builder.() -> Unit)

      public fun imageResponseCard(imageResponseCard: IResolvable)

      public fun imageResponseCard(imageResponseCard: ImageResponseCardProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e671065ac1e2e419839b73ba7f95aebf7d9ee6409d3e26f73dc5ef6af1aae1d6")
      public fun imageResponseCard(imageResponseCard: ImageResponseCardProperty.Builder.() -> Unit)

      public fun plainTextMessage(plainTextMessage: IResolvable)

      public fun plainTextMessage(plainTextMessage: PlainTextMessageProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8a73fe42984d21f7eb1a975c1c2362430f1eeafc2e42225d1c83944b99bf243")
      public fun plainTextMessage(plainTextMessage: PlainTextMessageProperty.Builder.() -> Unit)

      public fun ssmlMessage(ssmlMessage: IResolvable)

      public fun ssmlMessage(ssmlMessage: SSMLMessageProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6e28d68ec63257dd97c8ef2e4cae6d6fc7f3ead425846e70dc9d73bb37ce21c")
      public fun ssmlMessage(ssmlMessage: SSMLMessageProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBot.MessageProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.MessageProperty.builder()

      override fun customPayload(customPayload: IResolvable) {
        cdkBuilder.customPayload(customPayload.let(IResolvable::unwrap))
      }

      override fun customPayload(customPayload: CustomPayloadProperty) {
        cdkBuilder.customPayload(customPayload.let(CustomPayloadProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad015830bece36c3a52b1a923a144b6dd7491f383507066dd16c6bb69ba05c13")
      override fun customPayload(customPayload: CustomPayloadProperty.Builder.() -> Unit): Unit =
          customPayload(CustomPayloadProperty(customPayload))

      override fun imageResponseCard(imageResponseCard: IResolvable) {
        cdkBuilder.imageResponseCard(imageResponseCard.let(IResolvable::unwrap))
      }

      override fun imageResponseCard(imageResponseCard: ImageResponseCardProperty) {
        cdkBuilder.imageResponseCard(imageResponseCard.let(ImageResponseCardProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e671065ac1e2e419839b73ba7f95aebf7d9ee6409d3e26f73dc5ef6af1aae1d6")
      override
          fun imageResponseCard(imageResponseCard: ImageResponseCardProperty.Builder.() -> Unit):
          Unit = imageResponseCard(ImageResponseCardProperty(imageResponseCard))

      override fun plainTextMessage(plainTextMessage: IResolvable) {
        cdkBuilder.plainTextMessage(plainTextMessage.let(IResolvable::unwrap))
      }

      override fun plainTextMessage(plainTextMessage: PlainTextMessageProperty) {
        cdkBuilder.plainTextMessage(plainTextMessage.let(PlainTextMessageProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8a73fe42984d21f7eb1a975c1c2362430f1eeafc2e42225d1c83944b99bf243")
      override fun plainTextMessage(plainTextMessage: PlainTextMessageProperty.Builder.() -> Unit):
          Unit = plainTextMessage(PlainTextMessageProperty(plainTextMessage))

      override fun ssmlMessage(ssmlMessage: IResolvable) {
        cdkBuilder.ssmlMessage(ssmlMessage.let(IResolvable::unwrap))
      }

      override fun ssmlMessage(ssmlMessage: SSMLMessageProperty) {
        cdkBuilder.ssmlMessage(ssmlMessage.let(SSMLMessageProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6e28d68ec63257dd97c8ef2e4cae6d6fc7f3ead425846e70dc9d73bb37ce21c")
      override fun ssmlMessage(ssmlMessage: SSMLMessageProperty.Builder.() -> Unit): Unit =
          ssmlMessage(SSMLMessageProperty(ssmlMessage))

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.MessageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.MessageProperty,
    ) : MessageProperty {
      override fun customPayload(): Any? = unwrap(this).getCustomPayload()

      override fun imageResponseCard(): Any? = unwrap(this).getImageResponseCard()

      override fun plainTextMessage(): Any? = unwrap(this).getPlainTextMessage()

      override fun ssmlMessage(): Any? = unwrap(this).getSsmlMessage()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MessageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.MessageProperty):
          MessageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MessageProperty):
          software.amazon.awscdk.services.lex.CfnBot.MessageProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface IntentConfirmationSettingProperty {
    public fun codeHook(): Any? = unwrap(this).getCodeHook()

    public fun confirmationConditional(): Any? = unwrap(this).getConfirmationConditional()

    public fun confirmationNextStep(): Any? = unwrap(this).getConfirmationNextStep()

    public fun confirmationResponse(): Any? = unwrap(this).getConfirmationResponse()

    public fun declinationConditional(): Any? = unwrap(this).getDeclinationConditional()

    public fun declinationNextStep(): Any? = unwrap(this).getDeclinationNextStep()

    public fun declinationResponse(): Any? = unwrap(this).getDeclinationResponse()

    public fun elicitationCodeHook(): Any? = unwrap(this).getElicitationCodeHook()

    public fun failureConditional(): Any? = unwrap(this).getFailureConditional()

    public fun failureNextStep(): Any? = unwrap(this).getFailureNextStep()

    public fun failureResponse(): Any? = unwrap(this).getFailureResponse()

    public fun isActive(): Any? = unwrap(this).getIsActive()

    public fun promptSpecification(): Any

    public interface Builder {
      public fun codeHook(codeHook: IResolvable)

      public fun codeHook(codeHook: DialogCodeHookInvocationSettingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f7107d5f225da12ceaddae026b72696337e6d0a863969dde0c8a63be776a093a")
      public fun codeHook(codeHook: DialogCodeHookInvocationSettingProperty.Builder.() -> Unit)

      public fun confirmationConditional(confirmationConditional: IResolvable)

      public fun confirmationConditional(confirmationConditional: ConditionalSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ebce763d168bdce2ea5f9704d99122b5391d7b9053ffddd1746e459045f2bf1e")
      public
          fun confirmationConditional(confirmationConditional: ConditionalSpecificationProperty.Builder.() -> Unit)

      public fun confirmationNextStep(confirmationNextStep: IResolvable)

      public fun confirmationNextStep(confirmationNextStep: DialogStateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("92252d01a23366c7f5af3fda3130a644232f17ec30b3e26fea5a0344fb0ce7c9")
      public fun confirmationNextStep(confirmationNextStep: DialogStateProperty.Builder.() -> Unit)

      public fun confirmationResponse(confirmationResponse: IResolvable)

      public fun confirmationResponse(confirmationResponse: ResponseSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab1133f530b5e02ebe17440bf0f63922e57873816cbd60f120151814326e0823")
      public
          fun confirmationResponse(confirmationResponse: ResponseSpecificationProperty.Builder.() -> Unit)

      public fun declinationConditional(declinationConditional: IResolvable)

      public fun declinationConditional(declinationConditional: ConditionalSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6dc8338a076e8b84a3bb90983fb81f61d2bbd0c27f9f05b59b17a05b8530221")
      public
          fun declinationConditional(declinationConditional: ConditionalSpecificationProperty.Builder.() -> Unit)

      public fun declinationNextStep(declinationNextStep: IResolvable)

      public fun declinationNextStep(declinationNextStep: DialogStateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("021dd7a73ddf2c8f8f3334cc0134247737ae805738911313c3a670457662721d")
      public fun declinationNextStep(declinationNextStep: DialogStateProperty.Builder.() -> Unit)

      public fun declinationResponse(declinationResponse: IResolvable)

      public fun declinationResponse(declinationResponse: ResponseSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("63c7c3e99fb1f82251b6c49854a3f7f9b1820b1170412a08b7d2d956ae5c6960")
      public
          fun declinationResponse(declinationResponse: ResponseSpecificationProperty.Builder.() -> Unit)

      public fun elicitationCodeHook(elicitationCodeHook: IResolvable)

      public
          fun elicitationCodeHook(elicitationCodeHook: ElicitationCodeHookInvocationSettingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b6346ae19c4090e5400a5ec1c8d86cbd011fc6511e3fada66887a0c55b511e29")
      public
          fun elicitationCodeHook(elicitationCodeHook: ElicitationCodeHookInvocationSettingProperty.Builder.() -> Unit)

      public fun failureConditional(failureConditional: IResolvable)

      public fun failureConditional(failureConditional: ConditionalSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c2ad47ab9541daa21cc17c5035f28b1b4ae211308bc4d9348ecfc2881eddd509")
      public
          fun failureConditional(failureConditional: ConditionalSpecificationProperty.Builder.() -> Unit)

      public fun failureNextStep(failureNextStep: IResolvable)

      public fun failureNextStep(failureNextStep: DialogStateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("20982cc55c34a1e521af5b7c64ec6662dc43942599a272e6d0501ff7524d4024")
      public fun failureNextStep(failureNextStep: DialogStateProperty.Builder.() -> Unit)

      public fun failureResponse(failureResponse: IResolvable)

      public fun failureResponse(failureResponse: ResponseSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ffb1d90267fddadbd9f91891428e148068d5ad8b985cc0f02d25a499328253d")
      public fun failureResponse(failureResponse: ResponseSpecificationProperty.Builder.() -> Unit)

      public fun isActive(isActive: Boolean)

      public fun isActive(isActive: IResolvable)

      public fun promptSpecification(promptSpecification: IResolvable)

      public fun promptSpecification(promptSpecification: PromptSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe263cbd2bd4f3d5018570e2b23e70ac31d7f3ad70a9b4df60008559a99bcd30")
      public
          fun promptSpecification(promptSpecification: PromptSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.IntentConfirmationSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.IntentConfirmationSettingProperty.builder()

      override fun codeHook(codeHook: IResolvable) {
        cdkBuilder.codeHook(codeHook.let(IResolvable::unwrap))
      }

      override fun codeHook(codeHook: DialogCodeHookInvocationSettingProperty) {
        cdkBuilder.codeHook(codeHook.let(DialogCodeHookInvocationSettingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f7107d5f225da12ceaddae026b72696337e6d0a863969dde0c8a63be776a093a")
      override fun codeHook(codeHook: DialogCodeHookInvocationSettingProperty.Builder.() -> Unit):
          Unit = codeHook(DialogCodeHookInvocationSettingProperty(codeHook))

      override fun confirmationConditional(confirmationConditional: IResolvable) {
        cdkBuilder.confirmationConditional(confirmationConditional.let(IResolvable::unwrap))
      }

      override
          fun confirmationConditional(confirmationConditional: ConditionalSpecificationProperty) {
        cdkBuilder.confirmationConditional(confirmationConditional.let(ConditionalSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ebce763d168bdce2ea5f9704d99122b5391d7b9053ffddd1746e459045f2bf1e")
      override
          fun confirmationConditional(confirmationConditional: ConditionalSpecificationProperty.Builder.() -> Unit):
          Unit = confirmationConditional(ConditionalSpecificationProperty(confirmationConditional))

      override fun confirmationNextStep(confirmationNextStep: IResolvable) {
        cdkBuilder.confirmationNextStep(confirmationNextStep.let(IResolvable::unwrap))
      }

      override fun confirmationNextStep(confirmationNextStep: DialogStateProperty) {
        cdkBuilder.confirmationNextStep(confirmationNextStep.let(DialogStateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("92252d01a23366c7f5af3fda3130a644232f17ec30b3e26fea5a0344fb0ce7c9")
      override
          fun confirmationNextStep(confirmationNextStep: DialogStateProperty.Builder.() -> Unit):
          Unit = confirmationNextStep(DialogStateProperty(confirmationNextStep))

      override fun confirmationResponse(confirmationResponse: IResolvable) {
        cdkBuilder.confirmationResponse(confirmationResponse.let(IResolvable::unwrap))
      }

      override fun confirmationResponse(confirmationResponse: ResponseSpecificationProperty) {
        cdkBuilder.confirmationResponse(confirmationResponse.let(ResponseSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab1133f530b5e02ebe17440bf0f63922e57873816cbd60f120151814326e0823")
      override
          fun confirmationResponse(confirmationResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = confirmationResponse(ResponseSpecificationProperty(confirmationResponse))

      override fun declinationConditional(declinationConditional: IResolvable) {
        cdkBuilder.declinationConditional(declinationConditional.let(IResolvable::unwrap))
      }

      override
          fun declinationConditional(declinationConditional: ConditionalSpecificationProperty) {
        cdkBuilder.declinationConditional(declinationConditional.let(ConditionalSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6dc8338a076e8b84a3bb90983fb81f61d2bbd0c27f9f05b59b17a05b8530221")
      override
          fun declinationConditional(declinationConditional: ConditionalSpecificationProperty.Builder.() -> Unit):
          Unit = declinationConditional(ConditionalSpecificationProperty(declinationConditional))

      override fun declinationNextStep(declinationNextStep: IResolvable) {
        cdkBuilder.declinationNextStep(declinationNextStep.let(IResolvable::unwrap))
      }

      override fun declinationNextStep(declinationNextStep: DialogStateProperty) {
        cdkBuilder.declinationNextStep(declinationNextStep.let(DialogStateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("021dd7a73ddf2c8f8f3334cc0134247737ae805738911313c3a670457662721d")
      override fun declinationNextStep(declinationNextStep: DialogStateProperty.Builder.() -> Unit):
          Unit = declinationNextStep(DialogStateProperty(declinationNextStep))

      override fun declinationResponse(declinationResponse: IResolvable) {
        cdkBuilder.declinationResponse(declinationResponse.let(IResolvable::unwrap))
      }

      override fun declinationResponse(declinationResponse: ResponseSpecificationProperty) {
        cdkBuilder.declinationResponse(declinationResponse.let(ResponseSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("63c7c3e99fb1f82251b6c49854a3f7f9b1820b1170412a08b7d2d956ae5c6960")
      override
          fun declinationResponse(declinationResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = declinationResponse(ResponseSpecificationProperty(declinationResponse))

      override fun elicitationCodeHook(elicitationCodeHook: IResolvable) {
        cdkBuilder.elicitationCodeHook(elicitationCodeHook.let(IResolvable::unwrap))
      }

      override
          fun elicitationCodeHook(elicitationCodeHook: ElicitationCodeHookInvocationSettingProperty) {
        cdkBuilder.elicitationCodeHook(elicitationCodeHook.let(ElicitationCodeHookInvocationSettingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b6346ae19c4090e5400a5ec1c8d86cbd011fc6511e3fada66887a0c55b511e29")
      override
          fun elicitationCodeHook(elicitationCodeHook: ElicitationCodeHookInvocationSettingProperty.Builder.() -> Unit):
          Unit =
          elicitationCodeHook(ElicitationCodeHookInvocationSettingProperty(elicitationCodeHook))

      override fun failureConditional(failureConditional: IResolvable) {
        cdkBuilder.failureConditional(failureConditional.let(IResolvable::unwrap))
      }

      override fun failureConditional(failureConditional: ConditionalSpecificationProperty) {
        cdkBuilder.failureConditional(failureConditional.let(ConditionalSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c2ad47ab9541daa21cc17c5035f28b1b4ae211308bc4d9348ecfc2881eddd509")
      override
          fun failureConditional(failureConditional: ConditionalSpecificationProperty.Builder.() -> Unit):
          Unit = failureConditional(ConditionalSpecificationProperty(failureConditional))

      override fun failureNextStep(failureNextStep: IResolvable) {
        cdkBuilder.failureNextStep(failureNextStep.let(IResolvable::unwrap))
      }

      override fun failureNextStep(failureNextStep: DialogStateProperty) {
        cdkBuilder.failureNextStep(failureNextStep.let(DialogStateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("20982cc55c34a1e521af5b7c64ec6662dc43942599a272e6d0501ff7524d4024")
      override fun failureNextStep(failureNextStep: DialogStateProperty.Builder.() -> Unit): Unit =
          failureNextStep(DialogStateProperty(failureNextStep))

      override fun failureResponse(failureResponse: IResolvable) {
        cdkBuilder.failureResponse(failureResponse.let(IResolvable::unwrap))
      }

      override fun failureResponse(failureResponse: ResponseSpecificationProperty) {
        cdkBuilder.failureResponse(failureResponse.let(ResponseSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ffb1d90267fddadbd9f91891428e148068d5ad8b985cc0f02d25a499328253d")
      override
          fun failureResponse(failureResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = failureResponse(ResponseSpecificationProperty(failureResponse))

      override fun isActive(isActive: Boolean) {
        cdkBuilder.isActive(isActive)
      }

      override fun isActive(isActive: IResolvable) {
        cdkBuilder.isActive(isActive.let(IResolvable::unwrap))
      }

      override fun promptSpecification(promptSpecification: IResolvable) {
        cdkBuilder.promptSpecification(promptSpecification.let(IResolvable::unwrap))
      }

      override fun promptSpecification(promptSpecification: PromptSpecificationProperty) {
        cdkBuilder.promptSpecification(promptSpecification.let(PromptSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe263cbd2bd4f3d5018570e2b23e70ac31d7f3ad70a9b4df60008559a99bcd30")
      override
          fun promptSpecification(promptSpecification: PromptSpecificationProperty.Builder.() -> Unit):
          Unit = promptSpecification(PromptSpecificationProperty(promptSpecification))

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.IntentConfirmationSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.IntentConfirmationSettingProperty,
    ) : IntentConfirmationSettingProperty {
      override fun codeHook(): Any? = unwrap(this).getCodeHook()

      override fun confirmationConditional(): Any? = unwrap(this).getConfirmationConditional()

      override fun confirmationNextStep(): Any? = unwrap(this).getConfirmationNextStep()

      override fun confirmationResponse(): Any? = unwrap(this).getConfirmationResponse()

      override fun declinationConditional(): Any? = unwrap(this).getDeclinationConditional()

      override fun declinationNextStep(): Any? = unwrap(this).getDeclinationNextStep()

      override fun declinationResponse(): Any? = unwrap(this).getDeclinationResponse()

      override fun elicitationCodeHook(): Any? = unwrap(this).getElicitationCodeHook()

      override fun failureConditional(): Any? = unwrap(this).getFailureConditional()

      override fun failureNextStep(): Any? = unwrap(this).getFailureNextStep()

      override fun failureResponse(): Any? = unwrap(this).getFailureResponse()

      override fun isActive(): Any? = unwrap(this).getIsActive()

      override fun promptSpecification(): Any = unwrap(this).getPromptSpecification()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          IntentConfirmationSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.IntentConfirmationSettingProperty):
          IntentConfirmationSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntentConfirmationSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.IntentConfirmationSettingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AudioLogDestinationProperty {
    public fun s3Bucket(): Any

    public interface Builder {
      public fun s3Bucket(s3Bucket: IResolvable)

      public fun s3Bucket(s3Bucket: S3BucketLogDestinationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f023faf47be12eb4518c36ca8b3dfd94a6e8c653081baca56b7a2f01b8bcb5e1")
      public fun s3Bucket(s3Bucket: S3BucketLogDestinationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.AudioLogDestinationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.AudioLogDestinationProperty.builder()

      override fun s3Bucket(s3Bucket: IResolvable) {
        cdkBuilder.s3Bucket(s3Bucket.let(IResolvable::unwrap))
      }

      override fun s3Bucket(s3Bucket: S3BucketLogDestinationProperty) {
        cdkBuilder.s3Bucket(s3Bucket.let(S3BucketLogDestinationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f023faf47be12eb4518c36ca8b3dfd94a6e8c653081baca56b7a2f01b8bcb5e1")
      override fun s3Bucket(s3Bucket: S3BucketLogDestinationProperty.Builder.() -> Unit): Unit =
          s3Bucket(S3BucketLogDestinationProperty(s3Bucket))

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.AudioLogDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lex.CfnBot.AudioLogDestinationProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.AudioLogDestinationProperty):
          AudioLogDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioLogDestinationProperty):
          software.amazon.awscdk.services.lex.CfnBot.AudioLogDestinationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ConditionProperty {
    public fun expressionString(): String

    public interface Builder {
      public fun expressionString(expressionString: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBot.ConditionProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.ConditionProperty.builder()

      override fun expressionString(expressionString: String) {
        cdkBuilder.expressionString(expressionString)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.ConditionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.ConditionProperty,
    ) : ConditionProperty {
      override fun expressionString(): String = unwrap(this).getExpressionString()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.ConditionProperty):
          ConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionProperty):
          software.amazon.awscdk.services.lex.CfnBot.ConditionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DataPrivacyProperty {
    public fun childDirected(): Any

    public interface Builder {
      public fun childDirected(childDirected: Boolean)

      public fun childDirected(childDirected: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBot.DataPrivacyProperty.Builder
          = software.amazon.awscdk.services.lex.CfnBot.DataPrivacyProperty.builder()

      override fun childDirected(childDirected: Boolean) {
        cdkBuilder.childDirected(childDirected)
      }

      override fun childDirected(childDirected: IResolvable) {
        cdkBuilder.childDirected(childDirected.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.DataPrivacyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lex.CfnBot.DataPrivacyProperty,
    ) : DataPrivacyProperty {
      override fun childDirected(): Any = unwrap(this).getChildDirected()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataPrivacyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.DataPrivacyProperty):
          DataPrivacyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataPrivacyProperty):
          software.amazon.awscdk.services.lex.CfnBot.DataPrivacyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
