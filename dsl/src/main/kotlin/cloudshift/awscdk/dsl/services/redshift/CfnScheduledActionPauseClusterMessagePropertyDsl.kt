@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.redshift.CfnScheduledAction

/**
 * Describes a pause cluster operation.
 *
 * For example, a scheduled action to run the `PauseCluster` API operation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshift.*;
 * PauseClusterMessageProperty pauseClusterMessageProperty = PauseClusterMessageProperty.builder()
 * .clusterIdentifier("clusterIdentifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-scheduledaction-pauseclustermessage.html)
 */
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
