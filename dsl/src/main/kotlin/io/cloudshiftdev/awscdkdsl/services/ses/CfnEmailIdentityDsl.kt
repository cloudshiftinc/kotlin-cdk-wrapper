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

package io.cloudshiftdev.awscdkdsl.services.ses

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnEmailIdentity
import software.constructs.Construct

/**
 * Specifies an identity for using within SES.
 *
 * An identity is an email address or domain that you use when you send email. Before you can use an
 * identity to send email, you first have to verify it. By verifying an identity, you demonstrate
 * that you're the owner of the identity, and that you've given Amazon SES API v2 permission to send
 * email from the identity.
 *
 * When you verify an email address, SES sends an email to the address. Your email address is
 * verified as soon as you follow the link in the verification email. When you verify a domain
 * without specifying the DkimSigningAttributes properties, OR only the NextSigningKeyLength
 * property of DkimSigningAttributes, this resource provides a set of CNAME token names and values
 * (DkimDNSTokenName1, DkimDNSTokenValue1, DkimDNSTokenName2, DkimDNSTokenValue2, DkimDNSTokenName3,
 * DkimDNSTokenValue3) as outputs. You can then add these to the DNS configuration for your domain.
 * Your domain is verified when Amazon SES detects these records in the DNS configuration for your
 * domain. This verification method is known as Easy DKIM.
 *
 * Alternatively, you can perform the verification process by providing your own public-private key
 * pair. This verification method is known as Bring Your Own DKIM (BYODKIM). To use BYODKIM, your
 * resource must include DkimSigningAttributes properties DomainSigningSelector and
 * DomainSigningPrivateKey. When you specify this object, you provide a selector
 * (DomainSigningSelector) (a component of the DNS record name that identifies the public key to use
 * for DKIM authentication) and a private key (DomainSigningPrivateKey).
 *
 * Additionally, you can associate an existing configuration set with the email identity that you're
 * verifying.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
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
@CdkDslMarker
public class CfnEmailIdentityDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEmailIdentity.Builder = CfnEmailIdentity.Builder.create(scope, id)

    /**
     * Used to associate a configuration set with an email identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-configurationsetattributes)
     *
     * @param configurationSetAttributes Used to associate a configuration set with an email
     *   identity.
     */
    public fun configurationSetAttributes(configurationSetAttributes: IResolvable) {
        cdkBuilder.configurationSetAttributes(configurationSetAttributes)
    }

    /**
     * Used to associate a configuration set with an email identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-configurationsetattributes)
     *
     * @param configurationSetAttributes Used to associate a configuration set with an email
     *   identity.
     */
    public fun configurationSetAttributes(
        configurationSetAttributes: CfnEmailIdentity.ConfigurationSetAttributesProperty
    ) {
        cdkBuilder.configurationSetAttributes(configurationSetAttributes)
    }

    /**
     * An object that contains information about the DKIM attributes for the identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-dkimattributes)
     *
     * @param dkimAttributes An object that contains information about the DKIM attributes for the
     *   identity.
     */
    public fun dkimAttributes(dkimAttributes: IResolvable) {
        cdkBuilder.dkimAttributes(dkimAttributes)
    }

    /**
     * An object that contains information about the DKIM attributes for the identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-dkimattributes)
     *
     * @param dkimAttributes An object that contains information about the DKIM attributes for the
     *   identity.
     */
    public fun dkimAttributes(dkimAttributes: CfnEmailIdentity.DkimAttributesProperty) {
        cdkBuilder.dkimAttributes(dkimAttributes)
    }

    /**
     * If your request includes this object, Amazon SES configures the identity to use Bring Your
     * Own DKIM (BYODKIM) for DKIM authentication purposes, or, configures the key length to be used
     * for
     * [Easy DKIM](https://docs.aws.amazon.com/ses/latest/dg/send-email-authentication-dkim-easy.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-dkimsigningattributes)
     *
     * @param dkimSigningAttributes If your request includes this object, Amazon SES configures the
     *   identity to use Bring Your Own DKIM (BYODKIM) for DKIM authentication purposes, or,
     *   configures the key length to be used for
     *   [Easy DKIM](https://docs.aws.amazon.com/ses/latest/dg/send-email-authentication-dkim-easy.html)
     *   .
     */
    public fun dkimSigningAttributes(dkimSigningAttributes: IResolvable) {
        cdkBuilder.dkimSigningAttributes(dkimSigningAttributes)
    }

    /**
     * If your request includes this object, Amazon SES configures the identity to use Bring Your
     * Own DKIM (BYODKIM) for DKIM authentication purposes, or, configures the key length to be used
     * for
     * [Easy DKIM](https://docs.aws.amazon.com/ses/latest/dg/send-email-authentication-dkim-easy.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-dkimsigningattributes)
     *
     * @param dkimSigningAttributes If your request includes this object, Amazon SES configures the
     *   identity to use Bring Your Own DKIM (BYODKIM) for DKIM authentication purposes, or,
     *   configures the key length to be used for
     *   [Easy DKIM](https://docs.aws.amazon.com/ses/latest/dg/send-email-authentication-dkim-easy.html)
     *   .
     */
    public fun dkimSigningAttributes(
        dkimSigningAttributes: CfnEmailIdentity.DkimSigningAttributesProperty
    ) {
        cdkBuilder.dkimSigningAttributes(dkimSigningAttributes)
    }

    /**
     * The email address or domain to verify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-emailidentity)
     *
     * @param emailIdentity The email address or domain to verify.
     */
    public fun emailIdentity(emailIdentity: String) {
        cdkBuilder.emailIdentity(emailIdentity)
    }

    /**
     * Used to enable or disable feedback forwarding for an identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-feedbackattributes)
     *
     * @param feedbackAttributes Used to enable or disable feedback forwarding for an identity.
     */
    public fun feedbackAttributes(feedbackAttributes: IResolvable) {
        cdkBuilder.feedbackAttributes(feedbackAttributes)
    }

    /**
     * Used to enable or disable feedback forwarding for an identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-feedbackattributes)
     *
     * @param feedbackAttributes Used to enable or disable feedback forwarding for an identity.
     */
    public fun feedbackAttributes(feedbackAttributes: CfnEmailIdentity.FeedbackAttributesProperty) {
        cdkBuilder.feedbackAttributes(feedbackAttributes)
    }

    /**
     * Used to enable or disable the custom Mail-From domain configuration for an email identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-mailfromattributes)
     *
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     *   for an email identity.
     */
    public fun mailFromAttributes(mailFromAttributes: IResolvable) {
        cdkBuilder.mailFromAttributes(mailFromAttributes)
    }

    /**
     * Used to enable or disable the custom Mail-From domain configuration for an email identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-mailfromattributes)
     *
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     *   for an email identity.
     */
    public fun mailFromAttributes(mailFromAttributes: CfnEmailIdentity.MailFromAttributesProperty) {
        cdkBuilder.mailFromAttributes(mailFromAttributes)
    }

    public fun build(): CfnEmailIdentity = cdkBuilder.build()
}
