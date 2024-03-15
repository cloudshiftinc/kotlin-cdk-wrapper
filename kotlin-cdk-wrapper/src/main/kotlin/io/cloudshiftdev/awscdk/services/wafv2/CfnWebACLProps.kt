@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wafv2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnWebACLProps {
  public fun associationConfig(): Any? = unwrap(this).getAssociationConfig()

  public fun captchaConfig(): Any? = unwrap(this).getCaptchaConfig()

  public fun challengeConfig(): Any? = unwrap(this).getChallengeConfig()

  public fun customResponseBodies(): Any? = unwrap(this).getCustomResponseBodies()

  public fun defaultAction(): Any

  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String? = unwrap(this).getName()

  public fun rules(): Any? = unwrap(this).getRules()

  public fun scope(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun tokenDomains(): List<String> = unwrap(this).getTokenDomains() ?: emptyList()

  public fun visibilityConfig(): Any

  @CdkDslMarker
  public interface Builder {
    public fun associationConfig(associationConfig: IResolvable)

    public fun associationConfig(associationConfig: CfnWebACL.AssociationConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b8cd78ecacaca4f48f827e175e1953db05c9e8605918846e0d9d3a3b204c7513")
    public
        fun associationConfig(associationConfig: CfnWebACL.AssociationConfigProperty.Builder.() -> Unit)

    public fun captchaConfig(captchaConfig: IResolvable)

    public fun captchaConfig(captchaConfig: CfnWebACL.CaptchaConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a082b8fdbfb145d3bcbb32fb5c5ca0a41d12ef16b3c3e639930530f7ce809ac3")
    public fun captchaConfig(captchaConfig: CfnWebACL.CaptchaConfigProperty.Builder.() -> Unit)

    public fun challengeConfig(challengeConfig: IResolvable)

    public fun challengeConfig(challengeConfig: CfnWebACL.ChallengeConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d3fc351ef80e77884eef22e9259381bfc8f51f8c3097b25393523843aeb843b")
    public
        fun challengeConfig(challengeConfig: CfnWebACL.ChallengeConfigProperty.Builder.() -> Unit)

    public fun customResponseBodies(customResponseBodies: IResolvable)

    public fun customResponseBodies(customResponseBodies: Map<String, Any>)

    public fun defaultAction(defaultAction: IResolvable)

    public fun defaultAction(defaultAction: CfnWebACL.DefaultActionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d05b778cb848d1fc55db884e81f51735e0c6705e2757b7b3d150321cf2c5c57")
    public fun defaultAction(defaultAction: CfnWebACL.DefaultActionProperty.Builder.() -> Unit)

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

    public fun visibilityConfig(visibilityConfig: CfnWebACL.VisibilityConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c7dab37d83f1ee312ea342610680f60fab45da2e311969c6d30f9880156b2eb8")
    public
        fun visibilityConfig(visibilityConfig: CfnWebACL.VisibilityConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wafv2.CfnWebACLProps.Builder =
        software.amazon.awscdk.services.wafv2.CfnWebACLProps.builder()

    override fun associationConfig(associationConfig: IResolvable) {
      cdkBuilder.associationConfig(associationConfig.let(IResolvable::unwrap))
    }

    override fun associationConfig(associationConfig: CfnWebACL.AssociationConfigProperty) {
      cdkBuilder.associationConfig(associationConfig.let(CfnWebACL.AssociationConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b8cd78ecacaca4f48f827e175e1953db05c9e8605918846e0d9d3a3b204c7513")
    override
        fun associationConfig(associationConfig: CfnWebACL.AssociationConfigProperty.Builder.() -> Unit):
        Unit = associationConfig(CfnWebACL.AssociationConfigProperty(associationConfig))

    override fun captchaConfig(captchaConfig: IResolvable) {
      cdkBuilder.captchaConfig(captchaConfig.let(IResolvable::unwrap))
    }

    override fun captchaConfig(captchaConfig: CfnWebACL.CaptchaConfigProperty) {
      cdkBuilder.captchaConfig(captchaConfig.let(CfnWebACL.CaptchaConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a082b8fdbfb145d3bcbb32fb5c5ca0a41d12ef16b3c3e639930530f7ce809ac3")
    override fun captchaConfig(captchaConfig: CfnWebACL.CaptchaConfigProperty.Builder.() -> Unit):
        Unit = captchaConfig(CfnWebACL.CaptchaConfigProperty(captchaConfig))

    override fun challengeConfig(challengeConfig: IResolvable) {
      cdkBuilder.challengeConfig(challengeConfig.let(IResolvable::unwrap))
    }

    override fun challengeConfig(challengeConfig: CfnWebACL.ChallengeConfigProperty) {
      cdkBuilder.challengeConfig(challengeConfig.let(CfnWebACL.ChallengeConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d3fc351ef80e77884eef22e9259381bfc8f51f8c3097b25393523843aeb843b")
    override
        fun challengeConfig(challengeConfig: CfnWebACL.ChallengeConfigProperty.Builder.() -> Unit):
        Unit = challengeConfig(CfnWebACL.ChallengeConfigProperty(challengeConfig))

    override fun customResponseBodies(customResponseBodies: IResolvable) {
      cdkBuilder.customResponseBodies(customResponseBodies.let(IResolvable::unwrap))
    }

    override fun customResponseBodies(customResponseBodies: Map<String, Any>) {
      cdkBuilder.customResponseBodies(customResponseBodies)
    }

    override fun defaultAction(defaultAction: IResolvable) {
      cdkBuilder.defaultAction(defaultAction.let(IResolvable::unwrap))
    }

    override fun defaultAction(defaultAction: CfnWebACL.DefaultActionProperty) {
      cdkBuilder.defaultAction(defaultAction.let(CfnWebACL.DefaultActionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d05b778cb848d1fc55db884e81f51735e0c6705e2757b7b3d150321cf2c5c57")
    override fun defaultAction(defaultAction: CfnWebACL.DefaultActionProperty.Builder.() -> Unit):
        Unit = defaultAction(CfnWebACL.DefaultActionProperty(defaultAction))

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

    override fun visibilityConfig(visibilityConfig: CfnWebACL.VisibilityConfigProperty) {
      cdkBuilder.visibilityConfig(visibilityConfig.let(CfnWebACL.VisibilityConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c7dab37d83f1ee312ea342610680f60fab45da2e311969c6d30f9880156b2eb8")
    override
        fun visibilityConfig(visibilityConfig: CfnWebACL.VisibilityConfigProperty.Builder.() -> Unit):
        Unit = visibilityConfig(CfnWebACL.VisibilityConfigProperty(visibilityConfig))

    public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACLProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACLProps,
  ) : CdkObject(cdkObject), CfnWebACLProps {
    override fun associationConfig(): Any? = unwrap(this).getAssociationConfig()

    override fun captchaConfig(): Any? = unwrap(this).getCaptchaConfig()

    override fun challengeConfig(): Any? = unwrap(this).getChallengeConfig()

    override fun customResponseBodies(): Any? = unwrap(this).getCustomResponseBodies()

    override fun defaultAction(): Any = unwrap(this).getDefaultAction()

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String? = unwrap(this).getName()

    override fun rules(): Any? = unwrap(this).getRules()

    override fun scope(): String = unwrap(this).getScope()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun tokenDomains(): List<String> = unwrap(this).getTokenDomains() ?: emptyList()

    override fun visibilityConfig(): Any = unwrap(this).getVisibilityConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWebACLProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACLProps):
        CfnWebACLProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWebACLProps):
        software.amazon.awscdk.services.wafv2.CfnWebACLProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.wafv2.CfnWebACLProps
  }
}
