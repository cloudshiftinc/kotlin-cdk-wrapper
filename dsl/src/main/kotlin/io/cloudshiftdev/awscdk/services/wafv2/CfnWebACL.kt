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

public open class CfnWebACL internal constructor(
  private val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun associationConfig(): Any? = unwrap(this).getAssociationConfig()

  public open fun associationConfig(`value`: IResolvable) {
    unwrap(this).setAssociationConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun associationConfig(`value`: AssociationConfigProperty) {
    unwrap(this).setAssociationConfig(`value`.let(AssociationConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b8d44cd46ea74eaf93435c00e393c5ee29ecc97c90a28ca61ec1cf369c6af806")
  public open fun associationConfig(`value`: AssociationConfigProperty.Builder.() -> Unit): Unit =
      associationConfig(AssociationConfigProperty(`value`))

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCapacity(): Number = unwrap(this).getAttrCapacity()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrLabelNamespace(): String = unwrap(this).getAttrLabelNamespace()

  public open fun captchaConfig(): Any? = unwrap(this).getCaptchaConfig()

  public open fun captchaConfig(`value`: IResolvable) {
    unwrap(this).setCaptchaConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun captchaConfig(`value`: CaptchaConfigProperty) {
    unwrap(this).setCaptchaConfig(`value`.let(CaptchaConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3c7506b9ddc1e15ef1c965b07f29c3a62103b391c09014442a659b79e29de2a1")
  public open fun captchaConfig(`value`: CaptchaConfigProperty.Builder.() -> Unit): Unit =
      captchaConfig(CaptchaConfigProperty(`value`))

  public open fun challengeConfig(): Any? = unwrap(this).getChallengeConfig()

  public open fun challengeConfig(`value`: IResolvable) {
    unwrap(this).setChallengeConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun challengeConfig(`value`: ChallengeConfigProperty) {
    unwrap(this).setChallengeConfig(`value`.let(ChallengeConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e7214ccbc227561f4f409f42112be67d663bb91fa1c181f57768067608f73db5")
  public open fun challengeConfig(`value`: ChallengeConfigProperty.Builder.() -> Unit): Unit =
      challengeConfig(ChallengeConfigProperty(`value`))

  public open fun customResponseBodies(): Any? = unwrap(this).getCustomResponseBodies()

  public open fun customResponseBodies(`value`: IResolvable) {
    unwrap(this).setCustomResponseBodies(`value`.let(IResolvable::unwrap))
  }

  public open fun customResponseBodies(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setCustomResponseBodies(__item_ac66f0)
  }

  public open fun defaultAction(): Any = unwrap(this).getDefaultAction()

  public open fun defaultAction(`value`: IResolvable) {
    unwrap(this).setDefaultAction(`value`.let(IResolvable::unwrap))
  }

  public open fun defaultAction(`value`: DefaultActionProperty) {
    unwrap(this).setDefaultAction(`value`.let(DefaultActionProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("767c85cd028330411774fd7cf444ef3e4433adf329d0f503bb6e80d5cc5ab2a6")
  public open fun defaultAction(`value`: DefaultActionProperty.Builder.() -> Unit): Unit =
      defaultAction(DefaultActionProperty(`value`))

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

  public open fun rules(vararg __idx_ac66f0: Any): Unit = rules(__idx_ac66f0.toList())

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

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun tokenDomains(): List<String> = unwrap(this).getTokenDomains() ?: emptyList()

  public open fun tokenDomains(`value`: List<String>) {
    unwrap(this).setTokenDomains(`value`)
  }

  public open fun tokenDomains(vararg `value`: String): Unit = tokenDomains(`value`.toList())

  public open fun visibilityConfig(): Any = unwrap(this).getVisibilityConfig()

  public open fun visibilityConfig(`value`: IResolvable) {
    unwrap(this).setVisibilityConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun visibilityConfig(`value`: VisibilityConfigProperty) {
    unwrap(this).setVisibilityConfig(`value`.let(VisibilityConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3d0b6519c4f6096fdacf368e2babb053cf58650b4c112c0e0e61be115cfc4352")
  public open fun visibilityConfig(`value`: VisibilityConfigProperty.Builder.() -> Unit): Unit =
      visibilityConfig(VisibilityConfigProperty(`value`))

  public interface Builder {
    public fun associationConfig(associationConfig: IResolvable)

    public fun associationConfig(associationConfig: AssociationConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b157c56318139e90e87caf02fdd9c5b39aee4f4a349105f25b1693606e84b94")
    public fun associationConfig(associationConfig: AssociationConfigProperty.Builder.() -> Unit)

    public fun captchaConfig(captchaConfig: IResolvable)

    public fun captchaConfig(captchaConfig: CaptchaConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb3f410fb840568904dacda5933cf4f3b89887e4337ad9765bb6da381cd94768")
    public fun captchaConfig(captchaConfig: CaptchaConfigProperty.Builder.() -> Unit)

    public fun challengeConfig(challengeConfig: IResolvable)

    public fun challengeConfig(challengeConfig: ChallengeConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("86735407a6e03fb461828efe675d9a053bdbecc31fe7b8b160727c1d5e1111e2")
    public fun challengeConfig(challengeConfig: ChallengeConfigProperty.Builder.() -> Unit)

    public fun customResponseBodies(customResponseBodies: IResolvable)

    public fun customResponseBodies(customResponseBodies: Map<String, Any>)

    public fun defaultAction(defaultAction: IResolvable)

    public fun defaultAction(defaultAction: DefaultActionProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ac71eeb51f4a9714d1d1a020b68ca80c8d898d57876b3cade63d161306ce39b3")
    public fun defaultAction(defaultAction: DefaultActionProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun name(name: String)

    public fun rules(rules: IResolvable)

    public fun rules(rules: List<Any>)

    public fun rules(vararg rules: Any)

    public fun scope(scope: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun tokenDomains(tokenDomains: List<String>)

    public fun tokenDomains(vararg tokenDomains: String)

    public fun visibilityConfig(visibilityConfig: IResolvable)

    public fun visibilityConfig(visibilityConfig: VisibilityConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f079dd60acb4618b73f079541e13bcf3cd8d3cf9b337364b36875956de508700")
    public fun visibilityConfig(visibilityConfig: VisibilityConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wafv2.CfnWebACL.Builder =
        software.amazon.awscdk.services.wafv2.CfnWebACL.Builder.create(scope, id)

    override fun associationConfig(associationConfig: IResolvable) {
      cdkBuilder.associationConfig(associationConfig.let(IResolvable::unwrap))
    }

    override fun associationConfig(associationConfig: AssociationConfigProperty) {
      cdkBuilder.associationConfig(associationConfig.let(AssociationConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b157c56318139e90e87caf02fdd9c5b39aee4f4a349105f25b1693606e84b94")
    override fun associationConfig(associationConfig: AssociationConfigProperty.Builder.() -> Unit):
        Unit = associationConfig(AssociationConfigProperty(associationConfig))

    override fun captchaConfig(captchaConfig: IResolvable) {
      cdkBuilder.captchaConfig(captchaConfig.let(IResolvable::unwrap))
    }

    override fun captchaConfig(captchaConfig: CaptchaConfigProperty) {
      cdkBuilder.captchaConfig(captchaConfig.let(CaptchaConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb3f410fb840568904dacda5933cf4f3b89887e4337ad9765bb6da381cd94768")
    override fun captchaConfig(captchaConfig: CaptchaConfigProperty.Builder.() -> Unit): Unit =
        captchaConfig(CaptchaConfigProperty(captchaConfig))

    override fun challengeConfig(challengeConfig: IResolvable) {
      cdkBuilder.challengeConfig(challengeConfig.let(IResolvable::unwrap))
    }

    override fun challengeConfig(challengeConfig: ChallengeConfigProperty) {
      cdkBuilder.challengeConfig(challengeConfig.let(ChallengeConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("86735407a6e03fb461828efe675d9a053bdbecc31fe7b8b160727c1d5e1111e2")
    override fun challengeConfig(challengeConfig: ChallengeConfigProperty.Builder.() -> Unit): Unit
        = challengeConfig(ChallengeConfigProperty(challengeConfig))

    override fun customResponseBodies(customResponseBodies: IResolvable) {
      cdkBuilder.customResponseBodies(customResponseBodies.let(IResolvable::unwrap))
    }

    override fun customResponseBodies(customResponseBodies: Map<String, Any>) {
      cdkBuilder.customResponseBodies(customResponseBodies)
    }

    override fun defaultAction(defaultAction: IResolvable) {
      cdkBuilder.defaultAction(defaultAction.let(IResolvable::unwrap))
    }

    override fun defaultAction(defaultAction: DefaultActionProperty) {
      cdkBuilder.defaultAction(defaultAction.let(DefaultActionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ac71eeb51f4a9714d1d1a020b68ca80c8d898d57876b3cade63d161306ce39b3")
    override fun defaultAction(defaultAction: DefaultActionProperty.Builder.() -> Unit): Unit =
        defaultAction(DefaultActionProperty(defaultAction))

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

    override fun rules(vararg rules: Any): Unit = rules(rules.toList())

    override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun tokenDomains(tokenDomains: List<String>) {
      cdkBuilder.tokenDomains(tokenDomains)
    }

    override fun tokenDomains(vararg tokenDomains: String): Unit =
        tokenDomains(tokenDomains.toList())

    override fun visibilityConfig(visibilityConfig: IResolvable) {
      cdkBuilder.visibilityConfig(visibilityConfig.let(IResolvable::unwrap))
    }

    override fun visibilityConfig(visibilityConfig: VisibilityConfigProperty) {
      cdkBuilder.visibilityConfig(visibilityConfig.let(VisibilityConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f079dd60acb4618b73f079541e13bcf3cd8d3cf9b337364b36875956de508700")
    override fun visibilityConfig(visibilityConfig: VisibilityConfigProperty.Builder.() -> Unit):
        Unit = visibilityConfig(VisibilityConfigProperty(visibilityConfig))

    public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWebACL {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWebACL(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL): CfnWebACL =
        CfnWebACL(cdkObject)

    internal fun unwrap(wrapped: CfnWebACL): software.amazon.awscdk.services.wafv2.CfnWebACL =
        wrapped.cdkObject
  }

  public interface XssMatchStatementProperty {
    public fun fieldToMatch(): Any

    public fun textTransformations(): Any

    public interface Builder {
      public fun fieldToMatch(fieldToMatch: IResolvable)

      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("142211cec03faffb2428568e29d8f0ea74606c067f194b070ac08cd61e40b2d1")
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit)

      public fun textTransformations(textTransformations: IResolvable)

      public fun textTransformations(textTransformations: List<Any>)

      public fun textTransformations(vararg textTransformations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.XssMatchStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.XssMatchStatementProperty.builder()

      override fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(IResolvable::unwrap))
      }

      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(FieldToMatchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("142211cec03faffb2428568e29d8f0ea74606c067f194b070ac08cd61e40b2d1")
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit): Unit =
          fieldToMatch(FieldToMatchProperty(fieldToMatch))

      override fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations.let(IResolvable::unwrap))
      }

      override fun textTransformations(textTransformations: List<Any>) {
        cdkBuilder.textTransformations(textTransformations)
      }

      override fun textTransformations(vararg textTransformations: Any): Unit =
          textTransformations(textTransformations.toList())

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.XssMatchStatementProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.XssMatchStatementProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.XssMatchStatementProperty):
          XssMatchStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: XssMatchStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.XssMatchStatementProperty = (wrapped as
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

      public fun excludedHeaders(vararg excludedHeaders: String)

      public fun includedHeaders(includedHeaders: List<String>)

      public fun includedHeaders(vararg includedHeaders: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.HeaderMatchPatternProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.HeaderMatchPatternProperty.builder()

      override fun all(all: Any) {
        cdkBuilder.all(all)
      }

      override fun excludedHeaders(excludedHeaders: List<String>) {
        cdkBuilder.excludedHeaders(excludedHeaders)
      }

      override fun excludedHeaders(vararg excludedHeaders: String): Unit =
          excludedHeaders(excludedHeaders.toList())

      override fun includedHeaders(includedHeaders: List<String>) {
        cdkBuilder.includedHeaders(includedHeaders)
      }

      override fun includedHeaders(vararg includedHeaders: String): Unit =
          includedHeaders(includedHeaders.toList())

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.HeaderMatchPatternProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.HeaderMatchPatternProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.HeaderMatchPatternProperty):
          HeaderMatchPatternProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HeaderMatchPatternProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.HeaderMatchPatternProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AWSManagedRulesACFPRuleSetProperty {
    public fun creationPath(): String

    public fun enableRegexInPath(): Any? = unwrap(this).getEnableRegexInPath()

    public fun registrationPagePath(): String

    public fun requestInspection(): Any

    public fun responseInspection(): Any? = unwrap(this).getResponseInspection()

    public interface Builder {
      public fun creationPath(creationPath: String)

      public fun enableRegexInPath(enableRegexInPath: Boolean)

      public fun enableRegexInPath(enableRegexInPath: IResolvable)

      public fun registrationPagePath(registrationPagePath: String)

      public fun requestInspection(requestInspection: IResolvable)

      public fun requestInspection(requestInspection: RequestInspectionACFPProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("083c28818bc0f7eca217daa839571147132bab0a9e4709d437ff9dd388fdde67")
      public
          fun requestInspection(requestInspection: RequestInspectionACFPProperty.Builder.() -> Unit)

      public fun responseInspection(responseInspection: IResolvable)

      public fun responseInspection(responseInspection: ResponseInspectionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("684d092c97d7f91fee60dece1bc6b09d120a4aff7fcd6d7512eb368deb7d0dd1")
      public
          fun responseInspection(responseInspection: ResponseInspectionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesACFPRuleSetProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesACFPRuleSetProperty.builder()

      override fun creationPath(creationPath: String) {
        cdkBuilder.creationPath(creationPath)
      }

      override fun enableRegexInPath(enableRegexInPath: Boolean) {
        cdkBuilder.enableRegexInPath(enableRegexInPath)
      }

      override fun enableRegexInPath(enableRegexInPath: IResolvable) {
        cdkBuilder.enableRegexInPath(enableRegexInPath.let(IResolvable::unwrap))
      }

      override fun registrationPagePath(registrationPagePath: String) {
        cdkBuilder.registrationPagePath(registrationPagePath)
      }

      override fun requestInspection(requestInspection: IResolvable) {
        cdkBuilder.requestInspection(requestInspection.let(IResolvable::unwrap))
      }

      override fun requestInspection(requestInspection: RequestInspectionACFPProperty) {
        cdkBuilder.requestInspection(requestInspection.let(RequestInspectionACFPProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("083c28818bc0f7eca217daa839571147132bab0a9e4709d437ff9dd388fdde67")
      override
          fun requestInspection(requestInspection: RequestInspectionACFPProperty.Builder.() -> Unit):
          Unit = requestInspection(RequestInspectionACFPProperty(requestInspection))

      override fun responseInspection(responseInspection: IResolvable) {
        cdkBuilder.responseInspection(responseInspection.let(IResolvable::unwrap))
      }

      override fun responseInspection(responseInspection: ResponseInspectionProperty) {
        cdkBuilder.responseInspection(responseInspection.let(ResponseInspectionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("684d092c97d7f91fee60dece1bc6b09d120a4aff7fcd6d7512eb368deb7d0dd1")
      override
          fun responseInspection(responseInspection: ResponseInspectionProperty.Builder.() -> Unit):
          Unit = responseInspection(ResponseInspectionProperty(responseInspection))

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesACFPRuleSetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesACFPRuleSetProperty,
    ) : AWSManagedRulesACFPRuleSetProperty {
      override fun creationPath(): String = unwrap(this).getCreationPath()

      override fun enableRegexInPath(): Any? = unwrap(this).getEnableRegexInPath()

      override fun registrationPagePath(): String = unwrap(this).getRegistrationPagePath()

      override fun requestInspection(): Any = unwrap(this).getRequestInspection()

      override fun responseInspection(): Any? = unwrap(this).getResponseInspection()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AWSManagedRulesACFPRuleSetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesACFPRuleSetProperty):
          AWSManagedRulesACFPRuleSetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AWSManagedRulesACFPRuleSetProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesACFPRuleSetProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface OrStatementProperty {
    public fun statements(): Any

    public interface Builder {
      public fun statements(statements: IResolvable)

      public fun statements(statements: List<Any>)

      public fun statements(vararg statements: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.OrStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.OrStatementProperty.builder()

      override fun statements(statements: IResolvable) {
        cdkBuilder.statements(statements.let(IResolvable::unwrap))
      }

      override fun statements(statements: List<Any>) {
        cdkBuilder.statements(statements)
      }

      override fun statements(vararg statements: Any): Unit = statements(statements.toList())

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.OrStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.OrStatementProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.OrStatementProperty):
          OrStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OrStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.OrStatementProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RuleProperty {
    public fun action(): Any? = unwrap(this).getAction()

    public fun captchaConfig(): Any? = unwrap(this).getCaptchaConfig()

    public fun challengeConfig(): Any? = unwrap(this).getChallengeConfig()

    public fun name(): String

    public fun overrideAction(): Any? = unwrap(this).getOverrideAction()

    public fun priority(): Number

    public fun ruleLabels(): Any? = unwrap(this).getRuleLabels()

    public fun statement(): Any

    public fun visibilityConfig(): Any

    public interface Builder {
      public fun action(action: IResolvable)

      public fun action(action: RuleActionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2025510b5159336ba973bb05d5e75a5f596d6af141c8f7c3297b175343fe0970")
      public fun action(action: RuleActionProperty.Builder.() -> Unit)

      public fun captchaConfig(captchaConfig: IResolvable)

      public fun captchaConfig(captchaConfig: CaptchaConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("317705cf583deee8d63cca2df60cbba7ec827bf9b5904354fa80426576a7fc36")
      public fun captchaConfig(captchaConfig: CaptchaConfigProperty.Builder.() -> Unit)

      public fun challengeConfig(challengeConfig: IResolvable)

      public fun challengeConfig(challengeConfig: ChallengeConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4429baa9a3aac868613fb2c72185b6dcc965c2412db3994b4a374a15c3864a4")
      public fun challengeConfig(challengeConfig: ChallengeConfigProperty.Builder.() -> Unit)

      public fun name(name: String)

      public fun overrideAction(overrideAction: IResolvable)

      public fun overrideAction(overrideAction: OverrideActionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c0a6edb162774d4a08095f9ab3722b12bf9a6998f0c523181264c1aa0f1b135")
      public fun overrideAction(overrideAction: OverrideActionProperty.Builder.() -> Unit)

      public fun priority(priority: Number)

      public fun ruleLabels(ruleLabels: IResolvable)

      public fun ruleLabels(ruleLabels: List<Any>)

      public fun ruleLabels(vararg ruleLabels: Any)

      public fun statement(statement: IResolvable)

      public fun statement(statement: StatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a8ded8ff113f98d1789d1aa70529aba81db88d78e1a78e856173d5da511e6dfc")
      public fun statement(statement: StatementProperty.Builder.() -> Unit)

      public fun visibilityConfig(visibilityConfig: IResolvable)

      public fun visibilityConfig(visibilityConfig: VisibilityConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b4ea36d8fd62c0da8c432a7e1cd39e41c8f2fca492172b7a7b0a565f3f23cfcb")
      public fun visibilityConfig(visibilityConfig: VisibilityConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.wafv2.CfnWebACL.RuleProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleProperty.builder()

      override fun action(action: IResolvable) {
        cdkBuilder.action(action.let(IResolvable::unwrap))
      }

      override fun action(action: RuleActionProperty) {
        cdkBuilder.action(action.let(RuleActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2025510b5159336ba973bb05d5e75a5f596d6af141c8f7c3297b175343fe0970")
      override fun action(action: RuleActionProperty.Builder.() -> Unit): Unit =
          action(RuleActionProperty(action))

      override fun captchaConfig(captchaConfig: IResolvable) {
        cdkBuilder.captchaConfig(captchaConfig.let(IResolvable::unwrap))
      }

      override fun captchaConfig(captchaConfig: CaptchaConfigProperty) {
        cdkBuilder.captchaConfig(captchaConfig.let(CaptchaConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("317705cf583deee8d63cca2df60cbba7ec827bf9b5904354fa80426576a7fc36")
      override fun captchaConfig(captchaConfig: CaptchaConfigProperty.Builder.() -> Unit): Unit =
          captchaConfig(CaptchaConfigProperty(captchaConfig))

      override fun challengeConfig(challengeConfig: IResolvable) {
        cdkBuilder.challengeConfig(challengeConfig.let(IResolvable::unwrap))
      }

      override fun challengeConfig(challengeConfig: ChallengeConfigProperty) {
        cdkBuilder.challengeConfig(challengeConfig.let(ChallengeConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4429baa9a3aac868613fb2c72185b6dcc965c2412db3994b4a374a15c3864a4")
      override fun challengeConfig(challengeConfig: ChallengeConfigProperty.Builder.() -> Unit):
          Unit = challengeConfig(ChallengeConfigProperty(challengeConfig))

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun overrideAction(overrideAction: IResolvable) {
        cdkBuilder.overrideAction(overrideAction.let(IResolvable::unwrap))
      }

      override fun overrideAction(overrideAction: OverrideActionProperty) {
        cdkBuilder.overrideAction(overrideAction.let(OverrideActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c0a6edb162774d4a08095f9ab3722b12bf9a6998f0c523181264c1aa0f1b135")
      override fun overrideAction(overrideAction: OverrideActionProperty.Builder.() -> Unit): Unit =
          overrideAction(OverrideActionProperty(overrideAction))

      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      override fun ruleLabels(ruleLabels: IResolvable) {
        cdkBuilder.ruleLabels(ruleLabels.let(IResolvable::unwrap))
      }

      override fun ruleLabels(ruleLabels: List<Any>) {
        cdkBuilder.ruleLabels(ruleLabels)
      }

      override fun ruleLabels(vararg ruleLabels: Any): Unit = ruleLabels(ruleLabels.toList())

      override fun statement(statement: IResolvable) {
        cdkBuilder.statement(statement.let(IResolvable::unwrap))
      }

      override fun statement(statement: StatementProperty) {
        cdkBuilder.statement(statement.let(StatementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a8ded8ff113f98d1789d1aa70529aba81db88d78e1a78e856173d5da511e6dfc")
      override fun statement(statement: StatementProperty.Builder.() -> Unit): Unit =
          statement(StatementProperty(statement))

      override fun visibilityConfig(visibilityConfig: IResolvable) {
        cdkBuilder.visibilityConfig(visibilityConfig.let(IResolvable::unwrap))
      }

      override fun visibilityConfig(visibilityConfig: VisibilityConfigProperty) {
        cdkBuilder.visibilityConfig(visibilityConfig.let(VisibilityConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b4ea36d8fd62c0da8c432a7e1cd39e41c8f2fca492172b7a7b0a565f3f23cfcb")
      override fun visibilityConfig(visibilityConfig: VisibilityConfigProperty.Builder.() -> Unit):
          Unit = visibilityConfig(VisibilityConfigProperty(visibilityConfig))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.RuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RuleProperty,
    ) : RuleProperty {
      override fun action(): Any? = unwrap(this).getAction()

      override fun captchaConfig(): Any? = unwrap(this).getCaptchaConfig()

      override fun challengeConfig(): Any? = unwrap(this).getChallengeConfig()

      override fun name(): String = unwrap(this).getName()

      override fun overrideAction(): Any? = unwrap(this).getOverrideAction()

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

      internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RuleProperty):
          RuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AllowActionProperty {
    public fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()

    public interface Builder {
      public fun customRequestHandling(customRequestHandling: IResolvable)

      public fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a8b557b425d85b0e2ee38b18a55514a327bbac35c7c4ea87a8b039b6686df911")
      public
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.AllowActionProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.AllowActionProperty.builder()

      override fun customRequestHandling(customRequestHandling: IResolvable) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(IResolvable::unwrap))
      }

      override fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(CustomRequestHandlingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a8b557b425d85b0e2ee38b18a55514a327bbac35c7c4ea87a8b039b6686df911")
      override
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit):
          Unit = customRequestHandling(CustomRequestHandlingProperty(customRequestHandling))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.AllowActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.AllowActionProperty,
    ) : AllowActionProperty {
      override fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AllowActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.AllowActionProperty):
          AllowActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AllowActionProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.AllowActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface GeoMatchStatementProperty {
    public fun countryCodes(): List<String> = unwrap(this).getCountryCodes() ?: emptyList()

    public fun forwardedIpConfig(): Any? = unwrap(this).getForwardedIpConfig()

    public interface Builder {
      public fun countryCodes(countryCodes: List<String>)

      public fun countryCodes(vararg countryCodes: String)

      public fun forwardedIpConfig(forwardedIpConfig: IResolvable)

      public fun forwardedIpConfig(forwardedIpConfig: ForwardedIPConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("93d3e4b1323aba12103982966fc66f25efef2e972443d841f42f22ce1961eb9f")
      public
          fun forwardedIpConfig(forwardedIpConfig: ForwardedIPConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.GeoMatchStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.GeoMatchStatementProperty.builder()

      override fun countryCodes(countryCodes: List<String>) {
        cdkBuilder.countryCodes(countryCodes)
      }

      override fun countryCodes(vararg countryCodes: String): Unit =
          countryCodes(countryCodes.toList())

      override fun forwardedIpConfig(forwardedIpConfig: IResolvable) {
        cdkBuilder.forwardedIpConfig(forwardedIpConfig.let(IResolvable::unwrap))
      }

      override fun forwardedIpConfig(forwardedIpConfig: ForwardedIPConfigurationProperty) {
        cdkBuilder.forwardedIpConfig(forwardedIpConfig.let(ForwardedIPConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("93d3e4b1323aba12103982966fc66f25efef2e972443d841f42f22ce1961eb9f")
      override
          fun forwardedIpConfig(forwardedIpConfig: ForwardedIPConfigurationProperty.Builder.() -> Unit):
          Unit = forwardedIpConfig(ForwardedIPConfigurationProperty(forwardedIpConfig))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.GeoMatchStatementProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.GeoMatchStatementProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.GeoMatchStatementProperty):
          GeoMatchStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GeoMatchStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.GeoMatchStatementProperty = (wrapped as
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
      @JvmName("2a035db8f2c98951eb8a8b35ea40f2cbb8071d6604c0780e7390cbf6f9d5edf7")
      public fun matchPattern(matchPattern: CookieMatchPatternProperty.Builder.() -> Unit)

      public fun matchScope(matchScope: String)

      public fun oversizeHandling(oversizeHandling: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.CookiesProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.CookiesProperty.builder()

      override fun matchPattern(matchPattern: IResolvable) {
        cdkBuilder.matchPattern(matchPattern.let(IResolvable::unwrap))
      }

      override fun matchPattern(matchPattern: CookieMatchPatternProperty) {
        cdkBuilder.matchPattern(matchPattern.let(CookieMatchPatternProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a035db8f2c98951eb8a8b35ea40f2cbb8071d6604c0780e7390cbf6f9d5edf7")
      override fun matchPattern(matchPattern: CookieMatchPatternProperty.Builder.() -> Unit): Unit =
          matchPattern(CookieMatchPatternProperty(matchPattern))

      override fun matchScope(matchScope: String) {
        cdkBuilder.matchScope(matchScope)
      }

      override fun oversizeHandling(oversizeHandling: String) {
        cdkBuilder.oversizeHandling(oversizeHandling)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.CookiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.CookiesProperty,
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

      internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.CookiesProperty):
          CookiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CookiesProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.CookiesProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ManagedRuleGroupStatementProperty {
    public fun excludedRules(): Any? = unwrap(this).getExcludedRules()

    public fun managedRuleGroupConfigs(): Any? = unwrap(this).getManagedRuleGroupConfigs()

    public fun name(): String

    public fun ruleActionOverrides(): Any? = unwrap(this).getRuleActionOverrides()

    public fun scopeDownStatement(): Any? = unwrap(this).getScopeDownStatement()

    public fun vendorName(): String

    public fun version(): String? = unwrap(this).getVersion()

    public interface Builder {
      public fun excludedRules(excludedRules: IResolvable)

      public fun excludedRules(excludedRules: List<Any>)

      public fun excludedRules(vararg excludedRules: Any)

      public fun managedRuleGroupConfigs(managedRuleGroupConfigs: IResolvable)

      public fun managedRuleGroupConfigs(managedRuleGroupConfigs: List<Any>)

      public fun managedRuleGroupConfigs(vararg managedRuleGroupConfigs: Any)

      public fun name(name: String)

      public fun ruleActionOverrides(ruleActionOverrides: IResolvable)

      public fun ruleActionOverrides(ruleActionOverrides: List<Any>)

      public fun ruleActionOverrides(vararg ruleActionOverrides: Any)

      public fun scopeDownStatement(scopeDownStatement: IResolvable)

      public fun scopeDownStatement(scopeDownStatement: StatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec2ee816e9a26efe5dd6f11781747d71814c2efdbf712cb215d37d769f75318b")
      public fun scopeDownStatement(scopeDownStatement: StatementProperty.Builder.() -> Unit)

      public fun vendorName(vendorName: String)

      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupStatementProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupStatementProperty.builder()

      override fun excludedRules(excludedRules: IResolvable) {
        cdkBuilder.excludedRules(excludedRules.let(IResolvable::unwrap))
      }

      override fun excludedRules(excludedRules: List<Any>) {
        cdkBuilder.excludedRules(excludedRules)
      }

      override fun excludedRules(vararg excludedRules: Any): Unit =
          excludedRules(excludedRules.toList())

      override fun managedRuleGroupConfigs(managedRuleGroupConfigs: IResolvable) {
        cdkBuilder.managedRuleGroupConfigs(managedRuleGroupConfigs.let(IResolvable::unwrap))
      }

      override fun managedRuleGroupConfigs(managedRuleGroupConfigs: List<Any>) {
        cdkBuilder.managedRuleGroupConfigs(managedRuleGroupConfigs)
      }

      override fun managedRuleGroupConfigs(vararg managedRuleGroupConfigs: Any): Unit =
          managedRuleGroupConfigs(managedRuleGroupConfigs.toList())

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun ruleActionOverrides(ruleActionOverrides: IResolvable) {
        cdkBuilder.ruleActionOverrides(ruleActionOverrides.let(IResolvable::unwrap))
      }

      override fun ruleActionOverrides(ruleActionOverrides: List<Any>) {
        cdkBuilder.ruleActionOverrides(ruleActionOverrides)
      }

      override fun ruleActionOverrides(vararg ruleActionOverrides: Any): Unit =
          ruleActionOverrides(ruleActionOverrides.toList())

      override fun scopeDownStatement(scopeDownStatement: IResolvable) {
        cdkBuilder.scopeDownStatement(scopeDownStatement.let(IResolvable::unwrap))
      }

      override fun scopeDownStatement(scopeDownStatement: StatementProperty) {
        cdkBuilder.scopeDownStatement(scopeDownStatement.let(StatementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec2ee816e9a26efe5dd6f11781747d71814c2efdbf712cb215d37d769f75318b")
      override fun scopeDownStatement(scopeDownStatement: StatementProperty.Builder.() -> Unit):
          Unit = scopeDownStatement(StatementProperty(scopeDownStatement))

      override fun vendorName(vendorName: String) {
        cdkBuilder.vendorName(vendorName)
      }

      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupStatementProperty,
    ) : ManagedRuleGroupStatementProperty {
      override fun excludedRules(): Any? = unwrap(this).getExcludedRules()

      override fun managedRuleGroupConfigs(): Any? = unwrap(this).getManagedRuleGroupConfigs()

      override fun name(): String = unwrap(this).getName()

      override fun ruleActionOverrides(): Any? = unwrap(this).getRuleActionOverrides()

      override fun scopeDownStatement(): Any? = unwrap(this).getScopeDownStatement()

      override fun vendorName(): String = unwrap(this).getVendorName()

      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ManagedRuleGroupStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupStatementProperty):
          ManagedRuleGroupStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ManagedRuleGroupStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupStatementProperty =
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

      public fun textTransformations(vararg textTransformations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitCookieProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitCookieProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations.let(IResolvable::unwrap))
      }

      override fun textTransformations(textTransformations: List<Any>) {
        cdkBuilder.textTransformations(textTransformations)
      }

      override fun textTransformations(vararg textTransformations: Any): Unit =
          textTransformations(textTransformations.toList())

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitCookieProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitCookieProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitCookieProperty):
          RateLimitCookieProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateLimitCookieProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitCookieProperty = (wrapped as
          Wrapper).cdkObject
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseBodyProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseBodyProperty.builder()

      override fun content(content: String) {
        cdkBuilder.content(content)
      }

      override fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseBodyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseBodyProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseBodyProperty):
          CustomResponseBodyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomResponseBodyProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseBodyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ChallengeActionProperty {
    public fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()

    public interface Builder {
      public fun customRequestHandling(customRequestHandling: IResolvable)

      public fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1e4af3c7ecc6a77db9bf8b611bda855716d395f81d76c5d78d1f60fc45b7169")
      public
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ChallengeActionProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.ChallengeActionProperty.builder()

      override fun customRequestHandling(customRequestHandling: IResolvable) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(IResolvable::unwrap))
      }

      override fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(CustomRequestHandlingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1e4af3c7ecc6a77db9bf8b611bda855716d395f81d76c5d78d1f60fc45b7169")
      override
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit):
          Unit = customRequestHandling(CustomRequestHandlingProperty(customRequestHandling))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.ChallengeActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ChallengeActionProperty,
    ) : ChallengeActionProperty {
      override fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ChallengeActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.ChallengeActionProperty):
          ChallengeActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ChallengeActionProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.ChallengeActionProperty = (wrapped as
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

      public fun textTransformations(vararg textTransformations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitQueryArgumentProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitQueryArgumentProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations.let(IResolvable::unwrap))
      }

      override fun textTransformations(textTransformations: List<Any>) {
        cdkBuilder.textTransformations(textTransformations)
      }

      override fun textTransformations(vararg textTransformations: Any): Unit =
          textTransformations(textTransformations.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitQueryArgumentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitQueryArgumentProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitQueryArgumentProperty):
          RateLimitQueryArgumentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateLimitQueryArgumentProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitQueryArgumentProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ResponseInspectionHeaderProperty {
    public fun failureValues(): List<String>

    public fun name(): String

    public fun successValues(): List<String>

    public interface Builder {
      public fun failureValues(failureValues: List<String>)

      public fun failureValues(vararg failureValues: String)

      public fun name(name: String)

      public fun successValues(successValues: List<String>)

      public fun successValues(vararg successValues: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionHeaderProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionHeaderProperty.builder()

      override fun failureValues(failureValues: List<String>) {
        cdkBuilder.failureValues(failureValues)
      }

      override fun failureValues(vararg failureValues: String): Unit =
          failureValues(failureValues.toList())

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun successValues(successValues: List<String>) {
        cdkBuilder.successValues(successValues)
      }

      override fun successValues(vararg successValues: String): Unit =
          successValues(successValues.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionHeaderProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionHeaderProperty,
    ) : ResponseInspectionHeaderProperty {
      override fun failureValues(): List<String> = unwrap(this).getFailureValues()

      override fun name(): String = unwrap(this).getName()

      override fun successValues(): List<String> = unwrap(this).getSuccessValues()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResponseInspectionHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionHeaderProperty):
          ResponseInspectionHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResponseInspectionHeaderProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionHeaderProperty =
          (wrapped as Wrapper).cdkObject
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.VisibilityConfigProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.VisibilityConfigProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.VisibilityConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.VisibilityConfigProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.VisibilityConfigProperty):
          VisibilityConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VisibilityConfigProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.VisibilityConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface OverrideActionProperty {
    public fun count(): Any? = unwrap(this).getCount()

    public fun none(): Any? = unwrap(this).getNone()

    public interface Builder {
      public fun count(count: Any)

      public fun none(none: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.OverrideActionProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.OverrideActionProperty.builder()

      override fun count(count: Any) {
        cdkBuilder.count(count)
      }

      override fun none(none: Any) {
        cdkBuilder.none(none)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.OverrideActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.OverrideActionProperty,
    ) : OverrideActionProperty {
      override fun count(): Any? = unwrap(this).getCount()

      override fun none(): Any? = unwrap(this).getNone()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OverrideActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.OverrideActionProperty):
          OverrideActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OverrideActionProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.OverrideActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CaptchaConfigProperty {
    public fun immunityTimeProperty(): Any? = unwrap(this).getImmunityTimeProperty()

    public interface Builder {
      public fun immunityTimeProperty(immunityTimeProperty: IResolvable)

      public fun immunityTimeProperty(immunityTimeProperty: ImmunityTimePropertyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("191be63e57ff374068e438947c296c4451da9eaa0a42f43f48495d85960bc7c0")
      public
          fun immunityTimeProperty(immunityTimeProperty: ImmunityTimePropertyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.CaptchaConfigProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.CaptchaConfigProperty.builder()

      override fun immunityTimeProperty(immunityTimeProperty: IResolvable) {
        cdkBuilder.immunityTimeProperty(immunityTimeProperty.let(IResolvable::unwrap))
      }

      override fun immunityTimeProperty(immunityTimeProperty: ImmunityTimePropertyProperty) {
        cdkBuilder.immunityTimeProperty(immunityTimeProperty.let(ImmunityTimePropertyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("191be63e57ff374068e438947c296c4451da9eaa0a42f43f48495d85960bc7c0")
      override
          fun immunityTimeProperty(immunityTimeProperty: ImmunityTimePropertyProperty.Builder.() -> Unit):
          Unit = immunityTimeProperty(ImmunityTimePropertyProperty(immunityTimeProperty))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.CaptchaConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.CaptchaConfigProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.CaptchaConfigProperty):
          CaptchaConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CaptchaConfigProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.CaptchaConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RateLimitUriPathProperty {
    public fun textTransformations(): Any

    public interface Builder {
      public fun textTransformations(textTransformations: IResolvable)

      public fun textTransformations(textTransformations: List<Any>)

      public fun textTransformations(vararg textTransformations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitUriPathProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitUriPathProperty.builder()

      override fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations.let(IResolvable::unwrap))
      }

      override fun textTransformations(textTransformations: List<Any>) {
        cdkBuilder.textTransformations(textTransformations)
      }

      override fun textTransformations(vararg textTransformations: Any): Unit =
          textTransformations(textTransformations.toList())

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitUriPathProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitUriPathProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitUriPathProperty):
          RateLimitUriPathProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateLimitUriPathProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitUriPathProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface BlockActionProperty {
    public fun customResponse(): Any? = unwrap(this).getCustomResponse()

    public interface Builder {
      public fun customResponse(customResponse: IResolvable)

      public fun customResponse(customResponse: CustomResponseProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b848ca12d2be847e3936cfab6841a0b1d09844d5fd4f241dcf23ae17db717d10")
      public fun customResponse(customResponse: CustomResponseProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.BlockActionProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.BlockActionProperty.builder()

      override fun customResponse(customResponse: IResolvable) {
        cdkBuilder.customResponse(customResponse.let(IResolvable::unwrap))
      }

      override fun customResponse(customResponse: CustomResponseProperty) {
        cdkBuilder.customResponse(customResponse.let(CustomResponseProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b848ca12d2be847e3936cfab6841a0b1d09844d5fd4f241dcf23ae17db717d10")
      override fun customResponse(customResponse: CustomResponseProperty.Builder.() -> Unit): Unit =
          customResponse(CustomResponseProperty(customResponse))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.BlockActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.BlockActionProperty,
    ) : BlockActionProperty {
      override fun customResponse(): Any? = unwrap(this).getCustomResponse()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BlockActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.BlockActionProperty):
          BlockActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BlockActionProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.BlockActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface JsonMatchPatternProperty {
    public fun all(): Any? = unwrap(this).getAll()

    public fun includedPaths(): List<String> = unwrap(this).getIncludedPaths() ?: emptyList()

    public interface Builder {
      public fun all(all: Any)

      public fun includedPaths(includedPaths: List<String>)

      public fun includedPaths(vararg includedPaths: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.JsonMatchPatternProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.JsonMatchPatternProperty.builder()

      override fun all(all: Any) {
        cdkBuilder.all(all)
      }

      override fun includedPaths(includedPaths: List<String>) {
        cdkBuilder.includedPaths(includedPaths)
      }

      override fun includedPaths(vararg includedPaths: String): Unit =
          includedPaths(includedPaths.toList())

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.JsonMatchPatternProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.JsonMatchPatternProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.JsonMatchPatternProperty):
          JsonMatchPatternProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JsonMatchPatternProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.JsonMatchPatternProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RequestInspectionACFPProperty {
    public fun addressFields(): Any? = unwrap(this).getAddressFields()

    public fun emailField(): Any? = unwrap(this).getEmailField()

    public fun passwordField(): Any? = unwrap(this).getPasswordField()

    public fun payloadType(): String

    public fun phoneNumberFields(): Any? = unwrap(this).getPhoneNumberFields()

    public fun usernameField(): Any? = unwrap(this).getUsernameField()

    public interface Builder {
      public fun addressFields(addressFields: IResolvable)

      public fun addressFields(addressFields: List<Any>)

      public fun addressFields(vararg addressFields: Any)

      public fun emailField(emailField: IResolvable)

      public fun emailField(emailField: FieldIdentifierProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("847ec279a551f5dd327860e83ee93b4d450910d2873fc1f106180db6b7e4d5ac")
      public fun emailField(emailField: FieldIdentifierProperty.Builder.() -> Unit)

      public fun passwordField(passwordField: IResolvable)

      public fun passwordField(passwordField: FieldIdentifierProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c1e441197d39d89c88ac019563917209b75c7bc921ac18b85483362601c8bd4")
      public fun passwordField(passwordField: FieldIdentifierProperty.Builder.() -> Unit)

      public fun payloadType(payloadType: String)

      public fun phoneNumberFields(phoneNumberFields: IResolvable)

      public fun phoneNumberFields(phoneNumberFields: List<Any>)

      public fun phoneNumberFields(vararg phoneNumberFields: Any)

      public fun usernameField(usernameField: IResolvable)

      public fun usernameField(usernameField: FieldIdentifierProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("600dd6ac4241238388c5ed8934f497e910491d363bd2f7d5b4990137f8df6320")
      public fun usernameField(usernameField: FieldIdentifierProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestInspectionACFPProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestInspectionACFPProperty.builder()

      override fun addressFields(addressFields: IResolvable) {
        cdkBuilder.addressFields(addressFields.let(IResolvable::unwrap))
      }

      override fun addressFields(addressFields: List<Any>) {
        cdkBuilder.addressFields(addressFields)
      }

      override fun addressFields(vararg addressFields: Any): Unit =
          addressFields(addressFields.toList())

      override fun emailField(emailField: IResolvable) {
        cdkBuilder.emailField(emailField.let(IResolvable::unwrap))
      }

      override fun emailField(emailField: FieldIdentifierProperty) {
        cdkBuilder.emailField(emailField.let(FieldIdentifierProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("847ec279a551f5dd327860e83ee93b4d450910d2873fc1f106180db6b7e4d5ac")
      override fun emailField(emailField: FieldIdentifierProperty.Builder.() -> Unit): Unit =
          emailField(FieldIdentifierProperty(emailField))

      override fun passwordField(passwordField: IResolvable) {
        cdkBuilder.passwordField(passwordField.let(IResolvable::unwrap))
      }

      override fun passwordField(passwordField: FieldIdentifierProperty) {
        cdkBuilder.passwordField(passwordField.let(FieldIdentifierProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c1e441197d39d89c88ac019563917209b75c7bc921ac18b85483362601c8bd4")
      override fun passwordField(passwordField: FieldIdentifierProperty.Builder.() -> Unit): Unit =
          passwordField(FieldIdentifierProperty(passwordField))

      override fun payloadType(payloadType: String) {
        cdkBuilder.payloadType(payloadType)
      }

      override fun phoneNumberFields(phoneNumberFields: IResolvable) {
        cdkBuilder.phoneNumberFields(phoneNumberFields.let(IResolvable::unwrap))
      }

      override fun phoneNumberFields(phoneNumberFields: List<Any>) {
        cdkBuilder.phoneNumberFields(phoneNumberFields)
      }

      override fun phoneNumberFields(vararg phoneNumberFields: Any): Unit =
          phoneNumberFields(phoneNumberFields.toList())

      override fun usernameField(usernameField: IResolvable) {
        cdkBuilder.usernameField(usernameField.let(IResolvable::unwrap))
      }

      override fun usernameField(usernameField: FieldIdentifierProperty) {
        cdkBuilder.usernameField(usernameField.let(FieldIdentifierProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("600dd6ac4241238388c5ed8934f497e910491d363bd2f7d5b4990137f8df6320")
      override fun usernameField(usernameField: FieldIdentifierProperty.Builder.() -> Unit): Unit =
          usernameField(FieldIdentifierProperty(usernameField))

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestInspectionACFPProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestInspectionACFPProperty,
    ) : RequestInspectionACFPProperty {
      override fun addressFields(): Any? = unwrap(this).getAddressFields()

      override fun emailField(): Any? = unwrap(this).getEmailField()

      override fun passwordField(): Any? = unwrap(this).getPasswordField()

      override fun payloadType(): String = unwrap(this).getPayloadType()

      override fun phoneNumberFields(): Any? = unwrap(this).getPhoneNumberFields()

      override fun usernameField(): Any? = unwrap(this).getUsernameField()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RequestInspectionACFPProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RequestInspectionACFPProperty):
          RequestInspectionACFPProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RequestInspectionACFPProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestInspectionACFPProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ResponseInspectionJsonProperty {
    public fun failureValues(): List<String>

    public fun identifier(): String

    public fun successValues(): List<String>

    public interface Builder {
      public fun failureValues(failureValues: List<String>)

      public fun failureValues(vararg failureValues: String)

      public fun identifier(identifier: String)

      public fun successValues(successValues: List<String>)

      public fun successValues(vararg successValues: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionJsonProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionJsonProperty.builder()

      override fun failureValues(failureValues: List<String>) {
        cdkBuilder.failureValues(failureValues)
      }

      override fun failureValues(vararg failureValues: String): Unit =
          failureValues(failureValues.toList())

      override fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
      }

      override fun successValues(successValues: List<String>) {
        cdkBuilder.successValues(successValues)
      }

      override fun successValues(vararg successValues: String): Unit =
          successValues(successValues.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionJsonProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionJsonProperty,
    ) : ResponseInspectionJsonProperty {
      override fun failureValues(): List<String> = unwrap(this).getFailureValues()

      override fun identifier(): String = unwrap(this).getIdentifier()

      override fun successValues(): List<String> = unwrap(this).getSuccessValues()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResponseInspectionJsonProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionJsonProperty):
          ResponseInspectionJsonProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResponseInspectionJsonProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionJsonProperty = (wrapped
          as Wrapper).cdkObject
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
      @JvmName("6ccbf842cad464739deb3b55691dd736d97a44017ff340a83b43e32b7c5f080a")
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit)

      public fun textTransformations(textTransformations: IResolvable)

      public fun textTransformations(textTransformations: List<Any>)

      public fun textTransformations(vararg textTransformations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RegexPatternSetReferenceStatementProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RegexPatternSetReferenceStatementProperty.builder()

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
      @JvmName("6ccbf842cad464739deb3b55691dd736d97a44017ff340a83b43e32b7c5f080a")
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit): Unit =
          fieldToMatch(FieldToMatchProperty(fieldToMatch))

      override fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations.let(IResolvable::unwrap))
      }

      override fun textTransformations(textTransformations: List<Any>) {
        cdkBuilder.textTransformations(textTransformations)
      }

      override fun textTransformations(vararg textTransformations: Any): Unit =
          textTransformations(textTransformations.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.RegexPatternSetReferenceStatementProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RegexPatternSetReferenceStatementProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RegexPatternSetReferenceStatementProperty):
          RegexPatternSetReferenceStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RegexPatternSetReferenceStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RegexPatternSetReferenceStatementProperty
          = (wrapped as Wrapper).cdkObject
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
      @JvmName("931389788bf7bae9a61c915426c95877b1cfc1a69329485a4de7f91e081da8d7")
      public
          fun ipSetForwardedIpConfig(ipSetForwardedIpConfig: IPSetForwardedIPConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.IPSetReferenceStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.IPSetReferenceStatementProperty.builder()

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
      @JvmName("931389788bf7bae9a61c915426c95877b1cfc1a69329485a4de7f91e081da8d7")
      override
          fun ipSetForwardedIpConfig(ipSetForwardedIpConfig: IPSetForwardedIPConfigurationProperty.Builder.() -> Unit):
          Unit =
          ipSetForwardedIpConfig(IPSetForwardedIPConfigurationProperty(ipSetForwardedIpConfig))

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.IPSetReferenceStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.IPSetReferenceStatementProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.IPSetReferenceStatementProperty):
          IPSetReferenceStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IPSetReferenceStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.IPSetReferenceStatementProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ExcludedRuleProperty {
    public fun name(): String

    public interface Builder {
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ExcludedRuleProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.ExcludedRuleProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.ExcludedRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.ExcludedRuleProperty,
    ) : ExcludedRuleProperty {
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ExcludedRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.ExcludedRuleProperty):
          ExcludedRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExcludedRuleProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.ExcludedRuleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RateLimitQueryStringProperty {
    public fun textTransformations(): Any

    public interface Builder {
      public fun textTransformations(textTransformations: IResolvable)

      public fun textTransformations(textTransformations: List<Any>)

      public fun textTransformations(vararg textTransformations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitQueryStringProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitQueryStringProperty.builder()

      override fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations.let(IResolvable::unwrap))
      }

      override fun textTransformations(textTransformations: List<Any>) {
        cdkBuilder.textTransformations(textTransformations)
      }

      override fun textTransformations(vararg textTransformations: Any): Unit =
          textTransformations(textTransformations.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitQueryStringProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitQueryStringProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitQueryStringProperty):
          RateLimitQueryStringProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateLimitQueryStringProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitQueryStringProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RuleActionProperty {
    public fun allow(): Any? = unwrap(this).getAllow()

    public fun block(): Any? = unwrap(this).getBlock()

    public fun captcha(): Any? = unwrap(this).getCaptcha()

    public fun challenge(): Any? = unwrap(this).getChallenge()

    public fun count(): Any? = unwrap(this).getCount()

    public interface Builder {
      public fun allow(allow: IResolvable)

      public fun allow(allow: AllowActionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("379eaf354c519d5d43e85887069fd4a0ec59dbf7c90c6b050b9938e24da9b188")
      public fun allow(allow: AllowActionProperty.Builder.() -> Unit)

      public fun block(block: IResolvable)

      public fun block(block: BlockActionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2fd4dfb4512cd977baaa1e76623bd5238a060fa2e2cef23c2ed7dabcc52c890a")
      public fun block(block: BlockActionProperty.Builder.() -> Unit)

      public fun captcha(captcha: IResolvable)

      public fun captcha(captcha: CaptchaActionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83fe3a78725fd5a98c7dd3bf2c232653dd6c729952ae934cefa9acb8cd24ec27")
      public fun captcha(captcha: CaptchaActionProperty.Builder.() -> Unit)

      public fun challenge(challenge: IResolvable)

      public fun challenge(challenge: ChallengeActionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b0fd2364bfd10736d5e7fa45fd833848b1e50a34a4c4b6f9b18d23c2d9db08ef")
      public fun challenge(challenge: ChallengeActionProperty.Builder.() -> Unit)

      public fun count(count: IResolvable)

      public fun count(count: CountActionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7bce2a1fd3829d2c64eced2b1506a7052e5ccb6dd194a55b6748aa86007208c5")
      public fun count(count: CountActionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionProperty.builder()

      override fun allow(allow: IResolvable) {
        cdkBuilder.allow(allow.let(IResolvable::unwrap))
      }

      override fun allow(allow: AllowActionProperty) {
        cdkBuilder.allow(allow.let(AllowActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("379eaf354c519d5d43e85887069fd4a0ec59dbf7c90c6b050b9938e24da9b188")
      override fun allow(allow: AllowActionProperty.Builder.() -> Unit): Unit =
          allow(AllowActionProperty(allow))

      override fun block(block: IResolvable) {
        cdkBuilder.block(block.let(IResolvable::unwrap))
      }

      override fun block(block: BlockActionProperty) {
        cdkBuilder.block(block.let(BlockActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2fd4dfb4512cd977baaa1e76623bd5238a060fa2e2cef23c2ed7dabcc52c890a")
      override fun block(block: BlockActionProperty.Builder.() -> Unit): Unit =
          block(BlockActionProperty(block))

      override fun captcha(captcha: IResolvable) {
        cdkBuilder.captcha(captcha.let(IResolvable::unwrap))
      }

      override fun captcha(captcha: CaptchaActionProperty) {
        cdkBuilder.captcha(captcha.let(CaptchaActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83fe3a78725fd5a98c7dd3bf2c232653dd6c729952ae934cefa9acb8cd24ec27")
      override fun captcha(captcha: CaptchaActionProperty.Builder.() -> Unit): Unit =
          captcha(CaptchaActionProperty(captcha))

      override fun challenge(challenge: IResolvable) {
        cdkBuilder.challenge(challenge.let(IResolvable::unwrap))
      }

      override fun challenge(challenge: ChallengeActionProperty) {
        cdkBuilder.challenge(challenge.let(ChallengeActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b0fd2364bfd10736d5e7fa45fd833848b1e50a34a4c4b6f9b18d23c2d9db08ef")
      override fun challenge(challenge: ChallengeActionProperty.Builder.() -> Unit): Unit =
          challenge(ChallengeActionProperty(challenge))

      override fun count(count: IResolvable) {
        cdkBuilder.count(count.let(IResolvable::unwrap))
      }

      override fun count(count: CountActionProperty) {
        cdkBuilder.count(count.let(CountActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7bce2a1fd3829d2c64eced2b1506a7052e5ccb6dd194a55b6748aa86007208c5")
      override fun count(count: CountActionProperty.Builder.() -> Unit): Unit =
          count(CountActionProperty(count))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionProperty):
          RuleActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleActionProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ResponseInspectionStatusCodeProperty {
    public fun failureCodes(): Any

    public fun successCodes(): Any

    public interface Builder {
      public fun failureCodes(failureCodes: IResolvable)

      public fun failureCodes(failureCodes: List<Number>)

      public fun failureCodes(vararg failureCodes: Number)

      public fun successCodes(successCodes: IResolvable)

      public fun successCodes(successCodes: List<Number>)

      public fun successCodes(vararg successCodes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionStatusCodeProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionStatusCodeProperty.builder()

      override fun failureCodes(failureCodes: IResolvable) {
        cdkBuilder.failureCodes(failureCodes.let(IResolvable::unwrap))
      }

      override fun failureCodes(failureCodes: List<Number>) {
        cdkBuilder.failureCodes(failureCodes)
      }

      override fun failureCodes(vararg failureCodes: Number): Unit =
          failureCodes(failureCodes.toList())

      override fun successCodes(successCodes: IResolvable) {
        cdkBuilder.successCodes(successCodes.let(IResolvable::unwrap))
      }

      override fun successCodes(successCodes: List<Number>) {
        cdkBuilder.successCodes(successCodes)
      }

      override fun successCodes(vararg successCodes: Number): Unit =
          successCodes(successCodes.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionStatusCodeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionStatusCodeProperty,
    ) : ResponseInspectionStatusCodeProperty {
      override fun failureCodes(): Any = unwrap(this).getFailureCodes()

      override fun successCodes(): Any = unwrap(this).getSuccessCodes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ResponseInspectionStatusCodeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionStatusCodeProperty):
          ResponseInspectionStatusCodeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResponseInspectionStatusCodeProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionStatusCodeProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AndStatementProperty {
    public fun statements(): Any

    public interface Builder {
      public fun statements(statements: IResolvable)

      public fun statements(statements: List<Any>)

      public fun statements(vararg statements: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.AndStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.AndStatementProperty.builder()

      override fun statements(statements: IResolvable) {
        cdkBuilder.statements(statements.let(IResolvable::unwrap))
      }

      override fun statements(statements: List<Any>) {
        cdkBuilder.statements(statements)
      }

      override fun statements(vararg statements: Any): Unit = statements(statements.toList())

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.AndStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.AndStatementProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.AndStatementProperty):
          AndStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AndStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.AndStatementProperty = (wrapped as
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomHTTPHeaderProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomHTTPHeaderProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.CustomHTTPHeaderProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomHTTPHeaderProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.CustomHTTPHeaderProperty):
          CustomHTTPHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomHTTPHeaderProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomHTTPHeaderProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RuleActionOverrideProperty {
    public fun actionToUse(): Any

    public fun name(): String

    public interface Builder {
      public fun actionToUse(actionToUse: IResolvable)

      public fun actionToUse(actionToUse: RuleActionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd1e6efbeedbce0fd02e1858517cf21908a417587c10830b02cb2eb79e3742fb")
      public fun actionToUse(actionToUse: RuleActionProperty.Builder.() -> Unit)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionOverrideProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionOverrideProperty.builder()

      override fun actionToUse(actionToUse: IResolvable) {
        cdkBuilder.actionToUse(actionToUse.let(IResolvable::unwrap))
      }

      override fun actionToUse(actionToUse: RuleActionProperty) {
        cdkBuilder.actionToUse(actionToUse.let(RuleActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd1e6efbeedbce0fd02e1858517cf21908a417587c10830b02cb2eb79e3742fb")
      override fun actionToUse(actionToUse: RuleActionProperty.Builder.() -> Unit): Unit =
          actionToUse(RuleActionProperty(actionToUse))

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionOverrideProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionOverrideProperty,
    ) : RuleActionOverrideProperty {
      override fun actionToUse(): Any = unwrap(this).getActionToUse()

      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RuleActionOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionOverrideProperty):
          RuleActionOverrideProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleActionOverrideProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionOverrideProperty = (wrapped as
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
      @JvmName("31567424aac35def39a48e80f4cec5d8fa7fef100adfc17a95c4a734a786b384")
      public fun cookie(cookie: RateLimitCookieProperty.Builder.() -> Unit)

      public fun forwardedIp(forwardedIp: Any)

      public fun `header`(`header`: IResolvable)

      public fun `header`(`header`: RateLimitHeaderProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3fd8e10b283ec6c37f20e86789857aa0c1ee87939fc8afaa94a3f55be8674018")
      public fun `header`(`header`: RateLimitHeaderProperty.Builder.() -> Unit)

      public fun httpMethod(httpMethod: Any)

      public fun ip(ip: Any)

      public fun labelNamespace(labelNamespace: IResolvable)

      public fun labelNamespace(labelNamespace: RateLimitLabelNamespaceProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f794f32bb0adb6eadfc6cae6739e0fae78c12ad7580808ad853a04c92c0d2687")
      public fun labelNamespace(labelNamespace: RateLimitLabelNamespaceProperty.Builder.() -> Unit)

      public fun queryArgument(queryArgument: IResolvable)

      public fun queryArgument(queryArgument: RateLimitQueryArgumentProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f63e79b59e9a0f8e15c6059832a410ea3bcbc32a6010f35a17a36437b97e1ac")
      public fun queryArgument(queryArgument: RateLimitQueryArgumentProperty.Builder.() -> Unit)

      public fun queryString(queryString: IResolvable)

      public fun queryString(queryString: RateLimitQueryStringProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("deaf79c998efd2aabbf49bb4b74f32123cde27614eaf311feacb7a6f82da32ea")
      public fun queryString(queryString: RateLimitQueryStringProperty.Builder.() -> Unit)

      public fun uriPath(uriPath: IResolvable)

      public fun uriPath(uriPath: RateLimitUriPathProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a900a92a78b39d1912dd2d759c2f182b4d94626ef4c71bf89a2e9b220865c922")
      public fun uriPath(uriPath: RateLimitUriPathProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateBasedStatementCustomKeyProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateBasedStatementCustomKeyProperty.builder()

      override fun cookie(cookie: IResolvable) {
        cdkBuilder.cookie(cookie.let(IResolvable::unwrap))
      }

      override fun cookie(cookie: RateLimitCookieProperty) {
        cdkBuilder.cookie(cookie.let(RateLimitCookieProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("31567424aac35def39a48e80f4cec5d8fa7fef100adfc17a95c4a734a786b384")
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
      @JvmName("3fd8e10b283ec6c37f20e86789857aa0c1ee87939fc8afaa94a3f55be8674018")
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
      @JvmName("f794f32bb0adb6eadfc6cae6739e0fae78c12ad7580808ad853a04c92c0d2687")
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
      @JvmName("6f63e79b59e9a0f8e15c6059832a410ea3bcbc32a6010f35a17a36437b97e1ac")
      override fun queryArgument(queryArgument: RateLimitQueryArgumentProperty.Builder.() -> Unit):
          Unit = queryArgument(RateLimitQueryArgumentProperty(queryArgument))

      override fun queryString(queryString: IResolvable) {
        cdkBuilder.queryString(queryString.let(IResolvable::unwrap))
      }

      override fun queryString(queryString: RateLimitQueryStringProperty) {
        cdkBuilder.queryString(queryString.let(RateLimitQueryStringProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("deaf79c998efd2aabbf49bb4b74f32123cde27614eaf311feacb7a6f82da32ea")
      override fun queryString(queryString: RateLimitQueryStringProperty.Builder.() -> Unit): Unit =
          queryString(RateLimitQueryStringProperty(queryString))

      override fun uriPath(uriPath: IResolvable) {
        cdkBuilder.uriPath(uriPath.let(IResolvable::unwrap))
      }

      override fun uriPath(uriPath: RateLimitUriPathProperty) {
        cdkBuilder.uriPath(uriPath.let(RateLimitUriPathProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a900a92a78b39d1912dd2d759c2f182b4d94626ef4c71bf89a2e9b220865c922")
      override fun uriPath(uriPath: RateLimitUriPathProperty.Builder.() -> Unit): Unit =
          uriPath(RateLimitUriPathProperty(uriPath))

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateBasedStatementCustomKeyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateBasedStatementCustomKeyProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RateBasedStatementCustomKeyProperty):
          RateBasedStatementCustomKeyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateBasedStatementCustomKeyProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateBasedStatementCustomKeyProperty =
          (wrapped as Wrapper).cdkObject
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
      @JvmName("5a4ae235677289bb347d158fccbeb065eddebae67c7b3494cf4f3526d337b738")
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit)

      public fun regexString(regexString: String)

      public fun textTransformations(textTransformations: IResolvable)

      public fun textTransformations(textTransformations: List<Any>)

      public fun textTransformations(vararg textTransformations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RegexMatchStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RegexMatchStatementProperty.builder()

      override fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(IResolvable::unwrap))
      }

      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(FieldToMatchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5a4ae235677289bb347d158fccbeb065eddebae67c7b3494cf4f3526d337b738")
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

      override fun textTransformations(vararg textTransformations: Any): Unit =
          textTransformations(textTransformations.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.RegexMatchStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RegexMatchStatementProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RegexMatchStatementProperty):
          RegexMatchStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RegexMatchStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RegexMatchStatementProperty = (wrapped as
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.SingleHeaderProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.SingleHeaderProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.SingleHeaderProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.SingleHeaderProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.SingleHeaderProperty):
          SingleHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SingleHeaderProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.SingleHeaderProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CountActionProperty {
    public fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()

    public interface Builder {
      public fun customRequestHandling(customRequestHandling: IResolvable)

      public fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a7240ab3a4ed571a5245135df34bc9a0d3646c310c3139343a187947620129b4")
      public
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.CountActionProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.CountActionProperty.builder()

      override fun customRequestHandling(customRequestHandling: IResolvable) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(IResolvable::unwrap))
      }

      override fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(CustomRequestHandlingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a7240ab3a4ed571a5245135df34bc9a0d3646c310c3139343a187947620129b4")
      override
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit):
          Unit = customRequestHandling(CustomRequestHandlingProperty(customRequestHandling))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.CountActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.CountActionProperty,
    ) : CountActionProperty {
      override fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CountActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.CountActionProperty):
          CountActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CountActionProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.CountActionProperty = (wrapped as
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
      @JvmName("545d9a3c805382b7cf5e00cc76bec2fbf983d3e97857294aaef0fcdf21998877")
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit)

      public fun positionalConstraint(positionalConstraint: String)

      public fun searchString(searchString: String)

      public fun searchStringBase64(searchStringBase64: String)

      public fun textTransformations(textTransformations: IResolvable)

      public fun textTransformations(textTransformations: List<Any>)

      public fun textTransformations(vararg textTransformations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ByteMatchStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.ByteMatchStatementProperty.builder()

      override fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(IResolvable::unwrap))
      }

      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(FieldToMatchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("545d9a3c805382b7cf5e00cc76bec2fbf983d3e97857294aaef0fcdf21998877")
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

      override fun textTransformations(vararg textTransformations: Any): Unit =
          textTransformations(textTransformations.toList())

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.ByteMatchStatementProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ByteMatchStatementProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.ByteMatchStatementProperty):
          ByteMatchStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ByteMatchStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.ByteMatchStatementProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RateLimitHeaderProperty {
    public fun name(): String

    public fun textTransformations(): Any

    public interface Builder {
      public fun name(name: String)

      public fun textTransformations(textTransformations: IResolvable)

      public fun textTransformations(textTransformations: List<Any>)

      public fun textTransformations(vararg textTransformations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitHeaderProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitHeaderProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations.let(IResolvable::unwrap))
      }

      override fun textTransformations(textTransformations: List<Any>) {
        cdkBuilder.textTransformations(textTransformations)
      }

      override fun textTransformations(vararg textTransformations: Any): Unit =
          textTransformations(textTransformations.toList())

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitHeaderProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitHeaderProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitHeaderProperty):
          RateLimitHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateLimitHeaderProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitHeaderProperty = (wrapped as
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

      public fun excludedCookies(vararg excludedCookies: String)

      public fun includedCookies(includedCookies: List<String>)

      public fun includedCookies(vararg includedCookies: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.CookieMatchPatternProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.CookieMatchPatternProperty.builder()

      override fun all(all: Any) {
        cdkBuilder.all(all)
      }

      override fun excludedCookies(excludedCookies: List<String>) {
        cdkBuilder.excludedCookies(excludedCookies)
      }

      override fun excludedCookies(vararg excludedCookies: String): Unit =
          excludedCookies(excludedCookies.toList())

      override fun includedCookies(includedCookies: List<String>) {
        cdkBuilder.includedCookies(includedCookies)
      }

      override fun includedCookies(vararg includedCookies: String): Unit =
          includedCookies(includedCookies.toList())

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.CookieMatchPatternProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.CookieMatchPatternProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.CookieMatchPatternProperty):
          CookieMatchPatternProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CookieMatchPatternProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.CookieMatchPatternProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface NotStatementProperty {
    public fun statement(): Any

    public interface Builder {
      public fun statement(statement: IResolvable)

      public fun statement(statement: StatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a60c7ba7df5d6bea23a7dd98828007473b2fa502da3ee6562834bdcf7b4375ca")
      public fun statement(statement: StatementProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.NotStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.NotStatementProperty.builder()

      override fun statement(statement: IResolvable) {
        cdkBuilder.statement(statement.let(IResolvable::unwrap))
      }

      override fun statement(statement: StatementProperty) {
        cdkBuilder.statement(statement.let(StatementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a60c7ba7df5d6bea23a7dd98828007473b2fa502da3ee6562834bdcf7b4375ca")
      override fun statement(statement: StatementProperty.Builder.() -> Unit): Unit =
          statement(StatementProperty(statement))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.NotStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.NotStatementProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.NotStatementProperty):
          NotStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.NotStatementProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DefaultActionProperty {
    public fun allow(): Any? = unwrap(this).getAllow()

    public fun block(): Any? = unwrap(this).getBlock()

    public interface Builder {
      public fun allow(allow: IResolvable)

      public fun allow(allow: AllowActionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8437c49ff7202376ff3611cce47519a9622f0cbae0d14caa1382be023ac1eaf6")
      public fun allow(allow: AllowActionProperty.Builder.() -> Unit)

      public fun block(block: IResolvable)

      public fun block(block: BlockActionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ae93ac37f012f83f2399e87262001399f52316d994a5b48c3821cfea8003da48")
      public fun block(block: BlockActionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.DefaultActionProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.DefaultActionProperty.builder()

      override fun allow(allow: IResolvable) {
        cdkBuilder.allow(allow.let(IResolvable::unwrap))
      }

      override fun allow(allow: AllowActionProperty) {
        cdkBuilder.allow(allow.let(AllowActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8437c49ff7202376ff3611cce47519a9622f0cbae0d14caa1382be023ac1eaf6")
      override fun allow(allow: AllowActionProperty.Builder.() -> Unit): Unit =
          allow(AllowActionProperty(allow))

      override fun block(block: IResolvable) {
        cdkBuilder.block(block.let(IResolvable::unwrap))
      }

      override fun block(block: BlockActionProperty) {
        cdkBuilder.block(block.let(BlockActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ae93ac37f012f83f2399e87262001399f52316d994a5b48c3821cfea8003da48")
      override fun block(block: BlockActionProperty.Builder.() -> Unit): Unit =
          block(BlockActionProperty(block))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.DefaultActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.DefaultActionProperty,
    ) : DefaultActionProperty {
      override fun allow(): Any? = unwrap(this).getAllow()

      override fun block(): Any? = unwrap(this).getBlock()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DefaultActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.DefaultActionProperty):
          DefaultActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultActionProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.DefaultActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RuleGroupReferenceStatementProperty {
    public fun arn(): String

    public fun excludedRules(): Any? = unwrap(this).getExcludedRules()

    public fun ruleActionOverrides(): Any? = unwrap(this).getRuleActionOverrides()

    public interface Builder {
      public fun arn(arn: String)

      public fun excludedRules(excludedRules: IResolvable)

      public fun excludedRules(excludedRules: List<Any>)

      public fun excludedRules(vararg excludedRules: Any)

      public fun ruleActionOverrides(ruleActionOverrides: IResolvable)

      public fun ruleActionOverrides(ruleActionOverrides: List<Any>)

      public fun ruleActionOverrides(vararg ruleActionOverrides: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleGroupReferenceStatementProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleGroupReferenceStatementProperty.builder()

      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      override fun excludedRules(excludedRules: IResolvable) {
        cdkBuilder.excludedRules(excludedRules.let(IResolvable::unwrap))
      }

      override fun excludedRules(excludedRules: List<Any>) {
        cdkBuilder.excludedRules(excludedRules)
      }

      override fun excludedRules(vararg excludedRules: Any): Unit =
          excludedRules(excludedRules.toList())

      override fun ruleActionOverrides(ruleActionOverrides: IResolvable) {
        cdkBuilder.ruleActionOverrides(ruleActionOverrides.let(IResolvable::unwrap))
      }

      override fun ruleActionOverrides(ruleActionOverrides: List<Any>) {
        cdkBuilder.ruleActionOverrides(ruleActionOverrides)
      }

      override fun ruleActionOverrides(vararg ruleActionOverrides: Any): Unit =
          ruleActionOverrides(ruleActionOverrides.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleGroupReferenceStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleGroupReferenceStatementProperty,
    ) : RuleGroupReferenceStatementProperty {
      override fun arn(): String = unwrap(this).getArn()

      override fun excludedRules(): Any? = unwrap(this).getExcludedRules()

      override fun ruleActionOverrides(): Any? = unwrap(this).getRuleActionOverrides()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          RuleGroupReferenceStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RuleGroupReferenceStatementProperty):
          RuleGroupReferenceStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleGroupReferenceStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleGroupReferenceStatementProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ChallengeConfigProperty {
    public fun immunityTimeProperty(): Any? = unwrap(this).getImmunityTimeProperty()

    public interface Builder {
      public fun immunityTimeProperty(immunityTimeProperty: IResolvable)

      public fun immunityTimeProperty(immunityTimeProperty: ImmunityTimePropertyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ef16da968f630a5ffeb13845ae944341603beb4ddb7276cd8a2579bd291b4df1")
      public
          fun immunityTimeProperty(immunityTimeProperty: ImmunityTimePropertyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ChallengeConfigProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.ChallengeConfigProperty.builder()

      override fun immunityTimeProperty(immunityTimeProperty: IResolvable) {
        cdkBuilder.immunityTimeProperty(immunityTimeProperty.let(IResolvable::unwrap))
      }

      override fun immunityTimeProperty(immunityTimeProperty: ImmunityTimePropertyProperty) {
        cdkBuilder.immunityTimeProperty(immunityTimeProperty.let(ImmunityTimePropertyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ef16da968f630a5ffeb13845ae944341603beb4ddb7276cd8a2579bd291b4df1")
      override
          fun immunityTimeProperty(immunityTimeProperty: ImmunityTimePropertyProperty.Builder.() -> Unit):
          Unit = immunityTimeProperty(ImmunityTimePropertyProperty(immunityTimeProperty))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.ChallengeConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ChallengeConfigProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.ChallengeConfigProperty):
          ChallengeConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ChallengeConfigProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.ChallengeConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
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
      @JvmName("a713f0aaebe88325c07b4afed5457d394339ba89e1d542805b3d05ca88fc012a")
      public fun matchPattern(matchPattern: JsonMatchPatternProperty.Builder.() -> Unit)

      public fun matchScope(matchScope: String)

      public fun oversizeHandling(oversizeHandling: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.JsonBodyProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.JsonBodyProperty.builder()

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
      @JvmName("a713f0aaebe88325c07b4afed5457d394339ba89e1d542805b3d05ca88fc012a")
      override fun matchPattern(matchPattern: JsonMatchPatternProperty.Builder.() -> Unit): Unit =
          matchPattern(JsonMatchPatternProperty(matchPattern))

      override fun matchScope(matchScope: String) {
        cdkBuilder.matchScope(matchScope)
      }

      override fun oversizeHandling(oversizeHandling: String) {
        cdkBuilder.oversizeHandling(oversizeHandling)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.JsonBodyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.JsonBodyProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.JsonBodyProperty):
          JsonBodyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JsonBodyProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.JsonBodyProperty = (wrapped as
          Wrapper).cdkObject
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.IPSetForwardedIPConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnWebACL.IPSetForwardedIPConfigurationProperty.builder()

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
          software.amazon.awscdk.services.wafv2.CfnWebACL.IPSetForwardedIPConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.IPSetForwardedIPConfigurationProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.IPSetForwardedIPConfigurationProperty):
          IPSetForwardedIPConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IPSetForwardedIPConfigurationProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.IPSetForwardedIPConfigurationProperty =
          (wrapped as Wrapper).cdkObject
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
      @JvmName("5ce9d5881a7cabbbdb8050a5fe83c561595dc111606a3ae5137e044fb95be716")
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit)

      public fun size(size: Number)

      public fun textTransformations(textTransformations: IResolvable)

      public fun textTransformations(textTransformations: List<Any>)

      public fun textTransformations(vararg textTransformations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.SizeConstraintStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.SizeConstraintStatementProperty.builder()

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
      @JvmName("5ce9d5881a7cabbbdb8050a5fe83c561595dc111606a3ae5137e044fb95be716")
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

      override fun textTransformations(vararg textTransformations: Any): Unit =
          textTransformations(textTransformations.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.SizeConstraintStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.SizeConstraintStatementProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.SizeConstraintStatementProperty):
          SizeConstraintStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SizeConstraintStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.SizeConstraintStatementProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ManagedRuleGroupConfigProperty {
    public fun awsManagedRulesAcfpRuleSet(): Any? = unwrap(this).getAwsManagedRulesAcfpRuleSet()

    public fun awsManagedRulesAtpRuleSet(): Any? = unwrap(this).getAwsManagedRulesAtpRuleSet()

    public fun awsManagedRulesBotControlRuleSet(): Any? =
        unwrap(this).getAwsManagedRulesBotControlRuleSet()

    public fun loginPath(): String? = unwrap(this).getLoginPath()

    public fun passwordField(): Any? = unwrap(this).getPasswordField()

    public fun payloadType(): String? = unwrap(this).getPayloadType()

    public fun usernameField(): Any? = unwrap(this).getUsernameField()

    public interface Builder {
      public fun awsManagedRulesAcfpRuleSet(awsManagedRulesAcfpRuleSet: IResolvable)

      public
          fun awsManagedRulesAcfpRuleSet(awsManagedRulesAcfpRuleSet: AWSManagedRulesACFPRuleSetProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e365e2687f33e759cd514a180a5b741cba913ac9b26c94a6bdc672725ef94407")
      public
          fun awsManagedRulesAcfpRuleSet(awsManagedRulesAcfpRuleSet: AWSManagedRulesACFPRuleSetProperty.Builder.() -> Unit)

      public fun awsManagedRulesAtpRuleSet(awsManagedRulesAtpRuleSet: IResolvable)

      public
          fun awsManagedRulesAtpRuleSet(awsManagedRulesAtpRuleSet: AWSManagedRulesATPRuleSetProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b668638f8772da0a8feaba966da302391529ec3a4ef1ce1921b00c0d31725948")
      public
          fun awsManagedRulesAtpRuleSet(awsManagedRulesAtpRuleSet: AWSManagedRulesATPRuleSetProperty.Builder.() -> Unit)

      public fun awsManagedRulesBotControlRuleSet(awsManagedRulesBotControlRuleSet: IResolvable)

      public
          fun awsManagedRulesBotControlRuleSet(awsManagedRulesBotControlRuleSet: AWSManagedRulesBotControlRuleSetProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8bdc79f5d89a1531a2cae414d0733d78c302aa7457f469af0210af6f5db7c6a3")
      public
          fun awsManagedRulesBotControlRuleSet(awsManagedRulesBotControlRuleSet: AWSManagedRulesBotControlRuleSetProperty.Builder.() -> Unit)

      public fun loginPath(loginPath: String)

      public fun passwordField(passwordField: IResolvable)

      public fun passwordField(passwordField: FieldIdentifierProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c95687bb7e28071b99a66f09ae07ef28e92a08533deba6f9d00a7914d459a7b")
      public fun passwordField(passwordField: FieldIdentifierProperty.Builder.() -> Unit)

      public fun payloadType(payloadType: String)

      public fun usernameField(usernameField: IResolvable)

      public fun usernameField(usernameField: FieldIdentifierProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("801e82b338beac2750da186934b1105bd0f7561a544c1f2aab0d51612b59a1f0")
      public fun usernameField(usernameField: FieldIdentifierProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupConfigProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupConfigProperty.builder()

      override fun awsManagedRulesAcfpRuleSet(awsManagedRulesAcfpRuleSet: IResolvable) {
        cdkBuilder.awsManagedRulesAcfpRuleSet(awsManagedRulesAcfpRuleSet.let(IResolvable::unwrap))
      }

      override
          fun awsManagedRulesAcfpRuleSet(awsManagedRulesAcfpRuleSet: AWSManagedRulesACFPRuleSetProperty) {
        cdkBuilder.awsManagedRulesAcfpRuleSet(awsManagedRulesAcfpRuleSet.let(AWSManagedRulesACFPRuleSetProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e365e2687f33e759cd514a180a5b741cba913ac9b26c94a6bdc672725ef94407")
      override
          fun awsManagedRulesAcfpRuleSet(awsManagedRulesAcfpRuleSet: AWSManagedRulesACFPRuleSetProperty.Builder.() -> Unit):
          Unit =
          awsManagedRulesAcfpRuleSet(AWSManagedRulesACFPRuleSetProperty(awsManagedRulesAcfpRuleSet))

      override fun awsManagedRulesAtpRuleSet(awsManagedRulesAtpRuleSet: IResolvable) {
        cdkBuilder.awsManagedRulesAtpRuleSet(awsManagedRulesAtpRuleSet.let(IResolvable::unwrap))
      }

      override
          fun awsManagedRulesAtpRuleSet(awsManagedRulesAtpRuleSet: AWSManagedRulesATPRuleSetProperty) {
        cdkBuilder.awsManagedRulesAtpRuleSet(awsManagedRulesAtpRuleSet.let(AWSManagedRulesATPRuleSetProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b668638f8772da0a8feaba966da302391529ec3a4ef1ce1921b00c0d31725948")
      override
          fun awsManagedRulesAtpRuleSet(awsManagedRulesAtpRuleSet: AWSManagedRulesATPRuleSetProperty.Builder.() -> Unit):
          Unit =
          awsManagedRulesAtpRuleSet(AWSManagedRulesATPRuleSetProperty(awsManagedRulesAtpRuleSet))

      override fun awsManagedRulesBotControlRuleSet(awsManagedRulesBotControlRuleSet: IResolvable) {
        cdkBuilder.awsManagedRulesBotControlRuleSet(awsManagedRulesBotControlRuleSet.let(IResolvable::unwrap))
      }

      override
          fun awsManagedRulesBotControlRuleSet(awsManagedRulesBotControlRuleSet: AWSManagedRulesBotControlRuleSetProperty) {
        cdkBuilder.awsManagedRulesBotControlRuleSet(awsManagedRulesBotControlRuleSet.let(AWSManagedRulesBotControlRuleSetProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8bdc79f5d89a1531a2cae414d0733d78c302aa7457f469af0210af6f5db7c6a3")
      override
          fun awsManagedRulesBotControlRuleSet(awsManagedRulesBotControlRuleSet: AWSManagedRulesBotControlRuleSetProperty.Builder.() -> Unit):
          Unit =
          awsManagedRulesBotControlRuleSet(AWSManagedRulesBotControlRuleSetProperty(awsManagedRulesBotControlRuleSet))

      override fun loginPath(loginPath: String) {
        cdkBuilder.loginPath(loginPath)
      }

      override fun passwordField(passwordField: IResolvable) {
        cdkBuilder.passwordField(passwordField.let(IResolvable::unwrap))
      }

      override fun passwordField(passwordField: FieldIdentifierProperty) {
        cdkBuilder.passwordField(passwordField.let(FieldIdentifierProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c95687bb7e28071b99a66f09ae07ef28e92a08533deba6f9d00a7914d459a7b")
      override fun passwordField(passwordField: FieldIdentifierProperty.Builder.() -> Unit): Unit =
          passwordField(FieldIdentifierProperty(passwordField))

      override fun payloadType(payloadType: String) {
        cdkBuilder.payloadType(payloadType)
      }

      override fun usernameField(usernameField: IResolvable) {
        cdkBuilder.usernameField(usernameField.let(IResolvable::unwrap))
      }

      override fun usernameField(usernameField: FieldIdentifierProperty) {
        cdkBuilder.usernameField(usernameField.let(FieldIdentifierProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("801e82b338beac2750da186934b1105bd0f7561a544c1f2aab0d51612b59a1f0")
      override fun usernameField(usernameField: FieldIdentifierProperty.Builder.() -> Unit): Unit =
          usernameField(FieldIdentifierProperty(usernameField))

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupConfigProperty,
    ) : ManagedRuleGroupConfigProperty {
      override fun awsManagedRulesAcfpRuleSet(): Any? = unwrap(this).getAwsManagedRulesAcfpRuleSet()

      override fun awsManagedRulesAtpRuleSet(): Any? = unwrap(this).getAwsManagedRulesAtpRuleSet()

      override fun awsManagedRulesBotControlRuleSet(): Any? =
          unwrap(this).getAwsManagedRulesBotControlRuleSet()

      override fun loginPath(): String? = unwrap(this).getLoginPath()

      override fun passwordField(): Any? = unwrap(this).getPasswordField()

      override fun payloadType(): String? = unwrap(this).getPayloadType()

      override fun usernameField(): Any? = unwrap(this).getUsernameField()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ManagedRuleGroupConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupConfigProperty):
          ManagedRuleGroupConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ManagedRuleGroupConfigProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface RateLimitLabelNamespaceProperty {
    public fun namespace(): String

    public interface Builder {
      public fun namespace(namespace: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitLabelNamespaceProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitLabelNamespaceProperty.builder()

      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitLabelNamespaceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitLabelNamespaceProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitLabelNamespaceProperty):
          RateLimitLabelNamespaceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateLimitLabelNamespaceProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitLabelNamespaceProperty = (wrapped
          as Wrapper).cdkObject
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
      @JvmName("4187d2a7600da4b224b02d48c1802e7cf8f8f9722371bfa267effb0336e47b7e")
      public fun body(body: BodyProperty.Builder.() -> Unit)

      public fun cookies(cookies: IResolvable)

      public fun cookies(cookies: CookiesProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27f40245785764ca1cfebe47c390db337b9f3f182a13553395488a9d5389357a")
      public fun cookies(cookies: CookiesProperty.Builder.() -> Unit)

      public fun headers(headers: IResolvable)

      public fun headers(headers: HeadersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a201e91ef2b6c5f336390bbdf975a593aa050cbd4acec2da27d5c1e4d138bd7a")
      public fun headers(headers: HeadersProperty.Builder.() -> Unit)

      public fun jsonBody(jsonBody: IResolvable)

      public fun jsonBody(jsonBody: JsonBodyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("30214c55630de1a0d2acbec07ad360fe490d9636fdd219f46d092f7d92eb2840")
      public fun jsonBody(jsonBody: JsonBodyProperty.Builder.() -> Unit)

      public fun method(method: Any)

      public fun queryString(queryString: Any)

      public fun singleHeader(singleHeader: Any)

      public fun singleQueryArgument(singleQueryArgument: Any)

      public fun uriPath(uriPath: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.FieldToMatchProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.FieldToMatchProperty.builder()

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
      @JvmName("4187d2a7600da4b224b02d48c1802e7cf8f8f9722371bfa267effb0336e47b7e")
      override fun body(body: BodyProperty.Builder.() -> Unit): Unit = body(BodyProperty(body))

      override fun cookies(cookies: IResolvable) {
        cdkBuilder.cookies(cookies.let(IResolvable::unwrap))
      }

      override fun cookies(cookies: CookiesProperty) {
        cdkBuilder.cookies(cookies.let(CookiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27f40245785764ca1cfebe47c390db337b9f3f182a13553395488a9d5389357a")
      override fun cookies(cookies: CookiesProperty.Builder.() -> Unit): Unit =
          cookies(CookiesProperty(cookies))

      override fun headers(headers: IResolvable) {
        cdkBuilder.headers(headers.let(IResolvable::unwrap))
      }

      override fun headers(headers: HeadersProperty) {
        cdkBuilder.headers(headers.let(HeadersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a201e91ef2b6c5f336390bbdf975a593aa050cbd4acec2da27d5c1e4d138bd7a")
      override fun headers(headers: HeadersProperty.Builder.() -> Unit): Unit =
          headers(HeadersProperty(headers))

      override fun jsonBody(jsonBody: IResolvable) {
        cdkBuilder.jsonBody(jsonBody.let(IResolvable::unwrap))
      }

      override fun jsonBody(jsonBody: JsonBodyProperty) {
        cdkBuilder.jsonBody(jsonBody.let(JsonBodyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("30214c55630de1a0d2acbec07ad360fe490d9636fdd219f46d092f7d92eb2840")
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

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.FieldToMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.FieldToMatchProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.FieldToMatchProperty):
          FieldToMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldToMatchProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.FieldToMatchProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AWSManagedRulesATPRuleSetProperty {
    public fun enableRegexInPath(): Any? = unwrap(this).getEnableRegexInPath()

    public fun loginPath(): String

    public fun requestInspection(): Any? = unwrap(this).getRequestInspection()

    public fun responseInspection(): Any? = unwrap(this).getResponseInspection()

    public interface Builder {
      public fun enableRegexInPath(enableRegexInPath: Boolean)

      public fun enableRegexInPath(enableRegexInPath: IResolvable)

      public fun loginPath(loginPath: String)

      public fun requestInspection(requestInspection: IResolvable)

      public fun requestInspection(requestInspection: RequestInspectionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e7cf64a55e4d81d0ec58c88fdf6cb5695c1aa7531a97398cccd7d50cc2fc5b88")
      public fun requestInspection(requestInspection: RequestInspectionProperty.Builder.() -> Unit)

      public fun responseInspection(responseInspection: IResolvable)

      public fun responseInspection(responseInspection: ResponseInspectionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d9b5d3a870db7b1e4f991c989e5379d4fc97f35046844f444e17affecaa5f1df")
      public
          fun responseInspection(responseInspection: ResponseInspectionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesATPRuleSetProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesATPRuleSetProperty.builder()

      override fun enableRegexInPath(enableRegexInPath: Boolean) {
        cdkBuilder.enableRegexInPath(enableRegexInPath)
      }

      override fun enableRegexInPath(enableRegexInPath: IResolvable) {
        cdkBuilder.enableRegexInPath(enableRegexInPath.let(IResolvable::unwrap))
      }

      override fun loginPath(loginPath: String) {
        cdkBuilder.loginPath(loginPath)
      }

      override fun requestInspection(requestInspection: IResolvable) {
        cdkBuilder.requestInspection(requestInspection.let(IResolvable::unwrap))
      }

      override fun requestInspection(requestInspection: RequestInspectionProperty) {
        cdkBuilder.requestInspection(requestInspection.let(RequestInspectionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e7cf64a55e4d81d0ec58c88fdf6cb5695c1aa7531a97398cccd7d50cc2fc5b88")
      override
          fun requestInspection(requestInspection: RequestInspectionProperty.Builder.() -> Unit):
          Unit = requestInspection(RequestInspectionProperty(requestInspection))

      override fun responseInspection(responseInspection: IResolvable) {
        cdkBuilder.responseInspection(responseInspection.let(IResolvable::unwrap))
      }

      override fun responseInspection(responseInspection: ResponseInspectionProperty) {
        cdkBuilder.responseInspection(responseInspection.let(ResponseInspectionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d9b5d3a870db7b1e4f991c989e5379d4fc97f35046844f444e17affecaa5f1df")
      override
          fun responseInspection(responseInspection: ResponseInspectionProperty.Builder.() -> Unit):
          Unit = responseInspection(ResponseInspectionProperty(responseInspection))

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesATPRuleSetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesATPRuleSetProperty,
    ) : AWSManagedRulesATPRuleSetProperty {
      override fun enableRegexInPath(): Any? = unwrap(this).getEnableRegexInPath()

      override fun loginPath(): String = unwrap(this).getLoginPath()

      override fun requestInspection(): Any? = unwrap(this).getRequestInspection()

      override fun responseInspection(): Any? = unwrap(this).getResponseInspection()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AWSManagedRulesATPRuleSetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesATPRuleSetProperty):
          AWSManagedRulesATPRuleSetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AWSManagedRulesATPRuleSetProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesATPRuleSetProperty =
          (wrapped as Wrapper).cdkObject
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.ForwardedIPConfigurationProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.ForwardedIPConfigurationProperty.builder()

      override fun fallbackBehavior(fallbackBehavior: String) {
        cdkBuilder.fallbackBehavior(fallbackBehavior)
      }

      override fun headerName(headerName: String) {
        cdkBuilder.headerName(headerName)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.ForwardedIPConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ForwardedIPConfigurationProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.ForwardedIPConfigurationProperty):
          ForwardedIPConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ForwardedIPConfigurationProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.ForwardedIPConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SingleQueryArgumentProperty {
    public fun name(): String

    public interface Builder {
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.SingleQueryArgumentProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.SingleQueryArgumentProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.SingleQueryArgumentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.SingleQueryArgumentProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.SingleQueryArgumentProperty):
          SingleQueryArgumentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SingleQueryArgumentProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.SingleQueryArgumentProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CaptchaActionProperty {
    public fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()

    public interface Builder {
      public fun customRequestHandling(customRequestHandling: IResolvable)

      public fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95e34132cd2efff5159c47c12e75b275f1351c0ca8e99ded02e27cb0e88a1373")
      public
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.CaptchaActionProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.CaptchaActionProperty.builder()

      override fun customRequestHandling(customRequestHandling: IResolvable) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(IResolvable::unwrap))
      }

      override fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(CustomRequestHandlingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95e34132cd2efff5159c47c12e75b275f1351c0ca8e99ded02e27cb0e88a1373")
      override
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit):
          Unit = customRequestHandling(CustomRequestHandlingProperty(customRequestHandling))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.CaptchaActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.CaptchaActionProperty,
    ) : CaptchaActionProperty {
      override fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CaptchaActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.CaptchaActionProperty):
          CaptchaActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CaptchaActionProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.CaptchaActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ResponseInspectionBodyContainsProperty {
    public fun failureStrings(): List<String>

    public fun successStrings(): List<String>

    public interface Builder {
      public fun failureStrings(failureStrings: List<String>)

      public fun failureStrings(vararg failureStrings: String)

      public fun successStrings(successStrings: List<String>)

      public fun successStrings(vararg successStrings: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionBodyContainsProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionBodyContainsProperty.builder()

      override fun failureStrings(failureStrings: List<String>) {
        cdkBuilder.failureStrings(failureStrings)
      }

      override fun failureStrings(vararg failureStrings: String): Unit =
          failureStrings(failureStrings.toList())

      override fun successStrings(successStrings: List<String>) {
        cdkBuilder.successStrings(successStrings)
      }

      override fun successStrings(vararg successStrings: String): Unit =
          successStrings(successStrings.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionBodyContainsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionBodyContainsProperty,
    ) : ResponseInspectionBodyContainsProperty {
      override fun failureStrings(): List<String> = unwrap(this).getFailureStrings()

      override fun successStrings(): List<String> = unwrap(this).getSuccessStrings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ResponseInspectionBodyContainsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionBodyContainsProperty):
          ResponseInspectionBodyContainsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResponseInspectionBodyContainsProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionBodyContainsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RequestBodyAssociatedResourceTypeConfigProperty {
    public fun defaultSizeInspectionLimit(): String

    public interface Builder {
      public fun defaultSizeInspectionLimit(defaultSizeInspectionLimit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestBodyAssociatedResourceTypeConfigProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestBodyAssociatedResourceTypeConfigProperty.builder()

      override fun defaultSizeInspectionLimit(defaultSizeInspectionLimit: String) {
        cdkBuilder.defaultSizeInspectionLimit(defaultSizeInspectionLimit)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestBodyAssociatedResourceTypeConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestBodyAssociatedResourceTypeConfigProperty,
    ) : RequestBodyAssociatedResourceTypeConfigProperty {
      override fun defaultSizeInspectionLimit(): String =
          unwrap(this).getDefaultSizeInspectionLimit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          RequestBodyAssociatedResourceTypeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RequestBodyAssociatedResourceTypeConfigProperty):
          RequestBodyAssociatedResourceTypeConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RequestBodyAssociatedResourceTypeConfigProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestBodyAssociatedResourceTypeConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface BodyProperty {
    public fun oversizeHandling(): String? = unwrap(this).getOversizeHandling()

    public interface Builder {
      public fun oversizeHandling(oversizeHandling: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.wafv2.CfnWebACL.BodyProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.BodyProperty.builder()

      override fun oversizeHandling(oversizeHandling: String) {
        cdkBuilder.oversizeHandling(oversizeHandling)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.BodyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.BodyProperty,
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

      internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.BodyProperty):
          BodyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BodyProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.BodyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LabelProperty {
    public fun name(): String

    public interface Builder {
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.wafv2.CfnWebACL.LabelProperty.Builder
          = software.amazon.awscdk.services.wafv2.CfnWebACL.LabelProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.LabelProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.LabelProperty,
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

      internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.LabelProperty):
          LabelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LabelProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.LabelProperty = (wrapped as
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.TextTransformationProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.TextTransformationProperty.builder()

      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.TextTransformationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.TextTransformationProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.TextTransformationProperty):
          TextTransformationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TextTransformationProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.TextTransformationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RequestInspectionProperty {
    public fun passwordField(): Any

    public fun payloadType(): String

    public fun usernameField(): Any

    public interface Builder {
      public fun passwordField(passwordField: IResolvable)

      public fun passwordField(passwordField: FieldIdentifierProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7b9fc9931d8c4fc948f2862088c1cbb056f4bf314c1ac2a175cac23798ed950f")
      public fun passwordField(passwordField: FieldIdentifierProperty.Builder.() -> Unit)

      public fun payloadType(payloadType: String)

      public fun usernameField(usernameField: IResolvable)

      public fun usernameField(usernameField: FieldIdentifierProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c46dcf8fbc478ce0055752422c4f9cfa360a5ae4ac3d58260f653385c55e54ec")
      public fun usernameField(usernameField: FieldIdentifierProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestInspectionProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestInspectionProperty.builder()

      override fun passwordField(passwordField: IResolvable) {
        cdkBuilder.passwordField(passwordField.let(IResolvable::unwrap))
      }

      override fun passwordField(passwordField: FieldIdentifierProperty) {
        cdkBuilder.passwordField(passwordField.let(FieldIdentifierProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7b9fc9931d8c4fc948f2862088c1cbb056f4bf314c1ac2a175cac23798ed950f")
      override fun passwordField(passwordField: FieldIdentifierProperty.Builder.() -> Unit): Unit =
          passwordField(FieldIdentifierProperty(passwordField))

      override fun payloadType(payloadType: String) {
        cdkBuilder.payloadType(payloadType)
      }

      override fun usernameField(usernameField: IResolvable) {
        cdkBuilder.usernameField(usernameField.let(IResolvable::unwrap))
      }

      override fun usernameField(usernameField: FieldIdentifierProperty) {
        cdkBuilder.usernameField(usernameField.let(FieldIdentifierProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c46dcf8fbc478ce0055752422c4f9cfa360a5ae4ac3d58260f653385c55e54ec")
      override fun usernameField(usernameField: FieldIdentifierProperty.Builder.() -> Unit): Unit =
          usernameField(FieldIdentifierProperty(usernameField))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.RequestInspectionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestInspectionProperty,
    ) : RequestInspectionProperty {
      override fun passwordField(): Any = unwrap(this).getPasswordField()

      override fun payloadType(): String = unwrap(this).getPayloadType()

      override fun usernameField(): Any = unwrap(this).getUsernameField()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RequestInspectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RequestInspectionProperty):
          RequestInspectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RequestInspectionProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestInspectionProperty = (wrapped as
          Wrapper).cdkObject
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
      @JvmName("a10f4f90638a94ecb1c8c62292f2515272b2a81c9853acdbba59d8cf73d91c90")
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit)

      public fun sensitivityLevel(sensitivityLevel: String)

      public fun textTransformations(textTransformations: IResolvable)

      public fun textTransformations(textTransformations: List<Any>)

      public fun textTransformations(vararg textTransformations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.SqliMatchStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.SqliMatchStatementProperty.builder()

      override fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(IResolvable::unwrap))
      }

      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(FieldToMatchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a10f4f90638a94ecb1c8c62292f2515272b2a81c9853acdbba59d8cf73d91c90")
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

      override fun textTransformations(vararg textTransformations: Any): Unit =
          textTransformations(textTransformations.toList())

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.SqliMatchStatementProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.SqliMatchStatementProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.SqliMatchStatementProperty):
          SqliMatchStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SqliMatchStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.SqliMatchStatementProperty = (wrapped as
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
      @JvmName("bf2b044cdeed22513d28df661f829325f858f591fd59d7eabfeffb626c200b32")
      public fun matchPattern(matchPattern: HeaderMatchPatternProperty.Builder.() -> Unit)

      public fun matchScope(matchScope: String)

      public fun oversizeHandling(oversizeHandling: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.HeadersProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.HeadersProperty.builder()

      override fun matchPattern(matchPattern: IResolvable) {
        cdkBuilder.matchPattern(matchPattern.let(IResolvable::unwrap))
      }

      override fun matchPattern(matchPattern: HeaderMatchPatternProperty) {
        cdkBuilder.matchPattern(matchPattern.let(HeaderMatchPatternProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf2b044cdeed22513d28df661f829325f858f591fd59d7eabfeffb626c200b32")
      override fun matchPattern(matchPattern: HeaderMatchPatternProperty.Builder.() -> Unit): Unit =
          matchPattern(HeaderMatchPatternProperty(matchPattern))

      override fun matchScope(matchScope: String) {
        cdkBuilder.matchScope(matchScope)
      }

      override fun oversizeHandling(oversizeHandling: String) {
        cdkBuilder.oversizeHandling(oversizeHandling)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.HeadersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.HeadersProperty,
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

      internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.HeadersProperty):
          HeadersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HeadersProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.HeadersProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface StatementProperty {
    public fun andStatement(): Any? = unwrap(this).getAndStatement()

    public fun byteMatchStatement(): Any? = unwrap(this).getByteMatchStatement()

    public fun geoMatchStatement(): Any? = unwrap(this).getGeoMatchStatement()

    public fun ipSetReferenceStatement(): Any? = unwrap(this).getIpSetReferenceStatement()

    public fun labelMatchStatement(): Any? = unwrap(this).getLabelMatchStatement()

    public fun managedRuleGroupStatement(): Any? = unwrap(this).getManagedRuleGroupStatement()

    public fun notStatement(): Any? = unwrap(this).getNotStatement()

    public fun orStatement(): Any? = unwrap(this).getOrStatement()

    public fun rateBasedStatement(): Any? = unwrap(this).getRateBasedStatement()

    public fun regexMatchStatement(): Any? = unwrap(this).getRegexMatchStatement()

    public fun regexPatternSetReferenceStatement(): Any? =
        unwrap(this).getRegexPatternSetReferenceStatement()

    public fun ruleGroupReferenceStatement(): Any? = unwrap(this).getRuleGroupReferenceStatement()

    public fun sizeConstraintStatement(): Any? = unwrap(this).getSizeConstraintStatement()

    public fun sqliMatchStatement(): Any? = unwrap(this).getSqliMatchStatement()

    public fun xssMatchStatement(): Any? = unwrap(this).getXssMatchStatement()

    public interface Builder {
      public fun andStatement(andStatement: IResolvable)

      public fun andStatement(andStatement: AndStatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0faf91fb3e60ba2aaa4f4a1d4b756e124092f1de837c505a2571fb537fbb55dd")
      public fun andStatement(andStatement: AndStatementProperty.Builder.() -> Unit)

      public fun byteMatchStatement(byteMatchStatement: IResolvable)

      public fun byteMatchStatement(byteMatchStatement: ByteMatchStatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("52725cb354f7e3372c32f5ea06bfbdd4b5f35f4c3f962de6148afc2ac73af50d")
      public
          fun byteMatchStatement(byteMatchStatement: ByteMatchStatementProperty.Builder.() -> Unit)

      public fun geoMatchStatement(geoMatchStatement: IResolvable)

      public fun geoMatchStatement(geoMatchStatement: GeoMatchStatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c27167e826cc53423d71271832dece9341e7d08dbcbc57d7f043237ba6026203")
      public fun geoMatchStatement(geoMatchStatement: GeoMatchStatementProperty.Builder.() -> Unit)

      public fun ipSetReferenceStatement(ipSetReferenceStatement: IResolvable)

      public fun ipSetReferenceStatement(ipSetReferenceStatement: IPSetReferenceStatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f7f25f805e1ec5eab5cc489c5de0e4d3a39195c9075d39742ba7fd3c366afaf5")
      public
          fun ipSetReferenceStatement(ipSetReferenceStatement: IPSetReferenceStatementProperty.Builder.() -> Unit)

      public fun labelMatchStatement(labelMatchStatement: IResolvable)

      public fun labelMatchStatement(labelMatchStatement: LabelMatchStatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf323e95729aaaa3aa6707741d5085879fffa7192efd6e83a20bb68036b4efb1")
      public
          fun labelMatchStatement(labelMatchStatement: LabelMatchStatementProperty.Builder.() -> Unit)

      public fun managedRuleGroupStatement(managedRuleGroupStatement: IResolvable)

      public
          fun managedRuleGroupStatement(managedRuleGroupStatement: ManagedRuleGroupStatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5a719c5448f0625ca8aab0db2d4425ca16fee5c369dbfc9fc0e69d3487a914a0")
      public
          fun managedRuleGroupStatement(managedRuleGroupStatement: ManagedRuleGroupStatementProperty.Builder.() -> Unit)

      public fun notStatement(notStatement: IResolvable)

      public fun notStatement(notStatement: NotStatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82fa62752d3b1606eb2d90d3c718fdd0f63ad2d4361c2d300c90237c848fdf56")
      public fun notStatement(notStatement: NotStatementProperty.Builder.() -> Unit)

      public fun orStatement(orStatement: IResolvable)

      public fun orStatement(orStatement: OrStatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3105c7b766ce6e25c9a977288c9f1f8f65ba0816b709fbd9980affac6115f543")
      public fun orStatement(orStatement: OrStatementProperty.Builder.() -> Unit)

      public fun rateBasedStatement(rateBasedStatement: IResolvable)

      public fun rateBasedStatement(rateBasedStatement: RateBasedStatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e40ad809c41b00cd5cda76a731c9890e14ee74d1af9bfa1a87304785963d93c6")
      public
          fun rateBasedStatement(rateBasedStatement: RateBasedStatementProperty.Builder.() -> Unit)

      public fun regexMatchStatement(regexMatchStatement: IResolvable)

      public fun regexMatchStatement(regexMatchStatement: RegexMatchStatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00f98b13c8a141747b8f01bbaef239900f1ad89f42ab184cf3517c20f6b915cb")
      public
          fun regexMatchStatement(regexMatchStatement: RegexMatchStatementProperty.Builder.() -> Unit)

      public fun regexPatternSetReferenceStatement(regexPatternSetReferenceStatement: IResolvable)

      public
          fun regexPatternSetReferenceStatement(regexPatternSetReferenceStatement: RegexPatternSetReferenceStatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a20b875a996965b24eee9d5c9cc63be10d7d576ac75c8dfa96b1ddd9899cdb6")
      public
          fun regexPatternSetReferenceStatement(regexPatternSetReferenceStatement: RegexPatternSetReferenceStatementProperty.Builder.() -> Unit)

      public fun ruleGroupReferenceStatement(ruleGroupReferenceStatement: IResolvable)

      public
          fun ruleGroupReferenceStatement(ruleGroupReferenceStatement: RuleGroupReferenceStatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9119e54122bf8090ccc83df44678012d3204684de5b80b11b17af611c7179f08")
      public
          fun ruleGroupReferenceStatement(ruleGroupReferenceStatement: RuleGroupReferenceStatementProperty.Builder.() -> Unit)

      public fun sizeConstraintStatement(sizeConstraintStatement: IResolvable)

      public fun sizeConstraintStatement(sizeConstraintStatement: SizeConstraintStatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7e056dadbd994de72fd91374004889c8524a681d41c1fb4982bc6a82b7615f51")
      public
          fun sizeConstraintStatement(sizeConstraintStatement: SizeConstraintStatementProperty.Builder.() -> Unit)

      public fun sqliMatchStatement(sqliMatchStatement: IResolvable)

      public fun sqliMatchStatement(sqliMatchStatement: SqliMatchStatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5871b1ff410cd7657df759ecff15b8f8bb8be9361439eebbfc5f0a5669ac7243")
      public
          fun sqliMatchStatement(sqliMatchStatement: SqliMatchStatementProperty.Builder.() -> Unit)

      public fun xssMatchStatement(xssMatchStatement: IResolvable)

      public fun xssMatchStatement(xssMatchStatement: XssMatchStatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f589bb416c23c2b2add334435b9775e8dfd3ff5f836689b40cfe4b9cee6ec060")
      public fun xssMatchStatement(xssMatchStatement: XssMatchStatementProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.StatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.StatementProperty.builder()

      override fun andStatement(andStatement: IResolvable) {
        cdkBuilder.andStatement(andStatement.let(IResolvable::unwrap))
      }

      override fun andStatement(andStatement: AndStatementProperty) {
        cdkBuilder.andStatement(andStatement.let(AndStatementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0faf91fb3e60ba2aaa4f4a1d4b756e124092f1de837c505a2571fb537fbb55dd")
      override fun andStatement(andStatement: AndStatementProperty.Builder.() -> Unit): Unit =
          andStatement(AndStatementProperty(andStatement))

      override fun byteMatchStatement(byteMatchStatement: IResolvable) {
        cdkBuilder.byteMatchStatement(byteMatchStatement.let(IResolvable::unwrap))
      }

      override fun byteMatchStatement(byteMatchStatement: ByteMatchStatementProperty) {
        cdkBuilder.byteMatchStatement(byteMatchStatement.let(ByteMatchStatementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("52725cb354f7e3372c32f5ea06bfbdd4b5f35f4c3f962de6148afc2ac73af50d")
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
      @JvmName("c27167e826cc53423d71271832dece9341e7d08dbcbc57d7f043237ba6026203")
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
      @JvmName("f7f25f805e1ec5eab5cc489c5de0e4d3a39195c9075d39742ba7fd3c366afaf5")
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
      @JvmName("cf323e95729aaaa3aa6707741d5085879fffa7192efd6e83a20bb68036b4efb1")
      override
          fun labelMatchStatement(labelMatchStatement: LabelMatchStatementProperty.Builder.() -> Unit):
          Unit = labelMatchStatement(LabelMatchStatementProperty(labelMatchStatement))

      override fun managedRuleGroupStatement(managedRuleGroupStatement: IResolvable) {
        cdkBuilder.managedRuleGroupStatement(managedRuleGroupStatement.let(IResolvable::unwrap))
      }

      override
          fun managedRuleGroupStatement(managedRuleGroupStatement: ManagedRuleGroupStatementProperty) {
        cdkBuilder.managedRuleGroupStatement(managedRuleGroupStatement.let(ManagedRuleGroupStatementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5a719c5448f0625ca8aab0db2d4425ca16fee5c369dbfc9fc0e69d3487a914a0")
      override
          fun managedRuleGroupStatement(managedRuleGroupStatement: ManagedRuleGroupStatementProperty.Builder.() -> Unit):
          Unit =
          managedRuleGroupStatement(ManagedRuleGroupStatementProperty(managedRuleGroupStatement))

      override fun notStatement(notStatement: IResolvable) {
        cdkBuilder.notStatement(notStatement.let(IResolvable::unwrap))
      }

      override fun notStatement(notStatement: NotStatementProperty) {
        cdkBuilder.notStatement(notStatement.let(NotStatementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82fa62752d3b1606eb2d90d3c718fdd0f63ad2d4361c2d300c90237c848fdf56")
      override fun notStatement(notStatement: NotStatementProperty.Builder.() -> Unit): Unit =
          notStatement(NotStatementProperty(notStatement))

      override fun orStatement(orStatement: IResolvable) {
        cdkBuilder.orStatement(orStatement.let(IResolvable::unwrap))
      }

      override fun orStatement(orStatement: OrStatementProperty) {
        cdkBuilder.orStatement(orStatement.let(OrStatementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3105c7b766ce6e25c9a977288c9f1f8f65ba0816b709fbd9980affac6115f543")
      override fun orStatement(orStatement: OrStatementProperty.Builder.() -> Unit): Unit =
          orStatement(OrStatementProperty(orStatement))

      override fun rateBasedStatement(rateBasedStatement: IResolvable) {
        cdkBuilder.rateBasedStatement(rateBasedStatement.let(IResolvable::unwrap))
      }

      override fun rateBasedStatement(rateBasedStatement: RateBasedStatementProperty) {
        cdkBuilder.rateBasedStatement(rateBasedStatement.let(RateBasedStatementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e40ad809c41b00cd5cda76a731c9890e14ee74d1af9bfa1a87304785963d93c6")
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
      @JvmName("00f98b13c8a141747b8f01bbaef239900f1ad89f42ab184cf3517c20f6b915cb")
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
      @JvmName("8a20b875a996965b24eee9d5c9cc63be10d7d576ac75c8dfa96b1ddd9899cdb6")
      override
          fun regexPatternSetReferenceStatement(regexPatternSetReferenceStatement: RegexPatternSetReferenceStatementProperty.Builder.() -> Unit):
          Unit =
          regexPatternSetReferenceStatement(RegexPatternSetReferenceStatementProperty(regexPatternSetReferenceStatement))

      override fun ruleGroupReferenceStatement(ruleGroupReferenceStatement: IResolvable) {
        cdkBuilder.ruleGroupReferenceStatement(ruleGroupReferenceStatement.let(IResolvable::unwrap))
      }

      override
          fun ruleGroupReferenceStatement(ruleGroupReferenceStatement: RuleGroupReferenceStatementProperty) {
        cdkBuilder.ruleGroupReferenceStatement(ruleGroupReferenceStatement.let(RuleGroupReferenceStatementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9119e54122bf8090ccc83df44678012d3204684de5b80b11b17af611c7179f08")
      override
          fun ruleGroupReferenceStatement(ruleGroupReferenceStatement: RuleGroupReferenceStatementProperty.Builder.() -> Unit):
          Unit =
          ruleGroupReferenceStatement(RuleGroupReferenceStatementProperty(ruleGroupReferenceStatement))

      override fun sizeConstraintStatement(sizeConstraintStatement: IResolvable) {
        cdkBuilder.sizeConstraintStatement(sizeConstraintStatement.let(IResolvable::unwrap))
      }

      override
          fun sizeConstraintStatement(sizeConstraintStatement: SizeConstraintStatementProperty) {
        cdkBuilder.sizeConstraintStatement(sizeConstraintStatement.let(SizeConstraintStatementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7e056dadbd994de72fd91374004889c8524a681d41c1fb4982bc6a82b7615f51")
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
      @JvmName("5871b1ff410cd7657df759ecff15b8f8bb8be9361439eebbfc5f0a5669ac7243")
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
      @JvmName("f589bb416c23c2b2add334435b9775e8dfd3ff5f836689b40cfe4b9cee6ec060")
      override
          fun xssMatchStatement(xssMatchStatement: XssMatchStatementProperty.Builder.() -> Unit):
          Unit = xssMatchStatement(XssMatchStatementProperty(xssMatchStatement))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.StatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.StatementProperty,
    ) : StatementProperty {
      override fun andStatement(): Any? = unwrap(this).getAndStatement()

      override fun byteMatchStatement(): Any? = unwrap(this).getByteMatchStatement()

      override fun geoMatchStatement(): Any? = unwrap(this).getGeoMatchStatement()

      override fun ipSetReferenceStatement(): Any? = unwrap(this).getIpSetReferenceStatement()

      override fun labelMatchStatement(): Any? = unwrap(this).getLabelMatchStatement()

      override fun managedRuleGroupStatement(): Any? = unwrap(this).getManagedRuleGroupStatement()

      override fun notStatement(): Any? = unwrap(this).getNotStatement()

      override fun orStatement(): Any? = unwrap(this).getOrStatement()

      override fun rateBasedStatement(): Any? = unwrap(this).getRateBasedStatement()

      override fun regexMatchStatement(): Any? = unwrap(this).getRegexMatchStatement()

      override fun regexPatternSetReferenceStatement(): Any? =
          unwrap(this).getRegexPatternSetReferenceStatement()

      override fun ruleGroupReferenceStatement(): Any? =
          unwrap(this).getRuleGroupReferenceStatement()

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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.StatementProperty):
          StatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.StatementProperty = (wrapped as
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.ImmunityTimePropertyProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.ImmunityTimePropertyProperty.builder()

      override fun immunityTime(immunityTime: Number) {
        cdkBuilder.immunityTime(immunityTime)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.ImmunityTimePropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ImmunityTimePropertyProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.ImmunityTimePropertyProperty):
          ImmunityTimePropertyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImmunityTimePropertyProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.ImmunityTimePropertyProperty = (wrapped as
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.LabelMatchStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.LabelMatchStatementProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun scope(scope: String) {
        cdkBuilder.scope(scope)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.LabelMatchStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.LabelMatchStatementProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.LabelMatchStatementProperty):
          LabelMatchStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LabelMatchStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.LabelMatchStatementProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AWSManagedRulesBotControlRuleSetProperty {
    public fun enableMachineLearning(): Any? = unwrap(this).getEnableMachineLearning()

    public fun inspectionLevel(): String

    public interface Builder {
      public fun enableMachineLearning(enableMachineLearning: Boolean)

      public fun enableMachineLearning(enableMachineLearning: IResolvable)

      public fun inspectionLevel(inspectionLevel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesBotControlRuleSetProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesBotControlRuleSetProperty.builder()

      override fun enableMachineLearning(enableMachineLearning: Boolean) {
        cdkBuilder.enableMachineLearning(enableMachineLearning)
      }

      override fun enableMachineLearning(enableMachineLearning: IResolvable) {
        cdkBuilder.enableMachineLearning(enableMachineLearning.let(IResolvable::unwrap))
      }

      override fun inspectionLevel(inspectionLevel: String) {
        cdkBuilder.inspectionLevel(inspectionLevel)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesBotControlRuleSetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesBotControlRuleSetProperty,
    ) : AWSManagedRulesBotControlRuleSetProperty {
      override fun enableMachineLearning(): Any? = unwrap(this).getEnableMachineLearning()

      override fun inspectionLevel(): String = unwrap(this).getInspectionLevel()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AWSManagedRulesBotControlRuleSetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesBotControlRuleSetProperty):
          AWSManagedRulesBotControlRuleSetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AWSManagedRulesBotControlRuleSetProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesBotControlRuleSetProperty =
          (wrapped as Wrapper).cdkObject
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

      public fun customKeys(vararg customKeys: Any)

      public fun forwardedIpConfig(forwardedIpConfig: IResolvable)

      public fun forwardedIpConfig(forwardedIpConfig: ForwardedIPConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("413c601ab4cfa0ccad1cfc36ae71188d16d4a2f0ee58cf283b613e7b1ce5849b")
      public
          fun forwardedIpConfig(forwardedIpConfig: ForwardedIPConfigurationProperty.Builder.() -> Unit)

      public fun limit(limit: Number)

      public fun scopeDownStatement(scopeDownStatement: IResolvable)

      public fun scopeDownStatement(scopeDownStatement: StatementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95214fa635e2431173880cad1ff682c6cc031d9911d64db20aa113bb7b1d53f8")
      public fun scopeDownStatement(scopeDownStatement: StatementProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateBasedStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateBasedStatementProperty.builder()

      override fun aggregateKeyType(aggregateKeyType: String) {
        cdkBuilder.aggregateKeyType(aggregateKeyType)
      }

      override fun customKeys(customKeys: IResolvable) {
        cdkBuilder.customKeys(customKeys.let(IResolvable::unwrap))
      }

      override fun customKeys(customKeys: List<Any>) {
        cdkBuilder.customKeys(customKeys)
      }

      override fun customKeys(vararg customKeys: Any): Unit = customKeys(customKeys.toList())

      override fun forwardedIpConfig(forwardedIpConfig: IResolvable) {
        cdkBuilder.forwardedIpConfig(forwardedIpConfig.let(IResolvable::unwrap))
      }

      override fun forwardedIpConfig(forwardedIpConfig: ForwardedIPConfigurationProperty) {
        cdkBuilder.forwardedIpConfig(forwardedIpConfig.let(ForwardedIPConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("413c601ab4cfa0ccad1cfc36ae71188d16d4a2f0ee58cf283b613e7b1ce5849b")
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
      @JvmName("95214fa635e2431173880cad1ff682c6cc031d9911d64db20aa113bb7b1d53f8")
      override fun scopeDownStatement(scopeDownStatement: StatementProperty.Builder.() -> Unit):
          Unit = scopeDownStatement(StatementProperty(scopeDownStatement))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.RateBasedStatementProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateBasedStatementProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RateBasedStatementProperty):
          RateBasedStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateBasedStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateBasedStatementProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AssociationConfigProperty {
    public fun requestBody(): Any? = unwrap(this).getRequestBody()

    public interface Builder {
      public fun requestBody(requestBody: IResolvable)

      public fun requestBody(requestBody: Map<String, Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.AssociationConfigProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.AssociationConfigProperty.builder()

      override fun requestBody(requestBody: IResolvable) {
        cdkBuilder.requestBody(requestBody.let(IResolvable::unwrap))
      }

      override fun requestBody(requestBody: Map<String, Any>) {
        cdkBuilder.requestBody(requestBody)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.AssociationConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.AssociationConfigProperty,
    ) : AssociationConfigProperty {
      override fun requestBody(): Any? = unwrap(this).getRequestBody()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AssociationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.AssociationConfigProperty):
          AssociationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssociationConfigProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.AssociationConfigProperty = (wrapped as
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

      public fun responseHeaders(vararg responseHeaders: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseProperty.builder()

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

      override fun responseHeaders(vararg responseHeaders: Any): Unit =
          responseHeaders(responseHeaders.toList())

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseProperty):
          CustomResponseProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomResponseProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ResponseInspectionProperty {
    public fun bodyContains(): Any? = unwrap(this).getBodyContains()

    public fun `header`(): Any? = unwrap(this).getHeader()

    public fun json(): Any? = unwrap(this).getJson()

    public fun statusCode(): Any? = unwrap(this).getStatusCode()

    public interface Builder {
      public fun bodyContains(bodyContains: IResolvable)

      public fun bodyContains(bodyContains: ResponseInspectionBodyContainsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("579a2402e1179cb3321d4ea74f0d0acf1709b24de91e5ad70dbef817edafd53d")
      public
          fun bodyContains(bodyContains: ResponseInspectionBodyContainsProperty.Builder.() -> Unit)

      public fun `header`(`header`: IResolvable)

      public fun `header`(`header`: ResponseInspectionHeaderProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8f6d5e61b21402129c02ef59326ecd89e4b14b1b0f198c7e10cab958fcbf8fd9")
      public fun `header`(`header`: ResponseInspectionHeaderProperty.Builder.() -> Unit)

      public fun json(json: IResolvable)

      public fun json(json: ResponseInspectionJsonProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("34451c83e85bf74f1f04b00f77762465d5133af1d26a3a260fe2f1d91171cfe4")
      public fun json(json: ResponseInspectionJsonProperty.Builder.() -> Unit)

      public fun statusCode(statusCode: IResolvable)

      public fun statusCode(statusCode: ResponseInspectionStatusCodeProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8cb4f11f76c069ee5771ac3abcd7b620f2e486c50cb6202675d399a44413610")
      public fun statusCode(statusCode: ResponseInspectionStatusCodeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionProperty.builder()

      override fun bodyContains(bodyContains: IResolvable) {
        cdkBuilder.bodyContains(bodyContains.let(IResolvable::unwrap))
      }

      override fun bodyContains(bodyContains: ResponseInspectionBodyContainsProperty) {
        cdkBuilder.bodyContains(bodyContains.let(ResponseInspectionBodyContainsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("579a2402e1179cb3321d4ea74f0d0acf1709b24de91e5ad70dbef817edafd53d")
      override
          fun bodyContains(bodyContains: ResponseInspectionBodyContainsProperty.Builder.() -> Unit):
          Unit = bodyContains(ResponseInspectionBodyContainsProperty(bodyContains))

      override fun `header`(`header`: IResolvable) {
        cdkBuilder.`header`(`header`.let(IResolvable::unwrap))
      }

      override fun `header`(`header`: ResponseInspectionHeaderProperty) {
        cdkBuilder.`header`(`header`.let(ResponseInspectionHeaderProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8f6d5e61b21402129c02ef59326ecd89e4b14b1b0f198c7e10cab958fcbf8fd9")
      override fun `header`(`header`: ResponseInspectionHeaderProperty.Builder.() -> Unit): Unit =
          `header`(ResponseInspectionHeaderProperty(`header`))

      override fun json(json: IResolvable) {
        cdkBuilder.json(json.let(IResolvable::unwrap))
      }

      override fun json(json: ResponseInspectionJsonProperty) {
        cdkBuilder.json(json.let(ResponseInspectionJsonProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("34451c83e85bf74f1f04b00f77762465d5133af1d26a3a260fe2f1d91171cfe4")
      override fun json(json: ResponseInspectionJsonProperty.Builder.() -> Unit): Unit =
          json(ResponseInspectionJsonProperty(json))

      override fun statusCode(statusCode: IResolvable) {
        cdkBuilder.statusCode(statusCode.let(IResolvable::unwrap))
      }

      override fun statusCode(statusCode: ResponseInspectionStatusCodeProperty) {
        cdkBuilder.statusCode(statusCode.let(ResponseInspectionStatusCodeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8cb4f11f76c069ee5771ac3abcd7b620f2e486c50cb6202675d399a44413610")
      override fun statusCode(statusCode: ResponseInspectionStatusCodeProperty.Builder.() -> Unit):
          Unit = statusCode(ResponseInspectionStatusCodeProperty(statusCode))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionProperty,
    ) : ResponseInspectionProperty {
      override fun bodyContains(): Any? = unwrap(this).getBodyContains()

      override fun `header`(): Any? = unwrap(this).getHeader()

      override fun json(): Any? = unwrap(this).getJson()

      override fun statusCode(): Any? = unwrap(this).getStatusCode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResponseInspectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionProperty):
          ResponseInspectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResponseInspectionProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FieldIdentifierProperty {
    public fun identifier(): String

    public interface Builder {
      public fun identifier(identifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.FieldIdentifierProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.FieldIdentifierProperty.builder()

      override fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.FieldIdentifierProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.FieldIdentifierProperty,
    ) : FieldIdentifierProperty {
      override fun identifier(): String = unwrap(this).getIdentifier()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FieldIdentifierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.FieldIdentifierProperty):
          FieldIdentifierProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldIdentifierProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.FieldIdentifierProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CustomRequestHandlingProperty {
    public fun insertHeaders(): Any

    public interface Builder {
      public fun insertHeaders(insertHeaders: IResolvable)

      public fun insertHeaders(insertHeaders: List<Any>)

      public fun insertHeaders(vararg insertHeaders: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomRequestHandlingProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomRequestHandlingProperty.builder()

      override fun insertHeaders(insertHeaders: IResolvable) {
        cdkBuilder.insertHeaders(insertHeaders.let(IResolvable::unwrap))
      }

      override fun insertHeaders(insertHeaders: List<Any>) {
        cdkBuilder.insertHeaders(insertHeaders)
      }

      override fun insertHeaders(vararg insertHeaders: Any): Unit =
          insertHeaders(insertHeaders.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomRequestHandlingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomRequestHandlingProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.CustomRequestHandlingProperty):
          CustomRequestHandlingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomRequestHandlingProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomRequestHandlingProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
