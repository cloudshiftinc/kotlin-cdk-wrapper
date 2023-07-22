@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnClusterPolicyProps

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
