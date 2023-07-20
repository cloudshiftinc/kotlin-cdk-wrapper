@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.redshift.CfnScheduledAction

@CdkDslMarker
public class CfnScheduledActionScheduledActionTypePropertyDsl {
  private val cdkBuilder: CfnScheduledAction.ScheduledActionTypeProperty.Builder =
      CfnScheduledAction.ScheduledActionTypeProperty.builder()

  public fun pauseCluster(pauseCluster: IResolvable) {
    cdkBuilder.pauseCluster(pauseCluster)
  }

  public fun pauseCluster(pauseCluster: CfnScheduledAction.PauseClusterMessageProperty) {
    cdkBuilder.pauseCluster(pauseCluster)
  }

  public fun resizeCluster(resizeCluster: IResolvable) {
    cdkBuilder.resizeCluster(resizeCluster)
  }

  public fun resizeCluster(resizeCluster: CfnScheduledAction.ResizeClusterMessageProperty) {
    cdkBuilder.resizeCluster(resizeCluster)
  }

  public fun resumeCluster(resumeCluster: IResolvable) {
    cdkBuilder.resumeCluster(resumeCluster)
  }

  public fun resumeCluster(resumeCluster: CfnScheduledAction.ResumeClusterMessageProperty) {
    cdkBuilder.resumeCluster(resumeCluster)
  }

  public fun build(): CfnScheduledAction.ScheduledActionTypeProperty = cdkBuilder.build()
}
