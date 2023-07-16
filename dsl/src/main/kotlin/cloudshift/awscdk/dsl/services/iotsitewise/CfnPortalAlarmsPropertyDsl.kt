@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnPortal

@CdkDslMarker
public class CfnPortalAlarmsPropertyDsl {
  private val cdkBuilder: CfnPortal.AlarmsProperty.Builder = CfnPortal.AlarmsProperty.builder()

  public fun alarmRoleArn(alarmRoleArn: String) {
    cdkBuilder.alarmRoleArn(alarmRoleArn)
  }

  public fun notificationLambdaArn(notificationLambdaArn: String) {
    cdkBuilder.notificationLambdaArn(notificationLambdaArn)
  }

  public fun build(): CfnPortal.AlarmsProperty = cdkBuilder.build()
}
