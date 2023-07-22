@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.route53.PrivateHostedZone
import software.constructs.Construct

/**
 * Create a Route53 private hosted zone for use in one or more VPCs.
 *
 * Note that `enableDnsHostnames` and `enableDnsSupport` must have been enabled
 * for the VPC you're configuring for private hosted zones.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * PrivateHostedZone zone = PrivateHostedZone.Builder.create(this, "HostedZone")
 * .zoneName("fully.qualified.domain.com")
 * .vpc(vpc)
 * .build();
 * ```
 */
@CdkDslMarker
public class PrivateHostedZoneDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: PrivateHostedZone.Builder = PrivateHostedZone.Builder.create(scope, id)

  /**
   * Whether to add a trailing dot to the zone name.
   *
   * Default: true
   *
   * @param addTrailingDot Whether to add a trailing dot to the zone name. 
   */
  public fun addTrailingDot(addTrailingDot: Boolean) {
    cdkBuilder.addTrailingDot(addTrailingDot)
  }

  /**
   * Any comments that you want to include about the hosted zone.
   *
   * Default: none
   *
   * @param comment Any comments that you want to include about the hosted zone. 
   */
  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  /**
   * The Amazon Resource Name (ARN) for the log group that you want Amazon Route 53 to send query
   * logs to.
   *
   * Default: disabled
   *
   * @param queryLogsLogGroupArn The Amazon Resource Name (ARN) for the log group that you want
   * Amazon Route 53 to send query logs to. 
   */
  public fun queryLogsLogGroupArn(queryLogsLogGroupArn: String) {
    cdkBuilder.queryLogsLogGroupArn(queryLogsLogGroupArn)
  }

  /**
   * A VPC that you want to associate with this hosted zone.
   *
   * Private hosted zones must be associated with at least one VPC. You can
   * associated additional VPCs using `addVpc(vpc)`.
   *
   * @param vpc A VPC that you want to associate with this hosted zone. 
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  /**
   * The name of the domain.
   *
   * For resource record types that include a domain
   * name, specify a fully qualified domain name.
   *
   * @param zoneName The name of the domain. 
   */
  public fun zoneName(zoneName: String) {
    cdkBuilder.zoneName(zoneName)
  }

  public fun build(): PrivateHostedZone = cdkBuilder.build()
}
