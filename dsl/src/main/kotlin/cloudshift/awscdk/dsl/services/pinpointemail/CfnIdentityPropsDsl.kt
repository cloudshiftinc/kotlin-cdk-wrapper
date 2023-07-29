@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpointemail.CfnIdentity
import software.amazon.awscdk.services.pinpointemail.CfnIdentityProps

/**
 * Properties for defining a `CfnIdentity`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpointemail.*;
 * CfnIdentityProps cfnIdentityProps = CfnIdentityProps.builder()
 * .name("name")
 * // the properties below are optional
 * .dkimSigningEnabled(false)
 * .feedbackForwardingEnabled(false)
 * .mailFromAttributes(MailFromAttributesProperty.builder()
 * .behaviorOnMxFailure("behaviorOnMxFailure")
 * .mailFromDomain("mailFromDomain")
 * .build())
 * .tags(List.of(TagsProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html)
 */
@CdkDslMarker
public class CfnIdentityPropsDsl {
    private val cdkBuilder: CfnIdentityProps.Builder = CfnIdentityProps.builder()

    private val _tags: MutableList<CfnIdentity.TagsProperty> = mutableListOf()

    /**
     * @param dkimSigningEnabled For domain identities, this attribute is used to enable or disable
     *   DomainKeys Identified Mail (DKIM) signing for the domain. If the value is `true` , then the
     *   messages that you send from the domain are signed using both the DKIM keys for your domain,
     *   as well as the keys for the `amazonses.com` domain. If the value is `false` , then the
     *   messages that you send are only signed using the DKIM keys for the `amazonses.com` domain.
     */
    public fun dkimSigningEnabled(dkimSigningEnabled: Boolean) {
        cdkBuilder.dkimSigningEnabled(dkimSigningEnabled)
    }

    /**
     * @param dkimSigningEnabled For domain identities, this attribute is used to enable or disable
     *   DomainKeys Identified Mail (DKIM) signing for the domain. If the value is `true` , then the
     *   messages that you send from the domain are signed using both the DKIM keys for your domain,
     *   as well as the keys for the `amazonses.com` domain. If the value is `false` , then the
     *   messages that you send are only signed using the DKIM keys for the `amazonses.com` domain.
     */
    public fun dkimSigningEnabled(dkimSigningEnabled: IResolvable) {
        cdkBuilder.dkimSigningEnabled(dkimSigningEnabled)
    }

    /**
     * @param feedbackForwardingEnabled Used to enable or disable feedback forwarding for an
     *   identity. This setting determines what happens when an identity is used to send an email
     *   that results in a bounce or complaint event.
     *
     * When you enable feedback forwarding, Amazon Pinpoint sends you email notifications when
     * bounce or complaint events occur. Amazon Pinpoint sends this notification to the address that
     * you specified in the Return-Path header of the original email.
     *
     * When you disable feedback forwarding, Amazon Pinpoint sends notifications through other
     * mechanisms, such as by notifying an Amazon SNS topic. You're required to have a method of
     * tracking bounces and complaints. If you haven't set up another mechanism for receiving bounce
     * or complaint notifications, Amazon Pinpoint sends an email notification when these events
     * occur (even if this setting is disabled).
     */
    public fun feedbackForwardingEnabled(feedbackForwardingEnabled: Boolean) {
        cdkBuilder.feedbackForwardingEnabled(feedbackForwardingEnabled)
    }

    /**
     * @param feedbackForwardingEnabled Used to enable or disable feedback forwarding for an
     *   identity. This setting determines what happens when an identity is used to send an email
     *   that results in a bounce or complaint event.
     *
     * When you enable feedback forwarding, Amazon Pinpoint sends you email notifications when
     * bounce or complaint events occur. Amazon Pinpoint sends this notification to the address that
     * you specified in the Return-Path header of the original email.
     *
     * When you disable feedback forwarding, Amazon Pinpoint sends notifications through other
     * mechanisms, such as by notifying an Amazon SNS topic. You're required to have a method of
     * tracking bounces and complaints. If you haven't set up another mechanism for receiving bounce
     * or complaint notifications, Amazon Pinpoint sends an email notification when these events
     * occur (even if this setting is disabled).
     */
    public fun feedbackForwardingEnabled(feedbackForwardingEnabled: IResolvable) {
        cdkBuilder.feedbackForwardingEnabled(feedbackForwardingEnabled)
    }

    /**
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     *   for an email identity.
     */
    public fun mailFromAttributes(mailFromAttributes: IResolvable) {
        cdkBuilder.mailFromAttributes(mailFromAttributes)
    }

    /**
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     *   for an email identity.
     */
    public fun mailFromAttributes(mailFromAttributes: CfnIdentity.MailFromAttributesProperty) {
        cdkBuilder.mailFromAttributes(mailFromAttributes)
    }

    /**
     * @param name The address or domain of the identity, such as *sender&#64;example.com* or
     *   *example.co.uk* .
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     *   the email identity.
     */
    public fun tags(tags: CfnIdentityTagsPropertyDsl.() -> Unit) {
        _tags.add(CfnIdentityTagsPropertyDsl().apply(tags).build())
    }

    /**
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     *   the email identity.
     */
    public fun tags(tags: Collection<CfnIdentity.TagsProperty>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnIdentityProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
