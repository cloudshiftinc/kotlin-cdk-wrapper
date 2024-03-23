@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpointemail

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnIdentity`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pinpointemail.*;
 * CfnIdentityProps cfnIdentityProps = CfnIdentityProps.builder()
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
public interface CfnIdentityProps {
  /**
   * For domain identities, this attribute is used to enable or disable DomainKeys Identified Mail
   * (DKIM) signing for the domain.
   *
   * If the value is `true` , then the messages that you send from the domain are signed using both
   * the DKIM keys for your domain, as well as the keys for the `amazonses.com` domain. If the value is
   * `false` , then the messages that you send are only signed using the DKIM keys for the
   * `amazonses.com` domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-dkimsigningenabled)
   */
  public fun dkimSigningEnabled(): Any? = unwrap(this).getDkimSigningEnabled()

  /**
   * Used to enable or disable feedback forwarding for an identity.
   *
   * This setting determines what happens when an identity is used to send an email that results in
   * a bounce or complaint event.
   *
   * When you enable feedback forwarding, Amazon Pinpoint sends you email notifications when bounce
   * or complaint events occur. Amazon Pinpoint sends this notification to the address that you
   * specified in the Return-Path header of the original email.
   *
   * When you disable feedback forwarding, Amazon Pinpoint sends notifications through other
   * mechanisms, such as by notifying an Amazon SNS topic. You're required to have a method of tracking
   * bounces and complaints. If you haven't set up another mechanism for receiving bounce or complaint
   * notifications, Amazon Pinpoint sends an email notification when these events occur (even if this
   * setting is disabled).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-feedbackforwardingenabled)
   */
  public fun feedbackForwardingEnabled(): Any? = unwrap(this).getFeedbackForwardingEnabled()

  /**
   * Used to enable or disable the custom Mail-From domain configuration for an email identity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-mailfromattributes)
   */
  public fun mailFromAttributes(): Any? = unwrap(this).getMailFromAttributes()

  /**
   * The address or domain of the identity, such as *sender&#64;example.com* or *example.co.uk* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-name)
   */
  public fun name(): String

  /**
   * An object that defines the tags (keys and values) that you want to associate with the email
   * identity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnIdentityProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dkimSigningEnabled For domain identities, this attribute is used to enable or disable
     * DomainKeys Identified Mail (DKIM) signing for the domain.
     * If the value is `true` , then the messages that you send from the domain are signed using
     * both the DKIM keys for your domain, as well as the keys for the `amazonses.com` domain. If the
     * value is `false` , then the messages that you send are only signed using the DKIM keys for the
     * `amazonses.com` domain.
     */
    public fun dkimSigningEnabled(dkimSigningEnabled: Boolean)

    /**
     * @param dkimSigningEnabled For domain identities, this attribute is used to enable or disable
     * DomainKeys Identified Mail (DKIM) signing for the domain.
     * If the value is `true` , then the messages that you send from the domain are signed using
     * both the DKIM keys for your domain, as well as the keys for the `amazonses.com` domain. If the
     * value is `false` , then the messages that you send are only signed using the DKIM keys for the
     * `amazonses.com` domain.
     */
    public fun dkimSigningEnabled(dkimSigningEnabled: IResolvable)

    /**
     * @param feedbackForwardingEnabled Used to enable or disable feedback forwarding for an
     * identity.
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
     */
    public fun feedbackForwardingEnabled(feedbackForwardingEnabled: Boolean)

    /**
     * @param feedbackForwardingEnabled Used to enable or disable feedback forwarding for an
     * identity.
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
     */
    public fun feedbackForwardingEnabled(feedbackForwardingEnabled: IResolvable)

    /**
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     * for an email identity.
     */
    public fun mailFromAttributes(mailFromAttributes: IResolvable)

    /**
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     * for an email identity.
     */
    public fun mailFromAttributes(mailFromAttributes: CfnIdentity.MailFromAttributesProperty)

    /**
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     * for an email identity.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1890e2b08a51359d1c8dc4d99e46280a38fa9ea2bb48060d87c2352fb6fe4206")
    public
        fun mailFromAttributes(mailFromAttributes: CfnIdentity.MailFromAttributesProperty.Builder.() -> Unit)

    /**
     * @param name The address or domain of the identity, such as *sender&#64;example.com* or
     * *example.co.uk* . 
     */
    public fun name(name: String)

    /**
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     * the email identity.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     * the email identity.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpointemail.CfnIdentityProps.Builder =
        software.amazon.awscdk.services.pinpointemail.CfnIdentityProps.builder()

    /**
     * @param dkimSigningEnabled For domain identities, this attribute is used to enable or disable
     * DomainKeys Identified Mail (DKIM) signing for the domain.
     * If the value is `true` , then the messages that you send from the domain are signed using
     * both the DKIM keys for your domain, as well as the keys for the `amazonses.com` domain. If the
     * value is `false` , then the messages that you send are only signed using the DKIM keys for the
     * `amazonses.com` domain.
     */
    override fun dkimSigningEnabled(dkimSigningEnabled: Boolean) {
      cdkBuilder.dkimSigningEnabled(dkimSigningEnabled)
    }

    /**
     * @param dkimSigningEnabled For domain identities, this attribute is used to enable or disable
     * DomainKeys Identified Mail (DKIM) signing for the domain.
     * If the value is `true` , then the messages that you send from the domain are signed using
     * both the DKIM keys for your domain, as well as the keys for the `amazonses.com` domain. If the
     * value is `false` , then the messages that you send are only signed using the DKIM keys for the
     * `amazonses.com` domain.
     */
    override fun dkimSigningEnabled(dkimSigningEnabled: IResolvable) {
      cdkBuilder.dkimSigningEnabled(dkimSigningEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param feedbackForwardingEnabled Used to enable or disable feedback forwarding for an
     * identity.
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
     */
    override fun feedbackForwardingEnabled(feedbackForwardingEnabled: Boolean) {
      cdkBuilder.feedbackForwardingEnabled(feedbackForwardingEnabled)
    }

    /**
     * @param feedbackForwardingEnabled Used to enable or disable feedback forwarding for an
     * identity.
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
     */
    override fun feedbackForwardingEnabled(feedbackForwardingEnabled: IResolvable) {
      cdkBuilder.feedbackForwardingEnabled(feedbackForwardingEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     * for an email identity.
     */
    override fun mailFromAttributes(mailFromAttributes: IResolvable) {
      cdkBuilder.mailFromAttributes(mailFromAttributes.let(IResolvable::unwrap))
    }

    /**
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     * for an email identity.
     */
    override fun mailFromAttributes(mailFromAttributes: CfnIdentity.MailFromAttributesProperty) {
      cdkBuilder.mailFromAttributes(mailFromAttributes.let(CfnIdentity.MailFromAttributesProperty::unwrap))
    }

    /**
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     * for an email identity.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1890e2b08a51359d1c8dc4d99e46280a38fa9ea2bb48060d87c2352fb6fe4206")
    override
        fun mailFromAttributes(mailFromAttributes: CfnIdentity.MailFromAttributesProperty.Builder.() -> Unit):
        Unit = mailFromAttributes(CfnIdentity.MailFromAttributesProperty(mailFromAttributes))

    /**
     * @param name The address or domain of the identity, such as *sender&#64;example.com* or
     * *example.co.uk* . 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     * the email identity.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     * the email identity.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.pinpointemail.CfnIdentityProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.pinpointemail.CfnIdentityProps,
  ) : CdkObject(cdkObject), CfnIdentityProps {
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
     */
    override fun dkimSigningEnabled(): Any? = unwrap(this).getDkimSigningEnabled()

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
     */
    override fun feedbackForwardingEnabled(): Any? = unwrap(this).getFeedbackForwardingEnabled()

    /**
     * Used to enable or disable the custom Mail-From domain configuration for an email identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-mailfromattributes)
     */
    override fun mailFromAttributes(): Any? = unwrap(this).getMailFromAttributes()

    /**
     * The address or domain of the identity, such as *sender&#64;example.com* or *example.co.uk* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * An object that defines the tags (keys and values) that you want to associate with the email
     * identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIdentityProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpointemail.CfnIdentityProps):
        CfnIdentityProps = CdkObjectWrappers.wrap(cdkObject) as? CfnIdentityProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIdentityProps):
        software.amazon.awscdk.services.pinpointemail.CfnIdentityProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pinpointemail.CfnIdentityProps
  }
}
