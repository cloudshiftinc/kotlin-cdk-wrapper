@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpoint.CfnPushTemplate

@CdkDslMarker
public class CfnPushTemplateDefaultPushNotificationTemplatePropertyDsl {
  private val cdkBuilder: CfnPushTemplate.DefaultPushNotificationTemplateProperty.Builder =
      CfnPushTemplate.DefaultPushNotificationTemplateProperty.builder()

  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  public fun body(body: String) {
    cdkBuilder.body(body)
  }

  public fun sound(sound: String) {
    cdkBuilder.sound(sound)
  }

  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  public fun url(url: String) {
    cdkBuilder.url(url)
  }

  public fun build(): CfnPushTemplate.DefaultPushNotificationTemplateProperty = cdkBuilder.build()
}
