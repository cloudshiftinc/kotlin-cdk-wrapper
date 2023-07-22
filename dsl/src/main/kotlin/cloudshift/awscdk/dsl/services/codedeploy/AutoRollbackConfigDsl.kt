@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.codedeploy.AutoRollbackConfig

@CdkDslMarker
public class AutoRollbackConfigDsl {
  private val cdkBuilder: AutoRollbackConfig.Builder = AutoRollbackConfig.builder()

  /**
   * @param deploymentInAlarm Whether to automatically roll back a deployment during which one of
   * the configured CloudWatch alarms for this Deployment Group went off.
   */
  public fun deploymentInAlarm(deploymentInAlarm: Boolean) {
    cdkBuilder.deploymentInAlarm(deploymentInAlarm)
  }

  /**
   * @param failedDeployment Whether to automatically roll back a deployment that fails.
   */
  public fun failedDeployment(failedDeployment: Boolean) {
    cdkBuilder.failedDeployment(failedDeployment)
  }

  /**
   * @param stoppedDeployment Whether to automatically roll back a deployment that was manually
   * stopped.
   */
  public fun stoppedDeployment(stoppedDeployment: Boolean) {
    cdkBuilder.stoppedDeployment(stoppedDeployment)
  }

  public fun build(): AutoRollbackConfig = cdkBuilder.build()
}
