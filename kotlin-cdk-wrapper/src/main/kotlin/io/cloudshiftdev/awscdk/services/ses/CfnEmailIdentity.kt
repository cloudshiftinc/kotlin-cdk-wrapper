@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies an identity for using within SES.
 *
 * An identity is an email address or domain that you use when you send email. Before you can use an
 * identity to send email, you first have to verify it. By verifying an identity, you demonstrate that
 * you're the owner of the identity, and that you've given Amazon SES API v2 permission to send email
 * from the identity.
 *
 * When you verify an email address, SES sends an email to the address. Your email address is
 * verified as soon as you follow the link in the verification email. When you verify a domain without
 * specifying the `DkimSigningAttributes` properties, OR only the `NextSigningKeyLength` property of
 * `DkimSigningAttributes` , this resource provides a set of CNAME token names and values (
 * *DkimDNSTokenName1* , *DkimDNSTokenValue1* , *DkimDNSTokenName2* , *DkimDNSTokenValue2* ,
 * *DkimDNSTokenName3* , *DkimDNSTokenValue3* ) as outputs. You can then add these to the DNS
 * configuration for your domain. Your domain is verified when Amazon SES detects these records in the
 * DNS configuration for your domain. This verification method is known as Easy DKIM.
 *
 * Alternatively, you can perform the verification process by providing your own public-private key
 * pair. This verification method is known as Bring Your Own DKIM (BYODKIM). To use BYODKIM, your
 * resource must include `DkimSigningAttributes` properties `DomainSigningSelector` and
 * `DomainSigningPrivateKey` . When you specify this object, you provide a selector (
 * `DomainSigningSelector` ) (a component of the DNS record name that identifies the public key to use
 * for DKIM authentication) and a private key ( `DomainSigningPrivateKey` ).
 *
 * Additionally, you can associate an existing configuration set with the email identity that you're
 * verifying.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * CfnEmailIdentity cfnEmailIdentity = CfnEmailIdentity.Builder.create(this, "MyCfnEmailIdentity")
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
public open class CfnEmailIdentity(
  cdkObject: software.amazon.awscdk.services.ses.CfnEmailIdentity,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEmailIdentityProps,
  ) :
      this(software.amazon.awscdk.services.ses.CfnEmailIdentity(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnEmailIdentityProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEmailIdentityProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEmailIdentityProps(props)
  )

  /**
   * The host name for the first token that you have to add to the DNS configuration for your
   * domain.
   */
  public open fun attrDkimDnsTokenName1(): String = unwrap(this).getAttrDkimDnsTokenName1()

  /**
   * The host name for the second token that you have to add to the DNS configuration for your
   * domain.
   */
  public open fun attrDkimDnsTokenName2(): String = unwrap(this).getAttrDkimDnsTokenName2()

  /**
   * The host name for the third token that you have to add to the DNS configuration for your
   * domain.
   */
  public open fun attrDkimDnsTokenName3(): String = unwrap(this).getAttrDkimDnsTokenName3()

  /**
   * The record value for the first token that you have to add to the DNS configuration for your
   * domain.
   */
  public open fun attrDkimDnsTokenValue1(): String = unwrap(this).getAttrDkimDnsTokenValue1()

  /**
   * The record value for the second token that you have to add to the DNS configuration for your
   * domain.
   */
  public open fun attrDkimDnsTokenValue2(): String = unwrap(this).getAttrDkimDnsTokenValue2()

  /**
   * The record value for the third token that you have to add to the DNS configuration for your
   * domain.
   */
  public open fun attrDkimDnsTokenValue3(): String = unwrap(this).getAttrDkimDnsTokenValue3()

  /**
   * Used to associate a configuration set with an email identity.
   */
  public open fun configurationSetAttributes(): Any? = unwrap(this).getConfigurationSetAttributes()

  /**
   * Used to associate a configuration set with an email identity.
   */
  public open fun configurationSetAttributes(`value`: IResolvable) {
    unwrap(this).setConfigurationSetAttributes(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Used to associate a configuration set with an email identity.
   */
  public open fun configurationSetAttributes(`value`: ConfigurationSetAttributesProperty) {
    unwrap(this).setConfigurationSetAttributes(`value`.let(ConfigurationSetAttributesProperty.Companion::unwrap))
  }

  /**
   * Used to associate a configuration set with an email identity.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("82e433553b0973806b555d911861fb6798c9eac9a286a6a2f5340a46d0a534e2")
  public open
      fun configurationSetAttributes(`value`: ConfigurationSetAttributesProperty.Builder.() -> Unit):
      Unit = configurationSetAttributes(ConfigurationSetAttributesProperty(`value`))

  /**
   * An object that contains information about the DKIM attributes for the identity.
   */
  public open fun dkimAttributes(): Any? = unwrap(this).getDkimAttributes()

  /**
   * An object that contains information about the DKIM attributes for the identity.
   */
  public open fun dkimAttributes(`value`: IResolvable) {
    unwrap(this).setDkimAttributes(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An object that contains information about the DKIM attributes for the identity.
   */
  public open fun dkimAttributes(`value`: DkimAttributesProperty) {
    unwrap(this).setDkimAttributes(`value`.let(DkimAttributesProperty.Companion::unwrap))
  }

  /**
   * An object that contains information about the DKIM attributes for the identity.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e6bee2a8290297b0c5e73906c77f9d2642298b0cdf78c643c1c5ce52a1ab3f13")
  public open fun dkimAttributes(`value`: DkimAttributesProperty.Builder.() -> Unit): Unit =
      dkimAttributes(DkimAttributesProperty(`value`))

  /**
   * If your request includes this object, Amazon SES configures the identity to use Bring Your Own
   * DKIM (BYODKIM) for DKIM authentication purposes, or, configures the key length to be used for
   * [Easy DKIM](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html) .
   */
  public open fun dkimSigningAttributes(): Any? = unwrap(this).getDkimSigningAttributes()

  /**
   * If your request includes this object, Amazon SES configures the identity to use Bring Your Own
   * DKIM (BYODKIM) for DKIM authentication purposes, or, configures the key length to be used for
   * [Easy DKIM](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html) .
   */
  public open fun dkimSigningAttributes(`value`: IResolvable) {
    unwrap(this).setDkimSigningAttributes(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * If your request includes this object, Amazon SES configures the identity to use Bring Your Own
   * DKIM (BYODKIM) for DKIM authentication purposes, or, configures the key length to be used for
   * [Easy DKIM](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html) .
   */
  public open fun dkimSigningAttributes(`value`: DkimSigningAttributesProperty) {
    unwrap(this).setDkimSigningAttributes(`value`.let(DkimSigningAttributesProperty.Companion::unwrap))
  }

  /**
   * If your request includes this object, Amazon SES configures the identity to use Bring Your Own
   * DKIM (BYODKIM) for DKIM authentication purposes, or, configures the key length to be used for
   * [Easy DKIM](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html) .
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1539c2c47cc40bc571dfa6bf2e15cb17fa45e57196e954e1a4fe1a550e4fa1e9")
  public open fun dkimSigningAttributes(`value`: DkimSigningAttributesProperty.Builder.() -> Unit):
      Unit = dkimSigningAttributes(DkimSigningAttributesProperty(`value`))

  /**
   * The email address or domain to verify.
   */
  public open fun emailIdentity(): String = unwrap(this).getEmailIdentity()

  /**
   * The email address or domain to verify.
   */
  public open fun emailIdentity(`value`: String) {
    unwrap(this).setEmailIdentity(`value`)
  }

  /**
   * Used to enable or disable feedback forwarding for an identity.
   */
  public open fun feedbackAttributes(): Any? = unwrap(this).getFeedbackAttributes()

  /**
   * Used to enable or disable feedback forwarding for an identity.
   */
  public open fun feedbackAttributes(`value`: IResolvable) {
    unwrap(this).setFeedbackAttributes(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Used to enable or disable feedback forwarding for an identity.
   */
  public open fun feedbackAttributes(`value`: FeedbackAttributesProperty) {
    unwrap(this).setFeedbackAttributes(`value`.let(FeedbackAttributesProperty.Companion::unwrap))
  }

  /**
   * Used to enable or disable feedback forwarding for an identity.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("78874ec7611f5d29c3e9e9ff17449907f686c40c02bae65cb0069198e45238a7")
  public open fun feedbackAttributes(`value`: FeedbackAttributesProperty.Builder.() -> Unit): Unit =
      feedbackAttributes(FeedbackAttributesProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Used to enable or disable the custom Mail-From domain configuration for an email identity.
   */
  public open fun mailFromAttributes(): Any? = unwrap(this).getMailFromAttributes()

  /**
   * Used to enable or disable the custom Mail-From domain configuration for an email identity.
   */
  public open fun mailFromAttributes(`value`: IResolvable) {
    unwrap(this).setMailFromAttributes(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Used to enable or disable the custom Mail-From domain configuration for an email identity.
   */
  public open fun mailFromAttributes(`value`: MailFromAttributesProperty) {
    unwrap(this).setMailFromAttributes(`value`.let(MailFromAttributesProperty.Companion::unwrap))
  }

  /**
   * Used to enable or disable the custom Mail-From domain configuration for an email identity.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("db90099dfd258d7a57903760d38577b65e630ac72937a3f8cade518e54382275")
  public open fun mailFromAttributes(`value`: MailFromAttributesProperty.Builder.() -> Unit): Unit =
      mailFromAttributes(MailFromAttributesProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.CfnEmailIdentity].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Used to associate a configuration set with an email identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-configurationsetattributes)
     * @param configurationSetAttributes Used to associate a configuration set with an email
     * identity. 
     */
    public fun configurationSetAttributes(configurationSetAttributes: IResolvable)

    /**
     * Used to associate a configuration set with an email identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-configurationsetattributes)
     * @param configurationSetAttributes Used to associate a configuration set with an email
     * identity. 
     */
    public
        fun configurationSetAttributes(configurationSetAttributes: ConfigurationSetAttributesProperty)

    /**
     * Used to associate a configuration set with an email identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-configurationsetattributes)
     * @param configurationSetAttributes Used to associate a configuration set with an email
     * identity. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ffd732bc38e8a9a9931b828a2f24ca4cabe7d304286618ff28817e5584ce2ef5")
    public
        fun configurationSetAttributes(configurationSetAttributes: ConfigurationSetAttributesProperty.Builder.() -> Unit)

    /**
     * An object that contains information about the DKIM attributes for the identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-dkimattributes)
     * @param dkimAttributes An object that contains information about the DKIM attributes for the
     * identity. 
     */
    public fun dkimAttributes(dkimAttributes: IResolvable)

    /**
     * An object that contains information about the DKIM attributes for the identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-dkimattributes)
     * @param dkimAttributes An object that contains information about the DKIM attributes for the
     * identity. 
     */
    public fun dkimAttributes(dkimAttributes: DkimAttributesProperty)

    /**
     * An object that contains information about the DKIM attributes for the identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-dkimattributes)
     * @param dkimAttributes An object that contains information about the DKIM attributes for the
     * identity. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18881700a5539a5cba94fe287dcc39baa1b925439dbb5bd08a36d66b8d2af706")
    public fun dkimAttributes(dkimAttributes: DkimAttributesProperty.Builder.() -> Unit)

    /**
     * If your request includes this object, Amazon SES configures the identity to use Bring Your
     * Own DKIM (BYODKIM) for DKIM authentication purposes, or, configures the key length to be used
     * for [Easy DKIM](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html) .
     *
     * You can only specify this object if the email identity is a domain, as opposed to an address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-dkimsigningattributes)
     * @param dkimSigningAttributes If your request includes this object, Amazon SES configures the
     * identity to use Bring Your Own DKIM (BYODKIM) for DKIM authentication purposes, or, configures
     * the key length to be used for [Easy
     * DKIM](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html) . 
     */
    public fun dkimSigningAttributes(dkimSigningAttributes: IResolvable)

    /**
     * If your request includes this object, Amazon SES configures the identity to use Bring Your
     * Own DKIM (BYODKIM) for DKIM authentication purposes, or, configures the key length to be used
     * for [Easy DKIM](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html) .
     *
     * You can only specify this object if the email identity is a domain, as opposed to an address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-dkimsigningattributes)
     * @param dkimSigningAttributes If your request includes this object, Amazon SES configures the
     * identity to use Bring Your Own DKIM (BYODKIM) for DKIM authentication purposes, or, configures
     * the key length to be used for [Easy
     * DKIM](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html) . 
     */
    public fun dkimSigningAttributes(dkimSigningAttributes: DkimSigningAttributesProperty)

    /**
     * If your request includes this object, Amazon SES configures the identity to use Bring Your
     * Own DKIM (BYODKIM) for DKIM authentication purposes, or, configures the key length to be used
     * for [Easy DKIM](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html) .
     *
     * You can only specify this object if the email identity is a domain, as opposed to an address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-dkimsigningattributes)
     * @param dkimSigningAttributes If your request includes this object, Amazon SES configures the
     * identity to use Bring Your Own DKIM (BYODKIM) for DKIM authentication purposes, or, configures
     * the key length to be used for [Easy
     * DKIM](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html) . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0dc9de9a7cd51baeddf84a283c353afab9d9b5c688a3693de80758c6c6834fee")
    public
        fun dkimSigningAttributes(dkimSigningAttributes: DkimSigningAttributesProperty.Builder.() -> Unit)

    /**
     * The email address or domain to verify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-emailidentity)
     * @param emailIdentity The email address or domain to verify. 
     */
    public fun emailIdentity(emailIdentity: String)

    /**
     * Used to enable or disable feedback forwarding for an identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-feedbackattributes)
     * @param feedbackAttributes Used to enable or disable feedback forwarding for an identity. 
     */
    public fun feedbackAttributes(feedbackAttributes: IResolvable)

    /**
     * Used to enable or disable feedback forwarding for an identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-feedbackattributes)
     * @param feedbackAttributes Used to enable or disable feedback forwarding for an identity. 
     */
    public fun feedbackAttributes(feedbackAttributes: FeedbackAttributesProperty)

    /**
     * Used to enable or disable feedback forwarding for an identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-feedbackattributes)
     * @param feedbackAttributes Used to enable or disable feedback forwarding for an identity. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6001f91ab44b70b5e6ca308eb64654f5701fd36f86cd4ea6d866b8bf460ab8e2")
    public fun feedbackAttributes(feedbackAttributes: FeedbackAttributesProperty.Builder.() -> Unit)

    /**
     * Used to enable or disable the custom Mail-From domain configuration for an email identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-mailfromattributes)
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     * for an email identity. 
     */
    public fun mailFromAttributes(mailFromAttributes: IResolvable)

    /**
     * Used to enable or disable the custom Mail-From domain configuration for an email identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-mailfromattributes)
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     * for an email identity. 
     */
    public fun mailFromAttributes(mailFromAttributes: MailFromAttributesProperty)

    /**
     * Used to enable or disable the custom Mail-From domain configuration for an email identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-mailfromattributes)
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     * for an email identity. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36c483098983e40c937de7187d3738ec856f1c4fef00108fbe31ab20c972c029")
    public fun mailFromAttributes(mailFromAttributes: MailFromAttributesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnEmailIdentity.Builder =
        software.amazon.awscdk.services.ses.CfnEmailIdentity.Builder.create(scope, id)

    /**
     * Used to associate a configuration set with an email identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-configurationsetattributes)
     * @param configurationSetAttributes Used to associate a configuration set with an email
     * identity. 
     */
    override fun configurationSetAttributes(configurationSetAttributes: IResolvable) {
      cdkBuilder.configurationSetAttributes(configurationSetAttributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * Used to associate a configuration set with an email identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-configurationsetattributes)
     * @param configurationSetAttributes Used to associate a configuration set with an email
     * identity. 
     */
    override
        fun configurationSetAttributes(configurationSetAttributes: ConfigurationSetAttributesProperty) {
      cdkBuilder.configurationSetAttributes(configurationSetAttributes.let(ConfigurationSetAttributesProperty.Companion::unwrap))
    }

    /**
     * Used to associate a configuration set with an email identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-configurationsetattributes)
     * @param configurationSetAttributes Used to associate a configuration set with an email
     * identity. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ffd732bc38e8a9a9931b828a2f24ca4cabe7d304286618ff28817e5584ce2ef5")
    override
        fun configurationSetAttributes(configurationSetAttributes: ConfigurationSetAttributesProperty.Builder.() -> Unit):
        Unit =
        configurationSetAttributes(ConfigurationSetAttributesProperty(configurationSetAttributes))

    /**
     * An object that contains information about the DKIM attributes for the identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-dkimattributes)
     * @param dkimAttributes An object that contains information about the DKIM attributes for the
     * identity. 
     */
    override fun dkimAttributes(dkimAttributes: IResolvable) {
      cdkBuilder.dkimAttributes(dkimAttributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * An object that contains information about the DKIM attributes for the identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-dkimattributes)
     * @param dkimAttributes An object that contains information about the DKIM attributes for the
     * identity. 
     */
    override fun dkimAttributes(dkimAttributes: DkimAttributesProperty) {
      cdkBuilder.dkimAttributes(dkimAttributes.let(DkimAttributesProperty.Companion::unwrap))
    }

    /**
     * An object that contains information about the DKIM attributes for the identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-dkimattributes)
     * @param dkimAttributes An object that contains information about the DKIM attributes for the
     * identity. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18881700a5539a5cba94fe287dcc39baa1b925439dbb5bd08a36d66b8d2af706")
    override fun dkimAttributes(dkimAttributes: DkimAttributesProperty.Builder.() -> Unit): Unit =
        dkimAttributes(DkimAttributesProperty(dkimAttributes))

    /**
     * If your request includes this object, Amazon SES configures the identity to use Bring Your
     * Own DKIM (BYODKIM) for DKIM authentication purposes, or, configures the key length to be used
     * for [Easy DKIM](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html) .
     *
     * You can only specify this object if the email identity is a domain, as opposed to an address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-dkimsigningattributes)
     * @param dkimSigningAttributes If your request includes this object, Amazon SES configures the
     * identity to use Bring Your Own DKIM (BYODKIM) for DKIM authentication purposes, or, configures
     * the key length to be used for [Easy
     * DKIM](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html) . 
     */
    override fun dkimSigningAttributes(dkimSigningAttributes: IResolvable) {
      cdkBuilder.dkimSigningAttributes(dkimSigningAttributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * If your request includes this object, Amazon SES configures the identity to use Bring Your
     * Own DKIM (BYODKIM) for DKIM authentication purposes, or, configures the key length to be used
     * for [Easy DKIM](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html) .
     *
     * You can only specify this object if the email identity is a domain, as opposed to an address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-dkimsigningattributes)
     * @param dkimSigningAttributes If your request includes this object, Amazon SES configures the
     * identity to use Bring Your Own DKIM (BYODKIM) for DKIM authentication purposes, or, configures
     * the key length to be used for [Easy
     * DKIM](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html) . 
     */
    override fun dkimSigningAttributes(dkimSigningAttributes: DkimSigningAttributesProperty) {
      cdkBuilder.dkimSigningAttributes(dkimSigningAttributes.let(DkimSigningAttributesProperty.Companion::unwrap))
    }

    /**
     * If your request includes this object, Amazon SES configures the identity to use Bring Your
     * Own DKIM (BYODKIM) for DKIM authentication purposes, or, configures the key length to be used
     * for [Easy DKIM](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html) .
     *
     * You can only specify this object if the email identity is a domain, as opposed to an address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-dkimsigningattributes)
     * @param dkimSigningAttributes If your request includes this object, Amazon SES configures the
     * identity to use Bring Your Own DKIM (BYODKIM) for DKIM authentication purposes, or, configures
     * the key length to be used for [Easy
     * DKIM](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html) . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0dc9de9a7cd51baeddf84a283c353afab9d9b5c688a3693de80758c6c6834fee")
    override
        fun dkimSigningAttributes(dkimSigningAttributes: DkimSigningAttributesProperty.Builder.() -> Unit):
        Unit = dkimSigningAttributes(DkimSigningAttributesProperty(dkimSigningAttributes))

    /**
     * The email address or domain to verify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-emailidentity)
     * @param emailIdentity The email address or domain to verify. 
     */
    override fun emailIdentity(emailIdentity: String) {
      cdkBuilder.emailIdentity(emailIdentity)
    }

    /**
     * Used to enable or disable feedback forwarding for an identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-feedbackattributes)
     * @param feedbackAttributes Used to enable or disable feedback forwarding for an identity. 
     */
    override fun feedbackAttributes(feedbackAttributes: IResolvable) {
      cdkBuilder.feedbackAttributes(feedbackAttributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * Used to enable or disable feedback forwarding for an identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-feedbackattributes)
     * @param feedbackAttributes Used to enable or disable feedback forwarding for an identity. 
     */
    override fun feedbackAttributes(feedbackAttributes: FeedbackAttributesProperty) {
      cdkBuilder.feedbackAttributes(feedbackAttributes.let(FeedbackAttributesProperty.Companion::unwrap))
    }

    /**
     * Used to enable or disable feedback forwarding for an identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-feedbackattributes)
     * @param feedbackAttributes Used to enable or disable feedback forwarding for an identity. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6001f91ab44b70b5e6ca308eb64654f5701fd36f86cd4ea6d866b8bf460ab8e2")
    override
        fun feedbackAttributes(feedbackAttributes: FeedbackAttributesProperty.Builder.() -> Unit):
        Unit = feedbackAttributes(FeedbackAttributesProperty(feedbackAttributes))

    /**
     * Used to enable or disable the custom Mail-From domain configuration for an email identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-mailfromattributes)
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     * for an email identity. 
     */
    override fun mailFromAttributes(mailFromAttributes: IResolvable) {
      cdkBuilder.mailFromAttributes(mailFromAttributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * Used to enable or disable the custom Mail-From domain configuration for an email identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-mailfromattributes)
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     * for an email identity. 
     */
    override fun mailFromAttributes(mailFromAttributes: MailFromAttributesProperty) {
      cdkBuilder.mailFromAttributes(mailFromAttributes.let(MailFromAttributesProperty.Companion::unwrap))
    }

    /**
     * Used to enable or disable the custom Mail-From domain configuration for an email identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-mailfromattributes)
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     * for an email identity. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36c483098983e40c937de7187d3738ec856f1c4fef00108fbe31ab20c972c029")
    override
        fun mailFromAttributes(mailFromAttributes: MailFromAttributesProperty.Builder.() -> Unit):
        Unit = mailFromAttributes(MailFromAttributesProperty(mailFromAttributes))

    public fun build(): software.amazon.awscdk.services.ses.CfnEmailIdentity = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ses.CfnEmailIdentity.CFN_RESOURCE_TYPE_NAME

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
        software.amazon.awscdk.services.ses.CfnEmailIdentity = wrapped.cdkObject as
        software.amazon.awscdk.services.ses.CfnEmailIdentity
  }

  /**
   * Used to associate a configuration set with an email identity.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * ConfigurationSetAttributesProperty configurationSetAttributesProperty =
   * ConfigurationSetAttributesProperty.builder()
   * .configurationSetName("configurationSetName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-configurationsetattributes.html)
   */
  public interface ConfigurationSetAttributesProperty {
    /**
     * The configuration set to associate with an email identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-configurationsetattributes.html#cfn-ses-emailidentity-configurationsetattributes-configurationsetname)
     */
    public fun configurationSetName(): String? = unwrap(this).getConfigurationSetName()

    /**
     * A builder for [ConfigurationSetAttributesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param configurationSetName The configuration set to associate with an email identity.
       */
      public fun configurationSetName(configurationSetName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnEmailIdentity.ConfigurationSetAttributesProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnEmailIdentity.ConfigurationSetAttributesProperty.builder()

      /**
       * @param configurationSetName The configuration set to associate with an email identity.
       */
      override fun configurationSetName(configurationSetName: String) {
        cdkBuilder.configurationSetName(configurationSetName)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnEmailIdentity.ConfigurationSetAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnEmailIdentity.ConfigurationSetAttributesProperty,
    ) : CdkObject(cdkObject),
        ConfigurationSetAttributesProperty {
      /**
       * The configuration set to associate with an email identity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-configurationsetattributes.html#cfn-ses-emailidentity-configurationsetattributes-configurationsetname)
       */
      override fun configurationSetName(): String? = unwrap(this).getConfigurationSetName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfigurationSetAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnEmailIdentity.ConfigurationSetAttributesProperty):
          ConfigurationSetAttributesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConfigurationSetAttributesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationSetAttributesProperty):
          software.amazon.awscdk.services.ses.CfnEmailIdentity.ConfigurationSetAttributesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnEmailIdentity.ConfigurationSetAttributesProperty
    }
  }

  /**
   * Used to enable or disable DKIM authentication for an email identity.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * DkimAttributesProperty dkimAttributesProperty = DkimAttributesProperty.builder()
   * .signingEnabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-dkimattributes.html)
   */
  public interface DkimAttributesProperty {
    /**
     * Sets the DKIM signing configuration for the identity.
     *
     * When you set this value `true` , then the messages that are sent from the identity are signed
     * using DKIM. If you set this value to `false` , your messages are sent without DKIM signing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-dkimattributes.html#cfn-ses-emailidentity-dkimattributes-signingenabled)
     */
    public fun signingEnabled(): Any? = unwrap(this).getSigningEnabled()

    /**
     * A builder for [DkimAttributesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param signingEnabled Sets the DKIM signing configuration for the identity.
       * When you set this value `true` , then the messages that are sent from the identity are
       * signed using DKIM. If you set this value to `false` , your messages are sent without DKIM
       * signing.
       */
      public fun signingEnabled(signingEnabled: Boolean)

      /**
       * @param signingEnabled Sets the DKIM signing configuration for the identity.
       * When you set this value `true` , then the messages that are sent from the identity are
       * signed using DKIM. If you set this value to `false` , your messages are sent without DKIM
       * signing.
       */
      public fun signingEnabled(signingEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnEmailIdentity.DkimAttributesProperty.Builder =
          software.amazon.awscdk.services.ses.CfnEmailIdentity.DkimAttributesProperty.builder()

      /**
       * @param signingEnabled Sets the DKIM signing configuration for the identity.
       * When you set this value `true` , then the messages that are sent from the identity are
       * signed using DKIM. If you set this value to `false` , your messages are sent without DKIM
       * signing.
       */
      override fun signingEnabled(signingEnabled: Boolean) {
        cdkBuilder.signingEnabled(signingEnabled)
      }

      /**
       * @param signingEnabled Sets the DKIM signing configuration for the identity.
       * When you set this value `true` , then the messages that are sent from the identity are
       * signed using DKIM. If you set this value to `false` , your messages are sent without DKIM
       * signing.
       */
      override fun signingEnabled(signingEnabled: IResolvable) {
        cdkBuilder.signingEnabled(signingEnabled.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnEmailIdentity.DkimAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnEmailIdentity.DkimAttributesProperty,
    ) : CdkObject(cdkObject),
        DkimAttributesProperty {
      /**
       * Sets the DKIM signing configuration for the identity.
       *
       * When you set this value `true` , then the messages that are sent from the identity are
       * signed using DKIM. If you set this value to `false` , your messages are sent without DKIM
       * signing.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-dkimattributes.html#cfn-ses-emailidentity-dkimattributes-signingenabled)
       */
      override fun signingEnabled(): Any? = unwrap(this).getSigningEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DkimAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnEmailIdentity.DkimAttributesProperty):
          DkimAttributesProperty = CdkObjectWrappers.wrap(cdkObject) as? DkimAttributesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DkimAttributesProperty):
          software.amazon.awscdk.services.ses.CfnEmailIdentity.DkimAttributesProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnEmailIdentity.DkimAttributesProperty
    }
  }

  /**
   * Used to configure or change the DKIM authentication settings for an email domain identity.
   *
   * You can use this operation to do any of the following:
   *
   * * Update the signing attributes for an identity that uses Bring Your Own DKIM (BYODKIM).
   * * Update the key length that should be used for Easy DKIM.
   * * Change from using no DKIM authentication to using Easy DKIM.
   * * Change from using no DKIM authentication to using BYODKIM.
   * * Change from using Easy DKIM to using BYODKIM.
   * * Change from using BYODKIM to using Easy DKIM.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * DkimSigningAttributesProperty dkimSigningAttributesProperty =
   * DkimSigningAttributesProperty.builder()
   * .domainSigningPrivateKey("domainSigningPrivateKey")
   * .domainSigningSelector("domainSigningSelector")
   * .nextSigningKeyLength("nextSigningKeyLength")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-dkimsigningattributes.html)
   */
  public interface DkimSigningAttributesProperty {
    /**
     * [Bring Your Own DKIM] A private key that's used to generate a DKIM signature.
     *
     * The private key must use 1024 or 2048-bit RSA encryption, and must be encoded using base64
     * encoding.
     *
     *
     * Rather than embedding sensitive information directly in your CFN templates, we recommend you
     * use dynamic parameters in the stack template to reference sensitive information that is stored
     * and managed outside of CFN, such as in the AWS Systems Manager Parameter Store or AWS Secrets
     * Manager.
     *
     * For more information, see the [Do not embed credentials in your
     * templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/best-practices.html#creds)
     * best practice.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-dkimsigningattributes.html#cfn-ses-emailidentity-dkimsigningattributes-domainsigningprivatekey)
     */
    public fun domainSigningPrivateKey(): String? = unwrap(this).getDomainSigningPrivateKey()

    /**
     * [Bring Your Own DKIM] A string that's used to identify a public key in the DNS configuration
     * for a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-dkimsigningattributes.html#cfn-ses-emailidentity-dkimsigningattributes-domainsigningselector)
     */
    public fun domainSigningSelector(): String? = unwrap(this).getDomainSigningSelector()

    /**
     * [Easy DKIM] The key length of the future DKIM key pair to be generated.
     *
     * This can be changed at most once per day.
     *
     * Valid Values: `RSA_1024_BIT | RSA_2048_BIT`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-dkimsigningattributes.html#cfn-ses-emailidentity-dkimsigningattributes-nextsigningkeylength)
     */
    public fun nextSigningKeyLength(): String? = unwrap(this).getNextSigningKeyLength()

    /**
     * A builder for [DkimSigningAttributesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param domainSigningPrivateKey [Bring Your Own DKIM] A private key that's used to generate
       * a DKIM signature.
       * The private key must use 1024 or 2048-bit RSA encryption, and must be encoded using base64
       * encoding.
       *
       *
       * Rather than embedding sensitive information directly in your CFN templates, we recommend
       * you use dynamic parameters in the stack template to reference sensitive information that is
       * stored and managed outside of CFN, such as in the AWS Systems Manager Parameter Store or AWS
       * Secrets Manager.
       *
       * For more information, see the [Do not embed credentials in your
       * templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/best-practices.html#creds)
       * best practice.
       */
      public fun domainSigningPrivateKey(domainSigningPrivateKey: String)

      /**
       * @param domainSigningSelector [Bring Your Own DKIM] A string that's used to identify a
       * public key in the DNS configuration for a domain.
       */
      public fun domainSigningSelector(domainSigningSelector: String)

      /**
       * @param nextSigningKeyLength [Easy DKIM] The key length of the future DKIM key pair to be
       * generated.
       * This can be changed at most once per day.
       *
       * Valid Values: `RSA_1024_BIT | RSA_2048_BIT`
       */
      public fun nextSigningKeyLength(nextSigningKeyLength: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnEmailIdentity.DkimSigningAttributesProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnEmailIdentity.DkimSigningAttributesProperty.builder()

      /**
       * @param domainSigningPrivateKey [Bring Your Own DKIM] A private key that's used to generate
       * a DKIM signature.
       * The private key must use 1024 or 2048-bit RSA encryption, and must be encoded using base64
       * encoding.
       *
       *
       * Rather than embedding sensitive information directly in your CFN templates, we recommend
       * you use dynamic parameters in the stack template to reference sensitive information that is
       * stored and managed outside of CFN, such as in the AWS Systems Manager Parameter Store or AWS
       * Secrets Manager.
       *
       * For more information, see the [Do not embed credentials in your
       * templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/best-practices.html#creds)
       * best practice.
       */
      override fun domainSigningPrivateKey(domainSigningPrivateKey: String) {
        cdkBuilder.domainSigningPrivateKey(domainSigningPrivateKey)
      }

      /**
       * @param domainSigningSelector [Bring Your Own DKIM] A string that's used to identify a
       * public key in the DNS configuration for a domain.
       */
      override fun domainSigningSelector(domainSigningSelector: String) {
        cdkBuilder.domainSigningSelector(domainSigningSelector)
      }

      /**
       * @param nextSigningKeyLength [Easy DKIM] The key length of the future DKIM key pair to be
       * generated.
       * This can be changed at most once per day.
       *
       * Valid Values: `RSA_1024_BIT | RSA_2048_BIT`
       */
      override fun nextSigningKeyLength(nextSigningKeyLength: String) {
        cdkBuilder.nextSigningKeyLength(nextSigningKeyLength)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnEmailIdentity.DkimSigningAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnEmailIdentity.DkimSigningAttributesProperty,
    ) : CdkObject(cdkObject),
        DkimSigningAttributesProperty {
      /**
       * [Bring Your Own DKIM] A private key that's used to generate a DKIM signature.
       *
       * The private key must use 1024 or 2048-bit RSA encryption, and must be encoded using base64
       * encoding.
       *
       *
       * Rather than embedding sensitive information directly in your CFN templates, we recommend
       * you use dynamic parameters in the stack template to reference sensitive information that is
       * stored and managed outside of CFN, such as in the AWS Systems Manager Parameter Store or AWS
       * Secrets Manager.
       *
       * For more information, see the [Do not embed credentials in your
       * templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/best-practices.html#creds)
       * best practice.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-dkimsigningattributes.html#cfn-ses-emailidentity-dkimsigningattributes-domainsigningprivatekey)
       */
      override fun domainSigningPrivateKey(): String? = unwrap(this).getDomainSigningPrivateKey()

      /**
       * [Bring Your Own DKIM] A string that's used to identify a public key in the DNS
       * configuration for a domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-dkimsigningattributes.html#cfn-ses-emailidentity-dkimsigningattributes-domainsigningselector)
       */
      override fun domainSigningSelector(): String? = unwrap(this).getDomainSigningSelector()

      /**
       * [Easy DKIM] The key length of the future DKIM key pair to be generated.
       *
       * This can be changed at most once per day.
       *
       * Valid Values: `RSA_1024_BIT | RSA_2048_BIT`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-dkimsigningattributes.html#cfn-ses-emailidentity-dkimsigningattributes-nextsigningkeylength)
       */
      override fun nextSigningKeyLength(): String? = unwrap(this).getNextSigningKeyLength()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DkimSigningAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnEmailIdentity.DkimSigningAttributesProperty):
          DkimSigningAttributesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DkimSigningAttributesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DkimSigningAttributesProperty):
          software.amazon.awscdk.services.ses.CfnEmailIdentity.DkimSigningAttributesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnEmailIdentity.DkimSigningAttributesProperty
    }
  }

  /**
   * Used to enable or disable feedback forwarding for an identity.
   *
   * This setting determines what happens when an identity is used to send an email that results in
   * a bounce or complaint event.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * FeedbackAttributesProperty feedbackAttributesProperty = FeedbackAttributesProperty.builder()
   * .emailForwardingEnabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-feedbackattributes.html)
   */
  public interface FeedbackAttributesProperty {
    /**
     * Sets the feedback forwarding configuration for the identity.
     *
     * If the value is `true` , you receive email notifications when bounce or complaint events
     * occur. These notifications are sent to the address that you specified in the `Return-Path`
     * header of the original email.
     *
     * You're required to have a method of tracking bounces and complaints. If you haven't set up
     * another mechanism for receiving bounce or complaint notifications (for example, by setting up an
     * event destination), you receive an email notification when these events occur (even if this
     * setting is disabled).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-feedbackattributes.html#cfn-ses-emailidentity-feedbackattributes-emailforwardingenabled)
     */
    public fun emailForwardingEnabled(): Any? = unwrap(this).getEmailForwardingEnabled()

    /**
     * A builder for [FeedbackAttributesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param emailForwardingEnabled Sets the feedback forwarding configuration for the identity.
       * If the value is `true` , you receive email notifications when bounce or complaint events
       * occur. These notifications are sent to the address that you specified in the `Return-Path`
       * header of the original email.
       *
       * You're required to have a method of tracking bounces and complaints. If you haven't set up
       * another mechanism for receiving bounce or complaint notifications (for example, by setting up
       * an event destination), you receive an email notification when these events occur (even if this
       * setting is disabled).
       */
      public fun emailForwardingEnabled(emailForwardingEnabled: Boolean)

      /**
       * @param emailForwardingEnabled Sets the feedback forwarding configuration for the identity.
       * If the value is `true` , you receive email notifications when bounce or complaint events
       * occur. These notifications are sent to the address that you specified in the `Return-Path`
       * header of the original email.
       *
       * You're required to have a method of tracking bounces and complaints. If you haven't set up
       * another mechanism for receiving bounce or complaint notifications (for example, by setting up
       * an event destination), you receive an email notification when these events occur (even if this
       * setting is disabled).
       */
      public fun emailForwardingEnabled(emailForwardingEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnEmailIdentity.FeedbackAttributesProperty.Builder =
          software.amazon.awscdk.services.ses.CfnEmailIdentity.FeedbackAttributesProperty.builder()

      /**
       * @param emailForwardingEnabled Sets the feedback forwarding configuration for the identity.
       * If the value is `true` , you receive email notifications when bounce or complaint events
       * occur. These notifications are sent to the address that you specified in the `Return-Path`
       * header of the original email.
       *
       * You're required to have a method of tracking bounces and complaints. If you haven't set up
       * another mechanism for receiving bounce or complaint notifications (for example, by setting up
       * an event destination), you receive an email notification when these events occur (even if this
       * setting is disabled).
       */
      override fun emailForwardingEnabled(emailForwardingEnabled: Boolean) {
        cdkBuilder.emailForwardingEnabled(emailForwardingEnabled)
      }

      /**
       * @param emailForwardingEnabled Sets the feedback forwarding configuration for the identity.
       * If the value is `true` , you receive email notifications when bounce or complaint events
       * occur. These notifications are sent to the address that you specified in the `Return-Path`
       * header of the original email.
       *
       * You're required to have a method of tracking bounces and complaints. If you haven't set up
       * another mechanism for receiving bounce or complaint notifications (for example, by setting up
       * an event destination), you receive an email notification when these events occur (even if this
       * setting is disabled).
       */
      override fun emailForwardingEnabled(emailForwardingEnabled: IResolvable) {
        cdkBuilder.emailForwardingEnabled(emailForwardingEnabled.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnEmailIdentity.FeedbackAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnEmailIdentity.FeedbackAttributesProperty,
    ) : CdkObject(cdkObject),
        FeedbackAttributesProperty {
      /**
       * Sets the feedback forwarding configuration for the identity.
       *
       * If the value is `true` , you receive email notifications when bounce or complaint events
       * occur. These notifications are sent to the address that you specified in the `Return-Path`
       * header of the original email.
       *
       * You're required to have a method of tracking bounces and complaints. If you haven't set up
       * another mechanism for receiving bounce or complaint notifications (for example, by setting up
       * an event destination), you receive an email notification when these events occur (even if this
       * setting is disabled).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-feedbackattributes.html#cfn-ses-emailidentity-feedbackattributes-emailforwardingenabled)
       */
      override fun emailForwardingEnabled(): Any? = unwrap(this).getEmailForwardingEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FeedbackAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnEmailIdentity.FeedbackAttributesProperty):
          FeedbackAttributesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FeedbackAttributesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FeedbackAttributesProperty):
          software.amazon.awscdk.services.ses.CfnEmailIdentity.FeedbackAttributesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnEmailIdentity.FeedbackAttributesProperty
    }
  }

  /**
   * Used to enable or disable the custom Mail-From domain configuration for an email identity.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * MailFromAttributesProperty mailFromAttributesProperty = MailFromAttributesProperty.builder()
   * .behaviorOnMxFailure("behaviorOnMxFailure")
   * .mailFromDomain("mailFromDomain")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-mailfromattributes.html)
   */
  public interface MailFromAttributesProperty {
    /**
     * The action to take if the required MX record isn't found when you send an email.
     *
     * When you set this value to `USE_DEFAULT_VALUE` , the mail is sent using *amazonses.com* as
     * the MAIL FROM domain. When you set this value to `REJECT_MESSAGE` , the Amazon SES API v2
     * returns a `MailFromDomainNotVerified` error, and doesn't attempt to deliver the email.
     *
     * These behaviors are taken when the custom MAIL FROM domain configuration is in the `Pending`
     * , `Failed` , and `TemporaryFailure` states.
     *
     * Valid Values: `USE_DEFAULT_VALUE | REJECT_MESSAGE`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-mailfromattributes.html#cfn-ses-emailidentity-mailfromattributes-behavioronmxfailure)
     */
    public fun behaviorOnMxFailure(): String? = unwrap(this).getBehaviorOnMxFailure()

    /**
     * The custom MAIL FROM domain that you want the verified identity to use.
     *
     * The MAIL FROM domain must meet the following criteria:
     *
     * * It has to be a subdomain of the verified identity.
     * * It can't be used to receive email.
     * * It can't be used in a "From" address if the MAIL FROM domain is a destination for feedback
     * forwarding emails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-mailfromattributes.html#cfn-ses-emailidentity-mailfromattributes-mailfromdomain)
     */
    public fun mailFromDomain(): String? = unwrap(this).getMailFromDomain()

    /**
     * A builder for [MailFromAttributesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param behaviorOnMxFailure The action to take if the required MX record isn't found when
       * you send an email.
       * When you set this value to `USE_DEFAULT_VALUE` , the mail is sent using *amazonses.com* as
       * the MAIL FROM domain. When you set this value to `REJECT_MESSAGE` , the Amazon SES API v2
       * returns a `MailFromDomainNotVerified` error, and doesn't attempt to deliver the email.
       *
       * These behaviors are taken when the custom MAIL FROM domain configuration is in the
       * `Pending` , `Failed` , and `TemporaryFailure` states.
       *
       * Valid Values: `USE_DEFAULT_VALUE | REJECT_MESSAGE`
       */
      public fun behaviorOnMxFailure(behaviorOnMxFailure: String)

      /**
       * @param mailFromDomain The custom MAIL FROM domain that you want the verified identity to
       * use.
       * The MAIL FROM domain must meet the following criteria:
       *
       * * It has to be a subdomain of the verified identity.
       * * It can't be used to receive email.
       * * It can't be used in a "From" address if the MAIL FROM domain is a destination for
       * feedback forwarding emails.
       */
      public fun mailFromDomain(mailFromDomain: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnEmailIdentity.MailFromAttributesProperty.Builder =
          software.amazon.awscdk.services.ses.CfnEmailIdentity.MailFromAttributesProperty.builder()

      /**
       * @param behaviorOnMxFailure The action to take if the required MX record isn't found when
       * you send an email.
       * When you set this value to `USE_DEFAULT_VALUE` , the mail is sent using *amazonses.com* as
       * the MAIL FROM domain. When you set this value to `REJECT_MESSAGE` , the Amazon SES API v2
       * returns a `MailFromDomainNotVerified` error, and doesn't attempt to deliver the email.
       *
       * These behaviors are taken when the custom MAIL FROM domain configuration is in the
       * `Pending` , `Failed` , and `TemporaryFailure` states.
       *
       * Valid Values: `USE_DEFAULT_VALUE | REJECT_MESSAGE`
       */
      override fun behaviorOnMxFailure(behaviorOnMxFailure: String) {
        cdkBuilder.behaviorOnMxFailure(behaviorOnMxFailure)
      }

      /**
       * @param mailFromDomain The custom MAIL FROM domain that you want the verified identity to
       * use.
       * The MAIL FROM domain must meet the following criteria:
       *
       * * It has to be a subdomain of the verified identity.
       * * It can't be used to receive email.
       * * It can't be used in a "From" address if the MAIL FROM domain is a destination for
       * feedback forwarding emails.
       */
      override fun mailFromDomain(mailFromDomain: String) {
        cdkBuilder.mailFromDomain(mailFromDomain)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnEmailIdentity.MailFromAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnEmailIdentity.MailFromAttributesProperty,
    ) : CdkObject(cdkObject),
        MailFromAttributesProperty {
      /**
       * The action to take if the required MX record isn't found when you send an email.
       *
       * When you set this value to `USE_DEFAULT_VALUE` , the mail is sent using *amazonses.com* as
       * the MAIL FROM domain. When you set this value to `REJECT_MESSAGE` , the Amazon SES API v2
       * returns a `MailFromDomainNotVerified` error, and doesn't attempt to deliver the email.
       *
       * These behaviors are taken when the custom MAIL FROM domain configuration is in the
       * `Pending` , `Failed` , and `TemporaryFailure` states.
       *
       * Valid Values: `USE_DEFAULT_VALUE | REJECT_MESSAGE`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-mailfromattributes.html#cfn-ses-emailidentity-mailfromattributes-behavioronmxfailure)
       */
      override fun behaviorOnMxFailure(): String? = unwrap(this).getBehaviorOnMxFailure()

      /**
       * The custom MAIL FROM domain that you want the verified identity to use.
       *
       * The MAIL FROM domain must meet the following criteria:
       *
       * * It has to be a subdomain of the verified identity.
       * * It can't be used to receive email.
       * * It can't be used in a "From" address if the MAIL FROM domain is a destination for
       * feedback forwarding emails.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-mailfromattributes.html#cfn-ses-emailidentity-mailfromattributes-mailfromdomain)
       */
      override fun mailFromDomain(): String? = unwrap(this).getMailFromDomain()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MailFromAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnEmailIdentity.MailFromAttributesProperty):
          MailFromAttributesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MailFromAttributesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MailFromAttributesProperty):
          software.amazon.awscdk.services.ses.CfnEmailIdentity.MailFromAttributesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnEmailIdentity.MailFromAttributesProperty
    }
  }
}
