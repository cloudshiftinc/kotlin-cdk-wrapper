@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.redshift.CfnScheduledAction

@CdkDslMarker
public class CfnScheduledActionPauseClusterMessagePropertyDsl {
  private val cdkBuilder: CfnScheduledAction.PauseClusterMessageProperty.Builder =
      CfnScheduledAction.PauseClusterMessageProperty.builder()

  /**
   * @param clusterIdentifier The identifier of the cluster to be paused. 
   */
  public fun clusterIdentifier(clusterIdentifier: String) {
    cdkBuilder.clusterIdentifier(clusterIdentifier)
  }

  public fun build(): CfnScheduledAction.PauseClusterMessageProperty = cdkBuilder.build()
}
