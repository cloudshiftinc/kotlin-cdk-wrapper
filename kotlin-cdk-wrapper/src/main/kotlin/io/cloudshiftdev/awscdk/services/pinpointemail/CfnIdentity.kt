@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpointemail

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies an identity to use for sending email through Amazon Pinpoint.
 *
 * In Amazon Pinpoint, an *identity* is an email address or domain that you use when you send email.
 * Before you can use Amazon Pinpoint to send an email from an identity, you first have to verify it.
 * By verifying an identity, you demonstrate that you're the owner of the address or domain, and that
 * you've given Amazon Pinpoint permission to send email from that identity.
 *
 * When you verify an email address, Amazon Pinpoint sends an email to the address. Your email
 * address is verified as soon as you follow the link in the verification email.
 *
 * When you verify a domain, this operation provides a set of DKIM tokens, which you can convert
 * into CNAME tokens. You add these CNAME tokens to the DNS configuration for your domain. Your domain
 * is verified when Amazon Pinpoint detects these records in the DNS configuration for your domain. It
 * usually takes around 72 hours to complete the domain verification process.
 *
 *
 * When you use CloudFormation to specify an identity, CloudFormation might indicate that the
 * identity was created successfully. However, you have to verify the identity before you can use it to
 * send email.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pinpointemail.*;
 * CfnIdentity cfnIdentity = CfnIdentity.Builder.create(this, "MyCfnIdentity")
 * .name("name")
 * // the properties below are optional
 * .dkimSigningEnabled(false)
 * .feedbackForwardingEnabled(false)
 * .mailFromAttributes(MailFromAttributesProperty.builder()
 * .behaviorOnMxFailure("behaviorOnMxFailure")
 * .mailFromDomain("mailFromDomain")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html)
 */
