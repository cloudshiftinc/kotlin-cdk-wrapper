package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEmailIdentity internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ses.CfnEmailIdentity,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrDkimDnsTokenName1(): String = unwrap(this).getAttrDkimDnsTokenName1()

  public open fun attrDkimDnsTokenName2(): String = unwrap(this).getAttrDkimDnsTokenName2()

  public open fun attrDkimDnsTokenName3(): String = unwrap(this).getAttrDkimDnsTokenName3()

  public open fun attrDkimDnsTokenValue1(): String = unwrap(this).getAttrDkimDnsTokenValue1()

  public open fun attrDkimDnsTokenValue2(): String = unwrap(this).getAttrDkimDnsTokenValue2()

  public open fun attrDkimDnsTokenValue3(): String = unwrap(this).getAttrDkimDnsTokenValue3()

  public open fun configurationSetAttributes(): Any? = unwrap(this).getConfigurationSetAttributes()

  public open fun configurationSetAttributes(`value`: IResolvable) {
    unwrap(this).setConfigurationSetAttributes(`value`.let(IResolvable::unwrap))
  }

  public open fun configurationSetAttributes(`value`: ConfigurationSetAttributesProperty) {
    unwrap(this).setConfigurationSetAttributes(`value`.let(ConfigurationSetAttributesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("82e433553b0973806b555d911861fb6798c9eac9a286a6a2f5340a46d0a534e2")
  public open
      fun configurationSetAttributes(`value`: ConfigurationSetAttributesProperty.Builder.() -> Unit):
      Unit = configurationSetAttributes(ConfigurationSetAttributesProperty(`value`))

  public open fun dkimAttributes(): Any? = unwrap(this).getDkimAttributes()

  public open fun dkimAttributes(`value`: IResolvable) {
    unwrap(this).setDkimAttributes(`value`.let(IResolvable::unwrap))
  }

  public open fun dkimAttributes(`value`: DkimAttributesProperty) {
    unwrap(this).setDkimAttributes(`value`.let(DkimAttributesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e6bee2a8290297b0c5e73906c77f9d2642298b0cdf78c643c1c5ce52a1ab3f13")
  public open fun dkimAttributes(`value`: DkimAttributesProperty.Builder.() -> Unit): Unit =
      dkimAttributes(DkimAttributesProperty(`value`))

  public open fun dkimSigningAttributes(): Any? = unwrap(this).getDkimSigningAttributes()

  public open fun dkimSigningAttributes(`value`: IResolvable) {
    unwrap(this).setDkimSigningAttributes(`value`.let(IResolvable::unwrap))
  }

  public open fun dkimSigningAttributes(`value`: DkimSigningAttributesProperty) {
    unwrap(this).setDkimSigningAttributes(`value`.let(DkimSigningAttributesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1539c2c47cc40bc571dfa6bf2e15cb17fa45e57196e954e1a4fe1a550e4fa1e9")
  public open fun dkimSigningAttributes(`value`: DkimSigningAttributesProperty.Builder.() -> Unit):
      Unit = dkimSigningAttributes(DkimSigningAttributesProperty(`value`))

  public open fun emailIdentity(): String = unwrap(this).getEmailIdentity()

  public open fun emailIdentity(`value`: String) {
    unwrap(this).setEmailIdentity(`value`)
  }

  public open fun feedbackAttributes(): Any? = unwrap(this).getFeedbackAttributes()

  public open fun feedbackAttributes(`value`: IResolvable) {
    unwrap(this).setFeedbackAttributes(`value`.let(IResolvable::unwrap))
  }

  public open fun feedbackAttributes(`value`: FeedbackAttributesProperty) {
    unwrap(this).setFeedbackAttributes(`value`.let(FeedbackAttributesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("78874ec7611f5d29c3e9e9ff17449907f686c40c02bae65cb0069198e45238a7")
  public open fun feedbackAttributes(`value`: FeedbackAttributesProperty.Builder.() -> Unit): Unit =
      feedbackAttributes(FeedbackAttributesProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun mailFromAttributes(): Any? = unwrap(this).getMailFromAttributes()

  public open fun mailFromAttributes(`value`: IResolvable) {
    unwrap(this).setMailFromAttributes(`value`.let(IResolvable::unwrap))
  }

  public open fun mailFromAttributes(`value`: MailFromAttributesProperty) {
    unwrap(this).setMailFromAttributes(`value`.let(MailFromAttributesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("db90099dfd258d7a57903760d38577b65e630ac72937a3f8cade518e54382275")
  public open fun mailFromAttributes(`value`: MailFromAttributesProperty.Builder.() -> Unit): Unit =
      mailFromAttributes(MailFromAttributesProperty(`value`))

  public interface Builder {
    public fun configurationSetAttributes(configurationSetAttributes: IResolvable) {
    }

    public
        fun configurationSetAttributes(configurationSetAttributes: ConfigurationSetAttributesProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ffd732bc38e8a9a9931b828a2f24ca4cabe7d304286618ff28817e5584ce2ef5")
    public
        fun configurationSetAttributes(configurationSetAttributes: ConfigurationSetAttributesProperty.Builder.() -> Unit) {
    }

    public fun dkimAttributes(dkimAttributes: IResolvable) {
    }

    public fun dkimAttributes(dkimAttributes: DkimAttributesProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18881700a5539a5cba94fe287dcc39baa1b925439dbb5bd08a36d66b8d2af706")
    public fun dkimAttributes(dkimAttributes: DkimAttributesProperty.Builder.() -> Unit) {
    }

    public fun dkimSigningAttributes(dkimSigningAttributes: IResolvable) {
    }

    public fun dkimSigningAttributes(dkimSigningAttributes: DkimSigningAttributesProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0dc9de9a7cd51baeddf84a283c353afab9d9b5c688a3693de80758c6c6834fee")
    public
        fun dkimSigningAttributes(dkimSigningAttributes: DkimSigningAttributesProperty.Builder.() -> Unit) {
    }

    public fun emailIdentity(emailIdentity: String) {
    }

    public fun feedbackAttributes(feedbackAttributes: IResolvable) {
    }

    public fun feedbackAttributes(feedbackAttributes: FeedbackAttributesProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6001f91ab44b70b5e6ca308eb64654f5701fd36f86cd4ea6d866b8bf460ab8e2")
    public
        fun feedbackAttributes(feedbackAttributes: FeedbackAttributesProperty.Builder.() -> Unit) {
    }

    public fun mailFromAttributes(mailFromAttributes: IResolvable) {
    }

    public fun mailFromAttributes(mailFromAttributes: MailFromAttributesProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36c483098983e40c937de7187d3738ec856f1c4fef00108fbe31ab20c972c029")
    public
        fun mailFromAttributes(mailFromAttributes: MailFromAttributesProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnEmailIdentity.Builder =
        software.amazon.awscdk.services.ses.CfnEmailIdentity.Builder.create(scope, id)

    public override fun configurationSetAttributes(configurationSetAttributes: IResolvable) {
      cdkBuilder.configurationSetAttributes(configurationSetAttributes.let(IResolvable::unwrap))
    }

    public override
        fun configurationSetAttributes(configurationSetAttributes: ConfigurationSetAttributesProperty) {
      cdkBuilder.configurationSetAttributes(configurationSetAttributes.let(ConfigurationSetAttributesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ffd732bc38e8a9a9931b828a2f24ca4cabe7d304286618ff28817e5584ce2ef5")
    public override
        fun configurationSetAttributes(configurationSetAttributes: ConfigurationSetAttributesProperty.Builder.() -> Unit):
        Unit =
        configurationSetAttributes(ConfigurationSetAttributesProperty(configurationSetAttributes))

    public override fun dkimAttributes(dkimAttributes: IResolvable) {
      cdkBuilder.dkimAttributes(dkimAttributes.let(IResolvable::unwrap))
    }

    public override fun dkimAttributes(dkimAttributes: DkimAttributesProperty) {
      cdkBuilder.dkimAttributes(dkimAttributes.let(DkimAttributesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18881700a5539a5cba94fe287dcc39baa1b925439dbb5bd08a36d66b8d2af706")
    public override fun dkimAttributes(dkimAttributes: DkimAttributesProperty.Builder.() -> Unit):
        Unit = dkimAttributes(DkimAttributesProperty(dkimAttributes))

    public override fun dkimSigningAttributes(dkimSigningAttributes: IResolvable) {
      cdkBuilder.dkimSigningAttributes(dkimSigningAttributes.let(IResolvable::unwrap))
    }

    public override
        fun dkimSigningAttributes(dkimSigningAttributes: DkimSigningAttributesProperty) {
      cdkBuilder.dkimSigningAttributes(dkimSigningAttributes.let(DkimSigningAttributesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0dc9de9a7cd51baeddf84a283c353afab9d9b5c688a3693de80758c6c6834fee")
    public override
        fun dkimSigningAttributes(dkimSigningAttributes: DkimSigningAttributesProperty.Builder.() -> Unit):
        Unit = dkimSigningAttributes(DkimSigningAttributesProperty(dkimSigningAttributes))

    public override fun emailIdentity(emailIdentity: String) {
      cdkBuilder.emailIdentity(emailIdentity)
    }

    public override fun feedbackAttributes(feedbackAttributes: IResolvable) {
      cdkBuilder.feedbackAttributes(feedbackAttributes.let(IResolvable::unwrap))
    }

    public override fun feedbackAttributes(feedbackAttributes: FeedbackAttributesProperty) {
      cdkBuilder.feedbackAttributes(feedbackAttributes.let(FeedbackAttributesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6001f91ab44b70b5e6ca308eb64654f5701fd36f86cd4ea6d866b8bf460ab8e2")
    public override
        fun feedbackAttributes(feedbackAttributes: FeedbackAttributesProperty.Builder.() -> Unit):
        Unit = feedbackAttributes(FeedbackAttributesProperty(feedbackAttributes))

    public override fun mailFromAttributes(mailFromAttributes: IResolvable) {
      cdkBuilder.mailFromAttributes(mailFromAttributes.let(IResolvable::unwrap))
    }

    public override fun mailFromAttributes(mailFromAttributes: MailFromAttributesProperty) {
      cdkBuilder.mailFromAttributes(mailFromAttributes.let(MailFromAttributesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36c483098983e40c937de7187d3738ec856f1c4fef00108fbe31ab20c972c029")
    public override
        fun mailFromAttributes(mailFromAttributes: MailFromAttributesProperty.Builder.() -> Unit):
        Unit = mailFromAttributes(MailFromAttributesProperty(mailFromAttributes))

    public fun build(): software.amazon.awscdk.services.ses.CfnEmailIdentity = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEmailIdentity {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEmailIdentity(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnEmailIdentity):
        CfnEmailIdentity = CfnEmailIdentity(cdkObject)

    internal fun unwrap(wrapped: CfnEmailIdentity):
        software.amazon.awscdk.services.ses.CfnEmailIdentity = wrapped.cdkObject
  }

  public interface FeedbackAttributesProperty {
    public fun emailForwardingEnabled(): Any? = unwrap(this).getEmailForwardingEnabled()

    public interface Builder {
      public fun emailForwardingEnabled(emailForwardingEnabled: Boolean) {
      }

      public fun emailForwardingEnabled(emailForwardingEnabled: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnEmailIdentity.FeedbackAttributesProperty.Builder =
          software.amazon.awscdk.services.ses.CfnEmailIdentity.FeedbackAttributesProperty.builder()

      public override fun emailForwardingEnabled(emailForwardingEnabled: Boolean) {
        cdkBuilder.emailForwardingEnabled(emailForwardingEnabled)
      }

      public override fun emailForwardingEnabled(emailForwardingEnabled: IResolvable) {
        cdkBuilder.emailForwardingEnabled(emailForwardingEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnEmailIdentity.FeedbackAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ses.CfnEmailIdentity.FeedbackAttributesProperty,
    ) : FeedbackAttributesProperty {
      public override fun emailForwardingEnabled(): Any? = unwrap(this).getEmailForwardingEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FeedbackAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnEmailIdentity.FeedbackAttributesProperty):
          FeedbackAttributesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FeedbackAttributesProperty):
          software.amazon.awscdk.services.ses.CfnEmailIdentity.FeedbackAttributesProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface MailFromAttributesProperty {
    public fun behaviorOnMxFailure(): String? = unwrap(this).getBehaviorOnMxFailure()

    public fun mailFromDomain(): String? = unwrap(this).getMailFromDomain()

    public interface Builder {
      public fun behaviorOnMxFailure(behaviorOnMxFailure: String) {
      }

      public fun mailFromDomain(mailFromDomain: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnEmailIdentity.MailFromAttributesProperty.Builder =
          software.amazon.awscdk.services.ses.CfnEmailIdentity.MailFromAttributesProperty.builder()

      public override fun behaviorOnMxFailure(behaviorOnMxFailure: String) {
        cdkBuilder.behaviorOnMxFailure(behaviorOnMxFailure)
      }

      public override fun mailFromDomain(mailFromDomain: String) {
        cdkBuilder.mailFromDomain(mailFromDomain)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnEmailIdentity.MailFromAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ses.CfnEmailIdentity.MailFromAttributesProperty,
    ) : MailFromAttributesProperty {
      public override fun behaviorOnMxFailure(): String? = unwrap(this).getBehaviorOnMxFailure()

      public override fun mailFromDomain(): String? = unwrap(this).getMailFromDomain()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MailFromAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnEmailIdentity.MailFromAttributesProperty):
          MailFromAttributesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MailFromAttributesProperty):
          software.amazon.awscdk.services.ses.CfnEmailIdentity.MailFromAttributesProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface DkimSigningAttributesProperty {
    public fun domainSigningPrivateKey(): String? = unwrap(this).getDomainSigningPrivateKey()

    public fun domainSigningSelector(): String? = unwrap(this).getDomainSigningSelector()

    public fun nextSigningKeyLength(): String? = unwrap(this).getNextSigningKeyLength()

    public interface Builder {
      public fun domainSigningPrivateKey(domainSigningPrivateKey: String) {
      }

      public fun domainSigningSelector(domainSigningSelector: String) {
      }

      public fun nextSigningKeyLength(nextSigningKeyLength: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnEmailIdentity.DkimSigningAttributesProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnEmailIdentity.DkimSigningAttributesProperty.builder()

      public override fun domainSigningPrivateKey(domainSigningPrivateKey: String) {
        cdkBuilder.domainSigningPrivateKey(domainSigningPrivateKey)
      }

      public override fun domainSigningSelector(domainSigningSelector: String) {
        cdkBuilder.domainSigningSelector(domainSigningSelector)
      }

      public override fun nextSigningKeyLength(nextSigningKeyLength: String) {
        cdkBuilder.nextSigningKeyLength(nextSigningKeyLength)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnEmailIdentity.DkimSigningAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ses.CfnEmailIdentity.DkimSigningAttributesProperty,
    ) : DkimSigningAttributesProperty {
      public override fun domainSigningPrivateKey(): String? =
          unwrap(this).getDomainSigningPrivateKey()

      public override fun domainSigningSelector(): String? = unwrap(this).getDomainSigningSelector()

      public override fun nextSigningKeyLength(): String? = unwrap(this).getNextSigningKeyLength()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DkimSigningAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnEmailIdentity.DkimSigningAttributesProperty):
          DkimSigningAttributesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DkimSigningAttributesProperty):
          software.amazon.awscdk.services.ses.CfnEmailIdentity.DkimSigningAttributesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConfigurationSetAttributesProperty {
    public fun configurationSetName(): String? = unwrap(this).getConfigurationSetName()

    public interface Builder {
      public fun configurationSetName(configurationSetName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnEmailIdentity.ConfigurationSetAttributesProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnEmailIdentity.ConfigurationSetAttributesProperty.builder()

      public override fun configurationSetName(configurationSetName: String) {
        cdkBuilder.configurationSetName(configurationSetName)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnEmailIdentity.ConfigurationSetAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ses.CfnEmailIdentity.ConfigurationSetAttributesProperty,
    ) : ConfigurationSetAttributesProperty {
      public override fun configurationSetName(): String? = unwrap(this).getConfigurationSetName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfigurationSetAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnEmailIdentity.ConfigurationSetAttributesProperty):
          ConfigurationSetAttributesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationSetAttributesProperty):
          software.amazon.awscdk.services.ses.CfnEmailIdentity.ConfigurationSetAttributesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DkimAttributesProperty {
    public fun signingEnabled(): Any? = unwrap(this).getSigningEnabled()

    public interface Builder {
      public fun signingEnabled(signingEnabled: Boolean) {
      }

      public fun signingEnabled(signingEnabled: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnEmailIdentity.DkimAttributesProperty.Builder =
          software.amazon.awscdk.services.ses.CfnEmailIdentity.DkimAttributesProperty.builder()

      public override fun signingEnabled(signingEnabled: Boolean) {
        cdkBuilder.signingEnabled(signingEnabled)
      }

      public override fun signingEnabled(signingEnabled: IResolvable) {
        cdkBuilder.signingEnabled(signingEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnEmailIdentity.DkimAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ses.CfnEmailIdentity.DkimAttributesProperty,
    ) : DkimAttributesProperty {
      public override fun signingEnabled(): Any? = unwrap(this).getSigningEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DkimAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnEmailIdentity.DkimAttributesProperty):
          DkimAttributesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DkimAttributesProperty):
          software.amazon.awscdk.services.ses.CfnEmailIdentity.DkimAttributesProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
