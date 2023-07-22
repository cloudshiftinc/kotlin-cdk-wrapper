@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.redshift.CfnScheduledAction

@CdkDslMarker
public class CfnScheduledActionResizeClusterMessagePropertyDsl {
  private val cdkBuilder: CfnScheduledAction.ResizeClusterMessageProperty.Builder =
      CfnScheduledAction.ResizeClusterMessageProperty.builder()

  /**
   * @param classic A boolean value indicating whether the resize operation is using the classic
   * resize process.
   * If you don't provide this parameter or set the value to `false` , the resize type is elastic.
   */
  public fun classic(classic: Boolean) {
    cdkBuilder.classic(classic)
  }

  /**
   * @param classic A boolean value indicating whether the resize operation is using the classic
   * resize process.
   * If you don't provide this parameter or set the value to `false` , the resize type is elastic.
   */
  public fun classic(classic: IResolvable) {
    cdkBuilder.classic(classic)
  }

  /**
   * @param clusterIdentifier The unique identifier for the cluster to resize. 
   */
  public fun clusterIdentifier(clusterIdentifier: String) {
    cdkBuilder.clusterIdentifier(clusterIdentifier)
  }

  /**
   * @param clusterType The new cluster type for the specified cluster.
   */
  public fun clusterType(clusterType: String) {
    cdkBuilder.clusterType(clusterType)
  }

  /**
   * @param nodeType The new node type for the nodes you are adding.
   * If not specified, the cluster's current node type is used.
   */
  public fun nodeType(nodeType: String) {
    cdkBuilder.nodeType(nodeType)
  }

  /**
   * @param numberOfNodes The new number of nodes for the cluster.
   * If not specified, the cluster's current number of nodes is used.
   */
  public fun numberOfNodes(numberOfNodes: Number) {
    cdkBuilder.numberOfNodes(numberOfNodes)
  }

  public fun build(): CfnScheduledAction.ResizeClusterMessageProperty = cdkBuilder.build()
}
