@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.redshift.CfnScheduledAction

/**
 * Describes a resume cluster operation.
 *
 * For example, a scheduled action to run the `ResumeCluster` API operation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshift.*;
 * ResumeClusterMessageProperty resumeClusterMessageProperty =
 * ResumeClusterMessageProperty.builder()
 * .clusterIdentifier("clusterIdentifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-scheduledaction-resumeclustermessage.html)
 */
@CdkDslMarker
public class CfnScheduledActionResumeClusterMessagePropertyDsl {
  private val cdkBuilder: CfnScheduledAction.ResumeClusterMessageProperty.Builder =
      CfnScheduledAction.ResumeClusterMessageProperty.builder()

  /**
   * @param clusterIdentifier The identifier of the cluster to be resumed. 
   */
  public fun clusterIdentifier(clusterIdentifier: String) {
    cdkBuilder.clusterIdentifier(clusterIdentifier)
  }

  public fun build(): CfnScheduledAction.ResumeClusterMessageProperty = cdkBuilder.build()
}
