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
import kotlin.String
import software.amazon.awscdk.services.pinpoint.CfnPushTemplate

/**
 * Specifies channel-specific content and settings for a message template that can be used in push
 * notifications that are sent through the ADM (Amazon Device Messaging), Baidu (Baidu Cloud Push),
 * or GCM (Firebase Cloud Messaging, formerly Google Cloud Messaging) channel.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * AndroidPushNotificationTemplateProperty androidPushNotificationTemplateProperty =
 * AndroidPushNotificationTemplateProperty.builder()
 * .action("action")
 * .body("body")
 * .imageIconUrl("imageIconUrl")
 * .imageUrl("imageUrl")
 * .smallImageIconUrl("smallImageIconUrl")
 * .sound("sound")
 * .title("title")
 * .url("url")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html)
 */
@CdkDslMarker
public class CfnPushTemplateAndroidPushNotificationTemplatePropertyDsl {
    private val cdkBuilder: CfnPushTemplate.AndroidPushNotificationTemplateProperty.Builder =
        CfnPushTemplate.AndroidPushNotificationTemplateProperty.builder()

    /**
     * @param action The action to occur if a recipient taps a push notification that's based on the
     *   message template. Valid values are:
     * * `OPEN_APP` – Your app opens or it becomes the foreground app if it was sent to the
     *   background. This is the default action.
     * * `DEEP_LINK` – Your app opens and displays a designated user interface in the app. This
     *   action uses the deep-linking features of the Android platform.
     * * `URL` – The default mobile browser on the recipient's device opens and loads the web page
     *   at a URL that you specify.
     */
    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    /**
     * @param body The message body to use in a push notification that's based on the message
     *   template.
     */
    public fun body(body: String) {
        cdkBuilder.body(body)
    }

    /**
     * @param imageIconUrl The URL of the large icon image to display in the content view of a push
     *   notification that's based on the message template.
     */
    public fun imageIconUrl(imageIconUrl: String) {
        cdkBuilder.imageIconUrl(imageIconUrl)
    }

    /**
     * @param imageUrl The URL of an image to display in a push notification that's based on the
     *   message template.
     */
    public fun imageUrl(imageUrl: String) {
        cdkBuilder.imageUrl(imageUrl)
    }

    /**
     * @param smallImageIconUrl The URL of the small icon image to display in the status bar and the
     *   content view of a push notification that's based on the message template.
     */
    public fun smallImageIconUrl(smallImageIconUrl: String) {
        cdkBuilder.smallImageIconUrl(smallImageIconUrl)
    }

    /**
     * @param sound The sound to play when a recipient receives a push notification that's based on
     *   the message template. You can use the default stream or specify the file name of a sound
     *   resource that's bundled in your app. On an Android platform, the sound file must reside in
     *   `/res/raw/` .
     */
    public fun sound(sound: String) {
        cdkBuilder.sound(sound)
    }

    /**
     * @param title The title to use in a push notification that's based on the message template.
     *   This title appears above the notification message on a recipient's device.
     */
    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    /**
     * @param url The URL to open in a recipient's default mobile browser, if a recipient taps a
     *   push notification that's based on the message template and the value of the `Action`
     *   property is `URL` .
     */
    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    public fun build(): CfnPushTemplate.AndroidPushNotificationTemplateProperty = cdkBuilder.build()
}
