@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps

@CdkDslMarker
public class CfnElasticLoadBalancerAttachmentPropsDsl {
  private val cdkBuilder: CfnElasticLoadBalancerAttachmentProps.Builder =
      CfnElasticLoadBalancerAttachmentProps.builder()

  /**
   * @param elasticLoadBalancerName The Elastic Load Balancing instance name. 
   */
  public fun elasticLoadBalancerName(elasticLoadBalancerName: String) {
    cdkBuilder.elasticLoadBalancerName(elasticLoadBalancerName)
  }

  /**
   * @param layerId The AWS OpsWorks layer ID to which the Elastic Load Balancing load balancer is
   * attached. 
   */
  public fun layerId(layerId: String) {
    cdkBuilder.layerId(layerId)
  }

  public fun build(): CfnElasticLoadBalancerAttachmentProps = cdkBuilder.build()
}
