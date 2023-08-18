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

package io.cloudshiftdev.awscdkdsl.services.cognito

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment

/**
 * Configuration for mitigation actions and notification for different levels of risk detected for a
 * potential account takeover.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * AccountTakeoverRiskConfigurationTypeProperty accountTakeoverRiskConfigurationTypeProperty =
 * AccountTakeoverRiskConfigurationTypeProperty.builder()
 * .actions(AccountTakeoverActionsTypeProperty.builder()
 * .highAction(AccountTakeoverActionTypeProperty.builder()
 * .eventAction("eventAction")
 * .notify(false)
 * .build())
 * .lowAction(AccountTakeoverActionTypeProperty.builder()
 * .eventAction("eventAction")
 * .notify(false)
 * .build())
 * .mediumAction(AccountTakeoverActionTypeProperty.builder()
 * .eventAction("eventAction")
 * .notify(false)
 * .build())
 * .build())
 * // the properties below are optional
 * .notifyConfiguration(NotifyConfigurationTypeProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfigurationtype.html)
 */
@CdkDslMarker
public class CfnUserPoolRiskConfigurationAttachmentAccountTakeoverRiskConfigurationTypePropertyDsl {
    private val cdkBuilder:
        CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty.Builder =
        CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty
            .builder()

    /** @param actions Account takeover risk configuration actions. */
    public fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions)
    }

    /** @param actions Account takeover risk configuration actions. */
    public fun actions(
        actions: CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionsTypeProperty
    ) {
        cdkBuilder.actions(actions)
    }

    /**
     * @param notifyConfiguration The notify configuration used to construct email notifications.
     */
    public fun notifyConfiguration(notifyConfiguration: IResolvable) {
        cdkBuilder.notifyConfiguration(notifyConfiguration)
    }

    /**
     * @param notifyConfiguration The notify configuration used to construct email notifications.
     */
    public fun notifyConfiguration(
        notifyConfiguration: CfnUserPoolRiskConfigurationAttachment.NotifyConfigurationTypeProperty
    ) {
        cdkBuilder.notifyConfiguration(notifyConfiguration)
    }

    public fun build():
        CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty =
        cdkBuilder.build()
}
