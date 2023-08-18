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

package io.cloudshiftdev.awscdkdsl.services.pinpoint

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnPushTemplate
import software.amazon.awscdk.services.pinpoint.CfnPushTemplateProps

/**
 * Properties for defining a `CfnPushTemplate`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * Object tags;
 * CfnPushTemplateProps cfnPushTemplateProps = CfnPushTemplateProps.builder()
 * .templateName("templateName")
 * // the properties below are optional
 * .adm(AndroidPushNotificationTemplateProperty.builder()
 * .action("action")
 * .body("body")
 * .imageIconUrl("imageIconUrl")
 * .imageUrl("imageUrl")
 * .smallImageIconUrl("smallImageIconUrl")
 * .sound("sound")
 * .title("title")
 * .url("url")
 * .build())
 * .apns(APNSPushNotificationTemplateProperty.builder()
 * .action("action")
 * .body("body")
 * .mediaUrl("mediaUrl")
 * .sound("sound")
 * .title("title")
 * .url("url")
 * .build())
 * .baidu(AndroidPushNotificationTemplateProperty.builder()
 * .action("action")
 * .body("body")
 * .imageIconUrl("imageIconUrl")
 * .imageUrl("imageUrl")
 * .smallImageIconUrl("smallImageIconUrl")
 * .sound("sound")
 * .title("title")
 * .url("url")
 * .build())
 * .default(DefaultPushNotificationTemplateProperty.builder()
 * .action("action")
 * .body("body")
 * .sound("sound")
 * .title("title")
 * .url("url")
 * .build())
 * .defaultSubstitutions("defaultSubstitutions")
 * .gcm(AndroidPushNotificationTemplateProperty.builder()
 * .action("action")
 * .body("body")
 * .imageIconUrl("imageIconUrl")
 * .imageUrl("imageUrl")
 * .smallImageIconUrl("smallImageIconUrl")
 * .sound("sound")
 * .title("title")
 * .url("url")
 * .build())
 * .tags(tags)
 * .templateDescription("templateDescription")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html)
 */
@CdkDslMarker
public class CfnPushTemplatePropsDsl {
    private val cdkBuilder: CfnPushTemplateProps.Builder = CfnPushTemplateProps.builder()

    /**
     * @param adm The message template to use for the ADM (Amazon Device Messaging) channel. This
     *   message template overrides the default template for push notification channels ( `Default`
     *   ).
     */
    public fun adm(adm: IResolvable) {
        cdkBuilder.adm(adm)
    }

    /**
     * @param adm The message template to use for the ADM (Amazon Device Messaging) channel. This
     *   message template overrides the default template for push notification channels ( `Default`
     *   ).
     */
    public fun adm(adm: CfnPushTemplate.AndroidPushNotificationTemplateProperty) {
        cdkBuilder.adm(adm)
    }

    /**
     * @param apns The message template to use for the APNs (Apple Push Notification service)
     *   channel. This message template overrides the default template for push notification
     *   channels ( `Default` ).
     */
    public fun apns(apns: IResolvable) {
        cdkBuilder.apns(apns)
    }

    /**
     * @param apns The message template to use for the APNs (Apple Push Notification service)
     *   channel. This message template overrides the default template for push notification
     *   channels ( `Default` ).
     */
    public fun apns(apns: CfnPushTemplate.APNSPushNotificationTemplateProperty) {
        cdkBuilder.apns(apns)
    }

    /**
     * @param baidu The message template to use for the Baidu (Baidu Cloud Push) channel. This
     *   message template overrides the default template for push notification channels ( `Default`
     *   ).
     */
    public fun baidu(baidu: IResolvable) {
        cdkBuilder.baidu(baidu)
    }

    /**
     * @param baidu The message template to use for the Baidu (Baidu Cloud Push) channel. This
     *   message template overrides the default template for push notification channels ( `Default`
     *   ).
     */
    public fun baidu(baidu: CfnPushTemplate.AndroidPushNotificationTemplateProperty) {
        cdkBuilder.baidu(baidu)
    }

    /**
     * @param defaultSubstitutions A JSON object that specifies the default values to use for
     *   message variables in the message template. This object is a set of key-value pairs. Each
     *   key defines a message variable in the template. The corresponding value defines the default
     *   value for that variable. When you create a message that's based on the template, you can
     *   override these defaults with message-specific and address-specific variables and values.
     */
    public fun defaultSubstitutions(defaultSubstitutions: String) {
        cdkBuilder.defaultSubstitutions(defaultSubstitutions)
    }

    /** @param defaultValue The default message template to use for push notification channels. */
    public fun defaultValue(defaultValue: IResolvable) {
        cdkBuilder.defaultValue(defaultValue)
    }

    /** @param defaultValue The default message template to use for push notification channels. */
    public fun defaultValue(defaultValue: CfnPushTemplate.DefaultPushNotificationTemplateProperty) {
        cdkBuilder.defaultValue(defaultValue)
    }

    /**
     * @param gcm The message template to use for the GCM channel, which is used to send
     *   notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging
     *   (GCM), service. This message template overrides the default template for push notification
     *   channels ( `Default` ).
     */
    public fun gcm(gcm: IResolvable) {
        cdkBuilder.gcm(gcm)
    }

    /**
     * @param gcm The message template to use for the GCM channel, which is used to send
     *   notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging
     *   (GCM), service. This message template overrides the default template for push notification
     *   channels ( `Default` ).
     */
    public fun gcm(gcm: CfnPushTemplate.AndroidPushNotificationTemplateProperty) {
        cdkBuilder.gcm(gcm)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tags)
        cdkBuilder.tags(builder.map)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    /** @param templateDescription A custom description of the message template. */
    public fun templateDescription(templateDescription: String) {
        cdkBuilder.templateDescription(templateDescription)
    }

    /** @param templateName The name of the message template. */
    public fun templateName(templateName: String) {
        cdkBuilder.templateName(templateName)
    }

    public fun build(): CfnPushTemplateProps = cdkBuilder.build()
}
