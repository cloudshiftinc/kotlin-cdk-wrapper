@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.elasticloadbalancingv2.BaseTargetGroupProps
import software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck
import software.amazon.awscdk.services.elasticloadbalancingv2.TargetType

/**
 * Basic properties of both Application and Network Target Groups.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * Vpc vpc;
 * BaseTargetGroupProps baseTargetGroupProps = BaseTargetGroupProps.builder()
 * .deregistrationDelay(Duration.minutes(30))
 * .healthCheck(HealthCheck.builder()
 * .enabled(false)
 * .healthyGrpcCodes("healthyGrpcCodes")
 * .healthyHttpCodes("healthyHttpCodes")
 * .healthyThresholdCount(123)
 * .interval(Duration.minutes(30))
 * .path("path")
 * .port("port")
 * .protocol(Protocol.HTTP)
 * .timeout(Duration.minutes(30))
 * .unhealthyThresholdCount(123)
 * .build())
 * .targetGroupName("targetGroupName")
 * .targetType(TargetType.INSTANCE)
 * .vpc(vpc)
 * .build();
 * ```
 */
@CdkDslMarker
public class BaseTargetGroupPropsDsl {
  private val cdkBuilder: BaseTargetGroupProps.Builder = BaseTargetGroupProps.builder()

  /**
   * @param deregistrationDelay The amount of time for Elastic Load Balancing to wait before
   * deregistering a target.
   * The range is 0-3600 seconds.
   */
  public fun deregistrationDelay(deregistrationDelay: Duration) {
    cdkBuilder.deregistrationDelay(deregistrationDelay)
  }

  /**
   * @param healthCheck Health check configuration.
   */
  public fun healthCheck(healthCheck: HealthCheckDsl.() -> Unit = {}) {
    val builder = HealthCheckDsl()
    builder.apply(healthCheck)
    cdkBuilder.healthCheck(builder.build())
  }

  /**
   * @param healthCheck Health check configuration.
   */
  public fun healthCheck(healthCheck: HealthCheck) {
    cdkBuilder.healthCheck(healthCheck)
  }

  /**
   * @param targetGroupName The name of the target group.
   * This name must be unique per region per account, can have a maximum of
   * 32 characters, must contain only alphanumeric characters or hyphens, and
   * must not begin or end with a hyphen.
   */
  public fun targetGroupName(targetGroupName: String) {
    cdkBuilder.targetGroupName(targetGroupName)
  }

  /**
   * @param targetType The type of targets registered to this TargetGroup, either IP or Instance.
   * All targets registered into the group must be of this type. If you
   * register targets to the TargetGroup in the CDK app, the TargetType is
   * determined automatically.
   */
  public fun targetType(targetType: TargetType) {
    cdkBuilder.targetType(targetType)
  }

  /**
   * @param vpc The virtual private cloud (VPC).
   * only if `TargetType` is `Ip` or `InstanceId`
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): BaseTargetGroupProps = cdkBuilder.build()
}
