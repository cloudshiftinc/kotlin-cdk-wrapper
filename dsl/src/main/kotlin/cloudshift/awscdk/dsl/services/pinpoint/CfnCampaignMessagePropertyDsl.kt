@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnCampaign
import kotlin.Boolean
import kotlin.Number
import kotlin.String

/**
 * Specifies the content and settings for a push notification that's sent to recipients of a
 * campaign.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * MessageProperty messageProperty = MessageProperty.builder()
 * .action("action")
 * .body("body")
 * .imageIconUrl("imageIconUrl")
 * .imageSmallIconUrl("imageSmallIconUrl")
 * .imageUrl("imageUrl")
 * .jsonBody("jsonBody")
 * .mediaUrl("mediaUrl")
 * .rawContent("rawContent")
 * .silentPush(false)
 * .timeToLive(123)
 * .title("title")
 * .url("url")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html)
 */
@CdkDslMarker
public class CfnCampaignMessagePropertyDsl {
    private val cdkBuilder: CfnCampaign.MessageProperty.Builder =
        CfnCampaign.MessageProperty.builder()

    /**
     * @param action The action to occur if a recipient taps the push notification. Valid values are:.
     * * `OPEN_APP` – Your app opens or it becomes the foreground app if it was sent to the
     * background. This is the default action.
     * * `DEEP_LINK` – Your app opens and displays a designated user interface in the app. This
     * setting uses the deep-linking features of iOS and Android.
     * * `URL` – The default mobile browser on the recipient's device opens and loads the web page at
     * a URL that you specify.
     */
    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    /**
     * @param body The body of the notification message.
     * The maximum number of characters is 200.
     */
    public fun body(body: String) {
        cdkBuilder.body(body)
    }

    /**
     * @param imageIconUrl The URL of the image to display as the push notification icon, such as the
     * icon for the app.
     */
    public fun imageIconUrl(imageIconUrl: String) {
        cdkBuilder.imageIconUrl(imageIconUrl)
    }

    /**
     * @param imageSmallIconUrl The URL of the image to display as the small, push notification icon,
     * such as a small version of the icon for the app.
     */
    public fun imageSmallIconUrl(imageSmallIconUrl: String) {
        cdkBuilder.imageSmallIconUrl(imageSmallIconUrl)
    }

    /**
     * @param imageUrl The URL of an image to display in the push notification.
     */
    public fun imageUrl(imageUrl: String) {
        cdkBuilder.imageUrl(imageUrl)
    }

    /**
     * @param jsonBody The JSON payload to use for a silent push notification.
     */
    public fun jsonBody(jsonBody: String) {
        cdkBuilder.jsonBody(jsonBody)
    }

    /**
     * @param mediaUrl The URL of the image or video to display in the push notification.
     */
    public fun mediaUrl(mediaUrl: String) {
        cdkBuilder.mediaUrl(mediaUrl)
    }

    /**
     * @param rawContent The raw, JSON-formatted string to use as the payload for the notification
     * message.
     * If specified, this value overrides all other content for the message.
     */
    public fun rawContent(rawContent: String) {
        cdkBuilder.rawContent(rawContent)
    }

    /**
     * @param silentPush Specifies whether the notification is a silent push notification, which is a
     * push notification that doesn't display on a recipient's device.
     * Silent push notifications can be used for cases such as updating an app's configuration,
     * displaying messages in an in-app message center, or supporting phone home functionality.
     */
    public fun silentPush(silentPush: Boolean) {
        cdkBuilder.silentPush(silentPush)
    }

    /**
     * @param silentPush Specifies whether the notification is a silent push notification, which is a
     * push notification that doesn't display on a recipient's device.
     * Silent push notifications can be used for cases such as updating an app's configuration,
     * displaying messages in an in-app message center, or supporting phone home functionality.
     */
    public fun silentPush(silentPush: IResolvable) {
        cdkBuilder.silentPush(silentPush)
    }

    /**
     * @param timeToLive The number of seconds that the push notification service should keep the
     * message, if the service is unable to deliver the notification the first time.
     * This value is converted to an expiration value when it's sent to a push notification service.
     * If this value is `0` , the service treats the notification as if it expires immediately and the
     * service doesn't store or try to deliver the notification again.
     *
     * This value doesn't apply to messages that are sent through the Amazon Device Messaging (ADM)
     * service.
     */
    public fun timeToLive(timeToLive: Number) {
        cdkBuilder.timeToLive(timeToLive)
    }

    /**
     * @param title The title to display above the notification message on a recipient's device.
     */
    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    /**
     * @param url The URL to open in a recipient's default mobile browser, if a recipient taps the
     * push notification and the value of the `Action` property is `URL` .
     */
    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    public fun build(): CfnCampaign.MessageProperty = cdkBuilder.build()
}
