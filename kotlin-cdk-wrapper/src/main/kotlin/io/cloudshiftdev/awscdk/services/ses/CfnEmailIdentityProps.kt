@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnEmailIdentity`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * CfnEmailIdentityProps cfnEmailIdentityProps = CfnEmailIdentityProps.builder()
 * .emailIdentity("emailIdentity")
 * // the properties below are optional
 * .configurationSetAttributes(ConfigurationSetAttributesProperty.builder()
 * .configurationSetName("configurationSetName")
 * .build())
 * .dkimAttributes(DkimAttributesProperty.builder()
 * .signingEnabled(false)
 * .build())
 * .dkimSigningAttributes(DkimSigningAttributesProperty.builder()
 * .domainSigningPrivateKey("domainSigningPrivateKey")
 * .domainSigningSelector("domainSigningSelector")
 * .nextSigningKeyLength("nextSigningKeyLength")
 * .build())
 * .feedbackAttributes(FeedbackAttributesProperty.builder()
 * .emailForwardingEnabled(false)
 * .build())
 * .mailFromAttributes(MailFromAttributesProperty.builder()
 * .behaviorOnMxFailure("behaviorOnMxFailure")
 * .mailFromDomain("mailFromDomain")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html)
 */
public interface CfnEmailIdentityProps {
  /**
   * Used to associate a configuration set with an email identity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-configurationsetattributes)
   */
  public fun configurationSetAttributes(): Any? = unwrap(this).getConfigurationSetAttributes()

  /**
   * An object that contains information about the DKIM attributes for the identity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-dkimattributes)
   */
  public fun dkimAttributes(): Any? = unwrap(this).getDkimAttributes()

  /**
   * If your request includes this object, Amazon SES configures the identity to use Bring Your Own
   * DKIM (BYODKIM) for DKIM authentication purposes, or, configures the key length to be used for
   * [Easy DKIM](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html) .
   *
   * You can only specify this object if the email identity is a domain, as opposed to an address.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-dkimsigningattributes)
   */
  public fun dkimSigningAttributes(): Any? = unwrap(this).getDkimSigningAttributes()

  /**
   * The email address or domain to verify.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-emailidentity)
   */
  public fun emailIdentity(): String

  /**
   * Used to enable or disable feedback forwarding for an identity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-feedbackattributes)
   */
  public fun feedbackAttributes(): Any? = unwrap(this).getFeedbackAttributes()

  /**
   * Used to enable or disable the custom Mail-From domain configuration for an email identity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-mailfromattributes)
   */
  public fun mailFromAttributes(): Any? = unwrap(this).getMailFromAttributes()

  /**
   * A builder for [CfnEmailIdentityProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configurationSetAttributes Used to associate a configuration set with an email
     * identity.
     */
    public fun configurationSetAttributes(configurationSetAttributes: IResolvable)

    /**
     * @param configurationSetAttributes Used to associate a configuration set with an email
     * identity.
     */
    public
        fun configurationSetAttributes(configurationSetAttributes: CfnEmailIdentity.ConfigurationSetAttributesProperty)

    /**
     * @param configurationSetAttributes Used to associate a configuration set with an email
     * identity.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f79c0551c26332ab68009e8c603def793272e9da47e82b998087b197b20cda64")
    public
        fun configurationSetAttributes(configurationSetAttributes: CfnEmailIdentity.ConfigurationSetAttributesProperty.Builder.() -> Unit)

    /**
     * @param dkimAttributes An object that contains information about the DKIM attributes for the
     * identity.
     */
    public fun dkimAttributes(dkimAttributes: IResolvable)

    /**
     * @param dkimAttributes An object that contains information about the DKIM attributes for the
     * identity.
     */
    public fun dkimAttributes(dkimAttributes: CfnEmailIdentity.DkimAttributesProperty)

    /**
     * @param dkimAttributes An object that contains information about the DKIM attributes for the
     * identity.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4b8f93c3086e09b23260c198d5c511719cd3148cfdebaece6ff20486ffb55eab")
    public
        fun dkimAttributes(dkimAttributes: CfnEmailIdentity.DkimAttributesProperty.Builder.() -> Unit)

    /**
     * @param dkimSigningAttributes If your request includes this object, Amazon SES configures the
     * identity to use Bring Your Own DKIM (BYODKIM) for DKIM authentication purposes, or, configures
     * the key length to be used for [Easy
     * DKIM](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html) .
     * You can only specify this object if the email identity is a domain, as opposed to an address.
     */
    public fun dkimSigningAttributes(dkimSigningAttributes: IResolvable)

    /**
     * @param dkimSigningAttributes If your request includes this object, Amazon SES configures the
     * identity to use Bring Your Own DKIM (BYODKIM) for DKIM authentication purposes, or, configures
     * the key length to be used for [Easy
     * DKIM](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html) .
     * You can only specify this object if the email identity is a domain, as opposed to an address.
     */
    public
        fun dkimSigningAttributes(dkimSigningAttributes: CfnEmailIdentity.DkimSigningAttributesProperty)

    /**
     * @param dkimSigningAttributes If your request includes this object, Amazon SES configures the
     * identity to use Bring Your Own DKIM (BYODKIM) for DKIM authentication purposes, or, configures
     * the key length to be used for [Easy
     * DKIM](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html) .
     * You can only specify this object if the email identity is a domain, as opposed to an address.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("396e6f6aa49ce64ae88b2fb27f8886894ef43dfe2a0c5391da95f40a50d182ba")
    public
        fun dkimSigningAttributes(dkimSigningAttributes: CfnEmailIdentity.DkimSigningAttributesProperty.Builder.() -> Unit)

    /**
     * @param emailIdentity The email address or domain to verify. 
     */
    public fun emailIdentity(emailIdentity: String)

    /**
     * @param feedbackAttributes Used to enable or disable feedback forwarding for an identity.
     */
    public fun feedbackAttributes(feedbackAttributes: IResolvable)

    /**
     * @param feedbackAttributes Used to enable or disable feedback forwarding for an identity.
     */
    public fun feedbackAttributes(feedbackAttributes: CfnEmailIdentity.FeedbackAttributesProperty)

    /**
     * @param feedbackAttributes Used to enable or disable feedback forwarding for an identity.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("58c70d167d736a285d414e8614617fdbcffafd79fa440641a3490c47a1e664f0")
    public
        fun feedbackAttributes(feedbackAttributes: CfnEmailIdentity.FeedbackAttributesProperty.Builder.() -> Unit)

    /**
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     * for an email identity.
     */
    public fun mailFromAttributes(mailFromAttributes: IResolvable)

    /**
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     * for an email identity.
     */
    public fun mailFromAttributes(mailFromAttributes: CfnEmailIdentity.MailFromAttributesProperty)

    /**
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     * for an email identity.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f22c3ba548bc4548c9912e85e0be8f501a84d586e0bab9834b68df4aff0753e")
    public
        fun mailFromAttributes(mailFromAttributes: CfnEmailIdentity.MailFromAttributesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnEmailIdentityProps.Builder =
        software.amazon.awscdk.services.ses.CfnEmailIdentityProps.builder()

    /**
     * @param configurationSetAttributes Used to associate a configuration set with an email
     * identity.
     */
    override fun configurationSetAttributes(configurationSetAttributes: IResolvable) {
      cdkBuilder.configurationSetAttributes(configurationSetAttributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param configurationSetAttributes Used to associate a configuration set with an email
     * identity.
     */
    override
        fun configurationSetAttributes(configurationSetAttributes: CfnEmailIdentity.ConfigurationSetAttributesProperty) {
      cdkBuilder.configurationSetAttributes(configurationSetAttributes.let(CfnEmailIdentity.ConfigurationSetAttributesProperty.Companion::unwrap))
    }

    /**
     * @param configurationSetAttributes Used to associate a configuration set with an email
     * identity.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f79c0551c26332ab68009e8c603def793272e9da47e82b998087b197b20cda64")
    override
        fun configurationSetAttributes(configurationSetAttributes: CfnEmailIdentity.ConfigurationSetAttributesProperty.Builder.() -> Unit):
        Unit =
        configurationSetAttributes(CfnEmailIdentity.ConfigurationSetAttributesProperty(configurationSetAttributes))

    /**
     * @param dkimAttributes An object that contains information about the DKIM attributes for the
     * identity.
     */
    override fun dkimAttributes(dkimAttributes: IResolvable) {
      cdkBuilder.dkimAttributes(dkimAttributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param dkimAttributes An object that contains information about the DKIM attributes for the
     * identity.
     */
    override fun dkimAttributes(dkimAttributes: CfnEmailIdentity.DkimAttributesProperty) {
      cdkBuilder.dkimAttributes(dkimAttributes.let(CfnEmailIdentity.DkimAttributesProperty.Companion::unwrap))
    }

    /**
     * @param dkimAttributes An object that contains information about the DKIM attributes for the
     * identity.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4b8f93c3086e09b23260c198d5c511719cd3148cfdebaece6ff20486ffb55eab")
    override
        fun dkimAttributes(dkimAttributes: CfnEmailIdentity.DkimAttributesProperty.Builder.() -> Unit):
        Unit = dkimAttributes(CfnEmailIdentity.DkimAttributesProperty(dkimAttributes))

    /**
     * @param dkimSigningAttributes If your request includes this object, Amazon SES configures the
     * identity to use Bring Your Own DKIM (BYODKIM) for DKIM authentication purposes, or, configures
     * the key length to be used for [Easy
     * DKIM](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html) .
     * You can only specify this object if the email identity is a domain, as opposed to an address.
     */
    override fun dkimSigningAttributes(dkimSigningAttributes: IResolvable) {
      cdkBuilder.dkimSigningAttributes(dkimSigningAttributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param dkimSigningAttributes If your request includes this object, Amazon SES configures the
     * identity to use Bring Your Own DKIM (BYODKIM) for DKIM authentication purposes, or, configures
     * the key length to be used for [Easy
     * DKIM](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html) .
     * You can only specify this object if the email identity is a domain, as opposed to an address.
     */
    override
        fun dkimSigningAttributes(dkimSigningAttributes: CfnEmailIdentity.DkimSigningAttributesProperty) {
      cdkBuilder.dkimSigningAttributes(dkimSigningAttributes.let(CfnEmailIdentity.DkimSigningAttributesProperty.Companion::unwrap))
    }

    /**
     * @param dkimSigningAttributes If your request includes this object, Amazon SES configures the
     * identity to use Bring Your Own DKIM (BYODKIM) for DKIM authentication purposes, or, configures
     * the key length to be used for [Easy
     * DKIM](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html) .
     * You can only specify this object if the email identity is a domain, as opposed to an address.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("396e6f6aa49ce64ae88b2fb27f8886894ef43dfe2a0c5391da95f40a50d182ba")
    override
        fun dkimSigningAttributes(dkimSigningAttributes: CfnEmailIdentity.DkimSigningAttributesProperty.Builder.() -> Unit):
        Unit =
        dkimSigningAttributes(CfnEmailIdentity.DkimSigningAttributesProperty(dkimSigningAttributes))

    /**
     * @param emailIdentity The email address or domain to verify. 
     */
    override fun emailIdentity(emailIdentity: String) {
      cdkBuilder.emailIdentity(emailIdentity)
    }

    /**
     * @param feedbackAttributes Used to enable or disable feedback forwarding for an identity.
     */
    override fun feedbackAttributes(feedbackAttributes: IResolvable) {
      cdkBuilder.feedbackAttributes(feedbackAttributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param feedbackAttributes Used to enable or disable feedback forwarding for an identity.
     */
    override
        fun feedbackAttributes(feedbackAttributes: CfnEmailIdentity.FeedbackAttributesProperty) {
      cdkBuilder.feedbackAttributes(feedbackAttributes.let(CfnEmailIdentity.FeedbackAttributesProperty.Companion::unwrap))
    }

    /**
     * @param feedbackAttributes Used to enable or disable feedback forwarding for an identity.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("58c70d167d736a285d414e8614617fdbcffafd79fa440641a3490c47a1e664f0")
    override
        fun feedbackAttributes(feedbackAttributes: CfnEmailIdentity.FeedbackAttributesProperty.Builder.() -> Unit):
        Unit = feedbackAttributes(CfnEmailIdentity.FeedbackAttributesProperty(feedbackAttributes))

    /**
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     * for an email identity.
     */
    override fun mailFromAttributes(mailFromAttributes: IResolvable) {
      cdkBuilder.mailFromAttributes(mailFromAttributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     * for an email identity.
     */
    override
        fun mailFromAttributes(mailFromAttributes: CfnEmailIdentity.MailFromAttributesProperty) {
      cdkBuilder.mailFromAttributes(mailFromAttributes.let(CfnEmailIdentity.MailFromAttributesProperty.Companion::unwrap))
    }

    /**
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     * for an email identity.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f22c3ba548bc4548c9912e85e0be8f501a84d586e0bab9834b68df4aff0753e")
    override
        fun mailFromAttributes(mailFromAttributes: CfnEmailIdentity.MailFromAttributesProperty.Builder.() -> Unit):
        Unit = mailFromAttributes(CfnEmailIdentity.MailFromAttributesProperty(mailFromAttributes))

    public fun build(): software.amazon.awscdk.services.ses.CfnEmailIdentityProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.CfnEmailIdentityProps,
  ) : CdkObject(cdkObject),
      CfnEmailIdentityProps {
    /**
     * Used to associate a configuration set with an email identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-configurationsetattributes)
     */
    override fun configurationSetAttributes(): Any? = unwrap(this).getConfigurationSetAttributes()

    /**
     * An object that contains information about the DKIM attributes for the identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-dkimattributes)
     */
    override fun dkimAttributes(): Any? = unwrap(this).getDkimAttributes()

    /**
     * If your request includes this object, Amazon SES configures the identity to use Bring Your
     * Own DKIM (BYODKIM) for DKIM authentication purposes, or, configures the key length to be used
     * for [Easy DKIM](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html) .
     *
     * You can only specify this object if the email identity is a domain, as opposed to an address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-dkimsigningattributes)
     */
    override fun dkimSigningAttributes(): Any? = unwrap(this).getDkimSigningAttributes()

    /**
     * The email address or domain to verify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-emailidentity)
     */
    override fun emailIdentity(): String = unwrap(this).getEmailIdentity()

    /**
     * Used to enable or disable feedback forwarding for an identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-feedbackattributes)
     */
    override fun feedbackAttributes(): Any? = unwrap(this).getFeedbackAttributes()

    /**
     * Used to enable or disable the custom Mail-From domain configuration for an email identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-mailfromattributes)
     */
    override fun mailFromAttributes(): Any? = unwrap(this).getMailFromAttributes()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEmailIdentityProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnEmailIdentityProps):
        CfnEmailIdentityProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEmailIdentityProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEmailIdentityProps):
        software.amazon.awscdk.services.ses.CfnEmailIdentityProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ses.CfnEmailIdentityProps
  }
}