public open class CfnIdentity(
  cdkObject: software.amazon.awscdk.services.pinpointemail.CfnIdentity,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIdentityProps,
  ) :
      this(software.amazon.awscdk.services.pinpointemail.CfnIdentity(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnIdentityProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIdentityProps.Builder.() -> Unit,
  ) : this(scope, id, CfnIdentityProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The host name for the first token that you have to add to the DNS configuration for your
   * domain.
   *
   * For more information, see [Verifying a
   * Domain](https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-email-manage-verify.html#channels-email-manage-verify-domain)
   * in the Amazon Pinpoint User Guide.
   */
  public open fun attrIdentityDnsRecordName1(): String =
      unwrap(this).getAttrIdentityDnsRecordName1()

  /**
   * The host name for the second token that you have to add to the DNS configuration for your
   * domain.
   */
  public open fun attrIdentityDnsRecordName2(): String =
      unwrap(this).getAttrIdentityDnsRecordName2()

  /**
   * The host name for the third token that you have to add to the DNS configuration for your
   * domain.
   */
  public open fun attrIdentityDnsRecordName3(): String =
      unwrap(this).getAttrIdentityDnsRecordName3()

  /**
   * The record value for the first token that you have to add to the DNS configuration for your
   * domain.
   */
  public open fun attrIdentityDnsRecordValue1(): String =
      unwrap(this).getAttrIdentityDnsRecordValue1()

  /**
   * The record value for the second token that you have to add to the DNS configuration for your
   * domain.
   */
  public open fun attrIdentityDnsRecordValue2(): String =
      unwrap(this).getAttrIdentityDnsRecordValue2()

  /**
   * The record value for the third token that you have to add to the DNS configuration for your
   * domain.
   */
  public open fun attrIdentityDnsRecordValue3(): String =
      unwrap(this).getAttrIdentityDnsRecordValue3()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * For domain identities, this attribute is used to enable or disable DomainKeys Identified Mail
   * (DKIM) signing for the domain.
   */
  public open fun dkimSigningEnabled(): Any? = unwrap(this).getDkimSigningEnabled()

  /**
   * For domain identities, this attribute is used to enable or disable DomainKeys Identified Mail
   * (DKIM) signing for the domain.
   */
  public open fun dkimSigningEnabled(`value`: Boolean) {
    unwrap(this).setDkimSigningEnabled(`value`)
  }

  /**
   * For domain identities, this attribute is used to enable or disable DomainKeys Identified Mail
   * (DKIM) signing for the domain.
   */
  public open fun dkimSigningEnabled(`value`: IResolvable) {
    unwrap(this).setDkimSigningEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * Used to enable or disable feedback forwarding for an identity.
   */
  public open fun feedbackForwardingEnabled(): Any? = unwrap(this).getFeedbackForwardingEnabled()

  /**
   * Used to enable or disable feedback forwarding for an identity.
   */
  public open fun feedbackForwardingEnabled(`value`: Boolean) {
    unwrap(this).setFeedbackForwardingEnabled(`value`)
  }

  /**
   * Used to enable or disable feedback forwarding for an identity.
   */
  public open fun feedbackForwardingEnabled(`value`: IResolvable) {
    unwrap(this).setFeedbackForwardingEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Used to enable or disable the custom Mail-From domain configuration for an email identity.
   */
  public open fun mailFromAttributes(): Any? = unwrap(this).getMailFromAttributes()

  /**
   * Used to enable or disable the custom Mail-From domain configuration for an email identity.
   */
  public open fun mailFromAttributes(`value`: IResolvable) {
    unwrap(this).setMailFromAttributes(`value`.let(IResolvable::unwrap))
  }

  /**
   * Used to enable or disable the custom Mail-From domain configuration for an email identity.
   */
  public open fun mailFromAttributes(`value`: MailFromAttributesProperty) {
    unwrap(this).setMailFromAttributes(`value`.let(MailFromAttributesProperty::unwrap))
  }

  /**
   * Used to enable or disable the custom Mail-From domain configuration for an email identity.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("96c1f78a63f373bd65a481250d583f24595a2524adec80d56afeae4373a6ad36")
  public open fun mailFromAttributes(`value`: MailFromAttributesProperty.Builder.() -> Unit): Unit =
      mailFromAttributes(MailFromAttributesProperty(`value`))

  /**
   * The address or domain of the identity, such as *sender&#64;example.com* or *example.co.uk* .
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The address or domain of the identity, such as *sender&#64;example.com* or *example.co.uk* .
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * An object that defines the tags (keys and values) that you want to associate with the email
   * identity.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An object that defines the tags (keys and values) that you want to associate with the email
   * identity.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * An object that defines the tags (keys and values) that you want to associate with the email
   * identity.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.pinpointemail.CfnIdentity].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * For domain identities, this attribute is used to enable or disable DomainKeys Identified Mail
     * (DKIM) signing for the domain.
     *
     * If the value is `true` , then the messages that you send from the domain are signed using
     * both the DKIM keys for your domain, as well as the keys for the `amazonses.com` domain. If the
     * value is `false` , then the messages that you send are only signed using the DKIM keys for the
     * `amazonses.com` domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-dkimsigningenabled)
     * @param dkimSigningEnabled For domain identities, this attribute is used to enable or disable
     * DomainKeys Identified Mail (DKIM) signing for the domain. 
     */
    public fun dkimSigningEnabled(dkimSigningEnabled: Boolean)

    /**
     * For domain identities, this attribute is used to enable or disable DomainKeys Identified Mail
     * (DKIM) signing for the domain.
     *
     * If the value is `true` , then the messages that you send from the domain are signed using
     * both the DKIM keys for your domain, as well as the keys for the `amazonses.com` domain. If the
     * value is `false` , then the messages that you send are only signed using the DKIM keys for the
     * `amazonses.com` domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-dkimsigningenabled)
     * @param dkimSigningEnabled For domain identities, this attribute is used to enable or disable
     * DomainKeys Identified Mail (DKIM) signing for the domain. 
     */
    public fun dkimSigningEnabled(dkimSigningEnabled: IResolvable)

    /**
     * Used to enable or disable feedback forwarding for an identity.
     *
     * This setting determines what happens when an identity is used to send an email that results
     * in a bounce or complaint event.
     *
     * When you enable feedback forwarding, Amazon Pinpoint sends you email notifications when
     * bounce or complaint events occur. Amazon Pinpoint sends this notification to the address that
     * you specified in the Return-Path header of the original email.
     *
     * When you disable feedback forwarding, Amazon Pinpoint sends notifications through other
     * mechanisms, such as by notifying an Amazon SNS topic. You're required to have a method of
     * tracking bounces and complaints. If you haven't set up another mechanism for receiving bounce or
     * complaint notifications, Amazon Pinpoint sends an email notification when these events occur
     * (even if this setting is disabled).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-feedbackforwardingenabled)
     * @param feedbackForwardingEnabled Used to enable or disable feedback forwarding for an
     * identity. 
     */
    public fun feedbackForwardingEnabled(feedbackForwardingEnabled: Boolean)

    /**
     * Used to enable or disable feedback forwarding for an identity.
     *
     * This setting determines what happens when an identity is used to send an email that results
     * in a bounce or complaint event.
     *
     * When you enable feedback forwarding, Amazon Pinpoint sends you email notifications when
     * bounce or complaint events occur. Amazon Pinpoint sends this notification to the address that
     * you specified in the Return-Path header of the original email.
     *
     * When you disable feedback forwarding, Amazon Pinpoint sends notifications through other
     * mechanisms, such as by notifying an Amazon SNS topic. You're required to have a method of
     * tracking bounces and complaints. If you haven't set up another mechanism for receiving bounce or
     * complaint notifications, Amazon Pinpoint sends an email notification when these events occur
     * (even if this setting is disabled).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-feedbackforwardingenabled)
     * @param feedbackForwardingEnabled Used to enable or disable feedback forwarding for an
     * identity. 
     */
    public fun feedbackForwardingEnabled(feedbackForwardingEnabled: IResolvable)

    /**
     * Used to enable or disable the custom Mail-From domain configuration for an email identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-mailfromattributes)
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     * for an email identity. 
     */
    public fun mailFromAttributes(mailFromAttributes: IResolvable)

    /**
     * Used to enable or disable the custom Mail-From domain configuration for an email identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-mailfromattributes)
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     * for an email identity. 
     */
    public fun mailFromAttributes(mailFromAttributes: MailFromAttributesProperty)

    /**
     * Used to enable or disable the custom Mail-From domain configuration for an email identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-mailfromattributes)
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     * for an email identity. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8453518f907ad724d13149546a0012a7042eed12ce92092d934e6c47399c20ed")
    public fun mailFromAttributes(mailFromAttributes: MailFromAttributesProperty.Builder.() -> Unit)

    /**
     * The address or domain of the identity, such as *sender&#64;example.com* or *example.co.uk* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-name)
     * @param name The address or domain of the identity, such as *sender&#64;example.com* or
     * *example.co.uk* . 
     */
    public fun name(name: String)

    /**
     * An object that defines the tags (keys and values) that you want to associate with the email
     * identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-tags)
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     * the email identity. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An object that defines the tags (keys and values) that you want to associate with the email
     * identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-tags)
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     * the email identity. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpointemail.CfnIdentity.Builder =
        software.amazon.awscdk.services.pinpointemail.CfnIdentity.Builder.create(scope, id)

    /**
     * For domain identities, this attribute is used to enable or disable DomainKeys Identified Mail
     * (DKIM) signing for the domain.
     *
     * If the value is `true` , then the messages that you send from the domain are signed using
     * both the DKIM keys for your domain, as well as the keys for the `amazonses.com` domain. If the
     * value is `false` , then the messages that you send are only signed using the DKIM keys for the
     * `amazonses.com` domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-dkimsigningenabled)
     * @param dkimSigningEnabled For domain identities, this attribute is used to enable or disable
     * DomainKeys Identified Mail (DKIM) signing for the domain. 
     */
    override fun dkimSigningEnabled(dkimSigningEnabled: Boolean) {
      cdkBuilder.dkimSigningEnabled(dkimSigningEnabled)
    }

    /**
     * For domain identities, this attribute is used to enable or disable DomainKeys Identified Mail
     * (DKIM) signing for the domain.
     *
     * If the value is `true` , then the messages that you send from the domain are signed using
     * both the DKIM keys for your domain, as well as the keys for the `amazonses.com` domain. If the
     * value is `false` , then the messages that you send are only signed using the DKIM keys for the
     * `amazonses.com` domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-dkimsigningenabled)
     * @param dkimSigningEnabled For domain identities, this attribute is used to enable or disable
     * DomainKeys Identified Mail (DKIM) signing for the domain. 
     */
    override fun dkimSigningEnabled(dkimSigningEnabled: IResolvable) {
      cdkBuilder.dkimSigningEnabled(dkimSigningEnabled.let(IResolvable::unwrap))
    }

    /**
     * Used to enable or disable feedback forwarding for an identity.
     *
     * This setting determines what happens when an identity is used to send an email that results
     * in a bounce or complaint event.
     *
     * When you enable feedback forwarding, Amazon Pinpoint sends you email notifications when
     * bounce or complaint events occur. Amazon Pinpoint sends this notification to the address that
     * you specified in the Return-Path header of the original email.
     *
     * When you disable feedback forwarding, Amazon Pinpoint sends notifications through other
     * mechanisms, such as by notifying an Amazon SNS topic. You're required to have a method of
     * tracking bounces and complaints. If you haven't set up another mechanism for receiving bounce or
     * complaint notifications, Amazon Pinpoint sends an email notification when these events occur
     * (even if this setting is disabled).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-feedbackforwardingenabled)
     * @param feedbackForwardingEnabled Used to enable or disable feedback forwarding for an
     * identity. 
     */
    override fun feedbackForwardingEnabled(feedbackForwardingEnabled: Boolean) {
      cdkBuilder.feedbackForwardingEnabled(feedbackForwardingEnabled)
    }

    /**
     * Used to enable or disable feedback forwarding for an identity.
     *
     * This setting determines what happens when an identity is used to send an email that results
     * in a bounce or complaint event.
     *
     * When you enable feedback forwarding, Amazon Pinpoint sends you email notifications when
     * bounce or complaint events occur. Amazon Pinpoint sends this notification to the address that
     * you specified in the Return-Path header of the original email.
     *
     * When you disable feedback forwarding, Amazon Pinpoint sends notifications through other
     * mechanisms, such as by notifying an Amazon SNS topic. You're required to have a method of
     * tracking bounces and complaints. If you haven't set up another mechanism for receiving bounce or
     * complaint notifications, Amazon Pinpoint sends an email notification when these events occur
     * (even if this setting is disabled).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-feedbackforwardingenabled)
     * @param feedbackForwardingEnabled Used to enable or disable feedback forwarding for an
     * identity. 
     */
    override fun feedbackForwardingEnabled(feedbackForwardingEnabled: IResolvable) {
      cdkBuilder.feedbackForwardingEnabled(feedbackForwardingEnabled.let(IResolvable::unwrap))
    }

    /**
     * Used to enable or disable the custom Mail-From domain configuration for an email identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-mailfromattributes)
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     * for an email identity. 
     */
    override fun mailFromAttributes(mailFromAttributes: IResolvable) {
      cdkBuilder.mailFromAttributes(mailFromAttributes.let(IResolvable::unwrap))
    }

    /**
     * Used to enable or disable the custom Mail-From domain configuration for an email identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-mailfromattributes)
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     * for an email identity. 
     */
    override fun mailFromAttributes(mailFromAttributes: MailFromAttributesProperty) {
      cdkBuilder.mailFromAttributes(mailFromAttributes.let(MailFromAttributesProperty::unwrap))
    }

    /**
     * Used to enable or disable the custom Mail-From domain configuration for an email identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-mailfromattributes)
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     * for an email identity. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8453518f907ad724d13149546a0012a7042eed12ce92092d934e6c47399c20ed")
    override
        fun mailFromAttributes(mailFromAttributes: MailFromAttributesProperty.Builder.() -> Unit):
        Unit = mailFromAttributes(MailFromAttributesProperty(mailFromAttributes))

    /**
     * The address or domain of the identity, such as *sender&#64;example.com* or *example.co.uk* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-name)
     * @param name The address or domain of the identity, such as *sender&#64;example.com* or
     * *example.co.uk* . 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An object that defines the tags (keys and values) that you want to associate with the email
     * identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-tags)
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     * the email identity. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An object that defines the tags (keys and values) that you want to associate with the email
     * identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-tags)
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     * the email identity. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.pinpointemail.CfnIdentity =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.pinpointemail.CfnIdentity.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIdentity {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIdentity(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpointemail.CfnIdentity):
        CfnIdentity = CfnIdentity(cdkObject)

    internal fun unwrap(wrapped: CfnIdentity):
        software.amazon.awscdk.services.pinpointemail.CfnIdentity = wrapped.cdkObject as
        software.amazon.awscdk.services.pinpointemail.CfnIdentity
  }

  /**
   * A list of attributes that are associated with a MAIL FROM domain.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpointemail.*;
   * MailFromAttributesProperty mailFromAttributesProperty = MailFromAttributesProperty.builder()
   * .behaviorOnMxFailure("behaviorOnMxFailure")
   * .mailFromDomain("mailFromDomain")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-identity-mailfromattributes.html)
   */
  public interface MailFromAttributesProperty {
    /**
     * The action that Amazon Pinpoint to takes if it can't read the required MX record for a custom
     * MAIL FROM domain.
     *
     * When you set this value to `UseDefaultValue` , Amazon Pinpoint uses *amazonses.com* as the
     * MAIL FROM domain. When you set this value to `RejectMessage` , Amazon Pinpoint returns a
     * `MailFromDomainNotVerified` error, and doesn't attempt to deliver the email.
     *
     * These behaviors are taken when the custom MAIL FROM domain configuration is in the `Pending`
     * , `Failed` , and `TemporaryFailure` states.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-identity-mailfromattributes.html#cfn-pinpointemail-identity-mailfromattributes-behavioronmxfailure)
     */
    public fun behaviorOnMxFailure(): String? = unwrap(this).getBehaviorOnMxFailure()

    /**
     * The name of a domain that an email identity uses as a custom MAIL FROM domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-identity-mailfromattributes.html#cfn-pinpointemail-identity-mailfromattributes-mailfromdomain)
     */
    public fun mailFromDomain(): String? = unwrap(this).getMailFromDomain()

    /**
     * A builder for [MailFromAttributesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param behaviorOnMxFailure The action that Amazon Pinpoint to takes if it can't read the
       * required MX record for a custom MAIL FROM domain.
       * When you set this value to `UseDefaultValue` , Amazon Pinpoint uses *amazonses.com* as the
       * MAIL FROM domain. When you set this value to `RejectMessage` , Amazon Pinpoint returns a
       * `MailFromDomainNotVerified` error, and doesn't attempt to deliver the email.
       *
       * These behaviors are taken when the custom MAIL FROM domain configuration is in the
       * `Pending` , `Failed` , and `TemporaryFailure` states.
       */
      public fun behaviorOnMxFailure(behaviorOnMxFailure: String)

      /**
       * @param mailFromDomain The name of a domain that an email identity uses as a custom MAIL
       * FROM domain.
       */
      public fun mailFromDomain(mailFromDomain: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpointemail.CfnIdentity.MailFromAttributesProperty.Builder
          =
          software.amazon.awscdk.services.pinpointemail.CfnIdentity.MailFromAttributesProperty.builder()

      /**
       * @param behaviorOnMxFailure The action that Amazon Pinpoint to takes if it can't read the
       * required MX record for a custom MAIL FROM domain.
       * When you set this value to `UseDefaultValue` , Amazon Pinpoint uses *amazonses.com* as the
       * MAIL FROM domain. When you set this value to `RejectMessage` , Amazon Pinpoint returns a
       * `MailFromDomainNotVerified` error, and doesn't attempt to deliver the email.
       *
       * These behaviors are taken when the custom MAIL FROM domain configuration is in the
       * `Pending` , `Failed` , and `TemporaryFailure` states.
       */
      override fun behaviorOnMxFailure(behaviorOnMxFailure: String) {
        cdkBuilder.behaviorOnMxFailure(behaviorOnMxFailure)
      }

      /**
       * @param mailFromDomain The name of a domain that an email identity uses as a custom MAIL
       * FROM domain.
       */
      override fun mailFromDomain(mailFromDomain: String) {
        cdkBuilder.mailFromDomain(mailFromDomain)
      }

      public fun build():
          software.amazon.awscdk.services.pinpointemail.CfnIdentity.MailFromAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpointemail.CfnIdentity.MailFromAttributesProperty,
    ) : CdkObject(cdkObject), MailFromAttributesProperty {
      /**
       * The action that Amazon Pinpoint to takes if it can't read the required MX record for a
       * custom MAIL FROM domain.
       *
       * When you set this value to `UseDefaultValue` , Amazon Pinpoint uses *amazonses.com* as the
       * MAIL FROM domain. When you set this value to `RejectMessage` , Amazon Pinpoint returns a
       * `MailFromDomainNotVerified` error, and doesn't attempt to deliver the email.
       *
       * These behaviors are taken when the custom MAIL FROM domain configuration is in the
       * `Pending` , `Failed` , and `TemporaryFailure` states.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-identity-mailfromattributes.html#cfn-pinpointemail-identity-mailfromattributes-behavioronmxfailure)
       */
      override fun behaviorOnMxFailure(): String? = unwrap(this).getBehaviorOnMxFailure()

      /**
       * The name of a domain that an email identity uses as a custom MAIL FROM domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-identity-mailfromattributes.html#cfn-pinpointemail-identity-mailfromattributes-mailfromdomain)
       */
      override fun mailFromDomain(): String? = unwrap(this).getMailFromDomain()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MailFromAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpointemail.CfnIdentity.MailFromAttributesProperty):
          MailFromAttributesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MailFromAttributesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MailFromAttributesProperty):
          software.amazon.awscdk.services.pinpointemail.CfnIdentity.MailFromAttributesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpointemail.CfnIdentity.MailFromAttributesProperty
    }
  }
}
