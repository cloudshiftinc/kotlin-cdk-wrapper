@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.redshift.CfnScheduledAction

@CdkDslMarker
public class CfnScheduledActionScheduledActionTypePropertyDsl {
  private val cdkBuilder: CfnScheduledAction.ScheduledActionTypeProperty.Builder =
      CfnScheduledAction.ScheduledActionTypeProperty.builder()

  /**
   * @param pauseCluster An action that runs a `PauseCluster` API operation.
   */
  public fun pauseCluster(pauseCluster: IResolvable) {
    cdkBuilder.pauseCluster(pauseCluster)
  }

  /**
   * @param pauseCluster An action that runs a `PauseCluster` API operation.
   */
  public fun pauseCluster(pauseCluster: CfnScheduledAction.PauseClusterMessageProperty) {
    cdkBuilder.pauseCluster(pauseCluster)
  }

  /**
   * @param resizeCluster An action that runs a `ResizeCluster` API operation.
   */
  public fun resizeCluster(resizeCluster: IResolvable) {
    cdkBuilder.resizeCluster(resizeCluster)
  }

  /**
   * @param resizeCluster An action that runs a `ResizeCluster` API operation.
   */
  public fun resizeCluster(resizeCluster: CfnScheduledAction.ResizeClusterMessageProperty) {
    cdkBuilder.resizeCluster(resizeCluster)
  }

  /**
   * @param resumeCluster An action that runs a `ResumeCluster` API operation.
   */
  public fun resumeCluster(resumeCluster: IResolvable) {
    cdkBuilder.resumeCluster(resumeCluster)
  }

  /**
   * @param resumeCluster An action that runs a `ResumeCluster` API operation.
   */
  public fun resumeCluster(resumeCluster: CfnScheduledAction.ResumeClusterMessageProperty) {
    cdkBuilder.resumeCluster(resumeCluster)
  }

  public fun build(): CfnScheduledAction.ScheduledActionTypeProperty = cdkBuilder.build()
}
