@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.vpclattice.CfnTargetGroup

@CdkDslMarker
public class CfnTargetGroupTargetPropertyDsl {
  private val cdkBuilder: CfnTargetGroup.TargetProperty.Builder =
      CfnTargetGroup.TargetProperty.builder()

  /**
   * @param id The ID of the target. 
   * If the target type of the target group is `INSTANCE` , this is an instance ID. If the target
   * type is `IP` , this is an IP address. If the target type is `LAMBDA` , this is the ARN of the
   * Lambda function. If the target type is `ALB` , this is the ARN of the Application Load Balancer.
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param port The port on which the target is listening.
   * For HTTP, the default is `80` . For HTTPS, the default is `443` .
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun build(): CfnTargetGroup.TargetProperty = cdkBuilder.build()
}
