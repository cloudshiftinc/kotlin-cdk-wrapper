@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@CdkDslMarker
public class CfnDeploymentGroupAlarmPropertyDsl {
  private val cdkBuilder: CfnDeploymentGroup.AlarmProperty.Builder =
      CfnDeploymentGroup.AlarmProperty.builder()

  /**
   * @param name The name of the alarm.
   * Maximum length is 255 characters. Each alarm name can be used only once in a list of alarms.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnDeploymentGroup.AlarmProperty = cdkBuilder.build()
}
