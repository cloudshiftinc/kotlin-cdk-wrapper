@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.Stage
import software.amazon.awscdk.pipelines.ConfirmPermissionsBroadening
import software.amazon.awscdk.services.sns.ITopic

@CdkDslMarker
public class ConfirmPermissionsBroadeningDsl(
  arg0: String,
) {
  private val cdkBuilder: ConfirmPermissionsBroadening.Builder =
      ConfirmPermissionsBroadening.Builder.create(arg0)

  public fun notificationTopic(notificationTopic: ITopic) {
    cdkBuilder.notificationTopic(notificationTopic)
  }

  public fun stage(stage: Stage) {
    cdkBuilder.stage(stage)
  }

  public fun build(): ConfirmPermissionsBroadening = cdkBuilder.build()
}
