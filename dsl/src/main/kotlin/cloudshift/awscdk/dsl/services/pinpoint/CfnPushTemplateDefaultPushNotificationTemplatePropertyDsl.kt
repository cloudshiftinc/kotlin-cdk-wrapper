@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpoint.CfnPushTemplate

/**
 * Specifies the default settings and content for a message template that can be used in messages
 * that are sent through a push notification channel.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * DefaultPushNotificationTemplateProperty defaultPushNotificationTemplateProperty =
 * DefaultPushNotificationTemplateProperty.builder()
 * .action("action")
 * .body("body")
 * .sound("sound")
 * .title("title")
 * .url("url")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-defaultpushnotificationtemplate.html)
 */
@CdkDslMarker
public class CfnPushTemplateDefaultPushNotificationTemplatePropertyDsl {
  private val cdkBuilder: CfnPushTemplate.DefaultPushNotificationTemplateProperty.Builder =
      CfnPushTemplate.DefaultPushNotificationTemplateProperty.builder()

  /**
   * @param action The action to occur if a recipient taps a push notification that's based on the
   * message template.
   * Valid values are:
   *
   * * `OPEN_APP` – Your app opens or it becomes the foreground app if it was sent to the
   * background. This is the default action.
   * * `DEEP_LINK` – Your app opens and displays a designated user interface in the app. This
   * setting uses the deep-linking features of the iOS and Android platforms.
   * * `URL` – The default mobile browser on the recipient's device opens and loads the web page at
   * a URL that you specify.
   */
  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  /**
   * @param body The message body to use in push notifications that are based on the message
   * template.
   */
  public fun body(body: String) {
    cdkBuilder.body(body)
  }

  /**
   * @param sound The sound to play when a recipient receives a push notification that's based on
   * the message template.
   * You can use the default stream or specify the file name of a sound resource that's bundled in
   * your app. On an Android platform, the sound file must reside in `/res/raw/` .
   *
   * For an iOS platform, this value is the key for the name of a sound file in your app's main
   * bundle or the `Library/Sounds` folder in your app's data container. If the sound file can't be
   * found or you specify `default` for the value, the system plays the default alert sound.
   */
  public fun sound(sound: String) {
    cdkBuilder.sound(sound)
  }

  /**
   * @param title The title to use in push notifications that are based on the message template.
   * This title appears above the notification message on a recipient's device.
   */
  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  /**
   * @param url The URL to open in a recipient's default mobile browser, if a recipient taps a push
   * notification that's based on the message template and the value of the `Action` property is `URL`
   * .
   */
  public fun url(url: String) {
    cdkBuilder.url(url)
  }

  public fun build(): CfnPushTemplate.DefaultPushNotificationTemplateProperty = cdkBuilder.build()
}
