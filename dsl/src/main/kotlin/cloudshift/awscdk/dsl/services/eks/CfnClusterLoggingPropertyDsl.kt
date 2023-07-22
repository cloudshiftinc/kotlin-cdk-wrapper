@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eks.CfnCluster

/**
 * Enable or disable exporting the Kubernetes control plane logs for your cluster to CloudWatch
 * Logs.
 *
 * By default, cluster control plane logs aren't exported to CloudWatch Logs. For more information,
 * see [Amazon EKS Cluster control plane
 * logs](https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html) in the **Amazon EKS
 * User Guide** .
 *
 *
 * When updating a resource, you must include this `Logging` property if the previous CloudFormation
 * template of the resource had it. &gt; CloudWatch Logs ingestion, archive storage, and data scanning
 * rates apply to exported control plane logs. For more information, see [CloudWatch
 * Pricing](https://docs.aws.amazon.com/cloudwatch/pricing/) .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * LoggingProperty loggingProperty = LoggingProperty.builder()
 * .clusterLogging(ClusterLoggingProperty.builder()
 * .enabledTypes(List.of(LoggingTypeConfigProperty.builder()
 * .type("type")
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-logging.html)
 */
@CdkDslMarker
public class CfnClusterLoggingPropertyDsl {
  private val cdkBuilder: CfnCluster.LoggingProperty.Builder = CfnCluster.LoggingProperty.builder()

  /**
   * @param clusterLogging The cluster control plane logging configuration for your cluster.
   */
  public fun clusterLogging(clusterLogging: IResolvable) {
    cdkBuilder.clusterLogging(clusterLogging)
  }

  /**
   * @param clusterLogging The cluster control plane logging configuration for your cluster.
   */
  public fun clusterLogging(clusterLogging: CfnCluster.ClusterLoggingProperty) {
    cdkBuilder.clusterLogging(clusterLogging)
  }

  public fun build(): CfnCluster.LoggingProperty = cdkBuilder.build()
}
