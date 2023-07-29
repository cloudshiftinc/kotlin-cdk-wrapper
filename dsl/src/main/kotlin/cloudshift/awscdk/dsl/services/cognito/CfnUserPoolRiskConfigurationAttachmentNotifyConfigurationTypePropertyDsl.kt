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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment

/**
 * The notify configuration type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * NotifyConfigurationTypeProperty notifyConfigurationTypeProperty =
 * NotifyConfigurationTypeProperty.builder()
 * .sourceArn("sourceArn")
 * // the properties below are optional
 * .blockEmail(NotifyEmailTypeProperty.builder()
 * .subject("subject")
 * // the properties below are optional
 * .htmlBody("htmlBody")
 * .textBody("textBody")
 * .build())
 * .from("from")
 * .mfaEmail(NotifyEmailTypeProperty.builder()
 * .subject("subject")
 * // the properties below are optional
 * .htmlBody("htmlBody")
 * .textBody("textBody")
 * .build())
 * .noActionEmail(NotifyEmailTypeProperty.builder()
 * .subject("subject")
 * // the properties below are optional
 * .htmlBody("htmlBody")
 * .textBody("textBody")
 * .build())
 * .replyTo("replyTo")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html)
 */
@CdkDslMarker
public class CfnUserPoolRiskConfigurationAttachmentNotifyConfigurationTypePropertyDsl {
    private val cdkBuilder:
        CfnUserPoolRiskConfigurationAttachment.NotifyConfigurationTypeProperty.Builder =
        CfnUserPoolRiskConfigurationAttachment.NotifyConfigurationTypeProperty.builder()

    /** @param blockEmail Email template used when a detected risk event is blocked. */
    public fun blockEmail(blockEmail: IResolvable) {
        cdkBuilder.blockEmail(blockEmail)
    }

    /** @param blockEmail Email template used when a detected risk event is blocked. */
    public fun blockEmail(
        blockEmail: CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty
    ) {
        cdkBuilder.blockEmail(blockEmail)
    }

    /**
     * @param from The email address that is sending the email. The address must be either
     *   individually verified with Amazon Simple Email Service, or from a domain that has been
     *   verified with Amazon SES.
     */
    public fun from(from: String) {
        cdkBuilder.from(from)
    }

    /**
     * @param mfaEmail The multi-factor authentication (MFA) email template used when MFA is
     *   challenged as part of a detected risk.
     */
    public fun mfaEmail(mfaEmail: IResolvable) {
        cdkBuilder.mfaEmail(mfaEmail)
    }

    /**
     * @param mfaEmail The multi-factor authentication (MFA) email template used when MFA is
     *   challenged as part of a detected risk.
     */
    public fun mfaEmail(mfaEmail: CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty) {
        cdkBuilder.mfaEmail(mfaEmail)
    }

    /** @param noActionEmail The email template used when a detected risk event is allowed. */
    public fun noActionEmail(noActionEmail: IResolvable) {
        cdkBuilder.noActionEmail(noActionEmail)
    }

    /** @param noActionEmail The email template used when a detected risk event is allowed. */
    public fun noActionEmail(
        noActionEmail: CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty
    ) {
        cdkBuilder.noActionEmail(noActionEmail)
    }

    /** @param replyTo The destination to which the receiver of an email should reply to. */
    public fun replyTo(replyTo: String) {
        cdkBuilder.replyTo(replyTo)
    }

    /**
     * @param sourceArn The Amazon Resource Name (ARN) of the identity that is associated with the
     *   sending authorization policy. This identity permits Amazon Cognito to send for the email
     *   address specified in the `From` parameter.
     */
    public fun sourceArn(sourceArn: String) {
        cdkBuilder.sourceArn(sourceArn)
    }

    public fun build(): CfnUserPoolRiskConfigurationAttachment.NotifyConfigurationTypeProperty =
        cdkBuilder.build()
}
