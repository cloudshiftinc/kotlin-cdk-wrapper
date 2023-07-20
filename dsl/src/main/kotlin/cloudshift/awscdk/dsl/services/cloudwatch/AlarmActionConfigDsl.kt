@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudwatch.AlarmActionConfig

@CdkDslMarker
public class AlarmActionConfigDsl {
  private val cdkBuilder: AlarmActionConfig.Builder = AlarmActionConfig.builder()

  public fun alarmActionArn(alarmActionArn: String) {
    cdkBuilder.alarmActionArn(alarmActionArn)
  }

  public fun build(): AlarmActionConfig = cdkBuilder.build()
}
