@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnClusterPolicyProps

/**
 * Properties for defining a `CfnClusterPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * Object policy;
 * CfnClusterPolicyProps cfnClusterPolicyProps = CfnClusterPolicyProps.builder()
 * .clusterArn("clusterArn")
 * .policy(policy)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-clusterpolicy.html)
 */
@CdkDslMarker
public class CfnClusterPolicyPropsDsl {
  private val cdkBuilder: CfnClusterPolicyProps.Builder = CfnClusterPolicyProps.builder()

  /**
   * @param clusterArn The Amazon Resource Name (ARN) that uniquely identifies the cluster. 
   */
  public fun clusterArn(clusterArn: String) {
    cdkBuilder.clusterArn(clusterArn)
  }

  /**
   * @param policy Resource policy for the cluster. 
   */
  public fun policy(policy: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(policy)
    cdkBuilder.policy(builder.map)
  }

  /**
   * @param policy Resource policy for the cluster. 
   */
  public fun policy(policy: Any) {
    cdkBuilder.policy(policy)
  }

  public fun build(): CfnClusterPolicyProps = cdkBuilder.build()
}
