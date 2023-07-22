@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53recoverycontrol

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53recoverycontrol.CfnCluster

/**
 * A cluster endpoint.
 *
 * You specify one of the five cluster endpoints, which consists of an endpoint URL and an AWS
 * Region, when you want to get or update a routing control state in the cluster.
 *
 * For more information, see [Code
 * examples](https://docs.aws.amazon.com/r53recovery/latest/dg/service_code_examples.html) in the
 * Amazon Route 53 Application Recovery Controller Developer Guide.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53recoverycontrol.*;
 * ClusterEndpointProperty clusterEndpointProperty = ClusterEndpointProperty.builder()
 * .endpoint("endpoint")
 * .region("region")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoverycontrol-cluster-clusterendpoint.html)
 */
@CdkDslMarker
public class CfnClusterClusterEndpointPropertyDsl {
  private val cdkBuilder: CfnCluster.ClusterEndpointProperty.Builder =
      CfnCluster.ClusterEndpointProperty.builder()

  /**
   * @param endpoint A cluster endpoint URL for one of the five redundant clusters that you specify
   * to set or retrieve a routing control state.
   */
  public fun endpoint(endpoint: String) {
    cdkBuilder.endpoint(endpoint)
  }

  /**
   * @param region The AWS Region for a cluster endpoint.
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun build(): CfnCluster.ClusterEndpointProperty = cdkBuilder.build()
}
