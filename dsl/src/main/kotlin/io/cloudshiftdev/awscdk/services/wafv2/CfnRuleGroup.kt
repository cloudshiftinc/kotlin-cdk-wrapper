package io.cloudshiftdev.awscdk.services.wafv2

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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRuleGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrLabelNamespace(): String = unwrap(this).getAttrLabelNamespace()

  public open fun availableLabels(): Any? = unwrap(this).getAvailableLabels()

  public open fun availableLabels(`value`: IResolvable) {
    unwrap(this).setAvailableLabels(`value`.let(IResolvable::unwrap))
  }

  public open fun availableLabels(__idx_ac66f0: List<Any>) {
    unwrap(this).setAvailableLabels(__idx_ac66f0)
  }

  public open fun capacity(): Number = unwrap(this).getCapacity()

  public open fun capacity(`value`: Number) {
    unwrap(this).setCapacity(`value`)
  }

  public open fun consumedLabels(): Any? = unwrap(this).getConsumedLabels()

  public open fun consumedLabels(`value`: IResolvable) {
    unwrap(this).setConsumedLabels(`value`.let(IResolvable::unwrap))
  }

  public open fun consumedLabels(__idx_ac66f0: List<Any>) {
    unwrap(this).setConsumedLabels(__idx_ac66f0)
  }

  public open fun customResponseBodies(): Any? = unwrap(this).getCustomResponseBodies()

  public open fun customResponseBodies(`value`: IResolvable) {
    unwrap(this).setCustomResponseBodies(`value`.let(IResolvable::unwrap))
  }

  public open fun customResponseBodies(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setCustomResponseBodies(__item_ac66f0)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun rules(): Any? = unwrap(this).getRules()

  public open fun rules(`value`: IResolvable) {
    unwrap(this).setRules(`value`.let(IResolvable::unwrap))
  }

  public open fun rules(__idx_ac66f0: List<Any>) {
    unwrap(this).setRules(__idx_ac66f0)
  }

  public open fun scope(): String = unwrap(this).getScope()

  public open fun scope(`value`: String) {
    unwrap(this).setScope(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun visibilityConfig(): Any = unwrap(this).getVisibilityConfig()

  public open fun visibilityConfig(`value`: IResolvable) {
    unwrap(this).setVisibilityConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun visibilityConfig(`value`: VisibilityConfigProperty) {
    unwrap(this).setVisibilityConfig(`value`.let(VisibilityConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("221251ee754360a9ebb52acc364138be0a614076a8e9a9fd44db4ddf873762de")
  public open fun visibilityConfig(`value`: VisibilityConfigProperty.Builder.() -> Unit): Unit =
      visibilityConfig(VisibilityConfigProperty(`value`))

  public interface Builder {
    public fun availableLabels(availableLabels: IResolvable)

    public fun availableLabels(availableLabels: List<Any>)

    public fun capacity(capacity: Number)

    public fun consumedLabels(consumedLabels: IResolvable)

    public fun consumedLabels(consumedLabels: List<Any>)

    public fun customResponseBodies(customResponseBodies: IResolvable)

    public fun customResponseBodies(customResponseBodies: Map<String, Any>)

    public fun description(description: String)

    public fun name(name: String)

    public fun rules(rules: IResolvable)

    public fun rules(rules: List<Any>)

    public fun scope(scope: String)

    public fun tags(tags: List<CfnTag>)

    public fun visibilityConfig(visibilityConfig: IResolvable)

    public fun visibilityConfig(visibilityConfig: VisibilityConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("366b1aaea94889b5c9a40c56f60673f0c33bfa5abb730b81db6d98b05dc0236d")
    public fun visibilityConfig(visibilityConfig: VisibilityConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wafv2.CfnRuleGroup.Builder =
        software.amazon.awscdk.services.wafv2.CfnRuleGroup.Builder.create(scope, id)

    override fun availableLabels(availableLabels: IResolvable) {
      cdkBuilder.availableLabels(availableLabels.let(IResolvable::unwrap))
    }

    override fun availableLabels(availableLabels: List<Any>) {
      cdkBuilder.availableLabels(availableLabels)
    }

    override fun capacity(capacity: Number) {
      cdkBuilder.capacity(capacity)
    }

    override fun consumedLabels(consumedLabels: IResolvable) {
      cdkBuilder.consumedLabels(consumedLabels.let(IResolvable::unwrap))
    }

    override fun consumedLabels(consumedLabels: List<Any>) {
      cdkBuilder.consumedLabels(consumedLabels)
    }

    override fun customResponseBodies(customResponseBodies: IResolvable) {
      cdkBuilder.customResponseBodies(customResponseBodies.let(IResolvable::unwrap))
    }

    override fun customResponseBodies(customResponseBodies: Map<String, Any>) {
      cdkBuilder.customResponseBodies(customResponseBodies)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun rules(rules: IResolvable) {
      cdkBuilder.rules(rules.let(IResolvable::unwrap))
    }

    override fun rules(rules: List<Any>) {
      cdkBuilder.rules(rules)
    }

    override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun visibilityConfig(visibilityConfig: IResolvable) {
      cdkBuilder.visibilityConfig(visibilityConfig.let(IResolvable::unwrap))
    }

    override fun visibilityConfig(visibilityConfig: VisibilityConfigProperty) {
      cdkBuilder.visibilityConfig(visibilityConfig.let(VisibilityConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("366b1aaea94889b5c9a40c56f60673f0c33bfa5abb730b81db6d98b05dc0236d")
    override fun visibilityConfig(visibilityConfig: VisibilityConfigProperty.Builder.() -> Unit):
        Unit = visibilityConfig(VisibilityConfigProperty(visibilityConfig))

    public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRuleGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRuleGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup): CfnRuleGroup =
        CfnRuleGroup(cdkObject)

    internal fun unwrap(wrapped: CfnRuleGroup): software.amazon.awscdk.services.wafv2.CfnRuleGroup =
        wrapped.cdkObject
  }

  public interface JsonBodyProperty {
    public fun invalidFallbackBehavior(): String? = unwrap(this).getInvalidFallbackBehavior()

    public fun matchPattern(): Any

    public fun matchScope(): String

    public fun oversizeHandling(): String? = unwrap(this).getOversizeHandling()

    public interface Builder {
      public fun invalidFallbackBehavior(invalidFallbackBehavior: String)

      public fun matchPattern(matchPattern: IResolvable)

      public fun matchPattern(matchPattern: JsonMatchPatternProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e590ca33e821e7413e1d874dd0a487ee5942ed0046a60284a111ebad7bac59f")
      public fun matchPattern(matchPattern: JsonMatchPatternProperty.Builder.() -> Unit)

      public fun matchScope(matchScope: String)

      public fun oversizeHandling(oversizeHandling: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonBodyProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonBodyProperty.builder()

      override fun invalidFallbackBehavior(invalidFallbackBehavior: String) {
        cdkBuilder.invalidFallbackBehavior(invalidFallbackBehavior)
      }

      override fun matchPattern(matchPattern: IResolvable) {
        cdkBuilder.matchPattern(matchPattern.let(IResolvable::unwrap))
      }

      override fun matchPattern(matchPattern: JsonMatchPatternProperty) {
        cdkBuilder.matchPattern(matchPattern.let(JsonMatchPatternProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e590ca33e821e7413e1d874dd0a487ee5942ed0046a60284a111ebad7bac59f")
      override fun matchPattern(matchPattern: JsonMatchPatternProperty.Builder.() -> Unit): Unit =
          matchPattern(JsonMatchPatternProperty(matchPattern))

      override fun matchScope(matchScope: String) {
        cdkBuilder.matchScope(matchScope)
      }

      override fun oversizeHandling(oversizeHandling: String) {
        cdkBuilder.oversizeHandling(oversizeHandling)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonBodyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonBodyProperty,
    ) : JsonBodyProperty {
      override fun invalidFallbackBehavior(): String? = unwrap(this).getInvalidFallbackBehavior()

      override fun matchPattern(): Any = unwrap(this).getMatchPattern()

      override fun matchScope(): String = unwrap(this).getMatchScope()

      override fun oversizeHandling(): String? = unwrap(this).getOversizeHandling()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): JsonBodyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonBodyProperty):
          JsonBodyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JsonBodyProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonBodyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CustomResponseProperty {
    public fun customResponseBodyKey(): String? = unwrap(this).getCustomResponseBodyKey()

    public fun responseCode(): Number

    public fun responseHeaders(): Any? = unwrap(this).getResponseHeaders()

    public interface Builder {
      public fun customResponseBodyKey(customResponseBodyKey: String)

      public fun responseCode(responseCode: Number)

      public fun responseHeaders(responseHeaders: IResolvable)

      public fun responseHeaders(responseHeaders: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomResponseProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomResponseProperty.builder()

      override fun customResponseBodyKey(customResponseBodyKey: String) {
        cdkBuilder.customResponseBodyKey(customResponseBodyKey)
      }

      override fun responseCode(responseCode: Number) {
        cdkBuilder.responseCode(responseCode)
      }

      override fun responseHeaders(responseHeaders: IResolvable) {
        cdkBuilder.responseHeaders(responseHeaders.let(IResolvable::unwrap))
      }

      override fun responseHeaders(responseHeaders: List<Any>) {
        cdkBuilder.responseHeaders(responseHeaders)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomResponseProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomResponseProperty,
    ) : CustomResponseProperty {
      override fun customResponseBodyKey(): String? = unwrap(this).getCustomResponseBodyKey()

      override fun responseCode(): Number = unwrap(this).getResponseCode()

      override fun responseHeaders(): Any? = unwrap(this).getResponseHeaders()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomResponseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomResponseProperty):
          CustomResponseProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomResponseProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomResponseProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ImmunityTimePropertyProperty {
    public fun immunityTime(): Number

    public interface Builder {
      public fun immunityTime(immunityTime: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ImmunityTimePropertyProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ImmunityTimePropertyProperty.builder()

      override fun immunityTime(immunityTime: Number) {
        cdkBuilder.immunityTime(immunityTime)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ImmunityTimePropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ImmunityTimePropertyProperty,
    ) : ImmunityTimePropertyProperty {
      override fun immunityTime(): Number = unwrap(this).getImmunityTime()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ImmunityTimePropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.ImmunityTimePropertyProperty):
          ImmunityTimePropertyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImmunityTimePropertyProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ImmunityTimePropertyProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface RuleActionProperty {
    public fun allow(): Any? = unwrap(this).getAllow()

    public fun block(): Any? = unwrap(this).getBlock()

    public fun captcha(): Any? = unwrap(this).getCaptcha()

    public fun challenge(): Any? = unwrap(this).getChallenge()

    public fun count(): Any? = unwrap(this).getCount()

    public interface Builder {
      public fun allow(allow: Any)

      public fun block(block: Any)

      public fun captcha(captcha: Any)

      public fun challenge(challenge: Any)

      public fun count(count: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleActionProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleActionProperty.builder()

      override fun allow(allow: Any) {
        cdkBuilder.allow(allow)
      }

      override fun block(block: Any) {
        cdkBuilder.block(block)
      }

      override fun captcha(captcha: Any) {
        cdkBuilder.captcha(captcha)
      }

      override fun challenge(challenge: Any) {
        cdkBuilder.challenge(challenge)
      }

      override fun count(count: Any) {
        cdkBuilder.count(count)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleActionProperty,
    ) : RuleActionProperty {
      override fun allow(): Any? = unwrap(this).getAllow()

      override fun block(): Any? = unwrap(this).getBlock()

      override fun captcha(): Any? = unwrap(this).getCaptcha()

      override fun challenge(): Any? = unwrap(this).getChallenge()

      override fun count(): Any? = unwrap(this).getCount()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RuleActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleActionProperty):
          RuleActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleActionProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RuleProperty {
    public fun action(): Any? = unwrap(this).getAction()

    public fun captchaConfig(): Any? = unwrap(this).getCaptchaConfig()

    public fun challengeConfig(): Any? = unwrap(this).getChallengeConfig()

    public fun name(): String

    public fun priority(): Number

    public fun ruleLabels(): Any? = unwrap(this).getRuleLabels()

    public fun statement(): Any

    public fun visibilityConfig(): Any

    public interface Builder {
      public fun action(action: IResolvable)

      public fun action(action: RuleActionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ab59604d66f34cfbcc06b518a5a65e829356d92292693b3017e1180b0b691e3")
      public fun action(action: RuleActionProperty.Builder.() -> Unit)

      public fun captchaConfig(captchaConfig: IResolvable)

      public fun captchaConfig(captchaConfig: CaptchaConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("90f6e38e2c3c5b6a7f2d6756b5812401a10b2c32776c5257df07e13164b43707")
      public fun captchaConfig(captchaConfig: CaptchaConfigProperty.Builder.() -> Unit)

      public fun challengeConfig(challengeConfig: IResolvable)

      public fun challengeConfig(challengeConfig: ChallengeConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c6f4e93253cc8051bfe46a07df51ba9e7e46aa181e3d7cd2aba87c121221f6e")
      public fun challengeConfig(challengeConfig: ChallengeConfigProperty.Builder.() -> Unit)

      public fun name(name: String)

      public fun priority(priority: Number)

      public fun ruleLabels(ruleLabels: IResolvable)

      public fun ruleLabels(ruleLabels: List<Any>)

      public fun statement(statement: IResolvable)

      public fun statement(statement: StatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("177124055aa0539a2933b6a8f96eb0a9dce6c9fa01a254f7dbd404587f1d47ec")
      public fun statement(statement: StatementProperty.Builder.() -> Unit)

      public fun visibilityConfig(visibilityConfig: IResolvable)

      public fun visibilityConfig(visibilityConfig: VisibilityConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db831e145764c8bfbc00a3984a4b6f1bac975abdf526651e355015faae968afe")
      public fun visibilityConfig(visibilityConfig: VisibilityConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleProperty.builder()

      override fun action(action: IResolvable) {
        cdkBuilder.action(action.let(IResolvable::unwrap))
      }

      override fun action(action: RuleActionProperty) {
        cdkBuilder.action(action.let(RuleActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ab59604d66f34cfbcc06b518a5a65e829356d92292693b3017e1180b0b691e3")
      override fun action(action: RuleActionProperty.Builder.() -> Unit): Unit =
          action(RuleActionProperty(action))

      override fun captchaConfig(captchaConfig: IResolvable) {
        cdkBuilder.captchaConfig(captchaConfig.let(IResolvable::unwrap))
      }

      override fun captchaConfig(captchaConfig: CaptchaConfigProperty) {
        cdkBuilder.captchaConfig(captchaConfig.let(CaptchaConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("90f6e38e2c3c5b6a7f2d6756b5812401a10b2c32776c5257df07e13164b43707")
      override fun captchaConfig(captchaConfig: CaptchaConfigProperty.Builder.() -> Unit): Unit =
          captchaConfig(CaptchaConfigProperty(captchaConfig))

      override fun challengeConfig(challengeConfig: IResolvable) {
        cdkBuilder.challengeConfig(challengeConfig.let(IResolvable::unwrap))
      }

      override fun challengeConfig(challengeConfig: ChallengeConfigProperty) {
        cdkBuilder.challengeConfig(challengeConfig.let(ChallengeConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c6f4e93253cc8051bfe46a07df51ba9e7e46aa181e3d7cd2aba87c121221f6e")
      override fun challengeConfig(challengeConfig: ChallengeConfigProperty.Builder.() -> Unit):
          Unit = challengeConfig(ChallengeConfigProperty(challengeConfig))

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      override fun ruleLabels(ruleLabels: IResolvable) {
        cdkBuilder.ruleLabels(ruleLabels.let(IResolvable::unwrap))
      }

      override fun ruleLabels(ruleLabels: List<Any>) {
        cdkBuilder.ruleLabels(ruleLabels)
      }

      override fun statement(statement: IResolvable) {
        cdkBuilder.statement(statement.let(IResolvable::unwrap))
      }

      override fun statement(statement: StatementProperty) {
        cdkBuilder.statement(statement.let(StatementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("177124055aa0539a2933b6a8f96eb0a9dce6c9fa01a254f7dbd404587f1d47ec")
      override fun statement(statement: StatementProperty.Builder.() -> Unit): Unit =
          statement(StatementProperty(statement))

      override fun visibilityConfig(visibilityConfig: IResolvable) {
        cdkBuilder.visibilityConfig(visibilityConfig.let(IResolvable::unwrap))
      }

      override fun visibilityConfig(visibilityConfig: VisibilityConfigProperty) {
        cdkBuilder.visibilityConfig(visibilityConfig.let(VisibilityConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db831e145764c8bfbc00a3984a4b6f1bac975abdf526651e355015faae968afe")
      override fun visibilityConfig(visibilityConfig: VisibilityConfigProperty.Builder.() -> Unit):
          Unit = visibilityConfig(VisibilityConfigProperty(visibilityConfig))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleProperty,
    ) : RuleProperty {
      override fun action(): Any? = unwrap(this).getAction()

      override fun captchaConfig(): Any? = unwrap(this).getCaptchaConfig()

      override fun challengeConfig(): Any? = unwrap(this).getChallengeConfig()

      override fun name(): String = unwrap(this).getName()

      override fun priority(): Number = unwrap(this).getPriority()

      override fun ruleLabels(): Any? = unwrap(this).getRuleLabels()

      override fun statement(): Any = unwrap(this).getStatement()

      override fun visibilityConfig(): Any = unwrap(this).getVisibilityConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleProperty):
          RuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface GeoMatchStatementProperty {
    public fun countryCodes(): List<String> = unwrap(this).getCountryCodes() ?: emptyList()

    public fun forwardedIpConfig(): Any? = unwrap(this).getForwardedIpConfig()

    public interface Builder {
      public fun countryCodes(countryCodes: List<String>)

      public fun forwardedIpConfig(forwardedIpConfig: IResolvable)

      public fun forwardedIpConfig(forwardedIpConfig: ForwardedIPConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a4f29dbbb3946321469421b45c2a51aceb555245d5013a1734684891b20097c")
      public
          fun forwardedIpConfig(forwardedIpConfig: ForwardedIPConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.GeoMatchStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.GeoMatchStatementProperty.builder()

      override fun countryCodes(countryCodes: List<String>) {
        cdkBuilder.countryCodes(countryCodes)
      }

      override fun forwardedIpConfig(forwardedIpConfig: IResolvable) {
        cdkBuilder.forwardedIpConfig(forwardedIpConfig.let(IResolvable::unwrap))
      }

      override fun forwardedIpConfig(forwardedIpConfig: ForwardedIPConfigurationProperty) {
        cdkBuilder.forwardedIpConfig(forwardedIpConfig.let(ForwardedIPConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a4f29dbbb3946321469421b45c2a51aceb555245d5013a1734684891b20097c")
      override
          fun forwardedIpConfig(forwardedIpConfig: ForwardedIPConfigurationProperty.Builder.() -> Unit):
          Unit = forwardedIpConfig(ForwardedIPConfigurationProperty(forwardedIpConfig))

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.GeoMatchStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.GeoMatchStatementProperty,
    ) : GeoMatchStatementProperty {
      override fun countryCodes(): List<String> = unwrap(this).getCountryCodes() ?: emptyList()

      override fun forwardedIpConfig(): Any? = unwrap(this).getForwardedIpConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GeoMatchStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.GeoMatchStatementProperty):
          GeoMatchStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GeoMatchStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.GeoMatchStatementProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CookieMatchPatternProperty {
    public fun all(): Any? = unwrap(this).getAll()

    public fun excludedCookies(): List<String> = unwrap(this).getExcludedCookies() ?: emptyList()

    public fun includedCookies(): List<String> = unwrap(this).getIncludedCookies() ?: emptyList()

    public interface Builder {
      public fun all(all: Any)

      public fun excludedCookies(excludedCookies: List<String>)

      public fun includedCookies(includedCookies: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CookieMatchPatternProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CookieMatchPatternProperty.builder()

      override fun all(all: Any) {
        cdkBuilder.all(all)
      }

      override fun excludedCookies(excludedCookies: List<String>) {
        cdkBuilder.excludedCookies(excludedCookies)
      }

      override fun includedCookies(includedCookies: List<String>) {
        cdkBuilder.includedCookies(includedCookies)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CookieMatchPatternProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CookieMatchPatternProperty,
    ) : CookieMatchPatternProperty {
      override fun all(): Any? = unwrap(this).getAll()

      override fun excludedCookies(): List<String> = unwrap(this).getExcludedCookies() ?:
          emptyList()

      override fun includedCookies(): List<String> = unwrap(this).getIncludedCookies() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CookieMatchPatternProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.CookieMatchPatternProperty):
          CookieMatchPatternProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CookieMatchPatternProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CookieMatchPatternProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface SizeConstraintStatementProperty {
    public fun comparisonOperator(): String

    public fun fieldToMatch(): Any

    public fun size(): Number

    public fun textTransformations(): Any

    public interface Builder {
      public fun comparisonOperator(comparisonOperator: String)

      public fun fieldToMatch(fieldToMatch: IResolvable)

      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6d1490d529bfb0d803940d5fa42f7fbb88c77728c7e36dd75b0e48a28bd3c86")
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit)

      public fun size(size: Number)

      public fun textTransformations(textTransformations: IResolvable)

      public fun textTransformations(textTransformations: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SizeConstraintStatementProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SizeConstraintStatementProperty.builder()

      override fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
      }

      override fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(IResolvable::unwrap))
      }

      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(FieldToMatchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6d1490d529bfb0d803940d5fa42f7fbb88c77728c7e36dd75b0e48a28bd3c86")
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit): Unit =
          fieldToMatch(FieldToMatchProperty(fieldToMatch))

      override fun size(size: Number) {
        cdkBuilder.size(size)
      }

      override fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations.let(IResolvable::unwrap))
      }

      override fun textTransformations(textTransformations: List<Any>) {
        cdkBuilder.textTransformations(textTransformations)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SizeConstraintStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SizeConstraintStatementProperty,
    ) : SizeConstraintStatementProperty {
      override fun comparisonOperator(): String = unwrap(this).getComparisonOperator()

      override fun fieldToMatch(): Any = unwrap(this).getFieldToMatch()

      override fun size(): Number = unwrap(this).getSize()

      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SizeConstraintStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.SizeConstraintStatementProperty):
          SizeConstraintStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SizeConstraintStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SizeConstraintStatementProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FieldToMatchProperty {
    public fun allQueryArguments(): Any? = unwrap(this).getAllQueryArguments()

    public fun body(): Any? = unwrap(this).getBody()

    public fun cookies(): Any? = unwrap(this).getCookies()

    public fun headers(): Any? = unwrap(this).getHeaders()

    public fun jsonBody(): Any? = unwrap(this).getJsonBody()

    public fun method(): Any? = unwrap(this).getMethod()

    public fun queryString(): Any? = unwrap(this).getQueryString()

    public fun singleHeader(): Any? = unwrap(this).getSingleHeader()

    public fun singleQueryArgument(): Any? = unwrap(this).getSingleQueryArgument()

    public fun uriPath(): Any? = unwrap(this).getUriPath()

    public interface Builder {
      public fun allQueryArguments(allQueryArguments: Any)

      public fun body(body: IResolvable)

      public fun body(body: BodyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79864400e90dbcd5de51d6f4db3e7ed861fc5cbcb9b6c0fcfc44129431036578")
      public fun body(body: BodyProperty.Builder.() -> Unit)

      public fun cookies(cookies: IResolvable)

      public fun cookies(cookies: CookiesProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5ead24464c68e8c25d8b85ad2a797c5308d8909f0ff70571cdcbbcd0e032d2a1")
      public fun cookies(cookies: CookiesProperty.Builder.() -> Unit)

      public fun headers(headers: IResolvable)

      public fun headers(headers: HeadersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fff74242ecdf7074ecb24424c8d763c2aec2072774004f540d2b2f241e767101")
      public fun headers(headers: HeadersProperty.Builder.() -> Unit)

      public fun jsonBody(jsonBody: IResolvable)

      public fun jsonBody(jsonBody: JsonBodyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("909fe9a4a46334fd962c7f7a77d29a600004873f56cb7532bda93905171693f4")
      public fun jsonBody(jsonBody: JsonBodyProperty.Builder.() -> Unit)

      public fun method(method: Any)

      public fun queryString(queryString: Any)

      public fun singleHeader(singleHeader: Any)

      public fun singleQueryArgument(singleQueryArgument: Any)

      public fun uriPath(uriPath: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.FieldToMatchProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.FieldToMatchProperty.builder()

      override fun allQueryArguments(allQueryArguments: Any) {
        cdkBuilder.allQueryArguments(allQueryArguments)
      }

      override fun body(body: IResolvable) {
        cdkBuilder.body(body.let(IResolvable::unwrap))
      }

      override fun body(body: BodyProperty) {
        cdkBuilder.body(body.let(BodyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79864400e90dbcd5de51d6f4db3e7ed861fc5cbcb9b6c0fcfc44129431036578")
      override fun body(body: BodyProperty.Builder.() -> Unit): Unit = body(BodyProperty(body))

      override fun cookies(cookies: IResolvable) {
        cdkBuilder.cookies(cookies.let(IResolvable::unwrap))
      }

      override fun cookies(cookies: CookiesProperty) {
        cdkBuilder.cookies(cookies.let(CookiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5ead24464c68e8c25d8b85ad2a797c5308d8909f0ff70571cdcbbcd0e032d2a1")
      override fun cookies(cookies: CookiesProperty.Builder.() -> Unit): Unit =
          cookies(CookiesProperty(cookies))

      override fun headers(headers: IResolvable) {
        cdkBuilder.headers(headers.let(IResolvable::unwrap))
      }

      override fun headers(headers: HeadersProperty) {
        cdkBuilder.headers(headers.let(HeadersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fff74242ecdf7074ecb24424c8d763c2aec2072774004f540d2b2f241e767101")
      override fun headers(headers: HeadersProperty.Builder.() -> Unit): Unit =
          headers(HeadersProperty(headers))

      override fun jsonBody(jsonBody: IResolvable) {
        cdkBuilder.jsonBody(jsonBody.let(IResolvable::unwrap))
      }

      override fun jsonBody(jsonBody: JsonBodyProperty) {
        cdkBuilder.jsonBody(jsonBody.let(JsonBodyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("909fe9a4a46334fd962c7f7a77d29a600004873f56cb7532bda93905171693f4")
      override fun jsonBody(jsonBody: JsonBodyProperty.Builder.() -> Unit): Unit =
          jsonBody(JsonBodyProperty(jsonBody))

      override fun method(method: Any) {
        cdkBuilder.method(method)
      }

      override fun queryString(queryString: Any) {
        cdkBuilder.queryString(queryString)
      }

      override fun singleHeader(singleHeader: Any) {
        cdkBuilder.singleHeader(singleHeader)
      }

      override fun singleQueryArgument(singleQueryArgument: Any) {
        cdkBuilder.singleQueryArgument(singleQueryArgument)
      }

      override fun uriPath(uriPath: Any) {
        cdkBuilder.uriPath(uriPath)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.FieldToMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.FieldToMatchProperty,
    ) : FieldToMatchProperty {
      override fun allQueryArguments(): Any? = unwrap(this).getAllQueryArguments()

      override fun body(): Any? = unwrap(this).getBody()

      override fun cookies(): Any? = unwrap(this).getCookies()

      override fun headers(): Any? = unwrap(this).getHeaders()

      override fun jsonBody(): Any? = unwrap(this).getJsonBody()

      override fun method(): Any? = unwrap(this).getMethod()

      override fun queryString(): Any? = unwrap(this).getQueryString()

      override fun singleHeader(): Any? = unwrap(this).getSingleHeader()

      override fun singleQueryArgument(): Any? = unwrap(this).getSingleQueryArgument()

      override fun uriPath(): Any? = unwrap(this).getUriPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FieldToMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.FieldToMatchProperty):
          FieldToMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldToMatchProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.FieldToMatchProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LabelMatchStatementProperty {
    public fun key(): String

    public fun scope(): String

    public interface Builder {
      public fun key(key: String)

      public fun scope(scope: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelMatchStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelMatchStatementProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun scope(scope: String) {
        cdkBuilder.scope(scope)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelMatchStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelMatchStatementProperty,
    ) : LabelMatchStatementProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun scope(): String = unwrap(this).getScope()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LabelMatchStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelMatchStatementProperty):
          LabelMatchStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LabelMatchStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelMatchStatementProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface NotStatementProperty {
    public fun statement(): Any

    public interface Builder {
      public fun statement(statement: IResolvable)

      public fun statement(statement: StatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9f5c555ee8c440d36600a410097192dd6e85ac534995d25faeebf55d6e22dbc5")
      public fun statement(statement: StatementProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.NotStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.NotStatementProperty.builder()

      override fun statement(statement: IResolvable) {
        cdkBuilder.statement(statement.let(IResolvable::unwrap))
      }

      override fun statement(statement: StatementProperty) {
        cdkBuilder.statement(statement.let(StatementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9f5c555ee8c440d36600a410097192dd6e85ac534995d25faeebf55d6e22dbc5")
      override fun statement(statement: StatementProperty.Builder.() -> Unit): Unit =
          statement(StatementProperty(statement))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.NotStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.NotStatementProperty,
    ) : NotStatementProperty {
      override fun statement(): Any = unwrap(this).getStatement()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NotStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.NotStatementProperty):
          NotStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.NotStatementProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VisibilityConfigProperty {
    public fun cloudWatchMetricsEnabled(): Any

    public fun metricName(): String

    public fun sampledRequestsEnabled(): Any

    public interface Builder {
      public fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: Boolean)

      public fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: IResolvable)

      public fun metricName(metricName: String)

      public fun sampledRequestsEnabled(sampledRequestsEnabled: Boolean)

      public fun sampledRequestsEnabled(sampledRequestsEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.VisibilityConfigProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.VisibilityConfigProperty.builder()

      override fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: Boolean) {
        cdkBuilder.cloudWatchMetricsEnabled(cloudWatchMetricsEnabled)
      }

      override fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: IResolvable) {
        cdkBuilder.cloudWatchMetricsEnabled(cloudWatchMetricsEnabled.let(IResolvable::unwrap))
      }

      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      override fun sampledRequestsEnabled(sampledRequestsEnabled: Boolean) {
        cdkBuilder.sampledRequestsEnabled(sampledRequestsEnabled)
      }

      override fun sampledRequestsEnabled(sampledRequestsEnabled: IResolvable) {
        cdkBuilder.sampledRequestsEnabled(sampledRequestsEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.VisibilityConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.VisibilityConfigProperty,
    ) : VisibilityConfigProperty {
      override fun cloudWatchMetricsEnabled(): Any = unwrap(this).getCloudWatchMetricsEnabled()

      override fun metricName(): String = unwrap(this).getMetricName()

      override fun sampledRequestsEnabled(): Any = unwrap(this).getSampledRequestsEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VisibilityConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.VisibilityConfigProperty):
          VisibilityConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VisibilityConfigProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.VisibilityConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RateLimitLabelNamespaceProperty {
    public fun namespace(): String

    public interface Builder {
      public fun namespace(namespace: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitLabelNamespaceProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitLabelNamespaceProperty.builder()

      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitLabelNamespaceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitLabelNamespaceProperty,
    ) : RateLimitLabelNamespaceProperty {
      override fun namespace(): String = unwrap(this).getNamespace()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RateLimitLabelNamespaceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitLabelNamespaceProperty):
          RateLimitLabelNamespaceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateLimitLabelNamespaceProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitLabelNamespaceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface StatementProperty {
    public fun andStatement(): Any? = unwrap(this).getAndStatement()

    public fun byteMatchStatement(): Any? = unwrap(this).getByteMatchStatement()

    public fun geoMatchStatement(): Any? = unwrap(this).getGeoMatchStatement()

    public fun ipSetReferenceStatement(): Any? = unwrap(this).getIpSetReferenceStatement()

    public fun labelMatchStatement(): Any? = unwrap(this).getLabelMatchStatement()

    public fun notStatement(): Any? = unwrap(this).getNotStatement()

    public fun orStatement(): Any? = unwrap(this).getOrStatement()

    public fun rateBasedStatement(): Any? = unwrap(this).getRateBasedStatement()

    public fun regexMatchStatement(): Any? = unwrap(this).getRegexMatchStatement()

    public fun regexPatternSetReferenceStatement(): Any? =
        unwrap(this).getRegexPatternSetReferenceStatement()

    public fun sizeConstraintStatement(): Any? = unwrap(this).getSizeConstraintStatement()

    public fun sqliMatchStatement(): Any? = unwrap(this).getSqliMatchStatement()

    public fun xssMatchStatement(): Any? = unwrap(this).getXssMatchStatement()

    public interface Builder {
      public fun andStatement(andStatement: IResolvable)

      public fun andStatement(andStatement: AndStatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f84784e4830593c9b471589c902f676367c17294727111d314f1caec89c6e22")
      public fun andStatement(andStatement: AndStatementProperty.Builder.() -> Unit)

      public fun byteMatchStatement(byteMatchStatement: IResolvable)

      public fun byteMatchStatement(byteMatchStatement: ByteMatchStatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bb06d910592d98a855bd9168f0a5c142e5f51bec98f9a9aa52a47918efa5dc4b")
      public
          fun byteMatchStatement(byteMatchStatement: ByteMatchStatementProperty.Builder.() -> Unit)

      public fun geoMatchStatement(geoMatchStatement: IResolvable)

      public fun geoMatchStatement(geoMatchStatement: GeoMatchStatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0b98767a03cb91f73a06c0f74957732cd56c6757f90cfefb368998d3fe8a7c14")
      public fun geoMatchStatement(geoMatchStatement: GeoMatchStatementProperty.Builder.() -> Unit)

      public fun ipSetReferenceStatement(ipSetReferenceStatement: IResolvable)

      public fun ipSetReferenceStatement(ipSetReferenceStatement: IPSetReferenceStatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b6deaa9ef49cad09c3238358efcf05a41b39f0b8439b527190c0f8c232135561")
      public
          fun ipSetReferenceStatement(ipSetReferenceStatement: IPSetReferenceStatementProperty.Builder.() -> Unit)

      public fun labelMatchStatement(labelMatchStatement: IResolvable)

      public fun labelMatchStatement(labelMatchStatement: LabelMatchStatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("986e5de76be654a8e15d6058c9ee74294e83fe3810db67688f779f82170788a1")
      public
          fun labelMatchStatement(labelMatchStatement: LabelMatchStatementProperty.Builder.() -> Unit)

      public fun notStatement(notStatement: IResolvable)

      public fun notStatement(notStatement: NotStatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f4b07d4665ef1370e1b2372257a3c3047436992d110003b67d92cbb890c06aae")
      public fun notStatement(notStatement: NotStatementProperty.Builder.() -> Unit)

      public fun orStatement(orStatement: IResolvable)

      public fun orStatement(orStatement: OrStatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59a8a2a043bbe0095a069a387fb083cd57f9cde91be9671eeee6256c2b04d4f6")
      public fun orStatement(orStatement: OrStatementProperty.Builder.() -> Unit)

      public fun rateBasedStatement(rateBasedStatement: IResolvable)

      public fun rateBasedStatement(rateBasedStatement: RateBasedStatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8bcfd0d44bbb6308f131b368f5d5098eee6e7d23736279eeb92b50311609b4d9")
      public
          fun rateBasedStatement(rateBasedStatement: RateBasedStatementProperty.Builder.() -> Unit)

      public fun regexMatchStatement(regexMatchStatement: IResolvable)

      public fun regexMatchStatement(regexMatchStatement: RegexMatchStatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cab718641bfc23238d998ba962f49b68c7c0ad9ac57e0d1f09949e0da4e506f8")
      public
          fun regexMatchStatement(regexMatchStatement: RegexMatchStatementProperty.Builder.() -> Unit)

      public fun regexPatternSetReferenceStatement(regexPatternSetReferenceStatement: IResolvable)

      public
          fun regexPatternSetReferenceStatement(regexPatternSetReferenceStatement: RegexPatternSetReferenceStatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aca9516d1d1380f25cad4dd73b064a09e3e99d316436f6dde2017f23c043a372")
      public
          fun regexPatternSetReferenceStatement(regexPatternSetReferenceStatement: RegexPatternSetReferenceStatementProperty.Builder.() -> Unit)

      public fun sizeConstraintStatement(sizeConstraintStatement: IResolvable)

      public fun sizeConstraintStatement(sizeConstraintStatement: SizeConstraintStatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f70e09b6dff74f1e7a668ab987d9edf5a8b525e88baf4dd3a64c5ba80790b394")
      public
          fun sizeConstraintStatement(sizeConstraintStatement: SizeConstraintStatementProperty.Builder.() -> Unit)

      public fun sqliMatchStatement(sqliMatchStatement: IResolvable)

      public fun sqliMatchStatement(sqliMatchStatement: SqliMatchStatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0fdab764bc61099312cfe517891cb2231ee5552284f8fd95a4f44fdbb7ddf3f5")
      public
          fun sqliMatchStatement(sqliMatchStatement: SqliMatchStatementProperty.Builder.() -> Unit)

      public fun xssMatchStatement(xssMatchStatement: IResolvable)

      public fun xssMatchStatement(xssMatchStatement: XssMatchStatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d2f50b19cc87986feaf8db81faf794d3554022dd9e71876a010beea7ac2d6210")
      public fun xssMatchStatement(xssMatchStatement: XssMatchStatementProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.StatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.StatementProperty.builder()

      override fun andStatement(andStatement: IResolvable) {
        cdkBuilder.andStatement(andStatement.let(IResolvable::unwrap))
      }

      override fun andStatement(andStatement: AndStatementProperty) {
        cdkBuilder.andStatement(andStatement.let(AndStatementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f84784e4830593c9b471589c902f676367c17294727111d314f1caec89c6e22")
      override fun andStatement(andStatement: AndStatementProperty.Builder.() -> Unit): Unit =
          andStatement(AndStatementProperty(andStatement))

      override fun byteMatchStatement(byteMatchStatement: IResolvable) {
        cdkBuilder.byteMatchStatement(byteMatchStatement.let(IResolvable::unwrap))
      }

      override fun byteMatchStatement(byteMatchStatement: ByteMatchStatementProperty) {
        cdkBuilder.byteMatchStatement(byteMatchStatement.let(ByteMatchStatementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bb06d910592d98a855bd9168f0a5c142e5f51bec98f9a9aa52a47918efa5dc4b")
      override
          fun byteMatchStatement(byteMatchStatement: ByteMatchStatementProperty.Builder.() -> Unit):
          Unit = byteMatchStatement(ByteMatchStatementProperty(byteMatchStatement))

      override fun geoMatchStatement(geoMatchStatement: IResolvable) {
        cdkBuilder.geoMatchStatement(geoMatchStatement.let(IResolvable::unwrap))
      }

      override fun geoMatchStatement(geoMatchStatement: GeoMatchStatementProperty) {
        cdkBuilder.geoMatchStatement(geoMatchStatement.let(GeoMatchStatementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0b98767a03cb91f73a06c0f74957732cd56c6757f90cfefb368998d3fe8a7c14")
      override
          fun geoMatchStatement(geoMatchStatement: GeoMatchStatementProperty.Builder.() -> Unit):
          Unit = geoMatchStatement(GeoMatchStatementProperty(geoMatchStatement))

      override fun ipSetReferenceStatement(ipSetReferenceStatement: IResolvable) {
        cdkBuilder.ipSetReferenceStatement(ipSetReferenceStatement.let(IResolvable::unwrap))
      }

      override
          fun ipSetReferenceStatement(ipSetReferenceStatement: IPSetReferenceStatementProperty) {
        cdkBuilder.ipSetReferenceStatement(ipSetReferenceStatement.let(IPSetReferenceStatementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b6deaa9ef49cad09c3238358efcf05a41b39f0b8439b527190c0f8c232135561")
      override
          fun ipSetReferenceStatement(ipSetReferenceStatement: IPSetReferenceStatementProperty.Builder.() -> Unit):
          Unit = ipSetReferenceStatement(IPSetReferenceStatementProperty(ipSetReferenceStatement))

      override fun labelMatchStatement(labelMatchStatement: IResolvable) {
        cdkBuilder.labelMatchStatement(labelMatchStatement.let(IResolvable::unwrap))
      }

      override fun labelMatchStatement(labelMatchStatement: LabelMatchStatementProperty) {
        cdkBuilder.labelMatchStatement(labelMatchStatement.let(LabelMatchStatementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("986e5de76be654a8e15d6058c9ee74294e83fe3810db67688f779f82170788a1")
      override
          fun labelMatchStatement(labelMatchStatement: LabelMatchStatementProperty.Builder.() -> Unit):
          Unit = labelMatchStatement(LabelMatchStatementProperty(labelMatchStatement))

      override fun notStatement(notStatement: IResolvable) {
        cdkBuilder.notStatement(notStatement.let(IResolvable::unwrap))
      }

      override fun notStatement(notStatement: NotStatementProperty) {
        cdkBuilder.notStatement(notStatement.let(NotStatementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f4b07d4665ef1370e1b2372257a3c3047436992d110003b67d92cbb890c06aae")
      override fun notStatement(notStatement: NotStatementProperty.Builder.() -> Unit): Unit =
          notStatement(NotStatementProperty(notStatement))

      override fun orStatement(orStatement: IResolvable) {
        cdkBuilder.orStatement(orStatement.let(IResolvable::unwrap))
      }

      override fun orStatement(orStatement: OrStatementProperty) {
        cdkBuilder.orStatement(orStatement.let(OrStatementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59a8a2a043bbe0095a069a387fb083cd57f9cde91be9671eeee6256c2b04d4f6")
      override fun orStatement(orStatement: OrStatementProperty.Builder.() -> Unit): Unit =
          orStatement(OrStatementProperty(orStatement))

      override fun rateBasedStatement(rateBasedStatement: IResolvable) {
        cdkBuilder.rateBasedStatement(rateBasedStatement.let(IResolvable::unwrap))
      }

      override fun rateBasedStatement(rateBasedStatement: RateBasedStatementProperty) {
        cdkBuilder.rateBasedStatement(rateBasedStatement.let(RateBasedStatementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8bcfd0d44bbb6308f131b368f5d5098eee6e7d23736279eeb92b50311609b4d9")
      override
          fun rateBasedStatement(rateBasedStatement: RateBasedStatementProperty.Builder.() -> Unit):
          Unit = rateBasedStatement(RateBasedStatementProperty(rateBasedStatement))

      override fun regexMatchStatement(regexMatchStatement: IResolvable) {
        cdkBuilder.regexMatchStatement(regexMatchStatement.let(IResolvable::unwrap))
      }

      override fun regexMatchStatement(regexMatchStatement: RegexMatchStatementProperty) {
        cdkBuilder.regexMatchStatement(regexMatchStatement.let(RegexMatchStatementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cab718641bfc23238d998ba962f49b68c7c0ad9ac57e0d1f09949e0da4e506f8")
      override
          fun regexMatchStatement(regexMatchStatement: RegexMatchStatementProperty.Builder.() -> Unit):
          Unit = regexMatchStatement(RegexMatchStatementProperty(regexMatchStatement))

      override
          fun regexPatternSetReferenceStatement(regexPatternSetReferenceStatement: IResolvable) {
        cdkBuilder.regexPatternSetReferenceStatement(regexPatternSetReferenceStatement.let(IResolvable::unwrap))
      }

      override
          fun regexPatternSetReferenceStatement(regexPatternSetReferenceStatement: RegexPatternSetReferenceStatementProperty) {
        cdkBuilder.regexPatternSetReferenceStatement(regexPatternSetReferenceStatement.let(RegexPatternSetReferenceStatementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aca9516d1d1380f25cad4dd73b064a09e3e99d316436f6dde2017f23c043a372")
      override
          fun regexPatternSetReferenceStatement(regexPatternSetReferenceStatement: RegexPatternSetReferenceStatementProperty.Builder.() -> Unit):
          Unit =
          regexPatternSetReferenceStatement(RegexPatternSetReferenceStatementProperty(regexPatternSetReferenceStatement))

      override fun sizeConstraintStatement(sizeConstraintStatement: IResolvable) {
        cdkBuilder.sizeConstraintStatement(sizeConstraintStatement.let(IResolvable::unwrap))
      }

      override
          fun sizeConstraintStatement(sizeConstraintStatement: SizeConstraintStatementProperty) {
        cdkBuilder.sizeConstraintStatement(sizeConstraintStatement.let(SizeConstraintStatementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f70e09b6dff74f1e7a668ab987d9edf5a8b525e88baf4dd3a64c5ba80790b394")
      override
          fun sizeConstraintStatement(sizeConstraintStatement: SizeConstraintStatementProperty.Builder.() -> Unit):
          Unit = sizeConstraintStatement(SizeConstraintStatementProperty(sizeConstraintStatement))

      override fun sqliMatchStatement(sqliMatchStatement: IResolvable) {
        cdkBuilder.sqliMatchStatement(sqliMatchStatement.let(IResolvable::unwrap))
      }

      override fun sqliMatchStatement(sqliMatchStatement: SqliMatchStatementProperty) {
        cdkBuilder.sqliMatchStatement(sqliMatchStatement.let(SqliMatchStatementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0fdab764bc61099312cfe517891cb2231ee5552284f8fd95a4f44fdbb7ddf3f5")
      override
          fun sqliMatchStatement(sqliMatchStatement: SqliMatchStatementProperty.Builder.() -> Unit):
          Unit = sqliMatchStatement(SqliMatchStatementProperty(sqliMatchStatement))

      override fun xssMatchStatement(xssMatchStatement: IResolvable) {
        cdkBuilder.xssMatchStatement(xssMatchStatement.let(IResolvable::unwrap))
      }

      override fun xssMatchStatement(xssMatchStatement: XssMatchStatementProperty) {
        cdkBuilder.xssMatchStatement(xssMatchStatement.let(XssMatchStatementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d2f50b19cc87986feaf8db81faf794d3554022dd9e71876a010beea7ac2d6210")
      override
          fun xssMatchStatement(xssMatchStatement: XssMatchStatementProperty.Builder.() -> Unit):
          Unit = xssMatchStatement(XssMatchStatementProperty(xssMatchStatement))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.StatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.StatementProperty,
    ) : StatementProperty {
      override fun andStatement(): Any? = unwrap(this).getAndStatement()

      override fun byteMatchStatement(): Any? = unwrap(this).getByteMatchStatement()

      override fun geoMatchStatement(): Any? = unwrap(this).getGeoMatchStatement()

      override fun ipSetReferenceStatement(): Any? = unwrap(this).getIpSetReferenceStatement()

      override fun labelMatchStatement(): Any? = unwrap(this).getLabelMatchStatement()

      override fun notStatement(): Any? = unwrap(this).getNotStatement()

      override fun orStatement(): Any? = unwrap(this).getOrStatement()

      override fun rateBasedStatement(): Any? = unwrap(this).getRateBasedStatement()

      override fun regexMatchStatement(): Any? = unwrap(this).getRegexMatchStatement()

      override fun regexPatternSetReferenceStatement(): Any? =
          unwrap(this).getRegexPatternSetReferenceStatement()

      override fun sizeConstraintStatement(): Any? = unwrap(this).getSizeConstraintStatement()

      override fun sqliMatchStatement(): Any? = unwrap(this).getSqliMatchStatement()

      override fun xssMatchStatement(): Any? = unwrap(this).getXssMatchStatement()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.StatementProperty):
          StatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatementProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.StatementProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RateBasedStatementCustomKeyProperty {
    public fun cookie(): Any? = unwrap(this).getCookie()

    public fun forwardedIp(): Any? = unwrap(this).getForwardedIp()

    public fun `header`(): Any? = unwrap(this).getHeader()

    public fun httpMethod(): Any? = unwrap(this).getHttpMethod()

    public fun ip(): Any? = unwrap(this).getIp()

    public fun labelNamespace(): Any? = unwrap(this).getLabelNamespace()

    public fun queryArgument(): Any? = unwrap(this).getQueryArgument()

    public fun queryString(): Any? = unwrap(this).getQueryString()

    public fun uriPath(): Any? = unwrap(this).getUriPath()

    public interface Builder {
      public fun cookie(cookie: IResolvable)

      public fun cookie(cookie: RateLimitCookieProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("55b22f42f92ee4166d1cbe6d228ecd33bfc2230078ba6aecf45580ab50cb5ff5")
      public fun cookie(cookie: RateLimitCookieProperty.Builder.() -> Unit)

      public fun forwardedIp(forwardedIp: Any)

      public fun `header`(`header`: IResolvable)

      public fun `header`(`header`: RateLimitHeaderProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6562f2228682bc6e2b661e4b54548c2c1d088540942ab6fd64ad3050c8f4cf74")
      public fun `header`(`header`: RateLimitHeaderProperty.Builder.() -> Unit)

      public fun httpMethod(httpMethod: Any)

      public fun ip(ip: Any)

      public fun labelNamespace(labelNamespace: IResolvable)

      public fun labelNamespace(labelNamespace: RateLimitLabelNamespaceProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("462f6556cda43ce02a198ec04c8a27523800fea2a014292d9ef2127f8fd03f0f")
      public fun labelNamespace(labelNamespace: RateLimitLabelNamespaceProperty.Builder.() -> Unit)

      public fun queryArgument(queryArgument: IResolvable)

      public fun queryArgument(queryArgument: RateLimitQueryArgumentProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a419c7be9e091c68d11d4693299510992345a72ec91adfd3873158c2a34fbea8")
      public fun queryArgument(queryArgument: RateLimitQueryArgumentProperty.Builder.() -> Unit)

      public fun queryString(queryString: IResolvable)

      public fun queryString(queryString: RateLimitQueryStringProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b69b326274f5afdd3f4e88bfefaed942d4dbb5cb89d76a227030e75e241db0e")
      public fun queryString(queryString: RateLimitQueryStringProperty.Builder.() -> Unit)

      public fun uriPath(uriPath: IResolvable)

      public fun uriPath(uriPath: RateLimitUriPathProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8f5655c6137be95b34ce4ab64e46b98f147382c959051b102e0061024707e3ec")
      public fun uriPath(uriPath: RateLimitUriPathProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateBasedStatementCustomKeyProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateBasedStatementCustomKeyProperty.builder()

      override fun cookie(cookie: IResolvable) {
        cdkBuilder.cookie(cookie.let(IResolvable::unwrap))
      }

      override fun cookie(cookie: RateLimitCookieProperty) {
        cdkBuilder.cookie(cookie.let(RateLimitCookieProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("55b22f42f92ee4166d1cbe6d228ecd33bfc2230078ba6aecf45580ab50cb5ff5")
      override fun cookie(cookie: RateLimitCookieProperty.Builder.() -> Unit): Unit =
          cookie(RateLimitCookieProperty(cookie))

      override fun forwardedIp(forwardedIp: Any) {
        cdkBuilder.forwardedIp(forwardedIp)
      }

      override fun `header`(`header`: IResolvable) {
        cdkBuilder.`header`(`header`.let(IResolvable::unwrap))
      }

      override fun `header`(`header`: RateLimitHeaderProperty) {
        cdkBuilder.`header`(`header`.let(RateLimitHeaderProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6562f2228682bc6e2b661e4b54548c2c1d088540942ab6fd64ad3050c8f4cf74")
      override fun `header`(`header`: RateLimitHeaderProperty.Builder.() -> Unit): Unit =
          `header`(RateLimitHeaderProperty(`header`))

      override fun httpMethod(httpMethod: Any) {
        cdkBuilder.httpMethod(httpMethod)
      }

      override fun ip(ip: Any) {
        cdkBuilder.ip(ip)
      }

      override fun labelNamespace(labelNamespace: IResolvable) {
        cdkBuilder.labelNamespace(labelNamespace.let(IResolvable::unwrap))
      }

      override fun labelNamespace(labelNamespace: RateLimitLabelNamespaceProperty) {
        cdkBuilder.labelNamespace(labelNamespace.let(RateLimitLabelNamespaceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("462f6556cda43ce02a198ec04c8a27523800fea2a014292d9ef2127f8fd03f0f")
      override
          fun labelNamespace(labelNamespace: RateLimitLabelNamespaceProperty.Builder.() -> Unit):
          Unit = labelNamespace(RateLimitLabelNamespaceProperty(labelNamespace))

      override fun queryArgument(queryArgument: IResolvable) {
        cdkBuilder.queryArgument(queryArgument.let(IResolvable::unwrap))
      }

      override fun queryArgument(queryArgument: RateLimitQueryArgumentProperty) {
        cdkBuilder.queryArgument(queryArgument.let(RateLimitQueryArgumentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a419c7be9e091c68d11d4693299510992345a72ec91adfd3873158c2a34fbea8")
      override fun queryArgument(queryArgument: RateLimitQueryArgumentProperty.Builder.() -> Unit):
          Unit = queryArgument(RateLimitQueryArgumentProperty(queryArgument))

      override fun queryString(queryString: IResolvable) {
        cdkBuilder.queryString(queryString.let(IResolvable::unwrap))
      }

      override fun queryString(queryString: RateLimitQueryStringProperty) {
        cdkBuilder.queryString(queryString.let(RateLimitQueryStringProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b69b326274f5afdd3f4e88bfefaed942d4dbb5cb89d76a227030e75e241db0e")
      override fun queryString(queryString: RateLimitQueryStringProperty.Builder.() -> Unit): Unit =
          queryString(RateLimitQueryStringProperty(queryString))

      override fun uriPath(uriPath: IResolvable) {
        cdkBuilder.uriPath(uriPath.let(IResolvable::unwrap))
      }

      override fun uriPath(uriPath: RateLimitUriPathProperty) {
        cdkBuilder.uriPath(uriPath.let(RateLimitUriPathProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8f5655c6137be95b34ce4ab64e46b98f147382c959051b102e0061024707e3ec")
      override fun uriPath(uriPath: RateLimitUriPathProperty.Builder.() -> Unit): Unit =
          uriPath(RateLimitUriPathProperty(uriPath))

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateBasedStatementCustomKeyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateBasedStatementCustomKeyProperty,
    ) : RateBasedStatementCustomKeyProperty {
      override fun cookie(): Any? = unwrap(this).getCookie()

      override fun forwardedIp(): Any? = unwrap(this).getForwardedIp()

      override fun `header`(): Any? = unwrap(this).getHeader()

      override fun httpMethod(): Any? = unwrap(this).getHttpMethod()

      override fun ip(): Any? = unwrap(this).getIp()

      override fun labelNamespace(): Any? = unwrap(this).getLabelNamespace()

      override fun queryArgument(): Any? = unwrap(this).getQueryArgument()

      override fun queryString(): Any? = unwrap(this).getQueryString()

      override fun uriPath(): Any? = unwrap(this).getUriPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          RateBasedStatementCustomKeyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateBasedStatementCustomKeyProperty):
          RateBasedStatementCustomKeyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateBasedStatementCustomKeyProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateBasedStatementCustomKeyProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface IPSetForwardedIPConfigurationProperty {
    public fun fallbackBehavior(): String

    public fun headerName(): String

    public fun position(): String

    public interface Builder {
      public fun fallbackBehavior(fallbackBehavior: String)

      public fun headerName(headerName: String)

      public fun position(position: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.IPSetForwardedIPConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.IPSetForwardedIPConfigurationProperty.builder()

      override fun fallbackBehavior(fallbackBehavior: String) {
        cdkBuilder.fallbackBehavior(fallbackBehavior)
      }

      override fun headerName(headerName: String) {
        cdkBuilder.headerName(headerName)
      }

      override fun position(position: String) {
        cdkBuilder.position(position)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.IPSetForwardedIPConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.IPSetForwardedIPConfigurationProperty,
    ) : IPSetForwardedIPConfigurationProperty {
      override fun fallbackBehavior(): String = unwrap(this).getFallbackBehavior()

      override fun headerName(): String = unwrap(this).getHeaderName()

      override fun position(): String = unwrap(this).getPosition()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          IPSetForwardedIPConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.IPSetForwardedIPConfigurationProperty):
          IPSetForwardedIPConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IPSetForwardedIPConfigurationProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.IPSetForwardedIPConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface IPSetReferenceStatementProperty {
    public fun arn(): String

    public fun ipSetForwardedIpConfig(): Any? = unwrap(this).getIpSetForwardedIpConfig()

    public interface Builder {
      public fun arn(arn: String)

      public fun ipSetForwardedIpConfig(ipSetForwardedIpConfig: IResolvable)

      public
          fun ipSetForwardedIpConfig(ipSetForwardedIpConfig: IPSetForwardedIPConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fee0efc830f80625d95a91debb07093187d37f3a8db09be387f35560590f0d96")
      public
          fun ipSetForwardedIpConfig(ipSetForwardedIpConfig: IPSetForwardedIPConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.IPSetReferenceStatementProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.IPSetReferenceStatementProperty.builder()

      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      override fun ipSetForwardedIpConfig(ipSetForwardedIpConfig: IResolvable) {
        cdkBuilder.ipSetForwardedIpConfig(ipSetForwardedIpConfig.let(IResolvable::unwrap))
      }

      override
          fun ipSetForwardedIpConfig(ipSetForwardedIpConfig: IPSetForwardedIPConfigurationProperty) {
        cdkBuilder.ipSetForwardedIpConfig(ipSetForwardedIpConfig.let(IPSetForwardedIPConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fee0efc830f80625d95a91debb07093187d37f3a8db09be387f35560590f0d96")
      override
          fun ipSetForwardedIpConfig(ipSetForwardedIpConfig: IPSetForwardedIPConfigurationProperty.Builder.() -> Unit):
          Unit =
          ipSetForwardedIpConfig(IPSetForwardedIPConfigurationProperty(ipSetForwardedIpConfig))

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.IPSetReferenceStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.IPSetReferenceStatementProperty,
    ) : IPSetReferenceStatementProperty {
      override fun arn(): String = unwrap(this).getArn()

      override fun ipSetForwardedIpConfig(): Any? = unwrap(this).getIpSetForwardedIpConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IPSetReferenceStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.IPSetReferenceStatementProperty):
          IPSetReferenceStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IPSetReferenceStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.IPSetReferenceStatementProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface OrStatementProperty {
    public fun statements(): Any

    public interface Builder {
      public fun statements(statements: IResolvable)

      public fun statements(statements: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.OrStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.OrStatementProperty.builder()

      override fun statements(statements: IResolvable) {
        cdkBuilder.statements(statements.let(IResolvable::unwrap))
      }

      override fun statements(statements: List<Any>) {
        cdkBuilder.statements(statements)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.OrStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.OrStatementProperty,
    ) : OrStatementProperty {
      override fun statements(): Any = unwrap(this).getStatements()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OrStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.OrStatementProperty):
          OrStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OrStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.OrStatementProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ByteMatchStatementProperty {
    public fun fieldToMatch(): Any

    public fun positionalConstraint(): String

    public fun searchString(): String? = unwrap(this).getSearchString()

    public fun searchStringBase64(): String? = unwrap(this).getSearchStringBase64()

    public fun textTransformations(): Any

    public interface Builder {
      public fun fieldToMatch(fieldToMatch: IResolvable)

      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cdd402302b29c1a81a7d3bbe74b2e07df195a1a2ecc79ad6adf6b9023a48487c")
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit)

      public fun positionalConstraint(positionalConstraint: String)

      public fun searchString(searchString: String)

      public fun searchStringBase64(searchStringBase64: String)

      public fun textTransformations(textTransformations: IResolvable)

      public fun textTransformations(textTransformations: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ByteMatchStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ByteMatchStatementProperty.builder()

      override fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(IResolvable::unwrap))
      }

      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(FieldToMatchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cdd402302b29c1a81a7d3bbe74b2e07df195a1a2ecc79ad6adf6b9023a48487c")
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit): Unit =
          fieldToMatch(FieldToMatchProperty(fieldToMatch))

      override fun positionalConstraint(positionalConstraint: String) {
        cdkBuilder.positionalConstraint(positionalConstraint)
      }

      override fun searchString(searchString: String) {
        cdkBuilder.searchString(searchString)
      }

      override fun searchStringBase64(searchStringBase64: String) {
        cdkBuilder.searchStringBase64(searchStringBase64)
      }

      override fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations.let(IResolvable::unwrap))
      }

      override fun textTransformations(textTransformations: List<Any>) {
        cdkBuilder.textTransformations(textTransformations)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ByteMatchStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ByteMatchStatementProperty,
    ) : ByteMatchStatementProperty {
      override fun fieldToMatch(): Any = unwrap(this).getFieldToMatch()

      override fun positionalConstraint(): String = unwrap(this).getPositionalConstraint()

      override fun searchString(): String? = unwrap(this).getSearchString()

      override fun searchStringBase64(): String? = unwrap(this).getSearchStringBase64()

      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ByteMatchStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.ByteMatchStatementProperty):
          ByteMatchStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ByteMatchStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ByteMatchStatementProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface RegexMatchStatementProperty {
    public fun fieldToMatch(): Any

    public fun regexString(): String

    public fun textTransformations(): Any

    public interface Builder {
      public fun fieldToMatch(fieldToMatch: IResolvable)

      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eb40ce3911817478c43de73e702f6c1ca56a470dc33f39e4ca663ee4db2f78be")
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit)

      public fun regexString(regexString: String)

      public fun textTransformations(textTransformations: IResolvable)

      public fun textTransformations(textTransformations: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RegexMatchStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RegexMatchStatementProperty.builder()

      override fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(IResolvable::unwrap))
      }

      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(FieldToMatchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eb40ce3911817478c43de73e702f6c1ca56a470dc33f39e4ca663ee4db2f78be")
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit): Unit =
          fieldToMatch(FieldToMatchProperty(fieldToMatch))

      override fun regexString(regexString: String) {
        cdkBuilder.regexString(regexString)
      }

      override fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations.let(IResolvable::unwrap))
      }

      override fun textTransformations(textTransformations: List<Any>) {
        cdkBuilder.textTransformations(textTransformations)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RegexMatchStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RegexMatchStatementProperty,
    ) : RegexMatchStatementProperty {
      override fun fieldToMatch(): Any = unwrap(this).getFieldToMatch()

      override fun regexString(): String = unwrap(this).getRegexString()

      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RegexMatchStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.RegexMatchStatementProperty):
          RegexMatchStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RegexMatchStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RegexMatchStatementProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ChallengeConfigProperty {
    public fun immunityTimeProperty(): Any? = unwrap(this).getImmunityTimeProperty()

    public interface Builder {
      public fun immunityTimeProperty(immunityTimeProperty: IResolvable)

      public fun immunityTimeProperty(immunityTimeProperty: ImmunityTimePropertyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("25712aa626ae3a601c0c8fb1bdf61d71e0be3743f106c426601d52f166c580ec")
      public
          fun immunityTimeProperty(immunityTimeProperty: ImmunityTimePropertyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ChallengeConfigProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ChallengeConfigProperty.builder()

      override fun immunityTimeProperty(immunityTimeProperty: IResolvable) {
        cdkBuilder.immunityTimeProperty(immunityTimeProperty.let(IResolvable::unwrap))
      }

      override fun immunityTimeProperty(immunityTimeProperty: ImmunityTimePropertyProperty) {
        cdkBuilder.immunityTimeProperty(immunityTimeProperty.let(ImmunityTimePropertyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("25712aa626ae3a601c0c8fb1bdf61d71e0be3743f106c426601d52f166c580ec")
      override
          fun immunityTimeProperty(immunityTimeProperty: ImmunityTimePropertyProperty.Builder.() -> Unit):
          Unit = immunityTimeProperty(ImmunityTimePropertyProperty(immunityTimeProperty))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.ChallengeConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ChallengeConfigProperty,
    ) : ChallengeConfigProperty {
      override fun immunityTimeProperty(): Any? = unwrap(this).getImmunityTimeProperty()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ChallengeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.ChallengeConfigProperty):
          ChallengeConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ChallengeConfigProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ChallengeConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TextTransformationProperty {
    public fun priority(): Number

    public fun type(): String

    public interface Builder {
      public fun priority(priority: Number)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.TextTransformationProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.TextTransformationProperty.builder()

      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.TextTransformationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.TextTransformationProperty,
    ) : TextTransformationProperty {
      override fun priority(): Number = unwrap(this).getPriority()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TextTransformationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.TextTransformationProperty):
          TextTransformationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TextTransformationProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.TextTransformationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface CaptchaConfigProperty {
    public fun immunityTimeProperty(): Any? = unwrap(this).getImmunityTimeProperty()

    public interface Builder {
      public fun immunityTimeProperty(immunityTimeProperty: IResolvable)

      public fun immunityTimeProperty(immunityTimeProperty: ImmunityTimePropertyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a172e854a3c4319f474ed6bdb9a563321b7c9c1a3f6d04c8bb7394d5423b915e")
      public
          fun immunityTimeProperty(immunityTimeProperty: ImmunityTimePropertyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CaptchaConfigProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CaptchaConfigProperty.builder()

      override fun immunityTimeProperty(immunityTimeProperty: IResolvable) {
        cdkBuilder.immunityTimeProperty(immunityTimeProperty.let(IResolvable::unwrap))
      }

      override fun immunityTimeProperty(immunityTimeProperty: ImmunityTimePropertyProperty) {
        cdkBuilder.immunityTimeProperty(immunityTimeProperty.let(ImmunityTimePropertyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a172e854a3c4319f474ed6bdb9a563321b7c9c1a3f6d04c8bb7394d5423b915e")
      override
          fun immunityTimeProperty(immunityTimeProperty: ImmunityTimePropertyProperty.Builder.() -> Unit):
          Unit = immunityTimeProperty(ImmunityTimePropertyProperty(immunityTimeProperty))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.CaptchaConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CaptchaConfigProperty,
    ) : CaptchaConfigProperty {
      override fun immunityTimeProperty(): Any? = unwrap(this).getImmunityTimeProperty()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CaptchaConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.CaptchaConfigProperty):
          CaptchaConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CaptchaConfigProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CaptchaConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CountProperty {
    public fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()

    public interface Builder {
      public fun customRequestHandling(customRequestHandling: IResolvable)

      public fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("791b1be31c13a12b3ccd0f9185ac3d0c71a8a444165a47156e8cf5e1b558a401")
      public
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CountProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CountProperty.builder()

      override fun customRequestHandling(customRequestHandling: IResolvable) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(IResolvable::unwrap))
      }

      override fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(CustomRequestHandlingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("791b1be31c13a12b3ccd0f9185ac3d0c71a8a444165a47156e8cf5e1b558a401")
      override
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit):
          Unit = customRequestHandling(CustomRequestHandlingProperty(customRequestHandling))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.CountProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.CountProperty,
    ) : CountProperty {
      override fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CountProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.CountProperty):
          CountProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CountProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CountProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface BodyProperty {
    public fun oversizeHandling(): String? = unwrap(this).getOversizeHandling()

    public interface Builder {
      public fun oversizeHandling(oversizeHandling: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.BodyProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.BodyProperty.builder()

      override fun oversizeHandling(oversizeHandling: String) {
        cdkBuilder.oversizeHandling(oversizeHandling)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.BodyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.BodyProperty,
    ) : BodyProperty {
      override fun oversizeHandling(): String? = unwrap(this).getOversizeHandling()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BodyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.BodyProperty):
          BodyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BodyProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.BodyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CustomRequestHandlingProperty {
    public fun insertHeaders(): Any

    public interface Builder {
      public fun insertHeaders(insertHeaders: IResolvable)

      public fun insertHeaders(insertHeaders: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomRequestHandlingProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomRequestHandlingProperty.builder()

      override fun insertHeaders(insertHeaders: IResolvable) {
        cdkBuilder.insertHeaders(insertHeaders.let(IResolvable::unwrap))
      }

      override fun insertHeaders(insertHeaders: List<Any>) {
        cdkBuilder.insertHeaders(insertHeaders)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomRequestHandlingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomRequestHandlingProperty,
    ) : CustomRequestHandlingProperty {
      override fun insertHeaders(): Any = unwrap(this).getInsertHeaders()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomRequestHandlingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomRequestHandlingProperty):
          CustomRequestHandlingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomRequestHandlingProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomRequestHandlingProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RateLimitCookieProperty {
    public fun name(): String

    public fun textTransformations(): Any

    public interface Builder {
      public fun name(name: String)

      public fun textTransformations(textTransformations: IResolvable)

      public fun textTransformations(textTransformations: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitCookieProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitCookieProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations.let(IResolvable::unwrap))
      }

      override fun textTransformations(textTransformations: List<Any>) {
        cdkBuilder.textTransformations(textTransformations)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitCookieProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitCookieProperty,
    ) : RateLimitCookieProperty {
      override fun name(): String = unwrap(this).getName()

      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RateLimitCookieProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitCookieProperty):
          RateLimitCookieProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateLimitCookieProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitCookieProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ForwardedIPConfigurationProperty {
    public fun fallbackBehavior(): String

    public fun headerName(): String

    public interface Builder {
      public fun fallbackBehavior(fallbackBehavior: String)

      public fun headerName(headerName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ForwardedIPConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ForwardedIPConfigurationProperty.builder()

      override fun fallbackBehavior(fallbackBehavior: String) {
        cdkBuilder.fallbackBehavior(fallbackBehavior)
      }

      override fun headerName(headerName: String) {
        cdkBuilder.headerName(headerName)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ForwardedIPConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ForwardedIPConfigurationProperty,
    ) : ForwardedIPConfigurationProperty {
      override fun fallbackBehavior(): String = unwrap(this).getFallbackBehavior()

      override fun headerName(): String = unwrap(this).getHeaderName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ForwardedIPConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.ForwardedIPConfigurationProperty):
          ForwardedIPConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ForwardedIPConfigurationProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ForwardedIPConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ChallengeProperty {
    public fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()

    public interface Builder {
      public fun customRequestHandling(customRequestHandling: IResolvable)

      public fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a5d98b21c1d35798283e3eb768a2465de92a428b3bcc6e60aaa0b69c1f119bc4")
      public
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ChallengeProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ChallengeProperty.builder()

      override fun customRequestHandling(customRequestHandling: IResolvable) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(IResolvable::unwrap))
      }

      override fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(CustomRequestHandlingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a5d98b21c1d35798283e3eb768a2465de92a428b3bcc6e60aaa0b69c1f119bc4")
      override
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit):
          Unit = customRequestHandling(CustomRequestHandlingProperty(customRequestHandling))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.ChallengeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.ChallengeProperty,
    ) : ChallengeProperty {
      override fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ChallengeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.ChallengeProperty):
          ChallengeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ChallengeProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ChallengeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CustomHTTPHeaderProperty {
    public fun name(): String

    public fun `value`(): String

    public interface Builder {
      public fun name(name: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomHTTPHeaderProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomHTTPHeaderProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomHTTPHeaderProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomHTTPHeaderProperty,
    ) : CustomHTTPHeaderProperty {
      override fun name(): String = unwrap(this).getName()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomHTTPHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomHTTPHeaderProperty):
          CustomHTTPHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomHTTPHeaderProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomHTTPHeaderProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RegexPatternSetReferenceStatementProperty {
    public fun arn(): String

    public fun fieldToMatch(): Any

    public fun textTransformations(): Any

    public interface Builder {
      public fun arn(arn: String)

      public fun fieldToMatch(fieldToMatch: IResolvable)

      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a2377193f1c16e3206d2f39d8eec33c0c3f4e6036badf8868a13762c5b3d6e4e")
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit)

      public fun textTransformations(textTransformations: IResolvable)

      public fun textTransformations(textTransformations: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RegexPatternSetReferenceStatementProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RegexPatternSetReferenceStatementProperty.builder()

      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      override fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(IResolvable::unwrap))
      }

      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(FieldToMatchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a2377193f1c16e3206d2f39d8eec33c0c3f4e6036badf8868a13762c5b3d6e4e")
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit): Unit =
          fieldToMatch(FieldToMatchProperty(fieldToMatch))

      override fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations.let(IResolvable::unwrap))
      }

      override fun textTransformations(textTransformations: List<Any>) {
        cdkBuilder.textTransformations(textTransformations)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RegexPatternSetReferenceStatementProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RegexPatternSetReferenceStatementProperty,
    ) : RegexPatternSetReferenceStatementProperty {
      override fun arn(): String = unwrap(this).getArn()

      override fun fieldToMatch(): Any = unwrap(this).getFieldToMatch()

      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          RegexPatternSetReferenceStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.RegexPatternSetReferenceStatementProperty):
          RegexPatternSetReferenceStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RegexPatternSetReferenceStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RegexPatternSetReferenceStatementProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CustomResponseBodyProperty {
    public fun content(): String

    public fun contentType(): String

    public interface Builder {
      public fun content(content: String)

      public fun contentType(contentType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomResponseBodyProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomResponseBodyProperty.builder()

      override fun content(content: String) {
        cdkBuilder.content(content)
      }

      override fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomResponseBodyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomResponseBodyProperty,
    ) : CustomResponseBodyProperty {
      override fun content(): String = unwrap(this).getContent()

      override fun contentType(): String = unwrap(this).getContentType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomResponseBodyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomResponseBodyProperty):
          CustomResponseBodyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomResponseBodyProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomResponseBodyProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface XssMatchStatementProperty {
    public fun fieldToMatch(): Any

    public fun textTransformations(): Any

    public interface Builder {
      public fun fieldToMatch(fieldToMatch: IResolvable)

      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b617bbed9fdad39e816833cd6c4c77a1ae17137172debd310ea2595d90777376")
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit)

      public fun textTransformations(textTransformations: IResolvable)

      public fun textTransformations(textTransformations: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.XssMatchStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.XssMatchStatementProperty.builder()

      override fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(IResolvable::unwrap))
      }

      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(FieldToMatchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b617bbed9fdad39e816833cd6c4c77a1ae17137172debd310ea2595d90777376")
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit): Unit =
          fieldToMatch(FieldToMatchProperty(fieldToMatch))

      override fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations.let(IResolvable::unwrap))
      }

      override fun textTransformations(textTransformations: List<Any>) {
        cdkBuilder.textTransformations(textTransformations)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.XssMatchStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.XssMatchStatementProperty,
    ) : XssMatchStatementProperty {
      override fun fieldToMatch(): Any = unwrap(this).getFieldToMatch()

      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): XssMatchStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.XssMatchStatementProperty):
          XssMatchStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: XssMatchStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.XssMatchStatementProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AllowProperty {
    public fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()

    public interface Builder {
      public fun customRequestHandling(customRequestHandling: IResolvable)

      public fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab4f0859eb9840e581b7111a708ff3e97e8bb3087dc624f47b149e0643ef8b44")
      public
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.AllowProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.AllowProperty.builder()

      override fun customRequestHandling(customRequestHandling: IResolvable) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(IResolvable::unwrap))
      }

      override fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(CustomRequestHandlingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab4f0859eb9840e581b7111a708ff3e97e8bb3087dc624f47b149e0643ef8b44")
      override
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit):
          Unit = customRequestHandling(CustomRequestHandlingProperty(customRequestHandling))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.AllowProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.AllowProperty,
    ) : AllowProperty {
      override fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AllowProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.AllowProperty):
          AllowProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AllowProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.AllowProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SingleHeaderProperty {
    public fun name(): String

    public interface Builder {
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SingleHeaderProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SingleHeaderProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.SingleHeaderProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SingleHeaderProperty,
    ) : SingleHeaderProperty {
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SingleHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.SingleHeaderProperty):
          SingleHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SingleHeaderProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SingleHeaderProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CookiesProperty {
    public fun matchPattern(): Any

    public fun matchScope(): String

    public fun oversizeHandling(): String

    public interface Builder {
      public fun matchPattern(matchPattern: IResolvable)

      public fun matchPattern(matchPattern: CookieMatchPatternProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("33c7a4294d46b15314faa20cbc581a5299fe769d51328a38caa4a269c8f46a67")
      public fun matchPattern(matchPattern: CookieMatchPatternProperty.Builder.() -> Unit)

      public fun matchScope(matchScope: String)

      public fun oversizeHandling(oversizeHandling: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CookiesProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CookiesProperty.builder()

      override fun matchPattern(matchPattern: IResolvable) {
        cdkBuilder.matchPattern(matchPattern.let(IResolvable::unwrap))
      }

      override fun matchPattern(matchPattern: CookieMatchPatternProperty) {
        cdkBuilder.matchPattern(matchPattern.let(CookieMatchPatternProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("33c7a4294d46b15314faa20cbc581a5299fe769d51328a38caa4a269c8f46a67")
      override fun matchPattern(matchPattern: CookieMatchPatternProperty.Builder.() -> Unit): Unit =
          matchPattern(CookieMatchPatternProperty(matchPattern))

      override fun matchScope(matchScope: String) {
        cdkBuilder.matchScope(matchScope)
      }

      override fun oversizeHandling(oversizeHandling: String) {
        cdkBuilder.oversizeHandling(oversizeHandling)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.CookiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.CookiesProperty,
    ) : CookiesProperty {
      override fun matchPattern(): Any = unwrap(this).getMatchPattern()

      override fun matchScope(): String = unwrap(this).getMatchScope()

      override fun oversizeHandling(): String = unwrap(this).getOversizeHandling()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CookiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.CookiesProperty):
          CookiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CookiesProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CookiesProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SingleQueryArgumentProperty {
    public fun name(): String

    public interface Builder {
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SingleQueryArgumentProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SingleQueryArgumentProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SingleQueryArgumentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SingleQueryArgumentProperty,
    ) : SingleQueryArgumentProperty {
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SingleQueryArgumentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.SingleQueryArgumentProperty):
          SingleQueryArgumentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SingleQueryArgumentProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SingleQueryArgumentProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface JsonMatchPatternProperty {
    public fun all(): Any? = unwrap(this).getAll()

    public fun includedPaths(): List<String> = unwrap(this).getIncludedPaths() ?: emptyList()

    public interface Builder {
      public fun all(all: Any)

      public fun includedPaths(includedPaths: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonMatchPatternProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonMatchPatternProperty.builder()

      override fun all(all: Any) {
        cdkBuilder.all(all)
      }

      override fun includedPaths(includedPaths: List<String>) {
        cdkBuilder.includedPaths(includedPaths)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonMatchPatternProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonMatchPatternProperty,
    ) : JsonMatchPatternProperty {
      override fun all(): Any? = unwrap(this).getAll()

      override fun includedPaths(): List<String> = unwrap(this).getIncludedPaths() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): JsonMatchPatternProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonMatchPatternProperty):
          JsonMatchPatternProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JsonMatchPatternProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonMatchPatternProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RateLimitUriPathProperty {
    public fun textTransformations(): Any

    public interface Builder {
      public fun textTransformations(textTransformations: IResolvable)

      public fun textTransformations(textTransformations: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitUriPathProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitUriPathProperty.builder()

      override fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations.let(IResolvable::unwrap))
      }

      override fun textTransformations(textTransformations: List<Any>) {
        cdkBuilder.textTransformations(textTransformations)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitUriPathProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitUriPathProperty,
    ) : RateLimitUriPathProperty {
      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RateLimitUriPathProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitUriPathProperty):
          RateLimitUriPathProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateLimitUriPathProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitUriPathProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface BlockProperty {
    public fun customResponse(): Any? = unwrap(this).getCustomResponse()

    public interface Builder {
      public fun customResponse(customResponse: IResolvable)

      public fun customResponse(customResponse: CustomResponseProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a661143ecc23271f0e9bf9540d9034164117bf5f41099f43a8eb0cf4c1b20a3")
      public fun customResponse(customResponse: CustomResponseProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.BlockProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.BlockProperty.builder()

      override fun customResponse(customResponse: IResolvable) {
        cdkBuilder.customResponse(customResponse.let(IResolvable::unwrap))
      }

      override fun customResponse(customResponse: CustomResponseProperty) {
        cdkBuilder.customResponse(customResponse.let(CustomResponseProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a661143ecc23271f0e9bf9540d9034164117bf5f41099f43a8eb0cf4c1b20a3")
      override fun customResponse(customResponse: CustomResponseProperty.Builder.() -> Unit): Unit =
          customResponse(CustomResponseProperty(customResponse))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.BlockProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.BlockProperty,
    ) : BlockProperty {
      override fun customResponse(): Any? = unwrap(this).getCustomResponse()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BlockProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.BlockProperty):
          BlockProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BlockProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.BlockProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RateBasedStatementProperty {
    public fun aggregateKeyType(): String

    public fun customKeys(): Any? = unwrap(this).getCustomKeys()

    public fun forwardedIpConfig(): Any? = unwrap(this).getForwardedIpConfig()

    public fun limit(): Number

    public fun scopeDownStatement(): Any? = unwrap(this).getScopeDownStatement()

    public interface Builder {
      public fun aggregateKeyType(aggregateKeyType: String)

      public fun customKeys(customKeys: IResolvable)

      public fun customKeys(customKeys: List<Any>)

      public fun forwardedIpConfig(forwardedIpConfig: IResolvable)

      public fun forwardedIpConfig(forwardedIpConfig: ForwardedIPConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("66d6b4b34b8729fab7ced212e36788285f427e1a88ab1a93bd50f8f1c905f5c8")
      public
          fun forwardedIpConfig(forwardedIpConfig: ForwardedIPConfigurationProperty.Builder.() -> Unit)

      public fun limit(limit: Number)

      public fun scopeDownStatement(scopeDownStatement: IResolvable)

      public fun scopeDownStatement(scopeDownStatement: StatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("46c7c628fa6c373879f7fe437cda0831a075f3df8980c268da4be8cea4e8348b")
      public fun scopeDownStatement(scopeDownStatement: StatementProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateBasedStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateBasedStatementProperty.builder()

      override fun aggregateKeyType(aggregateKeyType: String) {
        cdkBuilder.aggregateKeyType(aggregateKeyType)
      }

      override fun customKeys(customKeys: IResolvable) {
        cdkBuilder.customKeys(customKeys.let(IResolvable::unwrap))
      }

      override fun customKeys(customKeys: List<Any>) {
        cdkBuilder.customKeys(customKeys)
      }

      override fun forwardedIpConfig(forwardedIpConfig: IResolvable) {
        cdkBuilder.forwardedIpConfig(forwardedIpConfig.let(IResolvable::unwrap))
      }

      override fun forwardedIpConfig(forwardedIpConfig: ForwardedIPConfigurationProperty) {
        cdkBuilder.forwardedIpConfig(forwardedIpConfig.let(ForwardedIPConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("66d6b4b34b8729fab7ced212e36788285f427e1a88ab1a93bd50f8f1c905f5c8")
      override
          fun forwardedIpConfig(forwardedIpConfig: ForwardedIPConfigurationProperty.Builder.() -> Unit):
          Unit = forwardedIpConfig(ForwardedIPConfigurationProperty(forwardedIpConfig))

      override fun limit(limit: Number) {
        cdkBuilder.limit(limit)
      }

      override fun scopeDownStatement(scopeDownStatement: IResolvable) {
        cdkBuilder.scopeDownStatement(scopeDownStatement.let(IResolvable::unwrap))
      }

      override fun scopeDownStatement(scopeDownStatement: StatementProperty) {
        cdkBuilder.scopeDownStatement(scopeDownStatement.let(StatementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("46c7c628fa6c373879f7fe437cda0831a075f3df8980c268da4be8cea4e8348b")
      override fun scopeDownStatement(scopeDownStatement: StatementProperty.Builder.() -> Unit):
          Unit = scopeDownStatement(StatementProperty(scopeDownStatement))

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateBasedStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateBasedStatementProperty,
    ) : RateBasedStatementProperty {
      override fun aggregateKeyType(): String = unwrap(this).getAggregateKeyType()

      override fun customKeys(): Any? = unwrap(this).getCustomKeys()

      override fun forwardedIpConfig(): Any? = unwrap(this).getForwardedIpConfig()

      override fun limit(): Number = unwrap(this).getLimit()

      override fun scopeDownStatement(): Any? = unwrap(this).getScopeDownStatement()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RateBasedStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateBasedStatementProperty):
          RateBasedStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateBasedStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateBasedStatementProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface RateLimitHeaderProperty {
    public fun name(): String

    public fun textTransformations(): Any

    public interface Builder {
      public fun name(name: String)

      public fun textTransformations(textTransformations: IResolvable)

      public fun textTransformations(textTransformations: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitHeaderProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitHeaderProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations.let(IResolvable::unwrap))
      }

      override fun textTransformations(textTransformations: List<Any>) {
        cdkBuilder.textTransformations(textTransformations)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitHeaderProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitHeaderProperty,
    ) : RateLimitHeaderProperty {
      override fun name(): String = unwrap(this).getName()

      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RateLimitHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitHeaderProperty):
          RateLimitHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateLimitHeaderProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitHeaderProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HeadersProperty {
    public fun matchPattern(): Any

    public fun matchScope(): String

    public fun oversizeHandling(): String

    public interface Builder {
      public fun matchPattern(matchPattern: IResolvable)

      public fun matchPattern(matchPattern: HeaderMatchPatternProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4ca701f0e2a77272bf2f76e6d7688fc4f80233f972755f0c81b1e13bacd25f1d")
      public fun matchPattern(matchPattern: HeaderMatchPatternProperty.Builder.() -> Unit)

      public fun matchScope(matchScope: String)

      public fun oversizeHandling(oversizeHandling: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.HeadersProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.HeadersProperty.builder()

      override fun matchPattern(matchPattern: IResolvable) {
        cdkBuilder.matchPattern(matchPattern.let(IResolvable::unwrap))
      }

      override fun matchPattern(matchPattern: HeaderMatchPatternProperty) {
        cdkBuilder.matchPattern(matchPattern.let(HeaderMatchPatternProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4ca701f0e2a77272bf2f76e6d7688fc4f80233f972755f0c81b1e13bacd25f1d")
      override fun matchPattern(matchPattern: HeaderMatchPatternProperty.Builder.() -> Unit): Unit =
          matchPattern(HeaderMatchPatternProperty(matchPattern))

      override fun matchScope(matchScope: String) {
        cdkBuilder.matchScope(matchScope)
      }

      override fun oversizeHandling(oversizeHandling: String) {
        cdkBuilder.oversizeHandling(oversizeHandling)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.HeadersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.HeadersProperty,
    ) : HeadersProperty {
      override fun matchPattern(): Any = unwrap(this).getMatchPattern()

      override fun matchScope(): String = unwrap(this).getMatchScope()

      override fun oversizeHandling(): String = unwrap(this).getOversizeHandling()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HeadersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.HeadersProperty):
          HeadersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HeadersProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.HeadersProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HeaderMatchPatternProperty {
    public fun all(): Any? = unwrap(this).getAll()

    public fun excludedHeaders(): List<String> = unwrap(this).getExcludedHeaders() ?: emptyList()

    public fun includedHeaders(): List<String> = unwrap(this).getIncludedHeaders() ?: emptyList()

    public interface Builder {
      public fun all(all: Any)

      public fun excludedHeaders(excludedHeaders: List<String>)

      public fun includedHeaders(includedHeaders: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.HeaderMatchPatternProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.HeaderMatchPatternProperty.builder()

      override fun all(all: Any) {
        cdkBuilder.all(all)
      }

      override fun excludedHeaders(excludedHeaders: List<String>) {
        cdkBuilder.excludedHeaders(excludedHeaders)
      }

      override fun includedHeaders(includedHeaders: List<String>) {
        cdkBuilder.includedHeaders(includedHeaders)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.HeaderMatchPatternProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.HeaderMatchPatternProperty,
    ) : HeaderMatchPatternProperty {
      override fun all(): Any? = unwrap(this).getAll()

      override fun excludedHeaders(): List<String> = unwrap(this).getExcludedHeaders() ?:
          emptyList()

      override fun includedHeaders(): List<String> = unwrap(this).getIncludedHeaders() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HeaderMatchPatternProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.HeaderMatchPatternProperty):
          HeaderMatchPatternProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HeaderMatchPatternProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.HeaderMatchPatternProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface LabelSummaryProperty {
    public fun name(): String? = unwrap(this).getName()

    public interface Builder {
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelSummaryProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelSummaryProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelSummaryProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelSummaryProperty,
    ) : LabelSummaryProperty {
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LabelSummaryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelSummaryProperty):
          LabelSummaryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LabelSummaryProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelSummaryProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LabelProperty {
    public fun name(): String

    public interface Builder {
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelProperty,
    ) : LabelProperty {
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LabelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelProperty):
          LabelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LabelProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AndStatementProperty {
    public fun statements(): Any

    public interface Builder {
      public fun statements(statements: IResolvable)

      public fun statements(statements: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.AndStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.AndStatementProperty.builder()

      override fun statements(statements: IResolvable) {
        cdkBuilder.statements(statements.let(IResolvable::unwrap))
      }

      override fun statements(statements: List<Any>) {
        cdkBuilder.statements(statements)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.AndStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.AndStatementProperty,
    ) : AndStatementProperty {
      override fun statements(): Any = unwrap(this).getStatements()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AndStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.AndStatementProperty):
          AndStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AndStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.AndStatementProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RateLimitQueryArgumentProperty {
    public fun name(): String

    public fun textTransformations(): Any

    public interface Builder {
      public fun name(name: String)

      public fun textTransformations(textTransformations: IResolvable)

      public fun textTransformations(textTransformations: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitQueryArgumentProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitQueryArgumentProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations.let(IResolvable::unwrap))
      }

      override fun textTransformations(textTransformations: List<Any>) {
        cdkBuilder.textTransformations(textTransformations)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitQueryArgumentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitQueryArgumentProperty,
    ) : RateLimitQueryArgumentProperty {
      override fun name(): String = unwrap(this).getName()

      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RateLimitQueryArgumentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitQueryArgumentProperty):
          RateLimitQueryArgumentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateLimitQueryArgumentProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitQueryArgumentProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RateLimitQueryStringProperty {
    public fun textTransformations(): Any

    public interface Builder {
      public fun textTransformations(textTransformations: IResolvable)

      public fun textTransformations(textTransformations: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitQueryStringProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitQueryStringProperty.builder()

      override fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations.let(IResolvable::unwrap))
      }

      override fun textTransformations(textTransformations: List<Any>) {
        cdkBuilder.textTransformations(textTransformations)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitQueryStringProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitQueryStringProperty,
    ) : RateLimitQueryStringProperty {
      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RateLimitQueryStringProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitQueryStringProperty):
          RateLimitQueryStringProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateLimitQueryStringProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitQueryStringProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface SqliMatchStatementProperty {
    public fun fieldToMatch(): Any

    public fun sensitivityLevel(): String? = unwrap(this).getSensitivityLevel()

    public fun textTransformations(): Any

    public interface Builder {
      public fun fieldToMatch(fieldToMatch: IResolvable)

      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5864dba30483c0a63f75efab73f312d58ebc84cc024408d3ae7ad3dadb4f450b")
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit)

      public fun sensitivityLevel(sensitivityLevel: String)

      public fun textTransformations(textTransformations: IResolvable)

      public fun textTransformations(textTransformations: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SqliMatchStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SqliMatchStatementProperty.builder()

      override fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(IResolvable::unwrap))
      }

      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(FieldToMatchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5864dba30483c0a63f75efab73f312d58ebc84cc024408d3ae7ad3dadb4f450b")
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit): Unit =
          fieldToMatch(FieldToMatchProperty(fieldToMatch))

      override fun sensitivityLevel(sensitivityLevel: String) {
        cdkBuilder.sensitivityLevel(sensitivityLevel)
      }

      override fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations.let(IResolvable::unwrap))
      }

      override fun textTransformations(textTransformations: List<Any>) {
        cdkBuilder.textTransformations(textTransformations)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SqliMatchStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SqliMatchStatementProperty,
    ) : SqliMatchStatementProperty {
      override fun fieldToMatch(): Any = unwrap(this).getFieldToMatch()

      override fun sensitivityLevel(): String? = unwrap(this).getSensitivityLevel()

      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SqliMatchStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.SqliMatchStatementProperty):
          SqliMatchStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SqliMatchStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SqliMatchStatementProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface CaptchaProperty {
    public fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()

    public interface Builder {
      public fun customRequestHandling(customRequestHandling: IResolvable)

      public fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dde15674439e2c8e007bbc8f6352e40468f1ae87a9a7ac0c04dec65372986592")
      public
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CaptchaProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CaptchaProperty.builder()

      override fun customRequestHandling(customRequestHandling: IResolvable) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(IResolvable::unwrap))
      }

      override fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(CustomRequestHandlingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dde15674439e2c8e007bbc8f6352e40468f1ae87a9a7ac0c04dec65372986592")
      override
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit):
          Unit = customRequestHandling(CustomRequestHandlingProperty(customRequestHandling))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.CaptchaProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.CaptchaProperty,
    ) : CaptchaProperty {
      override fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CaptchaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.CaptchaProperty):
          CaptchaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CaptchaProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CaptchaProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
