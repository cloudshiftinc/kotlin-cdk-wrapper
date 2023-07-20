@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnRule

@CdkDslMarker
public class CfnRuleSendNotificationActionPropertyDsl {
  private val cdkBuilder: CfnRule.SendNotificationActionProperty.Builder =
      CfnRule.SendNotificationActionProperty.builder()

  public fun content(content: String) {
    cdkBuilder.content(content)
  }

  public fun contentType(contentType: String) {
    cdkBuilder.contentType(contentType)
  }

  public fun deliveryMethod(deliveryMethod: String) {
    cdkBuilder.deliveryMethod(deliveryMethod)
  }

  public fun recipient(recipient: IResolvable) {
    cdkBuilder.recipient(recipient)
  }

  public fun recipient(recipient: CfnRule.NotificationRecipientTypeProperty) {
    cdkBuilder.recipient(recipient)
  }

  public fun subject(subject: String) {
    cdkBuilder.subject(subject)
  }

  public fun build(): CfnRule.SendNotificationActionProperty = cdkBuilder.build()
}
