@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.fms.CfnNotificationChannel
import software.constructs.Construct

@CdkDslMarker
public class CfnNotificationChannelDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnNotificationChannel.Builder =
      CfnNotificationChannel.Builder.create(scope, id)

  public fun snsRoleName(snsRoleName: String) {
    cdkBuilder.snsRoleName(snsRoleName)
  }

  public fun snsTopicArn(snsTopicArn: String) {
    cdkBuilder.snsTopicArn(snsTopicArn)
  }

  public fun build(): CfnNotificationChannel = cdkBuilder.build()
}
