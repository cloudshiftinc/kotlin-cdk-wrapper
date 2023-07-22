@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup

/**
 * Specifies a target to add to a target group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * TargetDescriptionProperty targetDescriptionProperty = TargetDescriptionProperty.builder()
 * .id("id")
 * // the properties below are optional
 * .availabilityZone("availabilityZone")
 * .port(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetdescription.html)
 */
@CdkDslMarker
public class CfnTargetGroupTargetDescriptionPropertyDsl {
  private val cdkBuilder: CfnTargetGroup.TargetDescriptionProperty.Builder =
      CfnTargetGroup.TargetDescriptionProperty.builder()

  /**
   * @param availabilityZone An Availability Zone or `all` .
   * This determines whether the target receives traffic from the load balancer nodes in the
   * specified Availability Zone or from all enabled Availability Zones for the load balancer.
   *
   * For Application Load Balancer target groups, the specified Availability Zone value is only
   * applicable when cross-zone load balancing is off. Otherwise the parameter is ignored and treated
   * as `all` .
   *
   * This parameter is not supported if the target type of the target group is `instance` or `alb` .
   *
   * If the target type is `ip` and the IP address is in a subnet of the VPC for the target group,
   * the Availability Zone is automatically detected and this parameter is optional. If the IP address
   * is outside the VPC, this parameter is required.
   *
   * For Application Load Balancer target groups with cross-zone load balancing off, if the target
   * type is `ip` and the IP address is outside of the VPC for the target group, this should be an
   * Availability Zone inside the VPC for the target group.
   *
   * If the target type is `lambda` , this parameter is optional and the only supported value is
   * `all` .
   */
  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  /**
   * @param id The ID of the target. 
   * If the target type of the target group is `instance` , specify an instance ID. If the target
   * type is `ip` , specify an IP address. If the target type is `lambda` , specify the ARN of the
   * Lambda function. If the target type is `alb` , specify the ARN of the Application Load Balancer
   * target.
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param port The port on which the target is listening.
   * If the target group protocol is GENEVE, the supported port is 6081. If the target type is `alb`
   * , the targeted Application Load Balancer must have at least one listener whose port matches the
   * target group port. This parameter is not used if the target is a Lambda function.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun build(): CfnTargetGroup.TargetDescriptionProperty = cdkBuilder.build()
}
