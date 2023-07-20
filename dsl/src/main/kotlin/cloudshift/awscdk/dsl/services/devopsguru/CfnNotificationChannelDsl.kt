@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.devopsguru

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.devopsguru.CfnNotificationChannel
import software.constructs.Construct

@CdkDslMarker
public class CfnNotificationChannelDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnNotificationChannel.Builder =
      CfnNotificationChannel.Builder.create(scope, id)

  public fun config(config: IResolvable) {
    cdkBuilder.config(config)
  }

  public fun config(config: CfnNotificationChannel.NotificationChannelConfigProperty) {
    cdkBuilder.config(config)
  }

  public fun build(): CfnNotificationChannel = cdkBuilder.build()
}
