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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnRule

/**
 * Information about the send notification action.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * SendNotificationActionProperty sendNotificationActionProperty =
 * SendNotificationActionProperty.builder()
 * .content("content")
 * .contentType("contentType")
 * .deliveryMethod("deliveryMethod")
 * .recipient(NotificationRecipientTypeProperty.builder()
 * .userArns(List.of("userArns"))
 * .userTags(Map.of(
 * "userTagsKey", "userTags"))
 * .build())
 * // the properties below are optional
 * .subject("subject")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-sendnotificationaction.html)
 */
@CdkDslMarker
public class CfnRuleSendNotificationActionPropertyDsl {
    private val cdkBuilder: CfnRule.SendNotificationActionProperty.Builder =
        CfnRule.SendNotificationActionProperty.builder()

    /**
     * @param content Notification content. Supports variable injection. For more information, see
     *   [JSONPath reference](https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html)
     *   in the *Amazon Connect Administrators Guide* .
     */
    public fun content(content: String) {
        cdkBuilder.content(content)
    }

    /** @param contentType Content type format. *Allowed value* : `PLAIN_TEXT` */
    public fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
    }

    /** @param deliveryMethod Notification delivery method. *Allowed value* : `EMAIL` */
    public fun deliveryMethod(deliveryMethod: String) {
        cdkBuilder.deliveryMethod(deliveryMethod)
    }

    /** @param recipient Notification recipient. */
    public fun recipient(recipient: IResolvable) {
        cdkBuilder.recipient(recipient)
    }

    /** @param recipient Notification recipient. */
    public fun recipient(recipient: CfnRule.NotificationRecipientTypeProperty) {
        cdkBuilder.recipient(recipient)
    }

    /**
     * @param subject The subject of the email if the delivery method is `EMAIL` . Supports variable
     *   injection. For more information, see
     *   [JSONPath reference](https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html)
     *   in the *Amazon Connect Administrators Guide* .
     */
    public fun subject(subject: String) {
        cdkBuilder.subject(subject)
    }

    public fun build(): CfnRule.SendNotificationActionProperty = cdkBuilder.build()
}
