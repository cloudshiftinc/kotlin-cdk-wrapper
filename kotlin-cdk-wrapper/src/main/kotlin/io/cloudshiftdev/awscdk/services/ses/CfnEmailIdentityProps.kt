@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnEmailIdentityProps {
  public fun configurationSetAttributes(): Any? = unwrap(this).getConfigurationSetAttributes()

  public fun dkimAttributes(): Any? = unwrap(this).getDkimAttributes()

  public fun dkimSigningAttributes(): Any? = unwrap(this).getDkimSigningAttributes()

  public fun emailIdentity(): String

  public fun feedbackAttributes(): Any? = unwrap(this).getFeedbackAttributes()

  public fun mailFromAttributes(): Any? = unwrap(this).getMailFromAttributes()

  @CdkDslMarker
  public interface Builder {
    public fun configurationSetAttributes(configurationSetAttributes: IResolvable)

    public
        fun configurationSetAttributes(configurationSetAttributes: CfnEmailIdentity.ConfigurationSetAttributesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f79c0551c26332ab68009e8c603def793272e9da47e82b998087b197b20cda64")
    public
        fun configurationSetAttributes(configurationSetAttributes: CfnEmailIdentity.ConfigurationSetAttributesProperty.Builder.() -> Unit)

    public fun dkimAttributes(dkimAttributes: IResolvable)

    public fun dkimAttributes(dkimAttributes: CfnEmailIdentity.DkimAttributesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4b8f93c3086e09b23260c198d5c511719cd3148cfdebaece6ff20486ffb55eab")
    public
        fun dkimAttributes(dkimAttributes: CfnEmailIdentity.DkimAttributesProperty.Builder.() -> Unit)

    public fun dkimSigningAttributes(dkimSigningAttributes: IResolvable)

    public
        fun dkimSigningAttributes(dkimSigningAttributes: CfnEmailIdentity.DkimSigningAttributesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("396e6f6aa49ce64ae88b2fb27f8886894ef43dfe2a0c5391da95f40a50d182ba")
    public
        fun dkimSigningAttributes(dkimSigningAttributes: CfnEmailIdentity.DkimSigningAttributesProperty.Builder.() -> Unit)

    public fun emailIdentity(emailIdentity: String)

    public fun feedbackAttributes(feedbackAttributes: IResolvable)

    public fun feedbackAttributes(feedbackAttributes: CfnEmailIdentity.FeedbackAttributesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("58c70d167d736a285d414e8614617fdbcffafd79fa440641a3490c47a1e664f0")
    public
        fun feedbackAttributes(feedbackAttributes: CfnEmailIdentity.FeedbackAttributesProperty.Builder.() -> Unit)

    public fun mailFromAttributes(mailFromAttributes: IResolvable)

    public fun mailFromAttributes(mailFromAttributes: CfnEmailIdentity.MailFromAttributesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f22c3ba548bc4548c9912e85e0be8f501a84d586e0bab9834b68df4aff0753e")
    public
        fun mailFromAttributes(mailFromAttributes: CfnEmailIdentity.MailFromAttributesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnEmailIdentityProps.Builder =
        software.amazon.awscdk.services.ses.CfnEmailIdentityProps.builder()

    override fun configurationSetAttributes(configurationSetAttributes: IResolvable) {
      cdkBuilder.configurationSetAttributes(configurationSetAttributes.let(IResolvable::unwrap))
    }

    override
        fun configurationSetAttributes(configurationSetAttributes: CfnEmailIdentity.ConfigurationSetAttributesProperty) {
      cdkBuilder.configurationSetAttributes(configurationSetAttributes.let(CfnEmailIdentity.ConfigurationSetAttributesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f79c0551c26332ab68009e8c603def793272e9da47e82b998087b197b20cda64")
    override
        fun configurationSetAttributes(configurationSetAttributes: CfnEmailIdentity.ConfigurationSetAttributesProperty.Builder.() -> Unit):
        Unit =
        configurationSetAttributes(CfnEmailIdentity.ConfigurationSetAttributesProperty(configurationSetAttributes))

    override fun dkimAttributes(dkimAttributes: IResolvable) {
      cdkBuilder.dkimAttributes(dkimAttributes.let(IResolvable::unwrap))
    }

    override fun dkimAttributes(dkimAttributes: CfnEmailIdentity.DkimAttributesProperty) {
      cdkBuilder.dkimAttributes(dkimAttributes.let(CfnEmailIdentity.DkimAttributesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4b8f93c3086e09b23260c198d5c511719cd3148cfdebaece6ff20486ffb55eab")
    override
        fun dkimAttributes(dkimAttributes: CfnEmailIdentity.DkimAttributesProperty.Builder.() -> Unit):
        Unit = dkimAttributes(CfnEmailIdentity.DkimAttributesProperty(dkimAttributes))

    override fun dkimSigningAttributes(dkimSigningAttributes: IResolvable) {
      cdkBuilder.dkimSigningAttributes(dkimSigningAttributes.let(IResolvable::unwrap))
    }

    override
        fun dkimSigningAttributes(dkimSigningAttributes: CfnEmailIdentity.DkimSigningAttributesProperty) {
      cdkBuilder.dkimSigningAttributes(dkimSigningAttributes.let(CfnEmailIdentity.DkimSigningAttributesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("396e6f6aa49ce64ae88b2fb27f8886894ef43dfe2a0c5391da95f40a50d182ba")
    override
        fun dkimSigningAttributes(dkimSigningAttributes: CfnEmailIdentity.DkimSigningAttributesProperty.Builder.() -> Unit):
        Unit =
        dkimSigningAttributes(CfnEmailIdentity.DkimSigningAttributesProperty(dkimSigningAttributes))

    override fun emailIdentity(emailIdentity: String) {
      cdkBuilder.emailIdentity(emailIdentity)
    }

    override fun feedbackAttributes(feedbackAttributes: IResolvable) {
      cdkBuilder.feedbackAttributes(feedbackAttributes.let(IResolvable::unwrap))
    }

    override
        fun feedbackAttributes(feedbackAttributes: CfnEmailIdentity.FeedbackAttributesProperty) {
      cdkBuilder.feedbackAttributes(feedbackAttributes.let(CfnEmailIdentity.FeedbackAttributesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("58c70d167d736a285d414e8614617fdbcffafd79fa440641a3490c47a1e664f0")
    override
        fun feedbackAttributes(feedbackAttributes: CfnEmailIdentity.FeedbackAttributesProperty.Builder.() -> Unit):
        Unit = feedbackAttributes(CfnEmailIdentity.FeedbackAttributesProperty(feedbackAttributes))

    override fun mailFromAttributes(mailFromAttributes: IResolvable) {
      cdkBuilder.mailFromAttributes(mailFromAttributes.let(IResolvable::unwrap))
    }

    override
        fun mailFromAttributes(mailFromAttributes: CfnEmailIdentity.MailFromAttributesProperty) {
      cdkBuilder.mailFromAttributes(mailFromAttributes.let(CfnEmailIdentity.MailFromAttributesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f22c3ba548bc4548c9912e85e0be8f501a84d586e0bab9834b68df4aff0753e")
    override
        fun mailFromAttributes(mailFromAttributes: CfnEmailIdentity.MailFromAttributesProperty.Builder.() -> Unit):
        Unit = mailFromAttributes(CfnEmailIdentity.MailFromAttributesProperty(mailFromAttributes))

    public fun build(): software.amazon.awscdk.services.ses.CfnEmailIdentityProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.CfnEmailIdentityProps,
  ) : CdkObject(cdkObject), CfnEmailIdentityProps {
    override fun configurationSetAttributes(): Any? = unwrap(this).getConfigurationSetAttributes()

    override fun dkimAttributes(): Any? = unwrap(this).getDkimAttributes()

    override fun dkimSigningAttributes(): Any? = unwrap(this).getDkimSigningAttributes()

    override fun emailIdentity(): String = unwrap(this).getEmailIdentity()

    override fun feedbackAttributes(): Any? = unwrap(this).getFeedbackAttributes()

    override fun mailFromAttributes(): Any? = unwrap(this).getMailFromAttributes()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEmailIdentityProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnEmailIdentityProps):
        CfnEmailIdentityProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEmailIdentityProps):
        software.amazon.awscdk.services.ses.CfnEmailIdentityProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ses.CfnEmailIdentityProps
  }
}
